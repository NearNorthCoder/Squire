/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 */
package gg.squire.bandos.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;

public final class GameEnum
extends Enum<b> {
    
    public static final  /* enum */ b STEELWILL;
    private static final  b[] $VALUES;
    public static final  /* enum */ b STRONGSACK;
    
    private final  int animation;
    private final  Prayer protection;
    private final  int id;
    public static final  /* enum */ b GRIMSPIKE;
    private final  int projectile;

    private static boolean lIlIllIllIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIllIlIIIIII() {
        lllIIIIlIIl = new String[lllIIIlIIII[12]];
        b.lllIIIIlIIl[b.lllIIIlIIII[0]] = "STRONGSACK";
        b.lllIIIIlIIl[b.lllIIIlIIII[4]] = "STEELWILL";
        b.lllIIIIlIIl[b.lllIIIlIIII[8]] = "GRIMSPIKE";
    }

        return String.valueOf(var1);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean lIlIllIllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static b a(Projectile projectile) {
        void var2;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var3 = lllIIIlIIII[0];
        while (b.lIlIllIllIIIII(var3, (int)var2)) {
            Projectile var4;
            void var5;
            void var6 = var5[var3];
            if (b.lIlIllIllIIIIl(var6.f(), var4.getId())) {
                return var6;
            }
            ++var3;

            if ((0x2B ^ 0x2F) == (0x1E ^ 0x1A)) continue;
            return null;
        }
        return null;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public int f() {
        return this.projectile;
    }

    private GameEnum(int n3, Prayer prayer, int n4, int n5) {
        this.id = n3;
        this.protection = prayer;
        this.projectile = n4;
        this.animation = n5;
    }

    /*
     * WARNING - void declaration
     */
    public static b a(NPC nPC) {
        void var7;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var8 = lllIIIlIIII[0];
        while (b.lIlIllIllIIIII(var8, (int)var7)) {
            NPC var9;
            void var10;
            void var11 = var10[var8];
            if (b.lIlIllIllIIIIl(var11.d(), var9.getId())) {
                return var11;
            }
            ++var8;

            if (1 < 2) continue;
            return null;
        }
        return null;
    }

    public int d() {
        return this.id;
    }

    public Prayer e() {
        return this.protection;
    }

    static {
        b.lIlIllIlIlllll();
        b.lIlIllIlIIIIII();
        STRONGSACK = new GameEnum(lllIIIlIIII[1], Prayer.PROTECT_FROM_MELEE, lllIIIlIIII[2], lllIIIlIIII[3]);
        STEELWILL = new GameEnum(lllIIIlIIII[5], Prayer.PROTECT_FROM_MAGIC, lllIIIlIIII[6], lllIIIlIIII[7]);
        GRIMSPIKE = new GameEnum(lllIIIlIIII[9], Prayer.PROTECT_FROM_MISSILES, lllIIIlIIII[10], lllIIIlIIII[11]);
        b[] bArray = new b[lllIIIlIIII[12]];
        bArray[b.lllIIIlIIII[0]] = STRONGSACK;
        bArray[b.lllIIIlIIII[4]] = STEELWILL;
        bArray[b.lllIIIlIIII[8]] = GRIMSPIKE;
        $VALUES = bArray;
    }

    public int g() {
        return this.animation;
    }

}

