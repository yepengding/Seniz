parser grammar SenizParser;

options { tokenVocab=SenizLexer; }

compilationUnit
    : importDeclaration* systemDeclaration? varSetDeclaration? EOF
    ;

importDeclaration
    : IMPORT qualifiedName
    ;

systemDeclaration
    : systemHeader systemBody
    ;

systemHeader
    : systemModifiers SYSTEM systemIdentifier LPAREN formalParameterList? RPAREN systemParameter?
    ;

systemModifiers
    : mainModifier? controlModifier?
    ;

mainModifier
    : MAIN
    ;

controlModifier
    : CONTROL
    ;

systemParameter
    : OVER varSetIdentifer
    ;

systemBody
    : LBRACE controlStatement controlSystemBodyDeclaration RBRACE
    | LBRACE systemBodyDeclaration* RBRACE
    ;

systemBodyDeclaration
    : stateNaming
    | transitionStatement
    | logicStatement
    ;

controlSystemBodyDeclaration
    : controlVarStatement?
    | logicStatement*
    ;

controlVarStatement
    : LBRACE controlVarExpression* RBRACE
    ;


controlVarExpression
    : varIdentifier bop=VALUEOF expression
    ;

logicStatement
    : propositionStatement
    | ltlStatement
    ;

controlStatement
    : syncControlStatement
    | asyncControlStatement
    ;

syncControlStatement
    : SYNC subSystemIdentifier (COMMA subSystemIdentifier)*
    ;

asyncControlStatement
    : ASYNC subSystemIdentifier (COMMA subSystemIdentifier)*
    ;

subSystemIdentifier
    : systemIdentifier LPAREN parameterList? RPAREN (AS IDENTIFIER)?
    ;

systemIdentifier
    : IDENTIFIER
    ;

// State

stateNaming
    : stateNameIdentifier bop=EQ stateBody
    ;

stateBody
    : LBRACE stateDeclarator RBRACE
    ;

stateDeclarator
    : stateExpression (COMMA stateExpression)*
    ;

stateExpression
    : varIdentifier bop=VALUEOF expression
    ;

stateIdentifier
    : stateNameIdentifier
    | stateBody
    ;

stateNameIdentifier
    : IDENTIFIER
    ;

// Expression
expression
    : LPAREN inner=expression RPAREN #parenthesesExpression
    | primary #primaryExpression
    | prefix=(ADD|SUB) expression #unaryExpression
    | prefix=BANG expression #notExpression
    | expression bop=(MUL|DIV|MOD|CARET) expression #multiplicativeExpression
    | expression bop=(ADD|SUB) expression #additiveExpression
    | expression bop=(EQ|NEQ|LE|GE|GT|LT) expression #relationalExpression
    | expression bop=(AND|OR) expression #conditionalExpression
    ;

primary
    : literal
    | variableIdentifier
    ;


// Transition

transitionStatement
    : initIdentifier? stateIdentifier transitionDeclaration*
    ;

initIdentifier
    : INIT
    ;

transitionDeclaration
    : guardIdentifier? TO actionDeclaration? stateIdentifier
    ;

// Guard
guardIdentifier
    : LPAREN propositionExpression RPAREN
    ;

// Action

actionDeclaration
    : IDENTIFIER LPAREN formalParameterList? RPAREN
    ;

// Formal Parameter

formalParameterList
    : formalParameter (COMMA formalParameter)*
    ;

formalParameter
    : variableIdentifier bop=TYPEOF primitiveType
    ;

variableIdentifier
    : IDENTIFIER (DOT IDENTIFIER)*
    ;

// Parameter

parameterList
    : expression (COMMA expression)*
    ;

// Proposition

propositionStatement
    : PROP propositionIdentifer propositionBody
    ;

propositionBody
    : LBRACE propositionExpression RBRACE
    ;

propositionExpression
    : LPAREN inner=propositionExpression RPAREN #parenthesesPropExpression
    | propositionPrimary #propPrimaryExpression
    | expression #propExpression
    | propositionExpression bop=(LAND|LOR|TO) propositionExpression #propConditionalExpression
    ;

propositionPrimary
    : (systemIdentifier DOT)? propositionIdentifer
    ;

propositionIdentifer
    : IDENTIFIER
    ;

// Linear Temporal Logic
ltlStatement
    : LTL IDENTIFIER ltlBody
    ;

ltlBody
    : LBRACE ltlExpression RBRACE
    ;

ltlExpression
    : ltlPrimary #ltlPrimaryExpression
    | prefix=BANG ltlExpression #ltlNotExpression
    | ltlExpression bop=AND ltlExpression #ltlConditionalAndExpression
    | ltlExpression bop=OR ltlExpression #ltlConditionalOrExpression
    | ltlExpression bop=TO ltlExpression #ltlConditionalImplyExpression
    | ltlExpression bop=UNTIL ltlExpression #untilExpression
    | prefix=ALWAYS ltlExpression #alwaysExpression
    | prefix=EVENTUALLY ltlExpression #eventuallyExpression
    | prefix=NEXT ltlExpression #nextExpression
    ;

ltlPrimary
    : LPAREN ltlExpression RPAREN
    | propositionIdentifer
    ;


// State Variable Set

varSetDeclaration
    : varSetHeader varSetBody
    ;

varSetHeader
    : VARSET varSetIdentifer
    ;

varSetBody
    : LBRACE varSetDeclarator RBRACE
    ;

varSetDeclarator
    : varExpression (COMMA varExpression)*
    ;

varExpression
    : varIdentifier bop=TYPEOF primitiveType
    ;

varSetIdentifer
    : IDENTIFIER
    ;

varIdentifier
    : IDENTIFIER
    ;

// Types

primitiveType
    : BOOLEAN
    | INT
    | FLOAT
    | STRING
    ;

// Literals

literal
    : numberLiteral
    | stringLiteral
    | booleanLiteral
    | otherLiteral
    ;

numberLiteral
    : prefix=(ADD|SUB)? integerLiteral
    | prefix=(ADD|SUB)? floatLiteral
    ;

stringLiteral
    : STRING_LITERAL
    ;

booleanLiteral
    : BOOL_LITERAL
    ;

otherLiteral
    : NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    | HEX_FLOAT_LITERAL
    ;

qualifiedName
    : IDENTIFIER (DOT IDENTIFIER)*
    ;
