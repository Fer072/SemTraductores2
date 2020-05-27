/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorsintactico;

import java.util.LinkedList;


/**
 *
 * @author andre
 */
public class ReglasSyntax {
    
    private int NumRegla;
    private int cantGenerada;
    private int LadoIzquierdo;
    
    ReglasSyntax()
    {
        
    }
    
    ReglasSyntax(int a, int b, int c)
    {
        this.setNumRegla(a);
        this.setLadoIzq(b);
        this.setcantGenerada(c);
    }
    
    public void setNumRegla(int n)
    {
        this.NumRegla = n;
    }
    
    public void setcantGenerada(int n)
    {
        this.cantGenerada = n;
    }
    
    public void setLadoIzq(int n)
    {
        this.LadoIzquierdo = n;
    }
    
    public int getNumRegla()
    {
        return this.getNumRegla();
    }
    
    public int getCantGenerada()
    {
        return this.cantGenerada;
    }
    
    public int getLadoIzq()
    {
        return this.LadoIzquierdo;
    }
    
    public LinkedList<ReglasSyntax> retornaListadeReglas()
    {
        LinkedList<ReglasSyntax> lista = new LinkedList();
        ReglasSyntax regla;
        
        regla = new ReglasSyntax(1,25,1);
        lista.add(regla);
        regla = new ReglasSyntax(2,26,0);
        lista.add(regla);
        regla = new ReglasSyntax(3,26,2);
        lista.add(regla);
        regla = new ReglasSyntax(4,27,1);
        lista.add(regla);
        regla = new ReglasSyntax(5,27,1);
        lista.add(regla);
        regla = new ReglasSyntax(6,28,4);
        lista.add(regla);
        regla = new ReglasSyntax(7,29,0);
        lista.add(regla);
        regla = new ReglasSyntax(8,29,3);
        lista.add(regla);
        regla = new ReglasSyntax(9,30,6);
        lista.add(regla);
        regla = new ReglasSyntax(10,31,0);
        lista.add(regla);
        regla = new ReglasSyntax(11,31,3);
        lista.add(regla);
        regla = new ReglasSyntax(12,32,0);
        lista.add(regla);
        regla = new ReglasSyntax(13,32,4);
        lista.add(regla);
        regla = new ReglasSyntax(14,33,3);
        lista.add(regla);
        regla = new ReglasSyntax(15,34,0);
        lista.add(regla);
        regla = new ReglasSyntax(16,34,2);
        lista.add(regla);
        regla = new ReglasSyntax(17,35,1);
        lista.add(regla);
        regla = new ReglasSyntax(18,35,1);
        lista.add(regla);
        regla = new ReglasSyntax(19,36,0);
        lista.add(regla);
        regla = new ReglasSyntax(20,36,2);
        lista.add(regla);
        regla = new ReglasSyntax(21,37,4);
        lista.add(regla);
        regla = new ReglasSyntax(22,37,6);
        lista.add(regla);
        regla = new ReglasSyntax(23,37,5);
        lista.add(regla);
        regla = new ReglasSyntax(24,37,7);
        lista.add(regla);
        regla = new ReglasSyntax(25,37,9);
        lista.add(regla);
        regla = new ReglasSyntax(26,37,3);
        lista.add(regla);
        regla = new ReglasSyntax(27,37,2);
        lista.add(regla);
        regla = new ReglasSyntax(28,38,0);
        lista.add(regla);
        regla = new ReglasSyntax(29,38,2);
        lista.add(regla);
        regla = new ReglasSyntax(30,39,3);
        lista.add(regla);
        regla = new ReglasSyntax(31,40,0);
        lista.add(regla);
        regla = new ReglasSyntax(32,40,2);
        lista.add(regla);
        regla = new ReglasSyntax(33,41,0);
        lista.add(regla);
        regla = new ReglasSyntax(34,41,3);
        lista.add(regla);
        regla = new ReglasSyntax(35,42,1);
        lista.add(regla);
        regla = new ReglasSyntax(36,42,1);
        lista.add(regla);
        regla = new ReglasSyntax(37,42,1);
        lista.add(regla);
        regla = new ReglasSyntax(38,43,4);
        lista.add(regla);
        regla = new ReglasSyntax(39,44,1);
        lista.add(regla);
        regla = new ReglasSyntax(40,44,1);
        lista.add(regla);
        regla = new ReglasSyntax(41,45,3);
        lista.add(regla);
        regla = new ReglasSyntax(42,45,2);
        lista.add(regla);
        regla = new ReglasSyntax(43,45,2);
        lista.add(regla);
        regla = new ReglasSyntax(44,45,3);
        lista.add(regla);
        regla = new ReglasSyntax(45,45,3);
        lista.add(regla);
        regla = new ReglasSyntax(46,45,3);
        lista.add(regla);
        regla = new ReglasSyntax(47,45,3);
        lista.add(regla);
        regla = new ReglasSyntax(48,45,3);
        lista.add(regla);
        regla = new ReglasSyntax(49,45,3);
        lista.add(regla);
        regla = new ReglasSyntax(50,45,1);
        lista.add(regla);
        
        return lista;
    }
    
}
