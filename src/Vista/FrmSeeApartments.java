package Vista;

import Model.Apartment;
import Model.Catalog;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;

/**
 * This class creates a frame where we can see all the apartments sorted by their number of visits recieved.
 * @author Cantor
 */
public class FrmSeeApartments extends javax.swing.JDialog {
    private Catalog list;
    /**
     * Creates new form FrmSeeApartments
     */
    public FrmSeeApartments(java.awt.Frame parent, boolean modal, Catalog list) {
        super(parent, modal);
        initComponents();
        this.list = list;
        setList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstCatalog = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(lstCatalog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Sets our list to show the apartments properly sorted.
     */
    private void setList(){
        DefaultListModel model = new DefaultListModel();
        model.clear();
        list.sortByNumberOfVisits();
        ArrayList<Apartment> currentLst = list.getArrayList();
        for (Iterator it = currentLst.iterator(); it.hasNext();){
            Apartment item = (Apartment)it.next();
            model.addElement(item);
        }
        lstCatalog.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstCatalog;
    // End of variables declaration//GEN-END:variables
}
