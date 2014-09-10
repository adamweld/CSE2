// Adam Weld
// Tue 09 Sep 2014 07:55:31 PM EDT

public class TestTest{
	public static double truncate(double x){
		x *= 100;
		int n = (int)x;
		double d = (double)n / 100;
		return d;
	}
	public static void main(String[] args){
		double value = 1234.6283;
		System.out.println("text: "+truncate(value));
	}
}
