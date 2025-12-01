package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/b.class */
public class b {
    private static final /* synthetic */ int l;
    private final /* synthetic */ SquireWintertodtConfig q;
    private static final /* synthetic */ int k;
    public static final /* synthetic */ int g;
    private static /* synthetic */ String[] lIlIllllIlIll;
    private static final /* synthetic */ int n;
    private static final /* synthetic */ Pattern m;
    private static final /* synthetic */ int i;
    private static /* synthetic */ int[] lIlIllllIllII;
    private static final /* synthetic */ int j;
    private /* synthetic */ a u;
    public static final /* synthetic */ int h;
    private final /* synthetic */ WorldArea o = new WorldArea(lIlIllllIllII[0], lIlIllllIllII[1], lIlIllllIllII[2], lIlIllllIllII[3], lIlIllllIllII[4]);
    private final /* synthetic */ List<WorldPoint> p = this.o.toWorldPointList();
    private final /* synthetic */ List<LocalPoint> r = new ArrayList();
    private /* synthetic */ int s = lIlIllllIllII[5];
    private /* synthetic */ boolean t = lIlIllllIllII[4];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean d() {
        Player local = Players.getLocal();
        return llIIIIllIIIIlII(local) ? lIlIllllIllII[4] : this.p.contains(local.getWorldLocation());
    }

    private static boolean llIIIIllIIIlIlI(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean llIIIIllIIIlIII(int i2) {
        return i2 > 0;
    }

    public a q() {
        return this.u;
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (llIIIIllIIIIlll(graphicsObjectCreated.getGraphicsObject().getId(), lIlIllllIllII[20])) {
            "".length();
            if (0 != 0) {
            }
        } else if (llIIIIllIIIIlll(graphicsObjectCreated.getGraphicsObject().getId(), lIlIllllIllII[21])) {
            this.r.add(graphicsObjectCreated.getGraphicsObject().getLocation());
            "".length();
        }
    }

    public int k() {
        return Vars.getBit(lIlIllllIllII[14]);
    }

    private static boolean llIIIIllIIIIllI(int i2) {
        return i2 == 0;
    }

    public int m() {
        return Static.getClient().getTickCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean s() {
        if (llIIIIllIIIllII(this.u, this.q.side())) {
            return lIlIllllIllII[4];
        }
        this.u = this.q.side();
        return lIlIllllIllII[7];
    }

    private static boolean llIIIIllIIIlIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    public int g() {
        if (llIIIIllIIIIlIl(j() ? 1 : 0)) {
            return lIlIllllIllII[4];
        }
        Widget widget = Widgets.get(lIlIllllIllII[6], lIlIllllIllII[8]);
        if (llIIIIllIIIIllI(Widgets.isVisible(widget) ? 1 : 0)) {
            return lIlIllllIllII[4];
        }
        String text = widget.getText();
        return llIIIIllIIIIlII(text) ? lIlIllllIllII[4] : Integer.parseInt(text.split(lIlIllllIlIll[lIlIllllIllII[4]])[lIlIllllIllII[7]].replace(lIlIllllIlIll[lIlIllllIllII[7]], lIlIllllIlIll[lIlIllllIllII[9]]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean i() {
        Player local = Players.getLocal();
        if (!llIIIIllIIIIlII(local) && llIIIIllIIIIlll(local.getWorldLocation().getRegionID(), lIlIllllIllII[13])) {
            ?? r0 = lIlIllllIllII[7];
            "".length();
            return " ".length() == "   ".length() ? ((((51 + 32) - 70) + 145) ^ (((113 + 125) - 122) + 26)) & (((115 ^ 17) ^ (6 ^ 116)) ^ (-" ".length())) : r0;
        }
        return lIlIllllIllII[4];
    }

    private static boolean llIIIIllIIIIlII(Object obj) {
        return obj == null;
    }

    public int f() {
        Widget widget = Widgets.get(lIlIllllIllII[6], lIlIllllIllII[3]);
        if (llIIIIllIIIIlII(widget)) {
            return lIlIllllIllII[4];
        }
        Matcher matcher = m.matcher(widget.getText());
        return llIIIIllIIIIlIl(matcher.find() ? 1 : 0) ? Integer.parseInt(matcher.group(lIlIllllIllII[7])) : lIlIllllIllII[4];
    }

    public boolean u() {
        return this.t;
    }

    private static boolean llIIIIllIIIIlll(int i2, int i3) {
        return i2 == i3;
    }

    private static String llIIIIlIlllllll(String llllllllllllllIllIIlllIlllIIIlII, String llllllllllllllIllIIlllIlllIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIlllIIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIllllIllII[18]), "DES");
            Cipher llllllllllllllIllIIlllIlllIIIllI = Cipher.getInstance("DES");
            llllllllllllllIllIIlllIlllIIIllI.init(lIlIllllIllII[9], secretKeySpec);
            return new String(llllllllllllllIllIIlllIlllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIlllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllIlllIIIlIl) {
            llllllllllllllIllIIlllIlllIIIlIl.printStackTrace();
            return null;
        }
    }

    public void n() {
        this.s = m();
    }

    public int p() {
        return Inventory.getCount(item -> {
            String[] strArr = new String[lIlIllllIllII[7]];
            strArr[lIlIllllIllII[4]] = lIlIllllIlIll[lIlIllllIllII[22]];
            if (llIIIIllIIIIllI(item.hasAction(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIlIllllIllII[7]];
                strArr2[lIlIllllIllII[4]] = lIlIllllIlIll[lIlIllllIllII[23]];
                if (!llIIIIllIIIIlIl(item.hasAction(strArr2) ? 1 : 0)) {
                    return lIlIllllIllII[4];
                }
            }
            ?? r0 = lIlIllllIllII[7];
            "".length();
            return (31 ^ 27) < (51 ^ 55) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        });
    }

    private static boolean llIIIIllIIIllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    @Inject
    public b(SquireWintertodtConfig squireWintertodtConfig) {
        this.q = squireWintertodtConfig;
        this.u = squireWintertodtConfig.side();
    }

    public WorldPoint e() {
        return this.p.get(new Random().nextInt(this.p.size()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llIIIIllIIIlIIl(chatMessage.getType(), ChatMessageType.SPAM) && llIIIIllIIIlIIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String message = chatMessage.getMessage();
        if (!llIIIIllIIIIllI(message.contains(lIlIllllIlIll[lIlIllllIllII[17]]) ? 1 : 0) || llIIIIllIIIIlIl(message.contains(lIlIllllIlIll[lIlIllllIllII[3]]) ? 1 : 0)) {
            this.s = lIlIllllIllII[4];
        }
        if (llIIIIllIIIIlIl(message.contains(lIlIllllIlIll[lIlIllllIllII[18]]) ? 1 : 0)) {
            a((boolean) lIlIllllIllII[7]);
        }
        if (llIIIIllIIIIlIl(message.contains(lIlIllllIlIll[lIlIllllIllII[19]]) ? 1 : 0)) {
            a((boolean) lIlIllllIllII[4]);
        }
    }

    private static void llIIIIllIIIIIII() {
        lIlIllllIlIll = new String[lIlIllllIllII[25]];
        lIlIllllIlIll[lIlIllllIllII[4]] = llIIIIlIllllllI("aG8=", "ROtVD");
        lIlIllllIlIll[lIlIllllIllII[7]] = llIIIIlIllllllI("Qw==", "fVrNU");
        lIlIllllIlIll[lIlIllllIllII[9]] = llIIIIlIlllllll("6hCAAfqC+bk=", "HHorJ");
        lIlIllllIlIll[lIlIllllIllII[11]] = llIIIIlIlllllll("AJPNceKMCWg=", "qKajr");
        lIlIllllIlIll[lIlIllllIllII[12]] = llIIIIlIllllllI("Rg==", "cxieW");
        lIlIllllIlIll[lIlIllllIllII[2]] = llIIIIlIllllllI("", "CiHZH");
        lIlIllllIlIll[lIlIllllIllII[17]] = llIIIIlIllllllI("KzwxARx4MDoFAHggOwQdeDs7Hwor", "XYTqo");
        lIlIllllIlIll[lIlIllllIllII[3]] = llIIIIlIllllllI("BR03CxMnBiwAADIbNgIS", "FrYla");
        lIlIllllIlIll[lIlIllllIllII[18]] = llIIIIlIlllllll("v8ZlCyhYIkIGTjkomgQLoiUaKHkmrM0L", "DwzEU");
        lIlIllllIlIll[lIlIllllIllII[19]] = llIIIIlIllllllI("OB4Gcg45HQVyHCM=", "LqiRh");
        lIlIllllIlIll[lIlIllllIllII[22]] = llIIIIlIllllllI("AiQM", "GExcb");
        lIlIllllIlIll[lIlIllllIllII[23]] = llIIIIlIlllllll("ziuVRjxfdsw=", "VjOIt");
        lIlIllllIlIll[lIlIllllIllII[24]] = llIIIIlIllllllI("WgoxeUs=", "rVURb");
    }

    private static boolean llIIIIllIIIlIll(int i2, int i3) {
        return i2 > i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    @Subscribe(priority = 10.0f)
    public void a(GameTick gameTick) {
        if (llIIIIllIIIlIIl(Static.getClient().getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        if (llIIIIllIIIlIlI(Players.getLocal().getAnimation(), lIlIllllIllII[5])) {
            this.s = m();
        }
        int freeSlots = Inventory.getFreeSlots();
        int[] iArr = new int[lIlIllllIllII[9]];
        iArr[lIlIllllIllII[4]] = lIlIllllIllII[15];
        iArr[lIlIllllIllII[7]] = lIlIllllIllII[16];
        boolean contains = Inventory.contains(iArr);
        int[] iArr2 = new int[lIlIllllIllII[9]];
        iArr2[lIlIllllIllII[4]] = lIlIllllIllII[15];
        iArr2[lIlIllllIllII[7]] = lIlIllllIllII[16];
        if (llIIIIllIIIlIll(Inventory.getCount(iArr2), g()) && llIIIIllIIIIlIl(this.t ? 1 : 0)) {
            a((boolean) lIlIllllIllII[4]);
        }
        if (llIIIIllIIIIllI(freeSlots) && llIIIIllIIIIlIl(this.t ? 1 : 0)) {
            a((boolean) lIlIllllIllII[4]);
            "".length();
            if ((132 ^ 128) < "  ".length()) {
            }
        } else if (llIIIIllIIIlIII(freeSlots) && llIIIIllIIIIllI(contains ? 1 : 0) && llIIIIllIIIIllI(this.t ? 1 : 0)) {
            a((boolean) lIlIllllIllII[7]);
        }
    }

    private static boolean llIIIIllIIIllIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llIIIIllIIIIlIl(int i2) {
        return i2 != 0;
    }

    public void a(boolean z) {
        Client client = Static.getClient();
        client.setQueuedMenu((MenuAutomated) null);
        client.setPendingAutomation((MenuAutomated) null);
        this.t = z;
    }

    public void o() {
        this.s = lIlIllllIllII[4];
    }

    public int t() {
        return this.s;
    }

    public int l() {
        return m() - t();
    }

    public int h() {
        if (llIIIIllIIIIlIl(j() ? 1 : 0)) {
            return lIlIllllIllII[4];
        }
        Widget widget = Widgets.get(lIlIllllIllII[6], lIlIllllIllII[10]);
        if (llIIIIllIIIIllI(Widgets.isVisible(widget) ? 1 : 0)) {
            return lIlIllllIllII[4];
        }
        String text = widget.getText();
        return llIIIIllIIIIlII(text) ? lIlIllllIllII[4] : Integer.parseInt(text.split(lIlIllllIlIll[lIlIllllIllII[11]])[lIlIllllIllII[7]].replace(lIlIllllIlIll[lIlIllllIllII[12]], lIlIllllIlIll[lIlIllllIllII[2]]));
    }

    private static void llIIIIllIIIIIlI() {
        lIlIllllIllII = new int[26];
        lIlIllllIllII[0] = (-10498) & 12125;
        lIlIllllIllII[1] = (-24693) & 28671;
        lIlIllllIllII[2] = 4 ^ 1;
        lIlIllllIllII[3] = (((17 + 74) - 48) + 153) ^ (((87 + 25) - 81) + 164);
        lIlIllllIllII[4] = ((((64 + 131) - 68) + 71) ^ (((13 + 120) - 52) + 66)) & (((132 ^ 163) ^ (182 ^ 196)) ^ (-" ".length()));
        lIlIllllIllII[5] = -" ".length();
        lIlIllllIllII[6] = (-13316) & 13711;
        lIlIllllIllII[7] = " ".length();
        lIlIllllIllII[8] = 68 ^ 94;
        lIlIllllIllII[9] = "  ".length();
        lIlIllllIllII[10] = (((133 + 163) - 174) + 45) ^ (((166 + 157) - 209) + 65);
        lIlIllllIllII[11] = "   ".length();
        lIlIllllIllII[12] = (130 ^ 195) ^ (45 ^ 104);
        lIlIllllIllII[13] = (-24770) & 31231;
        lIlIllllIllII[14] = (-16578) & 24557;
        lIlIllllIllII[15] = (-((-5001) & 16297)) & (-5) & 31996;
        lIlIllllIllII[16] = (-10529) & 31223;
        lIlIllllIllII[17] = (105 ^ 87) ^ (51 ^ 11);
        lIlIllllIllII[18] = (177 ^ 190) ^ (85 ^ 82);
        lIlIllllIllII[19] = (((74 + 24) - (-29)) + 22) ^ (((24 + 109) - 44) + 67);
        lIlIllllIllII[20] = (-7178) & 7679;
        lIlIllllIllII[21] = (-((-21279) & 31711)) & (-16897) & 28639;
        lIlIllllIllII[22] = (((74 + 53) - 79) + 107) ^ (((57 + 18) - (-13)) + 57);
        lIlIllllIllII[23] = (((63 + 7) - 64) + 131) ^ (((45 + 49) - 81) + 117);
        lIlIllllIllII[24] = 23 ^ 27;
        lIlIllllIllII[25] = (((138 + 140) - 266) + 136) ^ (((93 + 3) - 40) + 97);
    }

    private static String llIIIIlIllllllI(String llllllllllllllIllIIlllIllIllIlII, String llllllllllllllIllIIlllIllIllIIll) {
        String llllllllllllllIllIIlllIllIllIlII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIlllIllIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIlllIllIllIIll.toCharArray();
        int llllllllllllllIllIIlllIllIllIIII = lIlIllllIllII[4];
        char[] charArray2 = llllllllllllllIllIIlllIllIllIlII2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIllllIllII[4];
        while (llIIIIllIIIllIl(i2, length)) {
            char llllllllllllllIllIIlllIllIllIlIl = charArray2[i2];
            sb.append((char) (llllllllllllllIllIIlllIllIllIlIl ^ charArray[llllllllllllllIllIIlllIllIllIIII % charArray.length]));
            "".length();
            llllllllllllllIllIIlllIllIllIIII++;
            i2++;
            "".length();
            if ((68 ^ 64) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean j() {
        if (llIIIIllIIIlIII(k())) {
            ?? r0 = lIlIllllIllII[7];
            "".length();
            return ((110 ^ 103) & ((76 ^ 69) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIllllIllII[4];
    }

    static {
        llIIIIllIIIIIlI();
        llIIIIllIIIIIII();
        g = lIlIllllIllII[20];
        j = lIlIllllIllII[6];
        l = lIlIllllIllII[10];
        k = lIlIllllIllII[8];
        n = lIlIllllIllII[3];
        h = lIlIllllIllII[21];
        i = lIlIllllIllII[13];
        m = Pattern.compile(lIlIllllIlIll[lIlIllllIllII[24]]);
    }

    public void r() {
        a aVar;
        if (llIIIIllIIIllII(this.u, a.WEST)) {
            aVar = a.EAST;
            "".length();
            if ((((49 ^ 93) ^ (25 ^ 50)) & (((((21 + 149) - 15) + 69) ^ (((4 + 4) - (-126)) + 33)) ^ (-" ".length()))) >= "  ".length()) {
                return;
            }
        } else {
            aVar = a.WEST;
        }
        this.u = aVar;
    }
}
