package br.inatel.ehealth.telas;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.inatel.ehealth.controle.BotaoAdicionar;
import br.inatel.ehealth.controle.BotaoSalvarHorario;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class PainelHorario extends JPanel {
	public JTable tableHorario;
	
	DefaultTableModel modelo = new DefaultTableModel();	
	
	private JTextField textMateria;
	public String segManha = "-", segTarde = "-", segNoite = "-";
	public String terManha = "-", terTarde = "-", terNoite = "-";
	public String quaManha = "-", quaTarde = "-", quaNoite = "-";
	public String quiManha = "-", quiTarde = "-", quiNoite = "-";
	public String sexManha = "-", sexTarde = "-", sexNoite = "-";
	public String sabManha = "-", sabTarde = "-", sabNoite = "-";
	
	public boolean manha = false;
	public boolean tarde = false;
	public boolean noite = false;
	
	public boolean seg = false;
	public boolean ter = false;
	public boolean qua = false;
	public boolean qui = false;
	public boolean sex = false;
	public boolean sab = false;
	
	public PainelHorario() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 181, 397, 74);
		add(scrollPane);
		modelo = new DefaultTableModel(
				new Object[][] {
					{"Manhã", segManha, terManha, quaManha, quiManha, sexManha, sabManha},
					{"Tarde", segTarde, terTarde, quaTarde, quiTarde, sexTarde, sabTarde},
					{"Noite", segNoite, terNoite, quaNoite, quiNoite, sexNoite, sabNoite}
				},
				new String[] {
					"Período", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"
				}
			);
		tableHorario = new JTable(modelo);
		scrollPane.setViewportView(tableHorario);
		
		JLabel lblTitulo = new JLabel("Hor\u00E1rio");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblTitulo.setBounds(149, 0, 129, 55);
		add(lblTitulo);
		
		JRadioButton rdbtnSeg = new JRadioButton("Seg");
		rdbtnSeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seg = rdbtnSeg.isSelected();
			}
		});
		rdbtnSeg.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnSeg.setBounds(118, 86, 52, 23);
		add(rdbtnSeg);
		
		JRadioButton rdbtnTer = new JRadioButton("Ter");
		rdbtnTer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ter = rdbtnTer.isSelected();
			}
		});
		rdbtnTer.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnTer.setBounds(172, 86, 52, 23);
		add(rdbtnTer);
		
		JRadioButton rdbtnQua = new JRadioButton("Qua");
		rdbtnQua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qua = rdbtnQua.isSelected();
			}
		});
		rdbtnQua.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnQua.setBounds(226, 86, 52, 23);
		add(rdbtnQua);
		
		JRadioButton rdbtnQui = new JRadioButton("Qui");
		rdbtnQui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				qui = rdbtnQui.isSelected();
			}
		});
		rdbtnQui.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnQui.setBounds(280, 86, 52, 23);
		add(rdbtnQui);
		
		JRadioButton rdbtnSex = new JRadioButton("Sex");
		rdbtnSex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sex = rdbtnSex.isSelected();
			}
		});
		rdbtnSex.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnSex.setBounds(334, 86, 52, 23);
		add(rdbtnSex);
		
		JRadioButton rdbtnSab = new JRadioButton("Sab");
		rdbtnSab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sab = rdbtnSab.isSelected();
			}
		});
		rdbtnSab.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnSab.setBounds(388, 86, 52, 23);
		add(rdbtnSab);
		
		JRadioButton rdbtnManh = new JRadioButton("Manh\u00E3");
		rdbtnManh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manha = rdbtnManh.isSelected();
			}
		});
		rdbtnManh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnManh.setBounds(243, 56, 67, 23);
		add(rdbtnManh);
		
		JRadioButton rdbtnTarde = new JRadioButton("Tarde");
		rdbtnTarde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tarde = rdbtnTarde.isSelected();
			}
		});
		rdbtnTarde.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnTarde.setBounds(310, 56, 65, 23);
		add(rdbtnTarde);
		
		JRadioButton rdbtnNoite = new JRadioButton("Noite");
		rdbtnNoite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				noite = rdbtnNoite.isSelected();
			}
		});
		rdbtnNoite.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnNoite.setBounds(373, 56, 65, 23);
		add(rdbtnNoite);
		
		textMateria = new JTextField();
		textMateria.setBounds(74, 59, 86, 20);
		add(textMateria);
		textMateria.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Mat\u00E9ria:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(28, 53, 57, 31);
		add(lblNewLabel);
		
		JLabel lblPerodo = new JLabel("Per\u00EDodo:");
		lblPerodo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPerodo.setBounds(193, 56, 57, 23);
		add(lblPerodo);
		
		JLabel lblDiaDaSemana = new JLabel("Dia da semana:");
		lblDiaDaSemana.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDiaDaSemana.setBounds(28, 90, 86, 17);
		add(lblDiaDaSemana);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new BotaoAdicionar(this));
		btnAdicionar.setBounds(172, 126, 89, 23);
		add(btnAdicionar);
		
		JButton btnSalvarHorario = new JButton("Salvar");
		btnSalvarHorario.addActionListener(new BotaoSalvarHorario(this));
		btnSalvarHorario.setBounds(172, 266, 89, 23);
		add(btnSalvarHorario);

	}
	
	public String getTextMateria () {
		return textMateria.getText();
	}
	
	public DefaultTableModel getModelo() {
		return modelo;
	}
}
