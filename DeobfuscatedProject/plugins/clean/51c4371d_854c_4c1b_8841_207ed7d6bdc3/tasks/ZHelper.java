/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.CHelper;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.QHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.FHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.GHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.IHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.UHelper;
import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class ZHelper
implements F {
    private static final  int hD;
    public static final  WorldArea gK;
    private static final  WorldArea hv;
    
    static  String hI;
    private static final  int hw;
    private static final  WorldPoint hh;
    static  boolean cj;
    private static final  WorldArea ht;
    public static final  WorldArea gL;
    private static final  int hA;
    public static  int hH;
    static  String[] gx;
    private static final  WorldPoint hq;
    private static final  int hy;
    public static final  WorldPoint gG;
    private static final  int hF;
    static  int ci;
    private static final  WorldPoint hf;
    private static final  int gT;
    public static final  WorldPoint gF;
    public static  int hG;
    public static final  WorldArea gI;
    private static final  WorldPoint hd;
    private static final  WorldPoint hk;
    private static final  int ha;
    private static final  WorldPoint hl;
    private static final  int hE;
    public static final  WorldArea gO;
    private static final  int hC;
    public static final  WorldPoint gH;
    private static final  int gV;
    private static final  int gW;
    public static final  WorldArea gM;
    public static final  WorldArea gN;
    private static final  WorldPoint hj;
    public static final  WorldArea gP;
    private static final  WorldPoint hm;
    private static final  int gU;
    private static final  int gQ;
    private static final  WorldPoint hn;
    
    private static final  int hc;
    private static final  WorldArea hu;
    public static final  WorldArea gJ;
    private static final  int hB;
    private static final  int gY;
    private static final  WorldPoint hs;
    private static final  WorldPoint he;
    private static final  int gR;
    private static final  WorldPoint hi;
    public static  boolean bz;
    
    private static final  WorldPoint ho;
    private static final  WorldPoint hp;
    public static  List<d> bB;
    private static final  int gZ;
    private static final  WorldPoint hg;
    private static final  int gS;
    private static final  int hb;
    private static final  int hz;
    private static final  int gX;
    private static final  WorldPoint hr;
    private static final  int hx;

    @Override
    public int U() {
        z.bs();
        return llllllII[109];
    }

    private static void llIlIIIIIll() {
        lllllIll = new String[llllllII[174]];
        z.lllllIll[z.llllllII[4]] = "Buying items";
        z.lllllIll[z.llllllII[3]] = "Finished buying items, switching back to questing";
        z.lllllIll[z.llllllII[1]] = "Breaking tab";
        z.lllllIll[z.llllllII[12]] = "Break";
        z.lllllIll[z.llllllII[15]] = "Nav to start";
        z.lllllIll[z.llllllII[13]] = "Drink";
        z.lllllIll[z.llllllII[14]] = "Boy";
        z.lllllIll[z.llllllII[18]] = "Navigating to outside door";
        z.lllllIll[z.llllllII[20]] = "Drop";
        z.lllllIll[z.llllllII[21]] = "Stealing key";
        z.lllllIll[z.llllllII[22]] = "Look-under";
        z.lllllIll[z.llllllII[24]] = "Continue";
        z.lllllIll[z.llllllII[25]] = "null";
        z.lllllIll[z.llllllII[26]] = " ";
        z.lllllIll[z.llllllII[27]] = "Nav to magnet box";
        z.lllllIll[z.llllllII[28]] = "Nav to magnet box";
        z.lllllIll[z.llllllII[29]] = "Cupboard";
        z.lllllIll[z.llllllII[30]] = "Taking magnet";
        z.lllllIll[z.llllllII[31]] = "Drop";
        z.lllllIll[z.llllllII[32]] = "Open";
        z.lllllIll[z.llllllII[33]] = "Open";
        z.lllllIll[z.llllllII[34]] = "Search";
        z.lllllIll[z.llllllII[35]] = "Search";
        z.lllllIll[z.llllllII[36]] = "Continue";
        z.lllllIll[z.llllllII[37]] = "null";
        z.lllllIll[z.llllllII[38]] = " ";
        z.lllllIll[z.llllllII[40]] = "Nav to magnet box";
        z.lllllIll[z.llllllII[41]] = "Cupboard";
        z.lllllIll[z.llllllII[42]] = "Taking magnet";
        z.lllllIll[z.llllllII[43]] = "Open";
        z.lllllIll[z.llllllII[44]] = "Open";
        z.lllllIll[z.llllllII[45]] = "Search";
        z.lllllIll[z.llllllII[46]] = "Search";
        z.lllllIll[z.llllllII[47]] = "Continue";
        z.lllllIll[z.llllllII[48]] = "null";
        z.lllllIll[z.llllllII[49]] = " ";
        z.lllllIll[z.llllllII[50]] = "Nav to cheese spot";
        z.lllllIll[z.llllllII[51]] = "Mouse hole";
        z.lllllIll[z.llllllII[52]] = "Mouse";
        z.lllllIll[z.llllllII[53]] = "Using cheese";
        z.lllllIll[z.llllllII[54]] = "Cheese";
        z.lllllIll[z.llllllII[55]] = "Cheese";
        z.lllllIll[z.llllllII[56]] = "Handle mouse";
        z.lllllIll[z.llllllII[57]] = "Entering maze";
        z.lllllIll[z.llllllII[61]] = "Handling walking";
        z.lllllIll[z.llllllII[63]] = "Door";
        z.lllllIll[z.llllllII[64]] = "Entering shed";
        z.lllllIll[z.llllllII[65]] = "Nav to safe spot";
        z.lllllIll[z.llllllII[66]] = "Eat";
        z.lllllIll[z.llllllII[67]] = "Casting spell";
        z.lllllIll[z.llllllII[68]] = "Fire rune";
        z.lllllIll[z.llllllII[69]] = "Fire rune";
        z.lllllIll[z.llllllII[70]] = "Ball";
        z.lllllIll[z.llllllII[71]] = "Ball";
        z.lllllIll[z.llllllII[72]] = "Taking ball";
        z.lllllIll[z.llllllII[73]] = "Take";
        z.lllllIll[z.llllllII[74]] = "Ball";
        z.lllllIll[z.llllllII[75]] = "Breaking tab";
        z.lllllIll[z.llllllII[76]] = "Break";
        z.lllllIll[z.llllllII[77]] = "Nav to witches start";
        z.lllllIll[z.llllllII[78]] = "Turning in quest";
        z.lllllIll[z.llllllII[79]] = "Boy";
        z.lllllIll[z.llllllII[80]] = "Drink";
        z.lllllIll[z.llllllII[81]] = "Entering maze";
        z.lllllIll[z.llllllII[83]] = "Nav to first spot";
        z.lllllIll[z.llllllII[84]] = "Nav to second spot";
        z.lllllIll[z.llllllII[85]] = "Nav to third spot";
        z.lllllIll[z.llllllII[86]] = "Nav to fountain";
        z.lllllIll[z.llllllII[87]] = "Getting key";
        z.lllllIll[z.llllllII[88]] = "Fountain";
        z.lllllIll[z.llllllII[89]] = "Check";
        z.lllllIll[z.llllllII[90]] = "Continue";
        z.lllllIll[z.llllllII[91]] = "null";
        z.lllllIll[z.llllllII[92]] = " ";
        z.lllllIll[z.llllllII[95]] = "Nav back toward maze";
        z.lllllIll[z.llllllII[96]] = "Nav to shed spot";
        z.lllllIll[z.llllllII[97]] = "Navigating to bank";
        z.lllllIll[z.llllllII[98]] = "Opening bank";
        z.lllllIll[z.llllllII[100]] = "Handling banking";
        z.lllllIll[z.llllllII[102]] = "We are missing supplies, switching to BUYING";
        z.lllllIll[z.llllllII[16]] = "We are missing supplies, switching to BUYING";
        z.lllllIll[z.llllllII[103]] = "We are missing supplies, switching to BUYING";
        z.lllllIll[z.llllllII[104]] = "We are missing supplies, switching to BUYING";
        z.lllllIll[z.llllllII[106]] = "We are missing supplies, switching to BUYING";
        z.lllllIll[z.llllllII[116]] = "Witches House quest";
        z.lllllIll[z.llllllII[117]] = "ring of wealth (";
        z.lllllIll[z.llllllII[163]] = "Wizard Mizgog";
        z.lllllIll[z.llllllII[164]] = "Give me a quest please.";
        z.lllllIll[z.llllllII[165]] = "I'll try.";
        z.lllllIll[z.llllllII[166]] = "Actually, I know where to find this stuff.";
        z.lllllIll[z.llllllII[167]] = "Yes.";
        z.lllllIll[z.llllllII[168]] = "What's the matter?";
        z.lllllIll[z.llllllII[169]] = "Ok, I'll see what I can do.";
    }

    private static boolean llIlIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String V() {
        return lllllIll[llllllII[116]];
    }

    @Override
    public boolean W() {
        boolean bl;
        if (z.llIlIIIllIl(e.j(llllllII[2]), llllllII[18])) {
            bl = llllllII[3];

            if (((0x3C ^ 0x38 ^ (0x62 ^ 0x2C)) & (0xA5 ^ 0x91 ^ (0x62 ^ 0x1C) ^ -1)) <= -1) {
                return ((7 ^ 0x5B ^ (0x1D ^ 0x7A)) & (0 ^ 0x69 ^ (0x65 ^ 0x37) ^ -1)) != 0;
            }
        } else {
            bl = llllllII[4];
        }
        return bl;
    }

    private static boolean llIlIIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void bu() {
        block30: {
            block34: {
                block32: {
                    block33: {
                        block31: {
                            void lIIllIIlIIIIllI;
                            BankLocation bankLocation = BankLocation.getNearest();
                            if (z.llIlIIIlIll(bankLocation) && z.llIlIIIlIII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = lllllIll[llllllII[97]];
                                a.a(bankLocation);
                            }
                            if (!z.llIlIIIlIll(lIIllIIlIIIIllI) || !z.llIlIIIIlll(lIIllIIlIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block30;
                            if (z.llIlIIIlIII(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderBarrows.c = lllllIll[llllllII[98]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llllllII[99]);

                            }
                            if (!z.llIlIIIIlll(Bank.isOpen() ? 1 : 0)) break block30;
                            AccBuilderBarrows.c = lllllIll[llllllII[100]];
                            if (z.llIlIIIlllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llllllII[12]);

                            }
                            if (z.llIlIIIlllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llllllII[1]);

                            }
                            while (z.llIlIIIlIII(u.aV() ? 1 : 0) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                                u.aT();
                                Time.sleepTicks((int)llllllII[3]);

                                return;
                            }
                            int[] nArray = new int[llllllII[3]];
                            nArray[z.llllllII[4]] = llllllII[7];
                            if (z.llIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[llllllII[3]];
                                nArray2[z.llllllII[4]] = llllllII[7];
                                if (z.llIlIIIIlIl(Bank.getFirst((int[])nArray2).getQuantity(), llllllII[101])) {
                                    z.ag();
                                    System.out.println(lllllIll[llllllII[102]]);
                                    bz = llllllII[3];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[llllllII[3]];
                            nArray3[z.llllllII[4]] = llllllII[6];
                            if (z.llIlIIIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llllllII[3]];
                                nArray4[z.llllllII[4]] = llllllII[6];
                                if (z.llIlIIIIlIl(Bank.getFirst((int[])nArray4).getQuantity(), llllllII[101])) {
                                    z.ag();
                                    System.out.println(lllllIll[llllllII[16]]);
                                    bz = llllllII[3];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[llllllII[3]];
                            nArray5[z.llllllII[4]] = llllllII[5];
                            if (z.llIlIIIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[llllllII[3]];
                                nArray6[z.llllllII[4]] = llllllII[5];
                                if (z.llIlIIIIlIl(Bank.getFirst((int[])nArray6).getQuantity(), llllllII[101])) {
                                    z.ag();
                                    System.out.println(lllllIll[llllllII[103]]);
                                    bz = llllllII[3];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[llllllII[3]];
                            nArray7[z.llllllII[4]] = llllllII[10];
                            if (!z.llIlIIIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) break block31;
                            int[] nArray8 = new int[llllllII[3]];
                            nArray8[z.llllllII[4]] = llllllII[10];
                            if (!z.llIlIIIllIl(Bank.getFirst((int[])nArray8).getQuantity(), llllllII[22])) break block32;
                        }
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[9];
                        if (!z.llIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray9 = new int[llllllII[3]];
                        nArray9[z.llllllII[4]] = llllllII[9];
                        if (!z.llIlIIIllIl(Bank.getFirst((int[])nArray9).getQuantity(), llllllII[13])) break block32;
                    }
                    int[] nArray = new int[llllllII[3]];
                    nArray[z.llllllII[4]] = llllllII[8];
                    if (!z.llIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                    int[] nArray10 = new int[llllllII[3]];
                    nArray10[z.llllllII[4]] = llllllII[8];
                    if (!z.llIlIIIIlIl(Bank.getFirst((int[])nArray10).getQuantity(), llllllII[33])) break block34;
                }
                z.ag();
                System.out.println(lllllIll[llllllII[104]]);
                bz = llllllII[3];
                return;
            }
            int[] nArray = new int[llllllII[18]];
            nArray[z.llllllII[4]] = llllllII[105];
            nArray[z.llllllII[3]] = llllllII[10];
            nArray[z.llllllII[1]] = llllllII[9];
            nArray[z.llllllII[12]] = llllllII[8];
            nArray[z.llllllII[15]] = llllllII[7];
            nArray[z.llllllII[13]] = llllllII[5];
            nArray[z.llllllII[14]] = llllllII[6];
            if (z.llIlIIIlIII(e.b(nArray) ? 1 : 0)) {
                z.ag();
                System.out.println(lllllIll[llllllII[106]]);
                bz = llllllII[3];
                return;
            }
            if (z.llIlIIIlIII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepTicks((int)llllllII[15]);

            }
            int[] nArray11 = new int[llllllII[3]];
            nArray11[z.llllllII[4]] = llllllII[10];
            if (z.llIlIIIIlll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[llllllII[3]];
                nArray12[z.llllllII[4]] = llllllII[10];
                if (z.llIlIIIIlIl(Inventory.getCount((int[])nArray12), llllllII[3])) {
                    Bank.withdraw((int)llllllII[10], (int)llllllII[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllllII[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[10];
                        if (z.llIlIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llllllII[3];

                            }
                        } else {
                            bl = llllllII[4];
                        }
                        return bl;
                    }, (int)llllllII[99]);

                }
            }
            int[] nArray13 = new int[llllllII[3]];
            nArray13[z.llllllII[4]] = llllllII[9];
            if (z.llIlIIIIlll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                int[] nArray14 = new int[llllllII[3]];
                nArray14[z.llllllII[4]] = llllllII[9];
                if (z.llIlIIIIlIl(Inventory.getCount((int[])nArray14), llllllII[3])) {
                    Bank.withdraw((int)llllllII[9], (int)llllllII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllllII[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[9];
                        if (z.llIlIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llllllII[3];

                        } else {
                            bl = llllllII[4];
                        }
                        return bl;
                    }, (int)llllllII[99]);

                }
            }
            int[] nArray15 = new int[llllllII[3]];
            nArray15[z.llllllII[4]] = llllllII[7];
            if (z.llIlIIIIlll(Bank.contains((int[])nArray15) ? 1 : 0)) {
                int[] nArray16 = new int[llllllII[3]];
                nArray16[z.llllllII[4]] = llllllII[7];
                if (z.llIlIIIIlIl(Inventory.getCount((int[])nArray16), llllllII[3])) {
                    Bank.withdraw((int)llllllII[7], (int)llllllII[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllllII[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[7];
                        if (z.llIlIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llllllII[3];

                            if (1 <= 0) {
                                return false;
                            }
                        } else {
                            bl = llllllII[4];
                        }
                        return bl;
                    }, (int)llllllII[99]);

                }
            }
            int[] nArray17 = new int[llllllII[3]];
            nArray17[z.llllllII[4]] = llllllII[5];
            if (z.llIlIIIIlll(Bank.contains((int[])nArray17) ? 1 : 0)) {
                int[] nArray18 = new int[llllllII[3]];
                nArray18[z.llllllII[4]] = llllllII[5];
                if (z.llIlIIIIlIl(Inventory.getCount((int[])nArray18), llllllII[3])) {
                    Bank.withdraw((int)llllllII[5], (int)llllllII[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllllII[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[5];
                        if (z.llIlIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llllllII[3];

                            if (-(0x15 ^ 0x10) >= 0) {
                                return false;
                            }
                        } else {
                            bl = llllllII[4];
                        }
                        return bl;
                    }, (int)llllllII[99]);

                }
            }
            int[] nArray19 = new int[llllllII[3]];
            nArray19[z.llllllII[4]] = llllllII[6];
            if (z.llIlIIIIlll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                int[] nArray20 = new int[llllllII[3]];
                nArray20[z.llllllII[4]] = llllllII[6];
                if (z.llIlIIIIlIl(Inventory.getCount((int[])nArray20), llllllII[3])) {
                    Bank.withdraw((int)llllllII[6], (int)llllllII[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllllII[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[6];
                        if (z.llIlIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llllllII[3];

                            if (((6 ^ 0x39) & ~(0x7A ^ 0x45)) > 0) {
                                return false;
                            }
                        } else {
                            bl = llllllII[4];
                        }
                        return bl;
                    }, (int)llllllII[99]);

                }
            }
            int[] nArray21 = new int[llllllII[3]];
            nArray21[z.llllllII[4]] = llllllII[108];
            if (z.llIlIIIIlll(Bank.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[llllllII[3]];
                nArray22[z.llllllII[4]] = llllllII[108];
                if (z.llIlIIIlIII(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                    Bank.withdraw((int)llllllII[108], (int)llllllII[3], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllllII[3]);

                    Time.sleepUntil(() -> {
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[108];
                        return Inventory.contains((int[])nArray);
                    }, (int)llllllII[99]);

                }
            }
            int[] nArray23 = new int[llllllII[3]];
            nArray23[z.llllllII[4]] = llllllII[8];
            if (z.llIlIIIIlll(Bank.contains((int[])nArray23) ? 1 : 0)) {
                int[] nArray24 = new int[llllllII[3]];
                nArray24[z.llllllII[4]] = llllllII[8];
                if (z.llIlIIIIlIl(Inventory.getCount((int[])nArray24), llllllII[3])) {
                    Bank.withdrawAll((int)llllllII[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllllII[3]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[8];
                        if (z.llIlIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llllllII[3];

                        } else {
                            bl = llllllII[4];
                        }
                        return bl;
                    }, (int)llllllII[99]);

                }
            }
        }
    }

    @Override
    public boolean T() {
        return llllllII[4];
    }

    private static boolean llIlIIIllII(Object object) {
        return object == null;
    }

    private static boolean llIlIIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIIIlIll(Object object) {
        return object != null;
    }

    private static boolean llIlIIIlIII(int n2) {
        return n2 == 0;
    }

    public static void bs() {
        TileObject lIIllIIlIIIllll2;
        block91: {
            block93: {
                block92: {
                    block89: {
                        block90: {
                            Widget lIIllIIlIIIlllI;
                            if (z.llIlIIIIlIl(e.j(llllllII[0]), llllllII[1])) {
                                try {
                                    C.bI();

                                }
                                catch (Exception lIIllIIlIIIllll2) {
                                    lIIllIIlIIIllll2.printStackTrace();
                                }
                                if (((0x63 ^ 0x26) & ~(0x34 ^ 0x71)) > (0x84 ^ 0x80)) {
                                    return;
                                }
                            }
                            if (z.llIlIIIIllI(e.j(llllllII[0]), llllllII[1]) && z.llIlIIIIlIl(e.j(llllllII[2]), llllllII[3])) {
                                block88: {
                                    if (z.llIlIIIIlll(bz ? 1 : 0)) {
                                        AccBuilderBarrows.c = lllllIll[llllllII[4]];
                                        b.a(bB);
                                        if (z.llIlIIIIlIl(bB.size(), llllllII[3])) {
                                            System.out.println(lllllIll[llllllII[3]]);
                                            bz = llllllII[4];
                                        }
                                    }
                                    do {
                                        if (z.llIlIIIIlll(u.aV() ? 1 : 0)) {
                                            int[] nArray = new int[llllllII[3]];
                                            nArray[z.llllllII[4]] = llllllII[5];
                                            if (z.llIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                int[] nArray2 = new int[llllllII[3]];
                                                nArray2[z.llllllII[4]] = llllllII[6];
                                                if (z.llIlIIIIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                                    int[] nArray3 = new int[llllllII[3]];
                                                    nArray3[z.llllllII[4]] = llllllII[7];
                                                    if (z.llIlIIIIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                                        int[] nArray4 = new int[llllllII[3]];
                                                        nArray4[z.llllllII[4]] = llllllII[8];
                                                        if (z.llIlIIIIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                                            int[] nArray5 = new int[llllllII[3]];
                                                            nArray5[z.llllllII[4]] = llllllII[9];
                                                            if (z.llIlIIIIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                                                int[] nArray6 = new int[llllllII[3]];
                                                                nArray6[z.llllllII[4]] = llllllII[10];
                                                                if (!z.llIlIIIlIII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block88;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) break block88;
                                        z.bu();
                                        Time.sleepTicks((int)llllllII[3]);

                                    } while (2 >= ((0x51 ^ 0x17) & ~(0x6C ^ 0x2A)));
                                    return;
                                }
                                if (z.llIlIIIlIII(bz ? 1 : 0)) {
                                    if (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[11])) {
                                        int[] nArray = new int[llllllII[3]];
                                        nArray[z.llllllII[4]] = llllllII[10];
                                        if (z.llIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                            AccBuilderBarrows.c = lllllIll[llllllII[1]];
                                            int[] nArray7 = new int[llllllII[3]];
                                            nArray7[z.llllllII[4]] = llllllII[10];
                                            Inventory.getFirst((int[])nArray7).interact(lllllIll[llllllII[12]]);
                                            Time.sleepTicks((int)llllllII[13]);

                                        }
                                    }
                                    if (z.llIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[11]) && z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[14])) {
                                        AccBuilderBarrows.c = lllllIll[llllllII[15]];
                                        if (z.llIlIIIIlll(Inventory.contains((int[])f.bb) ? 1 : 0) && z.llIlIIIIlIl(Movement.getRunEnergy(), llllllII[16])) {
                                            Inventory.getFirst((int[])f.bb).interact(lllllIll[llllllII[13]]);
                                            Time.sleepTicks((int)llllllII[3]);

                                        }
                                        Movement.walkTo((WorldPoint)he);

                                        Time.sleepTicks((int)llllllII[3]);

                                    }
                                    if (z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[14])) {
                                        g.a(lllllIll[llllllII[14]], gx);
                                    }
                                }
                            }
                            if (z.llIlIIIIllI(e.j(llllllII[0]), llllllII[1]) && z.llIlIIIIllI(e.j(llllllII[2]), llllllII[3])) {
                                if (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hh), llllllII[15]) && z.llIlIIIlIII(hu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[llllllII[3]];
                                    nArray[z.llllllII[4]] = llllllII[17];
                                    if (z.llIlIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        AccBuilderBarrows.c = lllllIll[llllllII[18]];
                                        Movement.walkTo((WorldPoint)hh);

                                        Time.sleepTicks((int)llllllII[3]);

                                    }
                                }
                                if (z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hh), llllllII[15]) && z.llIlIIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    int[] nArray = new int[llllllII[3]];
                                    nArray[z.llllllII[4]] = llllllII[17];
                                    if (z.llIlIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray8 = new int[llllllII[3]];
                                        nArray8[z.llllllII[4]] = llllllII[19];
                                        lIIllIIlIIIllll2 = TileObjects.getNearest((int[])nArray8);
                                        if (z.llIlIIIIlll(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray9 = new int[llllllII[3]];
                                            nArray9[z.llllllII[4]] = llllllII[8];
                                            Inventory.getFirst((int[])nArray9).interact(lllllIll[llllllII[20]]);
                                            Time.sleepTicks((int)llllllII[3]);

                                        }
                                        if (z.llIlIIIlIII(Inventory.isFull() ? 1 : 0)) {
                                            if (z.llIlIIIlIll(lIIllIIlIIIllll2) && z.llIlIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                                                AccBuilderBarrows.c = lllllIll[llllllII[21]];
                                                lIIllIIlIIIllll2.interact(lllllIll[llllllII[22]]);
                                                Dialog.continueSpace();
                                            }
                                            if (z.llIlIIIlIll(lIIllIIlIIIlllI = Widgets.get((int)llllllII[23], (int)llllllII[3]))) {
                                                lIIllIIlIIIlllI.interact(lllllIll[llllllII[24]]);
                                                lIIllIIlIIIlllI.interact(llllllII[4]);
                                                lIIllIIlIIIlllI.interact(lllllIll[llllllII[25]]);
                                                Keyboard.type((String)lllllIll[llllllII[26]]);
                                            }
                                        }
                                    }
                                }
                                if (z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hh), llllllII[15])) {
                                    int[] nArray = new int[llllllII[3]];
                                    nArray[z.llllllII[4]] = llllllII[17];
                                    if (z.llIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0) && z.llIlIIIlIII(ht.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderBarrows.c = lllllIll[llllllII[27]];
                                        Movement.walkTo((WorldPoint)hl);

                                        Time.sleepTicks((int)llllllII[3]);

                                    }
                                }
                                if (z.llIlIIIIlll(hu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderBarrows.c = lllllIll[llllllII[28]];
                                    if (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hl), llllllII[3])) {
                                        Movement.walkTo((WorldPoint)hl);

                                        Time.sleepTicks((int)llllllII[3]);

                                    }
                                    if (z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hl), llllllII[3])) {
                                        String[] stringArray = new String[llllllII[3]];
                                        stringArray[z.llllllII[4]] = lllllIll[llllllII[29]];
                                        lIIllIIlIIIllll2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderBarrows.c = lllllIll[llllllII[30]];
                                        if (z.llIlIIIIlll(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray = new int[llllllII[3]];
                                            nArray[z.llllllII[4]] = llllllII[8];
                                            Inventory.getFirst((int[])nArray).interact(lllllIll[llllllII[31]]);
                                            Time.sleepTicks((int)llllllII[3]);

                                        }
                                        if (z.llIlIIIlIll(lIIllIIlIIIllll2)) {
                                            String[] stringArray2 = new String[llllllII[3]];
                                            stringArray2[z.llllllII[4]] = lllllIll[llllllII[32]];
                                            if (z.llIlIIIIlll(lIIllIIlIIIllll2.hasAction(stringArray2) ? 1 : 0)) {
                                                lIIllIIlIIIllll2.interact(lllllIll[llllllII[33]]);
                                                Time.sleepTicks((int)llllllII[1]);

                                            }
                                            String[] stringArray3 = new String[llllllII[3]];
                                            stringArray3[z.llllllII[4]] = lllllIll[llllllII[34]];
                                            if (z.llIlIIIIlll(lIIllIIlIIIllll2.hasAction(stringArray3) ? 1 : 0)) {
                                                lIIllIIlIIIllll2.interact(lllllIll[llllllII[35]]);
                                                Time.sleepTicks((int)llllllII[1]);

                                                lIIllIIlIIIlllI = Widgets.get((int)llllllII[23], (int)llllllII[3]);
                                                if (z.llIlIIIlIll(lIIllIIlIIIlllI)) {
                                                    lIIllIIlIIIlllI.interact(lllllIll[llllllII[36]]);
                                                    lIIllIIlIIIlllI.interact(llllllII[4]);
                                                    lIIllIIlIIIlllI.interact(lllllIll[llllllII[37]]);
                                                    Keyboard.type((String)lllllIll[llllllII[38]]);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (z.llIlIIIIllI(e.j(llllllII[0]), llllllII[1]) && z.llIlIIIIllI(e.j(llllllII[2]), llllllII[1])) {
                                ci = llllllII[4];
                                if (z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[22])) {
                                    while (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hh), llllllII[1]) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)hh);

                                        Time.sleepTicks((int)llllllII[3]);

                                        if ((0x78 ^ 0x7D) > 0) continue;
                                        return;
                                    }
                                }
                                int[] nArray = new int[llllllII[3]];
                                nArray[z.llllllII[4]] = llllllII[39];
                                if (z.llIlIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && z.llIlIIIIlll(hu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderBarrows.c = lllllIll[llllllII[40]];
                                    if (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hl), llllllII[3])) {
                                        Movement.walkTo((WorldPoint)hl);

                                        Time.sleepTicks((int)llllllII[3]);

                                    }
                                    if (z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hl), llllllII[3])) {
                                        String[] stringArray = new String[llllllII[3]];
                                        stringArray[z.llllllII[4]] = lllllIll[llllllII[41]];
                                        lIIllIIlIIIllll2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderBarrows.c = lllllIll[llllllII[42]];
                                        if (z.llIlIIIlIll(lIIllIIlIIIllll2)) {
                                            String[] stringArray4 = new String[llllllII[3]];
                                            stringArray4[z.llllllII[4]] = lllllIll[llllllII[43]];
                                            if (z.llIlIIIIlll(lIIllIIlIIIllll2.hasAction(stringArray4) ? 1 : 0)) {
                                                lIIllIIlIIIllll2.interact(lllllIll[llllllII[44]]);
                                                Time.sleepTicks((int)llllllII[1]);

                                            }
                                            String[] stringArray5 = new String[llllllII[3]];
                                            stringArray5[z.llllllII[4]] = lllllIll[llllllII[45]];
                                            if (z.llIlIIIIlll(lIIllIIlIIIllll2.hasAction(stringArray5) ? 1 : 0)) {
                                                lIIllIIlIIIllll2.interact(lllllIll[llllllII[46]]);
                                                Time.sleepTicks((int)llllllII[1]);

                                                lIIllIIlIIIlllI = Widgets.get((int)llllllII[23], (int)llllllII[3]);
                                                if (z.llIlIIIlIll(lIIllIIlIIIlllI)) {
                                                    lIIllIIlIIIlllI.interact(lllllIll[llllllII[47]]);
                                                    lIIllIIlIIIlllI.interact(llllllII[4]);
                                                    lIIllIIlIIIlllI.interact(lllllIll[llllllII[48]]);
                                                    Keyboard.type((String)lllllIll[llllllII[49]]);
                                                }
                                            }
                                        }
                                    }
                                }
                                int[] nArray10 = new int[llllllII[3]];
                                nArray10[z.llllllII[4]] = llllllII[39];
                                if (z.llIlIIIIlll(Inventory.contains((int[])nArray10) ? 1 : 0) && z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hi), llllllII[3])) {
                                    AccBuilderBarrows.c = lllllIll[llllllII[50]];
                                    Movement.walkTo((WorldPoint)hi);

                                    Time.sleepTicks((int)llllllII[3]);

                                }
                                if (z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hi), llllllII[1])) {
                                    String[] stringArray = new String[llllllII[3]];
                                    stringArray[z.llllllII[4]] = lllllIll[llllllII[51]];
                                    lIIllIIlIIIllll2 = TileObjects.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[llllllII[3]];
                                    stringArray6[z.llllllII[4]] = lllllIll[llllllII[52]];
                                    lIIllIIlIIIlllI = NPCs.getNearest((String[])stringArray6);
                                    if (z.llIlIIIlIll(lIIllIIlIIIllll2) && z.llIlIIIllII(lIIllIIlIIIlllI)) {
                                        AccBuilderBarrows.c = lllllIll[llllllII[53]];
                                        String[] stringArray7 = new String[llllllII[3]];
                                        stringArray7[z.llllllII[4]] = lllllIll[llllllII[54]];
                                        if (z.llIlIIIIlll(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[llllllII[3]];
                                            stringArray8[z.llllllII[4]] = lllllIll[llllllII[55]];
                                            Inventory.getFirst((String[])stringArray8).useOn(lIIllIIlIIIllll2);
                                        }
                                        Time.sleepTicks((int)llllllII[3]);

                                    }
                                    if (z.llIlIIIlIll(lIIllIIlIIIlllI)) {
                                        AccBuilderBarrows.c = lllllIll[llllllII[56]];
                                        int[] nArray11 = new int[llllllII[3]];
                                        nArray11[z.llllllII[4]] = llllllII[39];
                                        if (z.llIlIIIIlll(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                            int[] nArray12 = new int[llllllII[3]];
                                            nArray12[z.llllllII[4]] = llllllII[39];
                                            Inventory.getFirst((int[])nArray12).useOn((Actor)lIIllIIlIIIlllI);
                                        }
                                        Time.sleepTicks((int)llllllII[3]);

                                    }
                                }
                            }
                            if (z.llIlIIIIlll(ht.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.llIlIIIIllI(e.j(llllllII[2]), llllllII[12])) {
                                AccBuilderBarrows.c = lllllIll[llllllII[57]];
                                Movement.walkTo((WorldPoint)new WorldPoint(llllllII[58], llllllII[59], llllllII[4]));

                                Time.sleepTicks((int)llllllII[3]);

                            }
                            if (!z.llIlIIIlIII(ht.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !z.llIlIIIIllI(e.j(llllllII[2]), llllllII[12])) break block89;
                            int[] nArray = new int[llllllII[3]];
                            nArray[z.llllllII[4]] = llllllII[60];
                            if (!z.llIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block90;
                            int[] nArray13 = new int[llllllII[3]];
                            nArray13[z.llllllII[4]] = llllllII[60];
                            if (!z.llIlIIIIlll(Inventory.contains((int[])nArray13) ? 1 : 0) || !z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hr), llllllII[12])) break block89;
                        }
                        AccBuilderBarrows.c = lllllIll[llllllII[61]];
                        if (z.llIlIIIllIl(Movement.getRunEnergy(), llllllII[33])) {
                            z.bt();
                        }
                    }
                    if (z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hr), llllllII[12])) {
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[60];
                        if (z.llIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0) && z.llIlIIIIllI(Players.getLocal().getWorldLocation().getX(), llllllII[62])) {
                            String[] stringArray = new String[llllllII[3]];
                            stringArray[z.llllllII[4]] = lllllIll[llllllII[63]];
                            lIIllIIlIIIllll2 = TileObjects.getNearest((String[])stringArray);
                            if (z.llIlIIIlIll(lIIllIIlIIIllll2)) {
                                AccBuilderBarrows.c = lllllIll[llllllII[64]];
                                int[] nArray14 = new int[llllllII[3]];
                                nArray14[z.llllllII[4]] = llllllII[60];
                                if (z.llIlIIIIlll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                    int[] nArray15 = new int[llllllII[3]];
                                    nArray15[z.llllllII[4]] = llllllII[60];
                                    Inventory.getFirst((int[])nArray15).useOn(lIIllIIlIIIllll2);
                                    Time.sleepTicks((int)llllllII[1]);

                                }
                            }
                        }
                    }
                    if (!z.llIlIIIIlll(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block91;
                    int[] nArray = new int[llllllII[3]];
                    nArray[z.llllllII[4]] = llllllII[60];
                    if (!z.llIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block91;
                    if (z.llIlIIIlIII(Players.getLocal().getWorldLocation().equals((Object)hf) ? 1 : 0)) {
                        AccBuilderBarrows.c = lllllIll[llllllII[65]];
                        Movement.walkTo((WorldPoint)hf);

                    }
                    if (z.llIlIIIlIlI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llllllII[13])) {
                        int[] nArray16 = new int[llllllII[3]];
                        nArray16[z.llllllII[4]] = llllllII[8];
                        if (z.llIlIIIIlll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                            int[] nArray17 = new int[llllllII[3]];
                            nArray17[z.llllllII[4]] = llllllII[8];
                            Inventory.getFirst((int[])nArray17).interact(lllllIll[llllllII[66]]);
                        }
                    }
                    if (!z.llIlIIIIlll(Players.getLocal().getWorldLocation().equals((Object)hf) ? 1 : 0) || !z.llIlIIIlIll(lIIllIIlIIIllll2 = NPCs.getNearest((int[])hJ)) || !z.llIlIIIlIII(lIIllIIlIIIllll2.isDead() ? 1 : 0)) break block91;
                    AccBuilderBarrows.c = lllllIll[llllllII[67]];
                    if (z.llIlIIIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llllllII[21])) {
                        Magic.cast((Spell)SpellBook.Standard.WATER_STRIKE, (NPC)lIIllIIlIIIllll2);
                        Time.sleepTicks((int)llllllII[3]);

                    }
                    if (z.llIlIIIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llllllII[26]) && !z.llIlIIIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llllllII[21])) break block92;
                    if (!z.llIlIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), llllllII[21])) break block93;
                    int[] nArray18 = new int[llllllII[3]];
                    nArray18[z.llllllII[4]] = llllllII[6];
                    if (!z.llIlIIIIlll(Inventory.contains((int[])nArray18) ? 1 : 0)) break block93;
                    String[] stringArray = new String[llllllII[3]];
                    stringArray[z.llllllII[4]] = lllllIll[llllllII[68]];
                    if (!z.llIlIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block93;
                }
                Magic.cast((Spell)SpellBook.Standard.EARTH_STRIKE, (NPC)lIIllIIlIIIllll2);
                Time.sleepTicks((int)llllllII[3]);

            }
            if (z.llIlIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), llllllII[26])) {
                String[] stringArray = new String[llllllII[3]];
                stringArray[z.llllllII[4]] = lllllIll[llllllII[69]];
                if (z.llIlIIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)lIIllIIlIIIllll2);
                    Time.sleepTicks((int)llllllII[3]);

                }
            }
        }
        if (z.llIlIIIIllI(e.j(llllllII[2]), llllllII[14])) {
            String[] stringArray = new String[llllllII[3]];
            stringArray[z.llllllII[4]] = lllllIll[llllllII[70]];
            if (z.llIlIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray9 = new String[llllllII[3]];
                stringArray9[z.llllllII[4]] = lllllIll[llllllII[71]];
                lIIllIIlIIIllll2 = TileItems.getNearest((String[])stringArray9);
                if (z.llIlIIIlIll(lIIllIIlIIIllll2)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[72]];
                    lIIllIIlIIIllll2.interact(lllllIll[llllllII[73]]);
                    Time.sleepTicks((int)llllllII[1]);

                }
            }
        }
        if (z.llIlIIIIllI(e.j(llllllII[2]), llllllII[14])) {
            String[] stringArray = new String[llllllII[3]];
            stringArray[z.llllllII[4]] = lllllIll[llllllII[74]];
            if (z.llIlIIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                if (z.llIlIIIIlll(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[llllllII[3]];
                    nArray[z.llllllII[4]] = llllllII[10];
                    if (z.llIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        AccBuilderBarrows.c = lllllIll[llllllII[75]];
                        int[] nArray19 = new int[llllllII[3]];
                        nArray19[z.llllllII[4]] = llllllII[10];
                        Inventory.getFirst((int[])nArray19).interact(lllllIll[llllllII[76]]);
                        Time.sleepTicks((int)llllllII[13]);

                    }
                }
                if (z.llIlIIIlIII(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[15])) {
                    AccBuilderBarrows.c = lllllIll[llllllII[77]];
                    Movement.walkTo((WorldPoint)he);

                    Time.sleepTicks((int)llllllII[3]);

                }
                if (z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[13])) {
                    AccBuilderBarrows.c = lllllIll[llllllII[78]];
                    if (z.llIlIIIIlIl(ci, llllllII[3])) {
                        Q.jv += llllllII[3];
                        Q.o(AccBuilderBarrows.m);
                        ci += llllllII[3];
                        Q.jv = llllllII[4];
                        cj = llllllII[4];
                    }
                    g.a(lllllIll[llllllII[79]], gx);
                }
            }
        }
    }

    private static boolean llIlIIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIIIlllI(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static void bt() {
        if (z.llIlIIIIlll(Inventory.contains((int[])f.bb) ? 1 : 0) && z.llIlIIIIlIl(Movement.getRunEnergy(), llllllII[68])) {
            Inventory.getFirst((int[])f.bb).interact(lllllIll[llllllII[80]]);
            Time.sleepTicks((int)llllllII[3]);

        }
        if (z.llIlIIIlIII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!z.llIlIIIlIII(ht.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hi), llllllII[1])) {
            AccBuilderBarrows.c = lllllIll[llllllII[81]];
            Movement.walkTo((WorldPoint)new WorldPoint(llllllII[58], llllllII[59], llllllII[4]));

            Time.sleepTicks((int)llllllII[3]);

        }
        int[] nArray = new int[llllllII[3]];
        nArray[z.llllllII[4]] = llllllII[82];
        NPC lIIllIIlIIIlIlI = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[llllllII[3]];
        nArray2[z.llllllII[4]] = llllllII[60];
        if (z.llIlIIIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            if (z.llIlIIIIlll(gI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.llIlIIIlIll(lIIllIIlIIIlIlI) && z.llIlIIIIlll(gO.contains(lIIllIIlIIIlIlI.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)llllllII[24]);

                while (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gF), llllllII[3]) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[83]];
                    Movement.walkTo((WorldPoint)gF);

                    Time.sleepTicks((int)llllllII[3]);

                    if (3 == 3) continue;
                    return;
                }
            }
            if (z.llIlIIIIlll(gJ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.llIlIIIlIll(lIIllIIlIIIlIlI) && z.llIlIIIIlll(gL.contains(lIIllIIlIIIlIlI.getWorldLocation()) ? 1 : 0)) {
                while (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gG), llllllII[3]) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[84]];
                    Movement.walkTo((WorldPoint)gG);

                    Time.sleepTicks((int)llllllII[3]);

                    if (((0xD4 ^ 0xC6 ^ (0x7F ^ 0x5A)) & (0xB7 ^ 0x82 ^ 2 ^ -1)) == 0) continue;
                    return;
                }
            }
            if (z.llIlIIIIlll(gK.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.llIlIIIlIll(lIIllIIlIIIlIlI) && z.llIlIIIIlll(gP.contains(lIIllIIlIIIlIlI.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)llllllII[18]);

                while (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gH), llllllII[3]) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[85]];
                    Movement.walkTo((WorldPoint)gH);

                    Time.sleepTicks((int)llllllII[3]);

                    if (3 >= 2) continue;
                    return;
                }
            }
            if (z.llIlIIIIlll(gN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.llIlIIIlIll(lIIllIIlIIIlIlI) && z.llIlIIIIlll(gP.contains(lIIllIIlIIIlIlI.getWorldLocation()) ? 1 : 0)) {
                while (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hs), llllllII[1]) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[86]];
                    Movement.walkTo((WorldPoint)hs);

                    Time.sleepTicks((int)llllllII[3]);

                    return;
                }
            }
            if (z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hs), llllllII[12])) {
                AccBuilderBarrows.c = lllllIll[llllllII[87]];
                String[] stringArray = new String[llllllII[3]];
                stringArray[z.llllllII[4]] = lllllIll[llllllII[88]];
                TileObject lIIllIIlIIIlIIl = TileObjects.getNearest((String[])stringArray);
                if (z.llIlIIIlIll(lIIllIIlIIIlIIl)) {
                    lIIllIIlIIIlIIl.interact(lllllIll[llllllII[89]]);
                    Time.sleepTicks((int)llllllII[1]);

                    Widget lIIllIIlIIIlIII = Widgets.get((int)llllllII[23], (int)llllllII[3]);
                    if (z.llIlIIIlIll(lIIllIIlIIIlIII)) {
                        lIIllIIlIIIlIII.interact(lllllIll[llllllII[90]]);
                        lIIllIIlIIIlIII.interact(llllllII[4]);
                        lIIllIIlIIIlIII.interact(lllllIll[llllllII[91]]);
                        Keyboard.type((String)lllllIll[llllllII[92]]);
                    }
                }
            }
        }
        int[] nArray3 = new int[llllllII[3]];
        nArray3[z.llllllII[4]] = llllllII[60];
        if (z.llIlIIIIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            if (z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hs), llllllII[12])) {
                while (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllllII[93], llllllII[94], llllllII[4])), llllllII[3]) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[95]];
                    Movement.walkTo((WorldPoint)new WorldPoint(llllllII[93], llllllII[94], llllllII[4]));

                    Time.sleepTicks((int)llllllII[3]);

                    return;
                }
            }
            if (z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllllII[93], llllllII[94], llllllII[4])), llllllII[1]) && z.llIlIIIlIll(lIIllIIlIIIlIlI) && z.llIlIIIIlll(gO.contains(lIIllIIlIIIlIlI.getWorldLocation()) ? 1 : 0)) {
                while (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gG), llllllII[3]) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[96]];
                    Movement.walkTo((WorldPoint)gG);

                    Time.sleepTicks((int)llllllII[3]);

                    if ((81 + 140 - 167 + 121 ^ 73 + 137 - 177 + 138) != 0) continue;
                    return;
                }
            }
        }
    }

        return String.valueOf(lIIllIIIllIlIII);
    }

    private static void ag() {
        d lIIllIIlIIIIIlI;
        block23: {
            block22: {
                Object lIIllIIlIIIIIll;
                block21: {
                    block20: {
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[8];
                        if (z.llIlIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(llllllII[8], llllllII[109], llllllII[110]);
                            bB.add(d2);

                        }
                        int[] nArray2 = new int[llllllII[3]];
                        nArray2[z.llllllII[4]] = llllllII[8];
                        if (z.llIlIIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llllllII[3]];
                            nArray3[z.llllllII[4]] = llllllII[8];
                            if (z.llIlIIIIlIl(Bank.getFirst((int[])nArray3).getQuantity(), llllllII[33])) {
                                lIIllIIlIIIIIll = new DHelper(llllllII[8], llllllII[54], llllllII[110]);
                                bB.add((DHelper) IIllIIlIIIIIll);

                            }
                        }
                        int[] nArray4 = new int[llllllII[3]];
                        nArray4[z.llllllII[4]] = llllllII[9];
                        if (z.llIlIIIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIIllIIlIIIIIll = new DHelper(llllllII[9], llllllII[13], llllllII[111]);
                            bB.add((DHelper) IIllIIlIIIIIll);

                        }
                        int[] nArray5 = new int[llllllII[3]];
                        nArray5[z.llllllII[4]] = llllllII[9];
                        if (!z.llIlIIIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                        int[] nArray6 = new int[llllllII[3]];
                        nArray6[z.llllllII[4]] = llllllII[9];
                        if (!z.llIlIIIIlll(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                        int[] nArray7 = new int[llllllII[3]];
                        nArray7[z.llllllII[4]] = llllllII[9];
                        if (!z.llIlIIIIlIl(Bank.getFirst((int[])nArray7).getQuantity(), llllllII[13])) break block21;
                    }
                    lIIllIIlIIIIIll = new DHelper(llllllII[9], llllllII[13], llllllII[111]);
                    bB.add((DHelper) IIllIIlIIIIIll);

                }
                if (z.llIlIIIlIII(Bank.contains((Predicate)(lIIllIIlIIIIIll = item -> item.getName().toLowerCase().contains(lllllIll[llllllII[117]]))) ? 1 : 0)) {
                    lIIllIIlIIIIIlI = new DHelper(llllllII[112], llllllII[31], llllllII[113]);
                    bB.add(lIIllIIlIIIIIlI);

                }
                int[] nArray = new int[llllllII[3]];
                nArray[z.llllllII[4]] = llllllII[105];
                if (z.llIlIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lIIllIIlIIIIIlI = new DHelper(llllllII[105], llllllII[54], llllllII[114]);
                    bB.add(lIIllIIlIIIIIlI);

                }
                int[] nArray8 = new int[llllllII[3]];
                nArray8[z.llllllII[4]] = llllllII[10];
                if (z.llIlIIIlIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    lIIllIIlIIIIIlI = new DHelper(llllllII[10], llllllII[33], llllllII[114]);
                    bB.add(lIIllIIlIIIIIlI);

                }
                int[] nArray9 = new int[llllllII[3]];
                nArray9[z.llllllII[4]] = llllllII[10];
                if (!z.llIlIIIIlll(Bank.contains((int[])nArray9) ? 1 : 0)) break block22;
                int[] nArray10 = new int[llllllII[3]];
                nArray10[z.llllllII[4]] = llllllII[10];
                if (!z.llIlIIIIlll(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                int[] nArray11 = new int[llllllII[3]];
                nArray11[z.llllllII[4]] = llllllII[10];
                if (!z.llIlIIIIlIl(Bank.getFirst((int[])nArray11).getQuantity(), llllllII[22])) break block23;
            }
            lIIllIIlIIIIIlI = new DHelper(llllllII[10], llllllII[33], llllllII[114]);
            bB.add(lIIllIIlIIIIIlI);

        }
        int[] nArray = new int[llllllII[3]];
        nArray[z.llllllII[4]] = llllllII[108];
        if (z.llIlIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIllIIlIIIIIlI = new DHelper(llllllII[108], llllllII[13], i.bw);
            bB.add(lIIllIIlIIIIIlI);

        }
        int[] nArray12 = new int[llllllII[3]];
        nArray12[z.llllllII[4]] = llllllII[7];
        if (z.llIlIIIIlll(Bank.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[llllllII[3]];
            nArray13[z.llllllII[4]] = llllllII[7];
            if (z.llIlIIIIlIl(Bank.getFirst((int[])nArray13).getQuantity(), llllllII[101])) {
                lIIllIIlIIIIIlI = new DHelper(llllllII[7], llllllII[115], llllllII[18]);
                bB.add(lIIllIIlIIIIIlI);

            }
        }
        int[] nArray14 = new int[llllllII[3]];
        nArray14[z.llllllII[4]] = llllllII[5];
        if (z.llIlIIIIlll(Bank.contains((int[])nArray14) ? 1 : 0)) {
            int[] nArray15 = new int[llllllII[3]];
            nArray15[z.llllllII[4]] = llllllII[5];
            if (z.llIlIIIIlIl(Bank.getFirst((int[])nArray15).getQuantity(), llllllII[101])) {
                lIIllIIlIIIIIlI = new DHelper(llllllII[5], llllllII[115], llllllII[18]);
                bB.add(lIIllIIlIIIIIlI);

            }
        }
        int[] nArray16 = new int[llllllII[3]];
        nArray16[z.llllllII[4]] = llllllII[6];
        if (z.llIlIIIIlll(Bank.contains((int[])nArray16) ? 1 : 0)) {
            int[] nArray17 = new int[llllllII[3]];
            nArray17[z.llllllII[4]] = llllllII[6];
            if (z.llIlIIIIlIl(Bank.getFirst((int[])nArray17).getQuantity(), llllllII[101])) {
                lIIllIIlIIIIIlI = new DHelper(llllllII[6], llllllII[115], llllllII[18]);
                bB.add(lIIllIIlIIIIIlI);

            }
        }
    }

    static {
        z.llIlIIIIlII();
        z.llIlIIIIIll();
        gS = llllllII[2];
        hb = llllllII[39];
        hE = llllllII[8];
        gT = llllllII[3];
        gQ = llllllII[0];
        hw = llllllII[118];
        ha = llllllII[60];
        gX = llllllII[18];
        hF = llllllII[9];
        gZ = llllllII[17];
        gU = llllllII[1];
        hA = llllllII[7];
        hz = llllllII[119];
        gY = llllllII[82];
        hx = llllllII[120];
        hD = llllllII[121];
        hC = llllllII[6];
        gR = llllllII[1];
        hc = llllllII[19];
        gV = llllllII[12];
        hB = llllllII[5];
        gW = llllllII[14];
        hy = llllllII[122];
        gF = new WorldPoint(llllllII[123], llllllII[59], llllllII[4]);
        gG = new WorldPoint(llllllII[62], llllllII[124], llllllII[4]);
        gH = new WorldPoint(llllllII[125], llllllII[94], llllllII[4]);
        gI = new WorldArea(llllllII[126], llllllII[127], llllllII[31], llllllII[14], llllllII[4]);
        gJ = new WorldArea(llllllII[128], llllllII[127], llllllII[30], llllllII[14], llllllII[4]);
        gK = new WorldArea(llllllII[129], llllllII[130], llllllII[15], llllllII[22], llllllII[4]);
        gL = new WorldArea(llllllII[131], llllllII[132], llllllII[24], llllllII[15], llllllII[4]);
        gM = new WorldArea(llllllII[133], llllllII[132], llllllII[18], llllllII[13], llllllII[4]);
        gN = new WorldArea(llllllII[134], llllllII[135], llllllII[21], llllllII[18], llllllII[4]);
        gO = new WorldArea(llllllII[136], llllllII[132], llllllII[15], llllllII[15], llllllII[4]);
        gP = new WorldArea(llllllII[137], llllllII[132], llllllII[15], llllllII[13], llllllII[4]);
        hd = new WorldPoint(llllllII[138], llllllII[139], llllllII[1]);
        he = new WorldPoint(llllllII[140], llllllII[141], llllllII[4]);
        hf = new WorldPoint(llllllII[142], llllllII[127], llllllII[4]);
        hg = new WorldPoint(llllllII[143], llllllII[144], llllllII[4]);
        hh = new WorldPoint(llllllII[145], llllllII[146], llllllII[4]);
        hi = new WorldPoint(llllllII[131], llllllII[94], llllllII[4]);
        hj = new WorldPoint(llllllII[147], llllllII[148], llllllII[4]);
        hk = new WorldPoint(llllllII[149], llllllII[150], llllllII[4]);
        hl = new WorldPoint(llllllII[145], llllllII[151], llllllII[4]);
        hm = new WorldPoint(llllllII[131], llllllII[151], llllllII[4]);
        hn = new WorldPoint(llllllII[131], llllllII[152], llllllII[4]);
        ho = new WorldPoint(llllllII[136], llllllII[151], llllllII[4]);
        hp = new WorldPoint(llllllII[136], llllllII[152], llllllII[4]);
        hq = new WorldPoint(llllllII[58], llllllII[153], llllllII[4]);
        hr = new WorldPoint(llllllII[62], llllllII[135], llllllII[4]);
        hs = new WorldPoint(llllllII[154], llllllII[155], llllllII[4]);
        ht = new WorldArea(new WorldPoint(llllllII[156], llllllII[157], llllllII[4]), new WorldPoint(llllllII[58], llllllII[94], llllllII[4]));
        hu = new WorldArea(new WorldPoint(llllllII[145], llllllII[158], llllllII[4]), new WorldPoint(llllllII[159], llllllII[160], llllllII[4]));
        hv = new WorldArea(llllllII[62], llllllII[130], llllllII[14], llllllII[22], llllllII[4]);
        bB = new ArrayList<d>();
        hG = llllllII[161];
        hH = llllllII[162];
        hI = lllllIll[llllllII[163]];
        String[] stringArray = new String[llllllII[14]];
        stringArray[z.llllllII[4]] = lllllIll[llllllII[164]];
        stringArray[z.llllllII[3]] = lllllIll[llllllII[165]];
        stringArray[z.llllllII[1]] = lllllIll[llllllII[166]];
        stringArray[z.llllllII[12]] = lllllIll[llllllII[167]];
        stringArray[z.llllllII[15]] = lllllIll[llllllII[168]];
        stringArray[z.llllllII[13]] = lllllIll[llllllII[169]];
        gx = stringArray;
        int[] nArray = new int[llllllII[15]];
        nArray[z.llllllII[4]] = llllllII[170];
        nArray[z.llllllII[3]] = llllllII[171];
        nArray[z.llllllII[1]] = llllllII[172];
        nArray[z.llllllII[12]] = llllllII[173];
        hJ = nArray;
    }
}

