/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eat", priority=110)
public class EatTask
extends VorkathManager {

    private static void var3() {
        var1 = new int[6];
        G.var1[0] = 1;
        G.var1[1] = (0x2F ^ 0x1B) & ~(0x6C ^ 0x58);
        G.var1[2] = 3;
        G.var1[3] = -(0xFFFFEDB7 & 0x326F) & (0xFFFFF7EF & 0x2DFF);
        G.var1[4] = 2;
        G.var1[5] = 0x61 ^ 0x69;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    static {
        G.var3();
        G.var6();
    }

    private static boolean var7(Object object) {
        return object == null;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    @Inject
    protected EatTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean var20(int n2) {
        return n2 != 0;
    }

    private static void var6() {
        var2 = new String[var1[4]];
        G.var2[G.var1[1]] = "Eat";
        G.var2[G.var1[0]] = "Eat";
    }

    @Override
    public boolean Q() {
        G var21;
        if (G.var7(this.cg.c(var1[0]))) {
            return var1[1];
        }
        if (G.var4(Math.abs(var21.cf.getTickCount() - var21.cg.EatTask()), var1[2])) {
            return var1[1];
        }
        int[] nArray = new int[var1[0]];
        nArray[G.var1[1]] = var1[3];
        if (G.var5(Projectiles.getNearest((int[])nArray))) {
            return var1[1];
        }
        Item var22 = Inventory.getFirst(item -> item.hasAction(var2[var1[0]]::equals));
        if (G.var7(var22)) {
            return var1[1];
        }
        NPC var23 = var21.cg.A();
        if (G.var5(var23)) {
            return var1[1];
        }
        if (G.var5(var21.cg.A())) {
            return var1[1];
        }
        int var24 = Skills.getLevel((SkiSkill.HITPOINTS);
        int var25 = var21.ce.eatAtHP();
        int var26 = var24 - var25;
        if (G.var20(var21.cg.I() ? 1 : 0)) {
            var25 += var26 / var1[4];
        }
        if (G.var27(Combat.getCurrentHealth(), var25)) {
            var22.interact(var2[var1[1]]);
            var21.cg.a(var21.cf.getTickCount());
            var21.cg.b(var21.cf.getTickCount());
            return var1[0];
        }
        return var1[1];
    }

    private static boolean var27(int n2, int n3) {
        return n2 <= n3;
    }
}

