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

import gg.squire.cox.tasks.CoxTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
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
extends CoxTaskBase {

    private  boolean dZ;

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aO.llIllIIIlIllII(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);

        arrayList.addAll(list);

        return arrayList;
    }

    private static void llIllIIIlIIllI() {
        lIlIIlIIlIlI = new String[lIlIIlIIlIll[7]];
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[0]] = "LEFT";
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[3]] = "MIDDLE";
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[4]] = "LEFT";
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[2]] = "MIDDLE";
        aO.lIlIIlIIlIlI[aO.lIlIIlIIlIll[1]] = "RIGHT";
    }

    /*
     * WARNING - void declaration
     */
    private boolean dp() {
        aO var1;
        void var2;
        List<WorldPoint> var3;
        ArrayList arrayList = new ArrayList();
        int n2 = this.ed.aA();
        if (aO.llIllIIIlIlIlI(n2, lIlIIlIIlIll[1])) {
            var3 = this.dH();
        }
        if (aO.llIllIIIlIlIlI((int)var2, lIlIIlIIlIll[4])) {
            Movement.setDestination((WorldPoint)var1.dJ());
            return lIlIIlIIlIll[3];
        }
        if (aO.llIllIIIlIlIlI((int)var2, lIlIIlIIlIll[3])) {
            if (!aO.llIllIIIlIlIll(var1.ed.az(), lIlIIlIIlIll[2]) || aO.llIllIIIlIlIlI(var1.ed.az(), lIlIIlIIlIll[4])) {
                Movement.setDestination((WorldPoint)var1.dK());
                return lIlIIlIIlIll[3];
            }
            Movement.setDestination((WorldPoint)var1.dJ());
            return lIlIIlIIlIll[3];
        }
        if (aO.llIllIIIlIlIlI((int)var2, lIlIIlIIlIll[2])) {
            if (aO.llIllIIIlIlIIl(var1.ed.am().equals(lIlIIlIIlIlI[lIlIIlIIlIll[2]]) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var1.dJ());
                return lIlIIlIIlIll[3];
            }
            var3 = var1.dQ().toWorldPointList();
        }
        String var4 = var1.k(lIlIIlIIlIll[3]);
        if (aO.llIllIIIlIlIIl(var1.dI() ? 1 : 0) && aO.llIllIIIlIlIIl(var4.equals(lIlIIlIIlIlI[lIlIIlIIlIll[1]]) ? 1 : 0)) {
            return var1.dt();
        }
        if (aO.llIllIIIlIlIII(var3.size())) {
            var3 = var1.dH();
        }
        if (aO.llIllIIIlIlIII(var3.contains(var1.bS.getWorldLocation()) ? 1 : 0)) {
            WorldPoint var5 = var3.stream().filter(Reachable::isWalkable).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            Movement.setDestination((WorldPoint)var5);
            return lIlIIlIIlIll[3];
        }
        return lIlIIlIIlIll[3];
    }

    private static boolean llIllIIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIIlIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIIlIlIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIllIIIlIlIIl(int n2) {
        return n2 != 0;
    }

    static {
        aO.llIllIIIlIIlll();
        aO.llIllIIIlIIllI();
    }

    private static boolean llIllIIIlIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    public void db() {
        if (aO.llIllIIIlIlIIl(this.cj().isFullyEquipped() ? 1 : 0) && aO.llIllIIIlIllIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            int[] nArray = new int[lIlIIlIIlIll[4]];
            nArray[aO.lIlIIlIIlIll[0]] = lIlIIlIIlIll[5];
            nArray[aO.lIlIIlIIlIll[3]] = lIlIIlIIlIll[6];
            if (aO.llIllIIIlIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
            }
        }
    }

    @Override
    public EquipmentSetup cj() {
        return this.ea.Q();
    }

    private static boolean llIllIIIlIllIl(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    protected OlmMeleeHandTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dZ = lIlIIlIIlIll[0];
    }

    private static boolean llIllIIIlIllII(Object object) {
        return object == null;
    }

    @Override
    public boolean cg() {
        aO var6;
        if (aO.llIllIIIlIlIII(this.ct() ? 1 : 0)) {
            return lIlIIlIIlIll[0];
        }
        if (aO.llIllIIIlIlIIl(var6.du() ? 1 : 0)) {
            return lIlIIlIIlIll[0];
        }
        if (aO.llIllIIIlIlIII(var6.ds() ? 1 : 0)) {
            return lIlIIlIIlIll[0];
        }
        var6.cm();
        var6.db();
        if (aO.llIllIIIlIlIII(var6.ed.aG())) {
            var6.dt();

            return lIlIIlIIlIll[0];
        }
        String var7 = var6.ed.am();
        if (aO.llIllIIIlIlIlI(var6.ed.az(), lIlIIlIIlIll[1])) {
            return var6.dt();
        }
        if (aO.llIllIIIlIlIlI(var6.ed.aA(), lIlIIlIIlIll[2])) {
            int n2;
            if (!aO.llIllIIIlIlIII(var7.equals(lIlIIlIIlIlI[lIlIIlIIlIll[0]]) ? 1 : 0) || aO.llIllIIIlIlIIl(var7.equals(lIlIIlIIlIlI[lIlIIlIIlIll[3]]) ? 1 : 0)) {
                n2 = lIlIIlIIlIll[3];

                }
            } else {
                var6.dZ = lIlIIlIIlIll[0];
                n2 = var6.dZ ? 1 : 0;
            }
        }
        if (aO.llIllIIIlIlIIl(var6.dZ ? 1 : 0)) {
            return var6.dp();
        }
        if (aO.llIllIIIlIlIIl(var7.equals(lIlIIlIIlIlI[lIlIIlIIlIll[4]]) ? 1 : 0) && aO.llIllIIIlIlIII(var6.bS.getWorldLocation().equals((Object)var6.dJ()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var6.dJ());
            return lIlIIlIIlIll[3];
        }
        if (aO.llIllIIIlIlIII(var6.bS.getWorldLocation().equals((Object)var6.dJ()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var6.dL());
            return lIlIIlIIlIll[3];
        }
        return lIlIIlIIlIll[0];
    }

        return String.valueOf(var8);
    }
}

