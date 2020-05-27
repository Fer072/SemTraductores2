/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexico;

/**
 *
 * @author andre
 */
public class Token {
    private String token;
    private String lexema; 
    private int tid;
    
    Token(String a, String b, int c)
    {
       this.setToken(a);
       this.setLexema(b);
       this.setTID(c);
    }
    
    public void setToken(String t)
    {
        this.token = t;
    }
    
    public void setLexema(String l)
    {
        this.lexema = l;
    }
    
    public String getToken()
    {
        return this.token;
    }
    
    public String getLexema()
    {
        return this.lexema;
    }
    
    public void setTID(int d)
    {
        this.tid = d;
    }
    
    public int getTID()
    {
        return this.tid;
    }
}
