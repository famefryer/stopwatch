package stopwatch;
/**
 * Main class of Speedtest program . Called the object to compare speed.
 * 
 * @author Triwith Mutitakul
 *
 */
public class Main {
	/**
	 * Run the tasks.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int counter = 1000000000;
		TaskTimer task = new TaskTimer();
		;
		AppendToString g = new AppendToString(50000);
		task.measureAndPrint(g);
		task.measureAndPrint(new AppendToString(100000));
		task.measureAndPrint(new AppendToStringBuilder(100000));
		task.measureAndPrint(new SumDoublePrimitive(counter));
		task.measureAndPrint(new SumDouble(counter));
		task.measureAndPrint(new SumBigDecimal(counter));

	}

}
