package HW;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connect {
	private static final String URL = "jdbc:mysql://localhost:3306/figura";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    String sql = "INSERT INTO shape(Name_shape, color, perimeter,  area ) VALUE(?,?,?,?);";
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    public Connect(){
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addValue(String name, String color, double perimeter, double area) throws SQLException{
    	
    	preparedStatement = connection.prepareStatement(sql);
    	
    	preparedStatement.setString(1, name);
    	preparedStatement.setString(2, color);
    	preparedStatement.setDouble(3, perimeter);
    	preparedStatement.setDouble(4, area);
    	preparedStatement.executeUpdate();
    	
    }
    
    public void closeAll() throws SQLException{
    	preparedStatement.close();
    	connection.close();
    }
}
