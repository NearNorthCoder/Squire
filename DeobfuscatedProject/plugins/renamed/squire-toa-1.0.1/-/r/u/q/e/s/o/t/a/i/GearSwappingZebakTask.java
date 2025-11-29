/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.y_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;

/* TASK: Gear Swapping Zebak -> GearswappingzebakTask */
@TaskDesc(name="Gear Swapping Zebak", register=true)
public class GearSwappingZebakTask
extends y_Unknown {
    private static /* synthetic */ int[] lIIlllllIllII;
    private static /* synthetic */ String[] lIIlllllIlIll;

    private static boolean lIllIlIlIIllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIlIIlIllI() {
        lIIlllllIlIll = new String[lIIlllllIllII[4]];
        Q.lIIlllllIlIll[Q.lIIlllllIllII[0]] = Q."Zebak";
        Q.lIIlllllIlIll[Q.lIIlllllIllII[2]] = Q."Jug";
        Q.lIIlllllIlIll[Q.lIIlllllIllII[1]] = Q."Wave";
        Q.lIIlllllIlIll[Q.lIIlllllIllII[3]] = Q."Crocodile";
    }

    static {
        Q.lIllIlIlIIlIlll();
        Q.lIllIlIlIIlIllI();
    }

    @Inject
    public Q(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static String lIllIlIlIIlIlII(String var5, String var4) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIlllllIllII[5]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(lIIlllllIllII[1], var20);
            return new String(var19.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIlIIllIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean C() {
        boolean bl;
        if (!Q.lIllIlIlIIllIlI(this.aL.gearSwapZebak().isSelected() ? 1 : 0) || Q.lIllIlIlIIllIII(this.aL.gearSwapCrocodile().isSelected() ? 1 : 0)) {
            bl = lIIlllllIllII[2];
            0;
            if (((0x35 ^ 0x1F ^ (0x32 ^ 0x37)) & (99 + 44 - 65 + 49 ^ (2 ^ 0x52) ^ -1)) > 0) {
                return ((156 + 155 - 309 + 237 ^ 122 + 154 - 142 + 59) & (0x4B ^ 0x23 ^ (0x6D ^ 0x2B) ^ -1)) != 0;
            }
        } else {
            bl = lIIlllllIllII[0];
        }
        return bl;
    }

    private static void lIllIlIlIIlIlll() {
        lIIlllllIllII = new int[6];
        Q.lIIlllllIllII[0] = (0xE1 ^ 0x82 ^ (0x46 ^ 0x7A)) & (38 + 203 - 193 + 156 ^ 80 + 80 - 101 + 88 ^ -1);
        Q.lIIlllllIllII[1] = 2;
        Q.lIIlllllIllII[2] = 1;
        Q.lIIlllllIllII[3] = 3;
        Q.lIIlllllIllII[4] = 113 + 52 - 127 + 110 ^ 59 + 60 - 99 + 124;
        Q.lIIlllllIllII[5] = 0x23 ^ 0x2B;
    }

    private static boolean lIllIlIlIIllIIl(Object object) {
        return object != null;
    }

    private static String lIllIlIlIIlIIll(String var7, String var18) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIIlllllIllII[1], var13);
            return new String(var17.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIlIIlIlIl(String var1, String var14) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var12 = var14.toCharArray();
        int var16 = lIIlllllIllII[0];
        char[] var8 = var1.toCharArray();
        int var9 = var8.length;
        int var10 = lIIlllllIllII[0];
        while (Q.lIllIlIlIIllIll(var10, var9)) {
            char var2 = var8[var10];
            var3.append((char)(var2 ^ var12[var16 % var12.length]));
            0;
            ++var16;
            ++var10;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        void var6;
        Q var21;
        if (Q.lIllIlIlIIllIII(string.equals(lIIlllllIlIll[lIIlllllIllII[0]]) ? 1 : 0)) {
            String[] stringArray = new String[lIIlllllIllII[1]];
            stringArray[Q.lIIlllllIllII[0]] = lIIlllllIlIll[lIIlllllIllII[2]];
            stringArray[Q.lIIlllllIllII[2]] = lIIlllllIlIll[lIIlllllIllII[1]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (Q.lIllIlIlIIllIIl(nPC)) {
                return this.a(this.aL.gearSwapZebak());
            }
            return var21.a(var21.aL.specGearZebak(), var21.aL.gearSwapZebak(), var21.aL.specGearZebakReq());
        }
        if (Q.lIllIlIlIIllIII(var6.equals(lIIlllllIlIll[lIIlllllIllII[3]]) ? 1 : 0)) {
            return var21.a(var21.aL.gearSwapCrocodile());
        }
        return new int[lIIlllllIllII[0]];
    }
}

