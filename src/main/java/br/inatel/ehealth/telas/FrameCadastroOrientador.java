package br.inatel.ehealth.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameCadastroOrientador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void startCadastroOrientador() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCadastroOrientador framePainelCadastroOrientador = new FrameCadastroOrientador();
					framePainelCadastroOrientador.add(new PainelCadastroOrientador());
					framePainelCadastroOrientador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameCadastroOrientador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
