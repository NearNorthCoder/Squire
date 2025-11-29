/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Attack", priority=10, register=true)
public class AttackTask
extends VorkathTaskBase {
    private static final  int cb;
    
    private static final  String ca;
    
    private static final  int bZ;

    private static boolean lIllllllIllllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllllIlllllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllllIllllIl(Object object) {
        return object != null;
    }

    @Override
    public boolean Q() {
        u var1;
        NPC nPC = this.cg.c(lIlIlIllIIIIl[0]);
        if (u.lIllllllIllllII(nPC)) {
            return lIlIlIllIIIIl[1];
        }
        String[] stringArray = new String[lIlIlIllIIIIl[0]];
        stringArray[u.lIlIlIllIIIIl[1]] = lIlIlIllIIIII[lIlIlIllIIIIl[1]];
        NPC var2 = NPCs.getNearest((String[])stringArray);
        if (u.lIllllllIllllIl(var2) && u.lIllllllIlllllI(var2.isDead() ? 1 : 0)) {
            int[] nArray = new int[lIlIlIllIIIIl[0]];
            nArray[u.lIlIlIllIIIIl[1]] = lIlIlIllIIIIl[2];
            if (u.lIllllllIllllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIlIllIIIIl[0]];
                nArray2[u.lIlIlIllIIIIl[1]] = lIlIlIllIIIIl[2];
                Inventory.getFirst((int[])nArray2).interact(lIlIlIllIIIII[lIlIlIllIIIIl[0]]);
            }
            Magic.cast((Spell)SpellBook.Standard.CRUMBLE_UNDEAD, (NPC)var2);
            return lIlIlIllIIIIl[1];
        }
        if (u.lIllllllIllllll(var1.cg.I() ? 1 : 0)) {
            return lIlIlIllIIIIl[1];
        }
        if (u.lIllllllIlllllI(Combat.isSpecEnabled() ? 1 : 0)) {
            EquipmentSetup var3 = var1.cg.D();
            Gear.swapTo((int[])var3.getIds());

        }
        nPC.interact(lIlIlIllIIIII[lIlIlIllIIIIl[3]]);
        return lIlIlIllIIIIl[1];
    }

    private static void lIllllllIlllIlI() {
        lIlIlIllIIIII = new String[lIlIlIllIIIIl[7]];
        u.lIlIlIllIIIII[u.lIlIlIllIIIIl[1]] = "Zombified Spawn";
        u.lIlIlIllIIIII[u.lIlIlIllIIIIl[0]] = "Wield";
        u.lIlIlIllIIIII[u.lIlIlIllIIIIl[3]] = "Attack";
        u.lIlIlIllIIIII[u.lIlIlIllIIIIl[6]] = "Zombified Spawn";
    }

    private static boolean lIlllllllIIIIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var4);
    }

    @Inject
    protected AttackTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    static {
        u.lIllllllIlllIll();
        u.lIllllllIlllIlI();
        bZ = lIlIlIllIIIIl[4];
        cb = lIlIlIllIIIIl[5];
        ca = lIlIlIllIIIII[lIlIlIllIIIIl[6]];
    }

    private static boolean lIllllllIllllII(Object object) {
        return object == null;
    }
}

