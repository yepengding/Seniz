parser grammar SenizParser;

options { tokenVocab=SenizLexer; }

compilationUnit
    : importDeclaration* systemDeclaration? varSetDeclaration? chanSetDeclaration? EOF
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
    : OVER varSetIdentifier (COMMA chanSetIdentifer)? (WITH varSetIdentifier)?
    ;

systemBody
    : LBRACE controlStatement controlSystemBodyDeclaration RBRACE
    | LBRACE systemBodyDeclaration* RBRACE
    ;

systemBodyDeclaration
    : stateNaming
    | globalStateNaming
    | transitionStatement
    | logicStatement
    ;

controlSystemBodyDeclaration
    : (GLOBAL globalStateBody)?
    | logicStatement*
    ;

globalStateBody
    : LBRACE stateDeclarator RBRACE
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

// Global State Naming
globalStateNaming
    : globalStateNameIdentifier bop=EQ globalStateBody
    ;

globalStateNameIdentifier
    : GLOBAL IDENTIFIER
    ;

globalStateIdentifier
    : globalStateNameIdentifier
    | GLOBAL globalStateBody
    ;

// Transition

transitionStatement
    : initIdentifier? stateIdentifier transitionDeclaration*
    ;

initIdentifier
    : INIT
    ;

transitionDeclaration
    : guardIdentifier? TO actionDeclaration? globalStateIdentifier? stateIdentifier
    ;

// Guard
guardIdentifier
    : LBRACK propositionExpression RBRACK
    ;

// Action

actionDeclaration
    : IDENTIFIER LPAREN chanExpression? RPAREN
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
    : VARSET varSetIdentifier
    ;

varSetBody
    : LBRACE varSetDeclarator RBRACE
    ;

varSetDeclarator
    : varTypeDeclaration (COMMA varTypeDeclaration)*
    ;

varTypeDeclaration
    : varIdentifier bop=TYPEOF primitiveType
    ;

varSetIdentifier
    : IDENTIFIER
    ;

varIdentifier
    : IDENTIFIER
    ;

// Channel Set
chanSetDeclaration
    : chanSetHeader chanSetBody
    ;

chanSetHeader
    : CHANSET chanSetIdentifer
    ;

chanSetBody
    : LBRACE chanSetDeclarator RBRACE
    ;

chanSetDeclarator
    : chanTypeDeclaration (COMMA chanTypeDeclaration)*
    ;

chanTypeDeclaration
    : chanIdentifier bop=TYPEOF chanType
    ;

chanExpression
    : chanIdentifier BANG variableIdentifier #sendingExpression
    | chanIdentifier QUESTION variableIdentifier #receivingExpression
    ;

chanType
    : INTERNAL
    | EXTERNAL
    ;

chanSetIdentifer
    : IDENTIFIER
    ;

chanIdentifier
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
