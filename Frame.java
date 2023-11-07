import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
    JTextArea text;

	Frame(){

        text = new JTextArea("Hello there");
        text.setVisible(true);
		
		label = new JLabel("Hey Mate");
		label.setBounds(150, 150, 300, 200);
		label.setVisible(true);
        label.setFont(new Font("Comic Sans", Font.BOLD, 25));
        label.setBackground(Color.gray);
		
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
		button.setText("Roll");
		
		button.setFocusable(false);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.pink);
		button.setBackground(Color.black);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
        this.setForeground(Color.darkGray);
		this.add(button);
		this.add(label);
        this.add(text);

	}
    int n;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
            n++;
			button.setEnabled(true);
			label.setVisible(true);
            if(n==4) n=0;
		}	
    }
}