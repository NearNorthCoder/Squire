/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.input.Keyboard
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.input.Keyboard;

public final class h
extends Enum<h> {
    private static /* synthetic */ int[] lIIllIIIIIIll;
    private static /* synthetic */ String[] lIIllIIIIIIlI;
    private final /* synthetic */ Predicate<Item> test;
    private final /* synthetic */ Consumer<Item> execution;
    public static final /* synthetic */ /* enum */ h CONSTRUCTION_CAPE;
    public static final /* synthetic */ /* enum */ h SKILLS_NECKLACE;
    private final /* synthetic */ boolean stopping;
    public static final /* synthetic */ /* enum */ h ECTOPHIAL;
    private final /* synthetic */ boolean leaveRoom;
    public static final /* synthetic */ /* enum */ h FARMING_CAPE;
    public static final /* synthetic */ /* enum */ h ARDY_CLOAK;
    public static final /* synthetic */ /* enum */ h HOUSE_TELEPORT;
    private static final /* synthetic */ h[] $VALUES;
    private final /* synthetic */ boolean fairy;

    private static boolean lIlIlllIIllllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIlllIIllIlII(String var8, String var2) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIIllIIIIIIll[6], var16);
            return new String(var12.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllIIllIlll() {
        lIIllIIIIIIlI = new String[lIIllIIIIIIll[23]];
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[0]] = h."Tele to POH";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[3]] = h."Teleport";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[6]] = h."Empty";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[8]] = h."Break";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[10]] = h."Rub";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[11]] = h."6";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[12]] = h."Skills necklace";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[14]] = h."Monastery Teleport";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[17]] = h."ARDY_CLOAK";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[18]] = h."SKILLS_NECKLACE";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[19]] = h."HOUSE_TELEPORT";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[20]] = h."ECTOPHIAL";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[21]] = h."FARMING_CAPE";
        h.lIIllIIIIIIlI[h.lIIllIIIIIIll[22]] = h."CONSTRUCTION_CAPE";
    }

    private static boolean lIlIlllIIlllIll(int n2) {
        return n2 != 0;
    }

    private static String lIlIlllIIllIlIl(String var15, String var10) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var7 = var10.toCharArray();
        int var18 = lIIllIIIIIIll[0];
        char[] var14 = var15.toCharArray();
        int var17 = var14.length;
        int var6 = lIIllIIIIIIll[0];
        while (h.lIlIlllIIlllllI(var6, var17)) {
            char var1 = var14[var6];
            var4.append((char)(var1 ^ var7[var18 % var7.length]));
            0;
            ++var18;
            ++var6;
            0;
            if (((0x44 ^ 0x7D) & ~(0x7A ^ 0x43)) >= 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    public Consumer<Item> B() {
        return this.execution;
    }

    public Predicate<Item> u() {
        return this.test;
    }

    static {
        h.lIlIlllIIlllIII();
        h.lIlIlllIIllIlll();
        ARDY_CLOAK = new h(item -> {
            int n2;
            if (h.lIlIlllIIllllII(item.getId(), lIIllIIIIIIll[15]) && h.lIlIlllIIllllIl(item.getId(), lIIllIIIIIIll[16])) {
                n2 = lIIllIIIIIIll[3];
                0;
                if ((0x7A ^ 0x7E) <= ((0x5E ^ 0x6B) & ~(0xE ^ 0x3B))) {
                    return false;
                }
            } else {
                n2 = lIIllIIIIIIll[0];
            }
            return n2 != 0;
        }, item -> item.interact(lIIllIIIIIIlI[lIIllIIIIIIll[14]]), lIIllIIIIIIll[0], lIIllIIIIIIll[3], lIIllIIIIIIll[0]);
        SKILLS_NECKLACE = new h(item -> {
            int n2;
            if (h.lIlIlllIIlllIll(item.getName().startsWith(lIIllIIIIIIlI[lIIllIIIIIIll[12]]) ? 1 : 0) && h.lIlIlllIIlllIIl(item.getId(), lIIllIIIIIIll[13])) {
                n2 = lIIllIIIIIIll[3];
                0;
                if (-1 == 1) {
                    return false;
                }
            } else {
                n2 = lIIllIIIIIIll[0];
            }
            return n2 != 0;
        }, item -> {
            item.interact(lIIllIIIIIIlI[lIIllIIIIIIll[10]]);
            Keyboard.type((String)lIIllIIIIIIlI[lIIllIIIIIIll[11]]);
        }, lIIllIIIIIIll[0], lIIllIIIIIIll[0], lIIllIIIIIIll[3]);
        HOUSE_TELEPORT = new h(item -> {
            boolean bl;
            if (h.lIlIlllIIlllIlI(item.getId(), lIIllIIIIIIll[9])) {
                bl = lIIllIIIIIIll[3];
                0;
                if (((0xF7 ^ 0x94) & ~(0x1B ^ 0x78)) < 0) {
                    return false;
                }
            } else {
                bl = lIIllIIIIIIll[0];
            }
            return bl;
        }, item -> item.interact(lIIllIIIIIIlI[lIIllIIIIIIll[8]]), lIIllIIIIIIll[0], lIIllIIIIIIll[0], lIIllIIIIIIll[0]);
        ECTOPHIAL = new h(item -> {
            boolean bl;
            if (h.lIlIlllIIlllIlI(item.getId(), lIIllIIIIIIll[7])) {
                bl = lIIllIIIIIIll[3];
                0;
                if (2 == 1) {
                    return false;
                }
            } else {
                bl = lIIllIIIIIIll[0];
            }
            return bl;
        }, item -> item.interact(lIIllIIIIIIlI[lIIllIIIIIIll[6]]), lIIllIIIIIIll[3], lIIllIIIIIIll[3], lIIllIIIIIIll[0]);
        FARMING_CAPE = new h(item -> {
            boolean bl;
            if (!h.lIlIlllIIlllIIl(item.getId(), lIIllIIIIIIll[4]) || h.lIlIlllIIlllIlI(item.getId(), lIIllIIIIIIll[5])) {
                bl = lIIllIIIIIIll[3];
                0;
                if ((78 + 128 - 103 + 43 ^ 70 + 124 - 57 + 13) <= ((0x3F ^ 0x25 ^ (0x1B ^ 0x61)) & (0xE6 ^ 0x96 ^ (0x1C ^ 0xC) ^ -1))) {
                    return false;
                }
            } else {
                bl = lIIllIIIIIIll[0];
            }
            return bl;
        }, item -> item.interact(lIIllIIIIIIlI[lIIllIIIIIIll[3]]), lIIllIIIIIIll[0], lIIllIIIIIIll[0], lIIllIIIIIIll[0]);
        CONSTRUCTION_CAPE = new h(item -> {
            int n2;
            if (!h.lIlIlllIIlllIIl(item.getId(), lIIllIIIIIIll[1]) || h.lIlIlllIIlllIlI(item.getId(), lIIllIIIIIIll[2])) {
                n2 = lIIllIIIIIIll[3];
                0;
                
                }
            } else {
                n2 = lIIllIIIIIIll[0];
            }
            return n2 != 0;
        }, item -> item.interact(lIIllIIIIIIlI[lIIllIIIIIIll[0]]), lIIllIIIIIIll[0], lIIllIIIIIIll[0], lIIllIIIIIIll[0]);
        h[] hArray = new h[lIIllIIIIIIll[12]];
        hArray[h.lIIllIIIIIIll[0]] = ARDY_CLOAK;
        hArray[h.lIIllIIIIIIll[3]] = SKILLS_NECKLACE;
        hArray[h.lIIllIIIIIIll[6]] = HOUSE_TELEPORT;
        hArray[h.lIIllIIIIIIll[8]] = ECTOPHIAL;
        hArray[h.lIIllIIIIIIll[10]] = FARMING_CAPE;
        hArray[h.lIIllIIIIIIll[11]] = CONSTRUCTION_CAPE;
        $VALUES = hArray;
    }

    private static boolean lIlIlllIIlllIlI(int n2, int n3) {
        return n2 == n3;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean lIlIlllIIllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlIlllIIllIllI(String var11, String var3) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIIllIIIIIIll[17]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(lIIllIIIIIIll[6], var9);
            return new String(var19.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private h(Predicate<Item> predicate, Consumer<Item> consumer, boolean bl, boolean bl2, boolean bl3) {
        this.test = predicate;
        this.execution = consumer;
        this.stopping = bl;
        this.fairy = bl2;
        this.leaveRoom = bl3;
    }

    public boolean D() {
        return this.fairy;
    }

    private static boolean lIlIlllIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean E() {
        return this.leaveRoom;
    }

    private static void lIlIlllIIlllIII() {
        lIIllIIIIIIll = new int[24];
        h.lIIllIIIIIIll[0] = (1 ^ 0x61 ^ (0x11 ^ 0x7F)) & (0x14 ^ 0x2D ^ (0xB0 ^ 0x87) ^ -1);
        h.lIIllIIIIIIll[1] = -(0xFFFFDF7F & 0x79C3) & (0xFFFFFFFF & 0x7F7F);
        h.lIIllIIIIIIll[2] = 0xFFFFE67F & 0x3FBE;
        h.lIIllIIIIIIll[3] = 1;
        h.lIIllIIIIIIll[4] = 0xFFFFE756 & 0x3EFB;
        h.lIIllIIIIIIll[5] = -(0xFFFFDFFF & 0x79AD) & (0xFFFFFFFF & Short.MAX_VALUE);
        h.lIIllIIIIIIll[6] = 2;
        h.lIIllIIIIIIll[7] = 0xFFFFD1BB & 0x3EDF;
        h.lIIllIIIIIIll[8] = 3;
        h.lIIllIIIIIIll[9] = -(0xFFFFE5FF & 0x3A33) & (0xFFFFFF7F & 0x3FFF);
        h.lIIllIIIIIIll[10] = 0xAA ^ 0xAE;
        h.lIIllIIIIIIll[11] = 0x6A ^ 0x60 ^ (0x34 ^ 0x3B);
        h.lIIllIIIIIIll[12] = 0x33 ^ 0x15 ^ (4 ^ 0x24);
        h.lIIllIIIIIIll[13] = -(0xA8 ^ 0xBB) & (0xFFFFFB7F & 0x2FFB);
        h.lIIllIIIIIIll[14] = 0x72 ^ 0x59 ^ (0x44 ^ 0x68);
        h.lIIllIIIIIIll[15] = -(0xFFFFC9E1 & 0x7E9F) & (0xFFFFFBC5 & 0x7FFB);
        h.lIIllIIIIIIll[16] = 0xFFFFF375 & 0x3FCE;
        h.lIIllIIIIIIll[17] = 0x65 ^ 0x6D;
        h.lIIllIIIIIIll[18] = 3 ^ 0xA;
        h.lIIllIIIIIIll[19] = 0x9B ^ 0x91;
        h.lIIllIIIIIIll[20] = 0xB7 ^ 0xBC;
        h.lIIllIIIIIIll[21] = 0x66 ^ 0x6A;
        h.lIIllIIIIIIll[22] = 0xB2 ^ 0xBF;
        h.lIIllIIIIIIll[23] = 0x3F ^ 0x31;
    }

    private static boolean lIlIlllIIlllIIl(int n2, int n3) {
        return n2 != n3;
    }

    public boolean C() {
        return this.stopping;
    }
}

