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
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l;

/* TASK: Gathering harpoon -> GatheringharpoonTask */
@TaskDesc(name="Gathering harpoon", priority=100, blocking=true)
public class s
extends l {
    private static /* synthetic */ String[] lIIllIllIIIlI;
    private static /* synthetic */ int[] lIIllIllIlIlI;

    @Override
    public boolean ak() {
        boolean bl;
        if (s.lIllIIIlIlIIIIl(this.ar.m() ? 1 : 0)) {
            bl = lIIllIllIlIlI[0];
            0;
            if (-(0x9E ^ 0x9A) >= 0) {
                return false;
            }
        } else {
            bl = lIIllIllIlIlI[1];
        }
        return bl;
    }

    private static boolean lIllIIIlIlIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        s var14;
        int n2 = Inventory.getCount(item -> item.getName().toLowerCase().endsWith(lIIllIllIIIlI[lIIllIllIlIlI[3]]));
        if (s.lIllIIIlIlIIIlI(n2, lIIllIllIlIlI[0])) {
            int[] nArray = new int[lIIllIllIlIlI[0]];
            nArray[s.lIIllIllIlIlI[1]] = lIIllIllIlIlI[2];
            Inventory.getFirst((int[])nArray).interact(lIIllIllIIIlI[lIIllIllIlIlI[1]]);
            return lIIllIllIlIlI[0];
        }
        c var2 = var14.ar.N();
        TileObject var16 = var2.S();
        if (s.lIllIIIlIlIIIll(var16) && s.lIllIIIlIlIIIIl(var14.au.a((Locatable)var16) ? 1 : 0)) {
            var16.interact(lIIllIllIIIlI[lIIllIllIlIlI[0]]);
            return lIIllIllIlIlI[0];
        }
        this.au.b(var2_2.Y());
        0;
        return lIIllIllIlIlI[0];
    }

    private static void lIllIIIlIlIIIII() {
        lIIllIllIlIlI = new int[5];
        s.lIIllIllIlIlI[0] = 1;
        s.lIIllIllIlIlI[1] = (138 + 58 - 138 + 83 ^ 10 + 26 - -112 + 2) & (0x38 ^ 0x4A ^ (0xC4 ^ 0xAD) ^ -1);
        s.lIIllIllIlIlI[2] = 0xFFFFEFBF & 0x1177;
        s.lIIllIllIlIlI[3] = 2;
        s.lIIllIllIlIlI[4] = 3;
    }

    @Inject
    protected s(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static void lIllIIIlIIlllll() {
        lIIllIllIIIlI = new String[lIIllIllIlIlI[4]];
        s.lIIllIllIIIlI[s.lIIllIllIlIlI[1]] = s."Drop";
        s.lIIllIllIIIlI[s.lIIllIllIlIlI[0]] = s."Take";
        s.lIIllIllIIIlI[s.lIIllIllIlIlI[3]] = s."harpoon";
    }

    private static boolean lIllIIIlIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlIlIIIll(Object object) {
        return object != null;
    }

    static {
        s.lIllIIIlIlIIIII();
        s.lIllIIIlIIlllll();
    }

    private static boolean lIllIIIlIlIIIIl(int n2) {
        return n2 == 0;
    }

    private static String lIllIIIlIIIlIIl(String var17, String var8) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lIIllIllIlIlI[3], var5);
            return new String(var9.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlIIllllI(String var7, String var13) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var12 = var13.toCharArray();
        int var6 = lIIllIllIlIlI[1];
        char[] var3 = var7.toCharArray();
        int var10 = var3.length;
        int var1 = lIIllIllIlIlI[1];
        while (s.lIllIIIlIlIIlII(var1, var10)) {
            char var15 = var3[var1];
            var4.append((char)(var15 ^ var12[var6 % var12.length]));
            0;
            ++var6;
            ++var1;
            0;
            if (((0x5A ^ 0x68) & ~(0x40 ^ 0x72)) == 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }
}

