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
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
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
import gg.squire.scurrius.tasks.ScurriusTaskBase;
import gg.squire.scurrius.tasks.BHelper;

@TaskDesc(name="Handling Spec and Gear", priority=100000)
public class HandlingSpecAndGearTask
extends ScurriusTaskBase {

    private static boolean lIlIllIlIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIlIIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIllIlIIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean a() {
        r var1;
        String string = this.b.specGear().getSelected();
        if (!r.lIlIllIlIIIIllI(string) || r.lIlIllIlIIIIlll(string.equals(lIIlIllIIllIl[lIIlIllIIllll[0]]) ? 1 : 0)) {
            return lIIlIllIIllll[0];
        }
        int var2 = CombatOptions.getSpecialAttackEnergy();
        if (!r.lIlIllIlIIIlIII(var2, var1.v()) || r.lIlIllIlIIIlIIl(var1.c.p(), lIIlIllIIllll[1])) {
            var1.w();
            return lIIlIllIIllll[0];
        }
        int var3 = var1.u().get(EquipmentInventorySlot.WEAPON);
        int var4 = Arrays.stream(Static.getClient().getEnum(lIIlIllIIllll[2]).getKeys()).anyMatch(n3 -> {
            boolean bl;
            if (r.lIlIllIlIIIlIll(n3, var3)) {
                bl = lIIlIllIIllll[3];

                if (3 == 0) {
                    return false;
                }
            } else {
                bl = lIIlIllIIllll[0];
            }
            return bl;
        }) ? 1 : 0;
        if (r.lIlIllIlIIIlIlI(var4)) {
            Log.warn((String)lIIlIllIIllIl[lIIlIllIIllll[3]]);
            return lIIlIllIIllll[0];
        }
        if (r.lIlIllIlIIIlIlI(var1.u().isEquipped() ? 1 : 0)) {
            var1.u().swap();
        }
        if (r.lIlIllIlIIIIlll(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            return lIIlIllIIllll[0];
        }
        Combat.toggleSpec();
        return lIIlIllIIllll[3];
    }

        return String.valueOf(var5);
    }

    private int v() {
        int n2 = this.u().get(EquipmentInventorySlot.WEAPON);
        int n3 = Static.getClient().getEnum(lIIlIllIIllll[2]).getIntValue(n2);
        return n3 / lIIlIllIIllll[4];
    }

    private EquipmentSetup u() {
        return (EquipmentSetup)this.b.specGear().selected(EquipmentSetup.class);
    }

    private void w() {
        BankLoadout bankLoadout = (BankLoadout)this.b.bankLoadout().selected(BankLoadout.class);
        EquipmentSetup equipmentSetup = bankLoadout.getEquipmentSetup();
        if (r.lIlIllIlIIIlIlI(equipmentSetup.isEquipped() ? 1 : 0)) {
            equipmentSetup.swap();
        }
    }

    @Inject
    protected HandlingSpecAndGearTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
    }

    private static boolean lIlIllIlIIIIlll(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIIlllllll() {
        lIIlIllIIllIl = new String[lIIlIllIIllll[5]];
        r.lIIlIllIIllIl[r.lIIlIllIIllll[0]] = "None";
        r.lIIlIllIIllIl[r.lIIlIllIIllll[3]] = "You setup your spec weapon setup with a weapon that has no spec!!!";
    }

    static {
        r.lIlIllIlIIIIlIl();
        r.lIlIllIIlllllll();
    }

    private static boolean lIlIllIlIIIIllI(Object object) {
        return object != null;
    }

    private static boolean lIlIllIlIIIlIlI(int n2) {
        return n2 == 0;
    }
}

