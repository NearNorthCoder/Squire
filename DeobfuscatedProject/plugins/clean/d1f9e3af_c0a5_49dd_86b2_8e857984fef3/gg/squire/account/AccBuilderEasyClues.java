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
 *  net.unethicalite.api.game.Vars
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
import gg.squire.account.NHelper;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.account.ALHelper;
import gg.squire.account.ANHelper;
import gg.squire.account.EHelper;
import gg.squire.account.QHelper;
import gg.squire.account.YHelper;
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
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import org.pf4j.Extension;

@PluginDescriptor(name="Squire Easy Clue Builder", enabledByDefault=false)
@SquireUtil
@Extension
public class AccBuilderEasyClues
extends Script {
    @Inject
    public  BuilderConfig q;
    public static  long b;
    @Inject
    private  Client u;
    private static  W[] p;
    public static  int f;
    
     boolean t;
    public static  String h;
    public static  String j;
     String s;
    @Inject
    private  BuilderInfoBox w;
    static  String o;
    @Inject
    private  OverlayManager v;
    public static  String c;
    public static  long g;
    public static  HashMap<WorldPoint, Integer> i;
    public static  String k;
    
     WorldArea r;
    public static  String l;
    static  int n;
    public static  List<W> a;
    public static  String m;
    public static  boolean e;
    public static  boolean d;

    private static boolean lIlIIIlIllll(int n2) {
        return n2 <= 0;
    }

    private static boolean lIlIIIlIlIll(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(lIlllllIIIIlll);
    }

    private static boolean lIlIIIlIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIIlIIlll(int n2) {
        return n2 == 0;
    }

    static {
        AccBuilderEasyClues.lIlIIIlIIlIl();
        AccBuilderEasyClues.lIlIIIlIIlII();
        a = new ArrayList<W>();
        b = System.currentTimeMillis();
        d = llIIIIIll[4];
        g = System.currentTimeMillis();
        h = llIIIIIlI[llIIIIIll[49]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        W[] wArray = new W[llIIIIIll[5]];
        wArray[AccBuilderEasyClues.llIIIIIll[4]] = new ANHelper();
        p = wArray;
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderEasyClues.lIlIIIlIlIlI(configChanged.getGroup().equalsIgnoreCase(llIIIIIlI[llIIIIIll[19]]) ? 1 : 0) && AccBuilderEasyClues.lIlIIIlIlIlI(configChanged.getKey().contains(llIIIIIlI[llIIIIIll[20]]) ? 1 : 0)) {
            this.t = this.q.turnScriptOnOff();
            if (AccBuilderEasyClues.lIlIIIlIlIlI(this.t ? 1 : 0)) {
                d = llIIIIIll[4];

                }
            } else {
                d = llIIIIIll[5];
            }
        }
    }

    private static boolean lIlIIIlIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIlIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderEasyClues.lIlIIIlIlllI(n5, n6) && AccBuilderEasyClues.lIlIIIlIllIl(n5, n7)) {
            n4 = llIIIIIll[5];

            if (2 < 0) {
                return false;
            }
        } else {
            n4 = llIIIIIll[4];
        }
        return n4 != 0;
    }

    private static boolean lIlIIIlIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIllIIIl(Object object, Object object2) {
        return object != object2;
    }

    public AccBuilderEasyClues() {
        this.r = new WorldArea(llIIIIIll[0], llIIIIIll[1], llIIIIIll[2], llIIIIIll[3], llIIIIIll[4]);
        this.s = llIIIIIlI[llIIIIIll[4]];
    }

    private static boolean lIlIIIlIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIlIlIII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lIlllllIlllllI;
        if (AccBuilderEasyClues.lIlIIIlIlIlI(chatMessage.getMessage().contains(llIIIIIlI[llIIIIIll[29]]) ? 1 : 0)) {
            System.out.println(llIIIIIlI[llIIIIIll[30]]);
            d = llIIIIIll[5];
        }
        if (AccBuilderEasyClues.lIlIIIlIlIlI(lIlllllIlllllI.getMessage().contains(llIIIIIlI[llIIIIIll[31]]) ? 1 : 0)) {
            System.out.println(llIIIIIlI[llIIIIIll[32]]);
            if (AccBuilderEasyClues.lIlIIIlIIlll(Game.getWildyLevel()) && AccBuilderEasyClues.lIlIIIlIIlll(Inventory.contains(item -> item.getName().contains(llIIIIIlI[llIIIIIll[48]])) ? 1 : 0)) {
                d = llIIIIIll[5];
                System.out.println(llIIIIIlI[llIIIIIll[22]]);
            }
            if (!AccBuilderEasyClues.lIlIIIlIllll(Game.getWildyLevel()) || AccBuilderEasyClues.lIlIIIlIlIlI(Inventory.contains(item -> item.getName().contains(llIIIIIlI[llIIIIIll[47]])) ? 1 : 0)) {
                d = llIIIIIll[4];
                System.out.println(llIIIIIlI[llIIIIIll[33]]);
            }
        }
        if (AccBuilderEasyClues.lIlIIIlIlIlI(lIlllllIlllllI.getMessage().contains(llIIIIIlI[llIIIIIll[34]]) ? 1 : 0) && AccBuilderEasyClues.lIlIIIlIllIl(Players.getLocal().getWorldLocation().distanceTo(N.jj), llIIIIIll[20])) {
            String[] stringArray = new String[llIIIIIll[5]];
            stringArray[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIlI[llIIIIIll[35]];
            if (AccBuilderEasyClues.lIlIIIlIlIII(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[llIIIIIll[5]];
                stringArray2[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIlI[llIIIIIll[36]];
                TileObjects.getNearest((String[])stringArray2).interact(llIIIIIlI[llIIIIIll[37]]);
                Time.sleepTicks((int)llIIIIIll[11]);

            }
            String[] stringArray3 = new String[llIIIIIll[5]];
            stringArray3[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIlI[llIIIIIll[38]];
            if (AccBuilderEasyClues.lIlIIIlIlIII(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[llIIIIIll[5]];
                stringArray4[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIlI[llIIIIIll[39]];
                TileObjects.getNearest((String[])stringArray4).interact(llIIIIIlI[llIIIIIll[40]]);
                Time.sleepTicks((int)llIIIIIll[10]);

            }
        }
        if (AccBuilderEasyClues.lIlIIIlIlIlI(lIlllllIlllllI.getMessage().contains(llIIIIIlI[llIIIIIll[41]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llIIIIIll[42], llIIIIIll[43], llIIIIIll[4]));

            Time.sleepTicks((int)llIIIIIll[5]);

        }
        if (AccBuilderEasyClues.lIlIIIlIlIlI(lIlllllIlllllI.getMessage().contains(llIIIIIlI[llIIIIIll[44]]) ? 1 : 0)) {
            int[] nArray = new int[llIIIIIll[5]];
            nArray[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIll[45];
            if (AccBuilderEasyClues.lIlIIIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIIIIll[5]];
                nArray2[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIll[45];
                Inventory.getFirst((int[])nArray2).interact(llIIIIIlI[llIIIIIll[46]]);
            }
        }
    }

    private static boolean lIlIIIlIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIIIlIIlII() {
        llIIIIIlI = new String[llIIIIIll[50]];
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[4]] = "https://discord.com/api/webhooks/1215408491569872916/p_Df5IdkayMDKCaTrhumO5Op4xq0zAvxbDBL5U7-Qlv0aIJOqMT1ftqpVVjCZYZ7vApO";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[5]] = "quest";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[9]] = "Disabling GE warning";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[10]] = "Navigating to GE";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[11]] = "Finished account";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[14]] = "Death's Coffer";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[16]] = "\n[Plugin] Plugin starting up\n";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[17]] = "Easy Clues";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[18]] = "Switching to One Click Easy Clue Scroll Account";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[19]] = "hootfighter";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[20]] = "enabled";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[21]] = "\n[Plugin] Plugin shut down\n";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[25]] = "tell the king";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[26]] = "another clue scroll";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[27]] = "a new clue";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[28]] = "I could tell by the cut of your jib";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[29]] = "You haven't got enough";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[30]] = "Not enough gold for buying";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[31]] = "Oh dear, you are dead!";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[32]] = "We DIED!! :(";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[22]] = "Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[33]] = "We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[34]] = "can't reach that";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[35]] = "Door";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[36]] = "Door";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[37]] = "Open";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[38]] = "Tree Door";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[39]] = "Tree Door";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[40]] = "Open";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[41]] = "think that facing North";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[44]] = "already some rum";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[46]] = "Drop";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[47]] = "Burning";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[48]] = "Burning";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[49]] = AccBuilderEasyClues.lIlIIIlIIIlI("TUGJ9VHJwpU=", "OMLzy");
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();

        d = llIIIIIll[4];
        System.out.print(llIIIIIlI[llIIIIIll[16]]);
        this.v.add((Overlay)this.w);

        o = llIIIIIlI[llIIIIIll[17]];
        a.clear();
        System.out.println(llIIIIIlI[llIIIIIll[18]]);
        a.clear();
        q[] qArray = new q[llIIIIIll[5]];
        qArray[AccBuilderEasyClues.llIIIIIll[4]] = new QHelper();
        Collections.addAll(a, qArray);

        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    protected void shutDown() {
        this.v.remove((Overlay)this.w);

        d = llIIIIIll[5];
        p = new W[llIIIIIll[4]];
        n = llIIIIIll[4];
        f = llIIIIIll[4];
        System.out.print(llIIIIIlI[llIIIIIll[21]]);
        super.stop();
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderEasyClues.lIlIIIllIIII(n2, llIIIIIll[27])) {
            return;
        }
        if (AccBuilderEasyClues.lIlIIIlIIlll(n)) {
            AccBuilderEasyClues lIlllllIlllIlI;
            l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.a(lIlllllIlllIlI.s, "rsn: " + k + " account has been banned? - Acc builder " + o);
            n += llIIIIIll[5];
        }
    }

    private static boolean lIlIIIllIIII(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block9: {
            AccBuilderEasyClues lIllllllIlIIII;
            block10: {
                l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.w();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderEasyClues.lIlIIIllIIIl(player2, player) && AccBuilderEasyClues.lIlIIIlIlIlI(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = llIIIIIll[5];

                    } else {
                        n4 = llIIIIIll[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderEasyClues.lIlIIIlIlIII(player3) || AccBuilderEasyClues.lIlIIIlIllll(Game.getWildyLevel()) && !AccBuilderEasyClues.lIlIIIlIllIl(Players.getLocal().getWorldLocation().distanceTo(al.mr), llIIIIIll[22])) break block9;
                int[] nArray = new int[llIIIIIll[5]];
                nArray[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIll[23];
                if (!AccBuilderEasyClues.lIlIIIlIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block10;
                int[] nArray2 = new int[llIIIIIll[5]];
                nArray2[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIll[24];
                if (!AccBuilderEasyClues.lIlIIIlIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block9;
            }
            if (AccBuilderEasyClues.lIlIIIlIIlll(lIllllllIlIIII.r.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderEasyClues.lIlIIIlIlIlI(Dialog.isOpen() ? 1 : 0) && AccBuilderEasyClues.lIlIIIlIlIII(Dialog.getText())) {
            if (AccBuilderEasyClues.lIlIIIlIlIlI(Dialog.getText().contains(llIIIIIlI[llIIIIIll[25]]) ? 1 : 0)) {
                y.dt = llIIIIIll[5];
            }
            if (!AccBuilderEasyClues.lIlIIIlIIlll(Dialog.getText().contains(llIIIIIlI[llIIIIIll[26]]) ? 1 : 0) || AccBuilderEasyClues.lIlIIIlIlIlI(Dialog.getText().contains(llIIIIIlI[llIIIIIll[27]]) ? 1 : 0)) {
                // empty if block
            }
            if (AccBuilderEasyClues.lIlIIIlIlIlI(Dialog.getText().contains(llIIIIIlI[llIIIIIll[28]]) ? 1 : 0)) {
                // empty if block
            }
        }
        if (AccBuilderEasyClues.lIlIIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.G();
    }

    protected int loop() {
        block12: {
            block13: {
                if (!AccBuilderEasyClues.lIlIIIlIIllI(Game.getState(), GameState.LOGGED_IN)) break block12;
                if (!AccBuilderEasyClues.lIlIIIlIIlll(a.isEmpty() ? 1 : 0)) break block13;
                if (!AccBuilderEasyClues.lIlIIIlIlIII(j) || AccBuilderEasyClues.lIlIIIlIlIIl(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderEasyClues.lIlIIIlIlIlI(a.get(llIIIIIll[4]).V() ? 1 : 0)) {
                    if (AccBuilderEasyClues.lIlIIIlIlIlI(a.get(llIIIIIll[4]).U().contains(llIIIIIlI[llIIIIIll[5]]) ? 1 : 0)) {
                        f += llIIIIIll[5];
                    }
                    System.out.println("Achieved " + a.get(llIIIIIll[4]).U() + " goal");
                    a.remove(llIIIIIll[4]);

                    return llIIIIIll[6];
                }
                if (!AccBuilderEasyClues.lIlIIIlIIllI(Game.getState(), GameState.LOGGED_IN)) break block13;
                while (AccBuilderEasyClues.lIlIIIlIlIlI(l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.x() ? 1 : 0) && AccBuilderEasyClues.lIlIIIlIIlll(d ? 1 : 0) && AccBuilderEasyClues.lIlIIIlIlIll(l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.j(llIIIIIll[7]), llIIIIIll[8]) && AccBuilderEasyClues.lIlIIIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                    c = llIIIIIlI[llIIIIIll[9]];
                    l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.y();
                    Time.sleepTicks((int)llIIIIIll[5]);

                    if (-2 < 0) continue;
                    return (0x2A ^ 0x35 ^ (0x11 ^ 7)) & (169 + 45 - 60 + 23 ^ 4 + 162 - 103 + 121 ^ -1);
                }
                int lIllllllIllIll = llIIIIIll[4];
                try {
                    lIllllllIllIll = a.get(llIIIIIll[4]).T();

                }
                catch (Exception lIllllllIllIlI) {
                    lIllllllIllIlI.printStackTrace();
                }
                if (3 == 0) {
                    return (0 ^ 0x52) & ~(0x61 ^ 0x33);
                }
                return lIllllllIllIll;
            }
            if (AccBuilderEasyClues.lIlIIIlIlIlI(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderEasyClues.lIlIIIlIllII(Players.getLocal().getWorldLocation().distanceTo(an.mH), llIIIIIll[10])) {
                    c = llIIIIIlI[llIIIIIll[10]];
                    Movement.walkTo((WorldPoint)an.mH);

                }
                if (AccBuilderEasyClues.lIlIIIlIllIl(Players.getLocal().getWorldLocation().distanceTo(an.mH), llIIIIIll[10])) {
                    c = llIIIIIlI[llIIIIIll[11]];
                }
            }
            if (AccBuilderEasyClues.lIlIIIlIlllI(Vars.getBit((int)llIIIIIll[12]), llIIIIIll[13])) {
                String[] stringArray = new String[llIIIIIll[5]];
                stringArray[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIlI[llIIIIIll[14]];
                if (AccBuilderEasyClues.lIlIIIlIlIII(TileObjects.getNearest((String[])stringArray))) {
                    l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.E();
                }
            }
        }
        return llIIIIIll[15];
    }
}

