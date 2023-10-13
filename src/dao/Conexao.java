package dao;

import mondrian.olap.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {


    public static Connection getConnection() {

        String url = "jdbc:postgresql://localhost:5432/Ed otica";
        String usuario = "postgres";
        String senha = "1234";
        Connection con = null;

        try {
            con = (Connection) DriverManager.getConnection(url, usuario,senha );
            System.out.println("CONECTADO");
        } catch (SQLException ex) {
            System.out.println("ERRO DE CONEXAO");
        }
        return con;
    }

    public static void main(String[] args) {
        Conexao.getConnection();
    }
}
