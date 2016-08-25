package com.derun.drclient;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

/**
 * Java�ͻ��˳���
 * @author wbzhao
 *
 */
public class DrClient extends JWindow {
	
	private static final long serialVersionUID = 1L;

	public DrClient(String filename, Frame f) 
    { 
        super(f); 
        JLabel l = new JLabel(new ImageIcon(filename)); 
        getContentPane().add(l, BorderLayout.CENTER); 
        pack(); 
        Dimension screenSize = 
          Toolkit.getDefaultToolkit().getScreenSize(); 
        Dimension labelSize = l.getPreferredSize(); 
        setLocation(screenSize.width/2 - (labelSize.width/2), 
                    screenSize.height/2 - (labelSize.height/2)); 
        setVisible(true); 
        screenSize = null; 
        labelSize = null; 
    } 
	
	public static void main(String[] args) {
		
	}

}
