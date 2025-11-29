/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package gg.squire.toa.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

public final class GameEnum10
extends Enum<i> {
    private final  int regionY;
    public static final  /* enum */ i DEATH;
    private final  int objectId;
    public static final  /* enum */ i AIR;
    private final  int regionX;
    public static final  /* enum */ i LIGHTNING;
    
    public static final  /* enum */ i FIRE;
    
    private static final  i[] $VALUES;

    private static boolean lIllIlIlIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum10.class, string);
    }

    private static void lIllIlIlIlIlllI() {
        lIIllllllIIll = new String[lIIllllllIlII[13]];
        i.lIIllllllIIll[i.lIIllllllIlII[0]] = "DEATH";
        i.lIIllllllIIll[i.lIIllllllIlII[1]] = "FIRE";
        i.lIIllllllIIll[i.lIIllllllIlII[8]] = "LIGHTNING";
        i.lIIllllllIIll[i.lIIllllllIlII[11]] = "AIR";
    }

    public int m() {
        return this.objectId;
    }

    /*
     * WARNING - void declaration
     */
    public static i a(int n2) {
        void var1;
        i[] iArray = i.values();
        int n3 = iArray.length;
        int var2 = lIIllllllIlII[0];
        while (i.lIllIlIlIllIIII(var2, (int)var1)) {
            int var3;
            void var4;
            void var5 = var4[var2];
            if (i.lIllIlIlIllIIIl(var5.m(), var3)) {
                return var5;
            }
            ++var2;

            if (((0 ^ 0x51) & ~(0x56 ^ 7)) == 0) continue;
            return null;
        }
        return null;
    }

    private GameEnum10(int n3, int n4, int n5) {
        this.objectId = n3;
        this.regionX = n4;
        this.regionY = n5;
    }

    private static boolean lIllIlIlIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    static {
        i.lIllIlIlIlIllll();
        i.lIllIlIlIlIlllI();
        DEATH = new GameEnum10(lIIllllllIlII[3], lIIllllllIlII[4], lIIllllllIlII[5]);
        FIRE = new GameEnum10(lIIllllllIlII[6], lIIllllllIlII[7], lIIllllllIlII[5]);
        LIGHTNING = new GameEnum10(lIIllllllIlII[9], lIIllllllIlII[4], lIIllllllIlII[10]);
        AIR = new GameEnum10(lIIllllllIlII[12], lIIllllllIlII[7], lIIllllllIlII[10]);
        i[] iArray = new i[lIIllllllIlII[13]];
        iArray[i.lIIllllllIlII[0]] = DEATH;
        iArray[i.lIIllllllIlII[1]] = FIRE;
        iArray[i.lIIllllllIlII[8]] = LIGHTNING;
        iArray[i.lIIllllllIlII[11]] = AIR;
        $VALUES = iArray;
    }

    public WorldPoint a(Client client) {
        RegionPoint regionPoint = new RegionPoint(this.regionX, this.regionY, lIIllllllIlII[1], lIIllllllIlII[2]);
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)regionPoint.toWorld());
        return collection.stream().findFirst().orElse(null);
    }

        return String.valueOf(var6);
    }
}

