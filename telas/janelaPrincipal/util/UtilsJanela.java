package telas.janelaPrincipal.util;

import java.awt.*;

public class UtilsJanela {
    public static void centralizar(Frame janela) {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension tamanho = janela.getSize();
        if (tamanho.height > screen.height)
            janela.setSize(tamanho.width, screen.height);
        if (tamanho.width >screen.width)
            janela.setSize(screen.width, tamanho.height);

        janela.setLocation((screen.width-tamanho.width)/2,
                           (screen.height-tamanho.height)/2);
    }
}
