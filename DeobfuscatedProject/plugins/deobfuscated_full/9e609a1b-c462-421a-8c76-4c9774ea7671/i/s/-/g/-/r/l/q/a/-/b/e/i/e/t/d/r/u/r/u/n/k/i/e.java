/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Perspective
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.Skill
 *  net.runelite.api.World
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.util.WorldUtil
 *  net.runelite.http.api.worlds.World
 *  net.runelite.http.api.worlds.WorldResult
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.GameThread
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.World;
import net.runelite.http.api.worlds.WorldResult;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public class e {
    private static final /* synthetic */ int Y;
    private static /* synthetic */ String[] lIIIlllIlIlIl;
    static /* synthetic */ WorldPoint af;
    static final /* synthetic */ WorldArea T;
    public static final /* synthetic */ ThreadLocalRandom R;
    public static /* synthetic */ int[] ae;
    private static final /* synthetic */ int ab;
    private static final /* synthetic */ int Z;
    private static /* synthetic */ int[] lIIIlllIllIlI;
    private static final /* synthetic */ int aa;
    private static final /* synthetic */ long U;
    private static final /* synthetic */ int[] ac;
    public static final /* synthetic */ String Q;
    private static final /* synthetic */ long V;
    private static final /* synthetic */ int X;
    static /* synthetic */ WorldArea ag;
    public static /* synthetic */ WorldPoint ad;
    static final /* synthetic */ WorldArea S;
    private static final /* synthetic */ Map<Integer, Integer> W;

    public static void l(int n2) {
        int[] nArray = new int[lIIIlllIllIlI[1]];
        nArray[e.lIIIlllIllIlI[0]] = n2;
        if (e.lIlIIlIIllIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIlllIllIlI[1]];
            nArray2[e.lIIIlllIllIlI[0]] = n2;
            if (e.lIlIIlIIllIlIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int var52;
                int[] nArray3 = new int[lIIIlllIllIlI[1]];
                nArray3[e.lIIIlllIllIlI[0]] = n2;
                String[] stringArray = new String[lIIIlllIllIlI[1]];
                stringArray[e.lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[21]];
                if (e.lIlIIlIIllIlIll(Inventory.getFirst((int[])nArray3).hasAction(stringArray) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIlllIllIlI[1]];
                    nArray4[e.lIIIlllIllIlI[0]] = n2;
                    Inventory.getFirst((int[])nArray4).interact(lIIIlllIlIlIl[lIIIlllIllIlI[22]]);
                }
                int[] nArray5 = new int[lIIIlllIllIlI[1]];
                nArray5[e.lIIIlllIllIlI[0]] = var52;
                String[] stringArray2 = new String[lIIIlllIllIlI[1]];
                stringArray2[e.lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[23]];
                if (e.lIlIIlIIllIlIll(Inventory.getFirst((int[])nArray5).hasAction(stringArray2) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIlllIllIlI[1]];
                    nArray6[e.lIIIlllIllIlI[0]] = var52;
                    Inventory.getFirst((int[])nArray6).interact(lIIIlllIlIlIl[lIIIlllIllIlI[24]]);
                }
                int[] nArray7 = new int[lIIIlllIllIlI[1]];
                nArray7[e.lIIIlllIllIlI[0]] = var52;
                String[] stringArray3 = new String[lIIIlllIllIlI[1]];
                stringArray3[e.lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[25]];
                if (e.lIlIIlIIllIlIll(Inventory.getFirst((int[])nArray7).hasAction(stringArray3) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIlllIllIlI[1]];
                    nArray8[e.lIIIlllIllIlI[0]] = var52;
                    Inventory.getFirst((int[])nArray8).interact(lIIIlllIlIlIl[lIIIlllIllIlI[26]]);
                }
                if (e.lIlIIlIIllIlIlI(var52, lIIIlllIllIlI[27])) {
                    Time.sleepTicks((int)lIIIlllIllIlI[6]);
                    0;
                    String[] stringArray4 = new String[lIIIlllIllIlI[1]];
                    stringArray4[e.lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[28]];
                    g.a(stringArray4);
                    Time.sleepTicks((int)lIIIlllIllIlI[1]);
                    0;
                }
            }
        }
    }

    private static String lIlIIlIIlIIIllI(String var25, String var39) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var54 = var39.toCharArray();
        int var9 = lIIIlllIllIlI[0];
        char[] var14 = var25.toCharArray();
        int var20 = var14.length;
        int var23 = lIIIlllIllIlI[0];
        while (e.lIlIIlIIllIIlll(var23, var20)) {
            char var45 = var14[var23];
            var10.append((char)(var45 ^ var54[var9 % var54.length]));
            0;
            ++var9;
            ++var23;
            0;
            if (((0xE3 ^ 0xC1) & ~(0x9B ^ 0xB9)) == 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static String lIlIIlIIlIIIlll(String var29, String var11) {
        try {
            SecretKeySpec var41 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var32 = Cipher.getInstance("Blowfish");
            var32.init(lIIIlllIllIlI[2], var41);
            return new String(var32.doFinal(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIllIllII(int n2) {
        return n2 < 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void k(int n2) {
        if (e.lIlIIlIIllIllIl(Static.getClient().getWorld(), n2)) {
            void var56;
            WorldResult worldResult = Static.getWorldService().getWorlds();
            World world = worldResult.findWorld(n2);
            if (e.lIlIIlIIllIlllI(world)) {
                return;
            }
            if (e.lIlIIlIIllIlIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            net.runelite.api.World var51 = Static.getClient().createWorld();
            var51.setActivity(var56.getActivity());
            var51.setAddress(var56.getAddress());
            var51.setId(var56.getId());
            var51.setPlayerCount(var56.getPlayers());
            var51.setLocation(var56.getLocation());
            var51.setTypes(WorldUtil.toWorldTypes((EnumSet)var56.getTypes()));
            Worlds.hopTo((net.runelite.api.World)var51);
        }
    }

    public static void s() {
        int var35 = lIIIlllIllIlI[0];
        while (e.lIlIIlIIllIIlll(var35, ac.length)) {
            Widget var28 = Widgets.get((int)ac[var35], widget -> widget.getText().contains(lIIIlllIlIlIl[lIIIlllIllIlI[73]]));
            if (e.lIlIIlIIllIlIII(var28)) {
                Keyboard.sendSpace();
                System.out.println("Found Conversation continue window :" + ac[var35]);
            }
            ++var35;
            0;
            if (-1 == -1) continue;
            return;
        }
    }

    public static boolean y() {
        boolean bl;
        if (!e.lIlIIlIIllIlIll((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lIIIlllIllIlI[10]))) || e.lIlIIlIIllIlIIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lIIIlllIllIlI[15])))) {
            bl = lIIIlllIllIlI[1];
            0;
            
            }
        } else {
            bl = lIIIlllIllIlI[0];
        }
        return bl;
    }

    public static String h(int n2) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String string = numberFormat.format(n2);
        return string;
    }

    private static boolean lIlIIlIIllIlIIl(int n2) {
        return n2 == 0;
    }

    public static boolean i(int n2) {
        int[] nArray = new int[lIIIlllIllIlI[1]];
        nArray[e.lIIIlllIllIlI[0]] = n2;
        return Bank.contains((int[])nArray);
    }

    public static int j(int n2) {
        return (Integer)GameThread.invokeLater(() -> Static.getClient().getVarpValue(n2));
    }

    static {
        e.lIlIIlIIllIIllI();
        e.lIlIIlIIllIIIlI();
        Y = lIIIlllIllIlI[74];
        ab = lIIIlllIllIlI[75];
        Q = lIIIlllIlIlIl[lIIIlllIllIlI[76]];
        Z = lIIIlllIllIlI[77];
        X = lIIIlllIllIlI[78];
        aa = lIIIlllIllIlI[79];
        R = ThreadLocalRandom.current();
        S = new WorldArea(lIIIlllIllIlI[80], lIIIlllIllIlI[81], lIIIlllIllIlI[57], lIIIlllIllIlI[82], lIIIlllIllIlI[0]);
        T = new WorldArea(lIIIlllIllIlI[83], lIIIlllIllIlI[84], lIIIlllIllIlI[8], lIIIlllIllIlI[50], lIIIlllIllIlI[1]);
        U = System.currentTimeMillis();
        V = System.nanoTime();
        W = new HashMap<Integer, Integer>();
        int[] nArray = new int[lIIIlllIllIlI[14]];
        nArray[e.lIIIlllIllIlI[0]] = lIIIlllIllIlI[78];
        nArray[e.lIIIlllIllIlI[1]] = lIIIlllIllIlI[74];
        nArray[e.lIIIlllIllIlI[2]] = lIIIlllIllIlI[77];
        nArray[e.lIIIlllIllIlI[6]] = lIIIlllIllIlI[79];
        nArray[e.lIIIlllIllIlI[3]] = lIIIlllIllIlI[75];
        ac = nArray;
        ad = new WorldPoint(lIIIlllIllIlI[85], lIIIlllIllIlI[86], lIIIlllIllIlI[0]);
        int[] nArray2 = new int[lIIIlllIllIlI[87]];
        nArray2[e.lIIIlllIllIlI[0]] = lIIIlllIllIlI[88];
        nArray2[e.lIIIlllIllIlI[1]] = lIIIlllIllIlI[89];
        nArray2[e.lIIIlllIllIlI[2]] = lIIIlllIllIlI[90];
        nArray2[e.lIIIlllIllIlI[6]] = lIIIlllIllIlI[91];
        nArray2[e.lIIIlllIllIlI[3]] = lIIIlllIllIlI[92];
        nArray2[e.lIIIlllIllIlI[14]] = lIIIlllIllIlI[93];
        nArray2[e.lIIIlllIllIlI[17]] = lIIIlllIllIlI[94];
        nArray2[e.lIIIlllIllIlI[9]] = lIIIlllIllIlI[95];
        nArray2[e.lIIIlllIllIlI[20]] = lIIIlllIllIlI[96];
        nArray2[e.lIIIlllIllIlI[21]] = lIIIlllIllIlI[97];
        nArray2[e.lIIIlllIllIlI[22]] = lIIIlllIllIlI[98];
        nArray2[e.lIIIlllIllIlI[23]] = lIIIlllIllIlI[99];
        nArray2[e.lIIIlllIllIlI[24]] = lIIIlllIllIlI[100];
        nArray2[e.lIIIlllIllIlI[25]] = lIIIlllIllIlI[101];
        nArray2[e.lIIIlllIllIlI[26]] = lIIIlllIllIlI[102];
        nArray2[e.lIIIlllIllIlI[28]] = lIIIlllIllIlI[103];
        nArray2[e.lIIIlllIllIlI[40]] = lIIIlllIllIlI[104];
        nArray2[e.lIIIlllIllIlI[41]] = lIIIlllIllIlI[105];
        nArray2[e.lIIIlllIllIlI[42]] = lIIIlllIllIlI[106];
        nArray2[e.lIIIlllIllIlI[11]] = lIIIlllIllIlI[107];
        nArray2[e.lIIIlllIllIlI[13]] = lIIIlllIllIlI[108];
        nArray2[e.lIIIlllIllIlI[45]] = lIIIlllIllIlI[109];
        nArray2[e.lIIIlllIllIlI[46]] = lIIIlllIllIlI[110];
        nArray2[e.lIIIlllIllIlI[8]] = lIIIlllIllIlI[111];
        nArray2[e.lIIIlllIllIlI[51]] = lIIIlllIllIlI[112];
        nArray2[e.lIIIlllIllIlI[52]] = lIIIlllIllIlI[113];
        nArray2[e.lIIIlllIllIlI[53]] = lIIIlllIllIlI[114];
        nArray2[e.lIIIlllIllIlI[54]] = lIIIlllIllIlI[115];
        nArray2[e.lIIIlllIllIlI[55]] = lIIIlllIllIlI[116];
        nArray2[e.lIIIlllIllIlI[5]] = lIIIlllIllIlI[117];
        nArray2[e.lIIIlllIllIlI[50]] = lIIIlllIllIlI[118];
        nArray2[e.lIIIlllIllIlI[56]] = lIIIlllIllIlI[119];
        nArray2[e.lIIIlllIllIlI[19]] = lIIIlllIllIlI[120];
        nArray2[e.lIIIlllIllIlI[61]] = lIIIlllIllIlI[121];
        nArray2[e.lIIIlllIllIlI[62]] = lIIIlllIllIlI[122];
        nArray2[e.lIIIlllIllIlI[33]] = lIIIlllIllIlI[123];
        nArray2[e.lIIIlllIllIlI[63]] = lIIIlllIllIlI[124];
        nArray2[e.lIIIlllIllIlI[66]] = lIIIlllIllIlI[125];
        nArray2[e.lIIIlllIllIlI[67]] = lIIIlllIllIlI[126];
        nArray2[e.lIIIlllIllIlI[68]] = lIIIlllIllIlI[127];
        nArray2[e.lIIIlllIllIlI[12]] = lIIIlllIllIlI[128];
        nArray2[e.lIIIlllIllIlI[16]] = lIIIlllIllIlI[129];
        nArray2[e.lIIIlllIllIlI[69]] = lIIIlllIllIlI[130];
        nArray2[e.lIIIlllIllIlI[70]] = lIIIlllIllIlI[131];
        nArray2[e.lIIIlllIllIlI[71]] = lIIIlllIllIlI[132];
        nArray2[e.lIIIlllIllIlI[73]] = lIIIlllIllIlI[133];
        nArray2[e.lIIIlllIllIlI[76]] = lIIIlllIllIlI[134];
        nArray2[e.lIIIlllIllIlI[135]] = lIIIlllIllIlI[136];
        nArray2[e.lIIIlllIllIlI[82]] = lIIIlllIllIlI[137];
        nArray2[e.lIIIlllIllIlI[138]] = lIIIlllIllIlI[139];
        nArray2[e.lIIIlllIllIlI[57]] = lIIIlllIllIlI[140];
        nArray2[e.lIIIlllIllIlI[141]] = lIIIlllIllIlI[142];
        nArray2[e.lIIIlllIllIlI[143]] = lIIIlllIllIlI[144];
        nArray2[e.lIIIlllIllIlI[145]] = lIIIlllIllIlI[146];
        nArray2[e.lIIIlllIllIlI[147]] = lIIIlllIllIlI[148];
        nArray2[e.lIIIlllIllIlI[149]] = lIIIlllIllIlI[150];
        nArray2[e.lIIIlllIllIlI[151]] = lIIIlllIllIlI[152];
        nArray2[e.lIIIlllIllIlI[153]] = lIIIlllIllIlI[154];
        nArray2[e.lIIIlllIllIlI[155]] = lIIIlllIllIlI[156];
        nArray2[e.lIIIlllIllIlI[157]] = lIIIlllIllIlI[158];
        nArray2[e.lIIIlllIllIlI[159]] = lIIIlllIllIlI[160];
        nArray2[e.lIIIlllIllIlI[161]] = lIIIlllIllIlI[162];
        nArray2[e.lIIIlllIllIlI[163]] = lIIIlllIllIlI[164];
        nArray2[e.lIIIlllIllIlI[165]] = lIIIlllIllIlI[166];
        nArray2[e.lIIIlllIllIlI[167]] = lIIIlllIllIlI[168];
        nArray2[e.lIIIlllIllIlI[169]] = lIIIlllIllIlI[170];
        nArray2[e.lIIIlllIllIlI[171]] = lIIIlllIllIlI[172];
        nArray2[e.lIIIlllIllIlI[173]] = lIIIlllIllIlI[174];
        nArray2[e.lIIIlllIllIlI[175]] = lIIIlllIllIlI[176];
        nArray2[e.lIIIlllIllIlI[177]] = lIIIlllIllIlI[178];
        nArray2[e.lIIIlllIllIlI[179]] = lIIIlllIllIlI[180];
        nArray2[e.lIIIlllIllIlI[36]] = lIIIlllIllIlI[181];
        nArray2[e.lIIIlllIllIlI[182]] = lIIIlllIllIlI[183];
        nArray2[e.lIIIlllIllIlI[184]] = lIIIlllIllIlI[185];
        nArray2[e.lIIIlllIllIlI[186]] = lIIIlllIllIlI[187];
        nArray2[e.lIIIlllIllIlI[188]] = lIIIlllIllIlI[189];
        nArray2[e.lIIIlllIllIlI[190]] = lIIIlllIllIlI[191];
        nArray2[e.lIIIlllIllIlI[192]] = lIIIlllIllIlI[193];
        nArray2[e.lIIIlllIllIlI[194]] = lIIIlllIllIlI[195];
        nArray2[e.lIIIlllIllIlI[196]] = lIIIlllIllIlI[197];
        nArray2[e.lIIIlllIllIlI[198]] = lIIIlllIllIlI[199];
        nArray2[e.lIIIlllIllIlI[200]] = lIIIlllIllIlI[201];
        nArray2[e.lIIIlllIllIlI[202]] = lIIIlllIllIlI[203];
        nArray2[e.lIIIlllIllIlI[204]] = lIIIlllIllIlI[205];
        nArray2[e.lIIIlllIllIlI[206]] = lIIIlllIllIlI[207];
        nArray2[e.lIIIlllIllIlI[208]] = lIIIlllIllIlI[209];
        nArray2[e.lIIIlllIllIlI[210]] = lIIIlllIllIlI[211];
        nArray2[e.lIIIlllIllIlI[212]] = lIIIlllIllIlI[213];
        nArray2[e.lIIIlllIllIlI[214]] = lIIIlllIllIlI[215];
        nArray2[e.lIIIlllIllIlI[216]] = lIIIlllIllIlI[217];
        nArray2[e.lIIIlllIllIlI[218]] = lIIIlllIllIlI[219];
        nArray2[e.lIIIlllIllIlI[220]] = lIIIlllIllIlI[221];
        nArray2[e.lIIIlllIllIlI[222]] = lIIIlllIllIlI[223];
        nArray2[e.lIIIlllIllIlI[224]] = lIIIlllIllIlI[225];
        nArray2[e.lIIIlllIllIlI[226]] = lIIIlllIllIlI[227];
        nArray2[e.lIIIlllIllIlI[228]] = lIIIlllIllIlI[229];
        nArray2[e.lIIIlllIllIlI[230]] = lIIIlllIllIlI[231];
        nArray2[e.lIIIlllIllIlI[232]] = lIIIlllIllIlI[233];
        nArray2[e.lIIIlllIllIlI[234]] = lIIIlllIllIlI[235];
        nArray2[e.lIIIlllIllIlI[236]] = lIIIlllIllIlI[237];
        nArray2[e.lIIIlllIllIlI[72]] = lIIIlllIllIlI[238];
        nArray2[e.lIIIlllIllIlI[59]] = lIIIlllIllIlI[239];
        nArray2[e.lIIIlllIllIlI[240]] = lIIIlllIllIlI[241];
        nArray2[e.lIIIlllIllIlI[242]] = lIIIlllIllIlI[243];
        nArray2[e.lIIIlllIllIlI[244]] = lIIIlllIllIlI[245];
        nArray2[e.lIIIlllIllIlI[246]] = lIIIlllIllIlI[247];
        nArray2[e.lIIIlllIllIlI[248]] = lIIIlllIllIlI[249];
        ae = nArray2;
        af = new WorldPoint(lIIIlllIllIlI[250], lIIIlllIllIlI[251], lIIIlllIllIlI[2]);
        ag = new WorldArea(lIIIlllIllIlI[252], lIIIlllIllIlI[253], lIIIlllIllIlI[61], lIIIlllIllIlI[46], lIIIlllIllIlI[0]);
    }

    private static boolean lIlIIlIIllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(WorldPoint worldPoint) {
        void var50;
        void var34;
        void var53;
        WorldPoint worldPoint2 = new WorldPoint(lIIIlllIllIlI[29], lIIIlllIllIlI[30], lIIIlllIllIlI[0]);
        WorldArea worldArea = new WorldArea(lIIIlllIllIlI[31], lIIIlllIllIlI[32], lIIIlllIllIlI[21], lIIIlllIllIlI[33], lIIIlllIllIlI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllIllIlI[34], lIIIlllIllIlI[35], lIIIlllIllIlI[36], lIIIlllIllIlI[37], lIIIlllIllIlI[0]);
        if (e.lIlIIlIIllIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIlllIllIlI[17]) && e.lIlIIlIIllIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.lIlIIlIIllIlIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.lIlIIlIIllIllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIllIlI[38], lIIIlllIllIlI[39], lIIIlllIllIlI[1])), lIIIlllIllIlI[13])) {
            AccBuilderRat.c = lIIIlllIlIlIl[lIIIlllIllIlI[40]];
            if (e.lIlIIlIIllIlIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)var53);
            0;
            Time.sleepTicks((int)lIIIlllIllIlI[1]);
            0;
        }
        if (e.lIlIIlIIlllIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var53), lIIIlllIllIlI[17]) && e.lIlIIlIIlllIIII(Players.getLocal().getWorldLocation().getY(), lIIIlllIllIlI[30])) {
            if (e.lIlIIlIIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lIIIlllIllIlI[1]];
                stringArray[e.lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[41]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlllIlIlIl[lIIIlllIllIlI[42]]);
                Time.sleepTicks((int)lIIIlllIllIlI[2]);
                0;
            }
            if (e.lIlIIlIIllIlIll(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lIIIlllIllIlI[1]];
                stringArray[e.lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[11]];
                g.a(stringArray);
            }
        }
        if (e.lIlIIlIIllIllll(Players.getLocal().getWorldLocation().getY(), lIIIlllIllIlI[30]) && (!e.lIlIIlIIllIlIIl(var34.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.lIlIIlIIllIlIIl(var50.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || e.lIlIIlIIlllIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIllIlI[38], lIIIlllIllIlI[39], lIIIlllIllIlI[1])), lIIIlllIllIlI[13]))) {
            WorldPoint var12;
            AccBuilderRat.c = lIIIlllIlIlIl[lIIIlllIllIlI[13]];
            if (e.lIlIIlIIllIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlllIllIlI[29], lIIIlllIllIlI[43], lIIIlllIllIlI[0])) ? 1 : 0)) {
                e.b(new WorldPoint(lIIIlllIllIlI[29], lIIIlllIllIlI[44], lIIIlllIllIlI[0]));
                Time.sleepTicks((int)lIIIlllIllIlI[17]);
                0;
            }
            Movement.walkTo((WorldPoint)var12);
            0;
            Time.sleepTicks((int)lIIIlllIllIlI[1]);
            0;
        }
    }

    public static void H() {
        if (e.lIlIIlIIllIlIIl(Widgets.get((int)lIIIlllIllIlI[58]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get((int)lIIIlllIllIlI[58], (int)lIIIlllIllIlI[40]);
            Mouse.click((int)widget.getClickPoint().getX(), (int)widget.getClickPoint().getY(), (boolean)lIIIlllIllIlI[1]);
            Time.sleepTicks((int)lIIIlllIllIlI[6]);
            0;
        }
    }

    public static boolean b(int[] nArray) {
        int[] var4;
        int var44 = lIIIlllIllIlI[0];
        while (e.lIlIIlIIllIIlll(var44, var4.length)) {
            if (e.lIlIIlIIllIlIIl(e.i(var4[var44]) ? 1 : 0)) {
                System.out.println("Missing ID: " + var4[var44]);
                return lIIIlllIllIlI[0];
            }
            ++var44;
            0;
            if (2 >= ((0x7B ^ 0x21 ^ (0x6B ^ 0x7B)) & (0x6D ^ 4 ^ (0x1E ^ 0x3D) ^ -1))) continue;
            return ((0x86 ^ 0x95 ^ (0xC0 ^ 0x8D)) & (4 + 196 - 67 + 66 ^ 49 + 123 - 60 + 41 ^ -1)) != 0;
        }
        return lIIIlllIllIlI[1];
    }

    private static String lIlIIlIIlIIlIII(String var17, String var26) {
        try {
            SecretKeySpec var55 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var26.getBytes(StandardCharsets.UTF_8)), lIIIlllIllIlI[20]), "DES");
            Cipher var30 = Cipher.getInstance("DES");
            var30.init(lIIIlllIllIlI[2], var55);
            return new String(var30.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIlllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIlIIlIIllIIIlI() {
        lIIIlllIlIlIl = new String[lIIIlllIllIlI[135]];
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[0]] = e."%%0%dd";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[1]] = e."C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[2]] = e."line.separator";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[6]] = e."Close";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[3]] = e."Select Warnings";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[14]] = e."Toggle";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[17]] = e."Toggle";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[9]] = e."Close";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[20]] = e."All Settings";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[21]] = e."Wear";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[22]] = e."Wear";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[23]] = e."Wield";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[24]] = e."Wield";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[25]] = e."Equip";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[26]] = e."Equip";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[28]] = e."Give me a PK skull.";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[40]] = e."Nav to outside gate";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[41]] = e."Gate";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[42]] = e."Open";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[11]] = e."Sorry, I'm a bit busy.";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[13]] = e."Nav to stronghold tile";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[45]] = e."POST";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[46]] = e."Content-Type";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[8]] = e."application/json";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[51]] = e."Auto retaliate";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[52]] = e."Auto retaliate";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[53]] = e."Death's Coffer";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[54]] = e."Handling death";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[55]] = e."Death";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[5]] = e."Talk-to";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[50]] = e."Portal";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[56]] = e."Use";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[19]] = e."<str>";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[61]] = e."total";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[62]] = e."PvP";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[33]] = e."PvP";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[63]] = e."High";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[66]] = e."Leagues";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[67]] = e."Beta";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[68]] = e."beta";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[12]] = e."Deadman";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[16]] = e."Deadman";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[69]] = e."Speedrunning";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[70]] = e."total";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[71]] = e."Beta";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[73]] = e."continue";
        e.lIIIlllIlIlIl[e.lIIIlllIllIlI[76]] = e."C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";
    }

    public static void B() {
        Widget widget = Widgets.get((int)lIIIlllIllIlI[18], (int)lIIIlllIllIlI[19]);
        if (e.lIlIIlIIllIlIII(widget)) {
            widget.interact(lIIIlllIlIlIl[lIIIlllIllIlI[20]]);
            Time.sleepTicks((int)lIIIlllIllIlI[1]);
            0;
        }
    }

    public static void x() {
        Widget widget = Widgets.get((int)lIIIlllIllIlI[4], (int)lIIIlllIllIlI[5], (int)lIIIlllIllIlI[0]);
        if (e.lIlIIlIIllIlIII(widget)) {
            widget.interact(lIIIlllIlIlIl[lIIIlllIllIlI[6]]);
            Time.sleepTicks((int)lIIIlllIllIlI[6]);
            0;
        }
    }

    public static void z() {
        Widget var33;
        if (e.lIlIIlIIllIlIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.lIlIIlIIllIlIll(e.y() ? 1 : 0)) {
            if (e.lIlIIlIIllIlIIl(e.A() ? 1 : 0)) {
                e.B();
            }
            if (e.lIlIIlIIllIlIll(e.A() ? 1 : 0)) {
                Widget var48;
                Widget var21;
                var33 = Widgets.get((int)lIIIlllIllIlI[7], (int)lIIIlllIllIlI[8], (int)lIIIlllIllIlI[9]);
                if (e.lIlIIlIIllIlIII(var33)) {
                    var33.interact(lIIIlllIlIlIl[lIIIlllIllIlI[3]]);
                    Time.sleepTicks((int)lIIIlllIllIlI[1]);
                    0;
                }
                if (e.lIlIIlIIllIlIIl(Vars.getBit((int)lIIIlllIllIlI[10])) && e.lIlIIlIIllIlIII(var21 = Widgets.get((int)lIIIlllIllIlI[7], (int)lIIIlllIllIlI[11], (int)lIIIlllIllIlI[12]))) {
                    if (e.lIlIIlIIllIlIIl(var21.isVisible() ? 1 : 0)) {
                        var48 = Widgets.get((int)lIIIlllIllIlI[7], (int)lIIIlllIllIlI[13], (int)lIIIlllIllIlI[14]);
                        Mouse.click((int)var48.getClickPoint().getX(), (int)var48.getClickPoint().getY(), (boolean)lIIIlllIllIlI[1]);
                        Time.sleepTicks((int)lIIIlllIllIlI[1]);
                        0;
                    }
                    if (e.lIlIIlIIllIlIll(var21.isVisible() ? 1 : 0)) {
                        var21.interact(lIIIlllIlIlIl[lIIIlllIllIlI[14]]);
                        Time.sleepTicks((int)lIIIlllIllIlI[1]);
                        0;
                    }
                }
                if (e.lIlIIlIIllIlIIl(Vars.getBit((int)lIIIlllIllIlI[15])) && e.lIlIIlIIllIlIII(var21 = Widgets.get((int)lIIIlllIllIlI[7], (int)lIIIlllIllIlI[11], (int)lIIIlllIllIlI[16]))) {
                    if (e.lIlIIlIIllIlIIl(var21.isVisible() ? 1 : 0)) {
                        var48 = Widgets.get((int)lIIIlllIllIlI[7], (int)lIIIlllIllIlI[13], (int)lIIIlllIllIlI[14]);
                        Mouse.click((int)var48.getClickPoint().getX(), (int)var48.getClickPoint().getY(), (boolean)lIIIlllIllIlI[1]);
                        Time.sleepTicks((int)lIIIlllIllIlI[1]);
                        0;
                    }
                    if (e.lIlIIlIIllIlIll(var21.isVisible() ? 1 : 0)) {
                        var21.interact(lIIIlllIlIlIl[lIIIlllIllIlI[17]]);
                        Time.sleepTicks((int)lIIIlllIllIlI[2]);
                        0;
                    }
                }
            }
        }
        if (e.lIlIIlIIllIlIII(var33 = Widgets.get((int)lIIIlllIllIlI[7], (int)lIIIlllIllIlI[3]))) {
            var33.interact(lIIIlllIlIlIl[lIIIlllIllIlI[9]]);
            Time.sleepTicks((int)lIIIlllIllIlI[1]);
            0;
        }
    }

    private static boolean lIlIIlIIllIllll(int n2, int n3) {
        return n2 > n3;
    }

    public static int I() {
        return e.j(lIIIlllIllIlI[59]);
    }

    private static boolean lIlIIlIIllIlllI(Object object) {
        return object == null;
    }

    public static void C() {
        net.runelite.api.World world2 = Worlds.getRandom(world -> {
            int n2;
            if (e.lIlIIlIIllIlIll(world.isMembers() ? 1 : 0) && e.lIlIIlIIlllIIII(world.getPlayerCount(), lIIIlllIllIlI[60]) && e.lIlIIlIIllIllIl(world.getId(), Worlds.getCurrentId()) && e.lIlIIlIIllIlIIl(world.getActivity().endsWith(lIIIlllIlIlIl[lIIIlllIllIlI[61]]) ? 1 : 0) && e.lIlIIlIIllIlIIl(world.getActivity().endsWith(lIIIlllIlIlIl[lIIIlllIllIlI[62]]) ? 1 : 0) && e.lIlIIlIIllIlIIl(world.getActivity().startsWith(lIIIlllIlIlIl[lIIIlllIllIlI[33]]) ? 1 : 0) && e.lIlIIlIIllIlIIl(world.getActivity().startsWith(lIIIlllIlIlIl[lIIIlllIllIlI[63]]) ? 1 : 0) && e.lIlIIlIIllIllIl(world.getId(), lIIIlllIllIlI[64]) && e.lIlIIlIIllIllIl(world.getId(), lIIIlllIllIlI[65]) && e.lIlIIlIIllIllIl(world.getId(), lIIIlllIllIlI[65]) && e.lIlIIlIIllIlIIl(world.getActivity().contains(lIIIlllIlIlIl[lIIIlllIllIlI[66]]) ? 1 : 0) && e.lIlIIlIIllIlIIl(world.getActivity().contains(lIIIlllIlIlIl[lIIIlllIllIlI[67]]) ? 1 : 0) && e.lIlIIlIIllIlIIl(world.getActivity().contains(lIIIlllIlIlIl[lIIIlllIllIlI[68]]) ? 1 : 0) && e.lIlIIlIIllIlIIl(world.getActivity().startsWith(lIIIlllIlIlIl[lIIIlllIllIlI[12]]) ? 1 : 0) && e.lIlIIlIIllIlIIl(world.getActivity().endsWith(lIIIlllIlIlIl[lIIIlllIllIlI[16]]) ? 1 : 0) && e.lIlIIlIIllIlIIl(world.getActivity().endsWith(lIIIlllIlIlIl[lIIIlllIllIlI[69]]) ? 1 : 0) && e.lIlIIlIIllIlIIl(world.getActivity().endsWith(lIIIlllIlIlIl[lIIIlllIllIlI[70]]) ? 1 : 0) && e.lIlIIlIIllIlIIl(world.getActivity().startsWith(lIIIlllIlIlIl[lIIIlllIllIlI[71]]) ? 1 : 0) && e.lIlIIlIIllIllll(world.getPlayerCount(), lIIIlllIllIlI[72])) {
                n2 = lIIIlllIllIlI[1];
                0;
                if ((0x60 ^ 0x64) < (0x2F ^ 0x2B)) {
                    return false;
                }
            } else {
                n2 = lIIIlllIllIlI[0];
            }
            return n2 != 0;
        });
        Worlds.hopTo((net.runelite.api.World)world2);
    }

    public static void a(String var3, String var49) {
        try {
            URL var31 = new URL(var3);
            HttpURLConnection var16 = (HttpURLConnection)var31.openConnection();
            var16.setRequestMethod(lIIIlllIlIlIl[lIIIlllIllIlI[45]]);
            var16.setRequestProperty(lIIIlllIlIlIl[lIIIlllIllIlI[46]], lIIIlllIlIlIl[lIIIlllIllIlI[8]]);
            var16.setDoOutput(lIIIlllIllIlI[1]);
            String var24 = "{\"content\": \"" + var49 + "\"}";
            DataOutputStream var27 = new DataOutputStream(var16.getOutputStream());
            var27.writeBytes(var24);
            var27.flush();
            var27.close();
            int var40 = var16.getResponseCode();
            System.out.println("Response Code: " + var40);
            var16.disconnect();
            0;
        }
        catch (Exception var31) {
            var31.printStackTrace();
        }
        if (1 >= 3) {
            return;
        }
    }

    private static boolean lIlIIlIIllIlIll(int n2) {
        return n2 != 0;
    }

    public static int u() {
        int n2 = e.c(lIIIlllIllIlI[0], ae.length - lIIIlllIllIlI[1]);
        return ae[n2];
    }

    public static void E() {
        if (e.lIlIIlIIllIlIlI(e.j(lIIIlllIllIlI[48]), lIIIlllIllIlI[1])) {
            Widget var42;
            if (e.lIlIIlIIllIlIIl(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)lIIIlllIllIlI[1]);
                0;
            }
            if (e.lIlIIlIIllIlIll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.lIlIIlIIllIlIII(var42 = Widgets.get((int)lIIIlllIllIlI[49], (int)lIIIlllIllIlI[50]))) {
                var42.interact(lIIIlllIlIlIl[lIIIlllIllIlI[52]]);
                Time.sleepTicks((int)lIIIlllIllIlI[1]);
                0;
            }
        }
    }

    public static boolean A() {
        boolean bl;
        if (e.lIlIIlIIllIlIII(Widgets.get((int)lIIIlllIllIlI[7], (int)lIIIlllIllIlI[1]))) {
            bl = lIIIlllIllIlI[1];
            0;
            if (((9 ^ 0x4A) & ~(0x7A ^ 0x39)) > 1) {
                return false;
            }
        } else {
            bl = lIIIlllIllIlI[0];
        }
        return bl;
    }

    private static void lIlIIlIIllIIllI() {
        lIIIlllIllIlI = new int[254];
        e.lIIIlllIllIlI[0] = (0x2F ^ 0x3C ^ (0xE3 ^ 0xC2)) & (63 + 124 - 69 + 35 ^ 39 + 169 - 176 + 139 ^ -1);
        e.lIIIlllIllIlI[1] = 1;
        e.lIIIlllIllIlI[2] = 2;
        e.lIIIlllIllIlI[3] = 140 + 168 - 125 + 13 ^ 64 + 140 - 134 + 122;
        e.lIIIlllIllIlI[4] = -(0xFFFFB7EF & 0x6C57) & (0xFFFFE7FF & 0x3EDE);
        e.lIIIlllIllIlI[5] = 101 + 47 - 32 + 31 ^ 59 + 78 - 4 + 9;
        e.lIIIlllIllIlI[6] = 3;
        e.lIIIlllIllIlI[7] = (0x51 ^ 0x14) + (39 + 40 - 0 + 54) - (156 + 41 - 77 + 58) + (0xC2 ^ 0xAC);
        e.lIIIlllIllIlI[8] = 0x16 ^ 0x39 ^ (0x1C ^ 0x24);
        e.lIIIlllIllIlI[9] = 0x59 ^ 0x48 ^ (0x85 ^ 0x93);
        e.lIIIlllIllIlI[10] = 0xFFFFBB6F & 0x7DFC;
        e.lIIIlllIllIlI[11] = 0x7E ^ 0xC ^ (0xD1 ^ 0xB0);
        e.lIIIlllIllIlI[12] = 0x57 ^ 0x77 ^ (2 ^ 0xA);
        e.lIIIlllIllIlI[13] = 0x22 ^ 0xE ^ (0x77 ^ 0x4F);
        e.lIIIlllIllIlI[14] = 0x5D ^ 0x58;
        e.lIIIlllIllIlI[15] = 0xFFFFBB6D & 0x7DFF;
        e.lIIIlllIllIlI[16] = 0x70 ^ 0x59;
        e.lIIIlllIllIlI[17] = 0x4F ^ 0x49;
        e.lIIIlllIllIlI[18] = 0xB ^ 0x5B ^ (0x29 ^ 0xD);
        e.lIIIlllIllIlI[19] = 0xDB ^ 0x97 ^ (0x79 ^ 0x15);
        e.lIIIlllIllIlI[20] = 0x6E ^ 0x66;
        e.lIIIlllIllIlI[21] = 0x6A ^ 0x5A ^ (0x24 ^ 0x1D);
        e.lIIIlllIllIlI[22] = 0x56 ^ 0x5C;
        e.lIIIlllIllIlI[23] = 0x91 ^ 0x9A;
        e.lIIIlllIllIlI[24] = 0x87 ^ 0x8B;
        e.lIIIlllIllIlI[25] = 0x95 ^ 0x98;
        e.lIIIlllIllIlI[26] = 157 + 76 - 63 + 3 ^ 87 + 149 - 212 + 139;
        e.lIIIlllIllIlI[27] = -(0xFFFFA54B & 0x7EF5) & (0xFFFFFE5D & 0x7DFF);
        e.lIIIlllIllIlI[28] = 95 + 161 - 160 + 84 ^ 127 + 153 - 120 + 27;
        e.lIIIlllIllIlI[29] = -(0xFFFFB6F5 & 0x7B4B) & (0xFFFFBFDD & 0x7BFF);
        e.lIIIlllIllIlI[30] = -(0xFFFFFA5F & 0x37A9) & (0xFFFFBFBF & 0x7F7F);
        e.lIIIlllIllIlI[31] = -(0xFFFFBFDB & 0x5467) & (0xFFFFDDDB & 0x3FFF);
        e.lIIIlllIllIlI[32] = 0xFFFF9DBA & 0x6F7D;
        e.lIIIlllIllIlI[33] = 80 + 135 - 84 + 30 ^ 79 + 78 - 116 + 89;
        e.lIIIlllIllIlI[34] = -(0xFFFFD68B & 0x3FF5) & (0xFFFFDFFF & 0x3FF7);
        e.lIIIlllIllIlI[35] = -(0xFFFFFEC3 & 0x73FD) & (0xFFFFFFFF & Short.MAX_VALUE);
        e.lIIIlllIllIlI[36] = 0x40 ^ 0x77 ^ (0x75 ^ 5);
        e.lIIIlllIllIlI[37] = 93 + 129 - 189 + 110;
        e.lIIIlllIllIlI[38] = -(0xFFFFFF87 & 0x367A) & (0xFFFFFF9D & 0x3FFF);
        e.lIIIlllIllIlI[39] = 0xFFFFBF79 & 0x4DDF;
        e.lIIIlllIllIlI[40] = 0xA3 ^ 0xB3;
        e.lIIIlllIllIlI[41] = 92 + 105 - 144 + 94 ^ 10 + 69 - -9 + 42;
        e.lIIIlllIllIlI[42] = 0x2D ^ 0x3F;
        e.lIIIlllIllIlI[43] = -(0xFFFFFAD7 & 0x77AF) & (0xFFFFFFFF & 0x7FBF);
        e.lIIIlllIllIlI[44] = -(0xFFFFFE3F & 0x71CB) & (0xFFFFFF5F & 0x7DEF);
        e.lIIIlllIllIlI[45] = 0x70 ^ 0x65;
        e.lIIIlllIllIlI[46] = 0x54 ^ 0x42;
        e.lIIIlllIllIlI[47] = -1;
        e.lIIIlllIllIlI[48] = 16 + 130 - 119 + 145;
        e.lIIIlllIllIlI[49] = -(0xFFFFFDFF & 0x4FAF) & (0xFFFFCFFF & Short.MAX_VALUE);
        e.lIIIlllIllIlI[50] = 0x5F ^ 0x41;
        e.lIIIlllIllIlI[51] = 0x4F ^ 0x57;
        e.lIIIlllIllIlI[52] = 80 + 101 - 43 + 51 ^ 3 + 53 - -36 + 72;
        e.lIIIlllIllIlI[53] = 0x6D ^ 0x53 ^ (0xF ^ 0x2B);
        e.lIIIlllIllIlI[54] = 0x64 ^ 0x7F;
        e.lIIIlllIllIlI[55] = 0xDA ^ 0xC6;
        e.lIIIlllIllIlI[56] = 0x32 ^ 0x35 ^ (0x68 ^ 0x70);
        e.lIIIlllIllIlI[57] = 0x5E ^ 0x79 ^ (0x26 ^ 0x33);
        e.lIIIlllIllIlI[58] = 114 + 150 - 166 + 55;
        e.lIIIlllIllIlI[59] = 0x56 ^ 0x33;
        e.lIIIlllIllIlI[60] = -(0xFFFFBCF3 & 0x7B2E) & (0xFFFFFFFF & 0x3FBF);
        e.lIIIlllIllIlI[61] = 0x1A ^ 0x3B;
        e.lIIIlllIllIlI[62] = 0x52 ^ 0x37 ^ (0x3D ^ 0x7A);
        e.lIIIlllIllIlI[63] = 0x23 ^ 7;
        e.lIIIlllIllIlI[64] = -(0xFFFFEB2E & 0x7ED7) & (0xFFFFFFDF & 0x6BFF);
        e.lIIIlllIllIlI[65] = 0xFFFFC2DF & 0x3F35;
        e.lIIIlllIllIlI[66] = 0x54 ^ 0x2A ^ (0x53 ^ 8);
        e.lIIIlllIllIlI[67] = 0x41 ^ 0x13 ^ (0xE ^ 0x7A);
        e.lIIIlllIllIlI[68] = 0x34 ^ 0x13;
        e.lIIIlllIllIlI[69] = 0xA ^ 0x32 ^ (0x6E ^ 0x7C);
        e.lIIIlllIllIlI[70] = 0x46 ^ 0x6D;
        e.lIIIlllIllIlI[71] = 36 + 46 - -4 + 53 ^ 3 + 101 - 62 + 125;
        e.lIIIlllIllIlI[72] = 175 + 120 - 102 + 15 ^ 138 + 156 - 257 + 143;
        e.lIIIlllIllIlI[73] = 3 ^ 0x2E;
        e.lIIIlllIllIlI[74] = (0x42 ^ 6) + (194 + 131 - 115 + 11) - (0x14 ^ 0x5D) + (0x82 ^ 0x8D);
        e.lIIIlllIllIlI[75] = 135 + 26 - 49 + 80 + (0xDD ^ 0x92) - (64 + 82 - 30 + 113) + (131 + 54 - 86 + 88);
        e.lIIIlllIllIlI[76] = 77 + 126 - 195 + 150 ^ 27 + 133 - 13 + 29;
        e.lIIIlllIllIlI[77] = 91 + 91 - 56 + 41 + (0x71 ^ 0x58) - 2 + (0x67 ^ 0x6C);
        e.lIIIlllIllIlI[78] = 32 + 148 - 106 + 119;
        e.lIIIlllIllIlI[79] = 137 + 156 - 259 + 185;
        e.lIIIlllIllIlI[80] = 0xFFFFFCFF & 0xF76;
        e.lIIIlllIllIlI[81] = -(0xFFFFCA4B & 0x77B5) & (0xFFFFFF7F & 0x4EFD);
        e.lIIIlllIllIlI[82] = 0x37 ^ 7;
        e.lIIIlllIllIlI[83] = -(0xFFFFF107 & 0x6FF9) & (0xFFFFFDFF & 0x6F7E);
        e.lIIIlllIllIlI[84] = -(0xFFFFF25D & 0x7DFE) & (0xFFFFFDFF & 0x7EDF);
        e.lIIIlllIllIlI[85] = 0xFFFFFEF6 & 0xD79;
        e.lIIIlllIllIlI[86] = 0xFFFFDF6F & 0x2DFD;
        e.lIIIlllIllIlI[87] = 0xDE ^ 0xB5;
        e.lIIIlllIllIlI[88] = -(0xFFFFB6DA & 0x4F27) & (0xFFFF8FDF & 0x777B);
        e.lIIIlllIllIlI[89] = 0xFFFFA1BB & 0x5F76;
        e.lIIIlllIllIlI[90] = -(0xFFFFFBC5 & 0x2E7B) & (0xFFFFFBFF & 0x2F76);
        e.lIIIlllIllIlI[91] = -(0xFFFFF68F & 0x7FFB) & (0xFFFFF7EA & Short.MAX_VALUE);
        e.lIIIlllIllIlI[92] = -(0xFFFF9C9F & 0x7BFD) & (0xFFFFBDFF & 0x5BFF);
        e.lIIIlllIllIlI[93] = 0xFFFF9FEE & 0x6175;
        e.lIIIlllIllIlI[94] = -(0xFFFFBFFB & 0x748F) & (0xFFFFB5EF & Short.MAX_VALUE);
        e.lIIIlllIllIlI[95] = 0xFFFFADEE & 0x5377;
        e.lIIIlllIllIlI[96] = -(0xFFFFF33B & 0x6CFE) & (0xFFFFF1FB & 0x6FBF);
        e.lIIIlllIllIlI[97] = -(0xFFFFBAD7 & 0x576D) & (0xFFFFFFFF & 0x13CF);
        e.lIIIlllIllIlI[98] = -(0xFFFFEE3B & 0x7FEE) & (0xFFFFEFFF & 0x7FFB);
        e.lIIIlllIllIlI[99] = 0xFFFFE9EF & 0x17FE;
        e.lIIIlllIllIlI[100] = -(0xFFFFFFEB & 0x5E15) & (0xFFFFDFEF & Short.MAX_VALUE);
        e.lIIIlllIllIlI[101] = -(0xFFFFF71F & 0x3EE3) & (0xFFFFFFF6 & 0x37FB);
        e.lIIIlllIllIlI[102] = 0xFFFFE69F & 0x1B78;
        e.lIIIlllIllIlI[103] = 0xFFFFA7CE & 0x5A35;
        e.lIIIlllIllIlI[104] = 0xFFFF8FFB & 0x713E;
        e.lIIIlllIllIlI[105] = -(0xFFFF99F3 & 0x7E0D) & (0xFFFF9DEB & 0x7BFF);
        e.lIIIlllIllIlI[106] = -(0xFFFFFAD7 & 0x7FB9) & (0xFFFFFFDF & 0x7BFE);
        e.lIIIlllIllIlI[107] = 0xFFFFFD67 & 0x3FA;
        e.lIIIlllIllIlI[108] = 0xFFFFD9FD & 0x27DF;
        e.lIIIlllIllIlI[109] = -(0xFFFFFB2B & 0x5EFE) & (0xFFFFDB7F & 0x7FEB);
        e.lIIIlllIllIlI[110] = 0xFFFFA1FD & 0x5F33;
        e.lIIIlllIllIlI[111] = -(0xFFFFFEAD & 0x3FD3) & (0xFFFFBFFB & 0x7FBF);
        e.lIIIlllIllIlI[112] = -(0xFFFFFFDD & 0x7227) & (0xFFFFFFFF & 0x7376);
        e.lIIIlllIllIlI[113] = 0xFFFF85CD & 0x7B76;
        e.lIIIlllIllIlI[114] = 0xFFFF996D & 0x67D7;
        e.lIIIlllIllIlI[115] = -(0xFFFFDACF & 0x6DB5) & (0xFFFFDBEF & 0x6DDC);
        e.lIIIlllIllIlI[116] = -(0xFFFFC777 & 0x7E89) & (0xFFFFD7FF & 0x6FBD);
        e.lIIIlllIllIlI[117] = -(0xFFFFFF6D & 0x5696) & (0xFFFFFFDF & 0x57F3);
        e.lIIIlllIllIlI[118] = -(0xFFFFBDF1 & 0x5A0F) & (0xFFFFFFDE & 0x19FF);
        e.lIIIlllIllIlI[119] = 0xFFFFABEE & 0x55FB;
        e.lIIIlllIllIlI[120] = -(0xFFFF99D6 & 0x762B) & (0xFFFFDBED & 0x35FF);
        e.lIIIlllIllIlI[121] = -(0xFFFFC57D & 0x7E87) & (0xFFFFFFFF & 0x45FF);
        e.lIIIlllIllIlI[122] = -(0xFFFFAF71 & 0x74FF) & (0xFFFFB77E & 0x6EFB);
        e.lIIIlllIllIlI[123] = 0xFFFFC7CB & 0x397E;
        e.lIIIlllIllIlI[124] = -(0xFFFFE72F & 0x7CDB) & (0xFFFFEDFB & 0x77DF);
        e.lIIIlllIllIlI[125] = -(0xFFFFFBFF & 0x65F6) & (0xFFFFE3F5 & Short.MAX_VALUE);
        e.lIIIlllIllIlI[126] = 0xFFFFCBFF & 0x362F;
        e.lIIIlllIllIlI[127] = -(0xFFFFFF13 & 0x7AEF) & (0xFFFFFFFB & 0x7B7F);
        e.lIIIlllIllIlI[128] = 0xFFFFFBFF & 0x54C;
        e.lIIIlllIllIlI[129] = -(0xFFFFBA6F & 0x7793) & (0xFFFFB7FF & 0x7BFB);
        e.lIIIlllIllIlI[130] = -(0xFFFFD96D & 0x3EBF) & (0xFFFFB9FF & 0x5F7D);
        e.lIIIlllIllIlI[131] = 0xFFFFDB8E & 0x2673;
        e.lIIIlllIllIlI[132] = 0xFFFFA747 & 0x59FF;
        e.lIIIlllIllIlI[133] = -(0xFFFFF3DF & 0x6E3F) & (0xFFFFF7FE & 0x6BFF);
        e.lIIIlllIllIlI[134] = -(0xFFFFE3EF & 0x1EB6) & (0xFFFFAFFF & 0x53FD);
        e.lIIIlllIllIlI[135] = 0x51 ^ 0x7E;
        e.lIIIlllIllIlI[136] = 0xFFFF85FF & 0x7BDF;
        e.lIIIlllIllIlI[137] = -(0xFFFFBFDF & 0x4A31) & (0xFFFFEBFD & 0x1FFF);
        e.lIIIlllIllIlI[138] = 0x18 ^ 0x29;
        e.lIIIlllIllIlI[139] = 0xFFFFE356 & 0x1DFF;
        e.lIIIlllIllIlI[140] = -(0xFFFFE492 & 0x5F6F) & (0xFFFFCFFF & 0x75BF);
        e.lIIIlllIllIlI[141] = 0x1A ^ 0x29;
        e.lIIIlllIllIlI[142] = -(0xFFFFECB9 & 0x7F7F) & (0xFFFFFFF8 & 0x6D7F);
        e.lIIIlllIllIlI[143] = 0xBA ^ 0x8E ^ (0x51 ^ 0xA) & ~(0x3F ^ 0x64);
        e.lIIIlllIllIlI[144] = -(0xFFFFE6DA & 0x7DA7) & (0xFFFFFDFF & 0x67DF);
        e.lIIIlllIllIlI[145] = 53 + 114 - 38 + 50 ^ 19 + 16 - -24 + 75;
        e.lIIIlllIllIlI[146] = 0xFFFFF9FD & 0x743;
        e.lIIIlllIllIlI[147] = 0xB5 ^ 0x83;
        e.lIIIlllIllIlI[148] = 0xFFFFEF7F & 0x11D5;
        e.lIIIlllIllIlI[149] = 0x9F ^ 0x9A ^ (0x4C ^ 0x7E);
        e.lIIIlllIllIlI[150] = 0xFFFF95FF & 0x6BA6;
        e.lIIIlllIllIlI[151] = 0x35 ^ 0xD;
        e.lIIIlllIllIlI[152] = 0xFFFF99DF & 0x67EF;
        e.lIIIlllIllIlI[153] = 0xBE ^ 0x87;
        e.lIIIlllIllIlI[154] = -(0xFFFFF6C7 & 0x2BBA) & (0xFFFFFFF7 & 0x23FF);
        e.lIIIlllIllIlI[155] = 17 + 81 - -34 + 24 ^ 88 + 86 - 63 + 55;
        e.lIIIlllIllIlI[156] = 0xFFFFBFFF & 0x4178;
        e.lIIIlllIllIlI[157] = 0x1E ^ 0x54 ^ (0x39 ^ 0x48);
        e.lIIIlllIllIlI[158] = 0xFFFFE35C & 0x1DF3;
        e.lIIIlllIllIlI[159] = 0x8B ^ 0xB7;
        e.lIIIlllIllIlI[160] = 0xFFFFED59 & 0x13EF;
        e.lIIIlllIllIlI[161] = 0xFE ^ 0xC3;
        e.lIIIlllIllIlI[162] = -(0xFFFFF7F5 & 0x7AAF) & (0xFFFFF3EF & Short.MAX_VALUE);
        e.lIIIlllIllIlI[163] = 0xB5 ^ 0x8B;
        e.lIIIlllIllIlI[164] = 0xFFFFD1FF & 0x2F4D;
        e.lIIIlllIllIlI[165] = 0x78 ^ 0x28 ^ (0x54 ^ 0x3B);
        e.lIIIlllIllIlI[166] = -(0xFFFFFAD5 & 0x776E) & (0xFFFFFFF3 & 0x737F);
        e.lIIIlllIllIlI[167] = 0x7A ^ 0x38 ^ 2;
        e.lIIIlllIllIlI[168] = -(0xFFFFF619 & 0x7DF7) & (0xFFFFF77E & 0x7DFB);
        e.lIIIlllIllIlI[169] = 0xB2 ^ 0xA0 ^ (0xE0 ^ 0xB3);
        e.lIIIlllIllIlI[170] = -(0xFFFFCEBD & 0x7DFB) & (0xFFFFEDFB & 0x5FFF);
        e.lIIIlllIllIlI[171] = 0xC6 ^ 0x84;
        e.lIIIlllIllIlI[172] = -(0xFFFFAE65 & 0x7FDB) & (0xFFFFBFF3 & 0x6F7F);
        e.lIIIlllIllIlI[173] = 0x3D ^ 0x7E;
        e.lIIIlllIllIlI[174] = 0xFFFFA5B7 & 0x5B7D;
        e.lIIIlllIllIlI[175] = 0x66 ^ 0x1A ^ (0xA9 ^ 0x91);
        e.lIIIlllIllIlI[176] = 0xFFFFA9FF & 0x5737;
        e.lIIIlllIllIlI[177] = 0x1F ^ 0x5A;
        e.lIIIlllIllIlI[178] = -(0xFFFF9E89 & 0x7377) & (0xFFFFFFF7 & 0x137F);
        e.lIIIlllIllIlI[179] = 0xF6 ^ 0xB0;
        e.lIIIlllIllIlI[180] = 0xFFFFF3FF & 0xD7A;
        e.lIIIlllIllIlI[181] = -(0xFFFFEDFF & 0x7FD5) & (0xFFFFFFD7 & 0x6FFD);
        e.lIIIlllIllIlI[182] = 0xD5 ^ 0xA4 ^ (0x53 ^ 0x6A);
        e.lIIIlllIllIlI[183] = -(0xFFFFFAF5 & 0x77CB) & (0xFFFFFFEF & 0x73FF);
        e.lIIIlllIllIlI[184] = 0x26 ^ 0x6F;
        e.lIIIlllIllIlI[185] = -(0xFFFFFFFF & 0x4A05) & (0xFFFFEF3E & 0x5BFD);
        e.lIIIlllIllIlI[186] = 180 + 14 - 167 + 214 ^ 154 + 138 - 153 + 48;
        e.lIIIlllIllIlI[187] = 0xFFFFD7BB & 0x297D;
        e.lIIIlllIllIlI[188] = 42 + 30 - -52 + 78 ^ 43 + 111 - 112 + 87;
        e.lIIIlllIllIlI[189] = -(0xFFFFBEED & 0x6FD3) & (0xFFFFEFFF & 0x3FFD);
        e.lIIIlllIllIlI[190] = 8 ^ 0x44;
        e.lIIIlllIllIlI[191] = 0xFFFF815B & 0x7FF7;
        e.lIIIlllIllIlI[192] = 9 ^ 0x49 ^ (0xC9 ^ 0xC4);
        e.lIIIlllIllIlI[193] = -(0xFFFFCD3A & 0x7ACF) & (0xFFFFEF7F & 0x59DD);
        e.lIIIlllIllIlI[194] = 0x17 ^ 0x59;
        e.lIIIlllIllIlI[195] = -(0xFFFFF579 & 0x5A8F) & (0xFFFFF1FF & 0x5F5F);
        e.lIIIlllIllIlI[196] = 0x24 ^ 0x6B;
        e.lIIIlllIllIlI[197] = 0xFFFFB3FB & 0x4D5F;
        e.lIIIlllIllIlI[198] = 0x5D ^ 0x4A ^ (0x4B ^ 0xC);
        e.lIIIlllIllIlI[199] = -(0xFFFFFEAB & 0x35F6) & (0xFFFFFFFD & 0x35FF);
        e.lIIIlllIllIlI[200] = 0x30 ^ 0x61;
        e.lIIIlllIllIlI[201] = -(0xFFFFBAE1 & 0x7F1F) & (0xFFFFFB7F & 0x3FDF);
        e.lIIIlllIllIlI[202] = 0x67 ^ 0x35;
        e.lIIIlllIllIlI[203] = -(0xFFFFFDF5 & 0x668B) & (0xFFFFF5EF & 0x6FF7);
        e.lIIIlllIllIlI[204] = 0xD ^ 0x5E;
        e.lIIIlllIllIlI[205] = -(0xFFFFFE5B & 0x3FAC) & (0xFFFFBF6F & Short.MAX_VALUE);
        e.lIIIlllIllIlI[206] = 0x62 ^ 0x36;
        e.lIIIlllIllIlI[207] = 0xFFFF8B7F & 0x75EF;
        e.lIIIlllIllIlI[208] = 125 + 136 - 133 + 16 ^ 61 + 104 - 88 + 120;
        e.lIIIlllIllIlI[209] = 0xFFFF8BF7 & 0x7578;
        e.lIIIlllIllIlI[210] = 0x66 ^ 0x43 ^ (0x41 ^ 0x32);
        e.lIIIlllIllIlI[211] = 0xFFFFE1F1 & 0x1FEF;
        e.lIIIlllIllIlI[212] = 221 + 77 - 296 + 228 ^ 13 + 32 - -106 + 26;
        e.lIIIlllIllIlI[213] = -(0xFFFFD702 & 0x2EFF) & (0xFFFF8FFF & 0x77E3);
        e.lIIIlllIllIlI[214] = 0x78 ^ 0x27 ^ (0x1E ^ 0x19);
        e.lIIIlllIllIlI[215] = 0xFFFF81ED & 0x7FF6;
        e.lIIIlllIllIlI[216] = 185 + 165 - 333 + 205 ^ 126 + 54 - 120 + 75;
        e.lIIIlllIllIlI[217] = -(0xFFFFFF3B & 0x7AD5) & (0xFFFFFFF7 & 0x7BFD);
        e.lIIIlllIllIlI[218] = 0xD0 ^ 0x8A;
        e.lIIIlllIllIlI[219] = 0xFFFFEBF6 & 0x15EF;
        e.lIIIlllIllIlI[220] = 96 + 110 - 132 + 85 ^ 57 + 43 - -6 + 90;
        e.lIIIlllIllIlI[221] = -(0xFFFFFFBD & 0x4C53) & (0xFFFFEDF7 & 0x5FFF);
        e.lIIIlllIllIlI[222] = 0xA2 ^ 0x8C ^ (0x3F ^ 0x4D);
        e.lIIIlllIllIlI[223] = -(0xFFFFFFFE & 0x7E17) & (0xFFFFFFFF & 0x7FFD);
        e.lIIIlllIllIlI[224] = 0x21 ^ 0x7C;
        e.lIIIlllIllIlI[225] = 0xFFFFD1EF & 0x2FF9;
        e.lIIIlllIllIlI[226] = 2 ^ 0x15 ^ (0x62 ^ 0x2B);
        e.lIIIlllIllIlI[227] = 0xFFFFF3FE & 0xDFB;
        e.lIIIlllIllIlI[228] = 0x2E ^ 0x71;
        e.lIIIlllIllIlI[229] = -(0xFFFFFF67 & 0x369A) & (0xFFFFF7FD & 0x3FFF);
        e.lIIIlllIllIlI[230] = 0x4F ^ 0x2F;
        e.lIIIlllIllIlI[231] = -(0xFFFFA5FB & 0x7A07) & (0xFFFFE9FF & 0x37FF);
        e.lIIIlllIllIlI[232] = 0xC1 ^ 0xA0;
        e.lIIIlllIllIlI[233] = -(0xFFFFF575 & 0x7E8B) & (0xFFFFF5FE & Short.MAX_VALUE);
        e.lIIIlllIllIlI[234] = 6 ^ 0x11 ^ (0x4C ^ 0x39);
        e.lIIIlllIllIlI[235] = -(0xFFFFE61F & 0x7FE1) & (0xFFFFE7FF & Short.MAX_VALUE);
        e.lIIIlllIllIlI[236] = 0x4E ^ 0x2D;
        e.lIIIlllIllIlI[237] = -(0xFFFF97DF & 0x7C79) & (0xFFFFFEFF & 0x175D);
        e.lIIIlllIllIlI[238] = 0xFFFFB2EE & 0x4F17;
        e.lIIIlllIllIlI[239] = -(0xFFFFFFFF & 0x55E9) & (0xFFFFD7FF & 0x7FEF);
        e.lIIIlllIllIlI[240] = 0x68 ^ 0x22 ^ (0x11 ^ 0x3D);
        e.lIIIlllIllIlI[241] = -(0xFFFFEFD1 & 0x152F) & (0xFFFFB74B & 0x4FBC);
        e.lIIIlllIllIlI[242] = 0xDD ^ 0xBA;
        e.lIIIlllIllIlI[243] = 0xFFFFAF2F & 0x52D9;
        e.lIIIlllIllIlI[244] = 0xA6 ^ 0xBD ^ (0x22 ^ 0x51);
        e.lIIIlllIllIlI[245] = -(0xFFFFD83F & 0x77F5) & (0xFFFFF63F & 0x5BFF);
        e.lIIIlllIllIlI[246] = 0x69 ^ 0;
        e.lIIIlllIllIlI[247] = -(0xFFFFF53E & 0x7FC3) & (0xFFFFFFDF & 0x772D);
        e.lIIIlllIllIlI[248] = 0xDC ^ 0xB6;
        e.lIIIlllIllIlI[249] = 0xFFFFDADF & 0x272D;
        e.lIIIlllIllIlI[250] = 0xFFFF9EED & 0x6D9A;
        e.lIIIlllIllIlI[251] = 0xFFFFDCBF & 0x2FD3;
        e.lIIIlllIllIlI[252] = -(0xFFFFD553 & 0x7ABD) & (0xFFFFFBBF & 0x5FDD);
        e.lIIIlllIllIlI[253] = -(0xFFFFBE76 & 0x719B) & (0xFFFFFDD7 & 0x3F3D);
    }

    public static boolean G() {
        int n2;
        if (!e.lIlIIlIIllIlIIl(S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.lIlIIlIIllIlIIl(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.lIlIIlIIllIllll(Players.getLocal().getWorldLocation().distanceTo(af), lIIIlllIllIlI[57]) || e.lIlIIlIIllIlIll(ag.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = lIIIlllIllIlI[1];
            0;
            if (2 == 1) {
                return false;
            }
        } else {
            n2 = lIIIlllIllIlI[0];
        }
        return n2 != 0;
    }

    public static void c(String string) {
        FileWriter fileWriter = new FileWriter(lIIIlllIlIlIl[lIIIlllIllIlI[1]]);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(string + System.getProperty(lIIIlllIlIlIl[lIIIlllIllIlI[2]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static long a(long l2) {
        return e.t() - l2;
    }

    public static void w() {
        if (e.lIlIIlIIllIlIll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks((int)lIIIlllIllIlI[3]);
            0;
        }
        if (e.lIlIIlIIllIlIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.lIlIIlIIllIlIIl(Bank.isOpen() ? 1 : 0)) {
            e.C();
        }
    }

    public static double v() {
        double d2 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS);
        double d3 = Skills.getLevel((Skill)Skill.HITPOINTS);
        return d2 / d3 * 100.0;
    }

    public static long t() {
        return U + (System.nanoTime() - V) / 1000000L;
    }

    private static boolean lIlIIlIIllIlIII(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIIllIllIl(int n2, int n3) {
        return n2 != n3;
    }

    public static void D() {
        if (e.lIlIIlIIllIlIIl(e.j(lIIIlllIllIlI[48]))) {
            Widget var46;
            if (e.lIlIIlIIllIlIIl(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)lIIIlllIllIlI[1]);
                0;
            }
            if (e.lIlIIlIIllIlIll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.lIlIIlIIllIlIII(var46 = Widgets.get((int)lIIIlllIllIlI[49], (int)lIIIlllIllIlI[50]))) {
                var46.interact(lIIIlllIlIlIl[lIIIlllIllIlI[51]]);
                Time.sleepTicks((int)lIIIlllIllIlI[1]);
                0;
            }
        }
    }

    public static void F() {
        block9: {
            int var13 = lIIIlllIllIlI[0];
            do {
                String[] stringArray = new String[lIIIlllIllIlI[1]];
                stringArray[e.lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[53]];
                if (!e.lIlIIlIIllIlIII(TileObjects.getNearest((String[])stringArray)) || !e.lIlIIlIIllIlIIl(AccBuilderRat.d ? 1 : 0)) break block9;
                AccBuilderRat.c = lIIIlllIlIlIl[lIIIlllIllIlI[54]];
                String[] stringArray2 = new String[lIIIlllIllIlI[1]];
                stringArray2[e.lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[55]];
                NPC var18 = NPCs.getNearest((String[])stringArray2);
                if (e.lIlIIlIIllIlIIl(var13)) {
                    if (e.lIlIIlIIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                        var18.interact(lIIIlllIlIlIl[lIIIlllIllIlI[5]]);
                    }
                    if (e.lIlIIlIIllIlIll(Dialog.isOpen() ? 1 : 0)) {
                        List var19;
                        if (e.lIlIIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) && e.lIlIIlIIllIlIIl(Dialog.canContinue() ? 1 : 0) && e.lIlIIlIIllIlIIl((var19 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                            List var15 = var19.stream().filter(widget -> {
                                boolean bl;
                                if (e.lIlIIlIIllIlIIl(widget.getText().contains(lIIIlllIlIlIl[lIIIlllIllIlI[19]]) ? 1 : 0)) {
                                    bl = lIIIlllIllIlI[1];
                                    0;
                                    if (-1 >= (0xD0 ^ 0x90 ^ (0xD5 ^ 0x91))) {
                                        return ((0xA3 ^ 0xAC ^ 3) & (0x11 ^ 0x30 ^ (0xB6 ^ 0x9B) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIlllIllIlI[0];
                                }
                                return bl;
                            }).collect(Collectors.toList());
                            if (e.lIlIIlIIllIlIIl(var15.isEmpty() ? 1 : 0)) {
                                Mouse.click((int)((Widget)var15.get(lIIIlllIllIlI[0])).getClickPoint().getX(), (int)((Widget)var15.get(lIIIlllIllIlI[0])).getClickPoint().getY(), (boolean)lIIIlllIllIlI[1]);
                                Time.sleepTicks((int)lIIIlllIllIlI[6]);
                                0;
                            }
                            if (e.lIlIIlIIllIlIlI(var15.size(), lIIIlllIllIlI[1])) {
                                var13 = lIIIlllIllIlI[1];
                            }
                        }
                        if (!e.lIlIIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || e.lIlIIlIIllIlIll(Dialog.canContinue() ? 1 : 0)) {
                            Dialog.continueSpace();
                        }
                    }
                }
                if (e.lIlIIlIIllIlIll(var13)) {
                    String[] stringArray3 = new String[lIIIlllIllIlI[1]];
                    stringArray3[e.lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[50]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIIlllIlIlIl[lIIIlllIllIlI[56]]);
                    Time.sleepTicks((int)lIIIlllIllIlI[14]);
                    0;
                }
                Time.sleepTicks((int)lIIIlllIllIlI[1]);
                0;
                0;
            } while ((72 + 177 - 153 + 85 ^ 93 + 9 - 52 + 127) != 0);
            return;
        }
    }

    private static boolean lIlIIlIIllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static int c(int n2, int n3) {
        void var37;
        int var2;
        int var22;
        int n4 = n3 - n2;
        if (e.lIlIIlIIllIlIIl(n4)) {
            return var22;
        }
        if (e.lIlIIlIIllIlIlI(Math.abs(var2), lIIIlllIllIlI[1])) {
            int n5;
            if (e.lIlIIlIIllIlIll(R.nextBoolean() ? 1 : 0)) {
                n5 = var22;
                0;
                if ((0x1C ^ 0x18) < (0x95 ^ 0x91)) {
                    return (0x6C ^ 0x28) & ~(0xCC ^ 0x88);
                }
            } else {
                n5 = var37;
            }
            return n5;
        }
        if (e.lIlIIlIIllIllII(var2)) {
            var2 = var22;
            var22 = var37;
            n3 = var2;
        }
        return n2 + R.nextInt(n3 - n2 + lIIIlllIllIlI[1]);
    }

    /*
     * WARNING - void declaration
     */
    public static void b(WorldPoint worldPoint) {
        void var7_7;
        void var5_5;
        void var4_4;
        int n2;
        int n3;
        int var1;
        void var38;
        WorldPoint var43;
        Client client = Static.getClient();
        Player player = client.getLocalPlayer();
        if (e.lIlIIlIIllIlllI(player)) {
            return;
        }
        WorldPoint var5 = var43;
        int var8 = var5.getX() - var38.getBaseX();
        Point var47 = Perspective.localToCanvas((Client)var38, (LocalPoint)LocalPoint.fromScene((int)var8, (int)(var1 = var5.getY() - var38.getBaseY())), (int)var38.getPlane());
        if (e.lIlIIlIIllIlIII(var47)) {
            n3 = var47.getX();
            0;
            if (((0x77 ^ 0x53) & ~(0x24 ^ 0)) > 0) {
                return;
            }
        } else {
            int var6;
            n3 = var6 = lIIIlllIllIlI[47];
        }
        if (e.lIlIIlIIllIlIII(var47)) {
            n2 = var47.getY();
            0;
            if (3 <= 0) {
                return;
            }
        } else {
            n2 = lIIIlllIllIlI[47];
        }
        int n4 = n2;
        client.interact(lIIIlllIllIlI[0], MenuAction.WALK.getId(), (int)var4_4, (int)var5_5, (int)var7_7, n4);
    }

    public static String b(long l2) {
        Object[] objectArray = new Object[lIIIlllIllIlI[1]];
        objectArray[e.lIIIlllIllIlI[0]] = lIIIlllIllIlI[2];
        String string = String.format(lIIIlllIlIlIl[lIIIlllIllIlI[0]], objectArray);
        Object[] objectArray2 = new Object[lIIIlllIllIlI[1]];
        objectArray2[e.lIIIlllIllIlI[0]] = (l2 /= 1000L) % 60L;
        String string2 = String.format(string, objectArray2);
        Object[] objectArray3 = new Object[lIIIlllIllIlI[1]];
        objectArray3[e.lIIIlllIllIlI[0]] = l2 % 3600L / 60L;
        String string3 = String.format(string, objectArray3);
        Object[] objectArray4 = new Object[lIIIlllIllIlI[1]];
        objectArray4[e.lIIIlllIllIlI[0]] = l2 / 3600L;
        String string4 = String.format(string, objectArray4);
        String string5 = string4 + ":" + string3 + ":" + string2;
        return string5;
    }
}

