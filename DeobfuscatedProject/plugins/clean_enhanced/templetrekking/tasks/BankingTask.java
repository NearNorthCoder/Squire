/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.templetrekking.tasks;

import com.google.inject.Inject;
import gg.squire.templetrekking.tasks.TempletrekkingManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@TaskDesc(name="Banking", priority=15, blocking=true)
public class BankingTask
extends Task {
    private final  b F;
    
    private final  TempleTrekkingConfig E;
    private final  TempleTrekkingPlugin D;
    
    private  Player G;

    @Inject
    public BankingTask(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b b2) {
        this.E = templeTrekkingConfig;
        this.F = b2;
        this.D = templeTrekkingPlugin;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 != n3;
    }

    private static void var10() {
        var1 = new String[var2[7]];
        l.var1[l.var2[0]] = "Eat";
        l.var1[l.var2[1]] = "Drink";
        l.var1[l.var2[2]] = "Bank is null - something went wrong";
        l.var1[l.var2[3]] = "Bank";
        l.var1[l.var2[4]] = "Bank";
        l.var1[l.var2[6]] = "Bank";
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    static {
        l.var13();
        l.var10();
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        l var16;
        this.G = Players.getLocal();
        if (l.var17(this.G)) {
            return var2[0];
        }
        if (l.var12(var16.D.e() ? 1 : 0)) {
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[l.var2[0]] = var16.E.food().u();
        Item var18 = Inventory.getFirst((int[])nArray);
        if (l.var14(var18) && l.var9(Skills.getBoostedLevel((SkiSkill.HITPOINTS), Skills.getLevel((SkiSkill.HITPOINTS))) {
            String[] stringArray = new String[var2[2]];
            stringArray[l.var2[0]] = var1[var2[0]];
            stringArray[l.var2[1]] = var1[var2[1]];
            var18.interact(stringArray);
            var16.sleep(var2[3]);
            return var2[1];
        }
        if (l.var11(var16.E.healInBank() ? 1 : 0) && l.var11(Bank.isOpen() ? 1 : 0) && l.var9(Skills.getBoostedLevel((SkiSkill.HITPOINTS), Skills.getLevel((SkiSkill.HITPOINTS))) {
            double var19 = (double)(Skills.getLevel((SkiSkill.HITPOINTS) - Skills.getBoostedLevel((SkiSkill.HITPOINTS)) / (double)var16.E.food().v();
            int var20 = (int)Math.ceil(var19);
            Bank.withdraw((int)var16.E.food().u(), (int)var20, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            var16.sleep(var2[1]);
            return var2[1];
        }
        if (l.var11(var16.D.i().matchesInventory() ? 1 : 0) && (!l.var11(var16.E.healInBank() ? 1 : 0) || l.var21(Skills.getBoostedLevel((SkiSkill.HITPOINTS), Skills.getLevel((SkiSkill.HITPOINTS)))) {
            if (l.var11(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                var16.sleep(var2[1]);
                return var2[1];
            }
            if (l.var12(Bank.isOpen() ? 1 : 0)) {
                if (l.var12(var16.D.f().contains((Locatable)var16.G) ? 1 : 0)) {
                    Movement.walkTo((WorldArea)var16.D.f());
                    0;
                    return var2[1];
                }
                var16.D.b(var2[0]);
                return var2[0];
            }
        }
        if (l.var11(Bank.isOpen() ? 1 : 0)) {
            var16.D.i().withdraw();
            0;
            var16.sleep(var2[4]);
            return var2[1];
        }
        BankLocation var19 = BankLocation.getNearest();
        WorldArea var22 = var19.getArea();
        if (l.var15(var22.distanceTo2D(var16.G.getWorldArea()), var2[5])) {
            TileObject var20 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (l.var11(tileObject.getName().contains(var1[var2[4]]) ? 1 : 0)) {
                    String[] stringArray = new String[var2[1]];
                    stringArray[l.var2[0]] = var1[var2[6]];
                    if (l.var11(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var2[1];
                        0;
                        if (((0x16 ^ 9) & ~(0x74 ^ 0x6B)) == 0) return n2 != 0;
                        return ((0xB5 ^ 0x8D) & ~(0x9E ^ 0xA6)) != 0;
                    }
                }
                n2 = var2[0];
                return n2 != 0;
            });
            if (l.var17(var20)) {
                System.out.print(var1[var2[2]]);
                var16.D.forceStop();
            }
            if (l.var14(var20) && l.var12(var16.G.isMoving() ? 1 : 0)) {
                var20.interact(var1[var2[3]]);
                return var2[1];
            }
            0;
            if null != null {
                return ((0xF7 ^ 0xB0) & ~(0xF8 ^ 0xBF)) != 0;
            }
        } else {
            Movement.walkTo((BankLocation)var19);
            0;
            return var2[1];
        }
        return var2[0];
    }

    private static boolean var17(Object object) {
        return object == null;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean var21(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var13() {
        var2 = new int[8];
        l.var2[0] = (0x6B ^ 0x7D) & ~(0x27 ^ 0x31);
        l.var2[1] = 1;
        l.var2[2] = 2;
        l.var2[3] = 3;
        l.var2[4] = 0x66 ^ 8 ^ (0x12 ^ 0x78);
        l.var2[5] = 0x18 ^ 0x10;
        l.var2[6] = 0x61 ^ 0x64;
        l.var2[7] = 0x27 ^ 0x7D ^ (0xC0 ^ 0x9C);
    }
}

