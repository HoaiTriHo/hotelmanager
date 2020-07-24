package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DTO.Account_DTO;
import GUI.CreateTable;

public class Online_DAL {
	public void insertData(Account_DTO dto) {
		Connection conn = connectionMariaDB_DAL.getConnectionToDB();
		CreateTable tb = new CreateTable();
		try {
			PreparedStatement preState = conn
					.prepareStatement("insert into account(username, email, password, permission) " + "values(?,?,?,?)");
			preState.setString(1, dto.getUserName());
			preState.setString(2, dto.getEmail());
			preState.setString(3, dto.getPassWord());
			preState.setInt(4, dto.getPerMission());
			int i = preState.executeUpdate();
			if(i != -1)
				System.err.println("\n"+tb.createSpace()+"Regis success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}		
	}
}
