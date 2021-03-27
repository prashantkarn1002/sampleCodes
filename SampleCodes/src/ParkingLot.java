import java.util.*;
import java.util.regex.Pattern;

public class ParkingLot {
	static int bike = 1;
	static int car = 1;
	static int bus = 1;
	
	public int bikeCount(int b) {		
		return b;
	}
	public int carCount(int b) {		
		return b;
	}
	public int busCount(int b) {		
		return b;
	}

	public static void main(String[] args) {
		ParkingLot p = new ParkingLot();
		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter total number of vehicles: ");
		int count = sc.nextInt();
	
		for(int i=0; i < count; i++) {
			System.out.print("Enter vehicle type A-Bike, B-Car, C-Bus: ");
			String vehType = sc.next();
			System.out.print("Enter vehicle number: ");
			String vehNum = sc.next();
			boolean matched = Pattern.matches("[a-zA-Z]{2}[-][0-9]{2}[-][a-zA-Z]{2}[-][0-9]{4}", vehNum);
			if(matched) {
				if(vehType.equalsIgnoreCase("A")) {
					int num = p.bikeCount(bike);
					System.out.println(vehNum + " go to Parking Lot 1 - Slot: "+num);
					bike = num + 1;
				} else if(vehType.equalsIgnoreCase("B")) {
					int num = p.bikeCount(car);
					System.out.println(vehNum + " go to Parking Lot 2 - Slot: "+num);
					car = num + 1;
				} else if(vehType.equalsIgnoreCase("C")) {
					int num = p.bikeCount(bus);
					System.out.println(vehNum + " go to Parking Lot 3 - Slot: "+num);
					bus = num + 1;
				} else {
					System.out.println("Parking for this vehicle is not allowed");
				}
			} else {
				System.out.println("Enter valid number.");
				break;
			}
		}
	}
}
