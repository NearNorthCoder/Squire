/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.gauntlet.GauntletConfig;
import java.util.List;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GameEnum3;
import gg.squire.gauntlet.tasks.LHelper;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Handling prayers", priority=100)
public class HandlingPrayersTask
extends Task {
    private final  c cg;
    private final  GauntletConfig cf;

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var5(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private  boolean a(Player player, l l2, List list, NPC nPC) {
        boolean bl;
        void var6;
        void var7;
        void var8;
        W var9;
        void var10;
        void var11;
        g g2 = g.i(nPC.getId());
        if (W.var12((Object)g2)) {
            return var2[2];
        }
        if (W.var5(var11.getInteracting(), var10)) {
            return var2[1];
        }
        l var13 = var9.cg.V().d(var10.getWorldLocation());
        if (W.var14(var13, var8) && W.var15(var7.contains(var13) ? 1 : 0)) {
            return var2[2];
        }
        if (W.var15(var11.getWorldLocation().toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), var10.getWorldArea()) ? 1 : 0)) {
            return var2[2];
        }
        if (W.var16(var6.ak(), var10.getWorldLocation().distanceTo(var11.getWorldLocation()))) {
            bl = var2[1];
            0;
            if (2 <= 0) {
                return ((0x84 ^ 0xA2) & ~(0x13 ^ 0x35)) != 0;
            }
        } else {
            bl = var2[2];
        }
        return bl;
    }

    private static boolean var17(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var14(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var12(Object object) {
        return object == null;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

    static {
        W.var24();
        W.var25();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        int var26;
        int n2;
        void var27;
        W var28;
        Player player = Players.getLocal();
        if (!W.var29(player) || W.var3(Vars.getBit((int)var2[0]), var2[1])) {
            return var2[2];
        }
        if (W.var15(Prayers.getPoints())) {
            Item var30 = Inventory.getFirst(item -> e.aI.contains(item.getId()));
            if (W.var12(var30)) {
                return var2[2];
            }
            var30.interact(var1[var2[2]]);
            return var2[2];
        }
        if (!W.var4(var28.cg.A() ? 1 : 0) || !W.var29(var28.cg.V()) || W.var4(var28.cg.V().av().e(var27.getWorldLocation()) ? 1 : 0)) {
            if (W.var4(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return var2[1];
            }
            return var2[2];
        }
        Prayer var30 = var28.bJ();
        if (W.var29(var30)) {
            if (W.var4(var28.cf.flickMonsters() ? 1 : 0)) {
                Prayers.flick(List.of(var30));
                0;
                return var2[1];
            }
            if (W.var15(Prayers.isEnabled((Prayer)var30) ? 1 : 0)) {
                Prayers.toggle((Prayer)var30);
                return var2[1];
            }
            return var2[2];
        }
        if (W.var15(NPCs.getAll(arg_0 -> W.c((Player)var27, arg_0)).isEmpty() ? 1 : 0)) {
            n2 = var2[1];
            0;
            if ((161 + 85 - 236 + 188 ^ 167 + 13 - 98 + 112) <= -1) {
                return ((0x3F ^ 0x2D ^ (0xA2 ^ 0x94)) & (0x2D ^ 0x30 ^ (0x5F ^ 0x66) ^ -1)) != 0;
            }
        } else {
            n2 = var2[2];
        }
        if (W.var4(var26 = n2)) {
            List<Prayer> var31 = List.of(Prayer.PROTECT_FROM_MELEE);
            if (W.var4(var28.cf.flickMonsters() ? 1 : 0)) {
                Prayers.flick(var31);
                0;
                return var2[1];
            }
            if (W.var15(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                return var2[1];
            }
            0;
            if (((0x4C ^ 0x23 ^ (0x28 ^ 0x12)) & (207 + 14 - 11 + 16 ^ 130 + 35 - 112 + 130 ^ -1)) != 0) {
                return ((102 + 17 - -2 + 51 ^ 119 + 30 - 85 + 75) & (0xA6 ^ 0xC7 ^ (0xB ^ 0x4D) ^ -1)) != 0;
            }
        } else {
            Prayers.disableAll();
            return var2[1];
        }
        return var2[2];
    }

    private static boolean var16(int n2, int n3) {
        return n2 >= n3;
    }

    private static  boolean c(Player player, NPC nPC) {
        int n2;
        if (W.var15(nPC.isDead() ? 1 : 0) && W.var17(nPC.getWorldLocation().distanceTo(player.getWorldLocation()), var2[3]) && W.var5(nPC.getInteracting(), player) && W.var4(nPC.getWorldLocation().toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), player.getWorldLocation()) ? 1 : 0)) {
            n2 = var2[1];
            0;
            if (((0x21 ^ 0x32) & ~(0x33 ^ 0x20)) == 1) {
                return ((0x74 ^ 0x34) & ~(0x22 ^ 0x62)) != 0;
            }
        } else {
            n2 = var2[2];
        }
        return n2 != 0;
    }

    private static void var25() {
        var1 = new String[var2[1]];
        W.var1[W.var2[2]] = "Drink";
    }

    private static boolean var29(Object object) {
        return object != null;
    }

    private static void var24() {
        var2 = new int[6];
        W.var2[0] = -(0xFFFFF1EB & 0x4E35) & (0xFFFFFBFF & 0x67F9);
        W.var2[1] = 1;
        W.var2[2] = (0x90 ^ 0xBB) & ~(0xAF ^ 0x84);
        W.var2[3] = 3;
        W.var2[4] = 0x27 ^ 0x2F;
        W.var2[5] = 2;
    }

    @Inject
    public HandlingPrayersTask(GauntletConfig gauntletConfig, c c2) {
        this.cf = gauntletConfig;
        this.cg = c2;
    }

    /*
     * WARNING - void declaration
     */
    private Prayer bJ() {
        void var5_5;
        void var32;
        W var33;
        Player player = Players.getLocal();
        if (W.var12(player)) {
            return null;
        }
        l var34 = var33.cg.V().d(var32.getWorldLocation());
        if (W.var12(var34)) {
            return null;
        }
        List<l> var35 = var33.cg.V().c(var34);
        NPC var36 = NPCs.getNearest(arg_0 -> var33.a((Player)var32, var34, var35, arg_0));
        if (W.var12(var36)) {
            return null;
        }
        g var37 = g.i(var36.getId());
        if (W.var12((Object)var37)) {
            return null;
        }
        return var5_5.ai();
    }
}

