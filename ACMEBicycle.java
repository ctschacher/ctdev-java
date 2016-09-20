/** Class that implements an interface */

class ACMEBicycle implements Bicycle {
	int cadence = 0;
	int gear    = 1;
	int speed   = 0;

	public void changeGear(int newGear) {
			gear = newGear;
		}

	public void changeCadence(int newCadence) {
			cadence = newCadence;
		}

	public int accelerate(int speedup) {
			speed = speed + speedup;
			return speed;
		}

	public int brake(int slowdown) {
			speed = speed - slowdown;
			return speed;
		}
}
