public class car1 {
    // Attributes
    String color;
    String brand;
    String fuelType;
    float mileage;

    // Constructor with parameters
    car1(String color, String brand, String fuelType, float mileage) {
        this.color = color;
        this.brand = brand;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    // Default constructor
    car1() {
        System.out.println("Welcome to the store!");
    }

    // Declaring methods
    public void start() {
        System.out.println("The car is started");
    }

    public void stop() {
        System.out.println("The car is stopped");
    }

    public void service() {
        System.out.println("The car is serviced");
    }

    // Main method
    public static void main(String[] args) {
        // Using the default constructor
        car1 c1 = new car1();
        c1.color = "Red";
        c1.brand = "Kia";
        c1.fuelType = "Diesel";
        c1.mileage = 24;

        // Displaying the attributes
        System.out.println("Color: " + c1.color);
        System.out.println("Brand: " + c1.brand);
        System.out.println("Fuel Type: " + c1.fuelType);
        System.out.println("Mileage: " + c1.mileage);
	
	car1 c2 = new car1();
        c2.color = "black";
        c2.brand = "hyundai";
        c2.fuelType = "Diesel";
        c2.mileage = 20;

        // Displaying the attributes
        System.out.println("Color: " + c2.color);
        System.out.println("Brand: " + c2.brand);
        System.out.println("Fuel Type: " + c2.fuelType);
        System.out.println("Mileage: " + c2.mileage);

	car1 c3 = new car1();
        c3.color = "grey";
        c3.brand = "BMW";
        c3.fuelType = "Diesel";
        c3.mileage = 30;

        // Displaying the attributes
        System.out.println("Color: " + c3.color);
        System.out.println("Brand: " + c3.brand);
        System.out.println("Fuel Type: " + c3.fuelType);
        System.out.println("Mileage: " + c3.mileage);
    }
}
