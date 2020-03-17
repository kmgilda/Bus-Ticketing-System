import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
public class CancelTickets extends javax.swing.JFrame {
    Connection conn = null;
    Statement pst=null;
    String username;

    /** Creates new form CancelTickets */
    public CancelTickets() {
        initComponents();
    conn=javaconnect.ConnecrDb();}

    private void close() {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllBookingsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        seeAllBTN = new javax.swing.JButton();
        cancelBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 23)); // NOI18N
        jLabel1.setText("Cancel Tickets.. Fast and Simple.");

        AllBookingsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Passenger Name", "Route", "Bus No.", "Date"
            }
        ));
        jScrollPane1.setViewportView(AllBookingsTable);

        jLabel2.setText("Simply click on the booking you want to cancel and hit Cancel!");

        seeAllBTN.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        seeAllBTN.setText("Click Here to See All Bookings");
        seeAllBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeAllBTNActionPerformed(evt);
            }
        });

        cancelBTN.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cancelBTN.setText("Cancel!");
        cancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTNActionPerformed(evt);
            }
        });

        backBTN.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        backBTN.setText("Back to Menu");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busticketing/base standard.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(seeAllBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seeAllBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seeAllBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeAllBTNActionPerformed
//System.out.println("done");
        try{
       // System.out.println("error step");
    String sql = "select * from "+username+";";
        //System.out.println("done");
   pst = conn.createStatement();
ResultSet rs=pst.executeQuery(sql);
 int j=0;
   int i=0;
   Object[][] data =null;
String[] columnNames = new String[]{"Name","Route","BusNo","Date"};

while(rs.next()==true)
{

String name=rs.getString("Name");
  String route=rs.getString("Route");
 String busno=rs.getString("BusNo");
   String date = rs.getString("Date");
//System.out.println("Completed initialization");
if(i==0){
data = new Object[1][4];
data[0][0] = name;
data[0][1] = route;
data[0][2] = busno;
data[0][3] = date;
AllBookingsTable.setModel(new DefaultTableModel(data,columnNames));
i++;}
  else{
    Object[][] temp = new Object[data.length+1][4];
     //System.out.println("enterred else"+i);
    for( j=0;j<data.length;j++){
        for(int k=0;k<4;k++){
            temp[j][k]=data[j][k];
             //System.out.println("inner for loop execution number "+k);
        }//System.out.println("outer for loop execution number "+j);
       } //System.out.println("Completed for loop in else"+i);
    temp[data.length][0]= name;
    temp[data.length][1] = route;
    temp[data.length][2]= busno;
    temp[data.length][3] = date;
    data = temp;
    AllBookingsTable.setModel(new DefaultTableModel(data,columnNames));
    i++;}
 //System.out.println("Completed if else statment"+i);

  }
        }
         catch(Exception e){
    JOptionPane.showMessageDialog(null, e);}
}//GEN-LAST:event_seeAllBTNActionPerformed

    private void cancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTNActionPerformed
        String name = (String) AllBookingsTable.getValueAt(AllBookingsTable.getSelectedRow(), 0);
        String route = (String) AllBookingsTable.getValueAt(AllBookingsTable.getSelectedRow(), 1);
        String busno = (String) AllBookingsTable.getValueAt(AllBookingsTable.getSelectedRow(), 2);
        String date = (String) AllBookingsTable.getValueAt(AllBookingsTable.getSelectedRow(), 3);
       /*Now to delete the row from users own table and table of bus*/
        String sql1 = "delete from "+username+" where name = '"+name+"' && route = '"+route+"' && BusNo = '"+busno+"' && Date = '"+date+"';";
        String sql2 = "delete from "+busno+" where Pname = '"+name+"' && Date = '"+date+"';";

 try{   pst = conn.createStatement();
        pst.execute(sql1);
        pst.execute(sql2); }
 catch (SQLException e)
            {
               JOptionPane.showMessageDialog(null, e);
            }
        seeAllBTN.doClick();
        JOptionPane.showMessageDialog(null, "Your ticket has been successfully cancelled.\nThank you for using our application.\nDo come again! :)");

    }//GEN-LAST:event_cancelBTNActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
close();
Pg2_Welcome s = new Pg2_Welcome();
s.username=username;
s.setVisible(true);        // TODO add your handling code here:
}//GEN-LAST:event_backBTNActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllBookingsTable;
    private javax.swing.JButton backBTN;
    private javax.swing.JButton cancelBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton seeAllBTN;
    // End of variables declaration//GEN-END:variables

}
