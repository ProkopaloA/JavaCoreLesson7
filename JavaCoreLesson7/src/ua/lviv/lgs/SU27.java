package ua.lviv.lgs;

public class SU27 extends Plane implements TurboAcceleration, StealthTechnology, NuclearStrike {
	int maxSpeed;
	String color;

	public SU27(int length, int height, int weight, int maxSpeed, String color) {
		super(length, height, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void dumpingShells() {
		int shells = (int) (Math.random() * 11);
		System.out.println("The plane dropped " + shells + " nuclear shells.");
	}

	@Override
	public void stealth() {
		int timeStealth = (int) (Math.random() * 1000);
		System.out.println("The plane disappeared from sight for " + timeStealth + "seconds");
	}

	@Override
	public void turboAcceleration() {
		int accSpeed = this.maxSpeed + (int) (Math.random() * this.maxSpeed);
		System.out.println("The speed of plane now is " + accSpeed + " km.");
	}

}
