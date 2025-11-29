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
import gg.squire.account.57051692-5fea-40a8-a012-903ac1ab23acManager;
import gg.squire.account.57051692-5fea-40a8-a012-903ac1ab23acManager;
import gg.squire.account.57051692-5fea-40a8-a012-903ac1ab23acManager;
import gg.squire.account.57051692-5fea-40a8-a012-903ac1ab23acManager;
import gg.squire.account.57051692-5fea-40a8-a012-903ac1ab23acManager;
import gg.squire.account.57051692-5fea-40a8-a012-903ac1ab23acManager;
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

    private static boolean var3(int n2) {
        return n2 <= 0;
    }

    private static boolean var4(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var5;
        if (AccBuilderShamans.var6(chatMessage.getMessage().contains(var2[var1[22]]) ? 1 : 0)) {
            System.out.println(var2[var1[23]]);
            d = var1[5];
        }
        if (AccBuilderShamans.var6(var5.getMessage().contains(var2[var1[24]]) ? 1 : 0)) {
            System.out.println(var2[var1[25]]);
            if (AccBuilderShamans.var7(Game.getWildyLevel()) && AccBuilderShamans.var7(Inventory.contains(item -> item.getName().contains(var2[var1[41]])) ? 1 : 0)) {
                d = var1[5];
                System.out.println(var2[var1[26]]);
            }
            if (!AccBuilderShamans.var3(Game.getWildyLevel()) || AccBuilderShamans.var6(Inventory.contains(item -> item.getName().contains(var2[var1[40]])) ? 1 : 0)) {
                d = var1[4];
                System.out.println(var2[var1[27]]);
            }
        }
        if (AccBuilderShamans.var6(var5.getMessage().contains(var2[var1[28]]) ? 1 : 0) && AccBuilderShamans.var8(Players.getLocal().getWorldLocation().distanceTo(F.iJ), var1[21])) {
            String[] stringArray = new String[var1[5]];
            stringArray[AccBuilderShamans.var1[4]] = var2[var1[29]];
            if (AccBuilderShamans.var9(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[var1[5]];
                stringArray2[AccBuilderShamans.var1[4]] = var2[var1[30]];
                TileObjects.getNearest((String[])stringArray2).interact(var2[var1[18]]);
                Time.sleepTicks((int)var1[11]);
                0;
            }
            String[] stringArray3 = new String[var1[5]];
            stringArray3[AccBuilderShamans.var1[4]] = var2[var1[31]];
            if (AccBuilderShamans.var9(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[var1[5]];
                stringArray4[AccBuilderShamans.var1[4]] = var2[var1[32]];
                TileObjects.getNearest((String[])stringArray4).interact(var2[var1[33]]);
                Time.sleepTicks((int)var1[10]);
                0;
            }
        }
        if (AccBuilderShamans.var6(var5.getMessage().contains(var2[var1[34]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(var1[35], var1[36], var1[4]));
            0;
            Time.sleepTicks((int)var1[5]);
            0;
        }
        if (AccBuilderShamans.var6(var5.getMessage().contains(var2[var1[37]]) ? 1 : 0)) {
            int[] nArray = new int[var1[5]];
            nArray[AccBuilderShamans.var1[4]] = var1[38];
            if (AccBuilderShamans.var6(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[var1[5]];
                nArray2[AccBuilderShamans.var1[4]] = var1[38];
                Inventory.getFirst((int[])nArray2).interact(var2[var1[39]]);
            }
        }
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderShamans.var10(n5, n6) && AccBuilderShamans.var8(n5, n7)) {
            n4 = var1[5];
            0;
            if (-(0xA8 ^ 0xAD) >= 0) {
                return ((0x3B ^ 0x15) & ~(0x7E ^ 0x50)) != 0;
            }
        } else {
            n4 = var1[4];
        }
        return n4 != 0;
    }

    private static boolean var11(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var12(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var13(Object object) {
        return object == null;
    }

    private static void var14() {
        var1 = new int[44];
        AccBuilderShamans.var1[0] = -(0xFFFFF099 & 0x2FE7) & (0xFFFFADEF & 0x7EB7);
        AccBuilderShamans.var1[1] = 0xFFFFEFB1 & 0x1E5E;
        AccBuilderShamans.var1[2] = 0x71 ^ 0x77 ^ (0x92 ^ 0xAA);
        AccBuilderShamans.var1[3] = 4 ^ 0x31;
        AccBuilderShamans.var1[4] = (0x79 ^ 0x10 ^ (0xC0 ^ 0xB8)) & (0x43 ^ 0x75 ^ (0x88 ^ 0xAF) ^ -1);
        AccBuilderShamans.var1[5] = 1;
        AccBuilderShamans.var1[6] = 21 + 13 - -111 + 75 ^ 120 + 9 - 121 + 176;
        AccBuilderShamans.var1[7] = -(0xFFFFFDC7 & 0x16FF) & (0xFFFFF5DF & 0x1FFF);
        AccBuilderShamans.var1[8] = -(0xFFFFE5D7 & 0x7E3B) & (0xFFFFE7FB & 0x7FFE);
        AccBuilderShamans.var1[9] = 2;
        AccBuilderShamans.var1[10] = 3;
        AccBuilderShamans.var1[11] = 0x52 ^ 0x56;
        AccBuilderShamans.var1[12] = 0xFFFFAE5D & 0x53FA;
        AccBuilderShamans.var1[13] = 0x63 ^ 0x27 ^ (0xF1 ^ 0xB0);
        AccBuilderShamans.var1[14] = 0x74 ^ 0x72;
        AccBuilderShamans.var1[15] = 0x77 ^ 0x45 ^ (0x26 ^ 0x13);
        AccBuilderShamans.var1[16] = 0xB4 ^ 0xBC;
        AccBuilderShamans.var1[17] = 0x12 ^ 0x27 ^ (0x86 ^ 0xBA);
        AccBuilderShamans.var1[18] = 0x99 ^ 0x8D;
        AccBuilderShamans.var1[19] = 0xFFFFBBD8 & 0x463F;
        AccBuilderShamans.var1[20] = 0xFFFFEFBD & 0x125B;
        AccBuilderShamans.var1[21] = 0xA6 ^ 0xAC;
        AccBuilderShamans.var1[22] = 0x4B ^ 0x40;
        AccBuilderShamans.var1[23] = 0x53 ^ 0x76 ^ (0x4A ^ 0x63);
        AccBuilderShamans.var1[24] = 0x50 ^ 0x5D;
        AccBuilderShamans.var1[25] = 0x6F ^ 0x58 ^ (0x80 ^ 0xB9);
        AccBuilderShamans.var1[26] = 0xFA ^ 0xBA ^ (0x1A ^ 0x55);
        AccBuilderShamans.var1[27] = 0x87 ^ 0x89 ^ (0x91 ^ 0x8F);
        AccBuilderShamans.var1[28] = 0x90 ^ 0x81;
        AccBuilderShamans.var1[29] = 3 ^ 0x11;
        AccBuilderShamans.var1[30] = 0x61 ^ 0x57 ^ (0xBA ^ 0x9F);
        AccBuilderShamans.var1[31] = 0x90 ^ 0x85;
        AccBuilderShamans.var1[32] = 50 + 48 - 44 + 135 ^ 46 + 143 - 81 + 63;
        AccBuilderShamans.var1[33] = 0xD0 ^ 0xC7;
        AccBuilderShamans.var1[34] = 0x6F ^ 0x77;
        AccBuilderShamans.var1[35] = -(0xFFFFE547 & 0x7EFD) & (0xFFFFFFE5 & 0x6FFF);
        AccBuilderShamans.var1[36] = 0xFFFFFFBF & 0xCE7;
        AccBuilderShamans.var1[37] = 3 ^ 0x1A;
        AccBuilderShamans.var1[38] = -(0xFFFFCD55 & 0x7EBB) & (0xFFFFCDBF & Short.MAX_VALUE);
        AccBuilderShamans.var1[39] = 0xB ^ 0x11;
        AccBuilderShamans.var1[40] = 0x17 ^ 0xC;
        AccBuilderShamans.var1[41] = 0x34 ^ 0x28;
        AccBuilderShamans.var1[42] = 0x9F ^ 0x82;
        AccBuilderShamans.var1[43] = 0x17 ^ 0x79 ^ (7 ^ 0x77);
    }

    private static boolean var15(Object object, Object object2) {
        return object == object2;
    }

    private static void var16() {
        var2 = new String[var1[43]];
        AccBuilderShamans.var2[AccBuilderShamans.var1[4]] = "https://discord.com/api/webhooks/1215418045011591239/tdzGIffS11EAOaA2FrJCIfdfHHJzCU9iyB8jbYDt2qO4Wsjz0uMej2XbjAY6ALY_Q0w-";
        AccBuilderShamans.var2[AccBuilderShamans.var1[5]] = "quest";
        AccBuilderShamans.var2[AccBuilderShamans.var1[9]] = "Disabling GE warning";
        AccBuilderShamans.var2[AccBuilderShamans.var1[10]] = "Navigating to GE";
        AccBuilderShamans.var2[AccBuilderShamans.var1[11]] = "Finished account";
        AccBuilderShamans.var2[AccBuilderShamans.var1[13]] = "\n[Plugin] Plugin starting up\n";
        AccBuilderShamans.var2[AccBuilderShamans.var1[14]] = "Switching to One Click Shaman account";
        AccBuilderShamans.var2[AccBuilderShamans.var1[15]] = "hootfighter";
        AccBuilderShamans.var2[AccBuilderShamans.var1[16]] = "enabled";
        AccBuilderShamans.var2[AccBuilderShamans.var1[17]] = "\n[Plugin] Plugin shut down\n";
        AccBuilderShamans.var2[AccBuilderShamans.var1[21]] = "tell the king";
        AccBuilderShamans.var2[AccBuilderShamans.var1[22]] = "You haven't got enough";
        AccBuilderShamans.var2[AccBuilderShamans.var1[23]] = "Not enough gold for buying";
        AccBuilderShamans.var2[AccBuilderShamans.var1[24]] = "Oh dear, you are dead!";
        AccBuilderShamans.var2[AccBuilderShamans.var1[25]] = "We DIED!! :(";
        AccBuilderShamans.var2[AccBuilderShamans.var1[26]] = "Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderShamans.var2[AccBuilderShamans.var1[27]] = "We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderShamans.var2[AccBuilderShamans.var1[28]] = "can't reach that";
        AccBuilderShamans.var2[AccBuilderShamans.var1[29]] = "Door";
        AccBuilderShamans.var2[AccBuilderShamans.var1[30]] = "Door";
        AccBuilderShamans.var2[AccBuilderShamans.var1[18]] = "Open";
        AccBuilderShamans.var2[AccBuilderShamans.var1[31]] = "Tree Door";
        AccBuilderShamans.var2[AccBuilderShamans.var1[32]] = "Tree Door";
        AccBuilderShamans.var2[AccBuilderShamans.var1[33]] = "Open";
        AccBuilderShamans.var2[AccBuilderShamans.var1[34]] = "think that facing North";
        AccBuilderShamans.var2[AccBuilderShamans.var1[37]] = "already some rum";
        AccBuilderShamans.var2[AccBuilderShamans.var1[39]] = "Drop";
        AccBuilderShamans.var2[AccBuilderShamans.var1[40]] = "Burning";
        AccBuilderShamans.var2[AccBuilderShamans.var1[41]] = "Burning";
        AccBuilderShamans.var2[AccBuilderShamans.var1[42]] = AccBuilderShamans.var17("b6woG/CNpSg=", "kAKQG");
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        d = var1[4];
        System.out.print(var2[var1[13]]);
        this.u.add((Overlay)this.v);
        0;
        a.clear();
        System.out.println(var2[var1[14]]);
        a.clear();
        s[] sArray = new s[var1[5]];
        sArray[AccBuilderShamans.var1[4]] = new 57051692-5fea-40a8-a012-903ac1ab23acManager();
        Collections.addAll(a, sArray);
        0;
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    protected int loop() {
        block10: {
            block11: {
                if (!AccBuilderShamans.var15(Game.getState(), GameState.LOGGED_IN)) break block10;
                if (!AccBuilderShamans.var7(a.isEmpty() ? 1 : 0)) break block11;
                if (!AccBuilderShamans.var9(j) || AccBuilderShamans.var13(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderShamans.var6(a.get(var1[4]).af() ? 1 : 0)) {
                    if (AccBuilderShamans.var6(a.get(var1[4]).ae().contains(var2[var1[5]]) ? 1 : 0)) {
                        f += var1[5];
                    }
                    System.out.println("Achieved " + a.get(var1[4]).ae() + " goal");
                    a.remove(var1[4]);
                    0;
                    return var1[6];
                }
                if (!AccBuilderShamans.var15(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderShamans.var6(h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.x() ? 1 : 0) && AccBuilderShamans.var7(d) && AccBuilderShamans.var11(h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.j(var1[7]), var1[8]) && AccBuilderShamans.var7(Dialog.isOpen() ? 1 : 0)) {
                    c = var2[var1[9]];
                    h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.y();
                    Time.sleepTicks((int)var1[5]);
                    0;
                    0;
                    if (((0xB4 ^ 0x81) & ~(0x10 ^ 0x25)) != (0x9E ^ 0x9A)) continue;
                    return (0x84 ^ 0x82) & ~(0x3F ^ 0x39);
                }
                int var18 = var1[4];
                try {
                    var18 = a.get(var1[4]).ad();
                    0;
                }
                catch (Exception var19) {
                    var19.printStackTrace();
                }
                
                return var18;
            }
            if (AccBuilderShamans.var6(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderShamans.var12(Players.getLocal().getWorldLocation().distanceTo(Z.ld), var1[10])) {
                    c = var2[var1[10]];
                    Movement.walkTo((WorldPoint)Z.ld);
                    0;
                }
                if (AccBuilderShamans.var8(Players.getLocal().getWorldLocation().distanceTo(Z.ld), var1[10])) {
                    c = var2[var1[11]];
                }
            }
        }
        return var1[12];
    }

    private static boolean var10(int n2, int n3) {
        return n2 >= n3;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderShamans.var20(n2, var1[25])) {
            return;
        }
        if (AccBuilderShamans.var7(n)) {
            AccBuilderShamans var21;
            h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.a(var21.r, "rsn: " + k + " account has been banned? - Acc builder SHAMANS");
            n += var1[5];
        }
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var1[4];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var1[4];
        while (AccBuilderShamans.var31(var30, var29)) {
            char var32 = var28[var30];
            var25.append((char)(var32 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if ((0xF5 ^ 0xC5 ^ (0x88 ^ 0xBC)) != 0) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block5: {
            AccBuilderShamans var33;
            block6: {
                h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.w();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderShamans.var4(player2, player) && AccBuilderShamans.var6(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = var1[5];
                        0;
                        if (((0x1A ^ 0x7E ^ (0xF1 ^ 0x8C)) & (0x66 ^ 0x6F ^ (0x29 ^ 0x39) ^ -1)) != 0) {
                            return ((36 + 74 - 17 + 162 ^ 160 + 116 - 272 + 183) & (0x48 ^ 0x1C ^ (0x94 ^ 0x84) ^ -1)) != 0;
                        }
                    } else {
                        n4 = var1[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderShamans.var9(player3) || AccBuilderShamans.var3(Game.getWildyLevel()) && !AccBuilderShamans.var8(Players.getLocal().getWorldLocation().distanceTo(X.kN), var1[18])) break block5;
                int[] nArray = new int[var1[5]];
                nArray[AccBuilderShamans.var1[4]] = var1[19];
                if (!AccBuilderShamans.var7(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[var1[5]];
                nArray2[AccBuilderShamans.var1[4]] = var1[20];
                if (!AccBuilderShamans.var6(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
            }
            if (AccBuilderShamans.var7(var33.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderShamans.var6(Dialog.isOpen() ? 1 : 0) && AccBuilderShamans.var9(Dialog.getText()) && AccBuilderShamans.var6(Dialog.getText().contains(var2[var1[21]]) ? 1 : 0)) {
            x.dP = var1[5];
        }
        h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e.G();
    }

    private static boolean var20(int n2, int n3) {
        return n2 != n3;
    }

    static {
        AccBuilderShamans.var14();
        AccBuilderShamans.var16();
        a = new ArrayList<K>();
        b = System.currentTimeMillis();
        d = var1[4];
        g = System.currentTimeMillis();
        h = var2[var1[42]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        K[] kArray = new K[var1[5]];
        kArray[AccBuilderShamans.var1[4]] = new 57051692-5fea-40a8-a012-903ac1ab23acManager();
        o = kArray;
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

        catch (Exception var44) {
            var44.printStackTrace();
            return null;
        }
    }

    private static boolean var31(int n2, int n3) {
        return n2 < n3;
    }

    public AccBuilderShamans() {
        this.q = new WorldArea(var1[0], var1[1], var1[2], var1[3], var1[4]);
        this.r = var2[var1[4]];
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    protected void shutDown() {
        this.u.remove((Overlay)this.v);
        0;
        d = var1[5];
        o = new K[var1[4]];
        n = var1[4];
        f = var1[4];
        System.out.print(var2[var1[17]]);
        super.stop();
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderShamans.var6(configChanged.getGroup().equalsIgnoreCase(var2[var1[15]]) ? 1 : 0) && AccBuilderShamans.var6(configChanged.getKey().contains(var2[var1[16]]) ? 1 : 0)) {
            this.s = this.p.turnScriptOnOff();
            if (AccBuilderShamans.var6(this.s)) {
                d = var1[4];
                0;
                if (2 > (0x65 ^ 0x61)) {
                    return;
                }
            } else {
                d = var1[5];
            }
        }
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    private static boolean var8(int n2, int n3) {
        return n2 <= n3;
    }
}

