/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Mining essenece")
public class p
extends Task {
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private static /* synthetic */ String[] llllllIIIlII;
    private static /* synthetic */ int[] llllllIIIlIl;

    static {
        p.lIIlIlIIIIlllll();
        p.lIIlIlIIIIllllI();
    }

    private static boolean lIIlIlIIIlIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIIlIIIII(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIlIlIIIIllllI() {
        llllllIIIlII = new String[llllllIIIlIl[3]];
        p.llllllIIIlII[p.llllllIIIlIl[0]] = p.lIIlIlIIIIlllIl("vHgQleUkhXw=", "EXwYD");
    }

    private static boolean lIIlIlIIIlIIIlI(Object object) {
        return object == null;
    }

    private static String lIIlIlIIIIlllIl(String lllllllllllllllIIlIIIllllIlIllll, String lllllllllllllllIIlIIIllllIlIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIllllIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIllllIlIlllI.getBytes(StandardCharsets.UTF_8)), llllllIIIlIl[7]), "DES");
            Cipher lllllllllllllllIIlIIIllllIllIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIllllIllIIIl.init(llllllIIIlIl[5], lllllllllllllllIIlIIIllllIllIIlI);
            return new String(lllllllllllllllIIlIIIllllIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIllllIllIIII) {
            lllllllllllllllIIlIIIllllIllIIII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (p.lIIlIlIIIlIIIII((Object)this.f.activity(), (Object)a.ESSENCE)) {
            return llllllIIIlIl[0];
        }
        if (p.lIIlIlIIIlIIIIl(Inventory.isFull() ? 1 : 0)) {
            return llllllIIIlIl[0];
        }
        if (p.lIIlIlIIIlIIIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llllllIIIlIl[0];
        }
        int[] nArray = new int[llllllIIIlIl[1]];
        nArray[p.llllllIIIlIl[0]] = llllllIIIlIl[2];
        nArray[p.llllllIIIlIl[3]] = llllllIIIlIl[4];
        nArray[p.llllllIIIlIl[5]] = llllllIIIlIl[6];
        TileObject lllllllllllllllIIlIIIllllIllIlll = TileObjects.getNearest((int[])nArray);
        if (p.lIIlIlIIIlIIIlI(lllllllllllllllIIlIIIllllIllIlll)) {
            return llllllIIIlIl[0];
        }
        var1_1.interact(llllllIIIlII[llllllIIIlIl[0]]);
        return llllllIIIlIl[3];
    }

    private static void lIIlIlIIIIlllll() {
        llllllIIIlIl = new int[8];
        p.llllllIIIlIl[0] = (0x2F ^ 0x58 ^ (0x52 ^ 8)) & (0xF2 ^ 0xAE ^ (0xB4 ^ 0xC5) ^ -" ".length());
        p.llllllIIIlIl[1] = "   ".length();
        p.llllllIIIlIl[2] = -" ".length() & (0xFFFFBD36 & 0x7EFB);
        p.llllllIIIlIl[3] = " ".length();
        p.llllllIIIlIl[4] = 0xFFFF97DF & 0xEFF5;
        p.llllllIIIlIl[5] = "  ".length();
        p.llllllIIIlIl[6] = 0xFFFFE16F & 0x5FBF;
        p.llllllIIIlIl[7] = 0x61 ^ 0xF ^ (0xFB ^ 0x9D);
    }
}

