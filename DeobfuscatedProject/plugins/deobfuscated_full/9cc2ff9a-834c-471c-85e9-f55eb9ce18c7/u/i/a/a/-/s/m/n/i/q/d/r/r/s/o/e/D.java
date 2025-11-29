/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.b;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.d;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

/* TASK: Looting Items -> LootingTask */
@TaskDesc(name="Looting Items", priority=5, blocking=true)
public class D
extends Task {
    private final /* synthetic */ b aG;
    private static /* synthetic */ int[] lIIlIlIIlIIII;
    private final /* synthetic */ SquireSaraConfig aH;
    private final /* synthetic */ d aF;
    private final /* synthetic */ g aE;
    private static /* synthetic */ String[] lIIlIlIIIlIIl;

    private static boolean lIlIlIllIllIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIllIlIllll(Object object) {
        return object == null;
    }

    private static String lIlIlIllIIIllII(String var10, String var12) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIIlIlIIlIIII[4], var2);
            return new String(var7.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIlIlllI(int n2) {
        return n2 == 0;
    }

    static {
        D.lIlIlIllIlIllIl();
        D.lIlIlIllIlIllII();
    }

    private static void lIlIlIllIlIllII() {
        lIIlIlIIIlIIl = new String[lIIlIlIIlIIII[9]];
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[0]] = D."Pie dish";
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[2]] = D."Drop";
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[4]] = D."Bury";
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[5]] = D."Eat";
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[6]] = D."Drop";
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[7]] = D."Take";
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[8]] = D."bones";
    }

    /*
     * WARNING - void declaration
     */
    private TileItem W() {
        TileItem tileItem2 = this.aF.i().orElse(null);
        if (D.lIlIlIllIllIIll(tileItem2) && D.lIlIlIllIllIlII(this.aF.a(tileItem2), lIIlIlIIlIIII[1])) {
            void var9;
            return var9;
        }
        TileItem var1 = TileItems.getNearest(tileItem -> {
            int n2;
            if (D.lIlIlIllIllIIIl(tileItem.getName().toLowerCase().contains(lIIlIlIIIlIIl[lIIlIlIIlIIII[8]]) ? 1 : 0) && D.lIlIlIllIllIIIl(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIIlIlIIlIIII[2];
                0;
                if (2 == 0) {
                    return ((0x29 ^ 0x1C ^ (0x74 ^ 4)) & (0x24 ^ 0x43 ^ (0x13 ^ 0x31) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlIlIIlIIII[0];
            }
            return n2 != 0;
        });
        if (D.lIlIlIllIllIIll(var1) && D.lIlIlIllIllIlIl(Combat.getMissingHealth())) {
            return var1;
        }
        return tileItem2;
    }

    private static boolean lIlIlIllIllIlIl(int n2) {
        return n2 > 0;
    }

    @Inject
    public D(g g2, d d2, b b2, SquireSaraConfig squireSaraConfig) {
        this.aE = g2;
        this.aF = d2;
        this.aG = b2;
        this.aH = squireSaraConfig;
    }

    private static boolean lIlIlIllIllIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIlIllIlIllIl() {
        lIIlIlIIlIIII = new int[10];
        D.lIIlIlIIlIIII[0] = (0x78 ^ 0x20) & ~(0x13 ^ 0x4B);
        D.lIIlIlIIlIIII[1] = 0xFFFFFFFE & Integer.MAX_VALUE;
        D.lIIlIlIIlIIII[2] = 1;
        D.lIIlIlIIlIIII[3] = 0x8D ^ 0x87;
        D.lIIlIlIIlIIII[4] = 2;
        D.lIIlIlIIlIIII[5] = 3;
        D.lIIlIlIIlIIII[6] = 0xB6 ^ 0xB2;
        D.lIIlIlIIlIIII[7] = 0x40 ^ 0x45;
        D.lIIlIlIIlIIII[8] = 21 + 50 - -4 + 66 ^ 94 + 78 - 154 + 121;
        D.lIIlIlIIlIIII[9] = 0xB7 ^ 0xB0;
    }

    private static boolean lIlIlIllIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        int var3;
        int n2;
        D var6;
        if (D.lIlIlIllIlIlllI(this.aE.m() ? 1 : 0)) {
            return lIIlIlIIlIIII[0];
        }
        TileItem var11 = var6.W();
        if (D.lIlIlIllIlIllll(var11)) {
            return lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIII(var6.aF.a(var11), lIIlIlIIlIIII[1])) {
            n2 = lIIlIlIIlIIII[2];
            0;
            if (1 == -1) {
                return false;
            }
        } else {
            n2 = var3 = lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIIl(var6.aE.l() ? 1 : 0) && D.lIlIlIllIllIIIl(var3)) {
            return lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIIl(var3) && (!D.lIlIlIllIlIlllI(var6.aE.o() ? 1 : 0) || D.lIlIlIllIllIIIl(Players.getLocal().isMoving() ? 1 : 0))) {
            return lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIIl(var3) && D.lIlIlIllIllIIlI(var6.aE.k(), lIIlIlIIlIIII[3])) {
            return lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIIl(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lIIlIlIIlIIII[2]];
            nArray[D.lIIlIlIIlIIII[0]] = var11.getId();
            if (!D.lIlIlIllIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0) || D.lIlIlIllIlIlllI(var11.isStackable() ? 1 : 0)) {
                String[] stringArray = new String[lIIlIlIIlIIII[2]];
                stringArray[D.lIIlIlIIlIIII[0]] = lIIlIlIIIlIIl[lIIlIlIIlIIII[0]];
                Item var4 = Inventory.getFirst((String[])stringArray);
                if (D.lIlIlIllIllIIll(var4)) {
                    var4.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[2]]);
                    return lIIlIlIIlIIII[2];
                }
                Item var8 = var6.aG.g();
                if (D.lIlIlIllIllIIll(var8)) {
                    if (D.lIlIlIllIllIIIl(var8.hasAction(lIIlIlIIIlIIl[lIIlIlIIlIIII[4]]::equals) ? 1 : 0)) {
                        return lIIlIlIIlIIII[0];
                    }
                    var8.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[5]]);
                    return lIIlIlIIlIIII[2];
                }
                Item var13 = var6.aF.j().orElse(null);
                if (D.lIlIlIllIlIllll(var13)) {
                    return lIIlIlIIlIIII[0];
                }
                if (D.lIlIlIllIlIlllI(var6.aF.a(var13, var11) ? 1 : 0)) {
                    return lIIlIlIIlIIII[0];
                }
                var13.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[6]]);
            }
        }
        if (D.lIlIlIllIllIIIl(Movement.isRunEnabled() ? 1 : 0) && D.lIlIlIllIllIIIl(var6.aH.turnOffRun() ? 1 : 0)) {
            Movement.toggleRun();
        }
        var1_1.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[7]]);
        this.sleep(lIIlIlIIlIIII[2]);
        return lIIlIlIIlIIII[2];
    }

    private static boolean lIlIlIllIllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIllIllIIll(Object object) {
        return object != null;
    }
}

