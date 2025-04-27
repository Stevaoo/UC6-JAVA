
package com.example.Bag;



import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
/**
 *
 * @author steva
 */

public class view extends JFrame {
    private controller tripController = new controller();
    private JTable table;
    private DefaultTableModel model;

    public view() {
        setTitle("Travel Manager");
        setSize(600, 400); // Tamanho da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a tela
        setLayout(new BorderLayout());

        // Painel superior para o campo de destino e botão de salvar
        JPanel panelTop = new JPanel();
        panelTop.setLayout(new FlowLayout());
        JTextField txtDestination = new JTextField(20);
        JButton btnSave = new JButton("Save Trip");
        panelTop.add(new JLabel("Destination:"));
        panelTop.add(txtDestination);
        panelTop.add(btnSave);

        // Criando a tabela para exibir as viagens
        model = new DefaultTableModel(new String[]{"ID", "Destination"}, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        add(panelTop, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Ação de salvar a viagem
        btnSave.addActionListener(e -> {
            String destination = txtDestination.getText();
            if (!destination.isEmpty()) {
                tripController.createTrip(destination);
                refreshTable();
                txtDestination.setText(""); // Limpa o campo de destino após salvar
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a destination.");
            }
        });

        // Atualiza a tabela com as viagens
        refreshTable();
        setVisible(true);
    }

    // Método para atualizar a tabela com as viagens
    private void refreshTable() {
        model.setRowCount(0); // Limpa a tabela antes de adicionar os dados
        List<model> trips = tripController.getAllTrips();
        for (model t : trips) {
            model.addRow(new Object[]{t.getId(), t.getDestination()});
        }
    }
}
