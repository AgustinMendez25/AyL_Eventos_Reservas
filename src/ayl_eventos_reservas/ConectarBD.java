
package ayl_eventos_reservas;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarBD {
    public static Connection con;
    private static String bd = "bdqslavaidfnyibempgr";
    public static String usuario = "u9zpmxxheoxok60r";
    public static String passw = "qrCH5LMU6ZcvkRfmkgtG";
    public static String url = "jdbc:mysql://bdqslavaidfnyibempgr-mysql.services.clever-cloud.com/" + bd;
    
    public static Connection abrir(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            //con = DriverManager.getConnection(url,usuario,passw);
            con = DriverManager.getConnection(url,usuario,passw);
            
        } catch (Exception e){
            System.out.println("Error en la conexion...");
            e.printStackTrace();
        }
        return con;
    }
    
    public static void cerrar(){
        try{
            if(con != null)
                con.close();
        } catch (Exception e){
            System.out.println("Error: No se logró cerrar conexión:\n" + e);
        }
    }
}
