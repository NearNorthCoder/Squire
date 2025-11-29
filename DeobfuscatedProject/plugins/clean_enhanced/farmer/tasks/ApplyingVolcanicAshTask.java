/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aN;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum7;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Applying volcanic ash", priority=30, blocking=true)
public class ApplyingVolcanicAshTask
extends aN {

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            
            return null;
        }
        return String.valueOf(var6);
    }

    @Inject
    public ApplyingVolcanicAshTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean b(TileObject tileObject) {
        void var13;
        int var14;
        int n2;
        void var15;
        Item item2 = Inventory.getFirst(item -> {
            boolean bl;
            if ((item.getId() == 4)) {
                bl = 1;
                0;
                if ((0x23 ^ 0x27) <= ((0x78 ^ 0x5D) & ~(0x71 ^ 0x54))) {
                    return ((0xC9 ^ 0x81) & ~(0xFB ^ 0xB3)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        });
        if item2 == null {
            return 0;
        }
        if ((var15.getName( != 0).contains(var2[0]) ? 1 : 0)) {
            n2 = 2;
            0;
            if null != null {
                return ((22 + 8 - -25 + 101 ^ 118 + 38 - 1 + 27) & (0x95 ^ 0x93 ^ (0xEC ^ 0xC0) ^ -1)) != 0;
            }
        } else {
            n2 = var14 = 3;
        }
        if ((var13.getQuantity() < var14)) {
            return 0;
        }
        item2.useOn(tileObject);
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean I(N n2) {
        int n3;
        void var16;
        if ((this.bS.applyVolcanicAsh( == 0) ? 1 : 0)) {
            return 0;
        }
        an var17 = var16.aI();
        au var18 = var17.aY();
        if (((Object)var17.aZ() == (Object)var17.aZ()2)n.HARVESTABLE) && (!((Object)var18 != (Object)au.SUPERCOMPOST) || ((Object)var18 == (Object)au.GIANT_SUPERCOMPOST))) {
            n3 = 1;
            0;
            if (1 <= 0) {
                return ((0x27 ^ 0x49 ^ (0x37 ^ 0x6A)) & (82 + 58 - 72 + 80 ^ 71 + 45 - -24 + 27 ^ -1)) != 0;
            }
        } else {
            n3 = 0;
        }
        return n3 != 0;
    }
}

