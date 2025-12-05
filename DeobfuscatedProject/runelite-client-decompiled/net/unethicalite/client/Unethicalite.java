/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.client;

import java.io.File;
import java.util.Objects;
import net.runelite.client.RuneLite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Unethicalite {
    private static final Logger log = LoggerFactory.getLogger(Unethicalite.class);
    public static final File CLIENT_DIR = new File(System.getProperty("user.home"), ".squire");

    public static void main(String[] args) throws Exception {
        RuneLite.main(args);
    }

    private static String getCacheDir() {
        String dir = System.getProperty("unethicalite.cache-dir");
        if (dir != null) {
            return dir;
        }
        return ".squire";
    }

    public static File getCacheDirectory() {
        String dir = Unethicalite.getCacheDir();
        if (Objects.equals(dir, ".squire")) {
            return new File(CLIENT_DIR, "jagexcache");
        }
        File cacheDirs = new File(CLIENT_DIR, "custom-cache");
        return new File(cacheDirs, dir);
    }
}

