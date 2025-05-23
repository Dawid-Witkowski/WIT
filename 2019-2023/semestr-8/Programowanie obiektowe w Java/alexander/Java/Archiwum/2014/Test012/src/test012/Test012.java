/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test012;

import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author alex
 */
public class Test012 extends javax.swing.JFrame {

    private int MatrixSize = 0;
    private final ParamForm pf; 

    public Test012() {
        initComponents();
        setMatrixSize(3);
        pf = new ParamForm(this);
    }
    
    private void resizeJtable(JTable jtab,int NewMatrixSize)
    {
        DefaultTableModel dtm=(DefaultTableModel)(jtab.getModel());
        //dtm.addColumn(null);
        dtm.addRow(new Double[MatrixSize]);
        for(int y=0;y<NewMatrixSize;++y)
        {
            for(int x=0;x<NewMatrixSize;++x)
            {
                //if((y>=MatrixSize)||(x>=MatrixSize)) jtab.setValueAt(0, y, x);
            }
        }        
    }
    
    public int getMatrixSize()
    { 
        return MatrixSize;
    }
    
    public void setMatrixSize(int NewMatrixSize)
    {
        resizeJtable(AMatrix,NewMatrixSize);
        resizeJtable(BMatrix,NewMatrixSize);
        resizeJtable(CMatrix,NewMatrixSize);
        MatrixSize=NewMatrixSize;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AScroll = new javax.swing.JScrollPane();
        AMatrix = new javax.swing.JTable();
        BScroll = new javax.swing.JScrollPane();
        BMatrix = new javax.swing.JTable();
        CScroll = new javax.swing.JScrollPane();
        CMatrix = new javax.swing.JTable();
        BtnAdd = new javax.swing.JToggleButton();
        BtnSub = new javax.swing.JToggleButton();
        BtnMul = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AMatrix.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Double(0.0),  new Double(0.0),  new Double(0.0)},
                { new Double(0.0),  new Double(0.0),  new Double(0.0)},
                { new Double(0.0),  new Double(0.0),  new Double(0.0)}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        AMatrix.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        AMatrix.setCellSelectionEnabled(true);
        AMatrix.setEditingColumn(0);
        AMatrix.setEditingRow(0);
        AMatrix.setFillsViewportHeight(true);
        AMatrix.setName(""); // NOI18N
        AMatrix.setRowHeight(38);
        AMatrix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatrixMouseDown(evt);
            }
        });
        AMatrix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MatrixFocusGained(evt);
            }
        });
        AScroll.setViewportView(AMatrix);

        BMatrix.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Double(0.0),  new Double(0.0),  new Double(0.0)},
                { new Double(0.0),  new Double(0.0),  new Double(0.0)},
                { new Double(0.0),  new Double(0.0),  new Double(0.0)}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        BMatrix.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        BMatrix.setCellSelectionEnabled(true);
        BMatrix.setEditingColumn(0);
        BMatrix.setEditingRow(0);
        BMatrix.setFillsViewportHeight(true);
        BMatrix.setName(""); // NOI18N
        BMatrix.setRowHeight(38);
        BMatrix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatrixMouseDown(evt);
            }
        });
        BMatrix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MatrixFocusGained(evt);
            }
        });
        BScroll.setViewportView(BMatrix);

        CMatrix.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Double(0.0),  new Double(0.0),  new Double(0.0)},
                { new Double(0.0),  new Double(0.0),  new Double(0.0)},
                { new Double(0.0),  new Double(0.0),  new Double(0.0)}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CMatrix.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        CMatrix.setCellSelectionEnabled(true);
        CMatrix.setEditingColumn(0);
        CMatrix.setEditingRow(0);
        CMatrix.setFillsViewportHeight(true);
        CMatrix.setName(""); // NOI18N
        CMatrix.setRowHeight(38);
        CMatrix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatrixMouseDown(evt);
            }
        });
        CScroll.setViewportView(CMatrix);

        BtnAdd.setSelected(true);
        BtnAdd.setText("+");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnSub.setText("-");
        BtnSub.setDoubleBuffered(true);
        BtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubActionPerformed(evt);
            }
        });

        BtnMul.setText("*");
        BtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                        .addComponent(BScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnMul)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdd)
                    .addComponent(BtnSub)
                    .addComponent(BtnMul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        if(BtnAdd.isSelected())
        {
            BtnSub.setSelected(false);
            BtnMul.setSelected(false);
        }
        else BtnAdd.setSelected(true);
        for(int y=0;y<CMatrix.getRowCount();++y)
        {
            for(int x=0;x<CMatrix.getColumnCount();++x)
            {
                CMatrix.setValueAt
                (
                        (double)(AMatrix.getValueAt(y, x))+
                        (double)(BMatrix.getValueAt(y, x)), 
                        y, x
                );
            }
        }
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubActionPerformed
        if(BtnSub.isSelected())
        {
            BtnAdd.setSelected(false);
            BtnMul.setSelected(false);
        }
        else BtnSub.setSelected(true);
        for(int y=0;y<CMatrix.getRowCount();++y)
        {
            for(int x=0;x<CMatrix.getColumnCount();++x)
            {
                CMatrix.setValueAt
                (
                        (double)(AMatrix.getValueAt(y, x))-
                        (double)(BMatrix.getValueAt(y, x)), 
                        y, x
                );
            }
        }
    }//GEN-LAST:event_BtnSubActionPerformed

    private void BtnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMulActionPerformed
        if(BtnMul.isSelected())
        {
            BtnAdd.setSelected(false);
            BtnSub.setSelected(false);
        }
        else BtnMul.setSelected(true);
        for(int y=0;y<CMatrix.getRowCount();++y)
        {
            for(int x=0;x<CMatrix.getColumnCount();++x)
            {
                double sum=0;
                for(int z=0;z<BMatrix.getRowCount();++z)
                {
                    sum
                    +=
                        (double)(AMatrix.getValueAt(y, z))*
                        (double)(BMatrix.getValueAt(z, x))
                    ;
                }
                CMatrix.setValueAt(sum, y, x);
            }
        }
    }//GEN-LAST:event_BtnMulActionPerformed

    private void MatrixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MatrixFocusGained
        if(BtnAdd.isSelected()) BtnAddActionPerformed(null);
        else if(BtnSub.isSelected()) BtnSubActionPerformed(null);
        else if(BtnMul.isSelected()) BtnMulActionPerformed(null);
    }//GEN-LAST:event_MatrixFocusGained

    private void MatrixMouseDown(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatrixMouseDown
       if(evt.getClickCount()==2) pf.setVisible(true);
    }//GEN-LAST:event_MatrixMouseDown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test012.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test012.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test012.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test012.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test012().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AMatrix;
    private javax.swing.JScrollPane AScroll;
    private javax.swing.JTable BMatrix;
    private javax.swing.JScrollPane BScroll;
    private javax.swing.JToggleButton BtnAdd;
    private javax.swing.JToggleButton BtnMul;
    private javax.swing.JToggleButton BtnSub;
    private javax.swing.JTable CMatrix;
    private javax.swing.JScrollPane CScroll;
    // End of variables declaration//GEN-END:variables
}
