package org.v;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class JDBCExample {
    private static final String DS_URL = "jdbc:mysql://localhost:3306/user";
    private static final String DS_USERNAME = "root";
    private static final String DS_PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 建立连接
            connection = DriverManager.getConnection(DS_URL, DS_USERNAME, DS_PASSWORD);

            // 创建statement对象
            statement = connection.prepareStatement("select * from user");

            // 执行sql
            resultSet = statement.executeQuery("select * from user");

            // 解析结果
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                System.out.println("id " + id + ", name " + name);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(statement)) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if (Objects.nonNull(connection)) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
