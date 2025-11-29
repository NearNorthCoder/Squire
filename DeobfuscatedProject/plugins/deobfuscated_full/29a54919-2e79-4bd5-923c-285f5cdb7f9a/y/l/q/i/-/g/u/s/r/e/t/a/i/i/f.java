/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.query.entities.TileItemQuery
 *  net.unethicalite.api.query.results.SceneEntityQueryResults
 */
package y.l.q.i.-.g.u.s.r.e.t.a.i.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.query.entities.TileItemQuery;
import net.unethicalite.api.query.results.SceneEntityQueryResults;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.b;

/* TASK: Looting marks -> LootingmarksTask */
@TaskDesc(name="Looting marks", priority=1000, blocking=true)
public class f
extends Task {
    private final /* synthetic */ AgilityConfig u;
    private static /* synthetic */ int[] lIlIlllllll;
    private static /* synthetic */ String[] lIlIllllllI;

    private static boolean lIIlIlIIlIIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIlIIlIIIlI(int n) {
        return n != 0;
    }

    static {
        f.lIIlIlIIlIIIII();
        f.lIIlIlIIIlllll();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var17;
        f var12;
        int n;
        Player player = Players.getLocal();
        if (!f.lIIlIlIIlIIIIl(player) || f.lIIlIlIIlIIIlI(player.isAnimating() ? 1 : 0)) {
            return lIlIlllllll[0];
        }
        int[] nArray = new int[lIlIlllllll[1]];
        nArray[f.lIlIlllllll[0]] = lIlIlllllll[2];
        if (f.lIIlIlIIlIIIIl(Inventory.getFirst((int[])nArray))) {
            n = lIlIlllllll[1];
            0;
            if (2 >= (0x57 ^ 0x53)) {
                return false;
            }
        } else {
            n = lIlIlllllll[0];
        }
        int var11 = n;
        Item var8 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlllllll[1]];
            stringArray[f.lIlIlllllll[0]] = lIlIllllllI[lIlIlllllll[5]];
            return item.hasAction(stringArray);
        });
        if (f.lIIlIlIIlIIIlI(Inventory.isFull() ? 1 : 0) && f.lIIlIlIIlIIIll(var11) && f.lIIlIlIIlIIlII(var8)) {
            return lIlIlllllll[0];
        }
        TileItem var16 = var12.c(var17.getPlane());
        if (f.lIIlIlIIlIIlII(var16)) {
            return lIlIlllllll[0];
        }
        if (f.lIIlIlIIlIIIlI(var17.isMoving() ? 1 : 0)) {
            return lIlIlllllll[1];
        }
        TileItem var1 = TileItems.getNearest(tileItem2 -> {
            int n;
            if (f.lIIlIlIIlIIIlI(tileItem2.getWorldLocation().equals((Object)var16.getWorldLocation()) ? 1 : 0) && f.lIIlIlIIlIIIlI(tileItem2.getName().equals(lIlIllllllI[lIlIlllllll[4]]) ? 1 : 0)) {
                n = lIlIlllllll[1];
                0;
                if (2 <= ((0x9E ^ 0x94) & ~(0x69 ^ 0x63))) {
                    return false;
                }
            } else {
                n = lIlIlllllll[0];
            }
            return n != 0;
        });
        if (f.lIIlIlIIlIIIIl(var1)) {
            var1.interact(lIlIllllllI[lIlIlllllll[0]]);
            return lIlIlllllll[1];
        }
        if (f.lIIlIlIIlIIIll(var12.v() ? 1 : 0)) {
            var16.interact(lIlIllllllI[lIlIlllllll[1]]);
            return lIlIlllllll[1];
        }
        if (f.lIIlIlIIlIIlIl(var16.getQuantity(), var12.u.markLootAmount())) {
            var16.interact(lIlIllllllI[lIlIlllllll[3]]);
            return lIlIlllllll[1];
        }
        return lIlIlllllll[0];
    }

    private TileItem c(int n) {
        return (TileItem)((SceneEntityQueryResults)((TileItemQuery)((TileItemQuery)((TileItemQuery)TileItems.query().filter(tileItem -> {
            boolean bl;
            if (f.lIIlIlIIlIlIII(tileItem.getPlane(), n)) {
                bl = lIlIlllllll[1];
                0;
                if ((0x66 ^ 0x41 ^ (0x85 ^ 0xA6)) == 1) {
                    return ((99 + 91 - 67 + 84 ^ 126 + 103 - 178 + 102) & (0x11 ^ 7 ^ (0x75 ^ 0x35) ^ -1)) != 0;
                }
            } else {
                bl = lIlIlllllll[0];
            }
            return bl;
        })).filter(tileItem -> {
            boolean bl;
            if (f.lIIlIlIIlIlIII(tileItem.getId(), lIlIlllllll[2])) {
                bl = lIlIlllllll[1];
                0;
                if (((0x7F ^ 0x38 ^ (0xA6 ^ 0xBC)) & (0x87 ^ 0xB7 ^ (0xC5 ^ 0xA8) ^ -1)) != 0) {
                    return false;
                }
            } else {
                bl = lIlIlllllll[0];
            }
            return bl;
        })).filter(Reachable::isInteractable)).results()).nearest();
    }

    private static boolean lIIlIlIIlIIllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIIlIIlIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIlIlIIlIlIIl(int n, int n2) {
        return n < n2;
    }

    @Inject
    public f(AgilityConfig agilityConfig) {
        this.u = agilityConfig;
    }

    private static void lIIlIlIIIlllll() {
        lIlIllllllI = new String[lIlIlllllll[6]];
        f.lIlIllllllI[f.lIlIlllllll[0]] = f."Take";
        f.lIlIllllllI[f.lIlIlllllll[1]] = f."Take";
        f.lIlIllllllI[f.lIlIlllllll[3]] = f."Take";
        f.lIlIllllllI[f.lIlIlllllll[4]] = f."Coins";
        f.lIlIllllllI[f.lIlIlllllll[5]] = f."Eat";
    }

    private static boolean lIIlIlIIlIIIll(int n) {
        return n == 0;
    }

    private static String lIIlIlIIIlllIl(String var3, String var18) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var19 = var18.toCharArray();
        int var2 = lIlIlllllll[0];
        char[] var14 = var3.toCharArray();
        int var13 = var14.length;
        int var5 = lIlIlllllll[0];
        while (f.lIIlIlIIlIlIIl(var5, var13)) {
            char var22 = var14[var5];
            var21.append((char)(var22 ^ var19[var2 % var19.length]));
            0;
            ++var2;
            ++var5;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static void lIIlIlIIlIIIII() {
        lIlIlllllll = new int[8];
        f.lIlIlllllll[0] = (0x2E ^ 0x19) & ~(0x72 ^ 0x45);
        f.lIlIlllllll[1] = 1;
        f.lIlIlllllll[2] = -(0xFFFFF6D7 & 0x492F) & (0xFFFFFF5F & 0x6EEF);
        f.lIlIlllllll[3] = 2;
        f.lIlIlllllll[4] = 3;
        f.lIlIlllllll[5] = 35 + 74 - -26 + 9 ^ 123 + 38 - 58 + 45;
        f.lIlIlllllll[6] = 0xBE ^ 0xBB;
        f.lIlIlllllll[7] = 0xB7 ^ 0xBF;
    }

    private static boolean lIIlIlIIlIlIII(int n, int n2) {
        return n == n2;
    }

    private boolean v() {
        boolean bl;
        b var7;
        b b2;
        if (f.lIIlIlIIlIIIlI(this.u.progressive() ? 1 : 0)) {
            b2 = b.j();
            0;
            if ((0xA2 ^ 0xA6) <= 0) {
                return false;
            }
        } else {
            f var4;
            b2 = var4.u.course();
        }
        if (!f.lIIlIlIIlIIllI((Object)(var7 = b2), (Object)b.ARDOUGNE) || f.lIIlIlIIlIIlll((Object)var7, (Object)b.POLLNIVNEACH)) {
            bl = lIlIlllllll[1];
            0;
            if (-2 > 0) {
                return false;
            }
        } else {
            bl = lIlIlllllll[0];
        }
        return bl;
    }

    private static boolean lIIlIlIIlIIlII(Object object) {
        return object == null;
    }

    private static String lIIlIlIIIllllI(String var9, String var10) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIlIlllllll[7]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIlIlllllll[3], var15);
            return new String(var6.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlIIIIl(Object object) {
        return object != null;
    }
}

