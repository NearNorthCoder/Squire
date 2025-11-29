/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.widgets.Prayers
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.widgets.Prayers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Restoring Prayer", priority=11, blocking=true)
public class RestoringPrayerTask
extends Task {
    private static final  Logger W;

    static {
        l.var3();
        l.var4();
        W = LoggerFactory.getLogger(RestoringPrayerTask.class);
    }

    private static boolean var5(Object object) {
        return object == null;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (l.var12(Skills.getBoostedLevel((SkiSkill.PRAYER), Skills.getLevel((SkiSkill.PRAYER))) {
            return var2[0];
        }
        String[] stringArray = new String[var2[3]];
        stringArray[l.var2[0]] = var1[var2[0]];
        TileObject var13 = TileObjects.getFirstAt((WorldPoint)new WorldPoint(var2[1], var2[2], var2[0]), (String[])stringArray);
        if (l.var5(var13)) {
            int[] nArray = new int[var2[4]];
            nArray[l.var2[0]] = var2[5];
            nArray[l.var2[3]] = var2[6];
            nArray[l.var2[7]] = var2[8];
            var13 = TileObjects.getNearest((int[])nArray);
            if (l.var5(var13)) {
                return var2[0];
            }
        }
        if (l.var14(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            Prayers.toggleQuickPrayer((boolean)var2[0]);
            return var2[3];
        }
        String[] stringArray2 = new String[var2[7]];
        stringArray2[l.var2[0]] = var1[var2[3]];
        stringArray2[l.var2[3]] = var1[var2[7]];
        var1_1.interact(stringArray2);
        return var2[3];
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var1 = new String[var2[4]];
        l.var1[l.var2[0]] = "Altar";
        l.var1[l.var2[3]] = "Pray-at";
        l.var1[l.var2[7]] = "Drink";
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var2[0];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var2[0];
        while (l.var21(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    private static void var3() {
        var2 = new int[10];
        l.var2[0] = (0x20 ^ 0x66) & ~(0x57 ^ 0x11);
        l.var2[1] = 0xFFFFDA7C & 0x2FAF;
        l.var2[2] = 0xFFFF8EDA & 0x7DAD;
        l.var2[3] = 1;
        l.var2[4] = 3;
        l.var2[5] = 0xFFFFF7BF & 0x7A77;
        l.var2[6] = -(0xFFFFF787 & 0x97F) & (0xFFFFFFBE & 0x737F);
        l.var2[7] = 2;
        l.var2[8] = -(0xFFFFA9E3 & 0x5F9D) & (0xFFFFFFBD & 0x7BFB);
        l.var2[9] = 22 + 110 - 34 + 49 ^ 128 + 46 - 23 + 4;
    }
}

