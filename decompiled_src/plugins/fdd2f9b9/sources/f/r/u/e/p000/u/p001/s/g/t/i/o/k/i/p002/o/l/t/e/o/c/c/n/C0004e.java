package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

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
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.World;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/e.class */
public class C0004e {
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
        if (lllIlIIIIlII(j(lIIIlIIIll[63]), lIIIlIIIll[0])) {
            if (lllIlIIIIIll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lIIIlIIIll[0]);
                "".length();
            }
            if (lllIlIIIIlIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lIIIlIIIll[64], lIIIlIIIll[54]);
                if (lllIlIIIlIIl(widget)) {
                    widget.interact(lIIIlIIIlI[lIIIlIIIll[66]]);
                    Time.sleepTicks(lIIIlIIIll[0]);
                    "".length();
                }
            }
        }
    }

    public static int j(int i) {
        return ((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarpValue(i));
        })).intValue();
    }

    public static int c(int i, int i2) {
        int i3 = i2 - i;
        if (lllIlIIIIIll(i3)) {
            return i;
        }
        if (lllIlIIIIlII(Math.abs(i3), lIIIlIIIll[0])) {
            if (lllIlIIIIlIl(S.nextBoolean() ? 1 : 0)) {
                "".length();
                return "  ".length() <= " ".length() ? ((236 ^ 136) ^ (228 ^ 191)) & (((246 ^ 171) ^ (109 ^ 15)) ^ (-" ".length())) : i;
            }
            return i2;
        }
        if (lllIlIIIIllI(i3)) {
            i = i2;
            i2 = i;
        }
        return i + S.nextInt((i2 - i) + lIIIlIIIll[0]);
    }

    private static boolean lllIlIIIIlII(int i, int i2) {
        return i == i2;
    }

    static {
        lllIlIIIIIlI();
        lllIIlllIlll();
        R = lIIIlIIIlI[lIIIlIIIll[91]];
        S = ThreadLocalRandom.current();
        T = new WorldArea(lIIIlIIIll[92], lIIIlIIIll[93], lIIIlIIIll[71], lIIIlIIIll[77], lIIIlIIIll[2]);
        U = new WorldArea(lIIIlIIIll[94], lIIIlIIIll[95], lIIIlIIIll[26], lIIIlIIIll[54], lIIIlIIIll[0]);
        V = System.currentTimeMillis();
        W = System.nanoTime();
        X = new HashMap();
        Y = new WorldPoint(lIIIlIIIll[96], lIIIlIIIll[97], lIIIlIIIll[2]);
        int[] iArr = new int[lIIIlIIIll[98]];
        iArr[lIIIlIIIll[2]] = lIIIlIIIll[99];
        iArr[lIIIlIIIll[0]] = lIIIlIIIll[100];
        iArr[lIIIlIIIll[3]] = lIIIlIIIll[101];
        iArr[lIIIlIIIll[1]] = lIIIlIIIll[102];
        iArr[lIIIlIIIll[4]] = lIIIlIIIll[103];
        iArr[lIIIlIIIll[5]] = lIIIlIIIll[104];
        iArr[lIIIlIIIll[6]] = lIIIlIIIll[105];
        iArr[lIIIlIIIll[7]] = lIIIlIIIll[106];
        iArr[lIIIlIIIll[8]] = lIIIlIIIll[107];
        iArr[lIIIlIIIll[9]] = lIIIlIIIll[108];
        iArr[lIIIlIIIll[10]] = lIIIlIIIll[109];
        iArr[lIIIlIIIll[11]] = lIIIlIIIll[110];
        iArr[lIIIlIIIll[12]] = lIIIlIIIll[111];
        iArr[lIIIlIIIll[13]] = lIIIlIIIll[112];
        iArr[lIIIlIIIll[16]] = lIIIlIIIll[113];
        iArr[lIIIlIIIll[17]] = lIIIlIIIll[114];
        iArr[lIIIlIIIll[23]] = lIIIlIIIll[115];
        iArr[lIIIlIIIll[24]] = lIIIlIIIll[116];
        iArr[lIIIlIIIll[27]] = lIIIlIIIll[117];
        iArr[lIIIlIIIll[29]] = lIIIlIIIll[118];
        iArr[lIIIlIIIll[30]] = lIIIlIIIll[119];
        iArr[lIIIlIIIll[33]] = lIIIlIIIll[120];
        iArr[lIIIlIIIll[36]] = lIIIlIIIll[121];
        iArr[lIIIlIIIll[26]] = lIIIlIIIll[122];
        iArr[lIIIlIIIll[37]] = lIIIlIIIll[123];
        iArr[lIIIlIIIll[38]] = lIIIlIIIll[124];
        iArr[lIIIlIIIll[39]] = lIIIlIIIll[125];
        iArr[lIIIlIIIll[40]] = lIIIlIIIll[126];
        iArr[lIIIlIIIll[41]] = lIIIlIIIll[127];
        iArr[lIIIlIIIll[15]] = lIIIlIIIll[128];
        iArr[lIIIlIIIll[54]] = lIIIlIIIll[129];
        iArr[lIIIlIIIll[55]] = lIIIlIIIll[130];
        iArr[lIIIlIIIll[35]] = lIIIlIIIll[131];
        iArr[lIIIlIIIll[56]] = lIIIlIIIll[132];
        iArr[lIIIlIIIll[57]] = lIIIlIIIll[133];
        iArr[lIIIlIIIll[47]] = lIIIlIIIll[134];
        iArr[lIIIlIIIll[60]] = lIIIlIIIll[135];
        iArr[lIIIlIIIll[61]] = lIIIlIIIll[136];
        iArr[lIIIlIIIll[65]] = lIIIlIIIll[137];
        iArr[lIIIlIIIll[66]] = lIIIlIIIll[138];
        iArr[lIIIlIIIll[21]] = lIIIlIIIll[139];
        iArr[lIIIlIIIll[32]] = lIIIlIIIll[140];
        iArr[lIIIlIIIll[67]] = lIIIlIIIll[141];
        iArr[lIIIlIIIll[68]] = lIIIlIIIll[142];
        iArr[lIIIlIIIll[69]] = lIIIlIIIll[143];
        iArr[lIIIlIIIll[70]] = lIIIlIIIll[144];
        iArr[lIIIlIIIll[74]] = lIIIlIIIll[145];
        iArr[lIIIlIIIll[76]] = lIIIlIIIll[146];
        iArr[lIIIlIIIll[77]] = lIIIlIIIll[147];
        iArr[lIIIlIIIll[78]] = lIIIlIIIll[148];
        iArr[lIIIlIIIll[71]] = lIIIlIIIll[149];
        iArr[lIIIlIIIll[81]] = lIIIlIIIll[150];
        iArr[lIIIlIIIll[82]] = lIIIlIIIll[151];
        iArr[lIIIlIIIll[83]] = lIIIlIIIll[152];
        iArr[lIIIlIIIll[84]] = lIIIlIIIll[153];
        iArr[lIIIlIIIll[85]] = lIIIlIIIll[154];
        iArr[lIIIlIIIll[86]] = lIIIlIIIll[155];
        iArr[lIIIlIIIll[87]] = lIIIlIIIll[156];
        iArr[lIIIlIIIll[88]] = lIIIlIIIll[157];
        iArr[lIIIlIIIll[90]] = lIIIlIIIll[158];
        iArr[lIIIlIIIll[91]] = lIIIlIIIll[159];
        iArr[lIIIlIIIll[20]] = lIIIlIIIll[160];
        iArr[lIIIlIIIll[161]] = lIIIlIIIll[162];
        iArr[lIIIlIIIll[163]] = lIIIlIIIll[164];
        iArr[lIIIlIIIll[165]] = lIIIlIIIll[166];
        iArr[lIIIlIIIll[167]] = lIIIlIIIll[168];
        iArr[lIIIlIIIll[169]] = lIIIlIIIll[170];
        iArr[lIIIlIIIll[171]] = lIIIlIIIll[172];
        iArr[lIIIlIIIll[173]] = lIIIlIIIll[174];
        iArr[lIIIlIIIll[175]] = lIIIlIIIll[176];
        iArr[lIIIlIIIll[177]] = lIIIlIIIll[178];
        iArr[lIIIlIIIll[50]] = lIIIlIIIll[179];
        iArr[lIIIlIIIll[180]] = lIIIlIIIll[181];
        iArr[lIIIlIIIll[182]] = lIIIlIIIll[183];
        iArr[lIIIlIIIll[184]] = lIIIlIIIll[185];
        iArr[lIIIlIIIll[186]] = lIIIlIIIll[187];
        iArr[lIIIlIIIll[188]] = lIIIlIIIll[189];
        iArr[lIIIlIIIll[190]] = lIIIlIIIll[191];
        iArr[lIIIlIIIll[192]] = lIIIlIIIll[193];
        iArr[lIIIlIIIll[194]] = lIIIlIIIll[195];
        iArr[lIIIlIIIll[196]] = lIIIlIIIll[197];
        iArr[lIIIlIIIll[198]] = lIIIlIIIll[199];
        iArr[lIIIlIIIll[200]] = lIIIlIIIll[201];
        iArr[lIIIlIIIll[202]] = lIIIlIIIll[203];
        iArr[lIIIlIIIll[204]] = lIIIlIIIll[205];
        iArr[lIIIlIIIll[206]] = lIIIlIIIll[207];
        iArr[lIIIlIIIll[208]] = lIIIlIIIll[209];
        iArr[lIIIlIIIll[210]] = lIIIlIIIll[211];
        iArr[lIIIlIIIll[212]] = lIIIlIIIll[213];
        iArr[lIIIlIIIll[214]] = lIIIlIIIll[215];
        iArr[lIIIlIIIll[216]] = lIIIlIIIll[217];
        iArr[lIIIlIIIll[218]] = lIIIlIIIll[219];
        iArr[lIIIlIIIll[220]] = lIIIlIIIll[221];
        iArr[lIIIlIIIll[222]] = lIIIlIIIll[223];
        iArr[lIIIlIIIll[224]] = lIIIlIIIll[225];
        iArr[lIIIlIIIll[226]] = lIIIlIIIll[227];
        iArr[lIIIlIIIll[228]] = lIIIlIIIll[229];
        iArr[lIIIlIIIll[230]] = lIIIlIIIll[231];
        iArr[lIIIlIIIll[232]] = lIIIlIIIll[233];
        iArr[lIIIlIIIll[234]] = lIIIlIIIll[235];
        iArr[lIIIlIIIll[89]] = lIIIlIIIll[236];
        iArr[lIIIlIIIll[73]] = lIIIlIIIll[237];
        iArr[lIIIlIIIll[238]] = lIIIlIIIll[239];
        iArr[lIIIlIIIll[240]] = lIIIlIIIll[241];
        iArr[lIIIlIIIll[242]] = lIIIlIIIll[243];
        iArr[lIIIlIIIll[244]] = lIIIlIIIll[245];
        iArr[lIIIlIIIll[246]] = lIIIlIIIll[247];
        Z = iArr;
        aa = new WorldPoint(lIIIlIIIll[248], lIIIlIIIll[249], lIIIlIIIll[3]);
        ab = new WorldArea(lIIIlIIIll[250], lIIIlIIIll[251], lIIIlIIIll[56], lIIIlIIIll[36], lIIIlIIIll[2]);
    }

    public static void l(int i) {
        int[] iArr = new int[lIIIlIIIll[0]];
        iArr[lIIIlIIIll[2]] = i;
        if (lllIlIIIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIlIIIll[0]];
            iArr2[lIIIlIIIll[2]] = i;
            if (lllIlIIIIIll(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIlIIIll[0]];
                iArr3[lIIIlIIIll[2]] = i;
                Item first = Inventory.getFirst(iArr3);
                String[] strArr = new String[lIIIlIIIll[0]];
                strArr[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[26]];
                if (lllIlIIIIlIl(first.hasAction(strArr) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIIlIIIll[0]];
                    iArr4[lIIIlIIIll[2]] = i;
                    Inventory.getFirst(iArr4).interact(lIIIlIIIlI[lIIIlIIIll[37]]);
                }
                int[] iArr5 = new int[lIIIlIIIll[0]];
                iArr5[lIIIlIIIll[2]] = i;
                Item first2 = Inventory.getFirst(iArr5);
                String[] strArr2 = new String[lIIIlIIIll[0]];
                strArr2[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[38]];
                if (lllIlIIIIlIl(first2.hasAction(strArr2) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIIlIIIll[0]];
                    iArr6[lIIIlIIIll[2]] = i;
                    Inventory.getFirst(iArr6).interact(lIIIlIIIlI[lIIIlIIIll[39]]);
                }
                int[] iArr7 = new int[lIIIlIIIll[0]];
                iArr7[lIIIlIIIll[2]] = i;
                Item first3 = Inventory.getFirst(iArr7);
                String[] strArr3 = new String[lIIIlIIIll[0]];
                strArr3[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[40]];
                if (lllIlIIIIlIl(first3.hasAction(strArr3) ? 1 : 0)) {
                    int[] iArr8 = new int[lIIIlIIIll[0]];
                    iArr8[lIIIlIIIll[2]] = i;
                    Inventory.getFirst(iArr8).interact(lIIIlIIIlI[lIIIlIIIll[41]]);
                }
                if (lllIlIIIIlII(i, lIIIlIIIll[42])) {
                    Time.sleepTicks(lIIIlIIIll[1]);
                    "".length();
                    String[] strArr4 = new String[lIIIlIIIll[0]];
                    strArr4[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[15]];
                    C0006g.a(strArr4);
                    Time.sleepTicks(lIIIlIIIll[0]);
                    "".length();
                }
            }
        }
    }

    public static void B() {
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (lllIlIIIIlIl(world.isMembers() ? 1 : 0) && lllIlIIIlIII(world.getPlayerCount(), lIIIlIIIll[75]) && lllIlIIIlIll(world.getId(), Worlds.getCurrentId()) && lllIlIIIIIll(world.getActivity().endsWith(lIIIlIIIlI[lIIIlIIIll[76]]) ? 1 : 0) && lllIlIIIIIll(world.getActivity().endsWith(lIIIlIIIlI[lIIIlIIIll[77]]) ? 1 : 0) && lllIlIIIIIll(world.getActivity().startsWith(lIIIlIIIlI[lIIIlIIIll[78]]) ? 1 : 0) && lllIlIIIIIll(world.getActivity().startsWith(lIIIlIIIlI[lIIIlIIIll[71]]) ? 1 : 0) && lllIlIIIlIll(world.getId(), lIIIlIIIll[79]) && lllIlIIIlIll(world.getId(), lIIIlIIIll[80]) && lllIlIIIlIll(world.getId(), lIIIlIIIll[80]) && lllIlIIIIIll(world.getActivity().contains(lIIIlIIIlI[lIIIlIIIll[81]]) ? 1 : 0) && lllIlIIIIIll(world.getActivity().contains(lIIIlIIIlI[lIIIlIIIll[82]]) ? 1 : 0) && lllIlIIIIIll(world.getActivity().contains(lIIIlIIIlI[lIIIlIIIll[83]]) ? 1 : 0) && lllIlIIIIIll(world.getActivity().startsWith(lIIIlIIIlI[lIIIlIIIll[84]]) ? 1 : 0) && lllIlIIIIIll(world.getActivity().endsWith(lIIIlIIIlI[lIIIlIIIll[85]]) ? 1 : 0) && lllIlIIIIIll(world.getActivity().endsWith(lIIIlIIIlI[lIIIlIIIll[86]]) ? 1 : 0) && lllIlIIIIIll(world.getActivity().endsWith(lIIIlIIIlI[lIIIlIIIll[87]]) ? 1 : 0) && lllIlIIIIIll(world.getActivity().startsWith(lIIIlIIIlI[lIIIlIIIll[88]]) ? 1 : 0) && lllIlIIIIlll(world.getPlayerCount(), lIIIlIIIll[89])) {
                ?? r0 = lIIIlIIIll[0];
                "".length();
                return !((true ^ true) ^ (true ^ true)) ? ((34 ^ 44) ^ (173 ^ 138)) & (((5 ^ 16) ^ (178 ^ 142)) ^ (-" ".length())) : r0;
            }
            return lIIIlIIIll[2];
        }));
    }

    public static long s() {
        return V + ((System.nanoTime() - W) / 1000000);
    }

    public static String h(int i) {
        return NumberFormat.getNumberInstance(Locale.US).format(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public static boolean F() {
        if (lllIlIIIIIll(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIIIIIll(U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(aa), lIIIlIIIll[71]) && !lllIlIIIIlIl(ab.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIlIIIll[2];
        }
        ?? r0 = lIIIlIIIll[0];
        "".length();
        return "  ".length() < (((49 ^ 119) ^ (214 ^ 152)) & (((45 ^ 77) ^ (236 ^ 132)) ^ (-" ".length()))) ? ((106 ^ 0) ^ (157 ^ 174)) & (((22 ^ 1) ^ (245 ^ 187)) ^ (-" ".length())) : r0;
    }

    private static void lllIlIIIIIlI() {
        lIIIlIIIll = new int[252];
        lIIIlIIIll[0] = " ".length();
        lIIIlIIIll[1] = "   ".length();
        lIIIlIIIll[2] = " ".length() & (" ".length() ^ (-1));
        lIIIlIIIll[3] = "  ".length();
        lIIIlIIIll[4] = (((106 + 83) - 125) + 124) ^ (((123 + 152) - 148) + 57);
        lIIIlIIIll[5] = 98 ^ 103;
        lIIIlIIIll[6] = (148 ^ 169) ^ (180 ^ 143);
        lIIIlIIIll[7] = 79 ^ 72;
        lIIIlIIIll[8] = 161 ^ 169;
        lIIIlIIIll[9] = 185 ^ 176;
        lIIIlIIIll[10] = 176 ^ 186;
        lIIIlIIIll[11] = 150 ^ 157;
        lIIIlIIIll[12] = 131 ^ 143;
        lIIIlIIIll[13] = (125 ^ 46) ^ (192 ^ 158);
        lIIIlIIIll[14] = (-((-697) & 32765)) & (-3) & 32734;
        lIIIlIIIll[15] = 223 ^ 194;
        lIIIlIIIll[16] = (228 ^ 188) ^ (246 ^ 160);
        lIIIlIIIll[17] = 69 ^ 74;
        lIIIlIIIll[18] = (-((-1225) & 6111)) & (-1) & 8054;
        lIIIlIIIll[19] = (-((-2373) & 19406)) & (-1) & 20447;
        lIIIlIIIll[20] = 15 ^ 50;
        lIIIlIIIll[21] = (10 ^ 87) ^ (100 ^ 17);
        lIIIlIIIll[22] = (-((-1351) & 9695)) & (-33) & 16383;
        lIIIlIIIll[23] = 76 ^ 92;
        lIIIlIIIll[24] = (37 ^ 64) ^ (8 ^ 124);
        lIIIlIIIll[25] = (((133 ^ 147) + (59 ^ 42)) - (117 ^ 101)) + (170 ^ 197);
        lIIIlIIIll[26] = (133 ^ 193) ^ (64 ^ 19);
        lIIIlIIIll[27] = (((140 + 112) - 110) + 27) ^ (((128 + 133) - 103) + 29);
        lIIIlIIIll[28] = (-19) & 14718;
        lIIIlIIIll[29] = (194 ^ 135) ^ (33 ^ 119);
        lIIIlIIIll[30] = 8 ^ 28;
        lIIIlIIIll[31] = (-641) & 15341;
        lIIIlIIIll[32] = 131 ^ 170;
        lIIIlIIIll[33] = 213 ^ 192;
        lIIIlIIIll[34] = (92 ^ 17) ^ (10 ^ 51);
        lIIIlIIIll[35] = (5 ^ 120) ^ (18 ^ 79);
        lIIIlIIIll[36] = (((119 + 51) - 57) + 68) ^ (((140 + 16) - 2) + 9);
        lIIIlIIIll[37] = 140 ^ 148;
        lIIIlIIIll[38] = 124 ^ 101;
        lIIIlIIIll[39] = (((72 + 86) - 24) + 14) ^ (((30 + 138) - 45) + 19);
        lIIIlIIIll[40] = 21 ^ 14;
        lIIIlIIIll[41] = 163 ^ 191;
        lIIIlIIIll[42] = (-9315) & 31871;
        lIIIlIIIll[43] = (-12289) & 14749;
        lIIIlIIIll[44] = (-20481) & 23863;
        lIIIlIIIll[45] = (-((-5137) & 13365)) & (-5121) & 15805;
        lIIIlIIIll[46] = (-29189) & 32572;
        lIIIlIIIll[47] = 227 ^ 192;
        lIIIlIIIll[48] = (-29185) & 31607;
        lIIIlIIIll[49] = (-((-433) & 5105)) & (-24577) & 32639;
        lIIIlIIIll[50] = 23 ^ 80;
        lIIIlIIIll[51] = ((43 + 102) - 74) + 72;
        lIIIlIIIll[52] = (-16930) & 19389;
        lIIIlIIIll[53] = (-((-853) & 13303)) & (-16389) & 32255;
        lIIIlIIIll[54] = 165 ^ 187;
        lIIIlIIIll[55] = (70 ^ 13) ^ (30 ^ 74);
        lIIIlIIIll[56] = (119 ^ 39) ^ (75 ^ 58);
        lIIIlIIIll[57] = 166 ^ 132;
        lIIIlIIIll[58] = (-8771) & 12155;
        lIIIlIIIll[59] = (-12803) & 16199;
        lIIIlIIIll[60] = 48 ^ 20;
        lIIIlIIIll[61] = (((10 + 51) - (-106)) + 60) ^ (((64 + 72) - 25) + 87);
        lIIIlIIIll[62] = -" ".length();
        lIIIlIIIll[63] = ((37 + 7) - 4) + 132;
        lIIIlIIIll[64] = (-((-257) & 15657)) & (-16519) & 32511;
        lIIIlIIIll[65] = (252 ^ 183) ^ (26 ^ 119);
        lIIIlIIIll[66] = 139 ^ 172;
        lIIIlIIIll[67] = (154 ^ 189) ^ (155 ^ 150);
        lIIIlIIIll[68] = 105 ^ 66;
        lIIIlIIIll[69] = 0 ^ 44;
        lIIIlIIIll[70] = 100 ^ 73;
        lIIIlIIIll[71] = 43 ^ 25;
        lIIIlIIIll[72] = ((95 + 119) - 96) + 35;
        lIIIlIIIll[73] = 229 ^ 128;
        lIIIlIIIll[74] = 6 ^ 40;
        lIIIlIIIll[75] = (-((-1157) & 19622)) & (-8193) & 28607;
        lIIIlIIIll[76] = (((65 + 32) - 12) + 54) ^ (((161 + 95) - 201) + 109);
        lIIIlIIIll[77] = (32 ^ 78) ^ (57 ^ 103);
        lIIIlIIIll[78] = (251 ^ 137) ^ (33 ^ 98);
        lIIIlIIIll[79] = (-12834) & 13307;
        lIIIlIIIll[80] = (-((-643) & 9195)) & (-2177) & 11261;
        lIIIlIIIll[81] = (113 ^ 106) ^ (10 ^ 34);
        lIIIlIIIll[82] = 159 ^ 171;
        lIIIlIIIll[83] = 110 ^ 91;
        lIIIlIIIll[84] = (93 ^ 45) ^ (90 ^ 28);
        lIIIlIIIll[85] = (244 ^ 180) ^ (194 ^ 181);
        lIIIlIIIll[86] = 159 ^ 167;
        lIIIlIIIll[87] = (29 ^ 99) ^ (12 ^ 75);
        lIIIlIIIll[88] = (13 ^ 84) ^ (102 ^ 5);
        lIIIlIIIll[89] = 73 ^ 45;
        lIIIlIIIll[90] = (4 ^ 41) ^ (134 ^ 144);
        lIIIlIIIll[91] = (133 ^ 137) ^ (39 ^ 23);
        lIIIlIIIll[92] = (-28809) & 31998;
        lIIIlIIIll[93] = (-((-18937) & 31739)) & (-385) & 16383;
        lIIIlIIIll[94] = (-((-1513) & 26602)) & (-385) & 28671;
        lIIIlIIIll[95] = (-28969) & 32172;
        lIIIlIIIll[96] = (-525) & 3708;
        lIIIlIIIll[97] = (-((-16397) & 16909)) & (-28689) & 32637;
        lIIIlIIIll[98] = (162 ^ 132) ^ (31 ^ 82);
        lIIIlIIIll[99] = (-28674) & 29019;
        lIIIlIIIll[100] = (-((-16425) & 22574)) & (-16961) & 23415;
        lIIIlIIIll[101] = (-19978) & 20287;
        lIIIlIIIll[102] = (-18067) & 18418;
        lIIIlIIIll[103] = (-((-13577) & 30617)) & (-5) & 17399;
        lIIIlIIIll[104] = (-((-1086) & 24127)) & (-9371) & 32767;
        lIIIlIIIll[105] = (-30235) & 30591;
        lIIIlIIIll[106] = (-4098) & 4455;
        lIIIlIIIll[107] = (-(2 ^ 63)) & (-22530) & 22975;
        lIIIlIIIll[108] = (-((-17549) & 32477)) & (-5) & 15327;
        lIIIlIIIll[109] = (-((-1361) & 15705)) & (-17410) & 32219;
        lIIIlIIIll[110] = (-18449) & 18942;
        lIIIlIIIll[111] = (-9745) & 10239;
        lIIIlIIIll[112] = (-((-8322) & 31875)) & (-515) & 24563;
        lIIIlIIIll[113] = (-((-4641) & 12840)) & (-19681) & 28415;
        lIIIlIIIll[114] = (-(191 ^ 172)) & (-23594) & 24127;
        lIIIlIIIll[115] = (-23621) & 23934;
        lIIIlIIIll[116] = (-7701) & 8191;
        lIIIlIIIll[117] = (-19106) & 19439;
        lIIIlIIIll[118] = (-5249) & 5602;
        lIIIlIIIll[119] = (-11265) & 11741;
        lIIIlIIIll[120] = (-((-4174) & 16111)) & (-20489) & 32747;
        lIIIlIIIll[121] = (-((-29) & 23647)) & (-8329) & 32251;
        lIIIlIIIll[122] = (-14917) & 15231;
        lIIIlIIIll[123] = (-((-1370) & 28639)) & (-4097) & 31735;
        lIIIlIIIll[124] = (-18435) & 18758;
        lIIIlIIIll[125] = (-((-24807) & 31471)) & (-163) & 7151;
        lIIIlIIIll[126] = (-13987) & 14314;
        lIIIlIIIll[127] = (-19459) & 19903;
        lIIIlIIIll[128] = (-((-1449) & 30636)) & (-3105) & 32755;
        lIIIlIIIll[129] = (-12833) & 13310;
        lIIIlIIIll[130] = (-((-2025) & 24570)) & (-9217) & 32251;
        lIIIlIIIll[131] = (-((-8454) & 30487)) & (-1) & 22525;
        lIIIlIIIll[132] = (-20485) & 20991;
        lIIIlIIIll[133] = (-((-10449) & 15605)) & (-10258) & 15935;
        lIIIlIIIll[134] = (-545) & 874;
        lIIIlIIIll[135] = (-18945) & 19409;
        lIIIlIIIll[136] = (-14619) & 15130;
        lIIIlIIIll[137] = (-9297) & 9855;
        lIIIlIIIll[138] = (-((-261) & 12037)) & (-133) & 12285;
        lIIIlIIIll[139] = (-6147) & 6478;
        lIIIlIIIll[140] = (-((-16633) & 28411)) & (-20485) & 32767;
        lIIIlIIIll[141] = (-4777) & 5113;
        lIIIlIIIll[142] = (-15469) & 15982;
        lIIIlIIIll[143] = (-((-963) & 31731)) & (-1545) & 32639;
        lIIIlIIIll[144] = (-((-9221) & 28180)) & (-8193) & 27631;
        lIIIlIIIll[145] = (-32295) & 32638;
        lIIIlIIIll[146] = (-((-17381) & 24549)) & (-25089) & 32735;
        lIIIlIIIll[147] = (-((-1737) & 11995)) & (-5633) & 16383;
        lIIIlIIIll[148] = (-((-8391) & 32455)) & (-8321) & 32726;
        lIIIlIIIll[149] = (-13377) & 13822;
        lIIIlIIIll[150] = (-5167) & 5486;
        lIIIlIIIll[151] = (-8865) & 9214;
        lIIIlIIIll[152] = (-((-1) & 10269)) & (-5665) & 16253;
        lIIIlIIIll[153] = (-((-21) & 7741)) & (-16513) & 24573;
        lIIIlIIIll[154] = (-((-20945) & 30681)) & (-20545) & 30702;
        lIIIlIIIll[155] = (-25649) & 26111;
        lIIIlIIIll[156] = (-10241) & 10614;
        lIIIlIIIll[157] = (-24199) & 24574;
        lIIIlIIIll[158] = (-12810) & 13145;
        lIIIlIIIll[159] = (-30773) & 31101;
        lIIIlIIIll[160] = (-6817) & 7147;
        lIIIlIIIll[161] = (159 ^ 164) ^ (105 ^ 108);
        lIIIlIIIll[162] = (-8193) & 8525;
        lIIIlIIIll[163] = 3 ^ 60;
        lIIIlIIIll[164] = (-((-13) & 31964)) & (-513) & 32767;
        lIIIlIIIll[165] = 46 ^ 110;
        lIIIlIIIll[166] = (-12930) & 13291;
        lIIIlIIIll[167] = 49 ^ 112;
        lIIIlIIIll[168] = (-2181) & 2503;
        lIIIlIIIll[169] = (121 ^ 0) ^ (173 ^ 150);
        lIIIlIIIll[170] = (-((-16573) & 31933)) & (-16969) & 32635;
        lIIIlIIIll[171] = 97 ^ 34;
        lIIIlIIIll[172] = (-6347) & 6655;
        lIIIlIIIll[173] = 22 ^ 82;
        lIIIlIIIll[174] = (-((-471) & 22487)) & (-9) & 22335;
        lIIIlIIIll[175] = 229 ^ 160;
        lIIIlIIIll[176] = (-4097) & 4471;
        lIIIlIIIll[177] = 215 ^ 145;
        lIIIlIIIll[178] = (-((-20571) & 31963)) & (-16898) & 28667;
        lIIIlIIIll[179] = (-15637) & 16149;
        lIIIlIIIll[180] = 210 ^ 154;
        lIIIlIIIll[181] = (-32337) & 32639;
        lIIIlIIIll[182] = 143 ^ 198;
        lIIIlIIIll[183] = (-18630) & 18941;
        lIIIlIIIll[184] = (116 ^ 82) ^ (169 ^ 197);
        lIIIlIIIll[185] = (-((-6825) & 15087)) & (-3585) & 12159;
        lIIIlIIIll[186] = (3 ^ 16) ^ (45 ^ 117);
        lIIIlIIIll[187] = (-23235) & 23551;
        lIIIlIIIll[188] = 41 ^ 101;
        lIIIlIIIll[189] = (-((-4171) & 32491)) & (-1) & 28659;
        lIIIlIIIll[190] = 140 ^ 193;
        lIIIlIIIll[191] = (-19466) & 19805;
        lIIIlIIIll[192] = (((57 + 85) - 31) + 109) ^ (((6 + 53) - (-60)) + 27);
        lIIIlIIIll[193] = (-11817) & 12159;
        lIIIlIIIll[194] = (((105 + 84) - 93) + 44) ^ (((180 + 68) - 77) + 24);
        lIIIlIIIll[195] = (-28165) & 28511;
        lIIIlIIIll[196] = (150 ^ 140) ^ (117 ^ 63);
        lIIIlIIIll[197] = (-((-16641) & 32163)) & (-2) & 15871;
        lIIIlIIIll[198] = (229 ^ 135) ^ (178 ^ 129);
        lIIIlIIIll[199] = (-((-259) & 26531)) & (-2049) & 28671;
        lIIIlIIIll[200] = 36 ^ 118;
        lIIIlIIIll[201] = (-((-26945) & 31697)) & (-26633) & 31743;
        lIIIlIIIll[202] = (82 ^ 49) ^ (125 ^ 77);
        lIIIlIIIll[203] = (-((-123) & 15102)) & (-17) & 15355;
        lIIIlIIIll[204] = (173 ^ 134) ^ (((70 + 47) - 14) + 24);
        lIIIlIIIll[205] = (-27153) & 27519;
        lIIIlIIIll[206] = 226 ^ 183;
        lIIIlIIIll[207] = (-21643) & 22010;
        lIIIlIIIll[208] = 21 ^ 67;
        lIIIlIIIll[209] = (-((-5217) & 30317)) & (-1027) & 26607;
        lIIIlIIIll[210] = (254 ^ 196) ^ (255 ^ 146);
        lIIIlIIIll[211] = (-((-197) & 28374)) & (-13) & 28671;
        lIIIlIIIll[212] = 85 ^ 13;
        lIIIlIIIll[213] = (-5124) & 5607;
        lIIIlIIIll[214] = 109 ^ 52;
        lIIIlIIIll[215] = (-((-3169) & 27747)) & (-2569) & 27631;
        lIIIlIIIll[216] = (((154 + 69) - 130) + 124) ^ (((2 + 45) - 3) + 87);
        lIIIlIIIll[217] = (-((-182) & 13503)) & (-529) & 14335;
        lIIIlIIIll[218] = 16 ^ 75;
        lIIIlIIIll[219] = (-28161) & 28647;
        lIIIlIIIll[220] = 30 ^ 66;
        lIIIlIIIll[221] = (-((-3363) & 27962)) & (-5121) & 30207;
        lIIIlIIIll[222] = 88 ^ 5;
        lIIIlIIIll[223] = (-25623) & 26111;
        lIIIlIIIll[224] = (((84 + 13) - (-5)) + 113) ^ (((68 + 48) - 63) + 84);
        lIIIlIIIll[225] = (-((-4209) & 15989)) & (-1) & 12286;
        lIIIlIIIll[226] = (((23 + 90) - (-36)) + 6) ^ (((184 + 38) - 189) + 163);
        lIIIlIIIll[227] = (-16899) & 17406;
        lIIIlIIIll[228] = 91 ^ 59;
        lIIIlIIIll[229] = (-3073) & 3581;
        lIIIlIIIll[230] = (163 ^ 176) ^ (194 ^ 176);
        lIIIlIIIll[231] = (-((-12294) & 29191)) & (-1025) & 18431;
        lIIIlIIIll[232] = (127 ^ 77) ^ (204 ^ 156);
        lIIIlIIIll[233] = (-((-297) & 27433)) & (-4097) & 31743;
        lIIIlIIIll[234] = 208 ^ 179;
        lIIIlIIIll[235] = (-((-6227) & 32083)) & (-51) & 26423;
        lIIIlIIIll[236] = (-(((137 + 111) - 210) + 171)) & (-15361) & 16086;
        lIIIlIIIll[237] = (-((-8321) & 32145)) & (-8385) & 32727;
        lIIIlIIIll[238] = 10 ^ 108;
        lIIIlIIIll[239] = (-12322) & 12841;
        lIIIlIIIll[240] = 219 ^ 188;
        lIIIlIIIll[241] = (-((-4617) & 24255)) & (-8513) & 28671;
        lIIIlIIIll[242] = 195 ^ 171;
        lIIIlIIIll[243] = (-((-24603) & 28027)) & (-8337) & 12283;
        lIIIlIIIll[244] = 2 ^ 107;
        lIIIlIIIll[245] = (-11364) & 11887;
        lIIIlIIIll[246] = (0 ^ 80) ^ (172 ^ 150);
        lIIIlIIIll[247] = (-((-3141) & 32087)) & (-3105) & 32575;
        lIIIlIIIll[248] = (-((-3081) & 31773)) & (-545) & 32444;
        lIIIlIIIll[249] = (-28737) & 31955;
        lIIIlIIIll[250] = (-25683) & 28639;
        lIIIlIIIll[251] = (-28916) & 32247;
    }

    public static void a(WorldPoint worldPoint) {
        if (lllIlIIIIIll(C0013n.bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lllIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(C0013n.bO), lIIIlIIIll[1])) {
                AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[2]];
                Movement.walkTo(C0013n.bO);
                "".length();
                Time.sleepTicks(lIIIlIIIll[0]);
                "".length();
            }
            if (lllIlIIIlIII(Players.getLocal().getWorldLocation().distanceTo(C0013n.bO), lIIIlIIIll[1])) {
                AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[0]];
                if (lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                NPC nearest = NPCs.getNearest(npc -> {
                    String[] strArr = new String[lIIIlIIIll[0]];
                    strArr[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[90]];
                    return npc.hasAction(strArr);
                });
                if (lllIlIIIlIIl(nearest)) {
                    String[] strArr = new String[lIIIlIIIll[0]];
                    strArr[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[3]];
                    if (lllIlIIIIlIl(nearest.hasAction(strArr) ? 1 : 0)) {
                        nearest.interact(lIIIlIIIlI[lIIIlIIIll[1]]);
                        Time.sleepTicks(lIIIlIIIll[1]);
                        "".length();
                    }
                    String[] strArr2 = new String[lIIIlIIIll[0]];
                    strArr2[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[4]];
                    if (lllIlIIIIIll(nearest.hasAction(strArr2) ? 1 : 0)) {
                        C0006g.b(lIIIlIIIlI[lIIIlIIIll[5]], C0013n.bR);
                        Time.sleepTicks(lIIIlIIIll[0]);
                        "".length();
                    }
                }
                String[] strArr3 = new String[lIIIlIIIll[0]];
                strArr3[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[6]];
                NPC nearest2 = NPCs.getNearest(strArr3);
                if (lllIlIIIlIIl(nearest2)) {
                    String[] strArr4 = new String[lIIIlIIIll[0]];
                    strArr4[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[7]];
                    if (lllIlIIIIlIl(nearest2.hasAction(strArr4) ? 1 : 0)) {
                        nearest2.interact(lIIIlIIIlI[lIIIlIIIll[8]]);
                        Time.sleepTicks(lIIIlIIIll[1]);
                        "".length();
                    }
                    String[] strArr5 = new String[lIIIlIIIll[0]];
                    strArr5[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[9]];
                    if (lllIlIIIIIll(nearest2.hasAction(strArr5) ? 1 : 0)) {
                        C0006g.b(lIIIlIIIlI[lIIIlIIIll[10]], C0013n.bR);
                        Time.sleepTicks(lIIIlIIIll[0]);
                        "".length();
                    }
                }
            }
        }
        if (lllIlIIIIlIl(C0013n.bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIIlIIIll[0]);
            "".length();
        }
    }

    public static long a(long j) {
        return s() - j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean b(int[] iArr) {
        int i = lIIIlIIIll[2];
        while (lllIlIIIlIlI(i, iArr.length)) {
            if (lllIlIIIIIll(i(iArr[i]) ? 1 : 0)) {
                System.out.println("Missing ID: " + iArr[i]);
                return lIIIlIIIll[2];
            }
            i++;
            "".length();
            if ((-" ".length()) > " ".length()) {
                return ((97 ^ 1) ^ (122 ^ 33)) & (((122 ^ 99) ^ (231 ^ 197)) ^ (-" ".length()));
            }
        }
        return lIIIlIIIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean x() {
        if (!lllIlIIIIlIl(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lIIIlIIIll[28]));
        })).intValue()) || lllIlIIIIIll(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lIIIlIIIll[31]));
        })).intValue())) {
            ?? r0 = lIIIlIIIll[0];
            "".length();
            return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlIIIll[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [boolean] */
    public static void E() {
        int i = lIIIlIIIll[2];
        do {
            String[] strArr = new String[lIIIlIIIll[0]];
            strArr[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[21]];
            if (!lllIlIIIlIIl(TileObjects.getNearest(strArr)) || !lllIlIIIIIll(AccBuilderRogues.d ? 1 : 0)) {
                return;
            }
            AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[32]];
            String[] strArr2 = new String[lIIIlIIIll[0]];
            strArr2[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[67]];
            NPC nearest = NPCs.getNearest(strArr2);
            if (lllIlIIIIIll(i)) {
                if (lllIlIIIIIll(Dialog.isOpen() ? 1 : 0)) {
                    nearest.interact(lIIIlIIIlI[lIIIlIIIll[68]]);
                }
                if (lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    if (lllIlIIIIIll(Dialog.canContinueNPC() ? 1 : 0) && lllIlIIIIIll(Dialog.canContinue() ? 1 : 0)) {
                        List options = Dialog.getOptions();
                        if (lllIlIIIIIll(options.isEmpty() ? 1 : 0)) {
                            List list = (List) options.stream().filter(widget -> {
                                if (lllIlIIIIIll(widget.getText().contains(lIIIlIIIlI[lIIIlIIIll[74]]) ? 1 : 0)) {
                                    ?? r0 = lIIIlIIIll[0];
                                    "".length();
                                    return (-((171 ^ 164) ^ (112 ^ 123))) >= 0 ? ((139 ^ 190) ^ (11 ^ 103)) & (((127 ^ 101) ^ (99 ^ 32)) ^ (-" ".length())) : r0;
                                }
                                return lIIIlIIIll[2];
                            }).collect(Collectors.toList());
                            if (lllIlIIIIIll(list.isEmpty() ? 1 : 0)) {
                                Mouse.click(((Widget) list.get(lIIIlIIIll[2])).getClickPoint().getX(), ((Widget) list.get(lIIIlIIIll[2])).getClickPoint().getY(), (boolean) lIIIlIIIll[0]);
                                Time.sleepTicks(lIIIlIIIll[1]);
                                "".length();
                            }
                            if (lllIlIIIIlII(list.size(), lIIIlIIIll[0])) {
                                i = lIIIlIIIll[0];
                            }
                        }
                    }
                    if (!lllIlIIIIIll(Dialog.canContinueNPC() ? 1 : 0) || lllIlIIIIlIl(Dialog.canContinue() ? 1 : 0)) {
                        Dialog.continueSpace();
                    }
                }
            }
            if (lllIlIIIIlIl(i)) {
                String[] strArr3 = new String[lIIIlIIIll[0]];
                strArr3[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[69]];
                TileObjects.getNearest(strArr3).interact(lIIIlIIIlI[lIIIlIIIll[70]]);
                Time.sleepTicks(lIIIlIIIll[5]);
                "".length();
            }
            Time.sleepTicks(lIIIlIIIll[0]);
            "".length();
            "".length();
        } while ("   ".length() >= (((103 ^ 114) ^ (83 ^ 26)) & (((49 ^ 9) ^ (160 ^ 196)) ^ (-" ".length()))));
    }

    private static boolean lllIlIIIlIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lllIlIIIllIl(int i) {
        return i > 0;
    }

    public static void a(HashMap<Integer, Integer> hashMap, boolean z, boolean z2) {
        int i;
        if (lllIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(Y), lIIIlIIIll[4])) {
            AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[17]];
            WorldArea worldArea = new WorldArea(lIIIlIIIll[18], lIIIlIIIll[19], lIIIlIIIll[20], lIIIlIIIll[21], lIIIlIIIll[2]);
            int[] iArr = new int[lIIIlIIIll[0]];
            iArr[lIIIlIIIll[2]] = lIIIlIIIll[22];
            boolean contains = Inventory.contains(iArr);
            if (lllIlIIIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                i = lIIIlIIIll[0];
                "".length();
                if (" ".length() <= (((((36 + 115) - 26) + 10) ^ (((39 + 74) - 108) + 141)) & (((201 ^ 145) ^ (62 ^ 115)) ^ (-" ".length())))) {
                    return;
                }
            } else {
                i = lIIIlIIIll[2];
            }
            if (lllIlIIIIlIl((contains ? 1 : 0) & i)) {
                int[] iArr2 = new int[lIIIlIIIll[0]];
                iArr2[lIIIlIIIll[2]] = lIIIlIIIll[22];
                Inventory.getFirst(iArr2).interact(lIIIlIIIlI[lIIIlIIIll[23]]);
                Time.sleepTicks(lIIIlIIIll[8]);
                "".length();
            }
            Movement.walkTo(Y);
            "".length();
            Time.sleepTicks(lIIIlIIIll[0]);
            "".length();
        }
        if (lllIlIIIlIII(Players.getLocal().getWorldLocation().distanceTo(Y), lIIIlIIIll[4])) {
            if (lllIlIIIIIll(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
            }
            AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[24]];
            if (lllIlIIIIlIl(z ? 1 : 0) && lllIlIIIllIl(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks(lIIIlIIIll[4]);
                "".length();
            }
            if (lllIlIIIIlIl(z2 ? 1 : 0) && lllIlIIIllIl(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks(lIIIlIIIll[3]);
                "".length();
            }
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                int intValue = entry.getKey().intValue();
                int intValue2 = entry.getValue().intValue();
                System.out.println("Key: " + intValue + ", Value: " + intValue2);
                C0000a.a(intValue, intValue2);
                Time.sleepTicks(lIIIlIIIll[0]);
                "".length();
                "".length();
                if (!((true ^ true) ^ (true ^ true))) {
                    return;
                }
            }
        }
    }

    public static int H() {
        return j(lIIIlIIIll[73]);
    }

    public static int t() {
        return Z[c(lIIIlIIIll[2], Z.length - lIIIlIIIll[0])];
    }

    private static boolean lllIlIIIIlll(int i, int i2) {
        return i > i2;
    }

    public static void c(WorldPoint worldPoint) {
        int i;
        int i2;
        Client client = Static.getClient();
        if (lllIlIIIllII(client.getLocalPlayer())) {
            return;
        }
        int x = worldPoint.getX() - client.getBaseX();
        int y = worldPoint.getY() - client.getBaseY();
        Point localToCanvas = Perspective.localToCanvas(client, LocalPoint.fromScene(x, y), client.getPlane());
        if (lllIlIIIlIIl(localToCanvas)) {
            i = localToCanvas.getX();
            "".length();
            if ((((147 ^ 189) ^ (17 ^ 24)) & (((((67 + 121) - 116) + 60) ^ (((47 + 98) - 108) + 126)) ^ (-" ".length()))) == (-" ".length())) {
                return;
            }
        } else {
            i = lIIIlIIIll[62];
        }
        int i3 = i;
        if (lllIlIIIlIIl(localToCanvas)) {
            i2 = localToCanvas.getY();
            "".length();
            if ("  ".length() > ((53 ^ 36) ^ (208 ^ 197))) {
                return;
            }
        } else {
            i2 = lIIIlIIIll[62];
        }
        client.interact(lIIIlIIIll[2], MenuAction.WALK.getId(), x, y, i3, i2);
    }

    public static void b(WorldPoint worldPoint) {
        WorldPoint worldPoint2 = new WorldPoint(lIIIlIIIll[43], lIIIlIIIll[44], lIIIlIIIll[2]);
        WorldArea worldArea = new WorldArea(lIIIlIIIll[45], lIIIlIIIll[46], lIIIlIIIll[9], lIIIlIIIll[47], lIIIlIIIll[2]);
        WorldArea worldArea2 = new WorldArea(lIIIlIIIll[48], lIIIlIIIll[49], lIIIlIIIll[50], lIIIlIIIll[51], lIIIlIIIll[2]);
        if (lllIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIlIIIll[6]) && lllIlIIIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIIIIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlIIIll[52], lIIIlIIIll[53], lIIIlIIIll[0])), lIIIlIIIll[30])) {
            AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[54]];
            if (lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(worldPoint2);
            "".length();
            Time.sleepTicks(lIIIlIIIll[0]);
            "".length();
        }
        if (lllIlIIIlIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIlIIIll[6]) && lllIlIIIlIII(Players.getLocal().getWorldLocation().getY(), lIIIlIIIll[44])) {
            if (lllIlIIIIIll(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr = new String[lIIIlIIIll[0]];
                strArr[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[55]];
                TileObjects.getNearest(strArr).interact(lIIIlIIIlI[lIIIlIIIll[35]]);
                Time.sleepTicks(lIIIlIIIll[3]);
                "".length();
            }
            if (lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr2 = new String[lIIIlIIIll[0]];
                strArr2[lIIIlIIIll[2]] = lIIIlIIIlI[lIIIlIIIll[56]];
                C0006g.a(strArr2);
            }
        }
        if (lllIlIIIIlll(Players.getLocal().getWorldLocation().getY(), lIIIlIIIll[44])) {
            if (lllIlIIIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIIIIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lllIlIIIlIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlIIIll[52], lIIIlIIIll[53], lIIIlIIIll[0])), lIIIlIIIll[30])) {
                return;
            }
            AccBuilderRogues.c = lIIIlIIIlI[lIIIlIIIll[57]];
            if (lllIlIIIIlIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlIIIll[43], lIIIlIIIll[58], lIIIlIIIll[2])) ? 1 : 0)) {
                c(new WorldPoint(lIIIlIIIll[43], lIIIlIIIll[59], lIIIlIIIll[2]));
                Time.sleepTicks(lIIIlIIIll[6]);
                "".length();
            }
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIIlIIIll[0]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public static void a(String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod(lIIIlIIIlI[lIIIlIIIll[47]]);
            httpURLConnection.setRequestProperty(lIIIlIIIlI[lIIIlIIIll[60]], lIIIlIIIlI[lIIIlIIIll[61]]);
            httpURLConnection.setDoOutput(lIIIlIIIll[0]);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes("{\"content\": \"" + str2 + "\"}");
            dataOutputStream.flush();
            dataOutputStream.close();
            System.out.println("Response Code: " + httpURLConnection.getResponseCode());
            httpURLConnection.disconnect();
            "".length();
            if ((150 ^ 146) <= 0) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String lllIIlllIlIl(String lIllIlIlllII, String lIllIlIllIll) {
        try {
            SecretKeySpec lIllIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlIllIll.getBytes(StandardCharsets.UTF_8)), lIIIlIIIll[8]), "DES");
            Cipher lIllIlIllllI = Cipher.getInstance("DES");
            lIllIlIllllI.init(lIIIlIIIll[3], lIllIlIlllll);
            return new String(lIllIlIllllI.doFinal(Base64.getDecoder().decode(lIllIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIlIlllIl) {
            lIllIlIlllIl.printStackTrace();
            return null;
        }
    }

    public static void c(String str) {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(lIIIlIIIlI[lIIIlIIIll[12]]));
        bufferedWriter.write(str + System.getProperty(lIIIlIIIlI[lIIIlIIIll[13]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    private static String lllIIlllIlII(String lIllIIllllll, String lIllIIlllllI) {
        String lIllIIllllll2 = new String(Base64.getDecoder().decode(lIllIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIllllIl = new StringBuilder();
        char[] lIllIIllllII = lIllIIlllllI.toCharArray();
        int lIllIIlllIll = lIIIlIIIll[2];
        char[] charArray = lIllIIllllll2.toCharArray();
        int length = charArray.length;
        int lIllIIllIIll = lIIIlIIIll[2];
        while (lllIlIIIlIlI(lIllIIllIIll, length)) {
            lIllIIllllIl.append((char) (charArray[lIllIIllIIll] ^ lIllIIllllII[lIllIIlllIll % lIllIIllllII.length]));
            "".length();
            lIllIIlllIll++;
            lIllIIllIIll++;
            "".length();
            if ((((((18 + 46) - (-124)) + 48) ^ (((182 + 13) - 130) + 127)) & (((((66 + 17) - (-12)) + 60) ^ (((145 + 135) - 109) + 12)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lIllIIllllIl);
    }

    public static void C() {
        if (lllIlIIIIIll(j(lIIIlIIIll[63]))) {
            if (lllIlIIIIIll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lIIIlIIIll[0]);
                "".length();
            }
            if (lllIlIIIIlIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lIIIlIIIll[64], lIIIlIIIll[54]);
                if (lllIlIIIlIIl(widget)) {
                    widget.interact(lIIIlIIIlI[lIIIlIIIll[65]]);
                    Time.sleepTicks(lIIIlIIIll[0]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void y() {
        if (lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lllIlIIIIlIl(x() ? 1 : 0)) {
            if (lllIlIIIIIll(z() ? 1 : 0)) {
                A();
            }
            if (lllIlIIIIlIl(z() ? 1 : 0)) {
                Widget widget = Widgets.get(lIIIlIIIll[25], lIIIlIIIll[26], lIIIlIIIll[7]);
                if (lllIlIIIlIIl(widget)) {
                    widget.interact(lIIIlIIIlI[lIIIlIIIll[27]]);
                    Time.sleepTicks(lIIIlIIIll[0]);
                    "".length();
                }
                if (lllIlIIIIIll(Vars.getBit(lIIIlIIIll[28]))) {
                    Widget widget2 = Widgets.get(lIIIlIIIll[25], lIIIlIIIll[29], lIIIlIIIll[21]);
                    if (lllIlIIIlIIl(widget2)) {
                        if (lllIlIIIIIll(widget2.isVisible() ? 1 : 0)) {
                            Widget widget3 = Widgets.get(lIIIlIIIll[25], lIIIlIIIll[30], lIIIlIIIll[5]);
                            Mouse.click(widget3.getClickPoint().getX(), widget3.getClickPoint().getY(), (boolean) lIIIlIIIll[0]);
                            Time.sleepTicks(lIIIlIIIll[0]);
                            "".length();
                        }
                        if (lllIlIIIIlIl(widget2.isVisible() ? 1 : 0)) {
                            widget2.interact(lIIIlIIIlI[lIIIlIIIll[29]]);
                            Time.sleepTicks(lIIIlIIIll[0]);
                            "".length();
                        }
                    }
                }
                if (lllIlIIIIIll(Vars.getBit(lIIIlIIIll[31]))) {
                    Widget widget4 = Widgets.get(lIIIlIIIll[25], lIIIlIIIll[29], lIIIlIIIll[32]);
                    if (lllIlIIIlIIl(widget4)) {
                        if (lllIlIIIIIll(widget4.isVisible() ? 1 : 0)) {
                            Widget widget5 = Widgets.get(lIIIlIIIll[25], lIIIlIIIll[30], lIIIlIIIll[5]);
                            Mouse.click(widget5.getClickPoint().getX(), widget5.getClickPoint().getY(), (boolean) lIIIlIIIll[0]);
                            Time.sleepTicks(lIIIlIIIll[0]);
                            "".length();
                        }
                        if (lllIlIIIIlIl(widget4.isVisible() ? 1 : 0)) {
                            widget4.interact(lIIIlIIIlI[lIIIlIIIll[30]]);
                            Time.sleepTicks(lIIIlIIIll[3]);
                            "".length();
                        }
                    }
                }
            }
        }
        Widget widget6 = Widgets.get(lIIIlIIIll[25], lIIIlIIIll[4]);
        if (lllIlIIIlIIl(widget6)) {
            widget6.interact(lIIIlIIIlI[lIIIlIIIll[33]]);
            Time.sleepTicks(lIIIlIIIll[0]);
            "".length();
        }
    }

    private static boolean lllIlIIIIIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean z() {
        if (lllIlIIIlIIl(Widgets.get(lIIIlIIIll[25], lIIIlIIIll[0]))) {
            ?? r0 = lIIIlIIIll[0];
            "".length();
            return 0 != 0 ? ((49 ^ 117) ^ (91 ^ 72)) & (((5 ^ 34) ^ (55 ^ 71)) ^ (-" ".length())) : r0;
        }
        return lIIIlIIIll[2];
    }

    public static boolean i(int i) {
        int[] iArr = new int[lIIIlIIIll[0]];
        iArr[lIIIlIIIll[2]] = i;
        return Bank.contains(iArr);
    }

    private static boolean lllIlIIIlIll(int i, int i2) {
        return i != i2;
    }

    private static String lllIIlllIllI(String lIllIlIIllll, String lIllIlIIlllI) {
        try {
            SecretKeySpec lIllIlIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIlIlIIIl = Cipher.getInstance("Blowfish");
            lIllIlIlIIIl.init(lIIIlIIIll[3], lIllIlIlIIlI);
            return new String(lIllIlIlIIIl.doFinal(Base64.getDecoder().decode(lIllIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIlIlIIII) {
            lIllIlIlIIII.printStackTrace();
            return null;
        }
    }

    public static String b(long j) {
        String str = lIIIlIIIlI[lIIIlIIIll[11]];
        Object[] objArr = new Object[lIIIlIIIll[0]];
        objArr[lIIIlIIIll[2]] = Integer.valueOf(lIIIlIIIll[3]);
        String format = String.format(str, objArr);
        long j2 = j / 1000;
        Object[] objArr2 = new Object[lIIIlIIIll[0]];
        objArr2[lIIIlIIIll[2]] = Long.valueOf(j2 % 60);
        String format2 = String.format(format, objArr2);
        Object[] objArr3 = new Object[lIIIlIIIll[0]];
        objArr3[lIIIlIIIll[2]] = Long.valueOf((j2 % 3600) / 60);
        String format3 = String.format(format, objArr3);
        Object[] objArr4 = new Object[lIIIlIIIll[0]];
        objArr4[lIIIlIIIll[2]] = Long.valueOf(j2 / 3600);
        return String.format(format, objArr4) + ":" + format3 + ":" + format2;
    }

    public static void k(int i) {
        if (lllIlIIIlIll(Static.getClient().getWorld(), i)) {
            World findWorld = Static.getWorldService().getWorlds().findWorld(i);
            if (lllIlIIIllII(findWorld)) {
                return;
            }
            if (lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            net.runelite.api.World createWorld = Static.getClient().createWorld();
            createWorld.setActivity(findWorld.getActivity());
            createWorld.setAddress(findWorld.getAddress());
            createWorld.setId(findWorld.getId());
            createWorld.setPlayerCount(findWorld.getPlayers());
            createWorld.setLocation(findWorld.getLocation());
            createWorld.setTypes(WorldUtil.toWorldTypes(findWorld.getTypes()));
            Worlds.hopTo(createWorld);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public static void G() {
        if (lllIlIIIIIll(Widgets.get(lIIIlIIIll[72]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get(lIIIlIIIll[72], lIIIlIIIll[23]);
            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) lIIIlIIIll[0]);
            Time.sleepTicks(lIIIlIIIll[1]);
            "".length();
        }
    }

    private static void lllIIlllIlll() {
        lIIIlIIIlI = new String[lIIIlIIIll[20]];
        lIIIlIIIlI[lIIIlIIIll[2]] = lllIIlllIlII("OhAASAEbUQANGgc=", "tqvhu");
        lIIIlIIIlI[lIIIlIIIll[0]] = lllIIlllIlII("DAUKHi0hRBIfLjdEBxIgMA==", "DddzA");
        lIIIlIIIlI[lIIIlIIIll[3]] = lllIIlllIlIl("2+cqcRcbr6oag/J0fNd+7y5M9vL5ARB2", "kynDu");
        lIIIlIIIlI[lIIIlIIIll[1]] = lllIIlllIlII("PisTF3A+LRIAMRwtDQolHQ==", "nDacP");
        lIIIlIIIlI[lIIIlIIIll[4]] = lllIIlllIlIl("6W7dRNspVNAe1H0gWugeljOZ8e0q2Ix0", "kCBKf");
        lIIIlIIIlI[lIIIlIIIll[5]] = lllIIlllIllI("FIP2+hjv/Y8=", "sJTIm");
        lIIIlIIIlI[lIIIlIIIll[6]] = lllIIlllIlII("AAcJJwxjJAQ3QgsDGSwHMRI=", "CfkNb");
        lIIIlIIIlI[lIIIlIIIll[7]] = lllIIlllIllI("FAEneAKSPNnLBGdD5VNoFdkBFIULtvt3", "AoXTZ");
        lIIIlIIIlI[lIIIlIIIll[8]] = lllIIlllIlIl("xZ801ziMc2TRh8EBJOySlgAmxxM2kZFi", "bIWaR");
        lIIIlIIIlI[lIIIlIIIll[9]] = lllIIlllIlIl("pGzuYUAaJUYrHqVt4npQfqeqjYQbu2NM", "XCojH");
        lIIIlIIIlI[lIIIlIIIll[10]] = lllIIlllIllI("S4dxQY6mHBejyq5o1k/GBVZmNe+7AQLL", "AHkTa");
        lIIIlIIIlI[lIIIlIIIll[11]] = lllIIlllIlIl("zy/Da64qytY=", "cZXRC");
        lIIIlIIIlI[lIIIlIIIll[12]] = lllIIlllIlII("Fk4sLSQwBgMkGTwXGyQWJQQ0GSM0KCIXNjgdHh8LewACETU6ACw/ODEHPQ07MCgdDTswWgQAIw==", "UtpxW");
        lIIIlIIIlI[lIIIlIIIll[13]] = lllIIlllIlII("ADMtNXQfPzMxKA0uLCI=", "lZCPZ");
        lIIIlIIIlI[lIIIlIIIll[16]] = lllIIlllIllI("pTGmb5NbMdo=", "diAVs");
        lIIIlIIIlI[lIIIlIIIll[17]] = lllIIlllIlII("GSw+QTE4bR4ANyUiKwplAG0qACs8", "WMHaE");
        lIIIlIIIlI[lIIIlIIIll[23]] = lllIIlllIllI("x8kogwjlAts=", "JTawJ");
        lIIIlIIIlI[lIIIlIIIll[24]] = lllIIlllIlII("GgUHER47Cg5VEDMKAhwcNQ==", "Rdiur");
        lIIIlIIIlI[lIIIlIIIll[27]] = lllIIlllIllI("KUmRBUUPsH0lSWtSrQgHmQ==", "KYvyL");
        lIIIlIIIlI[lIIIlIIIll[29]] = lllIIlllIlIl("y6K4hIgI10E=", "LEiyU");
        lIIIlIIIlI[lIIIlIIIll[30]] = lllIIlllIllI("i+GfbGmMjsY=", "xketq");
        lIIIlIIIlI[lIIIlIIIll[33]] = lllIIlllIllI("3uhIwQautfM=", "cJKRf");
        lIIIlIIIlI[lIIIlIIIll[36]] = lllIIlllIllI("2vdOrqPw9bmkkiZOKcbHIw==", "SGopE");
        lIIIlIIIlI[lIIIlIIIll[26]] = lllIIlllIllI("/TZ5vIlieXo=", "rtEJz");
        lIIIlIIIlI[lIIIlIIIll[37]] = lllIIlllIlIl("wiB2es6m81o=", "RnNYJ");
        lIIIlIIIlI[lIIIlIIIll[38]] = lllIIlllIllI("GeBkXvGmvWs=", "yzbuU");
        lIIIlIIIlI[lIIIlIIIll[39]] = lllIIlllIlIl("nXvGTKKMYHI=", "GsDRK");
        lIIIlIIIlI[lIIIlIIIll[40]] = lllIIlllIllI("cQuCQi+MbiQ=", "iAZHP");
        lIIIlIIIlI[lIIIlIIIll[41]] = lllIIlllIlII("Cig9PSo=", "OYHTZ");
        lIIIlIIIlI[lIIIlIIIll[15]] = lllIIlllIlIl("vJw6uoLYdKuUSV2yG90wMb8UXAAdEI6L", "XLaPF");
        lIIIlIIIlI[lIIIlIIIll[54]] = lllIIlllIlII("IwYhYxUCRzg2FR4OMyZBCgYjJg==", "mgWCa");
        lIIIlIIIlI[lIIIlIIIll[55]] = lllIIlllIlIl("pFSzUA62frI=", "WSlhS");
        lIIIlIIIlI[lIIIlIIIll[35]] = lllIIlllIllI("4sEymPLn6Lc=", "vqZke");
        lIIIlIIIlI[lIIIlIIIll[56]] = lllIIlllIlII("PTg7EzxCdwBGKE42aQMsGncrFDYXeQ==", "nWIaE");
        lIIIlIIIlI[lIIIlIIIll[57]] = lllIIlllIlII("LQcVWCUMRhAMIwwIBBA+DwJDDDgPAw==", "cfcxQ");
        lIIIlIIIlI[lIIIlIIIll[47]] = lllIIlllIlII("IgckAw==", "rHwWv");
        lIIIlIIIlI[lIIIlIIIll[60]] = lllIIlllIlII("GyoCNQc2MUEVGygg", "XElAb");
        lIIIlIIIlI[lIIIlIIIll[61]] = lllIIlllIlIl("Kb4SRVx8Q3xQCsm1RP35e+MJwH5J3ag5", "OBiCK");
        lIIIlIIIlI[lIIIlIIIll[65]] = lllIIlllIlII("JC0GKEoXPQYmBgw5BiI=", "eXrGj");
        lIIIlIIIlI[lIIIlIIIll[66]] = lllIIlllIllI("fv7CMhB6JtzizCRE+/Gvbw==", "XQrsE");
        lIIIlIIIlI[lIIIlIIIll[21]] = lllIIlllIllI("TSZsBzHO+0CjVsCJzZVCrg==", "ZRJAz");
        lIIIlIIIlI[lIIIlIIIll[32]] = lllIIlllIlIl("3xUdTh14buv83833Kd6DPQ==", "uxhzn");
        lIIIlIIIlI[lIIIlIIIll[67]] = lllIIlllIlII("Li8nHi4=", "jJFjF");
        lIIIlIIIlI[lIIIlIIIll[68]] = lllIIlllIlIl("sCtKIoaoHFs=", "BCpdE");
        lIIIlIIIlI[lIIIlIIIll[69]] = lllIIlllIlIl("0iw7CrsPkBY=", "ClhEb");
        lIIIlIIIlI[lIIIlIIIll[70]] = lllIIlllIlIl("M9TMrm5mLTU=", "ufBTD");
        lIIIlIIIlI[lIIIlIIIll[74]] = lllIIlllIlIl("XwrUp8TZ4r4=", "XFVYV");
        lIIIlIIIlI[lIIIlIIIll[76]] = lllIIlllIlII("MisxNgE=", "FDEWm");
        lIIIlIIIlI[lIIIlIIIll[77]] = lllIIlllIllI("nPwcnfaXVqI=", "sBAgF");
        lIIIlIIIlI[lIIIlIIIll[78]] = lllIIlllIlIl("mwz1uQ5wjhU=", "RSIfM");
        lIIIlIIIlI[lIIIlIIIll[71]] = lllIIlllIlII("HAoIMA==", "TcoXm");
        lIIIlIIIlI[lIIIlIIIll[81]] = lllIIlllIllI("Zr17o7k7m5U=", "qfjbq");
        lIIIlIIIlI[lIIIlIIIll[82]] = lllIIlllIlIl("pI0RhauzqFA=", "JaQkB");
        lIIIlIIIlI[lIIIlIIIll[83]] = lllIIlllIlIl("AdAKKvStKX4=", "FSOgn");
        lIIIlIIIlI[lIIIlIIIll[84]] = lllIIlllIlII("HTYLChQ4PQ==", "YSjny");
        lIIIlIIIlI[lIIIlIIIll[85]] = lllIIlllIlIl("hUOt5xRSJ2k=", "QQnxE");
        lIIIlIIIlI[lIIIlIIIll[86]] = lllIIlllIlII("MTg1CzIQPT4APwwv", "bHPnV");
        lIIIlIIIlI[lIIIlIIIll[87]] = lllIIlllIlII("BiUQFD8=", "rJduS");
        lIIIlIIIlI[lIIIlIIIll[88]] = lllIIlllIlIl("y49LWC8kJ4A=", "lSYlI");
        lIIIlIIIlI[lIIIlIIIll[90]] = lllIIlllIlII("Fh8QP1IWGREoEzQZDiIHNQ==", "FpbKr");
        lIIIlIIIlI[lIIIlIIIll[91]] = lllIIlllIlIl("0xN2fUtum4OCjXxGQCb6SuRUxz9KSaj36mPOv7oLbnrNsXKF147J0Zvs0OoSt59smRseno0B4hg=", "WJCAM");
    }

    public static void w() {
        Widget widget = Widgets.get(lIIIlIIIll[14], lIIIlIIIll[15], lIIIlIIIll[2]);
        if (lllIlIIIlIIl(widget)) {
            widget.interact(lIIIlIIIlI[lIIIlIIIll[16]]);
            Time.sleepTicks(lIIIlIIIll[1]);
            "".length();
        }
    }

    public static double u() {
        return (Skills.getBoostedLevel(Skill.HITPOINTS) / Skills.getLevel(Skill.HITPOINTS)) * 100.0d;
    }

    public static void A() {
        Widget widget = Widgets.get(lIIIlIIIll[34], lIIIlIIIll[35]);
        if (lllIlIIIlIIl(widget)) {
            widget.interact(lIIIlIIIlI[lIIIlIIIll[36]]);
            Time.sleepTicks(lIIIlIIIll[0]);
            "".length();
        }
    }

    private static boolean lllIlIIIlIlI(int i, int i2) {
        return i < i2;
    }

    public static void v() {
        if (lllIlIIIIlIl(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks(lIIIlIIIll[4]);
            "".length();
        }
        if (lllIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lllIlIIIIIll(Bank.isOpen() ? 1 : 0)) {
            B();
        }
    }

    private static boolean lllIlIIIllII(Object obj) {
        return obj == null;
    }

    private static boolean lllIlIIIIlIl(int i) {
        return i != 0;
    }

    private static boolean lllIlIIIIllI(int i) {
        return i < 0;
    }

    private static boolean lllIlIIIlIIl(Object obj) {
        return obj != null;
    }
}
