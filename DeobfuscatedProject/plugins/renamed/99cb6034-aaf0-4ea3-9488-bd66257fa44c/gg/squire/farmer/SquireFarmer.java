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

import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.BEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.a_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.WaitingLoggedOutTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.TurningOnRunTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.BankingBeforeDoingARunTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.BankingForHerbRunSeedsTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.BankingForBirdhouseStuffTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.DepositingBirdhouseMaterialsTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.EmptyingBirdhouseTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.MovingToNextBirdhouseTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.SeedingBirdhouseTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.SettingUpBirdhouseTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ApplyingCompostPotionToTheBinTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ApplyingVolcanicAshTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.FillingCompostBinTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.GettingMoreBucketsTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HarvestingTheCompostBinTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.OpeningTheCompostBinTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.WithdrawingFromLeprechaunTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ApplyingCompostToPatchTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ApplyingPlantCureTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ClearingDeadCropTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HarvestingCropsTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ay_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.PlantingSeedInPatchTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.RakingTheCurrentPatchTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.MovingToNextRegionTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.CleaningProduceTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.NotingProduceTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.PickingUpProduceTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.PickingUpSeaweedSporesTask;
import -.m.e.a.u.s.r.r.q.i.r.e.f.e_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.j_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
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
    private /* synthetic */ EventBus a;
    private /* synthetic */ boolean k;
    private /* synthetic */ o o;
    @Inject
    private /* synthetic */ ay e;
    @Inject
    private /* synthetic */ StateOverlayPanel g;
    @Inject
    private /* synthetic */ SquireFarmerConfig h;
    @Inject
    private /* synthetic */ j c;
    private static /* synthetic */ String[] lIlllIIlllll;
    @Inject
    private /* synthetic */ Client j;
    @Inject
    private /* synthetic */ ConfigManager i;
    @Inject
    private /* synthetic */ OverlayManager d;
    @Inject
    private /* synthetic */ e f;
    private static /* synthetic */ int[] lIlllIlIIIII;
    private /* synthetic */ WorldPoint l;
    @Inject
    private /* synthetic */ f b;
    private /* synthetic */ boolean m;
    private /* synthetic */ int n;

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
        0;
        this.d.remove((Overlay)this.e);
        0;
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
        o[] oArray = -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType.values();
        int n2 = oArray.length;
        int var33 = lIlllIlIIIII[1];
        while (SquireFarmer.lllIllIIIIlIII(var33, (int)var1)) {
            SquireFarmer var3;
            void var11;
            void var29 = var11[var33];
            if (SquireFarmer.lllIllIIIIIllI(var3.c((o)var29) ? 1 : 0)) {
                0;
                if (1 == 0) {
                    return false;
                }
            } else if (SquireFarmer.lllIllIIIIIllI(var3.a((o)var29) ? 1 : 0)) {
                return lIlllIlIIIII[0];
            }
            ++var33;
            0;
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
            SquireFarmer var30;
            if (SquireFarmer.lllIllIIIIIllI(this.b(this.o) ? 1 : 0)) {
                this.o = null;
            }
            return var30.o;
        }
        this.o = this.b();
        return this.o;
    }

    public void a(boolean bl) {
        this.k = bl;
    }

    private boolean c(o o2) {
        switch (-.m.e.a.u.s.r.r.q.i.r.e.f.a_Unknown.p[o2.ordinal()]) {
            case 1: {
                SquireFarmer var6;
                p[] var35 = p.values();
                int var22 = var35.length;
                int var24 = lIlllIlIIIII[1];
                while (SquireFarmer.lllIllIIIIlIII(var24, var22)) {
                    p var4 = var35[var24];
                    if (SquireFarmer.lllIllIIIIIllI(((Boolean)var6.i.getConfiguration(lIlllIIlllll[lIlllIlIIIII[4]], var4.name().toLowerCase() + ".enabled", Boolean.TYPE)).booleanValue() ? 1 : 0)) {
                        return lIlllIlIIIII[1];
                    }
                    ++var24;
                    0;
                    if (-1 <= 0) continue;
                    return false;
                }
                0;
                if ((3 & (3 ^ -1)) >= 0) break;
                return ((0x20 ^ 0x32 ^ (0xCD ^ 0x93)) & (0x72 ^ 0x5E ^ (0x23 ^ 0x43) ^ -1)) != 0;
            }
            case 2: {
                boolean bl;
                SquireFarmer var6;
                if (SquireFarmer.lllIllIIIIIlIl(var6.h.birdhouses_enabled() ? 1 : 0)) {
                    bl = lIlllIlIIIII[0];
                    0;
                    
                    }
                } else {
                    bl = lIlllIlIIIII[1];
                }
                return bl;
            }
        }
        return lIlllIlIIIII[0];
    }

    private static String lllIlIllllllll(String var5, String var12) {
        try {
            SecretKeySpec var27 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIlllIlIIIII[9]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lIlllIlIIIII[3], var27);
            return new String(var21.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(WidgetClosed widgetClosed) {
        if (SquireFarmer.lllIllIIIIIlll(widgetClosed.getModalMode(), lIlllIlIIIII[0])) {
            this.n = this.j.getTickCount();
        }
    }

    private static void lllIllIIIIIIIl() {
        lIlllIIlllll = new String[lIlllIlIIIII[5]];
        SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[1]] = SquireFarmer."Bird nest";
        SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[0]] = SquireFarmer."Hammer";
        SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[3]] = SquireFarmer."Chisel";
        SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[4]] = SquireFarmer."squirefarmer";
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
        void var17;
        o[] oArray = -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType.values();
        int n2 = oArray.length;
        int var7 = lIlllIlIIIII[1];
        while (SquireFarmer.lllIllIIIIlIII(var7, (int)var17)) {
            SquireFarmer var14;
            void var2;
            void var31 = var2[var7];
            if (SquireFarmer.lllIllIIIIIlIl(var14.b((o)var31) ? 1 : 0)) {
                if (SquireFarmer.lllIllIIIIIllI(var14.c((o)var31) ? 1 : 0)) {
                    0;
                    
                    }
                } else {
                    return var31;
                }
            }
            ++var7;
            0;
            if (3 > ((9 ^ 0x23) & ~(0x58 ^ 0x72))) continue;
            return null;
        }
        this.a(lIlllIlIIIII[0]);
        return null;
    }

    private static String lllIllIIIIIIII(String var32, String var26) {
        var32 = new String(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var36 = var26.toCharArray();
        int var20 = lIlllIlIIIII[1];
        char[] var19 = var32.toCharArray();
        int var34 = var19.length;
        int var15 = lIlllIlIIIII[1];
        while (SquireFarmer.lllIllIIIIlIII(var15, var34)) {
            char var13 = var19[var15];
            var23.append((char)(var13 ^ var36[var20 % var36.length]));
            0;
            ++var20;
            ++var15;
            0;
            if (3 != -1) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(o o2) {
        void var8;
        if (SquireFarmer.lllIllIIIIlIIl((Object)o2)) {
            return lIlllIlIIIII[1];
        }
        switch (-.m.e.a.u.s.r.r.q.i.r.e.f.a_Unknown.p[var8.ordinal()]) {
            case 1: {
                boolean bl;
                SquireFarmer var10;
                if (SquireFarmer.lllIllIIIIlIlI((Object)var10.b.a(A.HERB), (Object)B.COMPLETED)) {
                    bl = lIlllIlIIIII[0];
                    0;
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
                SquireFarmer var10;
                var10.c.P();
                0;
                if (SquireFarmer.lllIllIIIIlIlI((Object)var10.c.p(), (Object)B.COMPLETED)) {
                    bl = lIlllIlIIIII[0];
                    0;
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
        switch (-.m.e.a.u.s.r.r.q.i.r.e.f.a_Unknown.p[var1_1.ordinal()]) {
            case 1: {
                if (SquireFarmer.lllIllIIIIlIIl(var16.b.x())) {
                    v0 = SquireFarmer.lIlllIlIIIII[0];
                    0;
                    if (((178 ^ 130) & ~(125 ^ 77)) != 0) {
                        return (boolean)((46 ^ 112) & ~(63 ^ 97));
                    }
                } else {
                    v0 = SquireFarmer.lIlllIlIIIII[1];
                }
                return v0;
            }
            case 2: {
                if (!SquireFarmer.lllIllIIIIlIIl((Object)var16.c.O())) ** GOTO lbl-1000
                if (!SquireFarmer.lllIllIIIIIIll(Game.getState(), GameState.LOGIN_SCREEN)) ** GOTO lbl-1000
                v1 = new String[SquireFarmer.lIlllIlIIIII[4]];
                v1[SquireFarmer.lIlllIlIIIII[1]] = SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[1]];
                v1[SquireFarmer.lIlllIlIIIII[0]] = SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[0]];
                v1[SquireFarmer.lIlllIlIIIII[3]] = SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[3]];
                if (SquireFarmer.lllIllIIIIIlIl((int)Inventory.contains((String[])v1))) lbl-1000:
                // 2 sources

                {
                    v2 = SquireFarmer.lIlllIlIIIII[0];
                    0;
                    if (-3 >= 0) {
                        return (boolean)((102 ^ 116 ^ 3) & (132 ^ 174 ^ (5 ^ 62) ^ -1));
                    }
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

    private static void lllIllIIIIIIlI() {
        lIlllIlIIIII = new int[29];
        SquireFarmer.lIlllIlIIIII[0] = 1;
        SquireFarmer.lIlllIlIIIII[1] = (0xF6 ^ 0xA1) & ~(0xE1 ^ 0xB6);
        SquireFarmer.lIlllIlIIIII[2] = 0x99 ^ 0xB9 ^ (0x94 ^ 0xA8);
        SquireFarmer.lIlllIlIIIII[3] = 2;
        SquireFarmer.lIlllIlIIIII[4] = 3;
        SquireFarmer.lIlllIlIIIII[5] = 0x5C ^ 0x58;
        SquireFarmer.lIlllIlIIIII[6] = 0xA7 ^ 0xC6 ^ (0xC2 ^ 0xA6);
        SquireFarmer.lIlllIlIIIII[7] = 113 + 144 - 141 + 47 ^ 48 + 10 - 11 + 118;
        SquireFarmer.lIlllIlIIIII[8] = 0x91 ^ 0x96;
        SquireFarmer.lIlllIlIIIII[9] = 97 + 115 - 139 + 93 ^ 27 + 57 - -82 + 8;
        SquireFarmer.lIlllIlIIIII[10] = 0xC9 ^ 0xC0;
        SquireFarmer.lIlllIlIIIII[11] = 0xB0 ^ 0x8F ^ (0x58 ^ 0x6D);
        SquireFarmer.lIlllIlIIIII[12] = 43 + 50 - 12 + 57 ^ 103 + 1 - 45 + 70;
        SquireFarmer.lIlllIlIIIII[13] = 10 + 117 - -23 + 26 ^ 157 + 109 - 264 + 186;
        SquireFarmer.lIlllIlIIIII[14] = 0x81 ^ 0x8C;
        SquireFarmer.lIlllIlIIIII[15] = 0x1C ^ 0x12;
        SquireFarmer.lIlllIlIIIII[16] = 0xA6 ^ 0xA9;
        SquireFarmer.lIlllIlIIIII[17] = 0x1F ^ 0xF;
        SquireFarmer.lIlllIlIIIII[18] = 0x4B ^ 0x1C ^ (0x24 ^ 0x62);
        SquireFarmer.lIlllIlIIIII[19] = 0x86 ^ 0x94;
        SquireFarmer.lIlllIlIIIII[20] = 0xB5 ^ 0xA6;
        SquireFarmer.lIlllIlIIIII[21] = 0xBF ^ 0xAB;
        SquireFarmer.lIlllIlIIIII[22] = 118 + 66 - 114 + 86 ^ 3 + 81 - -6 + 47;
        SquireFarmer.lIlllIlIIIII[23] = 2 + 171 - 32 + 34 ^ 36 + 128 - 118 + 139;
        SquireFarmer.lIlllIlIIIII[24] = 105 + 12 - -23 + 2 ^ 66 + 20 - 38 + 105;
        SquireFarmer.lIlllIlIIIII[25] = 0xB1 ^ 0xA9;
        SquireFarmer.lIlllIlIIIII[26] = 0x3C ^ 0x25;
        SquireFarmer.lIlllIlIIIII[27] = 0x13 ^ 9;
        SquireFarmer.lIlllIlIIIII[28] = 0x5D ^ 0x46;
    }

    private static boolean lllIllIIIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIllIIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        SquireFarmer var9;
        if (SquireFarmer.lllIllIIIIIIll(this.j.getGameState(), GameState.LOGGED_IN)) {
            this.l = null;
            return;
        }
        Widget var25 = var9.j.getWidget(WidgetInfo.LOGIN_CLICK_TO_PLAY_SCREEN_MESSAGE_OF_THE_DAY);
        if (SquireFarmer.lllIllIIIIIlII(var25) && SquireFarmer.lllIllIIIIIlIl(var25.isHidden() ? 1 : 0)) {
            var9.m = lIlllIlIIIII[0];
            return;
        }
        if (SquireFarmer.lllIllIIIIIllI(var9.m ? 1 : 0)) {
            var9.m = lIlllIlIIIII[1];
            return;
        }
        WorldPoint var18 = var9.l;
        var9.l = var9.j.getLocalPlayer().getWorldLocation();
        if (!SquireFarmer.lllIllIIIIIlII(var18) || SquireFarmer.lllIllIIIIIlll(var18.getRegionID(), var9.l.getRegionID())) {
            return;
        }
        int n2 = var9.c.a(var18);
        int n3 = var9.b.a(var18, var9.j.getTickCount() - var9.n);
        int n4 = var9.f.a(var18);
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
        0;
        this.d.add((Overlay)this.g);
        0;
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

