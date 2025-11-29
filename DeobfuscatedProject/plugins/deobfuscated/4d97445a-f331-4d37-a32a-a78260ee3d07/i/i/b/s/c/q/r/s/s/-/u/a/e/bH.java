/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.sarachnis.SarachnisConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Attacking")
public class bH
extends Task {
    private static /* synthetic */ int[] lIlIIIIll;
    private final /* synthetic */ SarachnisConfig gA;
    private /* synthetic */ int bD;
    private static /* synthetic */ String[] lIlIIIIlI;

    static {
        bH.lIIIllIlIll();
        bH.lIIIllIlIlI();
    }

    private static void lIIIllIlIll() {
        lIlIIIIll = new int[16];
        bH.lIlIIIIll[0] = -1;
        bH.lIlIIIIll[1] = 1;
        bH.lIlIIIIll[2] = (0x66 ^ 1 ^ (0x40 ^ 0x16)) & (0xE3 ^ 0xBD ^ (0xE9 ^ 0x86) ^ -1);
        bH.lIlIIIIll[3] = -(0xFFFF9AFF & 0x7D67) & (0xFFFFFBFF & 0x3E6F);
        bH.lIlIIIIll[4] = 0xFFFFB7EE & 0x4F37;
        bH.lIlIIIIll[5] = 0xFFFFE7FF & 0x3EA1;
        bH.lIlIIIIll[6] = 0xD ^ 0x15;
        bH.lIlIIIIll[7] = 0x5F ^ 0x48;
        bH.lIlIIIIll[8] = 78 + 119 - 67 + 30;
        bH.lIlIIIIll[9] = 0x85 ^ 0xA6;
        bH.lIlIIIIll[10] = 2;
        bH.lIlIIIIll[11] = 3;
        bH.lIlIIIIll[12] = 0x17 ^ 0x13;
        bH.lIlIIIIll[13] = 40 + 128 - 77 + 100 ^ 108 + 112 - 219 + 185;
        bH.lIlIIIIll[14] = 0xA4 ^ 0xA2;
        bH.lIlIIIIll[15] = 0x13 ^ 0x5B ^ (0x2D ^ 0x6D);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Widget llIIIIlllIIIlII;
        bH llIIIIlllIIlIII;
        Item llIIIIlllIIIlIl;
        void llIIIIlllIIIlll;
        int[] nArray = new int[lIlIIIIll[1]];
        nArray[bH.lIlIIIIll[2]] = lIlIIIIll[3];
        NPC nPC = NPCs.getNearest((int[])nArray);
        WorldArea worldArea = new WorldArea(lIlIIIIll[4], lIlIIIIll[5], lIlIIIIll[6], lIlIIIIll[7], lIlIIIIll[2]);
        if (bH.lIIIllIllII(worldArea.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIlIIIIll[2];
        }
        if (bH.lIIIllIllIl(llIIIIlllIIIlll)) {
            return lIlIIIIll[2];
        }
        if (!bH.lIIIllIlllI(llIIIIlllIIIlll) || bH.lIIIllIllll(llIIIIlllIIIlll.isDead() ? 1 : 0)) {
            return lIlIIIIll[2];
        }
        if (bH.lIIIlllIIII(Players.getLocal().getInteracting(), llIIIIlllIIIlll)) {
            llIIIIlllIIIlll.interact(lIlIIIIlI[lIlIIIIll[2]]);
        }
        if (bH.lIIIllIllII(Combat.isSpecEnabled() ? 1 : 0) && bH.lIIIlllIIIl((llIIIIlllIIIlIl = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)).getId(), llIIIIlllIIlIII.gA.specWeapon().ar()) && bH.lIIIllIlllI(llIIIIlllIIIlII = Widgets.get((int)lIlIIIIll[8], (int)lIlIIIIll[9]))) {
            System.out.println(lIlIIIIlI[lIlIIIIll[1]]);
            llIIIIlllIIIlII.interact(lIlIIIIll[2]);
        }
        if (bH.lIIIllIlllI(Players.getLocal().getInteracting())) {
            if (bH.lIIIlllIIlI(Combat.getSpecEnergy(), llIIIIlllIIlIII.gA.specWeapon().as()) && bH.lIIIllIlllI(llIIIIlllIIIlIl = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) && bH.lIIIlllIIll(llIIIIlllIIIlIl.getId(), llIIIIlllIIlIII.ap())) {
                int[] nArray2 = new int[lIlIIIIll[1]];
                nArray2[bH.lIlIIIIll[2]] = llIIIIlllIIlIII.ap();
                Inventory.getFirst((int[])nArray2).interact(lIlIIIIlI[lIlIIIIll[10]]);
            }
            if (bH.lIIIlllIlII(Combat.getSpecEnergy(), llIIIIlllIIlIII.gA.specWeapon().as()) && bH.lIIIllIlllI(llIIIIlllIIIlIl = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON)) && bH.lIIIlllIIll(llIIIIlllIIIlIl.getId(), llIIIIlllIIlIII.gA.specWeapon().ar())) {
                int[] nArray3 = new int[lIlIIIIll[1]];
                nArray3[bH.lIlIIIIll[2]] = llIIIIlllIIlIII.gA.specWeapon().ar();
                if (bH.lIIIllIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    if (bH.lIIIllIllII(llIIIIlllIIlIII.gA.specWeapon().at() ? 1 : 0)) {
                        llIIIIlllIIlIII.k(llIIIIlllIIIlIl.getId());
                        int[] nArray4 = new int[lIlIIIIll[1]];
                        nArray4[bH.lIlIIIIll[2]] = llIIIIlllIIlIII.gA.specWeapon().ar();
                        Inventory.getFirst((int[])nArray4).interact(lIlIIIIlI[lIlIIIIll[11]]);
                    }
                    if (bH.lIIIllIllll(llIIIIlllIIlIII.gA.specWeapon().at() ? 1 : 0) && bH.lIIIlllIlIl(Inventory.getFreeSlots(), lIlIIIIll[10])) {
                        llIIIIlllIIlIII.k(llIIIIlllIIIlIl.getId());
                        int[] nArray5 = new int[lIlIIIIll[1]];
                        nArray5[bH.lIlIIIIll[2]] = llIIIIlllIIlIII.gA.specWeapon().ar();
                        Inventory.getFirst((int[])nArray5).interact(lIlIIIIlI[lIlIIIIll[12]]);
                        0;
                        if (-(0x14 ^ 0x44 ^ (0x43 ^ 0x17)) >= 0) {
                            return ((124 + 60 - 93 + 55 ^ 125 + 86 - 209 + 159) & (0x4E ^ 0x79 ^ (0x25 ^ 0x21) ^ -1)) != 0;
                        }
                    } else {
                        System.out.println(lIlIIIIlI[lIlIIIIll[13]]);
                    }
                }
            }
        }
        return lIlIIIIll[1];
    }

    private static boolean lIIIlllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIllIlIII(String llIIIIllIllIlII, String llIIIIllIlllIII) {
        llIIIIllIllIlII = new String(Base64.getDecoder().decode(llIIIIllIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIllIllIlll = new StringBuilder();
        char[] llIIIIllIllIllI = llIIIIllIlllIII.toCharArray();
        int llIIIIllIllIlIl = lIlIIIIll[2];
        char[] llIIIIllIlIllll = llIIIIllIllIlII.toCharArray();
        int llIIIIllIlIlllI = llIIIIllIlIllll.length;
        int llIIIIllIlIllIl = lIlIIIIll[2];
        while (bH.lIIIlllIIlI(llIIIIllIlIllIl, llIIIIllIlIlllI)) {
            char llIIIIllIlllIlI = llIIIIllIlIllll[llIIIIllIlIllIl];
            llIIIIllIllIlll.append((char)(llIIIIllIlllIlI ^ llIIIIllIllIllI[llIIIIllIllIlIl % llIIIIllIllIllI.length]));
            0;
            ++llIIIIllIllIlIl;
            ++llIIIIllIlIllIl;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llIIIIllIllIlll);
    }

    private static boolean lIIIllIlllI(Object object) {
        return object != null;
    }

    private static boolean lIIIllIllIl(Object object) {
        return object == null;
    }

    private static boolean lIIIlllIlIl(int n2, int n3) {
        return n2 > n3;
    }

    public int ap() {
        return this.bD;
    }

    private static boolean lIIIlllIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIIllIlIlI() {
        lIlIIIIlI = new String[lIlIIIIll[14]];
        bH.lIlIIIIlI[bH.lIlIIIIll[2]] = bH."Attack";
        bH.lIlIIIIlI[bH.lIlIIIIll[1]] = bH."Using special attack";
        bH.lIlIIIIlI[bH.lIlIIIIll[10]] = bH."Wield";
        bH.lIlIIIIlI[bH.lIlIIIIll[11]] = bH."Wield";
        bH.lIlIIIIlI[bH.lIlIIIIll[12]] = bH."Wield";
        bH.lIlIIIIlI[bH.lIlIIIIll[13]] = bH."No inventory space to put on spec weapon.";
    }

    @Inject
    public bH(SarachnisConfig sarachnisConfig) {
        this.bD = lIlIIIIll[0];
        this.gA = sarachnisConfig;
    }

    private static boolean lIIIlllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlllIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlllIIII(Object object, Object object2) {
        return object != object2;
    }

    private static String lIIIllIIlll(String llIIIIllIlIIIlI, String llIIIIllIlIIIIl) {
        try {
            SecretKeySpec llIIIIllIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIllIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIllIlIIllI = Cipher.getInstance("Blowfish");
            llIIIIllIlIIllI.init(lIlIIIIll[10], llIIIIllIlIIlll);
            return new String(llIIIIllIlIIllI.doFinal(Base64.getDecoder().decode(llIIIIllIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIllIlIIlIl) {
            llIIIIllIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIllIlIIl(String llIIIIllIIlIlll, String llIIIIllIIlIlII) {
        try {
            SecretKeySpec llIIIIllIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIllIIlIlII.getBytes(StandardCharsets.UTF_8)), lIlIIIIll[15]), "DES");
            Cipher llIIIIllIIllIIl = Cipher.getInstance("DES");
            llIIIIllIIllIIl.init(lIlIIIIll[10], llIIIIllIIllIlI);
            return new String(llIIIIllIIllIIl.doFinal(Base64.getDecoder().decode(llIIIIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIllIIllIII) {
            llIIIIllIIllIII.printStackTrace();
            return null;
        }
    }

    public void k(int n2) {
        this.bD = n2;
    }

    private static boolean lIIIllIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllIllII(int n2) {
        return n2 == 0;
    }
}

