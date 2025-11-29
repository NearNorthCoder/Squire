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
package gg.squire.bandos.tasks;

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
import gg.squire.bandos.tasks.EHelper;
import gg.squire.bandos.tasks.GHelper;
import gg.squire.bandos.tasks.IHelper;

@TaskDesc(name="Looting Items", priority=5, blocking=true)
public class LootingItemsTask
extends Task {
    private final  i ao;
    private final  g ap;
    private final  SquireBandosConfig aq;
    
    private final  e an;

    private static void lIlIllIlllIllI() {
        lllIIIlIlIl = new String[lllIIIlIlll[8]];
        v.lllIIIlIlIl[v.lllIIIlIlll[0]] = "Bury";
        v.lllIIIlIlIl[v.lllIIIlIlll[2]] = "Eat";
        v.lllIIIlIlIl[v.lllIIIlIlll[4]] = "Drop";
        v.lllIIIlIlIl[v.lllIIIlIlll[5]] = "Take";
        v.lllIIIlIlIl[v.lllIIIlIlll[7]] = "bones";
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

    @Inject
    public LootingItemsTask(e e2, i i2, g g2, SquireBandosConfig squireBandosConfig) {
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
        v var2;
        TileItem tileItem2 = this.ao.H().orElse(null);
        if (v.lIlIllIllllIll(tileItem2)) {
            return null;
        }
        if (v.lIlIllIlllllII(var2.ao.a((TileItem)var1), lllIIIlIlll[1])) {
            return var1;
        }
        List var3 = TileItems.getAll(tileItem -> {
            int n2;
            if (v.lIlIllIllllIlI(tileItem.isStackable() ? 1 : 0)) {
                int[] nArray = new int[lllIIIlIlll[2]];
                nArray[v.lllIIIlIlll[0]] = tileItem.getId();
                if (v.lIlIllIllllIlI(Inventory.contains((int[])nArray) ? 1 : 0) && v.lIlIllIllllIlI(tileItem.getWorldLocation().equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    n2 = lllIIIlIlll[2];

                    if ((0x1B ^ 0x1F) == (0x67 ^ 0x63)) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIlIlll[0];
            return n2 != 0;
        });
        if (v.lIlIllIlllllIl(var3.isEmpty() ? 1 : 0)) {
            return (TileItem)var3.get(lllIIIlIlll[0]);
        }
        if (v.lIlIllIllllIlI(Inventory.isFull() ? 1 : 0)) {
            return var2.ao.I().orElse((TileItem)var1);
        }
        TileItem var4 = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(lllIIIlIlIl[lllIIIlIlll[7]]));
        if (v.lIlIllIlllllll(var4) && v.lIlIlllIIIIIII(Combat.getMissingHealth(), lllIIIlIlll[6])) {
            return var4;
        }
        return tileItem2;
    }

    public boolean run() {
        int var5;
        int n2;
        v var6;
        if (!v.lIlIllIllllIlI(this.an.t() ? 1 : 0) || v.lIlIllIllllIlI(this.an.s() ? 1 : 0)) {
            return lllIIIlIlll[0];
        }
        TileItem var7 = var6.P();
        if (v.lIlIllIllllIll(var7)) {
            return lllIIIlIlll[0];
        }
        if (v.lIlIllIlllllII(var6.ao.a(var7), lllIIIlIlll[1])) {
            n2 = lllIIIlIlll[2];

            if (1 < 0) {
                return false;
            }
        } else {
            n2 = var5 = lllIIIlIlll[0];
        }
        if (v.lIlIllIllllIlI(var6.an.LootingItemsTask() ? 1 : 0) && v.lIlIllIlllllIl(var5)) {
            return lllIIIlIlll[0];
        }
        if (v.lIlIllIllllllI(var6.an.r(), lllIIIlIlll[3]) && v.lIlIllIlllllIl(var5)) {
            return lllIIIlIlll[0];
        }
        if (v.lIlIllIllllIlI(Movement.isRunEnabled() ? 1 : 0) && v.lIlIllIllllIlI(var6.aq.turnOffRun() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (v.lIlIllIllllIlI(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lllIIIlIlll[2]];
            nArray[v.lllIIIlIlll[0]] = var7.getId();
            if (!v.lIlIllIllllIlI(Inventory.contains((int[])nArray) ? 1 : 0) || v.lIlIllIlllllIl(var7.isStackable() ? 1 : 0)) {
                Item var8 = var6.ap.G();
                if (v.lIlIllIlllllll(var8)) {
                    if (v.lIlIllIllllIlI(var8.hasAction(lllIIIlIlIl[lllIIIlIlll[0]]::equals) ? 1 : 0)) {
                        return lllIIIlIlll[0];
                    }
                    var8.interact(lllIIIlIlIl[lllIIIlIlll[2]]);
                    return lllIIIlIlll[2];
                }
                Item var9 = var6.ao.J().orElse(null);
                if (v.lIlIllIllllIll(var9)) {
                    return lllIIIlIlll[0];
                }
                if (v.lIlIllIlllllIl(var6.ao.a(var9, var7) ? 1 : 0)) {
                    return lllIIIlIlll[0];
                }
                var9.interact(lllIIIlIlIl[lllIIIlIlll[4]]);
            }
        }
        if (v.lIlIllIllllIlI(Movement.shouldWalk() ? 1 : 0)) {
            var7.interact(lllIIIlIlIl[lllIIIlIlll[5]]);
            var6.sleep(lllIIIlIlll[2]);
        }
        return lllIIIlIlll[2];
    }

    private static boolean lIlIlllIIIIIII(int n2, int n3) {
        return n2 > n3;
    }
}

