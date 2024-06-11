package tugasUASPBO;

import java.sql.Connection;
import java.sql.SQLException;

public class tugasUASPBO {
   public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = koneksi.getConnection();
            if (connection != null) {
                System.out.println("Koneksi ke database berhasil!");
            }
        } catch (SQLException e) {
            System.out.println("Koneksi ke database gagal!");
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}


