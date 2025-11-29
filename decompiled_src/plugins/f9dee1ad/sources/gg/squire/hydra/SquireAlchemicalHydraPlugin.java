package gg.squire.hydra;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.hydra.overlay.HydraOverlayPanel;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import u.i.r.d.s.e.r.q.y.a.h.p000.A;
import u.i.r.d.s.e.r.q.y.a.h.p000.B;
import u.i.r.d.s.e.r.q.y.a.h.p000.C;
import u.i.r.d.s.e.r.q.y.a.h.p000.C0000a;
import u.i.r.d.s.e.r.q.y.a.h.p000.e;
import u.i.r.d.s.e.r.q.y.a.h.p000.m;
import u.i.r.d.s.e.r.q.y.a.h.p000.n;
import u.i.r.d.s.e.r.q.y.a.h.p000.o;
import u.i.r.d.s.e.r.q.y.a.h.p000.p;
import u.i.r.d.s.e.r.q.y.a.h.p000.q;
import u.i.r.d.s.e.r.q.y.a.h.p000.r;
import u.i.r.d.s.e.r.q.y.a.h.p000.s;
import u.i.r.d.s.e.r.q.y.a.h.p000.t;
import u.i.r.d.s.e.r.q.y.a.h.p000.u;
import u.i.r.d.s.e.r.q.y.a.h.p000.v;
import u.i.r.d.s.e.r.q.y.a.h.p000.w;
import u.i.r.d.s.e.r.q.y.a.h.p000.x;
import u.i.r.d.s.e.r.q.y.a.h.p000.y;
import u.i.r.d.s.e.r.q.y.a.h.p000.z;
@SquireUtil
@PluginDescriptor(name = "Squire Hydra", description = "Does stuff for the Alchemical Hydra", enabledByDefault = false, tags = {"boss", "alchemical", "hydra", "prayer"})
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:gg/squire/hydra/SquireAlchemicalHydraPlugin.class */
public class SquireAlchemicalHydraPlugin extends SquirePlugin {
    @Inject
    private /* synthetic */ C0000a a;
    @Inject
    private /* synthetic */ SquireAlchemicalHydraConfig d;
    @Inject
    private /* synthetic */ HydraOverlayPanel g;
    private static /* synthetic */ int[] llllIlIIIIIl;
    @Inject
    private /* synthetic */ m f;
    private /* synthetic */ boolean h;
    @Inject
    private /* synthetic */ e b;
    @Inject
    private /* synthetic */ OverlayManager e;
    @Inject
    private /* synthetic */ EventBus c;
    private static /* synthetic */ String[] llllIlIIIIII;

    private static boolean lIIlIIIIIllIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    public C0000a a() {
        return this.a;
    }

    protected void onStop() {
        this.e.remove(this.f);
        "".length();
        this.e.remove(this.g);
        "".length();
        this.c.unregister(this.a);
        this.c.unregister(this.b);
    }

    private static void lIIlIIIIIllIIlI() {
        llllIlIIIIII = new String[llllIlIIIIIl[2]];
        llllIlIIIIII[llllIlIIIIIl[1]] = lIIlIIIIIllIIIl("S7LKu6hgl2CzmmN4ZVH5prgkENktZoQ2", "UIUfR");
    }

    @Provides
    SquireAlchemicalHydraConfig a(ConfigManager configManager) {
        return (SquireAlchemicalHydraConfig) configManager.getConfig(SquireAlchemicalHydraConfig.class);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llllIlIIIIIl[0]];
        clsArr[llllIlIIIIIl[1]] = x.class;
        clsArr[llllIlIIIIIl[2]] = w.class;
        clsArr[llllIlIIIIIl[3]] = s.class;
        clsArr[llllIlIIIIIl[4]] = n.class;
        clsArr[llllIlIIIIIl[5]] = u.class;
        clsArr[llllIlIIIIIl[6]] = v.class;
        clsArr[llllIlIIIIIl[7]] = t.class;
        clsArr[llllIlIIIIIl[8]] = A.class;
        clsArr[llllIlIIIIIl[9]] = B.class;
        clsArr[llllIlIIIIIl[10]] = z.class;
        clsArr[llllIlIIIIIl[11]] = r.class;
        clsArr[llllIlIIIIIl[12]] = o.class;
        clsArr[llllIlIIIIIl[13]] = p.class;
        clsArr[llllIlIIIIIl[14]] = q.class;
        clsArr[llllIlIIIIIl[15]] = y.class;
        clsArr[llllIlIIIIIl[16]] = C.class;
        return clsArr;
    }

    public boolean c() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    protected void onStart() {
        this.a.h();
        a((boolean) llllIlIIIIIl[1]);
        this.c.register(this.a);
        this.c.register(this.b);
        this.e.add(this.f);
        "".length();
        this.e.add(this.g);
        "".length();
    }

    static {
        lIIlIIIIIllIIll();
        lIIlIIIIIllIIlI();
    }

    public e b() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIlIIIIIllIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String lllllllllllllllIIlIlIIllIllIlIll = chatMessage.getMessage();
        if (lIIlIIIIIllIlIl(lllllllllllllllIIlIlIIllIllIlIll.contains(llllIlIIIIII[llllIlIIIIIl[1]]) ? 1 : 0)) {
            a((boolean) llllIlIIIIIl[2]);
        }
    }

    private static String lIIlIIIIIllIIIl(String lllllllllllllllIIlIlIIllIllIIIll, String lllllllllllllllIIlIlIIllIllIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIllIllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIllIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIIIIIl[3], lllllllllllllllIIlIlIIllIllIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIllIllIIlII) {
            lllllllllllllllIIlIlIIllIllIIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIllIIll() {
        llllIlIIIIIl = new int[17];
        llllIlIIIIIl[0] = 137 ^ 153;
        llllIlIIIIIl[1] = (124 ^ 71) & ((66 ^ 121) ^ (-1));
        llllIlIIIIIl[2] = " ".length();
        llllIlIIIIIl[3] = "  ".length();
        llllIlIIIIIl[4] = "   ".length();
        llllIlIIIIIl[5] = (237 ^ 194) ^ (186 ^ 145);
        llllIlIIIIIl[6] = (49 ^ 100) ^ (47 ^ 127);
        llllIlIIIIIl[7] = (60 ^ 7) ^ (191 ^ 130);
        llllIlIIIIIl[8] = (((78 + 29) - 101) + 163) ^ (((142 + 74) - 166) + 124);
        llllIlIIIIIl[9] = (((111 + 32) - 18) + 27) ^ (((51 + 38) - 82) + 137);
        llllIlIIIIIl[10] = 16 ^ 25;
        llllIlIIIIIl[11] = 173 ^ 167;
        llllIlIIIIIl[12] = 204 ^ 199;
        llllIlIIIIIl[13] = (127 ^ 79) ^ (166 ^ 154);
        llllIlIIIIIl[14] = 109 ^ 96;
        llllIlIIIIIl[15] = (203 ^ 187) ^ (70 ^ 56);
        llllIlIIIIIl[16] = 191 ^ 176;
    }

    public void a(boolean z) {
        this.h = z;
    }

    private static boolean lIIlIIIIIllIlIl(int i) {
        return i != 0;
    }
}
