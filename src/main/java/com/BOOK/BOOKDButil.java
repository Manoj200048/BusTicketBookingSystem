package com.BOOK;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.BOOK.BOOK12;
import com.BOOK.DBConnect;


public class BOOKDButil {
	
	
	





			
			private static boolean isSuccess;
			private static Connection con = null;
			private static Statement stmt = null;
			private static ResultSet rs = null;
		    
			public static boolean validate(String username) {
				
				try {
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					String sql = "select * from ticket2 where C_Uname='"+username+"'";
					rs = stmt.executeQuery(sql);
					
					if (rs.next()) {  
						isSuccess = true;
					} else {
						isSuccess = false;
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				return isSuccess;
			}
			
			public static List<BOOK12> getBOOK(String userName) {
				
				ArrayList<BOOK12> BOOK = new ArrayList<>();
				
				try {
					
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					String sql = "select * from ticket2 where C_Uname='"+userName+"'";
					rs = stmt.executeQuery(sql);
					
					while (rs.next()) {
						int Bookingid = rs.getInt(1);
						String C_Uname = rs.getString(2);
						int No_of_seates = rs.getInt(3);
						String reservation_date = rs.getString(4);
						int bus_id = rs.getInt(5);
						float price = rs.getFloat(6);
						
						BOOK12 B = new BOOK12(Bookingid ,C_Uname,No_of_seates,reservation_date, bus_id,price);
						BOOK.add(B);
					}
					
				} catch (Exception e) {
					
				}
				
				return BOOK;	
			}
			
			 public static List<BOOK12> getBOOK1(String Id) {
			    	
			    	int convertedID = Integer.parseInt(Id);
			    	
			    	ArrayList<BOOK12> b = new ArrayList<>();
			    	
			    	try {
			    		
			    		con = DBConnect.getConnection();
			    		stmt = con.createStatement();
			    		String sql = "select * from ticket2 where Bookingid='"+convertedID+"'";
			    		rs = stmt.executeQuery(sql);
			    		
			    		while(rs.next()) {
			    			
			    			int Bookingid = rs.getInt(1);
							String C_Uname = rs.getString(2);
							int No_of_seates = rs.getInt(3);
							String reservation_date = rs.getString(4);
							int bus_id = rs.getInt(5);
							float price = rs.getFloat(6);
							
							BOOK12 b1 = new BOOK12(Bookingid ,C_Uname,No_of_seates,reservation_date, bus_id,price);
							b.add(b1);
			    			
			    			b.add(b1);
			    		}
			    		
			    	}catch(Exception e) {
			    		e.printStackTrace();
			    	}
		           return b;
		   
			 }
		   
		 
		   
		    
		    
		    public static boolean deleteBOOK(String id) {
		    	
		    	int convId = Integer.parseInt(id);
		    	
		    	try {
		    		
		    		con = DBConnect.getConnection();
		    		stmt = con.createStatement();
		    		String sql = "delete from ticket2   where Bookingid='"+convId+"'";
		    		int r = stmt.executeUpdate(sql);
		    		
		    		if (r > 0) {
		    			isSuccess = true;
		    		}
		    		else {
		    			isSuccess = false;
		    		}
		    		
		    	}
		    	catch (Exception e) {
		    		e.printStackTrace();
		    	}
		    	
		    	return isSuccess;
		    }
		    
		    
		    
		    
		    public static boolean updatedate(String date,String username) {
		    	
		    	try {
		    		
		    		con = DBConnect.getConnection();
		    		stmt = con.createStatement();
		    		String sql = "update ticket2 set reservation_date='"+date+"' where C_Uname = '"+username+"'" ;
		    		int rs = stmt.executeUpdate(sql);
		    		
		    		if(rs > 0) {
		    			isSuccess = true;
		    		}
		    		else {
		    			isSuccess = false;
		    		}
		    		
		    	}
		    	catch(Exception e) {
		    		e.printStackTrace();
		    	}
		    	
		    	return isSuccess;
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}



	
	

