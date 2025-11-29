package gg.squire.corp;

import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.c;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.d;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.e;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.f;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.g;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.h;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.i;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.j;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.k;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.l;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.n;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.o;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.p;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.q;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.r;
import a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e.s;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.corp.overlay.CorpInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.game.ItemStack;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Prices;
@SquireUtil
@PluginDescriptor(name = "Squire Corporeal Beast", description = "Kills the corporeal beast", enabledByDefault = false)
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:gg/squire/corp/SquireCorp.class */
public class SquireCorp extends SquirePlugin {
    @Inject

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ s f4a;
    private /* synthetic */ int i;
    private static /* synthetic */ String[] lIlIlllIlIIl;
    @Inject
    private /* synthetic */ OverlayManager c;
    private static /* synthetic */ int[] lIlIlllIlIlI;
    @Inject
    private /* synthetic */ EventBus b;
    @Inject
    private /* synthetic */ CorpInfoBox d;
    private /* synthetic */ int e = lIlIlllIlIlI[0];
    private /* synthetic */ boolean f = lIlIlllIlIlI[0];
    private /* synthetic */ boolean g = lIlIlllIlIlI[0];
    private /* synthetic */ boolean h = lIlIlllIlIlI[0];

    public boolean d() {
        return this.h;
    }

    static {
        lllIIIIlllIIII();
        lllIIIIllIllll();
    }

    public void c(boolean z) {
        this.h = z;
    }

    public boolean b() {
        return this.f;
    }

    private static String lllIIIIllIlllI(String lllllllllllllllIllIIlIIIIIIIlIll, String lllllllllllllllIllIIlIIIIIIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlIIIIIIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlIIIIIIIllIl.init(lIlIlllIlIlI[3], secretKeySpec);
            return new String(lllllllllllllllIllIIlIIIIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIIIIIIllII) {
            lllllllllllllllIllIIlIIIIIIIllII.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lllIIIIlllIIIl(chatMessage.getMessage().contains(lIlIlllIlIIl[lIlIlllIlIlI[0]]) ? 1 : 0)) {
            this.e += lIlIlllIlIlI[2];
        }
    }

    public int a() {
        return this.e;
    }

    public void a(boolean z) {
        this.f = z;
    }

    protected void onStop() {
        this.b.unregister(this.f4a);
        this.c.remove(this.d);
        "".length();
    }

    public void b(boolean z) {
        this.g = z;
    }

    public int e() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    protected void onStart() {
        this.f4a.v();
        this.e = lIlIlllIlIlI[0];
        this.f = lIlIlllIlIlI[0];
        this.b.register(this.f4a);
        this.c.add(this.d);
        "".length();
    }

    private static void lllIIIIllIllll() {
        lIlIlllIlIIl = new String[lIlIlllIlIlI[2]];
        lIlIlllIlIIl[lIlIlllIlIlI[0]] = lllIIIIllIlllI("JMnbbZMS7/hQi73oMsBhjagvEgMAaTq/0vwCM/I0XVR9x+QgTF3PhA==", "jKhqp");
    }

    @Provides
    SquireCorpConfig a(ConfigManager configManager) {
        return (SquireCorpConfig) configManager.getConfig(SquireCorpConfig.class);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIlllIlIlI[1]];
        clsArr[lIlIlllIlIlI[0]] = c.class;
        clsArr[lIlIlllIlIlI[2]] = p.class;
        clsArr[lIlIlllIlIlI[3]] = h.class;
        clsArr[lIlIlllIlIlI[4]] = i.class;
        clsArr[lIlIlllIlIlI[5]] = g.class;
        clsArr[lIlIlllIlIlI[6]] = r.class;
        clsArr[lIlIlllIlIlI[7]] = f.class;
        clsArr[lIlIlllIlIlI[8]] = d.class;
        clsArr[lIlIlllIlIlI[9]] = e.class;
        clsArr[lIlIlllIlIlI[10]] = k.class;
        clsArr[lIlIlllIlIlI[11]] = l.class;
        clsArr[lIlIlllIlIlI[12]] = j.class;
        clsArr[lIlIlllIlIlI[13]] = n.class;
        clsArr[lIlIlllIlIlI[14]] = q.class;
        clsArr[lIlIlllIlIlI[15]] = o.class;
        return clsArr;
    }

    private static boolean lllIIIIlllIIIl(int i) {
        return i != 0;
    }

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        for (ItemStack itemStack : npcLootReceived.getItems()) {
            this.i += itemStack.getQuantity() * Prices.getItemPrice(itemStack.getId());
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
    }

    private static void lllIIIIlllIIII() {
        lIlIlllIlIlI = new int[16];
        lIlIlllIlIlI[0] = ((196 ^ 154) ^ (123 ^ 14)) & (((((11 + 71) - (-36)) + 47) ^ (((45 + 112) - 116) + 101)) ^ (-" ".length()));
        lIlIlllIlIlI[1] = (245 ^ 161) ^ (239 ^ 180);
        lIlIlllIlIlI[2] = " ".length();
        lIlIlllIlIlI[3] = "  ".length();
        lIlIlllIlIlI[4] = "   ".length();
        lIlIlllIlIlI[5] = (((74 + 107) - 159) + 177) ^ (((126 + 89) - 78) + 58);
        lIlIlllIlIlI[6] = (163 ^ 195) ^ (193 ^ 164);
        lIlIlllIlIlI[7] = (61 ^ 9) ^ (159 ^ 173);
        lIlIlllIlIlI[8] = (214 ^ 191) ^ (17 ^ 127);
        lIlIlllIlIlI[9] = 140 ^ 132;
        lIlIlllIlIlI[10] = (173 ^ 169) ^ (72 ^ 69);
        lIlIlllIlIlI[11] = (51 ^ 35) ^ (101 ^ 127);
        lIlIlllIlIlI[12] = (((52 + 143) - 133) + 110) ^ (((166 + 8) - 9) + 2);
        lIlIlllIlIlI[13] = 27 ^ 23;
        lIlIlllIlIlI[14] = (34 ^ 125) ^ (228 ^ 182);
        lIlIlllIlIlI[15] = (7 ^ 19) ^ (2 ^ 24);
    }

    public boolean c() {
        return this.g;
    }
}
