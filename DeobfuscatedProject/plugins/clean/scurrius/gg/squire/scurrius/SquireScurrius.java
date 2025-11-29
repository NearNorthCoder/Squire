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
import gg.squire.scurrius.BHelper;
import gg.squire.scurrius.ScurriusManager;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.e;
import gg.squire.scurrius.TogglingRunTask;
import gg.squire.scurrius.StaminaHandlerTask;
import gg.squire.scurrius.RestoringPrayerAtArdougneMonasteryTask;
import gg.squire.scurrius.WalkingToTheBankTask;
import gg.squire.scurrius.PathingToBossTask;
import gg.squire.scurrius.WithdrawingItemsTask;
import gg.squire.scurrius.AttackBossTask;
import gg.squire.scurrius.DodgingRockfallTask;
import gg.squire.scurrius.DrinkingBoostTask;
import gg.squire.scurrius.DrinkingPrayerTask;
import gg.squire.scurrius.EatingFoodTask;
import gg.squire.scurrius.HandlingSpecAndGearTask;
import gg.squire.scurrius.HighAlchingLootTask;
import gg.squire.scurrius.KillingGiantRatsTask;
import gg.squire.scurrius.LootingAndBuryingBonesTask;
import gg.squire.scurrius.LootingTask;
import gg.squire.scurrius.PrayerFlickingTask;
import gg.squire.scurrius.UsingThrallTask;

@PluginDescriptor(name="Squire Scurrius", description="Squire Scurrius", enabledByDefault=false, tags={"Scurrius", "rat", "king", "combat"})
public class SquireScurrius
extends SquirePlugin {
    @Inject
    private  SquireScurriusConfig s;
    @Inject
    private  EventBus o;
     boolean n;
     int m;
    @Inject
    private  b c;
     boolean l;
     List<WorldPoint> j;
    @Inject
    private  SquireScurriusBox q;
    
    private final  HashSet<Prayer> h;
     boolean k;
     boolean i;
    @Inject
    private  OverlayManager p;
    @Inject
    private  e r;

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
        classArray[SquireScurrius.lIIlIllIlllIl[1]] = RestoringPrayerAtArdougneMonasteryTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[0]] = WalkingToTheBankTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[3]] = PathingToBossTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[4]] = WithdrawingItemsTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[5]] = PathingToBossTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[6]] = HandlingSpecAndGearTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[7]] = AttackBossTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[8]] = UsingThrallTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[9]] = KillingGiantRatsTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[10]] = DodgingRockfallTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[11]] = PrayerFlickingTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[12]] = EatingFoodTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[13]] = HighAlchingLootTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[14]] = LootingTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[15]] = LootingAndBuryingBonesTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[16]] = StaminaHandlerTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[17]] = DrinkingBoostTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[18]] = DrinkingPrayerTask.class;
        classArray[SquireScurrius.lIIlIllIlllIl[19]] = TogglingRunTask.class;
        return classArray;
    }

    public void c(List<WorldPoint> list) {
        this.j.addAll(list);

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

        this.p.remove((Overlay)this.r);

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

            }
        });
    }

    protected void onStart() {
        this.o.register((Object)this.c);
        this.c.o();
        this.p.add((Overlay)this.q);

        this.p.add((Overlay)this.r);

        this.m = lIIlIllIlllIl[1];
        this.n = this.s.bankOnStart();
        this.d(lIIlIllIlllIl[1]);
    }

    public void a(WorldArea worldArea) {
        this.j.addAll(worldArea.toWorldPointList());

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

            }
        });
    }

    public int l() {
        return this.m;
    }

    public void b(List<WorldArea> list) {
        Iterator<WorldArea> var1 = list.iterator();
        while (SquireScurrius.lIlIllIlIlllIll(var1.hasNext() ? 1 : 0)) {
            SquireScurrius var2;
            WorldArea var3 = var1.next();
            var2.j.addAll(var3.toWorldPointList());

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
            SquireScurrius var5;
            WorldArea var6 = var4.next();
            var5.j.addAll(var6.toWorldPointList());

            if (3 != 0) continue;
            return;
        }
    }

    public void a(int n2) {
        this.m = n2;
    }
}

