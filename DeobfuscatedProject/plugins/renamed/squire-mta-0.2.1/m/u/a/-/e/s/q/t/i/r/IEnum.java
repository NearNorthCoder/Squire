/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Widgets
 */
package m.u.a.-.e.s.q.t.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;

public final class IEnum
extends Enum<i> {
    private final /* synthetic */ int widgetId;
    public static final /* synthetic */ /* enum */ i PENTAMID;
    private final /* synthetic */ int groupId;
    private static /* synthetic */ int[] lllIllIIIIlI;
    private static /* synthetic */ String[] lllIllIIIIII;
    public static final /* synthetic */ /* enum */ i CUBE;
    private static final /* synthetic */ i[] $VALUES;
    public static final /* synthetic */ /* enum */ i CYLINDER;
    public static final /* synthetic */ /* enum */ i ICOSAHEDRON;
    private final /* synthetic */ String itemName;
    private final /* synthetic */ String pile_name;

    private static boolean lIIIllIIllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static String lIIIllIIllIIIII(String var11, String var18) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lllIllIIIIlI[12]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lllIllIIIIlI[4], var1);
            return new String(var2.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        i.lIIIllIIllIlIII();
        i.lIIIllIIllIIlll();
        CUBE = new i(lllIllIIIIII[lllIllIIIIlI[1]], lllIllIIIIlI[2], lllIllIIIIlI[3], lllIllIIIIII[lllIllIIIIlI[4]]);
        CYLINDER = new i(lllIllIIIIII[lllIllIIIIlI[6]], lllIllIIIIlI[2], lllIllIIIIlI[7], lllIllIIIIII[lllIllIIIIlI[8]]);
        PENTAMID = new i(lllIllIIIIII[lllIllIIIIlI[10]], lllIllIIIIlI[2], lllIllIIIIlI[11], lllIllIIIIII[lllIllIIIIlI[12]]);
        ICOSAHEDRON = new i(lllIllIIIIII[lllIllIIIIlI[3]], lllIllIIIIlI[2], lllIllIIIIlI[14], lllIllIIIIII[lllIllIIIIlI[15]]);
        i[] iArray = new i[lllIllIIIIlI[6]];
        iArray[i.lllIllIIIIlI[0]] = CUBE;
        iArray[i.lllIllIIIIlI[1]] = CYLINDER;
        iArray[i.lllIllIIIIlI[4]] = PENTAMID;
        iArray[i.lllIllIIIIlI[5]] = ICOSAHEDRON;
        $VALUES = iArray;
    }

    public String y() {
        return this.pile_name;
    }

    private static String lIIIllIIllIIIIl(String var15, String var5) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var4 = var5.toCharArray();
        int var19 = lllIllIIIIlI[0];
        char[] var3 = var15.toCharArray();
        int var6 = var3.length;
        int var17 = lllIllIIIIlI[0];
        while (i.lIIIllIIllIlIIl(var17, var6)) {
            char var7 = var3[var17];
            var14.append((char)(var7 ^ var4[var19 % var4.length]));
            0;
            ++var19;
            ++var17;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }

    private static void lIIIllIIllIIlll() {
        lllIllIIIIII = new String[lllIllIIIIlI[7]];
        i.lllIllIIIIII[i.lllIllIIIIlI[0]] = i."CUBE";
        i.lllIllIIIIII[i.lllIllIIIIlI[1]] = i."Cube";
        i.lllIllIIIIII[i.lllIllIIIIlI[4]] = i."Cube Pile";
        i.lllIllIIIIII[i.lllIllIIIIlI[5]] = i."CYLINDER";
        i.lllIllIIIIII[i.lllIllIIIIlI[6]] = i."Cylinder";
        i.lllIllIIIIII[i.lllIllIIIIlI[8]] = i."Cylinder Pile";
        i.lllIllIIIIII[i.lllIllIIIIlI[9]] = i."PENTAMID";
        i.lllIllIIIIII[i.lllIllIIIIlI[10]] = i."Pentamid";
        i.lllIllIIIIII[i.lllIllIIIIlI[12]] = i."Pentamid Pile";
        i.lllIllIIIIII[i.lllIllIIIIlI[13]] = i."ICOSAHEDRON";
        i.lllIllIIIIII[i.lllIllIIIIlI[3]] = i."Icosahedron";
        i.lllIllIIIIII[i.lllIllIIIIlI[15]] = i."Icosahedron Pile";
    }

    public int x() {
        return this.widgetId;
    }

    public String v() {
        return this.itemName;
    }

    private static void lIIIllIIllIlIII() {
        lllIllIIIIlI = new int[16];
        i.lllIllIIIIlI[0] = (124 + 88 - 68 + 4 ^ 179 + 28 - 79 + 52) & (0x72 ^ 0x57 ^ (4 ^ 1) ^ -1);
        i.lllIllIIIIlI[1] = 1;
        i.lllIllIIIIlI[2] = 14 + 75 - -62 + 44;
        i.lllIllIIIIlI[3] = 0x25 ^ 0x2F;
        i.lllIllIIIIlI[4] = 2;
        i.lllIllIIIIlI[5] = 3;
        i.lllIllIIIIlI[6] = 0xC7 ^ 0xB6 ^ (0xC1 ^ 0xB4);
        i.lllIllIIIIlI[7] = 0x40 ^ 0x1B ^ (0x4C ^ 0x1B);
        i.lllIllIIIIlI[8] = 0x45 ^ 0x12 ^ (0x10 ^ 0x42);
        i.lllIllIIIIlI[9] = 0x20 ^ 0x60 ^ (0x7E ^ 0x38);
        i.lllIllIIIIlI[10] = 0x29 ^ 4 ^ (0x14 ^ 0x3E);
        i.lllIllIIIIlI[11] = 0x31 ^ 0x6B ^ (0xC5 ^ 0x91);
        i.lllIllIIIIlI[12] = 0xA9 ^ 0xA1;
        i.lllIllIIIIlI[13] = 0x6F ^ 0x50 ^ (0x8C ^ 0xBA);
        i.lllIllIIIIlI[14] = 0x1E ^ 7 ^ (0xCE ^ 0xC7);
        i.lllIllIIIIlI[15] = 0x33 ^ 0x16 ^ (0x80 ^ 0xAE);
    }

    public int w() {
        return this.groupId;
    }

    private i(String string2, int n3, int n4, String string3) {
        this.itemName = string2;
        this.groupId = n3;
        this.widgetId = n4;
        this.pile_name = string3;
    }

    private static String lIIIllIIllIIIlI(String var8, String var13) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lllIllIIIIlI[4], var12);
            return new String(var16.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public boolean z() {
        return Widgets.isVisible((Widget)Widgets.get((int)this.groupId, (int)this.widgetId));
    }
}

