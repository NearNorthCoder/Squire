/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.barrows.tasks.GameEnum2;

@TaskDesc(name="Restoring prayer", priority=133337)
public class RestoringPrayerTask
extends Task {
    
    private final  SquireBarrows Q;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (m.var4(this.Q.h() ? 1 : 0)) {
            return var2[0];
        }
        if (m.var5(Prayers.getPoints())) {
            return var2[0];
        }
        Item var6 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[var2[2]];
            stringArray[m.var2[0]] = var1[var2[2]];
            if (m.var7(item.hasAction(stringArray) ? 1 : 0) && (!m.var4(item.getName().toLowerCase().contains(var1[var2[3]]) ? 1 : 0) || m.var7(item.getName().toLowerCase().contains(var1[var2[4]]) ? 1 : 0))) {
                n2 = var2[2];
                0;
                if (((0xEC ^ 0xC4) & ~(0x3D ^ 0x15)) > 2) {
                    return ((0x9E ^ 0x8A) & ~(0x1A ^ 0xE)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (m.var8(var6)) {
            return var2[0];
        }
        NPC var9 = NPCs.getNearest(d::a);
        if (!m.var10(var9) || m.var7(var9.isDead() ? 1 : 0)) {
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        this.sleep(var2[1]);
        return var2[2];
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    static {
        m.var17();
        m.var18();
    }

    private static void var17() {
        var2 = new int[6];
        m.var2[0] = (0xD2 ^ 0xC4) & ~(0xA0 ^ 0xB6);
        m.var2[1] = 102 + 4 - 33 + 60 ^ 105 + 116 - 184 + 92;
        m.var2[2] = 1;
        m.var2[3] = 2;
        m.var2[4] = 3;
        m.var2[5] = 0x9A ^ 0x92;
    }

    private static boolean var5(int n2) {
        return n2 > 0;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    @Inject
    public RestoringPrayerTask(SquireBarrows squireBarrows) {
        this.Q = squireBarrows;
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var2[0];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var2[0];
        while (m.var3(var27, var26)) {
            char var28 = var25[var27];
            var22.append((char)(var28 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if (((1 ^ (0x51 ^ 0x48)) & (0xEE ^ 0xBE ^ (6 ^ 0x4E) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var22);
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    private static void var18() {
        var1 = new String[var2[1]];
        m.var1[m.var2[0]] = "Drink";
        m.var1[m.var2[2]] = "Drink";
        m.var1[m.var2[3]] = "prayer";
        m.var1[m.var2[4]] = "restore";
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }
}

