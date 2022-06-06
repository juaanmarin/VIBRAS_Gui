package Controlador;

import Modelo.Dao.MusicProgrammingDao;
import Modelo.Dao.MusicTracksDao;
import Modelo.Dao.StationDao;
import Vista.Gui.MainWindow;
import Vista.Gui.StationGui;
import Vista.Gui.TracksGui;

public class Relaciones {
	
	public Relaciones() {
		//declaracion de la interfaces y clases unicas
		MainWindow myMainWindow;
		StationGui myStationGui;
		TracksGui myTracksGui;
		MusicProgrammingDao myMusicProgrammingDao;
		MusicTracksDao myMusicTracksDao;
		StationDao myStationDao;
		Cordinador miCordinador;
		
		//se instancia las clases declaradas
		myMainWindow=new MainWindow();
		myStationGui=new StationGui();
		myTracksGui=new TracksGui();
		myMusicProgrammingDao=new MusicProgrammingDao();
		myMusicTracksDao=new MusicTracksDao();
		myStationDao=new StationDao();
		miCordinador=new Cordinador();
		
		//se relaciona el cordinador con cada clase unica
		miCordinador.setMyMainWindow(myMainWindow);
		miCordinador.setMyStationGui(myStationGui);
		miCordinador.setMyTracksGui(myTracksGui);
		miCordinador.setMyMusicProgrammingDao(myMusicProgrammingDao);
		miCordinador.setMyMusicTracksDao(myMusicTracksDao);
		miCordinador.setMyStationDao(myStationDao);
		
		//a cada clase se le asigna la instancia unica del cordinador
		myMainWindow.setMyCordinador(miCordinador);
		myStationGui.setMyCordinador(miCordinador);
		myTracksGui.setMyCordinador(miCordinador);
		myMusicProgrammingDao.setMyCordinador(miCordinador);
		myMusicTracksDao.setMyCordinador(miCordinador);
		myStationDao.setMyCordinador(miCordinador);
		
		myMainWindow.setVisible(true);
		
	}
	
}
