package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/e.class */
public class C0004e {
    static /* synthetic */ WorldArea ab;
    public static final /* synthetic */ String R;
    public static /* synthetic */ WorldPoint Y;
    static /* synthetic */ WorldPoint aa;
    private static final /* synthetic */ long W;
    static final /* synthetic */ WorldArea T;
    public static /* synthetic */ int[] Z;
    private static final /* synthetic */ long V;
    public static final /* synthetic */ ThreadLocalRandom S;
    private static /* synthetic */ String[] lIIIIIlII;
    private static /* synthetic */ int[] lIIIIIllI;
    static final /* synthetic */ WorldArea U;
    private static final /* synthetic */ Map<Integer, Integer> X;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean z() {
        if (llIllIIlIll(Widgets.get(lIIIIIllI[25], lIIIIIllI[0]))) {
            ?? r0 = lIIIIIllI[0];
            "".length();
            return (-"  ".length()) > 0 ? ((34 ^ 108) ^ (120 ^ 0)) & (((((123 + 167) - 231) + 116) ^ (((48 + 124) - 158) + 139)) ^ (-" ".length())) : r0;
        }
        return lIIIIIllI[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    public static void E() {
        int i = lIIIIIllI[2];
        do {
            String[] strArr = new String[lIIIIIllI[0]];
            strArr[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[21]];
            if (!llIllIIlIll(TileObjects.getNearest(strArr)) || !llIllIIIlIl(AccBuilderEasyClues.d ? 1 : 0)) {
                return;
            }
            AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[32]];
            String[] strArr2 = new String[lIIIIIllI[0]];
            strArr2[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[67]];
            NPC nearest = NPCs.getNearest(strArr2);
            if (llIllIIIlIl(i)) {
                if (llIllIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    nearest.interact(lIIIIIlII[lIIIIIllI[68]]);
                }
                if (llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                    if (llIllIIIlIl(Dialog.canContinueNPC() ? 1 : 0) && llIllIIIlIl(Dialog.canContinue() ? 1 : 0)) {
                        List options = Dialog.getOptions();
                        if (llIllIIIlIl(options.isEmpty() ? 1 : 0)) {
                            List list = (List) options.stream().filter(widget -> {
                                if (llIllIIIlIl(widget.getText().contains(lIIIIIlII[lIIIIIllI[74]]) ? 1 : 0)) {
                                    ?? r0 = lIIIIIllI[0];
                                    "".length();
                                    return ((((13 + 123) - 53) + 67) ^ (((27 + 88) - 44) + 76)) <= 0 ? ((122 ^ 47) ^ (69 ^ 31)) & (((12 ^ 64) ^ (230 ^ 165)) ^ (-" ".length())) : r0;
                                }
                                return lIIIIIllI[2];
                            }).collect(Collectors.toList());
                            if (llIllIIIlIl(list.isEmpty() ? 1 : 0)) {
                                Mouse.click(((Widget) list.get(lIIIIIllI[2])).getClickPoint().getX(), ((Widget) list.get(lIIIIIllI[2])).getClickPoint().getY(), (boolean) lIIIIIllI[0]);
                                Time.sleepTicks(lIIIIIllI[1]);
                                "".length();
                            }
                            if (llIllIIIllI(list.size(), lIIIIIllI[0])) {
                                i = lIIIIIllI[0];
                            }
                        }
                    }
                    if (!llIllIIIlIl(Dialog.canContinueNPC() ? 1 : 0) || llIllIIIlll(Dialog.canContinue() ? 1 : 0)) {
                        Dialog.continueSpace();
                    }
                }
            }
            if (llIllIIIlll(i)) {
                String[] strArr3 = new String[lIIIIIllI[0]];
                strArr3[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[69]];
                TileObjects.getNearest(strArr3).interact(lIIIIIlII[lIIIIIllI[70]]);
                Time.sleepTicks(lIIIIIllI[5]);
                "".length();
            }
            Time.sleepTicks(lIIIIIllI[0]);
            "".length();
            "".length();
        } while (!((true ^ true) & ((true ^ true) ^ true)));
    }

    public static void a(WorldPoint worldPoint) {
        if (llIllIIIlIl(C0013n.bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(C0013n.bO), lIIIIIllI[1])) {
                AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[2]];
                Movement.walkTo(C0013n.bO);
                "".length();
                Time.sleepTicks(lIIIIIllI[0]);
                "".length();
            }
            if (llIllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(C0013n.bO), lIIIIIllI[1])) {
                AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[0]];
                if (llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                NPC nearest = NPCs.getNearest(npc -> {
                    String[] strArr = new String[lIIIIIllI[0]];
                    strArr[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[90]];
                    return npc.hasAction(strArr);
                });
                if (llIllIIlIll(nearest)) {
                    String[] strArr = new String[lIIIIIllI[0]];
                    strArr[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[3]];
                    if (llIllIIIlll(nearest.hasAction(strArr) ? 1 : 0)) {
                        nearest.interact(lIIIIIlII[lIIIIIllI[1]]);
                        Time.sleepTicks(lIIIIIllI[1]);
                        "".length();
                    }
                    String[] strArr2 = new String[lIIIIIllI[0]];
                    strArr2[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[4]];
                    if (llIllIIIlIl(nearest.hasAction(strArr2) ? 1 : 0)) {
                        C0006g.b(lIIIIIlII[lIIIIIllI[5]], C0013n.bR);
                        Time.sleepTicks(lIIIIIllI[0]);
                        "".length();
                    }
                }
                String[] strArr3 = new String[lIIIIIllI[0]];
                strArr3[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[6]];
                NPC nearest2 = NPCs.getNearest(strArr3);
                if (llIllIIlIll(nearest2)) {
                    String[] strArr4 = new String[lIIIIIllI[0]];
                    strArr4[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[7]];
                    if (llIllIIIlll(nearest2.hasAction(strArr4) ? 1 : 0)) {
                        nearest2.interact(lIIIIIlII[lIIIIIllI[8]]);
                        Time.sleepTicks(lIIIIIllI[1]);
                        "".length();
                    }
                    String[] strArr5 = new String[lIIIIIllI[0]];
                    strArr5[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[9]];
                    if (llIllIIIlIl(nearest2.hasAction(strArr5) ? 1 : 0)) {
                        C0006g.b(lIIIIIlII[lIIIIIllI[10]], C0013n.bR);
                        Time.sleepTicks(lIIIIIllI[0]);
                        "".length();
                    }
                }
            }
        }
        if (llIllIIIlll(C0013n.bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIIIIllI[0]);
            "".length();
        }
    }

    public static void C() {
        if (llIllIIIlIl(j(lIIIIIllI[63]))) {
            if (llIllIIIlIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lIIIIIllI[0]);
                "".length();
            }
            if (llIllIIIlll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lIIIIIllI[64], lIIIIIllI[54]);
                if (llIllIIlIll(widget)) {
                    widget.interact(lIIIIIlII[lIIIIIllI[65]]);
                    Time.sleepTicks(lIIIIIllI[0]);
                    "".length();
                }
            }
        }
    }

    private static String llIllIIIIlI(String lIIlIlIIlIIIllI, String lIIlIlIIlIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIIIllI[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIlIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIlIIlIIIlll) {
            lIIlIlIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIllll(int i) {
        return i > 0;
    }

    private static String llIllIIIIIl(String lIIlIlIIlIllIll, String lIIlIlIIlIllIlI) {
        String str = new String(Base64.getDecoder().decode(lIIlIlIIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIlIIlIllIIl = new StringBuilder();
        char[] charArray = lIIlIlIIlIllIlI.toCharArray();
        int lIIlIlIIlIlIlll = lIIIIIllI[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lIIlIlIIlIIllll = lIIIIIllI[2];
        while (llIllIIllII(lIIlIlIIlIIllll, length)) {
            lIIlIlIIlIllIIl.append((char) (charArray2[lIIlIlIIlIIllll] ^ charArray[lIIlIlIIlIlIlll % charArray.length]));
            "".length();
            lIIlIlIIlIlIlll++;
            lIIlIlIIlIIllll++;
            "".length();
            if ((120 ^ 124) <= ((21 ^ 94) & ((45 ^ 102) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(lIIlIlIIlIllIIl);
    }

    public static void w() {
        Widget widget = Widgets.get(lIIIIIllI[14], lIIIIIllI[15], lIIIIIllI[2]);
        if (llIllIIlIll(widget)) {
            widget.interact(lIIIIIlII[lIIIIIllI[16]]);
            Time.sleepTicks(lIIIIIllI[1]);
            "".length();
        }
    }

    private static boolean llIllIIllIl(int i, int i2) {
        return i != i2;
    }

    public static void D() {
        if (llIllIIIllI(j(lIIIIIllI[63]), lIIIIIllI[0])) {
            if (llIllIIIlIl(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(lIIIIIllI[0]);
                "".length();
            }
            if (llIllIIIlll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(lIIIIIllI[64], lIIIIIllI[54]);
                if (llIllIIlIll(widget)) {
                    widget.interact(lIIIIIlII[lIIIIIllI[66]]);
                    Time.sleepTicks(lIIIIIllI[0]);
                    "".length();
                }
            }
        }
    }

    public static boolean i(int i) {
        int[] iArr = new int[lIIIIIllI[0]];
        iArr[lIIIIIllI[2]] = i;
        return Bank.contains(iArr);
    }

    private static boolean llIllIIIlll(int i) {
        return i != 0;
    }

    private static boolean llIllIIlIII(int i) {
        return i < 0;
    }

    public static void c(String str) {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(lIIIIIlII[lIIIIIllI[12]]));
        bufferedWriter.write(str + System.getProperty(lIIIIIlII[lIIIIIllI[13]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static long a(long j) {
        return s() - j;
    }

    static {
        llIllIIIlII();
        llIllIIIIll();
        R = lIIIIIlII[lIIIIIllI[91]];
        S = ThreadLocalRandom.current();
        T = new WorldArea(lIIIIIllI[92], lIIIIIllI[93], lIIIIIllI[71], lIIIIIllI[77], lIIIIIllI[2]);
        U = new WorldArea(lIIIIIllI[94], lIIIIIllI[95], lIIIIIllI[26], lIIIIIllI[54], lIIIIIllI[0]);
        V = System.currentTimeMillis();
        W = System.nanoTime();
        X = new HashMap();
        Y = new WorldPoint(lIIIIIllI[96], lIIIIIllI[97], lIIIIIllI[2]);
        int[] iArr = new int[lIIIIIllI[98]];
        iArr[lIIIIIllI[2]] = lIIIIIllI[99];
        iArr[lIIIIIllI[0]] = lIIIIIllI[100];
        iArr[lIIIIIllI[3]] = lIIIIIllI[101];
        iArr[lIIIIIllI[1]] = lIIIIIllI[102];
        iArr[lIIIIIllI[4]] = lIIIIIllI[103];
        iArr[lIIIIIllI[5]] = lIIIIIllI[104];
        iArr[lIIIIIllI[6]] = lIIIIIllI[105];
        iArr[lIIIIIllI[7]] = lIIIIIllI[106];
        iArr[lIIIIIllI[8]] = lIIIIIllI[107];
        iArr[lIIIIIllI[9]] = lIIIIIllI[108];
        iArr[lIIIIIllI[10]] = lIIIIIllI[109];
        iArr[lIIIIIllI[11]] = lIIIIIllI[110];
        iArr[lIIIIIllI[12]] = lIIIIIllI[111];
        iArr[lIIIIIllI[13]] = lIIIIIllI[112];
        iArr[lIIIIIllI[16]] = lIIIIIllI[113];
        iArr[lIIIIIllI[17]] = lIIIIIllI[114];
        iArr[lIIIIIllI[23]] = lIIIIIllI[115];
        iArr[lIIIIIllI[24]] = lIIIIIllI[116];
        iArr[lIIIIIllI[27]] = lIIIIIllI[117];
        iArr[lIIIIIllI[29]] = lIIIIIllI[118];
        iArr[lIIIIIllI[30]] = lIIIIIllI[119];
        iArr[lIIIIIllI[33]] = lIIIIIllI[120];
        iArr[lIIIIIllI[36]] = lIIIIIllI[121];
        iArr[lIIIIIllI[26]] = lIIIIIllI[122];
        iArr[lIIIIIllI[37]] = lIIIIIllI[123];
        iArr[lIIIIIllI[38]] = lIIIIIllI[124];
        iArr[lIIIIIllI[39]] = lIIIIIllI[125];
        iArr[lIIIIIllI[40]] = lIIIIIllI[126];
        iArr[lIIIIIllI[41]] = lIIIIIllI[127];
        iArr[lIIIIIllI[15]] = lIIIIIllI[128];
        iArr[lIIIIIllI[54]] = lIIIIIllI[129];
        iArr[lIIIIIllI[55]] = lIIIIIllI[130];
        iArr[lIIIIIllI[35]] = lIIIIIllI[131];
        iArr[lIIIIIllI[56]] = lIIIIIllI[132];
        iArr[lIIIIIllI[57]] = lIIIIIllI[133];
        iArr[lIIIIIllI[47]] = lIIIIIllI[134];
        iArr[lIIIIIllI[60]] = lIIIIIllI[135];
        iArr[lIIIIIllI[61]] = lIIIIIllI[136];
        iArr[lIIIIIllI[65]] = lIIIIIllI[137];
        iArr[lIIIIIllI[66]] = lIIIIIllI[138];
        iArr[lIIIIIllI[21]] = lIIIIIllI[139];
        iArr[lIIIIIllI[32]] = lIIIIIllI[140];
        iArr[lIIIIIllI[67]] = lIIIIIllI[141];
        iArr[lIIIIIllI[68]] = lIIIIIllI[142];
        iArr[lIIIIIllI[69]] = lIIIIIllI[143];
        iArr[lIIIIIllI[70]] = lIIIIIllI[144];
        iArr[lIIIIIllI[74]] = lIIIIIllI[145];
        iArr[lIIIIIllI[76]] = lIIIIIllI[146];
        iArr[lIIIIIllI[77]] = lIIIIIllI[147];
        iArr[lIIIIIllI[78]] = lIIIIIllI[148];
        iArr[lIIIIIllI[71]] = lIIIIIllI[149];
        iArr[lIIIIIllI[81]] = lIIIIIllI[150];
        iArr[lIIIIIllI[82]] = lIIIIIllI[151];
        iArr[lIIIIIllI[83]] = lIIIIIllI[152];
        iArr[lIIIIIllI[84]] = lIIIIIllI[153];
        iArr[lIIIIIllI[85]] = lIIIIIllI[154];
        iArr[lIIIIIllI[86]] = lIIIIIllI[155];
        iArr[lIIIIIllI[87]] = lIIIIIllI[156];
        iArr[lIIIIIllI[88]] = lIIIIIllI[157];
        iArr[lIIIIIllI[90]] = lIIIIIllI[158];
        iArr[lIIIIIllI[91]] = lIIIIIllI[159];
        iArr[lIIIIIllI[20]] = lIIIIIllI[160];
        iArr[lIIIIIllI[161]] = lIIIIIllI[162];
        iArr[lIIIIIllI[163]] = lIIIIIllI[164];
        iArr[lIIIIIllI[165]] = lIIIIIllI[166];
        iArr[lIIIIIllI[167]] = lIIIIIllI[168];
        iArr[lIIIIIllI[169]] = lIIIIIllI[170];
        iArr[lIIIIIllI[171]] = lIIIIIllI[172];
        iArr[lIIIIIllI[173]] = lIIIIIllI[174];
        iArr[lIIIIIllI[175]] = lIIIIIllI[176];
        iArr[lIIIIIllI[177]] = lIIIIIllI[178];
        iArr[lIIIIIllI[50]] = lIIIIIllI[179];
        iArr[lIIIIIllI[180]] = lIIIIIllI[181];
        iArr[lIIIIIllI[182]] = lIIIIIllI[183];
        iArr[lIIIIIllI[184]] = lIIIIIllI[185];
        iArr[lIIIIIllI[186]] = lIIIIIllI[187];
        iArr[lIIIIIllI[188]] = lIIIIIllI[189];
        iArr[lIIIIIllI[190]] = lIIIIIllI[191];
        iArr[lIIIIIllI[192]] = lIIIIIllI[193];
        iArr[lIIIIIllI[194]] = lIIIIIllI[195];
        iArr[lIIIIIllI[196]] = lIIIIIllI[197];
        iArr[lIIIIIllI[198]] = lIIIIIllI[199];
        iArr[lIIIIIllI[200]] = lIIIIIllI[201];
        iArr[lIIIIIllI[202]] = lIIIIIllI[203];
        iArr[lIIIIIllI[204]] = lIIIIIllI[205];
        iArr[lIIIIIllI[206]] = lIIIIIllI[207];
        iArr[lIIIIIllI[208]] = lIIIIIllI[209];
        iArr[lIIIIIllI[210]] = lIIIIIllI[211];
        iArr[lIIIIIllI[212]] = lIIIIIllI[213];
        iArr[lIIIIIllI[214]] = lIIIIIllI[215];
        iArr[lIIIIIllI[216]] = lIIIIIllI[217];
        iArr[lIIIIIllI[218]] = lIIIIIllI[219];
        iArr[lIIIIIllI[220]] = lIIIIIllI[221];
        iArr[lIIIIIllI[222]] = lIIIIIllI[223];
        iArr[lIIIIIllI[224]] = lIIIIIllI[225];
        iArr[lIIIIIllI[226]] = lIIIIIllI[227];
        iArr[lIIIIIllI[228]] = lIIIIIllI[229];
        iArr[lIIIIIllI[230]] = lIIIIIllI[231];
        iArr[lIIIIIllI[232]] = lIIIIIllI[233];
        iArr[lIIIIIllI[234]] = lIIIIIllI[235];
        iArr[lIIIIIllI[89]] = lIIIIIllI[236];
        iArr[lIIIIIllI[73]] = lIIIIIllI[237];
        iArr[lIIIIIllI[238]] = lIIIIIllI[239];
        iArr[lIIIIIllI[240]] = lIIIIIllI[241];
        iArr[lIIIIIllI[242]] = lIIIIIllI[243];
        iArr[lIIIIIllI[244]] = lIIIIIllI[245];
        iArr[lIIIIIllI[246]] = lIIIIIllI[247];
        Z = iArr;
        aa = new WorldPoint(lIIIIIllI[248], lIIIIIllI[249], lIIIIIllI[3]);
        ab = new WorldArea(lIIIIIllI[250], lIIIIIllI[251], lIIIIIllI[56], lIIIIIllI[36], lIIIIIllI[2]);
    }

    public static double u() {
        return (Skills.getBoostedLevel(Skill.HITPOINTS) / Skills.getLevel(Skill.HITPOINTS)) * 100.0d;
    }

    public static int t() {
        return Z[c(lIIIIIllI[2], Z.length - lIIIIIllI[0])];
    }

    public static int j(int i) {
        return ((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarpValue(i));
        })).intValue();
    }

    private static String llIlIllllIl(String lIIlIlIIIlllIIl, String lIIlIlIIIllIllI) {
        try {
            SecretKeySpec lIIlIlIIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlIIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIlIIIlllIll = Cipher.getInstance("Blowfish");
            lIIlIlIIIlllIll.init(lIIIIIllI[3], lIIlIlIIIllllII);
            return new String(lIIlIlIIIlllIll.doFinal(Base64.getDecoder().decode(lIIlIlIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIlIIIlllIlI) {
            lIIlIlIIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static void llIllIIIIll() {
        lIIIIIlII = new String[lIIIIIllI[20]];
        lIIIIIlII[lIIIIIllI[2]] = llIlIllllIl("9eRPQQZ5lrxKO2+8zI3rWw==", "kZSZa");
        lIIIIIlII[lIIIIIllI[0]] = llIllIIIIIl("PgMjLQ0TQjssDgVCLiEAAg==", "vbMIa");
        lIIIIIlII[lIIIIIllI[3]] = llIlIllllIl("1qr4Sa263cNSHNp8Vk1MeSbSYMelVjp4", "VOpkM");
        lIIIIIlII[lIIIIIllI[1]] = llIllIIIIlI("SLzeF/gTX/0MnHb6i47RtN5x9BcfD432", "ZdPTp");
        lIIIIIlII[lIIIIIllI[4]] = llIllIIIIlI("NIy5MKl5Camuqrwnq8PY8L6A13mzcLJx", "uWHQY");
        lIIIIIlII[lIIIIIllI[5]] = llIllIIIIlI("2+0q8EY30ZU=", "OtkUz");
        lIIIIIlII[lIIIIIllI[6]] = llIlIllllIl("MZGkt5pp2A7BdiQLbvhJiIakvMi2qUyJ", "SQGqx");
        lIIIIIlII[lIIIIIllI[7]] = llIllIIIIlI("BA/Lhua+mYmRE0A1S54tNnuC9D9GVqXd", "ZjcNb");
        lIIIIIlII[lIIIIIllI[8]] = llIlIllllIl("7d1ielJ6p3v1v2KydGn4+niXRrc63cC2", "dvdch");
        lIIIIIlII[lIIIIIllI[9]] = llIlIllllIl("B20pu4EWGlMypAUE5Ic9zqiyTR11vJ8P", "wbCMw");
        lIIIIIlII[lIIIIIllI[10]] = llIllIIIIlI("DJNb8zOB3+ED0Ods9pblatKfSZ18tL4t", "hVKYj");
        lIIIIIlII[lIIIIIllI[11]] = llIllIIIIlI("AbJUlMVilvA=", "LXplH");
        lIIIIIlII[lIIIIIllI[12]] = llIlIllllIl("FL0yLY4YhDV89Ap8uRTEbNgjHTMd+SBdud/3tXsoy6W6rXXHFr8ZxpNawisIDaGBbUnJxA4yX7o=", "XiAVK");
        lIIIIIlII[lIIIIIllI[13]] = llIlIllllIl("EDgakyGF9nQ9t6fcNW0hHA==", "lanlI");
        lIIIIIlII[lIIIIIllI[16]] = llIllIIIIlI("a8SMFfVIv+Q=", "jWMAv");
        lIIIIIlII[lIIIIIllI[17]] = llIllIIIIIl("CDcgUAMpdgARBTQ5NRtXEXY0ERkt", "FVVpw");
        lIIIIIlII[lIIIIIllI[23]] = llIlIllllIl("RyfVUSUkiYc=", "Geupf");
        lIIIIIlII[lIIIIIllI[24]] = llIlIllllIl("dF/wVhBSJk4YLZ5I2twY+gs+Uagtlm7F", "gYbPq");
        lIIIIIlII[lIIIIIllI[27]] = llIlIllllIl("5JUO3Rt096SVMA19FgwqeQ==", "SPdzx");
        lIIIIIlII[lIIIIIllI[29]] = llIlIllllIl("Zu5fscgkv3U=", "givLo");
        lIIIIIlII[lIIIIIllI[30]] = llIllIIIIIl("OQcAMQQI", "mhgVh");
        lIIIIIlII[lIIIIIllI[33]] = llIlIllllIl("J0+aKiTpcL0=", "KzqBE");
        lIIIIIlII[lIIIIIllI[36]] = llIllIIIIlI("xcifxKxg2ywstPzM8IUYtg==", "Zyepp");
        lIIIIIlII[lIIIIIllI[26]] = llIlIllllIl("T+8bJwaaNt8=", "PJDWw");
        lIIIIIlII[lIIIIIllI[37]] = llIlIllllIl("rzB09mlQz+k=", "eFGaF");
        lIIIIIlII[lIIIIIllI[38]] = llIlIllllIl("mAFYSd4jPyk=", "CsMmQ");
        lIIIIIlII[lIIIIIllI[39]] = llIlIllllIl("7a3CiS5vGeA=", "xRGmJ");
        lIIIIIlII[lIIIIIllI[40]] = llIllIIIIIl("FjoNAyo=", "SKxjZ");
        lIIIIIlII[lIIIIIllI[41]] = llIlIllllIl("i/AcAYo7R90=", "FrKcT");
        lIIIIIlII[lIIIIIllI[15]] = llIllIIIIIl("KyoBJkwBJlciTDwIVzAHGS8bbQ==", "lCwCl");
        lIIIIIlII[lIIIIIllI[54]] = llIllIIIIIl("JTkXTwYEeA4aBhgxBQpSDDkVCg==", "kXaor");
        lIIIIIlII[lIIIIIllI[55]] = llIllIIIIIl("HSsxPQ==", "ZJEXy");
        lIIIIIlII[lIIIIIllI[35]] = llIllIIIIIl("NhE/Kg==", "yaZDv");
        lIIIIIlII[lIIIIIllI[56]] = llIlIllllIl("B0pm2S9+ghsOdtNkELUoZPrJvePFu1FT", "PBavU");
        lIIIIIlII[lIIIIIllI[57]] = llIllIIIIIl("HBsbaQY9Wh49AD0UCiEdPh5NPRs+Hw==", "RzmIr");
        lIIIIIlII[lIIIIIllI[47]] = llIllIIIIlI("gCo+cjQuHCc=", "xopzP");
        lIIIIIlII[lIIIIIllI[60]] = llIllIIIIlI("zyswbv5fVpdQIwq3NhnkqA==", "gETxR");
        lIIIIIlII[lIIIIIllI[61]] = llIllIIIIlI("BGi7mdwDL2/rPDiiVShK4P7nMJJeI05x", "vWbgk");
        lIIIIIlII[lIIIIIllI[65]] = llIllIIIIIl("MgYcLVYBFhwjGhoSHCc=", "sshBv");
        lIIIIIlII[lIIIIIllI[66]] = llIllIIIIIl("CScsOUo6Nyw3BiEzLDM=", "HRXVj");
        lIIIIIlII[lIIIIIllI[21]] = llIllIIIIlI("vlDKFbU8BgEt5pNxyFoi/g==", "xdCio");
        lIIIIIlII[lIIIIIllI[32]] = llIlIllllIl("7NxBiaEUyBcRbogXuJkFag==", "hFFLQ");
        lIIIIIlII[lIIIIIllI[67]] = llIllIIIIlI("235TLXiJXlw=", "sLdXU");
        lIIIIIlII[lIIIIIllI[68]] = llIlIllllIl("owICXjVa55I=", "zvSfr");
        lIIIIIlII[lIIIIIllI[69]] = llIllIIIIlI("NdTvKLJgZ8E=", "yXgLs");
        lIIIIIlII[lIIIIIllI[70]] = llIlIllllIl("rDb4xtakr/M=", "plHeD");
        lIIIIIlII[lIIIIIllI[74]] = llIlIllllIl("FxcR3Z3dctk=", "ALTfQ");
        lIIIIIlII[lIIIIIllI[76]] = llIllIIIIlI("tIaZNZb7j/w=", "VrfIo");
        lIIIIIlII[lIIIIIllI[77]] = llIlIllllIl("I5xX65/7JFI=", "vzaTk");
        lIIIIIlII[lIIIIIllI[78]] = llIlIllllIl("EEfywg778ss=", "gSpbh");
        lIIIIIlII[lIIIIIllI[71]] = llIllIIIIIl("MR0JAA==", "ytnha");
        lIIIIIlII[lIIIIIllI[81]] = llIllIIIIIl("Jj0EPRwPKw==", "jXeZi");
        lIIIIIlII[lIIIIIllI[82]] = llIllIIIIIl("FiYRKA==", "TCeIW");
        lIIIIIlII[lIIIIIllI[83]] = llIllIIIIIl("Li8aDw==", "LJnnR");
        lIIIIIlII[lIIIIIllI[84]] = llIllIIIIIl("AzIWAxkmOQ==", "GWwgt");
        lIIIIIlII[lIIIIIllI[85]] = llIllIIIIlI("fchO42zUrK0=", "NJqBW");
        lIIIIIlII[lIIIIIllI[86]] = llIlIllllIl("S5XHPwhBC1az7i1wBE6d4w==", "yUXOT");
        lIIIIIlII[lIIIIIllI[87]] = llIlIllllIl("GLL5hTZu/uw=", "Rmzok");
        lIIIIIlII[lIIIIIllI[88]] = llIllIIIIIl("JAYcNA==", "fchUf");
        lIIIIIlII[lIIIIIllI[90]] = llIllIIIIIl("Bw4lEWcHCCQGJiUIOwwyJA==", "WaWeG");
        lIIIIIlII[lIIIIIllI[91]] = llIllIIIIlI("C9TnURHMQgRb0ItXG1Jpk8FHUxI7dHAw03KNfqknb+pIscbTwsEtf4ZemuhDwWtDJwYjkVaoBE0=", "QXFWr");
    }

    public static void a(HashMap<Integer, Integer> hashMap, boolean z, boolean z2) {
        int i;
        if (llIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(Y), lIIIIIllI[4])) {
            AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[17]];
            WorldArea worldArea = new WorldArea(lIIIIIllI[18], lIIIIIllI[19], lIIIIIllI[20], lIIIIIllI[21], lIIIIIllI[2]);
            int[] iArr = new int[lIIIIIllI[0]];
            iArr[lIIIIIllI[2]] = lIIIIIllI[22];
            boolean contains = Inventory.contains(iArr);
            if (llIllIIIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                i = lIIIIIllI[0];
                "".length();
                if ((((101 ^ 47) ^ (49 ^ 88)) & (((((141 + 73) - 51) + 3) ^ (((28 + 61) - 57) + 101)) ^ (-" ".length()))) >= ((((96 + 166) - 177) + 97) ^ (((22 + 132) - 25) + 49))) {
                    return;
                }
            } else {
                i = lIIIIIllI[2];
            }
            if (llIllIIIlll((contains ? 1 : 0) & i)) {
                int[] iArr2 = new int[lIIIIIllI[0]];
                iArr2[lIIIIIllI[2]] = lIIIIIllI[22];
                Inventory.getFirst(iArr2).interact(lIIIIIlII[lIIIIIllI[23]]);
                Time.sleepTicks(lIIIIIllI[8]);
                "".length();
            }
            Movement.walkTo(Y);
            "".length();
            Time.sleepTicks(lIIIIIllI[0]);
            "".length();
        }
        if (llIllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(Y), lIIIIIllI[4])) {
            if (llIllIIIlIl(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
            }
            AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[24]];
            if (llIllIIIlll(z ? 1 : 0) && llIllIIllll(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks(lIIIIIllI[4]);
                "".length();
            }
            int lIIlIlIlIlIlllI = z2 ? 1 : 0;
            if (llIllIIIlll(lIIlIlIlIlIlllI) && llIllIIllll(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks(lIIIIIllI[3]);
                "".length();
            }
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                int lIIlIlIlIlIlIll = entry.getKey().intValue();
                int lIIlIlIlIlIlIlI = entry.getValue().intValue();
                System.out.println("Key: " + lIIlIlIlIlIlIll + ", Value: " + lIIlIlIlIlIlIlI);
                C0000a.a(lIIlIlIlIlIlIll, lIIlIlIlIlIlIlI);
                Time.sleepTicks(lIIIIIllI[0]);
                "".length();
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
        }
    }

    public static String b(long j) {
        String str = lIIIIIlII[lIIIIIllI[11]];
        Object[] objArr = new Object[lIIIIIllI[0]];
        objArr[lIIIIIllI[2]] = Integer.valueOf(lIIIIIllI[3]);
        String format = String.format(str, objArr);
        long j2 = j / 1000;
        Object[] objArr2 = new Object[lIIIIIllI[0]];
        objArr2[lIIIIIllI[2]] = Long.valueOf(j2 % 60);
        String format2 = String.format(format, objArr2);
        Object[] objArr3 = new Object[lIIIIIllI[0]];
        objArr3[lIIIIIllI[2]] = Long.valueOf((j2 % 3600) / 60);
        String format3 = String.format(format, objArr3);
        Object[] objArr4 = new Object[lIIIIIllI[0]];
        objArr4[lIIIIIllI[2]] = Long.valueOf(j2 / 3600);
        return String.format(format, objArr4) + ":" + format3 + ":" + format2;
    }

    private static boolean llIllIIlllI(Object obj) {
        return obj == null;
    }

    public static int H() {
        return j(lIIIIIllI[73]);
    }

    public static void l(int i) {
        int[] iArr = new int[lIIIIIllI[0]];
        iArr[lIIIIIllI[2]] = i;
        if (llIllIIIlll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIIIllI[0]];
            iArr2[lIIIIIllI[2]] = i;
            if (llIllIIIlIl(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIIIllI[0]];
                iArr3[lIIIIIllI[2]] = i;
                Item first = Inventory.getFirst(iArr3);
                String[] strArr = new String[lIIIIIllI[0]];
                strArr[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[26]];
                if (llIllIIIlll(first.hasAction(strArr) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIIIIllI[0]];
                    iArr4[lIIIIIllI[2]] = i;
                    Inventory.getFirst(iArr4).interact(lIIIIIlII[lIIIIIllI[37]]);
                }
                int[] iArr5 = new int[lIIIIIllI[0]];
                iArr5[lIIIIIllI[2]] = i;
                Item first2 = Inventory.getFirst(iArr5);
                String[] strArr2 = new String[lIIIIIllI[0]];
                strArr2[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[38]];
                if (llIllIIIlll(first2.hasAction(strArr2) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIIIIllI[0]];
                    iArr6[lIIIIIllI[2]] = i;
                    Inventory.getFirst(iArr6).interact(lIIIIIlII[lIIIIIllI[39]]);
                }
                int[] iArr7 = new int[lIIIIIllI[0]];
                iArr7[lIIIIIllI[2]] = i;
                Item first3 = Inventory.getFirst(iArr7);
                String[] strArr3 = new String[lIIIIIllI[0]];
                strArr3[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[40]];
                if (llIllIIIlll(first3.hasAction(strArr3) ? 1 : 0)) {
                    int[] iArr8 = new int[lIIIIIllI[0]];
                    iArr8[lIIIIIllI[2]] = i;
                    Inventory.getFirst(iArr8).interact(lIIIIIlII[lIIIIIllI[41]]);
                }
                if (llIllIIIllI(i, lIIIIIllI[42])) {
                    Time.sleepTicks(lIIIIIllI[1]);
                    "".length();
                    String[] strArr4 = new String[lIIIIIllI[0]];
                    strArr4[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[15]];
                    C0006g.a(strArr4);
                    Time.sleepTicks(lIIIIIllI[0]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public static void a(String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod(lIIIIIlII[lIIIIIllI[47]]);
            httpURLConnection.setRequestProperty(lIIIIIlII[lIIIIIllI[60]], lIIIIIlII[lIIIIIllI[61]]);
            httpURLConnection.setDoOutput(lIIIIIllI[0]);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes("{\"content\": \"" + str2 + "\"}");
            dataOutputStream.flush();
            dataOutputStream.close();
            double lIIlIlIlIIIlIlI = httpURLConnection.getResponseCode();
            System.out.println("Response Code: " + lIIlIlIlIIIlIlI);
            httpURLConnection.disconnect();
            "".length();
            if ((-" ".length()) == "  ".length()) {
            }
        } catch (Exception lIIlIlIlIIIlllI) {
            lIIlIlIlIIIlllI.printStackTrace();
        }
    }

    public static void A() {
        Widget widget = Widgets.get(lIIIIIllI[34], lIIIIIllI[35]);
        if (llIllIIlIll(widget)) {
            widget.interact(lIIIIIlII[lIIIIIllI[36]]);
            Time.sleepTicks(lIIIIIllI[0]);
            "".length();
        }
    }

    private static boolean llIllIIlIll(Object obj) {
        return obj != null;
    }

    private static boolean llIllIIlIIl(int i, int i2) {
        return i > i2;
    }

    public static void v() {
        if (llIllIIIlll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks(lIIIIIllI[4]);
            "".length();
        }
        if (llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIllIIIlIl(Bank.isOpen() ? 1 : 0)) {
            B();
        }
    }

    private static boolean llIllIIIllI(int i, int i2) {
        return i == i2;
    }

    public static long s() {
        return V + ((System.nanoTime() - W) / 1000000);
    }

    private static boolean llIllIIllII(int i, int i2) {
        return i < i2;
    }

    public static String h(int i) {
        return NumberFormat.getNumberInstance(Locale.US).format(i);
    }

    public static void k(int i) {
        if (llIllIIllIl(Static.getClient().getWorld(), i)) {
            World findWorld = Static.getWorldService().getWorlds().findWorld(i);
            if (llIllIIlllI(findWorld)) {
                return;
            }
            if (llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
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
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean b(int[] iArr) {
        int i = lIIIIIllI[2];
        while (llIllIIllII(i, iArr.length)) {
            if (llIllIIIlIl(i(iArr[i]) ? 1 : 0)) {
                System.out.println("Missing ID: " + iArr[i]);
                return lIIIIIllI[2];
            }
            i++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true);
            }
        }
        return lIIIIIllI[0];
    }

    public static void c(WorldPoint worldPoint) {
        int i;
        int i2;
        Client client = Static.getClient();
        if (llIllIIlllI(client.getLocalPlayer())) {
            return;
        }
        int x = worldPoint.getX() - client.getBaseX();
        int lIIlIlIIllllIll = worldPoint.getY() - client.getBaseY();
        Point localToCanvas = Perspective.localToCanvas(client, LocalPoint.fromScene(x, lIIlIlIIllllIll), client.getPlane());
        if (llIllIIlIll(localToCanvas)) {
            i = localToCanvas.getX();
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return;
            }
        } else {
            i = lIIIIIllI[62];
        }
        int i3 = i;
        if (llIllIIlIll(localToCanvas)) {
            i2 = localToCanvas.getY();
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
        } else {
            i2 = lIIIIIllI[62];
        }
        client.interact(lIIIIIllI[2], MenuAction.WALK.getId(), x, lIIlIlIIllllIll, i3, i2);
    }

    public static void B() {
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (llIllIIIlll(world.isMembers() ? 1 : 0) && llIllIIlIlI(world.getPlayerCount(), lIIIIIllI[75]) && llIllIIllIl(world.getId(), Worlds.getCurrentId()) && llIllIIIlIl(world.getActivity().endsWith(lIIIIIlII[lIIIIIllI[76]]) ? 1 : 0) && llIllIIIlIl(world.getActivity().endsWith(lIIIIIlII[lIIIIIllI[77]]) ? 1 : 0) && llIllIIIlIl(world.getActivity().startsWith(lIIIIIlII[lIIIIIllI[78]]) ? 1 : 0) && llIllIIIlIl(world.getActivity().startsWith(lIIIIIlII[lIIIIIllI[71]]) ? 1 : 0) && llIllIIllIl(world.getId(), lIIIIIllI[79]) && llIllIIllIl(world.getId(), lIIIIIllI[80]) && llIllIIllIl(world.getId(), lIIIIIllI[80]) && llIllIIIlIl(world.getActivity().contains(lIIIIIlII[lIIIIIllI[81]]) ? 1 : 0) && llIllIIIlIl(world.getActivity().contains(lIIIIIlII[lIIIIIllI[82]]) ? 1 : 0) && llIllIIIlIl(world.getActivity().contains(lIIIIIlII[lIIIIIllI[83]]) ? 1 : 0) && llIllIIIlIl(world.getActivity().startsWith(lIIIIIlII[lIIIIIllI[84]]) ? 1 : 0) && llIllIIIlIl(world.getActivity().endsWith(lIIIIIlII[lIIIIIllI[85]]) ? 1 : 0) && llIllIIIlIl(world.getActivity().endsWith(lIIIIIlII[lIIIIIllI[86]]) ? 1 : 0) && llIllIIIlIl(world.getActivity().endsWith(lIIIIIlII[lIIIIIllI[87]]) ? 1 : 0) && llIllIIIlIl(world.getActivity().startsWith(lIIIIIlII[lIIIIIllI[88]]) ? 1 : 0) && llIllIIlIIl(world.getPlayerCount(), lIIIIIllI[89])) {
                ?? r0 = lIIIIIllI[0];
                "".length();
                return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIIIIllI[2];
        }));
    }

    public static int c(int lIIlIlIllIIlllI, int i) {
        int i2 = i - lIIlIlIllIIlllI;
        if (llIllIIIlIl(i2)) {
            return lIIlIlIllIIlllI;
        }
        if (llIllIIIllI(Math.abs(i2), lIIIIIllI[0])) {
            if (llIllIIIlll(S.nextBoolean() ? 1 : 0)) {
                "".length();
                return (-" ".length()) >= " ".length() ? ((128 ^ 145) ^ (103 ^ 126)) & (((158 ^ 148) ^ "  ".length()) ^ (-" ".length())) : lIIlIlIllIIlllI;
            }
            return i;
        }
        if (llIllIIlIII(i2)) {
            lIIlIlIllIIlllI = i;
            i = lIIlIlIllIIlllI;
        }
        return lIIlIlIllIIlllI + S.nextInt((i - lIIlIlIllIIlllI) + lIIIIIllI[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public static boolean F() {
        if (llIllIIIlIl(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIIlIl(U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(aa), lIIIIIllI[71]) && !llIllIIIlll(ab.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIllI[2];
        }
        ?? r0 = lIIIIIllI[0];
        "".length();
        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void y() {
        if (llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIllIIIlll(x() ? 1 : 0)) {
            if (llIllIIIlIl(z() ? 1 : 0)) {
                A();
            }
            if (llIllIIIlll(z() ? 1 : 0)) {
                Widget widget = Widgets.get(lIIIIIllI[25], lIIIIIllI[26], lIIIIIllI[7]);
                if (llIllIIlIll(widget)) {
                    widget.interact(lIIIIIlII[lIIIIIllI[27]]);
                    Time.sleepTicks(lIIIIIllI[0]);
                    "".length();
                }
                if (llIllIIIlIl(Vars.getBit(lIIIIIllI[28]))) {
                    Widget widget2 = Widgets.get(lIIIIIllI[25], lIIIIIllI[29], lIIIIIllI[21]);
                    if (llIllIIlIll(widget2)) {
                        if (llIllIIIlIl(widget2.isVisible() ? 1 : 0)) {
                            Widget widget3 = Widgets.get(lIIIIIllI[25], lIIIIIllI[30], lIIIIIllI[5]);
                            Mouse.click(widget3.getClickPoint().getX(), widget3.getClickPoint().getY(), (boolean) lIIIIIllI[0]);
                            Time.sleepTicks(lIIIIIllI[0]);
                            "".length();
                        }
                        if (llIllIIIlll(widget2.isVisible() ? 1 : 0)) {
                            widget2.interact(lIIIIIlII[lIIIIIllI[29]]);
                            Time.sleepTicks(lIIIIIllI[0]);
                            "".length();
                        }
                    }
                }
                if (llIllIIIlIl(Vars.getBit(lIIIIIllI[31]))) {
                    Widget widget4 = Widgets.get(lIIIIIllI[25], lIIIIIllI[29], lIIIIIllI[32]);
                    if (llIllIIlIll(widget4)) {
                        if (llIllIIIlIl(widget4.isVisible() ? 1 : 0)) {
                            Widget widget5 = Widgets.get(lIIIIIllI[25], lIIIIIllI[30], lIIIIIllI[5]);
                            Mouse.click(widget5.getClickPoint().getX(), widget5.getClickPoint().getY(), (boolean) lIIIIIllI[0]);
                            Time.sleepTicks(lIIIIIllI[0]);
                            "".length();
                        }
                        if (llIllIIIlll(widget4.isVisible() ? 1 : 0)) {
                            widget4.interact(lIIIIIlII[lIIIIIllI[30]]);
                            Time.sleepTicks(lIIIIIllI[3]);
                            "".length();
                        }
                    }
                }
            }
        }
        Widget widget6 = Widgets.get(lIIIIIllI[25], lIIIIIllI[4]);
        if (llIllIIlIll(widget6)) {
            widget6.interact(lIIIIIlII[lIIIIIllI[33]]);
            Time.sleepTicks(lIIIIIllI[0]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean x() {
        if (!llIllIIIlll(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lIIIIIllI[28]));
        })).intValue()) || llIllIIIlIl(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(lIIIIIllI[31]));
        })).intValue())) {
            ?? r0 = lIIIIIllI[0];
            "".length();
            return " ".length() < 0 ? ((200 ^ 175) ^ (114 ^ 6)) & (((222 ^ 191) ^ (232 ^ 154)) ^ (-" ".length())) : r0;
        }
        return lIIIIIllI[2];
    }

    private static boolean llIllIIlIlI(int i, int i2) {
        return i <= i2;
    }

    public static void b(WorldPoint worldPoint) {
        WorldPoint worldPoint2 = new WorldPoint(lIIIIIllI[43], lIIIIIllI[44], lIIIIIllI[2]);
        WorldArea worldArea = new WorldArea(lIIIIIllI[45], lIIIIIllI[46], lIIIIIllI[9], lIIIIIllI[47], lIIIIIllI[2]);
        WorldArea worldArea2 = new WorldArea(lIIIIIllI[48], lIIIIIllI[49], lIIIIIllI[50], lIIIIIllI[51], lIIIIIllI[2]);
        if (llIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIIIllI[6]) && llIllIIIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIIlIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIllI[52], lIIIIIllI[53], lIIIIIllI[0])), lIIIIIllI[30])) {
            AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[54]];
            if (llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(worldPoint2);
            "".length();
            Time.sleepTicks(lIIIIIllI[0]);
            "".length();
        }
        if (llIllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIIIllI[6]) && llIllIIlIlI(Players.getLocal().getWorldLocation().getY(), lIIIIIllI[44])) {
            if (llIllIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr = new String[lIIIIIllI[0]];
                strArr[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[55]];
                TileObjects.getNearest(strArr).interact(lIIIIIlII[lIIIIIllI[35]]);
                Time.sleepTicks(lIIIIIllI[3]);
                "".length();
            }
            if (llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr2 = new String[lIIIIIllI[0]];
                strArr2[lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[56]];
                C0006g.a(strArr2);
            }
        }
        if (llIllIIlIIl(Players.getLocal().getWorldLocation().getY(), lIIIIIllI[44])) {
            if (llIllIIIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIllIIIlIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !llIllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIllI[52], lIIIIIllI[53], lIIIIIllI[0])), lIIIIIllI[30])) {
                return;
            }
            AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[57]];
            if (llIllIIIlll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIIIllI[43], lIIIIIllI[58], lIIIIIllI[2])) ? 1 : 0)) {
                c(new WorldPoint(lIIIIIllI[43], lIIIIIllI[59], lIIIIIllI[2]));
                Time.sleepTicks(lIIIIIllI[6]);
                "".length();
            }
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIIIIllI[0]);
            "".length();
        }
    }

    private static void llIllIIIlII() {
        lIIIIIllI = new int[252];
        lIIIIIllI[0] = " ".length();
        lIIIIIllI[1] = "   ".length();
        lIIIIIllI[2] = ((83 ^ 67) ^ (90 ^ 114)) & (((169 ^ 173) ^ (251 ^ 199)) ^ (-" ".length()));
        lIIIIIllI[3] = "  ".length();
        lIIIIIllI[4] = (24 ^ 23) ^ (58 ^ 49);
        lIIIIIllI[5] = 192 ^ 197;
        lIIIIIllI[6] = 137 ^ 143;
        lIIIIIllI[7] = 41 ^ 46;
        lIIIIIllI[8] = (((77 + 2) - 70) + 124) ^ (((2 + 37) - 18) + 120);
        lIIIIIllI[9] = (230 ^ 186) ^ (92 ^ 9);
        lIIIIIllI[10] = (114 ^ 51) ^ (58 ^ 113);
        lIIIIIllI[11] = 201 ^ 194;
        lIIIIIllI[12] = 177 ^ 189;
        lIIIIIllI[13] = (85 ^ 15) ^ (221 ^ 138);
        lIIIIIllI[14] = (-((-25666) & 28007)) & (-13315) & 16319;
        lIIIIIllI[15] = 191 ^ 162;
        lIIIIIllI[16] = (80 ^ 118) ^ (93 ^ 117);
        lIIIIIllI[17] = (((57 + 100) - 101) + 128) ^ (((61 + 72) - 38) + 88);
        lIIIIIllI[18] = (-24735) & 27902;
        lIIIIIllI[19] = (-((-2117) & 10989)) & (-2) & 12287;
        lIIIIIllI[20] = (28 ^ 6) ^ (42 ^ 13);
        lIIIIIllI[21] = (74 ^ 81) ^ (79 ^ 124);
        lIIIIIllI[22] = (-((-6919) & 15295)) & (-1) & 16383;
        lIIIIIllI[23] = (75 ^ 125) ^ (158 ^ 184);
        lIIIIIllI[24] = 189 ^ 172;
        lIIIIIllI[25] = (((96 ^ 74) + (154 ^ 141)) - (188 ^ 158)) + (6 ^ 97);
        lIIIIIllI[26] = (54 ^ 87) ^ (118 ^ 0);
        lIIIIIllI[27] = 101 ^ 119;
        lIIIIIllI[28] = (-((-9323) & 9979)) & (-17410) & 32765;
        lIIIIIllI[29] = (38 ^ 34) ^ (171 ^ 188);
        lIIIIIllI[30] = 183 ^ 163;
        lIIIIIllI[31] = (-((-13345) & 30371)) & (-1025) & 32751;
        lIIIIIllI[32] = 93 ^ 116;
        lIIIIIllI[33] = 107 ^ 126;
        lIIIIIllI[34] = (62 ^ 110) ^ (189 ^ 153);
        lIIIIIllI[35] = 64 ^ 96;
        lIIIIIllI[36] = 152 ^ 142;
        lIIIIIllI[37] = (((76 + 131) - 196) + 132) ^ (((149 + 125) - 190) + 67);
        lIIIIIllI[38] = (((54 + 87) - 97) + 88) ^ (((4 + 124) - 14) + 43);
        lIIIIIllI[39] = (247 ^ 154) ^ (78 ^ 57);
        lIIIIIllI[40] = (100 ^ 113) ^ (166 ^ 168);
        lIIIIIllI[41] = 190 ^ 162;
        lIIIIIllI[42] = (-((-6233) & 15993)) & (-131) & 32447;
        lIIIIIllI[43] = (-((-3217) & 32435)) & (-1) & 31679;
        lIIIIIllI[44] = (-4801) & 8183;
        lIIIIIllI[45] = (-29253) & 31709;
        lIIIIIllI[46] = (-((-1674) & 5773)) & (-24773) & 32255;
        lIIIIIllI[47] = (200 ^ 132) ^ (89 ^ 54);
        lIIIIIllI[48] = (-16897) & 19319;
        lIIIIIllI[49] = (-((-1283) & 5571)) & (-8193) & 15871;
        lIIIIIllI[50] = (((28 + 121) - 7) + 85) ^ (((155 + 1) - 97) + 105);
        lIIIIIllI[51] = ((79 + 66) - 104) + 102;
        lIIIIIllI[52] = (-9827) & 12286;
        lIIIIIllI[53] = (-((-73) & 713)) & (-8193) & 12249;
        lIIIIIllI[54] = 39 ^ 57;
        lIIIIIllI[55] = (15 ^ 42) ^ (49 ^ 11);
        lIIIIIllI[56] = (42 ^ 74) ^ (74 ^ 11);
        lIIIIIllI[57] = (104 ^ 122) ^ (0 ^ 48);
        lIIIIIllI[58] = (-21059) & 24443;
        lIIIIIllI[59] = (-((-469) & 25591)) & (-25) & 28543;
        lIIIIIllI[60] = (34 ^ 76) ^ (218 ^ 144);
        lIIIIIllI[61] = (((109 + 0) - 58) + 112) ^ (((43 + 68) - 90) + 113);
        lIIIIIllI[62] = -" ".length();
        lIIIIIllI[63] = (((31 ^ 38) + " ".length()) - (-(25 ^ 125))) + (143 ^ 129);
        lIIIIIllI[64] = (-((-25) & 15803)) & (-16389) & 32759;
        lIIIIIllI[65] = 11 ^ 45;
        lIIIIIllI[66] = (209 ^ 148) ^ (17 ^ 115);
        lIIIIIllI[67] = 67 ^ 105;
        lIIIIIllI[68] = (246 ^ 132) ^ (218 ^ 131);
        lIIIIIllI[69] = 72 ^ 100;
        lIIIIIllI[70] = (((102 + 7) - 95) + 163) ^ (((82 + 125) - 141) + 90);
        lIIIIIllI[71] = (((107 + 123) - 165) + 84) ^ (((102 + 164) - 175) + 76);
        lIIIIIllI[72] = ((19 + 26) - (-74)) + 34;
        lIIIIIllI[73] = 108 ^ 9;
        lIIIIIllI[74] = 156 ^ 178;
        lIIIIIllI[75] = (-10305) & 12254;
        lIIIIIllI[76] = (((17 + 43) - 35) + 104) ^ (((32 + 104) - 22) + 60);
        lIIIIIllI[77] = (181 ^ 176) ^ (72 ^ 125);
        lIIIIIllI[78] = 64 ^ 113;
        lIIIIIllI[79] = (-29190) & 29663;
        lIIIIIllI[80] = (-3073) & 3605;
        lIIIIIllI[81] = (231 ^ 153) ^ (240 ^ 189);
        lIIIIIllI[82] = (32 ^ 112) ^ (73 ^ 45);
        lIIIIIllI[83] = (((132 + 97) - 124) + 85) ^ (((76 + 72) - 31) + 22);
        lIIIIIllI[84] = (((57 + 73) - 77) + 87) ^ (((147 + 59) - 74) + 54);
        lIIIIIllI[85] = 115 ^ 68;
        lIIIIIllI[86] = 57 ^ 1;
        lIIIIIllI[87] = 171 ^ 146;
        lIIIIIllI[88] = (((107 + 72) - 59) + 42) ^ (((39 + 84) - 12) + 41);
        lIIIIIllI[89] = 164 ^ 192;
        lIIIIIllI[90] = 46 ^ 21;
        lIIIIIllI[91] = 28 ^ 32;
        lIIIIIllI[92] = (-12545) & 15734;
        lIIIIIllI[93] = (-((-3833) & 32507)) & (-897) & 32767;
        lIIIIIllI[94] = (-((-7943) & 16263)) & (-1) & 11518;
        lIIIIIllI[95] = (-((-12178) & 28573)) & (-4705) & 24303;
        lIIIIIllI[96] = (-((-2385) & 31582)) & (-1) & 32381;
        lIIIIIllI[97] = (-29203) & 32639;
        lIIIIIllI[98] = (201 ^ 147) ^ (17 ^ 32);
        lIIIIIllI[99] = (-30726) & 31071;
        lIIIIIllI[100] = (-((-374) & 13175)) & (-18505) & 31611;
        lIIIIIllI[101] = (-((-19315) & 27507)) & (-3074) & 11575;
        lIIIIIllI[102] = (-((-1066) & 29759)) & (-643) & 29687;
        lIIIIIllI[103] = (-((-355) & 18943)) & (-4609) & 23551;
        lIIIIIllI[104] = (-((-17002) & 18171)) & (-8193) & 9717;
        lIIIIIllI[105] = (-30875) & 31231;
        lIIIIIllI[106] = (-6674) & 7031;
        lIIIIIllI[107] = (-31242) & 31627;
        lIIIIIllI[108] = (-((-16433) & 23669)) & (-8721) & 16351;
        lIIIIIllI[109] = (-((-4363) & 29999)) & (-2570) & 28671;
        lIIIIIllI[110] = (-"  ".length()) & (-7681) & 8175;
        lIIIIIllI[111] = (-((-133) & 31877)) & (-1) & 32239;
        lIIIIIllI[112] = (-1034) & 1529;
        lIIIIIllI[113] = (-6467) & 7002;
        lIIIIIllI[114] = (-((-897) & 32675)) & (-321) & 32614;
        lIIIIIllI[115] = (-29249) & 29562;
        lIIIIIllI[116] = (-((-9131) & 32683)) & (-8197) & 32239;
        lIIIIIllI[117] = (-((-3) & 29747)) & (-129) & 30206;
        lIIIIIllI[118] = (-6278) & 6631;
        lIIIIIllI[119] = (-3585) & 4061;
        lIIIIIllI[120] = (-((-5121) & 31917)) & (-17) & 27134;
        lIIIIIllI[121] = (-((-675) & 24227)) & (-8331) & 32187;
        lIIIIIllI[122] = (-((-291) & 32227)) & (-517) & 32767;
        lIIIIIllI[123] = (-26254) & 26623;
        lIIIIIllI[124] = (-28690) & 29013;
        lIIIIIllI[125] = (-9905) & 10229;
        lIIIIIllI[126] = (-((-26377) & 28591)) & (-28674) & 31215;
        lIIIIIllI[127] = (-29251) & 29695;
        lIIIIIllI[128] = (-((-18921) & 24555)) & (-10277) & 16374;
        lIIIIIllI[129] = (-((-19659) & 28395)) & (-7170) & 16383;
        lIIIIIllI[130] = (-7186) & 7675;
        lIIIIIllI[131] = (-17939) & 18430;
        lIIIIIllI[132] = (-23557) & 24063;
        lIIIIIllI[133] = (-18562) & 19083;
        lIIIIIllI[134] = (-((-2641) & 31346)) & (-2193) & 31227;
        lIIIIIllI[135] = (-((-4097) & 32291)) & (-4105) & 32763;
        lIIIIIllI[136] = (-((-1541) & 24311)) & (-8197) & 31478;
        lIIIIIllI[137] = (-4481) & 5039;
        lIIIIIllI[138] = (-27271) & 27647;
        lIIIIIllI[139] = (-((-6215) & 24263)) & (-8196) & 26575;
        lIIIIIllI[140] = (-((-39) & 14887)) & (-3) & 15355;
        lIIIIIllI[141] = (-11395) & 11731;
        lIIIIIllI[142] = (-((-16682) & 24063)) & (-8481) & 16375;
        lIIIIIllI[143] = (-((-24671) & 31487)) & (-25625) & 32767;
        lIIIIIllI[144] = (-13826) & 14305;
        lIIIIIllI[145] = (-((-24667) & 29823)) & (-17027) & 22526;
        lIIIIIllI[146] = (-19969) & 20447;
        lIIIIIllI[147] = (-25617) & 26109;
        lIIIIIllI[148] = (-30722) & 31063;
        lIIIIIllI[149] = (-16450) & 16895;
        lIIIIIllI[150] = (-14478) & 14797;
        lIIIIIllI[151] = (-13314) & 13663;
        lIIIIIllI[152] = (-29733) & 30053;
        lIIIIIllI[153] = (-25737) & 26077;
        lIIIIIllI[154] = (-31306) & 31727;
        lIIIIIllI[155] = (-((-13533) & 32477)) & (-1) & 19407;
        lIIIIIllI[156] = (-((-3141) & 16077)) & (-2) & 13311;
        lIIIIIllI[157] = (-5250) & 5625;
        lIIIIIllI[158] = (-25764) & 26099;
        lIIIIIllI[159] = (-21127) & 21455;
        lIIIIIllI[160] = (-5669) & 5999;
        lIIIIIllI[161] = 73 ^ 119;
        lIIIIIllI[162] = (-((-1389) & 24445)) & (-9249) & 32637;
        lIIIIIllI[163] = 141 ^ 178;
        lIIIIIllI[164] = (-7307) & 7610;
        lIIIIIllI[165] = 41 ^ 105;
        lIIIIIllI[166] = (-((-11210) & 32735)) & (-2689) & 24575;
        lIIIIIllI[167] = (((105 + 84) - 101) + 124) ^ (((68 + 39) - 16) + 58);
        lIIIIIllI[168] = (-((-9859) & 28343)) & (-5121) & 23927;
        lIIIIIllI[169] = 230 ^ 164;
        lIIIIIllI[170] = (-((-29639) & 32711)) & (-12805) & 16183;
        lIIIIIllI[171] = 241 ^ 178;
        lIIIIIllI[172] = (-((-4661) & 30333)) & (-4225) & 30205;
        lIIIIIllI[173] = (253 ^ 174) ^ (144 ^ 135);
        lIIIIIllI[174] = (-((-1041) & 7825)) & (-1097) & 8191;
        lIIIIIllI[175] = 73 ^ 12;
        lIIIIIllI[176] = (-((-1891) & 10091)) & (-22017) & 30591;
        lIIIIIllI[177] = (104 ^ 84) ^ (119 ^ 13);
        lIIIIIllI[178] = (-29189) & 29566;
        lIIIIIllI[179] = (-((-17921) & 30333)) & (-3073) & 15997;
        lIIIIIllI[180] = (9 ^ 125) ^ (18 ^ 46);
        lIIIIIllI[181] = (-9425) & 9727;
        lIIIIIllI[182] = 97 ^ 40;
        lIIIIIllI[183] = (-20097) & 20408;
        lIIIIIllI[184] = 14 ^ 68;
        lIIIIIllI[185] = (-((-275) & 28503)) & (-129) & 28669;
        lIIIIIllI[186] = (((36 + 74) - 77) + 201) ^ (((149 + 147) - 219) + 84);
        lIIIIIllI[187] = (-((-133) & 10949)) & (-4227) & 15359;
        lIIIIIllI[188] = (31 ^ 59) ^ (203 ^ 163);
        lIIIIIllI[189] = (-((-16769) & 30121)) & (-18433) & 32123;
        lIIIIIllI[190] = 246 ^ 187;
        lIIIIIllI[191] = (-((-108) & 29423)) & (-33) & 29687;
        lIIIIIllI[192] = 122 ^ 52;
        lIIIIIllI[193] = (-21633) & 21975;
        lIIIIIllI[194] = " ".length() ^ (226 ^ 172);
        lIIIIIllI[195] = (-513) & 859;
        lIIIIIllI[196] = (((54 + 42) - 38) + 173) ^ (((141 + 41) - 80) + 81);
        lIIIIIllI[197] = (-30756) & 31103;
        lIIIIIllI[198] = (((178 + 51) - 162) + 169) ^ (((82 + 111) - 164) + 160);
        lIIIIIllI[199] = (-((-1321) & 15657)) & (-16385) & 31071;
        lIIIIIllI[200] = 5 ^ 87;
        lIIIIIllI[201] = (-6785) & 7143;
        lIIIIIllI[202] = 58 ^ 105;
        lIIIIIllI[203] = (-((-20697) & 21211)) & (-15510) & 16383;
        lIIIIIllI[204] = 55 ^ 99;
        lIIIIIllI[205] = (-((-587) & 30411)) & (-2049) & 32239;
        lIIIIIllI[206] = 26 ^ 79;
        lIIIIIllI[207] = (-((-10594) & 32751)) & (-3) & 22527;
        lIIIIIllI[208] = (124 ^ 56) ^ (168 ^ 186);
        lIIIIIllI[209] = (-((-6467) & 14687)) & (-18433) & 27133;
        lIIIIIllI[210] = 54 ^ 97;
        lIIIIIllI[211] = (-((-25729) & 30357)) & (-16394) & 21503;
        lIIIIIllI[212] = (89 ^ 47) ^ (1 ^ 47);
        lIIIIIllI[213] = (-13852) & 14335;
        lIIIIIllI[214] = 63 ^ 102;
        lIIIIIllI[215] = (-((-6245) & 7807)) & (-1) & 2047;
        lIIIIIllI[216] = (27 ^ 36) ^ (92 ^ 57);
        lIIIIIllI[217] = (-((-419) & 4515)) & (-25090) & 29671;
        lIIIIIllI[218] = (((109 + 119) - 105) + 96) ^ (((28 + 19) - 1) + 82);
        lIIIIIllI[219] = (-((-16481) & 24169)) & (-17) & 8191;
        lIIIIIllI[220] = (((125 + 51) - 1) + 17) ^ (((26 + 101) - 68) + 97);
        lIIIIIllI[221] = (-11272) & 11759;
        lIIIIIllI[222] = 40 ^ 117;
        lIIIIIllI[223] = (-5637) & 6125;
        lIIIIIllI[224] = 96 ^ 62;
        lIIIIIllI[225] = (-((-161) & 20133)) & (-4097) & 24574;
        lIIIIIllI[226] = 107 ^ 52;
        lIIIIIllI[227] = (-((-16769) & 19331)) & (-13314) & 16383;
        lIIIIIllI[228] = (78 ^ 63) ^ (100 ^ 117);
        lIIIIIllI[229] = (-1027) & 1535;
        lIIIIIllI[230] = (((142 + 7) - (-81)) + 0) ^ (((43 + 15) - (-44)) + 33);
        lIIIIIllI[231] = (-13825) & 14334;
        lIIIIIllI[232] = (52 ^ 118) ^ (132 ^ 164);
        lIIIIIllI[233] = (-((-161) & 25249)) & (-7169) & 32767;
        lIIIIIllI[234] = 106 ^ 9;
        lIIIIIllI[235] = (-((-1797) & 8159)) & (-1025) & 7903;
        lIIIIIllI[236] = (-23018) & 23535;
        lIIIIIllI[237] = (-((-2569) & 27641)) & (-3073) & 28663;
        lIIIIIllI[238] = (((24 + 88) - 55) + 165) ^ (((96 + 5) - (-66)) + 17);
        lIIIIIllI[239] = (-((-25) & 12317)) & (-177) & 12988;
        lIIIIIllI[240] = (((167 + 123) - 231) + 174) ^ (((108 + 97) - 63) + 0);
        lIIIIIllI[241] = (-18643) & 19163;
        lIIIIIllI[242] = 243 ^ 155;
        lIIIIIllI[243] = (-25921) & 26443;
        lIIIIIllI[244] = "   ".length() ^ (110 ^ 4);
        lIIIIIllI[245] = (-7363) & 7886;
        lIIIIIllI[246] = (10 ^ 90) ^ (163 ^ 153);
        lIIIIIllI[247] = (-27715) & 28239;
        lIIIIIllI[248] = (-((-3482) & 32159)) & (-275) & 32159;
        lIIIIIllI[249] = (-((-13345) & 13933)) & (-12577) & 16383;
        lIIIIIllI[250] = (-((-16951) & 30327)) & (-16387) & 32719;
        lIIIIIllI[251] = (-4243) & 7574;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public static void G() {
        if (llIllIIIlIl(Widgets.get(lIIIIIllI[72]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get(lIIIIIllI[72], lIIIIIllI[23]);
            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) lIIIIIllI[0]);
            Time.sleepTicks(lIIIIIllI[1]);
            "".length();
        }
    }

    private static boolean llIllIIIlIl(int i) {
        return i == 0;
    }
}
