// import java.util.*;
// public class OOPSSIX {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner ();

//         Complex clc = new Complex();
//         System.out.println(clc.sum(1,2));
//         System.out.println(clc.diff(1,2));
//         System.out.println(clc.product(1,2));

        
//     }
    
// }

// class Complex {
//     int sum (int a , int b) {
//         return a+b;
//     }

//     int diff ( int a , int b){
//         return a-b;
//     }

//     int product (int a , int b){
//         return a*b;
//     }

// }


import java.util.Scanner;

class Complex {
    private double real;
    private double imag;

    // Constructor to initialize the complex number
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double realPart = (this.real * other.real) - (this.imag * other.imag);
        double imagPart = (this.real * other.imag) + (this.imag * other.real);
        return new Complex(realPart, imagPart);
    }

    // Method to print the complex number
    public void print() {
        System.out.println(this.real + " + " + this.imag + "i");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first complex number
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imag1 = scanner.nextDouble();

        // Input for the second complex number
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imag2 = scanner.nextDouble();

        // Creating two complex number objects
        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        // Performing operations
        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        // Printing results
        System.out.print("Sum: ");
        sum.print();
        System.out.print("Difference: ");
        difference.print();
        System.out.print("Product: ");
        product.print();

        scanner.close();
    }
}
