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
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.tasks.ConstructionManager;
import i.i.b.s.c.q.r.s.s.-.u.a.e.d;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="Special Attack", priority=15)
public class SpecialAttackTask
extends Task {
    private final  SquireCerberusConfig aN;
    
    private static final  int aM;
    private final  a aO;

    private static boolean lIllIIlIllI(int n2) {
        return n2 == 0;
    }

    private static void lIlIlIIIlII() {
        llIIIIIIl = new String[llIIllIII[7]];
        y.llIIIIIIl[y.llIIllIII[0]] = "Eat";
        y.llIIIIIIl[y.llIIllIII[1]] = "Eat";
        y.llIIIIIIl[y.llIIllIII[6]] = "wild";
    }

    @Inject
    public SpecialAttackTask(SquireCerberusConfig squireCerberusConfig, a a2) {
        this.aN = squireCerberusConfig;
        this.aO = a2;
    }

    static {
        y.lIllIIlIlIl();
        y.lIlIlIIIlII();
        aM = llIIllIII[4];
    }

    public static int j(int n2) {
        if (y.lIllIIllIll(n2, llIIllIII[2])) {
            return llIIllIII[3];
        }
        int n3 = Static.getClient().getEnum(llIIllIII[4]).getIntValue(n2);
        return n3 / llIIllIII[5];
    }

    private static boolean lIllIIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIllIIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIllIII(Object object) {
        return object == null;
    }

        return String.valueOf(lIllIIllIlIllll);
    }

    private static boolean lIllIIllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean run() {
        int lIllIIlllIIIIll;
        int n2;
        y lIllIIlllIIIlll;
        if (y.lIllIIlIllI(this.aN.cerbSpecGear().isSelected() ? 1 : 0)) {
            return llIIllIII[0];
        }
        d lIllIIlllIIIllI = lIllIIlllIIIlll.aO.k();
        if (!y.lIllIIlIlll(lIllIIlllIIIllI) || y.lIllIIllIII(lIllIIlllIIIllI.SpecialAttackTask())) {
            return llIIllIII[0];
        }
        if (y.lIllIIlIllI(Reachable.isInteractable((Locatable)lIllIIlllIIIllI.SpecialAttackTask()) ? 1 : 0)) {
            return llIIllIII[0];
        }
        EquipmentSetup lIllIIlllIIIlIl = ((BankLoadout)lIllIIlllIIIlll.aN.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
        EquipmentSetup lIllIIlllIIIlII = (EquipmentSetup)lIllIIlllIIIlll.aN.cerbSpecGear().selected(EquipmentSetup.class);
        if (y.lIllIIllIIl(Combat.getSpecEnergy(), y.j(lIllIIlllIIIlII.get(EquipmentInventorySlot.WEAPON)))) {
            n2 = llIIllIII[1];

            if (((0xD5 ^ 0x86) & ~(0xE8 ^ 0xBB)) != 0) {
                return false;
            }
        } else {
            n2 = llIIllIII[0];
        }
        if (y.lIllIIlIllI(lIllIIlllIIIIll = n2)) {
            if (y.lIllIIlIllI(Gear.isEquipped((int[])lIllIIlllIIIlIl.getIds()) ? 1 : 0)) {
                Gear.swapTo((EquipmentSetup)lIllIIlllIIIlIl);

                return llIIllIII[1];
            }
            return llIIllIII[0];
        }
        if (y.lIllIIlIllI(Gear.isEquipped((int[])lIllIIlllIIIlII.getIds()) ? 1 : 0)) {
            if (y.lIllIIllIlI(Inventory.getFreeSlots(), llIIllIII[1])) {
                Item lIllIIlllIIIIlI = Inventory.getFirst(item -> {
                    int n2;
                    String[] stringArray = new String[llIIllIII[1]];
                    stringArray[y.llIIllIII[0]] = llIIIIIIl[llIIllIII[1]];
                    if (y.lIllIIlllII(item.hasAction(stringArray) ? 1 : 0) && y.lIllIIlIllI(item.getName().contains(llIIIIIIl[llIIllIII[6]]) ? 1 : 0)) {
                        n2 = llIIllIII[1];

                        }
                    } else {
                        n2 = llIIllIII[0];
                    }
                    return n2 != 0;
                });
                if (y.lIllIIlIlll(lIllIIlllIIIIlI)) {
                    lIllIIlllIIIIlI.interact(llIIIIIIl[llIIllIII[0]]);
                    return llIIllIII[1];
                }
                return llIIllIII[0];
            }
            Gear.swapTo((EquipmentSetup)lIllIIlllIIIlII);

            return llIIllIII[1];
        }
        if (y.lIllIIlIllI(Combat.isSpecEnabled() ? 1 : 0)) {
            Combat.toggleSpec();
            return llIIllIII[1];
        }
        return llIIllIII[0];
    }

}

