/*
 * Deobfuscated from: c/r/m/K.java
 * Original class name: K
 * Purpose: Thread that launches the main client via reflection
 */
package squire.launcher.process;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URLClassLoader;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Thread responsible for launching the RuneLite/Unethicalite client.
 * Uses reflection to invoke the main class's main() method.
 */
public class ClientThread extends Thread {

    private static final Logger log = LoggerFactory.getLogger(ClientThread.class);

    /**
     * The main class to invoke (RuneLite client entry point)
     */
    private static final String MAIN_CLASS = "net.runelite.client.RuneLite";

    /**
     * The main method name
     */
    private static final String MAIN_METHOD = "main";

    /**
     * ClassLoader containing the client JARs
     */
    private final URLClassLoader classLoader;

    /**
     * Command line arguments to pass to the client
     */
    private final Collection<String> clientArgs;

    /**
     * Creates a new client thread.
     *
     * @param classLoader The URLClassLoader containing client JARs
     * @param clientArgs The command line arguments to pass to the client
     */
    public ClientThread(URLClassLoader classLoader, Collection<String> clientArgs) {
        this.classLoader = classLoader;
        this.clientArgs = clientArgs;
    }

    /**
     * Runs the client by invoking its main() method via reflection.
     */
    @Override
    public void run() {
        try {
            // Create temp file for process ID tracking
            File tempFile = File.createTempFile(
                "squire-",
                String.valueOf(ProcessHandle.current().pid()),
                null  // Use default temp directory
            );
            tempFile.deleteOnExit();

            // Load the main class
            Class<?> mainClass = classLoader.loadClass(MAIN_CLASS);

            // Get the main method
            Method mainMethod = mainClass.getMethod(MAIN_METHOD, String[].class);

            // Invoke main with the client arguments
            String[] argsArray = clientArgs.toArray(new String[0]);
            mainMethod.invoke(null, (Object) argsArray);

        } catch (Exception e) {
            log.error("Failed to launch client", e);
        }
    }
}
