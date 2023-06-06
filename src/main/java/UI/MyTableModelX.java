package UI;

import javax.swing.table.AbstractTableModel;

public class MyTableModelX extends AbstractTableModel {
    private Object[][] data ;
    public MyTableModelX() {
        this.data = new Object[0][0];
    }

    private String[] columnNames = {"类型", "Grpc地址","名称"};

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return data[row][column];
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    public void addRow(Object[] rowData) {
        Object[][] newData = new Object[data.length + 1][getColumnCount()];
        System.arraycopy(data, 0, newData, 0, data.length);
        newData[data.length] = rowData;
        data = newData;
        fireTableDataChanged();
    }

    public void deleteRow(int row) {
        Object[][] newData;
        newData = new Object[data.length - 1][getColumnCount()];
        int newDataIndex;
        newDataIndex = 0;
        for (int i = 0; i < data.length; i++) {
            if (i != row) {
                newData[newDataIndex] = data[i];
                newDataIndex++;
            }
        }
        data = newData;
        fireTableDataChanged();
    }
}
