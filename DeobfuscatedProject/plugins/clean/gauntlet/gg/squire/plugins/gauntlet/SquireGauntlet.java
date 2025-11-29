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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.plugins.gauntlet.SwappingWeaponTask;
import gg.squire.plugins.gauntlet.CookingFoodTask;
import gg.squire.plugins.gauntlet.CraftingGearTask;
import gg.squire.plugins.gauntlet.DroppingSomeFishTask;
import gg.squire.plugins.gauntlet.FillingVialsTask;
import gg.squire.plugins.gauntlet.FHelper;
import gg.squire.plugins.gauntlet.AttackingDemibossTask;
import gg.squire.plugins.gauntlet.ExploringFurtherTask;
import gg.squire.plugins.gauntlet.PathingToDemibossTask;
import gg.squire.plugins.gauntlet.JHelper;
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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.a;
import gg.squire.plugins.gauntlet.StartingAGauntletTask;
import gg.squire.plugins.gauntlet.TurningOffPrayersTask;
import gg.squire.plugins.gauntlet.GauntletManager;
import gg.squire.plugins.gauntlet.GauntletManager;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.o;
import gg.squire.plugins.gauntlet.HoppingTask;
import gg.squire.plugins.gauntlet.PickingUpPetTask;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.r;
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
        SquireGauntlet.llllllIlIIIIIl();
        SquireGauntlet.llllllIlIIIIII();
        a = llIIllIIlIIl[0];
    }

    private void b() {
        this.p = llIIllIIlIIl[0];
        this.k = llIIllIIlIIl[0];
        this.l = llIIllIIlIIl[0];
        this.m = llIIllIIlIIl[0];
        this.r = llIIllIIlIIl[0];
        this.o = 0L;
        this.n = Instant.now();
        a = llIIllIIlIIl[0];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        void var1;
        if (SquireGauntlet.llllllIlIIlIIl(configButtonClicked.getGroup().equals(llIIllIIlIII[llIIllIIlIIl[6]]) ? 1 : 0)) {
            return;
        }
        if (SquireGauntlet.llllllIlIIIIlI(var1.getKey().equals(llIIllIIlIII[llIIllIIlIIl[7]]) ? 1 : 0)) {
            int n2;
            if (SquireGauntlet.llllllIlIIlIIl(a ? 1 : 0)) {
                n2 = llIIllIIlIIl[3];

                if (((0x40 ^ 0x1C) & ~(0x62 ^ 0x3E)) < 0) {
                    return;
                }
            } else {
                n2 = llIIllIIlIIl[0];
            }
            a = n2;
            SquireGauntlet.a(a);
        }
    }

    private static int llllllIlIIllII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean llllllIlIIIlII(Object object, Object object2) {
        return object != object2;
    }

    public SquireGauntlet() {
        this.b = 0L;
        this.k = llIIllIIlIIl[0];
        this.l = llIIllIIlIIl[0];
        this.m = llIIllIIlIIl[0];
    }

    private long d() {
        return (long)this.a(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0));
    }

    private static boolean llllllIlIIIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllllIlIIIIlI(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var2);
    }

    public int i() {
        return this.k;
    }

    private static boolean llllllIlIIIIll(Object object) {
        return object != null;
    }

    private static boolean llllllIlIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIlIIIlll(Object object) {
        return object == null;
    }

    private static void llllllIlIIIIII() {
        llIIllIIlIII = new String[llIIllIIlIIl[8]];
        SquireGauntlet.llIIllIIlIII[SquireGauntlet.llIIllIIlIIl[0]] = "Recording change approved";
        SquireGauntlet.llIIllIIlIII[SquireGauntlet.llIIllIIlIIl[3]] = "Hunllef kill time";
        SquireGauntlet.llIIllIIlIII[SquireGauntlet.llIIllIIlIIl[4]] = "Oh dear, you are dead!";
        SquireGauntlet.llIIllIIlIII[SquireGauntlet.llIIllIIlIIl[6]] = "squiregauntlet";
        SquireGauntlet.llIIllIIlIII[SquireGauntlet.llIIllIIlIIl[7]] = "pauseTasks";
        SquireGauntlet.llIIllIIlIII[SquireGauntlet.llIIllIIlIIl[1]] = "[GAUNTLET] Your authentication has expired, stopping!";
    }

    private static boolean llllllIlIIlllI(int n2) {
        return n2 >= 0;
    }

    public GauntletConfig h() {
        return this.d;
    }

    private void e() {
        KeyEvent keyEvent = new KeyEvent(this.g.getCanvas(), llIIllIIlIIl[38], System.currentTimeMillis(), llIIllIIlIIl[39], llIIllIIlIIl[10]);
        this.g.getCanvas().dispatchEvent(keyEvent);
        KeyEvent keyEvent2 = new KeyEvent(this.g.getCanvas(), llIIllIIlIIl[40], System.currentTimeMillis(), llIIllIIlIIl[0], llIIllIIlIIl[10]);
        this.g.getCanvas().dispatchEvent(keyEvent2);
        KeyEvent keyEvent3 = new KeyEvent(this.g.getCanvas(), llIIllIIlIIl[41], System.currentTimeMillis(), llIIllIIlIIl[0], llIIllIIlIIl[10]);
        this.g.getCanvas().dispatchEvent(keyEvent3);
    }

    private static boolean llllllIlIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var3;
        if (SquireGauntlet.llllllIlIIIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && SquireGauntlet.llllllIlIIIlII(chatMessage.getType(), ChatMessageType.SPAM) && SquireGauntlet.llllllIlIIIlII(chatMessage.getType(), ChatMessageType.CONSOLE) && SquireGauntlet.llllllIlIIIlII(chatMessage.getType(), ChatMessageType.ENGINE)) {
            return;
        }
        if (SquireGauntlet.llllllIlIIIIlI(var3.getMessage().contains(llIIllIIlIII[llIIllIIlIIl[3]]) ? 1 : 0)) {
            var4.k += llIIllIIlIIl[3];
            var4.r += llIIllIIlIIl[3];
        }
        if (SquireGauntlet.llllllIlIIIIlI(var3.getMessage().contains(llIIllIIlIII[llIIllIIlIIl[4]]) ? 1 : 0)) {
            var4.l += llIIllIIlIIl[3];
            var4.r += llIIllIIlIIl[3];
        }
    }

    protected void onStart() {
        this.b();
        this.n = Instant.now();
        this.f.x();
        this.e.x();
        this.h.add((Overlay)this.i);

        this.h.add((Overlay)this.j);

        Executors.newSingleThreadExecutor().submit(SquireGauntlet::a);

    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        GameState gameState = gameStateChanged.getGameState();
        switch (n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.a.t[gameState.ordinal()]) {
            case 1: {
                SquireGauntlet var5;
                if (!SquireGauntlet.llllllIlIIIIll(var5.q)) break;
                var5.q = null;
                var5.p = llIIllIIlIIl[0];

                if (1 == 1) break;
                return;
            }
            case 2: 
            case 3: 
            case 4: {
                var5.p = llIIllIIlIIl[3];

                if (1 < 3) break;
                return;
            }
            case 5: {
                SquireGauntlet var5;
                if (!SquireGauntlet.llllllIlIIIIlI(var5.p ? 1 : 0)) break;
                var5.q = Instant.now();
                var5.p = llIIllIIlIIl[0];
            }
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

    private static boolean llllllIlIIIlIl(int n2) {
        return n2 > 0;
    }

    public void a(int n2) {
        this.m = n2;
    }

    protected void onStop() {
        this.b();
        this.f.y();
        this.e.y();
        this.h.remove((Overlay)this.i);

        this.h.remove((Overlay)this.j);

        this.g.setShowMouseCross(llIIllIIlIIl[3]);
        this.k = llIIllIIlIIl[0];
        this.l = llIIllIIlIIl[0];
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Duration var6;
        SquireGauntlet var7;
        if (SquireGauntlet.llllllIlIIIlIl(this.d.stopAtKc()) && SquireGauntlet.llllllIlIIIllI(this.d.stopAtKc(), this.k)) {
            SquireGauntlet.a(llIIllIIlIIl[3]);
            this.forceStop();
            return;
        }
        if (SquireGauntlet.llllllIlIIIIlI(var7.f() ? 1 : 0)) {
            var7.b = var7.d();
            Executors.newSingleThreadExecutor().submit(var7::e);

        }
        if (SquireGauntlet.llllllIlIIIlll(var7.q) && SquireGauntlet.llllllIlIIlIII(Game.getState(), GameState.LOGGED_IN)) {
            var7.q = Instant.now();
        }
        if (SquireGauntlet.llllllIlIIIIll(var7.q) && SquireGauntlet.llllllIlIIlIIl((var6 = Duration.between(var7.q, Instant.now())).minus(350L, ChronoUnit.MINUTES).isNegative() ? 1 : 0)) {
            Game.logout();
            return;
        }
        if (!SquireGauntlet.llllllIlIIIlII(var7.g.getGameState(), GameState.LOGIN_SCREEN) || SquireGauntlet.llllllIlIIIIlI(a ? 1 : 0)) {
            var7.o += 600L;
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
        Class[] classArray = new Class[llIIllIIlIIl[5]];
        classArray[SquireGauntlet.llIIllIIlIIl[0]] = TurningOffPrayersTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[3]] = HoppingTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[4]] = PickingUpPetTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[6]] = AttackingBossTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[7]] = EscapingHazardTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[1]] = ConsumingSuppliesTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[8]] = EnteringBossRoomTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[9]] = SwappingPrayersTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[10]] = SwappingWeaponTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[11]] = TickeatingBossTrampleTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[12]] = DroppingSomeFishTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[13]] = CookingFoodTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[14]] = CraftingGearTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[15]] = FillingVialsTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[16]] = FHelper.class;
        classArray[SquireGauntlet.llIIllIIlIIl[17]] = AttackingDemibossTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[18]] = ExploringFurtherTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[19]] = PathingToDemibossTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[20]] = JHelper.class;
        classArray[SquireGauntlet.llIIllIIlIIl[21]] = WalkingHomeTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[22]] = HarvestingResourcesTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[23]] = LootingItemsTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[24]] = GivingUpTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[25]] = AttackT1MonstersTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[26]] = ExploringTheGauntletTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[27]] = EnablingOffensivePrayersTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[28]] = GrabbingHarpoonTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[29]] = AttackingForCrystalsTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[30]] = EnablingRunTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[31]] = EquippingGearTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[32]] = GauntletManager.class;
        classArray[SquireGauntlet.llIIllIIlIIl[33]] = HandlingPrayersTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[34]] = StartingAGauntletTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[35]] = LootingTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[36]] = DepositingTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[2]] = ChattingTask.class;
        classArray[SquireGauntlet.llIIllIIlIIl[37]] = r.class;
        return classArray;
    }

    public static void a() {
        if (SquireGauntlet.llllllIlIIIIlI(((RSClient)Static.getClient()).isTesting() ? 1 : 0)) {
            int n2 = Rand.nextInt((int)llIIllIIlIIl[1], (int)llIIllIIlIIl[2]);
            Executors.newSingleThreadScheduledExecutor().schedule(() -> System.exit(llIIllIIlIIl[0]), (long)n2, TimeUnit.MINUTES);

        }
    }

    private static boolean llllllIlIIlIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllllIlIIlIll(int n2) {
        return n2 < 0;
    }

    private boolean f() {
        boolean bl;
        SquireGauntlet var8;
        int var9;
        int n2 = this.g.getKeyboardIdleTicks();
        if (SquireGauntlet.llllllIlIIllIl(this.g.getMouseIdleTicks(), n2)) {
            var9 = this.g.getMouseIdleTicks();
        }
        if (SquireGauntlet.llllllIlIIlllI(SquireGauntlet.llllllIlIIllII(var9, var8.b))) {
            bl = llIIllIIlIIl[3];

            if (3 == ((0xAD ^ 0xC6 ^ (0x61 ^ 0x5F)) & (203 + 209 - 332 + 166 ^ 72 + 70 - 9 + 30 ^ -1))) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            bl = llIIllIIlIIl[0];
        }
        return bl;
    }

    public void c() {
        if (SquireGauntlet.llllllIlIIlIll(SquireGauntlet.llllllIlIIlIlI(System.currentTimeMillis() - this.s, 600000L))) {
            return;
        }
        this.s = System.currentTimeMillis();
        this.c.execute(() -> {
            if (SquireGauntlet.llllllIlIIlIIl(NetUtils.confirm((SquirePlugin)this) ? 1 : 0)) {
                System.out.println(llIIllIIlIII[llIIllIIlIIl[1]]);
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
        if (!SquireGauntlet.llllllIlIIIIll(this.e) || SquireGauntlet.llllllIlIIIIlI(this.e.A() ? 1 : 0)) {
            void var10;
            var10.setCancelled(llIIllIIlIIl[3]);

            if (-1 > 1) {
                return;
            }
        } else {
            System.out.println(llIIllIIlIII[llIIllIIlIIl[0]]);
        }
    }

    @Provides
    GauntletConfig a(ConfigManager configManager) {
        return (GauntletConfig)configManager.getConfig(GauntletConfig.class);
    }

    private static int llllllIlIIlIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

