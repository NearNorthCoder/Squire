package squire.gg.hunter;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o.d;
import s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o.i;
import s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o.l;
import s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o.m;
import s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o.n;
import squire.gg.hunter.overlay.HerbiboarInfoBox;
@Extension
@PluginDescriptor(name = "Squire Herbiboar")
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:squire/gg/hunter/SquireHerbiboarPlugin.class */
public class SquireHerbiboarPlugin extends SquirePlugin {
    private /* synthetic */ boolean h;
    private static /* synthetic */ String[] lllIIllIIlll;
    private static final /* synthetic */ Logger a;
    @Inject
    private /* synthetic */ HerbiboarInfoBox e;
    private static /* synthetic */ int[] lllIIllIlIIl;
    @Inject
    private /* synthetic */ OverlayManager f;
    public static /* synthetic */ boolean b;
    @Inject
    private /* synthetic */ EventBus j;
    @Inject
    private /* synthetic */ i i;
    private /* synthetic */ Instant g;
    private /* synthetic */ boolean d;
    private static /* synthetic */ int c;

    @Provides
    SquireHerbiboarConfig a(ConfigManager configManager) {
        return (SquireHerbiboarConfig) configManager.getConfig(SquireHerbiboarConfig.class);
    }

    public Instant getStarted() {
        return this.g;
    }

    public void b(boolean z) {
        this.h = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    protected void onStop() {
        this.g = null;
        this.h = lllIIllIlIIl[1];
        c = lllIIllIlIIl[1];
        this.i.o();
        this.f.remove(this.e);
        "".length();
        this.j.unregister(this.i);
    }

    private static void lIIIlIlIlIlIIIl() {
        lllIIllIlIIl = new int[6];
        lllIIllIlIIl[0] = (187 ^ 171) ^ (50 ^ 38);
        lllIIllIlIIl[1] = ((126 ^ 86) ^ (28 ^ 98)) & (((242 ^ 137) ^ (1 ^ 44)) ^ (-" ".length()));
        lllIIllIlIIl[2] = " ".length();
        lllIIllIlIIl[3] = "  ".length();
        lllIIllIlIIl[4] = "   ".length();
        lllIIllIlIIl[5] = (243 ^ 181) ^ (232 ^ 166);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        boolean z;
        String message = chatMessage.getMessage();
        if (lIIIlIlIlIlIIlI(message.contains(lllIIllIIlll[lllIIllIlIIl[1]]) ? 1 : 0)) {
            if (lIIIlIlIlIlIIll(b ? 1 : 0)) {
                int i = lllIIllIlIIl[2];
                "".length();
                z = i;
                if ("   ".length() == 0) {
                    return;
                }
            } else {
                z = lllIIllIlIIl[1];
            }
            b = z;
        }
        if (lIIIlIlIlIlIIlI(message.contains(lllIIllIIlll[lllIIllIlIIl[2]]) ? 1 : 0)) {
            c += lllIIllIlIIl[2];
        }
        if (lIIIlIlIlIlIIlI(message.contains(lllIIllIIlll[lllIIllIlIIl[3]]) ? 1 : 0)) {
            b(lllIIllIlIIl[2]);
        }
    }

    private static boolean lIIIlIlIlIlIIll(int i) {
        return i == 0;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lllIIllIlIIl[0]];
        clsArr[lllIIllIlIIl[1]] = d.class;
        clsArr[lllIIllIlIIl[2]] = n.class;
        clsArr[lllIIllIlIIl[3]] = l.class;
        clsArr[lllIIllIlIIl[4]] = m.class;
        return clsArr;
    }

    private static boolean lIIIlIlIlIlIIlI(int i) {
        return i != 0;
    }

    private static String lIIIlIlIlIIllll(String lllllllllllllllIIllIlIIIIlIIlIII, String lllllllllllllllIIllIlIIIIlIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIIlIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), lllIIllIlIIl[5]), "DES");
            Cipher lllllllllllllllIIllIlIIIIlIIllII = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIIIlIIllII.init(lllIIllIlIIl[3], lllllllllllllllIIllIlIIIIlIIllIl);
            return new String(lllllllllllllllIIllIlIIIIlIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIIIlIIlIll) {
            lllllllllllllllIIllIlIIIIlIIlIll.printStackTrace();
            return null;
        }
    }

    public boolean g() {
        return this.h;
    }

    private static String lIIIlIlIlIIlllI(String lllllllllllllllIIllIlIIIIlIlllll, String lllllllllllllllIIllIlIIIIlIllllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIlIIIIlIlllII = lllllllllllllllIIllIlIIIIlIllllI.toCharArray();
        int lllllllllllllllIIllIlIIIIlIllIll = lllIIllIlIIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIllIlIIl[1];
        while (lIIIlIlIlIlIlII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIllIlIIIIlIlllII[lllllllllllllllIIllIlIIIIlIllIll % lllllllllllllllIIllIlIIIIlIlllII.length]));
            "".length();
            lllllllllllllllIIllIlIIIIlIllIll++;
            i++;
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    protected void onStart() {
        this.g = Instant.now();
        this.h = lllIIllIlIIl[1];
        this.f.add(this.e);
        "".length();
        this.j.register(this.i);
        this.i.n();
    }

    private static void lIIIlIlIlIlIIII() {
        lllIIllIIlll = new String[lllIIllIlIIl[4]];
        lllIIllIIlll[lllIIllIlIIl[1]] = lIIIlIlIlIIlllI("BwMjLwM=", "woBLf");
        lllIIllIIlll[lllIIllIlIIl[2]] = lIIIlIlIlIIllll("f7fyi5EhM5vucERB0uEaag==", "wmGon");
        lllIIllIIlll[lllIIllIlIIl[3]] = lIIIlIlIlIIllll("YmJ0RmWi6tP8VfsnZ4sydg==", "LxXvj");
    }

    public static int e() {
        return c;
    }

    static {
        lIIIlIlIlIlIIIl();
        lIIIlIlIlIlIIII();
        a = LoggerFactory.getLogger(SquireHerbiboarPlugin.class);
    }

    private static boolean lIIIlIlIlIlIlII(int i, int i2) {
        return i < i2;
    }

    public boolean f() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }
}
