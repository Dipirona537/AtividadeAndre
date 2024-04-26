import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class TelaCadastro extends JFrame {

    private JTable table;

    public TelaCadastro(List<Item> cadastros) {
        setTitle("Lista de Cadastros");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        initComponents(cadastros);

        setVisible(true);
    }

    private void initComponents(List<Item> cadastros) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Validade");
        model.addColumn("Nome");

        for (Item item : cadastros) {
            model.addRow(new Object[]{item.getValidade(), item.getNome()});
        }

        table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
}
