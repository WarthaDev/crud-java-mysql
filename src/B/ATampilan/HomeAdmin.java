package B.ATampilan;

import C.User.Awal;
import C.User.Forget;
import java.awt.Color;
import java.awt.Frame;
import KoneksiDatabase.Koneksi;
import KoneksiDatabase.WaktuSekarang;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class HomeAdmin extends javax.swing.JFrame {
    java.sql.Connection koneksi = new Koneksi().getkoneksi();
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    private String sql="";
    static boolean maximized = true;
    int xMouse;
    int yMouse;
    
    private void setJam (){
        ActionListener listener = new ActionListener (){
            
            @Override
            public void actionPerformed(ActionEvent evt) {
                jam.setText(new WaktuSekarang().getWkt());
            }
        };
        new Timer(1000, listener).start();
    }    
 
    public HomeAdmin() {
        initComponents();
        setJam();
        KoneksiDB();
        ShowData(sql);
        supplier(sql);
        icon();
    }
    
    private void KoneksiDB (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banu123", "root", "");
        } catch (Exception e) {
            System.out.println("ERROR \n Gagal Memuat KeDatabase"+e);
        }
    }  
    
    private void ShowData (String sql){  
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("Identitas");
        data.addColumn ("Username");
        data.addColumn ("Nama Depan");
        data.addColumn ("Nama Belakang");
        data.addColumn ("Email");
        data.addColumn ("Password");
        data.addColumn ("Tahun Lahir");
        data.addColumn ("Alamat");
        data.addColumn ("Nomer KTP");
        data.addColumn ("Telpon");
        data.addColumn ("Jenis Kelamin");
        
         try {
             st=con.createStatement();
             rs=st.executeQuery("select * from dbuser");
             while (rs.next())
                 data.addRow(new Object[]{
                     rs.getString(1), rs.getString(2),
                     rs.getString(3), rs.getString(4), 
                     rs.getString(5), rs.getString(6),
                     rs.getString(7), rs.getString(8), 
                     rs.getString(9), rs.getString(10),
                     rs.getString(11)
                  
                 });
             jTable1.setModel(data);
         } catch (Exception e){
             JOptionPane.showMessageDialog(null,"Gagal Memuat KEDatabase\n Aktifkan Database Sebelum Memlai "+e);
         }}
    
        private void supplier (String sql){  
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("ID Supplier");
        data.addColumn ("Nama Supplier");
        data.addColumn ("Telepon");
        data.addColumn ("Alamat");
        
        try {
             st=con.createStatement();
             rs=st.executeQuery("select * from supplier");
             while (rs.next())
                 data.addRow(new Object[]{
                     rs.getString(1), rs.getString(2),
                     rs.getString(3), rs.getString(4)
                  
                 });
             jTable3.setModel(data);
         } catch (Exception e){
             JOptionPane.showMessageDialog(null,"Gagal Memuat KEDatabase\n Aktifkan Database Sebelum Memlai "+e);
         }}
      
    public void clear(){
        jTextField1.setText("");
        idsup.setText("");
        namasup.setText("");
        telponsup.setText("");
        alamatsup.setText("");
    }
    
    public void icon(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/GambarTampilan/logo.png"));
        Image image = icon.getImage();
        setIconImage(image);
    }      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new KoneksiUI.UIHome();
        Kepala = new javax.swing.JPanel();
        btnMinimize = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jam = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btndash = new javax.swing.JButton();
        lbldash = new javax.swing.JLabel();
        btnakun = new javax.swing.JButton();
        lblakun = new javax.swing.JLabel();
        lblout = new javax.swing.JLabel();
        btnout = new javax.swing.JButton();
        btnout1 = new javax.swing.JButton();
        btnsup = new javax.swing.JButton();
        lblsup = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        jDashboard = new javax.swing.JScrollPane();
        jPanel0 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnbwh1 = new javax.swing.JButton();
        PanelColor1 = new javax.swing.JPanel();
        btnatas1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        PanelColor2 = new javax.swing.JPanel();
        btnatas2 = new javax.swing.JButton();
        btnbwh2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnbwh3 = new javax.swing.JButton();
        PanelColor3 = new javax.swing.JPanel();
        btnatas3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnbwh4 = new javax.swing.JButton();
        PanelColor4 = new javax.swing.JPanel();
        btnatas4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnbwh5 = new javax.swing.JButton();
        PanelColor5 = new javax.swing.JPanel();
        btnatas5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnbwh6 = new javax.swing.JButton();
        PanelColor6 = new javax.swing.JPanel();
        btnatas6 = new javax.swing.JButton();
        jKaryawan = new javax.swing.JScrollPane();
        jDesktopPane2 = new KoneksiUI.UIHome();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton_LOGIN9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_LOGIN11 = new javax.swing.JButton();
        jSupplier = new javax.swing.JScrollPane();
        jDesktopPane3 = new KoneksiUI.UIHome();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idsup = new javax.swing.JTextField();
        namasup = new javax.swing.JTextField();
        telponsup = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        alamatsup = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jDesktopPane1.setBackground(new java.awt.Color(0, 153, 153));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.setFocusCycleRoot(false);

        Kepala.setBackground(new java.awt.Color(255, 255, 255));
        Kepala.setForeground(new java.awt.Color(255, 255, 255));
        Kepala.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                KepalaMouseDragged(evt);
            }
        });
        Kepala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KepalaMousePressed(evt);
            }
        });

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarTampilan/Minimize.png"))); // NOI18N
        btnMinimize.setContentAreaFilled(false);
        btnMinimize.setFocusable(false);
        btnMinimize.setOpaque(true);
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseExited(evt);
            }
        });
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarTampilan/Exit.png"))); // NOI18N
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusable(false);
        btnExit.setOpaque(true);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Waktu :");

        jam.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jam.setForeground(new java.awt.Color(255, 0, 0));
        jam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jam.setText(new WaktuSekarang().getWkt());

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tanggal :");

        tgl.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        tgl.setForeground(new java.awt.Color(255, 0, 0));
        tgl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tgl.setText(new WaktuSekarang().getTgl());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DARMA COMPUTER");

        javax.swing.GroupLayout KepalaLayout = new javax.swing.GroupLayout(Kepala);
        Kepala.setLayout(KepalaLayout);
        KepalaLayout.setHorizontalGroup(
            KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KepalaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgl)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jam)
                .addGap(18, 18, 18)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        KepalaLayout.setVerticalGroup(
            KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KepalaLayout.createSequentialGroup()
                .addGroup(KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnMinimize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );

        btndash.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btndash.setForeground(new java.awt.Color(255, 255, 255));
        btndash.setText("Dashboard");
        btndash.setContentAreaFilled(false);
        btndash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndash.setFocusable(false);
        btndash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndashActionPerformed(evt);
            }
        });

        lbldash.setBackground(new java.awt.Color(255, 51, 51));
        lbldash.setOpaque(true);
        lbldash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbldashMouseClicked(evt);
            }
        });

        btnakun.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnakun.setForeground(new java.awt.Color(255, 255, 255));
        btnakun.setText("Account");
        btnakun.setContentAreaFilled(false);
        btnakun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnakun.setFocusable(false);
        btnakun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnakunActionPerformed(evt);
            }
        });

        lblakun.setBackground(new java.awt.Color(255, 255, 255));
        lblakun.setOpaque(true);
        lblakun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblakunMouseClicked(evt);
            }
        });

        lblout.setBackground(new java.awt.Color(255, 255, 255));
        lblout.setOpaque(true);
        lblout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbloutMouseClicked(evt);
            }
        });

        btnout.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnout.setForeground(new java.awt.Color(255, 255, 255));
        btnout.setText("Logout");
        btnout.setContentAreaFilled(false);
        btnout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnout.setFocusable(false);
        btnout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoutActionPerformed(evt);
            }
        });

        btnout1.setBackground(new java.awt.Color(255, 255, 255));
        btnout1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnout1.setForeground(new java.awt.Color(255, 255, 255));
        btnout1.setText("Welcome To Home Admin :)");
        btnout1.setContentAreaFilled(false);
        btnout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnout1.setFocusable(false);
        btnout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnout1ActionPerformed(evt);
            }
        });

        btnsup.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnsup.setForeground(new java.awt.Color(255, 255, 255));
        btnsup.setText("Supplier");
        btnsup.setContentAreaFilled(false);
        btnsup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsup.setFocusable(false);
        btnsup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupActionPerformed(evt);
            }
        });

        lblsup.setBackground(new java.awt.Color(255, 255, 255));
        lblsup.setOpaque(true);
        lblsup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsupMouseClicked(evt);
            }
        });

        Body.setBackground(new java.awt.Color(255, 255, 255));
        Body.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Body.setLayout(new java.awt.CardLayout());

        jDashboard.setBackground(new java.awt.Color(204, 204, 204));

        jPanel0.setBackground(new java.awt.Color(204, 204, 204));
        jPanel0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnbwh1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnbwh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarTampilan/layout.png"))); // NOI18N
        btnbwh1.setContentAreaFilled(false);
        btnbwh1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbwh1.setFocusable(false);
        btnbwh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbwh1ActionPerformed(evt);
            }
        });

        PanelColor1.setBackground(new java.awt.Color(0, 204, 106));

        btnatas1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnatas1.setForeground(new java.awt.Color(255, 255, 255));
        btnatas1.setText("Barang Tersedia");
        btnatas1.setContentAreaFilled(false);
        btnatas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnatas1.setFocusable(false);
        btnatas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelColor1Layout = new javax.swing.GroupLayout(PanelColor1);
        PanelColor1.setLayout(PanelColor1Layout);
        PanelColor1Layout.setHorizontalGroup(
            PanelColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnatas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelColor1Layout.setVerticalGroup(
            PanelColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnatas1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelColor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnbwh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbwh1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelColor2.setBackground(new java.awt.Color(34, 70, 123));

        btnatas2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnatas2.setForeground(new java.awt.Color(255, 255, 255));
        btnatas2.setText("Beli Barang");
        btnatas2.setContentAreaFilled(false);
        btnatas2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnatas2.setFocusable(false);
        btnatas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatas2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelColor2Layout = new javax.swing.GroupLayout(PanelColor2);
        PanelColor2.setLayout(PanelColor2Layout);
        PanelColor2Layout.setHorizontalGroup(
            PanelColor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnatas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelColor2Layout.setVerticalGroup(
            PanelColor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnatas2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        btnbwh2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnbwh2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarTampilan/shopping-cart.png"))); // NOI18N
        btnbwh2.setContentAreaFilled(false);
        btnbwh2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbwh2.setFocusable(false);
        btnbwh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbwh2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelColor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnbwh2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(PanelColor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbwh2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnbwh3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnbwh3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarTampilan/monitor.png"))); // NOI18N
        btnbwh3.setContentAreaFilled(false);
        btnbwh3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbwh3.setFocusable(false);
        btnbwh3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbwh3ActionPerformed(evt);
            }
        });

        PanelColor3.setBackground(new java.awt.Color(168, 30, 166));

        btnatas3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnatas3.setForeground(new java.awt.Color(255, 255, 255));
        btnatas3.setText("Simulasi Rakit PC");
        btnatas3.setContentAreaFilled(false);
        btnatas3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnatas3.setFocusable(false);
        btnatas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatas3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelColor3Layout = new javax.swing.GroupLayout(PanelColor3);
        PanelColor3.setLayout(PanelColor3Layout);
        PanelColor3Layout.setHorizontalGroup(
            PanelColor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnatas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelColor3Layout.setVerticalGroup(
            PanelColor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnatas3, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelColor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnbwh3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(PanelColor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbwh3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnbwh4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnbwh4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarTampilan/zoom.png"))); // NOI18N
        btnbwh4.setContentAreaFilled(false);
        btnbwh4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbwh4.setFocusable(false);
        btnbwh4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbwh4ActionPerformed(evt);
            }
        });

        PanelColor4.setBackground(new java.awt.Color(0, 0, 0));

        btnatas4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnatas4.setForeground(new java.awt.Color(255, 255, 255));
        btnatas4.setText("Produk Terbaru");
        btnatas4.setContentAreaFilled(false);
        btnatas4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnatas4.setFocusable(false);
        btnatas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatas4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelColor4Layout = new javax.swing.GroupLayout(PanelColor4);
        PanelColor4.setLayout(PanelColor4Layout);
        PanelColor4Layout.setHorizontalGroup(
            PanelColor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnatas4, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        PanelColor4Layout.setVerticalGroup(
            PanelColor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnatas4, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelColor4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnbwh4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(PanelColor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbwh4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnbwh5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnbwh5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarTampilan/printer.png"))); // NOI18N
        btnbwh5.setContentAreaFilled(false);
        btnbwh5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbwh5.setFocusable(false);
        btnbwh5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbwh5ActionPerformed(evt);
            }
        });

        PanelColor5.setBackground(new java.awt.Color(204, 0, 0));

        btnatas5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnatas5.setForeground(new java.awt.Color(255, 255, 255));
        btnatas5.setText("Cetak Laporan Nota Pembeli");
        btnatas5.setContentAreaFilled(false);
        btnatas5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnatas5.setFocusable(false);
        btnatas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatas5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelColor5Layout = new javax.swing.GroupLayout(PanelColor5);
        PanelColor5.setLayout(PanelColor5Layout);
        PanelColor5Layout.setHorizontalGroup(
            PanelColor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnatas5, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        PanelColor5Layout.setVerticalGroup(
            PanelColor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnatas5, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelColor5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnbwh5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(PanelColor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbwh5, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnbwh6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnbwh6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarTampilan/info.png"))); // NOI18N
        btnbwh6.setContentAreaFilled(false);
        btnbwh6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbwh6.setFocusable(false);
        btnbwh6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbwh6ActionPerformed(evt);
            }
        });

        PanelColor6.setBackground(new java.awt.Color(153, 153, 153));

        btnatas6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnatas6.setForeground(new java.awt.Color(255, 255, 255));
        btnatas6.setText("Data Transaksi");
        btnatas6.setContentAreaFilled(false);
        btnatas6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnatas6.setFocusable(false);
        btnatas6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatas6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelColor6Layout = new javax.swing.GroupLayout(PanelColor6);
        PanelColor6.setLayout(PanelColor6Layout);
        PanelColor6Layout.setHorizontalGroup(
            PanelColor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnatas6, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        PanelColor6Layout.setVerticalGroup(
            PanelColor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnatas6, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelColor6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnbwh6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(PanelColor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbwh6, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel0Layout = new javax.swing.GroupLayout(jPanel0);
        jPanel0.setLayout(jPanel0Layout);
        jPanel0Layout.setHorizontalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel0Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel0Layout.setVerticalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel0Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel0Layout.createSequentialGroup()
                        .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        jDashboard.setViewportView(jPanel0);

        Body.add(jDashboard, "card2");

        jDesktopPane2.setBackground(new java.awt.Color(0, 102, 102));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(236, 240, 241));
        jLabel16.setText("Cari Nama Depan");

        jButton_LOGIN9.setBackground(new java.awt.Color(0, 204, 51));
        jButton_LOGIN9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_LOGIN9.setForeground(new java.awt.Color(255, 255, 255));
        jButton_LOGIN9.setText("Update");
        jButton_LOGIN9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_LOGIN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LOGIN9jButton_LOGIN5jButton_LOGIN1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton_LOGIN11.setBackground(new java.awt.Color(0, 204, 51));
        jButton_LOGIN11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_LOGIN11.setForeground(new java.awt.Color(255, 255, 255));
        jButton_LOGIN11.setText("Refresh");
        jButton_LOGIN11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_LOGIN11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LOGIN11jButton_LOGIN5jButton_LOGIN1ActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton_LOGIN9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton_LOGIN11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_LOGIN9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_LOGIN11)))))
                .addGap(22, 22, 22))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jButton_LOGIN11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_LOGIN9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jKaryawan.setViewportView(jDesktopPane2);

        Body.add(jKaryawan, "card5");

        jSupplier.setPreferredSize(new java.awt.Dimension(899, 578));

        jDesktopPane3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Note : Cara Mengubah ID Supplier Harus Benar Tidak Boleh Di Ganti");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable3);

        jButton1.setText("Simpan");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ubah");
        jButton2.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Supplier");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telepon");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama Supplier");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Alamat Suplier");

        jButton5.setText("Bersihkan");
        jButton5.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Pemesanan");
        jButton6.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jDesktopPane3.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(idsup, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(namasup, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(telponsup, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(alamatsup, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(idsup, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(namasup, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(telponsup, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(alamatsup, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idsup, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namasup, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telponsup, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alamatsup, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSupplier.setViewportView(jDesktopPane3);

        Body.add(jSupplier, "card5");

        jDesktopPane1.setLayer(Kepala, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btndash, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbldash, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnakun, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblakun, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblout, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnout, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnout1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnsup, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblsup, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Body, javax.swing.JLayeredPane.DRAG_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Kepala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btndash, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldash, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnakun, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblakun, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnsup, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsup, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnout, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblout, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnout1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(Kepala, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btndash)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbldash, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btnakun)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblakun, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnout1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btnsup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblsup, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(btnout)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblout, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoutActionPerformed
        lblout.setBackground(new Color(255,51,51));

        lblakun.setBackground(new Color(255,255,255));
        lblsup.setBackground(new Color(255,255,255));
        lbldash.setBackground(new Color(255,255,255));

        new Awal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnoutActionPerformed

    private void lbloutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbloutMouseClicked
        lblout.setBackground(new Color(255,51,51));

        lblakun.setBackground(new Color(255,255,255));
        lblsup.setBackground(new Color(255,255,255));
        lbldash.setBackground(new Color(255,255,255));

        new Awal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbloutMouseClicked

    private void lblakunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblakunMouseClicked
        lblakun.setBackground(new Color(255,51,51));

        lbldash.setBackground(new Color(255,255,255));
        lblsup.setBackground(new Color(255,255,255));
        lblout.setBackground(new Color(255,255,255));

        Body.removeAll();
        Body.repaint();
        Body.revalidate();
        Body.add(jKaryawan);
        Body.repaint();
    }//GEN-LAST:event_lblakunMouseClicked

    private void btnakunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnakunActionPerformed
        lblakun.setBackground(new Color(255,51,51));

        lbldash.setBackground(new Color(255,255,255));
        lblsup.setBackground(new Color(255,255,255));
        lblout.setBackground(new Color(255,255,255));

        Body.removeAll();
        Body.repaint();
        Body.revalidate();
        Body.add(jKaryawan);
        Body.repaint();
        Body.revalidate();
    }//GEN-LAST:event_btnakunActionPerformed

    private void lbldashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldashMouseClicked
        lbldash.setBackground(new Color(255,51,51));

        lblakun.setBackground(new Color(255,255,255));
        lblsup.setBackground(new Color(255,255,255));
        lblout.setBackground(new Color(255,255,255));

        Body.removeAll();
        Body.repaint();
        Body.revalidate();
        Body.add(jDashboard);
        Body.repaint();
        Body.revalidate();
    }//GEN-LAST:event_lbldashMouseClicked

    private void btndashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashActionPerformed
        lbldash.setBackground(new Color(255,51,51));

        lblakun.setBackground(new Color(255,255,255));
        lblsup.setBackground(new Color(255,255,255));
        lblout.setBackground(new Color(255,255,255));

        Body.removeAll();
        Body.repaint();
        Body.revalidate();
        Body.add(jDashboard);
        Body.repaint();
        Body.revalidate();
    }//GEN-LAST:event_btndashActionPerformed

    private void KepalaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KepalaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_KepalaMousePressed

    private void KepalaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KepalaMouseDragged
        if(maximized){
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - xMouse, y - yMouse);
        }
    }//GEN-LAST:event_KepalaMouseDragged

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(new Color(232,17,35));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btnMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseExited
        btnMinimize.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnMinimizeMouseExited

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        btnMinimize.setBackground(new Color(229,229,229));
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnbwh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbwh1ActionPerformed
        new BarangTersediaAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbwh1ActionPerformed

    private void btnatas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatas1ActionPerformed
        new BarangTersediaAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatas1ActionPerformed

    private void btnatas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatas2ActionPerformed
        new BeliAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatas2ActionPerformed

    private void btnbwh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbwh2ActionPerformed
        new BeliAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbwh2ActionPerformed

    private void btnbwh3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbwh3ActionPerformed
        new SimulatorAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbwh3ActionPerformed

    private void btnatas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatas3ActionPerformed
        new SimulatorAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatas3ActionPerformed

    private void btnbwh4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbwh4ActionPerformed
        new BarangTerbaruAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbwh4ActionPerformed

    private void btnatas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatas4ActionPerformed
        new BarangTerbaruAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatas4ActionPerformed

    private void btnbwh5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbwh5ActionPerformed
        String reportSource = null;
        new LaporanAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbwh5ActionPerformed

    private void btnatas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatas5ActionPerformed
        String reportSource = null;
        new LaporanAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatas5ActionPerformed

    private void btnbwh6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbwh6ActionPerformed
        new LaporanTransaksiAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbwh6ActionPerformed

    private void btnatas6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatas6ActionPerformed
        new LaporanTransaksiAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatas6ActionPerformed

    private void jButton_LOGIN9jButton_LOGIN5jButton_LOGIN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LOGIN9jButton_LOGIN5jButton_LOGIN1ActionPerformed
        new Forget().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_LOGIN9jButton_LOGIN5jButton_LOGIN1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        jTextField1.setText(jTable1.getModel().getValueAt(row, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("Identitas");
        data.addColumn ("Username");
        data.addColumn ("Nama Depan");
        data.addColumn ("Nama Belakang");
        data.addColumn ("Email");
        data.addColumn ("Password");
        data.addColumn ("Tahun Lahir");
        data.addColumn ("Alamat");
        data.addColumn ("Nomer KTP");
        data.addColumn ("Telpon");
        data.addColumn ("Jenis Kelamin");
        
        try
        {
            KoneksiDB();
            sql="select * from dbuser where namadepan='"+jTextField1.getText()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while (rs.next())
                data.addRow(new Object[]{
                     rs.getString(1), rs.getString(2),
                     rs.getString(3), rs.getString(4), 
                     rs.getString(5), rs.getString(6),
                     rs.getString(7), rs.getString(8), 
                     rs.getString(9), rs.getString(10),
                     rs.getString(11)
                });
            jTable1.setModel(data);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"GAGAL "+e.getMessage());
        }
        
        int JumlahBaris = jTable1.getRowCount();
        TableModel tableModel;
        tableModel = jTable1.getModel();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton_LOGIN11jButton_LOGIN5jButton_LOGIN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LOGIN11jButton_LOGIN5jButton_LOGIN1ActionPerformed
        ShowData(sql);
        clear();
    }//GEN-LAST:event_jButton_LOGIN11jButton_LOGIN5jButton_LOGIN1ActionPerformed

    private void btnout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnout1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnout1ActionPerformed

    private void btnsupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupActionPerformed
        lblsup.setBackground(new Color(255,51,51));

        lblakun.setBackground(new Color(255,255,255));
        lbldash.setBackground(new Color(255,255,255));
        lblout.setBackground(new Color(255,255,255));
        
        Body.removeAll();
        Body.repaint();
        Body.revalidate();
        Body.add(jSupplier);
        Body.repaint();
    }//GEN-LAST:event_btnsupActionPerformed

    private void lblsupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsupMouseClicked
        lblsup.setBackground(new Color(255,51,51));

        lblakun.setBackground(new Color(255,255,255));
        lbldash.setBackground(new Color(255,255,255));
        lblout.setBackground(new Color(255,255,255));
        
        Body.removeAll();
        Body.repaint();
        Body.revalidate();
        Body.add(jSupplier);
        Body.repaint();
    }//GEN-LAST:event_lblsupMouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int row = jTable3.getSelectedRow();
        idsup.setText(jTable3.getModel().getValueAt(row, 0).toString());
        namasup.setText(jTable3.getModel().getValueAt(row, 1).toString());
        telponsup.setText(jTable3.getModel().getValueAt(row, 2).toString());
        alamatsup.setText(jTable3.getModel().getValueAt(row, 3).toString());
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = idsup.getText();
        String nama = namasup.getText();
        String telepon = telponsup.getText();
        String alamat = alamatsup.getText();

        try{
            sql="insert into supplier(idsupplier, namasup, telepon, alamat)value"
            + "('"+ id +"','"+ nama +"','"+ telepon +"','"+ alamat +"')";
            st=con.createStatement();
            st.execute(sql);
            supplier(sql);
            clear();
            JOptionPane.showMessageDialog(null,"Data Supplier Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error\n Data Gagal Disimpan "+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id = idsup.getText();
        String nama = namasup.getText();
        String telepon = telponsup.getText();
        String alamat = alamatsup.getText();

        try
        {
            KoneksiDB();
            sql="update supplier set namasup='"+ nama +"',telepon='"+ telepon +
            "',alamat='"+ alamat +"' where idsupplier='"+ id +"'";
            st=con.createStatement();
            st.execute(sql);
            supplier(sql);
            clear();
            JOptionPane.showMessageDialog(null, "Data Supplier Berhasil Di Edit");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR \n"+e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String id = idsup.getText();
        try {
            sql="delete from supplier"
            +" where idsupplier='"+ id +"' ";
            st=con.createStatement();
            st.execute (sql);
            supplier(sql);
            clear();
            JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \n"+e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clear();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Pemesanan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Kepala;
    private javax.swing.JPanel PanelColor1;
    private javax.swing.JPanel PanelColor2;
    private javax.swing.JPanel PanelColor3;
    private javax.swing.JPanel PanelColor4;
    private javax.swing.JPanel PanelColor5;
    private javax.swing.JPanel PanelColor6;
    private javax.swing.JTextField alamatsup;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnakun;
    private javax.swing.JButton btnatas1;
    private javax.swing.JButton btnatas2;
    private javax.swing.JButton btnatas3;
    private javax.swing.JButton btnatas4;
    private javax.swing.JButton btnatas5;
    private javax.swing.JButton btnatas6;
    private javax.swing.JButton btnbwh1;
    private javax.swing.JButton btnbwh2;
    private javax.swing.JButton btnbwh3;
    private javax.swing.JButton btnbwh4;
    private javax.swing.JButton btnbwh5;
    private javax.swing.JButton btnbwh6;
    private javax.swing.JButton btndash;
    private javax.swing.JButton btnout;
    private javax.swing.JButton btnout1;
    private javax.swing.JButton btnsup;
    private javax.swing.JTextField idsup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton_LOGIN11;
    private javax.swing.JButton jButton_LOGIN9;
    private javax.swing.JScrollPane jDashboard;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JScrollPane jKaryawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jSupplier;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jam;
    private javax.swing.JLabel lblakun;
    private javax.swing.JLabel lbldash;
    private javax.swing.JLabel lblout;
    private javax.swing.JLabel lblsup;
    private javax.swing.JTextField namasup;
    private javax.swing.JTextField telponsup;
    private javax.swing.JLabel tgl;
    // End of variables declaration//GEN-END:variables
}
