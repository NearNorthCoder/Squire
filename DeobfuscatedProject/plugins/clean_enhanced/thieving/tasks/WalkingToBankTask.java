/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import gg.squire.thieving.tasks.ThievingManager;
import gg.squire.thieving.tasks.GameEnum5;

@TaskDesc(name="Walking to bank", priority=5000)
public class WalkingToBankTask
extends ThievingManager {

    private  BankLocation aw;

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    static {
        E.var4();
        E.var5();
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (E.var21(var20, var19)) {
            char var22 = var18[var20];
            var15.append((char)(var22 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean l() {
        E var23;
        if (E.var24(this.o.j() ? 1 : 0)) {
            return var1[0];
        }
        if (E.var25(Bank.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        if (E.var25(var23.o() ? 1 : 0)) {
            return var1[0];
        }
        if (E.var24(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        if (E.var25(Inventory.contains(item -> item.getName().toLowerCase().contains(var2[var1[2]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[1]])).interact(var2[var1[0]]);
        }
        if (E.var26(var23.aw)) {
            if (E.var3((Object)var23.p.pickpocketTarget(), (Object)f.VYRE)) {
                var23.aw = BankLocation.HALLOWED_SEPULCHRE_BANK;
                0;
                if (3 <= ((0x70 ^ 0x75) & ~(0x6F ^ 0x6A))) {
                    return ((0x69 ^ 0x71) & ~(1 ^ 0x19)) != 0;
                }
            } else {
                var23.aw = BankLocation.getNearest();
            }
        }
        if (E.var24(Bank.open() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var23.aw.getArea().getCenter());
            0;
            return var1[1];
        }
        return var1[0];
    }

    private static boolean var26(Object object) {
        return object == null;
    }

    private static boolean var24(int n2) {
        return n2 == 0;
    }

    @Inject
    public WalkingToBankTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static void var4() {
        var1 = new int[5];
        E.var1[0] = (0x1E ^ 0x28 ^ (0x76 ^ 0x51)) & (0x12 ^ 0x16 ^ (0xA1 ^ 0xB4) ^ -1);
        E.var1[1] = 1;
        E.var1[2] = 2;
        E.var1[3] = 3;
        E.var1[4] = 64 + 152 - 144 + 99 ^ 148 + 56 - 75 + 34;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private static boolean var25(int n2) {
        return n2 != 0;
    }

    private static void var5() {
        var2 = new String[var1[3]];
        E.var2[E.var1[0]] = "Open-all";
        E.var2[E.var1[1]] = "coin pouch";
        E.var2[E.var1[2]] = "coin pouch";
    }
}

