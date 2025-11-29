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
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Comparator;
import java.util.Optional;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GameEnum18;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Exploring further", priority=1)
public class ExploringFurtherTask
extends GauntletTaskBase {

    private static boolean lllllllIIIIlII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllllllIIIIIlI(Object object) {
        return object != null;
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
        H.llIIllIlIIlI[H.llIIllIlIIll[1]] = "Activate";
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
        void var1;
        g var2;
        int var3;
        int n2;
        H var4;
        Player player = Players.getLocal();
        if (H.lllllllIIIIIlI(player.getInteracting())) {
            return llIIllIlIIll[1];
        }
        h var5 = var4.ba.V();
        if (H.lllllllIIIIIll(var5)) {
            return llIIllIlIIll[1];
        }
        if (H.lllllllIIIIlII((Object)var4.ba.W(), (Object)d.EXTRA_FOOD_EXPLORE)) {
            n2 = llIIllIlIIll[2];

            }
        } else {
            n2 = var3 = llIIllIlIIll[1];
        }
        if (H.lllllllIIIIIlI((Object)(var2 = var4.ba.J())) && H.lllllllIIIIlIl(var2.an().aC()) && H.lllllllIIIIlIl(var3)) {
            return llIIllIlIIll[1];
        }
        if (H.lllllllIIIIllI(var4.ba.N() ? 1 : 0)) {
            return llIIllIlIIll[1];
        }
        if (H.lllllllIIIIllI(var4.ba.O() ? 1 : 0)) {
            return llIIllIlIIll[1];
        }
        Optional<l> var6 = var5.b(l2 -> {
            int n2;
            if (H.lllllllIIIIlIl(l2.aY() ? 1 : 0) && H.lllllllIIIIlIl(l2.aS() ? 1 : 0)) {
                n2 = llIIllIlIIll[2];

                if (3 <= ((0x10 ^ 0x38) & ~(0x1F ^ 0x37))) {
                    return false;
                }
            } else {
                n2 = llIIllIlIIll[1];
            }
            return n2 != 0;
        }).stream().min(Comparator.comparing(l::aU));
        if (H.lllllllIIIIllI(var6.isEmpty() ? 1 : 0) && H.lllllllIIIIllI((var6 = var5.b(l2 -> {
            boolean bl;
            if (H.lllllllIIIIlIl(l2.aY() ? 1 : 0)) {
                bl = llIIllIlIIll[2];

                if (((0x13 ^ 0x5F) & ~(0x7E ^ 0x32)) > 0) {
                    return (2 & ~2) != 0;
                }
            } else {
                bl = llIIllIlIIll[1];
            }
            return bl;
        }).stream().min(Comparator.comparing(l::aU))).isEmpty() ? 1 : 0)) {
            WorldPoint lllllllllllllllIlIIlIlIIllIlllll2;
            m var7 = var4.ba.V().av();
            if (H.lllllllIIIIllI(var7.e(lllllllllllllllIlIIlIlIIllIlllll2 = var1.getWorldLocation()) ? 1 : 0)) {
                var4.ba.a(d.PREPARE_BOSS_FIGHT);

                if ((8 ^ 0x49 ^ (0xE5 ^ 0xA0)) <= 0) {
                    return ((0x52 ^ 0x17 ^ (0xED ^ 0xB3)) & (0x41 ^ 0x4F ^ (0xD ^ 0x18) ^ -1)) != 0;
                }
            } else {
                var4.ba.a((l)var7, lllllllllllllllIlIIlIlIIllIlllll2);

            }
            return llIIllIlIIll[2];
        }
        l var7 = var6.get();
        if (H.lllllllIIIIlll(H.lllllllIIIIIIl(var7.aQ().distanceToHypotenuse(var1.getWorldLocation()) - var7.aQ().distanceToHypotenuse(var5.av().aQ()), 32.0f)) && H.lllllllIIIIIlI(lllllllllllllllIlIIlIlIIllIlllll2 = Inventory.getFirst(item -> e.ab.contains(item.getId())))) {
            lllllllllllllllIlIIlIlIIllIlllll2.interact(llIIllIlIIlI[llIIllIlIIll[1]]);
            return llIIllIlIIll[2];
        }
        return this.ba.a((l)var6_7, player.getWorldLocation());
    }

    @Inject
    public ExploringFurtherTask(c c2) {
        d[] dArray = new d[llIIllIlIIll[0]];
        dArray[H.llIIllIlIIll[1]] = d.DEMI_BOSS_EXPLORE;
        dArray[H.llIIllIlIIll[2]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
    }

    private static int lllllllIIIIIIl(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

        return String.valueOf(var8);
    }
}

