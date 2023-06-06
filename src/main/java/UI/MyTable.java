package UI;

import javax.swing.*;

public class MyTable extends JTable {


    /**
     * Constructs a default <code>JTable</code> that is initialized with a default
     * data model, a default column model, and a default selection
     * model.
     *
     * @see #createDefaultDataModel
     * @see #createDefaultColumnModel
     * @see #createDefaultSelectionModel
     */
    public MyTable(MyTableModelX MyTableModelX) {
        super(MyTableModelX);
    }
}
