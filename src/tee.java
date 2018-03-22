import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class tee extends JFrame {

	private JTextField firstItem;
	private JTextField secondItem;
	private JTextField thirdItem;
	private JPasswordField passwordField;
	
	
	public tee(){

        super("Here is the title");
        setLayout(new FlowLayout());

        firstItem = new JTextField(12);
        add(firstItem);

        secondItem = new JTextField("Enter a text here");
        add(secondItem);

        thirdItem = new JTextField("This is uneditable", 15);
        thirdItem.setEditable(false);
        add(thirdItem);

        passwordField = new JPasswordField("mypassword"); 
        add(passwordField);

        
        thehandler handler = new thehandler();
        
        firstItem.addActionListener(handler);
        secondItem.addActionListener(handler);
        thirdItem.addActionListener(handler);
        passwordField.addActionListener(handler);
	
}
	                                                                                                                    
	private class thehandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			String string = "";
			
			if (event.getSource() == firstItem)
				string = String.format("field 1 is: %s", event.getActionCommand());
			else if (event.getSource() == secondItem)
				string = String.format("field 2 is: %s", event.getActionCommand());
			else if (event.getSource() == thirdItem)
				string = String.format("field 3 is: %s", event.getActionCommand());
			else if (event.getSource() == passwordField)
				string = String.format("password field is: %s", event.getActionCommand());
		
			JOptionPane.showMessageDialog(null, string);
		
		}
		 
	}
	
}
