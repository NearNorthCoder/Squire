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

import gg.squire.account.BHelper;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.account.OHelper;
import gg.squire.account.QHelper;
import gg.squire.account.EHelper;
import gg.squire.account.OHelper;
import gg.squire.account.THelper;
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
    public static  String h;
    public static  long b;
     String s;
    @Inject
    public  BuilderConfig q;
    public static  String c;
    
    @Inject
    private  BuilderInfoBox w;
    public static  boolean e;
    public static  String j;
    public static  List<F> a;
    @Inject
    private  OverlayManager v;
    public static  boolean d;
     WorldArea r;
    static  String o;
    public static  String m;
    public static  HashMap<WorldPoint, Integer> i;
    public static  String k;
    public static  String l;
    private static  F[] p;
    static  int n;
    
     boolean t;
    public static  long g;
    @Inject
    private  Client u;
    public static  int f;

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

            }
            String[] stringArray3 = new String[llIIlIlI[5]];
            stringArray3[AccBuilderBarrows.llIIlIlI[4]] = llIIlIIl[llIIlIlI[32]];
            if (AccBuilderBarrows.lIlIlIIIlII(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[llIIlIlI[5]];
                stringArray4[AccBuilderBarrows.llIIlIlI[4]] = llIIlIIl[llIIlIlI[33]];
                TileObjects.getNearest((String[])stringArray4).interact(llIIlIIl[llIIlIlI[34]]);
                Time.sleepTicks((int)llIIlIlI[10]);

            }
        }
        if (AccBuilderBarrows.lIlIlIIIllI(lIlIlIllIIIIIlI.getMessage().contains(llIIlIIl[llIIlIlI[35]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llIIlIlI[36], llIIlIlI[37], llIIlIlI[4]));

            Time.sleepTicks((int)llIIlIlI[5]);

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

                }
            } else {
                d = llIIlIlI[5];
            }
        }
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();

        d = llIIlIlI[4];
        System.out.print(llIIlIIl[llIIlIlI[13]]);
        this.v.add((Overlay)this.w);

        a.clear();
        o = llIIlIIl[llIIlIlI[14]];
        System.out.println(llIIlIIl[llIIlIlI[15]]);
        a.clear();
        o[] oArray = new o[llIIlIlI[5]];
        oArray[AccBuilderBarrows.llIIlIlI[4]] = new OHelper();
        Collections.addAll(a, oArray);

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
        fArray[AccBuilderBarrows.llIIlIlI[4]] = new QHelper();
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

                    return llIIlIlI[6];
                }
                if (!AccBuilderBarrows.lIlIlIIIIlI(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderBarrows.lIlIlIIIllI(-.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.y() ? 1 : 0) && AccBuilderBarrows.lIlIlIIIIll(d ? 1 : 0) && AccBuilderBarrows.lIlIlIIIlll(-.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.j(llIIlIlI[7]), llIIlIlI[8]) && AccBuilderBarrows.lIlIlIIIIll(Dialog.isOpen() ? 1 : 0)) {
                    c = llIIlIIl[llIIlIlI[9]];
                    -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.z();
                    Time.sleepTicks((int)llIIlIlI[5]);

                    if (-1 < ((0x96 ^ 0x83 ^ (0x68 ^ 0x1E)) & (0x6C ^ 0x2B ^ (0x33 ^ 0x17) ^ -1))) continue;
                    return (0x33 ^ 0x58 ^ (0x39 ^ 0xE)) & (3 ^ 0x37 ^ (0x22 ^ 0x4A) ^ -1);
                }
                int lIlIlIllIIlllll = llIIlIlI[4];
                try {
                    lIlIlIllIIlllll = a.get(llIIlIlI[4]).U();

                }
                catch (Exception lIlIlIllIIllllI) {
                    lIlIlIllIIllllI.printStackTrace();
                }
                
                }
                return lIlIlIllIIlllll;
            }
            if (AccBuilderBarrows.lIlIlIIIllI(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderBarrows.lIlIlIIlIII(Players.getLocal().getWorldLocation().distanceTo(Q.js), llIIlIlI[10])) {
                    c = llIIlIIl[llIIlIlI[10]];
                    Movement.walkTo((WorldPoint)Q.js);

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

    private static boolean lIlIlIIIlII(Object object) {
        return object != null;
    }

        return String.valueOf(lIlIlIlIllIIlIl);
    }

    private static boolean lIlIlIIIlIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIIIIll(int n2) {
        return n2 == 0;
    }

    private static void lIlIIllIIll() {
        llIIlIIl = new String[llIIlIlI[44]];
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[4]] = "https://discord.com/api/webhooks/1193421866459725834/O4zTPyFZMm83vMwkEnq6zlsGdAzLR4AGiJhhz0hFc0JZsJzMFQ-ivS8oiytVIzgMDJhM";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[5]] = "quest";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[9]] = "Disabling GE warning";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[10]] = "Navigating to GE";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[11]] = "Finished account";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[13]] = "\n[Plugin] Plugin starting up\n";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[14]] = "Barrows";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[15]] = "Switching to One Click Barrows account";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[16]] = "hootfighter";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[17]] = "enabled";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[18]] = "\n[Plugin] Plugin shut down\n";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[22]] = "tell the king";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[23]] = "You haven't got enough";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[24]] = "Not enough gold for buying";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[25]] = "Oh dear, you are dead!";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[26]] = "We DIED!! :(";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[27]] = "Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[28]] = "We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[29]] = "can't reach that";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[30]] = "Door";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[19]] = "Door";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[31]] = "Open";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[32]] = "Tree Door";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[33]] = "Tree Door";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[34]] = "Open";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[35]] = "think that facing North";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[38]] = "already some rum";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[40]] = "Drop";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[41]] = "Burning";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[42]] = "Burning";
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[43]] = AccBuilderBarrows.lIlIIllIIlI("BR50vLs4nP0=", "CVtTJ");
    }
}

