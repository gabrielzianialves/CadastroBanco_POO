package telas.janelaPrincipal.componentes;

import javax.swing.*;
import telas.janelaPrincipal.Janela;

public class CamposCliente {
    public static void adicionar(Janela janela) {

        JLabel jlNome = new JLabel();
        jlNome.setText("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        janela.getContentPane().add(jlNome);

        JTextField jtfNome = new JTextField();
        jtfNome.setBounds(75, 50, 300, 20);
        janela.getContentPane().add(jtfNome);

        JLabel jlEndereco = new JLabel();
        jlEndereco.setText("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        janela.getContentPane().add(jlEndereco);

        JTextField jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75, 75, 300, 20);
        janela.getContentPane().add(jtfEndereco);

        JLabel jlTelefone = new JLabel();
        jlTelefone.setText("Telefone:");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        janela.getContentPane().add(jlTelefone);

        JTextField jtfTelefone = new JTextField();
        jtfTelefone.setBounds(75, 100, 300, 20);
        janela.getContentPane().add(jtfTelefone);  

        JLabel jlCpf = new JLabel();
        jlCpf.setText("CPF:");
        jlCpf.setBounds(45, 125, 60, 18);
        janela.getContentPane().add(jlCpf);

        JTextField jtfCpf = new JTextField();
        jtfCpf.setBounds(75, 125, 300, 20);
        janela.getContentPane().add(jtfCpf);

    }
}
