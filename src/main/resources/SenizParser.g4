parser grammar SenizParser;

options { tokenVocab=SenizLexer; }

compilationUnit
    : importDeclaration* systemDeclaration? stateVarSetDeclaration? EOF
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
    : OVER stateVarSetIdentifer
    ;

systemBody
    : LBRACE controlSystemDeclaration RBRACE
    | LBRACE systemBodyDeclaration* RBRACE
    ;

systemBodyDeclaration
    : stateNaming
    | transitionStatement
    | propositionStatement
    ;

controlSystemDeclaration
    : controlStatement
    | propositionStatement*
    ;

controlStatement
    : systemIdentifier (INTERLEAVE systemIdentifier)*
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
    : stateVarIdentifier bop=VALUEOF expression
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
    : initIdentifier? stateIdentifier (TO actionDeclaration? stateIdentifier)*
    ;

initIdentifier
    : INIT
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
    : IDENTIFIER
    ;


// Proposition

propositionStatement
    : propositionIdentifer bop=EQ propositionBody
    ;

propositionBody
    : LBRACE propositionExpression RBRACE
    ;

propositionExpression
    : propositionPrimary #propPrimaryExpression
    | prefix=BANG propositionExpression #propNotExpression
    | propositionExpression bop=AND propositionExpression #propConditionalAndExpression
    | propositionExpression bop=OR propositionExpression #propConditionalOrExpression
    ;

propositionPrimary
    : LPAREN propositionExpression RPAREN
    | stateNameIdentifier
    ;

propositionIdentifer
    : IDENTIFIER
    ;


// State Variable

stateVarSetDeclaration
    : stateVarSetHeader stateVarSetBody
    ;

stateVarSetHeader
    : VARSET stateVarSetIdentifer
    ;

stateVarSetBody
    : LBRACE stateVarSetDeclarator RBRACE
    ;

stateVarSetDeclarator
    : stateVarExpression (COMMA stateVarExpression)*
    ;

stateVarExpression
    : stateVarIdentifier bop=TYPEOF primitiveType
    ;

stateVarSetIdentifer
    : IDENTIFIER
    ;

stateVarIdentifier
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
