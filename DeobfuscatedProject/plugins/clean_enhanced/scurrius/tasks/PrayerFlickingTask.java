/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFE)
public class PrayerFlickingTask
extends Task {
    private final  SquireScurrius ak;

    @Inject
    public PrayerFlickingTask(SquireScurrius squireScurrius) {
        this.ak = squireScurrius;
    }

    private static boolean var3(int n2, int n3) {
        return n2 <= n3;
    }

    private static void var4() {
        var1 = new String[var2[1]];
        w.var1[w.var2[0]] = "Scurrius";
        w.var1[w.var2[2]] = "Giant rat";
    }

    private static void var5() {
        var2 = new int[4];
        w.var2[0] = (88 + 16 - 42 + 82 ^ 60 + 28 - 12 + 52) & (0xAF ^ 0xB4 ^ (0xCC ^ 0xC7) ^ -1);
        w.var2[1] = 2;
        w.var2[2] = 1;
        w.var2[3] = 0x1D ^ 0x5E ^ (0x25 ^ 0x4B);
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> x() {
        void var6;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        arrayList.addAll(Prayers.getOffensive());
        0;
        int[] nArray = new int[var2[1]];
        nArray[w.var2[0]] = d.C;
        nArray[w.var2[2]] = d.D;
        Projectile projectile = Projectiles.getNearest((int[])nArray);
        if (w.var7(projectile) && w.var3(projectile.getRemainingCycles(), var2[3])) {
            if (w.var8(projectile.getId(), d.C)) {
                arrayList.add(Prayer.PROTECT_FROM_MISSILES);
                0;
                0;
                if null != null {
                    return null;
                }
            } else {
                var6.add(Prayer.PROTECT_FROM_MAGIC);
                0;
                0;
                if ((128 + 51 - 60 + 42 ^ 69 + 102 - 157 + 151) == -1) {
                    return null;
                }
            }
        } else {
            var6.add(Prayer.PROTECT_FROM_MELEE);
            0;
        }
        return arrayList;
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    private static boolean var9(int n2) {
        return n2 <= 0;
    }

    public boolean run() {
        if (w.var10(this.ak.c() ? 1 : 0)) {
            Prayers.disableAll();
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[w.var2[0]] = var1[var2[0]];
        stringArray[w.var2[2]] = var1[var2[2]];
        NPC var11 = NPCs.getNearest((String[])stringArray);
        if (w.var12(var11)) {
            Prayers.disableAll();
            return var2[0];
        }
        if (w.var9(Prayers.getPoints())) {
            w var13;
            var13.ak.e(var2[2]);
            return var2[0];
        }
        Prayers.flick(this.x());
        0;
        return var2[0];
    }

    static {
        w.var5();
        w.var4();
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var2[0];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var2[0];
        while (w.var23(var22, var21)) {
            char var24 = var20[var22];
            var17.append((char)(var24 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static boolean var23(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    private static boolean var8(int n2, int n3) {
        return n2 == n3;
    }
}

