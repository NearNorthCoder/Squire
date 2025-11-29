/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandos;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.bandos.tasks.EHelper;

@TaskDesc(name="Teleporting out", priority=100, blocking=true, register=true)
public class TeleportingOutTask
extends Task {
    private final  SquireBandos K;
    private final  e I;
    
    private final  SquireBandosConfig J;
    private  boolean L;

    private static void lIlIlllIlIIIIl() {
        lllIIIlllll = new String[lllIIlIIIII[4]];
        l.lllIIIlllll[l.lllIIlIIIII[1]] = "Pick-up";
        l.lllIIIlllll[l.lllIIlIIIII[0]] = "Bandos altar";
        l.lllIIIlllll[l.lllIIlIIIII[5]] = "Teleport";
        l.lllIIIlllll[l.lllIIlIIIII[7]] = "Break";
        l.lllIIIlllll[l.lllIIlIIIII[8]] = "blowpipe needs to be charged";
        l.lllIIIlllll[l.lllIIlIIIII[9]] = "Eat";
        l.lllIIIlllll[l.lllIIlIIIII[10]] = "Stamina";
    }

    private static boolean lIlIlllIlIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllIlIIllI(Object object) {
        return object == null;
    }

    private static boolean lIlIlllIlIIlll(Object object, Object object2) {
        return object != object2;
    }

    private void K() {
        l var1;
        if (l.lIlIlllIlIIlII(this.J.pickupCannon() ? 1 : 0) && l.lIlIlllIlIIlII(this.I.y() ? 1 : 0)) {
            int[] nArray = new int[lllIIlIIIII[0]];
            nArray[l.lllIIlIIIII[1]] = lllIIlIIIII[4];
            TileObject tileObject = TileObjects.getNearest((int[])nArray);
            tileObject.interact(lllIIIlllll[lllIIlIIIII[1]]);
            return;
        }
        if (l.lIlIlllIlIIlII(var1.J.altarTeleport() ? 1 : 0)) {
            String[] stringArray = new String[lllIIlIIIII[0]];
            stringArray[l.lllIIlIIIII[1]] = lllIIIlllll[lllIIlIIIII[0]];
            TileObject var2 = TileObjects.getNearest((String[])stringArray);
            if (l.lIlIlllIlIIllI(var2)) {
                var1.L();
                return;
            }
            var2.interact(lllIIIlllll[lllIIlIIIII[5]]);

            if (((0xF0 ^ 0x95 ^ (0x7D ^ 0x57)) & (21 + 149 - 135 + 213 ^ 150 + 44 - 164 + 153 ^ -1)) <= -1) {
                return;
            }
        } else {
            var1.L();
        }
    }

        return String.valueOf(var3);
    }

    static {
        l.lIlIlllIlIIIlI();
        l.lIlIlllIlIIIIl();
    }

    private static boolean lIlIlllIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private void L() {
        int[] nArray = new int[lllIIlIIIII[0]];
        nArray[l.lllIIlIIIII[1]] = lllIIlIIIII[6];
        Item item = Inventory.getFirst((int[])nArray);
        if (l.lIlIlllIlIIllI(item)) {
            Magic.cast((Spell)SpellBook.Standard.TELEPORT_TO_HOUSE);
            return;
        }
        item.interact(lllIIIlllll[lllIIlIIIII[7]]);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var4;
        if (l.lIlIlllIlIIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (l.lIlIlllIlIIlII(var4.getMessage().contains(lllIIIlllll[lllIIlIIIII[8]]) ? 1 : 0)) {
            var5.L = lllIIlIIIII[0];
        }
    }

    public boolean run() {
        l var6;
        int n2;
        if (!l.lIlIlllIlIIIll(this.L ? 1 : 0) || l.lIlIlllIlIIIll(Inventory.contains(item -> item.getName().startsWith(lllIIIlllll[lllIIlIIIII[10]])) ? 1 : 0)) {
            n2 = lllIIlIIIII[0];

            if (1 < 0) {
                return false;
            }
        } else {
            this.L = lllIIlIIIII[1];
            n2 = this.L ? 1 : 0;
        }
        if (l.lIlIlllIlIIIll(Inventory.contains(item -> item.hasAction(lllIIIlllll[lllIIlIIIII[9]]::equals)) ? 1 : 0)) {
            if (l.lIlIlllIlIIlII(var6.I.s() ? 1 : 0) && l.lIlIlllIlIIlIl(Combat.getCurrentHealth(), lllIIlIIIII[2])) {
                var6.L = lllIIlIIIII[0];

                if ((0x65 ^ 0x28 ^ (0xD2 ^ 0x9A)) <= 0) {
                    return ((84 + 22 - -2 + 40 ^ 73 + 153 - 187 + 133) & (0x32 ^ 0x2B ^ (0x29 ^ 8) ^ -1)) != 0;
                }
            } else if (l.lIlIlllIlIIIll(var6.I.s() ? 1 : 0) && l.lIlIlllIlIIlIl(Combat.getCurrentHealth(), lllIIlIIIII[3])) {
                var6.L = lllIIlIIIII[0];
            }
        }
        if (l.lIlIlllIlIIlII(var6.L ? 1 : 0)) {
            if (l.lIlIlllIlIIIll(var6.I.t() ? 1 : 0)) {
                var6.K.forceStop();

                if (1 <= 0) {
                    return false;
                }
            } else {
                var6.K();
            }
            return lllIIlIIIII[0];
        }
        return lllIIlIIIII[1];
    }

    private static boolean lIlIlllIlIIIll(int n2) {
        return n2 == 0;
    }

    @Inject
    public TeleportingOutTask(e e2, SquireBandosConfig squireBandosConfig, SquireBandos squireBandos) {
        this.I = e2;
        this.J = squireBandosConfig;
        this.K = squireBandos;
    }
}

