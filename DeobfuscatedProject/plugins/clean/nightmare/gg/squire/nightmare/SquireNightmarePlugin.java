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
import gg.squire.nightmare.PreventingLogoutTask;
import gg.squire.nightmare.UsingBankLoadoutTask;
import gg.squire.nightmare.EmergencyTeleportOutTask;
import gg.squire.nightmare.WalkingToBankTask;
import gg.squire.nightmare.OpeningBankTask;
import gg.squire.nightmare.RestoringInPohTask;
import gg.squire.nightmare.RechargingSangTask;
import gg.squire.nightmare.RechargingShadowRichTask;
import gg.squire.nightmare.NightmareTaskBase;
import gg.squire.nightmare.RechargingTridentTask;
import gg.squire.nightmare.ChargeTrackerTask;
import gg.squire.nightmare.BuyingNewSuppliesRestockingTask;
import gg.squire.nightmare.GrabTeleportToGeTask;
import gg.squire.nightmare.SellingDropsRestockingTask;
import gg.squire.nightmare.WalkToGrandExchangeTask;
import gg.squire.nightmare.WithdrawingLootRestockingTask;
import gg.squire.nightmare.CollectingItemsTask;
import gg.squire.nightmare.RetrievingTeleportForDeathWalkingTask;
import gg.squire.nightmare.SettingFireSpellTask;
import gg.squire.nightmare.NightmareManager;
import gg.squire.nightmare.EnteringPnmTask;
import gg.squire.nightmare.HoppingBeforeEntryTask;
import gg.squire.nightmare.LoggingOutBefore6hTimerTask;
import gg.squire.nightmare.WalkingToNightmareTask;
import gg.squire.nightmare.SummonThrallTask;
import gg.squire.nightmare.DisturbNightmareTask;
import gg.squire.nightmare.DroppingEmptyVialYouShouldCrushLikeachampTask;
import gg.squire.nightmare.PrayFlickingTask;
import gg.squire.nightmare.AttackingHuskTask;
import gg.squire.nightmare.AttackingNightmareTask;
import gg.squire.nightmare.AttackingParasiteTask;
import gg.squire.nightmare.AttackingSleepwalkerTask;
import gg.squire.nightmare.SnipingSleepwalkerTask;
import gg.squire.nightmare.AttackingTotemTask;
import gg.squire.nightmare.SpecialAttackTask;
import gg.squire.nightmare.CleansingParasiteTask;
import gg.squire.nightmare.DrinkingBoostTask;
import gg.squire.nightmare.EatingTask;
import gg.squire.nightmare.RestoringPrayerTask;
import gg.squire.nightmare.UsingImbuedHeartTask;
import gg.squire.nightmare.AvoidingNightmaresChargeTask;
import gg.squire.nightmare.SteppingIntoFlowerAreaTask;
import gg.squire.nightmare.AvoidingGraspingClawsTask;
import gg.squire.nightmare.AvoidingSporesTask;
import gg.squire.nightmare.LootingTask;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.b;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.c;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.d;
import gg.squire.nightmare.NightmareManager;
import gg.squire.nightmare.GameEnum32;
import gg.squire.nightmare.NightmareManager;

@SquireUtil
@PluginDescriptor(name="Squire Phosani Nightmare", enabledByDefault=false)
public class SquireNightmarePlugin
extends SquirePlugin {
    private static final  int z;
    private  Integer aW;
    private  boolean aF;
    public static final  List<Integer> D;
    private static final  int E;
    
    private  Instant az;
    private  int aS;
    public static final  String b;
    public static final  int n;
    private static final  int T;
    private  boolean aK;
    public  int aa;
    private final  List<WorldPoint> Y;
    public  List<WorldPoint> ab;
    private static final  int H;
    public static final  List<Integer> o;
    private  int aN;
    private  boolean aO;
    public  boolean af;
    private static final  int N;
    private static final  int Q;
    private static final  int U;
    public  RunePouchSetup Z;
    private static final  int L;
    public static final  List<Integer> r;
    @Inject
    private  OverlayManager ax;
    public  Map<Integer, Integer> ag;
    private  boolean at;
    private  Integer aV;
    public static final  int k;
    public static final  int u;
    private  int aR;
    private static final  int K;
    public  List<WorldPoint> ai;
    public  boolean ac;
    public static final  int h;
    private  boolean aI;
    public static final  int j;
    public static  List<Integer> W;
    public static  List<Integer> X;
    private static final  int S;
    private  boolean aC;
    public static final  int l;
    private  boolean au;
    public  Future<BankLoadout> ak;
    @Inject
    private  NightmareInfoBox ay;
    private  int av;
    private static final  int B;
    public static final  List<Integer> q;
    @Inject
    private  SquireNightmareConfig aw;
    public static final  int f;
    private  int aZ;
    private  Queue<Duration> bg;
    private static final  int P;
    private  Prayer bb;
    private  World aB;
    private  boolean aE;
    private  HashSet<Integer> aq;
    public  int ae;
    private static final  int F;
    private  boolean aU;
    private static final  int I;
    public static final  Map<Integer, String> p;
    private  boolean aG;
    private  NPC aY;
    private  boolean ar;
    
    private static final  int G;
    private  boolean aX;
    private  List<Queue<Duration>> bf;
    public static final  int w;
    private  WorldPoint aL;
    public static final  RegionPoint t;
    private static final  int R;
    private static final  int A;
    private static final  int J;
    private  int aJ;
    public  boolean ap;
    private  boolean aM;
    public static final  int m;
    public static final  int v;
    public  boolean ad;
    public  long al;
    private  boolean bc;
    private static final  int O;
    private  int ba;
    public  WorldArea aj;
    private static final  Logger a;
    private static final  int y;
    public  BankLoadout an;
    private  WorldArea aD;
    private  int aQ;
    @Inject
    private  ItemManager aT;
    private static final  int C;
    public static  List<Integer> V;
    public static final  int x;
    private  boolean as;
    private  Instant bd;
    public static final  int d;
    public  boolean ao;
    public static final  int i;
    private static final  int M;
    public static final  int e;
    @Inject
    public  h ah;
    public  Future<BankLoadout> am;
    @Inject
    private  z aP;
    public static final  List<Integer> s;
    private  int aA;
    public static final  int c;
    public static final  int g;
    private  WorldPoint aH;
    private  Instant be;

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
        p = new NightmareManager();
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

        this.aN = lllIllIllIll[1];
        this.aM = lllIllIllIll[1];
        this.aE = lllIllIllIll[1];
        this.ar = lllIllIllIll[1];
        this.aI = lllIllIllIll[1];
        this.j(lllIllIllIll[46]);
        this.ax.remove((Overlay)this.aP);

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
        void var1;
        if (SquireNightmarePlugin.lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlII(Players.getLocal().getWorldLocation().getPlane(), lllIllIllIll[5])) {
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var1.getGraphicsObject().getId(), lllIllIllIll[47])) {
            SquireNightmarePlugin var2;
            WorldPoint var3 = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var1.getGraphicsObject().getLocation());
            var2.Y.add(var3);

            var2.aE = lllIllIllIll[0];
            var2.aJ = lllIllIllIll[8];
            var2.aQ = var2.aJ + lllIllIllIll[0];
        }
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
        NPC var5 = var4.getNpc();
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var5.getName().equalsIgnoreCase(lllIllIllIIl[lllIllIllIll[33]]) ? 1 : 0)) {
            var6.bc = lllIllIllIll[1];
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
        SquireNightmarePlugin var7;
        if (SquireNightmarePlugin.lIIIllIlIlllIII(this.aZ, lllIllIllIll[8])) {
            a.info(lllIllIllIIl[lllIllIllIll[21]], (Object)this.aZ);
            return;
        }
        Duration var8 = Duration.between(var7.bd, Instant.now());
        Queue<Duration> var9 = var7.bf.get(var7.aZ);
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var9.size(), lllIllIllIll[13])) {
            var9.poll();

        }
        var2_2.add(var1_1);

        double d2 = var2_2.stream().mapToLong(Duration::toSeconds).average().orElse(0.0);
        Object[] objectArray = new Object[lllIllIllIll[5]];
        objectArray[SquireNightmarePlugin.lllIllIllIll[1]] = this.aZ;
        objectArray[SquireNightmarePlugin.lllIllIllIll[0]] = var1_1.toSeconds();
        objectArray[SquireNightmarePlugin.lllIllIllIll[4]] = d2;
        a.info(lllIllIllIIl[lllIllIllIll[22]], objectArray);
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

        return String.valueOf(var10);
    }

    private static void lIIIllIlIlIllII() {
        lllIllIllIIl = new String[lllIllIllIll[102]];
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[1]] = "Eat";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[0]] = "Pick-up";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[4]] = "Pick-up";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[5]] = "We are in combat but not in pnm, going to bank";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[7]] = "Nightmare started";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[8]] = "Welcome message received, we do not have to keep logging.";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[9]] = "You will be logged out";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[10]] = "On next occassion, we have to log out to reset the 6h timer.";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[11]] = "has awoken";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[12]] = "has reawoken";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[13]] = "Nightmare has awoken, starting recording";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[14]] = "item retrieval service";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[15]] = "retrieved some of your items";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[16]] = "Collecting items due to chat message trigger! {}";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[17]] = "shuffling";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[18]] = "feel the effects";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[19]] = "spores have infected you";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[20]] = "The Nightmare's infection has worn off";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[21]] = "Phase {} is not valid";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[22]] = "Phase {} took {} seconds, overall average time: {}";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[23]] = "Fight start time was null, we were not able to record the kill time.";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[24]] = "Kill took {}, overall average time: {}";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[25]] = "you are dead!";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[26]] = "[SquirePNM]: We have died on phase {}, ";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[27]] = "[ForceTeleport]: Teleporting directly to POH";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[28]] = "[ForceTeleport]: No teleport found in inventory, cannot emergency teleport out!";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[29]] = "Ver Sinhaza";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[30]] = "Empty";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[31]] = "Overhealing with Anglerfish before the fight begins as your inventory is full.";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[32]] = "Eat";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[33]] = "Husk";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[34]] = "Logging in, reset 6h log flag.";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[35]] = "anglerfish";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[36]] = "anglerfish";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[37]] = "pool";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[38]] = "Drink";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[39]] = "Pool of Nightmares";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[40]] = "Eat";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[41]] = "Eat";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[42]] = "nightmare";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[43]] = "combat potion";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[44]] = "super strength";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[45]] = "Eat";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[6]] = "sanfew";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[56]] = "balm";
        SquireNightmarePlugin.lllIllIllIIl[SquireNightmarePlugin.lllIllIllIll[78]] = "3.4.2";
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
        SquireNightmarePlugin var11;
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
            NPC var12 = Static.getClient().getFollower();
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
            if (SquireNightmarePlugin.lIIIllIlIlIlllI(var12.hasAction(stringArray) ? 1 : 0)) {
                var12.interact(lllIllIllIIl[lllIllIllIll[4]]);
            }
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            if (SquireNightmarePlugin.lIIIllIlIlIlllI(var11.O() ? 1 : 0)) {
                Log.warn((String)lllIllIllIIl[lllIllIllIll[5]]);
                var11.b(lllIllIllIll[0]);
                var11.h(lllIllIllIll[1]);
            }
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIIl(var11.aJ)) {
            var11.aE = lllIllIllIll[0];
            var11.aJ -= lllIllIllIll[0];
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIII(var11.aJ)) {
            var11.aE = lllIllIllIll[1];
            var11.Y.clear();
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIIl(var11.aQ)) {
            var11.aQ -= lllIllIllIll[0];
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIIl(var11.aN)) {
            var11.aN -= lllIllIllIll[0];
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIII(var11.aN)) {
            var11.aM = lllIllIllIll[1];
            var11.aj = null;
            var11.aD = null;
        }
        var11.ba -= lllIllIllIll[0];
        if (SquireNightmarePlugin.lIIIllIlIlIllll(var11.bb) && SquireNightmarePlugin.lIIIllIlIllIIII(var11.ba)) {
            var11.bb = null;
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

        this.ar = lllIllIllIll[1];
        this.az = Instant.now();
        this.aq = new HashSet();
        this.ag = new b(this);
        this.aN = lllIllIllIll[1];
        this.aE = lllIllIllIll[1];
        this.aM = lllIllIllIll[1];
        this.ax.add((Overlay)this.aP);

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
        SquireNightmarePlugin var13;
        if (SquireNightmarePlugin.lIIIllIlIllIIll(this.be)) {
            a.info(lllIllIllIIl[lllIllIllIll[23]]);
            return;
        }
        Duration var14 = Duration.between(var13.be, Instant.now());
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var13.bg.size(), lllIllIllIll[13])) {
            var13.bg.poll();

        }
        this.bg.add((Duration)var1_1);

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

                    if (null == null) return n2 != 0;
                    return ((0x90 ^ 0xAB ^ (0x81 ^ 0xAB)) & (0xC ^ 1 ^ (0xB5 ^ 0xA9) ^ -1)) != 0;
                }
            }
            n2 = lllIllIllIll[1];
            return n2 != 0;
        });
        if (SquireNightmarePlugin.lIIIllIlIlIllll(tileObject2)) {
            bl = lllIllIllIll[0];

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
        void var15;
        if (SquireNightmarePlugin.lIIIllIlIllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var16 = var15.getMessage();
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var16.contains(lllIllIllIIl[lllIllIllIll[25]]) ? 1 : 0)) {
            SquireNightmarePlugin var17;
            Object[] objectArray = new Object[lllIllIllIll[0]];
            objectArray[SquireNightmarePlugin.lllIllIllIll[1]] = var17.aZ;
            Log.info((String)lllIllIllIIl[lllIllIllIll[26]], (Object[])objectArray);
            var17.g();
        }
    }

    public boolean n() {
        boolean bl;
        SquireNightmarePlugin var18;
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(this.aw.rechargeStaffAt(), lllIllIllIll[46])) {
            return lllIllIllIll[1];
        }
        if (!SquireNightmarePlugin.lIIIllIlIllIlII(s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.N.ch(), lllIllIllIll[46]) || SquireNightmarePlugin.lIIIllIlIlllIIl(s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.N.ch(), var18.aw.rechargeStaffAt())) {
            bl = lllIllIllIll[0];

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
        void var19;
        if (SquireNightmarePlugin.lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIll(SquireNightmarePlugin.d())) {
            return;
        }
        Projectile var20 = var19.getProjectile();
        int var21 = lllIllIllIll[54];
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var20.getId(), var21)) {
            var22.bc = lllIllIllIll[0];
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
        SquireNightmarePlugin var23;
        String var24;
        void var25;
        if (SquireNightmarePlugin.lIIIllIlIllIllI(chatMessage.getType(), ChatMessageType.WELCOME)) {
            Log.info((String)lllIllIllIIl[lllIllIllIll[8]]);
            this.g(lllIllIllIll[1]);
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlll(var25.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var25.getMessage().contains(lllIllIllIIl[lllIllIllIll[9]]) ? 1 : 0)) {
            Log.info((String)lllIllIllIIl[lllIllIllIll[10]]);
            var23.aC = lllIllIllIll[0];
        }
        if (!SquireNightmarePlugin.lIIIllIlIllIIII((var24 = var25.getMessage()).contains(lllIllIllIIl[lllIllIllIll[11]]) ? 1 : 0) || SquireNightmarePlugin.lIIIllIlIlIlllI(var24.contains(lllIllIllIIl[lllIllIllIll[12]]) ? 1 : 0)) {
            a.info(lllIllIllIIl[lllIllIllIll[13]]);
            var23.be = var23.bd = Instant.now();
        }
        if (!SquireNightmarePlugin.lIIIllIlIllIIII(var24.contains(lllIllIllIIl[lllIllIllIll[14]]) ? 1 : 0) || SquireNightmarePlugin.lIIIllIlIlIlllI(var24.contains(lllIllIllIIl[lllIllIllIll[15]]) ? 1 : 0)) {
            var23.ar = lllIllIllIll[0];
            var23.b(lllIllIllIll[1]);
            Object[] objectArray = new Object[lllIllIllIll[0]];
            objectArray[SquireNightmarePlugin.lllIllIllIll[1]] = var24;
            Log.info((String)lllIllIllIIl[lllIllIllIll[16]], (Object[])objectArray);
        }
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var24.contains(lllIllIllIIl[lllIllIllIll[17]]) ? 1 : 0)) {
            var23.n(lllIllIllIll[0]);
        }
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var24.contains(lllIllIllIIl[lllIllIllIll[18]]) ? 1 : 0)) {
            var23.n(lllIllIllIll[1]);
        }
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var24.contains(lllIllIllIIl[lllIllIllIll[19]]) ? 1 : 0)) {
            var23.o(lllIllIllIll[0]);
            var23.aR += lllIllIllIll[0];
        }
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var24.contains(lllIllIllIIl[lllIllIllIll[20]]) ? 1 : 0)) {
            var23.o(lllIllIllIll[1]);
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
        classArray[SquireNightmarePlugin.lllIllIllIll[24]] = CollectingItemsTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[25]] = RetrievingTeleportForDeathWalkingTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[26]] = EmergencyTeleportOutTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[27]] = RechargingTridentTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[28]] = RechargingSangTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[29]] = RechargingShadowRichTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[30]] = UsingBankLoadoutTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[31]] = RestoringInPohTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[32]] = ChargeTrackerTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[33]] = WalkingToBankTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[34]] = OpeningBankTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[35]] = BuyingNewSuppliesRestockingTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[36]] = SellingDropsRestockingTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[37]] = WithdrawingLootRestockingTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[38]] = WalkToGrandExchangeTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[39]] = GrabTeleportToGeTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[40]] = LootingTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[41]] = DroppingEmptyVialYouShouldCrushLikeachampTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[42]] = SettingFireSpellTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[43]] = HoppingBeforeEntryTask.class;
        classArray[SquireNightmarePlugin.lllIllIllIll[44]] = PreventingLogoutTask.class;
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
        SquireNightmarePlugin var26;
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(this.aw.neverTeleport() ? 1 : 0)) {
            return lllIllIllIll[1];
        }
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var26.aw.restoreInPOH() ? 1 : 0) && SquireNightmarePlugin.lIIIllIlIllIIII(var26.l() ? 1 : 0) && SquireNightmarePlugin.lIIIllIlIlIlllI(TeleportLoader.canEnterHouse() ? 1 : 0)) {
            a.info(lllIllIllIIl[lllIllIllIll[27]]);
            TeleportLoader.enterHouse();

            return lllIllIllIll[0];
        }
        if (SquireNightmarePlugin.lIIIllIlIllIllI((Object)var26.aw.bankLocation(), (Object)s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.w.VER_SINHAZA)) {
            int[] nArray = new int[lllIllIllIll[0]];
            nArray[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIll[3];
            if (SquireNightmarePlugin.lIIIllIlIlIllll(Inventory.getFirst((int[])nArray))) {
                n2 = lllIllIllIll[3];

                }
            } else {
                n2 = lllIllIllIll[48];

                if (-1 != -1) {
                    return false;
                }
            }
        } else {
            n2 = lllIllIllIll[48];
        }
        int var27 = n2;
        int[] nArray = new int[lllIllIllIll[0]];
        nArray[SquireNightmarePlugin.lllIllIllIll[1]] = var27;
        Item var28 = Inventory.getFirst((int[])nArray);
        if (SquireNightmarePlugin.lIIIllIlIllIIll(var28)) {
            int[] nArray2 = new int[lllIllIllIll[0]];
            nArray2[SquireNightmarePlugin.lllIllIllIll[1]] = lllIllIllIll[3];
            var28 = Inventory.getFirst((int[])nArray2);
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIll(var28)) {
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
        SquireNightmarePlugin var29;
        void var30;
        if (SquireNightmarePlugin.lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlII(Players.getLocal().getWorldLocation().getPlane(), lllIllIllIll[5])) {
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIIll(SquireNightmarePlugin.d())) {
            return;
        }
        Actor var31 = var30.getActor();
        if (SquireNightmarePlugin.lIIIllIlIlIlllI(var31 instanceof Player)) {
            return;
        }
        NPC var32 = (NPC)var31;
        int var33 = var32.getAnimation();
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var33, lllIllIllIll[49]) && SquireNightmarePlugin.lIIIllIlIllIIII(var29.aX ? 1 : 0)) {
            if (SquireNightmarePlugin.lIIIllIlIlIlllI(Inventory.isFull() ? 1 : 0) && SquireNightmarePlugin.lIIIllIlIllIIII(var29.aX ? 1 : 0) && SquireNightmarePlugin.lIIIllIlIlIlllI(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIllIllIIl[lllIllIllIll[36]])) ? 1 : 0)) {
                Log.info((String)lllIllIllIIl[lllIllIllIll[31]]);
                Inventory.getFirst(item -> item.getName().toLowerCase().contains(lllIllIllIIl[lllIllIllIll[35]])).interact(lllIllIllIIl[lllIllIllIll[32]]);
            }
            var29.aX = lllIllIllIll[0];
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var33, lllIllIllIll[50])) {
            var29.ba = lllIllIllIll[10];
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var33, lllIllIllIll[51])) {
            var29.ba = lllIllIllIll[10];
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var33, lllIllIllIll[52])) {
            var29.ba = lllIllIllIll[10];
            return;
        }
        if (SquireNightmarePlugin.lIIIllIlIllIlIl(var33, lllIllIllIll[53])) {
            var29.aX = lllIllIllIll[1];
            var29.f();
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

