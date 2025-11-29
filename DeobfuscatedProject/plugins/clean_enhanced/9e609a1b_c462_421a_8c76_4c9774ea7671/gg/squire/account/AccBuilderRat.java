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
import gg.squire.account.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
import gg.squire.account.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
import gg.squire.account.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
import gg.squire.account.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
import gg.squire.account.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
import gg.squire.account.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
import gg.squire.account.9e609a1b-c462-421a-8c76-4c9774ea7671Manager;
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

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    public AccBuilderRat() {
        this.q = new WorldArea(var2[0], var2[1], var2[2], var2[3], var2[4]);
        this.r = var1[var2[4]];
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderRat.var6(n5, n6) && AccBuilderRat.var7(n5, n7)) {
            n4 = var2[5];
            0;
            if ((0x4B ^ 0xD ^ (0x33 ^ 0x71)) == 1) {
                return ((214 + 120 - 250 + 146 ^ 119 + 50 - 22 + 27) & (233 + 74 - 294 + 232 ^ 165 + 40 - 181 + 165 ^ -1)) != 0;
            }
        } else {
            n4 = var2[4];
        }
        return n4 != 0;
    }

    private static boolean var8(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var6(int n2, int n3) {
        return n2 >= n3;
    }

    protected int loop() {
        block10: {
            block11: {
                if (!AccBuilderRat.var9(Game.getState(), GameState.LOGGED_IN)) break block10;
                if (!AccBuilderRat.var4(a.isEmpty() ? 1 : 0)) break block11;
                if (!AccBuilderRat.var10(j) || AccBuilderRat.var11(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderRat.var12(a.get(var2[4]).aa() ? 1 : 0)) {
                    if (AccBuilderRat.var12(a.get(var2[4]).Z().contains(var1[var2[5]]) ? 1 : 0)) {
                        f += var2[5];
                    }
                    System.out.println("Achieved " + a.get(var2[4]).Z() + " goal");
                    a.remove(var2[4]);
                    0;
                    return var2[6];
                }
                if (!AccBuilderRat.var9(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderRat.var12(i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.y() ? 1 : 0) && AccBuilderRat.var4(d) && AccBuilderRat.var13(i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.j(var2[7]), var2[8]) && AccBuilderRat.var4(Dialog.isOpen() ? 1 : 0)) {
                    c = var1[var2[9]];
                    i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.z();
                    Time.sleepTicks((int)var2[5]);
                    0;
                    0;
                    if (1 < 3) continue;
                    return (0x1C ^ 0x43) & ~(0xEA ^ 0xB5);
                }
                int var14 = var2[4];
                try {
                    var14 = a.get(var2[4]).Y();
                    0;
                }
                catch (Exception var15) {
                    var15.printStackTrace();
                }
                if (1 < ((0x54 ^ 0x6F) & ~(0x44 ^ 0x7F))) {
                    return (0x1C ^ 0x4D) & ~(0x25 ^ 0x74);
                }
                return var14;
            }
            if (AccBuilderRat.var12(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderRat.var16(Players.getLocal().getWorldLocation().distanceTo(P.it), var2[10])) {
                    c = var1[var2[10]];
                    Movement.walkTo((WorldPoint)P.it);
                    0;
                }
                if (AccBuilderRat.var7(Players.getLocal().getWorldLocation().distanceTo(P.it), var2[10])) {
                    c = var1[var2[11]];
                }
            }
        }
        return var2[12];
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderRat.var12(configChanged.getGroup().equalsIgnoreCase(var1[var2[15]]) ? 1 : 0) && AccBuilderRat.var12(configChanged.getKey().contains(var1[var2[16]]) ? 1 : 0)) {
            this.s = this.p.turnScriptOnOff();
            if (AccBuilderRat.var12(this.s)) {
                d = var2[4];
                0;
                if null != null {
                    return;
                }
            } else {
                d = var2[5];
            }
        }
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var23(int n2) {
        return n2 <= 0;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderRat.var8(n2, var2[25])) {
            return;
        }
        if (AccBuilderRat.var4(n)) {
            AccBuilderRat var24;
            i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.a(var24.r, "rsn: " + k + " account has been banned? - Acc builder");
            n += var2[5];
        }
    }

    protected void shutDown() {
        this.u.remove((Overlay)this.v);
        0;
        d = var2[5];
        o = new M[var2[4]];
        n = var2[4];
        f = var2[4];
        System.out.print(var1[var2[17]]);
        super.stop();
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var31;
        if (AccBuilderRat.var12(chatMessage.getMessage().contains(var1[var2[21]]) ? 1 : 0)) {
            System.out.println(var1[var2[22]]);
            d = var2[5];
        }
        if (AccBuilderRat.var12(var31.getMessage().contains(var1[var2[23]]) ? 1 : 0)) {
            System.out.println(var1[var2[24]]);
            if (AccBuilderRat.var4(Game.getWildyLevel()) && AccBuilderRat.var4(Inventory.contains(item -> item.getName().contains(var1[var2[41]])) ? 1 : 0)) {
                d = var2[5];
                System.out.println(var1[var2[25]]);
            }
            if (!AccBuilderRat.var23(Game.getWildyLevel()) || AccBuilderRat.var12(Inventory.contains(item -> item.getName().contains(var1[var2[40]])) ? 1 : 0)) {
                d = var2[4];
                System.out.println(var1[var2[26]]);
            }
        }
        if (AccBuilderRat.var12(var31.getMessage().contains(var1[var2[27]]) ? 1 : 0) && AccBuilderRat.var7(Players.getLocal().getWorldLocation().distanceTo(H.hs), var2[21])) {
            i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.w();
        }
        if (AccBuilderRat.var12(var31.getMessage().contains(var1[var2[28]]) ? 1 : 0) && (!AccBuilderRat.var16(Players.getLocal().getWorldLocation().distanceTo(A.gr), var2[15]) || AccBuilderRat.var7(Players.getLocal().getWorldLocation().distanceTo(x.fW), var2[21]))) {
            String[] stringArray = new String[var2[5]];
            stringArray[AccBuilderRat.var2[4]] = var1[var2[29]];
            if (AccBuilderRat.var10(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[var2[5]];
                stringArray2[AccBuilderRat.var2[4]] = var1[var2[30]];
                TileObjects.getNearest((String[])stringArray2).interact(var1[var2[18]]);
                Time.sleepTicks((int)var2[11]);
                0;
            }
            String[] stringArray3 = new String[var2[5]];
            stringArray3[AccBuilderRat.var2[4]] = var1[var2[31]];
            if (AccBuilderRat.var10(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[var2[5]];
                stringArray4[AccBuilderRat.var2[4]] = var1[var2[32]];
                TileObjects.getNearest((String[])stringArray4).interact(var1[var2[33]]);
                Time.sleepTicks((int)var2[10]);
                0;
            }
        }
        if (AccBuilderRat.var12(var31.getMessage().contains(var1[var2[34]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(var2[35], var2[36], var2[4]));
            0;
            Time.sleepTicks((int)var2[5]);
            0;
        }
        if (AccBuilderRat.var12(var31.getMessage().contains(var1[var2[37]]) ? 1 : 0)) {
            int[] nArray = new int[var2[5]];
            nArray[AccBuilderRat.var2[4]] = var2[38];
            if (AccBuilderRat.var12(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[var2[5]];
                nArray2[AccBuilderRat.var2[4]] = var2[38];
                Inventory.getFirst((int[])nArray2).interact(var1[var2[39]]);
            }
        }
    }

    private static void var32() {
        var1 = new String[var2[43]];
        AccBuilderRat.var1[AccBuilderRat.var2[4]] = "https://discord.com/api/webhooks/1193421866459725834/O4zTPyFZMm83vMwkEnq6zlsGdAzLR4AGiJhhz0hFc0JZsJzMFQ-ivS8oiytVIzgMDJhM";
        AccBuilderRat.var1[AccBuilderRat.var2[5]] = "quest";
        AccBuilderRat.var1[AccBuilderRat.var2[9]] = "Disabling GE warning";
        AccBuilderRat.var1[AccBuilderRat.var2[10]] = "Navigating to GE";
        AccBuilderRat.var1[AccBuilderRat.var2[11]] = "Finished account";
        AccBuilderRat.var1[AccBuilderRat.var2[13]] = "\n[Plugin] Plugin starting up\n";
        AccBuilderRat.var1[AccBuilderRat.var2[14]] = "Switching to One Click F2P";
        AccBuilderRat.var1[AccBuilderRat.var2[15]] = "hootfighter";
        AccBuilderRat.var1[AccBuilderRat.var2[16]] = "enabled";
        AccBuilderRat.var1[AccBuilderRat.var2[17]] = "\n[Plugin] Plugin shut down\n";
        AccBuilderRat.var1[AccBuilderRat.var2[21]] = "You haven't got enough";
        AccBuilderRat.var1[AccBuilderRat.var2[22]] = "Not enough gold for buying";
        AccBuilderRat.var1[AccBuilderRat.var2[23]] = "Oh dear, you are dead!";
        AccBuilderRat.var1[AccBuilderRat.var2[24]] = "We DIED!! :(";
        AccBuilderRat.var1[AccBuilderRat.var2[25]] = "Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderRat.var1[AccBuilderRat.var2[26]] = "We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderRat.var1[AccBuilderRat.var2[27]] = "can't reach that";
        AccBuilderRat.var1[AccBuilderRat.var2[28]] = "can't reach that";
        AccBuilderRat.var1[AccBuilderRat.var2[29]] = "Door";
        AccBuilderRat.var1[AccBuilderRat.var2[30]] = "Door";
        AccBuilderRat.var1[AccBuilderRat.var2[18]] = "Open";
        AccBuilderRat.var1[AccBuilderRat.var2[31]] = "Tree Door";
        AccBuilderRat.var1[AccBuilderRat.var2[32]] = "Tree Door";
        AccBuilderRat.var1[AccBuilderRat.var2[33]] = "Open";
        AccBuilderRat.var1[AccBuilderRat.var2[34]] = "think that facing North";
        AccBuilderRat.var1[AccBuilderRat.var2[37]] = "already some rum";
        AccBuilderRat.var1[AccBuilderRat.var2[39]] = "Drop";
        AccBuilderRat.var1[AccBuilderRat.var2[40]] = "Burning";
        AccBuilderRat.var1[AccBuilderRat.var2[41]] = "Burning";
        AccBuilderRat.var1[AccBuilderRat.var2[42]] = AccBuilderRat.var33("", "uqmOE");
    }

    static {
        AccBuilderRat.var34();
        AccBuilderRat.var32();
        a = new ArrayList<M>();
        b = System.currentTimeMillis();
        d = var2[4];
        g = System.currentTimeMillis();
        h = var1[var2[42]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        M[] mArray = new M[var2[5]];
        mArray[AccBuilderRat.var2[4]] = new 9e609a1b-c462-421a-8c76-4c9774ea7671Manager();
        o = mArray;
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block5: {
            AccBuilderRat var35;
            block6: {
                i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.x();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderRat.var3(player2, player) && AccBuilderRat.var12(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = var2[5];
                        0;
                        if ((133 + 72 - 121 + 65 ^ 39 + 96 - 47 + 57) != (0xEE ^ 0xBB ^ (0x4D ^ 0x1C))) {
                            return ((85 + 198 - 206 + 135 ^ 174 + 149 - 210 + 80) & (140 + 148 - 275 + 161 ^ 25 + 39 - -50 + 73 ^ -1)) != 0;
                        }
                    } else {
                        n4 = var2[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderRat.var10(player3) || AccBuilderRat.var23(Game.getWildyLevel()) && !AccBuilderRat.var7(Players.getLocal().getWorldLocation().distanceTo(O.in), var2[18])) break block5;
                int[] nArray = new int[var2[5]];
                nArray[AccBuilderRat.var2[4]] = var2[19];
                if (!AccBuilderRat.var4(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[var2[5]];
                nArray2[AccBuilderRat.var2[4]] = var2[20];
                if (!AccBuilderRat.var12(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
            }
            if (AccBuilderRat.var4(var35.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderRat.var12(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e.H();
    }

    private static boolean var16(int n2, int n3) {
        return n2 > n3;
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    private static boolean var13(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static boolean var9(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static String var33(String var36, String var37) {
        var36 = new String(Base64.getDecoder().decode(var36.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var38 = new StringBuilder();
        char[] var39 = var37.toCharArray();
        int var40 = var2[4];
        char[] var41 = var36.toCharArray();
        int var42 = var41.length;
        int var43 = var2[4];
        while (AccBuilderRat.var5(var43, var42)) {
            char var44 = var41[var43];
            var38.append((char)(var44 ^ var39[var40 % var39.length]));
            0;
            ++var40;
            ++var43;
            0;
            if (2 <= 3) continue;
            return null;
        }
        return String.valueOf(var38);
    }

    private static boolean var7(int n2, int n3) {
        return n2 <= n3;
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        d = var2[4];
        System.out.print(var1[var2[13]]);
        this.u.add((Overlay)this.v);
        0;
        a.clear();
        System.out.println(var1[var2[14]]);
        a.clear();
        k[] kArray = new k[var2[5]];
        kArray[AccBuilderRat.var2[4]] = new 9e609a1b-c462-421a-8c76-4c9774ea7671Manager();
        Collections.addAll(a, kArray);
        0;
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    private static void var34() {
        var2 = new int[44];
        AccBuilderRat.var2[0] = -(0xFFFF8BDB & 0x75E5) & (0xFFFF8FE7 & 0x7DFF);
        AccBuilderRat.var2[1] = 0xFFFFEFD7 & 0x1E38;
        AccBuilderRat.var2[2] = 0x6B ^ 0x55;
        AccBuilderRat.var2[3] = 0x23 ^ 6 ^ (0x81 ^ 0x91);
        AccBuilderRat.var2[4] = (86 + 59 - -43 + 39 ^ 10 + 122 - 8 + 62) & (159 + 132 - 125 + 33 ^ 134 + 41 - 111 + 94 ^ -1);
        AccBuilderRat.var2[5] = 1;
        AccBuilderRat.var2[6] = 0xF9 ^ 0x9D;
        AccBuilderRat.var2[7] = -(0xFFFFF7EF & 0x7ED5) & (0xFFFFF7FF & 0x7FDD);
        AccBuilderRat.var2[8] = -(0xFFFFFC07 & Short.MAX_VALUE) & (0xFFFFFFEE & Short.MAX_VALUE);
        AccBuilderRat.var2[9] = 2;
        AccBuilderRat.var2[10] = 3;
        AccBuilderRat.var2[11] = 0xDA ^ 0x9B ^ (0x25 ^ 0x60);
        AccBuilderRat.var2[12] = -(0xFFFFFF37 & 0x49EC) & (0xFFFFEF7B & 0x5BFF);
        AccBuilderRat.var2[13] = 0xA1 ^ 0xA4;
        AccBuilderRat.var2[14] = 0x2E ^ 6 ^ (0x1E ^ 0x30);
        AccBuilderRat.var2[15] = 0x1E ^ 0x19;
        AccBuilderRat.var2[16] = 0x78 ^ 0x70;
        AccBuilderRat.var2[17] = 0x24 ^ 0x49 ^ (0xC4 ^ 0xA0);
        AccBuilderRat.var2[18] = 0x88 ^ 0x9C;
        AccBuilderRat.var2[19] = -(0xFFFFF1B9 & 0x2FCE) & (0xFFFFB7BF & 0x6BDF);
        AccBuilderRat.var2[20] = -(0xFFFFF5D7 & 0x7B2F) & (0xFFFFF3BF & 0x7F5F);
        AccBuilderRat.var2[21] = 0x6B ^ 0x58 ^ (0xB4 ^ 0x8D);
        AccBuilderRat.var2[22] = 68 + 7 - 63 + 130 ^ 69 + 46 - 102 + 120;
        AccBuilderRat.var2[23] = 0x2E ^ 0x22;
        AccBuilderRat.var2[24] = 62 + 60 - 14 + 61 ^ 82 + 19 - -17 + 46;
        AccBuilderRat.var2[25] = 0xB4 ^ 0xBA;
        AccBuilderRat.var2[26] = 0xCC ^ 0xC3;
        AccBuilderRat.var2[27] = 0x4B ^ 0x5B;
        AccBuilderRat.var2[28] = 49 + 3 - 29 + 108 ^ 106 + 39 - 105 + 106;
        AccBuilderRat.var2[29] = 0x87 ^ 0x8F ^ (0x73 ^ 0x69);
        AccBuilderRat.var2[30] = 0x5B ^ 0x76 ^ (0x75 ^ 0x4B);
        AccBuilderRat.var2[31] = 8 ^ 0x4F ^ (0x7E ^ 0x2C);
        AccBuilderRat.var2[32] = 0xF7 ^ 0xAA ^ (0x4D ^ 6);
        AccBuilderRat.var2[33] = 0x28 ^ 0x3F;
        AccBuilderRat.var2[34] = 100 + 66 - 48 + 10 ^ 127 + 94 - 162 + 93;
        AccBuilderRat.var2[35] = -(0xFFFFF1DF & 0x1E7F) & (0xFFFFDFFF & 0x3BFF);
        AccBuilderRat.var2[36] = 0xFFFFAEA7 & 0x5DFF;
        AccBuilderRat.var2[37] = 0x2F ^ 5 ^ (0xAC ^ 0x9F);
        AccBuilderRat.var2[38] = -(0xFFFFBF55 & 0x5AFB) & (0xFFFF9BFF & Short.MAX_VALUE);
        AccBuilderRat.var2[39] = 0x56 ^ 0x4C;
        AccBuilderRat.var2[40] = 0xA8 ^ 0xB3;
        AccBuilderRat.var2[41] = 1 ^ 0x6E ^ (0x1F ^ 0x6C);
        AccBuilderRat.var2[42] = 0x77 ^ 0x6A;
        AccBuilderRat.var2[43] = 0x7E ^ 0x3C ^ (0x5D ^ 1);
    }
}

