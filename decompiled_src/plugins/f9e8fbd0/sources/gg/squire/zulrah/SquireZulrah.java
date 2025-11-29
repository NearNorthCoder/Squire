package gg.squire.zulrah;

import a.u.i.p000.l.r.h.z.s.r.u.q.e.A;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.B;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.C;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.C0019t;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.C0021v;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.C0022w;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.C0023x;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.C0024y;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.D;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.EnumC0002c;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.F;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.G;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.H;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.I;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.J;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.L;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.M;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.N;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.O;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.Q;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.R;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.S;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.T;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.U;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.V;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.W;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.X;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.Y;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.Z;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.aa;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.ab;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.ac;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.ae;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.af;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.ah;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.ai;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.aj;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.ak;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.al;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.an;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.ao;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.ap;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.zulrah.overlay.ZulrahInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.client.Static;
@PluginDescriptor(name = "Squire Zulrah", description = "Zulrah killing plugin", tags = {"zulrah", "helper", "squire"}, enabledByDefault = false)
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:gg/squire/zulrah/SquireZulrah.class */
public class SquireZulrah extends SquirePlugin {
    private /* synthetic */ int j;
    @Inject
    private /* synthetic */ OverlayManager c;
    private /* synthetic */ boolean m;
    private static /* synthetic */ String[] lIllIlllllIIl;
    private /* synthetic */ int k;
    private /* synthetic */ boolean l;
    private /* synthetic */ EnumC0002c i = EnumC0002c.DONE;
    @Inject
    private /* synthetic */ SquireZulrahConfig f;
    private static /* synthetic */ int[] lIllIlllllIlI;
    @Inject
    private /* synthetic */ EventBus b;
    @Inject
    private /* synthetic */ ZulrahInfoBox d;
    @Inject
    private /* synthetic */ C0022w h;
    @Inject
    private /* synthetic */ C0023x e;
    @Inject
    private /* synthetic */ C0019t g;
    @Inject

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C0021v f0a;

    public int b() {
        return this.j;
    }

    private static void llIIlIIlllllIII() {
        lIllIlllllIIl = new String[lIllIlllllIlI[2]];
        lIllIlllllIIl[lIllIlllllIlI[1]] = llIIlIIllllIlll("fCzQgii8XmGdJhTZ8wpGvYH8hsyUJegD", "CuOoM");
    }

    public void a(EnumC0002c enumC0002c) {
        this.i = enumC0002c;
    }

    public void a(int i) {
        this.k = i;
    }

    public EnumC0002c a() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    protected void onStart() {
        this.f0a.T();
        this.l = lIllIlllllIlI[1];
        this.m = lIllIlllllIlI[1];
        this.i = EnumC0002c.DONE;
        this.b.register(this.f0a);
        this.c.add(this.d);
        "".length();
        this.c.add(this.h);
        "".length();
        this.c.add(this.e);
        "".length();
        this.k = Static.getClient().getTickCount();
    }

    public boolean d() {
        return this.l;
    }

    private static String llIIlIIllllIlll(String llllllllllllllIllIIIIlllllIIlIIl, String llllllllllllllIllIIIIlllllIIIllI) {
        try {
            SecretKeySpec llllllllllllllIllIIIIlllllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIIlllllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIIlllllIIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIIlllllIIlIll.init(lIllIlllllIlI[3], llllllllllllllIllIIIIlllllIIllII);
            return new String(llllllllllllllIllIIIIlllllIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIIlllllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIIlllllIIlIlI) {
            llllllllllllllIllIIIIlllllIIlIlI.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
        this.b.unregister(this.f0a);
        this.c.remove(this.d);
        "".length();
        this.c.remove(this.e);
        "".length();
        this.c.remove(this.h);
        "".length();
    }

    private static boolean llIIlIIlllllIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        this.m = lIllIlllllIlI[2];
    }

    @Provides
    SquireZulrahConfig a(ConfigManager configManager) {
        return (SquireZulrahConfig) configManager.getConfig(SquireZulrahConfig.class);
    }

    public void a(boolean z) {
        this.l = z;
    }

    public int c() {
        return this.k;
    }

    public boolean e() {
        return this.m;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llIIlIIlllllIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) || llIIlIIlllllIll(chatMessage.getMessage().equals(lIllIlllllIIl[lIllIlllllIlI[1]]) ? 1 : 0)) {
            return;
        }
        this.i = EnumC0002c.BANKING;
        this.j += lIllIlllllIlI[2];
    }

    public void b(boolean z) {
        this.m = z;
    }

    static {
        llIIlIIlllllIIl();
        llIIlIIlllllIII();
    }

    private static void llIIlIIlllllIIl() {
        lIllIlllllIlI = new int[38];
        lIllIlllllIlI[0] = (188 ^ 159) ^ (125 ^ 123);
        lIllIlllllIlI[1] = (27 ^ 12) & ((11 ^ 28) ^ (-1));
        lIllIlllllIlI[2] = " ".length();
        lIllIlllllIlI[3] = "  ".length();
        lIllIlllllIlI[4] = "   ".length();
        lIllIlllllIlI[5] = 43 ^ 47;
        lIllIlllllIlI[6] = "  ".length() ^ (75 ^ 76);
        lIllIlllllIlI[7] = (174 ^ 191) ^ (125 ^ 106);
        lIllIlllllIlI[8] = 113 ^ 118;
        lIllIlllllIlI[9] = 39 ^ 47;
        lIllIlllllIlI[10] = 153 ^ 144;
        lIllIlllllIlI[11] = 177 ^ 187;
        lIllIlllllIlI[12] = 99 ^ 104;
        lIllIlllllIlI[13] = 118 ^ 122;
        lIllIlllllIlI[14] = (101 ^ 40) ^ (20 ^ 84);
        lIllIlllllIlI[15] = 81 ^ 95;
        lIllIlllllIlI[16] = (((122 + 137) - 186) + 67) ^ (((67 + 78) - 79) + 65);
        lIllIlllllIlI[17] = 3 ^ 19;
        lIllIlllllIlI[18] = 17 ^ 0;
        lIllIlllllIlI[19] = 79 ^ 93;
        lIllIlllllIlI[20] = 80 ^ 67;
        lIllIlllllIlI[21] = 71 ^ 83;
        lIllIlllllIlI[22] = (24 ^ 64) ^ (100 ^ 41);
        lIllIlllllIlI[23] = (101 ^ 52) ^ (206 ^ 137);
        lIllIlllllIlI[24] = (10 ^ 74) ^ (224 ^ 183);
        lIllIlllllIlI[25] = 154 ^ 130;
        lIllIlllllIlI[26] = (47 ^ 20) ^ (4 ^ 38);
        lIllIlllllIlI[27] = 51 ^ 41;
        lIllIlllllIlI[28] = (162 ^ 128) ^ (14 ^ 55);
        lIllIlllllIlI[29] = 78 ^ 82;
        lIllIlllllIlI[30] = 177 ^ 172;
        lIllIlllllIlI[31] = (((117 + 42) - 77) + 90) ^ (((150 + 146) - 233) + 115);
        lIllIlllllIlI[32] = 3 ^ 28;
        lIllIlllllIlI[33] = (62 ^ 89) ^ (87 ^ 16);
        lIllIlllllIlI[34] = 97 ^ 64;
        lIllIlllllIlI[35] = 24 ^ 58;
        lIllIlllllIlI[36] = (195 ^ 173) ^ (48 ^ 125);
        lIllIlllllIlI[37] = (13 ^ 85) ^ (98 ^ 30);
    }

    private static boolean llIIlIIlllllIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIllIlllllIlI[0]];
        clsArr[lIllIlllllIlI[1]] = B.class;
        clsArr[lIllIlllllIlI[2]] = C0024y.class;
        clsArr[lIllIlllllIlI[3]] = A.class;
        clsArr[lIllIlllllIlI[4]] = Z.class;
        clsArr[lIllIlllllIlI[5]] = ab.class;
        clsArr[lIllIlllllIlI[6]] = T.class;
        clsArr[lIllIlllllIlI[7]] = U.class;
        clsArr[lIllIlllllIlI[8]] = W.class;
        clsArr[lIllIlllllIlI[9]] = V.class;
        clsArr[lIllIlllllIlI[10]] = ac.class;
        clsArr[lIllIlllllIlI[11]] = Y.class;
        clsArr[lIllIlllllIlI[12]] = X.class;
        clsArr[lIllIlllllIlI[13]] = ae.class;
        clsArr[lIllIlllllIlI[14]] = af.class;
        clsArr[lIllIlllllIlI[15]] = ai.class;
        clsArr[lIllIlllllIlI[16]] = ah.class;
        clsArr[lIllIlllllIlI[17]] = aj.class;
        clsArr[lIllIlllllIlI[18]] = ak.class;
        clsArr[lIllIlllllIlI[19]] = al.class;
        clsArr[lIllIlllllIlI[20]] = an.class;
        clsArr[lIllIlllllIlI[21]] = D.class;
        clsArr[lIllIlllllIlI[22]] = I.class;
        clsArr[lIllIlllllIlI[23]] = J.class;
        clsArr[lIllIlllllIlI[24]] = F.class;
        clsArr[lIllIlllllIlI[25]] = G.class;
        clsArr[lIllIlllllIlI[26]] = H.class;
        clsArr[lIllIlllllIlI[27]] = M.class;
        clsArr[lIllIlllllIlI[28]] = O.class;
        clsArr[lIllIlllllIlI[29]] = L.class;
        clsArr[lIllIlllllIlI[30]] = S.class;
        clsArr[lIllIlllllIlI[31]] = N.class;
        clsArr[lIllIlllllIlI[32]] = R.class;
        clsArr[lIllIlllllIlI[33]] = ao.class;
        clsArr[lIllIlllllIlI[34]] = ap.class;
        clsArr[lIllIlllllIlI[35]] = aa.class;
        clsArr[lIllIlllllIlI[36]] = C.class;
        clsArr[lIllIlllllIlI[37]] = Q.class;
        return clsArr;
    }
}
