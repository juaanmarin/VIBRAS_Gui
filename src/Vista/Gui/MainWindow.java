package Vista.Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Controlador.Cordinador;

public class MainWindow extends JFrame implements ActionListener{
	
	private JMenuItem itemRegistrarPersonas;
	private JMenuItem itemConsultarPersonas;
	private JMenuItem itemActualizarPersonas;
	private JMenuItem itemEliminarPersonas;
	private Cordinador myCordinador;

	public MainWindow() {
		conponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
		setResizable(false);
		setTitle("Emisora");
		setLocationRelativeTo(null);
	}
	
	public void conponents() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuPersonas = new JMenu("Gestionar Personas");
		menuBar.add(menuPersonas);
		
		itemRegistrarPersonas = new JMenuItem("Registrar");
		itemRegistrarPersonas.addActionListener(this);
		menuPersonas.add(itemRegistrarPersonas);
		
		itemConsultarPersonas = new JMenuItem("Consultar");
		itemConsultarPersonas.addActionListener(this);
		menuPersonas.add(itemConsultarPersonas);
		
		itemActualizarPersonas = new JMenuItem("Actualizar");
		itemActualizarPersonas.addActionListener(this);
		menuPersonas.add(itemActualizarPersonas);
		
		itemEliminarPersonas = new JMenuItem("Eliminar");
		itemEliminarPersonas.addActionListener(this);
		menuPersonas.add(itemEliminarPersonas);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}	

	public void setMyCordinador(Cordinador myCordinador) {
		this.myCordinador = myCordinador;
	}
}
