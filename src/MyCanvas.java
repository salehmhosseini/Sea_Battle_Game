
package project_midterm;

    import java.awt.*;
    import java.util.Random;
    import javax.swing.*;



    public class MyCanvas extends JComponent{
        
        JLabel label = new JLabel();
    

    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(mgr); //To change body of generated methods, choose Tools | Templates.
    }
        
    @Override
    public void paint(Graphics g) {
     // start draw grid   
    int rows = 18;
    int cols = 31;
    int width = getSize().width;
    int height = getSize().height;

    // draw the rows
    int rowHt = height / (rows);
    for (int i = 0; i < rows; i++)
      g.drawLine(0, i * rowHt, width, i * rowHt);

    // draw the columns
    int rowWid = width / (cols);
    for (int i = 0; i < cols; i++)
      g.drawLine(i * rowWid, 0, i * rowWid, height);
      // finish draw grid
      
      //draw mid line with fill rect  :) ;
      g.setColor(new Color(233 , 233 , 252 ));

      g.fillRect(757, 0, 107, getSize().width);
      
      // draw left fill rect ;
      g.fillRect(0, 0, 54 ,getSize().height);
      
      // draw right fill rect;
       g.fillRect(1621, 0, 61 ,getSize().height);
       
       // draw upper fill rect ;
       g.fillRect(0, 0, getSize().width ,52);
      
       // draw downer fill rect ;
       g.fillRect(0,885, getSize().width ,75);
       
       // set the three boat on the map with random method  ;
       
       Random rand = new Random(); 
       {
           int a , b , c , d , e , f  ;
         
             d =48+rand.nextInt(15)*52 ;
            e =48+rand.nextInt(15)*52 ;
            f =48+rand.nextInt(15)*52 ;
 
            a =55+rand.nextInt(13)*54 ;
           b =55+rand.nextInt(13)*54 ;
           c =55+rand.nextInt(13)*54 ;
            
        
            Image boat_L = Toolkit.getDefaultToolkit().getImage("boat.png");   
            
       
         g.drawImage(boat_L,a, d , this);
         g.drawImage(boat_L,b, e , this);
         g.drawImage(boat_L,c, f , this);
            }
       
       // set the two destroyer on the left map with random method  ;
        Image destroyer_L = Toolkit.getDefaultToolkit().getImage("destroyer.png");
        g.drawImage(destroyer_L,64+ rand.nextInt(13)*54,50+rand.nextInt(13)*53, this);
        g.drawImage(destroyer_L,64+ rand.nextInt(13)*54,50+rand.nextInt(13)*53, this);
        
        // set the two little ship on the left map with random method ;
         Image little_ship_L = Toolkit.getDefaultToolkit().getImage("little_ship.png");
       g.drawImage(little_ship_L,36+rand.nextInt(11)*54, 36+rand.nextInt(11)*54, this);
       g.drawImage(little_ship_L,36+rand.nextInt(11)*54, 36+rand.nextInt(11)*54, this);
        
       // set the two ship on the left map with random method ;
       Image ship_L = Toolkit.getDefaultToolkit().getImage("ship.png");
       g.drawImage(ship_L, 45+rand.nextInt(9)*54, 85+rand.nextInt(11)*53, this);
       
       //***********
       // set the three boat on the rigtht map with random method ;
        Image boat_R = Toolkit.getDefaultToolkit().getImage("boat.png");   
         g.drawImage(boat_R,973+rand.nextInt(10)*54, 48+rand.nextInt(15)*52, this);
         g.drawImage(boat_R,973+rand.nextInt(10)*54, 48+rand.nextInt(15)*52, this);
         g.drawImage(boat_R,973+rand.nextInt(10)*54, 48+rand.nextInt(15)*52, this);
         
       
        // set the two destroyer on the right map with random method  ;
        Image destroyer_R = Toolkit.getDefaultToolkit().getImage("destroyer.png");
        g.drawImage(destroyer_R,877+ rand.nextInt(10)*54,50+rand.nextInt(13)*53, this);
        g.drawImage(destroyer_R,877+ rand.nextInt(10)*54,50+rand.nextInt(13)*53, this);
        
        // set the two little ship on the right map with random method ;
         Image little_ship_R = Toolkit.getDefaultToolkit().getImage("little_ship.png");
       g.drawImage(little_ship_R,847+rand.nextInt(10)*54, 36+rand.nextInt(11)*54, this);
       g.drawImage(little_ship_R,847+rand.nextInt(10)*54, 36+rand.nextInt(11)*54, this);
        
       // set the two ship on the right map with random method ;
       Image ship_R = Toolkit.getDefaultToolkit().getImage("ship.png");
       g.drawImage(ship_R, 855+rand.nextInt(9)*54, 85+rand.nextInt(11)*53, this);
       
       
        
        
        

    }

    public MyCanvas() {
        
    
        
    }
   
}
  

    

