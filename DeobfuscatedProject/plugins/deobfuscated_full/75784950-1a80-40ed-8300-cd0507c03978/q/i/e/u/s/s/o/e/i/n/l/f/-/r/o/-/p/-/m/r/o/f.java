/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 */
package q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.l;

/* TASK: PrayFlick -> PrayflickTask */
@TaskDesc(name="PrayFlick", priority=0x7FFFFFFE)
public class f
extends Task {
    private static /* synthetic */ String[] lIIIIIIIllIII;
    private static /* synthetic */ int[] lIIIIIIIllIlI;
    private final /* synthetic */ SquireMoonsOfPerilConfig N;

    private static String lIIlIllIllIIlIl(String var6, String var5) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIIIIIIIllIlI[2], var9);
            return new String(var7.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static void lIIlIllIllIlIII() {
        lIIIIIIIllIlI = new int[9];
        f.lIIIIIIIllIlI[0] = 1;
        f.lIIIIIIIllIlI[1] = (130 + 137 - 141 + 33 ^ 122 + 20 - -39 + 0) & (30 + 88 - 56 + 74 ^ 152 + 136 - 286 + 160 ^ -1);
        f.lIIIIIIIllIlI[2] = 2;
        f.lIIIIIIIllIlI[3] = 3;
        f.lIIIIIIIllIlI[4] = 0x6C ^ 0x68;
        f.lIIIIIIIllIlI[5] = 0x65 ^ 0x7B ^ (0x24 ^ 0x3F);
        f.lIIIIIIIllIlI[6] = 0x39 ^ 0x3F;
        f.lIIIIIIIllIlI[7] = 0x32 ^ 0x7E ^ (4 ^ 0x4F);
        f.lIIIIIIIllIlI[8] = 0x58 ^ 0x50;
    }

    private static boolean lIIlIllIllIllII(int n) {
        return n >= 0;
    }

    private static String lIIlIllIllIIIll(String var12, String var4) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var16 = var4.toCharArray();
        int var18 = lIIIIIIIllIlI[1];
        char[] var17 = var12.toCharArray();
        int var8 = var17.length;
        int var3 = lIIIIIIIllIlI[1];
        while (f.lIIlIllIlllIIIl(var3, var8)) {
            char var20 = var17[var3];
            var2.append((char)(var20 ^ var16[var18 % var16.length]));
            0;
            ++var18;
            ++var3;
            0;
            if (3 != -1) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    @Inject
    public f(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.N = squireMoonsOfPerilConfig;
    }

    private static boolean lIIlIllIllIlIll(int n) {
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var14;
        void var13;
        double d2 = l.k();
        double d3 = this.N.eatAtHpPercent();
        String[] stringArray = new String[lIIIIIIIllIlI[0]];
        stringArray[f.lIIIIIIIllIlI[1]] = lIIIIIIIllIII[lIIIIIIIllIlI[1]];
        if (f.lIIlIllIllIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIIIIIIllIlI[0]];
            stringArray2[f.lIIIIIIIllIlI[1]] = lIIIIIIIllIII[lIIIIIIIllIlI[0]];
            Inventory.getFirst((String[])stringArray2).interact(lIIIIIIIllIII[lIIIIIIIllIlI[2]]);
            return lIIIIIIIllIlI[1];
        }
        if (f.lIIlIllIllIllII(f.lIIlIllIllIlIIl((double)var13, (double)var14))) {
            return lIIIIIIIllIlI[1];
        }
        String[] stringArray3 = new String[lIIIIIIIllIlI[0]];
        stringArray3[f.lIIIIIIIllIlI[1]] = lIIIIIIIllIII[lIIIIIIIllIlI[3]];
        if (f.lIIlIllIllIlIll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
            System.out.println(lIIIIIIIllIII[lIIIIIIIllIlI[4]]);
            SquireMoonsOfPeril.g = lIIIIIIIllIII[lIIIIIIIllIlI[5]];
            String[] stringArray4 = new String[lIIIIIIIllIlI[0]];
            stringArray4[f.lIIIIIIIllIlI[1]] = lIIIIIIIllIII[lIIIIIIIllIlI[6]];
            Inventory.getFirst((String[])stringArray4).interact(lIIIIIIIllIII[lIIIIIIIllIlI[7]]);
            return lIIIIIIIllIlI[0];
        }
        return lIIIIIIIllIlI[0];
    }

    private static int lIIlIllIllIlIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static void lIIlIllIllIIllI() {
        lIIIIIIIllIII = new String[lIIIIIIIllIlI[8]];
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[1]] = f."Vial";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[0]] = f."Vial";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[2]] = f."Drop";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[3]] = f."Cooked bream";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[4]] = f."Eating";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[5]] = f."Eating";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[6]] = f."Cooked bream";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[7]] = f."Eat";
    }

    static {
        f.lIIlIllIllIlIII();
        f.lIIlIllIllIIllI();
    }

    private static boolean lIIlIllIlllIIIl(int n, int n2) {
        return n < n2;
    }

    private static String lIIlIllIllIIlII(String var15, String var19) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lIIIIIIIllIlI[8]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lIIIIIIIllIlI[2], var1);
            return new String(var21.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }
}

