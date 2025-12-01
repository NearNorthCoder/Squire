package gg.squire.plugins.gauntlet;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.core.loader.net.NetUtils;
import gg.squire.client.event.RecordingChangeRequested;
import gg.squire.client.plugins.SquirePlugin;
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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.A;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.B;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0000a;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0001b;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0002c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0014o;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0015p;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0016q;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0017r;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0019t;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0020u;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0021v;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0022w;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0024y;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.C0025z;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.D;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.E;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.F;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.G;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.H;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.I;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.J;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.K;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.L;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.M;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.N;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.O;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.P;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.Q;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.R;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.S;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.T;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.U;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.V;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.W;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.X;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.Y;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.Z;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.aa;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.ab;
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
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;
@PluginDescriptor(name = "Squire Gauntlet", enabledByDefault = false)
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:gg/squire/plugins/gauntlet/SquireGauntlet.class */
public class SquireGauntlet extends SquirePlugin {
    @Inject
    private /* synthetic */ C0001b f;
    @Inject
    private /* synthetic */ C0014o j;
    private static /* synthetic */ int[] llIIllIIlIIl;
    private /* synthetic */ Instant q;

    /* renamed from: n  reason: collision with root package name */
    private /* synthetic */ Instant f0n;
    private /* synthetic */ long s;
    @Inject
    private /* synthetic */ C0002c e;
    @Inject
    private /* synthetic */ OverlayManager h;
    private /* synthetic */ boolean p;
    @Inject
    private /* synthetic */ GauntletConfig d;
    @Inject
    private /* synthetic */ Client g;
    @Inject
    private /* synthetic */ ExecutorService c;
    private static /* synthetic */ String[] llIIllIIlIII;
    private static /* synthetic */ boolean a;
    private /* synthetic */ long o;
    private /* synthetic */ int r;
    @Inject
    private /* synthetic */ GauntletInfoBox i;
    private /* synthetic */ long b = 0;
    private /* synthetic */ int k = llIIllIIlIIl[0];
    private /* synthetic */ int l = llIIllIIlIIl[0];
    private /* synthetic */ int m = llIIllIIlIIl[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        llllllIlIIIIIl();
        llllllIlIIIIII();
        a = llIIllIIlIIl[0];
    }

    private static String llllllIIllllIl(String lllllllllllllllIlIIlIllIlIIllIII, String lllllllllllllllIlIIlIllIlIIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIlIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIlIIllIIl.getBytes(StandardCharsets.UTF_8)), llIIllIIlIIl[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIllIIlIIl[4], lllllllllllllllIlIIlIllIlIIlllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllIlIIllIll) {
            lllllllllllllllIlIIlIllIlIIllIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    private void b() {
        this.p = llIIllIIlIIl[0];
        this.k = llIIllIIlIIl[0];
        this.l = llIIllIIlIIl[0];
        this.m = llIIllIIlIIl[0];
        this.r = llIIllIIlIIl[0];
        this.o = 0L;
        this.f0n = Instant.now();
        a = llIIllIIlIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        boolean z;
        if (!llllllIlIIlIIl(configButtonClicked.getGroup().equals(llIIllIIlIII[llIIllIIlIIl[6]]) ? 1 : 0) && llllllIlIIIIlI(configButtonClicked.getKey().equals(llIIllIIlIII[llIIllIIlIIl[7]]) ? 1 : 0)) {
            if (llllllIlIIlIIl(a ? 1 : 0)) {
                int i = llIIllIIlIIl[3];
                "".length();
                z = i;
                if (((64 ^ 28) & ((98 ^ 62) ^ (-1))) < 0) {
                    return;
                }
            } else {
                z = llIIllIIlIIl[0];
            }
            a = z;
            a(a);
        }
    }

    private static int llllllIlIIllII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean llllllIlIIIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private long d() {
        return (long) a(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0d));
    }

    private static boolean llllllIlIIIllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean llllllIlIIIIlI(int i) {
        return i != 0;
    }

    private static String llllllIIllllll(String lllllllllllllllIlIIlIllIlIlIllll, String lllllllllllllllIlIIlIllIlIlIlllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlIllIlIlIlllI.toCharArray();
        int lllllllllllllllIlIIlIllIlIlIlIll = llIIllIIlIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIllIIlIIl[0];
        while (llllllIlIIllIl(i, length)) {
            char lllllllllllllllIlIIlIllIlIllIIII = charArray2[i];
            sb.append((char) (lllllllllllllllIlIIlIllIlIllIIII ^ charArray[lllllllllllllllIlIIlIllIlIlIlIll % charArray.length]));
            "".length();
            lllllllllllllllIlIIlIllIlIlIlIll++;
            i++;
            "".length();
            if (((12 ^ 108) ^ (214 ^ 179)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public int i() {
        return this.k;
    }

    private static boolean llllllIlIIIIll(Object obj) {
        return obj != null;
    }

    private static boolean llllllIlIIlIIl(int i) {
        return i == 0;
    }

    private static boolean llllllIlIIIlll(Object obj) {
        return obj == null;
    }

    private static void llllllIlIIIIII() {
        llIIllIIlIII = new String[llIIllIIlIIl[8]];
        llIIllIIlIII[llIIllIIlIIl[0]] = llllllIIllllIl("JGXhxEYcPHnhixzUrD2bioThj6JsZCZ8LhayKveAaRQ=", "QIPHh");
        llIIllIIlIII[llIIllIIlIIl[3]] = llllllIIlllllI("OwM19Sat+NN9bCzgofFpOQGxuFbkB6zV", "gPXTI");
        llIIllIIlIII[llIIllIIlIIl[4]] = llllllIIlllllI("g2bZhtZwDPGKMfaP0mIqtsZnBL9lklzy", "kgoVJ");
        llIIllIIlIII[llIIllIIlIIl[6]] = llllllIIllllll("Nz0PIAAhKxs8HDAgHz0=", "DLzIr");
        llIIllIIlIII[llIIllIIlIIl[7]] = llllllIIllllIl("1bCgpFDvFldj8Yk7avcATA==", "ZuSlu");
        llIIllIIlIII[llIIllIIlIIl[1]] = llllllIIllllll("CB0QIB0HFhQhDnMDPgAhczskATs2NCUcMDIuOBo9czIwBnM2IiEcITY+fVUgJzUhBTo9PXA=", "SZQuS");
    }

    private static boolean llllllIlIIlllI(int i) {
        return i >= 0;
    }

    public GauntletConfig h() {
        return this.d;
    }

    private void e() {
        this.g.getCanvas().dispatchEvent(new KeyEvent(this.g.getCanvas(), llIIllIIlIIl[38], System.currentTimeMillis(), llIIllIIlIIl[39], llIIllIIlIIl[10]));
        this.g.getCanvas().dispatchEvent(new KeyEvent(this.g.getCanvas(), llIIllIIlIIl[40], System.currentTimeMillis(), llIIllIIlIIl[0], llIIllIIlIIl[10]));
        this.g.getCanvas().dispatchEvent(new KeyEvent(this.g.getCanvas(), llIIllIIlIIl[41], System.currentTimeMillis(), llIIllIIlIIl[0], llIIllIIlIIl[10]));
    }

    private static boolean llllllIlIIllIl(int i, int i2) {
        return i < i2;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llllllIlIIIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && llllllIlIIIlII(chatMessage.getType(), ChatMessageType.SPAM) && llllllIlIIIlII(chatMessage.getType(), ChatMessageType.CONSOLE) && llllllIlIIIlII(chatMessage.getType(), ChatMessageType.ENGINE)) {
            return;
        }
        if (llllllIlIIIIlI(chatMessage.getMessage().contains(llIIllIIlIII[llIIllIIlIIl[3]]) ? 1 : 0)) {
            this.k += llIIllIIlIIl[3];
            this.r += llIIllIIlIIl[3];
        }
        if (llllllIlIIIIlI(chatMessage.getMessage().contains(llIIllIIlIII[llIIllIIlIIl[4]]) ? 1 : 0)) {
            this.l += llIIllIIlIIl[3];
            this.r += llIIllIIlIIl[3];
        }
    }

    protected void onStart() {
        b();
        this.f0n = Instant.now();
        this.f.x();
        this.e.x();
        this.h.add(this.i);
        "".length();
        this.h.add(this.j);
        "".length();
        Executors.newSingleThreadExecutor().submit(SquireGauntlet::a);
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        switch (C0000a.t[gameStateChanged.getGameState().ordinal()]) {
            case 1:
                if (llllllIlIIIIll(this.q)) {
                    this.q = null;
                    this.p = llIIllIIlIIl[0];
                    "".length();
                    if (" ".length() != " ".length()) {
                        return;
                    }
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
                this.p = llIIllIIlIIl[3];
                "".length();
                if (" ".length() >= "   ".length()) {
                    return;
                }
                return;
            case 5:
                if (llllllIlIIIIlI(this.p ? 1 : 0)) {
                    this.q = Instant.now();
                    this.p = llIIllIIlIIl[0];
                    return;
                }
                return;
            default:
                return;
        }
    }

    private static String llllllIIlllllI(String lllllllllllllllIlIIlIllIlIllllll, String lllllllllllllllIlIIlIllIlIlllllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIllIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIlIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllIIlIIl[4], lllllllllllllllIlIIlIllIllIIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllIllIIIIII) {
            lllllllllllllllIlIIlIllIllIIIIII.printStackTrace();
            return null;
        }
    }

    public static void a(boolean z) {
        a = z;
    }

    private double a(double d) {
        return Math.max(1.0d, Math.min(13000.0d, d));
    }

    public static boolean g() {
        return a;
    }

    private static boolean llllllIlIIIlIl(int i) {
        return i > 0;
    }

    public void a(int i) {
        this.m = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    protected void onStop() {
        b();
        this.f.y();
        this.e.y();
        this.h.remove(this.i);
        "".length();
        this.h.remove(this.j);
        "".length();
        this.g.setShowMouseCross((boolean) llIIllIIlIIl[3]);
        this.k = llIIllIIlIIl[0];
        this.l = llIIllIIlIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (llllllIlIIIlIl(this.d.stopAtKc()) && llllllIlIIIllI(this.d.stopAtKc(), this.k)) {
            a((boolean) llIIllIIlIIl[3]);
            forceStop();
            return;
        }
        if (llllllIlIIIIlI(f() ? 1 : 0)) {
            this.b = d();
            Executors.newSingleThreadExecutor().submit(this::e);
            "".length();
        }
        if (llllllIlIIIlll(this.q) && llllllIlIIlIII(Game.getState(), GameState.LOGGED_IN)) {
            this.q = Instant.now();
        }
        if (llllllIlIIIIll(this.q) && llllllIlIIlIIl(Duration.between(this.q, Instant.now()).minus(350L, ChronoUnit.MINUTES).isNegative() ? 1 : 0)) {
            Game.logout();
        } else if (!llllllIlIIIlII(this.g.getGameState(), GameState.LOGIN_SCREEN) || llllllIlIIIIlI(a ? 1 : 0)) {
            this.o += 600;
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
        Class<?>[] clsArr = new Class[llIIllIIlIIl[5]];
        clsArr[llIIllIIlIIl[0]] = ab.class;
        clsArr[llIIllIIlIIl[3]] = C0015p.class;
        clsArr[llIIllIIlIIl[4]] = C0016q.class;
        clsArr[llIIllIIlIIl[6]] = C0019t.class;
        clsArr[llIIllIIlIIl[7]] = C0020u.class;
        clsArr[llIIllIIlIIl[1]] = C0021v.class;
        clsArr[llIIllIIlIIl[8]] = C0022w.class;
        clsArr[llIIllIIlIIl[9]] = C0024y.class;
        clsArr[llIIllIIlIIl[10]] = A.class;
        clsArr[llIIllIIlIIl[11]] = C0025z.class;
        clsArr[llIIllIIlIIl[12]] = D.class;
        clsArr[llIIllIIlIIl[13]] = B.class;
        clsArr[llIIllIIlIIl[14]] = C.class;
        clsArr[llIIllIIlIIl[15]] = E.class;
        clsArr[llIIllIIlIIl[16]] = F.class;
        clsArr[llIIllIIlIIl[17]] = G.class;
        clsArr[llIIllIIlIIl[18]] = H.class;
        clsArr[llIIllIIlIIl[19]] = I.class;
        clsArr[llIIllIIlIIl[20]] = J.class;
        clsArr[llIIllIIlIIl[21]] = N.class;
        clsArr[llIIllIIlIIl[22]] = L.class;
        clsArr[llIIllIIlIIl[23]] = M.class;
        clsArr[llIIllIIlIIl[24]] = O.class;
        clsArr[llIIllIIlIIl[25]] = P.class;
        clsArr[llIIllIIlIIl[26]] = Q.class;
        clsArr[llIIllIIlIIl[27]] = V.class;
        clsArr[llIIllIIlIIl[28]] = K.class;
        clsArr[llIIllIIlIIl[29]] = R.class;
        clsArr[llIIllIIlIIl[30]] = S.class;
        clsArr[llIIllIIlIIl[31]] = T.class;
        clsArr[llIIllIIlIIl[32]] = U.class;
        clsArr[llIIllIIlIIl[33]] = W.class;
        clsArr[llIIllIIlIIl[34]] = aa.class;
        clsArr[llIIllIIlIIl[35]] = Z.class;
        clsArr[llIIllIIlIIl[36]] = Y.class;
        clsArr[llIIllIIlIIl[2]] = X.class;
        clsArr[llIIllIIlIIl[37]] = C0017r.class;
        return clsArr;
    }

    public static void a() {
        if (llllllIlIIIIlI(Static.getClient().isTesting() ? 1 : 0)) {
            Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                System.exit(llIIllIIlIIl[0]);
            }, Rand.nextInt(llIIllIIlIIl[1], llIIllIIlIIl[2]), TimeUnit.MINUTES);
            "".length();
        }
    }

    private static boolean llllllIlIIlIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllllIlIIlIll(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    private boolean f() {
        int keyboardIdleTicks = this.g.getKeyboardIdleTicks();
        if (llllllIlIIllIl(this.g.getMouseIdleTicks(), keyboardIdleTicks)) {
            keyboardIdleTicks = this.g.getMouseIdleTicks();
        }
        if (llllllIlIIlllI(llllllIlIIllII(keyboardIdleTicks, this.b))) {
            ?? r0 = llIIllIIlIIl[3];
            "".length();
            return "   ".length() == (((173 ^ 198) ^ (97 ^ 95)) & (((((203 + 209) - 332) + 166) ^ (((72 + 70) - 9) + 30)) ^ (-" ".length()))) ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
        }
        return llIIllIIlIIl[0];
    }

    public void c() {
        if (llllllIlIIlIll(llllllIlIIlIlI(System.currentTimeMillis() - this.s, 600000L))) {
            return;
        }
        this.s = System.currentTimeMillis();
        this.c.execute(() -> {
            if (llllllIlIIlIIl(NetUtils.confirm(this) ? 1 : 0)) {
                System.out.println(llIIllIIlIII[llIIllIIlIIl[1]]);
                forceStop();
            }
        });
    }

    private static void llllllIlIIIIIl() {
        llIIllIIlIIl = new int[42];
        llIIllIIlIIl[0] = (130 ^ 184) & ((249 ^ 195) ^ (-1));
        llIIllIIlIIl[1] = (202 ^ 176) ^ (((125 + 90) - 116) + 28);
        llIIllIIlIIl[2] = 228 ^ 199;
        llIIllIIlIIl[3] = " ".length();
        llIIllIIlIIl[4] = "  ".length();
        llIIllIIlIIl[5] = (93 ^ 30) ^ (79 ^ 41);
        llIIllIIlIIl[6] = "   ".length();
        llIIllIIlIIl[7] = (81 ^ 41) ^ (77 ^ 49);
        llIIllIIlIIl[8] = 89 ^ 95;
        llIIllIIlIIl[9] = (((39 + 61) - (-20)) + 10) ^ (((26 + 52) - 7) + 62);
        llIIllIIlIIl[10] = (229 ^ 143) ^ (126 ^ 28);
        llIIllIIlIIl[11] = (((115 + 127) - 165) + 67) ^ (((107 + 90) - 96) + 52);
        llIIllIIlIIl[12] = (43 ^ 108) ^ (216 ^ 149);
        llIIllIIlIIl[13] = 11 ^ 0;
        llIIllIIlIIl[14] = 37 ^ 41;
        llIIllIIlIIl[15] = 87 ^ 90;
        llIIllIIlIIl[16] = (56 ^ 60) ^ (12 ^ 6);
        llIIllIIlIIl[17] = (42 ^ 64) ^ (29 ^ 120);
        llIIllIIlIIl[18] = (((82 + 5) - 15) + 88) ^ (((18 + 126) - 0) + 32);
        llIIllIIlIIl[19] = 96 ^ 113;
        llIIllIIlIIl[20] = 28 ^ 14;
        llIIllIIlIIl[21] = 76 ^ 95;
        llIIllIIlIIl[22] = (147 ^ 199) ^ (201 ^ 137);
        llIIllIIlIIl[23] = (((101 + 163) - 190) + 100) ^ (((49 + 36) - (-75)) + 27);
        llIIllIIlIIl[24] = (144 ^ 131) ^ (191 ^ 186);
        llIIllIIlIIl[25] = (53 ^ 117) ^ (112 ^ 39);
        llIIllIIlIIl[26] = 52 ^ 44;
        llIIllIIlIIl[27] = (12 ^ 47) ^ (88 ^ 98);
        llIIllIIlIIl[28] = 162 ^ 184;
        llIIllIIlIIl[29] = 110 ^ 117;
        llIIllIIlIIl[30] = 42 ^ 54;
        llIIllIIlIIl[31] = 52 ^ 41;
        llIIllIIlIIl[32] = (25 ^ 80) ^ (4 ^ 83);
        llIIllIIlIIl[33] = (48 ^ 81) ^ (245 ^ 139);
        llIIllIIlIIl[34] = (224 ^ 157) ^ (69 ^ 24);
        llIIllIIlIIl[35] = (120 ^ 65) ^ (80 ^ 72);
        llIIllIIlIIl[36] = 187 ^ 153;
        llIIllIIlIIl[37] = (((75 + 137) - 62) + 32) ^ (((61 + 119) - 163) + 129);
        llIIllIIlIIl[38] = (-((-433) & 30713)) & (-39) & 30719;
        llIIllIIlIIl[39] = (-((-449) & 21466)) & (-8291) & 30331;
        llIIllIIlIIl[40] = (-12874) & 13275;
        llIIllIIlIIl[41] = (-((-18465) & 19566)) & (-20995) & 22495;
    }

    public void b(int i) {
        this.r = i;
    }

    public Instant getStarted() {
        return this.f0n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Subscribe
    public void a(RecordingChangeRequested recordingChangeRequested) {
        if (llllllIlIIIIll(this.e) && !llllllIlIIIIlI(this.e.A() ? 1 : 0)) {
            System.out.println(llIIllIIlIII[llIIllIIlIIl[0]]);
            return;
        }
        recordingChangeRequested.setCancelled((boolean) llIIllIIlIIl[3]);
        "".length();
        "".length();
        if ((-" ".length()) > " ".length()) {
        }
    }

    @Provides
    GauntletConfig a(ConfigManager configManager) {
        return (GauntletConfig) configManager.getConfig(GauntletConfig.class);
    }

    private static int llllllIlIIlIlI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
