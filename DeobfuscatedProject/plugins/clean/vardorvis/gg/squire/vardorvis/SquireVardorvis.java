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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.m;
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

        this.i.remove((Overlay)this.k);

    }

    public SquireVardorvis() {
        this.a = new HashSet();
        this.b = lIlIlIIlllIIl[0];
        this.c = new ArrayList<WorldPoint>();
        this.f = lIlIlIIlllIIl[1];
        this.g = lIlIlIIlllIIl[1];
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

        this.i.add((Overlay)this.k);

        this.e = lIlIlIIlllIIl[1];
        this.f = this.n.bankOnStart();
        this.g = lIlIlIIlllIIl[1];
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIlIIlllIIl[2]];
        classArray[SquireVardorvis.lIlIlIIlllIIl[1]] = WalkingToTheBankTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[0]] = PathingToBossTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[3]] = WithdrawingItemsTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[4]] = PathingToBossTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[5]] = HandlingSpecAndGearTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[6]] = ClickingSporesTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[7]] = DodgingAxeTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[8]] = AttackBossTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[9]] = UsingThrallTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[10]] = StartFightTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[11]] = PrayerFlickingTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[12]] = EatingFoodTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[13]] = LootingTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[14]] = StaminaHandlerTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[15]] = DrinkingBoostTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[16]] = DrinkingPrayerTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[17]] = TogglingRunTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[18]] = GrabbingDeathItemsDeathTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[19]] = GrabbingFairyRingItemDeathTask.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[20]] = WalkingToVardorvisDeathTask.class;
        return classArray;
    }

    public void a() {
        this.e += lIlIlIIlllIIl[0];
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

    private static void lIlllllIIIlIllI() {
        lIlIlIIlllIII = new String[lIlIlIIlllIIl[0]];
        SquireVardorvis.lIlIlIIlllIII[SquireVardorvis.lIlIlIIlllIIl[1]] = "Oh dear, you are dead!";
    }

    public b k() {
        return this.m;
    }

    public boolean d() {
        return this.b;
    }

    private static boolean lIlllllIIIllIII(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (SquireVardorvis.lIlllllIIIllIII(string.contains(lIlIlIIlllIII[lIlIlIIlllIIl[1]]) ? 1 : 0)) {
            this.d(lIlIlIIlllIIl[0]);
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
        Iterator<WorldArea> var1 = list.iterator();
        while (SquireVardorvis.lIlllllIIIllIII(var1.hasNext() ? 1 : 0)) {
            SquireVardorvis var2;
            WorldArea var3 = var1.next();
            var2.c.addAll(var3.toWorldPointList());

            if ((122 + 172 - 166 + 64 ^ 156 + 137 - 219 + 122) == (56 + 47 - 8 + 35 ^ 15 + 36 - 23 + 106)) continue;
            return;
        }
    }

    static {
        SquireVardorvis.lIlllllIIIlIlll();
        SquireVardorvis.lIlllllIIIlIllI();
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

    }

    public void d(List<WorldPoint> list) {
        list.forEach(worldPoint -> {
            if (SquireVardorvis.lIlllllIIIllIII(this.c.contains(worldPoint) ? 1 : 0)) {
                this.c.remove(worldPoint);

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
            if (SquireVardorvis.lIlllllIIIllIII(this.c.contains(worldPoint) ? 1 : 0)) {
                this.c.remove(worldPoint);

            }
        });
    }

    public void c(boolean bl) {
        this.f = bl;
    }

    public void a(WorldArea worldArea) {
        this.c.addAll(worldArea.toWorldPointList());

    }

    public void b() {
        this.c.clear();
    }

    public void b(List<WorldArea> list) {
        Iterator<WorldArea> var4 = list.iterator();
        while (SquireVardorvis.lIlllllIIIllIII(var4.hasNext() ? 1 : 0)) {
            SquireVardorvis var5;
            WorldArea var6 = var4.next();
            var5.c.addAll(var6.toWorldPointList());

            if (-1 == -1) continue;
            return;
        }
    }

    public List<WorldPoint> e() {
        return this.c;
    }

}

