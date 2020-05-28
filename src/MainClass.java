public class MainClass {
	
	public static void  main(String[] args) {
		System.out.println("Hello world!");
		SpeedConverter speedConvOvj = new SpeedConverter();
		speedConvOvj.printConversion(1.5);
		speedConvOvj.printConversion(10.25);
		speedConvOvj.printConversion(-5.6);
		speedConvOvj.printConversion(0);
	}
	
}
