/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.GameState
 *  net.runelite.api.Perspective
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetItem
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.game.ItemManager
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.overlay.infobox.InfoBox
 *  net.runelite.client.ui.overlay.infobox.InfoBoxManager
 *  net.runelite.client.util.AsyncBufferedImage
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package m.u.a.-.e.s.q.t.i.r;

import gg.squire.mta.MagicArenaConfig;
import gg.squire.mta.SquireMTA;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
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
import m.u.a.-.e.s.q.t.i.r.b;
import m.u.a.-.e.s.q.t.i.r.c;
import m.u.a.-.e.s.q.t.i.r.d;
import m.u.a.-.e.s.q.t.i.r.f;
import m.u.a.-.e.s.q.t.i.r.g;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.InfoBox;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.util.AsyncBufferedImage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class e
extends b {
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
        e.lllIlIlIIlll[e.lllIlIlIllII[1]] = e.lIIIllIIIIIlIlI("wuT26Rq5NW1voRiTje7bZQ==", "xgNBE");
        e.lllIlIlIIlll[e.lllIlIlIllII[2]] = e.lIIIllIIIIIlIlI("Kb5eBUJlk20h2X5cDi/x2L01JbU3fjxk", "SnrzH");
        e.lllIlIlIIlll[e.lllIlIlIllII[3]] = e.lIIIllIIIIIlIlI("2OrlDW5zhzSI5kkf3xVFFsFDur/i2NwG", "yVLsI");
        e.lllIlIlIIlll[e.lllIlIlIllII[4]] = e.lIIIllIIIIIllII("xOsb2SmTe4UQahyb/UvqZDJC6dkniIZi", "Xwkuu");
        e.lllIlIlIIlll[e.lllIlIlIllII[5]] = e.lIIIllIIIIIllll("OC4hAC0Wdz4VMhR3IQAlEzE=", "uWRtD");
        e.lllIlIlIIlll[e.lllIlIlIllII[6]] = e.lIIIllIIIIIllll("FT8VLh9mKRE7BiouAzsTIC0=", "FKpOr");
        e.lllIlIlIIlll[e.lllIlIlIllII[7]] = e.lIIIllIIIIIllll("Ny0JHT8ZdAkdMxs5WhoiGzIc", "zTziV");
        e.lllIlIlIIlll[e.lllIlIlIllII[8]] = e.lIIIllIIIIIllll("KiAqOw1ZLyQkHBUoNiQJHys=", "yMEPh");
        e.lllIlIlIIlll[e.lllIlIlIllII[9]] = e.lIIIllIIIIIllll("Li01ABkAdDUZHwgxZgcEAjIg", "cTFtp");
        e.lllIlIlIIlll[e.lllIlIlIllII[0]] = e.lIIIllIIIIIllII("nQare2bSr2YzyTt3gkLsmPWa03HkGImu", "lsZvx");
        e.lllIlIlIIlll[e.lllIlIlIllII[10]] = e.lIIIllIIIIIllII("nj7Lf/fCSrLvDhsuDYjDlw==", "nHXrp");
        e.lllIlIlIIlll[e.lllIlIlIllII[11]] = e.lIIIllIIIIIllll("ET0zQTQnJygFaA==", "HRFaR");
        e.lllIlIlIIlll[e.lllIlIlIllII[12]] = e.lIIIllIIIIIlIlI("Agkz6nWWPzk=", "YGHsZ");
        e.lllIlIlIIlll[e.lllIlIlIllII[13]] = e.lIIIllIIIIIlIlI("ykbYFil43z5hNGWGkktEDI3wv8kyguQe", "zvaLq");
        e.lllIlIlIIlll[e.lllIlIlIllII[18]] = e.lIIIllIIIIIllll("ITAkBRsJPmgKBxc7JwgAA3kzFFIQMDwBUhwk", "gYHir");
        e.lllIlIlIIlll[e.lllIlIlIllII[20]] = e.lIIIllIIIIIllII("BqpPmgfpCGxMRE00nph72jZ/r7blHJ3v", "WvWQQ");
        e.lllIlIlIIlll[e.lllIlIlIllII[21]] = e.lIIIllIIIIIllll("GDwAVwouJhsTVg==", "ASuwl");
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllllllllllllllIIllIlIlllllIllIl;
        if (e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            return;
        }
        String lllllllllllllllIIllIlIlllllIllII = lllllllllllllllIIllIlIlllllIllIl.getMessage();
        if (e.lIIIllIIIIlllIl(lllllllllllllllIIllIlIlllllIllIl.getType(), ChatMessageType.GAMEMESSAGE)) {
            e lllllllllllllllIIllIlIlllllIlllI;
            if (e.lIIIllIIIIllllI(lllllllllllllllIIllIlIlllllIllII.contains(lllIlIlIIlll[lllIlIlIllII[10]]) ? 1 : 0)) {
                String lllllllllllllllIIllIlIlllllIlIll = lllllllllllllllIIllIlIlllllIllII.replace(lllIlIlIIlll[lllIlIlIllII[11]], lllIlIlIIlll[lllIlIlIllII[12]]).trim();
                d lllllllllllllllIIllIlIlllllIlIlI = d.a(lllllllllllllllIIllIlIlllllIlIll);
                g lllllllllllllllIIllIlIlllllIlIIl = lllllllllllllllIIllIlIlllllIlllI.m();
                if (e.lIIIllIIIIlllII((Object)lllllllllllllllIIllIlIlllllIlIIl.M, (Object)lllllllllllllllIIllIlIlllllIlIlI)) {
                    lllllllllllllllIIllIlIlllllIlllI.a(lllllllllllllllIIllIlIlllllIlIIl, lllllllllllllllIIllIlIlllllIlIlI);
                }
                "".length();
                if ("  ".length() < -" ".length()) {
                    return;
                }
            } else if (e.lIIIllIIIIllllI(lllllllllllllllIIllIlIlllllIllII.equals(lllIlIlIIlll[lllIlIlIllII[13]]) ? 1 : 0)) {
                g lllllllllllllllIIllIlIlllllIlIll = lllllllllllllllIIllIlIlllllIlllI.m();
                if (e.lIIIllIIIIlllII((Object)lllllllllllllllIIllIlIlllllIlIll.M, (Object)d.EMPTY)) {
                    lllllllllllllllIIllIlIlllllIlllI.a(lllllllllllllllIIllIlIlllllIlIll, d.EMPTY);
                }
            }
        }
    }

    private static int lIIIllIIIlIIIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public d l() {
        int lllllllllllllllIIllIlIllllIlllIl = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(lllllllllllllllIIllIlIllllIlllIl, lllIlIlIllII[6])) {
            e lllllllllllllllIIllIlIllllIllllI;
            Widget lllllllllllllllIIllIlIllllIlllII = lllllllllllllllIIllIlIllllIllllI.C.getWidget(lllIlIlIllII[15], lllIlIlIllII[8] + lllllllllllllllIIllIlIllllIlllIl);
            if (e.lIIIllIIIlIIIIl(lllllllllllllllIIllIlIllllIlllII)) {
                return null;
            }
            String lllllllllllllllIIllIlIllllIllIll = lllllllllllllllIIllIlIllllIlllII.getText();
            Widget lllllllllllllllIIllIlIllllIllIlI = lllllllllllllllIIllIlIllllIllllI.C.getWidget(lllIlIlIllII[15], lllIlIlIllII[12] + lllllllllllllllIIllIlIllllIlllIl);
            int lllllllllllllllIIllIlIllllIllIIl = Integer.parseInt(lllllllllllllllIIllIlIllllIllIlI.getText());
            if (e.lIIIllIIIIlllll(lllllllllllllllIIllIlIllllIllIIl, lllIlIlIllII[16])) {
                return d.a(lllllllllllllllIIllIlIllllIllIll);
            }
            ++lllllllllllllllIIllIlIllllIlllIl;
            "".length();
            if ("  ".length() > ((0x86 ^ 0xBC) & ~(0x65 ^ 0x5F))) continue;
            return null;
        }
        return null;
    }

    @Inject
    private e(Client client, MagicArenaConfig magicArenaConfig, SquireMTA squireMTA, ItemManager itemManager, InfoBoxManager infoBoxManager) {
        super(magicArenaConfig);
        String[] stringArray = new String[lllIlIlIllII[0]];
        stringArray[e.lllIlIlIllII[1]] = lllIlIlIIlll[lllIlIlIllII[1]];
        stringArray[e.lllIlIlIllII[2]] = lllIlIlIIlll[lllIlIlIllII[2]];
        stringArray[e.lllIlIlIllII[3]] = lllIlIlIIlll[lllIlIlIllII[3]];
        stringArray[e.lllIlIlIllII[4]] = lllIlIlIIlll[lllIlIlIllII[4]];
        stringArray[e.lllIlIlIllII[5]] = lllIlIlIIlll[lllIlIlIllII[5]];
        stringArray[e.lllIlIlIllII[6]] = lllIlIlIIlll[lllIlIlIllII[6]];
        stringArray[e.lllIlIlIllII[7]] = lllIlIlIIlll[lllIlIlIllII[7]];
        stringArray[e.lllIlIlIllII[8]] = lllIlIlIIlll[lllIlIlIllII[8]];
        stringArray[e.lllIlIlIllII[9]] = lllIlIlIIlll[lllIlIlIllII[9]];
        this.q = Arrays.asList(stringArray);
        this.A = new g[lllIlIlIllII[7]];
        this.C = client;
        this.B = squireMTA;
        this.D = itemManager;
        this.E = infoBoxManager;
    }

    private static boolean lIIIllIIIIllIll(Object object) {
        return object != null;
    }

    public List<String> o() {
        return this.q;
    }

    /*
     * WARNING - void declaration
     */
    private g m() {
        void lllllllllllllllIIllIlIllllIIlIlI;
        g g2 = null;
        double d2 = Double.MAX_VALUE;
        WorldPoint worldPoint = this.C.getLocalPlayer().getWorldLocation();
        g[] gArray = this.A;
        int n2 = gArray.length;
        int lllllllllllllllIIllIlIllllIIlIIl = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(lllllllllllllllIIllIlIllllIIlIIl, (int)lllllllllllllllIIllIlIllllIIlIlI)) {
            void lllllllllllllllIIllIlIllllIIlIll;
            void lllllllllllllllIIllIlIllllIIlIII = lllllllllllllllIIllIlIllllIIlIll[lllllllllllllllIIllIlIllllIIlIIl];
            if (e.lIIIllIIIlIIIIl(lllllllllllllllIIllIlIllllIIlIII)) {
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
            } else {
                double lllllllllllllllIIllIlIllllIIllIl;
                void lllllllllllllllIIllIlIllllIIlllI;
                void lllllllllllllllIIllIlIllllIIllII;
                double lllllllllllllllIIllIlIllllIIIlll = lllllllllllllllIIllIlIllllIIlIII.L.getWorldLocation().distanceTo((WorldPoint)lllllllllllllllIIllIlIllllIIllII);
                if (!e.lIIIllIIIIllIll(lllllllllllllllIIllIlIllllIIlllI) || e.lIIIllIIIlIIIll(e.lIIIllIIIlIIIlI(lllllllllllllllIIllIlIllllIIIlll, lllllllllllllllIIllIlIllllIIllIl))) {
                    lllllllllllllllIIllIlIllllIIlllI = lllllllllllllllIIllIlIllllIIlIII;
                    lllllllllllllllIIllIlIllllIIllIl = lllllllllllllllIIllIlIllllIIIlll;
                }
            }
            ++lllllllllllllllIIllIlIllllIIlIIl;
            "".length();
            if ("  ".length() >= 0) continue;
            return null;
        }
        return g2;
    }

    private static String lIIIllIIIIIllII(String lllllllllllllllIIllIlIlllIIIIlIl, String lllllllllllllllIIllIlIlllIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlllIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlllIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIlllIIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIlllIIIlIIl.init(lllIlIlIllII[3], lllllllllllllllIIllIlIlllIIIlIlI);
            return new String(lllllllllllllllIIllIlIlllIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIlllIIIlIII) {
            lllllllllllllllIIllIlIlllIIIlIII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        e lllllllllllllllIIllIlIllllllllIl;
        g lllllllllllllllIIllIlIlllllllIIl;
        int lllllllllllllllIIllIlIlllllllIlI;
        void lllllllllllllllIIllIlIllllllllII;
        if (e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            return;
        }
        GameObject lllllllllllllllIIllIlIlllllllIll = lllllllllllllllIIllIlIllllllllII.getGameObject();
        switch (lllllllllllllllIIllIlIlllllllIll.getId()) {
            case 23678: 
            case 23679: {
                lllllllllllllllIIllIlIlllllllIlI = lllIlIlIllII[1];
                "".length();
                if (((0x40 ^ 0x3E ^ (0x69 ^ 0x1F)) & (0xC0 ^ 0xAA ^ (0x70 ^ 0x12) ^ -" ".length())) >= 0) break;
                return;
            }
            case 23680: 
            case 23681: {
                lllllllllllllllIIllIlIlllllllIlI = lllIlIlIllII[2];
                "".length();
                if (null == null) break;
                return;
            }
            case 23682: 
            case 23683: {
                lllllllllllllllIIllIlIlllllllIlI = lllIlIlIllII[3];
                "".length();
                if (((0x5B ^ 7 ^ (0x17 ^ 0x3B) & ~(0x1A ^ 0x36)) & (33 + 133 - 136 + 187 ^ 81 + 28 - 49 + 73 ^ -" ".length())) == 0) break;
                return;
            }
            case 23684: 
            case 23685: {
                lllllllllllllllIIllIlIlllllllIlI = lllIlIlIllII[4];
                "".length();
                if (" ".length() >= 0) break;
                return;
            }
            case 23686: 
            case 23687: {
                lllllllllllllllIIllIlIlllllllIlI = lllIlIlIllII[5];
                "".length();
                if ("   ".length() == "   ".length()) break;
                return;
            }
            case 23688: 
            case 23689: {
                lllllllllllllllIIllIlIlllllllIlI = lllIlIlIllII[6];
                "".length();
                if ((0x14 ^ 0x10) >= (0x46 ^ 0x42)) break;
                return;
            }
            default: {
                return;
            }
        }
        if (e.lIIIllIIIIllIll(lllllllllllllllIIllIlIlllllllIIl = lllllllllllllllIIllIlIllllllllIl.A[lllllllllllllllIIllIlIlllllllIlI])) {
            lllllllllllllllIIllIlIlllllllIIl.L = lllllllllllllllIIllIlIlllllllIll;
            "".length();
            if (((0x3F ^ 0x6A) & ~(0xFC ^ 0xA9)) != 0) {
                return;
            }
        } else {
            lllllllllllllllIIllIlIlllllllIIl = new g();
            lllllllllllllllIIllIlIlllllllIIl.L = lllllllllllllllIIllIlIlllllllIll;
            lllllllllllllllIIllIlIlllllllIIl.M = d.UNKNOWN;
            lllllllllllllllIIllIlIllllllllIl.A[lllllllllllllllIIllIlIlllllllIlI] = lllllllllllllllIIllIlIlllllllIIl;
        }
    }

    static {
        block2: {
            int n2;
            block1: {
                block0: {
                    e.lIIIllIIIIllIIl();
                    e.lIIIllIIIIllIII();
                    v = lllIlIlIllII[12];
                    z = lllIlIlIIlll[lllIlIlIllII[20]];
                    w = lllIlIlIllII[6];
                    u = lllIlIlIllII[8];
                    y = lllIlIlIIlll[lllIlIlIllII[21]];
                    r = lllIlIlIllII[14];
                    x = lllIlIlIllII[16];
                    s = lllIlIlIllII[19];
                    t = lllIlIlIllII[7];
                    if (!e.lIIIllIIIIllIlI(e.class.desiredAssertionStatus() ? 1 : 0)) break block0;
                    n2 = lllIlIlIllII[2];
                    "".length();
                    if (-"  ".length() < 0) break block1;
                    break block2;
                }
                n2 = lllIlIlIllII[1];
            }
            I = n2;
            p = LoggerFactory.getLogger(e.class);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void renderItemOverlay(Graphics2D graphics2D, int n2, WidgetItem widgetItem) {
        void lllllllllllllllIIllIlIlllIIlIIII;
        e lllllllllllllllIIllIlIlllIIlIIlI;
        if (e.lIIIllIIIIllIlI(I ? 1 : 0) && e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            throw new AssertionError();
        }
        if (!e.lIIIllIIIIllIll((Object)lllllllllllllllIIllIlIlllIIlIIlI.F) || e.lIIIllIIIlIIlIl(lllllllllllllllIIllIlIlllIIlIIlI.F.i(), (int)lllllllllllllllIIllIlIlllIIlIIII)) {
            return;
        }
        this.a(graphics2D, widgetItem, Color.GREEN);
    }

    private static boolean lIIIllIIIIlllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIllIIIIlllII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(Graphics2D graphics2D) {
        e lllllllllllllllIIllIlIlllIlIlIll;
        if (!e.lIIIllIIIIllIll((Object)this.F) || e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            return;
        }
        int lllllllllllllllIIllIlIlllIlIlIIl = lllIlIlIllII[1];
        g[] lllllllllllllllIIllIlIlllIlIlIII = lllllllllllllllIIllIlIlllIlIlIll.A;
        int lllllllllllllllIIllIlIlllIlIIlll = lllllllllllllllIIllIlIlllIlIlIII.length;
        int lllllllllllllllIIllIlIlllIlIIllI = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(lllllllllllllllIIllIlIlllIlIIllI, lllllllllllllllIIllIlIlllIlIIlll)) {
            g lllllllllllllllIIllIlIlllIlIIlIl = lllllllllllllllIIllIlIlllIlIlIII[lllllllllllllllIIllIlIlllIlIIllI];
            if (e.lIIIllIIIlIIIIl(lllllllllllllllIIllIlIlllIlIIlIl)) {
                "".length();
                if ("  ".length() > "   ".length()) {
                    return;
                }
            } else {
                GameObject lllllllllllllllIIllIlIlllIlIIlII = lllllllllllllllIIllIlIlllIlIIlIl.L;
                d lllllllllllllllIIllIlIlllIlIIIll = lllllllllllllllIIllIlIlllIlIIlIl.M;
                if (e.lIIIllIIIIlllIl((Object)lllllllllllllllIIllIlIlllIlIIIll, (Object)d.EMPTY)) {
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                } else {
                    if (e.lIIIllIIIIlllIl((Object)lllllllllllllllIIllIlIlllIlIIIll, (Object)lllllllllllllllIIllIlIlllIlIlIll.F)) {
                        lllllllllllllllIIllIlIlllIlIlIll.C.setHintArrow(lllllllllllllllIIllIlIlllIlIIlII.getWorldLocation());
                        lllllllllllllllIIllIlIlllIlIlIIl = lllIlIlIllII[2];
                        lllllllllllllllIIllIlIlllIlIlIll.H = lllIlIlIllII[2];
                    }
                    AsyncBufferedImage lllllllllllllllIIllIlIlllIlIIIlI = lllllllllllllllIIllIlIlllIlIlIll.D.getImage(lllllllllllllllIIllIlIlllIlIIIll.i());
                    Point lllllllllllllllIIllIlIlllIlIIIIl = Perspective.getCanvasImageLocation((Client)lllllllllllllllIIllIlIlllIlIlIll.C, (LocalPoint)lllllllllllllllIIllIlIlllIlIIlII.getLocalLocation(), (BufferedImage)lllllllllllllllIIllIlIlllIlIIIlI, (int)lllIlIlIllII[19]);
                    if (e.lIIIllIIIIllIll(lllllllllllllllIIllIlIlllIlIIIIl)) {
                        void lllllllllllllllIIllIlIlllIlIlIlI;
                        lllllllllllllllIIllIlIlllIlIlIlI.drawImage((Image)lllllllllllllllIIllIlIlllIlIIIlI, lllllllllllllllIIllIlIlllIlIIIIl.getX(), lllllllllllllllIIllIlIlllIlIIIIl.getY(), null);
                        "".length();
                    }
                }
            }
            ++lllllllllllllllIIllIlIlllIlIIllI;
            "".length();
            if (-(0x44 ^ 0x41) < 0) continue;
            return;
        }
        if (e.lIIIllIIIIllIlI(lllllllllllllllIIllIlIlllIlIlIIl) && e.lIIIllIIIIllIll(lllllllllllllllIIllIlIlllIlIlIll.G)) {
            lllllllllllllllIIllIlIlllIlIlIll.C.setHintArrow(lllllllllllllllIIllIlIlllIlIlIll.G.L.getWorldLocation());
            lllllllllllllllIIllIlIlllIlIlIll.H = lllIlIlIllII[2];
        }
    }

    private static boolean lIIIllIIIlIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (e.lIIIllIIIIlllIl(gameStateChanged.getGameState(), GameState.LOGGED_IN) && e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            this.k();
            if (e.lIIIllIIIIllllI(this.H ? 1 : 0)) {
                this.C.clearHintArrow();
                this.H = lllIlIlIllII[1];
            }
        }
    }

    private static boolean lIIIllIIIlIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        e lllllllllllllllIIllIllIIIIIIIlII;
        if (e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            return;
        }
        d lllllllllllllllIIllIllIIIIIIIIll = lllllllllllllllIIllIllIIIIIIIlII.l();
        if (!e.lIIIllIIIIllIll((Object)lllllllllllllllIIllIllIIIIIIIlII.F) || e.lIIIllIIIIlllII((Object)lllllllllllllllIIllIllIIIIIIIlII.F, (Object)lllllllllllllllIIllIllIIIIIIIIll)) {
            if (e.lIIIllIIIIllIll((Object)lllllllllllllllIIllIllIIIIIIIlII.F)) {
                lllllllllllllllIIllIllIIIIIIIlII.E.removeIf(infoBox -> infoBox instanceof f);
                lllllllllllllllIIllIllIIIIIIIlII.E.addInfoBox((InfoBox)new f((Plugin)lllllllllllllllIIllIllIIIIIIIlII.B));
            }
            p.debug(lllIlIlIIlll[lllIlIlIllII[0]], (Object)lllllllllllllllIIllIllIIIIIIIlII.F);
            lllllllllllllllIIllIllIIIIIIIlII.F = lllllllllllllllIIllIllIIIIIIIIll;
            Arrays.stream(lllllllllllllllIIllIllIIIIIIIlII.A).filter(Objects::nonNull).forEach(g2 -> {
                g2.M = d.UNKNOWN;
            });
            lllllllllllllllIIllIllIIIIIIIlII.C.clearHintArrow();
        }
        this.G = this.n();
    }

    /*
     * WARNING - void declaration
     */
    public g n() {
        if (e.lIIIllIIIIllIll((Object)this.F)) {
            void lllllllllllllllIIllIlIlllIIllIIl;
            g[] gArray = this.A;
            int n2 = gArray.length;
            int lllllllllllllllIIllIlIlllIIllIII = lllIlIlIllII[1];
            while (e.lIIIllIIIlIIIII(lllllllllllllllIIllIlIlllIIllIII, (int)lllllllllllllllIIllIlIlllIIllIIl)) {
                e lllllllllllllllIIllIlIlllIIllIll;
                void lllllllllllllllIIllIlIlllIIllIlI;
                void lllllllllllllllIIllIlIlllIIlIlll = lllllllllllllllIIllIlIlllIIllIlI[lllllllllllllllIIllIlIlllIIllIII];
                if (e.lIIIllIIIIllIll(lllllllllllllllIIllIlIlllIIlIlll) && e.lIIIllIIIIlllIl((Object)lllllllllllllllIIllIlIlllIIlIlll.M, (Object)lllllllllllllllIIllIlIlllIIllIll.F)) {
                    return lllllllllllllllIIllIlIlllIIlIlll;
                }
                ++lllllllllllllllIIllIlIlllIIllIII;
                "".length();
                if ("  ".length() >= 0) continue;
                return null;
            }
        }
        return null;
    }

    private static void lIIIllIIIIllIIl() {
        lllIlIlIllII = new int[23];
        e.lllIlIlIllII[0] = 0x31 ^ 0x38;
        e.lllIlIlIllII[1] = (0xD9 ^ 0x8C ^ (0xA0 ^ 0xBE)) & (0x5F ^ 0x15 ^ " ".length() ^ -" ".length());
        e.lllIlIlIllII[2] = " ".length();
        e.lllIlIlIllII[3] = "  ".length();
        e.lllIlIlIllII[4] = "   ".length();
        e.lllIlIlIllII[5] = 81 + 138 - 99 + 41 ^ 51 + 68 - 117 + 163;
        e.lllIlIlIllII[6] = 0xBC ^ 0xB9;
        e.lllIlIlIllII[7] = 0x26 ^ 0x55 ^ (0x45 ^ 0x30);
        e.lllIlIlIllII[8] = 0x8A ^ 0x8D;
        e.lllIlIlIllII[9] = 0x34 ^ 0x3C;
        e.lllIlIlIllII[10] = 16 + 154 - 146 + 176 ^ 180 + 116 - 269 + 167;
        e.lllIlIlIllII[11] = 0x4E ^ 0x45;
        e.lllIlIlIllII[12] = 0x35 ^ 0x39;
        e.lllIlIlIllII[13] = 0x5D ^ 0x50;
        e.lllIlIlIllII[14] = 0xFFFFBCF7 & 0x779E;
        e.lllIlIlIllII[15] = 41 + 189 - 123 + 87;
        e.lllIlIlIllII[16] = 0x55 ^ 0x4B;
        e.lllIlIlIllII[17] = -" ".length();
        e.lllIlIlIllII[18] = 106 + 109 - 112 + 35 ^ 94 + 78 - 95 + 55;
        e.lllIlIlIllII[19] = (0x4F ^ 0x3A) + (0x12 ^ 0x46) - (0x64 ^ 0x5D) + (0x95 ^ 0x93);
        e.lllIlIlIllII[20] = 0x5B ^ 0x22 ^ (0x4F ^ 0x39);
        e.lllIlIlIllII[21] = 0x10 ^ 0x3A ^ (0x7C ^ 0x46);
        e.lllIlIlIllII[22] = 0x6A ^ 0x7B;
    }

    private static boolean lIIIllIIIIllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllIIIIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIIllIIIIIllll(String lllllllllllllllIIllIlIllIlllIIlI, String lllllllllllllllIIllIlIllIlllIIIl) {
        lllllllllllllllIIllIlIllIlllIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIllIlllIlIl = new StringBuilder();
        char[] lllllllllllllllIIllIlIllIlllIlII = lllllllllllllllIIllIlIllIlllIIIl.toCharArray();
        int lllllllllllllllIIllIlIllIlllIIll = lllIlIlIllII[1];
        char[] lllllllllllllllIIllIlIllIllIllIl = lllllllllllllllIIllIlIllIlllIIlI.toCharArray();
        int lllllllllllllllIIllIlIllIllIllII = lllllllllllllllIIllIlIllIllIllIl.length;
        int lllllllllllllllIIllIlIllIllIlIll = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(lllllllllllllllIIllIlIllIllIlIll, lllllllllllllllIIllIlIllIllIllII)) {
            char lllllllllllllllIIllIlIllIllllIII = lllllllllllllllIIllIlIllIllIllIl[lllllllllllllllIIllIlIllIllIlIll];
            lllllllllllllllIIllIlIllIlllIlIl.append((char)(lllllllllllllllIIllIlIllIllllIII ^ lllllllllllllllIIllIlIllIlllIlII[lllllllllllllllIIllIlIllIlllIIll % lllllllllllllllIIllIlIllIlllIlII.length]));
            "".length();
            ++lllllllllllllllIIllIlIllIlllIIll;
            ++lllllllllllllllIIllIlIllIllIlIll;
            "".length();
            if ("  ".length() <= (0x9C ^ 0x9A ^ "  ".length())) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIllIlllIlIl);
    }

    private static boolean lIIIllIIIIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllIIIlIIIll(int n2) {
        return n2 < 0;
    }

    private void a(Graphics2D graphics2D, WidgetItem widgetItem, Color color) {
        Rectangle rectangle = widgetItem.getCanvasBounds();
        graphics2D.setColor(color);
        graphics2D.draw(rectangle);
    }

    /*
     * WARNING - void declaration
     */
    private void a(g g2, d d2) {
        void lllllllllllllllIIllIlIlllIlllIll;
        void lllllllllllllllIIllIlIlllIllllII;
        int n2 = Arrays.asList(this.A).indexOf(g2);
        if (e.lIIIllIIIIllIlI(I ? 1 : 0) && e.lIIIllIIIIlllll(n2, lllIlIlIllII[17])) {
            throw new AssertionError();
        }
        int lllllllllllllllIIllIlIlllIlllIlI = lllllllllllllllIIllIlIlllIllllII.ordinal();
        p.debug(lllIlIlIIlll[lllIlIlIllII[18]], (Object)((int)lllllllllllllllIIllIlIlllIlllIll), (Object)lllllllllllllllIIllIlIlllIllllII);
        int lllllllllllllllIIllIlIlllIlllIIl = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(lllllllllllllllIIllIlIlllIlllIIl, lllIlIlIllII[7])) {
            d d3;
            e lllllllllllllllIIllIlIlllIlllllI;
            void lllllllllllllllIIllIlIlllIlllIII = (lllllllllllllllIIllIlIlllIlllIll + lllllllllllllllIIllIlIlllIlllIIl) % lllIlIlIllII[7];
            int lllllllllllllllIIllIlIlllIllIlll = (lllllllllllllllIIllIlIlllIlllIlI + lllllllllllllllIIllIlIlllIlllIIl) % lllIlIlIllII[7];
            g g3 = lllllllllllllllIIllIlIlllIlllllI.A[lllllllllllllllIIllIlIlllIlllIII];
            if (e.lIIIllIIIlIIlII(lllllllllllllllIIllIlIlllIllIlll, lllIlIlIllII[5])) {
                d3 = d.values()[lllllllllllllllIIllIlIlllIllIlll];
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            } else {
                d3 = d.EMPTY;
            }
            g3.M = d3;
            ++lllllllllllllllIIllIlIlllIlllIIl;
            "".length();
            if ("   ".length() > ((5 ^ 0x4F ^ (0x30 ^ 0x6A)) & (67 + 108 - 77 + 31 ^ 83 + 71 - 107 + 98 ^ -" ".length()))) continue;
            return;
        }
    }

    private static boolean lIIIllIIIlIIIIl(Object object) {
        return object == null;
    }

    private void k() {
        Arrays.fill(this.A, null);
    }

    private static String lIIIllIIIIIlIlI(String lllllllllllllllIIllIlIllIllIIIlI, String lllllllllllllllIIllIlIllIlIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIllIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIllIlIlllll.getBytes(StandardCharsets.UTF_8)), lllIlIlIllII[9]), "DES");
            Cipher lllllllllllllllIIllIlIllIllIIlII = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIllIllIIlII.init(lllIlIlIllII[3], lllllllllllllllIIllIlIllIllIIlIl);
            return new String(lllllllllllllllIIllIlIllIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIllIllIIIll) {
            lllllllllllllllIIllIlIllIllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean c() {
        int n2;
        Player player = this.C.getLocalPlayer();
        if (e.lIIIllIIIIllIll(player) && e.lIIIllIIIIlllll(player.getWorldLocation().getRegionID(), lllIlIlIllII[14]) && e.lIIIllIIIIlllll(player.getWorldLocation().getPlane(), lllIlIlIllII[3])) {
            n2 = lllIlIlIllII[2];
            "".length();
            if (" ".length() < " ".length()) {
                return ((0x6D ^ 0xB ^ (0xD9 ^ 0x92)) & (0x3F ^ 0x56 ^ (0x38 ^ 0x7C) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lllIlIlIllII[1];
        }
        return n2 != 0;
    }

    public g[] p() {
        return this.A;
    }

    @Override
    public c d() {
        return c.ALCHEMY;
    }
}

