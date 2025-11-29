/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class DEnum
extends Enum<d> {
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ /* enum */ d FALADOR_WEST;
    private final /* synthetic */ WorldPoint location;
    private static /* synthetic */ String[] lIllIIlIlIIl;
    public static final /* synthetic */ /* enum */ d CASTLE_WARS;
    private static /* synthetic */ int[] lIllIIlIlIlI;
    public static final /* synthetic */ /* enum */ d GRAND_EXCHANGE;
    private final /* synthetic */ int regionId;
    public static final /* synthetic */ /* enum */ d VARROCK_WEST;

    private static void lllIIlIlIllIlI() {
        lIllIIlIlIIl = new String[lIllIIlIlIlI[16]];
        d.lIllIIlIlIIl[d.lIllIIlIlIlI[0]] = d."GRAND_EXCHANGE";
        d.lIllIIlIlIIl[d.lIllIIlIlIlI[4]] = d."VARROCK_WEST";
        d.lIllIIlIlIIl[d.lIllIIlIlIlI[8]] = d."FALADOR_WEST";
        d.lIllIIlIlIIl[d.lIllIIlIlIlI[12]] = d."CASTLE_WARS";
    }

    private static void lllIIlIlIllIll() {
        lIllIIlIlIlI = new int[18];
        d.lIllIIlIlIlI[0] = (0xA6 ^ 0xC7) & ~(0x26 ^ 0x47);
        d.lIllIIlIlIlI[1] = -(0xFFFFFC8F & 0x4779) & (0xFFFFFFBE & 0x757F);
        d.lIllIIlIlIlI[2] = -(0xFFFFEFF9 & 0x1387) & (0xFFFFDFFD & 0x2FDF);
        d.lIllIIlIlIlI[3] = -(0xFFFFAE65 & 0x73DB) & (0xFFFFFFDF & 0x2FFF);
        d.lIllIIlIlIlI[4] = 1;
        d.lIllIIlIlIlI[5] = -(0xFFFFCCBB & 0x7FCF) & (0xFFFFFFBF & 0x7DFF);
        d.lIllIIlIlIlI[6] = 0xFFFF9CF5 & 0x6F7B;
        d.lIllIIlIlIlI[7] = -(0xFFFFFA15 & 0x75FA) & (0xFFFFFD7F & Short.MAX_VALUE);
        d.lIllIIlIlIlI[8] = 2;
        d.lIllIIlIlIlI[9] = 0xFFFFEE36 & 0x3FFD;
        d.lIllIIlIlIlI[10] = 0xFFFFDFFB & 0x2B86;
        d.lIllIIlIlIlI[11] = 0xFFFFAD3C & 0x5FEB;
        d.lIllIIlIlIlI[12] = 3;
        d.lIllIIlIlIlI[13] = 0xFFFFBEFF & 0x6730;
        d.lIllIIlIlIlI[14] = 0xFFFFBB8F & 0x4DFB;
        d.lIllIIlIlIlI[15] = 0xFFFFCC6B & 0x3F9F;
        d.lIllIIlIlIlI[16] = 0x33 ^ 0x37;
        d.lIllIIlIlIlI[17] = 0x91 ^ 0x99;
    }

    private d(int n3, WorldPoint worldPoint) {
        this.regionId = n3;
        this.location = worldPoint;
    }

    public int G() {
        return this.regionId;
    }

    public WorldPoint H() {
        return this.location;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static String lllIIlIlIllIIl(String var5, String var1) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIllIIlIlIlI[17]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIllIIlIlIlI[8], var3);
            return new String(var4.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    static {
        d.lllIIlIlIllIll();
        d.lllIIlIlIllIlI();
        GRAND_EXCHANGE = new d(lIllIIlIlIlI[1], new WorldPoint(lIllIIlIlIlI[2], lIllIIlIlIlI[3], lIllIIlIlIlI[0]));
        VARROCK_WEST = new d(lIllIIlIlIlI[5], new WorldPoint(lIllIIlIlIlI[6], lIllIIlIlIlI[7], lIllIIlIlIlI[0]));
        FALADOR_WEST = new d(lIllIIlIlIlI[9], new WorldPoint(lIllIIlIlIlI[10], lIllIIlIlIlI[11], lIllIIlIlIlI[0]));
        CASTLE_WARS = new d(lIllIIlIlIlI[13], new WorldPoint(lIllIIlIlIlI[14], lIllIIlIlIlI[15], lIllIIlIlIlI[0]));
        d[] dArray = new d[lIllIIlIlIlI[16]];
        dArray[d.lIllIIlIlIlI[0]] = GRAND_EXCHANGE;
        dArray[d.lIllIIlIlIlI[4]] = VARROCK_WEST;
        dArray[d.lIllIIlIlIlI[8]] = FALADOR_WEST;
        dArray[d.lIllIIlIlIlI[12]] = CASTLE_WARS;
        $VALUES = dArray;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }
}

