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
import gg.squire.account.BuilderConfig;
import gg.squire.account.GodsApi.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.F;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.X;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.s;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.x;
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
@PluginDescriptor(name="Squire Shaman Builder", enabledByDefault=false)
@SquireUtil
public class AccBuilderShamans
extends Script {
    private static /* synthetic */ int[] lIlIlIIIll;
    public static /* synthetic */ String h;
    public static /* synthetic */ String j;
    private static /* synthetic */ String[] lIlIlIIIlI;
    public static /* synthetic */ String k;
    public static /* synthetic */ int f;
    public static /* synthetic */ long b;
    public static /* synthetic */ String m;
    public static /* synthetic */ boolean e;
    /* synthetic */ String r;
    public static /* synthetic */ String l;
    public static /* synthetic */ String c;
    private static /* synthetic */ K[] o;
    public static /* synthetic */ boolean d;
    @Inject
    private /* synthetic */ BuilderInfoBox v;
    static /* synthetic */ int n;
    @Inject
    private /* synthetic */ Client t;
    @Inject
    private /* synthetic */ OverlayManager u;
    /* synthetic */ boolean s;
    public static /* synthetic */ long g;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    @Inject
    public /* synthetic */ BuilderConfig p;
    public static /* synthetic */ List<K> a;
    /* synthetic */ WorldArea q;

    private static boolean lIIIllllllllI(int n2) {
        return n2 <= 0;
    }

    private static boolean lIIlIIIIIIIIl(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllllllllllllllllllIllllIIllIlIl;
        if (AccBuilderShamans.lIIIllllllIlI(chatMessage.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[22]]) ? 1 : 0)) {
            System.out.println(lIlIlIIIlI[lIlIlIIIll[23]]);
            d = lIlIlIIIll[5];
        }
        if (AccBuilderShamans.lIIIllllllIlI(lllllllllllllllllllIllllIIllIlIl.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[24]]) ? 1 : 0)) {
            System.out.println(lIlIlIIIlI[lIlIlIIIll[25]]);
            if (AccBuilderShamans.lIIIlllllIlll(Game.getWildyLevel()) && AccBuilderShamans.lIIIlllllIlll(Inventory.contains(item -> item.getName().contains(lIlIlIIIlI[lIlIlIIIll[41]])) ? 1 : 0)) {
                d = lIlIlIIIll[5];
                System.out.println(lIlIlIIIlI[lIlIlIIIll[26]]);
            }
            if (!AccBuilderShamans.lIIIllllllllI(Game.getWildyLevel()) || AccBuilderShamans.lIIIllllllIlI(Inventory.contains(item -> item.getName().contains(lIlIlIIIlI[lIlIlIIIll[40]])) ? 1 : 0)) {
                d = lIlIlIIIll[4];
                System.out.println(lIlIlIIIlI[lIlIlIIIll[27]]);
            }
        }
        if (AccBuilderShamans.lIIIllllllIlI(lllllllllllllllllllIllllIIllIlIl.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[28]]) ? 1 : 0) && AccBuilderShamans.lIIIlllllllIl(Players.getLocal().getWorldLocation().distanceTo(F.iJ), lIlIlIIIll[21])) {
            String[] stringArray = new String[lIlIlIIIll[5]];
            stringArray[AccBuilderShamans.lIlIlIIIll[4]] = lIlIlIIIlI[lIlIlIIIll[29]];
            if (AccBuilderShamans.lIIIllllllIII(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lIlIlIIIll[5]];
                stringArray2[AccBuilderShamans.lIlIlIIIll[4]] = lIlIlIIIlI[lIlIlIIIll[30]];
                TileObjects.getNearest((String[])stringArray2).interact(lIlIlIIIlI[lIlIlIIIll[18]]);
                Time.sleepTicks((int)lIlIlIIIll[11]);
                0;
            }
            String[] stringArray3 = new String[lIlIlIIIll[5]];
            stringArray3[AccBuilderShamans.lIlIlIIIll[4]] = lIlIlIIIlI[lIlIlIIIll[31]];
            if (AccBuilderShamans.lIIIllllllIII(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[lIlIlIIIll[5]];
                stringArray4[AccBuilderShamans.lIlIlIIIll[4]] = lIlIlIIIlI[lIlIlIIIll[32]];
                TileObjects.getNearest((String[])stringArray4).interact(lIlIlIIIlI[lIlIlIIIll[33]]);
                Time.sleepTicks((int)lIlIlIIIll[10]);
                0;
            }
        }
        if (AccBuilderShamans.lIIIllllllIlI(lllllllllllllllllllIllllIIllIlIl.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[34]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIlIlIIIll[35], lIlIlIIIll[36], lIlIlIIIll[4]));
            0;
            Time.sleepTicks((int)lIlIlIIIll[5]);
            0;
        }
        if (AccBuilderShamans.lIIIllllllIlI(lllllllllllllllllllIllllIIllIlIl.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[37]]) ? 1 : 0)) {
            int[] nArray = new int[lIlIlIIIll[5]];
            nArray[AccBuilderShamans.lIlIlIIIll[4]] = lIlIlIIIll[38];
            if (AccBuilderShamans.lIIIllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIlIIIll[5]];
                nArray2[AccBuilderShamans.lIlIlIIIll[4]] = lIlIlIIIll[38];
                Inventory.getFirst((int[])nArray2).interact(lIlIlIIIlI[lIlIlIIIll[39]]);
            }
        }
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderShamans.lIIIlllllllll(n5, n6) && AccBuilderShamans.lIIIlllllllIl(n5, n7)) {
            n4 = lIlIlIIIll[5];
            0;
            if (-(0xA8 ^ 0xAD) >= 0) {
                return ((0x3B ^ 0x15) & ~(0x7E ^ 0x50)) != 0;
            }
        } else {
            n4 = lIlIlIIIll[4];
        }
        return n4 != 0;
    }

    private static boolean lIIIllllllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlllllllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIllllllIIl(Object object) {
        return object == null;
    }

    private static void lIIIlllllIlIl() {
        lIlIlIIIll = new int[44];
        AccBuilderShamans.lIlIlIIIll[0] = -(0xFFFFF099 & 0x2FE7) & (0xFFFFADEF & 0x7EB7);
        AccBuilderShamans.lIlIlIIIll[1] = 0xFFFFEFB1 & 0x1E5E;
        AccBuilderShamans.lIlIlIIIll[2] = 0x71 ^ 0x77 ^ (0x92 ^ 0xAA);
        AccBuilderShamans.lIlIlIIIll[3] = 4 ^ 0x31;
        AccBuilderShamans.lIlIlIIIll[4] = (0x79 ^ 0x10 ^ (0xC0 ^ 0xB8)) & (0x43 ^ 0x75 ^ (0x88 ^ 0xAF) ^ -1);
        AccBuilderShamans.lIlIlIIIll[5] = 1;
        AccBuilderShamans.lIlIlIIIll[6] = 21 + 13 - -111 + 75 ^ 120 + 9 - 121 + 176;
        AccBuilderShamans.lIlIlIIIll[7] = -(0xFFFFFDC7 & 0x16FF) & (0xFFFFF5DF & 0x1FFF);
        AccBuilderShamans.lIlIlIIIll[8] = -(0xFFFFE5D7 & 0x7E3B) & (0xFFFFE7FB & 0x7FFE);
        AccBuilderShamans.lIlIlIIIll[9] = 2;
        AccBuilderShamans.lIlIlIIIll[10] = 3;
        AccBuilderShamans.lIlIlIIIll[11] = 0x52 ^ 0x56;
        AccBuilderShamans.lIlIlIIIll[12] = 0xFFFFAE5D & 0x53FA;
        AccBuilderShamans.lIlIlIIIll[13] = 0x63 ^ 0x27 ^ (0xF1 ^ 0xB0);
        AccBuilderShamans.lIlIlIIIll[14] = 0x74 ^ 0x72;
        AccBuilderShamans.lIlIlIIIll[15] = 0x77 ^ 0x45 ^ (0x26 ^ 0x13);
        AccBuilderShamans.lIlIlIIIll[16] = 0xB4 ^ 0xBC;
        AccBuilderShamans.lIlIlIIIll[17] = 0x12 ^ 0x27 ^ (0x86 ^ 0xBA);
        AccBuilderShamans.lIlIlIIIll[18] = 0x99 ^ 0x8D;
        AccBuilderShamans.lIlIlIIIll[19] = 0xFFFFBBD8 & 0x463F;
        AccBuilderShamans.lIlIlIIIll[20] = 0xFFFFEFBD & 0x125B;
        AccBuilderShamans.lIlIlIIIll[21] = 0xA6 ^ 0xAC;
        AccBuilderShamans.lIlIlIIIll[22] = 0x4B ^ 0x40;
        AccBuilderShamans.lIlIlIIIll[23] = 0x53 ^ 0x76 ^ (0x4A ^ 0x63);
        AccBuilderShamans.lIlIlIIIll[24] = 0x50 ^ 0x5D;
        AccBuilderShamans.lIlIlIIIll[25] = 0x6F ^ 0x58 ^ (0x80 ^ 0xB9);
        AccBuilderShamans.lIlIlIIIll[26] = 0xFA ^ 0xBA ^ (0x1A ^ 0x55);
        AccBuilderShamans.lIlIlIIIll[27] = 0x87 ^ 0x89 ^ (0x91 ^ 0x8F);
        AccBuilderShamans.lIlIlIIIll[28] = 0x90 ^ 0x81;
        AccBuilderShamans.lIlIlIIIll[29] = 3 ^ 0x11;
        AccBuilderShamans.lIlIlIIIll[30] = 0x61 ^ 0x57 ^ (0xBA ^ 0x9F);
        AccBuilderShamans.lIlIlIIIll[31] = 0x90 ^ 0x85;
        AccBuilderShamans.lIlIlIIIll[32] = 50 + 48 - 44 + 135 ^ 46 + 143 - 81 + 63;
        AccBuilderShamans.lIlIlIIIll[33] = 0xD0 ^ 0xC7;
        AccBuilderShamans.lIlIlIIIll[34] = 0x6F ^ 0x77;
        AccBuilderShamans.lIlIlIIIll[35] = -(0xFFFFE547 & 0x7EFD) & (0xFFFFFFE5 & 0x6FFF);
        AccBuilderShamans.lIlIlIIIll[36] = 0xFFFFFFBF & 0xCE7;
        AccBuilderShamans.lIlIlIIIll[37] = 3 ^ 0x1A;
        AccBuilderShamans.lIlIlIIIll[38] = -(0xFFFFCD55 & 0x7EBB) & (0xFFFFCDBF & Short.MAX_VALUE);
        AccBuilderShamans.lIlIlIIIll[39] = 0xB ^ 0x11;
        AccBuilderShamans.lIlIlIIIll[40] = 0x17 ^ 0xC;
        AccBuilderShamans.lIlIlIIIll[41] = 0x34 ^ 0x28;
        AccBuilderShamans.lIlIlIIIll[42] = 0x9F ^ 0x82;
        AccBuilderShamans.lIlIlIIIll[43] = 0x17 ^ 0x79 ^ (7 ^ 0x77);
    }

    private static boolean lIIIlllllIllI(Object object, Object object2) {
        return object == object2;
    }

    private static void lIIIlllllIlII() {
        lIlIlIIIlI = new String[lIlIlIIIll[43]];
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[4]] = AccBuilderShamans."https://discord.com/api/webhooks/1215418045011591239/tdzGIffS11EAOaA2FrJCIfdfHHJzCU9iyB8jbYDt2qO4Wsjz0uMej2XbjAY6ALY_Q0w-";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[5]] = AccBuilderShamans."quest";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[9]] = AccBuilderShamans."Disabling GE warning";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[10]] = AccBuilderShamans."Navigating to GE";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[11]] = AccBuilderShamans."Finished account";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[13]] = AccBuilderShamans."\n[Plugin] Plugin starting up\n";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[14]] = AccBuilderShamans."Switching to One Click Shaman account";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[15]] = AccBuilderShamans."hootfighter";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[16]] = AccBuilderShamans."enabled";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[17]] = AccBuilderShamans."\n[Plugin] Plugin shut down\n";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[21]] = AccBuilderShamans."tell the king";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[22]] = AccBuilderShamans."You haven't got enough";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[23]] = AccBuilderShamans."Not enough gold for buying";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[24]] = AccBuilderShamans."Oh dear, you are dead!";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[25]] = AccBuilderShamans."We DIED!! :(";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[26]] = AccBuilderShamans."Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[27]] = AccBuilderShamans."We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[28]] = AccBuilderShamans."can't reach that";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[29]] = AccBuilderShamans."Door";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[30]] = AccBuilderShamans."Door";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[18]] = AccBuilderShamans."Open";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[31]] = AccBuilderShamans."Tree Door";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[32]] = AccBuilderShamans."Tree Door";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[33]] = AccBuilderShamans."Open";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[34]] = AccBuilderShamans."think that facing North";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[37]] = AccBuilderShamans."already some rum";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[39]] = AccBuilderShamans."Drop";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[40]] = AccBuilderShamans."Burning";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[41]] = AccBuilderShamans."Burning";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[42]] = AccBuilderShamans."";
    }

    private static boolean lIIIllllllIlI(int n2) {
        return n2 != 0;
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        d = lIlIlIIIll[4];
        System.out.print(lIlIlIIIlI[lIlIlIIIll[13]]);
        this.u.add((Overlay)this.v);
        0;
        a.clear();
        System.out.println(lIlIlIIIlI[lIlIlIIIll[14]]);
        a.clear();
        s[] sArray = new s[lIlIlIIIll[5]];
        sArray[AccBuilderShamans.lIlIlIIIll[4]] = new s();
        Collections.addAll(a, sArray);
        0;
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    protected int loop() {
        block10: {
            block11: {
                if (!AccBuilderShamans.lIIIlllllIllI(Game.getState(), GameState.LOGGED_IN)) break block10;
                if (!AccBuilderShamans.lIIIlllllIlll(a.isEmpty() ? 1 : 0)) break block11;
                if (!AccBuilderShamans.lIIIllllllIII(j) || AccBuilderShamans.lIIIllllllIIl(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderShamans.lIIIllllllIlI(a.get(lIlIlIIIll[4]).af() ? 1 : 0)) {
                    if (AccBuilderShamans.lIIIllllllIlI(a.get(lIlIlIIIll[4]).ae().contains(lIlIlIIIlI[lIlIlIIIll[5]]) ? 1 : 0)) {
                        f += lIlIlIIIll[5];
                    }
                    System.out.println("Achieved " + a.get(lIlIlIIIll[4]).ae() + " goal");
                    a.remove(lIlIlIIIll[4]);
                    0;
                    return lIlIlIIIll[6];
                }
                if (!AccBuilderShamans.lIIIlllllIllI(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderShamans.lIIIllllllIlI(h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.x() ? 1 : 0) && AccBuilderShamans.lIIIlllllIlll(d ? 1 : 0) && AccBuilderShamans.lIIIllllllIll(h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.j(lIlIlIIIll[7]), lIlIlIIIll[8]) && AccBuilderShamans.lIIIlllllIlll(Dialog.isOpen() ? 1 : 0)) {
                    c = lIlIlIIIlI[lIlIlIIIll[9]];
                    h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.y();
                    Time.sleepTicks((int)lIlIlIIIll[5]);
                    0;
                    0;
                    if (((0xB4 ^ 0x81) & ~(0x10 ^ 0x25)) != (0x9E ^ 0x9A)) continue;
                    return (0x84 ^ 0x82) & ~(0x3F ^ 0x39);
                }
                int lllllllllllllllllllIllllIlIlIIlI = lIlIlIIIll[4];
                try {
                    lllllllllllllllllllIllllIlIlIIlI = a.get(lIlIlIIIll[4]).ad();
                    0;
                }
                catch (Exception lllllllllllllllllllIllllIlIlIIIl) {
                    lllllllllllllllllllIllllIlIlIIIl.printStackTrace();
                }
                if (1 == 0) {
                    return (0x92 ^ 0x8B) & ~(0xD9 ^ 0xC0);
                }
                return lllllllllllllllllllIllllIlIlIIlI;
            }
            if (AccBuilderShamans.lIIIllllllIlI(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderShamans.lIIIlllllllII(Players.getLocal().getWorldLocation().distanceTo(Z.ld), lIlIlIIIll[10])) {
                    c = lIlIlIIIlI[lIlIlIIIll[10]];
                    Movement.walkTo((WorldPoint)Z.ld);
                    0;
                }
                if (AccBuilderShamans.lIIIlllllllIl(Players.getLocal().getWorldLocation().distanceTo(Z.ld), lIlIlIIIll[10])) {
                    c = lIlIlIIIlI[lIlIlIIIll[11]];
                }
            }
        }
        return lIlIlIIIll[12];
    }

    private static boolean lIIIlllllllll(int n2, int n3) {
        return n2 >= n3;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderShamans.lIIlIIIIIIIII(n2, lIlIlIIIll[25])) {
            return;
        }
        if (AccBuilderShamans.lIIIlllllIlll(n)) {
            AccBuilderShamans lllllllllllllllllllIllllIIllIIIl;
            h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.a(lllllllllllllllllllIllllIIllIIIl.r, "rsn: " + k + " account has been banned? - Acc builder SHAMANS");
            n += lIlIlIIIll[5];
        }
    }

    private static String lIIIlllllIIIl(String lllllllllllllllllllIlllIlllllIll, String lllllllllllllllllllIlllIlllllIlI) {
        lllllllllllllllllllIlllIlllllIll = new String(Base64.getDecoder().decode(lllllllllllllllllllIlllIlllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIlllIlllllllI = new StringBuilder();
        char[] lllllllllllllllllllIlllIllllllIl = lllllllllllllllllllIlllIlllllIlI.toCharArray();
        int lllllllllllllllllllIlllIllllllII = lIlIlIIIll[4];
        char[] lllllllllllllllllllIlllIllllIllI = lllllllllllllllllllIlllIlllllIll.toCharArray();
        int lllllllllllllllllllIlllIllllIlIl = lllllllllllllllllllIlllIllllIllI.length;
        int lllllllllllllllllllIlllIllllIlII = lIlIlIIIll[4];
        while (AccBuilderShamans.lIIlIIIIIIIlI(lllllllllllllllllllIlllIllllIlII, lllllllllllllllllllIlllIllllIlIl)) {
            char lllllllllllllllllllIllllIIIIIIIl = lllllllllllllllllllIlllIllllIllI[lllllllllllllllllllIlllIllllIlII];
            lllllllllllllllllllIlllIlllllllI.append((char)(lllllllllllllllllllIllllIIIIIIIl ^ lllllllllllllllllllIlllIllllllIl[lllllllllllllllllllIlllIllllllII % lllllllllllllllllllIlllIllllllIl.length]));
            0;
            ++lllllllllllllllllllIlllIllllllII;
            ++lllllllllllllllllllIlllIllllIlII;
            0;
            if ((0xF5 ^ 0xC5 ^ (0x88 ^ 0xBC)) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIlllIlllllllI);
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block5: {
            AccBuilderShamans lllllllllllllllllllIllllIlIIIlll;
            block6: {
                h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.w();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderShamans.lIIlIIIIIIIIl(player2, player) && AccBuilderShamans.lIIIllllllIlI(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = lIlIlIIIll[5];
                        0;
                        if (((0x1A ^ 0x7E ^ (0xF1 ^ 0x8C)) & (0x66 ^ 0x6F ^ (0x29 ^ 0x39) ^ -1)) != 0) {
                            return ((36 + 74 - 17 + 162 ^ 160 + 116 - 272 + 183) & (0x48 ^ 0x1C ^ (0x94 ^ 0x84) ^ -1)) != 0;
                        }
                    } else {
                        n4 = lIlIlIIIll[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderShamans.lIIIllllllIII(player3) || AccBuilderShamans.lIIIllllllllI(Game.getWildyLevel()) && !AccBuilderShamans.lIIIlllllllIl(Players.getLocal().getWorldLocation().distanceTo(X.kN), lIlIlIIIll[18])) break block5;
                int[] nArray = new int[lIlIlIIIll[5]];
                nArray[AccBuilderShamans.lIlIlIIIll[4]] = lIlIlIIIll[19];
                if (!AccBuilderShamans.lIIIlllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[lIlIlIIIll[5]];
                nArray2[AccBuilderShamans.lIlIlIIIll[4]] = lIlIlIIIll[20];
                if (!AccBuilderShamans.lIIIllllllIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
            }
            if (AccBuilderShamans.lIIIlllllIlll(lllllllllllllllllllIllllIlIIIlll.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderShamans.lIIIllllllIlI(Dialog.isOpen() ? 1 : 0) && AccBuilderShamans.lIIIllllllIII(Dialog.getText()) && AccBuilderShamans.lIIIllllllIlI(Dialog.getText().contains(lIlIlIIIlI[lIlIlIIIll[21]]) ? 1 : 0)) {
            x.dP = lIlIlIIIll[5];
        }
        h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.G();
    }

    private static boolean lIIlIIIIIIIII(int n2, int n3) {
        return n2 != n3;
    }

    static {
        AccBuilderShamans.lIIIlllllIlIl();
        AccBuilderShamans.lIIIlllllIlII();
        a = new ArrayList<K>();
        b = System.currentTimeMillis();
        d = lIlIlIIIll[4];
        g = System.currentTimeMillis();
        h = lIlIlIIIlI[lIlIlIIIll[42]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        K[] kArray = new K[lIlIlIIIll[5]];
        kArray[AccBuilderShamans.lIlIlIIIll[4]] = new Z();
        o = kArray;
    }

    private static String lIIIlllllIIlI(String lllllllllllllllllllIllllIIIIlllI, String lllllllllllllllllllIllllIIIIllll) {
        try {
            SecretKeySpec lllllllllllllllllllIllllIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIllllIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIllllIIIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIllllIIIlIIlI.init(lIlIlIIIll[9], lllllllllllllllllllIllllIIIlIIll);
            return new String(lllllllllllllllllllIllllIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIllllIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIllllIIIlIIIl) {
            lllllllllllllllllllIllllIIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllllIIll(String lllllllllllllllllllIllllIIIllIll, String lllllllllllllllllllIllllIIIlllII) {
        try {
            SecretKeySpec lllllllllllllllllllIllllIIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIllllIIIlllII.getBytes(StandardCharsets.UTF_8)), lIlIlIIIll[16]), "DES");
            Cipher lllllllllllllllllllIllllIIIlllll = Cipher.getInstance("DES");
            lllllllllllllllllllIllllIIIlllll.init(lIlIlIIIll[9], lllllllllllllllllllIllllIIlIIIII);
            return new String(lllllllllllllllllllIllllIIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIllllIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIllllIIIllllI) {
            lllllllllllllllllllIllllIIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public AccBuilderShamans() {
        this.q = new WorldArea(lIlIlIIIll[0], lIlIlIIIll[1], lIlIlIIIll[2], lIlIlIIIll[3], lIlIlIIIll[4]);
        this.r = lIlIlIIIlI[lIlIlIIIll[4]];
    }

    private static boolean lIIIlllllIlll(int n2) {
        return n2 == 0;
    }

    protected void shutDown() {
        this.u.remove((Overlay)this.v);
        0;
        d = lIlIlIIIll[5];
        o = new K[lIlIlIIIll[4]];
        n = lIlIlIIIll[4];
        f = lIlIlIIIll[4];
        System.out.print(lIlIlIIIlI[lIlIlIIIll[17]]);
        super.stop();
    }

    private static boolean lIIIllllllIII(Object object) {
        return object != null;
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderShamans.lIIIllllllIlI(configChanged.getGroup().equalsIgnoreCase(lIlIlIIIlI[lIlIlIIIll[15]]) ? 1 : 0) && AccBuilderShamans.lIIIllllllIlI(configChanged.getKey().contains(lIlIlIIIlI[lIlIlIIIll[16]]) ? 1 : 0)) {
            this.s = this.p.turnScriptOnOff();
            if (AccBuilderShamans.lIIIllllllIlI(this.s ? 1 : 0)) {
                d = lIlIlIIIll[4];
                0;
                if (2 > (0x65 ^ 0x61)) {
                    return;
                }
            } else {
                d = lIlIlIIIll[5];
            }
        }
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    private static boolean lIIIlllllllIl(int n2, int n3) {
        return n2 <= n3;
    }
}

