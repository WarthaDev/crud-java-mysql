package A.ATampilan;
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
import javax.swing.Timer;

public class HomeTes extends javax.swing.JFrame {
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
 
    public HomeTes() {
        initComponents();
        setJam();
        KoneksiDB();
        Clear();
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
    
    private void Clear (){
        jTextField1.setText("");
        namad.setText("");
        namab.setText("");
        user.setText("");
        pass.setText("");
        emaill.setText("");
        telepon.setText("");
        noktp.setText("");
        jenis.setText("");
        lahir.setText("");
        alamatt.setText("");
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
        Body = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jDesktopPane2 = new KoneksiUI.UIHome();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton_LOGIN9 = new javax.swing.JButton();
        noktp = new javax.swing.JLabel();
        jButton_LOGIN8 = new javax.swing.JButton();
        lahir = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        telepon = new javax.swing.JLabel();
        namab = new javax.swing.JLabel();
        emaill = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jButton_LOGIN12 = new javax.swing.JButton();
        namad = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        alamatt = new javax.swing.JLabel();
        jenis = new javax.swing.JLabel();

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
                .addGap(429, 429, 429)
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
            .addGroup(KepalaLayout.createSequentialGroup()
                .addGroup(KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnMinimize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KepalaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
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

        Body.setBackground(new java.awt.Color(255, 255, 255));
        Body.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Body.setLayout(new java.awt.CardLayout());

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

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
            .addComponent(btnatas1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
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
            .addComponent(btnatas4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        PanelColor5.setBackground(new java.awt.Color(255, 203, 27));

        btnatas5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnatas5.setForeground(new java.awt.Color(255, 255, 255));
        btnatas5.setText("Cetak Report Data");
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
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
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

        jScrollPane1.setViewportView(jPanel0);

        Body.add(jScrollPane1, "card2");

        jDesktopPane2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(236, 240, 241));
        jLabel16.setText("Cari Username");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(236, 240, 241));
        jLabel12.setText("Alamat");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(236, 240, 241));
        jLabel34.setText(":");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(236, 240, 241));
        jLabel11.setText("Tanggal lahir");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(236, 240, 241));
        jLabel33.setText(":");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 240, 241));
        jLabel10.setText("No KTP");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(236, 240, 241));
        jLabel32.setText(":");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Password");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(236, 240, 241));
        jLabel31.setText(":");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Username");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(236, 240, 241));
        jLabel30.setText(":");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Nama Depan");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(236, 240, 241));
        jLabel29.setText(":");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Nama Belakang");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(236, 240, 241));
        jLabel28.setText(":");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(236, 240, 241));
        jLabel27.setText(":");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(236, 240, 241));
        jLabel15.setText("Jenis Kelamin");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(236, 240, 241));
        jLabel14.setText("No Telepon");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(236, 240, 241));
        jLabel13.setText("Email");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(236, 240, 241));
        jLabel35.setText(":");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(236, 240, 241));
        jLabel26.setText(":");

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

        noktp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        noktp.setForeground(new java.awt.Color(236, 240, 241));
        noktp.setText(" ");

        jButton_LOGIN8.setBackground(new java.awt.Color(204, 0, 0));
        jButton_LOGIN8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_LOGIN8.setForeground(new java.awt.Color(255, 255, 255));
        jButton_LOGIN8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_LOGIN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LOGIN8jButton_LOGIN4jButton_LOGINActionPerformed(evt);
            }
        });

        lahir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lahir.setForeground(new java.awt.Color(236, 240, 241));
        lahir.setText(" ");

        pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(236, 240, 241));
        pass.setText(" ");

        telepon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telepon.setForeground(new java.awt.Color(236, 240, 241));
        telepon.setText(" ");

        namab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        namab.setForeground(new java.awt.Color(236, 240, 241));
        namab.setText(" ");

        emaill.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emaill.setForeground(new java.awt.Color(236, 240, 241));
        emaill.setText(" ");

        user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user.setForeground(new java.awt.Color(236, 240, 241));
        user.setText(" ");

        jButton_LOGIN12.setBackground(new java.awt.Color(204, 0, 0));
        jButton_LOGIN12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_LOGIN12.setForeground(new java.awt.Color(255, 255, 255));
        jButton_LOGIN12.setText("Bersihkan");
        jButton_LOGIN12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_LOGIN12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LOGIN12ActionPerformed(evt);
            }
        });

        namad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        namad.setForeground(new java.awt.Color(236, 240, 241));
        namad.setText(" ");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(236, 240, 241));
        jLabel36.setText(":");

        alamatt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        alamatt.setForeground(new java.awt.Color(236, 240, 241));
        alamatt.setText(" ");
        alamatt.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jenis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jenis.setForeground(new java.awt.Color(236, 240, 241));
        jenis.setText(" ");

        jDesktopPane2.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton_LOGIN9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(noktp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton_LOGIN8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lahir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(pass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(telepon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(namab, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(emaill, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(user, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton_LOGIN12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(namad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel36, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(alamatt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jenis, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_LOGIN12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_LOGIN9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telepon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emaill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jenis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noktp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alamatt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_LOGIN8)
                                .addGap(12, 12, 12))
                            .addComponent(namad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(jLabel36))
                    .addComponent(jButton_LOGIN8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel26))
                    .addComponent(namad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namab, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel27)))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(user)
                    .addComponent(jLabel28))
                .addGap(22, 22, 22)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pass)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(emaill)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(telepon)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(noktp)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jenis)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lahir)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel35))
                    .addComponent(alamatt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_LOGIN12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_LOGIN9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jDesktopPane2);

        Body.add(jScrollPane3, "card5");

        jDesktopPane1.setLayer(Kepala, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btndash, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbldash, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnakun, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblakun, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblout, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnout, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Body, javax.swing.JLayeredPane.DRAG_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Kepala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btndash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbldash, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnakun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblakun, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblout, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(Kepala, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(btndash)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbldash, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(btnakun)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblakun, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(btnout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblout, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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
        lbldash.setBackground(new Color(255,255,255));

        new Awal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnoutActionPerformed

    private void lbloutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbloutMouseClicked
        lblout.setBackground(new Color(255,51,51));

        lblakun.setBackground(new Color(255,255,255));
        lbldash.setBackground(new Color(255,255,255));

        new Awal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbloutMouseClicked

    private void lblakunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblakunMouseClicked
        lblakun.setBackground(new Color(255,51,51));

        lbldash.setBackground(new Color(255,255,255));
        lblout.setBackground(new Color(255,255,255));

        Body.removeAll();
        Body.repaint();
        Body.revalidate();
        Body.repaint();
        Body.revalidate();
    }//GEN-LAST:event_lblakunMouseClicked

    private void btnakunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnakunActionPerformed
        lblakun.setBackground(new Color(255,51,51));

        lbldash.setBackground(new Color(255,255,255));
        lblout.setBackground(new Color(255,255,255));

        Body.removeAll();
        Body.repaint();
        Body.revalidate();
        Body.add(jScrollPane3);
        Body.repaint();
        Body.revalidate();
    }//GEN-LAST:event_btnakunActionPerformed

    private void lbldashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldashMouseClicked
        lbldash.setBackground(new Color(255,51,51));

        lblakun.setBackground(new Color(255,255,255));
        lblout.setBackground(new Color(255,255,255));

        Body.removeAll();
        Body.repaint();
        Body.revalidate();
        Body.add(jScrollPane1);
        Body.repaint();
        Body.revalidate();
    }//GEN-LAST:event_lbldashMouseClicked

    private void btndashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashActionPerformed
        lbldash.setBackground(new Color(255,51,51));

        lblakun.setBackground(new Color(255,255,255));
        lblout.setBackground(new Color(255,255,255));

        Body.removeAll();
        Body.repaint();
        Body.revalidate();
        Body.add(jScrollPane1);
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
        new BarangTersedia().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbwh1ActionPerformed

    private void btnatas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatas1ActionPerformed
        new BarangTersedia().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatas1ActionPerformed

    private void btnatas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatas2ActionPerformed
        new Beli().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatas2ActionPerformed

    private void btnbwh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbwh2ActionPerformed
        new Beli().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbwh2ActionPerformed

    private void btnbwh3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbwh3ActionPerformed
        new Simulator().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbwh3ActionPerformed

    private void btnatas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatas3ActionPerformed
        new Simulator().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatas3ActionPerformed

    private void btnbwh4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbwh4ActionPerformed
        new BarangTerbaru().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbwh4ActionPerformed

    private void btnatas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatas4ActionPerformed
        new BarangTerbaru().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatas4ActionPerformed

    private void btnbwh5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbwh5ActionPerformed
        new Laporan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbwh5ActionPerformed

    private void btnatas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatas5ActionPerformed
      String reportSource = null;
        new Laporan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatas5ActionPerformed

    private void btnbwh6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbwh6ActionPerformed
        new LaporanTransaksi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbwh6ActionPerformed

    private void btnatas6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatas6ActionPerformed
        new LaporanTransaksi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnatas6ActionPerformed

    private void jButton_LOGIN9jButton_LOGIN5jButton_LOGIN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LOGIN9jButton_LOGIN5jButton_LOGIN1ActionPerformed
        new Forget().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_LOGIN9jButton_LOGIN5jButton_LOGIN1ActionPerformed

    private void jButton_LOGIN8jButton_LOGIN4jButton_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LOGIN8jButton_LOGIN4jButton_LOGINActionPerformed
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost/banu123","root","");
            sql="select * from dbuser where username='"+jTextField1.getText()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);

            while(rs.next())
            {
                namad.setText(rs.getString("namadepan"));
                namab.setText(rs.getString("namabelakang"));
                user.setText(rs.getString("username"));
                pass.setText(rs.getString("kunci"));
                emaill.setText(rs.getString("email"));
                telepon.setText(rs.getString("telpon"));
                noktp.setText(rs.getString("ktp"));
                jenis.setText(rs.getString("jeniskelamin"));
                lahir.setText(rs.getString("tahun"));
                alamatt.setText(rs.getString("alamat"));
            }
        }catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton_LOGIN8jButton_LOGIN4jButton_LOGINActionPerformed

    private void jButton_LOGIN12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LOGIN12ActionPerformed
        Clear();
    }//GEN-LAST:event_jButton_LOGIN12ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeTes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeTes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeTes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeTes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeTes().setVisible(true);
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
    private javax.swing.JLabel alamatt;
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
    private javax.swing.JLabel emaill;
    private javax.swing.JButton jButton_LOGIN12;
    private javax.swing.JButton jButton_LOGIN8;
    private javax.swing.JButton jButton_LOGIN9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jam;
    private javax.swing.JLabel jenis;
    private javax.swing.JLabel lahir;
    private javax.swing.JLabel lblakun;
    private javax.swing.JLabel lbldash;
    private javax.swing.JLabel lblout;
    private javax.swing.JLabel namab;
    private javax.swing.JLabel namad;
    private javax.swing.JLabel noktp;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel telepon;
    private javax.swing.JLabel tgl;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
