package com.tds171a.aula21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tds171a.aula19.Funcionario;
import com.tds171a.aula19.Professor;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("inicio");

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "aluno", "aluno");

            /*PreparedStatement sttm = connection.prepareStatement("select * from funcionarios");
            ResultSet rs = sttm.executeQuery();

            while(rs.next()) {
                System.out.println(rs.getString("nome") + " - " + rs.getDouble("salario") + " - " + rs.getInt("tipo"));
            }*/

            Funcionario func = new Professor("Broh", 100.0);

            /*PreparedStatement sttm = connection.prepareStatement("insert into funcionarios values(?,?,?)");
            sttm.setString(1, func.getNome());
            sttm.setDouble(2, func.getSalario());
            sttm.setInt(3, (func instanceof Professor ? 3 : (func instanceof Secretario ? 2 : 1)));
            sttm.executeUpdate();
            if(sttm != null)
                sttm.close();

            sttm = null;

            sttm = connection.prepareStatement("delete from funcionarios where nome = ?");
            sttm.setString(1, func.getNome());
            sttm.executeUpdate();
            if(sttm != null)
                sttm.close();

            sttm = null;*/

            PreparedStatement sttm = connection.prepareStatement("update funcionarios set salario = 5000 where nome = ?");
            sttm.setString(1, "Brian");
            sttm.executeUpdate();
            if(sttm != null)
                sttm.close();

            if(connection != null)
                connection.close();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException Except)
        {
            Except.printStackTrace();
        }

        System.out.println("fim");
    }

}
