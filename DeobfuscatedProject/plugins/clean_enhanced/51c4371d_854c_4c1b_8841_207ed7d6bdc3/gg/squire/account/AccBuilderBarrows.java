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

import gg.squire.account.51c4371d-854c-4c1b-8841-207ed7d6bdc3Manager;
import gg.squire.account.51c4371d-854c-4c1b-8841-207ed7d6bdc3Manager;
import gg.squire.account.51c4371d-854c-4c1b-8841-207ed7d6bdc3Manager;
import gg.squire.account.51c4371d-854c-4c1b-8841-207ed7d6bdc3Manager;
import gg.squire.account.51c4371d-854c-4c1b-8841-207ed7d6bdc3Manager;
import gg.squire.account.51c4371d-854c-4c1b-8841-207ed7d6bdc3Manager;
import com.google.inject.Provides;
import gg.squire.account.BuilderConfig;
import gg.squire.account.GodsApi.overlay.BuilderInfoBox;
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
    private static  int[] llIIlIlI;
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
    private static  String[] llIIlIIl;
     boolean t;
    public static  long g;
    @Inject
    private  Client u;
    public static  int f;

    private static boolean var1(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var2(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var5(int n2, int n3) {
        return n2 <= n3;
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderBarrows.var6(n5, n6) && AccBuilderBarrows.var5(n5, n7)) {
            n4 = llIIlIlI[5];
            0;
            if null != null {
                return ((0x24 ^ 0x31 ^ (0x3A ^ 0x36)) & (0x5B ^ 0xE ^ (0x21 ^ 0x6D) ^ -1)) != 0;
            }
        } else {
            n4 = llIIlIlI[4];
        }
        return n4 != 0;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block5: {
            AccBuilderBarrows var7;
            block6: {
                -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.x();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderBarrows.var1(player2, player) && AccBuilderBarrows.var8(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = llIIlIlI[5];
                        0;
                        if null != null {
                            return ((73 + 56 - -60 + 0 ^ 1 + 167 - 22 + 24) & (0x60 ^ 0x4B ^ (0x2C ^ 0x10) ^ -1)) != 0;
                        }
                    } else {
                        n4 = llIIlIlI[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderBarrows.var9(player3) || AccBuilderBarrows.var10(Game.getWildyLevel()) && !AccBuilderBarrows.var5(Players.getLocal().getWorldLocation().distanceTo(O.jc), llIIlIlI[19])) break block5;
                int[] nArray = new int[llIIlIlI[5]];
                nArray[AccBuilderBarrows.llIIlIlI[4]] = llIIlIlI[20];
                if (!AccBuilderBarrows.var11(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[llIIlIlI[5]];
                nArray2[AccBuilderBarrows.llIIlIlI[4]] = llIIlIlI[21];
                if (!AccBuilderBarrows.var8(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
            }
            if (AccBuilderBarrows.var11(var7.r.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderBarrows.var8(Dialog.isOpen() ? 1 : 0) && AccBuilderBarrows.var9(Dialog.getText()) && AccBuilderBarrows.var8(Dialog.getText().contains(llIIlIIl[llIIlIlI[22]]) ? 1 : 0)) {
            -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.t.cV = llIIlIlI[5];
        }
        -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.H();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var12;
        if (AccBuilderBarrows.var8(chatMessage.getMessage().contains(llIIlIIl[llIIlIlI[23]]) ? 1 : 0)) {
            System.out.println(llIIlIIl[llIIlIlI[24]]);
            d = llIIlIlI[5];
        }
        if (AccBuilderBarrows.var8(var12.getMessage().contains(llIIlIIl[llIIlIlI[25]]) ? 1 : 0)) {
            System.out.println(llIIlIIl[llIIlIlI[26]]);
            if (AccBuilderBarrows.var11(Game.getWildyLevel()) && AccBuilderBarrows.var11(Inventory.contains(item -> item.getName().contains(llIIlIIl[llIIlIlI[42]])) ? 1 : 0)) {
                d = llIIlIlI[5];
                System.out.println(llIIlIIl[llIIlIlI[27]]);
            }
            if (!AccBuilderBarrows.var10(Game.getWildyLevel()) || AccBuilderBarrows.var8(Inventory.contains(item -> item.getName().contains(llIIlIIl[llIIlIlI[41]])) ? 1 : 0)) {
                d = llIIlIlI[4];
                System.out.println(llIIlIIl[llIIlIlI[28]]);
            }
        }
        if (AccBuilderBarrows.var8(var12.getMessage().contains(llIIlIIl[llIIlIlI[29]]) ? 1 : 0) && AccBuilderBarrows.var5(Players.getLocal().getWorldLocation().distanceTo(B.hT), llIIlIlI[18])) {
            String[] stringArray = new String[llIIlIlI[5]];
            stringArray[AccBuilderBarrows.llIIlIlI[4]] = llIIlIIl[llIIlIlI[30]];
            if (AccBuilderBarrows.var9(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[llIIlIlI[5]];
                stringArray2[AccBuilderBarrows.llIIlIlI[4]] = llIIlIIl[llIIlIlI[19]];
                TileObjects.getNearest((String[])stringArray2).interact(llIIlIIl[llIIlIlI[31]]);
                Time.sleepTicks((int)llIIlIlI[11]);
                0;
            }
            String[] stringArray3 = new String[llIIlIlI[5]];
            stringArray3[AccBuilderBarrows.llIIlIlI[4]] = llIIlIIl[llIIlIlI[32]];
            if (AccBuilderBarrows.var9(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[llIIlIlI[5]];
                stringArray4[AccBuilderBarrows.llIIlIlI[4]] = llIIlIIl[llIIlIlI[33]];
                TileObjects.getNearest((String[])stringArray4).interact(llIIlIIl[llIIlIlI[34]]);
                Time.sleepTicks((int)llIIlIlI[10]);
                0;
            }
        }
        if (AccBuilderBarrows.var8(var12.getMessage().contains(llIIlIIl[llIIlIlI[35]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llIIlIlI[36], llIIlIlI[37], llIIlIlI[4]));
            0;
            Time.sleepTicks((int)llIIlIlI[5]);
            0;
        }
        if (AccBuilderBarrows.var8(var12.getMessage().contains(llIIlIIl[llIIlIlI[38]]) ? 1 : 0)) {
            int[] nArray = new int[llIIlIlI[5]];
            nArray[AccBuilderBarrows.llIIlIlI[4]] = llIIlIlI[39];
            if (AccBuilderBarrows.var8(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIlIlI[5]];
                nArray2[AccBuilderBarrows.llIIlIlI[4]] = llIIlIlI[39];
                Inventory.getFirst((int[])nArray2).interact(llIIlIIl[llIIlIlI[40]]);
            }
        }
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderBarrows.var8(configChanged.getGroup().equalsIgnoreCase(llIIlIIl[llIIlIlI[16]]) ? 1 : 0) && AccBuilderBarrows.var8(configChanged.getKey().contains(llIIlIIl[llIIlIlI[17]]) ? 1 : 0)) {
            this.t = this.q.turnScriptOnOff();
            if (AccBuilderBarrows.var8(this.t)) {
                d = llIIlIlI[4];
                0;
                if null != null {
                    return;
                }
            } else {
                d = llIIlIlI[5];
            }
        }
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        d = llIIlIlI[4];
        System.out.print(llIIlIIl[llIIlIlI[13]]);
        this.v.add((Overlay)this.w);
        0;
        a.clear();
        o = llIIlIIl[llIIlIlI[14]];
        System.out.println(llIIlIIl[llIIlIlI[15]]);
        a.clear();
        o[] oArray = new o[llIIlIlI[5]];
        oArray[AccBuilderBarrows.llIIlIlI[4]] = new 51c4371d-854c-4c1b-8841-207ed7d6bdc3Manager();
        Collections.addAll(a, oArray);
        0;
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderBarrows.var13(n2, llIIlIlI[25])) {
            return;
        }
        if (AccBuilderBarrows.var11(n)) {
            AccBuilderBarrows var14;
            -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.a(var14.s, "rsn: " + k + " account has been banned? - Acc builder " + o);
            n += llIIlIlI[5];
        }
    }

    private static boolean var10(int n2) {
        return n2 <= 0;
    }

    private static boolean var6(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var15(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var13(int n2, int n3) {
        return n2 != n3;
    }

    protected int loop() {
        block10: {
            block11: {
                if (!AccBuilderBarrows.var2(Game.getState(), GameState.LOGGED_IN)) break block10;
                if (!AccBuilderBarrows.var11(a.isEmpty() ? 1 : 0)) break block11;
                if (!AccBuilderBarrows.var9(j) || AccBuilderBarrows.var18(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderBarrows.var8(a.get(llIIlIlI[4]).W() ? 1 : 0)) {
                    if (AccBuilderBarrows.var8(a.get(llIIlIlI[4]).V().contains(llIIlIIl[llIIlIlI[5]]) ? 1 : 0)) {
                        f += llIIlIlI[5];
                    }
                    System.out.println("Achieved " + a.get(llIIlIlI[4]).V() + " goal");
                    a.remove(llIIlIlI[4]);
                    0;
                    return llIIlIlI[6];
                }
                if (!AccBuilderBarrows.var2(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderBarrows.var8(-.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.y() ? 1 : 0) && AccBuilderBarrows.var11(d) && AccBuilderBarrows.var4(-.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.j(llIIlIlI[7]), llIIlIlI[8]) && AccBuilderBarrows.var11(Dialog.isOpen() ? 1 : 0)) {
                    c = llIIlIIl[llIIlIlI[9]];
                    -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e.z();
                    Time.sleepTicks((int)llIIlIlI[5]);
                    0;
                    0;
                    if (-1 < ((0x96 ^ 0x83 ^ (0x68 ^ 0x1E)) & (0x6C ^ 0x2B ^ (0x33 ^ 0x17) ^ -1))) continue;
                    return (0x33 ^ 0x58 ^ (0x39 ^ 0xE)) & (3 ^ 0x37 ^ (0x22 ^ 0x4A) ^ -1);
                }
                int var19 = llIIlIlI[4];
                try {
                    var19 = a.get(llIIlIlI[4]).U();
                    0;
                }
                catch (Exception var20) {
                    var20.printStackTrace();
                }
                if null != null {
                    return (119 + 92 - 114 + 41 ^ 169 + 26 - 67 + 59) & (0x32 ^ 0x40 ^ (0x5C ^ 0x1F) ^ -1);
                }
                return var19;
            }
            if (AccBuilderBarrows.var8(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderBarrows.var15(Players.getLocal().getWorldLocation().distanceTo(Q.js), llIIlIlI[10])) {
                    c = llIIlIIl[llIIlIlI[10]];
                    Movement.walkTo((WorldPoint)Q.js);
                    0;
                }
                if (AccBuilderBarrows.var5(Players.getLocal().getWorldLocation().distanceTo(Q.js), llIIlIlI[10])) {
                    c = llIIlIIl[llIIlIlI[11]];
                }
            }
        }
        return llIIlIlI[12];
    }

    protected void shutDown() {
        this.v.remove((Overlay)this.w);
        0;
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

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    private static String var27(String var28, String var29) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var31 = var29.toCharArray();
        int var32 = llIIlIlI[4];
        char[] var33 = var28.toCharArray();
        int var34 = var33.length;
        int var35 = llIIlIlI[4];
        while (AccBuilderBarrows.var3(var35, var34)) {
            char var36 = var33[var35];
            var30.append((char)(var36 ^ var31[var32 % var31.length]));
            0;
            ++var32;
            ++var35;
            0;
            if (-1 != (8 ^ 0xC)) continue;
            return null;
        }
        return String.valueOf(var30);
    }

    private static void var16() {
        llIIlIlI = new int[45];
        AccBuilderBarrows.llIIlIlI[0] = 0xFFFFBC77 & 0x4FAF;
        AccBuilderBarrows.llIIlIlI[1] = 0xFFFF9F3A & 0x6ED5;
        AccBuilderBarrows.llIIlIlI[2] = 0x3B ^ 0x66 ^ (0x56 ^ 0x35);
        AccBuilderBarrows.llIIlIlI[3] = 0x8B ^ 0xBE;
        AccBuilderBarrows.llIIlIlI[4] = (65 + 183 - 74 + 29 ^ 85 + 195 - 200 + 116) & (8 + 3 - -88 + 69 ^ 17 + 138 - 114 + 126 ^ -1);
        AccBuilderBarrows.llIIlIlI[5] = 1;
        AccBuilderBarrows.llIIlIlI[6] = 0x90 ^ 0xA0 ^ (0xF1 ^ 0xA5);
        AccBuilderBarrows.llIIlIlI[7] = -(0xFFFFF7CF & 0x7EF3) & (0xFFFFFFDF & 0x77FB);
        AccBuilderBarrows.llIIlIlI[8] = 0xFFFFCBEF & 0x37F8;
        AccBuilderBarrows.llIIlIlI[9] = 2;
        AccBuilderBarrows.llIIlIlI[10] = 3;
        AccBuilderBarrows.llIIlIlI[11] = 121 + 74 - 50 + 13 ^ 55 + 29 - -51 + 19;
        AccBuilderBarrows.llIIlIlI[12] = 0xFFFFCBFE & 0x3659;
        AccBuilderBarrows.llIIlIlI[13] = 0x44 ^ 0x41;
        AccBuilderBarrows.llIIlIlI[14] = 0x69 ^ 0x1E ^ (0x21 ^ 0x50);
        AccBuilderBarrows.llIIlIlI[15] = 0x26 ^ 0x21;
        AccBuilderBarrows.llIIlIlI[16] = 0x78 ^ 0x76 ^ (0x1B ^ 0x1D);
        AccBuilderBarrows.llIIlIlI[17] = 22 + 121 - 135 + 131 ^ 96 + 107 - 104 + 31;
        AccBuilderBarrows.llIIlIlI[18] = 0x25 ^ 0x2F;
        AccBuilderBarrows.llIIlIlI[19] = 0x3B ^ 0x1E ^ (0x14 ^ 0x25);
        AccBuilderBarrows.llIIlIlI[20] = -(0xFFFFEFF8 & 0x75EF) & (0xFFFFEFFF & 0x77FF);
        AccBuilderBarrows.llIIlIlI[21] = -(0xFFFFF7EF & 0x7DD3) & (0xFFFFF7DF & 0x7FFB);
        AccBuilderBarrows.llIIlIlI[22] = 0x1A ^ 0x39 ^ (0 ^ 0x28);
        AccBuilderBarrows.llIIlIlI[23] = 41 + 23 - -26 + 95 ^ 115 + 3 - 19 + 82;
        AccBuilderBarrows.llIIlIlI[24] = 1 ^ 0x4C ^ (0x6B ^ 0x2B);
        AccBuilderBarrows.llIIlIlI[25] = 10 + 28 - -67 + 37 ^ 95 + 19 - 113 + 127;
        AccBuilderBarrows.llIIlIlI[26] = 0x97 ^ 0xA4 ^ (0x68 ^ 0x54);
        AccBuilderBarrows.llIIlIlI[27] = 0x25 ^ 0x7D ^ (0xF7 ^ 0xBF);
        AccBuilderBarrows.llIIlIlI[28] = 0x6A ^ 0x7B;
        AccBuilderBarrows.llIIlIlI[29] = 2 ^ 0x10;
        AccBuilderBarrows.llIIlIlI[30] = 0x38 ^ 1 ^ (0xA6 ^ 0x8C);
        AccBuilderBarrows.llIIlIlI[31] = 0x85 ^ 0x80 ^ (0x5E ^ 0x4E);
        AccBuilderBarrows.llIIlIlI[32] = 21 + 97 - 23 + 43 ^ 98 + 97 - 157 + 118;
        AccBuilderBarrows.llIIlIlI[33] = 0x72 ^ 0x2C ^ (0xD4 ^ 0x9D);
        AccBuilderBarrows.llIIlIlI[34] = 18 + 100 - -63 + 5 ^ 12 + 7 - -41 + 102;
        AccBuilderBarrows.llIIlIlI[35] = 0xF6 ^ 0xAD ^ (0x1F ^ 0x5D);
        AccBuilderBarrows.llIIlIlI[36] = 0xFFFF8BA3 & 0x7FFD;
        AccBuilderBarrows.llIIlIlI[37] = -(0xFFFFEED3 & 0x517D) & (0xFFFFFCFF & 0x4FF7);
        AccBuilderBarrows.llIIlIlI[38] = 0x81 ^ 0x9B;
        AccBuilderBarrows.llIIlIlI[39] = 0xFFFFA1FF & 0x5FAF;
        AccBuilderBarrows.llIIlIlI[40] = 0xB2 ^ 0xA9;
        AccBuilderBarrows.llIIlIlI[41] = 0x7D ^ 0x61;
        AccBuilderBarrows.llIIlIlI[42] = 40 + 121 - 84 + 101 ^ 18 + 118 - 132 + 171;
        AccBuilderBarrows.llIIlIlI[43] = 0x3E ^ 2 ^ (0x54 ^ 0x76);
        AccBuilderBarrows.llIIlIlI[44] = 0x80 ^ 0x9F;
    }

    private static boolean var18(Object object) {
        return object == null;
    }

        catch (Exception var42) {
            var42.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    private static void var17() {
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
        AccBuilderBarrows.llIIlIIl[AccBuilderBarrows.llIIlIlI[43]] = AccBuilderBarrows.var37("BR50vLs4nP0=", "CVtTJ");
    }
}

