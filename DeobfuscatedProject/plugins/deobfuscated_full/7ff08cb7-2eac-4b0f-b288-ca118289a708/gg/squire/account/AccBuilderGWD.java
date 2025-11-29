/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.LoginStateChanged
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.plugins.Script
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 *  org.pf4j.Extension
 */
package gg.squire.account;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.G;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.L;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.U;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.aq;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.t;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.x;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.z;
import com.google.inject.Provides;
import gg.squire.account.BuilderConfig;
import gg.squire.account.GodsApi.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.LoginStateChanged;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import org.pf4j.Extension;

@PluginDescriptor(name="Squire GWD Builder", enabledByDefault=false)
@Extension
@SquireUtil
public class AccBuilderGWD
extends Script {
    private static /* synthetic */ String[] llIlIIIlI;
    @Inject
    public /* synthetic */ BuilderConfig r;
    static /* synthetic */ String p;
    public static /* synthetic */ String j;
    public static /* synthetic */ List<ab> a;
    public static /* synthetic */ long g;
    static /* synthetic */ int o;
    public static /* synthetic */ int f;
    public static /* synthetic */ String k;
    private static /* synthetic */ ab[] q;
    public static /* synthetic */ boolean d;
    /* synthetic */ boolean u;
    public static /* synthetic */ String c;
    private static /* synthetic */ int[] llIlIIIll;
    public static /* synthetic */ String m;
    @Inject
    private /* synthetic */ Client v;
    /* synthetic */ WorldArea s;
    @Inject
    private /* synthetic */ BuilderInfoBox x;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    public static /* synthetic */ boolean n;
    /* synthetic */ String t;
    @Inject
    private /* synthetic */ OverlayManager w;
    public static /* synthetic */ String h;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ long b;
    public static /* synthetic */ String l;

    private static boolean lIllIIIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIIIlIlI() {
        llIlIIIlI = new String[llIlIIIll[63]];
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[4]] = AccBuilderGWD."https://discord.com/api/webhooks/1215411745661653022/jY8vOzwiPBV2UG1boyJ7dN3JNNdcjhfFuRqagyQwPqqtxffByAdIBW4YbjLNq5cqbRdi";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[5]] = AccBuilderGWD."quest";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[9]] = AccBuilderGWD."Disabling GE warning";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[10]] = AccBuilderGWD."Navigating to GE";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[11]] = AccBuilderGWD."Finished account";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[13]] = AccBuilderGWD."\n[Plugin] Plugin starting up\n";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[14]] = AccBuilderGWD."gwd acc";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[15]] = AccBuilderGWD."Switching to One Click GWD";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[16]] = AccBuilderGWD."hootfighter";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[17]] = AccBuilderGWD."enabled";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[18]] = AccBuilderGWD."agility";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[19]] = AccBuilderGWD."\n[Plugin] Plugin shut down\n";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[23]] = AccBuilderGWD."tell the king";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[24]] = AccBuilderGWD."another clue scroll";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[25]] = AccBuilderGWD."a new clue";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[26]] = AccBuilderGWD."those pesky trolls";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[27]] = AccBuilderGWD."managed to get my son";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[32]] = AccBuilderGWD."Just recently.";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[33]] = AccBuilderGWD."fruit and grain mostly";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[34]] = AccBuilderGWD."That's some well-guarded secret alright";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[20]] = AccBuilderGWD."I could tell by the cut of your jib";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[35]] = AccBuilderGWD."You haven't got enough";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[36]] = AccBuilderGWD."Not enough gold for buying";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[37]] = AccBuilderGWD."Oh dear, you are dead!";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[38]] = AccBuilderGWD."We DIED!! :(";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[39]] = AccBuilderGWD."Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[40]] = AccBuilderGWD."We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[30]] = AccBuilderGWD."can't reach that";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[41]] = AccBuilderGWD."Door";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[42]] = AccBuilderGWD."Door";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[43]] = AccBuilderGWD."Open";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[44]] = AccBuilderGWD."Tree Door";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[45]] = AccBuilderGWD."Tree Door";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[31]] = AccBuilderGWD."Open";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[46]] = AccBuilderGWD."think that facing North";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[49]] = AccBuilderGWD."already some rum";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[51]] = AccBuilderGWD."Drop";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[52]] = AccBuilderGWD."Burning";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[53]] = AccBuilderGWD."Burning";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[54]] = AccBuilderGWD."troll";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[55]] = AccBuilderGWD."Troll";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[56]] = AccBuilderGWD."spider";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[57]] = AccBuilderGWD."skeleton";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[58]] = AccBuilderGWD."Wolf";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[59]] = AccBuilderGWD."Damis";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[60]] = AccBuilderGWD."hound";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[61]] = AccBuilderGWD."Thrower";
        AccBuilderGWD.llIlIIIlI[AccBuilderGWD.llIlIIIll[62]] = AccBuilderGWD."";
    }

    private static String lIllIIIIIlll(String lIIllIllIlIllI, String lIIllIllIlIIll) {
        try {
            SecretKeySpec lIIllIllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIllIlIIll.getBytes(StandardCharsets.UTF_8)), llIlIIIll[16]), "DES");
            Cipher lIIllIllIllIII = Cipher.getInstance("DES");
            lIIllIllIllIII.init(llIlIIIll[9], lIIllIllIllIIl);
            return new String(lIIllIllIllIII.doFinal(Base64.getDecoder().decode(lIIllIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIllIlIlll) {
            lIIllIllIlIlll.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIlIll() {
        llIlIIIll = new int[64];
        AccBuilderGWD.llIlIIIll[0] = 0xFFFFAE2F & 0x5DF7;
        AccBuilderGWD.llIlIIIll[1] = 0xFFFFFE15 & 0xFFA;
        AccBuilderGWD.llIlIIIll[2] = 0x9F ^ 0xBC ^ (0x8E ^ 0x93);
        AccBuilderGWD.llIlIIIll[3] = 99 + 188 - 160 + 119 ^ 154 + 61 - 98 + 78;
        AccBuilderGWD.llIlIIIll[4] = (89 + 94 - 89 + 40 ^ 95 + 3 - 97 + 185) & (0x42 ^ 0x1D ^ (0x67 ^ 4) ^ -1);
        AccBuilderGWD.llIlIIIll[5] = 1;
        AccBuilderGWD.llIlIIIll[6] = 0x3F ^ 0x43 ^ (0x6D ^ 0x75);
        AccBuilderGWD.llIlIIIll[7] = 0xFFFFD3BD & 0x2D5B;
        AccBuilderGWD.llIlIIIll[8] = -(0xFFFF9C6E & 0x6B97) & (0xFFFFDFFF & 0x2BED);
        AccBuilderGWD.llIlIIIll[9] = 2;
        AccBuilderGWD.llIlIIIll[10] = 3;
        AccBuilderGWD.llIlIIIll[11] = 0x98 ^ 0x9C;
        AccBuilderGWD.llIlIIIll[12] = -(0xFFFFF3DA & 0x3DA7) & (0xFFFFFFF9 & 0x33DF);
        AccBuilderGWD.llIlIIIll[13] = 0x15 ^ 0x10;
        AccBuilderGWD.llIlIIIll[14] = 0x31 ^ 0x37;
        AccBuilderGWD.llIlIIIll[15] = 2 ^ 0x56 ^ (0xC6 ^ 0x95);
        AccBuilderGWD.llIlIIIll[16] = 0x8E ^ 0x86;
        AccBuilderGWD.llIlIIIll[17] = 0x25 ^ 0x2C;
        AccBuilderGWD.llIlIIIll[18] = 0x50 ^ 0x6A ^ (0x8A ^ 0xBA);
        AccBuilderGWD.llIlIIIll[19] = 0x1C ^ 0x17;
        AccBuilderGWD.llIlIIIll[20] = 0xBF ^ 0xAB;
        AccBuilderGWD.llIlIIIll[21] = 0xFFFF8A1E & 0x77F9;
        AccBuilderGWD.llIlIIIll[22] = 0xFFFFFFFF & 0x219;
        AccBuilderGWD.llIlIIIll[23] = 96 + 30 - 3 + 67 ^ 137 + 67 - 168 + 142;
        AccBuilderGWD.llIlIIIll[24] = 0xA0 ^ 0xBD ^ (0x90 ^ 0x80);
        AccBuilderGWD.llIlIIIll[25] = 0x44 ^ 0x21 ^ (0xD3 ^ 0xB8);
        AccBuilderGWD.llIlIIIll[26] = 105 + 123 - 129 + 33 ^ 28 + 133 - 26 + 4;
        AccBuilderGWD.llIlIIIll[27] = 0x39 ^ 0x29;
        AccBuilderGWD.llIlIIIll[28] = 0xFFFF9A79 & 0x6FAF;
        AccBuilderGWD.llIlIIIll[29] = 0xFFFF9ED9 & 0x6DE7;
        AccBuilderGWD.llIlIIIll[30] = 0x40 ^ 0x1C ^ (0x7E ^ 0x39);
        AccBuilderGWD.llIlIIIll[31] = 0xA2 ^ 0xA4 ^ (0xA8 ^ 0x8F);
        AccBuilderGWD.llIlIIIll[32] = 0x69 ^ 0x36 ^ (0xE5 ^ 0xAB);
        AccBuilderGWD.llIlIIIll[33] = 0xC6 ^ 0xB5 ^ (0x50 ^ 0x31);
        AccBuilderGWD.llIlIIIll[34] = 0x81 ^ 0x92;
        AccBuilderGWD.llIlIIIll[35] = 0x3C ^ 0x29;
        AccBuilderGWD.llIlIIIll[36] = 0xB9 ^ 0xAF;
        AccBuilderGWD.llIlIIIll[37] = 0x2A ^ 0x3D;
        AccBuilderGWD.llIlIIIll[38] = 0x2F ^ 0x37;
        AccBuilderGWD.llIlIIIll[39] = 0x83 ^ 0x9A;
        AccBuilderGWD.llIlIIIll[40] = 124 + 37 - 132 + 131 ^ 146 + 45 - 142 + 137;
        AccBuilderGWD.llIlIIIll[41] = 0x31 ^ 0x2D;
        AccBuilderGWD.llIlIIIll[42] = 0x52 ^ 0xA ^ (0xF5 ^ 0xB0);
        AccBuilderGWD.llIlIIIll[43] = 9 + 94 - 49 + 82 ^ 72 + 114 - 110 + 74;
        AccBuilderGWD.llIlIIIll[44] = 0x53 ^ 0x4C;
        AccBuilderGWD.llIlIIIll[45] = 0x7D ^ 0x29 ^ (0xC0 ^ 0xB4);
        AccBuilderGWD.llIlIIIll[46] = 0x99 ^ 0xBB;
        AccBuilderGWD.llIlIIIll[47] = -(0xFFFFED57 & 0x76AB) & (0xFFFFEFB7 & 0x7FEB);
        AccBuilderGWD.llIlIIIll[48] = -(0xFFFFFFEF & 0x6251) & (0xFFFFFFEF & 0x6EF7);
        AccBuilderGWD.llIlIIIll[49] = 7 + 80 - 57 + 129 ^ 183 + 125 - 279 + 159;
        AccBuilderGWD.llIlIIIll[50] = -(0xFFFF953F & 0x7AD1) & (0xFFFFBFBF & 0x51FF);
        AccBuilderGWD.llIlIIIll[51] = 84 + 121 - 139 + 122 ^ 40 + 75 - 40 + 77;
        AccBuilderGWD.llIlIIIll[52] = 81 + 16 - -125 + 4 ^ 41 + 93 - 41 + 106;
        AccBuilderGWD.llIlIIIll[53] = 0x5D ^ 0x14 ^ (0xF1 ^ 0x9E);
        AccBuilderGWD.llIlIIIll[54] = 0x25 ^ 0x6D ^ (0x7A ^ 0x15);
        AccBuilderGWD.llIlIIIll[55] = 4 ^ 2 ^ (0x62 ^ 0x4C);
        AccBuilderGWD.llIlIIIll[56] = 0x43 ^ 0x6A;
        AccBuilderGWD.llIlIIIll[57] = 0x49 ^ 0x63;
        AccBuilderGWD.llIlIIIll[58] = 0x61 ^ 0x1B ^ (0x37 ^ 0x66);
        AccBuilderGWD.llIlIIIll[59] = 0x64 ^ 0x48;
        AccBuilderGWD.llIlIIIll[60] = 0x3C ^ 0x71 ^ (0x58 ^ 0x38);
        AccBuilderGWD.llIlIIIll[61] = 0xFA ^ 0x95 ^ (0x1F ^ 0x5E);
        AccBuilderGWD.llIlIIIll[62] = 0x81 ^ 0x98 ^ (0x33 ^ 5);
        AccBuilderGWD.llIlIIIll[63] = 21 + 93 - -15 + 27 ^ 156 + 131 - 178 + 63;
    }

    protected int loop() {
        block10: {
            block11: {
                if (!AccBuilderGWD.lIllIIIIllII(Game.getState(), GameState.LOGGED_IN)) break block10;
                if (!AccBuilderGWD.lIllIIIIllIl(a.isEmpty() ? 1 : 0)) break block11;
                if (!AccBuilderGWD.lIllIIIIlllI(j) || AccBuilderGWD.lIllIIIIllll(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderGWD.lIllIIIlIIII(a.get(llIlIIIll[4]).ah() ? 1 : 0)) {
                    if (AccBuilderGWD.lIllIIIlIIII(a.get(llIlIIIll[4]).ag().contains(llIlIIIlI[llIlIIIll[5]]) ? 1 : 0)) {
                        f += llIlIIIll[5];
                    }
                    System.out.println("Achieved " + a.get(llIlIIIll[4]).ag() + " goal");
                    a.remove(llIlIIIll[4]);
                    0;
                    return llIlIIIll[6];
                }
                if (!AccBuilderGWD.lIllIIIIllII(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderGWD.lIllIIIlIIII(-.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e.z() ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(d ? 1 : 0) && AccBuilderGWD.lIllIIIlIIIl(-.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e.j(llIlIIIll[7]), llIlIIIll[8]) && AccBuilderGWD.lIllIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                    c = llIlIIIlI[llIlIIIll[9]];
                    -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e.A();
                    Time.sleepTicks((int)llIlIIIll[5]);
                    0;
                    0;
                    if (-(42 + 28 - -24 + 90 ^ 14 + 96 - 54 + 133) < 0) continue;
                    return (0x28 ^ 0x7E ^ (0x51 ^ 0x41)) & (231 + 248 - 417 + 188 ^ 77 + 6 - -2 + 103 ^ -1);
                }
                int lIIlllIIIIllll = llIlIIIll[4];
                try {
                    lIIlllIIIIllll = a.get(llIlIIIll[4]).af();
                    0;
                }
                catch (Exception lIIlllIIIIlllI) {
                    lIIlllIIIIlllI.printStackTrace();
                }
                if (-(0x96 ^ 0x92) >= 0) {
                    return (0xC1 ^ 0x80) & ~(0x27 ^ 0x66);
                }
                return lIIlllIIIIllll;
            }
            if (AccBuilderGWD.lIllIIIlIIII(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderGWD.lIllIIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(as.mR), llIlIIIll[10])) {
                    c = llIlIIIlI[llIlIIIll[10]];
                    Movement.walkTo((WorldPoint)as.mR);
                    0;
                }
                if (AccBuilderGWD.lIllIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(as.mR), llIlIIIll[10])) {
                    c = llIlIIIlI[llIlIIIll[11]];
                }
            }
        }
        return llIlIIIll[12];
    }

    private static boolean lIllIIIIllII(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIIIIlIIl(String lIIllIllIIlIIl, String lIIllIllIIIllI) {
        try {
            SecretKeySpec lIIllIllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIllIIlIll = Cipher.getInstance("Blowfish");
            lIIllIllIIlIll.init(llIlIIIll[9], lIIllIllIIllII);
            return new String(lIIllIllIIlIll.doFinal(Base64.getDecoder().decode(lIIllIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIllIIlIlI) {
            lIIllIllIIlIlI.printStackTrace();
            return null;
        }
    }

    protected void shutDown() {
        this.w.remove((Overlay)this.x);
        0;
        d = llIlIIIll[5];
        q = new ab[llIlIIIll[4]];
        o = llIlIIIll[4];
        f = llIlIIIll[4];
        System.out.print(llIlIIIlI[llIlIIIll[19]]);
        super.stop();
    }

    private static boolean lIllIIIlIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIllIIIIlIII(String lIIllIlIllIlII, String lIIllIlIllIIll) {
        lIIllIlIllIlII = new String(Base64.getDecoder().decode(lIIllIlIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIlIllIlll = new StringBuilder();
        char[] lIIllIlIllIllI = lIIllIlIllIIll.toCharArray();
        int lIIllIlIllIlIl = llIlIIIll[4];
        char[] lIIllIlIlIllll = lIIllIlIllIlII.toCharArray();
        int lIIllIlIlIlllI = lIIllIlIlIllll.length;
        int lIIllIlIlIllIl = llIlIIIll[4];
        while (AccBuilderGWD.lIllIIIllIII(lIIllIlIlIllIl, lIIllIlIlIlllI)) {
            char lIIllIlIlllIlI = lIIllIlIlIllll[lIIllIlIlIllIl];
            lIIllIlIllIlll.append((char)(lIIllIlIlllIlI ^ lIIllIlIllIllI[lIIllIlIllIlIl % lIIllIlIllIllI.length]));
            0;
            ++lIIllIlIllIlIl;
            ++lIIllIlIlIllIl;
            0;
            if ((0x2A ^ 0x2E) > ((0x6C ^ 0xC) & ~(0xC8 ^ 0xA8))) continue;
            return null;
        }
        return String.valueOf(lIIllIlIllIlll);
    }

    private static boolean lIllIIIlIIlI(int n2, int n3) {
        return n2 > n3;
    }

    public AccBuilderGWD() {
        this.s = new WorldArea(llIlIIIll[0], llIlIIIll[1], llIlIIIll[2], llIlIIIll[3], llIlIIIll[4]);
        this.t = llIlIIIlI[llIlIIIll[4]];
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderGWD.lIllIIIlIlIl(n5, n6) && AccBuilderGWD.lIllIIIlIIll(n5, n7)) {
            n4 = llIlIIIll[5];
            0;
            
            }
        } else {
            n4 = llIlIIIll[4];
        }
        return n4 != 0;
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        d = llIlIIIll[4];
        System.out.print(llIlIIIlI[llIlIIIll[13]]);
        this.w.add((Overlay)this.x);
        0;
        a.clear();
        p = llIlIIIlI[llIlIIIll[14]];
        System.out.println(llIlIIIlI[llIlIIIll[15]]);
        a.clear();
        t[] tArray = new t[llIlIIIll[5]];
        tArray[AccBuilderGWD.llIlIIIll[4]] = new t();
        Collections.addAll(a, tArray);
        0;
        g = System.currentTimeMillis();
        Collections.shuffle(a);
        n = this.r.get70Agility();
    }

    private static boolean lIllIIIlIIII(int n2) {
        return n2 != 0;
    }

    static {
        AccBuilderGWD.lIllIIIIlIll();
        AccBuilderGWD.lIllIIIIlIlI();
        a = new ArrayList<ab>();
        b = System.currentTimeMillis();
        d = llIlIIIll[4];
        g = System.currentTimeMillis();
        h = llIlIIIlI[llIlIIIll[62]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        ab[] abArray = new ab[llIlIIIll[5]];
        abArray[AccBuilderGWD.llIlIIIll[4]] = new as();
        q = abArray;
    }

    private static boolean lIllIIIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderGWD.lIllIIIlIllI(n2, llIlIIIll[25])) {
            return;
        }
        if (AccBuilderGWD.lIllIIIIllIl(o)) {
            AccBuilderGWD lIIllIlllIllII;
            -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e.a(lIIllIlllIllII.t, "rsn: " + k + " account has been banned? - Acc builder " + p);
            o += llIlIIIll[5];
        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        NPC lIIllIlllllllI;
        block15: {
            AccBuilderGWD lIIlllIIIIIIll;
            block16: {
                -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e.y();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderGWD.lIllIIIlIlll(player2, player) && AccBuilderGWD.lIllIIIlIIII(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = llIlIIIll[5];
                        0;
                        if (2 <= -1) {
                            return ((0xBE ^ 0xB7 ^ (0xE ^ 0x19)) & (99 + 25 - -23 + 70 ^ 6 + 73 - -38 + 82 ^ -1)) != 0;
                        }
                    } else {
                        n4 = llIlIIIll[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderGWD.lIllIIIIlllI(player3) || AccBuilderGWD.lIllIIIlIlII(Game.getWildyLevel()) && !AccBuilderGWD.lIllIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(aq.mB), llIlIIIll[20])) break block15;
                int[] nArray = new int[llIlIIIll[5]];
                nArray[AccBuilderGWD.llIlIIIll[4]] = llIlIIIll[21];
                if (!AccBuilderGWD.lIllIIIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block16;
                int[] nArray2 = new int[llIlIIIll[5]];
                nArray2[AccBuilderGWD.llIlIIIll[4]] = llIlIIIll[22];
                if (!AccBuilderGWD.lIllIIIlIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block15;
            }
            if (AccBuilderGWD.lIllIIIIllIl(lIIlllIIIIIIll.s.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderGWD.lIllIIIlIIII(Dialog.isOpen() ? 1 : 0) && AccBuilderGWD.lIllIIIIlllI(Dialog.getText())) {
            if (AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[23]]) ? 1 : 0)) {
                G.fB = llIlIIIll[5];
            }
            if (!AccBuilderGWD.lIllIIIIllIl(Dialog.getText().contains(llIlIIIlI[llIlIIIll[24]]) ? 1 : 0) || AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[25]]) ? 1 : 0)) {
                // empty if block
            }
            if (AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[26]]) ? 1 : 0)) {
                -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.x.dG = llIlIIIll[5];
            }
            if (AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[27]]) ? 1 : 0)) {
                -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.x.dH = llIlIIIll[5];
            }
            if (AccBuilderGWD.lIllIIIlIIII((lIIllIlllllllI = new WorldArea(llIlIIIll[28], llIlIIIll[29], llIlIIIll[30], llIlIIIll[31], llIlIIIll[4])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[32]]) ? 1 : 0)) {
                z.dP = llIlIIIll[5];
            }
            if (AccBuilderGWD.lIllIIIlIIII(lIIllIlllllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[33]]) ? 1 : 0)) {
                z.dQ = llIlIIIll[5];
            }
            if (AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[34]]) ? 1 : 0)) {
                z.dR = llIlIIIll[5];
            }
            if (AccBuilderGWD.lIllIIIlIIII(Dialog.getText().contains(llIlIIIlI[llIlIIIll[20]]) ? 1 : 0)) {
                // empty if block
            }
        }
        if (AccBuilderGWD.lIllIIIIlllI(lIIllIlllllllI = NPCs.getNearest(nPC -> {
            int n2;
            NPC lIIllIlllIlIII;
            if (!(AccBuilderGWD.lIllIIIIllIl(nPC.getName().contains(llIlIIIlI[llIlIIIll[54]]) ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(nPC.getName().contains(llIlIIIlI[llIlIIIll[55]]) ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(nPC.getName().contains(llIlIIIlI[llIlIIIll[56]]) ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(nPC.getName().contains(llIlIIIlI[llIlIIIll[57]]) ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(nPC.getName().contains(llIlIIIlI[llIlIIIll[58]]) ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(nPC.getName().contains(llIlIIIlI[llIlIIIll[59]]) ? 1 : 0) && !AccBuilderGWD.lIllIIIlIIII(nPC.getName().contains(llIlIIIlI[llIlIIIll[60]]) ? 1 : 0) || !AccBuilderGWD.lIllIIIIllIl(lIIllIlllIlIII.getName().contains(llIlIIIlI[llIlIIIll[61]]) ? 1 : 0) || AccBuilderGWD.lIllIIIIllIl(L.ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && AccBuilderGWD.lIllIIIIllIl(L.gb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !AccBuilderGWD.lIllIIIlIIII(L.gc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !AccBuilderGWD.lIllIIIlIIll(lIIllIlllIlIII.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIlIIIll[10]))) {
                n2 = llIlIIIll[5];
                0;
                if (1 <= 0) {
                    return ((0x7D ^ 0x47 ^ (0x4B ^ 0x68)) & (0x52 ^ 0x25 ^ (0x2F ^ 0x41) ^ -1)) != 0;
                }
            } else {
                n2 = llIlIIIll[4];
            }
            return n2 != 0;
        })) && AccBuilderGWD.lIllIIIIllIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
            Time.sleepTicks((int)llIlIIIll[5]);
            0;
        }
        if (AccBuilderGWD.lIllIIIIllll(lIIllIlllllllI) && (!AccBuilderGWD.lIllIIIIllIl(L.ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !AccBuilderGWD.lIllIIIIllIl(L.gb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || AccBuilderGWD.lIllIIIlIIII(L.gc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && AccBuilderGWD.lIllIIIlIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
        }
        -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e.I();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lIIllIllllIIII;
        if (AccBuilderGWD.lIllIIIlIIII(chatMessage.getMessage().contains(llIlIIIlI[llIlIIIll[35]]) ? 1 : 0)) {
            System.out.println(llIlIIIlI[llIlIIIll[36]]);
            d = llIlIIIll[5];
        }
        if (AccBuilderGWD.lIllIIIlIIII(lIIllIllllIIII.getMessage().contains(llIlIIIlI[llIlIIIll[37]]) ? 1 : 0)) {
            System.out.println(llIlIIIlI[llIlIIIll[38]]);
            if (AccBuilderGWD.lIllIIIIllIl(Game.getWildyLevel()) && AccBuilderGWD.lIllIIIIllIl(Inventory.contains(item -> item.getName().contains(llIlIIIlI[llIlIIIll[53]])) ? 1 : 0)) {
                d = llIlIIIll[5];
                System.out.println(llIlIIIlI[llIlIIIll[39]]);
            }
            if (!AccBuilderGWD.lIllIIIlIlII(Game.getWildyLevel()) || AccBuilderGWD.lIllIIIlIIII(Inventory.contains(item -> item.getName().contains(llIlIIIlI[llIlIIIll[52]])) ? 1 : 0)) {
                d = llIlIIIll[4];
                System.out.println(llIlIIIlI[llIlIIIll[40]]);
            }
        }
        if (AccBuilderGWD.lIllIIIlIIII(lIIllIllllIIII.getMessage().contains(llIlIIIlI[llIlIIIll[30]]) ? 1 : 0) && AccBuilderGWD.lIllIIIlIIll(Players.getLocal().getWorldLocation().distanceTo(U.lm), llIlIIIll[18])) {
            String[] stringArray = new String[llIlIIIll[5]];
            stringArray[AccBuilderGWD.llIlIIIll[4]] = llIlIIIlI[llIlIIIll[41]];
            if (AccBuilderGWD.lIllIIIIlllI(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[llIlIIIll[5]];
                stringArray2[AccBuilderGWD.llIlIIIll[4]] = llIlIIIlI[llIlIIIll[42]];
                TileObjects.getNearest((String[])stringArray2).interact(llIlIIIlI[llIlIIIll[43]]);
                Time.sleepTicks((int)llIlIIIll[11]);
                0;
            }
            String[] stringArray3 = new String[llIlIIIll[5]];
            stringArray3[AccBuilderGWD.llIlIIIll[4]] = llIlIIIlI[llIlIIIll[44]];
            if (AccBuilderGWD.lIllIIIIlllI(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[llIlIIIll[5]];
                stringArray4[AccBuilderGWD.llIlIIIll[4]] = llIlIIIlI[llIlIIIll[45]];
                TileObjects.getNearest((String[])stringArray4).interact(llIlIIIlI[llIlIIIll[31]]);
                Time.sleepTicks((int)llIlIIIll[10]);
                0;
            }
        }
        if (AccBuilderGWD.lIllIIIlIIII(lIIllIllllIIII.getMessage().contains(llIlIIIlI[llIlIIIll[46]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llIlIIIll[47], llIlIIIll[48], llIlIIIll[4]));
            0;
            Time.sleepTicks((int)llIlIIIll[5]);
            0;
        }
        if (AccBuilderGWD.lIllIIIlIIII(lIIllIllllIIII.getMessage().contains(llIlIIIlI[llIlIIIll[49]]) ? 1 : 0)) {
            int[] nArray = new int[llIlIIIll[5]];
            nArray[AccBuilderGWD.llIlIIIll[4]] = llIlIIIll[50];
            if (AccBuilderGWD.lIllIIIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIlIIIll[5]];
                nArray2[AccBuilderGWD.llIlIIIll[4]] = llIlIIIll[50];
                Inventory.getFirst((int[])nArray2).interact(llIlIIIlI[llIlIIIll[51]]);
            }
        }
    }

    private static boolean lIllIIIIllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderGWD.lIllIIIlIIII(configChanged.getGroup().equalsIgnoreCase(llIlIIIlI[llIlIIIll[16]]) ? 1 : 0)) {
            void lIIlllIIIIlIlI;
            if (AccBuilderGWD.lIllIIIlIIII(configChanged.getKey().contains(llIlIIIlI[llIlIIIll[17]]) ? 1 : 0)) {
                this.u = this.r.turnScriptOnOff();
                if (AccBuilderGWD.lIllIIIlIIII(this.u ? 1 : 0)) {
                    d = llIlIIIll[4];
                    0;
                    if (2 <= 0) {
                        return;
                    }
                } else {
                    d = llIlIIIll[5];
                }
            }
            if (AccBuilderGWD.lIllIIIlIIII(lIIlllIIIIlIlI.getKey().contains(llIlIIIlI[llIlIIIll[18]]) ? 1 : 0)) {
                AccBuilderGWD lIIlllIIIIlIll;
                n = lIIlllIIIIlIll.r.get70Agility();
            }
        }
    }

    private static boolean lIllIIIIlllI(Object object) {
        return object != null;
    }

    private static boolean lIllIIIlIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIlIlII(int n2) {
        return n2 <= 0;
    }

    private static boolean lIllIIIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIllIIIlIIll(int n2, int n3) {
        return n2 <= n3;
    }
}

