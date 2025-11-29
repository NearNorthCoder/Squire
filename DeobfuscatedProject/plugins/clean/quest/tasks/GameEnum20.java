/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.quest.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum20
extends Enum<h> {

    public static final  /* enum */ h TUTORIAL_ISLAND;
    private final  String questName;
    private static final  h[] $VALUES;

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum20.class, string);
    }

    private static void lIlllIIIlIlIllI() {
        lIlIIIllllIIl = new String[lIlIIIllllIlI[2]];
        h.lIlIIIllllIIl[h.lIlIIIllllIlI[0]] = "TUTORIAL_ISLAND";
        h.lIlIIIllllIIl[h.lIlIIIllllIlI[1]] = "Tutorial Island";
    }

    static {
        h.lIlllIIIlIlIlll();
        h.lIlllIIIlIlIllI();
        TUTORIAL_ISLAND = new GameEnum20(lIlIIIllllIIl[lIlIIIllllIlI[1]]);
        h[] hArray = new h[lIlIIIllllIlI[1]];
        hArray[h.lIlIIIllllIlI[0]] = TUTORIAL_ISLAND;
        $VALUES = hArray;
    }

    private GameEnum20(String string2) {
        this.questName = string2;
    }
}

