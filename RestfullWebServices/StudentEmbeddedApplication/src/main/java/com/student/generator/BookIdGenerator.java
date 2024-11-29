package com.student.generator;



import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class BookIdGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        String prefix = "_";
        String suffix = "";

        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            connection = session.getJdbcConnectionAccess().obtainConnection();
            statement = connection.createStatement();

            String sql = "SELECT id FROM book_id_generator";
            rs = statement.executeQuery(sql);

            if (rs.next()) {
                int seq = rs.getInt(1);
                suffix = String.valueOf(seq);
                String updateSql = "UPDATE book_id_generator SET id = id + 1";
                statement.executeUpdate(updateSql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return prefix + suffix;
    }
}

