class Audi extends Vehicle{
	private String[] model = {"A7", "R8", "V8", "A4"};
	private int[] year = {2011, 2015, 2016, 2017};
	private double[] price = {400000, 110000, 190000, 300000};
	
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
	void get_NewCars(int a) {
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
