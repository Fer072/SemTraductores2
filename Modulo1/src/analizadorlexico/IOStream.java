/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexico;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author andre
 */
public class IOStream {
    
    
        String linea;
        String input = "";
        
        public String CargaArchivo() throws FileNotFoundException, IOException
        {
            String file = "prueba.txt";
            FileReader f = new FileReader(file);
            BufferedReader b = new BufferedReader(f);

            while((linea = b.readLine()) != null )
            {
                input = input.concat(linea)+"\n";
            }
            b.close();
            
            return input;
        }
        
    
    
    
}
