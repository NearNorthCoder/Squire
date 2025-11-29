/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.SoundEffectPlayed
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.game.ItemStack
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.loottracker.LootReceived
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.autotoa.TOAConfig;
import gg.squire.autotoa.overlay.debug.DebugOverlay;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.SoundEffectPlayed;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemStack;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.client.Static;
import gg.squire.autotoa.AutotoaManager;
import gg.squire.autotoa.AutotoaManager;
import gg.squire.autotoa.MHelper;
import gg.squire.autotoa.NHelper;
import gg.squire.autotoa.AutotoaManager;
import gg.squire.autotoa.PHelper;
import gg.squire.autotoa.QHelper;
import gg.squire.autotoa.RHelper;
import gg.squire.autotoa.AutotoaManager;
import gg.squire.autotoa.EnteringNextPathTask;
import gg.squire.autotoa.PreventingLogoutTask;
import gg.squire.autotoa.GrabbingPickaxeTask;
import gg.squire.autotoa.SolvingLightPuzzleTask;
import gg.squire.autotoa.HandlingObeliskPrayersTask;
import gg.squire.autotoa.HandlingWardenPrayersTask;
import gg.squire.autotoa.HandlingElidinisP3PrayersTask;
import gg.squire.autotoa.HandlingTumekenP3PrayersTask;
import gg.squire.autotoa.HandlingBabaPrayersTask;
import gg.squire.autotoa.DoingBoulderDashTask;
import gg.squire.autotoa.RedXCycleTask;
import gg.squire.autotoa.AttackingBabaTask;
import gg.squire.autotoa.AttackingBaboonsTask;
import gg.squire.autotoa.DodgingFallingBoulderTask;
import gg.squire.autotoa.DodgingFloorTilesTask;
import gg.squire.autotoa.MovingNextToRubbleTask;
import gg.squire.autotoa.AttackingABaboonTask;
import gg.squire.autotoa.HandlingBabboonPrayersTask;
import gg.squire.autotoa.DoingTask;
import gg.squire.autotoa.DodgingVolatileBaboonTask;
import gg.squire.autotoa.LootingChestRoomTask;
import gg.squire.autotoa.AttackingKephriTask;
import gg.squire.autotoa.TurningOnRunTask;
import gg.squire.autotoa.ApplyingSilkTask;
import gg.squire.autotoa.CrackingScarabTask;
import gg.squire.autotoa.DrinkingAmbrosiaTask;
import gg.squire.autotoa.DrinkingBrewTask;
import gg.squire.autotoa.DrinkingPotionTask;
import gg.squire.autotoa.DrinkingPrayerTask;
import gg.squire.autotoa.DrinkingRestoreTask;
import gg.squire.autotoa.DrinkingStaminaTask;
import gg.squire.autotoa.DroppingUnnecessarySuppliesTask;
import gg.squire.autotoa.EatingFoodTask;
import gg.squire.autotoa.CuringPoisonvenomTask;
import gg.squire.autotoa.SmellingSaltsTask;
import gg.squire.autotoa.UsingSunKerisSpecialTask;
import gg.squire.autotoa.HandlingAkkhaPrayersTask;
import gg.squire.autotoa.AttackingAkkhaTask;
import gg.squire.autotoa.AttackingAkkhaShadowTask;
import gg.squire.autotoa.KeepBackAkkhaTask;
import gg.squire.autotoa.LuringAkkhaToQuadrantTask;
import gg.squire.autotoa.SolvingMemoryPuzzleTask;
import gg.squire.autotoa.SkippingAkkhaDpsTask;
import gg.squire.autotoa.AttackingAkkhaButterflyTask;
import gg.squire.autotoa.AttackingCoreTask;
import gg.squire.autotoa.DodgingElectricSkullTask;
import gg.squire.autotoa.DodgingSolidifyAttackTask;
import gg.squire.autotoa.MovingToSafespotTask;
import gg.squire.autotoa.GoingToFinalPhaseTask;
import gg.squire.autotoa.AttackingP1WardenTask;
import gg.squire.autotoa.AttackingSkullsTask;
import gg.squire.autotoa.DodgingBabaBoulderTask;
import gg.squire.autotoa.DodgingLightningTask;
import gg.squire.autotoa.DodgingTilesTask;
import gg.squire.autotoa.AttackingFinalWardenTask;
import gg.squire.autotoa.AttackingZebakTask;
import gg.squire.autotoa.AvoidingBloodCloudTask;
import gg.squire.autotoa.ClearingBoulderTask;
import gg.squire.autotoa.DodgingPoisonSplatTask;
import gg.squire.autotoa.DodgingWaveTask;
import gg.squire.autotoa.EscapingWaterTask;
import gg.squire.autotoa.MovingOffPoisonTask;
import gg.squire.autotoa.MovingToCenterTask;
import gg.squire.autotoa.HandlingZebakPrayersTask;
import gg.squire.autotoa.RunningWaterTask;
import gg.squire.autotoa.AttackingMageScarabTask;
import gg.squire.autotoa.AttackingMeleeScarabTask;
import gg.squire.autotoa.AttackingKephriSwarmMedicTask;
import gg.squire.autotoa.AttackingSwarmsTask;
import gg.squire.autotoa.DodgingDungAttackTask;
import gg.squire.autotoa.DodgingProjectileTask;
import gg.squire.autotoa.KillingAnnoyingEggTask;
import gg.squire.autotoa.HandlingKephriPrayersTask;
import gg.squire.autotoa.MovingAwayFromAllDungTask;
import gg.squire.autotoa.MovingToBestSpotTask;
import gg.squire.autotoa.SolvingLightPuzzleTask;
import gg.squire.autotoa.DoingMatchPuzzleTask;
import gg.squire.autotoa.SolvingObeliskPuzzleTask;
import gg.squire.autotoa.DoingPressureOrderTask;
import gg.squire.autotoa.DoingPressurePlatesPuzzleTask;
import gg.squire.autotoa.ProgressPuzzleTask;
import gg.squire.autotoa.PuzzlePrayerHandlerTask;
import gg.squire.autotoa.AttackingObeliskTask;
import gg.squire.autotoa.DodgingUfosTask;
import gg.squire.autotoa.MovingToRightSpotWithChargingTask;
import gg.squire.autotoa.SunKerisObeliskTask;
import gg.squire.autotoa.ClaimingSuppliesTask;
import gg.squire.autotoa.DecantingPotionsTask;
import gg.squire.autotoa.WithdrawingSuppliesTask;
import gg.squire.autotoa.BankingToGoBackInTask;
import gg.squire.autotoa.ClaimingDeathItemsTask;
import gg.squire.autotoa.ClaimingRewardsOutsideTask;
import gg.squire.autotoa.CreatingToaPartyTask;
import gg.squire.autotoa.EnteringToaTask;
import gg.squire.autotoa.HoppingToDifferentWorldTask;
import gg.squire.autotoa.RechargingTridentTask;
import gg.squire.autotoa.LoggingOutAndStoppingTask;
import gg.squire.autotoa.AutotoaManager;
import gg.squire.autotoa.AutotoaManager;
import gg.squire.autotoa.AutotoaManager;
import gg.squire.autotoa.AutotoaManager;
import gg.squire.autotoa.AutotoaManager;

@PluginDescriptor(name="Squire Auto TOA", description="Different helpers/automation for TOA", enabledByDefault=false)
@SquireUtil
public class SquireAutoTOA
extends SquirePlugin {
    @Inject
    private  N p;
    private static final  Set<Integer> b;
    @Inject
    private  C t;
    @Inject
    private  DebugOverlay r;
    @Inject
    private  Q l;
    @Inject
    private  O q;
    private  boolean x;
    @Inject
    private  OverlayManager k;
    
    @Inject
    private  T s;
    private  boolean u;
    private  int w;
    private  int z;
    @Inject
    private  ConfigManager c;
    private  int A;
    private static final  Set<Integer> a;
    @Inject
    private  M m;
    @Inject
    private  P o;
    @Inject
    private  m f;
    @Inject
    private  TOAConfig d;
    private  boolean v;
    @Inject
    private  i i;
    
    @Inject
    private  j h;
    private  int y;
    @Inject
    private  EventBus j;
    private  int B;
    @Inject
    private  p g;
    @Inject
    private  y e;
    @Inject
    private  R n;

    public NPC b() {
        int[] nArray = new int[var2[3]];
        nArray[SquireAutoTOA.var2[0]] = this.a();
        return NPCs.getNearest((int[])nArray);
    }

    public SquireAutoTOA() {
        this.u = var2[0];
        this.v = var2[0];
        this.w = var2[1];
        this.x = var2[0];
        this.y = var2[0];
        this.z = var2[0];
        this.A = var2[0];
        this.B = var2[0];
    }

    public void a(boolean bl2) {
        this.u = bl2;
    }

    @Subscribe
    public void a(SoundEffectPlayed soundEffectPlayed) {
        if (SquireAutoTOA.var3(a.contains(soundEffectPlayed.getSoundId()) ? 1 : 0)) {
            soundEffectPlayed.consume();
        }
    }

    public void c(boolean bl2) {
        this.x = bl2;
    }

    public void b(int n2) {
        this.y = n2;
    }

    public int h() {
        return this.y;
    }

    public boolean a(int ... nArray) {
        return this.a((NPC nPC) -> {
            void var4;
            int[] nArray2 = nArray;
            int n2 = nArray2.length;
            int var5 = var2[0];
            while (SquireAutoTOA.var6(var5, (int)var4)) {
                void var7;
                void var8;
                void var9 = var8[var5];
                if (SquireAutoTOA.var10((int)var9, var7.getId())) {
                    return var2[3];
                }
                ++var5;
                0;
                if (3 > 1) continue;
                return ((66 + 133 - 196 + 139 ^ 1 + 62 - -90 + 40) & (0x89 ^ 0xB9 ^ 6 + 69 - -34 + 18 ^ -1)) != 0;
            }
            return var2[0];
        });
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    public int i() {
        return this.z;
    }

    public void a(int n2) {
        this.w = n2;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var18;
        if (SquireAutoTOA.var3(chatMessage.getMessage().startsWith(var1[var2[0]]) ? 1 : 0)) {
            this.z += var2[3];
            this.B = var2[0];
        }
        if (SquireAutoTOA.var3(var18.getMessage().contains(var1[var2[3]]) ? 1 : 0)) {
            var19.A += var2[3];
            var19.B = var2[0];
        }
        if (SquireAutoTOA.var3(var18.getMessage().contains(var1[var2[4]]) ? 1 : 0)) {
            var19.B += var2[3];
        }
    }

    public int a() {
        return Vars.getVarp((int)var2[98]);
    }

    private static boolean var10(int n2, int n3) {
        return n2 == n3;
    }

    private static void var20() {
        var1 = new String[var2[6]];
        SquireAutoTOA.var1[SquireAutoTOA.var2[0]] = "Your completed Tombs of Amascut";
        SquireAutoTOA.var1[SquireAutoTOA.var2[3]] = "You failed to survive";
        SquireAutoTOA.var1[SquireAutoTOA.var2[4]] = "You have died";
        SquireAutoTOA.var1[SquireAutoTOA.var2[5]] = "Amascut";
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var21(Object object) {
        return object != null;
    }

    public boolean a(Predicate<NPC> predicate) {
        int n2;
        NPC nPC2 = this.b();
        if (SquireAutoTOA.var21(nPC2) && SquireAutoTOA.var3(predicate.and(nPC -> {
            boolean bl2;
            if (SquireAutoTOA.var11(nPC.isDead() ? 1 : 0)) {
                bl2 = var2[3];
                0;
                if (-1 >= 0) {
                    return ((0xD5 ^ 0x8D) & ~(0xF ^ 0x57)) != 0;
                }
            } else {
                bl2 = var2[0];
            }
            return bl2;
        }).test(nPC2) ? 1 : 0)) {
            n2 = var2[3];
            0;
            if (-3 > 0) {
                return ((50 + 45 - -4 + 29 ^ 81 + 80 - 21 + 57) & (0x2A ^ 0x77 ^ (0x3C ^ 0x24) ^ -1)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }

    public int f() {
        return this.w;
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var2[0];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var2[0];
        while (SquireAutoTOA.var6(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var2[2]];
        classArray[SquireAutoTOA.var2[0]] = ClaimingDeathItemsTask.class;
        classArray[SquireAutoTOA.var2[3]] = BankingToGoBackInTask.class;
        classArray[SquireAutoTOA.var2[4]] = CreatingToaPartyTask.class;
        classArray[SquireAutoTOA.var2[5]] = EnteringToaTask.class;
        classArray[SquireAutoTOA.var2[6]] = HoppingToDifferentWorldTask.class;
        classArray[SquireAutoTOA.var2[7]] = RechargingTridentTask.class;
        classArray[SquireAutoTOA.var2[8]] = UsingSunKerisSpecialTask.class;
        classArray[SquireAutoTOA.var2[9]] = DoingTask.class;
        classArray[SquireAutoTOA.var2[10]] = AttackingABaboonTask.class;
        classArray[SquireAutoTOA.var2[11]] = DodgingVolatileBaboonTask.class;
        classArray[SquireAutoTOA.var2[12]] = HandlingBabboonPrayersTask.class;
        classArray[SquireAutoTOA.var2[13]] = DoingBoulderDashTask.class;
        classArray[SquireAutoTOA.var2[14]] = MovingNextToRubbleTask.class;
        classArray[SquireAutoTOA.var2[15]] = DodgingFloorTilesTask.class;
        classArray[SquireAutoTOA.var2[16]] = AttackingBabaTask.class;
        classArray[SquireAutoTOA.var2[17]] = AttackingBaboonsTask.class;
        classArray[SquireAutoTOA.var2[18]] = DodgingFallingBoulderTask.class;
        classArray[SquireAutoTOA.var2[19]] = HandlingBabaPrayersTask.class;
        classArray[SquireAutoTOA.var2[20]] = RedXCycleTask.class;
        classArray[SquireAutoTOA.var2[21]] = RunningWaterTask.class;
        classArray[SquireAutoTOA.var2[22]] = AttackingZebakTask.class;
        classArray[SquireAutoTOA.var2[23]] = ClearingBoulderTask.class;
        classArray[SquireAutoTOA.var2[24]] = DodgingWaveTask.class;
        classArray[SquireAutoTOA.var2[25]] = EscapingWaterTask.class;
        classArray[SquireAutoTOA.var2[26]] = MovingOffPoisonTask.class;
        classArray[SquireAutoTOA.var2[27]] = HandlingZebakPrayersTask.class;
        classArray[SquireAutoTOA.var2[28]] = DodgingPoisonSplatTask.class;
        classArray[SquireAutoTOA.var2[29]] = AvoidingBloodCloudTask.class;
        classArray[SquireAutoTOA.var2[30]] = MovingToCenterTask.class;
        classArray[SquireAutoTOA.var2[31]] = DoingMatchPuzzleTask.class;
        classArray[SquireAutoTOA.var2[32]] = DoingPressureOrderTask.class;
        classArray[SquireAutoTOA.var2[33]] = DoingPressurePlatesPuzzleTask.class;
        classArray[SquireAutoTOA.var2[34]] = SolvingLightPuzzleTask.class;
        classArray[SquireAutoTOA.var2[35]] = SolvingObeliskPuzzleTask.class;
        classArray[SquireAutoTOA.var2[36]] = PuzzlePrayerHandlerTask.class;
        classArray[SquireAutoTOA.var2[37]] = ProgressPuzzleTask.class;
        classArray[SquireAutoTOA.var2[38]] = DodgingProjectileTask.class;
        classArray[SquireAutoTOA.var2[39]] = AttackingKephriTask.class;
        classArray[SquireAutoTOA.var2[40]] = HandlingKephriPrayersTask.class;
        classArray[SquireAutoTOA.var2[41]] = AttackingKephriSwarmMedicTask.class;
        classArray[SquireAutoTOA.var2[42]] = MovingToBestSpotTask.class;
        classArray[SquireAutoTOA.var2[43]] = AttackingSwarmsTask.class;
        classArray[SquireAutoTOA.var2[44]] = AttackingMageScarabTask.class;
        classArray[SquireAutoTOA.var2[45]] = AttackingMeleeScarabTask.class;
        classArray[SquireAutoTOA.var2[46]] = MovingAwayFromAllDungTask.class;
        classArray[SquireAutoTOA.var2[47]] = DodgingDungAttackTask.class;
        classArray[SquireAutoTOA.var2[48]] = KillingAnnoyingEggTask.class;
        classArray[SquireAutoTOA.var2[49]] = SolvingLightPuzzleTask.class;
        classArray[SquireAutoTOA.var2[50]] = GrabbingPickaxeTask.class;
        classArray[SquireAutoTOA.var2[51]] = AttackingAkkhaTask.class;
        classArray[SquireAutoTOA.var2[1]] = HandlingAkkhaPrayersTask.class;
        classArray[SquireAutoTOA.var2[52]] = AttackingAkkhaShadowTask.class;
        classArray[SquireAutoTOA.var2[53]] = LuringAkkhaToQuadrantTask.class;
        classArray[SquireAutoTOA.var2[54]] = SolvingMemoryPuzzleTask.class;
        classArray[SquireAutoTOA.var2[55]] = AttackingAkkhaButterflyTask.class;
        classArray[SquireAutoTOA.var2[56]] = KeepBackAkkhaTask.class;
        classArray[SquireAutoTOA.var2[57]] = SkippingAkkhaDpsTask.class;
        classArray[SquireAutoTOA.var2[58]] = EnteringNextPathTask.class;
        classArray[SquireAutoTOA.var2[59]] = ClaimingSuppliesTask.class;
        classArray[SquireAutoTOA.var2[60]] = WithdrawingSuppliesTask.class;
        classArray[SquireAutoTOA.var2[61]] = PreventingLogoutTask.class;
        classArray[SquireAutoTOA.var2[62]] = TurningOnRunTask.class;
        classArray[SquireAutoTOA.var2[63]] = EatingFoodTask.class;
        classArray[SquireAutoTOA.var2[64]] = SmellingSaltsTask.class;
        classArray[SquireAutoTOA.var2[65]] = DrinkingPotionTask.class;
        classArray[SquireAutoTOA.var2[66]] = DrinkingBrewTask.class;
        classArray[SquireAutoTOA.var2[67]] = DrinkingRestoreTask.class;
        classArray[SquireAutoTOA.var2[68]] = ApplyingSilkTask.class;
        classArray[SquireAutoTOA.var2[69]] = DrinkingAmbrosiaTask.class;
        classArray[SquireAutoTOA.var2[70]] = DroppingUnnecessarySuppliesTask.class;
        classArray[SquireAutoTOA.var2[71]] = CuringPoisonvenomTask.class;
        classArray[SquireAutoTOA.var2[72]] = DrinkingPrayerTask.class;
        classArray[SquireAutoTOA.var2[73]] = CrackingScarabTask.class;
        classArray[SquireAutoTOA.var2[74]] = MovingToRightSpotWithChargingTask.class;
        classArray[SquireAutoTOA.var2[75]] = DodgingUfosTask.class;
        classArray[SquireAutoTOA.var2[76]] = AttackingObeliskTask.class;
        classArray[SquireAutoTOA.var2[77]] = HandlingObeliskPrayersTask.class;
        classArray[SquireAutoTOA.var2[78]] = SunKerisObeliskTask.class;
        classArray[SquireAutoTOA.var2[79]] = AttackingCoreTask.class;
        classArray[SquireAutoTOA.var2[80]] = AttackingP1WardenTask.class;
        classArray[SquireAutoTOA.var2[81]] = DodgingElectricSkullTask.class;
        classArray[SquireAutoTOA.var2[82]] = HandlingWardenPrayersTask.class;
        classArray[SquireAutoTOA.var2[83]] = DodgingSolidifyAttackTask.class;
        classArray[SquireAutoTOA.var2[84]] = MovingToSafespotTask.class;
        classArray[SquireAutoTOA.var2[85]] = GoingToFinalPhaseTask.class;
        classArray[SquireAutoTOA.var2[86]] = AttackingSkullsTask.class;
        classArray[SquireAutoTOA.var2[87]] = DodgingTilesTask.class;
        classArray[SquireAutoTOA.var2[88]] = AttackingFinalWardenTask.class;
        classArray[SquireAutoTOA.var2[89]] = HandlingElidinisP3PrayersTask.class;
        classArray[SquireAutoTOA.var2[90]] = HandlingTumekenP3PrayersTask.class;
        classArray[SquireAutoTOA.var2[91]] = DodgingLightningTask.class;
        classArray[SquireAutoTOA.var2[92]] = DodgingBabaBoulderTask.class;
        classArray[SquireAutoTOA.var2[93]] = LootingChestRoomTask.class;
        classArray[SquireAutoTOA.var2[94]] = ClaimingRewardsOutsideTask.class;
        classArray[SquireAutoTOA.var2[95]] = DecantingPotionsTask.class;
        classArray[SquireAutoTOA.var2[96]] = DrinkingStaminaTask.class;
        classArray[SquireAutoTOA.var2[97]] = LoggingOutAndStoppingTask.class;
        return classArray;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    public boolean g() {
        return this.x;
    }

    public boolean d() {
        return this.u;
    }

    private static void var38() {
        var2 = new int[134];
        SquireAutoTOA.var2[0] = (124 + 19 - -26 + 20 ^ 121 + 132 - 144 + 32) & (5 ^ 0x54 ^ (0x74 ^ 0x15) ^ -1);
        SquireAutoTOA.var2[1] = 161 + 9 - 107 + 116 ^ 30 + 37 - -34 + 28;
        SquireAutoTOA.var2[2] = 0xA8 ^ 0xB5 ^ (0x53 ^ 0x2F);
        SquireAutoTOA.var2[3] = 1;
        SquireAutoTOA.var2[4] = 2;
        SquireAutoTOA.var2[5] = 3;
        SquireAutoTOA.var2[6] = 0x61 ^ 0x65;
        SquireAutoTOA.var2[7] = 0x3C ^ 0x39;
        SquireAutoTOA.var2[8] = 0xF1 ^ 0xAE ^ (0x44 ^ 0x1D);
        SquireAutoTOA.var2[9] = 0x45 ^ 0x35 ^ (0x71 ^ 6);
        SquireAutoTOA.var2[10] = 0x38 ^ 0x30;
        SquireAutoTOA.var2[11] = 0x7A ^ 0x73;
        SquireAutoTOA.var2[12] = 0x28 ^ 0x22;
        SquireAutoTOA.var2[13] = 0xB4 ^ 0xBF;
        SquireAutoTOA.var2[14] = 0xA5 ^ 0xA9;
        SquireAutoTOA.var2[15] = 0x38 ^ 0x35;
        SquireAutoTOA.var2[16] = 0x81 ^ 0x8F;
        SquireAutoTOA.var2[17] = 109 + 46 - 135 + 118 ^ 13 + 62 - -1 + 57;
        SquireAutoTOA.var2[18] = 154 + 56 - 96 + 69 ^ 74 + 110 - 81 + 64;
        SquireAutoTOA.var2[19] = 138 + 117 - 251 + 148 ^ 68 + 55 - 65 + 79;
        SquireAutoTOA.var2[20] = 20 + 23 - -10 + 136 ^ 98 + 143 - 160 + 94;
        SquireAutoTOA.var2[21] = 3 ^ (0x91 ^ 0x81);
        SquireAutoTOA.var2[22] = 0xA7 ^ 0xB0 ^ 3;
        SquireAutoTOA.var2[23] = 0x7C ^ 1 ^ (0x2D ^ 0x45);
        SquireAutoTOA.var2[24] = 0x7B ^ 0x6D;
        SquireAutoTOA.var2[25] = 0x82 ^ 0x96 ^ 3;
        SquireAutoTOA.var2[26] = 0x1C ^ 4;
        SquireAutoTOA.var2[27] = 0x98 ^ 0x81;
        SquireAutoTOA.var2[28] = 0x15 ^ 0xF;
        SquireAutoTOA.var2[29] = 0xBF ^ 0xA4;
        SquireAutoTOA.var2[30] = 0x37 ^ 0x2B;
        SquireAutoTOA.var2[31] = 0x76 ^ 0xE ^ (0xDF ^ 0xBA);
        SquireAutoTOA.var2[32] = 0x4F ^ 0x51;
        SquireAutoTOA.var2[33] = 0xAF ^ 0xB0;
        SquireAutoTOA.var2[34] = 0x18 ^ 0x38;
        SquireAutoTOA.var2[35] = 0x41 ^ 0x60;
        SquireAutoTOA.var2[36] = 0 ^ 0x1D ^ (0xBA ^ 0x85);
        SquireAutoTOA.var2[37] = 1 ^ 0x21 ^ 3;
        SquireAutoTOA.var2[38] = 11 + 136 - 93 + 136 ^ 145 + 65 - 122 + 66;
        SquireAutoTOA.var2[39] = 0xBF ^ 0x9A;
        SquireAutoTOA.var2[40] = 0xAB ^ 0x8D;
        SquireAutoTOA.var2[41] = 0x26 ^ 0x36 ^ (0x3D ^ 0xA);
        SquireAutoTOA.var2[42] = 0x2F ^ 7;
        SquireAutoTOA.var2[43] = 0x8F ^ 0xA6;
        SquireAutoTOA.var2[44] = 0xBC ^ 0x96;
        SquireAutoTOA.var2[45] = 0x9D ^ 0xB6;
        SquireAutoTOA.var2[46] = 33 + 82 - 19 + 89 ^ 134 + 90 - 93 + 18;
        SquireAutoTOA.var2[47] = 0x7F ^ 0x70 ^ (0x9F ^ 0xBD);
        SquireAutoTOA.var2[48] = 0x68 ^ 0x46;
        SquireAutoTOA.var2[49] = 0x95 ^ 0xBA;
        SquireAutoTOA.var2[50] = 109 + 102 - 120 + 42 ^ 116 + 168 - 122 + 19;
        SquireAutoTOA.var2[51] = 0x88 ^ 0xB9;
        SquireAutoTOA.var2[52] = 0x7F ^ 0x4C;
        SquireAutoTOA.var2[53] = 0x3A ^ 0x2F ^ (0x47 ^ 0x66);
        SquireAutoTOA.var2[54] = 0x75 ^ 0x40;
        SquireAutoTOA.var2[55] = 102 + 98 - 105 + 147 ^ 21 + 150 - -12 + 13;
        SquireAutoTOA.var2[56] = 0x62 ^ 0x55;
        SquireAutoTOA.var2[57] = 0x34 ^ 0xC;
        SquireAutoTOA.var2[58] = 0xB2 ^ 0x8B;
        SquireAutoTOA.var2[59] = 0x1E ^ 0x24;
        SquireAutoTOA.var2[60] = 0x49 ^ 0x72;
        SquireAutoTOA.var2[61] = 0xB9 ^ 0x85;
        SquireAutoTOA.var2[62] = 0xCF ^ 0x9C ^ (0xD4 ^ 0xBA);
        SquireAutoTOA.var2[63] = 0xC9 ^ 0xB4 ^ (0x25 ^ 0x66);
        SquireAutoTOA.var2[64] = 0x92 ^ 0xAD;
        SquireAutoTOA.var2[65] = 0xF7 ^ 0xB7;
        SquireAutoTOA.var2[66] = 24 + 16 - -31 + 64 ^ 15 + 117 - 62 + 128;
        SquireAutoTOA.var2[67] = 229 + 46 - 204 + 166 ^ 16 + 141 - 70 + 88;
        SquireAutoTOA.var2[68] = 0x2E ^ 0x47 ^ (0x67 ^ 0x4D);
        SquireAutoTOA.var2[69] = 0xFB ^ 0xBF;
        SquireAutoTOA.var2[70] = 0x28 ^ 0x32 ^ (0x5A ^ 5);
        SquireAutoTOA.var2[71] = 0x68 ^ 0x6C ^ (0x5D ^ 0x1F);
        SquireAutoTOA.var2[72] = 0xDF ^ 0x98;
        SquireAutoTOA.var2[73] = 0x28 ^ 9 ^ (0x51 ^ 0x38);
        SquireAutoTOA.var2[74] = 0x4C ^ 0x25 ^ (0xE1 ^ 0xC1);
        SquireAutoTOA.var2[75] = 0x44 ^ 0x36 ^ (0x29 ^ 0x11);
        SquireAutoTOA.var2[76] = 0xEE ^ 0x99 ^ (0xB6 ^ 0x8A);
        SquireAutoTOA.var2[77] = 88 + 194 - 149 + 100 ^ 157 + 3 - 5 + 10;
        SquireAutoTOA.var2[78] = 0x44 ^ 0x30 ^ (0xB0 ^ 0x89);
        SquireAutoTOA.var2[79] = 86 + 9 - -38 + 4 ^ 37 + 117 - 127 + 172;
        SquireAutoTOA.var2[80] = 0x67 ^ 0x28;
        SquireAutoTOA.var2[81] = 0x62 ^ 0x32;
        SquireAutoTOA.var2[82] = 0x32 ^ 0x63;
        SquireAutoTOA.var2[83] = 0x38 ^ 0x33 ^ (5 ^ 0x5C);
        SquireAutoTOA.var2[84] = 76 + 141 - 48 + 32 ^ 31 + 121 - 69 + 71;
        SquireAutoTOA.var2[85] = 0x4B ^ 0x78 ^ (0xA7 ^ 0xC0);
        SquireAutoTOA.var2[86] = 0xCA ^ 0x9F;
        SquireAutoTOA.var2[87] = 0xCB ^ 0xAE ^ (6 ^ 0x35);
        SquireAutoTOA.var2[88] = 0x2C ^ 0x7B;
        SquireAutoTOA.var2[89] = 0x2D ^ 6 ^ (0xFC ^ 0x8F);
        SquireAutoTOA.var2[90] = 0xE5 ^ 0x86 ^ (0x2E ^ 0x14);
        SquireAutoTOA.var2[91] = 0xF3 ^ 0xA9;
        SquireAutoTOA.var2[92] = 0x5C ^ 0x2F ^ (0x15 ^ 0x3D);
        SquireAutoTOA.var2[93] = 148 + 185 - 154 + 31 ^ 30 + 35 - -26 + 51;
        SquireAutoTOA.var2[94] = 0xEB ^ 0xB6 ^ (0x95 ^ 0x86) & ~(0x4E ^ 0x5D);
        SquireAutoTOA.var2[95] = 0x7F ^ 0x21;
        SquireAutoTOA.var2[96] = 0x50 ^ 0x7C ^ (0x45 ^ 0x36);
        SquireAutoTOA.var2[97] = 0x68 ^ 0x63 ^ (0x38 ^ 0x53);
        SquireAutoTOA.var2[98] = 0xFFFFEFB3 & 0x16DF;
        SquireAutoTOA.var2[99] = -(0xA9 ^ 0xB8) & (0xFFFFFC7E & 0x3BBD);
        SquireAutoTOA.var2[100] = -(0xFFFFADAF & 0x767D) & (0xFFFFBFAF & 0x6EFE);
        SquireAutoTOA.var2[101] = -(0xFFFFBD7E & 0x73FF) & (0xFFFFFBFD & 0x3FFF);
        SquireAutoTOA.var2[102] = 0xFFFFBFF9 & 0x4A6E;
        SquireAutoTOA.var2[103] = -(0xFFFFAFFF & 0x7583) & (0xFFFFFFFF & 0x2FFF);
        SquireAutoTOA.var2[104] = 0xFFFF9EEE & 0x6B7F;
        SquireAutoTOA.var2[105] = -(0xFFFF95C3 & 0x7FBD) & (0xFFFFDFFF & 0x3FFC);
        SquireAutoTOA.var2[106] = -(0xFFFFC97F & 0x76D3) & (0xFFFFCBF3 & 0x7EDF);
        SquireAutoTOA.var2[107] = -(0xFFFFFB17 & 0x35EA) & (0xFFFFBFE7 & 0x7B7F);
        SquireAutoTOA.var2[108] = 0xFFFFCEF7 & 0x3B7F;
        SquireAutoTOA.var2[109] = -(0xFFFFFDEF & 0x6291) & (0xFFFFEBF7 & 0x7EFE);
        SquireAutoTOA.var2[110] = -(0xFFFF98DE & 0x7723) & (0xFFFFDFFF & 0x37BF);
        SquireAutoTOA.var2[111] = -(0xFFFFB4B9 & 0x6BD7) & (0xFFFFBFFB & 0x6AFE);
        SquireAutoTOA.var2[112] = -(0xFFFFFC7B & 0x3796) & (0xFFFFBFFF & 0x7E7D);
        SquireAutoTOA.var2[113] = 0xFFFFEB7F & 0x1EFF;
        SquireAutoTOA.var2[114] = -(0xFFFFF5B3 & 0x7B6D) & (0xFFFFFFBB & 0x7BE7);
        SquireAutoTOA.var2[115] = 0xFFFF9AEB & 0x6F7F;
        SquireAutoTOA.var2[116] = 0xFFFFCFF3 & 0x3A7F;
        SquireAutoTOA.var2[117] = -(0xFFFFAB53 & 0x75AF) & (0xFFFFBFF7 & 0x6B7F);
        SquireAutoTOA.var2[118] = 0xFFFFBB75 & 0x4EFE;
        SquireAutoTOA.var2[119] = -(0xFFFFD12F & 0x7ED5) & (0xFFFFFA7D & 0x5FEF);
        SquireAutoTOA.var2[120] = -(0xFFFFD59B & 0x3E77) & (0xFFFFBEFF & 0x5F7F);
        SquireAutoTOA.var2[121] = 0xFFFFFAFF & 0xF7A;
        SquireAutoTOA.var2[122] = -(0xFFFFFBB7 & 0x544D) & (0xFFFFFAFE & 0x5F7D);
        SquireAutoTOA.var2[123] = 0xFFFFBFFE & 0x4A7F;
        SquireAutoTOA.var2[124] = 0xFFFF8EFB & 0x7FF6;
        SquireAutoTOA.var2[125] = 0xFFFFAEF7 & 0x5FF9;
        SquireAutoTOA.var2[126] = -(0xFFFFF4F5 & 0x6F1B) & (0xFFFFEFF7 & 0x7E7F);
        SquireAutoTOA.var2[127] = 0xFFFFFFEF & 0x667B;
        SquireAutoTOA.var2[128] = -(0xFFFFB309 & 0x4EFF) & (0xFFFFFF7F & 0x67FF);
        SquireAutoTOA.var2[129] = -(0xFFFF9D7B & 0x73A7) & (0xFFFFFBFF & 0x7FAF);
        SquireAutoTOA.var2[130] = 0xFFFFEFB1 & 0x75CF;
        SquireAutoTOA.var2[131] = -(0xFFFF9DC7 & 0x773F) & (0xFFFFFFF6 & 0x7F6F);
        SquireAutoTOA.var2[132] = -(0xFFFFF7E7 & 0x191B) & (0xFFFFFBDF & 0x7F7F);
        SquireAutoTOA.var2[133] = -(0x97 ^ 0xB6) & (0xFFFFEAFB & 0x7F7E);
    }

    @Provides
    TOAConfig a(ConfigManager configManager) {
        return (TOAConfig)configManager.getConfig(TOAConfig.class);
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    public void c() {
        this.a(var2[32]);
        this.c(var2[0]);
    }

    static {
        SquireAutoTOA.var38();
        SquireAutoTOA.var20();
        Object[] objectArray = new Integer[var2[23]];
        objectArray[SquireAutoTOA.var2[0]] = var2[106];
        objectArray[SquireAutoTOA.var2[3]] = var2[107];
        objectArray[SquireAutoTOA.var2[4]] = var2[108];
        objectArray[SquireAutoTOA.var2[5]] = var2[109];
        objectArray[SquireAutoTOA.var2[6]] = var2[110];
        objectArray[SquireAutoTOA.var2[7]] = var2[111];
        objectArray[SquireAutoTOA.var2[8]] = var2[112];
        objectArray[SquireAutoTOA.var2[9]] = var2[113];
        objectArray[SquireAutoTOA.var2[10]] = var2[114];
        objectArray[SquireAutoTOA.var2[11]] = var2[115];
        objectArray[SquireAutoTOA.var2[12]] = var2[116];
        objectArray[SquireAutoTOA.var2[13]] = var2[117];
        objectArray[SquireAutoTOA.var2[14]] = var2[118];
        objectArray[SquireAutoTOA.var2[15]] = var2[119];
        objectArray[SquireAutoTOA.var2[16]] = var2[120];
        objectArray[SquireAutoTOA.var2[17]] = var2[121];
        objectArray[SquireAutoTOA.var2[18]] = var2[122];
        objectArray[SquireAutoTOA.var2[19]] = var2[123];
        objectArray[SquireAutoTOA.var2[20]] = var2[124];
        objectArray[SquireAutoTOA.var2[21]] = var2[125];
        objectArray[SquireAutoTOA.var2[22]] = var2[126];
        a = ImmutableSet.of((Object)var2[100], (Object)var2[101], (Object)var2[102], (Object)var2[103], (Object)var2[104], (Object)var2[105], (Object[])objectArray);
        Object[] objectArray2 = new Integer[var2[3]];
        objectArray2[SquireAutoTOA.var2[0]] = var2[133];
        b = ImmutableSet.of((Object)var2[127], (Object)var2[128], (Object)var2[129], (Object)var2[130], (Object)var2[131], (Object)var2[132], (Object[])objectArray2);
    }

    public int k() {
        return this.B;
    }

    public int j() {
        return this.A;
    }

    public boolean e() {
        return this.v;
    }

    public void b(boolean bl2) {
        this.v = bl2;
    }

    protected void onStart() {
        try {
            SquireAutoTOA var39;
            var39.v = var2[0];
            var39.u = var2[0];
            var39.x = var2[0];
            var39.z = var2[0];
            var39.B = var2[0];
            var39.A = var2[0];
            var39.f.w();
            var39.i.w();
            var39.g.w();
            var39.j.register((Object)var39.f);
            var39.j.register((Object)var39.g);
            var39.j.register((Object)var39.h);
            var39.j.register((Object)var39.i);
            var39.j.register((Object)var39.t);
            var39.j.register((Object)var39.e);
            var39.k.add((Overlay)var39.l);
            0;
            var39.k.add((Overlay)var39.m);
            0;
            var39.k.add((Overlay)var39.n);
            0;
            var39.k.add((Overlay)var39.o);
            0;
            var39.k.add((Overlay)var39.p);
            0;
            var39.k.add((Overlay)var39.q);
            0;
            var39.k.add((Overlay)var39.r);
            0;
            var39.k.add((Overlay)var39.s);
            0;
            0;
        }
        catch (Exception var40) {
            var40.printStackTrace();
        }
        if (-1 >= 0) {
            return;
        }
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        if (SquireAutoTOA.var11(lootReceived.getName().contains(var1[var2[5]]) ? 1 : 0)) {
            return;
        }
        int n2 = Static.getClient().getVarbitValue(var2[99]);
        Collection collection = lootReceived.getItems();
        ItemStack itemStack2 = collection.stream().filter(itemStack -> b.contains(itemStack.getId())).findFirst().orElse(null);
        D.a(itemStack2, collection, String.valueOf(n2), this.d.anonymize());
    }

    protected void onStop() {
        this.j.unregister((Object)this.f);
        this.j.unregister((Object)this.g);
        this.j.unregister((Object)this.h);
        this.j.unregister((Object)this.i);
        this.j.unregister((Object)this.t);
        this.j.unregister((Object)this.e);
        this.k.remove((Overlay)this.l);
        0;
        this.k.remove((Overlay)this.m);
        0;
        this.k.remove((Overlay)this.n);
        0;
        this.k.remove((Overlay)this.o);
        0;
        this.k.remove((Overlay)this.p);
        0;
        this.k.remove((Overlay)this.q);
        0;
        this.k.remove((Overlay)this.r);
        0;
        this.k.remove((Overlay)this.s);
        0;
    }
}

