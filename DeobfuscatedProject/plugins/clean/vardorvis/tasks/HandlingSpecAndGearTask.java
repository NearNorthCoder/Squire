/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.api.combat.CombatOptions
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.client.Static
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.client.Static;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Handling Spec and Gear", priority=100000)
public class HandlingSpecAndGearTask
extends VardorvisTaskBase {

    static {
        A.lIllllIIllIllII();
        A.lIllllIIllIlIll();
    }

    private static void lIllllIIllIlIll() {
        lIlIlIIIIIIIl = new String[lIlIlIIIIIIlI[5]];
        A.lIlIlIIIIIIIl[A.lIlIlIIIIIIlI[0]] = "None";
        A.lIlIlIIIIIIIl[A.lIlIlIIIIIIlI[3]] = "You setup your spec weapon setup with a weapon that has no spec!!!";
    }

    private static boolean lIllllIIllIllIl(Object object) {
        return object != null;
    }

    private static boolean lIllllIIllIlllI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean l() {
        A var1;
        String string = this.t.specGear().getSelected();
        if (!A.lIllllIIllIllIl(string) || A.lIllllIIllIlllI(string.equals(lIlIlIIIIIIIl[lIlIlIIIIIIlI[0]]) ? 1 : 0)) {
            return lIlIlIIIIIIlI[0];
        }
        int var2 = CombatOptions.getSpecialAttackEnergy();
        if (!A.lIllllIIllIllll(var2, var1.U()) || !A.lIllllIIlllIIII(var1.u.y(), var1.t.specHp()) || A.lIllllIIlllIIIl(var1.u.y(), lIlIlIIIIIIlI[1])) {
            var1.V();
            return lIlIlIIIIIIlI[0];
        }
        int var3 = var1.T().get(EquipmentInventorySlot.WEAPON);
        int var4 = Arrays.stream(Static.getClient().getEnum(lIlIlIIIIIIlI[2]).getKeys()).anyMatch(n3 -> {
            boolean bl;
            if (A.lIllllIIlllIIll(n3, var3)) {
                bl = lIlIlIIIIIIlI[3];

                if ((19 + 56 - -59 + 11 ^ 85 + 94 - 155 + 124) == 0) {
                    return ((0x4F ^ 6 ^ (0x2F ^ 0x6D)) & (31 + 174 - 58 + 58 ^ 159 + 105 - 108 + 42 ^ -1)) != 0;
                }
            } else {
                bl = lIlIlIIIIIIlI[0];
            }
            return bl;
        }) ? 1 : 0;
        if (A.lIllllIIlllIIlI(var4)) {
            Log.warn((String)lIlIlIIIIIIIl[lIlIlIIIIIIlI[3]]);
            return lIlIlIIIIIIlI[0];
        }
        if (A.lIllllIIlllIIlI(var1.T().isEquipped() ? 1 : 0)) {
            var1.T().swap();
        }
        if (A.lIllllIIllIlllI(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            return lIlIlIIIIIIlI[0];
        }
        Combat.toggleSpec();
        return lIlIlIIIIIIlI[3];
    }

    private static boolean lIllllIIllIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllllIIlllIIlI(int n2) {
        return n2 == 0;
    }

    private EquipmentSetup T() {
        return (EquipmentSetup)this.t.specGear().selected(EquipmentSetup.class);
    }

    private static boolean lIllllIIlllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    protected HandlingSpecAndGearTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

    private static boolean lIllllIIlllIIll(int n2, int n3) {
        return n2 == n3;
    }

    private void V() {
        BankLoadout bankLoadout = (BankLoadout)this.t.bankLoadout().selected(BankLoadout.class);
        EquipmentSetup equipmentSetup = bankLoadout.getEquipmentSetup();
        if (A.lIllllIIlllIIlI(equipmentSetup.isEquipped() ? 1 : 0)) {
            equipmentSetup.swap();
        }
    }

    private int U() {
        int n2 = this.T().get(EquipmentInventorySlot.WEAPON);
        int n3 = Static.getClient().getEnum(lIlIlIIIIIIlI[2]).getIntValue(n2);
        return n3 / lIlIlIIIIIIlI[4];
    }

    private static boolean lIllllIIlllIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

