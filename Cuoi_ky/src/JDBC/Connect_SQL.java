package JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Account;
import model.Student;

public class Connect_SQL {
	static String url = "jdbc:mysql://localhost:3306/studentss?useUnicode=true&characterEncoding=UTF-8";
	static String user = "root";
	static String password = "";
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url,user,password);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return connection;
	}
	public static List<Student> findAll(){
		List<Student>studentList = new ArrayList<>();
		String query = "select*from thisinh";
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {   
				Student st = new Student(rs.getInt("id"),rs.getString("Name"),rs.getString("Birthplace"),rs.getDate("Birthdate"),
						rs.getString("Block"), rs.getString("Number_Phone"),rs.getInt("Sex"));
				studentList.add(st);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return studentList;
	}
	public static void insert(Student st) {
		try {
            Connection connection = getConnection();
            String query = "INSERT INTO thisinh(id, Name, Birthplace, Birthdate, Block, Number_Phone, Sex) values(?,?,?,?,?,?,?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, st.getId());
                preparedStatement.setString(2, st.getName());
                preparedStatement.setString(3, st.getQueQuan());
                preparedStatement.setDate(4, new java.sql.Date(st.getNgaySinh().getTime()));
                preparedStatement.setString(5, st.getKhoiThi());
                preparedStatement.setString(6, st.getSDT());
                preparedStatement.setInt(7, st.getGioiTinh());

                preparedStatement.executeUpdate();
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
	public static void delete(Student st) {
		String query = "delete from thisinh where Name='"+st.getName()+"'";
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void Update(Student st) {
		String query = "Update thisinh set id=?, Name=?, Birthplace=?, Birthdate=?, Block=?, Number_Phone=?, Sex=? where Name='"+st.getName()+"'";
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, st.getId());
			pstmt.setString(2, st.getName());
			pstmt.setString(3, st.getQueQuan());
			pstmt.setDate(4, new java.sql.Date(st.getNgaySinh().getTime()));
			pstmt.setString(5, st.getKhoiThi());
			pstmt.setString(6, st.getSDT());
			pstmt.setInt(7, st.getGioiTinh());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean isStudentExists(String studentName) {
	    boolean exists = false;
	    String query = "SELECT COUNT(*) FROM thisinh WHERE Name= ?";
	    try (Connection connection = Connect_SQL.getConnection();
	         PreparedStatement pstmt = connection.prepareStatement(query)) {
	        pstmt.setString(1, studentName);
	        ResultSet resultSet = pstmt.executeQuery();
	        if (resultSet.next()) {
	            int count = resultSet.getInt(1);
	            exists = (count > 0);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return exists;
	}
	public static List<Student> findByName(Student s) {
	    List<Student> studentList = new ArrayList<>();
	    String query = "SELECT * FROM thisinh WHERE thisinh.Name LIKE ?";
	    try (Connection connection = getConnection();
	         PreparedStatement stmt = connection.prepareStatement(query)) {
	    	stmt.setString(1, "%" + s.getName() + "%");
	        ResultSet rs = stmt.executeQuery();
	        while (rs.next()) {
	            Student st = new Student(rs.getInt("id"), rs.getString("Name"), rs.getString("Birthplace"), rs.getDate("Birthdate"),
	                    rs.getString("Block"), rs.getString("Number_Phone"), rs.getInt("Sex"));
	            studentList.add(st);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return studentList;
	}
	public static void dangKi(Account ac) {
		try {
            Connection connection = getConnection();
            String query = "INSERT INTO dangki(usename, pass, confirm) values(?,?,?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, ac.getUser_name());
                preparedStatement.setString(2, ac.getPass());
                preparedStatement.setString(3, ac.getPass_conf());

                preparedStatement.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	public static boolean dangnhap(Account ac) {
		boolean loginSuccess = false;
		try {
	        Connection connection = getConnection();
	        String query = "SELECT * FROM dangki WHERE usename=? AND pass=?";
	        try (PreparedStatement preparedStatement = connection.prepareCall(query)) {
	            preparedStatement.setString(1, ac.getUser_name());
	            preparedStatement.setString(2, ac.getPass());
	            try (ResultSet rs = preparedStatement.executeQuery()) {
	                if (rs.next()) {
	                    loginSuccess = true;
	                }
	            }
	        }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return loginSuccess;
	}
}
