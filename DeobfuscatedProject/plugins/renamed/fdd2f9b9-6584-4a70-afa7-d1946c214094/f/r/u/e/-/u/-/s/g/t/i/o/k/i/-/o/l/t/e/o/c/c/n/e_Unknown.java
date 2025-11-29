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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.n_Unknown;
import gg.squire.account.AccBuilderRogues;
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
import java.util.Iterator;
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
import net.runelite.api.World;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.WorldResult;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
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

public class e_Unknown {
    private static final /* synthetic */ long V;
    static /* synthetic */ WorldArea ab;
    private static final /* synthetic */ Map<Integer, Integer> X;
    public static /* synthetic */ int[] Z;
    static /* synthetic */ WorldPoint aa;
    static final /* synthetic */ WorldArea U;
    private static /* synthetic */ int[] lIIIlIIIll;
    private static final /* synthetic */ long W;
    private static /* synthetic */ String[] lIIIlIIIlI;
    static final /* synthetic */ WorldArea T;
    public static final /* synthetic */ ThreadLocalRandom S;
    public static final /* synthetic */ String R;
    public static /* synthetic */ WorldPoint Y;

    public static void D() {
        if (e.lllIlIIIIlII(e.j(lIIIlIIIll[63]), lIIIlIIIll[0])) {
            Widget lIllIlllIIlI;
            if (e.lllIlIIIIIll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)lIIIlIIIll[0]);
                0;
            }
            if (e.lllIlIIIIlIl(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.lllIlIIIlIIl(lIllIlllIIlI = Widgets.get((int)lIIIlIIIll[64], (int)lIIIlIIIll[54]))) {
                lIllIlllIIlI.interact(lIIIlIIIlI[lIIIlIIIll[66]]);
                Time.sleepTicks((int)lIIIlIIIll[0]);
                0;
            }
        }
    }

    public static int j(int n2) {
        return (Integer)GameThread.invokeLater(() -> Static.getClient().getVarpValue(n2));
    }

    /*
     * WARNING - void declaration
     */
    public static int c(int n2, int n3) {
        void lIllllIIlIll;
        int lIllllIIlIlI;
        int lIllllIIllII;
        int n4 = n3 - n2;
        if (e.lllIlIIIIIll(n4)) {
            return lIllllIIllII;
        }
        if (e.lllIlIIIIlII(Math.abs(lIllllIIlIlI), lIIIlIIIll[0])) {
            int n5;
            if (e.lllIlIIIIlIl(S.nextBoolean() ? 1 : 0)) {
                n5 = lIllllIIllII;
                0;
                if (2 <= 1) {
                    return (0xEC ^ 0x88 ^ (0xE4 ^ 0xBF)) & (0xF6 ^ 0xAB ^ (0x6D ^ 0xF) ^ -1);
                }
            } else {
                n5 = lIllllIIlIll;
            }
            return n5;
        }
        if (e.lllIlIIIIllI(lIllllIIlIlI)) {
            lIllllIIlIlI = lIllllIIllII;
            lIllllIIllII = lIllllIIlIll;
            n3 = lIllllIIlIlI;
        }
        return n2 + S.nextInt(n3 - n2 + lIIIlIIIll[0]);
    }

    private static boolean lllIlIIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    static {
        e.lllIlIIIIIlI();
        e.lllIIlllIlll();
        R = lIIIlIIIlI[lIIIlIIIll[91]];
        S = ThreadLocalRandom.current();
        T = new WorldArea(lIIIlIIIll[92], lIIIlIIIll[93], lIIIlIIIll[71], lIIIlIIIll[77], lIIIlIIIll[2]);
        U = new WorldArea(lIIIlIIIll[94], lIIIlIIIll[95], lIIIlIIIll[26], lIIIlIIIll[54], lIIIlIIIll[0]);
        V = System.currentTimeMillis();
        W = System.nanoTime();
        X = new HashMap<Integer, Integer>();
        Y = new WorldPoint(lIIIlIIIll[96], lIIIlIIIll[97], lIIIlIIIll[2]);
        int[] nArray = new int[lIIIlIIIll[98]];
        nArray[e.lIIIlIIIll[2]] = lIIIlIIIll[99];
        nArray[e.lIIIlIIIll[0]] = lIIIlIIIll[100];
        nArray[e.lIIIlIIIll[3]] = lIIIlIIIll[101];
        nArray[e.lIIIlIIIll[1]] = lIIIlIIIll[102];
        nArray[e.lIIIlIIIll[4]] = lIIIlIIIll[103];
        nArray[e.lIIIlIIIll[5]] = lIIIlIIIll[104];
        nArray[e.lIIIlIIIll[6]] = lIIIlIIIll[105];
        nArray[e.lIIIlIIIll[7]] = lIIIlIIIll[106];
        nArray[e.lIIIlIIIll[8]] = lIIIlIIIll[107];
        nArray[e.lIIIlIIIll[9]] = lIIIlIIIll[108];
        nArray[e.lIIIlIIIll[10]] = lIIIlIIIll[109];
        nArray[e.lIIIlIIIll[11]] = lIIIlIIIll[110];
        nArray[e.lIIIlIIIll[12]] = lIIIlIIIll[111];
        nArray[e.lIIIlIIIll[13]] = lIIIlIIIll[112];
        nArray[e.lIIIlIIIll[16]] = lIIIlIIIll[113];
        nArray[e.lIIIlIIIll[17]] = lIIIlIIIll[114];
        nArray[e.lIIIlIIIll[23]] = lIIIlIIIll[115];
        nArray[e.lIIIlIIIll[24]] = lIIIlIIIll[116];
        nArray[e.lIIIlIIIll[27]] = lIIIlIIIll[117];
        nArray[e.lIIIlIIIll[29]] = lIIIlIIIll[118];
        nArray[e.lIIIlIIIll[30]] = lIIIlIIIll[119];
        nArray[e.lIIIlIIIll[33]] = lIIIlIIIll[120];
        nArray[e.lIIIlIIIll[36]] = lIIIlIIIll[121];
        nArray[e.lIIIlIIIll[26]] = lIIIlIIIll[122];
        nArray[e.lIIIlIIIll[37]] = lIIIlIIIll[123];
        nArray[e.lIIIlIIIll[38]] = lIIIlIIIll[124];
        nArray[e.lIIIlIIIll[39]] = lIIIlIIIll[125];
        nArray[e.lIIIlIIIll[40]] = lIIIlIIIll[126];
        nArray[e.lIIIlIIIll[41]] = lIIIlIIIll[127];
        nArray[e.lIIIlIIIll[15]] = lIIIlIIIll[128];
        nArray[e.lIIIlIIIll[54]] = lIIIlIIIll[129];
        nArray[e.lIIIlIIIll[55]] = lIIIlIIIll[130];
        nArray[e.lIIIlIIIll[35]] = lIIIlIIIll[131];
        nArray[e.lIIIlIIIll[56]] = lIIIlIIIll[132];
        nArray[e.lIIIlIIIll[57]] = lIIIlIIIll[133];
        nArray[e.lIIIlIIIll[47]] = lIIIlIIIll[134];
        nArray[e.lIIIlIIIll[60]] = lIIIlIIIll[135];
        nArray[e.lIIIlIIIll[61]] = lIIIlIIIll[136];
        nArray[e.lIIIlIIIll[65]] = lIIIlIIIll[137];
        nArray[e.lIIIlIIIll[66]] = lIIIlIIIll[138];
        nArray[e.lIIIlIIIll[21]] = lIIIlIIIll[139];
        nArray[e.lIIIlIIIll[32]] = lIIIlIIIll[140];
        nArray[e.lIIIlIIIll[67]] = lIIIlIIIll[141];
        nArray[e.lIIIlIIIll[68]] = lIIIlIIIll[142];
        nArray[e.lIIIlIIIll[69]] = lIIIlIIIll[143];
        nArray[e.lIIIlIIIll[70]] = lIIIlIIIll[144];
        nArray[e.lIIIlIIIll[74]] = lIIIlIIIll[145];
        nArray[e.lIIIlIIIll[76]] = lIIIlIIIll[146];
        nArray[e.lIIIlIIIll[77]] = lIIIlIIIll[147];
        nArray[e.lIIIlIIIll[78]] = lIIIlIIIll[148];
        nArray[e.lIIIlIIIll[71]] = lIIIlIIIll[149];
        nArray[e.lIIIlIIIll[81]] = lIIIlIIIll[150];
        nArray[e.lIIIlIIIll[82]] = lIIIlIIIll[151];
        nArray[e.lIIIlIIIll[83]] = lIIIlIIIll[152];
        nArray[e.lIIIlIIIll[84]] = lIIIlIIIll[153];
        nArray[e.lIIIlIIIll[85]] = lIIIlIIIll[154];
        nArray[e.lIIIlIIIll[86]] = lIIIlIIIll[155];
        nArray[e.lIIIlIIIll[87]] = lIIIlIIIll[156];
        nArray[e.lIIIlIIIll[88]] = lIIIlIIIll[157];
        nArray[e.lIIIlIIIll[90]] = lIIIlIIIll[158];
        nArray[e.lIIIlIIIll[91]] = lIIIlIIIll[159];
        nArray[e.lIIIlIIIll[20]] = lIIIlIIIll[160];
        nArray[e.lIIIlIIIll[161]] = lIIIlIIIll[162];
        nArray[e.lIIIlIIIll[163]] = lIIIlIIIll[164];
        nArray[e.lIIIlIIIll[165]] = lIIIlIIIll[166];
        nArray[e.lIIIlIIIll[167]] = lIIIlIIIll[168];
        nArray[e.lIIIlIIIll[169]] = lIIIlIIIll[170];
        nArray[e.lIIIlIIIll[171]] = lIIIlIIIll[172];
        nArray[e.lIIIlIIIll[173]] = lIIIlIIIll[174];
        nArray[e.lIIIlIIIll[175]] = lIIIlIIIll[176];
        nArray[e.lIIIlIIIll[177]] = lIIIlIIIll[178];
        nArray[e.lIIIlIIIll[50]] = lIIIlIIIll[179];
        nArray[e.lIIIlIIIll[180]] = lIIIlIIIll[181];
        nArray[e.lIIIlIIIll[182]] = lIIIlIIIll[183];
        nArray[e.lIIIlIIIll[184]] = lIIIlIIIll[185];
        nArray[e.lIIIlIIIll[186]] = lIIIlIIIll[187];
        nArray[e.lIIIlIIIll[188]] = lIIIlIIIll[189];
        nArray[e.lIIIlIIIll[190]] = lIIIlIIIll[191];
        nArray[e.lIIIlIIIll[192]] = lIIIlIIIll[193];
        nArray[e.lIIIlIIIll[194]] = lIIIlIIIll[195];
        nArray[e.lIIIlIIIll[196]] = lIIIlIIIll[197];
        nArray[e.lIIIlIIIll[198]] = lIIIlIIIll[199];
        nArray[e.lIIIlIIIll[200]] = lIIIlIIIll[201];
        nArray[e.lIIIlIIIll[202]] = lIIIlIIIll[203];
        nArray[e.lIIIlIIIll[204]] = lIIIlIIIll[205];
        nArray[e.lIIIlIIIll[206]] = lIIIlIIIll[207];
        nArray[e.lIIIlIIIll[208]] = lIIIlIIIll[209];
        nArray[e.lIIIlIIIll[210]] = lIIIlIIIll[211];
        nArray[e.lIIIlIIIll[212]] = lIIIlIIIll[213];
        nArray[e.lIIIlIIIll[214]] = lIIIlIIIll[215];
        nArray[e.lIIIlIIIll[216]] = lIIIlIIIll[217];
        nArray[e.lIIIlIIIll[218]] = lIIIlIIIll[219];
        nArray[e.lIIIlIIIll[220]] = lIIIlIIIll[221];
        nArray[e.lIIIlIIIll[222]] = lIIIlIIIll[223];
        nArray[e.lIIIlIIIll[224]] = lIIIlIIIll[225];
        nArray[e.lIIIlIIIll[226]] = lIIIlIIIll[227];
        nArray[e.lIIIlIIIll[228]] = lIIIlIIIll[229];
        nArray[e.lIIIlIIIll[230]] = lIIIlIIIll[231];
        nArray[e.lIIIlIIIll[232]] = lIIIlIIIll[233];
        nArray[e.lIIIlIIIll[234]] = lIIIlIIIll[235];
        nArray[e.lIIIlIIIll[89]] = lIIIlIIIll[236];
        nArray[e.lIIIlIIIll[73]] = lIIIlIIIll[237];
        nArray[e.lIIIlIIIll[238]] = lIIIlIIIll[239];
        nArray[e.lIIIlIIIll[240]] = lIIIlIIIll[241];
        nArray[e.lIIIlIIIll[242]] = lIIIlIIIll[243];
        nArray[e.lIIIlIIIll[244]] = lIIIlIIIll[245];
        nArray[e.lIIIlIIIll[246]] = lIIIlIIIll[247];
        Z = nArray;
        aa = new WorldPoint(lIIIlIIIll[248], lIIIlIIIll[249], lIIIlIIIll[3]);
        ab = new WorldArea(lIIIlIIIll[250], lIIIlIIIll[251], lIIIlIIIll[56], lIIIlIIIll[36], lIIIlIIIll[2]);
    }

    public static void l(int n2) {
        int[] nArray = new int[lIIIlIIIll[0]];
        nArray[e.lIIIlIIIll[2]] = n2;
        if (e.lllIlIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIlIIIll[0]];
            nArray2[e.lIIIlIIIll[2]] = n2;
            if (e.lllIlIIIIIll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int lIlllIIllllI;
                int[] nArray3 = new int[lIIIlIIIll[0]];
                nArray3[e.lIIIlIIIll[2]] = n2;
                String[] stringArray = new String[lIIIlIIIll[0]];
                stringArray[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[26]];
                if (e.lllIlIIIIlIl(Inventory.getFirst((int[])nArray3).hasAction(stringArray) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIlIIIll[0]];
                    nArray4[e.lIIIlIIIll[2]] = n2;
                    Inventory.getFirst((int[])nArray4).interact(lIIIlIIIlI[lIIIlIIIll[37]]);
                }
                int[] nArray5 = new int[lIIIlIIIll[0]];
                nArray5[e.lIIIlIIIll[2]] = lIlllIIllllI;
                String[] stringArray2 = new String[lIIIlIIIll[0]];
                stringArray2[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[38]];
                if (e.lllIlIIIIlIl(Inventory.getFirst((int[])nArray5).hasAction(stringArray2) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIlIIIll[0]];
                    nArray6[e.lIIIlIIIll[2]] = lIlllIIllllI;
                    Inventory.getFirst((int[])nArray6).interact(lIIIlIIIlI[lIIIlIIIll[39]]);
                }
                int[] nArray7 = new int[lIIIlIIIll[0]];
                nArray7[e.lIIIlIIIll[2]] = lIlllIIllllI;
                String[] stringArray3 = new String[lIIIlIIIll[0]];
                stringArray3[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[40]];
                if (e.lllIlIIIIlIl(Inventory.getFirst((int[])nArray7).hasAction(stringArray3) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIlIIIll[0]];
                    nArray8[e.lIIIlIIIll[2]] = lIlllIIllllI;
                    Inventory.getFirst((int[])nArray8).interact(lIIIlIIIlI[lIIIlIIIll[41]]);
                }
                if (e.lllIlIIIIlII(lIlllIIllllI, lIIIlIIIll[42])) {
                    Time.sleepTicks((int)lIIIlIIIll[1]);
                    0;
                    String[] stringArray4 = new String[lIIIlIIIll[0]];
                    stringArray4[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[15]];
                    g.a(stringArray4);
                    Time.sleepTicks((int)lIIIlIIIll[0]);
                    0;
                }
            }
        }
    }

    public static void B() {
        World world2 = Worlds.getRandom(world -> {
            int n2;
            if (e.lllIlIIIIlIl(world.isMembers() ? 1 : 0) && e.lllIlIIIlIII(world.getPlayerCount(), lIIIlIIIll[75]) && e.lllIlIIIlIll(world.getId(), Worlds.getCurrentId()) && e.lllIlIIIIIll(world.getActivity().endsWith(lIIIlIIIlI[lIIIlIIIll[76]]) ? 1 : 0) && e.lllIlIIIIIll(world.getActivity().endsWith(lIIIlIIIlI[lIIIlIIIll[77]]) ? 1 : 0) && e.lllIlIIIIIll(world.getActivity().startsWith(lIIIlIIIlI[lIIIlIIIll[78]]) ? 1 : 0) && e.lllIlIIIIIll(world.getActivity().startsWith(lIIIlIIIlI[lIIIlIIIll[71]]) ? 1 : 0) && e.lllIlIIIlIll(world.getId(), lIIIlIIIll[79]) && e.lllIlIIIlIll(world.getId(), lIIIlIIIll[80]) && e.lllIlIIIlIll(world.getId(), lIIIlIIIll[80]) && e.lllIlIIIIIll(world.getActivity().contains(lIIIlIIIlI[lIIIlIIIll[81]]) ? 1 : 0) && e.lllIlIIIIIll(world.getActivity().contains(lIIIlIIIlI[lIIIlIIIll[82]]) ? 1 : 0) && e.lllIlIIIIIll(world.getActivity().contains(lIIIlIIIlI[lIIIlIIIll[83]]) ? 1 : 0) && e.lllIlIIIIIll(world.getActivity().startsWith(lIIIlIIIlI[lIIIlIIIll[84]]) ? 1 : 0) && e.lllIlIIIIIll(world.getActivity().endsWith(lIIIlIIIlI[lIIIlIIIll[85]]) ? 1 : 0) && e.lllIlIIIIIll(world.getActivity().endsWith(lIIIlIIIlI[lIIIlIIIll[86]]) ? 1 : 0) && e.lllIlIIIIIll(world.getActivity().endsWith(lIIIlIIIlI[lIIIlIIIll[87]]) ? 1 : 0) && e.lllIlIIIIIll(world.getActivity().startsWith(lIIIlIIIlI[lIIIlIIIll[88]]) ? 1 : 0) && e.lllIlIIIIlll(world.getPlayerCount(), lIIIlIIIll[89])) {
                n2 = lIIIlIIIll[0];
                0;
                if ((0x67 ^ 4 ^ (0x4E ^ 0x29)) == 0) {
                    return ((0x22 ^ 0x2C ^ (0xAD ^ 0x8A)) & (5 ^ 0x10 ^ (0xB2 ^ 0x8E) ^ -1)) != 0;
                }
            } else {
                n2 = lIIIlIIIll[2];
            }
            return n2 != 0;
        });
        Worlds.hopTo((World)world2);
    }

    public static long s() {
        return V + (System.nanoTime() - W) / 1000000L;
    }

    public static String h(int n2) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String string = numberFormat.format(n2);
        return string;
    }

    public static boolean F() {
        boolean bl;
        if (!e.lllIlIIIIIll(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.lllIlIIIIIll(U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.lllIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(aa), lIIIlIIIll[71]) || e.lllIlIIIIlIl(ab.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            bl = lIIIlIIIll[0];
            0;
            if (2 < ((0x31 ^ 0x77 ^ (0xD6 ^ 0x98)) & (0x2D ^ 0x4D ^ (0xEC ^ 0x84) ^ -1))) {
                return ((0x6A ^ 0 ^ (0x9D ^ 0xAE)) & (0x16 ^ 1 ^ (0xF5 ^ 0xBB) ^ -1)) != 0;
            }
        } else {
            bl = lIIIlIIIll[2];
        }
        return bl;
    }

    private static void lllIlIIIIIlI() {
        lIIIlIIIll = new int[252];
        e.lIIIlIIIll[0] = 1;
        e.lIIIlIIIll[1] = 3;
        e.lIIIlIIIll[2] = 1 & ~1;
        e.lIIIlIIIll[3] = 2;
        e.lIIIlIIIll[4] = 106 + 83 - 125 + 124 ^ 123 + 152 - 148 + 57;
        e.lIIIlIIIll[5] = 0x62 ^ 0x67;
        e.lIIIlIIIll[6] = 0x94 ^ 0xA9 ^ (0xB4 ^ 0x8F);
        e.lIIIlIIIll[7] = 0x4F ^ 0x48;
        e.lIIIlIIIll[8] = 0xA1 ^ 0xA9;
        e.lIIIlIIIll[9] = 0xB9 ^ 0xB0;
        e.lIIIlIIIll[10] = 0xB0 ^ 0xBA;
        e.lIIIlIIIll[11] = 0x96 ^ 0x9D;
        e.lIIIlIIIll[12] = 0x83 ^ 0x8F;
        e.lIIIlIIIll[13] = 0x7D ^ 0x2E ^ (0xC0 ^ 0x9E);
        e.lIIIlIIIll[14] = -(0xFFFFFD47 & 0x7FFD) & (0xFFFFFFFD & 0x7FDE);
        e.lIIIlIIIll[15] = 0xDF ^ 0xC2;
        e.lIIIlIIIll[16] = 0xE4 ^ 0xBC ^ (0xF6 ^ 0xA0);
        e.lIIIlIIIll[17] = 0x45 ^ 0x4A;
        e.lIIIlIIIll[18] = -(0xFFFFFB37 & 0x17DF) & (0xFFFFFFFF & 0x1F76);
        e.lIIIlIIIll[19] = -(0xFFFFF6BB & 0x4BCE) & (0xFFFFFFFF & 0x4FDF);
        e.lIIIlIIIll[20] = 0xF ^ 0x32;
        e.lIIIlIIIll[21] = 0xA ^ 0x57 ^ (0x64 ^ 0x11);
        e.lIIIlIIIll[22] = -(0xFFFFFAB9 & 0x25DF) & (0xFFFFFFDF & 0x3FFF);
        e.lIIIlIIIll[23] = 0x4C ^ 0x5C;
        e.lIIIlIIIll[24] = 0x25 ^ 0x40 ^ (8 ^ 0x7C);
        e.lIIIlIIIll[25] = (0x85 ^ 0x93) + (0x3B ^ 0x2A) - (0x75 ^ 0x65) + (0xAA ^ 0xC5);
        e.lIIIlIIIll[26] = 0x85 ^ 0xC1 ^ (0x40 ^ 0x13);
        e.lIIIlIIIll[27] = 140 + 112 - 110 + 27 ^ 128 + 133 - 103 + 29;
        e.lIIIlIIIll[28] = 0xFFFFFFED & 0x397E;
        e.lIIIlIIIll[29] = 0xC2 ^ 0x87 ^ (0x21 ^ 0x77);
        e.lIIIlIIIll[30] = 8 ^ 0x1C;
        e.lIIIlIIIll[31] = 0xFFFFFD7F & 0x3BED;
        e.lIIIlIIIll[32] = 0x83 ^ 0xAA;
        e.lIIIlIIIll[33] = 0xD5 ^ 0xC0;
        e.lIIIlIIIll[34] = 0x5C ^ 0x11 ^ (0xA ^ 0x33);
        e.lIIIlIIIll[35] = 5 ^ 0x78 ^ (0x12 ^ 0x4F);
        e.lIIIlIIIll[36] = 119 + 51 - 57 + 68 ^ 140 + 16 - 2 + 9;
        e.lIIIlIIIll[37] = 0x8C ^ 0x94;
        e.lIIIlIIIll[38] = 0x7C ^ 0x65;
        e.lIIIlIIIll[39] = 72 + 86 - 24 + 14 ^ 30 + 138 - 45 + 19;
        e.lIIIlIIIll[40] = 0x15 ^ 0xE;
        e.lIIIlIIIll[41] = 0xA3 ^ 0xBF;
        e.lIIIlIIIll[42] = 0xFFFFDB9D & 0x7C7F;
        e.lIIIlIIIll[43] = 0xFFFFCFFF & 0x399D;
        e.lIIIlIIIll[44] = 0xFFFFAFFF & 0x5D37;
        e.lIIIlIIIll[45] = -(0xFFFFEBEF & 0x3435) & (0xFFFFEBFF & 0x3DBD);
        e.lIIIlIIIll[46] = 0xFFFF8DFB & 0x7F3C;
        e.lIIIlIIIll[47] = 0xE3 ^ 0xC0;
        e.lIIIlIIIll[48] = 0xFFFF8DFF & 0x7B77;
        e.lIIIlIIIll[49] = -(0xFFFFFE4F & 0x13F1) & (0xFFFF9FFF & 0x7F7F);
        e.lIIIlIIIll[50] = 0x17 ^ 0x50;
        e.lIIIlIIIll[51] = 43 + 102 - 74 + 72;
        e.lIIIlIIIll[52] = 0xFFFFBDDE & 0x4BBD;
        e.lIIIlIIIll[53] = -(0xFFFFFCAB & 0x33F7) & (0xFFFFBFFB & 0x7DFF);
        e.lIIIlIIIll[54] = 0xA5 ^ 0xBB;
        e.lIIIlIIIll[55] = 0x46 ^ 0xD ^ (0x1E ^ 0x4A);
        e.lIIIlIIIll[56] = 0x77 ^ 0x27 ^ (0x4B ^ 0x3A);
        e.lIIIlIIIll[57] = 0xA6 ^ 0x84;
        e.lIIIlIIIll[58] = 0xFFFFDDBD & 0x2F7B;
        e.lIIIlIIIll[59] = 0xFFFFCDFD & 0x3F47;
        e.lIIIlIIIll[60] = 0x30 ^ 0x14;
        e.lIIIlIIIll[61] = 10 + 51 - -106 + 60 ^ 64 + 72 - 25 + 87;
        e.lIIIlIIIll[62] = -1;
        e.lIIIlIIIll[63] = 37 + 7 - 4 + 132;
        e.lIIIlIIIll[64] = -(0xFFFFFEFF & 0x3D29) & (0xFFFFBF79 & 0x7EFF);
        e.lIIIlIIIll[65] = 0xFC ^ 0xB7 ^ (0x1A ^ 0x77);
        e.lIIIlIIIll[66] = 0x8B ^ 0xAC;
        e.lIIIlIIIll[67] = 0x9A ^ 0xBD ^ (0x9B ^ 0x96);
        e.lIIIlIIIll[68] = 0x69 ^ 0x42;
        e.lIIIlIIIll[69] = 0 ^ 0x2C;
        e.lIIIlIIIll[70] = 0x64 ^ 0x49;
        e.lIIIlIIIll[71] = 0x2B ^ 0x19;
        e.lIIIlIIIll[72] = 95 + 119 - 96 + 35;
        e.lIIIlIIIll[73] = 0xE5 ^ 0x80;
        e.lIIIlIIIll[74] = 6 ^ 0x28;
        e.lIIIlIIIll[75] = -(0xFFFFFB7B & 0x4CA6) & (0xFFFFDFFF & 0x6FBF);
        e.lIIIlIIIll[76] = 65 + 32 - 12 + 54 ^ 161 + 95 - 201 + 109;
        e.lIIIlIIIll[77] = 0x20 ^ 0x4E ^ (0x39 ^ 0x67);
        e.lIIIlIIIll[78] = 0xFB ^ 0x89 ^ (0x21 ^ 0x62);
        e.lIIIlIIIll[79] = 0xFFFFCDDE & 0x33FB;
        e.lIIIlIIIll[80] = -(0xFFFFFD7D & 0x23EB) & (0xFFFFF77F & 0x2BFD);
        e.lIIIlIIIll[81] = 0x71 ^ 0x6A ^ (0xA ^ 0x22);
        e.lIIIlIIIll[82] = 0x9F ^ 0xAB;
        e.lIIIlIIIll[83] = 0x6E ^ 0x5B;
        e.lIIIlIIIll[84] = 0x5D ^ 0x2D ^ (0x5A ^ 0x1C);
        e.lIIIlIIIll[85] = 0xF4 ^ 0xB4 ^ (0xC2 ^ 0xB5);
        e.lIIIlIIIll[86] = 0x9F ^ 0xA7;
        e.lIIIlIIIll[87] = 0x1D ^ 0x63 ^ (0xC ^ 0x4B);
        e.lIIIlIIIll[88] = 0xD ^ 0x54 ^ (0x66 ^ 5);
        e.lIIIlIIIll[89] = 0x49 ^ 0x2D;
        e.lIIIlIIIll[90] = 4 ^ 0x29 ^ (0x86 ^ 0x90);
        e.lIIIlIIIll[91] = 0x85 ^ 0x89 ^ (0x27 ^ 0x17);
        e.lIIIlIIIll[92] = 0xFFFF8F77 & 0x7CFE;
        e.lIIIlIIIll[93] = -(0xFFFFB607 & 0x7BFB) & (0xFFFFFE7F & 0x3FFF);
        e.lIIIlIIIll[94] = -(0xFFFFFA17 & 0x67EA) & (0xFFFFFE7F & 0x6FFF);
        e.lIIIlIIIll[95] = 0xFFFF8ED7 & 0x7DAC;
        e.lIIIlIIIll[96] = 0xFFFFFDF3 & 0xE7C;
        e.lIIIlIIIll[97] = -(0xFFFFBFF3 & 0x420D) & (0xFFFF8FEF & 0x7F7D);
        e.lIIIlIIIll[98] = 0xA2 ^ 0x84 ^ (0x1F ^ 0x52);
        e.lIIIlIIIll[99] = 0xFFFF8FFE & 0x715B;
        e.lIIIlIIIll[100] = -(0xFFFFBFD7 & 0x582E) & (0xFFFFBDBF & 0x5B77);
        e.lIIIlIIIll[101] = 0xFFFFB1F6 & 0x4F3F;
        e.lIIIlIIIll[102] = 0xFFFFB96D & 0x47F2;
        e.lIIIlIIIll[103] = -(0xFFFFCAF7 & 0x7799) & (0xFFFFFFFB & 0x43F7);
        e.lIIIlIIIll[104] = -(0xFFFFFBC2 & 0x5E3F) & (0xFFFFDB65 & Short.MAX_VALUE);
        e.lIIIlIIIll[105] = 0xFFFF89E5 & 0x777F;
        e.lIIIlIIIll[106] = 0xFFFFEFFE & 0x1167;
        e.lIIIlIIIll[107] = -(2 ^ 0x3F) & (0xFFFFA7FE & 0x59BF);
        e.lIIIlIIIll[108] = -(0xFFFFBB73 & 0x7EDD) & (0xFFFFFFFB & 0x3BDF);
        e.lIIIlIIIll[109] = -(0xFFFFFAAF & 0x3D59) & (0xFFFFBBFE & 0x7DDB);
        e.lIIIlIIIll[110] = 0xFFFFB7EF & 0x49FE;
        e.lIIIlIIIll[111] = 0xFFFFD9EF & 0x27FF;
        e.lIIIlIIIll[112] = -(0xFFFFDF7E & 0x7C83) & (0xFFFFFDFD & 0x5FF3);
        e.lIIIlIIIll[113] = -(0xFFFFEDDF & 0x3228) & (0xFFFFB31F & 0x6EFF);
        e.lIIIlIIIll[114] = -(0xBF ^ 0xAC) & (0xFFFFA3D6 & 0x5E3F);
        e.lIIIlIIIll[115] = 0xFFFFA3BB & 0x5D7E;
        e.lIIIlIIIll[116] = 0xFFFFE1EB & 0x1FFF;
        e.lIIIlIIIll[117] = 0xFFFFB55E & 0x4BEF;
        e.lIIIlIIIll[118] = 0xFFFFEB7F & 0x15E2;
        e.lIIIlIIIll[119] = 0xFFFFD3FF & 0x2DDD;
        e.lIIIlIIIll[120] = -(0xFFFFEFB2 & 0x3EEF) & (0xFFFFAFF7 & 0x7FEB);
        e.lIIIlIIIll[121] = -(0xFFFFFFE3 & 0x5C5F) & (0xFFFFDF77 & 0x7DFB);
        e.lIIIlIIIll[122] = 0xFFFFC5BB & 0x3B7F;
        e.lIIIlIIIll[123] = -(0xFFFFFAA6 & 0x6FDF) & (0xFFFFEFFF & 0x7BF7);
        e.lIIIlIIIll[124] = 0xFFFFB7FD & 0x4946;
        e.lIIIlIIIll[125] = -(0xFFFF9F19 & 0x7AEF) & (0xFFFFFF5D & 0x1BEF);
        e.lIIIlIIIll[126] = 0xFFFFC95D & 0x37EA;
        e.lIIIlIIIll[127] = 0xFFFFB3FD & 0x4DBF;
        e.lIIIlIIIll[128] = -(0xFFFFFA57 & 0x77AC) & (0xFFFFF3DF & 0x7FF3);
        e.lIIIlIIIll[129] = 0xFFFFCDDF & 0x33FE;
        e.lIIIlIIIll[130] = -(0xFFFFF817 & 0x5FFA) & (0xFFFFDBFF & 0x7DFB);
        e.lIIIlIIIll[131] = -(0xFFFFDEFA & 0x7717) & (0xFFFFFFFF & 0x57FD);
        e.lIIIlIIIll[132] = 0xFFFFAFFB & 0x51FF;
        e.lIIIlIIIll[133] = -(0xFFFFD72F & 0x3CF5) & (0xFFFFD7EE & 0x3E3F);
        e.lIIIlIIIll[134] = 0xFFFFFDDF & 0x36A;
        e.lIIIlIIIll[135] = 0xFFFFB5FF & 0x4BD1;
        e.lIIIlIIIll[136] = 0xFFFFC6E5 & 0x3B1A;
        e.lIIIlIIIll[137] = 0xFFFFDBAF & 0x267F;
        e.lIIIlIIIll[138] = -(0xFFFFFEFB & 0x2F05) & (0xFFFFFF7B & 0x2FFD);
        e.lIIIlIIIll[139] = 0xFFFFE7FD & 0x194E;
        e.lIIIlIIIll[140] = -(0xFFFFBF07 & 0x6EFB) & (0xFFFFAFFB & Short.MAX_VALUE);
        e.lIIIlIIIll[141] = 0xFFFFED57 & 0x13F9;
        e.lIIIlIIIll[142] = 0xFFFFC393 & 0x3E6E;
        e.lIIIlIIIll[143] = -(0xFFFFFC3D & 0x7BF3) & (0xFFFFF9F7 & 0x7F7F);
        e.lIIIlIIIll[144] = -(0xFFFFDBFB & 0x6E14) & (0xFFFFDFFF & 0x6BEF);
        e.lIIIlIIIll[145] = 0xFFFF81D9 & 0x7F7E;
        e.lIIIlIIIll[146] = -(0xFFFFBC1B & 0x5FE5) & (0xFFFF9DFF & 0x7FDF);
        e.lIIIlIIIll[147] = -(0xFFFFF937 & 0x2EDB) & (0xFFFFE9FF & 0x3FFF);
        e.lIIIlIIIll[148] = -(0xFFFFDF39 & 0x7EC7) & (0xFFFFDF7F & 0x7FD6);
        e.lIIIlIIIll[149] = 0xFFFFCBBF & 0x35FE;
        e.lIIIlIIIll[150] = 0xFFFFEBD1 & 0x156E;
        e.lIIIlIIIll[151] = 0xFFFFDD5F & 0x23FE;
        e.lIIIlIIIll[152] = -(0xFFFFFFFF & 0x281D) & (0xFFFFE9DF & 0x3F7D);
        e.lIIIlIIIll[153] = -(0xFFFFFFEB & 0x1E3D) & (0xFFFFBF7F & 0x5FFD);
        e.lIIIlIIIll[154] = -(0xFFFFAE2F & 0x77D9) & (0xFFFFAFBF & 0x77EE);
        e.lIIIlIIIll[155] = 0xFFFF9BCF & 0x65FF;
        e.lIIIlIIIll[156] = 0xFFFFD7FF & 0x2976;
        e.lIIIlIIIll[157] = 0xFFFFA179 & 0x5FFE;
        e.lIIIlIIIll[158] = 0xFFFFCDF6 & 0x3359;
        e.lIIIlIIIll[159] = 0xFFFF87CB & 0x797D;
        e.lIIIlIIIll[160] = 0xFFFFE55F & 0x1BEB;
        e.lIIIlIIIll[161] = 0x9F ^ 0xA4 ^ (0x69 ^ 0x6C);
        e.lIIIlIIIll[162] = 0xFFFFDFFF & 0x214D;
        e.lIIIlIIIll[163] = 3 ^ 0x3C;
        e.lIIIlIIIll[164] = -(0xFFFFFFF3 & 0x7CDC) & (0xFFFFFDFF & Short.MAX_VALUE);
        e.lIIIlIIIll[165] = 0x2E ^ 0x6E;
        e.lIIIlIIIll[166] = 0xFFFFCD7E & 0x33EB;
        e.lIIIlIIIll[167] = 0x31 ^ 0x70;
        e.lIIIlIIIll[168] = 0xFFFFF77B & 0x9C7;
        e.lIIIlIIIll[169] = 0x79 ^ 0 ^ (0xAD ^ 0x96);
        e.lIIIlIIIll[170] = -(0xFFFFBF43 & 0x7CBD) & (0xFFFFBDB7 & 0x7F7B);
        e.lIIIlIIIll[171] = 0x61 ^ 0x22;
        e.lIIIlIIIll[172] = 0xFFFFE735 & 0x19FF;
        e.lIIIlIIIll[173] = 0x16 ^ 0x52;
        e.lIIIlIIIll[174] = -(0xFFFFFE29 & 0x57D7) & (0xFFFFFFF7 & 0x573F);
        e.lIIIlIIIll[175] = 0xE5 ^ 0xA0;
        e.lIIIlIIIll[176] = 0xFFFFEFFF & 0x1177;
        e.lIIIlIIIll[177] = 0xD7 ^ 0x91;
        e.lIIIlIIIll[178] = -(0xFFFFAFA5 & 0x7CDB) & (0xFFFFBDFE & 0x6FFB);
        e.lIIIlIIIll[179] = 0xFFFFC2EB & 0x3F15;
        e.lIIIlIIIll[180] = 0xD2 ^ 0x9A;
        e.lIIIlIIIll[181] = 0xFFFF81AF & 0x7F7F;
        e.lIIIlIIIll[182] = 0x8F ^ 0xC6;
        e.lIIIlIIIll[183] = 0xFFFFB73A & 0x49FD;
        e.lIIIlIIIll[184] = 0x74 ^ 0x52 ^ (0xA9 ^ 0xC5);
        e.lIIIlIIIll[185] = -(0xFFFFE557 & 0x3AEF) & (0xFFFFF1FF & 0x2F7F);
        e.lIIIlIIIll[186] = 3 ^ 0x10 ^ (0x2D ^ 0x75);
        e.lIIIlIIIll[187] = 0xFFFFA53D & 0x5BFF;
        e.lIIIlIIIll[188] = 0x29 ^ 0x65;
        e.lIIIlIIIll[189] = -(0xFFFFEFB5 & 0x7EEB) & (0xFFFFFFFF & 0x6FF3);
        e.lIIIlIIIll[190] = 0x8C ^ 0xC1;
        e.lIIIlIIIll[191] = 0xFFFFB3F6 & 0x4D5D;
        e.lIIIlIIIll[192] = 57 + 85 - 31 + 109 ^ 6 + 53 - -60 + 27;
        e.lIIIlIIIll[193] = 0xFFFFD1D7 & 0x2F7F;
        e.lIIIlIIIll[194] = 105 + 84 - 93 + 44 ^ 180 + 68 - 77 + 24;
        e.lIIIlIIIll[195] = 0xFFFF91FB & 0x6F5F;
        e.lIIIlIIIll[196] = 0x96 ^ 0x8C ^ (0x75 ^ 0x3F);
        e.lIIIlIIIll[197] = -(0xFFFFBEFF & 0x7DA3) & (0xFFFFFFFE & 0x3DFF);
        e.lIIIlIIIll[198] = 0xE5 ^ 0x87 ^ (0xB2 ^ 0x81);
        e.lIIIlIIIll[199] = -(0xFFFFFEFD & 0x67A3) & (0xFFFFF7FF & 0x6FFF);
        e.lIIIlIIIll[200] = 0x24 ^ 0x76;
        e.lIIIlIIIll[201] = -(0xFFFF96BF & 0x7BD1) & (0xFFFF97F7 & 0x7BFF);
        e.lIIIlIIIll[202] = 0x52 ^ 0x31 ^ (0x7D ^ 0x4D);
        e.lIIIlIIIll[203] = -(0xFFFFFF85 & 0x3AFE) & (0xFFFFFFEF & 0x3BFB);
        e.lIIIlIIIll[204] = 0xAD ^ 0x86 ^ 70 + 47 - 14 + 24;
        e.lIIIlIIIll[205] = 0xFFFF95EF & 0x6B7F;
        e.lIIIlIIIll[206] = 0xE2 ^ 0xB7;
        e.lIIIlIIIll[207] = 0xFFFFAB75 & 0x55FA;
        e.lIIIlIIIll[208] = 0x15 ^ 0x43;
        e.lIIIlIIIll[209] = -(0xFFFFEB9F & 0x766D) & (0xFFFFFBFD & 0x67EF);
        e.lIIIlIIIll[210] = 0xFE ^ 0xC4 ^ (0xFF ^ 0x92);
        e.lIIIlIIIll[211] = -(0xFFFFFF3B & 0x6ED6) & (0xFFFFFFF3 & 0x6FFF);
        e.lIIIlIIIll[212] = 0x55 ^ 0xD;
        e.lIIIlIIIll[213] = 0xFFFFEBFC & 0x15E7;
        e.lIIIlIIIll[214] = 0x6D ^ 0x34;
        e.lIIIlIIIll[215] = -(0xFFFFF39F & 0x6C63) & (0xFFFFF5F7 & 0x6BEF);
        e.lIIIlIIIll[216] = 154 + 69 - 130 + 124 ^ 2 + 45 - 3 + 87;
        e.lIIIlIIIll[217] = -(0xFFFFFF4A & 0x34BF) & (0xFFFFFDEF & 0x37FF);
        e.lIIIlIIIll[218] = 0x10 ^ 0x4B;
        e.lIIIlIIIll[219] = 0xFFFF91FF & 0x6FE7;
        e.lIIIlIIIll[220] = 0x1E ^ 0x42;
        e.lIIIlIIIll[221] = -(0xFFFFF2DD & 0x6D3A) & (0xFFFFEBFF & 0x75FF);
        e.lIIIlIIIll[222] = 0x58 ^ 5;
        e.lIIIlIIIll[223] = 0xFFFF9BE9 & 0x65FF;
        e.lIIIlIIIll[224] = 84 + 13 - -5 + 113 ^ 68 + 48 - 63 + 84;
        e.lIIIlIIIll[225] = -(0xFFFFEF8F & 0x3E75) & (0xFFFFFFFF & 0x2FFE);
        e.lIIIlIIIll[226] = 23 + 90 - -36 + 6 ^ 184 + 38 - 189 + 163;
        e.lIIIlIIIll[227] = 0xFFFFBDFD & 0x43FE;
        e.lIIIlIIIll[228] = 0x5B ^ 0x3B;
        e.lIIIlIIIll[229] = 0xFFFFF3FF & 0xDFD;
        e.lIIIlIIIll[230] = 0xA3 ^ 0xB0 ^ (0xC2 ^ 0xB0);
        e.lIIIlIIIll[231] = -(0xFFFFCFFA & 0x7207) & (0xFFFFFBFF & 0x47FF);
        e.lIIIlIIIll[232] = 0x7F ^ 0x4D ^ (0xCC ^ 0x9C);
        e.lIIIlIIIll[233] = -(0xFFFFFED7 & 0x6B29) & (0xFFFFEFFF & 0x7BFF);
        e.lIIIlIIIll[234] = 0xD0 ^ 0xB3;
        e.lIIIlIIIll[235] = -(0xFFFFE7AD & 0x7D53) & (0xFFFFFFCD & 0x6737);
        e.lIIIlIIIll[236] = -(137 + 111 - 210 + 171) & (0xFFFFC3FF & 0x3ED6);
        e.lIIIlIIIll[237] = -(0xFFFFDF7F & 0x7D91) & (0xFFFFDF3F & 0x7FD7);
        e.lIIIlIIIll[238] = 0xA ^ 0x6C;
        e.lIIIlIIIll[239] = 0xFFFFCFDE & 0x3229;
        e.lIIIlIIIll[240] = 0xDB ^ 0xBC;
        e.lIIIlIIIll[241] = -(0xFFFFEDF7 & 0x5EBF) & (0xFFFFDEBF & 0x6FFF);
        e.lIIIlIIIll[242] = 0xC3 ^ 0xAB;
        e.lIIIlIIIll[243] = -(0xFFFF9FE5 & 0x6D7B) & (0xFFFFDF6F & 0x2FFB);
        e.lIIIlIIIll[244] = 2 ^ 0x6B;
        e.lIIIlIIIll[245] = 0xFFFFD39C & 0x2E6F;
        e.lIIIlIIIll[246] = 0 ^ 0x50 ^ (0xAC ^ 0x96);
        e.lIIIlIIIll[247] = -(0xFFFFF3BB & 0x7D57) & (0xFFFFF3DF & 0x7F3F);
        e.lIIIlIIIll[248] = -(0xFFFFF3F7 & 0x7C1D) & (0xFFFFFDDF & 0x7EBC);
        e.lIIIlIIIll[249] = 0xFFFF8FBF & 0x7CD3;
        e.lIIIlIIIll[250] = 0xFFFF9BAD & 0x6FDF;
        e.lIIIlIIIll[251] = 0xFFFF8F0C & 0x7DF7;
    }

    public static void a(WorldPoint worldPoint) {
        if (e.lllIlIIIIIll(n.bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (e.lllIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(n.bO), lIIIlIIIll[1])) {
                AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[2]];
                Movement.walkTo((WorldPoint)n.bO);
                0;
                Time.sleepTicks((int)lIIIlIIIll[0]);
                0;
            }
            if (e.lllIlIIIlIII(Players.getLocal().getWorldLocation().distanceTo(n.bO), lIIIlIIIll[1])) {
                NPC lIllllIIIlIl;
                AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[0]];
                if (e.lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (e.lllIlIIIlIIl(lIllllIIIlIl = NPCs.getNearest(nPC -> {
                    String[] stringArray = new String[lIIIlIIIll[0]];
                    stringArray[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[90]];
                    return nPC.hasAction(stringArray);
                }))) {
                    String[] stringArray = new String[lIIIlIIIll[0]];
                    stringArray[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[3]];
                    if (e.lllIlIIIIlIl(lIllllIIIlIl.hasAction(stringArray) ? 1 : 0)) {
                        lIllllIIIlIl.interact(lIIIlIIIlI[lIIIlIIIll[1]]);
                        Time.sleepTicks((int)lIIIlIIIll[1]);
                        0;
                    }
                    String[] stringArray2 = new String[lIIIlIIIll[0]];
                    stringArray2[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[4]];
                    if (e.lllIlIIIIIll(lIllllIIIlIl.hasAction(stringArray2) ? 1 : 0)) {
                        g.b(lIIIlIIIlI[lIIIlIIIll[5]], n.bR);
                        Time.sleepTicks((int)lIIIlIIIll[0]);
                        0;
                    }
                }
                String[] stringArray = new String[lIIIlIIIll[0]];
                stringArray[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[6]];
                NPC lIllllIIIlII = NPCs.getNearest((String[])stringArray);
                if (e.lllIlIIIlIIl(lIllllIIIlII)) {
                    String[] stringArray3 = new String[lIIIlIIIll[0]];
                    stringArray3[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[7]];
                    if (e.lllIlIIIIlIl(lIllllIIIlII.hasAction(stringArray3) ? 1 : 0)) {
                        lIllllIIIlII.interact(lIIIlIIIlI[lIIIlIIIll[8]]);
                        Time.sleepTicks((int)lIIIlIIIll[1]);
                        0;
                    }
                    String[] stringArray4 = new String[lIIIlIIIll[0]];
                    stringArray4[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[9]];
                    if (e.lllIlIIIIIll(lIllllIIIlII.hasAction(stringArray4) ? 1 : 0)) {
                        g.b(lIIIlIIIlI[lIIIlIIIll[10]], n.bR);
                        Time.sleepTicks((int)lIIIlIIIll[0]);
                        0;
                    }
                }
            }
        }
        if (e.lllIlIIIIlIl(n.bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint lIllllIIIllI;
            Movement.walkTo((WorldPoint)lIllllIIIllI);
            0;
            Time.sleepTicks((int)lIIIlIIIll[0]);
            0;
        }
    }

    public static long a(long l2) {
        return e.s() - l2;
    }

    public static boolean b(int[] nArray) {
        int[] lIllllIIIIIl;
        int lIllllIIIIII = lIIIlIIIll[2];
        while (e.lllIlIIIlIlI(lIllllIIIIII, lIllllIIIIIl.length)) {
            if (e.lllIlIIIIIll(e.i(lIllllIIIIIl[lIllllIIIIII]) ? 1 : 0)) {
                System.out.println("Missing ID: " + lIllllIIIIIl[lIllllIIIIII]);
                return lIIIlIIIll[2];
            }
            ++lIllllIIIIII;
            0;
            if (-1 <= 1) continue;
            return ((0x61 ^ 1 ^ (0x7A ^ 0x21)) & (0x7A ^ 0x63 ^ (0xE7 ^ 0xC5) ^ -1)) != 0;
        }
        return lIIIlIIIll[0];
    }

    public static boolean x() {
        boolean bl;
        if (!e.lllIlIIIIlIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lIIIlIIIll[28]))) || e.lllIlIIIIIll((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lIIIlIIIll[31])))) {
            bl = lIIIlIIIll[0];
            0;
            if (2 <= 0) {
                return false;
            }
        } else {
            bl = lIIIlIIIll[2];
        }
        return bl;
    }

    public static void E() {
        block9: {
            int lIllIllIllIl = lIIIlIIIll[2];
            do {
                String[] stringArray = new String[lIIIlIIIll[0]];
                stringArray[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[21]];
                if (!e.lllIlIIIlIIl(TileObjects.getNearest((String[])stringArray)) || !e.lllIlIIIIIll(AccBuilderRogues.d ? 1 : 0)) break block9;
                AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[32]];
                String[] stringArray2 = new String[lIIIlIIIll[0]];
                stringArray2[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[67]];
                NPC lIllIllIllII = NPCs.getNearest((String[])stringArray2);
                if (e.lllIlIIIIIll(lIllIllIllIl)) {
                    if (e.lllIlIIIIIll(Dialog.isOpen() ? 1 : 0)) {
                        lIllIllIllII.interact(lIIIlIIIlI[lIIIlIIIll[68]]);
                    }
                    if (e.lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                        List lIllIllIlIll;
                        if (e.lllIlIIIIIll(Dialog.canContinueNPC() ? 1 : 0) && e.lllIlIIIIIll(Dialog.canContinue() ? 1 : 0) && e.lllIlIIIIIll((lIllIllIlIll = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                            List lIllIllIlIlI = lIllIllIlIll.stream().filter(widget -> {
                                boolean bl;
                                if (e.lllIlIIIIIll(widget.getText().contains(lIIIlIIIlI[lIIIlIIIll[74]]) ? 1 : 0)) {
                                    bl = lIIIlIIIll[0];
                                    0;
                                    if (-(0xAB ^ 0xA4 ^ (0x70 ^ 0x7B)) >= 0) {
                                        return ((0x8B ^ 0xBE ^ (0xB ^ 0x67)) & (0x7F ^ 0x65 ^ (0x63 ^ 0x20) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIlIIIll[2];
                                }
                                return bl;
                            }).collect(Collectors.toList());
                            if (e.lllIlIIIIIll(lIllIllIlIlI.isEmpty() ? 1 : 0)) {
                                Mouse.click((int)((Widget)lIllIllIlIlI.get(lIIIlIIIll[2])).getClickPoint().getX(), (int)((Widget)lIllIllIlIlI.get(lIIIlIIIll[2])).getClickPoint().getY(), (boolean)lIIIlIIIll[0]);
                                Time.sleepTicks((int)lIIIlIIIll[1]);
                                0;
                            }
                            if (e.lllIlIIIIlII(lIllIllIlIlI.size(), lIIIlIIIll[0])) {
                                lIllIllIllIl = lIIIlIIIll[0];
                            }
                        }
                        if (!e.lllIlIIIIIll(Dialog.canContinueNPC() ? 1 : 0) || e.lllIlIIIIlIl(Dialog.canContinue() ? 1 : 0)) {
                            Dialog.continueSpace();
                        }
                    }
                }
                if (e.lllIlIIIIlIl(lIllIllIllIl)) {
                    String[] stringArray3 = new String[lIIIlIIIll[0]];
                    stringArray3[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[69]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIIlIIIlI[lIIIlIIIll[70]]);
                    Time.sleepTicks((int)lIIIlIIIll[5]);
                    0;
                }
                Time.sleepTicks((int)lIIIlIIIll[0]);
                0;
                0;
            } while (3 >= ((0x67 ^ 0x72 ^ (0x53 ^ 0x1A)) & (0x31 ^ 9 ^ (0xA0 ^ 0xC4) ^ -1)));
            return;
        }
    }

    private static boolean lllIlIIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIlIIIllIl(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(HashMap<Integer, Integer> hashMap, boolean bl, boolean bl2) {
        if (e.lllIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(Y), lIIIlIIIll[4])) {
            int n2;
            AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[17]];
            WorldArea worldArea = new WorldArea(lIIIlIIIll[18], lIIIlIIIll[19], lIIIlIIIll[20], lIIIlIIIll[21], lIIIlIIIll[2]);
            int[] nArray = new int[lIIIlIIIll[0]];
            nArray[e.lIIIlIIIll[2]] = lIIIlIIIll[22];
            int n3 = Inventory.contains((int[])nArray);
            if (e.lllIlIIIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                n2 = lIIIlIIIll[0];
                0;
                if (1 <= ((36 + 115 - 26 + 10 ^ 39 + 74 - 108 + 141) & (0xC9 ^ 0x91 ^ (0x3E ^ 0x73) ^ -1))) {
                    return;
                }
            } else {
                n2 = lIIIlIIIll[2];
            }
            if (e.lllIlIIIIlIl(n3 & n2)) {
                int[] nArray2 = new int[lIIIlIIIll[0]];
                nArray2[e.lIIIlIIIll[2]] = lIIIlIIIll[22];
                Inventory.getFirst((int[])nArray2).interact(lIIIlIIIlI[lIIIlIIIll[23]]);
                Time.sleepTicks((int)lIIIlIIIll[8]);
                0;
            }
            Movement.walkTo((WorldPoint)Y);
            0;
            Time.sleepTicks((int)lIIIlIIIll[0]);
            0;
        }
        if (e.lllIlIIIlIII(Players.getLocal().getWorldLocation().distanceTo(Y), lIIIlIIIll[4])) {
            HashMap<Integer, Integer> lIlllIlIlllI;
            void lIlllIlIllII;
            void lIlllIlIllIl;
            if (e.lllIlIIIIIll(Bank.isOpen() ? 1 : 0)) {
                a.a();
            }
            AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[24]];
            if (e.lllIlIIIIlIl((int)lIlllIlIllIl) && e.lllIlIIIllIl(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks((int)lIIIlIIIll[4]);
                0;
            }
            if (e.lllIlIIIIlIl((int)lIlllIlIllII) && e.lllIlIIIllIl(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks((int)lIIIlIIIll[3]);
                0;
            }
            Iterator<Map.Entry<Integer, Integer>> lIlllIlIlIll = lIlllIlIlllI.entrySet().iterator();
            while (e.lllIlIIIIlIl(lIlllIlIlIll.hasNext() ? 1 : 0)) {
                Map.Entry<Integer, Integer> lIlllIlIlIlI = lIlllIlIlIll.next();
                int lIlllIlIlIIl = lIlllIlIlIlI.getKey();
                int lIlllIlIlIII = lIlllIlIlIlI.getValue();
                System.out.println("Key: " + lIlllIlIlIIl + ", Value: " + lIlllIlIlIII);
                a.a(lIlllIlIlIIl, lIlllIlIlIII);
                Time.sleepTicks((int)lIIIlIIIll[0]);
                0;
                0;
                if ((0x31 ^ 0x40 ^ (0xD8 ^ 0xAC)) != 0) continue;
                return;
            }
        }
    }

    public static int H() {
        return e.j(lIIIlIIIll[73]);
    }

    public static int t() {
        int n2 = e.c(lIIIlIIIll[2], Z.length - lIIIlIIIll[0]);
        return Z[n2];
    }

    private static boolean lllIlIIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void c(WorldPoint worldPoint) {
        void var7_7;
        void var5_5;
        void var4_4;
        int n2;
        int n3;
        int lIllIllllIIl;
        void lIllIlllllIl;
        WorldPoint lIllIllllllI;
        Client client = Static.getClient();
        Player player = client.getLocalPlayer();
        if (e.lllIlIIIllII(player)) {
            return;
        }
        WorldPoint lIllIllllIll = lIllIllllllI;
        int lIllIllllIlI = lIllIllllIll.getX() - lIllIlllllIl.getBaseX();
        Point lIllIllllIII = Perspective.localToCanvas((Client)lIllIlllllIl, (LocalPoint)LocalPoint.fromScene((int)lIllIllllIlI, (int)(lIllIllllIIl = lIllIllllIll.getY() - lIllIlllllIl.getBaseY())), (int)lIllIlllllIl.getPlane());
        if (e.lllIlIIIlIIl(lIllIllllIII)) {
            n3 = lIllIllllIII.getX();
            0;
            if (((0x93 ^ 0xBD ^ (0x11 ^ 0x18)) & (67 + 121 - 116 + 60 ^ 47 + 98 - 108 + 126 ^ -1)) == -1) {
                return;
            }
        } else {
            int lIllIlllIlll;
            n3 = lIllIlllIlll = lIIIlIIIll[62];
        }
        if (e.lllIlIIIlIIl(lIllIllllIII)) {
            n2 = lIllIllllIII.getY();
            0;
            if (2 > (0x35 ^ 0x24 ^ (0xD0 ^ 0xC5))) {
                return;
            }
        } else {
            n2 = lIIIlIIIll[62];
        }
        int n4 = n2;
        client.interact(lIIIlIIIll[2], MenuAction.WALK.getId(), (int)var4_4, (int)var5_5, (int)var7_7, n4);
    }

    /*
     * WARNING - void declaration
     */
    public static void b(WorldPoint worldPoint) {
        void lIlllIIlIllI;
        void lIlllIIlIlll;
        void lIlllIIllIII;
        WorldPoint worldPoint2 = new WorldPoint(lIIIlIIIll[43], lIIIlIIIll[44], lIIIlIIIll[2]);
        WorldArea worldArea = new WorldArea(lIIIlIIIll[45], lIIIlIIIll[46], lIIIlIIIll[9], lIIIlIIIll[47], lIIIlIIIll[2]);
        WorldArea worldArea2 = new WorldArea(lIIIlIIIll[48], lIIIlIIIll[49], lIIIlIIIll[50], lIIIlIIIll[51], lIIIlIIIll[2]);
        if (e.lllIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIlIIIll[6]) && e.lllIlIIIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.lllIlIIIIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.lllIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlIIIll[52], lIIIlIIIll[53], lIIIlIIIll[0])), lIIIlIIIll[30])) {
            AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[54]];
            if (e.lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)lIlllIIllIII);
            0;
            Time.sleepTicks((int)lIIIlIIIll[0]);
            0;
        }
        if (e.lllIlIIIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlllIIllIII), lIIIlIIIll[6]) && e.lllIlIIIlIII(Players.getLocal().getWorldLocation().getY(), lIIIlIIIll[44])) {
            if (e.lllIlIIIIIll(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lIIIlIIIll[0]];
                stringArray[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[55]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIlI[lIIIlIIIll[35]]);
                Time.sleepTicks((int)lIIIlIIIll[3]);
                0;
            }
            if (e.lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lIIIlIIIll[0]];
                stringArray[e.lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[56]];
                g.a(stringArray);
            }
        }
        if (e.lllIlIIIIlll(Players.getLocal().getWorldLocation().getY(), lIIIlIIIll[44]) && (!e.lllIlIIIIIll(lIlllIIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.lllIlIIIIIll(lIlllIIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || e.lllIlIIIlIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlIIIll[52], lIIIlIIIll[53], lIIIlIIIll[0])), lIIIlIIIll[30]))) {
            WorldPoint lIlllIIllIIl;
            AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[57]];
            if (e.lllIlIIIIlIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIlIIIll[43], lIIIlIIIll[58], lIIIlIIIll[2])) ? 1 : 0)) {
                e.c(new WorldPoint(lIIIlIIIll[43], lIIIlIIIll[59], lIIIlIIIll[2]));
                Time.sleepTicks((int)lIIIlIIIll[6]);
                0;
            }
            Movement.walkTo((WorldPoint)lIlllIIllIIl);
            0;
            Time.sleepTicks((int)lIIIlIIIll[0]);
            0;
        }
    }

    public static void a(String lIlllIIIlllI, String lIlllIIIllIl) {
        try {
            URL lIlllIIIllII = new URL(lIlllIIIlllI);
            HttpURLConnection lIlllIIIlIll = (HttpURLConnection)lIlllIIIllII.openConnection();
            lIlllIIIlIll.setRequestMethod(lIIIlIIIlI[lIIIlIIIll[47]]);
            lIlllIIIlIll.setRequestProperty(lIIIlIIIlI[lIIIlIIIll[60]], lIIIlIIIlI[lIIIlIIIll[61]]);
            lIlllIIIlIll.setDoOutput(lIIIlIIIll[0]);
            String lIlllIIIlIlI = "{\"content\": \"" + lIlllIIIllIl + "\"}";
            DataOutputStream lIlllIIIlIIl = new DataOutputStream(lIlllIIIlIll.getOutputStream());
            lIlllIIIlIIl.writeBytes(lIlllIIIlIlI);
            lIlllIIIlIIl.flush();
            lIlllIIIlIIl.close();
            int lIlllIIIlIII = lIlllIIIlIll.getResponseCode();
            System.out.println("Response Code: " + lIlllIIIlIII);
            lIlllIIIlIll.disconnect();
            0;
        }
        catch (Exception lIlllIIIllII) {
            lIlllIIIllII.printStackTrace();
        }
        if ((0x96 ^ 0x92) <= 0) {
            return;
        }
    }

    private static String lllIIlllIlIl(String lIllIlIllIlI, String lIllIlIllIIl) {
        try {
            SecretKeySpec lIllIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlIllIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIIll[8]), "DES");
            Cipher lIllIlIllllI = Cipher.getInstance("DES");
            lIllIlIllllI.init(lIIIlIIIll[3], lIllIlIlllll);
            return new String(lIllIlIllllI.doFinal(Base64.getDecoder().decode(lIllIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIlIlllIl) {
            lIllIlIlllIl.printStackTrace();
            return null;
        }
    }

    public static void c(String string) {
        FileWriter fileWriter = new FileWriter(lIIIlIIIlI[lIIIlIIIll[12]]);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(string + System.getProperty(lIIIlIIIlI[lIIIlIIIll[13]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    private static String lllIIlllIlII(String lIllIIlllIlI, String lIllIIlllIIl) {
        lIllIIlllIlI = new String(Base64.getDecoder().decode(lIllIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIllllIl = new StringBuilder();
        char[] lIllIIllllII = lIllIIlllIIl.toCharArray();
        int lIllIIlllIll = lIIIlIIIll[2];
        char[] lIllIIllIlIl = lIllIIlllIlI.toCharArray();
        int lIllIIllIlII = lIllIIllIlIl.length;
        int lIllIIllIIll = lIIIlIIIll[2];
        while (e.lllIlIIIlIlI(lIllIIllIIll, lIllIIllIlII)) {
            char lIllIlIIIIII = lIllIIllIlIl[lIllIIllIIll];
            lIllIIllllIl.append((char)(lIllIlIIIIII ^ lIllIIllllII[lIllIIlllIll % lIllIIllllII.length]));
            0;
            ++lIllIIlllIll;
            ++lIllIIllIIll;
            0;
            if (((18 + 46 - -124 + 48 ^ 182 + 13 - 130 + 127) & (66 + 17 - -12 + 60 ^ 145 + 135 - 109 + 12 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(lIllIIllllIl);
    }

    public static void C() {
        if (e.lllIlIIIIIll(e.j(lIIIlIIIll[63]))) {
            Widget lIllIlllIlII;
            if (e.lllIlIIIIIll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)lIIIlIIIll[0]);
                0;
            }
            if (e.lllIlIIIIlIl(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.lllIlIIIlIIl(lIllIlllIlII = Widgets.get((int)lIIIlIIIll[64], (int)lIIIlIIIll[54]))) {
                lIllIlllIlII.interact(lIIIlIIIlI[lIIIlIIIll[65]]);
                Time.sleepTicks((int)lIIIlIIIll[0]);
                0;
            }
        }
    }

    public static void y() {
        Widget lIlllIlIIlII;
        if (e.lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.lllIlIIIIlIl(e.x() ? 1 : 0)) {
            if (e.lllIlIIIIIll(e.z() ? 1 : 0)) {
                e.A();
            }
            if (e.lllIlIIIIlIl(e.z() ? 1 : 0)) {
                Widget lIlllIlIIIlI;
                Widget lIlllIlIIIll;
                lIlllIlIIlII = Widgets.get((int)lIIIlIIIll[25], (int)lIIIlIIIll[26], (int)lIIIlIIIll[7]);
                if (e.lllIlIIIlIIl(lIlllIlIIlII)) {
                    lIlllIlIIlII.interact(lIIIlIIIlI[lIIIlIIIll[27]]);
                    Time.sleepTicks((int)lIIIlIIIll[0]);
                    0;
                }
                if (e.lllIlIIIIIll(Vars.getBit((int)lIIIlIIIll[28])) && e.lllIlIIIlIIl(lIlllIlIIIll = Widgets.get((int)lIIIlIIIll[25], (int)lIIIlIIIll[29], (int)lIIIlIIIll[21]))) {
                    if (e.lllIlIIIIIll(lIlllIlIIIll.isVisible() ? 1 : 0)) {
                        lIlllIlIIIlI = Widgets.get((int)lIIIlIIIll[25], (int)lIIIlIIIll[30], (int)lIIIlIIIll[5]);
                        Mouse.click((int)lIlllIlIIIlI.getClickPoint().getX(), (int)lIlllIlIIIlI.getClickPoint().getY(), (boolean)lIIIlIIIll[0]);
                        Time.sleepTicks((int)lIIIlIIIll[0]);
                        0;
                    }
                    if (e.lllIlIIIIlIl(lIlllIlIIIll.isVisible() ? 1 : 0)) {
                        lIlllIlIIIll.interact(lIIIlIIIlI[lIIIlIIIll[29]]);
                        Time.sleepTicks((int)lIIIlIIIll[0]);
                        0;
                    }
                }
                if (e.lllIlIIIIIll(Vars.getBit((int)lIIIlIIIll[31])) && e.lllIlIIIlIIl(lIlllIlIIIll = Widgets.get((int)lIIIlIIIll[25], (int)lIIIlIIIll[29], (int)lIIIlIIIll[32]))) {
                    if (e.lllIlIIIIIll(lIlllIlIIIll.isVisible() ? 1 : 0)) {
                        lIlllIlIIIlI = Widgets.get((int)lIIIlIIIll[25], (int)lIIIlIIIll[30], (int)lIIIlIIIll[5]);
                        Mouse.click((int)lIlllIlIIIlI.getClickPoint().getX(), (int)lIlllIlIIIlI.getClickPoint().getY(), (boolean)lIIIlIIIll[0]);
                        Time.sleepTicks((int)lIIIlIIIll[0]);
                        0;
                    }
                    if (e.lllIlIIIIlIl(lIlllIlIIIll.isVisible() ? 1 : 0)) {
                        lIlllIlIIIll.interact(lIIIlIIIlI[lIIIlIIIll[30]]);
                        Time.sleepTicks((int)lIIIlIIIll[3]);
                        0;
                    }
                }
            }
        }
        if (e.lllIlIIIlIIl(lIlllIlIIlII = Widgets.get((int)lIIIlIIIll[25], (int)lIIIlIIIll[4]))) {
            lIlllIlIIlII.interact(lIIIlIIIlI[lIIIlIIIll[33]]);
            Time.sleepTicks((int)lIIIlIIIll[0]);
            0;
        }
    }

    private static boolean lllIlIIIIIll(int n2) {
        return n2 == 0;
    }

    public static boolean z() {
        boolean bl;
        if (e.lllIlIIIlIIl(Widgets.get((int)lIIIlIIIll[25], (int)lIIIlIIIll[0]))) {
            bl = lIIIlIIIll[0];
            0;
            
            }
        } else {
            bl = lIIIlIIIll[2];
        }
        return bl;
    }

    public static boolean i(int n2) {
        int[] nArray = new int[lIIIlIIIll[0]];
        nArray[e.lIIIlIIIll[2]] = n2;
        return Bank.contains((int[])nArray);
    }

    private static boolean lllIlIIIlIll(int n2, int n3) {
        return n2 != n3;
    }

    private static String lllIIlllIllI(String lIllIlIIllll, String lIllIlIIllII) {
        try {
            SecretKeySpec lIllIlIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIlIlIIIl = Cipher.getInstance("Blowfish");
            lIllIlIlIIIl.init(lIIIlIIIll[3], lIllIlIlIIlI);
            return new String(lIllIlIlIIIl.doFinal(Base64.getDecoder().decode(lIllIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIlIlIIII) {
            lIllIlIlIIII.printStackTrace();
            return null;
        }
    }

    public static String b(long l2) {
        Object[] objectArray = new Object[lIIIlIIIll[0]];
        objectArray[e.lIIIlIIIll[2]] = lIIIlIIIll[3];
        String string = String.format(lIIIlIIIlI[lIIIlIIIll[11]], objectArray);
        Object[] objectArray2 = new Object[lIIIlIIIll[0]];
        objectArray2[e.lIIIlIIIll[2]] = (l2 /= 1000L) % 60L;
        String string2 = String.format(string, objectArray2);
        Object[] objectArray3 = new Object[lIIIlIIIll[0]];
        objectArray3[e.lIIIlIIIll[2]] = l2 % 3600L / 60L;
        String string3 = String.format(string, objectArray3);
        Object[] objectArray4 = new Object[lIIIlIIIll[0]];
        objectArray4[e.lIIIlIIIll[2]] = l2 / 3600L;
        String string4 = String.format(string, objectArray4);
        String string5 = string4 + ":" + string3 + ":" + string2;
        return string5;
    }

    /*
     * WARNING - void declaration
     */
    public static void k(int n2) {
        if (e.lllIlIIIlIll(Static.getClient().getWorld(), n2)) {
            void lIlllIlllIIl;
            WorldResult worldResult = Static.getWorldService().getWorlds();
            net.runelite.http.api.worlds.World world = worldResult.findWorld(n2);
            if (e.lllIlIIIllII(world)) {
                return;
            }
            if (e.lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            World lIlllIlllIII = Static.getClient().createWorld();
            lIlllIlllIII.setActivity(lIlllIlllIIl.getActivity());
            lIlllIlllIII.setAddress(lIlllIlllIIl.getAddress());
            lIlllIlllIII.setId(lIlllIlllIIl.getId());
            lIlllIlllIII.setPlayerCount(lIlllIlllIIl.getPlayers());
            lIlllIlllIII.setLocation(lIlllIlllIIl.getLocation());
            lIlllIlllIII.setTypes(WorldUtil.toWorldTypes((EnumSet)lIlllIlllIIl.getTypes()));
            Worlds.hopTo((World)lIlllIlllIII);
        }
    }

    public static void G() {
        if (e.lllIlIIIIIll(Widgets.get((int)lIIIlIIIll[72]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get((int)lIIIlIIIll[72], (int)lIIIlIIIll[23]);
            Mouse.click((int)widget.getClickPoint().getX(), (int)widget.getClickPoint().getY(), (boolean)lIIIlIIIll[0]);
            Time.sleepTicks((int)lIIIlIIIll[1]);
            0;
        }
    }

    private static void lllIIlllIlll() {
        lIIIlIIIlI = new String[lIIIlIIIll[20]];
        e.lIIIlIIIlI[e.lIIIlIIIll[2]] = e."Nav to veos";
        e.lIIIlIIIlI[e.lIIIlIIIll[0]] = e."Handle veos chat";
        e.lIIIlIIIlI[e.lIIIlIIIll[3]] = e."Port Piscarilius";
        e.lIIIlIIIlI[e.lIIIlIIIll[1]] = e."Port Piscarilius";
        e.lIIIlIIIlI[e.lIIIlIIIll[4]] = e."Port Piscarilius";
        e.lIIIlIIIlI[e.lIIIlIIIll[5]] = e."Veos";
        e.lIIIlIIIlI[e.lIIIlIIIll[6]] = e."Cabin Boy Herbert";
        e.lIIIlIIIlI[e.lIIIlIIIll[7]] = e."Port Piscarilius";
        e.lIIIlIIIlI[e.lIIIlIIIll[8]] = e."Port Piscarilius";
        e.lIIIlIIIlI[e.lIIIlIIIll[9]] = e."Port Piscarilius";
        e.lIIIlIIIlI[e.lIIIlIIIll[10]] = e."Cabin Boy Herbert";
        e.lIIIlIIIlI[e.lIIIlIIIll[11]] = e."%%0%dd";
        e.lIIIlIIIlI[e.lIIIlIIIll[12]] = e."C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";
        e.lIIIlIIIlI[e.lIIIlIIIll[13]] = e."line.separator";
        e.lIIIlIIIlI[e.lIIIlIIIll[16]] = e."Close";
        e.lIIIlIIIlI[e.lIIIlIIIll[17]] = e."Nav to Varrock W bank";
        e.lIIIlIIIlI[e.lIIIlIIIll[23]] = e."Break";
        e.lIIIlIIIlI[e.lIIIlIIIll[24]] = e."Handling banking";
        e.lIIIlIIIlI[e.lIIIlIIIll[27]] = e."Select Warnings";
        e.lIIIlIIIlI[e.lIIIlIIIll[29]] = e."Toggle";
        e.lIIIlIIIlI[e.lIIIlIIIll[30]] = e."Toggle";
        e.lIIIlIIIlI[e.lIIIlIIIll[33]] = e."Close";
        e.lIIIlIIIlI[e.lIIIlIIIll[36]] = e."All Settings";
        e.lIIIlIIIlI[e.lIIIlIIIll[26]] = e."Wear";
        e.lIIIlIIIlI[e.lIIIlIIIll[37]] = e."Wear";
        e.lIIIlIIIlI[e.lIIIlIIIll[38]] = e."Wield";
        e.lIIIlIIIlI[e.lIIIlIIIll[39]] = e."Wield";
        e.lIIIlIIIlI[e.lIIIlIIIll[40]] = e."Equip";
        e.lIIIlIIIlI[e.lIIIlIIIll[41]] = e."Equip";
        e.lIIIlIIIlI[e.lIIIlIIIll[15]] = e."Give me a PK skull.";
        e.lIIIlIIIlI[e.lIIIlIIIll[54]] = e."Nav to outside gate";
        e.lIIIlIIIlI[e.lIIIlIIIll[55]] = e."Gate";
        e.lIIIlIIIlI[e.lIIIlIIIll[35]] = e."Open";
        e.lIIIlIIIlI[e.lIIIlIIIll[56]] = e."Sorry, I'm a bit busy.";
        e.lIIIlIIIlI[e.lIIIlIIIll[57]] = e."Nav to stronghold tile";
        e.lIIIlIIIlI[e.lIIIlIIIll[47]] = e."POST";
        e.lIIIlIIIlI[e.lIIIlIIIll[60]] = e."Content-Type";
        e.lIIIlIIIlI[e.lIIIlIIIll[61]] = e."application/json";
        e.lIIIlIIIlI[e.lIIIlIIIll[65]] = e."Auto retaliate";
        e.lIIIlIIIlI[e.lIIIlIIIll[66]] = e."Auto retaliate";
        e.lIIIlIIIlI[e.lIIIlIIIll[21]] = e."Death's Coffer";
        e.lIIIlIIIlI[e.lIIIlIIIll[32]] = e."Handling death";
        e.lIIIlIIIlI[e.lIIIlIIIll[67]] = e."Death";
        e.lIIIlIIIlI[e.lIIIlIIIll[68]] = e."Talk-to";
        e.lIIIlIIIlI[e.lIIIlIIIll[69]] = e."Portal";
        e.lIIIlIIIlI[e.lIIIlIIIll[70]] = e."Use";
        e.lIIIlIIIlI[e.lIIIlIIIll[74]] = e."<str>";
        e.lIIIlIIIlI[e.lIIIlIIIll[76]] = e."total";
        e.lIIIlIIIlI[e.lIIIlIIIll[77]] = e."PvP";
        e.lIIIlIIIlI[e.lIIIlIIIll[78]] = e."PvP";
        e.lIIIlIIIlI[e.lIIIlIIIll[71]] = e."High";
        e.lIIIlIIIlI[e.lIIIlIIIll[81]] = e."Leagues";
        e.lIIIlIIIlI[e.lIIIlIIIll[82]] = e."Beta";
        e.lIIIlIIIlI[e.lIIIlIIIll[83]] = e."beta";
        e.lIIIlIIIlI[e.lIIIlIIIll[84]] = e."Deadman";
        e.lIIIlIIIlI[e.lIIIlIIIll[85]] = e."Deadman";
        e.lIIIlIIIlI[e.lIIIlIIIll[86]] = e."Speedrunning";
        e.lIIIlIIIlI[e.lIIIlIIIll[87]] = e."total";
        e.lIIIlIIIlI[e.lIIIlIIIll[88]] = e."Beta";
        e.lIIIlIIIlI[e.lIIIlIIIll[90]] = e."Port Piscarilius";
        e.lIIIlIIIlI[e.lIIIlIIIll[91]] = e."C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";
    }

    public static void w() {
        Widget widget = Widgets.get((int)lIIIlIIIll[14], (int)lIIIlIIIll[15], (int)lIIIlIIIll[2]);
        if (e.lllIlIIIlIIl(widget)) {
            widget.interact(lIIIlIIIlI[lIIIlIIIll[16]]);
            Time.sleepTicks((int)lIIIlIIIll[1]);
            0;
        }
    }

    public static double u() {
        double d2 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS);
        double d3 = Skills.getLevel((Skill)Skill.HITPOINTS);
        return d2 / d3 * 100.0;
    }

    public static void A() {
        Widget widget = Widgets.get((int)lIIIlIIIll[34], (int)lIIIlIIIll[35]);
        if (e.lllIlIIIlIIl(widget)) {
            widget.interact(lIIIlIIIlI[lIIIlIIIll[36]]);
            Time.sleepTicks((int)lIIIlIIIll[0]);
            0;
        }
    }

    private static boolean lllIlIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static void v() {
        if (e.lllIlIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks((int)lIIIlIIIll[4]);
            0;
        }
        if (e.lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.lllIlIIIIIll(Bank.isOpen() ? 1 : 0)) {
            e.B();
        }
    }

    private static boolean lllIlIIIllII(Object object) {
        return object == null;
    }

    private static boolean lllIlIIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIIIllI(int n2) {
        return n2 < 0;
    }

    private static boolean lllIlIIIlIIl(Object object) {
        return object != null;
    }
}

