package SumOfDigits;
//Incomplete

public class DRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println(digital_root(16));

		System.out.println(digital_root(942));
		//System.out.println(digital_root(15));
		//System.out.println(digital_root(6));
		;

	}

	//does not work properly
	public static int digital_root(int n) {
		int sum = 0;
		if (n > 9) {
			if (n == 0) {
				return 0;
			} else {
				while (n > 0) {
					int d = n / 10;
					int k = n - d * 10;
					n = d;
					sum += k;
					System.out.println(sum);
				}
			}

			return digital_root(sum);

		}else{
			return sum;	
		}
		

	}
}
