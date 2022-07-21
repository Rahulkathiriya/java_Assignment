package Module2_oops_assignment;

class Complex {

	int real;
	int imaginary;

	Complex() {

	}

	Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	Complex addCom(Complex c1, Complex c2) {
		Complex temp = new Complex();

		temp.real = c1.real + c2.real;
		
		
		temp.imaginary = c1.imaginary + c2.imaginary;

		return temp;
	}
}

public class As08_sum_two_complex_number {

	public static void main(String[] args) {

		Complex c1 = new Complex(12, 45);

		System.out.println("Complex Number 1 : " + c1.real + " + i" + c1.imaginary);

		Complex c2 = new Complex(11,22);
		
		System.out.println("Complex Number 2: "+c2.real+" + i"+c2.imaginary);

		Complex c3 = new Complex();
		
		c3 = c3.addCom(c1, c2);
		
		System.out.println("Sum of Complex number is : "+c3.real+" + i"+c3.imaginary);
		
		
	}
}
