package br.inatel.ehealth.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FramePrimario extends JFrame {

	private JPanel contentPane;

	public static void startPrimario() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrimario framePainelPrimario = new FramePrimario();
					framePainelPrimario.add(new PainelPrimario());
					framePainelPrimario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
	}
	
	
	public FramePrimario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
