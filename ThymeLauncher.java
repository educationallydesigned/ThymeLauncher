import java.lang.ProcessBuilder;

/**
 * The launcher allows the starting of the game under a different version of Java.
 */
public class Launcher {
	static final String JAR = "game/run.jar";
	static final String JRE_DIR = "jre";

	/**
	 * Starts the game under a different version of java.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		ProcessBuilder game = new ProcessBuilder();
		game.inheritIO();
		game.command(JRE_DIR + "/bin/java", "-jar", JAR);
		game.start();
	}
}