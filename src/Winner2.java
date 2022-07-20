
package project_midterm;

// imports ;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static project_midterm.withMyFriend.shootCount_L;
import static project_midterm.withMyFriend.shootCount_R;
import static project_midterm.withMyFriend.targetShoots_L;
import static project_midterm.withMyFriend.targetShoots_R;
import static project_midterm.withMyFriend.totalPoint_L;
import static project_midterm.withMyFriend.totalPoint_R;


public class Winner2  implements  ActionListener{
     // creat winner frame label ;
    JFrame winnerFrame = new JFrame("Sea Battle");
    
    // winner 1 , 2 labels ;
    JLabel winner1 = new JLabel();
    JLabel winner2 = new JLabel();
    
    // crown label ;
    JLabel crown = new JLabel();
    
    // winner label  ;
    JLabel winnerLabel = new JLabel();
    
    // arow label ;( this arrow direction is in winner ) ;
    JLabel winnerArrow = new JLabel();
    
    
    // points label ;
     JLabel totalPointL = new JLabel(""+totalPoint_L);
     JLabel shootCountL = new JLabel(""+ project_midterm.withMyFriend.shootCount_L);
     JLabel targetShootsL = new JLabel(""+ project_midterm.withMyFriend.targetShoots_L);
     JLabel totalPointR = new JLabel(""+ project_midterm.withMyFriend.totalPoint_R);
     JLabel shootCountR = new JLabel(""+ project_midterm.withMyFriend.shootCount_R);
     JLabel targetShootsR = new JLabel(""+ project_midterm.withMyFriend.targetShoots_R);
     JLabel totalPointTextLeft = new JLabel("Total point : ");
     JLabel shootCountTextLeft = new JLabel("Shoot count : ");
     JLabel targetShootsTextLeft = new JLabel("Targer shoots : ");
     JLabel totalPointTextRight = new JLabel("Total point : ");
     JLabel shootCountTextRight = new JLabel("Shoot count : ");
     JLabel targetShootsTextRight = new JLabel("Targer shoots : ");
     
     // player 1 , 2 labels ;
     JLabel player_1 = new JLabel("Player 1");
     JLabel player_2 = new JLabel("player 2");
     
     // rematch button ;
     JButton rematchButton = new JButton("Rematch");

     // constructor ;
    Winner2(){
        
     // JFrame ;        
    winnerFrame.setSize(1700,1000); // set size of framw ;
    winnerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    winnerFrame.setResizable(false);    
    ImageIcon icon_image = new ImageIcon("icon.png");
    winnerFrame.setIconImage(icon_image.getImage());
    winnerFrame.getContentPane().setBackground(new Color(233 , 233 , 252));
    winnerFrame.setLocationRelativeTo(null);// method to display frame in center
    winnerFrame.setLayout(null);
    
    
    // creat objects from Image Icon ;
    ImageIcon winner_1 = new ImageIcon("winner1.png");
    ImageIcon winner_2 = new ImageIcon("winner2.png");
    ImageIcon crown1 = new ImageIcon("crown.png");
    ImageIcon winnerArrow1 = new ImageIcon("winRightArrow.png");
    ImageIcon winnerLabel1 = new ImageIcon("win.png");
    
    // set the bounds and icons ;
    winner1.setIcon(winner_1);
    winner1.setBounds(1000, 150, winner_1.getIconWidth(), winner_1.getIconHeight());
    
    winner2.setIcon(winner_2);
    winner2.setBounds(200, 150, winner_2.getIconWidth(), winner_2.getIconHeight());
    
    crown.setIcon(crown1);
    crown.setBounds(1130, 76, crown1.getIconWidth(), crown1.getIconHeight());
    
    winnerArrow.setIcon(winnerArrow1);
    winnerArrow.setBounds(715, 360, winnerArrow1.getIconWidth(), winnerArrow1.getIconHeight());
    
    winnerLabel.setIcon(winnerLabel1);
    winnerLabel.setBounds(630, 110, winnerLabel1.getIconWidth(), winnerLabel1.getIconHeight());
    
    
            totalPointL.setBounds(510,450, 400, 400); 
            totalPointL.setFont(new Font("segoe print" , Font.BOLD ,60));

           shootCountL.setBounds(510, 530, 400, 400); 
           shootCountL.setFont(new Font("segoe print" , Font.BOLD ,60));
           
           targetShootsL.setBounds(510, 610, 400,400); 
           targetShootsL.setFont(new Font("segoe print" , Font.BOLD ,60));
            
           totalPointR.setBounds(1340,460, 400, 400); 
           totalPointR.setFont(new Font("segoe print" , Font.BOLD ,60));
           
            shootCountR.setBounds(1340, 540, 400, 400); 
            shootCountR.setFont(new Font("segoe print" , Font.BOLD ,60));
         
           targetShootsR.setBounds(1340, 620, 400, 400); 
           targetShootsR.setFont(new Font("segoe print" , Font.BOLD ,60));
    
           totalPointTextLeft.setBounds(160, 400, 500, 500);
           totalPointTextLeft.setFont(new Font("segoe print" , Font.BOLD ,45));
           
              shootCountTextLeft.setBounds(160, 530, 400, 400);
              shootCountTextLeft.setFont(new Font("segoe print" , Font.BOLD ,45));
           
              targetShootsTextLeft.setBounds(160, 608, 400, 400);
              targetShootsTextLeft.setFont(new Font("segoe print" , Font.BOLD ,45));
           
              totalPointTextRight.setBounds(990, 460, 400, 400);
              totalPointTextRight.setFont(new Font("segoe print" , Font.BOLD ,45));
           
              shootCountTextRight.setBounds(990, 538, 400, 400);
              shootCountTextRight.setFont(new Font("segoe print" , Font.BOLD ,45));
           
              targetShootsTextRight.setBounds(990, 622, 400, 400);
              targetShootsTextRight.setFont(new Font("segoe print" , Font.BOLD ,45));
           
             player_1.setBounds(315, -150, 400, 400);
             player_1.setFont(new Font("segoe print" , Font.BOLD ,45));
           
             player_2.setBounds(1136, -150, 400, 400);
             player_2.setFont(new Font("segoe print" , Font.BOLD ,45));
                       
            // rematch button 
             rematchButton.setSize(200, 100);
             rematchButton.setFocusable(false);
             rematchButton.setLocation(700,810);
             rematchButton.setFont(new Font("segoe print" , Font.BOLD  , 26));          
             rematchButton.addActionListener(this);
    
    // add methods 
    winnerFrame.add(rematchButton);
    
    winnerFrame.add(player_1);
    winnerFrame.add(player_2);
    
    winnerFrame.add(winner1);
    winnerFrame.add(winner2);
    
    winnerFrame.add(crown);
    
    winnerFrame.add(winnerArrow);
    winnerFrame.add(winnerLabel);
    
    winnerFrame.add(totalPointL);
    winnerFrame.add(shootCountL);
    winnerFrame.add(targetShootsL);
    winnerFrame.add(totalPointR);
    winnerFrame.add(shootCountR);
    winnerFrame.add(targetShootsR);
    
    winnerFrame.add(totalPointTextLeft);
    winnerFrame.add(shootCountTextLeft);
    winnerFrame.add(targetShootsTextLeft);
     winnerFrame.add(totalPointTextRight);
    winnerFrame.add(shootCountTextRight);
    winnerFrame.add(targetShootsTextRight);

    // set the true visible ;
    winnerFrame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rematchButton){
                   totalPoint_L  = 3400;
                   shootCount_L = 0 ;
                   targetShoots_L = 0 ;
                   totalPoint_R  = 3400;
                   shootCount_R = 0 ;
                   targetShoots_R = 0; 
                   winnerFrame.dispose();
                  new Jframe();
               }   
        }
 }

