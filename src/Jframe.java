package project_midterm;

import java.util.* ;
import java.math.* ;
import javax.swing.* ;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;

public class Jframe implements ActionListener {
    
         JFrame startFrame = new JFrame(); // make new object from JFrame class ;
         JLabel bakcGroundLabel = new JLabel();  // make object from JLabel ;
         JButton button = new JButton();  // make object from JButton ;
         JLabel leftSharkLabel = new JLabel();
         JButton test = new JButton ();

         
    
         public Jframe(){
             
        //Start frame
        startFrame.setSize(1700,1000); // set size of framw ;
        startFrame.setResizable(false); // prevent frame from resizable ;
        
        //exit out of application with click on exit icon ;
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startFrame.setTitle("Sea Battle"); // set title for fram ;
        startFrame.setLocationRelativeTo(null);// method to display frame in center
        
        // set icon image ;
        ImageIcon icon_image = new ImageIcon("icon.png");// make new object from ImageIcon class ;
        startFrame.setIconImage(icon_image.getImage()); // set icon image ;
       
        // change back ground color ;
        startFrame.getContentPane().setBackground(new Color (233 , 233 , 252)); // set the color of backgraound
      
        // button
        button.setSize(new Dimension(280 ,140));
        ImageIcon startbutton = new ImageIcon("startbutton.png");
        button.setIcon(startbutton);
        button.setLocation(600 , 530);
       
        // button.setText("Start");
        button.setFocusable(false);
       
       // button.setFont(new Font("segoe print", Font.BOLD , 40));
       // button.setForeground(new Color(112 , 146 , 190 ));
        javax.swing.border.Border buttonborder = BorderFactory.createLineBorder(Color.yellow ,2);    
        button.setBorder(buttonborder);
        button.addActionListener( this );

       //back ground label 
       ImageIcon load_image = new ImageIcon("load.JPG"); // creat object from image icon ;
       bakcGroundLabel.setIcon(load_image);// set image icon for background ;
       javax.swing.border.Border border = BorderFactory.createLineBorder(Color.yellow ,4);    
       bakcGroundLabel.setBorder(border);

       // left shark label 
       ImageIcon leftShark = new ImageIcon ("shark1.png");
       leftSharkLabel.setIcon(leftShark);
       leftSharkLabel.setBounds(30, 55, leftShark.getIconWidth(), leftShark.getIconHeight());
       
       test.setSize(300, 300);
       test.setLocation(120, 120);
       test.addActionListener(this);
       
        
       startFrame.setVisible(true); // setvisible method , get boolean parameter to visible or not visible frame ;
       
       
       //add component to Startframe ;
       startFrame.add(button); 
       startFrame.add(leftSharkLabel);
      //startFrame.add(rightSharkLabel);

       startFrame.add(bakcGroundLabel);
       //startFrame.add(test);
      
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == button){
           startFrame.dispose();
           new playwith();
           
       }
       if(e.getSource() == test){
           startFrame.dispose();
            new Winner2();
       }
    }

    
           
    
    
    
}
