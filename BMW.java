class BMW extends Vehicle{
	private String[] model = {"M3 GTR", "X6", "I8", "Z4"};
	private int[] year = {2005, 2007, 2019, 2018};
	private double[] price = {500000, 210000, 170000, 200000};
	
	void get_OldCars() {
		for (int i = 0; i < 2; i++) {
			System.out.println(i+1 + ": ");
			get_brand();
			System.out.println(model[i]);
			System.out.println("Year is" + year[i]);
			System.out.println("Price is " + price[i]);
			System.out.println("------------------");
		}
	}
	void get_NewCars() {
		for (int i = 0; i < 4; i++) {
			System.out.println(i-1 + ": ");
			get_brand();
			System.out.println(model[i]);
			System.out.println("Year is" + year[i]);
			System.out.println("Price is " + price[i]);
			System.out.println("------------------");
		}
	}
}
