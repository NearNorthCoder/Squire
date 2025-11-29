/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class e
extends Enum<e> {
    public static final /* synthetic */ /* enum */ e FEROX_ENCLAVE;
    private final /* synthetic */ int regionId;
    public static final /* synthetic */ /* enum */ e VARROCK_WEST;
    private static /* synthetic */ int[] lIlIlllIlllIl;
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ /* enum */ e CASTLE_WARS;
    public static final /* synthetic */ /* enum */ e FALADOR_WEST;
    private static /* synthetic */ String[] lIlIlllIllIlI;
    public static final /* synthetic */ /* enum */ e EDGEVILLE;
    public static final /* synthetic */ /* enum */ e GRAND_EXCHANGE;
    private static final /* synthetic */ e[] $VALUES;

    private static boolean llIIIIlIlIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private e(int n3, WorldPoint worldPoint) {
        this.regionId = n3;
        this.location = worldPoint;
    }

    static {
        e.llIIIIlIlIlIIll();
        e.llIIIIlIlIIllII();
        GRAND_EXCHANGE = new e(lIlIlllIlllIl[1], new WorldPoint(lIlIlllIlllIl[2], lIlIlllIlllIl[3], lIlIlllIlllIl[0]));
        FEROX_ENCLAVE = new e(lIlIlllIlllIl[5], new WorldPoint(lIlIlllIlllIl[6], lIlIlllIlllIl[7], lIlIlllIlllIl[0]));
        EDGEVILLE = new e(lIlIlllIlllIl[9], new WorldPoint(lIlIlllIlllIl[10], lIlIlllIlllIl[11], lIlIlllIlllIl[0]));
        VARROCK_WEST = new e(lIlIlllIlllIl[13], new WorldPoint(lIlIlllIlllIl[14], lIlIlllIlllIl[15], lIlIlllIlllIl[0]));
        FALADOR_WEST = new e(lIlIlllIlllIl[17], new WorldPoint(lIlIlllIlllIl[18], lIlIlllIlllIl[19], lIlIlllIlllIl[0]));
        CASTLE_WARS = new e(lIlIlllIlllIl[21], new WorldPoint(lIlIlllIlllIl[22], lIlIlllIlllIl[23], lIlIlllIlllIl[0]));
        e[] eArray = new e[lIlIlllIlllIl[24]];
        eArray[e.lIlIlllIlllIl[0]] = GRAND_EXCHANGE;
        eArray[e.lIlIlllIlllIl[4]] = FEROX_ENCLAVE;
        eArray[e.lIlIlllIlllIl[8]] = EDGEVILLE;
        eArray[e.lIlIlllIlllIl[12]] = VARROCK_WEST;
        eArray[e.lIlIlllIlllIl[16]] = FALADOR_WEST;
        eArray[e.lIlIlllIlllIl[20]] = CASTLE_WARS;
        $VALUES = eArray;
    }

    private static String llIIIIlIlIIIlll(String var11, String var2) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIlIlllIlllIl[8], var5);
            return new String(var13.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static void llIIIIlIlIlIIll() {
        lIlIlllIlllIl = new int[25];
        e.lIlIlllIlllIl[0] = (0 ^ 0x51 ^ (0x29 ^ 0x70)) & (2 ^ 0x2A ^ (0x89 ^ 0xA9) ^ -1);
        e.lIlIlllIlllIl[1] = -(0xFFFFFECF & 0x413A) & (0xFFFFF9FF & 0x773F);
        e.lIlIlllIlllIl[2] = -(0xFFFFDCF5 & 0x33AB) & (0xFFFF9FFD & 0x7CFF);
        e.lIlIlllIlllIl[3] = 0xFFFFFDBF & 0xFDF;
        e.lIlIlllIlllIl[4] = 1;
        e.lIlIlllIlllIl[5] = 0xFFFFBBBB & 0x747C;
        e.lIlIlllIlllIl[6] = -(0xFFFFF75F & 0x5BE6) & (0xFFFFFF7F & 0x5FFF);
        e.lIlIlllIlllIl[7] = -(0xFFFFED97 & 0x72F9) & (0xFFFFFFBF & 0x6EFF);
        e.lIlIlllIlllIl[8] = 2;
        e.lIlIlllIlllIl[9] = 0xFFFFBF76 & 0x70BF;
        e.lIlIlllIlllIl[10] = -(0xFFFFF3FD & 0x4CCB) & (0xFFFFEFDF & 0x5CFD);
        e.lIlIlllIlllIl[11] = 0xFFFFAFBE & 0x5DE9;
        e.lIlIlllIlllIl[12] = 3;
        e.lIlIlllIlllIl[13] = 0xFFFFF73D & 0x39F7;
        e.lIlIlllIlllIl[14] = -(0xFFFFF397 & 0x3DEB) & (0xFFFFFDFB & 0x3FF7);
        e.lIlIlllIlllIl[15] = -(0xFFFFF1BF & 0x6ECE) & (0xFFFFFFFD & 0x6DFF);
        e.lIlIlllIlllIl[16] = 0x89 ^ 0x8D;
        e.lIlIlllIlllIl[17] = -(0xFFFFB7AB & 0x59D6) & (0xFFFFBFF7 & 0x7FBD);
        e.lIlIlllIlllIl[18] = 0xFFFFBF8F & 0x4BF2;
        e.lIlIlllIlllIl[19] = -(0xFFFFE3F5 & 0x7EDF) & (0xFFFFFFFF & 0x6FFC);
        e.lIlIlllIlllIl[20] = 157 + 12 - 24 + 17 ^ 107 + 104 - 165 + 121;
        e.lIlIlllIlllIl[21] = 0xFFFFBF73 & 0x66BC;
        e.lIlIlllIlllIl[22] = -(0xFFFFC6D9 & 0x7F37) & (0xFFFFCF9F & 0x7FFB);
        e.lIlIlllIlllIl[23] = -(0xFFFF9B91 & 0x77EF) & (0xFFFFBFCB & 0x5FBF);
        e.lIlIlllIlllIl[24] = 0x88 ^ 0x8E;
    }

    public WorldPoint m() {
        return this.location;
    }

    private static String llIIIIlIlIIlIll(String var6, String var1) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var3 = var1.toCharArray();
        int var8 = lIlIlllIlllIl[0];
        char[] var10 = var6.toCharArray();
        int var12 = var10.length;
        int var14 = lIlIlllIlllIl[0];
        while (e.llIIIIlIlIlIlII(var14, var12)) {
            char var9 = var10[var14];
            var7.append((char)(var9 ^ var3[var8 % var3.length]));
            0;
            ++var8;
            ++var14;
            0;
            if ((0x28 ^ 0x2C) != 3) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    public int d() {
        return this.regionId;
    }

    private static void llIIIIlIlIIllII() {
        lIlIlllIllIlI = new String[lIlIlllIlllIl[24]];
        e.lIlIlllIllIlI[e.lIlIlllIlllIl[0]] = e."GRAND_EXCHANGE";
        e.lIlIlllIllIlI[e.lIlIlllIlllIl[4]] = e."FEROX_ENCLAVE";
        e.lIlIlllIllIlI[e.lIlIlllIlllIl[8]] = e."EDGEVILLE";
        e.lIlIlllIllIlI[e.lIlIlllIlllIl[12]] = e."VARROCK_WEST";
        e.lIlIlllIllIlI[e.lIlIlllIlllIl[16]] = e."FALADOR_WEST";
        e.lIlIlllIllIlI[e.lIlIlllIlllIl[20]] = e."CASTLE_WARS";
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }
}

