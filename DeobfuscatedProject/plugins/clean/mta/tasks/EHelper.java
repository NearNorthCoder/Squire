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
package gg.squire.mta.tasks;

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
import gg.squire.mta.tasks.MtaTaskBase;
import gg.squire.mta.tasks.GameEnum8;
import gg.squire.mta.tasks.GameEnum15;
import gg.squire.mta.tasks.MtaManager;
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
public class EHelper
extends MtaTaskBase {
    static final  boolean I;
    private final  ItemManager D;
    private  boolean H;
    private final  List<String> q;
    
    private  g G;
    private static final  int r;
    private static final  Logger p;
    private final  Client C;
    private static final  String z;
    private static final  int s;
    private static final  String y;
    private final  SquireMTA B;
    private static final  int u;
    private final  InfoBoxManager E;
    private static final  int t;
    private  d F;
    private static final  int w;
    private static final  int v;
    private final  g[] A;
    private static final  int x;

    private static void lIIIllIIIIllIII() {
        lllIlIlIIlll = new String[lllIlIlIllII[22]];
        e.lllIlIlIIlll[e.lllIlIlIllII[1]] = "Staff of fire";
        e.lllIlIlIIlll[e.lllIlIlIllII[2]] = "Fire battlestaff";
        e.lllIlIlIIlll[e.lllIlIlIllII[3]] = "Mystic fire staff";
        e.lllIlIlIIlll[e.lllIlIlIllII[4]] = "Lava battlestaff";
        e.lllIlIlIIlll[e.lllIlIlIllII[5]] = "Mystic lava staff";
        e.lllIlIlIIlll[e.lllIlIlIllII[6]] = "Steam battlestaff";
        e.lllIlIlIIlll[e.lllIlIlIllII[7]] = "Mystic steam staff";
        e.lllIlIlIIlll[e.lllIlIlIllII[8]] = "Smoke battlestaff";
        e.lllIlIlIIlll[e.lllIlIlIllII[9]] = "Mystic smoke staff";
        e.lllIlIlIIlll[e.lllIlIlIllII[0]] = "Item change to {}!";
        e.lllIlIlIIlll[e.lllIlIlIllII[10]] = "You found:";
        e.lllIlIlIIlll[e.lllIlIlIllII[11]] = "You found:";
        e.lllIlIlIIlll[e.lllIlIlIllII[12]] = e.lIIIllIIIIIlIlI("Agkz6nWWPzk=", "YGHsZ");
        e.lllIlIlIIlll[e.lllIlIlIllII[13]] = "The cupboard is empty.";
        e.lllIlIlIIlll[e.lllIlIlIllII[18]] = "Filling cupboard {} with {}";
        e.lllIlIlIIlll[e.lllIlIlIllII[20]] = "The cupboard is empty.";
        e.lllIlIlIIlll[e.lllIlIlIllII[21]] = "You found:";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        if (e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            return;
        }
        String var2 = var1.getMessage();
        if (e.lIIIllIIIIlllIl(var1.getType(), ChatMessageType.GAMEMESSAGE)) {
            e var3;
            if (e.lIIIllIIIIllllI(var2.contains(lllIlIlIIlll[lllIlIlIllII[10]]) ? 1 : 0)) {
                String var4 = var2.replace(lllIlIlIIlll[lllIlIlIllII[11]], lllIlIlIIlll[lllIlIlIllII[12]]).trim();
                d var5 = d.a(var4);
                g var6 = var3.m();
                if (e.lIIIllIIIIlllII((Object)var6.M, (Object)var5)) {
                    var3.a(var6, var5);
                }

                if (2 < -1) {
                    return;
                }
            } else if (e.lIIIllIIIIllllI(var2.equals(lllIlIlIIlll[lllIlIlIllII[13]]) ? 1 : 0)) {
                g var4 = var3.m();
                if (e.lIIIllIIIIlllII((Object)var4.M, (Object)d.EMPTY)) {
                    var3.a(var4, d.EMPTY);
                }
            }
        }
    }

    private static int lIIIllIIIlIIIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public d l() {
        int var7 = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(var7, lllIlIlIllII[6])) {
            e var8;
            Widget var9 = var8.C.getWidget(lllIlIlIllII[15], lllIlIlIllII[8] + var7);
            if (e.lIIIllIIIlIIIIl(var9)) {
                return null;
            }
            String var10 = var9.getText();
            Widget var11 = var8.C.getWidget(lllIlIlIllII[15], lllIlIlIllII[12] + var7);
            int var12 = Integer.parseInt(var11.getText());
            if (e.lIIIllIIIIlllll(var12, lllIlIlIllII[16])) {
                return d.a(var10);
            }
            ++var7;

            if (2 > ((0x86 ^ 0xBC) & ~(0x65 ^ 0x5F))) continue;
            return null;
        }
        return null;
    }

    @Inject
    private EHelper(Client client, MagicArenaConfig magicArenaConfig, SquireMTA squireMTA, ItemManager itemManager, InfoBoxManager infoBoxManager) {
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
        void var13;
        g g2 = null;
        double d2 = Double.MAX_VALUE;
        WorldPoint worldPoint = this.C.getLocalPlayer().getWorldLocation();
        g[] gArray = this.A;
        int n2 = gArray.length;
        int var14 = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(var14, (int)var13)) {
            void var15;
            void var16 = var15[var14];
            if (e.lIIIllIIIlIIIIl(var16)) {

                if (2 == 0) {
                    return null;
                }
            } else {
                double var17;
                void var18;
                void var19;
                double var20 = var16.L.getWorldLocation().distanceTo((WorldPoint)var19);
                if (!e.lIIIllIIIIllIll(var18) || e.lIIIllIIIlIIIll(e.lIIIllIIIlIIIlI(var20, var17))) {
                    var18 = var16;
                    var17 = var20;
                }
            }
            ++var14;

            if (2 >= 0) continue;
            return null;
        }
        return g2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        e var21;
        g var22;
        int var23;
        void var24;
        if (e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            return;
        }
        GameObject var25 = var24.getGameObject();
        switch (var25.getId()) {
            case 23678: 
            case 23679: {
                var23 = lllIlIlIllII[1];

                if (((0x40 ^ 0x3E ^ (0x69 ^ 0x1F)) & (0xC0 ^ 0xAA ^ (0x70 ^ 0x12) ^ -1)) >= 0) break;
                return;
            }
            case 23680: 
            case 23681: {
                var23 = lllIlIlIllII[2];

                if (null == null) break;
                return;
            }
            case 23682: 
            case 23683: {
                var23 = lllIlIlIllII[3];

                if (((0x5B ^ 7 ^ (0x17 ^ 0x3B) & ~(0x1A ^ 0x36)) & (33 + 133 - 136 + 187 ^ 81 + 28 - 49 + 73 ^ -1)) == 0) break;
                return;
            }
            case 23684: 
            case 23685: {
                var23 = lllIlIlIllII[4];

                if (1 >= 0) break;
                return;
            }
            case 23686: 
            case 23687: {
                var23 = lllIlIlIllII[5];

                if (3 == 3) break;
                return;
            }
            case 23688: 
            case 23689: {
                var23 = lllIlIlIllII[6];

                if ((0x14 ^ 0x10) >= (0x46 ^ 0x42)) break;
                return;
            }
            default: {
                return;
            }
        }
        if (e.lIIIllIIIIllIll(var22 = var21.A[var23])) {
            var22.L = var25;

            if (((0x3F ^ 0x6A) & ~(0xFC ^ 0xA9)) != 0) {
                return;
            }
        } else {
            var22 = new g();
            var22.L = var25;
            var22.M = d.UNKNOWN;
            var21.A[var23] = var22;
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
                    if (!e.lIIIllIIIIllIlI(EHelper.class.desiredAssertionStatus() ? 1 : 0)) break block0;
                    n2 = lllIlIlIllII[2];

                    if (-2 < 0) break block1;
                    break block2;
                }
                n2 = lllIlIlIllII[1];
            }
            I = n2;
            p = LoggerFactory.getLogger(EHelper.class);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void renderItemOverlay(Graphics2D graphics2D, int n2, WidgetItem widgetItem) {
        void var26;
        e var27;
        if (e.lIIIllIIIIllIlI(I ? 1 : 0) && e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            throw new AssertionError();
        }
        if (!e.lIIIllIIIIllIll((Object)var27.F) || e.lIIIllIIIlIIlIl(var27.F.i(), (int)var26)) {
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
        e var28;
        if (!e.lIIIllIIIIllIll((Object)this.F) || e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            return;
        }
        int var29 = lllIlIlIllII[1];
        g[] var30 = var28.A;
        int var31 = var30.length;
        int var32 = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(var32, var31)) {
            g var33 = var30[var32];
            if (e.lIIIllIIIlIIIIl(var33)) {

                if (2 > 3) {
                    return;
                }
            } else {
                GameObject var34 = var33.L;
                d var35 = var33.M;
                if (e.lIIIllIIIIlllIl((Object)var35, (Object)d.EMPTY)) {

                    if (2 < 0) {
                        return;
                    }
                } else {
                    if (e.lIIIllIIIIlllIl((Object)var35, (Object)var28.F)) {
                        var28.C.setHintArrow(var34.getWorldLocation());
                        var29 = lllIlIlIllII[2];
                        var28.H = lllIlIlIllII[2];
                    }
                    AsyncBufferedImage var36 = var28.D.getImage(var35.i());
                    Point var37 = Perspective.getCanvasImageLocation((Client)var28.C, (LocalPoint)var34.getLocalLocation(), (BufferedImage)var36, (int)lllIlIlIllII[19]);
                    if (e.lIIIllIIIIllIll(var37)) {
                        void var38;
                        var38.drawImage((Image)var36, var37.getX(), var37.getY(), null);

                    }
                }
            }
            ++var32;

            if (-(0x44 ^ 0x41) < 0) continue;
            return;
        }
        if (e.lIIIllIIIIllIlI(var29) && e.lIIIllIIIIllIll(var28.G)) {
            var28.C.setHintArrow(var28.G.L.getWorldLocation());
            var28.H = lllIlIlIllII[2];
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
        e var39;
        if (e.lIIIllIIIIllIlI(this.c() ? 1 : 0)) {
            return;
        }
        d var40 = var39.l();
        if (!e.lIIIllIIIIllIll((Object)var39.F) || e.lIIIllIIIIlllII((Object)var39.F, (Object)var40)) {
            if (e.lIIIllIIIIllIll((Object)var39.F)) {
                var39.E.removeIf(infoBox -> infoBox instanceof f);
                var39.E.addInfoBox((InfoBox)new MtaManager((Plugin)var39.B));
            }
            p.debug(lllIlIlIIlll[lllIlIlIllII[0]], (Object)var39.F);
            var39.F = var40;
            Arrays.stream(var39.A).filter(Objects::nonNull).forEach(g2 -> {
                g2.M = d.UNKNOWN;
            });
            var39.C.clearHintArrow();
        }
        this.G = this.n();
    }

    /*
     * WARNING - void declaration
     */
    public g n() {
        if (e.lIIIllIIIIllIll((Object)this.F)) {
            void var41;
            g[] gArray = this.A;
            int n2 = gArray.length;
            int var42 = lllIlIlIllII[1];
            while (e.lIIIllIIIlIIIII(var42, (int)var41)) {
                e var43;
                void var44;
                void var45 = var44[var42];
                if (e.lIIIllIIIIllIll(var45) && e.lIIIllIIIIlllIl((Object)var45.M, (Object)var43.F)) {
                    return var45;
                }
                ++var42;

                if (2 >= 0) continue;
                return null;
            }
        }
        return null;
    }

    private static boolean lIIIllIIIIllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllIIIIlllll(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var46);
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
        void var47;
        void var48;
        int n2 = Arrays.asList(this.A).indexOf(g2);
        if (e.lIIIllIIIIllIlI(I ? 1 : 0) && e.lIIIllIIIIlllll(n2, lllIlIlIllII[17])) {
            throw new AssertionError();
        }
        int var49 = var48.ordinal();
        p.debug(lllIlIlIIlll[lllIlIlIllII[18]], (Object)((int)var47), (Object)var48);
        int var50 = lllIlIlIllII[1];
        while (e.lIIIllIIIlIIIII(var50, lllIlIlIllII[7])) {
            d d3;
            e var51;
            void var52 = (var47 + var50) % lllIlIlIllII[7];
            int var53 = (var49 + var50) % lllIlIlIllII[7];
            g g3 = var51.A[var52];
            if (e.lIIIllIIIlIIlII(var53, lllIlIlIllII[5])) {
                d3 = d.values()[var53];

                if (2 == 0) {
                    return;
                }
            } else {
                d3 = d.EMPTY;
            }
            g3.M = d3;
            ++var50;

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

    private static boolean lIIIllIIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean c() {
        int n2;
        Player player = this.C.getLocalPlayer();
        if (e.lIIIllIIIIllIll(player) && e.lIIIllIIIIlllll(player.getWorldLocation().getRegionID(), lllIlIlIllII[14]) && e.lIIIllIIIIlllll(player.getWorldLocation().getPlane(), lllIlIlIllII[3])) {
            n2 = lllIlIlIllII[2];

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

