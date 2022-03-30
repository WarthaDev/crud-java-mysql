package A.ATampilan;

import KoneksiDatabase.WaktuSekarang;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Simulator extends javax.swing.JFrame {
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
    public Simulator() {
        initComponents();
        setJam();
        combo();
        icon();
        KoneksiDB();
        setExtendedState(MAXIMIZED_BOTH);
    }        
    
    private void KoneksiDB (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banu123", "root", "");
        } catch (Exception e) {
            System.out.println("ERROR \n Gagal Memuat KeDatabase"+e);
        }
    }
    
    public void combo(){
        cpro.addItem("Pilih Processor");
        cmobo.addItem("Pilih Motherboard");
        cvga.addItem("Pilih VGA");
        cram.addItem("Pilih RAM");
        cssd.addItem("Pilih SSD");
        chdd.addItem("Pilih HDD");
        cpsu.addItem("Pilih Power Supply");
        cmon.addItem("Pilih Monitor");
        ckey.addItem("Pilih Keyboard");
        cmous.addItem("Pilih Mouse");
        cfan.addItem("Pilih Fan");
        cpro.addItem("Processor");
        cmobo.addItem("Motherboard");
        cvga.addItem("VGA");
        cram.addItem("RAM");
        cssd.addItem("SSD");
        chdd.addItem("HDD");
        cpsu.addItem("Power Supply");
        cmon.addItem("Monitor");
        ckey.addItem("Keyboard");
        cmous.addItem("Mouse");
        cfan.addItem("Fan");
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
        btnMaximize = new javax.swing.JButton();
        Body = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDesktopPane2 = new KoneksiUI.UIMini();
        jComboBox1 = new javax.swing.JComboBox<>();
        h1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        h3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        h4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        h5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        h6 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        h7 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        h8 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        h9 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        h10 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        h11 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        a4 = new javax.swing.JTextField();
        a5 = new javax.swing.JTextField();
        a6 = new javax.swing.JTextField();
        a7 = new javax.swing.JTextField();
        a8 = new javax.swing.JTextField();
        a9 = new javax.swing.JTextField();
        a10 = new javax.swing.JTextField();
        a11 = new javax.swing.JTextField();
        t1 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        t9 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        t10 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        t11 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        cpro = new javax.swing.JComboBox<>();
        cmobo = new javax.swing.JComboBox<>();
        cvga = new javax.swing.JComboBox<>();
        cram = new javax.swing.JComboBox<>();
        cssd = new javax.swing.JComboBox<>();
        chdd = new javax.swing.JComboBox<>();
        cpsu = new javax.swing.JComboBox<>();
        cmon = new javax.swing.JComboBox<>();
        ckey = new javax.swing.JComboBox<>();
        cmous = new javax.swing.JComboBox<>();
        cfan = new javax.swing.JComboBox<>();
        t12 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        PanelBanu = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        mirrorbottom = new javax.swing.JButton();
        textmirrorbanu = new javax.swing.JTextField();
        btnbwh10 = new javax.swing.JButton();

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
        jam.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jamAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

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

        btnMaximize.setBackground(new java.awt.Color(255, 255, 255));
        btnMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarTampilan/Maximize.png"))); // NOI18N
        btnMaximize.setContentAreaFilled(false);
        btnMaximize.setFocusable(false);
        btnMaximize.setOpaque(true);
        btnMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaximizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaximizeMouseExited(evt);
            }
        });
        btnMaximize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KepalaLayout = new javax.swing.GroupLayout(Kepala);
        Kepala.setLayout(KepalaLayout);
        KepalaLayout.setHorizontalGroup(
            KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KepalaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgl)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jam)
                .addGap(18, 18, 18)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMaximize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        KepalaLayout.setVerticalGroup(
            KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KepalaLayout.createSequentialGroup()
                .addGroup(KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KepalaLayout.createSequentialGroup()
                        .addGroup(KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMaximize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(KepalaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(KepalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Body.setBackground(new java.awt.Color(255, 255, 255));
        Body.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Body.setLayout(new java.awt.CardLayout());

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        jDesktopPane2.setBackground(new java.awt.Color(0, 153, 153));
        jDesktopPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane2.setFocusCycleRoot(false);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        h1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        h1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Rp.");

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Rp.");

        h2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        h2.setForeground(new java.awt.Color(255, 255, 255));

        h3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        h3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Rp.");

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        h4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        h4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Rp.");

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        h5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        h5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Rp.");

        jComboBox5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Rp.");

        h6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        h6.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Rp.");

        h7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        h7.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Rp.");

        h8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        h8.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Rp.");

        h9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        h9.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Rp.");

        h10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        h10.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });

        h11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        h11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Rp.");

        a1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a1KeyReleased(evt);
            }
        });

        a2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a2KeyReleased(evt);
            }
        });

        a3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a3KeyReleased(evt);
            }
        });

        a4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a4KeyReleased(evt);
            }
        });

        a5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a5KeyReleased(evt);
            }
        });

        a6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a6KeyReleased(evt);
            }
        });

        a7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a7KeyReleased(evt);
            }
        });

        a8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a8KeyReleased(evt);
            }
        });

        a9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a9KeyReleased(evt);
            }
        });

        a10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a10KeyReleased(evt);
            }
        });

        a11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a11KeyReleased(evt);
            }
        });

        t1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("Total Beli : Rp.");

        t2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("Total Beli : Rp.");

        t3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("Total Beli : Rp.");

        t4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("Total Beli : Rp.");

        t5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel90.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("Total Beli : Rp.");

        t6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel92.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("Total Beli : Rp.");

        t7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel94.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Total Beli : Rp.");

        t8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("Total Beli : Rp.");

        t9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel98.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Total Beli : Rp.");

        t10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel100.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("Total Beli : Rp.");

        t11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel102.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("Total Beli : Rp.");

        cpro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cproActionPerformed(evt);
            }
        });

        cmobo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmoboActionPerformed(evt);
            }
        });

        cvga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cvga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvgaActionPerformed(evt);
            }
        });

        cram.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cramActionPerformed(evt);
            }
        });

        cssd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cssd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cssdActionPerformed(evt);
            }
        });

        chdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chddActionPerformed(evt);
            }
        });

        cpsu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cpsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpsuActionPerformed(evt);
            }
        });

        cmon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmonActionPerformed(evt);
            }
        });

        ckey.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckeyActionPerformed(evt);
            }
        });

        cmous.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmousActionPerformed(evt);
            }
        });

        cfan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cfan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfanActionPerformed(evt);
            }
        });

        t12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        t12.setForeground(new java.awt.Color(255, 255, 255));
        t12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel103.setText("Semua Total : Rp.");

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Selesai");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mirror");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 0, 0));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 0, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 0, 0));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 0, 0));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 0, 0));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 0, 0));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(h1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(h2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(h3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jComboBox3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(h4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jComboBox4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(h5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jComboBox5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jComboBox6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(h6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jComboBox7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(h7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jComboBox8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(h8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jComboBox9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel43, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(h9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jComboBox10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel47, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(h10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jComboBox11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(h11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel52, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(a1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(a2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(a3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(a4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(a5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(a6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(a7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(a8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(a9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(a10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(a11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(t1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel82, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(t2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel84, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(t3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel86, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(t4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel88, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(t5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel90, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(t6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel92, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(t7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel94, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(t8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel96, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(t9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel98, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(t10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel100, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(t11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel102, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cpro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cmobo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cvga, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cram, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cssd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(chdd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cpsu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cmon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(ckey, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cmous, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cfan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(t12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel103, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmobo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cvga, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cram, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cssd, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chdd, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpsu, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmon, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckey, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmous, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cfan, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, 0, 491, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(cpro, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(96, 96, 96)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel15)
                                    .addGap(6, 6, 6)
                                    .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel18)
                                    .addGap(6, 6, 6)
                                    .addComponent(h3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel22)
                                    .addGap(6, 6, 6)
                                    .addComponent(h4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel26)
                                    .addGap(6, 6, 6)
                                    .addComponent(h5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel29)
                                    .addGap(6, 6, 6)
                                    .addComponent(h6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel35)
                                    .addGap(6, 6, 6)
                                    .addComponent(h7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel39)
                                    .addGap(6, 6, 6)
                                    .addComponent(h8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel43)
                                    .addGap(6, 6, 6)
                                    .addComponent(h9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel47)
                                    .addGap(6, 6, 6)
                                    .addComponent(h10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                                    .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel52)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(h11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12)
                                .addGap(6, 6, 6)
                                .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel84)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel86)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel88)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel90)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel92)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel96)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel98)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel100)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel102)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(h1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cpro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmobo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cvga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(h3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cram, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(h4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cssd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(h5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(h6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpsu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(h7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(h8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckey, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(h9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmous, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(h10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cfan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(h11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jComboBox1.getAccessibleContext().setAccessibleName("");
        jLabel12.getAccessibleContext().setAccessibleName("");
        jComboBox2.getAccessibleContext().setAccessibleName("");
        jLabel15.getAccessibleContext().setAccessibleName("");
        jLabel18.getAccessibleContext().setAccessibleName("");
        jComboBox3.getAccessibleContext().setAccessibleName("");
        jLabel22.getAccessibleContext().setAccessibleName("");
        jComboBox4.getAccessibleContext().setAccessibleName("");
        jLabel26.getAccessibleContext().setAccessibleName("");
        jComboBox5.getAccessibleContext().setAccessibleName("");
        jComboBox6.getAccessibleContext().setAccessibleName("");
        jLabel29.getAccessibleContext().setAccessibleName("");
        jComboBox7.getAccessibleContext().setAccessibleName("");
        jLabel35.getAccessibleContext().setAccessibleName("");
        jComboBox8.getAccessibleContext().setAccessibleName("");
        jLabel39.getAccessibleContext().setAccessibleName("");
        jComboBox9.getAccessibleContext().setAccessibleName("");
        jLabel43.getAccessibleContext().setAccessibleName("");
        jComboBox10.getAccessibleContext().setAccessibleName("");
        jLabel47.getAccessibleContext().setAccessibleName("");
        jComboBox11.getAccessibleContext().setAccessibleName("");
        jLabel52.getAccessibleContext().setAccessibleName("");
        a1.getAccessibleContext().setAccessibleName("");
        a2.getAccessibleContext().setAccessibleName("");
        a3.getAccessibleContext().setAccessibleName("");
        a4.getAccessibleContext().setAccessibleName("");
        a5.getAccessibleContext().setAccessibleName("");
        a6.getAccessibleContext().setAccessibleName("");
        a7.getAccessibleContext().setAccessibleName("");
        a8.getAccessibleContext().setAccessibleName("");
        a9.getAccessibleContext().setAccessibleName("");
        a10.getAccessibleContext().setAccessibleName("");
        a11.getAccessibleContext().setAccessibleName("");
        jLabel82.getAccessibleContext().setAccessibleName("");
        jLabel84.getAccessibleContext().setAccessibleName("");
        jLabel86.getAccessibleContext().setAccessibleName("");
        jLabel88.getAccessibleContext().setAccessibleName("");
        jLabel90.getAccessibleContext().setAccessibleName("");
        jLabel92.getAccessibleContext().setAccessibleName("");
        jLabel94.getAccessibleContext().setAccessibleName("");
        jLabel96.getAccessibleContext().setAccessibleName("");
        jLabel98.getAccessibleContext().setAccessibleName("");
        jLabel100.getAccessibleContext().setAccessibleName("");
        jLabel102.getAccessibleContext().setAccessibleName("");

        jScrollPane1.setViewportView(jDesktopPane2);

        Body.add(jScrollPane1, "card2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel3.setText("Simulator Testing Banu Test Mirror");

        mirrorbottom.setText("Balik");
        mirrorbottom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mirrorbottomActionPerformed(evt);
            }
        });

        textmirrorbanu.setText("Banu");

        javax.swing.GroupLayout PanelBanuLayout = new javax.swing.GroupLayout(PanelBanu);
        PanelBanu.setLayout(PanelBanuLayout);
        PanelBanuLayout.setHorizontalGroup(
            PanelBanuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBanuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBanuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1216, Short.MAX_VALUE)
                    .addGroup(PanelBanuLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(textmirrorbanu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mirrorbottom)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelBanuLayout.setVerticalGroup(
            PanelBanuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBanuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBanuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mirrorbottom)
                    .addComponent(textmirrorbanu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );

        Body.add(PanelBanu, "card3");

        btnbwh10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnbwh10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarTampilan/home_1.png"))); // NOI18N
        btnbwh10.setContentAreaFilled(false);
        btnbwh10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbwh10.setFocusable(false);
        btnbwh10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbwh10ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(Kepala, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Body, javax.swing.JLayeredPane.DRAG_LAYER);
        jDesktopPane1.setLayer(btnbwh10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Kepala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(btnbwh10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(Kepala, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbwh10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        btnMinimize.setBackground(new Color(229,229,229));
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseExited
        btnMinimize.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnMinimizeMouseExited

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(new Color(232,17,35));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jamAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jamAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jamAncestorAdded

    private void KepalaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KepalaMouseDragged
        if(maximized){
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - xMouse, y - yMouse);
        }
    }//GEN-LAST:event_KepalaMouseDragged

    private void KepalaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KepalaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_KepalaMousePressed

    private void btnMaximizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMouseEntered
        btnMaximize.setBackground(new Color(229,229,229));
    }//GEN-LAST:event_btnMaximizeMouseEntered

    private void btnMaximizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMouseExited
        btnMaximize.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnMaximizeMouseExited

    private void btnMaximizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximizeActionPerformed
        if(maximized){
            //handle fullscreen - taskbar
            Simulator.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Simulator.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        }else{
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }
    }//GEN-LAST:event_btnMaximizeActionPerformed

    private void btnbwh10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbwh10ActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbwh10ActionPerformed

    private void cfanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfanActionPerformed
        if(cfan.getSelectedItem().equals("Pilih Fan"))
        {
            jComboBox11.removeAllItems();
            a11.setText("0"); 
            h11.setText(""); 
            t11.setText(""); 
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            KoneksiDB();
            st=con.createStatement();
            rs=st.executeQuery("Select * from addbarang where namabarang like '%" + cfan.getSelectedItem()+ "%'");
            while (rs.next()) {
                model.addElement("" + rs.getString("modelbarang") + "");
                rs.getString(3)
                ;
                jComboBox11.setModel(model);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed show data in combobox komponen " + ex.getMessage());
        }
    }//GEN-LAST:event_cfanActionPerformed

    private void cmousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmousActionPerformed
        if(cmous.getSelectedItem().equals("Pilih Mouse"))
        {
            jComboBox10.removeAllItems();
            a10.setText("0"); 
            h10.setText(""); 
            t10.setText(""); 
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            KoneksiDB();
            st=con.createStatement();
            rs=st.executeQuery("Select * from addbarang where namabarang like '%" + cmous.getSelectedItem()+ "%'");
            while (rs.next()) {
                model.addElement("" + rs.getString("modelbarang") + "");
                rs.getString(3)
                ;
                jComboBox10.setModel(model);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed show data in combobox komponen " + ex.getMessage());
        }
    }//GEN-LAST:event_cmousActionPerformed

    private void ckeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckeyActionPerformed
        if(ckey.getSelectedItem().equals("Pilih Keyboard"))
        {
            jComboBox9.removeAllItems();
            a9.setText("0"); 
            h9.setText(""); 
            t9.setText(""); 
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            KoneksiDB();
            st=con.createStatement();
            rs=st.executeQuery("Select * from addbarang where namabarang like '%" + ckey.getSelectedItem()+ "%'");
            while (rs.next()) {
                model.addElement("" + rs.getString("modelbarang") + "");
                rs.getString(3)
                ;
                jComboBox9.setModel(model);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed show data in combobox komponen " + ex.getMessage());
        }
    }//GEN-LAST:event_ckeyActionPerformed

    private void cmonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmonActionPerformed
        if(cmon.getSelectedItem().equals("Pilih Monitor"))
        {
            jComboBox8.removeAllItems();
            a8.setText("0"); 
            h8.setText(""); 
            t8.setText(""); 
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            KoneksiDB();
            st=con.createStatement();
            rs=st.executeQuery("Select * from addbarang where namabarang like '%" + cmon.getSelectedItem()+ "%'");
            while (rs.next()) {
                model.addElement("" + rs.getString("modelbarang") + "");
                rs.getString(3)
                ;
                jComboBox8.setModel(model);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed show data in combobox komponen " + ex.getMessage());
        }
    }//GEN-LAST:event_cmonActionPerformed

    private void cpsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpsuActionPerformed
        if(cpsu.getSelectedItem().equals("Pilih Power Supply"))
        {
            jComboBox7.removeAllItems();
            a7.setText("0"); 
            h7.setText(""); 
            t7.setText(""); 
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            KoneksiDB();
            st=con.createStatement();
            rs=st.executeQuery("Select * from addbarang where namabarang like '%" + cpsu.getSelectedItem()+ "%'");
            while (rs.next()) {
                model.addElement("" + rs.getString("modelbarang") + "");
                rs.getString(3)
                ;
                jComboBox7.setModel(model);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed show data in combobox komponen " + ex.getMessage());
        }
    }//GEN-LAST:event_cpsuActionPerformed

    private void chddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chddActionPerformed
        if(chdd.getSelectedItem().equals("Pilih HDD"))
        {
            jComboBox6.removeAllItems();
            a6.setText("0"); 
            h6.setText(""); 
            t6.setText(""); 
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            KoneksiDB();
            st=con.createStatement();
            rs=st.executeQuery("Select * from addbarang where namabarang like '%" + chdd.getSelectedItem()+ "%'");
            while (rs.next()) {
                model.addElement("" + rs.getString("modelbarang") + "");
                rs.getString(3)
                ;
                jComboBox6.setModel(model);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed show data in combobox komponen " + ex.getMessage());
        }
    }//GEN-LAST:event_chddActionPerformed

    private void cssdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cssdActionPerformed
        if(cssd.getSelectedItem().equals("Pilih SSD"))
        {
            jComboBox5.removeAllItems();
            a5.setText("0"); 
            h5.setText(""); 
            t5.setText(""); 
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            KoneksiDB();
            st=con.createStatement();
            rs=st.executeQuery("Select * from addbarang where namabarang like '%" + cssd.getSelectedItem()+ "%'");
            while (rs.next()) {
                model.addElement("" + rs.getString("modelbarang") + "");
                rs.getString(3)
                ;
                jComboBox5.setModel(model);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed show data in combobox komponen " + ex.getMessage());
        }
    }//GEN-LAST:event_cssdActionPerformed

    private void cramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cramActionPerformed
        if(cram.getSelectedItem().equals("Pilih RAM"))
        {
            jComboBox4.removeAllItems();
            a4.setText("0"); 
            h4.setText(""); 
            t4.setText(""); 
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            KoneksiDB();
            st=con.createStatement();
            rs=st.executeQuery("Select * from addbarang where namabarang like '%" + cram.getSelectedItem()+ "%'");
            while (rs.next()) {
                model.addElement("" + rs.getString("modelbarang") + "");
                rs.getString(3)
                ;
                jComboBox4.setModel(model);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed show data in combobox komponen " + ex.getMessage());
        }
    }//GEN-LAST:event_cramActionPerformed

    private void cvgaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvgaActionPerformed
        if(cvga.getSelectedItem().equals("Pilih VGA"))
        {
            jComboBox3.removeAllItems();
            a3.setText("0"); 
            h3.setText(""); 
            t3.setText(""); 
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            KoneksiDB();
            st=con.createStatement();
            rs=st.executeQuery("Select * from addbarang where namabarang like '%" + cvga.getSelectedItem()+ "%'");
            while (rs.next()) {
                model.addElement("" + rs.getString("modelbarang") + "");
                rs.getString(3)
                ;
                jComboBox3.setModel(model);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed show data in combobox komponen " + ex.getMessage());
        }
    }//GEN-LAST:event_cvgaActionPerformed

    private void cmoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmoboActionPerformed
        if(cmobo.getSelectedItem().equals("Pilih Motherboard"))
        {
            jComboBox2.removeAllItems();
            a2.setText("0"); 
            h2.setText(""); 
            t2.setText(""); 
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            KoneksiDB();
            st=con.createStatement();
            rs=st.executeQuery("Select * from addbarang where namabarang like '%" + cmobo.getSelectedItem()+ "%'");
            while (rs.next()) {
                model.addElement("" + rs.getString("modelbarang") + "");
                rs.getString(3)
                ;
                jComboBox2.setModel(model);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed show data in combobox komponen " + ex.getMessage());
        }
    }//GEN-LAST:event_cmoboActionPerformed

    private void cproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cproActionPerformed
        if(cpro.getSelectedItem().equals("Pilih Processor"))
        {
            jComboBox1.removeAllItems();
            a1.setText("0"); 
            h1.setText(""); 
            t1.setText(""); 
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            KoneksiDB();
            st=con.createStatement();
            rs=st.executeQuery("Select * from addbarang where namabarang like '%" + cpro.getSelectedItem()+ "%'");
            while (rs.next()) {
                model.addElement("" + rs.getString("modelbarang") + "");
                rs.getString(3)
                ;
                jComboBox1.setModel(model);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed show data in combobox komponen " + ex.getMessage());
        }
    }//GEN-LAST:event_cproActionPerformed

    private void a11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a11KeyReleased
        h11.getText();
        a11.getText();
        double satuan = Double.parseDouble(h11.getText());
        double total = Double.parseDouble(a11.getText());
        DecimalFormat df = new DecimalFormat("#.##");
        t11.setText(df.format(satuan * total));
    }//GEN-LAST:event_a11KeyReleased

    private void a10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a10KeyReleased
        h10.getText();
        a10.getText();
        double satuan = Double.parseDouble(h10.getText());
        double total = Double.parseDouble(a10.getText());
        DecimalFormat df = new DecimalFormat("#.##");
        t10.setText(df.format(satuan * total));
    }//GEN-LAST:event_a10KeyReleased

    private void a9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a9KeyReleased
        h9.getText();
        a9.getText();
        double satuan = Double.parseDouble(h9.getText());
        double total = Double.parseDouble(a9.getText());
        DecimalFormat df = new DecimalFormat("#.##");
        t9.setText(df.format(satuan * total));
    }//GEN-LAST:event_a9KeyReleased

    private void a8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a8KeyReleased
        h8.getText();
        a8.getText();
        double satuan = Double.parseDouble(h8.getText());
        double total = Double.parseDouble(a8.getText());
        DecimalFormat df = new DecimalFormat("#.##");
        t8.setText(df.format(satuan * total));
    }//GEN-LAST:event_a8KeyReleased

    private void a7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a7KeyReleased
        h7.getText();
        a7.getText();
        double satuan = Double.parseDouble(h7.getText());
        double total = Double.parseDouble(a7.getText());
        DecimalFormat df = new DecimalFormat("#.##");
        t7.setText(df.format(satuan * total));
    }//GEN-LAST:event_a7KeyReleased

    private void a6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a6KeyReleased
        h6.getText();
        a6.getText();
        double satuan = Double.parseDouble(h6.getText());
        double total = Double.parseDouble(a6.getText());
        DecimalFormat df = new DecimalFormat("#.##");
        t6.setText(df.format(satuan * total));
    }//GEN-LAST:event_a6KeyReleased

    private void a5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a5KeyReleased
        h5.getText();
        a5.getText();
        double satuan = Double.parseDouble(h5.getText());
        double total = Double.parseDouble(a4.getText());
        DecimalFormat df = new DecimalFormat("#.##");
        t5.setText(df.format(satuan * total));
    }//GEN-LAST:event_a5KeyReleased

    private void a4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a4KeyReleased
        h4.getText();
        a4.getText();
        double satuan = Double.parseDouble(h4.getText());
        double total = Double.parseDouble(a4.getText());
        DecimalFormat df = new DecimalFormat("#.##");
        t4.setText(df.format(satuan * total));
    }//GEN-LAST:event_a4KeyReleased

    private void a3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a3KeyReleased
        h3.getText();
        a3.getText();
        double satuan = Double.parseDouble(h3.getText());
        double total = Double.parseDouble(a3.getText());
        DecimalFormat df = new DecimalFormat("#.##");
        t3.setText(df.format(satuan * total));
    }//GEN-LAST:event_a3KeyReleased

    private void a2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a2KeyReleased
        h2.getText();
        a2.getText();
        double satuan = Double.parseDouble(h2.getText());
        double total = Double.parseDouble(a2.getText());
        DecimalFormat df = new DecimalFormat("#.##");
        t2.setText(df.format(satuan * total));
    }//GEN-LAST:event_a2KeyReleased

    private void a1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a1KeyReleased
        h1.getText();
        a1.getText();
        double satuan = Double.parseDouble(h1.getText());
        double total = Double.parseDouble(a1.getText());
        DecimalFormat df = new DecimalFormat("#.##");
        t1.setText(df.format(satuan * total));
    }//GEN-LAST:event_a1KeyReleased

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        try
        {
            KoneksiDB();
            sql="select * from addbarang where modelbarang='"+jComboBox11.getSelectedItem()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);

            while(rs.next())
            {
                h11.setText(rs.getString("harga"));
                String sc=a11.getText();
                int sk=Integer.parseInt(sc);
                int nol=0;
                if(sk <= nol){
                }
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        try
        {
            KoneksiDB();
            sql="select * from addbarang where modelbarang='"+jComboBox10.getSelectedItem()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);

            while(rs.next())
            {
                h10.setText(rs.getString("harga"));
                String sc=a10.getText();
                int sk=Integer.parseInt(sc);
                int nol=0;
                if(sk <= nol){
                }
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        try
        {
            KoneksiDB();
            sql="select * from addbarang where modelbarang='"+jComboBox9.getSelectedItem()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);

            while(rs.next())
            {
                h9.setText(rs.getString("harga"));
                String sc=a9.getText();
                int sk=Integer.parseInt(sc);
                int nol=0;
                if(sk <= nol){
                }
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        try
        {
            KoneksiDB();
            sql="select * from addbarang where modelbarang='"+jComboBox7.getSelectedItem()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);

            while(rs.next())
            {
                h7.setText(rs.getString("harga"));
                String sc=a7.getText();
                int sk=Integer.parseInt(sc);
                int nol=0;
                if(sk <= nol){
                }
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        try
        {
            KoneksiDB();
            sql="select * from addbarang where modelbarang='"+jComboBox6.getSelectedItem()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);

            while(rs.next())
            {
                h6.setText(rs.getString("harga"));
                String sc=a6.getText();
                int sk=Integer.parseInt(sc);
                int nol=0;
                if(sk <= nol){
                }
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        try
        {
            KoneksiDB();
            sql="select * from addbarang where modelbarang='"+jComboBox5.getSelectedItem()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);

            while(rs.next())
            {
                h5.setText(rs.getString("harga"));
                String sc=a5.getText();
                int sk=Integer.parseInt(sc);
                int nol=0;
                if(sk <= nol){
                }
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        try
        {
            KoneksiDB();
            sql="select * from addbarang where modelbarang='"+jComboBox4.getSelectedItem()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);

            while(rs.next())
            {
                h4.setText(rs.getString("harga"));
                String sc=a4.getText();
                int sk=Integer.parseInt(sc);
                int nol=0;
                if(sk <= nol){
                }
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        try
        {
            KoneksiDB();
            sql="select * from addbarang where modelbarang='"+jComboBox3.getSelectedItem()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);

            while(rs.next())
            {
                h3.setText(rs.getString("harga"));
                String sc=a3.getText();
                int sk=Integer.parseInt(sc);
                int nol=0;
                if(sk <= nol){
                }
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        try
        {
            KoneksiDB();
            sql="select * from addbarang where modelbarang='"+jComboBox2.getSelectedItem()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);

            while(rs.next())
            {
                h2.setText(rs.getString("harga"));
                String sc=a2.getText();
                int sk=Integer.parseInt(sc);
                int nol=0;
                if(sk <= nol){
                }
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try
        {
            KoneksiDB();
            sql="select * from addbarang where modelbarang='"+jComboBox1.getSelectedItem()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);

            while(rs.next())
            {
                h1.setText(rs.getString("harga"));
                String sc=a1.getText();
                int sk=Integer.parseInt(sc);
                int nol=0;
                if(sk <= nol){
                }
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        try
        {
            KoneksiDB();
            sql="select * from addbarang where modelbarang='"+jComboBox8.getSelectedItem()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);

            while(rs.next())
            {
                h8.setText(rs.getString("harga"));
                String sc=a8.getText();
                int sk=Integer.parseInt(sc);
                int nol=0;
                if(sk <= nol){
                }
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String textbanu = textmirrorbanu.getText();
        
        try{
            sql="delete from simulator"
                    +" where nama ='"+ textbanu +"' ";
            st=con.createStatement();
            st.execute(sql);
            new Simulator().setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null,"Berhasil Di Refresh :D");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \n"+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mirrorbottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mirrorbottomActionPerformed
        Body.removeAll();
        Body.repaint();
        Body.revalidate();
        Body.add(jScrollPane1);
        Body.repaint();
        Body.revalidate();
    }//GEN-LAST:event_mirrorbottomActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Body.removeAll();
        Body.repaint();
        Body.revalidate();
        Body.add(PanelBanu);
        Body.repaint();
        Body.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String banu1 = t1.getText();
        String textbanu = textmirrorbanu.getText();
        
        try{
            sql="insert into simulator (harga, nama)value"
            + "('"+ banu1 +"','"+ textbanu +"')";
            st=con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error pecahkan masalah\n"+e.getMessage());
        }        
        //simulator tabel banu
        if(textmirrorbanu.getText().equals("")) 
        {
            t12.setText(""); 
        }
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("Nama");
        data.addColumn ("Harga");
        
        try
        {
            KoneksiDB();
            sql="select * from simulator where nama='"+textmirrorbanu.getText()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while (rs.next())
                data.addRow(new Object[]{
                    rs.getString(1), rs.getString(2)
                });
            jTable1.setModel(data);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"GAGAL "+e.getMessage());
        }
        
        int JumlahBaris = jTable1.getRowCount();
        int Total = 0;
        int Harga;
        TableModel tableModel;
        tableModel = jTable1.getModel();
        for (int i = 0; i < JumlahBaris; i++) {
            Harga = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            Total = (Total + Harga);
            DecimalFormat df = new DecimalFormat("");
            t12.setText(df.format(Total));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String banu2 = t2.getText();
        String textbanu = textmirrorbanu.getText();
        
        try{
            sql="insert into simulator (harga, nama)value"
            + "('"+ banu2 +"','"+ textbanu +"')";
            st=con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error pecahkan masalah\n"+e.getMessage());
        }       
        //simulator tabel banu
        if(textmirrorbanu.getText().equals("")) 
        {
            t12.setText(""); 
        }
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("Nama");
        data.addColumn ("Harga");
        
        try
        {
            KoneksiDB();
            sql="select * from simulator where nama='"+textmirrorbanu.getText()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while (rs.next())
                data.addRow(new Object[]{
                    rs.getString(1), rs.getString(2)
                });
            jTable1.setModel(data);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"GAGAL "+e.getMessage());
        }
        
        int JumlahBaris = jTable1.getRowCount();
        int Total = 0;
        int Harga;
        TableModel tableModel;
        tableModel = jTable1.getModel();
        for (int i = 0; i < JumlahBaris; i++) {
            Harga = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            Total = (Total + Harga);
            DecimalFormat df = new DecimalFormat("");
            t12.setText(df.format(Total));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String banu3 = t3.getText();
        String textbanu = textmirrorbanu.getText();
        
        try{
            sql="insert into simulator (harga, nama)value"
            + "('"+ banu3 +"','"+ textbanu +"')";
            st=con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error pecahkan masalah\n"+e.getMessage());
        }       
        //simulator tabel banu
        if(textmirrorbanu.getText().equals("")) 
        {
            t12.setText(""); 
        }
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("Nama");
        data.addColumn ("Harga");
        
        try
        {
            KoneksiDB();
            sql="select * from simulator where nama='"+textmirrorbanu.getText()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while (rs.next())
                data.addRow(new Object[]{
                    rs.getString(1), rs.getString(2)
                });
            jTable1.setModel(data);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"GAGAL "+e.getMessage());
        }
        
        int JumlahBaris = jTable1.getRowCount();
        int Total = 0;
        int Harga;
        TableModel tableModel;
        tableModel = jTable1.getModel();
        for (int i = 0; i < JumlahBaris; i++) {
            Harga = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            Total = (Total + Harga);
            DecimalFormat df = new DecimalFormat("");
            t12.setText(df.format(Total));
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String banu4 = t4.getText();
        String textbanu = textmirrorbanu.getText();
        
        try{
            sql="insert into simulator (harga, nama)value"
            + "('"+ banu4 +"','"+ textbanu +"')";
            st=con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error pecahkan masalah\n"+e.getMessage());
        }       
        //simulator tabel banu
        if(textmirrorbanu.getText().equals("")) 
        {
            t12.setText(""); 
        }
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("Nama");
        data.addColumn ("Harga");
        
        try
        {
            KoneksiDB();
            sql="select * from simulator where nama='"+textmirrorbanu.getText()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while (rs.next())
                data.addRow(new Object[]{
                    rs.getString(1), rs.getString(2)
                });
            jTable1.setModel(data);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"GAGAL "+e.getMessage());
        }
        
        int JumlahBaris = jTable1.getRowCount();
        int Total = 0;
        int Harga;
        TableModel tableModel;
        tableModel = jTable1.getModel();
        for (int i = 0; i < JumlahBaris; i++) {
            Harga = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            Total = (Total + Harga);
            DecimalFormat df = new DecimalFormat("");
            t12.setText(df.format(Total));
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String banu5 = t5.getText();
        String textbanu = textmirrorbanu.getText();
        
        try{
            sql="insert into simulator (harga, nama)value"
            + "('"+ banu5 +"','"+ textbanu +"')";
            st=con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error pecahkan masalah\n"+e.getMessage());
        }       
        //simulator tabel banu
        if(textmirrorbanu.getText().equals("")) 
        {
            t12.setText(""); 
        }
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("Nama");
        data.addColumn ("Harga");
        
        try
        {
            KoneksiDB();
            sql="select * from simulator where nama='"+textmirrorbanu.getText()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while (rs.next())
                data.addRow(new Object[]{
                    rs.getString(1), rs.getString(2)
                });
            jTable1.setModel(data);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"GAGAL "+e.getMessage());
        }
        
        int JumlahBaris = jTable1.getRowCount();
        int Total = 0;
        int Harga;
        TableModel tableModel;
        tableModel = jTable1.getModel();
        for (int i = 0; i < JumlahBaris; i++) {
            Harga = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            Total = (Total + Harga);
            DecimalFormat df = new DecimalFormat("");
            t12.setText(df.format(Total));
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String banu6 = t6.getText();
        String textbanu = textmirrorbanu.getText();
        
        try{
            sql="insert into simulator (harga, nama)value"
            + "('"+ banu6 +"','"+ textbanu +"')";
            st=con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error pecahkan masalah\n"+e.getMessage());
        }       
        //simulator tabel banu
        if(textmirrorbanu.getText().equals("")) 
        {
            t12.setText(""); 
        }
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("Nama");
        data.addColumn ("Harga");
        
        try
        {
            KoneksiDB();
            sql="select * from simulator where nama='"+textmirrorbanu.getText()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while (rs.next())
                data.addRow(new Object[]{
                    rs.getString(1), rs.getString(2)
                });
            jTable1.setModel(data);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"GAGAL "+e.getMessage());
        }
        
        int JumlahBaris = jTable1.getRowCount();
        int Total = 0;
        int Harga;
        TableModel tableModel;
        tableModel = jTable1.getModel();
        for (int i = 0; i < JumlahBaris; i++) {
            Harga = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            Total = (Total + Harga);
            DecimalFormat df = new DecimalFormat("");
            t12.setText(df.format(Total));
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String banu7 = t7.getText();
        String textbanu = textmirrorbanu.getText();
        
        try{
            sql="insert into simulator (harga, nama)value"
            + "('"+ banu7 +"','"+ textbanu +"')";
            st=con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error pecahkan masalah\n"+e.getMessage());
        }       
        //simulator tabel banu
        if(textmirrorbanu.getText().equals("")) 
        {
            t12.setText(""); 
        }
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("Nama");
        data.addColumn ("Harga");
        
        try
        {
            KoneksiDB();
            sql="select * from simulator where nama='"+textmirrorbanu.getText()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while (rs.next())
                data.addRow(new Object[]{
                    rs.getString(1), rs.getString(2)
                });
            jTable1.setModel(data);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"GAGAL "+e.getMessage());
        }
        
        int JumlahBaris = jTable1.getRowCount();
        int Total = 0;
        int Harga;
        TableModel tableModel;
        tableModel = jTable1.getModel();
        for (int i = 0; i < JumlahBaris; i++) {
            Harga = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            Total = (Total + Harga);
            DecimalFormat df = new DecimalFormat("");
            t12.setText(df.format(Total));
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String banu8 = t8.getText();
        String textbanu = textmirrorbanu.getText();
        
        try{
            sql="insert into simulator (harga, nama)value"
            + "('"+ banu8 +"','"+ textbanu +"')";
            st=con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error pecahkan masalah\n"+e.getMessage());
        }       
        //simulator tabel banu
        if(textmirrorbanu.getText().equals("")) 
        {
            t12.setText(""); 
        }
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("Nama");
        data.addColumn ("Harga");
        
        try
        {
            KoneksiDB();
            sql="select * from simulator where nama='"+textmirrorbanu.getText()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while (rs.next())
                data.addRow(new Object[]{
                    rs.getString(1), rs.getString(2)
                });
            jTable1.setModel(data);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"GAGAL "+e.getMessage());
        }
        
        int JumlahBaris = jTable1.getRowCount();
        int Total = 0;
        int Harga;
        TableModel tableModel;
        tableModel = jTable1.getModel();
        for (int i = 0; i < JumlahBaris; i++) {
            Harga = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            Total = (Total + Harga);
            DecimalFormat df = new DecimalFormat("");
            t12.setText(df.format(Total));
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String banu9 = t9.getText();
        String textbanu = textmirrorbanu.getText();
        
        try{
            sql="insert into simulator (harga, nama)value"
            + "('"+ banu9 +"','"+ textbanu +"')";
            st=con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error pecahkan masalah\n"+e.getMessage());
        }       
        //simulator tabel banu
        if(textmirrorbanu.getText().equals("")) 
        {
            t12.setText(""); 
        }
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("Nama");
        data.addColumn ("Harga");
        
        try
        {
            KoneksiDB();
            sql="select * from simulator where nama='"+textmirrorbanu.getText()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while (rs.next())
                data.addRow(new Object[]{
                    rs.getString(1), rs.getString(2)
                });
            jTable1.setModel(data);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"GAGAL "+e.getMessage());
        }
        
        int JumlahBaris = jTable1.getRowCount();
        int Total = 0;
        int Harga;
        TableModel tableModel;
        tableModel = jTable1.getModel();
        for (int i = 0; i < JumlahBaris; i++) {
            Harga = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            Total = (Total + Harga);
            DecimalFormat df = new DecimalFormat("");
            t12.setText(df.format(Total));
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String banu10 = t10.getText();
        String textbanu = textmirrorbanu.getText();
        
        try{
            sql="insert into simulator (harga, nama)value"
            + "('"+ banu10 +"','"+ textbanu +"')";
            st=con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error pecahkan masalah\n"+e.getMessage());
        }       
        //simulator tabel banu
        if(textmirrorbanu.getText().equals("")) 
        {
            t12.setText(""); 
        }
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("Nama");
        data.addColumn ("Harga");
        
        try
        {
            KoneksiDB();
            sql="select * from simulator where nama='"+textmirrorbanu.getText()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while (rs.next())
                data.addRow(new Object[]{
                    rs.getString(1), rs.getString(2)
                });
            jTable1.setModel(data);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"GAGAL "+e.getMessage());
        }
        
        int JumlahBaris = jTable1.getRowCount();
        int Total = 0;
        int Harga;
        TableModel tableModel;
        tableModel = jTable1.getModel();
        for (int i = 0; i < JumlahBaris; i++) {
            Harga = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            Total = (Total + Harga);
            DecimalFormat df = new DecimalFormat("");
            t12.setText(df.format(Total));
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String banu11 = t11.getText();
        String textbanu = textmirrorbanu.getText();
        
        try{
            sql="insert into simulator (harga, nama)value"
            + "('"+ banu11 +"','"+ textbanu +"')";
            st=con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error pecahkan masalah\n"+e.getMessage());
        }       
        //simulator tabel banu
        if(textmirrorbanu.getText().equals("")) 
        {
            t12.setText(""); 
        }
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("Nama");
        data.addColumn ("Harga");
        
        try
        {
            KoneksiDB();
            sql="select * from simulator where nama='"+textmirrorbanu.getText()+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while (rs.next())
                data.addRow(new Object[]{
                    rs.getString(1), rs.getString(2)
                });
            jTable1.setModel(data);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"GAGAL "+e.getMessage());
        }
        
        int JumlahBaris = jTable1.getRowCount();
        int Total = 0;
        int Harga;
        TableModel tableModel;
        tableModel = jTable1.getModel();
        for (int i = 0; i < JumlahBaris; i++) {
            Harga = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            Total = (Total + Harga);
            DecimalFormat df = new DecimalFormat("");
            t12.setText(df.format(Total));
        }
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Simulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Kepala;
    private javax.swing.JPanel PanelBanu;
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a10;
    private javax.swing.JTextField a11;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a3;
    private javax.swing.JTextField a4;
    private javax.swing.JTextField a5;
    private javax.swing.JTextField a6;
    private javax.swing.JTextField a7;
    private javax.swing.JTextField a8;
    private javax.swing.JTextField a9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMaximize;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnbwh10;
    private javax.swing.JComboBox<String> cfan;
    private javax.swing.JComboBox<String> chdd;
    private javax.swing.JComboBox<String> ckey;
    private javax.swing.JComboBox<String> cmobo;
    private javax.swing.JComboBox<String> cmon;
    private javax.swing.JComboBox<String> cmous;
    private javax.swing.JComboBox<String> cpro;
    private javax.swing.JComboBox<String> cpsu;
    private javax.swing.JComboBox<String> cram;
    private javax.swing.JComboBox<String> cssd;
    private javax.swing.JComboBox<String> cvga;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h10;
    private javax.swing.JLabel h11;
    private javax.swing.JLabel h2;
    private javax.swing.JLabel h3;
    private javax.swing.JLabel h4;
    private javax.swing.JLabel h5;
    private javax.swing.JLabel h6;
    private javax.swing.JLabel h7;
    private javax.swing.JLabel h8;
    private javax.swing.JLabel h9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jam;
    private javax.swing.JButton mirrorbottom;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t10;
    private javax.swing.JLabel t11;
    private javax.swing.JLabel t12;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    private javax.swing.JLabel t9;
    private javax.swing.JTextField textmirrorbanu;
    private javax.swing.JLabel tgl;
    // End of variables declaration//GEN-END:variables
}
