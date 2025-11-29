/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.client.Static
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Boarding ship", priority=10, blocking=true)
public class BoardingShipTask
extends TemporossTaskBase {

    @Inject
    protected BoardingShipTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    static {
        v.var3();
        v.var4();
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var7(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        v var8;
        void var9;
        Player player = Players.getLocal();
        if (v.var5(player)) {
            return var1[0];
        }
        if (v.var6(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[3]];
        nArray[v.var1[0]] = var1[4];
        TileObject var10 = TileObjects.getFirstAt((int)var1[1], (int)var1[2], (int)var1[0], (int[])nArray);
        if (v.var5(var10)) {
            return var1[0];
        }
        if (!v.var7(var9.getWorldLocation().getX(), var10.getWorldLocation().getX()) || v.var6(var9.isMoving() ? 1 : 0)) {
            return var1[0];
        }
        if (v.var6(var8.az.solo() ? 1 : 0)) {
            var10.interact(var2[var1[0]]);
            return var1[3];
        }
        var2_2.interact(var2[var1[3]]);
        return var1[3];
    }

    private static void var4() {
        var2 = new String[var1[5]];
        v.var2[v.var1[0]] = "Solo-start";
        v.var2[v.var1[3]] = "Quick-climb";
    }

    private static void var3() {
        var1 = new int[6];
        v.var1[0] = (76 + 108 - 155 + 117 ^ 173 + 30 - 33 + 6) & (0xCB ^ 0x9E ^ (0xED ^ 0x9A) ^ -1);
        v.var1[1] = 0xFFFFEC3F & 0x1FFF;
        v.var1[2] = -(0xFFFFF50F & 0x5AF1) & (0xFFFFDBBB & 0x7F5C);
        v.var1[3] = 1;
        v.var1[4] = 0xFFFFF95D & 0xA7FB;
        v.var1[5] = 2;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }
}

