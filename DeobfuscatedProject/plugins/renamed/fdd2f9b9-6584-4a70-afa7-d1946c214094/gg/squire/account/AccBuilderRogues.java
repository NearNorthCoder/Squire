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
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.C_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.S_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.p_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.u_Unknown;
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
@PluginDescriptor(name="Squire Rogues Outfit Builder", enabledByDefault=false)
public class AccBuilderRogues
extends Script {
    /* synthetic */ boolean t;
    public static /* synthetic */ List<G> a;
    @Inject
    private /* synthetic */ BuilderInfoBox w;
    @Inject
    public /* synthetic */ BuilderConfig q;
    public static /* synthetic */ boolean d;
    static /* synthetic */ String o;
    @Inject
    private /* synthetic */ OverlayManager v;
    /* synthetic */ String s;
    private static /* synthetic */ int[] lIIlllllIl;
    public static /* synthetic */ int f;
    /* synthetic */ WorldArea r;
    static /* synthetic */ int n;
    public static /* synthetic */ String l;
    public static /* synthetic */ String c;
    private static /* synthetic */ String[] lIIlllllII;
    private static /* synthetic */ G[] p;
    public static /* synthetic */ String h;
    public static /* synthetic */ long g;
    public static /* synthetic */ String k;
    public static /* synthetic */ String j;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ long b;
    public static /* synthetic */ String m;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    @Inject
    private /* synthetic */ Client u;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var11;
        if (AccBuilderRogues.lIIIIllIlIllI(chatMessage.getMessage().contains(lIIlllllII[lIIlllllIl[23]]) ? 1 : 0)) {
            System.out.println(lIIlllllII[lIIlllllIl[24]]);
            d = lIIlllllIl[5];
        }
        if (AccBuilderRogues.lIIIIllIlIllI(var11.getMessage().contains(lIIlllllII[lIIlllllIl[25]]) ? 1 : 0)) {
            System.out.println(lIIlllllII[lIIlllllIl[26]]);
            if (AccBuilderRogues.lIIIIllIlIIll(Game.getWildyLevel()) && AccBuilderRogues.lIIIIllIlIIll(Inventory.contains(item -> item.getName().contains(lIIlllllII[lIIlllllIl[42]])) ? 1 : 0)) {
                d = lIIlllllIl[5];
                System.out.println(lIIlllllII[lIIlllllIl[27]]);
            }
            if (!AccBuilderRogues.lIIIIllIllIlI(Game.getWildyLevel()) || AccBuilderRogues.lIIIIllIlIllI(Inventory.contains(item -> item.getName().contains(lIIlllllII[lIIlllllIl[41]])) ? 1 : 0)) {
                d = lIIlllllIl[4];
                System.out.println(lIIlllllII[lIIlllllIl[28]]);
            }
        }
        if (AccBuilderRogues.lIIIIllIlIllI(var11.getMessage().contains(lIIlllllII[lIIlllllIl[29]]) ? 1 : 0) && AccBuilderRogues.lIIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(C.hV), lIIlllllIl[18])) {
            String[] stringArray = new String[lIIlllllIl[5]];
            stringArray[AccBuilderRogues.lIIlllllIl[4]] = lIIlllllII[lIIlllllIl[30]];
            if (AccBuilderRogues.lIIIIllIlIlII(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lIIlllllIl[5]];
                stringArray2[AccBuilderRogues.lIIlllllIl[4]] = lIIlllllII[lIIlllllIl[19]];
                TileObjects.getNearest((String[])stringArray2).interact(lIIlllllII[lIIlllllIl[31]]);
                Time.sleepTicks((int)lIIlllllIl[11]);
                0;
            }
            String[] stringArray3 = new String[lIIlllllIl[5]];
            stringArray3[AccBuilderRogues.lIIlllllIl[4]] = lIIlllllII[lIIlllllIl[32]];
            if (AccBuilderRogues.lIIIIllIlIlII(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[lIIlllllIl[5]];
                stringArray4[AccBuilderRogues.lIIlllllIl[4]] = lIIlllllII[lIIlllllIl[33]];
                TileObjects.getNearest((String[])stringArray4).interact(lIIlllllII[lIIlllllIl[34]]);
                Time.sleepTicks((int)lIIlllllIl[10]);
                0;
            }
        }
        if (AccBuilderRogues.lIIIIllIlIllI(var11.getMessage().contains(lIIlllllII[lIIlllllIl[35]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIIlllllIl[36], lIIlllllIl[37], lIIlllllIl[4]));
            0;
            Time.sleepTicks((int)lIIlllllIl[5]);
            0;
        }
        if (AccBuilderRogues.lIIIIllIlIllI(var11.getMessage().contains(lIIlllllII[lIIlllllIl[38]]) ? 1 : 0)) {
            int[] nArray = new int[lIIlllllIl[5]];
            nArray[AccBuilderRogues.lIIlllllIl[4]] = lIIlllllIl[39];
            if (AccBuilderRogues.lIIIIllIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIlllllIl[5]];
                nArray2[AccBuilderRogues.lIIlllllIl[4]] = lIIlllllIl[39];
                Inventory.getFirst((int[])nArray2).interact(lIIlllllII[lIIlllllIl[40]]);
            }
        }
    }

    static {
        AccBuilderRogues.lIIIIllIlIIIl();
        AccBuilderRogues.lIIIIllIlIIII();
        a = new ArrayList<G>();
        b = System.currentTimeMillis();
        d = lIIlllllIl[4];
        g = System.currentTimeMillis();
        h = lIIlllllII[lIIlllllIl[43]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        G[] gArray = new G[lIIlllllIl[5]];
        gArray[AccBuilderRogues.lIIlllllIl[4]] = new U();
        p = gArray;
    }

    private static boolean lIIIIllIllIlI(int n2) {
        return n2 <= 0;
    }

    private static String lIIIIllIIllll(String var16, String var10) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIIlllllIl[9], var19);
            return new String(var5.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block5: {
            AccBuilderRogues var18;
            block6: {
                f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e_Unknown.w();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderRogues.lIIIIllIlllIl(player2, player) && AccBuilderRogues.lIIIIllIlIllI(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = lIIlllllIl[5];
                        0;
                        if (2 <= ((0x8B ^ 0xA5 ^ (0xB3 ^ 0x93)) & (106 + 91 - 73 + 3 ^ (3 ^ 0x72) ^ -1))) {
                            return ((0x6F ^ 7 ^ (0x56 ^ 0x12)) & (67 + 182 - 157 + 91 ^ 94 + 76 - 131 + 116 ^ -1)) != 0;
                        }
                    } else {
                        n4 = lIIlllllIl[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderRogues.lIIIIllIlIlII(player3) || AccBuilderRogues.lIIIIllIllIlI(Game.getWildyLevel()) && !AccBuilderRogues.lIIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(S.jv), lIIlllllIl[19])) break block5;
                int[] nArray = new int[lIIlllllIl[5]];
                nArray[AccBuilderRogues.lIIlllllIl[4]] = lIIlllllIl[20];
                if (!AccBuilderRogues.lIIIIllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[lIIlllllIl[5]];
                nArray2[AccBuilderRogues.lIIlllllIl[4]] = lIIlllllIl[21];
                if (!AccBuilderRogues.lIIIIllIlIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
            }
            if (AccBuilderRogues.lIIIIllIlIIll(var18.r.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderRogues.lIIIIllIlIllI(Dialog.isOpen() ? 1 : 0) && AccBuilderRogues.lIIIIllIlIlII(Dialog.getText()) && AccBuilderRogues.lIIIIllIlIllI(Dialog.getText().contains(lIIlllllII[lIIlllllIl[22]]) ? 1 : 0)) {
            f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.u_Unknown.cX = lIIlllllIl[5];
        }
        f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e_Unknown.G();
    }

    private static boolean lIIIIllIlIIll(int n2) {
        return n2 == 0;
    }

    private static void lIIIIllIlIIIl() {
        lIIlllllIl = new int[45];
        AccBuilderRogues.lIIlllllIl[0] = 0xFFFFEF27 & 0x1CFF;
        AccBuilderRogues.lIIlllllIl[1] = 0xFFFFFF59 & 0xEB6;
        AccBuilderRogues.lIIlllllIl[2] = 0x1E ^ 0x20;
        AccBuilderRogues.lIIlllllIl[3] = 137 + 137 - 242 + 210 ^ 147 + 38 - 64 + 78;
        AccBuilderRogues.lIIlllllIl[4] = (0x6E ^ 0x52) & ~(0x4B ^ 0x77);
        AccBuilderRogues.lIIlllllIl[5] = 1;
        AccBuilderRogues.lIIlllllIl[6] = 0 ^ 0x54 ^ (0x99 ^ 0xA9);
        AccBuilderRogues.lIIlllllIl[7] = 0xFFFFC71D & 0x39FB;
        AccBuilderRogues.lIIlllllIl[8] = 0xFFFFEFE9 & 0x13FE;
        AccBuilderRogues.lIIlllllIl[9] = 2;
        AccBuilderRogues.lIIlllllIl[10] = 3;
        AccBuilderRogues.lIIlllllIl[11] = 0x58 ^ 0x5C;
        AccBuilderRogues.lIIlllllIl[12] = 0xFFFFB7FD & 0x4A5A;
        AccBuilderRogues.lIIlllllIl[13] = 0xB7 ^ 0xB2;
        AccBuilderRogues.lIIlllllIl[14] = 0x6B ^ 0x74 ^ (0x32 ^ 0x2B);
        AccBuilderRogues.lIIlllllIl[15] = 0x9E ^ 0x99;
        AccBuilderRogues.lIIlllllIl[16] = 3 ^ 0x60 ^ (0x52 ^ 0x39);
        AccBuilderRogues.lIIlllllIl[17] = 0x85 ^ 0xAF ^ (0x4E ^ 0x6D);
        AccBuilderRogues.lIIlllllIl[18] = 18 + 62 - 24 + 112 ^ 131 + 30 - 75 + 76;
        AccBuilderRogues.lIIlllllIl[19] = 0x70 ^ 0x64;
        AccBuilderRogues.lIIlllllIl[20] = -(0xFFFFCAB7 & 0x7DC9) & (0xFFFFFAFC & 0x4F9B);
        AccBuilderRogues.lIIlllllIl[21] = 0xFFFF8A7B & 0x779D;
        AccBuilderRogues.lIIlllllIl[22] = 29 + 172 - 129 + 114 ^ 50 + 132 - 86 + 81;
        AccBuilderRogues.lIIlllllIl[23] = 144 + 65 - 193 + 159 ^ 152 + 70 - 130 + 71;
        AccBuilderRogues.lIIlllllIl[24] = 48 + 23 - -9 + 105 ^ 109 + 136 - 237 + 172;
        AccBuilderRogues.lIIlllllIl[25] = 0x96 ^ 0xBC ^ (0x48 ^ 0x6C);
        AccBuilderRogues.lIIlllllIl[26] = 0x7F ^ 0x59 ^ (0xAF ^ 0x86);
        AccBuilderRogues.lIIlllllIl[27] = 0x31 ^ 0x21;
        AccBuilderRogues.lIIlllllIl[28] = 0x75 ^ 0x64;
        AccBuilderRogues.lIIlllllIl[29] = 0x5A ^ 0x48;
        AccBuilderRogues.lIIlllllIl[30] = 0x1C ^ 0xF;
        AccBuilderRogues.lIIlllllIl[31] = 0x40 ^ 0x55;
        AccBuilderRogues.lIIlllllIl[32] = 0x72 ^ 0x64;
        AccBuilderRogues.lIIlllllIl[33] = 18 + 15 - -64 + 67 ^ 165 + 171 - 307 + 150;
        AccBuilderRogues.lIIlllllIl[34] = 7 ^ 0x1F;
        AccBuilderRogues.lIIlllllIl[35] = 0xA3 ^ 0xBA;
        AccBuilderRogues.lIIlllllIl[36] = 0xFFFFCFAD & 0x3BF3;
        AccBuilderRogues.lIIlllllIl[37] = -(0xFFFFEBDB & 0x377D) & (0xFFFFAFFF & Short.MAX_VALUE);
        AccBuilderRogues.lIIlllllIl[38] = 0x3E ^ 2 ^ (0x56 ^ 0x70);
        AccBuilderRogues.lIIlllllIl[39] = -(0xFFFFBF3B & 0x6ED5) & (0xFFFFEFFF & 0x3FBF);
        AccBuilderRogues.lIIlllllIl[40] = 0x43 ^ 0x58;
        AccBuilderRogues.lIIlllllIl[41] = 4 + 35 - -29 + 119 ^ 114 + 112 - 213 + 154;
        AccBuilderRogues.lIIlllllIl[42] = 0x3C ^ 0x5B ^ (0x7E ^ 4);
        AccBuilderRogues.lIIlllllIl[43] = 0xC ^ 0x12;
        AccBuilderRogues.lIIlllllIl[44] = 0xAF ^ 0xB0;
    }

    public AccBuilderRogues() {
        this.r = new WorldArea(lIIlllllIl[0], lIIlllllIl[1], lIIlllllIl[2], lIIlllllIl[3], lIIlllllIl[4]);
        this.s = lIIlllllII[lIIlllllIl[4]];
    }

    private static boolean lIIIIllIlIlIl(Object object) {
        return object == null;
    }

    private static boolean lIIIIllIlIlII(Object object) {
        return object != null;
    }

    private static boolean lIIIIllIllIll(int n2, int n3) {
        return n2 >= n3;
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        d = lIIlllllIl[4];
        System.out.print(lIIlllllII[lIIlllllIl[13]]);
        this.v.add((Overlay)this.w);
        0;
        a.clear();
        o = lIIlllllII[lIIlllllIl[14]];
        System.out.println(lIIlllllII[lIIlllllIl[15]]);
        a.clear();
        p[] pArray = new p[lIIlllllIl[5]];
        pArray[AccBuilderRogues.lIIlllllIl[4]] = new p();
        Collections.addAll(a, pArray);
        0;
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    private static boolean lIIIIllIllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderRogues.lIIIIllIlllII(n2, lIIlllllIl[25])) {
            return;
        }
        if (AccBuilderRogues.lIIIIllIlIIll(n)) {
            AccBuilderRogues var21;
            f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e_Unknown.a(var21.s, "rsn: " + k + " account has been banned? - Acc builder " + o);
            n += lIIlllllIl[5];
        }
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderRogues.lIIIIllIlIllI(configChanged.getGroup().equalsIgnoreCase(lIIlllllII[lIIlllllIl[16]]) ? 1 : 0) && AccBuilderRogues.lIIIIllIlIllI(configChanged.getKey().contains(lIIlllllII[lIIlllllIl[17]]) ? 1 : 0)) {
            this.t = this.q.turnScriptOnOff();
            if (AccBuilderRogues.lIIIIllIlIllI(this.t ? 1 : 0)) {
                d = lIIlllllIl[4];
                0;
                if ((0xBC ^ 0xB9) == 0) {
                    return;
                }
            } else {
                d = lIIlllllIl[5];
            }
        }
    }

    private static boolean lIIIIllIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIllIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIllIlllII(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIIIllIlIIII() {
        lIIlllllII = new String[lIIlllllIl[44]];
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[4]] = AccBuilderRogues."https://discord.com/api/webhooks/1215416272247062598/cqlx02Frndug7FbPDTSpjVvLxW5lC7hbt5KU2oGbtk-z8oN3eFJn54Yg_N3hGm1C1AKF";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[5]] = AccBuilderRogues."quest";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[9]] = AccBuilderRogues."Disabling GE warning";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[10]] = AccBuilderRogues."Navigating to GE";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[11]] = AccBuilderRogues."Finished account";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[13]] = AccBuilderRogues."\n[Plugin] Plugin starting up\n";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[14]] = AccBuilderRogues."Rogues outfit";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[15]] = AccBuilderRogues."Switching to One Click Rogues Outfit account";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[16]] = AccBuilderRogues."hootfighter";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[17]] = AccBuilderRogues."enabled";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[18]] = AccBuilderRogues."\n[Plugin] Plugin shut down\n";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[22]] = AccBuilderRogues."tell the king";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[23]] = AccBuilderRogues."You haven't got enough";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[24]] = AccBuilderRogues."Not enough gold for buying";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[25]] = AccBuilderRogues."Oh dear, you are dead!";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[26]] = AccBuilderRogues."We DIED!! :(";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[27]] = AccBuilderRogues."Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[28]] = AccBuilderRogues."We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[29]] = AccBuilderRogues."can't reach that";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[30]] = AccBuilderRogues."Door";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[19]] = AccBuilderRogues."Door";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[31]] = AccBuilderRogues."Open";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[32]] = AccBuilderRogues."Tree Door";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[33]] = AccBuilderRogues."Tree Door";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[34]] = AccBuilderRogues."Open";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[35]] = AccBuilderRogues."think that facing North";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[38]] = AccBuilderRogues."already some rum";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[40]] = AccBuilderRogues."Drop";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[41]] = AccBuilderRogues."Burning";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[42]] = AccBuilderRogues."Burning";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[43]] = AccBuilderRogues."";
    }

    private static String lIIIIllIIllIl(String var8, String var4) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var20 = var4.toCharArray();
        int var24 = lIIlllllIl[4];
        char[] var12 = var8.toCharArray();
        int var22 = var12.length;
        int var15 = lIIlllllIl[4];
        while (AccBuilderRogues.lIIIIllIllllI(var15, var22)) {
            char var6 = var12[var15];
            var17.append((char)(var6 ^ var20[var24 % var20.length]));
            0;
            ++var24;
            ++var15;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static boolean lIIIIllIllIII(int n2, int n3) {
        return n2 > n3;
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    private static boolean lIIIIllIlIIlI(Object object, Object object2) {
        return object == object2;
    }

    protected void shutDown() {
        this.v.remove((Overlay)this.w);
        0;
        d = lIIlllllIl[5];
        p = new G[lIIlllllIl[4]];
        n = lIIlllllIl[4];
        f = lIIlllllIl[4];
        System.out.print(lIIlllllII[lIIlllllIl[18]]);
        super.stop();
    }

    private static boolean lIIIIllIlllIl(Object object, Object object2) {
        return object != object2;
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderRogues.lIIIIllIllIll(n5, n6) && AccBuilderRogues.lIIIIllIllIIl(n5, n7)) {
            n4 = lIIlllllIl[5];
            0;
            if (((0x1F ^ 0x52) & ~(0x70 ^ 0x3D)) < -1) {
                return false;
            }
        } else {
            n4 = lIIlllllIl[4];
        }
        return n4 != 0;
    }

    private static boolean lIIIIllIllllI(int n2, int n3) {
        return n2 < n3;
    }

    protected int loop() {
        block10: {
            block11: {
                if (!AccBuilderRogues.lIIIIllIlIIlI(Game.getState(), GameState.LOGGED_IN)) break block10;
                if (!AccBuilderRogues.lIIIIllIlIIll(a.isEmpty() ? 1 : 0)) break block11;
                if (!AccBuilderRogues.lIIIIllIlIlII(j) || AccBuilderRogues.lIIIIllIlIlIl(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderRogues.lIIIIllIlIllI(a.get(lIIlllllIl[4]).V() ? 1 : 0)) {
                    if (AccBuilderRogues.lIIIIllIlIllI(a.get(lIIlllllIl[4]).U().contains(lIIlllllII[lIIlllllIl[5]]) ? 1 : 0)) {
                        f += lIIlllllIl[5];
                    }
                    System.out.println("Achieved " + a.get(lIIlllllIl[4]).U() + " goal");
                    a.remove(lIIlllllIl[4]);
                    0;
                    return lIIlllllIl[6];
                }
                if (!AccBuilderRogues.lIIIIllIlIIlI(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderRogues.lIIIIllIlIllI(f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e_Unknown.x() ? 1 : 0) && AccBuilderRogues.lIIIIllIlIIll(d ? 1 : 0) && AccBuilderRogues.lIIIIllIlIlll(f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e_Unknown.j(lIIlllllIl[7]), lIIlllllIl[8]) && AccBuilderRogues.lIIIIllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    c = lIIlllllII[lIIlllllIl[9]];
                    f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e_Unknown.y();
                    Time.sleepTicks((int)lIIlllllIl[5]);
                    0;
                    0;
                    
                    return (6 + 161 - 6 + 8 ^ 64 + 166 - 139 + 85) & (108 + 111 - 202 + 113 ^ 120 + 132 - 182 + 85 ^ -1);
                }
                int var23 = lIIlllllIl[4];
                try {
                    var23 = a.get(lIIlllllIl[4]).T();
                    0;
                }
                catch (Exception var7) {
                    var7.printStackTrace();
                }
                if (1 == -1) {
                    return (0xD9 ^ 0xBF ^ (0xE2 ^ 0xA7)) & (0x64 ^ 0x7C ^ (0x71 ^ 0x4A) ^ -1);
                }
                return var23;
            }
            if (AccBuilderRogues.lIIIIllIlIllI(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderRogues.lIIIIllIllIII(Players.getLocal().getWorldLocation().distanceTo(U.jL), lIIlllllIl[10])) {
                    c = lIIlllllII[lIIlllllIl[10]];
                    Movement.walkTo((WorldPoint)U.jL);
                    0;
                }
                if (AccBuilderRogues.lIIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(U.jL), lIIlllllIl[10])) {
                    c = lIIlllllII[lIIlllllIl[11]];
                }
            }
        }
        return lIIlllllIl[12];
    }

    private static String lIIIIllIIlllI(String var14, String var1) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIIlllllIl[16]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIIlllllIl[9], var2);
            return new String(var3.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }
}

