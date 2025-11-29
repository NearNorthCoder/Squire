/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 */
package gg.squire.zammy.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;

public final class GameEnum16
extends Enum<e> {
    public static final  /* enum */ e TSTANON_KARLAK;
    private final  int id;
    public static final  /* enum */ e BALFRUG_KREEYATH;
    
    private final  int projectile;
    private static final  e[] $VALUES;
    
    private final  int animation;
    public static final  /* enum */ e ZAKLN_GRITCH;
    private final  Prayer protection;

    private GameEnum16(int n3, Prayer prayer, int n4, int n5) {
        this.id = n3;
        this.protection = prayer;
        this.projectile = n4;
        this.animation = n5;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    public int p() {
        return this.projectile;
    }

    private static boolean llIIIlIlIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIlIlIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    static {
        e.llIIIlIlIIlllII();
        e.llIIIlIlIIllIlI();
        TSTANON_KARLAK = new GameEnum16(lIllIIIllIllI[1], Prayer.PROTECT_FROM_MELEE, lIllIIIllIllI[2], lIllIIIllIllI[3]);
        BALFRUG_KREEYATH = new GameEnum16(lIllIIIllIllI[5], Prayer.PROTECT_FROM_MAGIC, lIllIIIllIllI[6], lIllIIIllIllI[7]);
        ZAKLN_GRITCH = new GameEnum16(lIllIIIllIllI[9], Prayer.PROTECT_FROM_MISSILES, lIllIIIllIllI[10], lIllIIIllIllI[11]);
        e[] eArray = new e[lIllIIIllIllI[12]];
        eArray[e.lIllIIIllIllI[0]] = TSTANON_KARLAK;
        eArray[e.lIllIIIllIllI[4]] = BALFRUG_KREEYATH;
        eArray[e.lIllIIIllIllI[8]] = ZAKLN_GRITCH;
        $VALUES = eArray;
    }

    private static void llIIIlIlIIllIlI() {
        lIllIIIllIlIl = new String[lIllIIIllIllI[12]];
        e.lIllIIIllIlIl[e.lIllIIIllIllI[0]] = "TSTANON_KARLAK";
        e.lIllIIIllIlIl[e.lIllIIIllIllI[4]] = "BALFRUG_KREEYATH";
        e.lIllIIIllIlIl[e.lIllIIIllIllI[8]] = "ZAKLN_GRITCH";
    }

    /*
     * WARNING - void declaration
     */
    public static e a(Projectile projectile) {
        void var1;
        e[] eArray = e.values();
        int n2 = eArray.length;
        int var2 = lIllIIIllIllI[0];
        while (e.llIIIlIlIIlllIl(var2, (int)var1)) {
            Projectile var3;
            void var4;
            void var5 = var4[var2];
            if (e.llIIIlIlIIllllI(var5.p(), var3.getId())) {
                return var5;
            }
            ++var2;

            if ((0x4E ^ 0x4A) >= -1) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static e a(NPC nPC) {
        void var6;
        e[] eArray = e.values();
        int n2 = eArray.length;
        int var7 = lIllIIIllIllI[0];
        while (e.llIIIlIlIIlllIl(var7, (int)var6)) {
            NPC var8;
            void var9;
            void var10 = var9[var7];
            if (e.llIIIlIlIIllllI(var10.n(), var8.getId())) {
                return var10;
            }
            ++var7;

            if (-2 <= 0) continue;
            return null;
        }
        return null;
    }

    public int q() {
        return this.animation;
    }

    public Prayer o() {
        return this.protection;
    }

    public int n() {
        return this.id;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
    }
}

