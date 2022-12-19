import java.util.ArrayList;
import java.util.*;

public class ScaleFitness {

	public static double ScalesFitness(ArrayList<Boolean> rep, ArrayList<Double> weights) {

		if (rep == null || weights == null) {
			return -100;
		} 
		
		if(rep.size() == 0 || weights.size() == 0 || rep.size() > weights.size())
		{
			return -100;
		}
		 
			double lhs = 0.0, rhs = 0.0;
			int n = rep.size();

			for (int i = 0; i < n; i++) {
				if (rep.get(i) == true) {
					lhs = lhs + weights.get(i);
					
				} else {
					rhs = rhs + weights.get(i);
				}
			}
			System.out.println(lhs-rhs);
			return (Math.abs(lhs - rhs));
	}

	public static void main(String[] args) {

		ArrayList<Double> weights = new ArrayList<>();
		weights.add(1.0);
		weights.add(2.0);
		weights.add(3.0);
		weights.add(4.0);
		weights.add(10.0);
		weights.add(7.0);
		weights.add(15.0);
		weights.add(20.0);
		weights.add(24.0);
		weights.add(28.0);
		ArrayList<Boolean> rep = new ArrayList<Boolean>();
		rep.add(true);
		rep.add(false);
		rep.add(true);
		rep.add(false);
		rep.add(true);
		rep.add(false);
		//System.out.println(rep);
		//System.out.println(weights);
		ScalesFitness(rep, weights);
	}
}
