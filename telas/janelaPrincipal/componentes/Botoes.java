package telas.janelaPrincipal.componentes;

import java.awt.event.*;
import javax.swing.*;
import metodos.ClienteOperacoes;
import telas.janelaInicial.JanelaInicial;
import telas.janelaPrincipal.Janela;

public class Botoes {
    public static void adicionar(Janela janela, ClienteOperacoes operacoes) {

        // criando e estilizando os botões 

        JButton jbVoltar = new JButton("< Voltar");
        jbVoltar.setBounds(11, 190, 80, 23);
        janela.getContentPane().add(jbVoltar);
        jbVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.dispose(); // fecha a janela atual
                new JanelaInicial().setVisible(true); // abre a janela inicial
            }
        });

        JButton jbCadastrar = new JButton();
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.setBounds(94, 190, 95, 23);
        jbCadastrar.setMnemonic(KeyEvent.VK_S); //atalho
        janela.getContentPane().add(jbCadastrar);
        // registra os dados informados nos campos
        jbCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento){
                operacoes.gravar();
            }
        });

        JButton jbAtualizar = new JButton();
        jbAtualizar.setText("Atualizar");
        jbAtualizar.setBounds(192, 190, 90, 23);
        jbAtualizar.setMnemonic(KeyEvent.VK_A); // atalho
        janela.getContentPane().add(jbAtualizar);
        // executa o método editar
        jbAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento){
                operacoes.editar();
            }
        });

        JButton jbExcluir = new JButton();
        jbExcluir.setText("Excluir");
        jbExcluir.setBounds(285, 190, 90, 23);
        jbExcluir.setMnemonic(KeyEvent.VK_F); //atalho
        janela.getContentPane().add(jbExcluir);
        // executa o método excluir
        jbExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento){
                operacoes.excluir();
            }
        });

    }
}
