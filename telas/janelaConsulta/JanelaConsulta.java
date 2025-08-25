package telas.janelaConsulta;

import classes.Cliente;
import java.awt.event.*;
import javax.swing.*;
import metodos.ClienteOperacoes;
import telas.janelaInicial.JanelaInicial;
import telas.janelaPrincipal.util.*;

public class JanelaConsulta extends JFrame {

    public JanelaConsulta(ClienteOperacoes operacoes) {
        super("Tela de Consulta");
        setSize(400, 255);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);
        getContentPane().setLayout(null);
        UtilsJanela.centralizar(this);

        
        JButton botaoVoltar = new JButton("<");
        botaoVoltar.setBounds(10, 10, 45, 20);
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // fecha a janela atual
                new JanelaInicial().setVisible(true); // abre a janela inicial
            }
        });


        JComboBox<String> comboClientes = new JComboBox<>();
        JLabel labelNome = new JLabel("Nome: ");
        JLabel labelEndereco = new JLabel("Endereço: ");
        JLabel labelTelefone = new JLabel("Telefone: ");
        JLabel labelCpf = new JLabel("CPF: ");

        comboClientes.removeAllItems();
        for (Cliente c : operacoes.getClientes()) {
            comboClientes.addItem(c.getNome());
        }

        JButton botaoDados = new JButton("Mostrar dados");

        botaoDados.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeSelecionado = (String) comboClientes.getSelectedItem();
                if (nomeSelecionado != null){
                    Cliente clienteEncontrado = null;
                    for (Cliente c : operacoes.getClientes()){
                        if (c.getNome().equals(nomeSelecionado)) {
                            clienteEncontrado = c;
                            break;
                        }
                    }
                    if (clienteEncontrado != null) {
                        labelNome.setText("Nome: "+ clienteEncontrado.getNome());
                        labelEndereco.setText("Endereço: "+ clienteEncontrado.getEndereco());
                        labelTelefone.setText("Telefone: "+ clienteEncontrado.getTelefone());
                        labelCpf.setText("CPF: "+ clienteEncontrado.getCpf());
                        JOptionPane.showMessageDialog(null, "Nome: " + clienteEncontrado.getNome() + "\nEndereço: " + clienteEncontrado.getEndereco() + "\nTelefone: " + clienteEncontrado.getTelefone() + "\nCPF: " + clienteEncontrado.getCpf(), "Informações do Cliente", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        comboClientes.setBounds(50, 50, 300, 30);
        botaoDados.setBounds(125, 100, 150, 30);

        add(botaoVoltar);
        add(comboClientes);
        add(botaoDados);

    }

    public static void main(String[] args) {
        ClienteOperacoes operacoes = new ClienteOperacoes();
        JanelaConsulta janelaConsulta = new JanelaConsulta(operacoes);
        janelaConsulta.setVisible(true);
    }
}
