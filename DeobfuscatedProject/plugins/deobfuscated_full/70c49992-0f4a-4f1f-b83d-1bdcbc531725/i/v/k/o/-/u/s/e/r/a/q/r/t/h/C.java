/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.items.Inventory
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.items.Inventory;

/* TASK: Swapping bolts -> SwapBoltsTask */
@TaskDesc(name="Swapping bolts", priority=50)
public class C
extends w {
    private static /* synthetic */ String[] lIlIllIIIlIII;
    private static final /* synthetic */ int cl;
    private static /* synthetic */ int[] lIlIllIIIlIIl;

    private static boolean llIIIIIIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIIIlIIlIl(int n2) {
        return n2 > 0;
    }

    private static void llIIIIIIIlIIIlI() {
        lIlIllIIIlIIl = new int[9];
        C.lIlIllIIIlIIl[0] = 1;
        C.lIlIllIIIlIIl[1] = (0xBC ^ 0x86 ^ (0x24 ^ 0x3F)) & (0x29 ^ 0x13 ^ (0xB1 ^ 0xAA) ^ -1);
        C.lIlIllIIIlIIl[2] = 2;
        C.lIlIllIIIlIIl[3] = 3;
        C.lIlIllIIIlIIl[4] = 0x7C ^ 0x38 ^ (0x10 ^ 0x50);
        C.lIlIllIIIlIIl[5] = 0xBD ^ 0xB8;
        C.lIlIllIIIlIIl[6] = 0x3B ^ 0x18;
        C.lIlIllIIIlIIl[7] = 0x22 ^ 0x75 ^ (0x24 ^ 0x75);
        C.lIlIllIIIlIIl[8] = 0xA3 ^ 0x9F ^ (0x33 ^ 7);
    }

    private static void llIIIIIIIlIIIIl() {
        lIlIllIIIlIII = new String[lIlIllIIIlIIl[7]];
        C.lIlIllIIIlIII[C.lIlIllIIIlIIl[1]] = C."Wield";
        C.lIlIllIIIlIII[C.lIlIllIIIlIIl[0]] = C."Wield";
        C.lIlIllIIIlIII[C.lIlIllIIIlIIl[2]] = C."(e)";
        C.lIlIllIIIlIII[C.lIlIllIIIlIIl[3]] = C."diamond";
        C.lIlIllIIIlIII[C.lIlIllIIIlIIl[4]] = C."(e)";
        C.lIlIllIIIlIII[C.lIlIllIIIlIIl[5]] = C."ruby";
    }

    private static boolean llIIIIIIIlIIlII(Object object) {
        return object == null;
    }

    private static String llIIIIIIIlIIIII(String var9, String var3) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var13 = var3.toCharArray();
        int var16 = lIlIllIIIlIIl[1];
        char[] var10 = var9.toCharArray();
        int var17 = var10.length;
        int var12 = lIlIllIIIlIIl[1];
        while (C.llIIIIIIIlIlIII(var12, var17)) {
            char var7 = var10[var12];
            var11.append((char)(var7 ^ var13[var16 % var13.length]));
            0;
            ++var16;
            ++var12;
            0;
            if (((0xE0 ^ 0xB3 ^ (0x90 ^ 0x94)) & (0xDE ^ 0xC7 ^ (0x4A ^ 4) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static String llIIIIIIIIlllll(String var5, String var6) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIlIllIIIlIIl[8]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIlIllIIIlIIl[2], var8);
            return new String(var18.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    static {
        C.llIIIIIIIlIIIlI();
        C.llIIIIIIIlIIIIl();
        cl = lIlIllIIIlIIl[6];
    }

    private static boolean llIIIIIIIlIIllI(int n2) {
        return n2 != 0;
    }

    private static int llIIIIIIIlIIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var7_6;
        int n2;
        void var2;
        NPC nPC = this.cg.c(lIlIllIIIlIIl[0]);
        if (C.llIIIIIIIlIIlII(nPC)) {
            return lIlIllIIIlIIl[1];
        }
        int var4 = var2.getHealthScale();
        int var15 = var2.getHealthRatio();
        double var14 = (double)var15 / (double)var4 * 100.0;
        if (C.llIIIIIIIlIIlIl(C.llIIIIIIIlIIIll(var14, 35.0))) {
            n2 = lIlIllIIIlIIl[0];
            0;
            if (2 <= 0) {
                return false;
            }
        } else {
            n2 = lIlIllIIIlIIl[1];
        }
        int var19 = n2;
        Item var1 = null;
        if (C.llIIIIIIIlIIllI(var19)) {
            var1 = Inventory.getFirst(item -> {
                int n2;
                if (C.llIIIIIIIlIIllI(item.getName().contains(lIlIllIIIlIII[lIlIllIIIlIIl[4]]) ? 1 : 0) && C.llIIIIIIIlIIllI(item.getName().toLowerCase().contains(lIlIllIIIlIII[lIlIllIIIlIIl[5]]) ? 1 : 0)) {
                    n2 = lIlIllIIIlIIl[0];
                    0;
                    if (1 < 0) {
                        return ((34 + 39 - 44 + 157 ^ 89 + 167 - 236 + 149) & (0x77 ^ 0x59 ^ (0x71 ^ 0x4C) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIllIIIlIIl[1];
                }
                return n2 != 0;
            });
            0;
            if (2 >= (33 + 140 - 166 + 140 ^ 145 + 4 - 16 + 18)) {
                return false;
            }
        } else {
            var1 = Inventory.getFirst(item -> {
                int n2;
                if (C.llIIIIIIIlIIllI(item.getName().contains(lIlIllIIIlIII[lIlIllIIIlIIl[2]]) ? 1 : 0) && C.llIIIIIIIlIIllI(item.getName().toLowerCase().contains(lIlIllIIIlIII[lIlIllIIIlIIl[3]]) ? 1 : 0)) {
                    n2 = lIlIllIIIlIIl[0];
                    0;
                    if (-1 > 0) {
                        return false;
                    }
                } else {
                    n2 = lIlIllIIIlIIl[1];
                }
                return n2 != 0;
            });
        }
        if (C.llIIIIIIIlIIlII(var1)) {
            return lIlIllIIIlIIl[1];
        }
        String[] stringArray = new String[lIlIllIIIlIIl[0]];
        stringArray[C.lIlIllIIIlIIl[1]] = lIlIllIIIlIII[lIlIllIIIlIIl[1]];
        if (C.llIIIIIIIlIIlll(var1.hasAction(stringArray) ? 1 : 0)) {
            return lIlIllIIIlIIl[1];
        }
        var7_6.interact(lIlIllIIIlIII[lIlIllIIIlIIl[0]]);
        return lIlIllIIIlIIl[0];
    }

    @Inject
    protected C(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean llIIIIIIIlIlIII(int n2, int n3) {
        return n2 < n3;
    }
}

