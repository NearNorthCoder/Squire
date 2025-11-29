/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Leaving essence mine", priority=10, blocking=true)
public class LeavingEssenceMineTask
extends Task {

    @Inject
    private  SquireMinerConfig f;

    /*
     * WARNING - void declaration
     */
    private Interactable q() {
        TileObject tileObject;
        void var3;
        void var4;
        String[] stringArray = new String[var1[2]];
        stringArray[o.var1[0]] = var2[var1[2]];
        TileObject tileObject2 = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[var1[2]];
        stringArray2[o.var1[0]] = var2[var1[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray2);
        if (o.var5(nPC)) {
            return var4;
        }
        if (o.var5(var4)) {
            return var3;
        }
        if (o.var6(var3.distanceTo((Locatable)Players.getLocal()), var4.distanceTo((Locatable)Players.getLocal()))) {
            tileObject = var3;
            0;
            if null != null {
                return null;
            }
        } else {
            tileObject = tileObject2;
        }
        return tileObject;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var1[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var1[0];
        while (o.var6(var15, var14)) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (3 != 2) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static void var17() {
        var1 = new int[6];
        o.var1[0] = (0x66 ^ 0x5C) & ~(1 ^ 0x3B);
        o.var1[1] = -(0xFFFFCFF1 & 0x723F) & (0xFFFFEFFF & 0x7F7B);
        o.var1[2] = 1;
        o.var1[3] = 2;
        o.var1[4] = 3;
        o.var1[5] = 77 + 26 - -22 + 28 ^ 124 + 92 - 94 + 23;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        o var18;
        if (o.var19((Object)this.f.activity(), (Object)a.ESSENCE)) {
            return var1[0];
        }
        if (o.var20(Inventory.isFull() ? 1 : 0)) {
            return var1[0];
        }
        Interactable var21 = var18.q();
        if (o.var5(var21)) {
            return var1[0];
        }
        if (o.var20(Locations.isRegionLoaded((int)var1[1]) ? 1 : 0)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[0]]);
        return var1[2];
    }

    private static boolean var20(int n2) {
        return n2 == 0;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static void var28() {
        var2 = new String[var1[4]];
        o.var2[o.var1[0]] = "Use";
        o.var2[o.var1[2]] = "Portal";
        o.var2[o.var1[3]] = "Portal";
    }

    private static boolean var19(Object object, Object object2) {
        return object != object2;
    }

    static {
        o.var17();
        o.var28();
    }
}

