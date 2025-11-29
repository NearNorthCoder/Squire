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
import gg.squire.account.FHelper;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.account.XHelper;
import gg.squire.account.ZHelper;
import gg.squire.account.EHelper;
import gg.squire.account.SHelper;
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

@Extension
@PluginDescriptor(name="Squire Shaman Builder", enabledByDefault=false)
@SquireUtil
public class AccBuilderShamans
extends Script {
    
    public static  String h;
    public static  String j;
    
    public static  String k;
    public static  int f;
    public static  long b;
    public static  String m;
    public static  boolean e;
     String r;
    public static  String l;
    public static  String c;
    private static  K[] o;
    public static  boolean d;
    @Inject
    private  BuilderInfoBox v;
    static  int n;
    @Inject
    private  Client t;
    @Inject
    private  OverlayManager u;
     boolean s;
    public static  long g;
    public static  HashMap<WorldPoint, Integer> i;
    @Inject
    public  BuilderConfig p;
    public static  List<K> a;
     WorldArea q;

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
        void var1;
        if (AccBuilderShamans.lIIIllllllIlI(chatMessage.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[22]]) ? 1 : 0)) {
            System.out.println(lIlIlIIIlI[lIlIlIIIll[23]]);
            d = lIlIlIIIll[5];
        }
        if (AccBuilderShamans.lIIIllllllIlI(var1.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[24]]) ? 1 : 0)) {
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
        if (AccBuilderShamans.lIIIllllllIlI(var1.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[28]]) ? 1 : 0) && AccBuilderShamans.lIIIlllllllIl(Players.getLocal().getWorldLocation().distanceTo(F.iJ), lIlIlIIIll[21])) {
            String[] stringArray = new String[lIlIlIIIll[5]];
            stringArray[AccBuilderShamans.lIlIlIIIll[4]] = lIlIlIIIlI[lIlIlIIIll[29]];
            if (AccBuilderShamans.lIIIllllllIII(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[lIlIlIIIll[5]];
                stringArray2[AccBuilderShamans.lIlIlIIIll[4]] = lIlIlIIIlI[lIlIlIIIll[30]];
                TileObjects.getNearest((String[])stringArray2).interact(lIlIlIIIlI[lIlIlIIIll[18]]);
                Time.sleepTicks((int)lIlIlIIIll[11]);

            }
            String[] stringArray3 = new String[lIlIlIIIll[5]];
            stringArray3[AccBuilderShamans.lIlIlIIIll[4]] = lIlIlIIIlI[lIlIlIIIll[31]];
            if (AccBuilderShamans.lIIIllllllIII(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[lIlIlIIIll[5]];
                stringArray4[AccBuilderShamans.lIlIlIIIll[4]] = lIlIlIIIlI[lIlIlIIIll[32]];
                TileObjects.getNearest((String[])stringArray4).interact(lIlIlIIIlI[lIlIlIIIll[33]]);
                Time.sleepTicks((int)lIlIlIIIll[10]);

            }
        }
        if (AccBuilderShamans.lIIIllllllIlI(var1.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[34]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIlIlIIIll[35], lIlIlIIIll[36], lIlIlIIIll[4]));

            Time.sleepTicks((int)lIlIlIIIll[5]);

        }
        if (AccBuilderShamans.lIIIllllllIlI(var1.getMessage().contains(lIlIlIIIlI[lIlIlIIIll[37]]) ? 1 : 0)) {
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

            if (-(0xA8 ^ 0xAD) >= 0) {
                return false;
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

    private static boolean lIIIlllllIllI(Object object, Object object2) {
        return object == object2;
    }

    private static void lIIIlllllIlII() {
        lIlIlIIIlI = new String[lIlIlIIIll[43]];
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[4]] = "https://discord.com/api/webhooks/1215418045011591239/tdzGIffS11EAOaA2FrJCIfdfHHJzCU9iyB8jbYDt2qO4Wsjz0uMej2XbjAY6ALY_Q0w-";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[5]] = "quest";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[9]] = "Disabling GE warning";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[10]] = "Navigating to GE";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[11]] = "Finished account";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[13]] = "\n[Plugin] Plugin starting up\n";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[14]] = "Switching to One Click Shaman account";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[15]] = "hootfighter";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[16]] = "enabled";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[17]] = "\n[Plugin] Plugin shut down\n";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[21]] = "tell the king";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[22]] = "You haven't got enough";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[23]] = "Not enough gold for buying";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[24]] = "Oh dear, you are dead!";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[25]] = "We DIED!! :(";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[26]] = "Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[27]] = "We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[28]] = "can't reach that";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[29]] = "Door";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[30]] = "Door";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[18]] = "Open";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[31]] = "Tree Door";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[32]] = "Tree Door";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[33]] = "Open";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[34]] = "think that facing North";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[37]] = "already some rum";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[39]] = "Drop";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[40]] = "Burning";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[41]] = "Burning";
        AccBuilderShamans.lIlIlIIIlI[AccBuilderShamans.lIlIlIIIll[42]] = AccBuilderShamans.lIIIlllllIIlI("b6woG/CNpSg=", "kAKQG");
    }

    private static boolean lIIIllllllIlI(int n2) {
        return n2 != 0;
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();

        d = lIlIlIIIll[4];
        System.out.print(lIlIlIIIlI[lIlIlIIIll[13]]);
        this.u.add((Overlay)this.v);

        a.clear();
        System.out.println(lIlIlIIIlI[lIlIlIIIll[14]]);
        a.clear();
        s[] sArray = new s[lIlIlIIIll[5]];
        sArray[AccBuilderShamans.lIlIlIIIll[4]] = new SHelper();
        Collections.addAll(a, sArray);

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

                    return lIlIlIIIll[6];
                }
                if (!AccBuilderShamans.lIIIlllllIllI(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderShamans.lIIIllllllIlI(h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.x() ? 1 : 0) && AccBuilderShamans.lIIIlllllIlll(d ? 1 : 0) && AccBuilderShamans.lIIIllllllIll(h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.j(lIlIlIIIll[7]), lIlIlIIIll[8]) && AccBuilderShamans.lIIIlllllIlll(Dialog.isOpen() ? 1 : 0)) {
                    c = lIlIlIIIlI[lIlIlIIIll[9]];
                    h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.y();
                    Time.sleepTicks((int)lIlIlIIIll[5]);

                    if (((0xB4 ^ 0x81) & ~(0x10 ^ 0x25)) != (0x9E ^ 0x9A)) continue;
                    return (0x84 ^ 0x82) & ~(0x3F ^ 0x39);
                }
                int var2 = lIlIlIIIll[4];
                try {
                    var2 = a.get(lIlIlIIIll[4]).ad();

                }
                catch (Exception var3) {
                    var3.printStackTrace();
                }
                if (1 == 0) {
                    return (0x92 ^ 0x8B) & ~(0xD9 ^ 0xC0);
                }
                return var2;
            }
            if (AccBuilderShamans.lIIIllllllIlI(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderShamans.lIIIlllllllII(Players.getLocal().getWorldLocation().distanceTo(Z.ld), lIlIlIIIll[10])) {
                    c = lIlIlIIIlI[lIlIlIIIll[10]];
                    Movement.walkTo((WorldPoint)Z.ld);

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
            AccBuilderShamans var4;
            h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.a(var4.r, "rsn: " + k + " account has been banned? - Acc builder SHAMANS");
            n += lIlIlIIIll[5];
        }
    }

        return String.valueOf(var5);
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block5: {
            AccBuilderShamans var6;
            block6: {
                h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.w();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderShamans.lIIlIIIIIIIIl(player2, player) && AccBuilderShamans.lIIIllllllIlI(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = lIlIlIIIll[5];

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
            if (AccBuilderShamans.lIIIlllllIlll(var6.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
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
        kArray[AccBuilderShamans.lIlIlIIIll[4]] = new ZHelper();
        o = kArray;
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

