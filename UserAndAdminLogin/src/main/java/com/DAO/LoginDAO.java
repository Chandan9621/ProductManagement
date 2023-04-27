package com.DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;

import com.Bean.AdminBean;
import com.Bean.ProductBean;
import com.Bean.UserBean;
import com.DBConnection.DBConnection;

public class LoginDAO {

	public int k = 0;
	public UserBean ub = null;

	public UserBean login(HttpServletRequest req) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from userlogin1 where uname=? and pword=?");
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pword"));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ub = new UserBean();
				ub.setUname(rs.getString(1));
				ub.setPword(rs.getString(2));
				ub.setFname(rs.getString(3));
				ub.setLname(rs.getString(4));
				ub.setAddr(rs.getString(5));
				ub.setMid(rs.getString(6));
				ub.setMobno(rs.getLong(7));
			}
		} catch (Exception e) {

		}
		return ub;

	}

	public AdminBean ab = null;

	public AdminBean login1(HttpServletRequest req) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from empadmin49 where uname=? and pword=?");
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pword"));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ab = new AdminBean();
				ab.setUname(rs.getString(1));
				ab.setPword(rs.getString(2));
				ab.setFname(rs.getString(3));
				ab.setLname(rs.getString(4));
				ab.setAddr(rs.getString(5));
				ab.setMid(rs.getString(6));
				ab.setPhno(Long.parseLong(rs.getString(7)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ab;

	}

	public int insert(ProductBean pb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into Product46 values(?,?,?,?)");
			ps.setInt(1, pb.getpId());
			ps.setString(2, pb.getpName());
			ps.setFloat(3, pb.getpPrice());
			ps.setInt(4, pb.getpQty());
			k = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}

	public ProductBean pbObject = null;

	public ProductBean reterive(ProductBean pb) {
		// EmployeeBean eb1 =
		System.out.println(pb.getpId());
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from product46 where pcode=?");
			ps.setInt(1, pb.getpId());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				pbObject = new ProductBean();
				pbObject.setpId(rs.getInt(1));
				pbObject.setpName(rs.getString(2));
				pbObject.setpPrice(rs.getInt(3));
				pbObject.setpQty(rs.getInt(4));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pbObject;
	}

	public int update(ProductBean pb) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("update product46 set pname=?,pprice=?,pqty=? where pcode=?");
			ps.setString(1, pb.getpName());
			ps.setInt(2, pb.getpPrice());
			ps.setInt(3, pb.getpQty());
			ps.setInt(4, pb.getpId());
			k = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;

	}

	public int insert1(UserBean ub) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into userlogin1 values(?,?,?,?,?,?,?)");
			ps.setString(1, ub.getUname());
			ps.setString(2, ub.getPword());
			ps.setString(3, ub.getFname());
			ps.setString(4, ub.getLname());
			ps.setString(5, ub.getAddr());
			ps.setString(6, ub.getMid());
			ps.setLong(7, ub.getMobno());
			k = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}

	public ProductBean reterive1(ProductBean pb) {

		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("delete from product46 where pcode=?");
			ps.setInt(1, pb.getpId());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				pbObject = new ProductBean();
				pbObject.setpId(rs.getInt(1));
//				   pbObject.setpName(rs.getString(2));
//				   pbObject.setpPrice(rs.getInt(3));
//				   pbObject.setpQty(rs.getInt(4));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pbObject;

	}
}
