import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
public class Booking extends javax.swing.JFrame {

        int S1roundno=1;
        int S2roundno=1;
        int S3roundno=1;
        int S4roundno=1;
        int S5roundno=1;
        int S6roundno=1;
        int S7roundno=1;
        int S8roundno=1;
        int S9roundno=1;
        int S10roundno=1;
        int S11roundno=1;
        int S12roundno=1;
        int S13roundno=1;
        int S14roundno=1;
        int S15roundno=1;
        int S16roundno=1;
        int S17roundno=1;
        int S18roundno=1;
        int S19roundno=1;
        int S20roundno=1;
        int S21roundno=1;
        int S22roundno=1;
        int S23roundno=1;
        int S24roundno=1;
        int S25roundno=1;
        int S26roundno=1;
        int S27roundno=1;
        int S28roundno=1;
        int S29roundno=1;
        int S30roundno=1;
        int S31roundno=1;
        int S32roundno=1;
        int S33roundno=1;
        int S34roundno=1;
        int S35roundno=1;
        int S36roundno=1;
        int S37roundno=1;
        int S38roundno=1;
        int S39roundno=1;
        int S40roundno=1;
        String date, username,route;
        Object[][] busestabledata =null;
        String selbus;
        int price;
       

    Connection conn=null;
//    ResultSet rs=null;
    Statement pst=null;
    int i = 0, selno=0;
    Object[][] data =null;
    
    public Booking() {
        initComponents();
       setSize(720,700);

        conn=javaconnect.ConnecrDb();
 }

    private void close() {
         WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TBSeat1 = new javax.swing.JToggleButton();
        TBSeat2 = new javax.swing.JToggleButton();
        TBSeat3 = new javax.swing.JToggleButton();
        TBSeat4 = new javax.swing.JToggleButton();
        TBSeat5 = new javax.swing.JToggleButton();
        TBSeat6 = new javax.swing.JToggleButton();
        TBSeat7 = new javax.swing.JToggleButton();
        TBSeat9 = new javax.swing.JToggleButton();
        TBSeat10 = new javax.swing.JToggleButton();
        TBSeat11 = new javax.swing.JToggleButton();
        TBSeat12 = new javax.swing.JToggleButton();
        TBSeat13 = new javax.swing.JToggleButton();
        TBSeat14 = new javax.swing.JToggleButton();
        TBSeat15 = new javax.swing.JToggleButton();
        TBSeat16 = new javax.swing.JToggleButton();
        TBSeat17 = new javax.swing.JToggleButton();
        TBSeat21 = new javax.swing.JToggleButton();
        TBSeat25 = new javax.swing.JToggleButton();
        TBSeat29 = new javax.swing.JToggleButton();
        TBSeat33 = new javax.swing.JToggleButton();
        TBSeat37 = new javax.swing.JToggleButton();
        TBSeat18 = new javax.swing.JToggleButton();
        TBSeat22 = new javax.swing.JToggleButton();
        TBSeat26 = new javax.swing.JToggleButton();
        TBSeat30 = new javax.swing.JToggleButton();
        TBSeat34 = new javax.swing.JToggleButton();
        TBSeat38 = new javax.swing.JToggleButton();
        TBSeat19 = new javax.swing.JToggleButton();
        TBSeat20 = new javax.swing.JToggleButton();
        TBSeat23 = new javax.swing.JToggleButton();
        TBSeat24 = new javax.swing.JToggleButton();
        TBSeat27 = new javax.swing.JToggleButton();
        TBSeat28 = new javax.swing.JToggleButton();
        TBSeat31 = new javax.swing.JToggleButton();
        TBSeat32 = new javax.swing.JToggleButton();
        TBSeat35 = new javax.swing.JToggleButton();
        TBSeat36 = new javax.swing.JToggleButton();
        TBSeat39 = new javax.swing.JToggleButton();
        TBSeat40 = new javax.swing.JToggleButton();
        TBSeat8 = new javax.swing.JToggleButton();
        bookBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        CBroute = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateDC = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        PassengerDetailsTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        BusesTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AddPassengerButton = new javax.swing.JButton();
        seatavBT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 2, 13)); // NOI18N
        jLabel6.setText("Select your favourite seats:");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 153, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBSeat1.setText("1");
        TBSeat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat1ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 50, -1));

        TBSeat2.setText("2");
        TBSeat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat2ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 50, -1));

        TBSeat3.setText("3");
        TBSeat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat3ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 50, -1));

        TBSeat4.setText("4");
        TBSeat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat4ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 50, -1));

        TBSeat5.setText("5");
        TBSeat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat5ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 50, -1));

        TBSeat6.setText("6");
        TBSeat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat6ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 50, -1));

        TBSeat7.setText("7");
        TBSeat7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat7ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 50, -1));

        TBSeat9.setText("9");
        TBSeat9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat9ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 50, -1));

        TBSeat10.setText("10");
        TBSeat10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat10ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        TBSeat11.setText("11");
        TBSeat11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat11ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        TBSeat12.setText("12");
        TBSeat12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat12ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        TBSeat13.setText("13");
        TBSeat13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat13ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        TBSeat14.setText("14");
        TBSeat14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat14ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        TBSeat15.setText("15");
        TBSeat15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat15ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        TBSeat16.setText("16");
        TBSeat16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat16ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        TBSeat17.setText("17");
        TBSeat17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat17ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        TBSeat21.setText("21");
        TBSeat21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat21ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        TBSeat25.setText("25");
        TBSeat25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat25ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        TBSeat29.setText("29");
        TBSeat29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat29ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat29, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        TBSeat33.setText("33");
        TBSeat33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat33ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        TBSeat37.setText("37");
        TBSeat37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat37ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        TBSeat18.setText("18");
        TBSeat18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat18ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        TBSeat22.setText("22");
        TBSeat22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat22ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        TBSeat26.setText("26");
        TBSeat26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat26ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat26, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        TBSeat30.setText("30");
        TBSeat30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat30ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat30, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        TBSeat34.setText("34");
        TBSeat34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat34ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat34, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        TBSeat38.setText("38");
        TBSeat38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat38ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        TBSeat19.setText("19");
        TBSeat19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat19ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        TBSeat20.setText("20");
        TBSeat20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat20ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        TBSeat23.setText("23");
        TBSeat23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat23ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        TBSeat24.setText("24");
        TBSeat24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat24ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        TBSeat27.setText("27");
        TBSeat27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat27ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat27, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        TBSeat28.setText("28");
        TBSeat28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat28ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        TBSeat31.setText("31");
        TBSeat31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat31ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        TBSeat32.setText("32");
        TBSeat32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat32ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat32, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        TBSeat35.setText("35");
        TBSeat35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat35ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        TBSeat36.setText("36");
        TBSeat36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat36ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        TBSeat39.setText("39");
        TBSeat39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat39ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        TBSeat40.setText("40");
        TBSeat40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat40ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        TBSeat8.setText("8");
        TBSeat8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSeat8ActionPerformed(evt);
            }
        });
        jPanel1.add(TBSeat8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 50, -1));

        bookBT.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bookBT.setText("BOOK NOW!");
        bookBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBTActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 23)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Go ahead! Book your tickets!");

        CBroute.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "Mumbai to Delhi", "Delhi to Kolkata", "Kolkata to Bangalore", "Bangalore to Mumbai", " " }));
        CBroute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBrouteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 13)); // NOI18N
        jLabel4.setText("Enter Passenger Details Here:");

        jLabel5.setText("Note: Seat Number will be entered automatically.");

        dateDC.setDateFormatString("yyyy-MM-dd");

        PassengerDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Seat No."
            }
        ));
        jScrollPane2.setViewportView(PassengerDetailsTable);

        BusesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null},
                {"", "", "", null}
            },
            new String [] {
                "#", "Bus Name", "AC", "Price (in Rs)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BusesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BusesTable);
        BusesTable.getColumnModel().getColumn(0).setMinWidth(50);
        BusesTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        BusesTable.getColumnModel().getColumn(0).setMaxWidth(50);
        BusesTable.getColumnModel().getColumn(2).setMinWidth(50);
        BusesTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        BusesTable.getColumnModel().getColumn(2).setMaxWidth(50);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 2, 13)); // NOI18N
        jLabel3.setText("Date:");
        jLabel3.setMaximumSize(new java.awt.Dimension(480, 300));
        jLabel3.setMinimumSize(new java.awt.Dimension(436, 317));
        jLabel3.setPreferredSize(new java.awt.Dimension(436, 317));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 2, 13)); // NOI18N
        jLabel2.setText("Route:");

        AddPassengerButton.setText("Add Passenger");
        AddPassengerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPassengerButtonActionPerformed(evt);
            }
        });

        seatavBT.setText("Check Seat Availability");
        seatavBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatavBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBroute, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateDC, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddPassengerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatavBT)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(CBroute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(seatavBT)
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddPassengerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel2);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busticketing/base standard.PNG"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setText("BACK TO MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(bookBT, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBrouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBrouteActionPerformed
    route = (String) CBroute.getSelectedItem();

    try{
       // System.out.println("error step");
    String sql = "select * from buses where Route='"+route+"';";
       // System.out.println("");
   pst = conn.createStatement();
ResultSet rs=pst.executeQuery(sql);
   int j=0;
   int i=0;
   while(rs.next()==true)
        {
            //System.out.println("execute1");
            j=0;
            String un=rs.getString("BusNo");

            String ps=rs.getString("BusName");
               String ps2=rs.getString("AC");
         BusesTable.setValueAt(un,i,j);
            j++;
            BusesTable.setValueAt(ps,i,j);
            j++;
            BusesTable.setValueAt(ps2,i,j);
            i++;
        //    System.out.println(un+" "+ps);
        }
   BusesTable.setValueAt("999", 0, 3);
   BusesTable.setValueAt("575", 1, 3);




   // .setModel(DbUtils.resultSetToTableModel(rs));
}

    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}

// TODO add your handling code here:
}//GEN-LAST:event_CBrouteActionPerformed

    private void AddPassengerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPassengerButtonActionPerformed
if(date.equals("")||BusesTable.getSelectedRow()==-1)
 {JOptionPane.showMessageDialog(null, "Date or Bus hasn't been selected.");}
  else{
 String[] columnNames = new String[]{"Name","Seat No."};
        if(i==0){

data = new Object[1][2];
data[0][0] = JOptionPane.showInputDialog("Enter Passenger Name");
data[0][1] = null;
PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
i++;}
  else{
    Object[][] temp = new Object[data.length+1][2];
    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            temp[j][k]=data[j][k];
        }
    }
    temp[data.length][0]= JOptionPane.showInputDialog("Enter Passenger Name");
    temp[data.length][1] = null;
    data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
    i++;

     price = Integer.parseInt((String) BusesTable.getValueAt(BusesTable.getSelectedRow(), 3));
   bookBT.setText("Pay Rs"+price*(i)+" and Book Now!");
price = price*i;
  }
  }
                   
// TODO add your handling code here:
    }//GEN-LAST:event_AddPassengerButtonActionPerformed

    private void TBSeat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat1ActionPerformed
if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat1.setSelected(false);}
else{
{if(S1roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=1;}
            else {temp[j][k]=data[j][k];}
        }}
         
       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S1roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)1)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        //jTextField1.setText("Loop Executed"+k);
            }
         }}//data[j][k].toString()
          
            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S1roundno++;
        }}

            
}
   // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat1ActionPerformed

    private void TBSeat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat2ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat2.setSelected(false);}
else{
    if(S2roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};

         Object[][] temp = new Object[data.length][2];

     for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=2;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S2roundno++;

       }


   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)2)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        //jTextField1.setText("Loop Executed"+k);
            }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S2roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat2ActionPerformed

    private void TBSeat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat3ActionPerformed
     if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat3.setSelected(false);}
else{
    if(S3roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=3;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S3roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)3)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        //jTextField1.setText("Loop Executed"+k);
            }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S3roundno++;
        }}
//TODO add your handling code here:
    }//GEN-LAST:event_TBSeat3ActionPerformed

    private void TBSeat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat4ActionPerformed
     if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat4.setSelected(false);}
else{
    if(S4roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=4;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S4roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)4)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        //jTextField1.setText("Loop Executed"+k);
            }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S4roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat4ActionPerformed

    private void TBSeat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat5ActionPerformed
     if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat5.setSelected(false);}
else{
    if(S5roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=5;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S5roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)5)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S5roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat5ActionPerformed

    private void TBSeat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat6ActionPerformed
     if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat6.setSelected(false);}
else{
    if(S6roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=6;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S6roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)6)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S6roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat6ActionPerformed

    private void TBSeat7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat7ActionPerformed
       if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat7.setSelected(false);}
else{
    if(S7roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=7;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S7roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)7)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S7roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat7ActionPerformed

    private void TBSeat8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat8ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat8.setSelected(false);}
else{
    if(S8roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=8;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S8roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)8)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S8roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat8ActionPerformed

    private void TBSeat9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat9ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat9.setSelected(false);}
else{
    if(S9roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=9;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S9roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)9)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
       }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S9roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat9ActionPerformed

    private void TBSeat10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat10ActionPerformed
       if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat10.setSelected(false);}
else{
    if(S10roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=10;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S10roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)10)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S10roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat10ActionPerformed

    private void TBSeat11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat11ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat11.setSelected(false);}
else{
    if(S11roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=11;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S11roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)11)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S11roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat11ActionPerformed

    private void TBSeat12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat12ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat12.setSelected(false);}
else{
    if(S12roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=12;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S12roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)12)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S12roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat12ActionPerformed

    private void TBSeat13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat13ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat13.setSelected(false);}
else{
    if(S13roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=13;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S13roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)13)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S13roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat13ActionPerformed

    private void TBSeat14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat14ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat14.setSelected(false);}
else{
    if(S14roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=14;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S14roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)14)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S14roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat14ActionPerformed

    private void TBSeat15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat15ActionPerformed
       if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat15.setSelected(false);}
else{
    if(S15roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=15;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S15roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)15)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S15roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat15ActionPerformed

    private void TBSeat16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat16ActionPerformed
       if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat16.setSelected(false);}
else{
    if(S16roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=16;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S16roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)16)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S16roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat16ActionPerformed

    private void TBSeat17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat17ActionPerformed
       if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat17.setSelected(false);}
else{
    if(S17roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=17;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S1roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)17)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S17roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat17ActionPerformed

    private void TBSeat18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat18ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat18.setSelected(false);}
else{
    if(S18roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=18;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S18roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)18)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S18roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat18ActionPerformed

    private void TBSeat19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat19ActionPerformed
    if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat19.setSelected(false);}
else{
    if(S19roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=19;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S19roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)19)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S19roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat19ActionPerformed

    private void TBSeat20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat20ActionPerformed
     if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat20.setSelected(false);}
else{
    if(S20roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=20;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S20roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)20)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
       }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S20roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat20ActionPerformed

    private void TBSeat21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat21ActionPerformed
     if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat21.setSelected(false);}
else{
    if(S21roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=21;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S21roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)21)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S21roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat21ActionPerformed

    private void TBSeat22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat22ActionPerformed
       if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat22.setSelected(false);}
else{
    if(S22roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=22;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S22roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)22)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S22roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat22ActionPerformed

    private void TBSeat23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat23ActionPerformed
     if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat23.setSelected(false);}
else{
    if(S23roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=23;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S23roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)23)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S23roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat23ActionPerformed

    private void TBSeat24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat24ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat24.setSelected(false);}
else{
    if(S24roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=24;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S24roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)24)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S24roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat24ActionPerformed

    private void TBSeat25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat25ActionPerformed
     if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat25.setSelected(false);}
else{
    if(S25roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=25;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S25roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)25)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S25roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat25ActionPerformed

    private void TBSeat26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat26ActionPerformed
       if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat26.setSelected(false);}
else{
    if(S26roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=26;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S26roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)26)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S26roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat26ActionPerformed

    private void TBSeat27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat27ActionPerformed
       if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat27.setSelected(false);}
else{
    if(S27roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=27;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S27roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)27)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S27roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat27ActionPerformed

    private void TBSeat28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat28ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat28.setSelected(false);}
else{
    if(S28roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=28;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S28roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)28)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
       }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S28roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat28ActionPerformed

    private void TBSeat29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat29ActionPerformed
       if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat29.setSelected(false);}
else{
    if(S29roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=29;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S29roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)29)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
       }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S29roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat29ActionPerformed

    private void TBSeat30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat30ActionPerformed
        if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat30.setSelected(false);}
else{
    if(S30roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=30;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S30roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)30)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
       }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S30roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat30ActionPerformed

    private void TBSeat31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat31ActionPerformed
       if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat31.setSelected(false);}
else{
    if(S31roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=31;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S31roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)31)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S31roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat31ActionPerformed

    private void TBSeat32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat32ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat32.setSelected(false);}
else{
    if(S32roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=32;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S32roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)32)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S32roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat32ActionPerformed

    private void TBSeat33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat33ActionPerformed
     if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat33.setSelected(false);}
else{
    if(S33roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=33;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S33roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)33)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S33roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat33ActionPerformed

    private void TBSeat34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat34ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat34.setSelected(false);}
else{
    if(S34roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=34;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S34roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)34)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S34roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat34ActionPerformed

    private void TBSeat35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat35ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat35.setSelected(false);}
else{
    if(S35roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=35;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S35roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)35)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S35roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat35ActionPerformed

    private void TBSeat36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat36ActionPerformed
        if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat36.setSelected(false);}
else{
    if(S36roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=36;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S36roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)36)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S36roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat36ActionPerformed

    private void TBSeat37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat37ActionPerformed
       if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat37.setSelected(false);}
else{
    if(S37roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=37;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S37roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)37)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S37roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat37ActionPerformed

    private void TBSeat38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat38ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat38.setSelected(false);}
else{
    if(S38roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=38;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S38roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)38)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S38roundno++;
        }}
 // TODO add your handling code here:
    }//GEN-LAST:event_TBSeat38ActionPerformed

    private void TBSeat39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat39ActionPerformed
     if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat39.setSelected(false);}
else{
    if(S39roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=39;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S39roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)39)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S39roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat39ActionPerformed

    private void TBSeat40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSeat40ActionPerformed
      if(PassengerDetailsTable.getRowCount()==0)
{JOptionPane.showMessageDialog(null, "Please add passenger before selecting seats");
TBSeat40.setSelected(false);} //inplace of TBseat40 put the desired seat button name
else{
    if(S40roundno%2!=0){
   String[] columnNames = new String[]{"Name","Seat No."};
      Object[][] temp = new Object[data.length][2];

    for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(j==selno&&k==1){temp[j][k]=40;}
            else {temp[j][k]=data[j][k];}
        }}

       //temp[selno][1]=1;
        data = temp;
    PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));
      ++selno; S40roundno++;}
   else
   {  for(int j=0;j<data.length;j++){
        for(int k=0;k<2;k++){
            if(data[j][k]==(Object)40)//Not being executed! Because data[j][k] is never equal to "1" its equal to 1
            {data[j][k]="";
        }
         }}//data[j][k].toString()

            String[] columnNames = new String[]{"Name","Seat No."};
             PassengerDetailsTable.setModel(new DefaultTableModel(data,columnNames));selno--;S40roundno++;
        }}
// TODO add your handling code here:
    }//GEN-LAST:event_TBSeat40ActionPerformed

    private void seatavBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatavBTActionPerformed
 date = ((JTextField)dateDC.getDateEditor().getUiComponent()).getText();
  if(date.equals("")||BusesTable.getSelectedRow()==-1)
 {JOptionPane.showMessageDialog(null, "Date or Bus hasn't been selected.");}
  else{
 selbus = (String) BusesTable.getValueAt(BusesTable.getSelectedRow(), 0);


 String sql = "select * from "+selbus+" where date = '"+date+"';";

 try{
 pst = conn.createStatement();
ResultSet rs=pst.executeQuery(sql);

TBSeat1.setSelected(false); TBSeat1.setEnabled(true);
TBSeat2.setSelected(false); TBSeat2.setEnabled(true);
TBSeat3.setSelected(false); TBSeat3.setEnabled(true);
TBSeat4.setSelected(false); TBSeat4.setEnabled(true);
TBSeat5.setSelected(false); TBSeat5.setEnabled(true);
TBSeat6.setSelected(false); TBSeat6.setEnabled(true);
TBSeat7.setSelected(false); TBSeat7.setEnabled(true);
TBSeat8.setSelected(false); TBSeat8.setEnabled(true);
TBSeat9.setSelected(false); TBSeat9.setEnabled(true);
TBSeat10.setSelected(false); TBSeat10.setEnabled(true);
TBSeat11.setSelected(false); TBSeat11.setEnabled(true);
TBSeat12.setSelected(false); TBSeat12.setEnabled(true);
TBSeat13.setSelected(false); TBSeat13.setEnabled(true);
TBSeat14.setSelected(false); TBSeat14.setEnabled(true);
TBSeat15.setSelected(false); TBSeat15.setEnabled(true);
TBSeat16.setSelected(false); TBSeat16.setEnabled(true);
TBSeat17.setSelected(false); TBSeat17.setEnabled(true);
TBSeat18.setSelected(false); TBSeat18.setEnabled(true);
TBSeat19.setSelected(false); TBSeat19.setEnabled(true);
TBSeat20.setSelected(false); TBSeat20.setEnabled(true);
TBSeat21.setSelected(false); TBSeat21.setEnabled(true);
TBSeat22.setSelected(false); TBSeat22.setEnabled(true);
TBSeat23.setSelected(false); TBSeat23.setEnabled(true);
TBSeat24.setSelected(false); TBSeat24.setEnabled(true);
TBSeat25.setSelected(false); TBSeat25.setEnabled(true);
TBSeat26.setSelected(false); TBSeat26.setEnabled(true);
TBSeat27.setSelected(false); TBSeat27.setEnabled(true);
TBSeat28.setSelected(false); TBSeat28.setEnabled(true);
TBSeat29.setSelected(false); TBSeat29.setEnabled(true);
TBSeat30.setSelected(false); TBSeat30.setEnabled(true);
TBSeat31.setSelected(false); TBSeat31.setEnabled(true);
TBSeat32.setSelected(false); TBSeat32.setEnabled(true);
TBSeat33.setSelected(false); TBSeat33.setEnabled(true);
TBSeat34.setSelected(false); TBSeat34.setEnabled(true);
TBSeat35.setSelected(false); TBSeat35.setEnabled(true);
TBSeat36.setSelected(false); TBSeat36.setEnabled(true);
TBSeat37.setSelected(false); TBSeat37.setEnabled(true);
TBSeat38.setSelected(false); TBSeat38.setEnabled(true);
TBSeat39.setSelected(false); TBSeat39.setEnabled(true);
TBSeat40.setSelected(false); TBSeat40.setEnabled(true);


        while(rs.next()){
   int sn = rs.getInt("SeatNo");
   
   if(sn==1)
   {TBSeat1.setSelected(true); TBSeat1.setEnabled(false);}
    if(sn==2)
   {TBSeat2.setSelected(true); TBSeat2.setEnabled(false);}
   if(sn==3)
   {TBSeat3.setFocusable(false); TBSeat3.setEnabled(false);}
   if(sn==4)
   {TBSeat4.setFocusable(false); TBSeat4.setEnabled(false);}
    if(sn==5)
   {TBSeat5.setFocusable(false); TBSeat5.setEnabled(false);}
   if(sn==6)
   {TBSeat6.setFocusable(false); TBSeat6.setEnabled(false);}
    if(sn==7)
   {TBSeat7.setFocusable(false); TBSeat7.setEnabled(false);}
   if(sn==8)
   {TBSeat8.setFocusable(false); TBSeat8.setEnabled(false);}
    if(sn==9)
   {TBSeat9.setFocusable(false); TBSeat9.setEnabled(false);}
    if(sn==10)
   {TBSeat10.setFocusable(false); TBSeat10.setEnabled(false);}

    if(sn==11)
   {TBSeat11.setFocusable(false); TBSeat11.setEnabled(false);}
    if(sn==12)
   {TBSeat12.setFocusable(false); TBSeat12.setEnabled(false);}
   if(sn==13)
   {TBSeat13.setFocusable(false); TBSeat13.setEnabled(false);}
   if(sn==14)
   {TBSeat14.setFocusable(false); TBSeat14.setEnabled(false);}
    if(sn==15)
   {TBSeat15.setFocusable(false); TBSeat15.setEnabled(false);}
   if(sn==16)
   {TBSeat16.setFocusable(false); TBSeat16.setEnabled(false);}
    if(sn==17)
   {TBSeat17.setFocusable(false); TBSeat17.setEnabled(false);}
   if(sn==18)
   {TBSeat18.setFocusable(false); TBSeat18.setEnabled(false);}
    if(sn==19)
   {TBSeat19.setFocusable(false); TBSeat19.setEnabled(false);}
    if(sn==20)
   {TBSeat20.setFocusable(false); TBSeat20.setEnabled(false);}

    if(sn==21)
   {TBSeat21.setFocusable(false); TBSeat21.setEnabled(false);}
    if(sn==22)
   {TBSeat22.setFocusable(false); TBSeat22.setEnabled(false);}
   if(sn==23)
   {TBSeat23.setFocusable(false); TBSeat23.setEnabled(false);}
    if(sn==23)
   {TBSeat23.setFocusable(false); TBSeat23.setEnabled(false);}
   if(sn==24)
   {TBSeat24.setFocusable(false); TBSeat24.setEnabled(false);}
    if(sn==25)
   {TBSeat25.setFocusable(false); TBSeat25.setEnabled(false);}
   if(sn==26)
   {TBSeat26.setFocusable(false); TBSeat26.setEnabled(false);}
    if(sn==27)
   {TBSeat27.setFocusable(false); TBSeat27.setEnabled(false);}
   if(sn==28)
   {TBSeat28.setFocusable(false); TBSeat28.setEnabled(false);}
    if(sn==29)
   {TBSeat29.setFocusable(false); TBSeat29.setEnabled(false);}
    if(sn==30)
   {TBSeat30.setFocusable(false); TBSeat30.setEnabled(false);}

    if(sn==31)
   {TBSeat31.setFocusable(false); TBSeat31.setEnabled(false);}
    if(sn==32)
   {TBSeat32.setFocusable(false); TBSeat32.setEnabled(false);}
   if(sn==33)
   {TBSeat33.setFocusable(false); TBSeat33.setEnabled(false);}
   if(sn==34)
   {TBSeat34.setFocusable(false); TBSeat34.setEnabled(false);}
    if(sn==35)
   {TBSeat35.setFocusable(false); TBSeat35.setEnabled(false);}
   if(sn==36)
   {TBSeat36.setFocusable(false); TBSeat36.setEnabled(false);}
    if(sn==37)
   {TBSeat37.setFocusable(false); TBSeat37.setEnabled(false);}
   if(sn==38)
   {TBSeat38.setFocusable(false); TBSeat38.setEnabled(false);}
    if(sn==39)
   {TBSeat39.setFocusable(false); TBSeat39.setEnabled(false);}
    if(sn==40)
   {TBSeat40.setFocusable(false); TBSeat40.setEnabled(false);}
   }

   }

    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
  }


       // java.util.Date d = dateDC.getDate();<-- storing date in Date format
    }//GEN-LAST:event_seatavBTActionPerformed

    private void bookBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBTActionPerformed
date = ((JTextField)dateDC.getDateEditor().getUiComponent()).getText();
selbus = (String) BusesTable.getValueAt(BusesTable.getSelectedRow(), 0);
System.out.print(PassengerDetailsTable.getRowCount());
//I want to put in the table corresponding to 'selbus' the elements in passengerdetailstable + the date
for(int r=0; r<PassengerDetailsTable.getRowCount();r++)

 {

    try {   // System.out.println("");
  
      String sql = "insert into "+selbus+" values('"+data[r][0]+"','"+data[r][1]+"','"+date+"')";
      pst = conn.createStatement();

                pst.execute(sql);
            } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e);
            }
  
  }/*done. now to save this into the users own table*/

for(int r=0; r<PassengerDetailsTable.getRowCount();r++)

 {

    try {   // System.out.println("");

      String sql = "insert into "+username+" values('"+data[r][0]+"','"+route+"','"+selbus+"','"+date+"')";
      pst = conn.createStatement();

                pst.execute(sql);
            } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e);
            }

  }

//JOptionPane.showMessageDialog(null, "Success");
 close();
success s = new success();
s.route=route;
s.setVisible(true);




        /*for(int r=0; r<BusesTable.getRowCount();r++)
         {for(int c=0;c<BusesTable.getColumnCount();c++)
 {busestabledata[r][c] = BusesTable.getValueAt(r, c);}}*/// TODO add your handling code here:
}//GEN-LAST:event_bookBTActionPerformed

    private void BusesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusesTableMouseClicked

   price = Integer.parseInt((String) BusesTable.getValueAt(BusesTable.getSelectedRow(), 3));
   bookBT.setText("Pay Rs"+price+" and Book Now!");        // TODO add your handling code here:
    }//GEN-LAST:event_BusesTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Pg2_Welcome s = new Pg2_Welcome();
s.username=username;
s.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPassengerButton;
    private javax.swing.JTable BusesTable;
    private javax.swing.JComboBox CBroute;
    private javax.swing.JTable PassengerDetailsTable;
    private javax.swing.JToggleButton TBSeat1;
    private javax.swing.JToggleButton TBSeat10;
    private javax.swing.JToggleButton TBSeat11;
    private javax.swing.JToggleButton TBSeat12;
    private javax.swing.JToggleButton TBSeat13;
    private javax.swing.JToggleButton TBSeat14;
    private javax.swing.JToggleButton TBSeat15;
    private javax.swing.JToggleButton TBSeat16;
    private javax.swing.JToggleButton TBSeat17;
    private javax.swing.JToggleButton TBSeat18;
    private javax.swing.JToggleButton TBSeat19;
    private javax.swing.JToggleButton TBSeat2;
    private javax.swing.JToggleButton TBSeat20;
    private javax.swing.JToggleButton TBSeat21;
    private javax.swing.JToggleButton TBSeat22;
    private javax.swing.JToggleButton TBSeat23;
    private javax.swing.JToggleButton TBSeat24;
    private javax.swing.JToggleButton TBSeat25;
    private javax.swing.JToggleButton TBSeat26;
    private javax.swing.JToggleButton TBSeat27;
    private javax.swing.JToggleButton TBSeat28;
    private javax.swing.JToggleButton TBSeat29;
    private javax.swing.JToggleButton TBSeat3;
    private javax.swing.JToggleButton TBSeat30;
    private javax.swing.JToggleButton TBSeat31;
    private javax.swing.JToggleButton TBSeat32;
    private javax.swing.JToggleButton TBSeat33;
    private javax.swing.JToggleButton TBSeat34;
    private javax.swing.JToggleButton TBSeat35;
    private javax.swing.JToggleButton TBSeat36;
    private javax.swing.JToggleButton TBSeat37;
    private javax.swing.JToggleButton TBSeat38;
    private javax.swing.JToggleButton TBSeat39;
    private javax.swing.JToggleButton TBSeat4;
    private javax.swing.JToggleButton TBSeat40;
    private javax.swing.JToggleButton TBSeat5;
    private javax.swing.JToggleButton TBSeat6;
    private javax.swing.JToggleButton TBSeat7;
    private javax.swing.JToggleButton TBSeat8;
    private javax.swing.JToggleButton TBSeat9;
    private javax.swing.JButton bookBT;
    private com.toedter.calendar.JDateChooser dateDC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton seatavBT;
    // End of variables declaration//GEN-END:variables

}

