package telas.janelaPrincipal.componentes;

import javax.swing.*;
import telas.janelaPrincipal.Janela;

public class CamposConta {

    // cria campos de texto globais para poderem ser acessados por outras classes
    public static JTextField jtfAgencia;
    public static JTextField jtfConta;

    public static void adicionar(Janela janela) {

        // criação dos label e campos para inserir as informações do cliente

        JLabel jlAgencia = new JLabel();
        jlAgencia.setText("Código da Agência:");
        jlAgencia.setBounds(10, 10, 110, 18);
        janela.getContentPane().add(jlAgencia);

        jtfAgencia = new JTextField();
        jtfAgencia.setBounds(125, 10, 50, 20);
        janela.getContentPane().add(jtfAgencia);

        JLabel jlConta = new JLabel();
        jlConta.setText("Número da Conta:");
        jlConta.setBounds(205, 10, 105, 18);
        janela.getContentPane().add(jlConta);

        jtfConta = new JTextField();
        jtfConta.setBounds(315, 10, 60, 20);
        janela.getContentPane().add(jtfConta);

    }

    // gets para retornar o que foi digitado nos campos globais
    
    public static String getAgenciaDigitada() {
        return jtfAgencia.getText();
    }
    public static String getNumeroContaDigitado() {
        return jtfConta.getText();
    }
}
