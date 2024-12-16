package Paquete1;

/**
 *
 * @author Victor
 */
import javax.swing.*;
import java.awt.*;

public class Vicman extends JComponent {

    private JLabel label;
    private JTextField textField;

    public Vicman() {
        // Configurar el layout del componente
        setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

        // Inicializar la etiqueta con un texto predeterminado
        label = new JLabel("Etiqueta:");

        // Inicializar el campo de texto con un tamaño predeterminado
        textField = new JTextField(15);

        // Añadir los componentes al LabelTextField
        add(label);
        add(textField);
    }

    // Método para establecer el texto de la etiqueta
    public void setLabelText(String text) {
        label.setText(text);
    }

    // Método para obtener el texto del JTextField
    public String getText() {
        return textField.getText();
    }

    // Método para establecer el texto del JTextField
    public void setText(String text) {
        textField.setText(text);
    }

    // Método para obtener el JTextField si se necesita acceder directamente
    public JTextField getTextField() {
        return textField;
    }
}

