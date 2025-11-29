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
import gg.squire.account.CHelper;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.account.SHelper;
import gg.squire.account.UHelper;
import gg.squire.account.EHelper;
import gg.squire.account.PHelper;
import gg.squire.account.UHelper;
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
     boolean t;
    public static  List<G> a;
    @Inject
    private  BuilderInfoBox w;
    @Inject
    public  BuilderConfig q;
    public static  boolean d;
    static  String o;
    @Inject
    private  OverlayManager v;
     String s;
    
    public static  int f;
     WorldArea r;
    static  int n;
    public static  String l;
    public static  String c;
    
    private static  G[] p;
    public static  String h;
    public static  long g;
    public static  String k;
    public static  String j;
    public static  boolean e;
    public static  long b;
    public static  String m;
    public static  HashMap<WorldPoint, Integer> i;
    @Inject
    private  Client u;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        if (AccBuilderRogues.lIIIIllIlIllI(chatMessage.getMessage().contains(lIIlllllII[lIIlllllIl[23]]) ? 1 : 0)) {
            System.out.println(lIIlllllII[lIIlllllIl[24]]);
            d = lIIlllllIl[5];
        }
        if (AccBuilderRogues.lIIIIllIlIllI(var1.getMessage().contains(lIIlllllII[lIIlllllIl[25]]) ? 1 : 0)) {
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
        if (AccBuilderRogues.lIIIIllIlIllI(var1.getMessage().contains(lIIlllllII[lIIlllllIl[29]]) ? 1 : 0) && AccBuilderRogues.lIIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(C.hV), lIIlllllIl[18])) {
            String[] stringArray = new String[lIIlllllIl[5]];
            stringArray[AccBuilderRogues.lIIlllllIl[4]] = lIIlllllII[lIIlllllIl[30]];
            if (AccBuilderRogues.lIIIIllIlIlII(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lIIlllllIl[5]];
                stringArray2[AccBuilderRogues.lIIlllllIl[4]] = lIIlllllII[lIIlllllIl[19]];
                TileObjects.getNearest((String[])stringArray2).interact(lIIlllllII[lIIlllllIl[31]]);
                Time.sleepTicks((int)lIIlllllIl[11]);

            }
            String[] stringArray3 = new String[lIIlllllIl[5]];
            stringArray3[AccBuilderRogues.lIIlllllIl[4]] = lIIlllllII[lIIlllllIl[32]];
            if (AccBuilderRogues.lIIIIllIlIlII(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[lIIlllllIl[5]];
                stringArray4[AccBuilderRogues.lIIlllllIl[4]] = lIIlllllII[lIIlllllIl[33]];
                TileObjects.getNearest((String[])stringArray4).interact(lIIlllllII[lIIlllllIl[34]]);
                Time.sleepTicks((int)lIIlllllIl[10]);

            }
        }
        if (AccBuilderRogues.lIIIIllIlIllI(var1.getMessage().contains(lIIlllllII[lIIlllllIl[35]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIIlllllIl[36], lIIlllllIl[37], lIIlllllIl[4]));

            Time.sleepTicks((int)lIIlllllIl[5]);

        }
        if (AccBuilderRogues.lIIIIllIlIllI(var1.getMessage().contains(lIIlllllII[lIIlllllIl[38]]) ? 1 : 0)) {
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
        gArray[AccBuilderRogues.lIIlllllIl[4]] = new UHelper();
        p = gArray;
    }

    private static boolean lIIIIllIllIlI(int n2) {
        return n2 <= 0;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block5: {
            AccBuilderRogues var2;
            block6: {
                f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e.w();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderRogues.lIIIIllIlllIl(player2, player) && AccBuilderRogues.lIIIIllIlIllI(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = lIIlllllIl[5];

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
            if (AccBuilderRogues.lIIIIllIlIIll(var2.r.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderRogues.lIIIIllIlIllI(Dialog.isOpen() ? 1 : 0) && AccBuilderRogues.lIIIIllIlIlII(Dialog.getText()) && AccBuilderRogues.lIIIIllIlIllI(Dialog.getText().contains(lIIlllllII[lIIlllllIl[22]]) ? 1 : 0)) {
            f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.u.cX = lIIlllllIl[5];
        }
        f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e.G();
    }

    private static boolean lIIIIllIlIIll(int n2) {
        return n2 == 0;
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

        d = lIIlllllIl[4];
        System.out.print(lIIlllllII[lIIlllllIl[13]]);
        this.v.add((Overlay)this.w);

        a.clear();
        o = lIIlllllII[lIIlllllIl[14]];
        System.out.println(lIIlllllII[lIIlllllIl[15]]);
        a.clear();
        p[] pArray = new p[lIIlllllIl[5]];
        pArray[AccBuilderRogues.lIIlllllIl[4]] = new PHelper();
        Collections.addAll(a, pArray);

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
            AccBuilderRogues var3;
            f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e.a(var3.s, "rsn: " + k + " account has been banned? - Acc builder " + o);
            n += lIIlllllIl[5];
        }
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderRogues.lIIIIllIlIllI(configChanged.getGroup().equalsIgnoreCase(lIIlllllII[lIIlllllIl[16]]) ? 1 : 0) && AccBuilderRogues.lIIIIllIlIllI(configChanged.getKey().contains(lIIlllllII[lIIlllllIl[17]]) ? 1 : 0)) {
            this.t = this.q.turnScriptOnOff();
            if (AccBuilderRogues.lIIIIllIlIllI(this.t ? 1 : 0)) {
                d = lIIlllllIl[4];

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
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[4]] = "https://discord.com/api/webhooks/1215416272247062598/cqlx02Frndug7FbPDTSpjVvLxW5lC7hbt5KU2oGbtk-z8oN3eFJn54Yg_N3hGm1C1AKF";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[5]] = "quest";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[9]] = "Disabling GE warning";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[10]] = "Navigating to GE";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[11]] = "Finished account";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[13]] = "\n[Plugin] Plugin starting up\n";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[14]] = "Rogues outfit";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[15]] = "Switching to One Click Rogues Outfit account";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[16]] = "hootfighter";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[17]] = "enabled";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[18]] = "\n[Plugin] Plugin shut down\n";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[22]] = "tell the king";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[23]] = "You haven't got enough";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[24]] = "Not enough gold for buying";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[25]] = "Oh dear, you are dead!";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[26]] = "We DIED!! :(";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[27]] = "Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[28]] = "We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[29]] = "can't reach that";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[30]] = "Door";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[19]] = "Door";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[31]] = "Open";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[32]] = "Tree Door";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[33]] = "Tree Door";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[34]] = "Open";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[35]] = "think that facing North";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[38]] = "already some rum";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[40]] = "Drop";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[41]] = "Burning";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[42]] = "Burning";
        AccBuilderRogues.lIIlllllII[AccBuilderRogues.lIIlllllIl[43]] = AccBuilderRogues.lIIIIllIIlllI("AvzWY2ltiaQ=", "ikaAZ");
    }

        return String.valueOf(var4);
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

                    return lIIlllllIl[6];
                }
                if (!AccBuilderRogues.lIIIIllIlIIlI(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderRogues.lIIIIllIlIllI(f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e.x() ? 1 : 0) && AccBuilderRogues.lIIIIllIlIIll(d ? 1 : 0) && AccBuilderRogues.lIIIIllIlIlll(f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e.j(lIIlllllIl[7]), lIIlllllIl[8]) && AccBuilderRogues.lIIIIllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    c = lIIlllllII[lIIlllllIl[9]];
                    f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e.y();
                    Time.sleepTicks((int)lIIlllllIl[5]);

                    return (6 + 161 - 6 + 8 ^ 64 + 166 - 139 + 85) & (108 + 111 - 202 + 113 ^ 120 + 132 - 182 + 85 ^ -1);
                }
                int var5 = lIIlllllIl[4];
                try {
                    var5 = a.get(lIIlllllIl[4]).T();

                }
                catch (Exception var6) {
                    var6.printStackTrace();
                }
                if (1 == -1) {
                    return (0xD9 ^ 0xBF ^ (0xE2 ^ 0xA7)) & (0x64 ^ 0x7C ^ (0x71 ^ 0x4A) ^ -1);
                }
                return var5;
            }
            if (AccBuilderRogues.lIIIIllIlIllI(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderRogues.lIIIIllIllIII(Players.getLocal().getWorldLocation().distanceTo(U.jL), lIIlllllIl[10])) {
                    c = lIIlllllII[lIIlllllIl[10]];
                    Movement.walkTo((WorldPoint)U.jL);

                }
                if (AccBuilderRogues.lIIIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(U.jL), lIIlllllIl[10])) {
                    c = lIIlllllII[lIIlllllIl[11]];
                }
            }
        }
        return lIIlllllIl[12];
    }

}

