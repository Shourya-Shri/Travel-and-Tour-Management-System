package travel.and.tourism.management.system;

import java.sql.*;

public class Conn {
    
    // 1st step is to register the driver
    //2nd step is creating the connection string.
    //3rd step - creating the statement.
    //4th step- Executing MySql queries.
    // When you execute mysql queries using java,to help this JDBC comes.
    Connection c;// Connection is interface.
    
    Statement s;
    
    Conn(){
        try{
            //1st step
            Class.forName("com.mysql.cj.jdbc.Driver");// we initialise the drive with thelp of class.forName.
            
            //2nd step
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem","root","123456"); //To establis connection with mysql, it takes string
            
            //3rd step
            
            s=c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
