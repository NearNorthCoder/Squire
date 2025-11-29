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
package gg.squire.saradomin.tasks;

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
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Looting Items", priority=5, blocking=true)
public class LootingItemsTask
extends Task {
    private final  b aG;
    
    private final  SquireSaraConfig aH;
    private final  d aF;
    private final  g aE;

    private static boolean lIlIlIllIllIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIllIlIllll(Object object) {
        return object == null;
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
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[0]] = "Pie dish";
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[2]] = "Drop";
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[4]] = "Bury";
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[5]] = "Eat";
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[6]] = "Drop";
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[7]] = "Take";
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[8]] = "bones";
    }

    /*
     * WARNING - void declaration
     */
    private TileItem W() {
        TileItem tileItem2 = this.aF.i().orElse(null);
        if (D.lIlIlIllIllIIll(tileItem2) && D.lIlIlIllIllIlII(this.aF.a(tileItem2), lIIlIlIIlIIII[1])) {
            void var1;
            return var1;
        }
        TileItem var2 = TileItems.getNearest(tileItem -> {
            int n2;
            if (D.lIlIlIllIllIIIl(tileItem.getName().toLowerCase().contains(lIIlIlIIIlIIl[lIIlIlIIlIIII[8]]) ? 1 : 0) && D.lIlIlIllIllIIIl(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIIlIlIIlIIII[2];

                if (2 == 0) {
                    return ((0x29 ^ 0x1C ^ (0x74 ^ 4)) & (0x24 ^ 0x43 ^ (0x13 ^ 0x31) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlIlIIlIIII[0];
            }
            return n2 != 0;
        });
        if (D.lIlIlIllIllIIll(var2) && D.lIlIlIllIllIlIl(Combat.getMissingHealth())) {
            return var2;
        }
        return tileItem2;
    }

    private static boolean lIlIlIllIllIlIl(int n2) {
        return n2 > 0;
    }

    @Inject
    public LootingItemsTask(g g2, d d2, b b2, SquireSaraConfig squireSaraConfig) {
        this.aE = g2;
        this.aF = d2;
        this.aG = b2;
        this.aH = squireSaraConfig;
    }

    private static boolean lIlIlIllIllIlII(int n2, int n3) {
        return n2 >= n3;
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
        D var4;
        if (D.lIlIlIllIlIlllI(this.aE.m() ? 1 : 0)) {
            return lIIlIlIIlIIII[0];
        }
        TileItem var5 = var4.W();
        if (D.lIlIlIllIlIllll(var5)) {
            return lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIII(var4.aF.a(var5), lIIlIlIIlIIII[1])) {
            n2 = lIIlIlIIlIIII[2];

            if (1 == -1) {
                return false;
            }
        } else {
            n2 = var3 = lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIIl(var4.aE.l() ? 1 : 0) && D.lIlIlIllIllIIIl(var3)) {
            return lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIIl(var3) && (!D.lIlIlIllIlIlllI(var4.aE.o() ? 1 : 0) || D.lIlIlIllIllIIIl(Players.getLocal().isMoving() ? 1 : 0))) {
            return lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIIl(var3) && D.lIlIlIllIllIIlI(var4.aE.k(), lIIlIlIIlIIII[3])) {
            return lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIIl(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lIIlIlIIlIIII[2]];
            nArray[D.lIIlIlIIlIIII[0]] = var5.getId();
            if (!D.lIlIlIllIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0) || D.lIlIlIllIlIlllI(var5.isStackable() ? 1 : 0)) {
                String[] stringArray = new String[lIIlIlIIlIIII[2]];
                stringArray[D.lIIlIlIIlIIII[0]] = lIIlIlIIIlIIl[lIIlIlIIlIIII[0]];
                Item var6 = Inventory.getFirst((String[])stringArray);
                if (D.lIlIlIllIllIIll(var6)) {
                    var6.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[2]]);
                    return lIIlIlIIlIIII[2];
                }
                Item var7 = var4.aG.g();
                if (D.lIlIlIllIllIIll(var7)) {
                    if (D.lIlIlIllIllIIIl(var7.hasAction(lIIlIlIIIlIIl[lIIlIlIIlIIII[4]]::equals) ? 1 : 0)) {
                        return lIIlIlIIlIIII[0];
                    }
                    var7.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[5]]);
                    return lIIlIlIIlIIII[2];
                }
                Item var8 = var4.aF.j().orElse(null);
                if (D.lIlIlIllIlIllll(var8)) {
                    return lIIlIlIIlIIII[0];
                }
                if (D.lIlIlIllIlIlllI(var4.aF.a(var8, var5) ? 1 : 0)) {
                    return lIIlIlIIlIIII[0];
                }
                var8.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[6]]);
            }
        }
        if (D.lIlIlIllIllIIIl(Movement.isRunEnabled() ? 1 : 0) && D.lIlIlIllIllIIIl(var4.aH.turnOffRun() ? 1 : 0)) {
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

