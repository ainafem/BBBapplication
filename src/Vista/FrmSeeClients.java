package Vista;

import Model.Client;
import Model.ClientList;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;

/**
 * This class creates a frame where we can see the clients sorted by their number of visits.
 * @author Cantor
 */
public class FrmSeeClients extends javax.swing.JDialog {
    private ClientList list;
    /**
     * Creates new form FrmSeeClients
     */
    public FrmSeeClients(java.awt.Frame parent, boolean modal, ClientList list) {
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
        lstClients = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(lstClients);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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
     * This method sets the model of our list and prints out all of our clients, sorted by the number of their visits.
     */
    private void setList(){
        DefaultListModel model = new DefaultListModel();
        model.clear();
        list.sortByNumberOfVisits();
        ArrayList<Client> currentLst = list.getArrayList();
        for (Iterator it = currentLst.iterator(); it.hasNext();) {
            Client item = (Client)it.next();
            model.addElement(item);
        }
        lstClients.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstClients;
    // End of variables declaration//GEN-END:variables
}
