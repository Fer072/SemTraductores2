
package analizadorsintactico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;



public class AnalizadorSintactico {

    public static void generaLexer(String p) // creando el archivo a base del Lexer.flex
    {
        File f = new File(p);
        jflex.Main.generate(f);
    }
    

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // Cada vez que se corre el programa, se genera un archivo Lexer de Java a partir de uno de tipo FLEX
        String path;
        path = "C:\\Users\\andre\\Documents\\NetBeansProjects\\AnalizadorSintactico\\src\\analizadorsintactico\\Lexer.flex";
        generaLexer(path);
        
        IOStream m = new IOStream();
        m.RetornaMatriz();
       
        
       
        // Mostrando la ventana de interfaz
        MainWindow ventana = new MainWindow();
        ventana.setVisible(true);    
                
              
    } 
}
