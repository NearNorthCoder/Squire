/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.SquireSaradomin;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Teleporting out", priority=100, blocking=true)
public class TeleportingOutTask
extends Task {
    
    private final  g K;
    private final  SquireSaradomin M;
    private final  SquireSaraConfig L;

    /*
     * WARNING - void declaration
     */
    private void R() {
        if (n.var3(this.L.altarTeleport() ? 1 : 0)) {
            void var4;
            String[] stringArray = new String[var2[0]];
            stringArray[n.var2[1]] = var1[var2[1]];
            TileObject tileObject = TileObjects.getNearest((String[])stringArray);
            if (n.var5(tileObject)) {
                Magic.cast((SpeSpellBook.Standard.TELEPORT_TO_HOUSE);
                return;
            }
            var4.interact(var1[var2[0]]);
            0;
            if (((0xE6 ^ 0xA9 ^ (2 ^ 0x5C)) & (160 + 14 - 61 + 48 ^ 99 + 22 - -20 + 35 ^ -1)) < 0) {
                return;
            }
        } else {
            Item var4 = Inventory.getFirst(item -> {
                String[] stringArray = new String[var2[0]];
                stringArray[n.var2[1]] = var1[var2[4]];
                return item.hasAction(stringArray);
            });
            if (n.var5(var4)) {
                Magic.cast((SpeSpellBook.Standard.TELEPORT_TO_HOUSE);
                return;
            }
            var4.interact(var1[var2[3]]);
        }
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static void var13() {
        var2 = new int[9];
        n.var2[0] = 1;
        n.var2[1] = (10 + 58 - -27 + 41 ^ 36 + 134 - 43 + 22) & (0x4C ^ 1 ^ (0x74 ^ 0x24) ^ -1);
        n.var2[2] = 0x9C ^ 0x8B;
        n.var2[3] = 2;
        n.var2[4] = 3;
        n.var2[5] = 0x99 ^ 0xBF ^ (0x7F ^ 0x5D);
        n.var2[6] = 0x1A ^ 0x1F;
        n.var2[7] = 3 ^ 5;
        n.var2[8] = 60 + 123 - 47 + 66 ^ 143 + 9 - 47 + 89;
    }

    @Inject
    public TeleportingOutTask(g g2, SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin) {
        this.K = g2;
        this.L = squireSaraConfig;
        this.M = squireSaradomin;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var2[1];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var2[1];
        while (n.var6(var22, var21)) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var24(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        n var25;
        int var26;
        int n2;
        if (n.var24(Inventory.contains(item -> item.getName().startsWith(var1[var2[6]])) ? 1 : 0)) {
            n2 = var2[0];
            0;
            if (-2 >= 0) {
                return ((0xD0 ^ 0x91 ^ (0xC8 ^ 0xC2)) & (0x67 ^ 0x44 ^ (6 ^ 0x6E) ^ -1)) != 0;
            }
        } else {
            n2 = var26 = var2[1];
        }
        if (n.var24(Inventory.contains(item -> item.hasAction(var1[var2[5]]::equals)) ? 1 : 0)) {
            if (n.var3(var25.K.l() ? 1 : 0) && n.var6(Combat.getCurrentHealth(), var25.L.eatFoodAt())) {
                var26 = var2[0];
                0;
                if (2 == (0xC ^ 0x26 ^ (0x2A ^ 4))) {
                    return ((0x81 ^ 0xBB ^ (0x44 ^ 0x66)) & (207 + 161 - 221 + 74 ^ 112 + 183 - 209 + 111 ^ -1)) != 0;
                }
            } else if (n.var24(var25.K.l() ? 1 : 0) && n.var6(Combat.getCurrentHealth(), var2[2])) {
                var26 = var2[0];
            }
        }
        if (n.var3(var26)) {
            if (n.var24(var25.K.m() ? 1 : 0)) {
                var25.M.a(var2[0]);
                return var2[1];
            }
            var25.R();
            var25.M.a(var2[0]);
            return var2[0];
        }
        return var2[1];
    }

    private static void var27() {
        var1 = new String[var2[7]];
        n.var1[n.var2[1]] = "Saradomin altar";
        n.var1[n.var2[0]] = "Teleport";
        n.var1[n.var2[3]] = "Break";
        n.var1[n.var2[4]] = "Break";
        n.var1[n.var2[5]] = "Eat";
        n.var1[n.var2[6]] = "Stamina";
    }

    static {
        n.var13();
        n.var27();
    }

    private static boolean var5(Object object) {
        return object == null;
    }
}

