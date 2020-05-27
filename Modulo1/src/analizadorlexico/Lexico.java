/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexico;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author andre
 */
public class Lexico {
    
    String lenguaje = ("(int|float|double|bool|long)|([0-9]+)|(if)|(while)|(do)|(for)|(:)|(return)|(else)|([+|-])|([*|/])|(=)|([|]+)|(&&)|"+
                "(!)|(==)|(;)|(,)|([<|>|<=|>=|!=])|([(])|([)])|([{])|([}])|([a-zA-Z]+)|([$])");
 
    ArrayList<Token> lista = new ArrayList<Token>();
    
    Lexico(String s)
    {
        Pattern p = Pattern.compile(lenguaje);
        Matcher matcher = p.matcher(s);
        
        while(matcher.find())
        {
            String Token1 = matcher.group(1);
            if(Token1 != null)
            {
               int id = 2;
               Token tk = new Token(Token1,"Tipo de dato",id);
               lista.add(tk);
            }
            
            String Token2 = matcher.group(2);
            if(Token2 != null)
            {
                int id = 1;
                Token tk = new Token(Token2,"Constante",id);
                lista.add(tk);
            }
            
            String Token3 = matcher.group(3);
            if(Token3 != null)
            {
                int id = 17;
                Token tk = new Token(Token3,"Sentencia SI",id);
                lista.add(tk);
            }
            
             String Token4 = matcher.group(4);
            if(Token4 != null)
            {
                int id = 18;
                Token tk = new Token(Token4,"Sentencia MIENTRAS",id);
                lista.add(tk);
            }
            
            String Token5 = matcher.group(5);
            if(Token5 != null)
            {
                int id = 19;
                Token tk = new Token(Token5,"Sentencia HACER",id);
                lista.add(tk);
            }
            
             String Token6 = matcher.group(6);
            if(Token6 != null)
            {
                int id = 20;
                Token tk = new Token(Token6,"Sentencia PARA",id);
                lista.add(tk);
            }
            
             String Token7 = matcher.group(7);
            if(Token7 != null)
            {
                int id = 21;
                Token tk = new Token(Token7,"Dos puntos",id);
                lista.add(tk);
            }
            
             String Token8 = matcher.group(8);
            if(Token8 != null)
            {
                int id = 22;
                Token tk = new Token(Token8,"Sentencia RETORNA",id);
                lista.add(tk);
            }
            
            String Token9 = matcher.group(9);
            if(Token9 != null)
            {
                int id = 23;
                Token tk = new Token(Token9,"Sentencia SINO",id);
                lista.add(tk);
            }
            
            String Token10 = matcher.group(10);
            if(Token10 != null)
            {
                int id = 3;
                Token tk = new Token(Token10,"Operador Suma/Resta",id);
                lista.add(tk);
            }
            
            String Token11 = matcher.group(11);
            if(Token11 != null)
            {
                int id = 4;
                Token tk = new Token(Token11,"Operador Multiplicación/División",id);
                lista.add(tk);
            }
            
            String Token12 = matcher.group(12);
            if(Token6 != null)
            {
                int id = 16;
                Token tk = new Token(Token12,"Operador de Asignación",id);
                lista.add(tk);
            }
            
            String Token13 = matcher.group(13);
            if(Token13 != null)
            {
                int id = 6;
                Token tk = new Token(Token13,"Operador OR",id);
                lista.add(tk);
            }
            
            String Token14 = matcher.group(14);
            if(Token14 != null)
            {
                int id = 7;
                Token tk = new Token(Token14,"Operador AND",id);
                lista.add(tk);
            }
            
            String Token15 = matcher.group(15);
            if(Token9 != null)
            {
                int id = 8;
                Token tk = new Token(Token15,"Operador NOT",id);
                lista.add(tk);
            }
            
            String Token16 = matcher.group(16);
            if(Token16 != null)
            {
                int id = 9;
                Token tk = new Token(Token10,"Operador de Igualdad",id);
                lista.add(tk);
            }
             
            String Token17 = matcher.group(17);
            if(Token17 !=  null)
            {
                int id = 10;
                Token tk = new Token(Token17,"Punto y coma",id);
                lista.add(tk);
            }
            
            String Token18 = matcher.group(18);
            if(Token18 != null)
            {
                int id = 11;
                Token tk = new Token(Token18,"Coma",id);
                lista.add(tk);
            }
            
            String Token19 = matcher.group(19);
            if(Token19 != null)
            {
                int id = 5;
                Token tk = new Token(Token19,"Operador Relacional",id);
                lista.add(tk);
            }
            
            String Token20 = matcher.group(20);
            if(Token20 != null)
            {
                int id = 12;
                Token tk = new Token(Token20,"Paréntesis izquierdo",id);
                lista.add(tk);
            }
            
            String Token21 = matcher.group(21);
            if(Token21!= null)
            {
                int id = 13;
                Token tk = new Token(Token21,"Paréntesis derecho",id);
                lista.add(tk);
            }
            
            String Token22 = matcher.group(22);
            if(Token22 != null)
            {
                int id = 14;
                Token tk = new Token(Token22,"Llave izquierda",id);
                lista.add(tk);
            }
            
            String Token23 = matcher.group(23);
            if(Token23 != null)
            {
                int id = 15;
                Token tk = new Token(Token23,"Llave derecha",id);
                lista.add(tk);
            }
            
            String Token24 = matcher.group(24);
            if(Token24 != null)
            {
                int id = 0;
                Token tk = new Token(Token24,"Identificador",id);
                lista.add(tk);
            }
            
            String Token25 = matcher.group(25);
            if(Token25 != null)
            {
                int id = 24;
                Token tk = new Token(Token25,"Fin de cadena",id);
                lista.add(tk);
            }
            
            
            
            
        }
    }
        
    public ArrayList<Token> RetornaLista()
    {
        return lista;
    }
    
}
