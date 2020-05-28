
public class SpeedConverter {
	public static long toMilesPerHour(double kilometersPerHour) {
		int milesPerHour = -1;
		if(kilometersPerHour >= 0) {
			milesPerHour = (int) Math.round(kilometersPerHour/1.609);
		}
		
		return milesPerHour;
	}
	
	public static void printConversion(double kilometersPerHour) {
		long converted = toMilesPerHour(kilometersPerHour);
		if(converted == -1) {
			System.out.println("Invalid Value");
			return;
		}
		String newText = String.valueOf(kilometersPerHour) + " km/h = "+ String.valueOf(converted)+ " mi/h";
		
		System.out.println(newText);
	}
}
