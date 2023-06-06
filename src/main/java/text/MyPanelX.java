package text;

import UI.MyTableModelX;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanelX extends JPanel {

    private MyTableModelX tableModel;
    public JTable table;
    private JButton addButton;
    private JButton deleteButton;
    private JComboBox<String> comboBox;
    private JTextField textField;

    /**
     * Creates a new <code>JPanel</code> with a double buffer
     * and a flow layout.
     */
    public MyPanelX() {
        tableModel = new MyTableModelX();
        table = new JTable(tableModel);
        addButton = new JButton("Add");
        deleteButton = new JButton("Delete Selected");
        comboBox = new JComboBox<>(new String[]{"Data 1", "Data 2", "Data 3"});
        textField = new JTextField(10);

        JScrollPane scrollPane = new JScrollPane(table);


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedData = (String) comboBox.getSelectedItem();
                String value = textField.getText();
                if (selectedData != null && value != null && !value.isEmpty()) {
                    tableModel.addRow(new Object[]{selectedData, value,"名字"});
                    textField.setText("");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] selectedRows = table.getSelectedRows();
                if (selectedRows.length > 0) {
                    for (int i = selectedRows.length - 1; i >= 0; i--) {
                        tableModel.deleteRow(selectedRows[i]);
                    }
                }
            }
        });

        add(comboBox);
        add(textField);
        add(addButton);
        add(deleteButton);
        add(scrollPane);
    }
}



