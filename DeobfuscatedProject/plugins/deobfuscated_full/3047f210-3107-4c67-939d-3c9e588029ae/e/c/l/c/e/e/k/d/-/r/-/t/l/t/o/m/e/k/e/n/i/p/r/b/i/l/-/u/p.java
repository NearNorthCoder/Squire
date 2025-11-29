/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.Y;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.Z;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.q;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.s;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public class p
implements S {
    static /* synthetic */ int cK;
    static /* synthetic */ boolean cl;
    static /* synthetic */ boolean cL;
    public static /* synthetic */ String cm;
    public static /* synthetic */ WorldPoint cD;
    public static /* synthetic */ WorldPoint cn;
    static /* synthetic */ WorldArea cG;
    public static /* synthetic */ String h;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ WorldPoint cA;
    static /* synthetic */ String[] bQ;
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ WorldPoint cF;
    static /* synthetic */ int cJ;
    static /* synthetic */ WorldArea cH;
    public static /* synthetic */ WorldPoint cC;
    static /* synthetic */ int cI;
    private static /* synthetic */ String[] lllIlIlllI;
    public static /* synthetic */ WorldPoint cE;
    public static /* synthetic */ WorldPoint cz;
    public static /* synthetic */ WorldPoint cB;
    static /* synthetic */ int ck;
    static /* synthetic */ boolean cN;
    public static /* synthetic */ WorldPoint cy;
    static /* synthetic */ boolean cM;
    private static /* synthetic */ int[] lllIllIlll;

    private static boolean llIIlIIlllIIl(Object object) {
        return object == null;
    }

    private static boolean llIIlIIllIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean V() {
        int n2;
        if (p.llIIlIIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[289]) && p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            n2 = lllIllIlll[0];
            0;
            if (2 <= 1) {
                return false;
            }
        } else {
            n2 = lllIllIlll[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void aK() {
        void var22;
        BankLocation bankLocation = BankLocation.getNearest();
        if (p.llIIlIIllIIll(bankLocation) && p.llIIlIIllIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[299]];
            a.a(bankLocation);
        }
        if (p.llIIlIIllIIll(var22) && p.llIIlIIlIllll(var22.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIlll[12]);
                0;
            }
            if (p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[300]];
                if (p.llIIlIIllIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllIllIlll[8]);
                    0;
                }
                a.a(lllIllIlll[51], lllIllIlll[0]);
                a.a(lllIllIlll[53], lllIllIlll[0]);
                a.a(lllIllIlll[55], lllIllIlll[0]);
                a.a(lllIllIlll[41], lllIllIlll[0]);
                a.a(lllIllIlll[46], lllIllIlll[0]);
                a.a(lllIllIlll[49], lllIllIlll[0]);
                a.a(lllIllIlll[47], lllIllIlll[0]);
                a.a(lllIllIlll[18], lllIllIlll[7]);
                a.a(lllIllIlll[44], lllIllIlll[0]);
                a.a(lllIllIlll[34], lllIllIlll[9]);
                a.a(lllIllIlll[33], lllIllIlll[9]);
                a.a(lllIllIlll[10], lllIllIlll[9]);
                a.b(f.aM, lllIllIlll[0]);
                int[] nArray = new int[lllIllIlll[0]];
                nArray[p.lllIllIlll[1]] = lllIllIlll[18];
                if (p.llIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    a.a(lllIllIlll[301], lllIllIlll[4]);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void aM() {
        void var16;
        BankLocation bankLocation = BankLocation.getNearest();
        if (p.llIIlIIllIIll(bankLocation) && p.llIIlIIllIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[305]];
            if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[23])) {
                int[] nArray = new int[lllIllIlll[0]];
                nArray[p.lllIllIlll[1]] = lllIllIlll[10];
                Inventory.getFirst((int[])nArray).interact(lllIlIlllI[lllIllIlll[306]]);
                Time.sleepTicks((int)lllIllIlll[9]);
                0;
            }
            a.a((BankLocation)var16);
        }
        if (p.llIIlIIllIIll(var16) && p.llIIlIIlIllll(var16.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIlll[12]);
                0;
                int[] nArray = new int[lllIllIlll[0]];
                nArray[p.lllIllIlll[1]] = lllIllIlll[168];
                if (p.llIIlIIllIIll(TileObjects.getNearest((int[])nArray)) && p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cB), lllIllIlll[15])) {
                    int[] nArray2 = new int[lllIllIlll[0]];
                    nArray2[p.lllIllIlll[1]] = lllIllIlll[168];
                    TileObjects.getNearest((int[])nArray2).interact(lllIlIlllI[lllIllIlll[307]]);
                    Time.sleepTicks((int)lllIllIlll[4]);
                    0;
                }
            }
            if (p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[308]];
                if (p.llIIlIIllIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllIllIlll[8]);
                    0;
                }
                a.a(lllIllIlll[25], lllIllIlll[26]);
                a.a(lllIllIlll[30], lllIllIlll[11]);
                a.a(lllIllIlll[41], lllIllIlll[0]);
                a.a(lllIllIlll[39], lllIllIlll[0]);
                a.a(lllIllIlll[18], lllIllIlll[0]);
                a.a(lllIllIlll[20], lllIllIlll[0]);
                a.a(lllIllIlll[34], lllIllIlll[9]);
                a.a(lllIllIlll[33], lllIllIlll[9]);
                a.a(lllIllIlll[10], lllIllIlll[9]);
                Bank.withdraw((String)lllIlIlllI[lllIllIlll[178]], (int)lllIllIlll[0], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                a.a(lllIllIlll[17], lllIllIlll[7]);
                int[] nArray = new int[lllIllIlll[0]];
                nArray[p.lllIllIlll[1]] = lllIllIlll[18];
                if (p.llIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    a.a(lllIllIlll[301], lllIllIlll[0]);
                }
                int[] nArray3 = new int[lllIllIlll[0]];
                nArray3[p.lllIllIlll[1]] = lllIllIlll[19];
                if (p.llIIlIIllIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    a.a(lllIllIlll[19], lllIllIlll[0]);
                }
            }
        }
    }

    private static boolean llIIlIIllIIIl(int n2) {
        return n2 == 0;
    }

    static {
        p.llIIlIIlIlllI();
        p.llIIlIIIllllI();
        bu = new ArrayList<d>();
        cn = new WorldPoint(lllIllIlll[350], lllIllIlll[351], lllIllIlll[1]);
        cy = new WorldPoint(lllIllIlll[352], lllIllIlll[353], lllIllIlll[1]);
        cz = new WorldPoint(lllIllIlll[354], lllIllIlll[355], lllIllIlll[1]);
        cA = new WorldPoint(lllIllIlll[356], lllIllIlll[357], lllIllIlll[1]);
        cB = new WorldPoint(lllIllIlll[358], lllIllIlll[152], lllIllIlll[1]);
        cC = new WorldPoint(lllIllIlll[359], lllIllIlll[360], lllIllIlll[1]);
        cD = new WorldPoint(lllIllIlll[361], lllIllIlll[362], lllIllIlll[1]);
        cE = new WorldPoint(lllIllIlll[350], lllIllIlll[363], lllIllIlll[1]);
        cF = new WorldPoint(lllIllIlll[364], lllIllIlll[365], lllIllIlll[1]);
        cG = new WorldArea(lllIllIlll[366], lllIllIlll[367], lllIllIlll[57], lllIllIlll[59], lllIllIlll[1]);
        cH = new WorldArea(lllIllIlll[368], lllIllIlll[369], lllIllIlll[110], lllIllIlll[67], lllIllIlll[1]);
        String[] stringArray = new String[lllIllIlll[43]];
        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[370]];
        stringArray[p.lllIllIlll[0]] = lllIlIlllI[lllIllIlll[371]];
        stringArray[p.lllIllIlll[4]] = lllIlIlllI[lllIllIlll[372]];
        stringArray[p.lllIllIlll[7]] = lllIlIlllI[lllIllIlll[373]];
        stringArray[p.lllIllIlll[8]] = lllIlIlllI[lllIllIlll[194]];
        stringArray[p.lllIllIlll[9]] = lllIlIlllI[lllIllIlll[374]];
        stringArray[p.lllIllIlll[11]] = lllIlIlllI[lllIllIlll[375]];
        stringArray[p.lllIllIlll[13]] = lllIlIlllI[lllIllIlll[376]];
        stringArray[p.lllIllIlll[35]] = lllIlIlllI[lllIllIlll[377]];
        stringArray[p.lllIllIlll[37]] = lllIlIlllI[lllIllIlll[378]];
        stringArray[p.lllIllIlll[15]] = lllIlIlllI[lllIllIlll[379]];
        stringArray[p.lllIllIlll[42]] = lllIlIlllI[lllIllIlll[380]];
        stringArray[p.lllIllIlll[31]] = lllIlIlllI[lllIllIlll[381]];
        bQ = stringArray;
        cI = lllIllIlll[1];
        cm = lllIlIlllI[lllIllIlll[382]];
        h = "In Aid of the Myreque " + cm;
    }

    private static String llIIIlllIlIIl(String var2, String var3) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lllIllIlll[35]), "DES");
            Cipher var25 = Cipher.getInstance("DES");
            var25.init(lllIllIlll[4], var9);
            return new String(var25.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIllIIll(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aP() {
        int n2;
        int[] nArray = new int[lllIllIlll[0]];
        nArray[p.lllIllIlll[1]] = lllIllIlll[25];
        if (p.llIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllIllIlll[0]];
            nArray2[p.lllIllIlll[1]] = lllIllIlll[40];
            if (p.llIIlIIlIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lllIllIlll[0]];
                nArray3[p.lllIllIlll[1]] = lllIllIlll[32];
                if (p.llIIlIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lllIllIlll[0]];
                    nArray4[p.lllIllIlll[1]] = lllIllIlll[30];
                    if (p.llIIlIIlIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lllIllIlll[0]];
                        nArray5[p.lllIllIlll[1]] = lllIllIlll[39];
                        if (p.llIIlIIlIllll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lllIllIlll[0]];
                            nArray6[p.lllIllIlll[1]] = lllIllIlll[41];
                            if (p.llIIlIIlIllll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                int[] nArray7 = new int[lllIllIlll[0]];
                                nArray7[p.lllIllIlll[1]] = lllIllIlll[34];
                                if (p.llIIlIIlIllll(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                    int[] nArray8 = new int[lllIllIlll[0]];
                                    nArray8[p.lllIllIlll[1]] = lllIllIlll[10];
                                    if (p.llIIlIIlIllll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                        int[] nArray9 = new int[lllIllIlll[0]];
                                        nArray9[p.lllIllIlll[1]] = lllIllIlll[18];
                                        if (p.llIIlIIlIllll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                            n2 = lllIllIlll[0];
                                            0;
                                            if (null == null) return n2 != 0;
                                            return ((124 + 5 - 3 + 22 ^ 127 + 154 - 225 + 126) & (0x8E ^ 0x83 ^ (0x2A ^ 5) ^ -1)) != 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lllIllIlll[1];
        return n2 != 0;
    }

    private static String llIIIlllIlIII(String var23, String var10) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var17 = var10.toCharArray();
        int var18 = lllIllIlll[1];
        char[] var19 = var23.toCharArray();
        int var1 = var19.length;
        int var4 = lllIllIlll[1];
        while (p.llIIlIIllIIII(var4, var1)) {
            char var8 = var19[var4];
            var6.append((char)(var8 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var4;
            0;
            if ((105 + 33 - 82 + 124 ^ 54 + 55 - -32 + 35) >= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean llIIlIIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIlllIIlll(String var13, String var12) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lllIllIlll[4], var20);
            return new String(var11.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return lllIllIlll[1];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aO() {
        int n2;
        int[] nArray = new int[lllIllIlll[0]];
        nArray[p.lllIllIlll[1]] = lllIllIlll[36];
        if (p.llIIlIIlIllll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllIllIlll[0]];
            nArray2[p.lllIllIlll[1]] = lllIllIlll[19];
            if (p.llIIlIIlIllll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                n2 = lllIllIlll[0];
                0;
                if (-1 != ((0xF7 ^ 0xAC) & ~(0xD3 ^ 0x88))) return n2 != 0;
                return false;
            }
        }
        n2 = lllIllIlll[1];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aI() {
        int n2;
        String[] stringArray = new String[lllIllIlll[0]];
        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[291]];
        if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lllIllIlll[0]];
            stringArray2[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[292]];
            if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lllIllIlll[0]];
                stringArray3[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[293]];
                if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lllIllIlll[0]];
                    stringArray4[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[294]];
                    if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        n2 = lllIllIlll[0];
                        0;
                        if (3 > 0) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lllIllIlll[1];
        return n2 != 0;
    }

    @Override
    public int T() {
        try {
            p.aF();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= (0x67 ^ 4 ^ (0x53 ^ 0x34))) {
            return (0xE8 ^ 0xA7 ^ (0x7A ^ 0x65)) & (0xD ^ 0x43 ^ (0x5D ^ 0x43) ^ -1);
        }
        return lllIllIlll[89];
    }

    private static void llIIlIIlIlllI() {
        lllIllIlll = new int[384];
        p.lllIllIlll[0] = 1;
        p.lllIllIlll[1] = (0x21 ^ 1 ^ (0xD7 ^ 0x97)) & (0x15 ^ 0x54 ^ (0x5E ^ 0x7F) ^ -1);
        p.lllIllIlll[2] = 0x73 ^ 0x6A;
        p.lllIllIlll[3] = 0xBB ^ 0xB4;
        p.lllIllIlll[4] = 2;
        p.lllIllIlll[5] = -(0xFFFFFFF9 & 0x2E6F) & (0xFFFFAFEB & Short.MAX_VALUE);
        p.lllIllIlll[6] = 118 + 89 - 57 + 65 ^ 103 + 153 - 159 + 88;
        p.lllIllIlll[7] = 3;
        p.lllIllIlll[8] = 0x61 ^ 0x49 ^ (0x4C ^ 0x60);
        p.lllIllIlll[9] = 0xBB ^ 0xBE;
        p.lllIllIlll[10] = 0xFFFF9F47 & Short.MAX_VALUE;
        p.lllIllIlll[11] = 84 + 11 - 5 + 56 ^ 104 + 23 - 26 + 47;
        p.lllIllIlll[12] = 0xFFFFB3A9 & 0x5FDE;
        p.lllIllIlll[13] = 0xD9 ^ 0xBA ^ (0xA3 ^ 0xC7);
        p.lllIllIlll[14] = -(0xFFFFFE37 & 0x33DD) & (0xFFFFBB77 & 0x77FD);
        p.lllIllIlll[15] = 0xC8 ^ 0xBF ^ (0xE ^ 0x73);
        p.lllIllIlll[16] = 0xFFFFDDB3 & 0x2F6F;
        p.lllIllIlll[17] = 0xFFFFA9F3 & 0x5F8E;
        p.lllIllIlll[18] = -(0xFFFF8FDF & 0x7AAF) & (0xFFFFBFFF & 0x7BDF);
        p.lllIllIlll[19] = 0xFFFFD2B4 & 0x7FDF;
        p.lllIllIlll[20] = -(0xFFFFB97D & 0x7E83) & (0xFFFFFFDF & 0x3FB5);
        p.lllIllIlll[21] = -(0xFFFFAE9B & 0x7D7F) & (0xFFFFAFFF & 0x7DDF);
        p.lllIllIlll[22] = 0xFFFFB797 & 0x49E9;
        p.lllIllIlll[23] = 3 ^ 0x38 ^ (0x40 ^ 0x6F);
        p.lllIllIlll[24] = 0xFFFFB35D & 0x4DEB;
        p.lllIllIlll[25] = -(0xFFFFF85F & 0x7FA1) & (0xFFFFFF47 & 0x7EBB);
        p.lllIllIlll[26] = 0x91 ^ 0xA3;
        p.lllIllIlll[27] = 0xFFFF99B7 & 0x6F79;
        p.lllIllIlll[28] = 0xFFFF976F & 0x6DD7;
        p.lllIllIlll[29] = 0xFFFFC2CF & 0x3F7E;
        p.lllIllIlll[30] = 0xFFFFFBCA & 0x7F5;
        p.lllIllIlll[31] = 0x23 ^ 0x57 ^ (0xCF ^ 0xB7);
        p.lllIllIlll[32] = 0xFFFF97DF & 0x6FA5;
        p.lllIllIlll[33] = 0xFFFFEEE3 & 0x5DBF;
        p.lllIllIlll[34] = 0xFFFFDDEF & 0x6EBD;
        p.lllIllIlll[35] = 75 + 46 - 59 + 128 ^ 84 + 145 - 190 + 143;
        p.lllIllIlll[36] = -(0xFFFFFBEF & 0x5C9B) & (0xFFFFDDFF & 0x7FBF);
        p.lllIllIlll[37] = 0xD7 ^ 0x98 ^ (0xDB ^ 0x9D);
        p.lllIllIlll[38] = 0x53 ^ 0x56 ^ (0x5F ^ 0x46);
        p.lllIllIlll[39] = 0xFFFFDFFB & 0x23BC;
        p.lllIllIlll[40] = 0xFFFFCDFB & 0x36F5;
        p.lllIllIlll[41] = -(0xFFFFB6C7 & 0x7BFD) & (0xFFFFFBEF & 0x3FFF);
        p.lllIllIlll[42] = 0xD ^ 6;
        p.lllIllIlll[43] = 0xB2 ^ 0xBF;
        p.lllIllIlll[44] = -(0xFFFFA8B9 & 0x774F) & (0xFFFFF6F9 & 0x2FEF);
        p.lllIllIlll[45] = 2 ^ (0x63 ^ 0x6F);
        p.lllIllIlll[46] = -(0xFFFFDC6D & 0x7FD3) & (0xFFFFFFFF & 0x5FFA);
        p.lllIllIlll[47] = 0xFFFFBDB3 & 0x4B7F;
        p.lllIllIlll[48] = 0x44 ^ 0x54;
        p.lllIllIlll[49] = -(0xFFFFF8CB & 0x17B5) & (0xFFFFFBF7 & 0x1DBF);
        p.lllIllIlll[50] = 3 ^ (0xE ^ 0x1C);
        p.lllIllIlll[51] = -(0xFFFFF8BF & 0x7FF9) & (0xFFFFFEFF & Short.MAX_VALUE);
        p.lllIllIlll[52] = 90 + 143 - 231 + 159 ^ 144 + 136 - 228 + 127;
        p.lllIllIlll[53] = -(0xFFFFAF6F & 0x7D99) & (0xFFFFEFBF & 0x3F7C);
        p.lllIllIlll[54] = 0xDA ^ 0xA9 ^ (0xC1 ^ 0xA1);
        p.lllIllIlll[55] = -(0xFFFFFFC7 & 0x5CBD) & (0xFFFFFEFF & 0x5FAF);
        p.lllIllIlll[56] = 0xFFFFC57D & 0x3EF7;
        p.lllIllIlll[57] = 0x20 ^ 0x7D ^ (0x50 ^ 0x18);
        p.lllIllIlll[58] = -(0xFFFF93E7 & 0x7DBF) & (0xFFFFD7FF & 0x3DF7);
        p.lllIllIlll[59] = 0x30 ^ 0x26;
        p.lllIllIlll[60] = 146 + 104 - 176 + 80 ^ 60 + 34 - 87 + 134;
        p.lllIllIlll[61] = 0xFFFFB4AD & 0x4F7F;
        p.lllIllIlll[62] = 0xBD ^ 0xA5;
        p.lllIllIlll[63] = 0xFFFFDFD9 & 0x2BB7;
        p.lllIllIlll[64] = 0xAC ^ 0xA2 ^ (0xA8 ^ 0xBC);
        p.lllIllIlll[65] = 0xC ^ 7 ^ (0xA5 ^ 0xB5);
        p.lllIllIlll[66] = 0x7A ^ 0x25 ^ (0xF9 ^ 0xBB);
        p.lllIllIlll[67] = 0x3A ^ 0x13 ^ (0x49 ^ 0x4C);
        p.lllIllIlll[68] = -(0xFFFFF03C & 0x7FDF) & (0xFFFFFDFF & 0x7FBF);
        p.lllIllIlll[69] = -(0xFFFFDBD7 & 0x6D3E) & (0xFFFFFF7D & 0x6FF7);
        p.lllIllIlll[70] = -1;
        p.lllIllIlll[71] = 0x87 ^ 0xB9 ^ (0x2E ^ 0xE);
        p.lllIllIlll[72] = 0x67 ^ 0x24 ^ (0xAE ^ 0xC5);
        p.lllIllIlll[73] = 0x4A ^ 0x55;
        p.lllIllIlll[74] = 0xE5 ^ 0xC5;
        p.lllIllIlll[75] = 0x32 ^ 0xE;
        p.lllIllIlll[76] = 0xAA ^ 0x8B;
        p.lllIllIlll[77] = -(0xFFFFFF5B & 0x42B5) & (0xFFFFDFBF & 0x6FF3);
        p.lllIllIlll[78] = 0xFFFFCCF5 & 0x3FAA;
        p.lllIllIlll[79] = 0xC0 ^ 0x86;
        p.lllIllIlll[80] = 101 + 103 - 155 + 110 ^ 46 + 22 - -21 + 100;
        p.lllIllIlll[81] = -(0xFFFFB9DD & 0x4E3F) & (0xFFFFFFFF & 0x39DE);
        p.lllIllIlll[82] = 0x7E ^ 0x2E;
        p.lllIllIlll[83] = 144 + 101 - 166 + 77 ^ 164 + 79 - 149 + 104;
        p.lllIllIlll[84] = 1 ^ (0x13 ^ 0x31);
        p.lllIllIlll[85] = 150 + 134 - 184 + 71 ^ 121 + 28 - 133 + 127;
        p.lllIllIlll[86] = 1 + 75 - -78 + 2 ^ 65 + 84 - 38 + 74;
        p.lllIllIlll[87] = 22 + 51 - -99 + 4 ^ 6 + 40 - -38 + 66;
        p.lllIllIlll[88] = 0xFD ^ 0xA6 ^ (0xCB ^ 0xB7);
        p.lllIllIlll[89] = 0x6A ^ 0xE;
        p.lllIllIlll[90] = 0x85 ^ 0xC1 ^ (0x14 ^ 0x79);
        p.lllIllIlll[91] = 0x30 ^ 0x1A;
        p.lllIllIlll[92] = 120 + 128 - 146 + 55 ^ 169 + 140 - 199 + 72;
        p.lllIllIlll[93] = 0xE4 ^ 0x90 ^ (0x2D ^ 0x74);
        p.lllIllIlll[94] = 0xEE ^ 0xC0;
        p.lllIllIlll[95] = 0x3B ^ 0x14;
        p.lllIllIlll[96] = 0x5C ^ 0x6C;
        p.lllIllIlll[97] = 0x7A ^ 0x4B;
        p.lllIllIlll[98] = 0xFFFFB6EF & 0x7B1C;
        p.lllIllIlll[99] = 0x3D ^ 0xE;
        p.lllIllIlll[100] = 0x48 ^ 1 ^ (0x77 ^ 0xA);
        p.lllIllIlll[101] = 0x7E ^ 0x4B;
        p.lllIllIlll[102] = 0x9D ^ 0xAB;
        p.lllIllIlll[103] = 0x13 ^ 0x24;
        p.lllIllIlll[104] = 0x36 ^ 0xE;
        p.lllIllIlll[105] = 0x10 ^ 0x1C ^ (0x6E ^ 0x5B);
        p.lllIllIlll[106] = 0xFFFFB31F & 0x7EF2;
        p.lllIllIlll[107] = 0xFFFFBF8F & 0x727D;
        p.lllIllIlll[108] = -(0xFFFFFDFA & 0x4397) & (0xFFFFF3BF & 0x7FDF);
        p.lllIllIlll[109] = -(0xFFFF9D9F & 0x6EF1) & (0xFFFFBEDF & 0x7FBF);
        p.lllIllIlll[110] = (0x6D ^ 0x7A) & ~(0x1C ^ 0xB) ^ (0xFE ^ 0xC4);
        p.lllIllIlll[111] = 0x16 ^ 0x4E ^ (0x33 ^ 0x50);
        p.lllIllIlll[112] = 0x47 ^ 0x7A;
        p.lllIllIlll[113] = 0x24 ^ 0x11 ^ (1 ^ 0xA);
        p.lllIllIlll[114] = 0x3F ^ 0;
        p.lllIllIlll[115] = -(0xFFFFFAA5 & 0x357B) & (0xFFFFFFBF & 0x3DFF);
        p.lllIllIlll[116] = 0xFFFFDDDB & 0x2EBE;
        p.lllIllIlll[117] = 3 ^ 0x77 ^ (0x35 ^ 1);
        p.lllIllIlll[118] = 0x32 ^ 0x73;
        p.lllIllIlll[119] = 6 + 41 - 23 + 198 ^ 113 + 35 - 137 + 145;
        p.lllIllIlll[120] = 0xC9 ^ 0xBE ^ (0x4A ^ 0x7E);
        p.lllIllIlll[121] = 0x2D ^ 0x69;
        p.lllIllIlll[122] = 0xEB ^ 0xAE;
        p.lllIllIlll[123] = 0x47 ^ 0;
        p.lllIllIlll[124] = 0x64 ^ 0x2C;
        p.lllIllIlll[125] = 0x52 ^ 0x1B;
        p.lllIllIlll[126] = 0x72 ^ 0x38;
        p.lllIllIlll[127] = 84 + 32 - 24 + 35 + (0x64 ^ 0x6E) - (0x1D ^ 0x59) + (0x5C ^ 0x1B);
        p.lllIllIlll[128] = 0x71 ^ 0x3A;
        p.lllIllIlll[129] = 0x1B ^ 0x6A ^ (0x2B ^ 0x16);
        p.lllIllIlll[130] = 0x6C ^ 0xB ^ (0x65 ^ 0x4F);
        p.lllIllIlll[131] = 0xF3 ^ 0xBD;
        p.lllIllIlll[132] = 0xC9 ^ 0x87 ^ 1;
        p.lllIllIlll[133] = 100 + 63 - 112 + 99;
        p.lllIllIlll[134] = 0x45 ^ 0x14;
        p.lllIllIlll[135] = 0xC3 ^ 0x91;
        p.lllIllIlll[136] = 0xCE ^ 0xC7 ^ (0x72 ^ 0x28);
        p.lllIllIlll[137] = 0x55 ^ 1;
        p.lllIllIlll[138] = 14 + 41 - -50 + 107 ^ 64 + 103 - 70 + 32;
        p.lllIllIlll[139] = 0x22 ^ 0x74;
        p.lllIllIlll[140] = (0x21 ^ 0x1A) + (0x54 ^ 0x44) - -(0 ^ 0x39) + (0x63 ^ 0x7F);
        p.lllIllIlll[141] = 0x28 ^ 0xE ^ (0x11 ^ 0x60);
        p.lllIllIlll[142] = 0xF7 ^ 0xAF;
        p.lllIllIlll[143] = 0x4C ^ 0x15;
        p.lllIllIlll[144] = 150 + 11 - 121 + 125;
        p.lllIllIlll[145] = 0xFFFFCFDA & 0x37EF;
        p.lllIllIlll[146] = 0xFFFF93FE & 0x6FAB;
        p.lllIllIlll[147] = 206 + 179 - 193 + 56 ^ 36 + 72 - 96 + 151;
        p.lllIllIlll[148] = 0xFC ^ 0xA0;
        p.lllIllIlll[149] = 3 ^ 0x65 ^ (0x8E ^ 0xB5);
        p.lllIllIlll[150] = 12 + 76 - 60 + 105 + 3 - -(0x9A ^ 0x85) + 3;
        p.lllIllIlll[151] = 0xFFFFEFB7 & 0x1DEF;
        p.lllIllIlll[152] = 0xFFFF8DBB & 0x7ECF;
        p.lllIllIlll[153] = 0x5D ^ 3;
        p.lllIllIlll[154] = 7 + 70 - 25 + 107 ^ 74 + 16 - 11 + 113;
        p.lllIllIlll[155] = 17 + 183 - 88 + 108 ^ 131 + 61 - 21 + 17;
        p.lllIllIlll[156] = 90 + 21 - 84 + 153;
        p.lllIllIlll[157] = 0xC5 ^ 0xA4;
        p.lllIllIlll[158] = 0xDB ^ 0xB9;
        p.lllIllIlll[159] = 0x2B ^ 0x3F ^ (0xFC ^ 0x8B);
        p.lllIllIlll[160] = (0x82 ^ 0x99) + (27 + 157 - 16 + 11) - (76 + 144 - 212 + 141) + (15 + 84 - 31 + 65);
        p.lllIllIlll[161] = 0x38 ^ 0x10 ^ (0x20 ^ 0x6D);
        p.lllIllIlll[162] = 52 + 41 - -71 + 36;
        p.lllIllIlll[163] = 0x27 ^ 0x41;
        p.lllIllIlll[164] = 0xFF ^ 0x98;
        p.lllIllIlll[165] = 0x3D ^ 0x55;
        p.lllIllIlll[166] = 204 + 115 - 295 + 181;
        p.lllIllIlll[167] = 0x83 ^ 0x93 ^ (0x27 ^ 0x5E);
        p.lllIllIlll[168] = -(0xFFFFB691 & 0x4B6F) & (0xFFFFFFDF & 0x33F7);
        p.lllIllIlll[169] = 0xAD ^ 0xC7;
        p.lllIllIlll[170] = 0x41 ^ 0x1C ^ (0x7F ^ 0x49);
        p.lllIllIlll[171] = 0x74 ^ 9 ^ (0x75 ^ 0x64);
        p.lllIllIlll[172] = 0xC2 ^ 0xAF;
        p.lllIllIlll[173] = 154 + 30 - 51 + 77;
        p.lllIllIlll[174] = 0x41 ^ 0x44 ^ (0xCC ^ 0xA6);
        p.lllIllIlll[175] = 0xB6 ^ 0xAB ^ (0x5A ^ 0x37);
        p.lllIllIlll[176] = 0xF1 ^ 0x80;
        p.lllIllIlll[177] = (0x9E ^ 0x82) + (138 + 92 - 111 + 46) - (115 + 97 - 63 + 15) + (177 + 97 - 231 + 148);
        p.lllIllIlll[178] = 56 + 77 - 72 + 79 + (0x12 ^ 0x77) - (0x2E ^ 0x50) + (0x23 ^ 0x50);
        p.lllIllIlll[179] = 213 + 173 - 357 + 206 ^ 99 + 13 - 65 + 106;
        p.lllIllIlll[180] = 0x1A ^ 0x58 ^ (0x62 ^ 0x53);
        p.lllIllIlll[181] = 0x38 ^ 0x4C;
        p.lllIllIlll[182] = 0x3A ^ 0x4F;
        p.lllIllIlll[183] = 0xD5 ^ 0x8B ^ (0x1C ^ 0x34);
        p.lllIllIlll[184] = 217 + 188 - 276 + 111;
        p.lllIllIlll[185] = (0xF3 ^ 0x81) + (139 + 26 - -15 + 12) - (107 + 28 - 40 + 61) + (4 ^ 0x60);
        p.lllIllIlll[186] = 0x5D ^ 0x2A;
        p.lllIllIlll[187] = 3 ^ (0x3F ^ 0x44);
        p.lllIllIlll[188] = 202 + 153 - 201 + 50 ^ 97 + 21 - 113 + 176;
        p.lllIllIlll[189] = 0xC9 ^ 0xB3;
        p.lllIllIlll[190] = 0x16 ^ 0x2E ^ (0x4C ^ 0xF);
        p.lllIllIlll[191] = 62 + 56 - 45 + 131 ^ 126 + 118 - 221 + 153;
        p.lllIllIlll[192] = 0x4A ^ 0x21 ^ (0xD7 ^ 0xC1);
        p.lllIllIlll[193] = 0x6D ^ 0x3B ^ (0xBF ^ 0x97);
        p.lllIllIlll[194] = 0xFFFF9B86 & 0x657D;
        p.lllIllIlll[195] = 39 + 108 - 135 + 115;
        p.lllIllIlll[196] = (0x48 ^ 0x1E) + (0x38 ^ 0x1B) - ((0x36 ^ 0x32) & ~(0xAD ^ 0xA9)) + (0x2D ^ 0x2A);
        p.lllIllIlll[197] = 0xFFFFADDB & 0x533C;
        p.lllIllIlll[198] = ((0x7A ^ 0x5A) & ~(0x62 ^ 0x42)) + (0x61 ^ 0x2E) - (0x30 ^ 0xF) + (0xF7 ^ 0x86);
        p.lllIllIlll[199] = (0xF1 ^ 0x95) + (0x7F ^ 0x43) - (0x23 ^ 0x51) + (0x95 ^ 0xC1);
        p.lllIllIlll[200] = (0x40 ^ 0x24) + (0x6E ^ 0x2D) - (89 + 96 - 107 + 85) + (79 + 22 - 39 + 65);
        p.lllIllIlll[201] = 26 + 73 - 4 + 37;
        p.lllIllIlll[202] = (0xB1 ^ 0xA3) + (0x82 ^ 0xC2) - (0x16 ^ 0x36) + (0xE1 ^ 0xB2);
        p.lllIllIlll[203] = (0x7C ^ 0x14) + (0xA0 ^ 0xAA) - (0x3D ^ 0x1A) + (0xBB ^ 0x80);
        p.lllIllIlll[204] = 93 + 128 - 211 + 125;
        p.lllIllIlll[205] = 133 + 1 - 33 + 35;
        p.lllIllIlll[206] = (0x58 ^ 0x6E) + (0x9A ^ 0xBC) - (0x41 ^ 0x55) + (0xD1 ^ 0x90);
        p.lllIllIlll[207] = (0x1A ^ 0x4B) + (0x7D ^ 0x4F) - (0x71 ^ 0x2A) + (0x5D ^ 0x3F);
        p.lllIllIlll[208] = 57 + 99 - 58 + 41;
        p.lllIllIlll[209] = 0xFFFFB967 & 0x47BA;
        p.lllIllIlll[210] = 99 + 123 - 149 + 68;
        p.lllIllIlll[211] = 45 + 127 - 71 + 41;
        p.lllIllIlll[212] = -(0xFFFFEF67 & 0x709F) & (0xFFFFFBBF & 0x6FFE);
        p.lllIllIlll[213] = (0x20 ^ 0x2A) + (0x69 ^ 0x39) - -(0x9A ^ 0xA9) + 2;
        p.lllIllIlll[214] = 0xFFFF83BD & 0x7D6E;
        p.lllIllIlll[215] = 134 + 25 - 151 + 136;
        p.lllIllIlll[216] = (0xD ^ 0x19) + 1 - -(0xBE ^ 0x82) + (0xF0 ^ 0xB0);
        p.lllIllIlll[217] = (0xBB ^ 0xB7) + (0x3D ^ 0x24) - -(0xB4 ^ 0x8D) + (0x36 ^ 2);
        p.lllIllIlll[218] = 104 + 43 - 78 + 78;
        p.lllIllIlll[219] = 87 + 88 - 172 + 145;
        p.lllIllIlll[220] = (0x35 ^ 0x6F) + (0xA8 ^ 0x8C) - (0xEE ^ 0xA8) + (0xC1 ^ 0x9C);
        p.lllIllIlll[221] = (0x4A ^ 0x1C) + (0x23 ^ 0x68) - (0x32 ^ 0x20) + (0x57 ^ 0x5F);
        p.lllIllIlll[222] = 110 + 144 - 213 + 111;
        p.lllIllIlll[223] = 2 + (0x3C ^ 0x5A) - (0x1C ^ 0x2F) + (0x74 ^ 0x10);
        p.lllIllIlll[224] = 0xFFFFFFB6 & 0x17F;
        p.lllIllIlll[225] = 121 + 93 - 157 + 97;
        p.lllIllIlll[226] = 78 + 148 - 139 + 68;
        p.lllIllIlll[227] = (0x19 ^ 0x5C) + (0x5C ^ 0x50) - (0x52 ^ 0x5D) + (0x5D ^ 7);
        p.lllIllIlll[228] = (1 ^ 0x11) + (0x74 ^ 0x4C) - (0x9E ^ 0xA8) + (39 + 0 - -2 + 98);
        p.lllIllIlll[229] = (0x66 ^ 0x45) + (81 + 31 - 9 + 36) - (0xD1 ^ 0xC5) + (0xA3 ^ 0xA7);
        p.lllIllIlll[230] = 128 + 71 - 71 + 31;
        p.lllIllIlll[231] = 128 + 76 - 165 + 122;
        p.lllIllIlll[232] = 48 + 84 - 27 + 57;
        p.lllIllIlll[233] = 0xFFFFEBFB & 0x153F;
        p.lllIllIlll[234] = 0xFFFF9956 & 0x67FD;
        p.lllIllIlll[235] = (0xCB ^ 0x86) + (0x65 ^ 0x1E) - (0xEF ^ 0x99) + (0x61 ^ 0x30);
        p.lllIllIlll[236] = 76 + 131 - 131 + 88;
        p.lllIllIlll[237] = 59 + 103 - 124 + 89 + (0x48 ^ 0) - (0x93 ^ 0xBA) + (0x4F ^ 0x47);
        p.lllIllIlll[238] = 119 + 100 - 141 + 87 + (23 + 125 - 15 + 2) - (131 + 76 - 97 + 49) + (0x8A ^ 0x90);
        p.lllIllIlll[239] = (0x1D ^ 0x3B) + (33 + 43 - -55 + 35) - (142 + 25 - 14 + 34) + (26 + 107 - 11 + 29);
        p.lllIllIlll[240] = -(0xFFFFE6F2 & 0x7D0F) & (0xFFFFF5FF & 0x6F5F);
        p.lllIllIlll[241] = 130 + 149 - 188 + 59 + (47 + 26 - 52 + 132) - (105 + 67 - 26 + 39) + (0x7B ^ 0x48);
        p.lllIllIlll[242] = (0x51 ^ 0x38) + (77 + 32 - 56 + 100) - (54 + 26 - 77 + 167) + (0x79 ^ 0x2A);
        p.lllIllIlll[243] = (0x52 ^ 0x11) + (85 + 2 - 53 + 96) - (0xE8 ^ 0xC6) + (0xBA ^ 0xAF);
        p.lllIllIlll[244] = 114 + 145 - 163 + 77;
        p.lllIllIlll[245] = 138 + 50 - 160 + 146;
        p.lllIllIlll[246] = 69 + 127 - 153 + 132;
        p.lllIllIlll[247] = (0x33 ^ 0x7F) + (0x93 ^ 0xA7) - (0x6C ^ 5) + (95 + 15 - 36 + 79);
        p.lllIllIlll[248] = 0xFFFFCFFC & 0x316B;
        p.lllIllIlll[249] = -(0xFFFFF605 & 0x4DFB) & (0xFFFFF5DF & Short.MAX_VALUE);
        p.lllIllIlll[250] = (0x67 ^ 0x44) + (0x4D ^ 0x60) - -(2 ^ 0x5E) + (0x4E ^ 0x4B);
        p.lllIllIlll[251] = 0xFFFFFB7F & 0x5F2;
        p.lllIllIlll[252] = 68 + 157 - 53 + 6;
        p.lllIllIlll[253] = 91 + 33 - -37 + 18;
        p.lllIllIlll[254] = -(0xFFFFEF9F & 0x50E9) & (0xFFFFD9FF & 0x67FF);
        p.lllIllIlll[255] = 140 + 177 - 147 + 11;
        p.lllIllIlll[256] = (0x73 ^ 0x3F) + (35 + 18 - -53 + 33) - (60 + 42 - 87 + 123) + (0xFC ^ 0x95);
        p.lllIllIlll[257] = (0x3B ^ 0xD) + (88 + 133 - 209 + 164) - (75 + 108 - 66 + 38) + (0x5A ^ 0x36);
        p.lllIllIlll[258] = 2 + 159 - 131 + 141 + (69 + 160 - 133 + 71) - (165 + 43 - 106 + 138) + (6 ^ 0x50);
        p.lllIllIlll[259] = (0x5E ^ 0x78) + (6 + 110 - -17 + 15) - (176 + 33 - 170 + 141) + (18 + 89 - -28 + 44);
        p.lllIllIlll[260] = 171 + 45 - 210 + 180;
        p.lllIllIlll[261] = 179 + 84 - 125 + 49;
        p.lllIllIlll[262] = 0xFFFFB5FF & 0x4B7C;
        p.lllIllIlll[263] = (0xA2 ^ 0x92) + (0x1B ^ 0x17) - -3 + (0x47 ^ 0x3A);
        p.lllIllIlll[264] = 96 + 7 - 14 + 100;
        p.lllIllIlll[265] = 0xFFFFA1DF & 0x5FA6;
        p.lllIllIlll[266] = 72 + 55 - 48 + 55 + (0x6A ^ 0x31) - (118 + 0 - -38 + 6) + (60 + 35 - 54 + 87);
        p.lllIllIlll[267] = (0x3C ^ 0x18) + (0x17 ^ 0x3B) - (0x19 ^ 0x5A) + (49 + 151 - 140 + 119);
        p.lllIllIlll[268] = (0xDF ^ 0xB7) + (0xD6 ^ 0xAF) - (0xD5 ^ 0xB2) + (0xF5 ^ 0xB2);
        p.lllIllIlll[269] = (4 ^ 0x32) + (0xBA ^ 0x81) - -(0xF8 ^ 0xA8) + 1;
        p.lllIllIlll[270] = (0xF2 ^ 0x87) + (107 + 99 - 140 + 76) - (59 + 33 - 87 + 168) + (0xC6 ^ 0xAB);
        p.lllIllIlll[271] = -(0xFFFFFA7F & 0x7FAF) & (0xFFFFFFFF & 0x7BBE);
        p.lllIllIlll[272] = 184 + 24 - 96 + 84;
        p.lllIllIlll[273] = (0xC8 ^ 0xA3) + (0x39 ^ 0x5E) - (0x7D ^ 0x4A) + (0x16 ^ 0x3C);
        p.lllIllIlll[274] = 0xFFFFBDFD & 0x5FD7;
        p.lllIllIlll[275] = -(0xFFFFFCE3 & 0x7B5D) & (0xFFFFFDDA & 0x7BFF);
        p.lllIllIlll[276] = 10 + 70 - -52 + 31 + (0x62 ^ 8) - (0x41 ^ 0x21) + (0x49 ^ 0x50);
        p.lllIllIlll[277] = 121 + 73 - 80 + 85;
        p.lllIllIlll[278] = 7 + 47 - 13 + 125 + (0x77 ^ 0x40) - (51 + 51 - -43 + 13) + (64 + 56 - 113 + 131);
        p.lllIllIlll[279] = 0xFFFFDDF7 & 0x3FDE;
        p.lllIllIlll[280] = -(0xFFFFB6BF & 0x7B63) & (0xFFFFFFFF & 0x3FBF);
        p.lllIllIlll[281] = -(0xFFFFDF97 & 0x687C) & (0xFFFFFFB7 & 0x49FF);
        p.lllIllIlll[282] = 117 + 189 - 229 + 125;
        p.lllIllIlll[283] = (0x3A ^ 0x63) + (55 + 19 - 6 + 61) - (83 + 37 - -6 + 3) + (0x45 ^ 0x37);
        p.lllIllIlll[284] = 128 + 135 - 62 + 3;
        p.lllIllIlll[285] = 77 + 192 - 95 + 32;
        p.lllIllIlll[286] = 127 + 181 - 221 + 120;
        p.lllIllIlll[287] = 33 + 99 - 127 + 188 + (0xEF ^ 0xB8) - (162 + 138 - 223 + 142) + (130 + 111 - 134 + 40);
        p.lllIllIlll[288] = (0x8A ^ 0xAB) + (59 + 45 - 30 + 82) - (2 + 12 - -61 + 96) + (31 + 54 - -37 + 69);
        p.lllIllIlll[289] = 0xFFFFA9EE & 0x57BF;
        p.lllIllIlll[290] = 13 + 151 - 132 + 179;
        p.lllIllIlll[291] = (0x4D ^ 0x57) + (0x64 ^ 0x4B) - (0x8A ^ 0x9C) + (97 + 53 - 57 + 68);
        p.lllIllIlll[292] = 136 + 164 - 177 + 90;
        p.lllIllIlll[293] = (0x20 ^ 0x4B) + (147 + 26 - 106 + 88) - (2 + 142 - 103 + 110) + (9 ^ 0x6E);
        p.lllIllIlll[294] = (0xD7 ^ 0xBB) + (0x1D ^ 0x6E) - (79 + 200 - 151 + 79) + (56 + 134 - 168 + 177);
        p.lllIllIlll[295] = (0x68 ^ 0x49) + (59 + 119 - 56 + 39) - (1 ^ 0x1B) + (0x30 ^ 0);
        p.lllIllIlll[296] = (0xF5 ^ 0xB6) + (1 + 42 - -68 + 32) - (0x37 ^ 5) + (0x1B ^ 0x22);
        p.lllIllIlll[297] = 133 + 69 - 158 + 174;
        p.lllIllIlll[298] = (5 ^ 0xB) + (109 + 10 - 96 + 124) - (34 + 142 - 69 + 43) + (165 + 128 - 255 + 170);
        p.lllIllIlll[299] = (0x96 ^ 0xA9) + (89 + 188 - 232 + 144) - (0xB ^ 0x3B) + (0x54 ^ 0x45);
        p.lllIllIlll[300] = 107 + 60 - -33 + 22;
        p.lllIllIlll[301] = -(0xFFFFCDB3 & 0x7E4D) & (0xFFFFFF5B & 0x7DF7);
        p.lllIllIlll[302] = (0x45 ^ 0x15) + (0x1E ^ 0x6C) - (0x25 ^ 0x31) + (0x46 ^ 0x77);
        p.lllIllIlll[303] = (0x74 ^ 0x3C) + (140 + 110 - 146 + 57) - (34 + 4 - -20 + 104) + (127 + 132 - 241 + 135);
        p.lllIllIlll[304] = 14 + 141 - 149 + 219;
        p.lllIllIlll[305] = (9 ^ 0x51) + (0xB0 ^ 0x9C) - -(0x56 ^ 7) + (0x88 ^ 0x85);
        p.lllIllIlll[306] = (0xBA ^ 0xA8) + (0x1E ^ 0x72) - -(0x96 ^ 0xC6) + (0x6A ^ 0x7F);
        p.lllIllIlll[307] = 178 + 89 - 153 + 114;
        p.lllIllIlll[308] = 222 + 48 - 245 + 204;
        p.lllIllIlll[309] = 160 + 198 - 207 + 80;
        p.lllIllIlll[310] = 23 + 3 - -46 + 160;
        p.lllIllIlll[311] = (0x66 ^ 0x39) + (24 + 123 - 50 + 57) - (0xB9 ^ 0x92) + (0x5E ^ 0x45);
        p.lllIllIlll[312] = (0x3D ^ 0x78) + (0x78 ^ 0x4E) - -(0x87 ^ 0xB4) + (0xA8 ^ 0x94);
        p.lllIllIlll[313] = 140 + 22 - 90 + 138 + (55 + 79 - 4 + 6) - (0xFFFF9952 & 0x67FD) + (53 + 126 - 77 + 123);
        p.lllIllIlll[314] = 152 + 227 - 157 + 14;
        p.lllIllIlll[315] = (0x26 ^ 0x2F) + (0x3B ^ 0x3C) - -(1 + 154 - 139 + 148) + (0xA0 ^ 0x99);
        p.lllIllIlll[316] = 10 + 68 - -126 + 34;
        p.lllIllIlll[317] = 101 + 139 - 161 + 160;
        p.lllIllIlll[318] = (0x5E ^ 0x29) + (0x6E ^ 0x3A) - (0x77 ^ 0x24) + (0xB9 ^ 0xC0);
        p.lllIllIlll[319] = 193 + 216 - 349 + 182;
        p.lllIllIlll[320] = 138 + 104 - 133 + 110 + (0x66 ^ 0x3F) - (97 + 31 - 26 + 137) + (127 + 123 - 94 + 18);
        p.lllIllIlll[321] = 12 + 139 - 62 + 155;
        p.lllIllIlll[322] = 239 + 29 - 258 + 235;
        p.lllIllIlll[323] = 107 + 66 - 43 + 116;
        p.lllIllIlll[324] = 181 + 163 - 282 + 185;
        p.lllIllIlll[325] = (0xDD ^ 0xAF) + (57 + 160 - -9 + 4) - (0xFFFFF9FF & 0x705) + (135 + 71 - 141 + 100);
        p.lllIllIlll[326] = 137 + 234 - 154 + 32;
        p.lllIllIlll[327] = 41 + 33 - 4 + 181;
        p.lllIllIlll[328] = 119 + 18 - 7 + 67 + (173 + 4 - 142 + 145) - (19 + 113 - 118 + 147) + (0x22 ^ 6);
        p.lllIllIlll[329] = 0xFFFFF3E9 & 0xFFE;
        p.lllIllIlll[330] = 0xFFFFAFF8 & 0x732F;
        p.lllIllIlll[331] = -(0xA1 ^ 0x95) & (0xFFFFBFFB & 0x72FF);
        p.lllIllIlll[332] = 0xFFFFFEBF & 0x4B78;
        p.lllIllIlll[333] = 0xFFFFBD5B & 0xDAFC;
        p.lllIllIlll[334] = -(0xFFFFF7F7 & 0x68AF) & (0xFFFFEBFF & 0x76FE);
        p.lllIllIlll[335] = 0xFFFFCFEC & 0x3653;
        p.lllIllIlll[336] = -(0xFFFF9AB7 & 0x756A) & (0xFFFFB5FD & 0x5FFF);
        p.lllIllIlll[337] = -(0xFFFFAC5F & 0x73A7) & (0xFFFFB7FE & 0x6FD7);
        p.lllIllIlll[338] = -(0xFFFFFC6E & 0x6BB7) & (0xFFFFEEFF & 0x7D3F);
        p.lllIllIlll[339] = -(0xFFFFFEA3 & 0x73DD) & (0xFFFFFFBE & 0x77FD);
        p.lllIllIlll[340] = -(0xFFFFCE77 & 0x35EC) & (0xFFFF9CFF & Short.MAX_VALUE);
        p.lllIllIlll[341] = 0xFFFFBEBF & 0x5D60;
        p.lllIllIlll[342] = 0xFFFFB974 & 0x67BF;
        p.lllIllIlll[343] = 0xFFFFF75C & 0x2DBF;
        p.lllIllIlll[344] = -(0xFFFF9276 & 0x7DAB) & (0xFFFFBFED & 0x7EFF);
        p.lllIllIlll[345] = 0xFFFFF5FB & 0x6BAC;
        p.lllIllIlll[346] = 0xFFFF8F96 & 0x73ED;
        p.lllIllIlll[347] = 179 + 117 - 174 + 131;
        p.lllIllIlll[348] = 136 + 100 - 199 + 108 + (0xFC ^ 0x82) - (70 + 111 - 82 + 36) + (0x23 ^ 0x55);
        p.lllIllIlll[349] = 201 + 234 - 342 + 162;
        p.lllIllIlll[350] = -(0xFFFFD37B & 0x7EC5) & (0xFFFFFFFF & 0x5FF6);
        p.lllIllIlll[351] = -(0xFFFFDB95 & 0x657B) & (0xFFFFF77F & 0x6FFE);
        p.lllIllIlll[352] = 0xFFFF8FBE & 0x7DDD;
        p.lllIllIlll[353] = 0xFFFF8EFD & 0x7DAF;
        p.lllIllIlll[354] = -(0xFFFFFE49 & 0x51FF) & (0xFFFFFDFD & 0x5FEF);
        p.lllIllIlll[355] = -(0xFFFFBB1E & 0x77FB) & (0xFFFFFFBB & 0x3FFF);
        p.lllIllIlll[356] = -(0xFFFFD266 & 0x6FDF) & (0xFFFFDFFF & 0x6FFF);
        p.lllIllIlll[357] = 0xFFFFEFAB & 0x1CFD;
        p.lllIllIlll[358] = -(0xFFFFFB6F & 0x7696) & (0xFFFFFFEF & 0x7FBD);
        p.lllIllIlll[359] = -(0xFFFFB5B2 & 0x6A4F) & (0xFFFFEDDF & 0x3FE5);
        p.lllIllIlll[360] = -(0xFFFFE9FD & 0x3713) & (0xFFFFFD9E & 0x2FFB);
        p.lllIllIlll[361] = -(0xFFFFFEF3 & 0x736D) & (0xFFFFFFFF & 0x7FFA);
        p.lllIllIlll[362] = -(0xFFFFA9D7 & 0x5E2B) & (0xFFFFBFEF & 0x6E7A);
        p.lllIllIlll[363] = 0xFFFFEEBF & 0x37C7;
        p.lllIllIlll[364] = 0xFFFFADCB & 0x5EFF;
        p.lllIllIlll[365] = 0xFFFF9F77 & 0x6CFA;
        p.lllIllIlll[366] = 0xFFFFADFC & 0x5FAF;
        p.lllIllIlll[367] = 0xFFFFB663 & 0x6FFF;
        p.lllIllIlll[368] = -(0xFFFFEA7B & 0x75ED) & (0xFFFFEDFF & Short.MAX_VALUE);
        p.lllIllIlll[369] = -(0xFFFFF276 & 0x3FFB) & (0xFFFFFFF5 & 0x3EFB);
        p.lllIllIlll[370] = -(0xFFFFE6EF & 0x3BF5) & (0xFFFFF3EE & 0x2FF5);
        p.lllIllIlll[371] = -(0xFFFFF3EF & 0x7EF7) & (0xFFFFF3F7 & 0x7FEF);
        p.lllIllIlll[372] = -(0xFFFFFFF7 & 0x7A7D) & (0xFFFFFB76 & Short.MAX_VALUE);
        p.lllIllIlll[373] = 0xFFFFB5A7 & 0x4B5B;
        p.lllIllIlll[374] = -(0xFFFFFFDF & 0x5EFB) & (0xFFFFDFFF & 0x7FDF);
        p.lllIllIlll[375] = -(0xFFFFBEF3 & 0x7F2E) & (0xFFFFFF77 & 0x3FAF);
        p.lllIllIlll[376] = 0xFFFFA1E7 & 0x5F1F;
        p.lllIllIlll[377] = 0xFFFF9F1A & 0x61ED;
        p.lllIllIlll[378] = 0xFFFF856F & 0x7B99;
        p.lllIllIlll[379] = -(0xFFFFCAFE & 0x7F77) & (0xFFFFDFFF & 0x6B7F);
        p.lllIllIlll[380] = -(0xFFFFFE7D & 0x59F7) & (0xFFFFF97F & 0x5FFF);
        p.lllIllIlll[381] = 0xFFFFDDFF & 0x230C;
        p.lllIllIlll[382] = 0xFFFFFD1F & 0x3ED;
        p.lllIllIlll[383] = -(0xFFFF99E9 & 0x7EF7) & (0xFFFFD9EF & 0x3FFE);
    }

    public static void aF() {
        block217: {
            block242: {
                block244: {
                    block243: {
                        Object var14;
                        block240: {
                            block241: {
                                block218: {
                                    block237: {
                                        block239: {
                                            block238: {
                                                block236: {
                                                    block220: {
                                                        block235: {
                                                            block234: {
                                                                block233: {
                                                                    block232: {
                                                                        block231: {
                                                                            block230: {
                                                                                block229: {
                                                                                    block228: {
                                                                                        block227: {
                                                                                            block226: {
                                                                                                block225: {
                                                                                                    block224: {
                                                                                                        block223: {
                                                                                                            block222: {
                                                                                                                block221: {
                                                                                                                    block219: {
                                                                                                                        if (p.llIIlIIlIllll(bs ? 1 : 0)) {
                                                                                                                            b.a(bu);
                                                                                                                            if (p.llIIlIIllIIII(bu.size(), lllIllIlll[0])) {
                                                                                                                                System.out.println(lllIlIlllI[lllIllIlll[1]]);
                                                                                                                                bs = lllIllIlll[1];
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (!p.llIIlIIllIIIl(bs ? 1 : 0)) break block217;
                                                                                                                        if (p.llIIlIIllIIII(Skills.getLevel((Skill)Skill.CRAFTING), lllIllIlll[2])) {
                                                                                                                            cm = lllIlIlllI[lllIllIlll[0]];
                                                                                                                            Y.ef();
                                                                                                                        }
                                                                                                                        if (p.llIIlIIllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllIllIlll[2]) && p.llIIlIIllIIII(Skills.getLevel((Skill)Skill.MINING), lllIllIlll[3])) {
                                                                                                                            cm = lllIlIlllI[lllIllIlll[4]];
                                                                                                                            Z.es();
                                                                                                                        }
                                                                                                                        if (p.llIIlIIllIIII(e.j(lllIllIlll[5]), lllIllIlll[6]) && p.llIIlIIllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllIllIlll[2]) && p.llIIlIIllIIlI(Skills.getLevel((Skill)Skill.MINING), lllIllIlll[3])) {
                                                                                                                            cm = lllIlIlllI[lllIllIlll[7]];
                                                                                                                            q.aV();
                                                                                                                        }
                                                                                                                        if (p.llIIlIIlIllll(p.aP() ? 1 : 0) && !p.llIIlIIllIIIl(p.aO() ? 1 : 0) || !p.llIIlIIllIIlI(Skills.getLevel((Skill)Skill.CRAFTING), lllIllIlll[2]) || !p.llIIlIIllIIlI(Skills.getLevel((Skill)Skill.MINING), lllIllIlll[3]) || !p.llIIlIIllIIIl(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId())) || !p.llIIlIIllIIlI(e.j(lllIllIlll[5]), lllIllIlll[6])) break block218;
                                                                                                                        cm = lllIlIlllI[lllIllIlll[8]];
                                                                                                                        var14 = BankLocation.getNearest();
                                                                                                                        if (p.llIIlIIllIIll(var14) && p.llIIlIIllIIIl(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                                            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[9]];
                                                                                                                            if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(q.cn), lllIllIlll[9])) {
                                                                                                                                int[] nArray = new int[lllIllIlll[0]];
                                                                                                                                nArray[p.lllIllIlll[1]] = lllIllIlll[10];
                                                                                                                                if (p.llIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                                    int[] nArray2 = new int[lllIllIlll[0]];
                                                                                                                                    nArray2[p.lllIllIlll[1]] = lllIllIlll[10];
                                                                                                                                    Inventory.getFirst((int[])nArray2).interact(lllIlIlllI[lllIllIlll[11]]);
                                                                                                                                    Time.sleepTicks((int)lllIllIlll[9]);
                                                                                                                                    0;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            a.a((BankLocation)var14);
                                                                                                                        }
                                                                                                                        if (!p.llIIlIIllIIll(var14) || !p.llIIlIIlIllll(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block218;
                                                                                                                        if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                                                                                                                            a.a();
                                                                                                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIlll[12]);
                                                                                                                            0;
                                                                                                                        }
                                                                                                                        if (!p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0)) break block218;
                                                                                                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[13]];
                                                                                                                        if (p.llIIlIIllIlIl(Inventory.getAll().size())) {
                                                                                                                            Bank.depositInventory();
                                                                                                                            Time.sleepTicks((int)lllIllIlll[8]);
                                                                                                                            0;
                                                                                                                        }
                                                                                                                        if (p.llIIlIIllIlIl(Equipment.getAll().size()) && p.llIIlIIllIIII(cI, lllIllIlll[0])) {
                                                                                                                            Bank.depositEquipment();
                                                                                                                            cI += lllIllIlll[0];
                                                                                                                            Time.sleepTicks((int)lllIllIlll[4]);
                                                                                                                            0;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[lllIllIlll[0]];
                                                                                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[14];
                                                                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block219;
                                                                                                                        int[] nArray3 = new int[lllIllIlll[0]];
                                                                                                                        nArray3[p.lllIllIlll[1]] = lllIllIlll[14];
                                                                                                                        if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray3).getQuantity(), lllIllIlll[15])) break block220;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[lllIllIlll[0]];
                                                                                                                    nArray[p.lllIllIlll[1]] = lllIllIlll[16];
                                                                                                                    if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block221;
                                                                                                                    int[] nArray4 = new int[lllIllIlll[0]];
                                                                                                                    nArray4[p.lllIllIlll[1]] = lllIllIlll[16];
                                                                                                                    if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray4).getQuantity(), lllIllIlll[15])) break block220;
                                                                                                                }
                                                                                                                int[] nArray = new int[lllIllIlll[0]];
                                                                                                                nArray[p.lllIllIlll[1]] = lllIllIlll[17];
                                                                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block222;
                                                                                                                int[] nArray5 = new int[lllIllIlll[0]];
                                                                                                                nArray5[p.lllIllIlll[1]] = lllIllIlll[17];
                                                                                                                if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray5).getQuantity(), lllIllIlll[7])) break block220;
                                                                                                            }
                                                                                                            int[] nArray = new int[lllIllIlll[0]];
                                                                                                            nArray[p.lllIllIlll[1]] = lllIllIlll[18];
                                                                                                            if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block223;
                                                                                                            int[] nArray6 = new int[lllIllIlll[0]];
                                                                                                            nArray6[p.lllIllIlll[1]] = lllIllIlll[18];
                                                                                                            if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray6).getQuantity(), lllIllIlll[15])) break block220;
                                                                                                        }
                                                                                                        int[] nArray = new int[lllIllIlll[0]];
                                                                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[19];
                                                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block224;
                                                                                                        int[] nArray7 = new int[lllIllIlll[0]];
                                                                                                        nArray7[p.lllIllIlll[1]] = lllIllIlll[19];
                                                                                                        if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray7).getQuantity(), lllIllIlll[4])) break block220;
                                                                                                    }
                                                                                                    int[] nArray = new int[lllIllIlll[0]];
                                                                                                    nArray[p.lllIllIlll[1]] = lllIllIlll[20];
                                                                                                    if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block225;
                                                                                                    int[] nArray8 = new int[lllIllIlll[0]];
                                                                                                    nArray8[p.lllIllIlll[1]] = lllIllIlll[20];
                                                                                                    if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray8).getQuantity(), lllIllIlll[15])) break block220;
                                                                                                }
                                                                                                int[] nArray = new int[lllIllIlll[0]];
                                                                                                nArray[p.lllIllIlll[1]] = lllIllIlll[21];
                                                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block226;
                                                                                                int[] nArray9 = new int[lllIllIlll[0]];
                                                                                                nArray9[p.lllIllIlll[1]] = lllIllIlll[21];
                                                                                                if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray9).getQuantity(), lllIllIlll[15])) break block220;
                                                                                            }
                                                                                            int[] nArray = new int[lllIllIlll[0]];
                                                                                            nArray[p.lllIllIlll[1]] = lllIllIlll[22];
                                                                                            if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block227;
                                                                                            int[] nArray10 = new int[lllIllIlll[0]];
                                                                                            nArray10[p.lllIllIlll[1]] = lllIllIlll[22];
                                                                                            if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray10).getQuantity(), lllIllIlll[23])) break block220;
                                                                                        }
                                                                                        int[] nArray = new int[lllIllIlll[0]];
                                                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[24];
                                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block228;
                                                                                        int[] nArray11 = new int[lllIllIlll[0]];
                                                                                        nArray11[p.lllIllIlll[1]] = lllIllIlll[24];
                                                                                        if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray11).getQuantity(), lllIllIlll[23])) break block220;
                                                                                    }
                                                                                    int[] nArray = new int[lllIllIlll[0]];
                                                                                    nArray[p.lllIllIlll[1]] = lllIllIlll[25];
                                                                                    if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block229;
                                                                                    int[] nArray12 = new int[lllIllIlll[0]];
                                                                                    nArray12[p.lllIllIlll[1]] = lllIllIlll[25];
                                                                                    if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray12).getQuantity(), lllIllIlll[26])) break block220;
                                                                                }
                                                                                int[] nArray = new int[lllIllIlll[0]];
                                                                                nArray[p.lllIllIlll[1]] = lllIllIlll[27];
                                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block230;
                                                                                int[] nArray13 = new int[lllIllIlll[0]];
                                                                                nArray13[p.lllIllIlll[1]] = lllIllIlll[27];
                                                                                if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray13).getQuantity(), lllIllIlll[9])) break block220;
                                                                            }
                                                                            int[] nArray = new int[lllIllIlll[0]];
                                                                            nArray[p.lllIllIlll[1]] = lllIllIlll[28];
                                                                            if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block231;
                                                                            int[] nArray14 = new int[lllIllIlll[0]];
                                                                            nArray14[p.lllIllIlll[1]] = lllIllIlll[28];
                                                                            if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray14).getQuantity(), lllIllIlll[15])) break block220;
                                                                        }
                                                                        int[] nArray = new int[lllIllIlll[0]];
                                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[29];
                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block232;
                                                                        int[] nArray15 = new int[lllIllIlll[0]];
                                                                        nArray15[p.lllIllIlll[1]] = lllIllIlll[29];
                                                                        if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray15).getQuantity(), lllIllIlll[9])) break block220;
                                                                    }
                                                                    int[] nArray = new int[lllIllIlll[0]];
                                                                    nArray[p.lllIllIlll[1]] = lllIllIlll[30];
                                                                    if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block233;
                                                                    int[] nArray16 = new int[lllIllIlll[0]];
                                                                    nArray16[p.lllIllIlll[1]] = lllIllIlll[30];
                                                                    if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray16).getQuantity(), lllIllIlll[31])) break block220;
                                                                }
                                                                int[] nArray = new int[lllIllIlll[0]];
                                                                nArray[p.lllIllIlll[1]] = lllIllIlll[32];
                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block234;
                                                                int[] nArray17 = new int[lllIllIlll[0]];
                                                                nArray17[p.lllIllIlll[1]] = lllIllIlll[32];
                                                                if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray17).getQuantity(), lllIllIlll[15])) break block220;
                                                            }
                                                            int[] nArray = new int[lllIllIlll[0]];
                                                            nArray[p.lllIllIlll[1]] = lllIllIlll[33];
                                                            if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block235;
                                                            int[] nArray18 = new int[lllIllIlll[0]];
                                                            nArray18[p.lllIllIlll[1]] = lllIllIlll[33];
                                                            if (!p.llIIlIIllIIlI(Bank.getFirst((int[])nArray18).getQuantity(), lllIllIlll[15])) break block220;
                                                        }
                                                        int[] nArray = new int[lllIllIlll[0]];
                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[34];
                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block236;
                                                        int[] nArray19 = new int[lllIllIlll[0]];
                                                        nArray19[p.lllIllIlll[1]] = lllIllIlll[34];
                                                        if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray19).getQuantity(), lllIllIlll[9])) break block236;
                                                    }
                                                    p.ae();
                                                    System.out.println(lllIlIlllI[lllIllIlll[35]]);
                                                    bs = lllIllIlll[0];
                                                    return;
                                                }
                                                int[] nArray = new int[lllIllIlll[0]];
                                                nArray[p.lllIllIlll[1]] = lllIllIlll[36];
                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    int[] nArray20 = new int[lllIllIlll[0]];
                                                    nArray20[p.lllIllIlll[1]] = lllIllIlll[36];
                                                    if (p.llIIlIIllIIIl(Inventory.contains((int[])nArray20) ? 1 : 0)) {
                                                        int[] nArray21 = new int[lllIllIlll[0]];
                                                        nArray21[p.lllIllIlll[1]] = lllIllIlll[36];
                                                        if (p.llIIlIIllIIIl(Equipment.contains((int[])nArray21) ? 1 : 0)) {
                                                            p.ae();
                                                            System.out.println(lllIlIlllI[lllIllIlll[37]]);
                                                            bs = lllIllIlll[0];
                                                            return;
                                                        }
                                                    }
                                                }
                                                int[] nArray22 = new int[lllIllIlll[38]];
                                                nArray22[p.lllIllIlll[1]] = lllIllIlll[39];
                                                nArray22[p.lllIllIlll[0]] = lllIllIlll[32];
                                                nArray22[p.lllIllIlll[4]] = lllIllIlll[40];
                                                nArray22[p.lllIllIlll[7]] = lllIllIlll[41];
                                                nArray22[p.lllIllIlll[8]] = lllIllIlll[30];
                                                nArray22[p.lllIllIlll[9]] = lllIllIlll[25];
                                                nArray22[p.lllIllIlll[11]] = lllIllIlll[20];
                                                nArray22[p.lllIllIlll[13]] = lllIllIlll[14];
                                                nArray22[p.lllIllIlll[35]] = lllIllIlll[16];
                                                nArray22[p.lllIllIlll[37]] = lllIllIlll[28];
                                                nArray22[p.lllIllIlll[15]] = lllIllIlll[29];
                                                nArray22[p.lllIllIlll[42]] = lllIllIlll[27];
                                                nArray22[p.lllIllIlll[31]] = lllIllIlll[21];
                                                nArray22[p.lllIllIlll[43]] = lllIllIlll[44];
                                                nArray22[p.lllIllIlll[45]] = lllIllIlll[46];
                                                nArray22[p.lllIllIlll[3]] = lllIllIlll[47];
                                                nArray22[p.lllIllIlll[48]] = lllIllIlll[49];
                                                nArray22[p.lllIllIlll[50]] = lllIllIlll[51];
                                                nArray22[p.lllIllIlll[52]] = lllIllIlll[53];
                                                nArray22[p.lllIllIlll[54]] = lllIllIlll[55];
                                                nArray22[p.lllIllIlll[23]] = lllIllIlll[56];
                                                nArray22[p.lllIllIlll[57]] = lllIllIlll[58];
                                                nArray22[p.lllIllIlll[59]] = lllIllIlll[22];
                                                nArray22[p.lllIllIlll[60]] = lllIllIlll[61];
                                                nArray22[p.lllIllIlll[62]] = lllIllIlll[63];
                                                nArray22[p.lllIllIlll[2]] = lllIllIlll[24];
                                                nArray22[p.lllIllIlll[64]] = lllIllIlll[17];
                                                nArray22[p.lllIllIlll[65]] = lllIllIlll[19];
                                                if (p.llIIlIIllIIIl(e.b(nArray22) ? 1 : 0)) {
                                                    p.ae();
                                                    System.out.println(lllIlIlllI[lllIllIlll[15]]);
                                                    bs = lllIllIlll[0];
                                                    return;
                                                }
                                                int[] nArray23 = new int[lllIllIlll[66]];
                                                nArray23[p.lllIllIlll[1]] = lllIllIlll[39];
                                                nArray23[p.lllIllIlll[0]] = lllIllIlll[32];
                                                nArray23[p.lllIllIlll[4]] = lllIllIlll[40];
                                                nArray23[p.lllIllIlll[7]] = lllIllIlll[41];
                                                nArray23[p.lllIllIlll[8]] = lllIllIlll[30];
                                                nArray23[p.lllIllIlll[9]] = lllIllIlll[25];
                                                nArray23[p.lllIllIlll[11]] = lllIllIlll[20];
                                                nArray23[p.lllIllIlll[13]] = lllIllIlll[14];
                                                nArray23[p.lllIllIlll[35]] = lllIllIlll[16];
                                                nArray23[p.lllIllIlll[37]] = lllIllIlll[28];
                                                nArray23[p.lllIllIlll[15]] = lllIllIlll[29];
                                                nArray23[p.lllIllIlll[42]] = lllIllIlll[27];
                                                nArray23[p.lllIllIlll[31]] = lllIllIlll[21];
                                                nArray23[p.lllIllIlll[43]] = lllIllIlll[44];
                                                nArray23[p.lllIllIlll[45]] = lllIllIlll[46];
                                                nArray23[p.lllIllIlll[3]] = lllIllIlll[47];
                                                nArray23[p.lllIllIlll[48]] = lllIllIlll[49];
                                                nArray23[p.lllIllIlll[50]] = lllIllIlll[51];
                                                nArray23[p.lllIllIlll[52]] = lllIllIlll[53];
                                                nArray23[p.lllIllIlll[54]] = lllIllIlll[55];
                                                nArray23[p.lllIllIlll[23]] = lllIllIlll[56];
                                                nArray23[p.lllIllIlll[57]] = lllIllIlll[58];
                                                nArray23[p.lllIllIlll[59]] = lllIllIlll[18];
                                                nArray23[p.lllIllIlll[60]] = lllIllIlll[22];
                                                nArray23[p.lllIllIlll[62]] = lllIllIlll[61];
                                                nArray23[p.lllIllIlll[2]] = lllIllIlll[63];
                                                nArray23[p.lllIllIlll[64]] = lllIllIlll[24];
                                                nArray23[p.lllIllIlll[65]] = lllIllIlll[17];
                                                nArray23[p.lllIllIlll[38]] = lllIllIlll[19];
                                                if (!p.llIIlIIlIllll(e.b(nArray23) ? 1 : 0)) break block218;
                                                if (!p.llIIlIIllIIIl(p.aO() ? 1 : 0)) break block237;
                                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[42]];
                                                int[] nArray24 = new int[lllIllIlll[0]];
                                                nArray24[p.lllIllIlll[1]] = lllIllIlll[36];
                                                if (!p.llIIlIIlIllll(Equipment.contains((int[])nArray24) ? 1 : 0)) break block238;
                                                int[] nArray25 = new int[lllIllIlll[0]];
                                                nArray25[p.lllIllIlll[1]] = lllIllIlll[19];
                                                if (!p.llIIlIIllIIIl(Equipment.contains((int[])nArray25) ? 1 : 0)) break block239;
                                            }
                                            int[] nArray = new int[lllIllIlll[0]];
                                            nArray[p.lllIllIlll[1]] = lllIllIlll[36];
                                            if (p.llIIlIIllIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                                int[] nArray26 = new int[lllIllIlll[0]];
                                                nArray26[p.lllIllIlll[1]] = lllIllIlll[36];
                                                if (p.llIIlIIllIIIl(Inventory.contains((int[])nArray26) ? 1 : 0)) {
                                                    a.a(lllIllIlll[36], lllIllIlll[0]);
                                                }
                                            }
                                            int[] nArray27 = new int[lllIllIlll[0]];
                                            nArray27[p.lllIllIlll[1]] = lllIllIlll[19];
                                            if (p.llIIlIIllIIIl(Equipment.contains((int[])nArray27) ? 1 : 0)) {
                                                int[] nArray28 = new int[lllIllIlll[0]];
                                                nArray28[p.lllIllIlll[1]] = lllIllIlll[19];
                                                if (p.llIIlIIllIIIl(Inventory.contains((int[])nArray28) ? 1 : 0)) {
                                                    a.a(lllIllIlll[19], lllIllIlll[0]);
                                                }
                                            }
                                        }
                                        if (p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0)) {
                                            Bank.close();
                                            Time.sleepTicks((int)lllIllIlll[7]);
                                            0;
                                        }
                                        e.l(lllIllIlll[36]);
                                        e.l(lllIllIlll[19]);
                                        Time.sleepTicks((int)lllIllIlll[4]);
                                        0;
                                    }
                                    if (p.llIIlIIlIllll(p.aO() ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[31]];
                                        if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepTicks((int)lllIllIlll[11]);
                                            0;
                                        }
                                        a.a(lllIllIlll[40], lllIllIlll[0]);
                                        a.a(lllIllIlll[10], lllIllIlll[9]);
                                        a.a(lllIllIlll[32], lllIllIlll[9]);
                                        a.a(lllIllIlll[25], lllIllIlll[67]);
                                        a.a(lllIllIlll[30], lllIllIlll[11]);
                                        a.a(lllIllIlll[39], lllIllIlll[0]);
                                        a.a(lllIllIlll[41], lllIllIlll[0]);
                                        a.a(lllIllIlll[34], lllIllIlll[15]);
                                        a.a(lllIllIlll[33], lllIllIlll[15]);
                                        a.a(lllIllIlll[18], lllIllIlll[4]);
                                        a.a(lllIllIlll[22], lllIllIlll[11]);
                                    }
                                }
                                if (p.llIIlIIlIllll(Inventory.contains((int[])f.aU) ? 1 : 0) && p.llIIlIIllIIII(Movement.getRunEnergy(), lllIllIlll[26])) {
                                    Inventory.getFirst((int[])f.aU).interact(lllIlIlllI[lllIllIlll[43]]);
                                    Time.sleepTicks((int)lllIllIlll[0]);
                                    0;
                                }
                                if (p.llIIlIIlIllll(p.aP() ? 1 : 0) && p.llIIlIIlIllll(p.aO() ? 1 : 0) && p.llIIlIIllIIIl(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()))) {
                                    cm = lllIlIlllI[lllIllIlll[45]];
                                    if (p.llIIlIIlIllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIllIlll[68], lllIllIlll[69], lllIllIlll[1])) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[3]];
                                        String[] stringArray = new String[lllIllIlll[0]];
                                        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[48]];
                                        TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[50]]);
                                        Time.sleepTicks((int)lllIllIlll[8]);
                                        0;
                                    }
                                    if (p.llIIlIIllIIIl(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[52]];
                                        if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(b.I), lllIllIlll[23])) {
                                            int[] nArray = new int[lllIllIlll[0]];
                                            nArray[p.lllIllIlll[1]] = lllIllIlll[33];
                                            if (p.llIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0) && p.llIIlIIllIllI(Players.getLocal().getAnimation(), lllIllIlll[70])) {
                                                int[] nArray29 = new int[lllIllIlll[0]];
                                                nArray29[p.lllIllIlll[1]] = lllIllIlll[33];
                                                Inventory.getFirst((int[])nArray29).interact(lllIlIlllI[lllIllIlll[54]]);
                                                Time.sleepTicks((int)lllIllIlll[4]);
                                                0;
                                            }
                                        }
                                        if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(b.I), lllIllIlll[23])) {
                                            if (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                                                Dialog.close();
                                            }
                                            Movement.walkTo((WorldPoint)cn);
                                            0;
                                            Time.sleepTicks((int)lllIllIlll[0]);
                                            0;
                                        }
                                    }
                                    if (p.llIIlIIlIllll(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[23]];
                                        g.a(lllIlIlllI[lllIllIlll[57]], bQ);
                                    }
                                }
                                if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[23])) {
                                    ck = lllIllIlll[1];
                                    if (p.llIIlIIlIllll(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[59]];
                                        int[] nArray = new int[lllIllIlll[0]];
                                        nArray[p.lllIllIlll[1]] = lllIllIlll[34];
                                        if (p.llIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0) && p.llIIlIIllIllI(Players.getLocal().getAnimation(), lllIllIlll[70])) {
                                            int[] nArray30 = new int[lllIllIlll[0]];
                                            nArray30[p.lllIllIlll[1]] = lllIllIlll[34];
                                            Inventory.getFirst((int[])nArray30).interact(lllIlIlllI[lllIllIlll[60]]);
                                            Time.sleepTicks((int)lllIllIlll[4]);
                                            0;
                                        }
                                    }
                                    if (p.llIIlIIllIIIl(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cy), lllIllIlll[4])) {
                                            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[62]];
                                            Movement.walkTo((WorldPoint)cy);
                                            0;
                                            Time.sleepTicks((int)lllIllIlll[0]);
                                            0;
                                        }
                                        if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cy), lllIllIlll[4])) {
                                            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[2]];
                                            g.a(lllIlIlllI[lllIllIlll[64]], bQ);
                                        }
                                    }
                                }
                                if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[71])) {
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[65]];
                                    String[] stringArray = new String[lllIllIlll[0]];
                                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[38]];
                                    String[] stringArray2 = new String[lllIllIlll[0]];
                                    stringArray2[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[66]];
                                    Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray2));
                                    Time.sleepTicks((int)lllIllIlll[7]);
                                    0;
                                }
                                if (!p.llIIlIIlllIII(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[72]) || p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[26])) {
                                    if (!p.llIIlIIlIllll(cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cz), lllIllIlll[9])) {
                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[71]];
                                        Movement.walkTo((WorldPoint)cz);
                                        0;
                                        Time.sleepTicks((int)lllIllIlll[0]);
                                        0;
                                    }
                                    if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cz), lllIllIlll[9])) {
                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[73]];
                                        g.a(lllIlIlllI[lllIllIlll[74]], bQ);
                                    }
                                }
                                if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[75])) {
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[76]];
                                    if (p.llIIlIIllIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIllIlll[77], lllIllIlll[78], lllIllIlll[1])) ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)new WorldPoint(lllIllIlll[77], lllIllIlll[78], lllIllIlll[1]));
                                        0;
                                        Time.sleepTicks((int)lllIllIlll[0]);
                                        0;
                                    }
                                }
                                if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[79])) {
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[80]];
                                    int[] nArray = new int[lllIllIlll[0]];
                                    nArray[p.lllIllIlll[1]] = lllIllIlll[40];
                                    int[] nArray31 = new int[lllIllIlll[0]];
                                    nArray31[p.lllIllIlll[1]] = lllIllIlll[81];
                                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((int[])nArray31));
                                    Time.sleepTicks((int)lllIllIlll[8]);
                                    0;
                                }
                                if (!p.llIIlIIlllIII(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[82]) || p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[83])) {
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[84]];
                                    String[] stringArray = new String[lllIllIlll[0]];
                                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[85]];
                                    TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[86]]);
                                    Time.sleepTicks((int)lllIllIlll[4]);
                                    0;
                                    String[] stringArray3 = new String[lllIllIlll[0]];
                                    stringArray3[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[87]];
                                    TileObjects.getNearest((String[])stringArray3).interact(lllIlIlllI[lllIllIlll[88]]);
                                    Time.sleepTicks((int)lllIllIlll[4]);
                                    0;
                                }
                                if (!p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[89])) break block240;
                                String[] stringArray = new String[lllIllIlll[0]];
                                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[72]];
                                if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (p.llIIlIIlIllll(Inventory.isFull() ? 1 : 0)) {
                                        String[] stringArray4 = new String[lllIllIlll[0]];
                                        stringArray4[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[90]];
                                        Inventory.getFirst((String[])stringArray4).interact(lllIlIlllI[lllIllIlll[91]]);
                                        String[] stringArray5 = new String[lllIllIlll[0]];
                                        stringArray5[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[92]];
                                        Inventory.getFirst((String[])stringArray5).interact(lllIlIlllI[lllIllIlll[67]]);
                                        String[] stringArray6 = new String[lllIllIlll[0]];
                                        stringArray6[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[93]];
                                        Inventory.getFirst((String[])stringArray6).interact(lllIlIlllI[lllIllIlll[94]]);
                                        String[] stringArray7 = new String[lllIllIlll[0]];
                                        stringArray7[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[95]];
                                        Inventory.getFirst((String[])stringArray7).interact(lllIlIlllI[lllIllIlll[96]]);
                                        String[] stringArray8 = new String[lllIllIlll[0]];
                                        stringArray8[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[97]];
                                        Inventory.getFirst((String[])stringArray8).interact(lllIlIlllI[lllIllIlll[26]]);
                                    }
                                    if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cz), lllIllIlll[35])) {
                                        int[] nArray = new int[lllIllIlll[0]];
                                        nArray[p.lllIllIlll[1]] = lllIllIlll[98];
                                        if (p.llIIlIIlllIIl(TileObjects.getNearest((int[])nArray))) {
                                            String[] stringArray9 = new String[lllIllIlll[0]];
                                            stringArray9[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[99]];
                                            if (p.llIIlIIllIIIl(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[100]];
                                                if (p.llIIlIIllIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIllIlll[77], lllIllIlll[78], lllIllIlll[1])) ? 1 : 0)) {
                                                    Movement.walkTo((WorldPoint)new WorldPoint(lllIllIlll[77], lllIllIlll[78], lllIllIlll[1]));
                                                    0;
                                                    Time.sleepTicks((int)lllIllIlll[0]);
                                                    0;
                                                }
                                                if (p.llIIlIIlIllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIllIlll[77], lllIllIlll[78], lllIllIlll[1])) ? 1 : 0)) {
                                                    String[] stringArray10 = new String[lllIllIlll[0]];
                                                    stringArray10[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[101]];
                                                    TileObjects.getNearest((String[])stringArray10).interact(lllIlIlllI[lllIllIlll[102]]);
                                                    Time.sleepTicks((int)lllIllIlll[4]);
                                                    0;
                                                    String[] stringArray11 = new String[lllIllIlll[0]];
                                                    stringArray11[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[103]];
                                                    TileObjects.getNearest((String[])stringArray11).interact(lllIlIlllI[lllIllIlll[104]]);
                                                    Time.sleepTicks((int)lllIllIlll[4]);
                                                    0;
                                                }
                                            }
                                        }
                                    }
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[105]];
                                    if (p.llIIlIIllIllI(Players.getLocal().getAnimation(), lllIllIlll[70]) && p.llIIlIIllIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                        int[] nArray = new int[lllIllIlll[0]];
                                        nArray[p.lllIllIlll[1]] = lllIllIlll[98];
                                        var14 = TileObjects.getNearest((int[])nArray);
                                        int[] nArray32 = new int[lllIllIlll[9]];
                                        nArray32[p.lllIllIlll[1]] = lllIllIlll[106];
                                        nArray32[p.lllIllIlll[0]] = lllIllIlll[107];
                                        nArray32[p.lllIllIlll[4]] = lllIllIlll[108];
                                        nArray32[p.lllIllIlll[7]] = lllIllIlll[109];
                                        nArray32[p.lllIllIlll[8]] = lllIllIlll[98];
                                        List var27 = TileObjects.getAll((int[])nArray32);
                                        List var28 = var27.stream().filter(tileObject -> Reachable.isInteractable((Locatable)tileObject)).collect(Collectors.toList());
                                        if (p.llIIlIIllIIIl(var28.isEmpty() ? 1 : 0)) {
                                            String[] stringArray12 = new String[lllIllIlll[0]];
                                            stringArray12[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[110]];
                                            if (p.llIIlIIlIllll(((TileObject)var28.get(lllIllIlll[1])).hasAction(stringArray12) ? 1 : 0)) {
                                                ((TileObject)var28.get(lllIllIlll[1])).interact(lllIlIlllI[lllIllIlll[111]]);
                                                Time.sleepTicks((int)lllIllIlll[7]);
                                                0;
                                            }
                                            String[] stringArray13 = new String[lllIllIlll[0]];
                                            stringArray13[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[75]];
                                            if (p.llIIlIIlIllll(((TileObject)var28.get(lllIllIlll[1])).hasAction(stringArray13) ? 1 : 0)) {
                                                ((TileObject)var28.get(lllIllIlll[1])).interact(lllIlIlllI[lllIllIlll[112]]);
                                                Time.sleepTicks((int)lllIllIlll[4]);
                                                0;
                                            }
                                        }
                                    }
                                }
                                String[] stringArray14 = new String[lllIllIlll[0]];
                                stringArray14[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[113]];
                                if (!p.llIIlIIlIllll(Inventory.contains((String[])stringArray14) ? 1 : 0)) break block241;
                                String[] stringArray15 = new String[lllIllIlll[0]];
                                stringArray15[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[114]];
                                if (!p.llIIlIIlIllll(Inventory.contains((String[])stringArray15) ? 1 : 0) || !p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIllIlll[115], lllIllIlll[116], lllIllIlll[1])), lllIllIlll[7])) break block240;
                            }
                            if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIllIlll[115], lllIllIlll[116], lllIllIlll[1])), lllIllIlll[7])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[117]];
                                if (p.llIIlIIlIllll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[118]];
                                    String[] stringArray = new String[lllIllIlll[0]];
                                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[119]];
                                    TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[120]]);
                                    Time.sleepTicks((int)lllIllIlll[8]);
                                    0;
                                }
                                if (p.llIIlIIllIIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)new WorldPoint(lllIllIlll[115], lllIllIlll[116], lllIllIlll[1]));
                                    0;
                                    Time.sleepTicks((int)lllIllIlll[0]);
                                    0;
                                }
                            }
                            if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIllIlll[115], lllIllIlll[116], lllIllIlll[1])), lllIllIlll[7])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[121]];
                                String[] stringArray = new String[lllIllIlll[0]];
                                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[122]];
                                String[] stringArray16 = new String[lllIllIlll[0]];
                                stringArray16[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[79]];
                                Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray16));
                                Time.sleepTicks((int)lllIllIlll[0]);
                                0;
                            }
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[6])) {
                            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[123]];
                            if (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                                g.a(bQ);
                            }
                            if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0) && p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[15])) {
                                if (p.llIIlIIlIllll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                    String[] stringArray = new String[lllIllIlll[0]];
                                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[124]];
                                    TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[125]]);
                                    Time.sleepTicks((int)lllIllIlll[31]);
                                    0;
                                }
                                Movement.walkTo((WorldPoint)cA);
                                0;
                                Time.sleepTicks((int)lllIllIlll[0]);
                                0;
                            }
                            if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[15])) {
                                g.a(lllIlIlllI[lllIllIlll[126]], bQ);
                            }
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[127])) {
                            if (p.llIIlIIllIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[128]];
                                String[] stringArray = new String[lllIllIlll[0]];
                                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[129]];
                                TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[130]]);
                                Time.sleepTicks((int)lllIllIlll[8]);
                                0;
                            }
                            if (p.llIIlIIllIllI(Players.getLocal().getWorldLocation().getPlane(), lllIllIlll[4])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[131]];
                                if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lllIllIlll[0]];
                                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[132]];
                                    TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[82]]);
                                    Time.sleepTicks((int)lllIllIlll[4]);
                                    0;
                                }
                                g.a(bQ);
                            }
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[133])) {
                            if (p.llIIlIIllIllI(Players.getLocal().getWorldLocation().getPlane(), lllIllIlll[4])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[134]];
                                String[] stringArray = new String[lllIllIlll[0]];
                                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[135]];
                                TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[136]]);
                                Time.sleepTicks((int)lllIllIlll[8]);
                                0;
                            }
                            if (p.llIIlIIllIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[137]];
                                if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lllIllIlll[0]];
                                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[138]];
                                    TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[139]]);
                                    Time.sleepTicks((int)lllIllIlll[4]);
                                    0;
                                }
                                g.a(bQ);
                            }
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[140])) {
                            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[141]];
                            if (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                                g.a(bQ);
                            }
                            if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0) && p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[15])) {
                                String[] stringArray = new String[lllIllIlll[0]];
                                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[142]];
                                TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[143]]);
                                Time.sleepTicks((int)lllIllIlll[31]);
                                0;
                                Movement.walkTo((WorldPoint)cA);
                                0;
                                Time.sleepTicks((int)lllIllIlll[0]);
                                0;
                            }
                            if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[15])) {
                                g.a(lllIlIlllI[lllIllIlll[83]], bQ);
                            }
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[144])) {
                            if (p.llIIlIIllIllI(Vars.getBit((int)lllIllIlll[145]), lllIllIlll[146])) {
                                cN = lllIllIlll[0];
                            }
                            if (p.llIIlIIllIIIl(cN ? 1 : 0)) {
                                p.aN();
                            }
                            if (p.llIIlIIlIllll(cN ? 1 : 0) && p.llIIlIIllIIIl(p.aJ() ? 1 : 0)) {
                                p.aM();
                            }
                            if (p.llIIlIIlIllll(cN ? 1 : 0) && p.llIIlIIlIllll(p.aJ() ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[147]];
                                if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(b.I), lllIllIlll[133])) {
                                    Bank.close();
                                    int[] nArray = new int[lllIllIlll[0]];
                                    nArray[p.lllIllIlll[1]] = lllIllIlll[34];
                                    if (p.llIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0) && p.llIIlIIllIllI(Players.getLocal().getAnimation(), lllIllIlll[70])) {
                                        int[] nArray33 = new int[lllIllIlll[0]];
                                        nArray33[p.lllIllIlll[1]] = lllIllIlll[34];
                                        Inventory.getFirst((int[])nArray33).interact(lllIlIlllI[lllIllIlll[148]]);
                                        Time.sleepTicks((int)lllIllIlll[4]);
                                        0;
                                    }
                                }
                                if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(b.I), lllIllIlll[133])) {
                                    if (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[13])) {
                                        Movement.walkTo((WorldPoint)cA);
                                        0;
                                        Time.sleepTicks((int)lllIllIlll[0]);
                                        0;
                                    }
                                    if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[15])) {
                                        g.a(lllIlIlllI[lllIllIlll[149]], bQ);
                                    }
                                }
                            }
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[150])) {
                            if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIllIlll[151], lllIllIlll[152], lllIllIlll[1])), lllIllIlll[8])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[153]];
                                Movement.walkTo((WorldPoint)new WorldPoint(lllIllIlll[151], lllIllIlll[152], lllIllIlll[1]));
                                0;
                                Time.sleepTicks((int)lllIllIlll[0]);
                                0;
                            }
                            if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIllIlll[151], lllIllIlll[152], lllIllIlll[1])), lllIllIlll[15])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[154]];
                                if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    TileObjects.getNearest(tileObject -> {
                                        int n2;
                                        if (p.llIIlIIlIllll(tileObject.getName().equalsIgnoreCase(lllIlIlllI[lllIllIlll[348]]) ? 1 : 0)) {
                                            String[] stringArray = new String[lllIllIlll[0]];
                                            stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[349]];
                                            if (p.llIIlIIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                                n2 = lllIllIlll[0];
                                                0;
                                                if ((0xE5 ^ 0xA9 ^ (0xFD ^ 0xB4)) != 0) return n2 != 0;
                                                return ((0x22 ^ 0x12 ^ (0x45 ^ 0x4D)) & (120 + 7 - 74 + 74 ^ (0x41 ^ 6) ^ -1)) != 0;
                                            }
                                        }
                                        n2 = lllIllIlll[1];
                                        return n2 != 0;
                                    }).interact(lllIlIlllI[lllIllIlll[155]]);
                                    Time.sleepTicks((int)lllIllIlll[4]);
                                    0;
                                }
                                g.a(bQ);
                            }
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[156])) {
                            if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIllIlll[77], lllIllIlll[152], lllIllIlll[1])), lllIllIlll[4])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[157]];
                                Movement.walkTo((WorldPoint)new WorldPoint(lllIllIlll[77], lllIllIlll[152], lllIllIlll[1]));
                                0;
                                Time.sleepTicks((int)lllIllIlll[0]);
                                0;
                            }
                            if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lllIllIlll[0]];
                                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[158]];
                                TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[159]]);
                                Time.sleepTicks((int)lllIllIlll[4]);
                                0;
                            }
                            g.a(bQ);
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[160])) {
                            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[89]];
                            g.a(lllIlIlllI[lllIllIlll[161]], bQ);
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[162])) {
                            if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cz), lllIllIlll[9])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[163]];
                                Movement.walkTo((WorldPoint)cz);
                                0;
                                Time.sleepTicks((int)lllIllIlll[0]);
                                0;
                            }
                            if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cz), lllIllIlll[9])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[164]];
                                g.a(lllIlIlllI[lllIllIlll[165]], bQ);
                            }
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[166])) {
                            if (p.llIIlIIllIIIl(p.aI() ? 1 : 0)) {
                                if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cB), lllIllIlll[9])) {
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[167]];
                                    Movement.walkTo((WorldPoint)cB);
                                    0;
                                    Time.sleepTicks((int)lllIllIlll[0]);
                                    0;
                                }
                                if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cB), lllIllIlll[9])) {
                                    if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                                        int[] nArray = new int[lllIllIlll[0]];
                                        nArray[p.lllIllIlll[1]] = lllIllIlll[168];
                                        TileObjects.getNearest((int[])nArray).interact(lllIlIlllI[lllIllIlll[169]]);
                                        Time.sleepTicks((int)lllIllIlll[4]);
                                        0;
                                    }
                                    if (p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0)) {
                                        a.a(lllIllIlll[27], lllIllIlll[4]);
                                        a.a(lllIllIlll[21], lllIllIlll[0]);
                                        a.a(lllIllIlll[29], lllIllIlll[0]);
                                        int[] nArray = new int[lllIllIlll[0]];
                                        nArray[p.lllIllIlll[1]] = lllIllIlll[19];
                                        if (p.llIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                            int[] nArray34 = new int[lllIllIlll[0]];
                                            nArray34[p.lllIllIlll[1]] = lllIllIlll[19];
                                            if (p.llIIlIIllIIIl(Equipment.contains((int[])nArray34) ? 1 : 0)) {
                                                a.a(lllIllIlll[19], lllIllIlll[0]);
                                            }
                                        }
                                    }
                                }
                            }
                            if (p.llIIlIIlIllll(p.aI() ? 1 : 0)) {
                                if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cC), lllIllIlll[9])) {
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[170]];
                                    if (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    Movement.walkTo((WorldPoint)cC);
                                    0;
                                    Time.sleepTicks((int)lllIllIlll[0]);
                                    0;
                                }
                                if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cC), lllIllIlll[9])) {
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[171]];
                                    if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                        String[] stringArray = new String[lllIllIlll[0]];
                                        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[172]];
                                        TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[6]]);
                                        Time.sleepTicks((int)lllIllIlll[4]);
                                        0;
                                    }
                                    g.a(bQ);
                                }
                            }
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[173])) {
                            if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[174]];
                                int[] nArray = new int[lllIllIlll[0]];
                                nArray[p.lllIllIlll[1]] = lllIllIlll[21];
                                if (p.llIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray35 = new int[lllIllIlll[0]];
                                    nArray35[p.lllIllIlll[1]] = lllIllIlll[21];
                                    String[] stringArray = new String[lllIllIlll[0]];
                                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[175]];
                                    Inventory.getFirst((int[])nArray35).useOn(TileObjects.getNearest((String[])stringArray));
                                    Time.sleepTicks((int)lllIllIlll[4]);
                                    0;
                                }
                                int[] nArray36 = new int[lllIllIlll[0]];
                                nArray36[p.lllIllIlll[1]] = lllIllIlll[21];
                                if (p.llIIlIIllIIIl(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                                    int[] nArray37 = new int[lllIllIlll[0]];
                                    nArray37[p.lllIllIlll[1]] = lllIllIlll[29];
                                    String[] stringArray = new String[lllIllIlll[0]];
                                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[176]];
                                    Inventory.getFirst((int[])nArray37).useOn(TileObjects.getNearest((String[])stringArray));
                                    Time.sleepTicks((int)lllIllIlll[4]);
                                    0;
                                }
                            }
                            g.a(bQ);
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[177])) {
                            g.a(bQ);
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[178])) {
                            if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[13])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[179]];
                                Movement.walkTo((WorldPoint)cA);
                                0;
                                Time.sleepTicks((int)lllIllIlll[0]);
                                0;
                            }
                            if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[15])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[180]];
                                if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    if (p.llIIlIIllIIII(cJ, lllIllIlll[7])) {
                                        g.a(lllIlIlllI[lllIllIlll[181]], bQ);
                                        Time.sleepTicks((int)lllIllIlll[4]);
                                        0;
                                        cJ += lllIllIlll[0];
                                    }
                                    if (p.llIIlIIllIIlI(cJ, lllIllIlll[7]) && p.llIIlIIllIIII(cJ, lllIllIlll[9])) {
                                        g.a(lllIlIlllI[lllIllIlll[182]], bQ);
                                        Time.sleepTicks((int)lllIllIlll[4]);
                                        0;
                                        cJ += lllIllIlll[0];
                                    }
                                    if (p.llIIlIIllIIlI(cJ, lllIllIlll[9]) && p.llIIlIIllIIII(cJ, lllIllIlll[13])) {
                                        g.a(lllIlIlllI[lllIllIlll[183]], bQ);
                                        Time.sleepTicks((int)lllIllIlll[4]);
                                        0;
                                        cJ += lllIllIlll[0];
                                    }
                                }
                                g.a(bQ);
                            }
                            g.a(bQ);
                        }
                        if (!p.llIIlIIlllIII(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[184]) || p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[185])) {
                            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[186]];
                            e.l(lllIllIlll[19]);
                            if (p.llIIlIIllIIII(Prayers.getPoints(), lllIllIlll[23]) && p.llIIlIIlIllll(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aR).interact(lllIlIlllI[lllIllIlll[187]]);
                                Time.sleepTicks((int)lllIllIlll[0]);
                                0;
                            }
                            if (p.llIIlIIllIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (p.llIIlIIlllIIl(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lllIllIlll[0]];
                                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[188]];
                                if (p.llIIlIIllIIll(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray17 = new String[lllIllIlll[0]];
                                    stringArray17[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[189]];
                                    NPCs.getNearest((String[])stringArray17).interact(lllIlIlllI[lllIllIlll[190]]);
                                    Time.sleepTicks((int)lllIllIlll[7]);
                                    0;
                                }
                                String[] stringArray18 = new String[lllIllIlll[0]];
                                stringArray18[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[191]];
                                if (p.llIIlIIllIIll(NPCs.getNearest((String[])stringArray18))) {
                                    String[] stringArray19 = new String[lllIllIlll[0]];
                                    stringArray19[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[192]];
                                    NPCs.getNearest((String[])stringArray19).interact(lllIlIlllI[lllIllIlll[193]]);
                                    Time.sleepTicks((int)lllIllIlll[7]);
                                    0;
                                }
                            }
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[194])) {
                            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[195]];
                            if (p.llIIlIIlIllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                g.a(lllIlIlllI[lllIllIlll[196]], bQ);
                            }
                            g.a(bQ);
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[197])) {
                            if (!p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[15]) || p.llIIlIIlIllll(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                String[] stringArray = new String[lllIllIlll[0]];
                                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[198]];
                                if (p.llIIlIIllIIll(NPCs.getNearest((String[])stringArray))) {
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[199]];
                                    g.a(lllIlIlllI[lllIllIlll[200]], bQ);
                                }
                            }
                            if (p.llIIlIIlIllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIllIlll[68], lllIllIlll[69], lllIllIlll[1])) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[201]];
                                String[] stringArray = new String[lllIllIlll[0]];
                                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[202]];
                                TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[203]]);
                                Time.sleepTicks((int)lllIllIlll[8]);
                                0;
                            }
                            String[] stringArray = new String[lllIllIlll[0]];
                            stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[204]];
                            if (p.llIIlIIlllIIl(NPCs.getNearest((String[])stringArray))) {
                                if (p.llIIlIIllIIIl(p.aH() ? 1 : 0)) {
                                    p.aL();
                                }
                                if (p.llIIlIIlIllll(p.aH() ? 1 : 0)) {
                                    if (p.llIIlIIlIllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIllIlll[68], lllIllIlll[69], lllIllIlll[1])) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[205]];
                                        String[] stringArray20 = new String[lllIllIlll[0]];
                                        stringArray20[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[206]];
                                        TileObjects.getNearest((String[])stringArray20).interact(lllIlIlllI[lllIllIlll[207]]);
                                        Time.sleepTicks((int)lllIllIlll[8]);
                                        0;
                                    }
                                    if (!p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cn), lllIllIlll[3]) || p.llIIlIIllIIIl(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[208]];
                                        if (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)cn);
                                        0;
                                        Time.sleepTicks((int)lllIllIlll[0]);
                                        0;
                                    }
                                }
                            }
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[209])) {
                            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[127]];
                            String[] stringArray = new String[lllIllIlll[0]];
                            stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[210]];
                            var14 = NPCs.getAll((String[])stringArray);
                            if (p.llIIlIIllIlIl(var14.size())) {
                                ((NPC)var14.get(lllIllIlll[1])).interact(lllIlIlllI[lllIllIlll[211]]);
                                Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIllIlll[212]);
                                0;
                            }
                            g.a(lllIlIlllI[lllIllIlll[213]], bQ);
                        }
                        if (!p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[214])) break block242;
                        int[] nArray = new int[lllIllIlll[0]];
                        nArray[p.lllIllIlll[1]] = lllIllIlll[56];
                        if (!p.llIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block243;
                        int[] nArray38 = new int[lllIllIlll[0]];
                        nArray38[p.lllIllIlll[1]] = lllIllIlll[58];
                        if (!p.llIIlIIllIIIl(Inventory.contains((int[])nArray38) ? 1 : 0)) break block243;
                        int[] nArray39 = new int[lllIllIlll[0]];
                        nArray39[p.lllIllIlll[1]] = lllIllIlll[61];
                        if (!p.llIIlIIllIIIl(Inventory.contains((int[])nArray39) ? 1 : 0)) break block243;
                        int[] nArray40 = new int[lllIllIlll[0]];
                        nArray40[p.lllIllIlll[1]] = lllIllIlll[63];
                        if (!p.llIIlIIllIIIl(Inventory.contains((int[])nArray40) ? 1 : 0)) break block243;
                        String[] stringArray = new String[lllIllIlll[0]];
                        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[215]];
                        if (!p.llIIlIIlIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block244;
                    }
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[216]];
                    int[] nArray = new int[lllIllIlll[0]];
                    nArray[p.lllIllIlll[1]] = lllIllIlll[56];
                    if (p.llIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray41 = new int[lllIllIlll[0]];
                        nArray41[p.lllIllIlll[1]] = lllIllIlll[56];
                        String[] stringArray = new String[lllIllIlll[0]];
                        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[217]];
                        Inventory.getFirst((int[])nArray41).useOn((Actor)NPCs.getNearest((String[])stringArray));
                        Time.sleepTicks((int)lllIllIlll[4]);
                        0;
                    }
                    int[] nArray42 = new int[lllIllIlll[0]];
                    nArray42[p.lllIllIlll[1]] = lllIllIlll[58];
                    if (p.llIIlIIlIllll(Inventory.contains((int[])nArray42) ? 1 : 0)) {
                        int[] nArray43 = new int[lllIllIlll[0]];
                        nArray43[p.lllIllIlll[1]] = lllIllIlll[58];
                        String[] stringArray = new String[lllIllIlll[0]];
                        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[218]];
                        Inventory.getFirst((int[])nArray43).useOn((Actor)NPCs.getNearest((String[])stringArray));
                        Time.sleepTicks((int)lllIllIlll[4]);
                        0;
                    }
                    int[] nArray44 = new int[lllIllIlll[0]];
                    nArray44[p.lllIllIlll[1]] = lllIllIlll[61];
                    if (p.llIIlIIlIllll(Inventory.contains((int[])nArray44) ? 1 : 0)) {
                        int[] nArray45 = new int[lllIllIlll[0]];
                        nArray45[p.lllIllIlll[1]] = lllIllIlll[61];
                        String[] stringArray = new String[lllIllIlll[0]];
                        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[219]];
                        Inventory.getFirst((int[])nArray45).useOn((Actor)NPCs.getNearest((String[])stringArray));
                        Time.sleepTicks((int)lllIllIlll[4]);
                        0;
                    }
                    int[] nArray46 = new int[lllIllIlll[0]];
                    nArray46[p.lllIllIlll[1]] = lllIllIlll[63];
                    if (p.llIIlIIlIllll(Inventory.contains((int[])nArray46) ? 1 : 0) && p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                        int[] nArray47 = new int[lllIllIlll[0]];
                        nArray47[p.lllIllIlll[1]] = lllIllIlll[63];
                        String[] stringArray = new String[lllIllIlll[0]];
                        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[220]];
                        Inventory.getFirst((int[])nArray47).useOn((Actor)NPCs.getNearest((String[])stringArray));
                        Time.sleepTicks((int)lllIllIlll[4]);
                        0;
                    }
                    int[] nArray48 = new int[lllIllIlll[0]];
                    nArray48[p.lllIllIlll[1]] = lllIllIlll[24];
                    if (p.llIIlIIlIllll(Inventory.contains((int[])nArray48) ? 1 : 0) && p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                        int[] nArray49 = new int[lllIllIlll[0]];
                        nArray49[p.lllIllIlll[1]] = lllIllIlll[24];
                        String[] stringArray = new String[lllIllIlll[0]];
                        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[133]];
                        Inventory.getFirst((int[])nArray49).useOn((Actor)NPCs.getNearest((String[])stringArray));
                        Time.sleepTicks((int)lllIllIlll[4]);
                        0;
                    }
                }
                int[] nArray = new int[lllIllIlll[0]];
                nArray[p.lllIllIlll[1]] = lllIllIlll[56];
                if (p.llIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray50 = new int[lllIllIlll[0]];
                    nArray50[p.lllIllIlll[1]] = lllIllIlll[58];
                    if (p.llIIlIIllIIIl(Inventory.contains((int[])nArray50) ? 1 : 0)) {
                        int[] nArray51 = new int[lllIllIlll[0]];
                        nArray51[p.lllIllIlll[1]] = lllIllIlll[61];
                        if (p.llIIlIIllIIIl(Inventory.contains((int[])nArray51) ? 1 : 0)) {
                            int[] nArray52 = new int[lllIllIlll[0]];
                            nArray52[p.lllIllIlll[1]] = lllIllIlll[63];
                            if (p.llIIlIIllIIIl(Inventory.contains((int[])nArray52) ? 1 : 0)) {
                                String[] stringArray = new String[lllIllIlll[0]];
                                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[221]];
                                if (p.llIIlIIllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[222]];
                                    g.a(lllIlIlllI[lllIllIlll[223]], bQ);
                                }
                            }
                        }
                    }
                }
                g.a(bQ);
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[224])) {
                if (p.llIIlIIlIllll(Widgets.get((int)lllIllIlll[101]).isEmpty() ? 1 : 0) && p.llIIlIIlIllll(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[225]];
                    g.a(lllIlIlllI[lllIllIlll[226]], bQ);
                }
                if (p.llIIlIIllIIIl(Widgets.get((int)lllIllIlll[101]).isEmpty() ? 1 : 0) && p.llIIlIIlIllll(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.llIIlIIllIIII(cK, lllIllIlll[4])) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[227]];
                    Mouse.click((int)Widgets.get((int)lllIllIlll[101], (int)lllIllIlll[66]).getClickPoint().getX(), (int)Widgets.get((int)lllIllIlll[101], (int)lllIllIlll[66]).getClickPoint().getY(), (boolean)lllIllIlll[0]);
                    Time.sleepTicks((int)lllIllIlll[7]);
                    0;
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[228]];
                    Mouse.click((int)Widgets.get((int)lllIllIlll[101], (int)lllIllIlll[88]).getClickPoint().getX(), (int)Widgets.get((int)lllIllIlll[101], (int)lllIllIlll[88]).getClickPoint().getY(), (boolean)lllIllIlll[0]);
                    Time.sleepTicks((int)lllIllIlll[7]);
                    0;
                    cK += lllIllIlll[0];
                }
                if (p.llIIlIIlllIIl(Players.getLocal().getInteracting())) {
                    String[] stringArray = new String[lllIllIlll[0]];
                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[229]];
                    if (p.llIIlIIllIIll(NPCs.getNearest((String[])stringArray))) {
                        if (p.llIIlIIllIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                        }
                        if (p.llIIlIIllIIII(Prayers.getPoints(), lllIllIlll[23]) && p.llIIlIIlIllll(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aR).interact(lllIlIlllI[lllIllIlll[230]]);
                            Time.sleepTicks((int)lllIllIlll[0]);
                            0;
                        }
                        String[] stringArray21 = new String[lllIllIlll[0]];
                        stringArray21[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[140]];
                        NPCs.getNearest((String[])stringArray21).interact(lllIlIlllI[lllIllIlll[231]]);
                        Time.sleepTicks((int)lllIllIlll[4]);
                        0;
                    }
                    String[] stringArray22 = new String[lllIllIlll[0]];
                    stringArray22[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[232]];
                    if (p.llIIlIIlllIIl(NPCs.getNearest((String[])stringArray22)) && p.llIIlIIlIllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                }
                g.a(bQ);
            }
            if (p.llIIlIIllIIlI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[233]) && p.llIIlIIllIlII(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[234])) {
                if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(s.dp), lllIllIlll[8])) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[235]];
                    String[] stringArray = new String[lllIllIlll[0]];
                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[236]];
                    if (p.llIIlIIllIIll(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray23 = new String[lllIllIlll[0]];
                        stringArray23[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[144]];
                        TileObjects.getNearest((String[])stringArray23).interact(lllIlIlllI[lllIllIlll[237]]);
                        Time.sleepTicks((int)lllIllIlll[7]);
                        0;
                    }
                    Movement.walkTo((WorldPoint)s.dp);
                    0;
                    Time.sleepTicks((int)lllIllIlll[0]);
                    0;
                }
                if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(s.dp), lllIllIlll[15])) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[238]];
                    if (p.llIIlIIlIllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    g.a(lllIlIlllI[lllIllIlll[239]], bQ);
                }
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[240])) {
                String[] stringArray = new String[lllIllIlll[0]];
                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[241]];
                if (p.llIIlIIlllIIl(TileObjects.getNearest((String[])stringArray))) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[150]];
                    String[] stringArray24 = new String[lllIllIlll[0]];
                    stringArray24[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[242]];
                    String[] stringArray25 = new String[lllIllIlll[0]];
                    stringArray25[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[243]];
                    Inventory.getFirst((String[])stringArray24).useOn(TileObjects.getNearest((String[])stringArray25));
                    Time.sleepTicks((int)lllIllIlll[8]);
                    0;
                }
                String[] stringArray26 = new String[lllIllIlll[0]];
                stringArray26[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[244]];
                if (p.llIIlIIllIIll(TileObjects.getNearest((String[])stringArray26))) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[245]];
                    String[] stringArray27 = new String[lllIllIlll[0]];
                    stringArray27[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[246]];
                    TileObjects.getNearest((String[])stringArray27).interact(lllIlIlllI[lllIllIlll[247]]);
                    Time.sleepTicks((int)lllIllIlll[7]);
                    0;
                }
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[248])) {
                if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                    int[] nArray = new int[lllIllIlll[0]];
                    nArray[p.lllIllIlll[1]] = lllIllIlll[249];
                    TileObjects.getNearest((int[])nArray).interact(lllIlIlllI[lllIllIlll[250]]);
                    Time.sleepTicks((int)lllIllIlll[8]);
                    0;
                }
                g.a(bQ);
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[251])) {
                String[] stringArray = new String[lllIllIlll[0]];
                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[252]];
                Inventory.getFirst((String[])stringArray).interact(lllIlIlllI[lllIllIlll[253]]);
                Time.sleepTicks((int)lllIllIlll[4]);
                0;
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[254])) {
                if (p.llIIlIIllIIIl(p.aG() ? 1 : 0)) {
                    p.aK();
                }
                if (p.llIIlIIlIllll(p.aG() ? 1 : 0)) {
                    if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cD), lllIllIlll[4])) {
                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[156]];
                        if (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)cD);
                        0;
                        Time.sleepTicks((int)lllIllIlll[0]);
                        0;
                    }
                    if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cD), lllIllIlll[4])) {
                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[255]];
                        String[] stringArray = new String[lllIllIlll[0]];
                        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[256]];
                        if (p.llIIlIIllIIll(TileObjects.getNearest((String[])stringArray))) {
                            int[] nArray = new int[lllIllIlll[0]];
                            nArray[p.lllIllIlll[1]] = lllIllIlll[41];
                            String[] stringArray28 = new String[lllIllIlll[0]];
                            stringArray28[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[257]];
                            Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray28));
                            Time.sleepTicks((int)lllIllIlll[9]);
                            0;
                        }
                        String[] stringArray29 = new String[lllIllIlll[0]];
                        stringArray29[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[258]];
                        if (p.llIIlIIllIIll(TileObjects.getNearest((String[])stringArray29))) {
                            String[] stringArray30 = new String[lllIllIlll[0]];
                            stringArray30[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[259]];
                            if (p.llIIlIIlllIIl(TileObjects.getNearest((String[])stringArray30))) {
                                String[] stringArray31 = new String[lllIllIlll[0]];
                                stringArray31[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[260]];
                                TileObjects.getNearest((String[])stringArray31).interact(lllIlIlllI[lllIllIlll[261]]);
                                Time.sleepTicks((int)lllIllIlll[7]);
                                0;
                            }
                        }
                    }
                }
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[262])) {
                if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cE), lllIllIlll[7])) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[263]];
                    Movement.walkTo((WorldPoint)cE);
                    0;
                    Time.sleepTicks((int)lllIllIlll[0]);
                    0;
                }
                if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cE), lllIllIlll[7])) {
                    String[] stringArray = new String[lllIllIlll[0]];
                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[264]];
                    String[] stringArray32 = new String[lllIllIlll[0]];
                    stringArray32[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[160]];
                    Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray32));
                    Time.sleepTicks((int)lllIllIlll[7]);
                    0;
                }
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[265])) {
                if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cF), lllIllIlll[7])) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[266]];
                    Movement.walkTo((WorldPoint)cF);
                    0;
                    Time.sleepTicks((int)lllIllIlll[0]);
                    0;
                }
                if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cF), lllIllIlll[7])) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[267]];
                    if (p.llIIlIIlIllll(Widgets.get((int)lllIllIlll[11]).isEmpty() ? 1 : 0)) {
                        String[] stringArray = new String[lllIllIlll[0]];
                        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[268]];
                        String[] stringArray33 = new String[lllIllIlll[0]];
                        stringArray33[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[269]];
                        Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray33));
                    }
                    if (p.llIIlIIllIIIl(Widgets.get((int)lllIllIlll[11]).isEmpty() ? 1 : 0)) {
                        Widgets.get((int)lllIllIlll[11], (int)lllIllIlll[66]).interact(lllIlIlllI[lllIllIlll[270]]);
                        Time.sleepTicks((int)lllIllIlll[4]);
                        0;
                    }
                }
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[271])) {
                String[] stringArray = new String[lllIllIlll[0]];
                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[272]];
                if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[273]];
                    int[] nArray = new int[lllIllIlll[0]];
                    nArray[p.lllIllIlll[1]] = lllIllIlll[274];
                    Magic.cast((Spell)SpellBook.Standard.LVL_1_ENCHANT, (Item)Inventory.getFirst((int[])nArray));
                    Time.sleepTicks((int)lllIllIlll[4]);
                    0;
                }
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[275])) {
                if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(s.do), lllIllIlll[13])) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[276]];
                    String[] stringArray = new String[lllIllIlll[0]];
                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[277]];
                    if (p.llIIlIIllIIll(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray34 = new String[lllIllIlll[0]];
                        stringArray34[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[162]];
                        TileObjects.getNearest((String[])stringArray34).interact(lllIlIlllI[lllIllIlll[278]]);
                        Time.sleepTicks((int)lllIllIlll[7]);
                        0;
                    }
                    Movement.walkTo((WorldPoint)s.do);
                    0;
                    Time.sleepTicks((int)lllIllIlll[0]);
                    0;
                }
                if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(s.do), lllIllIlll[13])) {
                    int[] nArray = new int[lllIllIlll[0]];
                    nArray[p.lllIllIlll[1]] = lllIllIlll[279];
                    int[] nArray53 = new int[lllIllIlll[0]];
                    nArray53[p.lllIllIlll[1]] = lllIllIlll[280];
                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((int[])nArray53));
                    Time.sleepTicks((int)lllIllIlll[8]);
                    0;
                }
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[281])) {
                String[] stringArray = new String[lllIllIlll[0]];
                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[282]];
                if (p.llIIlIIlllIIl(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[283]];
                    if (p.llIIlIIllIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIllIlll[77], lllIllIlll[78], lllIllIlll[1])) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lllIllIlll[77], lllIllIlll[78], lllIllIlll[1]));
                        0;
                        Time.sleepTicks((int)lllIllIlll[0]);
                        0;
                    }
                    if (p.llIIlIIlIllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIllIlll[77], lllIllIlll[78], lllIllIlll[1])) ? 1 : 0)) {
                        String[] stringArray35 = new String[lllIllIlll[0]];
                        stringArray35[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[284]];
                        TileObjects.getNearest((String[])stringArray35).interact(lllIlIlllI[lllIllIlll[166]]);
                        Time.sleepTicks((int)lllIllIlll[4]);
                        0;
                        String[] stringArray36 = new String[lllIllIlll[0]];
                        stringArray36[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[285]];
                        TileObjects.getNearest((String[])stringArray36).interact(lllIlIlllI[lllIllIlll[286]]);
                        Time.sleepTicks((int)lllIllIlll[4]);
                        0;
                    }
                }
                String[] stringArray37 = new String[lllIllIlll[0]];
                stringArray37[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[287]];
                if (p.llIIlIIllIIll(NPCs.getNearest((String[])stringArray37))) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[288]];
                    if (p.llIIlIIllIIII(ck, lllIllIlll[0])) {
                        ac.lG += lllIllIlll[0];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += lllIllIlll[0];
                        ac.lG = lllIllIlll[1];
                        cl = lllIllIlll[1];
                    }
                    g.a(lllIlIlllI[lllIllIlll[173]], bQ);
                }
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[289])) {
                String[] stringArray = new String[lllIllIlll[0]];
                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[290]];
                g.a(stringArray);
                if (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aG() {
        int n2;
        int[] nArray = new int[lllIllIlll[0]];
        nArray[p.lllIllIlll[1]] = lllIllIlll[51];
        if (p.llIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllIllIlll[0]];
            nArray2[p.lllIllIlll[1]] = lllIllIlll[46];
            if (p.llIIlIIlIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lllIllIlll[0]];
                nArray3[p.lllIllIlll[1]] = lllIllIlll[47];
                if (p.llIIlIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lllIllIlll[0]];
                    nArray4[p.lllIllIlll[1]] = lllIllIlll[49];
                    if (p.llIIlIIlIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lllIllIlll[0]];
                        nArray5[p.lllIllIlll[1]] = lllIllIlll[44];
                        if (p.llIIlIIlIllll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            n2 = lllIllIlll[0];
                            0;
                            if (1 == 1) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lllIllIlll[1];
        return n2 != 0;
    }

    private static boolean llIIlIIllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIIlIIIllllI() {
        lllIlIlllI = new String[lllIllIlll[383]];
        p.lllIlIlllI[p.lllIllIlll[1]] = p."Finished buying items, switching back to quest";
        p.lllIlIlllI[p.lllIllIlll[0]] = p."- Crafting";
        p.lllIlIlllI[p.lllIllIlll[4]] = p."- Mining";
        p.lllIlIlllI[p.lllIllIlll[7]] = p."- In Search";
        p.lllIlIlllI[p.lllIllIlll[8]] = p."";
        p.lllIlIlllI[p.lllIllIlll[9]] = p."Nav to bank";
        p.lllIlIlllI[p.lllIllIlll[11]] = p."Break";
        p.lllIlIlllI[p.lllIllIlll[13]] = p."Handling banking";
        p.lllIlIlllI[p.lllIllIlll[35]] = p."We are missing a certain amount of quest supplies, switching to BUYING";
        p.lllIlIlllI[p.lllIllIlll[37]] = p."We are missing rune scimitar, switching to BUYING";
        p.lllIlIlllI[p.lllIllIlll[15]] = p."We are missing quest supplies, switching to BUYING";
        p.lllIlIlllI[p.lllIllIlll[42]] = p."Getting gear";
        p.lllIlIlllI[p.lllIllIlll[31]] = p."Getting starting supplies";
        p.lllIlIlllI[p.lllIllIlll[43]] = p."Drink";
        p.lllIlIlllI[p.lllIllIlll[45]] = p."";
        p.lllIlIlllI[p.lllIllIlll[3]] = p."Entering cave";
        p.lllIlIlllI[p.lllIllIlll[48]] = p."Cave entrance";
        p.lllIlIlllI[p.lllIllIlll[50]] = p."Enter";
        p.lllIlIlllI[p.lllIllIlll[52]] = p."nav to start";
        p.lllIlIlllI[p.lllIllIlll[54]] = p."Break";
        p.lllIlIlllI[p.lllIllIlll[23]] = p."Starting quest";
        p.lllIlIlllI[p.lllIllIlll[57]] = p."Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[59]] = p."Tele to barrows";
        p.lllIlIlllI[p.lllIllIlll[60]] = p."Break";
        p.lllIlIlllI[p.lllIllIlll[62]] = p."Nav to burgh gate";
        p.lllIlIlllI[p.lllIllIlll[2]] = p."Talk to guy";
        p.lllIlIlllI[p.lllIllIlll[64]] = p."Florin";
        p.lllIlIlllI[p.lllIllIlll[65]] = p."Donating food";
        p.lllIlIlllI[p.lllIllIlll[38]] = p."Shark";
        p.lllIlIlllI[p.lllIllIlll[66]] = p."Open chest";
        p.lllIlIlllI[p.lllIllIlll[71]] = p."Nav to pub";
        p.lllIlIlllI[p.lllIllIlll[73]] = p."Talk to guy";
        p.lllIlIlllI[p.lllIllIlll[74]] = p."Razvan";
        p.lllIlIlllI[p.lllIllIlll[76]] = p."Nav to rubble pile";
        p.lllIlIlllI[p.lllIllIlll[80]] = p."Digging rubble";
        p.lllIlIlllI[p.lllIllIlll[84]] = p."Going down trapdoor";
        p.lllIlIlllI[p.lllIllIlll[85]] = p."Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[86]] = p."Open";
        p.lllIlIlllI[p.lllIllIlll[87]] = p."Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[88]] = p."Climb-down";
        p.lllIlIlllI[p.lllIllIlll[72]] = p."Bucket";
        p.lllIlIlllI[p.lllIllIlll[90]] = p."Broken glass";
        p.lllIlIlllI[p.lllIllIlll[91]] = p."Drop";
        p.lllIlIlllI[p.lllIllIlll[92]] = p."Bronze nails";
        p.lllIlIlllI[p.lllIllIlll[67]] = p."Drop";
        p.lllIlIlllI[p.lllIllIlll[93]] = p."Iron nails";
        p.lllIlIlllI[p.lllIllIlll[94]] = p."Drop";
        p.lllIlIlllI[p.lllIllIlll[95]] = p."Rock";
        p.lllIlIlllI[p.lllIllIlll[96]] = p."Drop";
        p.lllIlIlllI[p.lllIllIlll[97]] = p."Black nails";
        p.lllIlIlllI[p.lllIllIlll[26]] = p."Drop";
        p.lllIlIlllI[p.lllIllIlll[99]] = p."Bucket of rubble";
        p.lllIlIlllI[p.lllIllIlll[100]] = p."Nav to rubble pile";
        p.lllIlIlllI[p.lllIllIlll[101]] = p."Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[102]] = p."Open";
        p.lllIlIlllI[p.lllIllIlll[103]] = p."Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[104]] = p."Climb-down";
        p.lllIlIlllI[p.lllIllIlll[105]] = p."Mine rubble";
        p.lllIlIlllI[p.lllIllIlll[110]] = p."Mine";
        p.lllIlIlllI[p.lllIllIlll[111]] = p."Mine";
        p.lllIlIlllI[p.lllIllIlll[75]] = p."Remove";
        p.lllIlIlllI[p.lllIllIlll[112]] = p."Remove";
        p.lllIlIlllI[p.lllIllIlll[113]] = p."Bucket";
        p.lllIlIlllI[p.lllIllIlll[114]] = p."Bucket of rubble";
        p.lllIlIlllI[p.lllIllIlll[117]] = p."Nav outside pub";
        p.lllIlIlllI[p.lllIllIlll[118]] = p."Climb up ladder";
        p.lllIlIlllI[p.lllIllIlll[119]] = p."Ladder";
        p.lllIlIlllI[p.lllIllIlll[120]] = p."Climb-up";
        p.lllIlIlllI[p.lllIllIlll[121]] = p."Empty Buckets";
        p.lllIlIlllI[p.lllIllIlll[122]] = p."Bucket of rubble";
        p.lllIlIlllI[p.lllIllIlll[79]] = p."Rubble Pile";
        p.lllIlIlllI[p.lllIllIlll[123]] = p."Nav to general store";
        p.lllIlIlllI[p.lllIllIlll[124]] = p."Ladder";
        p.lllIlIlllI[p.lllIllIlll[125]] = p."Climb-up";
        p.lllIlIlllI[p.lllIllIlll[126]] = p."Aurel";
        p.lllIlIlllI[p.lllIllIlll[128]] = p."Climb up ladder";
        p.lllIlIlllI[p.lllIllIlll[129]] = p."Ladder";
        p.lllIlIlllI[p.lllIllIlll[130]] = p."Climb-up";
        p.lllIlIlllI[p.lllIllIlll[131]] = p."Fix roof";
        p.lllIlIlllI[p.lllIllIlll[132]] = p."Broken Roof";
        p.lllIlIlllI[p.lllIllIlll[82]] = p."Inspect";
        p.lllIlIlllI[p.lllIllIlll[134]] = p."Climb up ladder";
        p.lllIlIlllI[p.lllIllIlll[135]] = p."Ladder";
        p.lllIlIlllI[p.lllIllIlll[136]] = p."Climb-down";
        p.lllIlIlllI[p.lllIllIlll[137]] = p."Fix roof";
        p.lllIlIlllI[p.lllIllIlll[138]] = p."Damaged wall";
        p.lllIlIlllI[p.lllIllIlll[139]] = p."Inspect";
        p.lllIlIlllI[p.lllIllIlll[141]] = p."Nav to general store";
        p.lllIlIlllI[p.lllIllIlll[142]] = p."Ladder";
        p.lllIlIlllI[p.lllIllIlll[143]] = p."Climb-up";
        p.lllIlIlllI[p.lllIllIlll[83]] = p."Aurel";
        p.lllIlIlllI[p.lllIllIlll[147]] = p."Nav to general store";
        p.lllIlIlllI[p.lllIllIlll[148]] = p."Break";
        p.lllIlIlllI[p.lllIllIlll[149]] = p."Aurel";
        p.lllIlIlllI[p.lllIllIlll[153]] = p."Nav to burgh bank";
        p.lllIlIlllI[p.lllIllIlll[154]] = p."Fixing bank";
        p.lllIlIlllI[p.lllIllIlll[155]] = p."Inspect";
        p.lllIlIlllI[p.lllIllIlll[157]] = p."Nav to burgh bank";
        p.lllIlIlllI[p.lllIllIlll[158]] = p."Damaged wall";
        p.lllIlIlllI[p.lllIllIlll[159]] = p."Inspect";
        p.lllIlIlllI[p.lllIllIlll[89]] = p."Hiring banker";
        p.lllIlIlllI[p.lllIllIlll[161]] = p."Cornelius";
        p.lllIlIlllI[p.lllIllIlll[163]] = p."Nav to pub";
        p.lllIlIlllI[p.lllIllIlll[164]] = p."Talk to guy";
        p.lllIlIlllI[p.lllIllIlll[165]] = p."Razvan";
        p.lllIlIlllI[p.lllIllIlll[167]] = p."Nav to burgh bank";
        p.lllIlIlllI[p.lllIllIlll[169]] = p."Bank";
        p.lllIlIlllI[p.lllIllIlll[170]] = p."Nav to furnace";
        p.lllIlIlllI[p.lllIllIlll[171]] = p."Repair furnace";
        p.lllIlIlllI[p.lllIllIlll[172]] = p."Broken furnace";
        p.lllIlIlllI[p.lllIllIlll[6]] = p."Inspect";
        p.lllIlIlllI[p.lllIllIlll[174]] = p."Lighting furnace";
        p.lllIlIlllI[p.lllIllIlll[175]] = p."Repaired furnace";
        p.lllIlIlllI[p.lllIllIlll[176]] = p."Repaired furnace";
        p.lllIlIlllI[p.lllIllIlll[179]] = p."Nav to general store";
        p.lllIlIlllI[p.lllIllIlll[180]] = p."Talking to guys";
        p.lllIlIlllI[p.lllIllIlll[181]] = p."Gadderanks";
        p.lllIlIlllI[p.lllIllIlll[182]] = p."Vampyre Juvinate";
        p.lllIlIlllI[p.lllIllIlll[183]] = p."Wiskit";
        p.lllIlIlllI[p.lllIllIlll[186]] = p."Handling fight";
        p.lllIlIlllI[p.lllIllIlll[187]] = p."Drink";
        p.lllIlIlllI[p.lllIllIlll[188]] = p."Vampyre Juvinate";
        p.lllIlIlllI[p.lllIllIlll[189]] = p."Vampyre Juvinate";
        p.lllIlIlllI[p.lllIllIlll[190]] = p."Attack";
        p.lllIlIlllI[p.lllIllIlll[191]] = p."Gadderanks";
        p.lllIlIlllI[p.lllIllIlll[192]] = p."Gadderanks";
        p.lllIlIlllI[p.lllIllIlll[193]] = p."Attack";
        p.lllIlIlllI[p.lllIllIlll[195]] = p."Talking to gadderanks";
        p.lllIlIlllI[p.lllIllIlll[196]] = p."Gadderanks";
        p.lllIlIlllI[p.lllIllIlll[198]] = p."Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[199]] = p."Talking to veliaf";
        p.lllIlIlllI[p.lllIllIlll[200]] = p."Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[201]] = p."Entering cave";
        p.lllIlIlllI[p.lllIllIlll[202]] = p."Cave entrance";
        p.lllIlIlllI[p.lllIllIlll[203]] = p."Enter";
        p.lllIlIlllI[p.lllIllIlll[204]] = p."Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[205]] = p."Entering cave";
        p.lllIlIlllI[p.lllIllIlll[206]] = p."Cave entrance";
        p.lllIlIlllI[p.lllIllIlll[207]] = p."Enter";
        p.lllIlIlllI[p.lllIllIlll[208]] = p."Nav to start";
        p.lllIlIlllI[p.lllIllIlll[127]] = p."Talk to Polmafi";
        p.lllIlIlllI[p.lllIllIlll[210]] = p."Polmafi Ferdygris";
        p.lllIlIlllI[p.lllIllIlll[211]] = p."Talk-to";
        p.lllIlIlllI[p.lllIllIlll[213]] = p."Polmafi Ferdygris";
        p.lllIlIlllI[p.lllIllIlll[215]] = p."Salmon";
        p.lllIlIlllI[p.lllIllIlll[216]] = p."Giving Ivan gear";
        p.lllIlIlllI[p.lllIllIlll[217]] = p."Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[218]] = p."Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[219]] = p."Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[220]] = p."Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[133]] = p."Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[221]] = p."Salmon";
        p.lllIlIlllI[p.lllIllIlll[222]] = p."Talk to Ivan";
        p.lllIlIlllI[p.lllIllIlll[223]] = p."Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[225]] = p."Starting trek";
        p.lllIlIlllI[p.lllIllIlll[226]] = p."Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[227]] = p."Selecting route 2";
        p.lllIlIlllI[p.lllIllIlll[228]] = p."Selecting travel";
        p.lllIlIlllI[p.lllIllIlll[229]] = p."Vampyre Juvinate";
        p.lllIlIlllI[p.lllIllIlll[230]] = p."Drink";
        p.lllIlIlllI[p.lllIllIlll[140]] = p."Vampyre Juvinate";
        p.lllIlIlllI[p.lllIllIlll[231]] = p."Attack";
        p.lllIlIlllI[p.lllIllIlll[232]] = p."Vampyre Juvinate";
        p.lllIlIlllI[p.lllIllIlll[235]] = p."Nav to Drezel";
        p.lllIlIlllI[p.lllIllIlll[236]] = p."Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[144]] = p."Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[237]] = p."Open";
        p.lllIlIlllI[p.lllIllIlll[238]] = p."Talk to drezel";
        p.lllIlIlllI[p.lllIllIlll[239]] = p."Drezel";
        p.lllIlIlllI[p.lllIllIlll[241]] = p."Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[150]] = p."Using key";
        p.lllIlIlllI[p.lllIllIlll[242]] = p."Temple library key";
        p.lllIlIlllI[p.lllIllIlll[243]] = p."Keyhole";
        p.lllIlIlllI[p.lllIllIlll[244]] = p."Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[245]] = p."going down trapdoor";
        p.lllIlIlllI[p.lllIllIlll[246]] = p."Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[247]] = p."Climb-down";
        p.lllIlIlllI[p.lllIllIlll[250]] = p."Search";
        p.lllIlIlllI[p.lllIllIlll[252]] = p."The sleeping seven";
        p.lllIlIlllI[p.lllIllIlll[253]] = p."Read";
        p.lllIlIlllI[p.lllIllIlll[156]] = p."Nav to boarded cave";
        p.lllIlIlllI[p.lllIllIlll[255]] = p."Hammering boards";
        p.lllIlIlllI[p.lllIllIlll[256]] = p."Wooden boards";
        p.lllIlIlllI[p.lllIllIlll[257]] = p."Wooden boards";
        p.lllIlIlllI[p.lllIllIlll[258]] = p."Cave entrance";
        p.lllIlIlllI[p.lllIllIlll[259]] = p."Wooden boards";
        p.lllIlIlllI[p.lllIllIlll[260]] = p."Cave entrance";
        p.lllIlIlllI[p.lllIllIlll[261]] = p."Enter";
        p.lllIlIlllI[p.lllIllIlll[263]] = p."nav to coffin";
        p.lllIlIlllI[p.lllIllIlll[264]] = p."Soft clay";
        p.lllIlIlllI[p.lllIllIlll[160]] = p."Coffin";
        p.lllIlIlllI[p.lllIllIlll[266]] = p."Nav to furnace";
        p.lllIlIlllI[p.lllIllIlll[267]] = p."Making staff";
        p.lllIlIlllI[p.lllIllIlll[268]] = p."Mithril bar";
        p.lllIlIlllI[p.lllIllIlll[269]] = p."Furnace";
        p.lllIlIlllI[p.lllIllIlll[270]] = p."Craft";
        p.lllIlIlllI[p.lllIllIlll[272]] = p."Cosmic rune";
        p.lllIlIlllI[p.lllIllIlll[273]] = p."Enchanting rod";
        p.lllIlIlllI[p.lllIllIlll[276]] = p."Nav to well";
        p.lllIlIlllI[p.lllIllIlll[277]] = p."Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[162]] = p."Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[278]] = p."Open";
        p.lllIlIlllI[p.lllIllIlll[282]] = p."Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[283]] = p."Nav to pub";
        p.lllIlIlllI[p.lllIllIlll[284]] = p."Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[166]] = p."Open";
        p.lllIlIlllI[p.lllIllIlll[285]] = p."Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[286]] = p."Climb-down";
        p.lllIlIlllI[p.lllIllIlll[287]] = p."Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[288]] = p."Talking to veliaf";
        p.lllIlIlllI[p.lllIllIlll[173]] = p."Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[290]] = p."Okay, thanks.";
        p.lllIlIlllI[p.lllIllIlll[291]] = p."Hammer";
        p.lllIlIlllI[p.lllIllIlll[292]] = p."Steel bar";
        p.lllIlIlllI[p.lllIllIlll[293]] = p."Coal";
        p.lllIlIlllI[p.lllIllIlll[294]] = p."Tinderbox";
        p.lllIlIlllI[p.lllIllIlll[295]] = p."Crate";
        p.lllIlIlllI[p.lllIllIlll[296]] = p."Plank";
        p.lllIlIlllI[p.lllIllIlll[297]] = p."Hammer";
        p.lllIlIlllI[p.lllIllIlll[298]] = p."Spade";
        p.lllIlIlllI[p.lllIllIlll[177]] = p."Swamp paste";
        p.lllIlIlllI[p.lllIllIlll[299]] = p."Nav to bank";
        p.lllIlIlllI[p.lllIllIlll[300]] = p."Handling banking";
        p.lllIlIlllI[p.lllIllIlll[302]] = p."Nav to burgh bank";
        p.lllIlIlllI[p.lllIllIlll[303]] = p."Bank";
        p.lllIlIlllI[p.lllIllIlll[304]] = p."Handling banking";
        p.lllIlIlllI[p.lllIllIlll[305]] = p."Nav to bank";
        p.lllIlIlllI[p.lllIllIlll[306]] = p."Break";
        p.lllIlIlllI[p.lllIllIlll[307]] = p."Bank";
        p.lllIlIlllI[p.lllIllIlll[308]] = p."Handling banking";
        p.lllIlIlllI[p.lllIllIlll[178]] = p."Crate";
        p.lllIlIlllI[p.lllIllIlll[309]] = p."Nav to bank";
        p.lllIlIlllI[p.lllIllIlll[310]] = p."Break";
        p.lllIlIlllI[p.lllIllIlll[311]] = p."Bank";
        p.lllIlIlllI[p.lllIllIlll[312]] = p."Handling banking";
        p.lllIlIlllI[p.lllIllIlll[313]] = p."Crate";
        p.lllIlIlllI[p.lllIllIlll[314]] = p."Crate";
        p.lllIlIlllI[p.lllIllIlll[315]] = p."Bronze axe";
        p.lllIlIlllI[p.lllIllIlll[316]] = p."Tinderbox";
        p.lllIlIlllI[p.lllIllIlll[317]] = p."Bronze axe";
        p.lllIlIlllI[p.lllIllIlll[184]] = p."Bronze axe";
        p.lllIlIlllI[p.lllIllIlll[318]] = p."Crate";
        p.lllIlIlllI[p.lllIllIlll[319]] = p."Tinderbox";
        p.lllIlIlllI[p.lllIllIlll[320]] = p."Tinderbox";
        p.lllIlIlllI[p.lllIllIlll[321]] = p."Crate";
        p.lllIlIlllI[p.lllIllIlll[322]] = p."Crate";
        p.lllIlIlllI[p.lllIllIlll[323]] = p."Crate";
        p.lllIlIlllI[p.lllIllIlll[324]] = p."Bronze axe";
        p.lllIlIlllI[p.lllIllIlll[325]] = p."Tinderbox";
        p.lllIlIlllI[p.lllIllIlll[326]] = p."Crate";
        p.lllIlIlllI[p.lllIllIlll[185]] = p."Crate";
        p.lllIlIlllI[p.lllIllIlll[327]] = p."Search";
        p.lllIlIlllI[p.lllIllIlll[328]] = p."should return";
        p.lllIlIlllI[p.lllIllIlll[347]] = p."ring of wealth (";
        p.lllIlIlllI[p.lllIllIlll[348]] = p."Bank Booth";
        p.lllIlIlllI[p.lllIllIlll[349]] = p."Inspect";
        p.lllIlIlllI[p.lllIllIlll[370]] = p."Yes.";
        p.lllIlIlllI[p.lllIllIlll[371]] = p."I want to join your organisation.";
        p.lllIlIlllI[p.lllIllIlll[372]] = p."Ok, tell me this information you have to impart.";
        p.lllIlIlllI[p.lllIllIlll[373]] = p."Can you tell me about the job?";
        p.lllIlIlllI[p.lllIllIlll[194]] = p."Ok, I'll do the job.";
        p.lllIlIlllI[p.lllIllIlll[374]] = p."Are there any 'out of the way' places here?";
        p.lllIlIlllI[p.lllIllIlll[375]] = p."I'd like to help fix up the town.";
        p.lllIlIlllI[p.lllIllIlll[376]] = p."What should I do now?";
        p.lllIlIlllI[p.lllIllIlll[377]] = p."Yes, I'll fill the crate.";
        p.lllIlIlllI[p.lllIllIlll[378]] = p."Yes, I'll offer all of this food item in my inventory to Ivan.";
        p.lllIlIlllI[p.lllIllIlll[379]] = p."Veliaf told me about Ivandis.";
        p.lllIlIlllI[p.lllIllIlll[380]] = p."Is there somewhere that I might get more information on Ivandis?";
        p.lllIlIlllI[p.lllIllIlll[381]] = p."The lives of those pitiful few left in Morytania could rest on this!";
        p.lllIlIlllI[p.lllIllIlll[382]] = p."";
    }

    private static boolean llIIlIIlIllll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aH() {
        int n2;
        if (p.llIIlIIlIllll(Inventory.contains((int[])f.aR) ? 1 : 0)) {
            int[] nArray = new int[lllIllIlll[0]];
            nArray[p.lllIllIlll[1]] = lllIllIlll[56];
            if (p.llIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIllIlll[0]];
                nArray2[p.lllIllIlll[1]] = lllIllIlll[58];
                if (p.llIIlIIlIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lllIllIlll[0]];
                    nArray3[p.lllIllIlll[1]] = lllIllIlll[61];
                    if (p.llIIlIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        int[] nArray4 = new int[lllIllIlll[0]];
                        nArray4[p.lllIllIlll[1]] = lllIllIlll[24];
                        if (p.llIIlIIlIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lllIllIlll[0]];
                            nArray5[p.lllIllIlll[1]] = lllIllIlll[63];
                            if (p.llIIlIIlIllll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                n2 = lllIllIlll[0];
                                0;
                                if (((0x59 ^ 0x4D) & ~(0x15 ^ 1)) > -1) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lllIllIlll[1];
        return n2 != 0;
    }

    private static boolean llIIlIIllIlIl(int n2) {
        return n2 > 0;
    }

    private static void aL() {
        if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cB), lllIllIlll[9])) {
            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[302]];
            Movement.walkTo((WorldPoint)cB);
            0;
            Time.sleepTicks((int)lllIllIlll[0]);
            0;
        }
        if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cB), lllIllIlll[9])) {
            if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                int[] nArray = new int[lllIllIlll[0]];
                nArray[p.lllIllIlll[1]] = lllIllIlll[168];
                TileObjects.getNearest((int[])nArray).interact(lllIlIlllI[lllIllIlll[303]]);
                Time.sleepTicks((int)lllIllIlll[4]);
                0;
            }
            if (p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0) && p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[304]];
                if (p.llIIlIIllIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllIllIlll[8]);
                    0;
                }
                a.a(lllIllIlll[24], lllIllIlll[3]);
                a.a(lllIllIlll[56], lllIllIlll[9]);
                a.a(lllIllIlll[58], lllIllIlll[0]);
                a.a(lllIllIlll[61], lllIllIlll[0]);
                a.a(lllIllIlll[18], lllIllIlll[0]);
                a.a(lllIllIlll[63], lllIllIlll[0]);
                a.a(lllIllIlll[34], lllIllIlll[9]);
                a.a(lllIllIlll[33], lllIllIlll[9]);
                a.a(lllIllIlll[10], lllIllIlll[9]);
                a.a(lllIllIlll[17], lllIllIlll[4]);
                a.a(lllIllIlll[208], lllIllIlll[0]);
                a.a(lllIllIlll[210], lllIllIlll[0]);
                int[] nArray = new int[lllIllIlll[0]];
                nArray[p.lllIllIlll[1]] = lllIllIlll[18];
                if (p.llIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    a.a(lllIllIlll[301], lllIllIlll[0]);
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aJ() {
        int n2;
        int[] nArray = new int[lllIllIlll[0]];
        nArray[p.lllIllIlll[1]] = lllIllIlll[25];
        if (p.llIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            String[] stringArray = new String[lllIllIlll[0]];
            stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[295]];
            if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIllIlll[0]];
                stringArray2[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[296]];
                if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lllIllIlll[0]];
                    stringArray3[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[297]];
                    if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        String[] stringArray4 = new String[lllIllIlll[0]];
                        stringArray4[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[298]];
                        if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                            String[] stringArray5 = new String[lllIllIlll[0]];
                            stringArray5[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[177]];
                            if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                int[] nArray2 = new int[lllIllIlll[0]];
                                nArray2[p.lllIllIlll[1]] = lllIllIlll[19];
                                if (p.llIIlIIlIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[lllIllIlll[0]];
                                    nArray3[p.lllIllIlll[1]] = lllIllIlll[34];
                                    if (p.llIIlIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                        n2 = lllIllIlll[0];
                                        0;
                                        if (null == null) return n2 != 0;
                                        return ((34 + 83 - 31 + 90 ^ 43 + 64 - -55 + 8) & (0x6A ^ 0x5C ^ (0x53 ^ 0x7F) ^ -1)) != 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lllIllIlll[1];
        return n2 != 0;
    }

    private static void ae() {
        block105: {
            d var26;
            block104: {
                Object var7;
                block103: {
                    block102: {
                        block101: {
                            block100: {
                                block99: {
                                    block98: {
                                        block97: {
                                            block96: {
                                                block95: {
                                                    block94: {
                                                        block93: {
                                                            block92: {
                                                                block91: {
                                                                    block90: {
                                                                        block89: {
                                                                            block88: {
                                                                                block87: {
                                                                                    block86: {
                                                                                        block85: {
                                                                                            block84: {
                                                                                                block83: {
                                                                                                    block82: {
                                                                                                        block81: {
                                                                                                            block80: {
                                                                                                                block79: {
                                                                                                                    block78: {
                                                                                                                        block77: {
                                                                                                                            block76: {
                                                                                                                                block75: {
                                                                                                                                    block74: {
                                                                                                                                        block73: {
                                                                                                                                            block72: {
                                                                                                                                                block71: {
                                                                                                                                                    block70: {
                                                                                                                                                        int[] nArray = new int[lllIllIlll[0]];
                                                                                                                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[14];
                                                                                                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block70;
                                                                                                                                                        int[] nArray2 = new int[lllIllIlll[0]];
                                                                                                                                                        nArray2[p.lllIllIlll[1]] = lllIllIlll[14];
                                                                                                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray2) ? 1 : 0)) break block71;
                                                                                                                                                        int[] nArray3 = new int[lllIllIlll[0]];
                                                                                                                                                        nArray3[p.lllIllIlll[1]] = lllIllIlll[14];
                                                                                                                                                        if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray3).getQuantity(), lllIllIlll[15])) break block71;
                                                                                                                                                    }
                                                                                                                                                    var7 = new d(lllIllIlll[14], lllIllIlll[15], lllIllIlll[329]);
                                                                                                                                                    bu.add((d)var7);
                                                                                                                                                    0;
                                                                                                                                                }
                                                                                                                                                int[] nArray = new int[lllIllIlll[0]];
                                                                                                                                                nArray[p.lllIllIlll[1]] = lllIllIlll[16];
                                                                                                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block72;
                                                                                                                                                int[] nArray4 = new int[lllIllIlll[0]];
                                                                                                                                                nArray4[p.lllIllIlll[1]] = lllIllIlll[16];
                                                                                                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray4) ? 1 : 0)) break block73;
                                                                                                                                                int[] nArray5 = new int[lllIllIlll[0]];
                                                                                                                                                nArray5[p.lllIllIlll[1]] = lllIllIlll[16];
                                                                                                                                                if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray5).getQuantity(), lllIllIlll[15])) break block73;
                                                                                                                                            }
                                                                                                                                            var7 = new d(lllIllIlll[16], lllIllIlll[15], lllIllIlll[12]);
                                                                                                                                            bu.add((d)var7);
                                                                                                                                            0;
                                                                                                                                        }
                                                                                                                                        int[] nArray = new int[lllIllIlll[0]];
                                                                                                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[40];
                                                                                                                                        if (p.llIIlIIllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                                            var7 = new d(lllIllIlll[40], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                                            bu.add((d)var7);
                                                                                                                                            0;
                                                                                                                                        }
                                                                                                                                        int[] nArray6 = new int[lllIllIlll[0]];
                                                                                                                                        nArray6[p.lllIllIlll[1]] = lllIllIlll[41];
                                                                                                                                        if (p.llIIlIIllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                                                                                                                            var7 = new d(lllIllIlll[41], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                                            bu.add((d)var7);
                                                                                                                                            0;
                                                                                                                                        }
                                                                                                                                        int[] nArray7 = new int[lllIllIlll[0]];
                                                                                                                                        nArray7[p.lllIllIlll[1]] = lllIllIlll[17];
                                                                                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray7) ? 1 : 0)) break block74;
                                                                                                                                        int[] nArray8 = new int[lllIllIlll[0]];
                                                                                                                                        nArray8[p.lllIllIlll[1]] = lllIllIlll[17];
                                                                                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray8) ? 1 : 0)) break block75;
                                                                                                                                        int[] nArray9 = new int[lllIllIlll[0]];
                                                                                                                                        nArray9[p.lllIllIlll[1]] = lllIllIlll[17];
                                                                                                                                        if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray9).getQuantity(), lllIllIlll[7])) break block75;
                                                                                                                                    }
                                                                                                                                    var7 = new d(lllIllIlll[17], lllIllIlll[7], lllIllIlll[331]);
                                                                                                                                    bu.add((d)var7);
                                                                                                                                    0;
                                                                                                                                }
                                                                                                                                int[] nArray = new int[lllIllIlll[0]];
                                                                                                                                nArray[p.lllIllIlll[1]] = lllIllIlll[18];
                                                                                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block76;
                                                                                                                                int[] nArray10 = new int[lllIllIlll[0]];
                                                                                                                                nArray10[p.lllIllIlll[1]] = lllIllIlll[18];
                                                                                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray10) ? 1 : 0)) break block77;
                                                                                                                                int[] nArray11 = new int[lllIllIlll[0]];
                                                                                                                                nArray11[p.lllIllIlll[1]] = lllIllIlll[18];
                                                                                                                                if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray11).getQuantity(), lllIllIlll[15])) break block77;
                                                                                                                            }
                                                                                                                            var7 = new d(lllIllIlll[18], lllIllIlll[15], i.bp);
                                                                                                                            bu.add((d)var7);
                                                                                                                            0;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[lllIllIlll[0]];
                                                                                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[19];
                                                                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block78;
                                                                                                                        int[] nArray12 = new int[lllIllIlll[0]];
                                                                                                                        nArray12[p.lllIllIlll[1]] = lllIllIlll[19];
                                                                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray12) ? 1 : 0)) break block79;
                                                                                                                        int[] nArray13 = new int[lllIllIlll[0]];
                                                                                                                        nArray13[p.lllIllIlll[1]] = lllIllIlll[19];
                                                                                                                        if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray13).getQuantity(), lllIllIlll[4])) break block79;
                                                                                                                    }
                                                                                                                    var7 = new d(lllIllIlll[19], lllIllIlll[4], lllIllIlll[332]);
                                                                                                                    bu.add((d)var7);
                                                                                                                    0;
                                                                                                                }
                                                                                                                int[] nArray = new int[lllIllIlll[0]];
                                                                                                                nArray[p.lllIllIlll[1]] = lllIllIlll[47];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                    var7 = new d(lllIllIlll[47], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((d)var7);
                                                                                                                    0;
                                                                                                                }
                                                                                                                int[] nArray14 = new int[lllIllIlll[0]];
                                                                                                                nArray14[p.lllIllIlll[1]] = lllIllIlll[56];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                                                                                                    var7 = new d(lllIllIlll[56], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((d)var7);
                                                                                                                    0;
                                                                                                                }
                                                                                                                int[] nArray15 = new int[lllIllIlll[0]];
                                                                                                                nArray15[p.lllIllIlll[1]] = lllIllIlll[58];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                                                                                    var7 = new d(lllIllIlll[58], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((d)var7);
                                                                                                                    0;
                                                                                                                }
                                                                                                                int[] nArray16 = new int[lllIllIlll[0]];
                                                                                                                nArray16[p.lllIllIlll[1]] = lllIllIlll[61];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                                                                                                    var7 = new d(lllIllIlll[61], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((d)var7);
                                                                                                                    0;
                                                                                                                }
                                                                                                                int[] nArray17 = new int[lllIllIlll[0]];
                                                                                                                nArray17[p.lllIllIlll[1]] = lllIllIlll[63];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
                                                                                                                    var7 = new d(lllIllIlll[63], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((d)var7);
                                                                                                                    0;
                                                                                                                }
                                                                                                                int[] nArray18 = new int[lllIllIlll[0]];
                                                                                                                nArray18[p.lllIllIlll[1]] = lllIllIlll[51];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                                                                                                                    var7 = new d(lllIllIlll[51], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((d)var7);
                                                                                                                    0;
                                                                                                                }
                                                                                                                int[] nArray19 = new int[lllIllIlll[0]];
                                                                                                                nArray19[p.lllIllIlll[1]] = lllIllIlll[53];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                                                                                                    var7 = new d(lllIllIlll[53], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((d)var7);
                                                                                                                    0;
                                                                                                                }
                                                                                                                int[] nArray20 = new int[lllIllIlll[0]];
                                                                                                                nArray20[p.lllIllIlll[1]] = lllIllIlll[55];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                                                                                                    var7 = new d(lllIllIlll[55], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((d)var7);
                                                                                                                    0;
                                                                                                                }
                                                                                                                int[] nArray21 = new int[lllIllIlll[0]];
                                                                                                                nArray21[p.lllIllIlll[1]] = lllIllIlll[49];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray21) ? 1 : 0)) {
                                                                                                                    var7 = new d(lllIllIlll[49], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((d)var7);
                                                                                                                    0;
                                                                                                                }
                                                                                                                int[] nArray22 = new int[lllIllIlll[0]];
                                                                                                                nArray22[p.lllIllIlll[1]] = lllIllIlll[36];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                                                                                                    var7 = new d(lllIllIlll[36], lllIllIlll[0], lllIllIlll[333]);
                                                                                                                    bu.add((d)var7);
                                                                                                                    0;
                                                                                                                }
                                                                                                                int[] nArray23 = new int[lllIllIlll[0]];
                                                                                                                nArray23[p.lllIllIlll[1]] = lllIllIlll[20];
                                                                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray23) ? 1 : 0)) break block80;
                                                                                                                int[] nArray24 = new int[lllIllIlll[0]];
                                                                                                                nArray24[p.lllIllIlll[1]] = lllIllIlll[20];
                                                                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray24) ? 1 : 0)) break block81;
                                                                                                                int[] nArray25 = new int[lllIllIlll[0]];
                                                                                                                nArray25[p.lllIllIlll[1]] = lllIllIlll[20];
                                                                                                                if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray25).getQuantity(), lllIllIlll[15])) break block81;
                                                                                                            }
                                                                                                            var7 = new d(lllIllIlll[20], lllIllIlll[15], lllIllIlll[329]);
                                                                                                            bu.add((d)var7);
                                                                                                            0;
                                                                                                        }
                                                                                                        int[] nArray = new int[lllIllIlll[0]];
                                                                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[44];
                                                                                                        if (p.llIIlIIllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                                            var7 = new d(lllIllIlll[44], lllIllIlll[0], lllIllIlll[329]);
                                                                                                            bu.add((d)var7);
                                                                                                            0;
                                                                                                        }
                                                                                                        int[] nArray26 = new int[lllIllIlll[0]];
                                                                                                        nArray26[p.lllIllIlll[1]] = lllIllIlll[46];
                                                                                                        if (p.llIIlIIllIIIl(Bank.contains((int[])nArray26) ? 1 : 0)) {
                                                                                                            var7 = new d(lllIllIlll[46], lllIllIlll[0], lllIllIlll[329]);
                                                                                                            bu.add((d)var7);
                                                                                                            0;
                                                                                                        }
                                                                                                        int[] nArray27 = new int[lllIllIlll[0]];
                                                                                                        nArray27[p.lllIllIlll[1]] = lllIllIlll[39];
                                                                                                        if (p.llIIlIIllIIIl(Bank.contains((int[])nArray27) ? 1 : 0)) {
                                                                                                            var7 = new d(lllIllIlll[39], lllIllIlll[0], lllIllIlll[330]);
                                                                                                            bu.add((d)var7);
                                                                                                            0;
                                                                                                        }
                                                                                                        int[] nArray28 = new int[lllIllIlll[0]];
                                                                                                        nArray28[p.lllIllIlll[1]] = lllIllIlll[21];
                                                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray28) ? 1 : 0)) break block82;
                                                                                                        int[] nArray29 = new int[lllIllIlll[0]];
                                                                                                        nArray29[p.lllIllIlll[1]] = lllIllIlll[21];
                                                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray29) ? 1 : 0)) break block83;
                                                                                                        int[] nArray30 = new int[lllIllIlll[0]];
                                                                                                        nArray30[p.lllIllIlll[1]] = lllIllIlll[21];
                                                                                                        if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray30).getQuantity(), lllIllIlll[15])) break block83;
                                                                                                    }
                                                                                                    var7 = new d(lllIllIlll[21], lllIllIlll[15], lllIllIlll[334]);
                                                                                                    bu.add((d)var7);
                                                                                                    0;
                                                                                                }
                                                                                                int[] nArray = new int[lllIllIlll[0]];
                                                                                                nArray[p.lllIllIlll[1]] = lllIllIlll[24];
                                                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block84;
                                                                                                int[] nArray31 = new int[lllIllIlll[0]];
                                                                                                nArray31[p.lllIllIlll[1]] = lllIllIlll[24];
                                                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray31) ? 1 : 0)) break block85;
                                                                                                int[] nArray32 = new int[lllIllIlll[0]];
                                                                                                nArray32[p.lllIllIlll[1]] = lllIllIlll[24];
                                                                                                if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray32).getQuantity(), lllIllIlll[23])) break block85;
                                                                                            }
                                                                                            var7 = new d(lllIllIlll[24], lllIllIlll[23], lllIllIlll[335]);
                                                                                            bu.add((d)var7);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray = new int[lllIllIlll[0]];
                                                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[25];
                                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block86;
                                                                                        int[] nArray33 = new int[lllIllIlll[0]];
                                                                                        nArray33[p.lllIllIlll[1]] = lllIllIlll[25];
                                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray33) ? 1 : 0)) break block87;
                                                                                        int[] nArray34 = new int[lllIllIlll[0]];
                                                                                        nArray34[p.lllIllIlll[1]] = lllIllIlll[25];
                                                                                        if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray34).getQuantity(), lllIllIlll[26])) break block87;
                                                                                    }
                                                                                    var7 = new d(lllIllIlll[25], lllIllIlll[26], lllIllIlll[162]);
                                                                                    bu.add((d)var7);
                                                                                    0;
                                                                                }
                                                                                int[] nArray = new int[lllIllIlll[0]];
                                                                                nArray[p.lllIllIlll[1]] = lllIllIlll[27];
                                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block88;
                                                                                int[] nArray35 = new int[lllIllIlll[0]];
                                                                                nArray35[p.lllIllIlll[1]] = lllIllIlll[27];
                                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray35) ? 1 : 0)) break block89;
                                                                                int[] nArray36 = new int[lllIllIlll[0]];
                                                                                nArray36[p.lllIllIlll[1]] = lllIllIlll[27];
                                                                                if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray36).getQuantity(), lllIllIlll[9])) break block89;
                                                                            }
                                                                            var7 = new d(lllIllIlll[27], lllIllIlll[9], lllIllIlll[336]);
                                                                            bu.add((d)var7);
                                                                            0;
                                                                        }
                                                                        int[] nArray = new int[lllIllIlll[0]];
                                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[28];
                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block90;
                                                                        int[] nArray37 = new int[lllIllIlll[0]];
                                                                        nArray37[p.lllIllIlll[1]] = lllIllIlll[28];
                                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray37) ? 1 : 0)) break block91;
                                                                        int[] nArray38 = new int[lllIllIlll[0]];
                                                                        nArray38[p.lllIllIlll[1]] = lllIllIlll[28];
                                                                        if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray38).getQuantity(), lllIllIlll[15])) break block91;
                                                                    }
                                                                    var7 = new d(lllIllIlll[28], lllIllIlll[15], lllIllIlll[337]);
                                                                    bu.add((d)var7);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[lllIllIlll[0]];
                                                                nArray[p.lllIllIlll[1]] = lllIllIlll[29];
                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block92;
                                                                int[] nArray39 = new int[lllIllIlll[0]];
                                                                nArray39[p.lllIllIlll[1]] = lllIllIlll[29];
                                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray39) ? 1 : 0)) break block93;
                                                                int[] nArray40 = new int[lllIllIlll[0]];
                                                                nArray40[p.lllIllIlll[1]] = lllIllIlll[29];
                                                                if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray40).getQuantity(), lllIllIlll[9])) break block93;
                                                            }
                                                            var7 = new d(lllIllIlll[29], lllIllIlll[9], lllIllIlll[337]);
                                                            bu.add((d)var7);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lllIllIlll[0]];
                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[30];
                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block94;
                                                        int[] nArray41 = new int[lllIllIlll[0]];
                                                        nArray41[p.lllIllIlll[1]] = lllIllIlll[30];
                                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray41) ? 1 : 0)) break block95;
                                                        int[] nArray42 = new int[lllIllIlll[0]];
                                                        nArray42[p.lllIllIlll[1]] = lllIllIlll[30];
                                                        if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray42).getQuantity(), lllIllIlll[31])) break block95;
                                                    }
                                                    var7 = new d(lllIllIlll[30], lllIllIlll[31], lllIllIlll[12]);
                                                    bu.add((d)var7);
                                                    0;
                                                }
                                                int[] nArray = new int[lllIllIlll[0]];
                                                nArray[p.lllIllIlll[1]] = lllIllIlll[32];
                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block96;
                                                int[] nArray43 = new int[lllIllIlll[0]];
                                                nArray43[p.lllIllIlll[1]] = lllIllIlll[32];
                                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray43) ? 1 : 0)) break block97;
                                                int[] nArray44 = new int[lllIllIlll[0]];
                                                nArray44[p.lllIllIlll[1]] = lllIllIlll[32];
                                                if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray44).getQuantity(), lllIllIlll[15])) break block97;
                                            }
                                            var7 = new d(lllIllIlll[32], lllIllIlll[15], lllIllIlll[329]);
                                            bu.add((d)var7);
                                            0;
                                        }
                                        int[] nArray = new int[lllIllIlll[0]];
                                        nArray[p.lllIllIlll[1]] = lllIllIlll[22];
                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block98;
                                        int[] nArray45 = new int[lllIllIlll[0]];
                                        nArray45[p.lllIllIlll[1]] = lllIllIlll[22];
                                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray45) ? 1 : 0)) break block99;
                                        int[] nArray46 = new int[lllIllIlll[0]];
                                        nArray46[p.lllIllIlll[1]] = lllIllIlll[22];
                                        if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray46).getQuantity(), lllIllIlll[23])) break block99;
                                    }
                                    var7 = new d(lllIllIlll[22], lllIllIlll[71], e.c(lllIllIlll[338], lllIllIlll[339]));
                                    bu.add((d)var7);
                                    0;
                                }
                                int[] nArray = new int[lllIllIlll[0]];
                                nArray[p.lllIllIlll[1]] = lllIllIlll[33];
                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block100;
                                int[] nArray47 = new int[lllIllIlll[0]];
                                nArray47[p.lllIllIlll[1]] = lllIllIlll[33];
                                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray47) ? 1 : 0)) break block101;
                                int[] nArray48 = new int[lllIllIlll[0]];
                                nArray48[p.lllIllIlll[1]] = lllIllIlll[33];
                                if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray48).getQuantity(), lllIllIlll[15])) break block101;
                            }
                            var7 = new d(lllIllIlll[33], lllIllIlll[15], e.c(lllIllIlll[340], lllIllIlll[341]));
                            bu.add((d)var7);
                            0;
                        }
                        int[] nArray = new int[lllIllIlll[0]];
                        nArray[p.lllIllIlll[1]] = lllIllIlll[34];
                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block102;
                        int[] nArray49 = new int[lllIllIlll[0]];
                        nArray49[p.lllIllIlll[1]] = lllIllIlll[34];
                        if (!p.llIIlIIlIllll(Bank.contains((int[])nArray49) ? 1 : 0)) break block103;
                        int[] nArray50 = new int[lllIllIlll[0]];
                        nArray50[p.lllIllIlll[1]] = lllIllIlll[34];
                        if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray50).getQuantity(), lllIllIlll[9])) break block103;
                    }
                    var7 = new d(lllIllIlll[34], lllIllIlll[9], e.c(lllIllIlll[342], lllIllIlll[343]));
                    bu.add((d)var7);
                    0;
                }
                if (p.llIIlIIllIIIl(Bank.contains((Predicate)(var7 = item -> item.getName().toLowerCase().contains(lllIlIlllI[lllIllIlll[347]]))) ? 1 : 0)) {
                    var26 = new d(lllIllIlll[344], lllIllIlll[9], lllIllIlll[345]);
                    bu.add(var26);
                    0;
                }
                int[] nArray = new int[lllIllIlll[0]];
                nArray[p.lllIllIlll[1]] = lllIllIlll[10];
                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block104;
                int[] nArray51 = new int[lllIllIlll[0]];
                nArray51[p.lllIllIlll[1]] = lllIllIlll[10];
                if (!p.llIIlIIlIllll(Bank.contains((int[])nArray51) ? 1 : 0)) break block105;
                int[] nArray52 = new int[lllIllIlll[0]];
                nArray52[p.lllIllIlll[1]] = lllIllIlll[10];
                if (!p.llIIlIIllIIII(Bank.getFirst((int[])nArray52).getQuantity(), lllIllIlll[72])) break block105;
            }
            var26 = new d(lllIllIlll[10], lllIllIlll[72], lllIllIlll[346]);
            bu.add(var26);
            0;
        }
    }

    private static boolean llIIlIIlllIII(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void aN() {
        block24: {
            block25: {
                void var5;
                BankLocation bankLocation = BankLocation.VARROCK_WEST_BANK;
                if (p.llIIlIIllIIll(bankLocation) && p.llIIlIIllIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[309]];
                    if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[23])) {
                        int[] nArray = new int[lllIllIlll[0]];
                        nArray[p.lllIllIlll[1]] = lllIllIlll[10];
                        Inventory.getFirst((int[])nArray).interact(lllIlIlllI[lllIllIlll[310]]);
                        Time.sleepTicks((int)lllIllIlll[9]);
                        0;
                    }
                    a.a((BankLocation)var5);
                }
                if (!p.llIIlIIllIIll(var5) || !p.llIIlIIlIllll(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block24;
                if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIlll[12]);
                    0;
                    int[] nArray = new int[lllIllIlll[0]];
                    nArray[p.lllIllIlll[1]] = lllIllIlll[168];
                    if (p.llIIlIIllIIll(TileObjects.getNearest((int[])nArray)) && p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cB), lllIllIlll[15])) {
                        int[] nArray2 = new int[lllIllIlll[0]];
                        nArray2[p.lllIllIlll[1]] = lllIllIlll[168];
                        TileObjects.getNearest((int[])nArray2).interact(lllIlIlllI[lllIllIlll[311]]);
                        Time.sleepTicks((int)lllIllIlll[4]);
                        0;
                    }
                }
                if (p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[312]];
                    if (p.llIIlIIllIlIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lllIllIlll[8]);
                        0;
                    }
                    if (p.llIIlIIllIIIl(cN ? 1 : 0)) {
                        Bank.withdraw((String)lllIlIlllI[lllIllIlll[313]], (int)lllIllIlll[0], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        a.a(lllIllIlll[28], lllIllIlll[15]);
                        a.a(lllIllIlll[29], lllIllIlll[7]);
                        a.a(lllIllIlll[14], lllIllIlll[15]);
                        if (p.llIIlIIlIllll(cL ? 1 : 0)) {
                            a.a(lllIllIlll[16], lllIllIlll[15]);
                        }
                    }
                }
                String[] stringArray = new String[lllIllIlll[0]];
                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[314]];
                if (!p.llIIlIIlIllll(Inventory.contains((String[])stringArray) ? 1 : 0) || !p.llIIlIIllIIIl(cN ? 1 : 0)) break block24;
                String[] stringArray2 = new String[lllIllIlll[0]];
                stringArray2[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[315]];
                if (!p.llIIlIIllIIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block25;
                String[] stringArray3 = new String[lllIllIlll[0]];
                stringArray3[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[316]];
                if (!p.llIIlIIllIIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) break block25;
                int[] nArray = new int[lllIllIlll[0]];
                nArray[p.lllIllIlll[1]] = lllIllIlll[14];
                if (!p.llIIlIIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                int[] nArray3 = new int[lllIllIlll[0]];
                nArray3[p.lllIllIlll[1]] = lllIllIlll[16];
                if (!p.llIIlIIlIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block24;
            }
            Bank.close();
            if (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Time.sleepTicks((int)lllIllIlll[8]);
            0;
            if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[lllIllIlll[0]];
                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[317]];
                if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray4 = new String[lllIllIlll[0]];
                    stringArray4[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[184]];
                    String[] stringArray5 = new String[lllIllIlll[0]];
                    stringArray5[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[318]];
                    Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((String[])stringArray5));
                    Time.sleepTicks((int)lllIllIlll[8]);
                    0;
                    while (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bQ);
                        Time.sleepTicks((int)lllIllIlll[0]);
                        0;
                        0;
                        if (-(0x59 ^ 0x4D ^ (8 ^ 0x18)) < 0) continue;
                        return;
                    }
                }
                String[] stringArray6 = new String[lllIllIlll[0]];
                stringArray6[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[319]];
                if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                    String[] stringArray7 = new String[lllIllIlll[0]];
                    stringArray7[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[320]];
                    String[] stringArray8 = new String[lllIllIlll[0]];
                    stringArray8[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[321]];
                    Inventory.getFirst((String[])stringArray7).useOn(Inventory.getFirst((String[])stringArray8));
                    Time.sleepTicks((int)lllIllIlll[8]);
                    0;
                    while (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bQ);
                        Time.sleepTicks((int)lllIllIlll[0]);
                        0;
                        0;
                        
                        return;
                    }
                }
                if (p.llIIlIIlIllll(cL ? 1 : 0)) {
                    int[] nArray = new int[lllIllIlll[0]];
                    nArray[p.lllIllIlll[1]] = lllIllIlll[14];
                    String[] stringArray9 = new String[lllIllIlll[0]];
                    stringArray9[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[322]];
                    Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((String[])stringArray9));
                    Time.sleepTicks((int)lllIllIlll[8]);
                    0;
                    while (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bQ);
                        Time.sleepTicks((int)lllIllIlll[0]);
                        0;
                        0;
                        
                        return;
                    }
                    int[] nArray4 = new int[lllIllIlll[0]];
                    nArray4[p.lllIllIlll[1]] = lllIllIlll[16];
                    String[] stringArray10 = new String[lllIllIlll[0]];
                    stringArray10[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[323]];
                    Inventory.getFirst((int[])nArray4).useOn(Inventory.getFirst((String[])stringArray10));
                    Time.sleepTicks((int)lllIllIlll[8]);
                    0;
                    while (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bQ);
                        Time.sleepTicks((int)lllIllIlll[0]);
                        0;
                        0;
                        if ((53 + 46 - -38 + 41 ^ 130 + 81 - 108 + 79) >= 0) continue;
                        return;
                    }
                }
                String[] stringArray11 = new String[lllIllIlll[0]];
                stringArray11[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[324]];
                if (p.llIIlIIllIIIl(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                    cL = lllIllIlll[0];
                }
                String[] stringArray12 = new String[lllIllIlll[0]];
                stringArray12[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[325]];
                if (p.llIIlIIllIIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    cM = lllIllIlll[0];
                }
                String[] stringArray13 = new String[lllIllIlll[0]];
                stringArray13[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[326]];
                if (p.llIIlIIlIllll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                    String[] stringArray14 = new String[lllIllIlll[0]];
                    stringArray14[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[185]];
                    Inventory.getFirst((String[])stringArray14).interact(lllIlIlllI[lllIllIlll[327]]);
                    Time.sleepTicks((int)lllIllIlll[8]);
                    0;
                    Widget var21 = Widgets.get((int)lllIllIlll[308], (int)lllIllIlll[0]);
                    if (p.llIIlIIllIIll(var21) && p.llIIlIIlIllll(var21.getText().contains(lllIlIlllI[lllIllIlll[328]]) ? 1 : 0)) {
                        cN = lllIllIlll[0];
                    }
                }
            }
            g.a(bQ);
        }
    }

    private static boolean llIIlIIllIlII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String U() {
        return h;
    }

    private static boolean llIIlIIllIllI(int n2, int n3) {
        return n2 == n3;
    }
}

