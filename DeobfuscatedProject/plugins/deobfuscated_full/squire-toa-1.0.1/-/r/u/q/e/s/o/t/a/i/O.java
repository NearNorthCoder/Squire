/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
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

/* TASK: Kephri Gear Swapping -> KephrigearswappingTask */
@TaskDesc(name="Kephri Gear Swapping", register=true)
public class O
extends y {
    private static /* synthetic */ int[] lIlIIIIIIIIII;
    private static /* synthetic */ String[] lIIllllllllll;

    private static String lIllIlIllIlIIll(String var12, String var18) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var16 = var18.toCharArray();
        int var6 = lIlIIIIIIIIII[1];
        char[] var8 = var12.toCharArray();
        int var21 = var8.length;
        int var10 = lIlIIIIIIIIII[1];
        while (O.lIllIlIllIllIII(var10, var21)) {
            char var14 = var8[var10];
            var4.append((char)(var14 ^ var16[var6 % var16.length]));
            0;
            ++var6;
            ++var10;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static boolean lIllIlIllIlIllI(int n2) {
        return n2 != 0;
    }

    private static String lIllIlIllIlIIIl(String var15, String var13) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIIIII[6]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIlIIIIIIIIII[3], var22);
            return new String(var2.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIllIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIllIlIlII() {
        lIIllllllllll = new String[lIlIIIIIIIIII[5]];
        O.lIIllllllllll[O.lIlIIIIIIIIII[1]] = O."Soldier Scarab";
        O.lIIllllllllll[O.lIlIIIIIIIIII[2]] = O."Kephri";
        O.lIIllllllllll[O.lIlIIIIIIIIII[3]] = O."Arcane Scarab";
        O.lIIllllllllll[O.lIlIIIIIIIIII[4]] = O."Scarab Swarm";
    }

    @Inject
    public O(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static void lIllIlIllIlIlIl() {
        lIlIIIIIIIIII = new int[7];
        O.lIlIIIIIIIIII[0] = -1;
        O.lIlIIIIIIIIII[1] = (0x27 ^ 0x7A) & ~(0xA ^ 0x57);
        O.lIlIIIIIIIIII[2] = 1;
        O.lIlIIIIIIIIII[3] = 2;
        O.lIlIIIIIIIIII[4] = 3;
        O.lIlIIIIIIIIII[5] = 0x34 ^ 0x30;
        O.lIlIIIIIIIIII[6] = 62 + 84 - 28 + 72 ^ 78 + 40 - 47 + 111;
    }

    private static boolean lIllIlIllIlIlll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        int var7;
        String string2 = string;
        int n2 = lIlIIIIIIIIII[0];
        switch (string2.hashCode()) {
            case 829390592: {
                void var17;
                if (!O.lIllIlIllIlIllI(var17.equals(lIIllllllllll[lIlIIIIIIIIII[1]]) ? 1 : 0)) break;
                var7 = lIlIIIIIIIIII[1];
                0;
                if (3 > 0) break;
                return null;
            }
            case -2051065175: {
                void var17;
                if (!O.lIllIlIllIlIllI(var17.equals(lIIllllllllll[lIlIIIIIIIIII[2]]) ? 1 : 0)) break;
                var7 = lIlIIIIIIIIII[2];
                0;
                if (-1 <= 0) break;
                return null;
            }
            case 32389500: {
                void var17;
                if (!O.lIllIlIllIlIllI(var17.equals(lIIllllllllll[lIlIIIIIIIIII[3]]) ? 1 : 0)) break;
                var7 = lIlIIIIIIIIII[3];
                0;
                if (3 >= 1) break;
                return null;
            }
            case -2127561158: {
                void var17;
                if (!O.lIllIlIllIlIllI(var17.equals(lIIllllllllll[lIlIIIIIIIIII[4]]) ? 1 : 0)) break;
                var7 = lIlIIIIIIIIII[4];
            }
        }
        switch (var7) {
            case 0: {
                O var5;
                return var5.a(var5.aL.kephriGearSwap());
            }
            case 1: {
                O var5;
                return var5.a(var5.aL.kephriSpecialGear(), var5.aL.kephriGearSwap(), var5.aL.kephriSpecialReq());
            }
            case 2: {
                O var5;
                return var5.a(var5.aL.kephriMager());
            }
            case 3: {
                O var5;
                return var5.a(var5.aL.kephriSwarm());
            }
        }
        return new int[lIlIIIIIIIIII[1]];
    }

    static {
        O.lIllIlIllIlIlIl();
        O.lIllIlIllIlIlII();
    }

    private static String lIllIlIllIlIIlI(String var20, String var1) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIlIIIIIIIIII[3], var19);
            return new String(var11.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean C() {
        boolean bl;
        if (!O.lIllIlIllIlIlll(this.aL.kephriGearSwap().isSelected() ? 1 : 0) || !O.lIllIlIllIlIlll(this.aL.kephriMager().isSelected() ? 1 : 0) || O.lIllIlIllIlIllI(this.aL.kephriSwarm().isSelected() ? 1 : 0)) {
            bl = lIlIIIIIIIIII[2];
            0;
            if (1 == ((0x86 ^ 0xB6) & ~(0x46 ^ 0x76))) {
                return false;
            }
        } else {
            bl = lIlIIIIIIIIII[1];
        }
        return bl;
    }
}

