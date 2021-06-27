package edu.vcentry.hasarelationship;

public class Main {

	public static void main(String[] args) {
		Resolution myRes = new Resolution(1980, 1240);
		Monitor myMonitor = new Monitor("Samsung", "SM1234", 27, myRes);
		MotherBoard myMotherBoard = new MotherBoard("ASUS", "ASUS1234", 4, 3, "2.10");
		KeyBoard myKeyBoard  = new KeyBoard( "Zebronics", "ZB1234");
		Mouse myMouse = new Mouse("Iball", "Wireless");
		PC myPc = new PC(myMonitor, myMotherBoard, myKeyBoard, myMouse );
		
		System.out.println(myPc.getMotherBoard().getBiosVersion());
		System.out.println(myPc.getMonitor().getResolution().getHeight());
		System.out.println(myPc.getKeyboard().getModel());
		System.out.println(myPc.getMouse().getManufacturer());
	}
}
