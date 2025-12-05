/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 */
package gg.squire.client.core.loader;

import com.google.common.io.ByteStreams;
import com.google.inject.Singleton;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class SquireResources {
    private static final Logger log = LoggerFactory.getLogger(SquireResources.class);
    private static final Map<String, byte[]> RESOURCE_MAP = new HashMap<String, byte[]>();

    public static BufferedImage loadImage(Class<?> clazz, String name) {
        BufferedImage bufferedImage;
        String pckg = clazz.getPackage().getName().replace(".", "/");
        ByteArrayInputStream bis = new ByteArrayInputStream(SquireResources.bytes(pckg + "/" + name));
        try {
            bufferedImage = ImageIO.read(bis);
        }
        catch (Throwable throwable) {
            try {
                try {
                    bis.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException e) {
                log.warn("Unable to load image {}", (Object)name, (Object)e);
                return null;
            }
        }
        bis.close();
        return bufferedImage;
    }

    public static byte[] bytes(String entry) {
        return RESOURCE_MAP.get(entry);
    }

    public static void clear() {
        RESOURCE_MAP.clear();
    }

    public static void load(String name, InputStream resource) {
        try {
            byte[] bytes = ByteStreams.toByteArray(resource);
            RESOURCE_MAP.put(name, bytes);
        }
        catch (IOException e) {
            log.warn("Unable to load resource {}", (Object)resource, (Object)e);
        }
    }
}

