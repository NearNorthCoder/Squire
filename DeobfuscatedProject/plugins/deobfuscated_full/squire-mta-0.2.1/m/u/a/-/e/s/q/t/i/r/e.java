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
        e.lllIlIlIIlll[e.lllIlIlIllII[1]] = e."Staff of fire";
        e.lllIlIlIIlll[e.lllIlIlIllII[2]] = e."Fire battlestaff";
        e.lllIlIlIIlll[e.lllIlIlIllII[3]] = e."Mystic fire staff";
        e.lllIlIlIIlll[e.lllIlIlIllII[4]] = e."Lava battlestaff";
        e.lllIlIlIIlll[e.lllIlIlIllII[5]] = e."Mystic lava staff";
        e.lllIlIlIIlll[e.lllIlIlIllII[6]] = e."Steam battlestaff";
        e.lllIlIlIIlll[e.lllIlIlIllII[7]] = e."Mystic steam staff";
        e.lllIlIlIIlll[e.lllIlIlIllII[8]] = e."Smoke battlestaff";
        e.lllIlIlIIlll[e.lllIlIlIllII[9]] = e."Mystic smoke staff";
        e.lllIlIlIIlll[e.lllIlIlIllII[0]] = e."Item change to {}!";
        e.lllIlIlIIlll[e.lllIlIlIllII[10]] = e."You found:";
        e.lllIlIlIIlll[e.lllIlIlIllII[11]] = e."You found:";
        e.lllIlIlIIlll[e.lllIlIlIllII[12]] = e."";
        e.lllIlIlIIlll[e.lllIlIlIllII[13]] = e."The cupboard is empty.";
        e.lllIlIlIIlll[e.lllIlIlIllII[18]] = e."Filling cupboard {} with {}";
        e.lllIlIlIIlll[e.lllIlIlIllII[20]] = e."The cupboard is empty.";
        e.lllIlIlIIlll[e.lllIlIlIllII[21]] = e."You found:";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var46;
        if (e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            return;
        }
        String var1 = var46.getMessage();
        if (e.lIIIllIIIIlllIl(var46.getType(), ChatMessageType.GAMEMESSAGE)) {
            e var56;
            if (e.lIIIllIIIIllllI(var1.contains(lllIlIlIIlll[lllIlIlIllII[10]]) ? 1 : 0)) {
                String var23 = var1.replace(lllIlIlIIlll[lllIlIlIllII[11]], lllIlIlIIlll[lllIlIlIllII[12]]).trim();
                d var32 = d.a(var23);
                g var3 = var56.m();
                if (e.lIIIllIIIIlllII((Object)var3.M, (Object)var32)) {
                    var56.a(var3, var32);
                }
                0;
                if (2 < -1) {
                    return;
                }
            } else if (e.lIIIllIIIIllllI(var1.equals(lllIlIlIIlll[lllIlIlIllII[13]]) ? 1 : 0)) {
                g var23 = var56.m();
                if (e.lIIIllIIIIlllII((Object)var23.M, (Object)d.EMPTY)) {
                    var56.a(var23, d.EMPTY);
                }
            }
        }
    }

    private static int lIIIllIIIlIIIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public d l() {
        int var39 = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(var39, lllIlIlIllII[6])) {
            e var4;
            Widget var45 = var4.C.getWidget(lllIlIlIllII[15], lllIlIlIllII[8] + var39);
            if (e.lIIIllIIIlIIIIl(var45)) {
                return null;
            }
            String var7 = var45.getText();
            Widget var14 = var4.C.getWidget(lllIlIlIllII[15], lllIlIlIllII[12] + var39);
            int var30 = Integer.parseInt(var14.getText());
            if (e.lIIIllIIIIlllll(var30, lllIlIlIllII[16])) {
                return d.a(var7);
            }
            ++var39;
            0;
            if (2 > ((0x86 ^ 0xBC) & ~(0x65 ^ 0x5F))) continue;
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
        void var21;
        g g2 = null;
        double d2 = Double.MAX_VALUE;
        WorldPoint worldPoint = this.C.getLocalPlayer().getWorldLocation();
        g[] gArray = this.A;
        int n2 = gArray.length;
        int var58 = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(var58, (int)var21)) {
            void var13;
            void var68 = var13[var58];
            if (e.lIIIllIIIlIIIIl(var68)) {
                0;
                if (2 == 0) {
                    return null;
                }
            } else {
                double var42;
                void var41;
                void var34;
                double var43 = var68.L.getWorldLocation().distanceTo((WorldPoint)var34);
                if (!e.lIIIllIIIIllIll(var41) || e.lIIIllIIIlIIIll(e.lIIIllIIIlIIIlI(var43, var42))) {
                    var41 = var68;
                    var42 = var43;
                }
            }
            ++var58;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return g2;
    }

    private static String lIIIllIIIIIllII(String var53, String var71) {
        try {
            SecretKeySpec var33 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var71.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lllIlIlIllII[3], var33);
            return new String(var15.doFinal(Base64.getDecoder().decode(var53.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var63) {
            var63.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        e var57;
        g var40;
        int var16;
        void var10;
        if (e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            return;
        }
        GameObject var29 = var10.getGameObject();
        switch (var29.getId()) {
            case 23678: 
            case 23679: {
                var16 = lllIlIlIllII[1];
                0;
                if (((0x40 ^ 0x3E ^ (0x69 ^ 0x1F)) & (0xC0 ^ 0xAA ^ (0x70 ^ 0x12) ^ -1)) >= 0) break;
                return;
            }
            case 23680: 
            case 23681: {
                var16 = lllIlIlIllII[2];
                0;
                if (null == null) break;
                return;
            }
            case 23682: 
            case 23683: {
                var16 = lllIlIlIllII[3];
                0;
                if (((0x5B ^ 7 ^ (0x17 ^ 0x3B) & ~(0x1A ^ 0x36)) & (33 + 133 - 136 + 187 ^ 81 + 28 - 49 + 73 ^ -1)) == 0) break;
                return;
            }
            case 23684: 
            case 23685: {
                var16 = lllIlIlIllII[4];
                0;
                if (1 >= 0) break;
                return;
            }
            case 23686: 
            case 23687: {
                var16 = lllIlIlIllII[5];
                0;
                if (3 == 3) break;
                return;
            }
            case 23688: 
            case 23689: {
                var16 = lllIlIlIllII[6];
                0;
                if ((0x14 ^ 0x10) >= (0x46 ^ 0x42)) break;
                return;
            }
            default: {
                return;
            }
        }
        if (e.lIIIllIIIIllIll(var40 = var57.A[var16])) {
            var40.L = var29;
            0;
            if (((0x3F ^ 0x6A) & ~(0xFC ^ 0xA9)) != 0) {
                return;
            }
        } else {
            var40 = new g();
            var40.L = var29;
            var40.M = d.UNKNOWN;
            var57.A[var16] = var40;
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
                    0;
                    if (-2 < 0) break block1;
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
        void var54;
        e var37;
        if (e.lIIIllIIIIllIlI(I ? 1 : 0) && e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            throw new AssertionError();
        }
        if (!e.lIIIllIIIIllIll((Object)var37.F) || e.lIIIllIIIlIIlIl(var37.F.i(), (int)var54)) {
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
        e var17;
        if (!e.lIIIllIIIIllIll((Object)this.F) || e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            return;
        }
        int var2 = lllIlIlIllII[1];
        g[] var38 = var17.A;
        int var66 = var38.length;
        int var50 = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(var50, var66)) {
            g var27 = var38[var50];
            if (e.lIIIllIIIlIIIIl(var27)) {
                0;
                if (2 > 3) {
                    return;
                }
            } else {
                GameObject var69 = var27.L;
                d var18 = var27.M;
                if (e.lIIIllIIIIlllIl((Object)var18, (Object)d.EMPTY)) {
                    0;
                    if (2 < 0) {
                        return;
                    }
                } else {
                    if (e.lIIIllIIIIlllIl((Object)var18, (Object)var17.F)) {
                        var17.C.setHintArrow(var69.getWorldLocation());
                        var2 = lllIlIlIllII[2];
                        var17.H = lllIlIlIllII[2];
                    }
                    AsyncBufferedImage var70 = var17.D.getImage(var18.i());
                    Point var60 = Perspective.getCanvasImageLocation((Client)var17.C, (LocalPoint)var69.getLocalLocation(), (BufferedImage)var70, (int)lllIlIlIllII[19]);
                    if (e.lIIIllIIIIllIll(var60)) {
                        void var51;
                        var51.drawImage((Image)var70, var60.getX(), var60.getY(), null);
                        0;
                    }
                }
            }
            ++var50;
            0;
            if (-(0x44 ^ 0x41) < 0) continue;
            return;
        }
        if (e.lIIIllIIIIllIlI(var2) && e.lIIIllIIIIllIll(var17.G)) {
            var17.C.setHintArrow(var17.G.L.getWorldLocation());
            var17.H = lllIlIlIllII[2];
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
        e var62;
        if (e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            return;
        }
        d var19 = var62.l();
        if (!e.lIIIllIIIIllIll((Object)var62.F) || e.lIIIllIIIIlllII((Object)var62.F, (Object)var19)) {
            if (e.lIIIllIIIIllIll((Object)var62.F)) {
                var62.E.removeIf(infoBox -> infoBox instanceof f);
                var62.E.addInfoBox((InfoBox)new f((Plugin)var62.B));
            }
            p.debug(lllIlIlIIlll[lllIlIlIllII[0]], (Object)var62.F);
            var62.F = var19;
            Arrays.stream(var62.A).filter(Objects::nonNull).forEach(g2 -> {
                g2.M = d.UNKNOWN;
            });
            var62.C.clearHintArrow();
        }
        this.G = this.n();
    }

    /*
     * WARNING - void declaration
     */
    public g n() {
        if (e.lIIIllIIIIllIll((Object)this.F)) {
            void var59;
            g[] gArray = this.A;
            int n2 = gArray.length;
            int var49 = lllIlIlIllII[1];
            while (e.lIIIllIIIlIIIII(var49, (int)var59)) {
                e var36;
                void var64;
                void var8 = var64[var49];
                if (e.lIIIllIIIIllIll(var8) && e.lIIIllIIIIlllIl((Object)var8.M, (Object)var36.F)) {
                    return var8;
                }
                ++var49;
                0;
                if (2 >= 0) continue;
                return null;
            }
        }
        return null;
    }

    private static void lIIIllIIIIllIIl() {
        lllIlIlIllII = new int[23];
        e.lllIlIlIllII[0] = 0x31 ^ 0x38;
        e.lllIlIlIllII[1] = (0xD9 ^ 0x8C ^ (0xA0 ^ 0xBE)) & (0x5F ^ 0x15 ^ 1 ^ -1);
        e.lllIlIlIllII[2] = 1;
        e.lllIlIlIllII[3] = 2;
        e.lllIlIlIllII[4] = 3;
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
        e.lllIlIlIllII[17] = -1;
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

    private static String lIIIllIIIIIllll(String var20, String var44) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var48 = new StringBuilder();
        char[] var6 = var44.toCharArray();
        int var47 = lllIlIlIllII[1];
        char[] var31 = var20.toCharArray();
        int var9 = var31.length;
        int var35 = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(var35, var9)) {
            char var11 = var31[var35];
            var48.append((char)(var11 ^ var6[var47 % var6.length]));
            0;
            ++var47;
            ++var35;
            0;
            if (2 <= (0x9C ^ 0x9A ^ 2)) continue;
            return null;
        }
        return String.valueOf(var48);
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
        void var61;
        void var55;
        int n2 = Arrays.asList(this.A).indexOf(g2);
        if (e.lIIIllIIIIllIlI(I ? 1 : 0) && e.lIIIllIIIIlllll(n2, lllIlIlIllII[17])) {
            throw new AssertionError();
        }
        int var12 = var55.ordinal();
        p.debug(lllIlIlIIlll[lllIlIlIllII[18]], (Object)((int)var61), (Object)var55);
        int var28 = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(var28, lllIlIlIllII[7])) {
            d d3;
            e var65;
            void var26 = (var61 + var28) % lllIlIlIllII[7];
            int var25 = (var12 + var28) % lllIlIlIllII[7];
            g g3 = var65.A[var26];
            if (e.lIIIllIIIlIIlII(var25, lllIlIlIllII[5])) {
                d3 = d.values()[var25];
                0;
                if (2 == 0) {
                    return;
                }
            } else {
                d3 = d.EMPTY;
            }
            g3.M = d3;
            ++var28;
            0;
            if (3 > ((5 ^ 0x4F ^ (0x30 ^ 0x6A)) & (67 + 108 - 77 + 31 ^ 83 + 71 - 107 + 98 ^ -1))) continue;
            return;
        }
    }

    private static boolean lIIIllIIIlIIIIl(Object object) {
        return object == null;
    }

    private void k() {
        Arrays.fill(this.A, null);
    }

    private static String lIIIllIIIIIlIlI(String var67, String var24) {
        try {
            SecretKeySpec var52 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), lllIlIlIllII[9]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(lllIlIlIllII[3], var52);
            return new String(var22.doFinal(Base64.getDecoder().decode(var67.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
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
            0;
            if (1 < 1) {
                return ((0x6D ^ 0xB ^ (0xD9 ^ 0x92)) & (0x3F ^ 0x56 ^ (0x38 ^ 0x7C) ^ -1)) != 0;
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

