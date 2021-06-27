package edu.vcentry.hasarelationship;

public class PC {
	
	private Monitor monitor;
	private MotherBoard motherBoard;
	private KeyBoard keyboard; 
	private Mouse mouse;
	
	
	public PC(Monitor monitor, MotherBoard motherBoard, KeyBoard keyboard, Mouse mouse) {
		this.monitor = monitor;
		this.motherBoard = motherBoard;
		this.keyboard = keyboard; 
		this.mouse = mouse; 
	}

	

	public Mouse getMouse() {
		return mouse;
	}



	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}



	public KeyBoard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(KeyBoard keyboard) {
		this.keyboard = keyboard;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	public Monitor getMonitor() {
		return monitor;
	}

	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
	}
	

}
