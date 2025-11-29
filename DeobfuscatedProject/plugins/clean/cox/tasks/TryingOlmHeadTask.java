/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.cox.tasks.CoxManager;
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
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Trying Olm HEAD", priority=21000, blocking=true)
public class TryingOlmHeadTask
extends CoxTaskBase {

    static {
        aL.lllIIIIIllIIll();
        aL.lllIIIIIllIIlI();
    }

    @Override
    public EquipmentSetup cj() {
        return s.bc();
    }

    private  boolean e(List list, WorldPoint worldPoint) {
        int n2;
        if (aL.lllIIIIIllIlIl(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aL.lllIIIIIllIlII(this.ed.ap().contains(worldPoint) ? 1 : 0) && aL.lllIIIIIllIlII(list.contains(worldPoint) ? 1 : 0)) {
            n2 = lIlIllIllIII[0];

            if (-1 != -1) {
                return false;
            }
        } else {
            n2 = lIlIllIllIII[1];
        }
        return n2 != 0;
    }

    private static boolean lllIIIIIllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIIIIIllIlII(int n2) {
        return n2 == 0;
    }

    private  boolean f(List list, WorldPoint worldPoint) {
        int n2;
        if (aL.lllIIIIIllIlIl(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aL.lllIIIIIllIlII(this.ed.ap().contains(worldPoint) ? 1 : 0) && aL.lllIIIIIllIlII(list.contains(worldPoint) ? 1 : 0)) {
            n2 = lIlIllIllIII[0];

            if (1 < 0) {
                return false;
            }
        } else {
            n2 = lIlIllIllIII[1];
        }
        return n2 != 0;
    }

    private static boolean lllIIIIIlllIII(Object object) {
        return object != null;
    }

    private static boolean lllIIIIIllIllI(Object object) {
        return object == null;
    }

    @Override
    public boolean cg() {
        GraphicsObject var1;
        Object var2;
        aL var3;
        if (aL.lllIIIIIllIlII(this.ct() ? 1 : 0)) {
            if (aL.lllIIIIIllIlIl(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIlIllIllIII[0];
            }
            return lIlIllIllIII[1];
        }
        if (aL.lllIIIIIllIlII(var3.ed.at() ? 1 : 0)) {
            return lIlIllIllIII[1];
        }
        if (!aL.lllIIIIIllIlII(var3.ds() ? 1 : 0) || aL.lllIIIIIllIlIl(var3.du() ? 1 : 0)) {
            return lIlIllIllIII[1];
        }
        var3.cm();
        NPC var4 = NPCs.getNearest(nPC -> {
            int n2;
            if (aL.lllIIIIIllIlIl(nPC.getName().equals(lIlIllIlIlll[lIlIllIllIII[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIllIII[0]];
                stringArray[aL.lIlIllIllIII[1]] = lIlIllIlIlll[lIlIllIllIII[4]];
                if (aL.lllIIIIIllIlIl(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIllIllIII[0];

                    if (-2 < 0) return n2 != 0;
                    return ((0x1A ^ 0x33 ^ (0xEB ^ 0x8E)) & (106 + 173 - 111 + 61 ^ 91 + 164 - 99 + 13 ^ -1)) != 0;
                }
            }
            n2 = lIlIllIllIII[1];
            return n2 != 0;
        });
        if (aL.lllIIIIIllIllI(var4)) {
            return lIlIllIllIII[1];
        }
        List<WorldPoint> var5 = var3.dH();
        System.out.println("Turn: " + var3.dI() + " | " + var3.ed.az() + " | direction: " + var3.ed.am());
        if (aL.lllIIIIIllIlIl(var3.dI() ? 1 : 0) && (!aL.lllIIIIIllIlII(((String)(var2 = var3.k(lIlIllIllIII[1]))).equals(lIlIllIlIlll[lIlIllIllIII[1]]) ? 1 : 0) || aL.lllIIIIIllIlIl(((String)var2).equals(lIlIllIlIlll[lIlIllIllIII[0]]) ? 1 : 0))) {
            var5 = var3.m((String)var2);
        }
        var2 = new ArrayList();
        Iterator var6 = var3.ec.getGraphicsObjects().iterator();
        while (aL.lllIIIIIllIlIl(var6.hasNext() ? 1 : 0)) {
            var1 = (GraphicsObject)var6.next();
            if (aL.lllIIIIIllIlll(var1.getId(), lIlIllIllIII[2])) {
                WorldPoint var7 = WorldPoint.fromLocal((Client)var3.ec, (LocalPoint)var1.getLocation());
                List var8 = var7.createWorldArea(lIlIllIllIII[0]).toWorldPointList();
                var2.addAll(var8);

            }

            if ((0x31 ^ 0x35) != 0) continue;
            return false;
        }
        if (aL.lllIIIIIllIlII(var5.contains(var3.bS.getWorldLocation()) ? 1 : 0)) {
            var6 = var5.stream().filter(arg_0 -> var3.f((List)var2, arg_0)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
            if (aL.lllIIIIIlllIII(Movement.getDestination()) && aL.lllIIIIIllIlIl(Movement.getDestination().equals((Object)var6) ? 1 : 0)) {
                var1 = var3.bS.getWorldLocation().createWorldArea(lIlIllIllIII[3]).toWorldPointList().stream().filter(arg_0 -> var3.e((List)var2, arg_0)).min(Comparator.comparingDouble(arg_0 -> aL.c((WorldPoint)var6, arg_0)).thenComparingDouble(object -> var4.getWorldArea().distanceTo((WorldPoint)object))).orElse(null);
                if (!aL.lllIIIIIlllIII(var1) || aL.lllIIIIIllIlll(var1.getWorldX(), var6.getWorldX())) {
                    return lIlIllIllIII[1];
                }
                Movement.setDestination((WorldPoint)var1);
                return lIlIllIllIII[0];
            }
            Movement.setDestination((WorldPoint)var6);
            return lIlIllIllIII[0];
        }
        this.dr();

        return lIlIllIllIII[0];
    }

    private static  double c(WorldPoint worldPoint, Object object) {
        return ((WorldPoint)object).distanceTo2DHypotenuse(worldPoint);
    }

    private static void lllIIIIIllIIlI() {
        lIlIllIlIlll = new String[lIlIllIllIII[5]];
        aL.lIlIllIlIlll[aL.lIlIllIllIII[1]] = "RIGHT";
        aL.lIlIllIlIlll[aL.lIlIllIllIII[0]] = "LEFT";
        aL.lIlIllIlIlll[aL.lIlIllIllIII[3]] = "Great Olm";
        aL.lIlIllIlIlll[aL.lIlIllIllIII[4]] = "Attack";
    }

    private static boolean lllIIIIIllIlIl(int n2) {
        return n2 != 0;
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aL.lllIIIIIllIllI(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);

        arrayList.addAll(list);

        return arrayList;
    }

    @Inject
    protected TryingOlmHeadTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

}

