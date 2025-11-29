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

    private static String llIIIIIIIlIIIII(String llllllllllllllIllIlIIllIlllIlIIl, String llllllllllllllIllIlIIllIlllIIIll) {
        llllllllllllllIllIlIIllIlllIlIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIllIlllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIllIlllIIlll = new StringBuilder();
        char[] llllllllllllllIllIlIIllIlllIIllI = llllllllllllllIllIlIIllIlllIIIll.toCharArray();
        int llllllllllllllIllIlIIllIlllIIlIl = lIlIllIIIlIIl[1];
        char[] llllllllllllllIllIlIIllIllIlllll = llllllllllllllIllIlIIllIlllIlIIl.toCharArray();
        int llllllllllllllIllIlIIllIllIllllI = llllllllllllllIllIlIIllIllIlllll.length;
        int llllllllllllllIllIlIIllIllIlllIl = lIlIllIIIlIIl[1];
        while (C.llIIIIIIIlIlIII(llllllllllllllIllIlIIllIllIlllIl, llllllllllllllIllIlIIllIllIllllI)) {
            char llllllllllllllIllIlIIllIlllIlIlI = llllllllllllllIllIlIIllIllIlllll[llllllllllllllIllIlIIllIllIlllIl];
            llllllllllllllIllIlIIllIlllIIlll.append((char)(llllllllllllllIllIlIIllIlllIlIlI ^ llllllllllllllIllIlIIllIlllIIllI[llllllllllllllIllIlIIllIlllIIlIl % llllllllllllllIllIlIIllIlllIIllI.length]));
            0;
            ++llllllllllllllIllIlIIllIlllIIlIl;
            ++llllllllllllllIllIlIIllIllIlllIl;
            0;
            if (((0xE0 ^ 0xB3 ^ (0x90 ^ 0x94)) & (0xDE ^ 0xC7 ^ (0x4A ^ 4) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIllIlllIIlll);
    }

    private static String llIIIIIIIIlllll(String llllllllllllllIllIlIIllIlllllIIl, String llllllllllllllIllIlIIllIllllIllI) {
        try {
            SecretKeySpec llllllllllllllIllIlIIllIllllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIllIllllIllI.getBytes(StandardCharsets.UTF_8)), lIlIllIIIlIIl[8]), "DES");
            Cipher llllllllllllllIllIlIIllIlllllIll = Cipher.getInstance("DES");
            llllllllllllllIllIlIIllIlllllIll.init(lIlIllIIIlIIl[2], llllllllllllllIllIlIIllIllllllII);
            return new String(llllllllllllllIllIlIIllIlllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIllIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIllIlllllIlI) {
            llllllllllllllIllIlIIllIlllllIlI.printStackTrace();
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
        void llllllllllllllIllIlIIlllIIIIlIlI;
        NPC nPC = this.cg.c(lIlIllIIIlIIl[0]);
        if (C.llIIIIIIIlIIlII(nPC)) {
            return lIlIllIIIlIIl[1];
        }
        int llllllllllllllIllIlIIlllIIIIlIIl = llllllllllllllIllIlIIlllIIIIlIlI.getHealthScale();
        int llllllllllllllIllIlIIlllIIIIlIII = llllllllllllllIllIlIIlllIIIIlIlI.getHealthRatio();
        double llllllllllllllIllIlIIlllIIIIIlll = (double)llllllllllllllIllIlIIlllIIIIlIII / (double)llllllllllllllIllIlIIlllIIIIlIIl * 100.0;
        if (C.llIIIIIIIlIIlIl(C.llIIIIIIIlIIIll(llllllllllllllIllIlIIlllIIIIIlll, 35.0))) {
            n2 = lIlIllIIIlIIl[0];
            0;
            if (2 <= 0) {
                return ((0xCB ^ 0x95) & ~(0xC2 ^ 0x9C)) != 0;
            }
        } else {
            n2 = lIlIllIIIlIIl[1];
        }
        int llllllllllllllIllIlIIlllIIIIIllI = n2;
        Item llllllllllllllIllIlIIlllIIIIIlIl = null;
        if (C.llIIIIIIIlIIllI(llllllllllllllIllIlIIlllIIIIIllI)) {
            llllllllllllllIllIlIIlllIIIIIlIl = Inventory.getFirst(item -> {
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
                return ((124 + 175 - 108 + 57 ^ 84 + 56 - 66 + 101) & (129 + 30 - -2 + 51 ^ 93 + 11 - 92 + 119 ^ -1)) != 0;
            }
        } else {
            llllllllllllllIllIlIIlllIIIIIlIl = Inventory.getFirst(item -> {
                int n2;
                if (C.llIIIIIIIlIIllI(item.getName().contains(lIlIllIIIlIII[lIlIllIIIlIIl[2]]) ? 1 : 0) && C.llIIIIIIIlIIllI(item.getName().toLowerCase().contains(lIlIllIIIlIII[lIlIllIIIlIIl[3]]) ? 1 : 0)) {
                    n2 = lIlIllIIIlIIl[0];
                    0;
                    if (-1 > 0) {
                        return ((0xC7 ^ 0x99) & ~(0xD9 ^ 0x87)) != 0;
                    }
                } else {
                    n2 = lIlIllIIIlIIl[1];
                }
                return n2 != 0;
            });
        }
        if (C.llIIIIIIIlIIlII(llllllllllllllIllIlIIlllIIIIIlIl)) {
            return lIlIllIIIlIIl[1];
        }
        String[] stringArray = new String[lIlIllIIIlIIl[0]];
        stringArray[C.lIlIllIIIlIIl[1]] = lIlIllIIIlIII[lIlIllIIIlIIl[1]];
        if (C.llIIIIIIIlIIlll(llllllllllllllIllIlIIlllIIIIIlIl.hasAction(stringArray) ? 1 : 0)) {
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

