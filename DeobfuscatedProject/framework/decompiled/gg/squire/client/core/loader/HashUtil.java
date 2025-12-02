/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 */
package gg.squire.client.core.loader;

import gg.squire.client.Squire;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import javax.inject.Singleton;

@Singleton
public class HashUtil {
    private String hash;

    public String getCurrentHash() {
        Path file = Path.of(Squire.SQUIRE_HOME.getAbsolutePath(), "client.jar");
        return this.hash != null ? this.hash : (this.hash = this.calculateHash(file));
    }

    public String calculateHash(Path path) {
        try {
            if (!Files.exists(path, new LinkOption[0])) {
                return null;
            }
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] hash = md.digest(Files.readAllBytes(path));
            StringBuilder sb = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                sb.append(String.format("%02x", b & 0xFF));
            }
            return sb.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
