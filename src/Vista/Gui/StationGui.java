package Vista.Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import Controlador.Cordinador;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class StationGui extends JFrame implements ActionListener{
	
	private Cordinador myCordinador;
	private JTextField txtNameStation;
	private JComboBox selectMode;
	private JComboBox selectMusic;
	private JButton addStation;

	public StationGui() {
		conponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(333,429);
		setResizable(false);
		setTitle("Setings Station");
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);	
	}
	
	public void conponents() {
		
		JLabel lblNombre = new JLabel("Name Station");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(10, 30, 299, 25);
		getContentPane().add(lblNombre);
		
		JLabel lblTransmissionMode = new JLabel("select transmission mode");
		lblTransmissionMode.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransmissionMode.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTransmissionMode.setBounds(10, 98, 299, 17);
		getContentPane().add(lblTransmissionMode);
		
		JLabel lblTypeOfMysic = new JLabel("select type of music");
		lblTypeOfMysic.setHorizontalAlignment(SwingConstants.CENTER);
		lblTypeOfMysic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTypeOfMysic.setBounds(10, 181, 299, 17);
		getContentPane().add(lblTypeOfMysic);
		
		txtNameStation=new JTextField();
		txtNameStation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNameStation.setBounds(10, 52, 299, 25);
		getContentPane().add(txtNameStation);
		txtNameStation.setColumns(10);
		
		selectMode = new JComboBox();
		selectMode.setFont(new Font("Tahoma", Font.PLAIN, 14));
		selectMode.setModel(new DefaultComboBoxModel(new String[] {"AM", "FM", "Straming"}));
		selectMode.setBounds(128, 125, 60, 30);
		getContentPane().add(selectMode);
		
		selectMusic = new JComboBox();
		selectMusic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		selectMusic.setModel(new DefaultComboBoxModel(new String[] {"Popular", "Regueton", "Vallenato", "corridos", "Pop", "rock", "jazz", "Rap", "Other"}));
		selectMusic.setBounds(120, 200, 79, 30);
		getContentPane().add(selectMusic);
		
		addStation =new JButton("Add Station");
		addStation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addStation.setBounds(74, 273, 170, 30);
		getContentPane().add(addStation);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}	

	public void setMyCordinador(Cordinador myCordinador) {
		this.myCordinador = myCordinador;
	}
}
