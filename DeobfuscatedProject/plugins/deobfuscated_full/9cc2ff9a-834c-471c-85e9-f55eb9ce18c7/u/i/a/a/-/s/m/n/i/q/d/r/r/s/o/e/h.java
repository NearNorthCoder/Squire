/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class h
extends Enum<h> {
    public static final /* synthetic */ /* enum */ h GROWLER;
    private final /* synthetic */ String enemyName;
    private final /* synthetic */ int attackAnimation;
    private static final /* synthetic */ h[] $VALUES;
    private static /* synthetic */ int[] lIIlIlIIIIIlI;
    public static final /* synthetic */ /* enum */ h THROWER_TROLL;
    public static final /* synthetic */ /* enum */ h STARLIGHT;
    private final /* synthetic */ Prayer prayer;
    public static final /* synthetic */ /* enum */ h BREE;
    private final /* synthetic */ int attackSpeed;
    private static /* synthetic */ String[] lIIlIlIIIIIIl;

    private static void lIlIlIlIllllIlI() {
        lIIlIlIIIIIlI = new int[13];
        h.lIIlIlIIIIIlI[0] = -(0x94 ^ 0x9E);
        h.lIIlIlIIIIIlI[1] = (31 + 57 - -1 + 79 ^ 94 + 47 - 64 + 74) & (42 + 20 - -5 + 120 ^ 74 + 52 - 6 + 12 ^ -1);
        h.lIIlIlIIIIIlI[2] = 1;
        h.lIIlIlIIIIIlI[3] = 0xFFFFFBFB & 0x1F76;
        h.lIIlIlIIIIIlI[4] = 0x95 ^ 0x81 ^ (0x3A ^ 0x2B);
        h.lIIlIlIIIIIlI[5] = 2;
        h.lIIlIlIIIIIlI[6] = 3;
        h.lIIlIlIIIIIlI[7] = -(0xFFFFE7DF & 0x3CA3) & (0xFFFFFFFF & 0x3FFF);
        h.lIIlIlIIIIIlI[8] = 0x5B ^ 0x5F;
        h.lIIlIlIIIIIlI[9] = 0xFFFF9EFB & 0x79EC;
        h.lIIlIlIIIIIlI[10] = 0xBD ^ 0xBB;
        h.lIIlIlIIIIIlI[11] = 0x92 ^ 0x81 ^ (0x19 ^ 0xD);
        h.lIIlIlIIIIIlI[12] = 0x2C ^ 0x24;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    public String y() {
        return this.enemyName;
    }

    public int w() {
        return this.attackSpeed;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean lIlIlIlIllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private h(String string2, int n3, int n4, Prayer prayer) {
        this.enemyName = string2;
        this.attackAnimation = n3;
        this.attackSpeed = n4;
        this.prayer = prayer;
    }

    private static String lIlIlIlIlllIllI(String var7, String var10) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var18 = var10.toCharArray();
        int var5 = lIIlIlIIIIIlI[1];
        char[] var15 = var7.toCharArray();
        int var8 = var15.length;
        int var9 = lIIlIlIIIIIlI[1];
        while (h.lIlIlIlIllllIll(var9, var8)) {
            char var16 = var15[var9];
            var12.append((char)(var16 ^ var18[var5 % var18.length]));
            0;
            ++var5;
            ++var9;
            0;
            
            return null;
        }
        return String.valueOf(var12);
    }

    private h(String string2, Prayer prayer) {
        this(string2, lIIlIlIIIIIlI[0], lIIlIlIIIIIlI[0], prayer);
    }

    public int v() {
        return this.attackAnimation;
    }

    private static String lIlIlIlIllllIII(String var19, String var4) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIIlIlIIIIIlI[5], var2);
            return new String(var17.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    static {
        h.lIlIlIlIllllIlI();
        h.lIlIlIlIllllIIl();
        BREE = new h(lIIlIlIIIIIIl[lIIlIlIIIIIlI[2]], lIIlIlIIIIIlI[3], lIIlIlIIIIIlI[4], Prayer.PROTECT_FROM_MISSILES);
        GROWLER = new h(lIIlIlIIIIIIl[lIIlIlIIIIIlI[6]], lIIlIlIIIIIlI[7], lIIlIlIIIIIlI[4], Prayer.PROTECT_FROM_MAGIC);
        STARLIGHT = new h(lIIlIlIIIIIIl[lIIlIlIIIIIlI[4]], lIIlIlIIIIIlI[9], lIIlIlIIIIIlI[4], Prayer.PROTECT_FROM_MELEE);
        THROWER_TROLL = new h(lIIlIlIIIIIIl[lIIlIlIIIIIlI[11]], Prayer.PROTECT_FROM_MISSILES);
        h[] hArray = new h[lIIlIlIIIIIlI[8]];
        hArray[h.lIIlIlIIIIIlI[1]] = BREE;
        hArray[h.lIIlIlIIIIIlI[2]] = GROWLER;
        hArray[h.lIIlIlIIIIIlI[5]] = STARLIGHT;
        hArray[h.lIIlIlIIIIIlI[6]] = THROWER_TROLL;
        $VALUES = hArray;
    }

    private static String lIlIlIlIlllIlll(String var6, String var11) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIIlIlIIIIIlI[12]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIIlIlIIIIIlI[5], var14);
            return new String(var13.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public Prayer x() {
        return this.prayer;
    }

    private static void lIlIlIlIllllIIl() {
        lIIlIlIIIIIIl = new String[lIIlIlIIIIIlI[12]];
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[1]] = h."BREE";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[2]] = h."Bree";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[5]] = h."GROWLER";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[6]] = h."Growler";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[8]] = h."STARLIGHT";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[4]] = h."Starlight";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[10]] = h."THROWER_TROLL";
        h.lIIlIlIIIIIIl[h.lIIlIlIIIIIlI[11]] = h."Thrower troll";
    }
}

