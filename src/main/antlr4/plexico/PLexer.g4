lexer grammar PLexer;

PALAVRA_CEAVE: 'DECLARACOES' | 'ALGORITMO' | 'INT' | 'REAL' |
'ATRIBUIR' | 'A' | 'LER' | 'IMPRIMIR' | 'SE' | 'ENTAO' | 'ENQUANTO'
| 'INICIO' | 'FIM' | 'E' | 'OU';

NUMREAL: [0-9]+ ('.' [0-9]+)?;

NUMINT: [0-9]+;

VARIAVEL: [a-zA-Z] [a-zA-Z0-9]*;

CADEIA: '"' .* '"';

WS: (' ' | '\t' | '\r' | '\n') -> skip;

OP_REL: '>' | '>=' | '<' | '<=' | '<>' | '=';

OP_ARIT: '+' | '-' | '*' | '/';

DELIM: ':';

ABREPAR: '(';

FECHAPAR: ')';

