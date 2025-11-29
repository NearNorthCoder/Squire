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

/* TASK: Prep Get Seeds -> PrepgetseedsTask */
@TaskDesc(name="Prep Get Seeds", priority=21020, blocking=true)
public class ba
extends bg {
    private static /* synthetic */ int[] lIlIIllIlIlI;
    /* synthetic */ n ee;
    private static /* synthetic */ String[] lIlIIllIlIIl;
    /* synthetic */ n ef;

    private static String llIllIlIIlIlll(String var4, String var6) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var1 = var6.toCharArray();
        int var13 = lIlIIllIlIlI[0];
        char[] var2 = var4.toCharArray();
        int var22 = var2.length;
        int var8 = lIlIIllIlIlI[0];
        while (ba.llIllIlIlIIIll(var8, var22)) {
            char var23 = var2[var8];
            var12.append((char)(var23 ^ var1[var13 % var1.length]));
            0;
            ++var13;
            ++var8;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var1_2;
        ba var9;
        if (ba.llIllIlIIllIll((Object)u.bh(), (Object)w.REACHED_BOTTOM)) {
            return lIlIIllIlIlI[0];
        }
        int[] nArray = new int[lIlIIllIlIlI[1]];
        nArray[ba.lIlIIllIlIlI[0]] = lIlIIllIlIlI[2];
        if (ba.llIllIlIIlllII(Inventory.getCount((boolean)lIlIIllIlIlI[1], (int[])nArray), lIlIIllIlIlI[3])) {
            if (ba.llIllIlIIllIll((Object)var9.ak.bw, (Object)N.FARMING)) {
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
            if (ba.llIllIlIIlllIl(Reachable.isWalkable((WorldPoint)var9.ee.bt) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var9.ee.bq.dx(lIlIIllIlIlI[5]).dy(lIlIIllIlIlI[5]));
                return lIlIIllIlIlI[1];
            }
            TileObject var18 = var9.cR();
            if (ba.llIllIlIIllllI(var18)) {
                Movement.setDestination((WorldPoint)var9.ef.bs);
                return lIlIIllIlIlI[1];
            }
            if (!ba.llIllIlIIlllll(var9.bS.isMoving() ? 1 : 0) || ba.llIllIlIIlllIl(var9.bS.isAnimating() ? 1 : 0)) {
                return lIlIIllIlIlI[1];
            }
            var18.interact(lIlIIllIlIIl[lIlIIllIlIlI[0]]);
            return lIlIIllIlIlI[1];
        }
        if (ba.llIllIlIIllIll((Object)var9.ak.bw, (Object)N.FARMING)) {
            Movement.setDestination((WorldPoint)var9.al.bs);
            return lIlIIllIlIlI[1];
        }
        TileObject var18 = TileObjects.getNearest(tileObject -> {
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
        if (!ba.llIllIlIlIIIII(var18) || ba.llIllIlIIlllll(Reachable.isInteractable((Locatable)var18) ? 1 : 0)) {
            TileObject var19 = var9.cR();
            if (ba.llIllIlIIllllI(var19)) {
                Movement.setDestination((WorldPoint)var9.ef.bs);
                return lIlIIllIlIlI[1];
            }
            if (!ba.llIllIlIIlllll(var9.bS.isMoving() ? 1 : 0) || ba.llIllIlIIlllIl(var9.bS.isAnimating() ? 1 : 0)) {
                return lIlIIllIlIlI[1];
            }
            var19.interact(lIlIIllIlIIl[lIlIIllIlIlI[1]]);
            return lIlIIllIlIlI[1];
        }
        if (!ba.llIllIlIIlllll(var9.bS.isMoving() ? 1 : 0) || ba.llIllIlIIlllIl(var9.bS.isAnimating() ? 1 : 0)) {
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
        ba var7;
        if (ba.llIllIlIlIIIIl(this.bS.getPlane(), lIlIIllIlIlI[6])) {
            return lIlIIllIlIlI[0];
        }
        int[] nArray = new int[lIlIIllIlIlI[1]];
        nArray[ba.lIlIIllIlIlI[0]] = lIlIIllIlIlI[4];
        if (ba.llIllIlIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIllIlIlI[0];
        }
        var7.ak = var7.co.L();
        var7.am = var7.co.N();
        var7.al = var7.co.M();
        var7.ee = var7.eb();
        var7.ef = var7.ec();
        if (!ba.llIllIlIlIIIlI((Object)var7.ak.bw, (Object)N.FARMING) || ba.llIllIlIIllIll((Object)var7.ak.bw, (Object)N.END)) {
            bl2 = lIlIIllIlIlI[1];
            0;
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

    private static String llIllIlIIlIllI(String var5, String var16) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lIlIIllIlIlI[11]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIlIIllIlIlI[6], var14);
            return new String(var17.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
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

    private static String llIllIlIIllIII(String var21, String var15) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIlIIllIlIlI[6], var3);
            return new String(var11.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlIIlllll(int n2) {
        return n2 == 0;
    }
}

