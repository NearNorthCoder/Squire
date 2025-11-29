/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.WidgetClosed
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.RuneScapeProfileChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer;

import gg.squire.farmer.GameEnum17;
import gg.squire.farmer.GameEnum9;
import gg.squire.farmer.AHelper;
import gg.squire.farmer.WaitingLoggedOutTask;
import gg.squire.farmer.TurningOnRunTask;
import gg.squire.farmer.BankingBeforeDoingARunTask;
import gg.squire.farmer.BankingForHerbRunSeedsTask;
import gg.squire.farmer.BankingForBirdhouseStuffTask;
import gg.squire.farmer.DepositingBirdhouseMaterialsTask;
import gg.squire.farmer.EmptyingBirdhouseTask;
import gg.squire.farmer.MovingToNextBirdhouseTask;
import gg.squire.farmer.SeedingBirdhouseTask;
import gg.squire.farmer.SettingUpBirdhouseTask;
import gg.squire.farmer.ApplyingCompostPotionToTheBinTask;
import gg.squire.farmer.ApplyingVolcanicAshTask;
import gg.squire.farmer.FillingCompostBinTask;
import gg.squire.farmer.GettingMoreBucketsTask;
import gg.squire.farmer.HarvestingTheCompostBinTask;
import gg.squire.farmer.OpeningTheCompostBinTask;
import gg.squire.farmer.WithdrawingFromLeprechaunTask;
import gg.squire.farmer.ApplyingCompostToPatchTask;
import gg.squire.farmer.ApplyingPlantCureTask;
import gg.squire.farmer.ClearingDeadCropTask;
import gg.squire.farmer.HarvestingCropsTask;
import gg.squire.farmer.FarmerManager;
import gg.squire.farmer.PlantingSeedInPatchTask;
import gg.squire.farmer.RakingTheCurrentPatchTask;
import gg.squire.farmer.MovingToNextRegionTask;
import gg.squire.farmer.CleaningProduceTask;
import gg.squire.farmer.NotingProduceTask;
import gg.squire.farmer.PickingUpProduceTask;
import gg.squire.farmer.PickingUpSeaweedSporesTask;
import gg.squire.farmer.FarmerManager;
import gg.squire.farmer.FarmerManager;
import gg.squire.farmer.FarmerManager;
import gg.squire.farmer.GameEnum8;
import gg.squire.farmer.GameEnum22;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.farmer.SquireFarmerConfig;
import gg.squire.farmer.overlay.StateOverlayPanel;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.WidgetClosed;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.RuneScapeProfileChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="Squire Farmer", description="Automatically does farm runs", enabledByDefault=false)
@SquireUtil
public class SquireFarmer
extends SquirePlugin {
    @Inject
    private  EventBus a;
    private  boolean k;
    private  o o;
    @Inject
    private  ay e;
    @Inject
    private  StateOverlayPanel g;
    @Inject
    private  SquireFarmerConfig h;
    @Inject
    private  j c;
    
    @Inject
    private  Client j;
    @Inject
    private  ConfigManager i;
    @Inject
    private  OverlayManager d;
    @Inject
    private  e f;
    
    private  WorldPoint l;
    @Inject
    private  f b;
    private  boolean m;
    private  int n;

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[2];
        classArray[1] = RakingTheCurrentPatchTask.class;
        classArray[0] = NotingProduceTask.class;
        classArray[3] = CleaningProduceTask.class;
        classArray[4] = PlantingSeedInPatchTask.class;
        classArray[5] = ApplyingCompostToPatchTask.class;
        classArray[6] = HarvestingCropsTask.class;
        classArray[7] = ClearingDeadCropTask.class;
        classArray[8] = MovingToNextRegionTask.class;
        classArray[9] = WithdrawingFromLeprechaunTask.class;
        classArray[SquireFarmer.var2[10]] = ApplyingPlantCureTask.class;
        classArray[SquireFarmer.var2[11]] = FillingCompostBinTask.class;
        classArray[SquireFarmer.var2[12]] = ApplyingCompostPotionToTheBinTask.class;
        classArray[SquireFarmer.var2[13]] = ApplyingVolcanicAshTask.class;
        classArray[SquireFarmer.var2[14]] = GettingMoreBucketsTask.class;
        classArray[SquireFarmer.var2[15]] = HarvestingTheCompostBinTask.class;
        classArray[SquireFarmer.var2[16]] = OpeningTheCompostBinTask.class;
        classArray[SquireFarmer.var2[17]] = PickingUpProduceTask.class;
        classArray[SquireFarmer.var2[18]] = PickingUpSeaweedSporesTask.class;
        classArray[SquireFarmer.var2[19]] = BankingForHerbRunSeedsTask.class;
        classArray[SquireFarmer.var2[20]] = BankingBeforeDoingARunTask.class;
        classArray[SquireFarmer.var2[21]] = EmptyingBirdhouseTask.class;
        classArray[SquireFarmer.var2[22]] = SeedingBirdhouseTask.class;
        classArray[SquireFarmer.var2[23]] = SettingUpBirdhouseTask.class;
        classArray[SquireFarmer.var2[24]] = MovingToNextBirdhouseTask.class;
        classArray[SquireFarmer.var2[25]] = BankingForBirdhouseStuffTask.class;
        classArray[SquireFarmer.var2[26]] = DepositingBirdhouseMaterialsTask.class;
        classArray[SquireFarmer.var2[27]] = WaitingLoggedOutTask.class;
        classArray[SquireFarmer.var2[28]] = TurningOnRunTask.class;
        return classArray;
    }

    protected void onStop() {
        this.a.unregister((Object)this.b);
        this.a.unregister((Object)this.e);
        this.a.unregister((Object)this.f);
        this.a.unregister((Object)this.c);
        this.d.remove((Overlay)this.g);
        0;
        this.d.remove((Overlay)this.e);
        0;
        this.l = null;
        this.m = 1;
        this.b.b(this.a);
    }

    public boolean d() {
        return this.k;
    }

    /*
     * WARNING - void declaration
     */
    public boolean c() {
        void var3;
        o[] oArray = -.m.e.a.u.s.r.r.q.i.r.e.f.o.values();
        int n2 = oArray.length;
        int var4 = 1;
        while ((var4 < (int)var3)) {
            SquireFarmer var5;
            void var6;
            void var7 = var6[var4];
            if ((var5.c(olllllllllllllllIlIllIllIIllIIlll) ? 1 : 0)) {
                0;
                
            } else if ((var5.a(olllllllllllllllIlIllIllIIllIIlll) ? 1 : 0)) {
                return 0;
            }
            ++var4;
            0;
            if ((72 + 147 - 158 + 130 ^ 79 + 134 - 167 + 141) > 1) continue;
            return ((61 + 16 - 53 + 136 ^ 76 + 95 - 82 + 79) & (0x83 ^ 0x98 ^ (0x51 ^ 0x42) ^ -1)) != 0;
        }
        return 1;
    }

    public o a() {
        if ((Object != nullthis.o)) {
            SquireFarmer var8;
            if ((this.b(this.o != 0) ? 1 : 0)) {
                this.o = null;
            }
            return var8.o;
        }
        this.o = this.b();
        return this.o;
    }

    public void a(boolean bl) {
        this.k = bl;
    }

    private boolean c(o o2) {
        switch (-.m.e.a.u.s.r.r.q.i.r.e.f.a.p[o2.ordinal()]) {
            case 1: {
                SquireFarmer var9;
                p[] var10 = p.values();
                int var11 = var10.length;
                int var12 = 1;
                while (var12 < var11) {
                    p var13 = var10[var12];
                    if (((BooleanlllllllllllllllIlIllIllIIlIllIII.i.getConfiguration(var1[4], var13.name().toLowerCase() + ".enabled", Boolean.TYPE)).booleanValue() ? 1 : 0)) {
                        return 1;
                    }
                    ++var12;
                    0;
                    if (-1 <= 0) continue;
                    return ((0x34 ^ 9) & ~(0x15 ^ 0x28)) != 0;
                }
                0;
                if ((3 & (3 ^ -1)) >= 0) break;
                return ((0x20 ^ 0x32 ^ (0xCD ^ 0x93)) & (0x72 ^ 0x5E ^ (0x23 ^ 0x43) ^ -1)) != 0;
            }
            case 2: {
                boolean bl;
                SquireFarmer var9;
                if ((var9.h.birdhouses_enabled( == 0) ? 1 : 0)) {
                    bl = 0;
                    0;
                    if null != null {
                        return ((0xBF ^ 0x83 ^ (0x59 ^ 0x61)) & (0x5F ^ 8 ^ (0x52 ^ 1) ^ -1)) != 0;
                    }
                } else {
                    bl = 1;
                }
                return bl;
            }
        }
        return 0;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(WidgetClosed widgetClosed) {
        if ((widgetClosed.getModalMode() != 0)) {
            this.n = this.j.getTickCount();
        }
    }

    /*
     * WARNING - void declaration
     */
    private o b() {
        void var20;
        o[] oArray = -.m.e.a.u.s.r.r.q.i.r.e.f.o.values();
        int n2 = oArray.length;
        int var21 = 1;
        while ((var21 < (int)var20)) {
            SquireFarmer var22;
            void var23;
            void var24 = var23[var21];
            if ((var22.b((o == 0)var24) ? 1 : 0)) {
                if ((var22.c(olllllllllllllllIlIllIllIIlllIIIl) ? 1 : 0)) {
                    0;
                    if null != null {
                        return null;
                    }
                } else {
                    return var24;
                }
            }
            ++var21;
            0;
            if (3 > ((9 ^ 0x23) & ~(0x58 ^ 0x72))) continue;
            return null;
        }
        this.a(0);
        return null;
    }

    private static String var25(String var26, String var27) {
        var26 = new String(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var28 = new StringBuilder();
        char[] var29 = var27.toCharArray();
        int var30 = 1;
        char[] var31 = var26.toCharArray();
        int var32 = var31.length;
        int var33 = 1;
        while (var33 < var32) {
            char var34 = var31[var33];
            var28.append((char)(var34 ^ var29[var30 % var29.length]));
            0;
            ++var30;
            ++var33;
            0;
            if (3 != -1) continue;
            return null;
        }
        return String.valueOf(var28);
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(o o2) {
        void var35;
        if ((Object == nullo2)) {
            return 1;
        }
        switch (-.m.e.a.u.s.r.r.q.i.r.e.f.a.p[var35.ordinal()]) {
            case 1: {
                boolean bl;
                SquireFarmer var36;
                if (((Object)var36.b.a(A.HERB) == (Object)var36.b.a(A.HERB)2)B.COMPLETED)) {
                    bl = 0;
                    0;
                    if (((0x45 ^ 0x10) & ~(0xC1 ^ 0x94)) > 0) {
                        return ((0xAA ^ 0xBD) & ~(0x57 ^ 0x40)) != 0;
                    }
                } else {
                    bl = 1;
                }
                return bl;
            }
            case 2: {
                boolean bl;
                SquireFarmer var36;
                var36.c.P();
                0;
                if (((Object)var36.c.p() == (Object)var36.c.p()2)B.COMPLETED)) {
                    bl = 0;
                    0;
                    if (((0xB9 ^ 0xAF) & ~(0x3D ^ 0x2B)) >= (0x63 ^ 0x67)) {
                        return ((0x83 ^ 0x99) & ~(0xAF ^ 0xB5)) != 0;
                    }
                } else {
                    bl = 1;
                }
                return bl;
            }
        }
        return 1;
    }

    /*
     * Unable to fully structure code
     */
    private boolean b(o var1_1) {
        switch (-.m.e.a.u.s.r.r.q.i.r.e.f.a.p[var1_1.ordinal()]) {
            case 1: {
                if ((var37.b.x( == null))) {
                    v0 = 0;
                    0;
                    if (((178 ^ 130) & ~(125 ^ 77)) != 0) {
                        return (boolean)((46 ^ 112) & ~(63 ^ 97));
                    }
                } else {
                    v0 = 1;
                }
                return v0;
            }
            case 2: {
                if (!(Object == nulllllllllllllllllIlIllIllIIllIIIII.c.O())) ** GOTO lbl-1000
                if (!(Game.getState() != Game.getState()2)) ** GOTO lbl-1000
                v1 = new String[4];
                v1[1] = SquireFarmer.var1[1];
                v1[0] = SquireFarmer.var1[0];
                v1[3] = SquireFarmer.var1[3];
                if (((int == 0)Inventory.contains((String[])v1))) lbl-1000:
                // 2 sources

                {
                    v2 = 0;
                    0;
                    if (-3 >= 0) {
                        return (boolean)((102 ^ 116 ^ 3) & (132 ^ 174 ^ (5 ^ 62) ^ -1));
                    }
                } else lbl-1000:
                // 2 sources

                {
                    v2 = 1;
                }
                return (boolean)v2;
            }
        }
        return 0;
    }

    public SquireFarmer() {
        this.k = 0;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        SquireFarmer var38;
        if ((this.j.getGameState() != this.j.getGameState()2)) {
            this.l = null;
            return;
        }
        Widget var39 = var38.j.getWidget(WidgetInfo.LOGIN_CLICK_TO_PLAY_SCREEN_MESSAGE_OF_THE_DAY);
        if (var39 != null && (var39.isHidden( == 0) ? 1 : 0)) {
            var38.m = 0;
            return;
        }
        if (var38.m != 0) {
            var38.m = 1;
            return;
        }
        WorldPoint var40 = var38.l;
        var38.l = var38.j.getLocalPlayer().getWorldLocation();
        if (!var40 != null || (var40.getRegionID() != var38.l.getRegionID())) {
            return;
        }
        int n2 = var38.c.a(var40);
        int n3 = var38.b.a(var40, var38.j.getTickCount() - var38.n);
        int n4 = var38.f.a(var40);
        if (!(n2 == 0) || !(n3 == 0) || n4) {
            // empty if block
        }
    }

    protected void onStart() {
        this.c.M();
        this.a.register((Object)this.b);
        this.a.register((Object)this.e);
        this.a.register((Object)this.c);
        this.b.a(this.a);
        this.d.add((Overlay)this.e);
        0;
        this.d.add((Overlay)this.g);
        0;
        this.b.D();
        this.k = 0;
    }

    @Subscribe
    public void a(RuneScapeProfileChanged runeScapeProfileChanged) {
        this.b.D();
        this.c.M();
        this.f.l();
    }

    @Provides
    SquireFarmerConfig a(ConfigManager configManager) {
        return (SquireFarmerConfig)configManager.getConfig(SquireFarmerConfig.class);
    }
}

