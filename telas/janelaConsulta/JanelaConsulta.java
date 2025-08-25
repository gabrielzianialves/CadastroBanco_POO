package telas.janelaConsulta;

import classes.Cliente;
import classes.ContaCorrente;
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
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // fecha a janela atual
                new JanelaInicial(operacoes).setVisible(true); // abre a janela inicial
            }
        });

        JLabel titulo = new JLabel("Consultar Clientes Cadastrados");

        JComboBox<String> comboClientes = new JComboBox<>();

        // adiciona os clientes cadastrados no combo box
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
                        String tipoConta;
                        if (clienteEncontrado.getConta() instanceof ContaCorrente){
                            tipoConta = "Conta Corrente";
                        }
                        else {
                            tipoConta = "Conta Poupança";
                        }
                        
                        String agencia = clienteEncontrado.getConta().getAgencia();
                        String numeroConta = clienteEncontrado.getConta().getNumero();

                        JOptionPane.showMessageDialog(null, "\nTipo de Conta: " + tipoConta+"\nAgência: "+ agencia +"\nNúmero da Conta: " + numeroConta + "\nNome: " + clienteEncontrado.getNome() + "\nEndereço: " + clienteEncontrado.getEndereco() + "\nTelefone: " + clienteEncontrado.getTelefone() + "\nCPF: " + clienteEncontrado.getCpf(), "Informações do Cliente", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
            }
        });
        
        
        botaoVoltar.setBounds(10, 10, 45, 20);
        titulo.setBounds(105, 40, 200, 30);
        comboClientes.setBounds(40, 90, 300, 30);
        botaoDados.setBounds(115, 150, 150, 30);

        add(botaoVoltar);
        add(titulo);
        add(comboClientes);
        add(botaoDados);

    }

    public static void main(String[] args) {
        ClienteOperacoes operacoes = new ClienteOperacoes();
        JanelaConsulta janelaConsulta = new JanelaConsulta(operacoes);
        janelaConsulta.setVisible(true);
    }
}
