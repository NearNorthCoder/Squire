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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ap;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Attacking Akkha Shadow", priority=25, blocking=true)
public class at
extends ap {
    private static /* synthetic */ int[] lIlllllIIlI;
    private static /* synthetic */ String[] lIllllIlllI;

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
        Item llllllllllllllllIlIIlIlIlIIIIIll = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (!at.lIIllIllIIIlII(llllllllllllllllIlIIlIlIlIIIIIll) || !at.lIIllIllIIIIll(llllllllllllllllIlIIlIlIlIIIIIll.getName().contains(lIllllIlllI[lIlllllIIlI[4]]) ? 1 : 0) || !at.lIIllIllIIlIII(Combat.getMissingHealth(), lIlllllIIlI[5]) || at.lIIllIllIIlIIl(Combat.getSpecEnergy(), lIlllllIIlI[6])) {
            n2 = lIlllllIIlI[1];
            0;
            if ((0x2C ^ 0x28) <= -1) {
                return ((0x3E ^ 0x70) & ~(0xB ^ 0x45)) != 0;
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
        at.lIllllIlllI[at.lIlllllIIlI[0]] = at."Akkha's Shadow";
        at.lIllllIlllI[at.lIlllllIIlI[1]] = at."Attack";
        at.lIllllIlllI[at.lIlllllIIlI[4]] = at."blowpipe";
    }

    private static String lIIllIlIllIlll(String llllllllllllllllIlIIlIlIIllllIIl, String llllllllllllllllIlIIlIlIIllllIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIlIIllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIIllllIlI.getBytes(StandardCharsets.UTF_8)), lIlllllIIlI[7]), "DES");
            Cipher llllllllllllllllIlIIlIlIIlllllIl = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIlIIlllllIl.init(lIlllllIIlI[4], llllllllllllllllIlIIlIlIIllllllI);
            return new String(llllllllllllllllIlIIlIlIIlllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIlIIlllllII) {
            llllllllllllllllIlIIlIlIIlllllII.printStackTrace();
            return null;
        }
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
        at llllllllllllllllIlIIlIlIlIIIlIII;
        if (at.lIIllIllIIIIll(this.bu() ? 1 : 0)) {
            return lIlllllIIlI[0];
        }
        WorldPoint llllllllllllllllIlIIlIlIlIIIIlll = llllllllllllllllIlIIlIlIlIIIlIII.bx().a(llllllllllllllllIlIIlIlIlIIIlIII.cu);
        String[] stringArray = new String[lIlllllIIlI[1]];
        stringArray[at.lIlllllIIlI[0]] = lIllllIlllI[lIlllllIIlI[0]];
        NPC llllllllllllllllIlIIlIlIlIIIIllI = NPCs.getNearest((WorldPoint)llllllllllllllllIlIIlIlIlIIIIlll, (String[])stringArray);
        if (!at.lIIllIllIIIlII(llllllllllllllllIlIIlIlIlIIIIllI) || at.lIIllIllIIIlIl(llllllllllllllllIlIIlIlIlIIIlIII.g(llllllllllllllllIlIIlIlIlIIIIllI) ? 1 : 0)) {
            return lIlllllIIlI[0];
        }
        Player llllllllllllllllIlIIlIlIlIIIIlIl = Players.getLocal();
        if (at.lIIllIllIIIllI(llllllllllllllllIlIIlIlIlIIIIlIl.getInteracting(), llllllllllllllllIlIIlIlIlIIIIllI) && at.lIIllIllIIIlIl(llllllllllllllllIlIIlIlIlIIIIlIl.isMoving() ? 1 : 0) && at.lIIllIllIIIlll(llllllllllllllllIlIIlIlIlIIIIllI.distanceTo((Locatable)llllllllllllllllIlIIlIlIlIIIIlIl), lIlllllIIlI[2])) {
            llllllllllllllllIlIIlIlIlIIIlIII.g(llllllllllllllllIlIIlIlIlIIIIllI.getWorldLocation());
            return lIlllllIIlI[1];
        }
        this.bp();
        var2_2.interact(lIllllIlllI[lIlllllIIlI[1]]);
        return lIlllllIIlI[1];
    }

    private static String lIIllIlIllIllI(String llllllllllllllllIlIIlIlIIllIllII, String llllllllllllllllIlIIlIlIIllIllIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIlIIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlIlIIlllIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlIlIIlllIIII.init(lIlllllIIlI[4], llllllllllllllllIlIIlIlIIlllIIIl);
            return new String(llllllllllllllllIlIIlIlIIlllIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIlIIllIllll) {
            llllllllllllllllIlIIlIlIIllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIllIIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIllIllIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected at(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void lIIllIllIIIIlI() {
        lIlllllIIlI = new int[8];
        at.lIlllllIIlI[0] = (0x11 ^ 0x7D ^ (5 ^ 0x38)) & (200 + 27 - 162 + 181 ^ 164 + 94 - 106 + 15 ^ -1);
        at.lIlllllIIlI[1] = 1;
        at.lIlllllIIlI[2] = 3;
        at.lIlllllIIlI[3] = -(0xFFFFDBEF & 0x3571) & (0xFFFFFFFB & 0x7BFF);
        at.lIlllllIIlI[4] = 2;
        at.lIlllllIIlI[5] = 183 + 85 - 133 + 55 ^ 75 + 96 - 156 + 155;
        at.lIlllllIIlI[6] = 0x5A ^ 0xA;
        at.lIlllllIIlI[7] = 0x75 ^ 0x30 ^ (0x43 ^ 0xE);
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

