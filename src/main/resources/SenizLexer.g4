lexer grammar SenizLexer;

// Keywords
IMPORT
    : 'import'
    ;

MAIN
    : 'main'
    ;

CONTROL
    : 'control'
    ;

SYSTEM
    : 'system'
    ;

VARSET
    : 'varset'
    ;

OVER
    : 'over'
    ;

INIT
    : 'init'
    ;

AS
    : 'as'
    ;

SYNC
    : 'sync'
    ;

ASYNC
    : 'async'
    ;

ARGS
    : 'args'
    ;

PROP
    : 'prop'
    ;

LTL
    : 'ltl'
    ;

// Types
BOOLEAN
    : 'bool'
    ;

INT
    : 'int'
    ;

FLOAT
    : 'float'
    ;

STRING
    : 'string'
    ;


// Operators

VALUEOF:            ':';
TYPEOF:             '::';
TO:                 '->';
GT:                 '>';
LT:                 '<';
BANG:               '!';
TILDE:              '~';
QUESTION:           '?';
EQ:                 '=';
LE:                 '<=';
GE:                 '>=';
NEQ:                '/=';
AND:                '&';
OR:                 '|';
LAND:               'and';
LOR:                'or';
ADD:                '+';
SUB:                '-';
MUL:                '*';
DIV:                '/';
CARET:              '^';
MOD:                '%';
PAR:                '||';
INTERLEAVE:         '|||';

// Temporal Operator
ALWAYS:             'G';
EVENTUALLY:         'F';
NEXT:               'X';
UNTIL:              'U';

// Literals

BOOL_LITERAL
    : 'true'
    | 'false'
    ;

DECIMAL_LITERAL
    : ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?
    ;

HEX_LITERAL
    : '0' [xX] [0-9a-fA-F] ([0-9a-fA-F_]* [0-9a-fA-F])? [lL]?
    ;

OCT_LITERAL
    : '0' '_'* [0-7] ([0-7_]* [0-7])? [lL]?
    ;

BINARY_LITERAL
    : '0' [bB] [01] ([01_]* [01])? [lL]?
    ;

FLOAT_LITERAL
    : (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
    | Digits (ExponentPart [fFdD]? | [fFdD])
    ;

HEX_FLOAT_LITERAL:  '0' [xX] (HexDigits '.'? | HexDigits? '.' HexDigits) [pP] [+-]? Digits [fFdD]?;

STRING_LITERAL
    : '"' (~["\\\r\n] | EscapeSequence)* '"'
    ;

NULL_LITERAL
    : 'null'
    ;

// Separators

LPAREN
    : '('
    ;
RPAREN
    : ')'
    ;
LBRACE
    : '{'
    ;
RBRACE
    : '}'
    ;
LBRACK
    : '['
    ;
RBRACK
    : ']'
    ;
SEMI
    : ';'
    ;
COMMA
    : ','
    ;
DOT
    : '.'
    ;

// Identifiers

IDENTIFIER
    : [a-zA-Z_] [a-zA-Z_0-9]*
    ;

// Whitespace and comments

WS
    : [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    : '/*' .*? '*/'    -> skip
    ;

LINE_COMMENT
    : '//' ~[\r\n]*    -> skip
    ;

// Fragment rules

fragment ExponentPart
    : [eE] [+-]? Digits
    ;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;

fragment HexDigits
    : HexDigit ((HexDigit | '_')* HexDigit)?
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;

fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;