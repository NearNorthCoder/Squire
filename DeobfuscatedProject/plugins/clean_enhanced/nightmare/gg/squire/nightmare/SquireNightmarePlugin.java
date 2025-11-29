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
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
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
import gg.squire.nightmare.NightmareManager;
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
import gg.squire.nightmare.BHelper;
import gg.squire.nightmare.CHelper;
import gg.squire.nightmare.DHelper;
import gg.squire.nightmare.NightmareManager;
import gg.squire.nightmare.GameEnum5;
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
            if (!SquireNightmarePlugin.var3(string.contains(var1[var2[43]]) ? 1 : 0) || SquireNightmarePlugin.var4(string.contains(var1[var2[44]]) ? 1 : 0)) {
                n2 = var2[0];
                0;
                if (3 < 0) {
                    return ((0x9C ^ 0xB9) & ~(0x2C ^ 9)) != 0;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        }).stream().map(item -> Character.valueOf(item.getName().charAt(item.getName().indexOf(var2[43]) + var2[0]))).mapToInt(Character::getNumericValue).sum();
    }

    public void p(boolean bl) {
        this.aI = bl;
    }

    static {
        SquireNightmarePlugin.var5();
        SquireNightmarePlugin.var6();
        O = var2[57];
        S = var2[58];
        T = var2[59];
        U = var2[13];
        l = var2[60];
        C = var2[61];
        K = var2[62];
        w = var2[63];
        Q = var2[64];
        A = var2[65];
        x = var2[12];
        P = var2[66];
        m = var2[67];
        L = var2[68];
        e = var2[51];
        G = var2[69];
        F = var2[70];
        j = var2[71];
        u = var2[61];
        v = var2[72];
        M = var2[73];
        H = var2[74];
        R = var2[75];
        c = var2[49];
        h = var2[76];
        N = var2[77];
        b = var1[var2[78]];
        k = var2[79];
        d = var2[53];
        I = var2[63];
        J = var2[80];
        i = var2[81];
        y = var2[82];
        n = var2[47];
        f = var2[50];
        E = var2[83];
        z = var2[84];
        g = var2[52];
        B = var2[85];
        a = LoggerFactory.getLogger(SquireNightmarePlugin.class);
        Integer[] integerArray = new Integer[var2[7]];
        integerArray[SquireNightmarePlugin.var2[1]] = var2[86];
        integerArray[SquireNightmarePlugin.var2[0]] = var2[87];
        integerArray[SquireNightmarePlugin.var2[4]] = var2[88];
        integerArray[SquireNightmarePlugin.var2[5]] = var2[89];
        o = Arrays.asList(integerArray);
        p = new NightmareManager();
        Integer[] integerArray2 = new Integer[var2[7]];
        integerArray2[SquireNightmarePlugin.var2[1]] = var2[90];
        integerArray2[SquireNightmarePlugin.var2[0]] = var2[91];
        integerArray2[SquireNightmarePlugin.var2[4]] = var2[92];
        integerArray2[SquireNightmarePlugin.var2[5]] = var2[93];
        q = Arrays.asList(integerArray2);
        Integer[] integerArray3 = new Integer[var2[7]];
        integerArray3[SquireNightmarePlugin.var2[1]] = var2[94];
        integerArray3[SquireNightmarePlugin.var2[0]] = var2[95];
        integerArray3[SquireNightmarePlugin.var2[4]] = var2[96];
        integerArray3[SquireNightmarePlugin.var2[5]] = var2[97];
        r = Arrays.asList(integerArray3);
        Integer[] integerArray4 = new Integer[var2[15]];
        integerArray4[SquireNightmarePlugin.var2[1]] = var2[86];
        integerArray4[SquireNightmarePlugin.var2[0]] = var2[87];
        integerArray4[SquireNightmarePlugin.var2[4]] = var2[88];
        integerArray4[SquireNightmarePlugin.var2[5]] = var2[89];
        integerArray4[SquireNightmarePlugin.var2[7]] = var2[90];
        integerArray4[SquireNightmarePlugin.var2[8]] = var2[91];
        integerArray4[SquireNightmarePlugin.var2[9]] = var2[92];
        integerArray4[SquireNightmarePlugin.var2[10]] = var2[93];
        integerArray4[SquireNightmarePlugin.var2[11]] = var2[94];
        integerArray4[SquireNightmarePlugin.var2[12]] = var2[95];
        integerArray4[SquireNightmarePlugin.var2[13]] = var2[96];
        integerArray4[SquireNightmarePlugin.var2[14]] = var2[97];
        s = Arrays.asList(integerArray4);
        t = new RegionPoint(var2[35], var2[34], var2[5], var2[98]);
        Integer[] integerArray5 = new Integer[var2[8]];
        integerArray5[SquireNightmarePlugin.var2[1]] = var2[82];
        integerArray5[SquireNightmarePlugin.var2[0]] = var2[84];
        integerArray5[SquireNightmarePlugin.var2[4]] = var2[65];
        integerArray5[SquireNightmarePlugin.var2[5]] = var2[85];
        integerArray5[SquireNightmarePlugin.var2[7]] = var2[61];
        D = Arrays.asList(integerArray5);
        V = List.of(Integer.valueOf(var2[60]), Integer.valueOf(var2[99]));
        W = List.of(Integer.valueOf(var2[100]), Integer.valueOf(var2[101]));
        List[] listArray = new List[var2[4]];
        listArray[SquireNightmarePlugin.var2[1]] = V;
        listArray[SquireNightmarePlugin.var2[0]] = W;
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
        this.k(var2[0]);
        this.aS += var2[0];
    }

    public void g(boolean bl) {
        this.aC = bl;
    }

    public OverlayManager E() {
        return this.ax;
    }

    protected void onStop() {
        this.j();
        this.aU = var2[1];
        this.av = var2[1];
        this.an = null;
        this.al = 0L;
        this.am = null;
        this.ac = var2[1];
        this.aR = var2[1];
        this.aS = var2[1];
        this.ad = var2[1];
        this.ax.remove((Overlay)this.ay);
        0;
        this.aN = var2[1];
        this.aM = var2[1];
        this.aE = var2[1];
        this.ar = var2[1];
        this.aI = var2[1];
        this.j(var2[46]);
        this.ax.remove((Overlay)this.aP);
        0;
        this.ad = var2[1];
        this.aq = new HashSet();
        this.ag = new CHelper(this);
        this.ae = var2[1];
        this.ai = new ArrayList<WorldPoint>();
        this.aX = var2[1];
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

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    public Instant U() {
        return this.bd;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(GraphicsObjectCreated graphicsObjectCreated) {
        void var13;
        if (SquireNightmarePlugin.var3(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        if (SquireNightmarePlugin.var14(Players.getLocal().getWorldLocation().getPlane(), var2[5])) {
            return;
        }
        if (SquireNightmarePlugin.var15(var13.getGraphicsObject().getId(), var2[47])) {
            SquireNightmarePlugin var16;
            WorldPoint var17 = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var13.getGraphicsObject().getLocation());
            var16.Y.add(var17);
            0;
            var16.aE = var2[0];
            var16.aJ = var2[8];
            var16.aQ = var16.aJ + var2[0];
        }
    }

    private static void var5() {
        var2 = new int[103];
        SquireNightmarePlugin.var2[0] = 1;
        SquireNightmarePlugin.var2[1] = (56 + 88 - 87 + 75 ^ 187 + 66 - 166 + 105) & (96 + 71 - 116 + 82 ^ 87 + 172 - 235 + 169 ^ -1);
        SquireNightmarePlugin.var2[2] = 0xFFFFF7ED & 0x6CFF;
        SquireNightmarePlugin.var2[3] = 0xFFFFD7E3 & 0x7F9C;
        SquireNightmarePlugin.var2[4] = 2;
        SquireNightmarePlugin.var2[5] = 3;
        SquireNightmarePlugin.var2[6] = 0xB7 ^ 0x9C;
        SquireNightmarePlugin.var2[7] = 90 + 2 - -60 + 11 ^ 163 + 1 - 82 + 85;
        SquireNightmarePlugin.var2[8] = 98 + 110 - 54 + 42 ^ 176 + 51 - 49 + 15;
        SquireNightmarePlugin.var2[9] = 7 ^ 1;
        SquireNightmarePlugin.var2[10] = 6 ^ 0x69 ^ (0 ^ 0x68);
        SquireNightmarePlugin.var2[11] = 0x38 ^ 0x30;
        SquireNightmarePlugin.var2[12] = 0x6A ^ 0x63;
        SquireNightmarePlugin.var2[13] = 0x3E ^ 0x34;
        SquireNightmarePlugin.var2[14] = 0x8C ^ 0xA8 ^ (0x10 ^ 0x3F);
        SquireNightmarePlugin.var2[15] = 0xE7 ^ 0x87 ^ (0x4A ^ 0x26);
        SquireNightmarePlugin.var2[16] = 0x85 ^ 0x88;
        SquireNightmarePlugin.var2[17] = 0x76 ^ 0x47 ^ (0x83 ^ 0xBC);
        SquireNightmarePlugin.var2[18] = 0x56 ^ 0x59;
        SquireNightmarePlugin.var2[19] = 115 + 51 - 149 + 163 ^ 152 + 19 - 59 + 52;
        SquireNightmarePlugin.var2[20] = 7 ^ 0x16;
        SquireNightmarePlugin.var2[21] = 0x15 ^ 0x3F ^ (0x18 ^ 0x20);
        SquireNightmarePlugin.var2[22] = 0xA9 ^ 0xA1 ^ (0x18 ^ 3);
        SquireNightmarePlugin.var2[23] = 101 + 118 - 170 + 137 ^ 35 + 30 - 55 + 164;
        SquireNightmarePlugin.var2[24] = 0x18 ^ 0xD;
        SquireNightmarePlugin.var2[25] = 0x5B ^ 0x4D;
        SquireNightmarePlugin.var2[26] = 118 + 128 - 131 + 67 ^ 103 + 12 - 45 + 91;
        SquireNightmarePlugin.var2[27] = 0x43 ^ 0x5B;
        SquireNightmarePlugin.var2[28] = 0x4A ^ 0x53;
        SquireNightmarePlugin.var2[29] = 0x55 ^ 0x4F;
        SquireNightmarePlugin.var2[30] = 0x10 ^ 0x55 ^ (0xCB ^ 0x95);
        SquireNightmarePlugin.var2[31] = 0x73 ^ 0x6F;
        SquireNightmarePlugin.var2[32] = 0x20 ^ 0x70 ^ (0x27 ^ 0x6A);
        SquireNightmarePlugin.var2[33] = 0x5B ^ 0x45;
        SquireNightmarePlugin.var2[34] = 0x33 ^ 0x77 ^ (0xDE ^ 0x85);
        SquireNightmarePlugin.var2[35] = 0x3F ^ 0x47 ^ (0x46 ^ 0x1E);
        SquireNightmarePlugin.var2[36] = 135 + 82 - 143 + 77 ^ 158 + 121 - 134 + 37;
        SquireNightmarePlugin.var2[37] = 0xE6 ^ 0xC4;
        SquireNightmarePlugin.var2[38] = 74 + 53 - 63 + 83 ^ 30 + 57 - -80 + 9;
        SquireNightmarePlugin.var2[39] = 0x6B ^ 0x4F;
        SquireNightmarePlugin.var2[40] = 0xAC ^ 0x93 ^ (0x51 ^ 0x4B);
        SquireNightmarePlugin.var2[41] = 0x55 ^ 0x73;
        SquireNightmarePlugin.var2[42] = 87 + 111 - 66 + 34 ^ 102 + 109 - 101 + 19;
        SquireNightmarePlugin.var2[43] = 13 + 134 - 99 + 119 ^ 47 + 51 - 73 + 118;
        SquireNightmarePlugin.var2[44] = 51 + 54 - -7 + 65 ^ 35 + 43 - 24 + 98;
        SquireNightmarePlugin.var2[45] = 0xB8 ^ 0x92;
        SquireNightmarePlugin.var2[46] = -1;
        SquireNightmarePlugin.var2[47] = -(0xFFFF8BF3 & 0x7D1D) & (0xFFFFEFFF & 0x1FF7);
        SquireNightmarePlugin.var2[48] = -(0xFFFFCFFF & 0x3261) & (0xFFFFF7FB & 0x1AFF);
        SquireNightmarePlugin.var2[49] = 0xFFFFEDBB & 0x33E7;
        SquireNightmarePlugin.var2[50] = -(0xFFFFDE7F & 0x27C5) & (0xFFFFAFF7 & 0x77DF);
        SquireNightmarePlugin.var2[51] = 0xFFFFBFD5 & 0x61BE;
        SquireNightmarePlugin.var2[52] = -(0xFFFFDE6D & 0x65FB) & (0xFFFFFDFE & 0x67FB);
        SquireNightmarePlugin.var2[53] = 0xFFFFF5B5 & 0x2BEE;
        SquireNightmarePlugin.var2[54] = 0xFFFF8EFD & 0x77F7;
        SquireNightmarePlugin.var2[55] = 67 + 31 - -15 + 87;
        SquireNightmarePlugin.var2[56] = 1 ^ (0x15 ^ 0x38);
        SquireNightmarePlugin.var2[57] = 0xFFFFE4FF & 0x3FD4;
        SquireNightmarePlugin.var2[58] = 0xFFFFE4F9 & 0x3FDE;
        SquireNightmarePlugin.var2[59] = 0xFFFFF5FF & 0x2ED9;
        SquireNightmarePlugin.var2[60] = -(0xFFFFDC65 & 0x2B9B) & (0xFFFFBFFE & 0x6CEF);
        SquireNightmarePlugin.var2[61] = -(0xFFFFD9EE & 0x365F) & (0xFFFFBBFF & 0x7FDF);
        SquireNightmarePlugin.var2[62] = -(0xFFFFBF8E & 0x5375) & (0xFFFFFFFB & 0x37D7);
        SquireNightmarePlugin.var2[63] = 0xFFFFEFEF & 0x34DE;
        SquireNightmarePlugin.var2[64] = 0xFFFFF5FF & 0x2ED6;
        SquireNightmarePlugin.var2[65] = 0xFFFFACFF & 0x77CA;
        SquireNightmarePlugin.var2[66] = 0xFFFFBFDF & 0x64F5;
        SquireNightmarePlugin.var2[67] = -(0xFFFFC6FE & 0x7B15) & (0xFFFFEFFF & 0x76FF);
        SquireNightmarePlugin.var2[68] = 0xFFFFF7F3 & 0x2CDD;
        SquireNightmarePlugin.var2[69] = 0xFFFFACDF & 0x77ED;
        SquireNightmarePlugin.var2[70] = 0xFFFFB4FF & 0x6FCC;
        SquireNightmarePlugin.var2[71] = 0xFFFF9BEF & 0xF77B;
        SquireNightmarePlugin.var2[72] = 0xFFFFF9FC & 0x279F;
        SquireNightmarePlugin.var2[73] = -(0xFFFFC65B & 0x7BAE) & (0xFFFFEEFF & 0x77DB);
        SquireNightmarePlugin.var2[74] = 0xFFFFEB9B & 0x3FF7;
        SquireNightmarePlugin.var2[75] = -(0xFFFFFF8B & 0x5A7D) & (0xFFFFFEFF & 0x7FDF);
        SquireNightmarePlugin.var2[76] = 0xFFFFB1B7 & 0x6FE9;
        SquireNightmarePlugin.var2[77] = 0xFFFFEFFB & 0x34D7;
        SquireNightmarePlugin.var2[78] = 0xFF ^ 0xAB ^ (0x5E ^ 0x27);
        SquireNightmarePlugin.var2[79] = -(0xFFFFBDBF & 0x72E9) & (0xFFFFFCBF & 0x37ED);
        SquireNightmarePlugin.var2[80] = -(0xFFFFCB2D & 0x37F3) & (0xFFFFA7EF & Short.MAX_VALUE);
        SquireNightmarePlugin.var2[81] = -(0xFFFF8CDF & 0x77E9) & (0xFFFFD7FE & 0x3CFF);
        SquireNightmarePlugin.var2[82] = -(0xFFFFDB3B & 0x3EF5) & (0xFFFFFFF9 & 0x3EFE);
        SquireNightmarePlugin.var2[83] = -(0xFFFFB973 & 0x5EBD) & (0xFFFFBFFF & 0x7CFB);
        SquireNightmarePlugin.var2[84] = -(0xFFFFF753 & 0x58BF) & (0xFFFFF4DB & Short.MAX_VALUE);
        SquireNightmarePlugin.var2[85] = -(0xFFFFFE6F & 0x55F9) & (0xFFFFFFFB & 0x7FFD);
        SquireNightmarePlugin.var2[86] = -(0xFFFFEFAF & 0x5B71) & (0xFFFFFFFC & 0x6FFF);
        SquireNightmarePlugin.var2[87] = 0xFFFFBDDF & 0x66FF;
        SquireNightmarePlugin.var2[88] = -(0xFFFF9F9F & 0x617A) & (0xFFFFE5FF & 0x3FFB);
        SquireNightmarePlugin.var2[89] = -(0xFFFFC9BB & 0x7E57) & (0xFFFFECF7 & Short.MAX_VALUE);
        SquireNightmarePlugin.var2[90] = -(0xFFFFFF81 & 0x527F) & (0xFFFFF7FF & 0x7EDB);
        SquireNightmarePlugin.var2[91] = -(0xFFFF9D97 & 0x7A69) & (0xFFFFFDDE & 0x3EFF);
        SquireNightmarePlugin.var2[92] = -(0xFFFFDF5D & 0x2ABF) & (0xFFFFEFFD & 0x3EFF);
        SquireNightmarePlugin.var2[93] = 0xFFFFE5EC & 0x3EF7;
        SquireNightmarePlugin.var2[94] = -2 & (0xFFFFE4FF & 0x3FDB);
        SquireNightmarePlugin.var2[95] = 0xFFFFEDDF & 0x36FD;
        SquireNightmarePlugin.var2[96] = -(0xFFFFF99D & 0x5F76) & (0xFFFFFDFB & 0x7FF7);
        SquireNightmarePlugin.var2[97] = 0xFFFFE6F3 & 0x3DEF;
        SquireNightmarePlugin.var2[98] = -(0xFFFFC7DF & 0x7865) & (0xFFFFFFFF & 0x7CDF);
        SquireNightmarePlugin.var2[99] = -(0xFFFFF6AF & 0x5952) & (0xFFFFFDFF & 0x76FB);
        SquireNightmarePlugin.var2[100] = -(0xFFFFB7BF & 0x5A41) & (0xFFFFB6FF & 0x7FEF);
        SquireNightmarePlugin.var2[101] = -(0xFFFFFF41 & 0x59BF) & (0xFFFFFDFF & 0x7FFB);
        SquireNightmarePlugin.var2[102] = 0x6E ^ 0xD ^ (0x7F ^ 0x32);
    }

    private static boolean var15(int n2, int n3) {
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
        this.aa = var2[55];
        this.ab = new ArrayList<WorldPoint>();
        this.ac = var2[1];
        this.ad = var2[1];
        this.ae = var2[1];
        this.ai = new ArrayList<WorldPoint>();
        this.ak = null;
        this.al = 0L;
        this.am = null;
        this.an = null;
        this.ao = var2[1];
        this.aq = new HashSet();
        this.ar = var2[1];
        this.aE = var2[1];
        this.aG = var2[1];
        this.aK = var2[1];
        this.aO = var2[1];
        this.aQ = var2[1];
        this.aR = var2[1];
        this.aS = var2[1];
        this.aU = var2[1];
        this.aV = var2[1];
        this.aW = var2[1];
        this.aX = var2[1];
        this.aY = null;
        this.aZ = var2[0];
        this.bf = List.of(new LinkedList(), new LinkedList(), new LinkedList(), new LinkedList(), new LinkedList());
        this.bg = new LinkedList<Duration>();
    }

    private static boolean var18(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var19(int n2, int n3) {
        return n2 > n3;
    }

    public void a(z z2) {
        this.aP = z2;
    }

    public static int b() {
        return Inventory.getCount((boolean)var2[0], item -> {
            String[] stringArray = new String[var2[0]];
            stringArray[SquireNightmarePlugin.var2[1]] = var1[var2[45]];
            return item.hasAction(stringArray);
        });
    }

    private static boolean var20(Object object) {
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
            if (!SquireNightmarePlugin.var3(string.contains(var1[var2[6]]) ? 1 : 0) || SquireNightmarePlugin.var4(string.contains(var1[var2[56]]) ? 1 : 0)) {
                bl = var2[0];
                0;
                if (((6 + 44 - 33 + 122 ^ 124 + 50 - 160 + 162) & (0x6A ^ 0x17 ^ (0x69 ^ 0x2F) ^ -1)) > ((27 + 68 - -83 + 6 ^ 24 + 69 - 59 + 142) & (21 + 62 - 39 + 111 ^ 8 + 17 - -21 + 101 ^ -1))) {
                    return ((2 ^ (0x6A ^ 0x56)) & (0xD6 ^ 0xB5 ^ (0x30 ^ 0x6D) ^ -1)) != 0;
                }
            } else {
                bl = var2[1];
            }
            return bl;
        }).stream().map(item -> Character.valueOf(item.getName().charAt(item.getName().indexOf(var2[43]) + var2[0]))).mapToInt(Character::getNumericValue).sum();
    }

    public int I() {
        return this.aQ;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        void var21;
        if (SquireNightmarePlugin.var3(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        if (SquireNightmarePlugin.var20(SquireNightmarePlugin.d())) {
            return;
        }
        NPC var22 = var21.getNpc();
        if (SquireNightmarePlugin.var4(var22.getName().equalsIgnoreCase(var1[var2[33]]) ? 1 : 0)) {
            var23.bc = var2[1];
        }
    }

    private static boolean var24(Object object) {
        return object != null;
    }

    public boolean s() {
        return this.ad;
    }

    private static boolean var25(Object object, Object object2) {
        return object != object2;
    }

    public static NPC d() {
        return NPCs.getNearest(nPC -> nPC.getName().toLowerCase().contains(var1[var2[42]]));
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
        SquireNightmarePlugin var26;
        if (SquireNightmarePlugin.var19(this.aZ, var2[8])) {
            a.info(var1[var2[21]], (Object)this.aZ);
            return;
        }
        Duration var27 = Duration.between(var26.bd, Instant.now());
        Queue<Duration> var28 = var26.bf.get(var26.aZ);
        if (SquireNightmarePlugin.var15(var28.size(), var2[13])) {
            var28.poll();
            0;
        }
        var2_2.add(var1_1);
        0;
        double d2 = var2_2.stream().mapToLong(Duration::toSeconds).average().orElse(0.0);
        Object[] objectArray = new Object[var2[5]];
        objectArray[SquireNightmarePlugin.var2[1]] = this.aZ;
        objectArray[SquireNightmarePlugin.var2[0]] = var1_1.toSeconds();
        objectArray[SquireNightmarePlugin.var2[4]] = d2;
        a.info(var1[var2[22]], objectArray);
    }

        catch (Exception var34) {
            var34.printStackTrace();
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
        if (SquireNightmarePlugin.var18(gameState, GameState.LOGGING_IN)) {
            Log.info((String)var1[var2[34]]);
            this.g(var2[1]);
        }
    }

    public WorldPoint an() {
        return this.aH;
    }

    public int t() {
        return this.ae;
    }

    private static String var35(String var36, String var37) {
        var36 = new String(Base64.getDecoder().decode(var36.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var38 = new StringBuilder();
        char[] var39 = var37.toCharArray();
        int var40 = var2[1];
        char[] var41 = var36.toCharArray();
        int var42 = var41.length;
        int var43 = var2[1];
        while (SquireNightmarePlugin.var44(var43, var42)) {
            char var45 = var41[var43];
            var38.append((char)(var45 ^ var39[var40 % var39.length]));
            0;
            ++var40;
            ++var43;
            0;
            if (((42 + 127 - -37 + 33 ^ 12 + 24 - 21 + 183) & (98 + 46 - 0 + 17 ^ 121 + 64 - 129 + 80 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var38);
    }

    private static void var6() {
        var1 = new String[var2[102]];
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[1]] = "Eat";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[0]] = "Pick-up";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[4]] = "Pick-up";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[5]] = "We are in combat but not in pnm, going to bank";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[7]] = "Nightmare started";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[8]] = "Welcome message received, we do not have to keep logging.";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[9]] = "You will be logged out";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[10]] = "On next occassion, we have to log out to reset the 6h timer.";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[11]] = "has awoken";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[12]] = "has reawoken";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[13]] = "Nightmare has awoken, starting recording";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[14]] = "item retrieval service";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[15]] = "retrieved some of your items";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[16]] = "Collecting items due to chat message trigger! {}";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[17]] = "shuffling";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[18]] = "feel the effects";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[19]] = "spores have infected you";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[20]] = "The Nightmare's infection has worn off";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[21]] = "Phase {} is not valid";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[22]] = "Phase {} took {} seconds, overall average time: {}";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[23]] = "Fight start time was null, we were not able to record the kill time.";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[24]] = "Kill took {}, overall average time: {}";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[25]] = "you are dead!";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[26]] = "[SquirePNM]: We have died on phase {}, ";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[27]] = "[ForceTeleport]: Teleporting directly to POH";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[28]] = "[ForceTeleport]: No teleport found in inventory, cannot emergency teleport out!";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[29]] = "Ver Sinhaza";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[30]] = "Empty";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[31]] = "Overhealing with Anglerfish before the fight begins as your inventory is full.";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[32]] = "Eat";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[33]] = "Husk";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[34]] = "Logging in, reset 6h log flag.";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[35]] = "anglerfish";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[36]] = "anglerfish";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[37]] = "pool";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[38]] = "Drink";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[39]] = "Pool of Nightmares";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[40]] = "Eat";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[41]] = "Eat";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[42]] = "nightmare";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[43]] = "combat potion";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[44]] = "super strength";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[45]] = "Eat";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[6]] = "sanfew";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[56]] = "balm";
        SquireNightmarePlugin.var1[SquireNightmarePlugin.var2[78]] = "3.4.2";
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
        this.av += var2[0];
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
        SquireNightmarePlugin var46;
        int[] nArray = new int[var2[0]];
        nArray[SquireNightmarePlugin.var2[1]] = var2[2];
        if (SquireNightmarePlugin.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var2[0]];
            nArray2[SquireNightmarePlugin.var2[1]] = var2[3];
            if (SquireNightmarePlugin.var4(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[var2[0]];
                nArray3[SquireNightmarePlugin.var2[1]] = var2[2];
                Item item2 = Inventory.getFirst((int[])nArray3);
                int[] nArray4 = new int[var2[0]];
                nArray4[SquireNightmarePlugin.var2[1]] = var2[3];
                Item item3 = Inventory.getFirst((int[])nArray4);
                item2.useOn(item3);
                return;
            }
        }
        if (SquireNightmarePlugin.var24(Static.getClient().getFollower())) {
            NPC var47 = Static.getClient().getFollower();
            if (SquireNightmarePlugin.var4(Inventory.isFull() ? 1 : 0) && SquireNightmarePlugin.var24(Inventory.getFirst(item -> {
                String[] stringArray = new String[var2[0]];
                stringArray[SquireNightmarePlugin.var2[1]] = var1[var2[41]];
                return item.hasAction(stringArray);
            }))) {
                Inventory.getFirst(item -> {
                    String[] stringArray = new String[var2[0]];
                    stringArray[SquireNightmarePlugin.var2[1]] = var1[var2[40]];
                    return item.hasAction(stringArray);
                }).interact(var1[var2[1]]);
                return;
            }
            String[] stringArray = new String[var2[0]];
            stringArray[SquireNightmarePlugin.var2[1]] = var1[var2[0]];
            if (SquireNightmarePlugin.var4(var47.hasAction(stringArray) ? 1 : 0)) {
                var47.interact(var1[var2[4]]);
            }
        }
        if (SquireNightmarePlugin.var3(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            if (SquireNightmarePlugin.var4(var46.O() ? 1 : 0)) {
                Log.warn((String)var1[var2[5]]);
                var46.b(var2[0]);
                var46.h(var2[1]);
            }
            return;
        }
        if (SquireNightmarePlugin.var48(var46.aJ)) {
            var46.aE = var2[0];
            var46.aJ -= var2[0];
        }
        if (SquireNightmarePlugin.var3(var46.aJ)) {
            var46.aE = var2[1];
            var46.Y.clear();
        }
        if (SquireNightmarePlugin.var48(var46.aQ)) {
            var46.aQ -= var2[0];
        }
        if (SquireNightmarePlugin.var48(var46.aN)) {
            var46.aN -= var2[0];
        }
        if (SquireNightmarePlugin.var3(var46.aN)) {
            var46.aM = var2[1];
            var46.aj = null;
            var46.aD = null;
        }
        var46.ba -= var2[0];
        if (SquireNightmarePlugin.var24(var46.bb) && SquireNightmarePlugin.var3(var46.ba)) {
            var46.bb = null;
        }
    }

    protected void onStart() {
        this.j();
        this.ba = var2[1];
        this.bb = null;
        this.aU = var2[1];
        this.aI = var2[1];
        this.an = null;
        this.al = 0L;
        this.am = null;
        this.av = var2[1];
        this.ac = var2[1];
        this.aR = var2[1];
        this.aS = var2[1];
        this.n(var2[1]);
        this.aK = var2[1];
        this.aM = var2[1];
        this.Y.clear();
        this.aJ = var2[1];
        this.ad = var2[1];
        this.ai = new ArrayList<WorldPoint>();
        a.debug(var1[var2[7]]);
        this.j(var2[46]);
        this.ax.add((Overlay)this.ay);
        0;
        this.ar = var2[1];
        this.az = Instant.now();
        this.aq = new HashSet();
        this.ag = new BHelper(this);
        this.aN = var2[1];
        this.aE = var2[1];
        this.aM = var2[1];
        this.ax.add((Overlay)this.aP);
        0;
        this.ad = var2[1];
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(var1[var2[39]]));
        if (SquireNightmarePlugin.var20(tileObject2)) {
            this.ad = var2[0];
        }
        this.aX = var2[1];
    }

    public int at() {
        return this.aN;
    }

    public int ap() {
        return this.aJ;
    }

    private static boolean var48(int n2) {
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
        SquireNightmarePlugin var49;
        if (SquireNightmarePlugin.var20(this.be)) {
            a.info(var1[var2[23]]);
            return;
        }
        Duration var50 = Duration.between(var49.be, Instant.now());
        if (SquireNightmarePlugin.var15(var49.bg.size(), var2[13])) {
            var49.bg.poll();
            0;
        }
        this.bg.add((Duration)var1_1);
        0;
        double d2 = this.bg.stream().mapToLong(Duration::toSeconds).average().orElse(0.0);
        a.info(var1[var2[24]], (Object)var1_1.toSeconds(), (Object)d2);
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
            if (SquireNightmarePlugin.var4(tileObject.getName().toLowerCase().contains(var1[var2[37]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[0]];
                stringArray[SquireNightmarePlugin.var2[1]] = var1[var2[38]];
                if (SquireNightmarePlugin.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[0];
                    0;
                    if null == null return n2 != 0;
                    return ((0x90 ^ 0xAB ^ (0x81 ^ 0xAB)) & (0xC ^ 1 ^ (0xB5 ^ 0xA9) ^ -1)) != 0;
                }
            }
            n2 = var2[1];
            return n2 != 0;
        });
        if (SquireNightmarePlugin.var24(tileObject2)) {
            bl = var2[0];
            0;
            if (-(0x7A ^ 0x7E) > 0) {
                return ((0xC5 ^ 0x9D) & ~(0x3C ^ 0x64)) != 0;
            }
        } else {
            bl = var2[1];
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
        void var51;
        if (SquireNightmarePlugin.var25(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var52 = var51.getMessage();
        if (SquireNightmarePlugin.var4(var52.contains(var1[var2[25]]) ? 1 : 0)) {
            SquireNightmarePlugin var53;
            Object[] objectArray = new Object[var2[0]];
            objectArray[SquireNightmarePlugin.var2[1]] = var53.aZ;
            Log.info((String)var1[var2[26]], (Object[])objectArray);
            var53.g();
        }
    }

    public boolean n() {
        boolean bl;
        SquireNightmarePlugin var54;
        if (SquireNightmarePlugin.var15(this.aw.rechargeStaffAt(), var2[46])) {
            return var2[1];
        }
        if (!SquireNightmarePlugin.var14(s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.N.ch(), var2[46]) || SquireNightmarePlugin.var44(s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.N.ch(), var54.aw.rechargeStaffAt())) {
            bl = var2[0];
            0;
            if (3 <= ((0x9E ^ 0x96) & ~(0x8B ^ 0x83))) {
                return ((0xE3 ^ 0xA7) & ~(0x87 ^ 0xC3)) != 0;
            }
        } else {
            bl = var2[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var55;
        if (SquireNightmarePlugin.var3(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        if (SquireNightmarePlugin.var20(SquireNightmarePlugin.d())) {
            return;
        }
        Projectile var56 = var55.getProjectile();
        int var57 = var2[54];
        if (SquireNightmarePlugin.var15(var56.getId(), var57)) {
            var58.bc = var2[0];
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
        SquireNightmarePlugin var59;
        String var60;
        void var61;
        if (SquireNightmarePlugin.var18(chatMessage.getType(), ChatMessageType.WELCOME)) {
            Log.info((String)var1[var2[8]]);
            this.g(var2[1]);
        }
        if (SquireNightmarePlugin.var25(var61.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (SquireNightmarePlugin.var4(var61.getMessage().contains(var1[var2[9]]) ? 1 : 0)) {
            Log.info((String)var1[var2[10]]);
            var59.aC = var2[0];
        }
        if (!SquireNightmarePlugin.var3((var60 = var61.getMessage()).contains(var1[var2[11]]) ? 1 : 0) || SquireNightmarePlugin.var4(var60.contains(var1[var2[12]]) ? 1 : 0)) {
            a.info(var1[var2[13]]);
            var59.be = var59.bd = Instant.now();
        }
        if (!SquireNightmarePlugin.var3(var60.contains(var1[var2[14]]) ? 1 : 0) || SquireNightmarePlugin.var4(var60.contains(var1[var2[15]]) ? 1 : 0)) {
            var59.ar = var2[0];
            var59.b(var2[1]);
            Object[] objectArray = new Object[var2[0]];
            objectArray[SquireNightmarePlugin.var2[1]] = var60;
            Log.info((String)var1[var2[16]], (Object[])objectArray);
        }
        if (SquireNightmarePlugin.var4(var60.contains(var1[var2[17]]) ? 1 : 0)) {
            var59.n(var2[0]);
        }
        if (SquireNightmarePlugin.var4(var60.contains(var1[var2[18]]) ? 1 : 0)) {
            var59.n(var2[1]);
        }
        if (SquireNightmarePlugin.var4(var60.contains(var1[var2[19]]) ? 1 : 0)) {
            var59.o(var2[0]);
            var59.aR += var2[0];
        }
        if (SquireNightmarePlugin.var4(var60.contains(var1[var2[20]]) ? 1 : 0)) {
            var59.o(var2[1]);
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
        if (SquireNightmarePlugin.var4(this.aw.useFireSpells() ? 1 : 0)) {
            this.t(var2[0]);
        }
        this.ap = var2[1];
        this.n(var2[1]);
        this.aK = var2[1];
        this.bd = null;
        this.be = null;
        this.aI = var2[1];
        this.bc = var2[1];
        this.aM = var2[1];
        this.Y.clear();
        this.aJ = var2[1];
        this.aW = var2[1];
        this.aV = var2[1];
        this.aq = new HashSet();
        this.ag = new DHelper(this);
        this.j(var2[46]);
        this.aX = var2[1];
        this.ba = var2[1];
        this.bb = null;
        this.aZ = var2[0];
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
        Class[] classArray = new Class[var2[6]];
        classArray[SquireNightmarePlugin.var2[1]] = PrayFlickingTask.class;
        classArray[SquireNightmarePlugin.var2[0]] = AvoidingGraspingClawsTask.class;
        classArray[SquireNightmarePlugin.var2[4]] = AvoidingSporesTask.class;
        classArray[SquireNightmarePlugin.var2[5]] = SteppingIntoFlowerAreaTask.class;
        classArray[SquireNightmarePlugin.var2[7]] = AvoidingNightmaresChargeTask.class;
        classArray[SquireNightmarePlugin.var2[8]] = AttackingHuskTask.class;
        classArray[SquireNightmarePlugin.var2[9]] = AttackingSleepwalkerTask.class;
        classArray[SquireNightmarePlugin.var2[10]] = SnipingSleepwalkerTask.class;
        classArray[SquireNightmarePlugin.var2[11]] = AttackingTotemTask.class;
        classArray[SquireNightmarePlugin.var2[12]] = AttackingNightmareTask.class;
        classArray[SquireNightmarePlugin.var2[13]] = AttackingParasiteTask.class;
        classArray[SquireNightmarePlugin.var2[14]] = SpecialAttackTask.class;
        classArray[SquireNightmarePlugin.var2[15]] = SummonThrallTask.class;
        classArray[SquireNightmarePlugin.var2[16]] = CleansingParasiteTask.class;
        classArray[SquireNightmarePlugin.var2[17]] = DrinkingBoostTask.class;
        classArray[SquireNightmarePlugin.var2[18]] = UsingImbuedHeartTask.class;
        classArray[SquireNightmarePlugin.var2[19]] = EatingTask.class;
        classArray[SquireNightmarePlugin.var2[20]] = RestoringPrayerTask.class;
        classArray[SquireNightmarePlugin.var2[21]] = EnteringPnmTask.class;
        classArray[SquireNightmarePlugin.var2[22]] = WalkingToNightmareTask.class;
        classArray[SquireNightmarePlugin.var2[23]] = DisturbNightmareTask.class;
        classArray[SquireNightmarePlugin.var2[24]] = CollectingItemsTask.class;
        classArray[SquireNightmarePlugin.var2[25]] = RetrievingTeleportForDeathWalkingTask.class;
        classArray[SquireNightmarePlugin.var2[26]] = EmergencyTeleportOutTask.class;
        classArray[SquireNightmarePlugin.var2[27]] = RechargingTridentTask.class;
        classArray[SquireNightmarePlugin.var2[28]] = RechargingSangTask.class;
        classArray[SquireNightmarePlugin.var2[29]] = RechargingShadowRichTask.class;
        classArray[SquireNightmarePlugin.var2[30]] = UsingBankLoadoutTask.class;
        classArray[SquireNightmarePlugin.var2[31]] = RestoringInPohTask.class;
        classArray[SquireNightmarePlugin.var2[32]] = ChargeTrackerTask.class;
        classArray[SquireNightmarePlugin.var2[33]] = WalkingToBankTask.class;
        classArray[SquireNightmarePlugin.var2[34]] = OpeningBankTask.class;
        classArray[SquireNightmarePlugin.var2[35]] = BuyingNewSuppliesRestockingTask.class;
        classArray[SquireNightmarePlugin.var2[36]] = SellingDropsRestockingTask.class;
        classArray[SquireNightmarePlugin.var2[37]] = WithdrawingLootRestockingTask.class;
        classArray[SquireNightmarePlugin.var2[38]] = WalkToGrandExchangeTask.class;
        classArray[SquireNightmarePlugin.var2[39]] = GrabTeleportToGeTask.class;
        classArray[SquireNightmarePlugin.var2[40]] = LootingTask.class;
        classArray[SquireNightmarePlugin.var2[41]] = DroppingEmptyVialYouShouldCrushLikeachampTask.class;
        classArray[SquireNightmarePlugin.var2[42]] = SettingFireSpellTask.class;
        classArray[SquireNightmarePlugin.var2[43]] = HoppingBeforeEntryTask.class;
        classArray[SquireNightmarePlugin.var2[44]] = PreventingLogoutTask.class;
        classArray[SquireNightmarePlugin.var2[45]] = LoggingOutBefore6hTimerTask.class;
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
        SquireNightmarePlugin var62;
        if (SquireNightmarePlugin.var4(this.aw.neverTeleport() ? 1 : 0)) {
            return var2[1];
        }
        if (SquireNightmarePlugin.var4(var62.aw.restoreInPOH() ? 1 : 0) && SquireNightmarePlugin.var3(var62.l() ? 1 : 0) && SquireNightmarePlugin.var4(TeleportLoader.canEnterHouse() ? 1 : 0)) {
            a.info(var1[var2[27]]);
            TeleportLoader.enterHouse();
            0;
            return var2[0];
        }
        if (SquireNightmarePlugin.var18((Object)var62.aw.bankLocation(), (Object)s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.w.VER_SINHAZA)) {
            int[] nArray = new int[var2[0]];
            nArray[SquireNightmarePlugin.var2[1]] = var2[3];
            if (SquireNightmarePlugin.var24(Inventory.getFirst((int[])nArray))) {
                n2 = var2[3];
                0;
                if null != null {
                    return ((0x11 ^ 9) & ~(0x6F ^ 0x77)) != 0;
                }
            } else {
                n2 = var2[48];
                0;
                if (-1 != -1) {
                    return ((83 + 124 - 28 + 12 ^ 74 + 105 - 151 + 105) & (59 + 95 - 56 + 36 ^ 24 + 54 - 18 + 128 ^ -1)) != 0;
                }
            }
        } else {
            n2 = var2[48];
        }
        int var63 = n2;
        int[] nArray = new int[var2[0]];
        nArray[SquireNightmarePlugin.var2[1]] = var63;
        Item var64 = Inventory.getFirst((int[])nArray);
        if (SquireNightmarePlugin.var20(var64)) {
            int[] nArray2 = new int[var2[0]];
            nArray2[SquireNightmarePlugin.var2[1]] = var2[3];
            var64 = Inventory.getFirst((int[])nArray2);
        }
        if (SquireNightmarePlugin.var20(var64)) {
            Log.error((String)var1[var2[28]]);
            return var2[1];
        }
        this.k();
        String[] stringArray = new String[var2[4]];
        stringArray[SquireNightmarePlugin.var2[1]] = var1[var2[29]];
        stringArray[SquireNightmarePlugin.var2[0]] = var1[var2[30]];
        var2_2.interact(stringArray);
        this.b(var2[0]);
        this.p(var2[1]);
        this.ap = var2[0];
        return var2[0];
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

    private static boolean var14(int n2, int n3) {
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

    private static boolean var44(int n2, int n3) {
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

    private static boolean var3(int n2) {
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
        SquireNightmarePlugin var65;
        void var66;
        if (SquireNightmarePlugin.var3(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        if (SquireNightmarePlugin.var14(Players.getLocal().getWorldLocation().getPlane(), var2[5])) {
            return;
        }
        if (SquireNightmarePlugin.var20(SquireNightmarePlugin.d())) {
            return;
        }
        Actor var67 = var66.getActor();
        if (SquireNightmarePlugin.var4(var67 instanceof Player)) {
            return;
        }
        NPC var68 = (NPC)var67;
        int var69 = var68.getAnimation();
        if (SquireNightmarePlugin.var15(var69, var2[49]) && SquireNightmarePlugin.var3(var65.aX)) {
            if (SquireNightmarePlugin.var4(Inventory.isFull() ? 1 : 0) && SquireNightmarePlugin.var3(var65.aX) && SquireNightmarePlugin.var4(Inventory.contains(item -> item.getName().toLowerCase().contains(var1[var2[36]])) ? 1 : 0)) {
                Log.info((String)var1[var2[31]]);
                Inventory.getFirst(item -> item.getName().toLowerCase().contains(var1[var2[35]])).interact(var1[var2[32]]);
            }
            var65.aX = var2[0];
            return;
        }
        if (SquireNightmarePlugin.var15(var69, var2[50])) {
            var65.ba = var2[10];
            return;
        }
        if (SquireNightmarePlugin.var15(var69, var2[51])) {
            var65.ba = var2[10];
            return;
        }
        if (SquireNightmarePlugin.var15(var69, var2[52])) {
            var65.ba = var2[10];
            return;
        }
        if (SquireNightmarePlugin.var15(var69, var2[53])) {
            var65.aX = var2[1];
            var65.f();
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

