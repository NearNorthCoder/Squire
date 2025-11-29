/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Gathering hammer", priority=100, blocking=true)
public class GatheringHammerTask
extends TemporossTaskBase {

    @Override
    public boolean ak() {
        boolean bl;
        if (r.var3(this.ar.t() ? 1 : 0)) {
            bl = var2[0];
            0;
            if ((0xAA ^ 0x9F ^ (0x26 ^ 0x17)) == ((0xC3 ^ 0x9A ^ (0x44 ^ 0xA)) & (10 + 136 - 101 + 111 ^ 5 + 79 - 77 + 132 ^ -1))) {
                return ((0x90 ^ 0xB0 ^ (0x1D ^ 2)) & (0x95 ^ 0x8F ^ (0x3D ^ 0x18) ^ -1) & ((0x24 ^ 0x3D ^ (0x14 ^ 0x55)) & (221 + 101 - 293 + 210 ^ 128 + 20 - 70 + 105 ^ -1) ^ -1)) != 0;
            }
        } else {
            bl = var2[1];
        }
        return bl;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected GatheringHammerTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static void var5() {
        var1 = new String[var2[3]];
        r.var1[r.var2[1]] = "Drop";
        r.var1[r.var2[0]] = "Take";
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        r var7;
        int[] nArray = new int[var2[0]];
        nArray[r.var2[1]] = var2[2];
        int n2 = Inventory.getCount((int[])nArray);
        if (r.var8(n2, var2[0])) {
            int[] nArray2 = new int[var2[0]];
            nArray2[r.var2[1]] = var2[2];
            Inventory.getFirst((int[])nArray2).interact(var1[var2[1]]);
            return var2[0];
        }
        c var9 = var7.ar.N();
        TileObject var10 = var9.R();
        if (r.var6(var10) && r.var3(var7.au.a((Locatable)var10) ? 1 : 0)) {
            var10.interact(var1[var2[0]]);
            return var2[0];
        }
        this.au.b(var2_2.Y());
        0;
        return var2[1];
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var2[1];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var2[1];
        while (r.var4(var25, var24)) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (-1 <= 3) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    static {
        r.var27();
        r.var5();
    }

    private static void var27() {
        var2 = new int[5];
        r.var2[0] = 1;
        r.var2[1] = (0xB9 ^ 0x8B) & ~(0x99 ^ 0xAB);
        r.var2[2] = 0xFFFF8F6F & 0x79BB;
        r.var2[3] = 2;
        r.var2[4] = 13 + 8 - -23 + 109 ^ 6 + 39 - 13 + 113;
    }

    private static boolean var8(int n2, int n3) {
        return n2 > n3;
    }
}

