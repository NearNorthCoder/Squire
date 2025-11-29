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
import gg.squire.account.Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager;
import gg.squire.account.Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager;
import gg.squire.account.Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager;
import gg.squire.account.Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager;
import gg.squire.account.Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager;
import gg.squire.account.Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager;
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

@Extension
@SquireUtil
@PluginDescriptor(name="Squire Rogues Outfit Builder", enabledByDefault=false)
public class AccBuilderRogues
extends Script {
     boolean t;
    public static  List<G> a;
    @Inject
    private  BuilderInfoBox w;
    @Inject
    public  BuilderConfig q;
    public static  boolean d;
    static  String o;
    @Inject
    private  OverlayManager v;
     String s;
    
    public static  int f;
     WorldArea r;
    static  int n;
    public static  String l;
    public static  String c;
    
    private static  G[] p;
    public static  String h;
    public static  long g;
    public static  String k;
    public static  String j;
    public static  boolean e;
    public static  long b;
    public static  String m;
    public static  HashMap<WorldPoint, Integer> i;
    @Inject
    private  Client u;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var3;
        if (AccBuilderRogues.var4(chatMessage.getMessage().contains(var2[var1[23]]) ? 1 : 0)) {
            System.out.println(var2[var1[24]]);
            d = var1[5];
        }
        if (AccBuilderRogues.var4(var3.getMessage().contains(var2[var1[25]]) ? 1 : 0)) {
            System.out.println(var2[var1[26]]);
            if (AccBuilderRogues.var5(Game.getWildyLevel()) && AccBuilderRogues.var5(Inventory.contains(item -> item.getName().contains(var2[var1[42]])) ? 1 : 0)) {
                d = var1[5];
                System.out.println(var2[var1[27]]);
            }
            if (!AccBuilderRogues.var6(Game.getWildyLevel()) || AccBuilderRogues.var4(Inventory.contains(item -> item.getName().contains(var2[var1[41]])) ? 1 : 0)) {
                d = var1[4];
                System.out.println(var2[var1[28]]);
            }
        }
        if (AccBuilderRogues.var4(var3.getMessage().contains(var2[var1[29]]) ? 1 : 0) && AccBuilderRogues.var7(Players.getLocal().getWorldLocation().distanceTo(C.hV), var1[18])) {
            String[] stringArray = new String[var1[5]];
            stringArray[AccBuilderRogues.var1[4]] = var2[var1[30]];
            if (AccBuilderRogues.var8(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[var1[5]];
                stringArray2[AccBuilderRogues.var1[4]] = var2[var1[19]];
                TileObjects.getNearest((String[])stringArray2).interact(var2[var1[31]]);
                Time.sleepTicks((int)var1[11]);
                0;
            }
            String[] stringArray3 = new String[var1[5]];
            stringArray3[AccBuilderRogues.var1[4]] = var2[var1[32]];
            if (AccBuilderRogues.var8(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[var1[5]];
                stringArray4[AccBuilderRogues.var1[4]] = var2[var1[33]];
                TileObjects.getNearest((String[])stringArray4).interact(var2[var1[34]]);
                Time.sleepTicks((int)var1[10]);
                0;
            }
        }
        if (AccBuilderRogues.var4(var3.getMessage().contains(var2[var1[35]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(var1[36], var1[37], var1[4]));
            0;
            Time.sleepTicks((int)var1[5]);
            0;
        }
        if (AccBuilderRogues.var4(var3.getMessage().contains(var2[var1[38]]) ? 1 : 0)) {
            int[] nArray = new int[var1[5]];
            nArray[AccBuilderRogues.var1[4]] = var1[39];
            if (AccBuilderRogues.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[var1[5]];
                nArray2[AccBuilderRogues.var1[4]] = var1[39];
                Inventory.getFirst((int[])nArray2).interact(var2[var1[40]]);
            }
        }
    }

    static {
        AccBuilderRogues.var9();
        AccBuilderRogues.var10();
        a = new ArrayList<G>();
        b = System.currentTimeMillis();
        d = var1[4];
        g = System.currentTimeMillis();
        h = var2[var1[43]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        G[] gArray = new G[var1[5]];
        gArray[AccBuilderRogues.var1[4]] = new Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager();
        p = gArray;
    }

    private static boolean var6(int n2) {
        return n2 <= 0;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block5: {
            AccBuilderRogues var17;
            block6: {
                f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e.w();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderRogues.var18(player2, player) && AccBuilderRogues.var4(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
                        n4 = var1[5];
                        0;
                        if (2 <= ((0x8B ^ 0xA5 ^ (0xB3 ^ 0x93)) & (106 + 91 - 73 + 3 ^ (3 ^ 0x72) ^ -1))) {
                            return ((0x6F ^ 7 ^ (0x56 ^ 0x12)) & (67 + 182 - 157 + 91 ^ 94 + 76 - 131 + 116 ^ -1)) != 0;
                        }
                    } else {
                        n4 = var1[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderRogues.var8(player3) || AccBuilderRogues.var6(Game.getWildyLevel()) && !AccBuilderRogues.var7(Players.getLocal().getWorldLocation().distanceTo(S.jv), var1[19])) break block5;
                int[] nArray = new int[var1[5]];
                nArray[AccBuilderRogues.var1[4]] = var1[20];
                if (!AccBuilderRogues.var5(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[var1[5]];
                nArray2[AccBuilderRogues.var1[4]] = var1[21];
                if (!AccBuilderRogues.var4(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
            }
            if (AccBuilderRogues.var5(var17.r.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderRogues.var4(Dialog.isOpen() ? 1 : 0) && AccBuilderRogues.var8(Dialog.getText()) && AccBuilderRogues.var4(Dialog.getText().contains(var2[var1[22]]) ? 1 : 0)) {
            f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.u.cX = var1[5];
        }
        f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e.G();
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static void var9() {
        var1 = new int[45];
        AccBuilderRogues.var1[0] = 0xFFFFEF27 & 0x1CFF;
        AccBuilderRogues.var1[1] = 0xFFFFFF59 & 0xEB6;
        AccBuilderRogues.var1[2] = 0x1E ^ 0x20;
        AccBuilderRogues.var1[3] = 137 + 137 - 242 + 210 ^ 147 + 38 - 64 + 78;
        AccBuilderRogues.var1[4] = (0x6E ^ 0x52) & ~(0x4B ^ 0x77);
        AccBuilderRogues.var1[5] = 1;
        AccBuilderRogues.var1[6] = 0 ^ 0x54 ^ (0x99 ^ 0xA9);
        AccBuilderRogues.var1[7] = 0xFFFFC71D & 0x39FB;
        AccBuilderRogues.var1[8] = 0xFFFFEFE9 & 0x13FE;
        AccBuilderRogues.var1[9] = 2;
        AccBuilderRogues.var1[10] = 3;
        AccBuilderRogues.var1[11] = 0x58 ^ 0x5C;
        AccBuilderRogues.var1[12] = 0xFFFFB7FD & 0x4A5A;
        AccBuilderRogues.var1[13] = 0xB7 ^ 0xB2;
        AccBuilderRogues.var1[14] = 0x6B ^ 0x74 ^ (0x32 ^ 0x2B);
        AccBuilderRogues.var1[15] = 0x9E ^ 0x99;
        AccBuilderRogues.var1[16] = 3 ^ 0x60 ^ (0x52 ^ 0x39);
        AccBuilderRogues.var1[17] = 0x85 ^ 0xAF ^ (0x4E ^ 0x6D);
        AccBuilderRogues.var1[18] = 18 + 62 - 24 + 112 ^ 131 + 30 - 75 + 76;
        AccBuilderRogues.var1[19] = 0x70 ^ 0x64;
        AccBuilderRogues.var1[20] = -(0xFFFFCAB7 & 0x7DC9) & (0xFFFFFAFC & 0x4F9B);
        AccBuilderRogues.var1[21] = 0xFFFF8A7B & 0x779D;
        AccBuilderRogues.var1[22] = 29 + 172 - 129 + 114 ^ 50 + 132 - 86 + 81;
        AccBuilderRogues.var1[23] = 144 + 65 - 193 + 159 ^ 152 + 70 - 130 + 71;
        AccBuilderRogues.var1[24] = 48 + 23 - -9 + 105 ^ 109 + 136 - 237 + 172;
        AccBuilderRogues.var1[25] = 0x96 ^ 0xBC ^ (0x48 ^ 0x6C);
        AccBuilderRogues.var1[26] = 0x7F ^ 0x59 ^ (0xAF ^ 0x86);
        AccBuilderRogues.var1[27] = 0x31 ^ 0x21;
        AccBuilderRogues.var1[28] = 0x75 ^ 0x64;
        AccBuilderRogues.var1[29] = 0x5A ^ 0x48;
        AccBuilderRogues.var1[30] = 0x1C ^ 0xF;
        AccBuilderRogues.var1[31] = 0x40 ^ 0x55;
        AccBuilderRogues.var1[32] = 0x72 ^ 0x64;
        AccBuilderRogues.var1[33] = 18 + 15 - -64 + 67 ^ 165 + 171 - 307 + 150;
        AccBuilderRogues.var1[34] = 7 ^ 0x1F;
        AccBuilderRogues.var1[35] = 0xA3 ^ 0xBA;
        AccBuilderRogues.var1[36] = 0xFFFFCFAD & 0x3BF3;
        AccBuilderRogues.var1[37] = -(0xFFFFEBDB & 0x377D) & (0xFFFFAFFF & Short.MAX_VALUE);
        AccBuilderRogues.var1[38] = 0x3E ^ 2 ^ (0x56 ^ 0x70);
        AccBuilderRogues.var1[39] = -(0xFFFFBF3B & 0x6ED5) & (0xFFFFEFFF & 0x3FBF);
        AccBuilderRogues.var1[40] = 0x43 ^ 0x58;
        AccBuilderRogues.var1[41] = 4 + 35 - -29 + 119 ^ 114 + 112 - 213 + 154;
        AccBuilderRogues.var1[42] = 0x3C ^ 0x5B ^ (0x7E ^ 4);
        AccBuilderRogues.var1[43] = 0xC ^ 0x12;
        AccBuilderRogues.var1[44] = 0xAF ^ 0xB0;
    }

    public AccBuilderRogues() {
        this.r = new WorldArea(var1[0], var1[1], var1[2], var1[3], var1[4]);
        this.s = var2[var1[4]];
    }

    private static boolean var19(Object object) {
        return object == null;
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    private static boolean var20(int n2, int n3) {
        return n2 >= n3;
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        d = var1[4];
        System.out.print(var2[var1[13]]);
        this.v.add((Overlay)this.w);
        0;
        a.clear();
        o = var2[var1[14]];
        System.out.println(var2[var1[15]]);
        a.clear();
        p[] pArray = new p[var1[5]];
        pArray[AccBuilderRogues.var1[4]] = new Fdd2f9b9-6584-4a70-afa7-d1946c214094Manager();
        Collections.addAll(a, pArray);
        0;
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    private static boolean var7(int n2, int n3) {
        return n2 <= n3;
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderRogues.var21(n2, var1[25])) {
            return;
        }
        if (AccBuilderRogues.var5(n)) {
            AccBuilderRogues var22;
            f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e.a(var22.s, "rsn: " + k + " account has been banned? - Acc builder " + o);
            n += var1[5];
        }
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderRogues.var4(configChanged.getGroup().equalsIgnoreCase(var2[var1[16]]) ? 1 : 0) && AccBuilderRogues.var4(configChanged.getKey().contains(var2[var1[17]]) ? 1 : 0)) {
            this.t = this.q.turnScriptOnOff();
            if (AccBuilderRogues.var4(this.t)) {
                d = var1[4];
                0;
                if ((0xBC ^ 0xB9) == 0) {
                    return;
                }
            } else {
                d = var1[5];
            }
        }
    }

    private static boolean var23(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var21(int n2, int n3) {
        return n2 != n3;
    }

    private static void var10() {
        var2 = new String[var1[44]];
        AccBuilderRogues.var2[AccBuilderRogues.var1[4]] = "https://discord.com/api/webhooks/1215416272247062598/cqlx02Frndug7FbPDTSpjVvLxW5lC7hbt5KU2oGbtk-z8oN3eFJn54Yg_N3hGm1C1AKF";
        AccBuilderRogues.var2[AccBuilderRogues.var1[5]] = "quest";
        AccBuilderRogues.var2[AccBuilderRogues.var1[9]] = "Disabling GE warning";
        AccBuilderRogues.var2[AccBuilderRogues.var1[10]] = "Navigating to GE";
        AccBuilderRogues.var2[AccBuilderRogues.var1[11]] = "Finished account";
        AccBuilderRogues.var2[AccBuilderRogues.var1[13]] = "\n[Plugin] Plugin starting up\n";
        AccBuilderRogues.var2[AccBuilderRogues.var1[14]] = "Rogues outfit";
        AccBuilderRogues.var2[AccBuilderRogues.var1[15]] = "Switching to One Click Rogues Outfit account";
        AccBuilderRogues.var2[AccBuilderRogues.var1[16]] = "hootfighter";
        AccBuilderRogues.var2[AccBuilderRogues.var1[17]] = "enabled";
        AccBuilderRogues.var2[AccBuilderRogues.var1[18]] = "\n[Plugin] Plugin shut down\n";
        AccBuilderRogues.var2[AccBuilderRogues.var1[22]] = "tell the king";
        AccBuilderRogues.var2[AccBuilderRogues.var1[23]] = "You haven't got enough";
        AccBuilderRogues.var2[AccBuilderRogues.var1[24]] = "Not enough gold for buying";
        AccBuilderRogues.var2[AccBuilderRogues.var1[25]] = "Oh dear, you are dead!";
        AccBuilderRogues.var2[AccBuilderRogues.var1[26]] = "We DIED!! :(";
        AccBuilderRogues.var2[AccBuilderRogues.var1[27]] = "Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderRogues.var2[AccBuilderRogues.var1[28]] = "We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderRogues.var2[AccBuilderRogues.var1[29]] = "can't reach that";
        AccBuilderRogues.var2[AccBuilderRogues.var1[30]] = "Door";
        AccBuilderRogues.var2[AccBuilderRogues.var1[19]] = "Door";
        AccBuilderRogues.var2[AccBuilderRogues.var1[31]] = "Open";
        AccBuilderRogues.var2[AccBuilderRogues.var1[32]] = "Tree Door";
        AccBuilderRogues.var2[AccBuilderRogues.var1[33]] = "Tree Door";
        AccBuilderRogues.var2[AccBuilderRogues.var1[34]] = "Open";
        AccBuilderRogues.var2[AccBuilderRogues.var1[35]] = "think that facing North";
        AccBuilderRogues.var2[AccBuilderRogues.var1[38]] = "already some rum";
        AccBuilderRogues.var2[AccBuilderRogues.var1[40]] = "Drop";
        AccBuilderRogues.var2[AccBuilderRogues.var1[41]] = "Burning";
        AccBuilderRogues.var2[AccBuilderRogues.var1[42]] = "Burning";
        AccBuilderRogues.var2[AccBuilderRogues.var1[43]] = AccBuilderRogues.var24("AvzWY2ltiaQ=", "ikaAZ");
    }

    private static String var25(String var26, String var27) {
        var26 = new String(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var28 = new StringBuilder();
        char[] var29 = var27.toCharArray();
        int var30 = var1[4];
        char[] var31 = var26.toCharArray();
        int var32 = var31.length;
        int var33 = var1[4];
        while (AccBuilderRogues.var34(var33, var32)) {
            char var35 = var31[var33];
            var28.append((char)(var35 ^ var29[var30 % var29.length]));
            0;
            ++var30;
            ++var33;
            0;
            
            return null;
        }
        return String.valueOf(var28);
    }

    private static boolean var36(int n2, int n3) {
        return n2 > n3;
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    private static boolean var37(Object object, Object object2) {
        return object == object2;
    }

    protected void shutDown() {
        this.v.remove((Overlay)this.w);
        0;
        d = var1[5];
        p = new G[var1[4]];
        n = var1[4];
        f = var1[4];
        System.out.print(var2[var1[18]]);
        super.stop();
    }

    private static boolean var18(Object object, Object object2) {
        return object != object2;
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderRogues.var20(n5, n6) && AccBuilderRogues.var7(n5, n7)) {
            n4 = var1[5];
            0;
            if (((0x1F ^ 0x52) & ~(0x70 ^ 0x3D)) < -1) {
                return ((0x59 ^ 0x5F) & ~(0x61 ^ 0x67)) != 0;
            }
        } else {
            n4 = var1[4];
        }
        return n4 != 0;
    }

    private static boolean var34(int n2, int n3) {
        return n2 < n3;
    }

    protected int loop() {
        block10: {
            block11: {
                if (!AccBuilderRogues.var37(Game.getState(), GameState.LOGGED_IN)) break block10;
                if (!AccBuilderRogues.var5(a.isEmpty() ? 1 : 0)) break block11;
                if (!AccBuilderRogues.var8(j) || AccBuilderRogues.var19(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderRogues.var4(a.get(var1[4]).V() ? 1 : 0)) {
                    if (AccBuilderRogues.var4(a.get(var1[4]).U().contains(var2[var1[5]]) ? 1 : 0)) {
                        f += var1[5];
                    }
                    System.out.println("Achieved " + a.get(var1[4]).U() + " goal");
                    a.remove(var1[4]);
                    0;
                    return var1[6];
                }
                if (!AccBuilderRogues.var37(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderRogues.var4(f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e.x() ? 1 : 0) && AccBuilderRogues.var5(d) && AccBuilderRogues.var23(f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e.j(var1[7]), var1[8]) && AccBuilderRogues.var5(Dialog.isOpen() ? 1 : 0)) {
                    c = var2[var1[9]];
                    f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e.y();
                    Time.sleepTicks((int)var1[5]);
                    0;
                    0;
                    if null == null continue;
                    return (6 + 161 - 6 + 8 ^ 64 + 166 - 139 + 85) & (108 + 111 - 202 + 113 ^ 120 + 132 - 182 + 85 ^ -1);
                }
                int var38 = var1[4];
                try {
                    var38 = a.get(var1[4]).T();
                    0;
                }
                catch (Exception var39) {
                    var39.printStackTrace();
                }
                if (1 == -1) {
                    return (0xD9 ^ 0xBF ^ (0xE2 ^ 0xA7)) & (0x64 ^ 0x7C ^ (0x71 ^ 0x4A) ^ -1);
                }
                return var38;
            }
            if (AccBuilderRogues.var4(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderRogues.var36(Players.getLocal().getWorldLocation().distanceTo(U.jL), var1[10])) {
                    c = var2[var1[10]];
                    Movement.walkTo((WorldPoint)U.jL);
                    0;
                }
                if (AccBuilderRogues.var7(Players.getLocal().getWorldLocation().distanceTo(U.jL), var1[10])) {
                    c = var2[var1[11]];
                }
            }
        }
        return var1[12];
    }

        catch (Exception var44) {
            var44.printStackTrace();
            return null;
        }
    }
}

