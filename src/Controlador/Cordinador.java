package Controlador;

import Modelo.Dao.MusicProgrammingDao;
import Modelo.Dao.MusicTracksDao;
import Modelo.Dao.StationDao;
import Vista.Gui.MainWindow;
import Vista.Gui.StationGui;
import Vista.Gui.TracksGui;

public class Cordinador {
	MainWindow myMainWindow;
	StationGui myStationGui;
	TracksGui myTracksGui;
	MusicProgrammingDao myMusicProgrammingDao;
	MusicTracksDao myMusicTracksDao;
	StationDao myStationDao;
	
	public void setMyMainWindow(MainWindow myMainWindow) {
		this.myMainWindow = myMainWindow;
	}
	
	public void setMyStationGui(StationGui myStationGui) {
		this.myStationGui = myStationGui;
	}
	
	public void setMyTracksGui(TracksGui myTracksGui) {
		this.myTracksGui = myTracksGui;
	}
	
	public void setMyMusicProgrammingDao(MusicProgrammingDao myMusicProgrammingDao) {
		this.myMusicProgrammingDao = myMusicProgrammingDao;
	}
	
	public void setMyMusicTracksDao(MusicTracksDao myMusicTracksDao) {
		this.myMusicTracksDao = myMusicTracksDao;
	}
	
	public void setMyStationDao(StationDao myStationDao) {
		this.myStationDao = myStationDao;
	}
	
	
	
}
