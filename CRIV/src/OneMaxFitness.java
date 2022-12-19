import java.util.ArrayList;

public class OneMaxFitness {

	public static double OneMaxFitness (ArrayList<Integer> rep){
		if (rep == null || rep.size() == 0) {
			return -1;
		
	}

	for (Integer integer: rep) {
		if (integer < 0 || integer > 1) {
			return -2;
		}
	}

	double fitness = 0.0;
	for (Integer integer: rep) {
		fitness += integer;
	}
	return fitness;

	}

	
	public static void main (String [] args) {
		
	//	ArrayList<Interger> weights = new ArrayList<>();
		
		
	} 
}
