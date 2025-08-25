package telas.janelaPrincipal.componentes;

import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import telas.janelaPrincipal.Janela;

public class CamposCliente {

    // cria campos de texto globais para poderem ser acessados por outras classes
    public static JTextField jtfNome;
    public static JTextField jtfEndereco;
    public static JTextField jtfTelefone;
    public static JTextField jtfCpf;


    public static void adicionar(Janela janela) throws ParseException {

        // criação dos labels e campos para inserir as informações do cliente

        JLabel jlNome = new JLabel();
        jlNome.setText("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        janela.getContentPane().add(jlNome);

        jtfNome = new JTextField();
        jtfNome.setBounds(75, 50, 300, 20);
        janela.getContentPane().add(jtfNome);

        JLabel jlEndereco = new JLabel();
        jlEndereco.setText("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        janela.getContentPane().add(jlEndereco);

        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75, 75, 300, 20);
        janela.getContentPane().add(jtfEndereco);

        JLabel jlTelefone = new JLabel();
        jlTelefone.setText("Telefone:");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        janela.getContentPane().add(jlTelefone);

        MaskFormatter mascaraTelefone = new MaskFormatter("(##) #####-####");
        mascaraTelefone.setPlaceholderCharacter('_');
        jtfTelefone = new JFormattedTextField(mascaraTelefone);
        jtfTelefone.setBounds(75, 100, 300, 20);
        janela.getContentPane().add(jtfTelefone);

        JLabel jlCpf = new JLabel();
        jlCpf.setText("CPF:");
        jlCpf.setBounds(45, 125, 60, 18);
        janela.getContentPane().add(jlCpf);

        MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
        mascaraCPF.setPlaceholderCharacter('_');
        jtfCpf = new JFormattedTextField(mascaraCPF);
        jtfCpf.setBounds(75, 125, 300, 20);
        janela.getContentPane().add(jtfCpf);

    }

    // gets para retornar o que foi digitado nos campos globais
    
    public static String getNomeDigitado() {
        return jtfNome.getText();
    }
    public static String getEnderecoDigitado() {
        return jtfEndereco.getText();
    }
    public static String getTelefoneDigitado() {
        return jtfTelefone.getText();
    }
    public static String getCpfDigitado() {
        return jtfCpf.getText();
    }
}
