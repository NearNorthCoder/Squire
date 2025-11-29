/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;
import q.s.r.i.e.s.o.u.a.d.n.-.b.g;
import q.s.r.i.e.s.o.u.a.d.n.-.b.i;

@TaskDesc(name="Looting Items", priority=5, blocking=true)
public class v
extends Task {
    private final /* synthetic */ i ao;
    private final /* synthetic */ g ap;
    private final /* synthetic */ SquireBandosConfig aq;
    private static /* synthetic */ String[] lllIIIlIlIl;
    private final /* synthetic */ e an;
    private static /* synthetic */ int[] lllIIIlIlll;

    private static String lIlIllIlllIlII(String llllllllllllllllIIlIIllIllIIIIlI, String llllllllllllllllIIlIIllIllIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllIllIIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllIllIIIlII.init(lllIIIlIlll[4], llllllllllllllllIIlIIllIllIIIlIl);
            return new String(llllllllllllllllIIlIIllIllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllIllIIIIll) {
            llllllllllllllllIIlIIllIllIIIIll.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIlllIllI() {
        lllIIIlIlIl = new String[lllIIIlIlll[8]];
        v.lllIIIlIlIl[v.lllIIIlIlll[0]] = v."Bury";
        v.lllIIIlIlIl[v.lllIIIlIlll[2]] = v."Eat";
        v.lllIIIlIlIl[v.lllIIIlIlll[4]] = v."Drop";
        v.lllIIIlIlIl[v.lllIIIlIlll[5]] = v."Take";
        v.lllIIIlIlIl[v.lllIIIlIlll[7]] = v."bones";
    }

    private static boolean lIlIllIlllllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIllllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIllIlllllIl(int n2) {
        return n2 == 0;
    }

    static {
        v.lIlIllIllllIIl();
        v.lIlIllIlllIllI();
    }

    private static boolean lIlIllIlllllll(Object object) {
        return object != null;
    }

    private static boolean lIlIllIllllIlI(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIllllIIl() {
        lllIIIlIlll = new int[9];
        v.lllIIIlIlll[0] = (0x78 ^ 0x37 ^ (0x67 ^ 0xD)) & (0x3E ^ 0x15 ^ (0x5B ^ 0x55) ^ -1);
        v.lllIIIlIlll[1] = 0xFFFFFFFF & Integer.MAX_VALUE;
        v.lllIIIlIlll[2] = 1;
        v.lllIIIlIlll[3] = 0x87 ^ 0xBE ^ (0x4D ^ 0x60);
        v.lllIIIlIlll[4] = 2;
        v.lllIIIlIlll[5] = 3;
        v.lllIIIlIlll[6] = 119 + 70 - 160 + 98 ^ (0x23 ^ 0x54);
        v.lllIIIlIlll[7] = 0x98 ^ 0x9C;
        v.lllIIIlIlll[8] = 0x53 ^ 0x6D ^ (0x11 ^ 0x2A);
    }

    @Inject
    public v(e e2, i i2, g g2, SquireBandosConfig squireBandosConfig) {
        this.an = e2;
        this.ao = i2;
        this.ap = g2;
        this.aq = squireBandosConfig;
    }

    private static boolean lIlIllIllllIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private TileItem P() {
        void llllllllllllllllIIlIIllIllIllIll;
        v llllllllllllllllIIlIIllIllIlllII;
        TileItem tileItem2 = this.ao.H().orElse(null);
        if (v.lIlIllIllllIll(tileItem2)) {
            return null;
        }
        if (v.lIlIllIlllllII(llllllllllllllllIIlIIllIllIlllII.ao.a((TileItem)llllllllllllllllIIlIIllIllIllIll), lllIIIlIlll[1])) {
            return llllllllllllllllIIlIIllIllIllIll;
        }
        List llllllllllllllllIIlIIllIllIllIlI = TileItems.getAll(tileItem -> {
            int n2;
            if (v.lIlIllIllllIlI(tileItem.isStackable() ? 1 : 0)) {
                int[] nArray = new int[lllIIIlIlll[2]];
                nArray[v.lllIIIlIlll[0]] = tileItem.getId();
                if (v.lIlIllIllllIlI(Inventory.contains((int[])nArray) ? 1 : 0) && v.lIlIllIllllIlI(tileItem.getWorldLocation().equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    n2 = lllIIIlIlll[2];
                    0;
                    if ((0x1B ^ 0x1F) == (0x67 ^ 0x63)) return n2 != 0;
                    return ((0x17 ^ 0x3E) & ~(0xBA ^ 0x93)) != 0;
                }
            }
            n2 = lllIIIlIlll[0];
            return n2 != 0;
        });
        if (v.lIlIllIlllllIl(llllllllllllllllIIlIIllIllIllIlI.isEmpty() ? 1 : 0)) {
            return (TileItem)llllllllllllllllIIlIIllIllIllIlI.get(lllIIIlIlll[0]);
        }
        if (v.lIlIllIllllIlI(Inventory.isFull() ? 1 : 0)) {
            return llllllllllllllllIIlIIllIllIlllII.ao.I().orElse((TileItem)llllllllllllllllIIlIIllIllIllIll);
        }
        TileItem llllllllllllllllIIlIIllIllIllIIl = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(lllIIIlIlIl[lllIIIlIlll[7]]));
        if (v.lIlIllIlllllll(llllllllllllllllIIlIIllIllIllIIl) && v.lIlIlllIIIIIII(Combat.getMissingHealth(), lllIIIlIlll[6])) {
            return llllllllllllllllIIlIIllIllIllIIl;
        }
        return tileItem2;
    }

    public boolean run() {
        int llllllllllllllllIIlIIllIlllIIIll;
        int n2;
        v llllllllllllllllIIlIIllIlllIIlIl;
        if (!v.lIlIllIllllIlI(this.an.t() ? 1 : 0) || v.lIlIllIllllIlI(this.an.s() ? 1 : 0)) {
            return lllIIIlIlll[0];
        }
        TileItem llllllllllllllllIIlIIllIlllIIlII = llllllllllllllllIIlIIllIlllIIlIl.P();
        if (v.lIlIllIllllIll(llllllllllllllllIIlIIllIlllIIlII)) {
            return lllIIIlIlll[0];
        }
        if (v.lIlIllIlllllII(llllllllllllllllIIlIIllIlllIIlIl.ao.a(llllllllllllllllIIlIIllIlllIIlII), lllIIIlIlll[1])) {
            n2 = lllIIIlIlll[2];
            0;
            if (1 < 0) {
                return ((0x72 ^ 0x49) & ~(0x8A ^ 0xB1)) != 0;
            }
        } else {
            n2 = llllllllllllllllIIlIIllIlllIIIll = lllIIIlIlll[0];
        }
        if (v.lIlIllIllllIlI(llllllllllllllllIIlIIllIlllIIlIl.an.v() ? 1 : 0) && v.lIlIllIlllllIl(llllllllllllllllIIlIIllIlllIIIll)) {
            return lllIIIlIlll[0];
        }
        if (v.lIlIllIllllllI(llllllllllllllllIIlIIllIlllIIlIl.an.r(), lllIIIlIlll[3]) && v.lIlIllIlllllIl(llllllllllllllllIIlIIllIlllIIIll)) {
            return lllIIIlIlll[0];
        }
        if (v.lIlIllIllllIlI(Movement.isRunEnabled() ? 1 : 0) && v.lIlIllIllllIlI(llllllllllllllllIIlIIllIlllIIlIl.aq.turnOffRun() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (v.lIlIllIllllIlI(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lllIIIlIlll[2]];
            nArray[v.lllIIIlIlll[0]] = llllllllllllllllIIlIIllIlllIIlII.getId();
            if (!v.lIlIllIllllIlI(Inventory.contains((int[])nArray) ? 1 : 0) || v.lIlIllIlllllIl(llllllllllllllllIIlIIllIlllIIlII.isStackable() ? 1 : 0)) {
                Item llllllllllllllllIIlIIllIlllIIIlI = llllllllllllllllIIlIIllIlllIIlIl.ap.G();
                if (v.lIlIllIlllllll(llllllllllllllllIIlIIllIlllIIIlI)) {
                    if (v.lIlIllIllllIlI(llllllllllllllllIIlIIllIlllIIIlI.hasAction(lllIIIlIlIl[lllIIIlIlll[0]]::equals) ? 1 : 0)) {
                        return lllIIIlIlll[0];
                    }
                    llllllllllllllllIIlIIllIlllIIIlI.interact(lllIIIlIlIl[lllIIIlIlll[2]]);
                    return lllIIIlIlll[2];
                }
                Item llllllllllllllllIIlIIllIlllIIIIl = llllllllllllllllIIlIIllIlllIIlIl.ao.J().orElse(null);
                if (v.lIlIllIllllIll(llllllllllllllllIIlIIllIlllIIIIl)) {
                    return lllIIIlIlll[0];
                }
                if (v.lIlIllIlllllIl(llllllllllllllllIIlIIllIlllIIlIl.ao.a(llllllllllllllllIIlIIllIlllIIIIl, llllllllllllllllIIlIIllIlllIIlII) ? 1 : 0)) {
                    return lllIIIlIlll[0];
                }
                llllllllllllllllIIlIIllIlllIIIIl.interact(lllIIIlIlIl[lllIIIlIlll[4]]);
            }
        }
        if (v.lIlIllIllllIlI(Movement.shouldWalk() ? 1 : 0)) {
            llllllllllllllllIIlIIllIlllIIlII.interact(lllIIIlIlIl[lllIIIlIlll[5]]);
            llllllllllllllllIIlIIllIlllIIlIl.sleep(lllIIIlIlll[2]);
        }
        return lllIIIlIlll[2];
    }

    private static String lIlIllIlllIlIl(String llllllllllllllllIIlIIllIllIIllIl, String llllllllllllllllIIlIIllIllIIlllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIllIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIllIIlllI.getBytes(StandardCharsets.UTF_8)), lllIIIlIlll[6]), "DES");
            Cipher llllllllllllllllIIlIIllIllIlIIIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIIllIllIlIIIl.init(lllIIIlIlll[4], llllllllllllllllIIlIIllIllIlIIlI);
            return new String(llllllllllllllllIIlIIllIllIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllIllIlIIII) {
            llllllllllllllllIIlIIllIllIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIIIIII(int n2, int n3) {
        return n2 > n3;
    }
}

