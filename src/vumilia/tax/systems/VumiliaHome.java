/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vumilia.tax.systems;

import com.bulenkov.darcula.DarculaLaf;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicLookAndFeel;

/**
 *
 * @author kmike
 */
public class VumiliaHome extends javax.swing.JFrame {

    /**
     * Creates new form VumiliaHome
     */
    public VumiliaHome() {
       initComponents();
       buttons();
    }
    public void buttons(){
     ButtonGroup bg =new ButtonGroup();
       
       
         bg.add(radioHelb);
        bg.add(radioSacco);
          bg.add(radioSacco1);
          radioSacco1.setSelected(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        page3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        employeeName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        grossIncometf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoutput = new javax.swing.JTextPane();
        radioHelb = new javax.swing.JRadioButton();
        radioSacco = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        loantf = new javax.swing.JTextField();
        radioSacco1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VUMILIA TAXES ");
        setAlwaysOnTop(true);
        setIconImages(null);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("VUMILIA TAX SYSTEMS  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel1)
                .addContainerGap(338, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleParent(this);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel2.setText("Employee Number");

        employeeName.setBackground(new java.awt.Color(255, 255, 255));
        employeeName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        employeeName.setForeground(new java.awt.Color(0, 0, 0));
        employeeName.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel3.setText("Enter your Name");

        nametf.setBackground(new java.awt.Color(255, 255, 255));
        nametf.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nametf.setForeground(new java.awt.Color(0, 0, 0));
        nametf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nametf.setBorder(null);
        nametf.setCaretColor(new java.awt.Color(245, 245, 245));

        jLabel4.setText("Gross income");

        grossIncometf.setBackground(new java.awt.Color(255, 255, 255));
        grossIncometf.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        grossIncometf.setForeground(new java.awt.Color(0, 0, 0));
        grossIncometf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        grossIncometf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grossIncometfActionPerformed(evt);
            }
        });
        grossIncometf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                grossIncometfKeyTyped(evt);
            }
        });

        textoutput.setEditable(false);
        textoutput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textoutput.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jScrollPane1.setViewportView(textoutput);

        radioHelb.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        radioHelb.setText("HELB");

        radioSacco.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 12)); // NOI18N
        radioSacco.setText("SACCO");

        jLabel6.setText("SELECT ANY  FORM OF LOAN  YOU HAVE");

        jLabel7.setText("Amount owed");

        jButton1.setText("OUTPUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        loantf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        loantf.setText("0");
        loantf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loantfKeyTyped(evt);
            }
        });

        radioSacco1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 12)); // NOI18N
        radioSacco1.setText("NONE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(radioHelb, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(radioSacco1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioSacco)
                .addGap(111, 111, 111))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(loantf, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addGap(198, 198, 198))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioHelb)
                    .addComponent(radioSacco)
                    .addComponent(radioSacco1))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loantf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(64, 64, 64))
        );

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel5.setText("Developed by KMIKE @msoft co");

        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout page3Layout = new javax.swing.GroupLayout(page3);
        page3.setLayout(page3Layout);
        page3Layout.setHorizontalGroup(
            page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page3Layout.createSequentialGroup()
                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(page3Layout.createSequentialGroup()
                        .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(page3Layout.createSequentialGroup()
                                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(page3Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page3Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)))
                        .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(employeeName, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(nametf, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addGroup(page3Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(grossIncometf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(page3Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        page3Layout.setVerticalGroup(
            page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grossIncometf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(113, 113, 113)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(page3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        mainPanel.add(page3, "card2");

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void grossIncometfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grossIncometfKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_grossIncometfKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(nametf.getText().equals("")||grossIncometf.getText().equals("")||employeeName.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Cannot operate  with empty fields");
         }else{
        
        double grossIncome= Double.parseDouble(grossIncometf.getText());
        int diff1;
        int diff2;
        int diff3;
        int paye;
       // 
        //int grossIncome = Integer.parseInt(grossIncometf.getText());
        int gross; 
          if ( grossIncome > 100000){
             diff1 = (int) ((grossIncome-100000)*0.2);
             diff2 = (int) (50000* 0.16);
             diff3 = (int) (40000*0.12);
             paye = diff1 + diff2+ diff3;
             gross =(int) (grossIncome-paye);
            double diff4= Double.parseDouble(loantf.getText());
            
            if(radioHelb.isSelected()&& diff4>=1000 && diff4 <=5000){
              int total=(int) (gross-diff4);
               textoutput.setText(Integer.toString(total));              
             }
            else if(radioSacco.isSelected()){
              int total=(int) (gross-diff4);
               textoutput.setText(Integer.toString(total));              
             }
            else if( ! radioHelb.isSelected() && !radioSacco.isSelected() ){
                int total=(int) (gross-diff4);
               textoutput.setText(Integer.toString(total)); 
               
            }  else if( radioHelb.isSelected() && diff4 >5000 || diff4<1000){
                JOptionPane.showMessageDialog(null, "cannot have a helb loan of over 5000 or less than 1000");
                textoutput.setText("");
            }
            
          }else if ( grossIncome > 50000 && grossIncome<=100000 ){
            
             diff2 = (int) ((grossIncome-50000)* 0.16);
             diff3 = (int) (40000*0.12);
             paye =  diff2+ diff3;
             gross =(int) (grossIncome-paye);
            double diff4= Double.parseDouble(loantf.getText());
            
            if(radioHelb.isSelected()&& diff4>=1000 && diff4 <=5000){
              int total=(int) (gross-diff4);
               textoutput.setText(Integer.toString(total));              
             }
            else if(radioSacco.isSelected()){
              int total=(int) (gross-diff4);
               textoutput.setText(Integer.toString(total));              
             }
            else if( ! radioHelb.isSelected() && !radioSacco.isSelected() ){
                int total=(int) (gross-diff4);
               textoutput.setText(Integer.toString(total)); 
               
            }  else if( radioHelb.isSelected() && diff4 >5000 || diff4<1000){
                JOptionPane.showMessageDialog(null, "cannot have a helb loan of over 5000 or less than 1000");
                textoutput.setText("");
            }
            
          } else if ( grossIncome > 10000 && grossIncome<=50000){
             
             
             diff3 = (int) ((grossIncome-40000)*0.12);
             paye =  diff3;
             gross =(int) (grossIncome-paye);
            double diff4= Double.parseDouble(loantf.getText());
            
            if(radioHelb.isSelected()&& diff4>=1000 && diff4 <=5000){
              int total=(int) (gross-diff4);
               textoutput.setText(Integer.toString(total));              
             }
            else if(radioSacco.isSelected()){
              int total=(int) (gross-diff4);
               textoutput.setText(Integer.toString(total));              
             }
            else if( ! radioHelb.isSelected() && !radioSacco.isSelected() ){
                int total=(int) (gross-diff4);
               textoutput.setText(Integer.toString(total)); 
               
            }  else if( radioHelb.isSelected() && diff4 >5000 || diff4<1000){
                JOptionPane.showMessageDialog(null, "cannot have a helb loan of over 5000 or less than 1000");
                textoutput.setText("");
            }
            
          }else{
               double diff4= Double.parseDouble(loantf.getText());
              if(radioHelb.isSelected()&& diff4>=1000 && diff4 <=5000){
              int total=(int) (grossIncome -diff4);
               textoutput.setText(Integer.toString(total));              
             }
            else if(radioSacco.isSelected()){
              int total=(int) (grossIncome -diff4);
               textoutput.setText(Integer.toString(total));              
             }
            else if( ! radioHelb.isSelected() && !radioSacco.isSelected() ){
                int total=(int) (grossIncome -diff4);
               textoutput.setText(Integer.toString(total)); 
               
            }  else if( radioHelb.isSelected() && diff4 >5000 || diff4<1000){
                JOptionPane.showMessageDialog(null, "cannot have a helb loan of over 5000 or less than 1000");
                textoutput.setText("");
            }        
          }
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loantfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loantfKeyTyped
       if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();}
    }//GEN-LAST:event_loantfKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         nametf.setText("");
         grossIncometf.setText("");
         employeeName.setText("");
         loantf.setText("0");
         radioSacco1.setSelected(true);
        
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void grossIncometfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grossIncometfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grossIncometfActionPerformed
    
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
            BasicLookAndFeel darcula = new DarculaLaf();
            UIManager.setLookAndFeel(darcula);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VumiliaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VumiliaHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField employeeName;
    private javax.swing.JTextField grossIncometf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField loantf;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nametf;
    private javax.swing.JPanel page3;
    private javax.swing.JRadioButton radioHelb;
    private javax.swing.JRadioButton radioSacco;
    private javax.swing.JRadioButton radioSacco1;
    private javax.swing.JTextPane textoutput;
    // End of variables declaration//GEN-END:variables
}
