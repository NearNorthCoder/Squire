package gg.squire.basics.cerberus;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.cerberus.overlay.CerberusOverlay;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.A;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0000a;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0059h;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0061j;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0062k;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0063l;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0064m;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0065n;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0066o;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0068q;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0069r;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0070s;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0071t;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0072u;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0073v;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0074w;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0075x;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0076y;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0077z;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import net.runelite.api.ChatMessageType;
import net.runelite.api.ItemComposition;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Prices;
@PluginDescriptor(name = "Squire Cerberus", description = "Kills Cerberus for you, banks and loots items.", enabledByDefault = false)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/cerberus/SquireCerberus.class */
public class SquireCerberus extends SquirePlugin {
    private static /* synthetic */ int[] llIIlIllI;
    private /* synthetic */ boolean M;
    /* synthetic */ List<C0059h> F = new ArrayList();
    @Inject
    private /* synthetic */ SquireCerberusConfig G;
    @Inject
    private /* synthetic */ CerberusOverlay I;
    private static /* synthetic */ String[] llIIlIlIl;
    @Inject
    private /* synthetic */ C0000a J;
    @Inject
    private /* synthetic */ OverlayManager H;
    @Inject
    private /* synthetic */ EventBus K;
    private /* synthetic */ int L;
    @Inject
    private /* synthetic */ ItemManager w;

    private static void lIllIIIllIl() {
        llIIlIlIl = new String[llIIlIllI[2]];
        llIIlIlIl[llIIlIllI[1]] = lIllIIIllII("PBoEM1UmEAMjEBcAAmEeDBkd", "euqAu");
    }

    private static void lIllIIIlllI() {
        llIIlIllI = new int[18];
        llIIlIllI[0] = 95 ^ 78;
        llIIlIllI[1] = (206 ^ 141) & ((223 ^ 156) ^ (-1));
        llIIlIllI[2] = " ".length();
        llIIlIllI[3] = "  ".length();
        llIIlIllI[4] = "   ".length();
        llIIlIllI[5] = (15 ^ 124) ^ (228 ^ 147);
        llIIlIllI[6] = 122 ^ 127;
        llIIlIllI[7] = (101 ^ 116) ^ (117 ^ 98);
        llIIlIllI[8] = 44 ^ 43;
        llIIlIllI[9] = 170 ^ 162;
        llIIlIllI[10] = (((24 + 104) - 33) + 79) ^ (((7 + 163) - 157) + 154);
        llIIlIllI[11] = (101 ^ 127) ^ (98 ^ 114);
        llIIlIllI[12] = 188 ^ 183;
        llIIlIllI[13] = 71 ^ 75;
        llIIlIllI[14] = (((125 + 132) - 110) + 53) ^ (((65 + 29) - 34) + 137);
        llIIlIllI[15] = 136 ^ 134;
        llIIlIllI[16] = 25 ^ 22;
        llIIlIllI[17] = (109 ^ 90) ^ (110 ^ 73);
    }

    public void b(int i2) {
        this.L = i2;
    }

    protected void onStart() {
        this.H.add(this.I);
        "".length();
        this.J.a();
        this.K.register(this.J);
    }

    public boolean r() {
        return this.M;
    }

    private static boolean lIllIIlIIII(int i2) {
        return i2 != 0;
    }

    public void b(boolean z) {
        this.M = z;
    }

    private static boolean lIllIIlIIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIllIIIllII(String lIllIIllllIIlIl, String lIllIIllllIIlII) {
        String lIllIIllllIIlIl2 = new String(Base64.getDecoder().decode(lIllIIllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIllIIllllIIlII.toCharArray();
        int lIllIIllllIIIIl = llIIlIllI[1];
        char[] charArray2 = lIllIIllllIIlIl2.toCharArray();
        int length = charArray2.length;
        int lIllIIlllIllIIl = llIIlIllI[1];
        while (lIllIIlIIIl(lIllIIlllIllIIl, length)) {
            sb.append((char) (charArray2[lIllIIlllIllIIl] ^ charArray[lIllIIllllIIIIl % charArray.length]));
            "".length();
            lIllIIllllIIIIl++;
            lIllIIlllIllIIl++;
            "".length();
            if (((16 ^ 73) ^ (209 ^ 140)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        lootReceived.getItems().forEach(itemStack -> {
            C0059h c0059h = new C0059h();
            c0059h.a(Instant.now());
            ItemComposition itemComposition = this.w.getItemComposition(itemStack.getId());
            int itemPrice = Prices.getItemPrice(itemStack.getId());
            c0059h.a(itemComposition.getName());
            c0059h.f(itemStack.getId());
            c0059h.g(itemPrice);
            c0059h.h(this.w.getAlchValue(itemComposition));
            this.F.add(c0059h);
            "".length();
        });
    }

    @Provides
    SquireCerberusConfig a(ConfigManager configManager) {
        return (SquireCerberusConfig) configManager.getConfig(SquireCerberusConfig.class);
    }

    public int q() {
        return this.L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (!lIllIIIllll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lIllIIlIIII(chatMessage.getMessage().contains(llIIlIlIl[llIIlIllI[1]]) ? 1 : 0)) {
            b(q() + llIIlIllI[2]);
            this.J.a((boolean) llIIlIllI[2]);
        }
    }

    static {
        lIllIIIlllI();
        lIllIIIllIl();
    }

    public void a(List<C0059h> list) {
        this.F = list;
    }

    protected void onStop() {
        this.H.remove(this.I);
        "".length();
        this.J.a();
        this.K.register(this.J);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIIlIllI[0]];
        clsArr[llIIlIllI[1]] = C0072u.class;
        clsArr[llIIlIllI[2]] = C0061j.class;
        clsArr[llIIlIllI[3]] = C0071t.class;
        clsArr[llIIlIllI[4]] = C0074w.class;
        clsArr[llIIlIllI[5]] = C0069r.class;
        clsArr[llIIlIllI[6]] = C0073v.class;
        clsArr[llIIlIllI[7]] = C0065n.class;
        clsArr[llIIlIllI[8]] = C0062k.class;
        clsArr[llIIlIllI[9]] = C0068q.class;
        clsArr[llIIlIllI[10]] = C0066o.class;
        clsArr[llIIlIllI[11]] = C0064m.class;
        clsArr[llIIlIllI[12]] = A.class;
        clsArr[llIIlIllI[13]] = C0077z.class;
        clsArr[llIIlIllI[14]] = C0063l.class;
        clsArr[llIIlIllI[15]] = C0076y.class;
        clsArr[llIIlIllI[16]] = C0070s.class;
        clsArr[llIIlIllI[17]] = C0075x.class;
        return clsArr;
    }

    public List<C0059h> p() {
        return this.F;
    }

    private static boolean lIllIIIllll(Object obj, Object obj2) {
        return obj != obj2;
    }
}
