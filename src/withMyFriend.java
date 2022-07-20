
package project_midterm;


import javax.swing.* ;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Random;


public class withMyFriend extends JComponent implements MouseListener  , MouseMotionListener , MouseWheelListener , ActionListener{
    // define and initialize the points variables ;
    public static int totalPoint_L  = 3400;
    public static int shootCount_L = 0 ;
    public static int targetShoots_L = 0 ;
    public static int totalPoint_R  = 3400;
    public static int shootCount_R = 0 ;
    public static int targetShoots_R = 0; 
    
     JFrame gameFrame = new JFrame("Sea Battle");
      
     // point labels ;
     JLabel totalPointL = new JLabel(""+totalPoint_L);
     JLabel shootCountL = new JLabel(""+shootCount_L);
     JLabel targetShootsL = new JLabel(""+targetShoots_L);
     JLabel totalPointR = new JLabel(""+totalPoint_R);
     JLabel shootCountR = new JLabel(""+shootCount_R);
     JLabel targetShootsR = new JLabel(""+targetShoots_R);
     JButton showPointButton_L = new JButton ("Show");
     JButton showPointButton_R = new JButton ("Show");
     
    // upper and downer Grids lebel ;
    JLabel leftDownerGridLabel = new JLabel();
    JLabel rightDownerGridLabel = new JLabel();
    JLabel leftUpperGridLabel = new JLabel();
    JLabel rightUpperGridLabel = new JLabel();

    
     // paint grid with painting methods;
    //   MyCanvas canvas = new MyCanvas();
    
    //  downer boat label ;
    JLabel leftBoatLabel1 = new JLabel();
    JLabel leftBoatLabel2 = new JLabel();
    JLabel leftBoatLabel3 = new JLabel();
    
    JLabel rightBoatLabel1 = new JLabel();
    JLabel rightBoatLabel2 = new JLabel();
    JLabel rightBoatLabel3 = new JLabel();
    
    // upper boat Label ;
    JLabel leftUppBoatLabel1 = new JLabel();
    JLabel leftUppBoatLabel2 = new JLabel();
    JLabel leftUppBoatLabel3 = new JLabel();
    
    JLabel rightUppBoatLabel1 = new JLabel();
    JLabel rightUppBoatLabel2 = new JLabel();
    JLabel rightUppBoatLabel3 = new JLabel();
    
    //downer destroyer label ;
    JLabel leftDestroyerLabel1 = new JLabel();
    JLabel leftDestroyerLabel2 = new JLabel();
    
    JLabel rightDestroyerLabel1 = new JLabel();
    JLabel rightDestroyerLabel2 = new JLabel();
    
     //upper destroyer label ;
    JLabel leftUppDestroyerLabel1 = new JLabel();
    JLabel leftUppDestroyerLabel2 = new JLabel();
    
    JLabel rightUppDestroyerLabel1 = new JLabel();
    JLabel rightUppDestroyerLabel2 = new JLabel();
    
    // downer little ship label ;
    JLabel leftLittleShipLabel1 = new JLabel();
    JLabel leftLittleShipLabel2 = new JLabel(); 
    
    JLabel rightLittleShipLabel1 = new JLabel();
    JLabel rightLittleShipLabel2 = new JLabel(); 
    
    //upper little ship label ;
    JLabel leftUppLittleShipLabel1 = new JLabel();
    JLabel leftUppLittleShipLabel2 = new JLabel(); 
    
    JLabel rightUppLittleShipLabel1 = new JLabel();
    JLabel rightUppLittleShipLabel2 = new JLabel();
    
    // downer ship label ;
    JLabel leftShipLabel = new JLabel();
    
    JLabel rightShipLabel = new JLabel();
    
     //upper ship label;
    JLabel leftUppShipLabel = new JLabel();
    
    JLabel rightUppShipLabel = new JLabel(); 
    
    // point label;
    JLabel squareLeftPointLabel = new JLabel();
    JLabel squareRightPointLabel = new JLabel();
    
    //redy button label ;
    JButton leftReadyButton = new JButton("Ready");
    JButton rightReadyButton = new JButton("Ready");
    
    // command label ;
    JLabel commandLabel = new JLabel();
    
    // attack labels ;
    JLabel [] greenPoint = new JLabel[42];
    JLabel [] redPoint = new JLabel[183];
    
    // fix buttons label ;
    JButton leftFixButton = new JButton("FIX");
    JButton rightFixButton = new JButton("FIX");
    
    //rematch label ;
    JButton rematchButton = new JButton("Rematch");
    
    // anchor label ;
     JLabel anchorLabel = new JLabel();
     
     // hide square label ;( for divide ships into a cells )
      JLabel square[] = new JLabel[42];
      JLabel redSquare[] = new JLabel[183];
     

    public withMyFriend (){
       
     // JFrame ;   
    gameFrame.setSize(1700,1000); // set size of framw ;
    gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gameFrame.setResizable(false);
    //set icon for frame ;
    ImageIcon icon_image = new ImageIcon("icon.png");
    gameFrame.setIconImage(icon_image.getImage());
    gameFrame.getContentPane().setBackground(new Color(233 , 233 , 252));
    gameFrame.setLocationRelativeTo(null);// method to display frame in center
    gameFrame.setLayout(null);
    gameFrame.addMouseListener(this);
    gameFrame.addMouseMotionListener(this);
    gameFrame.addMouseWheelListener(this);
    

        // left grid label ;
      ImageIcon leftGrid = new ImageIcon("Grid.png");
      leftDownerGridLabel.setIcon(leftGrid);
      leftDownerGridLabel.setBounds(0,182,764 ,752);
 
         // right grid label ;      
       ImageIcon rightGrid = new ImageIcon("Grid.png");
       rightDownerGridLabel.setIcon(rightGrid);
       rightDownerGridLabel.setBounds(895, 182, 764, 752);

           // left downer boat label 1 ;
           ImageIcon boat = new ImageIcon("boat.png");
           leftBoatLabel1.setIcon(boat);
           leftBoatLabel1.setBounds(24, 178, 50, 58);           
           leftBoatLabel1.addMouseListener(this);
           leftBoatLabel1.addMouseMotionListener(this);
           leftBoatLabel1.addMouseWheelListener(this);
          
            // left upper boat label 1 ;  
           leftUppBoatLabel1.setIcon(boat);
           leftUppBoatLabel1.addMouseListener(this);
          

           // left downer boat label 2 ;         
           leftBoatLabel2.setIcon(boat);
           leftBoatLabel2.setBounds(73,178 ,50, 58);
           leftBoatLabel2.setIcon(boat);
           leftBoatLabel2.addMouseListener(this);
           leftBoatLabel2.addMouseMotionListener(this);
           leftBoatLabel2.addMouseWheelListener(this);
           
           //left upper boat label 2 ;
           leftUppBoatLabel2.setIcon(boat);
           leftUppBoatLabel2.addMouseListener(this);
           
            // left downer boat label 3 ;          
           leftBoatLabel3.setIcon(boat);
           leftBoatLabel3.setBounds(123, 178, 50, 58 );
           leftBoatLabel3.setIcon(boat);
           leftBoatLabel3.addMouseListener(this);
           leftBoatLabel3.addMouseMotionListener(this);
           leftBoatLabel3.addMouseWheelListener(this);
           
           //left upper boat label 3 ;
           leftUppBoatLabel3.setIcon(boat);
           leftUppBoatLabel3.addMouseListener(this);
          
            // right  donwer boat label 1 ;           
           rightBoatLabel1.setIcon(boat);
           rightBoatLabel1.setBounds(920, 178, 50, 58);
           rightBoatLabel1.setIcon(boat);
           rightBoatLabel1.addMouseListener(this);
           rightBoatLabel1.addMouseMotionListener(this);
           rightBoatLabel1.addMouseWheelListener(this);
           
           //right upper boat label 1 ;
           rightUppBoatLabel3.setIcon(boat);
           rightUppBoatLabel1.addMouseListener(this);
          

            // right downer boat label 2 ;
           rightBoatLabel2.setIcon(boat);
           rightBoatLabel2.setBounds(971, 178, 50, 58);
           rightBoatLabel2.setIcon(boat);
           rightBoatLabel2.addMouseListener(this);
           rightBoatLabel2.addMouseMotionListener(this);
           rightBoatLabel2.addMouseWheelListener(this);
           
           //right upper boat label 2 ;
           rightUppBoatLabel2.setIcon(boat);
           rightUppBoatLabel2.addMouseListener(this);
           
           // right downer boat label 3  ;        
           rightBoatLabel3.setIcon(boat);
           rightBoatLabel3.setBounds(1019, 178, 50, 58 );
           rightBoatLabel3.setIcon(boat);
           rightBoatLabel3.addMouseListener(this);
           rightBoatLabel3.addMouseMotionListener(this);
           rightBoatLabel3.addMouseWheelListener(this);
           
            //right upper boat label 3 ;
           rightUppBoatLabel3.setIcon(boat);
           rightUppBoatLabel3.addMouseListener(this);
                    
           // left downer destroyerLabel1 label 1 ;
           ImageIcon destroyer = new ImageIcon("destroyer.png");
            leftDestroyerLabel1.setIcon(destroyer);
            leftDestroyerLabel1.setBounds(34, 233, 30, 100);
            leftDestroyerLabel1.addMouseListener(this);
            leftDestroyerLabel1.addMouseMotionListener(this);
            leftDestroyerLabel1.addMouseWheelListener(this);
            
           //left upper leftDestroyerLabel1 ;
           leftUppDestroyerLabel1.setIcon(destroyer);
           leftUppDestroyerLabel1.addMouseListener(this);
           
           // left destroyerLabel1 label 2 ;       
           leftDestroyerLabel2.setIcon(destroyer);
           leftDestroyerLabel2.setBounds(83, 233, 30, 100);
           leftDestroyerLabel2.addMouseListener(this);
           leftDestroyerLabel2.addMouseMotionListener(this);
           leftDestroyerLabel2.addMouseWheelListener(this);
           
           //left upper leftDestroyerLabel2 ;
           leftUppDestroyerLabel2.setIcon(destroyer);
           leftUppDestroyerLabel2.addMouseListener(this);
          
           // right  downer destroyerLabel1 label 1 ;
           rightDestroyerLabel1.setIcon(destroyer);
           rightDestroyerLabel1.setBounds(931, 233, 30, 100);
           rightDestroyerLabel1.addMouseListener(this);
           rightDestroyerLabel1.addMouseMotionListener(this);
           rightDestroyerLabel1.addMouseWheelListener(this);
           
           //right upper leftDestroyerLabel1 ;
           rightUppDestroyerLabel1.setIcon(destroyer);
           rightUppDestroyerLabel1.addMouseListener(this);
           
             // right downer destroyerLabel1 label ;         
           rightDestroyerLabel2.setIcon(destroyer);
           rightDestroyerLabel2.setBounds(980, 233, 30, 100);
           rightDestroyerLabel2.addMouseListener(this);
           rightDestroyerLabel2.addMouseMotionListener(this);
           rightDestroyerLabel2.addMouseWheelListener(this);
           
           //right upper leftDestroyerLabel2
           rightUppDestroyerLabel2.setIcon(destroyer);
           rightUppDestroyerLabel2.addMouseListener(this);

           //left downer little ship label 1 ;
           ImageIcon littleShip = new ImageIcon("littleShip.png");
           leftLittleShipLabel1.setIcon(littleShip);
           leftLittleShipLabel1.setBounds(53, 334, 95, 145);
           leftLittleShipLabel1.addMouseListener(this);
           leftLittleShipLabel1.addMouseMotionListener(this);
           leftLittleShipLabel1.addMouseWheelListener(this);
           
           //left upper leftLittleShipLabel1 ;
           leftUppLittleShipLabel1.setIcon(littleShip);
           leftUppLittleShipLabel1.addMouseListener(this);
           
           //left downer little ship label 2 ;
           leftLittleShipLabel2.setIcon(littleShip);
           leftLittleShipLabel2.setBounds(3, 334, littleShip.getIconWidth(), littleShip.getIconHeight());
           leftLittleShipLabel2.addMouseListener(this);
           leftLittleShipLabel2.addMouseMotionListener(this);
           leftLittleShipLabel2.addMouseWheelListener(this);
           
           //left upper leftLittleShipLabel2 ;
           leftUppLittleShipLabel2.setIcon(littleShip);
           leftUppLittleShipLabel2.addMouseListener(this);
          
            //right downer little ship label 1 ;
           rightLittleShipLabel1.setIcon(littleShip);
           rightLittleShipLabel1.setBounds(899, 334, 95, 145);
           rightLittleShipLabel1.addMouseListener(this);
           rightLittleShipLabel1.addMouseMotionListener(this);
           rightLittleShipLabel1.addMouseWheelListener(this);
           
           //right upper leftLittleShipLabel1 ;
           rightUppLittleShipLabel1.setIcon(littleShip);
           rightUppLittleShipLabel1.addMouseListener(this);
           
           //right downer little ship label 2 ;
           rightLittleShipLabel2.setIcon(littleShip);
           rightLittleShipLabel2.setBounds(949, 334, littleShip.getIconWidth(), littleShip.getIconHeight());
           rightLittleShipLabel2.addMouseListener(this);
           rightLittleShipLabel2.addMouseMotionListener(this);
           rightLittleShipLabel2.addMouseWheelListener(this);
           
             //right upper leftLittleShipLabel2 ;
           rightUppLittleShipLabel2.setIcon(littleShip);
           rightUppLittleShipLabel2.addMouseListener(this);
               
           // left  downer ship label ; 
           ImageIcon ship = new ImageIcon("ship.png");
           leftShipLabel.setIcon(ship);
           leftShipLabel.setBounds(123 , 235, 103, 200);
           leftShipLabel.addMouseListener(this);
           leftShipLabel.addMouseMotionListener(this);
           leftShipLabel.addMouseWheelListener(this);
           
            //left upper leftShipLabel ;
           leftUppShipLabel.setIcon(ship);
           leftUppShipLabel.addMouseListener(this);
          
                 // right ship label ;
           rightShipLabel.setIcon(ship);
           rightShipLabel.setBounds(1020 , 235, 103, 200);
           rightShipLabel.addMouseListener(this);
           rightShipLabel.addMouseMotionListener(this);
           rightShipLabel.addMouseWheelListener(this);
           
            //right upper leftShipLabe2 ;
           rightUppShipLabel.setIcon(ship);
           rightUppShipLabel.addMouseListener(this);
          
    
          //  left point label ;
          ImageIcon point1 = new ImageIcon("point1.png");
          squareLeftPointLabel.setIcon(point1);
          squareLeftPointLabel.setBounds(18, -43, 365, 259);
          
           // right point label ; 
          ImageIcon point2 = new ImageIcon("point2.png");
          squareRightPointLabel.setIcon(point2);
          squareRightPointLabel.setBounds(1298,-43, 365, 259);
           
          
          //left ready button 1 ;
          leftReadyButton.setSize(120 , 120);
          leftReadyButton.setFocusable(false);
          leftReadyButton.setLocation(370 , 30);
          leftReadyButton.setFont(new Font("segoe print" , Font.BOLD  , 22));
          leftReadyButton.addActionListener(this);
          leftReadyButton.addMouseListener(this);
          
          // right ready button 2 ;
          rightReadyButton.setSize(120 , 120);
          rightReadyButton.setFocusable(false);
          rightReadyButton.setLocation(1200 , 30);
          rightReadyButton.setFont(new Font("segoe print" , Font.BOLD  , 22));
          rightReadyButton.addActionListener(this);
          rightReadyButton.addMouseListener(this);
          
          // leftFixButton ; 
          leftFixButton.setSize(120, 120);
            leftFixButton.setFocusable(false);
          leftFixButton.setLocation(540 , 30);
          leftFixButton.setFont(new Font("segoe print" , Font.BOLD  , 22));
          leftFixButton.addActionListener(this);
          leftFixButton.addMouseListener(this);
          
           // rightFixButton ; 
          rightFixButton.setSize(120, 120);
            rightFixButton.setFocusable(false);
          rightFixButton.setLocation(1030 , 30);
          rightFixButton.setFont(new Font("segoe print" , Font.BOLD  , 22));
          rightFixButton.addActionListener(this);
          rightFixButton.addMouseListener(this);
          
          // rematch button ;         
          rematchButton.setSize(100, 100);
          rematchButton.setFocusable(false);
          rematchButton.setLocation(790,840);
          rematchButton.setFont(new Font("segoe print" , Font.BOLD  , 14));
          rematchButton.setBackground(Color.cyan);
          rematchButton.addActionListener(this);
          rematchButton.addMouseListener(this);
          
          // show point buttons ; 
          showPointButton_L.setSize(50, 50);
          showPointButton_L.setFocusable(false);
          showPointButton_L.setLocation(250,90);
          showPointButton_L.setFont(new Font("segoe print" , Font.BOLD  , 5));
          showPointButton_L.setBackground(Color.cyan);
          showPointButton_L.addActionListener(this);
          showPointButton_L.addMouseListener(this);
          
          showPointButton_R.setSize(50, 50);
          showPointButton_R.setFocusable(false);
          showPointButton_R.setLocation(1530,90);
          showPointButton_R.setFont(new Font("segoe print" , Font.BOLD  , 4));
          showPointButton_R.setBackground(Color.cyan);
          showPointButton_R.addActionListener(this);
          showPointButton_R.addMouseListener(this);
          
           // command Label ;
           ImageIcon command = new ImageIcon("shipCommand.png");
           commandLabel.setIcon(command);
           commandLabel.setBounds(747 ,2, 200, 200);
           

           // points labels ( L abbreviation for Lef and R abbreviation for Right ) ;
           totalPointL.setBounds(220,18, 100, 100); 
           totalPointL.setFont(new Font("segoe print" , Font.BOLD ,20));

           shootCountL.setBounds(220, 47, 100, 100); 
           shootCountL.setFont(new Font("segoe print" , Font.BOLD ,20));
           
           targetShootsL.setBounds(220, 78, 100, 100); 
           targetShootsL.setFont(new Font("segoe print" , Font.BOLD ,20));
            
           totalPointR.setBounds(1497, 19, 100, 100); 
           totalPointR.setFont(new Font("segoe print" , Font.BOLD ,20));
           
           shootCountR.setBounds(1497, 47, 100, 100); 
           shootCountR.setFont(new Font("segoe print" , Font.BOLD ,20));
           
           targetShootsR.setBounds(1497, 78, 100, 100); 
           targetShootsR.setFont(new Font("segoe print" , Font.BOLD ,20));
         
           
           
          // anchor label ;
         ImageIcon langarImage = new ImageIcon("langar.png");
         anchorLabel.setIcon(langarImage);
         anchorLabel.setBounds(742, 160, langarImage.getIconWidth(), langarImage.getIconHeight());
        
           // creat objects from green point array ;
           for(int i = 0 ; i<greenPoint.length ; i++){
               greenPoint[i] = new JLabel();
           }
            // creat objects from red point array ;
           for(int i = 0 ; i<redPoint.length ; i++){
               redPoint[i] = new JLabel();
           }
           
           // creat object from squares ;
           for(int i = 0 ; i<square.length ; i++){
               square[i] = new JLabel();
           }
           for(int i = 0 ; i<redSquare.length ; i++){
               redSquare[i] = new JLabel();
           }
        
         // add mouse listener in  squares ;
           for(int i = 0 ; i<square.length ; i++){
               square[i].addMouseListener(this);
           }
           for(int i = 0 ; i<redSquare.length ; i++){
               redSquare[i].addMouseListener(this);
           }
           
        // add methods ;
        
        
        for(int i = 0 ; i<greenPoint.length ; i++){
        gameFrame.add(greenPoint[i]);
        }
        for(int i = 0 ; i<redPoint.length ; i++){
        gameFrame.add(redPoint[i]);
        }
        for(int i = 0 ; i<square.length ; i++){
            gameFrame.add(square[i]);
        }
        for(int i = 0 ; i<redSquare.length ; i++){
            gameFrame.add(redSquare[i]);
        }
        
         gameFrame.add(showPointButton_R);
         gameFrame.add(showPointButton_L);
         
         gameFrame.add(totalPointL);         
         gameFrame.add(shootCountL);
         gameFrame.add(targetShootsL);
         gameFrame.add(totalPointR);
         gameFrame.add(shootCountR);
         gameFrame.add(targetShootsR);
         
         gameFrame.add(anchorLabel);
         
         gameFrame.add(rightUpperGridLabel);
         gameFrame.add(leftUpperGridLabel);
        
        
        gameFrame.add(leftUppBoatLabel1);
        gameFrame.add(leftUppBoatLabel2);
        gameFrame.add(leftUppBoatLabel3);
        
        gameFrame.add(leftUppDestroyerLabel1 );
        gameFrame.add(leftUppDestroyerLabel2 );
        
        gameFrame.add(leftUppLittleShipLabel1 );
        gameFrame.add(leftUppLittleShipLabel2 );
        
        gameFrame.add(leftUppShipLabel);
      
        gameFrame.add(rightUppBoatLabel1);
        gameFrame.add(rightUppBoatLabel2);
        gameFrame.add(rightUppBoatLabel3);
        
        gameFrame.add(rightUppDestroyerLabel1 );
        gameFrame.add(rightUppDestroyerLabel2 );
        
        gameFrame.add(rightUppLittleShipLabel1 );
        gameFrame.add(rightUppLittleShipLabel2 );
        
        gameFrame.add(rightUppShipLabel);
        
        // downers
        
        gameFrame.add(leftBoatLabel1);
        gameFrame.add(leftBoatLabel2);
        gameFrame.add(leftBoatLabel3);
        
        gameFrame.add(leftDestroyerLabel1 );
        gameFrame.add(leftDestroyerLabel2 );
        gameFrame.add(leftLittleShipLabel1 );
        gameFrame.add(leftLittleShipLabel2 );
        
        gameFrame.add(leftShipLabel);
        
        gameFrame.add(squareLeftPointLabel);
        gameFrame.add(squareRightPointLabel);
        
        gameFrame.add(commandLabel);
        
        gameFrame.add(rightBoatLabel1);
        gameFrame.add(rightBoatLabel2);
        gameFrame.add(rightBoatLabel3);
        
        gameFrame.add(rightDestroyerLabel1);
        gameFrame.add(rightDestroyerLabel2);
        
        gameFrame.add(rightLittleShipLabel1);
        gameFrame.add(rightLittleShipLabel2);
        
        gameFrame.add(rightShipLabel);

        gameFrame.setVisible(true);
        
        gameFrame.add(rightDownerGridLabel);
        gameFrame.add(leftDownerGridLabel);
        
        gameFrame.add(rightReadyButton);
        gameFrame.add(leftReadyButton);
        
        gameFrame.add(leftFixButton);
        gameFrame.add(rightFixButton);
        
        gameFrame.add(rematchButton);

        //gameFrame.add(canvas);
             
        
        // ends of constructor ;
    }

    // override methods ;
    
    public void paintComponent(Graphics g){
      
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
     

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // move left and right , left boat 1 ;
        if(e.getSource() == leftBoatLabel1){
         int currentX = leftBoatLabel1.getX();
         int currentY = leftBoatLabel1.getY();
         
         if(e.getButton()== 1 &&leftBoatLabel1.getX()>30 ){
             currentX-=49;        
         }
          if (e.getButton()== 3&&leftBoatLabel1.getX()<700 ){
                  currentX+=49;
         }
          leftBoatLabel1.setBounds(currentX , currentY, 50, 58);
          
                  
                  
      }  
        // move left and right , left boat 2 ;
         if(e.getSource() == leftBoatLabel2){
         int currentX = leftBoatLabel2.getX();
         int currentY = leftBoatLabel2.getY();
         
         if(e.getButton()== 1&&leftBoatLabel2.getX()>30 ){
             currentX-=49;        
         }
          if (e.getButton()== 3&&leftBoatLabel2.getX()<700){
                  currentX+=49;
         }
          leftBoatLabel2.setBounds(currentX , currentY, 50, 58);
             
                  
      }  
        // move left and right  , left boat 3 ;
         if(e.getSource() == leftBoatLabel3){
         int currentX = leftBoatLabel3.getX();
         int currentY = leftBoatLabel3.getY();
         
         if(e.getButton()== 1&&leftBoatLabel3.getX()>30 ){
             currentX-=49;        
         }
          if (e.getButton()== 3&&leftBoatLabel3.getX()<700){
                  currentX+=49;
         }
          leftBoatLabel3.setBounds(currentX , currentY, 50, 58);
                       
      }  
        
        // move left and right , left destroyer Label 1 ;
         if(e.getSource() == leftDestroyerLabel1){
         int currentX = leftDestroyerLabel1.getX();
         int currentY = leftDestroyerLabel1.getY();
         
         if(e.getButton()== 1&&leftDestroyerLabel1.getX()>40){
             currentX-=49;        
         }
          if (e.getButton()== 3&&leftDestroyerLabel1.getX()<700){
                  currentX+=49;
         }
          leftDestroyerLabel1.setBounds(currentX , currentY, 30, 100);
          
        }
           // move left and right , left destroyer Label 2 ;
         if(e.getSource() == leftDestroyerLabel2){
         int currentX = leftDestroyerLabel2.getX();
         int currentY = leftDestroyerLabel2.getY();
         
         if(e.getButton()== 1&&leftDestroyerLabel2.getX()>40){
             currentX-=49;        
         }
          if (e.getButton()== 3&&leftDestroyerLabel2.getX()<700){
                  currentX+=49;
         }
          leftDestroyerLabel2.setBounds(currentX , currentY, 30, 100);
          
        }
        
           // move left and right , left little Ship Label 3 ;
        if(e.getSource() == leftLittleShipLabel1){
         int currentX = leftLittleShipLabel1.getX();
         int currentY = leftLittleShipLabel1.getY();
         
         if(e.getButton()== 1&&leftLittleShipLabel1.getX()>30){
             currentX-=49;        
         }
          if (e.getButton()== 3&&leftLittleShipLabel1.getX()<650){
                  currentX+=49;
         }
          leftLittleShipLabel1.setBounds(currentX , currentY, 95, 145);
                       
      } 
           // move left and right  , left little Ship Label 2 ;
        if(e.getSource() == leftLittleShipLabel2){
         int currentX = leftLittleShipLabel2.getX();
         int currentY = leftLittleShipLabel2.getY();
         
         if(e.getButton()== 1&&leftLittleShipLabel2.getX()>30){
             currentX-=49;        
         }
          if (e.getButton()== 3&&leftLittleShipLabel2.getX()<650){
                  currentX+=49;
         }
          leftLittleShipLabel2.setBounds(currentX , currentY, 95, 145);
                       
      } 
        
              // move left and right , left  Ship Label ;
        if(e.getSource() == leftShipLabel){
         int currentX = leftShipLabel.getX();
         int currentY = leftShipLabel.getY();
         
         if(e.getButton()== 1&&leftShipLabel.getX()>30){
             currentX-=49;        
         }
          if (e.getButton()== 3&&leftShipLabel.getX()<650){
                  currentX+=49;
         }
          leftShipLabel.setBounds(currentX , currentY, 103, 200);
                       
      } 
            // move left and right , right boat 1 ;
         if(e.getSource() == rightBoatLabel1){
         int currentX = rightBoatLabel1.getX();
         int currentY = rightBoatLabel1.getY();
         
         if(e.getButton()== 1&&rightBoatLabel1.getX()>950){
             currentX-=49;        
         }
          if (e.getButton()== 3&&rightBoatLabel1.getX()<1600){
                  currentX+=49;
         }
          rightBoatLabel1.setBounds(currentX , currentY, 50, 58);
        }
             // move left and right, right boat 2 ;
         if(e.getSource() == rightBoatLabel2){
         int currentX = rightBoatLabel2.getX();
         int currentY = rightBoatLabel2.getY();
         
         if(e.getButton()== 1&&rightBoatLabel2.getX()>950){
             currentX-=49;        
         }
          if (e.getButton()== 3&&rightBoatLabel2.getX()<1600){
                  currentX+=49;
         }
          rightBoatLabel2.setBounds(currentX , currentY, 50, 58);
        }
         
           // move left and right , right boat 3 ;
         if(e.getSource() == rightBoatLabel3){
         int currentX = rightBoatLabel3.getX();
         int currentY = rightBoatLabel3.getY();
         
         if(e.getButton()== 1&&rightBoatLabel3.getX()>950){
             currentX-=49;        
         }
          if (e.getButton()== 3&&rightBoatLabel3.getX()<1600){
                  currentX+=49;
         }
          rightBoatLabel3.setBounds(currentX , currentY, 50, 58);
        }
        
            // move left and right  , right Destroyer Label 1 ;
         if(e.getSource() == rightDestroyerLabel1){
         int currentX = rightDestroyerLabel1.getX();
         int currentY = rightDestroyerLabel1.getY();
         
         if(e.getButton()== 1&&rightDestroyerLabel1.getX()>950){
             currentX-=49;        
         }
          if (e.getButton()== 3&&rightDestroyerLabel1.getX()<1600){
                  currentX+=49;
         }
          rightDestroyerLabel1.setBounds(currentX , currentY, 30, 100);
        }
        
            // move left and right , right destroyer 2 ;
         if(e.getSource() == rightDestroyerLabel2){
         int currentX = rightDestroyerLabel2.getX();
         int currentY = rightDestroyerLabel2.getY();
         
         if(e.getButton()== 1&&rightDestroyerLabel2.getX()>950){
             currentX-=49;        
         }
          if (e.getButton()== 3&&rightDestroyerLabel2.getX()<1600){
                  currentX+=49;
         }
          rightDestroyerLabel2.setBounds(currentX , currentY, 30, 100);
        }
        
            // move left and right  , right little ship ;
         if(e.getSource() == rightLittleShipLabel1){
         int currentX = rightLittleShipLabel1.getX();
         int currentY = rightLittleShipLabel1.getY();
         
         if(e.getButton()== 1&&rightLittleShipLabel1.getX()>900){
             currentX-=49;        
         }
          if (e.getButton()== 3&&rightLittleShipLabel1.getX()<1550){
                  currentX+=49;
         }
          rightLittleShipLabel1.setBounds(currentX , currentY, 95, 145);
        }
        
            // move left and right boat 1 ;
         if(e.getSource() == rightLittleShipLabel2){
         int currentX = rightLittleShipLabel2.getX();
         int currentY = rightLittleShipLabel2.getY();
         
         if(e.getButton()== 1&&rightLittleShipLabel2.getX()>900){
             currentX-=49;        
         }
          if (e.getButton()== 3&&rightLittleShipLabel2.getX()<1550){
                  currentX+=49;
         }
          rightLittleShipLabel2.setBounds(currentX , currentY,95, 145);
        }
        
            // move left and right , right ship ;
         if(e.getSource() == rightShipLabel){
         int currentX = rightShipLabel.getX();
         int currentY = rightShipLabel.getY();
         
         if(e.getButton()== 1&&rightShipLabel.getX()>950){
             currentX-=49;        
         }
          if (e.getButton()== 3&&rightShipLabel.getX()<1550){
                  currentX+=49;
         }
          rightShipLabel.setBounds(currentX , currentY, 103, 200);
        }
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // update points ;
       if(e.getSource()!=rematchButton && e.getX()<755&&e.getX()>55 && e.getY()>226 && e.getY()<965){        
             
           totalPoint_L -=20;
    
           shootCount_L++;     
       }
               
       
       else if ( e.getSource()!=rematchButton &&e.getX()>950&& e.getX()<1660&& e.getY()>226 && e.getY()<965){
           totalPoint_R -=20;
           shootCount_R++; 
       }
       
        
       
    for(int i = 0 ; i<greenPoint.length ; i++){
           ImageIcon greenPoint1 = new ImageIcon("greenPoint.png"); 
                    
            greenPoint[i].setIcon(greenPoint1);
            
      if(e.getSource() == square[i]){
               greenPoint[i].setBounds(square[i].getX()-54 , square[i].getY()-45 ,greenPoint1.getIconWidth() , greenPoint1.getIconHeight() );
     
               if(greenPoint[i].getX()<754){
                   totalPoint_L -=20;
                   totalPoint_L +=25;
                   targetShoots_L++ ;
                   shootCount_L++;
               }
              else if(greenPoint[i].getX()>820){
                  totalPoint_R -=20;
                   totalPoint_R +=25;
                   targetShoots_R++ ;
                   shootCount_R++;
               }
      }
         
//     for(int j = 0 ; j<redPoint.length ; j++){
//          ImageIcon redPoint1 = new ImageIcon("redPoint.png"); 
//         redPoint[j].setIcon(redPoint1);
//        
//         if(e.getButton()==1){
//             redPoint[j].setBounds(e.getX() , e.getY() , redPoint1.getIconWidth(), redPoint1.getIconHeight());
//         }
//     }
  
     
         }
           // logic of select Winner ;
           if(targetShoots_L == 21 || totalPoint_L  ==0 ){
               gameFrame.dispose();
              Winner2 winner = new Winner2();
               
           }
           else if(targetShoots_R == 21 || totalPoint_R  ==0 ){
               gameFrame.dispose();
              Winner1 winner = new Winner1();
           }
    }
      
//            if(e.getButton()==1){     
//            greenPoint[0].setBounds(e.getXOnScreen()-190, e.getYOnScreen()-110, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            
//            }
//          } 
//           else if(e.getSource() == leftUppBoatLabel2){
//            if(e.getButton()==1){     
//            greenPoint[1].setBounds(e.getXOnScreen()-190, e.getYOnScreen()-110, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//           else if(e.getSource() == leftUppBoatLabel3){
//            if(e.getButton()==1){     
//            greenPoint[2].setBounds(e.getXOnScreen()-190, e.getYOnScreen()-110, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//           else if(e.getSource() == rightUppBoatLabel1){
//            if(e.getButton()==1){     
//            greenPoint[3].setBounds(e.getXOnScreen()-190, e.getYOnScreen()-110, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//           else if(e.getSource() == rightUppBoatLabel2){
//            if(e.getButton()==1){     
//            greenPoint[4].setBounds(e.getXOnScreen()-190, e.getYOnScreen()-110, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//           else if(e.getSource() == rightUppBoatLabel3){
//            if(e.getButton()==1){     
//            greenPoint[5].setBounds(e.getXOnScreen()-190, e.getYOnScreen()-110, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//            else if(e.getSource() == leftUppDestroyerLabel1){
//            if(e.getButton()==1){     
//            greenPoint[6].setBounds(e.getXOnScreen()-190, e.getYOnScreen()-110, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//           
//            if(e.getSource() == leftUppDestroyerLabel1){
//            if(e.getButton()==1){     
//            greenPoint[7].setBounds(e.getXOnScreen()-190, e.getYOnScreen()-110, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//             else if(e.getSource() == leftUppDestroyerLabel2){
//            if(e.getButton()==1){     
//            greenPoint[8].setBounds(leftDestroyerLabel2.getX()-57, leftDestroyerLabel2.getY()-35, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//            if(e.getSource() == leftUppDestroyerLabel2){
//            if(e.getButton()==1){     
//            greenPoint[9].setBounds(leftDestroyerLabel2.getX()-57, leftDestroyerLabel2.getY()+20, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//             else if(e.getSource() == rightUppDestroyerLabel1){
//            if(e.getButton()==1){     
//            greenPoint[10].setBounds(rightDestroyerLabel1.getX()-57, rightDestroyerLabel1.getY()-35, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//            if(e.getSource() == rightUppDestroyerLabel1){
//            if(e.getButton()==1){     
//            greenPoint[11].setBounds(rightDestroyerLabel1.getX()-57, rightDestroyerLabel1.getY()+20, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//             else if(e.getSource() == rightUppDestroyerLabel2){
//            if(e.getButton()==1){     
//            greenPoint[12].setBounds(rightDestroyerLabel2.getX()-57, rightDestroyerLabel2.getY()-35, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//            if(e.getSource() == rightUppDestroyerLabel2){
//            if(e.getButton()==1){     
//            greenPoint[13].setBounds(rightDestroyerLabel2.getX()-57,rightDestroyerLabel2.getY()+20, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//            else if(e.getSource() == leftUppLittleShipLabel1){
//            if(e.getButton()==1){     
//            greenPoint[14].setBounds(leftLittleShipLabel1.getX()-24, leftLittleShipLabel1.getY()-35, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//            if(e.getSource() == leftUppLittleShipLabel1){
//            if(e.getButton()==1){     
//            greenPoint[15].setBounds(leftLittleShipLabel1.getX()-24, leftLittleShipLabel1.getY()+10, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//            if(e.getSource() == leftUppLittleShipLabel1){
//            if(e.getButton()==1){     
//           greenPoint[16].setBounds(leftLittleShipLabel1.getX()-24, leftLittleShipLabel1.getY()+55, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//             else if(e.getSource() == leftUppLittleShipLabel2){
//            if(e.getButton()==1){     
//            greenPoint[17].setBounds(leftLittleShipLabel2.getX()-57, leftLittleShipLabel2.getY()-35, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//            if(e.getSource() == leftUppLittleShipLabel2){
//            if(e.getButton()==1){     
//            greenPoint[18].setBounds(leftLittleShipLabel2.getX()-57, leftLittleShipLabel2.getY()+10, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//             if(e.getButton()==1){     
//            greenPoint[19].setBounds(leftLittleShipLabel2.getX()-57, leftLittleShipLabel2.getY()+55, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//             else if(e.getSource() == rightUppDestroyerLabel1){
//            if(e.getButton()==1){     
//            greenPoint[10].setBounds(rightDestroyerLabel1.getX()-57, rightDestroyerLabel1.getY()-35, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//            if(e.getSource() == rightUppDestroyerLabel1){
//            if(e.getButton()==1){     
//            greenPoint[11].setBounds(rightDestroyerLabel1.getX()-57, rightDestroyerLabel1.getY()+20, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//             else if(e.getSource() == rightUppDestroyerLabel2){
//            if(e.getButton()==1){     
//            greenPoint[12].setBounds(rightDestroyerLabel2.getX()-57, rightDestroyerLabel2.getY()-35, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
//            if(e.getSource() == rightUppDestroyerLabel2){
//            if(e.getButton()==1){     
//            greenPoint[13].setBounds(rightDestroyerLabel2.getX()-57,rightDestroyerLabel2.getY()+20, greenPoint1.getIconWidth(), greenPoint1.getIconHeight());
//            }
//          }
      
    
            
           
         
      
      
      
             
    
    @Override
    public void mouseEntered(MouseEvent e) {

    }
 
    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
      
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        
        // moved up and down , left boat1 ;
        if(e.getSource()== leftBoatLabel1){
         int currentX = leftBoatLabel1.getX();
         int currentY = leftBoatLabel1.getY();
         if(e.getWheelRotation()>0 && leftBoatLabel1.getY()<870){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0 && leftBoatLabel1.getY()>190 ){
              currentY-=50;
         }
           leftBoatLabel1.setBounds(currentX , currentY, 50, 58);
          
        }
         
         // moved up and down , left boat2 ;
        if(e.getSource()== leftBoatLabel2){
         int currentX = leftBoatLabel2.getX();
         int currentY = leftBoatLabel2.getY();
         if(e.getWheelRotation()>0&& leftBoatLabel2.getY()<870){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& leftBoatLabel2.getY()>190){
              currentY-=50;
         }
           leftBoatLabel2.setBounds(currentX , currentY, 50, 58);
        }
         // moved up and down , left boat3 ;
        if(e.getSource()== leftBoatLabel3){
         int currentX = leftBoatLabel3.getX();
         int currentY = leftBoatLabel3.getY();
         if(e.getWheelRotation()>0&& leftBoatLabel3.getY()<870){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0 && leftBoatLabel3.getY()>190){
              currentY-=50;
         }
           leftBoatLabel3.setBounds(currentX , currentY, 50, 58);
        }
        
         // moved up and down , left destroyer Label 1 ;
        if(e.getSource()== leftDestroyerLabel1){
         int currentX = leftDestroyerLabel1.getX();
         int currentY = leftDestroyerLabel1.getY();
         if(e.getWheelRotation()>0&& leftDestroyerLabel1.getY()<800){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& leftDestroyerLabel1.getY()>190){
              currentY-=50;
         }
           leftDestroyerLabel1.setBounds(currentX , currentY, 30, 100);
        }
        
         // moved up and down , left destroyer Label 2 ;
        if(e.getSource()== leftDestroyerLabel2){
         int currentX = leftDestroyerLabel2.getX();
         int currentY = leftDestroyerLabel2.getY();
         if(e.getWheelRotation()>0&& leftDestroyerLabel2.getY()<800){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& leftDestroyerLabel2.getY()>190){
              currentY-=50;
         }
           leftDestroyerLabel2.setBounds(currentX , currentY, 30, 100);
        }
        
        // moved up and down   , left little Ship Label 1 ;
        if(e.getSource()== leftLittleShipLabel1){
         int currentX = leftLittleShipLabel1.getX();
         int currentY = leftLittleShipLabel1.getY();
         if(e.getWheelRotation()>0&& leftLittleShipLabel1.getY()<750){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& leftLittleShipLabel1.getY()>190){
              currentY-=50;
         }
           leftLittleShipLabel1.setBounds(currentX , currentY, 95, 145);
        }
        // moved up and down , left little Ship Label 2 ;
        if(e.getSource()== leftLittleShipLabel2){
         int currentX = leftLittleShipLabel2.getX();
         int currentY = leftLittleShipLabel2.getY();
         if(e.getWheelRotation()>0&& leftLittleShipLabel2.getY()<750){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& leftLittleShipLabel2.getY()>190){
              currentY-=50;
         }
           leftLittleShipLabel2.setBounds(currentX , currentY, 95, 145);
        }
        
        // moved up and down , left Ship Label ;
        if(e.getSource()== leftShipLabel){
         int currentX = leftShipLabel.getX();
         int currentY = leftShipLabel.getY();
         if(e.getWheelRotation()>0&& leftShipLabel.getY()<700){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& leftShipLabel.getY()>190){
              currentY-=50;
         }
           leftShipLabel.setBounds(currentX , currentY, 103, 200);
        }
        
         // moved up and down , rught boat1 ;
        if(e.getSource()== rightBoatLabel1){
         int currentX = rightBoatLabel1.getX();
         int currentY = rightBoatLabel1.getY();
         if(e.getWheelRotation()>0&& rightBoatLabel1.getY()<870){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& rightBoatLabel1.getY()>190){
              currentY-=50;
         }
           rightBoatLabel1.setBounds(currentX , currentY, 50, 58);
          
        }
         
         // moved up and down , right boat2 ;
        if(e.getSource()== rightBoatLabel2){
         int currentX = rightBoatLabel2.getX();
         int currentY = rightBoatLabel2.getY();
         if(e.getWheelRotation()>0&& rightBoatLabel2.getY()<870){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& rightBoatLabel2.getY()>190){
              currentY-=50;
         }
           rightBoatLabel2.setBounds(currentX , currentY, 50, 58);
        }
         // moved up and down , right boat3 ;
        if(e.getSource()== rightBoatLabel3){
         int currentX = rightBoatLabel3.getX();
         int currentY = rightBoatLabel3.getY();
         if(e.getWheelRotation()>0&& rightBoatLabel3.getY()<870){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& rightBoatLabel3.getY()>190){
              currentY-=50;
         }
           rightBoatLabel3.setBounds(currentX , currentY, 50, 58);
        }
        
          // moved up and down , right destroyer Label 1 ;
        if(e.getSource()== rightDestroyerLabel1){
         int currentX = rightDestroyerLabel1.getX();
         int currentY = rightDestroyerLabel1.getY();
         if(e.getWheelRotation()>0&& rightDestroyerLabel1.getY()<800){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& rightDestroyerLabel1.getY()>190){
              currentY-=50;
         }
           rightDestroyerLabel1.setBounds(currentX , currentY, 30, 100);
        }
        
         // moved up and down , right destroyer Label 2 ;
        if(e.getSource()== rightDestroyerLabel2){
         int currentX = rightDestroyerLabel2.getX();
         int currentY = rightDestroyerLabel2.getY();
         if(e.getWheelRotation()>0&& rightDestroyerLabel2.getY()<800){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& rightDestroyerLabel2.getY()>190){
              currentY-=50;
         }
           rightDestroyerLabel2.setBounds(currentX , currentY, 30, 100);
        }
        
        
        // moved up and down   , right little Ship Label 1 ;
        if(e.getSource()== rightLittleShipLabel1){
         int currentX = rightLittleShipLabel1.getX();
         int currentY = rightLittleShipLabel1.getY();
         if(e.getWheelRotation()>0&& rightLittleShipLabel1.getY()<750){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& rightLittleShipLabel1.getY()>190){
              currentY-=50;
         }
           rightLittleShipLabel1.setBounds(currentX , currentY, 95, 145);
        }
        // moved up and down , right little Ship Label 2 ;
        if(e.getSource()== rightLittleShipLabel2){
         int currentX = rightLittleShipLabel2.getX();
         int currentY = rightLittleShipLabel2.getY();
         if(e.getWheelRotation()>0&& rightLittleShipLabel2.getY()<750){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& rightLittleShipLabel2.getY()>190){
              currentY-=50;
         }
           rightLittleShipLabel2.setBounds(currentX , currentY, 95, 145);
        }
        
        // moved up and down , right Ship Label ;
        if(e.getSource()== rightShipLabel){
         int currentX = rightShipLabel.getX();
         int currentY = rightShipLabel.getY();
         if(e.getWheelRotation()>0&& rightShipLabel.getY()<700){
             currentY+=50;
         }
         else if(e.getWheelRotation()<0&& rightShipLabel.getY()>190){
              currentY-=50;
         }
           rightShipLabel.setBounds(currentX , currentY, 103, 200);
        }
        
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == leftReadyButton){
           
          //  show left Upper Grid Labe ;            
      ImageIcon leftUpperGrid = new ImageIcon("Grid.png");
      leftUpperGridLabel.setIcon(leftUpperGrid);
      leftUpperGridLabel.setBounds(0,182,764 ,752);
      leftReadyButton.setEnabled(false);
        }
        
        else if(e.getSource() == rightReadyButton){
            
       // right Upper Grid Label ;         
      ImageIcon righttUpperGrid = new ImageIcon("Grid.png");
      rightUpperGridLabel.setIcon(righttUpperGrid);
      rightUpperGridLabel.setBounds(895, 182, 764, 752);
      rightReadyButton.setEnabled(false);     
        }
        
        ImageIcon squareImage = new ImageIcon("square.png");
            for(int i = 0 ; i<square.length ; i++){
                square[i].setIcon(squareImage);
            }
            
            ImageIcon redSquareImage = new ImageIcon("redSquare.png");
            for(int i = 0 ; i<redSquare.length ; i++){
               redSquare[i].setIcon(redSquareImage);
            }
            
        if(e.getSource() == leftFixButton){
           
          
            
            square[0].setBounds(leftBoatLabel1.getX()+8, leftBoatLabel1.getY()+11, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[1].setBounds(leftBoatLabel2.getX()+8, leftBoatLabel2.getY()+11, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[2].setBounds(leftBoatLabel3.getX()+8, leftBoatLabel3.getY()+11, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[3].setBounds(leftDestroyerLabel1.getX()-3, leftDestroyerLabel1.getY()+9, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[4].setBounds(leftDestroyerLabel1.getX()-3 , leftDestroyerLabel1.getY()+60, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[5].setBounds(leftDestroyerLabel2.getX()-1, leftDestroyerLabel1.getY()+9, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[6].setBounds(leftDestroyerLabel2.getX()-1 , leftDestroyerLabel1.getY()+60, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[7].setBounds(leftLittleShipLabel1.getX()+27 , leftLittleShipLabel1.getY()+6, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[8].setBounds(leftLittleShipLabel1.getX()+27 , leftLittleShipLabel1.getY()+57, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[9].setBounds(leftLittleShipLabel1.getX()+27 , leftLittleShipLabel1.getY()+108, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[10].setBounds(leftLittleShipLabel2.getX()+30 , leftLittleShipLabel2.getY()+6, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[11].setBounds(leftLittleShipLabel2.getX()+30 , leftLittleShipLabel2.getY()+57, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[12].setBounds(leftLittleShipLabel2.getX()+30 , leftLittleShipLabel2.getY()+108, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[13].setBounds(leftShipLabel.getX()+7 , leftShipLabel.getY()+8, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[14].setBounds(leftShipLabel.getX()+7 , leftShipLabel.getY()+59, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[15].setBounds(leftShipLabel.getX()+7 , leftShipLabel.getY()+110, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[16].setBounds(leftShipLabel.getX()+7 , leftShipLabel.getY()+161, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[17].setBounds(leftShipLabel.getX()+55 , leftShipLabel.getY()+8, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[18].setBounds(leftShipLabel.getX()+55, leftShipLabel.getY()+59, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[19].setBounds(leftShipLabel.getX()+55 , leftShipLabel.getY()+110, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[20].setBounds(leftShipLabel.getX()+55 , leftShipLabel.getY()+161, squareImage.getIconWidth(), squareImage.getIconHeight());
           
            
  


//            // set the bounds of upper label on the downer label when click on the fix button 
//            // boat label
//            leftUppBoatLabel1.setBounds(leftBoatLabel1.getBounds());
//            leftUppBoatLabel2.setBounds(leftBoatLabel2.getBounds());
//            leftUppBoatLabel3.setBounds(leftBoatLabel3.getBounds());
//            // destroyer label
//            leftUppDestroyerLabel1.setBounds(leftDestroyerLabel1.getBounds());
//            leftUppDestroyerLabel2.setBounds(leftDestroyerLabel2.getBounds());
//            // little ship label
//                leftUppLittleShipLabel1.setBounds(leftLittleShipLabel1.getBounds());
//            leftUppLittleShipLabel2.setBounds(leftLittleShipLabel2.getBounds());
//             //  ship label
//                leftUppShipLabel.setBounds(leftShipLabel.getBounds());
          
            
            // remove Methods ;
            
            // boat label ;
            gameFrame.remove(leftBoatLabel1);      
            gameFrame.remove(leftBoatLabel2);  
            gameFrame.remove(leftBoatLabel3); 
            
           // destroyer label ;
            gameFrame.remove(leftDestroyerLabel1);      
            gameFrame.remove(leftDestroyerLabel2); 
            
            // ittle ship label ;
            gameFrame.remove(leftLittleShipLabel1);      
            gameFrame.remove(leftLittleShipLabel2);
            
            // ship label ;
            gameFrame.remove(leftShipLabel); 
            
            // set false enable left fix button ;
            leftFixButton.setEnabled(false);
            
        }

        
            if(e.getSource() == rightFixButton){
                
            square[21].setBounds(rightBoatLabel1.getX()+8, rightBoatLabel1.getY()+11, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[22].setBounds(rightBoatLabel2.getX()+8, rightBoatLabel2.getY()+11, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[23].setBounds(rightBoatLabel3.getX()+8, rightBoatLabel3.getY()+11, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[24].setBounds(rightDestroyerLabel1.getX()-3, rightDestroyerLabel1.getY()+9, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[25].setBounds(rightDestroyerLabel1.getX()-3 , rightDestroyerLabel1.getY()+60, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[26].setBounds(rightDestroyerLabel2.getX()-1, rightDestroyerLabel2.getY()+9, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[27].setBounds(rightDestroyerLabel2.getX()-1 , rightDestroyerLabel2.getY()+60, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[28].setBounds(rightLittleShipLabel1.getX()+27, rightLittleShipLabel1.getY()+6, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[29].setBounds(rightLittleShipLabel1.getX()+27 , rightLittleShipLabel1.getY()+57, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[30].setBounds(rightLittleShipLabel1.getX()+27 , rightLittleShipLabel1.getY()+108, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[31].setBounds(rightLittleShipLabel2.getX()+30 , rightLittleShipLabel2.getY()+6, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[32].setBounds(rightLittleShipLabel2.getX()+30 , rightLittleShipLabel2.getY()+57, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[33].setBounds(rightLittleShipLabel2.getX()+30 , rightLittleShipLabel2.getY()+108, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[34].setBounds(rightShipLabel.getX()+7 , rightShipLabel.getY()+8, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[35].setBounds(rightShipLabel.getX()+7 , rightShipLabel.getY()+59, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[36].setBounds(rightShipLabel.getX()+7 , rightShipLabel.getY()+110, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[37].setBounds(rightShipLabel.getX()+7 , rightShipLabel.getY()+161, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[38].setBounds(rightShipLabel.getX()+55 , rightShipLabel.getY()+8, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[39].setBounds(rightShipLabel.getX()+55, rightShipLabel.getY()+59, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[40].setBounds(rightShipLabel.getX()+55 , rightShipLabel.getY()+110, squareImage.getIconWidth(), squareImage.getIconHeight());
            square[41].setBounds(rightShipLabel.getX()+55 , rightShipLabel.getY()+161, squareImage.getIconWidth(), squareImage.getIconHeight());
                
//            // set the bounds of upper label on the downer label when click on the fix button 
//            // boat label
//            rightUppBoatLabel1.setBounds(rightBoatLabel1.getBounds());
//            rightUppBoatLabel2.setBounds(rightBoatLabel2.getBounds());
//            rightUppBoatLabel3.setBounds(rightBoatLabel3.getBounds());
//            // destroyer label
//            rightUppDestroyerLabel1.setBounds(rightDestroyerLabel1.getBounds());
//            rightUppDestroyerLabel2.setBounds(rightDestroyerLabel2.getBounds());
//            // little ship label
//                rightUppLittleShipLabel1.setBounds(rightLittleShipLabel1.getBounds());
//            leftUppLittleShipLabel2.setBounds(rightLittleShipLabel2.getBounds());
//             //  ship label
//                rightUppShipLabel.setBounds(rightShipLabel.getBounds());
          
            
            // remove Methods ; 
            // boat label ;
            gameFrame.remove(rightBoatLabel1);      
            gameFrame.remove(rightBoatLabel2);  
            gameFrame.remove(rightBoatLabel3); 
            
           // destroyer label ;
            gameFrame.remove(rightDestroyerLabel1);      
            gameFrame.remove(rightDestroyerLabel2); 
            
            // ittle ship label ;
            gameFrame.remove(rightLittleShipLabel1);      
            gameFrame.remove(rightLittleShipLabel2);
            
            // ship label ;
            gameFrame.remove(rightShipLabel); 
            
            // set false enable left fix button ;
            rightFixButton.setEnabled(false);
            
        }
            if(e.getSource() == rematchButton){
             // update points  ;
            totalPoint_L  = 3400;
            shootCount_L = 0 ;
            targetShoots_L = 0 ;
            totalPoint_R  = 3400;
            shootCount_R = 0 ;
            targetShoots_R = 0; 
            gameFrame.dispose();
            
            // back to with my friend frame and start game in first ; 
            new withMyFriend();
                }
                       
            // show up-to-date points ; ( whenever you want to see points , you shuld clisk on this button ;)
              if(e.getSource() == showPointButton_L){
                JOptionPane.showMessageDialog(null, "Total Point  : " +totalPoint_L + "\nShoot count : "+shootCount_L+"\nTarget shoots : "+targetShoots_L, "information of player 1", JOptionPane.INFORMATION_MESSAGE);
            }
               if(e.getSource() == showPointButton_R){
                JOptionPane.showMessageDialog(null, "Total Point  : " +totalPoint_R + "\nShoot count : "+shootCount_R+"\nTarget shoots : "+targetShoots_R, "information of player 1", JOptionPane.INFORMATION_MESSAGE);
            }    
        
      }
}