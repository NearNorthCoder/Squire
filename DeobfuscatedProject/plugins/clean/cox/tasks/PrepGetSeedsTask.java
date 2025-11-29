/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.CoxTaskBase;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.GameEnum32;
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Prep Get Seeds", priority=21020, blocking=true)
public class PrepGetSeedsTask
extends CoxTaskBase {
    
     n ee;
    
     n ef;

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var1_2;
        ba var2;
        if (ba.llIllIlIIllIll((Object)u.bh(), (Object)w.REACHED_BOTTOM)) {
            return lIlIIllIlIlI[0];
        }
        int[] nArray = new int[lIlIIllIlIlI[1]];
        nArray[ba.lIlIIllIlIlI[0]] = lIlIIllIlIlI[2];
        if (ba.llIllIlIIlllII(Inventory.getCount((boolean)lIlIIllIlIlI[1], (int[])nArray), lIlIIllIlIlI[3])) {
            if (ba.llIllIlIIllIll((Object)var2.ak.bw, (Object)N.FARMING)) {
                int[] nArray2 = new int[lIlIIllIlIlI[1]];
                nArray2[ba.lIlIIllIlIlI[0]] = lIlIIllIlIlI[4];
                if (ba.llIllIlIIlllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIlIIllIlIlI[1]];
                    nArray3[ba.lIlIIllIlIlI[0]] = lIlIIllIlIlI[4];
                    Inventory.dropAll((int[])nArray3);

                }
                return lIlIIllIlIlI[0];
            }
            if (ba.llIllIlIIlllIl(Reachable.isWalkable((WorldPoint)var2.ee.bt) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var2.ee.bq.dx(lIlIIllIlIlI[5]).dy(lIlIIllIlIlI[5]));
                return lIlIIllIlIlI[1];
            }
            TileObject var3 = var2.cR();
            if (ba.llIllIlIIllllI(var3)) {
                Movement.setDestination((WorldPoint)var2.ef.bs);
                return lIlIIllIlIlI[1];
            }
            if (!ba.llIllIlIIlllll(var2.bS.isMoving() ? 1 : 0) || ba.llIllIlIIlllIl(var2.bS.isAnimating() ? 1 : 0)) {
                return lIlIIllIlIlI[1];
            }
            var3.interact(lIlIIllIlIIl[lIlIIllIlIlI[0]]);
            return lIlIIllIlIlI[1];
        }
        if (ba.llIllIlIIllIll((Object)var2.ak.bw, (Object)N.FARMING)) {
            Movement.setDestination((WorldPoint)var2.al.bs);
            return lIlIIllIlIlI[1];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (ba.llIllIlIIlllIl(tileObject.getName().contains(lIlIIllIlIIl[lIlIIllIlIlI[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIllIlIlI[1]];
                stringArray[ba.lIlIIllIlIlI[0]] = lIlIIllIlIIl[lIlIIllIlIlI[9]];
                if (ba.llIllIlIIlllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIllIlIlI[1];

                    if (1 >= 0) return n2 != 0;
                    return ((0x3E ^ 0x7F ^ 27 + 29 - -22 + 49) & (0x53 ^ 0x17 ^ (0x6C ^ 0x16) ^ -1)) != 0;
                }
            }
            n2 = lIlIIllIlIlI[0];
            return n2 != 0;
        });
        if (!ba.llIllIlIlIIIII(var3) || ba.llIllIlIIlllll(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
            TileObject var4 = var2.cR();
            if (ba.llIllIlIIllllI(var4)) {
                Movement.setDestination((WorldPoint)var2.ef.bs);
                return lIlIIllIlIlI[1];
            }
            if (!ba.llIllIlIIlllll(var2.bS.isMoving() ? 1 : 0) || ba.llIllIlIIlllIl(var2.bS.isAnimating() ? 1 : 0)) {
                return lIlIIllIlIlI[1];
            }
            var4.interact(lIlIIllIlIIl[lIlIIllIlIlI[1]]);
            return lIlIIllIlIlI[1];
        }
        if (!ba.llIllIlIIlllll(var2.bS.isMoving() ? 1 : 0) || ba.llIllIlIIlllIl(var2.bS.isAnimating() ? 1 : 0)) {
            return lIlIIllIlIlI[1];
        }
        var1_2.interact(lIlIIllIlIIl[lIlIIllIlIlI[6]]);
        return lIlIIllIlIlI[1];
    }

    private static boolean llIllIlIIlllIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIlIlIIIII(Object object) {
        return object != null;
    }

    static {
        ba.llIllIlIIllIlI();
        ba.llIllIlIIllIIl();
    }

    @Override
    public boolean ch() {
        boolean bl2;
        ba var5;
        if (ba.llIllIlIlIIIIl(this.bS.getPlane(), lIlIIllIlIlI[6])) {
            return lIlIIllIlIlI[0];
        }
        int[] nArray = new int[lIlIIllIlIlI[1]];
        nArray[ba.lIlIIllIlIlI[0]] = lIlIIllIlIlI[4];
        if (ba.llIllIlIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIllIlIlI[0];
        }
        var5.ak = var5.co.L();
        var5.am = var5.co.N();
        var5.al = var5.co.M();
        var5.ee = var5.eb();
        var5.ef = var5.ec();
        if (!ba.llIllIlIlIIIlI((Object)var5.ak.bw, (Object)N.FARMING) || ba.llIllIlIIllIll((Object)var5.ak.bw, (Object)N.END)) {
            bl2 = lIlIIllIlIlI[1];

            if ((2 & ~2) == -1) {
                return false;
            }
        } else {
            bl2 = lIlIIllIlIlI[0];
        }
        return bl2;
    }

    private static boolean llIllIlIlIIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIllIlIIllIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIllIlIIlllII(int n2, int n3) {
        return n2 > n3;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (ba.llIllIlIIlllIl(tileObject.getName().equals(lIlIIllIlIIl[lIlIIllIlIlI[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIllIlIlI[1]];
                stringArray[ba.lIlIIllIlIlI[0]] = lIlIIllIlIIl[lIlIIllIlIlI[8]];
                if (ba.llIllIlIIlllIl(tileObject.hasAction(stringArray) ? 1 : 0) && ba.llIllIlIIlllIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIllIlIlI[1];

                    if (1 != 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIllIlIlI[0];
            return n2 != 0;
        });
    }

    private static boolean llIllIlIIllllI(Object object) {
        return object == null;
    }

    @Inject
    protected PrepGetSeedsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static void llIllIlIIllIIl() {
        lIlIIllIlIIl = new String[lIlIIllIlIlI[10]];
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[0]] = "Enter";
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[1]] = "Enter";
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[6]] = "Rake";
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[7]] = "Passage";
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[8]] = "Enter";
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[3]] = "Weeds";
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[9]] = "Rake";
    }

    private static boolean llIllIlIlIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIllIlIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private n ec() {
        List<n> list = this.co.D();
        return list.get(list.size() - lIlIIllIlIlI[1]);
    }

    private n eb() {
        List<n> list = this.co.D();
        return list.get(list.size() - lIlIIllIlIlI[6]);
    }

    private static boolean llIllIlIIlllll(int n2) {
        return n2 == 0;
    }
}

