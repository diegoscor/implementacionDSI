/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.CtrRegistrarObra;
import estados.PendienteDeAsignacion;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import objetos.Empleado;
import objetos.Estado;
import objetos.Estilo;
import objetos.HistorialEstado;
import objetos.Obra;
import objetos.Tecnica;
import objetos.Tematica;
import objetos.TipoIngreso;
import utils.ComboRendererEstilo;
import utils.ComboRendererTecnica;
import utils.ComboRendererTematica;
import utils.ComboRendererTipoIngreso;

/**
 *
 * @author Diego
 */
public class FrmRegistrarObra extends javax.swing.JFrame {

    private static DefaultTableModel modelo;

    /**
     * Creates new form frmRegistrarObra
     */
    public FrmRegistrarObra() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        cboTipoIngreso = new javax.swing.JComboBox();
        txtEmpleado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboEstilo = new javax.swing.JComboBox();
        cboTecnica = new javax.swing.JComboBox();
        cboTematica = new javax.swing.JComboBox();
        txtNombreObra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescrip = new javax.swing.JTextArea();
        txtBuscadorArtista = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableArtista = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtAlto = new javax.swing.JTextField();
        txtAncho = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtValuacion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSensor = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listImagenes = new javax.swing.JList();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        btnPreview = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Sistema"));

        jLabel1.setText("Nombre Empleado: ");

        jLabel2.setText("Tipo Ingreso: ");

        jLabel3.setText("Fecha del Sistema: ");

        txtFecha.setText("display_fecha");

        cboTipoIngreso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboTipoIngreso.setFocusable(false);

        txtEmpleado.setText("display_nombreEmpleado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboTipoIngreso, 0, 255, Short.MAX_VALUE)
                    .addComponent(txtEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha)
                    .addComponent(txtEmpleado))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboTipoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Obra"));

        jLabel5.setText("Estilo:");

        jLabel6.setText("Técnica:");

        jLabel7.setText("Artista");

        jLabel8.setText("Temática:");

        jLabel9.setText("Nombre:");

        jLabel10.setText("Descripcion:");

        jLabel11.setText("Alto (mm):");

        jLabel12.setText("Ancho (mm):");

        txtDescrip.setColumns(20);
        txtDescrip.setRows(5);
        jScrollPane1.setViewportView(txtDescrip);

        txtBuscadorArtista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscadorArtistaKeyTyped(evt);
            }
        });

        btnRegistrar.setText("Registrar");

        tableArtista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableArtista);

        jLabel13.setText("Peso (mg):");

        jLabel14.setText("Valuación (US$):");

        jLabel15.setText("Código Sensor:");

        txtSensor.setText("diplay_codigoSensor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txtNombreObra))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(cboTematica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboEstilo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboTecnica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtValuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscadorArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlto)
                            .addComponent(txtAncho)
                            .addComponent(txtPeso)
                            .addComponent(txtSensor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(cboEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscadorArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cboTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNombreObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtValuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtSensor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrar Imágenes"));

        listImagenes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listImagenesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listImagenes);

        btnAgregar.setText("Agregar ->");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnQuitar.setText("<- Quitar");

        btnPreview.setEnabled(false);
        btnPreview.setFocusable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(btnQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuitar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(btnPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscadorArtistaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorArtistaKeyTyped
        this.txtBuscadorArtista.getDocument().addDocumentListener(
                new DocumentListener() {
                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        newFilter();
                    }

                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        newFilter();
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        newFilter();
                    }
                });
    }//GEN-LAST:event_txtBuscadorArtistaKeyTyped

    private void listImagenesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listImagenesValueChanged
        if (this.listImagenes.getValueIsAdjusting() == false) {
            if (this.listImagenes.getSelectedIndex() >= 0) {
                FileInputStream imgStream = null;
                try {
                    String selected = (String) this.listImagenes.getSelectedValue();
                    File f = new File(selected);
                    imgStream = new FileInputStream(selected);
                    BufferedImage myImg = ImageIO.read(imgStream);
                    ImageIcon preview = new ImageIcon(myImg);
//                    ImageIcon preview = new ImageIcon(getClass().getResource(selected));
                    preview = new ImageIcon(preview.getImage().getScaledInstance(230, 130, java.awt.Image.SCALE_SMOOTH));
                    this.btnPreview.setIcon(preview);
                    this.btnPreview.setDisabledIcon(preview);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FrmRegistrarObra.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FrmRegistrarObra.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        imgStream.close();
                    } catch (IOException ex) {
                        Logger.getLogger(FrmRegistrarObra.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_listImagenesValueChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Calendar date = new GregorianCalendar();

        this.txtFecha.setText(date.get(Calendar.DAY_OF_MONTH) + " - " + date.get(Calendar.MONTH) + " - " + date.get(Calendar.YEAR));
    }//GEN-LAST:event_formWindowOpened

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        JFileChooser fileOpen = new JFileChooser();

        // Get array of available formats
        String[] suffices = ImageIO.getReaderFileSuffixes();

        // Add a file filter for each one
        FileFilter imageFilter = new FileNameExtensionFilter("Archivos de Imágenes", ImageIO.getReaderFileSuffixes());
        fileOpen.addChoosableFileFilter(imageFilter);
        fileOpen.setAcceptAllFileFilterUsed(false);

        if (!fileOpen.isMultiSelectionEnabled()) {
            fileOpen.setMultiSelectionEnabled(true);
        }

        int returnVal = fileOpen.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {

            File[] files = fileOpen.getSelectedFiles();
            for (int i = 0; i < files.length; i++) {
                mdlList.addElement(files[i].getAbsolutePath());

                listImagenes.setModel(mdlList);
                listImagenes.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String nombre;
        Date fechaCreacion = null;
        Date fechaRegistracion;
        double alto = -1;
        double ancho = -1;
        double peso = -1;
        double valuacion = -1;
        long sensor;
        Estilo estilo;
        Tecnica tecnica;
        Tematica tematica;
        ArrayList<HistorialEstado> historial = new ArrayList();

        if (this.txtNombreObra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Debe completar el campo NOMBRE", "Falta de Datos Obligatorios", JOptionPane.ERROR_MESSAGE);
        } else {
            if ("0".equals(this.txtSensor.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Error de DB con el CODIGO SENSOR", "Falta de Datos Obligatorios", JOptionPane.ERROR_MESSAGE);
            } else {
                nombre = this.txtNombreObra.getText();
                //fechaCreacion = this.
                fechaRegistracion = new Date();
                if(!this.txtAlto.getText().isEmpty()) {
                    alto = Double.parseDouble(this.txtAlto.getText());
                }
                if(!this.txtAncho.getText().isEmpty()) {
                    ancho = Double.parseDouble(this.txtAncho.getText());
                }
                if(!this.txtPeso.getText().isEmpty()) {
                    peso = Double.parseDouble(this.txtPeso.getText());
                }
                if(!this.txtValuacion.getText().isEmpty()) {
                    valuacion = Double.parseDouble(this.txtValuacion.getText());
                }
                sensor = Long.parseLong(this.txtSensor.getText());
                estilo = (Estilo) this.cboEstilo.getSelectedItem();
                tecnica = (Tecnica) this.cboTecnica.getSelectedItem();
                tematica = (Tematica) this.cboTematica.getSelectedItem();
                Estado e = new PendienteDeAsignacion("Pendiente de Asignacion",
                        "La obrea se encuentra en deposito para ser asignada a una colección.");
                HistorialEstado h = new HistorialEstado(new Date(),e);
                historial.add(h);
                
                Obra obra = new Obra(nombre,fechaCreacion,fechaRegistracion, alto,ancho,peso,valuacion,sensor,estilo,tecnica,tematica,historial);
                System.out.println("Se guardo la obra: " + obra.getNombre()+ " con sensor nro: "+ obra.getSensor());
                
            }
        }
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistrarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmRegistrarObra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPreview;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cboEstilo;
    private javax.swing.JComboBox cboTecnica;
    private javax.swing.JComboBox cboTematica;
    private javax.swing.JComboBox cboTipoIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listImagenes;
    private javax.swing.JTable tableArtista;
    private javax.swing.JTextField txtAlto;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtBuscadorArtista;
    private javax.swing.JTextArea txtDescrip;
    private javax.swing.JLabel txtEmpleado;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JTextField txtNombreObra;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JLabel txtSensor;
    private javax.swing.JTextField txtValuacion;
    // End of variables declaration//GEN-END:variables
    private CtrRegistrarObra gestor;
    private TableRowSorter<TableModel> sorter;
    DefaultListModel mdlList = new DefaultListModel();

    public void setManejador(CtrRegistrarObra c) {
        gestor = c;
    }


    /**
     * El SelectedIndex vendría de la operación que llama al CU Registrar Obra,
     * esta solucion se implementa únicamente para poder mostrar el
     * funcionamiento del CU Registrar Obra, no de Registrar Donación, Registrar
     * Compra u otro CU.
     */
    public void cargarComboBoxTipoIngreso(ArrayList<TipoIngreso> list) {
        DefaultComboBoxModel mdlc = new DefaultComboBoxModel();
        for (TipoIngreso list1 : list) {
            mdlc.addElement(list1);
        }
        this.cboTipoIngreso.setModel(mdlc);
        this.cboTipoIngreso.setRenderer(new ComboRendererTipoIngreso());
        this.cboTipoIngreso.setSelectedIndex((int) (Math.random() * 3));
        this.cboTipoIngreso.setEnabled(false);
    }

    public void cargarComboBoxEstilo(ArrayList<Estilo> list) {
        DefaultComboBoxModel mdlc = new DefaultComboBoxModel();
        for (Estilo list1 : list) {
            mdlc.addElement(list1);
        }
        this.cboEstilo.setModel(mdlc);
        this.cboEstilo.setRenderer(new ComboRendererEstilo());
        this.cboEstilo.setSelectedIndex(-1);
    }

    public void cargarComboBoxTecnica(ArrayList<Tecnica> list) {
        DefaultComboBoxModel mdlc = new DefaultComboBoxModel();
        for (Tecnica list1 : list) {
            mdlc.addElement(list1);
        }
        this.cboTecnica.setModel(mdlc);
        this.cboTecnica.setRenderer(new ComboRendererTecnica());
        this.cboTecnica.setSelectedIndex(-1);
    }

    public void cargarComboBoxTematica(ArrayList<Tematica> list) {
        DefaultComboBoxModel mdlc = new DefaultComboBoxModel();
        for (Tematica list1 : list) {
            mdlc.addElement(list1);
        }
        this.cboTematica.setModel(mdlc);
        this.cboTematica.setRenderer(new ComboRendererTematica());
        this.cboTematica.setSelectedIndex(-1);
    }

    public void cargarGrilla(DefaultTableModel mdl) {
        this.tableArtista.setModel(mdl);
    }

    /**
     * Método que crea el filtro para buscar en la grilla ya sean palabras,
     * archivos, frecuencias o id.
     */
    public void crearFiltro() {
        TableModel model = tableArtista.getModel();
        sorter = new TableRowSorter<TableModel>(model);
        this.tableArtista.setRowSorter(sorter);
    }

    /**
     * Método que establece que el filtro actuará acorde a la información del
     * TextField jTFBuscador
     */
    public void newFilter() {
        crearFiltro();
        //If current expression doesn't parse, don't update.
        try {
            sorter.setRowFilter(RowFilter.regexFilter("^" + this.txtBuscadorArtista.getText()));
        } catch (java.util.regex.PatternSyntaxException e) {
            System.out.println("Falla del filtro");

        }
    }
    
    /**
     * Debido a que no reflejamos la logica del Inicio de Sesión sino sólo el CU Registrar Obra, se utiliza 
     * un random para seleccionar el empleado dado que esta información la proveería el sistema mediante
     * los datos utilizados durante el logueo. 
     * @param list 
     */
    public void cargarEmpleado(ArrayList<Empleado> list){
        int index=(int)Math.random() * 3;
        this.txtEmpleado.setText(list.get(index).getApellido()+", "+list.get(index).getNombre());
    }
    
    public void cargarSensor(int codigoSensor){
        this.txtSensor.setText(""+codigoSensor);
    }
}
