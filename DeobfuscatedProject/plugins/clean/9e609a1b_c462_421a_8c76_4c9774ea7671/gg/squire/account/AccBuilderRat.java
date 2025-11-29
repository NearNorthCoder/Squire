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
import gg.squire.account.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.account.AHelper;
import gg.squire.account.HHelper;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.account.OHelper;
import gg.squire.account.PHelper;
import gg.squire.account.EHelper;
import gg.squire.account.KHelper;
import gg.squire.account.XHelper;
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
@PluginDescriptor(name="Squire Rat King Builder", enabledByDefault=false)
@Extension
public class AccBuilderRat
extends Script {
    public static  String c;
    public static  String h;
    private static  M[] o;
     WorldArea q;
    public static  HashMap<WorldPoint, Integer> i;
    @Inject
    private  BuilderInfoBox v;
    public static  String k;
     boolean s;
    public static  boolean e;
    @Inject
    public  BuilderConfig p;
    public static  long g;
    @Inject
    private  OverlayManager u;
    public static  List<M> a;
    static  int n;
    public static  String j;
    public static  int f;
    public static  boolean d;
    @Inject
    private  Client t;
    
    public static  String l;
    
     String r;
    public static  String m;
    public static  long b;

    private static boolean lIlIIlIIIIIIIlI(Object object, Object object2) {
        return object != object2;
    }

    public AccBuilderRat() {
        this.q = new WorldArea(lIIIlllIIlIll[0], lIIIlllIIlIll[1], lIIIlllIIlIll[2], lIIIlllIIlIll[3], lIIIlllIIlIll[4]);
        this.r = lIIIlllIIIlll[lIIIlllIIlIll[4]];
    }

    private static boolean lIlIIIllllllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIIIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderRat.lIlIIlIIIIIIIII(n5, n6) && AccBuilderRat.lIlIIIllllllllI(n5, n7)) {
            n4 = lIIIlllIIlIll[5];

            if ((0x4B ^ 0xD ^ (0x33 ^ 0x71)) == 1) {
                return false;
            }
        } else {
            n4 = lIIIlllIIlIll[4];
        }
        return n4 != 0;
    }

    private static boolean lIlIIlIIIIIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIlIIIIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    protected int loop() {
        block10: {
            block11: {
                if (!AccBuilderRat.lIlIIIlllllIlll(Game.getState(), GameState.LOGGED_IN)) break block10;
                if (!AccBuilderRat.lIlIIIllllllIII(a.isEmpty() ? 1 : 0)) break block11;
                if (!AccBuilderRat.lIlIIIllllllIIl(j) || AccBuilderRat.lIlIIIllllllIlI(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderRat.lIlIIIllllllIll(a.get(lIIIlllIIlIll[4]).aa() ? 1 : 0)) {
                    if (AccBuilderRat.lIlIIIllllllIll(a.get(lIIIlllIIlIll[4]).Z().contains(lIIIlllIIIlll[lIIIlllIIlIll[5]]) ? 1 : 0)) {
                        f += lIIIlllIIlIll[5];
                    }
                    System.out.println("Achieved " + a.get(lIIIlllIIlIll[4]).Z() + " goal");
                    a.remove(lIIIlllIIlIll[4]);

                    return lIIIlllIIlIll[6];
                }
                if (!AccBuilderRat.lIlIIIlllllIlll(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderRat.lIlIIIllllllIll(i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.y() ? 1 : 0) && AccBuilderRat.lIlIIIllllllIII(d ? 1 : 0) && AccBuilderRat.lIlIIIlllllllII(i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.j(lIIIlllIIlIll[7]), lIIIlllIIlIll[8]) && AccBuilderRat.lIlIIIllllllIII(Dialog.isOpen() ? 1 : 0)) {
                    c = lIIIlllIIIlll[lIIIlllIIlIll[9]];
                    i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.z();
                    Time.sleepTicks((int)lIIIlllIIlIll[5]);

                    if (1 < 3) continue;
                    return (0x1C ^ 0x43) & ~(0xEA ^ 0xB5);
                }
                int var1 = lIIIlllIIlIll[4];
                try {
                    var1 = a.get(lIIIlllIIlIll[4]).Y();

                }
                catch (Exception var2) {
                    var2.printStackTrace();
                }
                if (1 < ((0x54 ^ 0x6F) & ~(0x44 ^ 0x7F))) {
                    return (0x1C ^ 0x4D) & ~(0x25 ^ 0x74);
                }
                return var1;
            }
            if (AccBuilderRat.lIlIIIllllllIll(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderRat.lIlIIIlllllllIl(Players.getLocal().getWorldLocation().distanceTo(P.it), lIIIlllIIlIll[10])) {
                    c = lIIIlllIIIlll[lIIIlllIIlIll[10]];
                    Movement.walkTo((WorldPoint)P.it);

                }
                if (AccBuilderRat.lIlIIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(P.it), lIIIlllIIlIll[10])) {
                    c = lIIIlllIIIlll[lIIIlllIIlIll[11]];
                }
            }
        }
        return lIIIlllIIlIll[12];
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderRat.lIlIIIllllllIll(configChanged.getGroup().equalsIgnoreCase(lIIIlllIIIlll[lIIIlllIIlIll[15]]) ? 1 : 0) && AccBuilderRat.lIlIIIllllllIll(configChanged.getKey().contains(lIIIlllIIIlll[lIIIlllIIlIll[16]]) ? 1 : 0)) {
            this.s = this.p.turnScriptOnOff();
            if (AccBuilderRat.lIlIIIllllllIll(this.s ? 1 : 0)) {
                d = lIIIlllIIlIll[4];

                }
            } else {
                d = lIIIlllIIlIll[5];
            }
        }
    }

    private static boolean lIlIIIlllllllll(int n2) {
        return n2 <= 0;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderRat.lIlIIlIIIIIIIIl(n2, lIIIlllIIlIll[25])) {
            return;
        }
        if (AccBuilderRat.lIlIIIllllllIII(n)) {
            AccBuilderRat var3;
            i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.a(var3.r, "rsn: " + k + " account has been banned? - Acc builder");
            n += lIIIlllIIlIll[5];
        }
    }

    protected void shutDown() {
        this.u.remove((Overlay)this.v);

        d = lIIIlllIIlIll[5];
        o = new M[lIIIlllIIlIll[4]];
        n = lIIIlllIIlIll[4];
        f = lIIIlllIIlIll[4];
        System.out.print(lIIIlllIIIlll[lIIIlllIIlIll[17]]);
        super.stop();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var4;
        if (AccBuilderRat.lIlIIIllllllIll(chatMessage.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[21]]) ? 1 : 0)) {
            System.out.println(lIIIlllIIIlll[lIIIlllIIlIll[22]]);
            d = lIIIlllIIlIll[5];
        }
        if (AccBuilderRat.lIlIIIllllllIll(var4.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[23]]) ? 1 : 0)) {
            System.out.println(lIIIlllIIIlll[lIIIlllIIlIll[24]]);
            if (AccBuilderRat.lIlIIIllllllIII(Game.getWildyLevel()) && AccBuilderRat.lIlIIIllllllIII(Inventory.contains(item -> item.getName().contains(lIIIlllIIIlll[lIIIlllIIlIll[41]])) ? 1 : 0)) {
                d = lIIIlllIIlIll[5];
                System.out.println(lIIIlllIIIlll[lIIIlllIIlIll[25]]);
            }
            if (!AccBuilderRat.lIlIIIlllllllll(Game.getWildyLevel()) || AccBuilderRat.lIlIIIllllllIll(Inventory.contains(item -> item.getName().contains(lIIIlllIIIlll[lIIIlllIIlIll[40]])) ? 1 : 0)) {
                d = lIIIlllIIlIll[4];
                System.out.println(lIIIlllIIIlll[lIIIlllIIlIll[26]]);
            }
        }
        if (AccBuilderRat.lIlIIIllllllIll(var4.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[27]]) ? 1 : 0) && AccBuilderRat.lIlIIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(H.hs), lIIIlllIIlIll[21])) {
            i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.w();
        }
        if (AccBuilderRat.lIlIIIllllllIll(var4.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[28]]) ? 1 : 0) && (!AccBuilderRat.lIlIIIlllllllIl(Players.getLocal().getWorldLocation().distanceTo(A.gr), lIIIlllIIlIll[15]) || AccBuilderRat.lIlIIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(x.fW), lIIIlllIIlIll[21]))) {
            String[] stringArray = new String[lIIIlllIIlIll[5]];
            stringArray[AccBuilderRat.lIIIlllIIlIll[4]] = lIIIlllIIIlll[lIIIlllIIlIll[29]];
            if (AccBuilderRat.lIlIIIllllllIIl(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lIIIlllIIlIll[5]];
                stringArray2[AccBuilderRat.lIIIlllIIlIll[4]] = lIIIlllIIIlll[lIIIlllIIlIll[30]];
                TileObjects.getNearest((String[])stringArray2).interact(lIIIlllIIIlll[lIIIlllIIlIll[18]]);
                Time.sleepTicks((int)lIIIlllIIlIll[11]);

            }
            String[] stringArray3 = new String[lIIIlllIIlIll[5]];
            stringArray3[AccBuilderRat.lIIIlllIIlIll[4]] = lIIIlllIIIlll[lIIIlllIIlIll[31]];
            if (AccBuilderRat.lIlIIIllllllIIl(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[lIIIlllIIlIll[5]];
                stringArray4[AccBuilderRat.lIIIlllIIlIll[4]] = lIIIlllIIIlll[lIIIlllIIlIll[32]];
                TileObjects.getNearest((String[])stringArray4).interact(lIIIlllIIIlll[lIIIlllIIlIll[33]]);
                Time.sleepTicks((int)lIIIlllIIlIll[10]);

            }
        }
        if (AccBuilderRat.lIlIIIllllllIll(var4.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[34]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIIIlllIIlIll[35], lIIIlllIIlIll[36], lIIIlllIIlIll[4]));

            Time.sleepTicks((int)lIIIlllIIlIll[5]);

        }
        if (AccBuilderRat.lIlIIIllllllIll(var4.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[37]]) ? 1 : 0)) {
            int[] nArray = new int[lIIIlllIIlIll[5]];
            nArray[AccBuilderRat.lIIIlllIIlIll[4]] = lIIIlllIIlIll[38];
            if (AccBuilderRat.lIlIIIllllllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIlllIIlIll[5]];
                nArray2[AccBuilderRat.lIIIlllIIlIll[4]] = lIIIlllIIlIll[38];
                Inventory.getFirst((int[])nArray2).interact(lIIIlllIIIlll[lIIIlllIIlIll[39]]);
            }
        }
    }

    private static void lIlIIIlllllIlIl() {
        lIIIlllIIIlll = new String[lIIIlllIIlIll[43]];
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[4]] = "https://discord.com/api/webhooks/1193421866459725834/O4zTPyFZMm83vMwkEnq6zlsGdAzLR4AGiJhhz0hFc0JZsJzMFQ-ivS8oiytVIzgMDJhM";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[5]] = "quest";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[9]] = "Disabling GE warning";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[10]] = "Navigating to GE";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[11]] = "Finished account";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[13]] = "\n[Plugin] Plugin starting up\n";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[14]] = "Switching to One Click F2P";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[15]] = "hootfighter";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[16]] = "enabled";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[17]] = "\n[Plugin] Plugin shut down\n";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[21]] = "You haven't got enough";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[22]] = "Not enough gold for buying";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[23]] = "Oh dear, you are dead!";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[24]] = "We DIED!! :(";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[25]] = "Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[26]] = "We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[27]] = "can't reach that";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[28]] = "can't reach that";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[29]] = "Door";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[30]] = "Door";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[18]] = "Open";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[31]] = "Tree Door";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[32]] = "Tree Door";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[33]] = "Open";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[34]] = "think that facing North";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[37]] = "already some rum";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[39]] = "Drop";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[40]] = "Burning";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[41]] = "Burning";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[42]] = AccBuilderRat.lIlIIIllllIIIIl("", "uqmOE");
    }

    static {
        AccBuilderRat.lIlIIIlllllIllI();
        AccBuilderRat.lIlIIIlllllIlIl();
        a = new ArrayList<M>();
        b = System.currentTimeMillis();
        d = lIIIlllIIlIll[4];
        g = System.currentTimeMillis();
        h = lIIIlllIIIlll[lIIIlllIIlIll[42]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        M[] mArray = new M[lIIIlllIIlIll[5]];
        mArray[AccBuilderRat.lIIIlllIIlIll[4]] = new PHelper();
        o = mArray;
    }

    private static boolean lIlIIIllllllIIl(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block5: {
            AccBuilderRat var5;
            block6: {
                i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.x();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderRat.lIlIIlIIIIIIIlI(player2, player) && AccBuilderRat.lIlIIIllllllIll(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = lIIIlllIIlIll[5];

                        if ((133 + 72 - 121 + 65 ^ 39 + 96 - 47 + 57) != (0xEE ^ 0xBB ^ (0x4D ^ 0x1C))) {
                            return false;
                        }
                    } else {
                        n4 = lIIIlllIIlIll[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderRat.lIlIIIllllllIIl(player3) || AccBuilderRat.lIlIIIlllllllll(Game.getWildyLevel()) && !AccBuilderRat.lIlIIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(O.in), lIIIlllIIlIll[18])) break block5;
                int[] nArray = new int[lIIIlllIIlIll[5]];
                nArray[AccBuilderRat.lIIIlllIIlIll[4]] = lIIIlllIIlIll[19];
                if (!AccBuilderRat.lIlIIIllllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[lIIIlllIIlIll[5]];
                nArray2[AccBuilderRat.lIIIlllIIlIll[4]] = lIIIlllIIlIll[20];
                if (!AccBuilderRat.lIlIIIllllllIll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
            }
            if (AccBuilderRat.lIlIIIllllllIII(var5.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderRat.lIlIIIllllllIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.H();
    }

    private static boolean lIlIIIlllllllIl(int n2, int n3) {
        return n2 > n3;
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    private static boolean lIlIIIlllllllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIllllllIlI(Object object) {
        return object == null;
    }

    private static boolean lIlIIIlllllIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIllllllIll(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var6);
    }

    private static boolean lIlIIIllllllllI(int n2, int n3) {
        return n2 <= n3;
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();

        d = lIIIlllIIlIll[4];
        System.out.print(lIIIlllIIIlll[lIIIlllIIlIll[13]]);
        this.u.add((Overlay)this.v);

        a.clear();
        System.out.println(lIIIlllIIIlll[lIIIlllIIlIll[14]]);
        a.clear();
        k[] kArray = new k[lIIIlllIIlIll[5]];
        kArray[AccBuilderRat.lIIIlllIIlIll[4]] = new KHelper();
        Collections.addAll(a, kArray);

        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

}

