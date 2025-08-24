package telas.janelaPrincipal.componentes;

import javax.swing.*;
import telas.janelaPrincipal.Janela;

public class CamposConta {
    public static void adicionar(Janela janela) {

        JLabel jlAgencia = new JLabel();
        jlAgencia.setText("Código da Agência:");
        jlAgencia.setBounds(10, 10, 110, 18);
        janela.getContentPane().add(jlAgencia);

        JTextField jtfAgencia = new JTextField();
        jtfAgencia.setBounds(125, 10, 50, 20);
        janela.getContentPane().add(jtfAgencia);

        JLabel jlConta = new JLabel();
        jlConta.setText("Número da Conta:");
        jlConta.setBounds(205, 10, 105, 18);
        janela.getContentPane().add(jlConta);

        JTextField jtfConta = new JTextField();
        jtfConta.setBounds(315, 10, 60, 20);
        janela.getContentPane().add(jtfConta);

    }
}
