import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class testaBotao extends JFrame implements ActionListener{

	private JButton b1,b2,b3;
	private JPanel painel;
	
	public testaBotao(){
		super("Exemplo Enable - Disable");
		
		b1 = new JButton();                  
		b1.setText("Disable middle button"); 
		b1.setActionCommand("DISABLE");       
		b1.setMnemonic(KeyEvent.VK_D);       

		b2 = new JButton("Middle button");    
		b2.setMnemonic(KeyEvent.VK_M);             
		b2.setVerticalTextPosition(JLabel.BOTTOM);
		
		b3 = new JButton("Enable middle button");  
		b3.setEnabled(false);                     
		b3.setActionCommand("ENABLE");             
		b3.setMnemonic(KeyEvent.VK_E);             
		b1.addActionListener(this);  
		b3.addActionListener(this);
		
		painel = new JPanel();
		painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		painel.add(b1);
		painel.add(b2);
		painel.add(b3);
		
		this.add(painel, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if("DISABLE".equals(command)){
		     b1.setEnabled(false);
		     b2.setEnabled(false);
		     b3.setEnabled(true);			
		} else {                         
	        b1.setEnabled(true);
	        b2.setEnabled(true);
	        b3.setEnabled(false);
		}
	}

	public static void main(String Args[]){
		testaBotao Botao = new testaBotao();
	}
	
}
