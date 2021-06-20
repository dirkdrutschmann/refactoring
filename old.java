package refactor;

public class Refactoring {

	public static void main(String[] args) {
		double u = 3.49;
		double[] m = {1.29, 2.49, 4.18, 5.79};
		for(int n = 0; n < m.length; n++) {
			System.out.println("Bruttopreis: " + m[n] + " Nettopreis:" + y(m[n]));
			if(x(u,m[n]) > 0) {
				System.out.println("higher");
			}
			else if (x(u,m[n])< 0) {
				System.out.println("lower");
			}
			else {
				System.out.println("ewuals");
			}
			
		}
		
	}
	
	public static double x (double y, double z){
	    if(y > z){
	        return -1;
	    }
	    else if (z > y){
	        return 1;
	    }
	    else{
	        return 0;
	    }
	}
	
	
	
	public static double y (double z){
		return z/1.19;
		
	}
	
	
	
}
