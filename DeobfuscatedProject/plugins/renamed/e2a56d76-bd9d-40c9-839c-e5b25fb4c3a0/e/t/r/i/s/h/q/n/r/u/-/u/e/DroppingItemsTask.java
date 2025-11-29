/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a_Unknown;
import e.t.r.i.s.h.q.n.r.u.-.u.e.EEnum;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;

/* TASK: Dropping Items -> DroppingitemsTask */
@TaskDesc(name="Dropping Items", priority=1)
public class DroppingItemsTask
extends j_Unknown {
    private static /* synthetic */ String[] lllIllllIIIl;
    private static /* synthetic */ int[] lllIllllIlII;

    static {
        C.lIIIlllIIIIIlIl();
        C.lIIIlllIIIIIIlI();
    }

    private static String lIIIlllIIIIIIIl(String var13, String var10) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var4 = var10.toCharArray();
        int var6 = lllIllllIlII[1];
        char[] var1 = var13.toCharArray();
        int var9 = var1.length;
        int var14 = lllIllllIlII[1];
        while (C.lIIIlllIIIIIlll(var14, var9)) {
            char var12 = var1[var14];
            var2.append((char)(var12 ^ var4[var6 % var4.length]));
            0;
            ++var6;
            ++var14;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    @Override
    protected boolean x() {
        int[] nArray = new int[lllIllllIlII[0]];
        nArray[C.lllIllllIlII[1]] = lllIllllIlII[2];
        if (C.lIIIlllIIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllIllllIlII[0]];
            nArray2[C.lllIllllIlII[1]] = lllIllllIlII[2];
            Inventory.getFirst((int[])nArray2).interact(lllIllllIIIl[lllIllllIlII[1]]);
            return lllIllllIlII[0];
        }
        int[] nArray3 = new int[lllIllllIlII[0]];
        nArray3[C.lllIllllIlII[1]] = lllIllllIlII[3];
        if (C.lIIIlllIIIIIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            C var20;
            if (C.lIIIlllIIIIIllI(var20.z().buryBones() ? 1 : 0)) {
                int[] nArray4 = new int[lllIllllIlII[0]];
                nArray4[C.lllIllllIlII[1]] = lllIllllIlII[3];
                Inventory.getFirst((int[])nArray4).interact(lllIllllIIIl[lllIllllIlII[0]]);
                0;
                if (1 <= -1) {
                    return ((1 + 43 - -44 + 39 ^ (0x39 ^ 0x64)) & (159 + 8 - 46 + 49 ^ 59 + 120 - 74 + 31 ^ -1)) != 0;
                }
            } else {
                int[] nArray5 = new int[lllIllllIlII[0]];
                nArray5[C.lllIllllIlII[1]] = lllIllllIlII[3];
                Inventory.getFirst((int[])nArray5).interact(lllIllllIIIl[lllIllllIlII[4]]);
            }
            return lllIllllIlII[0];
        }
        return lllIllllIlII[1];
    }

    private static boolean lIIIlllIIIIIllI(int n2) {
        return n2 != 0;
    }

    private static String lIIIllIllllllll(String var16, String var15) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lllIllllIlII[4], var7);
            return new String(var17.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Inject
    public C(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
    }

    private static void lIIIlllIIIIIlIl() {
        lllIllllIlII = new int[7];
        C.lllIllllIlII[0] = 1;
        C.lllIllllIlII[1] = (0x25 ^ 0x73 ^ (0x11 ^ 0x78)) & (4 ^ 0x58 ^ (0x48 ^ 0x2B) ^ -1);
        C.lllIllllIlII[2] = -(0xFFFFD5AF & 0x7B56) & (0xFFFFFFFF & 0x77FF);
        C.lllIllllIlII[3] = -(0xFFFFF67B & 0x7DB6) & (0xFFFFFF3F & 0x76FF);
        C.lllIllllIlII[4] = 2;
        C.lllIllllIlII[5] = 3;
        C.lllIllllIlII[6] = 130 + 170 - 298 + 203 ^ 55 + 184 - 111 + 69;
    }

    private static void lIIIlllIIIIIIlI() {
        lllIllllIIIl = new String[lllIllllIlII[5]];
        C.lllIllllIIIl[C.lllIllllIlII[1]] = C."Drop";
        C.lllIllllIIIl[C.lllIllllIlII[0]] = C."Bury";
        C.lllIllllIIIl[C.lllIllllIlII[4]] = C."Drop";
    }

    private static String lIIIllIllllllIl(String var19, String var18) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lllIllllIlII[6]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lllIllllIlII[4], var3);
            return new String(var5.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIIIIIlll(int n2, int n3) {
        return n2 < n3;
    }
}

