package telas.janelaPrincipal.componentes;

import javax.swing.*;
import telas.janelaPrincipal.Janela;
import java.awt.event.*;

public class Botoes {
    public static void adicionar(Janela janela) {

        JButton jbConsultar = new JButton();
        jbConsultar.setText("Consultar");
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic(KeyEvent.VK_S);
        janela.getContentPane().add(jbConsultar);

        JButton jbAtualizar = new JButton();
        jbAtualizar.setText("Atualizar");
        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setEnabled(false);
        jbAtualizar.setMnemonic(KeyEvent.VK_A);
        janela.getContentPane().add(jbAtualizar);

        JButton jbFechar = new JButton();
        jbFechar.setText("Fechar");
        jbFechar.setBounds(255, 190, 100, 23);
        jbFechar.setMnemonic(KeyEvent.VK_F);
        janela.getContentPane().add(jbFechar);

    }
}
