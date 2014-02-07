package advuni;

import java.awt.EventQueue;

import advuni.gui.ADMainWindow;

public class Advuni implements Runnable{

	ADMainWindow mainWindow;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Advuni());
	}

}
