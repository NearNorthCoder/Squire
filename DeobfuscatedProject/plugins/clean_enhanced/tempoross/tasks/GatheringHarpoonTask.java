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

@TaskDesc(name="Gathering harpoon", priority=100, blocking=true)
public class GatheringHarpoonTask
extends TemporossTaskBase {

    @Override
    public boolean ak() {
        boolean bl;
        if (s.var3(this.ar.m() ? 1 : 0)) {
            bl = var2[0];
            0;
            if (-(0x9E ^ 0x9A) >= 0) {
                return ((0x68 ^ 0x79) & ~(0xA0 ^ 0xB1)) != 0;
            }
        } else {
            bl = var2[1];
        }
        return bl;
    }

    private static boolean var4(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        s var5;
        int n2 = Inventory.getCount(item -> item.getName().toLowerCase().endsWith(var1[var2[3]]));
        if (s.var4(n2, var2[0])) {
            int[] nArray = new int[var2[0]];
            nArray[s.var2[1]] = var2[2];
            Inventory.getFirst((int[])nArray).interact(var1[var2[1]]);
            return var2[0];
        }
        c var6 = var5.ar.N();
        TileObject var7 = var6.S();
        if (s.var8(var7) && s.var3(var5.au.a((Locatable)var7) ? 1 : 0)) {
            var7.interact(var1[var2[0]]);
            return var2[0];
        }
        this.au.b(var2_2.Y());
        0;
        return var2[0];
    }

    private static void var9() {
        var2 = new int[5];
        s.var2[0] = 1;
        s.var2[1] = (138 + 58 - 138 + 83 ^ 10 + 26 - -112 + 2) & (0x38 ^ 0x4A ^ (0xC4 ^ 0xAD) ^ -1);
        s.var2[2] = 0xFFFFEFBF & 0x1177;
        s.var2[3] = 2;
        s.var2[4] = 3;
    }

    @Inject
    protected GatheringHarpoonTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static void var10() {
        var1 = new String[var2[4]];
        s.var1[s.var2[1]] = "Drop";
        s.var1[s.var2[0]] = "Take";
        s.var1[s.var2[3]] = "harpoon";
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    static {
        s.var9();
        s.var10();
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var2[1];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var2[1];
        while (s.var11(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (((0x5A ^ 0x68) & ~(0x40 ^ 0x72)) == 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }
}

