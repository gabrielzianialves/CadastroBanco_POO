package telas.janelaPrincipal.componentes;

import javax.swing.*;
import telas.janelaPrincipal.Janela;

import java.awt.event.*;

public class ContasRadioButtons {
    public static void adicionar(Janela janela) {

        JRadioButton jrbCorrente = new JRadioButton();
        jrbCorrente.setText("Conta Corrente");
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setSelected(true);
        jrbCorrente.setMnemonic(KeyEvent.VK_C);
        janela.getContentPane().add(jrbCorrente);

        JRadioButton jrbPoupanca = new JRadioButton();
        jrbPoupanca.setText("Conta Poupança");
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic(KeyEvent.VK_P);
        janela.getContentPane().add(jrbPoupanca);

        ButtonGroup bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);
    }
}
