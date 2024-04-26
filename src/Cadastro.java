import javax.swing.*;
import java.awt.*;

public class Cadastro extends JFrame {
    private JTextField nome;
    private JTextField validade;//a

    public Cadastro(){
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
