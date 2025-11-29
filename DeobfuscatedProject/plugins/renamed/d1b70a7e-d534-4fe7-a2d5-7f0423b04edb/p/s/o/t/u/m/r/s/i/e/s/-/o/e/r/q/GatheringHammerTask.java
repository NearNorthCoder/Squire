/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l_Unknown;

/* TASK: Gathering hammer -> GatheringhammerTask */
@TaskDesc(name="Gathering hammer", priority=100, blocking=true)
public class GatheringHammerTask
extends l_Unknown {
    private static /* synthetic */ String[] lIIllIllllllI;
    private static /* synthetic */ int[] lIIllIlllllll;

    @Override
    public boolean ak() {
        boolean bl;
        if (r.lIllIIlIIIIIIIl(this.ar.t() ? 1 : 0)) {
            bl = lIIllIlllllll[0];
            0;
            if ((0xAA ^ 0x9F ^ (0x26 ^ 0x17)) == ((0xC3 ^ 0x9A ^ (0x44 ^ 0xA)) & (10 + 136 - 101 + 111 ^ 5 + 79 - 77 + 132 ^ -1))) {
                return ((0x90 ^ 0xB0 ^ (0x1D ^ 2)) & (0x95 ^ 0x8F ^ (0x3D ^ 0x18) ^ -1) & ((0x24 ^ 0x3D ^ (0x14 ^ 0x55)) & (221 + 101 - 293 + 210 ^ 128 + 20 - 70 + 105 ^ -1) ^ -1)) != 0;
            }
        } else {
            bl = lIIllIlllllll[1];
        }
        return bl;
    }

    private static boolean lIllIIlIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected r(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static void lIllIIIllllllll() {
        lIIllIllllllI = new String[lIIllIlllllll[3]];
        r.lIIllIllllllI[r.lIIllIlllllll[1]] = r."Drop";
        r.lIIllIllllllI[r.lIIllIlllllll[0]] = r."Take";
    }

    private static boolean lIllIIlIIIIIIll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        r var3;
        int[] nArray = new int[lIIllIlllllll[0]];
        nArray[r.lIIllIlllllll[1]] = lIIllIlllllll[2];
        int n2 = Inventory.getCount((int[])nArray);
        if (r.lIllIIlIIIIIIlI(n2, lIIllIlllllll[0])) {
            int[] nArray2 = new int[lIIllIlllllll[0]];
            nArray2[r.lIIllIlllllll[1]] = lIIllIlllllll[2];
            Inventory.getFirst((int[])nArray2).interact(lIIllIllllllI[lIIllIlllllll[1]]);
            return lIIllIlllllll[0];
        }
        c var14 = var3.ar.N();
        TileObject var10 = var14.R();
        if (r.lIllIIlIIIIIIll(var10) && r.lIllIIlIIIIIIIl(var3.au.a((Locatable)var10) ? 1 : 0)) {
            var10.interact(lIIllIllllllI[lIIllIlllllll[0]]);
            return lIIllIlllllll[0];
        }
        this.au.b(var2_2.Y());
        0;
        return lIIllIlllllll[1];
    }

    private static String lIllIIIllllllIl(String var16, String var5) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIIllIlllllll[4]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIIllIlllllll[3], var11);
            return new String(var12.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlllllllI(String var7, String var1) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var8 = var1.toCharArray();
        int var17 = lIIllIlllllll[1];
        char[] var9 = var7.toCharArray();
        int var15 = var9.length;
        int var4 = lIIllIlllllll[1];
        while (r.lIllIIlIIIIIlII(var4, var15)) {
            char var13 = var9[var4];
            var2.append((char)(var13 ^ var8[var17 % var8.length]));
            0;
            ++var17;
            ++var4;
            0;
            if (-1 <= 3) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static boolean lIllIIlIIIIIIIl(int n2) {
        return n2 == 0;
    }

    static {
        r.lIllIIlIIIIIIII();
        r.lIllIIIllllllll();
    }

    private static void lIllIIlIIIIIIII() {
        lIIllIlllllll = new int[5];
        r.lIIllIlllllll[0] = 1;
        r.lIIllIlllllll[1] = (0xB9 ^ 0x8B) & ~(0x99 ^ 0xAB);
        r.lIIllIlllllll[2] = 0xFFFF8F6F & 0x79BB;
        r.lIIllIlllllll[3] = 2;
        r.lIIllIlllllll[4] = 13 + 8 - -23 + 109 ^ 6 + 39 - 13 + 113;
    }

    private static boolean lIllIIlIIIIIIlI(int n2, int n3) {
        return n2 > n3;
    }
}

