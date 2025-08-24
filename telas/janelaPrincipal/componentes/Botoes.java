package telas.janelaPrincipal.componentes;

import javax.swing.*;
import metodos.ClienteOperacoes;
import telas.janelaPrincipal.Janela;
import java.awt.event.*;

public class Botoes {
    public static void adicionar(Janela janela, ClienteOperacoes operacoes) {

        // criando e estilizando os botões 

        JButton jbConsultar = new JButton();
        jbConsultar.setText("Consultar");
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic(KeyEvent.VK_S); //atalho
        janela.getContentPane().add(jbConsultar);
        // registra os dados informados nos campos
        jbConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento){
                operacoes.gravar();
                JOptionPane.showMessageDialog(null, "Dados registrados.");
            }
        });

        JButton jbAtualizar = new JButton();
        jbAtualizar.setText("Atualizar");
        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setMnemonic(KeyEvent.VK_A); // atalho
        janela.getContentPane().add(jbAtualizar);
        // executa o método editar
        jbAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento){
                operacoes.editar();
                JOptionPane.showMessageDialog(null, "Dados atualizados.");
            }
        });

        JButton jbFechar = new JButton();
        jbFechar.setText("Fechar");
        jbFechar.setBounds(255, 190, 100, 23);
        jbFechar.setMnemonic(KeyEvent.VK_F); //atalho
        janela.getContentPane().add(jbFechar);
        // executa o método cancelar, fechando a janela e interrompendo a execução
        jbFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento){
                operacoes.cancelar();
            }
        });

    }
}
