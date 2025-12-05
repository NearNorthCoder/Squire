/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

public class OPRSExternalPluginFileFilter
implements FileFilter {
    private static final List<String> blacklist = Arrays.asList(".git", "build", "target", "release");
    private static final List<String> buildFiles = Arrays.asList("%s.gradle.kts", "%s.gradle");

    @Override
    public boolean accept(File pathName) {
        if (!pathName.isDirectory()) {
            return false;
        }
        String dirName = pathName.getName();
        if (blacklist.contains(dirName)) {
            return false;
        }
        if (!new File(pathName, "build/tmp/jar/MANIFEST.MF").exists()) {
            return false;
        }
        for (String buildFile : buildFiles) {
            if (!new File(pathName, String.format(buildFile, dirName)).exists()) continue;
            return true;
        }
        return false;
    }
}

