package br.inatel.ehealth.telas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import br.inatel.ehealth.controle.BotaoCadastrar;
import br.inatel.ehealth.controle.BotaoEntrar;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelLogin extends JPanel {
	private JTextField textEmail;
	private JTextField textNome;

	public PainelLogin() {
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Login");
		lblTitulo.setBounds(160, 11, 74, 36);
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTitulo);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEmail.setBounds(64, 74, 46, 14);
		add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textEmail.setBounds(160, 72, 192, 20);
		add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNome.setBounds(64, 116, 67, 14);
		add(lblNome);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textNome.setColumns(10);
		textNome.setBounds(160, 114, 192, 20);
		add(textNome);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new BotaoEntrar(this));
		btnEntrar.setBounds(145, 162, 89, 23);
		add(btnEntrar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new BotaoCadastrar(this));
		btnCadastrar.setBounds(145, 196, 89, 23);
		add(btnCadastrar);

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
