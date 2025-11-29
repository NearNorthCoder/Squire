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
 *  net.runelite.api.Player
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
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.LoginStateChanged
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.plugins.Script
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 *  org.pf4j.Extension
 */
package gg.squire.account;

import com.google.inject.Provides;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.E;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.H;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.N;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.aa;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.m;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.s;
import gg.squire.account.BuilderConfig;
import gg.squire.account.overlay.BuilderInfoBox;
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
import net.runelite.api.Player;
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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.LoginStateChanged;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import org.pf4j.Extension;

@Extension
@SquireUtil
@PluginDescriptor(name="Squire Templetrek Builder", enabledByDefault=false)
public class AccBuilderTempleTrek
extends Script {
    static /* synthetic */ int n;
    public static /* synthetic */ String j;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    @Inject
    private /* synthetic */ Client t;
    /* synthetic */ String r;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ long b;
    public static /* synthetic */ boolean d;
    public static /* synthetic */ String k;
    public static /* synthetic */ String m;
    /* synthetic */ WorldArea q;
    @Inject
    private /* synthetic */ BuilderInfoBox v;
    private static /* synthetic */ int[] lIIIIIllIIl;
    public static /* synthetic */ String c;
    public static /* synthetic */ int f;
    @Inject
    private /* synthetic */ OverlayManager u;
    public static /* synthetic */ String h;
    private static /* synthetic */ S[] o;
    public static /* synthetic */ long g;
    public static /* synthetic */ List<S> a;
    public static /* synthetic */ String l;
    private static /* synthetic */ String[] lIIIIIllIII;
    /* synthetic */ boolean s;
    @Inject
    public /* synthetic */ BuilderConfig p;

    @Subscribe
    public void a(GameTick gameTick) {
        block5: {
            AccBuilderTempleTrek lllllllllllllllllIIlllIlIlIIIlll;
            block6: {
                e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.w();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderTempleTrek.llIllllIIllll(player2, player) && AccBuilderTempleTrek.llIllllIIlIII(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = lIIIIIllIIl[5];
                        0;
                        if (2 <= 0) {
                            return ((0x1A ^ 0x5E) & ~(0xE0 ^ 0xA4)) != 0;
                        }
                    } else {
                        n4 = lIIIIIllIIl[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderTempleTrek.llIllllIIIllI(player3) || AccBuilderTempleTrek.llIllllIIllII(Game.getWildyLevel()) && !AccBuilderTempleTrek.llIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(aa.ju), lIIIIIllIIl[18])) break block5;
                int[] nArray = new int[lIIIIIllIIl[5]];
                nArray[AccBuilderTempleTrek.lIIIIIllIIl[4]] = lIIIIIllIIl[19];
                if (!AccBuilderTempleTrek.llIllllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[lIIIIIllIIl[5]];
                nArray2[AccBuilderTempleTrek.lIIIIIllIIl[4]] = lIIIIIllIIl[20];
                if (!AccBuilderTempleTrek.llIllllIIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
            }
            if (AccBuilderTempleTrek.llIllllIIIlIl(lllllllllllllllllIIlllIlIlIIIlll.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderTempleTrek.llIllllIIlIII(Dialog.isOpen() ? 1 : 0) && AccBuilderTempleTrek.llIllllIIIllI(Dialog.getText()) && AccBuilderTempleTrek.llIllllIIlIII(Dialog.getText().contains(lIIIIIllIII[lIIIIIllIIl[21]]) ? 1 : 0)) {
            e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.s.dq = lIIIIIllIIl[5];
        }
        e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.G();
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    private static boolean llIllllIIlllI(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIllllIIIIlI() {
        lIIIIIllIII = new String[lIIIIIllIIl[44]];
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[4]] = AccBuilderTempleTrek."https://discord.com/api/webhooks/1193421866459725834/O4zTPyFZMm83vMwkEnq6zlsGdAzLR4AGiJhhz0hFc0JZsJzMFQ-ivS8oiytVIzgMDJhM";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[5]] = AccBuilderTempleTrek."quest";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[9]] = AccBuilderTempleTrek."Disabling GE warning";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[10]] = AccBuilderTempleTrek."Navigating to GE";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[11]] = AccBuilderTempleTrek."Finished account";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[13]] = AccBuilderTempleTrek."\n[Plugin] Plugin starting up\n";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[14]] = AccBuilderTempleTrek."Switching to One Temple Trek Account";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[15]] = AccBuilderTempleTrek."hootfighter";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[16]] = AccBuilderTempleTrek."enabled";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[17]] = AccBuilderTempleTrek."\n[Plugin] Plugin shut down\n";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[21]] = AccBuilderTempleTrek."tell the king";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[22]] = AccBuilderTempleTrek."You haven't got enough";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[23]] = AccBuilderTempleTrek."Not enough gold for buying";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[24]] = AccBuilderTempleTrek."Oh dear, you are dead!";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[25]] = AccBuilderTempleTrek."We DIED!! :(";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[26]] = AccBuilderTempleTrek."Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[27]] = AccBuilderTempleTrek."We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[28]] = AccBuilderTempleTrek."can't reach that";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[29]] = AccBuilderTempleTrek."can't reach that";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[30]] = AccBuilderTempleTrek."Door";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[18]] = AccBuilderTempleTrek."Door";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[31]] = AccBuilderTempleTrek."Open";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[32]] = AccBuilderTempleTrek."Tree Door";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[33]] = AccBuilderTempleTrek."Tree Door";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[34]] = AccBuilderTempleTrek."Open";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[35]] = AccBuilderTempleTrek."think that facing North";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[38]] = AccBuilderTempleTrek."already some rum";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[40]] = AccBuilderTempleTrek."Drop";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[41]] = AccBuilderTempleTrek."Burning";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[42]] = AccBuilderTempleTrek."Burning";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[43]] = AccBuilderTempleTrek."";
    }

    private static boolean llIllllIIllII(int n2) {
        return n2 <= 0;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderTempleTrek.llIllllIIlllI(n2, lIIIIIllIIl[25])) {
            return;
        }
        if (AccBuilderTempleTrek.llIllllIIIlIl(n)) {
            AccBuilderTempleTrek lllllllllllllllllIIlllIlIIllIIIl;
            e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.a(lllllllllllllllllIIlllIlIIllIIIl.r, "rsn: " + k + " account has been banned? - Acc builder");
            n += lIIIIIllIIl[5];
        }
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderTempleTrek.llIllllIIlIII(configChanged.getGroup().equalsIgnoreCase(lIIIIIllIII[lIIIIIllIIl[15]]) ? 1 : 0) && AccBuilderTempleTrek.llIllllIIlIII(configChanged.getKey().contains(lIIIIIllIII[lIIIIIllIIl[16]]) ? 1 : 0)) {
            this.s = this.p.turnScriptOnOff();
            if (AccBuilderTempleTrek.llIllllIIlIII(this.s ? 1 : 0)) {
                d = lIIIIIllIIl[4];
                0;
                if ((0x68 ^ 0x6D) <= 0) {
                    return;
                }
            } else {
                d = lIIIIIllIIl[5];
            }
        }
    }

    private static String llIllllIIIIII(String lllllllllllllllllIIlllIlIIIlllIl, String lllllllllllllllllIIlllIlIIIlllII) {
        try {
            SecretKeySpec lllllllllllllllllIIlllIlIIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIlllIlIIIlllII.getBytes(StandardCharsets.UTF_8)), lIIIIIllIIl[16]), "DES");
            Cipher lllllllllllllllllIIlllIlIIIlllll = Cipher.getInstance("DES");
            lllllllllllllllllIIlllIlIIIlllll.init(lIIIIIllIIl[9], lllllllllllllllllIIlllIlIIlIIIII);
            return new String(lllllllllllllllllIIlllIlIIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIlllIlIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIIlllIlIIIllllI) {
            lllllllllllllllllIIlllIlIIIllllI.printStackTrace();
            return null;
        }
    }

    private static String llIlllIllllll(String lllllllllllllllllIIlllIlIIIlIIII, String lllllllllllllllllIIlllIlIIIIllll) {
        try {
            SecretKeySpec lllllllllllllllllIIlllIlIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIlllIlIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIIlllIlIIIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIIlllIlIIIlIIlI.init(lIIIIIllIIl[9], lllllllllllllllllIIlllIlIIIlIIll);
            return new String(lllllllllllllllllIIlllIlIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIlllIlIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIIlllIlIIIlIIIl) {
            lllllllllllllllllIIlllIlIIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIllllIIIIll() {
        lIIIIIllIIl = new int[45];
        AccBuilderTempleTrek.lIIIIIllIIl[0] = -(0xFFFFFD13 & 0x13FD) & (0xFFFFFFFF & 0x1D37);
        AccBuilderTempleTrek.lIIIIIllIIl[1] = 0xFFFFAF9E & 0x5E71;
        AccBuilderTempleTrek.lIIIIIllIIl[2] = 166 + 37 - 139 + 120 ^ 88 + 51 - 56 + 51;
        AccBuilderTempleTrek.lIIIIIllIIl[3] = 0xD3 ^ 0xC6 ^ (0xBC ^ 0x9C);
        AccBuilderTempleTrek.lIIIIIllIIl[4] = (0xBD ^ 0xB3) & ~(0xD ^ 3);
        AccBuilderTempleTrek.lIIIIIllIIl[5] = 1;
        AccBuilderTempleTrek.lIIIIIllIIl[6] = 0x96 ^ 0x90 ^ (0x7E ^ 0x1C);
        AccBuilderTempleTrek.lIIIIIllIIl[7] = -(0xFFFFFBCF & 0xCF5) & (0xFFFFBDDD & 0x4BFF);
        AccBuilderTempleTrek.lIIIIIllIIl[8] = -(0xFFFFBED8 & 0x7D3F) & (0xFFFFBFFF & Short.MAX_VALUE);
        AccBuilderTempleTrek.lIIIIIllIIl[9] = 2;
        AccBuilderTempleTrek.lIIIIIllIIl[10] = 3;
        AccBuilderTempleTrek.lIIIIIllIIl[11] = 0x7F ^ 0x5E ^ (0x93 ^ 0xB6);
        AccBuilderTempleTrek.lIIIIIllIIl[12] = 0xFFFFA2D8 & 0x5F7F;
        AccBuilderTempleTrek.lIIIIIllIIl[13] = 0x97 ^ 0x92;
        AccBuilderTempleTrek.lIIIIIllIIl[14] = 0x8C ^ 0xBC ^ (0x66 ^ 0x50);
        AccBuilderTempleTrek.lIIIIIllIIl[15] = 0x26 ^ 0x21;
        AccBuilderTempleTrek.lIIIIIllIIl[16] = 0x14 ^ 0x1C;
        AccBuilderTempleTrek.lIIIIIllIIl[17] = 0x12 ^ 0x1B;
        AccBuilderTempleTrek.lIIIIIllIIl[18] = 1 ^ 0x15;
        AccBuilderTempleTrek.lIIIIIllIIl[19] = 0xFFFF8A9B & 0x777C;
        AccBuilderTempleTrek.lIIIIIllIIl[20] = -(0xFFFFDAEF & 0x75F1) & (0xFFFFD2FB & 0x7FFD);
        AccBuilderTempleTrek.lIIIIIllIIl[21] = 0xA8 ^ 0xA2;
        AccBuilderTempleTrek.lIIIIIllIIl[22] = 0x6C ^ 0x67;
        AccBuilderTempleTrek.lIIIIIllIIl[23] = 0xAF ^ 0x98 ^ (0x4D ^ 0x76);
        AccBuilderTempleTrek.lIIIIIllIIl[24] = 34 + 111 - 21 + 6 ^ 110 + 115 - 210 + 128;
        AccBuilderTempleTrek.lIIIIIllIIl[25] = 78 + 64 - 69 + 76 ^ 128 + 131 - 129 + 25;
        AccBuilderTempleTrek.lIIIIIllIIl[26] = 0x40 ^ 0x7C ^ (0x24 ^ 0x17);
        AccBuilderTempleTrek.lIIIIIllIIl[27] = 171 + 99 - 142 + 48 ^ 123 + 139 - 215 + 113;
        AccBuilderTempleTrek.lIIIIIllIIl[28] = 0xE2 ^ 0x93 ^ (0x64 ^ 4);
        AccBuilderTempleTrek.lIIIIIllIIl[29] = 0x99 ^ 0x8B;
        AccBuilderTempleTrek.lIIIIIllIIl[30] = 0x98 ^ 0x8B;
        AccBuilderTempleTrek.lIIIIIllIIl[31] = 0x36 ^ 0x23;
        AccBuilderTempleTrek.lIIIIIllIIl[32] = 0xB0 ^ 0xA6;
        AccBuilderTempleTrek.lIIIIIllIIl[33] = 0x4F ^ 0x43 ^ (0x66 ^ 0x7D);
        AccBuilderTempleTrek.lIIIIIllIIl[34] = 0x10 ^ 8;
        AccBuilderTempleTrek.lIIIIIllIIl[35] = 0x81 ^ 0x98;
        AccBuilderTempleTrek.lIIIIIllIIl[36] = -(0xFFFFF47F & 0x7FC7) & (0xFFFFFFE7 & Short.MAX_VALUE);
        AccBuilderTempleTrek.lIIIIIllIIl[37] = -(0xFFFF8D7F & 0x73D1) & (0xFFFF9DFF & 0x6FF7);
        AccBuilderTempleTrek.lIIIIIllIIl[38] = 0x58 ^ 0x42;
        AccBuilderTempleTrek.lIIIIIllIIl[39] = -(0xFFFFBE5D & 0x7BA3) & (0xFFFFFFBF & 0x3BEF);
        AccBuilderTempleTrek.lIIIIIllIIl[40] = 0x29 ^ 0x39 ^ (0x1D ^ 0x16);
        AccBuilderTempleTrek.lIIIIIllIIl[41] = 0xDF ^ 0xAD ^ (0x4D ^ 0x23);
        AccBuilderTempleTrek.lIIIIIllIIl[42] = 0xEF ^ 0xB4 ^ (0xF5 ^ 0xB3);
        AccBuilderTempleTrek.lIIIIIllIIl[43] = 0xCC ^ 0x86 ^ (0xE9 ^ 0xBD);
        AccBuilderTempleTrek.lIIIIIllIIl[44] = 0x86 ^ 0x99;
    }

    private static boolean llIllllIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllllllllllllllllIIlllIlIIllIlIl;
        if (AccBuilderTempleTrek.llIllllIIlIII(chatMessage.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[22]]) ? 1 : 0)) {
            System.out.println(lIIIIIllIII[lIIIIIllIIl[23]]);
            d = lIIIIIllIIl[5];
        }
        if (AccBuilderTempleTrek.llIllllIIlIII(lllllllllllllllllIIlllIlIIllIlIl.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[24]]) ? 1 : 0)) {
            System.out.println(lIIIIIllIII[lIIIIIllIIl[25]]);
            if (AccBuilderTempleTrek.llIllllIIIlIl(Game.getWildyLevel()) && AccBuilderTempleTrek.llIllllIIIlIl(Inventory.contains(item -> item.getName().contains(lIIIIIllIII[lIIIIIllIIl[42]])) ? 1 : 0)) {
                d = lIIIIIllIIl[5];
                System.out.println(lIIIIIllIII[lIIIIIllIIl[26]]);
            }
            if (!AccBuilderTempleTrek.llIllllIIllII(Game.getWildyLevel()) || AccBuilderTempleTrek.llIllllIIlIII(Inventory.contains(item -> item.getName().contains(lIIIIIllIII[lIIIIIllIIl[41]])) ? 1 : 0)) {
                d = lIIIIIllIIl[4];
                System.out.println(lIIIIIllIII[lIIIIIllIIl[27]]);
            }
        }
        if (AccBuilderTempleTrek.llIllllIIlIII(lllllllllllllllllIIlllIlIIllIlIl.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[28]]) ? 1 : 0) && AccBuilderTempleTrek.llIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(N.ig), lIIIIIllIIl[21])) {
            e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.v();
        }
        if (AccBuilderTempleTrek.llIllllIIlIII(lllllllllllllllllIIlllIlIIllIlIl.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[29]]) ? 1 : 0) && (!AccBuilderTempleTrek.llIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(H.ht), lIIIIIllIIl[15]) || AccBuilderTempleTrek.llIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(E.gY), lIIIIIllIIl[21]))) {
            String[] stringArray = new String[lIIIIIllIIl[5]];
            stringArray[AccBuilderTempleTrek.lIIIIIllIIl[4]] = lIIIIIllIII[lIIIIIllIIl[30]];
            if (AccBuilderTempleTrek.llIllllIIIllI(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lIIIIIllIIl[5]];
                stringArray2[AccBuilderTempleTrek.lIIIIIllIIl[4]] = lIIIIIllIII[lIIIIIllIIl[18]];
                TileObjects.getNearest((String[])stringArray2).interact(lIIIIIllIII[lIIIIIllIIl[31]]);
                Time.sleepTicks((int)lIIIIIllIIl[11]);
                0;
            }
            String[] stringArray3 = new String[lIIIIIllIIl[5]];
            stringArray3[AccBuilderTempleTrek.lIIIIIllIIl[4]] = lIIIIIllIII[lIIIIIllIIl[32]];
            if (AccBuilderTempleTrek.llIllllIIIllI(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[lIIIIIllIIl[5]];
                stringArray4[AccBuilderTempleTrek.lIIIIIllIIl[4]] = lIIIIIllIII[lIIIIIllIIl[33]];
                TileObjects.getNearest((String[])stringArray4).interact(lIIIIIllIII[lIIIIIllIIl[34]]);
                Time.sleepTicks((int)lIIIIIllIIl[10]);
                0;
            }
        }
        if (AccBuilderTempleTrek.llIllllIIlIII(lllllllllllllllllIIlllIlIIllIlIl.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[35]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIllIIl[36], lIIIIIllIIl[37], lIIIIIllIIl[4]));
            0;
            Time.sleepTicks((int)lIIIIIllIIl[5]);
            0;
        }
        if (AccBuilderTempleTrek.llIllllIIlIII(lllllllllllllllllIIlllIlIIllIlIl.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[38]]) ? 1 : 0)) {
            int[] nArray = new int[lIIIIIllIIl[5]];
            nArray[AccBuilderTempleTrek.lIIIIIllIIl[4]] = lIIIIIllIIl[39];
            if (AccBuilderTempleTrek.llIllllIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIIIllIIl[5]];
                nArray2[AccBuilderTempleTrek.lIIIIIllIIl[4]] = lIIIIIllIIl[39];
                Inventory.getFirst((int[])nArray2).interact(lIIIIIllIII[lIIIIIllIIl[40]]);
            }
        }
    }

    protected void shutDown() {
        this.u.remove((Overlay)this.v);
        0;
        d = lIIIIIllIIl[5];
        o = new S[lIIIIIllIIl[4]];
        n = lIIIIIllIIl[4];
        f = lIIIIIllIIl[4];
        System.out.print(lIIIIIllIII[lIIIIIllIIl[17]]);
        super.stop();
    }

    private static boolean llIllllIIlIII(int n2) {
        return n2 != 0;
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        d = lIIIIIllIIl[4];
        System.out.print(lIIIIIllIII[lIIIIIllIIl[13]]);
        this.u.add((Overlay)this.v);
        0;
        a.clear();
        System.out.println(lIIIIIllIII[lIIIIIllIIl[14]]);
        a.clear();
        m[] mArray = new m[lIIIIIllIIl[5]];
        mArray[AccBuilderTempleTrek.lIIIIIllIIl[4]] = new m();
        Collections.addAll(a, mArray);
        0;
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    private static boolean llIllllIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIllllIIllll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIllllIIIlll(Object object) {
        return object == null;
    }

    static {
        AccBuilderTempleTrek.llIllllIIIIll();
        AccBuilderTempleTrek.llIllllIIIIlI();
        a = new ArrayList<S>();
        b = System.currentTimeMillis();
        d = lIIIIIllIIl[4];
        g = System.currentTimeMillis();
        h = lIIIIIllIII[lIIIIIllIIl[43]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        S[] sArray = new S[lIIIIIllIIl[5]];
        sArray[AccBuilderTempleTrek.lIIIIIllIIl[4]] = new ac();
        o = sArray;
    }

    private static boolean llIllllIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    protected int loop() {
        block10: {
            block11: {
                if (!AccBuilderTempleTrek.llIllllIIIlII(Game.getState(), GameState.LOGGED_IN)) break block10;
                if (!AccBuilderTempleTrek.llIllllIIIlIl(a.isEmpty() ? 1 : 0)) break block11;
                if (!AccBuilderTempleTrek.llIllllIIIllI(j) || AccBuilderTempleTrek.llIllllIIIlll(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderTempleTrek.llIllllIIlIII(a.get(lIIIIIllIIl[4]).V() ? 1 : 0)) {
                    if (AccBuilderTempleTrek.llIllllIIlIII(a.get(lIIIIIllIIl[4]).U().contains(lIIIIIllIII[lIIIIIllIIl[5]]) ? 1 : 0)) {
                        f += lIIIIIllIIl[5];
                    }
                    System.out.println("Achieved " + a.get(lIIIIIllIIl[4]).U() + " goal");
                    a.remove(lIIIIIllIIl[4]);
                    0;
                    return lIIIIIllIIl[6];
                }
                if (!AccBuilderTempleTrek.llIllllIIIlII(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderTempleTrek.llIllllIIlIII(e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.x() ? 1 : 0) && AccBuilderTempleTrek.llIllllIIIlIl(d ? 1 : 0) && AccBuilderTempleTrek.llIllllIIlIIl(e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.j(lIIIIIllIIl[7]), lIIIIIllIIl[8]) && AccBuilderTempleTrek.llIllllIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    c = lIIIIIllIII[lIIIIIllIIl[9]];
                    e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.y();
                    Time.sleepTicks((int)lIIIIIllIIl[5]);
                    0;
                    0;
                    if (1 < 2) continue;
                    return (0xA6 ^ 0x96 ^ (0x62 ^ 1)) & (3 ^ (0x32 ^ 0x62) ^ -1);
                }
                int lllllllllllllllllIIlllIlIlIlIIlI = lIIIIIllIIl[4];
                try {
                    lllllllllllllllllIIlllIlIlIlIIlI = a.get(lIIIIIllIIl[4]).T();
                    0;
                }
                catch (Exception lllllllllllllllllIIlllIlIlIlIIIl) {
                    lllllllllllllllllIIlllIlIlIlIIIl.printStackTrace();
                }
                if (null != null) {
                    return (0xE8 ^ 0xBC) & ~(0x63 ^ 0x37);
                }
                return lllllllllllllllllIIlllIlIlIlIIlI;
            }
            if (AccBuilderTempleTrek.llIllllIIlIII(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderTempleTrek.llIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ac.jR), lIIIIIllIIl[10])) {
                    c = lIIIIIllIII[lIIIIIllIIl[10]];
                    Movement.walkTo((WorldPoint)ac.jR);
                    0;
                }
                if (AccBuilderTempleTrek.llIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(ac.jR), lIIIIIllIIl[10])) {
                    c = lIIIIIllIII[lIIIIIllIIl[11]];
                }
            }
        }
        return lIIIIIllIIl[12];
    }

    private static boolean llIllllIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    public AccBuilderTempleTrek() {
        this.q = new WorldArea(lIIIIIllIIl[0], lIIIIIllIIl[1], lIIIIIllIIl[2], lIIIIIllIIl[3], lIIIIIllIIl[4]);
        this.r = lIIIIIllIII[lIIIIIllIIl[4]];
    }

    private static boolean llIllllIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIllllIIIllI(Object object) {
        return object != null;
    }

    private static boolean llIllllIIIlII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIllllIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderTempleTrek.llIllllIIllIl(n5, n6) && AccBuilderTempleTrek.llIllllIIlIll(n5, n7)) {
            n4 = lIIIIIllIIl[5];
            0;
            if (null != null) {
                return ((0x37 ^ 0x22 ^ (0xD6 ^ 0xC6)) & (124 + 18 - 46 + 39 ^ 73 + 50 - 91 + 98 ^ -1)) != 0;
            }
        } else {
            n4 = lIIIIIllIIl[4];
        }
        return n4 != 0;
    }

    private static String llIllllIIIIIl(String lllllllllllllllllIIlllIlIIIIIIII, String lllllllllllllllllIIlllIIllllllll) {
        lllllllllllllllllIIlllIlIIIIIIII = new String(Base64.getDecoder().decode(lllllllllllllllllIIlllIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIIlllIIlllllllI = new StringBuilder();
        char[] lllllllllllllllllIIlllIIllllllIl = lllllllllllllllllIIlllIIllllllll.toCharArray();
        int lllllllllllllllllIIlllIIllllllII = lIIIIIllIIl[4];
        char[] lllllllllllllllllIIlllIIllllIllI = lllllllllllllllllIIlllIlIIIIIIII.toCharArray();
        int lllllllllllllllllIIlllIIllllIlIl = lllllllllllllllllIIlllIIllllIllI.length;
        int lllllllllllllllllIIlllIIllllIlII = lIIIIIllIIl[4];
        while (AccBuilderTempleTrek.llIllllIlIIII(lllllllllllllllllIIlllIIllllIlII, lllllllllllllllllIIlllIIllllIlIl)) {
            char lllllllllllllllllIIlllIlIIIIIIIl = lllllllllllllllllIIlllIIllllIllI[lllllllllllllllllIIlllIIllllIlII];
            lllllllllllllllllIIlllIIlllllllI.append((char)(lllllllllllllllllIIlllIlIIIIIIIl ^ lllllllllllllllllIIlllIIllllllIl[lllllllllllllllllIIlllIIllllllII % lllllllllllllllllIIlllIIllllllIl.length]));
            0;
            ++lllllllllllllllllIIlllIIllllllII;
            ++lllllllllllllllllIIlllIIllllIlII;
            0;
            if (((0x1D ^ 0x29 ^ (0xA6 ^ 0xAA) & ~(0x4E ^ 0x42)) & (0xB3 ^ 0xBF ^ (0x65 ^ 0x5D) ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIIlllIIlllllllI);
    }
}

