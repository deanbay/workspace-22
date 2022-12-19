//import java.util;
import java.util.ArrayList;
import java.util.List;

public class AnalysisOfAlgorithms2 {

	public static ArrayList<Float> testing(ArrayList<Float> X) {

		if (X == null || X.size() == 0 ){
		return null;	
		}
		
		int j = X.size();
		float s = 0;

		// double[] X = { 7, 3, -1, 2, 9, 0, 0.8, 52, 2.2, 900 };
		ArrayList<Float> A = new ArrayList<Float>();
		for (int i = 0; i < j; ++i) {
			s = s + X.get(i);
			if (j <= i) {
				s = (i + X.get(i));
			}

			A.add(s / (i + 1));
			System.out.println(A);
		}
		return A;
		
	}

	public static void main(String[] args) {
		ArrayList<Float> X = new ArrayList<Float>();

	    X.add((float) 1);
	        X.add((float) 2);
	        X.add((float) 3);
	        X.add((float) 4);
	        X.add((float) 2);
		
			float array[] = new float[] { 7, 3, -1, 2, 9, 0, 0.8f, 52, 2.2f, 900 };
			System.out.println(testing(X));
			System.out.println(array);

	}
}
