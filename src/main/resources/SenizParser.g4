parser grammar SenizParser;

options { tokenVocab=SenizLexer; }

compilationUnit
    : importDeclaration* systemDeclaration? variableDeclaration? EOF
    ;

importDeclaration
    : IMPORT qualifiedName
    ;

systemDeclaration
    : systemHeader systemBody
    ;

systemHeader
    : SYSTEM IDENTIFIER systemParameter?
    ;

systemParameter
    : OVER IDENTIFIER
    ;

systemBody
    : LBRACE systemBodyDeclaration* RBRACE
    ;

systemBodyDeclaration
    : stateDeclaration
    | transitionStatement
    ;

stateDeclaration
    : IDENTIFIER bop=EQ stateBody
    ;

stateBody
    : LBRACE stateDeclarator? RBRACE
    ;

stateDeclarator
    : stateExpression (COMMA stateExpression)*
    ;

stateExpression
    : IDENTIFIER bop=VALUEOF literal
    ;

transitionStatement
    : initIdentifier? stateIdentifier (TO actionDeclaration? stateIdentifier)+
    ;

initIdentifier
    : INIT
    ;

actionDeclaration
    : LBRACK IDENTIFIER RBRACK
    ;

stateIdentifier
    : IDENTIFIER
    | stateBody
    ;


// State Variable

variableDeclaration
    : variableHeader variableBody
    ;

variableHeader
    : VARIABLE IDENTIFIER
    ;

variableBody
    : LBRACE variableDeclarator? RBRACE
    ;

variableDeclarator
    : variableExpression (COMMA variableExpression)*
    ;

variableExpression
    : IDENTIFIER bop=TYPEOF primitiveType
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
    : prefix=(POS|NEG)? integerLiteral
    | prefix=(POS|NEG)? floatLiteral
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
