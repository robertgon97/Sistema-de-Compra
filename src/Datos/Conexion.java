package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    static Connection cnn=null;
    static Statement sta=null;
    static ResultSet rst=null;
    
    static String user="root";
    static String pass="";
    static String url="jdbc:mysql://localhost:3306/dbferreteria";
    
    
    public static Connection enlace(Connection cnn){
        try {
            Class.forName("com.mysql.jdbc.Driver");
             try {
              cnn=DriverManager.getConnection(url, user, pass);//el metodo getConnection siempre espera recibir un url,usuario y un password
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No Existe la base de datos" +ex.getMessage());
            }
           
        } catch (ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(null,"Error de Driver"+ex);    
        }
        return cnn;

    }
    public static Statement declaracion(Statement st){
        try {
            cnn=enlace(cnn);
            st=cnn.createStatement();
            
            
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error de declaracion");   
        }
        return st;
}
    public static ResultSet enlacecliente(ResultSet rs){
        try {
            sta=declaracion(sta);
            rs=sta.executeQuery("select * from Clientes");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al seleccionar los clientes");
        }
        return rs;
     }
    public static ResultSet enlaceproducto(ResultSet rs){
        try {
            sta=declaracion(sta);
            rs=sta.executeQuery("select * from Productos");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al obtener los datos de la tabla productos");
        }
        return rs;
     }
    public static ResultSet enlaceDetalleComprobante(ResultSet rs){
        try {
            sta=declaracion(sta);
            rs=sta.executeQuery("select * from detallecomprobantes");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al consultar de la tabla detallecomprobantes");
        }
        return rs;
     }
    public static ResultSet enlaceempleado(ResultSet rs){
        try {
            sta=declaracion(sta);
            rs=sta.executeQuery("select * from Empleados");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al consultar datos de empleados");
        }
        return rs;
     }
    public static ResultSet idComprobante(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select idComprobante from Comprobantes");
	return rs;
     } 
    public static ResultSet enlaceComprobante(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select * from Comprobantes");
	return rs;
     } 
    public static ResultSet idEmpleado(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select idEmpleado from Empleados");
	return rs;
     } 
    public static ResultSet idCliente(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select idCliente from Clientes");
	return rs;
     } 
    public static ResultSet idProducto(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select idProducto from Productos");
	return rs;
     } 
}
