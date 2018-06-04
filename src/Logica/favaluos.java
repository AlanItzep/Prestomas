/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.vavaluos;
import static Presentacion.frmavaluos.cbomarca;
import static Presentacion.frmavaluos.cbomarca1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONY
 */
public class favaluos {
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros; 
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String[] titulos = {
            "ID Avaluos",
            "Familia",
            "Subfamilia",
            "Marca",
            "Modelo",
            "Fecha",
            "Precio",
            "Descripcion"};

        String[] registro = new String[8];

            totalregistros = 0;
            modelo = new DefaultTableModel(null, titulos);

            sSQL = "select a.idavaluos, a.familia, a.subfamilia, a.marca, a.modelo,"
                    + "a.fecha,a.precio,a.descripcion from avaluos a where familia like '%" 
                    + buscar + "%' order by idavaluos desc";

            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sSQL);

                while (rs.next()) {
                    registro[0] = rs.getString("idavaluos");
                    registro[1] = rs.getString("familia");
                    registro[2] = rs.getString("subfamilia");
                    registro[3] = rs.getString("marca");
                    registro[4] = rs.getString("modelo");
                    registro[5] = rs.getString("fecha");
                    registro[6] = rs.getString("precio");
                    registro[7] = rs.getString("descripcion");

                    totalregistros = totalregistros + 1;
                    modelo.addRow(registro);
                }
                return modelo;
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
                return null;
            }
    }
    
    public DefaultTableModel consultar(String familia,String categoria, String marca){
        DefaultTableModel modelo;
        String[] titulos = {
            "ID Avaluos",
            "Familia",
            "Subfamilia",
            "Marca",
            "Modelo",
            "Fecha",
            "Precio",
            "Descripcion"};

        String[] registro = new String[8];

            totalregistros = 0;
            modelo = new DefaultTableModel(null, titulos);

            sSQL = "select * from avaluos where familia like '%"+ familia +"%' "
                    + "AND subfamilia like '%"+ categoria +"%' AND marca like '%"+ marca +"%' "
                    + "order by idavaluos desc ";

            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sSQL);

                while (rs.next()) {
                    registro[0] = rs.getString("idavaluos");
                    registro[1] = rs.getString("familia");
                    registro[2] = rs.getString("subfamilia");
                    registro[3] = rs.getString("marca");
                    registro[4] = rs.getString("modelo");
                    registro[5] = rs.getString("fecha");
                    registro[6] = rs.getString("precio");
                    registro[7] = rs.getString("descripcion");

                    totalregistros = totalregistros + 1;
                    modelo.addRow(registro);
                }
                return modelo;
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
                return null;
            }
    }
    
    
    public void cargarmarcas(String registro){
        //String registro;
        
        sSQL = "select DISTINCT a.marca from avaluos a where familia = a.familia";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
                        
            while(rs.next()){
                registro = rs.getString(1);
                cbomarca.addItem(registro);
                cbomarca1.addItem(registro);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public boolean insertar(vavaluos dts){
        sSQL = "insert into avaluos (familia, subfamilia,marca,modelo,fecha,precio,descripcion)"+
            "values(?,?,?,?,?,?,?)";
    try{
        PreparedStatement pst = cn.prepareStatement(sSQL);
        pst.setString(1, dts.getFamilia());
        pst.setString(2, dts.getSubfamilia());
        pst.setString(3, dts.getMarca());
        pst.setString(4, dts.getModelo());
        pst.setDate(5, dts.getFecha());
        pst.setDouble(6, dts.getPrecio());
        pst.setString(7, dts.getDescripcion());
        
        int n = pst.executeUpdate();
        
        if(n != 0){
            return true;
        }else{
            return false;
        }
        
    }catch(Exception e){
        JOptionPane.showConfirmDialog(null, e);
        return false;
    }
    }
}
