package telas.janelaPrincipal;

import javax.swing.*;
import telas.janelaPrincipal.componentes.*;
import telas.janelaPrincipal.util.*;

public class Janela extends JFrame {
    public Janela() {
        super("Java Swing - Desenvolvimento de Sistemas");
        setSize(400, 255);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);
        getContentPane().setLayout(null);
        UtilsJanela.centralizar(this);

        CamposConta.adicionar(this);
        CamposCliente.adicionar(this);
        ContasRadioButtons.adicionar(this);
        Separadores.adicionar(this);
        Botoes.adicionar(this); 

    }

    public static void main(String[] args) {

        Janela janela = new Janela();
        janela.setVisible(true);
    }
}
