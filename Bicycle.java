/** Interfach for specific Bicycle classes */

interface Bicycle {
	void changeGear(int newGear);
	void changeCadence(int newCadence);
	int accelerate(int speedup);
	int brake(int slowdown);
}
