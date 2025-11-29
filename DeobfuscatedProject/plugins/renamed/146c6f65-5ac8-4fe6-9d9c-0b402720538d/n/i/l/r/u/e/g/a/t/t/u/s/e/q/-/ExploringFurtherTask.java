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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.GEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

/* TASK: Exploring further -> ExploringfurtherTask */
@TaskDesc(name="Exploring further", priority=1)
public class ExploringFurtherTask
extends n_Unknown {
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
        H.llIIllIlIIll[0] = 2;
        H.llIIllIlIIll[1] = (0xA ^ 0x7A ^ (0x74 ^ 0x51)) & (0x15 ^ 0x18 ^ (0x1A ^ 0x42) ^ -1);
        H.llIIllIlIIll[2] = 1;
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
        H.llIIllIlIIlI[H.llIIllIlIIll[1]] = H."Activate";
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
        void var6;
        g var10;
        int var11;
        int n2;
        H var13;
        Player player = Players.getLocal();
        if (H.lllllllIIIIIlI(player.getInteracting())) {
            return llIIllIlIIll[1];
        }
        h var3 = var13.ba.V();
        if (H.lllllllIIIIIll(var3)) {
            return llIIllIlIIll[1];
        }
        if (H.lllllllIIIIlII((Object)var13.ba.W(), (Object)d.EXTRA_FOOD_EXPLORE)) {
            n2 = llIIllIlIIll[2];
            0;
            
            }
        } else {
            n2 = var11 = llIIllIlIIll[1];
        }
        if (H.lllllllIIIIIlI((Object)(var10 = var13.ba.J())) && H.lllllllIIIIlIl(var10.an().aC()) && H.lllllllIIIIlIl(var11)) {
            return llIIllIlIIll[1];
        }
        if (H.lllllllIIIIllI(var13.ba.N() ? 1 : 0)) {
            return llIIllIlIIll[1];
        }
        if (H.lllllllIIIIllI(var13.ba.O() ? 1 : 0)) {
            return llIIllIlIIll[1];
        }
        Optional<l> var12 = var3.b(l2 -> {
            int n2;
            if (H.lllllllIIIIlIl(l2.aY() ? 1 : 0) && H.lllllllIIIIlIl(l2.aS() ? 1 : 0)) {
                n2 = llIIllIlIIll[2];
                0;
                if (3 <= ((0x10 ^ 0x38) & ~(0x1F ^ 0x37))) {
                    return false;
                }
            } else {
                n2 = llIIllIlIIll[1];
            }
            return n2 != 0;
        }).stream().min(Comparator.comparing(l::aU));
        if (H.lllllllIIIIllI(var12.isEmpty() ? 1 : 0) && H.lllllllIIIIllI((var12 = var3.b(l2 -> {
            boolean bl;
            if (H.lllllllIIIIlIl(l2.aY() ? 1 : 0)) {
                bl = llIIllIlIIll[2];
                0;
                if (((0x13 ^ 0x5F) & ~(0x7E ^ 0x32)) > 0) {
                    return (2 & ~2) != 0;
                }
            } else {
                bl = llIIllIlIIll[1];
            }
            return bl;
        }).stream().min(Comparator.comparing(l::aU))).isEmpty() ? 1 : 0)) {
            WorldPoint lllllllllllllllIlIIlIlIIllIlllll2;
            m var7 = var13.ba.V().av();
            if (H.lllllllIIIIllI(var7.e(lllllllllllllllIlIIlIlIIllIlllll2 = var6.getWorldLocation()) ? 1 : 0)) {
                var13.ba.a(d.PREPARE_BOSS_FIGHT);
                0;
                if ((8 ^ 0x49 ^ (0xE5 ^ 0xA0)) <= 0) {
                    return ((0x52 ^ 0x17 ^ (0xED ^ 0xB3)) & (0x41 ^ 0x4F ^ (0xD ^ 0x18) ^ -1)) != 0;
                }
            } else {
                var13.ba.a((l)var7, lllllllllllllllIlIIlIlIIllIlllll2);
                0;
            }
            return llIIllIlIIll[2];
        }
        l var7 = var12.get();
        if (H.lllllllIIIIlll(H.lllllllIIIIIIl(var7.aQ().distanceToHypotenuse(var6.getWorldLocation()) - var7.aQ().distanceToHypotenuse(var3.av().aQ()), 32.0f)) && H.lllllllIIIIIlI(lllllllllllllllIlIIlIlIIllIlllll2 = Inventory.getFirst(item -> e.ab.contains(item.getId())))) {
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

    private static String llllllIllllllI(String var16, String var5) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var2 = var5.toCharArray();
        int var9 = llIIllIlIIll[1];
        char[] var1 = var16.toCharArray();
        int var15 = var1.length;
        int var4 = llIIllIlIIll[1];
        while (H.lllllllIIIlIII(var4, var15)) {
            char var8 = var1[var4];
            var14.append((char)(var8 ^ var2[var9 % var2.length]));
            0;
            ++var9;
            ++var4;
            0;
            if (2 != ((0x48 ^ 0x46 ^ (0x82 ^ 0x87)) & (0x78 ^ 0x63 ^ (0x14 ^ 4) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var14);
    }
}

