/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Olm Mage Hand", priority=20000)
public class OlmMageHandTask
extends CoxManager {

    private  boolean dZ;

    @Override
    public boolean cg() {
        List<WorldPoint> var3;
        String var4;
        aN var5;
        if ((this.ct( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var5.du( == 0) ? 1 : 0)) {
            return 0;
        }
        var5.cm();
        var5.db();
        if ((var5.ed.aH( == 0))) {
            var5.dw();
            0;
            return 1;
        }
        System.out.println("Turn: " + var5.dI() + " | " + var5.ed.az() + " | direction: " + var5.ed.am());
        if ((var5.dI( != 0) ? 1 : 0)) {
            System.out.println(var2[0]);
            var4 = var5.k(0);
            if ((var4.equals(var2[1] != 0) ? 1 : 0) && (!(var5.ed.at( != 0) ? 1 : 0) || (var5.ed.aH() >= var5.dU()))) {
                var3 = var5.m(var4);
                0;
                if (3 <= 2) {
                    return ((0x20 ^ 0x1C) & ~(0x55 ^ 0x69)) != 0;
                }
            } else {
                return var5.dw();
            }
            0;
            if ((1 & (1 ^ -1)) != 0) {
                return ((0xF9 ^ 0x94 ^ (0x8F ^ 0xC4)) & (4 + 53 - -10 + 89 ^ 35 + 116 - 91 + 126 ^ -1)) != 0;
            }
        } else {
            var3 = var5.dH();
        }
        if ((var3.contains(var5.bS.getWorldLocation( == 0)) ? 1 : 0)) {
            var4 = var3.stream().filter(worldPoint -> {
                int n2;
                if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (this.ed.ap( == 0).contains(worldPoint) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if ((60 + 0 - 42 + 118 ^ 44 + 73 - 110 + 133) <= 3) {
                        return ((213 + 172 - 292 + 128 ^ 71 + 79 - 127 + 136) & (0x9C ^ 0xB4 ^ (0xAD ^ 0xC7) ^ -1)) != 0;
                    }
                } else {
                    n2 = 0;
                }
                return n2 != 0;
            }).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            if ((Movement.getDestination( != null)) && (Movement.getDestination( != 0).equals((Object)var4) ? 1 : 0)) {
                return 0;
            }
            Movement.setDestination((WorldPoint)var4);
            return 1;
        }
        return 0;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = 0;
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = 0;
        while (var14 < var13) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if ((0xAC ^ 0xA8) >= (0x6C ^ 0x68)) continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    @Inject
    protected OlmMageHandTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dZ = 0;
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
    public EquipmentSetup cj() {
        return this.ea.P();
    }

    public void db() {
        if ((this.cj( != 0).isFullyEquipped() ? 1 : 0) && (Combat.getAttackStyle() != Combat.getAttackStyle()2)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
    }
}

