package br.inatel.ehealth.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import br.inatel.ehealth.telas.PainelHorario;

public class BotaoAdicionar implements ActionListener{
	private PainelHorario painelHorario;
	DefaultTableModel modelo;
	
	public BotaoAdicionar(PainelHorario painelHorario) {
		this.painelHorario = painelHorario;
		modelo = painelHorario.getModelo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(painelHorario.manha) {
			if(painelHorario.seg) {
				modelo.setValueAt(painelHorario.getTextMateria(), 0, 1);
			}
			if(painelHorario.ter) {
				modelo.setValueAt(painelHorario.getTextMateria(), 0, 2);
			}
			if(painelHorario.qua) {
				modelo.setValueAt(painelHorario.getTextMateria(), 0, 3);
			}
			if(painelHorario.qui) {
				modelo.setValueAt(painelHorario.getTextMateria(), 0, 4);
			}
			if(painelHorario.sex) {
				modelo.setValueAt(painelHorario.getTextMateria(), 0, 5);
			}
			if(painelHorario.sab) {
				modelo.setValueAt(painelHorario.getTextMateria(), 0, 6);
			}
		}
		
		if (painelHorario.tarde) {
			if(painelHorario.seg) {
				modelo.setValueAt(painelHorario.getTextMateria(), 1, 1);
			}
			if(painelHorario.ter) {
				modelo.setValueAt(painelHorario.getTextMateria(), 1, 2);
			}
			if(painelHorario.qua) {
				modelo.setValueAt(painelHorario.getTextMateria(), 1, 3);
			}
			if(painelHorario.qui) {
				modelo.setValueAt(painelHorario.getTextMateria(), 1, 4);
			}
			if(painelHorario.sex) {
				modelo.setValueAt(painelHorario.getTextMateria(), 1, 5);
			}
			if(painelHorario.sab) {
				modelo.setValueAt(painelHorario.getTextMateria(), 1, 6);
			}
			
		}
		
		if(painelHorario.noite) {
			if(painelHorario.seg) {
				modelo.setValueAt(painelHorario.getTextMateria(), 2, 1);
			}
			if(painelHorario.ter) {
				modelo.setValueAt(painelHorario.getTextMateria(), 2, 2);
			}
			if(painelHorario.qua) {
				modelo.setValueAt(painelHorario.getTextMateria(), 2, 3);
			}
			if(painelHorario.qui) {
				modelo.setValueAt(painelHorario.getTextMateria(), 2, 4);
			}
			if(painelHorario.sex) {
				modelo.setValueAt(painelHorario.getTextMateria(), 2, 5);
			}
			if(painelHorario.sab) {
				modelo.setValueAt(painelHorario.getTextMateria(), 2, 6);
			}
		}
	}

}
