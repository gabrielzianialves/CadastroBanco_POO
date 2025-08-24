package telas.janelaPrincipal.componentes;

import javax.swing.*;
import telas.janelaPrincipal.Janela;


public class Separadores {
    public static void adicionar(Janela janela) {

        // separadores
        
        JSeparator jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);
        janela.getContentPane().add(jSeparator01);

        JSeparator jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10);
        janela.getContentPane().add(jSeparator02);
        
    }
}
