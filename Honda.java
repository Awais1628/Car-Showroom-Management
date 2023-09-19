class Honda extends Vehicle{
	private String[] model = {"Civic", "City", "CR-V", "BR-V"};
	private int[] year = {2001, 2005, 2021, 2020};
	private double[] price = {400000, 320000, 140000, 120000};
	
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

