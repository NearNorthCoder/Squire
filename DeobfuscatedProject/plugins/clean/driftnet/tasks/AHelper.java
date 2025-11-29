/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.driftnet.tasks;

import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;

@Singleton
public class AHelper {

    private  int j;

    public int i() {
        return this.j;
    }

    @Subscribe
    public void AHelper(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (a.llIlIlIIIIllIl(string.contains(lIlIIIIllIII[lIlIIIIllIIl[0]]) ? 1 : 0)) {
            this.j += lIlIIIIllIIl[1];
        }
    }

    static {
        a.llIlIlIIIIllII();
        a.llIlIlIIIIlIlI();
    }

    private static boolean llIlIlIIIIllIl(int n) {
        return n != 0;
    }

    public void h() {
        this.j = lIlIIIIllIIl[0];
    }

    private static void llIlIlIIIIlIlI() {
        lIlIIIIllIII = new String[lIlIIIIllIIl[1]];
        a.lIlIIIIllIII[a.lIlIIIIllIIl[0]] = "You caught some fish";
    }
}

