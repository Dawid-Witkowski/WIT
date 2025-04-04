
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bylina
 */
public class graMain extends javax.swing.JFrame {
    private Animal Root = new Animal("kot");
    private static final String filePath = "Animal.data.bin";
    /**
     * Creates new form graMain
     */
    public graMain() {
        initComponents();
        Root.LoadFromFile(filePath);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Wybierz zwierzątko i naciśnij przycisk");

        BtnStart.setText("Start");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(BtnStart))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnStart)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Root.SaveToFile(filePath);
    }//GEN-LAST:event_formWindowClosing

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
        Animal current = Root;
        String[] options = new String[]{"nie", "tak"};
        while(true){
            int answer = JOptionPane.showOptionDialog(this, current.getQuestion(), "Proszę o odpowiedź: ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
            if(current.isQuestion()){
                current = current.getAnswers()[answer];
            }
            else {
                if(answer == 0){
                    String oldAnimal = current.getText();
                    String newAnimal = JOptionPane.showInputDialog(this, "Proszę podać o jakim zwierzątku Pan/Pani myśli?");
                    String newQuestion = JOptionPane.showInputDialog(this, "Proszę podać pytanie, za pomocą którego da się odróżnić "+oldAnimal+" od "+newAnimal);
                    String text
                    =
                       "Jeżeli na pytanie \""+newQuestion+"?\" dostanę odpowiedź twierdzącą to będzie to:"
                    ;
                    String[] opt=new String[] { oldAnimal, newAnimal };
                    answer = JOptionPane.showOptionDialog(this, text, "Proszę o odpowiedź: ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, null);
                    boolean yesno=(answer==0);
                    current.ReplaceWithQuestion(newQuestion, newAnimal, yesno);
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(this, "Wygrałem!", "Koniec gry", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
        }
    }//GEN-LAST:event_BtnStartActionPerformed

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
            java.util.logging.Logger.getLogger(graMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(graMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(graMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(graMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new graMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnStart;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
