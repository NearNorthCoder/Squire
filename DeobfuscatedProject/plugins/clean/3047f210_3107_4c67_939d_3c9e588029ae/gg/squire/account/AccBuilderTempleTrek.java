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
import gg.squire.account.EHelper;
import gg.squire.account.HHelper;
import gg.squire.account.NHelper;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.account.AAHelper;
import gg.squire.account.ACHelper;
import gg.squire.account.EHelper;
import gg.squire.account.MHelper;
import gg.squire.account.SHelper;
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
    static  int n;
    public static  String j;
    public static  HashMap<WorldPoint, Integer> i;
    @Inject
    private  Client t;
     String r;
    public static  boolean e;
    public static  long b;
    public static  boolean d;
    public static  String k;
    public static  String m;
     WorldArea q;
    @Inject
    private  BuilderInfoBox v;
    
    public static  String c;
    public static  int f;
    @Inject
    private  OverlayManager u;
    public static  String h;
    private static  S[] o;
    public static  long g;
    public static  List<S> a;
    public static  String l;
    
     boolean s;
    @Inject
    public  BuilderConfig p;

    @Subscribe
    public void a(GameTick gameTick) {
        block5: {
            AccBuilderTempleTrek var1;
            block6: {
                e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.w();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderTempleTrek.llIllllIIllll(player2, player) && AccBuilderTempleTrek.llIllllIIlIII(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = lIIIIIllIIl[5];

                        if (2 <= 0) {
                            return false;
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
            if (AccBuilderTempleTrek.llIllllIIIlIl(var1.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
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
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[4]] = "https://discord.com/api/webhooks/1193421866459725834/O4zTPyFZMm83vMwkEnq6zlsGdAzLR4AGiJhhz0hFc0JZsJzMFQ-ivS8oiytVIzgMDJhM";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[5]] = "quest";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[9]] = "Disabling GE warning";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[10]] = "Navigating to GE";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[11]] = "Finished account";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[13]] = "\n[Plugin] Plugin starting up\n";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[14]] = "Switching to One Temple Trek Account";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[15]] = "hootfighter";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[16]] = "enabled";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[17]] = "\n[Plugin] Plugin shut down\n";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[21]] = "tell the king";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[22]] = "You haven't got enough";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[23]] = "Not enough gold for buying";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[24]] = "Oh dear, you are dead!";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[25]] = "We DIED!! :(";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[26]] = "Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[27]] = "We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[28]] = "can't reach that";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[29]] = "can't reach that";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[30]] = "Door";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[18]] = "Door";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[31]] = "Open";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[32]] = "Tree Door";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[33]] = "Tree Door";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[34]] = "Open";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[35]] = "think that facing North";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[38]] = "already some rum";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[40]] = "Drop";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[41]] = "Burning";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[42]] = "Burning";
        AccBuilderTempleTrek.lIIIIIllIII[AccBuilderTempleTrek.lIIIIIllIIl[43]] = AccBuilderTempleTrek.llIllllIIIIIl("", "RmIjN");
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
            AccBuilderTempleTrek var2;
            e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.a(var2.r, "rsn: " + k + " account has been banned? - Acc builder");
            n += lIIIIIllIIl[5];
        }
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderTempleTrek.llIllllIIlIII(configChanged.getGroup().equalsIgnoreCase(lIIIIIllIII[lIIIIIllIIl[15]]) ? 1 : 0) && AccBuilderTempleTrek.llIllllIIlIII(configChanged.getKey().contains(lIIIIIllIII[lIIIIIllIIl[16]]) ? 1 : 0)) {
            this.s = this.p.turnScriptOnOff();
            if (AccBuilderTempleTrek.llIllllIIlIII(this.s ? 1 : 0)) {
                d = lIIIIIllIIl[4];

                if ((0x68 ^ 0x6D) <= 0) {
                    return;
                }
            } else {
                d = lIIIIIllIIl[5];
            }
        }
    }

    private static boolean llIllllIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var3;
        if (AccBuilderTempleTrek.llIllllIIlIII(chatMessage.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[22]]) ? 1 : 0)) {
            System.out.println(lIIIIIllIII[lIIIIIllIIl[23]]);
            d = lIIIIIllIIl[5];
        }
        if (AccBuilderTempleTrek.llIllllIIlIII(var3.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[24]]) ? 1 : 0)) {
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
        if (AccBuilderTempleTrek.llIllllIIlIII(var3.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[28]]) ? 1 : 0) && AccBuilderTempleTrek.llIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(N.ig), lIIIIIllIIl[21])) {
            e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.v();
        }
        if (AccBuilderTempleTrek.llIllllIIlIII(var3.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[29]]) ? 1 : 0) && (!AccBuilderTempleTrek.llIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(H.ht), lIIIIIllIIl[15]) || AccBuilderTempleTrek.llIllllIIlIll(Players.getLocal().getWorldLocation().distanceTo(E.gY), lIIIIIllIIl[21]))) {
            String[] stringArray = new String[lIIIIIllIIl[5]];
            stringArray[AccBuilderTempleTrek.lIIIIIllIIl[4]] = lIIIIIllIII[lIIIIIllIIl[30]];
            if (AccBuilderTempleTrek.llIllllIIIllI(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lIIIIIllIIl[5]];
                stringArray2[AccBuilderTempleTrek.lIIIIIllIIl[4]] = lIIIIIllIII[lIIIIIllIIl[18]];
                TileObjects.getNearest((String[])stringArray2).interact(lIIIIIllIII[lIIIIIllIIl[31]]);
                Time.sleepTicks((int)lIIIIIllIIl[11]);

            }
            String[] stringArray3 = new String[lIIIIIllIIl[5]];
            stringArray3[AccBuilderTempleTrek.lIIIIIllIIl[4]] = lIIIIIllIII[lIIIIIllIIl[32]];
            if (AccBuilderTempleTrek.llIllllIIIllI(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[lIIIIIllIIl[5]];
                stringArray4[AccBuilderTempleTrek.lIIIIIllIIl[4]] = lIIIIIllIII[lIIIIIllIIl[33]];
                TileObjects.getNearest((String[])stringArray4).interact(lIIIIIllIII[lIIIIIllIIl[34]]);
                Time.sleepTicks((int)lIIIIIllIIl[10]);

            }
        }
        if (AccBuilderTempleTrek.llIllllIIlIII(var3.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[35]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIIIIIllIIl[36], lIIIIIllIIl[37], lIIIIIllIIl[4]));

            Time.sleepTicks((int)lIIIIIllIIl[5]);

        }
        if (AccBuilderTempleTrek.llIllllIIlIII(var3.getMessage().contains(lIIIIIllIII[lIIIIIllIIl[38]]) ? 1 : 0)) {
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

        d = lIIIIIllIIl[4];
        System.out.print(lIIIIIllIII[lIIIIIllIIl[13]]);
        this.u.add((Overlay)this.v);

        a.clear();
        System.out.println(lIIIIIllIII[lIIIIIllIIl[14]]);
        a.clear();
        m[] mArray = new m[lIIIIIllIIl[5]];
        mArray[AccBuilderTempleTrek.lIIIIIllIIl[4]] = new MHelper();
        Collections.addAll(a, mArray);

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
        sArray[AccBuilderTempleTrek.lIIIIIllIIl[4]] = new ACHelper();
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

                    return lIIIIIllIIl[6];
                }
                if (!AccBuilderTempleTrek.llIllllIIIlII(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderTempleTrek.llIllllIIlIII(e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.x() ? 1 : 0) && AccBuilderTempleTrek.llIllllIIIlIl(d ? 1 : 0) && AccBuilderTempleTrek.llIllllIIlIIl(e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.j(lIIIIIllIIl[7]), lIIIIIllIIl[8]) && AccBuilderTempleTrek.llIllllIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    c = lIIIIIllIII[lIIIIIllIIl[9]];
                    e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.y();
                    Time.sleepTicks((int)lIIIIIllIIl[5]);

                    if (1 < 2) continue;
                    return (0xA6 ^ 0x96 ^ (0x62 ^ 1)) & (3 ^ (0x32 ^ 0x62) ^ -1);
                }
                int var4 = lIIIIIllIIl[4];
                try {
                    var4 = a.get(lIIIIIllIIl[4]).T();

                }
                catch (Exception var5) {
                    var5.printStackTrace();
                }
                
                }
                return var4;
            }
            if (AccBuilderTempleTrek.llIllllIIlIII(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderTempleTrek.llIllllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(ac.jR), lIIIIIllIIl[10])) {
                    c = lIIIIIllIII[lIIIIIllIIl[10]];
                    Movement.walkTo((WorldPoint)ac.jR);

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

            }
        } else {
            n4 = lIIIIIllIIl[4];
        }
        return n4 != 0;
    }

        return String.valueOf(var6);
    }
}

