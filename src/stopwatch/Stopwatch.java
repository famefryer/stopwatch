package stopwatch;

/**
 * The class that use for measures elapsed time.
 * 
 * @author Triwith Mutitakul
 * @version 1.0
 */

public class Stopwatch {
	private long startTime;
	private long stopTime;
	private boolean running;
	private static final double NANOSECONDS = 1.0E-9;

	/**
	 * The contructor of stopwatch.
	 */
	public Stopwatch() {

	}

	/**
	 * This method is use for start the stopwatch.
	 */
	public void start() {
		if (!isRunning()) {
			this.startTime = System.nanoTime();
			running = true;
		}
	}

	/**
	 * This method is use for stop the stopwatch.
	 */
	public void stop() {
		if (isRunning()) {
			this.stopTime = System.nanoTime();
			running = false;
		}

	}

	/**
	 * 
	 * This method is use for return the elapsed time.
	 * 
	 * @return return the elapsed time.
	 */
	public double getElapsed() {
		if (isRunning()) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		} else {
			return (stopTime - startTime) * NANOSECONDS;
		}
	}

	/**
	 * This method is use for check the stopwatch is running or not.
	 * 
	 * @return true if stopwatch is running,return false if stopwatch is stop.
	 */
	public boolean isRunning() {
		return running;
	}

}
