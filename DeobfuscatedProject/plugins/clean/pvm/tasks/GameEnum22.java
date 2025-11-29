/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package gg.squire.pvm.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;

public final class GameEnum22
extends Enum<d> {
    private final  int itemID;
    private final  Predicate<Item> test;
    public static final  /* enum */ d ANTIPOISON;
    public static final  /* enum */ d SUPERANTIPOISON;
    public static final  /* enum */ d ANTIDOTE;

    private static final  d[] $VALUES;

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum22.class, string);
    }

    private static void lIlIlllIlIIlIlI() {
        lIIllIIIIIllI = new String[lIIllIIIIIlll[9]];
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[0]] = "Antidote+";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[1]] = "Superantipoison";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[2]] = "Antipoison";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[3]] = "ANTIPOISON";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[5]] = "SUPERANTIPOISON";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[7]] = "ANTIDOTE";
    }

        return String.valueOf(var1);
    }

    static {
        d.lIlIlllIlIIlIll();
        d.lIlIlllIlIIlIlI();
        ANTIPOISON = new GameEnum22(item -> item.getName().startsWith(lIIllIIIIIllI[lIIllIIIIIlll[2]]), lIIllIIIIIlll[4]);
        SUPERANTIPOISON = new GameEnum22(item -> item.getName().startsWith(lIIllIIIIIllI[lIIllIIIIIlll[1]]), lIIllIIIIIlll[6]);
        ANTIDOTE = new GameEnum22(item -> item.getName().startsWith(lIIllIIIIIllI[lIIllIIIIIlll[0]]), lIIllIIIIIlll[8]);
        d[] dArray = new d[lIIllIIIIIlll[3]];
        dArray[d.lIIllIIIIIlll[0]] = ANTIPOISON;
        dArray[d.lIIllIIIIIlll[1]] = SUPERANTIPOISON;
        dArray[d.lIIllIIIIIlll[2]] = ANTIDOTE;
        $VALUES = dArray;
    }

    private GameEnum22(Predicate<Item> predicate, int n3) {
        this.test = predicate;
        this.itemID = n3;
    }

    private static boolean lIlIlllIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    public Predicate<Item> u() {
        return this.test;
    }

    public int v() {
        return this.itemID;
    }
}

