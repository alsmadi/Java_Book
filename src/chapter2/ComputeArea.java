package chapter2;

public class ComputeArea {

    static int k;
    
    public static void main(String[] args) {
        
        
        k=700;
        byte b= (byte)k;
        double radius; // Declare radius
        double area; // Declare area

        // Assign a radius
        radius = 20; // New value is radius

        // Compute area
        area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius "
                + radius + " is " + area);
    }
}
