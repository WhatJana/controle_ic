package br.inatel.ehealth.telas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import br.inatel.ehealth.controle.BotaoSalvarOrientador;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelCadastroOrientador extends JPanel {
	private JTextField textNome;
	private JTextField textEmail;

	/**
	 * Create the panel.
	 */
	public PainelCadastroOrientador() {
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cadastro de orientador");
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(64, 0, 240, 36);
		add(lblTitulo);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setBounds(100, 81, 80, 20);
		add(lblNome);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textNome.setBounds(190, 83, 147, 20);
		add(textNome);
		textNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEmail.setBounds(100, 133, 80, 20);
		add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textEmail.setColumns(10);
		textEmail.setBounds(190, 135, 147, 20);
		add(textEmail);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new BotaoSalvarOrientador(this));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(140, 204, 103, 30);
		add(btnNewButton);

	}
	
	public String getTextNome () {
		return textNome.getText();
	}
	
	public String getTextEmail () {
		return textEmail.getText();
	}
	
	public void limpaNome() {
		textNome.setText("");
	}
	public void limpaEmail() {
		textEmail.setText("");
	}
}
