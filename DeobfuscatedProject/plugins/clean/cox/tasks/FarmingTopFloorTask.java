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

@TaskDesc(name="Farming (Top Floor)", priority=10000, blocking=true)
public class FarmingTopFloorTask
extends CoxTaskBase {
    private  n ak;
    private  n al;
    
    private  int am;

    @Inject
    protected FarmingTopFloorTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIlIIIIll[0];
    }

        return String.valueOf(var1);
    }

    private static void llIllIIIIIIIll() {
        lIlIIlIIIIlI = new String[lIlIIlIIIIll[3]];
        aU.lIlIIlIIIIlI[aU.lIlIIlIIIIll[2]] = "Walking to end";
        aU.lIlIIlIIIIlI[aU.lIlIIlIIIIll[1]] = "Walking to end";
        aU.lIlIIlIIIIlI[aU.lIlIIlIIIIll[4]] = "Scavenger beast";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var2;
        aU var3;
        String[] stringArray = new String[lIlIIlIIIIll[1]];
        stringArray[aU.lIlIIlIIIIll[2]] = lIlIIlIIIIlI[lIlIIlIIIIll[4]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aU.llIllIIIIIlIII(nPC)) {
            return null;
        }
        if (aU.llIllIIIIIlIIl(var3.bS.distanceTo((Locatable)var2), lIlIIlIIIIll[5])) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

    private static boolean llIllIIIIIIlIl(int n2) {
        return n2 != 0;
    }

    static {
        aU.llIllIIIIIIlII();
        aU.llIllIIIIIIIll();
    }

    private static boolean llIllIIIIIlIII(Object object) {
        return object == null;
    }

    @Override
    public boolean cg() {
        aU var4;
        if (aU.llIllIIIIIIlIl(this.e(this.ak) ? 1 : 0)) {
            return lIlIIlIIIIll[1];
        }
        if (aU.llIllIIIIIIlIl(Reachable.isWalkable((WorldPoint)var4.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var4.al.bs);
            System.out.println(lIlIIlIIIIlI[lIlIIlIIIIll[2]]);
            return lIlIIlIIIIll[1];
        }
        if (aU.llIllIIIIIIlIl(Reachable.isWalkable((WorldPoint)var4.ak.bs) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var4.ak.bt);
            System.out.println(lIlIIlIIIIlI[lIlIIlIIIIll[1]]);
            return lIlIIlIIIIll[1];
        }
        return lIlIIlIIIIll[2];
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllIIIIIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIllIIIIIIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIllIIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aU var5;
        if (aU.llIllIIIIIIllI(this.bS.getPlane(), lIlIIlIIIIll[3])) {
            return lIlIIlIIIIll[2];
        }
        var5.ak = var5.co.L();
        var5.am = var5.co.N();
        var5.al = var5.co.M();
        if (aU.llIllIIIIIIlll((Object)var5.ak.bw, (Object)N.FARMING)) {
            bl2 = lIlIIlIIIIll[1];

            }
        } else {
            bl2 = lIlIIlIIIIll[2];
        }
        return bl2;
    }
}

