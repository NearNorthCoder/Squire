package m.u.a.p000.e.s.q.t.i.r;

import gg.squire.mta.MagicArenaConfig;
import gg.squire.mta.SquireMTA;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.util.AsyncBufferedImage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: m.u.a.-.e.s.q.t.i.r.e  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/e.class */
public class e extends b {
    static final /* synthetic */ boolean I;
    private final /* synthetic */ ItemManager D;
    private /* synthetic */ boolean H;
    private final /* synthetic */ List<String> q;
    private static /* synthetic */ String[] lllIlIlIIlll;
    private /* synthetic */ g G;
    private static final /* synthetic */ int r;
    private static final /* synthetic */ Logger p;
    private final /* synthetic */ Client C;
    private static final /* synthetic */ String z;
    private static final /* synthetic */ int s;
    private static final /* synthetic */ String y;
    private final /* synthetic */ SquireMTA B;
    private static final /* synthetic */ int u;
    private final /* synthetic */ InfoBoxManager E;
    private static final /* synthetic */ int t;
    private /* synthetic */ d F;
    private static final /* synthetic */ int w;
    private static final /* synthetic */ int v;
    private final /* synthetic */ g[] A;
    private static final /* synthetic */ int x;
    private static /* synthetic */ int[] lllIlIlIllII;

    private static void lIIIllIIIIllIII() {
        lllIlIlIIlll = new String[lllIlIlIllII[22]];
        lllIlIlIIlll[lllIlIlIllII[1]] = lIIIllIIIIIlIlI("wuT26Rq5NW1voRiTje7bZQ==", "xgNBE");
        lllIlIlIIlll[lllIlIlIllII[2]] = lIIIllIIIIIlIlI("Kb5eBUJlk20h2X5cDi/x2L01JbU3fjxk", "SnrzH");
        lllIlIlIIlll[lllIlIlIllII[3]] = lIIIllIIIIIlIlI("2OrlDW5zhzSI5kkf3xVFFsFDur/i2NwG", "yVLsI");
        lllIlIlIIlll[lllIlIlIllII[4]] = lIIIllIIIIIllII("xOsb2SmTe4UQahyb/UvqZDJC6dkniIZi", "Xwkuu");
        lllIlIlIIlll[lllIlIlIllII[5]] = lIIIllIIIIIllll("OC4hAC0Wdz4VMhR3IQAlEzE=", "uWRtD");
        lllIlIlIIlll[lllIlIlIllII[6]] = lIIIllIIIIIllll("FT8VLh9mKRE7BiouAzsTIC0=", "FKpOr");
        lllIlIlIIlll[lllIlIlIllII[7]] = lIIIllIIIIIllll("Ny0JHT8ZdAkdMxs5WhoiGzIc", "zTziV");
        lllIlIlIIlll[lllIlIlIllII[8]] = lIIIllIIIIIllll("KiAqOw1ZLyQkHBUoNiQJHys=", "yMEPh");
        lllIlIlIIlll[lllIlIlIllII[9]] = lIIIllIIIIIllll("Li01ABkAdDUZHwgxZgcEAjIg", "cTFtp");
        lllIlIlIIlll[lllIlIlIllII[0]] = lIIIllIIIIIllII("nQare2bSr2YzyTt3gkLsmPWa03HkGImu", "lsZvx");
        lllIlIlIIlll[lllIlIlIllII[10]] = lIIIllIIIIIllII("nj7Lf/fCSrLvDhsuDYjDlw==", "nHXrp");
        lllIlIlIIlll[lllIlIlIllII[11]] = lIIIllIIIIIllll("ET0zQTQnJygFaA==", "HRFaR");
        lllIlIlIIlll[lllIlIlIllII[12]] = lIIIllIIIIIlIlI("Agkz6nWWPzk=", "YGHsZ");
        lllIlIlIIlll[lllIlIlIllII[13]] = lIIIllIIIIIlIlI("ykbYFil43z5hNGWGkktEDI3wv8kyguQe", "zvaLq");
        lllIlIlIIlll[lllIlIlIllII[18]] = lIIIllIIIIIllll("ITAkBRsJPmgKBxc7JwgAA3kzFFIQMDwBUhwk", "gYHir");
        lllIlIlIIlll[lllIlIlIllII[20]] = lIIIllIIIIIllII("BqpPmgfpCGxMRE00nph72jZ/r7blHJ3v", "WvWQQ");
        lllIlIlIIlll[lllIlIlIllII[21]] = lIIIllIIIIIllll("GDwAVwouJhsTVg==", "ASuwl");
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIIllIIIIllIlI(c() ? 1 : 0)) {
            return;
        }
        String message = chatMessage.getMessage();
        if (lIIIllIIIIlllIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            if (!lIIIllIIIIllllI(message.contains(lllIlIlIIlll[lllIlIlIllII[10]]) ? 1 : 0)) {
                if (lIIIllIIIIllllI(message.equals(lllIlIlIIlll[lllIlIlIllII[13]]) ? 1 : 0)) {
                    g m2 = m();
                    if (lIIIllIIIIlllII(m2.M, d.EMPTY)) {
                        a(m2, d.EMPTY);
                        return;
                    }
                    return;
                }
                return;
            }
            d a = d.a(message.replace(lllIlIlIIlll[lllIlIlIllII[11]], lllIlIlIIlll[lllIlIlIllII[12]]).trim());
            g m3 = m();
            if (lIIIllIIIIlllII(m3.M, a)) {
                a(m3, a);
            }
            "".length();
            if ("  ".length() < (-" ".length())) {
            }
        }
    }

    private static int lIIIllIIIlIIIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public d l() {
        int i = lllIlIlIllII[1];
        while (lIIIllIIIlIIIII(i, lllIlIlIllII[6])) {
            Widget widget = this.C.getWidget(lllIlIlIllII[15], lllIlIlIllII[8] + i);
            if (lIIIllIIIlIIIIl(widget)) {
                return null;
            }
            String text = widget.getText();
            if (lIIIllIIIIlllll(Integer.parseInt(this.C.getWidget(lllIlIlIllII[15], lllIlIlIllII[12] + i).getText()), lllIlIlIllII[16])) {
                return d.a(text);
            }
            i++;
            "".length();
            if ("  ".length() <= ((134 ^ 188) & ((101 ^ 95) ^ (-1)))) {
                return null;
            }
        }
        return null;
    }

    @Inject
    private e(Client client, MagicArenaConfig magicArenaConfig, SquireMTA squireMTA, ItemManager itemManager, InfoBoxManager infoBoxManager) {
        super(magicArenaConfig);
        String[] strArr = new String[lllIlIlIllII[0]];
        strArr[lllIlIlIllII[1]] = lllIlIlIIlll[lllIlIlIllII[1]];
        strArr[lllIlIlIllII[2]] = lllIlIlIIlll[lllIlIlIllII[2]];
        strArr[lllIlIlIllII[3]] = lllIlIlIIlll[lllIlIlIllII[3]];
        strArr[lllIlIlIllII[4]] = lllIlIlIIlll[lllIlIlIllII[4]];
        strArr[lllIlIlIllII[5]] = lllIlIlIIlll[lllIlIlIllII[5]];
        strArr[lllIlIlIllII[6]] = lllIlIlIIlll[lllIlIlIllII[6]];
        strArr[lllIlIlIllII[7]] = lllIlIlIIlll[lllIlIlIllII[7]];
        strArr[lllIlIlIllII[8]] = lllIlIlIIlll[lllIlIlIllII[8]];
        strArr[lllIlIlIllII[9]] = lllIlIlIIlll[lllIlIlIllII[9]];
        this.q = Arrays.asList(strArr);
        this.A = new g[lllIlIlIllII[7]];
        this.C = client;
        this.B = squireMTA;
        this.D = itemManager;
        this.E = infoBoxManager;
    }

    private static boolean lIIIllIIIIllIll(Object obj) {
        return obj != null;
    }

    public List<String> o() {
        return this.q;
    }

    private g m() {
        g gVar = null;
        double d = Double.MAX_VALUE;
        WorldPoint worldLocation = this.C.getLocalPlayer().getWorldLocation();
        g[] gVarArr = this.A;
        int length = gVarArr.length;
        int i = lllIlIlIllII[1];
        while (lIIIllIIIlIIIII(i, length)) {
            g gVar2 = gVarArr[i];
            if (lIIIllIIIlIIIIl(gVar2)) {
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
            } else {
                double distanceTo = gVar2.L.getWorldLocation().distanceTo(worldLocation);
                if (!lIIIllIIIIllIll(gVar) || lIIIllIIIlIIIll(lIIIllIIIlIIIlI(distanceTo, d))) {
                    gVar = gVar2;
                    d = distanceTo;
                }
            }
            i++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return gVar;
    }

    private static String lIIIllIIIIIllII(String lllllllllllllllIIllIlIlllIIIIlll, String lllllllllllllllIIllIlIlllIIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlllIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIlIllII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIlllIIIlIII) {
            lllllllllllllllIIllIlIlllIIIlIII.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        int i;
        if (lIIIllIIIIllIlI(c() ? 1 : 0)) {
            return;
        }
        GameObject gameObject = gameObjectSpawned.getGameObject();
        switch (gameObject.getId()) {
            case 23678:
            case 23679:
                i = lllIlIlIllII[1];
                "".length();
                if ((((64 ^ 62) ^ (105 ^ 31)) & (((192 ^ 170) ^ (112 ^ 18)) ^ (-" ".length()))) < 0) {
                    return;
                }
                break;
            case 23680:
            case 23681:
                i = lllIlIlIllII[2];
                "".length();
                if (0 != 0) {
                    return;
                }
                break;
            case 23682:
            case 23683:
                i = lllIlIlIllII[3];
                "".length();
                if ((((91 ^ 7) ^ ((23 ^ 59) & ((26 ^ 54) ^ (-1)))) & (((((33 + 133) - 136) + 187) ^ (((81 + 28) - 49) + 73)) ^ (-" ".length()))) != 0) {
                    return;
                }
                break;
            case 23684:
            case 23685:
                i = lllIlIlIllII[4];
                "".length();
                if (" ".length() < 0) {
                    return;
                }
                break;
            case 23686:
            case 23687:
                i = lllIlIlIllII[5];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
                break;
            case 23688:
            case 23689:
                i = lllIlIlIllII[6];
                "".length();
                if ((20 ^ 16) < (70 ^ 66)) {
                    return;
                }
                break;
            default:
                return;
        }
        g gVar = this.A[i];
        if (lIIIllIIIIllIll(gVar)) {
            gVar.L = gameObject;
            "".length();
            if ((true ^ true) && ((true ^ true) ^ true)) {
                return;
            }
            return;
        }
        g gVar2 = new g();
        gVar2.L = gameObject;
        gVar2.M = d.UNKNOWN;
        this.A[i] = gVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z2;
        lIIIllIIIIllIIl();
        lIIIllIIIIllIII();
        v = lllIlIlIllII[12];
        z = lllIlIlIIlll[lllIlIlIllII[20]];
        w = lllIlIlIllII[6];
        u = lllIlIlIllII[8];
        y = lllIlIlIIlll[lllIlIlIllII[21]];
        r = lllIlIlIllII[14];
        x = lllIlIlIllII[16];
        s = lllIlIlIllII[19];
        t = lllIlIlIllII[7];
        if (lIIIllIIIIllIlI(e.class.desiredAssertionStatus() ? 1 : 0)) {
            int i = lllIlIlIllII[2];
            "".length();
            z2 = i;
            if ((-"  ".length()) >= 0) {
                return;
            }
        } else {
            z2 = lllIlIlIllII[1];
        }
        I = z2;
        p = LoggerFactory.getLogger(e.class);
    }

    @Override // m.u.a.p000.e.s.q.t.i.r.b
    public void renderItemOverlay(Graphics2D graphics2D, int i, WidgetItem widgetItem) {
        if (lIIIllIIIIllIlI(I ? 1 : 0) && lIIIllIIIIllIlI(c() ? 1 : 0)) {
            throw new AssertionError();
        }
        if (!lIIIllIIIIllIll(this.F) || lIIIllIIIlIIlIl(this.F.i(), i)) {
            return;
        }
        a(graphics2D, widgetItem, Color.GREEN);
    }

    private static boolean lIIIllIIIIlllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIllIIIIlllII(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    @Override // m.u.a.p000.e.s.q.t.i.r.b
    public void a(Graphics2D graphics2D) {
        if (!lIIIllIIIIllIll(this.F) || lIIIllIIIIllIlI(c() ? 1 : 0)) {
            return;
        }
        int i = lllIlIlIllII[1];
        g[] gVarArr = this.A;
        int length = gVarArr.length;
        int i2 = lllIlIlIllII[1];
        while (lIIIllIIIlIIIII(i2, length)) {
            g gVar = gVarArr[i2];
            if (lIIIllIIIlIIIIl(gVar)) {
                "".length();
                if ("  ".length() > "   ".length()) {
                    return;
                }
            } else {
                GameObject gameObject = gVar.L;
                d dVar = gVar.M;
                if (lIIIllIIIIlllIl(dVar, d.EMPTY)) {
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                } else {
                    if (lIIIllIIIIlllIl(dVar, this.F)) {
                        this.C.setHintArrow(gameObject.getWorldLocation());
                        i = lllIlIlIllII[2];
                        this.H = lllIlIlIllII[2];
                    }
                    AsyncBufferedImage image = this.D.getImage(dVar.i());
                    Point canvasImageLocation = Perspective.getCanvasImageLocation(this.C, gameObject.getLocalLocation(), image, lllIlIlIllII[19]);
                    if (lIIIllIIIIllIll(canvasImageLocation)) {
                        graphics2D.drawImage(image, canvasImageLocation.getX(), canvasImageLocation.getY(), (ImageObserver) null);
                        "".length();
                    }
                }
            }
            i2++;
            "".length();
            if ((-(68 ^ 65)) >= 0) {
                return;
            }
        }
        if (lIIIllIIIIllIlI(i) && lIIIllIIIIllIll(this.G)) {
            this.C.setHintArrow(this.G.L.getWorldLocation());
            this.H = lllIlIlIllII[2];
        }
    }

    private static boolean lIIIllIIIlIIlIl(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (lIIIllIIIIlllIl(gameStateChanged.getGameState(), GameState.LOGGED_IN) && lIIIllIIIIllIlI(c() ? 1 : 0)) {
            k();
            if (lIIIllIIIIllllI(this.H ? 1 : 0)) {
                this.C.clearHintArrow();
                this.H = lllIlIlIllII[1];
            }
        }
    }

    private static boolean lIIIllIIIlIIlII(int i, int i2) {
        return i <= i2;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        if (lIIIllIIIIllIlI(c() ? 1 : 0)) {
            return;
        }
        d l = l();
        if (!lIIIllIIIIllIll(this.F) || lIIIllIIIIlllII(this.F, l)) {
            if (lIIIllIIIIllIll(this.F)) {
                this.E.removeIf(infoBox -> {
                    return infoBox instanceof f;
                });
                this.E.addInfoBox(new f(this.B));
            }
            p.debug(lllIlIlIIlll[lllIlIlIllII[0]], this.F);
            this.F = l;
            Arrays.stream(this.A).filter((v0) -> {
                return Objects.nonNull(v0);
            }).forEach(gVar -> {
                gVar.M = d.UNKNOWN;
            });
            this.C.clearHintArrow();
        }
        this.G = n();
    }

    public g n() {
        if (lIIIllIIIIllIll(this.F)) {
            g[] gVarArr = this.A;
            int length = gVarArr.length;
            int i = lllIlIlIllII[1];
            while (lIIIllIIIlIIIII(i, length)) {
                g gVar = gVarArr[i];
                if (lIIIllIIIIllIll(gVar) && lIIIllIIIIlllIl(gVar.M, this.F)) {
                    return gVar;
                }
                i++;
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private static void lIIIllIIIIllIIl() {
        lllIlIlIllII = new int[23];
        lllIlIlIllII[0] = 49 ^ 56;
        lllIlIlIllII[1] = ((217 ^ 140) ^ (160 ^ 190)) & (((95 ^ 21) ^ " ".length()) ^ (-" ".length()));
        lllIlIlIllII[2] = " ".length();
        lllIlIlIllII[3] = "  ".length();
        lllIlIlIllII[4] = "   ".length();
        lllIlIlIllII[5] = (((81 + 138) - 99) + 41) ^ (((51 + 68) - 117) + 163);
        lllIlIlIllII[6] = 188 ^ 185;
        lllIlIlIllII[7] = (38 ^ 85) ^ (69 ^ 48);
        lllIlIlIllII[8] = 138 ^ 141;
        lllIlIlIllII[9] = 52 ^ 60;
        lllIlIlIllII[10] = (((16 + 154) - 146) + 176) ^ (((180 + 116) - 269) + 167);
        lllIlIlIllII[11] = 78 ^ 69;
        lllIlIlIllII[12] = 53 ^ 57;
        lllIlIlIllII[13] = 93 ^ 80;
        lllIlIlIllII[14] = (-17161) & 30622;
        lllIlIlIllII[15] = ((41 + 189) - 123) + 87;
        lllIlIlIllII[16] = 85 ^ 75;
        lllIlIlIllII[17] = -" ".length();
        lllIlIlIllII[18] = (((106 + 109) - 112) + 35) ^ (((94 + 78) - 95) + 55);
        lllIlIlIllII[19] = (((79 ^ 58) + (18 ^ 70)) - (100 ^ 93)) + (149 ^ 147);
        lllIlIlIllII[20] = (91 ^ 34) ^ (79 ^ 57);
        lllIlIlIllII[21] = (16 ^ 58) ^ (124 ^ 70);
        lllIlIlIllII[22] = 106 ^ 123;
    }

    private static boolean lIIIllIIIIllllI(int i) {
        return i != 0;
    }

    private static boolean lIIIllIIIIlllll(int i, int i2) {
        return i == i2;
    }

    private static String lIIIllIIIIIllll(String lllllllllllllllIIllIlIllIlllIlll, String lllllllllllllllIIllIlIllIlllIllI) {
        String lllllllllllllllIIllIlIllIlllIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIlIllIlllIlII = lllllllllllllllIIllIlIllIlllIllI.toCharArray();
        int lllllllllllllllIIllIlIllIlllIIll = lllIlIlIllII[1];
        char[] charArray = lllllllllllllllIIllIlIllIlllIlll2.toCharArray();
        int length = charArray.length;
        int i = lllIlIlIllII[1];
        while (lIIIllIIIlIIIII(i, length)) {
            char lllllllllllllllIIllIlIllIllllIII = charArray[i];
            sb.append((char) (lllllllllllllllIIllIlIllIllllIII ^ lllllllllllllllIIllIlIllIlllIlII[lllllllllllllllIIllIlIllIlllIIll % lllllllllllllllIIllIlIllIlllIlII.length]));
            "".length();
            lllllllllllllllIIllIlIllIlllIIll++;
            i++;
            "".length();
            if ("  ".length() > ((156 ^ 154) ^ "  ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIllIIIIllIlI(int i) {
        return i == 0;
    }

    private static boolean lIIIllIIIlIIIll(int i) {
        return i < 0;
    }

    private void a(Graphics2D graphics2D, WidgetItem widgetItem, Color color) {
        Rectangle canvasBounds = widgetItem.getCanvasBounds();
        graphics2D.setColor(color);
        graphics2D.draw(canvasBounds);
    }

    private void a(g gVar, d dVar) {
        d dVar2;
        int lllllllllllllllIIllIlIlllIlllIll = Arrays.asList(this.A).indexOf(gVar);
        if (lIIIllIIIIllIlI(I ? 1 : 0) && lIIIllIIIIlllll(lllllllllllllllIIllIlIlllIlllIll, lllIlIlIllII[17])) {
            throw new AssertionError();
        }
        int lllllllllllllllIIllIlIlllIlllIlI = dVar.ordinal();
        p.debug(lllIlIlIIlll[lllIlIlIllII[18]], Integer.valueOf(lllllllllllllllIIllIlIlllIlllIll), dVar);
        int i = lllIlIlIllII[1];
        while (lIIIllIIIlIIIII(i, lllIlIlIllII[7])) {
            int i2 = (lllllllllllllllIIllIlIlllIlllIll + i) % lllIlIlIllII[7];
            int i3 = (lllllllllllllllIIllIlIlllIlllIlI + i) % lllIlIlIllII[7];
            g gVar2 = this.A[i2];
            if (lIIIllIIIlIIlII(i3, lllIlIlIllII[5])) {
                dVar2 = d.values()[i3];
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            } else {
                dVar2 = d.EMPTY;
            }
            gVar2.M = dVar2;
            i++;
            "".length();
            if ("   ".length() <= (((5 ^ 79) ^ (48 ^ 106)) & (((((67 + 108) - 77) + 31) ^ (((83 + 71) - 107) + 98)) ^ (-" ".length())))) {
                return;
            }
        }
    }

    private static boolean lIIIllIIIlIIIIl(Object obj) {
        return obj == null;
    }

    private void k() {
        Arrays.fill(this.A, (Object) null);
    }

    private static String lIIIllIIIIIlIlI(String lllllllllllllllIIllIlIllIllIIIII, String lllllllllllllllIIllIlIllIllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIllIllIIIIl.getBytes(StandardCharsets.UTF_8)), lllIlIlIllII[9]), "DES");
            Cipher lllllllllllllllIIllIlIllIllIIlII = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIllIllIIlII.init(lllIlIlIllII[3], secretKeySpec);
            return new String(lllllllllllllllIIllIlIllIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIllIllIIIll) {
            lllllllllllllllIIllIlIllIllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIlIIIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // m.u.a.p000.e.s.q.t.i.r.b
    public boolean c() {
        Player localPlayer = this.C.getLocalPlayer();
        if (lIIIllIIIIllIll(localPlayer) && lIIIllIIIIlllll(localPlayer.getWorldLocation().getRegionID(), lllIlIlIllII[14]) && lIIIllIIIIlllll(localPlayer.getWorldLocation().getPlane(), lllIlIlIllII[3])) {
            ?? r0 = lllIlIlIllII[2];
            "".length();
            return " ".length() < " ".length() ? ((109 ^ 11) ^ (217 ^ 146)) & (((63 ^ 86) ^ (56 ^ 124)) ^ (-" ".length())) : r0;
        }
        return lllIlIlIllII[1];
    }

    public g[] p() {
        return this.A;
    }

    @Override // m.u.a.p000.e.s.q.t.i.r.b
    public c d() {
        return c.ALCHEMY;
    }
}
