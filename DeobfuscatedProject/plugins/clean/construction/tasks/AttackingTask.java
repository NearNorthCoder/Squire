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
package gg.squire.construction.tasks;

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
public class AttackingTask
extends Task {
    
    private final  SarachnisConfig gA;
    private  int bD;

    static {
        bH.lIIIllIlIll();
        bH.lIIIllIlIlI();
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
        bH.lIlIIIIlI[bH.lIlIIIIll[2]] = "Attack";
        bH.lIlIIIIlI[bH.lIlIIIIll[1]] = "Using special attack";
        bH.lIlIIIIlI[bH.lIlIIIIll[10]] = "Wield";
        bH.lIlIIIIlI[bH.lIlIIIIll[11]] = "Wield";
        bH.lIlIIIIlI[bH.lIlIIIIll[12]] = "Wield";
        bH.lIlIIIIlI[bH.lIlIIIIll[13]] = "No inventory space to put on spec weapon.";
    }

    @Inject
    public AttackingTask(SarachnisConfig sarachnisConfig) {
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

