/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.C_Unknown;
import m.e.i.q.u.r.-.n.s.e.r.i.T_Unknown;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

/* TASK: Depositing in hopper -> DepositinginhopperTask */
@TaskDesc(name="Depositing in hopper", priority=8)
public class DepositingInHopperTask
extends C_Unknown {
    private static /* synthetic */ int[] lllllIllIlll;
    private static /* synthetic */ String[] lllllIllIllI;

    private static void lIIlIIllllIIIll() {
        lllllIllIlll = new int[6];
        z.lllllIllIlll[0] = (0xF2 ^ 0xB2) & ~(0x36 ^ 0x76);
        z.lllllIllIlll[1] = 1;
        z.lllllIllIlll[2] = 0xFFFFFFFB & 0x2EEF;
        z.lllllIllIlll[3] = 0x32 ^ 5 ^ (0x9B ^ 0xA8);
        z.lllllIllIlll[4] = 2;
        z.lllllIllIlll[5] = 0x89 ^ 0x94 ^ (0xE ^ 0x1B);
    }

    private static void lIIlIIllllIIIlI() {
        lllllIllIllI = new String[lllllIllIlll[4]];
        z.lllllIllIllI[z.lllllIllIlll[0]] = z."Drop";
        z.lllllIllIllI[z.lllllIllIlll[1]] = z."Deposit";
    }

    @Inject
    public z(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
    }

    private static String lIIlIIllllIIIII(String var5, String var10) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lllllIllIlll[4], var8);
            return new String(var11.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIllllIIIIl(String var2, String var1) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lllllIllIlll[5]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lllllIllIlll[4], var4);
            return new String(var7.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        TileObject var12;
        z var9;
        if (!z.lIIlIIllllIIlII(this.Z.I() ? 1 : 0) || z.lIIlIIllllIIlIl(this.Z.K() ? 1 : 0)) {
            return lllllIllIlll[0];
        }
        if (z.lIIlIIllllIIlIl(var9.Z.L() ? 1 : 0)) {
            return lllllIllIlll[0];
        }
        if (z.lIIlIIllllIIlII(var9.Z.F() ? 1 : 0)) {
            int[] nArray = new int[lllllIllIlll[1]];
            nArray[z.lllllIllIlll[0]] = lllllIllIlll[2];
            if (z.lIIlIIllllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllllIllIlll[1]];
                nArray2[z.lllllIllIlll[0]] = lllllIllIlll[2];
                Inventory.getFirst((int[])nArray2).interact(lllllIllIllI[lllllIllIlll[0]]);
                return lllllIllIlll[1];
            }
        }
        if (z.lIIlIIllllIIllI(var12 = var9.x())) {
            return lllllIllIlll[0];
        }
        var1_1.interact(lllllIllIllI[lllllIllIlll[1]]);
        this.sleep(lllllIllIlll[3]);
        return lllllIllIlll[1];
    }

    private static boolean lIIlIIllllIIlII(int n2) {
        return n2 != 0;
    }

    static {
        z.lIIlIIllllIIIll();
        z.lIIlIIllllIIIlI();
    }

    private static boolean lIIlIIllllIIllI(Object object) {
        return object == null;
    }

    private static boolean lIIlIIllllIIlIl(int n2) {
        return n2 == 0;
    }
}

