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
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Olm Melee Spec", priority=20001, blocking=true)
public class OlmMeleeSpecTask
extends CoxTaskBase {

    @Inject
    protected OlmMeleeSpecTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIlIlIlllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIlllllll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean dp() {
        aQ var1;
        void var2;
        List<WorldPoint> var3;
        ArrayList arrayList = new ArrayList();
        int n2 = this.ed.aA();
        if (aQ.llIlIlIlllllll(n2, lIlIIIlIIllI[5])) {
            var3 = this.dH();
        }
        if (aQ.llIlIlIlllllll((int)var2, lIlIIIlIIllI[6])) {
            Movement.setDestination((WorldPoint)var1.dJ());
            return lIlIIIlIIllI[4];
        }
        if (aQ.llIlIlIlllllll((int)var2, lIlIIIlIIllI[4])) {
            if (aQ.llIlIlIlllllll(var1.ed.az(), lIlIIIlIIllI[7])) {
                Movement.setDestination((WorldPoint)var1.dK());
                return lIlIIIlIIllI[4];
            }
            Movement.setDestination((WorldPoint)var1.dJ());
            return lIlIIIlIIllI[4];
        }
        if (aQ.llIlIlIlllllll((int)var2, lIlIIIlIIllI[7])) {
            var3 = var1.dQ().toWorldPointList();
        }
        String var4 = var1.k(lIlIIIlIIllI[4]);
        if (aQ.llIlIllIIIIIII(var1.dI() ? 1 : 0) && aQ.llIlIllIIIIIII(var4.equals(lIlIIIlIIlIl[lIlIIIlIIllI[4]]) ? 1 : 0)) {
            return var1.dt();
        }
        if (aQ.llIlIlIllllIll(var3.size())) {
            var3 = var1.dH();
        }
        if (aQ.llIlIlIllllIll(var3.contains(var1.bS.getWorldLocation()) ? 1 : 0)) {
            WorldPoint var5 = var3.stream().filter(Reachable::isWalkable).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            Movement.setDestination((WorldPoint)var5);
            return lIlIIIlIIllI[4];
        }
        return lIlIIIlIIllI[4];
    }

    private static boolean llIlIllIIIIIII(int n2) {
        return n2 != 0;
    }

    private static void llIlIlIllllIIl() {
        lIlIIIlIIlIl = new String[lIlIIIlIIllI[6]];
        aQ.lIlIIIlIIlIl[aQ.lIlIIIlIIllI[0]] = "You setup your spec weapon setup with a weapon that has no spec!!!";
        aQ.lIlIIIlIIlIl[aQ.lIlIIIlIIllI[4]] = "RIGHT";
    }

    static {
        aQ.llIlIlIllllIlI();
        aQ.llIlIlIllllIIl();
    }

        return String.valueOf(var6);
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aQ.llIlIlIllllllI(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);

        arrayList.addAll(list);

        return arrayList;
    }

    private static boolean llIlIlIllllIll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean cg() {
        aQ var7;
        if (aQ.llIlIlIllllIll(this.ds() ? 1 : 0)) {
            return lIlIIIlIIllI[0];
        }
        if (aQ.llIlIlIlllllII(var7.ed.aG(), lIlIIIlIIllI[1]) && aQ.llIlIlIlllllIl(var7.ed.aG(), lIlIIIlIIllI[2])) {
            return lIlIIIlIIllI[0];
        }
        Item var8 = s.aY();
        if (aQ.llIlIlIllllllI(var8)) {
            return lIlIIIlIIllI[0];
        }
        EquipmentSetup var9 = var7.ea.R();
        int var10 = var9.get(EquipmentInventorySlot.WEAPON);
        int var11 = Arrays.stream(Static.getClient().getEnum(lIlIIIlIIllI[3]).getKeys()).anyMatch(n3 -> {
            boolean bl2;
            if (aQ.llIlIlIlllllll(n3, var10)) {
                bl2 = lIlIIIlIIllI[4];

                if ((0xA8 ^ 0xAC) != (0x22 ^ 0x26)) {
                    return false;
                }
            } else {
                bl2 = lIlIIIlIIllI[0];
            }
            return bl2;
        }) ? 1 : 0;
        if (aQ.llIlIlIllllIll(var11)) {
            Log.warn((String)lIlIIIlIIlIl[lIlIIIlIIllI[0]]);
            return lIlIIIlIIllI[0];
        }
        if (aQ.llIlIlIllllIll(var7.ct() ? 1 : 0)) {
            return lIlIIIlIIllI[0];
        }
        if (aQ.llIlIlIllllIll(var7.dv() ? 1 : 0)) {
            return lIlIIIlIIllI[0];
        }
        if (aQ.llIlIlIllllIll(var9.isEquipped() ? 1 : 0)) {
            var9.swap();
        }
        if (aQ.llIlIlIllllIll(CombatOptions.isSpecialAttackActivated() ? 1 : 0)) {
            Combat.toggleSpec();
        }
        if (aQ.llIlIlIllllIll(var7.dT().contains((Locatable)var7.bS) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var7.dL());
            return lIlIIIlIIllI[4];
        }
        this.dt();

        return lIlIIIlIIllI[4];
    }

    private static boolean llIlIlIllllllI(Object object) {
        return object == null;
    }

    private static boolean llIlIlIlllllIl(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public EquipmentSetup cj() {
        return this.ea.R();
    }
}

