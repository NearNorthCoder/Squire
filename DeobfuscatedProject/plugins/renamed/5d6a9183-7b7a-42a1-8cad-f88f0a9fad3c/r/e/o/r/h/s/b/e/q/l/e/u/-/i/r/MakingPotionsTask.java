/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package r.e.o.r.h.s.b.e.q.l.e.u.-.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.SquireHerblore;
import java.util.Iterator;
import net.runelite.api.Item;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.a_Unknown;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.HerbType;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.HerbType;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.d_Unknown;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.PotionType;

/* TASK: Making potions -> MakePotionsTask */
@TaskDesc(name="Making potions", register=true)
public class MakingPotionsTask
extends d_Unknown {
    private /* synthetic */ int q;
    private /* synthetic */ c e;
    private /* synthetic */ b f;
    private /* synthetic */ int r;
    private /* synthetic */ e g;
    private static /* synthetic */ int[] lllIlIIIlIII;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var6;
        if (i.lIIIlIlllIIlllI(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (i.lIIIlIlllIIllll(var6.getActor().getAnimation(), lllIlIIIlIII[7])) {
            i var8;
            var8.q = var8.r;
        }
    }

    private static boolean lIIIlIlllIIllII(Object object) {
        return object == null;
    }

    @Inject
    public i(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig) {
        c[] cArray = new c[lllIlIIIlIII[0]];
        cArray[i.lllIlIIIlIII[1]] = c.MAKE_UNF_POTS;
        cArray[i.lllIlIIIlIII[2]] = c.FINISH_POTS;
        cArray[i.lllIlIIIlIII[3]] = c.ALL_STAGES;
        cArray[i.lllIlIIIlIII[4]] = c.ALL_STAGES_ALL_HERBS;
        super(squireHerblore, herbloreConfig, cArray);
        this.f = herbloreConfig.herb();
        this.g = herbloreConfig.potion();
    }

    @Override
    public boolean h() {
        i var5;
        if (i.lIIIlIlllIIIIll(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.q = this.r;
            return lllIlIIIlIII[2];
        }
        if (i.lIIIlIlllIIIlII(var5.r - var5.q, lllIlIIIlIII[5])) {
            boolean bl;
            if (i.lIIIlIlllIIIllI(var5.r, var5.q)) {
                bl = lllIlIIIlIII[2];
                0;
                if (3 < 0) {
                    return ((0x7E ^ 0x24 ^ (0xDF ^ 0x9D)) & (0x2F ^ 0x14 ^ (0x2F ^ 0xC) ^ -1)) != 0;
                }
            } else {
                bl = lllIlIIIlIII[1];
            }
            return bl;
        }
        return this.v();
    }

    static {
        i.lIIIlIlllIIIIlI();
    }

    private static boolean lIIIlIlllIIIllI(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIIlIlllIIllll(int n, int n2) {
        return n != n2;
    }

    private static boolean lIIIlIlllIIIlII(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIIlIlllIIllIl(Object object) {
        return object != null;
    }

    private static boolean lIIIlIlllIIlllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIlIlllIIlIll(Object object, Object object2) {
        return object == object2;
    }

    private static void lIIIlIlllIIIIlI() {
        lllIlIIIlIII = new int[8];
        i.lllIlIIIlIII[0] = 101 + 147 - 179 + 102 ^ 30 + 25 - 22 + 142;
        i.lllIlIIIlIII[1] = (0x64 ^ 0x3D) & ~(0x16 ^ 0x4F);
        i.lllIlIIIlIII[2] = 1;
        i.lllIlIIIlIII[3] = 2;
        i.lllIlIIIlIII[4] = 3;
        i.lllIlIIIlIII[5] = 3 ^ (8 ^ 0xD);
        i.lllIlIIIlIII[6] = 139 + 121 - 146 + 113;
        i.lllIlIIIlIII[7] = -1;
    }

    private boolean v() {
        Item var2;
        Item var9;
        i var3;
        Item item = null;
        Item item3 = null;
        if (i.lIIIlIlllIIlIll((Object)this.e, (Object)c.MAKE_UNF_POTS)) {
            int[] nArray = new int[lllIlIIIlIII[2]];
            nArray[i.lllIlIIIlIII[1]] = this.f.f();
            item = Inventory.getFirst((int[])nArray);
            int[] nArray2 = new int[lllIlIIIlIII[2]];
            nArray2[i.lllIlIIIlIII[1]] = lllIlIIIlIII[6];
            item3 = Inventory.getFirst((int[])nArray2);
            0;
            
            }
        } else if (i.lIIIlIlllIIlIll((Object)var3.e, (Object)c.FINISH_POTS)) {
            Iterator<Integer> var7 = var3.g.n().keySet().iterator();
            while (i.lIIIlIlllIIIIll(var7.hasNext() ? 1 : 0)) {
                Integer var4 = var7.next();
                b var1 = b.a(var4);
                if (i.lIIIlIlllIIllII((Object)var1)) {
                    0;
                    if (1 <= 2) continue;
                    return ((116 + 78 - 89 + 96 ^ 117 + 77 - 144 + 103) & (0x42 ^ 8 ^ (0x2B ^ 0x31) ^ -1)) != 0;
                }
                int[] nArray = new int[lllIlIIIlIII[3]];
                nArray[i.lllIlIIIlIII[1]] = var1.f();
                nArray[i.lllIlIIIlIII[2]] = var1.g();
                var9 = Inventory.getFirst((int[])nArray);
                0;
                if ((0x65 ^ 0x16 ^ (0xB6 ^ 0xC1)) > 1) continue;
                return false;
            }
            if (i.lIIIlIlllIIllII(var9)) {
                int[] nArray = new int[lllIlIIIlIII[2]];
                nArray[i.lllIlIIIlIII[1]] = var3.g.n().keySet().stream().findAny().orElse(lllIlIIIlIII[7]);
                var9 = Inventory.getFirst((int[])nArray);
            }
            if (i.lIIIlIlllIIllII(var7 = var9)) {
                return lllIlIIIlIII[1];
            }
            var2 = Inventory.getFirst(item2 -> this.g.n().keySet().stream().filter(n -> {
                boolean bl;
                if (i.lIIIlIlllIIllll(n, var7.getId())) {
                    bl = lllIlIIIlIII[2];
                    0;
                    if (((39 + 9 - -2 + 111 ^ 134 + 48 - 169 + 162) & (0x3C ^ 0x34 ^ (0x9E ^ 0x98) ^ -1)) != (((0xA8 ^ 0xA3) & ~(0x1D ^ 0x16) ^ (0xDA ^ 0x82)) & (0xE0 ^ 0xBF ^ (0xC1 ^ 0xC6) ^ -1))) {
                        return false;
                    }
                } else {
                    bl = lllIlIIIlIII[1];
                }
                return bl;
            }).anyMatch(n -> {
                boolean bl;
                if (i.lIIIlIlllIIIllI(n, item2.getId())) {
                    bl = lllIlIIIlIII[2];
                    0;
                    
                    }
                } else {
                    bl = lllIlIIIlIII[1];
                }
                return bl;
            }));
        }
        if (!i.lIIIlIlllIIllIl(var9) || i.lIIIlIlllIIllII(var2)) {
            return lllIlIIIlIII[1];
        }
        item.useOn(item3);
        return lllIlIIIlIII[2];
    }

    private static boolean lIIIlIlllIIIIll(int n) {
        return n != 0;
    }

    @Subscribe
    public void a(a a2) {
        this.e = a2.b();
        this.g = a2.d();
        this.f = a2.c();
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.r += lllIlIIIlIII[2];
    }
}

