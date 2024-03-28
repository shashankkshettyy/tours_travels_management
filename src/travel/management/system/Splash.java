package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    private Thread thread;

    Splash() {
        // Your splash screen initialization code here
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        
        add(image);
        setVisible(true);
        thread=new Thread(this);
        thread.start();
    }

    public void run() {
        try {
            // Display splash screen for 7 seconds
            Thread.sleep(7000);

            // After 7 seconds, open the login interface
            SwingUtilities.invokeLater(() -> {
                Login login = new Login();
                login.setVisible(true);
            });

            // Close the splash screen
            dispose();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Splash frame = new Splash();

        // You may need to change 'frame' to 'splash' in the animation loop
        int x=1;
        for( int i=1;i<=500;x+=7 ,i+=6)
        {
            frame.setLocation((750-(x+i)/2),400-(i/2));
            frame.setSize(x+i,i);
            try{
                Thread.sleep(10);
                }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // No need to start another thread for splash, as it's already started in the constructor
    }
}
