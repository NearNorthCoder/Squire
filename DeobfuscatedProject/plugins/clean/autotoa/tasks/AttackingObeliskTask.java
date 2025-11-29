/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
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
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking Obelisk", priority=50)
public class AttackingObeliskTask
extends AutotoaTaskBase {

    private static void lIIlIllllIlIll() {
        lIllIllIIll = new String[lIllIllIlIl[4]];
        bv.lIllIllIIll[bv.lIllIllIlIl[1]] = "Obelisk";
        bv.lIllIllIIll[bv.lIllIllIlIl[0]] = "Attack";
    }

    private static boolean lIIlIllllIllll(int n2) {
        return n2 != 0;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean bq() {
        int n2;
        block3: {
            block2: {
                if (!bv.lIIlIlllllIIll(Combat.getSpecEnergy(), lIllIllIlIl[2])) break block2;
                int[] nArray = new int[lIllIllIlIl[0]];
                nArray[bv.lIllIllIlIl[1]] = lIllIllIlIl[3];
                if (!bv.lIIlIlllllIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block3;
            }
            n2 = lIllIllIlIl[0];

            if (((0xD5 ^ 0x97) & ~(5 ^ 0x47)) == 0) return n2 != 0;
            return false;
        }
        n2 = lIllIllIlIl[1];
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        TileObject var1;
        void var2;
        bv var3;
        String[] stringArray = new String[lIllIllIlIl[0]];
        stringArray[bv.lIllIllIlIl[1]] = lIllIllIIll[lIllIllIlIl[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (bv.lIIlIllllIlllI(nPC)) {
            return lIllIllIlIl[1];
        }
        if (bv.lIIlIllllIllll(var3.aY.g() ? 1 : 0)) {
            return lIllIllIlIl[1];
        }
        var3.a((NPC)var2, lIllIllIlIl[0]);

        if (bv.lIIlIlllllIIII(var3.bg(), lIllIllIlIl[0]) && bv.lIIlIlllllIIIl(var2.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0) && bv.lIIlIlllllIIlI(var1 = TileObjects.getNearest(tileObject -> fH.contains(tileObject.getId())))) {
            return lIllIllIlIl[1];
        }
        nPC.interact(lIllIllIIll[lIllIllIlIl[0]]);
        return lIllIllIlIl[0];
    }

    private static boolean lIIlIlllllIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIlIlllllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlllllIIII(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected AttackingObeliskTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.obeliskGear();
    }

    private static boolean lIIlIlllllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        bv.lIIlIllllIllIl();
        bv.lIIlIllllIlIll();
    }

    private static boolean lIIlIllllIlllI(Object object) {
        return object == null;
    }
}

