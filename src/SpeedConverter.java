
public class SpeedConverter {
	public int toMilesPerHour(double kilometersPerHour) {
		int milesPerHour = -1;
		if(kilometersPerHour >= 0) {
			milesPerHour = (int) Math.round(kilometersPerHour*0.621371192);
		}
		
		return milesPerHour;
	}
	
	public void printConversion(double kilometersPerHour) {
		int converted = toMilesPerHour(kilometersPerHour);
		if(converted == -1) {
			System.out.println("Invalid Value");
			return;
		}
		String newText = String.valueOf(kilometersPerHour) + " km/h = "+ String.valueOf(converted)+ " mi/h";
		
		System.out.println(newText);
	}
}
