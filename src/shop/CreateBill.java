package shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateBill {
	public static String generatebill() throws SQLException {
		Connection conn = DatabaseConnection.connect();
		BillProduct bobj=new BillProduct();
//		ArrayList<BillProduct> productarrArrayList=new ArrayList<>();
		
			System.out.println("Enter product id:");
			Scanner myObj = new Scanner(System.in);
			 String pid=myObj.nextLine();
			 String fetchproductqueryString="select productCode,productName,MSRP from products where productCode=?";
			 PreparedStatement myStmt= conn.prepareStatement(fetchproductqueryString);
			 myStmt.setString(1,pid);
			 ResultSet rSet=myStmt.executeQuery();
			 while (rSet.next()) {
				 System.out.println("Product details\n"+rSet.getString("productCode")+"\t"+rSet.getString("productName")+"\t"+rSet.getString("MSRP"));
				 bobj.setProductCode(rSet.getString("productCode"));
				 bobj.setProductName(rSet.getString("productName"));
				 bobj.setmrp(rSet.getInt("MSRP"));
//				 productarrArrayList.add(bobj);
			 }
			 
			 
			 
			 
		
		
		return null;
		
	}

}
