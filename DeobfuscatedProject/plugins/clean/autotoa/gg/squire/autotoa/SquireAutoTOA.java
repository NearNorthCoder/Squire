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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.M;
import gg.squire.autotoa.NHelper;
import gg.squire.autotoa.AutotoaManager;
import gg.squire.autotoa.PHelper;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Q;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.R;
import gg.squire.autotoa.THelper;
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
        int[] nArray = new int[llIIIllIlll[3]];
        nArray[SquireAutoTOA.llIIIllIlll[0]] = this.a();
        return NPCs.getNearest((int[])nArray);
    }

    public SquireAutoTOA() {
        this.u = llIIIllIlll[0];
        this.v = llIIIllIlll[0];
        this.w = llIIIllIlll[1];
        this.x = llIIIllIlll[0];
        this.y = llIIIllIlll[0];
        this.z = llIIIllIlll[0];
        this.A = llIIIllIlll[0];
        this.B = llIIIllIlll[0];
    }

    public void a(boolean bl2) {
        this.u = bl2;
    }

    @Subscribe
    public void a(SoundEffectPlayed soundEffectPlayed) {
        if (SquireAutoTOA.lIIllllllllIII(a.contains(soundEffectPlayed.getSoundId()) ? 1 : 0)) {
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
            void var1;
            int[] nArray2 = nArray;
            int n2 = nArray2.length;
            int var2 = llIIIllIlll[0];
            while (SquireAutoTOA.lIIllllllllIll(var2, (int)var1)) {
                void var3;
                void var4;
                void var5 = var4[var2];
                if (SquireAutoTOA.lIIlllllllllII((int)var5, var3.getId())) {
                    return llIIIllIlll[3];
                }
                ++var2;

                if (3 > 1) continue;
                return false;
            }
            return llIIIllIlll[0];
        });
    }

    private static boolean lIIllllllllIlI(int n2) {
        return n2 == 0;
    }

    public int i() {
        return this.z;
    }

    public void a(int n2) {
        this.w = n2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var6;
        if (SquireAutoTOA.lIIllllllllIII(chatMessage.getMessage().startsWith(llIIIllIllI[llIIIllIlll[0]]) ? 1 : 0)) {
            this.z += llIIIllIlll[3];
            this.B = llIIIllIlll[0];
        }
        if (SquireAutoTOA.lIIllllllllIII(var6.getMessage().contains(llIIIllIllI[llIIIllIlll[3]]) ? 1 : 0)) {
            var7.A += llIIIllIlll[3];
            var7.B = llIIIllIlll[0];
        }
        if (SquireAutoTOA.lIIllllllllIII(var6.getMessage().contains(llIIIllIllI[llIIIllIlll[4]]) ? 1 : 0)) {
            var7.B += llIIIllIlll[3];
        }
    }

    public int a() {
        return Vars.getVarp((int)llIIIllIlll[98]);
    }

    private static boolean lIIlllllllllII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlllllIIlIll() {
        llIIIllIllI = new String[llIIIllIlll[6]];
        SquireAutoTOA.llIIIllIllI[SquireAutoTOA.llIIIllIlll[0]] = "Your completed Tombs of Amascut";
        SquireAutoTOA.llIIIllIllI[SquireAutoTOA.llIIIllIlll[3]] = "You failed to survive";
        SquireAutoTOA.llIIIllIllI[SquireAutoTOA.llIIIllIlll[4]] = "You have died";
        SquireAutoTOA.llIIIllIllI[SquireAutoTOA.llIIIllIlll[5]] = "Amascut";
    }

    private static boolean lIIllllllllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllllllIIl(Object object) {
        return object != null;
    }

    public boolean a(Predicate<NPC> predicate) {
        int n2;
        NPC nPC2 = this.b();
        if (SquireAutoTOA.lIIllllllllIIl(nPC2) && SquireAutoTOA.lIIllllllllIII(predicate.and(nPC -> {
            boolean bl2;
            if (SquireAutoTOA.lIIllllllllIlI(nPC.isDead() ? 1 : 0)) {
                bl2 = llIIIllIlll[3];

            } else {
                bl2 = llIIIllIlll[0];
            }
            return bl2;
        }).test(nPC2) ? 1 : 0)) {
            n2 = llIIIllIlll[3];

        } else {
            n2 = llIIIllIlll[0];
        }
        return n2 != 0;
    }

    public int f() {
        return this.w;
    }

        return String.valueOf(var8);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIIllIlll[2]];
        classArray[SquireAutoTOA.llIIIllIlll[0]] = ClaimingDeathItemsTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[3]] = BankingToGoBackInTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[4]] = CreatingToaPartyTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[5]] = EnteringToaTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[6]] = HoppingToDifferentWorldTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[7]] = RechargingTridentTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[8]] = UsingSunKerisSpecialTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[9]] = DoingTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[10]] = AttackingABaboonTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[11]] = DodgingVolatileBaboonTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[12]] = HandlingBabboonPrayersTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[13]] = DoingBoulderDashTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[14]] = MovingNextToRubbleTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[15]] = DodgingFloorTilesTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[16]] = AttackingBabaTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[17]] = AttackingBaboonsTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[18]] = DodgingFallingBoulderTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[19]] = HandlingBabaPrayersTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[20]] = RedXCycleTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[21]] = RunningWaterTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[22]] = AttackingZebakTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[23]] = ClearingBoulderTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[24]] = DodgingWaveTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[25]] = EscapingWaterTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[26]] = MovingOffPoisonTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[27]] = HandlingZebakPrayersTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[28]] = DodgingPoisonSplatTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[29]] = AvoidingBloodCloudTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[30]] = MovingToCenterTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[31]] = DoingMatchPuzzleTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[32]] = DoingPressureOrderTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[33]] = DoingPressurePlatesPuzzleTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[34]] = SolvingLightPuzzleTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[35]] = SolvingObeliskPuzzleTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[36]] = PuzzlePrayerHandlerTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[37]] = ProgressPuzzleTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[38]] = DodgingProjectileTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[39]] = AttackingKephriTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[40]] = HandlingKephriPrayersTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[41]] = AttackingKephriSwarmMedicTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[42]] = MovingToBestSpotTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[43]] = AttackingSwarmsTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[44]] = AttackingMageScarabTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[45]] = AttackingMeleeScarabTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[46]] = MovingAwayFromAllDungTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[47]] = DodgingDungAttackTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[48]] = KillingAnnoyingEggTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[49]] = SolvingLightPuzzleTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[50]] = GrabbingPickaxeTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[51]] = AttackingAkkhaTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[1]] = HandlingAkkhaPrayersTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[52]] = AttackingAkkhaShadowTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[53]] = LuringAkkhaToQuadrantTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[54]] = SolvingMemoryPuzzleTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[55]] = AttackingAkkhaButterflyTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[56]] = KeepBackAkkhaTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[57]] = SkippingAkkhaDpsTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[58]] = EnteringNextPathTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[59]] = ClaimingSuppliesTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[60]] = WithdrawingSuppliesTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[61]] = PreventingLogoutTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[62]] = TurningOnRunTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[63]] = EatingFoodTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[64]] = SmellingSaltsTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[65]] = DrinkingPotionTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[66]] = DrinkingBrewTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[67]] = DrinkingRestoreTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[68]] = ApplyingSilkTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[69]] = DrinkingAmbrosiaTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[70]] = DroppingUnnecessarySuppliesTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[71]] = CuringPoisonvenomTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[72]] = DrinkingPrayerTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[73]] = CrackingScarabTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[74]] = MovingToRightSpotWithChargingTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[75]] = DodgingUfosTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[76]] = AttackingObeliskTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[77]] = HandlingObeliskPrayersTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[78]] = SunKerisObeliskTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[79]] = AttackingCoreTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[80]] = AttackingP1WardenTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[81]] = DodgingElectricSkullTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[82]] = HandlingWardenPrayersTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[83]] = DodgingSolidifyAttackTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[84]] = MovingToSafespotTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[85]] = GoingToFinalPhaseTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[86]] = AttackingSkullsTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[87]] = DodgingTilesTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[88]] = AttackingFinalWardenTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[89]] = HandlingElidinisP3PrayersTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[90]] = HandlingTumekenP3PrayersTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[91]] = DodgingLightningTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[92]] = DodgingBabaBoulderTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[93]] = LootingChestRoomTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[94]] = ClaimingRewardsOutsideTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[95]] = DecantingPotionsTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[96]] = DrinkingStaminaTask.class;
        classArray[SquireAutoTOA.llIIIllIlll[97]] = LoggingOutAndStoppingTask.class;
        return classArray;
    }

    public boolean g() {
        return this.x;
    }

    public boolean d() {
        return this.u;
    }

    @Provides
    TOAConfig a(ConfigManager configManager) {
        return (TOAConfig)configManager.getConfig(TOAConfig.class);
    }

    private static boolean lIIllllllllIll(int n2, int n3) {
        return n2 < n3;
    }

    public void c() {
        this.a(llIIIllIlll[32]);
        this.c(llIIIllIlll[0]);
    }

    static {
        SquireAutoTOA.lIIlllllllIlll();
        SquireAutoTOA.lIIlllllIIlIll();
        Object[] objectArray = new Integer[llIIIllIlll[23]];
        objectArray[SquireAutoTOA.llIIIllIlll[0]] = llIIIllIlll[106];
        objectArray[SquireAutoTOA.llIIIllIlll[3]] = llIIIllIlll[107];
        objectArray[SquireAutoTOA.llIIIllIlll[4]] = llIIIllIlll[108];
        objectArray[SquireAutoTOA.llIIIllIlll[5]] = llIIIllIlll[109];
        objectArray[SquireAutoTOA.llIIIllIlll[6]] = llIIIllIlll[110];
        objectArray[SquireAutoTOA.llIIIllIlll[7]] = llIIIllIlll[111];
        objectArray[SquireAutoTOA.llIIIllIlll[8]] = llIIIllIlll[112];
        objectArray[SquireAutoTOA.llIIIllIlll[9]] = llIIIllIlll[113];
        objectArray[SquireAutoTOA.llIIIllIlll[10]] = llIIIllIlll[114];
        objectArray[SquireAutoTOA.llIIIllIlll[11]] = llIIIllIlll[115];
        objectArray[SquireAutoTOA.llIIIllIlll[12]] = llIIIllIlll[116];
        objectArray[SquireAutoTOA.llIIIllIlll[13]] = llIIIllIlll[117];
        objectArray[SquireAutoTOA.llIIIllIlll[14]] = llIIIllIlll[118];
        objectArray[SquireAutoTOA.llIIIllIlll[15]] = llIIIllIlll[119];
        objectArray[SquireAutoTOA.llIIIllIlll[16]] = llIIIllIlll[120];
        objectArray[SquireAutoTOA.llIIIllIlll[17]] = llIIIllIlll[121];
        objectArray[SquireAutoTOA.llIIIllIlll[18]] = llIIIllIlll[122];
        objectArray[SquireAutoTOA.llIIIllIlll[19]] = llIIIllIlll[123];
        objectArray[SquireAutoTOA.llIIIllIlll[20]] = llIIIllIlll[124];
        objectArray[SquireAutoTOA.llIIIllIlll[21]] = llIIIllIlll[125];
        objectArray[SquireAutoTOA.llIIIllIlll[22]] = llIIIllIlll[126];
        a = ImmutableSet.of((Object)llIIIllIlll[100], (Object)llIIIllIlll[101], (Object)llIIIllIlll[102], (Object)llIIIllIlll[103], (Object)llIIIllIlll[104], (Object)llIIIllIlll[105], (Object[])objectArray);
        Object[] objectArray2 = new Integer[llIIIllIlll[3]];
        objectArray2[SquireAutoTOA.llIIIllIlll[0]] = llIIIllIlll[133];
        b = ImmutableSet.of((Object)llIIIllIlll[127], (Object)llIIIllIlll[128], (Object)llIIIllIlll[129], (Object)llIIIllIlll[130], (Object)llIIIllIlll[131], (Object)llIIIllIlll[132], (Object[])objectArray2);
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
            SquireAutoTOA var9;
            var9.v = llIIIllIlll[0];
            var9.u = llIIIllIlll[0];
            var9.x = llIIIllIlll[0];
            var9.z = llIIIllIlll[0];
            var9.B = llIIIllIlll[0];
            var9.A = llIIIllIlll[0];
            var9.f.w();
            var9.i.w();
            var9.g.w();
            var9.j.register((Object)var9.f);
            var9.j.register((Object)var9.g);
            var9.j.register((Object)var9.h);
            var9.j.register((Object)var9.i);
            var9.j.register((Object)var9.t);
            var9.j.register((Object)var9.e);
            var9.k.add((Overlay)var9.l);

            var9.k.add((Overlay)var9.m);

            var9.k.add((Overlay)var9.n);

            var9.k.add((Overlay)var9.o);

            var9.k.add((Overlay)var9.p);

            var9.k.add((Overlay)var9.q);

            var9.k.add((Overlay)var9.r);

            var9.k.add((Overlay)var9.s);

        }
        catch (Exception var10) {
            var10.printStackTrace();
        }
        
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        if (SquireAutoTOA.lIIllllllllIlI(lootReceived.getName().contains(llIIIllIllI[llIIIllIlll[5]]) ? 1 : 0)) {
            return;
        }
        int n2 = Static.getClient().getVarbitValue(llIIIllIlll[99]);
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

        this.k.remove((Overlay)this.m);

        this.k.remove((Overlay)this.n);

        this.k.remove((Overlay)this.o);

        this.k.remove((Overlay)this.p);

        this.k.remove((Overlay)this.q);

        this.k.remove((Overlay)this.r);

        this.k.remove((Overlay)this.s);

    }
}

