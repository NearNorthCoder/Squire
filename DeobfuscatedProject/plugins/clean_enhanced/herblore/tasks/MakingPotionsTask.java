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
package gg.squire.herblore.tasks;

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
import gg.squire.herblore.tasks.AHelper;
import gg.squire.herblore.tasks.GameEnum;
import gg.squire.herblore.tasks.GameEnum2;
import gg.squire.herblore.tasks.HerbloreTaskBase;
import gg.squire.herblore.tasks.GameEnum3;

@TaskDesc(name="Making potions", register=true)
public class MakingPotionsTask
extends HerbloreTaskBase {
    private  int q;
    private  c e;
    private  b f;
    private  int r;
    private  e g;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var2;
        if (i.var3(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (i.var4(var2.getActor().getAnimation(), var1[7])) {
            i var5;
            var5.q = var5.r;
        }
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    @Inject
    public MakingPotionsTask(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig) {
        c[] cArray = new c[var1[0]];
        cArray[i.var1[1]] = c.MAKE_UNF_POTS;
        cArray[i.var1[2]] = c.FINISH_POTS;
        cArray[i.var1[3]] = c.ALL_STAGES;
        cArray[i.var1[4]] = c.ALL_STAGES_ALL_HERBS;
        super(squireHerblore, herbloreConfig, cArray);
        this.f = herbloreConfig.herb();
        this.g = herbloreConfig.potion();
    }

    @Override
    public boolean h() {
        i var7;
        if (i.var8(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.q = this.r;
            return var1[2];
        }
        if (i.var9(var7.r - var7.q, var1[5])) {
            boolean bl;
            if (i.var10(var7.r, var7.q)) {
                bl = var1[2];
                0;
                if (3 < 0) {
                    return ((0x7E ^ 0x24 ^ (0xDF ^ 0x9D)) & (0x2F ^ 0x14 ^ (0x2F ^ 0xC) ^ -1)) != 0;
                }
            } else {
                bl = var1[1];
            }
            return bl;
        }
        return this.v();
    }

    static {
        i.var11();
    }

    private static boolean var10(int n, int n2) {
        return n == n2;
    }

    private static boolean var4(int n, int n2) {
        return n != n2;
    }

    private static boolean var9(int n, int n2) {
        return n < n2;
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var13(Object object, Object object2) {
        return object == object2;
    }

    private static void var11() {
        var1 = new int[8];
        i.var1[0] = 101 + 147 - 179 + 102 ^ 30 + 25 - 22 + 142;
        i.var1[1] = (0x64 ^ 0x3D) & ~(0x16 ^ 0x4F);
        i.var1[2] = 1;
        i.var1[3] = 2;
        i.var1[4] = 3;
        i.var1[5] = 3 ^ (8 ^ 0xD);
        i.var1[6] = 139 + 121 - 146 + 113;
        i.var1[7] = -1;
    }

    private boolean v() {
        Item var14;
        Item var15;
        i var16;
        Item item = null;
        Item item3 = null;
        if (i.var13((Object)this.e, (Object)c.MAKE_UNF_POTS)) {
            int[] nArray = new int[var1[2]];
            nArray[i.var1[1]] = this.f.f();
            item = Inventory.getFirst((int[])nArray);
            int[] nArray2 = new int[var1[2]];
            nArray2[i.var1[1]] = var1[6];
            item3 = Inventory.getFirst((int[])nArray2);
            0;
            if null != null {
                return ((0x87 ^ 0xA0) & ~(0x5D ^ 0x7A)) != 0;
            }
        } else if (i.var13((Object)var16.e, (Object)c.FINISH_POTS)) {
            Iterator<Integer> var17 = var16.g.n().keySet().iterator();
            while (i.var8(var17.hasNext() ? 1 : 0)) {
                Integer var18 = var17.next();
                b var19 = b.a(var18);
                if (i.var6((Object)var19)) {
                    0;
                    if (1 <= 2) continue;
                    return ((116 + 78 - 89 + 96 ^ 117 + 77 - 144 + 103) & (0x42 ^ 8 ^ (0x2B ^ 0x31) ^ -1)) != 0;
                }
                int[] nArray = new int[var1[3]];
                nArray[i.var1[1]] = var19.f();
                nArray[i.var1[2]] = var19.g();
                var15 = Inventory.getFirst((int[])nArray);
                0;
                if ((0x65 ^ 0x16 ^ (0xB6 ^ 0xC1)) > 1) continue;
                return ((25 + 96 - 31 + 137 ^ 63 + 115 - 104 + 100) & (10 + 20 - -152 + 12 ^ 13 + 96 - 50 + 84 ^ -1)) != 0;
            }
            if (i.var6(var15)) {
                int[] nArray = new int[var1[2]];
                nArray[i.var1[1]] = var16.g.n().keySet().stream().findAny().orElse(var1[7]);
                var15 = Inventory.getFirst((int[])nArray);
            }
            if (i.var6(var17 = var15)) {
                return var1[1];
            }
            var14 = Inventory.getFirst(item2 -> this.g.n().keySet().stream().filter(n -> {
                boolean bl;
                if (i.var4(n, var17.getId())) {
                    bl = var1[2];
                    0;
                    if (((39 + 9 - -2 + 111 ^ 134 + 48 - 169 + 162) & (0x3C ^ 0x34 ^ (0x9E ^ 0x98) ^ -1)) != (((0xA8 ^ 0xA3) & ~(0x1D ^ 0x16) ^ (0xDA ^ 0x82)) & (0xE0 ^ 0xBF ^ (0xC1 ^ 0xC6) ^ -1))) {
                        return ((209 + 85 - 247 + 206 ^ 120 + 50 - 88 + 114) & (19 + 88 - -20 + 26 ^ 74 + 83 - 88 + 91 ^ -1)) != 0;
                    }
                } else {
                    bl = var1[1];
                }
                return bl;
            }).anyMatch(n -> {
                boolean bl;
                if (i.var10(n, item2.getId())) {
                    bl = var1[2];
                    0;
                    if null != null {
                        return ((241 + 106 - 279 + 180 ^ 106 + 155 - 222 + 127) & (0x3F ^ 0x13 ^ (0x2A ^ 0x58) ^ -1)) != 0;
                    }
                } else {
                    bl = var1[1];
                }
                return bl;
            }));
        }
        if (!i.var12(var15) || i.var6(var14)) {
            return var1[1];
        }
        item.useOn(item3);
        return var1[2];
    }

    private static boolean var8(int n) {
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
        this.r += var1[2];
    }
}

