package gg.squire.templeTrekking;

import com.google.inject.Provides;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.b;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.l;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.n;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.o;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.p;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.q;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.r;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.s;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.t;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.v;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.w;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.y;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.util.Log;
import gg.squire.templeTrekking.overlay.TempleTrekkingInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
@PluginDescriptor(name = "Squire Temple Trekking", description = "Zooming through temple trekking for rewards", enabledByDefault = false, tags = {"temple", "trekking", "tt"})
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:gg/squire/templeTrekking/TempleTrekkingPlugin.class */
public class TempleTrekkingPlugin extends SquirePlugin {
    private /* synthetic */ boolean m;
    public /* synthetic */ int a;
    private static /* synthetic */ int[] lIIllIllIIIIl;
    @Inject
    private /* synthetic */ TempleTrekkingConfig g;
    @Inject
    private /* synthetic */ EventBus n;
    @Inject
    private /* synthetic */ OverlayManager h;
    @Inject
    private /* synthetic */ b i;
    private /* synthetic */ InventorySetup k;
    @Inject
    private /* synthetic */ TempleTrekkingInfoBox j;
    public /* synthetic */ int b;
    public /* synthetic */ boolean c;
    private /* synthetic */ int l;
    private static /* synthetic */ String[] lIIllIlIlIIll;
    public /* synthetic */ boolean d = lIIllIllIIIIl[0];

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ WorldArea f0e = new WorldArea(new WorldPoint(lIIllIllIIIIl[1], lIIllIllIIIIl[2], lIIllIllIIIIl[3]), new WorldPoint(lIIllIllIIIIl[4], lIIllIllIIIIl[5], lIIllIllIIIIl[3]));
    public /* synthetic */ WorldArea f = new WorldArea(new WorldPoint(lIIllIllIIIIl[6], lIIllIllIIIIl[7], lIIllIllIIIIl[3]), new WorldPoint(lIIllIllIIIIl[8], lIIllIllIIIIl[9], lIIllIllIIIIl[3]));

    public void a(int i) {
        this.a = i;
    }

    public int j() {
        return this.l;
    }

    public void b(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (lIllIIIlIIIIlII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onStart() {
        if (lIllIIIlIIIIlII(this.g.claimBankTomes() ? 1 : 0)) {
            if (lIllIIIlIIIIlIl(Equipment.contains(item -> {
                return item.getName().contains(lIIllIlIlIIll[lIIllIllIIIIl[18]]);
            }) ? 1 : 0)) {
                String[] strArr = new String[lIIllIllIIIIl[0]];
                strArr[lIIllIllIIIIl[3]] = lIIllIlIlIIll[lIIllIllIIIIl[3]];
            }
            forceStop();
            Log.error(lIIllIlIlIIll[lIIllIllIIIIl[0]]);
            return;
        }
        System.out.println(lIIllIlIlIIll[lIIllIllIIIIl[11]]);
        this.c = lIIllIllIIIIl[0];
        a(new InventorySetup());
        if (lIllIIIlIIIIllI(Players.getLocal())) {
            a();
        }
        this.d = lIIllIllIIIIl[3];
        this.l = lIIllIllIIIIl[3];
        this.h.add(this.j);
        "".length();
        this.i.l();
        this.n.register(this.i);
    }

    private static void lIllIIIlIIIIIlI() {
        lIIllIlIlIIll = new String[lIIllIllIIIIl[19]];
        lIIllIlIlIIll[lIIllIllIIIIl[3]] = lIllIIIIllIIIII("N8l+F0d5M8k=", "KwMJx");
        lIIllIlIlIIll[lIIllIllIIIIl[0]] = lIllIIIIllIIIII("RcYGA5TJtMdP2LauZE3HctCyIaLKTIFd3KnCvoB11rivFGj1K5lPv9qUo9uwDGubiVhm+D76Hl+Ev3w6WFD7wORWACuqk//e", "azOEG");
        lIIllIlIlIIll[lIIllIllIIIIl[11]] = lIllIIIIllIIIIl("PTkvPgwHIyk=", "nMNLx");
        lIIllIlIlIIll[lIIllIllIIIIl[12]] = lIllIIIIllIIIIl("OC41Nh4CLnkhHk8ENTFRPCgxOh4DawsgHwoYOjQBCg==", "oKYUq");
        lIIllIlIlIIll[lIIllIllIIIIl[13]] = lIllIIIIllIIIlI("hXrUi69wxbHBex+WrIlefUlEDAnkKato", "Ejzyx");
        lIIllIlIlIIll[lIIllIllIIIIl[14]] = lIllIIIIllIIIII("iqU/ejVmN1KDDNjlyxfR9HTwWyESNSH0", "KTgxh");
        lIIllIlIlIIll[lIIllIllIIIIl[15]] = lIllIIIIllIIIIl("OjQfDzADOgMScQUwHQQ2VzYeBjgZMlEeIVY=", "wUqkQ");
        lIIllIlIlIIll[lIIllIllIIIIl[16]] = lIllIIIIllIIIIl("ETgrEHIQOzETN0IgLBU9FzMs", "bTDgR");
        lIIllIlIlIIll[lIIllIllIIIIl[17]] = lIllIIIIllIIIII("n0Y9bcQlwNpdVcypLI8FQUlI0FpzHO25mYjBWbSU0yU=", "LYagn");
        lIIllIlIlIIll[lIIllIllIIIIl[18]] = lIllIIIIllIIIlI("ETXdaQut6O4=", "ZkReY");
    }

    static {
        lIllIIIlIIIIIll();
        lIllIIIlIIIIIlI();
    }

    public void a(InventorySetup inventorySetup) {
        this.k = inventorySetup;
    }

    private static boolean lIllIIIlIIIIlIl(int i) {
        return i != 0;
    }

    private static String lIllIIIIllIIIII(String llllllllllllllIlllIlllIllIlIlIIl, String llllllllllllllIlllIlllIllIlIlIII) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIllIlIlIII.getBytes(StandardCharsets.UTF_8)), lIIllIllIIIIl[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIllIIIIl[11], llllllllllllllIlllIlllIllIlIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIllIlIlIlI) {
            llllllllllllllIlllIlllIllIlIlIlI.printStackTrace();
            return null;
        }
    }

    private void a() {
        i().add(lIIllIllIIIIl[20], this.g.stamina());
        "".length();
        i().add(lIIllIllIIIIl[21], lIIllIllIIIIl[0]);
        "".length();
    }

    public void a(boolean z) {
        this.c = z;
    }

    public void b(boolean z) {
        this.d = z;
    }

    public void c(boolean z) {
        this.m = z;
    }

    public boolean d() {
        return this.c;
    }

    public void a(WorldArea worldArea) {
        this.f0e = worldArea;
    }

    private static String lIllIIIIllIIIIl(String llllllllllllllIlllIlllIllIIIllII, String llllllllllllllIlllIlllIllIIIlIll) {
        String llllllllllllllIlllIlllIllIIIllII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIllIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIllIIIlIlI = new StringBuilder();
        char[] llllllllllllllIlllIlllIllIIIlIIl = llllllllllllllIlllIlllIllIIIlIll.toCharArray();
        int llllllllllllllIlllIlllIllIIIlIII = lIIllIllIIIIl[3];
        char[] charArray = llllllllllllllIlllIlllIllIIIllII2.toCharArray();
        int length = charArray.length;
        int i = lIIllIllIIIIl[3];
        while (lIllIIIlIIIlIII(i, length)) {
            char llllllllllllllIlllIlllIlIlllllll = charArray[i];
            llllllllllllllIlllIlllIllIIIlIlI.append((char) (llllllllllllllIlllIlllIlIlllllll ^ llllllllllllllIlllIlllIllIIIlIIl[llllllllllllllIlllIlllIllIIIlIII % llllllllllllllIlllIlllIllIIIlIIl.length]));
            "".length();
            llllllllllllllIlllIlllIllIIIlIII++;
            i++;
            "".length();
            if ("   ".length() >= ((237 ^ 142) ^ (76 ^ 43))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIlllIllIIIlIlI);
    }

    public TempleTrekkingConfig h() {
        return this.g;
    }

    public WorldArea g() {
        return this.f;
    }

    private static boolean lIllIIIlIIIlIII(int i, int i2) {
        return i < i2;
    }

    public void b(WorldArea worldArea) {
        this.f = worldArea;
    }

    private static boolean lIllIIIlIIIIllI(Object obj) {
        return obj != null;
    }

    public boolean e() {
        return this.d;
    }

    protected void onStop() {
        this.h.remove(this.j);
        "".length();
        this.n.unregister(this.i);
    }

    public void c(int i) {
        this.l = i;
    }

    private static String lIllIIIIllIIIlI(String llllllllllllllIlllIlllIllIIlllII, String llllllllllllllIlllIlllIllIIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIllIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIllIIllllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIllIIllllI.init(lIIllIllIIIIl[11], secretKeySpec);
            return new String(llllllllllllllIlllIlllIllIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIllIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIllIIlllIl) {
            llllllllllllllIlllIlllIllIIlllIl.printStackTrace();
            return null;
        }
    }

    public int c() {
        return this.b;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        a(new InventorySetup());
        a();
    }

    @Provides
    TempleTrekkingConfig a(ConfigManager configManager) {
        return (TempleTrekkingConfig) configManager.getConfig(TempleTrekkingConfig.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        ChatMessageType type = chatMessage.getType();
        String message = chatMessage.getMessage();
        if (lIllIIIlIIIIlll(type, ChatMessageType.GAMEMESSAGE) && lIllIIIlIIIIlll(type, ChatMessageType.WELCOME) && lIllIIIlIIIIlll(type, ChatMessageType.SPAM)) {
            return;
        }
        if (lIllIIIlIIIIlIl(message.contains(lIIllIlIlIIll[lIIllIllIIIIl[12]]) ? 1 : 0)) {
            System.out.println(lIIllIlIlIIll[lIIllIllIIIIl[13]]);
            this.m = lIIllIllIIIIl[3];
        }
        if (lIllIIIlIIIIlIl(message.contains(lIIllIlIlIIll[lIIllIllIIIIl[14]]) ? 1 : 0)) {
            System.out.println(lIIllIlIlIIll[lIIllIllIIIIl[15]]);
            this.m = lIIllIllIIIIl[0];
        }
        if (lIllIIIlIIIIlIl(message.contains(lIIllIlIlIIll[lIIllIllIIIIl[16]]) ? 1 : 0)) {
            a((boolean) lIIllIllIIIIl[3]);
        }
        if (lIllIIIlIIIIlIl(message.contains(lIIllIlIlIIll[lIIllIllIIIIl[17]]) ? 1 : 0)) {
            this.l += lIIllIllIIIIl[0];
            a((boolean) lIIllIllIIIIl[0]);
        }
    }

    private static void lIllIIIlIIIIIll() {
        lIIllIllIIIIl = new int[22];
        lIIllIllIIIIl[0] = " ".length();
        lIIllIllIIIIl[1] = (-((-26769) & 31455)) & (-1) & 8158;
        lIIllIllIIIIl[2] = (-29511) & 32742;
        lIIllIllIIIIl[3] = ((238 ^ 137) ^ (111 ^ 75)) & (((((8 + 54) - 57) + 213) ^ (((42 + 27) - 12) + 96)) ^ (-" ".length()));
        lIIllIllIIIIl[4] = (-((-1170) & 25755)) & (-4179) & 32251;
        lIIllIllIIIIl[5] = (-((-16937) & 29561)) & (-16897) & 32765;
        lIIllIllIIIIl[6] = (-16529) & 19959;
        lIIllIllIIIIl[7] = (-21089) & 24566;
        lIIllIllIIIIl[8] = (-((-29925) & 30445)) & (-24709) & 28670;
        lIIllIllIIIIl[9] = (-28674) & 32163;
        lIIllIllIIIIl[10] = (((22 + 134) - 45) + 33) ^ (((22 + 37) - 8) + 104);
        lIIllIllIIIIl[11] = "  ".length();
        lIIllIllIIIIl[12] = "   ".length();
        lIIllIllIIIIl[13] = 161 ^ 165;
        lIIllIllIIIIl[14] = (84 ^ 39) ^ (28 ^ 106);
        lIIllIllIIIIl[15] = (79 ^ 91) ^ (151 ^ 133);
        lIIllIllIIIIl[16] = (191 ^ 173) ^ (138 ^ 159);
        lIIllIllIIIIl[17] = (((50 + 39) - 71) + 132) ^ (((76 + 70) - 45) + 57);
        lIIllIllIIIIl[18] = 141 ^ 132;
        lIIllIllIIIIl[19] = (((87 + 37) - 6) + 22) ^ (((121 + 82) - 161) + 92);
        lIIllIllIIIIl[20] = (-18985) & 31609;
        lIIllIllIIIIl[21] = (-((-8626) & 14783)) & (-65) & 7167;
    }

    private static boolean lIllIIIlIIIIlII(int i) {
        return i == 0;
    }

    public boolean k() {
        return this.m;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIllIllIIIIl[10]];
        clsArr[lIIllIllIIIIl[3]] = s.class;
        clsArr[lIIllIllIIIIl[0]] = n.class;
        clsArr[lIIllIllIIIIl[11]] = t.class;
        clsArr[lIIllIllIIIIl[12]] = v.class;
        clsArr[lIIllIllIIIIl[13]] = w.class;
        clsArr[lIIllIllIIIIl[14]] = y.class;
        clsArr[lIIllIllIIIIl[15]] = q.class;
        clsArr[lIIllIllIIIIl[16]] = r.class;
        clsArr[lIIllIllIIIIl[17]] = o.class;
        clsArr[lIIllIllIIIIl[18]] = l.class;
        clsArr[lIIllIllIIIIl[19]] = p.class;
        return clsArr;
    }

    public int b() {
        return this.a;
    }

    public WorldArea f() {
        return this.f0e;
    }

    public InventorySetup i() {
        return this.k;
    }

    private static boolean lIllIIIlIIIIlll(Object obj, Object obj2) {
        return obj != obj2;
    }
}
