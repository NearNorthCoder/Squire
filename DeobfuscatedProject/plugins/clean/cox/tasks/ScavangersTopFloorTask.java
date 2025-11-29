/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.CoxTaskBase;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Scavangers (Top Floor)", priority=10000, blocking=true)
public class ScavangersTopFloorTask
extends CoxTaskBase {

    private  n ak;
    private  n al;
    private  int am;

    private static void llIlIIllIIIlIl() {
        lIIllllllllI = new String[lIIlllllllll[3]];
        aW.lIIllllllllI[aW.lIIlllllllll[2]] = "Walking to end";
        aW.lIIllllllllI[aW.lIIlllllllll[1]] = "Walking to end";
        aW.lIIllllllllI[aW.lIIlllllllll[4]] = "Scavenger beast";
    }

    private static boolean llIlIIllIIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var1;
        aW var2;
        String[] stringArray = new String[lIIlllllllll[1]];
        stringArray[aW.lIIlllllllll[2]] = lIIllllllllI[lIIlllllllll[4]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aW.llIlIIllIIlIll(nPC)) {
            return null;
        }
        if (aW.llIlIIllIIllII(var2.bS.distanceTo((Locatable)var1), lIIlllllllll[5])) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIlIIllIIlIll(Object object) {
        return object == null;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aW var3;
        if (aW.llIlIIllIIlIIl(this.bS.getPlane(), lIIlllllllll[3])) {
            return lIIlllllllll[2];
        }
        var3.ak = var3.co.L();
        var3.am = var3.co.N();
        var3.al = var3.co.M();
        if (aW.llIlIIllIIlIlI((Object)var3.ak.bw, (Object)N.SCAVENGERS)) {
            bl2 = lIIlllllllll[1];

            if (3 != 3) {
                return false;
            }
        } else {
            bl2 = lIIlllllllll[2];
        }
        return bl2;
    }

    @Override
    public boolean cg() {
        aW var4;
        if (aW.llIlIIllIIIlll(this.e(this.ak) ? 1 : 0)) {
            return lIIlllllllll[1];
        }
        if (aW.llIlIIllIIlIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlllllllll[2];
        }
        if (aW.llIlIIllIIIlll(Reachable.isWalkable((WorldPoint)var4.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var4.al.bs);
            System.out.println(lIIllllllllI[lIIlllllllll[2]]);
            return lIIlllllllll[1];
        }
        if (aW.llIlIIllIIIlll(Reachable.isWalkable((WorldPoint)var4.ak.bs) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var4.ak.bt);
            System.out.println(lIIllllllllI[lIIlllllllll[1]]);
            return lIIlllllllll[1];
        }
        return lIIlllllllll[2];
    }

    private static boolean llIlIIllIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIIllIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIIllIIIlll(int n2) {
        return n2 != 0;
    }

    static {
        aW.llIlIIllIIIllI();
        aW.llIlIIllIIIlIl();
    }

    private static boolean llIlIIllIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected ScavangersTopFloorTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIIlllllllll[0];
    }
}

