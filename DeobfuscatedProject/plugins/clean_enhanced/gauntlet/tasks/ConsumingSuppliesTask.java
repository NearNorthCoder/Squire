/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Consuming supplies", priority=5, register=true)
public class ConsumingSuppliesTask
extends GauntletTaskBase {
    
    private  boolean bF;
    
    private final  b bE;

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (v.var3(e.ax.contains(npcSpawned.getNpc().getId()) ? 1 : 0)) {
            return;
        }
        this.bF = var1[0];
    }

    private static void var4() {
        var2 = new String[var1[4]];
        v.var2[v.var1[1]] = "Eat";
        v.var2[v.var1[0]] = "Drink";
    }

    private boolean bv() {
        boolean bl;
        if (v.var5(NPCs.getAll(nPC -> e.ax.contains(nPC.getId())).size())) {
            bl = var1[0];
            0;
            if (3 < 3) {
                return ((0x1F ^ 0x20 ^ (0xAC ^ 0x86)) & (0x15 ^ 0x46 ^ (7 ^ 0x41) ^ -1)) != 0;
            }
        } else {
            bl = var1[1];
        }
        return bl;
    }

    private static boolean var6(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var7_7;
        int var14;
        int n2;
        int n3;
        v var15;
        Player player = Players.getLocal();
        if (v.var16(player)) {
            return var1[1];
        }
        Item var17 = Inventory.getFirst(item -> e.aH.contains(item.getId()));
        Item var18 = Inventory.getFirst(item -> e.aI.contains(item.getId()));
        int var19 = var15.ba.h().eatToDuringNados();
        int var20 = Skills.getBoostedLevel((SkiSkill.HITPOINTS);
        if (!v.var6(Movement.getRunEnergy(), var1[2]) || v.var13(Skills.getBoostedLevel((SkiSkill.PRAYER), var1[3])) {
            n3 = var1[0];
            0;
            if (-(0x2E ^ 0x6D ^ (0xC2 ^ 0x85)) >= 0) {
                return ((168 + 47 - 64 + 57 ^ 126 + 118 - 147 + 34) & (8 ^ 0x39 ^ (0x22 ^ 0x40) ^ -1)) != 0;
            }
        } else {
            n3 = var1[1];
        }
        int var21 = n3;
        int var22 = var1[1];
        if (v.var23(var15.bv() ? 1 : 0) && !v.var6(var20 - var1[2], var15.ba.h().eatBelowNoNados()) || v.var13(var20, var15.ba.h().eatBelowNoNados())) {
            var15.bF = var1[0];
        }
        if (v.var13(var20, var19) && v.var23(var15.bF) && (!v.var23(var15.bv() ? 1 : 0) || v.var23(Players.getLocal().isMoving() ? 1 : 0))) {
            n2 = var1[0];
            0;
            if (1 <= 0) {
                return ((0x75 ^ 0x16) & ~(0x4C ^ 0x2F)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        if (v.var23(var14 = n2) && v.var24(var17) && v.var3(var15.bE.q() ? 1 : 0)) {
            var17.interact(var2[var1[1]]);
            var15.bE.u();
            var22 = var1[0];
        }
        if (v.var23(var21) && v.var24(var18) && v.var3(var15.bE.s() ? 1 : 0)) {
            var18.interact(var2[var1[0]]);
            var15.bE.ConsumingSuppliesTask();
            var22 = var1[0];
        }
        if (v.var6(var20, var19)) {
            var15.bF = var1[1];
        }
        return (boolean)var7_7;
    }

    private static boolean var5(int n2) {
        return n2 > 0;
    }

    private static String var25(String var26, String var27) {
        var26 = new String(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var28 = new StringBuilder();
        char[] var29 = var27.toCharArray();
        int var30 = var1[1];
        char[] var31 = var26.toCharArray();
        int var32 = var31.length;
        int var33 = var1[1];
        while (v.var13(var33, var32)) {
            char var34 = var31[var33];
            var28.append((char)(var34 ^ var29[var30 % var29.length]));
            0;
            ++var30;
            ++var33;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var28);
    }

    @Inject
    public ConsumingSuppliesTask(c c2, b b2) {
        d[] dArray = new d[var1[0]];
        dArray[v.var1[1]] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bE = b2;
    }

    static {
        v.var35();
        v.var4();
    }

    private static boolean var24(Object object) {
        return object != null;
    }

    private static boolean var16(Object object) {
        return object == null;
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    private static void var35() {
        var1 = new int[5];
        v.var1[0] = 1;
        v.var1[1] = (8 ^ 0x36) & ~(0x16 ^ 0x28);
        v.var1[2] = 56 + 141 - 51 + 2 ^ 38 + 89 - 60 + 61;
        v.var1[3] = 0xF6 ^ 0x87 ^ (0x5B ^ 0x2F);
        v.var1[4] = 2;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }
}

