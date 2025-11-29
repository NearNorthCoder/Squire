/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.g;

@TaskDesc(name="Grabbing DWH", priority=100, blocking=true)
public class y
extends Task {
    private static /* synthetic */ int[] lIIlIlllllllI;
    private final /* synthetic */ SquireShamanConfig aE;
    private static /* synthetic */ String[] lIIlIlllllIll;

    private static void lIlIlllIIlIIllI() {
        lIIlIlllllllI = new int[11];
        y.lIIlIlllllllI[0] = (0xEA ^ 0xB1) & ~(9 ^ 0x52);
        y.lIIlIlllllllI[1] = 2;
        y.lIIlIlllllllI[2] = 0xFFFFFF9B & 0x356C;
        y.lIIlIlllllllI[3] = 1;
        y.lIIlIlllllllI[4] = 0xFFFFD37F & 0x7DB1;
        y.lIIlIlllllllI[5] = 3;
        y.lIIlIlllllllI[6] = 0x62 ^ 0x66;
        y.lIIlIlllllllI[7] = 0x7E ^ 0x7B;
        y.lIIlIlllllllI[8] = 0x7B ^ 0x7D;
        y.lIIlIlllllllI[9] = 0x4C ^ 0x4B;
        y.lIIlIlllllllI[10] = 0x6E ^ 0x5A ^ (0xB9 ^ 0x85);
    }

    private static String lIlIlllIIIlllll(String llllllllllllllIllllIIllIllIIllll, String llllllllllllllIllllIIllIllIIlllI) {
        try {
            SecretKeySpec llllllllllllllIllllIIllIllIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIllIllIIlllI.getBytes(StandardCharsets.UTF_8)), lIIlIlllllllI[10]), "DES");
            Cipher llllllllllllllIllllIIllIllIlIIll = Cipher.getInstance("DES");
            llllllllllllllIllllIIllIllIlIIll.init(lIIlIlllllllI[1], llllllllllllllIllllIIllIllIlIlII);
            return new String(llllllllllllllIllllIIllIllIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIllIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIllIllIlIIlI) {
            llllllllllllllIllllIIllIllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIlIlIII(Object object) {
        return object == null;
    }

    private static boolean lIlIlllIIlIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static String lIlIlllIIlIIIII(String llllllllllllllIllllIIllIllIIIIIl, String llllllllllllllIllllIIllIlIlllIll) {
        llllllllllllllIllllIIllIllIIIIIl = new String(Base64.getDecoder().decode(llllllllllllllIllllIIllIllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIllIlIllllll = new StringBuilder();
        char[] llllllllllllllIllllIIllIlIlllllI = llllllllllllllIllllIIllIlIlllIll.toCharArray();
        int llllllllllllllIllllIIllIlIllllIl = lIIlIlllllllI[0];
        char[] llllllllllllllIllllIIllIlIllIlll = llllllllllllllIllllIIllIllIIIIIl.toCharArray();
        int llllllllllllllIllllIIllIlIllIllI = llllllllllllllIllllIIllIlIllIlll.length;
        int llllllllllllllIllllIIllIlIllIlIl = lIIlIlllllllI[0];
        while (y.lIlIlllIIlIlIll(llllllllllllllIllllIIllIlIllIlIl, llllllllllllllIllllIIllIlIllIllI)) {
            char llllllllllllllIllllIIllIllIIIIlI = llllllllllllllIllllIIllIlIllIlll[llllllllllllllIllllIIllIlIllIlIl];
            llllllllllllllIllllIIllIlIllllll.append((char)(llllllllllllllIllllIIllIllIIIIlI ^ llllllllllllllIllllIIllIlIlllllI[llllllllllllllIllllIIllIlIllllIl % llllllllllllllIllllIIllIlIlllllI.length]));
            0;
            ++llllllllllllllIllllIIllIlIllllIl;
            ++llllllllllllllIllllIIllIlIllIlIl;
            0;
            if (((5 ^ 0x10) & ~(8 ^ 0x1D)) <= (0x2C ^ 0x28)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIllIlIllllll);
    }

    static {
        y.lIlIlllIIlIIllI();
        y.lIlIlllIIlIIIlI();
    }

    private static boolean lIlIlllIIlIlIlI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        g g2 = this.aE.room();
        Player player = Players.getLocal();
        if (y.lIlIlllIIlIIlll(g2.x().contains((Locatable)player) ? 1 : 0)) {
            return lIIlIlllllllI[0];
        }
        int[] nArray = new int[lIIlIlllllllI[1]];
        nArray[y.lIIlIlllllllI[0]] = lIIlIlllllllI[2];
        nArray[y.lIIlIlllllllI[3]] = lIIlIlllllllI[4];
        TileItem llllllllllllllIllllIIllIlllIlIIl = TileItems.getNearest((int[])nArray);
        if (y.lIlIlllIIlIlIII(llllllllllllllIllllIIllIlllIlIIl)) {
            return lIIlIlllllllI[0];
        }
        if (y.lIlIlllIIlIlIIl(Inventory.isFull() ? 1 : 0)) {
            Item llllllllllllllIllllIIllIlllIlIII = Inventory.getFirst(item -> item.hasAction(lIIlIlllllIll[lIIlIlllllllI[8]]::equals));
            if (y.lIlIlllIIlIlIlI(llllllllllllllIllllIIllIlllIlIII)) {
                llllllllllllllIllllIIllIlllIlIII.interact(lIIlIlllllIll[lIIlIlllllllI[0]]);
                0;
                if (1 >= 3) {
                    return ((0xF2 ^ 0xBE) & ~(0xDD ^ 0x91)) != 0;
                }
            } else {
                Item llllllllllllllIllllIIllIlllIIlll = Inventory.getFirst(item -> item.hasAction(lIIlIlllllIll[lIIlIlllllllI[7]]::equals));
                if (y.lIlIlllIIlIlIlI(llllllllllllllIllllIIllIlllIIlll)) {
                    llllllllllllllIllllIIllIlllIIlll.interact(lIIlIlllllIll[lIIlIlllllllI[3]]);
                    0;
                    if (((137 + 43 - 33 + 28 ^ 103 + 1 - 89 + 125) & (49 + 58 - 27 + 76 ^ 105 + 174 - 120 + 32 ^ -1)) != 0) {
                        return ((0xB ^ 0x2C ^ (0x94 ^ 0xBB)) & (0xEE ^ 0x9B ^ (0x36 ^ 0x4B) ^ -1)) != 0;
                    }
                } else {
                    Item llllllllllllllIllllIIllIlllIIllI = Inventory.getFirst(item -> {
                        String[] stringArray = new String[lIIlIlllllllI[3]];
                        stringArray[y.lIIlIlllllllI[0]] = lIIlIlllllIll[lIIlIlllllllI[6]];
                        return item.hasAction(stringArray);
                    });
                    if (y.lIlIlllIIlIlIlI(llllllllllllllIllllIIllIlllIIllI)) {
                        llllllllllllllIllllIIllIlllIIllI.interact(lIIlIlllllIll[lIIlIlllllllI[1]]);
                        0;
                        if (3 != 3) {
                            return ((0x34 ^ 0x7C ^ (0xEF ^ 0x8D)) & (0xDC ^ 0xAF ^ (0x4B ^ 0x12) ^ -1)) != 0;
                        }
                    } else {
                        return lIIlIlllllllI[0];
                    }
                }
            }
        }
        var3_3.interact(lIIlIlllllIll[lIIlIlllllllI[5]]);
        return lIIlIlllllllI[3];
    }

    private static boolean lIlIlllIIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlllIIlIIIlI() {
        lIIlIlllllIll = new String[lIIlIlllllllI[9]];
        y.lIIlIlllllIll[y.lIIlIlllllllI[0]] = y."Eat";
        y.lIIlIlllllIll[y.lIIlIlllllllI[3]] = y."Drop";
        y.lIIlIlllllIll[y.lIIlIlllllllI[1]] = y."Drop";
        y.lIIlIlllllIll[y.lIIlIlllllllI[5]] = y."Take";
        y.lIIlIlllllIll[y.lIIlIlllllllI[6]] = y."Drop";
        y.lIIlIlllllIll[y.lIIlIlllllllI[7]] = y."Drink";
        y.lIIlIlllllIll[y.lIIlIlllllllI[8]] = y."Eat";
    }

    private static String lIlIlllIIIlllIl(String llllllllllllllIllllIIllIllIlllII, String llllllllllllllIllllIIllIllIllIll) {
        try {
            SecretKeySpec llllllllllllllIllllIIllIlllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIllIllIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIllIlllIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIllIlllIIIII.init(lIIlIlllllllI[1], llllllllllllllIllllIIllIlllIIIIl);
            return new String(llllllllllllllIllllIIllIlllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIllIllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIllIllIlllll) {
            llllllllllllllIllllIIllIllIlllll.printStackTrace();
            return null;
        }
    }

    @Inject
    public y(SquireShamanConfig squireShamanConfig) {
        this.aE = squireShamanConfig;
    }
}

