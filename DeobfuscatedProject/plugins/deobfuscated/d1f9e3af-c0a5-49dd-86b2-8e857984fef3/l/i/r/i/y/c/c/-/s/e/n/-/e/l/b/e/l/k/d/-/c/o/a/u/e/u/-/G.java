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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.P;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.z;
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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class G
implements W {
    public static final /* synthetic */ WorldPoint hv;
    private static final /* synthetic */ WorldPoint hY;
    private static final /* synthetic */ int il;
    private static final /* synthetic */ WorldPoint id;
    private static final /* synthetic */ WorldPoint ic;
    private static final /* synthetic */ WorldPoint hX;
    static /* synthetic */ boolean cm;
    private static final /* synthetic */ int is;
    private static final /* synthetic */ WorldPoint hW;
    private static final /* synthetic */ int hP;
    private static final /* synthetic */ int hO;
    private static final /* synthetic */ int hG;
    private static /* synthetic */ int[] lIlllIlIl;
    public static /* synthetic */ List<d> bv;
    private static final /* synthetic */ int hN;
    private static final /* synthetic */ WorldArea ii;
    private static final /* synthetic */ WorldPoint hS;
    private static final /* synthetic */ int ir;
    public static final /* synthetic */ WorldArea hD;
    private static /* synthetic */ String[] lIlllIIII;
    private static final /* synthetic */ WorldPoint hU;
    public static /* synthetic */ int iu;
    private static final /* synthetic */ int ip;
    private static /* synthetic */ int[] ix;
    private static final /* synthetic */ WorldArea ij;
    public static final /* synthetic */ WorldArea hz;
    private static final /* synthetic */ int iq;
    private static final /* synthetic */ int in;
    public static final /* synthetic */ WorldArea hC;
    private static final /* synthetic */ int hE;
    private static final /* synthetic */ WorldPoint hR;
    private static final /* synthetic */ WorldPoint ib;
    private static final /* synthetic */ WorldArea ih;
    private static final /* synthetic */ int hI;
    private static final /* synthetic */ int hJ;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldArea hB;
    private static final /* synthetic */ int im;
    private static final /* synthetic */ int hK;
    private static final /* synthetic */ WorldPoint hT;
    private static final /* synthetic */ WorldPoint ie;
    public static /* synthetic */ int iv;
    private static final /* synthetic */ int io;
    private static final /* synthetic */ WorldPoint ig;
    static /* synthetic */ String iw;
    private static final /* synthetic */ int it;
    private static final /* synthetic */ int hL;
    private static final /* synthetic */ int hH;
    static /* synthetic */ int cl;
    private static final /* synthetic */ int hQ;
    public static final /* synthetic */ WorldArea hy;
    public static final /* synthetic */ WorldPoint hu;
    static /* synthetic */ String[] hl;
    private static final /* synthetic */ int hM;
    private static final /* synthetic */ WorldPoint if;
    private static final /* synthetic */ WorldPoint hV;
    private static final /* synthetic */ int hF;
    public static final /* synthetic */ WorldPoint ht;
    private static final /* synthetic */ WorldPoint hZ;
    private static final /* synthetic */ int ik;
    public static final /* synthetic */ WorldArea hA;
    public static final /* synthetic */ WorldArea hw;
    private static final /* synthetic */ WorldPoint ia;
    public static final /* synthetic */ WorldArea hx;

    private static boolean lIIlllIlIIlI(int n2) {
        return n2 > 0;
    }

    private static String lIIllIlIIlII(String llIIIlIllllIII, String llIIIlIlllllII) {
        llIIIlIllllIII = new String(Base64.getDecoder().decode(llIIIlIllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIlIllllIll = new StringBuilder();
        char[] llIIIlIllllIlI = llIIIlIlllllII.toCharArray();
        int llIIIlIllllIIl = lIlllIlIl[4];
        char[] llIIIlIlllIIll = llIIIlIllllIII.toCharArray();
        int llIIIlIlllIIlI = llIIIlIlllIIll.length;
        int llIIIlIlllIIIl = lIlllIlIl[4];
        while (G.lIIlllIIlIIl(llIIIlIlllIIIl, llIIIlIlllIIlI)) {
            char llIIIlIllllllI = llIIIlIlllIIll[llIIIlIlllIIIl];
            llIIIlIllllIll.append((char)(llIIIlIllllllI ^ llIIIlIllllIlI[llIIIlIllllIIl % llIIIlIllllIlI.length]));
            0;
            ++llIIIlIllllIIl;
            ++llIIIlIlllIIIl;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llIIIlIllllIll);
    }

    private static boolean lIIlllIIlIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void bP() {
        block30: {
            block34: {
                block32: {
                    block33: {
                        block31: {
                            void llIIIllIIIllII;
                            BankLocation bankLocation = BankLocation.getNearest();
                            if (G.lIIlllIIllll(bankLocation) && G.lIIlllIIllII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[97]];
                                a.a(bankLocation);
                            }
                            if (!G.lIIlllIIllll(llIIIllIIIllII) || !G.lIIlllIIlIll(llIIIllIIIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block30;
                            if (G.lIIlllIIllII(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[98]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIlIl[99]);
                                0;
                            }
                            if (!G.lIIlllIIlIll(Bank.isOpen() ? 1 : 0)) break block30;
                            AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[100]];
                            if (G.lIIlllIlIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlllIlIl[12]);
                                0;
                            }
                            if (G.lIIlllIlIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlllIlIl[1]);
                                0;
                            }
                            while (G.lIIlllIIllII(z.bi() ? 1 : 0) && G.lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                                z.bg();
                                Time.sleepTicks((int)lIlllIlIl[3]);
                                0;
                                0;
                                if (2 >= 1) continue;
                                return;
                            }
                            int[] nArray = new int[lIlllIlIl[3]];
                            nArray[G.lIlllIlIl[4]] = lIlllIlIl[7];
                            if (G.lIIlllIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIlllIlIl[3]];
                                nArray2[G.lIlllIlIl[4]] = lIlllIlIl[7];
                                if (G.lIIlllIIlIIl(Bank.getFirst((int[])nArray2).getQuantity(), lIlllIlIl[101])) {
                                    G.af();
                                    System.out.println(lIlllIIII[lIlllIlIl[102]]);
                                    bt = lIlllIlIl[3];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIlllIlIl[3]];
                            nArray3[G.lIlllIlIl[4]] = lIlllIlIl[6];
                            if (G.lIIlllIIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIlllIlIl[3]];
                                nArray4[G.lIlllIlIl[4]] = lIlllIlIl[6];
                                if (G.lIIlllIIlIIl(Bank.getFirst((int[])nArray4).getQuantity(), lIlllIlIl[101])) {
                                    G.af();
                                    System.out.println(lIlllIIII[lIlllIlIl[16]]);
                                    bt = lIlllIlIl[3];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[lIlllIlIl[3]];
                            nArray5[G.lIlllIlIl[4]] = lIlllIlIl[5];
                            if (G.lIIlllIIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIlllIlIl[3]];
                                nArray6[G.lIlllIlIl[4]] = lIlllIlIl[5];
                                if (G.lIIlllIIlIIl(Bank.getFirst((int[])nArray6).getQuantity(), lIlllIlIl[101])) {
                                    G.af();
                                    System.out.println(lIlllIIII[lIlllIlIl[103]]);
                                    bt = lIlllIlIl[3];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[lIlllIlIl[3]];
                            nArray7[G.lIlllIlIl[4]] = lIlllIlIl[10];
                            if (!G.lIIlllIIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block31;
                            int[] nArray8 = new int[lIlllIlIl[3]];
                            nArray8[G.lIlllIlIl[4]] = lIlllIlIl[10];
                            if (!G.lIIlllIlIIIl(Bank.getFirst((int[])nArray8).getQuantity(), lIlllIlIl[22])) break block32;
                        }
                        int[] nArray = new int[lIlllIlIl[3]];
                        nArray[G.lIlllIlIl[4]] = lIlllIlIl[9];
                        if (!G.lIIlllIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                        int[] nArray9 = new int[lIlllIlIl[3]];
                        nArray9[G.lIlllIlIl[4]] = lIlllIlIl[9];
                        if (!G.lIIlllIlIIIl(Bank.getFirst((int[])nArray9).getQuantity(), lIlllIlIl[13])) break block32;
                    }
                    int[] nArray = new int[lIlllIlIl[3]];
                    nArray[G.lIlllIlIl[4]] = lIlllIlIl[8];
                    if (!G.lIIlllIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                    int[] nArray10 = new int[lIlllIlIl[3]];
                    nArray10[G.lIlllIlIl[4]] = lIlllIlIl[8];
                    if (!G.lIIlllIIlIIl(Bank.getFirst((int[])nArray10).getQuantity(), lIlllIlIl[33])) break block34;
                }
                G.af();
                System.out.println(lIlllIIII[lIlllIlIl[104]]);
                bt = lIlllIlIl[3];
                return;
            }
            int[] nArray = new int[lIlllIlIl[18]];
            nArray[G.lIlllIlIl[4]] = lIlllIlIl[105];
            nArray[G.lIlllIlIl[3]] = lIlllIlIl[10];
            nArray[G.lIlllIlIl[1]] = lIlllIlIl[9];
            nArray[G.lIlllIlIl[12]] = lIlllIlIl[8];
            nArray[G.lIlllIlIl[15]] = lIlllIlIl[7];
            nArray[G.lIlllIlIl[13]] = lIlllIlIl[5];
            nArray[G.lIlllIlIl[14]] = lIlllIlIl[6];
            if (G.lIIlllIIllII(e.b(nArray) ? 1 : 0)) {
                G.af();
                System.out.println(lIlllIIII[lIlllIlIl[106]]);
                bt = lIlllIlIl[3];
                return;
            }
            if (G.lIIlllIIllII(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepTicks((int)lIlllIlIl[15]);
                0;
            }
            int[] nArray11 = new int[lIlllIlIl[3]];
            nArray11[G.lIlllIlIl[4]] = lIlllIlIl[10];
            if (G.lIIlllIIlIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[lIlllIlIl[3]];
                nArray12[G.lIlllIlIl[4]] = lIlllIlIl[10];
                if (G.lIIlllIIlIIl(Inventory.getCount((int[])nArray12), lIlllIlIl[3])) {
                    Bank.withdraw((int)lIlllIlIl[10], (int)lIlllIlIl[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlllIlIl[3]];
                        nArray[G.lIlllIlIl[4]] = lIlllIlIl[10];
                        if (G.lIIlllIlIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIlllIlIl[3];
                            0;
                            if (-1 > 0) {
                                return ((0x87 ^ 0xBA ^ (0x16 ^ 7)) & (79 + 37 - -1 + 26 ^ 139 + 91 - 217 + 150 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIlllIlIl[4];
                        }
                        return bl;
                    }, (int)lIlllIlIl[99]);
                    0;
                }
            }
            int[] nArray13 = new int[lIlllIlIl[3]];
            nArray13[G.lIlllIlIl[4]] = lIlllIlIl[9];
            if (G.lIIlllIIlIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                int[] nArray14 = new int[lIlllIlIl[3]];
                nArray14[G.lIlllIlIl[4]] = lIlllIlIl[9];
                if (G.lIIlllIIlIIl(Inventory.getCount((int[])nArray14), lIlllIlIl[3])) {
                    Bank.withdraw((int)lIlllIlIl[9], (int)lIlllIlIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlllIlIl[3]];
                        nArray[G.lIlllIlIl[4]] = lIlllIlIl[9];
                        if (G.lIIlllIlIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIlllIlIl[3];
                            0;
                            if (1 <= ((49 + 151 - 131 + 149 ^ 69 + 89 - 111 + 97) & (3 ^ (0xC0 ^ 0x89) ^ -1))) {
                                return ((0x2D ^ 0x26 ^ (0x15 ^ 0x11)) & (0x7D ^ 8 ^ (0x66 ^ 0x1C) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIlllIlIl[4];
                        }
                        return bl;
                    }, (int)lIlllIlIl[99]);
                    0;
                }
            }
            int[] nArray15 = new int[lIlllIlIl[3]];
            nArray15[G.lIlllIlIl[4]] = lIlllIlIl[7];
            if (G.lIIlllIIlIll(Bank.contains((int[])nArray15) ? 1 : 0)) {
                int[] nArray16 = new int[lIlllIlIl[3]];
                nArray16[G.lIlllIlIl[4]] = lIlllIlIl[7];
                if (G.lIIlllIIlIIl(Inventory.getCount((int[])nArray16), lIlllIlIl[3])) {
                    Bank.withdraw((int)lIlllIlIl[7], (int)lIlllIlIl[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlllIlIl[3]];
                        nArray[G.lIlllIlIl[4]] = lIlllIlIl[7];
                        if (G.lIIlllIlIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIlllIlIl[3];
                            0;
                            if (1 >= 2) {
                                return ((0x65 ^ 0x32 ^ (0xE3 ^ 0x9A)) & (0x66 ^ 0x70 ^ (0x88 ^ 0xB0) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIlllIlIl[4];
                        }
                        return bl;
                    }, (int)lIlllIlIl[99]);
                    0;
                }
            }
            int[] nArray17 = new int[lIlllIlIl[3]];
            nArray17[G.lIlllIlIl[4]] = lIlllIlIl[5];
            if (G.lIIlllIIlIll(Bank.contains((int[])nArray17) ? 1 : 0)) {
                int[] nArray18 = new int[lIlllIlIl[3]];
                nArray18[G.lIlllIlIl[4]] = lIlllIlIl[5];
                if (G.lIIlllIIlIIl(Inventory.getCount((int[])nArray18), lIlllIlIl[3])) {
                    Bank.withdraw((int)lIlllIlIl[5], (int)lIlllIlIl[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlllIlIl[3]];
                        nArray[G.lIlllIlIl[4]] = lIlllIlIl[5];
                        if (G.lIIlllIlIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIlllIlIl[3];
                            0;
                            if (null != null) {
                                return ((0x18 ^ 0x34 ^ (0x85 ^ 0xB5)) & (128 + 112 - 239 + 140 ^ 50 + 109 - 45 + 31 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIlllIlIl[4];
                        }
                        return bl;
                    }, (int)lIlllIlIl[99]);
                    0;
                }
            }
            int[] nArray19 = new int[lIlllIlIl[3]];
            nArray19[G.lIlllIlIl[4]] = lIlllIlIl[6];
            if (G.lIIlllIIlIll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                int[] nArray20 = new int[lIlllIlIl[3]];
                nArray20[G.lIlllIlIl[4]] = lIlllIlIl[6];
                if (G.lIIlllIIlIIl(Inventory.getCount((int[])nArray20), lIlllIlIl[3])) {
                    Bank.withdraw((int)lIlllIlIl[6], (int)lIlllIlIl[107], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlllIlIl[3]];
                        nArray[G.lIlllIlIl[4]] = lIlllIlIl[6];
                        if (G.lIIlllIlIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIlllIlIl[3];
                            0;
                            if (2 >= 3) {
                                return ((0x49 ^ 0x7F) & ~(0x5D ^ 0x6B)) != 0;
                            }
                        } else {
                            bl = lIlllIlIl[4];
                        }
                        return bl;
                    }, (int)lIlllIlIl[99]);
                    0;
                }
            }
            int[] nArray21 = new int[lIlllIlIl[3]];
            nArray21[G.lIlllIlIl[4]] = lIlllIlIl[108];
            if (G.lIIlllIIlIll(Bank.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[lIlllIlIl[3]];
                nArray22[G.lIlllIlIl[4]] = lIlllIlIl[108];
                if (G.lIIlllIIllII(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                    Bank.withdraw((int)lIlllIlIl[108], (int)lIlllIlIl[3], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        int[] nArray = new int[lIlllIlIl[3]];
                        nArray[G.lIlllIlIl[4]] = lIlllIlIl[108];
                        return Inventory.contains((int[])nArray);
                    }, (int)lIlllIlIl[99]);
                    0;
                }
            }
            int[] nArray23 = new int[lIlllIlIl[3]];
            nArray23[G.lIlllIlIl[4]] = lIlllIlIl[8];
            if (G.lIIlllIIlIll(Bank.contains((int[])nArray23) ? 1 : 0)) {
                int[] nArray24 = new int[lIlllIlIl[3]];
                nArray24[G.lIlllIlIl[4]] = lIlllIlIl[8];
                if (G.lIIlllIIlIIl(Inventory.getCount((int[])nArray24), lIlllIlIl[3])) {
                    Bank.withdrawAll((int)lIlllIlIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        int[] nArray = new int[lIlllIlIl[3]];
                        nArray[G.lIlllIlIl[4]] = lIlllIlIl[8];
                        if (G.lIIlllIlIIlI(Inventory.getCount((int[])nArray))) {
                            bl = lIlllIlIl[3];
                            0;
                            if (-3 >= 0) {
                                return ((0x9E ^ 0xB1) & ~(0xED ^ 0xC2)) != 0;
                            }
                        } else {
                            bl = lIlllIlIl[4];
                        }
                        return bl;
                    }, (int)lIlllIlIl[99]);
                    0;
                }
            }
        }
    }

    private static String lIIllIlIIIll(String llIIIlIlIllIIl, String llIIIlIlIllIlI) {
        try {
            SecretKeySpec llIIIlIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIlIlIlllIl = Cipher.getInstance("Blowfish");
            llIIIlIlIlllIl.init(lIlllIlIl[1], llIIIlIlIllllI);
            return new String(llIIIlIlIlllIl.doFinal(Base64.getDecoder().decode(llIIIlIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIlIlIlllII) {
            llIIIlIlIlllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIIIlII() {
        lIlllIIII = new String[lIlllIlIl[174]];
        G.lIlllIIII[G.lIlllIlIl[4]] = G."Buying items";
        G.lIlllIIII[G.lIlllIlIl[3]] = G."Finished buying items, switching back to questing";
        G.lIlllIIII[G.lIlllIlIl[1]] = G."Breaking tab";
        G.lIlllIIII[G.lIlllIlIl[12]] = G."Break";
        G.lIlllIIII[G.lIlllIlIl[15]] = G."Nav to start";
        G.lIlllIIII[G.lIlllIlIl[13]] = G."Drink";
        G.lIlllIIII[G.lIlllIlIl[14]] = G."Boy";
        G.lIlllIIII[G.lIlllIlIl[18]] = G."Navigating to outside door";
        G.lIlllIIII[G.lIlllIlIl[20]] = G."Drop";
        G.lIlllIIII[G.lIlllIlIl[21]] = G."Stealing key";
        G.lIlllIIII[G.lIlllIlIl[22]] = G."Look-under";
        G.lIlllIIII[G.lIlllIlIl[24]] = G."Continue";
        G.lIlllIIII[G.lIlllIlIl[25]] = G."null";
        G.lIlllIIII[G.lIlllIlIl[26]] = G." ";
        G.lIlllIIII[G.lIlllIlIl[27]] = G."Nav to magnet box";
        G.lIlllIIII[G.lIlllIlIl[28]] = G."Nav to magnet box";
        G.lIlllIIII[G.lIlllIlIl[29]] = G."Cupboard";
        G.lIlllIIII[G.lIlllIlIl[30]] = G."Taking magnet";
        G.lIlllIIII[G.lIlllIlIl[31]] = G."Drop";
        G.lIlllIIII[G.lIlllIlIl[32]] = G."Open";
        G.lIlllIIII[G.lIlllIlIl[33]] = G."Open";
        G.lIlllIIII[G.lIlllIlIl[34]] = G."Search";
        G.lIlllIIII[G.lIlllIlIl[35]] = G."Search";
        G.lIlllIIII[G.lIlllIlIl[36]] = G."Continue";
        G.lIlllIIII[G.lIlllIlIl[37]] = G."null";
        G.lIlllIIII[G.lIlllIlIl[38]] = G." ";
        G.lIlllIIII[G.lIlllIlIl[40]] = G."Nav to magnet box";
        G.lIlllIIII[G.lIlllIlIl[41]] = G."Cupboard";
        G.lIlllIIII[G.lIlllIlIl[42]] = G."Taking magnet";
        G.lIlllIIII[G.lIlllIlIl[43]] = G."Open";
        G.lIlllIIII[G.lIlllIlIl[44]] = G."Open";
        G.lIlllIIII[G.lIlllIlIl[45]] = G."Search";
        G.lIlllIIII[G.lIlllIlIl[46]] = G."Search";
        G.lIlllIIII[G.lIlllIlIl[47]] = G."Continue";
        G.lIlllIIII[G.lIlllIlIl[48]] = G."null";
        G.lIlllIIII[G.lIlllIlIl[49]] = G." ";
        G.lIlllIIII[G.lIlllIlIl[50]] = G."Nav to cheese spot";
        G.lIlllIIII[G.lIlllIlIl[51]] = G."Mouse hole";
        G.lIlllIIII[G.lIlllIlIl[52]] = G."Mouse";
        G.lIlllIIII[G.lIlllIlIl[53]] = G."Using cheese";
        G.lIlllIIII[G.lIlllIlIl[54]] = G."Cheese";
        G.lIlllIIII[G.lIlllIlIl[55]] = G."Cheese";
        G.lIlllIIII[G.lIlllIlIl[56]] = G."Handle mouse";
        G.lIlllIIII[G.lIlllIlIl[57]] = G."Entering maze";
        G.lIlllIIII[G.lIlllIlIl[61]] = G."Handling walking";
        G.lIlllIIII[G.lIlllIlIl[63]] = G."Door";
        G.lIlllIIII[G.lIlllIlIl[64]] = G."Entering shed";
        G.lIlllIIII[G.lIlllIlIl[65]] = G."Nav to safe spot";
        G.lIlllIIII[G.lIlllIlIl[66]] = G."Eat";
        G.lIlllIIII[G.lIlllIlIl[67]] = G."Casting spell";
        G.lIlllIIII[G.lIlllIlIl[68]] = G."Fire rune";
        G.lIlllIIII[G.lIlllIlIl[69]] = G."Fire rune";
        G.lIlllIIII[G.lIlllIlIl[70]] = G."Ball";
        G.lIlllIIII[G.lIlllIlIl[71]] = G."Ball";
        G.lIlllIIII[G.lIlllIlIl[72]] = G."Taking ball";
        G.lIlllIIII[G.lIlllIlIl[73]] = G."Take";
        G.lIlllIIII[G.lIlllIlIl[74]] = G."Ball";
        G.lIlllIIII[G.lIlllIlIl[75]] = G."Breaking tab";
        G.lIlllIIII[G.lIlllIlIl[76]] = G."Break";
        G.lIlllIIII[G.lIlllIlIl[77]] = G."Nav to witches start";
        G.lIlllIIII[G.lIlllIlIl[78]] = G."Turning in quest";
        G.lIlllIIII[G.lIlllIlIl[79]] = G."Boy";
        G.lIlllIIII[G.lIlllIlIl[80]] = G."Drink";
        G.lIlllIIII[G.lIlllIlIl[81]] = G."Entering maze";
        G.lIlllIIII[G.lIlllIlIl[83]] = G."Nav to first spot";
        G.lIlllIIII[G.lIlllIlIl[84]] = G."Nav to second spot";
        G.lIlllIIII[G.lIlllIlIl[85]] = G."Nav to third spot";
        G.lIlllIIII[G.lIlllIlIl[86]] = G."Nav to fountain";
        G.lIlllIIII[G.lIlllIlIl[87]] = G."Getting key";
        G.lIlllIIII[G.lIlllIlIl[88]] = G."Fountain";
        G.lIlllIIII[G.lIlllIlIl[89]] = G."Check";
        G.lIlllIIII[G.lIlllIlIl[90]] = G."Continue";
        G.lIlllIIII[G.lIlllIlIl[91]] = G."null";
        G.lIlllIIII[G.lIlllIlIl[92]] = G." ";
        G.lIlllIIII[G.lIlllIlIl[95]] = G."Nav back toward maze";
        G.lIlllIIII[G.lIlllIlIl[96]] = G."Nav to shed spot";
        G.lIlllIIII[G.lIlllIlIl[97]] = G."Navigating to bank";
        G.lIlllIIII[G.lIlllIlIl[98]] = G."Opening bank";
        G.lIlllIIII[G.lIlllIlIl[100]] = G."Handling banking";
        G.lIlllIIII[G.lIlllIlIl[102]] = G."We are missing supplies, switching to BUYING";
        G.lIlllIIII[G.lIlllIlIl[16]] = G."We are missing supplies, switching to BUYING";
        G.lIlllIIII[G.lIlllIlIl[103]] = G."We are missing supplies, switching to BUYING";
        G.lIlllIIII[G.lIlllIlIl[104]] = G."We are missing supplies, switching to BUYING";
        G.lIlllIIII[G.lIlllIlIl[106]] = G."We are missing supplies, switching to BUYING";
        G.lIlllIIII[G.lIlllIlIl[116]] = G."Witches House quest";
        G.lIlllIIII[G.lIlllIlIl[117]] = G."ring of wealth (";
        G.lIlllIIII[G.lIlllIlIl[163]] = G."Wizard Mizgog";
        G.lIlllIIII[G.lIlllIlIl[164]] = G."Give me a quest please.";
        G.lIlllIIII[G.lIlllIlIl[165]] = G."I'll try.";
        G.lIlllIIII[G.lIlllIlIl[166]] = G."Actually, I know where to find this stuff.";
        G.lIlllIIII[G.lIlllIlIl[167]] = G."Yes.";
        G.lIlllIIII[G.lIlllIlIl[168]] = G."What's the matter?";
        G.lIlllIIII[G.lIlllIlIl[169]] = G."Ok, I'll see what I can do.";
    }

    @Override
    public String U() {
        return lIlllIIII[lIlllIlIl[116]];
    }

    private static void lIIlllIIlIII() {
        lIlllIlIl = new int[175];
        G.lIlllIlIl[0] = 73 + 118 - 47 + 16;
        G.lIlllIlIl[1] = 2;
        G.lIlllIlIl[2] = 98 + 191 - 150 + 81 + (0x41 ^ 0x44) - (0x43 ^ 0x36) + (0x76 ^ 0);
        G.lIlllIlIl[3] = 1;
        G.lIlllIlIl[4] = (0x1E ^ 0x4A ^ (0x2D ^ 0x1B)) & (0x2A ^ 0x25 ^ (0x5D ^ 0x30) ^ -1);
        G.lIlllIlIl[5] = -(0xFFFFBD9D & 0x7BF7) & (0xFFFFBBBF & Short.MAX_VALUE);
        G.lIlllIlIl[6] = 0xFFFF8F6D & 0x72BF;
        G.lIlllIlIl[7] = 0xFFFFFAFE & 0x72F;
        G.lIlllIlIl[8] = -(0xFFFFFBD5 & 0x4C2F) & (0xFFFFD97F & 0x6FFF);
        G.lIlllIlIl[9] = 0xFFFFA7FF & 0x5FC1;
        G.lIlllIlIl[10] = 0xFFFFBFCD & 0x5F7B;
        G.lIlllIlIl[11] = 86 + 115 - 76 + 25;
        G.lIlllIlIl[12] = 3;
        G.lIlllIlIl[13] = 0x3C ^ 0x39;
        G.lIlllIlIl[14] = 0xA3 ^ 0xAB ^ (0x61 ^ 0x6F);
        G.lIlllIlIl[15] = 7 ^ 3;
        G.lIlllIlIl[16] = 73 + 88 - 30 + 18 ^ 31 + 173 - 12 + 5;
        G.lIlllIlIl[17] = 0xFFFFE97F & 0x1FE9;
        G.lIlllIlIl[18] = 0x86 ^ 0x81;
        G.lIlllIlIl[19] = 0xFFFFEFFF & 0x1B33;
        G.lIlllIlIl[20] = 0x25 ^ 0x2D;
        G.lIlllIlIl[21] = 0x84 ^ 0x8D;
        G.lIlllIlIl[22] = 0xE1 ^ 0xC5 ^ (0x8A ^ 0xA4);
        G.lIlllIlIl[23] = 59 + 16 - -120 + 34;
        G.lIlllIlIl[24] = 12 + 109 - 37 + 57 ^ 32 + 81 - 70 + 91;
        G.lIlllIlIl[25] = 0x62 ^ 0x67 ^ (0x90 ^ 0x99);
        G.lIlllIlIl[26] = 0x3A ^ 0x37;
        G.lIlllIlIl[27] = 0x5A ^ 0x54;
        G.lIlllIlIl[28] = 0x6F ^ 0x60;
        G.lIlllIlIl[29] = 32 + 83 - -23 + 42 ^ 49 + 110 - 104 + 109;
        G.lIlllIlIl[30] = 0xF3 ^ 0xC6 ^ (0xBD ^ 0x99);
        G.lIlllIlIl[31] = 92 + 76 - 54 + 56 ^ 159 + 173 - 328 + 180;
        G.lIlllIlIl[32] = 0x89 ^ 0x9A;
        G.lIlllIlIl[33] = 172 + 57 - 169 + 115 ^ 108 + 34 - 65 + 110;
        G.lIlllIlIl[34] = 0x4B ^ 0x5E;
        G.lIlllIlIl[35] = 0x74 ^ 0x62;
        G.lIlllIlIl[36] = 0x80 ^ 0x97;
        G.lIlllIlIl[37] = 198 + 144 - 332 + 206 ^ 59 + 183 - 241 + 191;
        G.lIlllIlIl[38] = 0x7F ^ 0x66;
        G.lIlllIlIl[39] = 0xFFFFFFEF & 0x97A;
        G.lIlllIlIl[40] = 161 + 67 - 144 + 91 ^ 66 + 162 - 215 + 168;
        G.lIlllIlIl[41] = 42 + 28 - -56 + 51 ^ 130 + 80 - 131 + 91;
        G.lIlllIlIl[42] = 0x7D ^ 0x4C ^ (0x9E ^ 0xB3);
        G.lIlllIlIl[43] = 0x34 ^ 0x29;
        G.lIlllIlIl[44] = 7 + 85 - 49 + 85 ^ 30 + 111 - 51 + 68;
        G.lIlllIlIl[45] = 77 + 132 - 160 + 174 ^ 177 + 97 - 268 + 186;
        G.lIlllIlIl[46] = 145 + 106 - 135 + 64 ^ 13 + 6 - -14 + 115;
        G.lIlllIlIl[47] = 86 + 80 - 158 + 180 ^ 62 + 91 - 50 + 54;
        G.lIlllIlIl[48] = 0x91 ^ 0xA3 ^ (0x80 ^ 0x90);
        G.lIlllIlIl[49] = 0x3A ^ 0x31 ^ (0x5A ^ 0x72);
        G.lIlllIlIl[50] = 79 + 71 - 89 + 72 ^ 37 + 34 - -62 + 28;
        G.lIlllIlIl[51] = 0xE ^ 0x2B;
        G.lIlllIlIl[52] = 0xBC ^ 0x9A;
        G.lIlllIlIl[53] = 0x99 ^ 0xBE;
        G.lIlllIlIl[54] = 0x45 ^ 0x6D;
        G.lIlllIlIl[55] = 0x42 ^ 0x7C ^ (0x27 ^ 0x30);
        G.lIlllIlIl[56] = 0x80 ^ 0xBF ^ (0xD6 ^ 0xC3);
        G.lIlllIlIl[57] = 27 + 13 - -178 + 16 ^ 147 + 177 - 200 + 69;
        G.lIlllIlIl[58] = 0xFFFF8BDF & 0x7F75;
        G.lIlllIlIl[59] = 0xFFFFFDDC & 0xFA7;
        G.lIlllIlIl[60] = 0xFFFFADFF & 0x5B6B;
        G.lIlllIlIl[61] = 0xDD ^ 0xA1 ^ (0xCB ^ 0x9B);
        G.lIlllIlIl[62] = -(0xFFFFD7CB & 0x7CBD) & (0xFFFFFFFF & 0x5FFD);
        G.lIlllIlIl[63] = 0xB6 ^ 0x92 ^ (0x2F ^ 0x26);
        G.lIlllIlIl[64] = 0xA7 ^ 0x89;
        G.lIlllIlIl[65] = 71 + 6 - -41 + 69 ^ 121 + 10 - 23 + 40;
        G.lIlllIlIl[66] = 0x80 ^ 0xB0;
        G.lIlllIlIl[67] = 0x1F ^ 0x2E;
        G.lIlllIlIl[68] = 0xCD ^ 0xB9 ^ (0x41 ^ 7);
        G.lIlllIlIl[69] = 0x2C ^ 0x1F;
        G.lIlllIlIl[70] = 147 + 13 - 148 + 144 ^ 129 + 124 - 99 + 14;
        G.lIlllIlIl[71] = 0x2B ^ 0x1E;
        G.lIlllIlIl[72] = 0x6F ^ 0x39 ^ (0x76 ^ 0x16);
        G.lIlllIlIl[73] = 0x3B ^ 0xC;
        G.lIlllIlIl[74] = 0x68 ^ 0x50;
        G.lIlllIlIl[75] = 0x18 ^ 0x21;
        G.lIlllIlIl[76] = 134 + 60 - 111 + 54 ^ 151 + 50 - 183 + 161;
        G.lIlllIlIl[77] = 0x8D ^ 0xB6;
        G.lIlllIlIl[78] = 0x42 ^ 0x7E;
        G.lIlllIlIl[79] = 0x37 ^ 0xA;
        G.lIlllIlIl[80] = 65 + 94 - 25 + 16 ^ 59 + 122 - 167 + 154;
        G.lIlllIlIl[81] = 0x50 ^ 0x36 ^ (0xD ^ 0x54);
        G.lIlllIlIl[82] = 0xFFFFBF9B & 0x4FFF;
        G.lIlllIlIl[83] = 0x22 ^ 0x62;
        G.lIlllIlIl[84] = 4 ^ 0x65 ^ (0x8F ^ 0xAF);
        G.lIlllIlIl[85] = 0xA ^ 0x48;
        G.lIlllIlIl[86] = 0x70 ^ 0x33;
        G.lIlllIlIl[87] = 0x77 ^ 0x33;
        G.lIlllIlIl[88] = 0x6A ^ 0x2F;
        G.lIlllIlIl[89] = 0xC3 ^ 0x85;
        G.lIlllIlIl[90] = 0xCF ^ 0x88;
        G.lIlllIlIl[91] = 0x2C ^ 0x30 ^ (0xFA ^ 0xAE);
        G.lIlllIlIl[92] = 0xEC ^ 0xA5;
        G.lIlllIlIl[93] = -(0xFFFFFA9F & 0x6565) & (0xFFFFEB7F & 0x7FE5);
        G.lIlllIlIl[94] = 0xFFFFED9B & 0x1FEE;
        G.lIlllIlIl[95] = 57 + 31 - -75 + 33 ^ 124 + 52 - 93 + 59;
        G.lIlllIlIl[96] = 0xDA ^ 0xBA ^ (0xE9 ^ 0xC2);
        G.lIlllIlIl[97] = 0x51 ^ 0x6E ^ (0x23 ^ 0x50);
        G.lIlllIlIl[98] = 0xE3 ^ 0xAE;
        G.lIlllIlIl[99] = 0xFFFFB3C8 & 0x5FBF;
        G.lIlllIlIl[100] = 0x64 ^ 0x2A;
        G.lIlllIlIl[101] = -(0xFFFFF477 & 0x7F8E) & (0xFFFFF7FD & 0x7FEF);
        G.lIlllIlIl[102] = 0x5E ^ 0x4C ^ (0x70 ^ 0x2D);
        G.lIlllIlIl[103] = 0x23 ^ 0x72;
        G.lIlllIlIl[104] = 0x93 ^ 0xC1;
        G.lIlllIlIl[105] = -(0xFFFFF331 & 0x6CDF) & (0xFFFFFFD7 & 0x7F7F);
        G.lIlllIlIl[106] = 194 + 169 - 272 + 152 ^ 112 + 89 - 164 + 123;
        G.lIlllIlIl[107] = 0xFFFFF1FD & 0xFF6;
        G.lIlllIlIl[108] = 0xFFFFFFF9 & 0x3157;
        G.lIlllIlIl[109] = 0x49 ^ 0x2D;
        G.lIlllIlIl[110] = 0xFFFF91F3 & 0x6F9C;
        G.lIlllIlIl[111] = -(0xFFFFFCA6 & 0x2F5B) & (0xFFFFFFFF & 0x3FF7);
        G.lIlllIlIl[112] = -(0xFFFFD5B2 & 0x3B6F) & (0xFFFFFFFD & 0x3FEF);
        G.lIlllIlIl[113] = 0xFFFFC6EC & 0x7B7B;
        G.lIlllIlIl[114] = 0xFFFFB77C & 0x4FEF;
        G.lIlllIlIl[115] = 0xFFFF8FF1 & 0x77DE;
        G.lIlllIlIl[116] = 0xA4 ^ 0xA2 ^ (0xFF ^ 0xAD);
        G.lIlllIlIl[117] = 0x44 ^ 0x2B ^ (0x76 ^ 0x4C);
        G.lIlllIlIl[118] = 0xFFFFE7EE & 0x1DD5;
        G.lIlllIlIl[119] = 0xFFFFE5BF & 0x1FFE;
        G.lIlllIlIl[120] = -(0xFFFFFC3D & 0x6BD3) & (0xFFFFFDD7 & 0x6FF8);
        G.lIlllIlIl[121] = -(0xFFFFF19D & 0x3EF7) & (0xFFFFFFBE & 0x32FF);
        G.lIlllIlIl[122] = 0xFFFFFFDF & 0x5E2;
        G.lIlllIlIl[123] = 0xFFFF9BED & 0x6F76;
        G.lIlllIlIl[124] = -(0xFFFFEDFF & 0x5277) & (0xFFFFCFFF & 0x7DFE);
        G.lIlllIlIl[125] = 0xFFFFDBEF & 0x2F77;
        G.lIlllIlIl[126] = 0xFFFF8B56 & 0x7FFD;
        G.lIlllIlIl[127] = -(0xFFFFB7F9 & 0x586F) & (0xFFFFFFFB & 0x1DEF);
        G.lIlllIlIl[128] = 0xFFFF9FEB & 0x6B77;
        G.lIlllIlIl[129] = -(0xFFFFF7FE & 0x5887) & (0xFFFFFBFF & 0x5FF7);
        G.lIlllIlIl[130] = 0xFFFFAD8E & 0x5FF3;
        G.lIlllIlIl[131] = -(0xFFFFF43F & 0x6FE9) & (0xFFFFFFFF & 0x6F7E);
        G.lIlllIlIl[132] = 0xFFFFFDF7 & 0xF8D;
        G.lIlllIlIl[133] = 0xFFFFFFFD & 0xB67;
        G.lIlllIlIl[134] = -(0xFFFFE0BC & 0x7FCB) & (0xFFFFFBF7 & 0x6FEF);
        G.lIlllIlIl[135] = 0xFFFFFD87 & 0xFFF;
        G.lIlllIlIl[136] = -(0xFFFFDAE9 & 0x759F) & (0xFFFFFFDF & 0x5BFF);
        G.lIlllIlIl[137] = -(0xFFFFF347 & 0x1CBB) & (0xFFFFFF77 & 0x1BFB);
        G.lIlllIlIl[138] = 0xFFFFFFEB & 0xC34;
        G.lIlllIlIl[139] = 0xFFFFBFFF & 0x4C5B;
        G.lIlllIlIl[140] = 0xFFFFEF6F & 0x1BFF;
        G.lIlllIlIl[141] = -(0xFFFFB77D & 0x4A83) & (0xFFFF9F7F & 0x6FFF);
        G.lIlllIlIl[142] = 0xFFFFFB7F & 0xFF8;
        G.lIlllIlIl[143] = 0xFFFF8F97 & 0x7BFE;
        G.lIlllIlIl[144] = 0xFFFFDFB5 & 0x2D7F;
        G.lIlllIlIl[145] = 0xFFFF8BD7 & 0x7F7B;
        G.lIlllIlIl[146] = -(0xFFFFFBBF & 0x4663) & (0xFFFFDFF3 & 0x6FBF);
        G.lIlllIlIl[147] = 0xFFFFABD9 & 0x5F7F;
        G.lIlllIlIl[148] = 0xFFFFEDDB & 0x1FB7;
        G.lIlllIlIl[149] = -(0xFFFFFC2E & 0x73F3) & (0xFFFFFF7F & 0x7BFB);
        G.lIlllIlIl[150] = 0xFFFFF6F5 & 0x2F9E;
        G.lIlllIlIl[151] = 0xFFFFEEDA & 0x37B7;
        G.lIlllIlIl[152] = 0xFFFFFF95 & 0x26FB;
        G.lIlllIlIl[153] = 0xFFFFEFA9 & 0x1DDF;
        G.lIlllIlIl[154] = -(0xFFFFB8E1 & 0x57BF) & (0xFFFFDBFF & 0x3FFF);
        G.lIlllIlIl[155] = 0xFFFFBDBD & 0x4FCF;
        G.lIlllIlIl[156] = 0xFFFF9BFF & 0x6F5B;
        G.lIlllIlIl[157] = -(0xFFFFE37E & 0x3ECD) & (0xFFFFFFDF & 0x2FFF);
        G.lIlllIlIl[158] = 0xFFFFE6DF & 0x3FAE;
        G.lIlllIlIl[159] = 0xFFFF9FFD & 0x6B5F;
        G.lIlllIlIl[160] = 0xFFFFEFB5 & 0x36DF;
        G.lIlllIlIl[161] = -(0xFFFFD7F5 & 0x6BFB) & (0xFFFFFFF3 & Short.MAX_VALUE);
        G.lIlllIlIl[162] = 0xFFFFDFB7 & 0x344B;
        G.lIlllIlIl[163] = 0x37 ^ 0x61;
        G.lIlllIlIl[164] = 0x4C ^ 0x1B;
        G.lIlllIlIl[165] = 0x13 ^ 0x23 ^ (0x51 ^ 0x39);
        G.lIlllIlIl[166] = 0x2C ^ 0x75;
        G.lIlllIlIl[167] = 0x3C ^ 0x20 ^ (2 ^ 0x44);
        G.lIlllIlIl[168] = 0x53 ^ 8;
        G.lIlllIlIl[169] = 0x22 ^ 0x3C ^ (0xF8 ^ 0xBA);
        G.lIlllIlIl[170] = 0xFFFFEFDE & 0x1FBD;
        G.lIlllIlIl[171] = -(0xFFFFF7E7 & 0x287B) & (0xFFFFEFFF & 0x3FFF);
        G.lIlllIlIl[172] = -(0xFFFFF6E7 & 0x795A) & (0xFFFFFFFF & 0x7FDF);
        G.lIlllIlIl[173] = -(0xFFFFCA77 & 0x7589) & (0xFFFFCF9F & Short.MAX_VALUE);
        G.lIlllIlIl[174] = 0x68 ^ 0x41 ^ (0x38 ^ 0x4C);
    }

    private static void af() {
        d llIIIllIIIlIII;
        block21: {
            block20: {
                Object llIIIllIIIlIIl;
                block19: {
                    block18: {
                        int[] nArray = new int[lIlllIlIl[3]];
                        nArray[G.lIlllIlIl[4]] = lIlllIlIl[8];
                        if (G.lIIlllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIlllIlIl[8], lIlllIlIl[109], lIlllIlIl[110]);
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIlllIlIl[3]];
                        nArray2[G.lIlllIlIl[4]] = lIlllIlIl[8];
                        if (G.lIIlllIIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIlllIlIl[3]];
                            nArray3[G.lIlllIlIl[4]] = lIlllIlIl[8];
                            if (G.lIIlllIIlIIl(Bank.getFirst((int[])nArray3).getQuantity(), lIlllIlIl[33])) {
                                llIIIllIIIlIIl = new d(lIlllIlIl[8], lIlllIlIl[54], lIlllIlIl[110]);
                                bv.add((d)llIIIllIIIlIIl);
                                0;
                            }
                        }
                        int[] nArray4 = new int[lIlllIlIl[3]];
                        nArray4[G.lIlllIlIl[4]] = lIlllIlIl[9];
                        if (!G.lIIlllIIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) break block18;
                        int[] nArray5 = new int[lIlllIlIl[3]];
                        nArray5[G.lIlllIlIl[4]] = lIlllIlIl[9];
                        if (!G.lIIlllIIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) break block19;
                        int[] nArray6 = new int[lIlllIlIl[3]];
                        nArray6[G.lIlllIlIl[4]] = lIlllIlIl[9];
                        if (!G.lIIlllIIlIIl(Bank.getFirst((int[])nArray6).getQuantity(), lIlllIlIl[13])) break block19;
                    }
                    llIIIllIIIlIIl = new d(lIlllIlIl[9], lIlllIlIl[13], lIlllIlIl[111]);
                    bv.add((d)llIIIllIIIlIIl);
                    0;
                }
                if (G.lIIlllIIllII(Bank.contains((Predicate)(llIIIllIIIlIIl = item -> item.getName().toLowerCase().contains(lIlllIIII[lIlllIlIl[117]]))) ? 1 : 0)) {
                    llIIIllIIIlIII = new d(lIlllIlIl[112], lIlllIlIl[31], lIlllIlIl[113]);
                    bv.add(llIIIllIIIlIII);
                    0;
                }
                int[] nArray = new int[lIlllIlIl[3]];
                nArray[G.lIlllIlIl[4]] = lIlllIlIl[105];
                if (G.lIIlllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    llIIIllIIIlIII = new d(lIlllIlIl[105], lIlllIlIl[54], lIlllIlIl[114]);
                    bv.add(llIIIllIIIlIII);
                    0;
                }
                int[] nArray7 = new int[lIlllIlIl[3]];
                nArray7[G.lIlllIlIl[4]] = lIlllIlIl[10];
                if (!G.lIIlllIIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block20;
                int[] nArray8 = new int[lIlllIlIl[3]];
                nArray8[G.lIlllIlIl[4]] = lIlllIlIl[10];
                if (!G.lIIlllIIlIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block21;
                int[] nArray9 = new int[lIlllIlIl[3]];
                nArray9[G.lIlllIlIl[4]] = lIlllIlIl[10];
                if (!G.lIIlllIIlIIl(Bank.getFirst((int[])nArray9).getQuantity(), lIlllIlIl[22])) break block21;
            }
            llIIIllIIIlIII = new d(lIlllIlIl[10], lIlllIlIl[33], lIlllIlIl[114]);
            bv.add(llIIIllIIIlIII);
            0;
        }
        int[] nArray = new int[lIlllIlIl[3]];
        nArray[G.lIlllIlIl[4]] = lIlllIlIl[108];
        if (G.lIIlllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            llIIIllIIIlIII = new d(lIlllIlIl[108], lIlllIlIl[13], i.bq);
            bv.add(llIIIllIIIlIII);
            0;
        }
        int[] nArray10 = new int[lIlllIlIl[3]];
        nArray10[G.lIlllIlIl[4]] = lIlllIlIl[7];
        if (G.lIIlllIIlIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
            int[] nArray11 = new int[lIlllIlIl[3]];
            nArray11[G.lIlllIlIl[4]] = lIlllIlIl[7];
            if (G.lIIlllIIlIIl(Bank.getFirst((int[])nArray11).getQuantity(), lIlllIlIl[101])) {
                llIIIllIIIlIII = new d(lIlllIlIl[7], lIlllIlIl[115], lIlllIlIl[18]);
                bv.add(llIIIllIIIlIII);
                0;
            }
        }
        int[] nArray12 = new int[lIlllIlIl[3]];
        nArray12[G.lIlllIlIl[4]] = lIlllIlIl[5];
        if (G.lIIlllIIlIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lIlllIlIl[3]];
            nArray13[G.lIlllIlIl[4]] = lIlllIlIl[5];
            if (G.lIIlllIIlIIl(Bank.getFirst((int[])nArray13).getQuantity(), lIlllIlIl[101])) {
                llIIIllIIIlIII = new d(lIlllIlIl[5], lIlllIlIl[115], lIlllIlIl[18]);
                bv.add(llIIIllIIIlIII);
                0;
            }
        }
        int[] nArray14 = new int[lIlllIlIl[3]];
        nArray14[G.lIlllIlIl[4]] = lIlllIlIl[6];
        if (G.lIIlllIIlIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
            int[] nArray15 = new int[lIlllIlIl[3]];
            nArray15[G.lIlllIlIl[4]] = lIlllIlIl[6];
            if (G.lIIlllIIlIIl(Bank.getFirst((int[])nArray15).getQuantity(), lIlllIlIl[101])) {
                llIIIllIIIlIII = new d(lIlllIlIl[6], lIlllIlIl[115], lIlllIlIl[18]);
                bv.add(llIIIllIIIlIII);
                0;
            }
        }
    }

    private static boolean lIIlllIIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIIllll(Object object) {
        return object != null;
    }

    static {
        G.lIIlllIIlIII();
        G.lIIlllIIIlII();
        hJ = lIlllIlIl[12];
        hN = lIlllIlIl[17];
        hF = lIlllIlIl[1];
        hM = lIlllIlIl[82];
        hG = lIlllIlIl[2];
        hL = lIlllIlIl[18];
        hQ = lIlllIlIl[19];
        hK = lIlllIlIl[14];
        in = lIlllIlIl[118];
        hH = lIlllIlIl[3];
        ik = lIlllIlIl[119];
        il = lIlllIlIl[120];
        it = lIlllIlIl[9];
        ir = lIlllIlIl[121];
        hE = lIlllIlIl[0];
        hI = lIlllIlIl[1];
        hP = lIlllIlIl[39];
        ip = lIlllIlIl[5];
        is = lIlllIlIl[8];
        im = lIlllIlIl[122];
        hO = lIlllIlIl[60];
        io = lIlllIlIl[7];
        iq = lIlllIlIl[6];
        ht = new WorldPoint(lIlllIlIl[123], lIlllIlIl[59], lIlllIlIl[4]);
        hu = new WorldPoint(lIlllIlIl[62], lIlllIlIl[124], lIlllIlIl[4]);
        hv = new WorldPoint(lIlllIlIl[125], lIlllIlIl[94], lIlllIlIl[4]);
        hw = new WorldArea(lIlllIlIl[126], lIlllIlIl[127], lIlllIlIl[31], lIlllIlIl[14], lIlllIlIl[4]);
        hx = new WorldArea(lIlllIlIl[128], lIlllIlIl[127], lIlllIlIl[30], lIlllIlIl[14], lIlllIlIl[4]);
        hy = new WorldArea(lIlllIlIl[129], lIlllIlIl[130], lIlllIlIl[15], lIlllIlIl[22], lIlllIlIl[4]);
        hz = new WorldArea(lIlllIlIl[131], lIlllIlIl[132], lIlllIlIl[24], lIlllIlIl[15], lIlllIlIl[4]);
        hA = new WorldArea(lIlllIlIl[133], lIlllIlIl[132], lIlllIlIl[18], lIlllIlIl[13], lIlllIlIl[4]);
        hB = new WorldArea(lIlllIlIl[134], lIlllIlIl[135], lIlllIlIl[21], lIlllIlIl[18], lIlllIlIl[4]);
        hC = new WorldArea(lIlllIlIl[136], lIlllIlIl[132], lIlllIlIl[15], lIlllIlIl[15], lIlllIlIl[4]);
        hD = new WorldArea(lIlllIlIl[137], lIlllIlIl[132], lIlllIlIl[15], lIlllIlIl[13], lIlllIlIl[4]);
        hR = new WorldPoint(lIlllIlIl[138], lIlllIlIl[139], lIlllIlIl[1]);
        hS = new WorldPoint(lIlllIlIl[140], lIlllIlIl[141], lIlllIlIl[4]);
        hT = new WorldPoint(lIlllIlIl[142], lIlllIlIl[127], lIlllIlIl[4]);
        hU = new WorldPoint(lIlllIlIl[143], lIlllIlIl[144], lIlllIlIl[4]);
        hV = new WorldPoint(lIlllIlIl[145], lIlllIlIl[146], lIlllIlIl[4]);
        hW = new WorldPoint(lIlllIlIl[131], lIlllIlIl[94], lIlllIlIl[4]);
        hX = new WorldPoint(lIlllIlIl[147], lIlllIlIl[148], lIlllIlIl[4]);
        hY = new WorldPoint(lIlllIlIl[149], lIlllIlIl[150], lIlllIlIl[4]);
        hZ = new WorldPoint(lIlllIlIl[145], lIlllIlIl[151], lIlllIlIl[4]);
        ia = new WorldPoint(lIlllIlIl[131], lIlllIlIl[151], lIlllIlIl[4]);
        ib = new WorldPoint(lIlllIlIl[131], lIlllIlIl[152], lIlllIlIl[4]);
        ic = new WorldPoint(lIlllIlIl[136], lIlllIlIl[151], lIlllIlIl[4]);
        id = new WorldPoint(lIlllIlIl[136], lIlllIlIl[152], lIlllIlIl[4]);
        ie = new WorldPoint(lIlllIlIl[58], lIlllIlIl[153], lIlllIlIl[4]);
        if = new WorldPoint(lIlllIlIl[62], lIlllIlIl[135], lIlllIlIl[4]);
        ig = new WorldPoint(lIlllIlIl[154], lIlllIlIl[155], lIlllIlIl[4]);
        ih = new WorldArea(new WorldPoint(lIlllIlIl[156], lIlllIlIl[157], lIlllIlIl[4]), new WorldPoint(lIlllIlIl[58], lIlllIlIl[94], lIlllIlIl[4]));
        ii = new WorldArea(new WorldPoint(lIlllIlIl[145], lIlllIlIl[158], lIlllIlIl[4]), new WorldPoint(lIlllIlIl[159], lIlllIlIl[160], lIlllIlIl[4]));
        ij = new WorldArea(lIlllIlIl[62], lIlllIlIl[130], lIlllIlIl[14], lIlllIlIl[22], lIlllIlIl[4]);
        bv = new ArrayList<d>();
        iu = lIlllIlIl[161];
        iv = lIlllIlIl[162];
        iw = lIlllIIII[lIlllIlIl[163]];
        String[] stringArray = new String[lIlllIlIl[14]];
        stringArray[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[164]];
        stringArray[G.lIlllIlIl[3]] = lIlllIIII[lIlllIlIl[165]];
        stringArray[G.lIlllIlIl[1]] = lIlllIIII[lIlllIlIl[166]];
        stringArray[G.lIlllIlIl[12]] = lIlllIIII[lIlllIlIl[167]];
        stringArray[G.lIlllIlIl[15]] = lIlllIIII[lIlllIlIl[168]];
        stringArray[G.lIlllIlIl[13]] = lIlllIIII[lIlllIlIl[169]];
        hl = stringArray;
        int[] nArray = new int[lIlllIlIl[15]];
        nArray[G.lIlllIlIl[4]] = lIlllIlIl[170];
        nArray[G.lIlllIlIl[3]] = lIlllIlIl[171];
        nArray[G.lIlllIlIl[1]] = lIlllIlIl[172];
        nArray[G.lIlllIlIl[12]] = lIlllIlIl[173];
        ix = nArray;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (G.lIIlllIlIIIl(e.j(lIlllIlIl[2]), lIlllIlIl[18])) {
            bl = lIlllIlIl[3];
            0;
            if (2 == (0xE ^ 0x21 ^ (0x95 ^ 0xBE))) {
                return ((235 + 69 - 297 + 242 ^ 77 + 150 - 82 + 50) & (0xFF ^ 0x95 ^ (0x7B ^ 0x2B) ^ -1)) != 0;
            }
        } else {
            bl = lIlllIlIl[4];
        }
        return bl;
    }

    private static boolean lIIlllIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlllIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static void bN() {
        TileObject llIIIllIIlIlIl2;
        block91: {
            block93: {
                block92: {
                    block89: {
                        block90: {
                            Widget llIIIllIIlIlII;
                            if (G.lIIlllIIlIIl(e.j(lIlllIlIl[0]), lIlllIlIl[1])) {
                                try {
                                    P.ct();
                                    0;
                                }
                                catch (Exception llIIIllIIlIlIl2) {
                                    llIIIllIIlIlIl2.printStackTrace();
                                }
                                if (-(0x1D ^ 0x19) > 0) {
                                    return;
                                }
                            }
                            if (G.lIIlllIIlIlI(e.j(lIlllIlIl[0]), lIlllIlIl[1]) && G.lIIlllIIlIIl(e.j(lIlllIlIl[2]), lIlllIlIl[3])) {
                                block88: {
                                    if (G.lIIlllIIlIll(bt ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[4]];
                                        b.a(bv);
                                        if (G.lIIlllIIlIIl(bv.size(), lIlllIlIl[3])) {
                                            System.out.println(lIlllIIII[lIlllIlIl[3]]);
                                            bt = lIlllIlIl[4];
                                        }
                                    }
                                    do {
                                        if (G.lIIlllIIlIll(z.bi() ? 1 : 0)) {
                                            int[] nArray = new int[lIlllIlIl[3]];
                                            nArray[G.lIlllIlIl[4]] = lIlllIlIl[5];
                                            if (G.lIIlllIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                int[] nArray2 = new int[lIlllIlIl[3]];
                                                nArray2[G.lIlllIlIl[4]] = lIlllIlIl[6];
                                                if (G.lIIlllIIlIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                                    int[] nArray3 = new int[lIlllIlIl[3]];
                                                    nArray3[G.lIlllIlIl[4]] = lIlllIlIl[7];
                                                    if (G.lIIlllIIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                                        int[] nArray4 = new int[lIlllIlIl[3]];
                                                        nArray4[G.lIlllIlIl[4]] = lIlllIlIl[8];
                                                        if (G.lIIlllIIlIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                                            int[] nArray5 = new int[lIlllIlIl[3]];
                                                            nArray5[G.lIlllIlIl[4]] = lIlllIlIl[9];
                                                            if (G.lIIlllIIlIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                                                int[] nArray6 = new int[lIlllIlIl[3]];
                                                                nArray6[G.lIlllIlIl[4]] = lIlllIlIl[10];
                                                                if (!G.lIIlllIIllII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block88;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!G.lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) break block88;
                                        G.bP();
                                        Time.sleepTicks((int)lIlllIlIl[3]);
                                        0;
                                        0;
                                    } while (null == null);
                                    return;
                                }
                                if (G.lIIlllIIllII(bt ? 1 : 0)) {
                                    if (G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[11])) {
                                        int[] nArray = new int[lIlllIlIl[3]];
                                        nArray[G.lIlllIlIl[4]] = lIlllIlIl[10];
                                        if (G.lIIlllIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[1]];
                                            int[] nArray7 = new int[lIlllIlIl[3]];
                                            nArray7[G.lIlllIlIl[4]] = lIlllIlIl[10];
                                            Inventory.getFirst((int[])nArray7).interact(lIlllIIII[lIlllIlIl[12]]);
                                            Time.sleepTicks((int)lIlllIlIl[13]);
                                            0;
                                        }
                                    }
                                    if (G.lIIlllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[11]) && G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[14])) {
                                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[15]];
                                        if (G.lIIlllIIlIll(Inventory.contains((int[])f.aV) ? 1 : 0) && G.lIIlllIIlIIl(Movement.getRunEnergy(), lIlllIlIl[16])) {
                                            Inventory.getFirst((int[])f.aV).interact(lIlllIIII[lIlllIlIl[13]]);
                                            Time.sleepTicks((int)lIlllIlIl[3]);
                                            0;
                                        }
                                        Movement.walkTo((WorldPoint)hS);
                                        0;
                                        Time.sleepTicks((int)lIlllIlIl[3]);
                                        0;
                                    }
                                    if (G.lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[14])) {
                                        g.a(lIlllIIII[lIlllIlIl[14]], hl);
                                    }
                                }
                            }
                            if (G.lIIlllIIlIlI(e.j(lIlllIlIl[0]), lIlllIlIl[1]) && G.lIIlllIIlIlI(e.j(lIlllIlIl[2]), lIlllIlIl[3])) {
                                if (G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hV), lIlllIlIl[15]) && G.lIIlllIIllII(ii.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lIlllIlIl[3]];
                                    nArray[G.lIlllIlIl[4]] = lIlllIlIl[17];
                                    if (G.lIIlllIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[18]];
                                        Movement.walkTo((WorldPoint)hV);
                                        0;
                                        Time.sleepTicks((int)lIlllIlIl[3]);
                                        0;
                                    }
                                }
                                if (G.lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hV), lIlllIlIl[15]) && G.lIIlllIIllII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    int[] nArray = new int[lIlllIlIl[3]];
                                    nArray[G.lIlllIlIl[4]] = lIlllIlIl[17];
                                    if (G.lIIlllIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray8 = new int[lIlllIlIl[3]];
                                        nArray8[G.lIlllIlIl[4]] = lIlllIlIl[19];
                                        llIIIllIIlIlIl2 = TileObjects.getNearest((int[])nArray8);
                                        if (G.lIIlllIIlIll(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray9 = new int[lIlllIlIl[3]];
                                            nArray9[G.lIlllIlIl[4]] = lIlllIlIl[8];
                                            Inventory.getFirst((int[])nArray9).interact(lIlllIIII[lIlllIlIl[20]]);
                                            Time.sleepTicks((int)lIlllIlIl[3]);
                                            0;
                                        }
                                        if (G.lIIlllIIllII(Inventory.isFull() ? 1 : 0)) {
                                            if (G.lIIlllIIllll(llIIIllIIlIlIl2) && G.lIIlllIIllII(Dialog.isOpen() ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[21]];
                                                llIIIllIIlIlIl2.interact(lIlllIIII[lIlllIlIl[22]]);
                                                Dialog.continueSpace();
                                            }
                                            if (G.lIIlllIIllll(llIIIllIIlIlII = Widgets.get((int)lIlllIlIl[23], (int)lIlllIlIl[3]))) {
                                                llIIIllIIlIlII.interact(lIlllIIII[lIlllIlIl[24]]);
                                                llIIIllIIlIlII.interact(lIlllIlIl[4]);
                                                llIIIllIIlIlII.interact(lIlllIIII[lIlllIlIl[25]]);
                                                Keyboard.type((String)lIlllIIII[lIlllIlIl[26]]);
                                            }
                                        }
                                    }
                                }
                                if (G.lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hV), lIlllIlIl[15])) {
                                    int[] nArray = new int[lIlllIlIl[3]];
                                    nArray[G.lIlllIlIl[4]] = lIlllIlIl[17];
                                    if (G.lIIlllIIlIll(Inventory.contains((int[])nArray) ? 1 : 0) && G.lIIlllIIllII(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[27]];
                                        Movement.walkTo((WorldPoint)hZ);
                                        0;
                                        Time.sleepTicks((int)lIlllIlIl[3]);
                                        0;
                                    }
                                }
                                if (G.lIIlllIIlIll(ii.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[28]];
                                    if (G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hZ), lIlllIlIl[3])) {
                                        Movement.walkTo((WorldPoint)hZ);
                                        0;
                                        Time.sleepTicks((int)lIlllIlIl[3]);
                                        0;
                                    }
                                    if (G.lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hZ), lIlllIlIl[3])) {
                                        String[] stringArray = new String[lIlllIlIl[3]];
                                        stringArray[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[29]];
                                        llIIIllIIlIlIl2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[30]];
                                        if (G.lIIlllIIlIll(Inventory.isFull() ? 1 : 0)) {
                                            int[] nArray = new int[lIlllIlIl[3]];
                                            nArray[G.lIlllIlIl[4]] = lIlllIlIl[8];
                                            Inventory.getFirst((int[])nArray).interact(lIlllIIII[lIlllIlIl[31]]);
                                            Time.sleepTicks((int)lIlllIlIl[3]);
                                            0;
                                        }
                                        if (G.lIIlllIIllll(llIIIllIIlIlIl2)) {
                                            String[] stringArray2 = new String[lIlllIlIl[3]];
                                            stringArray2[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[32]];
                                            if (G.lIIlllIIlIll(llIIIllIIlIlIl2.hasAction(stringArray2) ? 1 : 0)) {
                                                llIIIllIIlIlIl2.interact(lIlllIIII[lIlllIlIl[33]]);
                                                Time.sleepTicks((int)lIlllIlIl[1]);
                                                0;
                                            }
                                            String[] stringArray3 = new String[lIlllIlIl[3]];
                                            stringArray3[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[34]];
                                            if (G.lIIlllIIlIll(llIIIllIIlIlIl2.hasAction(stringArray3) ? 1 : 0)) {
                                                llIIIllIIlIlIl2.interact(lIlllIIII[lIlllIlIl[35]]);
                                                Time.sleepTicks((int)lIlllIlIl[1]);
                                                0;
                                                llIIIllIIlIlII = Widgets.get((int)lIlllIlIl[23], (int)lIlllIlIl[3]);
                                                if (G.lIIlllIIllll(llIIIllIIlIlII)) {
                                                    llIIIllIIlIlII.interact(lIlllIIII[lIlllIlIl[36]]);
                                                    llIIIllIIlIlII.interact(lIlllIlIl[4]);
                                                    llIIIllIIlIlII.interact(lIlllIIII[lIlllIlIl[37]]);
                                                    Keyboard.type((String)lIlllIIII[lIlllIlIl[38]]);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (G.lIIlllIIlIlI(e.j(lIlllIlIl[0]), lIlllIlIl[1]) && G.lIIlllIIlIlI(e.j(lIlllIlIl[2]), lIlllIlIl[1])) {
                                cl = lIlllIlIl[4];
                                if (G.lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[22])) {
                                    while (G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hV), lIlllIlIl[1]) && G.lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)hV);
                                        0;
                                        Time.sleepTicks((int)lIlllIlIl[3]);
                                        0;
                                        0;
                                        if ((0xB1 ^ 0xB5) == (0x90 ^ 0x94)) continue;
                                        return;
                                    }
                                }
                                int[] nArray = new int[lIlllIlIl[3]];
                                nArray[G.lIlllIlIl[4]] = lIlllIlIl[39];
                                if (G.lIIlllIIllII(Inventory.contains((int[])nArray) ? 1 : 0) && G.lIIlllIIlIll(ii.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[40]];
                                    if (G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hZ), lIlllIlIl[3])) {
                                        Movement.walkTo((WorldPoint)hZ);
                                        0;
                                        Time.sleepTicks((int)lIlllIlIl[3]);
                                        0;
                                    }
                                    if (G.lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hZ), lIlllIlIl[3])) {
                                        String[] stringArray = new String[lIlllIlIl[3]];
                                        stringArray[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[41]];
                                        llIIIllIIlIlIl2 = TileObjects.getNearest((String[])stringArray);
                                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[42]];
                                        if (G.lIIlllIIllll(llIIIllIIlIlIl2)) {
                                            String[] stringArray4 = new String[lIlllIlIl[3]];
                                            stringArray4[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[43]];
                                            if (G.lIIlllIIlIll(llIIIllIIlIlIl2.hasAction(stringArray4) ? 1 : 0)) {
                                                llIIIllIIlIlIl2.interact(lIlllIIII[lIlllIlIl[44]]);
                                                Time.sleepTicks((int)lIlllIlIl[1]);
                                                0;
                                            }
                                            String[] stringArray5 = new String[lIlllIlIl[3]];
                                            stringArray5[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[45]];
                                            if (G.lIIlllIIlIll(llIIIllIIlIlIl2.hasAction(stringArray5) ? 1 : 0)) {
                                                llIIIllIIlIlIl2.interact(lIlllIIII[lIlllIlIl[46]]);
                                                Time.sleepTicks((int)lIlllIlIl[1]);
                                                0;
                                                llIIIllIIlIlII = Widgets.get((int)lIlllIlIl[23], (int)lIlllIlIl[3]);
                                                if (G.lIIlllIIllll(llIIIllIIlIlII)) {
                                                    llIIIllIIlIlII.interact(lIlllIIII[lIlllIlIl[47]]);
                                                    llIIIllIIlIlII.interact(lIlllIlIl[4]);
                                                    llIIIllIIlIlII.interact(lIlllIIII[lIlllIlIl[48]]);
                                                    Keyboard.type((String)lIlllIIII[lIlllIlIl[49]]);
                                                }
                                            }
                                        }
                                    }
                                }
                                int[] nArray10 = new int[lIlllIlIl[3]];
                                nArray10[G.lIlllIlIl[4]] = lIlllIlIl[39];
                                if (G.lIIlllIIlIll(Inventory.contains((int[])nArray10) ? 1 : 0) && G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIlIl[3])) {
                                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[50]];
                                    Movement.walkTo((WorldPoint)hW);
                                    0;
                                    Time.sleepTicks((int)lIlllIlIl[3]);
                                    0;
                                }
                                if (G.lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIlIl[1])) {
                                    String[] stringArray = new String[lIlllIlIl[3]];
                                    stringArray[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[51]];
                                    llIIIllIIlIlIl2 = TileObjects.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIlllIlIl[3]];
                                    stringArray6[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[52]];
                                    llIIIllIIlIlII = NPCs.getNearest((String[])stringArray6);
                                    if (G.lIIlllIIllll(llIIIllIIlIlIl2) && G.lIIlllIlIIII(llIIIllIIlIlII)) {
                                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[53]];
                                        String[] stringArray7 = new String[lIlllIlIl[3]];
                                        stringArray7[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[54]];
                                        if (G.lIIlllIIlIll(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lIlllIlIl[3]];
                                            stringArray8[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[55]];
                                            Inventory.getFirst((String[])stringArray8).useOn(llIIIllIIlIlIl2);
                                        }
                                        Time.sleepTicks((int)lIlllIlIl[3]);
                                        0;
                                    }
                                    if (G.lIIlllIIllll(llIIIllIIlIlII)) {
                                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[56]];
                                        int[] nArray11 = new int[lIlllIlIl[3]];
                                        nArray11[G.lIlllIlIl[4]] = lIlllIlIl[39];
                                        if (G.lIIlllIIlIll(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                            int[] nArray12 = new int[lIlllIlIl[3]];
                                            nArray12[G.lIlllIlIl[4]] = lIlllIlIl[39];
                                            Inventory.getFirst((int[])nArray12).useOn((Actor)llIIIllIIlIlII);
                                        }
                                        Time.sleepTicks((int)lIlllIlIl[3]);
                                        0;
                                    }
                                }
                            }
                            if (G.lIIlllIIlIll(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIlllIIlIlI(e.j(lIlllIlIl[2]), lIlllIlIl[12])) {
                                AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[57]];
                                Movement.walkTo((WorldPoint)new WorldPoint(lIlllIlIl[58], lIlllIlIl[59], lIlllIlIl[4]));
                                0;
                                Time.sleepTicks((int)lIlllIlIl[3]);
                                0;
                            }
                            if (!G.lIIlllIIllII(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !G.lIIlllIIlIlI(e.j(lIlllIlIl[2]), lIlllIlIl[12])) break block89;
                            int[] nArray = new int[lIlllIlIl[3]];
                            nArray[G.lIlllIlIl[4]] = lIlllIlIl[60];
                            if (!G.lIIlllIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block90;
                            int[] nArray13 = new int[lIlllIlIl[3]];
                            nArray13[G.lIlllIlIl[4]] = lIlllIlIl[60];
                            if (!G.lIIlllIIlIll(Inventory.contains((int[])nArray13) ? 1 : 0) || !G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(if), lIlllIlIl[12])) break block89;
                        }
                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[61]];
                        if (G.lIIlllIlIIIl(Movement.getRunEnergy(), lIlllIlIl[33])) {
                            G.bO();
                        }
                    }
                    if (G.lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(if), lIlllIlIl[12])) {
                        int[] nArray = new int[lIlllIlIl[3]];
                        nArray[G.lIlllIlIl[4]] = lIlllIlIl[60];
                        if (G.lIIlllIIlIll(Inventory.contains((int[])nArray) ? 1 : 0) && G.lIIlllIIlIlI(Players.getLocal().getWorldLocation().getX(), lIlllIlIl[62])) {
                            String[] stringArray = new String[lIlllIlIl[3]];
                            stringArray[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[63]];
                            llIIIllIIlIlIl2 = TileObjects.getNearest((String[])stringArray);
                            if (G.lIIlllIIllll(llIIIllIIlIlIl2)) {
                                AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[64]];
                                int[] nArray14 = new int[lIlllIlIl[3]];
                                nArray14[G.lIlllIlIl[4]] = lIlllIlIl[60];
                                if (G.lIIlllIIlIll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                    int[] nArray15 = new int[lIlllIlIl[3]];
                                    nArray15[G.lIlllIlIl[4]] = lIlllIlIl[60];
                                    Inventory.getFirst((int[])nArray15).useOn(llIIIllIIlIlIl2);
                                    Time.sleepTicks((int)lIlllIlIl[1]);
                                    0;
                                }
                            }
                        }
                    }
                    if (!G.lIIlllIIlIll(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block91;
                    int[] nArray = new int[lIlllIlIl[3]];
                    nArray[G.lIlllIlIl[4]] = lIlllIlIl[60];
                    if (!G.lIIlllIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block91;
                    if (G.lIIlllIIllII(Players.getLocal().getWorldLocation().equals((Object)hT) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[65]];
                        Movement.walkTo((WorldPoint)hT);
                        0;
                    }
                    if (G.lIIlllIIlllI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIlllIlIl[13])) {
                        int[] nArray16 = new int[lIlllIlIl[3]];
                        nArray16[G.lIlllIlIl[4]] = lIlllIlIl[8];
                        if (G.lIIlllIIlIll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                            int[] nArray17 = new int[lIlllIlIl[3]];
                            nArray17[G.lIlllIlIl[4]] = lIlllIlIl[8];
                            Inventory.getFirst((int[])nArray17).interact(lIlllIIII[lIlllIlIl[66]]);
                        }
                    }
                    if (!G.lIIlllIIlIll(Players.getLocal().getWorldLocation().equals((Object)hT) ? 1 : 0) || !G.lIIlllIIllll(llIIIllIIlIlIl2 = NPCs.getNearest((int[])ix)) || !G.lIIlllIIllII(llIIIllIIlIlIl2.isDead() ? 1 : 0)) break block91;
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[67]];
                    if (G.lIIlllIIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIl[21])) {
                        Magic.cast((Spell)SpellBook.Standard.WATER_STRIKE, (NPC)llIIIllIIlIlIl2);
                        Time.sleepTicks((int)lIlllIlIl[3]);
                        0;
                    }
                    if (G.lIIlllIIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIl[26]) && !G.lIIlllIIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIl[21])) break block92;
                    if (!G.lIIlllIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIl[21])) break block93;
                    int[] nArray18 = new int[lIlllIlIl[3]];
                    nArray18[G.lIlllIlIl[4]] = lIlllIlIl[6];
                    if (!G.lIIlllIIlIll(Inventory.contains((int[])nArray18) ? 1 : 0)) break block93;
                    String[] stringArray = new String[lIlllIlIl[3]];
                    stringArray[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[68]];
                    if (!G.lIIlllIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block93;
                }
                Magic.cast((Spell)SpellBook.Standard.EARTH_STRIKE, (NPC)llIIIllIIlIlIl2);
                Time.sleepTicks((int)lIlllIlIl[3]);
                0;
            }
            if (G.lIIlllIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlIl[26])) {
                String[] stringArray = new String[lIlllIlIl[3]];
                stringArray[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[69]];
                if (G.lIIlllIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    Magic.cast((Spell)SpellBook.Standard.FIRE_STRIKE, (NPC)llIIIllIIlIlIl2);
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                }
            }
        }
        if (G.lIIlllIIlIlI(e.j(lIlllIlIl[2]), lIlllIlIl[14])) {
            String[] stringArray = new String[lIlllIlIl[3]];
            stringArray[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[70]];
            if (G.lIIlllIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray9 = new String[lIlllIlIl[3]];
                stringArray9[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[71]];
                llIIIllIIlIlIl2 = TileItems.getNearest((String[])stringArray9);
                if (G.lIIlllIIllll(llIIIllIIlIlIl2)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[72]];
                    llIIIllIIlIlIl2.interact(lIlllIIII[lIlllIlIl[73]]);
                    Time.sleepTicks((int)lIlllIlIl[1]);
                    0;
                }
            }
        }
        if (G.lIIlllIIlIlI(e.j(lIlllIlIl[2]), lIlllIlIl[14])) {
            String[] stringArray = new String[lIlllIlIl[3]];
            stringArray[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[74]];
            if (G.lIIlllIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                if (G.lIIlllIIlIll(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lIlllIlIl[3]];
                    nArray[G.lIlllIlIl[4]] = lIlllIlIl[10];
                    if (G.lIIlllIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[75]];
                        int[] nArray19 = new int[lIlllIlIl[3]];
                        nArray19[G.lIlllIlIl[4]] = lIlllIlIl[10];
                        Inventory.getFirst((int[])nArray19).interact(lIlllIIII[lIlllIlIl[76]]);
                        Time.sleepTicks((int)lIlllIlIl[13]);
                        0;
                    }
                }
                if (G.lIIlllIIllII(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[15])) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[77]];
                    Movement.walkTo((WorldPoint)hS);
                    0;
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                }
                if (G.lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[13])) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[78]];
                    if (G.lIIlllIIlIIl(cl, lIlllIlIl[3])) {
                        an.mK += lIlllIlIl[3];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlllIlIl[3];
                        an.mK = lIlllIlIl[4];
                        cm = lIlllIlIl[4];
                    }
                    g.a(lIlllIIII[lIlllIlIl[79]], hl);
                }
            }
        }
    }

    private static boolean lIIlllIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    public static void bO() {
        if (G.lIIlllIIlIll(Inventory.contains((int[])f.aV) ? 1 : 0) && G.lIIlllIIlIIl(Movement.getRunEnergy(), lIlllIlIl[68])) {
            Inventory.getFirst((int[])f.aV).interact(lIlllIIII[lIlllIlIl[80]]);
            Time.sleepTicks((int)lIlllIlIl[3]);
            0;
        }
        if (G.lIIlllIIllII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!G.lIIlllIIllII(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || G.lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIlIl[1])) {
            AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[81]];
            Movement.walkTo((WorldPoint)new WorldPoint(lIlllIlIl[58], lIlllIlIl[59], lIlllIlIl[4]));
            0;
            Time.sleepTicks((int)lIlllIlIl[3]);
            0;
        }
        int[] nArray = new int[lIlllIlIl[3]];
        nArray[G.lIlllIlIl[4]] = lIlllIlIl[82];
        NPC llIIIllIIlIIII = NPCs.getNearest((int[])nArray);
        int[] nArray2 = new int[lIlllIlIl[3]];
        nArray2[G.lIlllIlIl[4]] = lIlllIlIl[60];
        if (G.lIIlllIIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            if (G.lIIlllIIlIll(hw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIlllIIllll(llIIIllIIlIIII) && G.lIIlllIIlIll(hC.contains(llIIIllIIlIIII.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lIlllIlIl[24]);
                0;
                while (G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(ht), lIlllIlIl[3]) && G.lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[83]];
                    Movement.walkTo((WorldPoint)ht);
                    0;
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                    0;
                    if (((0x8F ^ 0x94) & ~(0x8E ^ 0x95)) == 0) continue;
                    return;
                }
            }
            if (G.lIIlllIIlIll(hx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIlllIIllll(llIIIllIIlIIII) && G.lIIlllIIlIll(hz.contains(llIIIllIIlIIII.getWorldLocation()) ? 1 : 0)) {
                while (G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hu), lIlllIlIl[3]) && G.lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[84]];
                    Movement.walkTo((WorldPoint)hu);
                    0;
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                    0;
                    if (1 != 0) continue;
                    return;
                }
            }
            if (G.lIIlllIIlIll(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIlllIIllll(llIIIllIIlIIII) && G.lIIlllIIlIll(hD.contains(llIIIllIIlIIII.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks((int)lIlllIlIl[18]);
                0;
                while (G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hv), lIlllIlIl[3]) && G.lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[85]];
                    Movement.walkTo((WorldPoint)hv);
                    0;
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                    0;
                    if (2 > 1) continue;
                    return;
                }
            }
            if (G.lIIlllIIlIll(hB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && G.lIIlllIIllll(llIIIllIIlIIII) && G.lIIlllIIlIll(hD.contains(llIIIllIIlIIII.getWorldLocation()) ? 1 : 0)) {
                while (G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(ig), lIlllIlIl[1]) && G.lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[86]];
                    Movement.walkTo((WorldPoint)ig);
                    0;
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                    0;
                    if (3 != ((142 + 114 - 173 + 103 ^ 63 + 116 - 170 + 153) & (125 + 188 - 152 + 59 ^ 141 + 173 - 121 + 3 ^ -1))) continue;
                    return;
                }
            }
            if (G.lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(ig), lIlllIlIl[12])) {
                AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[87]];
                String[] stringArray = new String[lIlllIlIl[3]];
                stringArray[G.lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[88]];
                TileObject llIIIllIIIllll = TileObjects.getNearest((String[])stringArray);
                if (G.lIIlllIIllll(llIIIllIIIllll)) {
                    llIIIllIIIllll.interact(lIlllIIII[lIlllIlIl[89]]);
                    Time.sleepTicks((int)lIlllIlIl[1]);
                    0;
                    Widget llIIIllIIIlllI = Widgets.get((int)lIlllIlIl[23], (int)lIlllIlIl[3]);
                    if (G.lIIlllIIllll(llIIIllIIIlllI)) {
                        llIIIllIIIlllI.interact(lIlllIIII[lIlllIlIl[90]]);
                        llIIIllIIIlllI.interact(lIlllIlIl[4]);
                        llIIIllIIIlllI.interact(lIlllIIII[lIlllIlIl[91]]);
                        Keyboard.type((String)lIlllIIII[lIlllIlIl[92]]);
                    }
                }
            }
        }
        int[] nArray3 = new int[lIlllIlIl[3]];
        nArray3[G.lIlllIlIl[4]] = lIlllIlIl[60];
        if (G.lIIlllIIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            if (G.lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(ig), lIlllIlIl[12])) {
                while (G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIlllIlIl[93], lIlllIlIl[94], lIlllIlIl[4])), lIlllIlIl[3]) && G.lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[95]];
                    Movement.walkTo((WorldPoint)new WorldPoint(lIlllIlIl[93], lIlllIlIl[94], lIlllIlIl[4]));
                    0;
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                    0;
                    if (((42 + 35 - -47 + 50 ^ 102 + 37 - 54 + 84) & (11 + 35 - 8 + 102 ^ 92 + 8 - 53 + 92 ^ -1)) == 0) continue;
                    return;
                }
            }
            if (G.lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIlllIlIl[93], lIlllIlIl[94], lIlllIlIl[4])), lIlllIlIl[1]) && G.lIIlllIIllll(llIIIllIIlIIII) && G.lIIlllIIlIll(hC.contains(llIIIllIIlIIII.getWorldLocation()) ? 1 : 0)) {
                while (G.lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hu), lIlllIlIl[3]) && G.lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[96]];
                    Movement.walkTo((WorldPoint)hu);
                    0;
                    Time.sleepTicks((int)lIlllIlIl[3]);
                    0;
                    0;
                    if (-1 != (0xBE ^ 0xBA)) continue;
                    return;
                }
            }
        }
    }

    @Override
    public int T() {
        G.bN();
        return lIlllIlIl[109];
    }

    private static boolean lIIlllIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIllIlIIlIl(String llIIIlIllIlIII, String llIIIlIllIIlIl) {
        try {
            SecretKeySpec llIIIlIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), lIlllIlIl[20]), "DES");
            Cipher llIIIlIllIlIlI = Cipher.getInstance("DES");
            llIIIlIllIlIlI.init(lIlllIlIl[1], llIIIlIllIlIll);
            return new String(llIIIlIllIlIlI.doFinal(Base64.getDecoder().decode(llIIIlIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIlIllIlIIl) {
            llIIIlIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIlIIII(Object object) {
        return object == null;
    }

    @Override
    public boolean S() {
        return lIlllIlIl[4];
    }

    private static boolean lIIlllIIlIIl(int n2, int n3) {
        return n2 < n3;
    }
}

