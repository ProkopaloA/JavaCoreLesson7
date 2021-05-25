package ua.lviv.lgs;

public abstract class Plane {

	private int length;
	private int height;
	private int weight;

	public Plane(int length, int height, int weight) {
		this.length = length;
		this.height = height;
		this.weight = weight;
	}

	public void startEngines() {
		int timer = 20 + (int) (Math.random() * 69);
		System.out.println("The engines are running! There are left " + timer + " seconds before the start. ");
	}

	public void takeOfPlane() {
		double maxDistance = Math.random() * 1000;
		System.out.println("The plane take of! The plane with full tanks will fly " + maxDistance + " km. ");
	}

	public void landingPlane() {
		System.out.println("The plane lands.");
	}
	public void moveUp() {
		PlaneControl.moveUp();
	}

	public void moveDown() {
		PlaneControl.moveDown();
	}

	public void moveLeft() {
		PlaneControl.moveLeft();
	}

	public void moveRight() {
		PlaneControl.moveRight();
	}

}
