package edu.ap.spring.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.beans.EventHandler;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.TransferHandler;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UI implements InitializingBean {
	
	@Autowired
	EventHandler eventHandler;

	private JFrame jFrame;
	private JLabel label1, label2;
	private JTextField input;
	private JPanel controlPanel;
    private JButton OK;
    
    public UI() {}
    
    public void setupUI() {
	    	jFrame = new JFrame("Spring 8ball");
	    	jFrame.setLayout(new FlowLayout());
	    	
	    	controlPanel = new JPanel();
	    controlPanel.setLayout(new GridLayout(3, 2));

		label1 = new JLabel("input : ");
		input = new JTextField(15);
		input.setDragEnabled(true);
		
		OK = new JButton();
		OK.setText("ok");
		OK.setTransferHandler(new TransferHandler("text"));

		controlPanel.add(label1);
		controlPanel.add(input);
		controlPanel.add(label2);

		controlPanel.add(OK);

		jFrame.add(controlPanel);
		        
		jFrame.setSize(400, 400);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.pack();
		jFrame.setVisible(true);
    }

    public JFrame getjFrame() {
        return this.jFrame;
    }
    
    public JTextField getinput() {
		return this.input;
}

    public JButton getButton() {
        return OK;
    }
	@Override
	public void afterPropertiesSet() throws Exception {
		System.setProperty("java.awt.headless", "false");
	}
}
