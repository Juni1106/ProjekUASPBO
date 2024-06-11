package tugasUASPBO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class FormPendaftaran extends javax.swing.JFrame {
    
    private final DefaultTableModel model;
    private final javax.swing.ButtonGroup buttonGroup;
   

    public FormPendaftaran(){
        initComponents();
        buttonGroup = new javax.swing.ButtonGroup();
        buttonGroup.add(rLaki);
        buttonGroup.add(rPerempuan);
         model = (DefaultTableModel) Table.getModel();
        table();
    }  
    
    
    
    public void table() {
        model.setRowCount(0); // Menghapus semua baris yang ada dalam model
        try {
            Connection conn = koneksi.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `tb_pendaftaran` ");

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id_pendaftaran"),
                    rs.getString("nama"),
                    rs.getString("tempat_lahir"),
                    rs.getString("tanggal_lahir"),
                    rs.getString("agama"),
                    rs.getString("asal_sekolah"),
                    rs.getString("alamat_pendaftar"),
                    rs.getString("jenis_kelamin")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtAsalSekolah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        rLaki = new javax.swing.JRadioButton();
        rPerempuan = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        cbAgama = new javax.swing.JComboBox<>();
        btnKeluar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dtTanggalLahir = new com.toedter.calendar.JDateChooser();
        txtTempatLahir = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(676, 585));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(5, 29, 64));
        jPanel1.setForeground(new java.awt.Color(173, 131, 48));
        jPanel1.setMaximumSize(new java.awt.Dimension(901, 118));
        jPanel1.setMinimumSize(new java.awt.Dimension(901, 118));
        jPanel1.setPreferredSize(new java.awt.Dimension(901, 118));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(173, 131, 48));
        jLabel1.setText("PPDB");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(173, 131, 48));
        jLabel2.setText("SMK INNE DONGWHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)))
                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(173, 131, 48));
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 209, 37, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(173, 131, 48));
        jLabel6.setText("Agama");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 70, 20));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 174, -1));
        getContentPane().add(txtAsalSekolah, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 174, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(173, 131, 48));
        jLabel7.setText("Asal Sekolah");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(173, 131, 48));
        jLabel8.setText("Alamat Pendaftar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatActionPerformed(evt);
            }
        });
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 174, -1));

        buttonGroup1.add(rLaki);
        rLaki.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rLaki.setForeground(new java.awt.Color(173, 131, 48));
        rLaki.setText("Laki-Laki");
        rLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rLakiActionPerformed(evt);
            }
        });
        getContentPane().add(rLaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        buttonGroup2.add(rPerempuan);
        rPerempuan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rPerempuan.setForeground(new java.awt.Color(173, 131, 48));
        rPerempuan.setText("Perempuan");
        rPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPerempuanActionPerformed(evt);
            }
        });
        getContentPane().add(rPerempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(173, 131, 48));
        jLabel4.setText("Jenis Kelamin");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 91, -1));

        btnSimpan.setBackground(new java.awt.Color(5, 29, 64));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(173, 131, 48));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, 24));

        btnEdit.setBackground(new java.awt.Color(5, 29, 64));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(173, 131, 48));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 112, 24));

        btnHapus.setBackground(new java.awt.Color(5, 29, 64));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(173, 131, 48));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 80, 24));

        cbAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Khatolik", "Hindu", "Buddha", "Khonghucu" }));
        cbAgama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAgamaActionPerformed(evt);
            }
        });
        getContentPane().add(cbAgama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 174, -1));

        btnKeluar.setBackground(new java.awt.Color(5, 29, 64));
        btnKeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(173, 131, 48));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 300, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(173, 131, 48));
        jLabel9.setText("ID Pendaftaran");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 40));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 174, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(173, 131, 48));
        jLabel10.setText("Tempat Lahir");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(173, 131, 48));
        jLabel11.setText("Tanggal Lahir");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        dtTanggalLahir.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dtTanggalLahirPropertyChange(evt);
            }
        });
        getContentPane().add(dtTanggalLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 174, -1));

        txtTempatLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempatLahirActionPerformed(evt);
            }
        });
        getContentPane().add(txtTempatLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 198, 174, -1));

        Table.setBackground(new java.awt.Color(5, 29, 64));
        Table.setForeground(new java.awt.Color(173, 131, 48));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Pendaftaran", "Nama", "Tempat Lahir", "Tanggal Lahir", "Agama", "Asal Sekolah", "Alamat Pendaftar", "Jenis Kelamin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Table);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 640, 210));

        btnCari.setBackground(new java.awt.Color(5, 29, 64));
        btnCari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCari.setForeground(new java.awt.Color(173, 131, 48));
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 90, 30));
        getContentPane().add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 200, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String id_pendaftaran = txtID.getText();
        String nama = txtNama.getText();
        String tempat_lahir = txtTempatLahir.getText();
        String agama = cbAgama.getSelectedItem().toString();
        String asal_sekolah = txtAsalSekolah.getText();
        String alamat_pendaftar = txtAlamat.getText();
        String jenis_kelamin = rLaki.isSelected() ? "Laki-laki" : "Perempuan";

        // Periksa apakah tanggal lahir tidak null
        if (dtTanggalLahir.getDate() != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal_lahir = dateFormat.format(dtTanggalLahir.getDate());

            try {
                Connection conn = koneksi.getConnection();
                String query = "INSERT INTO `tb_pendaftaran`(`id_pendaftaran`, `nama`, `tempat_lahir`, `tanggal_lahir`, `agama`, `asal_sekolah`, `alamat_pendaftar`, `jenis_kelamin`) VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1, id_pendaftaran);
                statement.setString(2, nama);
                statement.setString(3, tempat_lahir);
                statement.setString(4, tanggal_lahir);
                statement.setString(5, agama);
                statement.setString(6, asal_sekolah);
                statement.setString(7, alamat_pendaftar);
                statement.setString(8, jenis_kelamin);
                statement.executeUpdate();

                JOptionPane.showMessageDialog(this, "Data berhasil disimpan.");
                table();
                clearForm(); 
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tanggal lahir harus diisi.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int selectedRow = Table.getSelectedRow();
        if (selectedRow >= 0) {
            String id_pendaftaran = txtID.getText();
            String nama = txtNama.getText();
            String tempat_lahir = txtTempatLahir.getText();

            // Periksa apakah tanggal lahir tidak null
            String tanggal_lahir = "";
            if (dtTanggalLahir.getDate() != null) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                tanggal_lahir = dateFormat.format(dtTanggalLahir.getDate());
            } else {
                JOptionPane.showMessageDialog(this, "Tanggal lahir harus diisi.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Kembalikan agar tidak melanjutkan proses
            }

            String agama = cbAgama.getSelectedItem().toString();
            String asal_sekolah = txtAsalSekolah.getText();
            String alamat_pendaftar = txtAlamat.getText();
            String jenis_kelamin = rLaki.isSelected() ? "Laki-laki" : "Perempuan";

            try {
                Connection conn = koneksi.getConnection();
                String query = "UPDATE `tb_pendaftaran` SET `nama`=?, `tempat_lahir`=?, `tanggal_lahir`=?, `agama`=?, `asal_sekolah`=?, `alamat_pendaftar`=?, `jenis_kelamin`=? WHERE `id_pendaftaran`=?";
                PreparedStatement statement = conn.prepareStatement(query);

                statement.setString(1, nama);
                statement.setString(2, tempat_lahir);
                statement.setString(3, tanggal_lahir);
                statement.setString(4, agama);
                statement.setString(5, asal_sekolah);
                statement.setString(6, alamat_pendaftar);
                statement.setString(7, jenis_kelamin);
                statement.setString(8, id_pendaftaran);

                int rowsUpdated = statement.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil diperbarui.");
                    table();
                    clearForm();
                    
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diubah");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int selectedRow = Table.getSelectedRow();
        if (selectedRow >= 0) {
            String id_pendaftaran = Table.getValueAt(selectedRow, 0).toString();
            try {
                Connection conn = koneksi.getConnection();
                String query = "DELETE FROM tb_pendaftaran WHERE id_pendaftaran=?";
                try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                    pstmt.setString(1, id_pendaftaran);

                    int rowsDeleted = pstmt.executeUpdate();
                    if (rowsDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Data berhasil dihapus dari database.");
                        model.removeRow(selectedRow);
                        table();
                        clearForm();
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        Login loginFrame = null;
        try {
            loginFrame = new Login();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        loginFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void cbAgamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAgamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAgamaActionPerformed
   
    private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatActionPerformed

    private void txtTempatLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempatLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempatLahirActionPerformed

    private void dtTanggalLahirPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dtTanggalLahirPropertyChange
        tanggal();
    }//GEN-LAST:event_dtTanggalLahirPropertyChange

    private void rPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPerempuanActionPerformed

    private void rLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rLakiActionPerformed

    private void TableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TableAncestorAdded

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        int selectedIndex = Table.getSelectedRow();

        txtID.setText(model.getValueAt(selectedIndex, 0).toString());  // Asumsikan kolom ID ada di indeks 0
        txtNama.setText(model.getValueAt(selectedIndex, 1).toString());  // Asumsikan kolom Nama ada di indeks 1
        txtTempatLahir.setText(model.getValueAt(selectedIndex, 2).toString());  // Asumsikan kolom Tempat Lahir ada di indeks 2
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date tanggalLahir = dateFormat.parse(model.getValueAt(selectedIndex, 3).toString());  // Asumsikan kolom Tanggal Lahir ada di indeks 3
            dtTanggalLahir.setDate(tanggalLahir);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String agama = model.getValueAt(selectedIndex, 4).toString();  // Asumsikan kolom Agama ada di indeks 4
        cbAgama.setSelectedItem(agama);

        txtAsalSekolah.setText(model.getValueAt(selectedIndex, 5).toString());  // Asumsikan kolom Asal Sekolah ada di indeks 5
        txtAlamat.setText(model.getValueAt(selectedIndex, 6).toString());  // Asumsikan kolom Alamat ada di indeks 6

        String jenisKelamin = model.getValueAt(selectedIndex, 7).toString();  // Asumsikan kolom Jenis Kelamin ada di indeks 7
        if (jenisKelamin.equals("Laki-laki")) {
            rLaki.setSelected(true);
        } else if (jenisKelamin.equals("Perempuan")) {
            rPerempuan.setSelected(true);
        }
    }//GEN-LAST:event_TableMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String keyword = txtCari.getText(); // Ambil kata kunci pencarian dari JTextField txtCari
        
        try {
            Connection conn = koneksi.getConnection();
            String query = "SELECT * FROM `tb_pendaftaran` WHERE `nama` LIKE ? OR `id_pendaftaran` LIKE ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, "%" + keyword + "%");
                pstmt.setString(2, "%" + keyword + "%");
                ResultSet rs = pstmt.executeQuery();

                DefaultTableModel model = (DefaultTableModel) Table.getModel();
                model.setRowCount(0); // Menghapus semua baris dalam tabel

                while (rs.next()) {
                    Object[] row = {
                        rs.getString("id_pendaftaran"),
                        rs.getString("nama"),
                        rs.getString("tempat_lahir"),
                        rs.getString("tanggal_lahir"),
                        rs.getString("agama"),
                        rs.getString("asal_sekolah"),
                        rs.getString("alamat_pendaftar"),
                        rs.getString("jenis_kelamin")
                    };
                    model.addRow(row); // Menambahkan baris hasil pencarian ke dalam tabel
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCariActionPerformed

    String tanggal_lahir;
    public void tanggal(){
        if(dtTanggalLahir.getDate() !=null){
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            tanggal_lahir = String.valueOf(format.format(dtTanggalLahir.getDate()));
        }
    }
     
       private void clearForm() {
        txtID.setText("");
        txtNama.setText("");
        txtTempatLahir.setText("");
        dtTanggalLahir.setDate(null);
        cbAgama.setSelectedIndex(0);
        txtAsalSekolah.setText("");
        txtAlamat.setText("");
        
        rLaki.setSelected(false);
        rPerempuan.setSelected(false);
        buttonGroup.clearSelection();
    }
       
      public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
                try {
                    new Login().setVisible(true);
                } catch (SQLException ex) {
             }
         });
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbAgama;
    private com.toedter.calendar.JDateChooser dtTanggalLahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton rLaki;
    private javax.swing.JRadioButton rPerempuan;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAsalSekolah;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTempatLahir;
    // End of variables declaration//GEN-END:variables

    private static class buttonGroup {
        public buttonGroup() {
        }
    }
}
