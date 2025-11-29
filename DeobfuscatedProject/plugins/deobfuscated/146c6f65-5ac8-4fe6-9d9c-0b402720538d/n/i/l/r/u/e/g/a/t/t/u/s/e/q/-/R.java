/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Predicates
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.f;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.g;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Attacking for Crystals", priority=2, blocking=true)
public class R
extends n {
    private static /* synthetic */ int[] llIIllIIlIll;
    private /* synthetic */ int cc;
    private final /* synthetic */ b cb;
    private static /* synthetic */ String[] llIIllIIlIlI;

    private static void llllllIlIlIIIl() {
        llIIllIIlIlI = new String[llIIllIIlIll[3]];
        R.llIIllIIlIlI[R.llIIllIIlIll[1]] = R."Activate";
        R.llIIllIIlIlI[R.llIIllIIlIll[2]] = R."Attack";
    }

    private static boolean llllllIlIllIIl(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public R(c c2, b b2) {
        d[] dArray = new d[llIIllIIlIll[0]];
        dArray[R.llIIllIIlIll[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[R.llIIllIIlIll[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[R.llIIllIIlIll[3]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
        this.cc = llIIllIIlIll[1];
        this.cb = b2;
    }

    private static boolean llllllIlIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIlIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIlIlIIll(Object object) {
        return object == null;
    }

    static {
        R.llllllIlIlIIlI();
        R.llllllIlIlIIIl();
    }

    private static String llllllIlIIllll(String lllllllllllllllIlIIlIllIIIllllIl, String lllllllllllllllIlIIlIllIIIllllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIIlIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIIIllllII.getBytes(StandardCharsets.UTF_8)), llIIllIIlIll[9]), "DES");
            Cipher lllllllllllllllIlIIlIllIIlIIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIllIIlIIIIIl.init(llIIllIIlIll[3], lllllllllllllllIlIIlIllIIlIIIIlI);
            return new String(lllllllllllllllIlIIlIllIIlIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIllIIlIIIIII) {
            lllllllllllllllIlIIlIllIIlIIIIII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean be() {
        WorldPoint lllllllllllllllIlIIlIllIIlIlllII;
        int n2;
        int lllllllllllllllIlIIlIllIIlIlllll;
        int n3;
        void lllllllllllllllIlIIlIllIIllIIlIl;
        R lllllllllllllllIlIIlIllIIllIIllI;
        Player player = Players.getLocal();
        if (R.llllllIlIlIIll(player)) {
            return llIIllIIlIll[1];
        }
        int lllllllllllllllIlIIlIllIIllIIlII = Static.getClient().getTickCount();
        if (!R.llllllIlIlIlII(lllllllllllllllIlIIlIllIIllIIllI.ba.A() ? 1 : 0) || R.llllllIlIlIlIl(lllllllllllllllIlIIlIllIIllIIllI.ba.S() ? 1 : 0)) {
            return llIIllIIlIll[1];
        }
        if (R.llllllIlIlIllI((Object)lllllllllllllllIlIIlIllIIllIIllI.ba.J()) && R.llllllIlIlIllI(lllllllllllllllIlIIlIllIIllIIlIl.getInteracting())) {
            return llIIllIIlIll[1];
        }
        if (R.llllllIlIlIlll(lllllllllllllllIlIIlIllIIllIIllI.cc) && R.llllllIlIllIII(lllllllllllllllIlIIlIllIIllIIlII - lllllllllllllllIlIIlIllIIllIIllI.cc, llIIllIIlIll[4])) {
            return llIIllIIlIll[1];
        }
        if (R.llllllIlIlIllI(lllllllllllllllIlIIlIllIIllIIlIl.getInteracting()) && R.llllllIlIllIIl((Object)lllllllllllllllIlIIlIllIIllIIllI.ba.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            lllllllllllllllIlIIlIllIIllIIllI.cc = lllllllllllllllIlIIlIllIIllIIlII;
            return llIIllIIlIll[2];
        }
        Map<i, Integer> lllllllllllllllIlIIlIllIIllIIIll = lllllllllllllllIlIIlIllIIllIIllI.ba.E();
        if (R.llllllIlIlIlIl(lllllllllllllllIlIIlIllIIllIIIll.containsKey((Object)i.CRYSTAL_SHARD) ? 1 : 0)) {
            return llIIllIIlIll[1];
        }
        int lllllllllllllllIlIIlIllIIllIIIlI = lllllllllllllllIlIIlIllIIllIIIll.get((Object)i.CRYSTAL_SHARD);
        if (R.llllllIlIllIlI(lllllllllllllllIlIIlIllIIllIIIlI)) {
            return llIIllIIlIll[1];
        }
        int lllllllllllllllIlIIlIllIIllIIIIl = i.CRYSTAL_SHARD.aC();
        l lllllllllllllllIlIIlIllIIllIIIII = lllllllllllllllIlIIlIllIIllIIllI.ba.T();
        if (R.llllllIlIllIll((Object)lllllllllllllllIlIIlIllIIllIIllI.ba.W(), (Object)d.DEMI_BOSS_EXPLORE)) {
            n3 = llIIllIIlIll[2];
            0;
            if (null != null) {
                return ((0xF ^ 0x29) & ~(0x23 ^ 5)) != 0;
            }
        } else {
            n3 = llIIllIIlIll[1];
        }
        if (!R.llllllIlIlIlIl(lllllllllllllllIlIIlIllIIlIlllll = n3) || R.llllllIlIllIll((Object)lllllllllllllllIlIIlIllIIllIIllI.ba.W(), (Object)d.EXTRA_FOOD_EXPLORE)) {
            n2 = llIIllIIlIll[2];
            0;
            if (-1 > (0xE ^ 0xA)) {
                return ((0xF3 ^ 0x90) & ~(0x68 ^ 0xB)) != 0;
            }
        } else {
            n2 = llIIllIIlIll[1];
        }
        int lllllllllllllllIlIIlIllIIlIllllI = n2;
        NPC lllllllllllllllIlIIlIllIIlIlllIl = null;
        if (R.llllllIlIlIlII(lllllllllllllllIlIIlIllIIlIlllll)) {
            if (R.llllllIlIlIlII(lllllllllllllllIlIIlIllIIllIIllI.ba.E().entrySet().stream().anyMatch(entry -> {
                int n2;
                if (R.llllllIlIlIlll((Integer)entry.getValue()) && R.llllllIlIllIIl(entry.getKey(), (Object)i.CRYSTAL_SHARD)) {
                    n2 = llIIllIIlIll[2];
                    0;
                    if (null != null) {
                        return ((0x5D ^ 0xF) & ~(0x95 ^ 0xC7)) != 0;
                    }
                } else {
                    n2 = llIIllIIlIll[1];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                if (!R.llllllIlIlllII(lllllllllllllllIlIIlIllIIllIIIlI, llIIllIIlIll[5])) return llIIllIIlIll[1];
                lllllllllllllllIlIIlIllIIlIlllII = NPCs.getNearest((Predicate)Predicates.ids((int[])e.as[llIIllIIlIll[2]]));
                if (!R.llllllIlIlIllI(lllllllllllllllIlIIlIllIIlIlllII) || R.llllllIlIlllIl(lllllllllllllllIlIIlIllIIlIlllII.distanceTo((Locatable)lllllllllllllllIlIIlIllIIllIIlIl), llIIllIIlIll[6])) {
                    return llIIllIIlIll[1];
                }
                if (R.llllllIlIlIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                    return llIIllIIlIll[1];
                }
                lllllllllllllllIlIIlIllIIlIlllIl = lllllllllllllllIlIIlIllIIlIlllII;
                0;
                if (1 != 1) {
                    return ((86 + 64 - -9 + 78 ^ 71 + 136 - 68 + 3) & (28 + 150 - 134 + 119 ^ 124 + 171 - 174 + 71 ^ -1)) != 0;
                }
            }
        } else if (R.llllllIlIlIlIl(lllllllllllllllIlIIlIllIIllIIllI.ba.B() ? 1 : 0) && R.llllllIlIlllIl(lllllllllllllllIlIIlIllIIllIIIIl, llIIllIIlIll[7])) {
            return llIIllIIlIll[1];
        }
        if (R.llllllIlIlIIll(lllllllllllllllIlIIlIllIIlIlllIl) && R.llllllIlIllIll((Object)lllllllllllllllIlIIlIllIIllIIllI.ba.W(), (Object)d.FIRST_ROTATION_EXPLORE)) {
            lllllllllllllllIlIIlIllIIlIlllIl = NPCs.getNearest(nPC -> {
                int n2;
                if (R.llllllIlIlIlIl(nPC.isDead() ? 1 : 0) && R.llllllIlIlIlII(Predicates.ids((int[])e.as[llIIllIIlIll[1]]).test(nPC) ? 1 : 0) && (!R.llllllIlIlIllI(lllllllllllllllIlIIlIllIIllIIIII) || R.llllllIlIlIlII(lllllllllllllllIlIIlIllIIllIIIII.e(nPC.getWorldLocation()) ? 1 : 0))) {
                    n2 = llIIllIIlIll[2];
                    0;
                    if ((0x46 ^ 0x3B ^ (0x5E ^ 0x26)) == 0) {
                        return ((192 + 46 - 152 + 152 ^ 34 + 169 - 91 + 78) & (0xD4 ^ 0xBC ^ (0xAC ^ 0x94) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIllIIlIll[1];
                }
                return n2 != 0;
            });
        }
        if (R.llllllIlIlIIll(lllllllllllllllIlIIlIllIIlIlllIl) && R.llllllIlIlIlII(lllllllllllllllIlIIlIllIIlIllllI) && R.llllllIlIlIIll(lllllllllllllllIlIIlIllIIlIlllIl = NPCs.getNearest(nPC -> {
            int n2;
            if (R.llllllIlIlIlIl(nPC.isDead() ? 1 : 0) && (!R.llllllIlIlIlIl(Predicates.ids((int[])e.as[llIIllIIlIll[2]]).test(nPC) ? 1 : 0) || R.llllllIlIlIlII(Predicates.ids((int[])e.as[llIIllIIlIll[1]]).test(nPC) ? 1 : 0))) {
                n2 = llIIllIIlIll[2];
                0;
                if (2 == 0) {
                    return ((0x20 ^ 0x3A) & ~(0xAC ^ 0xB6)) != 0;
                }
            } else {
                n2 = llIIllIIlIll[1];
            }
            return n2 != 0;
        })) && R.llllllIlIlIlII(Equipment.contains((int[])f.TIER_3_STAFF.ad()) ? 1 : 0)) {
            lllllllllllllllIlIIlIllIIlIlllIl = NPCs.getNearest(nPC -> {
                int n2;
                if (R.llllllIlIlIlIl(nPC.isDead() ? 1 : 0) && R.llllllIlIlIlII(Arrays.stream(g.values()).anyMatch(g2 -> g2.f((NPC)nPC)) ? 1 : 0)) {
                    n2 = llIIllIIlIll[2];
                    0;
                    if ((0x59 ^ 0x77 ^ (0x2B ^ 1)) < 2) {
                        return ((0x34 ^ 0x44 ^ (0x5C ^ 0x31)) & (0x28 ^ 0x4F ^ (0xF3 ^ 0x89) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIllIIlIll[1];
                }
                return n2 != 0;
            });
        }
        if (R.llllllIlIlIIll(lllllllllllllllIlIIlIllIIlIlllIl)) {
            return llIIllIIlIll[1];
        }
        lllllllllllllllIlIIlIllIIlIlllII = lllllllllllllllIlIIlIllIIllIIlIl.getWorldLocation();
        int lllllllllllllllIlIIlIllIIlIllIll = lllllllllllllllIlIIlIllIIlIlllIl.distanceTo(lllllllllllllllIlIIlIllIIlIlllII);
        if (R.llllllIlIlllIl(lllllllllllllllIlIIlIllIIlIllIll, llIIllIIlIll[8])) {
            Item lllllllllllllllIlIIlIllIIlIlIlll;
            h lllllllllllllllIlIIlIllIIlIllIlI = lllllllllllllllIlIIlIllIIllIIllI.ba.V();
            l lllllllllllllllIlIIlIllIIlIllIIl = lllllllllllllllIlIIlIllIIlIllIlI.b(l2 -> {
                int n2;
                if (R.llllllIlIlIlIl(l2.aY() ? 1 : 0) && R.llllllIlIlIlII(l2.e(lllllllllllllllIlIIlIllIIlIllIlI.d(lllllllllllllllIlIIlIllIIlIlllII)) ? 1 : 0)) {
                    n2 = llIIllIIlIll[2];
                    0;
                    if (-1 > 0) {
                        return ((0x49 ^ 0x67) & ~(0x9B ^ 0xB5)) != 0;
                    }
                } else {
                    n2 = llIIllIIlIll[1];
                }
                return n2 != 0;
            }).stream().min(Comparator.comparingInt(l2 -> (int)l2.aQ().distanceToHypotenuse(lllllllllllllllIlIIlIllIIlIlllII))).orElse(null);
            if (R.llllllIlIlIllI(lllllllllllllllIlIIlIllIIlIllIIl) && R.llllllIlIllIII(lllllllllllllllIlIIlIllIIlIllIIl.aQ().distanceTo(lllllllllllllllIlIIlIllIIlIlllII), lllllllllllllllIlIIlIllIIlIllIll)) {
                return lllllllllllllllIlIIlIllIIllIIllI.ba.a(lllllllllllllllIlIIlIllIIlIllIIl, lllllllllllllllIlIIlIllIIlIlllII);
            }
            int lllllllllllllllIlIIlIllIIlIllIII = lllllllllllllllIlIIlIllIIlIlllIl.distanceTo(lllllllllllllllIlIIlIllIIlIllIlI.av().aQ());
            if (R.llllllIlIlllIl(lllllllllllllllIlIIlIllIIlIllIll - lllllllllllllllIlIIlIllIIlIllIII, llIIllIIlIll[6]) && R.llllllIlIlIllI(lllllllllllllllIlIIlIllIIlIlIlll = Inventory.getFirst(item -> e.ab.contains(item.getId())))) {
                lllllllllllllllIlIIlIllIIlIlIlll.interact(llIIllIIlIlI[llIIllIIlIll[1]]);
                return llIIllIIlIll[2];
            }
            lllllllllllllllIlIIlIllIIlIlIlll = lllllllllllllllIlIIlIllIIlIlllIl.getWorldLocation();
            return lllllllllllllllIlIIlIllIIllIIllI.ba.a(lllllllllllllllIlIIlIllIIlIllIlI.c(lllllllllllllllIlIIlIllIIlIllIlI.d(lllllllllllllllIlIIlIllIIlIlllII)).stream().min(Comparator.comparingInt(arg_0 -> R.b((WorldPoint)lllllllllllllllIlIIlIllIIlIlIlll, arg_0))).orElse(lllllllllllllllIlIIlIllIIlIllIlI.av()), lllllllllllllllIlIIlIllIIlIlllII);
        }
        if (!R.llllllIlIlIlIl(lllllllllllllllIlIIlIllIIllIIllI.cb.p() ? 1 : 0)) return llIIllIIlIll[2];
        lllllllllllllllIlIIlIllIIlIlllIl.interact(llIIllIIlIlI[llIIllIIlIll[2]]);
        return llIIllIIlIll[2];
    }

    private static /* synthetic */ int b(WorldPoint worldPoint, l l2) {
        return (int)l2.aQ().distanceToHypotenuse(worldPoint);
    }

    private static boolean llllllIlIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllllIlIllIlI(int n2) {
        return n2 < 0;
    }

    private static boolean llllllIlIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIlIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llllllIlIlIIII(String lllllllllllllllIlIIlIllIIIllIIlI, String lllllllllllllllIlIIlIllIIIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIllIIIllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIllIIIllIlII.init(llIIllIIlIll[3], lllllllllllllllIlIIlIllIIIllIlIl);
            return new String(lllllllllllllllIlIIlIllIIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIllIIIllIIll) {
            lllllllllllllllIlIIlIllIIIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlIlIlll(int n2) {
        return n2 > 0;
    }

    private static void llllllIlIlIIlI() {
        llIIllIIlIll = new int[10];
        R.llIIllIIlIll[0] = 3;
        R.llIIllIIlIll[1] = (0x6A ^ 0x51) & ~(0x19 ^ 0x22);
        R.llIIllIIlIll[2] = 1;
        R.llIIllIIlIll[3] = 2;
        R.llIIllIIlIll[4] = 0x26 ^ 0x23;
        R.llIIllIIlIll[5] = 0x27 ^ 0x4C ^ (0x4A ^ 0x71);
        R.llIIllIIlIll[6] = 142 + 9 - 9 + 72 ^ 29 + 11 - 11 + 167;
        R.llIIllIIlIll[7] = 0x39 ^ 0x11;
        R.llIIllIIlIll[8] = 0x3C ^ 0x6F ^ (0xF1 ^ 0xA8);
        R.llIIllIIlIll[9] = 35 + 82 - 0 + 10 ^ (0xFE ^ 0x89);
    }

    private static boolean llllllIlIlIllI(Object object) {
        return object != null;
    }

    private static boolean llllllIlIllIll(Object object, Object object2) {
        return object == object2;
    }
}

