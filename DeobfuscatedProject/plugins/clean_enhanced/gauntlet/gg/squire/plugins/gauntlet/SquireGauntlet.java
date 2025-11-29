/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.core.loader.net.NetUtils
 *  gg.squire.client.event.RecordingChangeRequested
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.runelite.rs.api.RSClient
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.client.Static
 */
package gg.squire.plugins.gauntlet;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.core.loader.net.NetUtils;
import gg.squire.client.event.RecordingChangeRequested;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.plugins.gauntlet.GauntletConfig;
import gg.squire.plugins.gauntlet.overlay.GauntletInfoBox;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import gg.squire.plugins.gauntlet.SwappingWeaponTask;
import gg.squire.plugins.gauntlet.CookingFoodTask;
import gg.squire.plugins.gauntlet.CraftingGearTask;
import gg.squire.plugins.gauntlet.DroppingSomeFishTask;
import gg.squire.plugins.gauntlet.FillingVialsTask;
import gg.squire.plugins.gauntlet.FHelper;
import gg.squire.plugins.gauntlet.AttackingDemibossTask;
import gg.squire.plugins.gauntlet.ExploringFurtherTask;
import gg.squire.plugins.gauntlet.PathingToDemibossTask;
import gg.squire.plugins.gauntlet.GauntletManager;
import gg.squire.plugins.gauntlet.GrabbingHarpoonTask;
import gg.squire.plugins.gauntlet.HarvestingResourcesTask;
import gg.squire.plugins.gauntlet.LootingItemsTask;
import gg.squire.plugins.gauntlet.WalkingHomeTask;
import gg.squire.plugins.gauntlet.GivingUpTask;
import gg.squire.plugins.gauntlet.AttackT1MonstersTask;
import gg.squire.plugins.gauntlet.ExploringTheGauntletTask;
import gg.squire.plugins.gauntlet.AttackingForCrystalsTask;
import gg.squire.plugins.gauntlet.EnablingRunTask;
import gg.squire.plugins.gauntlet.EquippingGearTask;
import gg.squire.plugins.gauntlet.GauntletManager;
import gg.squire.plugins.gauntlet.EnablingOffensivePrayersTask;
import gg.squire.plugins.gauntlet.HandlingPrayersTask;
import gg.squire.plugins.gauntlet.ChattingTask;
import gg.squire.plugins.gauntlet.DepositingTask;
import gg.squire.plugins.gauntlet.LootingTask;
import gg.squire.plugins.gauntlet.AHelper;
import gg.squire.plugins.gauntlet.StartingAGauntletTask;
import gg.squire.plugins.gauntlet.TurningOffPrayersTask;
import gg.squire.plugins.gauntlet.GauntletManager;
import gg.squire.plugins.gauntlet.GauntletManager;
import gg.squire.plugins.gauntlet.OHelper;
import gg.squire.plugins.gauntlet.HoppingTask;
import gg.squire.plugins.gauntlet.PickingUpPetTask;
import gg.squire.plugins.gauntlet.RHelper;
import gg.squire.plugins.gauntlet.AttackingBossTask;
import gg.squire.plugins.gauntlet.EscapingHazardTask;
import gg.squire.plugins.gauntlet.ConsumingSuppliesTask;
import gg.squire.plugins.gauntlet.EnteringBossRoomTask;
import gg.squire.plugins.gauntlet.SwappingPrayersTask;
import gg.squire.plugins.gauntlet.TickeatingBossTrampleTask;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.rs.api.RSClient;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;

@PluginDescriptor(name="Squire Gauntlet", enabledByDefault=false)
public class SquireGauntlet
extends SquirePlugin {
    @Inject
    private  b f;
    private  int k;
    @Inject
    private  o j;
    private  long b;
    private  int m;
    
    private  Instant q;
    private  Instant n;
    private  long s;
    @Inject
    private  c e;
    @Inject
    private  OverlayManager h;
    private  boolean p;
    @Inject
    private  GauntletConfig d;
    @Inject
    private  Client g;
    @Inject
    private  ExecutorService c;
    
    private static  boolean a;
    private  long o;
    private  int r;
    private  int l;
    @Inject
    private  GauntletInfoBox i;

    static {
        SquireGauntlet.var3();
        SquireGauntlet.var4();
        a = 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private void b() {
        this.p = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.r = 0;
        this.o = 0L;
        this.n = Instant.now();
        a = 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        void var11;
        if ((configButtonClicked.getGroup( == 0).equals(var2[6]) ? 1 : 0)) {
            return;
        }
        if ((var11.getKey( != 0).equals(var2[7]) ? 1 : 0)) {
            int n2;
            if (a == 0) {
                n2 = 3;
                0;
                if (((0x40 ^ 0x1C) & ~(0x62 ^ 0x3E)) < 0) {
                    return;
                }
            } else {
                n2 = 0;
            }
            a = n2;
            SquireGauntlet.a(a);
        }
    }

    private static int var12(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public SquireGauntlet() {
        this.b = 0L;
        this.k = 0;
        this.l = 0;
        this.m = 0;
    }

    private long d() {
        return (long)this.a(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0));
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = 0;
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = 0;
        while (var21 < var20) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if ((0xC ^ 0x6C ^ (0xD6 ^ 0xB3)) > 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    public int i() {
        return this.k;
    }

    public GauntletConfig h() {
        return this.d;
    }

    private void e() {
        KeyEvent keyEvent = new KeyEvent(this.g.getCanvas(), var1[38], System.currentTimeMillis(), var1[39], var1[10]);
        this.g.getCanvas().dispatchEvent(keyEvent);
        KeyEvent keyEvent2 = new KeyEvent(this.g.getCanvas(), var1[40], System.currentTimeMillis(), 0, var1[10]);
        this.g.getCanvas().dispatchEvent(keyEvent2);
        KeyEvent keyEvent3 = new KeyEvent(this.g.getCanvas(), var1[41], System.currentTimeMillis(), 0, var1[10]);
        this.g.getCanvas().dispatchEvent(keyEvent3);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var23;
        if ((chatMessage.getType() != chatMessage.getType()2) && (chatMessage.getType() != chatMessage.getType()2) && (chatMessage.getType() != chatMessage.getType()2) && (chatMessage.getType() != chatMessage.getType()2)) {
            return;
        }
        if ((var23.getMessage( != 0).contains(var2[3]) ? 1 : 0)) {
            var24.k += 3;
            var24.r += 3;
        }
        if ((var23.getMessage( != 0).contains(var2[4]) ? 1 : 0)) {
            var24.l += 3;
            var24.r += 3;
        }
    }

    protected void onStart() {
        this.b();
        this.n = Instant.now();
        this.f.x();
        this.e.x();
        this.h.add((Overlay)this.i);
        0;
        this.h.add((Overlay)this.j);
        0;
        Executors.newSingleThreadExecutor().submit(SquireGauntlet::a);
        0;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        GameState gameState = gameStateChanged.getGameState();
        switch (n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.a.t[gameState.ordinal()]) {
            case 1: {
                SquireGauntlet var25;
                if (!(var25.q != null)) break;
                var25.q = null;
                var25.p = 0;
                0;
                if (1 == 1) break;
                return;
            }
            case 2: 
            case 3: 
            case 4: {
                var25.p = 3;
                0;
                if (1 < 3) break;
                return;
            }
            case 5: {
                SquireGauntlet var25;
                if (!(var25.p != 0)) break;
                var25.q = Instant.now();
                var25.p = 0;
            }
        }
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    public static void a(boolean bl) {
        a = bl;
    }

    private double a(double d2) {
        return Math.max(1.0, Math.min(13000.0, d2));
    }

    public static boolean g() {
        return a;
    }

    public void a(int n2) {
        this.m = n2;
    }

    protected void onStop() {
        this.b();
        this.f.y();
        this.e.y();
        this.h.remove((Overlay)this.i);
        0;
        this.h.remove((Overlay)this.j);
        0;
        this.g.setShowMouseCross(3);
        this.k = 0;
        this.l = 0;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Duration var32;
        SquireGauntlet var33;
        if ((this.d.stopAtKc( > 0)) && (this.d.stopAtKc() <= this.k)) {
            SquireGauntlet.a(3);
            this.forceStop();
            return;
        }
        if ((var33.f( != 0) ? 1 : 0)) {
            var33.b = var33.d();
            Executors.newSingleThreadExecutor().submit(var33::e);
            0;
        }
        if ((var33.q == null) && (Game.getState() == Game.getState()2)) {
            var33.q = Instant.now();
        }
        if ((var33.q != null) && ((var32 = Duration.between(var33.q, Instant.now( == 0))).minus(350L, ChronoUnit.MINUTES).isNegative() ? 1 : 0)) {
            Game.logout();
            return;
        }
        if (!(var33.g.getGameState() != var33.g.getGameState()2) || (a != 0)) {
            var33.o += 600L;
        }
    }

    public int j() {
        return this.l;
    }

    public int k() {
        return this.m;
    }

    public int m() {
        return this.r;
    }

    public long l() {
        return this.o;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[5];
        classArray[0] = TurningOffPrayersTask.class;
        classArray[3] = HoppingTask.class;
        classArray[4] = PickingUpPetTask.class;
        classArray[6] = AttackingBossTask.class;
        classArray[7] = EscapingHazardTask.class;
        classArray[1] = ConsumingSuppliesTask.class;
        classArray[8] = EnteringBossRoomTask.class;
        classArray[9] = SwappingPrayersTask.class;
        classArray[SquireGauntlet.var1[10]] = SwappingWeaponTask.class;
        classArray[SquireGauntlet.var1[11]] = TickeatingBossTrampleTask.class;
        classArray[SquireGauntlet.var1[12]] = DroppingSomeFishTask.class;
        classArray[SquireGauntlet.var1[13]] = CookingFoodTask.class;
        classArray[SquireGauntlet.var1[14]] = CraftingGearTask.class;
        classArray[SquireGauntlet.var1[15]] = FillingVialsTask.class;
        classArray[SquireGauntlet.var1[16]] = FHelper.class;
        classArray[SquireGauntlet.var1[17]] = AttackingDemibossTask.class;
        classArray[SquireGauntlet.var1[18]] = ExploringFurtherTask.class;
        classArray[SquireGauntlet.var1[19]] = PathingToDemibossTask.class;
        classArray[SquireGauntlet.var1[20]] = GauntletManager.class;
        classArray[SquireGauntlet.var1[21]] = WalkingHomeTask.class;
        classArray[SquireGauntlet.var1[22]] = HarvestingResourcesTask.class;
        classArray[SquireGauntlet.var1[23]] = LootingItemsTask.class;
        classArray[SquireGauntlet.var1[24]] = GivingUpTask.class;
        classArray[SquireGauntlet.var1[25]] = AttackT1MonstersTask.class;
        classArray[SquireGauntlet.var1[26]] = ExploringTheGauntletTask.class;
        classArray[SquireGauntlet.var1[27]] = EnablingOffensivePrayersTask.class;
        classArray[SquireGauntlet.var1[28]] = GrabbingHarpoonTask.class;
        classArray[SquireGauntlet.var1[29]] = AttackingForCrystalsTask.class;
        classArray[SquireGauntlet.var1[30]] = EnablingRunTask.class;
        classArray[SquireGauntlet.var1[31]] = EquippingGearTask.class;
        classArray[SquireGauntlet.var1[32]] = GauntletManager.class;
        classArray[SquireGauntlet.var1[33]] = HandlingPrayersTask.class;
        classArray[SquireGauntlet.var1[34]] = StartingAGauntletTask.class;
        classArray[SquireGauntlet.var1[35]] = LootingTask.class;
        classArray[SquireGauntlet.var1[36]] = DepositingTask.class;
        classArray[2] = ChattingTask.class;
        classArray[SquireGauntlet.var1[37]] = RHelper.class;
        return classArray;
    }

    public static void a() {
        if (((RSClientStatic.getClient()).isTesting() ? 1 : 0)) {
            int n2 = Rand.nextInt((int)1, (int)2);
            Executors.newSingleThreadScheduledExecutor().schedule(() -> System.exit(0), (long)n2, TimeUnit.MINUTES);
            0;
        }
    }

    private boolean f() {
        boolean bl;
        SquireGauntlet var34;
        int var35;
        int n2 = this.g.getKeyboardIdleTicks();
        if ((this.g.getMouseIdleTicks() < n2)) {
            var35 = this.g.getMouseIdleTicks();
        }
        if ((SquireGauntlet.var12(var35, var34.b >= 0))) {
            bl = 3;
            0;
            if (3 == ((0xAD ^ 0xC6 ^ (0x61 ^ 0x5F)) & (203 + 209 - 332 + 166 ^ 72 + 70 - 9 + 30 ^ -1))) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    public void c() {
        if ((SquireGauntlet.var36(System.currentTimeMillis( < 0) - this.s, 600000L))) {
            return;
        }
        this.s = System.currentTimeMillis();
        this.c.execute(() -> {
            if ((NetUtils.confirm((SquirePlugin == 0)this) ? 1 : 0)) {
                System.out.println(var2[1]);
                this.forceStop();
            }
        });
    }

    public void b(int n2) {
        this.r = n2;
    }

    public Instant getStarted() {
        return this.n;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(RecordingChangeRequested recordingChangeRequested) {
        if (!(this.e != null) || (this.e.A( != 0) ? 1 : 0)) {
            void var37;
            var37.setCancelled(3);
            0;
            0;
            if (-1 > 1) {
                return;
            }
        } else {
            System.out.println(var2[0]);
        }
    }

    @Provides
    GauntletConfig a(ConfigManager configManager) {
        return (GauntletConfig)configManager.getConfig(GauntletConfig.class);
    }

    private static int var36(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

