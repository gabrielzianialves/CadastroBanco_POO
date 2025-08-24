package telas.janelaPrincipal;

import javax.swing.*;
import metodos.ClienteOperacoes;
import telas.janelaPrincipal.componentes.*;
import telas.janelaPrincipal.util.*;

public class Janela extends JFrame {

    public Janela() {
        super("Java Swing - Desenvolvimento de Sistemas");
        setSize(400, 255);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);
        getContentPane().setLayout(null);
        UtilsJanela.centralizar(this); // chama o método centralizar

        // adicionando os componentes a janela
        CamposConta.adicionar(this);
        CamposCliente.adicionar(this);
        ContasRadioButtons.adicionar(this);
        Separadores.adicionar(this);

        // instancia operacoes para executar os métodos ao clicar nos botões
        ClienteOperacoes operacoes = new ClienteOperacoes();
        Botoes.adicionar(this, operacoes); 

    }

    public static void main(String[] args) {

        Janela janela = new Janela();
        janela.setVisible(true);
    }
}
