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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.n;
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

    public static boolean z() {
        boolean bl;
        if (e.llIllIIlIll(Widgets.get((int)lIIIIIllI[25], (int)lIIIIIllI[0]))) {
            bl = lIIIIIllI[0];
            0;
            if (-2 > 0) {
                return ((0x22 ^ 0x6C ^ (0x78 ^ 0)) & (123 + 167 - 231 + 116 ^ 48 + 124 - 158 + 139 ^ -1)) != 0;
            }
        } else {
            bl = lIIIIIllI[2];
        }
        return bl;
    }

    public static void E() {
        block9: {
            int lIIlIlIIllIllll = lIIIIIllI[2];
            do {
                String[] stringArray = new String[lIIIIIllI[0]];
                stringArray[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[21]];
                if (!e.llIllIIlIll(TileObjects.getNearest((String[])stringArray)) || !e.llIllIIIlIl(AccBuilderEasyClues.d ? 1 : 0)) break block9;
                AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[32]];
                String[] stringArray2 = new String[lIIIIIllI[0]];
                stringArray2[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[67]];
                NPC lIIlIlIIllIlllI = NPCs.getNearest((String[])stringArray2);
                if (e.llIllIIIlIl(lIIlIlIIllIllll)) {
                    if (e.llIllIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                        lIIlIlIIllIlllI.interact(lIIIIIlII[lIIIIIllI[68]]);
                    }
                    if (e.llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                        List lIIlIlIIllIllIl;
                        if (e.llIllIIIlIl(Dialog.canContinueNPC() ? 1 : 0) && e.llIllIIIlIl(Dialog.canContinue() ? 1 : 0) && e.llIllIIIlIl((lIIlIlIIllIllIl = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                            List lIIlIlIIllIllII = lIIlIlIIllIllIl.stream().filter(widget -> {
                                boolean bl;
                                if (e.llIllIIIlIl(widget.getText().contains(lIIIIIlII[lIIIIIllI[74]]) ? 1 : 0)) {
                                    bl = lIIIIIllI[0];
                                    0;
                                    if ((13 + 123 - 53 + 67 ^ 27 + 88 - 44 + 76) <= 0) {
                                        return ((0x7A ^ 0x2F ^ (0x45 ^ 0x1F)) & (0xC ^ 0x40 ^ (0xE6 ^ 0xA5) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIIIllI[2];
                                }
                                return bl;
                            }).collect(Collectors.toList());
                            if (e.llIllIIIlIl(lIIlIlIIllIllII.isEmpty() ? 1 : 0)) {
                                Mouse.click((int)((Widget)lIIlIlIIllIllII.get(lIIIIIllI[2])).getClickPoint().getX(), (int)((Widget)lIIlIlIIllIllII.get(lIIIIIllI[2])).getClickPoint().getY(), (boolean)lIIIIIllI[0]);
                                Time.sleepTicks((int)lIIIIIllI[1]);
                                0;
                            }
                            if (e.llIllIIIllI(lIIlIlIIllIllII.size(), lIIIIIllI[0])) {
                                lIIlIlIIllIllll = lIIIIIllI[0];
                            }
                        }
                        if (!e.llIllIIIlIl(Dialog.canContinueNPC() ? 1 : 0) || e.llIllIIIlll(Dialog.canContinue() ? 1 : 0)) {
                            Dialog.continueSpace();
                        }
                    }
                }
                if (e.llIllIIIlll(lIIlIlIIllIllll)) {
                    String[] stringArray3 = new String[lIIIIIllI[0]];
                    stringArray3[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[69]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIIIIIlII[lIIIIIllI[70]]);
                    Time.sleepTicks((int)lIIIIIllI[5]);
                    0;
                }
                Time.sleepTicks((int)lIIIIIllI[0]);
                0;
                0;
            } while (((0x28 ^ 0x63) & ~(0x35 ^ 0x7E)) == 0);
            return;
        }
    }

    public static void a(WorldPoint worldPoint) {
        if (e.llIllIIIlIl(n.bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (e.llIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(n.bO), lIIIIIllI[1])) {
                AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[2]];
                Movement.walkTo((WorldPoint)n.bO);
                0;
                Time.sleepTicks((int)lIIIIIllI[0]);
                0;
            }
            if (e.llIllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(n.bO), lIIIIIllI[1])) {
                NPC lIIlIlIllIIIlll;
                AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[0]];
                if (e.llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (e.llIllIIlIll(lIIlIlIllIIIlll = NPCs.getNearest(nPC -> {
                    String[] stringArray = new String[lIIIIIllI[0]];
                    stringArray[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[90]];
                    return nPC.hasAction(stringArray);
                }))) {
                    String[] stringArray = new String[lIIIIIllI[0]];
                    stringArray[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[3]];
                    if (e.llIllIIIlll(lIIlIlIllIIIlll.hasAction(stringArray) ? 1 : 0)) {
                        lIIlIlIllIIIlll.interact(lIIIIIlII[lIIIIIllI[1]]);
                        Time.sleepTicks((int)lIIIIIllI[1]);
                        0;
                    }
                    String[] stringArray2 = new String[lIIIIIllI[0]];
                    stringArray2[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[4]];
                    if (e.llIllIIIlIl(lIIlIlIllIIIlll.hasAction(stringArray2) ? 1 : 0)) {
                        g.b(lIIIIIlII[lIIIIIllI[5]], n.bR);
                        Time.sleepTicks((int)lIIIIIllI[0]);
                        0;
                    }
                }
                String[] stringArray = new String[lIIIIIllI[0]];
                stringArray[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[6]];
                NPC lIIlIlIllIIIllI = NPCs.getNearest((String[])stringArray);
                if (e.llIllIIlIll(lIIlIlIllIIIllI)) {
                    String[] stringArray3 = new String[lIIIIIllI[0]];
                    stringArray3[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[7]];
                    if (e.llIllIIIlll(lIIlIlIllIIIllI.hasAction(stringArray3) ? 1 : 0)) {
                        lIIlIlIllIIIllI.interact(lIIIIIlII[lIIIIIllI[8]]);
                        Time.sleepTicks((int)lIIIIIllI[1]);
                        0;
                    }
                    String[] stringArray4 = new String[lIIIIIllI[0]];
                    stringArray4[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[9]];
                    if (e.llIllIIIlIl(lIIlIlIllIIIllI.hasAction(stringArray4) ? 1 : 0)) {
                        g.b(lIIIIIlII[lIIIIIllI[10]], n.bR);
                        Time.sleepTicks((int)lIIIIIllI[0]);
                        0;
                    }
                }
            }
        }
        if (e.llIllIIIlll(n.bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint lIIlIlIllIIlIII;
            Movement.walkTo((WorldPoint)lIIlIlIllIIlIII);
            0;
            Time.sleepTicks((int)lIIIIIllI[0]);
            0;
        }
    }

    public static void C() {
        if (e.llIllIIIlIl(e.j(lIIIIIllI[63]))) {
            Widget lIIlIlIIlllIllI;
            if (e.llIllIIIlIl(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)lIIIIIllI[0]);
                0;
            }
            if (e.llIllIIIlll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.llIllIIlIll(lIIlIlIIlllIllI = Widgets.get((int)lIIIIIllI[64], (int)lIIIIIllI[54]))) {
                lIIlIlIIlllIllI.interact(lIIIIIlII[lIIIIIllI[65]]);
                Time.sleepTicks((int)lIIIIIllI[0]);
                0;
            }
        }
    }

    private static String llIllIIIIlI(String lIIlIlIIlIIIlII, String lIIlIlIIlIIIIll) {
        try {
            SecretKeySpec lIIlIlIIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIlIIlIIIIll.getBytes(StandardCharsets.UTF_8)), lIIIIIllI[8]), "DES");
            Cipher lIIlIlIIlIIlIII = Cipher.getInstance("DES");
            lIIlIlIIlIIlIII.init(lIIIIIllI[3], lIIlIlIIlIIlIIl);
            return new String(lIIlIlIIlIIlIII.doFinal(Base64.getDecoder().decode(lIIlIlIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIlIIlIIIlll) {
            lIIlIlIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIllll(int n2) {
        return n2 > 0;
    }

    private static String llIllIIIIIl(String lIIlIlIIlIllIll, String lIIlIlIIlIlIlIl) {
        lIIlIlIIlIllIll = new String(Base64.getDecoder().decode(lIIlIlIIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIlIIlIllIIl = new StringBuilder();
        char[] lIIlIlIIlIllIII = lIIlIlIIlIlIlIl.toCharArray();
        int lIIlIlIIlIlIlll = lIIIIIllI[2];
        char[] lIIlIlIIlIlIIIl = lIIlIlIIlIllIll.toCharArray();
        int lIIlIlIIlIlIIII = lIIlIlIIlIlIIIl.length;
        int lIIlIlIIlIIllll = lIIIIIllI[2];
        while (e.llIllIIllII(lIIlIlIIlIIllll, lIIlIlIIlIlIIII)) {
            char lIIlIlIIlIlllII = lIIlIlIIlIlIIIl[lIIlIlIIlIIllll];
            lIIlIlIIlIllIIl.append((char)(lIIlIlIIlIlllII ^ lIIlIlIIlIllIII[lIIlIlIIlIlIlll % lIIlIlIIlIllIII.length]));
            0;
            ++lIIlIlIIlIlIlll;
            ++lIIlIlIIlIIllll;
            0;
            if ((0x78 ^ 0x7C) > ((0x15 ^ 0x5E) & ~(0x2D ^ 0x66))) continue;
            return null;
        }
        return String.valueOf(lIIlIlIIlIllIIl);
    }

    public static void w() {
        Widget widget = Widgets.get((int)lIIIIIllI[14], (int)lIIIIIllI[15], (int)lIIIIIllI[2]);
        if (e.llIllIIlIll(widget)) {
            widget.interact(lIIIIIlII[lIIIIIllI[16]]);
            Time.sleepTicks((int)lIIIIIllI[1]);
            0;
        }
    }

    private static boolean llIllIIllIl(int n2, int n3) {
        return n2 != n3;
    }

    public static void D() {
        if (e.llIllIIIllI(e.j(lIIIIIllI[63]), lIIIIIllI[0])) {
            Widget lIIlIlIIlllIlII;
            if (e.llIllIIIlIl(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)lIIIIIllI[0]);
                0;
            }
            if (e.llIllIIIlll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.llIllIIlIll(lIIlIlIIlllIlII = Widgets.get((int)lIIIIIllI[64], (int)lIIIIIllI[54]))) {
                lIIlIlIIlllIlII.interact(lIIIIIlII[lIIIIIllI[66]]);
                Time.sleepTicks((int)lIIIIIllI[0]);
                0;
            }
        }
    }

    public static boolean i(int n2) {
        int[] nArray = new int[lIIIIIllI[0]];
        nArray[e.lIIIIIllI[2]] = n2;
        return Bank.contains((int[])nArray);
    }

    private static boolean llIllIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIIlIII(int n2) {
        return n2 < 0;
    }

    public static void c(String string) {
        FileWriter fileWriter = new FileWriter(lIIIIIlII[lIIIIIllI[12]]);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(string + System.getProperty(lIIIIIlII[lIIIIIllI[13]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static long a(long l2) {
        return e.s() - l2;
    }

    static {
        e.llIllIIIlII();
        e.llIllIIIIll();
        R = lIIIIIlII[lIIIIIllI[91]];
        S = ThreadLocalRandom.current();
        T = new WorldArea(lIIIIIllI[92], lIIIIIllI[93], lIIIIIllI[71], lIIIIIllI[77], lIIIIIllI[2]);
        U = new WorldArea(lIIIIIllI[94], lIIIIIllI[95], lIIIIIllI[26], lIIIIIllI[54], lIIIIIllI[0]);
        V = System.currentTimeMillis();
        W = System.nanoTime();
        X = new HashMap<Integer, Integer>();
        Y = new WorldPoint(lIIIIIllI[96], lIIIIIllI[97], lIIIIIllI[2]);
        int[] nArray = new int[lIIIIIllI[98]];
        nArray[e.lIIIIIllI[2]] = lIIIIIllI[99];
        nArray[e.lIIIIIllI[0]] = lIIIIIllI[100];
        nArray[e.lIIIIIllI[3]] = lIIIIIllI[101];
        nArray[e.lIIIIIllI[1]] = lIIIIIllI[102];
        nArray[e.lIIIIIllI[4]] = lIIIIIllI[103];
        nArray[e.lIIIIIllI[5]] = lIIIIIllI[104];
        nArray[e.lIIIIIllI[6]] = lIIIIIllI[105];
        nArray[e.lIIIIIllI[7]] = lIIIIIllI[106];
        nArray[e.lIIIIIllI[8]] = lIIIIIllI[107];
        nArray[e.lIIIIIllI[9]] = lIIIIIllI[108];
        nArray[e.lIIIIIllI[10]] = lIIIIIllI[109];
        nArray[e.lIIIIIllI[11]] = lIIIIIllI[110];
        nArray[e.lIIIIIllI[12]] = lIIIIIllI[111];
        nArray[e.lIIIIIllI[13]] = lIIIIIllI[112];
        nArray[e.lIIIIIllI[16]] = lIIIIIllI[113];
        nArray[e.lIIIIIllI[17]] = lIIIIIllI[114];
        nArray[e.lIIIIIllI[23]] = lIIIIIllI[115];
        nArray[e.lIIIIIllI[24]] = lIIIIIllI[116];
        nArray[e.lIIIIIllI[27]] = lIIIIIllI[117];
        nArray[e.lIIIIIllI[29]] = lIIIIIllI[118];
        nArray[e.lIIIIIllI[30]] = lIIIIIllI[119];
        nArray[e.lIIIIIllI[33]] = lIIIIIllI[120];
        nArray[e.lIIIIIllI[36]] = lIIIIIllI[121];
        nArray[e.lIIIIIllI[26]] = lIIIIIllI[122];
        nArray[e.lIIIIIllI[37]] = lIIIIIllI[123];
        nArray[e.lIIIIIllI[38]] = lIIIIIllI[124];
        nArray[e.lIIIIIllI[39]] = lIIIIIllI[125];
        nArray[e.lIIIIIllI[40]] = lIIIIIllI[126];
        nArray[e.lIIIIIllI[41]] = lIIIIIllI[127];
        nArray[e.lIIIIIllI[15]] = lIIIIIllI[128];
        nArray[e.lIIIIIllI[54]] = lIIIIIllI[129];
        nArray[e.lIIIIIllI[55]] = lIIIIIllI[130];
        nArray[e.lIIIIIllI[35]] = lIIIIIllI[131];
        nArray[e.lIIIIIllI[56]] = lIIIIIllI[132];
        nArray[e.lIIIIIllI[57]] = lIIIIIllI[133];
        nArray[e.lIIIIIllI[47]] = lIIIIIllI[134];
        nArray[e.lIIIIIllI[60]] = lIIIIIllI[135];
        nArray[e.lIIIIIllI[61]] = lIIIIIllI[136];
        nArray[e.lIIIIIllI[65]] = lIIIIIllI[137];
        nArray[e.lIIIIIllI[66]] = lIIIIIllI[138];
        nArray[e.lIIIIIllI[21]] = lIIIIIllI[139];
        nArray[e.lIIIIIllI[32]] = lIIIIIllI[140];
        nArray[e.lIIIIIllI[67]] = lIIIIIllI[141];
        nArray[e.lIIIIIllI[68]] = lIIIIIllI[142];
        nArray[e.lIIIIIllI[69]] = lIIIIIllI[143];
        nArray[e.lIIIIIllI[70]] = lIIIIIllI[144];
        nArray[e.lIIIIIllI[74]] = lIIIIIllI[145];
        nArray[e.lIIIIIllI[76]] = lIIIIIllI[146];
        nArray[e.lIIIIIllI[77]] = lIIIIIllI[147];
        nArray[e.lIIIIIllI[78]] = lIIIIIllI[148];
        nArray[e.lIIIIIllI[71]] = lIIIIIllI[149];
        nArray[e.lIIIIIllI[81]] = lIIIIIllI[150];
        nArray[e.lIIIIIllI[82]] = lIIIIIllI[151];
        nArray[e.lIIIIIllI[83]] = lIIIIIllI[152];
        nArray[e.lIIIIIllI[84]] = lIIIIIllI[153];
        nArray[e.lIIIIIllI[85]] = lIIIIIllI[154];
        nArray[e.lIIIIIllI[86]] = lIIIIIllI[155];
        nArray[e.lIIIIIllI[87]] = lIIIIIllI[156];
        nArray[e.lIIIIIllI[88]] = lIIIIIllI[157];
        nArray[e.lIIIIIllI[90]] = lIIIIIllI[158];
        nArray[e.lIIIIIllI[91]] = lIIIIIllI[159];
        nArray[e.lIIIIIllI[20]] = lIIIIIllI[160];
        nArray[e.lIIIIIllI[161]] = lIIIIIllI[162];
        nArray[e.lIIIIIllI[163]] = lIIIIIllI[164];
        nArray[e.lIIIIIllI[165]] = lIIIIIllI[166];
        nArray[e.lIIIIIllI[167]] = lIIIIIllI[168];
        nArray[e.lIIIIIllI[169]] = lIIIIIllI[170];
        nArray[e.lIIIIIllI[171]] = lIIIIIllI[172];
        nArray[e.lIIIIIllI[173]] = lIIIIIllI[174];
        nArray[e.lIIIIIllI[175]] = lIIIIIllI[176];
        nArray[e.lIIIIIllI[177]] = lIIIIIllI[178];
        nArray[e.lIIIIIllI[50]] = lIIIIIllI[179];
        nArray[e.lIIIIIllI[180]] = lIIIIIllI[181];
        nArray[e.lIIIIIllI[182]] = lIIIIIllI[183];
        nArray[e.lIIIIIllI[184]] = lIIIIIllI[185];
        nArray[e.lIIIIIllI[186]] = lIIIIIllI[187];
        nArray[e.lIIIIIllI[188]] = lIIIIIllI[189];
        nArray[e.lIIIIIllI[190]] = lIIIIIllI[191];
        nArray[e.lIIIIIllI[192]] = lIIIIIllI[193];
        nArray[e.lIIIIIllI[194]] = lIIIIIllI[195];
        nArray[e.lIIIIIllI[196]] = lIIIIIllI[197];
        nArray[e.lIIIIIllI[198]] = lIIIIIllI[199];
        nArray[e.lIIIIIllI[200]] = lIIIIIllI[201];
        nArray[e.lIIIIIllI[202]] = lIIIIIllI[203];
        nArray[e.lIIIIIllI[204]] = lIIIIIllI[205];
        nArray[e.lIIIIIllI[206]] = lIIIIIllI[207];
        nArray[e.lIIIIIllI[208]] = lIIIIIllI[209];
        nArray[e.lIIIIIllI[210]] = lIIIIIllI[211];
        nArray[e.lIIIIIllI[212]] = lIIIIIllI[213];
        nArray[e.lIIIIIllI[214]] = lIIIIIllI[215];
        nArray[e.lIIIIIllI[216]] = lIIIIIllI[217];
        nArray[e.lIIIIIllI[218]] = lIIIIIllI[219];
        nArray[e.lIIIIIllI[220]] = lIIIIIllI[221];
        nArray[e.lIIIIIllI[222]] = lIIIIIllI[223];
        nArray[e.lIIIIIllI[224]] = lIIIIIllI[225];
        nArray[e.lIIIIIllI[226]] = lIIIIIllI[227];
        nArray[e.lIIIIIllI[228]] = lIIIIIllI[229];
        nArray[e.lIIIIIllI[230]] = lIIIIIllI[231];
        nArray[e.lIIIIIllI[232]] = lIIIIIllI[233];
        nArray[e.lIIIIIllI[234]] = lIIIIIllI[235];
        nArray[e.lIIIIIllI[89]] = lIIIIIllI[236];
        nArray[e.lIIIIIllI[73]] = lIIIIIllI[237];
        nArray[e.lIIIIIllI[238]] = lIIIIIllI[239];
        nArray[e.lIIIIIllI[240]] = lIIIIIllI[241];
        nArray[e.lIIIIIllI[242]] = lIIIIIllI[243];
        nArray[e.lIIIIIllI[244]] = lIIIIIllI[245];
        nArray[e.lIIIIIllI[246]] = lIIIIIllI[247];
        Z = nArray;
        aa = new WorldPoint(lIIIIIllI[248], lIIIIIllI[249], lIIIIIllI[3]);
        ab = new WorldArea(lIIIIIllI[250], lIIIIIllI[251], lIIIIIllI[56], lIIIIIllI[36], lIIIIIllI[2]);
    }

    public static double u() {
        double d2 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS);
        double d3 = Skills.getLevel((Skill)Skill.HITPOINTS);
        return d2 / d3 * 100.0;
    }

    public static int t() {
        int n2 = e.c(lIIIIIllI[2], Z.length - lIIIIIllI[0]);
        return Z[n2];
    }

    public static int j(int n2) {
        return (Integer)GameThread.invokeLater(() -> Static.getClient().getVarpValue(n2));
    }

    private static String llIlIllllIl(String lIIlIlIIIllIlll, String lIIlIlIIIlllIII) {
        try {
            SecretKeySpec lIIlIlIIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlIIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIlIIIlllIll = Cipher.getInstance("Blowfish");
            lIIlIlIIIlllIll.init(lIIIIIllI[3], lIIlIlIIIllllII);
            return new String(lIIlIlIIIlllIll.doFinal(Base64.getDecoder().decode(lIIlIlIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIlIIIlllIlI) {
            lIIlIlIIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static void llIllIIIIll() {
        lIIIIIlII = new String[lIIIIIllI[20]];
        e.lIIIIIlII[e.lIIIIIllI[2]] = e."Nav to veos";
        e.lIIIIIlII[e.lIIIIIllI[0]] = e."Handle veos chat";
        e.lIIIIIlII[e.lIIIIIllI[3]] = e."Port Piscarilius";
        e.lIIIIIlII[e.lIIIIIllI[1]] = e."Port Piscarilius";
        e.lIIIIIlII[e.lIIIIIllI[4]] = e."Port Piscarilius";
        e.lIIIIIlII[e.lIIIIIllI[5]] = e."Veos";
        e.lIIIIIlII[e.lIIIIIllI[6]] = e."Cabin Boy Herbert";
        e.lIIIIIlII[e.lIIIIIllI[7]] = e."Port Piscarilius";
        e.lIIIIIlII[e.lIIIIIllI[8]] = e."Port Piscarilius";
        e.lIIIIIlII[e.lIIIIIllI[9]] = e."Port Piscarilius";
        e.lIIIIIlII[e.lIIIIIllI[10]] = e."Cabin Boy Herbert";
        e.lIIIIIlII[e.lIIIIIllI[11]] = e."%%0%dd";
        e.lIIIIIlII[e.lIIIIIllI[12]] = e."C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";
        e.lIIIIIlII[e.lIIIIIllI[13]] = e."line.separator";
        e.lIIIIIlII[e.lIIIIIllI[16]] = e."Close";
        e.lIIIIIlII[e.lIIIIIllI[17]] = e."Nav to Varrock W bank";
        e.lIIIIIlII[e.lIIIIIllI[23]] = e."Break";
        e.lIIIIIlII[e.lIIIIIllI[24]] = e."Handling banking";
        e.lIIIIIlII[e.lIIIIIllI[27]] = e."Select Warnings";
        e.lIIIIIlII[e.lIIIIIllI[29]] = e."Toggle";
        e.lIIIIIlII[e.lIIIIIllI[30]] = e."Toggle";
        e.lIIIIIlII[e.lIIIIIllI[33]] = e."Close";
        e.lIIIIIlII[e.lIIIIIllI[36]] = e."All Settings";
        e.lIIIIIlII[e.lIIIIIllI[26]] = e."Wear";
        e.lIIIIIlII[e.lIIIIIllI[37]] = e."Wear";
        e.lIIIIIlII[e.lIIIIIllI[38]] = e."Wield";
        e.lIIIIIlII[e.lIIIIIllI[39]] = e."Wield";
        e.lIIIIIlII[e.lIIIIIllI[40]] = e."Equip";
        e.lIIIIIlII[e.lIIIIIllI[41]] = e."Equip";
        e.lIIIIIlII[e.lIIIIIllI[15]] = e."Give me a PK skull.";
        e.lIIIIIlII[e.lIIIIIllI[54]] = e."Nav to outside gate";
        e.lIIIIIlII[e.lIIIIIllI[55]] = e."Gate";
        e.lIIIIIlII[e.lIIIIIllI[35]] = e."Open";
        e.lIIIIIlII[e.lIIIIIllI[56]] = e."Sorry, I'm a bit busy.";
        e.lIIIIIlII[e.lIIIIIllI[57]] = e."Nav to stronghold tile";
        e.lIIIIIlII[e.lIIIIIllI[47]] = e."POST";
        e.lIIIIIlII[e.lIIIIIllI[60]] = e."Content-Type";
        e.lIIIIIlII[e.lIIIIIllI[61]] = e."application/json";
        e.lIIIIIlII[e.lIIIIIllI[65]] = e."Auto retaliate";
        e.lIIIIIlII[e.lIIIIIllI[66]] = e."Auto retaliate";
        e.lIIIIIlII[e.lIIIIIllI[21]] = e."Death's Coffer";
        e.lIIIIIlII[e.lIIIIIllI[32]] = e."Handling death";
        e.lIIIIIlII[e.lIIIIIllI[67]] = e."Death";
        e.lIIIIIlII[e.lIIIIIllI[68]] = e."Talk-to";
        e.lIIIIIlII[e.lIIIIIllI[69]] = e."Portal";
        e.lIIIIIlII[e.lIIIIIllI[70]] = e."Use";
        e.lIIIIIlII[e.lIIIIIllI[74]] = e."<str>";
        e.lIIIIIlII[e.lIIIIIllI[76]] = e."total";
        e.lIIIIIlII[e.lIIIIIllI[77]] = e."PvP";
        e.lIIIIIlII[e.lIIIIIllI[78]] = e."PvP";
        e.lIIIIIlII[e.lIIIIIllI[71]] = e."High";
        e.lIIIIIlII[e.lIIIIIllI[81]] = e."Leagues";
        e.lIIIIIlII[e.lIIIIIllI[82]] = e."Beta";
        e.lIIIIIlII[e.lIIIIIllI[83]] = e."beta";
        e.lIIIIIlII[e.lIIIIIllI[84]] = e."Deadman";
        e.lIIIIIlII[e.lIIIIIllI[85]] = e."Deadman";
        e.lIIIIIlII[e.lIIIIIllI[86]] = e."Speedrunning";
        e.lIIIIIlII[e.lIIIIIllI[87]] = e."total";
        e.lIIIIIlII[e.lIIIIIllI[88]] = e."Beta";
        e.lIIIIIlII[e.lIIIIIllI[90]] = e."Port Piscarilius";
        e.lIIIIIlII[e.lIIIIIllI[91]] = e."C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";
    }

    /*
     * WARNING - void declaration
     */
    public static void a(HashMap<Integer, Integer> hashMap, boolean bl, boolean bl2) {
        if (e.llIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(Y), lIIIIIllI[4])) {
            int n2;
            AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[17]];
            WorldArea worldArea = new WorldArea(lIIIIIllI[18], lIIIIIllI[19], lIIIIIllI[20], lIIIIIllI[21], lIIIIIllI[2]);
            int[] nArray = new int[lIIIIIllI[0]];
            nArray[e.lIIIIIllI[2]] = lIIIIIllI[22];
            int n3 = Inventory.contains((int[])nArray);
            if (e.llIllIIIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                n2 = lIIIIIllI[0];
                0;
                if (((0x65 ^ 0x2F ^ (0x31 ^ 0x58)) & (141 + 73 - 51 + 3 ^ 28 + 61 - 57 + 101 ^ -1)) >= (96 + 166 - 177 + 97 ^ 22 + 132 - 25 + 49)) {
                    return;
                }
            } else {
                n2 = lIIIIIllI[2];
            }
            if (e.llIllIIIlll(n3 & n2)) {
                int[] nArray2 = new int[lIIIIIllI[0]];
                nArray2[e.lIIIIIllI[2]] = lIIIIIllI[22];
                Inventory.getFirst((int[])nArray2).interact(lIIIIIlII[lIIIIIllI[23]]);
                Time.sleepTicks((int)lIIIIIllI[8]);
                0;
            }
            Movement.walkTo((WorldPoint)Y);
            0;
            Time.sleepTicks((int)lIIIIIllI[0]);
            0;
        }
        if (e.llIllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(Y), lIIIIIllI[4])) {
            HashMap<Integer, Integer> lIIlIlIlIllIIII;
            void lIIlIlIlIlIlllI;
            void lIIlIlIlIlIllll;
            if (e.llIllIIIlIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
            }
            AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[24]];
            if (e.llIllIIIlll((int)lIIlIlIlIlIllll) && e.llIllIIllll(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks((int)lIIIIIllI[4]);
                0;
            }
            if (e.llIllIIIlll((int)lIIlIlIlIlIlllI) && e.llIllIIllll(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks((int)lIIIIIllI[3]);
                0;
            }
            Iterator<Map.Entry<Integer, Integer>> lIIlIlIlIlIllIl = lIIlIlIlIllIIII.entrySet().iterator();
            while (e.llIllIIIlll(lIIlIlIlIlIllIl.hasNext() ? 1 : 0)) {
                Map.Entry<Integer, Integer> lIIlIlIlIlIllII = lIIlIlIlIlIllIl.next();
                int lIIlIlIlIlIlIll = lIIlIlIlIlIllII.getKey();
                int lIIlIlIlIlIlIlI = lIIlIlIlIlIllII.getValue();
                System.out.println("Key: " + lIIlIlIlIlIlIll + ", Value: " + lIIlIlIlIlIlIlI);
                a.a(lIIlIlIlIlIlIll, lIIlIlIlIlIlIlI);
                Time.sleepTicks((int)lIIIIIllI[0]);
                0;
                0;
                if (1 >= 0) continue;
                return;
            }
        }
    }

    public static String b(long l2) {
        Object[] objectArray = new Object[lIIIIIllI[0]];
        objectArray[e.lIIIIIllI[2]] = lIIIIIllI[3];
        String string = String.format(lIIIIIlII[lIIIIIllI[11]], objectArray);
        Object[] objectArray2 = new Object[lIIIIIllI[0]];
        objectArray2[e.lIIIIIllI[2]] = (l2 /= 1000L) % 60L;
        String string2 = String.format(string, objectArray2);
        Object[] objectArray3 = new Object[lIIIIIllI[0]];
        objectArray3[e.lIIIIIllI[2]] = l2 % 3600L / 60L;
        String string3 = String.format(string, objectArray3);
        Object[] objectArray4 = new Object[lIIIIIllI[0]];
        objectArray4[e.lIIIIIllI[2]] = l2 / 3600L;
        String string4 = String.format(string, objectArray4);
        String string5 = string4 + ":" + string3 + ":" + string2;
        return string5;
    }

    private static boolean llIllIIlllI(Object object) {
        return object == null;
    }

    public static int H() {
        return e.j(lIIIIIllI[73]);
    }

    public static void l(int n2) {
        int[] nArray = new int[lIIIIIllI[0]];
        nArray[e.lIIIIIllI[2]] = n2;
        if (e.llIllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIIIllI[0]];
            nArray2[e.lIIIIIllI[2]] = n2;
            if (e.llIllIIIlIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int lIIlIlIlIlIIIII;
                int[] nArray3 = new int[lIIIIIllI[0]];
                nArray3[e.lIIIIIllI[2]] = n2;
                String[] stringArray = new String[lIIIIIllI[0]];
                stringArray[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[26]];
                if (e.llIllIIIlll(Inventory.getFirst((int[])nArray3).hasAction(stringArray) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIIIllI[0]];
                    nArray4[e.lIIIIIllI[2]] = n2;
                    Inventory.getFirst((int[])nArray4).interact(lIIIIIlII[lIIIIIllI[37]]);
                }
                int[] nArray5 = new int[lIIIIIllI[0]];
                nArray5[e.lIIIIIllI[2]] = lIIlIlIlIlIIIII;
                String[] stringArray2 = new String[lIIIIIllI[0]];
                stringArray2[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[38]];
                if (e.llIllIIIlll(Inventory.getFirst((int[])nArray5).hasAction(stringArray2) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIIIllI[0]];
                    nArray6[e.lIIIIIllI[2]] = lIIlIlIlIlIIIII;
                    Inventory.getFirst((int[])nArray6).interact(lIIIIIlII[lIIIIIllI[39]]);
                }
                int[] nArray7 = new int[lIIIIIllI[0]];
                nArray7[e.lIIIIIllI[2]] = lIIlIlIlIlIIIII;
                String[] stringArray3 = new String[lIIIIIllI[0]];
                stringArray3[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[40]];
                if (e.llIllIIIlll(Inventory.getFirst((int[])nArray7).hasAction(stringArray3) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIIIllI[0]];
                    nArray8[e.lIIIIIllI[2]] = lIIlIlIlIlIIIII;
                    Inventory.getFirst((int[])nArray8).interact(lIIIIIlII[lIIIIIllI[41]]);
                }
                if (e.llIllIIIllI(lIIlIlIlIlIIIII, lIIIIIllI[42])) {
                    Time.sleepTicks((int)lIIIIIllI[1]);
                    0;
                    String[] stringArray4 = new String[lIIIIIllI[0]];
                    stringArray4[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[15]];
                    g.a(stringArray4);
                    Time.sleepTicks((int)lIIIIIllI[0]);
                    0;
                }
            }
        }
    }

    public static void a(String lIIlIlIlIIlIIII, String lIIlIlIlIIIllll) {
        try {
            URL lIIlIlIlIIIlllI = new URL(lIIlIlIlIIlIIII);
            HttpURLConnection lIIlIlIlIIIllIl = (HttpURLConnection)lIIlIlIlIIIlllI.openConnection();
            lIIlIlIlIIIllIl.setRequestMethod(lIIIIIlII[lIIIIIllI[47]]);
            lIIlIlIlIIIllIl.setRequestProperty(lIIIIIlII[lIIIIIllI[60]], lIIIIIlII[lIIIIIllI[61]]);
            lIIlIlIlIIIllIl.setDoOutput(lIIIIIllI[0]);
            String lIIlIlIlIIIllII = "{\"content\": \"" + lIIlIlIlIIIllll + "\"}";
            DataOutputStream lIIlIlIlIIIlIll = new DataOutputStream(lIIlIlIlIIIllIl.getOutputStream());
            lIIlIlIlIIIlIll.writeBytes(lIIlIlIlIIIllII);
            lIIlIlIlIIIlIll.flush();
            lIIlIlIlIIIlIll.close();
            int lIIlIlIlIIIlIlI = lIIlIlIlIIIllIl.getResponseCode();
            System.out.println("Response Code: " + lIIlIlIlIIIlIlI);
            lIIlIlIlIIIllIl.disconnect();
            0;
        }
        catch (Exception lIIlIlIlIIIlllI) {
            lIIlIlIlIIIlllI.printStackTrace();
        }
        if (-1 == 2) {
            return;
        }
    }

    public static void A() {
        Widget widget = Widgets.get((int)lIIIIIllI[34], (int)lIIIIIllI[35]);
        if (e.llIllIIlIll(widget)) {
            widget.interact(lIIIIIlII[lIIIIIllI[36]]);
            Time.sleepTicks((int)lIIIIIllI[0]);
            0;
        }
    }

    private static boolean llIllIIlIll(Object object) {
        return object != null;
    }

    private static boolean llIllIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    public static void v() {
        if (e.llIllIIIlll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks((int)lIIIIIllI[4]);
            0;
        }
        if (e.llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.llIllIIIlIl(Bank.isOpen() ? 1 : 0)) {
            e.B();
        }
    }

    private static boolean llIllIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    public static long s() {
        return V + (System.nanoTime() - W) / 1000000L;
    }

    private static boolean llIllIIllII(int n2, int n3) {
        return n2 < n3;
    }

    public static String h(int n2) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String string = numberFormat.format(n2);
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public static void k(int n2) {
        if (e.llIllIIllIl(Static.getClient().getWorld(), n2)) {
            void lIIlIlIlIlllIll;
            WorldResult worldResult = Static.getWorldService().getWorlds();
            World world = worldResult.findWorld(n2);
            if (e.llIllIIlllI(world)) {
                return;
            }
            if (e.llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            net.runelite.api.World lIIlIlIlIlllIlI = Static.getClient().createWorld();
            lIIlIlIlIlllIlI.setActivity(lIIlIlIlIlllIll.getActivity());
            lIIlIlIlIlllIlI.setAddress(lIIlIlIlIlllIll.getAddress());
            lIIlIlIlIlllIlI.setId(lIIlIlIlIlllIll.getId());
            lIIlIlIlIlllIlI.setPlayerCount(lIIlIlIlIlllIll.getPlayers());
            lIIlIlIlIlllIlI.setLocation(lIIlIlIlIlllIll.getLocation());
            lIIlIlIlIlllIlI.setTypes(WorldUtil.toWorldTypes((EnumSet)lIIlIlIlIlllIll.getTypes()));
            Worlds.hopTo((net.runelite.api.World)lIIlIlIlIlllIlI);
        }
    }

    public static boolean b(int[] nArray) {
        int[] lIIlIlIllIIIIll;
        int lIIlIlIllIIIIlI = lIIIIIllI[2];
        while (e.llIllIIllII(lIIlIlIllIIIIlI, lIIlIlIllIIIIll.length)) {
            if (e.llIllIIIlIl(e.i(lIIlIlIllIIIIll[lIIlIlIllIIIIlI]) ? 1 : 0)) {
                System.out.println("Missing ID: " + lIIlIlIllIIIIll[lIIlIlIllIIIIlI]);
                return lIIIIIllI[2];
            }
            ++lIIlIlIllIIIIlI;
            0;
            
            return ((0xAC ^ 0x95) & ~(0x46 ^ 0x7F) & ~((0x75 ^ 0x23) & ~(0x27 ^ 0x71))) != 0;
        }
        return lIIIIIllI[0];
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
        int lIIlIlIIllllIll;
        void lIIlIlIIlllllll;
        WorldPoint lIIlIlIlIIIIIII;
        Client client = Static.getClient();
        Player player = client.getLocalPlayer();
        if (e.llIllIIlllI(player)) {
            return;
        }
        WorldPoint lIIlIlIIlllllIl = lIIlIlIlIIIIIII;
        int lIIlIlIIlllllII = lIIlIlIIlllllIl.getX() - lIIlIlIIlllllll.getBaseX();
        Point lIIlIlIIllllIlI = Perspective.localToCanvas((Client)lIIlIlIIlllllll, (LocalPoint)LocalPoint.fromScene((int)lIIlIlIIlllllII, (int)(lIIlIlIIllllIll = lIIlIlIIlllllIl.getY() - lIIlIlIIlllllll.getBaseY())), (int)lIIlIlIIlllllll.getPlane());
        if (e.llIllIIlIll(lIIlIlIIllllIlI)) {
            n3 = lIIlIlIIllllIlI.getX();
            0;
            if ((0x4A ^ 0x38 ^ (0xC ^ 0x7B)) == 0) {
                return;
            }
        } else {
            int lIIlIlIIllllIIl;
            n3 = lIIlIlIIllllIIl = lIIIIIllI[62];
        }
        if (e.llIllIIlIll(lIIlIlIIllllIlI)) {
            n2 = lIIlIlIIllllIlI.getY();
            0;
            if (2 < 2) {
                return;
            }
        } else {
            n2 = lIIIIIllI[62];
        }
        int n4 = n2;
        client.interact(lIIIIIllI[2], MenuAction.WALK.getId(), (int)var4_4, (int)var5_5, (int)var7_7, n4);
    }

    public static void B() {
        net.runelite.api.World world2 = Worlds.getRandom(world -> {
            int n2;
            if (e.llIllIIIlll(world.isMembers() ? 1 : 0) && e.llIllIIlIlI(world.getPlayerCount(), lIIIIIllI[75]) && e.llIllIIllIl(world.getId(), Worlds.getCurrentId()) && e.llIllIIIlIl(world.getActivity().endsWith(lIIIIIlII[lIIIIIllI[76]]) ? 1 : 0) && e.llIllIIIlIl(world.getActivity().endsWith(lIIIIIlII[lIIIIIllI[77]]) ? 1 : 0) && e.llIllIIIlIl(world.getActivity().startsWith(lIIIIIlII[lIIIIIllI[78]]) ? 1 : 0) && e.llIllIIIlIl(world.getActivity().startsWith(lIIIIIlII[lIIIIIllI[71]]) ? 1 : 0) && e.llIllIIllIl(world.getId(), lIIIIIllI[79]) && e.llIllIIllIl(world.getId(), lIIIIIllI[80]) && e.llIllIIllIl(world.getId(), lIIIIIllI[80]) && e.llIllIIIlIl(world.getActivity().contains(lIIIIIlII[lIIIIIllI[81]]) ? 1 : 0) && e.llIllIIIlIl(world.getActivity().contains(lIIIIIlII[lIIIIIllI[82]]) ? 1 : 0) && e.llIllIIIlIl(world.getActivity().contains(lIIIIIlII[lIIIIIllI[83]]) ? 1 : 0) && e.llIllIIIlIl(world.getActivity().startsWith(lIIIIIlII[lIIIIIllI[84]]) ? 1 : 0) && e.llIllIIIlIl(world.getActivity().endsWith(lIIIIIlII[lIIIIIllI[85]]) ? 1 : 0) && e.llIllIIIlIl(world.getActivity().endsWith(lIIIIIlII[lIIIIIllI[86]]) ? 1 : 0) && e.llIllIIIlIl(world.getActivity().endsWith(lIIIIIlII[lIIIIIllI[87]]) ? 1 : 0) && e.llIllIIIlIl(world.getActivity().startsWith(lIIIIIlII[lIIIIIllI[88]]) ? 1 : 0) && e.llIllIIlIIl(world.getPlayerCount(), lIIIIIllI[89])) {
                n2 = lIIIIIllI[0];
                0;
                if (-2 > 0) {
                    return false;
                }
            } else {
                n2 = lIIIIIllI[2];
            }
            return n2 != 0;
        });
        Worlds.hopTo((net.runelite.api.World)world2);
    }

    /*
     * WARNING - void declaration
     */
    public static int c(int n2, int n3) {
        void lIIlIlIllIIllIl;
        int lIIlIlIllIIllII;
        int lIIlIlIllIIlllI;
        int n4 = n3 - n2;
        if (e.llIllIIIlIl(n4)) {
            return lIIlIlIllIIlllI;
        }
        if (e.llIllIIIllI(Math.abs(lIIlIlIllIIllII), lIIIIIllI[0])) {
            int n5;
            if (e.llIllIIIlll(S.nextBoolean() ? 1 : 0)) {
                n5 = lIIlIlIllIIlllI;
                0;
                if (-1 >= 1) {
                    return (0x80 ^ 0x91 ^ (0x67 ^ 0x7E)) & (0x9E ^ 0x94 ^ 2 ^ -1);
                }
            } else {
                n5 = lIIlIlIllIIllIl;
            }
            return n5;
        }
        if (e.llIllIIlIII(lIIlIlIllIIllII)) {
            lIIlIlIllIIllII = lIIlIlIllIIlllI;
            lIIlIlIllIIlllI = lIIlIlIllIIllIl;
            n3 = lIIlIlIllIIllII;
        }
        return n2 + S.nextInt(n3 - n2 + lIIIIIllI[0]);
    }

    public static boolean F() {
        int n2;
        if (!e.llIllIIIlIl(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.llIllIIIlIl(U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.llIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(aa), lIIIIIllI[71]) || e.llIllIIIlll(ab.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = lIIIIIllI[0];
            0;
            if (((0x6E ^ 0x66) & ~(0x56 ^ 0x5E)) != 0) {
                return false;
            }
        } else {
            n2 = lIIIIIllI[2];
        }
        return n2 != 0;
    }

    public static void y() {
        Widget lIIlIlIlIlIIllI;
        if (e.llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.llIllIIIlll(e.x() ? 1 : 0)) {
            if (e.llIllIIIlIl(e.z() ? 1 : 0)) {
                e.A();
            }
            if (e.llIllIIIlll(e.z() ? 1 : 0)) {
                Widget lIIlIlIlIlIIlII;
                Widget lIIlIlIlIlIIlIl;
                lIIlIlIlIlIIllI = Widgets.get((int)lIIIIIllI[25], (int)lIIIIIllI[26], (int)lIIIIIllI[7]);
                if (e.llIllIIlIll(lIIlIlIlIlIIllI)) {
                    lIIlIlIlIlIIllI.interact(lIIIIIlII[lIIIIIllI[27]]);
                    Time.sleepTicks((int)lIIIIIllI[0]);
                    0;
                }
                if (e.llIllIIIlIl(Vars.getBit((int)lIIIIIllI[28])) && e.llIllIIlIll(lIIlIlIlIlIIlIl = Widgets.get((int)lIIIIIllI[25], (int)lIIIIIllI[29], (int)lIIIIIllI[21]))) {
                    if (e.llIllIIIlIl(lIIlIlIlIlIIlIl.isVisible() ? 1 : 0)) {
                        lIIlIlIlIlIIlII = Widgets.get((int)lIIIIIllI[25], (int)lIIIIIllI[30], (int)lIIIIIllI[5]);
                        Mouse.click((int)lIIlIlIlIlIIlII.getClickPoint().getX(), (int)lIIlIlIlIlIIlII.getClickPoint().getY(), (boolean)lIIIIIllI[0]);
                        Time.sleepTicks((int)lIIIIIllI[0]);
                        0;
                    }
                    if (e.llIllIIIlll(lIIlIlIlIlIIlIl.isVisible() ? 1 : 0)) {
                        lIIlIlIlIlIIlIl.interact(lIIIIIlII[lIIIIIllI[29]]);
                        Time.sleepTicks((int)lIIIIIllI[0]);
                        0;
                    }
                }
                if (e.llIllIIIlIl(Vars.getBit((int)lIIIIIllI[31])) && e.llIllIIlIll(lIIlIlIlIlIIlIl = Widgets.get((int)lIIIIIllI[25], (int)lIIIIIllI[29], (int)lIIIIIllI[32]))) {
                    if (e.llIllIIIlIl(lIIlIlIlIlIIlIl.isVisible() ? 1 : 0)) {
                        lIIlIlIlIlIIlII = Widgets.get((int)lIIIIIllI[25], (int)lIIIIIllI[30], (int)lIIIIIllI[5]);
                        Mouse.click((int)lIIlIlIlIlIIlII.getClickPoint().getX(), (int)lIIlIlIlIlIIlII.getClickPoint().getY(), (boolean)lIIIIIllI[0]);
                        Time.sleepTicks((int)lIIIIIllI[0]);
                        0;
                    }
                    if (e.llIllIIIlll(lIIlIlIlIlIIlIl.isVisible() ? 1 : 0)) {
                        lIIlIlIlIlIIlIl.interact(lIIIIIlII[lIIIIIllI[30]]);
                        Time.sleepTicks((int)lIIIIIllI[3]);
                        0;
                    }
                }
            }
        }
        if (e.llIllIIlIll(lIIlIlIlIlIIllI = Widgets.get((int)lIIIIIllI[25], (int)lIIIIIllI[4]))) {
            lIIlIlIlIlIIllI.interact(lIIIIIlII[lIIIIIllI[33]]);
            Time.sleepTicks((int)lIIIIIllI[0]);
            0;
        }
    }

    public static boolean x() {
        boolean bl;
        if (!e.llIllIIIlll((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lIIIIIllI[28]))) || e.llIllIIIlIl((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lIIIIIllI[31])))) {
            bl = lIIIIIllI[0];
            0;
            if (1 < 0) {
                return ((0xC8 ^ 0xAF ^ (0x72 ^ 6)) & (0xDE ^ 0xBF ^ (0xE8 ^ 0x9A) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIIllI[2];
        }
        return bl;
    }

    private static boolean llIllIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void b(WorldPoint worldPoint) {
        void lIIlIlIlIIllIII;
        void lIIlIlIlIIllIIl;
        void lIIlIlIlIIllIlI;
        WorldPoint worldPoint2 = new WorldPoint(lIIIIIllI[43], lIIIIIllI[44], lIIIIIllI[2]);
        WorldArea worldArea = new WorldArea(lIIIIIllI[45], lIIIIIllI[46], lIIIIIllI[9], lIIIIIllI[47], lIIIIIllI[2]);
        WorldArea worldArea2 = new WorldArea(lIIIIIllI[48], lIIIIIllI[49], lIIIIIllI[50], lIIIIIllI[51], lIIIIIllI[2]);
        if (e.llIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIIIllI[6]) && e.llIllIIIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.llIllIIIlIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.llIllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIllI[52], lIIIIIllI[53], lIIIIIllI[0])), lIIIIIllI[30])) {
            AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[54]];
            if (e.llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)lIIlIlIlIIllIlI);
            0;
            Time.sleepTicks((int)lIIIIIllI[0]);
            0;
        }
        if (e.llIllIIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlIlIlIIllIlI), lIIIIIllI[6]) && e.llIllIIlIlI(Players.getLocal().getWorldLocation().getY(), lIIIIIllI[44])) {
            if (e.llIllIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIllI[0]];
                stringArray[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[55]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIIIlII[lIIIIIllI[35]]);
                Time.sleepTicks((int)lIIIIIllI[3]);
                0;
            }
            if (e.llIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIllI[0]];
                stringArray[e.lIIIIIllI[2]] = lIIIIIlII[lIIIIIllI[56]];
                g.a(stringArray);
            }
        }
        if (e.llIllIIlIIl(Players.getLocal().getWorldLocation().getY(), lIIIIIllI[44]) && (!e.llIllIIIlIl(lIIlIlIlIIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.llIllIIIlIl(lIIlIlIlIIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || e.llIllIIlIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIIllI[52], lIIIIIllI[53], lIIIIIllI[0])), lIIIIIllI[30]))) {
            WorldPoint lIIlIlIlIIllIll;
            AccBuilderEasyClues.c = lIIIIIlII[lIIIIIllI[57]];
            if (e.llIllIIIlll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIIIllI[43], lIIIIIllI[58], lIIIIIllI[2])) ? 1 : 0)) {
                e.c(new WorldPoint(lIIIIIllI[43], lIIIIIllI[59], lIIIIIllI[2]));
                Time.sleepTicks((int)lIIIIIllI[6]);
                0;
            }
            Movement.walkTo((WorldPoint)lIIlIlIlIIllIll);
            0;
            Time.sleepTicks((int)lIIIIIllI[0]);
            0;
        }
    }

    private static void llIllIIIlII() {
        lIIIIIllI = new int[252];
        e.lIIIIIllI[0] = 1;
        e.lIIIIIllI[1] = 3;
        e.lIIIIIllI[2] = (0x53 ^ 0x43 ^ (0x5A ^ 0x72)) & (0xA9 ^ 0xAD ^ (0xFB ^ 0xC7) ^ -1);
        e.lIIIIIllI[3] = 2;
        e.lIIIIIllI[4] = 0x18 ^ 0x17 ^ (0x3A ^ 0x31);
        e.lIIIIIllI[5] = 0xC0 ^ 0xC5;
        e.lIIIIIllI[6] = 0x89 ^ 0x8F;
        e.lIIIIIllI[7] = 0x29 ^ 0x2E;
        e.lIIIIIllI[8] = 77 + 2 - 70 + 124 ^ 2 + 37 - 18 + 120;
        e.lIIIIIllI[9] = 0xE6 ^ 0xBA ^ (0x5C ^ 9);
        e.lIIIIIllI[10] = 0x72 ^ 0x33 ^ (0x3A ^ 0x71);
        e.lIIIIIllI[11] = 0xC9 ^ 0xC2;
        e.lIIIIIllI[12] = 0xB1 ^ 0xBD;
        e.lIIIIIllI[13] = 0x55 ^ 0xF ^ (0xDD ^ 0x8A);
        e.lIIIIIllI[14] = -(0xFFFF9BBE & 0x6D67) & (0xFFFFCBFD & 0x3FBF);
        e.lIIIIIllI[15] = 0xBF ^ 0xA2;
        e.lIIIIIllI[16] = 0x50 ^ 0x76 ^ (0x5D ^ 0x75);
        e.lIIIIIllI[17] = 57 + 100 - 101 + 128 ^ 61 + 72 - 38 + 88;
        e.lIIIIIllI[18] = 0xFFFF9F61 & 0x6CFE;
        e.lIIIIIllI[19] = -(0xFFFFF7BB & 0x2AED) & (0xFFFFFFFE & 0x2FFF);
        e.lIIIIIllI[20] = 0x1C ^ 6 ^ (0x2A ^ 0xD);
        e.lIIIIIllI[21] = 0x4A ^ 0x51 ^ (0x4F ^ 0x7C);
        e.lIIIIIllI[22] = -(0xFFFFE4F9 & 0x3BBF) & (0xFFFFFFFF & 0x3FFF);
        e.lIIIIIllI[23] = 0x4B ^ 0x7D ^ (0x9E ^ 0xB8);
        e.lIIIIIllI[24] = 0xBD ^ 0xAC;
        e.lIIIIIllI[25] = (0x60 ^ 0x4A) + (0x9A ^ 0x8D) - (0xBC ^ 0x9E) + (6 ^ 0x61);
        e.lIIIIIllI[26] = 0x36 ^ 0x57 ^ (0x76 ^ 0);
        e.lIIIIIllI[27] = 0x65 ^ 0x77;
        e.lIIIIIllI[28] = -(0xFFFFDB95 & 0x26FB) & (0xFFFFBBFE & 0x7FFD);
        e.lIIIIIllI[29] = 0x26 ^ 0x22 ^ (0xAB ^ 0xBC);
        e.lIIIIIllI[30] = 0xB7 ^ 0xA3;
        e.lIIIIIllI[31] = -(0xFFFFCBDF & 0x76A3) & (0xFFFFFBFF & 0x7FEF);
        e.lIIIIIllI[32] = 0x5D ^ 0x74;
        e.lIIIIIllI[33] = 0x6B ^ 0x7E;
        e.lIIIIIllI[34] = 0x3E ^ 0x6E ^ (0xBD ^ 0x99);
        e.lIIIIIllI[35] = 0x40 ^ 0x60;
        e.lIIIIIllI[36] = 0x98 ^ 0x8E;
        e.lIIIIIllI[37] = 76 + 131 - 196 + 132 ^ 149 + 125 - 190 + 67;
        e.lIIIIIllI[38] = 54 + 87 - 97 + 88 ^ 4 + 124 - 14 + 43;
        e.lIIIIIllI[39] = 0xF7 ^ 0x9A ^ (0x4E ^ 0x39);
        e.lIIIIIllI[40] = 0x64 ^ 0x71 ^ (0xA6 ^ 0xA8);
        e.lIIIIIllI[41] = 0xBE ^ 0xA2;
        e.lIIIIIllI[42] = -(0xFFFFE7A7 & 0x3E79) & (0xFFFFFF7D & 0x7EBF);
        e.lIIIIIllI[43] = -(0xFFFFF36F & 0x7EB3) & (0xFFFFFFFF & 0x7BBF);
        e.lIIIIIllI[44] = 0xFFFFED3F & 0x1FF7;
        e.lIIIIIllI[45] = 0xFFFF8DBB & 0x7BDD;
        e.lIIIIIllI[46] = -(0xFFFFF976 & 0x168D) & (0xFFFF9F3B & 0x7DFF);
        e.lIIIIIllI[47] = 0xC8 ^ 0x84 ^ (0x59 ^ 0x36);
        e.lIIIIIllI[48] = 0xFFFFBDFF & 0x4B77;
        e.lIIIIIllI[49] = -(0xFFFFFAFD & 0x15C3) & (0xFFFFDFFF & 0x3DFF);
        e.lIIIIIllI[50] = 28 + 121 - 7 + 85 ^ 155 + 1 - 97 + 105;
        e.lIIIIIllI[51] = 79 + 66 - 104 + 102;
        e.lIIIIIllI[52] = 0xFFFFD99D & 0x2FFE;
        e.lIIIIIllI[53] = -(0xFFFFFFB7 & 0x2C9) & (0xFFFFDFFF & 0x2FD9);
        e.lIIIIIllI[54] = 0x27 ^ 0x39;
        e.lIIIIIllI[55] = 0xF ^ 0x2A ^ (0x31 ^ 0xB);
        e.lIIIIIllI[56] = 0x2A ^ 0x4A ^ (0x4A ^ 0xB);
        e.lIIIIIllI[57] = 0x68 ^ 0x7A ^ (0 ^ 0x30);
        e.lIIIIIllI[58] = 0xFFFFADBD & 0x5F7B;
        e.lIIIIIllI[59] = -(0xFFFFFE2B & 0x63F7) & (0xFFFFFFE7 & 0x6F7F);
        e.lIIIIIllI[60] = 0x22 ^ 0x4C ^ (0xDA ^ 0x90);
        e.lIIIIIllI[61] = 109 + 0 - 58 + 112 ^ 43 + 68 - 90 + 113;
        e.lIIIIIllI[62] = -1;
        e.lIIIIIllI[63] = (0x1F ^ 0x26) + 1 - -(0x19 ^ 0x7D) + (0x8F ^ 0x81);
        e.lIIIIIllI[64] = -(0xFFFFFFE7 & 0x3DBB) & (0xFFFFBFFB & 0x7FF7);
        e.lIIIIIllI[65] = 0xB ^ 0x2D;
        e.lIIIIIllI[66] = 0xD1 ^ 0x94 ^ (0x11 ^ 0x73);
        e.lIIIIIllI[67] = 0x43 ^ 0x69;
        e.lIIIIIllI[68] = 0xF6 ^ 0x84 ^ (0xDA ^ 0x83);
        e.lIIIIIllI[69] = 0x48 ^ 0x64;
        e.lIIIIIllI[70] = 102 + 7 - 95 + 163 ^ 82 + 125 - 141 + 90;
        e.lIIIIIllI[71] = 107 + 123 - 165 + 84 ^ 102 + 164 - 175 + 76;
        e.lIIIIIllI[72] = 19 + 26 - -74 + 34;
        e.lIIIIIllI[73] = 0x6C ^ 9;
        e.lIIIIIllI[74] = 0x9C ^ 0xB2;
        e.lIIIIIllI[75] = 0xFFFFD7BF & 0x2FDE;
        e.lIIIIIllI[76] = 17 + 43 - 35 + 104 ^ 32 + 104 - 22 + 60;
        e.lIIIIIllI[77] = 0xB5 ^ 0xB0 ^ (0x48 ^ 0x7D);
        e.lIIIIIllI[78] = 0x40 ^ 0x71;
        e.lIIIIIllI[79] = 0xFFFF8DFA & 0x73DF;
        e.lIIIIIllI[80] = 0xFFFFF3FF & 0xE15;
        e.lIIIIIllI[81] = 0xE7 ^ 0x99 ^ (0xF0 ^ 0xBD);
        e.lIIIIIllI[82] = 0x20 ^ 0x70 ^ (0x49 ^ 0x2D);
        e.lIIIIIllI[83] = 132 + 97 - 124 + 85 ^ 76 + 72 - 31 + 22;
        e.lIIIIIllI[84] = 57 + 73 - 77 + 87 ^ 147 + 59 - 74 + 54;
        e.lIIIIIllI[85] = 0x73 ^ 0x44;
        e.lIIIIIllI[86] = 0x39 ^ 1;
        e.lIIIIIllI[87] = 0xAB ^ 0x92;
        e.lIIIIIllI[88] = 107 + 72 - 59 + 42 ^ 39 + 84 - 12 + 41;
        e.lIIIIIllI[89] = 0xA4 ^ 0xC0;
        e.lIIIIIllI[90] = 0x2E ^ 0x15;
        e.lIIIIIllI[91] = 0x1C ^ 0x20;
        e.lIIIIIllI[92] = 0xFFFFCEFF & 0x3D76;
        e.lIIIIIllI[93] = -(0xFFFFF107 & 0x7EFB) & (0xFFFFFC7F & Short.MAX_VALUE);
        e.lIIIIIllI[94] = -(0xFFFFE0F9 & 0x3F87) & (0xFFFFFFFF & 0x2CFE);
        e.lIIIIIllI[95] = -(0xFFFFD06E & 0x6F9D) & (0xFFFFED9F & 0x5EEF);
        e.lIIIIIllI[96] = -(0xFFFFF6AF & 0x7B5E) & (0xFFFFFFFF & 0x7E7D);
        e.lIIIIIllI[97] = 0xFFFF8DED & 0x7F7F;
        e.lIIIIIllI[98] = 0xC9 ^ 0x93 ^ (0x11 ^ 0x20);
        e.lIIIIIllI[99] = 0xFFFF87FA & 0x795F;
        e.lIIIIIllI[100] = -(0xFFFFFE8A & 0x3377) & (0xFFFFB7B7 & 0x7B7B);
        e.lIIIIIllI[101] = -(0xFFFFB48D & 0x6B73) & (0xFFFFF3FE & 0x2D37);
        e.lIIIIIllI[102] = -(0xFFFFFBD6 & 0x743F) & (0xFFFFFD7D & 0x73F7);
        e.lIIIIIllI[103] = -(0xFFFFFE9D & 0x49FF) & (0xFFFFEDFF & 0x5BFF);
        e.lIIIIIllI[104] = -(0xFFFFBD96 & 0x46FB) & (0xFFFFDFFF & 0x25F5);
        e.lIIIIIllI[105] = 0xFFFF8765 & 0x79FF;
        e.lIIIIIllI[106] = 0xFFFFE5EE & 0x1B77;
        e.lIIIIIllI[107] = 0xFFFF85F6 & 0x7B8B;
        e.lIIIIIllI[108] = -(0xFFFFBFCF & 0x5C75) & (0xFFFFDDEF & 0x3FDF);
        e.lIIIIIllI[109] = -(0xFFFFEEF5 & 0x752F) & (0xFFFFF5F6 & 0x6FFF);
        e.lIIIIIllI[110] = -2 & (0xFFFFE1FF & 0x1FEF);
        e.lIIIIIllI[111] = -(0xFFFFFF7B & 0x7C85) & (0xFFFFFFFF & 0x7DEF);
        e.lIIIIIllI[112] = 0xFFFFFBF6 & 0x5F9;
        e.lIIIIIllI[113] = 0xFFFFE6BD & 0x1B5A;
        e.lIIIIIllI[114] = -(0xFFFFFC7F & 0x7FA3) & (0xFFFFFEBF & 0x7F66);
        e.lIIIIIllI[115] = 0xFFFF8DBF & 0x737A;
        e.lIIIIIllI[116] = -(0xFFFFDC55 & 0x7FAB) & (0xFFFFDFFB & 0x7DEF);
        e.lIIIIIllI[117] = -(0xFFFFFFFD & 0x7433) & (0xFFFFFF7F & 0x75FE);
        e.lIIIIIllI[118] = 0xFFFFE77A & 0x19E7;
        e.lIIIIIllI[119] = 0xFFFFF1FF & 0xFDD;
        e.lIIIIIllI[120] = -(0xFFFFEBFF & 0x7CAD) & (0xFFFFFFEF & 0x69FE);
        e.lIIIIIllI[121] = -(0xFFFFFD5D & 0x5EA3) & (0xFFFFDF75 & 0x7DBB);
        e.lIIIIIllI[122] = -(0xFFFFFEDD & 0x7DE3) & (0xFFFFFDFB & Short.MAX_VALUE);
        e.lIIIIIllI[123] = 0xFFFF9972 & 0x67FF;
        e.lIIIIIllI[124] = 0xFFFF8FEE & 0x7155;
        e.lIIIIIllI[125] = 0xFFFFD94F & 0x27F5;
        e.lIIIIIllI[126] = -(0xFFFF98F7 & 0x6FAF) & (0xFFFF8FFE & 0x79EF);
        e.lIIIIIllI[127] = 0xFFFF8DBD & 0x73FF;
        e.lIIIIIllI[128] = -(0xFFFFB617 & 0x5FEB) & (0xFFFFD7DB & 0x3FF6);
        e.lIIIIIllI[129] = -(0xFFFFB335 & 0x6EEB) & (0xFFFFE3FE & 0x3FFF);
        e.lIIIIIllI[130] = 0xFFFFE3EE & 0x1DFB;
        e.lIIIIIllI[131] = 0xFFFFB9ED & 0x47FE;
        e.lIIIIIllI[132] = 0xFFFFA3FB & 0x5DFF;
        e.lIIIIIllI[133] = 0xFFFFB77E & 0x4A8B;
        e.lIIIIIllI[134] = -(0xFFFFF5AF & 0x7A72) & (0xFFFFF76F & 0x79FB);
        e.lIIIIIllI[135] = -(0xFFFFEFFF & 0x7E23) & (0xFFFFEFF7 & 0x7FFB);
        e.lIIIIIllI[136] = -(0xFFFFF9FB & 0x5EF7) & (0xFFFFDFFB & 0x7AF6);
        e.lIIIIIllI[137] = 0xFFFFEE7F & 0x13AF;
        e.lIIIIIllI[138] = 0xFFFF9579 & 0x6BFF;
        e.lIIIIIllI[139] = -(0xFFFFE7B9 & 0x5EC7) & (0xFFFFDFFC & 0x67CF);
        e.lIIIIIllI[140] = -(0xFFFFFFD9 & 0x3A27) & (0xFFFFFFFD & 0x3BFB);
        e.lIIIIIllI[141] = 0xFFFFD37D & 0x2DD3;
        e.lIIIIIllI[142] = -(0xFFFFBED6 & 0x5DFF) & (0xFFFFDEDF & 0x3FF7);
        e.lIIIIIllI[143] = -(0xFFFF9FA1 & 0x7AFF) & (0xFFFF9BE7 & Short.MAX_VALUE);
        e.lIIIIIllI[144] = 0xFFFFC9FE & 0x37E1;
        e.lIIIIIllI[145] = -(0xFFFF9FA5 & 0x747F) & (0xFFFFBD7D & 0x57FE);
        e.lIIIIIllI[146] = 0xFFFFB1FF & 0x4FDF;
        e.lIIIIIllI[147] = 0xFFFF9BEF & 0x65FD;
        e.lIIIIIllI[148] = 0xFFFF87FE & 0x7957;
        e.lIIIIIllI[149] = 0xFFFFBFBE & 0x41FF;
        e.lIIIIIllI[150] = 0xFFFFC772 & 0x39CD;
        e.lIIIIIllI[151] = 0xFFFFCBFE & 0x355F;
        e.lIIIIIllI[152] = 0xFFFF8BDB & 0x7565;
        e.lIIIIIllI[153] = 0xFFFF9B77 & 0x65DD;
        e.lIIIIIllI[154] = 0xFFFF85B6 & 0x7BEF;
        e.lIIIIIllI[155] = -(0xFFFFCB23 & 0x7EDD) & (0xFFFFFFFF & 0x4BCF);
        e.lIIIIIllI[156] = -(0xFFFFF3BB & 0x3ECD) & (0xFFFFFFFE & 0x33FF);
        e.lIIIIIllI[157] = 0xFFFFEB7E & 0x15F9;
        e.lIIIIIllI[158] = 0xFFFF9B5C & 0x65F3;
        e.lIIIIIllI[159] = 0xFFFFAD79 & 0x53CF;
        e.lIIIIIllI[160] = 0xFFFFE9DB & 0x176F;
        e.lIIIIIllI[161] = 0x49 ^ 0x77;
        e.lIIIIIllI[162] = -(0xFFFFFA93 & 0x5F7D) & (0xFFFFDBDF & 0x7F7D);
        e.lIIIIIllI[163] = 0x8D ^ 0xB2;
        e.lIIIIIllI[164] = 0xFFFFE375 & 0x1DBA;
        e.lIIIIIllI[165] = 0x29 ^ 0x69;
        e.lIIIIIllI[166] = -(0xFFFFD436 & 0x7FDF) & (0xFFFFF57F & 0x5FFF);
        e.lIIIIIllI[167] = 105 + 84 - 101 + 124 ^ 68 + 39 - 16 + 58;
        e.lIIIIIllI[168] = -(0xFFFFD97D & 0x6EB7) & (0xFFFFEBFF & 0x5D77);
        e.lIIIIIllI[169] = 0xE6 ^ 0xA4;
        e.lIIIIIllI[170] = -(0xFFFF8C39 & 0x7FC7) & (0xFFFFCDFB & 0x3F37);
        e.lIIIIIllI[171] = 0xF1 ^ 0xB2;
        e.lIIIIIllI[172] = -(0xFFFFEDCB & 0x767D) & (0xFFFFEF7F & 0x75FD);
        e.lIIIIIllI[173] = 0xFD ^ 0xAE ^ (0x90 ^ 0x87);
        e.lIIIIIllI[174] = -(0xFFFFFBEF & 0x1E91) & (0xFFFFFBB7 & 0x1FFF);
        e.lIIIIIllI[175] = 0x49 ^ 0xC;
        e.lIIIIIllI[176] = -(0xFFFFF89D & 0x276B) & (0xFFFFA9FF & 0x777F);
        e.lIIIIIllI[177] = 0x68 ^ 0x54 ^ (0x77 ^ 0xD);
        e.lIIIIIllI[178] = 0xFFFF8DFB & 0x737E;
        e.lIIIIIllI[179] = -(0xFFFFB9FF & 0x767D) & (0xFFFFF3FF & 0x3E7D);
        e.lIIIIIllI[180] = 9 ^ 0x7D ^ (0x12 ^ 0x2E);
        e.lIIIIIllI[181] = 0xFFFFDB2F & 0x25FF;
        e.lIIIIIllI[182] = 0x61 ^ 0x28;
        e.lIIIIIllI[183] = 0xFFFFB17F & 0x4FB8;
        e.lIIIIIllI[184] = 0xE ^ 0x44;
        e.lIIIIIllI[185] = -(0xFFFFFEED & 0x6F57) & (0xFFFFFF7F & 0x6FFD);
        e.lIIIIIllI[186] = 36 + 74 - 77 + 201 ^ 149 + 147 - 219 + 84;
        e.lIIIIIllI[187] = -(0xFFFFFF7B & 0x2AC5) & (0xFFFFEF7D & 0x3BFF);
        e.lIIIIIllI[188] = 0x1F ^ 0x3B ^ (0xCB ^ 0xA3);
        e.lIIIIIllI[189] = -(0xFFFFBE7F & 0x75A9) & (0xFFFFB7FF & 0x7D7B);
        e.lIIIIIllI[190] = 0xF6 ^ 0xBB;
        e.lIIIIIllI[191] = -(0xFFFFFF94 & 0x72EF) & (0xFFFFFFDF & 0x73F7);
        e.lIIIIIllI[192] = 0x7A ^ 0x34;
        e.lIIIIIllI[193] = 0xFFFFAB7F & 0x55D7;
        e.lIIIIIllI[194] = 1 ^ (0xE2 ^ 0xAC);
        e.lIIIIIllI[195] = 0xFFFFFDFF & 0x35B;
        e.lIIIIIllI[196] = 54 + 42 - 38 + 173 ^ 141 + 41 - 80 + 81;
        e.lIIIIIllI[197] = 0xFFFF87DC & 0x797F;
        e.lIIIIIllI[198] = 178 + 51 - 162 + 169 ^ 82 + 111 - 164 + 160;
        e.lIIIIIllI[199] = -(0xFFFFFAD7 & 0x3D29) & (0xFFFFBFFF & 0x795F);
        e.lIIIIIllI[200] = 5 ^ 0x57;
        e.lIIIIIllI[201] = 0xFFFFE57F & 0x1BE7;
        e.lIIIIIllI[202] = 0x3A ^ 0x69;
        e.lIIIIIllI[203] = -(0xFFFFAF27 & 0x52DB) & (0xFFFFC36A & 0x3FFF);
        e.lIIIIIllI[204] = 0x37 ^ 0x63;
        e.lIIIIIllI[205] = -(0xFFFFFDB5 & 0x76CB) & (0xFFFFF7FF & 0x7DEF);
        e.lIIIIIllI[206] = 0x1A ^ 0x4F;
        e.lIIIIIllI[207] = -(0xFFFFD69E & 0x7FEF) & (0xFFFFFFFD & 0x57FF);
        e.lIIIIIllI[208] = 0x7C ^ 0x38 ^ (0xA8 ^ 0xBA);
        e.lIIIIIllI[209] = -(0xFFFFE6BD & 0x395F) & (0xFFFFB7FF & 0x69FD);
        e.lIIIIIllI[210] = 0x36 ^ 0x61;
        e.lIIIIIllI[211] = -(0xFFFF9B7F & 0x7695) & (0xFFFFBFF6 & 0x53FF);
        e.lIIIIIllI[212] = 0x59 ^ 0x2F ^ (1 ^ 0x2F);
        e.lIIIIIllI[213] = 0xFFFFC9E4 & 0x37FF;
        e.lIIIIIllI[214] = 0x3F ^ 0x66;
        e.lIIIIIllI[215] = -(0xFFFFE79B & 0x1E7F) & (0xFFFFFFFF & 0x7FF);
        e.lIIIIIllI[216] = 0x1B ^ 0x24 ^ (0x5C ^ 0x39);
        e.lIIIIIllI[217] = -(0xFFFFFE5D & 0x11A3) & (0xFFFF9DFE & 0x73E7);
        e.lIIIIIllI[218] = 109 + 119 - 105 + 96 ^ 28 + 19 - 1 + 82;
        e.lIIIIIllI[219] = -(0xFFFFBF9F & 0x5E69) & (0xFFFFFFEF & 0x1FFF);
        e.lIIIIIllI[220] = 125 + 51 - 1 + 17 ^ 26 + 101 - 68 + 97;
        e.lIIIIIllI[221] = 0xFFFFD3F8 & 0x2DEF;
        e.lIIIIIllI[222] = 0x28 ^ 0x75;
        e.lIIIIIllI[223] = 0xFFFFE9FB & 0x17ED;
        e.lIIIIIllI[224] = 0x60 ^ 0x3E;
        e.lIIIIIllI[225] = -(0xFFFFFF5F & 0x4EA5) & (0xFFFFEFFF & 0x5FFE);
        e.lIIIIIllI[226] = 0x6B ^ 0x34;
        e.lIIIIIllI[227] = -(0xFFFFBE7F & 0x4B83) & (0xFFFFCBFE & 0x3FFF);
        e.lIIIIIllI[228] = 0x4E ^ 0x3F ^ (0x64 ^ 0x75);
        e.lIIIIIllI[229] = 0xFFFFFBFD & 0x5FF;
        e.lIIIIIllI[230] = 142 + 7 - -81 + 0 ^ 43 + 15 - -44 + 33;
        e.lIIIIIllI[231] = 0xFFFFC9FF & 0x37FE;
        e.lIIIIIllI[232] = 0x34 ^ 0x76 ^ (0x84 ^ 0xA4);
        e.lIIIIIllI[233] = -(0xFFFFFF5F & 0x62A1) & (0xFFFFE3FF & Short.MAX_VALUE);
        e.lIIIIIllI[234] = 0x6A ^ 9;
        e.lIIIIIllI[235] = -(0xFFFFF8FB & 0x1FDF) & (0xFFFFFBFF & 0x1EDF);
        e.lIIIIIllI[236] = 0xFFFFA616 & 0x5BEF;
        e.lIIIIIllI[237] = -(0xFFFFF5F7 & 0x6BF9) & (0xFFFFF3FF & 0x6FF7);
        e.lIIIIIllI[238] = 24 + 88 - 55 + 165 ^ 96 + 5 - -66 + 17;
        e.lIIIIIllI[239] = -(0xFFFFFFE7 & 0x301D) & (0xFFFFFF4F & 0x32BC);
        e.lIIIIIllI[240] = 167 + 123 - 231 + 174 ^ 108 + 97 - 63 + 0;
        e.lIIIIIllI[241] = 0xFFFFB72D & 0x4ADB;
        e.lIIIIIllI[242] = 0xF3 ^ 0x9B;
        e.lIIIIIllI[243] = 0xFFFF9ABF & 0x674B;
        e.lIIIIIllI[244] = 3 ^ (0x6E ^ 4);
        e.lIIIIIllI[245] = 0xFFFFE33D & 0x1ECE;
        e.lIIIIIllI[246] = 0xA ^ 0x5A ^ (0xA3 ^ 0x99);
        e.lIIIIIllI[247] = 0xFFFF93BD & 0x6E4F;
        e.lIIIIIllI[248] = -(0xFFFFF266 & 0x7D9F) & (0xFFFFFEED & 0x7D9F);
        e.lIIIIIllI[249] = -(0xFFFFCBDF & 0x366D) & (0xFFFFCEDF & 0x3FFF);
        e.lIIIIIllI[250] = -(0xFFFFBDC9 & 0x7677) & (0xFFFFBFFD & 0x7FCF);
        e.lIIIIIllI[251] = 0xFFFFEF6D & 0x1D96;
    }

    public static void G() {
        if (e.llIllIIIlIl(Widgets.get((int)lIIIIIllI[72]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get((int)lIIIIIllI[72], (int)lIIIIIllI[23]);
            Mouse.click((int)widget.getClickPoint().getX(), (int)widget.getClickPoint().getY(), (boolean)lIIIIIllI[0]);
            Time.sleepTicks((int)lIIIIIllI[1]);
            0;
        }
    }

    private static boolean llIllIIIlIl(int n2) {
        return n2 == 0;
    }
}

