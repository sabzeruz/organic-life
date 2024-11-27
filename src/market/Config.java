/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package market;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Muhammad Afliansyah
 */
public class Config {
    private static Connection config;  

    public static Connection getConfig() {
        if (config == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/market";
                String user = "root";
                String password = "1";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                config = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi ke database berhasil.");
            } catch (Exception e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
                writeLog("Koneksi gagal: " + e.getMessage());
            }
        }
        return config;
    }

    public static void writeLog(String message) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            System.err.println("Gagal menulis log: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        // Pengujian koneksi
        Connection connection = getConfig();
        if (connection != null) {
            System.out.println("Pengujian koneksi berhasil.");
        } else {
            System.out.println("Pengujian koneksi gagal.");
        }
    }
}