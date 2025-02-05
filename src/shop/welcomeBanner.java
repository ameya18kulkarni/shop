package shop;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class welcomeBanner {

	public static void main(String[] args) throws SQLException {
		System.out.println("        #          *Welcome to the Shop*          #        ");
        System.out.println("       ###         *Welcome to the Shop*         ###       ");
        System.out.println("      #####        *Welcome to the Shop*        #####      ");
        System.out.println("     #######       *Welcome to the Shop*       #######     ");
        System.out.println("    #########      *Welcome to the Shop*      #########    ");
        System.out.println("       |||               |||                     |||       ");
        System.out.println("       |||               |||                     |||       ");
        System.out.println("       |||               |||                     |||       ");
        
        showwelcomemsg();
        

	}
	public static void showwelcomemsg() throws SQLException
	{
		System.out.println("Please select following");
		System.out.println("1. Add bill \n2. View Bill.");
		 Scanner myObj = new Scanner(System.in);
		 int sel=myObj.nextInt();
		 switch(sel) {
		 case 2:
			 System.out.println("Enter bill number:");
			 int billnumber=myObj.nextInt();
			 ViewBill.viewbillitems(billnumber);
		 case 1:
			CreateBill.generatebill();
		 
		 }
		 
	}
	

}
