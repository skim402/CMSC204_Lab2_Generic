
public class DataSetGen<T extends Measurable> {

	private double sum;
	private T maximum;
	private int count;
	
	public DataSetGen() {
 
	    count = 0;
	    maximum = null;
	}
	
	public void add(T x) {
		sum = sum + x.getMeasure();
		if (count == 0 || maximum.getMeasure() < x.getMeasure())
			maximum = x;
		count++;
	}
	
	public double getAverage() {
		if (count == 0) return 0;
		else return sum / count;
	}
	
	public T getMaximum() {
		return maximum;
	}
	
	public double getMeasure() {
		return maximum.getMeasure();
	}

}
