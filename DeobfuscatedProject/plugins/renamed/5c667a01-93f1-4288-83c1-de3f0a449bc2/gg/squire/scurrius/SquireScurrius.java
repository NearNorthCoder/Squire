/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.account.LocalPlayer
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package gg.squire.scurrius;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.scurrius.SquireScurriusConfig;
import gg.squire.scurrius.overlay.SquireScurriusBox;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b_Unknown;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d_Unknown;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.e_Unknown;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.TogglingRunTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.StaminaHandlerTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.RestoringPrayerAtArdougneMonasteryTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.WalkingToTheBankTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.PathingToBossTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.WithdrawingItemsTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.AttackBossTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.DodgingRockfallTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.DrinkingBoostTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.DrinkingPrayerTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.EatingFoodTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.HandlingSpecAndGearTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.HighAlchingLootTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.KillingGiantRatsTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.LootingAndBuryingBonesTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.LootingTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.PrayerFlickingTask;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.UsingThrallTask;

@PluginDescriptor(name="Squire Scurrius", description="Squire Scurrius", enabledByDefault=false, tags={"Scurrius", "rat", "king", "combat"})
public class SquireScurrius
extends SquirePlugin {
    @Inject
    private /* synthetic */ SquireScurriusConfig s;
    @Inject
    private /* synthetic */ EventBus o;
    /* synthetic */ boolean n;
    /* synthetic */ int m;
    @Inject
    private /* synthetic */ b c;
    /* synthetic */ boolean l;
    /* synthetic */ List<WorldPoint> j;
    @Inject
    private /* synthetic */ SquireScurriusBox q;
    private static /* synthetic */ int[] lIIlIllIlllIl;
    private final /* synthetic */ HashSet<Prayer> h;
    /* synthetic */ boolean k;
    /* synthetic */ boolean i;
    @Inject
    private /* synthetic */ OverlayManager p;
    @Inject
    private /* synthetic */ e r;

    public List<WorldPoint> i() {
        return this.j;
    }

    public boolean k() {
        return this.l;
    }

    public boolean m() {
        return this.n;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIlIllIlllIl[2]];
        classArray[SquireScurrius.lIIlIllIlllIl[1]] = h.class;
        classArray[SquireScurrius.lIIlIllIlllIl[0]] = j.class;
        classArray[SquireScurrius.lIIlIllIlllIl[3]] = k.class;
        classArray[SquireScurrius.lIIlIllIlllIl[4]] = l.class;
        classArray[SquireScurrius.lIIlIllIlllIl[5]] = k.class;
        classArray[SquireScurrius.lIIlIllIlllIl[6]] = r.class;
        classArray[SquireScurrius.lIIlIllIlllIl[7]] = m.class;
        classArray[SquireScurrius.lIIlIllIlllIl[8]] = x.class;
        classArray[SquireScurrius.lIIlIllIlllIl[9]] = t.class;
        classArray[SquireScurrius.lIIlIllIlllIl[10]] = n.class;
        classArray[SquireScurrius.lIIlIllIlllIl[11]] = w.class;
        classArray[SquireScurrius.lIIlIllIlllIl[12]] = q.class;
        classArray[SquireScurrius.lIIlIllIlllIl[13]] = s.class;
        classArray[SquireScurrius.lIIlIllIlllIl[14]] = v.class;
        classArray[SquireScurrius.lIIlIllIlllIl[15]] = u.class;
        classArray[SquireScurrius.lIIlIllIlllIl[16]] = g.class;
        classArray[SquireScurrius.lIIlIllIlllIl[17]] = o.class;
        classArray[SquireScurrius.lIIlIllIlllIl[18]] = p.class;
        classArray[SquireScurrius.lIIlIllIlllIl[19]] = f.class;
        return classArray;
    }

    public void c(List<WorldPoint> list) {
        this.j.addAll(list);
        0;
    }

    public void b(boolean bl) {
        this.i = bl;
    }

    public boolean c() {
        if (SquireScurrius.lIlIllIlIlllIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIIlIllIlllIl[0];
        }
        if (SquireScurrius.lIlIllIlIlllIll(d.F.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIIlIllIlllIl[0];
        }
        return lIIlIllIlllIl[1];
    }

    @Provides
    SquireScurriusConfig a(ConfigManager configManager) {
        return (SquireScurriusConfig)configManager.getConfig(SquireScurriusConfig.class);
    }

    public void d() {
        this.j.clear();
    }

    private static boolean lIlIllIlIlllIll(int n2) {
        return n2 != 0;
    }

    protected void onStop() {
        this.o.unregister((Object)this.c);
        this.p.remove((Overlay)this.q);
        0;
        this.p.remove((Overlay)this.r);
        0;
    }

    private static void lIlIllIlIlllIlI() {
        lIIlIllIlllIl = new int[20];
        SquireScurrius.lIIlIllIlllIl[0] = 1;
        SquireScurrius.lIIlIllIlllIl[1] = (65 + 78 - 4 + 45 ^ 92 + 24 - 97 + 113) & (145 + 105 - 145 + 66 ^ 40 + 50 - 26 + 87 ^ -1);
        SquireScurrius.lIIlIllIlllIl[2] = 0xA5 ^ 0xB6;
        SquireScurrius.lIIlIllIlllIl[3] = 2;
        SquireScurrius.lIIlIllIlllIl[4] = 3;
        SquireScurrius.lIIlIllIlllIl[5] = 0x8A ^ 0x8E;
        SquireScurrius.lIIlIllIlllIl[6] = 0x36 ^ 0x33;
        SquireScurrius.lIIlIllIlllIl[7] = 0xE4 ^ 0x9F ^ (0x64 ^ 0x19);
        SquireScurrius.lIIlIllIlllIl[8] = 0x98 ^ 0x9F;
        SquireScurrius.lIIlIllIlllIl[9] = 0x5D ^ 0x55;
        SquireScurrius.lIIlIllIlllIl[10] = 0x6F ^ 0x39 ^ (0x5C ^ 3);
        SquireScurrius.lIIlIllIlllIl[11] = 3 + 139 - 39 + 76 ^ 163 + 114 - 218 + 126;
        SquireScurrius.lIIlIllIlllIl[12] = 121 + 52 - 42 + 17 ^ 98 + 125 - 203 + 139;
        SquireScurrius.lIIlIllIlllIl[13] = 144 + 28 - 149 + 122 ^ 5 + 118 - 47 + 81;
        SquireScurrius.lIIlIllIlllIl[14] = 94 + 108 - 174 + 132 ^ 157 + 146 - 165 + 35;
        SquireScurrius.lIIlIllIlllIl[15] = 0x5B ^ 0x55;
        SquireScurrius.lIIlIllIlllIl[16] = 16 + 1 - -22 + 135 ^ 13 + 15 - -107 + 26;
        SquireScurrius.lIIlIllIlllIl[17] = 95 + 155 - 128 + 35 ^ 40 + 105 - 73 + 69;
        SquireScurrius.lIIlIllIlllIl[18] = 78 + 103 - 90 + 76 ^ 65 + 134 - 87 + 70;
        SquireScurrius.lIIlIllIlllIl[19] = 68 + 23 - 27 + 114 ^ 27 + 84 - 44 + 93;
    }

    public void e(boolean bl) {
        this.n = bl;
    }

    public void d(boolean bl) {
        this.l = bl;
    }

    public HashSet<Prayer> g() {
        return this.h;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
    }

    public void d(List<WorldPoint> list) {
        list.forEach(worldPoint -> {
            if (SquireScurrius.lIlIllIlIlllIll(this.j.contains(worldPoint) ? 1 : 0)) {
                this.j.remove(worldPoint);
                0;
            }
        });
    }

    protected void onStart() {
        this.o.register((Object)this.c);
        this.c.o();
        this.p.add((Overlay)this.q);
        0;
        this.p.add((Overlay)this.r);
        0;
        this.m = lIIlIllIlllIl[1];
        this.n = this.s.bankOnStart();
        this.d(lIIlIllIlllIl[1]);
    }

    public void a(WorldArea worldArea) {
        this.j.addAll(worldArea.toWorldPointList());
        0;
    }

    static {
        SquireScurrius.lIlIllIlIlllIlI();
    }

    public boolean j() {
        return this.k;
    }

    public void e() {
        this.m += lIIlIllIlllIl[0];
    }

    public boolean f() {
        boolean bl;
        if (!SquireScurrius.lIlIllIlIllllII(LocalPlayer.getAccountType().isIronman() ? 1 : 0) || SquireScurrius.lIlIllIlIlllIll(LocalPlayer.getAccountType().isGroupIronman() ? 1 : 0)) {
            bl = lIIlIllIlllIl[0];
            0;
            if (-(40 + 31 - -24 + 66 ^ 102 + 163 - 195 + 94) >= 0) {
                return ((0x4D ^ 0x26 ^ (0x4D ^ 0x2A)) & (5 + 90 - 42 + 134 ^ 95 + 130 - 175 + 133 ^ -1)) != 0;
            }
        } else {
            bl = lIIlIllIlllIl[1];
        }
        return bl;
    }

    public boolean h() {
        return this.i;
    }

    public void c(boolean bl) {
        this.k = bl;
    }

    private static boolean lIlIllIlIllllII(int n2) {
        return n2 == 0;
    }

    public void b(WorldArea worldArea) {
        worldArea.toWorldPointList().forEach(worldPoint -> {
            if (SquireScurrius.lIlIllIlIlllIll(this.j.contains(worldPoint) ? 1 : 0)) {
                this.j.remove(worldPoint);
                0;
            }
        });
    }

    public int l() {
        return this.m;
    }

    public void b(List<WorldArea> list) {
        Iterator<WorldArea> var2 = list.iterator();
        while (SquireScurrius.lIlIllIlIlllIll(var2.hasNext() ? 1 : 0)) {
            SquireScurrius var1;
            WorldArea var5 = var2.next();
            var1.j.addAll(var5.toWorldPointList());
            0;
            0;
            if (3 >= 3) continue;
            return;
        }
    }

    public b n() {
        return this.c;
    }

    public SquireScurrius() {
        this.h = new HashSet();
        this.i = lIIlIllIlllIl[0];
        this.j = new ArrayList<WorldPoint>();
        this.n = lIIlIllIlllIl[1];
    }

    public void a(List<WorldArea> list) {
        this.j.clear();
        Iterator<WorldArea> var4 = list.iterator();
        while (SquireScurrius.lIlIllIlIlllIll(var4.hasNext() ? 1 : 0)) {
            SquireScurrius var6;
            WorldArea var3 = var4.next();
            var6.j.addAll(var3.toWorldPointList());
            0;
            0;
            if (3 != 0) continue;
            return;
        }
    }

    public void a(int n2) {
        this.m = n2;
    }
}

