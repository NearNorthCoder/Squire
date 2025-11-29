/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.client.Static
 */
package gg.squire.sepulchre;

import com.google.inject.Inject;
import com.google.inject.Provides;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.M;
import gg.squire.sepulchre.BankingTask;
import gg.squire.sepulchre.EatingFoodTask;
import gg.squire.sepulchre.EnterSepulchreTask;
import gg.squire.sepulchre.FinishingFloorTask;
import gg.squire.sepulchre.LootHandlerTask;
import gg.squire.sepulchre.ObstacleHandlerTask;
import gg.squire.sepulchre.StaminaHandlerTask;
import gg.squire.sepulchre.OpeningHallowedSacksTask;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.sepulchre.SepulchreManager;
import gg.squire.sepulchre.GameEnum11;
import gg.squire.sepulchre.GameEnum18;
import gg.squire.sepulchre.GameEnum33;
import gg.squire.sepulchre.GameEnum25;
import gg.squire.sepulchre.GameEnum16;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.sepulchre.SquireSepulchreConfig;
import gg.squire.sepulchre.overlay.SquireSepulchreInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.client.Static;

@PluginDescriptor(name="Squire Hallowed Sepulchre", description="Runs laps in Hallowed Sepulchre.", enabledByDefault=false, tags={"hallowed", "sepulchre", "agility"})
public class SquireSepulchre
extends SquirePlugin {
    @Inject
    private  EventBus i;
     List<WorldPoint> c;
     int a;
    private  InventorySetup g;
     List<WorldPoint> f;
     String name;
     WorldPoint e;
    @Inject
    private  SquireSepulchreConfig m;
    
     boolean b;
    
    @Inject
    private  M l;
     WorldPoint d;
    @Inject
    private  OverlayManager j;
    @Inject
    private  d h;
    @Inject
    private  SquireSepulchreInfoBox k;

    public boolean e() {
        return this.b;
    }

    public void a(String string) {
        this.name = string;
    }

    private static boolean lIIIlIIlIlllIIl(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private void b() {
        x var1;
        q var2;
        w var3;
        SquireSepulchre var4;
        void var5;
        this.j().add(item -> {
            boolean bl;
            if (!SquireSepulchre.lIIIlIIlIlllIIl(item.getId(), lllIIIllIlII[28]) || SquireSepulchre.lIIIlIIlIlllIlI(item.getId(), lllIIIllIlII[29])) {
                bl = lllIIIllIlII[1];

                if (1 <= 0) {
                    return false;
                }
            } else {
                bl = lllIIIllIlII[0];
            }
            return bl;
        }, this.m.stamina());

        y y2 = this.m.planks();
        if (SquireSepulchre.lIIIlIIlIllIllI((Object)y2, (Object)y.REGULAR_STEEL)) {
            this.j().add(lllIIIllIlII[9], lllIIIllIlII[7]);

            this.j().add(lllIIIllIlII[10]);

        }
        if (SquireSepulchre.lIIIlIIlIllIllI(var5, (Object)y.OAK_MITHRIL)) {
            var4.j().add(lllIIIllIlII[11], lllIIIllIlII[7]);

            var4.j().add(lllIIIllIlII[12]);

        }
        if (SquireSepulchre.lIIIlIIlIllIllI(var5, (Object)y.TEAK_ADAMANT)) {
            var4.j().add(lllIIIllIlII[13], lllIIIllIlII[7]);

            var4.j().add(lllIIIllIlII[14]);

        }
        if (SquireSepulchre.lIIIlIIlIllIllI(var5, (Object)y.MAHOGANY_RUNE)) {
            var4.j().add(lllIIIllIlII[15], lllIIIllIlII[7]);

            var4.j().add(lllIIIllIlII[16]);

        }
        if (SquireSepulchre.lIIIlIIlIllIllI((Object)(var3 = var4.m.hammer()), (Object)w.HAMMER)) {
            var4.j().add(lllIIIllIlII[17], lllIIIllIlII[1]);

            var4.j().add(lllIIIllIlII[18], lllIIIllIlII[1]);

        }
        if (SquireSepulchre.lIIIlIIlIllIllI((Object)var3, (Object)w.HALLOWED_HAMMER)) {
            var4.j().add(lllIIIllIlII[19], lllIIIllIlII[1]);

            var4.j().add(lllIIIllIlII[18], lllIIIllIlII[1]);

        }
        var4.j().add(lllIIIllIlII[20], var4.m.dust());

        z var6 = var4.m.portal();
        if (SquireSepulchre.lIIIlIIlIllIlll((Object)var6, (Object)z.NONE)) {
            var4.j().add(lllIIIllIlII[21]);

            if (SquireSepulchre.lIIIlIIlIllIllI((Object)var6, (Object)z.LV1_ENCHANT)) {
                var4.j().add(lllIIIllIlII[22]);

                if (((178 + 125 - 214 + 94 ^ 143 + 145 - 210 + 68) & (108 + 179 - 204 + 107 ^ 26 + 6 - -73 + 50 ^ -1)) != 0) {
                    return;
                }
            } else if (SquireSepulchre.lIIIlIIlIllIllI((Object)var6, (Object)z.LV2_ENCHANT)) {
                var4.j().add(lllIIIllIlII[23]);

                if (3 > 3) {
                    return;
                }
            } else if (SquireSepulchre.lIIIlIIlIllIllI((Object)var6, (Object)z.LV3_ENCHANT)) {
                var4.j().add(lllIIIllIlII[24]);

                if ((0x6F ^ 0x6B) <= 3) {
                    return;
                }
            } else if (SquireSepulchre.lIIIlIIlIllIllI((Object)var6, (Object)z.LV4_ENCHANT)) {
                var4.j().add(lllIIIllIlII[25]);

                if (((116 + 64 - 61 + 38 ^ 12 + 124 - 83 + 85) & (0x7E ^ 0x3B ^ (0x42 ^ 0x10) ^ -1)) < -1) {
                    return;
                }
            } else if (SquireSepulchre.lIIIlIIlIllIllI((Object)var6, (Object)z.LV5_ENCHANT)) {
                var4.j().add(lllIIIllIlII[25]);

                var4.j().add(lllIIIllIlII[22]);

                }
            } else if (SquireSepulchre.lIIIlIIlIllIllI((Object)var6, (Object)z.LV6_ENCHANT)) {
                var4.j().add(lllIIIllIlII[25]);

                var4.j().add(lllIIIllIlII[24]);

            }
        }
        if (SquireSepulchre.lIIIlIIlIlllIII((Object)(var2 = var4.m.food()))) {
            var4.j().add(var2.V(), var4.m.foodAmount());

        }
        if (SquireSepulchre.lIIIlIIlIllIllI((Object)(var1 = var4.m.lockpick()), (Object)x.STRANGE_LOCKPICK)) {
            var4.j().add(lllIIIllIlII[26], lllIIIllIlII[1]);

        }
        if (SquireSepulchre.lIIIlIIlIllIllI((Object)var1, (Object)x.LOCKPICK)) {
            var4.j().add(lllIIIllIlII[27], lllIIIllIlII[1]);

        }
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a(new InventorySetup());
        this.b();
    }

    protected void onStart() {
        this.h.q();
        this.i.register((Object)this.h);
        this.j.add((Overlay)this.k);

        this.j.add((Overlay)this.l);

        this.a(new InventorySetup());
        this.b();
    }

    private static boolean lIIIlIIlIlllIII(Object object) {
        return object != null;
    }

    public void b(WorldPoint worldPoint) {
        this.e = worldPoint;
    }

    public List<WorldPoint> i() {
        return this.f;
    }

    public void a(List<WorldArea> list) {
        this.f.clear();
        Iterator<WorldArea> var7 = list.iterator();
        while (SquireSepulchre.lIIIlIIlIllIlIl(var7.hasNext() ? 1 : 0)) {
            SquireSepulchre var8;
            WorldArea var9 = var7.next();
            var8.f.addAll(var9.toWorldPointList());

            if ((0x67 ^ 0x53 ^ (0x77 ^ 0x47)) > 3) continue;
            return;
        }
    }

    public void b(List<WorldPoint> list) {
        this.c = list;
    }

    public InventorySetup j() {
        return this.g;
    }

    public int c() {
        return Static.getClient().getVarbitValue(e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b.O);
    }

    public void a(InventorySetup inventorySetup) {
        this.g = inventorySetup;
    }

    static {
        SquireSepulchre.lIIIlIIlIllIIll();
        SquireSepulchre.lIIIlIIlIllIIlI();
    }

    public String getName() {
        return this.name;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllIIIllIlII[2]];
        classArray[SquireSepulchre.lllIIIllIlII[0]] = OpeningHallowedSacksTask.class;
        classArray[SquireSepulchre.lllIIIllIlII[1]] = BankingTask.class;
        classArray[SquireSepulchre.lllIIIllIlII[3]] = LootHandlerTask.class;
        classArray[SquireSepulchre.lllIIIllIlII[4]] = StaminaHandlerTask.class;
        classArray[SquireSepulchre.lllIIIllIlII[5]] = EatingFoodTask.class;
        classArray[SquireSepulchre.lllIIIllIlII[6]] = EnterSepulchreTask.class;
        classArray[SquireSepulchre.lllIIIllIlII[7]] = FinishingFloorTask.class;
        classArray[SquireSepulchre.lllIIIllIlII[8]] = ObstacleHandlerTask.class;
        return classArray;
    }

    public SquireSepulchre() {
        this.a = lllIIIllIlII[0];
        this.b = lllIIIllIlII[1];
        this.c = new ArrayList<WorldPoint>();
        this.d = new WorldPoint(lllIIIllIlII[0], lllIIIllIlII[0], lllIIIllIlII[0]);
        this.e = new WorldPoint(lllIIIllIlII[0], lllIIIllIlII[0], lllIIIllIlII[0]);
        this.f = new ArrayList<WorldPoint>();
        this.name = lllIIIllIIll[lllIIIllIlII[0]];
    }

    public WorldPoint g() {
        return this.d;
    }

    private static boolean lIIIlIIlIlllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIlIIlIllIIlI() {
        lllIIIllIIll = new String[lllIIIllIlII[1]];
        SquireSepulchre.lllIIIllIIll[SquireSepulchre.lllIIIllIlII[0]] = SquireSepulchre.lIIIlIIlIllIIIl("YizLrlOiIXo=", "SuSdZ");
    }

    private static boolean lIIIlIIlIllIllI(Object object, Object object2) {
        return object == object2;
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        if (SquireSepulchre.lIIIlIIlIllIlII(regionPoint)) {
            return null;
        }
        WorldPoint worldPoint2 = regionPoint.toWorld();
        Client client = Static.getClient();
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)worldPoint2);
        return collection.stream().min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(new WorldPoint(client.getBaseX(), client.getBaseY(), client.getPlane())))).orElse(worldPoint2);
    }

    @Provides
    SquireSepulchreConfig a(ConfigManager configManager) {
        return (SquireSepulchreConfig)configManager.getConfig(SquireSepulchreConfig.class);
    }

    private static boolean lIIIlIIlIllIlII(Object object) {
        return object == null;
    }

    public WorldPoint h() {
        return this.e;
    }

    private static boolean lIIIlIIlIllIlIl(int n2) {
        return n2 != 0;
    }

    public List<WorldPoint> f() {
        return this.c;
    }

    public z a() {
        return this.m.portal();
    }

    public void a(WorldPoint worldPoint) {
        this.d = worldPoint;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    private static boolean lIIIlIIlIllIlll(Object object, Object object2) {
        return object != object2;
    }

    public int d() {
        return this.a;
    }

    protected void onStop() {
        this.h.r();
        this.i.unregister((Object)this.h);
        this.j.remove((Overlay)this.k);

        this.j.remove((Overlay)this.l);

    }
}

