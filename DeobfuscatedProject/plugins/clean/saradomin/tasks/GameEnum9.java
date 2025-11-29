/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 */
package gg.squire.saradomin.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;

public final class GameEnum9
extends Enum<k> {
    private final  int animation;
    private static final  k[] $VALUES;
    private final  Prayer protection;
    public static final  /* enum */ k BREE;
    private final  int projectile;
    public static final  /* enum */ k STARLIGHT;
    private final  int id;
    public static final  /* enum */ k GROWLER;

    static {
        k.lIlIlIlIlIIllll();
        k.lIlIlIlIlIIlIIl();
        BREE = new GameEnum9(lIIlIIlllIlIl[1], Prayer.PROTECT_FROM_MISSILES, lIIlIIlllIlIl[2], lIIlIIlllIlIl[3]);
        GROWLER = new GameEnum9(lIIlIIlllIlIl[5], Prayer.PROTECT_FROM_MAGIC, lIIlIIlllIlIl[6], lIIlIIlllIlIl[7]);
        STARLIGHT = new GameEnum9(lIIlIIlllIlIl[9], Prayer.PROTECT_FROM_MELEE, lIIlIIlllIlIl[10], lIIlIIlllIlIl[11]);
        k[] kArray = new k[lIIlIIlllIlIl[12]];
        kArray[k.lIIlIIlllIlIl[0]] = BREE;
        kArray[k.lIIlIIlllIlIl[4]] = GROWLER;
        kArray[k.lIIlIIlllIlIl[8]] = STARLIGHT;
        $VALUES = kArray;
    }

    public int D() {
        return this.id;
    }

    /*
     * WARNING - void declaration
     */
    public static k c(NPC nPC) {
        void var1;
        k[] kArray = k.values();
        int n2 = kArray.length;
        int var2 = lIIlIIlllIlIl[0];
        while (k.lIlIlIlIlIlIIII(var2, (int)var1)) {
            NPC var3;
            void var4;
            void var5 = var4[var2];
            if (k.lIlIlIlIlIlIIIl(var5.D(), var3.getId())) {
                return var5;
            }
            ++var2;

            if (((0x3F ^ 0x69) & ~(0xF2 ^ 0xA4)) < 1) continue;
            return null;
        }
        return null;
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }

    public Prayer E() {
        return this.protection;
    }

    public int G() {
        return this.animation;
    }

    private GameEnum9(int n3, Prayer prayer, int n4, int n5) {
        this.id = n3;
        this.protection = prayer;
        this.projectile = n4;
        this.animation = n5;
    }

    private static boolean lIlIlIlIlIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIlIlIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    public int F() {
        return this.projectile;
    }

    private static void lIlIlIlIlIIlIIl() {
        lIIlIIlllIIll = new String[lIIlIIlllIlIl[12]];
        k.lIIlIIlllIIll[k.lIIlIIlllIlIl[0]] = "BREE";
        k.lIIlIIlllIIll[k.lIIlIIlllIlIl[4]] = "GROWLER";
        k.lIIlIIlllIIll[k.lIIlIIlllIlIl[8]] = "STARLIGHT";
    }

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
    }

    /*
     * WARNING - void declaration
     */
    public static k a(Projectile projectile) {
        void var6;
        k[] kArray = k.values();
        int n2 = kArray.length;
        int var7 = lIIlIIlllIlIl[0];
        while (k.lIlIlIlIlIlIIII(var7, (int)var6)) {
            Projectile var8;
            void var9;
            void var10 = var9[var7];
            if (k.lIlIlIlIlIlIIIl(var10.F(), var8.getId())) {
                return var10;
            }
            ++var7;

            if (-1 < 3) continue;
            return null;
        }
        return null;
    }

        return String.valueOf(var11);
    }
}

