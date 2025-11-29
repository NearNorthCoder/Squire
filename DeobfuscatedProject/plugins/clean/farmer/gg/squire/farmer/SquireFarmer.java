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

import gg.squire.farmer.GameEnum56;
import gg.squire.farmer.GameEnum17;
import -.m.e.a.u.s.r.r.q.i.r.e.f.a;
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
import gg.squire.farmer.GameEnum14;
import gg.squire.farmer.GameEnum62;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.farmer.SquireFarmerConfig;
import gg.squire.farmer.overlay.StateOverlayPanel;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        Class[] classArray = new Class[lIlllIlIIIII[2]];
        classArray[SquireFarmer.lIlllIlIIIII[1]] = RakingTheCurrentPatchTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[0]] = NotingProduceTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[3]] = CleaningProduceTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[4]] = PlantingSeedInPatchTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[5]] = ApplyingCompostToPatchTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[6]] = HarvestingCropsTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[7]] = ClearingDeadCropTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[8]] = MovingToNextRegionTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[9]] = WithdrawingFromLeprechaunTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[10]] = ApplyingPlantCureTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[11]] = FillingCompostBinTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[12]] = ApplyingCompostPotionToTheBinTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[13]] = ApplyingVolcanicAshTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[14]] = GettingMoreBucketsTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[15]] = HarvestingTheCompostBinTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[16]] = OpeningTheCompostBinTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[17]] = PickingUpProduceTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[18]] = PickingUpSeaweedSporesTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[19]] = BankingForHerbRunSeedsTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[20]] = BankingBeforeDoingARunTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[21]] = EmptyingBirdhouseTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[22]] = SeedingBirdhouseTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[23]] = SettingUpBirdhouseTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[24]] = MovingToNextBirdhouseTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[25]] = BankingForBirdhouseStuffTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[26]] = DepositingBirdhouseMaterialsTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[27]] = WaitingLoggedOutTask.class;
        classArray[SquireFarmer.lIlllIlIIIII[28]] = TurningOnRunTask.class;
        return classArray;
    }

    protected void onStop() {
        this.a.unregister((Object)this.b);
        this.a.unregister((Object)this.e);
        this.a.unregister((Object)this.f);
        this.a.unregister((Object)this.c);
        this.d.remove((Overlay)this.g);

        this.d.remove((Overlay)this.e);

        this.l = null;
        this.m = lIlllIlIIIII[1];
        this.b.b(this.a);
    }

    public boolean d() {
        return this.k;
    }

    private static boolean lllIllIIIIIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIllIIIIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean c() {
        void var1;
        o[] oArray = -.m.e.a.u.s.r.r.q.i.r.e.f.o.values();
        int n2 = oArray.length;
        int var2 = lIlllIlIIIII[1];
        while (SquireFarmer.lllIllIIIIlIII(var2, (int)var1)) {
            SquireFarmer var3;
            void var4;
            void var5 = var4[var2];
            if (SquireFarmer.lllIllIIIIIllI(var3.c((GameEnum14) ar5) ? 1 : 0)) {

                if (1 == 0) {
                    return false;
                }
            } else if (SquireFarmer.lllIllIIIIIllI(var3.a((GameEnum14) ar5) ? 1 : 0)) {
                return lIlllIlIIIII[0];
            }
            ++var2;

            if ((72 + 147 - 158 + 130 ^ 79 + 134 - 167 + 141) > 1) continue;
            return ((61 + 16 - 53 + 136 ^ 76 + 95 - 82 + 79) & (0x83 ^ 0x98 ^ (0x51 ^ 0x42) ^ -1)) != 0;
        }
        return lIlllIlIIIII[1];
    }

    private static boolean lllIllIIIIIllI(int n2) {
        return n2 != 0;
    }

    public o a() {
        if (SquireFarmer.lllIllIIIIIlII((Object)this.o)) {
            SquireFarmer var6;
            if (SquireFarmer.lllIllIIIIIllI(this.b(this.o) ? 1 : 0)) {
                this.o = null;
            }
            return var6.o;
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
                SquireFarmer var7;
                p[] var8 = p.values();
                int var9 = var8.length;
                int var10 = lIlllIlIIIII[1];
                while (SquireFarmer.lllIllIIIIlIII(var10, var9)) {
                    p var11 = var8[var10];
                    if (SquireFarmer.lllIllIIIIIllI(((Boolean)var7.i.getConfiguration(lIlllIIlllll[lIlllIlIIIII[4]], var11.name().toLowerCase() + ".enabled", Boolean.TYPE)).booleanValue() ? 1 : 0)) {
                        return lIlllIlIIIII[1];
                    }
                    ++var10;

                    if (-1 <= 0) continue;
                    return false;
                }

                if ((3 & (3 ^ -1)) >= 0) break;
                return ((0x20 ^ 0x32 ^ (0xCD ^ 0x93)) & (0x72 ^ 0x5E ^ (0x23 ^ 0x43) ^ -1)) != 0;
            }
            case 2: {
                boolean bl;
                SquireFarmer var7;
                if (SquireFarmer.lllIllIIIIIlIl(var7.h.birdhouses_enabled() ? 1 : 0)) {
                    bl = lIlllIlIIIII[0];

                    }
                } else {
                    bl = lIlllIlIIIII[1];
                }
                return bl;
            }
        }
        return lIlllIlIIIII[0];
    }

    @Subscribe
    private void a(WidgetClosed widgetClosed) {
        if (SquireFarmer.lllIllIIIIIlll(widgetClosed.getModalMode(), lIlllIlIIIII[0])) {
            this.n = this.j.getTickCount();
        }
    }

    private static void lllIllIIIIIIIl() {
        lIlllIIlllll = new String[lIlllIlIIIII[5]];
        SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[1]] = "Bird nest";
        SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[0]] = "Hammer";
        SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[3]] = "Chisel";
        SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[4]] = "squirefarmer";
    }

    private static boolean lllIllIIIIIIll(Object object, Object object2) {
        return object != object2;
    }

    static {
        SquireFarmer.lllIllIIIIIIlI();
        SquireFarmer.lllIllIIIIIIIl();
    }

    /*
     * WARNING - void declaration
     */
    private o b() {
        void var12;
        o[] oArray = -.m.e.a.u.s.r.r.q.i.r.e.f.o.values();
        int n2 = oArray.length;
        int var13 = lIlllIlIIIII[1];
        while (SquireFarmer.lllIllIIIIlIII(var13, (int)var12)) {
            SquireFarmer var14;
            void var15;
            void var16 = var15[var13];
            if (SquireFarmer.lllIllIIIIIlIl(var14.b((GameEnum14) ar16) ? 1 : 0)) {
                if (SquireFarmer.lllIllIIIIIllI(var14.c((GameEnum14) ar16) ? 1 : 0)) {

                    }
                } else {
                    return var16;
                }
            }
            ++var13;

            if (3 > ((9 ^ 0x23) & ~(0x58 ^ 0x72))) continue;
            return null;
        }
        this.a(lIlllIlIIIII[0]);
        return null;
    }

        return String.valueOf(var17);
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(o o2) {
        void var18;
        if (SquireFarmer.lllIllIIIIlIIl((Object)o2)) {
            return lIlllIlIIIII[1];
        }
        switch (-.m.e.a.u.s.r.r.q.i.r.e.f.a.p[var18.ordinal()]) {
            case 1: {
                boolean bl;
                SquireFarmer var19;
                if (SquireFarmer.lllIllIIIIlIlI((Object)var19.b.a(A.HERB), (Object)B.COMPLETED)) {
                    bl = lIlllIlIIIII[0];

                    if (((0x45 ^ 0x10) & ~(0xC1 ^ 0x94)) > 0) {
                        return false;
                    }
                } else {
                    bl = lIlllIlIIIII[1];
                }
                return bl;
            }
            case 2: {
                boolean bl;
                SquireFarmer var19;
                var19.c.P();

                if (SquireFarmer.lllIllIIIIlIlI((Object)var19.c.p(), (Object)B.COMPLETED)) {
                    bl = lIlllIlIIIII[0];

                    if (((0xB9 ^ 0xAF) & ~(0x3D ^ 0x2B)) >= (0x63 ^ 0x67)) {
                        return false;
                    }
                } else {
                    bl = lIlllIlIIIII[1];
                }
                return bl;
            }
        }
        return lIlllIlIIIII[1];
    }

    private static boolean lllIllIIIIlIIl(Object object) {
        return object == null;
    }

    /*
     * Unable to fully structure code
     */
    private boolean b(o var1_1) {
        switch (-.m.e.a.u.s.r.r.q.i.r.e.f.a.p[var1_1.ordinal()]) {
            case 1: {
                if (SquireFarmer.lllIllIIIIlIIl(var20.b.x())) {
                    v0 = SquireFarmer.lIlllIlIIIII[0];

                    if (((178 ^ 130) & ~(125 ^ 77)) != 0) {
                        return (boolean)((46 ^ 112) & ~(63 ^ 97));
                    }
                } else {
                    v0 = SquireFarmer.lIlllIlIIIII[1];
                }
                return v0;
            }
            case 2: {
                if (!SquireFarmer.lllIllIIIIlIIl((Object)var20.c.O())) ** GOTO lbl-1000
                if (!SquireFarmer.lllIllIIIIIIll(Game.getState(), GameState.LOGIN_SCREEN)) ** GOTO lbl-1000
                v1 = new String[SquireFarmer.lIlllIlIIIII[4]];
                v1[SquireFarmer.lIlllIlIIIII[1]] = SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[1]];
                v1[SquireFarmer.lIlllIlIIIII[0]] = SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[0]];
                v1[SquireFarmer.lIlllIlIIIII[3]] = SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[3]];
                if (SquireFarmer.lllIllIIIIIlIl((int)Inventory.contains((String[])v1))) lbl-1000:
                // 2 sources

                {
                    v2 = SquireFarmer.lIlllIlIIIII[0];

                } else lbl-1000:
                // 2 sources

                {
                    v2 = SquireFarmer.lIlllIlIIIII[1];
                }
                return (boolean)v2;
            }
        }
        return SquireFarmer.lIlllIlIIIII[0];
    }

    public SquireFarmer() {
        this.k = lIlllIlIIIII[0];
    }

    private static boolean lllIllIIIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIllIIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        SquireFarmer var21;
        if (SquireFarmer.lllIllIIIIIIll(this.j.getGameState(), GameState.LOGGED_IN)) {
            this.l = null;
            return;
        }
        Widget var22 = var21.j.getWidget(WidgetInfo.LOGIN_CLICK_TO_PLAY_SCREEN_MESSAGE_OF_THE_DAY);
        if (SquireFarmer.lllIllIIIIIlII(var22) && SquireFarmer.lllIllIIIIIlIl(var22.isHidden() ? 1 : 0)) {
            var21.m = lIlllIlIIIII[0];
            return;
        }
        if (SquireFarmer.lllIllIIIIIllI(var21.m ? 1 : 0)) {
            var21.m = lIlllIlIIIII[1];
            return;
        }
        WorldPoint var23 = var21.l;
        var21.l = var21.j.getLocalPlayer().getWorldLocation();
        if (!SquireFarmer.lllIllIIIIIlII(var23) || SquireFarmer.lllIllIIIIIlll(var23.getRegionID(), var21.l.getRegionID())) {
            return;
        }
        int n2 = var21.c.a(var23);
        int n3 = var21.b.a(var23, var21.j.getTickCount() - var21.n);
        int n4 = var21.f.a(var23);
        if (!SquireFarmer.lllIllIIIIIlIl(n2) || !SquireFarmer.lllIllIIIIIlIl(n3) || SquireFarmer.lllIllIIIIIllI(n4)) {
            // empty if block
        }
    }

    private static boolean lllIllIIIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    protected void onStart() {
        this.c.M();
        this.a.register((Object)this.b);
        this.a.register((Object)this.e);
        this.a.register((Object)this.c);
        this.b.a(this.a);
        this.d.add((Overlay)this.e);

        this.d.add((Overlay)this.g);

        this.b.D();
        this.k = lIlllIlIIIII[0];
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

