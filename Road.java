/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakth
 */
import java.sql.*;
public class Road{

	public static void main(String[] args) {
		Road r=new Road();
		r.insert();
		r.delete();
		r.drop();
		r.update();
		r.rename();
		r.retreive();
		r.citycorporation();
		//r.supervisor();
		//r.materials();
		//r.corporation_admin();
		//r.major();
		//r.systems();
		System.out.println("********ROAD MANAGEMENT***************");
	
	}
		private void retreive()
		{
		try
		{
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sakthi","password");
	      Statement st=con.createStatement();
	      String sql="select * from resident where aadharno=173";
	      ResultSet rs=st.executeQuery(sql);
	      System.out.println("resident details");
	      while(rs.next())
	    	  System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
	      con.close();
	      //citycorporation();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}


private void insert()
{
	try
	{
	try
	{
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mohana","praveen");
      Statement st=con.createStatement();
      String sql="insert into systems(sys_no,clerk_name,types_of_repair,problemno) values(,'','mess1',18)";
      ResultSet rs=st.executeQuery(sql);
      while(rs.next())
      System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
      
      con.close();
	}catch(SQLException e)
	{    }
	}catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("inserted");
}

private void delete()
{
	try
	{
	try
	{
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mohana","praveen");
      Statement st=con.createStatement();
      String sql="delete from resident where aadharno=175";
      st.executeUpdate(sql);
      con.close();
	}catch(SQLException e)
	{   }
	}catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("deleted");
}

private void drop()
{try

	{
	try
	{
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mohana","praveen");
      Statement st=con.createStatement();
      String sql="drop table sample ";
      st.executeUpdate(sql);
      con.close();
	}
	catch(SQLException s)
	{
	}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
    System.out.println("droped");
}


private void update()
{
	try
	{
	try
	{
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mohana","praveen");
      Statement st=con.createStatement();
      String sql="update systems set types_of_repair='block' where sys_no=2";
      ResultSet rs=st.executeQuery(sql);
      while(rs.next())
    	  System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
      con.close();
	}
	catch(SQLException s)
	{
	}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

}

private void rename()
{
	try
	{
	try
	{
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mohana","praveen");
      Statement st=con.createStatement();
      String sql="Rename  system to systems ";
      st.executeUpdate(sql);
      //while(rs.next())
    	//  System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
      con.close();
	}
	catch(SQLException e)
	{
	}
	}

	
	catch(Exception e)
	{
		System.out.println(e);
	}
	}




private void citycorporation()
{
	try
	{
		
try
{
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mohana","praveen");
  Statement st=con.createStatement();
  String sql="select * from citycorporation where corporationid=165";
  ResultSet rs=st.executeQuery(sql);
  System.out.println("citycorporation");
  while(rs.next())
	  System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3) +" "+rs.getString(4));
  con.close();
  //supervisor();
}
catch(SQLException e){
}
}
catch(Exception e)
{
	System.out.println(e);
}
	

}
}