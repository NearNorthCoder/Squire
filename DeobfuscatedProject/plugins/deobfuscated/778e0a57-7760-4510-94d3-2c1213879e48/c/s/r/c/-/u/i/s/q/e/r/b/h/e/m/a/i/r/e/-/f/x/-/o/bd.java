/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bg;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Prep Make Pots", priority=21001, blocking=true)
public class bd
extends bg {
    private static /* synthetic */ String[] lIlIIlllIlII;
    /* synthetic */ boolean ei;
    private static /* synthetic */ int[] lIlIIlllIlIl;

    private static boolean llIllIllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIllIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIllIlIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected bd(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.ei = lIlIIlllIlIl[0];
    }

    private static String llIllIllIIlIIl(String lllllllllllllllIllIlIllIllllllIl, String lllllllllllllllIllIlIlllIIIIIIIl) {
        lllllllllllllllIllIlIllIllllllIl = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIllIllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIlllIIIIIIII = new StringBuilder();
        char[] lllllllllllllllIllIlIllIllllllll = lllllllllllllllIllIlIlllIIIIIIIl.toCharArray();
        int lllllllllllllllIllIlIllIlllllllI = lIlIIlllIlIl[0];
        char[] lllllllllllllllIllIlIllIlllllIII = lllllllllllllllIllIlIllIllllllIl.toCharArray();
        int lllllllllllllllIllIlIllIllllIlll = lllllllllllllllIllIlIllIlllllIII.length;
        int lllllllllllllllIllIlIllIllllIllI = lIlIIlllIlIl[0];
        while (bd.llIllIllIIllIl(lllllllllllllllIllIlIllIllllIllI, lllllllllllllllIllIlIllIllllIlll)) {
            char lllllllllllllllIllIlIlllIIIIIIll = lllllllllllllllIllIlIllIlllllIII[lllllllllllllllIllIlIllIllllIllI];
            lllllllllllllllIllIlIlllIIIIIIII.append((char)(lllllllllllllllIllIlIlllIIIIIIll ^ lllllllllllllllIllIlIllIllllllll[lllllllllllllllIllIlIllIlllllllI % lllllllllllllllIllIlIllIllllllll.length]));
            0;
            ++lllllllllllllllIllIlIllIlllllllI;
            ++lllllllllllllllIllIlIllIllllIllI;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlIlllIIIIIIII);
    }

    private static boolean llIllIllIlIIIl(int n2) {
        return n2 <= 0;
    }

    private static void llIllIllIIlIll() {
        lIlIIlllIlII = new String[lIlIIlllIlIl[7]];
        bd.lIlIIlllIlII[bd.lIlIIlllIlIl[0]] = bd."Clean";
        bd.lIlIIlllIlII[bd.lIlIIlllIlIl[1]] = bd."Revitalisation";
        bd.lIlIIlllIlII[bd.lIlIIlllIlIl[5]] = bd."Xeric's";
    }

    private static boolean llIllIllIlIIll(Object object) {
        return object == null;
    }

    private static boolean llIllIllIIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIllIllIIlIlI(String lllllllllllllllIllIlIlllIIIlIIlI, String lllllllllllllllIllIlIlllIIIIllll) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlllIIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlllIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIlllIIIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIlllIIIlIlII.init(lIlIIlllIlIl[5], lllllllllllllllIllIlIlllIIIlIlIl);
            return new String(lllllllllllllllIllIlIlllIIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlllIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIlllIIIlIIll) {
            lllllllllllllllIllIlIlllIIIlIIll.printStackTrace();
            return null;
        }
    }

    static {
        bd.llIllIllIIllII();
        bd.llIllIllIIlIll();
    }

    private static void llIllIllIIllII() {
        lIlIIlllIlIl = new int[8];
        bd.lIlIIlllIlIl[0] = (0x9F ^ 0xC1) & ~(0x53 ^ 0xD);
        bd.lIlIIlllIlIl[1] = 1;
        bd.lIlIIlllIlIl[2] = -(0xFFFFEFDB & 0x3C66) & (0xFFFFFFFF & 0x7DED);
        bd.lIlIIlllIlIl[3] = 0xFFFFD5EB & 0x7BBF;
        bd.lIlIIlllIlIl[4] = 0xD9 ^ 0xB1 ^ (0xC8 ^ 0xA5);
        bd.lIlIIlllIlIl[5] = 2;
        bd.lIlIIlllIlIl[6] = -(0xFFFF8FAD & 0x76FF) & (0xFFFFFFEF & 0x57FD);
        bd.lIlIIlllIlIl[7] = 3;
    }

    private static boolean llIllIllIlIIlI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var2_3;
        void var3_5;
        bd lllllllllllllllIllIlIlllIIIlllll;
        if (bd.llIllIllIIllIl(this.eh(), this.ed())) {
            return lIlIIlllIlIl[0];
        }
        int[] nArray = new int[lIlIIlllIlIl[1]];
        nArray[bd.lIlIIlllIlIl[0]] = em;
        TileObject lllllllllllllllIllIlIlllIIIllllI = TileObjects.getNearest((int[])nArray);
        if (bd.llIllIllIIlllI(Inventory.isFull() ? 1 : 0) && bd.llIllIllIIllll(lllllllllllllllIllIlIlllIIIlllll.eg(), lllllllllllllllIllIlIlllIIIlllll.ek())) {
            int[] nArray2 = new int[lIlIIlllIlIl[1]];
            nArray2[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[2];
            if (bd.llIllIllIIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                return lIlIIlllIlIl[0];
            }
        }
        int[] nArray3 = new int[lIlIIlllIlIl[1]];
        nArray3[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[3];
        if (bd.llIllIllIlIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[lIlIIlllIlIl[1]];
            nArray4[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[3];
            List lllllllllllllllIllIlIlllIIIlllIl = Inventory.getAll((int[])nArray4);
            int lllllllllllllllIllIlIlllIIIlllII = lIlIIlllIlIl[4];
            Iterator lllllllllllllllIllIlIlllIIIllIll = lllllllllllllllIllIlIlllIIIlllIl.iterator();
            while (bd.llIllIllIlIIII(lllllllllllllllIllIlIlllIIIllIll.hasNext() ? 1 : 0)) {
                Item lllllllllllllllIllIlIlllIIIllIlI = (Item)lllllllllllllllIllIlIlllIIIllIll.next();
                if (bd.llIllIllIlIIIl(lllllllllllllllIllIlIlllIIIlllII)) {
                    0;
                    if (null == null) break;
                    return ((0x3E ^ 0x79) & ~(0xFF ^ 0xB8)) != 0;
                }
                --lllllllllllllllIllIlIlllIIIlllII;
                lllllllllllllllIllIlIlllIIIllIlI.interact(lIlIIlllIlII[lIlIIlllIlIl[0]]);
                0;
                if (2 != 0) continue;
                return ((0x50 ^ 0x4B ^ (0x51 ^ 0x57)) & (13 + 60 - -29 + 25 ^ (0xEC ^ 0x8E) ^ -1)) != 0;
            }
            return lIlIIlllIlIl[1];
        }
        if (bd.llIllIllIlIIII(Production.isOpen() ? 1 : 0)) {
            if (bd.llIllIllIIllIl(lllllllllllllllIllIlIlllIIIlllll.cq(), lllllllllllllllIllIlIlllIIIlllll.el)) {
                lllllllllllllllIllIlIlllIIIlllll.ei = lIlIIlllIlIl[1];
                Production.chooseOption((String)lIlIIlllIlII[lIlIIlllIlIl[1]]);
                lllllllllllllllIllIlIlllIIIlllll.sleep(lIlIIlllIlIl[5]);
                return lIlIIlllIlIl[1];
            }
            lllllllllllllllIllIlIlllIIIlllll.ei = lIlIIlllIlIl[0];
            Production.chooseOption((String)lIlIIlllIlII[lIlIIlllIlIl[5]]);
            lllllllllllllllIllIlIlllIIIlllll.sleep(lIlIIlllIlIl[5]);
            return lIlIIlllIlIl[1];
        }
        int[] nArray5 = new int[lIlIIlllIlIl[1]];
        nArray5[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[6];
        Item lllllllllllllllIllIlIlllIIIlllIl = Inventory.getFirst((int[])nArray5);
        int[] nArray6 = new int[lIlIIlllIlIl[1]];
        nArray6[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[2];
        Item lllllllllllllllIllIlIlllIIIlllII = Inventory.getFirst((int[])nArray6);
        if (!bd.llIllIllIlIIlI(lllllllllllllllIllIlIlllIIIlllII) || bd.llIllIllIlIIll(lllllllllllllllIllIlIlllIIIlllIl)) {
            return lIlIIlllIlIl[0];
        }
        System.out.println("CraftRestore: " + lllllllllllllllIllIlIlllIIIlllll.ei + " | count: " + lllllllllllllllIllIlIlllIIIlllll.cq());
        if (bd.llIllIllIIlllI(lllllllllllllllIllIlIlllIIIlllll.ei ? 1 : 0) && bd.llIllIllIlIIII(lllllllllllllllIllIlIlllIIIlllll.bS.isAnimating() ? 1 : 0)) {
            return lIlIIlllIlIl[1];
        }
        if (bd.llIllIllIlIIII(lllllllllllllllIllIlIlllIIIlllll.ei ? 1 : 0) && bd.llIllIllIlIIII(lllllllllllllllIllIlIlllIIIlllll.bS.isAnimating() ? 1 : 0) && bd.llIllIllIIllIl(lllllllllllllllIllIlIlllIIIlllll.cq(), lllllllllllllllIllIlIlllIIIlllll.el)) {
            return lIlIIlllIlIl[1];
        }
        var3_5.useOn((Item)var2_3);
        return lIlIIlllIlIl[1];
    }
}

