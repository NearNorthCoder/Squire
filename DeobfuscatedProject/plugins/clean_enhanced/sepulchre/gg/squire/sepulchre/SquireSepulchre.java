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
import gg.squire.sepulchre.MHelper;
import gg.squire.sepulchre.BankingTask;
import gg.squire.sepulchre.EatingFoodTask;
import gg.squire.sepulchre.EnterSepulchreTask;
import gg.squire.sepulchre.FinishingFloorTask;
import gg.squire.sepulchre.LootHandlerTask;
import gg.squire.sepulchre.ObstacleHandlerTask;
import gg.squire.sepulchre.StaminaHandlerTask;
import gg.squire.sepulchre.OpeningHallowedSacksTask;
import gg.squire.sepulchre.BHelper;
import gg.squire.sepulchre.SepulchreManager;
import gg.squire.sepulchre.GameEnum7;
import gg.squire.sepulchre.GameEnum13;
import gg.squire.sepulchre.GameEnum25;
import gg.squire.sepulchre.GameEnum18;
import gg.squire.sepulchre.GameEnum11;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.sepulchre.SquireSepulchreConfig;
import gg.squire.sepulchre.overlay.SquireSepulchreInfoBox;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
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

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private void b() {
        x var4;
        q var5;
        w var6;
        SquireSepulchre var7;
        void var8;
        this.j().add(item -> {
            boolean bl;
            if (!SquireSepulchre.var3(item.getId(), var2[28]) || SquireSepulchre.var9(item.getId(), var2[29])) {
                bl = var2[1];
                0;
                if (1 <= 0) {
                    return ((0x74 ^ 0x4A) & ~(0x5C ^ 0x62)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }, this.m.stamina());
        0;
        y y2 = this.m.planks();
        if (SquireSepulchre.var10((Object)y2, (Object)y.REGULAR_STEEL)) {
            this.j().add(var2[9], var2[7]);
            0;
            this.j().add(var2[10]);
            0;
        }
        if (SquireSepulchre.var10(var8, (Object)y.OAK_MITHRIL)) {
            var7.j().add(var2[11], var2[7]);
            0;
            var7.j().add(var2[12]);
            0;
        }
        if (SquireSepulchre.var10(var8, (Object)y.TEAK_ADAMANT)) {
            var7.j().add(var2[13], var2[7]);
            0;
            var7.j().add(var2[14]);
            0;
        }
        if (SquireSepulchre.var10(var8, (Object)y.MAHOGANY_RUNE)) {
            var7.j().add(var2[15], var2[7]);
            0;
            var7.j().add(var2[16]);
            0;
        }
        if (SquireSepulchre.var10((Object)(var6 = var7.m.hammer()), (Object)w.HAMMER)) {
            var7.j().add(var2[17], var2[1]);
            0;
            var7.j().add(var2[18], var2[1]);
            0;
        }
        if (SquireSepulchre.var10((Object)var6, (Object)w.HALLOWED_HAMMER)) {
            var7.j().add(var2[19], var2[1]);
            0;
            var7.j().add(var2[18], var2[1]);
            0;
        }
        var7.j().add(var2[20], var7.m.dust());
        0;
        z var11 = var7.m.portal();
        if (SquireSepulchre.var12((Object)var11, (Object)z.NONE)) {
            var7.j().add(var2[21]);
            0;
            if (SquireSepulchre.var10((Object)var11, (Object)z.LV1_ENCHANT)) {
                var7.j().add(var2[22]);
                0;
                0;
                if (((178 + 125 - 214 + 94 ^ 143 + 145 - 210 + 68) & (108 + 179 - 204 + 107 ^ 26 + 6 - -73 + 50 ^ -1)) != 0) {
                    return;
                }
            } else if (SquireSepulchre.var10((Object)var11, (Object)z.LV2_ENCHANT)) {
                var7.j().add(var2[23]);
                0;
                0;
                if (3 > 3) {
                    return;
                }
            } else if (SquireSepulchre.var10((Object)var11, (Object)z.LV3_ENCHANT)) {
                var7.j().add(var2[24]);
                0;
                0;
                if ((0x6F ^ 0x6B) <= 3) {
                    return;
                }
            } else if (SquireSepulchre.var10((Object)var11, (Object)z.LV4_ENCHANT)) {
                var7.j().add(var2[25]);
                0;
                0;
                if (((116 + 64 - 61 + 38 ^ 12 + 124 - 83 + 85) & (0x7E ^ 0x3B ^ (0x42 ^ 0x10) ^ -1)) < -1) {
                    return;
                }
            } else if (SquireSepulchre.var10((Object)var11, (Object)z.LV5_ENCHANT)) {
                var7.j().add(var2[25]);
                0;
                var7.j().add(var2[22]);
                0;
                0;
                if null != null {
                    return;
                }
            } else if (SquireSepulchre.var10((Object)var11, (Object)z.LV6_ENCHANT)) {
                var7.j().add(var2[25]);
                0;
                var7.j().add(var2[24]);
                0;
            }
        }
        if (SquireSepulchre.var13((Object)(var5 = var7.m.food()))) {
            var7.j().add(var5.V(), var7.m.foodAmount());
            0;
        }
        if (SquireSepulchre.var10((Object)(var4 = var7.m.lockpick()), (Object)x.STRANGE_LOCKPICK)) {
            var7.j().add(var2[26], var2[1]);
            0;
        }
        if (SquireSepulchre.var10((Object)var4, (Object)x.LOCKPICK)) {
            var7.j().add(var2[27], var2[1]);
            0;
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
        0;
        this.j.add((Overlay)this.l);
        0;
        this.a(new InventorySetup());
        this.b();
    }

    private static boolean var13(Object object) {
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
        Iterator<WorldArea> var14 = list.iterator();
        while (SquireSepulchre.var15(var14.hasNext() ? 1 : 0)) {
            SquireSepulchre var16;
            WorldArea var17 = var14.next();
            var16.f.addAll(var17.toWorldPointList());
            0;
            0;
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
        SquireSepulchre.var18();
        SquireSepulchre.var19();
    }

    public String getName() {
        return this.name;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var2[2]];
        classArray[SquireSepulchre.var2[0]] = OpeningHallowedSacksTask.class;
        classArray[SquireSepulchre.var2[1]] = BankingTask.class;
        classArray[SquireSepulchre.var2[3]] = LootHandlerTask.class;
        classArray[SquireSepulchre.var2[4]] = StaminaHandlerTask.class;
        classArray[SquireSepulchre.var2[5]] = EatingFoodTask.class;
        classArray[SquireSepulchre.var2[6]] = EnterSepulchreTask.class;
        classArray[SquireSepulchre.var2[7]] = FinishingFloorTask.class;
        classArray[SquireSepulchre.var2[8]] = ObstacleHandlerTask.class;
        return classArray;
    }

    public SquireSepulchre() {
        this.a = var2[0];
        this.b = var2[1];
        this.c = new ArrayList<WorldPoint>();
        this.d = new WorldPoint(var2[0], var2[0], var2[0]);
        this.e = new WorldPoint(var2[0], var2[0], var2[0]);
        this.f = new ArrayList<WorldPoint>();
        this.name = var1[var2[0]];
    }

    public WorldPoint g() {
        return this.d;
    }

    private static boolean var9(int n2, int n3) {
        return n2 == n3;
    }

    private static void var19() {
        var1 = new String[var2[1]];
        SquireSepulchre.var1[SquireSepulchre.var2[0]] = SquireSepulchre.var20("YizLrlOiIXo=", "SuSdZ");
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static boolean var10(Object object, Object object2) {
        return object == object2;
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        if (SquireSepulchre.var26(regionPoint)) {
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

    private static void var18() {
        var2 = new int[30];
        SquireSepulchre.var2[0] = (0xBC ^ 0xA7) & ~(0xD ^ 0x16);
        SquireSepulchre.var2[1] = 1;
        SquireSepulchre.var2[2] = 0x10 ^ 0x18;
        SquireSepulchre.var2[3] = 2;
        SquireSepulchre.var2[4] = 3;
        SquireSepulchre.var2[5] = 0x88 ^ 0x8C;
        SquireSepulchre.var2[6] = 0x3E ^ 0x3B;
        SquireSepulchre.var2[7] = 101 + 104 - 99 + 71 ^ 138 + 77 - 207 + 175;
        SquireSepulchre.var2[8] = 0x6A ^ 0x6D;
        SquireSepulchre.var2[9] = 0xFFFF87DA & 0x7BE5;
        SquireSepulchre.var2[10] = 0xFFFFF653 & 0xFAF;
        SquireSepulchre.var2[11] = 0xFFFFB3CE & 0x6E7B;
        SquireSepulchre.var2[12] = -(0xFFFFDC2F & 0x6FFA) & (0xFFFFDEFF & Short.MAX_VALUE);
        SquireSepulchre.var2[13] = 0xFFFFFA7E & 0x27CD;
        SquireSepulchre.var2[14] = -(0xFFFFF767 & 0xCB9) & (0xFFFFBFF7 & 0x56FF);
        SquireSepulchre.var2[15] = 0xFFFFB2DF & 0x6F6E;
        SquireSepulchre.var2[16] = -(0xFFFFC92F & 0x37D7) & (0xFFFF93FF & 0x7FDE);
        SquireSepulchre.var2[17] = 0xFFFFBD2B & 0x4BFF;
        SquireSepulchre.var2[18] = 0xFFFFAFFB & 0x725E;
        SquireSepulchre.var2[19] = -(0xFFFF8DC5 & 0x767B) & (0xFFFFEDDF & 0x76F7);
        SquireSepulchre.var2[20] = 0xFFFFFEFF & 0xDFD;
        SquireSepulchre.var2[21] = -(0xFFFFF5CF & 0x5B32) & (0xFFFFDB3D & 0x77F7);
        SquireSepulchre.var2[22] = 0xFFFFEAEF & 0x173B;
        SquireSepulchre.var2[23] = -(0xFFFFF733 & 0x19CE) & (0xFFFFF7BF & 0x1B6D);
        SquireSepulchre.var2[24] = -(0xFFFFB7DF & 0x6DA6) & (0xFFFFEFEF & 0x37BF);
        SquireSepulchre.var2[25] = -(0xFFFFF1D3 & 0x4EBF) & (0xFFFFF2FF & 0x4FBF);
        SquireSepulchre.var2[26] = 0xFFFFF0F4 & 0x6FAF;
        SquireSepulchre.var2[27] = 0xFFFFBDF7 & 0x47FB;
        SquireSepulchre.var2[28] = -(0xFFFFE63F & 0x1FE3) & (0xFFFFB77F & 0x7FF3);
        SquireSepulchre.var2[29] = 0xFFFFB3D7 & 0x7D7B;
    }

    private static boolean var26(Object object) {
        return object == null;
    }

    public WorldPoint h() {
        return this.e;
    }

    private static boolean var15(int n2) {
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

    private static boolean var12(Object object, Object object2) {
        return object != object2;
    }

    public int d() {
        return this.a;
    }

    protected void onStop() {
        this.h.r();
        this.i.unregister((Object)this.h);
        this.j.remove((Overlay)this.k);
        0;
        this.j.remove((Overlay)this.l);
        0;
    }
}

