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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.o;
import gg.squire.account.AccBuilderGWD;
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
    private static final /* synthetic */ int aa;
    public static final /* synthetic */ String S;
    public static /* synthetic */ WorldPoint af;
    private static final /* synthetic */ int ad;
    static final /* synthetic */ WorldArea V;
    static final /* synthetic */ WorldArea U;
    private static final /* synthetic */ int ab;
    private static /* synthetic */ String[] lllIIlllI;
    private static /* synthetic */ int[] lllIIllll;
    public static /* synthetic */ int[] ag;
    private static final /* synthetic */ int[] ae;
    private static final /* synthetic */ long W;
    private static final /* synthetic */ long X;
    public static final /* synthetic */ ThreadLocalRandom T;
    private static final /* synthetic */ int ac;
    private static final /* synthetic */ int Z;
    static /* synthetic */ WorldArea ai;
    private static final /* synthetic */ Map<Integer, Integer> Y;
    static /* synthetic */ WorldPoint ah;

    private static boolean llIIIlIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIlIIIIll(String lllIIllIIIlIl, String lllIIllIIIIlI) {
        try {
            SecretKeySpec lllIIllIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIllIIIIlI.getBytes(StandardCharsets.UTF_8)), lllIIllll[14]), "DES");
            Cipher lllIIllIIIlll = Cipher.getInstance("DES");
            lllIIllIIIlll.init(lllIIllll[9], lllIIllIIlIII);
            return new String(lllIIllIIIlll.doFinal(Base64.getDecoder().decode(lllIIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIllIIIllI) {
            lllIIllIIIllI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int c(int n2, int n3) {
        void lllIlIlIIIIIl;
        int lllIlIlIIIIII;
        int lllIlIlIIIIlI;
        int n4 = n3 - n2;
        if (e.llIIIlIIlIlI(n4)) {
            return lllIlIlIIIIlI;
        }
        if (e.llIIIlIIlllI(Math.abs(lllIlIlIIIIII), lllIIllll[1])) {
            int n5;
            if (e.llIIIlIIllII(T.nextBoolean() ? 1 : 0)) {
                n5 = lllIlIlIIIIlI;
                0;
                if (((9 ^ 0x16) & ~(0xB9 ^ 0xA6)) != 0) {
                    return (0x1A ^ 0xD) & ~(0x25 ^ 0x32);
                }
            } else {
                n5 = lllIlIlIIIIIl;
            }
            return n5;
        }
        if (e.llIIIlIIllll(lllIlIlIIIIII)) {
            lllIlIlIIIIII = lllIlIlIIIIlI;
            lllIlIlIIIIlI = lllIlIlIIIIIl;
            n3 = lllIlIlIIIIII;
        }
        return n2 + T.nextInt(n3 - n2 + lllIIllll[1]);
    }

    public static void a(WorldPoint worldPoint) {
        if (e.llIIIlIIlIlI(o.cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (e.llIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(o.cD), lllIIllll[5])) {
                AccBuilderGWD.c = lllIIlllI[lllIIllll[9]];
                Movement.walkTo((WorldPoint)o.cD);
                0;
                Time.sleepTicks((int)lllIIllll[1]);
                0;
            }
            if (e.llIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(o.cD), lllIIllll[5])) {
                NPC lllIlIIlllIll;
                AccBuilderGWD.c = lllIIlllI[lllIIllll[5]];
                if (e.llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (e.llIIIlIIlIll(lllIlIIlllIll = NPCs.getNearest(nPC -> {
                    String[] stringArray = new String[lllIIllll[1]];
                    stringArray[e.lllIIllll[2]] = lllIIlllI[lllIIllll[28]];
                    return nPC.hasAction(stringArray);
                }))) {
                    String[] stringArray = new String[lllIIllll[1]];
                    stringArray[e.lllIIllll[2]] = lllIIlllI[lllIIllll[10]];
                    if (e.llIIIlIIllII(lllIlIIlllIll.hasAction(stringArray) ? 1 : 0)) {
                        lllIlIIlllIll.interact(lllIIlllI[lllIIllll[11]]);
                        Time.sleepTicks((int)lllIIllll[5]);
                        0;
                    }
                    String[] stringArray2 = new String[lllIIllll[1]];
                    stringArray2[e.lllIIllll[2]] = lllIIlllI[lllIIllll[12]];
                    if (e.llIIIlIIlIlI(lllIlIIlllIll.hasAction(stringArray2) ? 1 : 0)) {
                        g.b(lllIIlllI[lllIIllll[13]], o.cG);
                        Time.sleepTicks((int)lllIIllll[1]);
                        0;
                    }
                }
                String[] stringArray = new String[lllIIllll[1]];
                stringArray[e.lllIIllll[2]] = lllIIlllI[lllIIllll[14]];
                NPC lllIlIIlllIlI = NPCs.getNearest((String[])stringArray);
                if (e.llIIIlIIlIll(lllIlIIlllIlI)) {
                    String[] stringArray3 = new String[lllIIllll[1]];
                    stringArray3[e.lllIIllll[2]] = lllIIlllI[lllIIllll[15]];
                    if (e.llIIIlIIllII(lllIlIIlllIlI.hasAction(stringArray3) ? 1 : 0)) {
                        lllIlIIlllIlI.interact(lllIIlllI[lllIIllll[16]]);
                        Time.sleepTicks((int)lllIIllll[5]);
                        0;
                    }
                    String[] stringArray4 = new String[lllIIllll[1]];
                    stringArray4[e.lllIIllll[2]] = lllIIlllI[lllIIllll[17]];
                    if (e.llIIIlIIlIlI(lllIlIIlllIlI.hasAction(stringArray4) ? 1 : 0)) {
                        g.b(lllIIlllI[lllIIllll[18]], o.cG);
                        Time.sleepTicks((int)lllIIllll[1]);
                        0;
                    }
                }
            }
        }
        if (e.llIIIlIIllII(o.cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint lllIlIIllllII;
            Movement.walkTo((WorldPoint)lllIlIIllllII);
            0;
            Time.sleepTicks((int)lllIIllll[1]);
            0;
        }
    }

    public static void b(int[] nArray) {
        int[] lllIlIlIlllll;
        int lllIlIlIllllI = lllIIllll[2];
        while (e.llIIIlIIlIIl(lllIlIlIllllI, lllIlIlIlllll.length)) {
            AccBuilderGWD.c = lllIIlllI[lllIIllll[2]];
            if (e.llIIIlIIlIlI(lllIlIlIlllll[lllIlIlIllllI])) {
                0;
                if ((0x64 ^ 2 ^ (0x65 ^ 6)) == 0) {
                    return;
                }
            } else {
                Time.sleepTicks((int)lllIIllll[1]);
                0;
                e.l(lllIlIlIlllll[lllIlIlIllllI]);
                Time.sleep((long)e.c(lllIIllll[3], lllIIllll[4]));
                0;
            }
            ++lllIlIlIllllI;
            0;
            if (-(21 + 190 - 147 + 130 ^ 147 + 35 - 114 + 130) < 0) continue;
            return;
        }
        Time.sleepTicks((int)e.c(lllIIllll[1], lllIIllll[5]));
        0;
    }

    private static String llIIIlIIIlIl(String lllIIllIlIIII, String lllIIllIIllll) {
        try {
            SecretKeySpec lllIIllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIllIlIlII = Cipher.getInstance("Blowfish");
            lllIIllIlIlII.init(lllIIllll[9], lllIIllIlIlIl);
            return new String(lllIIllIlIlII.doFinal(Base64.getDecoder().decode(lllIIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIllIlIIll) {
            lllIIllIlIIll.printStackTrace();
            return null;
        }
    }

    public static String h(int n2) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String string = numberFormat.format(n2);
        return string;
    }

    private static boolean llIIIlIIlIlI(int n2) {
        return n2 == 0;
    }

    public static void C() {
        Widget widget = Widgets.get((int)lllIIllll[41], (int)lllIIllll[42]);
        if (e.llIIIlIIlIll(widget)) {
            widget.interact(lllIIlllI[lllIIllll[43]]);
            Time.sleepTicks((int)lllIIllll[1]);
            0;
        }
    }

    public static void t() {
        List list = Widgets.getAll((int)lllIIllll[6], widget -> widget.getText().contains(lllIIlllI[lllIIllll[101]]));
        List list2 = Widgets.getAll((int)lllIIllll[7], widget -> widget.getText().contains(lllIIlllI[lllIIllll[100]]));
        List list3 = Widgets.getAll((int)lllIIllll[8], widget -> widget.getText().contains(lllIIlllI[lllIIllll[99]]));
        int lllIlIlIlIlIl = lllIIllll[2];
        while (e.llIIIlIIlIIl(lllIlIlIlIlIl, ae.length)) {
            Widget lllIlIlIlIlII = Widgets.get((int)ae[lllIlIlIlIlIl], widget -> widget.getText().contains(lllIIlllI[lllIIllll[98]]));
            if (e.llIIIlIIlIll(lllIlIlIlIlII)) {
                Keyboard.sendSpace();
                System.out.println("Found Conversation continue window :" + ae[lllIlIlIlIlIl]);
            }
            ++lllIlIlIlIlIl;
            0;
            if ((0x56 ^ 0x53) > 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(WorldPoint worldPoint) {
        void lllIlIIIIllII;
        void lllIlIIIIllIl;
        void lllIlIIIIlllI;
        WorldPoint worldPoint2 = new WorldPoint(lllIIllll[51], lllIIllll[52], lllIIllll[2]);
        WorldArea worldArea = new WorldArea(lllIIllll[53], lllIIllll[54], lllIIllll[15], lllIIllll[55], lllIIllll[2]);
        WorldArea worldArea2 = new WorldArea(lllIIllll[56], lllIIllll[57], lllIIllll[58], lllIIllll[59], lllIIllll[2]);
        if (e.llIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllIIllll[12]) && e.llIIIlIIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.llIIIlIIlIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.llIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIIllll[60], lllIIllll[61], lllIIllll[1])), lllIIllll[35])) {
            AccBuilderGWD.c = lllIIlllI[lllIIllll[42]];
            if (e.llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)lllIlIIIIlllI);
            0;
            Time.sleepTicks((int)lllIIllll[1]);
            0;
        }
        if (e.llIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllIlIIIIlllI), lllIIllll[12]) && e.llIIIlIlIIIl(Players.getLocal().getWorldLocation().getY(), lllIIllll[52])) {
            if (e.llIIIlIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lllIIllll[1]];
                stringArray[e.lllIIllll[2]] = lllIIlllI[lllIIllll[62]];
                TileObjects.getNearest((String[])stringArray).interact(lllIIlllI[lllIIllll[63]]);
                Time.sleepTicks((int)lllIIllll[9]);
                0;
            }
            if (e.llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lllIIllll[1]];
                stringArray[e.lllIIllll[2]] = lllIIlllI[lllIIllll[55]];
                g.a(stringArray);
            }
        }
        if (e.llIIIlIlIIII(Players.getLocal().getWorldLocation().getY(), lllIIllll[52]) && (!e.llIIIlIIlIlI(lllIlIIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.llIIIlIIlIlI(lllIlIIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || e.llIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIIllll[60], lllIIllll[61], lllIIllll[1])), lllIIllll[35]))) {
            WorldPoint lllIlIIIIllll;
            AccBuilderGWD.c = lllIIlllI[lllIIllll[64]];
            if (e.llIIIlIIllII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIIllll[51], lllIIllll[65], lllIIllll[2])) ? 1 : 0)) {
                e.c(new WorldPoint(lllIIllll[51], lllIIllll[66], lllIIllll[2]));
                Time.sleepTicks((int)lllIIllll[12]);
                0;
            }
            Movement.walkTo((WorldPoint)lllIlIIIIllll);
            0;
            Time.sleepTicks((int)lllIIllll[1]);
            0;
        }
    }

    public static boolean i(int n2) {
        int[] nArray = new int[lllIIllll[1]];
        nArray[e.lllIIllll[2]] = n2;
        return Bank.contains((int[])nArray);
    }

    public static boolean d(int[] nArray) {
        int[] lllIlIIllIlll;
        int lllIlIIllIllI = lllIIllll[2];
        while (e.llIIIlIIlIIl(lllIlIIllIllI, lllIlIIllIlll.length)) {
            if (e.llIIIlIIlIlI(e.i(lllIlIIllIlll[lllIlIIllIllI]) ? 1 : 0)) {
                System.out.println("Missing ID: " + lllIlIIllIlll[lllIlIIllIllI]);
                return lllIIllll[2];
            }
            ++lllIlIIllIllI;
            0;
            if (1 > 0) continue;
            return false;
        }
        return lllIIllll[1];
    }

    public static boolean B() {
        boolean bl;
        if (e.llIIIlIIlIll(Widgets.get((int)lllIIllll[33], (int)lllIIllll[1]))) {
            bl = lllIIllll[1];
            0;
            if (-2 >= 0) {
                return false;
            }
        } else {
            bl = lllIIllll[2];
        }
        return bl;
    }

    public static void y() {
        Widget widget = Widgets.get((int)lllIIllll[22], (int)lllIIllll[23], (int)lllIIllll[2]);
        if (e.llIIIlIIlIll(widget)) {
            widget.interact(lllIIlllI[lllIIllll[24]]);
            Time.sleepTicks((int)lllIIllll[5]);
            0;
        }
    }

    private static void llIIIlIIIllI() {
        lllIIlllI = new String[lllIIllll[180]];
        e.lllIIlllI[e.lllIIllll[2]] = e."Equipping gear";
        e.lllIIlllI[e.lllIIllll[1]] = e."-------";
        e.lllIIlllI[e.lllIIllll[9]] = e."Nav to veos";
        e.lllIIlllI[e.lllIIllll[5]] = e."Handle veos chat";
        e.lllIIlllI[e.lllIIllll[10]] = e."Port Piscarilius";
        e.lllIIlllI[e.lllIIllll[11]] = e."Port Piscarilius";
        e.lllIIlllI[e.lllIIllll[12]] = e."Port Piscarilius";
        e.lllIIlllI[e.lllIIllll[13]] = e."Veos";
        e.lllIIlllI[e.lllIIllll[14]] = e."Cabin Boy Herbert";
        e.lllIIlllI[e.lllIIllll[15]] = e."Port Piscarilius";
        e.lllIIlllI[e.lllIIllll[16]] = e."Port Piscarilius";
        e.lllIIlllI[e.lllIIllll[17]] = e."Port Piscarilius";
        e.lllIIlllI[e.lllIIllll[18]] = e."Cabin Boy Herbert";
        e.lllIIlllI[e.lllIIllll[19]] = e."%%0%dd";
        e.lllIIlllI[e.lllIIllll[20]] = e."C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";
        e.lllIIlllI[e.lllIIllll[21]] = e."line.separator";
        e.lllIIlllI[e.lllIIllll[24]] = e."Close";
        e.lllIIlllI[e.lllIIllll[25]] = e."Nav to Varrock W bank";
        e.lllIIlllI[e.lllIIllll[31]] = e."Break";
        e.lllIIlllI[e.lllIIllll[32]] = e."Handling banking";
        e.lllIIlllI[e.lllIIllll[35]] = e."Select Warnings";
        e.lllIIlllI[e.lllIIllll[37]] = e."Toggle";
        e.lllIIlllI[e.lllIIllll[40]] = e."Toggle";
        e.lllIIlllI[e.lllIIllll[34]] = e."Close";
        e.lllIIlllI[e.lllIIllll[43]] = e."All Settings";
        e.lllIIlllI[e.lllIIllll[44]] = e."Wear";
        e.lllIIlllI[e.lllIIllll[45]] = e."Wear";
        e.lllIIlllI[e.lllIIllll[46]] = e."Wield";
        e.lllIIlllI[e.lllIIllll[47]] = e."Wield";
        e.lllIIlllI[e.lllIIllll[23]] = e."Equip";
        e.lllIIlllI[e.lllIIllll[48]] = e."Equip";
        e.lllIIlllI[e.lllIIllll[50]] = e."Give me a PK skull.";
        e.lllIIlllI[e.lllIIllll[42]] = e."Nav to outside gate";
        e.lllIIlllI[e.lllIIllll[62]] = e."Gate";
        e.lllIIlllI[e.lllIIllll[63]] = e."Open";
        e.lllIIlllI[e.lllIIllll[55]] = e."Sorry, I'm a bit busy.";
        e.lllIIlllI[e.lllIIllll[64]] = e."Nav to stronghold tile";
        e.lllIIlllI[e.lllIIllll[67]] = e."POST";
        e.lllIIlllI[e.lllIIllll[68]] = e."Content-Type";
        e.lllIIlllI[e.lllIIllll[69]] = e."application/json";
        e.lllIIlllI[e.lllIIllll[29]] = e."Auto retaliate";
        e.lllIIlllI[e.lllIIllll[39]] = e."Auto retaliate";
        e.lllIIlllI[e.lllIIllll[73]] = e."Death's Coffer";
        e.lllIIlllI[e.lllIIllll[74]] = e."Handling death";
        e.lllIIlllI[e.lllIIllll[75]] = e."Death";
        e.lllIIlllI[e.lllIIllll[76]] = e."Talk-to";
        e.lllIIlllI[e.lllIIllll[77]] = e."Portal";
        e.lllIIlllI[e.lllIIllll[78]] = e."Use";
        e.lllIIlllI[e.lllIIllll[82]] = e."<str>";
        e.lllIIlllI[e.lllIIllll[84]] = e."total";
        e.lllIIlllI[e.lllIIllll[79]] = e."PvP";
        e.lllIIlllI[e.lllIIllll[85]] = e."PvP";
        e.lllIIlllI[e.lllIIllll[86]] = e."High";
        e.lllIIlllI[e.lllIIllll[89]] = e."Leagues";
        e.lllIIlllI[e.lllIIllll[90]] = e."Beta";
        e.lllIIlllI[e.lllIIllll[91]] = e."beta";
        e.lllIIlllI[e.lllIIllll[92]] = e."Deadman";
        e.lllIIlllI[e.lllIIllll[93]] = e."Deadman";
        e.lllIIlllI[e.lllIIllll[94]] = e."Speedrunning";
        e.lllIIlllI[e.lllIIllll[95]] = e."total";
        e.lllIIlllI[e.lllIIllll[96]] = e."Beta";
        e.lllIIlllI[e.lllIIllll[28]] = e."Port Piscarilius";
        e.lllIIlllI[e.lllIIllll[98]] = e."continue";
        e.lllIIlllI[e.lllIIllll[99]] = e."continue";
        e.lllIIlllI[e.lllIIllll[100]] = e."continue";
        e.lllIIlllI[e.lllIIllll[101]] = e."continue";
        e.lllIIlllI[e.lllIIllll[104]] = e."C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";
    }

    private static boolean llIIIlIlIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void c(int[] nArray) {
        int lllIlIlIIlIll;
        void lllIlIlIIlIIl;
        int n2 = lllIIllll[2];
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int lllIlIlIIlIII = lllIIllll[2];
        while (e.llIIIlIIlIIl(lllIlIlIIlIII, (int)lllIlIlIIlIIl)) {
            void lllIlIlIIlIlI;
            void lllIlIlIIIlll = lllIlIlIIlIlI[lllIlIlIIlIII];
            int lllIlIlIIIllI = Vars.getBit((int)lllIlIlIIIlll);
            if (!e.llIIIlIIllII(Y.containsKey((int)lllIlIlIIIlll) ? 1 : 0) || e.llIIIlIIllIl(Y.get((int)lllIlIlIIIlll), lllIlIlIIIllI)) {
                if (e.llIIIlIIllII(Y.containsKey((int)lllIlIlIIIlll) ? 1 : 0)) {
                    System.out.println((int)lllIlIlIIIlll + " - Old Value: " + String.valueOf(Y.get((int)lllIlIlIIIlll)) + ", Current Value: " + lllIlIlIIIllI);
                    0;
                    if (1 >= (0x77 ^ 0x66 ^ (0x14 ^ 1))) {
                        return;
                    }
                } else {
                    System.out.println((int)lllIlIlIIIlll + ": " + lllIlIlIIIllI);
                }
                Y.put((int)lllIlIlIIIlll, lllIlIlIIIllI);
                0;
                lllIlIlIIlIll = lllIIllll[1];
            }
            ++lllIlIlIIlIII;
            0;
            if ((39 + 23 - -14 + 65 ^ 1 + 83 - -46 + 6) > 0) continue;
            return;
        }
        if (e.llIIIlIIllII(lllIlIlIIlIll)) {
            System.out.println(lllIIlllI[lllIIllll[1]]);
        }
    }

    private static boolean llIIIlIIlIll(Object object) {
        return object != null;
    }

    private static void llIIIlIIIlll() {
        lllIIllll = new int[260];
        e.lllIIllll[0] = 0xD3 ^ 0xA4 ^ (0xD6 ^ 0xC7);
        e.lllIIllll[1] = 1;
        e.lllIIllll[2] = (0x15 ^ 0x3C) & ~(0x23 ^ 0xA);
        e.lllIIllll[3] = 146 + 28 - 46 + 36 + (136 + 149 - 52 + 4) - (118 + 154 - 107 + 7) + (0x39 ^ 0x23);
        e.lllIIllll[4] = 0xFFFFDFF7 & 0x21AD;
        e.lllIIllll[5] = 3;
        e.lllIIllll[6] = 118 + 130 - 54 + 35;
        e.lllIIllll[7] = (0x1D ^ 0x7E) + (0x3A ^ 0x59) - (6 + 109 - 1 + 50) + (109 + 51 - 103 + 71);
        e.lllIIllll[8] = 67 + 6 - 7 + 165;
        e.lllIIllll[9] = 2;
        e.lllIIllll[10] = 0x38 ^ 0x3C;
        e.lllIIllll[11] = 0x43 ^ 0x46;
        e.lllIIllll[12] = 136 + 8 - 27 + 28 ^ 7 + 147 - 75 + 72;
        e.lllIIllll[13] = 0xB7 ^ 0xB0;
        e.lllIIllll[14] = 0xBF ^ 0xB7;
        e.lllIIllll[15] = 0x72 ^ 0x7B;
        e.lllIIllll[16] = 0xA8 ^ 0x95 ^ (0x57 ^ 0x60);
        e.lllIIllll[17] = 0x51 ^ 0x59 ^ 3;
        e.lllIIllll[18] = 0x69 ^ 0x65;
        e.lllIIllll[19] = 0x2A ^ 0x27;
        e.lllIIllll[20] = 0x11 ^ 0x16 ^ (0xD ^ 4);
        e.lllIIllll[21] = 33 + 10 - 27 + 127 ^ 51 + 102 - 35 + 10;
        e.lllIIllll[22] = 0xFFFFF39F & 0xEF8;
        e.lllIIllll[23] = 0xF2 ^ 0xB8 ^ (0x76 ^ 0x21);
        e.lllIIllll[24] = 0x4D ^ 0x5D;
        e.lllIIllll[25] = 0 ^ 0x11;
        e.lllIIllll[26] = 0xFFFF8F78 & 0x7CE7;
        e.lllIIllll[27] = 0xFFFFADFE & 0x5F57;
        e.lllIIllll[28] = 118 + 104 - 158 + 73 ^ 29 + 5 - 24 + 170;
        e.lllIIllll[29] = 0xC8 ^ 0x94 ^ (0x48 ^ 0x3C);
        e.lllIIllll[30] = -(0xFFFFF539 & 0x6AD7) & (0xFFFFFFDF & 0x7F77);
        e.lllIIllll[31] = 0xD ^ 0x1B ^ (0x1B ^ 0x1F);
        e.lllIIllll[32] = 0xB7 ^ 0xA1 ^ (0x32 ^ 0x37);
        e.lllIIllll[33] = 65 + 29 - 16 + 56;
        e.lllIIllll[34] = 0x81 ^ 0x96;
        e.lllIIllll[35] = 11 + 49 - -3 + 90 ^ 42 + 2 - 27 + 124;
        e.lllIIllll[36] = -1 & (0xFFFFF96C & 0x3FFF);
        e.lllIIllll[37] = 0x34 ^ 0x21;
        e.lllIIllll[38] = -(0xFFFFEDB3 & 0x52DD) & (0xFFFFFBFF & 0x7DFD);
        e.lllIIllll[39] = 130 + 133 - 170 + 86 ^ 14 + 71 - -19 + 50;
        e.lllIIllll[40] = 109 + 155 - 164 + 63 ^ 96 + 173 - 98 + 10;
        e.lllIIllll[41] = 0x41 ^ 0x35;
        e.lllIIllll[42] = 0x88 ^ 0xB4 ^ (0xA1 ^ 0xBD);
        e.lllIIllll[43] = 0x2F ^ 0x4F ^ (0xD3 ^ 0xAB);
        e.lllIIllll[44] = 0xDC ^ 0xBB ^ (5 ^ 0x7B);
        e.lllIIllll[45] = 0x44 ^ 0x43 ^ (0x11 ^ 0xC);
        e.lllIIllll[46] = 0x27 ^ 0x4C ^ (0xE9 ^ 0x99);
        e.lllIIllll[47] = 73 + 105 - 116 + 65 ^ (0xFA ^ 0x99);
        e.lllIIllll[48] = 76 + 95 - 97 + 68 ^ 96 + 35 - 43 + 56;
        e.lllIIllll[49] = 0xFFFFDFFD & 0x781F;
        e.lllIIllll[50] = 0x4A ^ 0x55;
        e.lllIIllll[51] = -(0xFFFFFB1B & 0x66E7) & (0xFFFFFBDF & 0x6FBF);
        e.lllIIllll[52] = -(0xFFFFE6E9 & 0x59DF) & (0xFFFFCDFF & Short.MAX_VALUE);
        e.lllIIllll[53] = 0xFFFFEFBD & 0x19DB;
        e.lllIIllll[54] = 0xFFFFCFFA & 0x3D3D;
        e.lllIIllll[55] = 0x83 ^ 0xA0;
        e.lllIIllll[56] = -(0xFFFFF64F & 0x7DB1) & (0xFFFFFFF7 & 0x7D7F);
        e.lllIIllll[57] = -(0xFFFFE9ED & 0x36D3) & (0xFFFFADFF & Short.MAX_VALUE);
        e.lllIIllll[58] = 175 + 133 - 199 + 111 ^ 46 + 84 - 25 + 50;
        e.lllIIllll[59] = (8 ^ 1) + (0x10 ^ 0x4B) - (4 ^ 0x58) + (106 + 93 - 123 + 59);
        e.lllIIllll[60] = 0xFFFF8DBD & 0x7BDE;
        e.lllIIllll[61] = -(0xFFFFEE83 & 0x73FF) & (0xFFFFFFFF & 0x6FDB);
        e.lllIIllll[62] = 93 + 133 - 193 + 118 ^ 167 + 172 - 317 + 160;
        e.lllIIllll[63] = 0x87 ^ 0xA5;
        e.lllIIllll[64] = 0xC4 ^ 0xB0 ^ (0x1F ^ 0x4F);
        e.lllIIllll[65] = -(0xFFFFDFC5 & 0x727B) & (0xFFFFDFFD & 0x7F7B);
        e.lllIIllll[66] = 0xFFFFDD7F & 0x2FC5;
        e.lllIIllll[67] = 96 + 45 - 71 + 112 ^ 131 + 19 - 144 + 141;
        e.lllIIllll[68] = 0xCA ^ 0xB8 ^ (0xEB ^ 0xBF);
        e.lllIIllll[69] = 3 ^ (0xE1 ^ 0xC5);
        e.lllIIllll[70] = -1;
        e.lllIIllll[71] = (0x4F ^ 0x73) + (0x1A ^ 0x27) - (0x3C ^ 0x74) + (0xB8 ^ 0xC3);
        e.lllIIllll[72] = 0xFFFFFF59 & 0x2F7;
        e.lllIIllll[73] = 0x10 ^ 0x3A;
        e.lllIIllll[74] = 0x13 ^ 0x38;
        e.lllIIllll[75] = 0x7C ^ 1 ^ (0xA ^ 0x5B);
        e.lllIIllll[76] = 0x9A ^ 0xB7;
        e.lllIIllll[77] = 0x53 ^ 0x7D;
        e.lllIIllll[78] = 0x25 ^ 0x45 ^ (0x4F ^ 0);
        e.lllIIllll[79] = 0xFD ^ 0xBF ^ (0xD1 ^ 0xA1);
        e.lllIIllll[80] = 73 + 25 - -42 + 13;
        e.lllIIllll[81] = 0xE2 ^ 0x87;
        e.lllIIllll[82] = 0x37 ^ 7;
        e.lllIIllll[83] = 0xFFFF9F9F & 0x67FE;
        e.lllIIllll[84] = 96 + 119 - 108 + 25 ^ 99 + 0 - -80 + 2;
        e.lllIIllll[85] = 0x7B ^ 0x48;
        e.lllIIllll[86] = 75 + 63 - 67 + 71 ^ 32 + 105 - 51 + 100;
        e.lllIIllll[87] = 0xFFFF8BFE & 0x75DB;
        e.lllIIllll[88] = 0xFFFFDE9F & 0x2375;
        e.lllIIllll[89] = 0x5C ^ 0x69;
        e.lllIIllll[90] = 8 + 15 - -101 + 5 ^ 1 + 26 - -43 + 113;
        e.lllIIllll[91] = 0x95 ^ 0xC1 ^ (0xD7 ^ 0xB4);
        e.lllIIllll[92] = 73 + 154 - 132 + 74 ^ 135 + 35 - 125 + 100;
        e.lllIIllll[93] = 0x34 ^ 0xD;
        e.lllIIllll[94] = 0xDB ^ 0x98 ^ (0x43 ^ 0x3A);
        e.lllIIllll[95] = 0x9D ^ 0x81 ^ (0x32 ^ 0x15);
        e.lllIIllll[96] = 0x33 ^ 0xF;
        e.lllIIllll[97] = 0x3E ^ 0x4A ^ (0x55 ^ 0x45);
        e.lllIIllll[98] = 0x99 ^ 0xA0 ^ (0x91 ^ 0x96);
        e.lllIIllll[99] = 0x1F ^ 0x11 ^ (0x30 ^ 1);
        e.lllIIllll[100] = 0x32 ^ 0x3D ^ (0x4E ^ 1);
        e.lllIIllll[101] = 0x37 ^ 0x49 ^ (0x73 ^ 0x4C);
        e.lllIIllll[102] = 212 + 91 - 268 + 184;
        e.lllIIllll[103] = 91 + 38 - -11 + 53;
        e.lllIIllll[104] = 0x11 ^ 0x53;
        e.lllIIllll[105] = 146 + 35 - 109 + 123 + (0xCC ^ 0x96) - (14 + 150 - -8 + 74) + (95 + 157 - 166 + 92);
        e.lllIIllll[106] = 0xFFFF8FFE & 0x7C77;
        e.lllIIllll[107] = -(0xFFFFF987 & 0x66FB) & (0xFFFFFFFF & 0x6CFF);
        e.lllIIllll[108] = 0xFFFFEC7E & 0x1FFF;
        e.lllIIllll[109] = -(0xFFFFEE7D & 0x139E) & (0xFFFFEFBF & 0x1EDF);
        e.lllIIllll[110] = -(0xFFFFF7DF & 0x2BAF) & (0xFFFFBFFE & 0x6FFF);
        e.lllIIllll[111] = -(0xFFFFF9FF & 0x6693) & (0xFFFFEDFF & Short.MAX_VALUE);
        e.lllIIllll[112] = 0x58 ^ 0x33;
        e.lllIIllll[113] = -(0xFFFFAF75 & 0x5AAF) & (0xFFFFFFFF & 0xB7E);
        e.lllIIllll[114] = 0xFFFFE1B2 & 0x1F7F;
        e.lllIIllll[115] = 0xFFFF91B6 & 0x6F7F;
        e.lllIIllll[116] = 0xFFFF8B69 & 0x75F6;
        e.lllIIllll[117] = 0xFFFFE767 & 0x19FB;
        e.lllIIllll[118] = 0xFFFF8BED & 0x7576;
        e.lllIIllll[119] = -(0xFFFFEFB3 & 0x78DF) & (0xFFFFFFF7 & 0x69FF);
        e.lllIIllll[120] = 0xFFFFD3E6 & 0x2D7F;
        e.lllIIllll[121] = -(0xFFFFAE76 & 0x5FFB) & (0xFFFFCFFF & 0x3FF3);
        e.lllIIllll[122] = -(0xFFFFEEED & 0x1F77) & (0xFFFFEFFF & 0x1FEF);
        e.lllIIllll[123] = 0xFFFF97D2 & 0x69FF;
        e.lllIIllll[124] = -(0xFFFF9C4E & 0x73B3) & (0xFFFFFDEF & 0x13FF);
        e.lllIIllll[125] = 0xFFFFE3FF & 0x1DEF;
        e.lllIIllll[126] = -(0xFFFFDE5F & 0x7DA2) & (0xFFFFDFFF & 0x7DF1);
        e.lllIIllll[127] = 0xFFFFEB1F & 0x16F8;
        e.lllIIllll[128] = -(0xFFFFF2FF & 0x1DDA) & (0xFFFFBFDD & 0x52FF);
        e.lllIIllll[129] = 0xFFFF9B7B & 0x65BE;
        e.lllIIllll[130] = -(0xFFFFF1B9 & 0x4E47) & (0xFFFFC9FF & 0x77EB);
        e.lllIIllll[131] = 0xFFFFAD7E & 0x53CF;
        e.lllIIllll[132] = 0xFFFFB9EA & 0x4777;
        e.lllIIllll[133] = 0xFFFF83DD & 0x7DFF;
        e.lllIIllll[134] = -(0xFFFFFFF7 & 0x7A9E) & (0xFFFFFBD7 & Short.MAX_VALUE);
        e.lllIIllll[135] = 0xFFFFE5B9 & 0x1B77;
        e.lllIIllll[136] = -(0xFFFFBFF7 & 0x5A49) & (0xFFFFDFFF & 0x3B7B);
        e.lllIIllll[137] = -(0xFFFFC91E & 0x7EEF) & (0xFFFFDFFF & 0x697F);
        e.lllIIllll[138] = 0xFFFFBBC7 & 0x457C;
        e.lllIIllll[139] = 0xFFFF83ED & 0x7D57;
        e.lllIIllll[140] = -(0xFFFFFBB2 & 0x4EFF) & (0xFFFFDBFF & 0x6FF9);
        e.lllIIllll[141] = 0xFFFFCDFD & 0x33BF;
        e.lllIIllll[142] = 0xFFFF99DB & 0x67F4;
        e.lllIIllll[143] = -(0xFFFFEDFB & 0x7E25) & (0xFFFFFDFE & 0x6FFF);
        e.lllIIllll[144] = -(0xFFFFF845 & 0x7FBF) & (0xFFFFF9FE & 0x7FEF);
        e.lllIIllll[145] = -(0xFFFFFEEE & 0x315) & (0xFFFFD7EF & 0x2BFF);
        e.lllIIllll[146] = -(0xFFFFD2C7 & 0x3D3D) & (0xFFFFB3FF & 0x5DFF);
        e.lllIIllll[147] = 0xFFFFFF5E & 0x2AB;
        e.lllIIllll[148] = -(0xFFFFEFB1 & 0x32FF) & (0xFFFFF3FB & 0x2FFE);
        e.lllIIllll[149] = -(0xFFFFFEAF & 0x777B) & (0xFFFFFFFB & 0x77FF);
        e.lllIIllll[150] = 0xFFFFB721 & 0x4ADE;
        e.lllIIllll[151] = 0xFFFFAE2F & 0x53FF;
        e.lllIIllll[152] = -(0xFFFFBCBB & 0x57C5) & (0xFFFFB5FF & 0x5FF9);
        e.lllIIllll[153] = 0xFFFF9DDC & 0x636F;
        e.lllIIllll[154] = 0xFFFFA5FF & 0x5BF9;
        e.lllIIllll[155] = -(0xFFFF9FBD & 0x744F) & (0xFFFFFF5F & 0x15FD);
        e.lllIIllll[156] = -(0xFFFFF3BF & 0x6D55) & (0xFFFFFF17 & 0x63FE);
        e.lllIIllll[157] = -(0xFFFFA9C5 & 0x7EBB) & (0xFFFFE9F7 & 0x3FCF);
        e.lllIIllll[158] = 0xFFFFE5FD & 0x1BE2;
        e.lllIIllll[159] = -(0xFFFFEFB9 & 0x7AE7) & (0xFFFFEFF9 & 0x7BFE);
        e.lllIIllll[160] = 0xFFFFB3DF & 0x4DFF;
        e.lllIIllll[161] = 0xFFFFC1FD & 0x3FEF;
        e.lllIIllll[162] = 0xFFFFCF57 & 0x31FE;
        e.lllIIllll[163] = 0xFFFFA9BE & 0x57FF;
        e.lllIIllll[164] = -(0xFFFF97BF & 0x7EDD) & (0xFFFFBFFD & 0x57DE);
        e.lllIIllll[165] = 0xFFFFF37E & 0xDDF;
        e.lllIIllll[166] = 0xFFFFDD4D & 0x23F3;
        e.lllIIllll[167] = 0xFFFFCBF7 & 0x355D;
        e.lllIIllll[168] = 0xFFFFE5FF & 0x1BA6;
        e.lllIIllll[169] = -(0xFFFFDAD5 & 0x7F3B) & (0xFFFFFFFF & 0x5BDF);
        e.lllIIllll[170] = 0xFFFFE9FE & 0x1777;
        e.lllIIllll[171] = 0xFFFF9BFD & 0x657A;
        e.lllIIllll[172] = 0xFFFFFD7E & 0x3D1;
        e.lllIIllll[173] = 0xFFFFE14B & 0x1FFD;
        e.lllIIllll[174] = -(0xFFFFB6BF & 0x7FF5) & (0xFFFFFFFF & 0x37FF);
        e.lllIIllll[175] = 0xFFFFF3CF & 0xD7D;
        e.lllIIllll[176] = 0xFFFF9D31 & 0x63FE;
        e.lllIIllll[177] = 0xFFFFB16F & 0x4FFA;
        e.lllIIllll[178] = -(0xFFFFDB5D & 0x26BF) & (0xFFFF9BFF & 0x675F);
        e.lllIIllll[179] = -(0xFFFFED13 & 0x7AED) & (0xFFFFF93B & 0x6FF7);
        e.lllIIllll[180] = 1 ^ (0xF5 ^ 0xB7);
        e.lllIIllll[181] = 0xFFFFA535 & 0x5BFF;
        e.lllIIllll[182] = 0x79 ^ 0x3D;
        e.lllIIllll[183] = -(0xFFFFAA87 & 0x7DF9) & (0xFFFFEDF7 & 0x3BBF);
        e.lllIIllll[184] = 190 + 191 - 242 + 86 ^ 57 + 39 - 73 + 141;
        e.lllIIllll[185] = 0xFFFF97F7 & 0x697F;
        e.lllIIllll[186] = 0x54 ^ 0x12;
        e.lllIIllll[187] = -(0xFFFFFFFF & 0x1286) & (0xFFFFDBFF & 0x37FF);
        e.lllIIllll[188] = -(0xFFFFFD37 & 0x1FEF) & (0xFFFFFF77 & 0x1FAF);
        e.lllIIllll[189] = 0x30 ^ 0x77 ^ (0x6D ^ 0x62);
        e.lllIIllll[190] = 0xFFFFC56F & 0x3BBF;
        e.lllIIllll[191] = 0x72 ^ 0x3B;
        e.lllIIllll[192] = 0xFFFF993B & 0x67FC;
        e.lllIIllll[193] = 0x4F ^ 5;
        e.lllIIllll[194] = 0xFFFFBD3B & 0x43FD;
        e.lllIIllll[195] = 0x19 ^ 0x52;
        e.lllIIllll[196] = 0xFFFFD17F & 0x2FBD;
        e.lllIIllll[197] = 0xA5 ^ 0xB9 ^ (0x60 ^ 0x30);
        e.lllIIllll[198] = 0xFFFFA3D7 & 0x5D7B;
        e.lllIIllll[199] = 0xF7 ^ 0xBA;
        e.lllIIllll[200] = -(0xFFFFB62B & 0x4BFD) & (0xFFFFBBFD & 0x477E);
        e.lllIIllll[201] = 0xD9 ^ 0x97;
        e.lllIIllll[202] = -(0xFFFFF65F & 0x1DA1) & (0xFFFFD5DF & 0x3F77);
        e.lllIIllll[203] = 0x99 ^ 0x90 ^ (0x85 ^ 0xC3);
        e.lllIIllll[204] = -(0xFFFFAEFF & 0x7305) & (0xFFFFA37F & 0x7FDF);
        e.lllIIllll[205] = 4 ^ 0x16 ^ (0x22 ^ 0x60);
        e.lllIIllll[206] = 0xFFFFC95D & 0x37FE;
        e.lllIIllll[207] = 0x25 ^ 0x20 ^ (0x31 ^ 0x65);
        e.lllIIllll[208] = -(0xFFFFF931 & 0x7EEF) & (0xFFFFFD7F & 0x7BFF);
        e.lllIIllll[209] = 0xD0 ^ 0x82;
        e.lllIIllll[210] = 0xFFFFC7F7 & 0x396F;
        e.lllIIllll[211] = 159 + 184 - 185 + 53 ^ 93 + 49 - 114 + 100;
        e.lllIIllll[212] = 0xFFFFDDE8 & 0x237F;
        e.lllIIllll[213] = 0x39 ^ 0x6D;
        e.lllIIllll[214] = -(0xFFFFFE9F & 0x3FF1) & (0xFFFFFFFF & 0x3FFF);
        e.lllIIllll[215] = 8 ^ 0x5D;
        e.lllIIllll[216] = 0xFFFFCB76 & 0x35F9;
        e.lllIIllll[217] = 29 + 108 - 105 + 185 ^ 121 + 97 - 146 + 71;
        e.lllIIllll[218] = 0xFFFFF9E1 & 0x7FF;
        e.lllIIllll[219] = 0x7F ^ 0x28;
        e.lllIIllll[220] = -(0xFFFFDA5B & 0x7DB5) & (0xFFFFF9FA & 0x5FF7);
        e.lllIIllll[221] = 0xDE ^ 0x86;
        e.lllIIllll[222] = 0xFFFFA1F4 & 0x5FEF;
        e.lllIIllll[223] = 0xCB ^ 0xBA ^ (0x76 ^ 0x5E);
        e.lllIIllll[224] = 0xFFFFBFEF & 0x41F5;
        e.lllIIllll[225] = 0xED ^ 0xB7;
        e.lllIIllll[226] = 0xFFFFE9EF & 0x17F6;
        e.lllIIllll[227] = 0x76 ^ 0x2D;
        e.lllIIllll[228] = 0xFFFFCDEF & 0x33F7;
        e.lllIIllll[229] = 0x64 ^ 0x7F ^ (4 ^ 0x43);
        e.lllIIllll[230] = 0xFFFF83EA & 0x7DFD;
        e.lllIIllll[231] = 0x1C ^ 0x3E ^ 1 + 110 - 57 + 73;
        e.lllIIllll[232] = 0xFFFF89F9 & 0x77EF;
        e.lllIIllll[233] = 0xC6 ^ 0x98;
        e.lllIIllll[234] = 0xFFFF9FFA & 0x61FF;
        e.lllIIllll[235] = 0x59 ^ 6;
        e.lllIIllll[236] = -(0xFFFFFCC3 & 0x5B3F) & (0xFFFFDFFE & 0x79FF);
        e.lllIIllll[237] = 4 ^ 0x64;
        e.lllIIllll[238] = -(0xFFFFF6F5 & 0xD0B) & (0xFFFFEDFD & 0x17FF);
        e.lllIIllll[239] = 0x7A ^ 0x1B;
        e.lllIIllll[240] = 0xFFFFCDFF & 0x33FE;
        e.lllIIllll[241] = 4 ^ 0x66;
        e.lllIIllll[242] = 0xFFFFCFFF & 0x31FF;
        e.lllIIllll[243] = 0x3F ^ 0x5C;
        e.lllIIllll[244] = 0xFFFFC69D & 0x3B67;
        e.lllIIllll[245] = -(0xFFFFD3DF & 0x6D62) & (0xFFFFCFD7 & 0x736F);
        e.lllIIllll[246] = 0xFFFFD3E7 & 0x2E1F;
        e.lllIIllll[247] = -(0xFFFFAECE & 0x79B7) & (0xFFFFAAFF & 0x7F8D);
        e.lllIIllll[248] = 0xFF ^ 0x99 ^ 1;
        e.lllIIllll[249] = 0xFFFFDB5B & 0x26AD;
        e.lllIIllll[250] = 0xA6 ^ 0x8E ^ (0x3E ^ 0x7E);
        e.lllIIllll[251] = -(0xFFFFB15B & 0x6FE5) & (0xFFFFFB7B & 0x27CF);
        e.lllIIllll[252] = 52 + 153 - 163 + 126 ^ 141 + 161 - 238 + 129;
        e.lllIIllll[253] = -(0xFFFFF976 & 0x2FDD) & (0xFFFFFF7F & 0x2BDF);
        e.lllIIllll[254] = 0xC8 ^ 0xA2;
        e.lllIIllll[255] = 0xFFFFA2CF & 0x5F3D;
        e.lllIIllll[256] = 0xFFFFACDE & 0x5FA9;
        e.lllIIllll[257] = -(0xFFFFBA89 & 0x7777) & (0xFFFFFED3 & 0x3FBF);
        e.lllIIllll[258] = -(0xFFFFD317 & 0x3CFB) & (0xFFFF9FDF & 0x7BBF);
        e.lllIIllll[259] = 0xFFFFFF96 & 0xD6D;
    }

    public static long a(long l2) {
        return e.u() - l2;
    }

    public static void x() {
        if (e.llIIIlIIllII(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks((int)lllIIllll[10]);
            0;
        }
        if (e.llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.llIIIlIIlIlI(Bank.isOpen() ? 1 : 0)) {
            e.D();
        }
    }

    private static boolean llIIIlIlIIlI(Object object) {
        return object == null;
    }

    public static void I() {
        if (e.llIIIlIIlIlI(Widgets.get((int)lllIIllll[80]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get((int)lllIIllll[80], (int)lllIIllll[24]);
            Mouse.click((int)widget.getClickPoint().getX(), (int)widget.getClickPoint().getY(), (boolean)lllIIllll[1]);
            Time.sleepTicks((int)lllIIllll[5]);
            0;
        }
    }

    public static int J() {
        return e.j(lllIIllll[81]);
    }

    public static String b(long l2) {
        Object[] objectArray = new Object[lllIIllll[1]];
        objectArray[e.lllIIllll[2]] = lllIIllll[9];
        String string = String.format(lllIIlllI[lllIIllll[19]], objectArray);
        Object[] objectArray2 = new Object[lllIIllll[1]];
        objectArray2[e.lllIIllll[2]] = (l2 /= 1000L) % 60L;
        String string2 = String.format(string, objectArray2);
        Object[] objectArray3 = new Object[lllIIllll[1]];
        objectArray3[e.lllIIllll[2]] = l2 % 3600L / 60L;
        String string3 = String.format(string, objectArray3);
        Object[] objectArray4 = new Object[lllIIllll[1]];
        objectArray4[e.lllIIllll[2]] = l2 / 3600L;
        String string4 = String.format(string, objectArray4);
        String string5 = string4 + ":" + string3 + ":" + string2;
        return string5;
    }

    private static boolean llIIIlIIlIII(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIlIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    public static void a(String lllIlIIIIIlII, String lllIlIIIIIIll) {
        try {
            URL lllIlIIIIIIlI = new URL(lllIlIIIIIlII);
            HttpURLConnection lllIlIIIIIIIl = (HttpURLConnection)lllIlIIIIIIlI.openConnection();
            lllIlIIIIIIIl.setRequestMethod(lllIIlllI[lllIIllll[67]]);
            lllIlIIIIIIIl.setRequestProperty(lllIIlllI[lllIIllll[68]], lllIIlllI[lllIIllll[69]]);
            lllIlIIIIIIIl.setDoOutput(lllIIllll[1]);
            String lllIlIIIIIIII = "{\"content\": \"" + lllIlIIIIIIll + "\"}";
            DataOutputStream lllIIllllllll = new DataOutputStream(lllIlIIIIIIIl.getOutputStream());
            lllIIllllllll.writeBytes(lllIlIIIIIIII);
            lllIIllllllll.flush();
            lllIIllllllll.close();
            int lllIIlllllllI = lllIlIIIIIIIl.getResponseCode();
            System.out.println("Response Code: " + lllIIlllllllI);
            lllIlIIIIIIIl.disconnect();
            0;
        }
        catch (Exception lllIlIIIIIIlI) {
            lllIlIIIIIIlI.printStackTrace();
        }
        if (((0x12 ^ 6) & ~(0xBF ^ 0xAB)) > 1) {
            return;
        }
    }

    public static int v() {
        int n2 = e.c(lllIIllll[2], ag.length - lllIIllll[1]);
        return ag[n2];
    }

    public static void G() {
        block9: {
            int lllIIlllIIIll = lllIIllll[2];
            do {
                String[] stringArray = new String[lllIIllll[1]];
                stringArray[e.lllIIllll[2]] = lllIIlllI[lllIIllll[73]];
                if (!e.llIIIlIIlIll(TileObjects.getNearest((String[])stringArray)) || !e.llIIIlIIlIlI(AccBuilderGWD.d ? 1 : 0)) break block9;
                AccBuilderGWD.c = lllIIlllI[lllIIllll[74]];
                String[] stringArray2 = new String[lllIIllll[1]];
                stringArray2[e.lllIIllll[2]] = lllIIlllI[lllIIllll[75]];
                NPC lllIIlllIIIlI = NPCs.getNearest((String[])stringArray2);
                if (e.llIIIlIIlIlI(lllIIlllIIIll)) {
                    if (e.llIIIlIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                        lllIIlllIIIlI.interact(lllIIlllI[lllIIllll[76]]);
                    }
                    if (e.llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                        List lllIIlllIIIIl;
                        if (e.llIIIlIIlIlI(Dialog.canContinueNPC() ? 1 : 0) && e.llIIIlIIlIlI(Dialog.canContinue() ? 1 : 0) && e.llIIIlIIlIlI((lllIIlllIIIIl = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                            List lllIIlllIIIII = lllIIlllIIIIl.stream().filter(widget -> {
                                boolean bl;
                                if (e.llIIIlIIlIlI(widget.getText().contains(lllIIlllI[lllIIllll[82]]) ? 1 : 0)) {
                                    bl = lllIIllll[1];
                                    0;
                                    if (1 < 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lllIIllll[2];
                                }
                                return bl;
                            }).collect(Collectors.toList());
                            if (e.llIIIlIIlIlI(lllIIlllIIIII.isEmpty() ? 1 : 0)) {
                                Mouse.click((int)((Widget)lllIIlllIIIII.get(lllIIllll[2])).getClickPoint().getX(), (int)((Widget)lllIIlllIIIII.get(lllIIllll[2])).getClickPoint().getY(), (boolean)lllIIllll[1]);
                                Time.sleepTicks((int)lllIIllll[5]);
                                0;
                            }
                            if (e.llIIIlIIlllI(lllIIlllIIIII.size(), lllIIllll[1])) {
                                lllIIlllIIIll = lllIIllll[1];
                            }
                        }
                        if (!e.llIIIlIIlIlI(Dialog.canContinueNPC() ? 1 : 0) || e.llIIIlIIllII(Dialog.canContinue() ? 1 : 0)) {
                            Dialog.continueSpace();
                        }
                    }
                }
                if (e.llIIIlIIllII(lllIIlllIIIll)) {
                    String[] stringArray3 = new String[lllIIllll[1]];
                    stringArray3[e.lllIIllll[2]] = lllIIlllI[lllIIllll[77]];
                    TileObjects.getNearest((String[])stringArray3).interact(lllIIlllI[lllIIllll[78]]);
                    Time.sleepTicks((int)lllIIllll[11]);
                    0;
                }
                Time.sleepTicks((int)lllIIllll[1]);
                0;
                0;
            } while (null == null);
            return;
        }
    }

    private static boolean llIIIlIIllIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIlIIllll(int n2) {
        return n2 < 0;
    }

    public static int j(int n2) {
        return (Integer)GameThread.invokeLater(() -> Static.getClient().getVarpValue(n2));
    }

    public static long u() {
        return W + (System.nanoTime() - X) / 1000000L;
    }

    public static void c(String string) {
        FileWriter fileWriter = new FileWriter(lllIIlllI[lllIIllll[20]]);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(string + System.getProperty(lllIIlllI[lllIIllll[21]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static void E() {
        if (e.llIIIlIIlIlI(e.j(lllIIllll[71]))) {
            Widget lllIIlllIlIlI;
            if (e.llIIIlIIlIlI(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)lllIIllll[1]);
                0;
            }
            if (e.llIIIlIIllII(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.llIIIlIIlIll(lllIIlllIlIlI = Widgets.get((int)lllIIllll[72], (int)lllIIllll[48]))) {
                lllIIlllIlIlI.interact(lllIIlllI[lllIIllll[29]]);
                Time.sleepTicks((int)lllIIllll[1]);
                0;
            }
        }
    }

    public static boolean H() {
        int n2;
        if (!e.llIIIlIIlIlI(U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.llIIIlIIlIlI(V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.llIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(ah), lllIIllll[79]) || e.llIIIlIIllII(ai.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = lllIIllll[1];
            0;
            if (2 < 0) {
                return false;
            }
        } else {
            n2 = lllIIllll[2];
        }
        return n2 != 0;
    }

    private static boolean llIIIlIIllII(int n2) {
        return n2 != 0;
    }

    public static void F() {
        if (e.llIIIlIIlllI(e.j(lllIIllll[71]), lllIIllll[1])) {
            Widget lllIIlllIlIII;
            if (e.llIIIlIIlIlI(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)lllIIllll[1]);
                0;
            }
            if (e.llIIIlIIllII(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.llIIIlIIlIll(lllIIlllIlIII = Widgets.get((int)lllIIllll[72], (int)lllIIllll[48]))) {
                lllIIlllIlIII.interact(lllIIlllI[lllIIllll[39]]);
                Time.sleepTicks((int)lllIIllll[1]);
                0;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(HashMap<Integer, Integer> hashMap, boolean bl, boolean bl2) {
        if (e.llIIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(af), lllIIllll[10])) {
            int n2;
            AccBuilderGWD.c = lllIIlllI[lllIIllll[25]];
            WorldArea worldArea = new WorldArea(lllIIllll[26], lllIIllll[27], lllIIllll[28], lllIIllll[29], lllIIllll[2]);
            int[] nArray = new int[lllIIllll[1]];
            nArray[e.lllIIllll[2]] = lllIIllll[30];
            int n3 = Inventory.contains((int[])nArray);
            if (e.llIIIlIIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                n2 = lllIIllll[1];
                0;
                if (-1 >= 0) {
                    return;
                }
            } else {
                n2 = lllIIllll[2];
            }
            if (e.llIIIlIIllII(n3 & n2)) {
                int[] nArray2 = new int[lllIIllll[1]];
                nArray2[e.lllIIllll[2]] = lllIIllll[30];
                Inventory.getFirst((int[])nArray2).interact(lllIIlllI[lllIIllll[31]]);
                Time.sleepTicks((int)lllIIllll[14]);
                0;
            }
            Movement.walkTo((WorldPoint)af);
            0;
            Time.sleepTicks((int)lllIIllll[1]);
            0;
        }
        if (e.llIIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(af), lllIIllll[10])) {
            HashMap<Integer, Integer> lllIlIIlIIlII;
            void lllIlIIlIIIlI;
            void lllIlIIlIIIll;
            if (e.llIIIlIIlIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
            }
            AccBuilderGWD.c = lllIIlllI[lllIIllll[32]];
            if (e.llIIIlIIllII((int)lllIlIIlIIIll) && e.llIIIlIIlIII(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks((int)lllIIllll[10]);
                0;
            }
            if (e.llIIIlIIllII((int)lllIlIIlIIIlI) && e.llIIIlIIlIII(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks((int)lllIIllll[9]);
                0;
            }
            Iterator<Map.Entry<Integer, Integer>> lllIlIIlIIIIl = lllIlIIlIIlII.entrySet().iterator();
            while (e.llIIIlIIllII(lllIlIIlIIIIl.hasNext() ? 1 : 0)) {
                Map.Entry<Integer, Integer> lllIlIIlIIIII = lllIlIIlIIIIl.next();
                int lllIlIIIlllll = lllIlIIlIIIII.getKey();
                int lllIlIIIllllI = lllIlIIlIIIII.getValue();
                System.out.println("Key: " + lllIlIIIlllll + ", Value: " + lllIlIIIllllI);
                a.a(lllIlIIIlllll, lllIlIIIllllI);
                Time.sleepTicks((int)lllIIllll[1]);
                0;
                0;
                if (-2 <= 0) continue;
                return;
            }
        }
    }

    public static boolean z() {
        boolean bl;
        if (!e.llIIIlIIllII((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lllIIllll[36]))) || e.llIIIlIIlIlI((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(lllIIllll[38])))) {
            bl = lllIIllll[1];
            0;
            if (-1 > 0) {
                return false;
            }
        } else {
            bl = lllIIllll[2];
        }
        return bl;
    }

    public static void A() {
        Widget lllIlIIIllIlI;
        if (e.llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.llIIIlIIllII(e.z() ? 1 : 0)) {
            if (e.llIIIlIIlIlI(e.B() ? 1 : 0)) {
                e.C();
            }
            if (e.llIIIlIIllII(e.B() ? 1 : 0)) {
                Widget lllIlIIIllIII;
                Widget lllIlIIIllIIl;
                lllIlIIIllIlI = Widgets.get((int)lllIIllll[33], (int)lllIIllll[34], (int)lllIIllll[13]);
                if (e.llIIIlIIlIll(lllIlIIIllIlI)) {
                    lllIlIIIllIlI.interact(lllIIlllI[lllIIllll[35]]);
                    Time.sleepTicks((int)lllIIllll[1]);
                    0;
                }
                if (e.llIIIlIIlIlI(Vars.getBit((int)lllIIllll[36])) && e.llIIIlIIlIll(lllIlIIIllIIl = Widgets.get((int)lllIIllll[33], (int)lllIIllll[32], (int)lllIIllll[29]))) {
                    if (e.llIIIlIIlIlI(lllIlIIIllIIl.isVisible() ? 1 : 0)) {
                        lllIlIIIllIII = Widgets.get((int)lllIIllll[33], (int)lllIIllll[35], (int)lllIIllll[11]);
                        Mouse.click((int)lllIlIIIllIII.getClickPoint().getX(), (int)lllIlIIIllIII.getClickPoint().getY(), (boolean)lllIIllll[1]);
                        Time.sleepTicks((int)lllIIllll[1]);
                        0;
                    }
                    if (e.llIIIlIIllII(lllIlIIIllIIl.isVisible() ? 1 : 0)) {
                        lllIlIIIllIIl.interact(lllIIlllI[lllIIllll[37]]);
                        Time.sleepTicks((int)lllIIllll[1]);
                        0;
                    }
                }
                if (e.llIIIlIIlIlI(Vars.getBit((int)lllIIllll[38])) && e.llIIIlIIlIll(lllIlIIIllIIl = Widgets.get((int)lllIIllll[33], (int)lllIIllll[32], (int)lllIIllll[39]))) {
                    if (e.llIIIlIIlIlI(lllIlIIIllIIl.isVisible() ? 1 : 0)) {
                        lllIlIIIllIII = Widgets.get((int)lllIIllll[33], (int)lllIIllll[35], (int)lllIIllll[11]);
                        Mouse.click((int)lllIlIIIllIII.getClickPoint().getX(), (int)lllIlIIIllIII.getClickPoint().getY(), (boolean)lllIIllll[1]);
                        Time.sleepTicks((int)lllIIllll[1]);
                        0;
                    }
                    if (e.llIIIlIIllII(lllIlIIIllIIl.isVisible() ? 1 : 0)) {
                        lllIlIIIllIIl.interact(lllIIlllI[lllIIllll[40]]);
                        Time.sleepTicks((int)lllIIllll[9]);
                        0;
                    }
                }
            }
        }
        if (e.llIIIlIIlIll(lllIlIIIllIlI = Widgets.get((int)lllIIllll[33], (int)lllIIllll[10]))) {
            lllIlIIIllIlI.interact(lllIIlllI[lllIIllll[34]]);
            Time.sleepTicks((int)lllIIllll[1]);
            0;
        }
    }

    public static double w() {
        double d2 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS);
        double d3 = Skills.getLevel((Skill)Skill.HITPOINTS);
        return d2 / d3 * 100.0;
    }

    static {
        e.llIIIlIIIlll();
        e.llIIIlIIIllI();
        ac = lllIIllll[102];
        Z = lllIIllll[103];
        S = lllIIlllI[lllIIllll[104]];
        ab = lllIIllll[105];
        ad = lllIIllll[6];
        aa = lllIIllll[8];
        T = ThreadLocalRandom.current();
        U = new WorldArea(lllIIllll[106], lllIIllll[107], lllIIllll[79], lllIIllll[82], lllIIllll[2]);
        V = new WorldArea(lllIIllll[108], lllIIllll[109], lllIIllll[34], lllIIllll[48], lllIIllll[1]);
        W = System.currentTimeMillis();
        X = System.nanoTime();
        Y = new HashMap<Integer, Integer>();
        int[] nArray = new int[lllIIllll[11]];
        nArray[e.lllIIllll[2]] = lllIIllll[103];
        nArray[e.lllIIllll[1]] = lllIIllll[8];
        nArray[e.lllIIllll[9]] = lllIIllll[105];
        nArray[e.lllIIllll[5]] = lllIIllll[102];
        nArray[e.lllIIllll[10]] = lllIIllll[6];
        ae = nArray;
        af = new WorldPoint(lllIIllll[110], lllIIllll[111], lllIIllll[2]);
        int[] nArray2 = new int[lllIIllll[112]];
        nArray2[e.lllIIllll[2]] = lllIIllll[113];
        nArray2[e.lllIIllll[1]] = lllIIllll[114];
        nArray2[e.lllIIllll[9]] = lllIIllll[115];
        nArray2[e.lllIIllll[5]] = lllIIllll[116];
        nArray2[e.lllIIllll[10]] = lllIIllll[117];
        nArray2[e.lllIIllll[11]] = lllIIllll[118];
        nArray2[e.lllIIllll[12]] = lllIIllll[119];
        nArray2[e.lllIIllll[13]] = lllIIllll[120];
        nArray2[e.lllIIllll[14]] = lllIIllll[121];
        nArray2[e.lllIIllll[15]] = lllIIllll[122];
        nArray2[e.lllIIllll[16]] = lllIIllll[123];
        nArray2[e.lllIIllll[17]] = lllIIllll[124];
        nArray2[e.lllIIllll[18]] = lllIIllll[125];
        nArray2[e.lllIIllll[19]] = lllIIllll[126];
        nArray2[e.lllIIllll[20]] = lllIIllll[127];
        nArray2[e.lllIIllll[21]] = lllIIllll[128];
        nArray2[e.lllIIllll[24]] = lllIIllll[129];
        nArray2[e.lllIIllll[25]] = lllIIllll[130];
        nArray2[e.lllIIllll[31]] = lllIIllll[131];
        nArray2[e.lllIIllll[32]] = lllIIllll[132];
        nArray2[e.lllIIllll[35]] = lllIIllll[133];
        nArray2[e.lllIIllll[37]] = lllIIllll[134];
        nArray2[e.lllIIllll[40]] = lllIIllll[135];
        nArray2[e.lllIIllll[34]] = lllIIllll[136];
        nArray2[e.lllIIllll[43]] = lllIIllll[137];
        nArray2[e.lllIIllll[44]] = lllIIllll[138];
        nArray2[e.lllIIllll[45]] = lllIIllll[139];
        nArray2[e.lllIIllll[46]] = lllIIllll[140];
        nArray2[e.lllIIllll[47]] = lllIIllll[141];
        nArray2[e.lllIIllll[23]] = lllIIllll[142];
        nArray2[e.lllIIllll[48]] = lllIIllll[143];
        nArray2[e.lllIIllll[50]] = lllIIllll[144];
        nArray2[e.lllIIllll[42]] = lllIIllll[145];
        nArray2[e.lllIIllll[62]] = lllIIllll[146];
        nArray2[e.lllIIllll[63]] = lllIIllll[147];
        nArray2[e.lllIIllll[55]] = lllIIllll[148];
        nArray2[e.lllIIllll[64]] = lllIIllll[149];
        nArray2[e.lllIIllll[67]] = lllIIllll[150];
        nArray2[e.lllIIllll[68]] = lllIIllll[151];
        nArray2[e.lllIIllll[69]] = lllIIllll[152];
        nArray2[e.lllIIllll[29]] = lllIIllll[153];
        nArray2[e.lllIIllll[39]] = lllIIllll[154];
        nArray2[e.lllIIllll[73]] = lllIIllll[155];
        nArray2[e.lllIIllll[74]] = lllIIllll[156];
        nArray2[e.lllIIllll[75]] = lllIIllll[157];
        nArray2[e.lllIIllll[76]] = lllIIllll[158];
        nArray2[e.lllIIllll[77]] = lllIIllll[159];
        nArray2[e.lllIIllll[78]] = lllIIllll[160];
        nArray2[e.lllIIllll[82]] = lllIIllll[161];
        nArray2[e.lllIIllll[84]] = lllIIllll[162];
        nArray2[e.lllIIllll[79]] = lllIIllll[163];
        nArray2[e.lllIIllll[85]] = lllIIllll[164];
        nArray2[e.lllIIllll[86]] = lllIIllll[165];
        nArray2[e.lllIIllll[89]] = lllIIllll[166];
        nArray2[e.lllIIllll[90]] = lllIIllll[167];
        nArray2[e.lllIIllll[91]] = lllIIllll[168];
        nArray2[e.lllIIllll[92]] = lllIIllll[169];
        nArray2[e.lllIIllll[93]] = lllIIllll[170];
        nArray2[e.lllIIllll[94]] = lllIIllll[171];
        nArray2[e.lllIIllll[95]] = lllIIllll[172];
        nArray2[e.lllIIllll[96]] = lllIIllll[173];
        nArray2[e.lllIIllll[28]] = lllIIllll[174];
        nArray2[e.lllIIllll[98]] = lllIIllll[175];
        nArray2[e.lllIIllll[99]] = lllIIllll[176];
        nArray2[e.lllIIllll[100]] = lllIIllll[177];
        nArray2[e.lllIIllll[101]] = lllIIllll[178];
        nArray2[e.lllIIllll[104]] = lllIIllll[179];
        nArray2[e.lllIIllll[180]] = lllIIllll[181];
        nArray2[e.lllIIllll[182]] = lllIIllll[183];
        nArray2[e.lllIIllll[184]] = lllIIllll[185];
        nArray2[e.lllIIllll[186]] = lllIIllll[187];
        nArray2[e.lllIIllll[58]] = lllIIllll[188];
        nArray2[e.lllIIllll[189]] = lllIIllll[190];
        nArray2[e.lllIIllll[191]] = lllIIllll[192];
        nArray2[e.lllIIllll[193]] = lllIIllll[194];
        nArray2[e.lllIIllll[195]] = lllIIllll[196];
        nArray2[e.lllIIllll[197]] = lllIIllll[198];
        nArray2[e.lllIIllll[199]] = lllIIllll[200];
        nArray2[e.lllIIllll[201]] = lllIIllll[202];
        nArray2[e.lllIIllll[203]] = lllIIllll[204];
        nArray2[e.lllIIllll[205]] = lllIIllll[206];
        nArray2[e.lllIIllll[207]] = lllIIllll[208];
        nArray2[e.lllIIllll[209]] = lllIIllll[210];
        nArray2[e.lllIIllll[211]] = lllIIllll[212];
        nArray2[e.lllIIllll[213]] = lllIIllll[214];
        nArray2[e.lllIIllll[215]] = lllIIllll[216];
        nArray2[e.lllIIllll[217]] = lllIIllll[218];
        nArray2[e.lllIIllll[219]] = lllIIllll[220];
        nArray2[e.lllIIllll[221]] = lllIIllll[222];
        nArray2[e.lllIIllll[223]] = lllIIllll[224];
        nArray2[e.lllIIllll[225]] = lllIIllll[226];
        nArray2[e.lllIIllll[227]] = lllIIllll[228];
        nArray2[e.lllIIllll[229]] = lllIIllll[230];
        nArray2[e.lllIIllll[231]] = lllIIllll[232];
        nArray2[e.lllIIllll[233]] = lllIIllll[234];
        nArray2[e.lllIIllll[235]] = lllIIllll[236];
        nArray2[e.lllIIllll[237]] = lllIIllll[238];
        nArray2[e.lllIIllll[239]] = lllIIllll[240];
        nArray2[e.lllIIllll[241]] = lllIIllll[242];
        nArray2[e.lllIIllll[243]] = lllIIllll[244];
        nArray2[e.lllIIllll[97]] = lllIIllll[245];
        nArray2[e.lllIIllll[81]] = lllIIllll[246];
        nArray2[e.lllIIllll[0]] = lllIIllll[247];
        nArray2[e.lllIIllll[248]] = lllIIllll[249];
        nArray2[e.lllIIllll[250]] = lllIIllll[251];
        nArray2[e.lllIIllll[252]] = lllIIllll[253];
        nArray2[e.lllIIllll[254]] = lllIIllll[255];
        ag = nArray2;
        ah = new WorldPoint(lllIIllll[256], lllIIllll[257], lllIIllll[9]);
        ai = new WorldArea(lllIIllll[258], lllIIllll[259], lllIIllll[62], lllIIllll[40], lllIIllll[2]);
    }

    public static void D() {
        World world2 = Worlds.getRandom(world -> {
            int n2;
            if (e.llIIIlIIllII(world.isMembers() ? 1 : 0) && e.llIIIlIlIIIl(world.getPlayerCount(), lllIIllll[83]) && e.llIIIlIIllIl(world.getId(), Worlds.getCurrentId()) && e.llIIIlIIlIlI(world.getActivity().endsWith(lllIIlllI[lllIIllll[84]]) ? 1 : 0) && e.llIIIlIIlIlI(world.getActivity().endsWith(lllIIlllI[lllIIllll[79]]) ? 1 : 0) && e.llIIIlIIlIlI(world.getActivity().startsWith(lllIIlllI[lllIIllll[85]]) ? 1 : 0) && e.llIIIlIIlIlI(world.getActivity().startsWith(lllIIlllI[lllIIllll[86]]) ? 1 : 0) && e.llIIIlIIllIl(world.getId(), lllIIllll[87]) && e.llIIIlIIllIl(world.getId(), lllIIllll[88]) && e.llIIIlIIllIl(world.getId(), lllIIllll[88]) && e.llIIIlIIlIlI(world.getActivity().contains(lllIIlllI[lllIIllll[89]]) ? 1 : 0) && e.llIIIlIIlIlI(world.getActivity().contains(lllIIlllI[lllIIllll[90]]) ? 1 : 0) && e.llIIIlIIlIlI(world.getActivity().contains(lllIIlllI[lllIIllll[91]]) ? 1 : 0) && e.llIIIlIIlIlI(world.getActivity().startsWith(lllIIlllI[lllIIllll[92]]) ? 1 : 0) && e.llIIIlIIlIlI(world.getActivity().endsWith(lllIIlllI[lllIIllll[93]]) ? 1 : 0) && e.llIIIlIIlIlI(world.getActivity().endsWith(lllIIlllI[lllIIllll[94]]) ? 1 : 0) && e.llIIIlIIlIlI(world.getActivity().endsWith(lllIIlllI[lllIIllll[95]]) ? 1 : 0) && e.llIIIlIIlIlI(world.getActivity().startsWith(lllIIlllI[lllIIllll[96]]) ? 1 : 0) && e.llIIIlIlIIII(world.getPlayerCount(), lllIIllll[97])) {
                n2 = lllIIllll[1];
                0;
                
                }
            } else {
                n2 = lllIIllll[2];
            }
            return n2 != 0;
        });
        Worlds.hopTo((World)world2);
    }

    private static String llIIIlIIIlII(String lllIIlIllIIII, String lllIIlIlIllll) {
        lllIIlIllIIII = new String(Base64.getDecoder().decode(lllIIlIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIlIllIIll = new StringBuilder();
        char[] lllIIlIllIIlI = lllIIlIlIllll.toCharArray();
        int lllIIlIllIIIl = lllIIllll[2];
        char[] lllIIlIlIlIll = lllIIlIllIIII.toCharArray();
        int lllIIlIlIlIlI = lllIIlIlIlIll.length;
        int lllIIlIlIlIIl = lllIIllll[2];
        while (e.llIIIlIIlIIl(lllIIlIlIlIIl, lllIIlIlIlIlI)) {
            char lllIIlIllIllI = lllIIlIlIlIll[lllIIlIlIlIIl];
            lllIIlIllIIll.append((char)(lllIIlIllIllI ^ lllIIlIllIIlI[lllIIlIllIIIl % lllIIlIllIIlI.length]));
            0;
            ++lllIIlIllIIIl;
            ++lllIIlIlIlIIl;
            0;
            if ((0xBF ^ 0x81 ^ (0x6D ^ 0x57)) <= (0x6B ^ 0x1C ^ (0x3D ^ 0x4E))) continue;
            return null;
        }
        return String.valueOf(lllIIlIllIIll);
    }

    private static boolean llIIIlIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void k(int n2) {
        if (e.llIIIlIIllIl(Static.getClient().getWorld(), n2)) {
            void lllIlIIlIllll;
            WorldResult worldResult = Static.getWorldService().getWorlds();
            net.runelite.http.api.worlds.World world = worldResult.findWorld(n2);
            if (e.llIIIlIlIIlI(world)) {
                return;
            }
            if (e.llIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            World lllIlIIlIlllI = Static.getClient().createWorld();
            lllIlIIlIlllI.setActivity(lllIlIIlIllll.getActivity());
            lllIlIIlIlllI.setAddress(lllIlIIlIllll.getAddress());
            lllIlIIlIlllI.setId(lllIlIIlIllll.getId());
            lllIlIIlIlllI.setPlayerCount(lllIlIIlIllll.getPlayers());
            lllIlIIlIlllI.setLocation(lllIlIIlIllll.getLocation());
            lllIlIIlIlllI.setTypes(WorldUtil.toWorldTypes((EnumSet)lllIlIIlIllll.getTypes()));
            Worlds.hopTo((World)lllIlIIlIlllI);
        }
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
        int lllIIlllIllll;
        void lllIIllllIIll;
        WorldPoint lllIIllllIlII;
        Client client = Static.getClient();
        Player player = client.getLocalPlayer();
        if (e.llIIIlIlIIlI(player)) {
            return;
        }
        WorldPoint lllIIllllIIIl = lllIIllllIlII;
        int lllIIllllIIII = lllIIllllIIIl.getX() - lllIIllllIIll.getBaseX();
        Point lllIIlllIlllI = Perspective.localToCanvas((Client)lllIIllllIIll, (LocalPoint)LocalPoint.fromScene((int)lllIIllllIIII, (int)(lllIIlllIllll = lllIIllllIIIl.getY() - lllIIllllIIll.getBaseY())), (int)lllIIllllIIll.getPlane());
        if (e.llIIIlIIlIll(lllIIlllIlllI)) {
            n3 = lllIIlllIlllI.getX();
            0;
            
            }
        } else {
            int lllIIlllIllIl;
            n3 = lllIIlllIllIl = lllIIllll[70];
        }
        if (e.llIIIlIIlIll(lllIIlllIlllI)) {
            n2 = lllIIlllIlllI.getY();
            0;
            if (2 < 2) {
                return;
            }
        } else {
            n2 = lllIIllll[70];
        }
        int n4 = n2;
        client.interact(lllIIllll[2], MenuAction.WALK.getId(), (int)var4_4, (int)var5_5, (int)var7_7, n4);
    }

    public static boolean s() {
        boolean bl;
        if (e.llIIIlIIlIII(e.j(lllIIllll[0]))) {
            bl = lllIIllll[1];
            0;
            if (((0xD8 ^ 0x95) & ~(0x33 ^ 0x7E)) >= 3) {
                return false;
            }
        } else {
            bl = lllIIllll[2];
        }
        return bl;
    }

    public static void l(int n2) {
        int[] nArray = new int[lllIIllll[1]];
        nArray[e.lllIIllll[2]] = n2;
        if (e.llIIIlIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllIIllll[1]];
            nArray2[e.lllIIllll[2]] = n2;
            if (e.llIIIlIIlIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int lllIlIIIlIlII;
                int[] nArray3 = new int[lllIIllll[1]];
                nArray3[e.lllIIllll[2]] = n2;
                String[] stringArray = new String[lllIIllll[1]];
                stringArray[e.lllIIllll[2]] = lllIIlllI[lllIIllll[44]];
                if (e.llIIIlIIllII(Inventory.getFirst((int[])nArray3).hasAction(stringArray) ? 1 : 0)) {
                    int[] nArray4 = new int[lllIIllll[1]];
                    nArray4[e.lllIIllll[2]] = n2;
                    Inventory.getFirst((int[])nArray4).interact(lllIIlllI[lllIIllll[45]]);
                }
                int[] nArray5 = new int[lllIIllll[1]];
                nArray5[e.lllIIllll[2]] = lllIlIIIlIlII;
                String[] stringArray2 = new String[lllIIllll[1]];
                stringArray2[e.lllIIllll[2]] = lllIIlllI[lllIIllll[46]];
                if (e.llIIIlIIllII(Inventory.getFirst((int[])nArray5).hasAction(stringArray2) ? 1 : 0)) {
                    int[] nArray6 = new int[lllIIllll[1]];
                    nArray6[e.lllIIllll[2]] = lllIlIIIlIlII;
                    Inventory.getFirst((int[])nArray6).interact(lllIIlllI[lllIIllll[47]]);
                }
                int[] nArray7 = new int[lllIIllll[1]];
                nArray7[e.lllIIllll[2]] = lllIlIIIlIlII;
                String[] stringArray3 = new String[lllIIllll[1]];
                stringArray3[e.lllIIllll[2]] = lllIIlllI[lllIIllll[23]];
                if (e.llIIIlIIllII(Inventory.getFirst((int[])nArray7).hasAction(stringArray3) ? 1 : 0)) {
                    int[] nArray8 = new int[lllIIllll[1]];
                    nArray8[e.lllIIllll[2]] = lllIlIIIlIlII;
                    Inventory.getFirst((int[])nArray8).interact(lllIIlllI[lllIIllll[48]]);
                }
                if (e.llIIIlIIlllI(lllIlIIIlIlII, lllIIllll[49])) {
                    Time.sleepTicks((int)lllIIllll[5]);
                    0;
                    String[] stringArray4 = new String[lllIIllll[1]];
                    stringArray4[e.lllIIllll[2]] = lllIIlllI[lllIIllll[50]];
                    g.a(stringArray4);
                    Time.sleepTicks((int)lllIIllll[1]);
                    0;
                }
            }
        }
    }
}

