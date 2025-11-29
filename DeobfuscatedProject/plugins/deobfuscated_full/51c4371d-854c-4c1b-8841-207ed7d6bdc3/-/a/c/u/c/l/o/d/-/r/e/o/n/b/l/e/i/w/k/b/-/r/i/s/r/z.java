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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.C;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.u;
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

public class z
implements F {
    private static final /* synthetic */ int hD;
    public static final /* synthetic */ WorldArea gK;
    private static final /* synthetic */ WorldArea hv;
    private static /* synthetic */ int[] hJ;
    static /* synthetic */ String hI;
    private static final /* synthetic */ int hw;
    private static final /* synthetic */ WorldPoint hh;
    static /* synthetic */ boolean cj;
    private static final /* synthetic */ WorldArea ht;
    public static final /* synthetic */ WorldArea gL;
    private static final /* synthetic */ int hA;
    public static /* synthetic */ int hH;
    static /* synthetic */ String[] gx;
    private static final /* synthetic */ WorldPoint hq;
    private static final /* synthetic */ int hy;
    public static final /* synthetic */ WorldPoint gG;
    private static final /* synthetic */ int hF;
    static /* synthetic */ int ci;
    private static final /* synthetic */ WorldPoint hf;
    private static final /* synthetic */ int gT;
    public static final /* synthetic */ WorldPoint gF;
    public static /* synthetic */ int hG;
    public static final /* synthetic */ WorldArea gI;
    private static final /* synthetic */ WorldPoint hd;
    private static final /* synthetic */ WorldPoint hk;
    private static final /* synthetic */ int ha;
    private static final /* synthetic */ WorldPoint hl;
    private static final /* synthetic */ int hE;
    public static final /* synthetic */ WorldArea gO;
    private static final /* synthetic */ int hC;
    public static final /* synthetic */ WorldPoint gH;
    private static final /* synthetic */ int gV;
    private static final /* synthetic */ int gW;
    public static final /* synthetic */ WorldArea gM;
    public static final /* synthetic */ WorldArea gN;
    private static final /* synthetic */ WorldPoint hj;
    public static final /* synthetic */ WorldArea gP;
    private static final /* synthetic */ WorldPoint hm;
    private static final /* synthetic */ int gU;
    private static final /* synthetic */ int gQ;
    private static final /* synthetic */ WorldPoint hn;
    private static /* synthetic */ String[] lllllIll;
    private static final /* synthetic */ int hc;
    private static final /* synthetic */ WorldArea hu;
    public static final /* synthetic */ WorldArea gJ;
    private static final /* synthetic */ int hB;
    private static final /* synthetic */ int gY;
    private static final /* synthetic */ WorldPoint hs;
    private static final /* synthetic */ WorldPoint he;
    private static final /* synthetic */ int gR;
    private static final /* synthetic */ WorldPoint hi;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ int[] llllllII;
    private static final /* synthetic */ WorldPoint ho;
    private static final /* synthetic */ WorldPoint hp;
    public static /* synthetic */ List<d> bB;
    private static final /* synthetic */ int gZ;
    private static final /* synthetic */ WorldPoint hg;
    private static final /* synthetic */ int gS;
    private static final /* synthetic */ int hb;
    private static final /* synthetic */ int hz;
    private static final /* synthetic */ int gX;
    private static final /* synthetic */ WorldPoint hr;
    private static final /* synthetic */ int hx;

    @Override
    public int U() {
        z.bs();
        return llllllII[109];
    }

    private static void llIlIIIIIll() {
        lllllIll = new String[llllllII[174]];
        z.lllllIll[z.llllllII[4]] = z."Buying items";
        z.lllllIll[z.llllllII[3]] = z."Finished buying items, switching back to questing";
        z.lllllIll[z.llllllII[1]] = z."Breaking tab";
        z.lllllIll[z.llllllII[12]] = z."Break";
        z.lllllIll[z.llllllII[15]] = z."Nav to start";
        z.lllllIll[z.llllllII[13]] = z."Drink";
        z.lllllIll[z.llllllII[14]] = z."Boy";
        z.lllllIll[z.llllllII[18]] = z."Navigating to outside door";
        z.lllllIll[z.llllllII[20]] = z."Drop";
        z.lllllIll[z.llllllII[21]] = z."Stealing key";
        z.lllllIll[z.llllllII[22]] = z."Look-under";
        z.lllllIll[z.llllllII[24]] = z."Continue";
        z.lllllIll[z.llllllII[25]] = z."null";
        z.lllllIll[z.llllllII[26]] = z." ";
        z.lllllIll[z.llllllII[27]] = z."Nav to magnet box";
        z.lllllIll[z.llllllII[28]] = z."Nav to magnet box";
        z.lllllIll[z.llllllII[29]] = z."Cupboard";
        z.lllllIll[z.llllllII[30]] = z."Taking magnet";
        z.lllllIll[z.llllllII[31]] = z."Drop";
        z.lllllIll[z.llllllII[32]] = z."Open";
        z.lllllIll[z.llllllII[33]] = z."Open";
        z.lllllIll[z.llllllII[34]] = z."Search";
        z.lllllIll[z.llllllII[35]] = z."Search";
        z.lllllIll[z.llllllII[36]] = z."Continue";
        z.lllllIll[z.llllllII[37]] = z."null";
        z.lllllIll[z.llllllII[38]] = z." ";
        z.lllllIll[z.llllllII[40]] = z."Nav to magnet box";
        z.lllllIll[z.llllllII[41]] = z."Cupboard";
        z.lllllIll[z.llllllII[42]] = z."Taking magnet";
        z.lllllIll[z.llllllII[43]] = z."Open";
        z.lllllIll[z.llllllII[44]] = z."Open";
        z.lllllIll[z.llllllII[45]] = z."Search";
        z.lllllIll[z.llllllII[46]] = z."Search";
        z.lllllIll[z.llllllII[47]] = z."Continue";
        z.lllllIll[z.llllllII[48]] = z."null";
        z.lllllIll[z.llllllII[49]] = z." ";
        z.lllllIll[z.llllllII[50]] = z."Nav to cheese spot";
        z.lllllIll[z.llllllII[51]] = z."Mouse hole";
        z.lllllIll[z.llllllII[52]] = z."Mouse";
        z.lllllIll[z.llllllII[53]] = z."Using cheese";
        z.lllllIll[z.llllllII[54]] = z."Cheese";
        z.lllllIll[z.llllllII[55]] = z."Cheese";
        z.lllllIll[z.llllllII[56]] = z."Handle mouse";
        z.lllllIll[z.llllllII[57]] = z."Entering maze";
        z.lllllIll[z.llllllII[61]] = z."Handling walking";
        z.lllllIll[z.llllllII[63]] = z."Door";
        z.lllllIll[z.llllllII[64]] = z."Entering shed";
        z.lllllIll[z.llllllII[65]] = z."Nav to safe spot";
        z.lllllIll[z.llllllII[66]] = z."Eat";
        z.lllllIll[z.llllllII[67]] = z."Casting spell";
        z.lllllIll[z.llllllII[68]] = z."Fire rune";
        z.lllllIll[z.llllllII[69]] = z."Fire rune";
        z.lllllIll[z.llllllII[70]] = z."Ball";
        z.lllllIll[z.llllllII[71]] = z."Ball";
        z.lllllIll[z.llllllII[72]] = z."Taking ball";
        z.lllllIll[z.llllllII[73]] = z."Take";
        z.lllllIll[z.llllllII[74]] = z."Ball";
        z.lllllIll[z.llllllII[75]] = z."Breaking tab";
        z.lllllIll[z.llllllII[76]] = z."Break";
        z.lllllIll[z.llllllII[77]] = z."Nav to witches start";
        z.lllllIll[z.llllllII[78]] = z."Turning in quest";
        z.lllllIll[z.llllllII[79]] = z."Boy";
        z.lllllIll[z.llllllII[80]] = z."Drink";
        z.lllllIll[z.llllllII[81]] = z."Entering maze";
        z.lllllIll[z.llllllII[83]] = z."Nav to first spot";
        z.lllllIll[z.llllllII[84]] = z."Nav to second spot";
        z.lllllIll[z.llllllII[85]] = z."Nav to third spot";
        z.lllllIll[z.llllllII[86]] = z."Nav to fountain";
        z.lllllIll[z.llllllII[87]] = z."Getting key";
        z.lllllIll[z.llllllII[88]] = z."Fountain";
        z.lllllIll[z.llllllII[89]] = z."Check";
        z.lllllIll[z.llllllII[90]] = z."Continue";
        z.lllllIll[z.llllllII[91]] = z."null";
        z.lllllIll[z.llllllII[92]] = z." ";
        z.lllllIll[z.llllllII[95]] = z."Nav back toward maze";
        z.lllllIll[z.llllllII[96]] = z."Nav to shed spot";
        z.lllllIll[z.llllllII[97]] = z."Navigating to bank";
        z.lllllIll[z.llllllII[98]] = z."Opening bank";
        z.lllllIll[z.llllllII[100]] = z."Handling banking";
        z.lllllIll[z.llllllII[102]] = z."We are missing supplies, switching to BUYING";
        z.lllllIll[z.llllllII[16]] = z."We are missing supplies, switching to BUYING";
        z.lllllIll[z.llllllII[103]] = z."We are missing supplies, switching to BUYING";
        z.lllllIll[z.llllllII[104]] = z."We are missing supplies, switching to BUYING";
        z.lllllIll[z.llllllII[106]] = z."We are missing supplies, switching to BUYING";
        z.lllllIll[z.llllllII[116]] = z."Witches House quest";
        z.lllllIll[z.llllllII[117]] = z."ring of wealth (";
        z.lllllIll[z.llllllII[163]] = z."Wizard Mizgog";
        z.lllllIll[z.llllllII[164]] = z."Give me a quest please.";
        z.lllllIll[z.llllllII[165]] = z."I'll try.";
        z.lllllIll[z.llllllII[166]] = z."Actually, I know where to find this stuff.";
        z.lllllIll[z.llllllII[167]] = z."Yes.";
        z.lllllIll[z.llllllII[168]] = z."What's the matter?";
        z.lllllIll[z.llllllII[169]] = z."Ok, I'll see what I can do.";
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
            0;
            if (((0x3C ^ 0x38 ^ (0x62 ^ 0x2C)) & (0xA5 ^ 0x91 ^ (0x62 ^ 0x1C) ^ -1)) <= -1) {
                return ((7 ^ 0x5B ^ (0x1D ^ 0x7A)) & (0 ^ 0x69 ^ (0x65 ^ 0x37) ^ -1)) != 0;
            }
        } else {
            bl = llllllII[4];
        }
        return bl;
    }

    private static String llIlIIIIIII(String lIIllIIIllllIlI, String lIIllIIIlllIlll) {
        try {
            SecretKeySpec lIIllIIIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIIlllIlll.getBytes(StandardCharsets.UTF_8)), llllllII[20]), "DES");
            Cipher lIIllIIIlllllII = Cipher.getInstance("DES");
            lIIllIIIlllllII.init(llllllII[1], lIIllIIIlllllIl);
            return new String(lIIllIIIlllllII.doFinal(Base64.getDecoder().decode(lIIllIIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIIIllllIll) {
            lIIllIIIllllIll.printStackTrace();
            return null;
        }
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
                                0;
                            }
                            if (!z.llIlIIIIlll(Bank.isOpen() ? 1 : 0)) break block30;
                            AccBuilderBarrows.c = lllllIll[llllllII[100]];
                            if (z.llIlIIIlllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llllllII[12]);
                                0;
                            }
                            if (z.llIlIIIlllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llllllII[1]);
                                0;
                            }
                            while (z.llIlIIIlIII(u.aV() ? 1 : 0) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                                u.aT();
                                Time.sleepTicks((int)llllllII[3]);
                                0;
                                0;
                                
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
                0;
            }
            int[] nArray11 = new int[llllllII[3]];
            nArray11[z.llllllII[4]] = llllllII[10];
            if (z.llIlIIIIlll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[llllllII[3]];
                nArray12[z.llllllII[4]] = llllllII[10];
                if (z.llIlIIIIlIl(Inventory.getCount((int[])nArray12), llllllII[3])) {
                    Bank.withdraw((int)llllllII[10], (int)llllllII[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllllII[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[10];
                        if (z.llIlIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llllllII[3];
                            0;
                            
                            }
                        } else {
                            bl = llllllII[4];
                        }
                        return bl;
                    }, (int)llllllII[99]);
                    0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[9];
                        if (z.llIlIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llllllII[3];
                            0;
                            if (-2 >= 0) {
                                return ((0x27 ^ 0x54 ^ (4 ^ 0x62)) & (0x33 ^ 0x56 ^ (5 ^ 0x75) ^ -1)) != 0;
                            }
                        } else {
                            bl = llllllII[4];
                        }
                        return bl;
                    }, (int)llllllII[99]);
                    0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[7];
                        if (z.llIlIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llllllII[3];
                            0;
                            if (1 <= 0) {
                                return false;
                            }
                        } else {
                            bl = llllllII[4];
                        }
                        return bl;
                    }, (int)llllllII[99]);
                    0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[5];
                        if (z.llIlIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llllllII[3];
                            0;
                            if (-(0x15 ^ 0x10) >= 0) {
                                return false;
                            }
                        } else {
                            bl = llllllII[4];
                        }
                        return bl;
                    }, (int)llllllII[99]);
                    0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[6];
                        if (z.llIlIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llllllII[3];
                            0;
                            if (((6 ^ 0x39) & ~(0x7A ^ 0x45)) > 0) {
                                return false;
                            }
                        } else {
                            bl = llllllII[4];
                        }
                        return bl;
                    }, (int)llllllII[99]);
                    0;
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
                    0;
                    Time.sleepUntil(() -> {
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[108];
                        return Inventory.contains((int[])nArray);
                    }, (int)llllllII[99]);
                    0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[llllllII[3]];
                        nArray[z.llllllII[4]] = llllllII[8];
                        if (z.llIlIIIlllI(Inventory.getCount((int[])nArray))) {
                            bl = llllllII[3];
                            0;
                            if (-2 >= 0) {
                                return ((135 + 149 - 269 + 206 ^ 170 + 114 - 214 + 118) & (0xE4 ^ 0xBA ^ (0x14 ^ 0x2B) ^ -1)) != 0;
                            }
                        } else {
                            bl = llllllII[4];
                        }
                        return bl;
                    }, (int)llllllII[99]);
                    0;
                }
            }
        }
    }

    @Override
    public boolean T() {
        return llllllII[4];
    }

    private static void llIlIIIIlII() {
        llllllII = new int[175];
        z.llllllII[0] = (0x91 ^ 0xAF) + (3 + 33 - -32 + 67) - (0x7E ^ 0x4A) + (0x74 ^ 0x7B);
        z.llllllII[1] = 2;
        z.llllllII[2] = 88 + 218 - 154 + 74;
        z.llllllII[3] = 1;
        z.llllllII[4] = (0xDE ^ 0x86) & ~(0x4F ^ 0x17);
        z.llllllII[5] = 0xFFFFBBBF & 0x466B;
        z.llllllII[6] = 0xFFFFCEAD & 0x337F;
        z.llllllII[7] = 0xFFFFAFAF & 0x527E;
        z.llllllII[8] = 0xFFFFCFFB & 0x317F;
        z.llllllII[9] = 0xFFFFD7FB & 0x2FC5;
        z.llllllII[10] = 0xFFFFFF6D & 0x1FDB;
        z.llllllII[11] = 145 + 86 - 228 + 147;
        z.llllllII[12] = 3;
        z.llllllII[13] = 0x68 ^ 0x6D;
        z.llllllII[14] = 0x2E ^ 0xA ^ (0xA8 ^ 0x8A);
        z.llllllII[15] = 118 + 159 - 237 + 140 ^ 127 + 111 - 151 + 89;
        z.llllllII[16] = 0x92 ^ 0xC2;
        z.llllllII[17] = -(79 + 95 - 133 + 104) & (0xFFFFABF9 & 0x5DFF);
        z.llllllII[18] = 0x35 ^ 0x32;
        z.llllllII[19] = -(0xFFFFD54D & 0x7EFB) & (0xFFFFFFFB & 0x5F7F);
        z.llllllII[20] = 0x3F ^ 0xA ^ (0x7B ^ 0x46);
        z.llllllII[21] = 0xC8 ^ 0xC1;
        z.llllllII[22] = 0xBB ^ 0x8D ^ (0x11 ^ 0x2D);
        z.llllllII[23] = 110 + 53 - 114 + 105 + (0xFC ^ 0x92) - (0x12 ^ 0x6A) + (0x58 ^ 0xD);
        z.llllllII[24] = 0x1B ^ 0x15 ^ (0x97 ^ 0x92);
        z.llllllII[25] = 0xA5 ^ 0xA3 ^ (0xB2 ^ 0xB8);
        z.llllllII[26] = 0xDB ^ 0xAC ^ (0x50 ^ 0x2A);
        z.llllllII[27] = 0x15 ^ 0x74 ^ (0xB ^ 0x64);
        z.llllllII[28] = 120 + 3 - 70 + 96 ^ 23 + 12 - -114 + 5;
        z.llllllII[29] = 112 + 51 - 99 + 95 ^ 139 + 120 - 168 + 52;
        z.llllllII[30] = 0x97 ^ 0x86;
        z.llllllII[31] = 0x15 ^ 7;
        z.llllllII[32] = 0x12 ^ 0x58 ^ (0x37 ^ 0x6E);
        z.llllllII[33] = 33 + 105 - 32 + 81 ^ 140 + 68 - 204 + 171;
        z.llllllII[34] = 0x3E ^ 0x2B;
        z.llllllII[35] = 0x8D ^ 0xC4 ^ (0x3D ^ 0x62);
        z.llllllII[36] = 76 + 25 - 90 + 129 ^ 70 + 69 - 72 + 88;
        z.llllllII[37] = 0x7A ^ 0x27 ^ (0x7F ^ 0x3A);
        z.llllllII[38] = 0x69 ^ 0x70;
        z.llllllII[39] = -(0xFFFFD21F & 0x2FF5) & (0xFFFFBFFE & 0x4B7F);
        z.llllllII[40] = 158 + 66 - 91 + 85 ^ 122 + 67 - 38 + 41;
        z.llllllII[41] = 0x41 ^ 0x5A;
        z.llllllII[42] = 0x7B ^ 0x67;
        z.llllllII[43] = 0x78 ^ 0x65;
        z.llllllII[44] = 32 + 67 - 76 + 120 ^ 59 + 23 - 57 + 120;
        z.llllllII[45] = 0x9C ^ 0x83;
        z.llllllII[46] = 0x54 ^ 0x74;
        z.llllllII[47] = 0 ^ 0x21;
        z.llllllII[48] = 0xAD ^ 0x8F;
        z.llllllII[49] = 0x58 ^ 0x7B;
        z.llllllII[50] = 0xB5 ^ 0x91;
        z.llllllII[51] = 0x94 ^ 0xB1;
        z.llllllII[52] = 130 + 26 - 138 + 129 ^ 85 + 171 - 205 + 130;
        z.llllllII[53] = 0xFE ^ 0xBC ^ (0xA7 ^ 0xC2);
        z.llllllII[54] = 0x30 ^ 0x57 ^ (0xA ^ 0x45);
        z.llllllII[55] = 0xF5 ^ 0x80 ^ (0 ^ 0x5C);
        z.llllllII[56] = 0xF7 ^ 0xAC ^ (0x4F ^ 0x3E);
        z.llllllII[57] = 0x9C ^ 0x98 ^ (0x85 ^ 0xAA);
        z.llllllII[58] = 0xFFFFAFF7 & 0x5B5D;
        z.llllllII[59] = -(0xFFFFAC37 & 0x73DB) & (0xFFFFED97 & 0x3FFE);
        z.llllllII[60] = -(0xFFFFB67F & 0x7F85) & (0xFFFFFFFF & 0x3F6F);
        z.llllllII[61] = 0xB6 ^ 0x9A;
        z.llllllII[62] = 0xFFFFCF7F & 0x3BF5;
        z.llllllII[63] = 4 ^ 0x29;
        z.llllllII[64] = 0x55 ^ 0x7B;
        z.llllllII[65] = 0xB5 ^ 0xC4 ^ (0x9E ^ 0xC0);
        z.llllllII[66] = 0xC ^ 0x3C;
        z.llllllII[67] = 0xF6 ^ 0xA2 ^ (0x5E ^ 0x3B);
        z.llllllII[68] = 0x15 ^ 0x5C ^ (0xC1 ^ 0xBA);
        z.llllllII[69] = 14 + 93 - 44 + 91 ^ 162 + 136 - 218 + 89;
        z.llllllII[70] = 0x2D ^ 0x19;
        z.llllllII[71] = 110 + 136 - 225 + 124 ^ 31 + 17 - -20 + 96;
        z.llllllII[72] = 5 ^ 0x33;
        z.llllllII[73] = 0x6D ^ 0x5A;
        z.llllllII[74] = 0x72 ^ 0x7A ^ (0xF3 ^ 0xC3);
        z.llllllII[75] = 8 + 56 - 24 + 125 ^ 11 + 68 - -64 + 13;
        z.llllllII[76] = 0x5E ^ 0x64;
        z.llllllII[77] = 0x1E ^ 0x25;
        z.llllllII[78] = 18 + 76 - -67 + 8 ^ 14 + 58 - 25 + 102;
        z.llllllII[79] = 0x4E ^ 0x73;
        z.llllllII[80] = 0x62 ^ 0x5C;
        z.llllllII[81] = 0x2A ^ 0x43 ^ (0x71 ^ 0x27);
        z.llllllII[82] = 0xFFFFAFDB & 0x5FBF;
        z.llllllII[83] = 59 + 57 - 29 + 41 ^ 139 + 51 - 42 + 44;
        z.llllllII[84] = 0x28 ^ 0x69;
        z.llllllII[85] = 0x3C ^ 0x6B ^ (0x4C ^ 0x59);
        z.llllllII[86] = 0x6A ^ 0x29;
        z.llllllII[87] = 0x60 ^ 0x41 ^ (0xF2 ^ 0x97);
        z.llllllII[88] = 18 + 73 - -144 + 12 ^ 127 + 107 - 227 + 171;
        z.llllllII[89] = 0xD4 ^ 0x92;
        z.llllllII[90] = 165 + 65 - 149 + 163 ^ 80 + 12 - -82 + 5;
        z.llllllII[91] = 0xF5 ^ 0xBD;
        z.llllllII[92] = 0x1D ^ 0x54;
        z.llllllII[93] = -(0xFFFFBC9F & 0x5775) & (0xFFFF9FFD & 0x7F77);
        z.llllllII[94] = -(0xFFFFD19D & 0x7E67) & (0xFFFFFDAF & 0x5FDE);
        z.llllllII[95] = 189 + 0 - 122 + 175 ^ 135 + 61 - 71 + 59;
        z.llllllII[96] = 0x4C ^ 0x3C ^ (0xB3 ^ 0x88);
        z.llllllII[97] = 0xFD ^ 0xB1;
        z.llllllII[98] = 0x15 ^ 0x58;
        z.llllllII[99] = -(0xFFFFEB67 & 0x7CBF) & (0xFFFFFFAF & 0x7BFE);
        z.llllllII[100] = 98 + 196 - 213 + 152 ^ 97 + 151 - 176 + 95;
        z.llllllII[101] = -(0xFFFFBB9F & 0x7C71) & (0xFFFFBBFD & 0x7FFA);
        z.llllllII[102] = 0x3D ^ 0x72;
        z.llllllII[103] = 0x2D ^ 0x7C;
        z.llllllII[104] = 0x31 ^ 0x63;
        z.llllllII[105] = -(0xFFFFF9DB & 0x463D) & (0xFFFFFFDF & 0x5F7F);
        z.llllllII[106] = 128 + 11 - 135 + 188 ^ 130 + 42 - 137 + 112;
        z.llllllII[107] = 0xFFFFB9F7 & 0x47FC;
        z.llllllII[108] = -(0xFFFF8BEF & 0x76BF) & (0xFFFFBBFF & 0x77FF);
        z.llllllII[109] = 0xF9 ^ 0x9D;
        z.llllllII[110] = -(0xFFFFDE67 & 0x37FE) & (0xFFFF9FF7 & 0x77FD);
        z.llllllII[111] = -(0xFFFFF983 & 0x467D) & (0xFFFFF7F6 & 0x5BFF);
        z.llllllII[112] = -(0xFFFFB097 & 0x5F7B) & (0xFFFFBFFE & 0x7EDF);
        z.llllllII[113] = -(0xFFFFBFF3 & 0x7D8D) & (0xFFFFFFEC & 0x7FFB);
        z.llllllII[114] = 0xFFFFEFFD & 0x176E;
        z.llllllII[115] = 0xFFFFC7DB & 0x3FF4;
        z.llllllII[116] = 58 + 27 - -59 + 78 ^ 48 + 117 - 62 + 35;
        z.llllllII[117] = 34 + 90 - 106 + 126 ^ 76 + 109 - 71 + 83;
        z.llllllII[118] = 0xFFFFAFBF & 0x55FE;
        z.llllllII[119] = -(0xFFFFB63B & 0x7BFE) & (0xFFFFF7FD & 0x3FFF);
        z.llllllII[120] = -(0xFFFFF6BE & 0x5B5D) & (0xFFFFD7FB & 0x7FDF);
        z.llllllII[121] = -(0xFFFFFED7 & 0x1DF9) & (0xFFFF9EFF & 0x7FFA);
        z.llllllII[122] = 0xFFFFFFF6 & 0x5CB;
        z.llllllII[123] = 0xFFFFEFF5 & 0x1B6E;
        z.llllllII[124] = -(0xFFFFC3AD & 0x3E57) & (0xFFFFDFEE & 0x2F9D);
        z.llllllII[125] = -(0xFFFFCD8B & 0x76FD) & (0xFFFFFFEF & 0x4FFF);
        z.llllllII[126] = 0xFFFFBFF5 & 0x4B5E;
        z.llllllII[127] = -(0xFFFFD7FB & 0x3A5D) & (0xFFFFFFFF & 0x1FDB);
        z.llllllII[128] = 0xFFFFDBE3 & 0x2F7F;
        z.llllllII[129] = 0xFFFFFB7F & 0xFF2;
        z.llllllII[130] = -(0xFFFFFCF1 & 0x336F) & (0xFFFFFDE7 & 0x3FFA);
        z.llllllII[131] = -(0xFFFFFCF2 & 0x238F) & (0xFFFFFFDF & 0x2BF7);
        z.llllllII[132] = 0xFFFF8DCF & 0x7FB5;
        z.llllllII[133] = -(0xFFFFFCF7 & 0x679B) & (0xFFFFFFF7 & 0x6FFF);
        z.llllllII[134] = -(0xFFFF979F & 0x7CEF) & (0xFFFFDFFE & 0x3FEF);
        z.llllllII[135] = -(0xFFFFF179 & 0x7EE7) & (0xFFFFFDF7 & 0x7FEF);
        z.llllllII[136] = 0xFFFF9F77 & 0x6BDF;
        z.llllllII[137] = 0xFFFF8BFD & 0x7F73;
        z.llllllII[138] = 0xFFFFCEE2 & 0x3D3D;
        z.llllllII[139] = -(0xFFFFFFA9 & 0x4077) & (0xFFFFED7B & 0x5EFF);
        z.llllllII[140] = -(0xFFFFDE4D & 0x65B3) & (0xFFFFFF6F & 0x4FFF);
        z.llllllII[141] = -(0xFFFFE3DB & 0x3EA5) & (0xFFFFEFFF & 0x3FFF);
        z.llllllII[142] = -(0xFFFFFD27 & 0x72DF) & (0xFFFFFB7F & 0x7FFE);
        z.llllllII[143] = -(0xFFFFBCFA & 0x730F) & (0xFFFFFFFF & 0x3B9F);
        z.llllllII[144] = 0xFFFFFDB7 & 0xF7D;
        z.llllllII[145] = -(0xFFFFECBD & 0x774B) & (0xFFFFFF7B & 0x6FDF);
        z.llllllII[146] = -(0xFFFFB6ED & 0x7B7F) & (0xFFFFBFFF & 0x7FFD);
        z.llllllII[147] = -(0xFFFFF0A7 & 0x6FFB) & (0xFFFFEBFB & Short.MAX_VALUE);
        z.llllllII[148] = 0xFFFFBFF3 & 0x4D9F;
        z.llllllII[149] = -(0xFFFFD4AD & 0x7FF7) & (0xFFFFFFFF & 0x5FFE);
        z.llllllII[150] = 0xFFFFB6B5 & 0x6FDE;
        z.llllllII[151] = -(0xFFFF9FED & 0x715F) & (0xFFFFF7DF & 0x3FFE);
        z.llllllII[152] = 0xFFFFB7F7 & 0x6E99;
        z.llllllII[153] = -(0xFFFFAB17 & 0x74FF) & (0xFFFFBD9F & 0x6FFF);
        z.llllllII[154] = 0xFFFFEF5F & 0x1BFF;
        z.llllllII[155] = 0xFFFFBF8F & 0x4DFD;
        z.llllllII[156] = -(0xFFFFD329 & 0x7CD7) & (0xFFFFDF7B & 0x7BDF);
        z.llllllII[157] = 0xFFFFFDF7 & 0xF9C;
        z.llllllII[158] = -(0xFFFFC17F & 0x3FB2) & (0xFFFFAFFF & 0x77BF);
        z.llllllII[159] = -(0xFFFFF5AB & 0x5ED5) & (0xFFFFDFFF & 0x7FDD);
        z.llllllII[160] = 0xFFFFFFD5 & 0x26BF;
        z.llllllII[161] = 0xFFFFFF23 & 0x3CDF;
        z.llllllII[162] = -(0xFFFFCFF7 & 0x7B7D) & (0xFFFFDF7F & 0x7FF7);
        z.llllllII[163] = 94 + 90 - 23 + 59 ^ 27 + 135 - 83 + 59;
        z.llllllII[164] = 0x22 ^ 0x75;
        z.llllllII[165] = 0x98 ^ 0xC0;
        z.llllllII[166] = 4 ^ 0x5D;
        z.llllllII[167] = 0x81 ^ 0xB7 ^ (0x19 ^ 0x75);
        z.llllllII[168] = 0x6F ^ 0x4C ^ (0x45 ^ 0x3D);
        z.llllllII[169] = 186 + 130 - 223 + 112 ^ 115 + 75 - 74 + 29;
        z.llllllII[170] = 0xFFFFBFFD & 0x4F9E;
        z.llllllII[171] = -(0xFFFFF963 & 0x46DF) & (0xFFFFFFDF & 0x4FFF);
        z.llllllII[172] = -(0xFFFFDCF9 & 0x7347) & (0xFFFFFFDE & 0x5FFF);
        z.llllllII[173] = 0xFFFFCFBF & 0x3FDF;
        z.llllllII[174] = 247 + 196 - 241 + 50 ^ 92 + 77 - 158 + 150;
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

    private static String llIlIIIIIlI(String lIIllIIIlIlIlIl, String lIIllIIIlIlIlII) {
        try {
            SecretKeySpec lIIllIIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIIIlIlIlll = Cipher.getInstance("Blowfish");
            lIIllIIIlIlIlll.init(llllllII[1], lIIllIIIlIllIII);
            return new String(lIIllIIIlIlIlll.doFinal(Base64.getDecoder().decode(lIIllIIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIIIlIlIllI) {
            lIIllIIIlIlIllI.printStackTrace();
            return null;
        }
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
                                    0;
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
                                        0;
                                        0;
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
                                            0;
                                        }
                                    }
                                    if (z.llIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[11]) && z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[14])) {
                                        AccBuilderBarrows.c = lllllIll[llllllII[15]];
                                        if (z.llIlIIIIlll(Inventory.contains((int[])f.bb) ? 1 : 0) && z.llIlIIIIlIl(Movement.getRunEnergy(), llllllII[16])) {
                                            Inventory.getFirst((int[])f.bb).interact(lllllIll[llllllII[13]]);
                                            Time.sleepTicks((int)llllllII[3]);
                                            0;
                                        }
                                        Movement.walkTo((WorldPoint)he);
                                        0;
                                        Time.sleepTicks((int)llllllII[3]);
                                        0;
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
                                        0;
                                        Time.sleepTicks((int)llllllII[3]);
                                        0;
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
                                            0;
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
                                        0;
                                        Time.sleepTicks((int)llllllII[3]);
                                        0;
                                    }
                                }
                                if (z.llIlIIIIlll(hu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderBarrows.c = lllllIll[llllllII[28]];
                                    if (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hl), llllllII[3])) {
                                        Movement.walkTo((WorldPoint)hl);
                                        0;
                                        Time.sleepTicks((int)llllllII[3]);
                                        0;
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
                                            0;
                                        }
                                        if (z.llIlIIIlIll(lIIllIIlIIIllll2)) {
                                            String[] stringArray2 = new String[llllllII[3]];
                                            stringArray2[z.llllllII[4]] = lllllIll[llllllII[32]];
                                            if (z.llIlIIIIlll(lIIllIIlIIIllll2.hasAction(stringArray2) ? 1 : 0)) {
                                                lIIllIIlIIIllll2.interact(lllllIll[llllllII[33]]);
                                                Time.sleepTicks((int)llllllII[1]);
                                                0;
                                            }
                                            String[] stringArray3 = new String[llllllII[3]];
                                            stringArray3[z.llllllII[4]] = lllllIll[llllllII[34]];
                                            if (z.llIlIIIIlll(lIIllIIlIIIllll2.hasAction(stringArray3) ? 1 : 0)) {
                                                lIIllIIlIIIllll2.interact(lllllIll[llllllII[35]]);
                                                Time.sleepTicks((int)llllllII[1]);
                                                0;
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
                                        0;
                                        Time.sleepTicks((int)llllllII[3]);
                                        0;
                                        0;
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
                                        0;
                                        Time.sleepTicks((int)llllllII[3]);
                                        0;
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
                                                0;
                                            }
                                            String[] stringArray5 = new String[llllllII[3]];
                                            stringArray5[z.llllllII[4]] = lllllIll[llllllII[45]];
                                            if (z.llIlIIIIlll(lIIllIIlIIIllll2.hasAction(stringArray5) ? 1 : 0)) {
                                                lIIllIIlIIIllll2.interact(lllllIll[llllllII[46]]);
                                                Time.sleepTicks((int)llllllII[1]);
                                                0;
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
                                    0;
                                    Time.sleepTicks((int)llllllII[3]);
                                    0;
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
                                        0;
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
                                        0;
                                    }
                                }
                            }
                            if (z.llIlIIIIlll(ht.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.llIlIIIIllI(e.j(llllllII[2]), llllllII[12])) {
                                AccBuilderBarrows.c = lllllIll[llllllII[57]];
                                Movement.walkTo((WorldPoint)new WorldPoint(llllllII[58], llllllII[59], llllllII[4]));
                                0;
                                Time.sleepTicks((int)llllllII[3]);
                                0;
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
                                    0;
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
                        0;
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
                        0;
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
                0;
            }
            if (z.llIlIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), llllllII[26])) {
                String[] stringArray = new String[llllllII[3]];
                stringArray[z.llllllII[4]] = lllllIll[llllllII[69]];
                if (z.llIlIIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)lIIllIIlIIIllll2);
                    Time.sleepTicks((int)llllllII[3]);
                    0;
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
                    0;
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
                        0;
                    }
                }
                if (z.llIlIIIlIII(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[15])) {
                    AccBuilderBarrows.c = lllllIll[llllllII[77]];
                    Movement.walkTo((WorldPoint)he);
                    0;
                    Time.sleepTicks((int)llllllII[3]);
                    0;
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
            0;
        }
        if (z.llIlIIIlIII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!z.llIlIIIlIII(ht.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hi), llllllII[1])) {
            AccBuilderBarrows.c = lllllIll[llllllII[81]];
            Movement.walkTo((WorldPoint)new WorldPoint(llllllII[58], llllllII[59], llllllII[4]));
            0;
            Time.sleepTicks((int)llllllII[3]);
            0;
        }
        int[] nArray = new int[llllllII[3]];
        nArray[z.llllllII[4]] = llllllII[82];
        NPC lIIllIIlIIIlIlI = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[llllllII[3]];
        nArray2[z.llllllII[4]] = llllllII[60];
        if (z.llIlIIIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            if (z.llIlIIIIlll(gI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.llIlIIIlIll(lIIllIIlIIIlIlI) && z.llIlIIIIlll(gO.contains(lIIllIIlIIIlIlI.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)llllllII[24]);
                0;
                while (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gF), llllllII[3]) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[83]];
                    Movement.walkTo((WorldPoint)gF);
                    0;
                    Time.sleepTicks((int)llllllII[3]);
                    0;
                    0;
                    if (3 == 3) continue;
                    return;
                }
            }
            if (z.llIlIIIIlll(gJ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.llIlIIIlIll(lIIllIIlIIIlIlI) && z.llIlIIIIlll(gL.contains(lIIllIIlIIIlIlI.getWorldLocation()) ? 1 : 0)) {
                while (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gG), llllllII[3]) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[84]];
                    Movement.walkTo((WorldPoint)gG);
                    0;
                    Time.sleepTicks((int)llllllII[3]);
                    0;
                    0;
                    if (((0xD4 ^ 0xC6 ^ (0x7F ^ 0x5A)) & (0xB7 ^ 0x82 ^ 2 ^ -1)) == 0) continue;
                    return;
                }
            }
            if (z.llIlIIIIlll(gK.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.llIlIIIlIll(lIIllIIlIIIlIlI) && z.llIlIIIIlll(gP.contains(lIIllIIlIIIlIlI.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)llllllII[18]);
                0;
                while (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gH), llllllII[3]) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[85]];
                    Movement.walkTo((WorldPoint)gH);
                    0;
                    Time.sleepTicks((int)llllllII[3]);
                    0;
                    0;
                    if (3 >= 2) continue;
                    return;
                }
            }
            if (z.llIlIIIIlll(gN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && z.llIlIIIlIll(lIIllIIlIIIlIlI) && z.llIlIIIIlll(gP.contains(lIIllIIlIIIlIlI.getWorldLocation()) ? 1 : 0)) {
                while (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hs), llllllII[1]) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[86]];
                    Movement.walkTo((WorldPoint)hs);
                    0;
                    Time.sleepTicks((int)llllllII[3]);
                    0;
                    0;
                    
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
                    0;
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
                    0;
                    Time.sleepTicks((int)llllllII[3]);
                    0;
                    0;
                    
                    return;
                }
            }
            if (z.llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllllII[93], llllllII[94], llllllII[4])), llllllII[1]) && z.llIlIIIlIll(lIIllIIlIIIlIlI) && z.llIlIIIIlll(gO.contains(lIIllIIlIIIlIlI.getWorldLocation()) ? 1 : 0)) {
                while (z.llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gG), llllllII[3]) && z.llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[96]];
                    Movement.walkTo((WorldPoint)gG);
                    0;
                    Time.sleepTicks((int)llllllII[3]);
                    0;
                    0;
                    if ((81 + 140 - 167 + 121 ^ 73 + 137 - 177 + 138) != 0) continue;
                    return;
                }
            }
        }
    }

    private static String llIlIIIIIIl(String lIIllIIIllIIlIl, String lIIllIIIllIlIIl) {
        lIIllIIIllIIlIl = new String(Base64.getDecoder().decode(lIIllIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIIIllIlIII = new StringBuilder();
        char[] lIIllIIIllIIlll = lIIllIIIllIlIIl.toCharArray();
        int lIIllIIIllIIllI = llllllII[4];
        char[] lIIllIIIllIIIII = lIIllIIIllIIlIl.toCharArray();
        int lIIllIIIlIlllll = lIIllIIIllIIIII.length;
        int lIIllIIIlIllllI = llllllII[4];
        while (z.llIlIIIIlIl(lIIllIIIlIllllI, lIIllIIIlIlllll)) {
            char lIIllIIIllIlIll = lIIllIIIllIIIII[lIIllIIIlIllllI];
            lIIllIIIllIlIII.append((char)(lIIllIIIllIlIll ^ lIIllIIIllIIlll[lIIllIIIllIIllI % lIIllIIIllIIlll.length]));
            0;
            ++lIIllIIIllIIllI;
            ++lIIllIIIlIllllI;
            0;
            if (3 != 0) continue;
            return null;
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
                            d d2 = new d(llllllII[8], llllllII[109], llllllII[110]);
                            bB.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[llllllII[3]];
                        nArray2[z.llllllII[4]] = llllllII[8];
                        if (z.llIlIIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llllllII[3]];
                            nArray3[z.llllllII[4]] = llllllII[8];
                            if (z.llIlIIIIlIl(Bank.getFirst((int[])nArray3).getQuantity(), llllllII[33])) {
                                lIIllIIlIIIIIll = new d(llllllII[8], llllllII[54], llllllII[110]);
                                bB.add((d)lIIllIIlIIIIIll);
                                0;
                            }
                        }
                        int[] nArray4 = new int[llllllII[3]];
                        nArray4[z.llllllII[4]] = llllllII[9];
                        if (z.llIlIIIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIIllIIlIIIIIll = new d(llllllII[9], llllllII[13], llllllII[111]);
                            bB.add((d)lIIllIIlIIIIIll);
                            0;
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
                    lIIllIIlIIIIIll = new d(llllllII[9], llllllII[13], llllllII[111]);
                    bB.add((d)lIIllIIlIIIIIll);
                    0;
                }
                if (z.llIlIIIlIII(Bank.contains((Predicate)(lIIllIIlIIIIIll = item -> item.getName().toLowerCase().contains(lllllIll[llllllII[117]]))) ? 1 : 0)) {
                    lIIllIIlIIIIIlI = new d(llllllII[112], llllllII[31], llllllII[113]);
                    bB.add(lIIllIIlIIIIIlI);
                    0;
                }
                int[] nArray = new int[llllllII[3]];
                nArray[z.llllllII[4]] = llllllII[105];
                if (z.llIlIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lIIllIIlIIIIIlI = new d(llllllII[105], llllllII[54], llllllII[114]);
                    bB.add(lIIllIIlIIIIIlI);
                    0;
                }
                int[] nArray8 = new int[llllllII[3]];
                nArray8[z.llllllII[4]] = llllllII[10];
                if (z.llIlIIIlIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    lIIllIIlIIIIIlI = new d(llllllII[10], llllllII[33], llllllII[114]);
                    bB.add(lIIllIIlIIIIIlI);
                    0;
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
            lIIllIIlIIIIIlI = new d(llllllII[10], llllllII[33], llllllII[114]);
            bB.add(lIIllIIlIIIIIlI);
            0;
        }
        int[] nArray = new int[llllllII[3]];
        nArray[z.llllllII[4]] = llllllII[108];
        if (z.llIlIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIllIIlIIIIIlI = new d(llllllII[108], llllllII[13], i.bw);
            bB.add(lIIllIIlIIIIIlI);
            0;
        }
        int[] nArray12 = new int[llllllII[3]];
        nArray12[z.llllllII[4]] = llllllII[7];
        if (z.llIlIIIIlll(Bank.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[llllllII[3]];
            nArray13[z.llllllII[4]] = llllllII[7];
            if (z.llIlIIIIlIl(Bank.getFirst((int[])nArray13).getQuantity(), llllllII[101])) {
                lIIllIIlIIIIIlI = new d(llllllII[7], llllllII[115], llllllII[18]);
                bB.add(lIIllIIlIIIIIlI);
                0;
            }
        }
        int[] nArray14 = new int[llllllII[3]];
        nArray14[z.llllllII[4]] = llllllII[5];
        if (z.llIlIIIIlll(Bank.contains((int[])nArray14) ? 1 : 0)) {
            int[] nArray15 = new int[llllllII[3]];
            nArray15[z.llllllII[4]] = llllllII[5];
            if (z.llIlIIIIlIl(Bank.getFirst((int[])nArray15).getQuantity(), llllllII[101])) {
                lIIllIIlIIIIIlI = new d(llllllII[5], llllllII[115], llllllII[18]);
                bB.add(lIIllIIlIIIIIlI);
                0;
            }
        }
        int[] nArray16 = new int[llllllII[3]];
        nArray16[z.llllllII[4]] = llllllII[6];
        if (z.llIlIIIIlll(Bank.contains((int[])nArray16) ? 1 : 0)) {
            int[] nArray17 = new int[llllllII[3]];
            nArray17[z.llllllII[4]] = llllllII[6];
            if (z.llIlIIIIlIl(Bank.getFirst((int[])nArray17).getQuantity(), llllllII[101])) {
                lIIllIIlIIIIIlI = new d(llllllII[6], llllllII[115], llllllII[18]);
                bB.add(lIIllIIlIIIIIlI);
                0;
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

