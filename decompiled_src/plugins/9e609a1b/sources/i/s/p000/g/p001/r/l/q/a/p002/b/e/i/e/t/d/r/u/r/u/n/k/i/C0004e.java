package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
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
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/e.class */
public class C0004e {
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

    public static void l(int i2) {
        int[] iArr = new int[lIIIlllIllIlI[1]];
        iArr[lIIIlllIllIlI[0]] = i2;
        if (lIlIIlIIllIlIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIlllIllIlI[1]];
            iArr2[lIIIlllIllIlI[0]] = i2;
            if (lIlIIlIIllIlIIl(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIlllIllIlI[1]];
                iArr3[lIIIlllIllIlI[0]] = i2;
                Item first = Inventory.getFirst(iArr3);
                String[] strArr = new String[lIIIlllIllIlI[1]];
                strArr[lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[21]];
                if (lIlIIlIIllIlIll(first.hasAction(strArr) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIIlllIllIlI[1]];
                    iArr4[lIIIlllIllIlI[0]] = i2;
                    Inventory.getFirst(iArr4).interact(lIIIlllIlIlIl[lIIIlllIllIlI[22]]);
                }
                int[] iArr5 = new int[lIIIlllIllIlI[1]];
                iArr5[lIIIlllIllIlI[0]] = i2;
                Item first2 = Inventory.getFirst(iArr5);
                String[] strArr2 = new String[lIIIlllIllIlI[1]];
                strArr2[lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[23]];
                if (lIlIIlIIllIlIll(first2.hasAction(strArr2) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIIlllIllIlI[1]];
                    iArr6[lIIIlllIllIlI[0]] = i2;
                    Inventory.getFirst(iArr6).interact(lIIIlllIlIlIl[lIIIlllIllIlI[24]]);
                }
                int[] iArr7 = new int[lIIIlllIllIlI[1]];
                iArr7[lIIIlllIllIlI[0]] = i2;
                Item first3 = Inventory.getFirst(iArr7);
                String[] strArr3 = new String[lIIIlllIllIlI[1]];
                strArr3[lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[25]];
                if (lIlIIlIIllIlIll(first3.hasAction(strArr3) ? 1 : 0)) {
                    int[] iArr8 = new int[lIIIlllIllIlI[1]];
                    iArr8[lIIIlllIllIlI[0]] = i2;
                    Inventory.getFirst(iArr8).interact(lIIIlllIlIlIl[lIIIlllIllIlI[26]]);
                }
                if (lIlIIlIIllIlIlI(i2, lIIIlllIllIlI[27])) {
                    Time.sleepTicks(lIIIlllIllIlI[6]);
                    "".length();
                    String[] strArr4 = new String[lIIIlllIllIlI[1]];
                    strArr4[lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[28]];
                    C0006g.a(strArr4);
                    Time.sleepTicks(lIIIlllIllIlI[1]);
                    "".length();
                }
            }
        }
    }

    private static String lIlIIlIIlIIIllI(String lllllllllllllllIIIIIlIIllIIllIIl, String lllllllllllllllIIIIIlIIllIIllIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIllIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIIlIIllIIlIllI = lllllllllllllllIIIIIlIIllIIllIII.toCharArray();
        int lllllllllllllllIIIIIlIIllIIlIlIl = lIIIlllIllIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIIIlllIllIlI[0];
        while (lIlIIlIIllIIlll(i2, length)) {
            sb.append((char) (charArray[i2] ^ lllllllllllllllIIIIIlIIllIIlIllI[lllllllllllllllIIIIIlIIllIIlIlIl % lllllllllllllllIIIIIlIIllIIlIllI.length]));
            "".length();
            lllllllllllllllIIIIIlIIllIIlIlIl++;
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlIIlIIlIIIlll(String lllllllllllllllIIIIIlIIlIlllIlll, String lllllllllllllllIIIIIlIIlIlllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIIlIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIIlIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlllIllIlI[2], lllllllllllllllIIIIIlIIlIllllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIIlIllllIII) {
            lllllllllllllllIIIIIlIIlIllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIllIllII(int i2) {
        return i2 < 0;
    }

    public static void k(int i2) {
        if (lIlIIlIIllIllIl(Static.getClient().getWorld(), i2)) {
            World findWorld = Static.getWorldService().getWorlds().findWorld(i2);
            if (lIlIIlIIllIlllI(findWorld)) {
                return;
            }
            if (lIlIIlIIllIlIll(Dialog.isOpen() ? 1 : 0)) {
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

    public static void s() {
        int i2 = lIIIlllIllIlI[0];
        while (lIlIIlIIllIIlll(i2, ac.length)) {
            if (lIlIIlIIllIlIII(Widgets.get(ac[i2], widget -> {
                return widget.getText().contains(lIIIlllIlIlIl[lIIIlllIllIlI[73]]);
            }))) {
                Keyboard.sendSpace();
                System.out.println("Found Conversation continue window :" + ac[i2]);
            }
            i2++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean y() {
        if (!lIlIIlIIllIlIll(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lIIIlllIllIlI[10]));
        })).intValue()) || lIlIIlIIllIlIIl(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lIIIlllIllIlI[15]));
        })).intValue())) {
            ?? r0 = lIIIlllIllIlI[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlllIllIlI[0];
    }

    public static String h(int i2) {
        return NumberFormat.getNumberInstance(Locale.US).format(i2);
    }

    private static boolean lIlIIlIIllIlIIl(int i2) {
        return i2 == 0;
    }

    public static boolean i(int i2) {
        int[] iArr = new int[lIIIlllIllIlI[1]];
        iArr[lIIIlllIllIlI[0]] = i2;
        return Bank.contains(iArr);
    }

    public static int j(int i2) {
        return ((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarpValue(i2));
        })).intValue();
    }

    static {
        lIlIIlIIllIIllI();
        lIlIIlIIllIIIlI();
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
        W = new HashMap();
        int[] iArr = new int[lIIIlllIllIlI[14]];
        iArr[lIIIlllIllIlI[0]] = lIIIlllIllIlI[78];
        iArr[lIIIlllIllIlI[1]] = lIIIlllIllIlI[74];
        iArr[lIIIlllIllIlI[2]] = lIIIlllIllIlI[77];
        iArr[lIIIlllIllIlI[6]] = lIIIlllIllIlI[79];
        iArr[lIIIlllIllIlI[3]] = lIIIlllIllIlI[75];
        ac = iArr;
        ad = new WorldPoint(lIIIlllIllIlI[85], lIIIlllIllIlI[86], lIIIlllIllIlI[0]);
        int[] iArr2 = new int[lIIIlllIllIlI[87]];
        iArr2[lIIIlllIllIlI[0]] = lIIIlllIllIlI[88];
        iArr2[lIIIlllIllIlI[1]] = lIIIlllIllIlI[89];
        iArr2[lIIIlllIllIlI[2]] = lIIIlllIllIlI[90];
        iArr2[lIIIlllIllIlI[6]] = lIIIlllIllIlI[91];
        iArr2[lIIIlllIllIlI[3]] = lIIIlllIllIlI[92];
        iArr2[lIIIlllIllIlI[14]] = lIIIlllIllIlI[93];
        iArr2[lIIIlllIllIlI[17]] = lIIIlllIllIlI[94];
        iArr2[lIIIlllIllIlI[9]] = lIIIlllIllIlI[95];
        iArr2[lIIIlllIllIlI[20]] = lIIIlllIllIlI[96];
        iArr2[lIIIlllIllIlI[21]] = lIIIlllIllIlI[97];
        iArr2[lIIIlllIllIlI[22]] = lIIIlllIllIlI[98];
        iArr2[lIIIlllIllIlI[23]] = lIIIlllIllIlI[99];
        iArr2[lIIIlllIllIlI[24]] = lIIIlllIllIlI[100];
        iArr2[lIIIlllIllIlI[25]] = lIIIlllIllIlI[101];
        iArr2[lIIIlllIllIlI[26]] = lIIIlllIllIlI[102];
        iArr2[lIIIlllIllIlI[28]] = lIIIlllIllIlI[103];
        iArr2[lIIIlllIllIlI[40]] = lIIIlllIllIlI[104];
        iArr2[lIIIlllIllIlI[41]] = lIIIlllIllIlI[105];
        iArr2[lIIIlllIllIlI[42]] = lIIIlllIllIlI[106];
        iArr2[lIIIlllIllIlI[11]] = lIIIlllIllIlI[107];
        iArr2[lIIIlllIllIlI[13]] = lIIIlllIllIlI[108];
        iArr2[lIIIlllIllIlI[45]] = lIIIlllIllIlI[109];
        iArr2[lIIIlllIllIlI[46]] = lIIIlllIllIlI[110];
        iArr2[lIIIlllIllIlI[8]] = lIIIlllIllIlI[111];
        iArr2[lIIIlllIllIlI[51]] = lIIIlllIllIlI[112];
        iArr2[lIIIlllIllIlI[52]] = lIIIlllIllIlI[113];
        iArr2[lIIIlllIllIlI[53]] = lIIIlllIllIlI[114];
        iArr2[lIIIlllIllIlI[54]] = lIIIlllIllIlI[115];
        iArr2[lIIIlllIllIlI[55]] = lIIIlllIllIlI[116];
        iArr2[lIIIlllIllIlI[5]] = lIIIlllIllIlI[117];
        iArr2[lIIIlllIllIlI[50]] = lIIIlllIllIlI[118];
        iArr2[lIIIlllIllIlI[56]] = lIIIlllIllIlI[119];
        iArr2[lIIIlllIllIlI[19]] = lIIIlllIllIlI[120];
        iArr2[lIIIlllIllIlI[61]] = lIIIlllIllIlI[121];
        iArr2[lIIIlllIllIlI[62]] = lIIIlllIllIlI[122];
        iArr2[lIIIlllIllIlI[33]] = lIIIlllIllIlI[123];
        iArr2[lIIIlllIllIlI[63]] = lIIIlllIllIlI[124];
        iArr2[lIIIlllIllIlI[66]] = lIIIlllIllIlI[125];
        iArr2[lIIIlllIllIlI[67]] = lIIIlllIllIlI[126];
        iArr2[lIIIlllIllIlI[68]] = lIIIlllIllIlI[127];
        iArr2[lIIIlllIllIlI[12]] = lIIIlllIllIlI[128];
        iArr2[lIIIlllIllIlI[16]] = lIIIlllIllIlI[129];
        iArr2[lIIIlllIllIlI[69]] = lIIIlllIllIlI[130];
        iArr2[lIIIlllIllIlI[70]] = lIIIlllIllIlI[131];
        iArr2[lIIIlllIllIlI[71]] = lIIIlllIllIlI[132];
        iArr2[lIIIlllIllIlI[73]] = lIIIlllIllIlI[133];
        iArr2[lIIIlllIllIlI[76]] = lIIIlllIllIlI[134];
        iArr2[lIIIlllIllIlI[135]] = lIIIlllIllIlI[136];
        iArr2[lIIIlllIllIlI[82]] = lIIIlllIllIlI[137];
        iArr2[lIIIlllIllIlI[138]] = lIIIlllIllIlI[139];
        iArr2[lIIIlllIllIlI[57]] = lIIIlllIllIlI[140];
        iArr2[lIIIlllIllIlI[141]] = lIIIlllIllIlI[142];
        iArr2[lIIIlllIllIlI[143]] = lIIIlllIllIlI[144];
        iArr2[lIIIlllIllIlI[145]] = lIIIlllIllIlI[146];
        iArr2[lIIIlllIllIlI[147]] = lIIIlllIllIlI[148];
        iArr2[lIIIlllIllIlI[149]] = lIIIlllIllIlI[150];
        iArr2[lIIIlllIllIlI[151]] = lIIIlllIllIlI[152];
        iArr2[lIIIlllIllIlI[153]] = lIIIlllIllIlI[154];
        iArr2[lIIIlllIllIlI[155]] = lIIIlllIllIlI[156];
        iArr2[lIIIlllIllIlI[157]] = lIIIlllIllIlI[158];
        iArr2[lIIIlllIllIlI[159]] = lIIIlllIllIlI[160];
        iArr2[lIIIlllIllIlI[161]] = lIIIlllIllIlI[162];
        iArr2[lIIIlllIllIlI[163]] = lIIIlllIllIlI[164];
        iArr2[lIIIlllIllIlI[165]] = lIIIlllIllIlI[166];
        iArr2[lIIIlllIllIlI[167]] = lIIIlllIllIlI[168];
        iArr2[lIIIlllIllIlI[169]] = lIIIlllIllIlI[170];
        iArr2[lIIIlllIllIlI[171]] = lIIIlllIllIlI[172];
        iArr2[lIIIlllIllIlI[173]] = lIIIlllIllIlI[174];
        iArr2[lIIIlllIllIlI[175]] = lIIIlllIllIlI[176];
        iArr2[lIIIlllIllIlI[177]] = lIIIlllIllIlI[178];
        iArr2[lIIIlllIllIlI[179]] = lIIIlllIllIlI[180];
        iArr2[lIIIlllIllIlI[36]] = lIIIlllIllIlI[181];
        iArr2[lIIIlllIllIlI[182]] = lIIIlllIllIlI[183];
        iArr2[lIIIlllIllIlI[184]] = lIIIlllIllIlI[185];
        iArr2[lIIIlllIllIlI[186]] = lIIIlllIllIlI[187];
        iArr2[lIIIlllIllIlI[188]] = lIIIlllIllIlI[189];
        iArr2[lIIIlllIllIlI[190]] = lIIIlllIllIlI[191];
        iArr2[lIIIlllIllIlI[192]] = lIIIlllIllIlI[193];
        iArr2[lIIIlllIllIlI[194]] = lIIIlllIllIlI[195];
        iArr2[lIIIlllIllIlI[196]] = lIIIlllIllIlI[197];
        iArr2[lIIIlllIllIlI[198]] = lIIIlllIllIlI[199];
        iArr2[lIIIlllIllIlI[200]] = lIIIlllIllIlI[201];
        iArr2[lIIIlllIllIlI[202]] = lIIIlllIllIlI[203];
        iArr2[lIIIlllIllIlI[204]] = lIIIlllIllIlI[205];
        iArr2[lIIIlllIllIlI[206]] = lIIIlllIllIlI[207];
        iArr2[lIIIlllIllIlI[208]] = lIIIlllIllIlI[209];
        iArr2[lIIIlllIllIlI[210]] = lIIIlllIllIlI[211];
        iArr2[lIIIlllIllIlI[212]] = lIIIlllIllIlI[213];
        iArr2[lIIIlllIllIlI[214]] = lIIIlllIllIlI[215];
        iArr2[lIIIlllIllIlI[216]] = lIIIlllIllIlI[217];
        iArr2[lIIIlllIllIlI[218]] = lIIIlllIllIlI[219];
        iArr2[lIIIlllIllIlI[220]] = lIIIlllIllIlI[221];
        iArr2[lIIIlllIllIlI[222]] = lIIIlllIllIlI[223];
        iArr2[lIIIlllIllIlI[224]] = lIIIlllIllIlI[225];
        iArr2[lIIIlllIllIlI[226]] = lIIIlllIllIlI[227];
        iArr2[lIIIlllIllIlI[228]] = lIIIlllIllIlI[229];
        iArr2[lIIIlllIllIlI[230]] = lIIIlllIllIlI[231];
        iArr2[lIIIlllIllIlI[232]] = lIIIlllIllIlI[233];
        iArr2[lIIIlllIllIlI[234]] = lIIIlllIllIlI[235];
        iArr2[lIIIlllIllIlI[236]] = lIIIlllIllIlI[237];
        iArr2[lIIIlllIllIlI[72]] = lIIIlllIllIlI[238];
        iArr2[lIIIlllIllIlI[59]] = lIIIlllIllIlI[239];
        iArr2[lIIIlllIllIlI[240]] = lIIIlllIllIlI[241];
        iArr2[lIIIlllIllIlI[242]] = lIIIlllIllIlI[243];
        iArr2[lIIIlllIllIlI[244]] = lIIIlllIllIlI[245];
        iArr2[lIIIlllIllIlI[246]] = lIIIlllIllIlI[247];
        iArr2[lIIIlllIllIlI[248]] = lIIIlllIllIlI[249];
        ae = iArr2;
        af = new WorldPoint(lIIIlllIllIlI[250], lIIIlllIllIlI[251], lIIIlllIllIlI[2]);
        ag = new WorldArea(lIIIlllIllIlI[252], lIIIlllIllIlI[253], lIIIlllIllIlI[61], lIIIlllIllIlI[46], lIIIlllIllIlI[0]);
    }

    private static boolean lIlIIlIIllIlIlI(int i2, int i3) {
        return i2 == i3;
    }

    public static void a(WorldPoint worldPoint) {
        WorldPoint worldPoint2 = new WorldPoint(lIIIlllIllIlI[29], lIIIlllIllIlI[30], lIIIlllIllIlI[0]);
        WorldArea worldArea = new WorldArea(lIIIlllIllIlI[31], lIIIlllIllIlI[32], lIIIlllIllIlI[21], lIIIlllIllIlI[33], lIIIlllIllIlI[0]);
        WorldArea worldArea2 = new WorldArea(lIIIlllIllIlI[34], lIIIlllIllIlI[35], lIIIlllIllIlI[36], lIIIlllIllIlI[37], lIIIlllIllIlI[0]);
        if (lIlIIlIIllIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIlllIllIlI[17]) && lIlIIlIIllIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIllIlIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIllIllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIllIlI[38], lIIIlllIllIlI[39], lIIIlllIllIlI[1])), lIIIlllIllIlI[13])) {
            AccBuilderRat.c = lIIIlllIlIlIl[lIIIlllIllIlI[40]];
            if (lIlIIlIIllIlIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(worldPoint2);
            "".length();
            Time.sleepTicks(lIIIlllIllIlI[1]);
            "".length();
        }
        if (lIlIIlIIlllIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIlllIllIlI[17]) && lIlIIlIIlllIIII(Players.getLocal().getWorldLocation().getY(), lIIIlllIllIlI[30])) {
            if (lIlIIlIIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr = new String[lIIIlllIllIlI[1]];
                strArr[lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[41]];
                TileObjects.getNearest(strArr).interact(lIIIlllIlIlIl[lIIIlllIllIlI[42]]);
                Time.sleepTicks(lIIIlllIllIlI[2]);
                "".length();
            }
            if (lIlIIlIIllIlIll(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr2 = new String[lIIIlllIllIlI[1]];
                strArr2[lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[11]];
                C0006g.a(strArr2);
            }
        }
        if (lIlIIlIIllIllll(Players.getLocal().getWorldLocation().getY(), lIIIlllIllIlI[30])) {
            if (lIlIIlIIllIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIllIlIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIlIIlIIlllIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIllIlI[38], lIIIlllIllIlI[39], lIIIlllIllIlI[1])), lIIIlllIllIlI[13])) {
                return;
            }
            AccBuilderRat.c = lIIIlllIlIlIl[lIIIlllIllIlI[13]];
            if (lIlIIlIIllIlIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIllIlI[29], lIIIlllIllIlI[43], lIIIlllIllIlI[0])) ? 1 : 0)) {
                b(new WorldPoint(lIIIlllIllIlI[29], lIIIlllIllIlI[44], lIIIlllIllIlI[0]));
                Time.sleepTicks(lIIIlllIllIlI[17]);
                "".length();
            }
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIIlllIllIlI[1]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public static void H() {
        if (lIlIIlIIllIlIIl(Widgets.get(lIIIlllIllIlI[58]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get(lIIIlllIllIlI[58], lIIIlllIllIlI[40]);
            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) lIIIlllIllIlI[1]);
            Time.sleepTicks(lIIIlllIllIlI[6]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean b(int[] iArr) {
        int lllllllllllllllIIIIIlIIlllllIIlI = lIIIlllIllIlI[0];
        while (lIlIIlIIllIIlll(lllllllllllllllIIIIIlIIlllllIIlI, iArr.length)) {
            if (lIlIIlIIllIlIIl(i(iArr[lllllllllllllllIIIIIlIIlllllIIlI]) ? 1 : 0)) {
                System.out.println("Missing ID: " + iArr[lllllllllllllllIIIIIlIIlllllIIlI]);
                return lIIIlllIllIlI[0];
            }
            lllllllllllllllIIIIIlIIlllllIIlI++;
            "".length();
            if ("  ".length() < (((123 ^ 33) ^ (107 ^ 123)) & (((109 ^ 4) ^ (30 ^ 61)) ^ (-" ".length())))) {
                return ((134 ^ 149) ^ (192 ^ 141)) & (((((4 + 196) - 67) + 66) ^ (((49 + 123) - 60) + 41)) ^ (-" ".length()));
            }
        }
        return lIIIlllIllIlI[1];
    }

    private static String lIlIIlIIlIIlIII(String lllllllllllllllIIIIIlIIllIIIIlII, String lllllllllllllllIIIIIlIIllIIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIIllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIIllIIIIIll.getBytes(StandardCharsets.UTF_8)), lIIIlllIllIlI[20]), "DES");
            Cipher lllllllllllllllIIIIIlIIllIIIIllI = Cipher.getInstance("DES");
            lllllllllllllllIIIIIlIIllIIIIllI.init(lIIIlllIllIlI[2], lllllllllllllllIIIIIlIIllIIIIlll);
            return new String(lllllllllllllllIIIIIlIIllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIIllIIIIlIl) {
            lllllllllllllllIIIIIlIIllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIlllIIII(int i2, int i3) {
        return i2 <= i3;
    }

    private static void lIlIIlIIllIIIlI() {
        lIIIlllIlIlIl = new String[lIIIlllIllIlI[135]];
        lIIIlllIlIlIl[lIIIlllIllIlI[0]] = lIlIIlIIlIIIllI("UHVRTxQR", "uPajp");
        lIIIlllIlIlIl[lIIIlllIllIlI[1]] = lIlIIlIIlIIIllI("BG4VMgIiJjo7Py43IjswNyQNBgUmCBsIECo9JwAtaSA7DhMoIBUgHiMnBBIdIggkEh0iej0fBQ==", "GTIgq");
        lIIIlllIlIlIl[lIIIlllIllIlI[2]] = lIlIIlIIlIIIlll("TOC3gKNBezq2ED+8qYklHg==", "FpxrT");
        lIIIlllIlIlIl[lIIIlllIllIlI[6]] = lIlIIlIIlIIIllI("Dh8dEjI=", "MsraW");
        lIIIlllIlIlIl[lIIIlllIllIlI[3]] = lIlIIlIIlIIIllI("KhY8CBcNUwcMBhcaPgoH", "ysPmt");
        lIIIlllIlIlIl[lIIIlllIllIlI[14]] = lIlIIlIIlIIlIII("N+drsvcaU3o=", "wQtqv");
        lIIIlllIlIlIl[lIIIlllIllIlI[17]] = lIlIIlIIlIIIllI("JCA9KSAV", "pOZNL");
        lIIIlllIlIlIl[lIIIlllIllIlI[9]] = lIlIIlIIlIIIllI("ECQEByk=", "SHktL");
        lIIIlllIlIlIl[lIIIlllIllIlI[20]] = lIlIIlIIlIIlIII("PatEHrYNNa5xST791aZa/w==", "yCGFo");
        lIIIlllIlIlIl[lIIIlllIllIlI[21]] = lIlIIlIIlIIIlll("PqF1uYkgxnE=", "DtWWk");
        lIIIlllIlIlIl[lIIIlllIllIlI[22]] = lIlIIlIIlIIIlll("FTF1F+SwEcU=", "vwCkD");
        lIIIlllIlIlIl[lIIIlllIllIlI[23]] = lIlIIlIIlIIIlll("2Al1JydSPDg=", "TRUNP");
        lIIIlllIlIlIl[lIIIlllIllIlI[24]] = lIlIIlIIlIIIlll("VUEsg8XslQw=", "YNIpV");
        lIIIlllIlIlIl[lIIIlllIllIlI[25]] = lIlIIlIIlIIlIII("TUWT6CxHP/4=", "ZZUMf");
        lIIIlllIlIlIl[lIIIlllIllIlI[26]] = lIlIIlIIlIIIllI("IisWLhs=", "gZcGk");
        lIIIlllIlIlIl[lIIIlllIllIlI[28]] = lIlIIlIIlIIIllI("Lw0iMnAFAXQ2cDgvdCQ7HQg4eQ==", "hdTWP");
        lIIIlllIlIlIl[lIIIlllIllIlI[40]] = lIlIIlIIlIIIlll("vkR1wsOCnTglNy8GZiU/pHTX2srhVAbb", "IpFXL");
        lIIIlllIlIlIl[lIIIlllIllIlI[41]] = lIlIIlIIlIIIllI("AAkEDg==", "GhpkD");
        lIIIlllIlIlIl[lIIIlllIllIlI[42]] = lIlIIlIIlIIlIII("IR/1fydQBaU=", "mnumk");
        lIIIlllIlIlIl[lIIIlllIllIlI[11]] = lIlIIlIIlIIIlll("c+WCkxvWxkmrolNkQettSn2rjuzywAPb", "AfmiM");
        lIIIlllIlIlIl[lIIIlllIllIlI[13]] = lIlIIlIIlIIlIII("20V1ur4YD6zROQCiBx/BGM/cHaEBtjIn", "bSPip");
        lIIIlllIlIlIl[lIIIlllIllIlI[45]] = lIlIIlIIlIIIlll("D3llZ0Zz8Ok=", "QrdhH");
        lIIIlllIlIlIl[lIIIlllIllIlI[46]] = lIlIIlIIlIIIllI("EQsPGhI8EEw6DiIB", "Rdanw");
        lIIIlllIlIlIl[lIIIlllIllIlI[8]] = lIlIIlIIlIIIlll("FaML1IDGI1m3K6lG2UA3qkqchPqkh9VI", "oLnHM");
        lIIIlllIlIlIl[lIIIlllIllIlI[51]] = lIlIIlIIlIIlIII("BYL4ErZT+FdnQ/Nti6JkDw==", "KFlfB");
        lIIIlllIlIlIl[lIIIlllIllIlI[52]] = lIlIIlIIlIIIlll("f4Edq7kBnAaerZT49NWMRA==", "JTCmz");
        lIIIlllIlIlIl[lIIIlllIllIlI[53]] = lIlIIlIIlIIlIII("UD1izHzlEzP2NGkwWEKwNA==", "fCWoX");
        lIIIlllIlIlIl[lIIIlllIllIlI[54]] = lIlIIlIIlIIlIII("a48VZ3tnS8vlpBaOC2qk8A==", "UDAMv");
        lIIIlllIlIlIl[lIIIlllIllIlI[55]] = lIlIIlIIlIIIlll("pGsgKfMYCXQ=", "MzWRt");
        lIIIlllIlIlIl[lIIIlllIllIlI[5]] = lIlIIlIIlIIlIII("tV9L12DOBUE=", "PdwXT");
        lIIIlllIlIlIl[lIIIlllIllIlI[50]] = lIlIIlIIlIIIllI("Fy0wMAgr", "GBBDi");
        lIIIlllIlIlIl[lIIIlllIllIlI[56]] = lIlIIlIIlIIIlll("upbaDr73DAk=", "bDMTp");
        lIIIlllIlIlIl[lIIIlllIllIlI[19]] = lIlIIlIIlIIIlll("n9x650eFGmE=", "Zlvzl");
        lIIIlllIlIlIl[lIIIlllIllIlI[61]] = lIlIIlIIlIIlIII("lSl8PmRJx0I=", "aYAmW");
        lIIIlllIlIlIl[lIIIlllIllIlI[62]] = lIlIIlIIlIIlIII("wvw/KvSoUwo=", "iqvyM");
        lIIIlllIlIlIl[lIIIlllIllIlI[33]] = lIlIIlIIlIIIlll("mkmP6MzvmPw=", "CdXIL");
        lIIIlllIlIlIl[lIIIlllIllIlI[63]] = lIlIIlIIlIIIllI("Bh0zOg==", "NtTRm");
        lIIIlllIlIlIl[lIIIlllIllIlI[66]] = lIlIIlIIlIIIlll("W6dtC7WZ+pI=", "qSTAi");
        lIIIlllIlIlIl[lIIIlllIllIlI[67]] = lIlIIlIIlIIlIII("hOWanDin9xM=", "NualV");
        lIIIlllIlIlIl[lIIIlllIllIlI[68]] = lIlIIlIIlIIlIII("TDV/1yPsdvA=", "lRgDR");
        lIIIlllIlIlIl[lIIIlllIllIlI[12]] = lIlIIlIIlIIIlll("RCUSz/zDHek=", "iRDGI");
        lIIIlllIlIlIl[lIIIlllIllIlI[16]] = lIlIIlIIlIIIllI("JzEqICcCOg==", "cTKDJ");
        lIIIlllIlIlIl[lIIIlllIllIlI[69]] = lIlIIlIIlIIlIII("M8sO9xu3FgIj+nU4rEV2hw==", "TUVbK");
        lIIIlllIlIlIl[lIIIlllIllIlI[70]] = lIlIIlIIlIIIllI("Jgk+Mzg=", "RfJRT");
        lIIIlllIlIlIl[lIIIlllIllIlI[71]] = lIlIIlIIlIIIlll("4ZkUNpAykjk=", "HtgmE");
        lIIIlllIlIlIl[lIIIlllIllIlI[73]] = lIlIIlIIlIIlIII("y9vPkAztwhTxAt2ioUBU9Q==", "ZbKon");
        lIIIlllIlIlIl[lIIIlllIllIlI[76]] = lIlIIlIIlIIIlll("FvxD2VvRAo7ob8FD6dOBc9Ajf+ohrVhMm37vW7upXCFVxOw4IhriXWISjKje7w8oqgnNMOXqR88=", "yAqyP");
    }

    public static void B() {
        Widget widget = Widgets.get(lIIIlllIllIlI[18], lIIIlllIllIlI[19]);
        if (lIlIIlIIllIlIII(widget)) {
            widget.interact(lIIIlllIlIlIl[lIIIlllIllIlI[20]]);
            Time.sleepTicks(lIIIlllIllIlI[1]);
            "".length();
        }
    }

    public static void x() {
        Widget widget = Widgets.get(lIIIlllIllIlI[4], lIIIlllIllIlI[5], lIIIlllIllIlI[0]);
        if (lIlIIlIIllIlIII(widget)) {
            widget.interact(lIIIlllIlIlIl[lIIIlllIllIlI[6]]);
            Time.sleepTicks(lIIIlllIllIlI[6]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void z() {
        if (lIlIIlIIllIlIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIlIIllIlIll(y() ? 1 : 0)) {
            if (lIlIIlIIllIlIIl(A() ? 1 : 0)) {
                B();
            }
            if (lIlIIlIIllIlIll(A() ? 1 : 0)) {
                Widget widget = Widgets.get(lIIIlllIllIlI[7], lIIIlllIllIlI[8], lIIIlllIllIlI[9]);
                if (lIlIIlIIllIlIII(widget)) {
                    widget.interact(lIIIlllIlIlIl[lIIIlllIllIlI[3]]);
                    Time.sleepTicks(lIIIlllIllIlI[1]);
                    "".length();
                }
                if (lIlIIlIIllIlIIl(Vars.getBit(lIIIlllIllIlI[10]))) {
                    Widget widget2 = Widgets.get(lIIIlllIllIlI[7], lIIIlllIllIlI[11], lIIIlllIllIlI[12]);
                    if (lIlIIlIIllIlIII(widget2)) {
                        if (lIlIIlIIllIlIIl(widget2.isVisible() ? 1 : 0)) {
                            Widget widget3 = Widgets.get(lIIIlllIllIlI[7], lIIIlllIllIlI[13], lIIIlllIllIlI[14]);
                            Mouse.click(widget3.getClickPoint().getX(), widget3.getClickPoint().getY(), (boolean) lIIIlllIllIlI[1]);
                            Time.sleepTicks(lIIIlllIllIlI[1]);
                            "".length();
                        }
                        if (lIlIIlIIllIlIll(widget2.isVisible() ? 1 : 0)) {
                            widget2.interact(lIIIlllIlIlIl[lIIIlllIllIlI[14]]);
                            Time.sleepTicks(lIIIlllIllIlI[1]);
                            "".length();
                        }
                    }
                }
                if (lIlIIlIIllIlIIl(Vars.getBit(lIIIlllIllIlI[15]))) {
                    Widget widget4 = Widgets.get(lIIIlllIllIlI[7], lIIIlllIllIlI[11], lIIIlllIllIlI[16]);
                    if (lIlIIlIIllIlIII(widget4)) {
                        if (lIlIIlIIllIlIIl(widget4.isVisible() ? 1 : 0)) {
                            Widget widget5 = Widgets.get(lIIIlllIllIlI[7], lIIIlllIllIlI[13], lIIIlllIllIlI[14]);
                            Mouse.click(widget5.getClickPoint().getX(), widget5.getClickPoint().getY(), (boolean) lIIIlllIllIlI[1]);
                            Time.sleepTicks(lIIIlllIllIlI[1]);
                            "".length();
                        }
                        if (lIlIIlIIllIlIll(widget4.isVisible() ? 1 : 0)) {
                            widget4.interact(lIIIlllIlIlIl[lIIIlllIllIlI[17]]);
                            Time.sleepTicks(lIIIlllIllIlI[2]);
                            "".length();
                        }
                    }
                }
            }
        }
        Widget widget6 = Widgets.get(lIIIlllIllIlI[7], lIIIlllIllIlI[3]);
        if (lIlIIlIIllIlIII(widget6)) {
            widget6.interact(lIIIlllIlIlIl[lIIIlllIllIlI[9]]);
            Time.sleepTicks(lIIIlllIllIlI[1]);
            "".length();
        }
    }

    private static boolean lIlIIlIIllIllll(int i2, int i3) {
        return i2 > i3;
    }

    public static int I() {
        return j(lIIIlllIllIlI[59]);
    }

    private static boolean lIlIIlIIllIlllI(Object obj) {
        return obj == null;
    }

    public static void C() {
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (lIlIIlIIllIlIll(world.isMembers() ? 1 : 0) && lIlIIlIIlllIIII(world.getPlayerCount(), lIIIlllIllIlI[60]) && lIlIIlIIllIllIl(world.getId(), Worlds.getCurrentId()) && lIlIIlIIllIlIIl(world.getActivity().endsWith(lIIIlllIlIlIl[lIIIlllIllIlI[61]]) ? 1 : 0) && lIlIIlIIllIlIIl(world.getActivity().endsWith(lIIIlllIlIlIl[lIIIlllIllIlI[62]]) ? 1 : 0) && lIlIIlIIllIlIIl(world.getActivity().startsWith(lIIIlllIlIlIl[lIIIlllIllIlI[33]]) ? 1 : 0) && lIlIIlIIllIlIIl(world.getActivity().startsWith(lIIIlllIlIlIl[lIIIlllIllIlI[63]]) ? 1 : 0) && lIlIIlIIllIllIl(world.getId(), lIIIlllIllIlI[64]) && lIlIIlIIllIllIl(world.getId(), lIIIlllIllIlI[65]) && lIlIIlIIllIllIl(world.getId(), lIIIlllIllIlI[65]) && lIlIIlIIllIlIIl(world.getActivity().contains(lIIIlllIlIlIl[lIIIlllIllIlI[66]]) ? 1 : 0) && lIlIIlIIllIlIIl(world.getActivity().contains(lIIIlllIlIlIl[lIIIlllIllIlI[67]]) ? 1 : 0) && lIlIIlIIllIlIIl(world.getActivity().contains(lIIIlllIlIlIl[lIIIlllIllIlI[68]]) ? 1 : 0) && lIlIIlIIllIlIIl(world.getActivity().startsWith(lIIIlllIlIlIl[lIIIlllIllIlI[12]]) ? 1 : 0) && lIlIIlIIllIlIIl(world.getActivity().endsWith(lIIIlllIlIlIl[lIIIlllIllIlI[16]]) ? 1 : 0) && lIlIIlIIllIlIIl(world.getActivity().endsWith(lIIIlllIlIlIl[lIIIlllIllIlI[69]]) ? 1 : 0) && lIlIIlIIllIlIIl(world.getActivity().endsWith(lIIIlllIlIlIl[lIIIlllIllIlI[70]]) ? 1 : 0) && lIlIIlIIllIlIIl(world.getActivity().startsWith(lIIIlllIlIlIl[lIIIlllIllIlI[71]]) ? 1 : 0) && lIlIIlIIllIllll(world.getPlayerCount(), lIIIlllIllIlI[72])) {
                ?? r0 = lIIIlllIllIlI[1];
                "".length();
                return (96 ^ 100) < (47 ^ 43) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIIlllIllIlI[0];
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public static void a(String str, String lllllllllllllllIIIIIlIIlllIIllIl) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod(lIIIlllIlIlIl[lIIIlllIllIlI[45]]);
            httpURLConnection.setRequestProperty(lIIIlllIlIlIl[lIIIlllIllIlI[46]], lIIIlllIlIlIl[lIIIlllIllIlI[8]]);
            httpURLConnection.setDoOutput(lIIIlllIllIlI[1]);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes("{\"content\": \"" + lllllllllllllllIIIIIlIIlllIIllIl + "\"}");
            dataOutputStream.flush();
            dataOutputStream.close();
            System.out.println("Response Code: " + httpURLConnection.getResponseCode());
            httpURLConnection.disconnect();
            "".length();
            if (" ".length() >= "   ".length()) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean lIlIIlIIllIlIll(int i2) {
        return i2 != 0;
    }

    public static int u() {
        return ae[c(lIIIlllIllIlI[0], ae.length - lIIIlllIllIlI[1])];
    }

    public static void E() {
        if (lIlIIlIIllIlIlI(j(lIIIlllIllIlI[48]), lIIIlllIllIlI[1])) {
            if (lIlIIlIIllIlIIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lIIIlllIllIlI[1]);
                "".length();
            }
            if (lIlIIlIIllIlIll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lIIIlllIllIlI[49], lIIIlllIllIlI[50]);
                if (lIlIIlIIllIlIII(widget)) {
                    widget.interact(lIIIlllIlIlIl[lIIIlllIllIlI[52]]);
                    Time.sleepTicks(lIIIlllIllIlI[1]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean A() {
        if (lIlIIlIIllIlIII(Widgets.get(lIIIlllIllIlI[7], lIIIlllIllIlI[1]))) {
            ?? r0 = lIIIlllIllIlI[1];
            "".length();
            return ((9 ^ 74) & ((122 ^ 57) ^ (-1))) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlllIllIlI[0];
    }

    private static void lIlIIlIIllIIllI() {
        lIIIlllIllIlI = new int[254];
        lIIIlllIllIlI[0] = ((47 ^ 60) ^ (227 ^ 194)) & (((((63 + 124) - 69) + 35) ^ (((39 + 169) - 176) + 139)) ^ (-" ".length()));
        lIIIlllIllIlI[1] = " ".length();
        lIIIlllIllIlI[2] = "  ".length();
        lIIIlllIllIlI[3] = (((140 + 168) - 125) + 13) ^ (((64 + 140) - 134) + 122);
        lIIIlllIllIlI[4] = (-((-18449) & 27735)) & (-6145) & 16094;
        lIIIlllIllIlI[5] = (((101 + 47) - 32) + 31) ^ (((59 + 78) - 4) + 9);
        lIIIlllIllIlI[6] = "   ".length();
        lIIIlllIllIlI[7] = (((81 ^ 20) + (((39 + 40) - 0) + 54)) - (((156 + 41) - 77) + 58)) + (194 ^ 172);
        lIIIlllIllIlI[8] = (22 ^ 57) ^ (28 ^ 36);
        lIIIlllIllIlI[9] = (89 ^ 72) ^ (133 ^ 147);
        lIIIlllIllIlI[10] = (-17553) & 32252;
        lIIIlllIllIlI[11] = (126 ^ 12) ^ (209 ^ 176);
        lIIIlllIllIlI[12] = (87 ^ 119) ^ (2 ^ 10);
        lIIIlllIllIlI[13] = (34 ^ 14) ^ (119 ^ 79);
        lIIIlllIllIlI[14] = 93 ^ 88;
        lIIIlllIllIlI[15] = (-17555) & 32255;
        lIIIlllIllIlI[16] = 112 ^ 89;
        lIIIlllIllIlI[17] = 79 ^ 73;
        lIIIlllIllIlI[18] = (11 ^ 91) ^ (41 ^ 13);
        lIIIlllIllIlI[19] = (219 ^ 151) ^ (121 ^ 21);
        lIIIlllIllIlI[20] = 110 ^ 102;
        lIIIlllIllIlI[21] = (106 ^ 90) ^ (36 ^ 29);
        lIIIlllIllIlI[22] = 86 ^ 92;
        lIIIlllIllIlI[23] = 145 ^ 154;
        lIIIlllIllIlI[24] = 135 ^ 139;
        lIIIlllIllIlI[25] = 149 ^ 152;
        lIIIlllIllIlI[26] = (((157 + 76) - 63) + 3) ^ (((87 + 149) - 212) + 139);
        lIIIlllIllIlI[27] = (-((-23221) & 32501)) & (-419) & 32255;
        lIIIlllIllIlI[28] = (((95 + 161) - 160) + 84) ^ (((127 + 153) - 120) + 27);
        lIIIlllIllIlI[29] = (-((-18699) & 31563)) & (-16419) & 31743;
        lIIIlllIllIlI[30] = (-((-1441) & 14249)) & (-16449) & 32639;
        lIIIlllIllIlI[31] = (-((-16421) & 21607)) & (-8741) & 16383;
        lIIIlllIllIlI[32] = (-25158) & 28541;
        lIIIlllIllIlI[33] = (((80 + 135) - 84) + 30) ^ (((79 + 78) - 116) + 89);
        lIIIlllIllIlI[34] = (-((-10613) & 16373)) & (-8193) & 16375;
        lIIIlllIllIlI[35] = (-((-317) & 29693)) & (-1) & 32767;
        lIIIlllIllIlI[36] = (64 ^ 119) ^ (117 ^ 5);
        lIIIlllIllIlI[37] = ((93 + 129) - 189) + 110;
        lIIIlllIllIlI[38] = (-((-121) & 13946)) & (-99) & 16383;
        lIIIlllIllIlI[39] = (-16519) & 19935;
        lIIIlllIllIlI[40] = 163 ^ 179;
        lIIIlllIllIlI[41] = (((92 + 105) - 144) + 94) ^ (((10 + 69) - (-9)) + 42);
        lIIIlllIllIlI[42] = 45 ^ 63;
        lIIIlllIllIlI[43] = (-((-1321) & 30639)) & (-1) & 32703;
        lIIIlllIllIlI[44] = (-((-449) & 29131)) & (-161) & 32239;
        lIIIlllIllIlI[45] = 112 ^ 101;
        lIIIlllIllIlI[46] = 84 ^ 66;
        lIIIlllIllIlI[47] = -" ".length();
        lIIIlllIllIlI[48] = ((16 + 130) - 119) + 145;
        lIIIlllIllIlI[49] = (-((-513) & 20399)) & (-12289) & 32767;
        lIIIlllIllIlI[50] = 95 ^ 65;
        lIIIlllIllIlI[51] = 79 ^ 87;
        lIIIlllIllIlI[52] = (((80 + 101) - 43) + 51) ^ (((3 + 53) - (-36)) + 72);
        lIIIlllIllIlI[53] = (109 ^ 83) ^ (15 ^ 43);
        lIIIlllIllIlI[54] = 100 ^ 127;
        lIIIlllIllIlI[55] = 218 ^ 198;
        lIIIlllIllIlI[56] = (50 ^ 53) ^ (104 ^ 112);
        lIIIlllIllIlI[57] = (94 ^ 121) ^ (38 ^ 51);
        lIIIlllIllIlI[58] = ((114 + 150) - 166) + 55;
        lIIIlllIllIlI[59] = 86 ^ 51;
        lIIIlllIllIlI[60] = (-((-17165) & 31534)) & (-1) & 16319;
        lIIIlllIllIlI[61] = 26 ^ 59;
        lIIIlllIllIlI[62] = (82 ^ 55) ^ (61 ^ 122);
        lIIIlllIllIlI[63] = 35 ^ 7;
        lIIIlllIllIlI[64] = (-((-5330) & 32471)) & (-33) & 27647;
        lIIIlllIllIlI[65] = (-15649) & 16181;
        lIIIlllIllIlI[66] = (84 ^ 42) ^ (83 ^ 8);
        lIIIlllIllIlI[67] = (65 ^ 19) ^ (14 ^ 122);
        lIIIlllIllIlI[68] = 52 ^ 19;
        lIIIlllIllIlI[69] = (10 ^ 50) ^ (110 ^ 124);
        lIIIlllIllIlI[70] = 70 ^ 109;
        lIIIlllIllIlI[71] = (((36 + 46) - (-4)) + 53) ^ (((3 + 101) - 62) + 125);
        lIIIlllIllIlI[72] = (((175 + 120) - 102) + 15) ^ (((138 + 156) - 257) + 143);
        lIIIlllIllIlI[73] = 3 ^ 46;
        lIIIlllIllIlI[74] = (((66 ^ 6) + (((194 + 131) - 115) + 11)) - (20 ^ 93)) + (130 ^ 141);
        lIIIlllIllIlI[75] = (((((135 + 26) - 49) + 80) + (221 ^ 146)) - (((64 + 82) - 30) + 113)) + ((131 + 54) - 86) + 88;
        lIIIlllIllIlI[76] = (((77 + 126) - 195) + 150) ^ (((27 + 133) - 13) + 29);
        lIIIlllIllIlI[77] = (((((91 + 91) - 56) + 41) + (113 ^ 88)) - "  ".length()) + (103 ^ 108);
        lIIIlllIllIlI[78] = ((32 + 148) - 106) + 119;
        lIIIlllIllIlI[79] = ((137 + 156) - 259) + 185;
        lIIIlllIllIlI[80] = (-769) & 3958;
        lIIIlllIllIlI[81] = (-((-13749) & 30645)) & (-129) & 20221;
        lIIIlllIllIlI[82] = 55 ^ 7;
        lIIIlllIllIlI[83] = (-((-3833) & 28665)) & (-513) & 28542;
        lIIIlllIllIlI[84] = (-((-3491) & 32254)) & (-513) & 32479;
        lIIIlllIllIlI[85] = (-266) & 3449;
        lIIIlllIllIlI[86] = (-8337) & 11773;
        lIIIlllIllIlI[87] = 222 ^ 181;
        lIIIlllIllIlI[88] = (-((-18726) & 20263)) & (-28705) & 30587;
        lIIIlllIllIlI[89] = (-24133) & 24438;
        lIIIlllIllIlI[90] = (-((-1083) & 11899)) & (-1025) & 12150;
        lIIIlllIllIlI[91] = (-((-2417) & 32763)) & (-2070) & 32767;
        lIIIlllIllIlI[92] = (-((-25441) & 31741)) & (-16897) & 23551;
        lIIIlllIllIlI[93] = (-24594) & 24949;
        lIIIlllIllIlI[94] = (-((-16389) & 29839)) & (-18961) & 32767;
        lIIIlllIllIlI[95] = (-21010) & 21367;
        lIIIlllIllIlI[96] = (-((-3269) & 27902)) & (-3589) & 28607;
        lIIIlllIllIlI[97] = (-((-17705) & 22381)) & (-1) & 5071;
        lIIIlllIllIlI[98] = (-((-4549) & 32750)) & (-4097) & 32763;
        lIIIlllIllIlI[99] = (-5649) & 6142;
        lIIIlllIllIlI[100] = (-((-21) & 24085)) & (-8209) & 32767;
        lIIIlllIllIlI[101] = (-((-2273) & 16099)) & (-10) & 14331;
        lIIIlllIllIlI[102] = (-6497) & 7032;
        lIIIlllIllIlI[103] = (-22578) & 23093;
        lIIIlllIllIlI[104] = (-28677) & 28990;
        lIIIlllIllIlI[105] = (-((-26125) & 32269)) & (-25109) & 31743;
        lIIIlllIllIlI[106] = (-((-1321) & 32697)) & (-33) & 31742;
        lIIIlllIllIlI[107] = (-665) & 1018;
        lIIIlllIllIlI[108] = (-9731) & 10207;
        lIIIlllIllIlI[109] = (-((-1237) & 24318)) & (-9345) & 32747;
        lIIIlllIllIlI[110] = (-24067) & 24371;
        lIIIlllIllIlI[111] = (-((-339) & 16339)) & (-16389) & 32703;
        lIIIlllIllIlI[112] = (-((-35) & 29223)) & (-1) & 29558;
        lIIIlllIllIlI[113] = (-31283) & 31606;
        lIIIlllIllIlI[114] = (-26259) & 26583;
        lIIIlllIllIlI[115] = (-((-9521) & 28085)) & (-9233) & 28124;
        lIIIlllIllIlI[116] = (-((-14473) & 32393)) & (-10241) & 28605;
        lIIIlllIllIlI[117] = (-((-147) & 22166)) & (-33) & 22515;
        lIIIlllIllIlI[118] = (-((-16911) & 23055)) & (-34) & 6655;
        lIIIlllIllIlI[119] = (-21522) & 22011;
        lIIIlllIllIlI[120] = (-((-26154) & 30251)) & (-9235) & 13823;
        lIIIlllIllIlI[121] = (-((-14979) & 32391)) & (-1) & 17919;
        lIIIlllIllIlI[122] = (-((-20623) & 29951)) & (-18562) & 28411;
        lIIIlllIllIlI[123] = (-14389) & 14718;
        lIIIlllIllIlI[124] = (-((-6353) & 31963)) & (-4613) & 30687;
        lIIIlllIllIlI[125] = (-((-1025) & 26102)) & (-7179) & 32767;
        lIIIlllIllIlI[126] = (-13313) & 13871;
        lIIIlllIllIlI[127] = (-((-237) & 31471)) & (-5) & 31615;
        lIIIlllIllIlI[128] = (-1025) & 1356;
        lIIIlllIllIlI[129] = (-((-17809) & 30611)) & (-18433) & 31739;
        lIIIlllIllIlI[130] = (-((-9875) & 16063)) & (-17921) & 24445;
        lIIIlllIllIlI[131] = (-9330) & 9843;
        lIIIlllIllIlI[132] = (-22713) & 23039;
        lIIIlllIllIlI[133] = (-((-3105) & 28223)) & (-2050) & 27647;
        lIIIlllIllIlI[134] = (-((-7185) & 7862)) & (-20481) & 21501;
        lIIIlllIllIlI[135] = 81 ^ 126;
        lIIIlllIllIlI[136] = (-31233) & 31711;
        lIIIlllIllIlI[137] = (-((-16417) & 18993)) & (-5123) & 8191;
        lIIIlllIllIlI[138] = 24 ^ 41;
        lIIIlllIllIlI[139] = (-7338) & 7679;
        lIIIlllIllIlI[140] = (-((-7022) & 24431)) & (-12289) & 30143;
        lIIIlllIllIlI[141] = 26 ^ 41;
        lIIIlllIllIlI[142] = (-((-4935) & 32639)) & (-8) & 28031;
        lIIIlllIllIlI[143] = (186 ^ 142) ^ ((81 ^ 10) & ((63 ^ 100) ^ (-1)));
        lIIIlllIllIlI[144] = (-((-6438) & 32167)) & (-513) & 26591;
        lIIIlllIllIlI[145] = (((53 + 114) - 38) + 50) ^ (((19 + 16) - (-24)) + 75);
        lIIIlllIllIlI[146] = (-1539) & 1859;
        lIIIlllIllIlI[147] = 181 ^ 131;
        lIIIlllIllIlI[148] = (-4225) & 4565;
        lIIIlllIllIlI[149] = (159 ^ 154) ^ (76 ^ 126);
        lIIIlllIllIlI[150] = (-27137) & 27558;
        lIIIlllIllIlI[151] = 53 ^ 13;
        lIIIlllIllIlI[152] = (-26145) & 26607;
        lIIIlllIllIlI[153] = 190 ^ 135;
        lIIIlllIllIlI[154] = (-((-2361) & 11194)) & (-9) & 9215;
        lIIIlllIllIlI[155] = (((17 + 81) - (-34)) + 24) ^ (((88 + 86) - 63) + 55);
        lIIIlllIllIlI[156] = (-16385) & 16760;
        lIIIlllIllIlI[157] = (30 ^ 84) ^ (57 ^ 72);
        lIIIlllIllIlI[158] = (-7332) & 7667;
        lIIIlllIllIlI[159] = 139 ^ 183;
        lIIIlllIllIlI[160] = (-4775) & 5103;
        lIIIlllIllIlI[161] = 254 ^ 195;
        lIIIlllIllIlI[162] = (-((-2059) & 31407)) & (-3089) & 32767;
        lIIIlllIllIlI[163] = 181 ^ 139;
        lIIIlllIllIlI[164] = (-11777) & 12109;
        lIIIlllIllIlI[165] = (120 ^ 40) ^ (84 ^ 59);
        lIIIlllIllIlI[166] = (-((-1323) & 30574)) & (-13) & 29567;
        lIIIlllIllIlI[167] = (122 ^ 56) ^ "  ".length();
        lIIIlllIllIlI[168] = (-((-2535) & 32247)) & (-2178) & 32251;
        lIIIlllIllIlI[169] = (178 ^ 160) ^ (224 ^ 179);
        lIIIlllIllIlI[170] = (-((-12611) & 32251)) & (-4613) & 24575;
        lIIIlllIllIlI[171] = 198 ^ 132;
        lIIIlllIllIlI[172] = (-((-20891) & 32731)) & (-16397) & 28543;
        lIIIlllIllIlI[173] = 61 ^ 126;
        lIIIlllIllIlI[174] = (-23113) & 23421;
        lIIIlllIllIlI[175] = (102 ^ 26) ^ (169 ^ 145);
        lIIIlllIllIlI[176] = (-22017) & 22327;
        lIIIlllIllIlI[177] = 31 ^ 90;
        lIIIlllIllIlI[178] = (-((-24951) & 29559)) & (-9) & 4991;
        lIIIlllIllIlI[179] = 246 ^ 176;
        lIIIlllIllIlI[180] = (-3073) & 3450;
        lIIIlllIllIlI[181] = (-((-4609) & 32725)) & (-41) & 28669;
        lIIIlllIllIlI[182] = (213 ^ 164) ^ (83 ^ 106);
        lIIIlllIllIlI[183] = (-((-1291) & 30667)) & (-17) & 29695;
        lIIIlllIllIlI[184] = 38 ^ 111;
        lIIIlllIllIlI[185] = (-((-1) & 18949)) & (-4290) & 23549;
        lIIIlllIllIlI[186] = (((180 + 14) - 167) + 214) ^ (((154 + 138) - 153) + 48);
        lIIIlllIllIlI[187] = (-10309) & 10621;
        lIIIlllIllIlI[188] = (((42 + 30) - (-52)) + 78) ^ (((43 + 111) - 112) + 87);
        lIIIlllIllIlI[189] = (-((-16659) & 28627)) & (-4097) & 16381;
        lIIIlllIllIlI[190] = 8 ^ 68;
        lIIIlllIllIlI[191] = (-32421) & 32759;
        lIIIlllIllIlI[192] = (9 ^ 73) ^ (201 ^ 196);
        lIIIlllIllIlI[193] = (-((-12998) & 31439)) & (-4225) & 23005;
        lIIIlllIllIlI[194] = 23 ^ 89;
        lIIIlllIllIlI[195] = (-((-2695) & 23183)) & (-3585) & 24415;
        lIIIlllIllIlI[196] = 36 ^ 107;
        lIIIlllIllIlI[197] = (-19461) & 19807;
        lIIIlllIllIlI[198] = (93 ^ 74) ^ (75 ^ 12);
        lIIIlllIllIlI[199] = (-((-341) & 13814)) & (-3) & 13823;
        lIIIlllIllIlI[200] = 48 ^ 97;
        lIIIlllIllIlI[201] = (-((-17695) & 32543)) & (-1153) & 16351;
        lIIIlllIllIlI[202] = 103 ^ 53;
        lIIIlllIllIlI[203] = (-((-523) & 26251)) & (-2577) & 28663;
        lIIIlllIllIlI[204] = 13 ^ 94;
        lIIIlllIllIlI[205] = (-((-421) & 16300)) & (-16529) & 32767;
        lIIIlllIllIlI[206] = 98 ^ 54;
        lIIIlllIllIlI[207] = (-29825) & 30191;
        lIIIlllIllIlI[208] = (((125 + 136) - 133) + 16) ^ (((61 + 104) - 88) + 120);
        lIIIlllIllIlI[209] = (-29705) & 30072;
        lIIIlllIllIlI[210] = (102 ^ 67) ^ (65 ^ 50);
        lIIIlllIllIlI[211] = (-7695) & 8175;
        lIIIlllIllIlI[212] = (((221 + 77) - 296) + 228) ^ (((13 + 32) - (-106)) + 26);
        lIIIlllIllIlI[213] = (-((-10494) & 12031)) & (-28673) & 30691;
        lIIIlllIllIlI[214] = (120 ^ 39) ^ (30 ^ 25);
        lIIIlllIllIlI[215] = (-32275) & 32758;
        lIIIlllIllIlI[216] = (((185 + 165) - 333) + 205) ^ (((126 + 54) - 120) + 75);
        lIIIlllIllIlI[217] = (-((-197) & 31445)) & (-9) & 31741;
        lIIIlllIllIlI[218] = 208 ^ 138;
        lIIIlllIllIlI[219] = (-5130) & 5615;
        lIIIlllIllIlI[220] = (((96 + 110) - 132) + 85) ^ (((57 + 43) - (-6)) + 90);
        lIIIlllIllIlI[221] = (-((-67) & 19539)) & (-4617) & 24575;
        lIIIlllIllIlI[222] = (162 ^ 140) ^ (63 ^ 77);
        lIIIlllIllIlI[223] = (-((-2) & 32279)) & (-1) & 32765;
        lIIIlllIllIlI[224] = 33 ^ 124;
        lIIIlllIllIlI[225] = (-11793) & 12281;
        lIIIlllIllIlI[226] = (2 ^ 21) ^ (98 ^ 43);
        lIIIlllIllIlI[227] = (-3074) & 3579;
        lIIIlllIllIlI[228] = 46 ^ 113;
        lIIIlllIllIlI[229] = (-((-153) & 13978)) & (-2051) & 16383;
        lIIIlllIllIlI[230] = 79 ^ 47;
        lIIIlllIllIlI[231] = (-((-23045) & 31239)) & (-5633) & 14335;
        lIIIlllIllIlI[232] = 193 ^ 160;
        lIIIlllIllIlI[233] = (-((-2699) & 32395)) & (-2562) & 32767;
        lIIIlllIllIlI[234] = (6 ^ 17) ^ (76 ^ 57);
        lIIIlllIllIlI[235] = (-((-6625) & 32737)) & (-6145) & 32767;
        lIIIlllIllIlI[236] = 78 ^ 45;
        lIIIlllIllIlI[237] = (-((-26657) & 31865)) & (-257) & 5981;
        lIIIlllIllIlI[238] = (-19730) & 20247;
        lIIIlllIllIlI[239] = (-((-1) & 21993)) & (-10241) & 32751;
        lIIIlllIllIlI[240] = (104 ^ 34) ^ (17 ^ 61);
        lIIIlllIllIlI[241] = (-((-4143) & 5423)) & (-18613) & 20412;
        lIIIlllIllIlI[242] = 221 ^ 186;
        lIIIlllIllIlI[243] = (-20689) & 21209;
        lIIIlllIllIlI[244] = (166 ^ 189) ^ (34 ^ 81);
        lIIIlllIllIlI[245] = (-((-10177) & 30709)) & (-2497) & 23551;
        lIIIlllIllIlI[246] = 105 ^ 0;
        lIIIlllIllIlI[247] = (-((-2754) & 32707)) & (-33) & 30509;
        lIIIlllIllIlI[248] = 220 ^ 182;
        lIIIlllIllIlI[249] = (-9505) & 10029;
        lIIIlllIllIlI[250] = (-24851) & 28058;
        lIIIlllIllIlI[251] = (-9025) & 12243;
        lIIIlllIllIlI[252] = (-((-10925) & 31421)) & (-1089) & 24541;
        lIIIlllIllIlI[253] = (-((-16778) & 29083)) & (-553) & 16189;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public static boolean G() {
        if (lIlIIlIIllIlIIl(S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIllIlIIl(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIIllIllll(Players.getLocal().getWorldLocation().distanceTo(af), lIIIlllIllIlI[57]) && !lIlIIlIIllIlIll(ag.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIlllIllIlI[0];
        }
        ?? r0 = lIIIlllIllIlI[1];
        "".length();
        return "  ".length() == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    public static void c(String str) {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(lIIIlllIlIlIl[lIIIlllIllIlI[1]]));
        bufferedWriter.write(str + System.getProperty(lIIIlllIlIlIl[lIIIlllIllIlI[2]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static long a(long j) {
        return t() - j;
    }

    public static void w() {
        if (lIlIIlIIllIlIll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks(lIIIlllIllIlI[3]);
            "".length();
        }
        if (lIlIIlIIllIlIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIlIIllIlIIl(Bank.isOpen() ? 1 : 0)) {
            C();
        }
    }

    public static double v() {
        return (Skills.getBoostedLevel(Skill.HITPOINTS) / Skills.getLevel(Skill.HITPOINTS)) * 100.0d;
    }

    public static long t() {
        return U + ((System.nanoTime() - V) / 1000000);
    }

    private static boolean lIlIIlIIllIlIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlIIllIllIl(int i2, int i3) {
        return i2 != i3;
    }

    public static void D() {
        if (lIlIIlIIllIlIIl(j(lIIIlllIllIlI[48]))) {
            if (lIlIIlIIllIlIIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lIIIlllIllIlI[1]);
                "".length();
            }
            if (lIlIIlIIllIlIll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lIIIlllIllIlI[49], lIIIlllIllIlI[50]);
                if (lIlIIlIIllIlIII(widget)) {
                    widget.interact(lIIIlllIlIlIl[lIIIlllIllIlI[51]]);
                    Time.sleepTicks(lIIIlllIllIlI[1]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean] */
    public static void F() {
        int i2 = lIIIlllIllIlI[0];
        do {
            String[] strArr = new String[lIIIlllIllIlI[1]];
            strArr[lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[53]];
            if (!lIlIIlIIllIlIII(TileObjects.getNearest(strArr)) || !lIlIIlIIllIlIIl(AccBuilderRat.d ? 1 : 0)) {
                return;
            }
            AccBuilderRat.c = lIIIlllIlIlIl[lIIIlllIllIlI[54]];
            String[] strArr2 = new String[lIIIlllIllIlI[1]];
            strArr2[lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[55]];
            NPC nearest = NPCs.getNearest(strArr2);
            if (lIlIIlIIllIlIIl(i2)) {
                if (lIlIIlIIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    nearest.interact(lIIIlllIlIlIl[lIIIlllIllIlI[5]]);
                }
                if (lIlIIlIIllIlIll(Dialog.isOpen() ? 1 : 0)) {
                    if (lIlIIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) && lIlIIlIIllIlIIl(Dialog.canContinue() ? 1 : 0)) {
                        List options = Dialog.getOptions();
                        if (lIlIIlIIllIlIIl(options.isEmpty() ? 1 : 0)) {
                            List list = (List) options.stream().filter(widget -> {
                                if (lIlIIlIIllIlIIl(widget.getText().contains(lIIIlllIlIlIl[lIIIlllIllIlI[19]]) ? 1 : 0)) {
                                    ?? r0 = lIIIlllIllIlI[1];
                                    "".length();
                                    return (-" ".length()) >= ((208 ^ 144) ^ (213 ^ 145)) ? ((163 ^ 172) ^ "   ".length()) & (((17 ^ 48) ^ (182 ^ 155)) ^ (-" ".length())) : r0;
                                }
                                return lIIIlllIllIlI[0];
                            }).collect(Collectors.toList());
                            if (lIlIIlIIllIlIIl(list.isEmpty() ? 1 : 0)) {
                                Mouse.click(((Widget) list.get(lIIIlllIllIlI[0])).getClickPoint().getX(), ((Widget) list.get(lIIIlllIllIlI[0])).getClickPoint().getY(), (boolean) lIIIlllIllIlI[1]);
                                Time.sleepTicks(lIIIlllIllIlI[6]);
                                "".length();
                            }
                            if (lIlIIlIIllIlIlI(list.size(), lIIIlllIllIlI[1])) {
                                i2 = lIIIlllIllIlI[1];
                            }
                        }
                    }
                    if (!lIlIIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || lIlIIlIIllIlIll(Dialog.canContinue() ? 1 : 0)) {
                        Dialog.continueSpace();
                    }
                }
            }
            if (lIlIIlIIllIlIll(i2)) {
                String[] strArr3 = new String[lIIIlllIllIlI[1]];
                strArr3[lIIIlllIllIlI[0]] = lIIIlllIlIlIl[lIIIlllIllIlI[50]];
                TileObjects.getNearest(strArr3).interact(lIIIlllIlIlIl[lIIIlllIllIlI[56]]);
                Time.sleepTicks(lIIIlllIllIlI[14]);
                "".length();
            }
            Time.sleepTicks(lIIIlllIllIlI[1]);
            "".length();
            "".length();
        } while (((((72 + 177) - 153) + 85) ^ (((93 + 9) - 52) + 127)) != 0);
    }

    private static boolean lIlIIlIIllIIlll(int i2, int i3) {
        return i2 < i3;
    }

    public static int c(int i2, int i3) {
        int i4 = i3 - i2;
        if (lIlIIlIIllIlIIl(i4)) {
            return i2;
        }
        if (lIlIIlIIllIlIlI(Math.abs(i4), lIIIlllIllIlI[1])) {
            if (lIlIIlIIllIlIll(R.nextBoolean() ? 1 : 0)) {
                "".length();
                return (28 ^ 24) < (149 ^ 145) ? (108 ^ 40) & ((204 ^ 136) ^ (-1)) : i2;
            }
            return i3;
        }
        if (lIlIIlIIllIllII(i4)) {
            i2 = i3;
            i3 = i2;
        }
        return i2 + R.nextInt((i3 - i2) + lIIIlllIllIlI[1]);
    }

    public static void b(WorldPoint worldPoint) {
        int i2;
        int i3;
        Client client = Static.getClient();
        if (lIlIIlIIllIlllI(client.getLocalPlayer())) {
            return;
        }
        int x = worldPoint.getX() - client.getBaseX();
        int y = worldPoint.getY() - client.getBaseY();
        Point localToCanvas = Perspective.localToCanvas(client, LocalPoint.fromScene(x, y), client.getPlane());
        if (lIlIIlIIllIlIII(localToCanvas)) {
            i2 = localToCanvas.getX();
            "".length();
            if (((119 ^ 83) & ((36 ^ 0) ^ (-1))) > 0) {
                return;
            }
        } else {
            i2 = lIIIlllIllIlI[47];
        }
        int i4 = i2;
        if (lIlIIlIIllIlIII(localToCanvas)) {
            i3 = localToCanvas.getY();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        } else {
            i3 = lIIIlllIllIlI[47];
        }
        client.interact(lIIIlllIllIlI[0], MenuAction.WALK.getId(), x, y, i4, i3);
    }

    public static String b(long j) {
        String str = lIIIlllIlIlIl[lIIIlllIllIlI[0]];
        Object[] objArr = new Object[lIIIlllIllIlI[1]];
        objArr[lIIIlllIllIlI[0]] = Integer.valueOf(lIIIlllIllIlI[2]);
        String format = String.format(str, objArr);
        long j2 = j / 1000;
        Object[] objArr2 = new Object[lIIIlllIllIlI[1]];
        objArr2[lIIIlllIllIlI[0]] = Long.valueOf(j2 % 60);
        String format2 = String.format(format, objArr2);
        Object[] objArr3 = new Object[lIIIlllIllIlI[1]];
        objArr3[lIIIlllIllIlI[0]] = Long.valueOf((j2 % 3600) / 60);
        String format3 = String.format(format, objArr3);
        Object[] objArr4 = new Object[lIIIlllIllIlI[1]];
        objArr4[lIIIlllIllIlI[0]] = Long.valueOf(j2 / 3600);
        return String.format(format, objArr4) + ":" + format3 + ":" + format2;
    }
}
