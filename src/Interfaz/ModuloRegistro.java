/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class ModuloRegistro extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ModuloRegistro() {
        initComponents();
           setResizable(false);
           setSize(389, 407);
           this.jLabelEliminar.setEnabled(false);
           this.jLabelModificar.setEnabled(false);
           this.jLabelRegistrar.setEnabled(false);
           this.nombremodserv.setEnabled(false);
           this.apellidomodserv.setEnabled(false);
           this.telfmodserv.setEnabled(false);
           this.dirmodserv.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     Nos muestra cómo se realiza parte del proceso de registro.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        boxidentidad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nombremodserv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dirmodserv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telfmodserv = new javax.swing.JTextField();
        jLabelRegistrar = new javax.swing.JLabel();
        jLabelEliminar = new javax.swing.JLabel();
        jLabelModificar = new javax.swing.JLabel();
        jLabelBuscar = new javax.swing.JLabel();
        cedulaserv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        apellidomodserv = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRO DE CLIENTE");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(32, 15, 42));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 255)));

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MÓDULO DE REGISTRO DE CLEINTE");

        jPanel2.setBackground(new java.awt.Color(32, 15, 42));

        boxidentidad.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        boxidentidad.setForeground(new java.awt.Color(51, 51, 51));
        boxidentidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-", "P-", "J-", "G-" }));
        boxidentidad.setToolTipText("Seleccione un tipo de documento de identidad\ndel cliente para buscar sus datos.");
        boxidentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxidentidadActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        nombremodserv.setToolTipText("Nombre del cliente.");
        nombremodserv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombremodservFocusGained(evt);
            }
        });
        nombremodserv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombremodservKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Direccion");

        dirmodserv.setToolTipText("Dato de direccion de habitacion del cliente.");
        dirmodserv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dirmodservFocusGained(evt);
            }
        });
        dirmodserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirmodservActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");

        telfmodserv.setToolTipText("Telefono del cliente.");
        telfmodserv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telfmodservFocusGained(evt);
            }
        });
        telfmodserv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telfmodservKeyTyped(evt);
            }
        });

        jLabelRegistrar.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jLabelRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plus.png"))); // NOI18N
        jLabelRegistrar.setText(" REGISTRAR");
        jLabelRegistrar.setToolTipText("Boton para registrar el cliente.\nNo se podra registrar si algunos de los\ncampos de textos se encuentra vacio.");
        jLabelRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrarMouseClicked(evt);
            }
        });

        jLabelEliminar.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jLabelEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/multiply-1.png"))); // NOI18N
        jLabelEliminar.setText("ELIMINAR");
        jLabelEliminar.setToolTipText("Boton para eliminar el registro de un cliente\na partir de el documento de identidad.");
        jLabelEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEliminarMouseClicked(evt);
            }
        });

        jLabelModificar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelModificar.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jLabelModificar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit-1.png"))); // NOI18N
        jLabelModificar.setText("MODIFICAR");
        jLabelModificar.setToolTipText("Boton para modificar los\ndatos del cliente.");
        jLabelModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelModificarMouseClicked(evt);
            }
        });

        jLabelBuscar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabelBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search_1.png"))); // NOI18N
        jLabelBuscar.setText("BUSCAR");
        jLabelBuscar.setToolTipText("Boton para buscar los datos del cliente \nmediante la cedula de identidad.");
        jLabelBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBuscarMouseClicked(evt);
            }
        });

        cedulaserv.setToolTipText("Campo de texto para buscar el cliente mediante su documento de identidad.");
        cedulaserv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cedulaservFocusGained(evt);
            }
        });
        cedulaserv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaservKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido");

        apellidomodserv.setToolTipText("Apellido del cliente.");
        apellidomodserv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apellidomodservFocusGained(evt);
            }
        });
        apellidomodserv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidomodservKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(dirmodserv, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21)
                        .addComponent(telfmodserv, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelModificar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(boxidentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cedulaserv, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelBuscar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombremodserv, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(apellidomodserv))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxidentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedulaserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nombremodserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(apellidomodserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dirmodserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telfmodserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEliminar)
                    .addComponent(jLabelRegistrar)
                    .addComponent(jLabelModificar))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Delete_25px_1.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Unchecked_Checkbox_25px.png"))); // NOI18N

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Minus_25px_1.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxidentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxidentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxidentidadActionPerformed

    private void telfmodservKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telfmodservKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_telfmodservKeyTyped

    private void nombremodservKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombremodservKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_nombremodservKeyTyped

    private void dirmodservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirmodservActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dirmodservActionPerformed

    private void jLabelRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarMouseClicked
        Pattern p= Pattern.compile("[^0-9]");
        Matcher m=p.matcher(cedulaserv.getText());
        if(m.find() || ((cedulaserv.getText().length()< 6) && (cedulaserv.getText().length()> 8)))
        { JOptionPane.showMessageDialog(new JFrame(),"La cedula debe ser mayor a 5 digitos","Alerta",JOptionPane.WARNING_MESSAGE);
      }
        else{
        try
        {
            if((this.nombremodserv.getText().equals("")) || (this.dirmodserv.getText().equals("")) || (this.telfmodserv.getText().equals(""))){
                   JOptionPane.showMessageDialog(new JFrame(), "Rellene todos los campos", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
            else{
                Conexion conec = new Conexion();
        conec.ConectarBDatos();
                conec.sql="INSERT INTO clientes (cedula, nombre, apellido, telf, direccion) VALUES ('"+this.boxidentidad.getSelectedItem()+this.cedulaserv.getText()+"','"+this.nombremodserv.getText()+"','"+this.apellidomodserv.getText()+"','"+this.telfmodserv.getText()+"','"+this.dirmodserv.getText()+"')";
        conec.stm.executeUpdate(conec.sql);
        JOptionPane.showMessageDialog(new JFrame(),"Registro incluido","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        this.cedulaserv.setText("");
        this.dirmodserv.setText("");
        this.telfmodserv.setText("");
        this.nombremodserv.setText("");
        this.apellidomodserv.setText("");
        this.dirmodserv.setEnabled(false);
        this.telfmodserv.setEnabled(false);
        this.nombremodserv.setEnabled(false);
        this.apellidomodserv.setEnabled(false);
        this.cedulaserv.setEnabled(true);
        this.cedulaserv.requestFocus();
        conec.DesconectarBD();           
        }
        }
        catch(Exception e2)
        {
        System.out.println("Error en incluir "+e2);
        }
        }
    }//GEN-LAST:event_jLabelRegistrarMouseClicked

    private void cedulaservKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaservKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'8') evt.consume();
        
    }//GEN-LAST:event_cedulaservKeyTyped      Este void es para el caso de tener que eliminar un registro:

    private void jLabelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarMouseClicked
        try{
        int res= JOptionPane.showConfirmDialog(new JFrame(), "¿Esta seguro de eliminar este registro?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
         if(res == 0)
         {
            Conexion conec = new Conexion();
            conec.ConectarBDatos();
            conec.sql="Delete from clientes where cedula='"+this.boxidentidad.getSelectedItem()+this.cedulaserv.getText()+"'";
            conec.stm.executeUpdate(conec.sql);
            JOptionPane.showMessageDialog(new JFrame(),"Registro Eliminado","Mensaje",JOptionPane.ERROR_MESSAGE);
            conec.DesconectarBD();
         this.cedulaserv.setText("");
         this.dirmodserv.setText("");
         this.telfmodserv.setText("");
         this.nombremodserv.setText("");
         this.apellidomodserv.setText("");
         this.dirmodserv.setEnabled(false);
         this.telfmodserv.setEnabled(false);
         this.nombremodserv.setEnabled(false);
         this.apellidomodserv.setEnabled(false);
         this.cedulaserv.setEnabled(true);
         cedulaserv.requestFocus();
         }
        }
        catch(Exception e2){
            System.out.println("Error en eliminar" +e2);
        }
    }//GEN-LAST:event_jLabelEliminarMouseClicked

    private void jLabelModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModificarMouseClicked
        try{
            Conexion conec = new Conexion();
            conec.ConectarBDatos();
            conec.sql = "Update clientes set nombre= '"+nombremodserv.getText()+"', apellido='"+this.apellidomodserv.getText()+"',telf='"+telfmodserv.getText()+"',direccion='"+dirmodserv.getText()+"' where cedula='"+this.boxidentidad.getSelectedItem()+cedulaserv.getText()+"'";
            conec.stm.executeUpdate(conec.sql);
            JOptionPane.showMessageDialog(new JFrame(),"Registro Actualizado","Mensaje",JOptionPane.WARNING_MESSAGE);
         this.cedulaserv.setText("");
         this.dirmodserv.setText("");
         this.nombremodserv.setText("");
         this.telfmodserv.setText("");
         this.apellidomodserv.setText("");
         this.dirmodserv.setEnabled(false);
         this.nombremodserv.setEnabled(false);
         this.telfmodserv.setEnabled(false);
         this.apellidomodserv.setEnabled(false);
         this.cedulaserv.setEnabled(true);
            cedulaserv.requestFocus();
            conec.DesconectarBD();
        }
        catch(Exception e2){
            System.out.println("Eror al modificar"+e2);
        }
    }//GEN-LAST:event_jLabelModificarMouseClicked

    private void jLabelBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBuscarMouseClicked
        if(this.cedulaserv.getText().equals("")){
            JOptionPane.showMessageDialog(new JFrame(),"Rellene el campo de identidad","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        try{
         Conexion conec = new Conexion();
         conec.ConectarBDatos();
         conec.sql="Select clientes.* from clientes where cedula= '"+this.boxidentidad.getSelectedItem()+cedulaserv.getText()+"'";
         conec.tb=conec.stm.executeQuery(conec.sql);
          if(conec.tb.next()){
              this.nombremodserv.setText(conec.tb.getString("nombre"));
              this.apellidomodserv.setText(conec.tb.getString("apellido"));
              this.telfmodserv.setText(conec.tb.getString("telf"));
              this.dirmodserv.setText(conec.tb.getString("direccion"));
              this.cedulaserv.setEnabled(false);
              this.jLabelEliminar.setEnabled(true);
              this.jLabelModificar.setEnabled(true);
              this.nombremodserv.setEnabled(true);
              this.apellidomodserv.setEnabled(true);
              this.telfmodserv.setEnabled(true);
              this.dirmodserv.setEnabled(true);
              conec.DesconectarBD();
         }
          else
           {
           JOptionPane.showMessageDialog(new JFrame(),"Cedula no registrada,\nrellene los siguientes campos","Mensaje",JOptionPane.INFORMATION_MESSAGE);
           this.jLabelRegistrar.setEnabled(true);
           this.nombremodserv.setEnabled(true);
           this.apellidomodserv.setEnabled(true);
           this.telfmodserv.setEnabled(true);
           this.dirmodserv.setEnabled(true);
           conec.DesconectarBD();
           }
        }
        catch(Exception e2)
          {
              System.out.println("Error en JDBC");
        }
        }
    }//GEN-LAST:event_jLabelBuscarMouseClicked

    private void cedulaservFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaservFocusGained
        if(this.boxidentidad.getSelectedIndex()==0 || this.boxidentidad.getSelectedIndex()==1 || this.boxidentidad.getSelectedIndex()==2){
            this.cedulaserv.setDocument(new JTextFieldLimit(8));
        }
        if(this.boxidentidad.getSelectedIndex()==3 || this.boxidentidad.getSelectedIndex()==4){
            this.cedulaserv.setDocument(new JTextFieldLimit(9));
        }
    }//GEN-LAST:event_cedulaservFocusGained

    private void apellidomodservKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidomodservKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_apellidomodservKeyTyped

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.setExtendedState(ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void nombremodservFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombremodservFocusGained
        if(this.boxidentidad.getSelectedIndex()==0 || this.boxidentidad.getSelectedIndex()==1 || this.boxidentidad.getSelectedIndex()==2){
            this.nombremodserv.setDocument(new JTextFieldLimit(29));
        }
        if(this.boxidentidad.getSelectedIndex()==3 || this.boxidentidad.getSelectedIndex()==4){
            this.nombremodserv.setDocument(new JTextFieldLimit(29));
        }
    }//GEN-LAST:event_nombremodservFocusGained

    private void apellidomodservFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidomodservFocusGained
        if(this.boxidentidad.getSelectedIndex()==0 || this.boxidentidad.getSelectedIndex()==1 || this.boxidentidad.getSelectedIndex()==2){
            this.apellidomodserv.setDocument(new JTextFieldLimit(29));
        }
        if(this.boxidentidad.getSelectedIndex()==3 || this.boxidentidad.getSelectedIndex()==4){
            this.apellidomodserv.setDocument(new JTextFieldLimit(29));
        }
    }//GEN-LAST:event_apellidomodservFocusGained

    private void dirmodservFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dirmodservFocusGained
        if(this.boxidentidad.getSelectedIndex()==0 || this.boxidentidad.getSelectedIndex()==1 || this.boxidentidad.getSelectedIndex()==2){
            this.dirmodserv.setDocument(new JTextFieldLimit(50));
        }
        if(this.boxidentidad.getSelectedIndex()==3 || this.boxidentidad.getSelectedIndex()==4){
            this.dirmodserv.setDocument(new JTextFieldLimit(50));
        }
    }//GEN-LAST:event_dirmodservFocusGained

    private void telfmodservFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telfmodservFocusGained
        if(this.boxidentidad.getSelectedIndex()==0 || this.boxidentidad.getSelectedIndex()==1 || this.boxidentidad.getSelectedIndex()==2){
            this.telfmodserv.setDocument(new JTextFieldLimit(11));
        }
        if(this.boxidentidad.getSelectedIndex()==3 || this.boxidentidad.getSelectedIndex()==4){
            this.telfmodserv.setDocument(new JTextFieldLimit(11));
        }
    }//GEN-LAST:event_telfmodservFocusGained

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables Estas son las variables usadas para este modulo:
    private javax.swing.JTextField apellidomodserv;
    private javax.swing.JComboBox<String> boxidentidad;
    protected javax.swing.JTextField cedulaserv;
    private javax.swing.JTextField dirmodserv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jLabelModificar;
    private javax.swing.JLabel jLabelRegistrar;
    private javax.swing.JTextField nombremodserv;
    private javax.swing.JTextField telfmodserv;
    // End of variables declaration//GEN-END:variables
}
