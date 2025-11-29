/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.NHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drink Stamina", priority=30000)
public class DrinkStaminaTask
extends Task {

     int cD;
     boolean cE;
    private final  SquireChambersPlugin cC;

    protected boolean cv() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if ((item.getName( != 0).startsWith(var2[5]) ? 1 : 0)) {
                String[] stringArray = new String[3];
                stringArray[0] = var2[6];
                if ((item.hasActionstringArray)) {
                    n2 = 3;
                    0;
                    if (2 != (6 ^ 0x51 ^ (0xCD ^ 0x9E))) return n2 != 0;
                    return ((145 + 70 - 189 + 169 ^ 79 + 67 - 112 + 112) & (51 + 189 - 98 + 111 ^ 145 + 49 - 109 + 87 ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if item2 == null {
            return 0;
        }
        item2.interact(var2[0]);
        this.sleep(4);
        return 3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static  boolean b(n n2, TileObject tileObject) {
        int n3;
        if ((tileObject.getName( != 0).equals(var2[3]) ? 1 : 0)) {
            String[] stringArray = new String[3];
            stringArray[0] = var2[4];
            if ((tileObject.hasActionstringArray) && (n2.a(LocatabletileObject) ? 1 : 0)) {
                n3 = 3;
                0;
                if (-1 <= 0) return n3 != 0;
                return ((0xAE ^ 0xA5) & ~(0x31 ^ 0x3A)) != 0;
            }
        }
        n3 = 0;
        return n3 != 0;
    }

    public boolean run() {
        if ((this.cw( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Movement.getRunEnergy() < 1) && !(Movement.isStaminaBoosted( != 0) ? 1 : 0) || (Movement.getRunEnergy() < 2)) {
            ac var3;
            var3.cv();
            0;
            return 3;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cw() {
        boolean bl2;
        void var4;
        n n2 = this.cC.L();
        if (!n2 != null || (n2.a((Locatable == 0)Players.getLocal()) ? 1 : 0)) {
            return 0;
        }
        TileObject var5 = TileObjects.getNearest(arg_0 -> ac.b((n)var4, arg_0));
        if var5 != null {
            bl2 = 3;
            0;
            
        } else {
            bl2 = 0;
        }
        return bl2;
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
        int var17 = 0;
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = 0;
        while (var20 < var19) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    @Inject
    public DrinkStaminaTask(SquireChambersPlugin squireChambersPlugin) {
        this.cD = 0;
        this.cE = 0;
        this.cC = squireChambersPlugin;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

}

