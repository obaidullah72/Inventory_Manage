package fyproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class startup extends javax.swing.JFrame {

    public startup() {
        initComponents();
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dm.width/2-this.getSize().width/2,dm.height/2-this.getSize().height/2);
        this.setBackground(new Color (0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jprogress = new javax.swing.JLabel();
        jbar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fyproject/ELB_Logo_2_5.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fyproject/inventory (4).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(69, 112, 169));
        jLabel3.setText("Inventory System");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jprogress.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jprogress.setForeground(new java.awt.Color(69, 112, 169));
        jprogress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jprogress.setText("0%");
        jPanel1.add(jprogress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 100, 40));

        jbar.setBackground(new java.awt.Color(69, 112, 169));
        jPanel1.add(jbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 370, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 540, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
startup sc = new startup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sc.setVisible(true);
//new Screeen(). setvisible (true);
                        }
        });
        SignIn g = new SignIn();
        try{
            for(int i=0; i<=100;i++){
                Thread.sleep(40);
                sc.jbar.setValue(i);
                sc.jprogress.setText(Integer.toString(i) +"  %");
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        new startup().setVisible(false);
            g.setVisible(true);
            sc.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jbar;
    private javax.swing.JLabel jprogress;
    // End of variables declaration//GEN-END:variables
}
