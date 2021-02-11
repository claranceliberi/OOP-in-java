package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Main{

    public static void main(String[] args) throws Exception {

        int choice;
        int answer;
        String user = "root";
        String pass = "";
        Statement stmt = null;
        JDBC demo = new JDBC();
        Connection connection = null;


        do {
            System.out.println("1.Insert into table");
            System.out.println("2.Update table ");
            System.out.println("3.Read from table ");
            System.out.println("4.Delete from table ");
            Scanner sc= new Scanner(System.in);
            choice = sc.nextInt();
            if(choice ==1) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the User ID: ");
                String getId = scanner.nextLine();
                System.out.println("Enter the User Type: ");
                String userType = scanner.nextLine();

                connection = demo.myConnector(user,pass);
                int rowsInserted = demo.insert(connection, getId, userType);
                connection.close();

                if(rowsInserted > 0) {
                    System.out.println("New user inserted successfully");
                }
            }
            if(choice==2) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Update the User ID : ");
                String getId = scanner.nextLine();
                System.out.println("Update the User Type: ");
                String userType = scanner.nextLine();

                connection = demo.myConnector(user,pass);
                int rowsUpdated = demo.update(connection, getId, userType);
                connection.close();

                if(rowsUpdated > 0) {
                    System.out.println("Table Updated successfully");
                }
            }
            if(choice == 3) {
                connection = demo.myConnector(user,pass);
                ResultSet rs = demo.getAll(connection,stmt);
                int rows =0;
                String leftAlignFormat = "| %-3d | %-17s |%n";

                System.out.format("+-----+-------------------+%n");
                System.out.format("| ID  | Column name       |%n");
                System.out.format("+-----+-------------------+%n");
                while(rs.next()) {
                    int id = rs.getInt("id");
                    String type = rs.getString("type");
                    System.out.format(leftAlignFormat, id, type);
                    rows++;
                }
                System.out.format("+-----+-------------------+%n");

                if(rows <= 0) System.out.println("Table is empty \n");

                rs.close();
                connection.close();
            }
            if(choice==4) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Delete User ID : ");
                String getId = scanner.nextLine();

                connection = demo.myConnector(user,pass);
                int rowsDeleted =  demo.delete(connection,getId);
                connection.close();

                if(rowsDeleted > 0) {
                    System.out.println("Record Deleted successfully");
                }
            }
            System.out.println("Do you want to continue? [1/0]");
            Scanner sc1= new Scanner(System.in);
            answer= sc1.nextInt();
        }
        while(answer!=0);
    }

}
