package analizadorsintactico;
import static analizadorsintactico.Token.*;
%%
%class Lexer
%type Token

L = [a-zA-Z_]
D = [0-9]
WHITE = [ \t\r\n]




%{ 
    public String lexema;
%}

%%

{WHITE} {/*Ignore*/}

("int"|"float"|"double"|"bool"|"char"|"void"|"long") {lexema = yytext(); return TIPODATO;}
("(-"{D}+")")|{D}+ {lexema = yytext(); return CONSTANTE;}
("+"|"-") {lexema = yytext(); return OPSUMA;} 
("*"|"/") {lexema = yytext(); return OPMUL;} 
("<"|">"|"<="|">="|"!=") {lexema = yytext(); return OPREL;}
"||" {lexema = yytext(); return OPOR;}
"&&" {lexema = yytext(); return OPAND;}
"!" {lexema = yytext(); return OPNOT;}
"==" {lexema = yytext(); return OPIGUALDAD;}
";" {lexema = yytext(); return PUNTOCOMA;}
"," {lexema = yytext(); return COMA;}
"(" {lexema = yytext(); return PARIZQ;}
")" {lexema = yytext(); return PARDER;}
"{" {lexema = yytext(); return LLAVEIZQ;}
"}" {lexema = yytext(); return LLAVEDER;}
"=" {lexema = yytext(); return OPASIGN;}
"if" {lexema = yytext(); return IF;}
"while" {lexema = yytext(); return WHILE;}
"do" {lexema = yytext(); return DO;}
"for" {lexema = yytext(); return FOR;}
":" {lexema = yytext(); return DOSPUNTOS;}
"return" {lexema = yytext(); return RETURN;}
"else" {lexema = yytext(); return ELSE;} 
"$" {lexema = yytext(); return FINCADENA;}

{L}({L}|{D})* {lexema = yytext(); return IDENTIFICADOR;}
. {return ERROR;}


