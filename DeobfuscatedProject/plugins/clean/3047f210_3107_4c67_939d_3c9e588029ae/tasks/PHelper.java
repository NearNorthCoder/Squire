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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.YHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ZHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.QHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.SHelper;
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

public class PHelper
implements S {
    static  int cK;
    static  boolean cl;
    static  boolean cL;
    public static  String cm;
    public static  WorldPoint cD;
    public static  WorldPoint cn;
    static  WorldArea cG;
    public static  String h;
    public static  boolean bs;
    public static  WorldPoint cA;
    static  String[] bQ;
    public static  List<d> bu;
    public static  WorldPoint cF;
    static  int cJ;
    static  WorldArea cH;
    public static  WorldPoint cC;
    static  int cI;
    
    public static  WorldPoint cE;
    public static  WorldPoint cz;
    public static  WorldPoint cB;
    static  int ck;
    static  boolean cN;
    public static  WorldPoint cy;
    static  boolean cM;

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
        void var1;
        BankLocation bankLocation = BankLocation.getNearest();
        if (p.llIIlIIllIIll(bankLocation) && p.llIIlIIllIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[299]];
            a.a(bankLocation);
        }
        if (p.llIIlIIllIIll(var1) && p.llIIlIIlIllll(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIlll[12]);

            }
            if (p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[300]];
                if (p.llIIlIIllIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllIllIlll[8]);

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
        void var2;
        BankLocation bankLocation = BankLocation.getNearest();
        if (p.llIIlIIllIIll(bankLocation) && p.llIIlIIllIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[305]];
            if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[23])) {
                int[] nArray = new int[lllIllIlll[0]];
                nArray[p.lllIllIlll[1]] = lllIllIlll[10];
                Inventory.getFirst((int[])nArray).interact(lllIlIlllI[lllIllIlll[306]]);
                Time.sleepTicks((int)lllIllIlll[9]);

            }
            a.a((BankLocation)var2);
        }
        if (p.llIIlIIllIIll(var2) && p.llIIlIIlIllll(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIlll[12]);

                int[] nArray = new int[lllIllIlll[0]];
                nArray[p.lllIllIlll[1]] = lllIllIlll[168];
                if (p.llIIlIIllIIll(TileObjects.getNearest((int[])nArray)) && p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cB), lllIllIlll[15])) {
                    int[] nArray2 = new int[lllIllIlll[0]];
                    nArray2[p.lllIllIlll[1]] = lllIllIlll[168];
                    TileObjects.getNearest((int[])nArray2).interact(lllIlIlllI[lllIllIlll[307]]);
                    Time.sleepTicks((int)lllIllIlll[4]);

                }
            }
            if (p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[308]];
                if (p.llIIlIIllIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllIllIlll[8]);

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

        return String.valueOf(var3);
    }

    private static boolean llIIlIIllIIII(int n2, int n3) {
        return n2 < n3;
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

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= (0x67 ^ 4 ^ (0x53 ^ 0x34))) {
            return (0xE8 ^ 0xA7 ^ (0x7A ^ 0x65)) & (0xD ^ 0x43 ^ (0x5D ^ 0x43) ^ -1);
        }
        return lllIllIlll[89];
    }

    public static void aF() {
        block217: {
            block242: {
                block244: {
                    block243: {
                        Object var4;
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
                                                                                                                        var4 = BankLocation.getNearest();
                                                                                                                        if (p.llIIlIIllIIll(var4) && p.llIIlIIllIIIl(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                                            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[9]];
                                                                                                                            if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(q.cn), lllIllIlll[9])) {
                                                                                                                                int[] nArray = new int[lllIllIlll[0]];
                                                                                                                                nArray[p.lllIllIlll[1]] = lllIllIlll[10];
                                                                                                                                if (p.llIIlIIlIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                                    int[] nArray2 = new int[lllIllIlll[0]];
                                                                                                                                    nArray2[p.lllIllIlll[1]] = lllIllIlll[10];
                                                                                                                                    Inventory.getFirst((int[])nArray2).interact(lllIlIlllI[lllIllIlll[11]]);
                                                                                                                                    Time.sleepTicks((int)lllIllIlll[9]);

                                                                                                                                }
                                                                                                                            }
                                                                                                                            a.a((BankLocation)var4);
                                                                                                                        }
                                                                                                                        if (!p.llIIlIIllIIll(var4) || !p.llIIlIIlIllll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block218;
                                                                                                                        if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                                                                                                                            a.a();
                                                                                                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIlll[12]);

                                                                                                                        }
                                                                                                                        if (!p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0)) break block218;
                                                                                                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[13]];
                                                                                                                        if (p.llIIlIIllIlIl(Inventory.getAll().size())) {
                                                                                                                            Bank.depositInventory();
                                                                                                                            Time.sleepTicks((int)lllIllIlll[8]);

                                                                                                                        }
                                                                                                                        if (p.llIIlIIllIlIl(Equipment.getAll().size()) && p.llIIlIIllIIII(cI, lllIllIlll[0])) {
                                                                                                                            Bank.depositEquipment();
                                                                                                                            cI += lllIllIlll[0];
                                                                                                                            Time.sleepTicks((int)lllIllIlll[4]);

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

                                        }
                                        e.l(lllIllIlll[36]);
                                        e.l(lllIllIlll[19]);
                                        Time.sleepTicks((int)lllIllIlll[4]);

                                    }
                                    if (p.llIIlIIlIllll(p.aO() ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[31]];
                                        if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepTicks((int)lllIllIlll[11]);

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

                                }
                                if (p.llIIlIIlIllll(p.aP() ? 1 : 0) && p.llIIlIIlIllll(p.aO() ? 1 : 0) && p.llIIlIIllIIIl(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()))) {
                                    cm = lllIlIlllI[lllIllIlll[45]];
                                    if (p.llIIlIIlIllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIllIlll[68], lllIllIlll[69], lllIllIlll[1])) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[3]];
                                        String[] stringArray = new String[lllIllIlll[0]];
                                        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[48]];
                                        TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[50]]);
                                        Time.sleepTicks((int)lllIllIlll[8]);

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

                                            }
                                        }
                                        if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(b.I), lllIllIlll[23])) {
                                            if (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                                                Dialog.close();
                                            }
                                            Movement.walkTo((WorldPoint)cn);

                                            Time.sleepTicks((int)lllIllIlll[0]);

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

                                        }
                                    }
                                    if (p.llIIlIIllIIIl(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cy), lllIllIlll[4])) {
                                            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[62]];
                                            Movement.walkTo((WorldPoint)cy);

                                            Time.sleepTicks((int)lllIllIlll[0]);

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

                                }
                                if (!p.llIIlIIlllIII(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[72]) || p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[26])) {
                                    if (!p.llIIlIIlIllll(cH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cz), lllIllIlll[9])) {
                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[71]];
                                        Movement.walkTo((WorldPoint)cz);

                                        Time.sleepTicks((int)lllIllIlll[0]);

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

                                        Time.sleepTicks((int)lllIllIlll[0]);

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

                                }
                                if (!p.llIIlIIlllIII(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[82]) || p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[83])) {
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[84]];
                                    String[] stringArray = new String[lllIllIlll[0]];
                                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[85]];
                                    TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[86]]);
                                    Time.sleepTicks((int)lllIllIlll[4]);

                                    String[] stringArray3 = new String[lllIllIlll[0]];
                                    stringArray3[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[87]];
                                    TileObjects.getNearest((String[])stringArray3).interact(lllIlIlllI[lllIllIlll[88]]);
                                    Time.sleepTicks((int)lllIllIlll[4]);

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

                                                    Time.sleepTicks((int)lllIllIlll[0]);

                                                }
                                                if (p.llIIlIIlIllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIllIlll[77], lllIllIlll[78], lllIllIlll[1])) ? 1 : 0)) {
                                                    String[] stringArray10 = new String[lllIllIlll[0]];
                                                    stringArray10[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[101]];
                                                    TileObjects.getNearest((String[])stringArray10).interact(lllIlIlllI[lllIllIlll[102]]);
                                                    Time.sleepTicks((int)lllIllIlll[4]);

                                                    String[] stringArray11 = new String[lllIllIlll[0]];
                                                    stringArray11[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[103]];
                                                    TileObjects.getNearest((String[])stringArray11).interact(lllIlIlllI[lllIllIlll[104]]);
                                                    Time.sleepTicks((int)lllIllIlll[4]);

                                                }
                                            }
                                        }
                                    }
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[105]];
                                    if (p.llIIlIIllIllI(Players.getLocal().getAnimation(), lllIllIlll[70]) && p.llIIlIIllIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                        int[] nArray = new int[lllIllIlll[0]];
                                        nArray[p.lllIllIlll[1]] = lllIllIlll[98];
                                        var4 = TileObjects.getNearest((int[])nArray);
                                        int[] nArray32 = new int[lllIllIlll[9]];
                                        nArray32[p.lllIllIlll[1]] = lllIllIlll[106];
                                        nArray32[p.lllIllIlll[0]] = lllIllIlll[107];
                                        nArray32[p.lllIllIlll[4]] = lllIllIlll[108];
                                        nArray32[p.lllIllIlll[7]] = lllIllIlll[109];
                                        nArray32[p.lllIllIlll[8]] = lllIllIlll[98];
                                        List var5 = TileObjects.getAll((int[])nArray32);
                                        List var6 = var5.stream().filter(tileObject -> Reachable.isInteractable((Locatable)tileObject)).collect(Collectors.toList());
                                        if (p.llIIlIIllIIIl(var6.isEmpty() ? 1 : 0)) {
                                            String[] stringArray12 = new String[lllIllIlll[0]];
                                            stringArray12[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[110]];
                                            if (p.llIIlIIlIllll(((TileObject)var6.get(lllIllIlll[1])).hasAction(stringArray12) ? 1 : 0)) {
                                                ((TileObject)var6.get(lllIllIlll[1])).interact(lllIlIlllI[lllIllIlll[111]]);
                                                Time.sleepTicks((int)lllIllIlll[7]);

                                            }
                                            String[] stringArray13 = new String[lllIllIlll[0]];
                                            stringArray13[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[75]];
                                            if (p.llIIlIIlIllll(((TileObject)var6.get(lllIllIlll[1])).hasAction(stringArray13) ? 1 : 0)) {
                                                ((TileObject)var6.get(lllIllIlll[1])).interact(lllIlIlllI[lllIllIlll[112]]);
                                                Time.sleepTicks((int)lllIllIlll[4]);

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

                                }
                                if (p.llIIlIIllIIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)new WorldPoint(lllIllIlll[115], lllIllIlll[116], lllIllIlll[1]));

                                    Time.sleepTicks((int)lllIllIlll[0]);

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

                                }
                                Movement.walkTo((WorldPoint)cA);

                                Time.sleepTicks((int)lllIllIlll[0]);

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

                            }
                            if (p.llIIlIIllIllI(Players.getLocal().getWorldLocation().getPlane(), lllIllIlll[4])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[131]];
                                if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lllIllIlll[0]];
                                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[132]];
                                    TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[82]]);
                                    Time.sleepTicks((int)lllIllIlll[4]);

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

                            }
                            if (p.llIIlIIllIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[137]];
                                if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lllIllIlll[0]];
                                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[138]];
                                    TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[139]]);
                                    Time.sleepTicks((int)lllIllIlll[4]);

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

                                Movement.walkTo((WorldPoint)cA);

                                Time.sleepTicks((int)lllIllIlll[0]);

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

                                    }
                                }
                                if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(b.I), lllIllIlll[133])) {
                                    if (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[13])) {
                                        Movement.walkTo((WorldPoint)cA);

                                        Time.sleepTicks((int)lllIllIlll[0]);

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

                                Time.sleepTicks((int)lllIllIlll[0]);

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

                                                if ((0xE5 ^ 0xA9 ^ (0xFD ^ 0xB4)) != 0) return n2 != 0;
                                                return ((0x22 ^ 0x12 ^ (0x45 ^ 0x4D)) & (120 + 7 - 74 + 74 ^ (0x41 ^ 6) ^ -1)) != 0;
                                            }
                                        }
                                        n2 = lllIllIlll[1];
                                        return n2 != 0;
                                    }).interact(lllIlIlllI[lllIllIlll[155]]);
                                    Time.sleepTicks((int)lllIllIlll[4]);

                                }
                                g.a(bQ);
                            }
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[156])) {
                            if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllIllIlll[77], lllIllIlll[152], lllIllIlll[1])), lllIllIlll[4])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[157]];
                                Movement.walkTo((WorldPoint)new WorldPoint(lllIllIlll[77], lllIllIlll[152], lllIllIlll[1]));

                                Time.sleepTicks((int)lllIllIlll[0]);

                            }
                            if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lllIllIlll[0]];
                                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[158]];
                                TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[159]]);
                                Time.sleepTicks((int)lllIllIlll[4]);

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

                                Time.sleepTicks((int)lllIllIlll[0]);

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

                                    Time.sleepTicks((int)lllIllIlll[0]);

                                }
                                if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cB), lllIllIlll[9])) {
                                    if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                                        int[] nArray = new int[lllIllIlll[0]];
                                        nArray[p.lllIllIlll[1]] = lllIllIlll[168];
                                        TileObjects.getNearest((int[])nArray).interact(lllIlIlllI[lllIllIlll[169]]);
                                        Time.sleepTicks((int)lllIllIlll[4]);

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

                                    Time.sleepTicks((int)lllIllIlll[0]);

                                }
                                if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cC), lllIllIlll[9])) {
                                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[171]];
                                    if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                        String[] stringArray = new String[lllIllIlll[0]];
                                        stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[172]];
                                        TileObjects.getNearest((String[])stringArray).interact(lllIlIlllI[lllIllIlll[6]]);
                                        Time.sleepTicks((int)lllIllIlll[4]);

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

                                Time.sleepTicks((int)lllIllIlll[0]);

                            }
                            if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[15])) {
                                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[180]];
                                if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    if (p.llIIlIIllIIII(cJ, lllIllIlll[7])) {
                                        g.a(lllIlIlllI[lllIllIlll[181]], bQ);
                                        Time.sleepTicks((int)lllIllIlll[4]);

                                        cJ += lllIllIlll[0];
                                    }
                                    if (p.llIIlIIllIIlI(cJ, lllIllIlll[7]) && p.llIIlIIllIIII(cJ, lllIllIlll[9])) {
                                        g.a(lllIlIlllI[lllIllIlll[182]], bQ);
                                        Time.sleepTicks((int)lllIllIlll[4]);

                                        cJ += lllIllIlll[0];
                                    }
                                    if (p.llIIlIIllIIlI(cJ, lllIllIlll[9]) && p.llIIlIIllIIII(cJ, lllIllIlll[13])) {
                                        g.a(lllIlIlllI[lllIllIlll[183]], bQ);
                                        Time.sleepTicks((int)lllIllIlll[4]);

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

                                }
                                String[] stringArray18 = new String[lllIllIlll[0]];
                                stringArray18[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[191]];
                                if (p.llIIlIIllIIll(NPCs.getNearest((String[])stringArray18))) {
                                    String[] stringArray19 = new String[lllIllIlll[0]];
                                    stringArray19[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[192]];
                                    NPCs.getNearest((String[])stringArray19).interact(lllIlIlllI[lllIllIlll[193]]);
                                    Time.sleepTicks((int)lllIllIlll[7]);

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

                                    }
                                    if (!p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cn), lllIllIlll[3]) || p.llIIlIIllIIIl(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[208]];
                                        if (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)cn);

                                        Time.sleepTicks((int)lllIllIlll[0]);

                                    }
                                }
                            }
                        }
                        if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[209])) {
                            AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[127]];
                            String[] stringArray = new String[lllIllIlll[0]];
                            stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[210]];
                            var4 = NPCs.getAll((String[])stringArray);
                            if (p.llIIlIIllIlIl(var4.size())) {
                                ((NPC)var4.get(lllIllIlll[1])).interact(lllIlIlllI[lllIllIlll[211]]);
                                Time.sleepUntil(() -> Dialog.isOpen(), (int)lllIllIlll[212]);

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

                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[228]];
                    Mouse.click((int)Widgets.get((int)lllIllIlll[101], (int)lllIllIlll[88]).getClickPoint().getX(), (int)Widgets.get((int)lllIllIlll[101], (int)lllIllIlll[88]).getClickPoint().getY(), (boolean)lllIllIlll[0]);
                    Time.sleepTicks((int)lllIllIlll[7]);

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

                        }
                        String[] stringArray21 = new String[lllIllIlll[0]];
                        stringArray21[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[140]];
                        NPCs.getNearest((String[])stringArray21).interact(lllIlIlllI[lllIllIlll[231]]);
                        Time.sleepTicks((int)lllIllIlll[4]);

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

                    }
                    Movement.walkTo((WorldPoint)s.dp);

                    Time.sleepTicks((int)lllIllIlll[0]);

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

                }
                String[] stringArray26 = new String[lllIllIlll[0]];
                stringArray26[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[244]];
                if (p.llIIlIIllIIll(TileObjects.getNearest((String[])stringArray26))) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[245]];
                    String[] stringArray27 = new String[lllIllIlll[0]];
                    stringArray27[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[246]];
                    TileObjects.getNearest((String[])stringArray27).interact(lllIlIlllI[lllIllIlll[247]]);
                    Time.sleepTicks((int)lllIllIlll[7]);

                }
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[248])) {
                if (p.llIIlIIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                    int[] nArray = new int[lllIllIlll[0]];
                    nArray[p.lllIllIlll[1]] = lllIllIlll[249];
                    TileObjects.getNearest((int[])nArray).interact(lllIlIlllI[lllIllIlll[250]]);
                    Time.sleepTicks((int)lllIllIlll[8]);

                }
                g.a(bQ);
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[251])) {
                String[] stringArray = new String[lllIllIlll[0]];
                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[252]];
                Inventory.getFirst((String[])stringArray).interact(lllIlIlllI[lllIllIlll[253]]);
                Time.sleepTicks((int)lllIllIlll[4]);

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

                        Time.sleepTicks((int)lllIllIlll[0]);

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

                            }
                        }
                    }
                }
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[262])) {
                if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cE), lllIllIlll[7])) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[263]];
                    Movement.walkTo((WorldPoint)cE);

                    Time.sleepTicks((int)lllIllIlll[0]);

                }
                if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cE), lllIllIlll[7])) {
                    String[] stringArray = new String[lllIllIlll[0]];
                    stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[264]];
                    String[] stringArray32 = new String[lllIllIlll[0]];
                    stringArray32[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[160]];
                    Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray32));
                    Time.sleepTicks((int)lllIllIlll[7]);

                }
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[265])) {
                if (p.llIIlIIllIlll(Players.getLocal().getWorldLocation().distanceTo(cF), lllIllIlll[7])) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[266]];
                    Movement.walkTo((WorldPoint)cF);

                    Time.sleepTicks((int)lllIllIlll[0]);

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

                    }
                    Movement.walkTo((WorldPoint)s.do);

                    Time.sleepTicks((int)lllIllIlll[0]);

                }
                if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(s.do), lllIllIlll[13])) {
                    int[] nArray = new int[lllIllIlll[0]];
                    nArray[p.lllIllIlll[1]] = lllIllIlll[279];
                    int[] nArray53 = new int[lllIllIlll[0]];
                    nArray53[p.lllIllIlll[1]] = lllIllIlll[280];
                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((int[])nArray53));
                    Time.sleepTicks((int)lllIllIlll[8]);

                }
            }
            if (p.llIIlIIllIllI(Vars.getBit((int)QuestVarbits.QUEST_IN_AID_OF_THE_MYREQUE.getId()), lllIllIlll[281])) {
                String[] stringArray = new String[lllIllIlll[0]];
                stringArray[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[282]];
                if (p.llIIlIIlllIIl(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[283]];
                    if (p.llIIlIIllIIIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIllIlll[77], lllIllIlll[78], lllIllIlll[1])) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lllIllIlll[77], lllIllIlll[78], lllIllIlll[1]));

                        Time.sleepTicks((int)lllIllIlll[0]);

                    }
                    if (p.llIIlIIlIllll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllIllIlll[77], lllIllIlll[78], lllIllIlll[1])) ? 1 : 0)) {
                        String[] stringArray35 = new String[lllIllIlll[0]];
                        stringArray35[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[284]];
                        TileObjects.getNearest((String[])stringArray35).interact(lllIlIlllI[lllIllIlll[166]]);
                        Time.sleepTicks((int)lllIllIlll[4]);

                        String[] stringArray36 = new String[lllIllIlll[0]];
                        stringArray36[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[285]];
                        TileObjects.getNearest((String[])stringArray36).interact(lllIlIlllI[lllIllIlll[286]]);
                        Time.sleepTicks((int)lllIllIlll[4]);

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
        p.lllIlIlllI[p.lllIllIlll[1]] = "Finished buying items, switching back to quest";
        p.lllIlIlllI[p.lllIllIlll[0]] = "- Crafting";
        p.lllIlIlllI[p.lllIllIlll[4]] = "- Mining";
        p.lllIlIlllI[p.lllIllIlll[7]] = "- In Search";
        p.lllIlIlllI[p.lllIllIlll[8]] = p.llIIIlllIlIIl("6pNJZfAQfyk=", "XhkVR");
        p.lllIlIlllI[p.lllIllIlll[9]] = "Nav to bank";
        p.lllIlIlllI[p.lllIllIlll[11]] = "Break";
        p.lllIlIlllI[p.lllIllIlll[13]] = "Handling banking";
        p.lllIlIlllI[p.lllIllIlll[35]] = "We are missing a certain amount of quest supplies, switching to BUYING";
        p.lllIlIlllI[p.lllIllIlll[37]] = "We are missing rune scimitar, switching to BUYING";
        p.lllIlIlllI[p.lllIllIlll[15]] = "We are missing quest supplies, switching to BUYING";
        p.lllIlIlllI[p.lllIllIlll[42]] = "Getting gear";
        p.lllIlIlllI[p.lllIllIlll[31]] = "Getting starting supplies";
        p.lllIlIlllI[p.lllIllIlll[43]] = "Drink";
        p.lllIlIlllI[p.lllIllIlll[45]] = p.llIIIlllIlIII("", "deCos");
        p.lllIlIlllI[p.lllIllIlll[3]] = "Entering cave";
        p.lllIlIlllI[p.lllIllIlll[48]] = "Cave entrance";
        p.lllIlIlllI[p.lllIllIlll[50]] = "Enter";
        p.lllIlIlllI[p.lllIllIlll[52]] = "nav to start";
        p.lllIlIlllI[p.lllIllIlll[54]] = "Break";
        p.lllIlIlllI[p.lllIllIlll[23]] = "Starting quest";
        p.lllIlIlllI[p.lllIllIlll[57]] = "Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[59]] = "Tele to barrows";
        p.lllIlIlllI[p.lllIllIlll[60]] = "Break";
        p.lllIlIlllI[p.lllIllIlll[62]] = "Nav to burgh gate";
        p.lllIlIlllI[p.lllIllIlll[2]] = "Talk to guy";
        p.lllIlIlllI[p.lllIllIlll[64]] = "Florin";
        p.lllIlIlllI[p.lllIllIlll[65]] = "Donating food";
        p.lllIlIlllI[p.lllIllIlll[38]] = "Shark";
        p.lllIlIlllI[p.lllIllIlll[66]] = "Open chest";
        p.lllIlIlllI[p.lllIllIlll[71]] = "Nav to pub";
        p.lllIlIlllI[p.lllIllIlll[73]] = "Talk to guy";
        p.lllIlIlllI[p.lllIllIlll[74]] = "Razvan";
        p.lllIlIlllI[p.lllIllIlll[76]] = "Nav to rubble pile";
        p.lllIlIlllI[p.lllIllIlll[80]] = "Digging rubble";
        p.lllIlIlllI[p.lllIllIlll[84]] = "Going down trapdoor";
        p.lllIlIlllI[p.lllIllIlll[85]] = "Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[86]] = "Open";
        p.lllIlIlllI[p.lllIllIlll[87]] = "Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[88]] = "Climb-down";
        p.lllIlIlllI[p.lllIllIlll[72]] = "Bucket";
        p.lllIlIlllI[p.lllIllIlll[90]] = "Broken glass";
        p.lllIlIlllI[p.lllIllIlll[91]] = "Drop";
        p.lllIlIlllI[p.lllIllIlll[92]] = "Bronze nails";
        p.lllIlIlllI[p.lllIllIlll[67]] = "Drop";
        p.lllIlIlllI[p.lllIllIlll[93]] = "Iron nails";
        p.lllIlIlllI[p.lllIllIlll[94]] = "Drop";
        p.lllIlIlllI[p.lllIllIlll[95]] = "Rock";
        p.lllIlIlllI[p.lllIllIlll[96]] = "Drop";
        p.lllIlIlllI[p.lllIllIlll[97]] = "Black nails";
        p.lllIlIlllI[p.lllIllIlll[26]] = "Drop";
        p.lllIlIlllI[p.lllIllIlll[99]] = "Bucket of rubble";
        p.lllIlIlllI[p.lllIllIlll[100]] = "Nav to rubble pile";
        p.lllIlIlllI[p.lllIllIlll[101]] = "Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[102]] = "Open";
        p.lllIlIlllI[p.lllIllIlll[103]] = "Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[104]] = "Climb-down";
        p.lllIlIlllI[p.lllIllIlll[105]] = "Mine rubble";
        p.lllIlIlllI[p.lllIllIlll[110]] = "Mine";
        p.lllIlIlllI[p.lllIllIlll[111]] = "Mine";
        p.lllIlIlllI[p.lllIllIlll[75]] = "Remove";
        p.lllIlIlllI[p.lllIllIlll[112]] = "Remove";
        p.lllIlIlllI[p.lllIllIlll[113]] = "Bucket";
        p.lllIlIlllI[p.lllIllIlll[114]] = "Bucket of rubble";
        p.lllIlIlllI[p.lllIllIlll[117]] = "Nav outside pub";
        p.lllIlIlllI[p.lllIllIlll[118]] = "Climb up ladder";
        p.lllIlIlllI[p.lllIllIlll[119]] = "Ladder";
        p.lllIlIlllI[p.lllIllIlll[120]] = "Climb-up";
        p.lllIlIlllI[p.lllIllIlll[121]] = "Empty Buckets";
        p.lllIlIlllI[p.lllIllIlll[122]] = "Bucket of rubble";
        p.lllIlIlllI[p.lllIllIlll[79]] = "Rubble Pile";
        p.lllIlIlllI[p.lllIllIlll[123]] = "Nav to general store";
        p.lllIlIlllI[p.lllIllIlll[124]] = "Ladder";
        p.lllIlIlllI[p.lllIllIlll[125]] = "Climb-up";
        p.lllIlIlllI[p.lllIllIlll[126]] = "O";
        p.lllIlIlllI[p.lllIllIlll[128]] = "Climb up ladder";
        p.lllIlIlllI[p.lllIllIlll[129]] = "Ladder";
        p.lllIlIlllI[p.lllIllIlll[130]] = "Climb-up";
        p.lllIlIlllI[p.lllIllIlll[131]] = "Fix roof";
        p.lllIlIlllI[p.lllIllIlll[132]] = "Broken Roof";
        p.lllIlIlllI[p.lllIllIlll[82]] = "Inspect";
        p.lllIlIlllI[p.lllIllIlll[134]] = "Climb up ladder";
        p.lllIlIlllI[p.lllIllIlll[135]] = "Ladder";
        p.lllIlIlllI[p.lllIllIlll[136]] = "Climb-down";
        p.lllIlIlllI[p.lllIllIlll[137]] = "Fix roof";
        p.lllIlIlllI[p.lllIllIlll[138]] = "Damaged wall";
        p.lllIlIlllI[p.lllIllIlll[139]] = "Inspect";
        p.lllIlIlllI[p.lllIllIlll[141]] = "Nav to general store";
        p.lllIlIlllI[p.lllIllIlll[142]] = "Ladder";
        p.lllIlIlllI[p.lllIllIlll[143]] = "Climb-up";
        p.lllIlIlllI[p.lllIllIlll[83]] = "Aurel";
        p.lllIlIlllI[p.lllIllIlll[147]] = "Nav to general store";
        p.lllIlIlllI[p.lllIllIlll[148]] = "Break";
        p.lllIlIlllI[p.lllIllIlll[149]] = "Aurel";
        p.lllIlIlllI[p.lllIllIlll[153]] = "Nav to burgh bank";
        p.lllIlIlllI[p.lllIllIlll[154]] = "Fixing bank";
        p.lllIlIlllI[p.lllIllIlll[155]] = "Inspect";
        p.lllIlIlllI[p.lllIllIlll[157]] = "Nav to burgh bank";
        p.lllIlIlllI[p.lllIllIlll[158]] = "Damaged wall";
        p.lllIlIlllI[p.lllIllIlll[159]] = "Inspect";
        p.lllIlIlllI[p.lllIllIlll[89]] = "Hiring banker";
        p.lllIlIlllI[p.lllIllIlll[161]] = "Cornelius";
        p.lllIlIlllI[p.lllIllIlll[163]] = "Nav to pub";
        p.lllIlIlllI[p.lllIllIlll[164]] = "Talk to guy";
        p.lllIlIlllI[p.lllIllIlll[165]] = "Razvan";
        p.lllIlIlllI[p.lllIllIlll[167]] = "Nav to burgh bank";
        p.lllIlIlllI[p.lllIllIlll[169]] = "Bank";
        p.lllIlIlllI[p.lllIllIlll[170]] = "Nav to furnace";
        p.lllIlIlllI[p.lllIllIlll[171]] = "Repair furnace";
        p.lllIlIlllI[p.lllIllIlll[172]] = "Broken furnace";
        p.lllIlIlllI[p.lllIllIlll[6]] = "Inspect";
        p.lllIlIlllI[p.lllIllIlll[174]] = "Lighting furnace";
        p.lllIlIlllI[p.lllIllIlll[175]] = "Repaired furnace";
        p.lllIlIlllI[p.lllIllIlll[176]] = "Repaired furnace";
        p.lllIlIlllI[p.lllIllIlll[179]] = "Nav to general store";
        p.lllIlIlllI[p.lllIllIlll[180]] = "Talking to guys";
        p.lllIlIlllI[p.lllIllIlll[181]] = "Gadderanks";
        p.lllIlIlllI[p.lllIllIlll[182]] = "Vampyre Juvinate";
        p.lllIlIlllI[p.lllIllIlll[183]] = "Wiskit";
        p.lllIlIlllI[p.lllIllIlll[186]] = "Handling fight";
        p.lllIlIlllI[p.lllIllIlll[187]] = "Drink";
        p.lllIlIlllI[p.lllIllIlll[188]] = "Vampyre Juvinate";
        p.lllIlIlllI[p.lllIllIlll[189]] = "Vampyre Juvinate";
        p.lllIlIlllI[p.lllIllIlll[190]] = "Attack";
        p.lllIlIlllI[p.lllIllIlll[191]] = "Gadderanks";
        p.lllIlIlllI[p.lllIllIlll[192]] = "Gadderanks";
        p.lllIlIlllI[p.lllIllIlll[193]] = "Attack";
        p.lllIlIlllI[p.lllIllIlll[195]] = "Talking to gadderanks";
        p.lllIlIlllI[p.lllIllIlll[196]] = "Gadderanks";
        p.lllIlIlllI[p.lllIllIlll[198]] = "Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[199]] = "Talking to veliaf";
        p.lllIlIlllI[p.lllIllIlll[200]] = "Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[201]] = "Entering cave";
        p.lllIlIlllI[p.lllIllIlll[202]] = "Cave entrance";
        p.lllIlIlllI[p.lllIllIlll[203]] = "Enter";
        p.lllIlIlllI[p.lllIllIlll[204]] = "Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[205]] = "Entering cave";
        p.lllIlIlllI[p.lllIllIlll[206]] = "Cave entrance";
        p.lllIlIlllI[p.lllIllIlll[207]] = "Enter";
        p.lllIlIlllI[p.lllIllIlll[208]] = "Nav to start";
        p.lllIlIlllI[p.lllIllIlll[127]] = "Talk to Polmafi";
        p.lllIlIlllI[p.lllIllIlll[210]] = "Polmafi Ferdygris";
        p.lllIlIlllI[p.lllIllIlll[211]] = "Talk-to";
        p.lllIlIlllI[p.lllIllIlll[213]] = "Polmafi Ferdygris";
        p.lllIlIlllI[p.lllIllIlll[215]] = "Salmon";
        p.lllIlIlllI[p.lllIllIlll[216]] = "Giving Ivan gear";
        p.lllIlIlllI[p.lllIllIlll[217]] = "Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[218]] = "Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[219]] = "Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[220]] = "Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[133]] = "Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[221]] = "Salmon";
        p.lllIlIlllI[p.lllIllIlll[222]] = "Talk to Ivan";
        p.lllIlIlllI[p.lllIllIlll[223]] = "Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[225]] = "Starting trek";
        p.lllIlIlllI[p.lllIllIlll[226]] = "Ivan Strom";
        p.lllIlIlllI[p.lllIllIlll[227]] = "Selecting route 2";
        p.lllIlIlllI[p.lllIllIlll[228]] = "Selecting travel";
        p.lllIlIlllI[p.lllIllIlll[229]] = "Vampyre Juvinate";
        p.lllIlIlllI[p.lllIllIlll[230]] = "Drink";
        p.lllIlIlllI[p.lllIllIlll[140]] = "Vampyre Juvinate";
        p.lllIlIlllI[p.lllIllIlll[231]] = "Attack";
        p.lllIlIlllI[p.lllIllIlll[232]] = "Vampyre Juvinate";
        p.lllIlIlllI[p.lllIllIlll[235]] = "Nav to Drezel";
        p.lllIlIlllI[p.lllIllIlll[236]] = "Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[144]] = "Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[237]] = "Open";
        p.lllIlIlllI[p.lllIllIlll[238]] = "Talk to drezel";
        p.lllIlIlllI[p.lllIllIlll[239]] = "Drezel";
        p.lllIlIlllI[p.lllIllIlll[241]] = "Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[150]] = "Using key";
        p.lllIlIlllI[p.lllIllIlll[242]] = "Temple library key";
        p.lllIlIlllI[p.lllIllIlll[243]] = "Keyhole";
        p.lllIlIlllI[p.lllIllIlll[244]] = "Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[245]] = "going down trapdoor";
        p.lllIlIlllI[p.lllIllIlll[246]] = "Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[247]] = "Climb-down";
        p.lllIlIlllI[p.lllIllIlll[250]] = "Search";
        p.lllIlIlllI[p.lllIllIlll[252]] = "The sleeping seven";
        p.lllIlIlllI[p.lllIllIlll[253]] = "Read";
        p.lllIlIlllI[p.lllIllIlll[156]] = "Nav to boarded cave";
        p.lllIlIlllI[p.lllIllIlll[255]] = "Hammering boards";
        p.lllIlIlllI[p.lllIllIlll[256]] = "Wooden boards";
        p.lllIlIlllI[p.lllIllIlll[257]] = "Wooden boards";
        p.lllIlIlllI[p.lllIllIlll[258]] = "Cave entrance";
        p.lllIlIlllI[p.lllIllIlll[259]] = "Wooden boards";
        p.lllIlIlllI[p.lllIllIlll[260]] = "Cave entrance";
        p.lllIlIlllI[p.lllIllIlll[261]] = "Enter";
        p.lllIlIlllI[p.lllIllIlll[263]] = "nav to coffin";
        p.lllIlIlllI[p.lllIllIlll[264]] = "Soft clay";
        p.lllIlIlllI[p.lllIllIlll[160]] = "Coffin";
        p.lllIlIlllI[p.lllIllIlll[266]] = "Nav to furnace";
        p.lllIlIlllI[p.lllIllIlll[267]] = "Making staff";
        p.lllIlIlllI[p.lllIllIlll[268]] = "Mithril bar";
        p.lllIlIlllI[p.lllIllIlll[269]] = "Furnace";
        p.lllIlIlllI[p.lllIllIlll[270]] = "Craft";
        p.lllIlIlllI[p.lllIllIlll[272]] = "Cosmic rune";
        p.lllIlIlllI[p.lllIllIlll[273]] = "Enchanting rod";
        p.lllIlIlllI[p.lllIllIlll[276]] = "Nav to well";
        p.lllIlIlllI[p.lllIllIlll[277]] = "Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[162]] = "Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[278]] = "Open";
        p.lllIlIlllI[p.lllIllIlll[282]] = "Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[283]] = "Nav to pub";
        p.lllIlIlllI[p.lllIllIlll[284]] = "Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[166]] = "Open";
        p.lllIlIlllI[p.lllIllIlll[285]] = "Trapdoor";
        p.lllIlIlllI[p.lllIllIlll[286]] = "Climb-down";
        p.lllIlIlllI[p.lllIllIlll[287]] = "Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[288]] = "Talking to veliaf";
        p.lllIlIlllI[p.lllIllIlll[173]] = "Veliaf Hurtz";
        p.lllIlIlllI[p.lllIllIlll[290]] = "Okay, thanks.";
        p.lllIlIlllI[p.lllIllIlll[291]] = "Hammer";
        p.lllIlIlllI[p.lllIllIlll[292]] = "Steel bar";
        p.lllIlIlllI[p.lllIllIlll[293]] = "Coal";
        p.lllIlIlllI[p.lllIllIlll[294]] = "Tinderbox";
        p.lllIlIlllI[p.lllIllIlll[295]] = "Crate";
        p.lllIlIlllI[p.lllIllIlll[296]] = "Plank";
        p.lllIlIlllI[p.lllIllIlll[297]] = "Hammer";
        p.lllIlIlllI[p.lllIllIlll[298]] = "Spade";
        p.lllIlIlllI[p.lllIllIlll[177]] = "Swamp paste";
        p.lllIlIlllI[p.lllIllIlll[299]] = "Nav to bank";
        p.lllIlIlllI[p.lllIllIlll[300]] = "Handling banking";
        p.lllIlIlllI[p.lllIllIlll[302]] = "Nav to burgh bank";
        p.lllIlIlllI[p.lllIllIlll[303]] = "Bank";
        p.lllIlIlllI[p.lllIllIlll[304]] = "Handling banking";
        p.lllIlIlllI[p.lllIllIlll[305]] = "Nav to bank";
        p.lllIlIlllI[p.lllIllIlll[306]] = "Break";
        p.lllIlIlllI[p.lllIllIlll[307]] = "Bank";
        p.lllIlIlllI[p.lllIllIlll[308]] = "Handling banking";
        p.lllIlIlllI[p.lllIllIlll[178]] = "Crate";
        p.lllIlIlllI[p.lllIllIlll[309]] = "Nav to bank";
        p.lllIlIlllI[p.lllIllIlll[310]] = "Break";
        p.lllIlIlllI[p.lllIllIlll[311]] = "Bank";
        p.lllIlIlllI[p.lllIllIlll[312]] = "Handling banking";
        p.lllIlIlllI[p.lllIllIlll[313]] = "Crate";
        p.lllIlIlllI[p.lllIllIlll[314]] = "Crate";
        p.lllIlIlllI[p.lllIllIlll[315]] = "Bronze axe";
        p.lllIlIlllI[p.lllIllIlll[316]] = "Tinderbox";
        p.lllIlIlllI[p.lllIllIlll[317]] = "Bronze axe";
        p.lllIlIlllI[p.lllIllIlll[184]] = "Bronze axe";
        p.lllIlIlllI[p.lllIllIlll[318]] = "Crate";
        p.lllIlIlllI[p.lllIllIlll[319]] = "Tinderbox";
        p.lllIlIlllI[p.lllIllIlll[320]] = "Tinderbox";
        p.lllIlIlllI[p.lllIllIlll[321]] = "Crate";
        p.lllIlIlllI[p.lllIllIlll[322]] = "Crate";
        p.lllIlIlllI[p.lllIllIlll[323]] = "Crate";
        p.lllIlIlllI[p.lllIllIlll[324]] = "Bronze axe";
        p.lllIlIlllI[p.lllIllIlll[325]] = "Tinderbox";
        p.lllIlIlllI[p.lllIllIlll[326]] = "Crate";
        p.lllIlIlllI[p.lllIllIlll[185]] = "Crate";
        p.lllIlIlllI[p.lllIllIlll[327]] = "Search";
        p.lllIlIlllI[p.lllIllIlll[328]] = "should return";
        p.lllIlIlllI[p.lllIllIlll[347]] = "ring of wealth (";
        p.lllIlIlllI[p.lllIllIlll[348]] = "Bank Booth";
        p.lllIlIlllI[p.lllIllIlll[349]] = "Inspect";
        p.lllIlIlllI[p.lllIllIlll[370]] = "Yes.";
        p.lllIlIlllI[p.lllIllIlll[371]] = "I want to join your organisation.";
        p.lllIlIlllI[p.lllIllIlll[372]] = "Ok, tell me this information you have to impart.";
        p.lllIlIlllI[p.lllIllIlll[373]] = "Can you tell me about the job?";
        p.lllIlIlllI[p.lllIllIlll[194]] = "Ok, I'll do the job.";
        p.lllIlIlllI[p.lllIllIlll[374]] = "Are there any 'out of the way' places here?";
        p.lllIlIlllI[p.lllIllIlll[375]] = "I'd like to help fix up the town.";
        p.lllIlIlllI[p.lllIllIlll[376]] = "What should I do now?";
        p.lllIlIlllI[p.lllIllIlll[377]] = "Yes, I'll fill the crate.";
        p.lllIlIlllI[p.lllIllIlll[378]] = "Yes, I'll offer all of this food item in my inventory to Ivan.";
        p.lllIlIlllI[p.lllIllIlll[379]] = "Veliaf told me about Ivandis.";
        p.lllIlIlllI[p.lllIllIlll[380]] = "Is there somewhere that I might get more information on Ivandis?";
        p.lllIlIlllI[p.lllIllIlll[381]] = "The lives of those pitiful few left in Morytania could rest on this!";
        p.lllIlIlllI[p.lllIllIlll[382]] = p.llIIIlllIlIII("", "LxjCo");
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

            Time.sleepTicks((int)lllIllIlll[0]);

        }
        if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cB), lllIllIlll[9])) {
            if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                int[] nArray = new int[lllIllIlll[0]];
                nArray[p.lllIllIlll[1]] = lllIllIlll[168];
                TileObjects.getNearest((int[])nArray).interact(lllIlIlllI[lllIllIlll[303]]);
                Time.sleepTicks((int)lllIllIlll[4]);

            }
            if (p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0) && p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[304]];
                if (p.llIIlIIllIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lllIllIlll[8]);

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
            d var7;
            block104: {
                Object var8;
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
                                                                                                                                                    var8 = new DHelper(lllIllIlll[14], lllIllIlll[15], lllIllIlll[329]);
                                                                                                                                                    bu.add((DHelper) ar8);

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
                                                                                                                                            var8 = new DHelper(lllIllIlll[16], lllIllIlll[15], lllIllIlll[12]);
                                                                                                                                            bu.add((DHelper) ar8);

                                                                                                                                        }
                                                                                                                                        int[] nArray = new int[lllIllIlll[0]];
                                                                                                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[40];
                                                                                                                                        if (p.llIIlIIllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                                            var8 = new DHelper(lllIllIlll[40], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                                            bu.add((DHelper) ar8);

                                                                                                                                        }
                                                                                                                                        int[] nArray6 = new int[lllIllIlll[0]];
                                                                                                                                        nArray6[p.lllIllIlll[1]] = lllIllIlll[41];
                                                                                                                                        if (p.llIIlIIllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                                                                                                                            var8 = new DHelper(lllIllIlll[41], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                                            bu.add((DHelper) ar8);

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
                                                                                                                                    var8 = new DHelper(lllIllIlll[17], lllIllIlll[7], lllIllIlll[331]);
                                                                                                                                    bu.add((DHelper) ar8);

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
                                                                                                                            var8 = new DHelper(lllIllIlll[18], lllIllIlll[15], i.bp);
                                                                                                                            bu.add((DHelper) ar8);

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
                                                                                                                    var8 = new DHelper(lllIllIlll[19], lllIllIlll[4], lllIllIlll[332]);
                                                                                                                    bu.add((DHelper) ar8);

                                                                                                                }
                                                                                                                int[] nArray = new int[lllIllIlll[0]];
                                                                                                                nArray[p.lllIllIlll[1]] = lllIllIlll[47];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                    var8 = new DHelper(lllIllIlll[47], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((DHelper) ar8);

                                                                                                                }
                                                                                                                int[] nArray14 = new int[lllIllIlll[0]];
                                                                                                                nArray14[p.lllIllIlll[1]] = lllIllIlll[56];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                                                                                                    var8 = new DHelper(lllIllIlll[56], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((DHelper) ar8);

                                                                                                                }
                                                                                                                int[] nArray15 = new int[lllIllIlll[0]];
                                                                                                                nArray15[p.lllIllIlll[1]] = lllIllIlll[58];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                                                                                    var8 = new DHelper(lllIllIlll[58], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((DHelper) ar8);

                                                                                                                }
                                                                                                                int[] nArray16 = new int[lllIllIlll[0]];
                                                                                                                nArray16[p.lllIllIlll[1]] = lllIllIlll[61];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                                                                                                    var8 = new DHelper(lllIllIlll[61], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((DHelper) ar8);

                                                                                                                }
                                                                                                                int[] nArray17 = new int[lllIllIlll[0]];
                                                                                                                nArray17[p.lllIllIlll[1]] = lllIllIlll[63];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
                                                                                                                    var8 = new DHelper(lllIllIlll[63], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((DHelper) ar8);

                                                                                                                }
                                                                                                                int[] nArray18 = new int[lllIllIlll[0]];
                                                                                                                nArray18[p.lllIllIlll[1]] = lllIllIlll[51];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                                                                                                                    var8 = new DHelper(lllIllIlll[51], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((DHelper) ar8);

                                                                                                                }
                                                                                                                int[] nArray19 = new int[lllIllIlll[0]];
                                                                                                                nArray19[p.lllIllIlll[1]] = lllIllIlll[53];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                                                                                                    var8 = new DHelper(lllIllIlll[53], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((DHelper) ar8);

                                                                                                                }
                                                                                                                int[] nArray20 = new int[lllIllIlll[0]];
                                                                                                                nArray20[p.lllIllIlll[1]] = lllIllIlll[55];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                                                                                                    var8 = new DHelper(lllIllIlll[55], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((DHelper) ar8);

                                                                                                                }
                                                                                                                int[] nArray21 = new int[lllIllIlll[0]];
                                                                                                                nArray21[p.lllIllIlll[1]] = lllIllIlll[49];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray21) ? 1 : 0)) {
                                                                                                                    var8 = new DHelper(lllIllIlll[49], lllIllIlll[0], lllIllIlll[330]);
                                                                                                                    bu.add((DHelper) ar8);

                                                                                                                }
                                                                                                                int[] nArray22 = new int[lllIllIlll[0]];
                                                                                                                nArray22[p.lllIllIlll[1]] = lllIllIlll[36];
                                                                                                                if (p.llIIlIIllIIIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                                                                                                    var8 = new DHelper(lllIllIlll[36], lllIllIlll[0], lllIllIlll[333]);
                                                                                                                    bu.add((DHelper) ar8);

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
                                                                                                            var8 = new DHelper(lllIllIlll[20], lllIllIlll[15], lllIllIlll[329]);
                                                                                                            bu.add((DHelper) ar8);

                                                                                                        }
                                                                                                        int[] nArray = new int[lllIllIlll[0]];
                                                                                                        nArray[p.lllIllIlll[1]] = lllIllIlll[44];
                                                                                                        if (p.llIIlIIllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                                                            var8 = new DHelper(lllIllIlll[44], lllIllIlll[0], lllIllIlll[329]);
                                                                                                            bu.add((DHelper) ar8);

                                                                                                        }
                                                                                                        int[] nArray26 = new int[lllIllIlll[0]];
                                                                                                        nArray26[p.lllIllIlll[1]] = lllIllIlll[46];
                                                                                                        if (p.llIIlIIllIIIl(Bank.contains((int[])nArray26) ? 1 : 0)) {
                                                                                                            var8 = new DHelper(lllIllIlll[46], lllIllIlll[0], lllIllIlll[329]);
                                                                                                            bu.add((DHelper) ar8);

                                                                                                        }
                                                                                                        int[] nArray27 = new int[lllIllIlll[0]];
                                                                                                        nArray27[p.lllIllIlll[1]] = lllIllIlll[39];
                                                                                                        if (p.llIIlIIllIIIl(Bank.contains((int[])nArray27) ? 1 : 0)) {
                                                                                                            var8 = new DHelper(lllIllIlll[39], lllIllIlll[0], lllIllIlll[330]);
                                                                                                            bu.add((DHelper) ar8);

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
                                                                                                    var8 = new DHelper(lllIllIlll[21], lllIllIlll[15], lllIllIlll[334]);
                                                                                                    bu.add((DHelper) ar8);

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
                                                                                            var8 = new DHelper(lllIllIlll[24], lllIllIlll[23], lllIllIlll[335]);
                                                                                            bu.add((DHelper) ar8);

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
                                                                                    var8 = new DHelper(lllIllIlll[25], lllIllIlll[26], lllIllIlll[162]);
                                                                                    bu.add((DHelper) ar8);

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
                                                                            var8 = new DHelper(lllIllIlll[27], lllIllIlll[9], lllIllIlll[336]);
                                                                            bu.add((DHelper) ar8);

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
                                                                    var8 = new DHelper(lllIllIlll[28], lllIllIlll[15], lllIllIlll[337]);
                                                                    bu.add((DHelper) ar8);

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
                                                            var8 = new DHelper(lllIllIlll[29], lllIllIlll[9], lllIllIlll[337]);
                                                            bu.add((DHelper) ar8);

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
                                                    var8 = new DHelper(lllIllIlll[30], lllIllIlll[31], lllIllIlll[12]);
                                                    bu.add((DHelper) ar8);

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
                                            var8 = new DHelper(lllIllIlll[32], lllIllIlll[15], lllIllIlll[329]);
                                            bu.add((DHelper) ar8);

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
                                    var8 = new DHelper(lllIllIlll[22], lllIllIlll[71], e.c(lllIllIlll[338], lllIllIlll[339]));
                                    bu.add((DHelper) ar8);

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
                            var8 = new DHelper(lllIllIlll[33], lllIllIlll[15], e.c(lllIllIlll[340], lllIllIlll[341]));
                            bu.add((DHelper) ar8);

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
                    var8 = new DHelper(lllIllIlll[34], lllIllIlll[9], e.c(lllIllIlll[342], lllIllIlll[343]));
                    bu.add((DHelper) ar8);

                }
                if (p.llIIlIIllIIIl(Bank.contains((Predicate)(var8 = item -> item.getName().toLowerCase().contains(lllIlIlllI[lllIllIlll[347]]))) ? 1 : 0)) {
                    var7 = new DHelper(lllIllIlll[344], lllIllIlll[9], lllIllIlll[345]);
                    bu.add(var7);

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
            var7 = new DHelper(lllIllIlll[10], lllIllIlll[72], lllIllIlll[346]);
            bu.add(var7);

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
                void var9;
                BankLocation bankLocation = BankLocation.VARROCK_WEST_BANK;
                if (p.llIIlIIllIIll(bankLocation) && p.llIIlIIllIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[309]];
                    if (p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cA), lllIllIlll[23])) {
                        int[] nArray = new int[lllIllIlll[0]];
                        nArray[p.lllIllIlll[1]] = lllIllIlll[10];
                        Inventory.getFirst((int[])nArray).interact(lllIlIlllI[lllIllIlll[310]]);
                        Time.sleepTicks((int)lllIllIlll[9]);

                    }
                    a.a((BankLocation)var9);
                }
                if (!p.llIIlIIllIIll(var9) || !p.llIIlIIlIllll(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block24;
                if (p.llIIlIIllIIIl(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIlll[12]);

                    int[] nArray = new int[lllIllIlll[0]];
                    nArray[p.lllIllIlll[1]] = lllIllIlll[168];
                    if (p.llIIlIIllIIll(TileObjects.getNearest((int[])nArray)) && p.llIIlIIllIlII(Players.getLocal().getWorldLocation().distanceTo(cB), lllIllIlll[15])) {
                        int[] nArray2 = new int[lllIllIlll[0]];
                        nArray2[p.lllIllIlll[1]] = lllIllIlll[168];
                        TileObjects.getNearest((int[])nArray2).interact(lllIlIlllI[lllIllIlll[311]]);
                        Time.sleepTicks((int)lllIllIlll[4]);

                    }
                }
                if (p.llIIlIIlIllll(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlIlllI[lllIllIlll[312]];
                    if (p.llIIlIIllIlIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lllIllIlll[8]);

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

                    while (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bQ);
                        Time.sleepTicks((int)lllIllIlll[0]);

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

                    while (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bQ);
                        Time.sleepTicks((int)lllIllIlll[0]);

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

                    while (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bQ);
                        Time.sleepTicks((int)lllIllIlll[0]);

                        return;
                    }
                    int[] nArray4 = new int[lllIllIlll[0]];
                    nArray4[p.lllIllIlll[1]] = lllIllIlll[16];
                    String[] stringArray10 = new String[lllIllIlll[0]];
                    stringArray10[p.lllIllIlll[1]] = lllIlIlllI[lllIllIlll[323]];
                    Inventory.getFirst((int[])nArray4).useOn(Inventory.getFirst((String[])stringArray10));
                    Time.sleepTicks((int)lllIllIlll[8]);

                    while (p.llIIlIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bQ);
                        Time.sleepTicks((int)lllIllIlll[0]);

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

                    Widget var10 = Widgets.get((int)lllIllIlll[308], (int)lllIllIlll[0]);
                    if (p.llIIlIIllIIll(var10) && p.llIIlIIlIllll(var10.getText().contains(lllIlIlllI[lllIllIlll[328]]) ? 1 : 0)) {
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

