/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.pvm.tasks;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamansPlugin;
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
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.pvm.tasks.CHelper;
import gg.squire.pvm.tasks.GameEnum;

@TaskDesc(name="Walking to shamans", priority=10, blocking=true)
public class WalkingToShamansTask
extends Task {
    private final  SquireShamansPlugin aP;
    
    private final  c aO;

    private static boolean lIlIlllIlIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIlllIIlIIlIl() {
        lIIlIllllllIl = new String[lIIllIIIIlIlI[4]];
        B.lIIlIllllllIl[B.lIIllIIIIlIlI[0]] = "Drink";
        B.lIIlIllllllIl[B.lIIllIIIIlIlI[2]] = "Stamina";
    }

    private static boolean lIlIlllIllIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlllIlIlllII(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    private void H() {
        void var2_2;
        World var2;
        void var3;
        int n2 = this.aP.c();
        if (B.lIlIlllIlIlllIl(Worlds.getCurrentId(), n2)) {
            this.aP.a(lIIllIIIIlIlI[3]);
            return;
        }
        if (B.lIlIlllIlIllllI((int)var3, lIIllIIIIlIlI[3])) {
            var2 = Worlds.getFirst((int)var3);

            if (1 < 0) {
                return;
            }
        } else {
            var2 = Worlds.getFirst(world -> {
                int n2;
                if (B.lIlIlllIlIllIIl(world.isNormal() ? 1 : 0) && B.lIlIlllIlIllIIl(world.isMembers() ? 1 : 0) && B.lIlIlllIllIIIII(world.getId(), Worlds.getCurrentId())) {
                    n2 = lIIllIIIIlIlI[2];

                    }
                } else {
                    n2 = lIIllIIIIlIlI[0];
                }
                return n2 != 0;
            });
        }
        if (B.lIlIlllIlIlllll(var2) && B.lIlIlllIlIlllll(var2 = Worlds.getFirst(world -> {
            int n2;
            if (B.lIlIlllIlIllIIl(world.isNormal() ? 1 : 0) && B.lIlIlllIlIllIIl(world.isMembers() ? 1 : 0)) {
                n2 = lIIllIIIIlIlI[2];

                }
            } else {
                n2 = lIIllIIIIlIlI[0];
            }
            return n2 != 0;
        }))) {
            return;
        }
        Worlds.hopTo((World)var2_2);
    }

    private static boolean lIlIlllIllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlllIlIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlllIlIlllll(Object object) {
        return object == null;
    }

    public boolean run() {
        B var4;
        if (B.lIlIlllIlIllIIl(this.aO.s() ? 1 : 0)) {
            return lIIllIIIIlIlI[0];
        }
        Item var5 = Inventory.getFirst(item -> item.getName().startsWith(lIIlIllllllIl[lIIllIIIIlIlI[2]]));
        if (B.lIlIlllIlIllIlI(var5) && B.lIlIlllIlIllIll(Movement.isStaminaBoosted() ? 1 : 0) && B.lIlIlllIlIlllII(Movement.getRunEnergy(), lIIllIIIIlIlI[1])) {
            var5.interact(lIIlIllllllIl[lIIllIIIIlIlI[0]]);
            return lIIllIIIIlIlI[2];
        }
        InventorySetup var6 = var4.aO.r();
        if (B.lIlIlllIlIllIll(var6.matchesInventory() ? 1 : 0)) {
            return lIIllIIIIlIlI[0];
        }
        g var7 = var4.aO.t();
        Player var8 = Players.getNearest(player -> {
            int n2;
            if (B.lIlIlllIlIllIIl(var7.x().contains((Locatable)player) ? 1 : 0) && B.lIlIlllIllIIIIl(player, Players.getLocal())) {
                n2 = lIIllIIIIlIlI[2];

                }
            } else {
                n2 = lIIllIIIIlIlI[0];
            }
            return n2 != 0;
        });
        if (B.lIlIlllIlIllIlI(var8)) {
            var4.H();
            return lIIllIIIIlIlI[0];
        }
        if (B.lIlIlllIlIllIIl(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var7.A());

            return lIIllIIIIlIlI[2];
        }
        return lIIllIIIIlIlI[2];
    }

    private static boolean lIlIlllIlIllllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIlllIlIllIlI(Object object) {
        return object != null;
    }

    static {
        B.lIlIlllIlIllIII();
        B.lIlIlllIIlIIlIl();
    }

    private static boolean lIlIlllIlIllIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public WalkingToShamansTask(c c2, SquireShamansPlugin squireShamansPlugin) {
        this.aO = c2;
        this.aP = squireShamansPlugin;
    }

    private static boolean lIlIlllIllIIIIl(Object object, Object object2) {
        return object != object2;
    }
}

