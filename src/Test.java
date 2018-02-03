// Java implementation of Naive method to print all
// divisors

class Test {
	// // method to print the divisors
	static void printDivisors(int n) {
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				System.out.printf("%d ", i);
	}

	// Driver method
	public static void main(String args[]) {
		System.out.println("The divisors of 100 are: ");
		printDivisors(100);
		System.out.println();
		int index = 0;
		int arr[] = new int[10];
		for (int i = 1; i <= 10; i++) {
			System.out.println("val: " + i);
			if (i <= 5) {
				arr[i] = i;
				index = index + 1;
			}
			if (i == 5) {
				break;
			}
		}
		System.out.println("index: " + index);
		for (int j = 10; j <= 15; j++) {
			arr[index + 1] = j;
		}

	}
}