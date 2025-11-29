/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.S;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;

@TaskDesc(name="Buying waterskins", priority=20, blocking=true)
public class O
extends S {
    private static /* synthetic */ int[] lllllIIIllIl;
    private static /* synthetic */ String[] lllllIIIllII;

    private static String lIIlIIlIIlllllI(String lllllllllllllllIIlIIllIIllIIIIIl, String lllllllllllllllIIlIIllIIllIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIllIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIllIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIllIIllIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIllIIllIIIIll.init(lllllIIIllIl[6], lllllllllllllllIIlIIllIIllIIIlII);
            return new String(lllllllllllllllIIlIIllIIllIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIIllIIIIlI) {
            lllllllllllllllIIlIIllIIllIIIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected O(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }

    private static void lIIlIIlIIllllll() {
        lllllIIIllII = new String[lllllIIIllIl[6]];
        O.lllllIIIllII[O.lllllIIIllIl[0]] = O.lIIlIIlIIllllIl("JzkudAYEPyQ=", "eLWYv");
        O.lllllIIIllII[O.lllllIIIllIl[1]] = O.lIIlIIlIIlllllI("jGz+OqPPQ94=", "mGRZg");
    }

    private static boolean lIIlIIlIlIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIlIlIIIIll(Object object) {
        return object == null;
    }

    private static String lIIlIIlIIllllIl(String lllllllllllllllIIlIIllIIlIllIIIl, String lllllllllllllllIIlIIllIIlIlIlIll) {
        lllllllllllllllIIlIIllIIlIllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllIIlIlIllll = new StringBuilder();
        char[] lllllllllllllllIIlIIllIIlIlIlllI = lllllllllllllllIIlIIllIIlIlIlIll.toCharArray();
        int lllllllllllllllIIlIIllIIlIlIllIl = lllllIIIllIl[0];
        char[] lllllllllllllllIIlIIllIIlIlIIlll = lllllllllllllllIIlIIllIIlIllIIIl.toCharArray();
        int lllllllllllllllIIlIIllIIlIlIIllI = lllllllllllllllIIlIIllIIlIlIIlll.length;
        int lllllllllllllllIIlIIllIIlIlIIlIl = lllllIIIllIl[0];
        while (O.lIIlIIlIlIIIlIl(lllllllllllllllIIlIIllIIlIlIIlIl, lllllllllllllllIIlIIllIIlIlIIllI)) {
            char lllllllllllllllIIlIIllIIlIllIIlI = lllllllllllllllIIlIIllIIlIlIIlll[lllllllllllllllIIlIIllIIlIlIIlIl];
            lllllllllllllllIIlIIllIIlIlIllll.append((char)(lllllllllllllllIIlIIllIIlIllIIlI ^ lllllllllllllllIIlIIllIIlIlIlllI[lllllllllllllllIIlIIllIIlIlIllIl % lllllllllllllllIIlIIllIIlIlIlllI.length]));
            "".length();
            ++lllllllllllllllIIlIIllIIlIlIllIl;
            ++lllllllllllllllIIlIIllIIlIlIIlIl;
            "".length();
            if ((0x43 ^ 0x61 ^ (0x3F ^ 0x18)) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIllIIlIlIllll);
    }

    private static boolean lIIlIIlIlIIIlII(int n2) {
        return n2 != 0;
    }

    static {
        O.lIIlIIlIlIIIIII();
        O.lIIlIIlIIllllll();
    }

    private static boolean lIIlIIlIlIIIIIl(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIlIlIIIIII() {
        lllllIIIllIl = new int[7];
        O.lllllIIIllIl[0] = (142 + 80 - 147 + 116 ^ 36 + 109 - 52 + 50) & (0x21 ^ 0x25 ^ (0x22 ^ 0x16) ^ -" ".length());
        O.lllllIIIllIl[1] = " ".length();
        O.lllllIIIllIl[2] = 0xFFFFFB8B & 0x2DFE;
        O.lllllIIIllIl[3] = -(0xFFFFDA59 & 0x3DA7) & (0xFFFFDF7E & 0x3FBF);
        O.lllllIIIllIl[4] = -(0xFFFFDD25 & 0x7ADB) & (0xFFFFDF3F & 0x7FE7);
        O.lllllIIIllIl[5] = -(0xFFFFFCC9 & 0x2BB7) & (0xFFFFEF9F & 0x3FFF);
        O.lllllIIIllIl[6] = "  ".length();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        if (!O.lIIlIIlIlIIIIIl(this.z() ? 1 : 0) || O.lIIlIIlIlIIIIlI(this.y())) {
            return lllllIIIllIl[0];
        }
        int[] nArray = new int[lllllIIIllIl[1]];
        nArray[O.lllllIIIllIl[0]] = lllllIIIllIl[2];
        NPC lllllllllllllllIIlIIllIIllIIlIIl = NPCs.getNearest((int[])nArray);
        if (O.lIIlIIlIlIIIIll(lllllllllllllllIIlIIllIIllIIlIIl)) {
            return lllllIIIllIl[0];
        }
        int[] nArray2 = new int[lllllIIIllIl[1]];
        nArray2[O.lllllIIIllIl[0]] = lllllIIIllIl[3];
        if (O.lIIlIIlIlIIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllIIlIIllIIllIIlIIl.interact(lllllIIIllII[lllllIIIllIl[0]]);
            return lllllIIIllIl[1];
        }
        if (O.lIIlIIlIlIIIlII(Shop.isOpen() ? 1 : 0)) {
            int[] nArray3 = new int[lllllIIIllIl[1]];
            nArray3[O.lllllIIIllIl[0]] = lllllIIIllIl[4];
            if (O.lIIlIIlIlIIIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                Shop.sellFifty((int)lllllIIIllIl[4]);
                return lllllIIIllIl[1];
            }
            Shop.buyFifty((int)lllllIIIllIl[5]);
            return lllllIIIllIl[1];
        }
        var1_1.interact(lllllIIIllII[lllllIIIllIl[1]]);
        return lllllIIIllIl[1];
    }

    private static boolean lIIlIIlIlIIIIlI(int n2) {
        return n2 > 0;
    }
}

