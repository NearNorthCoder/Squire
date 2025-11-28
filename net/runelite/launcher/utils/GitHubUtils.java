/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.launcher.utils;

import java.io.IOException;
import net.runelite.launcher.SquireSplashScreen;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

public class GitHubUtils {
    private static final GitHub GITHUB;

    public static GHRepository getRepo() {
        try {
            return GITHUB.getRepository("sqire/Squire-hosting");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        try {
            GITHUB = GitHub.connectAnonymously();
        }
        catch (IOException e) {
            SquireSplashScreen.init(null);
            SquireSplashScreen.setError("Error connecting to GitHub!", "We couldn't connect to the GitHub repository.");
            throw new RuntimeException(e);
        }
    }
}
