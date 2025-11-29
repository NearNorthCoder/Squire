/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mta.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum8
extends Enum<c> {
    private final  int childID = 6;
    private static final  c[] $VALUES;
    
    private final  int parentID;
    
    public static final  /* enum */ c ALCHEMY;
    public static final  /* enum */ c TELEKENETIC;
    public static final  /* enum */ c ENCHANTMENT;
    public static final  /* enum */ c GRAVEYARD;
    private final  String teleportObject;

    static {
        c.lIIIllIIlllIIIl();
        c.lIIIllIIlllIIII();
        GRAVEYARD = new GameEnum8(lllIllIIIlIl[lllIllIIIllI[2]], lllIllIIIllI[3]);
        TELEKENETIC = new GameEnum8(lllIllIIIlIl[lllIllIIIllI[5]], lllIllIIIllI[6]);
        ALCHEMY = new GameEnum8(lllIllIIIlIl[lllIllIIIllI[8]], lllIllIIIllI[9]);
        ENCHANTMENT = new GameEnum8(lllIllIIIlIl[lllIllIIIllI[10]], lllIllIIIllI[11]);
        c[] cArray = new c[lllIllIIIllI[7]];
        cArray[c.lllIllIIIllI[1]] = GRAVEYARD;
        cArray[c.lllIllIIIllI[2]] = TELEKENETIC;
        cArray[c.lllIllIIIllI[4]] = ALCHEMY;
        cArray[c.lllIllIIIllI[5]] = ENCHANTMENT;
        $VALUES = cArray;
    }

    private GameEnum8(String string2, int n3) {
        this.childID = lllIllIIIllI[0];
        this.parentID = n3;
        this.teleportObject = string2;
    }

    public int h() {
        Objects.requireNonNull(this);

        return lllIllIIIllI[0];
    }

    private static void lIIIllIIlllIIII() {
        lllIllIIIlIl = new String[lllIllIIIllI[12]];
        c.lllIllIIIlIl[c.lllIllIIIllI[1]] = "GRAVEYARD";
        c.lllIllIIIlIl[c.lllIllIIIllI[2]] = "Graveyard Teleport";
        c.lllIllIIIlIl[c.lllIllIIIllI[4]] = "TELEKENETIC";
        c.lllIllIIIlIl[c.lllIllIIIllI[5]] = "Telekinetic Teleport";
        c.lllIllIIIlIl[c.lllIllIIIllI[7]] = "ALCHEMY";
        c.lllIllIIIlIl[c.lllIllIIIllI[8]] = "Alchemists Teleport";
        c.lllIllIIIlIl[c.lllIllIIIllI[0]] = "ENCHANTMENT";
        c.lllIllIIIlIl[c.lllIllIIIllI[10]] = "Enchanters Teleport";
    }

    private static boolean lIIIllIIlllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

        return String.valueOf(var1);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public String g() {
        return this.teleportObject;
    }

    public int f() {
        return this.parentID;
    }
}

