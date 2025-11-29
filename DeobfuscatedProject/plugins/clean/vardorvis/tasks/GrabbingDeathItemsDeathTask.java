/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;

@TaskDesc(name="Grabbing death items [DEATH]", priority=0x7FFFFFFF, blocking=true)
public class GrabbingDeathItemsDeathTask
extends VardorvisTaskBase {
    @Inject
    private  SquireVardorvisConfig t;
    
    private static final  int ax;

    private static boolean lIllllIlIIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllIlIIIIlIl(int n2) {
        return n2 == 0;
    }

    static {
        F.lIllllIlIIIIlII();
        F.lIllllIIlIllIIl();
        ax = lIlIlIIIIIlll[2];
    }

    private static void lIllllIIlIllIIl() {
        lIlIIlllllIlI = new String[lIlIlIIIIIlll[1]];
        F.lIlIIlllllIlI[F.lIlIlIIIIIlll[0]] = "Loot";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var2_2;
        F var1;
        Player player = Players.getLocal();
        if (F.lIllllIlIIIIlIl(av.contains((Locatable)player) ? 1 : 0)) {
            return lIlIlIIIIIlll[0];
        }
        int[] nArray = new int[lIlIlIIIIIlll[1]];
        nArray[F.lIlIlIIIIIlll[0]] = lIlIlIIIIIlll[2];
        NPC var2 = NPCs.getNearest((int[])nArray);
        if (F.lIllllIlIIIIllI(var2)) {
            var1.aw.d(lIlIlIIIIIlll[0]);
            var1.aw.c(lIlIlIIIIIlll[1]);
            return lIlIlIIIIIlll[0];
        }
        if (F.lIllllIlIIIIlll(Inventory.isFull() ? 1 : 0)) {
            Gear.swapTo((EquipmentSetup)((BankLoadout)var1.t.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup());

            return lIlIlIIIIIlll[1];
        }
        var2_2.interact(lIlIIlllllIlI[lIlIlIIIIIlll[0]]);
        return lIlIlIIIIIlll[1];
    }

    private static boolean lIllllIlIIIIllI(Object object) {
        return object == null;
    }
}

