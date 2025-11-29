/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.Optional;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GameEnum3;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.LHelper;
import gg.squire.gauntlet.tasks.MHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Exploring further", priority=1)
public class ExploringFurtherTask
extends GauntletTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var6_7;
        Item lllllllllllllllIlIIlIlIIllIlllll2;
        void var3;
        g var4;
        int var5;
        int n2;
        H var6;
        Player player = Players.getLocal();
        if ((player.getInteracting( != null))) {
            return 1;
        }
        h var7 = var6.ba.V();
        if var7 == null {
            return 1;
        }
        if (((Object)var6.ba.W() == (Object)var6.ba.W()2)d.EXTRA_FOOD_EXPLORE)) {
            n2 = 2;
            0;
            if null != null {
                return ((0x20 ^ 0x15) & ~(0x15 ^ 0x20)) != 0;
            }
        } else {
            n2 = var5 = 1;
        }
        if ((Object != null(var4 = var6.ba.J())) && (var4.an( == 0).aC()) && (var5 == 0)) {
            return 1;
        }
        if ((var6.ba.N( != 0) ? 1 : 0)) {
            return 1;
        }
        if ((var6.ba.O( != 0) ? 1 : 0)) {
            return 1;
        }
        Optional<l> var8 = var7.b(l2 -> {
            int n2;
            if ((l2.aY( == 0) ? 1 : 0) && (l2.aS( == 0) ? 1 : 0)) {
                n2 = 2;
                0;
                if (3 <= ((0x10 ^ 0x38) & ~(0x1F ^ 0x37))) {
                    return ((0xB3 ^ 0x94) & ~(0x33 ^ 0x14)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        }).stream().min(Comparator.comparing(l::aU));
        if ((var8.isEmpty( != 0) ? 1 : 0) && ((var8 = var7.b(l2 -> {
            boolean bl;
            if ((l2.aY( == 0 != 0) ? 1 : 0)) {
                bl = 2;
                0;
                if (((0x13 ^ 0x5F) & ~(0x7E ^ 0x32)) > 0) {
                    return (2 & ~2) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }).stream().min(Comparator.comparing(l::aU))).isEmpty() ? 1 : 0)) {
            WorldPoint lllllllllllllllIlIIlIlIIllIlllll2;
            m var9 = var6.ba.V().av();
            if ((var9.e(lllllllllllllllIlIIlIlIIllIlllll2 = var3.getWorldLocation( != 0)) ? 1 : 0)) {
                var6.ba.a(d.PREPARE_BOSS_FIGHT);
                0;
                if ((8 ^ 0x49 ^ (0xE5 ^ 0xA0)) <= 0) {
                    return ((0x52 ^ 0x17 ^ (0xED ^ 0xB3)) & (0x41 ^ 0x4F ^ (0xD ^ 0x18) ^ -1)) != 0;
                }
            } else {
                var6.ba.a((var9, lllllllllllllllIlIIlIlIIllIlllll2);
                0;
            }
            return 2;
        }
        l var9 = var8.get();
        if ((H.var10(var9.aQ( > 0).distanceToHypotenuse(var3.getWorldLocation()) - var9.aQ().distanceToHypotenuse(var7.av().aQ()), 32.0f)) && (lllllllllllllllIlIIlIlIIllIlllll2 = Inventory.getFirst(item -> e.ab.contains(item.getId( != null))))) {
            lllllllllllllllIlIIlIlIIllIlllll2.interact(var1[1]);
            return 2;
        }
        return this.ba.a((var6_7, player.getWorldLocation());
    }

    @Inject
    public ExploringFurtherTask(c c2) {
        d[] dArray = new d[0];
        dArray[1] = d.DEMI_BOSS_EXPLORE;
        dArray[2] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
    }

    private static int var10(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 1;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 1;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (2 != ((0x48 ^ 0x46 ^ (0x82 ^ 0x87)) & (0x78 ^ 0x63 ^ (0x14 ^ 4) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var14);
    }
}

