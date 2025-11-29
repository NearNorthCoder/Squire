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
 *  net.unethicalite.api.items.Equipment
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
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Olm Melee Hand", priority=20000)
public class OlmMeleeHandTask
extends CoxManager {

    private  boolean dZ;

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

    /*
     * WARNING - void declaration
     */
    private boolean dp() {
        aO var3;
        void var4;
        List<WorldPoint> var5;
        ArrayList arrayList = new ArrayList();
        int n2 = this.ed.aA();
        if (n2 == 1) {
            var5 = this.dH();
        }
        if (((int)var4 == 4)) {
            Movement.setDestination((WorldPoint)var3.dJ());
            return 3;
        }
        if (((int)var4 == 3)) {
            if (!(var3.ed.az() != 2) || (var3.ed.az() == 4)) {
                Movement.setDestination((WorldPoint)var3.dK());
                return 3;
            }
            Movement.setDestination((WorldPoint)var3.dJ());
            return 3;
        }
        if (((int)var4 == 2)) {
            if ((var3.ed.am( != 0).equals(var2[2]) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var3.dJ());
                return 3;
            }
            var5 = var3.dQ().toWorldPointList();
        }
        String var6 = var3.k(3);
        if ((var3.dI( != 0) ? 1 : 0) && (var6.equals(var2[1] != 0) ? 1 : 0)) {
            return var3.dt();
        }
        if ((var5.size( == 0))) {
            var5 = var3.dH();
        }
        if ((var5.contains(var3.bS.getWorldLocation( == 0)) ? 1 : 0)) {
            WorldPoint var7 = var5.stream().filter(Reachable::isWalkable).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            Movement.setDestination((WorldPoint)var7);
            return 3;
        }
        return 3;
    }

    public void db() {
        if ((this.cj( != 0).isFullyEquipped() ? 1 : 0) && (Combat.getAttackStyle() != Combat.getAttackStyle()2)) {
            int[] nArray = new int[4];
            nArray[0] = 5;
            nArray[3] = 6;
            if ((Equipment.contains((int[] != 0)nArray) ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
            }
        }
    }

    @Override
    public EquipmentSetup cj() {
        return this.ea.Q();
    }

    @Inject
    protected OlmMeleeHandTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dZ = 0;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean cg() {
        aO var14;
        if ((this.ct( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var14.du( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var14.ds( == 0) ? 1 : 0)) {
            return 0;
        }
        var14.cm();
        var14.db();
        if ((var14.ed.aG( == 0))) {
            var14.dt();
            0;
            return 0;
        }
        String var15 = var14.ed.am();
        if ((var14.ed.az() == 1)) {
            return var14.dt();
        }
        if ((var14.ed.aA() == 2)) {
            int n2;
            if (!(var15.equals(var2[0] == 0) ? 1 : 0) || (var15.equals(var2[3] != 0) ? 1 : 0)) {
                n2 = 3;
                0;
                if null != null {
                    return ((0x43 ^ 0x20 ^ (0x19 ^ 0x2B)) & (21 + 219 - 161 + 144 ^ 122 + 52 - 113 + 81 ^ -1)) != 0;
                }
            } else {
                var14.dZ = 0;
                n2 = var14.dZ;
            }
        }
        if (var14.dZ != 0) {
            return var14.dp();
        }
        if ((var15.equals(var2[4] != 0) ? 1 : 0) && (var14.bS.getWorldLocation( == 0).equals((Object)var14.dJ()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var14.dJ());
            return 3;
        }
        if ((var14.bS.getWorldLocation( == 0).equals((Object)var14.dJ()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var14.dL());
            return 3;
        }
        return 0;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = 0;
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = 0;
        while (var24 < var23) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }
}

