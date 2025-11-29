/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Comparator;
import java.util.Optional;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.g;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Exploring further", priority=1)
public class H
extends n {
    private static /* synthetic */ String[] llIIllIlIIlI;
    private static /* synthetic */ int[] llIIllIlIIll;

    private static boolean lllllllIIIIlII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllllllIIIIIlI(Object object) {
        return object != null;
    }

    private static void lllllllIIIIIII() {
        llIIllIlIIll = new int[3];
        H.llIIllIlIIll[0] = "  ".length();
        H.llIIllIlIIll[1] = (0xA ^ 0x7A ^ (0x74 ^ 0x51)) & (0x15 ^ 0x18 ^ (0x1A ^ 0x42) ^ -" ".length());
        H.llIIllIlIIll[2] = " ".length();
    }

    private static boolean lllllllIIIIIll(Object object) {
        return object == null;
    }

    private static boolean lllllllIIIIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lllllllIIIIlIl(int n2) {
        return n2 == 0;
    }

    static {
        H.lllllllIIIIIII();
        H.llllllIlllllll();
    }

    private static boolean lllllllIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llllllIlllllll() {
        llIIllIlIIlI = new String[llIIllIlIIll[2]];
        H.llIIllIlIIlI[H.llIIllIlIIll[1]] = H.llllllIllllllI("IAw7JxsAGyo=", "aoONm");
    }

    private static boolean lllllllIIIIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var6_7;
        Item lllllllllllllllIlIIlIlIIllIlllll2;
        void lllllllllllllllIlIIlIlIIlllIIlIl;
        g lllllllllllllllIlIIlIlIIlllIIIlI;
        int lllllllllllllllIlIIlIlIIlllIIIll;
        int n2;
        H lllllllllllllllIlIIlIlIIlllIIllI;
        Player player = Players.getLocal();
        if (H.lllllllIIIIIlI(player.getInteracting())) {
            return llIIllIlIIll[1];
        }
        h lllllllllllllllIlIIlIlIIlllIIlII = lllllllllllllllIlIIlIlIIlllIIllI.ba.V();
        if (H.lllllllIIIIIll(lllllllllllllllIlIIlIlIIlllIIlII)) {
            return llIIllIlIIll[1];
        }
        if (H.lllllllIIIIlII((Object)lllllllllllllllIlIIlIlIIlllIIllI.ba.W(), (Object)d.EXTRA_FOOD_EXPLORE)) {
            n2 = llIIllIlIIll[2];
            "".length();
            if (null != null) {
                return ((0x20 ^ 0x15) & ~(0x15 ^ 0x20)) != 0;
            }
        } else {
            n2 = lllllllllllllllIlIIlIlIIlllIIIll = llIIllIlIIll[1];
        }
        if (H.lllllllIIIIIlI((Object)(lllllllllllllllIlIIlIlIIlllIIIlI = lllllllllllllllIlIIlIlIIlllIIllI.ba.J())) && H.lllllllIIIIlIl(lllllllllllllllIlIIlIlIIlllIIIlI.an().aC()) && H.lllllllIIIIlIl(lllllllllllllllIlIIlIlIIlllIIIll)) {
            return llIIllIlIIll[1];
        }
        if (H.lllllllIIIIllI(lllllllllllllllIlIIlIlIIlllIIllI.ba.N() ? 1 : 0)) {
            return llIIllIlIIll[1];
        }
        if (H.lllllllIIIIllI(lllllllllllllllIlIIlIlIIlllIIllI.ba.O() ? 1 : 0)) {
            return llIIllIlIIll[1];
        }
        Optional<l> lllllllllllllllIlIIlIlIIlllIIIIl = lllllllllllllllIlIIlIlIIlllIIlII.b(l2 -> {
            int n2;
            if (H.lllllllIIIIlIl(l2.aY() ? 1 : 0) && H.lllllllIIIIlIl(l2.aS() ? 1 : 0)) {
                n2 = llIIllIlIIll[2];
                "".length();
                if ("   ".length() <= ((0x10 ^ 0x38) & ~(0x1F ^ 0x37))) {
                    return ((0xB3 ^ 0x94) & ~(0x33 ^ 0x14)) != 0;
                }
            } else {
                n2 = llIIllIlIIll[1];
            }
            return n2 != 0;
        }).stream().min(Comparator.comparing(l::aU));
        if (H.lllllllIIIIllI(lllllllllllllllIlIIlIlIIlllIIIIl.isEmpty() ? 1 : 0) && H.lllllllIIIIllI((lllllllllllllllIlIIlIlIIlllIIIIl = lllllllllllllllIlIIlIlIIlllIIlII.b(l2 -> {
            boolean bl;
            if (H.lllllllIIIIlIl(l2.aY() ? 1 : 0)) {
                bl = llIIllIlIIll[2];
                "".length();
                if (((0x13 ^ 0x5F) & ~(0x7E ^ 0x32)) > 0) {
                    return ("  ".length() & ~"  ".length()) != 0;
                }
            } else {
                bl = llIIllIlIIll[1];
            }
            return bl;
        }).stream().min(Comparator.comparing(l::aU))).isEmpty() ? 1 : 0)) {
            WorldPoint lllllllllllllllIlIIlIlIIllIlllll2;
            m lllllllllllllllIlIIlIlIIlllIIIII = lllllllllllllllIlIIlIlIIlllIIllI.ba.V().av();
            if (H.lllllllIIIIllI(lllllllllllllllIlIIlIlIIlllIIIII.e(lllllllllllllllIlIIlIlIIllIlllll2 = lllllllllllllllIlIIlIlIIlllIIlIl.getWorldLocation()) ? 1 : 0)) {
                lllllllllllllllIlIIlIlIIlllIIllI.ba.a(d.PREPARE_BOSS_FIGHT);
                "".length();
                if ((8 ^ 0x49 ^ (0xE5 ^ 0xA0)) <= 0) {
                    return ((0x52 ^ 0x17 ^ (0xED ^ 0xB3)) & (0x41 ^ 0x4F ^ (0xD ^ 0x18) ^ -" ".length())) != 0;
                }
            } else {
                lllllllllllllllIlIIlIlIIlllIIllI.ba.a((l)lllllllllllllllIlIIlIlIIlllIIIII, lllllllllllllllIlIIlIlIIllIlllll2);
                "".length();
            }
            return llIIllIlIIll[2];
        }
        l lllllllllllllllIlIIlIlIIlllIIIII = lllllllllllllllIlIIlIlIIlllIIIIl.get();
        if (H.lllllllIIIIlll(H.lllllllIIIIIIl(lllllllllllllllIlIIlIlIIlllIIIII.aQ().distanceToHypotenuse(lllllllllllllllIlIIlIlIIlllIIlIl.getWorldLocation()) - lllllllllllllllIlIIlIlIIlllIIIII.aQ().distanceToHypotenuse(lllllllllllllllIlIIlIlIIlllIIlII.av().aQ()), 32.0f)) && H.lllllllIIIIIlI(lllllllllllllllIlIIlIlIIllIlllll2 = Inventory.getFirst(item -> e.ab.contains(item.getId())))) {
            lllllllllllllllIlIIlIlIIllIlllll2.interact(llIIllIlIIlI[llIIllIlIIll[1]]);
            return llIIllIlIIll[2];
        }
        return this.ba.a((l)var6_7, player.getWorldLocation());
    }

    @Inject
    public H(c c2) {
        d[] dArray = new d[llIIllIlIIll[0]];
        dArray[H.llIIllIlIIll[1]] = d.DEMI_BOSS_EXPLORE;
        dArray[H.llIIllIlIIll[2]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
    }

    private static int lllllllIIIIIIl(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

    private static String llllllIllllllI(String lllllllllllllllIlIIlIlIIllIlIIII, String lllllllllllllllIlIIlIlIIllIIllll) {
        lllllllllllllllIlIIlIlIIllIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIIllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlIIllIIlllI = new StringBuilder();
        char[] lllllllllllllllIlIIlIlIIllIIllIl = lllllllllllllllIlIIlIlIIllIIllll.toCharArray();
        int lllllllllllllllIlIIlIlIIllIIllII = llIIllIlIIll[1];
        char[] lllllllllllllllIlIIlIlIIllIIIllI = lllllllllllllllIlIIlIlIIllIlIIII.toCharArray();
        int lllllllllllllllIlIIlIlIIllIIIlIl = lllllllllllllllIlIIlIlIIllIIIllI.length;
        int lllllllllllllllIlIIlIlIIllIIIlII = llIIllIlIIll[1];
        while (H.lllllllIIIlIII(lllllllllllllllIlIIlIlIIllIIIlII, lllllllllllllllIlIIlIlIIllIIIlIl)) {
            char lllllllllllllllIlIIlIlIIllIlIIIl = lllllllllllllllIlIIlIlIIllIIIllI[lllllllllllllllIlIIlIlIIllIIIlII];
            lllllllllllllllIlIIlIlIIllIIlllI.append((char)(lllllllllllllllIlIIlIlIIllIlIIIl ^ lllllllllllllllIlIIlIlIIllIIllIl[lllllllllllllllIlIIlIlIIllIIllII % lllllllllllllllIlIIlIlIIllIIllIl.length]));
            "".length();
            ++lllllllllllllllIlIIlIlIIllIIllII;
            ++lllllllllllllllIlIIlIlIIllIIIlII;
            "".length();
            if ("  ".length() != ((0x48 ^ 0x46 ^ (0x82 ^ 0x87)) & (0x78 ^ 0x63 ^ (0x14 ^ 4) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIlIIllIIlllI);
    }
}

