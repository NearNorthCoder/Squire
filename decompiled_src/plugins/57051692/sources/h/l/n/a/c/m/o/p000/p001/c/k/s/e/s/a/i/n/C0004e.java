package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/e.class */
public class C0004e {
    public static final /* synthetic */ ThreadLocalRandom R;
    public static final /* synthetic */ String Q;
    public static /* synthetic */ int[] Y;
    public static /* synthetic */ WorldPoint X;
    private static /* synthetic */ int[] lIlIIlIlll;
    static final /* synthetic */ WorldArea S;
    private static final /* synthetic */ Map<Integer, Integer> W;
    static final /* synthetic */ WorldArea T;
    static /* synthetic */ WorldArea aa;
    static /* synthetic */ WorldPoint Z;
    private static final /* synthetic */ long V;
    private static final /* synthetic */ long U;
    private static /* synthetic */ String[] lIlIIlIlIl;

    public static long s() {
        return U + ((System.nanoTime() - V) / 1000000);
    }

    public static void B() {
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (lIIIllIIllIll(world.isMembers() ? 1 : 0) && lIIIllIIllllI(world.getPlayerCount(), lIlIIlIlll[75]) && lIIIllIlIIIIl(world.getId(), Worlds.getCurrentId()) && lIIIllIIllIIl(world.getActivity().endsWith(lIlIIlIlIl[lIlIIlIlll[76]]) ? 1 : 0) && lIIIllIIllIIl(world.getActivity().endsWith(lIlIIlIlIl[lIlIIlIlll[77]]) ? 1 : 0) && lIIIllIIllIIl(world.getActivity().startsWith(lIlIIlIlIl[lIlIIlIlll[78]]) ? 1 : 0) && lIIIllIIllIIl(world.getActivity().startsWith(lIlIIlIlIl[lIlIIlIlll[71]]) ? 1 : 0) && lIIIllIlIIIIl(world.getId(), lIlIIlIlll[79]) && lIIIllIlIIIIl(world.getId(), lIlIIlIlll[80]) && lIIIllIlIIIIl(world.getId(), lIlIIlIlll[80]) && lIIIllIIllIIl(world.getActivity().contains(lIlIIlIlIl[lIlIIlIlll[81]]) ? 1 : 0) && lIIIllIIllIIl(world.getActivity().contains(lIlIIlIlIl[lIlIIlIlll[82]]) ? 1 : 0) && lIIIllIIllIIl(world.getActivity().contains(lIlIIlIlIl[lIlIIlIlll[83]]) ? 1 : 0) && lIIIllIIllIIl(world.getActivity().startsWith(lIlIIlIlIl[lIlIIlIlll[84]]) ? 1 : 0) && lIIIllIIllIIl(world.getActivity().endsWith(lIlIIlIlIl[lIlIIlIlll[85]]) ? 1 : 0) && lIIIllIIllIIl(world.getActivity().endsWith(lIlIIlIlIl[lIlIIlIlll[86]]) ? 1 : 0) && lIIIllIIllIIl(world.getActivity().endsWith(lIlIIlIlIl[lIlIIlIlll[87]]) ? 1 : 0) && lIIIllIIllIIl(world.getActivity().startsWith(lIlIIlIlIl[lIlIIlIlll[88]]) ? 1 : 0) && lIIIllIIlllIl(world.getPlayerCount(), lIlIIlIlll[89])) {
                ?? r0 = lIlIIlIlll[0];
                "".length();
                return (-(88 ^ 92)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIlIlll[2];
        }));
    }

    static {
        lIIIllIIllIII();
        lIIIllIIIlIII();
        Q = lIlIIlIlIl[lIlIIlIlll[91]];
        R = ThreadLocalRandom.current();
        S = new WorldArea(lIlIIlIlll[92], lIlIIlIlll[93], lIlIIlIlll[71], lIlIIlIlll[77], lIlIIlIlll[2]);
        T = new WorldArea(lIlIIlIlll[94], lIlIIlIlll[95], lIlIIlIlll[26], lIlIIlIlll[54], lIlIIlIlll[0]);
        U = System.currentTimeMillis();
        V = System.nanoTime();
        W = new HashMap();
        X = new WorldPoint(lIlIIlIlll[96], lIlIIlIlll[97], lIlIIlIlll[2]);
        int[] iArr = new int[lIlIIlIlll[98]];
        iArr[lIlIIlIlll[2]] = lIlIIlIlll[99];
        iArr[lIlIIlIlll[0]] = lIlIIlIlll[100];
        iArr[lIlIIlIlll[3]] = lIlIIlIlll[101];
        iArr[lIlIIlIlll[1]] = lIlIIlIlll[102];
        iArr[lIlIIlIlll[4]] = lIlIIlIlll[103];
        iArr[lIlIIlIlll[5]] = lIlIIlIlll[104];
        iArr[lIlIIlIlll[6]] = lIlIIlIlll[105];
        iArr[lIlIIlIlll[7]] = lIlIIlIlll[106];
        iArr[lIlIIlIlll[8]] = lIlIIlIlll[107];
        iArr[lIlIIlIlll[9]] = lIlIIlIlll[108];
        iArr[lIlIIlIlll[10]] = lIlIIlIlll[109];
        iArr[lIlIIlIlll[11]] = lIlIIlIlll[110];
        iArr[lIlIIlIlll[12]] = lIlIIlIlll[111];
        iArr[lIlIIlIlll[13]] = lIlIIlIlll[112];
        iArr[lIlIIlIlll[16]] = lIlIIlIlll[113];
        iArr[lIlIIlIlll[17]] = lIlIIlIlll[114];
        iArr[lIlIIlIlll[23]] = lIlIIlIlll[115];
        iArr[lIlIIlIlll[24]] = lIlIIlIlll[116];
        iArr[lIlIIlIlll[27]] = lIlIIlIlll[117];
        iArr[lIlIIlIlll[29]] = lIlIIlIlll[118];
        iArr[lIlIIlIlll[30]] = lIlIIlIlll[119];
        iArr[lIlIIlIlll[33]] = lIlIIlIlll[120];
        iArr[lIlIIlIlll[36]] = lIlIIlIlll[121];
        iArr[lIlIIlIlll[26]] = lIlIIlIlll[122];
        iArr[lIlIIlIlll[37]] = lIlIIlIlll[123];
        iArr[lIlIIlIlll[38]] = lIlIIlIlll[124];
        iArr[lIlIIlIlll[39]] = lIlIIlIlll[125];
        iArr[lIlIIlIlll[40]] = lIlIIlIlll[126];
        iArr[lIlIIlIlll[41]] = lIlIIlIlll[127];
        iArr[lIlIIlIlll[15]] = lIlIIlIlll[128];
        iArr[lIlIIlIlll[54]] = lIlIIlIlll[129];
        iArr[lIlIIlIlll[55]] = lIlIIlIlll[130];
        iArr[lIlIIlIlll[35]] = lIlIIlIlll[131];
        iArr[lIlIIlIlll[56]] = lIlIIlIlll[132];
        iArr[lIlIIlIlll[57]] = lIlIIlIlll[133];
        iArr[lIlIIlIlll[47]] = lIlIIlIlll[134];
        iArr[lIlIIlIlll[60]] = lIlIIlIlll[135];
        iArr[lIlIIlIlll[61]] = lIlIIlIlll[136];
        iArr[lIlIIlIlll[65]] = lIlIIlIlll[137];
        iArr[lIlIIlIlll[66]] = lIlIIlIlll[138];
        iArr[lIlIIlIlll[21]] = lIlIIlIlll[139];
        iArr[lIlIIlIlll[32]] = lIlIIlIlll[140];
        iArr[lIlIIlIlll[67]] = lIlIIlIlll[141];
        iArr[lIlIIlIlll[68]] = lIlIIlIlll[142];
        iArr[lIlIIlIlll[69]] = lIlIIlIlll[143];
        iArr[lIlIIlIlll[70]] = lIlIIlIlll[144];
        iArr[lIlIIlIlll[74]] = lIlIIlIlll[145];
        iArr[lIlIIlIlll[76]] = lIlIIlIlll[146];
        iArr[lIlIIlIlll[77]] = lIlIIlIlll[147];
        iArr[lIlIIlIlll[78]] = lIlIIlIlll[148];
        iArr[lIlIIlIlll[71]] = lIlIIlIlll[149];
        iArr[lIlIIlIlll[81]] = lIlIIlIlll[150];
        iArr[lIlIIlIlll[82]] = lIlIIlIlll[151];
        iArr[lIlIIlIlll[83]] = lIlIIlIlll[152];
        iArr[lIlIIlIlll[84]] = lIlIIlIlll[153];
        iArr[lIlIIlIlll[85]] = lIlIIlIlll[154];
        iArr[lIlIIlIlll[86]] = lIlIIlIlll[155];
        iArr[lIlIIlIlll[87]] = lIlIIlIlll[156];
        iArr[lIlIIlIlll[88]] = lIlIIlIlll[157];
        iArr[lIlIIlIlll[90]] = lIlIIlIlll[158];
        iArr[lIlIIlIlll[91]] = lIlIIlIlll[159];
        iArr[lIlIIlIlll[20]] = lIlIIlIlll[160];
        iArr[lIlIIlIlll[161]] = lIlIIlIlll[162];
        iArr[lIlIIlIlll[163]] = lIlIIlIlll[164];
        iArr[lIlIIlIlll[165]] = lIlIIlIlll[166];
        iArr[lIlIIlIlll[167]] = lIlIIlIlll[168];
        iArr[lIlIIlIlll[169]] = lIlIIlIlll[170];
        iArr[lIlIIlIlll[171]] = lIlIIlIlll[172];
        iArr[lIlIIlIlll[173]] = lIlIIlIlll[174];
        iArr[lIlIIlIlll[175]] = lIlIIlIlll[176];
        iArr[lIlIIlIlll[177]] = lIlIIlIlll[178];
        iArr[lIlIIlIlll[50]] = lIlIIlIlll[179];
        iArr[lIlIIlIlll[180]] = lIlIIlIlll[181];
        iArr[lIlIIlIlll[182]] = lIlIIlIlll[183];
        iArr[lIlIIlIlll[184]] = lIlIIlIlll[185];
        iArr[lIlIIlIlll[186]] = lIlIIlIlll[187];
        iArr[lIlIIlIlll[188]] = lIlIIlIlll[189];
        iArr[lIlIIlIlll[190]] = lIlIIlIlll[191];
        iArr[lIlIIlIlll[192]] = lIlIIlIlll[193];
        iArr[lIlIIlIlll[194]] = lIlIIlIlll[195];
        iArr[lIlIIlIlll[196]] = lIlIIlIlll[197];
        iArr[lIlIIlIlll[198]] = lIlIIlIlll[199];
        iArr[lIlIIlIlll[200]] = lIlIIlIlll[201];
        iArr[lIlIIlIlll[202]] = lIlIIlIlll[203];
        iArr[lIlIIlIlll[204]] = lIlIIlIlll[205];
        iArr[lIlIIlIlll[206]] = lIlIIlIlll[207];
        iArr[lIlIIlIlll[208]] = lIlIIlIlll[209];
        iArr[lIlIIlIlll[210]] = lIlIIlIlll[211];
        iArr[lIlIIlIlll[212]] = lIlIIlIlll[213];
        iArr[lIlIIlIlll[214]] = lIlIIlIlll[215];
        iArr[lIlIIlIlll[216]] = lIlIIlIlll[217];
        iArr[lIlIIlIlll[218]] = lIlIIlIlll[219];
        iArr[lIlIIlIlll[220]] = lIlIIlIlll[221];
        iArr[lIlIIlIlll[222]] = lIlIIlIlll[223];
        iArr[lIlIIlIlll[224]] = lIlIIlIlll[225];
        iArr[lIlIIlIlll[226]] = lIlIIlIlll[227];
        iArr[lIlIIlIlll[228]] = lIlIIlIlll[229];
        iArr[lIlIIlIlll[230]] = lIlIIlIlll[231];
        iArr[lIlIIlIlll[232]] = lIlIIlIlll[233];
        iArr[lIlIIlIlll[234]] = lIlIIlIlll[235];
        iArr[lIlIIlIlll[89]] = lIlIIlIlll[236];
        iArr[lIlIIlIlll[73]] = lIlIIlIlll[237];
        iArr[lIlIIlIlll[238]] = lIlIIlIlll[239];
        iArr[lIlIIlIlll[240]] = lIlIIlIlll[241];
        iArr[lIlIIlIlll[242]] = lIlIIlIlll[243];
        iArr[lIlIIlIlll[244]] = lIlIIlIlll[245];
        iArr[lIlIIlIlll[246]] = lIlIIlIlll[247];
        Y = iArr;
        Z = new WorldPoint(lIlIIlIlll[248], lIlIIlIlll[249], lIlIIlIlll[3]);
        aa = new WorldArea(lIlIIlIlll[250], lIlIIlIlll[251], lIlIIlIlll[56], lIlIIlIlll[36], lIlIIlIlll[2]);
    }

    public static String b(long j) {
        String str = lIlIIlIlIl[lIlIIlIlll[11]];
        Object[] objArr = new Object[lIlIIlIlll[0]];
        objArr[lIlIIlIlll[2]] = Integer.valueOf(lIlIIlIlll[3]);
        String format = String.format(str, objArr);
        long j2 = j / 1000;
        Object[] objArr2 = new Object[lIlIIlIlll[0]];
        objArr2[lIlIIlIlll[2]] = Long.valueOf(j2 % 60);
        String format2 = String.format(format, objArr2);
        Object[] objArr3 = new Object[lIlIIlIlll[0]];
        objArr3[lIlIIlIlll[2]] = Long.valueOf((j2 % 3600) / 60);
        String format3 = String.format(format, objArr3);
        Object[] objArr4 = new Object[lIlIIlIlll[0]];
        objArr4[lIlIIlIlll[2]] = Long.valueOf(j2 / 3600);
        return String.format(format, objArr4) + ":" + format3 + ":" + format2;
    }

    public static long a(long j) {
        return s() - j;
    }

    public static void a(HashMap<Integer, Integer> hashMap, boolean z, boolean z2) {
        int i;
        if (lIIIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(X), lIlIIlIlll[4])) {
            AccBuilderShamans.c = lIlIIlIlIl[lIlIIlIlll[17]];
            WorldArea worldArea = new WorldArea(lIlIIlIlll[18], lIlIIlIlll[19], lIlIIlIlll[20], lIlIIlIlll[21], lIlIIlIlll[2]);
            int[] iArr = new int[lIlIIlIlll[0]];
            iArr[lIlIIlIlll[2]] = lIlIIlIlll[22];
            boolean contains = Inventory.contains(iArr);
            if (lIIIllIIllIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                i = lIlIIlIlll[0];
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            } else {
                i = lIlIIlIlll[2];
            }
            if (lIIIllIIllIll((contains ? 1 : 0) & i)) {
                int[] iArr2 = new int[lIlIIlIlll[0]];
                iArr2[lIlIIlIlll[2]] = lIlIIlIlll[22];
                Inventory.getFirst(iArr2).interact(lIlIIlIlIl[lIlIIlIlll[23]]);
                Time.sleepTicks(lIlIIlIlll[8]);
                "".length();
            }
            Movement.walkTo(X);
            "".length();
            Time.sleepTicks(lIlIIlIlll[0]);
            "".length();
        }
        if (lIIIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(X), lIlIIlIlll[4])) {
            if (lIIIllIIllIIl(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
            }
            AccBuilderShamans.c = lIlIIlIlIl[lIlIIlIlll[24]];
            if (lIIIllIIllIll(z ? 1 : 0) && lIIIllIlIIIll(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks(lIlIIlIlll[4]);
                "".length();
            }
            if (lIIIllIIllIll(z2 ? 1 : 0) && lIIIllIlIIIll(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks(lIlIIlIlll[3]);
                "".length();
            }
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                int intValue = entry.getKey().intValue();
                int llllllllllllllllllllIIIlllIlllll = entry.getValue().intValue();
                System.out.println("Key: " + intValue + ", Value: " + llllllllllllllllllllIIIlllIlllll);
                C0000a.a(intValue, llllllllllllllllllllIIIlllIlllll);
                Time.sleepTicks(lIlIIlIlll[0]);
                "".length();
                "".length();
                if ((124 ^ 120) <= (-" ".length())) {
                    return;
                }
            }
        }
    }

    public static int c(int i, int i2) {
        int i3 = i2 - i;
        if (lIIIllIIllIIl(i3)) {
            return i;
        }
        if (lIIIllIIllIlI(Math.abs(i3), lIlIIlIlll[0])) {
            if (lIIIllIIllIll(R.nextBoolean() ? 1 : 0)) {
                "".length();
                return "  ".length() > "  ".length() ? (97 ^ 53) & ((144 ^ 196) ^ (-1)) : i;
            }
            return i2;
        }
        if (lIIIllIIlllII(i3)) {
            i = i2;
            i2 = i;
        }
        return i + R.nextInt((i2 - i) + lIlIIlIlll[0]);
    }

    private static boolean lIIIllIlIIIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIllIIlllIl(int i, int i2) {
        return i > i2;
    }

    public static int H() {
        return j(lIlIIlIlll[73]);
    }

    private static boolean lIIIllIlIIIll(int i) {
        return i > 0;
    }

    private static boolean lIIIllIIllIll(int i) {
        return i != 0;
    }

    public static void v() {
        if (lIIIllIIllIll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks(lIlIIlIlll[4]);
            "".length();
        }
        if (lIIIllIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIllIIllIIl(Bank.isOpen() ? 1 : 0)) {
            B();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean b(int[] iArr) {
        int i = lIlIIlIlll[2];
        while (lIIIllIlIIIII(i, iArr.length)) {
            if (lIIIllIIllIIl(i(iArr[i]) ? 1 : 0)) {
                System.out.println("Missing ID: " + iArr[i]);
                return lIlIIlIlll[2];
            }
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((221 ^ 173) ^ (73 ^ 121)) & (((28 ^ 113) ^ (18 ^ 63)) ^ (-" ".length()));
            }
        }
        return lIlIIlIlll[0];
    }

    public static int j(int i) {
        return ((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarpValue(i));
        })).intValue();
    }

    private static String lIIIllIIIIllI(String llllllllllllllllllllIIIllIIlIIll, String llllllllllllllllllllIIIllIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIIllIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIIIllIIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIIIllIIlIlIl.init(lIlIIlIlll[3], secretKeySpec);
            return new String(llllllllllllllllllllIIIllIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIIllIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIIllIIlIlII) {
            llllllllllllllllllllIIIllIIlIlII.printStackTrace();
            return null;
        }
    }

    public static void A() {
        Widget widget = Widgets.get(lIlIIlIlll[34], lIlIIlIlll[35]);
        if (lIIIllIIlllll(widget)) {
            widget.interact(lIlIIlIlIl[lIlIIlIlll[36]]);
            Time.sleepTicks(lIlIIlIlll[0]);
            "".length();
        }
    }

    public static void l(int i) {
        int[] iArr = new int[lIlIIlIlll[0]];
        iArr[lIlIIlIlll[2]] = i;
        if (lIIIllIIllIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIIlIlll[0]];
            iArr2[lIlIIlIlll[2]] = i;
            if (lIIIllIIllIIl(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIlIIlIlll[0]];
                iArr3[lIlIIlIlll[2]] = i;
                Item first = Inventory.getFirst(iArr3);
                String[] strArr = new String[lIlIIlIlll[0]];
                strArr[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[26]];
                if (lIIIllIIllIll(first.hasAction(strArr) ? 1 : 0)) {
                    int[] iArr4 = new int[lIlIIlIlll[0]];
                    iArr4[lIlIIlIlll[2]] = i;
                    Inventory.getFirst(iArr4).interact(lIlIIlIlIl[lIlIIlIlll[37]]);
                }
                int[] iArr5 = new int[lIlIIlIlll[0]];
                iArr5[lIlIIlIlll[2]] = i;
                Item first2 = Inventory.getFirst(iArr5);
                String[] strArr2 = new String[lIlIIlIlll[0]];
                strArr2[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[38]];
                if (lIIIllIIllIll(first2.hasAction(strArr2) ? 1 : 0)) {
                    int[] iArr6 = new int[lIlIIlIlll[0]];
                    iArr6[lIlIIlIlll[2]] = i;
                    Inventory.getFirst(iArr6).interact(lIlIIlIlIl[lIlIIlIlll[39]]);
                }
                int[] iArr7 = new int[lIlIIlIlll[0]];
                iArr7[lIlIIlIlll[2]] = i;
                Item first3 = Inventory.getFirst(iArr7);
                String[] strArr3 = new String[lIlIIlIlll[0]];
                strArr3[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[40]];
                if (lIIIllIIllIll(first3.hasAction(strArr3) ? 1 : 0)) {
                    int[] iArr8 = new int[lIlIIlIlll[0]];
                    iArr8[lIlIIlIlll[2]] = i;
                    Inventory.getFirst(iArr8).interact(lIlIIlIlIl[lIlIIlIlll[41]]);
                }
                if (lIIIllIIllIlI(i, lIlIIlIlll[42])) {
                    Time.sleepTicks(lIlIIlIlll[1]);
                    "".length();
                    String[] strArr4 = new String[lIlIIlIlll[0]];
                    strArr4[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[15]];
                    C0006g.a(strArr4);
                    Time.sleepTicks(lIlIIlIlll[0]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIIllIIlllII(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean z() {
        if (lIIIllIIlllll(Widgets.get(lIlIIlIlll[25], lIlIIlIlll[0]))) {
            ?? r0 = lIlIIlIlll[0];
            "".length();
            return "   ".length() >= (171 ^ 175) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIlIlll[2];
    }

    private static boolean lIIIllIIllIIl(int i) {
        return i == 0;
    }

    public static String h(int i) {
        return NumberFormat.getNumberInstance(Locale.US).format(i);
    }

    private static boolean lIIIllIIlllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    public static void E() {
        int llllllllllllllllllllIIIllIlIIlII = lIlIIlIlll[2];
        do {
            String[] strArr = new String[lIlIIlIlll[0]];
            strArr[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[21]];
            if (!lIIIllIIlllll(TileObjects.getNearest(strArr)) || !lIIIllIIllIIl(AccBuilderShamans.d ? 1 : 0)) {
                return;
            }
            AccBuilderShamans.c = lIlIIlIlIl[lIlIIlIlll[32]];
            String[] strArr2 = new String[lIlIIlIlll[0]];
            strArr2[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[67]];
            NPC nearest = NPCs.getNearest(strArr2);
            if (lIIIllIIllIIl(llllllllllllllllllllIIIllIlIIlII)) {
                if (lIIIllIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                    nearest.interact(lIlIIlIlIl[lIlIIlIlll[68]]);
                }
                if (lIIIllIIllIll(Dialog.isOpen() ? 1 : 0)) {
                    if (lIIIllIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && lIIIllIIllIIl(Dialog.canContinue() ? 1 : 0)) {
                        List options = Dialog.getOptions();
                        if (lIIIllIIllIIl(options.isEmpty() ? 1 : 0)) {
                            List list = (List) options.stream().filter(widget -> {
                                if (lIIIllIIllIIl(widget.getText().contains(lIlIIlIlIl[lIlIIlIlll[74]]) ? 1 : 0)) {
                                    ?? r0 = lIlIIlIlll[0];
                                    "".length();
                                    return (-((((66 + 33) - (-60)) + 34) ^ (((143 + 191) - 162) + 24))) >= 0 ? ((129 ^ 183) ^ (189 ^ 192)) & (((59 ^ 39) ^ (223 ^ 136)) ^ (-" ".length())) : r0;
                                }
                                return lIlIIlIlll[2];
                            }).collect(Collectors.toList());
                            if (lIIIllIIllIIl(list.isEmpty() ? 1 : 0)) {
                                Mouse.click(((Widget) list.get(lIlIIlIlll[2])).getClickPoint().getX(), ((Widget) list.get(lIlIIlIlll[2])).getClickPoint().getY(), (boolean) lIlIIlIlll[0]);
                                Time.sleepTicks(lIlIIlIlll[1]);
                                "".length();
                            }
                            if (lIIIllIIllIlI(list.size(), lIlIIlIlll[0])) {
                                llllllllllllllllllllIIIllIlIIlII = lIlIIlIlll[0];
                            }
                        }
                    }
                    if (!lIIIllIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || lIIIllIIllIll(Dialog.canContinue() ? 1 : 0)) {
                        Dialog.continueSpace();
                    }
                }
            }
            if (lIIIllIIllIll(llllllllllllllllllllIIIllIlIIlII)) {
                String[] strArr3 = new String[lIlIIlIlll[0]];
                strArr3[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[69]];
                TileObjects.getNearest(strArr3).interact(lIlIIlIlIl[lIlIIlIlll[70]]);
                Time.sleepTicks(lIlIIlIlll[5]);
                "".length();
            }
            Time.sleepTicks(lIlIIlIlll[0]);
            "".length();
            "".length();
        } while ((-" ".length()) < "  ".length());
    }

    public static void k(int i) {
        if (lIIIllIlIIIIl(Static.getClient().getWorld(), i)) {
            World findWorld = Static.getWorldService().getWorlds().findWorld(i);
            if (lIIIllIlIIIlI(findWorld)) {
                return;
            }
            if (lIIIllIIllIll(Dialog.isOpen() ? 1 : 0)) {
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

    private static String lIIIllIIIIlIl(String llllllllllllllllllllIIIllIIIIIll, String llllllllllllllllllllIIIllIIIIIlI) {
        String llllllllllllllllllllIIIllIIIIIll2 = new String(Base64.getDecoder().decode(llllllllllllllllllllIIIllIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIIIllIIIIIIl = new StringBuilder();
        char[] llllllllllllllllllllIIIllIIIIIII = llllllllllllllllllllIIIllIIIIIlI.toCharArray();
        int llllllllllllllllllllIIIlIlllllll = lIlIIlIlll[2];
        char[] charArray = llllllllllllllllllllIIIllIIIIIll2.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIlll[2];
        while (lIIIllIlIIIII(i, length)) {
            char llllllllllllllllllllIIIllIIIIlII = charArray[i];
            llllllllllllllllllllIIIllIIIIIIl.append((char) (llllllllllllllllllllIIIllIIIIlII ^ llllllllllllllllllllIIIllIIIIIII[llllllllllllllllllllIIIlIlllllll % llllllllllllllllllllIIIllIIIIIII.length]));
            "".length();
            llllllllllllllllllllIIIlIlllllll++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllllIIIllIIIIIIl);
    }

    private static void lIIIllIIIlIII() {
        lIlIIlIlIl = new String[lIlIIlIlll[20]];
        lIlIIlIlIl[lIlIIlIlll[2]] = lIIIllIIIIlIl("Pwc9cAIeRj01GQI=", "qfKPv");
        lIlIIlIlIl[lIlIIlIlll[0]] = lIIIllIIIIlIl("IxEXAwIOUA8CARhQGg8PHw==", "kpygn");
        lIlIIlIlIl[lIlIIlIlll[3]] = lIIIllIIIIllI("MKXI8bCYJ9Z2qMApL6nOr9TdpHDbntrS", "OhFsZ");
        lIlIIlIlIl[lIlIIlIlll[1]] = lIIIllIIIIlIl("Bg0HI3EGCwY0MCQLGT4kJQ==", "VbuWQ");
        lIlIIlIlIl[lIlIIlIlll[4]] = lIIIllIIIIlll("NWkgW33cDN2DNA8wTvVwpGRp2j/+PkeN", "qagJF");
        lIlIIlIlIl[lIlIIlIlll[5]] = lIIIllIIIIlll("ODEHj39IILs=", "oZEUn");
        lIlIIlIlIl[lIlIIlIlll[6]] = lIIIllIIIIlll("o1kCCj5bsZrjy9SvPmNo2LAGu6Qmq4t+", "IfzcM");
        lIlIIlIlIl[lIlIIlIlll[7]] = lIIIllIIIIlll("amRyhauF2sxr/vkUskdZmbgr7ottbZYD", "bkigI");
        lIlIIlIlIl[lIlIIlIlll[8]] = lIIIllIIIIllI("Iqm2qtT6MBHV55deEMJuw3e+CsVVSq6O", "zKJbF");
        lIlIIlIlIl[lIlIIlIlll[9]] = lIIIllIIIIlIl("ETwwFmQROjEBJTM6LgsxMg==", "ASBbD");
        lIlIIlIlIl[lIlIIlIlll[10]] = lIIIllIIIIlll("mRfJ+P2s11zx9fjKZDJjC6BgvdTAX7qh", "KIZWF");
        lIlIIlIlIl[lIlIIlIlll[11]] = lIIIllIIIIlll("I/SexkIu/SQ=", "fvRSR");
        lIlIIlIlIl[lIlIIlIlll[12]] = lIIIllIIIIlll("cUq9CPLIQifwvqytNnJi0PbcjuTTJRVEVEievZLvQTXukN+gOcDmFB+jZ+TxgTMiEK3ClirlL1c=", "qszmy");
        lIlIIlIlIl[lIlIIlIlll[13]] = lIIIllIIIIllI("dy0xxp+e8xI5VZ0KjysFbg==", "yLRRC");
        lIlIIlIlIl[lIlIIlIlll[16]] = lIIIllIIIIlll("aeXF/02HGSg=", "Hafyu");
        lIlIIlIlIl[lIlIIlIlll[17]] = lIIIllIIIIlIl("OhEaZQ0bUDokCwYfDy5ZI1AOJBcf", "tplEy");
        lIlIIlIlIl[lIlIIlIlll[23]] = lIIIllIIIIlll("/r6HoitVQik=", "MFFeg");
        lIlIIlIlIl[lIlIIlIlll[24]] = lIIIllIIIIllI("7eVQX0zWhlMHHaYPYlZGjQQNYQJf/mKk", "kXLIQ");
        lIlIIlIlIl[lIlIIlIlll[27]] = lIIIllIIIIlll("PnEpKN1iFR8AGb7G84Opgg==", "tyWzG");
        lIlIIlIlIl[lIlIIlIlll[29]] = lIIIllIIIIlll("ZySHdHpyfxg=", "wgqXo");
        lIlIIlIlIl[lIlIIlIlll[30]] = lIIIllIIIIlIl("NwIGKQMG", "cmaNo");
        lIlIIlIlIl[lIlIIlIlll[33]] = lIIIllIIIIlll("GPlG16XUJhA=", "jreBQ");
        lIlIIlIlIl[lIlIIlIlll[36]] = lIIIllIIIIllI("PjCg7vci/0JgyMfo2YwafA==", "eJEJK");
        lIlIIlIlIl[lIlIIlIlll[26]] = lIIIllIIIIllI("Rojieo/qyPk=", "pCUiu");
        lIlIIlIlIl[lIlIIlIlll[37]] = lIIIllIIIIlIl("LzAKIQ==", "xUkSN");
        lIlIIlIlIl[lIlIIlIlll[38]] = lIIIllIIIIlIl("DQ4RJQk=", "ZgtIm");
        lIlIIlIlIl[lIlIIlIlll[39]] = lIIIllIIIIlIl("MQw3LjE=", "feRBU");
        lIlIIlIlIl[lIlIIlIlll[40]] = lIIIllIIIIlll("xxcJhZDfdjM=", "ozHaX");
        lIlIIlIlIl[lIlIIlIlll[41]] = lIIIllIIIIlll("bjOCsdYG3G0=", "TYTwb");
        lIlIIlIlIl[lIlIIlIlll[15]] = lIIIllIIIIlll("q9Gs+CzxXaAC8kA9fTZamnOrATbPgjs3", "NVxsP");
        lIlIIlIlIl[lIlIIlIlll[54]] = lIIIllIIIIlll("ujP7WfwIAbPLQvsbeiVx+NWeCDFtqC2G", "IajzN");
        lIlIIlIlIl[lIlIIlIlll[55]] = lIIIllIIIIlll("AU7evr0bG7o=", "LaeDq");
        lIlIIlIlIl[lIlIIlIlll[35]] = lIIIllIIIIlIl("ABg0Nw==", "OhQYn");
        lIlIIlIlIl[lIlIIlIlll[56]] = lIIIllIIIIlll("kuXlLH/W0fTh/8mbLHQUqwB6xDY9gpR5", "YYzDa");
        lIlIIlIlIl[lIlIIlIlll[57]] = lIIIllIIIIlIl("OjcyYTcbdjc1MRs4IyksGDJkNSoYMw==", "tVDAC");
        lIlIIlIlIl[lIlIIlIlll[47]] = lIIIllIIIIlll("d4rAKB4B2EE=", "BHEmd");
        lIlIIlIlIl[lIlIIlIlll[60]] = lIIIllIIIIlll("gf+qOmnfxcoE2UQvtu2t0g==", "dGyDK");
        lIlIIlIlIl[lIlIIlIlll[61]] = lIIIllIIIIllI("V7yWp5rBrC1BtpNnTO9Jp3sAuF9EgH5J", "hLSZz");
        lIlIIlIlIl[lIlIIlIlll[65]] = lIIIllIIIIlIl("Fhw6GXglDDoXND4IOhM=", "WiNvX");
        lIlIIlIlIl[lIlIIlIlll[66]] = lIIIllIIIIlIl("EgEHPUYhEQczCjoVBzc=", "StsRf");
        lIlIIlIlIl[lIlIIlIlll[21]] = lIIIllIIIIlll("QhZS3bufqnBrwJ8PAQxVgg==", "xOCKs");
        lIlIIlIlIl[lIlIIlIlll[32]] = lIIIllIIIIlIl("KTQYLyoIOxFrIgQ0AiM=", "aUvKF");
        lIlIIlIlIl[lIlIIlIlll[67]] = lIIIllIIIIlll("cYfiilN/eGA=", "gdSVU");
        lIlIIlIlIl[lIlIIlIlll[68]] = lIIIllIIIIllI("GUQ/NR+Q8Bs=", "RXcaR");
        lIlIIlIlIl[lIlIIlIlll[69]] = lIIIllIIIIlll("U+mEJP+TIA4=", "zUUCq");
        lIlIIlIlIl[lIlIIlIlll[70]] = lIIIllIIIIlIl("FyMW", "BPsTc");
        lIlIIlIlIl[lIlIIlIlll[74]] = lIIIllIIIIlll("POCNcZYNAi4=", "FcORQ");
        lIlIIlIlIl[lIlIIlIlll[76]] = lIIIllIIIIlll("jC+H0wIqcQQ=", "bMChX");
        lIlIIlIlIl[lIlIIlIlll[77]] = lIIIllIIIIlIl("CTgd", "YNMfi");
        lIlIIlIlIl[lIlIIlIlll[78]] = lIIIllIIIIlIl("FzMy", "GEbFx");
        lIlIIlIlIl[lIlIIlIlll[71]] = lIIIllIIIIlll("u8+FTo5ZKx0=", "SWsgY");
        lIlIIlIlIl[lIlIIlIlll[81]] = lIIIllIIIIlIl("CAYUNCUhEA==", "DcuSP");
        lIlIIlIlIl[lIlIIlIlll[82]] = lIIIllIIIIllI("VQRER8HeEA8=", "EQTxI");
        lIlIIlIlIl[lIlIIlIlll[83]] = lIIIllIIIIlIl("DC8OCw==", "nJzjY");
        lIlIIlIlIl[lIlIIlIlll[84]] = lIIIllIIIIlIl("CQgFLgIsAw==", "MmdJo");
        lIlIIlIlIl[lIlIIlIlll[85]] = lIIIllIIIIlIl("FgIlMjczCQ==", "RgDVZ");
        lIlIIlIlIl[lIlIIlIlll[86]] = lIIIllIIIIllI("Le8UYPP6aeSY6qYBtNphnw==", "PHifJ");
        lIlIIlIlIl[lIlIIlIlll[87]] = lIIIllIIIIlIl("BxwmFSg=", "ssRtD");
        lIlIIlIlIl[lIlIIlIlll[88]] = lIIIllIIIIllI("srsMn9IjmIs=", "PJLqe");
        lIlIIlIlIl[lIlIIlIlll[90]] = lIIIllIIIIlIl("JgodIlImDBw1EwQMAz8HBQ==", "veoVr");
        lIlIIlIlIl[lIlIIlIlll[91]] = lIIIllIIIIlIl("CFklPDEuEQo1DCIAEjUDOxM9CDYqPysGIyYKFw4eZRcLACAkFyUuLS8QNBwuLj8UHC4uTQ0RNg==", "KcyiB");
    }

    public static int t() {
        return Y[c(lIlIIlIlll[2], Y.length - lIlIIlIlll[0])];
    }

    public static void c(WorldPoint worldPoint) {
        int i;
        int i2;
        Client client = Static.getClient();
        if (lIIIllIlIIIlI(client.getLocalPlayer())) {
            return;
        }
        int x = worldPoint.getX() - client.getBaseX();
        int y = worldPoint.getY() - client.getBaseY();
        Point localToCanvas = Perspective.localToCanvas(client, LocalPoint.fromScene(x, y), client.getPlane());
        if (lIIIllIIlllll(localToCanvas)) {
            i = localToCanvas.getX();
            "".length();
            if ("   ".length() == (((160 ^ 152) ^ (121 ^ 126)) & (((74 ^ 65) ^ (133 ^ 177)) ^ (-" ".length())))) {
                return;
            }
        } else {
            i = lIlIIlIlll[62];
        }
        int i3 = i;
        if (lIIIllIIlllll(localToCanvas)) {
            i2 = localToCanvas.getY();
            "".length();
            if ((-((((119 + 104) - 170) + 115) ^ (((88 + 18) - (-25)) + 41))) > 0) {
                return;
            }
        } else {
            i2 = lIlIIlIlll[62];
        }
        client.interact(lIlIIlIlll[2], MenuAction.WALK.getId(), x, y, i3, i2);
    }

    public static void C() {
        if (lIIIllIIllIIl(j(lIlIIlIlll[63]))) {
            if (lIIIllIIllIIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lIlIIlIlll[0]);
                "".length();
            }
            if (lIIIllIIllIll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lIlIIlIlll[64], lIlIIlIlll[54]);
                if (lIIIllIIlllll(widget)) {
                    widget.interact(lIlIIlIlIl[lIlIIlIlll[65]]);
                    Time.sleepTicks(lIlIIlIlll[0]);
                    "".length();
                }
            }
        }
    }

    public static void a(WorldPoint worldPoint) {
        if (lIIIllIIllIIl(C0014o.cz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(C0014o.cv), lIlIIlIlll[1])) {
                AccBuilderShamans.c = lIlIIlIlIl[lIlIIlIlll[2]];
                Movement.walkTo(C0014o.cv);
                "".length();
                Time.sleepTicks(lIlIIlIlll[0]);
                "".length();
            }
            if (lIIIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(C0014o.cv), lIlIIlIlll[1])) {
                AccBuilderShamans.c = lIlIIlIlIl[lIlIIlIlll[0]];
                if (lIIIllIIllIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                NPC nearest = NPCs.getNearest(npc -> {
                    String[] strArr = new String[lIlIIlIlll[0]];
                    strArr[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[90]];
                    return npc.hasAction(strArr);
                });
                if (lIIIllIIlllll(nearest)) {
                    String[] strArr = new String[lIlIIlIlll[0]];
                    strArr[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[3]];
                    if (lIIIllIIllIll(nearest.hasAction(strArr) ? 1 : 0)) {
                        nearest.interact(lIlIIlIlIl[lIlIIlIlll[1]]);
                        Time.sleepTicks(lIlIIlIlll[1]);
                        "".length();
                    }
                    String[] strArr2 = new String[lIlIIlIlll[0]];
                    strArr2[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[4]];
                    if (lIIIllIIllIIl(nearest.hasAction(strArr2) ? 1 : 0)) {
                        C0006g.b(lIlIIlIlIl[lIlIIlIlll[5]], C0014o.cy);
                        Time.sleepTicks(lIlIIlIlll[0]);
                        "".length();
                    }
                }
                String[] strArr3 = new String[lIlIIlIlll[0]];
                strArr3[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[6]];
                NPC nearest2 = NPCs.getNearest(strArr3);
                if (lIIIllIIlllll(nearest2)) {
                    String[] strArr4 = new String[lIlIIlIlll[0]];
                    strArr4[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[7]];
                    if (lIIIllIIllIll(nearest2.hasAction(strArr4) ? 1 : 0)) {
                        nearest2.interact(lIlIIlIlIl[lIlIIlIlll[8]]);
                        Time.sleepTicks(lIlIIlIlll[1]);
                        "".length();
                    }
                    String[] strArr5 = new String[lIlIIlIlll[0]];
                    strArr5[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[9]];
                    if (lIIIllIIllIIl(nearest2.hasAction(strArr5) ? 1 : 0)) {
                        C0006g.b(lIlIIlIlIl[lIlIIlIlll[10]], C0014o.cy);
                        Time.sleepTicks(lIlIIlIlll[0]);
                        "".length();
                    }
                }
            }
        }
        if (lIIIllIIllIll(C0014o.cz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIlIIlIlll[0]);
            "".length();
        }
    }

    private static boolean lIIIllIlIIIlI(Object obj) {
        return obj == null;
    }

    private static String lIIIllIIIIlll(String llllllllllllllllllllIIIlIllIlllI, String llllllllllllllllllllIIIlIllIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIIlIllIllIl.getBytes(StandardCharsets.UTF_8)), lIlIIlIlll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIlll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIIlIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIIlIllIlIlI) {
            llllllllllllllllllllIIIlIllIlIlI.printStackTrace();
            return null;
        }
    }

    public static void b(WorldPoint worldPoint) {
        WorldPoint worldPoint2 = new WorldPoint(lIlIIlIlll[43], lIlIIlIlll[44], lIlIIlIlll[2]);
        WorldArea worldArea = new WorldArea(lIlIIlIlll[45], lIlIIlIlll[46], lIlIIlIlll[9], lIlIIlIlll[47], lIlIIlIlll[2]);
        WorldArea worldArea2 = new WorldArea(lIlIIlIlll[48], lIlIIlIlll[49], lIlIIlIlll[50], lIlIIlIlll[51], lIlIIlIlll[2]);
        if (lIIIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIlIIlIlll[6]) && lIIIllIIllIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllIIllIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIlIIlIlll[52], lIlIIlIlll[53], lIlIIlIlll[0])), lIlIIlIlll[30])) {
            AccBuilderShamans.c = lIlIIlIlIl[lIlIIlIlll[54]];
            if (lIIIllIIllIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(worldPoint2);
            "".length();
            Time.sleepTicks(lIlIIlIlll[0]);
            "".length();
        }
        if (lIIIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIlIIlIlll[6]) && lIIIllIIllllI(Players.getLocal().getWorldLocation().getY(), lIlIIlIlll[44])) {
            if (lIIIllIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr = new String[lIlIIlIlll[0]];
                strArr[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[55]];
                TileObjects.getNearest(strArr).interact(lIlIIlIlIl[lIlIIlIlll[35]]);
                Time.sleepTicks(lIlIIlIlll[3]);
                "".length();
            }
            if (lIIIllIIllIll(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr2 = new String[lIlIIlIlll[0]];
                strArr2[lIlIIlIlll[2]] = lIlIIlIlIl[lIlIIlIlll[56]];
                C0006g.a(strArr2);
            }
        }
        if (lIIIllIIlllIl(Players.getLocal().getWorldLocation().getY(), lIlIIlIlll[44])) {
            if (lIIIllIIllIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllIIllIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIIIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIlIIlIlll[52], lIlIIlIlll[53], lIlIIlIlll[0])), lIlIIlIlll[30])) {
                return;
            }
            AccBuilderShamans.c = lIlIIlIlIl[lIlIIlIlll[57]];
            if (lIIIllIIllIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIlIIlIlll[43], lIlIIlIlll[58], lIlIIlIlll[2])) ? 1 : 0)) {
                c(new WorldPoint(lIlIIlIlll[43], lIlIIlIlll[59], lIlIIlIlll[2]));
                Time.sleepTicks(lIlIIlIlll[6]);
                "".length();
            }
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIlIIlIlll[0]);
            "".length();
        }
    }

    public static void w() {
        Widget widget = Widgets.get(lIlIIlIlll[14], lIlIIlIlll[15], lIlIIlIlll[2]);
        if (lIIIllIIlllll(widget)) {
            widget.interact(lIlIIlIlIl[lIlIIlIlll[16]]);
            Time.sleepTicks(lIlIIlIlll[1]);
            "".length();
        }
    }

    private static boolean lIIIllIIllllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIllIlIIIII(int i, int i2) {
        return i < i2;
    }

    public static void c(String str) {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(lIlIIlIlIl[lIlIIlIlll[12]]));
        bufferedWriter.write(str + System.getProperty(lIlIIlIlIl[lIlIIlIlll[13]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public static boolean F() {
        if (lIIIllIIllIIl(S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllIIllIIl(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(Z), lIlIIlIlll[71]) && !lIIIllIIllIll(aa.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIlIIlIlll[2];
        }
        ?? r0 = lIlIIlIlll[0];
        "".length();
        return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    public static double u() {
        return (Skills.getBoostedLevel(Skill.HITPOINTS) / Skills.getLevel(Skill.HITPOINTS)) * 100.0d;
    }

    public static boolean i(int i) {
        int[] iArr = new int[lIlIIlIlll[0]];
        iArr[lIlIIlIlll[2]] = i;
        return Bank.contains(iArr);
    }

    private static boolean lIIIllIIllIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public static void a(String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod(lIlIIlIlIl[lIlIIlIlll[47]]);
            httpURLConnection.setRequestProperty(lIlIIlIlIl[lIlIIlIlll[60]], lIlIIlIlIl[lIlIIlIlll[61]]);
            httpURLConnection.setDoOutput(lIlIIlIlll[0]);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes("{\"content\": \"" + str2 + "\"}");
            dataOutputStream.flush();
            dataOutputStream.close();
            System.out.println("Response Code: " + httpURLConnection.getResponseCode());
            httpURLConnection.disconnect();
            "".length();
            if (((190 ^ 133) & ((141 ^ 182) ^ (-1))) >= "  ".length()) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean x() {
        if (!lIIIllIIllIll(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lIlIIlIlll[28]));
        })).intValue()) || lIIIllIIllIIl(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lIlIIlIlll[31]));
        })).intValue())) {
            ?? r0 = lIlIIlIlll[0];
            "".length();
            return ((((91 + 113) - 203) + 126) ^ (220 ^ 167)) == 0 ? ((54 ^ 48) ^ (14 ^ 55)) & (((70 ^ 92) ^ (102 ^ 67)) ^ (-" ".length())) : r0;
        }
        return lIlIIlIlll[2];
    }

    public static void D() {
        if (lIIIllIIllIlI(j(lIlIIlIlll[63]), lIlIIlIlll[0])) {
            if (lIIIllIIllIIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lIlIIlIlll[0]);
                "".length();
            }
            if (lIIIllIIllIll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lIlIIlIlll[64], lIlIIlIlll[54]);
                if (lIIIllIIlllll(widget)) {
                    widget.interact(lIlIIlIlIl[lIlIIlIlll[66]]);
                    Time.sleepTicks(lIlIIlIlll[0]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public static void G() {
        if (lIIIllIIllIIl(Widgets.get(lIlIIlIlll[72]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get(lIlIIlIlll[72], lIlIIlIlll[23]);
            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) lIlIIlIlll[0]);
            Time.sleepTicks(lIlIIlIlll[1]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void y() {
        if (lIIIllIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIllIIllIll(x() ? 1 : 0)) {
            if (lIIIllIIllIIl(z() ? 1 : 0)) {
                A();
            }
            if (lIIIllIIllIll(z() ? 1 : 0)) {
                Widget widget = Widgets.get(lIlIIlIlll[25], lIlIIlIlll[26], lIlIIlIlll[7]);
                if (lIIIllIIlllll(widget)) {
                    widget.interact(lIlIIlIlIl[lIlIIlIlll[27]]);
                    Time.sleepTicks(lIlIIlIlll[0]);
                    "".length();
                }
                if (lIIIllIIllIIl(Vars.getBit(lIlIIlIlll[28]))) {
                    Widget widget2 = Widgets.get(lIlIIlIlll[25], lIlIIlIlll[29], lIlIIlIlll[21]);
                    if (lIIIllIIlllll(widget2)) {
                        if (lIIIllIIllIIl(widget2.isVisible() ? 1 : 0)) {
                            Widget widget3 = Widgets.get(lIlIIlIlll[25], lIlIIlIlll[30], lIlIIlIlll[5]);
                            Mouse.click(widget3.getClickPoint().getX(), widget3.getClickPoint().getY(), (boolean) lIlIIlIlll[0]);
                            Time.sleepTicks(lIlIIlIlll[0]);
                            "".length();
                        }
                        if (lIIIllIIllIll(widget2.isVisible() ? 1 : 0)) {
                            widget2.interact(lIlIIlIlIl[lIlIIlIlll[29]]);
                            Time.sleepTicks(lIlIIlIlll[0]);
                            "".length();
                        }
                    }
                }
                if (lIIIllIIllIIl(Vars.getBit(lIlIIlIlll[31]))) {
                    Widget widget4 = Widgets.get(lIlIIlIlll[25], lIlIIlIlll[29], lIlIIlIlll[32]);
                    if (lIIIllIIlllll(widget4)) {
                        if (lIIIllIIllIIl(widget4.isVisible() ? 1 : 0)) {
                            Widget widget5 = Widgets.get(lIlIIlIlll[25], lIlIIlIlll[30], lIlIIlIlll[5]);
                            Mouse.click(widget5.getClickPoint().getX(), widget5.getClickPoint().getY(), (boolean) lIlIIlIlll[0]);
                            Time.sleepTicks(lIlIIlIlll[0]);
                            "".length();
                        }
                        if (lIIIllIIllIll(widget4.isVisible() ? 1 : 0)) {
                            widget4.interact(lIlIIlIlIl[lIlIIlIlll[30]]);
                            Time.sleepTicks(lIlIIlIlll[3]);
                            "".length();
                        }
                    }
                }
            }
        }
        Widget widget6 = Widgets.get(lIlIIlIlll[25], lIlIIlIlll[4]);
        if (lIIIllIIlllll(widget6)) {
            widget6.interact(lIlIIlIlIl[lIlIIlIlll[33]]);
            Time.sleepTicks(lIlIIlIlll[0]);
            "".length();
        }
    }

    private static void lIIIllIIllIII() {
        lIlIIlIlll = new int[252];
        lIlIIlIlll[0] = " ".length();
        lIlIIlIlll[1] = "   ".length();
        lIlIIlIlll[2] = ((66 ^ 57) ^ (45 ^ 26)) & (((80 ^ 6) ^ (13 ^ 23)) ^ (-" ".length()));
        lIlIIlIlll[3] = "  ".length();
        lIlIIlIlll[4] = 156 ^ 152;
        lIlIIlIlll[5] = 173 ^ 168;
        lIlIIlIlll[6] = 105 ^ 111;
        lIlIIlIlll[7] = 187 ^ 188;
        lIlIIlIlll[8] = (102 ^ 5) ^ (62 ^ 85);
        lIlIIlIlll[9] = (61 ^ 9) ^ (55 ^ 10);
        lIlIIlIlll[10] = (((2 + 47) - (-78)) + 4) ^ (((76 + 135) - 154) + 80);
        lIlIIlIlll[11] = 12 ^ 7;
        lIlIIlIlll[12] = (((105 + 121) - 85) + 12) ^ (((29 + 145) - 157) + 132);
        lIlIIlIlll[13] = 155 ^ 150;
        lIlIIlIlll[14] = (-((-4161) & 32101)) & (-4163) & 32766;
        lIlIIlIlll[15] = 222 ^ 195;
        lIlIIlIlll[16] = (139 ^ 145) ^ (141 ^ 153);
        lIlIIlIlll[17] = (94 ^ 54) ^ (123 ^ 28);
        lIlIIlIlll[18] = (-20994) & 24161;
        lIlIIlIlll[19] = (-16897) & 20310;
        lIlIIlIlll[20] = (63 ^ 71) ^ (68 ^ 1);
        lIlIIlIlll[21] = 232 ^ 192;
        lIlIIlIlll[22] = (-24753) & 32759;
        lIlIIlIlll[23] = 148 ^ 132;
        lIlIIlIlll[24] = (66 ^ 3) ^ (70 ^ 22);
        lIlIIlIlll[25] = ((112 + 83) - 169) + 108;
        lIlIIlIlll[26] = (((33 + 100) - 8) + 50) ^ (((37 + 85) - 105) + 167);
        lIlIIlIlll[27] = (((17 + 142) - 17) + 1) ^ (((28 + 152) - 64) + 41);
        lIlIIlIlll[28] = (-((-7081) & 23482)) & (-3) & 31103;
        lIlIIlIlll[29] = 38 ^ 53;
        lIlIIlIlll[30] = 38 ^ 50;
        lIlIIlIlll[31] = (-3) & 14703;
        lIlIIlIlll[32] = (((16 + 68) - 31) + 91) ^ (((118 + 0) - 115) + 182);
        lIlIIlIlll[33] = 14 ^ 27;
        lIlIIlIlll[34] = (((99 + 214) - 97) + 19) ^ (((65 + 33) - 39) + 100);
        lIlIIlIlll[35] = 18 ^ 50;
        lIlIIlIlll[36] = 25 ^ 15;
        lIlIIlIlll[37] = (3 ^ 38) ^ (155 ^ 166);
        lIlIIlIlll[38] = (70 ^ 84) ^ (51 ^ 56);
        lIlIIlIlll[39] = 135 ^ 157;
        lIlIIlIlll[40] = (94 ^ 80) ^ (34 ^ 55);
        lIlIIlIlll[41] = (230 ^ 191) ^ (106 ^ 47);
        lIlIIlIlll[42] = (-((-20889) & 29177)) & (-1025) & 31869;
        lIlIIlIlll[43] = (-((-281) & 13659)) & (-16929) & 32767;
        lIlIIlIlll[44] = (-16449) & 19831;
        lIlIIlIlll[45] = (-17479) & 19935;
        lIlIIlIlll[46] = (-((-2321) & 30998)) & (-579) & 32639;
        lIlIIlIlll[47] = (106 ^ 81) ^ (11 ^ 19);
        lIlIIlIlll[48] = (-((-8457) & 26377)) & (-4233) & 24575;
        lIlIIlIlll[49] = (-12481) & 15871;
        lIlIIlIlll[50] = (253 ^ 149) ^ (124 ^ 83);
        lIlIIlIlll[51] = ((38 + 123) - 57) + 39;
        lIlIIlIlll[52] = (-((-6673) & 24179)) & (-513) & 20478;
        lIlIIlIlll[53] = (-24611) & 28027;
        lIlIIlIlll[54] = (((114 + 125) - 115) + 19) ^ (((13 + 137) - 102) + 97);
        lIlIIlIlll[55] = 85 ^ 74;
        lIlIIlIlll[56] = (234 ^ 145) ^ (111 ^ 53);
        lIlIIlIlll[57] = (((75 + 43) - 24) + 135) ^ (((65 + 65) - 83) + 152);
        lIlIIlIlll[58] = (-29379) & 32763;
        lIlIIlIlll[59] = (-((-16677) & 24893)) & (-4739) & 16351;
        lIlIIlIlll[60] = (248 ^ 197) ^ (140 ^ 149);
        lIlIIlIlll[61] = (((103 + 119) - 108) + 55) ^ (((112 + 15) - (-6)) + 7);
        lIlIIlIlll[62] = -" ".length();
        lIlIIlIlll[63] = ((165 + 16) - 137) + 128;
        lIlIIlIlll[64] = (-263) & 855;
        lIlIIlIlll[65] = (128 ^ 149) ^ (96 ^ 83);
        lIlIIlIlll[66] = (((56 + 3) - (-47)) + 46) ^ (((180 + 100) - 161) + 72);
        lIlIIlIlll[67] = 71 ^ 109;
        lIlIIlIlll[68] = (92 ^ 124) ^ (41 ^ 34);
        lIlIIlIlll[69] = (171 ^ 162) ^ (140 ^ 169);
        lIlIIlIlll[70] = (112 ^ 111) ^ (151 ^ 165);
        lIlIIlIlll[71] = (83 ^ 109) ^ (86 ^ 90);
        lIlIIlIlll[72] = (((24 ^ 11) + (172 ^ 139)) - (-(37 ^ 12))) + (60 ^ 10);
        lIlIIlIlll[73] = (224 ^ 136) ^ (170 ^ 167);
        lIlIIlIlll[74] = 88 ^ 118;
        lIlIIlIlll[75] = (-22530) & 24479;
        lIlIIlIlll[76] = (113 ^ 64) ^ (80 ^ 78);
        lIlIIlIlll[77] = (67 ^ 98) ^ (105 ^ 120);
        lIlIIlIlll[78] = 5 ^ 52;
        lIlIIlIlll[79] = (-((-834) & 16231)) & (-513) & 16383;
        lIlIIlIlll[80] = (-35) & 567;
        lIlIIlIlll[81] = 120 ^ 75;
        lIlIIlIlll[82] = 186 ^ 142;
        lIlIIlIlll[83] = 140 ^ 185;
        lIlIIlIlll[84] = 156 ^ 170;
        lIlIIlIlll[85] = (223 ^ 139) ^ (15 ^ 108);
        lIlIIlIlll[86] = 106 ^ 82;
        lIlIIlIlll[87] = 119 ^ 78;
        lIlIIlIlll[88] = (((22 + 53) - 55) + 140) ^ (((107 + 0) - 104) + 151);
        lIlIIlIlll[89] = 0 ^ 100;
        lIlIIlIlll[90] = 135 ^ 188;
        lIlIIlIlll[91] = 149 ^ 169;
        lIlIIlIlll[92] = (-25482) & 28671;
        lIlIIlIlll[93] = (-((-1349) & 26437)) & (-1) & 28285;
        lIlIIlIlll[94] = (-13058) & 16255;
        lIlIIlIlll[95] = (-((-7721) & 32633)) & (-4099) & 32214;
        lIlIIlIlll[96] = (-((-11345) & 28639)) & (-12290) & 32767;
        lIlIIlIlll[97] = (-((-257) & 9107)) & (-4097) & 16383;
        lIlIIlIlll[98] = (((137 + 237) - 326) + 200) ^ (((78 + 20) - 1) + 50);
        lIlIIlIlll[99] = (-20613) & 20958;
        lIlIIlIlll[100] = (-10826) & 11131;
        lIlIIlIlll[101] = (-24770) & 25079;
        lIlIIlIlll[102] = (-((-16609) & 31998)) & (-3) & 15743;
        lIlIIlIlll[103] = (-((-10531) & 15787)) & (-17) & 5627;
        lIlIIlIlll[104] = (-30724) & 31079;
        lIlIIlIlll[105] = (-((-18597) & 32431)) & (-2065) & 16255;
        lIlIIlIlll[106] = (-2194) & 2551;
        lIlIIlIlll[107] = (-((-1195) & 7931)) & (-9257) & 16378;
        lIlIIlIlll[108] = (-7761) & 8155;
        lIlIIlIlll[109] = (-((-131) & 29359)) & (-3074) & 32767;
        lIlIIlIlll[110] = (-((-845) & 10078)) & (-18433) & 28159;
        lIlIIlIlll[111] = (-((-13631) & 16191)) & (-1041) & 4095;
        lIlIIlIlll[112] = (-32272) & 32767;
        lIlIIlIlll[113] = (-24802) & 25337;
        lIlIIlIlll[114] = (-2522) & 3037;
        lIlIIlIlll[115] = (-12806) & 13119;
        lIlIIlIlll[116] = (-9733) & 10223;
        lIlIIlIlll[117] = (-((-2377) & 32233)) & (-2561) & 32750;
        lIlIIlIlll[118] = (-22158) & 22511;
        lIlIIlIlll[119] = (-((-991) & 22495)) & (-8225) & 30205;
        lIlIIlIlll[120] = (-((-265) & 3390)) & (-4225) & 7671;
        lIlIIlIlll[121] = (-((-3329) & 16203)) & (-2053) & 15231;
        lIlIIlIlll[122] = (-((-2429) & 31741)) & (-1) & 29627;
        lIlIIlIlll[123] = (-((-2354) & 28467)) & (-2177) & 28659;
        lIlIIlIlll[124] = (-4777) & 5100;
        lIlIIlIlll[125] = (-((-25523) & 31675)) & (-513) & 6989;
        lIlIIlIlll[126] = (-3222) & 3549;
        lIlIIlIlll[127] = (-((-7359) & 16127)) & (-1025) & 10237;
        lIlIIlIlll[128] = (-6177) & 6640;
        lIlIIlIlll[129] = (-16417) & 16894;
        lIlIIlIlll[130] = (-18949) & 19438;
        lIlIIlIlll[131] = (-22035) & 22526;
        lIlIIlIlll[132] = (-3585) & 4091;
        lIlIIlIlll[133] = (-((-18449) & 27121)) & (-23570) & 32763;
        lIlIIlIlll[134] = (-((-19233) & 23350)) & (-17537) & 21983;
        lIlIIlIlll[135] = (-((-15937) & 32333)) & (-15907) & 32767;
        lIlIIlIlll[136] = (-14708) & 15219;
        lIlIIlIlll[137] = (-((-5287) & 30183)) & (-4097) & 29551;
        lIlIIlIlll[138] = (-30211) & 30587;
        lIlIIlIlll[139] = (-((-2310) & 12199)) & (-17) & 10237;
        lIlIIlIlll[140] = (-22533) & 23037;
        lIlIIlIlll[141] = (-((-4949) & 21373)) & (-14343) & 31103;
        lIlIIlIlll[142] = (-3126) & 3639;
        lIlIIlIlll[143] = (-((-5569) & 32753)) & (-4225) & 31735;
        lIlIIlIlll[144] = (-5144) & 5623;
        lIlIIlIlll[145] = (-9859) & 10202;
        lIlIIlIlll[146] = (-17409) & 17887;
        lIlIIlIlll[147] = (-7185) & 7677;
        lIlIIlIlll[148] = (-((-22867) & 24019)) & (-23050) & 24543;
        lIlIIlIlll[149] = (-31745) & 32190;
        lIlIIlIlll[150] = (-1667) & 1986;
        lIlIIlIlll[151] = (-((-9102) & 12207)) & (-1) & 3455;
        lIlIIlIlll[152] = (-((-31) & 31775)) & (-651) & 32715;
        lIlIIlIlll[153] = (-((-20597) & 29431)) & (-3105) & 12279;
        lIlIIlIlll[154] = (-((-13) & 26638)) & (-17) & 27063;
        lIlIIlIlll[155] = (-6161) & 6623;
        lIlIIlIlll[156] = (-30345) & 30718;
        lIlIIlIlll[157] = (-((-328) & 14287)) & (-18433) & 32767;
        lIlIIlIlll[158] = (-23171) & 23506;
        lIlIIlIlll[159] = (-8727) & 9055;
        lIlIIlIlll[160] = (-5681) & 6011;
        lIlIIlIlll[161] = (((114 + 33) - 36) + 37) ^ (((152 + 17) - 148) + 149);
        lIlIIlIlll[162] = (-((-339) & 26483)) & (-1) & 26477;
        lIlIIlIlll[163] = (((18 + 75) - 39) + 75) ^ (((52 + 163) - 211) + 186);
        lIlIIlIlll[164] = (-((-7269) & 23788)) & (-15945) & 32767;
        lIlIIlIlll[165] = (246 ^ 157) ^ (7 ^ 44);
        lIlIIlIlll[166] = (-((-8322) & 25751)) & (-8321) & 26111;
        lIlIIlIlll[167] = 13 ^ 76;
        lIlIIlIlll[168] = (-14489) & 14811;
        lIlIIlIlll[169] = 98 ^ 32;
        lIlIIlIlll[170] = (-((-8467) & 27611)) & (-13317) & 32767;
        lIlIIlIlll[171] = (((21 + 131) - 129) + 210) ^ (((19 + 128) - 43) + 66);
        lIlIIlIlll[172] = (-19145) & 19453;
        lIlIIlIlll[173] = 224 ^ 164;
        lIlIIlIlll[174] = (-((-167) & 32495)) & (-129) & 32767;
        lIlIIlIlll[175] = (((111 + 90) - 12) + 3) ^ (((94 + 18) - 36) + 57);
        lIlIIlIlll[176] = (-((-16833) & 26569)) & (-20481) & 30591;
        lIlIIlIlll[177] = (((44 + 128) - 164) + 199) ^ (((55 + 131) - 121) + 72);
        lIlIIlIlll[178] = (-((-21462) & 30679)) & (-18437) & 28031;
        lIlIIlIlll[179] = (-13343) & 13855;
        lIlIIlIlll[180] = (55 ^ 3) ^ (82 ^ 46);
        lIlIIlIlll[181] = (-((-16683) & 32699)) & (-65) & 16383;
        lIlIIlIlll[182] = 196 ^ 141;
        lIlIIlIlll[183] = (-((-8362) & 30443)) & (-3) & 22395;
        lIlIIlIlll[184] = (19 ^ 5) ^ (47 ^ 115);
        lIlIIlIlll[185] = (-20483) & 20795;
        lIlIIlIlll[186] = (((100 + 55) - 147) + 185) ^ (((24 + 80) - (-31)) + 3);
        lIlIIlIlll[187] = (-1089) & 1405;
        lIlIIlIlll[188] = "  ".length() ^ (75 ^ 5);
        lIlIIlIlll[189] = (-25765) & 26103;
        lIlIIlIlll[190] = (12 ^ 30) ^ (194 ^ 157);
        lIlIIlIlll[191] = (-((-12507) & 32510)) & (-1) & 20343;
        lIlIIlIlll[192] = (((213 + 122) - 179) + 80) ^ (((79 + 28) - (-12)) + 43);
        lIlIIlIlll[193] = (-((-4419) & 16363)) & (-20481) & 32767;
        lIlIIlIlll[194] = 16 ^ 95;
        lIlIIlIlll[195] = (-((-457) & 32717)) & (-1) & 32607;
        lIlIIlIlll[196] = (84 ^ 29) ^ (80 ^ 73);
        lIlIIlIlll[197] = (-14498) & 14845;
        lIlIIlIlll[198] = 218 ^ 139;
        lIlIIlIlll[199] = (-1697) & 2047;
        lIlIIlIlll[200] = (((71 + 20) - 40) + 156) ^ (((146 + 54) - 96) + 53);
        lIlIIlIlll[201] = (-16009) & 16367;
        lIlIIlIlll[202] = 211 ^ 128;
        lIlIIlIlll[203] = (-((-1349) & 32599)) & (-5) & 31614;
        lIlIIlIlll[204] = (((206 + 20) - 19) + 20) ^ (((157 + 111) - 155) + 70);
        lIlIIlIlll[205] = (-3089) & 3455;
        lIlIIlIlll[206] = 62 ^ 107;
        lIlIIlIlll[207] = (-26118) & 26485;
        lIlIIlIlll[208] = (((37 + 169) - 194) + 182) ^ (((115 + 9) - 18) + 42);
        lIlIIlIlll[209] = (-((-18785) & 32115)) & (-2049) & 15859;
        lIlIIlIlll[210] = 195 ^ 148;
        lIlIIlIlll[211] = (-4637) & 5118;
        lIlIIlIlll[212] = (((137 + 24) - 95) + 135) ^ (((14 + 130) - 64) + 65);
        lIlIIlIlll[213] = (-((-12610) & 31581)) & (-1025) & 20479;
        lIlIIlIlll[214] = (36 ^ 28) ^ (255 ^ 158);
        lIlIIlIlll[215] = (-((-1093) & 15967)) & (-16385) & 31743;
        lIlIIlIlll[216] = 246 ^ 172;
        lIlIIlIlll[217] = (-((-21638) & 32415)) & (-20481) & 31743;
        lIlIIlIlll[218] = (((174 + 174) - 160) + 4) ^ (((32 + 0) - (-82)) + 41);
        lIlIIlIlll[219] = (-((-17059) & 23211)) & (-17409) & 24047;
        lIlIIlIlll[220] = 252 ^ 160;
        lIlIIlIlll[221] = (-((-10797) & 27199)) & (-7173) & 24062;
        lIlIIlIlll[222] = (239 ^ 146) ^ (134 ^ 166);
        lIlIIlIlll[223] = (-((-18985) & 32303)) & (-18449) & 32255;
        lIlIIlIlll[224] = 37 ^ 123;
        lIlIIlIlll[225] = (-7169) & 7674;
        lIlIIlIlll[226] = 200 ^ 151;
        lIlIIlIlll[227] = (-20482) & 20989;
        lIlIIlIlll[228] = (69 ^ 111) ^ (211 ^ 153);
        lIlIIlIlll[229] = (-30211) & 30719;
        lIlIIlIlll[230] = (110 ^ 50) ^ (164 ^ 153);
        lIlIIlIlll[231] = (-13314) & 13823;
        lIlIIlIlll[232] = 62 ^ 92;
        lIlIIlIlll[233] = (-((-8647) & 29639)) & (-1025) & 22527;
        lIlIIlIlll[234] = 82 ^ 49;
        lIlIIlIlll[235] = (-3289) & 3805;
        lIlIIlIlll[236] = (-((-522) & 2939)) & (-9217) & 12151;
        lIlIIlIlll[237] = (-16545) & 17063;
        lIlIIlIlll[238] = 251 ^ 157;
        lIlIIlIlll[239] = (-((-517) & 31735)) & (-1026) & 32763;
        lIlIIlIlll[240] = 251 ^ 156;
        lIlIIlIlll[241] = (-(134 ^ 131)) & (-129) & 653;
        lIlIIlIlll[242] = 217 ^ 177;
        lIlIIlIlll[243] = (-((-433) & 31221)) & (-433) & 31743;
        lIlIIlIlll[244] = (48 ^ 68) ^ (82 ^ 79);
        lIlIIlIlll[245] = (-(149 ^ 145)) & (-24817) & 25343;
        lIlIIlIlll[246] = (37 ^ 122) ^ (97 ^ 84);
        lIlIIlIlll[247] = (-19505) & 20029;
        lIlIIlIlll[248] = (-17222) & 20429;
        lIlIIlIlll[249] = (-((-3217) & 23989)) & (-513) & 24503;
        lIlIIlIlll[250] = (-9265) & 12221;
        lIlIIlIlll[251] = (-((-674) & 8949)) & (-16905) & 28511;
    }
}
