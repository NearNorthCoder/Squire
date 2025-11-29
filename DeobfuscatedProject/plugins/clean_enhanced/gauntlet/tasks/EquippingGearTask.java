/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.GameEnum5;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping gear", priority=5, blocking=true)
public class EquippingGearTask
extends GauntletTaskBase {

    @Override
    public boolean be() {
        Player player = Players.getLocal();
        if (!player != null || (player.isMoving( == 0) ? 1 : 0)) {
            return 1;
        }
        f[] fArray = new f[5];
        fArray[1] = f.TIER_1_BODY;
        fArray[2] = f.TIER_1_HELM;
        fArray[3] = f.TIER_1_LEGS;
        fArray[4] = f.TIER_1_STAFF;
        fArray[0] = f.TIER_2_STAFF;
        List var3 = Stream.of(fArray).filter(f2 -> {
            boolean bl;
            if ((Equipment.contains((int[] == 0)f2.ad()) ? 1 : 0)) {
                bl = 2;
                0;
                if (3 <= -1) {
                    return ((22 + 69 - 79 + 178 ^ 109 + 127 - 200 + 93) & (122 + 114 - 233 + 168 ^ 37 + 18 - 35 + 128 ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }).filter(f2 -> Inventory.contains((int[])f2.ad())).collect(Collectors.toList());
        if ((var3.isEmpty( != 0) ? 1 : 0)) {
            return 1;
        }
        Iterator var4 = var3.iterator();
        if ((var4.hasNext( != 0) ? 1 : 0)) {
            String string;
            f var5 = (f)((Object)var4.next());
            Item var6 = Inventory.getFirst((int[])var5.ad());
            if var6 == null {
                return 1;
            }
            String[] stringArray = new String[2];
            stringArray[1] = var1[1];
            if ((var6.hasActionstringArray)) {
                string = var1[2];
                0;
                if ((0x70 ^ 0x75) <= 0) {
                    return ((0x9B ^ 0xA3) & ~(0xF ^ 0x37)) != 0;
                }
            } else {
                string = var1[3];
            }
            var6.interact(string);
            return 2;
        }
        return 1;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = 1;
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = 1;
        while (var27 < var26) {
            char var28 = var25[var27];
            var22.append((char)(var28 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var22);
    }

    @Inject
    public EquippingGearTask(c c2) {
        d[] dArray = new d[0];
        dArray[1] = d.FIRST_ROTATION_EXPLORE;
        dArray[2] = d.DEMI_BOSS_EXPLORE;
        dArray[3] = d.FIRST_ROTATION_CREATE;
        dArray[4] = d.PREPARE_BOSS_FIGHT;
        super(c2, dArray);
    }

}

