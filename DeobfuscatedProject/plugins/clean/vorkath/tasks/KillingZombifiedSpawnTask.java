/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Killing zombified spawn", priority=50)
public class KillingZombifiedSpawnTask
extends VorkathTaskBase {

    private static boolean lIlllllIllIIIll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected KillingZombifiedSpawnTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean lIlllllIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllllIllIIIIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    static {
        y.lIlllllIllIIIII();
        y.lIlllllIlIlIllI();
    }

    private static boolean lIlllllIllIIlII(Object object) {
        return object == null;
    }

    private static void lIlllllIlIlIllI() {
        lIlIlIlIIlIll = new String[lIlIlIlIIlllI[4]];
        y.lIlIlIlIIlIll[y.lIlIlIlIIlllI[0]] = "Wield";
        y.lIlIlIlIIlIll[y.lIlIlIlIIlllI[1]] = "Wield";
        y.lIlIlIlIIlIll[y.lIlIlIlIIlllI[3]] = "staff";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var1_1;
        y var2;
        if (y.lIlllllIllIIIIl(this.cg.I() ? 1 : 0)) {
            return lIlIlIlIIlllI[0];
        }
        NPC var3 = var2.cg.A();
        if ((!y.lIlllllIllIIIlI(var3) || y.lIlllllIllIIIll(var3.isDead() ? 1 : 0)) && y.lIlllllIllIIIlI(Players.getLocal().getInteracting())) {
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
            return lIlIlIlIIlllI[0];
        }
        int[] nArray = new int[lIlIlIlIIlllI[1]];
        nArray[y.lIlIlIlIIlllI[0]] = lIlIlIlIIlllI[2];
        if (y.lIlllllIllIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIlIlIIlllI[1]];
            nArray2[y.lIlIlIlIIlllI[0]] = lIlIlIlIIlllI[2];
            Inventory.getFirst((int[])nArray2).interact(lIlIlIlIIlIll[lIlIlIlIIlllI[0]]);

            if (-1 >= 1) {
                return ((0xC0 ^ 0x82 ^ (0xDA ^ 0xBF)) & (0x45 ^ 0xC ^ (0xC ^ 0x62) ^ -1)) != 0;
            }
        } else {
            Inventory.interact(item -> item.getName().toLowerCase().contains(lIlIlIlIIlIll[lIlIlIlIIlllI[3]]), (String)lIlIlIlIIlIll[lIlIlIlIIlllI[1]]);

        }
        if (y.lIlllllIllIIlII(var3)) {
            return lIlIlIlIIlllI[1];
        }
        Magic.cast((Spell)SpellBook.Standard.CRUMBLE_UNDEAD, (NPC)var1_1);
        return lIlIlIlIIlllI[1];
    }

    private static boolean lIlllllIllIIIlI(Object object) {
        return object != null;
    }
}

