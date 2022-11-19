package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.employee;

public class empDao {
	Connection cn = null;

	public empDao() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int addEmployee(employee emp) {

		int addEmp = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, emp.getFname());
			ps.setString(3, emp.getLname());
			ps.setString(4, emp.getEmail());
			ps.setString(5, emp.getNumber());
			ps.setString(6, emp.getAddress());
			ps.setString(7, emp.getGender());
			ps.setString(8, emp.getPassword());

			addEmp = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return addEmp;
	}

	public ArrayList<employee> viewAllData() {

		ArrayList<employee> al = new ArrayList();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				employee e = new employee();

				e.setId(rs.getInt(1));
				e.setFname(rs.getString(2));
				e.setLname(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setNumber(rs.getString(5));
				e.setAddress(rs.getString(6));
				e.setGender(rs.getString(7));
				e.setPassword(rs.getString(8));

				al.add(e);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return al;
	}

	public int deleteEmployee(int id) {

		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("delete from employee where id=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public employee getDataById(int id) {

		employee e = new employee();

		try {
			PreparedStatement ps = cn.prepareStatement("select * from employee where id=?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				e.setId(rs.getInt(1));
				e.setFname(rs.getString(2));
				e.setLname(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setNumber(rs.getString(5));
				e.setAddress(rs.getString(6));
				e.setGender(rs.getString(7));
				e.setPassword(rs.getString(8));

			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return e;
	}

	public int updateEmployee(employee emp) {

		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement(
					"update employee set fname=?, lname=?, email=?, number=?, address=?, gender=?, password=? where id=? ");
			ps.setInt(8, emp.getId());
			ps.setString(1, emp.getFname());
			ps.setString(2, emp.getLname());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getNumber());
			ps.setString(5, emp.getAddress());
			ps.setString(6, emp.getGender());
			ps.setString(7, emp.getPassword());

			i = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;
	}

}
