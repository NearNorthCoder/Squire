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
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Shamans", priority=10000, blocking=true)
public class ShamansTask
extends CoxTaskBase {
    
    private  n ak;
    private  n al;
    
    private  int am;

    static {
        aD.llIllllIIIIIlI();
        aD.llIllllIIIIIIl();
    }

    private static boolean llIllllIIIIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aD var1;
        if (aD.llIllllIIIIllI(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aD.llIllllIIIIlll(Movement.getDestination()) && aD.llIllllIIIIllI(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIlIlIlIIl[2];
            }
            Movement.setDestination((WorldPoint)var1.al.bs);
            return lIlIlIlIlIIl[1];
        }
        TileObject var2 = var1.cR();
        if (aD.llIllllIIIIlII(var2)) {
            Movement.setDestination((WorldPoint)var1.ak.bq.dx(lIlIlIlIlIIl[4]).dy(lIlIlIlIlIIl[4]));
            return lIlIlIlIlIIl[1];
        }
        if (!aD.llIllllIIIlIII(var1.bS.isMoving() ? 1 : 0) || aD.llIllllIIIIllI(var1.bS.isAnimating() ? 1 : 0)) {
            return lIlIlIlIlIIl[2];
        }
        var1_1.interact(lIlIlIlIlIII[lIlIlIlIlIIl[2]]);
        return lIlIlIlIlIIl[1];
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aD.llIllllIIIIllI(tileObject.getName().equals(lIlIlIlIlIII[lIlIlIlIlIIl[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIlIlIIl[1]];
                stringArray[aD.lIlIlIlIlIIl[2]] = lIlIlIlIlIII[lIlIlIlIlIIl[5]];
                if (aD.llIllllIIIIllI(tileObject.hasAction(stringArray) ? 1 : 0) && aD.llIllllIIIIllI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIlIlIlIIl[1];

                    if (((0x5A ^ 8) & ~(0xDF ^ 0x8D)) == ((0x55 ^ 0x77) & ~(0x40 ^ 0x62))) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIlIlIlIIl[2];
            return n2 != 0;
        });
    }

    @Inject
    protected ShamansTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIlIlIlIIl[0];
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

        return String.valueOf(var3);
    }

    private static boolean llIllllIIIIlll(Object object) {
        return object != null;
    }

    private static boolean llIllllIIIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIllllIIIlIII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean cg() {
        return lIlIlIlIlIIl[1];
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (aD.llIllllIIIIIll((Object)this.ak.bw, (Object)N.SHAMANS)) {
            bl2 = lIlIlIlIlIIl[1];

            }
        } else {
            bl2 = lIlIlIlIlIIl[2];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        aD var4;
        void var5;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aD.llIllllIIIIllI(nPC.getName().contains(lIlIlIlIlIII[lIlIlIlIlIIl[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIlIlIIl[1]];
                stringArray[aD.lIlIlIlIlIIl[2]] = lIlIlIlIlIII[lIlIlIlIlIIl[7]];
                if (aD.llIllllIIIIllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIlIlIIl[1];

                    if (2 > 1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIlIlIlIIl[2];
            return n2 != 0;
        });
        if (aD.llIllllIIIIlII(nPC2)) {
            return null;
        }
        if (aD.llIllllIIIIlIl(var5.getWorldLocation().distanceTo((Locatable)var4.bS), lIlIlIlIlIIl[3])) {
            return null;
        }
        return Prayers.getOffensive();
    }

    private static void llIllllIIIIIIl() {
        lIlIlIlIlIII = new String[lIlIlIlIlIIl[3]];
        aD.lIlIlIlIlIII[aD.lIlIlIlIlIIl[2]] = "Enter";
        aD.lIlIlIlIlIII[aD.lIlIlIlIlIIl[1]] = "Passage";
        aD.lIlIlIlIlIII[aD.lIlIlIlIlIIl[5]] = "Enter";
        aD.lIlIlIlIlIII[aD.lIlIlIlIlIIl[6]] = "Guardian";
        aD.lIlIlIlIlIII[aD.lIlIlIlIlIIl[7]] = "Attack";
    }

    private static boolean llIllllIIIIlII(Object object) {
        return object == null;
    }

    private static boolean llIllllIIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

}

