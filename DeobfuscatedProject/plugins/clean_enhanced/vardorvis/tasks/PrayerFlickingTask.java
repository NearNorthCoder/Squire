/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFE)
public class PrayerFlickingTask
extends Task {

    public boolean run() {
        int[] nArray = new int[var2[0]];
        nArray[C.var2[1]] = g.T;
        nArray[C.var2[2]] = g.U;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        String[] stringArray = new String[var2[2]];
        stringArray[C.var2[1]] = var1[var2[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (!C.var3(nPC) || !C.var3(nPC.getInteracting()) || C.var4(tileObject)) {
            Prayers.disableAll();
            return var2[1];
        }
        if (C.var5(Prayers.getPoints())) {
            return var2[1];
        }
        Prayers.flick(this.W());
        0;
        return var2[1];
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    private static boolean var5(int n2) {
        return n2 <= 0;
    }

    private static void var6() {
        var2 = new int[7];
        C.var2[0] = 2;
        C.var2[1] = 1 & ~1;
        C.var2[2] = 1;
        C.var2[3] = -(0xFFFFF5FB & 0x4A3F) & (0xFFFFEFFF & 0x5F7F);
        C.var2[4] = 0x59 ^ 0xC ^ (0xDB ^ 0x86);
        C.var2[5] = 3;
        C.var2[6] = 0xA6 ^ 0x9A;
    }

    static {
        C.var6();
        C.var7();
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> W() {
        void var8;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        if (C.var9(Static.getClient().getVarbitValue(var2[3]), var2[4])) {
            Prayer[] prayerArray = new Prayer[var2[5]];
            prayerArray[C.var2[1]] = Prayer.INCREDIBLE_REFLEXES;
            prayerArray[C.var2[2]] = Prayer.ULTIMATE_STRENGTH;
            prayerArray[C.var2[0]] = Prayer.STEEL_SKIN;
            List<Prayer> list = Arrays.asList(prayerArray);
            arrayList.addAll(list);
            0;
            0;
            if (3 <= 1) {
                return null;
            }
        } else {
            var8.add(Prayer.PIETY);
            0;
        }
        int[] nArray = new int[var2[2]];
        nArray[C.var2[1]] = g.S;
        Projectile var10 = Projectiles.getNearest((int[])nArray);
        if (C.var3(var10) && C.var11(var10.getRemainingCycles(), var2[6]) && C.var12(var10.getRemainingCycles())) {
            var8.add(Prayer.PROTECT_FROM_MISSILES);
            0;
            0;
            
        } else {
            var8.add(Prayer.PROTECT_FROM_MELEE);
            0;
        }
        return arrayList;
    }

    private static boolean var12(int n2) {
        return n2 > 0;
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void var7() {
        var1 = new String[var2[2]];
        C.var1[C.var2[1]] = "Vardorvis";
    }

    private static boolean var9(int n2, int n3) {
        return n2 != n3;
    }
}

