/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.game.ItemManager
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.runepouch.RunePouchSetup
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.overlay.NightmareInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.runepouch.RunePouchSetup;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.PreventingLogoutTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.UsingBankLoadoutTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.EmergencyTeleportOutTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.WalkingToBankTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.OpeningBankTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.RestoringInPohTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.RechargingSangTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.RechargingShadowRichTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.N_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.RechargingTridentTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ChargeTrackerTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.BuyingNewSuppliesRestockingTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.GrabTeleportToGeTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.SellingDropsRestockingTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.WalkToGrandExchangeTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.WithdrawingLootRestockingTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.CollectingItemsTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.RetrievingTeleportForDeathWalkingTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.SettingFireSpellTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.a_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.EnteringPnmTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.HoppingBeforeEntryTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.LoggingOutBefore6hTimerTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.WalkingToNightmareTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.SummonThrallTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.DisturbNightmareTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.DroppingEmptyVialYouShouldCrushLikeachampTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.PrayFlickingTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.AttackingHuskTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.AttackingNightmareTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.AttackingParasiteTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.AttackingSleepwalkerTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.SnipingSleepwalkerTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.AttackingTotemTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.SpecialAttackTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.CleansingParasiteTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.DrinkingBoostTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.EatingTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.RestoringPrayerTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.UsingImbuedHeartTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.AvoidingNightmaresChargeTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.SteppingIntoFlowerAreaTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.AvoidingGraspingClawsTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.AvoidingSporesTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.LootingTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.b_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.c_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.d_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.WEnum;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.z_Unknown;

@SquireUtil
@PluginDescriptor(name="Squire Phosani Nightmare", enabledByDefault=false)
public class SquireNightmarePlugin
extends SquirePlugin {
    private static final /* synthetic */ int z;
    private /* synthetic */ Integer aW;
    private /* synthetic */ boolean aF;
    public static final /* synthetic */ List<Integer> D;
    private static final /* synthetic */ int E;
    private static /* synthetic */ String[] lllIllIllIIl;
    private /* synthetic */ Instant az;
    private /* synthetic */ int aS;
    public static final /* synthetic */ String b;
    public static final /* synthetic */ int n;
    private static final /* synthetic */ int T;
    private /* synthetic */ boolean aK;
    public /* synthetic */ int aa;
    private final /* synthetic */ List<WorldPoint> Y;
    public /* synthetic */ List<WorldPoint> ab;
    private static final /* synthetic */ int H;
    public static final /* synthetic */ List<Integer> o;
    private /* synthetic */ int aN;
    private /* synthetic */ boolean aO;
    public /* synthetic */ boolean af;
    private static final /* synthetic */ int N;
    private static final /* synthetic */ int Q;
    private static final /* synthetic */ int U;
    public /* synthetic */ RunePouchSetup Z;
    private static final /* synthetic */ int L;
    public static final /* synthetic */ List<Integer> r;
    @Inject
    private /* synthetic */ OverlayManager ax;
    public /* synthetic */ Map<Integer, Integer> ag;
    private /* synthetic */ boolean at;
    private /* synthetic */ Integer aV;
    public static final /* synthetic */ int k;
    public static final /* synthetic */ int u;
    private /* synthetic */ int aR;
    private static final /* synthetic */ int K;
    public /* synthetic */ List<WorldPoint> ai;
    public /* synthetic */ boolean ac;
    public static final /* synthetic */ int h;
    private /* synthetic */ boolean aI;
    public static final /* synthetic */ int j;
    public static /* synthetic */ List<Integer> W;
    public static /* synthetic */ List<Integer> X;
    private static final /* synthetic */ int S;
    private /* synthetic */ boolean aC;
    public static final /* synthetic */ int l;
    private /* synthetic */ boolean au;
    public /* synthetic */ Future<BankLoadout> ak;
    @Inject
    private /* synthetic */ NightmareInfoBox ay;
    private /* synthetic */ int av;
    private static final /* synthetic */ int B;
    public static final /* synthetic */ List<Integer> q;
    @Inject
    private /* synthetic */ SquireNightmareConfig aw;
    public static final /* synthetic */ int f;
    private /* synthetic */ int aZ;
    private /* synthetic */ Queue<Duration> bg;
    private static final /* synthetic */ int P;
    private /* synthetic */ Prayer bb;
    private /* synthetic */ World aB;
    private /* synthetic */ boolean aE;
    private /* synthetic */ HashSet<Integer> aq;
    public /* synthetic */ int ae;
    private static final /* synthetic */ int F;
    private /* synthetic */ boolean aU;
    private static final /* synthetic */ int I;
    public static final /* synthetic */ Map<Integer, String> p;
    private /* synthetic */ boolean aG;
    private /* synthetic */ NPC aY;
    private /* synthetic */ boolean ar;
    private static /* synthetic */ int[] lllIllIllIll;
    private static final /* synthetic */ int G;
    private /* synthetic */ boolean aX;
    private /* synthetic */ List<Queue<Duration>> bf;
    public static final /* synthetic */ int w;
    private /* synthetic */ WorldPoint aL;
    public static final /* synthetic */ RegionPoint t;
    private static final /* synthetic */ int R;
    private static final /* synthetic */ int A;
    private static final /* synthetic */ int J;
    private /* synthetic */ int aJ;
    public /* synthetic */ boolean ap;
    private /* synthetic */ boolean aM;
    public static final /* synthetic */ int m;
    public static final /* synthetic */ int v;
    public /* synthetic */ boolean ad;
    public /* synthetic */ long al;
    private /* synthetic */ boolean bc;
    private static final /* synthetic */ int O;
    private /* synthetic */ int ba;
    public /* synthetic */ WorldArea aj;
    private static final /* synthetic */ Logger a;
    private static final /* synthetic */ int y;
    public /* synthetic */ BankLoadout an;
    private /* synthetic */ WorldArea aD;
    private /* synthetic */ int aQ;
    @Inject
    private /* synthetic */ ItemManager aT;
    private static final /* synthetic */ int C;
    public static /* synthetic */ List<Integer> V;
    public static final /* synthetic */ int x;
    private /* synthetic */ boolean as;
    private /* synthetic */ Instant bd;
    public static final /* synthetic */ int d;
    public /* synthetic */ boolean ao;
    public static final /* synthetic */ int i;
    private static final /* synthetic */ int M;
    public static final /* synthetic */ int e;
    @Inject
    public /* synthetic */ h ah;
    public /* synthetic */ Future<BankLoadout> am;
    @Inject
    private /* synthetic */ z aP;
    public static final /* synthetic */ List<Integer> s;
    private /* synthetic */ int aA;
    public static final /* synthetic */ int c;
    public static final /* synthetic */ int g;
    private /* synthetic */ WorldPoint aH;
    private /* synthetic */ Instant be;

    public void i(boolean bl) {
        this.bc = bl;
    }

    public void a(Queue<Duration> queue) {
        this.bg = queue;
    }

    public void k() {
        this.j();
    }

    public void i(int n2) {
        this.ba = n2;
    }

    public static int c() {
        return Inventory.getAll(item -> {
            int n2;
            String string = item.getName().toLowerCase();
            if (!SquireNightmarePlugin.lIIIllIlIllIIII(string.contains(lllIllIllIIl[lllIllIllIll[43]]) ? 1 : 0) || SquireNightmarePlugin.lIIIllIlIlIlllI(string.contains(lllIllIllIIl[lllIllIllIll[44]]) ? 1 : 0)) {
                n2 = lllIllIllIll[0];
                0;
                if (3 < 0) {
                    return false;
                }
            } else {
                n2 = lllIllIllIll[1];
            }
            return n2 != 0;
        }).stream().map(item -> Character.valueOf(item.getName().charAt(item.getName().indexOf(lllIllIllIll[43]) + lllIllIllIll[0]))).mapToInt(Character::getNumericValue).sum();
    }

    public void p(boolean bl) {
        this.aI = bl;
    }

    static {
        SquireNightmarePlugin.lIIIllIlIlIllIl();
        SquireNightmarePlugin.lIIIllIlIlIllII();
        O = lllIllIllIll[57];
        S = lllIllIllIll[58];
        T = lllIllIllIll[59];
        U = lllIllIllIll[13];
        l = lllIllIllIll[60];
        C = lllIllIllIll[61];
        K = lllIllIllIll[62];
        w = lllIllIllIll[63];
        Q = lllIllIllIll[64];
        A = lllIllIllIll[65];
        x = lllIllIllIll[12];
        P = lllIllIllIll[66];
        m = lllIllIllIll[67];
        L = lllIllIllIll[68];
        e = lllIllIllIll[51];
        G = lllIllIllIll[69];
        F = lllIllIllIll[70];
        j = lllIllIllIll[71];
        u = lllIllIllIll[61];
        v = lllIllIllIll[72];
        M = lllIllIllIll[73];
        H = lllIllIllIll[74];
        R = lllIllIllIll[75];
        c = lllIllIllIll[49];
        h = lllIllIllIll[76];
        N = lllIllIllIll[77];
        b = lllIllIllIIl[lllIllIllIll[78]];
        k = lllIllIllIll[79];
        d = lllIllIllIll[53];
        I = lllIllIllIll[63];
        J = lllIllIllIll[80];
        i = lllIllIllIll[81];
        y = lllIllIllIll[82];
        n = lllIllIllIll[47];
        f = lllIllIllIll[50];
        E = lllIllIllIll[83];
        z = lllIllIllIll[84];
        g = lllIllIllIll[52];
        B = lllIllIllIll[85];
        a = LoggerFactory.getLogger(SquireNightmarePlugin.class);
        Integer[] integerArray = new Integer[lllIllIllIll[7]];
        integerArray[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIll[86];
        integerArray[SquireNightmarePlugin.lllIllIllIll[0]] = lllIllIllIll[87];
        integerArray[SquireNightmarePlugin.lllIllIllIll[4]] = lllIllIllIll[88];
        integerArray[SquireNightmarePlugin.lllIllIllIll[5]] = lllIllIllIll[89];
        o = Arrays.asList(integerArray);
        p = new a();
        Integer[] integerArray2 = new Integer[lllIllIllIll[7]];
        integerArray2[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIll[90];
        integerArray2[SquireNightmarePlugin.lllIllIllIll[0]] = lllIllIllIll[91];
        integerArray2[SquireNightmarePlugin.lllIllIllIll[4]] = lllIllIllIll[92];
        integerArray2[SquireNightmarePlugin.lllIllIllIll[5]] = lllIllIllIll[93];
        q = Arrays.asList(integerArray2);
        Integer[] integerArray3 = new Integer[lllIllIllIll[7]];
        integerArray3[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIll[94];
        integerArray3[SquireNightmarePlugin.lllIllIllIll[0]] = lllIllIllIll[95];
        integerArray3[SquireNightmarePlugin.lllIllIllIll[4]] = lllIllIllIll[96];
        integerArray3[SquireNightmarePlugin.lllIllIllIll[5]] = lllIllIllIll[97];
        r = Arrays.asList(integerArray3);
        Integer[] integerArray4 = new Integer[lllIllIllIll[15]];
        integerArray4[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIll[86];
        integerArray4[SquireNightmarePlugin.lllIllIllIll[0]] = lllIllIllIll[87];
        integerArray4[SquireNightmarePlugin.lllIllIllIll[4]] = lllIllIllIll[88];
        integerArray4[SquireNightmarePlugin.lllIllIllIll[5]] = lllIllIllIll[89];
        integerArray4[SquireNightmarePlugin.lllIllIllIll[7]] = lllIllIllIll[90];
        integerArray4[SquireNightmarePlugin.lllIllIllIll[8]] = lllIllIllIll[91];
        integerArray4[SquireNightmarePlugin.lllIllIllIll[9]] = lllIllIllIll[92];
        integerArray4[SquireNightmarePlugin.lllIllIllIll[10]] = lllIllIllIll[93];
        integerArray4[SquireNightmarePlugin.lllIllIllIll[11]] = lllIllIllIll[94];
        integerArray4[SquireNightmarePlugin.lllIllIllIll[12]] = lllIllIllIll[95];
        integerArray4[SquireNightmarePlugin.lllIllIllIll[13]] = lllIllIllIll[96];
        integerArray4[SquireNightmarePlugin.lllIllIllIll[14]] = lllIllIllIll[97];
        s = Arrays.asList(integerArray4);
        t = new RegionPoint(lllIllIllIll[35], lllIllIllIll[34], lllIllIllIll[5], lllIllIllIll[98]);
        Integer[] integerArray5 = new Integer[lllIllIllIll[8]];
        integerArray5[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIll[82];
        integerArray5[SquireNightmarePlugin.lllIllIllIll[0]] = lllIllIllIll[84];
        integerArray5[SquireNightmarePlugin.lllIllIllIll[4]] = lllIllIllIll[65];
        integerArray5[SquireNightmarePlugin.lllIllIllIll[5]] = lllIllIllIll[85];
        integerArray5[SquireNightmarePlugin.lllIllIllIll[7]] = lllIllIllIll[61];
        D = Arrays.asList(integerArray5);
        V = List.of(Integer.valueOf(lllIllIllIll[60]), Integer.valueOf(lllIllIllIll[99]));
        W = List.of(Integer.valueOf(lllIllIllIll[100]), Integer.valueOf(lllIllIllIll[101]));
        List[] listArray = new List[lllIllIllIll[4]];
        listArray[SquireNightmarePlugin.lllIllIllIll[1]] = V;
        listArray[SquireNightmarePlugin.lllIllIllIll[0]] = W;
        X = Stream.of(listArray).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public void c(Instant instant) {
        this.be = instant;
    }

    public boolean r() {
        return this.ac;
    }

    public void a(h h2) {
        this.ah = h2;
    }

    public void a(int n2) {
        this.aa = n2;
    }

    public void g() {
        this.j();
        this.k(lllIllIllIll[0]);
        this.aS += lllIllIllIll[0];
    }

    public void g(boolean bl) {
        this.aC = bl;
    }

    public OverlayManager E() {
        return this.ax;
    }

    protected void onStop() {
        this.j();
        this.aU = lllIllIllIll[1];
        this.av = lllIllIllIll[1];
        this.an = null;
        this.al = 0L;
        this.am = null;
        this.ac = lllIllIllIll[1];
        this.aR = lllIllIllIll[1];
        this.aS = lllIllIllIll[1];
        this.ad = lllIllIllIll[1];
        this.ax.remove((Overlay)this.ay);
        0;
        this.aN = lllIllIllIll[1];
        this.aM = lllIllIllIll[1];
        this.aE = lllIllIllIll[1];
        this.ar = lllIllIllIll[1];
        this.aI = lllIllIllIll[1];
        this.j(lllIllIllIll[46]);
        this.ax.remove((Overlay)this.aP);
        0;
        this.ad = lllIllIllIll[1];
        this.aq = new HashSet();
        this.ag = new c(this);
        this.ae = lllIllIllIll[1];
        this.ai = new ArrayList<WorldPoint>();
        this.aX = lllIllIllIll[1];
    }

    public void a(Future<BankLoadout> future) {
        this.ak = future;
    }

    public boolean ad() {
        return this.ar;
    }

    public WorldArea ac() {
        return this.aj;
    }

    public void o(boolean bl) {
        this.aG = bl;
    }

    public List<WorldPoint> q() {
        return this.ab;
    }

    public void a(World world) {
        this.aB = world;
    }

    public void b(WorldPoint worldPoint) {
        this.aL = worldPoint;
    }

    public int p() {
        return this.aa;
    }

    public ItemManager L() {
        return this.aT;
    }

    public void j(boolean bl) {
        this.af = bl;
    }

    public boolean O() {
        return this.aX;
    }

    public Map<Integer, Integer> aa() {
        return this.ag;
    }

    public h u() {
        return this.ah;
    }

    public void k(int n2) {
        this.aN = n2;
    }

    public int J() {
        return this.aR;
    }

    public void a(OverlayManager overlayManager) {
        this.ax = overlayManager;
    }

    public void a(NPC nPC) {
        this.aY = nPC;
    }

    public boolean C() {
        return this.at;
    }

    public int K() {
        return this.aS;
    }

    private static String lIIIllIlIlIIlll(String var34, String var47) {
        try {
            SecretKeySpec var27 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var47.getBytes(StandardCharsets.UTF_8)), lllIllIllIll[11]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lllIllIllIll[4], var27);
            return new String(var21.doFinal(Base64.getDecoder().decode(var34.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    public Instant U() {
        return this.bd;
    }

    private static boolean lIIIllIlIlIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(GraphicsObjectCreated graphicsObjectCreated) {
        void var33;
        if (SquireNightmarePlugin.lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlII(Players.getLocal().getWorldLocation().getPlane(), lllIllIllIll[5])) {
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var33.getGraphicsObject().getId(), lllIllIllIll[47])) {
            SquireNightmarePlugin var1;
            WorldPoint var35 = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var33.getGraphicsObject().getLocation());
            var1.Y.add(var35);
            0;
            var1.aE = lllIllIllIll[0];
            var1.aJ = lllIllIllIll[8];
            var1.aQ = var1.aJ + lllIllIllIll[0];
        }
    }

    private static void lIIIllIlIlIllIl() {
        lllIllIllIll = new int[103];
        SquireNightmarePlugin.lllIllIllIll[0] = 1;
        SquireNightmarePlugin.lllIllIllIll[1] = (56 + 88 - 87 + 75 ^ 187 + 66 - 166 + 105) & (96 + 71 - 116 + 82 ^ 87 + 172 - 235 + 169 ^ -1);
        SquireNightmarePlugin.lllIllIllIll[2] = 0xFFFFF7ED & 0x6CFF;
        SquireNightmarePlugin.lllIllIllIll[3] = 0xFFFFD7E3 & 0x7F9C;
        SquireNightmarePlugin.lllIllIllIll[4] = 2;
        SquireNightmarePlugin.lllIllIllIll[5] = 3;
        SquireNightmarePlugin.lllIllIllIll[6] = 0xB7 ^ 0x9C;
        SquireNightmarePlugin.lllIllIllIll[7] = 90 + 2 - -60 + 11 ^ 163 + 1 - 82 + 85;
        SquireNightmarePlugin.lllIllIllIll[8] = 98 + 110 - 54 + 42 ^ 176 + 51 - 49 + 15;
        SquireNightmarePlugin.lllIllIllIll[9] = 7 ^ 1;
        SquireNightmarePlugin.lllIllIllIll[10] = 6 ^ 0x69 ^ (0 ^ 0x68);
        SquireNightmarePlugin.lllIllIllIll[11] = 0x38 ^ 0x30;
        SquireNightmarePlugin.lllIllIllIll[12] = 0x6A ^ 0x63;
        SquireNightmarePlugin.lllIllIllIll[13] = 0x3E ^ 0x34;
        SquireNightmarePlugin.lllIllIllIll[14] = 0x8C ^ 0xA8 ^ (0x10 ^ 0x3F);
        SquireNightmarePlugin.lllIllIllIll[15] = 0xE7 ^ 0x87 ^ (0x4A ^ 0x26);
        SquireNightmarePlugin.lllIllIllIll[16] = 0x85 ^ 0x88;
        SquireNightmarePlugin.lllIllIllIll[17] = 0x76 ^ 0x47 ^ (0x83 ^ 0xBC);
        SquireNightmarePlugin.lllIllIllIll[18] = 0x56 ^ 0x59;
        SquireNightmarePlugin.lllIllIllIll[19] = 115 + 51 - 149 + 163 ^ 152 + 19 - 59 + 52;
        SquireNightmarePlugin.lllIllIllIll[20] = 7 ^ 0x16;
        SquireNightmarePlugin.lllIllIllIll[21] = 0x15 ^ 0x3F ^ (0x18 ^ 0x20);
        SquireNightmarePlugin.lllIllIllIll[22] = 0xA9 ^ 0xA1 ^ (0x18 ^ 3);
        SquireNightmarePlugin.lllIllIllIll[23] = 101 + 118 - 170 + 137 ^ 35 + 30 - 55 + 164;
        SquireNightmarePlugin.lllIllIllIll[24] = 0x18 ^ 0xD;
        SquireNightmarePlugin.lllIllIllIll[25] = 0x5B ^ 0x4D;
        SquireNightmarePlugin.lllIllIllIll[26] = 118 + 128 - 131 + 67 ^ 103 + 12 - 45 + 91;
        SquireNightmarePlugin.lllIllIllIll[27] = 0x43 ^ 0x5B;
        SquireNightmarePlugin.lllIllIllIll[28] = 0x4A ^ 0x53;
        SquireNightmarePlugin.lllIllIllIll[29] = 0x55 ^ 0x4F;
        SquireNightmarePlugin.lllIllIllIll[30] = 0x10 ^ 0x55 ^ (0xCB ^ 0x95);
        SquireNightmarePlugin.lllIllIllIll[31] = 0x73 ^ 0x6F;
        SquireNightmarePlugin.lllIllIllIll[32] = 0x20 ^ 0x70 ^ (0x27 ^ 0x6A);
        SquireNightmarePlugin.lllIllIllIll[33] = 0x5B ^ 0x45;
        SquireNightmarePlugin.lllIllIllIll[34] = 0x33 ^ 0x77 ^ (0xDE ^ 0x85);
        SquireNightmarePlugin.lllIllIllIll[35] = 0x3F ^ 0x47 ^ (0x46 ^ 0x1E);
        SquireNightmarePlugin.lllIllIllIll[36] = 135 + 82 - 143 + 77 ^ 158 + 121 - 134 + 37;
        SquireNightmarePlugin.lllIllIllIll[37] = 0xE6 ^ 0xC4;
        SquireNightmarePlugin.lllIllIllIll[38] = 74 + 53 - 63 + 83 ^ 30 + 57 - -80 + 9;
        SquireNightmarePlugin.lllIllIllIll[39] = 0x6B ^ 0x4F;
        SquireNightmarePlugin.lllIllIllIll[40] = 0xAC ^ 0x93 ^ (0x51 ^ 0x4B);
        SquireNightmarePlugin.lllIllIllIll[41] = 0x55 ^ 0x73;
        SquireNightmarePlugin.lllIllIllIll[42] = 87 + 111 - 66 + 34 ^ 102 + 109 - 101 + 19;
        SquireNightmarePlugin.lllIllIllIll[43] = 13 + 134 - 99 + 119 ^ 47 + 51 - 73 + 118;
        SquireNightmarePlugin.lllIllIllIll[44] = 51 + 54 - -7 + 65 ^ 35 + 43 - 24 + 98;
        SquireNightmarePlugin.lllIllIllIll[45] = 0xB8 ^ 0x92;
        SquireNightmarePlugin.lllIllIllIll[46] = -1;
        SquireNightmarePlugin.lllIllIllIll[47] = -(0xFFFF8BF3 & 0x7D1D) & (0xFFFFEFFF & 0x1FF7);
        SquireNightmarePlugin.lllIllIllIll[48] = -(0xFFFFCFFF & 0x3261) & (0xFFFFF7FB & 0x1AFF);
        SquireNightmarePlugin.lllIllIllIll[49] = 0xFFFFEDBB & 0x33E7;
        SquireNightmarePlugin.lllIllIllIll[50] = -(0xFFFFDE7F & 0x27C5) & (0xFFFFAFF7 & 0x77DF);
        SquireNightmarePlugin.lllIllIllIll[51] = 0xFFFFBFD5 & 0x61BE;
        SquireNightmarePlugin.lllIllIllIll[52] = -(0xFFFFDE6D & 0x65FB) & (0xFFFFFDFE & 0x67FB);
        SquireNightmarePlugin.lllIllIllIll[53] = 0xFFFFF5B5 & 0x2BEE;
        SquireNightmarePlugin.lllIllIllIll[54] = 0xFFFF8EFD & 0x77F7;
        SquireNightmarePlugin.lllIllIllIll[55] = 67 + 31 - -15 + 87;
        SquireNightmarePlugin.lllIllIllIll[56] = 1 ^ (0x15 ^ 0x38);
        SquireNightmarePlugin.lllIllIllIll[57] = 0xFFFFE4FF & 0x3FD4;
        SquireNightmarePlugin.lllIllIllIll[58] = 0xFFFFE4F9 & 0x3FDE;
        SquireNightmarePlugin.lllIllIllIll[59] = 0xFFFFF5FF & 0x2ED9;
        SquireNightmarePlugin.lllIllIllIll[60] = -(0xFFFFDC65 & 0x2B9B) & (0xFFFFBFFE & 0x6CEF);
        SquireNightmarePlugin.lllIllIllIll[61] = -(0xFFFFD9EE & 0x365F) & (0xFFFFBBFF & 0x7FDF);
        SquireNightmarePlugin.lllIllIllIll[62] = -(0xFFFFBF8E & 0x5375) & (0xFFFFFFFB & 0x37D7);
        SquireNightmarePlugin.lllIllIllIll[63] = 0xFFFFEFEF & 0x34DE;
        SquireNightmarePlugin.lllIllIllIll[64] = 0xFFFFF5FF & 0x2ED6;
        SquireNightmarePlugin.lllIllIllIll[65] = 0xFFFFACFF & 0x77CA;
        SquireNightmarePlugin.lllIllIllIll[66] = 0xFFFFBFDF & 0x64F5;
        SquireNightmarePlugin.lllIllIllIll[67] = -(0xFFFFC6FE & 0x7B15) & (0xFFFFEFFF & 0x76FF);
        SquireNightmarePlugin.lllIllIllIll[68] = 0xFFFFF7F3 & 0x2CDD;
        SquireNightmarePlugin.lllIllIllIll[69] = 0xFFFFACDF & 0x77ED;
        SquireNightmarePlugin.lllIllIllIll[70] = 0xFFFFB4FF & 0x6FCC;
        SquireNightmarePlugin.lllIllIllIll[71] = 0xFFFF9BEF & 0xF77B;
        SquireNightmarePlugin.lllIllIllIll[72] = 0xFFFFF9FC & 0x279F;
        SquireNightmarePlugin.lllIllIllIll[73] = -(0xFFFFC65B & 0x7BAE) & (0xFFFFEEFF & 0x77DB);
        SquireNightmarePlugin.lllIllIllIll[74] = 0xFFFFEB9B & 0x3FF7;
        SquireNightmarePlugin.lllIllIllIll[75] = -(0xFFFFFF8B & 0x5A7D) & (0xFFFFFEFF & 0x7FDF);
        SquireNightmarePlugin.lllIllIllIll[76] = 0xFFFFB1B7 & 0x6FE9;
        SquireNightmarePlugin.lllIllIllIll[77] = 0xFFFFEFFB & 0x34D7;
        SquireNightmarePlugin.lllIllIllIll[78] = 0xFF ^ 0xAB ^ (0x5E ^ 0x27);
        SquireNightmarePlugin.lllIllIllIll[79] = -(0xFFFFBDBF & 0x72E9) & (0xFFFFFCBF & 0x37ED);
        SquireNightmarePlugin.lllIllIllIll[80] = -(0xFFFFCB2D & 0x37F3) & (0xFFFFA7EF & Short.MAX_VALUE);
        SquireNightmarePlugin.lllIllIllIll[81] = -(0xFFFF8CDF & 0x77E9) & (0xFFFFD7FE & 0x3CFF);
        SquireNightmarePlugin.lllIllIllIll[82] = -(0xFFFFDB3B & 0x3EF5) & (0xFFFFFFF9 & 0x3EFE);
        SquireNightmarePlugin.lllIllIllIll[83] = -(0xFFFFB973 & 0x5EBD) & (0xFFFFBFFF & 0x7CFB);
        SquireNightmarePlugin.lllIllIllIll[84] = -(0xFFFFF753 & 0x58BF) & (0xFFFFF4DB & Short.MAX_VALUE);
        SquireNightmarePlugin.lllIllIllIll[85] = -(0xFFFFFE6F & 0x55F9) & (0xFFFFFFFB & 0x7FFD);
        SquireNightmarePlugin.lllIllIllIll[86] = -(0xFFFFEFAF & 0x5B71) & (0xFFFFFFFC & 0x6FFF);
        SquireNightmarePlugin.lllIllIllIll[87] = 0xFFFFBDDF & 0x66FF;
        SquireNightmarePlugin.lllIllIllIll[88] = -(0xFFFF9F9F & 0x617A) & (0xFFFFE5FF & 0x3FFB);
        SquireNightmarePlugin.lllIllIllIll[89] = -(0xFFFFC9BB & 0x7E57) & (0xFFFFECF7 & Short.MAX_VALUE);
        SquireNightmarePlugin.lllIllIllIll[90] = -(0xFFFFFF81 & 0x527F) & (0xFFFFF7FF & 0x7EDB);
        SquireNightmarePlugin.lllIllIllIll[91] = -(0xFFFF9D97 & 0x7A69) & (0xFFFFFDDE & 0x3EFF);
        SquireNightmarePlugin.lllIllIllIll[92] = -(0xFFFFDF5D & 0x2ABF) & (0xFFFFEFFD & 0x3EFF);
        SquireNightmarePlugin.lllIllIllIll[93] = 0xFFFFE5EC & 0x3EF7;
        SquireNightmarePlugin.lllIllIllIll[94] = -2 & (0xFFFFE4FF & 0x3FDB);
        SquireNightmarePlugin.lllIllIllIll[95] = 0xFFFFEDDF & 0x36FD;
        SquireNightmarePlugin.lllIllIllIll[96] = -(0xFFFFF99D & 0x5F76) & (0xFFFFFDFB & 0x7FF7);
        SquireNightmarePlugin.lllIllIllIll[97] = 0xFFFFE6F3 & 0x3DEF;
        SquireNightmarePlugin.lllIllIllIll[98] = -(0xFFFFC7DF & 0x7865) & (0xFFFFFFFF & 0x7CDF);
        SquireNightmarePlugin.lllIllIllIll[99] = -(0xFFFFF6AF & 0x5952) & (0xFFFFFDFF & 0x76FB);
        SquireNightmarePlugin.lllIllIllIll[100] = -(0xFFFFB7BF & 0x5A41) & (0xFFFFB6FF & 0x7FEF);
        SquireNightmarePlugin.lllIllIllIll[101] = -(0xFFFFFF41 & 0x59BF) & (0xFFFFFDFF & 0x7FFB);
        SquireNightmarePlugin.lllIllIllIll[102] = 0x6E ^ 0xD ^ (0x7F ^ 0x32);
    }

    private static boolean lIIIllIlIllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    public void a(Integer n2) {
        this.aV = n2;
    }

    public void b(Instant instant) {
        this.bd = instant;
    }

    public void a(RunePouchSetup runePouchSetup) {
        this.Z = runePouchSetup;
    }

    public List<Queue<Duration>> W() {
        return this.bf;
    }

    public void t(boolean bl) {
        this.aU = bl;
    }

    public int R() {
        return this.ba;
    }

    public boolean am() {
        return this.aG;
    }

    public boolean T() {
        return this.bc;
    }

    public SquireNightmarePlugin() {
        this.Y = new ArrayList<WorldPoint>();
        this.Z = null;
        this.aa = lllIllIllIll[55];
        this.ab = new ArrayList<WorldPoint>();
        this.ac = lllIllIllIll[1];
        this.ad = lllIllIllIll[1];
        this.ae = lllIllIllIll[1];
        this.ai = new ArrayList<WorldPoint>();
        this.ak = null;
        this.al = 0L;
        this.am = null;
        this.an = null;
        this.ao = lllIllIllIll[1];
        this.aq = new HashSet();
        this.ar = lllIllIllIll[1];
        this.aE = lllIllIllIll[1];
        this.aG = lllIllIllIll[1];
        this.aK = lllIllIllIll[1];
        this.aO = lllIllIllIll[1];
        this.aQ = lllIllIllIll[1];
        this.aR = lllIllIllIll[1];
        this.aS = lllIllIllIll[1];
        this.aU = lllIllIllIll[1];
        this.aV = lllIllIllIll[1];
        this.aW = lllIllIllIll[1];
        this.aX = lllIllIllIll[1];
        this.aY = null;
        this.aZ = lllIllIllIll[0];
        this.bf = List.of(new LinkedList(), new LinkedList(), new LinkedList(), new LinkedList(), new LinkedList());
        this.bg = new LinkedList<Duration>();
    }

    private static boolean lIIIllIlIllIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIllIlIlllIII(int n2, int n3) {
        return n2 > n3;
    }

    public void a(z z2) {
        this.aP = z2;
    }

    public static int b() {
        return Inventory.getCount((boolean)lllIllIllIll[0], item -> {
            String[] stringArray = new String[lllIllIllIll[0]];
            stringArray[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIIl[lllIllIllIll[45]];
            return item.hasAction(stringArray);
        });
    }

    private static boolean lIIIllIlIllIIll(Object object) {
        return object == null;
    }

    public void a(WorldArea worldArea) {
        this.aj = worldArea;
    }

    public WorldPoint ar() {
        return this.aL;
    }

    public void a(HashSet<Integer> hashSet) {
        this.aq = hashSet;
    }

    public boolean D() {
        return this.au;
    }

    public NPC P() {
        return this.aY;
    }

    public static int a() {
        return Inventory.getAll(item -> {
            boolean bl;
            String string = item.getName().toLowerCase();
            if (!SquireNightmarePlugin.lIIIllIlIllIIII(string.contains(lllIllIllIIl[lllIllIllIll[6]]) ? 1 : 0) || SquireNightmarePlugin.lIIIllIlIlIlllI(string.contains(lllIllIllIIl[lllIllIllIll[56]]) ? 1 : 0)) {
                bl = lllIllIllIll[0];
                0;
                if (((6 + 44 - 33 + 122 ^ 124 + 50 - 160 + 162) & (0x6A ^ 0x17 ^ (0x69 ^ 0x2F) ^ -1)) > ((27 + 68 - -83 + 6 ^ 24 + 69 - 59 + 142) & (21 + 62 - 39 + 111 ^ 8 + 17 - -21 + 101 ^ -1))) {
                    return ((2 ^ (0x6A ^ 0x56)) & (0xD6 ^ 0xB5 ^ (0x30 ^ 0x6D) ^ -1)) != 0;
                }
            } else {
                bl = lllIllIllIll[1];
            }
            return bl;
        }).stream().map(item -> Character.valueOf(item.getName().charAt(item.getName().indexOf(lllIllIllIll[43]) + lllIllIllIll[0]))).mapToInt(Character::getNumericValue).sum();
    }

    public int I() {
        return this.aQ;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        void var4;
        if (SquireNightmarePlugin.lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIll(SquireNightmarePlugin.d())) {
            return;
        }
        NPC var2 = var4.getNpc();
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var2.getName().equalsIgnoreCase(lllIllIllIIl[lllIllIllIll[33]]) ? 1 : 0)) {
            lllllllllllllllIIllIIllIlIIlllII.bc = lllIllIllIll[1];
        }
    }

    private static boolean lIIIllIlIlIllll(Object object) {
        return object != null;
    }

    public boolean s() {
        return this.ad;
    }

    private static boolean lIIIllIlIllIlll(Object object, Object object2) {
        return object != object2;
    }

    public static NPC d() {
        return NPCs.getNearest(nPC -> nPC.getName().toLowerCase().contains(lllIllIllIIl[lllIllIllIll[42]]));
    }

    @Provides
    SquireNightmareConfig a(ConfigManager configManager) {
        return (SquireNightmareConfig)configManager.getConfig(SquireNightmareConfig.class);
    }

    public void r(boolean bl) {
        this.aM = bl;
    }

    public void m(boolean bl) {
        this.aE = bl;
    }

    public Instant getStarted() {
        return this.az;
    }

    public boolean Z() {
        return this.af;
    }

    public World ai() {
        return this.aB;
    }

    /*
     * WARNING - void declaration
     */
    public void h() {
        void var1_1;
        void var2_2;
        SquireNightmarePlugin var9;
        if (SquireNightmarePlugin.lIIIllIlIlllIII(this.aZ, lllIllIllIll[8])) {
            a.info(lllIllIllIIl[lllIllIllIll[21]], (Object)this.aZ);
            return;
        }
        Duration lllllllllllllllIIllIIllIllIIllII = Duration.between(var9.bd, Instant.now());
        Queue<Duration> var37 = var9.bf.get(var9.aZ);
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var37.size(), lllIllIllIll[13])) {
            var37.poll();
            0;
        }
        var2_2.add(var1_1);
        0;
        double d2 = var2_2.stream().mapToLong(Duration::toSeconds).average().orElse(0.0);
        Object[] objectArray = new Object[lllIllIllIll[5]];
        objectArray[SquireNightmarePlugin.lllIllIllIll[1]] = this.aZ;
        objectArray[SquireNightmarePlugin.lllIllIllIll[0]] = var1_1.toSeconds();
        objectArray[SquireNightmarePlugin.lllIllIllIll[4]] = d2;
        a.info(lllIllIllIIl[lllIllIllIll[22]], objectArray);
    }

    private static String lIIIllIlIlIIllI(String var23, String var28) {
        try {
            SecretKeySpec var44 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var28.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var25 = Cipher.getInstance("Blowfish");
            var25.init(lllIllIllIll[4], var44);
            return new String(var25.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public z H() {
        return this.aP;
    }

    public void c(List<WorldPoint> list) {
        this.ai = list;
    }

    @Subscribe
    private void a(GameStateChanged gameStateChanged) {
        GameState gameState = gameStateChanged.getGameState();
        if (SquireNightmarePlugin.lIIIllIlIllIllI(gameState, GameState.LOGGING_IN)) {
            Log.info((String)lllIllIllIIl[lllIllIllIll[34]]);
            this.g(lllIllIllIll[1]);
        }
    }

    public WorldPoint an() {
        return this.aH;
    }

    public int t() {
        return this.ae;
    }

    private static String lIIIllIlIlIlIII(String var22, String var3) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var46 = new StringBuilder();
        char[] var41 = var3.toCharArray();
        int var5 = lllIllIllIll[1];
        char[] var32 = var22.toCharArray();
        int var36 = var32.length;
        int var10 = lllIllIllIll[1];
        while (SquireNightmarePlugin.lIIIllIlIlllIIl(var10, var36)) {
            char var18 = var32[var10];
            var46.append((char)(var18 ^ var41[var5 % var41.length]));
            0;
            ++var5;
            ++var10;
            0;
            if (((42 + 127 - -37 + 33 ^ 12 + 24 - 21 + 183) & (98 + 46 - 0 + 17 ^ 121 + 64 - 129 + 80 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var46);
    }

    private static void lIIIllIlIlIllII() {
        lllIllIllIIl = new String[lllIllIllIll[102]];
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[1]] = SquireNightmarePlugin."Eat";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[0]] = SquireNightmarePlugin."Pick-up";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[4]] = SquireNightmarePlugin."Pick-up";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[5]] = SquireNightmarePlugin."We are in combat but not in pnm, going to bank";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[7]] = SquireNightmarePlugin."Nightmare started";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[8]] = SquireNightmarePlugin."Welcome message received, we do not have to keep logging.";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[9]] = SquireNightmarePlugin."You will be logged out";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[10]] = SquireNightmarePlugin."On next occassion, we have to log out to reset the 6h timer.";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[11]] = SquireNightmarePlugin."has awoken";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[12]] = SquireNightmarePlugin."has reawoken";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[13]] = SquireNightmarePlugin."Nightmare has awoken, starting recording";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[14]] = SquireNightmarePlugin."item retrieval service";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[15]] = SquireNightmarePlugin."retrieved some of your items";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[16]] = SquireNightmarePlugin."Collecting items due to chat message trigger! {}";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[17]] = SquireNightmarePlugin."shuffling";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[18]] = SquireNightmarePlugin."feel the effects";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[19]] = SquireNightmarePlugin."spores have infected you";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[20]] = SquireNightmarePlugin."The Nightmare's infection has worn off";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[21]] = SquireNightmarePlugin."Phase {} is not valid";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[22]] = SquireNightmarePlugin."Phase {} took {} seconds, overall average time: {}";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[23]] = SquireNightmarePlugin."Fight start time was null, we were not able to record the kill time.";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[24]] = SquireNightmarePlugin."Kill took {}, overall average time: {}";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[25]] = SquireNightmarePlugin."you are dead!";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[26]] = SquireNightmarePlugin."[SquirePNM]: We have died on phase {}, ";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[27]] = SquireNightmarePlugin."[ForceTeleport]: Teleporting directly to POH";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[28]] = SquireNightmarePlugin."[ForceTeleport]: No teleport found in inventory, cannot emergency teleport out!";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[29]] = SquireNightmarePlugin."Ver Sinhaza";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[30]] = SquireNightmarePlugin."Empty";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[31]] = SquireNightmarePlugin."Overhealing with Anglerfish before the fight begins as your inventory is full.";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[32]] = SquireNightmarePlugin."Eat";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[33]] = SquireNightmarePlugin."Husk";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[34]] = SquireNightmarePlugin."Logging in, reset 6h log flag.";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[35]] = SquireNightmarePlugin."anglerfish";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[36]] = SquireNightmarePlugin."anglerfish";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[37]] = SquireNightmarePlugin."pool";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[38]] = SquireNightmarePlugin."Drink";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[39]] = SquireNightmarePlugin."Pool of Nightmares";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[40]] = SquireNightmarePlugin."Eat";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[41]] = SquireNightmarePlugin."Eat";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[42]] = SquireNightmarePlugin."nightmare";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[43]] = SquireNightmarePlugin."combat potion";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[44]] = SquireNightmarePlugin."super strength";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[45]] = SquireNightmarePlugin."Eat";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[6]] = SquireNightmarePlugin."sanfew";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[56]] = SquireNightmarePlugin."balm";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[78]] = SquireNightmarePlugin."3.4.2";
    }

    public boolean au() {
        return this.aO;
    }

    public void b(WorldArea worldArea) {
        this.aD = worldArea;
    }

    public void b(List<Queue<Duration>> list) {
        this.bf = list;
    }

    public void f() {
        this.j();
        this.av += lllIllIllIll[0];
        this.i();
    }

    public void b(int n2) {
        this.ae = n2;
    }

    public void d(boolean bl) {
        this.ap = bl;
    }

    public boolean av() {
        return this.aU;
    }

    public boolean G() {
        return this.aC;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        SquireNightmarePlugin var42;
        int[] nArray = new int[lllIllIllIll[0]];
        nArray[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIll[2];
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllIllIllIll[0]];
            nArray2[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIll[3];
            if (SquireNightmarePlugin.lIIIllIlIlIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lllIllIllIll[0]];
                nArray3[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIll[2];
                Item item2 = Inventory.getFirst((int[])nArray3);
                int[] nArray4 = new int[lllIllIllIll[0]];
                nArray4[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIll[3];
                Item item3 = Inventory.getFirst((int[])nArray4);
                item2.useOn(item3);
                return;
            }
        }
        if (SquireNightmarePlugin.lIIIllIlIlIllll(Static.getClient().getFollower())) {
            NPC var38 = Static.getClient().getFollower();
            if (SquireNightmarePlugin.lIIIllIlIlIlllI(Inventory.isFull() ? 1 : 0) && SquireNightmarePlugin.lIIIllIlIlIllll(Inventory.getFirst(item -> {
                String[] stringArray = new String[lllIllIllIll[0]];
                stringArray[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIIl[lllIllIllIll[41]];
                return item.hasAction(stringArray);
            }))) {
                Inventory.getFirst(item -> {
                    String[] stringArray = new String[lllIllIllIll[0]];
                    stringArray[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIIl[lllIllIllIll[40]];
                    return item.hasAction(stringArray);
                }).interact(lllIllIllIIl[lllIllIllIll[1]]);
                return;
            }
            String[] stringArray = new String[lllIllIllIll[0]];
            stringArray[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIIl[lllIllIllIll[0]];
            if (SquireNightmarePlugin.lIIIllIlIlIlllI(var38.hasAction(stringArray) ? 1 : 0)) {
                var38.interact(lllIllIllIIl[lllIllIllIll[4]]);
            }
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            if (SquireNightmarePlugin.lIIIllIlIlIlllI(var42.O() ? 1 : 0)) {
                Log.warn((String)lllIllIllIIl[lllIllIllIll[5]]);
                var42.b(lllIllIllIll[0]);
                var42.h(lllIllIllIll[1]);
            }
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIIl(var42.aJ)) {
            var42.aE = lllIllIllIll[0];
            var42.aJ -= lllIllIllIll[0];
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIII(var42.aJ)) {
            var42.aE = lllIllIllIll[1];
            var42.Y.clear();
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIIl(var42.aQ)) {
            var42.aQ -= lllIllIllIll[0];
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIIl(var42.aN)) {
            var42.aN -= lllIllIllIll[0];
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIII(var42.aN)) {
            var42.aM = lllIllIllIll[1];
            var42.aj = null;
            var42.aD = null;
        }
        var42.ba -= lllIllIllIll[0];
        if (SquireNightmarePlugin.lIIIllIlIlIllll(var42.bb) && SquireNightmarePlugin.lIIIllIlIllIIII(var42.ba)) {
            var42.bb = null;
        }
    }

    protected void onStart() {
        this.j();
        this.ba = lllIllIllIll[1];
        this.bb = null;
        this.aU = lllIllIllIll[1];
        this.aI = lllIllIllIll[1];
        this.an = null;
        this.al = 0L;
        this.am = null;
        this.av = lllIllIllIll[1];
        this.ac = lllIllIllIll[1];
        this.aR = lllIllIllIll[1];
        this.aS = lllIllIllIll[1];
        this.n(lllIllIllIll[1]);
        this.aK = lllIllIllIll[1];
        this.aM = lllIllIllIll[1];
        this.Y.clear();
        this.aJ = lllIllIllIll[1];
        this.ad = lllIllIllIll[1];
        this.ai = new ArrayList<WorldPoint>();
        a.debug(lllIllIllIIl[lllIllIllIll[7]]);
        this.j(lllIllIllIll[46]);
        this.ax.add((Overlay)this.ay);
        0;
        this.ar = lllIllIllIll[1];
        this.az = Instant.now();
        this.aq = new HashSet();
        this.ag = new b(this);
        this.aN = lllIllIllIll[1];
        this.aE = lllIllIllIll[1];
        this.aM = lllIllIllIll[1];
        this.ax.add((Overlay)this.aP);
        0;
        this.ad = lllIllIllIll[1];
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllIllIllIIl[lllIllIllIll[39]]));
        if (SquireNightmarePlugin.lIIIllIlIllIIll(tileObject2)) {
            this.ad = lllIllIllIll[0];
        }
        this.aX = lllIllIllIll[1];
    }

    public int at() {
        return this.aN;
    }

    public int ap() {
        return this.aJ;
    }

    private static boolean lIIIllIlIllIIIl(int n2) {
        return n2 > 0;
    }

    public List<WorldPoint> Y() {
        return this.Y;
    }

    /*
     * WARNING - void declaration
     */
    private void i() {
        void var1_1;
        SquireNightmarePlugin var12;
        if (SquireNightmarePlugin.lIIIllIlIllIIll(this.be)) {
            a.info(lllIllIllIIl[lllIllIllIll[23]]);
            return;
        }
        Duration lllllllllllllllIIllIIllIllIIIlIl = Duration.between(var12.be, Instant.now());
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var12.bg.size(), lllIllIllIll[13])) {
            var12.bg.poll();
            0;
        }
        this.bg.add((Duration)var1_1);
        0;
        double d2 = this.bg.stream().mapToLong(Duration::toSeconds).average().orElse(0.0);
        a.info(lllIllIllIIl[lllIllIllIll[24]], (Object)var1_1.toSeconds(), (Object)d2);
        this.be = null;
        this.bd = null;
    }

    public HashSet<Integer> B() {
        return this.aq;
    }

    public boolean l() {
        boolean bl;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (SquireNightmarePlugin.lIIIllIlIlIlllI(tileObject.getName().toLowerCase().contains(lllIllIllIIl[lllIllIllIll[37]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIllIllIll[0]];
                stringArray[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIIl[lllIllIllIll[38]];
                if (SquireNightmarePlugin.lIIIllIlIlIlllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIllIllIll[0];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x90 ^ 0xAB ^ (0x81 ^ 0xAB)) & (0xC ^ 1 ^ (0xB5 ^ 0xA9) ^ -1)) != 0;
                }
            }
            n2 = lllIllIllIll[1];
            return n2 != 0;
        });
        if (SquireNightmarePlugin.lIIIllIlIlIllll(tileObject2)) {
            bl = lllIllIllIll[0];
            0;
            if (-(0x7A ^ 0x7E) > 0) {
                return false;
            }
        } else {
            bl = lllIllIllIll[1];
        }
        return bl;
    }

    public void a(boolean bl) {
        this.ac = bl;
    }

    public void a(BankLoadout bankLoadout) {
        this.an = bankLoadout;
    }

    public void e(boolean bl) {
        this.at = bl;
    }

    public void a(SquireNightmareConfig squireNightmareConfig) {
        this.aw = squireNightmareConfig;
    }

    public List<WorldPoint> ab() {
        return this.ai;
    }

    public Integer M() {
        return this.aV;
    }

    public void a(long l2) {
        this.al = l2;
    }

    public boolean A() {
        return this.ap;
    }

    public void b(boolean bl) {
        this.ad = bl;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(ChatMessage chatMessage) {
        void var16;
        if (SquireNightmarePlugin.lIIIllIlIllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var15 = var16.getMessage();
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var15.contains(lllIllIllIIl[lllIllIllIll[25]]) ? 1 : 0)) {
            SquireNightmarePlugin var14;
            Object[] objectArray = new Object[lllIllIllIll[0]];
            objectArray[SquireNightmarePlugin.lllIllIllIll[1]] = var14.aZ;
            Log.info((String)lllIllIllIIl[lllIllIllIll[26]], (Object[])objectArray);
            var14.g();
        }
    }

    public boolean n() {
        boolean bl;
        SquireNightmarePlugin var43;
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(this.aw.rechargeStaffAt(), lllIllIllIll[46])) {
            return lllIllIllIll[1];
        }
        if (!SquireNightmarePlugin.lIIIllIlIllIlII(s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.N_Unknown.ch(), lllIllIllIll[46]) || SquireNightmarePlugin.lIIIllIlIlllIIl(s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.N_Unknown.ch(), var43.aw.rechargeStaffAt())) {
            bl = lllIllIllIll[0];
            0;
            if (3 <= ((0x9E ^ 0x96) & ~(0x8B ^ 0x83))) {
                return false;
            }
        } else {
            bl = lllIllIllIll[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var29;
        if (SquireNightmarePlugin.lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIll(SquireNightmarePlugin.d())) {
            return;
        }
        Projectile var31 = var29.getProjectile();
        int var45 = lllIllIllIll[54];
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var31.getId(), var45)) {
            lllllllllllllllIIllIIllIlIlIIIll.bc = lllIllIllIll[0];
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
        }
    }

    public void g(int n2) {
        this.aS = n2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ChatMessage chatMessage) {
        SquireNightmarePlugin var40;
        String var24;
        void var8;
        if (SquireNightmarePlugin.lIIIllIlIllIllI(chatMessage.getType(), ChatMessageType.WELCOME)) {
            Log.info((String)lllIllIllIIl[lllIllIllIll[8]]);
            this.g(lllIllIllIll[1]);
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlll(var8.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var8.getMessage().contains(lllIllIllIIl[lllIllIllIll[9]]) ? 1 : 0)) {
            Log.info((String)lllIllIllIIl[lllIllIllIll[10]]);
            var40.aC = lllIllIllIll[0];
        }
        if (!SquireNightmarePlugin.lIIIllIlIllIIII((var24 = var8.getMessage()).contains(lllIllIllIIl[lllIllIllIll[11]]) ? 1 : 0) || SquireNightmarePlugin.lIIIllIlIlIlllI(var24.contains(lllIllIllIIl[lllIllIllIll[12]]) ? 1 : 0)) {
            a.info(lllIllIllIIl[lllIllIllIll[13]]);
            var40.be = var40.bd = Instant.now();
        }
        if (!SquireNightmarePlugin.lIIIllIlIllIIII(var24.contains(lllIllIllIIl[lllIllIllIll[14]]) ? 1 : 0) || SquireNightmarePlugin.lIIIllIlIlIlllI(var24.contains(lllIllIllIIl[lllIllIllIll[15]]) ? 1 : 0)) {
            var40.ar = lllIllIllIll[0];
            var40.b(lllIllIllIll[1]);
            Object[] objectArray = new Object[lllIllIllIll[0]];
            objectArray[SquireNightmarePlugin.lllIllIllIll[1]] = var24;
            Log.info((String)lllIllIllIIl[lllIllIllIll[16]], (Object[])objectArray);
        }
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var24.contains(lllIllIllIIl[lllIllIllIll[17]]) ? 1 : 0)) {
            var40.n(lllIllIllIll[0]);
        }
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var24.contains(lllIllIllIIl[lllIllIllIll[18]]) ? 1 : 0)) {
            var40.n(lllIllIllIll[1]);
        }
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var24.contains(lllIllIllIIl[lllIllIllIll[19]]) ? 1 : 0)) {
            var40.o(lllIllIllIll[0]);
            var40.aR += lllIllIllIll[0];
        }
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var24.contains(lllIllIllIIl[lllIllIllIll[20]]) ? 1 : 0)) {
            var40.o(lllIllIllIll[1]);
        }
    }

    public SquireNightmareConfig ag() {
        return this.aw;
    }

    public void k(boolean bl) {
        this.ar = bl;
    }

    public void c(int n2) {
        this.av = n2;
    }

    public long w() {
        return this.al;
    }

    public boolean ao() {
        return this.aI;
    }

    public BankLoadout y() {
        return this.an;
    }

    private void j() {
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(this.aw.useFireSpells() ? 1 : 0)) {
            this.t(lllIllIllIll[0]);
        }
        this.ap = lllIllIllIll[1];
        this.n(lllIllIllIll[1]);
        this.aK = lllIllIllIll[1];
        this.bd = null;
        this.be = null;
        this.aI = lllIllIllIll[1];
        this.bc = lllIllIllIll[1];
        this.aM = lllIllIllIll[1];
        this.Y.clear();
        this.aJ = lllIllIllIll[1];
        this.aW = lllIllIllIll[1];
        this.aV = lllIllIllIll[1];
        this.aq = new HashSet();
        this.ag = new d(this);
        this.j(lllIllIllIll[46]);
        this.aX = lllIllIllIll[1];
        this.ba = lllIllIllIll[1];
        this.bb = null;
        this.aZ = lllIllIllIll[0];
    }

    public int af() {
        return this.av;
    }

    public void h(boolean bl) {
        this.aX = bl;
    }

    public void a(Instant instant) {
        this.az = instant;
    }

    public WorldArea aj() {
        return this.aD;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllIllIllIll[6]];
        classArray[SquireNightmarePlugin.lllIllIllIll[1]] = PrayFlickingTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[0]] = AvoidingGraspingClawsTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[4]] = AvoidingSporesTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[5]] = SteppingIntoFlowerAreaTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[7]] = AvoidingNightmaresChargeTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[8]] = AttackingHuskTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[9]] = AttackingSleepwalkerTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[10]] = SnipingSleepwalkerTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[11]] = AttackingTotemTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[12]] = AttackingNightmareTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[13]] = AttackingParasiteTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[14]] = SpecialAttackTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[15]] = SummonThrallTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[16]] = CleansingParasiteTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[17]] = DrinkingBoostTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[18]] = UsingImbuedHeartTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[19]] = EatingTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[20]] = RestoringPrayerTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[21]] = EnteringPnmTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[22]] = WalkingToNightmareTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[23]] = DisturbNightmareTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[24]] = W.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[25]] = X.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[26]] = G.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[27]] = O.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[28]] = K.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[29]] = M.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[30]] = E.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[31]] = J.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[32]] = P.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[33]] = H.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[34]] = I.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[35]] = Q.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[36]] = T.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[37]] = V.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[38]] = U.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[39]] = R.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[40]] = LootingTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[41]] = DroppingEmptyVialYouShouldCrushLikeachampTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[42]] = Z.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[43]] = HoppingBeforeEntryTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[44]] = B.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[45]] = LoggingOutBefore6hTimerTask.class;
        return classArray;
    }

    public void a(Prayer prayer) {
        this.bb = prayer;
    }

    public void a(NightmareInfoBox nightmareInfoBox) {
        this.ay = nightmareInfoBox;
    }

    public void f(int n2) {
        this.aR = n2;
    }

    public boolean as() {
        return this.aM;
    }

    /*
     * WARNING - void declaration
     */
    public boolean m() {
        void var2_2;
        int n2;
        SquireNightmarePlugin var17;
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(this.aw.neverTeleport() ? 1 : 0)) {
            return lllIllIllIll[1];
        }
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var17.aw.restoreInPOH() ? 1 : 0) && SquireNightmarePlugin.lIIIllIlIllIIII(var17.l() ? 1 : 0) && SquireNightmarePlugin.lIIIllIlIlIlllI(TeleportLoader.canEnterHouse() ? 1 : 0)) {
            a.info(lllIllIllIIl[lllIllIllIll[27]]);
            TeleportLoader.enterHouse();
            0;
            return lllIllIllIll[0];
        }
        if (SquireNightmarePlugin.lIIIllIlIllIllI((Object)var17.aw.bankLocation(), (Object)s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.WEnum.VER_SINHAZA)) {
            int[] nArray = new int[lllIllIllIll[0]];
            nArray[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIll[3];
            if (SquireNightmarePlugin.lIIIllIlIlIllll(Inventory.getFirst((int[])nArray))) {
                n2 = lllIllIllIll[3];
                0;
                
                }
            } else {
                n2 = lllIllIllIll[48];
                0;
                if (-1 != -1) {
                    return false;
                }
            }
        } else {
            n2 = lllIllIllIll[48];
        }
        int var11 = n2;
        int[] nArray = new int[lllIllIllIll[0]];
        nArray[SquireNightmarePlugin.lllIllIllIll[1]] = var11;
        Item var6 = Inventory.getFirst((int[])nArray);
        if (SquireNightmarePlugin.lIIIllIlIllIIll(var6)) {
            int[] nArray2 = new int[lllIllIllIll[0]];
            nArray2[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIll[3];
            var6 = Inventory.getFirst((int[])nArray2);
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIll(var6)) {
            Log.error((String)lllIllIllIIl[lllIllIllIll[28]]);
            return lllIllIllIll[1];
        }
        this.k();
        String[] stringArray = new String[lllIllIllIll[4]];
        stringArray[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIIl[lllIllIllIll[29]];
        stringArray[SquireNightmarePlugin.lllIllIllIll[0]] = lllIllIllIIl[lllIllIllIll[30]];
        var2_2.interact(stringArray);
        this.b(lllIllIllIll[0]);
        this.p(lllIllIllIll[1]);
        this.ap = lllIllIllIll[0];
        return lllIllIllIll[0];
    }

    public void f(boolean bl) {
        this.au = bl;
    }

    public void a(List<WorldPoint> list) {
        this.ab = list;
    }

    public Future<BankLoadout> v() {
        return this.ak;
    }

    private static boolean lIIIllIlIllIlII(int n2, int n3) {
        return n2 != n3;
    }

    public Future<BankLoadout> x() {
        return this.am;
    }

    public void h(int n2) {
        this.aZ = n2;
    }

    public void j(int n2) {
        this.aA = n2;
    }

    public boolean al() {
        return this.aF;
    }

    public Prayer S() {
        return this.bb;
    }

    public void a(Map<Integer, Integer> map) {
        this.ag = map;
    }

    public void c(boolean bl) {
        this.ao = bl;
    }

    public RunePouchSetup o() {
        return this.Z;
    }

    public boolean ak() {
        return this.aE;
    }

    private static boolean lIIIllIlIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public void l(boolean bl) {
        this.as = bl;
    }

    public void a(WorldPoint worldPoint) {
        this.aH = worldPoint;
    }

    public boolean ae() {
        return this.as;
    }

    public void b(Integer n2) {
        this.aW = n2;
    }

    public void d(int n2) {
        this.aJ = n2;
    }

    public void a(ItemManager itemManager) {
        this.aT = itemManager;
    }

    public Instant V() {
        return this.be;
    }

    private static boolean lIIIllIlIllIIII(int n2) {
        return n2 == 0;
    }

    public void s(boolean bl) {
        this.aO = bl;
    }

    public void q(boolean bl) {
        this.aK = bl;
    }

    public void e(int n2) {
        this.aQ = n2;
    }

    public void b(Future<BankLoadout> future) {
        this.am = future;
    }

    public Queue<Duration> X() {
        return this.bg;
    }

    public boolean aq() {
        return this.aK;
    }

    public boolean z() {
        return this.ao;
    }

    public int ah() {
        return this.aA;
    }

    public Integer N() {
        return this.aW;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        SquireNightmarePlugin var39;
        void var13;
        if (SquireNightmarePlugin.lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlII(Players.getLocal().getWorldLocation().getPlane(), lllIllIllIll[5])) {
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIll(SquireNightmarePlugin.d())) {
            return;
        }
        Actor var30 = var13.getActor();
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var30 instanceof Player)) {
            return;
        }
        NPC var7 = (NPC)var30;
        int var19 = var7.getAnimation();
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var19, lllIllIllIll[49]) && SquireNightmarePlugin.lIIIllIlIllIIII(var39.aX ? 1 : 0)) {
            if (SquireNightmarePlugin.lIIIllIlIlIlllI(Inventory.isFull() ? 1 : 0) && SquireNightmarePlugin.lIIIllIlIllIIII(var39.aX ? 1 : 0) && SquireNightmarePlugin.lIIIllIlIlIlllI(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIllIllIIl[lllIllIllIll[36]])) ? 1 : 0)) {
                Log.info((String)lllIllIllIIl[lllIllIllIll[31]]);
                Inventory.getFirst(item -> item.getName().toLowerCase().contains(lllIllIllIIl[lllIllIllIll[35]])).interact(lllIllIllIIl[lllIllIllIll[32]]);
            }
            var39.aX = lllIllIllIll[0];
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var19, lllIllIllIll[50])) {
            var39.ba = lllIllIllIll[10];
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var19, lllIllIllIll[51])) {
            var39.ba = lllIllIllIll[10];
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var19, lllIllIllIll[52])) {
            var39.ba = lllIllIllIll[10];
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var19, lllIllIllIll[53])) {
            var39.aX = lllIllIllIll[1];
            var39.f();
        }
    }

    public int Q() {
        return this.aZ;
    }

    public NightmareInfoBox F() {
        return this.ay;
    }

    public void n(boolean bl) {
        this.aF = bl;
    }

    public static WorldPoint e() {
        WorldPoint worldPoint2 = t.toWorld();
        Collection collection = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)worldPoint2);
        return collection.stream().min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
    }
}

