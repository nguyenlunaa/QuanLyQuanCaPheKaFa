/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TaiKhoan;

import Interface.QuanLy.QL_TaiKhoan;
import Interface.Run;
import Models.TaiKhoan;
import Mysql.ConnectMySql;
import java.awt.Color;
import static java.lang.Thread.sleep;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class TaiKhoan_UI extends javax.swing.JFrame {

    /**
     * Creates new form TaiKhoan_UI
     */
    ConnectMySql cn = new ConnectMySql();
    public TaiKhoan_UI() {
        initComponents();
        setTT();
        //Set tên NV
        String text = "Xin chào,"+Run.tk.getTenNV();
        lblQTV.setText(text);
        
        //Set thời gian
        Clock clock= new Clock(); 
        clock.start();
        
        //set text địa chỉ
        addr.setLineWrap(true);
        addr.setWrapStyleWord(true);
    }
   public void setTT(){
       codenv.setText(Run.tk.GetMaNV());
       tennv.setText(Run.tk.getTenNV());
       sdt.setText(String.valueOf(Run.tk.getSDT()));
       addr.setText(Run.tk.getDiaChi());
       
   }
    
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
    public class Clock extends Thread{ 
    public Clock(){    } 
    @Override
    public void run(){ 
        while(true){ 
            Calendar calendar = Calendar.getInstance();                
            String str;  
            str= sdf.format(calendar.getTime()); 
            lblTime.setText(str); 
        try{ 
            sleep(1000); 
          } catch(Exception e){ 
             System.out.println(e); 
            } 
      } 
    }
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
        jPmenu = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblQTV = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tennv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sdt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        codenv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addr = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        btnSua = new javax.swing.JButton();
        btnSua1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1341, 730));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPmenu.setBackground(new java.awt.Color(174, 124, 90));

        btn_home.setBackground(new java.awt.Color(174, 124, 90));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_homeMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_home_page_38px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Trang chủ");

        javax.swing.GroupLayout btn_homeLayout = new javax.swing.GroupLayout(btn_home);
        btn_home.setLayout(btn_homeLayout);
        btn_homeLayout.setHorizontalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_homeLayout.setVerticalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tài khoản");

        lblQTV.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        lblQTV.setForeground(new java.awt.Color(255, 255, 255));
        lblQTV.setText("Xin chào");

        lblTime.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("jLabel5");

        javax.swing.GroupLayout jPmenuLayout = new javax.swing.GroupLayout(jPmenu);
        jPmenu.setLayout(jPmenuLayout);
        jPmenuLayout.setHorizontalGroup(
            jPmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(jPmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQTV)
                    .addComponent(lblTime))
                .addGap(152, 152, 152))
        );
        jPmenuLayout.setVerticalGroup(
            jPmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPmenuLayout.createSequentialGroup()
                        .addComponent(lblQTV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTime)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(694, 500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 1, 20))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel2.setText("Tên NV :");

        tennv.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel6.setText("Địa chỉ :");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel7.setText("SDT :");

        sdt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jLabel9.setText("Mã NV :");

        codenv.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        codenv.setEnabled(false);

        addr.setColumns(20);
        addr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addr.setRows(5);
        jScrollPane1.setViewportView(addr);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tennv, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sdt)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                    .addComponent(codenv, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(codenv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel6)))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_edit_file_30px.png"))); // NOI18N
        btnSua.setText("Sửa ");
        btnSua.setPreferredSize(new java.awt.Dimension(111, 47));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnSua1.setBackground(new java.awt.Color(255, 255, 255));
        btnSua1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnSua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_edit_file_30px.png"))); // NOI18N
        btnSua1.setText("Đổi mật khẩu");
        btnSua1.setPreferredSize(new java.awt.Dimension(111, 47));
        btnSua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnSua1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(btnSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(273, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(949, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        setColorMenu(btn_home);
        this.setVisible(false);
        Run.QLCF();
    }//GEN-LAST:event_btn_homeMouseClicked

    private void btn_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseEntered
        setColorMenu(btn_home);
    }//GEN-LAST:event_btn_homeMouseEntered

    private void btn_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseExited
        resetColorMenu(btn_home);
    }//GEN-LAST:event_btn_homeMouseExited

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(codenv.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Mã nhân viên không được trống !");
            codenv.requestFocus();
            return;
        }
        
        if(addr.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Địa chỉ không được trống !");
            addr.requestFocus();
            return;
        }
        
        if(sdt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Số điện thoại không được trống !");
            sdt.requestFocus();
            return;
        }
        if(tennv.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Tên nhân viên không được trống !");
            tennv.requestFocus();
            return;
        }
        
      
        TaiKhoan tk = new TaiKhoan();
        tk.SetMaNV(codenv.getText());
        tk.setTenNV(tennv.getText());
        tk.setDiaChi(addr.getText());
        tk.setSDT(Integer.parseInt(sdt.getText()));
        int i = cn.UpdateTK1(tk);
        
        if(i>0){
            JOptionPane.showMessageDialog(null, "Sửa thành công");
        }
        
        
   
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnSua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua1ActionPerformed
       DL_DoiMK sua = new DL_DoiMK(Run.menuQL, true);
       sua.setVisible(true);
            
// TODO add your handling code here:
    }//GEN-LAST:event_btnSua1ActionPerformed
    
    public void setColorMenu(JPanel panel){
        panel.setBackground(new Color(168, 69, 0));
    }
    
    public void resetColorMenu(JPanel panel){
        panel.setBackground(new Color(174,124,90));
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addr;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSua1;
    private javax.swing.JPanel btn_home;
    private javax.swing.JTextField codenv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPmenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQTV;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField tennv;
    // End of variables declaration//GEN-END:variables
}
