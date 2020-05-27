/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorsintactico;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author andre
 */
public class IOStream {
    
        String file = "archivo.txt";
        String file2 = "carga.txt";
        String file3 = "reglas.txt";
         
        // función que nos retorna todo el contenido de un archivo de texto
        // a una variable string
        public String RetornaTexto() throws FileNotFoundException, IOException
        {
            String linea;
            String input = "";
           
            FileReader f = new FileReader(file);
            BufferedReader b = new BufferedReader(f);

            while((linea = b.readLine()) != null )
            {
                input = input.concat(linea)+"\n";
            }
            b.close();
            
            return input;
        }
        
        // función que nos retorna el buffer READER para el Lexer, ya que solo recibe como parámetros
        // objetos del tipo READER
        public BufferedReader RetornaReader() throws FileNotFoundException
        {
            FileReader f = new FileReader(file);
            BufferedReader b = new BufferedReader(f);
            return b;
            
        }
        
        // función que nos permite leer un archivo y extrar sus datos para insertarlos en una matriz
        public int[][] RetornaMatriz() throws FileNotFoundException, IOException
        {
            
            
            FileReader f = new FileReader(file2);
            BufferedReader br = new BufferedReader(f);
            
            String linea = null;
            try
            {
                String firstline = br.readLine();
            String[] temp = firstline.split("\t");
            String inst[][] = new String[Integer.valueOf(temp[0])][(Integer.valueOf(temp[1]))*2];
            String fila = "";
            int matrix[][] = new int[Integer.valueOf(temp[0])][(Integer.valueOf(temp[1]))*2];
            int a = 0;
            
            while((linea = br.readLine()) != null)
            {
                fila = linea;
                String[] dato = fila.split("\t");
                for(int i=0; i<dato.length; i++)
                {
                    inst[a][i] = dato[i];
                    matrix[a][i] = Integer.parseInt(inst[a][i]);
                    
                    //System.out.print(matrix[a][i] + "\t");
                    
                } //System.out.println(); 
                a++;
            }
            
            return matrix;
            } catch (IOException e) {
                // TODO Auto-generated catch block
 
            } 
                return null; 
        }
       
        
                
}
