package gg.squire.minigame;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.minigame.overlay.InfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.p000.p001.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.a;
import l.p000.p001.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.f;
import l.p000.p001.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.g;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.MenuActionProcessed;
import net.unethicalite.api.widgets.Widgets;
@PluginDescriptor(name = "Squire Pest Control", enabledByDefault = false)
/* loaded from: d3ba43e2-4966-4faf-8fcb-fba83fc95121.jar:gg/squire/minigame/SquirePestControl.class */
public class SquirePestControl extends SquirePlugin {
    private /* synthetic */ int j;
    @Inject
    private /* synthetic */ a f;
    private /* synthetic */ int h;
    @Inject
    private /* synthetic */ EventBus d;
    @Inject
    private /* synthetic */ ConfigManager e;
    @Inject
    private /* synthetic */ OverlayManager b;
    @Inject
    private /* synthetic */ InfoBox c;
    private static /* synthetic */ long a;
    private static /* synthetic */ String[] lIIIlIlIIIlIl;
    private static /* synthetic */ int[] lIIIlIlIIIllI;
    private /* synthetic */ int i;
    private /* synthetic */ Instant g;

    private static void lIIllllllIllIlI() {
        lIIIlIlIIIllI = new int[8];
        lIIIlIlIIIllI[0] = (-91) & 4090;
        lIIIlIlIIIllI[1] = (39 ^ 43) & ((178 ^ 190) ^ (-1));
        lIIIlIlIIIllI[2] = (-7745) & 8151;
        lIIIlIlIIIllI[3] = 136 ^ 141;
        lIIIlIlIIIllI[4] = " ".length();
        lIIIlIlIIIllI[5] = "  ".length();
        lIIIlIlIIIllI[6] = "   ".length();
        lIIIlIlIIIllI[7] = (41 ^ 117) ^ (77 ^ 25);
    }

    @Provides
    SquirePestControlConfig a(ConfigManager configManager) {
        return (SquirePestControlConfig) configManager.getConfig(SquirePestControlConfig.class);
    }

    protected void onStart() {
        System.out.println(lIIIlIlIIIlIl[lIIIlIlIIIllI[5]]);
        this.b.add(this.c);
        "".length();
        this.g = Instant.now();
        this.j = lIIIlIlIIIllI[1];
    }

    private static String lIIllllllIllIII(String lllllllllllllllIIIIlllIlIlIIIIlI, String lllllllllllllllIIIIlllIlIlIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIlIlIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIlIlIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIIllI[7]), "DES");
            Cipher lllllllllllllllIIIIlllIlIlIIIlII = Cipher.getInstance("DES");
            lllllllllllllllIIIIlllIlIlIIIlII.init(lIIIlIlIIIllI[5], lllllllllllllllIIIIlllIlIlIIIlIl);
            return new String(lllllllllllllllIIIIlllIlIlIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIlIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllIlIlIIIIll) {
            lllllllllllllllIIIIlllIlIlIIIIll.printStackTrace();
            return null;
        }
    }

    public void c(int i) {
        this.j = i;
    }

    private static boolean lIIllllllIlllII(Object obj) {
        return obj == null;
    }

    private static boolean lIIllllllIlllll(int i, int i2) {
        return i < i2;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIIlIlIIIllI[5]];
        clsArr[lIIIlIlIIIllI[1]] = g.class;
        clsArr[lIIIlIlIIIllI[4]] = f.class;
        return clsArr;
    }

    public void a(int i) {
        this.h = i;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (lIIllllllIllIll(this.j, lIIIlIlIIIllI[0])) {
            System.out.println(lIIIlIlIIIlIl[lIIIlIlIIIllI[1]]);
            forceStop();
        }
        if (lIIllllllIlllII(Widgets.get(lIIIlIlIIIllI[2], lIIIlIlIIIllI[3])) || lIIllllllIlllIl(Widgets.get(lIIIlIlIIIllI[2], lIIIlIlIIIllI[3]).getText().isEmpty() ? 1 : 0)) {
            return;
        }
        this.j = Integer.parseInt(Widgets.get(lIIIlIlIIIllI[2], lIIIlIlIIIllI[3]).getText().split(lIIIlIlIIIlIl[lIIIlIlIIIllI[4]])[lIIIlIlIIIllI[4]]);
        if (!lIIllllllIllllI(b())) {
            this.i = this.j - this.h;
            return;
        }
        a(this.j);
        "".length();
        if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
        }
    }

    public static long a() {
        return a;
    }

    static {
        lIIllllllIllIlI();
        lIIllllllIllIIl();
    }

    public Instant getStarted() {
        return this.g;
    }

    public void b(int i) {
        this.i = i;
    }

    public int c() {
        return this.i;
    }

    private static String lIIllllllIlIlll(String lllllllllllllllIIIIlllIlIIllIIlI, String lllllllllllllllIIIIlllIlIIllIIIl) {
        String lllllllllllllllIIIIlllIlIIllIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllIlIIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlllIlIIllIIII = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlllIlIIllIIIl.toCharArray();
        int lllllllllllllllIIIIlllIlIIlIlllI = lIIIlIlIIIllI[1];
        char[] charArray2 = lllllllllllllllIIIIlllIlIIllIIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIIIlIlIIIllI[1];
        while (lIIllllllIlllll(i, length)) {
            lllllllllllllllIIIIlllIlIIllIIII.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIIIlllIlIIlIlllI % charArray.length]));
            "".length();
            lllllllllllllllIIIIlllIlIIlIlllI++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlllIlIIllIIII);
    }

    private static boolean lIIllllllIllIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIllllllIlllIl(int i) {
        return i != 0;
    }

    public int d() {
        return this.j;
    }

    public int b() {
        return this.h;
    }

    @Subscribe
    public void a(MenuActionProcessed menuActionProcessed) {
        System.out.println(menuActionProcessed);
    }

    private static void lIIllllllIllIIl() {
        lIIIlIlIIIlIl = new String[lIIIlIlIIIllI[6]];
        lIIIlIlIIIlIl[lIIIlIlIIIllI[1]] = lIIllllllIlIlll("MSI3PzkLOD9vOgEkMT89TnYhIDxCNyoqaQMieCIoGnYoICAMIis=", "bVXOI");
        lIIIlIlIIIlIl[lIIIlIlIIIllI[4]] = lIIllllllIlIlll("aWg=", "SHRPv");
        lIIIlIlIIIlIl[lIIIlIlIIIllI[5]] = lIIllllllIllIII("phy2pjXBl/a/GFRy2u1omgBpYS20T1VgaJbf8XwKVSo=", "ojxDI");
    }

    private static boolean lIIllllllIllllI(int i) {
        return i == 0;
    }

    protected void onStop() {
        this.b.remove(this.c);
        "".length();
    }
}
