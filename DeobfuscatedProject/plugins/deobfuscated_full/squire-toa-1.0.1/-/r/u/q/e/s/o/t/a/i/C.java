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

/* TASK: Gear swapping for Akkha -> GearswappingforakkhaTask */
@TaskDesc(name="Gear swapping for Akkha", register=true)
public class C
extends y {
    private static /* synthetic */ String[] lIIllllIllIll;
    private static /* synthetic */ int[] lIIllllIlllII;
    private /* synthetic */ int aW;

    private static void lIllIlIIllIlIIl() {
        lIIllllIlllII = new int[10];
        C.lIIllllIlllII[0] = -1;
        C.lIIllllIlllII[1] = (0x10 ^ 0x56 ^ (0x9D ^ 0x96)) & (0x9F ^ 0xB3 ^ (0xF3 ^ 0x92) ^ -1);
        C.lIIllllIlllII[2] = 1;
        C.lIIllllIlllII[3] = -(0xFFFFFFA9 & 0x5177) & (0xFFFFFFFF & 0x7F2E);
        C.lIIllllIlllII[4] = 0xFFFFEF3F & 0x3ECF;
        C.lIIllllIlllII[5] = 0xFFFFFF16 & 0x2EF9;
        C.lIIllllIlllII[6] = -(0xFFFFC7D9 & 0x786F) & (0xFFFFEFDF & 0x7E7B);
        C.lIIllllIlllII[7] = 2;
        C.lIIllllIlllII[8] = 3;
        C.lIIllllIlllII[9] = 0x7B ^ 0x7E ^ (0x33 ^ 0x3E);
    }

    private static boolean lIllIlIIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIIllIlIll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean C() {
        int n2;
        if (!(C.lIllIlIIllIllII(this.aL.mageGearAkkha().isSelected() ? 1 : 0) && C.lIllIlIIllIllII(this.aL.meleeGearAkkha().isSelected() ? 1 : 0) && C.lIllIlIIllIllII(this.aL.rangeGearAkkha().isSelected() ? 1 : 0) && C.lIllIlIIllIllII(this.aL.akkhaFinalSpec().isSelected() ? 1 : 0) && !C.lIllIlIIllIlIlI(this.aL.akkhaFinalNormal().isSelected() ? 1 : 0))) {
            n2 = lIIllllIlllII[2];
            0;
            if (-1 != -1) {
                return ((146 + 63 - 67 + 21 ^ 31 + 139 - 166 + 177) & (0x62 ^ 0x59 ^ (0xA5 ^ 0x88) ^ -1)) != 0;
            }
        } else {
            n2 = lIIllllIlllII[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        C var13;
        void var10;
        if (C.lIllIlIIllIlIlI(string.equals(lIIllllIllIll[lIIllllIlllII[1]]) ? 1 : 0)) {
            return this.a(this.aL.shadowAttackStyle());
        }
        if (!C.lIllIlIIllIlIlI(var10.equals(lIIllllIllIll[lIIllllIlllII[2]]) ? 1 : 0) || C.lIllIlIIllIlIll(var13.aW, lIIllllIlllII[0])) {
            return new int[lIIllllIlllII[1]];
        }
        if (C.lIllIlIIllIlIll(var13.aW, lIIllllIlllII[3])) {
            return var13.a(var13.aL.mageGearAkkha());
        }
        if (C.lIllIlIIllIlIll(var13.aW, lIIllllIlllII[4])) {
            return var13.a(var13.aL.meleeGearAkkha());
        }
        if (C.lIllIlIIllIlIll(var13.aW, lIIllllIlllII[5])) {
            return var13.a(var13.aL.rangeGearAkkha());
        }
        if (C.lIllIlIIllIlIll(var13.aW, lIIllllIlllII[6])) {
            return var13.a(var13.aL.akkhaFinalSpec(), var13.aL.akkhaFinalNormal(), var13.aL.specGearAkkhaFinalReq());
        }
        return new int[lIIllllIlllII[1]];
    }

    private static String lIllIlIIllIIlll(String var15, String var11) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lIIllllIlllII[7], var7);
            return new String(var20.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIllIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean run() {
        String[] stringArray = new String[lIIllllIlllII[2]];
        stringArray[C.lIIllllIlllII[1]] = lIIllllIllIll[lIIllllIlllII[7]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (C.lIllIlIIllIllIl(nPC)) {
            return lIIllllIlllII[1];
        }
        this.aW = nPC.getId();
        return lIIllllIlllII[1];
    }

    private static String lIllIlIIllIIllI(String var17, String var2) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIIllllIlllII[9]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIIllllIlllII[7], var14);
            return new String(var18.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    @Inject
    public C(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
        this.aW = lIIllllIlllII[0];
    }

    private static String lIllIlIIllIIlIl(String var1, String var4) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var12 = var4.toCharArray();
        int var9 = lIIllllIlllII[1];
        char[] var21 = var1.toCharArray();
        int var3 = var21.length;
        int var8 = lIIllllIlllII[1];
        while (C.lIllIlIIllIlllI(var8, var3)) {
            char var6 = var21[var8];
            var19.append((char)(var6 ^ var12[var9 % var12.length]));
            0;
            ++var9;
            ++var8;
            0;
            if (-1 <= 2) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static void lIllIlIIllIlIII() {
        lIIllllIllIll = new String[lIIllllIlllII[8]];
        C.lIIllllIllIll[C.lIIllllIlllII[1]] = C."Akkha's Shadow";
        C.lIIllllIllIll[C.lIIllllIlllII[2]] = C."Akkha";
        C.lIIllllIllIll[C.lIIllllIlllII[7]] = C."Akkha";
    }

    private static boolean lIllIlIIllIllII(int n2) {
        return n2 == 0;
    }

    static {
        C.lIllIlIIllIlIIl();
        C.lIllIlIIllIlIII();
    }

    private static boolean lIllIlIIllIllIl(Object object) {
        return object == null;
    }
}

