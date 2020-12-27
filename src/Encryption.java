
public class Encryption {

	public static void main(String[] args) {
		
		int p = 101;
		int q = 103;
		int z = (p - 1)*(q - 1);
		int d = 887;
		int e = 0;
		int x = 0;
		
		while ( x != 1 ) {
			x = (e * d) % z;

			e++;
		}
		
		System.out.println("Hello " + e + " " + x);
	}

}
