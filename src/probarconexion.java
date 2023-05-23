/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author zzgro
 */
public class probarconexion {
    public static void main(String[] args) {
        Conexionmysql db = new Conexionmysql();
        db.getConnection();
    }
}
