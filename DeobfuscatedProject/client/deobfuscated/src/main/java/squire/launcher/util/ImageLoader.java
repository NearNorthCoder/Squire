/*
 * Deobfuscated from: c/r/m/p.java
 * Original class name: p
 * Purpose: Utility for loading images from resources
 */
package squire.launcher.util;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class for loading images from classpath resources.
 * Thread-safe image loading using synchronized ImageIO access.
 */
public final class ImageLoader {
    private static final Logger log = LoggerFactory.getLogger(ImageLoader.class);

    /**
     * Loads an image from the classpath.
     *
     * @param clazz The class to use for resource loading
     * @param resourcePath The path to the image resource
     * @return The loaded BufferedImage
     * @throws RuntimeException if the image cannot be loaded
     */
    public static BufferedImage loadImage(Class<?> clazz, String resourcePath) {
        try {
            // Synchronize on ImageIO class for thread safety
            synchronized (ImageIO.class) {
                return ImageIO.read(clazz.getResourceAsStream(resourcePath));
            }
        } catch (IOException e) {
            log.error("Failed to load image: {}", resourcePath, e);
            throw new RuntimeException("Failed to load image: " + resourcePath, e);
        }
    }

    // Private constructor to prevent instantiation
    private ImageLoader() {
    }
}
