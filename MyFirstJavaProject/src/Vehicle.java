
public abstract class Vehicle {
	double speed;
	void go() {
		System.out.println("This vehicle is moving");
	}
	void stop() {
		System.out.println("This vehicle is stopped");
	}
	abstract void toGo();
}
