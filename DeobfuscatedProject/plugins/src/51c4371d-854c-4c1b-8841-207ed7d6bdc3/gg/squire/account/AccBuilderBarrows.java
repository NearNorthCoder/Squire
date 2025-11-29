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

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.B;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.O;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.o;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.t;
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

@SquireUtil
@Extension
@PluginDescriptor(name="Squire Barrows Builder", enabledByDefault=false)
public class AccBuilderBarrows
extends Script {
    public static /* synthetic */ String h;
    public static /* synthetic */ long b;
    /* synthetic */ String s;
    @Inject
    public /* synthetic */ BuilderConfig q;
    public static /* synthetic */ String c;
    private static /* synthetic */ int[] llIIlIlI;
    @Inject
    private /* synthetic */ BuilderInfoBox w;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ String j;
    public static /* synthetic */ List<F> a;
    @Inject
    private /* synthetic */ OverlayManager v;
    public static /* synthetic */ boolean d;
    /* synthetic */ WorldArea r;
    static /* synthetic */ String o;
    public static /* synthetic */ String m;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    public static /* synthetic */ String k;
    public static /* synthetic */ String l;
    private static /* synthetic */ F[] p;
    static /* synthetic */ int n;
    private static /* synthetic */ String[] llIIlIIl;
    /* synthetic */ boolean t;
    public static /* synthetic */ long g;
    @Inject
    private /* synthetic */ Client u;
    public static /* synthetic */ int f;

    private static boolean lIlIlIIllIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIlIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderBarrows.lIlIlIIlIll(n5, n6) && AccBuilderBarrows.lIlIlIIlIIl(n5, n7)) {
            n4 = llIIlIlI[5];
            "".length();
            if (null != null) {
                return ((0x24 ^ 0x31 ^ (0x3A ^ 0x36)) & (0x5B ^ 0xE ^ (0x21 ^ 0x6D) ^ -" ".length())) != 0;
            }
        } else {
            n4 = llIIlIlI[4];
        }
        return n4 != 0;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block5: {
            AccBuilderBarrows lIlIlIllIIlIlII;
            block6: {
                -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.x();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderBarrows.lIlIlIIllIl(player2, player) && AccBuilderBarrows.lIlIlIIIllI(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = llIIlIlI[5];
                        "".length();
                        if (null != null) {
                            return ((73 + 56 - -60 + 0 ^ 1 + 167 - 22 + 24) & (0x60 ^ 0x4B ^ (0x2C ^ 0x10) ^ -" ".length())) != 0;
                        }
                    } else {
                        n4 = llIIlIlI[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderBarrows.lIlIlIIIlII(player3) || AccBuilderBarrows.lIlIlIIlIlI(Game.getWildyLevel()) && !AccBuilderBarrows.lIlIlIIlIIl(Players.getLocal().getWorldLocation().distanceTo(O.jc), llIIlIlI[19])) break block5;
                int[] nArray = new int[llIIlIlI[5]];
                nArray[AccBuilderBarrows.llIIlIlI[4]] = llIIlIlI[20];
                if (!AccBuilderBarrows.lIlIlIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[llIIlIlI[5]];
                nArray2[AccBuilderBarrows.llIIlIlI[4]] = llIIlIlI[21];
                if (!AccBuilderBarrows.lIlIlIIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
            }
            if (AccBuilderBarrows.lIlIlIIIIll(lIlIlIllIIlIlII.r.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderBarrows.lIlIlIIIllI(Dialog.isOpen() ? 1 : 0) && AccBuilderBarrows.lIlIlIIIlII(Dialog.getText()) && AccBuilderBarrows.lIlIlIIIllI(Dialog.getText().contains(llIIlIIl[llIIlIlI[22]]) ? 1 : 0)) {
            -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.t.cV = llIIlIlI[5];
        }
        -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.H();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lIlIlIllIIIIIlI;
        if (AccBuilderBarrows.lIlIlIIIllI(chatMessage.getMessage().contains(llIIlIIl[llIIlIlI[23]]) ? 1 : 0)) {
            System.out.println(llIIlIIl[llIIlIlI[24]]);
            d = llIIlIlI[5];
        }
        if (AccBuilderBarrows.lIlIlIIIllI(lIlIlIllIIIIIlI.getMessage().contains(llIIlIIl[llIIlIlI[25]]) ? 1 : 0)) {
            System.out.println(llIIlIIl[llIIlIlI[26]]);
            if (AccBuilderBarrows.lIlIlIIIIll(Game.getWildyLevel()) && AccBuilderBarrows.lIlIlIIIIll(Inventory.contains(item -> item.getName().contains(llIIlIIl[llIIlIlI[42]])) ? 1 : 0)) {
                d = llIIlIlI[5];
                System.out.println(llIIlIIl[llIIlIlI[27]]);
            }
            if (!AccBuilderBarrows.lIlIlIIlIlI(Game.getWildyLevel()) || AccBuilderBarrows.lIlIlIIIllI(Inventory.contains(item -> item.getName().contains(llIIlIIl[llIIlIlI[41]])) ? 1 : 0)) {
                d = llIIlIlI[4];
                System.out.println(llIIlIIl[llIIlIlI[28]]);
            }
        }
        if (AccBuilderBarrows.lIlIlIIIllI(lIlIlIllIIIIIlI.getMessage().contains(llIIlIIl[llIIlIlI[29]]) ? 1 : 0) && AccBuilderBarrows.lIlIlIIlIIl(Players.getLocal().getWorldLocation().distanceTo(B.hT), llIIlIlI[18])) {
            String[] stringArray = new String[llIIlIlI[5]];
            stringArray[AccBuilderBarrows.llIIlIlI[4]] = llIIlIIl[llIIlIlI[30]];
            if (AccBuilderBarrows.lIlIlIIIlII(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[llIIlIlI[5]];
                stringArray2[AccBuilderBarrows.llIIlIlI[4]] = llIIlIIl[llIIlIlI[19]];
                TileObjects.getNearest((String[])stringArray2).interact(llIIlIIl[llIIlIlI[31]]);
                Time.sleepTicks((int)llIIlIlI[11]);
                "".length();
            }
            String[] stringArray3 = new String[llIIlIlI[5]];
            stringArray3[AccBuilderBarrows.llIIlIlI[4]] = llIIlIIl[llIIlIlI[32]];
            if (AccBuilderBarrows.lIlIlIIIlII(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[llIIlIlI[5]];
                stringArray4[AccBuilderBarrows.llIIlIlI[4]] = llIIlIIl[llIIlIlI[33]];
                TileObjects.getNearest((String[])stringArray4).interact(llIIlIIl[llIIlIlI[34]]);
                Time.sleepTicks((int)llIIlIlI[10]);
                "".length();
            }
        }
        if (AccBuilderBarrows.lIlIlIIIllI(lIlIlIllIIIIIlI.getMessage().contains(llIIlIIl[llIIlIlI[35]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llIIlIlI[36], llIIlIlI[37], llIIlIlI[4]));
            "".length();
            Time.sleepTicks((int)llIIlIlI[5]);
            "".length();
        }
        if (AccBuilderBarrows.lIlIlIIIllI(lIlIlIllIIIIIlI.getMessage().contains(llIIlIIl[llIIlIlI[38]]) ? 1 : 0)) {
            int[] nArray = new int[llIIlIlI[5]];
            nArray[AccBuilderBarrows.llIIlIlI[4]] = llIIlIlI[39];
            if (AccBuilderBarrows.lIlIlIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIlIlI[5]];
                nArray2[AccBuilderBarrows.llIIlIlI[4]] = llIIlIlI[39];
                Inventory.getFirst((int[])nArray2).interact(llIIlIIl[llIIlIlI[40]]);
            }
        }
    }

    private static boolean lIlIlIIIllI(int n2) {
        return n2 != 0;
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderBarrows.lIlIlIIIllI(configChanged.getGroup().equalsIgnoreCase(llIIlIIl[llIIlIlI[16]]) ? 1 : 0) && AccBuilderBarrows.lIlIlIIIllI(configChanged.getKey().contains(llIIlIIl[llIIlIlI[17]]) ? 1 : 0)) {
            this.t = this.q.turnScriptOnOff();
            if (AccBuilderBarrows.lIlIlIIIllI(this.t ? 1 : 0)) {
                d = llIIlIlI[4];
                "".length();
                if (null != null) {
                    return;
                }
            } else {
                d = llIIlIlI[5];
            }
        }
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        "".length();
        d = llIIlIlI[4];
        System.out.print(llIIlIIl[llIIlIlI[13]]);
        this.v.add((Overlay)this.w);
        "".length();
        a.clear();
        o = llIIlIIl[llIIlIlI[14]];
        System.out.println(llIIlIIl[llIIlIlI[15]]);
        a.clear();
        o[] oArray = new o[llIIlIlI[5]];
        oArray[AccBuilderBarrows.llIIlIlI[4]] = new o();
        Collections.addAll(a, oArray);
        "".length();
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderBarrows.lIlIlIIllII(n2, llIIlIlI[25])) {
            return;
        }
        if (AccBuilderBarrows.lIlIlIIIIll(n)) {
            AccBuilderBarrows lIlIlIlIllllllI;
            -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.a(lIlIlIlIllllllI.s, "rsn: " + k + " account has been banned? - Acc builder " + o);
            n += llIIlIlI[5];
        }
    }

    private static boolean lIlIlIIlIlI(int n2) {
        return n2 <= 0;
    }

    private static boolean lIlIlIIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIIlIII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        AccBuilderBarrows.lIlIlIIIIIl();
        AccBuilderBarrows.lIlIIllIIll();
        a = new ArrayList<F>();
        b = System.currentTimeMillis();
        d = llIIlIlI[4];
        g = System.currentTimeMillis();
        h = llIIlIIl[llIIlIlI[43]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        F[] fArray = new F[llIIlIlI[5]];
        fArray[AccBuilderBarrows.llIIlIlI[4]] = new Q();
        p = fArray;
    }

    private static boolean lIlIlIIllII(int n2, int n3) {
        return n2 != n3;
    }

    protected int loop() {
        block10: {
            block11: {
                if (!AccBuilderBarrows.lIlIlIIIIlI(Game.getState(), GameState.LOGGED_IN)) break block10;
                if (!AccBuilderBarrows.lIlIlIIIIll(a.isEmpty() ? 1 : 0)) break block11;
                if (!AccBuilderBarrows.lIlIlIIIlII(j) || AccBuilderBarrows.lIlIlIIIlIl(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderBarrows.lIlIlIIIllI(a.get(llIIlIlI[4]).W() ? 1 : 0)) {
                    if (AccBuilderBarrows.lIlIlIIIllI(a.get(llIIlIlI[4]).V().contains(llIIlIIl[llIIlIlI[5]]) ? 1 : 0)) {
                        f += llIIlIlI[5];
                    }
                    System.out.println("Achieved " + a.get(llIIlIlI[4]).V() + " goal");
                    a.remove(llIIlIlI[4]);
                    "".length();
                    return llIIlIlI[6];
                }
                if (!AccBuilderBarrows.lIlIlIIIIlI(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderBarrows.lIlIlIIIllI(-.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.y() ? 1 : 0) && AccBuilderBarrows.lIlIlIIIIll(d ? 1 : 0) && AccBuilderBarrows.lIlIlIIIlll(-.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.j(llIIlIlI[7]), llIIlIlI[8]) && AccBuilderBarrows.lIlIlIIIIll(Dialog.isOpen() ? 1 : 0)) {
                    c = llIIlIIl[llIIlIlI[9]];
                    -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.z();
                    Time.sleepTicks((int)llIIlIlI[5]);
                    "".length();
                    "".length();
                    if (-" ".length() < ((0x96 ^ 0x83 ^ (0x68 ^ 0x1E)) & (0x6C ^ 0x2B ^ (0x33 ^ 0x17) ^ -" ".length()))) continue;
                    return (0x33 ^ 0x58 ^ (0x39 ^ 0xE)) & (3 ^ 0x37 ^ (0x22 ^ 0x4A) ^ -" ".length());
                }
                int lIlIlIllIIlllll = llIIlIlI[4];
                try {
                    lIlIlIllIIlllll = a.get(llIIlIlI[4]).U();
                    "".length();
                }
                catch (Exception lIlIlIllIIllllI) {
                    lIlIlIllIIllllI.printStackTrace();
                }
                if (null != null) {
                    return (119 + 92 - 114 + 41 ^ 169 + 26 - 67 + 59) & (0x32 ^ 0x40 ^ (0x5C ^ 0x1F) ^ -" ".length());
                }
                return lIlIlIllIIlllll;
            }
            if (AccBuilderBarrows.lIlIlIIIllI(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderBarrows.lIlIlIIlIII(Players.getLocal().getWorldLocation().distanceTo(Q.js), llIIlIlI[10])) {
                    c = llIIlIIl[llIIlIlI[10]];
                    Movement.walkTo((WorldPoint)Q.js);
                    "".length();
                }
                if (AccBuilderBarrows.lIlIlIIlIIl(Players.getLocal().getWorldLocation().distanceTo(Q.js), llIIlIlI[10])) {
                    c = llIIlIIl[llIIlIlI[11]];
                }
            }
        }
        return llIIlIlI[12];
    }

    protected void shutDown() {
        this.v.remove((Overlay)this.w);
        "".length();
        d = llIIlIlI[5];
        p = new F[llIIlIlI[4]];
        n = llIIlIlI[4];
        f = llIIlIlI[4];
        System.out.print(llIIlIIl[llIIlIlI[18]]);
        super.stop();
    }

    public AccBuilderBarrows() {
        this.r = new WorldArea(llIIlIlI[0], llIIlIlI[1], llIIlIlI[2], llIIlIlI[3], llIIlIlI[4]);
        this.s = llIIlIIl[llIIlIlI[4]];
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    private static String lIlIIllIIIl(String lIlIlIlIlIlIIlI, String lIlIlIlIlIIllll) {
        try {
            SecretKeySpec lIlIlIlIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIlIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIlIlIlIlII = Cipher.getInstance("Blowfish");
            lIlIlIlIlIlIlII.init(llIIlIlI[9], lIlIlIlIlIlIlIl);
            return new String(lIlIlIlIlIlIlII.doFinal(Base64.getDecoder().decode(lIlIlIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIlIlIlIIll) {
            lIlIlIlIlIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIlII(Object object) {
        return object != null;
    }

    private static String lIlIIllIIII(String lIlIlIlIllIIIlI, String lIlIlIlIllIIIIl) {
        lIlIlIlIllIIIlI = new String(Base64.getDecoder().decode(lIlIlIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIlIllIIlIl = new StringBuilder();
        char[] lIlIlIlIllIIlII = lIlIlIlIllIIIIl.toCharArray();
        int lIlIlIlIllIIIll = llIIlIlI[4];
        char[] lIlIlIlIlIlllIl = lIlIlIlIllIIIlI.toCharArray();
        int lIlIlIlIlIlllII = lIlIlIlIlIlllIl.length;
        int lIlIlIlIlIllIll = llIIlIlI[4];
        while (AccBuilderBarrows.lIlIlIIlllI(lIlIlIlIlIllIll, lIlIlIlIlIlllII)) {
            char lIlIlIlIllIlIII = lIlIlIlIlIlllIl[lIlIlIlIlIllIll];
            lIlIlIlIllIIlIl.append((char)(lIlIlIlIllIlIII ^ lIlIlIlIllIIlII[lIlIlIlIllIIIll % lIlIlIlIllIIlII.length]));
            "".length();
            ++lIlIlIlIllIIIll;
            ++lIlIlIlIlIllIll;
            "".length();
            if (-" ".length() != (8 ^ 0xC)) continue;
            return null;
        }
        return String.valueOf(lIlIlIlIllIIlIl);
    }

    private static void lIlIlIIIIIl() {
        llIIlIlI = new int[45];
        AccBuilderBarrows.llIIlIlI[0] = 0xFFFFBC77 & 0x4FAF;
        AccBuilderBarrows.llIIlIlI[1] = 0xFFFF9F3A & 0x6ED5;
        AccBuilderBarrows.llIIlIlI[2] = 0x3B ^ 0x66 ^ (0x56 ^ 0x35);
        AccBuilderBarrows.llIIlIlI[3] = 0x8B ^ 0xBE;
        AccBuilderBarrows.llIIlIlI[4] = (65 + 183 - 74 + 29 ^ 85 + 195 - 200 + 116) & (8 + 3 - -88 + 69 ^ 17 + 138 - 114 + 126 ^ -" ".length());
        AccBuilderBarrows.llIIlIlI[5] = " ".length();
        AccBuilderBarrows.llIIlIlI[6] = 0x90 ^ 0xA0 ^ (0xF1 ^ 0xA5);
        AccBuilderBarrows.llIIlIlI[7] = -(0xFFFFF7CF & 0x7EF3) & (0xFFFFFFDF & 0x77FB);
        AccBuilderBarrows.llIIlIlI[8] = 0xFFFFCBEF & 0x37F8;
        AccBuilderBarrows.llIIlIlI[9] = "  ".length();
        AccBuilderBarrows.llIIlIlI[10] = "   ".length();
        AccBuilderBarrows.llIIlIlI[11] = 121 + 74 - 50 + 13 ^ 55 + 29 - -51 + 19;
        AccBuilderBarrows.llIIlIlI[12] = 0xFFFFCBFE & 0x3659;
        AccBuilderBarrows.llIIlIlI[13] = 0x44 ^ 0x41;
        AccBuilderBarrows.llIIlIlI[14] = 0x69 ^ 0x1E ^ (0x21 ^ 0x50);
        AccBuilderBarrows.llIIlIlI[15] = 0x26 ^ 0x21;
        AccBuilderBarrows.llIIlIlI[16] = 0x78 ^ 0x76 ^ (0x1B ^ 0x1D);
        AccBuilderBarrows.llIIlIlI[17] = 22 + 121 - 135 + 131 ^ 96 + 107 - 104 + 31;
        AccBuilderBarrows.llIIlIlI[18] = 0x25 ^ 0x2F;
        AccBuilderBarrows.llIIlIlI[19] = 0x3B ^ 0x1E ^ (0x14 ^ 0x25);
        AccBuilderBarrows.llIIlIlI[20] = -(0xFFFFEFF8 & 0x75EF) & (0xFFFFEFFF & 0x77FF);
        AccBuilderBarrows.llIIlIlI[21] = -(0xFFFFF7EF & 0x7DD3) & (0xFFFFF7DF & 0x7FFB);
        AccBuilderBarrows.llIIlIlI[22] = 0x1A ^ 0x39 ^ (0 ^ 0x28);
        AccBuilderBarrows.llIIlIlI[23] = 41 + 23 - -26 + 95 ^ 115 + 3 - 19 + 82;
        AccBuilderBarrows.llIIlIlI[24] = 1 ^ 0x4C ^ (0x6B ^ 0x2B);
        AccBuilderBarrows.llIIlIlI[25] = 10 + 28 - -67 + 37 ^ 95 + 19 - 113 + 127;
        AccBuilderBarrows.llIIlIlI[26] = 0x97 ^ 0xA4 ^ (0x68 ^ 0x54);
        AccBuilderBarrows.llIIlIlI[27] = 0x25 ^ 0x7D ^ (0xF7 ^ 0xBF);
        AccBuilderBarrows.llIIlIlI[28] = 0x6A ^ 0x7B;
        AccBuilderBarrows.llIIlIlI[29] = 2 ^ 0x10;
        AccBuilderBarrows.llIIlIlI[30] = 0x38 ^ 1 ^ (0xA6 ^ 0x8C);
        AccBuilderBarrows.llIIlIlI[31] = 0x85 ^ 0x80 ^ (0x5E ^ 0x4E);
        AccBuilderBarrows.llIIlIlI[32] = 21 + 97 - 23 + 43 ^ 98 + 97 - 157 + 118;
        AccBuilderBarrows.llIIlIlI[33] = 0x72 ^ 0x2C ^ (0xD4 ^ 0x9D);
        AccBuilderBarrows.llIIlIlI[34] = 18 + 100 - -63 + 5 ^ 12 + 7 - -41 + 102;
        AccBuilderBarrows.llIIlIlI[35] = 0xF6 ^ 0xAD ^ (0x1F ^ 0x5D);
        AccBuilderBarrows.llIIlIlI[36] = 0xFFFF8BA3 & 0x7FFD;
        AccBuilderBarrows.llIIlIlI[37] = -(0xFFFFEED3 & 0x517D) & (0xFFFFFCFF & 0x4FF7);
        AccBuilderBarrows.llIIlIlI[38] = 0x81 ^ 0x9B;
        AccBuilderBarrows.llIIlIlI[39] = 0xFFFFA1FF & 0x5FAF;
        AccBuilderBarrows.llIIlIlI[40] = 0xB2 ^ 0xA9;
        AccBuilderBarrows.llIIlIlI[41] = 0x7D ^ 0x61;
        AccBuilderBarrows.llIIlIlI[42] = 40 + 121 - 84 + 101 ^ 18 + 118 - 132 + 171;
        AccBuilderBarrows.llIIlIlI[43] = 0x3E ^ 2 ^ (0x54 ^ 0x76);
        AccBuilderBarrows.llIIlIlI[44] = 0x80 ^ 0x9F;
    }

    private static boolean lIlIlIIIlIl(Object object) {
        return object == null;
    }

    private static String lIlIIllIIlI(String lIlIlIlIlIIIIll, String lIlIlIlIlIIIIlI) {
        try {
            SecretKeySpec lIlIlIlIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), llIIlIlI[16]), "DES");
            Cipher lIlIlIlIlIIIlll = Cipher.getInstance("DES");
            lIlIlIlIlIIIlll.init(llIIlIlI[9], lIlIlIlIlIIlIII);
            return new String(lIlIlIlIlIIIlll.doFinal(Base64.getDecoder().decode(lIlIlIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIlIlIIIllI) {
            lIlIlIlIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIIll(int n2) {
        return n2 == 0;
    }

    private static void lIlIIllIIll() {
        llIIlIIl = new String[llIIlIlI[44]];
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[4]] = AccBuilderBarrows.lIlIIllIIII("BjEnNyZUanwjPB0mPDUxQCY8KnoPNTpoIgsnOyg6BTZ8dmRXdmd1ZFZzZXNgV3Jhcm1dcXwIYRQRAz4TNAg+f2YYCCQsEAA0ZT05HQI3Bi8iF2cGEgcPOy8vXi0VJGUkHyANLyMDAmo8GBZrKDwXMQUOLwkIFw09Iw==", "nESGU");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[5]] = AccBuilderBarrows.lIlIIllIIIl("gwGIKABbvfw=", "jBPAx");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[9]] = AccBuilderBarrows.lIlIIllIIlI("Df1wwrHNprV8sNizc72C0obLCF7rGXq6", "rEouo");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[10]] = AccBuilderBarrows.lIlIIllIIlI("bVAoTcku2tRy2f3Ys3VmdK0PjmjVSOsD", "PVSjw");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[11]] = AccBuilderBarrows.lIlIIllIIlI("wmZmDO38Ms5jfYd3bjIZx+bMQjpH69pm", "HVHVX");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[13]] = AccBuilderBarrows.lIlIIllIIlI("1qRpUpPHrgahi1vs3M5nxRQvrrsyXF5LPxhKwp2RDHk=", "ADQAu");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[14]] = AccBuilderBarrows.lIlIIllIIIl("FV/U/q3/xJg=", "omOXP");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[15]] = AccBuilderBarrows.lIlIIllIIIl("/r1pZ/wvc996FNPQ244+nkUGhS9KbaX69ioOJgAX3dfPTcUFktFgNw==", "qxJTW");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[16]] = AccBuilderBarrows.lIlIIllIIII("GAwKFQkZBA0VCgI=", "pceao");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[17]] = AccBuilderBarrows.lIlIIllIIIl("MZsUPjEHaoM=", "Mgriz");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[18]] = AccBuilderBarrows.lIlIIllIIII("bzYhISACBB8QdTUBBCo8C00CJSARTRUiIgtn", "emqMU");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[22]] = AccBuilderBarrows.lIlIIllIIlI("RA1vmu3irH6hgqBr4XSsrg==", "epEME");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[23]] = AccBuilderBarrows.lIlIIllIIlI("l+eRT2emiwXy39bcW1XyU7JidlSnOyYo", "OHLfV");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[24]] = AccBuilderBarrows.lIlIIllIIIl("nZ4GeZXAZ1n5Ql3CRb/6qtUk0PJYTgLaKnJPrgStqRw=", "TTJOy");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[25]] = AccBuilderBarrows.lIlIIllIIII("HSN4FQQzOXRRGD0+eBATN2s8FAA2ag==", "RKXqa");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[26]] = AccBuilderBarrows.lIlIIllIIII("ByZJNwYVB0hSb2pr", "PCisO");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[27]] = AccBuilderBarrows.lIlIIllIIIl("yrUtZuq0lrwanemTajCLMMbSQ0rMh1pYlH7ug4htxRXGOb0+yj2hz+yViGQvklqx6dm7xpgram6+4QuTfbVtE15F5E2PKDSSCaPq3Fy1DkdYINiQTGdTZg==", "ljpga");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[28]] = AccBuilderBarrows.lIlIIllIIlI("h+HZzV9ZBARDvf+OuAWuuOgamIu2ClmOz7ORYR3iDiiNypFeqPzbbi4IGdPbu+kOzW4mfdz7efE5muVd5QFSSPH9ljYidYNGzA4YrusGPo81S5EcHQPLcG0qhDuSfvUI8WCIUHP3FuJU3FsQK6J+BrsqOoK/Hzp0dtqGQzPEL8Y=", "lEouI");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[29]] = AccBuilderBarrows.lIlIIllIIIl("DeGCrZgGTnSFiP5oivwDN+j96d+v4LTJ", "ldEts");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[30]] = AccBuilderBarrows.lIlIIllIIIl("UTNDNA/MX1I=", "ogElC");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[19]] = AccBuilderBarrows.lIlIIllIIlI("/5k346RKcQo=", "DXQAN");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[31]] = AccBuilderBarrows.lIlIIllIIIl("GZMfFxlLyRk=", "YYWgm");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[32]] = AccBuilderBarrows.lIlIIllIIIl("V7u4jXsyXc0tUzvKitqqFg==", "vtEJB");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[33]] = AccBuilderBarrows.lIlIIllIIlI("nEKXDvzFNgLFW0e2sI8S1A==", "AdUiJ");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[34]] = AccBuilderBarrows.lIlIIllIIlI("g+goEUfptkU=", "zPxaM");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[35]] = AccBuilderBarrows.lIlIIllIIlI("bM6gO7bFeKvVA9BMgi3QdX4q+5V7U0Dj", "qpkmW");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[38]] = AccBuilderBarrows.lIlIIllIIlI("JhkcuN9IuGjVoJZKGFg4F+dwRjRPTPlk", "cJRfe");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[40]] = AccBuilderBarrows.lIlIIllIIlI("aNKH49rpzMo=", "fqcXU");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[41]] = AccBuilderBarrows.lIlIIllIIIl("/dt3uPXJN8I=", "qadgc");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[42]] = AccBuilderBarrows.lIlIIllIIlI("yYS5YQ2/nEc=", "rurZH");
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[43]] = AccBuilderBarrows.lIlIIllIIlI("BR50vLs4nP0=", "CVtTJ");
    }
}

