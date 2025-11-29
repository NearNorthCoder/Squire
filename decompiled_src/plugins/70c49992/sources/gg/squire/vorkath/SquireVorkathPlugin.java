package gg.squire.vorkath;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.vorkath.ui.VorkathInfoBox;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.A;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.B;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.C;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.C0001b;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.C0003d;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.C0005f;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.C0013n;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.C0015p;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.C0016q;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.C0017r;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.C0018s;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.D;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.E;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.F;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.G;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.H;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.I;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.J;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.K;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.L;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.M;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.O;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.P;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.R;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.t;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.u;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.v;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.x;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.y;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.z;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Prices;
@PluginDescriptor(name = "Squire Vorkath", description = "Kills the big blue dragon", tags = {"vorkath", "prayer", "bones"}, enabledByDefault = false)
@SquireUtil
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:gg/squire/vorkath/SquireVorkathPlugin.class */
public class SquireVorkathPlugin extends SquirePlugin {
    private static /* synthetic */ String[] lIlIllIIIlllI;
    @Inject
    /* synthetic */ OverlayManager j;
    @Inject
    /* synthetic */ C0005f h;
    @Inject
    private /* synthetic */ EventBus n;
    @Inject
    private /* synthetic */ VorkathInfoBox m;
    @Inject
    /* synthetic */ R k;
    private static /* synthetic */ int[] lIlIllIIIllll;
    @Inject
    /* synthetic */ C0003d l;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    /* synthetic */ ClientToolbar f0i;
    private /* synthetic */ boolean o;
    private /* synthetic */ int p = lIlIllIIIllll[0];
    private /* synthetic */ int q = lIlIllIIIllll[0];
    private /* synthetic */ boolean r = lIlIllIIIllll[0];
    private /* synthetic */ int s = lIlIllIIIllll[0];

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        this.s += npcLootReceived.getItems().stream().mapToInt(itemStack -> {
            return Prices.getItemPrice(itemStack.getId()) * itemStack.getQuantity();
        }).sum();
    }

    private static boolean llIIIIIIIllIlII(int i2) {
        return i2 != 0;
    }

    private static void llIIIIIIIllIIlI() {
        lIlIllIIIlllI = new String[lIlIllIIIllll[4]];
        lIlIllIIIlllI[lIlIllIIIllll[0]] = llIIIIIIIllIIII("ATglJ2kOOCI+KCw/cD4gNDtwNiYtOSQ=", "XWPUI");
        lIlIllIIIlllI[lIlIllIIIllll[2]] = llIIIIIIIllIIIl("ArH3DOICfxaDMkDKZGfSqpR9ChkFqk4b", "hoTMX");
        lIlIllIIIlllI[lIlIllIIIllll[3]] = llIIIIIIIllIIIl("QQdL6lNTYsxoLXpUO9KQ7O5nVdU+GYQFx40uwq01vYpeY6+k8W0f13WAGVWXH4HVgVdVRA33RqP2RRVeSRAD9g==", "oAQzx");
    }

    private static String llIIIIIIIllIIII(String llllllllllllllIllIlIIllIlIIlllIl, String llllllllllllllIllIlIIllIlIIlllII) {
        String llllllllllllllIllIlIIllIlIIlllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIllIlIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIllIlIIllIll = new StringBuilder();
        char[] llllllllllllllIllIlIIllIlIIllIlI = llllllllllllllIllIlIIllIlIIlllII.toCharArray();
        int llllllllllllllIllIlIIllIlIIllIIl = lIlIllIIIllll[0];
        char[] charArray = llllllllllllllIllIlIIllIlIIlllIl2.toCharArray();
        int length = charArray.length;
        int i2 = lIlIllIIIllll[0];
        while (llIIIIIIIllIlIl(i2, length)) {
            llllllllllllllIllIlIIllIlIIllIll.append((char) (charArray[i2] ^ llllllllllllllIllIlIIllIlIIllIlI[llllllllllllllIllIlIIllIlIIllIIl % llllllllllllllIllIlIIllIlIIllIlI.length]));
            "".length();
            llllllllllllllIllIlIIllIlIIllIIl++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIIllIlIIllIll);
    }

    public int d() {
        return this.p;
    }

    public boolean f() {
        return this.r;
    }

    private static void llIIIIIIIllIIll() {
        lIlIllIIIllll = new int[28];
        lIlIllIIIllll[0] = (129 ^ 173) & ((105 ^ 69) ^ (-1));
        lIlIllIIIllll[1] = 169 ^ 178;
        lIlIllIIIllll[2] = " ".length();
        lIlIllIIIllll[3] = "  ".length();
        lIlIllIIIllll[4] = "   ".length();
        lIlIllIIIllll[5] = (((68 + 68) - 38) + 75) ^ (((97 + 11) - (-47)) + 14);
        lIlIllIIIllll[6] = (((148 + 76) - 131) + 84) ^ (((126 + 163) - 135) + 26);
        lIlIllIIIllll[7] = 14 ^ 8;
        lIlIllIIIllll[8] = 165 ^ 162;
        lIlIllIIIllll[9] = (76 ^ 111) ^ (117 ^ 94);
        lIlIllIIIllll[10] = (((20 + 117) - 82) + 83) ^ (((58 + 77) - 53) + 49);
        lIlIllIIIllll[11] = (99 ^ 77) ^ (66 ^ 102);
        lIlIllIIIllll[12] = 172 ^ 167;
        lIlIllIIIllll[13] = 11 ^ 7;
        lIlIllIIIllll[14] = 88 ^ 85;
        lIlIllIIIllll[15] = (((140 + 107) - 202) + 156) ^ (((107 + 88) - 193) + 197);
        lIlIllIIIllll[16] = 17 ^ 30;
        lIlIllIIIllll[17] = (((75 + 129) - 141) + 70) ^ (((116 + 15) - 107) + 125);
        lIlIllIIIllll[18] = 40 ^ 57;
        lIlIllIIIllll[19] = 109 ^ 127;
        lIlIllIIIllll[20] = (((106 + 89) - 145) + 97) ^ (((89 + 86) - 55) + 8);
        lIlIllIIIllll[21] = 168 ^ 188;
        lIlIllIIIllll[22] = 24 ^ 13;
        lIlIllIIIllll[23] = (69 ^ 80) ^ "   ".length();
        lIlIllIIIllll[24] = 57 ^ 46;
        lIlIllIIIllll[25] = (((68 + 106) - 22) + 24) ^ (((148 + 144) - 232) + 108);
        lIlIllIIIllll[26] = (108 ^ 9) ^ (22 ^ 106);
        lIlIllIIIllll[27] = 178 ^ 168;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIllIIIllll[1]];
        clsArr[lIlIllIIIllll[0]] = x.class;
        clsArr[lIlIllIIIllll[2]] = A.class;
        clsArr[lIlIllIIIllll[3]] = I.class;
        clsArr[lIlIllIIIllll[4]] = G.class;
        clsArr[lIlIllIIIllll[5]] = E.class;
        clsArr[lIlIllIIIllll[6]] = H.class;
        clsArr[lIlIllIIIllll[7]] = J.class;
        clsArr[lIlIllIIIllll[8]] = F.class;
        clsArr[lIlIllIIIllll[9]] = v.class;
        clsArr[lIlIllIIIllll[10]] = B.class;
        clsArr[lIlIllIIIllll[11]] = u.class;
        clsArr[lIlIllIIIllll[12]] = L.class;
        clsArr[lIlIllIIIllll[13]] = z.class;
        clsArr[lIlIllIIIllll[14]] = y.class;
        clsArr[lIlIllIIIllll[15]] = D.class;
        clsArr[lIlIllIIIllll[16]] = C.class;
        clsArr[lIlIllIIIllll[17]] = K.class;
        clsArr[lIlIllIIIllll[18]] = P.class;
        clsArr[lIlIllIIIllll[19]] = M.class;
        clsArr[lIlIllIIIllll[20]] = C0001b.class;
        clsArr[lIlIllIIIllll[21]] = O.class;
        clsArr[lIlIllIIIllll[22]] = C0013n.class;
        clsArr[lIlIllIIIllll[23]] = C0018s.class;
        clsArr[lIlIllIIIllll[24]] = t.class;
        clsArr[lIlIllIIIllll[25]] = C0015p.class;
        clsArr[lIlIllIIIllll[26]] = C0016q.class;
        clsArr[lIlIllIIIllll[27]] = C0017r.class;
        return clsArr;
    }

    static {
        llIIIIIIIllIIll();
        llIIIIIIIllIIlI();
    }

    private static String llIIIIIIIllIIIl(String llllllllllllllIllIlIIllIlIIIlIII, String llllllllllllllIllIlIIllIlIIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIllIlIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIIIllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIllIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIllIlIIIIlII) {
            llllllllllllllIllIlIIllIlIIIIlII.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
        this.j.remove(this.k);
        "".length();
        this.j.remove(this.m);
        "".length();
        this.n.unregister(this.l);
        this.n.unregister(this.h);
    }

    private static boolean llIIIIIIIllIlIl(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    protected void onStart() {
        a();
        this.j.add(this.k);
        "".length();
        this.j.add(this.m);
        "".length();
        this.h.a();
        this.n.register(this.l);
        this.n.register(this.h);
        this.o = lIlIllIIIllll[2];
    }

    public int g() {
        return this.s;
    }

    public void a(boolean z) {
        this.o = z;
    }

    @Provides
    SquireVorkathConfig a(ConfigManager configManager) {
        return (SquireVorkathConfig) configManager.getConfig(SquireVorkathConfig.class);
    }

    public void b(boolean z) {
        this.r = z;
    }

    public int e() {
        return this.q;
    }

    public boolean c() {
        return this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llIIIIIIIllIlII(chatMessage.getMessage().contains(lIlIllIIIlllI[lIlIllIIIllll[0]]) ? 1 : 0)) {
            this.q += lIlIllIIIllll[2];
        }
        if (llIIIIIIIllIlII(chatMessage.getMessage().contains(lIlIllIIIlllI[lIlIllIIIllll[2]]) ? 1 : 0)) {
            this.r = lIlIllIIIllll[2];
            Log.info(lIlIllIIIlllI[lIlIllIIIllll[3]]);
            forceStop();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    private void a() {
        this.q = lIlIllIIIllll[0];
        this.o = lIlIllIIIllll[0];
        this.p = lIlIllIIIllll[0];
        this.r = lIlIllIIIllll[0];
        this.s = lIlIllIIIllll[0];
    }

    public R b() {
        return this.k;
    }
}
