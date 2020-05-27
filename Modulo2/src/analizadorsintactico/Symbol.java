/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorsintactico;

// clase cuyos objetos administran a los símbolos, dándoles identidad detectando el token e ID correspondiente
public class Symbol { 
    private String token;
    private String lexema;
    private int TID;
    
    Symbol(String a, String b, int e)
    {
        this.setToken(a);
        this.setLexema(b);
        this.setTID(e);
    }
    
    public void setToken(String t)
    {
        this.token = t;
    }
    
    public void setLexema(String l)
    {
        this.lexema = l;
    }
    
    public void setTID(int tid)
    {
        this.TID = tid;
    }
    
    public String getToken()
    {
        return this.token;
    }
    
    public String getLexema()
    {
        return this.lexema;
    }
    
    public int getTID()
    {
        return this.TID;
    }
    
    
}
