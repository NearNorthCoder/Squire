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

import -.r.u.q.e.s.o.t.a.i.y;
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

/* TASK: Warden gear swapping -> WardengearswappingTask */
@TaskDesc(name="Warden gear swapping", register=true)
public class H
extends y {
    private static /* synthetic */ int[] lIIllllIlIIIl;
    private static /* synthetic */ String[] lIIllllIlIIII;

    private static String lIllIlIIlIIllII(String var1, String var7) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var23 = var7.toCharArray();
        int var21 = lIIllllIlIIIl[0];
        char[] var14 = var1.toCharArray();
        int var13 = var14.length;
        int var9 = lIIllllIlIIIl[0];
        while (H.lIllIlIIlIlIlIl(var9, var13)) {
            char var15 = var14[var9];
            var18.append((char)(var15 ^ var23[var21 % var23.length]));
            0;
            ++var21;
            ++var9;
            0;
            if (2 < (62 + 160 - 48 + 9 ^ 144 + 56 - 36 + 15)) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean lIllIlIIlIlIIlI(Object object) {
        return object == null;
    }

    private static String lIllIlIIlIIllIl(String var17, String var22) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIIllllIlIIIl[2], var20);
            return new String(var5.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        H.lIllIlIIlIIllll();
        H.lIllIlIIlIIlllI();
    }

    @Override
    public boolean C() {
        int n2;
        if (!H.lIllIlIIlIlIIIl(this.aL.mageP2Warden().isSelected() ? 1 : 0) || !H.lIllIlIIlIlIIIl(this.aL.rangedP2Warden().isSelected() ? 1 : 0) || !H.lIllIlIIlIlIIIl(this.aL.normalCore().isSelected() ? 1 : 0) || H.lIllIlIIlIlIIII(this.aL.specialCore().isSelected() ? 1 : 0)) {
            n2 = lIIllllIlIIIl[1];
            0;
            
            }
        } else {
            n2 = lIIllllIlIIIl[0];
        }
        return n2 != 0;
    }

    private static boolean lIllIlIIlIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIIlIlIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        H var11;
        void var12;
        if (H.lIllIlIIlIlIIII(string.equals(lIIllllIlIIII[lIIllllIlIIIl[0]]) ? 1 : 0)) {
            return this.a(this.aL.specialCore(), this.aL.normalCore(), this.aL.specGearCore());
        }
        if (H.lIllIlIIlIlIIII(var12.equals(lIIllllIlIIII[lIIllllIlIIIl[1]]) ? 1 : 0)) {
            return var11.a(var11.aL.skullsGear());
        }
        if (H.lIllIlIIlIlIIIl(var12.equals(lIIllllIlIIII[lIIllllIlIIIl[2]]) ? 1 : 0) && H.lIllIlIIlIlIIIl(var12.equals(lIIllllIlIIII[lIIllllIlIIIl[3]]) ? 1 : 0)) {
            return new int[lIIllllIlIIIl[0]];
        }
        String[] stringArray = new String[lIIllllIlIIIl[1]];
        stringArray[H.lIIllllIlIIIl[0]] = var12;
        NPC var6 = NPCs.getNearest((String[])stringArray);
        if (H.lIllIlIIlIlIIlI(var6)) {
            return new int[lIIllllIlIIIl[0]];
        }
        int var3 = var6.getId();
        if (!H.lIllIlIIlIlIIll(var3, lIIllllIlIIIl[4]) || H.lIllIlIIlIlIlII(var3, lIIllllIlIIIl[5])) {
            return var11.a(var11.aL.rangedP2Warden());
        }
        if (!H.lIllIlIIlIlIIll(var3, lIIllllIlIIIl[6]) || H.lIllIlIIlIlIlII(var3, lIIllllIlIIIl[7])) {
            return var11.a(var11.aL.mageP2Warden());
        }
        if (!H.lIllIlIIlIlIIll(var3, lIIllllIlIIIl[8]) || !H.lIllIlIIlIlIIll(var3, lIIllllIlIIIl[9]) || !H.lIllIlIIlIlIIll(var3, lIIllllIlIIIl[10]) || H.lIllIlIIlIlIlII(var3, lIIllllIlIIIl[11])) {
            return var11.a(var11.aL.finalWardenSpec(), var11.aL.finalWardenGear(), var11.aL.specFinalReq());
        }
        return new int[lIIllllIlIIIl[0]];
    }

    private static String lIllIlIIlIIlIll(String var16, String var4) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIllllIlIIIl[13]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIIllllIlIIIl[2], var2);
            return new String(var10.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIIlIIllll() {
        lIIllllIlIIIl = new int[14];
        H.lIIllllIlIIIl[0] = (4 + 0 - -119 + 74 ^ 91 + 56 - 137 + 145) & (89 + 160 - 47 + 45 ^ 106 + 34 - 2 + 31 ^ -1);
        H.lIIllllIlIIIl[1] = 1;
        H.lIIllllIlIIIl[2] = 2;
        H.lIIllllIlIIIl[3] = 3;
        H.lIIllllIlIIIl[4] = 0xFFFFFFEF & 0x2DFD;
        H.lIIllllIlIIIl[5] = -(0xFFFFFAA6 & 0x155F) & (0xFFFFBFEF & 0x7DFF);
        H.lIIllllIlIIIl[6] = 0xFFFFFDEE & 0x2FFD;
        H.lIIllllIlIIIl[7] = 0xFFFFFDFD & 0x2FEB;
        H.lIIllllIlIIIl[8] = 0xFFFFBDF9 & 0x6FF7;
        H.lIIllllIlIIIl[9] = -(0xFFFFDE6F & 0x3399) & (0xFFFFFFFF & 0x3FFB);
        H.lIIllllIlIIIl[10] = 0xFFFFBFFA & 0x6DF7;
        H.lIIllllIlIIIl[11] = -(0xFFFFCEA6 & 0x335B) & (0xFFFFFFF7 & 0x2FFD);
        H.lIIllllIlIIIl[12] = 0x39 ^ 0x3D;
        H.lIIllllIlIIIl[13] = 0x95 ^ 0xA2 ^ (0x7B ^ 0x44);
    }

    private static boolean lIllIlIIlIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIIlIlIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIllIlIIlIIlllI() {
        lIIllllIlIIII = new String[lIIllllIlIIIl[12]];
        H.lIIllllIlIIII[H.lIIllllIlIIIl[0]] = H."Core";
        H.lIIllllIlIIII[H.lIIllllIlIIIl[1]] = H."Energy Siphon";
        H.lIIllllIlIIII[H.lIIllllIlIIIl[2]] = H."Tumeken's Warden";
        H.lIIllllIlIIII[H.lIIllllIlIIIl[3]] = H."Elidinis' Warden";
    }

    @Inject
    public H(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static boolean lIllIlIIlIlIIII(int n2) {
        return n2 != 0;
    }
}

