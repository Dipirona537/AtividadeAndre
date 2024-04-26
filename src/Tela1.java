import javax.swing.*;
import java.awt.*;

public class Tela1 extends JFrame {
    private JTextField nome;
    private JTextField validade;//a

    public Tela1(){
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setTitle("Atividade");
        nome = new JTextField(20);
        validade = new JTextField(20);
        add(nome);
        add(validade);
        pack();
    }
}
