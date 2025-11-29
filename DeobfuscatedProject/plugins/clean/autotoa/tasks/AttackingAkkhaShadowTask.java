/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking Akkha Shadow", priority=25, blocking=true)
public class AttackingAkkhaShadowTask
extends AutotoaTaskBase {

    private static boolean lIIllIllIIIlIl(int n2) {
        return n2 == 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.shadowAttackStyle();
    }

    @Override
    public boolean bq() {
        int n2;
        int[] nArray = new int[lIlllllIIlI[1]];
        nArray[at.lIlllllIIlI[0]] = lIlllllIIlI[3];
        if (at.lIIllIllIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlllllIIlI[1];
        }
        Item var1 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (!at.lIIllIllIIIlII(var1) || !at.lIIllIllIIIIll(var1.getName().contains(lIllllIlllI[lIlllllIIlI[4]]) ? 1 : 0) || !at.lIIllIllIIlIII(Combat.getMissingHealth(), lIlllllIIlI[5]) || at.lIIllIllIIlIIl(Combat.getSpecEnergy(), lIlllllIIlI[6])) {
            n2 = lIlllllIIlI[1];

            if ((0x2C ^ 0x28) <= -1) {
                return false;
            }
        } else {
            n2 = lIlllllIIlI[0];
        }
        return n2 != 0;
    }

    private static boolean lIIllIllIIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIllIllIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIllIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIllIlIllllIl() {
        lIllllIlllI = new String[lIlllllIIlI[2]];
        at.lIllllIlllI[at.lIlllllIIlI[0]] = "Akkha's Shadow";
        at.lIllllIlllI[at.lIlllllIIlI[1]] = "Attack";
        at.lIllllIlllI[at.lIlllllIIlI[4]] = "blowpipe";
    }

    private static boolean lIIllIllIIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        at var2;
        if (at.lIIllIllIIIIll(this.bu() ? 1 : 0)) {
            return lIlllllIIlI[0];
        }
        WorldPoint var3 = var2.bx().a(var2.cu);
        String[] stringArray = new String[lIlllllIIlI[1]];
        stringArray[at.lIlllllIIlI[0]] = lIllllIlllI[lIlllllIIlI[0]];
        NPC var4 = NPCs.getNearest((WorldPoint)var3, (String[])stringArray);
        if (!at.lIIllIllIIIlII(var4) || at.lIIllIllIIIlIl(var2.g(var4) ? 1 : 0)) {
            return lIlllllIIlI[0];
        }
        Player var5 = Players.getLocal();
        if (at.lIIllIllIIIllI(var5.getInteracting(), var4) && at.lIIllIllIIIlIl(var5.isMoving() ? 1 : 0) && at.lIIllIllIIIlll(var4.distanceTo((Locatable)var5), lIlllllIIlI[2])) {
            var2.g(var4.getWorldLocation());
            return lIlllllIIlI[1];
        }
        this.bp();
        var2_2.interact(lIllllIlllI[lIlllllIIlI[1]]);
        return lIlllllIIlI[1];
    }

    private static boolean lIIllIllIIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIllIllIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected AttackingAkkhaShadowTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        at.lIIllIllIIIIlI();
        at.lIIllIlIllllIl();
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.shadowAttackStyle();
    }
}

