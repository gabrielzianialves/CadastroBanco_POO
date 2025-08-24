package telas.janelaPrincipal.componentes;

import javax.swing.*;
import telas.janelaPrincipal.Janela;
import java.awt.event.*;

public class ContasRadioButtons {

    // cria os radio buttons globais para poderem ser acessados por outras classes
    public static JRadioButton jrbCorrente;
    public static JRadioButton jrbPoupanca;

    public static void adicionar(Janela janela) {

        // criação dos radio buttons para selecionar o tipo de conta

        jrbCorrente = new JRadioButton();
        jrbCorrente.setText("Conta Corrente");
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setSelected(true);
        jrbCorrente.setMnemonic(KeyEvent.VK_C); // atalho
        janela.getContentPane().add(jrbCorrente);

        jrbPoupanca = new JRadioButton();
        jrbPoupanca.setText("Conta Poupança");
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic(KeyEvent.VK_P); // atalho
        janela.getContentPane().add(jrbPoupanca);

        ButtonGroup bgContas = new ButtonGroup(); // agrupa os radio buttos para apenas um poder ser selecionado
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);
    }

    // get para retornar o que foi selecionado

    public static String getTipoConta() {
        if (jrbCorrente.isSelected()){
            return "Tipo de conta selecionada: Conta Corrente.";
        } 
        else if (jrbPoupanca.isSelected()){
            return "Tipo de conta selecionada: Conta Poupança.";
        }
        return "Nenhum tipo de conta foi selecionado.";
    }

}
