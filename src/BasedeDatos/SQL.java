package BasedeDatos;

//Librerias
import java.sql.Connection;//Conexion a la base de datos
import java.sql.DriverManager;//Driver para la conexion
import java.sql.SQLException;//Procesa sripts para sql
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SQL {
    static Connection cnn=null;
    static Statement sta=null;
    static ResultSet rst=null;
    //Datos para conectar a la base de datos
    static String user="root";
    static String pass="";
    static String url="jdbc:mysql://localhost:3306/dbinventario";
    
    public static Connection enlace(Connection cnn){
        try {
            Class.forName("com.mysql.jdbc.Driver");
             try {
              cnn=DriverManager.getConnection(url, user, pass);//el metodo getConnection siempre espera recibir un url,usuario y un password
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No Existe la base de datos " +ex.getMessage());
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null," Error de Driver "+ex);    
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
    //Clases hijos para realizar consultas
    //Tabla cliente
    public static ResultSet cliente(ResultSet rs){
        try {
            sta=declaracion(sta);
            rs=sta.executeQuery("select * from Clientes");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al seleccionar los clientes");
        }
        return rs;
     }
    public static ResultSet idCliente(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select id_cliente from Clientes");
	return rs;
     }
    //Tabla producto
    public static ResultSet producto(ResultSet rs){
        try {
            sta=declaracion(sta);
            rs=sta.executeQuery("select * from producto");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al obtener los datos de la tabla productos");
        }
        return rs;
     }
    public static ResultSet idProducto(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select id_producto from producto");
	return rs;
     } 
    //Tabla usuario
    public static ResultSet usuario(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select * from usuario");
	return rs;
     } 
    public static ResultSet idusuario(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select id_usuario from usuario");
	return rs;
     } 
    //tabla proveedor
    public static ResultSet proveedor(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select * from proveedor");
	return rs;
     } 
    public static ResultSet id_proveedor(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select id_proveedor from proveedor");
	return rs;
     } 
    //tabla auditoria
    public static ResultSet auditoria(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select * from auditoria");
	return rs;
     } 
    public static ResultSet idauditoria(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select id_auditoria from auditoria");
	return rs;
     } 
    //tabla compra
    public static ResultSet compra(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select * from compra");
	return rs;
     } 
    public static ResultSet idcompra(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select id_compra from compra");
	return rs;
     } 
    //tabla factura
    public static ResultSet factura(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select * from usuario");
	return rs;
     } 
    public static ResultSet idfactura(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select id_factura from factura");
	return rs;
     } 
    //tabla stock
    public static ResultSet stock(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select * from stock");
	return rs;
     } 
    public static ResultSet idstock(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select id_stock from stock");
	return rs;
     } 
    //tabla venta
    public static ResultSet venta(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select * from venta");
	return rs;
     } 
    public static ResultSet idventa(ResultSet rs) throws SQLException{
	sta=declaracion(sta);
	rs=sta.executeQuery("select id_venta from venta");
	return rs;
     } 
}
