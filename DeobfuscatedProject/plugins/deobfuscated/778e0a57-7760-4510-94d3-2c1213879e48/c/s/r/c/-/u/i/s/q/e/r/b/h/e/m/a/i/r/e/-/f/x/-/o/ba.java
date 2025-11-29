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
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bg;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.w;
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
public class ba
extends bg {
    private static /* synthetic */ int[] lIlIIllIlIlI;
    /* synthetic */ n ee;
    private static /* synthetic */ String[] lIlIIllIlIIl;
    /* synthetic */ n ef;

    private static String llIllIlIIlIlll(String lllllllllllllllIllIllIIIIlIIIIII, String lllllllllllllllIllIllIIIIlIIIlII) {
        lllllllllllllllIllIllIIIIlIIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIIIIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIIIIlIIIIll = new StringBuilder();
        char[] lllllllllllllllIllIllIIIIlIIIIlI = lllllllllllllllIllIllIIIIlIIIlII.toCharArray();
        int lllllllllllllllIllIllIIIIlIIIIIl = lIlIIllIlIlI[0];
        char[] lllllllllllllllIllIllIIIIIlllIll = lllllllllllllllIllIllIIIIlIIIIII.toCharArray();
        int lllllllllllllllIllIllIIIIIlllIlI = lllllllllllllllIllIllIIIIIlllIll.length;
        int lllllllllllllllIllIllIIIIIlllIIl = lIlIIllIlIlI[0];
        while (ba.llIllIlIlIIIll(lllllllllllllllIllIllIIIIIlllIIl, lllllllllllllllIllIllIIIIIlllIlI)) {
            char lllllllllllllllIllIllIIIIlIIIllI = lllllllllllllllIllIllIIIIIlllIll[lllllllllllllllIllIllIIIIIlllIIl];
            lllllllllllllllIllIllIIIIlIIIIll.append((char)(lllllllllllllllIllIllIIIIlIIIllI ^ lllllllllllllllIllIllIIIIlIIIIlI[lllllllllllllllIllIllIIIIlIIIIIl % lllllllllllllllIllIllIIIIlIIIIlI.length]));
            0;
            ++lllllllllllllllIllIllIIIIlIIIIIl;
            ++lllllllllllllllIllIllIIIIIlllIIl;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllIIIIlIIIIll);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var1_2;
        ba lllllllllllllllIllIllIIIIllIIlll;
        if (ba.llIllIlIIllIll((Object)u.bh(), (Object)w.REACHED_BOTTOM)) {
            return lIlIIllIlIlI[0];
        }
        int[] nArray = new int[lIlIIllIlIlI[1]];
        nArray[ba.lIlIIllIlIlI[0]] = lIlIIllIlIlI[2];
        if (ba.llIllIlIIlllII(Inventory.getCount((boolean)lIlIIllIlIlI[1], (int[])nArray), lIlIIllIlIlI[3])) {
            if (ba.llIllIlIIllIll((Object)lllllllllllllllIllIllIIIIllIIlll.ak.bw, (Object)N.FARMING)) {
                int[] nArray2 = new int[lIlIIllIlIlI[1]];
                nArray2[ba.lIlIIllIlIlI[0]] = lIlIIllIlIlI[4];
                if (ba.llIllIlIIlllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIlIIllIlIlI[1]];
                    nArray3[ba.lIlIIllIlIlI[0]] = lIlIIllIlIlI[4];
                    Inventory.dropAll((int[])nArray3);
                    0;
                }
                return lIlIIllIlIlI[0];
            }
            if (ba.llIllIlIIlllIl(Reachable.isWalkable((WorldPoint)lllllllllllllllIllIllIIIIllIIlll.ee.bt) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)lllllllllllllllIllIllIIIIllIIlll.ee.bq.dx(lIlIIllIlIlI[5]).dy(lIlIIllIlIlI[5]));
                return lIlIIllIlIlI[1];
            }
            TileObject lllllllllllllllIllIllIIIIllIIllI = lllllllllllllllIllIllIIIIllIIlll.cR();
            if (ba.llIllIlIIllllI(lllllllllllllllIllIllIIIIllIIllI)) {
                Movement.setDestination((WorldPoint)lllllllllllllllIllIllIIIIllIIlll.ef.bs);
                return lIlIIllIlIlI[1];
            }
            if (!ba.llIllIlIIlllll(lllllllllllllllIllIllIIIIllIIlll.bS.isMoving() ? 1 : 0) || ba.llIllIlIIlllIl(lllllllllllllllIllIllIIIIllIIlll.bS.isAnimating() ? 1 : 0)) {
                return lIlIIllIlIlI[1];
            }
            lllllllllllllllIllIllIIIIllIIllI.interact(lIlIIllIlIIl[lIlIIllIlIlI[0]]);
            return lIlIIllIlIlI[1];
        }
        if (ba.llIllIlIIllIll((Object)lllllllllllllllIllIllIIIIllIIlll.ak.bw, (Object)N.FARMING)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIllIllIIIIllIIlll.al.bs);
            return lIlIIllIlIlI[1];
        }
        TileObject lllllllllllllllIllIllIIIIllIIllI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (ba.llIllIlIIlllIl(tileObject.getName().contains(lIlIIllIlIIl[lIlIIllIlIlI[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIllIlIlI[1]];
                stringArray[ba.lIlIIllIlIlI[0]] = lIlIIllIlIIl[lIlIIllIlIlI[9]];
                if (ba.llIllIlIIlllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIllIlIlI[1];
                    0;
                    if (1 >= 0) return n2 != 0;
                    return ((0x3E ^ 0x7F ^ 27 + 29 - -22 + 49) & (0x53 ^ 0x17 ^ (0x6C ^ 0x16) ^ -1)) != 0;
                }
            }
            n2 = lIlIIllIlIlI[0];
            return n2 != 0;
        });
        if (!ba.llIllIlIlIIIII(lllllllllllllllIllIllIIIIllIIllI) || ba.llIllIlIIlllll(Reachable.isInteractable((Locatable)lllllllllllllllIllIllIIIIllIIllI) ? 1 : 0)) {
            TileObject lllllllllllllllIllIllIIIIllIIlIl = lllllllllllllllIllIllIIIIllIIlll.cR();
            if (ba.llIllIlIIllllI(lllllllllllllllIllIllIIIIllIIlIl)) {
                Movement.setDestination((WorldPoint)lllllllllllllllIllIllIIIIllIIlll.ef.bs);
                return lIlIIllIlIlI[1];
            }
            if (!ba.llIllIlIIlllll(lllllllllllllllIllIllIIIIllIIlll.bS.isMoving() ? 1 : 0) || ba.llIllIlIIlllIl(lllllllllllllllIllIllIIIIllIIlll.bS.isAnimating() ? 1 : 0)) {
                return lIlIIllIlIlI[1];
            }
            lllllllllllllllIllIllIIIIllIIlIl.interact(lIlIIllIlIIl[lIlIIllIlIlI[1]]);
            return lIlIIllIlIlI[1];
        }
        if (!ba.llIllIlIIlllll(lllllllllllllllIllIllIIIIllIIlll.bS.isMoving() ? 1 : 0) || ba.llIllIlIIlllIl(lllllllllllllllIllIllIIIIllIIlll.bS.isAnimating() ? 1 : 0)) {
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

    private static void llIllIlIIllIlI() {
        lIlIIllIlIlI = new int[12];
        ba.lIlIIllIlIlI[0] = (0x9F ^ 0x8D ^ (0x5F ^ 0x70)) & (0x86 ^ 0x96 ^ (0xB5 ^ 0x98) ^ -1);
        ba.lIlIIllIlIlI[1] = 1;
        ba.lIlIIllIlIlI[2] = 0xFFFFF7ED & 0x59BF;
        ba.lIlIIllIlIlI[3] = 0x50 ^ 0x55 ^ (0x34 ^ 0x68) & ~(0xE9 ^ 0xB5);
        ba.lIlIIllIlIlI[4] = -(0xFFFFB923 & 0x67FF) & (0xFFFFFDFF & 0x37FF);
        ba.lIlIIllIlIlI[5] = 142 + 114 - 175 + 68 ^ 38 + 133 - 138 + 121;
        ba.lIlIIllIlIlI[6] = 2;
        ba.lIlIIllIlIlI[7] = 3;
        ba.lIlIIllIlIlI[8] = 9 ^ 0x19 ^ (0xD2 ^ 0xC6);
        ba.lIlIIllIlIlI[9] = 0x4B ^ 0x4D;
        ba.lIlIIllIlIlI[10] = 0x6C ^ 0x6B;
        ba.lIlIIllIlIlI[11] = 0x98 ^ 0xA6 ^ (0xB5 ^ 0x83);
    }

    static {
        ba.llIllIlIIllIlI();
        ba.llIllIlIIllIIl();
    }

    @Override
    public boolean ch() {
        boolean bl2;
        ba lllllllllllllllIllIllIIIIllIIIll;
        if (ba.llIllIlIlIIIIl(this.bS.getPlane(), lIlIIllIlIlI[6])) {
            return lIlIIllIlIlI[0];
        }
        int[] nArray = new int[lIlIIllIlIlI[1]];
        nArray[ba.lIlIIllIlIlI[0]] = lIlIIllIlIlI[4];
        if (ba.llIllIlIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIllIlIlI[0];
        }
        lllllllllllllllIllIllIIIIllIIIll.ak = lllllllllllllllIllIllIIIIllIIIll.co.L();
        lllllllllllllllIllIllIIIIllIIIll.am = lllllllllllllllIllIllIIIIllIIIll.co.N();
        lllllllllllllllIllIllIIIIllIIIll.al = lllllllllllllllIllIllIIIIllIIIll.co.M();
        lllllllllllllllIllIllIIIIllIIIll.ee = lllllllllllllllIllIllIIIIllIIIll.eb();
        lllllllllllllllIllIllIIIIllIIIll.ef = lllllllllllllllIllIllIIIIllIIIll.ec();
        if (!ba.llIllIlIlIIIlI((Object)lllllllllllllllIllIllIIIIllIIIll.ak.bw, (Object)N.FARMING) || ba.llIllIlIIllIll((Object)lllllllllllllllIllIllIIIIllIIIll.ak.bw, (Object)N.END)) {
            bl2 = lIlIIllIlIlI[1];
            0;
            if ((2 & ~2) == -1) {
                return ((0xF ^ 0x53) & ~(0x3F ^ 0x63)) != 0;
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

    private static String llIllIlIIlIllI(String lllllllllllllllIllIllIIIIIllIIII, String lllllllllllllllIllIllIIIIIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIIIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIIIlIllll.getBytes(StandardCharsets.UTF_8)), lIlIIllIlIlI[11]), "DES");
            Cipher lllllllllllllllIllIllIIIIIllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIllIllIIIIIllIIlI.init(lIlIIllIlIlI[6], lllllllllllllllIllIllIIIIIllIIll);
            return new String(lllllllllllllllIllIllIIIIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIIIIllIIIl) {
            lllllllllllllllIllIllIIIIIllIIIl.printStackTrace();
            return null;
        }
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (ba.llIllIlIIlllIl(tileObject.getName().equals(lIlIIllIlIIl[lIlIIllIlIlI[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIllIlIlI[1]];
                stringArray[ba.lIlIIllIlIlI[0]] = lIlIIllIlIIl[lIlIIllIlIlI[8]];
                if (ba.llIllIlIIlllIl(tileObject.hasAction(stringArray) ? 1 : 0) && ba.llIllIlIIlllIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIllIlIlI[1];
                    0;
                    if (1 != 0) return n2 != 0;
                    return ((188 + 120 - 182 + 82 ^ 20 + 84 - 87 + 133) & (14 + 24 - -35 + 56 ^ 9 + 44 - -54 + 92 ^ -1)) != 0;
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
    protected ba(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static void llIllIlIIllIIl() {
        lIlIIllIlIIl = new String[lIlIIllIlIlI[10]];
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[0]] = ba."Enter";
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[1]] = ba."Enter";
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[6]] = ba."Rake";
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[7]] = ba."Passage";
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[8]] = ba."Enter";
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[3]] = ba."Weeds";
        ba.lIlIIllIlIIl[ba.lIlIIllIlIlI[9]] = ba."Rake";
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

    private static String llIllIlIIllIII(String lllllllllllllllIllIllIIIIlIlIIll, String lllllllllllllllIllIllIIIIlIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIIIIlIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIIIIlIlIlll.init(lIlIIllIlIlI[6], lllllllllllllllIllIllIIIIlIllIII);
            return new String(lllllllllllllllIllIllIIIIlIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIIIlIlIllI) {
            lllllllllllllllIllIllIIIIlIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlIIlllll(int n2) {
        return n2 == 0;
    }
}

