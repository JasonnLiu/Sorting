package Example;

public class Timer {
	
	double time ;
	
	public Timer(){
		time = System.currentTimeMillis();
	}
	
	public double stop(){
		return System.currentTimeMillis() - time;
	}

}
