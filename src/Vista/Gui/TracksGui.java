package Vista.Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

import Controlador.Cordinador;

public class TracksGui extends JFrame implements ActionListener{
	
	private Cordinador myCordinador;
	private JButton Add_Tracks;
	private JButton Delete_Tracks;
	private JLabel lblNewLabel;

	public TracksGui() {
		conponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
		setResizable(false);
		setTitle("Emisora");
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
	}
	
	public void conponents() {
		
		Add_Tracks = new JButton("Add Tracks");
		Add_Tracks.setBackground(Color.YELLOW);
		Add_Tracks.setBounds(192, 352, 85, 21);
		getContentPane().add(Add_Tracks);
		
		Delete_Tracks = new JButton("Delete Tracks");
		Delete_Tracks.setBackground(Color.YELLOW);
		Delete_Tracks.setBounds(319, 352, 97, 21);
		getContentPane().add(Delete_Tracks);
		
		lblNewLabel = new JLabel("canciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(98, 44, 369, 245);
		getContentPane().add(lblNewLabel);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Add_Tracks) {
			
		}
		else if(e.getSource()==Delete_Tracks) {
			
		}
		
	}	

	public void setMyCordinador(Cordinador myCordinador) {
		this.myCordinador = myCordinador;
	}
	
}
