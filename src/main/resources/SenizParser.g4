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
    : SYSTEM systemIdentifier systemParameter?
    ;

systemParameter
    : OVER stateVarSetIdentifer
    ;

systemBody
    : LBRACE systemBodyDeclaration* RBRACE
    ;

systemBodyDeclaration
    : stateNaming
    | transitionStatement
    ;

systemIdentifier
    : IDENTIFIER
    ;

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
    : stateVarIdentifier bop=VALUEOF literal
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
    : stateNameIdentifier
    | stateBody
    ;

stateNameIdentifier
    : IDENTIFIER
    ;


// State Variable

stateVarSetDeclaration
    : stateVarSetHeader stateVarSetBody
    ;

stateVarSetHeader
    : VARIABLE stateVarSetIdentifer
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
