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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.N_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.al_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.q_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.y_Unknown;
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
    public /* synthetic */ BuilderConfig q;
    public static /* synthetic */ long b;
    @Inject
    private /* synthetic */ Client u;
    private static /* synthetic */ W[] p;
    public static /* synthetic */ int f;
    private static /* synthetic */ String[] llIIIIIlI;
    /* synthetic */ boolean t;
    public static /* synthetic */ String h;
    public static /* synthetic */ String j;
    /* synthetic */ String s;
    @Inject
    private /* synthetic */ BuilderInfoBox w;
    static /* synthetic */ String o;
    @Inject
    private /* synthetic */ OverlayManager v;
    public static /* synthetic */ String c;
    public static /* synthetic */ long g;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    public static /* synthetic */ String k;
    private static /* synthetic */ int[] llIIIIIll;
    /* synthetic */ WorldArea r;
    public static /* synthetic */ String l;
    static /* synthetic */ int n;
    public static /* synthetic */ List<W> a;
    public static /* synthetic */ String m;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ boolean d;

    private static boolean lIlIIIlIllll(int n2) {
        return n2 <= 0;
    }

    private static boolean lIlIIIlIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIIlIIIll(String lIlllllIIIIlII, String lIlllllIIIIIll) {
        lIlllllIIIIlII = new String(Base64.getDecoder().decode(lIlllllIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllllIIIIlll = new StringBuilder();
        char[] lIlllllIIIIllI = lIlllllIIIIIll.toCharArray();
        int lIlllllIIIIlIl = llIIIIIll[4];
        char[] lIllllIlllllll = lIlllllIIIIlII.toCharArray();
        int lIllllIllllllI = lIllllIlllllll.length;
        int lIllllIlllllIl = llIIIIIll[4];
        while (AccBuilderEasyClues.lIlIIIllIIlI(lIllllIlllllIl, lIllllIllllllI)) {
            char lIlllllIIIlIlI = lIllllIlllllll[lIllllIlllllIl];
            lIlllllIIIIlll.append((char)(lIlllllIIIlIlI ^ lIlllllIIIIllI[lIlllllIIIIlIl % lIlllllIIIIllI.length]));
            0;
            ++lIlllllIIIIlIl;
            ++lIllllIlllllIl;
            0;
            if ((128 + 99 - 168 + 107 ^ 127 + 21 - 60 + 74) != 0) continue;
            return null;
        }
        return String.valueOf(lIlllllIIIIlll);
    }

    private static boolean lIlIIIlIlIIl(Object object) {
        return object == null;
    }

    private static String lIlIIIlIIIlI(String lIlllllIlIIllI, String lIlllllIlIIIll) {
        try {
            SecretKeySpec lIlllllIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllllIlIIIll.getBytes(StandardCharsets.UTF_8)), llIIIIIll[18]), "DES");
            Cipher lIlllllIlIlIII = Cipher.getInstance("DES");
            lIlllllIlIlIII.init(llIIIIIll[9], lIlllllIlIlIIl);
            return new String(lIlllllIlIlIII.doFinal(Base64.getDecoder().decode(lIlllllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllllIlIIlll) {
            lIlllllIlIIlll.printStackTrace();
            return null;
        }
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
        wArray[AccBuilderEasyClues.llIIIIIll[4]] = new an();
        p = wArray;
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderEasyClues.lIlIIIlIlIlI(configChanged.getGroup().equalsIgnoreCase(llIIIIIlI[llIIIIIll[19]]) ? 1 : 0) && AccBuilderEasyClues.lIlIIIlIlIlI(configChanged.getKey().contains(llIIIIIlI[llIIIIIll[20]]) ? 1 : 0)) {
            this.t = this.q.turnScriptOnOff();
            if (AccBuilderEasyClues.lIlIIIlIlIlI(this.t ? 1 : 0)) {
                d = llIIIIIll[4];
                0;
                
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
            0;
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
                0;
            }
            String[] stringArray3 = new String[llIIIIIll[5]];
            stringArray3[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIlI[llIIIIIll[38]];
            if (AccBuilderEasyClues.lIlIIIlIlIII(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[llIIIIIll[5]];
                stringArray4[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIlI[llIIIIIll[39]];
                TileObjects.getNearest((String[])stringArray4).interact(llIIIIIlI[llIIIIIll[40]]);
                Time.sleepTicks((int)llIIIIIll[10]);
                0;
            }
        }
        if (AccBuilderEasyClues.lIlIIIlIlIlI(lIlllllIlllllI.getMessage().contains(llIIIIIlI[llIIIIIll[41]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llIIIIIll[42], llIIIIIll[43], llIIIIIll[4]));
            0;
            Time.sleepTicks((int)llIIIIIll[5]);
            0;
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
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[4]] = AccBuilderEasyClues."https://discord.com/api/webhooks/1215408491569872916/p_Df5IdkayMDKCaTrhumO5Op4xq0zAvxbDBL5U7-Qlv0aIJOqMT1ftqpVVjCZYZ7vApO";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[5]] = AccBuilderEasyClues."quest";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[9]] = AccBuilderEasyClues."Disabling GE warning";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[10]] = AccBuilderEasyClues."Navigating to GE";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[11]] = AccBuilderEasyClues."Finished account";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[14]] = AccBuilderEasyClues."Death's Coffer";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[16]] = AccBuilderEasyClues."\n[Plugin] Plugin starting up\n";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[17]] = AccBuilderEasyClues."Easy Clues";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[18]] = AccBuilderEasyClues."Switching to One Click Easy Clue Scroll Account";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[19]] = AccBuilderEasyClues."hootfighter";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[20]] = AccBuilderEasyClues."enabled";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[21]] = AccBuilderEasyClues."\n[Plugin] Plugin shut down\n";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[25]] = AccBuilderEasyClues."tell the king";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[26]] = AccBuilderEasyClues."another clue scroll";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[27]] = AccBuilderEasyClues."a new clue";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[28]] = AccBuilderEasyClues."I could tell by the cut of your jib";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[29]] = AccBuilderEasyClues."You haven't got enough";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[30]] = AccBuilderEasyClues."Not enough gold for buying";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[31]] = AccBuilderEasyClues."Oh dear, you are dead!";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[32]] = AccBuilderEasyClues."We DIED!! :(";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[22]] = AccBuilderEasyClues."Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[33]] = AccBuilderEasyClues."We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[34]] = AccBuilderEasyClues."can't reach that";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[35]] = AccBuilderEasyClues."Door";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[36]] = AccBuilderEasyClues."Door";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[37]] = AccBuilderEasyClues."Open";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[38]] = AccBuilderEasyClues."Tree Door";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[39]] = AccBuilderEasyClues."Tree Door";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[40]] = AccBuilderEasyClues."Open";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[41]] = AccBuilderEasyClues."think that facing North";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[44]] = AccBuilderEasyClues."already some rum";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[46]] = AccBuilderEasyClues."Drop";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[47]] = AccBuilderEasyClues."Burning";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[48]] = AccBuilderEasyClues."Burning";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[49]] = AccBuilderEasyClues."";
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        d = llIIIIIll[4];
        System.out.print(llIIIIIlI[llIIIIIll[16]]);
        this.v.add((Overlay)this.w);
        0;
        o = llIIIIIlI[llIIIIIll[17]];
        a.clear();
        System.out.println(llIIIIIlI[llIIIIIll[18]]);
        a.clear();
        q[] qArray = new q[llIIIIIll[5]];
        qArray[AccBuilderEasyClues.llIIIIIll[4]] = new q();
        Collections.addAll(a, qArray);
        0;
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    protected void shutDown() {
        this.v.remove((Overlay)this.w);
        0;
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
            l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown.a(lIlllllIlllIlI.s, "rsn: " + k + " account has been banned? - Acc builder " + o);
            n += llIIIIIll[5];
        }
    }

    private static String lIlIIIlIIIIl(String lIlllllIIllIIl, String lIlllllIIlIllI) {
        try {
            SecretKeySpec lIlllllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllllIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllllIIllIll = Cipher.getInstance("Blowfish");
            lIlllllIIllIll.init(llIIIIIll[9], lIlllllIIlllII);
            return new String(lIlllllIIllIll.doFinal(Base64.getDecoder().decode(lIlllllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllllIIllIlI) {
            lIlllllIIllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIlIIlIl() {
        llIIIIIll = new int[51];
        AccBuilderEasyClues.llIIIIIll[0] = -(0xFFFFA7FD & 0x595B) & (0xFFFFAF7F & 0x5DFF);
        AccBuilderEasyClues.llIIIIIll[1] = 0xFFFF8F95 & 0x7E7A;
        AccBuilderEasyClues.llIIIIIll[2] = 0x65 ^ 0x5B;
        AccBuilderEasyClues.llIIIIIll[3] = 0x40 ^ 0x75;
        AccBuilderEasyClues.llIIIIIll[4] = (0x44 ^ 0x17) & ~(0x3E ^ 0x6D);
        AccBuilderEasyClues.llIIIIIll[5] = 1;
        AccBuilderEasyClues.llIIIIIll[6] = 0xD6 ^ 0xB2;
        AccBuilderEasyClues.llIIIIIll[7] = -(0xFFFFBEDF & 0x5B65) & (0xFFFFFFDD & 0x1B7F);
        AccBuilderEasyClues.llIIIIIll[8] = 0xFFFFA3FF & 0x5FE8;
        AccBuilderEasyClues.llIIIIIll[9] = 2;
        AccBuilderEasyClues.llIIIIIll[10] = 3;
        AccBuilderEasyClues.llIIIIIll[11] = 5 + 109 - 73 + 130 ^ 145 + 138 - 187 + 79;
        AccBuilderEasyClues.llIIIIIll[12] = 0xFFFFF8EB & 0x2FF5;
        AccBuilderEasyClues.llIIIIIll[13] = -(0xFFFFE2C9 & 0x3F37) & (0xFFFFE7FE & 0x3FDD);
        AccBuilderEasyClues.llIIIIIll[14] = 0x94 ^ 0x85 ^ (0x25 ^ 0x31);
        AccBuilderEasyClues.llIIIIIll[15] = 0xFFFFCFDD & 0x327A;
        AccBuilderEasyClues.llIIIIIll[16] = 0x35 ^ 0x33;
        AccBuilderEasyClues.llIIIIIll[17] = 0xEF ^ 0xB1 ^ (0x5D ^ 4);
        AccBuilderEasyClues.llIIIIIll[18] = 0x63 ^ 0x2F ^ (6 ^ 0x42);
        AccBuilderEasyClues.llIIIIIll[19] = 0xD7 ^ 0xA2 ^ (0x47 ^ 0x3B);
        AccBuilderEasyClues.llIIIIIll[20] = 0x74 ^ 0x28 ^ (0x16 ^ 0x40);
        AccBuilderEasyClues.llIIIIIll[21] = 0xA5 ^ 0xAE;
        AccBuilderEasyClues.llIIIIIll[22] = 0xB7 ^ 0x96 ^ (0xC ^ 0x39);
        AccBuilderEasyClues.llIIIIIll[23] = 0xFFFFFF78 & 0x29F;
        AccBuilderEasyClues.llIIIIIll[24] = 0xFFFFB6DB & 0x4B3D;
        AccBuilderEasyClues.llIIIIIll[25] = 0x67 ^ 0x6B;
        AccBuilderEasyClues.llIIIIIll[26] = 0xBD ^ 0xB0;
        AccBuilderEasyClues.llIIIIIll[27] = 5 ^ 0xB;
        AccBuilderEasyClues.llIIIIIll[28] = 97 + 90 - 115 + 56 ^ 94 + 140 - 106 + 15;
        AccBuilderEasyClues.llIIIIIll[29] = 0 ^ 0x10;
        AccBuilderEasyClues.llIIIIIll[30] = 3 ^ 0x5E ^ (0x56 ^ 0x1A);
        AccBuilderEasyClues.llIIIIIll[31] = 0xE ^ 0x33 ^ (0x53 ^ 0x7C);
        AccBuilderEasyClues.llIIIIIll[32] = 0x28 ^ 0x3B;
        AccBuilderEasyClues.llIIIIIll[33] = 0x40 ^ 0x55;
        AccBuilderEasyClues.llIIIIIll[34] = 27 + 137 - 31 + 5 ^ 64 + 144 - 192 + 140;
        AccBuilderEasyClues.llIIIIIll[35] = 0x9D ^ 0x8A;
        AccBuilderEasyClues.llIIIIIll[36] = 0x5F ^ 0x47;
        AccBuilderEasyClues.llIIIIIll[37] = 8 ^ 0x11;
        AccBuilderEasyClues.llIIIIIll[38] = 0x26 ^ 1 ^ (0x7A ^ 0x47);
        AccBuilderEasyClues.llIIIIIll[39] = 0xA9 ^ 0x85 ^ (0x29 ^ 0x1E);
        AccBuilderEasyClues.llIIIIIll[40] = 0x92 ^ 0x8E;
        AccBuilderEasyClues.llIIIIIll[41] = 0x85 ^ 0x98;
        AccBuilderEasyClues.llIIIIIll[42] = -(0xFFFFF307 & 0x7CF9) & (0xFFFFFBFB & 0x7FA5);
        AccBuilderEasyClues.llIIIIIll[43] = 0xFFFFFEBF & 0xDE7;
        AccBuilderEasyClues.llIIIIIll[44] = 0x52 ^ 0x4C;
        AccBuilderEasyClues.llIIIIIll[45] = -(0xFFFFAECF & 0x7F31) & (0xFFFFEFFF & 0x3FAF);
        AccBuilderEasyClues.llIIIIIll[46] = 0x3E ^ 0x21;
        AccBuilderEasyClues.llIIIIIll[47] = 0x69 ^ 0x34 ^ (0x30 ^ 0x4D);
        AccBuilderEasyClues.llIIIIIll[48] = 0x87 ^ 0xA6;
        AccBuilderEasyClues.llIIIIIll[49] = 0x72 ^ 0x4B ^ (0x5D ^ 0x46);
        AccBuilderEasyClues.llIIIIIll[50] = 0x8F ^ 0xC2 ^ (0xEA ^ 0x84);
    }

    private static boolean lIlIIIllIIII(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block9: {
            AccBuilderEasyClues lIllllllIlIIII;
            block10: {
                l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown.w();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderEasyClues.lIlIIIllIIIl(player2, player) && AccBuilderEasyClues.lIlIIIlIlIlI(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = llIIIIIll[5];
                        0;
                        if (-3 > 0) {
                            return ((0xA6 ^ 0x8E) & ~(0x8A ^ 0xA2) & ~((0xB8 ^ 0xB2) & ~(0xBE ^ 0xB4))) != 0;
                        }
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
        l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown.G();
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
                    0;
                    return llIIIIIll[6];
                }
                if (!AccBuilderEasyClues.lIlIIIlIIllI(Game.getState(), GameState.LOGGED_IN)) break block13;
                while (AccBuilderEasyClues.lIlIIIlIlIlI(l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown.x() ? 1 : 0) && AccBuilderEasyClues.lIlIIIlIIlll(d ? 1 : 0) && AccBuilderEasyClues.lIlIIIlIlIll(l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown.j(llIIIIIll[7]), llIIIIIll[8]) && AccBuilderEasyClues.lIlIIIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                    c = llIIIIIlI[llIIIIIll[9]];
                    l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown.y();
                    Time.sleepTicks((int)llIIIIIll[5]);
                    0;
                    0;
                    if (-2 < 0) continue;
                    return (0x2A ^ 0x35 ^ (0x11 ^ 7)) & (169 + 45 - 60 + 23 ^ 4 + 162 - 103 + 121 ^ -1);
                }
                int lIllllllIllIll = llIIIIIll[4];
                try {
                    lIllllllIllIll = a.get(llIIIIIll[4]).T();
                    0;
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
                    0;
                }
                if (AccBuilderEasyClues.lIlIIIlIllIl(Players.getLocal().getWorldLocation().distanceTo(an.mH), llIIIIIll[10])) {
                    c = llIIIIIlI[llIIIIIll[11]];
                }
            }
            if (AccBuilderEasyClues.lIlIIIlIlllI(Vars.getBit((int)llIIIIIll[12]), llIIIIIll[13])) {
                String[] stringArray = new String[llIIIIIll[5]];
                stringArray[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIlI[llIIIIIll[14]];
                if (AccBuilderEasyClues.lIlIIIlIlIII(TileObjects.getNearest((String[])stringArray))) {
                    l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown.E();
                }
            }
        }
        return llIIIIIll[15];
    }
}

