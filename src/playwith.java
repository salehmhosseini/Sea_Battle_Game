
package project_midterm;
import java.util.* ;
import java.math.* ;
import javax.swing.* ;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;

public class playwith implements ActionListener {
    
    JFrame playWith = new JFrame("Sea  Battle");
    JLabel label = new JLabel();
    JComboBox combo = new JComboBox();// creat a Combo Box ;

    public playwith (){
        // jframe ;
        playWith.setSize(1700 , 1000);
        playWith.setResizable(false);
        playWith.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon_image = new ImageIcon("icon.PNG");
        playWith.setIconImage(icon_image.getImage());
        playWith.setLocationRelativeTo(null);// method to display frame in center
        
        
        //jlabel
        ImageIcon playwith = new ImageIcon("playwith.png"); // creat object from image icon ;
        label.setIcon(playwith);// set image icon for background ;
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.yellow ,4);    
       label.setBorder(border);
        

        //Combo Box 
        combo.addItem(" whith my frind");
        combo.addItem("whit my cumputer");         
        combo.addActionListener(this);
        combo.setSize(400, 73);
        combo.setLocation(600,530);
        combo.setFont(new Font("segoe print" , Font.BOLD , 41));
        combo.setForeground(new Color(112 , 146 , 190));
        
        
       // add methods ;
       playWith.setVisible(true);
       playWith.setBackground(Color.yellow);
       playWith.add(combo);  
       playWith.add(label);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == combo){
            if(combo.getSelectedIndex() == 1){
                playWith.dispose();
                new withMyCumputer ();
            }
            else if (combo.getSelectedIndex() == 0){
                playWith.dispose();
                new withMyFriend();
            }
        }
  }
    
}
