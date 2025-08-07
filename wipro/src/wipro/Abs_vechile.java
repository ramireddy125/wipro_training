package wipro;

abstract class Abs_vechile {
	abstract void startEngine();
}
class Car extends Abs_vechile{
	void startEngine()
	{
		System.out.println("Car engine started.");
	}
}
class Bike extends Abs_vechile {
    void startEngine() {
        System.out.println("Bike engine started with a kick.");
    }
}

