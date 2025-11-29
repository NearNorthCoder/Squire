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
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammy;
import gg.squire.zammy.SquireZammyConfig;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Teleporting out", priority=100, blocking=true)
public class TeleportingOutTask
extends Task {
    
    private final  l J;
    private final  SquireZammy L;
    private final  SquireZammyConfig K;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public TeleportingOutTask(l l2, SquireZammyConfig squireZammyConfig, SquireZammy squireZammy) {
        this.J = l2;
        this.K = squireZammyConfig;
        this.L = squireZammy;
    }

    /*
     * WARNING - void declaration
     */
    private void M() {
        if ((this.K.altarTeleport( != 0) ? 1 : 0)) {
            void var9;
            String[] stringArray = new String[0];
            stringArray[1] = var1[1];
            TileObject tileObject = TileObjects.getNearest((String[])stringArray);
            if tileObject == null {
                Magic.cast((SpeSpellBook.Standard.TELEPORT_TO_HOUSE);
                return;
            }
            var9.interact(var1[0]);
            0;
            if (((115 + 44 - 84 + 120 ^ 74 + 73 - 29 + 12) & (0xDD ^ 0xAB ^ (0x8E ^ 0xB9) ^ -1)) != 0) {
                return;
            }
        } else {
            Item var9 = Inventory.getFirst(item -> {
                String[] stringArray = new String[0];
                stringArray[1] = var1[5];
                return item.hasAction(stringArray);
            });
            if var9 == null {
                return;
            }
            var9.interact(var1[4]);
        }
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 1;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 1;
        while (var18 < var17) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (((0xDF ^ 0x9E) & ~(0x33 ^ 0x72)) < 3) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    public boolean run() {
        n var20;
        int var21;
        int n2;
        if ((Inventory.contains(item -> item.getName( == 0).startsWith(var1[7])) ? 1 : 0)) {
            n2 = 0;
            0;
            if null != null {
                return ((0x13 ^ 0x52) & ~(0x2F ^ 0x6E)) != 0;
            }
        } else {
            n2 = var21 = 1;
        }
        if ((Inventory.contains(item -> item.hasAction(var1[6]::equals == 0)) ? 1 : 0)) {
            if ((var20.J.A( != 0) ? 1 : 0) && (Combat.getCurrentHealth() < 2)) {
                var21 = 0;
                0;
                if ((0x14 ^ 0x10) == 1) {
                    return ((7 ^ 0x21) & ~(0x99 ^ 0xBF)) != 0;
                }
            } else if ((var20.J.A( == 0) ? 1 : 0) && (Combat.getCurrentHealth() < 3)) {
                var21 = 0;
            }
        }
        if var21 {
            if ((var20.J.B( == 0) ? 1 : 0)) {
                var20.L.forceStop();
                0;
                if (((0x47 ^ 0x5D ^ (0x79 ^ 0x32)) & (0x2F ^ 0x21 ^ (0x57 ^ 8) ^ -1)) != ((0x50 ^ 0x13 ^ (0x77 ^ 0x26)) & (147 + 45 - 86 + 49 ^ 129 + 23 - 20 + 5 ^ -1))) {
                    return ((8 + 73 - -23 + 148 ^ 60 + 12 - -67 + 30) & (98 + 71 - 49 + 91 ^ 118 + 72 - 184 + 128 ^ -1)) != 0;
                }
            } else {
                var20.M();
            }
            return 0;
        }
        return 1;
    }
}

