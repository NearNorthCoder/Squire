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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        if (n.lIlIlIlIIIlIIlI(this.L.altarTeleport() ? 1 : 0)) {
            void var1;
            String[] stringArray = new String[lIIlIIllIIIIl[0]];
            stringArray[n.lIIlIIllIIIIl[1]] = lIIlIIllIIIII[lIIlIIllIIIIl[1]];
            TileObject tileObject = TileObjects.getNearest((String[])stringArray);
            if (n.lIlIlIlIIIlIlII(tileObject)) {
                Magic.cast((Spell)SpellBook.Standard.TELEPORT_TO_HOUSE);
                return;
            }
            var1.interact(lIIlIIllIIIII[lIIlIIllIIIIl[0]]);

            if (((0xE6 ^ 0xA9 ^ (2 ^ 0x5C)) & (160 + 14 - 61 + 48 ^ 99 + 22 - -20 + 35 ^ -1)) < 0) {
                return;
            }
        } else {
            Item var1 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIIlIIllIIIIl[0]];
                stringArray[n.lIIlIIllIIIIl[1]] = lIIlIIllIIIII[lIIlIIllIIIIl[4]];
                return item.hasAction(stringArray);
            });
            if (n.lIlIlIlIIIlIlII(var1)) {
                Magic.cast((Spell)SpellBook.Standard.TELEPORT_TO_HOUSE);
                return;
            }
            var1.interact(lIIlIIllIIIII[lIIlIIllIIIIl[3]]);
        }
    }

    private static boolean lIlIlIlIIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public TeleportingOutTask(g g2, SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin) {
        this.K = g2;
        this.L = squireSaraConfig;
        this.M = squireSaradomin;
    }

        return String.valueOf(var2);
    }

    private static boolean lIlIlIlIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIIIlIIIl(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        n var3;
        int var4;
        int n2;
        if (n.lIlIlIlIIIlIIIl(Inventory.contains(item -> item.getName().startsWith(lIIlIIllIIIII[lIIlIIllIIIIl[6]])) ? 1 : 0)) {
            n2 = lIIlIIllIIIIl[0];

        } else {
            n2 = var4 = lIIlIIllIIIIl[1];
        }
        if (n.lIlIlIlIIIlIIIl(Inventory.contains(item -> item.hasAction(lIIlIIllIIIII[lIIlIIllIIIIl[5]]::equals)) ? 1 : 0)) {
            if (n.lIlIlIlIIIlIIlI(var3.K.l() ? 1 : 0) && n.lIlIlIlIIIlIIll(Combat.getCurrentHealth(), var3.L.eatFoodAt())) {
                var4 = lIIlIIllIIIIl[0];

                if (2 == (0xC ^ 0x26 ^ (0x2A ^ 4))) {
                    return ((0x81 ^ 0xBB ^ (0x44 ^ 0x66)) & (207 + 161 - 221 + 74 ^ 112 + 183 - 209 + 111 ^ -1)) != 0;
                }
            } else if (n.lIlIlIlIIIlIIIl(var3.K.l() ? 1 : 0) && n.lIlIlIlIIIlIIll(Combat.getCurrentHealth(), lIIlIIllIIIIl[2])) {
                var4 = lIIlIIllIIIIl[0];
            }
        }
        if (n.lIlIlIlIIIlIIlI(var4)) {
            if (n.lIlIlIlIIIlIIIl(var3.K.m() ? 1 : 0)) {
                var3.M.a(lIIlIIllIIIIl[0]);
                return lIIlIIllIIIIl[1];
            }
            var3.R();
            var3.M.a(lIIlIIllIIIIl[0]);
            return lIIlIIllIIIIl[0];
        }
        return lIIlIIllIIIIl[1];
    }

    private static void lIlIlIlIIIIllll() {
        lIIlIIllIIIII = new String[lIIlIIllIIIIl[7]];
        n.lIIlIIllIIIII[n.lIIlIIllIIIIl[1]] = "Saradomin altar";
        n.lIIlIIllIIIII[n.lIIlIIllIIIIl[0]] = "Teleport";
        n.lIIlIIllIIIII[n.lIIlIIllIIIIl[3]] = "Break";
        n.lIIlIIllIIIII[n.lIIlIIllIIIIl[4]] = "Break";
        n.lIIlIIllIIIII[n.lIIlIIllIIIIl[5]] = "Eat";
        n.lIIlIIllIIIII[n.lIIlIIllIIIIl[6]] = "Stamina";
    }

    static {
        n.lIlIlIlIIIlIIII();
        n.lIlIlIlIIIIllll();
    }

    private static boolean lIlIlIlIIIlIlII(Object object) {
        return object == null;
    }
}

