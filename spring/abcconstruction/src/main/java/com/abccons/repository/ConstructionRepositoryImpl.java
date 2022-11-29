package com.abccons.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.abccons.entity.Construction;


@Repository
public class ConstructionRepositoryImpl implements ConstructionRepository {

	@Override
	public Construction createConstructor(Construction cons) {
		//jdbc code i will insert construction  into the db
		String url = "jdbc:mysql://localhost:3306/mindtree?useSSL=false";
		String user="root";
		String password="root@123";
		Connection con;
		PreparedStatement pstmt;
		int status=0;
		try {
			con = DriverManager.getConnection(url, user, password);
			pstmt=con.prepareStatement("INSERT INTO construction VALUES(?,?,?,?)");
			pstmt.setInt(1, cons.getCompanyRegistration());
			pstmt.setString(2, cons.getCompanyName());
			pstmt.setString(3, cons.getCompanyEmail());
			pstmt.setLong(4, cons.getCompanyProfit());
			status = pstmt.executeUpdate();
			if(status==0) {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return cons;
		
	}

	@Override
	public List<Construction> getAllConstructionCompany() {
		// jdbc code retirve all the constrution obj
		String url = "jdbc:mysql://localhost:3306/mindtree?useSSL=false";
		String user="root";
		String password="root@123";
		Connection con;
		PreparedStatement pstmt;
		ResultSet rs;
		List<Construction> list=new ArrayList<>();
		try {
			con = DriverManager.getConnection(url, user, password);
			pstmt=con.prepareStatement("SELECT * from construction");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Construction construction=new Construction();
				construction.setCompanyRegistration(rs.getInt(1));
				construction.setCompanyName(rs.getString(2));
				construction.setCompanyEmail(rs.getString(3));
				construction.setCompanyProfit(rs.getLong(4));
				list.add(construction);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public Construction getConstructionByRegNo(int regNo) {
		String url = "jdbc:mysql://localhost:3306/mindtree?useSSL=false";
		String user="root";
		String password="root@123";
		Connection con;
		PreparedStatement pstmt;
		ResultSet rs;
		Construction construction=null;
		try {
			con = DriverManager.getConnection(url, user, password);
			pstmt=con.prepareStatement("SELECT * from construction where regno=?");
			pstmt.setInt(1, regNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				construction=new Construction();
				construction.setCompanyRegistration(rs.getInt(1));
				construction.setCompanyName(rs.getString(2));
				construction.setCompanyEmail(rs.getString(3));
				construction.setCompanyProfit(rs.getLong(4));
			}else {
				construction=null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return construction;
	}

	@Override
	public List<Construction> deleteConstructionRegNo(int regNo) {
		String url = "jdbc:mysql://localhost:3306/mindtree?useSSL=false";
		String user="root";
		String password="root@123";
		Connection con;
		PreparedStatement pstmt;
		int status=0;
	
		try {
			con = DriverManager.getConnection(url, user, password);
			pstmt=con.prepareStatement("DELETE FROM construction where regno=?");
			pstmt.setInt(1, regNo);
			status = pstmt.executeUpdate();
			if(status==0) {
				return null;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getAllConstructionCompany();
		
	}

	@Override
	public Construction updateConstruction(Construction cons) {
		String url = "jdbc:mysql://localhost:3306/mindtree?useSSL=false";
		String user="root";
		String password="root@123";
		Connection con;
		PreparedStatement pstmt;
		int status=0;
		Construction construction=null;
		try {
			con = DriverManager.getConnection(url, user, password);
			pstmt=con.prepareStatement("UPDATE construction SET name=?,email=?,profit=? where regno=?");
			
			pstmt.setString(1, cons.getCompanyName());
			pstmt.setString(2, cons.getCompanyEmail());
			pstmt.setLong(3, cons.getCompanyProfit());
			pstmt.setInt(4, cons.getCompanyRegistration());
			status = pstmt.executeUpdate();
			if(status==0) {
				return null;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getConstructionByRegNo(cons.getCompanyRegistration());
	}

}
