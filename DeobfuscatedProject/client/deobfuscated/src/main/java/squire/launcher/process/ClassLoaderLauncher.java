/*
 * Deobfuscated from: c/r/m/J.java
 * Original class name: J
 * Purpose: Launches the client using a custom URLClassLoader
 */
package squire.launcher.process;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collection;
import java.util.List;
import javax.swing.UIManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import squire.launcher.ui.LauncherFrame;

/**
 * Launches the RuneLite client using a custom URLClassLoader.
 * This allows loading client JARs in isolation from the launcher.
 */
public final class ClassLoaderLauncher {

    private static final Logger log = LoggerFactory.getLogger(ClassLoaderLauncher.class);

    /**
     * UIManager key for storing the class loader reference
     */
    private static final String CLASSLOADER_KEY = "runelite.classloader";

    /**
     * Thread name for the client thread
     */
    private static final String THREAD_NAME = "Client";

    /**
     * Launches the client with the given JAR files and arguments.
     *
     * @param jarFiles List of JAR files to include in classpath
     * @param clientArgs Collection of command line arguments for the client
     * @throws Exception if launching fails
     */
    public static void launch(List<File> jarFiles, Collection<String> clientArgs) throws Exception {
        // Create URL array from JAR files
        URL[] urls = new URL[jarFiles.size()];
        int index = 0;

        for (File jarFile : jarFiles) {
            log.debug("Adding to classpath: {}", jarFile);
            urls[index++] = jarFile.toURI().toURL();
        }

        // Create classloader with platform classloader as parent
        ClassLoader parentLoader = ClassLoader.getPlatformClassLoader();
        URLClassLoader clientClassLoader = new URLClassLoader(urls, parentLoader);

        // Store reference in UIManager for later access
        UIManager.put(CLASSLOADER_KEY, clientClassLoader);

        // Create and start the client thread
        ClientThread clientThread = new ClientThread(clientClassLoader, clientArgs);
        clientThread.setName(THREAD_NAME);
        clientThread.start();

        // Close the launcher frame
        LauncherFrame.close();
    }

    // Private constructor to prevent instantiation
    private ClassLoaderLauncher() {
    }
}
