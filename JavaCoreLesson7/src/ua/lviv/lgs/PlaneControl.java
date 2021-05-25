package ua.lviv.lgs;

public class PlaneControl {
	public static void moveUp() {
		System.out.println("The plane flew up " + Distance.distance() + " km ");
	}

	public static void moveDown() {
		System.out.println("The plane flew down " + Distance.distance() + " km ");
	}

	public static void moveLeft() {
		System.out.println("The plane flew to the left " + Distance.distance() + " km ");
	}

	public static void moveRight() {
		System.out.println("The plane flew to the right " + Distance.distance() + " km ");
	}

}
