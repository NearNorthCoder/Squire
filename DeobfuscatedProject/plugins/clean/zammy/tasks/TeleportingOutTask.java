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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.tasks.LHelper;
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

    @Inject
    public TeleportingOutTask(l l2, SquireZammyConfig squireZammyConfig, SquireZammy squireZammy) {
        this.J = l2;
        this.K = squireZammyConfig;
        this.L = squireZammy;
    }

    private static boolean llIIIllIIllIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void M() {
        if (n.llIIIllIIllIlll(this.K.altarTeleport() ? 1 : 0)) {
            void var1;
            String[] stringArray = new String[lIllIIllIIIII[0]];
            stringArray[n.lIllIIllIIIII[1]] = lIllIIlIlllll[lIllIIllIIIII[1]];
            TileObject tileObject = TileObjects.getNearest((String[])stringArray);
            if (n.llIIIllIIlllIIl(tileObject)) {
                Magic.cast((Spell)SpellBook.Standard.TELEPORT_TO_HOUSE);
                return;
            }
            var1.interact(lIllIIlIlllll[lIllIIllIIIII[0]]);

            if (((115 + 44 - 84 + 120 ^ 74 + 73 - 29 + 12) & (0xDD ^ 0xAB ^ (0x8E ^ 0xB9) ^ -1)) != 0) {
                return;
            }
        } else {
            Item var1 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIllIIllIIIII[0]];
                stringArray[n.lIllIIllIIIII[1]] = lIllIIlIlllll[lIllIIllIIIII[5]];
                return item.hasAction(stringArray);
            });
            if (n.llIIIllIIlllIIl(var1)) {
                return;
            }
            var1.interact(lIllIIlIlllll[lIllIIllIIIII[4]]);
        }
    }

    private static boolean llIIIllIIlllIIl(Object object) {
        return object == null;
    }

    static {
        n.llIIIllIIllIlIl();
        n.llIIIllIIllIlII();
    }

    private static boolean llIIIllIIllIllI(int n2) {
        return n2 == 0;
    }

    private static void llIIIllIIllIlII() {
        lIllIIlIlllll = new String[lIllIIllIIIII[8]];
        n.lIllIIlIlllll[n.lIllIIllIIIII[1]] = "Zamorak altar";
        n.lIllIIlIlllll[n.lIllIIllIIIII[0]] = "Teleport";
        n.lIllIIlIlllll[n.lIllIIllIIIII[4]] = "Break";
        n.lIllIIlIlllll[n.lIllIIllIIIII[5]] = "Break";
        n.lIllIIlIlllll[n.lIllIIllIIIII[6]] = "Eat";
        n.lIllIIlIlllll[n.lIllIIllIIIII[7]] = "Stamina";
    }

        return String.valueOf(var2);
    }

    private static boolean llIIIllIIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        n var3;
        int var4;
        int n2;
        if (n.llIIIllIIllIllI(Inventory.contains(item -> item.getName().startsWith(lIllIIlIlllll[lIllIIllIIIII[7]])) ? 1 : 0)) {
            n2 = lIllIIllIIIII[0];

            }
        } else {
            n2 = var4 = lIllIIllIIIII[1];
        }
        if (n.llIIIllIIllIllI(Inventory.contains(item -> item.hasAction(lIllIIlIlllll[lIllIIllIIIII[6]]::equals)) ? 1 : 0)) {
            if (n.llIIIllIIllIlll(var3.J.A() ? 1 : 0) && n.llIIIllIIlllIII(Combat.getCurrentHealth(), lIllIIllIIIII[2])) {
                var4 = lIllIIllIIIII[0];

                if ((0x14 ^ 0x10) == 1) {
                    return false;
                }
            } else if (n.llIIIllIIllIllI(var3.J.A() ? 1 : 0) && n.llIIIllIIlllIII(Combat.getCurrentHealth(), lIllIIllIIIII[3])) {
                var4 = lIllIIllIIIII[0];
            }
        }
        if (n.llIIIllIIllIlll(var4)) {
            if (n.llIIIllIIllIllI(var3.J.B() ? 1 : 0)) {
                var3.L.forceStop();

                if (((0x47 ^ 0x5D ^ (0x79 ^ 0x32)) & (0x2F ^ 0x21 ^ (0x57 ^ 8) ^ -1)) != ((0x50 ^ 0x13 ^ (0x77 ^ 0x26)) & (147 + 45 - 86 + 49 ^ 129 + 23 - 20 + 5 ^ -1))) {
                    return false;
                }
            } else {
                var3.M();
            }
            return lIllIIllIIIII[0];
        }
        return lIllIIllIIIII[1];
    }
}

