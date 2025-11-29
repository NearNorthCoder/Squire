/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.vardorvis;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.vardorvis.SquireVardorvisConfig;
import gg.squire.vardorvis.overlay.SquireVardorvisBox;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import gg.squire.vardorvis.HandlingSpecAndGearTask;
import gg.squire.vardorvis.LootingTask;
import gg.squire.vardorvis.PrayerFlickingTask;
import gg.squire.vardorvis.UsingThrallTask;
import gg.squire.vardorvis.GrabbingDeathItemsDeathTask;
import gg.squire.vardorvis.GrabbingFairyRingItemDeathTask;
import gg.squire.vardorvis.WalkingToVardorvisDeathTask;
import gg.squire.vardorvis.VardorvisManager;
import gg.squire.vardorvis.VardorvisManager;
import gg.squire.vardorvis.MHelper;
import gg.squire.vardorvis.TogglingRunTask;
import gg.squire.vardorvis.StaminaHandlerTask;
import gg.squire.vardorvis.StartFightTask;
import gg.squire.vardorvis.WalkingToTheBankTask;
import gg.squire.vardorvis.PathingToBossTask;
import gg.squire.vardorvis.WithdrawingItemsTask;
import gg.squire.vardorvis.AttackBossTask;
import gg.squire.vardorvis.ClickingSporesTask;
import gg.squire.vardorvis.DodgingAxeTask;
import gg.squire.vardorvis.DrinkingBoostTask;
import gg.squire.vardorvis.DrinkingPrayerTask;
import gg.squire.vardorvis.EatingFoodTask;

@PluginDescriptor(name="Squire Vardorvis", description="Squire Vardorvis", enabledByDefault=false, tags={"vardorvis", "dt2", "desert", "treasure"})
public class SquireVardorvis
extends SquirePlugin {
    @Inject
    private  SquireVardorvisConfig n;
    
     boolean g;
    @Inject
    private  SquireVardorvisBox j;
     int e;
    @Inject
    private  EventBus h;
    @Inject
    private  b m;
    @Inject
    private  m k;
     boolean b;
     boolean f;
    
    @Inject
    private  OverlayManager i;
    private final  HashSet<Prayer> a;
    @Inject
    private  e l;
     List<WorldPoint> c;
     boolean d;

    protected void onStop() {
        this.h.unregister((Object)this.l);
        this.h.unregister((Object)this.m);
        this.i.remove((Overlay)this.j);
        0;
        this.i.remove((Overlay)this.k);
        0;
    }

    public SquireVardorvis() {
        this.a = new HashSet();
        this.b = var1[0];
        this.c = new ArrayList<WorldPoint>();
        this.f = var1[1];
        this.g = var1[1];
    }

    public void d(boolean bl) {
        this.g = bl;
    }

    protected void onStart() {
        this.h.register((Object)this.l);
        this.l.x();
        this.h.register((Object)this.m);
        this.m.x();
        this.i.add((Overlay)this.j);
        0;
        this.i.add((Overlay)this.k);
        0;
        this.e = var1[1];
        this.f = this.n.bankOnStart();
        this.g = var1[1];
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[2]];
        classArray[SquireVardorvis.var1[1]] = WalkingToTheBankTask.class;
        classArray[SquireVardorvis.var1[0]] = PathingToBossTask.class;
        classArray[SquireVardorvis.var1[3]] = WithdrawingItemsTask.class;
        classArray[SquireVardorvis.var1[4]] = PathingToBossTask.class;
        classArray[SquireVardorvis.var1[5]] = HandlingSpecAndGearTask.class;
        classArray[SquireVardorvis.var1[6]] = ClickingSporesTask.class;
        classArray[SquireVardorvis.var1[7]] = DodgingAxeTask.class;
        classArray[SquireVardorvis.var1[8]] = AttackBossTask.class;
        classArray[SquireVardorvis.var1[9]] = UsingThrallTask.class;
        classArray[SquireVardorvis.var1[10]] = StartFightTask.class;
        classArray[SquireVardorvis.var1[11]] = PrayerFlickingTask.class;
        classArray[SquireVardorvis.var1[12]] = EatingFoodTask.class;
        classArray[SquireVardorvis.var1[13]] = LootingTask.class;
        classArray[SquireVardorvis.var1[14]] = StaminaHandlerTask.class;
        classArray[SquireVardorvis.var1[15]] = DrinkingBoostTask.class;
        classArray[SquireVardorvis.var1[16]] = DrinkingPrayerTask.class;
        classArray[SquireVardorvis.var1[17]] = TogglingRunTask.class;
        classArray[SquireVardorvis.var1[18]] = GrabbingDeathItemsDeathTask.class;
        classArray[SquireVardorvis.var1[19]] = GrabbingFairyRingItemDeathTask.class;
        classArray[SquireVardorvis.var1[20]] = WalkingToVardorvisDeathTask.class;
        return classArray;
    }

    public void a() {
        this.e += var1[0];
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean i() {
        return this.g;
    }

    public int g() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }

    public e j() {
        return this.l;
    }

    private static void var9() {
        var2 = new String[var1[0]];
        SquireVardorvis.var2[SquireVardorvis.var1[1]] = "Oh dear, you are dead!";
    }

    public b k() {
        return this.m;
    }

    public boolean d() {
        return this.b;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (SquireVardorvis.var10(string.contains(var2[var1[1]]) ? 1 : 0)) {
            this.d(var1[0]);
            this.l.x();
        }
    }

    public HashSet<Prayer> c() {
        return this.a;
    }

    public boolean h() {
        return this.f;
    }

    public void a(List<WorldArea> list) {
        this.c.clear();
        Iterator<WorldArea> var11 = list.iterator();
        while (SquireVardorvis.var10(var11.hasNext() ? 1 : 0)) {
            SquireVardorvis var12;
            WorldArea var13 = var11.next();
            var12.c.addAll(var13.toWorldPointList());
            0;
            0;
            if ((122 + 172 - 166 + 64 ^ 156 + 137 - 219 + 122) == (56 + 47 - 8 + 35 ^ 15 + 36 - 23 + 106)) continue;
            return;
        }
    }

    static {
        SquireVardorvis.var14();
        SquireVardorvis.var9();
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    @Provides
    SquireVardorvisConfig a(ConfigManager configManager) {
        return (SquireVardorvisConfig)configManager.getConfig(SquireVardorvisConfig.class);
    }

    public void c(List<WorldPoint> list) {
        this.c.addAll(list);
        0;
    }

    public void d(List<WorldPoint> list) {
        list.forEach(worldPoint -> {
            if (SquireVardorvis.var10(this.c.contains(worldPoint) ? 1 : 0)) {
                this.c.remove(worldPoint);
                0;
            }
        });
    }

    public void b(boolean bl) {
        this.d = bl;
    }

    public void a(int n2) {
        this.e = n2;
    }

    public void b(WorldArea worldArea) {
        worldArea.toWorldPointList().forEach(worldPoint -> {
            if (SquireVardorvis.var10(this.c.contains(worldPoint) ? 1 : 0)) {
                this.c.remove(worldPoint);
                0;
            }
        });
    }

    public void c(boolean bl) {
        this.f = bl;
    }

    public void a(WorldArea worldArea) {
        this.c.addAll(worldArea.toWorldPointList());
        0;
    }

    public void b() {
        this.c.clear();
    }

    public void b(List<WorldArea> list) {
        Iterator<WorldArea> var15 = list.iterator();
        while (SquireVardorvis.var10(var15.hasNext() ? 1 : 0)) {
            SquireVardorvis var16;
            WorldArea var17 = var15.next();
            var16.c.addAll(var17.toWorldPointList());
            0;
            0;
            if (-1 == -1) continue;
            return;
        }
    }

    public List<WorldPoint> e() {
        return this.c;
    }

    private static void var14() {
        var1 = new int[21];
        SquireVardorvis.var1[0] = 1;
        SquireVardorvis.var1[1] = (73 + 179 - 65 + 12 ^ 51 + 109 - 58 + 49) & (0x4A ^ 0x40 ^ (0x4F ^ 0x15) ^ -1);
        SquireVardorvis.var1[2] = 0x6F ^ 0x7B;
        SquireVardorvis.var1[3] = 2;
        SquireVardorvis.var1[4] = 3;
        SquireVardorvis.var1[5] = 0x6C ^ 0xC ^ (0xA7 ^ 0xC3);
        SquireVardorvis.var1[6] = 0x57 ^ 0x1F ^ (0x46 ^ 0xB);
        SquireVardorvis.var1[7] = 0xFD ^ 0xC4 ^ (0x5C ^ 0x63);
        SquireVardorvis.var1[8] = 0xE0 ^ 0xB5 ^ (0xFF ^ 0xAD);
        SquireVardorvis.var1[9] = 6 + 131 - 129 + 159 ^ 114 + 3 - 74 + 132;
        SquireVardorvis.var1[10] = 0xC ^ 5;
        SquireVardorvis.var1[11] = 29 + 30 - 48 + 144 ^ 82 + 85 - 32 + 10;
        SquireVardorvis.var1[12] = 104 + 48 - 74 + 78 ^ 60 + 51 - 104 + 144;
        SquireVardorvis.var1[13] = 0x9E ^ 0x92 ^ (0xC4 ^ 0xC0) & ~(0x85 ^ 0x81);
        SquireVardorvis.var1[14] = 0x78 ^ 0x75;
        SquireVardorvis.var1[15] = 0x48 ^ 0x46;
        SquireVardorvis.var1[16] = 0x53 ^ 0x5C;
        SquireVardorvis.var1[17] = 0xFB ^ 0xB9 ^ (0xF0 ^ 0xA2);
        SquireVardorvis.var1[18] = 0xD ^ 0x5F ^ (0x37 ^ 0x74);
        SquireVardorvis.var1[19] = 0x98 ^ 0x8A;
        SquireVardorvis.var1[20] = 0x47 ^ 0x54;
    }
}

