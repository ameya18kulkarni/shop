package shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewBill {
public static void main(String[] args) {
	
}
public static String viewbillitems(int ordernumber) throws SQLException {
	Connection conn = DatabaseConnection.connect();
	String querytosearch="select orderdetails.productCode,orderdetails.quantityOrdered,products.productName,orderdetails.quantityOrdered*orderdetails.priceEach as Final_Price from orderdetails inner join products on products.productCode=orderdetails.productCode where orderdetails.orderNumber=?";
	PreparedStatement myStmt= conn.prepareStatement(querytosearch);
	myStmt.setInt(1,ordernumber);
	ResultSet myRs = myStmt.executeQuery();
	Double total_bill=0.0;
	System.out.println("productCode \t quantityOrdered \t productName \t Final_Price");
	while (myRs.next()) {
		String productCode=myRs.getString("productCode");
		String quantityOrdered=myRs.getString("quantityOrdered");
		String productName=myRs.getString("productName");
		Double Final_Price=myRs.getDouble("Final_Price");
		total_bill+=Final_Price;
		
		System.out.println(productCode+"\t"+quantityOrdered+"\t"+productName+"\t"+Final_Price);
	}
	System.out.println("Your total bill is: "+total_bill);
	return null;
	
	
}

}
