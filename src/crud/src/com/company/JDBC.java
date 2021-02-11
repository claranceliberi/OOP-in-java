package com.company;

import java.sql.*;

public class JDBC {

    public Connection myConnector(String username, String password) throws Exception{
        String url = "jdbc:mysql://127.0.0.1:3306/exam_dbs?useSSL=false";
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            throw e;
        }

        return connection;
    }

    public int insert(Connection connection,String getId, String userType) throws Exception{
        String sql = "INSERT INTO userTypes" + "(id,type)" + "VALUES(?,?)";

        PreparedStatement state = connection.prepareStatement(sql);

        state.setString(1, getId);
        state.setString(2, userType);

        return state.executeUpdate();
    }

    public int update(Connection connection, String getId, String userType) throws Exception{
        String sql1 = "UPDATE userTypes "
                + "SET type = ? "
                + "WHERE id = ?";

        PreparedStatement state = connection.prepareStatement(sql1);

        state.setString(1, userType);
        state.setString(2, getId);

        return state.executeUpdate();
    }

    public ResultSet getAll(Connection connection, Statement stmt) throws Exception{
        String sql = "SELECT * from userTypes";
        stmt = connection.createStatement();
        return stmt.executeQuery(sql);
    }

    public int delete(Connection connection,String id) throws Exception{
        String sql1 = "DELETE from userTypes "+ "where id = ?";
        PreparedStatement state = connection.prepareStatement(sql1);
        state.setString(1, id);

        return state.executeUpdate();
    }
}
