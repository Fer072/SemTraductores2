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
import java.util.LinkedList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class MainWindow extends javax.swing.JFrame {
    
    @SuppressWarnings("null")
    public void Sintactico(LinkedList<Symbol> lista) throws IOException
    {
        // cargando la tabla
        IOStream flujo = new IOStream();
        int SyntaxTable[][] = flujo.RetornaMatriz();
        
        // cargando reglas
        ReglasSyntax r = new ReglasSyntax();
        LinkedList<ReglasSyntax> ruleslist;
        ruleslist = r.retornaListadeReglas();
        
        //creamos pila
        Stack<Object> pila = new Stack();
        if(pila.empty())
            pila.push(0);
        
        boolean esValida = false;
        int k = 0;
        int accion = 1;
        while(accion != 0)
        {
            int fila = (int)pila.peek();
            System.out.println("TOPE PILA -> "+(int)pila.peek());
            int columna = lista.get(k).getTID();
            accion = SyntaxTable[fila][columna];
            
                   
            if(accion == 0)
            {
               System.out.println("Cadena inválida para el lenguaje.");
               if(!esValida)
                    JOptionPane.showMessageDialog(this, "Cadena inválida para el lenguaje");
               break;
            } 
            
            else if(accion == -1)
            {
                esValida = true;
                System.out.println("Cadena válida para el lenguaje.");
                if(esValida)
                    JOptionPane.showMessageDialog(this, "Cadena válida para el lenguaje");
                break;
            }
            
            else if(accion > 0)
            {
                pila.push(columna);
                pila.push(accion);
                k++;
            }
            
            else
            {
                int x  = ruleslist.get((accion-1+2)*(-1)-1).getCantGenerada();
                int cantpop = x*2;
                System.out.println("\nCantidad de pops a realizar -> "+cantpop);
                
              
                for(int i=0; i<cantpop; i++)
                    pila.pop();   
                
                System.out.println("TOPE PILA -> "+(int)pila.peek());
                fila = (int)pila.peek();
                columna = ruleslist.get((accion-1+2)*(-1)-1).getLadoIzq();
                               
                pila.push(columna);
                System.out.println("TOPE PILA -> "+(int)pila.peek());
                pila.push(SyntaxTable[fila][columna]);
                System.out.println("TOPE PILA -> "+(int)pila.peek());
                
                
            } 
                    
        }
      
        
          
    }

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnalizar = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablatk = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tinytxtarea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador Sintáctico");
        setPreferredSize(new java.awt.Dimension(800, 600));

        btnAnalizar.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnAnalizar.setForeground(new java.awt.Color(255, 0, 0));
        btnAnalizar.setText("ANALIZAR");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Limpiar interfaz");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Texto leído:");

        tablatk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablatk);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Elementos encontrados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tinytxtarea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tinytxtarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // BOTÓN DE ANALIZAR: Realiza el análisis léxico de la entrada de datos mediante un archivo de texto
    //  y posteriormente, genera una lista de tokens detectados para después ser analizados sintácticamente
    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        // Creando el modelo te tabla
        DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("TOKEN");
            modelo.addColumn("LEXEMA");
            modelo.addColumn("ID");
            this.tablatk.setModel(modelo);
           
        // Comienza a trabajar el léxico
        BufferedReader r = null;
        
        try {
            
            LinkedList<Symbol> ListaDeTokens = new LinkedList();
            String file = "archivo.txt";
            
            
            IOStream stream = new IOStream();
            FileReader f = null;
            try {
                f = new FileReader(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String buffer = stream.RetornaTexto();
            this.txtArea.setText(buffer);
            
            r = stream.RetornaReader();
            Lexer lex = new Lexer(r);
            Symbol toquen;
            while(true)
            {
                try {
                    Token tk = lex.yylex();
                    if(tk == null)
                    {
                         int numElem = ListaDeTokens.size();
                         this.tinytxtarea.setText(String.valueOf(numElem));
                       
                        for(int i=0; i<ListaDeTokens.size(); i++)
                           modelo.addRow(new Object[]{ListaDeTokens.get(i).getToken(),ListaDeTokens.get(i).getLexema(), ListaDeTokens.get(i).getTID()});
                        
                        LinkedList<Symbol> ListaParaSintax; // se copia la lista de tokens a una nueva
                        ListaParaSintax = (LinkedList<Symbol>) ListaDeTokens.clone(); // para poder generar con ella el análisis sintáctico
                        ListaDeTokens.clear(); // limpiamos la primera lista
                        Sintactico(ListaParaSintax);
                        return;
                       
                    }
                    
                    switch(tk)
                    {
                        case ERROR:
                        {
                            toquen = new Symbol(tk.toString(),lex.lexema,-1);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case IDENTIFICADOR:
                        {
                            int id = 0;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case CONSTANTE:
                        {
                            int id = 1;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case TIPODATO:
                        {
                            int id = 2;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case OPSUMA:
                        {
                            int id = 3;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case OPMUL:
                        {
                            int id = 4;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case OPREL:
                        {
                            int id = 5;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case OPOR:
                        {
                            int id = 6;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case OPAND:
                        {
                            int id = 7;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case OPNOT:
                        {
                            int id = 8;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case OPIGUALDAD:
                        {
                            int id = 9;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case PUNTOCOMA:
                        {
                            int id = 10;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case COMA:
                        {
                            int id = 11;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case PARIZQ:
                        {
                            int id = 12;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case PARDER:
                        {
                            int id = 13;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case LLAVEIZQ:
                        {
                            int id = 14;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case LLAVEDER:
                        {
                            int id = 15;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case OPASIGN:
                        {
                            int id = 16;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case IF:
                        {
                            int id = 17;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case WHILE:
                        {
                            int id = 18;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case DO:
                        {
                            int id = 19;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case FOR:
                        {
                            int id = 20;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case DOSPUNTOS:
                        {
                            int id = 21;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case ELSE:
                        {
                            int id = 22;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case RETURN:
                        {
                            int id = 23;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        case FINCADENA:
                        {
                            int id = 24;
                            toquen = new Symbol(tk.toString(),lex.lexema,id);
                            ListaDeTokens.add(toquen);
                            break;
                        }
                        
                        default:
                            //toquen = new Symbol(tk.toString(),"",-1);
                            
                    } 
                } catch (IOException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
            
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        finally {
            try {
                
                r.close();
            } catch (IOException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }//GEN-LAST:event_btnAnalizarActionPerformed
    
    // BOTÓN DE LIMPIAR INTERFAZ: Limpia los campos de texto del formulario y de la tabla
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        this.txtArea.setText("");
        this.tinytxtarea.setText("");
        
        
        DefaultTableModel tb = (DefaultTableModel) this.tablatk.getModel();
        int a = this.tablatk.getRowCount();
        for(int i=a; i>=0; i--)
           tb.removeRow(tb.getRowCount()-1);
        
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablatk;
    private javax.swing.JTextField tinytxtarea;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
