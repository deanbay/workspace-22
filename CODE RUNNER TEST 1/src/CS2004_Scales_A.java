import java.util.ArrayList;

class CS2004_TSP_A{
	
public static ArrayList<Integer> RunTSP(int iterations, float distances[][]){

	ArrayList<Integer> OutputAnswer = new ArrayList<Integer>();
	
	
	if (distances == null) {
		return null;
	}
	if  (distances.length == 0) {
		return OutputAnswer;
	}
	
	if (iterations < 0) {
		return null;
	}
	
	return OutputAnswer;
	
	
}

}























/*import java.util.ArrayList;

class CS2004_Scales_A {
public static void main(String Args[]) {	

int iterations = -1;
ArrayList<Double> weights = new ArrayList<Double>();
	weights=null;
RunScales(iterations, weights);


}
	public static ArrayList<Long> RunScales(int iterations, ArrayList<Double> weights) {
		ArrayList<Long> al = new ArrayList<>();
		if (weights == null) {
		
					return al;
		}

		if (weights.isEmpty()) {
			return al;
		}
		if (iterations < 0) {
			return al;
		}
		return al;

	}
}

*/




