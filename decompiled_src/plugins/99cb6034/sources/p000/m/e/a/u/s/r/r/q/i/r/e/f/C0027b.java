package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.ObjectComposition;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.events.MenuActionProcessed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/b.class */
public class C0027b {
    private static final /* synthetic */ Pattern u;
    @VisibleForTesting
    final /* synthetic */ Map<N, C0029d> x = new HashMap();
    private static final /* synthetic */ Logger q;
    private final /* synthetic */ Client y;
    private static final /* synthetic */ ImmutableSet<Integer> w;
    private static /* synthetic */ int[] lIllllllIlIl;
    private static final /* synthetic */ Pattern t;
    private static final /* synthetic */ Duration r;
    private final /* synthetic */ ConfigManager A;
    private static final /* synthetic */ Pattern v;
    private final /* synthetic */ C0043r z;
    private static /* synthetic */ String[] lIllllllIIll;
    static final /* synthetic */ boolean B;
    private static final /* synthetic */ Pattern s;

    private static boolean llllIIIIIlIlII(int i, int i2) {
        return i < i2;
    }

    public H b(N n) {
        return (H) this.A.getRSProfileConfiguration(lIllllllIIll[lIllllllIlIl[8]], a(n), H.class);
    }

    private static String llllIIIIIIlIIl(String lllllllllllllllIlIlIllllIIlIIIII, String lllllllllllllllIlIlIllllIIIlllll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllllIIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllllIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIllllIIlIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIllllIIlIIIlI.init(lIllllllIlIl[3], lllllllllllllllIlIlIllllIIlIIIll);
            return new String(lllllllllllllllIlIlIllllIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllllIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIllllIIlIIIIl) {
            lllllllllllllllIlIlIllllIIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIIIlIIll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z;
        llllIIIIIIllll();
        llllIIIIIIlIlI();
        if (llllIIIIIlIIII(C0027b.class.desiredAssertionStatus() ? 1 : 0)) {
            int i = lIllllllIlIl[1];
            "".length();
            z = i;
            if ((((141 ^ 173) ^ (146 ^ 154)) & (((115 ^ 8) ^ (234 ^ 185)) ^ (-" ".length()))) > ((40 ^ 78) ^ (103 ^ 5))) {
                return;
            }
        } else {
            z = lIllllllIlIl[0];
        }
        B = z;
        q = LoggerFactory.getLogger(C0027b.class);
        r = Duration.ofSeconds(30L);
        s = Pattern.compile(lIllllllIIll[lIllllllIlIl[11]]);
        t = Pattern.compile(lIllllllIIll[lIllllllIlIl[12]]);
        u = Pattern.compile(lIllllllIIll[lIllllllIlIl[13]]);
        v = Pattern.compile(lIllllllIIll[lIllllllIlIl[14]]);
        w = ImmutableSet.of(Integer.valueOf(lIllllllIlIl[15]), Integer.valueOf(lIllllllIlIl[16]), Integer.valueOf(lIllllllIlIl[17]), Integer.valueOf(lIllllllIlIl[18]));
    }

    @Inject
    public C0027b(Client client, C0043r c0043r, ConfigManager configManager) {
        this.y = client;
        this.z = c0043r;
        this.A = configManager;
    }

    private static void llllIIIIIIllll() {
        lIllllllIlIl = new int[20];
        lIllllllIlIl[0] = ((71 ^ 103) ^ (94 ^ 88)) & (((75 ^ 106) ^ (10 ^ 13)) ^ (-" ".length()));
        lIllllllIlIl[1] = " ".length();
        lIllllllIlIl[2] = -" ".length();
        lIllllllIlIl[3] = "  ".length();
        lIllllllIlIl[4] = "   ".length();
        lIllllllIlIl[5] = (156 ^ 196) ^ (45 ^ 113);
        lIllllllIlIl[6] = 116 ^ 113;
        lIllllllIlIl[7] = 197 ^ 195;
        lIllllllIlIl[8] = 173 ^ 170;
        lIllllllIlIl[9] = (40 ^ 91) ^ (63 ^ 68);
        lIllllllIlIl[10] = (82 ^ 85) ^ (204 ^ 194);
        lIllllllIlIl[11] = (((54 + 19) - (-8)) + 122) ^ (((131 + 131) - 204) + 135);
        lIllllllIlIl[12] = 22 ^ 29;
        lIllllllIlIl[13] = (((106 + 140) - 176) + 87) ^ (((120 + 127) - 244) + 142);
        lIllllllIlIl[14] = 22 ^ 27;
        lIllllllIlIl[15] = (-((-11143) & 27631)) & (-8198) & 30717;
        lIllllllIlIl[16] = (-((-23953) & 32150)) & (-2121) & 16351;
        lIllllllIlIl[17] = (-2069) & 23551;
        lIllllllIlIl[18] = (-8193) & 31189;
        lIllllllIlIl[19] = (9 ^ 21) ^ (189 ^ 175);
    }

    private static String llllIIIIIIIlll(String lllllllllllllllIlIlIllllIlIIIlIl, String lllllllllllllllIlIlIllllIlIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllllIlIIIlII.getBytes(StandardCharsets.UTF_8)), lIllllllIlIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllllIlIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllllIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIllllIlIIIllI) {
            lllllllllllllllIlIlIllllIlIIIllI.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static H a(String str) {
        if (llllIIIIIlIIII(str.contains(lIllllllIIll[lIllllllIlIl[0]]) ? 1 : 0)) {
            return null;
        }
        Matcher matcher = s.matcher(str);
        Matcher matcher2 = matcher;
        if (llllIIIIIlIIII(matcher.matches() ? 1 : 0)) {
            Matcher matcher3 = t.matcher(str);
            matcher2 = matcher3;
            if (llllIIIIIlIIII(matcher3.find() ? 1 : 0)) {
                Matcher matcher4 = u.matcher(str);
                matcher2 = matcher4;
                if (llllIIIIIlIIII(matcher4.matches() ? 1 : 0)) {
                    Matcher matcher5 = v.matcher(str);
                    matcher2 = matcher5;
                    if (!llllIIIIIlIIIl(matcher5.matches() ? 1 : 0)) {
                        return null;
                    }
                }
            }
        }
        String group = matcher2.group(lIllllllIIll[lIllllllIlIl[1]]);
        int i = lIllllllIlIl[2];
        switch (group.hashCode()) {
            case 109801339:
                if (llllIIIIIlIIIl(group.equals(lIllllllIIll[lIllllllIlIl[4]]) ? 1 : 0)) {
                    i = lIllllllIlIl[1];
                    break;
                }
                break;
            case 111384492:
                if (llllIIIIIlIIIl(group.equals(lIllllllIIll[lIllllllIlIl[3]]) ? 1 : 0)) {
                    i = lIllllllIlIl[0];
                    "".length();
                    if ((-" ".length()) > 0) {
                        return null;
                    }
                }
                break;
        }
        switch (i) {
            case 0:
                return H.ULTRACOMPOST;
            case 1:
                return H.SUPERCOMPOST;
            default:
                return H.COMPOST;
        }
    }

    private static String llllIIIIIIlIII(String lllllllllllllllIlIlIllllIIllIlIl, String lllllllllllllllIlIlIllllIIllIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIllllIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlIllllIIllIlII.toCharArray();
        int lllllllllllllllIlIlIllllIIllIIIl = lIllllllIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllllllIlIl[0];
        while (llllIIIIIlIlII(i, length)) {
            char lllllllllllllllIlIlIllllIIllIllI = charArray2[i];
            sb.append((char) (lllllllllllllllIlIlIllllIIllIllI ^ charArray[lllllllllllllllIlIlIllllIIllIIIl % charArray.length]));
            "".length();
            lllllllllllllllIlIlIllllIIllIIIl++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llllIIIIIlIIII(int i) {
        return i == 0;
    }

    private static boolean llllIIIIIlIlll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    private boolean a(C0029d c0029d) {
        LocalPoint fromWorld = LocalPoint.fromWorld(this.y, c0029d.g());
        if (llllIIIIIlIIlI(fromWorld)) {
            return lIllllllIlIl[0];
        }
        int aO = c0029d.h().aO();
        GameObject gameObject = null;
        GameObject[] gameObjects = this.y.getScene().getTiles()[this.y.getPlane()][fromWorld.getSceneX()][fromWorld.getSceneY()].getGameObjects();
        int lllllllllllllllIlIlIllllIlIlIlll = gameObjects.length;
        int i = lIllllllIlIl[0];
        do {
            if (llllIIIIIlIlII(i, lllllllllllllllIlIlIllllIlIlIlll)) {
                GameObject gameObject2 = gameObjects[i];
                if (llllIIIIIlIlIl(gameObject2) && llllIIIIIlIIll(this.y.getObjectDefinition(gameObject2.getId()).getVarbitId(), aO)) {
                    gameObject = gameObject2;
                    "".length();
                    if (0 != 0) {
                        return ((111 ^ 87) ^ (22 ^ 53)) & (((89 ^ 101) ^ (229 ^ 194)) ^ (-" ".length()));
                    }
                } else {
                    i++;
                    "".length();
                }
            }
            if (llllIIIIIlIIII(B ? 1 : 0) && llllIIIIIlIIlI(gameObject)) {
                throw new AssertionError();
            }
            WorldPoint worldLocation = this.y.getLocalPlayer().getWorldLocation();
            int lllllllllllllllIlIlIllllIlIlIlll2 = worldLocation.getX();
            int y = worldLocation.getY();
            WorldPoint g = c0029d.g();
            int x = g.getX();
            int y2 = g.getY();
            int sizeX = (x + gameObject.sizeX()) - lIllllllIlIl[1];
            int sizeY = (y2 + gameObject.sizeY()) - lIllllllIlIl[1];
            if (llllIIIIIlIllI(lllllllllllllllIlIlIllllIlIlIlll2, x - lIllllllIlIl[1]) && llllIIIIIlIlll(lllllllllllllllIlIlIllllIlIlIlll2, sizeX + lIllllllIlIl[1]) && llllIIIIIlIllI(y, y2 - lIllllllIlIl[1]) && llllIIIIIlIlll(y, sizeY + lIllllllIlIl[1])) {
                ?? r0 = lIllllllIlIl[1];
                "".length();
                return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllllllIlIl[0];
        } while (((35 ^ 1) & ((132 ^ 166) ^ (-1))) < " ".length());
        return (true ^ true) & ((true ^ true) ^ true);
    }

    private static String a(N n) {
        return n.aJ() + ".compost";
    }

    @Subscribe
    public void a(MenuActionProcessed menuActionProcessed) {
        if (llllIIIIIlIIII(b(menuActionProcessed) ? 1 : 0)) {
            return;
        }
        ObjectComposition objectDefinition = this.y.getObjectDefinition(menuActionProcessed.getIdentifier());
        WorldPoint fromScene = WorldPoint.fromScene(this.y, menuActionProcessed.getParam0(), menuActionProcessed.getParam1(), this.y.getPlane());
        N n = (N) this.z.d(fromScene).stream().flatMap(c0042q -> {
            return Arrays.stream(c0042q.ae());
        }).filter(n2 -> {
            if (llllIIIIIlIIll(n2.aO(), objectDefinition.getVarbitId())) {
                ?? r0 = lIllllllIlIl[1];
                "".length();
                return (true ^ false) == ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllllllIlIl[0];
        }).findFirst().orElse(null);
        if (llllIIIIIlIIlI(n)) {
            return;
        }
        q.debug(lIllllllIIll[lIllllllIlIl[9]], n);
        this.x.put(n, new C0029d(Instant.now().plus((TemporalAmount) r), fromScene, n));
        "".length();
    }

    private static boolean llllIIIIIlIIlI(Object obj) {
        return obj == null;
    }

    private void e() {
        this.x.values().removeIf(c0029d -> {
            return Instant.now().isAfter(c0029d.f());
        });
        "".length();
    }

    private static boolean llllIIIIIlIIIl(int i) {
        return i != 0;
    }

    public void a(N n, H h) {
        q.debug(lIllllllIIll[lIllllllIlIl[5]], h, n);
        if (!llllIIIIIlIIlI(h)) {
            this.A.setRSProfileConfiguration(lIllllllIIll[lIllllllIlIl[7]], a(n), h);
            return;
        }
        this.A.unsetRSProfileConfiguration(lIllllllIIll[lIllllllIlIl[6]], a(n));
        "".length();
        if (((((166 + 161) - 201) + 42) ^ (((21 + 143) - 64) + 72)) < 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    private boolean b(MenuActionProcessed menuActionProcessed) {
        switch (C0028c.C[menuActionProcessed.getOpcode().ordinal()]) {
            case 1:
                Widget selectedWidget = this.y.getSelectedWidget();
                if (llllIIIIIlIIII(B ? 1 : 0) && llllIIIIIlIIlI(selectedWidget)) {
                    throw new AssertionError();
                }
                if (!llllIIIIIlIIII(w.contains(Integer.valueOf(selectedWidget.getItemId())) ? 1 : 0) || llllIIIIIlIIll(selectedWidget.getId(), WidgetInfo.SPELL_LUNAR_FERTILE_SOIL.getPackedId())) {
                    ?? r0 = lIllllllIlIl[1];
                    "".length();
                    return ((85 ^ 22) & ((200 ^ 139) ^ (-1))) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllllllIlIl[0];
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return lIllllllIIll[lIllllllIlIl[10]].equals(menuActionProcessed.getOption());
            default:
                return lIllllllIlIl[0];
        }
    }

    private static boolean llllIIIIIlIlIl(Object obj) {
        return obj != null;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        switch (C0028c.D[gameStateChanged.getGameState().ordinal()]) {
            case 1:
            case 2:
                return;
            default:
                this.x.clear();
                return;
        }
    }

    private static boolean llllIIIIIlIllI(int i, int i2) {
        return i >= i2;
    }

    private static void llllIIIIIIlIlI() {
        lIllllllIIll = new String[lIllllllIlIl[19]];
        lIllllllIIll[lIllllllIlIl[0]] = llllIIIIIIIlll("U6qchZ1SWmM=", "NSIUr");
        lIllllllIIll[lIllllllIlIl[1]] = llllIIIIIIlIII("OQYkJgYpHR0vGT8=", "ZiIVi");
        lIllllllIIll[lIllllllIlIl[3]] = llllIIIIIIlIIl("vnUCaHS7D4k=", "gaQth");
        lIllllllIIll[lIllllllIlIl[4]] = llllIIIIIIlIII("AjE9KgM=", "qDMOq");
        lIllllllIIll[lIllllllIlIl[5]] = llllIIIIIIlIII("AxsOOgQ+CEErAj0fDjsZcBwVKRk1TzozEA1PBycfcB8APA44TzozEA0=", "PoaHm");
        lIllllllIIll[lIllllllIlIl[6]] = llllIIIIIIlIIl("8c3CAJDT5/zBeJv3HBbuFg==", "ywOnx");
        lIllllllIIll[lIllllllIlIl[7]] = llllIIIIIIlIII("ECwvAgAWJCEMHQoi", "dEBgt");
        lIllllllIIll[lIllllllIlIl[8]] = llllIIIIIIlIIl("IuY/vIjSQElunu++VQtNdA==", "suZBO");
        lIllllllIIll[lIllllllIlIl[9]] = llllIIIIIIIlll("72P8zA0FKNlmL5krUxIukFm3UuZpJO3WfnrqrdFnRrz+l7jKEbh1prat7dGrvIiv", "Flrxx");
        lIllllllIIll[lIllllllIlIl[10]] = llllIIIIIIlIII("DzoWNRQlIA==", "FTeEq");
        lIllllllIIll[lIllllllIlIl[11]] = llllIIIIIIlIII("MTUGbhIaPxI6RhwyFm5IQ3oEJxIAeltxWgs1Hj4JGy4nNxYNZAYiEho7Dz0TGD8BMk8LNR4+CRsuL2A=", "hZsNf");
        lIllllllIIll[lIllllllIlIl[12]] = llllIIIIIIIlll("bemsOQQOxWTULWV5L621RojxySGaoiKu6CZ2sjwnM2PQNzyyeeTVAk6gxbceTTOrbNF5O3bS7ekrX8bIEQ1LlhcgRerr4sX9", "mAxoI");
        lIllllllIIll[lIllllllIlIl[13]] = llllIIIIIIlIII("DTI9PG13cXQnLCp6NSM/PDswNm07PzEhbXEuJiosLT8wMys8KCAmITApMStkeS09OyV5cmtzLjY3JCA+LQ4tPyhnLzg7PzgmJzo9PCgoZi42NyQgPi1ya3VtdHogJyh5KSQqITV6Ny4jfi50IiwyP3QmOXk7OjZtNDUmKm0/PyY7JDU/fXARdw==", "YZTOM");
        lIllllllIIll[lIllllllIlIl[14]] = llllIIIIIIlIII("DDEtIEoxKmQyBGd5ang2dnkQOw94Kis6BngxJSBKOjwhPUosKyEyHj09ZCQDLDFke1VkOis+GjcqMAcTKDx6JgYsKyUvGS0pISEWcTorPho3KjAPRHZz", "XYDSj");
    }
}
