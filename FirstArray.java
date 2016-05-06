import java.util.Scanner;
public class FirstArray {
	
	public void setUpArray() {
		Scanner keys = new Scanner(System.in);
		int size = 20;
		double[] firstArray = new double[size];
		for (int index = 0; index < firstArray.length; index++) {
			firstArray[index] = keys.nextDouble();
			}
		for (double value : firstArray) {
			System.out.println(value);
			}
		}
	
	public static void main (String[] args) {
		FirstArray demo = new FirstArray();
		demo.setUpArray();	
		
		}
	
	}
