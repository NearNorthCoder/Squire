/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.scurrius.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import gg.squire.scurrius.tasks.ScurriusManager;
import gg.squire.scurrius.tasks.ScurriusTaskBase;

@TaskDesc(name="Restoring prayer at Ardougne Monastery", priority=2147483597, blocking=true)
public class RestoringPrayerAtArdougneMonasteryTask
extends ScurriusTaskBase {

    private static void var3() {
        var1 = new int[9];
        h.var1[0] = (0x83 ^ 0xC5 ^ (0x7D ^ 0x21)) & (0xB ^ 0x69 ^ (0x25 ^ 0x5D) ^ -1);
        h.var1[1] = 2;
        h.var1[2] = 1;
        h.var1[3] = 0x41 ^ 0x4B;
        h.var1[4] = 3;
        h.var1[5] = 0x4E ^ 0x4A;
        h.var1[6] = 0x5A ^ 0x47 ^ (0x5A ^ 0x42);
        h.var1[7] = 0x3D ^ 0x6F ^ (0xCD ^ 0x99);
        h.var1[8] = 0x42 ^ 0x45;
    }

    static {
        h.var3();
        h.var4();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean d(int n2) {
        void var5;
        int[] nArray = Static.getClient().getMapRegions();
        int n3 = nArray.length;
        int var6 = var1[0];
        while (h.var7(var6, (int)var5)) {
            void var8;
            void var9;
            void var10 = var9[var6];
            if (h.var11((int)var10, (int)var8)) {
                return var1[2];
            }
            ++var6;
            0;
            
            return ((0x67 ^ 0x48 ^ (0x32 ^ 0x4B)) & (136 + 163 - 104 + 32 ^ 156 + 146 - 288 + 167 ^ -1)) != 0;
        }
        return var1[0];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean a() {
        void var1_2;
        h var12;
        if (h.var13(this.b.ardyCloak() ? 1 : 0)) {
            return var1[0];
        }
        if (h.var14(Skills.getBoostedLevel((SkiSkill.PRAYER), Skills.getLevel((SkiSkill.PRAYER))) {
            return var1[0];
        }
        if (h.var13(var12.d(r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.G) ? 1 : 0)) {
            Item var15 = Inventory.getFirst(item -> item.getName().startsWith(var2[var1[7]]));
            if (h.var16(var15)) {
                var15 = Equipment.getFirst(item -> item.getName().startsWith(var2[var1[6]]));
            }
            if (h.var16(var15)) {
                return var1[0];
            }
            String[] stringArray = new String[var1[1]];
            stringArray[h.var1[0]] = var2[var1[0]];
            stringArray[h.var1[2]] = var2[var1[2]];
            var15.interact(stringArray);
            return var1[2];
        }
        if (h.var17(Players.getLocal().distanceTo(r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.H), var1[3])) {
            Movement.setDestination((WorldPoint)r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.H);
            return var1[2];
        }
        TileObject var15 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.var18(tileObject.getName().equals(var2[var1[4]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[2]];
                stringArray[h.var1[0]] = var2[var1[5]];
                if (h.var18(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[2];
                    0;
                    if (-1 < 3) return n2 != 0;
                    return ((0xBC ^ 0xBB) & ~(0x2A ^ 0x2D)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
        if (h.var16(var15)) {
            return var1[0];
        }
        var1_2.interact(var2[var1[1]]);
        return var1[2];
    }

    private static boolean var14(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var16(Object object) {
        return object == null;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    private static boolean var17(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var11(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var2 = new String[var1[8]];
        h.var2[h.var1[0]] = "Kandarin Monastery";
        h.var2[h.var1[2]] = "Monastery Teleport";
        h.var2[h.var1[1]] = "Pray-at";
        h.var2[h.var1[4]] = "Altar";
        h.var2[h.var1[5]] = "Pray-at";
        h.var2[h.var1[6]] = "Ardougne cloak";
        h.var2[h.var1[7]] = "Ardougne cloak";
    }

    private static String var25(String var26, String var27) {
        var26 = new String(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var28 = new StringBuilder();
        char[] var29 = var27.toCharArray();
        int var30 = var1[0];
        char[] var31 = var26.toCharArray();
        int var32 = var31.length;
        int var33 = var1[0];
        while (h.var7(var33, var32)) {
            char var34 = var31[var33];
            var28.append((char)(var34 ^ var29[var30 % var29.length]));
            0;
            ++var30;
            ++var33;
            0;
            if (((0x76 ^ 3 ^ (0x21 ^ 0x16)) & (0xF5 ^ 0x8C ^ (0x7A ^ 0x41) ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var28);
    }
}

