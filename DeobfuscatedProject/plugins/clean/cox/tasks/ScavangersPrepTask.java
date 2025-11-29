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
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.CoxTaskBase;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import gg.squire.cox.tasks.CoxManager;
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
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Scavangers (Prep)", priority=10000, blocking=true)
public class ScavangersPrepTask
extends CoxTaskBase {
    private  n al;
    private  n ak;
    
    private  int am;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        aV var1;
        if (aV.llIllIIIllIlII(this.e(this.ak) ? 1 : 0)) {
            return lIlIIlIIllIl[1];
        }
        int[] nArray = new int[lIlIIlIIllIl[1]];
        nArray[aV.lIlIIlIIllIl[2]] = lIlIIlIIllIl[3];
        if (aV.llIllIIIllIlIl(Inventory.getCount((boolean)lIlIIlIIllIl[1], (int[])nArray), lIlIIlIIllIl[4])) {
            int[] nArray2 = new int[lIlIIlIIllIl[1]];
            nArray2[aV.lIlIIlIIllIl[2]] = lIlIIlIIllIl[5];
            if (aV.llIllIIIllIlIl(Inventory.getCount((boolean)lIlIIlIIllIl[1], (int[])nArray2), lIlIIlIIllIl[6])) {
                if (aV.llIllIIIllIlII(Reachable.isWalkable((WorldPoint)var1.ak.bt) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)var1.al.bs);
                    return lIlIIlIIllIl[1];
                }
                if (aV.llIllIIIllIlII(Reachable.isWalkable((WorldPoint)var1.ak.bs) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)var1.ak.bt);
                    System.out.println(lIlIIlIIllII[lIlIIlIIllIl[2]]);
                    return lIlIIlIIllIl[1];
                }
                return lIlIIlIIllIl[2];
            }
        }
        if (aV.llIllIIIllIlII(Inventory.isFull() ? 1 : 0)) {
            var1.co.x();

            return lIlIIlIIllIl[1];
        }
        TileItem var2 = TileItems.getNearest(tileItem -> {
            int n2;
            if (aV.llIllIIIllIlII(this.ak.a((Locatable)tileItem) ? 1 : 0) && (!aV.llIllIIIlllIIl(tileItem.getId(), lIlIIlIIllIl[3]) || aV.llIllIIIlllIll(tileItem.getId(), lIlIIlIIllIl[5]))) {
                n2 = lIlIIlIIllIl[1];

                }
            } else {
                n2 = lIlIIlIIllIl[2];
            }
            return n2 != 0;
        });
        if (aV.llIllIIIllIllI(var2)) {
            if (aV.llIllIIIllIlII(var1.bS.isMoving() ? 1 : 0)) {
                return lIlIIlIIllIl[2];
            }
            var2.interact(lIlIIlIIllII[lIlIIlIIllIl[1]]);
            return lIlIIlIIllIl[1];
        }
        String[] stringArray = new String[lIlIIlIIllIl[1]];
        stringArray[aV.lIlIIlIIllIl[2]] = lIlIIlIIllII[lIlIIlIIllIl[7]];
        NPC var3 = NPCs.getNearest((String[])stringArray);
        if (aV.llIllIIIllIlll(var3)) {
            WorldPoint var4 = var1.ak.br.getCenter();
            if (aV.llIllIIIlllIII(var4.distanceTo((Locatable)var1.bS), lIlIIlIIllIl[8])) {
                return lIlIIlIIllIl[2];
            }
            System.out.println(lIlIIlIIllII[lIlIIlIIllIl[9]]);
            Movement.setDestination((WorldPoint)var4);
            return lIlIIlIIllIl[1];
        }
        if (aV.llIllIIIllIllI(var1.bS.getInteracting()) && aV.llIllIIIllIlII(var1.bS.getInteracting().getName().contains(lIlIIlIIllII[lIlIIlIIllIl[6]]) ? 1 : 0)) {
            return lIlIIlIIllIl[2];
        }
        var2_2.interact(lIlIIlIIllII[lIlIIlIIllIl[10]]);
        System.out.println(lIlIIlIIllII[lIlIIlIIllIl[11]]);
        return lIlIIlIIllIl[1];
    }

    @Override
    public EquipmentSetup cj() {
        return s.bb();
    }

    private static boolean llIllIIIlllIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    protected ScavangersPrepTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIlIIllIl[0];
    }

    private static boolean llIllIIIllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIIIllIlll(Object object) {
        return object == null;
    }

    private static boolean llIllIIIlllIlI(Object object, Object object2) {
        return object == object2;
    }

    static {
        aV.llIllIIIllIIll();
        aV.llIllIIIllIIlI();
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aV var5;
        if (aV.llIllIIIlllIIl(this.bS.getPlane(), lIlIIlIIllIl[7])) {
            return lIlIIlIIllIl[2];
        }
        var5.ak = var5.co.L();
        var5.am = var5.co.N();
        var5.al = var5.co.M();
        if (aV.llIllIIIlllIlI((Object)var5.ak.bw, (Object)N.SCAVENGERS)) {
            bl2 = lIlIIlIIllIl[1];

            }
        } else {
            bl2 = lIlIIlIIllIl[2];
        }
        return bl2;
    }

    private static boolean llIllIIIllIllI(Object object) {
        return object != null;
    }

    private static boolean llIllIIIllIlIl(int n2, int n3) {
        return n2 >= n3;
    }

        return String.valueOf(var6);
    }

    private static void llIllIIIllIIlI() {
        lIlIIlIIllII = new String[lIlIIlIIllIl[13]];
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[2]] = "Walking to end";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[1]] = "Take";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[7]] = "Scavenger beast";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[9]] = "walking to center";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[6]] = "Scavenger beast";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[10]] = "Attack";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[11]] = "attacking";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[12]] = "Scavenger beast";
    }

    private static boolean llIllIIIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var7;
        aV var8;
        String[] stringArray = new String[lIlIIlIIllIl[1]];
        stringArray[aV.lIlIIlIIllIl[2]] = lIlIIlIIllII[lIlIIlIIllIl[12]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aV.llIllIIIllIlll(nPC)) {
            return null;
        }
        if (aV.llIllIIIlllIII(var8.bS.distanceTo((Locatable)var7), lIlIIlIIllIl[10])) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

    private static boolean llIllIIIlllIll(int n2, int n3) {
        return n2 == n3;
    }

}

