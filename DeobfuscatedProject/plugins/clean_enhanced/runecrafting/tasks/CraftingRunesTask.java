/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Crafting runes", priority=5, blocking=true)
public class CraftingRunesTask
extends RunecraftingTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var2_2;
        p var3;
        int var4;
        int n2;
        int[] nArray = new int[2];
        nArray[1] = 3;
        if (!(Inventory.getCount((int[] <= 0)nArray)) || (this.aV.S() == Static.getClient().getTickCount())) {
            n2 = 2;
            0;
            if (1 < 0) {
                return ((187 + 68 - 215 + 171 ^ 9 + 69 - 77 + 138) & (0xD0 ^ 0xA9 ^ (0x14 ^ 0x35) ^ -1)) != 0;
            }
        } else {
            n2 = 1;
        }
        if (!(var4 = n2 != 0) || (var3.aV.g( != 0) ? 1 : 0)) {
            return 1;
        }
        String[] stringArray = new String[2];
        stringArray[1] = var1[1];
        TileObject var5 = TileObjects.getNearest((String[])stringArray);
        if var5 == null {
            return 1;
        }
        if ((var3.b(GameObjectlllllllllllllllIlIIlIlIllllIlIIl) ? 1 : 0)) {
            return 2;
        }
        var2_2.interact(var1[2]);
        return 2;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = 1;
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = 1;
        while (var14 < var13) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            
            return null;
        }
        return String.valueOf(var9);
    }

    @Inject
    public CraftingRunesTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.ACTIVE;
        cArray[2] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }
}

