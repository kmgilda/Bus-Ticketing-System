
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


public class Pg2_Welcome extends javax.swing.JFrame {

   String username, h;
    /** Creates new form Pg2_Welcome */
    public Pg2_Welcome() {
      
       initComponents();
      
    }

     public void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        w = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BookingRedirectBTN = new javax.swing.JButton();
        CancelingRedirectBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        w.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        w.setText("Welcome..");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("How can we help you?");

        BookingRedirectBTN.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BookingRedirectBTN.setText("Book Tickets");
        BookingRedirectBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingRedirectBTNActionPerformed(evt);
            }
        });

        CancelingRedirectBTN.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CancelingRedirectBTN.setText("Cancel Tickets");
        CancelingRedirectBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelingRedirectBTNActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busticketing/base standard.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(w)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CancelingRedirectBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BookingRedirectBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(w)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(BookingRedirectBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(CancelingRedirectBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookingRedirectBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingRedirectBTNActionPerformed
         close();
Booking s = new Booking();
s.username=username;
s.setVisible(true);

}//GEN-LAST:event_BookingRedirectBTNActionPerformed

    private void CancelingRedirectBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelingRedirectBTNActionPerformed
close();
CancelTickets s = new CancelTickets();
s.username=username;
s.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_CancelingRedirectBTNActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
 // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Pg2_Welcome().setVisible(true);

            }
        });
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookingRedirectBTN;
    private javax.swing.JButton CancelingRedirectBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel w;
    // End of variables declaration//GEN-END:variables

}
