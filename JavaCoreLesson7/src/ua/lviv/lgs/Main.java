package ua.lviv.lgs;

public class Main {
	public static void main(String[] args) {
		SU27 Su27 = new SU27 (22, 30, 16, 1300, "grey");
		Su27.startEngines();
		Su27.takeOfPlane();
		Su27.moveUp();
		Su27.moveDown();
		Su27.moveRight();
		Su27.moveLeft();
		Su27.stealth();
		Su27.dumpingShells();
		Su27.turboAcceleration();
		Su27.landingPlane();	
	}

}
