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
import q.s.r.i.e.s.o.u.a.d.n.-.b.e_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.g_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.i_Unknown;

/* TASK: Looting Items -> LootingTask */
@TaskDesc(name="Looting Items", priority=5, blocking=true)
public class LootingItemsTask
extends Task {
    private final /* synthetic */ i ao;
    private final /* synthetic */ g ap;
    private final /* synthetic */ SquireBandosConfig aq;
    private static /* synthetic */ String[] lllIIIlIlIl;
    private final /* synthetic */ e an;
    private static /* synthetic */ int[] lllIIIlIlll;

    private static String lIlIllIlllIlII(String var16, String var15) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lllIIIlIlll[4], var7);
            return new String(var17.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
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
        void var1;
        v var3;
        TileItem tileItem2 = this.ao.H().orElse(null);
        if (v.lIlIllIllllIll(tileItem2)) {
            return null;
        }
        if (v.lIlIllIlllllII(var3.ao.a((TileItem)var1), lllIIIlIlll[1])) {
            return var1;
        }
        List var5 = TileItems.getAll(tileItem -> {
            int n2;
            if (v.lIlIllIllllIlI(tileItem.isStackable() ? 1 : 0)) {
                int[] nArray = new int[lllIIIlIlll[2]];
                nArray[v.lllIIIlIlll[0]] = tileItem.getId();
                if (v.lIlIllIllllIlI(Inventory.contains((int[])nArray) ? 1 : 0) && v.lIlIllIllllIlI(tileItem.getWorldLocation().equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    n2 = lllIIIlIlll[2];
                    0;
                    if ((0x1B ^ 0x1F) == (0x67 ^ 0x63)) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIlIlll[0];
            return n2 != 0;
        });
        if (v.lIlIllIlllllIl(var5.isEmpty() ? 1 : 0)) {
            return (TileItem)var5.get(lllIIIlIlll[0]);
        }
        if (v.lIlIllIllllIlI(Inventory.isFull() ? 1 : 0)) {
            return var3.ao.I().orElse((TileItem)var1);
        }
        TileItem var6 = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(lllIIIlIlIl[lllIIIlIlll[7]]));
        if (v.lIlIllIlllllll(var6) && v.lIlIlllIIIIIII(Combat.getMissingHealth(), lllIIIlIlll[6])) {
            return var6;
        }
        return tileItem2;
    }

    public boolean run() {
        int var18;
        int n2;
        v var14;
        if (!v.lIlIllIllllIlI(this.an.t() ? 1 : 0) || v.lIlIllIllllIlI(this.an.s() ? 1 : 0)) {
            return lllIIIlIlll[0];
        }
        TileItem var13 = var14.P();
        if (v.lIlIllIllllIll(var13)) {
            return lllIIIlIlll[0];
        }
        if (v.lIlIllIlllllII(var14.ao.a(var13), lllIIIlIlll[1])) {
            n2 = lllIIIlIlll[2];
            0;
            if (1 < 0) {
                return false;
            }
        } else {
            n2 = var18 = lllIIIlIlll[0];
        }
        if (v.lIlIllIllllIlI(var14.an.v() ? 1 : 0) && v.lIlIllIlllllIl(var18)) {
            return lllIIIlIlll[0];
        }
        if (v.lIlIllIllllllI(var14.an.r(), lllIIIlIlll[3]) && v.lIlIllIlllllIl(var18)) {
            return lllIIIlIlll[0];
        }
        if (v.lIlIllIllllIlI(Movement.isRunEnabled() ? 1 : 0) && v.lIlIllIllllIlI(var14.aq.turnOffRun() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (v.lIlIllIllllIlI(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lllIIIlIlll[2]];
            nArray[v.lllIIIlIlll[0]] = var13.getId();
            if (!v.lIlIllIllllIlI(Inventory.contains((int[])nArray) ? 1 : 0) || v.lIlIllIlllllIl(var13.isStackable() ? 1 : 0)) {
                Item var12 = var14.ap.G();
                if (v.lIlIllIlllllll(var12)) {
                    if (v.lIlIllIllllIlI(var12.hasAction(lllIIIlIlIl[lllIIIlIlll[0]]::equals) ? 1 : 0)) {
                        return lllIIIlIlll[0];
                    }
                    var12.interact(lllIIIlIlIl[lllIIIlIlll[2]]);
                    return lllIIIlIlll[2];
                }
                Item var9 = var14.ao.J().orElse(null);
                if (v.lIlIllIllllIll(var9)) {
                    return lllIIIlIlll[0];
                }
                if (v.lIlIllIlllllIl(var14.ao.a(var9, var13) ? 1 : 0)) {
                    return lllIIIlIlll[0];
                }
                var9.interact(lllIIIlIlIl[lllIIIlIlll[4]]);
            }
        }
        if (v.lIlIllIllllIlI(Movement.shouldWalk() ? 1 : 0)) {
            var13.interact(lllIIIlIlIl[lllIIIlIlll[5]]);
            var14.sleep(lllIIIlIlll[2]);
        }
        return lllIIIlIlll[2];
    }

    private static String lIlIllIlllIlIl(String var11, String var10) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lllIIIlIlll[6]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lllIIIlIlll[4], var4);
            return new String(var8.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIIIIII(int n2, int n3) {
        return n2 > n3;
    }
}

