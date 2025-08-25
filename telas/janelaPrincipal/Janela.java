package telas.janelaPrincipal;

import java.text.ParseException;

import javax.swing.*;
import metodos.ClienteOperacoes;
import telas.janelaPrincipal.componentes.*;
import telas.janelaPrincipal.util.*;

public class Janela extends JFrame {

    public Janela(ClienteOperacoes operacoes) throws ParseException {
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

        Botoes.adicionar(this, operacoes); 

    }

    public static void main(String[] args) throws ParseException {

        ClienteOperacoes operacoes = new ClienteOperacoes();
        Janela janela = new Janela(operacoes);
        janela.setVisible(true);
    }
}
