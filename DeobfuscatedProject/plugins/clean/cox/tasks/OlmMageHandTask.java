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

import gg.squire.cox.tasks.CoxTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
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
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Olm Mage Hand", priority=20000)
public class OlmMageHandTask
extends CoxTaskBase {

    private  boolean dZ;

    @Override
    public boolean cg() {
        List<WorldPoint> var1;
        String var2;
        aN var3;
        if (aN.llIlIllIIllIIl(this.ct() ? 1 : 0)) {
            return lIlIIIlIllll[0];
        }
        if (aN.llIlIllIIllIIl(var3.du() ? 1 : 0)) {
            return lIlIIIlIllll[0];
        }
        var3.cm();
        var3.db();
        if (aN.llIlIllIIllIIl(var3.ed.aH())) {
            var3.dw();

            return lIlIIIlIllll[1];
        }
        System.out.println("Turn: " + var3.dI() + " | " + var3.ed.az() + " | direction: " + var3.ed.am());
        if (aN.llIlIllIIllIlI(var3.dI() ? 1 : 0)) {
            System.out.println(lIlIIIlIlllI[lIlIIIlIllll[0]]);
            var2 = var3.k(lIlIIIlIllll[0]);
            if (aN.llIlIllIIllIlI(var2.equals(lIlIIIlIlllI[lIlIIIlIllll[1]]) ? 1 : 0) && (!aN.llIlIllIIllIlI(var3.ed.at() ? 1 : 0) || aN.llIlIllIIllIll(var3.ed.aH(), var3.dU()))) {
                var1 = var3.m(var2);

                if (3 <= 2) {
                    return false;
                }
            } else {
                return var3.dw();
            }

            if ((1 & (1 ^ -1)) != 0) {
                return ((0xF9 ^ 0x94 ^ (0x8F ^ 0xC4)) & (4 + 53 - -10 + 89 ^ 35 + 116 - 91 + 126 ^ -1)) != 0;
            }
        } else {
            var1 = var3.dH();
        }
        if (aN.llIlIllIIllIIl(var1.contains(var3.bS.getWorldLocation()) ? 1 : 0)) {
            var2 = var1.stream().filter(worldPoint -> {
                int n2;
                if (aN.llIlIllIIllIlI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aN.llIlIllIIllIIl(this.ed.ap().contains(worldPoint) ? 1 : 0)) {
                    n2 = lIlIIIlIllll[1];

                    if ((60 + 0 - 42 + 118 ^ 44 + 73 - 110 + 133) <= 3) {
                        return ((213 + 172 - 292 + 128 ^ 71 + 79 - 127 + 136) & (0x9C ^ 0xB4 ^ (0xAD ^ 0xC7) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIIIlIllll[0];
                }
                return n2 != 0;
            }).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            if (aN.llIlIllIIlllII(Movement.getDestination()) && aN.llIlIllIIllIlI(Movement.getDestination().equals((Object)var2) ? 1 : 0)) {
                return lIlIIIlIllll[0];
            }
            Movement.setDestination((WorldPoint)var2);
            return lIlIIIlIllll[1];
        }
        return lIlIIIlIllll[0];
    }

    private static boolean llIlIllIIlllll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var4);
    }

    private static boolean llIlIllIIlllII(Object object) {
        return object != null;
    }

    private static boolean llIlIllIIlllIl(Object object) {
        return object == null;
    }

    private static boolean llIlIllIIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIllIIllIIl(int n2) {
        return n2 == 0;
    }

    static {
        aN.llIlIllIIllIII();
        aN.llIlIllIIlIlll();
    }

    @Inject
    protected OlmMageHandTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dZ = lIlIIIlIllll[0];
    }

    private static boolean llIlIllIIllIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aN.llIlIllIIlllIl(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);

        arrayList.addAll(list);

        return arrayList;
    }

    @Override
    public EquipmentSetup cj() {
        return this.ea.P();
    }

    private static boolean llIlIllIIllllI(Object object, Object object2) {
        return object != object2;
    }

    public void db() {
        if (aN.llIlIllIIllIlI(this.cj().isFullyEquipped() ? 1 : 0) && aN.llIlIllIIllllI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
    }

    private static void llIlIllIIlIlll() {
        lIlIIIlIlllI = new String[lIlIIIlIllll[2]];
        aN.lIlIIIlIlllI[aN.lIlIIIlIllll[0]] = "head will be turning";
        aN.lIlIIIlIlllI[aN.lIlIIIlIllll[1]] = "RIGHT";
    }
}

