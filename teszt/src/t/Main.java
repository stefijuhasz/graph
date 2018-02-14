package t;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2DRowRealMatrix test = new Array2DRowRealMatrix(2,2);
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				test.setEntry(i, j, 1000000000);
			}
		}
		
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println(test.getEntry(i, i));;
			}
		}
		
		String n = "x15";
		String[] split = n.split("x");
		System.out.println(split[1]);
	}

}
