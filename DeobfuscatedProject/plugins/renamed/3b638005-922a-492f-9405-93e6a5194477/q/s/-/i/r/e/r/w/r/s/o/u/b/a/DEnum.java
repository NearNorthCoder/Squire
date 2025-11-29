/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

public final class DEnum
extends Enum<d> {
    private static /* synthetic */ String[] llllIlIIlll;
    public static final /* synthetic */ /* enum */ d TORAG;
    private final /* synthetic */ int combatLevel;
    private static final /* synthetic */ d[] $VALUES;
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ /* enum */ d VERAC;
    public static final /* synthetic */ /* enum */ d DHAROK;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ d KARIL;
    public static final /* synthetic */ /* enum */ d GUTHAN;
    public static final /* synthetic */ /* enum */ d AHRIM;
    private static /* synthetic */ int[] llllIlIlIII;
    private final /* synthetic */ int killedVarbit;

    private static void lIllIlIllIIIll() {
        llllIlIIlll = new String[llllIlIlIII[29]];
        d.llllIlIIlll[d.llllIlIlIII[0]] = d."DHAROK";
        d.llllIlIIlll[d.llllIlIlIII[1]] = d."Dharok";
        d.llllIlIIlll[d.llllIlIlIII[6]] = d."GUTHAN";
        d.llllIlIIlll[d.llllIlIlIII[7]] = d."Guthan";
        d.llllIlIIlll[d.llllIlIlIII[11]] = d."KARIL";
        d.llllIlIIlll[d.llllIlIlIII[12]] = d."Karil";
        d.llllIlIIlll[d.llllIlIlIII[17]] = d."AHRIM";
        d.llllIlIIlll[d.llllIlIlIII[18]] = d."Ahrim";
        d.llllIlIIlll[d.llllIlIlIII[21]] = d."TORAG";
        d.llllIlIIlll[d.llllIlIlIII[22]] = d."Torag";
        d.llllIlIIlll[d.llllIlIlIII[25]] = d."VERAC";
        d.llllIlIIlll[d.llllIlIlIII[26]] = d."Verac";
    }

    private static String lIllIlIllIIIlI(String var2, String var20) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), llllIlIlIII[21]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(llllIlIlIII[6], var3);
            return new String(var12.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIllIIIII(String var23, String var22) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(llllIlIlIII[6], var14);
            return new String(var18.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.combatLevel;
    }

    private static boolean lIllIlIllIIlIl(Object object, Object object2) {
        return object != object2;
    }

    private d(String string2, int n3, WorldPoint worldPoint, int n4) {
        this.name = string2;
        this.combatLevel = n3;
        this.location = worldPoint;
        this.killedVarbit = n4;
    }

    private static boolean lIllIlIllIIlll(int n2) {
        return n2 != 0;
    }

    public int F() {
        return this.killedVarbit;
    }

    public static boolean a(Actor actor) {
        if (d.lIllIlIllIIlIl(actor.getInteracting(), Players.getLocal())) {
            return llllIlIlIII[0];
        }
        d[] var9 = d.values();
        int var1 = var9.length;
        int var17 = llllIlIlIII[0];
        while (d.lIllIlIllIIllI(var17, var1)) {
            Actor var4;
            d var11 = var9[var17];
            if (d.lIllIlIllIIlll(var4.getName().toLowerCase().contains(var11.C().toLowerCase()) ? 1 : 0)) {
                return llllIlIlIII[1];
            }
            ++var17;
            0;
            
            return ((221 + 185 - 348 + 192 ^ 65 + 126 - 108 + 86) & (0xE9 ^ 0x83 ^ (0x51 ^ 0x68) ^ -1)) != 0;
        }
        return llllIlIlIII[0];
    }

    private static boolean lIllIlIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static String lIllIlIllIIIIl(String var13, String var21) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var5 = var21.toCharArray();
        int var15 = llllIlIlIII[0];
        char[] var6 = var13.toCharArray();
        int var8 = var6.length;
        int var16 = llllIlIlIII[0];
        while (d.lIllIlIllIIllI(var16, var8)) {
            char var10 = var6[var16];
            var7.append((char)(var10 ^ var5[var15 % var5.length]));
            0;
            ++var15;
            ++var16;
            0;
            
            return null;
        }
        return String.valueOf(var7);
    }

    public String C() {
        return this.name;
    }

    private static void lIllIlIllIIlII() {
        llllIlIlIII = new int[30];
        d.llllIlIlIII[0] = (0xED ^ 0xC0) & ~(0x4B ^ 0x66);
        d.llllIlIlIII[1] = 1;
        d.llllIlIlIII[2] = 0xC4 ^ 0xB7;
        d.llllIlIlIII[3] = -(0xFFFFFE1B & 0x13ED) & (0xFFFF9FFF & Short.MAX_VALUE);
        d.llllIlIlIII[4] = -(0xFFFFE34E & 0x3DBF) & (0xFFFFEDFF & 0x3FEF);
        d.llllIlIlIII[5] = 0xFFFFFFFB & 0x1CE;
        d.llllIlIlIII[6] = 2;
        d.llllIlIlIII[7] = 3;
        d.llllIlIlIII[8] = 0xFFFFBFF9 & 0x4DFF;
        d.llllIlIlIII[9] = 0xFFFF9DF7 & 0x6EDB;
        d.llllIlIlIII[10] = 0xFFFF83FB & 0x7DCF;
        d.llllIlIlIII[11] = 0x3A ^ 0x3E;
        d.llllIlIlIII[12] = 0x7A ^ 0x7F;
        d.llllIlIlIII[13] = 0x2F ^ 0x4D;
        d.llllIlIlIII[14] = 0xFFFFFDFE & 0xFEF;
        d.llllIlIlIII[15] = 0xFFFFECFB & 0x1FCF;
        d.llllIlIlIII[16] = -(0xFFFFFE25 & 0x1FFB) & (0xFFFFDFFC & 0x3FEF);
        d.llllIlIlIII[17] = 0x8C ^ 0x9C ^ (0xB1 ^ 0xA7);
        d.llllIlIlIII[18] = 0xB6 ^ 0xB1;
        d.llllIlIlIII[19] = 0xFFFF8CD9 & Short.MAX_VALUE;
        d.llllIlIlIII[20] = -(0xFFFFF61B & 0x7FE5) & (0xFFFFFFCD & 0x77FB);
        d.llllIlIlIII[21] = 6 ^ 0xE;
        d.llllIlIlIII[22] = 46 + 44 - -17 + 23 ^ 104 + 105 - 96 + 26;
        d.llllIlIlIII[23] = 0xFFFFEFF1 & 0x1DEF;
        d.llllIlIlIII[24] = 0xFFFFC3DF & 0x3DED;
        d.llllIlIlIII[25] = 12 + 100 - -24 + 21 ^ 68 + 96 - 145 + 132;
        d.llllIlIlIII[26] = 0x8C ^ 0x87;
        d.llllIlIlIII[27] = 0xFFFFAFF7 & 0x5DED;
        d.llllIlIlIII[28] = -(0xFFFFA4FB & 0x5F06) & (0xFFFFF5FF & 0xFCF);
        d.llllIlIlIII[29] = 0xAD ^ 0xA4 ^ (0x71 ^ 0x74);
    }

    static {
        d.lIllIlIllIIlII();
        d.lIllIlIllIIIll();
        DHAROK = new d(llllIlIIlll[llllIlIlIII[1]], llllIlIlIII[2], new WorldPoint(llllIlIlIII[3], llllIlIlIII[4], llllIlIlIII[0]), llllIlIlIII[5]);
        GUTHAN = new d(llllIlIIlll[llllIlIlIII[7]], llllIlIlIII[2], new WorldPoint(llllIlIlIII[8], llllIlIlIII[9], llllIlIlIII[0]), llllIlIlIII[10]);
        KARIL = new d(llllIlIIlll[llllIlIlIII[12]], llllIlIlIII[13], new WorldPoint(llllIlIlIII[14], llllIlIlIII[15], llllIlIlIII[0]), llllIlIlIII[16]);
        AHRIM = new d(llllIlIIlll[llllIlIlIII[18]], llllIlIlIII[13], new WorldPoint(llllIlIlIII[14], llllIlIlIII[19], llllIlIlIII[0]), llllIlIlIII[20]);
        TORAG = new d(llllIlIIlll[llllIlIlIII[22]], llllIlIlIII[2], new WorldPoint(llllIlIlIII[23], llllIlIlIII[9], llllIlIlIII[0]), llllIlIlIII[24]);
        VERAC = new d(llllIlIIlll[llllIlIlIII[26]], llllIlIlIII[2], new WorldPoint(llllIlIlIII[27], llllIlIlIII[4], llllIlIlIII[0]), llllIlIlIII[28]);
        d[] dArray = new d[llllIlIlIII[17]];
        dArray[d.llllIlIlIII[0]] = DHAROK;
        dArray[d.llllIlIlIII[1]] = GUTHAN;
        dArray[d.llllIlIlIII[6]] = KARIL;
        dArray[d.llllIlIlIII[7]] = AHRIM;
        dArray[d.llllIlIlIII[11]] = TORAG;
        dArray[d.llllIlIlIII[12]] = VERAC;
        $VALUES = dArray;
    }

    public WorldPoint D() {
        return this.location;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }
}

