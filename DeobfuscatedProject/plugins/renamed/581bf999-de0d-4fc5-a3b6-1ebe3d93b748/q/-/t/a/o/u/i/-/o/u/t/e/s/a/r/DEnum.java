/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Equipment
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;

public final class DEnum
extends Enum<d> {
    private final /* synthetic */ int req;
    public static final /* synthetic */ /* enum */ d VOIDWAKER;
    private static /* synthetic */ int[] lIllllllIII;
    private final /* synthetic */ List<Integer> ids;
    private static final /* synthetic */ d[] $VALUES;
    private static /* synthetic */ String[] lIlllllIlll;
    public static final /* synthetic */ /* enum */ d ZARYTE_CROSSBOW;
    public static final /* synthetic */ /* enum */ d DRAGON_CLAWS;
    public static final /* synthetic */ /* enum */ d TOXIC_BLOWPIPE;
    public static final /* synthetic */ /* enum */ d DRAGON_DAGGER;
    public static final /* synthetic */ /* enum */ d OSMUMTENS_FANG;
    public static final /* synthetic */ /* enum */ d BANDOS_GODSWORD;

    static {
        d.lIIllIlllIIlIl();
        d.lIIllIlllIIlII();
        DRAGON_DAGGER = new d(List.of(Integer.valueOf(lIllllllIII[3]), Integer.valueOf(lIllllllIII[4]), Integer.valueOf(lIllllllIII[5]), Integer.valueOf(lIllllllIII[6]), Integer.valueOf(lIllllllIII[7])), lIllllllIII[8]);
        BANDOS_GODSWORD = new d(List.of(Integer.valueOf(lIllllllIII[10]), Integer.valueOf(lIllllllIII[11])), lIllllllIII[12]);
        TOXIC_BLOWPIPE = new d(List.of(Integer.valueOf(lIllllllIII[14])), lIllllllIII[12]);
        OSMUMTENS_FANG = new d(List.of(Integer.valueOf(lIllllllIII[16]), Integer.valueOf(lIllllllIII[17])), lIllllllIII[8]);
        DRAGON_CLAWS = new d(List.of(Integer.valueOf(lIllllllIII[19])), lIllllllIII[12]);
        VOIDWAKER = new d(List.of(Integer.valueOf(lIllllllIII[21]), Integer.valueOf(lIllllllIII[22])), lIllllllIII[12]);
        ZARYTE_CROSSBOW = new d(List.of(Integer.valueOf(lIllllllIII[24]), Integer.valueOf(lIllllllIII[25])), lIllllllIII[26]);
        d[] dArray = new d[lIllllllIII[27]];
        dArray[d.lIllllllIII[1]] = DRAGON_DAGGER;
        dArray[d.lIllllllIII[9]] = BANDOS_GODSWORD;
        dArray[d.lIllllllIII[13]] = TOXIC_BLOWPIPE;
        dArray[d.lIllllllIII[15]] = OSMUMTENS_FANG;
        dArray[d.lIllllllIII[18]] = DRAGON_CLAWS;
        dArray[d.lIllllllIII[20]] = VOIDWAKER;
        dArray[d.lIllllllIII[23]] = ZARYTE_CROSSBOW;
        $VALUES = dArray;
    }

    /*
     * WARNING - void declaration
     */
    public static int b(int ... nArray) {
        void var8;
        d[] dArray = d.values();
        int n2 = dArray.length;
        int var23 = lIllllllIII[1];
        while (d.lIIllIlllIIlll(var23, (int)var8)) {
            int[] var29;
            void var32;
            void var22 = var32[var23];
            int[] var2 = var29;
            int var15 = var2.length;
            int var25 = lIllllllIII[1];
            while (d.lIIllIlllIIlll(var25, var15)) {
                int var4 = var2[var25];
                if (d.lIIllIlllIlIII(var22.p().contains(var4) ? 1 : 0)) {
                    return var22.o();
                }
                ++var25;
                0;
                if (((0x1B ^ 0x79) & ~(0xA4 ^ 0xC6)) == 0) continue;
                return 2 & ~2;
            }
            ++var23;
            0;
            if (3 > 1) continue;
            return (0x6E ^ 0x2E) & ~(0xF4 ^ 0xB4);
        }
        return lIllllllIII[0];
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static boolean lIIllIlllIlIII(int n2) {
        return n2 != 0;
    }

    private static void lIIllIlllIIlIl() {
        lIllllllIII = new int[29];
        d.lIllllllIII[0] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        d.lIllllllIII[1] = (0x59 ^ 0x79) & ~(0x4D ^ 0x6D);
        d.lIllllllIII[2] = 0x45 ^ 0x4F;
        d.lIllllllIII[3] = -(0xFFFFF743 & 0x4BBD) & (0xFFFFCFBF & 0x77FF);
        d.lIllllllIII[4] = 0xFFFF8DFF & 0x76CF;
        d.lIllllllIII[5] = 0xFFFFFFF7 & 0x4FBF;
        d.lIllllllIII[6] = 0xFFFFD678 & 0x3FB7;
        d.lIllllllIII[7] = -(0xFFFF9F97 & 0x617E) & (0xFFFF9F7F & 0x77D7);
        d.lIllllllIII[8] = 181 + 122 - 290 + 237;
        d.lIllllllIII[9] = 1;
        d.lIllllllIII[10] = 0xFFFFFE5D & 0x2FBE;
        d.lIllllllIII[11] = -(0xFFFFABFE & 0x7467) & (0xFFFFFFFF & 0x6FF7);
        d.lIllllllIII[12] = 0xFFFFA7FE & 0x59F5;
        d.lIllllllIII[13] = 2;
        d.lIllllllIII[14] = -(0xFFFFB70D & 0x4CF3) & (0xFFFFBE7F & 0x77FE);
        d.lIllllllIII[15] = 3;
        d.lIllllllIII[16] = 0xFFFFF6EB & 0x6F7F;
        d.lIllllllIII[17] = 0xFFFFFE6F & 0x6BFE;
        d.lIllllllIII[18] = 0x94 ^ 0x9F ^ (0x6E ^ 0x61);
        d.lIllllllIII[19] = -(10 + 75 - -54 + 24) & (0xFFFFFFF7 & 0x35FE);
        d.lIllllllIII[20] = 0x89 ^ 0x95 ^ (0x14 ^ 0xD);
        d.lIllllllIII[21] = -(0xFFFFD3DF & 0x2D36) & (0xFFFFFD7F & 0x6FBF);
        d.lIllllllIII[22] = -(0xFFFFFAE5 & 0x173B) & (0xFFFFFFFF & 0x7EFD);
        d.lIllllllIII[23] = 0x6C ^ 0x6A;
        d.lIllllllIII[24] = -(0xFFFFF8E2 & 0x175F) & (0xFFFFF77F & 0x7FC7);
        d.lIllllllIII[25] = -(0xFFFFFD7F & 0x17CD) & (0xFFFFFF7E & Short.MAX_VALUE);
        d.lIllllllIII[26] = -(0xFFFFF736 & 0x5DCB) & (0xFFFFFFFF & 0x57EF);
        d.lIllllllIII[27] = 0x59 ^ 0x5E;
        d.lIllllllIII[28] = 0x80 ^ 0x8D ^ (0x68 ^ 0x6D);
    }

    private d(List<Integer> list, int n3) {
        this.ids = list;
        this.req = n3;
    }

    private static void lIIllIlllIIlII() {
        lIlllllIlll = new String[lIllllllIII[27]];
        d.lIlllllIlll[d.lIllllllIII[1]] = d."DRAGON_DAGGER";
        d.lIlllllIlll[d.lIllllllIII[9]] = d."BANDOS_GODSWORD";
        d.lIlllllIlll[d.lIllllllIII[13]] = d."TOXIC_BLOWPIPE";
        d.lIlllllIlll[d.lIllllllIII[15]] = d."OSMUMTENS_FANG";
        d.lIlllllIlll[d.lIllllllIII[18]] = d."DRAGON_CLAWS";
        d.lIlllllIlll[d.lIllllllIII[20]] = d."VOIDWAKER";
        d.lIlllllIlll[d.lIllllllIII[23]] = d."ZARYTE_CROSSBOW";
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public int o() {
        return this.req / lIllllllIII[2];
    }

    public int q() {
        return this.req;
    }

    private static String lIIllIlllIIIIl(String var6, String var13) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIllllllIII[13], var12);
            return new String(var1.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String lIIllIlllIIIll(String var14, String var17) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var16 = var17.toCharArray();
        int var28 = lIllllllIII[1];
        char[] var20 = var14.toCharArray();
        int var11 = var20.length;
        int var9 = lIllllllIII[1];
        while (d.lIIllIlllIIlll(var9, var11)) {
            char var18 = var20[var9];
            var5.append((char)(var18 ^ var16[var28 % var16.length]));
            0;
            ++var28;
            ++var9;
            0;
            
            return null;
        }
        return String.valueOf(var5);
    }

    private static boolean lIIllIlllIIllI(Object object) {
        return object == null;
    }

    private static boolean lIIllIlllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static int n() {
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (d.lIIllIlllIIllI(item)) {
            return lIllllllIII[0];
        }
        d[] var30 = d.values();
        int var10 = var30.length;
        int var21 = lIllllllIII[1];
        while (d.lIIllIlllIIlll(var21, var10)) {
            void var19;
            d var31 = var30[var21];
            if (d.lIIllIlllIlIII(var31.p().contains(var19.getId()) ? 1 : 0)) {
                return var31.o();
            }
            ++var21;
            0;
            if (2 > 0) continue;
            return (0xE5 ^ 0xB7) & ~(0x63 ^ 0x31);
        }
        return lIllllllIII[0];
    }

    private static String lIIllIlllIIIlI(String var27, String var24) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), lIllllllIII[28]), "DES");
            Cipher var33 = Cipher.getInstance("DES");
            var33.init(lIllllllIII[13], var7);
            return new String(var33.doFinal(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public List<Integer> p() {
        return this.ids;
    }
}

