package telas.janelaInicial;

import java.awt.event.*;
import java.text.ParseException;
import javax.swing.*;
import metodos.ClienteOperacoes;
import telas.janelaConsulta.JanelaConsulta;
import telas.janelaPrincipal.Janela;
import telas.janelaPrincipal.util.*;

public class JanelaInicial extends JFrame {

    private ClienteOperacoes operacoes;

    public JanelaInicial(ClienteOperacoes operacoes) {
        super("Tela Inicial");

        this.operacoes = operacoes;
        setSize(400, 255);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);
        getContentPane().setLayout(null);
        UtilsJanela.centralizar(this);

        JPanel painel = new JPanel();
        painel.setBorder(BorderFactory.createTitledBorder("Sistema Bancário"));
        painel.setLayout(null);

        JLabel titulo = new JLabel("Bem-vindo(a) ao sistema de", SwingConstants.CENTER);
        JLabel subtitulo = new JLabel("gerenciamento de conta bancária.", SwingConstants.CENTER);
        JButton botaoOperacoes = new JButton("Operações");
        JButton botaoConsulta = new JButton("Consulta");
        // quando o usuário clicar no botao, ele é redirecionado para a janela principal de operações
        botaoOperacoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento){
                dispose(); // fecha a tela atual
                try{
                    new Janela(operacoes).setVisible(true); //abre a outra janela
                } 
                catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        // quando o usuário clicar no botao, ele é redirecionado para a janela de consultas
        botaoConsulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento){
                dispose(); // fecha a tela atual
                new JanelaConsulta(operacoes).setVisible(true); //abre a outra janela
            }
        });

        // estilização
        painel.setBounds(20, 20, 350, 180);
        titulo.setBounds(0, 30, 350, 30);
        subtitulo.setBounds(-50, 40, 450, 40);
        botaoOperacoes.setBounds(180, 100, 120, 30);
        botaoConsulta.setBounds(40, 100, 120, 30);

        // adicionando componentes
        painel.add(titulo);
        painel.add(subtitulo);
        painel.add(botaoOperacoes);
        painel.add(botaoConsulta);
        add(painel);

    }

    public static void main(String[] args) {

        ClienteOperacoes operacoes = new ClienteOperacoes(); 
        JanelaInicial janelaInicial = new JanelaInicial(operacoes); 
        janelaInicial.setVisible(true);
    }
}
