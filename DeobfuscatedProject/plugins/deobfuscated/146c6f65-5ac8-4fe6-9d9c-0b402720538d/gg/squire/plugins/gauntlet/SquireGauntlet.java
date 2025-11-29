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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.A;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.B;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.C;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.D;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.E;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.F;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.G;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.H;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.I;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.J;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.K;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.L;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.M;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.N;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.O;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.P;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.Q;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.R;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.S;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.T;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.U;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.V;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.W;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.X;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.Y;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.Z;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.a;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.aa;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.ab;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.o;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.p;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.q;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.r;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.t;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.u;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.v;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.w;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.y;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.z;
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
    private /* synthetic */ b f;
    private /* synthetic */ int k;
    @Inject
    private /* synthetic */ o j;
    private /* synthetic */ long b;
    private /* synthetic */ int m;
    private static /* synthetic */ int[] llIIllIIlIIl;
    private /* synthetic */ Instant q;
    private /* synthetic */ Instant n;
    private /* synthetic */ long s;
    @Inject
    private /* synthetic */ c e;
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
    private /* synthetic */ int l;
    @Inject
    private /* synthetic */ GauntletInfoBox i;

    static {
        SquireGauntlet.llllllIlIIIIIl();
        SquireGauntlet.llllllIlIIIIII();
        a = llIIllIIlIIl[0];
    }

    private static String llllllIIllllIl(String lllllllllllllllIlIIlIllIlIIllIlI, String lllllllllllllllIlIIlIllIlIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIlIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIlIIlIlll.getBytes(StandardCharsets.UTF_8)), llIIllIIlIIl[10]), "DES");
            Cipher lllllllllllllllIlIIlIllIlIIlllII = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIllIlIIlllII.init(llIIllIIlIIl[4], lllllllllllllllIlIIlIllIlIIlllIl);
            return new String(lllllllllllllllIlIIlIllIlIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIllIlIIllIll) {
            lllllllllllllllIlIIlIllIlIIllIll.printStackTrace();
            return null;
        }
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
        void lllllllllllllllIlIIlIllIllIIllll;
        if (SquireGauntlet.llllllIlIIlIIl(configButtonClicked.getGroup().equals(llIIllIIlIII[llIIllIIlIIl[6]]) ? 1 : 0)) {
            return;
        }
        if (SquireGauntlet.llllllIlIIIIlI(lllllllllllllllIlIIlIllIllIIllll.getKey().equals(llIIllIIlIII[llIIllIIlIIl[7]]) ? 1 : 0)) {
            int n2;
            if (SquireGauntlet.llllllIlIIlIIl(a ? 1 : 0)) {
                n2 = llIIllIIlIIl[3];
                0;
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

    private static String llllllIIllllll(String lllllllllllllllIlIIlIllIlIlIllll, String lllllllllllllllIlIIlIllIlIlIlllI) {
        lllllllllllllllIlIIlIllIlIlIllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIllIlIlIllIl = new StringBuilder();
        char[] lllllllllllllllIlIIlIllIlIlIllII = lllllllllllllllIlIIlIllIlIlIlllI.toCharArray();
        int lllllllllllllllIlIIlIllIlIlIlIll = llIIllIIlIIl[0];
        char[] lllllllllllllllIlIIlIllIlIlIIlIl = lllllllllllllllIlIIlIllIlIlIllll.toCharArray();
        int lllllllllllllllIlIIlIllIlIlIIlII = lllllllllllllllIlIIlIllIlIlIIlIl.length;
        int lllllllllllllllIlIIlIllIlIlIIIll = llIIllIIlIIl[0];
        while (SquireGauntlet.llllllIlIIllIl(lllllllllllllllIlIIlIllIlIlIIIll, lllllllllllllllIlIIlIllIlIlIIlII)) {
            char lllllllllllllllIlIIlIllIlIllIIII = lllllllllllllllIlIIlIllIlIlIIlIl[lllllllllllllllIlIIlIllIlIlIIIll];
            lllllllllllllllIlIIlIllIlIlIllIl.append((char)(lllllllllllllllIlIIlIllIlIllIIII ^ lllllllllllllllIlIIlIllIlIlIllII[lllllllllllllllIlIIlIllIlIlIlIll % lllllllllllllllIlIIlIllIlIlIllII.length]));
            0;
            ++lllllllllllllllIlIIlIllIlIlIlIll;
            ++lllllllllllllllIlIIlIllIlIlIIIll;
            0;
            if ((0xC ^ 0x6C ^ (0xD6 ^ 0xB3)) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIllIlIlIllIl);
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
        SquireGauntlet.llIIllIIlIII[SquireGauntlet.llIIllIIlIIl[0]] = SquireGauntlet."Recording change approved";
        SquireGauntlet.llIIllIIlIII[SquireGauntlet.llIIllIIlIIl[3]] = SquireGauntlet."Hunllef kill time";
        SquireGauntlet.llIIllIIlIII[SquireGauntlet.llIIllIIlIIl[4]] = SquireGauntlet."Oh dear, you are dead!";
        SquireGauntlet.llIIllIIlIII[SquireGauntlet.llIIllIIlIIl[6]] = SquireGauntlet."squiregauntlet";
        SquireGauntlet.llIIllIIlIII[SquireGauntlet.llIIllIIlIIl[7]] = SquireGauntlet."pauseTasks";
        SquireGauntlet.llIIllIIlIII[SquireGauntlet.llIIllIIlIIl[1]] = SquireGauntlet."[GAUNTLET] Your authentication has expired, stopping!";
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
        void lllllllllllllllIlIIlIllIllIlIlIl;
        if (SquireGauntlet.llllllIlIIIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && SquireGauntlet.llllllIlIIIlII(chatMessage.getType(), ChatMessageType.SPAM) && SquireGauntlet.llllllIlIIIlII(chatMessage.getType(), ChatMessageType.CONSOLE) && SquireGauntlet.llllllIlIIIlII(chatMessage.getType(), ChatMessageType.ENGINE)) {
            return;
        }
        if (SquireGauntlet.llllllIlIIIIlI(lllllllllllllllIlIIlIllIllIlIlIl.getMessage().contains(llIIllIIlIII[llIIllIIlIIl[3]]) ? 1 : 0)) {
            lllllllllllllllIlIIlIllIllIlIllI.k += llIIllIIlIIl[3];
            lllllllllllllllIlIIlIllIllIlIllI.r += llIIllIIlIIl[3];
        }
        if (SquireGauntlet.llllllIlIIIIlI(lllllllllllllllIlIIlIllIllIlIlIl.getMessage().contains(llIIllIIlIII[llIIllIIlIIl[4]]) ? 1 : 0)) {
            lllllllllllllllIlIIlIllIllIlIllI.l += llIIllIIlIIl[3];
            lllllllllllllllIlIIlIllIllIlIllI.r += llIIllIIlIIl[3];
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
                SquireGauntlet lllllllllllllllIlIIlIllIllIlllll;
                if (!SquireGauntlet.llllllIlIIIIll(lllllllllllllllIlIIlIllIllIlllll.q)) break;
                lllllllllllllllIlIIlIllIllIlllll.q = null;
                lllllllllllllllIlIIlIllIllIlllll.p = llIIllIIlIIl[0];
                0;
                if (1 == 1) break;
                return;
            }
            case 2: 
            case 3: 
            case 4: {
                lllllllllllllllIlIIlIllIllIlllll.p = llIIllIIlIIl[3];
                0;
                if (1 < 3) break;
                return;
            }
            case 5: {
                SquireGauntlet lllllllllllllllIlIIlIllIllIlllll;
                if (!SquireGauntlet.llllllIlIIIIlI(lllllllllllllllIlIIlIllIllIlllll.p ? 1 : 0)) break;
                lllllllllllllllIlIIlIllIllIlllll.q = Instant.now();
                lllllllllllllllIlIIlIllIllIlllll.p = llIIllIIlIIl[0];
            }
        }
    }

    private static String llllllIIlllllI(String lllllllllllllllIlIIlIllIlIllllIl, String lllllllllllllllIlIIlIllIlIllllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIllIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIlIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIllIllIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIllIllIIIIIl.init(llIIllIIlIIl[4], lllllllllllllllIlIIlIllIllIIIIlI);
            return new String(lllllllllllllllIlIIlIllIllIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIllIllIIIIII) {
            lllllllllllllllIlIIlIllIllIIIIII.printStackTrace();
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
        0;
        this.h.remove((Overlay)this.j);
        0;
        this.g.setShowMouseCross(llIIllIIlIIl[3]);
        this.k = llIIllIIlIIl[0];
        this.l = llIIllIIlIIl[0];
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Duration lllllllllllllllIlIIlIllIllIlIIIl;
        SquireGauntlet lllllllllllllllIlIIlIllIllIlIIlI;
        if (SquireGauntlet.llllllIlIIIlIl(this.d.stopAtKc()) && SquireGauntlet.llllllIlIIIllI(this.d.stopAtKc(), this.k)) {
            SquireGauntlet.a(llIIllIIlIIl[3]);
            this.forceStop();
            return;
        }
        if (SquireGauntlet.llllllIlIIIIlI(lllllllllllllllIlIIlIllIllIlIIlI.f() ? 1 : 0)) {
            lllllllllllllllIlIIlIllIllIlIIlI.b = lllllllllllllllIlIIlIllIllIlIIlI.d();
            Executors.newSingleThreadExecutor().submit(lllllllllllllllIlIIlIllIllIlIIlI::e);
            0;
        }
        if (SquireGauntlet.llllllIlIIIlll(lllllllllllllllIlIIlIllIllIlIIlI.q) && SquireGauntlet.llllllIlIIlIII(Game.getState(), GameState.LOGGED_IN)) {
            lllllllllllllllIlIIlIllIllIlIIlI.q = Instant.now();
        }
        if (SquireGauntlet.llllllIlIIIIll(lllllllllllllllIlIIlIllIllIlIIlI.q) && SquireGauntlet.llllllIlIIlIIl((lllllllllllllllIlIIlIllIllIlIIIl = Duration.between(lllllllllllllllIlIIlIllIllIlIIlI.q, Instant.now())).minus(350L, ChronoUnit.MINUTES).isNegative() ? 1 : 0)) {
            Game.logout();
            return;
        }
        if (!SquireGauntlet.llllllIlIIIlII(lllllllllllllllIlIIlIllIllIlIIlI.g.getGameState(), GameState.LOGIN_SCREEN) || SquireGauntlet.llllllIlIIIIlI(a ? 1 : 0)) {
            lllllllllllllllIlIIlIllIllIlIIlI.o += 600L;
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
        classArray[SquireGauntlet.llIIllIIlIIl[0]] = ab.class;
        classArray[SquireGauntlet.llIIllIIlIIl[3]] = p.class;
        classArray[SquireGauntlet.llIIllIIlIIl[4]] = q.class;
        classArray[SquireGauntlet.llIIllIIlIIl[6]] = t.class;
        classArray[SquireGauntlet.llIIllIIlIIl[7]] = u.class;
        classArray[SquireGauntlet.llIIllIIlIIl[1]] = v.class;
        classArray[SquireGauntlet.llIIllIIlIIl[8]] = w.class;
        classArray[SquireGauntlet.llIIllIIlIIl[9]] = y.class;
        classArray[SquireGauntlet.llIIllIIlIIl[10]] = A.class;
        classArray[SquireGauntlet.llIIllIIlIIl[11]] = z.class;
        classArray[SquireGauntlet.llIIllIIlIIl[12]] = D.class;
        classArray[SquireGauntlet.llIIllIIlIIl[13]] = B.class;
        classArray[SquireGauntlet.llIIllIIlIIl[14]] = C.class;
        classArray[SquireGauntlet.llIIllIIlIIl[15]] = E.class;
        classArray[SquireGauntlet.llIIllIIlIIl[16]] = F.class;
        classArray[SquireGauntlet.llIIllIIlIIl[17]] = G.class;
        classArray[SquireGauntlet.llIIllIIlIIl[18]] = H.class;
        classArray[SquireGauntlet.llIIllIIlIIl[19]] = I.class;
        classArray[SquireGauntlet.llIIllIIlIIl[20]] = J.class;
        classArray[SquireGauntlet.llIIllIIlIIl[21]] = N.class;
        classArray[SquireGauntlet.llIIllIIlIIl[22]] = L.class;
        classArray[SquireGauntlet.llIIllIIlIIl[23]] = M.class;
        classArray[SquireGauntlet.llIIllIIlIIl[24]] = O.class;
        classArray[SquireGauntlet.llIIllIIlIIl[25]] = P.class;
        classArray[SquireGauntlet.llIIllIIlIIl[26]] = Q.class;
        classArray[SquireGauntlet.llIIllIIlIIl[27]] = V.class;
        classArray[SquireGauntlet.llIIllIIlIIl[28]] = K.class;
        classArray[SquireGauntlet.llIIllIIlIIl[29]] = R.class;
        classArray[SquireGauntlet.llIIllIIlIIl[30]] = S.class;
        classArray[SquireGauntlet.llIIllIIlIIl[31]] = T.class;
        classArray[SquireGauntlet.llIIllIIlIIl[32]] = U.class;
        classArray[SquireGauntlet.llIIllIIlIIl[33]] = W.class;
        classArray[SquireGauntlet.llIIllIIlIIl[34]] = aa.class;
        classArray[SquireGauntlet.llIIllIIlIIl[35]] = Z.class;
        classArray[SquireGauntlet.llIIllIIlIIl[36]] = Y.class;
        classArray[SquireGauntlet.llIIllIIlIIl[2]] = X.class;
        classArray[SquireGauntlet.llIIllIIlIIl[37]] = r.class;
        return classArray;
    }

    public static void a() {
        if (SquireGauntlet.llllllIlIIIIlI(((RSClient)Static.getClient()).isTesting() ? 1 : 0)) {
            int n2 = Rand.nextInt((int)llIIllIIlIIl[1], (int)llIIllIIlIIl[2]);
            Executors.newSingleThreadScheduledExecutor().schedule(() -> System.exit(llIIllIIlIIl[0]), (long)n2, TimeUnit.MINUTES);
            0;
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
        SquireGauntlet lllllllllllllllIlIIlIllIllIIlIlI;
        int lllllllllllllllIlIIlIllIllIIlIIl;
        int n2 = this.g.getKeyboardIdleTicks();
        if (SquireGauntlet.llllllIlIIllIl(this.g.getMouseIdleTicks(), n2)) {
            lllllllllllllllIlIIlIllIllIIlIIl = this.g.getMouseIdleTicks();
        }
        if (SquireGauntlet.llllllIlIIlllI(SquireGauntlet.llllllIlIIllII(lllllllllllllllIlIIlIllIllIIlIIl, lllllllllllllllIlIIlIllIllIIlIlI.b))) {
            bl = llIIllIIlIIl[3];
            0;
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

    private static void llllllIlIIIIIl() {
        llIIllIIlIIl = new int[42];
        SquireGauntlet.llIIllIIlIIl[0] = (0x82 ^ 0xB8) & ~(0xF9 ^ 0xC3);
        SquireGauntlet.llIIllIIlIIl[1] = 0xCA ^ 0xB0 ^ 125 + 90 - 116 + 28;
        SquireGauntlet.llIIllIIlIIl[2] = 0xE4 ^ 0xC7;
        SquireGauntlet.llIIllIIlIIl[3] = 1;
        SquireGauntlet.llIIllIIlIIl[4] = 2;
        SquireGauntlet.llIIllIIlIIl[5] = 0x5D ^ 0x1E ^ (0x4F ^ 0x29);
        SquireGauntlet.llIIllIIlIIl[6] = 3;
        SquireGauntlet.llIIllIIlIIl[7] = 0x51 ^ 0x29 ^ (0x4D ^ 0x31);
        SquireGauntlet.llIIllIIlIIl[8] = 0x59 ^ 0x5F;
        SquireGauntlet.llIIllIIlIIl[9] = 39 + 61 - -20 + 10 ^ 26 + 52 - 7 + 62;
        SquireGauntlet.llIIllIIlIIl[10] = 0xE5 ^ 0x8F ^ (0x7E ^ 0x1C);
        SquireGauntlet.llIIllIIlIIl[11] = 115 + 127 - 165 + 67 ^ 107 + 90 - 96 + 52;
        SquireGauntlet.llIIllIIlIIl[12] = 0x2B ^ 0x6C ^ (0xD8 ^ 0x95);
        SquireGauntlet.llIIllIIlIIl[13] = 0xB ^ 0;
        SquireGauntlet.llIIllIIlIIl[14] = 0x25 ^ 0x29;
        SquireGauntlet.llIIllIIlIIl[15] = 0x57 ^ 0x5A;
        SquireGauntlet.llIIllIIlIIl[16] = 0x38 ^ 0x3C ^ (0xC ^ 6);
        SquireGauntlet.llIIllIIlIIl[17] = 0x2A ^ 0x40 ^ (0x1D ^ 0x78);
        SquireGauntlet.llIIllIIlIIl[18] = 82 + 5 - 15 + 88 ^ 18 + 126 - 0 + 32;
        SquireGauntlet.llIIllIIlIIl[19] = 0x60 ^ 0x71;
        SquireGauntlet.llIIllIIlIIl[20] = 0x1C ^ 0xE;
        SquireGauntlet.llIIllIIlIIl[21] = 0x4C ^ 0x5F;
        SquireGauntlet.llIIllIIlIIl[22] = 0x93 ^ 0xC7 ^ (0xC9 ^ 0x89);
        SquireGauntlet.llIIllIIlIIl[23] = 101 + 163 - 190 + 100 ^ 49 + 36 - -75 + 27;
        SquireGauntlet.llIIllIIlIIl[24] = 0x90 ^ 0x83 ^ (0xBF ^ 0xBA);
        SquireGauntlet.llIIllIIlIIl[25] = 0x35 ^ 0x75 ^ (0x70 ^ 0x27);
        SquireGauntlet.llIIllIIlIIl[26] = 0x34 ^ 0x2C;
        SquireGauntlet.llIIllIIlIIl[27] = 0xC ^ 0x2F ^ (0x58 ^ 0x62);
        SquireGauntlet.llIIllIIlIIl[28] = 0xA2 ^ 0xB8;
        SquireGauntlet.llIIllIIlIIl[29] = 0x6E ^ 0x75;
        SquireGauntlet.llIIllIIlIIl[30] = 0x2A ^ 0x36;
        SquireGauntlet.llIIllIIlIIl[31] = 0x34 ^ 0x29;
        SquireGauntlet.llIIllIIlIIl[32] = 0x19 ^ 0x50 ^ (4 ^ 0x53);
        SquireGauntlet.llIIllIIlIIl[33] = 0x30 ^ 0x51 ^ (0xF5 ^ 0x8B);
        SquireGauntlet.llIIllIIlIIl[34] = 0xE0 ^ 0x9D ^ (0x45 ^ 0x18);
        SquireGauntlet.llIIllIIlIIl[35] = 0x78 ^ 0x41 ^ (0x50 ^ 0x48);
        SquireGauntlet.llIIllIIlIIl[36] = 0xBB ^ 0x99;
        SquireGauntlet.llIIllIIlIIl[37] = 75 + 137 - 62 + 32 ^ 61 + 119 - 163 + 129;
        SquireGauntlet.llIIllIIlIIl[38] = -(0xFFFFFE4F & 0x77F9) & (0xFFFFFFD9 & 0x77FF);
        SquireGauntlet.llIIllIIlIIl[39] = -(0xFFFFFE3F & 0x53DA) & (0xFFFFDF9D & 0x767B);
        SquireGauntlet.llIIllIIlIIl[40] = 0xFFFFCDB6 & 0x33DB;
        SquireGauntlet.llIIllIIlIIl[41] = -(0xFFFFB7DF & 0x4C6E) & (0xFFFFADFD & 0x57DF);
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
            void lllllllllllllllIlIIlIllIllIllIIl;
            lllllllllllllllIlIIlIllIllIllIIl.setCancelled(llIIllIIlIIl[3]);
            0;
            0;
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

