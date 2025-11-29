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
import gg.squire.account.3047f210-3107-4c67-939d-3c9e588029aeManager;
import gg.squire.account.3047f210-3107-4c67-939d-3c9e588029aeManager;
import gg.squire.account.3047f210-3107-4c67-939d-3c9e588029aeManager;
import gg.squire.account.3047f210-3107-4c67-939d-3c9e588029aeManager;
import gg.squire.account.3047f210-3107-4c67-939d-3c9e588029aeManager;
import gg.squire.account.3047f210-3107-4c67-939d-3c9e588029aeManager;
import gg.squire.account.MHelper;
import gg.squire.account.3047f210-3107-4c67-939d-3c9e588029aeManager;
import gg.squire.account.BuilderConfig;
import gg.squire.account.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
            AccBuilderTempleTrek var3;
            block6: {
                e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.w();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if ((player2 != player22) && (this.a(n2, n3, Playerplayer2) ? 1 : 0)) {
                        n4 = 5;
                        0;
                        if (2 <= 0) {
                            return ((0x1A ^ 0x5E) & ~(0xE0 ^ 0xA4)) != 0;
                        }
                    } else {
                        n4 = 4;
                    }
                    return n4 != 0;
                });
                if (!player3 != null || (Game.getWildyLevel( <= 0)) && !(Players.getLocal().getWorldLocation().distanceTo(aa.ju) <= var1[18])) break block5;
                int[] nArray = new int[5];
                nArray[4] = var1[19];
                if (!(Inventory.contains((int[] == 0)nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[5];
                nArray2[4] = var1[20];
                if (!(Inventory.contains((int[] != 0)nArray2) ? 1 : 0)) break block5;
            }
            if ((var3.q.contains(Players.getLocal( == 0).getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if ((Dialog.isOpen( != 0) ? 1 : 0) && (Dialog.getText( != null)) && (Dialog.getText( != 0).contains(var2[var1[21]]) ? 1 : 0)) {
            e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.s.dq = 5;
        }
        e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.G();
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (n2 != var1[25]) {
            return;
        }
        if (n == 0) {
            AccBuilderTempleTrek var4;
            e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.a(var4.r, "rsn: " + k + " account has been banned? - Acc builder");
            n += 5;
        }
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if ((configChanged.getGroup( != 0).equalsIgnoreCase(var2[var1[15]]) ? 1 : 0) && (configChanged.getKey( != 0).contains(var2[var1[16]]) ? 1 : 0)) {
            this.s = this.p.turnScriptOnOff();
            if (this.s != 0) {
                d = 4;
                0;
                if ((0x68 ^ 0x6D) <= 0) {
                    return;
                }
            } else {
                d = 5;
            }
        }
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var17;
        if ((chatMessage.getMessage( != 0).contains(var2[var1[22]]) ? 1 : 0)) {
            System.out.println(var2[var1[23]]);
            d = 5;
        }
        if ((var17.getMessage( != 0).contains(var2[var1[24]]) ? 1 : 0)) {
            System.out.println(var2[var1[25]]);
            if ((Game.getWildyLevel( == 0)) && (Inventory.contains(item -> item.getName( == 0).contains(var2[var1[42]])) ? 1 : 0)) {
                d = 5;
                System.out.println(var2[var1[26]]);
            }
            if (!(Game.getWildyLevel( <= 0)) || (Inventory.contains(item -> item.getName( != 0).contains(var2[var1[41]])) ? 1 : 0)) {
                d = 4;
                System.out.println(var2[var1[27]]);
            }
        }
        if ((var17.getMessage( != 0).contains(var2[var1[28]]) ? 1 : 0) && (Players.getLocal().getWorldLocation().distanceTo(N.ig) <= var1[21])) {
            e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.v();
        }
        if ((var17.getMessage( != 0).contains(var2[var1[29]]) ? 1 : 0) && (!(Players.getLocal().getWorldLocation().distanceTo(H.ht) > var1[15]) || (Players.getLocal().getWorldLocation().distanceTo(E.gY) <= var1[21]))) {
            String[] stringArray = new String[5];
            stringArray[4] = var2[var1[30]];
            if ((TileObjects.getNearest((String[] != nustringArray))) {
                String[] stringArray2 = new String[5];
                stringArray2[4] = var2[var1[18]];
                TileObjects.getNearest((String[])stringArray2).interact(var2[var1[31]]);
                Time.sleepTicks((int)var1[11]);
                0;
            }
            String[] stringArray3 = new String[5];
            stringArray3[4] = var2[var1[32]];
            if ((TileObjects.getNearest((String[] != nustringArray3))) {
                String[] stringArray4 = new String[5];
                stringArray4[4] = var2[var1[33]];
                TileObjects.getNearest((String[])stringArray4).interact(var2[var1[34]]);
                Time.sleepTicks((int)var1[10]);
                0;
            }
        }
        if ((var17.getMessage( != 0).contains(var2[var1[35]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(var1[36], var1[37], 4));
            0;
            Time.sleepTicks((int)5);
            0;
        }
        if ((var17.getMessage( != 0).contains(var2[var1[38]]) ? 1 : 0)) {
            int[] nArray = new int[5];
            nArray[4] = var1[39];
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                int[] nArray2 = new int[5];
                nArray2[4] = var1[39];
                Inventory.getFirst((int[])nArray2).interact(var2[var1[40]]);
            }
        }
    }

    protected void shutDown() {
        this.u.remove((Overlay)this.v);
        0;
        d = 5;
        o = new S[4];
        n = 4;
        f = 4;
        System.out.print(var2[var1[17]]);
        super.stop();
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        d = 4;
        System.out.print(var2[var1[13]]);
        this.u.add((Overlay)this.v);
        0;
        a.clear();
        System.out.println(var2[var1[14]]);
        a.clear();
        m[] mArray = new m[5];
        mArray[4] = new MHelper();
        Collections.addAll(a, mArray);
        0;
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    static {
        AccBuilderTempleTrek.var18();
        AccBuilderTempleTrek.var19();
        a = new ArrayList<S>();
        b = System.currentTimeMillis();
        d = 4;
        g = System.currentTimeMillis();
        h = var2[var1[43]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        S[] sArray = new S[5];
        sArray[4] = new 3047f210-3107-4c67-939d-3c9e588029aeManager();
        o = sArray;
    }

    protected int loop() {
        block10: {
            block11: {
                if (!(Game.getState() == Game.getState()2)) break block10;
                if (!(a.isEmpty( == 0) ? 1 : 0)) break block11;
                if (!j != null || k == null) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if ((a.get4.V() ? 1 : 0)) {
                    if ((a.get4.U().contains(var2[5]) ? 1 : 0)) {
                        f += 5;
                    }
                    System.out.println("Achieved " + a.get(4).U() + " goal");
                    a.remove(4);
                    0;
                    return 6;
                }
                if (!(Game.getState() == Game.getState()2)) break block11;
                while ((e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.x( != 0) ? 1 : 0) && (d == 0) && (e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.j(7) == 8) && (Dialog.isOpen( == 0) ? 1 : 0)) {
                    c = var2[9];
                    e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e.y();
                    Time.sleepTicks((int)5);
                    0;
                    0;
                    if (1 < 2) continue;
                    return (0xA6 ^ 0x96 ^ (0x62 ^ 1)) & (3 ^ (0x32 ^ 0x62) ^ -1);
                }
                int var20 = 4;
                try {
                    var20 = a.get(4).T();
                    0;
                }
                catch (Exception var21) {
                    var21.printStackTrace();
                }
                if null != null {
                    return (0xE8 ^ 0xBC) & ~(0x63 ^ 0x37);
                }
                return var20;
            }
            if ((a.isEmpty( != 0) ? 1 : 0)) {
                if ((Players.getLocal().getWorldLocation().distanceTo(ac.jR) > var1[10])) {
                    c = var2[var1[10]];
                    Movement.walkTo((WorldPoint)ac.jR);
                    0;
                }
                if ((Players.getLocal().getWorldLocation().distanceTo(ac.jR) <= var1[10])) {
                    c = var2[var1[11]];
                }
            }
        }
        return var1[12];
    }

    public AccBuilderTempleTrek() {
        this.q = new WorldArea(0, 1, 2, 3, 4);
        this.r = var2[4];
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if ((n5 >= n6) && (n5 <= n7)) {
            n4 = 5;
            0;
            if null != null {
                return ((0x37 ^ 0x22 ^ (0xD6 ^ 0xC6)) & (124 + 18 - 46 + 39 ^ 73 + 50 - 91 + 98 ^ -1)) != 0;
            }
        } else {
            n4 = 4;
        }
        return n4 != 0;
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = 4;
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = 4;
        while (var30 < var29) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if (((0x1D ^ 0x29 ^ (0xA6 ^ 0xAA) & ~(0x4E ^ 0x42)) & (0xB3 ^ 0xBF ^ (0x65 ^ 0x5D) ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(var25);
    }
}

