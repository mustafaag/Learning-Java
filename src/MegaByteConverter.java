
public class MegaByteConverter {
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes <0 ) {
			System.out.println("Invalid Value");
		}else {
			String YY = String.valueOf(kiloBytes / 1024);
			String ZZ = String.valueOf(kiloBytes % 1024);
			
			System.out.println(String.valueOf(kiloBytes)+"KB = " + YY + " MB and " +ZZ  +" KB");
		}
	}
}
