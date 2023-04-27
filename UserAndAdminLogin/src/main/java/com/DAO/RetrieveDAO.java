package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.Bean.ProductBean;
import com.DBConnection.DBConnection;

public class RetrieveDAO {
 public int k=0;
	public ArrayList<ProductBean>al=new ArrayList<ProductBean>();
	public ArrayList<ProductBean>retrieve()
	{
		try
		{
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("select * from product46");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			ProductBean pb=new ProductBean();
			pb.setpId(rs.getInt(1));
			pb.setpName(rs.getString(2));
			pb.setpPrice(rs.getInt(3));
			pb.setpQty(rs.getInt(4));
			al.add(pb);
		}
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return al;
	

}
	public ArrayList<ProductBean>retrieve1()
	{
		try
		{
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("select * from product46");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			ProductBean pb=new ProductBean();
			pb.setpId(rs.getInt(1));
			pb.setpName(rs.getString(2));
			pb.setpPrice(rs.getInt(3));
			pb.setpQty(rs.getInt(4));
			al.add(pb);
		}
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return al;
	
}
	
	public ProductBean delete1()
	{
		ProductBean pb=new ProductBean();
		try
		{
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("delete from product46");
//		ps.setInt(1, pb.getpId());
//		ps.setString(2, pb.getpName());
//		ps.setFloat(3, pb.getpPrice());
//		ps.setInt(4, pb.getpQty());
		ResultSet rs = ps.executeQuery();
		{
			pb.setpId(rs.getInt(1));
		}
		
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return pb;
	


	}

}
