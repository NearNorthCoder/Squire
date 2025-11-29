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
import gg.squire.scurrius.ScurriusManager;
import gg.squire.scurrius.ScurriusManager;
import gg.squire.scurrius.EHelper;
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
        Class[] classArray = new Class[var1[2]];
        classArray[SquireScurrius.var1[1]] = RestoringPrayerAtArdougneMonasteryTask.class;
        classArray[SquireScurrius.var1[0]] = WalkingToTheBankTask.class;
        classArray[SquireScurrius.var1[3]] = PathingToBossTask.class;
        classArray[SquireScurrius.var1[4]] = WithdrawingItemsTask.class;
        classArray[SquireScurrius.var1[5]] = PathingToBossTask.class;
        classArray[SquireScurrius.var1[6]] = HandlingSpecAndGearTask.class;
        classArray[SquireScurrius.var1[7]] = AttackBossTask.class;
        classArray[SquireScurrius.var1[8]] = UsingThrallTask.class;
        classArray[SquireScurrius.var1[9]] = KillingGiantRatsTask.class;
        classArray[SquireScurrius.var1[10]] = DodgingRockfallTask.class;
        classArray[SquireScurrius.var1[11]] = PrayerFlickingTask.class;
        classArray[SquireScurrius.var1[12]] = EatingFoodTask.class;
        classArray[SquireScurrius.var1[13]] = HighAlchingLootTask.class;
        classArray[SquireScurrius.var1[14]] = LootingTask.class;
        classArray[SquireScurrius.var1[15]] = LootingAndBuryingBonesTask.class;
        classArray[SquireScurrius.var1[16]] = StaminaHandlerTask.class;
        classArray[SquireScurrius.var1[17]] = DrinkingBoostTask.class;
        classArray[SquireScurrius.var1[18]] = DrinkingPrayerTask.class;
        classArray[SquireScurrius.var1[19]] = TogglingRunTask.class;
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
        if (SquireScurrius.var2(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        if (SquireScurrius.var2(d.F.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return var1[0];
        }
        return var1[1];
    }

    @Provides
    SquireScurriusConfig a(ConfigManager configManager) {
        return (SquireScurriusConfig)configManager.getConfig(SquireScurriusConfig.class);
    }

    public void d() {
        this.j.clear();
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    protected void onStop() {
        this.o.unregister((Object)this.c);
        this.p.remove((Overlay)this.q);
        0;
        this.p.remove((Overlay)this.r);
        0;
    }

    private static void var3() {
        var1 = new int[20];
        SquireScurrius.var1[0] = 1;
        SquireScurrius.var1[1] = (65 + 78 - 4 + 45 ^ 92 + 24 - 97 + 113) & (145 + 105 - 145 + 66 ^ 40 + 50 - 26 + 87 ^ -1);
        SquireScurrius.var1[2] = 0xA5 ^ 0xB6;
        SquireScurrius.var1[3] = 2;
        SquireScurrius.var1[4] = 3;
        SquireScurrius.var1[5] = 0x8A ^ 0x8E;
        SquireScurrius.var1[6] = 0x36 ^ 0x33;
        SquireScurrius.var1[7] = 0xE4 ^ 0x9F ^ (0x64 ^ 0x19);
        SquireScurrius.var1[8] = 0x98 ^ 0x9F;
        SquireScurrius.var1[9] = 0x5D ^ 0x55;
        SquireScurrius.var1[10] = 0x6F ^ 0x39 ^ (0x5C ^ 3);
        SquireScurrius.var1[11] = 3 + 139 - 39 + 76 ^ 163 + 114 - 218 + 126;
        SquireScurrius.var1[12] = 121 + 52 - 42 + 17 ^ 98 + 125 - 203 + 139;
        SquireScurrius.var1[13] = 144 + 28 - 149 + 122 ^ 5 + 118 - 47 + 81;
        SquireScurrius.var1[14] = 94 + 108 - 174 + 132 ^ 157 + 146 - 165 + 35;
        SquireScurrius.var1[15] = 0x5B ^ 0x55;
        SquireScurrius.var1[16] = 16 + 1 - -22 + 135 ^ 13 + 15 - -107 + 26;
        SquireScurrius.var1[17] = 95 + 155 - 128 + 35 ^ 40 + 105 - 73 + 69;
        SquireScurrius.var1[18] = 78 + 103 - 90 + 76 ^ 65 + 134 - 87 + 70;
        SquireScurrius.var1[19] = 68 + 23 - 27 + 114 ^ 27 + 84 - 44 + 93;
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
            if (SquireScurrius.var2(this.j.contains(worldPoint) ? 1 : 0)) {
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
        this.m = var1[1];
        this.n = this.s.bankOnStart();
        this.d(var1[1]);
    }

    public void a(WorldArea worldArea) {
        this.j.addAll(worldArea.toWorldPointList());
        0;
    }

    static {
        SquireScurrius.var3();
    }

    public boolean j() {
        return this.k;
    }

    public void e() {
        this.m += var1[0];
    }

    public boolean f() {
        boolean bl;
        if (!SquireScurrius.var4(LocalPlayer.getAccountType().isIronman() ? 1 : 0) || SquireScurrius.var2(LocalPlayer.getAccountType().isGroupIronman() ? 1 : 0)) {
            bl = var1[0];
            0;
            if (-(40 + 31 - -24 + 66 ^ 102 + 163 - 195 + 94) >= 0) {
                return ((0x4D ^ 0x26 ^ (0x4D ^ 0x2A)) & (5 + 90 - 42 + 134 ^ 95 + 130 - 175 + 133 ^ -1)) != 0;
            }
        } else {
            bl = var1[1];
        }
        return bl;
    }

    public boolean h() {
        return this.i;
    }

    public void c(boolean bl) {
        this.k = bl;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    public void b(WorldArea worldArea) {
        worldArea.toWorldPointList().forEach(worldPoint -> {
            if (SquireScurrius.var2(this.j.contains(worldPoint) ? 1 : 0)) {
                this.j.remove(worldPoint);
                0;
            }
        });
    }

    public int l() {
        return this.m;
    }

    public void b(List<WorldArea> list) {
        Iterator<WorldArea> var5 = list.iterator();
        while (SquireScurrius.var2(var5.hasNext() ? 1 : 0)) {
            SquireScurrius var6;
            WorldArea var7 = var5.next();
            var6.j.addAll(var7.toWorldPointList());
            0;
            0;
            
            return;
        }
    }

    public b n() {
        return this.c;
    }

    public SquireScurrius() {
        this.h = new HashSet();
        this.i = var1[0];
        this.j = new ArrayList<WorldPoint>();
        this.n = var1[1];
    }

    public void a(List<WorldArea> list) {
        this.j.clear();
        Iterator<WorldArea> var8 = list.iterator();
        while (SquireScurrius.var2(var8.hasNext() ? 1 : 0)) {
            SquireScurrius var9;
            WorldArea var10 = var8.next();
            var9.j.addAll(var10.toWorldPointList());
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

