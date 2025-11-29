/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum16;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Panic tping", priority=0x7FFFFFFF, blocking=true)
public class PanicTpingTask
extends ad {

    @Inject
    protected PanicTpingTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ac() {
        aa var9;
        if ((this.aB.isInInstancedRegion( == 0) ? 1 : 0)) {
            return 0;
        }
        int var10 = Inventory.getCount(item -> item.hasAction(var2[1]::equals));
        if (var10 > 0) {
            return 0;
        }
        if ((Combat.getCurrentHealth() > var9.aA.eatAtHP())) {
            return 0;
        }
        h[] var11 = h.values();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            h var14 = var11[var13];
            if ((Inventory.contains((int[] == 0)var14.u()) ? 1 : 0) && (Equipment.contains((int[] == 0)var14.u()) ? 1 : 0)) {
                0;
                if null != null {
                    return ((0x83 ^ 0x9F) & ~(0x55 ^ 0x49)) != 0;
                }
            } else if ((var14.t( != 0) ? 1 : 0)) {
                if ((Inventory.contains((int[] != 0)var14.u()) ? 1 : 0)) {
                    String[] stringArray = new String[1];
                    stringArray[0] = var2[0];
                    stringArray[2] = var2[2];
                    Inventory.getFirst((int[])var14.u()).interact(stringArray);
                }
                if ((Equipment.contains((int[] != 0)var14.u()) ? 1 : 0)) {
                    Equipment.getFirst((int[])var14.u()).interact(var14.s());
                    0;
                    if (1 >= 0) break;
                    return ((0x71 ^ 0x5E) & ~(0x14 ^ 0x3B)) != 0;
                }
            } else if ((Inventory.contains((int[] != 0)var14.u()) ? 1 : 0)) {
                Inventory.getFirst((int[])var14.u()).interact(var14.s());
                0;
                if null == null break;
                return ((25 + 139 - 133 + 160 ^ 74 + 146 - 174 + 124) & (0xEE ^ 0x80 ^ (0x2A ^ 0x51) ^ -1)) != 0;
            }
            ++var13;
            0;
            if ((0xB ^ 0xF) >= ((0x19 ^ 0x3A) & ~(0x18 ^ 0x3B))) continue;
            return ((0x5B ^ 0x12) & ~(0x36 ^ 0x7F)) != 0;
        }
        this.E.a(2);
        return 2;
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 0;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 0;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (2 <= (2 ^ 0x34 ^ (0x70 ^ 0x42))) continue;
            return null;
        }
        return String.valueOf(var18);
    }
}

