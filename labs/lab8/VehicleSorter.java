import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class VehicleSorter {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();

		//TODO: add vehicle objects of different types to your list
		//	e.g. vehicles.add(new Vehicle());
		//
vehicles.add(new Drone(3));
vehicles.add(new Car(35));
vehicles.add(new Car(14));
vehicles.add(new Drone(13));


		Collections.sort(vehicles);
		for (Vehicle v : vehicles) {
			System.out.println(v);
		}
	}
}
