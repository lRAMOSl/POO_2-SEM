package utils;

import javax.swing.JFrame;


public class UtilTelas {
    
    public static void formataTela(JFrame telaAtual, JFrame telaNova){
         telaNova.setSize(770, 550);
         telaNova.setLocationRelativeTo(null);
         telaNova.setVisible(true);
         telaAtual.setVisible(false);
    }
    
    public static void formataTela(JFrame telaAtual){
         telaAtual.setSize(770, 550);
         telaAtual.setLocationRelativeTo(null);
 
    }

            
}