
package com.fenixtechnology.db;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos.
 * @date 28/08/2022
 * @time 15:16:38
 * Codigo: IN5BV
 */

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;


public class Conexion {
    private static final String HOST ="localhost";
    private static final String PORT = "3306";
    private static final String DB = "db_fenix_technology_in5bv";
    private static final String USER= "kinal";
    private static final String PASS="admin";
    private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB + "?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    
    private static BasicDataSource instanceBds;
    
    public static DataSource getInstanceDS(){
        if(instanceBds == null){
        instanceBds = new BasicDataSource();
        instanceBds.setUrl(URL);
        instanceBds.setUsername(USER);
        instanceBds.setPassword(PASS);
        instanceBds.setInitialSize(25);
        }
        return instanceBds;
    }
    
    public static Connection getConnection() throws SQLException{
        return getInstanceDS().getConnection();
    
    }
    
    public static void close(ResultSet rs) {
        try {
            if(rs != null){
            rs.close();
            }
        } catch (SQLException e) {
            System.err.println("se produjo un error al cerrar el objeto resultset...");
            e.printStackTrace(System.out);
        }
        
    }
     public static void close(PreparedStatement pstmt) {
        try {
            if(pstmt != null){
            pstmt.close();
            }
        } catch (SQLException e) {
            System.err.println("se produjo un error al cerrar el objeto PreparedStatement");
            e.printStackTrace(System.out);
        }
        
    }
     public static void close(Connection conn) {
        try {
            if(conn != null){
            conn.close();
            }
        } catch (SQLException e) {
            System.err.println("se produjo un error al cerrar el objeto Conenection");
            e.printStackTrace(System.out);
        }
        
    }
}

