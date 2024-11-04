package jsandactions;

public class farenheighttoCentigrade {
	
	public static double F2C(double F) {
		double C=((F-32)*5)/9.0;
		return C;
		
	}
	
	public static void main(String[]args) {
		double A=21;
		double B=27;
		double X=F2C(A);
		double Y=F2C(B);
		System.out.println("F2C");
		System.out.println(" "+A+": "+X);
		System.out.println(" "+B+": "+Y);
	}
}
