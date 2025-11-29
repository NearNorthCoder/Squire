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

@TaskDesc(name="Gathering buckets", priority=100, blocking=true)
public class GatheringBucketsTask
extends TemporossTaskBase {

    private static void var3() {
        var2 = new String[var1[3]];
        q.var2[q.var1[1]] = "Drop";
        q.var2[q.var1[0]] = "Take";
        q.var2[q.var1[2]] = "Bucket";
    }

    private static boolean var4(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static void var6() {
        var1 = new int[4];
        q.var1[0] = 1;
        q.var1[1] = (59 + 114 - -9 + 17 ^ 18 + 89 - 70 + 128) & (0x5B ^ 0x68 ^ (0x2C ^ 0x7D) ^ -1);
        q.var1[2] = 2;
        q.var1[3] = 3;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean var13(Object object) {
        return object != null;
    }

    @Override
    public boolean ak() {
        boolean bl;
        if (q.var14(this.ar.p(), this.as.numberOfBuckets())) {
            bl = var1[0];
            0;
            if (1 <= ((0x6B ^ 0x67) & ~(0x44 ^ 0x48))) {
                return ((0x8C ^ 0x96) & ~(0x24 ^ 0x3E)) != 0;
            }
        } else {
            bl = var1[1];
        }
        return bl;
    }

    @Inject
    protected GatheringBucketsTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean var14(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean al() {
        q var15;
        if (q.var4(this.ar.p(), this.as.numberOfBuckets())) {
            Inventory.getFirst(item -> item.getName().contains(var2[var1[2]])).interact(var2[var1[1]]);
            return var1[0];
        }
        c var16 = var15.ar.N();
        TileObject var17 = var16.O();
        if (q.var13(var17) && q.var5(var15.au.a((Locatable)var17) ? 1 : 0)) {
            var17.interact(var2[var1[0]]);
            0;
            
        } else {
            var15.au.b(var16.aa());
            0;
        }
        return var1[0];
    }

    static {
        q.var6();
        q.var3();
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[1];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[1];
        while (q.var27(var26, var25)) {
            char var28 = var24[var26];
            var21.append((char)(var28 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (2 <= 2) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static boolean var27(int n2, int n3) {
        return n2 < n3;
    }
}

