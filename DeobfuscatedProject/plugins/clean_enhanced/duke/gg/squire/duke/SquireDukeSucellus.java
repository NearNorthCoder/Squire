/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
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
 */
package gg.squire.duke;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.duke.SquireDukeSucellusConfig;
import gg.squire.duke.overlay.SquireDukeSucellusInfoBox;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import gg.squire.duke.PrayerFlickingTask;
import gg.squire.duke.SwappingSidesTask;
import gg.squire.duke.UsingThrallTask;
import gg.squire.duke.CollectPoisonTask;
import gg.squire.duke.CollectMuscaMushroomsTask;
import gg.squire.duke.DestroyingSpareIngredientsTask;
import gg.squire.duke.StartFightTask;
import gg.squire.duke.StartFightTask;
import gg.squire.duke.CollectArderMushroomTask;
import gg.squire.duke.DepositArderMushroomTask;
import gg.squire.duke.ExitArderAreaTask;
import gg.squire.duke.WalkToArderMushroomTask;
import gg.squire.duke.CollectMuscaMushroomTask;
import gg.squire.duke.DepositMuscaMushroomTask;
import gg.squire.duke.ExitMuscaAreaTask;
import gg.squire.duke.WalkToMuscaMushroomTask;
import gg.squire.duke.CollectSalaxSaltTask;
import gg.squire.duke.DepositSalaxSaltTask;
import gg.squire.duke.DukeManager;
import gg.squire.duke.FHelper;
import gg.squire.duke.IHelper;
import gg.squire.duke.DangerTileHandlerTask;
import gg.squire.duke.TogglingRunTask;
import gg.squire.duke.StaminaHandlerTask;
import gg.squire.duke.TestTask;
import gg.squire.duke.WalkingToTheBankTask;
import gg.squire.duke.PathingToBossTask;
import gg.squire.duke.WithdrawingItemsTask;
import gg.squire.duke.AttackDukeEastTask;
import gg.squire.duke.AttackDukeWestTask;
import gg.squire.duke.DodgeGazeTask;
import gg.squire.duke.DrinkingBoostTask;
import gg.squire.duke.DrinkingPrayerTask;
import gg.squire.duke.EatingFoodTask;
import gg.squire.duke.HandlingSpecAndGearTask;
import gg.squire.duke.LootingTask;
import gg.squire.duke.PostKillHandlerTask;
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

@PluginDescriptor(name="Squire Duke Sucellus", description="Squire Duke Sucellus", enabledByDefault=false, tags={"duke", "sucellus", "dt2"})
public class SquireDukeSucellus
extends SquirePlugin {
     boolean l;
    
    @Inject
    private  OverlayManager r;
    @Inject
    private  SquireDukeSucellusConfig v;
    private  List<f> p;
     int m;
     boolean k;
    private final  HashSet<Prayer> a;
    @Inject
    private  EventBus q;
     boolean n;
    private  InventorySetup o;
     WorldPoint e;
    @Inject
    private  i t;
     int b;
     boolean c;
     WorldPoint f;
    @Inject
    private  a u;
     List<WorldPoint> d;
     boolean j;
     List<WorldPoint> g;
     boolean i;
    @Inject
    private  SquireDukeSucellusInfoBox s;
     boolean h;

    @Subscribe
    public void a(ConfigChanged configChanged) {
    }

    public void b() {
        this.m += 1;
    }

    public void a(WorldPoint worldPoint) {
        this.e = worldPoint;
    }

    public List<WorldPoint> i() {
        return this.g;
    }

    public boolean m() {
        return this.k;
    }

    public void f(boolean bl) {
        this.l = bl;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[2];
        classArray[0] = DangerTileHandlerTask.class;
        classArray[1] = WalkingToTheBankTask.class;
        classArray[3] = PathingToBossTask.class;
        classArray[4] = WithdrawingItemsTask.class;
        classArray[5] = PathingToBossTask.class;
        classArray[6] = HandlingSpecAndGearTask.class;
        classArray[7] = PostKillHandlerTask.class;
        classArray[8] = PrayerFlickingTask.class;
        classArray[9] = EatingFoodTask.class;
        classArray[SquireDukeSucellus.var1[10]] = LootingTask.class;
        classArray[SquireDukeSucellus.var1[11]] = StaminaHandlerTask.class;
        classArray[SquireDukeSucellus.var1[12]] = DrinkingBoostTask.class;
        classArray[SquireDukeSucellus.var1[13]] = DrinkingPrayerTask.class;
        classArray[SquireDukeSucellus.var1[14]] = TogglingRunTask.class;
        classArray[SquireDukeSucellus.var1[15]] = UsingThrallTask.class;
        classArray[SquireDukeSucellus.var1[16]] = DodgeGazeTask.class;
        classArray[SquireDukeSucellus.var1[17]] = SwappingSidesTask.class;
        classArray[SquireDukeSucellus.var1[18]] = AttackDukeEastTask.class;
        classArray[SquireDukeSucellus.var1[19]] = AttackDukeWestTask.class;
        classArray[SquireDukeSucellus.var1[20]] = StartFightTask.class;
        classArray[SquireDukeSucellus.var1[21]] = CollectPoisonTask.class;
        classArray[SquireDukeSucellus.var1[22]] = StartFightTask.class;
        classArray[SquireDukeSucellus.var1[23]] = DestroyingSpareIngredientsTask.class;
        classArray[SquireDukeSucellus.var1[24]] = TestTask.class;
        classArray[SquireDukeSucellus.var1[25]] = DepositMuscaMushroomTask.class;
        classArray[SquireDukeSucellus.var1[26]] = CollectMuscaMushroomsTask.class;
        classArray[SquireDukeSucellus.var1[27]] = WalkToMuscaMushroomTask.class;
        classArray[SquireDukeSucellus.var1[28]] = CollectMuscaMushroomTask.class;
        classArray[SquireDukeSucellus.var1[29]] = ExitMuscaAreaTask.class;
        classArray[SquireDukeSucellus.var1[30]] = DepositArderMushroomTask.class;
        classArray[SquireDukeSucellus.var1[31]] = WalkToArderMushroomTask.class;
        classArray[SquireDukeSucellus.var1[32]] = CollectArderMushroomTask.class;
        classArray[SquireDukeSucellus.var1[33]] = ExitArderAreaTask.class;
        classArray[SquireDukeSucellus.var1[34]] = CollectSalaxSaltTask.class;
        classArray[SquireDukeSucellus.var1[35]] = DepositSalaxSaltTask.class;
        return classArray;
    }

    public List<WorldPoint> f() {
        return this.d;
    }

    public void e(boolean bl) {
        this.k = bl;
    }

    public void e(List<WorldPoint> list) {
        this.d = list;
    }

    static {
        SquireDukeSucellus.var2();
    }

    public HashSet<Prayer> c() {
        return this.a;
    }

    public void g(boolean bl) {
        this.n = bl;
    }

    public WorldPoint h() {
        return this.f;
    }

    public a s() {
        return this.u;
    }

    public int d() {
        return this.b;
    }

    public WorldPoint g() {
        return this.e;
    }

    public boolean p() {
        return this.n;
    }

    public void c(boolean bl) {
        this.i = bl;
    }

    public void b(WorldArea worldArea) {
        worldArea.toWorldPointList().forEach(worldPoint -> {
            if ((this.g.containsworldPoint)) {
                this.g.remove(worldPoint);
                0;
            }
        });
    }

    public void d(boolean bl) {
        this.j = bl;
    }

    public void a(InventorySetup inventorySetup) {
        this.o = inventorySetup;
    }

    public void a() {
        this.g.clear();
    }

    public void b(WorldPoint worldPoint) {
        this.f = worldPoint;
    }

    public InventorySetup q() {
        return this.o;
    }

    public boolean k() {
        return this.i;
    }

    public boolean n() {
        return this.l;
    }

    public void a(List<WorldArea> list) {
        this.g.clear();
        Iterator<WorldArea> var3 = list.iterator();
        while ((var3.hasNext( != 0) ? 1 : 0)) {
            SquireDukeSucellus var4;
            WorldArea var5 = var3.next();
            var4.g.addAll(var5.toWorldPointList());
            0;
            0;
            if null == null continue;
            return;
        }
    }

    protected void onStart() {
        this.q.register((Object)this.u);
        this.u.t();
        this.r.add((Overlay)this.s);
        0;
        this.r.add((Overlay)this.t);
        0;
        this.h = 1;
        this.m = 0;
        this.n = 0;
        this.e(0);
        this.p.clear();
        this.l = 0;
        this.j = 0;
    }

    public List<f> r() {
        return this.p;
    }

    public int o() {
        return this.m;
    }

    public void a(int n2) {
        this.m = n2;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public void f(List<f> list) {
        this.p = list;
    }

    public void c(List<WorldPoint> list) {
        this.g.addAll(list);
        0;
    }

    protected void onStop() {
        this.q.unregister((Object)this.u);
        this.r.remove((Overlay)this.s);
        0;
        this.r.remove((Overlay)this.t);
        0;
    }

    public void b(boolean bl) {
        this.h = bl;
    }

    public void d(List<WorldPoint> list) {
        list.forEach(worldPoint -> {
            if ((this.g.containsworldPoint)) {
                this.g.remove(worldPoint);
                0;
            }
        });
    }

    public boolean j() {
        return this.h;
    }

    public boolean e() {
        return this.c;
    }

    public SquireDukeSucellus() {
        this.a = new HashSet();
        this.b = 0;
        this.c = 1;
        this.d = new ArrayList<WorldPoint>();
        this.e = new WorldPoint(0, 0, 0);
        this.f = new WorldPoint(0, 0, 0);
        this.g = new ArrayList<WorldPoint>();
        this.h = 0;
        this.i = 0;
        this.n = 0;
        this.p = new ArrayList<f>();
    }

    @Provides
    SquireDukeSucellusConfig a(ConfigManager configManager) {
        return (SquireDukeSucellusConfig)configManager.getConfig(SquireDukeSucellusConfig.class);
    }

    public boolean l() {
        return this.j;
    }

    public void a(WorldArea worldArea) {
        this.g.addAll(worldArea.toWorldPointList());
        0;
    }

    public void b(List<WorldArea> list) {
        Iterator<WorldArea> var6 = list.iterator();
        while ((var6.hasNext( != 0) ? 1 : 0)) {
            SquireDukeSucellus var7;
            WorldArea var8 = var6.next();
            var7.g.addAll(var8.toWorldPointList());
            0;
            0;
            if null == null continue;
            return;
        }
    }
}

