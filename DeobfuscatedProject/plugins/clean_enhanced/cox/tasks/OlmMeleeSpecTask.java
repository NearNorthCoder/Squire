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

import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.api.combat.CombatOptions;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
extends CoxManager {

    @Inject
    protected OlmMeleeSpecTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    /*
     * WARNING - void declaration
     */
    private boolean dp() {
        aQ var3;
        void var4;
        List<WorldPoint> var5;
        ArrayList arrayList = new ArrayList();
        int n2 = this.ed.aA();
        if (n2 == 5) {
            var5 = this.dH();
        }
        if (((int)var4 == 6)) {
            Movement.setDestination((WorldPoint)var3.dJ());
            return 4;
        }
        if (((int)var4 == 4)) {
            if ((var3.ed.az() == 7)) {
                Movement.setDestination((WorldPoint)var3.dK());
                return 4;
            }
            Movement.setDestination((WorldPoint)var3.dJ());
            return 4;
        }
        if (((int)var4 == 7)) {
            var5 = var3.dQ().toWorldPointList();
        }
        String var6 = var3.k(4);
        if ((var3.dI( != 0) ? 1 : 0) && (var6.equals(var1[4] != 0) ? 1 : 0)) {
            return var3.dt();
        }
        if ((var5.size( == 0))) {
            var5 = var3.dH();
        }
        if ((var5.contains(var3.bS.getWorldLocation( == 0)) ? 1 : 0)) {
            WorldPoint var7 = var5.stream().filter(Reachable::isWalkable).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            Movement.setDestination((WorldPoint)var7);
            return 4;
        }
        return 4;
    }

    private static String var8(String var9, String var10) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var13 = 0;
        char[] var14 = var9.toCharArray();
        int var15 = var14.length;
        int var16 = 0;
        while (var16 < var15) {
            char var17 = var14[var16];
            var11.append((char)(var17 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var16;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if prayer == null {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    @Override
    public boolean cg() {
        aQ var24;
        if ((this.ds( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var24.ed.aG() < 1) && (var24.ed.aG() != 2)) {
            return 0;
        }
        Item var25 = s.aY();
        if var25 == null {
            return 0;
        }
        EquipmentSetup var26 = var24.ea.R();
        int var27 = var26.get(EquipmentInventorySlot.WEAPON);
        int var28 = Arrays.stream(Static.getClient().getEnum(3).getKeys()).anyMatch(n3 -> {
            boolean bl2;
            if (var27 == var27) {
                bl2 = 4;
                0;
                if ((0xA8 ^ 0xAC) != (0x22 ^ 0x26)) {
                    return ((5 ^ 0x67) & ~(0x1A ^ 0x78)) != 0;
                }
            } else {
                bl2 = 0;
            }
            return bl2;
        }) ? 1 : 0;
        if (var28 == 0) {
            Log.warn((String)var1[0]);
            return 0;
        }
        if ((var24.ct( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var24.dv( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var26.isEquipped( == 0) ? 1 : 0)) {
            var26.swap();
        }
        if ((CombatOptions.isSpecialAttackActivated( == 0) ? 1 : 0)) {
            Combat.toggleSpec();
        }
        if ((var24.dT( == 0).contains((Locatable)var24.bS) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var24.dL());
            return 4;
        }
        this.dt();
        0;
        return 4;
    }

    @Override
    public EquipmentSetup cj() {
        return this.ea.R();
    }
}

