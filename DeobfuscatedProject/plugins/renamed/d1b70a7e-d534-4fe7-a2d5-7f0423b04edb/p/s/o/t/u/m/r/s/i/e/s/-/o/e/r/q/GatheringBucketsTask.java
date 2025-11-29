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
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l_Unknown;

/* TASK: Gathering buckets -> GatheringbucketsTask */
@TaskDesc(name="Gathering buckets", priority=100, blocking=true)
public class GatheringBucketsTask
extends l_Unknown {
    private static /* synthetic */ int[] lIIllIllIllII;
    private static /* synthetic */ String[] lIIllIllIlIll;

    private static void lIllIIIlIlIIlll() {
        lIIllIllIlIll = new String[lIIllIllIllII[3]];
        q.lIIllIllIlIll[q.lIIllIllIllII[1]] = q."Drop";
        q.lIIllIllIlIll[q.lIIllIllIllII[0]] = q."Take";
        q.lIIllIllIlIll[q.lIIllIllIllII[2]] = q."Bucket";
    }

    private static boolean lIllIIIlIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIIlIlIllII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIlIlIlIII() {
        lIIllIllIllII = new int[4];
        q.lIIllIllIllII[0] = 1;
        q.lIIllIllIllII[1] = (59 + 114 - -9 + 17 ^ 18 + 89 - 70 + 128) & (0x5B ^ 0x68 ^ (0x2C ^ 0x7D) ^ -1);
        q.lIIllIllIllII[2] = 2;
        q.lIIllIllIllII[3] = 3;
    }

    private static String lIllIIIlIlIIlIl(String var9, String var4) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIIllIllIllII[2], var5);
            return new String(var8.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIlIlIll(Object object) {
        return object != null;
    }

    @Override
    public boolean ak() {
        boolean bl;
        if (q.lIllIIIlIlIlIIl(this.ar.p(), this.as.numberOfBuckets())) {
            bl = lIIllIllIllII[0];
            0;
            if (1 <= ((0x6B ^ 0x67) & ~(0x44 ^ 0x48))) {
                return false;
            }
        } else {
            bl = lIIllIllIllII[1];
        }
        return bl;
    }

    @Inject
    protected q(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIIlIlIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean al() {
        q var16;
        if (q.lIllIIIlIlIlIlI(this.ar.p(), this.as.numberOfBuckets())) {
            Inventory.getFirst(item -> item.getName().contains(lIIllIllIlIll[lIIllIllIllII[2]])).interact(lIIllIllIlIll[lIIllIllIllII[1]]);
            return lIIllIllIllII[0];
        }
        c var12 = var16.ar.N();
        TileObject var3 = var12.O();
        if (q.lIllIIIlIlIlIll(var3) && q.lIllIIIlIlIllII(var16.au.a((Locatable)var3) ? 1 : 0)) {
            var3.interact(lIIllIllIlIll[lIIllIllIllII[0]]);
            0;
            if (3 == 0) {
                return false;
            }
        } else {
            var16.au.b(var12.aa());
            0;
        }
        return lIIllIllIllII[0];
    }

    static {
        q.lIllIIIlIlIlIII();
        q.lIllIIIlIlIIlll();
    }

    private static String lIllIIIlIlIIllI(String var1, String var17) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var2 = var17.toCharArray();
        int var15 = lIIllIllIllII[1];
        char[] var10 = var1.toCharArray();
        int var13 = var10.length;
        int var11 = lIIllIllIllII[1];
        while (q.lIllIIIlIlIllIl(var11, var13)) {
            char var6 = var10[var11];
            var14.append((char)(var6 ^ var2[var15 % var2.length]));
            0;
            ++var15;
            ++var11;
            0;
            if (2 <= 2) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean lIllIIIlIlIllIl(int n2, int n3) {
        return n2 < n3;
    }
}

