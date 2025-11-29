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
import m.e.i.q.u.r.-.n.s.e.r.i.C;
import m.e.i.q.u.r.-.n.s.e.r.i.T;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Depositing in hopper", priority=8)
public class z
extends C {
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

    private static String lIIlIIllllIIIII(String lllllllllllllllIIlIIlIIIlllllllI, String lllllllllllllllIIlIIlIIIllllllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIlIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlIIlIIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlIIlIIIIIIlI.init(lllllIllIlll[4], lllllllllllllllIIlIIlIIlIIIIIIll);
            return new String(lllllllllllllllIIlIIlIIlIIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIIlIIIIIIIl) {
            lllllllllllllllIIlIIlIIlIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIllllIIIIl(String lllllllllllllllIIlIIlIIIllllIIll, String lllllllllllllllIIlIIlIIIllllIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIIllllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIIllllIIII.getBytes(StandardCharsets.UTF_8)), lllllIllIlll[5]), "DES");
            Cipher lllllllllllllllIIlIIlIIIllllIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlIIIllllIlIl.init(lllllIllIlll[4], lllllllllllllllIIlIIlIIIllllIllI);
            return new String(lllllllllllllllIIlIIlIIIllllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIIIllllIlII) {
            lllllllllllllllIIlIIlIIIllllIlII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        TileObject lllllllllllllllIIlIIlIIlIIIIlIII;
        z lllllllllllllllIIlIIlIIlIIIIlIIl;
        if (!z.lIIlIIllllIIlII(this.Z.I() ? 1 : 0) || z.lIIlIIllllIIlIl(this.Z.K() ? 1 : 0)) {
            return lllllIllIlll[0];
        }
        if (z.lIIlIIllllIIlIl(lllllllllllllllIIlIIlIIlIIIIlIIl.Z.L() ? 1 : 0)) {
            return lllllIllIlll[0];
        }
        if (z.lIIlIIllllIIlII(lllllllllllllllIIlIIlIIlIIIIlIIl.Z.F() ? 1 : 0)) {
            int[] nArray = new int[lllllIllIlll[1]];
            nArray[z.lllllIllIlll[0]] = lllllIllIlll[2];
            if (z.lIIlIIllllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllllIllIlll[1]];
                nArray2[z.lllllIllIlll[0]] = lllllIllIlll[2];
                Inventory.getFirst((int[])nArray2).interact(lllllIllIllI[lllllIllIlll[0]]);
                return lllllIllIlll[1];
            }
        }
        if (z.lIIlIIllllIIllI(lllllllllllllllIIlIIlIIlIIIIlIII = lllllllllllllllIIlIIlIIlIIIIlIIl.x())) {
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

