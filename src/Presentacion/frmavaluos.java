/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.vavaluos;
import Logica.favaluos;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONY
 */
public class frmavaluos extends javax.swing.JFrame {

    /**
     * Creates new form frmavaluos
     */
    public frmavaluos() {
        initComponents();
        ingresar();
        this.setTitle("Avaluos");
        mostrar("");
    }
    
    public Integer ping;
    public Integer Pin;
    //2=ingreso 1=consulta
    
    void ocultar_columnas(){
        tablaavaluos.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaavaluos.getColumnModel().getColumn(0).setMinWidth(0);
        tablaavaluos.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    void limpiar(){
        txtmodelo1.setText("");
        txtprecio.setText("");
        txtdescripcion1.setText("");
        dcfecha.setDate(null);
        cbofamilia1.setSelectedIndex(0);
        cbocategoria1.setSelectedIndex(0);
        cbomarca1.setSelectedIndex(0);
        txtmarca.setText("");
    }
    
    void ingresar(){
        Pin = 2;
        eleccion1();
        chboingreso.setSelected(true);
        chboconsulta.setSelected(false);
        panelbusqueda.setVisible(false);
        panelingreso.setVisible(true);
        txtmarca.setVisible(false);
    }
    
    void buscar(){
        Pin = 1;
        eleccion1();
        chboconsulta.setSelected(true);
        chboingreso.setSelected(false);
        panelingreso.setVisible(false);
        panelbusqueda.setVisible(true);
    }
    
    void consultar(String familia,String categoria, String marca){
        try{
            DefaultTableModel modelo;
            favaluos func = new favaluos();
            modelo = func.consultar(familia, categoria, marca);
            
            tablaavaluos.setModel(modelo);
            ocultar_columnas();
        }catch(Exception e){
            JOptionPane.showConfirmDialog(rootPane,e);
        }
    }
    
    void mostrar(String buscar){
        try{
            DefaultTableModel modelo;
            favaluos func = new favaluos();
            modelo = func.mostrar(buscar);
            
            cbomarca.removeAllItems();
            cbomarca1.removeAllItems();
            func.cargarmarcas(buscar);
            
            tablaavaluos.setModel(modelo);
            ocultar_columnas();
        }catch(Exception e){
            JOptionPane.showConfirmDialog(rootPane,e);
        }
    }
    
    void eleccion1(){
        String [] electronico = {
            "Celulares", 
            "Televisores",
            "Pc",
            "Equipo de sonido",
            "Tablet",
            "Notebook",
            "DVD",
            "Consolas",
            "Relojes",
            "Bocinas",
            "Teatro en Casa",
            "Accesorios"};
        DefaultComboBoxModel dm = new DefaultComboBoxModel(electronico);
        if(Pin == 1){
            cbocategoria.setModel(dm);
        }
        else if(Pin == 2){
            cbocategoria1.setModel(dm);
        }
    }
    void eleccion2(){
        String [] lineablanca = {
            "Refrigeradora", 
            "Estufas",
            "Microondas",
            "Licuadoras",
            "Ollas",
            "Lavadoras",
            "Cargadores",
            "Plancha de ropa"};
        DefaultComboBoxModel dm = new DefaultComboBoxModel(lineablanca);
        if(Pin == 1){
            cbocategoria.setModel(dm);
        }
        else if(Pin == 2){
            cbocategoria1.setModel(dm);
        }
    }
    
    void eleccion3(){
        String [] articulosindustriales = {
            "Ingleteadora", 
            "Barrenos",
            "Bicicletas",
            "Sierras",
            "Soldadora",
            "Compresor",
            "Taladro",
            "Maquina de coser",
            "Pulidora",
            "Router",
            "Atornillador"};
        DefaultComboBoxModel dm = new DefaultComboBoxModel(articulosindustriales);
        if(Pin == 1){
            cbocategoria.setModel(dm);
        }
        else if(Pin == 2){
            cbocategoria1.setModel(dm);
        }
    }
    
    void eleccion4(){
        String [] vehiculos = {
            "Automovil", 
            "PichUp",
            "Camion",
            "Trailer",
            "Maquinaria"};
        DefaultComboBoxModel dm = new DefaultComboBoxModel(vehiculos);
        if(Pin == 1){
            cbocategoria.setModel(dm);
        }
        else if(Pin == 2){
            cbocategoria1.setModel(dm);
        }
    }
    
    void eleccion5(){
        String [] motocicletas = {
            "Motocicletas", 
            "Pasola",
            "Cuatrimotos",
            "Moto Acuatica"};
        DefaultComboBoxModel dm = new DefaultComboBoxModel(motocicletas);
        if(Pin == 1){
            cbocategoria.setModel(dm);
        }
        else if(Pin == 2){
            cbocategoria1.setModel(dm);
        }
    }
    
    void eleccion6(){
        String [] instrumentosmusicales = {
            "Guitarras", 
            "Teclados",
            "Baterias",
            "Trompetas",
            "Violines"};
        DefaultComboBoxModel dm = new DefaultComboBoxModel(instrumentosmusicales);
        if(Pin == 1){
            cbocategoria.setModel(dm);
        }
        else if(Pin == 2){
            cbocategoria1.setModel(dm);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        panelbusqueda = new javax.swing.JPanel();
        cbofamilia = new javax.swing.JComboBox<>();
        cbocategoria = new javax.swing.JComboBox<>();
        cbomarca = new javax.swing.JComboBox<>();
        txtmodelo = new javax.swing.JTextField();
        txtpalabraclave = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelingreso = new javax.swing.JPanel();
        cbofamilia1 = new javax.swing.JComboBox<>();
        cbocategoria1 = new javax.swing.JComboBox<>();
        cbomarca1 = new javax.swing.JComboBox<>();
        txtmodelo1 = new javax.swing.JTextField();
        dcfecha = new com.toedter.calendar.JDateChooser();
        txtprecio = new javax.swing.JTextField();
        txtdescripcion1 = new javax.swing.JTextField();
        bntingresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        chbomarca = new javax.swing.JCheckBox();
        txtmarca = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaavaluos = new javax.swing.JTable();
        chboconsulta = new javax.swing.JCheckBox();
        chboingreso = new javax.swing.JCheckBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelbusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda de Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cbofamilia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronicos", "Linea Blanca", "Articulos Industriales", "Vehiculos", "Motocicletas", "Instrumentos Musicales" }));
        cbofamilia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbofamiliaItemStateChanged(evt);
            }
        });
        cbofamilia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbofamiliaKeyPressed(evt);
            }
        });

        cbomarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbomarcaActionPerformed(evt);
            }
        });

        txtpalabraclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpalabraclaveActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Familia");

        jLabel2.setText("Categoria");

        jLabel3.setText("Marca");

        jLabel4.setText("Modelo");

        jLabel5.setText("Palabra clave");

        javax.swing.GroupLayout panelbusquedaLayout = new javax.swing.GroupLayout(panelbusqueda);
        panelbusqueda.setLayout(panelbusquedaLayout);
        panelbusquedaLayout.setHorizontalGroup(
            panelbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbusquedaLayout.createSequentialGroup()
                        .addGroup(panelbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(panelbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmodelo)
                            .addComponent(txtpalabraclave)
                            .addComponent(cbofamilia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbocategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbomarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelbusquedaLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jButton1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelbusquedaLayout.setVerticalGroup(
            panelbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cbofamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbomarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelbusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtpalabraclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelingreso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso de Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cbofamilia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electronicos", "Linea Blanca", "Articulos Industriales", "Vehiculos", "Motocicletas", "Instrumentos Musicales" }));
        cbofamilia1.setToolTipText("");
        cbofamilia1.setName(""); // NOI18N
        cbofamilia1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbofamilia1ItemStateChanged(evt);
            }
        });
        cbofamilia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbofamilia1KeyPressed(evt);
            }
        });

        txtdescripcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcion1ActionPerformed(evt);
            }
        });

        bntingresar.setText("Ingresar");
        bntingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntingresarActionPerformed(evt);
            }
        });

        jLabel6.setText("Familia");

        jLabel7.setText("Categoria");

        jLabel8.setText("Marca");

        jLabel9.setText("Modelo");

        jLabel10.setText("Descripcion");

        jLabel11.setText("Precio");

        jLabel12.setText("Fecha");

        chbomarca.setText("Ingresar");
        chbomarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbomarcaItemStateChanged(evt);
            }
        });
        chbomarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbomarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelingresoLayout = new javax.swing.GroupLayout(panelingreso);
        panelingreso.setLayout(panelingresoLayout);
        panelingresoLayout.setHorizontalGroup(
            panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelingresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelingresoLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(bntingresar))
                    .addGroup(panelingresoLayout.createSequentialGroup()
                        .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(21, 21, 21)
                        .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(chbomarca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtprecio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmodelo1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmarca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbocategoria1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbofamilia1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtdescripcion1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcfecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbomarca1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelingresoLayout.setVerticalGroup(
            panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelingresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbofamilia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbocategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cbomarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbomarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtmodelo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(dcfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtdescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(bntingresar))
        );

        tablaavaluos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaavaluos);

        chboconsulta.setText("Consulta");
        chboconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboconsultaActionPerformed(evt);
            }
        });

        chboingreso.setText("Ingreso");
        chboingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboingresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chboingreso)
                            .addComponent(chboconsulta)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(chboingreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chboconsulta)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpalabraclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpalabraclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpalabraclaveActionPerformed

    private void cbofamiliaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbofamiliaItemStateChanged
        // TODO add your handling code here:
        //consulta
        //Pin = 1;
        String estado;
        int seleccionado = cbofamilia.getSelectedIndex();
        estado = (String) cbofamilia.getItemAt(seleccionado);
        if(estado.equals("Electronicos")){
            ping = 1;
            eleccion1();
        }
        if(estado.equals("Linea Blanca")){
            ping = 2;
            eleccion2();
        }
        if(estado.equals("Articulos Industriales")){
            ping = 3;
            eleccion3();
        }
        if(estado.equals("Vehiculos")){
            ping = 4;
            eleccion4();
        }
        if(estado.equals("Motocicletas")){
            ping = 5;
            eleccion5();
        }
        if(estado.equals("Instrumentos Musicales")){
            ping = 6;
            eleccion6();
        }        
    }//GEN-LAST:event_cbofamiliaItemStateChanged

    private void txtdescripcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcion1ActionPerformed

    private void cbofamilia1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbofamilia1ItemStateChanged
        // TODO add your handling code here:
        //Ingreso
        //Pin = 2;
        String estado;
        int seleccionado = cbofamilia1.getSelectedIndex();
        estado = (String) cbofamilia1.getItemAt(seleccionado);
        
        if(estado.equals("Electronicos")){
            ping = 1;
            eleccion1();
        }
        if(estado.equals("Linea Blanca")){
            ping = 2;
            eleccion2();
        }
        if(estado.equals("Articulos Industriales")){
            ping = 3;
            eleccion3();
        }
        if(estado.equals("Vehiculos")){
            ping = 4;
            eleccion4();
        }
        if(estado.equals("Motocicletas")){
            ping = 5;
            eleccion5();
        }
        if(estado.equals("Instrumentos Musicales")){
            ping = 6;
            eleccion6();
        }
    }//GEN-LAST:event_cbofamilia1ItemStateChanged

    private void bntingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntingresarActionPerformed
        // TODO add your handling code here:
        if(txtmodelo1.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane,"Debes ingresar el Modelo");
            txtmodelo1.requestFocus();
            return;
        }
        
        if(txtprecio.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane,"Debes ingresar el Precio");
            txtprecio.requestFocus();
            return;
        }
        
        if(txtdescripcion1.getText().length()==0){
            JOptionPane.showConfirmDialog(rootPane,"Debes ingresar una descripcion");
            txtdescripcion1.requestFocus();
            return;
        }
        
        vavaluos dts = new vavaluos();
        favaluos func = new favaluos();
        
        int seleccionado = cbofamilia1.getSelectedIndex();
        
        dts.setFamilia((String) cbofamilia1.getItemAt(seleccionado));
        
        int seleccionado2 = cbocategoria1.getSelectedIndex();
        dts.setSubfamilia((String) cbocategoria1.getItemAt(seleccionado2));
        
        if(chbomarca.isSelected()){
            dts.setMarca(txtmarca.getText());
        }else{
            int seleccionado3 = cbomarca1.getSelectedIndex();
            dts.setMarca((String) cbomarca1.getItemAt(seleccionado3));            
        }
        
        
        Calendar cal;
        int d,m,a;
        cal = dcfecha.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR)-1900;
        
        dts.setFecha(new Date(a,m,d));
        
        dts.setModelo(txtmodelo1.getText());
        dts.setPrecio(Double.parseDouble(txtprecio.getText()));
        dts.setDescripcion(txtdescripcion1.getText());
        
        if(func.insertar(dts)){
            JOptionPane.showMessageDialog(rootPane,"El ingreso del producto ha sido exitoso!");
            mostrar("");
            limpiar();
        }
        
    }//GEN-LAST:event_bntingresarActionPerformed

    private void chboingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboingresoActionPerformed
        // TODO add your handling code here:
        ingresar();
    }//GEN-LAST:event_chboingresoActionPerformed

    private void cbofamiliaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbofamiliaKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbofamiliaKeyPressed

    private void cbofamilia1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbofamilia1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbofamilia1KeyPressed

    private void chboconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboconsultaActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_chboconsultaActionPerformed

    
    private void chbomarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbomarcaActionPerformed
        // TODO add your handling code here:
        if(chbomarca.isSelected()){
            cbomarca1.setVisible(false);
            txtmarca.setVisible(true);
        }else{
            cbomarca1.setVisible(true);
            txtmarca.setVisible(false);
        }
    }//GEN-LAST:event_chbomarcaActionPerformed

    private void chbomarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbomarcaItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_chbomarcaItemStateChanged

    private void cbomarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbomarcaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbomarcaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int family = cbofamilia.getSelectedIndex();
        String familia = ((String) cbofamilia.getItemAt(family));
        
        int category = cbocategoria.getSelectedIndex();
        String categoria = ((String) cbocategoria.getItemAt(category));
        
        int brand = cbomarca.getSelectedIndex();
        String marca = ((String) cbomarca.getItemAt(brand));
        
        consultar(familia,categoria,marca);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmavaluos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmavaluos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmavaluos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmavaluos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmavaluos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntingresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbocategoria;
    private javax.swing.JComboBox<String> cbocategoria1;
    private javax.swing.JComboBox<String> cbofamilia;
    private javax.swing.JComboBox<String> cbofamilia1;
    public static javax.swing.JComboBox<String> cbomarca;
    public static javax.swing.JComboBox<String> cbomarca1;
    private javax.swing.JCheckBox chboconsulta;
    private javax.swing.JCheckBox chboingreso;
    private javax.swing.JCheckBox chbomarca;
    private com.toedter.calendar.JDateChooser dcfecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelbusqueda;
    private javax.swing.JPanel panelingreso;
    private javax.swing.JTable tablaavaluos;
    private javax.swing.JTextField txtdescripcion1;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtmodelo1;
    private javax.swing.JTextField txtpalabraclave;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
