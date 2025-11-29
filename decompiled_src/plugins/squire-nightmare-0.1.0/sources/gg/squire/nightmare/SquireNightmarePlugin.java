package gg.squire.nightmare;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.nightmare.overlay.NightmareInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
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
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.World;
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
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.B;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C0000a;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C0001aa;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C0002ab;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C0003ac;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C0004ad;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C0005b;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C0006c;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C0007d;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C0011h;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C0029z;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.E;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.EnumC0026w;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.G;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.H;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.I;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.J;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.K;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.M;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.N;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.O;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.P;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.Q;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.R;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.T;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.U;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.V;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.W;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.X;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.Z;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.aA;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.aB;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.aC;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.aD;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.ae;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.af;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.ag;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.ah;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.ai;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.aj;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.an;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.ao;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.ap;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.aq;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.ar;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.as;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.at;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.aw;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.ax;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.ay;
import s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.az;
@SquireUtil
@PluginDescriptor(name = "Squire Phosani Nightmare", enabledByDefault = false)
/* loaded from: squire-nightmare-0.1.0.jar:gg/squire/nightmare/SquireNightmarePlugin.class */
public class SquireNightmarePlugin extends SquirePlugin {
    private static final /* synthetic */ int z;
    private /* synthetic */ boolean aF;
    public static final /* synthetic */ List<Integer> D;
    private static final /* synthetic */ int E;
    private static /* synthetic */ String[] lllIllIllIIl;
    private /* synthetic */ Instant az;
    public static final /* synthetic */ String b;
    public static final /* synthetic */ int n;
    private static final /* synthetic */ int T;
    private static final /* synthetic */ int H;
    public static final /* synthetic */ List<Integer> o;
    private /* synthetic */ int aN;
    public /* synthetic */ boolean af;
    private static final /* synthetic */ int N;
    private static final /* synthetic */ int Q;
    private static final /* synthetic */ int U;
    private static final /* synthetic */ int L;
    public static final /* synthetic */ List<Integer> r;
    @Inject
    private /* synthetic */ OverlayManager ax;
    public /* synthetic */ Map<Integer, Integer> ag;
    private /* synthetic */ boolean at;
    public static final /* synthetic */ int k;
    public static final /* synthetic */ int u;
    private static final /* synthetic */ int K;
    public static final /* synthetic */ int h;
    private /* synthetic */ boolean aI;
    public static final /* synthetic */ int j;
    public static /* synthetic */ List<Integer> W;
    public static /* synthetic */ List<Integer> X;
    private static final /* synthetic */ int S;
    private /* synthetic */ boolean aC;
    public static final /* synthetic */ int l;
    private /* synthetic */ boolean au;
    @Inject
    private /* synthetic */ NightmareInfoBox ay;
    private /* synthetic */ int av;
    private static final /* synthetic */ int B;
    public static final /* synthetic */ List<Integer> q;
    @Inject
    private /* synthetic */ SquireNightmareConfig aw;
    public static final /* synthetic */ int f;
    private static final /* synthetic */ int P;
    private /* synthetic */ Prayer bb;
    private /* synthetic */ World aB;
    private static final /* synthetic */ int F;
    private static final /* synthetic */ int I;
    public static final /* synthetic */ Map<Integer, String> p;
    private static /* synthetic */ int[] lllIllIllIll;
    private static final /* synthetic */ int G;
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
    private /* synthetic */ boolean bc;
    private static final /* synthetic */ int O;
    private /* synthetic */ int ba;
    public /* synthetic */ WorldArea aj;
    private static final /* synthetic */ Logger a;
    private static final /* synthetic */ int y;
    private /* synthetic */ WorldArea aD;
    @Inject
    private /* synthetic */ ItemManager aT;
    private static final /* synthetic */ int C;
    public static /* synthetic */ List<Integer> V;
    public static final /* synthetic */ int x;
    private /* synthetic */ boolean as;
    private /* synthetic */ Instant bd;
    public static final /* synthetic */ int d;
    public static final /* synthetic */ int i;
    private static final /* synthetic */ int M;
    public static final /* synthetic */ int e;
    @Inject
    public /* synthetic */ C0011h ah;
    @Inject
    private /* synthetic */ C0029z aP;

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ List<Integer> f1s;
    private /* synthetic */ int aA;
    public static final /* synthetic */ int c;
    public static final /* synthetic */ int g;
    private /* synthetic */ WorldPoint aH;
    private /* synthetic */ Instant be;
    private final /* synthetic */ List<WorldPoint> Y = new ArrayList();
    public /* synthetic */ RunePouchSetup Z = null;
    public /* synthetic */ int aa = lllIllIllIll[55];
    public /* synthetic */ List<WorldPoint> ab = new ArrayList();
    public /* synthetic */ boolean ac = lllIllIllIll[1];
    public /* synthetic */ boolean ad = lllIllIllIll[1];
    public /* synthetic */ int ae = lllIllIllIll[1];
    public /* synthetic */ List<WorldPoint> ai = new ArrayList();
    public /* synthetic */ Future<BankLoadout> ak = null;
    public /* synthetic */ long al = 0;
    public /* synthetic */ Future<BankLoadout> am = null;
    public /* synthetic */ BankLoadout an = null;
    public /* synthetic */ boolean ao = lllIllIllIll[1];
    private /* synthetic */ HashSet<Integer> aq = new HashSet<>();
    private /* synthetic */ boolean ar = lllIllIllIll[1];
    private /* synthetic */ boolean aE = lllIllIllIll[1];
    private /* synthetic */ boolean aG = lllIllIllIll[1];
    private /* synthetic */ boolean aK = lllIllIllIll[1];
    private /* synthetic */ boolean aO = lllIllIllIll[1];
    private /* synthetic */ int aQ = lllIllIllIll[1];
    private /* synthetic */ int aR = lllIllIllIll[1];
    private /* synthetic */ int aS = lllIllIllIll[1];
    private /* synthetic */ boolean aU = lllIllIllIll[1];
    private /* synthetic */ Integer aV = Integer.valueOf(lllIllIllIll[1]);
    private /* synthetic */ Integer aW = Integer.valueOf(lllIllIllIll[1]);
    private /* synthetic */ boolean aX = lllIllIllIll[1];
    private /* synthetic */ NPC aY = null;
    private /* synthetic */ int aZ = lllIllIllIll[0];
    private /* synthetic */ List<Queue<Duration>> bf = List.of(new LinkedList(), new LinkedList(), new LinkedList(), new LinkedList(), new LinkedList());
    private /* synthetic */ Queue<Duration> bg = new LinkedList();

    public void i(boolean z2) {
        this.bc = z2;
    }

    public void a(Queue<Duration> queue) {
        this.bg = queue;
    }

    public void k() {
        j();
    }

    public void i(int i2) {
        this.ba = i2;
    }

    public static int c() {
        return Inventory.getAll(item -> {
            String lowerCase = item.getName().toLowerCase();
            if (!lIIIllIlIllIIII(lowerCase.contains(lllIllIllIIl[lllIllIllIll[43]]) ? 1 : 0) || lIIIllIlIlIlllI(lowerCase.contains(lllIllIllIIl[lllIllIllIll[44]]) ? 1 : 0)) {
                ?? r0 = lllIllIllIll[0];
                "".length();
                return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIllIllIll[1];
        }).stream().map(item2 -> {
            return Character.valueOf(item2.getName().charAt(item2.getName().indexOf(lllIllIllIll[43]) + lllIllIllIll[0]));
        }).mapToInt((v0) -> {
            return Character.getNumericValue(v0);
        }).sum();
    }

    public void p(boolean z2) {
        this.aI = z2;
    }

    static {
        lIIIllIlIlIllIl();
        lIIIllIlIlIllII();
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
        Integer[] numArr = new Integer[lllIllIllIll[7]];
        numArr[lllIllIllIll[1]] = Integer.valueOf(lllIllIllIll[86]);
        numArr[lllIllIllIll[0]] = Integer.valueOf(lllIllIllIll[87]);
        numArr[lllIllIllIll[4]] = Integer.valueOf(lllIllIllIll[88]);
        numArr[lllIllIllIll[5]] = Integer.valueOf(lllIllIllIll[89]);
        o = Arrays.asList(numArr);
        p = new C0000a();
        Integer[] numArr2 = new Integer[lllIllIllIll[7]];
        numArr2[lllIllIllIll[1]] = Integer.valueOf(lllIllIllIll[90]);
        numArr2[lllIllIllIll[0]] = Integer.valueOf(lllIllIllIll[91]);
        numArr2[lllIllIllIll[4]] = Integer.valueOf(lllIllIllIll[92]);
        numArr2[lllIllIllIll[5]] = Integer.valueOf(lllIllIllIll[93]);
        q = Arrays.asList(numArr2);
        Integer[] numArr3 = new Integer[lllIllIllIll[7]];
        numArr3[lllIllIllIll[1]] = Integer.valueOf(lllIllIllIll[94]);
        numArr3[lllIllIllIll[0]] = Integer.valueOf(lllIllIllIll[95]);
        numArr3[lllIllIllIll[4]] = Integer.valueOf(lllIllIllIll[96]);
        numArr3[lllIllIllIll[5]] = Integer.valueOf(lllIllIllIll[97]);
        r = Arrays.asList(numArr3);
        Integer[] numArr4 = new Integer[lllIllIllIll[15]];
        numArr4[lllIllIllIll[1]] = Integer.valueOf(lllIllIllIll[86]);
        numArr4[lllIllIllIll[0]] = Integer.valueOf(lllIllIllIll[87]);
        numArr4[lllIllIllIll[4]] = Integer.valueOf(lllIllIllIll[88]);
        numArr4[lllIllIllIll[5]] = Integer.valueOf(lllIllIllIll[89]);
        numArr4[lllIllIllIll[7]] = Integer.valueOf(lllIllIllIll[90]);
        numArr4[lllIllIllIll[8]] = Integer.valueOf(lllIllIllIll[91]);
        numArr4[lllIllIllIll[9]] = Integer.valueOf(lllIllIllIll[92]);
        numArr4[lllIllIllIll[10]] = Integer.valueOf(lllIllIllIll[93]);
        numArr4[lllIllIllIll[11]] = Integer.valueOf(lllIllIllIll[94]);
        numArr4[lllIllIllIll[12]] = Integer.valueOf(lllIllIllIll[95]);
        numArr4[lllIllIllIll[13]] = Integer.valueOf(lllIllIllIll[96]);
        numArr4[lllIllIllIll[14]] = Integer.valueOf(lllIllIllIll[97]);
        f1s = Arrays.asList(numArr4);
        t = new RegionPoint(lllIllIllIll[35], lllIllIllIll[34], lllIllIllIll[5], lllIllIllIll[98]);
        Integer[] numArr5 = new Integer[lllIllIllIll[8]];
        numArr5[lllIllIllIll[1]] = Integer.valueOf(lllIllIllIll[82]);
        numArr5[lllIllIllIll[0]] = Integer.valueOf(lllIllIllIll[84]);
        numArr5[lllIllIllIll[4]] = Integer.valueOf(lllIllIllIll[65]);
        numArr5[lllIllIllIll[5]] = Integer.valueOf(lllIllIllIll[85]);
        numArr5[lllIllIllIll[7]] = Integer.valueOf(lllIllIllIll[61]);
        D = Arrays.asList(numArr5);
        V = List.of(Integer.valueOf(lllIllIllIll[60]), Integer.valueOf(lllIllIllIll[99]));
        W = List.of(Integer.valueOf(lllIllIllIll[100]), Integer.valueOf(lllIllIllIll[101]));
        List[] listArr = new List[lllIllIllIll[4]];
        listArr[lllIllIllIll[1]] = V;
        listArr[lllIllIllIll[0]] = W;
        X = (List) Stream.of((Object[]) listArr).flatMap((v0) -> {
            return v0.stream();
        }).collect(Collectors.toList());
    }

    public void c(Instant instant) {
        this.be = instant;
    }

    public boolean r() {
        return this.ac;
    }

    public void a(C0011h c0011h) {
        this.ah = c0011h;
    }

    public void a(int i2) {
        this.aa = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public void g() {
        j();
        k((boolean) lllIllIllIll[0]);
        this.aS += lllIllIllIll[0];
    }

    public void g(boolean z2) {
        this.aC = z2;
    }

    public OverlayManager E() {
        return this.ax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    protected void onStop() {
        j();
        this.aU = lllIllIllIll[1];
        this.av = lllIllIllIll[1];
        this.an = null;
        this.al = 0L;
        this.am = null;
        this.ac = lllIllIllIll[1];
        this.aR = lllIllIllIll[1];
        this.aS = lllIllIllIll[1];
        this.ad = lllIllIllIll[1];
        this.ax.remove(this.ay);
        "".length();
        this.aN = lllIllIllIll[1];
        this.aM = lllIllIllIll[1];
        this.aE = lllIllIllIll[1];
        this.ar = lllIllIllIll[1];
        this.aI = lllIllIllIll[1];
        j(lllIllIllIll[46]);
        this.ax.remove(this.aP);
        "".length();
        this.ad = lllIllIllIll[1];
        this.aq = new HashSet<>();
        this.ag = new C0006c(this);
        this.ae = lllIllIllIll[1];
        this.ai = new ArrayList();
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

    public void o(boolean z2) {
        this.aG = z2;
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

    public void j(boolean z2) {
        this.af = z2;
    }

    public boolean O() {
        return this.aX;
    }

    public Map<Integer, Integer> aa() {
        return this.ag;
    }

    public C0011h u() {
        return this.ah;
    }

    public void k(int i2) {
        this.aN = i2;
    }

    public int J() {
        return this.aR;
    }

    public void a(OverlayManager overlayManager) {
        this.ax = overlayManager;
    }

    public void a(NPC npc) {
        this.aY = npc;
    }

    public boolean C() {
        return this.at;
    }

    public int K() {
        return this.aS;
    }

    private static String lIIIllIlIlIIlll(String lllllllllllllllIIllIIllIIllIlIlI, String lllllllllllllllIIllIIllIIllIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllIIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllIIllIlIIl.getBytes(StandardCharsets.UTF_8)), lllIllIllIll[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIllIllIll[4], lllllllllllllllIIllIIllIIllIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIllIIllIlIll) {
            lllllllllllllllIIllIIllIIllIlIll.printStackTrace();
            return null;
        }
    }

    public Instant U() {
        return this.bd;
    }

    private static boolean lIIIllIlIlIlllI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    @Subscribe
    private void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0) || lIIIllIlIllIlII(Players.getLocal().getWorldLocation().getPlane(), lllIllIllIll[5]) || !lIIIllIlIllIlIl(graphicsObjectCreated.getGraphicsObject().getId(), lllIllIllIll[47])) {
            return;
        }
        this.Y.add(WorldPoint.fromLocal(Static.getClient(), graphicsObjectCreated.getGraphicsObject().getLocation()));
        "".length();
        this.aE = lllIllIllIll[0];
        this.aJ = lllIllIllIll[8];
        this.aQ = this.aJ + lllIllIllIll[0];
    }

    private static void lIIIllIlIlIllIl() {
        lllIllIllIll = new int[103];
        lllIllIllIll[0] = " ".length();
        lllIllIllIll[1] = ((((56 + 88) - 87) + 75) ^ (((187 + 66) - 166) + 105)) & (((((96 + 71) - 116) + 82) ^ (((87 + 172) - 235) + 169)) ^ (-" ".length()));
        lllIllIllIll[2] = (-2067) & 27903;
        lllIllIllIll[3] = (-10269) & 32668;
        lllIllIllIll[4] = "  ".length();
        lllIllIllIll[5] = "   ".length();
        lllIllIllIll[6] = 183 ^ 156;
        lllIllIllIll[7] = (((90 + 2) - (-60)) + 11) ^ (((163 + 1) - 82) + 85);
        lllIllIllIll[8] = (((98 + 110) - 54) + 42) ^ (((176 + 51) - 49) + 15);
        lllIllIllIll[9] = 7 ^ 1;
        lllIllIllIll[10] = (6 ^ 105) ^ (0 ^ 104);
        lllIllIllIll[11] = 56 ^ 48;
        lllIllIllIll[12] = 106 ^ 99;
        lllIllIllIll[13] = 62 ^ 52;
        lllIllIllIll[14] = (140 ^ 168) ^ (16 ^ 63);
        lllIllIllIll[15] = (231 ^ 135) ^ (74 ^ 38);
        lllIllIllIll[16] = 133 ^ 136;
        lllIllIllIll[17] = (118 ^ 71) ^ (131 ^ 188);
        lllIllIllIll[18] = 86 ^ 89;
        lllIllIllIll[19] = (((115 + 51) - 149) + 163) ^ (((152 + 19) - 59) + 52);
        lllIllIllIll[20] = 7 ^ 22;
        lllIllIllIll[21] = (21 ^ 63) ^ (24 ^ 32);
        lllIllIllIll[22] = (169 ^ 161) ^ (24 ^ 3);
        lllIllIllIll[23] = (((101 + 118) - 170) + 137) ^ (((35 + 30) - 55) + 164);
        lllIllIllIll[24] = 24 ^ 13;
        lllIllIllIll[25] = 91 ^ 77;
        lllIllIllIll[26] = (((118 + 128) - 131) + 67) ^ (((103 + 12) - 45) + 91);
        lllIllIllIll[27] = 67 ^ 91;
        lllIllIllIll[28] = 74 ^ 83;
        lllIllIllIll[29] = 85 ^ 79;
        lllIllIllIll[30] = (16 ^ 85) ^ (203 ^ 149);
        lllIllIllIll[31] = 115 ^ 111;
        lllIllIllIll[32] = (32 ^ 112) ^ (39 ^ 106);
        lllIllIllIll[33] = 91 ^ 69;
        lllIllIllIll[34] = (51 ^ 119) ^ (222 ^ 133);
        lllIllIllIll[35] = (63 ^ 71) ^ (70 ^ 30);
        lllIllIllIll[36] = (((135 + 82) - 143) + 77) ^ (((158 + 121) - 134) + 37);
        lllIllIllIll[37] = 230 ^ 196;
        lllIllIllIll[38] = (((74 + 53) - 63) + 83) ^ (((30 + 57) - (-80)) + 9);
        lllIllIllIll[39] = 107 ^ 79;
        lllIllIllIll[40] = (172 ^ 147) ^ (81 ^ 75);
        lllIllIllIll[41] = 85 ^ 115;
        lllIllIllIll[42] = (((87 + 111) - 66) + 34) ^ (((102 + 109) - 101) + 19);
        lllIllIllIll[43] = (((13 + 134) - 99) + 119) ^ (((47 + 51) - 73) + 118);
        lllIllIllIll[44] = (((51 + 54) - (-7)) + 65) ^ (((35 + 43) - 24) + 98);
        lllIllIllIll[45] = 184 ^ 146;
        lllIllIllIll[46] = -" ".length();
        lllIllIllIll[47] = (-((-29709) & 32029)) & (-4097) & 8183;
        lllIllIllIll[48] = (-((-12289) & 12897)) & (-2053) & 6911;
        lllIllIllIll[49] = (-4677) & 13287;
        lllIllIllIll[50] = (-((-8577) & 10181)) & (-20489) & 30687;
        lllIllIllIll[51] = (-16427) & 25022;
        lllIllIllIll[52] = (-((-8595) & 26107)) & (-514) & 26619;
        lllIllIllIll[53] = (-2635) & 11246;
        lllIllIllIll[54] = (-28931) & 30711;
        lllIllIllIll[55] = ((67 + 31) - (-15)) + 87;
        lllIllIllIll[56] = " ".length() ^ (21 ^ 56);
        lllIllIllIll[57] = (-6913) & 16340;
        lllIllIllIll[58] = (-6919) & 16350;
        lllIllIllIll[59] = (-2561) & 11993;
        lllIllIllIll[60] = (-((-9115) & 11163)) & (-16386) & 27887;
        lllIllIllIll[61] = (-((-9746) & 13919)) & (-17409) & 32735;
        lllIllIllIll[62] = (-((-16498) & 21365)) & (-5) & 14295;
        lllIllIllIll[63] = (-4113) & 13534;
        lllIllIllIll[64] = (-2561) & 11990;
        lllIllIllIll[65] = (-21249) & 30666;
        lllIllIllIll[66] = (-16417) & 25845;
        lllIllIllIll[67] = (-((-14594) & 31509)) & (-4097) & 30463;
        lllIllIllIll[68] = (-2061) & 11485;
        lllIllIllIll[69] = (-21281) & 30701;
        lllIllIllIll[70] = (-19201) & 28620;
        lllIllIllIll[71] = (-25617) & 63355;
        lllIllIllIll[72] = (-1540) & 10143;
        lllIllIllIll[73] = (-((-14757) & 31662)) & (-4353) & 30683;
        lllIllIllIll[74] = (-5221) & 16375;
        lllIllIllIll[75] = (-((-117) & 23165)) & (-257) & 32735;
        lllIllIllIll[76] = (-20041) & 28649;
        lllIllIllIll[77] = (-4101) & 13527;
        lllIllIllIll[78] = (255 ^ 171) ^ (94 ^ 39);
        lllIllIllIll[79] = (-((-16961) & 29417)) & (-833) & 14317;
        lllIllIllIll[80] = (-((-13523) & 14323)) & (-22545) & 32767;
        lllIllIllIll[81] = (-((-29473) & 30697)) & (-10242) & 15615;
        lllIllIllIll[82] = (-((-9413) & 16117)) & (-7) & 16126;
        lllIllIllIll[83] = (-((-18061) & 24253)) & (-16385) & 31995;
        lllIllIllIll[84] = (-((-2221) & 22719)) & (-2853) & 32767;
        lllIllIllIll[85] = (-((-401) & 22009)) & (-5) & 32765;
        lllIllIllIll[86] = (-((-4177) & 23409)) & (-4) & 28671;
        lllIllIllIll[87] = (-16929) & 26367;
        lllIllIllIll[88] = (-((-24673) & 24954)) & (-6657) & 16379;
        lllIllIllIll[89] = (-((-13893) & 32343)) & (-4873) & 32767;
        lllIllIllIll[90] = (-((-127) & 21119)) & (-2049) & 32475;
        lllIllIllIll[91] = (-((-25193) & 31337)) & (-546) & 16127;
        lllIllIllIll[92] = (-((-8355) & 10943)) & (-4099) & 16127;
        lllIllIllIll[93] = (-6676) & 16119;
        lllIllIllIll[94] = (-"  ".length()) & (-6913) & 16347;
        lllIllIllIll[95] = (-4641) & 14077;
        lllIllIllIll[96] = (-((-1635) & 24438)) & (-517) & 32759;
        lllIllIllIll[97] = (-6413) & 15855;
        lllIllIllIll[98] = (-((-14369) & 30821)) & (-1) & 31967;
        lllIllIllIll[99] = (-((-2385) & 22866)) & (-513) & 30459;
        lllIllIllIll[100] = (-((-18497) & 23105)) & (-18689) & 32751;
        lllIllIllIll[101] = (-((-191) & 22975)) & (-513) & 32763;
        lllIllIllIll[102] = (110 ^ 13) ^ (127 ^ 50);
    }

    private static boolean lIIIllIlIllIlIl(int i2, int i3) {
        return i2 == i3;
    }

    public void a(Integer num) {
        this.aV = num;
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

    public void t(boolean z2) {
        this.aU = z2;
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

    private static boolean lIIIllIlIllIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIllIlIlllIII(int i2, int i3) {
        return i2 > i3;
    }

    public void a(C0029z c0029z) {
        this.aP = c0029z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public static int b() {
        return Inventory.getCount((boolean) lllIllIllIll[0], item -> {
            String[] strArr = new String[lllIllIllIll[0]];
            strArr[lllIllIllIll[1]] = lllIllIllIIl[lllIllIllIll[45]];
            return item.hasAction(strArr);
        });
    }

    private static boolean lIIIllIlIllIIll(Object obj) {
        return obj == null;
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
            String lowerCase = item.getName().toLowerCase();
            if (!lIIIllIlIllIIII(lowerCase.contains(lllIllIllIIl[lllIllIllIll[6]]) ? 1 : 0) || lIIIllIlIlIlllI(lowerCase.contains(lllIllIllIIl[lllIllIllIll[56]]) ? 1 : 0)) {
                ?? r0 = lllIllIllIll[0];
                "".length();
                return (((((6 + 44) - 33) + 122) ^ (((124 + 50) - 160) + 162)) & (((106 ^ 23) ^ (105 ^ 47)) ^ (-" ".length()))) > (((((27 + 68) - (-83)) + 6) ^ (((24 + 69) - 59) + 142)) & (((((21 + 62) - 39) + 111) ^ (((8 + 17) - (-21)) + 101)) ^ (-" ".length()))) ? ("  ".length() ^ (106 ^ 86)) & (((214 ^ 181) ^ (48 ^ 109)) ^ (-" ".length())) : r0;
            }
            return lllIllIllIll[1];
        }).stream().map(item2 -> {
            return Character.valueOf(item2.getName().charAt(item2.getName().indexOf(lllIllIllIll[43]) + lllIllIllIll[0]));
        }).mapToInt((v0) -> {
            return Character.getNumericValue(v0);
        }).sum();
    }

    public int I() {
        return this.aQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0) || lIIIllIlIllIIll(d()) || !lIIIllIlIlIlllI(npcSpawned.getNpc().getName().equalsIgnoreCase(lllIllIllIIl[lllIllIllIll[33]]) ? 1 : 0)) {
            return;
        }
        this.bc = lllIllIllIll[1];
    }

    private static boolean lIIIllIlIlIllll(Object obj) {
        return obj != null;
    }

    public boolean s() {
        return this.ad;
    }

    private static boolean lIIIllIlIllIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    public static NPC d() {
        return NPCs.getNearest(npc -> {
            return npc.getName().toLowerCase().contains(lllIllIllIIl[lllIllIllIll[42]]);
        });
    }

    @Provides
    SquireNightmareConfig a(ConfigManager configManager) {
        return (SquireNightmareConfig) configManager.getConfig(SquireNightmareConfig.class);
    }

    public void r(boolean z2) {
        this.aM = z2;
    }

    public void m(boolean z2) {
        this.aE = z2;
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

    public void h() {
        if (lIIIllIlIlllIII(this.aZ, lllIllIllIll[8])) {
            a.info(lllIllIllIIl[lllIllIllIll[21]], Integer.valueOf(this.aZ));
            return;
        }
        Duration between = Duration.between(this.bd, Instant.now());
        Queue<Duration> queue = this.bf.get(this.aZ);
        if (lIIIllIlIllIlIl(queue.size(), lllIllIllIll[13])) {
            queue.poll();
            "".length();
        }
        queue.add(between);
        "".length();
        double orElse = queue.stream().mapToLong((v0) -> {
            return v0.toSeconds();
        }).average().orElse(0.0d);
        Logger logger = a;
        String str = lllIllIllIIl[lllIllIllIll[22]];
        Object[] objArr = new Object[lllIllIllIll[5]];
        objArr[lllIllIllIll[1]] = Integer.valueOf(this.aZ);
        objArr[lllIllIllIll[0]] = Long.valueOf(between.toSeconds());
        objArr[lllIllIllIll[4]] = Double.valueOf(orElse);
        logger.info(str, objArr);
    }

    private static String lIIIllIlIlIIllI(String lllllllllllllllIIllIIllIIlIlllIl, String lllllllllllllllIIllIIllIIlIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllIIlIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIllIIlIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIllIIlIlllll.init(lllIllIllIll[4], secretKeySpec);
            return new String(lllllllllllllllIIllIIllIIlIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllIIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIllIIlIllllI) {
            lllllllllllllllIIllIIllIIlIllllI.printStackTrace();
            return null;
        }
    }

    public C0029z H() {
        return this.aP;
    }

    public void c(List<WorldPoint> list) {
        this.ai = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Subscribe
    private void a(GameStateChanged gameStateChanged) {
        if (lIIIllIlIllIllI(gameStateChanged.getGameState(), GameState.LOGGING_IN)) {
            Log.info(lllIllIllIIl[lllIllIllIll[34]]);
            g((boolean) lllIllIllIll[1]);
        }
    }

    public WorldPoint an() {
        return this.aH;
    }

    public int t() {
        return this.ae;
    }

    private static String lIIIllIlIlIlIII(String lllllllllllllllIIllIIllIIlllllll, String lllllllllllllllIIllIIllIIllllllI) {
        String lllllllllllllllIIllIIllIIlllllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIllIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIllIIlllllIl = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIIllIIllllllI.toCharArray();
        int lllllllllllllllIIllIIllIIllllIll = lllIllIllIll[1];
        char[] charArray2 = lllllllllllllllIIllIIllIIlllllll2.toCharArray();
        int length = charArray2.length;
        int i2 = lllIllIllIll[1];
        while (lIIIllIlIlllIIl(i2, length)) {
            char lllllllllllllllIIllIIllIIlllIIlI = charArray2[i2];
            lllllllllllllllIIllIIllIIlllllIl.append((char) (lllllllllllllllIIllIIllIIlllIIlI ^ charArray[lllllllllllllllIIllIIllIIllllIll % charArray.length]));
            "".length();
            lllllllllllllllIIllIIllIIllllIll++;
            i2++;
            "".length();
            if ((((((42 + 127) - (-37)) + 33) ^ (((12 + 24) - 21) + 183)) & (((((98 + 46) - 0) + 17) ^ (((121 + 64) - 129) + 80)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIllIIlllllIl);
    }

    private static void lIIIllIlIlIllII() {
        lllIllIllIIl = new String[lllIllIllIll[102]];
        lllIllIllIIl[lllIllIllIll[1]] = lIIIllIlIlIIllI("Gku8cfaw5yg=", "iOcVK");
        lllIllIllIIl[lllIllIllIll[0]] = lIIIllIlIlIIllI("V/GMf17UGbY=", "kMTOI");
        lllIllIllIIl[lllIllIllIll[4]] = lIIIllIlIlIIlll("EX2E+mUnytc=", "wdZQJ");
        lllIllIllIIl[lllIllIllIll[5]] = lIIIllIlIlIIlll("bB/nvJfRk4F8cbev2oz1jaXcD8lVUIZflSI/QSrbanC3RxYaWt7pwKUZQH/ZQhnP", "UDQJh");
        lllIllIllIIl[lllIllIllIll[7]] = lIIIllIlIlIlIII("Hg8KLzs9Bx8ibyMSDDU7NQI=", "PfmGO");
        lllIllIllIIl[lllIllIllIll[8]] = lIIIllIlIlIlIII("NDIiJhoOMm4oEBAkLyIQQyUrJhAKISshWUMgK2URDHcgKgFDPy8zEEMjIWUeBjI+ZRkMMCksGwR5", "cWNEu");
        lllIllIllIIl[lllIllIllIll[9]] = lIIIllIlIlIlIII("Pjg2ZgcOOy9mEgJ3LykXADInZh8SIw==", "gWCFp");
        lllIllIllIIl[lllIllIllIll[10]] = lIIIllIlIlIlIII("ASVMKAg2P0wpDi0qHzUEISVAZhorawQnGytrGClNIiQLZgI7P0wyAm45CTUIOmsYLghufQRmGScmCTRD", "NKlFm");
        lllIllIllIIl[lllIllIllIll[11]] = lIIIllIlIlIIllI("tBOyerLvUbh4tusJ8SlW5g==", "oLxtp");
        lllIllIllIIl[lllIllIllIll[12]] = lIIIllIlIlIlIII("EQw0ZxgcDDAoARwD", "ymGGj");
        lllIllIllIIl[lllIllIllIll[13]] = lIIIllIlIlIIlll("LNZ8l1BKrh/1aLNqKPgmOiTTZ9AC7qTCAicg77rRkaRP06ccvzOTq2hkiLw8/szN", "Tdehb");
        lllIllIllIIl[lllIllIllIll[14]] = lIIIllIlIlIlIII("Oh0kOWYhDDUmLzYfIDhmIAwzIi8wDA==", "SiATF");
        lllIllIllIIl[lllIllIllIll[15]] = lIIIllIlIlIIllI("B3SJc7adYrAlukoEVKQ1TngfMLxo8bkxczjhLfA+xUs=", "OZeWJ");
        lllIllIllIIl[lllIllIllIll[16]] = lIIIllIlIlIIllI("8sE7MiHdK39crK2OUiB4HRb06raImrydTzRWHSLWDjrqQ1V2xlOJsjAgKijI/234FsrFUwIwIgo=", "HXIdD");
        lllIllIllIIl[lllIllIllIll[17]] = lIIIllIlIlIlIII("GzI/Hw0EMyQe", "hZJyk");
        lllIllIllIIl[lllIllIllIll[18]] = lIIIllIlIlIIlll("iH6mv4Dv/YWrWsLjOgvVyA5ZnpXF66b4", "tiYYM");
        lllIllIllIIl[lllIllIllIll[19]] = lIIIllIlIlIlIII("PwUaCCM/VR0bMClVHBQgKRYBHyJsDBoP", "LuuzF");
        lllIllIllIIl[lllIllIllIll[20]] = lIIIllIlIlIlIII("MDsvRDoNNCIQGQUhL0MHRDokAhEHJyMLGkQ7KxdUEzw4ClQLNSw=", "dSJdt");
        lllIllIllIIl[lllIllIllIll[21]] = lIIIllIlIlIIlll("gamWMh9L8PQAImrM8zkXZPJ1G3A5MEMF", "YjdxQ");
        lllIllIllIIl[lllIllIllIll[22]] = lIIIllIlIlIIllI("cIApoIzDVpSrFLJLuzjELoWwC5/bOcL03QaKivHEBokmixyeRj9uYfGztAOcaN8yhoXdp5vpyb8=", "wgOms");
        lllIllIllIIl[lllIllIllIll[23]] = lIIIllIlIlIIllI("DQW0+0RQMXKrCsHPPSXwRMqTdYiPZyQa8G4yfare0OvsrCpmk9SPY8GDGvxX9TKQP3lstqvjNlxh6G0zyrVddxv/HKYCQPSk", "ovpjX");
        lllIllIllIIl[lllIllIllIll[24]] = lIIIllIlIlIlIII("DRoWC0oyHBUMSj0OVkcFMBYIBgYqUxsRDzQSHQJKMhoXAlBmCAc=", "Fszgj");
        lllIllIllIIl[lllIllIllIll[25]] = lIIIllIlIlIIllI("VG+WmXh3toxyffwks/7MAA==", "DMznU");
        lllIllIllIIl[lllIllIllIll[26]] = lIIIllIlIlIIlll("vuQQ53eLePyujPqCiC5uilpNN8vq1G8o8yKiaM+bZFGRnEvhhWt7Ag==", "XXLrm");
        lllIllIllIIl[lllIllIllIll[27]] = lIIIllIlIlIIlll("CqZc6rT8vvLVQogPjx6fS1ED65DFiphQ+RrPKrspukP+Oxq1ZosJ2ld3eQlPCSED", "ddjcf");
        lllIllIllIIl[lllIllIllIll[28]] = lIIIllIlIlIIlll("QVWkIfN5cKmwzwZKt/t8hb9vo+94QxKU1w9Efu3266Rp1uuBOS/LbT6o/fjdCbPgGLBw9TpNRvXvKtNED0OEwkr+MoYO2h/RE1JuNTMEIDw=", "hrDJJ");
        lllIllIllIIl[lllIllIllIll[29]] = lIIIllIlIlIIlll("islSDLk93oDKEQZqR/otLQ==", "BEWWh");
        lllIllIllIIl[lllIllIllIll[30]] = lIIIllIlIlIlIII("JBg8DTQ=", "auLyM");
        lllIllIllIIl[lllIllIllIll[31]] = lIIIllIlIlIIlll("goJNL+0aWlAKuEULZDCaKEbmwLNmuoSeC+yvwbj3fjQF9b7/pvKJwztboGLGy4BDv0fgjYYjuO/LNibpYfzNpGkgWsv9PdlEvZElN0p76Fc=", "VlSNk");
        lllIllIllIIl[lllIllIllIll[32]] = lIIIllIlIlIlIII("Jhcn", "cvSzZ");
        lllIllIllIIl[lllIllIllIll[33]] = lIIIllIlIlIIllI("btrACiFUT5g=", "esayJ");
        lllIllIllIIl[lllIllIllIll[34]] = lIIIllIlIlIlIII("CAEMAwcqCUsNAGhOGQEdIRpLUgZkAgQDTiICCgNA", "Dnkdn");
        lllIllIllIIl[lllIllIllIll[35]] = lIIIllIlIlIlIII("OyseOjUoIxAlOA==", "ZEyVP");
        lllIllIllIIl[lllIllIllIll[36]] = lIIIllIlIlIlIII("MCoKBCkjIgQbJA==", "QDmhL");
        lllIllIllIIl[lllIllIllIll[37]] = lIIIllIlIlIIlll("SUN3P7C7WLU=", "CCyTm");
        lllIllIllIIl[lllIllIllIll[38]] = lIIIllIlIlIlIII("CQYODRw=", "Mtgcw");
        lllIllIllIIl[lllIllIllIll[39]] = lIIIllIlIlIIllI("C4167UJqTtpgYbJf9/G7uSWN2kU5m6gC", "BVKff");
        lllIllIllIIl[lllIllIllIll[40]] = lIIIllIlIlIIlll("+6SZDCeR7HQ=", "maRTx");
        lllIllIllIIl[lllIllIllIll[41]] = lIIIllIlIlIlIII("DQcx", "HfEKO");
        lllIllIllIIl[lllIllIllIll[42]] = lIIIllIlIlIIllI("JN72Q/LnV2v+A1+pcaYKJA==", "twNxg");
        lllIllIllIIl[lllIllIllIll[43]] = lIIIllIlIlIIllI("E7HYx+2wuVPNPD86ncv3bg==", "rEOxX");
        lllIllIllIIl[lllIllIllIll[44]] = lIIIllIlIlIlIII("IhkCKwZxHwY8ET8LBiY=", "QlrNt");
        lllIllIllIIl[lllIllIllIll[45]] = lIIIllIlIlIIlll("mV+3qF/cAtU=", "ExKHF");
        lllIllIllIIl[lllIllIllIll[6]] = lIIIllIlIlIlIII("EBQIFwoU", "cufqo");
        lllIllIllIIl[lllIllIllIll[56]] = lIIIllIlIlIIllI("/YerLGhGkPI=", "XfwVs");
        lllIllIllIIl[lllIllIllIll[78]] = lIIIllIlIlIlIII("eklDQGc=", "IgwnU");
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
        j();
        this.av += lllIllIllIll[0];
        i();
    }

    public void b(int i2) {
        this.ae = i2;
    }

    public void d(boolean z2) {
        this.ap = z2;
    }

    public boolean av() {
        return this.aU;
    }

    public boolean G() {
        return this.aC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int[] iArr = new int[lllIllIllIll[0]];
        iArr[lllIllIllIll[1]] = lllIllIllIll[2];
        if (lIIIllIlIlIlllI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllIllIllIll[0]];
            iArr2[lllIllIllIll[1]] = lllIllIllIll[3];
            if (lIIIllIlIlIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lllIllIllIll[0]];
                iArr3[lllIllIllIll[1]] = lllIllIllIll[2];
                Item first = Inventory.getFirst(iArr3);
                int[] iArr4 = new int[lllIllIllIll[0]];
                iArr4[lllIllIllIll[1]] = lllIllIllIll[3];
                first.useOn(Inventory.getFirst(iArr4));
                return;
            }
        }
        if (lIIIllIlIlIllll(Static.getClient().getFollower())) {
            NPC follower = Static.getClient().getFollower();
            if (lIIIllIlIlIlllI(Inventory.isFull() ? 1 : 0) && lIIIllIlIlIllll(Inventory.getFirst(item -> {
                String[] strArr = new String[lllIllIllIll[0]];
                strArr[lllIllIllIll[1]] = lllIllIllIIl[lllIllIllIll[41]];
                return item.hasAction(strArr);
            }))) {
                Inventory.getFirst(item2 -> {
                    String[] strArr = new String[lllIllIllIll[0]];
                    strArr[lllIllIllIll[1]] = lllIllIllIIl[lllIllIllIll[40]];
                    return item2.hasAction(strArr);
                }).interact(lllIllIllIIl[lllIllIllIll[1]]);
                return;
            }
            String[] strArr = new String[lllIllIllIll[0]];
            strArr[lllIllIllIll[1]] = lllIllIllIIl[lllIllIllIll[0]];
            if (lIIIllIlIlIlllI(follower.hasAction(strArr) ? 1 : 0)) {
                follower.interact(lllIllIllIIl[lllIllIllIll[4]]);
            }
        }
        if (lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            if (lIIIllIlIlIlllI(O() ? 1 : 0)) {
                Log.warn(lllIllIllIIl[lllIllIllIll[5]]);
                b((boolean) lllIllIllIll[0]);
                h((boolean) lllIllIllIll[1]);
                return;
            }
            return;
        }
        if (lIIIllIlIllIIIl(this.aJ)) {
            this.aE = lllIllIllIll[0];
            this.aJ -= lllIllIllIll[0];
        }
        if (lIIIllIlIllIIII(this.aJ)) {
            this.aE = lllIllIllIll[1];
            this.Y.clear();
        }
        if (lIIIllIlIllIIIl(this.aQ)) {
            this.aQ -= lllIllIllIll[0];
        }
        if (lIIIllIlIllIIIl(this.aN)) {
            this.aN -= lllIllIllIll[0];
        }
        if (lIIIllIlIllIIII(this.aN)) {
            this.aM = lllIllIllIll[1];
            this.aj = null;
            this.aD = null;
        }
        this.ba -= lllIllIllIll[0];
        if (lIIIllIlIlIllll(this.bb) && lIIIllIlIllIIII(this.ba)) {
            this.bb = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    protected void onStart() {
        j();
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
        n(lllIllIllIll[1]);
        this.aK = lllIllIllIll[1];
        this.aM = lllIllIllIll[1];
        this.Y.clear();
        this.aJ = lllIllIllIll[1];
        this.ad = lllIllIllIll[1];
        this.ai = new ArrayList();
        a.debug(lllIllIllIIl[lllIllIllIll[7]]);
        j(lllIllIllIll[46]);
        this.ax.add(this.ay);
        "".length();
        this.ar = lllIllIllIll[1];
        this.az = Instant.now();
        this.aq = new HashSet<>();
        this.ag = new C0005b(this);
        this.aN = lllIllIllIll[1];
        this.aE = lllIllIllIll[1];
        this.aM = lllIllIllIll[1];
        this.ax.add(this.aP);
        "".length();
        this.ad = lllIllIllIll[1];
        if (lIIIllIlIllIIll(TileObjects.getNearest(tileObject -> {
            return tileObject.getName().contains(lllIllIllIIl[lllIllIllIll[39]]);
        }))) {
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

    private static boolean lIIIllIlIllIIIl(int i2) {
        return i2 > 0;
    }

    public List<WorldPoint> Y() {
        return this.Y;
    }

    private void i() {
        if (lIIIllIlIllIIll(this.be)) {
            a.info(lllIllIllIIl[lllIllIllIll[23]]);
            return;
        }
        Duration between = Duration.between(this.be, Instant.now());
        if (lIIIllIlIllIlIl(this.bg.size(), lllIllIllIll[13])) {
            this.bg.poll();
            "".length();
        }
        this.bg.add(between);
        "".length();
        a.info(lllIllIllIIl[lllIllIllIll[24]], Long.valueOf(between.toSeconds()), Double.valueOf(this.bg.stream().mapToLong((v0) -> {
            return v0.toSeconds();
        }).average().orElse(0.0d)));
        this.be = null;
        this.bd = null;
    }

    public HashSet<Integer> B() {
        return this.aq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean l() {
        if (lIIIllIlIlIllll(TileObjects.getNearest(tileObject -> {
            if (lIIIllIlIlIlllI(tileObject.getName().toLowerCase().contains(lllIllIllIIl[lllIllIllIll[37]]) ? 1 : 0)) {
                String[] strArr = new String[lllIllIllIll[0]];
                strArr[lllIllIllIll[1]] = lllIllIllIIl[lllIllIllIll[38]];
                if (lIIIllIlIlIlllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lllIllIllIll[0];
                    "".length();
                    return 0 != 0 ? ((144 ^ 171) ^ (129 ^ 171)) & (((12 ^ 1) ^ (181 ^ 169)) ^ (-" ".length())) : r0;
                }
            }
            return lllIllIllIll[1];
        }))) {
            ?? r0 = lllIllIllIll[0];
            "".length();
            return (-(122 ^ 126)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIllIllIll[1];
    }

    public void a(boolean z2) {
        this.ac = z2;
    }

    public void a(BankLoadout bankLoadout) {
        this.an = bankLoadout;
    }

    public void e(boolean z2) {
        this.at = z2;
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

    public void a(long j2) {
        this.al = j2;
    }

    public boolean A() {
        return this.ap;
    }

    public void b(boolean z2) {
        this.ad = z2;
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        if (!lIIIllIlIllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lIIIllIlIlIlllI(chatMessage.getMessage().contains(lllIllIllIIl[lllIllIllIll[25]]) ? 1 : 0)) {
            String str = lllIllIllIIl[lllIllIllIll[26]];
            Object[] objArr = new Object[lllIllIllIll[0]];
            objArr[lllIllIllIll[1]] = Integer.valueOf(this.aZ);
            Log.info(str, objArr);
            g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean n() {
        if (lIIIllIlIllIlIl(this.aw.rechargeStaffAt(), lllIllIllIll[46])) {
            return lllIllIllIll[1];
        }
        if (!lIIIllIlIllIlII(N.ch(), lllIllIllIll[46]) || lIIIllIlIlllIIl(N.ch(), this.aw.rechargeStaffAt())) {
            ?? r0 = lllIllIllIll[0];
            "".length();
            return "   ".length() <= ((158 ^ 150) & ((139 ^ 131) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIllIllIll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0) || lIIIllIlIllIIll(d())) {
            return;
        }
        Projectile projectile = projectileSpawned.getProjectile();
        if (lIIIllIlIllIlIl(projectile.getId(), lllIllIllIll[54])) {
            this.bc = lllIllIllIll[0];
            Movement.setDestination(Players.getLocal().getWorldLocation());
        }
    }

    public void g(int i2) {
        this.aS = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v52, types: [boolean] */
    @Subscribe
    private void a(ChatMessage chatMessage) {
        if (lIIIllIlIllIllI(chatMessage.getType(), ChatMessageType.WELCOME)) {
            Log.info(lllIllIllIIl[lllIllIllIll[8]]);
            g((boolean) lllIllIllIll[1]);
        }
        if (lIIIllIlIllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (lIIIllIlIlIlllI(chatMessage.getMessage().contains(lllIllIllIIl[lllIllIllIll[9]]) ? 1 : 0)) {
            Log.info(lllIllIllIIl[lllIllIllIll[10]]);
            this.aC = lllIllIllIll[0];
        }
        String message = chatMessage.getMessage();
        if (!lIIIllIlIllIIII(message.contains(lllIllIllIIl[lllIllIllIll[11]]) ? 1 : 0) || lIIIllIlIlIlllI(message.contains(lllIllIllIIl[lllIllIllIll[12]]) ? 1 : 0)) {
            a.info(lllIllIllIIl[lllIllIllIll[13]]);
            this.bd = Instant.now();
            this.be = this.bd;
        }
        if (!lIIIllIlIllIIII(message.contains(lllIllIllIIl[lllIllIllIll[14]]) ? 1 : 0) || lIIIllIlIlIlllI(message.contains(lllIllIllIIl[lllIllIllIll[15]]) ? 1 : 0)) {
            this.ar = lllIllIllIll[0];
            b((boolean) lllIllIllIll[1]);
            String str = lllIllIllIIl[lllIllIllIll[16]];
            Object[] objArr = new Object[lllIllIllIll[0]];
            objArr[lllIllIllIll[1]] = message;
            Log.info(str, objArr);
        }
        if (lIIIllIlIlIlllI(message.contains(lllIllIllIIl[lllIllIllIll[17]]) ? 1 : 0)) {
            n(lllIllIllIll[0]);
        }
        if (lIIIllIlIlIlllI(message.contains(lllIllIllIIl[lllIllIllIll[18]]) ? 1 : 0)) {
            n(lllIllIllIll[1]);
        }
        if (lIIIllIlIlIlllI(message.contains(lllIllIllIIl[lllIllIllIll[19]]) ? 1 : 0)) {
            o(lllIllIllIll[0]);
            this.aR += lllIllIllIll[0];
        }
        if (lIIIllIlIlIlllI(message.contains(lllIllIllIIl[lllIllIllIll[20]]) ? 1 : 0)) {
            o(lllIllIllIll[1]);
        }
    }

    public SquireNightmareConfig ag() {
        return this.aw;
    }

    public void k(boolean z2) {
        this.ar = z2;
    }

    public void c(int i2) {
        this.av = i2;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    private void j() {
        if (lIIIllIlIlIlllI(this.aw.useFireSpells() ? 1 : 0)) {
            t(lllIllIllIll[0]);
        }
        this.ap = lllIllIllIll[1];
        n(lllIllIllIll[1]);
        this.aK = lllIllIllIll[1];
        this.bd = null;
        this.be = null;
        this.aI = lllIllIllIll[1];
        this.bc = lllIllIllIll[1];
        this.aM = lllIllIllIll[1];
        this.Y.clear();
        this.aJ = lllIllIllIll[1];
        this.aW = Integer.valueOf(lllIllIllIll[1]);
        this.aV = Integer.valueOf(lllIllIllIll[1]);
        this.aq = new HashSet<>();
        this.ag = new C0007d(this);
        j(lllIllIllIll[46]);
        this.aX = lllIllIllIll[1];
        this.ba = lllIllIllIll[1];
        this.bb = null;
        this.aZ = lllIllIllIll[0];
    }

    public int af() {
        return this.av;
    }

    public void h(boolean z2) {
        this.aX = z2;
    }

    public void a(Instant instant) {
        this.az = instant;
    }

    public WorldArea aj() {
        return this.aD;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lllIllIllIll[6]];
        clsArr[lllIllIllIll[1]] = C0004ad.class;
        clsArr[lllIllIllIll[0]] = ax.class;
        clsArr[lllIllIllIll[4]] = ay.class;
        clsArr[lllIllIllIll[5]] = aw.class;
        clsArr[lllIllIllIll[7]] = at.class;
        clsArr[lllIllIllIll[8]] = ae.class;
        clsArr[lllIllIllIll[9]] = ah.class;
        clsArr[lllIllIllIll[10]] = ai.class;
        clsArr[lllIllIllIll[11]] = aj.class;
        clsArr[lllIllIllIll[12]] = af.class;
        clsArr[lllIllIllIll[13]] = ag.class;
        clsArr[lllIllIllIll[14]] = an.class;
        clsArr[lllIllIllIll[15]] = C0001aa.class;
        clsArr[lllIllIllIll[16]] = ao.class;
        clsArr[lllIllIllIll[17]] = ap.class;
        clsArr[lllIllIllIll[18]] = as.class;
        clsArr[lllIllIllIll[19]] = aq.class;
        clsArr[lllIllIllIll[20]] = ar.class;
        clsArr[lllIllIllIll[21]] = aA.class;
        clsArr[lllIllIllIll[22]] = aD.class;
        clsArr[lllIllIllIll[23]] = C0002ab.class;
        clsArr[lllIllIllIll[24]] = W.class;
        clsArr[lllIllIllIll[25]] = X.class;
        clsArr[lllIllIllIll[26]] = G.class;
        clsArr[lllIllIllIll[27]] = O.class;
        clsArr[lllIllIllIll[28]] = K.class;
        clsArr[lllIllIllIll[29]] = M.class;
        clsArr[lllIllIllIll[30]] = E.class;
        clsArr[lllIllIllIll[31]] = J.class;
        clsArr[lllIllIllIll[32]] = P.class;
        clsArr[lllIllIllIll[33]] = H.class;
        clsArr[lllIllIllIll[34]] = I.class;
        clsArr[lllIllIllIll[35]] = Q.class;
        clsArr[lllIllIllIll[36]] = T.class;
        clsArr[lllIllIllIll[37]] = V.class;
        clsArr[lllIllIllIll[38]] = U.class;
        clsArr[lllIllIllIll[39]] = R.class;
        clsArr[lllIllIllIll[40]] = az.class;
        clsArr[lllIllIllIll[41]] = C0003ac.class;
        clsArr[lllIllIllIll[42]] = Z.class;
        clsArr[lllIllIllIll[43]] = aB.class;
        clsArr[lllIllIllIll[44]] = B.class;
        clsArr[lllIllIllIll[45]] = aC.class;
        return clsArr;
    }

    public void a(Prayer prayer) {
        this.bb = prayer;
    }

    public void a(NightmareInfoBox nightmareInfoBox) {
        this.ay = nightmareInfoBox;
    }

    public void f(int i2) {
        this.aR = i2;
    }

    public boolean as() {
        return this.aM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public boolean m() {
        int i2;
        if (lIIIllIlIlIlllI(this.aw.neverTeleport() ? 1 : 0)) {
            return lllIllIllIll[1];
        }
        if (lIIIllIlIlIlllI(this.aw.restoreInPOH() ? 1 : 0) && lIIIllIlIllIIII(l() ? 1 : 0) && lIIIllIlIlIlllI(TeleportLoader.canEnterHouse() ? 1 : 0)) {
            a.info(lllIllIllIIl[lllIllIllIll[27]]);
            TeleportLoader.enterHouse();
            "".length();
            return lllIllIllIll[0];
        }
        if (lIIIllIlIllIllI(this.aw.bankLocation(), EnumC0026w.VER_SINHAZA)) {
            int[] iArr = new int[lllIllIllIll[0]];
            iArr[lllIllIllIll[1]] = lllIllIllIll[3];
            if (lIIIllIlIlIllll(Inventory.getFirst(iArr))) {
                i2 = lllIllIllIll[3];
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i2 = lllIllIllIll[48];
                "".length();
                if ((-" ".length()) != (-" ".length())) {
                    return ((((83 + 124) - 28) + 12) ^ (((74 + 105) - 151) + 105)) & (((((59 + 95) - 56) + 36) ^ (((24 + 54) - 18) + 128)) ^ (-" ".length()));
                }
            }
        } else {
            i2 = lllIllIllIll[48];
        }
        int i3 = i2;
        int[] iArr2 = new int[lllIllIllIll[0]];
        iArr2[lllIllIllIll[1]] = i3;
        Item first = Inventory.getFirst(iArr2);
        if (lIIIllIlIllIIll(first)) {
            int[] iArr3 = new int[lllIllIllIll[0]];
            iArr3[lllIllIllIll[1]] = lllIllIllIll[3];
            first = Inventory.getFirst(iArr3);
        }
        if (lIIIllIlIllIIll(first)) {
            Log.error(lllIllIllIIl[lllIllIllIll[28]]);
            return lllIllIllIll[1];
        }
        k();
        String[] strArr = new String[lllIllIllIll[4]];
        strArr[lllIllIllIll[1]] = lllIllIllIIl[lllIllIllIll[29]];
        strArr[lllIllIllIll[0]] = lllIllIllIIl[lllIllIllIll[30]];
        first.interact(strArr);
        b((boolean) lllIllIllIll[0]);
        p(lllIllIllIll[1]);
        this.ap = lllIllIllIll[0];
        return lllIllIllIll[0];
    }

    public void f(boolean z2) {
        this.au = z2;
    }

    public void a(List<WorldPoint> list) {
        this.ab = list;
    }

    public Future<BankLoadout> v() {
        return this.ak;
    }

    private static boolean lIIIllIlIllIlII(int i2, int i3) {
        return i2 != i3;
    }

    public Future<BankLoadout> x() {
        return this.am;
    }

    public void h(int i2) {
        this.aZ = i2;
    }

    public void j(int i2) {
        this.aA = i2;
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

    public void c(boolean z2) {
        this.ao = z2;
    }

    public RunePouchSetup o() {
        return this.Z;
    }

    public boolean ak() {
        return this.aE;
    }

    private static boolean lIIIllIlIlllIIl(int i2, int i3) {
        return i2 < i3;
    }

    public void l(boolean z2) {
        this.as = z2;
    }

    public void a(WorldPoint worldPoint) {
        this.aH = worldPoint;
    }

    public boolean ae() {
        return this.as;
    }

    public void b(Integer num) {
        this.aW = num;
    }

    public void d(int i2) {
        this.aJ = i2;
    }

    public void a(ItemManager itemManager) {
        this.aT = itemManager;
    }

    public Instant V() {
        return this.be;
    }

    private static boolean lIIIllIlIllIIII(int i2) {
        return i2 == 0;
    }

    public void s(boolean z2) {
        this.aO = z2;
    }

    public void q(boolean z2) {
        this.aK = z2;
    }

    public void e(int i2) {
        this.aQ = i2;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (lIIIllIlIllIIII(Static.getClient().isInInstancedRegion() ? 1 : 0) || lIIIllIlIllIlII(Players.getLocal().getWorldLocation().getPlane(), lllIllIllIll[5]) || lIIIllIlIllIIll(d())) {
            return;
        }
        NPC actor = animationChanged.getActor();
        if (lIIIllIlIlIlllI(actor instanceof Player ? 1 : 0)) {
            return;
        }
        int animation = actor.getAnimation();
        if (lIIIllIlIllIlIl(animation, lllIllIllIll[49]) && lIIIllIlIllIIII(this.aX ? 1 : 0)) {
            if (lIIIllIlIlIlllI(Inventory.isFull() ? 1 : 0) && lIIIllIlIllIIII(this.aX ? 1 : 0) && lIIIllIlIlIlllI(Inventory.contains(item -> {
                return item.getName().toLowerCase().contains(lllIllIllIIl[lllIllIllIll[36]]);
            }) ? 1 : 0)) {
                Log.info(lllIllIllIIl[lllIllIllIll[31]]);
                Inventory.getFirst(item2 -> {
                    return item2.getName().toLowerCase().contains(lllIllIllIIl[lllIllIllIll[35]]);
                }).interact(lllIllIllIIl[lllIllIllIll[32]]);
            }
            this.aX = lllIllIllIll[0];
        } else if (lIIIllIlIllIlIl(animation, lllIllIllIll[50])) {
            this.ba = lllIllIllIll[10];
        } else if (lIIIllIlIllIlIl(animation, lllIllIllIll[51])) {
            this.ba = lllIllIllIll[10];
        } else if (lIIIllIlIllIlIl(animation, lllIllIllIll[52])) {
            this.ba = lllIllIllIll[10];
        } else if (lIIIllIlIllIlIl(animation, lllIllIllIll[53])) {
            this.aX = lllIllIllIll[1];
            f();
        }
    }

    public int Q() {
        return this.aZ;
    }

    public NightmareInfoBox F() {
        return this.ay;
    }

    public void n(boolean z2) {
        this.aF = z2;
    }

    public static WorldPoint e() {
        return (WorldPoint) WorldPoint.toLocalInstance(Static.getClient(), t.toWorld()).stream().min(Comparator.comparingInt(worldPoint -> {
            return worldPoint.distanceTo(Players.getLocal().getWorldLocation());
        })).orElse(null);
    }
}
