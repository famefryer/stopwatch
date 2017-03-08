package stopwatch;
/**
 * Tasktimer is the class that used for elapsed time.
 * 
 * @author Triwith Mutitakul
 *
 */
public class TaskTimer {
	private Stopwatch timer;

	/**
	 * The Constructor
	 */
	public TaskTimer() {
		this.timer = new Stopwatch();
	}

	/**
	 * Elapsed time.and print the information of each data speedtest.
	 * 
	 * @param task
	 *            is the variable that get the class who implements the Runnable
	 *            class.
	 */
	public void measureAndPrint(Runnable task) {
		timer.start();
		task.run();
		timer.stop();
		System.out.println(task.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}

}
