
package ayl_eventos_reservas;

import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorBD {
    Connection conn = null;
    Statement stm = null;
    ResultSet rs;
    
    public boolean borrarEvento(int idReserva){
        int resultUpdate = 0;
       try{
            conn = ConectarBD.abrir();
            stm = conn.createStatement();
            
            String consulta2="delete from variedadesreserva where idReserva=" + idReserva;
            resultUpdate=stm.executeUpdate(consulta2);
            
            String consulta3="delete from variedadesextrareserva where idReserva=" + idReserva;
            resultUpdate=stm.executeUpdate(consulta3);
            
            String consulta4="delete from entradasreserva where idReserva=" + idReserva;
            resultUpdate=stm.executeUpdate(consulta4);
            
            String consulta5="delete from entradasespecialesreserva where idReserva=" + idReserva;
            resultUpdate=stm.executeUpdate(consulta5);
            
            String consulta="delete from reserva where idReserva=" + idReserva;
            resultUpdate=stm.executeUpdate(consulta);
                        
            if (resultUpdate != 0) {
                ConectarBD.cerrar();
                return true;
            } else {
                ConectarBD.cerrar();
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
            return false;
        }
       
    }
    
    public boolean registrarVarEntr(ArrayList<Object[]> variedades, ArrayList<Object[]> entradas){
        int resultUpdate = 0;
       try{
            conn = ConectarBD.abrir();
            stm = conn.createStatement();
            
            String consulta="select max(idReserva) as id from reserva";
            rs=stm.executeQuery(consulta);
            
            int idReserva = -1;
            while(rs.next()){
                idReserva = rs.getInt("id");
            }
            
            boolean hayEntVar = false;
            
            for (int i=0; i<variedades.size();i++) {
                hayEntVar = true;
                int idV = -1;
                if(variedades.get(i)[1] == "Variedad"){
                    idV = this.dameElID(variedades.get(i)[0], 0);
                    conn = ConectarBD.abrir();
                    stm = conn.createStatement();
                    String consulta2="insert into variedadesreserva values(" + idReserva + ", " + idV + ")";
                    resultUpdate=stm.executeUpdate(consulta2);
                }else{
                    idV = this.dameElID(variedades.get(i)[0], 1);
                    conn = ConectarBD.abrir();
                    stm = conn.createStatement();
                    String consulta2="insert into variedadesextrareserva values(" + idReserva + ", " + idV + ")";
                    resultUpdate=stm.executeUpdate(consulta2);
                }
            }
            
            for (int i=0; i<entradas.size();i++) {
                hayEntVar = true;
                int idE = -1;
                if(entradas.get(i)[1] == "Entrada"){
                    idE = this.dameElID(entradas.get(i)[0], 3);
                    conn = ConectarBD.abrir();
                    stm = conn.createStatement();
                    String consulta3="insert into entradasreserva values(" + idReserva + ", " + idE + ")";
                    resultUpdate=stm.executeUpdate(consulta3);
                }else{
                    idE = this.dameElID(entradas.get(i)[0], 4);
                    conn = ConectarBD.abrir();
                    stm = conn.createStatement();
                    String consulta3="insert into entradasespecialesreserva values(" + idReserva + ", " + idE + ")";
                    resultUpdate=stm.executeUpdate(consulta3);
                }
            }
            
            if(hayEntVar){
                if (resultUpdate != 0) {
                    ConectarBD.cerrar();
                    return true;
                } else {
                    ConectarBD.cerrar();
                    return false;
                }
            }else{
                return true;
            }
            
        } catch (Exception ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
            return false;
        }
       
    }
    
    public int dameElID(Object nombre, int tipo){
        int resultUpdate = 0;
        int id = -1;
       try{
            conn = ConectarBD.abrir();
            stm = conn.createStatement();
            
            if(tipo==0){
                String consulta="select id from variedades where variedad='"+nombre+"'";
                rs=stm.executeQuery(consulta);
                while(rs.next()){
                    id = rs.getInt("id");
                }
            }
            if(tipo==1){
                String consulta="select id from variedadesextra where variedadextra='"+nombre+"'";
                rs=stm.executeQuery(consulta);
                while(rs.next()){
                    id = rs.getInt("id");                    
                }
            }
            if(tipo==3){
                String consulta="select id from entradas where entrada='"+nombre+"'";
                rs=stm.executeQuery(consulta);
                while(rs.next()){
                    id = rs.getInt("id");                    
                }
            }
            if(tipo==4){
                String consulta="select id from entradasespeciales where entradaespecial='"+nombre+"'";
                rs=stm.executeQuery(consulta);
                while(rs.next()){
                    id = rs.getInt("id");                    
                }
            }
                        
            if (resultUpdate != 0) {
                ConectarBD.cerrar();
            } else {
                ConectarBD.cerrar();
            }
        } catch (Exception ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
        }
       return id;
    }
    
    public boolean registrarEvento(int idCliente, String fecha, String horario, String hora, int cantAdultos, int cantChicos, String localidad, String direccion, float precio, boolean señado, int seña){
        int resultUpdate = 0;
       try{
            conn = ConectarBD.abrir();
            stm = conn.createStatement();
            String consulta="insert into reserva(idCliente,fecha,horario,hora,cantAdultos,cantChicos,localidad,direccion,precio,señado,seña) values(" + idCliente + ", '" + fecha + "', '" + horario + "', '" + hora + "', " + cantAdultos + ", " + cantChicos + ", '" + localidad + "', '" + direccion + "', " + precio + ", " + señado + ", " + seña + ")";
            resultUpdate=stm.executeUpdate(consulta);
                        
            if (resultUpdate != 0) {
                ConectarBD.cerrar();
                return true;
            } else {
                ConectarBD.cerrar();
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
            return false;
        }
       
    }
    
    public boolean eliminarVarEntr(int idReserva){
        int resultUpdate = 0;
       try{
            conn = ConectarBD.abrir();
            stm = conn.createStatement();
            
            String consulta2="delete from variedadesreserva where idReserva=" + idReserva;
            resultUpdate=stm.executeUpdate(consulta2);
            
            String consulta3="delete from variedadesextrareserva where idReserva=" + idReserva;
            resultUpdate=stm.executeUpdate(consulta3);
            
            String consulta4="delete from entradasreserva where idReserva=" + idReserva;
            resultUpdate=stm.executeUpdate(consulta4);
            
            String consulta5="delete from entradasespecialesreserva where idReserva=" + idReserva;
            resultUpdate=stm.executeUpdate(consulta5);
                        
            if (resultUpdate != 0) {
                ConectarBD.cerrar();
                return true;
            } else {
                ConectarBD.cerrar();
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
            return false;
        }
       
    }
    
    public boolean editarEvento(int idReserva, String fecha, String horario, String hora, int cantAdultos, int cantChicos, String localidad, String direccion, float precio, boolean señado, int seña){
        int resultUpdate = 0;
       try{
            conn = ConectarBD.abrir();
            stm = conn.createStatement();
            String consulta="update reserva set fecha='" + fecha + "', horario='" + horario + "', hora='" + hora + "', cantAdultos=" + cantAdultos + ", cantChicos=" + cantChicos + ", localidad='" + localidad + "', direccion='" + direccion + "', precio=" + precio + ", señado=" + señado + ", seña=" + seña + " where idReserva=" + idReserva;
            resultUpdate=stm.executeUpdate(consulta);
                        
            if (resultUpdate != 0) {
                ConectarBD.cerrar();
                return true;
            } else {
                ConectarBD.cerrar();
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
            return false;
        }
       
    }
    
    public boolean eliminarCliente(int id){
        int resultUpdate = 0;
       try{
            conn = ConectarBD.abrir();
            stm = conn.createStatement();
            String consulta="delete from cliente where idCliente=" + id;
            resultUpdate=stm.executeUpdate(consulta);
                        
            if (resultUpdate != 0) {
                ConectarBD.cerrar();
                return true;
            } else {
                ConectarBD.cerrar();
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
            return false;
        }
       
    }
    
    public boolean registrarCliente(String nombre, String mail, String tel){
        int resultUpdate = 0;
       try{
            conn = ConectarBD.abrir();
            stm = conn.createStatement();
            String consulta="insert into cliente(nombre,mail,telefono) values('" + nombre + "','" + mail + "', '" + tel +"')";
            resultUpdate=stm.executeUpdate(consulta);
                        
            if (resultUpdate != 0) {
                ConectarBD.cerrar();
                return true;
            } else {
                ConectarBD.cerrar();
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
            return false;
        }
       
    }
    
    public boolean editarCliente(int id, String nombre, String mail, String tel){
        int resultUpdate = 0;
       try{
            conn = ConectarBD.abrir();
            stm = conn.createStatement();
            String consulta="update cliente set nombre='" + nombre + "', mail='" + mail + "', telefono='" + tel +"' where idCliente=" + id;
            resultUpdate=stm.executeUpdate(consulta);
                        
            if (resultUpdate != 0) {
                ConectarBD.cerrar();
                return true;
            } else {
                ConectarBD.cerrar();
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
            return false;
        }
       
    }
    
    public Vector<Vector<String>> dameLosClientes(){
        Vector<Vector<String>> laTabla=new Vector<Vector<String>>();
        
        try {
             conn = ConectarBD.abrir();
            stm = conn.createStatement();
            String consulta="select * from cliente";
            rs=stm.executeQuery(consulta);
            while(rs.next()){
                Vector<String> linea=new Vector<String>();
                int id=rs.getInt("idCliente");
                linea.add(""+id);
                String nombre=rs.getString("nombre");
                linea.add(nombre);
                String mail=rs.getString("mail");
                linea.add(mail);
                String tel=rs.getString("telefono");
                linea.add(tel);
                
                laTabla.add(linea);                
            }
               
        } catch (SQLException ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
            return laTabla;
        }
        return laTabla;
    
    }
    
    public Vector<Vector<String>> dameLasVariedades(){
        Vector<Vector<String>> laTabla=new Vector<Vector<String>>();
        
        try {
             conn = ConectarBD.abrir();
            stm = conn.createStatement();
            String consulta="select * from variedades";
            rs=stm.executeQuery(consulta);
            while(rs.next()){
                Vector<String> linea=new Vector<String>();
                //int id=rs.getInt("id");
                //linea.add(""+id);
                String nombre=rs.getString("variedad");
                linea.add(nombre);
                linea.add("Variedad");
                
                laTabla.add(linea);                
            }
            String consulta2="select * from variedadesextra";
            rs=stm.executeQuery(consulta2);
            while(rs.next()){
                Vector<String> linea=new Vector<String>();
                //int id=rs.getInt("id");
                //linea.add(""+id);
                String nombre=rs.getString("variedadextra");
                linea.add(nombre);
                linea.add("Variedad Extra");
                
                laTabla.add(linea);                
            }
               
        } catch (SQLException ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
            return laTabla;
        }
        return laTabla;
    
    }
    
    public Vector<Vector<String>> dameLasEntradas(){
        Vector<Vector<String>> laTabla=new Vector<Vector<String>>();
        
        try {
             conn = ConectarBD.abrir();
            stm = conn.createStatement();
            String consulta="select * from entradas";
            rs=stm.executeQuery(consulta);
            while(rs.next()){
                Vector<String> linea=new Vector<String>();
                //int id=rs.getInt("id");
                //linea.add(""+id);
                String nombre=rs.getString("entrada");
                linea.add(nombre);
                linea.add("Entrada");
                
                laTabla.add(linea);                
            }
            String consulta2="select * from entradasespeciales";
            rs=stm.executeQuery(consulta2);
            while(rs.next()){
                Vector<String> linea=new Vector<String>();
                //int id=rs.getInt("id");
                //linea.add(""+id);
                String nombre=rs.getString("entradaespecial");
                linea.add(nombre);
                linea.add("Entrada Especial");
                
                laTabla.add(linea);                
            }
               
        } catch (SQLException ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
            return laTabla;
        }
        return laTabla;
    
    }
    
    public Vector<Vector<String>> dameUnRegistro(int id){
        Vector<Vector<String>> laTabla=new Vector<Vector<String>>();
        
        try {
             conn = ConectarBD.abrir();
            stm = conn.createStatement();
            
            String consulta="select * from reserva r inner join cliente c on r.idCliente = c.idCliente where r.idReserva="+id;
            rs=stm.executeQuery(consulta);
            
            while(rs.next()){
                Vector<String> lineaDatos=new Vector<String>();
                //"ID","Nombre", "Adultos", "Niños", "Localidad", "Direccion", "Fecha", "Horario", "Hora","Precio","Señado", "Seña"
                String mail=rs.getString("mail");
                lineaDatos.add(mail);
                String tel=rs.getString("telefono");
                lineaDatos.add(tel);
                int adultos=rs.getInt("cantAdultos");
                lineaDatos.add(""+adultos);
                int chicos=rs.getInt("cantChicos");
                lineaDatos.add(""+chicos);
                String localidad=rs.getString("localidad");
                lineaDatos.add(localidad);
                String direccion=rs.getString("direccion");
                lineaDatos.add(direccion);
                
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                String fecha=df.format(rs.getDate("fecha"));
                lineaDatos.add(""+fecha);
                
                String horario=rs.getString("horario");
                lineaDatos.add(horario);
                String hora=rs.getString("hora");
                lineaDatos.add(hora);
                int precio=rs.getInt("precio");
                lineaDatos.add(""+precio);
                int señado=rs.getInt("señado");
                lineaDatos.add(""+señado);
                int seña=rs.getInt("seña");
                lineaDatos.add(""+seña);
                laTabla.add(lineaDatos);
            }
            
            String consulta2="select v.variedad from variedadesreserva vr inner join variedades v on vr.idVariedad = v.id where vr.idReserva="+id;
            rs=stm.executeQuery(consulta2);
            while(rs.next()){
                Vector<String> lineaDatos=new Vector<String>();
                String variedad=rs.getString("variedad");
                lineaDatos.add(variedad);
                lineaDatos.add("variedad");
            
                laTabla.add(lineaDatos);
            }
            
            String consulta3="select v.variedadextra from variedadesextrareserva vr inner join variedadesextra v on vr.idVariedadExtra = v.id where vr.idReserva="+id;
            rs=stm.executeQuery(consulta3);
            while(rs.next()){
                Vector<String> lineaDatos=new Vector<String>();
                String variedad=rs.getString("variedadextra");
                lineaDatos.add(variedad);
                lineaDatos.add("variedadextra");
            
                laTabla.add(lineaDatos);
            }
            
            String consulta4="select v.entrada from entradasreserva vr inner join entradas v on vr.idEntrada = v.id where vr.idReserva="+id;
            rs=stm.executeQuery(consulta4);
            while(rs.next()){
                Vector<String> lineaDatos=new Vector<String>();
                String entrada=rs.getString("entrada");
                lineaDatos.add(entrada);
                lineaDatos.add("entrada");
            
                laTabla.add(lineaDatos);
            }
            
            String consulta5="select v.entradaEspecial from entradasespecialesreserva vr inner join entradasespeciales v on vr.idEntradaEspecial = v.id where vr.idReserva="+id;
            rs=stm.executeQuery(consulta5);
            while(rs.next()){
                Vector<String> lineaDatos=new Vector<String>();
                String entrada=rs.getString("entradaEspecial");
                lineaDatos.add(entrada);
                lineaDatos.add("entradaespecial");
            
                laTabla.add(lineaDatos);
            }
            
               
        } catch (SQLException ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
            return laTabla;
        }
        return laTabla;
    
    }
    
    public Vector<Vector<String>> dameLaTabla(int filtro){
        Vector<Vector<String>> laTabla=new Vector<Vector<String>>();
        
        try {
             conn = ConectarBD.abrir();
            stm = conn.createStatement();
            String consulta="";
            switch(filtro){
                case 0:
                    consulta="select * from reserva r inner join cliente c on r.idCliente = c.idCliente where date_format(r.fecha, '/%Y/%d/%m/') BETWEEN date_format(curdate(), '/%Y/%d/%m/') and date_format((date_add(curdate(), interval 1 year)), '/%Y/%d/%m/') order by r.fecha";
                    break;
                case 1:
                    consulta="select * from reserva r inner join cliente c on r.idCliente = c.idCliente where date_format(r.fecha, '/%Y/%d/%m/') BETWEEN date_format('2021-12-12', '/%Y/%d/%m/') and date_format((date_add(curdate(), interval -1 day)), '/%Y/%d/%m/') order by r.fecha";
                    break;
                case 2:
                    consulta="select * from reserva r inner join cliente c on r.idCliente = c.idCliente order by r.fecha";
                    break;
                default:
                    consulta="select * from reserva r inner join cliente c on r.idCliente = c.idCliente order by r.fecha";
                    break;
            }
            rs=stm.executeQuery(consulta);
            while(rs.next()){
                Vector<String> linea=new Vector<String>();
                int id=rs.getInt("idReserva");
                linea.add(""+id);
                String nombre=rs.getString("nombre");
                linea.add(nombre);
                int cantAdultos=rs.getInt("cantAdultos");
                linea.add(""+cantAdultos);
                int cantChicos=rs.getInt("cantChicos");
                linea.add(""+cantChicos);
                String localidad=rs.getString("localidad");
                linea.add(localidad);
                String direccion=rs.getString("direccion");
                linea.add(direccion);
                
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                String fecha=df.format(rs.getDate("fecha"));
                linea.add(""+fecha);
                
                String horario=rs.getString("horario");
                linea.add(horario);
                String hora=rs.getString("hora");
                linea.add(hora);
                int precio=rs.getInt("precio");
                linea.add(""+precio);
                int señado=rs.getInt("señado");
                if(señado==0){
                    linea.add("No");
                }else if(señado==1){
                    linea.add("Sí");
                }
                int seña=rs.getInt("seña");
                linea.add(""+seña);
                
                laTabla.add(linea);                
            }
               
        } catch (SQLException ex) {
            System.out.println("Error en al base de datos");
            ex.printStackTrace();
            return laTabla;
        }
        return laTabla;
    
    }
    /*
    public int[] tamañosTabla(){
        Vector<Vector<String>> tabla = this.dameLaTabla();
        int[] tamaños = new int[2];
        
        tamaños[0] = tabla.size();
        tamaños[1] = tabla.get(0).size();
        
        return tamaños;
    }
    
    public Object[][] dameLaTablaFinal(){
        Vector<Vector<String>> laTabla= dameLaTabla();
        
        int tamañoI =laTabla.size();
        int tamañoJ = laTabla.get(0).size();
        
        Object[][] tabla = new Object[tamañoI][tamañoJ];
        
        for (int i = 0; i < tamañoI; i++){
            for (int j = 0; j < tamañoJ; j++){
                tabla[i][j] = laTabla.get(i).get(j);
            }
        }
        
        return tabla;
    }*/
    
    public Object[][] vectorObjetoConvertir(Vector<Vector<String>> vector){
        
        int tamañoI =vector.size();
        int tamañoJ=0;
        if (tamañoI!=0){
            tamañoJ = vector.get(0).size();
        }
        
        Object[][] tabla = new Object[tamañoI][tamañoJ];
        
        for (int i = 0; i < tamañoI; i++){
            for (int j = 0; j < tamañoJ; j++){
                tabla[i][j] = vector.get(i).get(j);
            }
        }
        
        return tabla;
    }
    
}