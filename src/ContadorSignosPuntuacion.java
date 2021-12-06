import javax.swing.*;
import java.awt.*;

public class ContadorSignosPuntuacion {
    public static void main(String[] args) {

        JTextArea textArea = new JTextArea("Introduzca un texto...");
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize( new Dimension( 300, 300 ) );
        JOptionPane.showMessageDialog(null, scrollPane, "Introducir texto", JOptionPane.PLAIN_MESSAGE);


    }
}
