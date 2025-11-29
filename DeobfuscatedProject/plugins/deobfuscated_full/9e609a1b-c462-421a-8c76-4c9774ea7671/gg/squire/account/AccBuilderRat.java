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
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.A;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.H;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.O;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.k;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.x;
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
    public static /* synthetic */ String c;
    public static /* synthetic */ String h;
    private static /* synthetic */ M[] o;
    /* synthetic */ WorldArea q;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    @Inject
    private /* synthetic */ BuilderInfoBox v;
    public static /* synthetic */ String k;
    /* synthetic */ boolean s;
    public static /* synthetic */ boolean e;
    @Inject
    public /* synthetic */ BuilderConfig p;
    public static /* synthetic */ long g;
    @Inject
    private /* synthetic */ OverlayManager u;
    public static /* synthetic */ List<M> a;
    static /* synthetic */ int n;
    public static /* synthetic */ String j;
    public static /* synthetic */ int f;
    public static /* synthetic */ boolean d;
    @Inject
    private /* synthetic */ Client t;
    private static /* synthetic */ String[] lIIIlllIIIlll;
    public static /* synthetic */ String l;
    private static /* synthetic */ int[] lIIIlllIIlIll;
    /* synthetic */ String r;
    public static /* synthetic */ String m;
    public static /* synthetic */ long b;

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
            0;
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
                    0;
                    return lIIIlllIIlIll[6];
                }
                if (!AccBuilderRat.lIlIIIlllllIlll(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderRat.lIlIIIllllllIll(i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.y() ? 1 : 0) && AccBuilderRat.lIlIIIllllllIII(d ? 1 : 0) && AccBuilderRat.lIlIIIlllllllII(i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.j(lIIIlllIIlIll[7]), lIIIlllIIlIll[8]) && AccBuilderRat.lIlIIIllllllIII(Dialog.isOpen() ? 1 : 0)) {
                    c = lIIIlllIIIlll[lIIIlllIIlIll[9]];
                    i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.z();
                    Time.sleepTicks((int)lIIIlllIIlIll[5]);
                    0;
                    0;
                    if (1 < 3) continue;
                    return (0x1C ^ 0x43) & ~(0xEA ^ 0xB5);
                }
                int var17 = lIIIlllIIlIll[4];
                try {
                    var17 = a.get(lIIIlllIIlIll[4]).Y();
                    0;
                }
                catch (Exception var10) {
                    var10.printStackTrace();
                }
                if (1 < ((0x54 ^ 0x6F) & ~(0x44 ^ 0x7F))) {
                    return (0x1C ^ 0x4D) & ~(0x25 ^ 0x74);
                }
                return var17;
            }
            if (AccBuilderRat.lIlIIIllllllIll(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderRat.lIlIIIlllllllIl(Players.getLocal().getWorldLocation().distanceTo(P.it), lIIIlllIIlIll[10])) {
                    c = lIIIlllIIIlll[lIIIlllIIlIll[10]];
                    Movement.walkTo((WorldPoint)P.it);
                    0;
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
                0;
                
                }
            } else {
                d = lIIIlllIIlIll[5];
            }
        }
    }

    private static String lIlIIIllllIIIlI(String var12, String var24) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lIIIlllIIlIll[9], var7);
            return new String(var15.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
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
            AccBuilderRat var13;
            i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.a(var13.r, "rsn: " + k + " account has been banned? - Acc builder");
            n += lIIIlllIIlIll[5];
        }
    }

    protected void shutDown() {
        this.u.remove((Overlay)this.v);
        0;
        d = lIIIlllIIlIll[5];
        o = new M[lIIIlllIIlIll[4]];
        n = lIIIlllIIlIll[4];
        f = lIIIlllIIlIll[4];
        System.out.print(lIIIlllIIIlll[lIIIlllIIlIll[17]]);
        super.stop();
    }

    private static String lIlIIIllllIIIll(String var16, String var22) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), lIIIlllIIlIll[16]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIIIlllIIlIll[9], var19);
            return new String(var2.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var21;
        if (AccBuilderRat.lIlIIIllllllIll(chatMessage.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[21]]) ? 1 : 0)) {
            System.out.println(lIIIlllIIIlll[lIIIlllIIlIll[22]]);
            d = lIIIlllIIlIll[5];
        }
        if (AccBuilderRat.lIlIIIllllllIll(var21.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[23]]) ? 1 : 0)) {
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
        if (AccBuilderRat.lIlIIIllllllIll(var21.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[27]]) ? 1 : 0) && AccBuilderRat.lIlIIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(H.hs), lIIIlllIIlIll[21])) {
            i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.w();
        }
        if (AccBuilderRat.lIlIIIllllllIll(var21.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[28]]) ? 1 : 0) && (!AccBuilderRat.lIlIIIlllllllIl(Players.getLocal().getWorldLocation().distanceTo(A.gr), lIIIlllIIlIll[15]) || AccBuilderRat.lIlIIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(x.fW), lIIIlllIIlIll[21]))) {
            String[] stringArray = new String[lIIIlllIIlIll[5]];
            stringArray[AccBuilderRat.lIIIlllIIlIll[4]] = lIIIlllIIIlll[lIIIlllIIlIll[29]];
            if (AccBuilderRat.lIlIIIllllllIIl(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lIIIlllIIlIll[5]];
                stringArray2[AccBuilderRat.lIIIlllIIlIll[4]] = lIIIlllIIIlll[lIIIlllIIlIll[30]];
                TileObjects.getNearest((String[])stringArray2).interact(lIIIlllIIIlll[lIIIlllIIlIll[18]]);
                Time.sleepTicks((int)lIIIlllIIlIll[11]);
                0;
            }
            String[] stringArray3 = new String[lIIIlllIIlIll[5]];
            stringArray3[AccBuilderRat.lIIIlllIIlIll[4]] = lIIIlllIIIlll[lIIIlllIIlIll[31]];
            if (AccBuilderRat.lIlIIIllllllIIl(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[lIIIlllIIlIll[5]];
                stringArray4[AccBuilderRat.lIIIlllIIlIll[4]] = lIIIlllIIIlll[lIIIlllIIlIll[32]];
                TileObjects.getNearest((String[])stringArray4).interact(lIIIlllIIIlll[lIIIlllIIlIll[33]]);
                Time.sleepTicks((int)lIIIlllIIlIll[10]);
                0;
            }
        }
        if (AccBuilderRat.lIlIIIllllllIll(var21.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[34]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIIIlllIIlIll[35], lIIIlllIIlIll[36], lIIIlllIIlIll[4]));
            0;
            Time.sleepTicks((int)lIIIlllIIlIll[5]);
            0;
        }
        if (AccBuilderRat.lIlIIIllllllIll(var21.getMessage().contains(lIIIlllIIIlll[lIIIlllIIlIll[37]]) ? 1 : 0)) {
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
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[4]] = AccBuilderRat."https://discord.com/api/webhooks/1193421866459725834/O4zTPyFZMm83vMwkEnq6zlsGdAzLR4AGiJhhz0hFc0JZsJzMFQ-ivS8oiytVIzgMDJhM";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[5]] = AccBuilderRat."quest";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[9]] = AccBuilderRat."Disabling GE warning";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[10]] = AccBuilderRat."Navigating to GE";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[11]] = AccBuilderRat."Finished account";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[13]] = AccBuilderRat."\n[Plugin] Plugin starting up\n";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[14]] = AccBuilderRat."Switching to One Click F2P";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[15]] = AccBuilderRat."hootfighter";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[16]] = AccBuilderRat."enabled";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[17]] = AccBuilderRat."\n[Plugin] Plugin shut down\n";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[21]] = AccBuilderRat."You haven't got enough";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[22]] = AccBuilderRat."Not enough gold for buying";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[23]] = AccBuilderRat."Oh dear, you are dead!";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[24]] = AccBuilderRat."We DIED!! :(";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[25]] = AccBuilderRat."Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[26]] = AccBuilderRat."We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[27]] = AccBuilderRat."can't reach that";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[28]] = AccBuilderRat."can't reach that";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[29]] = AccBuilderRat."Door";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[30]] = AccBuilderRat."Door";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[18]] = AccBuilderRat."Open";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[31]] = AccBuilderRat."Tree Door";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[32]] = AccBuilderRat."Tree Door";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[33]] = AccBuilderRat."Open";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[34]] = AccBuilderRat."think that facing North";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[37]] = AccBuilderRat."already some rum";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[39]] = AccBuilderRat."Drop";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[40]] = AccBuilderRat."Burning";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[41]] = AccBuilderRat."Burning";
        AccBuilderRat.lIIIlllIIIlll[AccBuilderRat.lIIIlllIIlIll[42]] = AccBuilderRat."";
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
        mArray[AccBuilderRat.lIIIlllIIlIll[4]] = new P();
        o = mArray;
    }

    private static boolean lIlIIIllllllIIl(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block5: {
            AccBuilderRat var8;
            block6: {
                i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.x();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderRat.lIlIIlIIIIIIIlI(player2, player) && AccBuilderRat.lIlIIIllllllIll(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = lIIIlllIIlIll[5];
                        0;
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
            if (AccBuilderRat.lIlIIIllllllIII(var8.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
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

    private static String lIlIIIllllIIIIl(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var6 = var5.toCharArray();
        int var3 = lIIIlllIIlIll[4];
        char[] var14 = var4.toCharArray();
        int var18 = var14.length;
        int var9 = lIIIlllIIlIll[4];
        while (AccBuilderRat.lIlIIlIIIIIIIll(var9, var18)) {
            char var23 = var14[var9];
            var11.append((char)(var23 ^ var6[var3 % var6.length]));
            0;
            ++var3;
            ++var9;
            0;
            if (2 <= 3) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean lIlIIIllllllllI(int n2, int n3) {
        return n2 <= n3;
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        d = lIIIlllIIlIll[4];
        System.out.print(lIIIlllIIIlll[lIIIlllIIlIll[13]]);
        this.u.add((Overlay)this.v);
        0;
        a.clear();
        System.out.println(lIIIlllIIIlll[lIIIlllIIlIll[14]]);
        a.clear();
        k[] kArray = new k[lIIIlllIIlIll[5]];
        kArray[AccBuilderRat.lIIIlllIIlIll[4]] = new k();
        Collections.addAll(a, kArray);
        0;
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    private static void lIlIIIlllllIllI() {
        lIIIlllIIlIll = new int[44];
        AccBuilderRat.lIIIlllIIlIll[0] = -(0xFFFF8BDB & 0x75E5) & (0xFFFF8FE7 & 0x7DFF);
        AccBuilderRat.lIIIlllIIlIll[1] = 0xFFFFEFD7 & 0x1E38;
        AccBuilderRat.lIIIlllIIlIll[2] = 0x6B ^ 0x55;
        AccBuilderRat.lIIIlllIIlIll[3] = 0x23 ^ 6 ^ (0x81 ^ 0x91);
        AccBuilderRat.lIIIlllIIlIll[4] = (86 + 59 - -43 + 39 ^ 10 + 122 - 8 + 62) & (159 + 132 - 125 + 33 ^ 134 + 41 - 111 + 94 ^ -1);
        AccBuilderRat.lIIIlllIIlIll[5] = 1;
        AccBuilderRat.lIIIlllIIlIll[6] = 0xF9 ^ 0x9D;
        AccBuilderRat.lIIIlllIIlIll[7] = -(0xFFFFF7EF & 0x7ED5) & (0xFFFFF7FF & 0x7FDD);
        AccBuilderRat.lIIIlllIIlIll[8] = -(0xFFFFFC07 & Short.MAX_VALUE) & (0xFFFFFFEE & Short.MAX_VALUE);
        AccBuilderRat.lIIIlllIIlIll[9] = 2;
        AccBuilderRat.lIIIlllIIlIll[10] = 3;
        AccBuilderRat.lIIIlllIIlIll[11] = 0xDA ^ 0x9B ^ (0x25 ^ 0x60);
        AccBuilderRat.lIIIlllIIlIll[12] = -(0xFFFFFF37 & 0x49EC) & (0xFFFFEF7B & 0x5BFF);
        AccBuilderRat.lIIIlllIIlIll[13] = 0xA1 ^ 0xA4;
        AccBuilderRat.lIIIlllIIlIll[14] = 0x2E ^ 6 ^ (0x1E ^ 0x30);
        AccBuilderRat.lIIIlllIIlIll[15] = 0x1E ^ 0x19;
        AccBuilderRat.lIIIlllIIlIll[16] = 0x78 ^ 0x70;
        AccBuilderRat.lIIIlllIIlIll[17] = 0x24 ^ 0x49 ^ (0xC4 ^ 0xA0);
        AccBuilderRat.lIIIlllIIlIll[18] = 0x88 ^ 0x9C;
        AccBuilderRat.lIIIlllIIlIll[19] = -(0xFFFFF1B9 & 0x2FCE) & (0xFFFFB7BF & 0x6BDF);
        AccBuilderRat.lIIIlllIIlIll[20] = -(0xFFFFF5D7 & 0x7B2F) & (0xFFFFF3BF & 0x7F5F);
        AccBuilderRat.lIIIlllIIlIll[21] = 0x6B ^ 0x58 ^ (0xB4 ^ 0x8D);
        AccBuilderRat.lIIIlllIIlIll[22] = 68 + 7 - 63 + 130 ^ 69 + 46 - 102 + 120;
        AccBuilderRat.lIIIlllIIlIll[23] = 0x2E ^ 0x22;
        AccBuilderRat.lIIIlllIIlIll[24] = 62 + 60 - 14 + 61 ^ 82 + 19 - -17 + 46;
        AccBuilderRat.lIIIlllIIlIll[25] = 0xB4 ^ 0xBA;
        AccBuilderRat.lIIIlllIIlIll[26] = 0xCC ^ 0xC3;
        AccBuilderRat.lIIIlllIIlIll[27] = 0x4B ^ 0x5B;
        AccBuilderRat.lIIIlllIIlIll[28] = 49 + 3 - 29 + 108 ^ 106 + 39 - 105 + 106;
        AccBuilderRat.lIIIlllIIlIll[29] = 0x87 ^ 0x8F ^ (0x73 ^ 0x69);
        AccBuilderRat.lIIIlllIIlIll[30] = 0x5B ^ 0x76 ^ (0x75 ^ 0x4B);
        AccBuilderRat.lIIIlllIIlIll[31] = 8 ^ 0x4F ^ (0x7E ^ 0x2C);
        AccBuilderRat.lIIIlllIIlIll[32] = 0xF7 ^ 0xAA ^ (0x4D ^ 6);
        AccBuilderRat.lIIIlllIIlIll[33] = 0x28 ^ 0x3F;
        AccBuilderRat.lIIIlllIIlIll[34] = 100 + 66 - 48 + 10 ^ 127 + 94 - 162 + 93;
        AccBuilderRat.lIIIlllIIlIll[35] = -(0xFFFFF1DF & 0x1E7F) & (0xFFFFDFFF & 0x3BFF);
        AccBuilderRat.lIIIlllIIlIll[36] = 0xFFFFAEA7 & 0x5DFF;
        AccBuilderRat.lIIIlllIIlIll[37] = 0x2F ^ 5 ^ (0xAC ^ 0x9F);
        AccBuilderRat.lIIIlllIIlIll[38] = -(0xFFFFBF55 & 0x5AFB) & (0xFFFF9BFF & Short.MAX_VALUE);
        AccBuilderRat.lIIIlllIIlIll[39] = 0x56 ^ 0x4C;
        AccBuilderRat.lIIIlllIIlIll[40] = 0xA8 ^ 0xB3;
        AccBuilderRat.lIIIlllIIlIll[41] = 1 ^ 0x6E ^ (0x1F ^ 0x6C);
        AccBuilderRat.lIIIlllIIlIll[42] = 0x77 ^ 0x6A;
        AccBuilderRat.lIIIlllIIlIll[43] = 0x7E ^ 0x3C ^ (0x5D ^ 1);
    }
}

