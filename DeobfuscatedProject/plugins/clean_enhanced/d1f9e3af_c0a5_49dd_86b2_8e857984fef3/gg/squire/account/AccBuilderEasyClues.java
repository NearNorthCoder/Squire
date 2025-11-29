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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import gg.squire.account.D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager;
import gg.squire.account.D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager;
import gg.squire.account.D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager;
import gg.squire.account.D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager;
import gg.squire.account.D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager;
import gg.squire.account.D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager;
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
    public  BuilderConfig q;
    public static  long b;
    @Inject
    private  Client u;
    private static  W[] p;
    public static  int f;
    private static  String[] llIIIIIlI;
     boolean t;
    public static  String h;
    public static  String j;
     String s;
    @Inject
    private  BuilderInfoBox w;
    static  String o;
    @Inject
    private  OverlayManager v;
    public static  String c;
    public static  long g;
    public static  HashMap<WorldPoint, Integer> i;
    public static  String k;
    private static  int[] llIIIIIll;
     WorldArea r;
    public static  String l;
    static  int n;
    public static  List<W> a;
    public static  String m;
    public static  boolean e;
    public static  boolean d;

    private static boolean var1(int n2) {
        return n2 <= 0;
    }

    private static boolean var2(int n2, int n3) {
        return n2 == n3;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = llIIIIIll[4];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = llIIIIIll[4];
        while (AccBuilderEasyClues.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((128 + 99 - 168 + 107 ^ 127 + 21 - 60 + 74) != 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var14(Object object) {
        return object == null;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var21(int n2) {
        return n2 == 0;
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderEasyClues.var24(configChanged.getGroup().equalsIgnoreCase(llIIIIIlI[llIIIIIll[19]]) ? 1 : 0) && AccBuilderEasyClues.var24(configChanged.getKey().contains(llIIIIIlI[llIIIIIll[20]]) ? 1 : 0)) {
            this.t = this.q.turnScriptOnOff();
            if (AccBuilderEasyClues.var24(this.t)) {
                d = llIIIIIll[4];
                0;
                if null != null {
                    return;
                }
            } else {
                d = llIIIIIll[5];
            }
        }
    }

    private static boolean var25(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var26(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderEasyClues.var27(n5, n6) && AccBuilderEasyClues.var26(n5, n7)) {
            n4 = llIIIIIll[5];
            0;
            if (2 < 0) {
                return ((0x7A ^ 0x69) & ~(0x11 ^ 2)) != 0;
            }
        } else {
            n4 = llIIIIIll[4];
        }
        return n4 != 0;
    }

    private static boolean var24(int n2) {
        return n2 != 0;
    }

    private static boolean var28(Object object, Object object2) {
        return object != object2;
    }

    public AccBuilderEasyClues() {
        this.r = new WorldArea(llIIIIIll[0], llIIIIIll[1], llIIIIIll[2], llIIIIIll[3], llIIIIIll[4]);
        this.s = llIIIIIlI[llIIIIIll[4]];
    }

    private static boolean var27(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var29(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var30;
        if (AccBuilderEasyClues.var24(chatMessage.getMessage().contains(llIIIIIlI[llIIIIIll[29]]) ? 1 : 0)) {
            System.out.println(llIIIIIlI[llIIIIIll[30]]);
            d = llIIIIIll[5];
        }
        if (AccBuilderEasyClues.var24(var30.getMessage().contains(llIIIIIlI[llIIIIIll[31]]) ? 1 : 0)) {
            System.out.println(llIIIIIlI[llIIIIIll[32]]);
            if (AccBuilderEasyClues.var21(Game.getWildyLevel()) && AccBuilderEasyClues.var21(Inventory.contains(item -> item.getName().contains(llIIIIIlI[llIIIIIll[48]])) ? 1 : 0)) {
                d = llIIIIIll[5];
                System.out.println(llIIIIIlI[llIIIIIll[22]]);
            }
            if (!AccBuilderEasyClues.var1(Game.getWildyLevel()) || AccBuilderEasyClues.var24(Inventory.contains(item -> item.getName().contains(llIIIIIlI[llIIIIIll[47]])) ? 1 : 0)) {
                d = llIIIIIll[4];
                System.out.println(llIIIIIlI[llIIIIIll[33]]);
            }
        }
        if (AccBuilderEasyClues.var24(var30.getMessage().contains(llIIIIIlI[llIIIIIll[34]]) ? 1 : 0) && AccBuilderEasyClues.var26(Players.getLocal().getWorldLocation().distanceTo(N.jj), llIIIIIll[20])) {
            String[] stringArray = new String[llIIIIIll[5]];
            stringArray[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIlI[llIIIIIll[35]];
            if (AccBuilderEasyClues.var29(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[llIIIIIll[5]];
                stringArray2[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIlI[llIIIIIll[36]];
                TileObjects.getNearest((String[])stringArray2).interact(llIIIIIlI[llIIIIIll[37]]);
                Time.sleepTicks((int)llIIIIIll[11]);
                0;
            }
            String[] stringArray3 = new String[llIIIIIll[5]];
            stringArray3[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIlI[llIIIIIll[38]];
            if (AccBuilderEasyClues.var29(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[llIIIIIll[5]];
                stringArray4[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIlI[llIIIIIll[39]];
                TileObjects.getNearest((String[])stringArray4).interact(llIIIIIlI[llIIIIIll[40]]);
                Time.sleepTicks((int)llIIIIIll[10]);
                0;
            }
        }
        if (AccBuilderEasyClues.var24(var30.getMessage().contains(llIIIIIlI[llIIIIIll[41]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llIIIIIll[42], llIIIIIll[43], llIIIIIll[4]));
            0;
            Time.sleepTicks((int)llIIIIIll[5]);
            0;
        }
        if (AccBuilderEasyClues.var24(var30.getMessage().contains(llIIIIIlI[llIIIIIll[44]]) ? 1 : 0)) {
            int[] nArray = new int[llIIIIIll[5]];
            nArray[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIll[45];
            if (AccBuilderEasyClues.var24(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIIIIll[5]];
                nArray2[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIll[45];
                Inventory.getFirst((int[])nArray2).interact(llIIIIIlI[llIIIIIll[46]]);
            }
        }
    }

    private static boolean var31(Object object, Object object2) {
        return object == object2;
    }

    private static void var23() {
        llIIIIIlI = new String[llIIIIIll[50]];
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[4]] = "https://discord.com/api/webhooks/1215408491569872916/p_Df5IdkayMDKCaTrhumO5Op4xq0zAvxbDBL5U7-Qlv0aIJOqMT1ftqpVVjCZYZ7vApO";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[5]] = "quest";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[9]] = "Disabling GE warning";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[10]] = "Navigating to GE";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[11]] = "Finished account";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[14]] = "Death's Coffer";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[16]] = "\n[Plugin] Plugin starting up\n";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[17]] = "Easy Clues";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[18]] = "Switching to One Click Easy Clue Scroll Account";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[19]] = "hootfighter";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[20]] = "enabled";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[21]] = "\n[Plugin] Plugin shut down\n";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[25]] = "tell the king";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[26]] = "another clue scroll";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[27]] = "a new clue";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[28]] = "I could tell by the cut of your jib";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[29]] = "You haven't got enough";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[30]] = "Not enough gold for buying";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[31]] = "Oh dear, you are dead!";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[32]] = "We DIED!! :(";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[22]] = "Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[33]] = "We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[34]] = "can't reach that";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[35]] = "Door";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[36]] = "Door";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[37]] = "Open";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[38]] = "Tree Door";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[39]] = "Tree Door";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[40]] = "Open";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[41]] = "think that facing North";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[44]] = "already some rum";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[46]] = "Drop";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[47]] = "Burning";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[48]] = "Burning";
        AccBuilderEasyClues.llIIIIIlI[AccBuilderEasyClues.llIIIIIll[49]] = AccBuilderEasyClues.var15("TUGJ9VHJwpU=", "OMLzy");
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
        qArray[AccBuilderEasyClues.llIIIIIll[4]] = new D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager();
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
        if (AccBuilderEasyClues.var32(n2, llIIIIIll[27])) {
            return;
        }
        if (AccBuilderEasyClues.var21(n)) {
            AccBuilderEasyClues var33;
            l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.a(var33.s, "rsn: " + k + " account has been banned? - Acc builder " + o);
            n += llIIIIIll[5];
        }
    }

        catch (Exception var39) {
            var39.printStackTrace();
            return null;
        }
    }

    private static void var22() {
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

    private static boolean var32(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        block9: {
            AccBuilderEasyClues var40;
            block10: {
                l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.w();
                int n2 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n3 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderEasyClues.var28(player2, player) && AccBuilderEasyClues.var24(this.a(n2, n3, (Player)player2) ? 1 : 0)) {
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
                if (!AccBuilderEasyClues.var29(player3) || AccBuilderEasyClues.var1(Game.getWildyLevel()) && !AccBuilderEasyClues.var26(Players.getLocal().getWorldLocation().distanceTo(al.mr), llIIIIIll[22])) break block9;
                int[] nArray = new int[llIIIIIll[5]];
                nArray[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIll[23];
                if (!AccBuilderEasyClues.var21(Inventory.contains((int[])nArray) ? 1 : 0)) break block10;
                int[] nArray2 = new int[llIIIIIll[5]];
                nArray2[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIll[24];
                if (!AccBuilderEasyClues.var24(Inventory.contains((int[])nArray2) ? 1 : 0)) break block9;
            }
            if (AccBuilderEasyClues.var21(var40.r.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderEasyClues.var24(Dialog.isOpen() ? 1 : 0) && AccBuilderEasyClues.var29(Dialog.getText())) {
            if (AccBuilderEasyClues.var24(Dialog.getText().contains(llIIIIIlI[llIIIIIll[25]]) ? 1 : 0)) {
                y.dt = llIIIIIll[5];
            }
            if (!AccBuilderEasyClues.var21(Dialog.getText().contains(llIIIIIlI[llIIIIIll[26]]) ? 1 : 0) || AccBuilderEasyClues.var24(Dialog.getText().contains(llIIIIIlI[llIIIIIll[27]]) ? 1 : 0)) {
                // empty if block
            }
            if (AccBuilderEasyClues.var24(Dialog.getText().contains(llIIIIIlI[llIIIIIll[28]]) ? 1 : 0)) {
                // empty if block
            }
        }
        if (AccBuilderEasyClues.var24(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.G();
    }

    protected int loop() {
        block12: {
            block13: {
                if (!AccBuilderEasyClues.var31(Game.getState(), GameState.LOGGED_IN)) break block12;
                if (!AccBuilderEasyClues.var21(a.isEmpty() ? 1 : 0)) break block13;
                if (!AccBuilderEasyClues.var29(j) || AccBuilderEasyClues.var14(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderEasyClues.var24(a.get(llIIIIIll[4]).V() ? 1 : 0)) {
                    if (AccBuilderEasyClues.var24(a.get(llIIIIIll[4]).U().contains(llIIIIIlI[llIIIIIll[5]]) ? 1 : 0)) {
                        f += llIIIIIll[5];
                    }
                    System.out.println("Achieved " + a.get(llIIIIIll[4]).U() + " goal");
                    a.remove(llIIIIIll[4]);
                    0;
                    return llIIIIIll[6];
                }
                if (!AccBuilderEasyClues.var31(Game.getState(), GameState.LOGGED_IN)) break block13;
                while (AccBuilderEasyClues.var24(l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.x() ? 1 : 0) && AccBuilderEasyClues.var21(d) && AccBuilderEasyClues.var2(l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.j(llIIIIIll[7]), llIIIIIll[8]) && AccBuilderEasyClues.var21(Dialog.isOpen() ? 1 : 0)) {
                    c = llIIIIIlI[llIIIIIll[9]];
                    l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.y();
                    Time.sleepTicks((int)llIIIIIll[5]);
                    0;
                    0;
                    if (-2 < 0) continue;
                    return (0x2A ^ 0x35 ^ (0x11 ^ 7)) & (169 + 45 - 60 + 23 ^ 4 + 162 - 103 + 121 ^ -1);
                }
                int var41 = llIIIIIll[4];
                try {
                    var41 = a.get(llIIIIIll[4]).T();
                    0;
                }
                catch (Exception var42) {
                    var42.printStackTrace();
                }
                
                return var41;
            }
            if (AccBuilderEasyClues.var24(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderEasyClues.var25(Players.getLocal().getWorldLocation().distanceTo(an.mH), llIIIIIll[10])) {
                    c = llIIIIIlI[llIIIIIll[10]];
                    Movement.walkTo((WorldPoint)an.mH);
                    0;
                }
                if (AccBuilderEasyClues.var26(Players.getLocal().getWorldLocation().distanceTo(an.mH), llIIIIIll[10])) {
                    c = llIIIIIlI[llIIIIIll[11]];
                }
            }
            if (AccBuilderEasyClues.var27(Vars.getBit((int)llIIIIIll[12]), llIIIIIll[13])) {
                String[] stringArray = new String[llIIIIIll[5]];
                stringArray[AccBuilderEasyClues.llIIIIIll[4]] = llIIIIIlI[llIIIIIll[14]];
                if (AccBuilderEasyClues.var29(TileObjects.getNearest((String[])stringArray))) {
                    l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e.E();
                }
            }
        }
        return llIIIIIll[15];
    }
}

