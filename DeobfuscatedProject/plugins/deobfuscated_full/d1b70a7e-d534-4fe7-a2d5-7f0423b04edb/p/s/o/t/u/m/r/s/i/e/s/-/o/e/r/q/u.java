/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
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
import net.unethicalite.api.items.Inventory;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l;

/* TASK: Rid extras -> RidextrasTask */
@TaskDesc(name="Rid extras", priority=50)
public class u
extends l {
    private static /* synthetic */ String[] lIIllIllIlIII;
    private static /* synthetic */ int[] lIIllIllIlIIl;

    private static void lIllIIIlIIllIlI() {
        lIIllIllIlIII = new String[lIIllIllIlIIl[4]];
        u.lIIllIllIlIII[u.lIIllIllIlIIl[1]] = u."Drop";
        u.lIIllIllIlIII[u.lIIllIllIlIIl[0]] = u."Drop";
    }

    @Override
    public boolean al() {
        u var3;
        int[] nArray = new int[lIIllIllIlIIl[0]];
        nArray[u.lIIllIllIlIIl[1]] = lIIllIllIlIIl[2];
        if (u.lIllIIIlIIlllIl(Inventory.getCount((int[])nArray), lIIllIllIlIIl[0])) {
            int[] nArray2 = new int[lIIllIllIlIIl[0]];
            nArray2[u.lIIllIllIlIIl[1]] = lIIllIllIlIIl[2];
            Inventory.getFirst((int[])nArray2).interact(lIIllIllIlIII[lIIllIllIlIIl[1]]);
            return lIIllIllIlIIl[0];
        }
        if (u.lIllIIIlIIlllIl(var3.ar.n(), var3.as.numberOfBuckets())) {
            int[] nArray3 = new int[lIIllIllIlIIl[0]];
            nArray3[u.lIIllIllIlIIl[1]] = lIIllIllIlIIl[3];
            Inventory.getFirst((int[])nArray3).interact(lIIllIllIlIII[lIIllIllIlIIl[0]]);
        }
        return lIIllIllIlIIl[1];
    }

    @Inject
    protected u(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static void lIllIIIlIIllIll() {
        lIIllIllIlIIl = new int[6];
        u.lIIllIllIlIIl[0] = 1;
        u.lIIllIllIlIIl[1] = (0x4E ^ 0 ^ (0x72 ^ 0x5C)) & (121 + 21 - -7 + 106 ^ 69 + 53 - 0 + 37 ^ -1);
        u.lIIllIllIlIIl[2] = 0xFFFF9FBA & 0x63FF;
        u.lIIllIllIlIIl[3] = -(0xFFFFD9D7 & 0x6639) & (0xFFFFCF9F & 0x7EFF);
        u.lIIllIllIlIIl[4] = 2;
        u.lIIllIllIlIIl[5] = 0x68 ^ 1 ^ (0xA0 ^ 0xC1);
    }

    static {
        u.lIllIIIlIIllIll();
        u.lIllIIIlIIllIlI();
    }

    private static boolean lIllIIIlIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean ak() {
        int n2;
        int[] nArray = new int[lIIllIllIlIIl[0]];
        nArray[u.lIIllIllIlIIl[1]] = lIIllIllIlIIl[2];
        if (!u.lIllIIIlIIlllII(Inventory.getCount((int[])nArray), lIIllIllIlIIl[0]) || u.lIllIIIlIIlllIl(this.ar.n(), this.as.numberOfBuckets())) {
            n2 = lIIllIllIlIIl[0];
            0;
            
            }
        } else {
            n2 = lIIllIllIlIIl[1];
        }
        return n2 != 0;
    }

    private static boolean lIllIIIlIIlllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIllIIIlIIllIIl(String var6, String var5) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIIllIllIlIIl[5]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIIllIllIlIIl[4], var4);
            return new String(var2.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }
}

