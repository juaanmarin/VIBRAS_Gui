package Vista.Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Controlador.Cordinador;
import javax.swing.JButton;

public class MainWindow extends JFrame implements ActionListener{
	
	private JMenuItem itemRegistrarPersonas;
	private JMenuItem itemConsultarPersonas;
	private JMenuItem itemActualizarPersonas;
	private Cordinador myCordinador;

	public MainWindow() {
		conponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
		setResizable(false);
		setTitle("Emisora");
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(213, 352, 162, 21);
		getContentPane().add(btnNewButton);
	}
	
	public void conponents() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuPersonas = new JMenu("Gestionar Personas");
		menuBar.add(menuPersonas);
		
		itemRegistrarPersonas = new JMenuItem("Setings Station");
		itemRegistrarPersonas.addActionListener(this);
		menuPersonas.add(itemRegistrarPersonas);
		
		itemConsultarPersonas = new JMenuItem("Add Tracks");
		itemConsultarPersonas.addActionListener(this);
		menuPersonas.add(itemConsultarPersonas);
		
		itemActualizarPersonas = new JMenuItem("Programing music");
		itemActualizarPersonas.addActionListener(this);
		menuPersonas.add(itemActualizarPersonas);
		
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}	

	public void setMyCordinador(Cordinador myCordinador) {
		this.myCordinador = myCordinador;
	}
}
