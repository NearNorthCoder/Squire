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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.f;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.i;
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
        this.m += lIllIlllIIII[1];
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
        Class[] classArray = new Class[lIllIlllIIII[2]];
        classArray[SquireDukeSucellus.lIllIlllIIII[0]] = DangerTileHandlerTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[1]] = WalkingToTheBankTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[3]] = PathingToBossTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[4]] = WithdrawingItemsTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[5]] = PathingToBossTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[6]] = HandlingSpecAndGearTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[7]] = PostKillHandlerTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[8]] = PrayerFlickingTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[9]] = EatingFoodTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[10]] = LootingTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[11]] = StaminaHandlerTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[12]] = DrinkingBoostTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[13]] = DrinkingPrayerTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[14]] = TogglingRunTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[15]] = UsingThrallTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[16]] = DodgeGazeTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[17]] = SwappingSidesTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[18]] = AttackDukeEastTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[19]] = AttackDukeWestTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[20]] = StartFightTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[21]] = CollectPoisonTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[22]] = StartFightTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[23]] = DestroyingSpareIngredientsTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[24]] = TestTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[25]] = DepositMuscaMushroomTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[26]] = CollectMuscaMushroomsTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[27]] = WalkToMuscaMushroomTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[28]] = CollectMuscaMushroomTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[29]] = ExitMuscaAreaTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[30]] = DepositArderMushroomTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[31]] = WalkToArderMushroomTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[32]] = CollectArderMushroomTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[33]] = ExitArderAreaTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[34]] = CollectSalaxSaltTask.class;
        classArray[SquireDukeSucellus.lIllIlllIIII[35]] = DepositSalaxSaltTask.class;
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
        SquireDukeSucellus.lllIlIIllIIllI();
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
            if (SquireDukeSucellus.lllIlIIllIIlll(this.g.contains(worldPoint) ? 1 : 0)) {
                this.g.remove(worldPoint);

            }
        });
    }

    public void d(boolean bl) {
        this.j = bl;
    }

    private static boolean lllIlIIllIIlll(int n2) {
        return n2 != 0;
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
        Iterator<WorldArea> var1 = list.iterator();
        while (SquireDukeSucellus.lllIlIIllIIlll(var1.hasNext() ? 1 : 0)) {
            SquireDukeSucellus var2;
            WorldArea var3 = var1.next();
            var2.g.addAll(var3.toWorldPointList());

            return;
        }
    }

    protected void onStart() {
        this.q.register((Object)this.u);
        this.u.t();
        this.r.add((Overlay)this.s);

        this.r.add((Overlay)this.t);

        this.h = lIllIlllIIII[1];
        this.m = lIllIlllIIII[0];
        this.n = lIllIlllIIII[0];
        this.e(lIllIlllIIII[0]);
        this.p.clear();
        this.l = lIllIlllIIII[0];
        this.j = lIllIlllIIII[0];
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

    }

    protected void onStop() {
        this.q.unregister((Object)this.u);
        this.r.remove((Overlay)this.s);

        this.r.remove((Overlay)this.t);

    }

    public void b(boolean bl) {
        this.h = bl;
    }

    public void d(List<WorldPoint> list) {
        list.forEach(worldPoint -> {
            if (SquireDukeSucellus.lllIlIIllIIlll(this.g.contains(worldPoint) ? 1 : 0)) {
                this.g.remove(worldPoint);

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
        this.b = lIllIlllIIII[0];
        this.c = lIllIlllIIII[1];
        this.d = new ArrayList<WorldPoint>();
        this.e = new WorldPoint(lIllIlllIIII[0], lIllIlllIIII[0], lIllIlllIIII[0]);
        this.f = new WorldPoint(lIllIlllIIII[0], lIllIlllIIII[0], lIllIlllIIII[0]);
        this.g = new ArrayList<WorldPoint>();
        this.h = lIllIlllIIII[0];
        this.i = lIllIlllIIII[0];
        this.n = lIllIlllIIII[0];
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

    }

    public void b(List<WorldArea> list) {
        Iterator<WorldArea> var4 = list.iterator();
        while (SquireDukeSucellus.lllIlIIllIIlll(var4.hasNext() ? 1 : 0)) {
            SquireDukeSucellus var5;
            WorldArea var6 = var4.next();
            var5.g.addAll(var6.toWorldPointList());

            return;
        }
    }
}

