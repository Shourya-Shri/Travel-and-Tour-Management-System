package travel.and.tourism.management.system;

import javax.swing.*; //swing package
import java.awt.*; //Image class is in awt package

public class Splash extends JFrame implements Runnable{  // Multithreading can be implemented using Thread class and runnable interface but we can't implemet two class at the same time that is multiple inheritance and so here we use runnable interface which helps in multiple inheritance
    //Either override the method in runnable interface or make this the abstract class and we can't create the object of abstract class.
    
    Thread thread;
    
    Splash(){
        //setSize(1200,600);
        //setLocation(200,200);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);// We can't directly add the the object of image class to JLabel, so firstly we have to create an icon to add it in JLabel.
        JLabel image = new JLabel(i3);
        add(image);//To place image on frame
        
        setVisible(true);
        
        thread=new Thread(this);
        thread.start(); //start method internaly calls run method.
    }
    public void run(){
        try{
            Thread.sleep(7000);// To give the 7 second hold so that next window, we have to open the login window, It will stop the execution for 7 second and after that it will reach to setvisible(false);
            
            setVisible(false);
        }catch(Exception e){
            
        }
    }
    
    
    public static void main(String args[]){
        Splash frame=new Splash();
        
        int x=1;
        for(int i=1;i<=500;x+=7,i+=6){
            frame.setLocation(750-(x+i)/2,400-i/2);
            frame.setSize(x+i,i);
            try{
                Thread.sleep(10);
            }catch(Exception e){
                
            }
        }
    }
}
