
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class BridgeMainForm extends javax.swing.JFrame
{
   private ArrayList<Shape> list=new ArrayList<>();
   private ShapesBridgeToXml xmlbridge;
   /**
    * Creates new form BridgeMainForm
    */
   public BridgeMainForm()
   {
      initComponents();
      xmlbridge=new ShapesBridgeToXml(taXml);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jComboBox1 = new javax.swing.JComboBox<>();
      tfParameters = new javax.swing.JTextField();
      btnAdd = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jList1 = new javax.swing.JList<>();
      jPanel1 = new javax.swing.JPanel();
      jScrollPane2 = new javax.swing.JScrollPane();
      taXml = new javax.swing.JTextArea();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

      tfParameters.setText("50 50 40");

      btnAdd.setText("Dodaj");
      btnAdd.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            btnAddActionPerformed(evt);
         }
      });

      jList1.setModel(new javax.swing.AbstractListModel<String>()
      {
         String[] strings = { "Shapes" };
         public int getSize() { return strings.length; }
         public String getElementAt(int i) { return strings[i]; }
      });
      jScrollPane1.setViewportView(jList1);

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 279, Short.MAX_VALUE)
      );

      taXml.setColumns(20);
      taXml.setRows(5);
      jScrollPane2.setViewportView(taXml);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jScrollPane1)
               .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnAdd)
               .addComponent(tfParameters, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(tfParameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btnAdd)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jScrollPane1))
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
   {//GEN-HEADEREND:event_btnAddActionPerformed
      list.add(new Circle(tfParameters.getText()));
      xmlbridge.proceed(list);
   }//GEN-LAST:event_btnAddActionPerformed

   /**
    * @param args the command line arguments
    */
   public static void main(String args[])
   {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
       */
      try
      {
         for(javax.swing.UIManager.LookAndFeelInfo info:javax.swing.UIManager.getInstalledLookAndFeels())
            if("Nimbus".equals(info.getName()))
            {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
      }
      catch(ClassNotFoundException ex)
      {
         java.util.logging.Logger.getLogger(BridgeMainForm.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
      }
      catch(InstantiationException ex)
      {
         java.util.logging.Logger.getLogger(BridgeMainForm.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
      }
      catch(IllegalAccessException ex)
      {
         java.util.logging.Logger.getLogger(BridgeMainForm.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
      }
      catch(javax.swing.UnsupportedLookAndFeelException ex)
      {
         java.util.logging.Logger.getLogger(BridgeMainForm.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            new BridgeMainForm().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnAdd;
   private javax.swing.JComboBox<String> jComboBox1;
   private javax.swing.JList<String> jList1;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JTextArea taXml;
   private javax.swing.JTextField tfParameters;
   // End of variables declaration//GEN-END:variables
}
