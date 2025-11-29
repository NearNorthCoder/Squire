/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class U
implements ac {
    static /* synthetic */ boolean mc;
    public static final /* synthetic */ WorldPoint lZ;
    public static final /* synthetic */ WorldPoint lY;
    static /* synthetic */ int di;
    static /* synthetic */ boolean md;
    static /* synthetic */ boolean ma;
    private static /* synthetic */ int[] llIIIllIII;
    static /* synthetic */ boolean mb;
    private static /* synthetic */ String[] llIIIlIllI;
    public static /* synthetic */ String[] cE;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint lX;
    static /* synthetic */ boolean dj;
    public static final /* synthetic */ WorldPoint lW;

    private static boolean lIlIIlllIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static void Q() {
        block50: {
            d llllllllllllllllllIlIllIllIllIlI;
            block49: {
                block48: {
                    block47: {
                        block46: {
                            block45: {
                                Object llllllllllllllllllIlIllIllIllIll;
                                block44: {
                                    block43: {
                                        block42: {
                                            block41: {
                                                block40: {
                                                    block39: {
                                                        block38: {
                                                            block37: {
                                                                block36: {
                                                                    block35: {
                                                                        int[] nArray = new int[llIIIllIII[1]];
                                                                        nArray[U.llIIIllIII[0]] = llIIIllIII[27];
                                                                        if (!U.lIlIIllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray2 = new int[llIIIllIII[1]];
                                                                        nArray2[U.llIIIllIII[0]] = llIIIllIII[27];
                                                                        if (!U.lIlIIllIIllII(Bank.contains((int[])nArray2) ? 1 : 0)) break block36;
                                                                        int[] nArray3 = new int[llIIIllIII[1]];
                                                                        nArray3[U.llIIIllIII[0]] = llIIIllIII[27];
                                                                        if (!U.lIlIIllIIllll(Bank.getFirst((int[])nArray3).getQuantity(), llIIIllIII[7])) break block36;
                                                                    }
                                                                    llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[27], llIIIllIII[7], llIIIllIII[309]);
                                                                    bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[llIIIllIII[1]];
                                                                nArray[U.llIIIllIII[0]] = llIIIllIII[35];
                                                                if (!U.lIlIIllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray4 = new int[llIIIllIII[1]];
                                                                nArray4[U.llIIIllIII[0]] = llIIIllIII[35];
                                                                if (!U.lIlIIllIIllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block38;
                                                                int[] nArray5 = new int[llIIIllIII[1]];
                                                                nArray5[U.llIIIllIII[0]] = llIIIllIII[35];
                                                                if (!U.lIlIIllIIllll(Bank.getFirst((int[])nArray5).getQuantity(), llIIIllIII[63])) break block38;
                                                            }
                                                            llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[35], llIIIllIII[63], llIIIllIII[309]);
                                                            bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                                            0;
                                                        }
                                                        int[] nArray = new int[llIIIllIII[1]];
                                                        nArray[U.llIIIllIII[0]] = llIIIllIII[39];
                                                        if (U.lIlIIllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                            llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[39], llIIIllIII[1], llIIIllIII[310]);
                                                            bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                                            0;
                                                        }
                                                        int[] nArray6 = new int[llIIIllIII[1]];
                                                        nArray6[U.llIIIllIII[0]] = llIIIllIII[41];
                                                        if (U.lIlIIllIlIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                                            llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[41], llIIIllIII[1], llIIIllIII[311]);
                                                            bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                                            0;
                                                        }
                                                        int[] nArray7 = new int[llIIIllIII[1]];
                                                        nArray7[U.llIIIllIII[0]] = llIIIllIII[44];
                                                        if (U.lIlIIllIlIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                            llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[44], llIIIllIII[1], llIIIllIII[312]);
                                                            bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                                            0;
                                                        }
                                                        int[] nArray8 = new int[llIIIllIII[1]];
                                                        nArray8[U.llIIIllIII[0]] = llIIIllIII[42];
                                                        if (U.lIlIIllIlIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                            llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[42], llIIIllIII[7], llIIIllIII[310]);
                                                            bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                                            0;
                                                        }
                                                        int[] nArray9 = new int[llIIIllIII[1]];
                                                        nArray9[U.llIIIllIII[0]] = llIIIllIII[24];
                                                        if (!U.lIlIIllIIllII(Bank.contains((int[])nArray9) ? 1 : 0)) break block39;
                                                        int[] nArray10 = new int[llIIIllIII[1]];
                                                        nArray10[U.llIIIllIII[0]] = llIIIllIII[24];
                                                        if (!U.lIlIIllIIllII(Bank.contains((int[])nArray10) ? 1 : 0)) break block40;
                                                        int[] nArray11 = new int[llIIIllIII[1]];
                                                        nArray11[U.llIIIllIII[0]] = llIIIllIII[24];
                                                        if (!U.lIlIIllIIllll(Bank.getFirst((int[])nArray11).getQuantity(), llIIIllIII[25])) break block40;
                                                    }
                                                    llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[24], llIIIllIII[25], llIIIllIII[309]);
                                                    bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                                    0;
                                                }
                                                int[] nArray = new int[llIIIllIII[1]];
                                                nArray[U.llIIIllIII[0]] = llIIIllIII[36];
                                                if (U.lIlIIllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[36], llIIIllIII[1], j.cf);
                                                    bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                                    0;
                                                }
                                                int[] nArray12 = new int[llIIIllIII[1]];
                                                nArray12[U.llIIIllIII[0]] = llIIIllIII[34];
                                                if (U.lIlIIllIlIIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                                    llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[34], llIIIllIII[1], j.cf);
                                                    bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                                    0;
                                                }
                                                int[] nArray13 = new int[llIIIllIII[1]];
                                                nArray13[U.llIIIllIII[0]] = llIIIllIII[33];
                                                if (U.lIlIIllIlIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                                    llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[33], llIIIllIII[1], j.cf);
                                                    bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                                    0;
                                                }
                                                int[] nArray14 = new int[llIIIllIII[1]];
                                                nArray14[U.llIIIllIII[0]] = llIIIllIII[32];
                                                if (U.lIlIIllIlIIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                                    llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[32], llIIIllIII[1], j.cf);
                                                    bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                                    0;
                                                }
                                                int[] nArray15 = new int[llIIIllIII[1]];
                                                nArray15[U.llIIIllIII[0]] = llIIIllIII[30];
                                                if (U.lIlIIllIlIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                    llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[30], llIIIllIII[1], j.cf);
                                                    bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                                    0;
                                                }
                                                int[] nArray16 = new int[llIIIllIII[1]];
                                                nArray16[U.llIIIllIII[0]] = llIIIllIII[31];
                                                if (U.lIlIIllIlIIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                                    llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[31], llIIIllIII[1], j.cf);
                                                    bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                                    0;
                                                }
                                                int[] nArray17 = new int[llIIIllIII[1]];
                                                nArray17[U.llIIIllIII[0]] = llIIIllIII[37];
                                                if (!U.lIlIIllIIllII(Bank.contains((int[])nArray17) ? 1 : 0)) break block41;
                                                int[] nArray18 = new int[llIIIllIII[1]];
                                                nArray18[U.llIIIllIII[0]] = llIIIllIII[37];
                                                if (!U.lIlIIllIIllII(Bank.contains((int[])nArray18) ? 1 : 0)) break block42;
                                                int[] nArray19 = new int[llIIIllIII[1]];
                                                nArray19[U.llIIIllIII[0]] = llIIIllIII[37];
                                                if (!U.lIlIIllIIllll(Bank.getFirst((int[])nArray19).getQuantity(), llIIIllIII[23])) break block42;
                                            }
                                            llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[37], llIIIllIII[23], j.cf);
                                            bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                            0;
                                        }
                                        int[] nArray = new int[llIIIllIII[1]];
                                        nArray[U.llIIIllIII[0]] = llIIIllIII[45];
                                        if (!U.lIlIIllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                                        int[] nArray20 = new int[llIIIllIII[1]];
                                        nArray20[U.llIIIllIII[0]] = llIIIllIII[45];
                                        if (!U.lIlIIllIIllII(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                                        int[] nArray21 = new int[llIIIllIII[1]];
                                        nArray21[U.llIIIllIII[0]] = llIIIllIII[45];
                                        if (!U.lIlIIllIIllll(Bank.getFirst((int[])nArray21).getQuantity(), llIIIllIII[23])) break block44;
                                    }
                                    llllllllllllllllllIlIllIllIllIll = new d(llIIIllIII[45], llIIIllIII[23], llIIIllIII[47]);
                                    bv.add((d)llllllllllllllllllIlIllIllIllIll);
                                    0;
                                }
                                if (U.lIlIIllIlIIIl(Bank.contains((Predicate)(llllllllllllllllllIlIllIllIllIll = item -> item.getName().toLowerCase().contains(llIIIlIllI[llIIIllIII[316]]))) ? 1 : 0)) {
                                    llllllllllllllllllIlIllIllIllIlI = new d(llIIIllIII[313], llIIIllIII[11], llIIIllIII[311]);
                                    bv.add(llllllllllllllllllIlIllIllIllIlI);
                                    0;
                                }
                                int[] nArray = new int[llIIIllIII[1]];
                                nArray[U.llIIIllIII[0]] = llIIIllIII[19];
                                if (!U.lIlIIllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                                int[] nArray22 = new int[llIIIllIII[1]];
                                nArray22[U.llIIIllIII[0]] = llIIIllIII[19];
                                if (!U.lIlIIllIIllII(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                                int[] nArray23 = new int[llIIIllIII[1]];
                                nArray23[U.llIIIllIII[0]] = llIIIllIII[19];
                                if (!U.lIlIIllIIllll(Bank.getFirst((int[])nArray23).getQuantity(), llIIIllIII[20])) break block46;
                            }
                            llllllllllllllllllIlIllIllIllIlI = new d(llIIIllIII[19], llIIIllIII[10], llIIIllIII[314]);
                            bv.add(llllllllllllllllllIlIllIllIllIlI);
                            0;
                        }
                        int[] nArray = new int[llIIIllIII[1]];
                        nArray[U.llIIIllIII[0]] = llIIIllIII[22];
                        if (!U.lIlIIllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block47;
                        int[] nArray24 = new int[llIIIllIII[1]];
                        nArray24[U.llIIIllIII[0]] = llIIIllIII[22];
                        if (!U.lIlIIllIIllII(Bank.contains((int[])nArray24) ? 1 : 0)) break block48;
                        int[] nArray25 = new int[llIIIllIII[1]];
                        nArray25[U.llIIIllIII[0]] = llIIIllIII[22];
                        if (!U.lIlIIllIIllll(Bank.getFirst((int[])nArray25).getQuantity(), llIIIllIII[20])) break block48;
                    }
                    llllllllllllllllllIlIllIllIllIlI = new d(llIIIllIII[22], llIIIllIII[10], llIIIllIII[314]);
                    bv.add(llllllllllllllllllIlIllIllIllIlI);
                    0;
                }
                int[] nArray = new int[llIIIllIII[1]];
                nArray[U.llIIIllIII[0]] = llIIIllIII[21];
                if (!U.lIlIIllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block49;
                int[] nArray26 = new int[llIIIllIII[1]];
                nArray26[U.llIIIllIII[0]] = llIIIllIII[21];
                if (!U.lIlIIllIIllII(Bank.contains((int[])nArray26) ? 1 : 0)) break block50;
                int[] nArray27 = new int[llIIIllIII[1]];
                nArray27[U.llIIIllIII[0]] = llIIIllIII[21];
                if (!U.lIlIIllIIllll(Bank.getFirst((int[])nArray27).getQuantity(), llIIIllIII[20])) break block50;
            }
            llllllllllllllllllIlIllIllIllIlI = new d(llIIIllIII[21], llIIIllIII[10], llIIIllIII[314]);
            bv.add(llllllllllllllllllIlIllIllIllIlI);
            0;
        }
    }

    @Override
    public String ag() {
        return llIIIlIllI[llIIIllIII[315]];
    }

    /*
     * WARNING - void declaration
     */
    private static void dF() {
        void llllllllllllllllllIlIllIlllIIlII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (U.lIlIIllIlIlll(bankLocation) && U.lIlIIllIlIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[303]];
            Movement.walkTo((BankLocation)bankLocation);
            0;
            Time.sleepTicks((int)llIIIllIII[2]);
            0;
        }
        if (U.lIlIIllIlIlll(llllllllllllllllllIlIllIlllIIlII) && U.lIlIIllIIllII(llllllllllllllllllIlIllIlllIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[304]];
            if (U.lIlIIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIllIII[18]);
                0;
            }
            if (U.lIlIIllIIllII(Bank.isOpen() ? 1 : 0)) {
                if (U.lIlIIllIlIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llIIIllIII[9]);
                    0;
                }
                a.a(llIIIllIII[19], llIIIllIII[11]);
                a.a(llIIIllIII[22], llIIIllIII[11]);
                a.a(llIIIllIII[21], llIIIllIII[11]);
                a.b(f.ba, llIIIllIII[11]);
                a.a(llIIIllIII[35], llIIIllIII[11]);
                a.a(llIIIllIII[45], llIIIllIII[1]);
                a.a(llIIIllIII[27], llIIIllIII[7]);
                a.a(llIIIllIII[34], llIIIllIII[1]);
                a.a(llIIIllIII[24], llIIIllIII[25]);
                a.a(llIIIllIII[305], llIIIllIII[1]);
                a.a(llIIIllIII[46], llIIIllIII[47]);
                int[] nArray = new int[llIIIllIII[1]];
                nArray[U.llIIIllIII[0]] = llIIIllIII[36];
                if (U.lIlIIllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llIIIllIII[1]];
                    nArray2[U.llIIIllIII[0]] = llIIIllIII[36];
                    if (U.lIlIIllIlIIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdraw((int)llIIIllIII[36], (int)llIIIllIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
            }
        }
    }

    private static boolean lIlIIllIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllIllIlI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void dE() {
        void llllllllllllllllllIlIllIlllIIllI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (U.lIlIIllIlIlll(bankLocation) && U.lIlIIllIlIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[301]];
            Movement.walkTo((BankLocation)bankLocation);
            0;
            Time.sleepTicks((int)llIIIllIII[2]);
            0;
        }
        if (U.lIlIIllIlIlll(llllllllllllllllllIlIllIlllIIllI) && U.lIlIIllIIllII(llllllllllllllllllIlIllIlllIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[302]];
            if (U.lIlIIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIllIII[18]);
                0;
            }
            if (U.lIlIIllIIllII(Bank.isOpen() ? 1 : 0)) {
                if (U.lIlIIllIlIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llIIIllIII[9]);
                    0;
                }
                a.a(llIIIllIII[19], llIIIllIII[11]);
                a.b(f.ba, llIIIllIII[2]);
                a.a(llIIIllIII[45], llIIIllIII[9]);
                a.a(llIIIllIII[41], llIIIllIII[1]);
                a.a(llIIIllIII[39], llIIIllIII[1]);
                a.a(llIIIllIII[46], llIIIllIII[47]);
                int[] nArray = new int[llIIIllIII[1]];
                nArray[U.llIIIllIII[0]] = llIIIllIII[36];
                if (U.lIlIIllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llIIIllIII[1]];
                    nArray2[U.llIIIllIII[0]] = llIIIllIII[36];
                    if (U.lIlIIllIlIIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdraw((int)llIIIllIII[36], (int)llIIIllIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
                Bank.withdraw((int)llIIIllIII[35], (int)(Inventory.getFreeSlots() - llIIIllIII[1]), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void dG() {
        void llllllllllllllllllIlIllIlllIIIlI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (U.lIlIIllIlIlll(bankLocation) && U.lIlIIllIlIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[306]];
            Movement.walkTo((BankLocation)bankLocation);
            0;
            Time.sleepTicks((int)llIIIllIII[2]);
            0;
        }
        if (U.lIlIIllIlIlll(llllllllllllllllllIlIllIlllIIIlI) && U.lIlIIllIIllII(llllllllllllllllllIlIllIlllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[307]];
            if (U.lIlIIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIllIII[18]);
                0;
            }
            if (U.lIlIIllIIllII(Bank.isOpen() ? 1 : 0)) {
                if (U.lIlIIllIlIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llIIIllIII[9]);
                    0;
                }
                a.a(llIIIllIII[19], llIIIllIII[11]);
                a.a(llIIIllIII[22], llIIIllIII[11]);
                a.a(llIIIllIII[21], llIIIllIII[11]);
                a.b(f.ba, llIIIllIII[2]);
                a.a(llIIIllIII[45], llIIIllIII[7]);
                a.a(llIIIllIII[33], llIIIllIII[1]);
                a.a(llIIIllIII[32], llIIIllIII[1]);
                a.a(llIIIllIII[30], llIIIllIII[1]);
                a.a(llIIIllIII[31], llIIIllIII[1]);
                a.a(llIIIllIII[46], llIIIllIII[47]);
                Bank.withdraw((String)llIIIlIllI[llIIIllIII[308]], (int)llIIIllIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                int[] nArray = new int[llIIIllIII[1]];
                nArray[U.llIIIllIII[0]] = llIIIllIII[36];
                if (U.lIlIIllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llIIIllIII[1]];
                    nArray2[U.llIIIllIII[0]] = llIIIllIII[36];
                    if (U.lIlIIllIlIIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdraw((int)llIIIllIII[36], (int)llIIIllIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
                a.a(llIIIllIII[35], Inventory.getFreeSlots());
            }
        }
    }

    private static void lIlIIllIIIlll() {
        llIIIlIllI = new String[llIIIllIII[365]];
        U.llIIIlIllI[U.llIIIllIII[0]] = U."Buying items";
        U.llIIIlIllI[U.llIIIllIII[1]] = U."Finished buying items, switching back to quest";
        U.llIIIlIllI[U.llIIIllIII[2]] = U."Crandor map";
        U.llIIIlIllI[U.llIIIllIII[7]] = U."Drink";
        U.llIIIlIllI[U.llIIIllIII[9]] = U."Drink";
        U.llIIIlIllI[U.llIIIllIII[11]] = U."Shark";
        U.llIIIlIllI[U.llIIIllIII[12]] = U."Shark";
        U.llIIIlIllI[U.llIIIllIII[13]] = U."Eat";
        U.llIIIlIllI[U.llIIIllIII[16]] = U."Nav to bank";
        U.llIIIlIllI[U.llIIIllIII[17]] = U."Handling banking";
        U.llIIIlIllI[U.llIIIllIII[23]] = U."We are missing teleports, switching to BUYING";
        U.llIIIlIllI[U.llIIIllIII[26]] = U."We are missing steel nails, switching to BUYING";
        U.llIIIlIllI[U.llIIIllIII[28]] = U."We are missing planks, switching to BUYING";
        U.llIIIlIllI[U.llIIIllIII[38]] = U."We are missing quest supplies, switching to BUYING";
        U.llIIIlIllI[U.llIIIllIII[40]] = U."Nav to champ guild";
        U.llIIIlIllI[U.llIIIllIII[20]] = U."Talking";
        U.llIIIlIllI[U.llIIIllIII[43]] = U."Guildmaster";
        U.llIIIlIllI[U.llIIIllIII[29]] = U."Nav to oziach";
        U.llIIIlIllI[U.llIIIllIII[50]] = U."Oziach";
        U.llIIIlIllI[U.llIIIllIII[51]] = U."Rune scimitar";
        U.llIIIlIllI[U.llIIIllIII[10]] = U."Wield";
        U.llIIIlIllI[U.llIIIllIII[52]] = U."Wear";
        U.llIIIlIllI[U.llIIIllIII[53]] = U."Wear";
        U.llIIIlIllI[U.llIIIllIII[55]] = U."Maze key";
        U.llIIIlIllI[U.llIIIllIII[8]] = U."Nav to champ guild";
        U.llIIIlIllI[U.llIIIllIII[56]] = U."Eat";
        U.llIIIlIllI[U.llIIIllIII[57]] = U."Talking";
        U.llIIIlIllI[U.llIIIllIII[58]] = U."Guildmaster";
        U.llIIIlIllI[U.llIIIllIII[60]] = U."Where can I find the right ship?";
        U.llIIIlIllI[U.llIIIllIII[61]] = U."I talked to Oziach...";
        U.llIIIlIllI[U.llIIIllIII[63]] = U."How can I protect myself from the dragon's breath?";
        U.llIIIlIllI[U.llIIIllIII[65]] = U."Maze key";
        U.llIIIlIllI[U.llIIIllIII[15]] = U."How can I find the route to Crandor?";
        U.llIIIlIllI[U.llIIIllIII[66]] = U."Where is Melzar's map piece?";
        U.llIIIlIllI[U.llIIIllIII[68]] = U."How can I find the route to Crandor?";
        U.llIIIlIllI[U.llIIIllIII[69]] = U."Where is Thalzar's map piece?";
        U.llIIIlIllI[U.llIIIllIII[70]] = U."How can I find the route to Crandor?";
        U.llIIIlIllI[U.llIIIllIII[71]] = U."Where is Lozar's map piece?";
        U.llIIIlIllI[U.llIIIllIII[74]] = U."Maze key";
        U.llIIIlIllI[U.llIIIllIII[77]] = U."Oracle";
        U.llIIIlIllI[U.llIIIllIII[78]] = U."Nav to oracle";
        U.llIIIlIllI[U.llIIIllIII[79]] = U."Oracle";
        U.llIIIlIllI[U.llIIIllIII[80]] = U."Oracle";
        U.llIIIlIllI[U.llIIIllIII[82]] = U."Lobster pot";
        U.llIIIlIllI[U.llIIIllIII[84]] = U."Lobster pot";
        U.llIIIlIllI[U.llIIIllIII[87]] = U."Nav to magic door";
        U.llIIIlIllI[U.llIIIllIII[88]] = U."Handling magic door";
        U.llIIIlIllI[U.llIIIllIII[89]] = U."Silk";
        U.llIIIlIllI[U.llIIIllIII[90]] = U."Silk";
        U.llIIIlIllI[U.llIIIllIII[91]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[6]] = U."Lobster pot";
        U.llIIIlIllI[U.llIIIllIII[92]] = U."Lobster pot";
        U.llIIIlIllI[U.llIIIllIII[93]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[94]] = U."Unfired bowl";
        U.llIIIlIllI[U.llIIIllIII[95]] = U."Unfired bowl";
        U.llIIIlIllI[U.llIIIllIII[96]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[97]] = U."Wizard's mind bomb";
        U.llIIIlIllI[U.llIIIllIII[98]] = U."Wizard's mind bomb";
        U.llIIIlIllI[U.llIIIllIII[99]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[100]] = U."Silk";
        U.llIIIlIllI[U.llIIIllIII[101]] = U."Silk";
        U.llIIIlIllI[U.llIIIllIII[102]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[103]] = U."Lobster pot";
        U.llIIIlIllI[U.llIIIllIII[104]] = U."Lobster pot";
        U.llIIIlIllI[U.llIIIllIII[105]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[106]] = U."Unfired bowl";
        U.llIIIlIllI[U.llIIIllIII[107]] = U."Unfired bowl";
        U.llIIIlIllI[U.llIIIllIII[108]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[109]] = U."Wizard's mind bomb";
        U.llIIIlIllI[U.llIIIllIII[110]] = U."Wizard's mind bomb";
        U.llIIIlIllI[U.llIIIllIII[111]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[112]] = U."Chest";
        U.llIIIlIllI[U.llIIIllIII[113]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[114]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[115]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[116]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[117]] = U."Search";
        U.llIIIlIllI[U.llIIIllIII[118]] = U."Search";
        U.llIIIlIllI[U.llIIIllIII[119]] = U."Silk";
        U.llIIIlIllI[U.llIIIllIII[120]] = U."Silk";
        U.llIIIlIllI[U.llIIIllIII[121]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[122]] = U."Lobster pot";
        U.llIIIlIllI[U.llIIIllIII[123]] = U."Lobster pot";
        U.llIIIlIllI[U.llIIIllIII[124]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[125]] = U."Unfired bowl";
        U.llIIIlIllI[U.llIIIllIII[126]] = U."Unfired bowl";
        U.llIIIlIllI[U.llIIIllIII[127]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[128]] = U."Wizard's mind bomb";
        U.llIIIlIllI[U.llIIIllIII[129]] = U."Wizard's mind bomb";
        U.llIIIlIllI[U.llIIIllIII[130]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[25]] = U."Chest";
        U.llIIIlIllI[U.llIIIllIII[131]] = U."Magic door";
        U.llIIIlIllI[U.llIIIllIII[132]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[133]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[134]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[135]] = U."Search";
        U.llIIIlIllI[U.llIIIllIII[136]] = U."Search";
        U.llIIIlIllI[U.llIIIllIII[137]] = U."Break";
        U.llIIIlIllI[U.llIIIllIII[140]] = U."Nav to wormbrain";
        U.llIIIlIllI[U.llIIIllIII[141]] = U."Can I journey on this ship?";
        U.llIIIlIllI[U.llIIIllIII[142]] = U."Search away, I have nothing to hide.";
        U.llIIIlIllI[U.llIIIllIII[143]] = U."Ok.";
        U.llIIIlIllI[U.llIIIllIII[144]] = U."Talking";
        U.llIIIlIllI[U.llIIIllIII[145]] = U."Wormbrain";
        U.llIIIlIllI[U.llIIIllIII[146]] = U."Beer glass";
        U.llIIIlIllI[U.llIIIllIII[147]] = U."Beer glass";
        U.llIIIlIllI[U.llIIIllIII[148]] = U."Drop";
        U.llIIIlIllI[U.llIIIllIII[155]] = U."Nav to maze";
        U.llIIIlIllI[U.llIIIllIII[156]] = U."Door";
        U.llIIIlIllI[U.llIIIllIII[157]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[165]] = U."Getting key";
        U.llIIIlIllI[U.llIIIllIII[167]] = U."Attack";
        U.llIIIlIllI[U.llIIIllIII[168]] = U."Take";
        U.llIIIlIllI[U.llIIIllIII[171]] = U."Nav to red door";
        U.llIIIlIllI[U.llIIIllIII[172]] = U."Red door";
        U.llIIIlIllI[U.llIIIllIII[173]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[174]] = U."Go up";
        U.llIIIlIllI[U.llIIIllIII[175]] = U."Climb-up";
        U.llIIIlIllI[U.llIIIllIII[179]] = U."Getting key";
        U.llIIIlIllI[U.llIIIllIII[181]] = U."Attack";
        U.llIIIlIllI[U.llIIIllIII[182]] = U."Take";
        U.llIIIlIllI[U.llIIIllIII[185]] = U."Nav to orange door";
        U.llIIIlIllI[U.llIIIllIII[186]] = U."Orange door";
        U.llIIIlIllI[U.llIIIllIII[187]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[188]] = U."Climb-up";
        U.llIIIlIllI[U.llIIIllIII[190]] = U."Getting key";
        U.llIIIlIllI[U.llIIIllIII[192]] = U."Attack";
        U.llIIIlIllI[U.llIIIllIII[193]] = U."Take";
        U.llIIIlIllI[U.llIIIllIII[195]] = U."Nav to yellow door";
        U.llIIIlIllI[U.llIIIllIII[196]] = U."Yellow door";
        U.llIIIlIllI[U.llIIIllIII[197]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[198]] = U."Climb-down";
        U.llIIIlIllI[U.llIIIllIII[201]] = U."Climb-down";
        U.llIIIlIllI[U.llIIIllIII[202]] = U."Climb-down";
        U.llIIIlIllI[U.llIIIllIII[208]] = U."Getting blue key";
        U.llIIIlIllI[U.llIIIllIII[210]] = U."Attack";
        U.llIIIlIllI[U.llIIIllIII[211]] = U."Take";
        U.llIIIlIllI[U.llIIIllIII[213]] = U."Nav to blue door";
        U.llIIIlIllI[U.llIIIllIII[214]] = U."Blue door";
        U.llIIIlIllI[U.llIIIllIII[215]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[217]] = U."Getting key";
        U.llIIIlIllI[U.llIIIllIII[219]] = U."Attack";
        U.llIIIlIllI[U.llIIIllIII[220]] = U."Take";
        U.llIIIlIllI[U.llIIIllIII[223]] = U."Nav to magneta door";
        U.llIIIlIllI[U.llIIIllIII[224]] = U."Magenta door";
        U.llIIIlIllI[U.llIIIllIII[225]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[226]] = U."Lesser demon";
        U.llIIIlIllI[U.llIIIllIII[228]] = U."Attack";
        U.llIIIlIllI[U.llIIIllIII[229]] = U."Take";
        U.llIIIlIllI[U.llIIIllIII[231]] = U."Nav to green door";
        U.llIIIlIllI[U.llIIIllIII[232]] = U."Green door";
        U.llIIIlIllI[U.llIIIllIII[233]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[234]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[235]] = U."Open";
        U.llIIIlIllI[U.llIIIllIII[236]] = U."Search";
        U.llIIIlIllI[U.llIIIllIII[237]] = U."Search";
        U.llIIIlIllI[U.llIIIllIII[238]] = U."Plank";
        U.llIIIlIllI[U.llIIIllIII[239]] = U."Plank";
        U.llIIIlIllI[U.llIIIllIII[240]] = U."Nav to boat";
        U.llIIIlIllI[U.llIIIllIII[241]] = U."Customs officer";
        U.llIIIlIllI[U.llIIIllIII[242]] = U."Can I journey on this ship?";
        U.llIIIlIllI[U.llIIIllIII[243]] = U."Search away, I have nothing to hide.";
        U.llIIIlIllI[U.llIIIllIII[244]] = U."Ok.";
        U.llIIIlIllI[U.llIIIllIII[245]] = U."Klarense";
        U.llIIIlIllI[U.llIIIllIII[246]] = U."Cabin boy Jenkins";
        U.llIIIlIllI[U.llIIIllIII[247]] = U."Boarding boat";
        U.llIIIlIllI[U.llIIIllIII[248]] = U."Gangplank";
        U.llIIIlIllI[U.llIIIllIII[249]] = U."Cross";
        U.llIIIlIllI[U.llIIIllIII[250]] = U."Reparing hole";
        U.llIIIlIllI[U.llIIIllIII[251]] = U."Hole";
        U.llIIIlIllI[U.llIIIllIII[252]] = U."Repair";
        U.llIIIlIllI[U.llIIIllIII[253]] = U."Ladder";
        U.llIIIlIllI[U.llIIIllIII[254]] = U."Climb-down";
        U.llIIIlIllI[U.llIIIllIII[255]] = U."Hiring ned";
        U.llIIIlIllI[U.llIIIllIII[256]] = U."Ned";
        U.llIIIlIllI[U.llIIIllIII[257]] = U."Draynor Village";
        U.llIIIlIllI[U.llIIIllIII[14]] = U."Ned";
        U.llIIIlIllI[U.llIIIllIII[72]] = U."Captain Ned";
        U.llIIIlIllI[U.llIIIllIII[260]] = U."Nav to boat";
        U.llIIIlIllI[U.llIIIllIII[261]] = U."Customs officer";
        U.llIIIlIllI[U.llIIIllIII[262]] = U."Can I journey on this ship?";
        U.llIIIlIllI[U.llIIIllIII[263]] = U."Search away, I have nothing to hide.";
        U.llIIIlIllI[U.llIIIllIII[264]] = U."Ok.";
        U.llIIIlIllI[U.llIIIllIII[265]] = U."Gangplank";
        U.llIIIlIllI[U.llIIIllIII[266]] = U."Cross";
        U.llIIIlIllI[U.llIIIllIII[267]] = U."Captain Ned";
        U.llIIIlIllI[U.llIIIllIII[268]] = U."Captain Ned";
        U.llIIIlIllI[U.llIIIllIII[272]] = U."Nav to entrance";
        U.llIIIlIllI[U.llIIIllIII[273]] = U."Hole";
        U.llIIIlIllI[U.llIIIllIII[274]] = U."Enter";
        U.llIIIlIllI[U.llIIIllIII[275]] = U."Elvarg";
        U.llIIIlIllI[U.llIIIllIII[277]] = U."Nav to fight";
        U.llIIIlIllI[U.llIIIllIII[278]] = U."Nav to fight";
        U.llIIIlIllI[U.llIIIllIII[279]] = U."Shark";
        U.llIIIlIllI[U.llIIIllIII[280]] = U."Shark";
        U.llIIIlIllI[U.llIIIllIII[281]] = U."Eat";
        U.llIIIlIllI[U.llIIIllIII[282]] = U."Wall";
        U.llIIIlIllI[U.llIIIllIII[283]] = U."Climb-over";
        U.llIIIlIllI[U.llIIIllIII[284]] = U."Elvarg boss fight";
        U.llIIIlIllI[U.llIIIllIII[285]] = U."Vial";
        U.llIIIlIllI[U.llIIIllIII[286]] = U."Vial";
        U.llIIIlIllI[U.llIIIllIII[287]] = U."Drop";
        U.llIIIlIllI[U.llIIIllIII[288]] = U."Shark";
        U.llIIIlIllI[U.llIIIllIII[289]] = U."Drop";
        U.llIIIlIllI[U.llIIIllIII[290]] = U."Drink";
        U.llIIIlIllI[U.llIIIllIII[292]] = U."Drink";
        U.llIIIlIllI[U.llIIIllIII[293]] = U."Attack";
        U.llIIIlIllI[U.llIIIllIII[295]] = U."Nav to oziach";
        U.llIIIlIllI[U.llIIIllIII[296]] = U."Oziach";
        U.llIIIlIllI[U.llIIIllIII[297]] = U."Wear";
        U.llIIIlIllI[U.llIIIllIII[298]] = U."Crandor map";
        U.llIIIlIllI[U.llIIIllIII[299]] = U."Oziach";
        U.llIIIlIllI[U.llIIIllIII[300]] = U."Break";
        U.llIIIlIllI[U.llIIIllIII[301]] = U."Nav to bank";
        U.llIIIlIllI[U.llIIIllIII[302]] = U."Handling banking";
        U.llIIIlIllI[U.llIIIllIII[303]] = U."Nav to bank";
        U.llIIIlIllI[U.llIIIllIII[304]] = U."Handling banking";
        U.llIIIlIllI[U.llIIIllIII[306]] = U."Nav to bank";
        U.llIIIlIllI[U.llIIIllIII[307]] = U."Handling banking";
        U.llIIIlIllI[U.llIIIllIII[308]] = U."Maze key";
        U.llIIIlIllI[U.llIIIllIII[315]] = U."Dragon slayer 1 quest";
        U.llIIIlIllI[U.llIIIllIII[316]] = U."ring of wealth (";
        U.llIIIlIllI[U.llIIIllIII[317]] = U."Antifire";
        U.llIIIlIllI[U.llIIIllIII[318]] = U."Antifire";
        U.llIIIlIllI[U.llIIIllIII[319]] = U."combat";
        U.llIIIlIllI[U.llIIIllIII[320]] = U."combat";
        U.llIIIlIllI[U.llIIIllIII[321]] = U."Antifire";
        U.llIIIlIllI[U.llIIIllIII[322]] = U."Antifire";
        U.llIIIlIllI[U.llIIIllIII[323]] = U."glory";
        U.llIIIlIllI[U.llIIIllIII[324]] = U."Chest";
        U.llIIIlIllI[U.llIIIllIII[325]] = U."Zombie";
        U.llIIIlIllI[U.llIIIllIII[326]] = U."Ladder";
        U.llIIIlIllI[U.llIIIllIII[327]] = U."Climb-down";
        U.llIIIlIllI[U.llIIIllIII[328]] = U."Ladder";
        U.llIIIlIllI[U.llIIIllIII[329]] = U."Climb-down";
        U.llIIIlIllI[U.llIIIllIII[330]] = U."Ladder";
        U.llIIIlIllI[U.llIIIllIII[331]] = U."Skeleton";
        U.llIIIlIllI[U.llIIIllIII[332]] = U."Ladder";
        U.llIIIlIllI[U.llIIIllIII[333]] = U."Ghost";
        U.llIIIlIllI[U.llIIIllIII[334]] = U."Ladder";
        U.llIIIlIllI[U.llIIIllIII[335]] = U."wealth";
        U.llIIIlIllI[U.llIIIllIII[336]] = U."wealth";
        U.llIIIlIllI[U.llIIIllIII[337]] = U."wealth";
        U.llIIIlIllI[U.llIIIllIII[338]] = U."glory";
        U.llIIIlIllI[U.llIIIllIII[339]] = U."glory";
        U.llIIIlIllI[U.llIIIllIII[340]] = U."glory";
        U.llIIIlIllI[U.llIIIllIII[349]] = U."Can I have a quest?";
        U.llIIIlIllI[U.llIIIllIII[350]] = U."Yes.";
        U.llIIIlIllI[U.llIIIllIII[351]] = U."Can you sell me a rune platebody?";
        U.llIIIlIllI[U.llIIIllIII[352]] = U."The Guildmaster of the Champions' Guild told me.";
        U.llIIIlIllI[U.llIIIllIII[353]] = U."I thought you were going to give me a quest.";
        U.llIIIlIllI[U.llIIIllIII[354]] = U."A dragon, that sounds like fun.";
        U.llIIIlIllI[U.llIIIllIII[355]] = U."I talked to Oziach...";
        U.llIIIlIllI[U.llIIIllIII[356]] = U."Where can I find the right ship?";
        U.llIIIlIllI[U.llIIIllIII[357]] = U."I seek a piece of the map to the island of Crandor.";
        U.llIIIlIllI[U.llIIIllIII[358]] = U."I believe you've got a piece of map that I need.";
        U.llIIIlIllI[U.llIIIllIII[359]] = U."I suppose I could pay you for the map piece...";
        U.llIIIlIllI[U.llIIIllIII[360]] = U."Alright then, 10,000 it is.";
        U.llIIIlIllI[U.llIIIllIII[361]] = U."I'd like to buy her.";
        U.llIIIlIllI[U.llIIIllIII[362]] = U."Yep, sounds good.";
        U.llIIIlIllI[U.llIIIllIII[363]] = U."You're a sailor? Could you take me to Crandor?";
        U.llIIIlIllI[U.llIIIllIII[364]] = U."Yes, let's go!";
    }

    private static boolean lIlIIllIlIIll(int n2) {
        return n2 < 0;
    }

    private static boolean lIlIIllIIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIllIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static int lIlIIllIIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIIllIlllll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        U.lIlIIllIIlIIl();
        U.lIlIIllIIIlll();
        lW = new WorldPoint(llIIIllIII[341], llIIIllIII[342], llIIIllIII[0]);
        lX = new WorldPoint(llIIIllIII[343], llIIIllIII[344], llIIIllIII[0]);
        lY = new WorldPoint(llIIIllIII[345], llIIIllIII[346], llIIIllIII[1]);
        lZ = new WorldPoint(llIIIllIII[347], llIIIllIII[348], llIIIllIII[0]);
        bv = new ArrayList<d>();
        String[] stringArray = new String[llIIIllIII[43]];
        stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[349]];
        stringArray[U.llIIIllIII[1]] = llIIIlIllI[llIIIllIII[350]];
        stringArray[U.llIIIllIII[2]] = llIIIlIllI[llIIIllIII[351]];
        stringArray[U.llIIIllIII[7]] = llIIIlIllI[llIIIllIII[352]];
        stringArray[U.llIIIllIII[9]] = llIIIlIllI[llIIIllIII[353]];
        stringArray[U.llIIIllIII[11]] = llIIIlIllI[llIIIllIII[354]];
        stringArray[U.llIIIllIII[12]] = llIIIlIllI[llIIIllIII[355]];
        stringArray[U.llIIIllIII[13]] = llIIIlIllI[llIIIllIII[356]];
        stringArray[U.llIIIllIII[16]] = llIIIlIllI[llIIIllIII[357]];
        stringArray[U.llIIIllIII[17]] = llIIIlIllI[llIIIllIII[358]];
        stringArray[U.llIIIllIII[23]] = llIIIlIllI[llIIIllIII[359]];
        stringArray[U.llIIIllIII[26]] = llIIIlIllI[llIIIllIII[360]];
        stringArray[U.llIIIllIII[28]] = llIIIlIllI[llIIIllIII[361]];
        stringArray[U.llIIIllIII[38]] = llIIIlIllI[llIIIllIII[362]];
        stringArray[U.llIIIllIII[40]] = llIIIlIllI[llIIIllIII[363]];
        stringArray[U.llIIIllIII[20]] = llIIIlIllI[llIIIllIII[364]];
        cE = stringArray;
    }

    private static boolean lIlIIllIlIlIl(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void llllllllllllllllllIlIllIllIlllll;
        int[] nArray = new int[llIIIllIII[9]];
        nArray[U.llIIIllIII[0]] = llIIIllIII[19];
        nArray[U.llIIIllIII[1]] = llIIIllIII[37];
        nArray[U.llIIIllIII[2]] = llIIIllIII[46];
        nArray[U.llIIIllIII[7]] = llIIIllIII[39];
        int[] nArray2 = nArray;
        int llllllllllllllllllIlIllIllIllllI = llIIIllIII[0];
        while (U.lIlIIllIIllll(llllllllllllllllllIlIllIllIllllI, ((void)llllllllllllllllllIlIllIllIlllll).length)) {
            int[] nArray3 = new int[llIIIllIII[1]];
            nArray3[U.llIIIllIII[0]] = llllllllllllllllllIlIllIllIlllll[llllllllllllllllllIlIllIllIllllI];
            if (U.lIlIIllIlIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIIIllIII[0];
            }
            ++llllllllllllllllllIlIllIllIllllI;
            0;
            if (-2 <= 0) continue;
            return ((0x2C ^ 0x65) & ~(0x2C ^ 0x65)) != 0;
        }
        return llIIIllIII[1];
    }

    private static String lIlIIllIIIIIl(String llllllllllllllllllIlIllIlIlIIllI, String llllllllllllllllllIlIllIlIlIIIll) {
        try {
            SecretKeySpec llllllllllllllllllIlIllIlIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIllIlIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIllIlIlIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIllIlIlIlIII.init(llIIIllIII[2], llllllllllllllllllIlIllIlIlIlIIl);
            return new String(llllllllllllllllllIlIllIlIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIllIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIllIlIlIIlll) {
            llllllllllllllllllIlIllIlIlIIlll.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ah() {
        int n2;
        if (U.lIlIIllIlIllI(e.j(llIIIllIII[14]), llIIIllIII[23]) && U.lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
            n2 = llIIIllIII[1];
            0;
            if (null != null) {
                return ((0x76 ^ 0x39) & ~(9 ^ 0x46)) != 0;
            }
        } else {
            n2 = llIIIllIII[0];
        }
        return n2 != 0;
    }

    private static boolean lIlIIllIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIlIIllIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    public static void dD() {
        block211: {
            WorldPoint llllllllllllllllllIlIllIllllIIIl;
            WorldPoint llllllllllllllllllIlIllIllllIIlI;
            BankLocation llllllllllllllllllIlIllIllllIIll;
            block217: {
                block219: {
                    block221: {
                        block220: {
                            block218: {
                                block212: {
                                    block216: {
                                        block214: {
                                            block215: {
                                                block213: {
                                                    if (U.lIlIIllIIllII(bt ? 1 : 0)) {
                                                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[0]];
                                                        b.a(bv);
                                                        if (U.lIlIIllIIllll(bv.size(), llIIIllIII[1])) {
                                                            System.out.println(llIIIlIllI[llIIIllIII[1]]);
                                                            bt = llIIIllIII[0];
                                                        }
                                                    }
                                                    if (!U.lIlIIllIlIIIl(bt ? 1 : 0)) break block211;
                                                    String[] stringArray = new String[llIIIllIII[1]];
                                                    stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[2]];
                                                    if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        md = llIIIllIII[1];
                                                        mc = llIIIllIII[1];
                                                        ma = llIIIllIII[1];
                                                        mb = llIIIllIII[1];
                                                    }
                                                    int[] nArray = new int[llIIIllIII[1]];
                                                    nArray[U.llIIIllIII[0]] = llIIIllIII[3];
                                                    if (U.lIlIIllIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                        mc = llIIIllIII[1];
                                                    }
                                                    int[] nArray2 = new int[llIIIllIII[1]];
                                                    nArray2[U.llIIIllIII[0]] = llIIIllIII[4];
                                                    if (U.lIlIIllIIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                                        ma = llIIIllIII[1];
                                                    }
                                                    int[] nArray3 = new int[llIIIllIII[1]];
                                                    nArray3[U.llIIIllIII[0]] = llIIIllIII[5];
                                                    if (U.lIlIIllIIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                                        mb = llIIIllIII[1];
                                                    }
                                                    if (U.lIlIIllIIllII(Inventory.contains((int[])f.ba) ? 1 : 0) && U.lIlIIllIIllll(Movement.getRunEnergy(), llIIIllIII[6])) {
                                                        Inventory.getFirst((int[])f.ba).interact(llIIIlIllI[llIIIllIII[7]]);
                                                        Time.sleepTicks((int)llIIIllIII[1]);
                                                        0;
                                                    }
                                                    if (U.lIlIIllIIllII(Inventory.contains((int[])f.aX) ? 1 : 0) && U.lIlIIllIIllll(Prayers.getPoints(), llIIIllIII[8])) {
                                                        Inventory.getFirst((int[])f.aX).interact(llIIIlIllI[llIIIllIII[9]]);
                                                    }
                                                    if (!U.lIlIIllIIllll(Combat.getMissingHealth(), llIIIllIII[10]) || U.lIlIIllIlIIll(U.lIlIIllIIlIlI(e.w(), 51.0))) {
                                                        String[] stringArray2 = new String[llIIIllIII[1]];
                                                        stringArray2[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[11]];
                                                        if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                                            String[] stringArray3 = new String[llIIIllIII[1]];
                                                            stringArray3[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[12]];
                                                            Inventory.getFirst((String[])stringArray3).interact(llIIIlIllI[llIIIllIII[13]]);
                                                        }
                                                    }
                                                    if (U.lIlIIllIlIIIl(Movement.isRunEnabled() ? 1 : 0) && U.lIlIIllIlIlIl(Movement.getRunEnergy())) {
                                                        Movement.toggleRun();
                                                    }
                                                    if (!U.lIlIIllIlIIIl(U.an() ? 1 : 0) || !U.lIlIIllIIllll(e.j(llIIIllIII[14]), llIIIllIII[2]) || !U.lIlIIllIlIllI(e.J(), llIIIllIII[15])) break block212;
                                                    llllllllllllllllllIlIllIllllIIll = BankLocation.getNearest();
                                                    if (U.lIlIIllIlIlll(llllllllllllllllllIlIllIllllIIll) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIllllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[16]];
                                                        Movement.walkTo((BankLocation)llllllllllllllllllIlIllIllllIIll);
                                                        0;
                                                        Time.sleepTicks((int)llIIIllIII[2]);
                                                        0;
                                                    }
                                                    if (!U.lIlIIllIlIlll(llllllllllllllllllIlIllIllllIIll) || !U.lIlIIllIIllII(llllllllllllllllllIlIllIllllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block212;
                                                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[17]];
                                                    if (U.lIlIIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                                                        a.a();
                                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIllIII[18]);
                                                        0;
                                                    }
                                                    if (!U.lIlIIllIIllII(Bank.isOpen() ? 1 : 0)) break block212;
                                                    if (U.lIlIIllIlIlIl(Inventory.getAll().size())) {
                                                        Bank.depositInventory();
                                                        Time.sleepTicks((int)llIIIllIII[9]);
                                                        0;
                                                    }
                                                    if (U.lIlIIllIlIlIl(Equipment.getAll().size())) {
                                                        Bank.depositEquipment();
                                                        Time.sleepTicks((int)llIIIllIII[2]);
                                                        0;
                                                    }
                                                    int[] nArray4 = new int[llIIIllIII[1]];
                                                    nArray4[U.llIIIllIII[0]] = llIIIllIII[19];
                                                    if (!U.lIlIIllIIllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block213;
                                                    int[] nArray5 = new int[llIIIllIII[1]];
                                                    nArray5[U.llIIIllIII[0]] = llIIIllIII[19];
                                                    if (!U.lIlIIllIlIllI(Bank.getFirst((int[])nArray5).getQuantity(), llIIIllIII[20])) break block214;
                                                }
                                                int[] nArray = new int[llIIIllIII[1]];
                                                nArray[U.llIIIllIII[0]] = llIIIllIII[21];
                                                if (!U.lIlIIllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block215;
                                                int[] nArray6 = new int[llIIIllIII[1]];
                                                nArray6[U.llIIIllIII[0]] = llIIIllIII[21];
                                                if (!U.lIlIIllIlIllI(Bank.getFirst((int[])nArray6).getQuantity(), llIIIllIII[20])) break block214;
                                            }
                                            int[] nArray = new int[llIIIllIII[1]];
                                            nArray[U.llIIIllIII[0]] = llIIIllIII[22];
                                            if (!U.lIlIIllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block216;
                                            int[] nArray7 = new int[llIIIllIII[1]];
                                            nArray7[U.llIIIllIII[0]] = llIIIllIII[22];
                                            if (!U.lIlIIllIIllll(Bank.getFirst((int[])nArray7).getQuantity(), llIIIllIII[20])) break block216;
                                        }
                                        U.Q();
                                        System.out.println(llIIIlIllI[llIIIllIII[23]]);
                                        bt = llIIIllIII[1];
                                        return;
                                    }
                                    int[] nArray = new int[llIIIllIII[1]];
                                    nArray[U.llIIIllIII[0]] = llIIIllIII[24];
                                    if (U.lIlIIllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray8 = new int[llIIIllIII[1]];
                                        nArray8[U.llIIIllIII[0]] = llIIIllIII[24];
                                        if (U.lIlIIllIIllll(Bank.getFirst((int[])nArray8).getQuantity(), llIIIllIII[25])) {
                                            U.Q();
                                            System.out.println(llIIIlIllI[llIIIllIII[26]]);
                                            bt = llIIIllIII[1];
                                            return;
                                        }
                                    }
                                    int[] nArray9 = new int[llIIIllIII[1]];
                                    nArray9[U.llIIIllIII[0]] = llIIIllIII[27];
                                    if (U.lIlIIllIIllII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                        int[] nArray10 = new int[llIIIllIII[1]];
                                        nArray10[U.llIIIllIII[0]] = llIIIllIII[27];
                                        if (U.lIlIIllIIllll(Bank.getFirst((int[])nArray10).getQuantity(), llIIIllIII[7])) {
                                            U.Q();
                                            System.out.println(llIIIlIllI[llIIIllIII[28]]);
                                            bt = llIIIllIII[1];
                                            return;
                                        }
                                    }
                                    int[] nArray11 = new int[llIIIllIII[29]];
                                    nArray11[U.llIIIllIII[0]] = llIIIllIII[19];
                                    nArray11[U.llIIIllIII[1]] = llIIIllIII[22];
                                    nArray11[U.llIIIllIII[2]] = llIIIllIII[21];
                                    nArray11[U.llIIIllIII[7]] = llIIIllIII[30];
                                    nArray11[U.llIIIllIII[9]] = llIIIllIII[31];
                                    nArray11[U.llIIIllIII[11]] = llIIIllIII[32];
                                    nArray11[U.llIIIllIII[12]] = llIIIllIII[33];
                                    nArray11[U.llIIIllIII[13]] = llIIIllIII[34];
                                    nArray11[U.llIIIllIII[16]] = llIIIllIII[35];
                                    nArray11[U.llIIIllIII[17]] = llIIIllIII[36];
                                    nArray11[U.llIIIllIII[23]] = llIIIllIII[24];
                                    nArray11[U.llIIIllIII[26]] = llIIIllIII[27];
                                    nArray11[U.llIIIllIII[28]] = llIIIllIII[37];
                                    nArray11[U.llIIIllIII[38]] = llIIIllIII[39];
                                    nArray11[U.llIIIllIII[40]] = llIIIllIII[41];
                                    nArray11[U.llIIIllIII[20]] = llIIIllIII[42];
                                    nArray11[U.llIIIllIII[43]] = llIIIllIII[44];
                                    if (U.lIlIIllIlIIIl(e.c(nArray11) ? 1 : 0)) {
                                        U.Q();
                                        System.out.println(llIIIlIllI[llIIIllIII[38]]);
                                        bt = llIIIllIII[1];
                                        return;
                                    }
                                    int[] nArray12 = new int[llIIIllIII[29]];
                                    nArray12[U.llIIIllIII[0]] = llIIIllIII[19];
                                    nArray12[U.llIIIllIII[1]] = llIIIllIII[22];
                                    nArray12[U.llIIIllIII[2]] = llIIIllIII[21];
                                    nArray12[U.llIIIllIII[7]] = llIIIllIII[30];
                                    nArray12[U.llIIIllIII[9]] = llIIIllIII[31];
                                    nArray12[U.llIIIllIII[11]] = llIIIllIII[32];
                                    nArray12[U.llIIIllIII[12]] = llIIIllIII[33];
                                    nArray12[U.llIIIllIII[13]] = llIIIllIII[34];
                                    nArray12[U.llIIIllIII[16]] = llIIIllIII[35];
                                    nArray12[U.llIIIllIII[17]] = llIIIllIII[36];
                                    nArray12[U.llIIIllIII[23]] = llIIIllIII[24];
                                    nArray12[U.llIIIllIII[26]] = llIIIllIII[27];
                                    nArray12[U.llIIIllIII[28]] = llIIIllIII[37];
                                    nArray12[U.llIIIllIII[38]] = llIIIllIII[39];
                                    nArray12[U.llIIIllIII[40]] = llIIIllIII[41];
                                    nArray12[U.llIIIllIII[20]] = llIIIllIII[42];
                                    nArray12[U.llIIIllIII[43]] = llIIIllIII[44];
                                    if (U.lIlIIllIIllII(e.c(nArray12) ? 1 : 0)) {
                                        a.a(llIIIllIII[19], llIIIllIII[11]);
                                        a.a(llIIIllIII[22], llIIIllIII[11]);
                                        a.a(llIIIllIII[21], llIIIllIII[11]);
                                        a.b(f.ba, llIIIllIII[11]);
                                        a.a(llIIIllIII[35], llIIIllIII[13]);
                                        a.b(f.bk, llIIIllIII[1]);
                                        a.a(llIIIllIII[42], llIIIllIII[1]);
                                        a.a(llIIIllIII[44], llIIIllIII[1]);
                                        a.a(llIIIllIII[39], llIIIllIII[1]);
                                        a.a(llIIIllIII[36], llIIIllIII[1]);
                                        a.a(llIIIllIII[45], llIIIllIII[2]);
                                        a.a(llIIIllIII[46], llIIIllIII[47]);
                                    }
                                }
                                if (U.lIlIIllIIllII(U.an() ? 1 : 0) && U.lIlIIllIIllll(e.j(llIIIllIII[14]), llIIIllIII[1])) {
                                    if (U.lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(lW), llIIIllIII[12])) {
                                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[40]];
                                        Movement.walkTo((WorldPoint)lW);
                                        0;
                                        Time.sleepTicks((int)llIIIllIII[1]);
                                        0;
                                    }
                                    if (U.lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(lW), llIIIllIII[12])) {
                                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[20]];
                                        g.a(llIIIlIllI[llIIIllIII[43]], cE, llIIIllIII[1]);
                                    }
                                }
                                if (U.lIlIIllIllllI(e.j(llIIIllIII[14]), llIIIllIII[1]) && U.lIlIIllIIllII(U.an() ? 1 : 0)) {
                                    llllllllllllllllllIlIllIllllIIll = new WorldPoint(llIIIllIII[48], llIIIllIII[49], llIIIllIII[0]);
                                    if (U.lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlIllIllllIIll), llIIIllIII[16])) {
                                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[29]];
                                        Movement.walkTo((WorldPoint)llllllllllllllllllIlIllIllllIIll);
                                        0;
                                        Time.sleepTicks((int)llIIIllIII[1]);
                                        0;
                                    }
                                    if (U.lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlIllIllllIIll), llIIIllIII[16])) {
                                        g.a(llIIIlIllI[llIIIllIII[50]], cE, llIIIllIII[1]);
                                    }
                                }
                                if (!U.lIlIIllIllllI(e.j(llIIIllIII[14]), llIIIllIII[2])) break block217;
                                di = llIIIllIII[0];
                                int[] nArray = new int[llIIIllIII[1]];
                                nArray[U.llIIIllIII[0]] = llIIIllIII[44];
                                if (U.lIlIIllIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray13 = new int[llIIIllIII[1]];
                                    nArray13[U.llIIIllIII[0]] = llIIIllIII[44];
                                    if (U.lIlIIllIlIIIl(Equipment.contains((int[])nArray13) ? 1 : 0)) {
                                        String[] stringArray = new String[llIIIllIII[1]];
                                        stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[51]];
                                        Inventory.getFirst((String[])stringArray).interact(llIIIlIllI[llIIIllIII[10]]);
                                    }
                                }
                                if (U.lIlIIllIIllII(Inventory.contains(item -> item.getName().contains(llIIIlIllI[llIIIllIII[340]])) ? 1 : 0) && U.lIlIIllIlIIIl(Equipment.contains(item -> item.getName().contains(llIIIlIllI[llIIIllIII[339]])) ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(llIIIlIllI[llIIIllIII[338]])).interact(llIIIlIllI[llIIIllIII[52]]);
                                }
                                if (U.lIlIIllIIllII(Inventory.contains(item -> item.getName().contains(llIIIlIllI[llIIIllIII[337]])) ? 1 : 0) && U.lIlIIllIlIIIl(Equipment.contains(item -> item.getName().contains(llIIIlIllI[llIIIllIII[336]])) ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(llIIIlIllI[llIIIllIII[335]])).interact(llIIIlIllI[llIIIllIII[53]]);
                                }
                                if (!U.lIlIIllIlllll(Vars.getBit((int)llIIIllIII[54]), llIIIllIII[1])) break block218;
                                String[] stringArray = new String[llIIIllIII[1]];
                                stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[55]];
                                if (!U.lIlIIllIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0) || !U.lIlIIllIlIIIl(md ? 1 : 0)) break block219;
                            }
                            if (U.lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(lW), llIIIllIII[12])) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[8]];
                                if (U.lIlIIllIIllII(Inventory.isFull() ? 1 : 0)) {
                                    int[] nArray = new int[llIIIllIII[1]];
                                    nArray[U.llIIIllIII[0]] = llIIIllIII[35];
                                    if (U.lIlIIllIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray14 = new int[llIIIllIII[1]];
                                        nArray14[U.llIIIllIII[0]] = llIIIllIII[35];
                                        Inventory.getFirst((int[])nArray14).interact(llIIIlIllI[llIIIllIII[56]]);
                                        Time.sleepTicks((int)llIIIllIII[1]);
                                        0;
                                    }
                                }
                                Movement.walkTo((WorldPoint)lW);
                                0;
                                Time.sleepTicks((int)llIIIllIII[1]);
                                0;
                            }
                            if (!U.lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(lW), llIIIllIII[12])) break block219;
                            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[57]];
                            if (U.lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                g.a(llIIIlIllI[llIIIllIII[58]], cE, llIIIllIII[1]);
                            }
                            if (U.lIlIIllIllllI(Vars.getBit((int)llIIIllIII[59]), llIIIllIII[1])) {
                                String[] stringArray = new String[llIIIllIII[2]];
                                stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[60]];
                                stringArray[U.llIIIllIII[1]] = llIIIlIllI[llIIIllIII[61]];
                                g.a(stringArray);
                            }
                            if (U.lIlIIllIllllI(Vars.getBit((int)llIIIllIII[62]), llIIIllIII[1])) {
                                String[] stringArray = new String[llIIIllIII[1]];
                                stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[63]];
                                g.a(stringArray);
                            }
                            if (U.lIlIIllIllllI(Vars.getBit((int)llIIIllIII[64]), llIIIllIII[1]) && !U.lIlIIllIIllII(Vars.getBit((int)llIIIllIII[62]))) break block220;
                            String[] stringArray = new String[llIIIllIII[1]];
                            stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[65]];
                            if (!U.lIlIIllIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block221;
                        }
                        String[] stringArray = new String[llIIIllIII[2]];
                        stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[15]];
                        stringArray[U.llIIIllIII[1]] = llIIIlIllI[llIIIllIII[66]];
                        g.a(stringArray);
                    }
                    if (U.lIlIIllIllllI(Vars.getBit((int)llIIIllIII[67]), llIIIllIII[1])) {
                        String[] stringArray = new String[llIIIllIII[2]];
                        stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[68]];
                        stringArray[U.llIIIllIII[1]] = llIIIlIllI[llIIIllIII[69]];
                        g.a(stringArray);
                    }
                    if (U.lIlIIllIllllI(Vars.getBit((int)llIIIllIII[54]), llIIIllIII[1])) {
                        String[] stringArray = new String[llIIIllIII[2]];
                        stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[70]];
                        stringArray[U.llIIIllIII[1]] = llIIIlIllI[llIIIllIII[71]];
                        g.a(stringArray);
                    }
                }
                if ((U.lIlIIllIlIIIl(Vars.getBit((int)llIIIllIII[54])) && U.lIlIIllIlIIIl(Vars.getBit((int)llIIIllIII[67])) && !U.lIlIIllIIllII(Vars.getBit((int)llIIIllIII[62])) || U.lIlIIllIllllI(e.j(llIIIllIII[72]), llIIIllIII[20])) && U.lIlIIllIlIIIl(Vars.getBit((int)llIIIllIII[73]))) {
                    String[] stringArray = new String[llIIIllIII[1]];
                    stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[74]];
                    if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        llllllllllllllllllIlIllIllllIIll = new WorldPoint(llIIIllIII[75], llIIIllIII[76], llIIIllIII[0]);
                        String[] stringArray4 = new String[llIIIllIII[1]];
                        stringArray4[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[77]];
                        if (U.lIlIIlllIIIII(NPCs.getNearest((String[])stringArray4))) {
                            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[78]];
                            Movement.walkTo((WorldPoint)llllllllllllllllllIlIllIllllIIll);
                            0;
                            Time.sleepTicks((int)llIIIllIII[1]);
                            0;
                        }
                        String[] stringArray5 = new String[llIIIllIII[1]];
                        stringArray5[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[79]];
                        if (U.lIlIIllIlIlll(NPCs.getNearest((String[])stringArray5))) {
                            g.a(llIIIlIllI[llIIIllIII[80]], cE);
                        }
                    }
                }
                if (U.lIlIIllIllllI(Vars.getBit((int)llIIIllIII[73]), llIIIllIII[1]) && (!U.lIlIIllIIllII(Vars.getBit((int)llIIIllIII[81])) || U.lIlIIllIlIIIl(ma ? 1 : 0))) {
                    String[] stringArray = new String[llIIIllIII[1]];
                    stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[82]];
                    if (U.lIlIIllIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && U.lIlIIllIlIIIl(Vars.getBit((int)llIIIllIII[83]))) {
                        U.dG();
                    }
                    String[] stringArray6 = new String[llIIIllIII[1]];
                    stringArray6[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[84]];
                    if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        llllllllllllllllllIlIllIllllIIll = new WorldPoint(llIIIllIII[85], llIIIllIII[86], llIIIllIII[0]);
                        if (U.lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlIllIllllIIll), llIIIllIII[9]) && U.lIlIIllIlIIIl(Vars.getBit((int)llIIIllIII[81]))) {
                            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[87]];
                            if (U.lIlIIllIIllII(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)llllllllllllllllllIlIllIllllIIll);
                            0;
                            Time.sleepTicks((int)llIIIllIII[1]);
                            0;
                        }
                        if (U.lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlIllIllllIIll), llIIIllIII[23])) {
                            if (U.lIlIIllIlIIIl(Vars.getBit((int)llIIIllIII[81]))) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[88]];
                                String[] stringArray7 = new String[llIIIllIII[1]];
                                stringArray7[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[89]];
                                if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                    String[] stringArray8 = new String[llIIIllIII[1]];
                                    stringArray8[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[90]];
                                    String[] stringArray9 = new String[llIIIllIII[1]];
                                    stringArray9[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[91]];
                                    Inventory.getFirst((String[])stringArray8).useOn(TileObjects.getNearest((String[])stringArray9));
                                    Time.sleepTicks((int)llIIIllIII[1]);
                                    0;
                                }
                                String[] stringArray10 = new String[llIIIllIII[1]];
                                stringArray10[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[6]];
                                if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                                    String[] stringArray11 = new String[llIIIllIII[1]];
                                    stringArray11[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[92]];
                                    String[] stringArray12 = new String[llIIIllIII[1]];
                                    stringArray12[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[93]];
                                    Inventory.getFirst((String[])stringArray11).useOn(TileObjects.getNearest((String[])stringArray12));
                                    Time.sleepTicks((int)llIIIllIII[1]);
                                    0;
                                }
                                String[] stringArray13 = new String[llIIIllIII[1]];
                                stringArray13[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[94]];
                                if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                                    String[] stringArray14 = new String[llIIIllIII[1]];
                                    stringArray14[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[95]];
                                    String[] stringArray15 = new String[llIIIllIII[1]];
                                    stringArray15[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[96]];
                                    Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((String[])stringArray15));
                                    Time.sleepTicks((int)llIIIllIII[1]);
                                    0;
                                }
                                String[] stringArray16 = new String[llIIIllIII[1]];
                                stringArray16[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[97]];
                                if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                                    String[] stringArray17 = new String[llIIIllIII[1]];
                                    stringArray17[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[98]];
                                    String[] stringArray18 = new String[llIIIllIII[1]];
                                    stringArray18[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[99]];
                                    Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                                    Time.sleepTicks((int)llIIIllIII[1]);
                                    0;
                                }
                            }
                            if (U.lIlIIllIllllI(Vars.getBit((int)llIIIllIII[81]), llIIIllIII[1])) {
                                String[] stringArray19 = new String[llIIIllIII[1]];
                                stringArray19[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[100]];
                                if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray19) ? 1 : 0)) {
                                    String[] stringArray20 = new String[llIIIllIII[1]];
                                    stringArray20[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[101]];
                                    String[] stringArray21 = new String[llIIIllIII[1]];
                                    stringArray21[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[102]];
                                    Inventory.getFirst((String[])stringArray20).useOn(TileObjects.getNearest((String[])stringArray21));
                                    Time.sleepTicks((int)llIIIllIII[1]);
                                    0;
                                }
                                String[] stringArray22 = new String[llIIIllIII[1]];
                                stringArray22[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[103]];
                                if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray22) ? 1 : 0)) {
                                    String[] stringArray23 = new String[llIIIllIII[1]];
                                    stringArray23[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[104]];
                                    String[] stringArray24 = new String[llIIIllIII[1]];
                                    stringArray24[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[105]];
                                    Inventory.getFirst((String[])stringArray23).useOn(TileObjects.getNearest((String[])stringArray24));
                                    Time.sleepTicks((int)llIIIllIII[1]);
                                    0;
                                }
                                String[] stringArray25 = new String[llIIIllIII[1]];
                                stringArray25[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[106]];
                                if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray25) ? 1 : 0)) {
                                    String[] stringArray26 = new String[llIIIllIII[1]];
                                    stringArray26[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[107]];
                                    String[] stringArray27 = new String[llIIIllIII[1]];
                                    stringArray27[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[108]];
                                    Inventory.getFirst((String[])stringArray26).useOn(TileObjects.getNearest((String[])stringArray27));
                                    Time.sleepTicks((int)llIIIllIII[1]);
                                    0;
                                }
                                String[] stringArray28 = new String[llIIIllIII[1]];
                                stringArray28[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[109]];
                                if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray28) ? 1 : 0)) {
                                    String[] stringArray29 = new String[llIIIllIII[1]];
                                    stringArray29[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[110]];
                                    String[] stringArray30 = new String[llIIIllIII[1]];
                                    stringArray30[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[111]];
                                    Inventory.getFirst((String[])stringArray29).useOn(TileObjects.getNearest((String[])stringArray30));
                                    Time.sleepTicks((int)llIIIllIII[1]);
                                    0;
                                }
                                String[] stringArray31 = new String[llIIIllIII[1]];
                                stringArray31[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[112]];
                                llllllllllllllllllIlIllIllllIIlI = TileObjects.getNearest((String[])stringArray31);
                                if (U.lIlIIllIlIlll(llllllllllllllllllIlIllIllllIIlI) && U.lIlIIllIlIIIl(ma ? 1 : 0)) {
                                    if (U.lIlIIllIlIIIl(Reachable.isInteractable((Locatable)llllllllllllllllllIlIllIllllIIlI) ? 1 : 0)) {
                                        String[] stringArray32 = new String[llIIIllIII[1]];
                                        stringArray32[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[113]];
                                        TileObjects.getNearest((String[])stringArray32).interact(llIIIlIllI[llIIIllIII[114]]);
                                        Time.sleepTicks((int)llIIIllIII[16]);
                                        0;
                                    }
                                    if (U.lIlIIllIIllII(Reachable.isInteractable((Locatable)llllllllllllllllllIlIllIllllIIlI) ? 1 : 0) && U.lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                        String[] stringArray33 = new String[llIIIllIII[1]];
                                        stringArray33[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[115]];
                                        if (U.lIlIIllIIllII(llllllllllllllllllIlIllIllllIIlI.hasAction(stringArray33) ? 1 : 0)) {
                                            llllllllllllllllllIlIllIllllIIlI.interact(llIIIlIllI[llIIIllIII[116]]);
                                            Time.sleepTicks((int)llIIIllIII[9]);
                                            0;
                                        }
                                        String[] stringArray34 = new String[llIIIllIII[1]];
                                        stringArray34[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[117]];
                                        if (U.lIlIIllIIllII(llllllllllllllllllIlIllIllllIIlI.hasAction(stringArray34) ? 1 : 0)) {
                                            llllllllllllllllllIlIllIllllIIlI.interact(llIIIlIllI[llIIIllIII[118]]);
                                            Time.sleepTicks((int)llIIIllIII[9]);
                                            0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (U.lIlIIllIllllI(Vars.getBit((int)llIIIllIII[81]), llIIIllIII[1]) && U.lIlIIllIlIIIl(ma ? 1 : 0)) {
                    String[] stringArray = new String[llIIIllIII[1]];
                    stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[119]];
                    if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray35 = new String[llIIIllIII[1]];
                        stringArray35[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[120]];
                        String[] stringArray36 = new String[llIIIllIII[1]];
                        stringArray36[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[121]];
                        Inventory.getFirst((String[])stringArray35).useOn(TileObjects.getNearest((String[])stringArray36));
                        Time.sleepTicks((int)llIIIllIII[1]);
                        0;
                    }
                    String[] stringArray37 = new String[llIIIllIII[1]];
                    stringArray37[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[122]];
                    if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                        String[] stringArray38 = new String[llIIIllIII[1]];
                        stringArray38[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[123]];
                        String[] stringArray39 = new String[llIIIllIII[1]];
                        stringArray39[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[124]];
                        Inventory.getFirst((String[])stringArray38).useOn(TileObjects.getNearest((String[])stringArray39));
                        Time.sleepTicks((int)llIIIllIII[1]);
                        0;
                    }
                    String[] stringArray40 = new String[llIIIllIII[1]];
                    stringArray40[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[125]];
                    if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray40) ? 1 : 0)) {
                        String[] stringArray41 = new String[llIIIllIII[1]];
                        stringArray41[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[126]];
                        String[] stringArray42 = new String[llIIIllIII[1]];
                        stringArray42[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[127]];
                        Inventory.getFirst((String[])stringArray41).useOn(TileObjects.getNearest((String[])stringArray42));
                        Time.sleepTicks((int)llIIIllIII[1]);
                        0;
                    }
                    String[] stringArray43 = new String[llIIIllIII[1]];
                    stringArray43[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[128]];
                    if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray43) ? 1 : 0)) {
                        String[] stringArray44 = new String[llIIIllIII[1]];
                        stringArray44[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[129]];
                        String[] stringArray45 = new String[llIIIllIII[1]];
                        stringArray45[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[130]];
                        Inventory.getFirst((String[])stringArray44).useOn(TileObjects.getNearest((String[])stringArray45));
                        Time.sleepTicks((int)llIIIllIII[1]);
                        0;
                    }
                    String[] stringArray46 = new String[llIIIllIII[1]];
                    stringArray46[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[25]];
                    llllllllllllllllllIlIllIllllIIll = TileObjects.getNearest((String[])stringArray46);
                    if (U.lIlIIllIlIlll(llllllllllllllllllIlIllIllllIIll) && U.lIlIIllIlIIIl(ma ? 1 : 0)) {
                        if (U.lIlIIllIlIIIl(Reachable.isInteractable((Locatable)llllllllllllllllllIlIllIllllIIll) ? 1 : 0)) {
                            String[] stringArray47 = new String[llIIIllIII[1]];
                            stringArray47[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[131]];
                            TileObjects.getNearest((String[])stringArray47).interact(llIIIlIllI[llIIIllIII[132]]);
                            Time.sleepTicks((int)llIIIllIII[16]);
                            0;
                        }
                        if (U.lIlIIllIIllII(Reachable.isInteractable((Locatable)llllllllllllllllllIlIllIllllIIll) ? 1 : 0) && U.lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray48 = new String[llIIIllIII[1]];
                            stringArray48[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[133]];
                            if (U.lIlIIllIIllII(llllllllllllllllllIlIllIllllIIll.hasAction(stringArray48) ? 1 : 0)) {
                                llllllllllllllllllIlIllIllllIIll.interact(llIIIlIllI[llIIIllIII[134]]);
                                Time.sleepTicks((int)llIIIllIII[9]);
                                0;
                            }
                            String[] stringArray49 = new String[llIIIllIII[1]];
                            stringArray49[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[135]];
                            if (U.lIlIIllIIllII(llllllllllllllllllIlIllIllllIIll.hasAction(stringArray49) ? 1 : 0)) {
                                llllllllllllllllllIlIllIllllIIll.interact(llIIIlIllI[llIIIllIII[136]]);
                                Time.sleepTicks((int)llIIIllIII[9]);
                                0;
                            }
                        }
                    }
                }
                if (U.lIlIIllIIllII(ma ? 1 : 0) && U.lIlIIllIlIIIl(mb ? 1 : 0)) {
                    llllllllllllllllllIlIllIllllIIll = new WorldPoint(llIIIllIII[85], llIIIllIII[86], llIIIllIII[0]);
                    if (U.lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlIllIllllIIll), llIIIllIII[23])) {
                        int[] nArray = new int[llIIIllIII[1]];
                        nArray[U.llIIIllIII[0]] = llIIIllIII[21];
                        Inventory.getFirst((int[])nArray).interact(llIIIlIllI[llIIIllIII[137]]);
                        Time.sleepTicks((int)llIIIllIII[16]);
                        0;
                    }
                    llllllllllllllllllIlIllIllllIIlI = new WorldPoint(llIIIllIII[138], llIIIllIII[139], llIIIllIII[0]);
                    if (U.lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIllllIIlI) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[140]];
                        if (U.lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)llllllllllllllllllIlIllIllllIIlI);
                            0;
                            Time.sleepTicks((int)llIIIllIII[1]);
                            0;
                        }
                        String[] stringArray = new String[llIIIllIII[7]];
                        stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[141]];
                        stringArray[U.llIIIllIII[1]] = llIIIlIllI[llIIIllIII[142]];
                        stringArray[U.llIIIllIII[2]] = llIIIlIllI[llIIIllIII[143]];
                        g.a(stringArray);
                    }
                    if (U.lIlIIllIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIllllIIlI) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[144]];
                        g.a(llIIIlIllI[llIIIllIII[145]], cE);
                    }
                }
                if (U.lIlIIllIIllII(ma ? 1 : 0) && U.lIlIIllIIllII(mb ? 1 : 0) && U.lIlIIllIlIIIl(mc ? 1 : 0)) {
                    TileObject llllllllllllllllllIlIllIlllIllIl;
                    TileObject llllllllllllllllllIlIllIlllIlllI;
                    WorldArea llllllllllllllllllIlIllIlllIllll;
                    String[] stringArray = new String[llIIIllIII[1]];
                    stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[146]];
                    if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray50 = new String[llIIIllIII[1]];
                        stringArray50[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[147]];
                        Inventory.getFirst((String[])stringArray50).interact(llIIIlIllI[llIIIllIII[148]]);
                    }
                    llllllllllllllllllIlIllIllllIIll = new WorldArea(llIIIllIII[149], llIIIllIII[150], llIIIllIII[51], llIIIllIII[10], llIIIllIII[0]);
                    llllllllllllllllllIlIllIllllIIlI = new WorldArea(llIIIllIII[151], llIIIllIII[152], llIIIllIII[58], llIIIllIII[58], llIIIllIII[0]);
                    if (U.lIlIIllIlIIIl(Players.getLocal().getWorldLocation().getPlane()) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIllllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIllllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        llllllllllllllllllIlIllIllllIIIl = new WorldPoint(llIIIllIII[153], llIIIllIII[154], llIIIllIII[0]);
                        if (U.lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(llllllllllllllllllIlIllIllllIIIl), llIIIllIII[2])) {
                            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[155]];
                            Movement.walkTo((WorldPoint)llllllllllllllllllIlIllIllllIIIl);
                            0;
                            Time.sleepTicks((int)llIIIllIII[1]);
                            0;
                        }
                        if (U.lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(llllllllllllllllllIlIllIllllIIIl), llIIIllIII[2])) {
                            String[] stringArray51 = new String[llIIIllIII[1]];
                            stringArray51[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[156]];
                            TileObjects.getNearest((String[])stringArray51).interact(llIIIlIllI[llIIIllIII[157]]);
                            Time.sleepTicks((int)llIIIllIII[11]);
                            0;
                        }
                    }
                    llllllllllllllllllIlIllIllllIIIl = new WorldArea(llIIIllIII[158], llIIIllIII[159], llIIIllIII[11], llIIIllIII[16], llIIIllIII[0]);
                    WorldArea llllllllllllllllllIlIllIllllIIII = new WorldArea(llIIIllIII[160], llIIIllIII[161], llIIIllIII[13], llIIIllIII[7], llIIIllIII[0]);
                    if (U.lIlIIllIlIIIl(Players.getLocal().getWorldLocation().getPlane()) && U.lIlIIllIIllII(llllllllllllllllllIlIllIllllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[llIIIllIII[1]];
                        nArray[U.llIIIllIII[0]] = llIIIllIII[162];
                        if (U.lIlIIllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray15 = new int[llIIIllIII[1]];
                            nArray15[U.llIIIllIII[0]] = llIIIllIII[162];
                            if (U.lIlIIlllIIIII(TileItems.getNearest((int[])nArray15)) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIllllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIllllIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlIIllIlIIIl(new WorldArea(llIIIllIII[163], llIIIllIII[164], llIIIllIII[26], llIIIllIII[12], llIIIllIII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[165]];
                                if (U.lIlIIlllIIIII(Players.getLocal().getInteracting())) {
                                    int[] nArray16 = new int[llIIIllIII[1]];
                                    nArray16[U.llIIIllIII[0]] = llIIIllIII[166];
                                    NPCs.getNearest((int[])nArray16).interact(llIIIlIllI[llIIIllIII[167]]);
                                    Time.sleepTicks((int)llIIIllIII[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray17 = new int[llIIIllIII[1]];
                        nArray17[U.llIIIllIII[0]] = llIIIllIII[162];
                        if (U.lIlIIllIlIlll(TileItems.getNearest((int[])nArray17))) {
                            int[] nArray18 = new int[llIIIllIII[1]];
                            nArray18[U.llIIIllIII[0]] = llIIIllIII[162];
                            TileItems.getNearest((int[])nArray18).interact(llIIIlIllI[llIIIllIII[168]]);
                            Time.sleepTicks((int)llIIIllIII[7]);
                            0;
                        }
                        int[] nArray19 = new int[llIIIllIII[1]];
                        nArray19[U.llIIIllIII[0]] = llIIIllIII[162];
                        if (U.lIlIIllIIllII(Inventory.contains((int[])nArray19) ? 1 : 0) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIllllIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIllllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            llllllllllllllllllIlIllIlllIllll = new WorldPoint(llIIIllIII[169], llIIIllIII[170], llIIIllIII[0]);
                            if (U.lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIlllIllll) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[171]];
                                e.c((WorldPoint)llllllllllllllllllIlIllIlllIllll);
                                Time.sleepTicks((int)llIIIllIII[2]);
                                0;
                            }
                            if (U.lIlIIllIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIlllIllll) ? 1 : 0)) {
                                String[] stringArray52 = new String[llIIIllIII[1]];
                                stringArray52[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[172]];
                                TileObjects.getNearest((String[])stringArray52).interact(llIIIlIllI[llIIIllIII[173]]);
                                Time.sleepTicks((int)llIIIllIII[12]);
                                0;
                            }
                        }
                        if (!U.lIlIIllIlIIIl(llllllllllllllllllIlIllIllllIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || U.lIlIIllIIllII(llllllllllllllllllIlIllIllllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            llllllllllllllllllIlIllIlllIllll = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (U.lIlIIllIIllII(tileObject.getName().contains(llIIIlIllI[llIIIllIII[334]]) ? 1 : 0) && U.lIlIIllIIllII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                    n2 = llIIIllIII[1];
                                    0;
                                    if (null != null) {
                                        return ((0xBA ^ 0x8E) & ~(0x2F ^ 0x1B)) != 0;
                                    }
                                } else {
                                    n2 = llIIIllIII[0];
                                }
                                return n2 != 0;
                            });
                            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[174]];
                            if (U.lIlIIllIlIlll(llllllllllllllllllIlIllIlllIllll)) {
                                llllllllllllllllllIlIllIlllIllll.interact(llIIIlIllI[llIIIllIII[175]]);
                                Time.sleepTicks((int)llIIIllIII[7]);
                                0;
                            }
                        }
                    }
                    if (U.lIlIIllIllllI(Players.getLocal().getWorldLocation().getPlane(), llIIIllIII[1]) && U.lIlIIllIlIIIl(new WorldArea(llIIIllIII[176], llIIIllIII[177], llIIIllIII[11], llIIIllIII[13], llIIIllIII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[llIIIllIII[1]];
                        nArray[U.llIIIllIII[0]] = llIIIllIII[178];
                        if (U.lIlIIllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray20 = new int[llIIIllIII[1]];
                            nArray20[U.llIIIllIII[0]] = llIIIllIII[178];
                            if (U.lIlIIlllIIIII(TileItems.getNearest((int[])nArray20))) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[179]];
                                llllllllllllllllllIlIllIlllIllll = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (U.lIlIIllIIllII(nPC.getName().contains(llIIIlIllI[llIIIllIII[333]]) ? 1 : 0) && U.lIlIIlllIIIlI(nPC.getInteracting(), Players.getLocal()) && U.lIlIIllIlllII(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIllIII[1])) {
                                        n2 = llIIIllIII[1];
                                        0;
                                        if (-1 >= 1) {
                                            return ((0x7A ^ 0x55) & ~(0x47 ^ 0x68)) != 0;
                                        }
                                    } else {
                                        n2 = llIIIllIII[0];
                                    }
                                    return n2 != 0;
                                });
                                if (U.lIlIIlllIIIII(Players.getLocal().getInteracting()) && U.lIlIIlllIIIII(llllllllllllllllllIlIllIlllIllll)) {
                                    int[] nArray21 = new int[llIIIllIII[1]];
                                    nArray21[U.llIIIllIII[0]] = llIIIllIII[180];
                                    NPCs.getNearest((int[])nArray21).interact(llIIIlIllI[llIIIllIII[181]]);
                                    Time.sleepTicks((int)llIIIllIII[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray22 = new int[llIIIllIII[1]];
                        nArray22[U.llIIIllIII[0]] = llIIIllIII[178];
                        if (U.lIlIIllIlIlll(TileItems.getNearest((int[])nArray22))) {
                            int[] nArray23 = new int[llIIIllIII[1]];
                            nArray23[U.llIIIllIII[0]] = llIIIllIII[178];
                            TileItems.getNearest((int[])nArray23).interact(llIIIlIllI[llIIIllIII[182]]);
                            Time.sleepTicks((int)llIIIllIII[7]);
                            0;
                        }
                        llllllllllllllllllIlIllIlllIllll = new WorldArea(llIIIllIII[183], llIIIllIII[184], llIIIllIII[12], llIIIllIII[11], llIIIllIII[1]);
                        int[] nArray24 = new int[llIIIllIII[1]];
                        nArray24[U.llIIIllIII[0]] = llIIIllIII[178];
                        if (U.lIlIIllIIllII(Inventory.contains((int[])nArray24) ? 1 : 0) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIlllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            llllllllllllllllllIlIllIlllIlllI = new WorldPoint(llIIIllIII[163], llIIIllIII[170], llIIIllIII[1]);
                            if (U.lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIlllIlllI) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[185]];
                                e.c((WorldPoint)llllllllllllllllllIlIllIlllIlllI);
                                Time.sleepTicks((int)llIIIllIII[2]);
                                0;
                            }
                            if (U.lIlIIllIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIlllIlllI) ? 1 : 0)) {
                                String[] stringArray53 = new String[llIIIllIII[1]];
                                stringArray53[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[186]];
                                TileObjects.getNearest((String[])stringArray53).interact(llIIIlIllI[llIIIllIII[187]]);
                                Time.sleepTicks((int)llIIIllIII[12]);
                                0;
                            }
                        }
                        if (U.lIlIIllIIllII(llllllllllllllllllIlIllIlllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlIIllIlIlll(llllllllllllllllllIlIllIlllIlllI = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (U.lIlIIllIIllII(tileObject.getName().contains(llIIIlIllI[llIIIllIII[332]]) ? 1 : 0) && U.lIlIIllIIllII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = llIIIllIII[1];
                                0;
                                if (null != null) {
                                    return ((86 + 104 - 27 + 13 ^ 113 + 145 - 180 + 89) & (0xE9 ^ 0xAD ^ (0x6D ^ 0x3E) ^ -1)) != 0;
                                }
                            } else {
                                n2 = llIIIllIII[0];
                            }
                            return n2 != 0;
                        }))) {
                            llllllllllllllllllIlIllIlllIlllI.interact(llIIIlIllI[llIIIllIII[188]]);
                            Time.sleepTicks((int)llIIIllIII[7]);
                            0;
                        }
                    }
                    if (U.lIlIIllIllllI(Players.getLocal().getWorldLocation().getPlane(), llIIIllIII[2])) {
                        int[] nArray = new int[llIIIllIII[1]];
                        nArray[U.llIIIllIII[0]] = llIIIllIII[189];
                        if (U.lIlIIllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray25 = new int[llIIIllIII[1]];
                            nArray25[U.llIIIllIII[0]] = llIIIllIII[189];
                            if (U.lIlIIlllIIIII(TileItems.getNearest((int[])nArray25))) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[190]];
                                llllllllllllllllllIlIllIlllIllll = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (U.lIlIIllIIllII(nPC.getName().contains(llIIIlIllI[llIIIllIII[331]]) ? 1 : 0) && U.lIlIIlllIIIlI(nPC.getInteracting(), Players.getLocal()) && U.lIlIIllIlllII(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIllIII[1])) {
                                        n2 = llIIIllIII[1];
                                        0;
                                        if (-1 > 1) {
                                            return ((0x80 ^ 0x97) & ~(0xB8 ^ 0xAF)) != 0;
                                        }
                                    } else {
                                        n2 = llIIIllIII[0];
                                    }
                                    return n2 != 0;
                                });
                                if (U.lIlIIlllIIIII(Players.getLocal().getInteracting()) && U.lIlIIlllIIIII(llllllllllllllllllIlIllIlllIllll)) {
                                    int[] nArray26 = new int[llIIIllIII[1]];
                                    nArray26[U.llIIIllIII[0]] = llIIIllIII[191];
                                    NPCs.getNearest((int[])nArray26).interact(llIIIlIllI[llIIIllIII[192]]);
                                    Time.sleepTicks((int)llIIIllIII[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray27 = new int[llIIIllIII[1]];
                        nArray27[U.llIIIllIII[0]] = llIIIllIII[189];
                        if (U.lIlIIllIlIlll(TileItems.getNearest((int[])nArray27))) {
                            int[] nArray28 = new int[llIIIllIII[1]];
                            nArray28[U.llIIIllIII[0]] = llIIIllIII[189];
                            TileItems.getNearest((int[])nArray28).interact(llIIIlIllI[llIIIllIII[193]]);
                            Time.sleepTicks((int)llIIIllIII[7]);
                            0;
                        }
                        llllllllllllllllllIlIllIlllIllll = new WorldArea(llIIIllIII[149], llIIIllIII[164], llIIIllIII[10], llIIIllIII[38], llIIIllIII[2]);
                        int[] nArray29 = new int[llIIIllIII[1]];
                        nArray29[U.llIIIllIII[0]] = llIIIllIII[189];
                        if (U.lIlIIllIIllII(Inventory.contains((int[])nArray29) ? 1 : 0) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIlllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            llllllllllllllllllIlIllIlllIlllI = new WorldPoint(llIIIllIII[194], llIIIllIII[159], llIIIllIII[2]);
                            if (U.lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIlllIlllI) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[195]];
                                e.c((WorldPoint)llllllllllllllllllIlIllIlllIlllI);
                                Time.sleepTicks((int)llIIIllIII[2]);
                                0;
                            }
                            if (U.lIlIIllIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIlllIlllI) ? 1 : 0)) {
                                String[] stringArray54 = new String[llIIIllIII[1]];
                                stringArray54[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[196]];
                                TileObjects.getNearest((String[])stringArray54).interact(llIIIlIllI[llIIIllIII[197]]);
                                Time.sleepTicks((int)llIIIllIII[12]);
                                0;
                            }
                        }
                        if (U.lIlIIllIIllII(llllllllllllllllllIlIllIlllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlIIllIlIlll(llllllllllllllllllIlIllIlllIlllI = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (U.lIlIIllIIllII(tileObject.getName().contains(llIIIlIllI[llIIIllIII[330]]) ? 1 : 0) && U.lIlIIllIIllII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = llIIIllIII[1];
                                0;
                                if (null != null) {
                                    return ((0x4D ^ 0x54) & ~(0xD9 ^ 0xC0)) != 0;
                                }
                            } else {
                                n2 = llIIIllIII[0];
                            }
                            return n2 != 0;
                        }))) {
                            llllllllllllllllllIlIllIlllIlllI.interact(llIIIlIllI[llIIIllIII[198]]);
                            Time.sleepTicks((int)llIIIllIII[7]);
                            0;
                        }
                    }
                    if ((!U.lIlIIllIlIIIl((llllllllllllllllllIlIllIlllIllll = new WorldArea(llIIIllIII[176], llIIIllIII[177], llIIIllIII[11], llIIIllIII[13], llIIIllIII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || U.lIlIIllIIllII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIIllIII[199], llIIIllIII[200], llIIIllIII[1])) ? 1 : 0)) && U.lIlIIllIlIlll(llllllllllllllllllIlIllIlllIlllI = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (U.lIlIIllIIllII(tileObject.getName().contains(llIIIlIllI[llIIIllIII[328]]) ? 1 : 0) && U.lIlIIllIIllII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                            String[] stringArray = new String[llIIIllIII[1]];
                            stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[329]];
                            if (U.lIlIIllIIllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = llIIIllIII[1];
                                0;
                                if (2 != 0) return n2 != 0;
                                return ((87 + 106 - 90 + 109 ^ 63 + 114 - 61 + 32) & (0x90 ^ 0x9F ^ (0xF2 ^ 0xBD) ^ -1)) != 0;
                            }
                        }
                        n2 = llIIIllIII[0];
                        return n2 != 0;
                    }))) {
                        llllllllllllllllllIlIllIlllIlllI.interact(llIIIlIllI[llIIIllIII[201]]);
                        Time.sleepTicks((int)llIIIllIII[7]);
                        0;
                    }
                    if (U.lIlIIllIIllII((llllllllllllllllllIlIllIlllIlllI = new WorldArea(llIIIllIII[163], llIIIllIII[164], llIIIllIII[26], llIIIllIII[12], llIIIllIII[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlIIllIlIlll(llllllllllllllllllIlIllIlllIllIl = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (U.lIlIIllIIllII(tileObject.getName().contains(llIIIlIllI[llIIIllIII[326]]) ? 1 : 0) && U.lIlIIllIIllII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                            String[] stringArray = new String[llIIIllIII[1]];
                            stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[327]];
                            if (U.lIlIIllIIllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = llIIIllIII[1];
                                0;
                                if (1 >= -1) return n2 != 0;
                                return ((98 + 38 - 14 + 63 ^ 127 + 84 - 110 + 34) & (108 + 12 - 81 + 94 ^ 77 + 71 - 108 + 147 ^ -1)) != 0;
                            }
                        }
                        n2 = llIIIllIII[0];
                        return n2 != 0;
                    }))) {
                        llllllllllllllllllIlIllIlllIllIl.interact(llIIIlIllI[llIIIllIII[202]]);
                        Time.sleepTicks((int)llIIIllIII[7]);
                        0;
                    }
                    llllllllllllllllllIlIllIlllIllIl = new WorldArea(llIIIllIII[194], llIIIllIII[203], llIIIllIII[43], llIIIllIII[9], llIIIllIII[0]);
                    WorldArea llllllllllllllllllIlIllIlllIllII = new WorldArea(llIIIllIII[204], llIIIllIII[205], llIIIllIII[13], llIIIllIII[23], llIIIllIII[0]);
                    WorldArea llllllllllllllllllIlIllIlllIlIll = new WorldArea(llIIIllIII[169], llIIIllIII[206], llIIIllIII[11], llIIIllIII[17], llIIIllIII[0]);
                    if (U.lIlIIllIIllII(llllllllllllllllllIlIllIllllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint llllllllllllllllllIlIllIlllIlIII;
                        WorldPoint llllllllllllllllllIlIllIlllIlIIl;
                        WorldArea llllllllllllllllllIlIllIlllIlIlI;
                        int[] nArray = new int[llIIIllIII[1]];
                        nArray[U.llIIIllIII[0]] = llIIIllIII[207];
                        if (U.lIlIIllIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray30 = new int[llIIIllIII[1]];
                            nArray30[U.llIIIllIII[0]] = llIIIllIII[207];
                            if (U.lIlIIlllIIIII(TileItems.getNearest((int[])nArray30)) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIlllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIlllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIlllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[208]];
                                llllllllllllllllllIlIllIlllIlIlI = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (U.lIlIIllIIllII(nPC.getName().contains(llIIIlIllI[llIIIllIII[325]]) ? 1 : 0) && U.lIlIIlllIIIlI(nPC.getInteracting(), Players.getLocal()) && U.lIlIIllIlllII(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIllIII[1])) {
                                        n2 = llIIIllIII[1];
                                        0;
                                        if ((0x35 ^ 0x6D ^ (0x36 ^ 0x6A)) < ((0x53 ^ 2 ^ (0x2C ^ 0x48)) & (0x4C ^ 0x7A ^ 3 ^ -1))) {
                                            return ((0x35 ^ 0x62 ^ (0x86 ^ 0xB1)) & (1 ^ (0x74 ^ 0x15) ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = llIIIllIII[0];
                                    }
                                    return n2 != 0;
                                });
                                if (U.lIlIIlllIIIII(Players.getLocal().getInteracting()) && U.lIlIIlllIIIII(llllllllllllllllllIlIllIlllIlIlI)) {
                                    int[] nArray31 = new int[llIIIllIII[1]];
                                    nArray31[U.llIIIllIII[0]] = llIIIllIII[209];
                                    NPCs.getNearest((int[])nArray31).interact(llIIIlIllI[llIIIllIII[210]]);
                                    Time.sleepTicks((int)llIIIllIII[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray32 = new int[llIIIllIII[1]];
                        nArray32[U.llIIIllIII[0]] = llIIIllIII[207];
                        if (U.lIlIIllIlIlll(TileItems.getNearest((int[])nArray32))) {
                            int[] nArray33 = new int[llIIIllIII[1]];
                            nArray33[U.llIIIllIII[0]] = llIIIllIII[207];
                            TileItems.getNearest((int[])nArray33).interact(llIIIlIllI[llIIIllIII[211]]);
                            Time.sleepTicks((int)llIIIllIII[7]);
                            0;
                        }
                        llllllllllllllllllIlIllIlllIlIlI = new WorldArea(llIIIllIII[169], llIIIllIII[206], llIIIllIII[11], llIIIllIII[17], llIIIllIII[0]);
                        int[] nArray34 = new int[llIIIllIII[1]];
                        nArray34[U.llIIIllIII[0]] = llIIIllIII[207];
                        if (U.lIlIIllIIllII(Inventory.contains((int[])nArray34) ? 1 : 0) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIlllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            llllllllllllllllllIlIllIlllIlIIl = new WorldPoint(llIIIllIII[183], llIIIllIII[212], llIIIllIII[0]);
                            if (U.lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIlllIlIIl) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[213]];
                                e.c(llllllllllllllllllIlIllIlllIlIIl);
                                Time.sleepTicks((int)llIIIllIII[2]);
                                0;
                            }
                            if (U.lIlIIllIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIlllIlIIl) ? 1 : 0)) {
                                String[] stringArray55 = new String[llIIIllIII[1]];
                                stringArray55[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[214]];
                                TileObjects.getNearest((String[])stringArray55).interact(llIIIlIllI[llIIIllIII[215]]);
                                Time.sleepTicks((int)llIIIllIII[12]);
                                0;
                            }
                        }
                        if (U.lIlIIllIIllII(llllllllllllllllllIlIllIlllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray35 = new int[llIIIllIII[1]];
                            nArray35[U.llIIIllIII[0]] = llIIIllIII[216];
                            if (U.lIlIIllIlIIIl(Inventory.contains((int[])nArray35) ? 1 : 0)) {
                                int[] nArray36 = new int[llIIIllIII[1]];
                                nArray36[U.llIIIllIII[0]] = llIIIllIII[216];
                                if (U.lIlIIlllIIIII(TileItems.getNearest((int[])nArray36))) {
                                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[217]];
                                    if (U.lIlIIllIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                    }
                                    if (U.lIlIIlllIIIII(Players.getLocal().getInteracting())) {
                                        int[] nArray37 = new int[llIIIllIII[1]];
                                        nArray37[U.llIIIllIII[0]] = llIIIllIII[218];
                                        NPCs.getNearest((int[])nArray37).interact(llIIIlIllI[llIIIllIII[219]]);
                                        Time.sleepTicks((int)llIIIllIII[11]);
                                        0;
                                    }
                                }
                            }
                            int[] nArray38 = new int[llIIIllIII[1]];
                            nArray38[U.llIIIllIII[0]] = llIIIllIII[216];
                            if (U.lIlIIllIlIlll(TileItems.getNearest((int[])nArray38))) {
                                if (U.lIlIIllIIllII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                int[] nArray39 = new int[llIIIllIII[1]];
                                nArray39[U.llIIIllIII[0]] = llIIIllIII[216];
                                TileItems.getNearest((int[])nArray39).interact(llIIIlIllI[llIIIllIII[220]]);
                                Time.sleepTicks((int)llIIIllIII[7]);
                                0;
                            }
                            llllllllllllllllllIlIllIlllIlIIl = new WorldArea(llIIIllIII[169], llIIIllIII[206], llIIIllIII[11], llIIIllIII[17], llIIIllIII[0]);
                            int[] nArray40 = new int[llIIIllIII[1]];
                            nArray40[U.llIIIllIII[0]] = llIIIllIII[216];
                            if (U.lIlIIllIIllII(Inventory.contains((int[])nArray40) ? 1 : 0) && U.lIlIIllIIllII(llllllllllllllllllIlIllIlllIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIlllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && U.lIlIIllIlIIIl(llllllllllllllllllIlIllIlllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                llllllllllllllllllIlIllIlllIlIII = new WorldPoint(llIIIllIII[221], llIIIllIII[222], llIIIllIII[0]);
                                if (U.lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIlllIlIII) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[223]];
                                    e.c(llllllllllllllllllIlIllIlllIlIII);
                                    Time.sleepTicks((int)llIIIllIII[2]);
                                    0;
                                }
                                if (U.lIlIIllIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIlllIlIII) ? 1 : 0)) {
                                    String[] stringArray56 = new String[llIIIllIII[1]];
                                    stringArray56[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[224]];
                                    TileObjects.getNearest((String[])stringArray56).interact(llIIIlIllI[llIIIllIII[225]]);
                                    Time.sleepTicks((int)llIIIllIII[12]);
                                    0;
                                }
                            }
                        }
                        if (!U.lIlIIllIlIIIl(llllllllllllllllllIlIllIlllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || U.lIlIIllIIllII(llllllllllllllllllIlIllIlllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray57 = new String[llIIIllIII[1]];
                            stringArray57[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[226]];
                            llllllllllllllllllIlIllIlllIlIIl = NPCs.getNearest((String[])stringArray57);
                            if (U.lIlIIllIlIlll(llllllllllllllllllIlIllIlllIlIIl)) {
                                int[] nArray41 = new int[llIIIllIII[1]];
                                nArray41[U.llIIIllIII[0]] = llIIIllIII[227];
                                if (U.lIlIIllIlIIIl(Inventory.contains((int[])nArray41) ? 1 : 0) && U.lIlIIlllIIIII(Players.getLocal().getInteracting())) {
                                    if (U.lIlIIllIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                    }
                                    llllllllllllllllllIlIllIlllIlIIl.interact(llIIIlIllI[llIIIllIII[228]]);
                                    Time.sleepTicks((int)llIIIllIII[7]);
                                    0;
                                }
                            }
                            int[] nArray42 = new int[llIIIllIII[1]];
                            nArray42[U.llIIIllIII[0]] = llIIIllIII[227];
                            if (U.lIlIIllIlIlll(TileItems.getNearest((int[])nArray42))) {
                                int[] nArray43 = new int[llIIIllIII[1]];
                                nArray43[U.llIIIllIII[0]] = llIIIllIII[227];
                                TileItems.getNearest((int[])nArray43).interact(llIIIlIllI[llIIIllIII[229]]);
                                Time.sleepTicks((int)llIIIllIII[2]);
                                0;
                            }
                            int[] nArray44 = new int[llIIIllIII[1]];
                            nArray44[U.llIIIllIII[0]] = llIIIllIII[227];
                            if (U.lIlIIllIIllII(Inventory.contains((int[])nArray44) ? 1 : 0)) {
                                llllllllllllllllllIlIllIlllIlIII = new WorldPoint(llIIIllIII[176], llIIIllIII[230], llIIIllIII[0]);
                                if (U.lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIlllIlIII) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[231]];
                                    e.c(llllllllllllllllllIlIllIlllIlIII);
                                    Time.sleepTicks((int)llIIIllIII[2]);
                                    0;
                                }
                                if (U.lIlIIllIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIllIlllIlIII) ? 1 : 0)) {
                                    String[] stringArray58 = new String[llIIIllIII[1]];
                                    stringArray58[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[232]];
                                    TileObjects.getNearest((String[])stringArray58).interact(llIIIlIllI[llIIIllIII[233]]);
                                    Time.sleepTicks((int)llIIIllIII[12]);
                                    0;
                                }
                            }
                        }
                        if (U.lIlIIllIlIlll(llllllllllllllllllIlIllIlllIlIIl = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (U.lIlIIllIIllII(tileObject.getName().contains(llIIIlIllI[llIIIllIII[324]]) ? 1 : 0) && U.lIlIIllIIllII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = llIIIllIII[1];
                                0;
                                if ((92 + 116 - 57 + 20 ^ 34 + 165 - 135 + 111) < 1) {
                                    return ((0xA0 ^ 0x95 ^ (0x2C ^ 0x2B)) & (0xD9 ^ 0xC0 ^ (0x1E ^ 0x35) ^ -1)) != 0;
                                }
                            } else {
                                n2 = llIIIllIII[0];
                            }
                            return n2 != 0;
                        }))) {
                            if (U.lIlIIllIIllII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (U.lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray59 = new String[llIIIllIII[1]];
                                stringArray59[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[234]];
                                if (U.lIlIIllIIllII(llllllllllllllllllIlIllIlllIlIIl.hasAction(stringArray59) ? 1 : 0)) {
                                    llllllllllllllllllIlIllIlllIlIIl.interact(llIIIlIllI[llIIIllIII[235]]);
                                    Time.sleepTicks((int)llIIIllIII[9]);
                                    0;
                                }
                                String[] stringArray60 = new String[llIIIllIII[1]];
                                stringArray60[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[236]];
                                if (U.lIlIIllIIllII(llllllllllllllllllIlIllIlllIlIIl.hasAction(stringArray60) ? 1 : 0)) {
                                    llllllllllllllllllIlIllIlllIlIIl.interact(llIIIlIllI[llIIIllIII[237]]);
                                    Time.sleepTicks((int)llIIIllIII[9]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (U.lIlIIllIIllII(mb ? 1 : 0) && U.lIlIIllIIllII(mc ? 1 : 0) && U.lIlIIllIIllII(ma ? 1 : 0) && U.lIlIIllIlIIIl(md ? 1 : 0)) {
                    int[] nArray = new int[llIIIllIII[1]];
                    nArray[U.llIIIllIII[0]] = llIIIllIII[3];
                    if (U.lIlIIllIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray45 = new int[llIIIllIII[1]];
                        nArray45[U.llIIIllIII[0]] = llIIIllIII[3];
                        int[] nArray46 = new int[llIIIllIII[1]];
                        nArray46[U.llIIIllIII[0]] = llIIIllIII[5];
                        Inventory.getFirst((int[])nArray45).useOn(Inventory.getFirst((int[])nArray46));
                        Time.sleepTicks((int)llIIIllIII[7]);
                        0;
                    }
                }
                if (U.lIlIIllIIllII(md ? 1 : 0)) {
                    String[] stringArray = new String[llIIIllIII[1]];
                    stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[238]];
                    if (U.lIlIIllIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        U.dF();
                    }
                    String[] stringArray61 = new String[llIIIllIII[1]];
                    stringArray61[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[239]];
                    if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray61) ? 1 : 0)) {
                        if (U.lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(lZ), llIIIllIII[9])) {
                            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[240]];
                            if (U.lIlIIllIIllII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray62 = new String[llIIIllIII[1]];
                                stringArray62[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[241]];
                                if (U.lIlIIlllIIIII(NPCs.getNearest((String[])stringArray62))) {
                                    Dialog.close();
                                }
                            }
                            if (U.lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)lZ);
                                0;
                                Time.sleepTicks((int)llIIIllIII[1]);
                                0;
                            }
                            String[] stringArray63 = new String[llIIIllIII[7]];
                            stringArray63[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[242]];
                            stringArray63[U.llIIIllIII[1]] = llIIIlIllI[llIIIllIII[243]];
                            stringArray63[U.llIIIllIII[2]] = llIIIlIllI[llIIIllIII[244]];
                            g.a(stringArray63);
                        }
                        if (U.lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(lZ), llIIIllIII[9])) {
                            g.a(llIIIlIllI[llIIIllIII[245]], cE);
                        }
                    }
                }
            }
            if (U.lIlIIllIllllI(e.j(llIIIllIII[14]), llIIIllIII[7])) {
                di = llIIIllIII[0];
                String[] stringArray = new String[llIIIllIII[1]];
                stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[246]];
                llllllllllllllllllIlIllIllllIIll = NPCs.getNearest((String[])stringArray);
                if (U.lIlIIlllIIIII(llllllllllllllllllIlIllIllllIIll) && U.lIlIIllIlIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[247]];
                    String[] stringArray64 = new String[llIIIllIII[1]];
                    stringArray64[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[248]];
                    TileObjects.getNearest((String[])stringArray64).interact(llIIIlIllI[llIIIllIII[249]]);
                    Time.sleepTicks((int)llIIIllIII[16]);
                    0;
                }
                if (U.lIlIIlllIIIII(llllllllllllllllllIlIllIllllIIll) && U.lIlIIllIllllI(Players.getLocal().getWorldLocation().getPlane(), llIIIllIII[1])) {
                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[250]];
                    String[] stringArray65 = new String[llIIIllIII[1]];
                    stringArray65[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[251]];
                    TileObjects.getNearest((String[])stringArray65).interact(llIIIlIllI[llIIIllIII[252]]);
                    Time.sleepTicks((int)llIIIllIII[7]);
                    0;
                }
                if (U.lIlIIllIlIlll(llllllllllllllllllIlIllIllllIIll) && U.lIlIIllIllllI(Players.getLocal().getWorldLocation().getPlane(), llIIIllIII[1])) {
                    String[] stringArray66 = new String[llIIIllIII[1]];
                    stringArray66[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[253]];
                    TileObjects.getNearest((String[])stringArray66).interact(llIIIlIllI[llIIIllIII[254]]);
                    Time.sleepTicks((int)llIIIllIII[11]);
                    0;
                }
            }
            if (U.lIlIIllIllllI(e.j(llIIIllIII[14]), llIIIllIII[12])) {
                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[255]];
                String[] stringArray = new String[llIIIllIII[1]];
                stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[256]];
                llllllllllllllllllIlIllIllllIIll = NPCs.getNearest((String[])stringArray);
                if (U.lIlIIlllIIIII(llllllllllllllllllIlIllIllllIIll)) {
                    Equipment.getFirst(item -> item.getName().contains(llIIIlIllI[llIIIllIII[323]])).interact(llIIIlIllI[llIIIllIII[257]]);
                    Time.sleepTicks((int)llIIIllIII[23]);
                    0;
                    Movement.walkTo((WorldPoint)new WorldPoint(llIIIllIII[258], llIIIllIII[259], llIIIllIII[0]));
                    0;
                }
                if (U.lIlIIllIlIlll(llllllllllllllllllIlIllIllllIIll)) {
                    g.a(llIIIlIllI[llIIIllIII[14]], cE, llIIIllIII[1]);
                }
            }
            if (U.lIlIIllIllllI(e.j(llIIIllIII[14]), llIIIllIII[13])) {
                if (U.lIlIIllIlIIIl(Inventory.contains(item -> item.getName().contains(llIIIlIllI[llIIIllIII[322]])) ? 1 : 0)) {
                    U.dE();
                }
                if (U.lIlIIllIIllII(Inventory.contains(item -> item.getName().contains(llIIIlIllI[llIIIllIII[321]])) ? 1 : 0)) {
                    String[] stringArray = new String[llIIIllIII[1]];
                    stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[72]];
                    if (U.lIlIIlllIIIII(NPCs.getNearest((String[])stringArray)) && U.lIlIIllIlIIIl(Players.getLocal().getWorldLocation().getPlane()) && U.lIlIIllIlIIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        if (U.lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(lZ), llIIIllIII[2])) {
                            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[260]];
                            if (U.lIlIIllIIllII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray67 = new String[llIIIllIII[1]];
                                stringArray67[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[261]];
                                if (U.lIlIIlllIIIII(NPCs.getNearest((String[])stringArray67))) {
                                    Dialog.close();
                                }
                            }
                            if (U.lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)lZ);
                                0;
                                Time.sleepTicks((int)llIIIllIII[1]);
                                0;
                            }
                            String[] stringArray68 = new String[llIIIllIII[7]];
                            stringArray68[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[262]];
                            stringArray68[U.llIIIllIII[1]] = llIIIlIllI[llIIIllIII[263]];
                            stringArray68[U.llIIIllIII[2]] = llIIIlIllI[llIIIllIII[264]];
                            g.a(stringArray68);
                        }
                        if (U.lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(lZ), llIIIllIII[2]) && U.lIlIIllIlIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] stringArray69 = new String[llIIIllIII[1]];
                            stringArray69[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[265]];
                            TileObjects.getNearest((String[])stringArray69).interact(llIIIlIllI[llIIIllIII[266]]);
                            Time.sleepTicks((int)llIIIllIII[13]);
                            0;
                        }
                    }
                    String[] stringArray70 = new String[llIIIllIII[1]];
                    stringArray70[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[267]];
                    if (U.lIlIIllIlIlll(NPCs.getNearest((String[])stringArray70)) && U.lIlIIllIllllI(Players.getLocal().getWorldLocation().getPlane(), llIIIllIII[1])) {
                        g.a(llIIIlIllI[llIIIllIII[268]], cE);
                    }
                }
            }
            if (U.lIlIIllIllllI(e.j(llIIIllIII[14]), llIIIllIII[16])) {
                llllllllllllllllllIlIllIllllIIll = new WorldArea(llIIIllIII[269], llIIIllIII[270], llIIIllIII[89], llIIIllIII[79], llIIIllIII[0]);
                if (U.lIlIIllIlIIIl(llllllllllllllllllIlIllIllllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    llllllllllllllllllIlIllIllllIIlI = new WorldPoint(llIIIllIII[271], llIIIllIII[259], llIIIllIII[0]);
                    if (U.lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(llllllllllllllllllIlIllIllllIIlI), llIIIllIII[7])) {
                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[272]];
                        Movement.walkTo((WorldPoint)llllllllllllllllllIlIllIllllIIlI);
                        0;
                        Time.sleepTicks((int)llIIIllIII[1]);
                        0;
                    }
                    if (U.lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(llllllllllllllllllIlIllIllllIIlI), llIIIllIII[7])) {
                        String[] stringArray = new String[llIIIllIII[1]];
                        stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[273]];
                        TileObjects.getNearest((String[])stringArray).interact(llIIIlIllI[llIIIllIII[274]]);
                        Time.sleepTicks((int)llIIIllIII[9]);
                        0;
                    }
                }
                if (U.lIlIIllIIllII(llllllllllllllllllIlIllIllllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[llIIIllIII[1]];
                    stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[275]];
                    llllllllllllllllllIlIllIllllIIlI = NPCs.getNearest((String[])stringArray);
                    llllllllllllllllllIlIllIllllIIIl = new WorldPoint(llIIIllIII[276], llIIIllIII[152], llIIIllIII[0]);
                    if (U.lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(llllllllllllllllllIlIllIllllIIIl), llIIIllIII[7]) && U.lIlIIlllIIIII(llllllllllllllllllIlIllIllllIIlI)) {
                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[277]];
                        Movement.walkTo((WorldPoint)llllllllllllllllllIlIllIllllIIIl);
                        0;
                        Time.sleepTicks((int)llIIIllIII[1]);
                        0;
                    }
                    if (U.lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(llllllllllllllllllIlIllIllllIIIl), llIIIllIII[7]) && U.lIlIIllIlIlll(llllllllllllllllllIlIllIllllIIlI) && U.lIlIIllIlIIIl(Reachable.isInteractable((Locatable)llllllllllllllllllIlIllIllllIIlI) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[278]];
                        Movement.walkTo((WorldPoint)llllllllllllllllllIlIllIllllIIIl);
                        0;
                        Time.sleepTicks((int)llIIIllIII[1]);
                        0;
                    }
                    if (U.lIlIIllIlIlll(llllllllllllllllllIlIllIllllIIlI) && U.lIlIIllIlIIIl(Reachable.isInteractable((Locatable)llllllllllllllllllIlIllIllllIIlI) ? 1 : 0) && U.lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(llllllllllllllllllIlIllIllllIIIl), llIIIllIII[7]) && U.lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        if (U.lIlIIllIllIlI(Combat.getMissingHealth(), llIIIllIII[9])) {
                            String[] stringArray71 = new String[llIIIllIII[1]];
                            stringArray71[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[279]];
                            if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                                String[] stringArray72 = new String[llIIIllIII[1]];
                                stringArray72[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[280]];
                                Inventory.getFirst((String[])stringArray72).interact(llIIIlIllI[llIIIllIII[281]]);
                                Time.sleepTicks((int)llIIIllIII[1]);
                                0;
                            }
                        }
                        String[] stringArray73 = new String[llIIIllIII[1]];
                        stringArray73[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[282]];
                        TileObjects.getNearest((String[])stringArray73).interact(llIIIlIllI[llIIIllIII[283]]);
                    }
                    if (U.lIlIIllIlIlll(llllllllllllllllllIlIllIllllIIlI) && U.lIlIIllIIllII(Reachable.isInteractable((Locatable)llllllllllllllllllIlIllIllllIIlI) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[284]];
                        if (U.lIlIIllIlIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                        }
                        if (U.lIlIIllIlIIIl(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                        }
                        if (U.lIlIIllIlIIIl(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                        }
                        String[] stringArray74 = new String[llIIIllIII[1]];
                        stringArray74[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[285]];
                        if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray74) ? 1 : 0)) {
                            String[] stringArray75 = new String[llIIIllIII[1]];
                            stringArray75[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[286]];
                            Inventory.getFirst((String[])stringArray75).interact(llIIIlIllI[llIIIllIII[287]]);
                        }
                        if (U.lIlIIllIIllII(Inventory.isFull() ? 1 : 0)) {
                            String[] stringArray76 = new String[llIIIllIII[1]];
                            stringArray76[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[288]];
                            Inventory.getFirst((String[])stringArray76).interact(llIIIlIllI[llIIIllIII[289]]);
                        }
                        if (U.lIlIIllIllllI(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && U.lIlIIllIIllII(Inventory.contains(item -> item.getName().contains(llIIIlIllI[llIIIllIII[320]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(llIIIlIllI[llIIIllIII[319]])).interact(llIIIlIllI[llIIIllIII[290]]);
                        }
                        if (U.lIlIIllIIllll(Vars.getBit((int)llIIIllIII[291]), llIIIllIII[1]) && U.lIlIIllIIllII(Inventory.contains(item -> item.getName().contains(llIIIlIllI[llIIIllIII[318]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(llIIIlIllI[llIIIllIII[317]])).interact(llIIIlIllI[llIIIllIII[292]]);
                        }
                        if (U.lIlIIlllIIIII(Players.getLocal().getInteracting())) {
                            llllllllllllllllllIlIllIllllIIlI.interact(llIIIlIllI[llIIIllIII[293]]);
                            Time.sleepTicks((int)llIIIllIII[1]);
                            0;
                        }
                    }
                }
            }
            if (U.lIlIIllIllllI(e.j(llIIIllIII[14]), llIIIllIII[17])) {
                Prayers.disableAll();
                llllllllllllllllllIlIllIllllIIll = new WorldPoint(llIIIllIII[48], llIIIllIII[49], llIIIllIII[0]);
                if (U.lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlIllIllllIIll), llIIIllIII[16]) && U.lIlIIllIllllI(Players.getLocal().getAnimation(), llIIIllIII[294])) {
                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[295]];
                    Movement.walkTo((WorldPoint)llllllllllllllllllIlIllIllllIIll);
                    0;
                    Time.sleepTicks((int)llIIIllIII[1]);
                    0;
                }
                if (U.lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlIllIllllIIll), llIIIllIII[16])) {
                    if (U.lIlIIllIIllll(di, llIIIllIII[1])) {
                        aN.tc += llIIIllIII[1];
                        aN.u(AccBuilderSotf.m);
                        di += llIIIllIII[1];
                        aN.tc = llIIIllIII[0];
                        dj = llIIIllIII[0];
                    }
                    g.a(llIIIlIllI[llIIIllIII[296]], cE, llIIIllIII[1]);
                }
            }
            int[] nArray = new int[llIIIllIII[1]];
            nArray[U.llIIIllIII[0]] = llIIIllIII[36];
            if (U.lIlIIllIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray47 = new int[llIIIllIII[1]];
                nArray47[U.llIIIllIII[0]] = llIIIllIII[36];
                if (U.lIlIIllIlIIIl(Equipment.contains((int[])nArray47) ? 1 : 0) && U.lIlIIllIlIlIl(e.j(llIIIllIII[14]))) {
                    int[] nArray48 = new int[llIIIllIII[1]];
                    nArray48[U.llIIIllIII[0]] = llIIIllIII[36];
                    Inventory.getFirst((int[])nArray48).interact(llIIIlIllI[llIIIllIII[297]]);
                }
            }
            String[] stringArray = new String[llIIIllIII[1]];
            stringArray[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[298]];
            if (U.lIlIIllIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                md = llIIIllIII[1];
                mc = llIIIllIII[1];
                ma = llIIIllIII[1];
                mb = llIIIllIII[1];
            }
            int[] nArray49 = new int[llIIIllIII[1]];
            nArray49[U.llIIIllIII[0]] = llIIIllIII[3];
            if (U.lIlIIllIIllII(Inventory.contains((int[])nArray49) ? 1 : 0)) {
                mc = llIIIllIII[1];
            }
            int[] nArray50 = new int[llIIIllIII[1]];
            nArray50[U.llIIIllIII[0]] = llIIIllIII[4];
            if (U.lIlIIllIIllII(Inventory.contains((int[])nArray50) ? 1 : 0)) {
                ma = llIIIllIII[1];
            }
            int[] nArray51 = new int[llIIIllIII[1]];
            nArray51[U.llIIIllIII[0]] = llIIIllIII[5];
            if (U.lIlIIllIIllII(Inventory.contains((int[])nArray51) ? 1 : 0)) {
                mb = llIIIllIII[1];
            }
            if (U.lIlIIllIllllI(e.j(llIIIllIII[14]), llIIIllIII[23])) {
                String[] stringArray77 = new String[llIIIllIII[1]];
                stringArray77[U.llIIIllIII[0]] = llIIIlIllI[llIIIllIII[299]];
                if (U.lIlIIllIlIlll(NPCs.getNearest((String[])stringArray77))) {
                    int[] nArray52 = new int[llIIIllIII[1]];
                    nArray52[U.llIIIllIII[0]] = llIIIllIII[19];
                    if (U.lIlIIllIIllII(Inventory.contains((int[])nArray52) ? 1 : 0)) {
                        int[] nArray53 = new int[llIIIllIII[1]];
                        nArray53[U.llIIIllIII[0]] = llIIIllIII[19];
                        Inventory.getFirst((int[])nArray53).interact(llIIIlIllI[llIIIllIII[300]]);
                        Time.sleepTicks((int)llIIIllIII[12]);
                        0;
                    }
                }
            }
            if (U.lIlIIllIllllI(e.j(llIIIllIII[14]), llIIIllIII[23]) && U.lIlIIllIIllII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            System.out.println("Setting: " + e.j(llIIIllIII[14]));
        }
        g.a(new String[llIIIllIII[0]]);
    }

    private static void lIlIIllIIlIIl() {
        llIIIllIII = new int[366];
        U.llIIIllIII[0] = (0x69 ^ 0x40) & ~(0xA0 ^ 0x89);
        U.llIIIllIII[1] = 1;
        U.llIIIllIII[2] = 2;
        U.llIIIllIII[3] = 0xFFFF97FF & 0x6DFF;
        U.llIIIllIII[4] = -(0xFFFFD7DF & 0x39F3) & (0xFFFFBFFF & 0x57D3);
        U.llIIIllIII[5] = -(0xFFFFF9FF & 0x16AC) & (0xFFFF97BF & 0x7EEB);
        U.llIIIllIII[6] = 0x31 ^ 3;
        U.llIIIllIII[7] = 3;
        U.llIIIllIII[8] = 0x67 ^ 0x7F;
        U.llIIIllIII[9] = 96 + 49 - 43 + 49 ^ 96 + 75 - 167 + 143;
        U.llIIIllIII[10] = 0x91 ^ 0x85;
        U.llIIIllIII[11] = 0xE8 ^ 0xB0 ^ (0xC0 ^ 0x9D);
        U.llIIIllIII[12] = 0x6C ^ 1 ^ (0x1A ^ 0x71);
        U.llIIIllIII[13] = 0x77 ^ 0x70;
        U.llIIIllIII[14] = (2 ^ 0x70) + (0xF8 ^ 0xB7) - (0x53 ^ 0x1C) + (0x5B ^ 0x65);
        U.llIIIllIII[15] = 0x66 ^ 0x2A ^ (0x17 ^ 0x7B);
        U.llIIIllIII[16] = 0x5D ^ 0x76 ^ (0x8C ^ 0xAF);
        U.llIIIllIII[17] = 156 + 107 - 181 + 86 ^ 33 + 121 - 153 + 160;
        U.llIIIllIII[18] = -(0xFFFFD7FE & 0x6C03) & (0xFFFFD7DB & 0x7FAD);
        U.llIIIllIII[19] = 0xFFFFFF57 & 0x1FEF;
        U.llIIIllIII[20] = 0xB4 ^ 0x83 ^ (0xA6 ^ 0x9E);
        U.llIIIllIII[21] = 0xFFFFBFD9 & 0x5F6F;
        U.llIIIllIII[22] = -(0xAC ^ 0x98) & (0xFFFFDFFB & 0x3F7F);
        U.llIIIllIII[23] = 0xB8 ^ 0x94 ^ (0x4C ^ 0x6A);
        U.llIIIllIII[24] = 0xFFFFAF3B & 0x56C7;
        U.llIIIllIII[25] = 23 + 184 - 54 + 57 ^ 16 + 76 - 37 + 81;
        U.llIIIllIII[26] = 60 + 39 - -33 + 52 ^ 77 + 122 - 20 + 0;
        U.llIIIllIII[27] = -(0x83 ^ 0xBF) & (0xFFFFF7FF & 0xBFB);
        U.llIIIllIII[28] = 0x5D ^ 0x6C ^ (0xAD ^ 0x90);
        U.llIIIllIII[29] = 0x21 ^ 0x2A ^ (0xB3 ^ 0xA9);
        U.llIIIllIII[30] = 0xFFFFEEFF & 0x17FF;
        U.llIIIllIII[31] = 0xFFFFF773 & 0xFFF;
        U.llIIIllIII[32] = 0xFFFF97AD & 0x697F;
        U.llIIIllIII[33] = -(0xFFFFF9BF & 0x164A) & (0xFFFFDFBF & 0x33FF);
        U.llIIIllIII[34] = -(0xFFFFFB75 & 0x76DB) & (0xFFFFFB7B & Short.MAX_VALUE);
        U.llIIIllIII[35] = -(0xFFFFFE5B & 0x71A7) & (0xFFFFFBFF & 0x7583);
        U.llIIIllIII[36] = 0xFFFFBF55 & 0x46AE;
        U.llIIIllIII[37] = 0xFFFFF357 & 0x3DF9;
        U.llIIIllIII[38] = 0x22 ^ 0x54 ^ (0xC4 ^ 0xBF);
        U.llIIIllIII[39] = -(0xFFFFFE6B & 0x739E) & (0xFFFFFB9D & Short.MAX_VALUE);
        U.llIIIllIII[40] = 0x10 ^ 0x66 ^ (0x55 ^ 0x2D);
        U.llIIIllIII[41] = -(0xFFFFC363 & 0x3EDD) & (0xFFFFBFDF & 0x73F7);
        U.llIIIllIII[42] = 0xFFFFFECB & 0x2FFE;
        U.llIIIllIII[43] = 0xB8 ^ 0xA8;
        U.llIIIllIII[44] = 0xFFFFEF37 & 0x15FD;
        U.llIIIllIII[45] = -(0xFFFFDAE3 & 0x377D) & (0xFFFFDBF2 & 0x3FEF);
        U.llIIIllIII[46] = -(0xFFFFD7A7 & 0x2C59) & (0xFFFFF7FF & 0xFE3);
        U.llIIIllIII[47] = 0xFFFFFFDC & 0x3ABB;
        U.llIIIllIII[48] = -3 & (0xFFFFEFFF & 0x1BFF);
        U.llIIIllIII[49] = -(0xFFFFFC67 & 0x33DB) & (0xFFFFBDFF & Short.MAX_VALUE);
        U.llIIIllIII[50] = 0x9F ^ 0x8D;
        U.llIIIllIII[51] = 99 + 90 - 159 + 111 ^ 45 + 67 - 92 + 138;
        U.llIIIllIII[52] = 0x55 ^ 0x7A ^ (0x16 ^ 0x2C);
        U.llIIIllIII[53] = 0x1C ^ 0xA;
        U.llIIIllIII[54] = 0xFFFFFEE8 & 0xFB7;
        U.llIIIllIII[55] = 0x5A ^ 0x63 ^ (0x5A ^ 0x74);
        U.llIIIllIII[56] = 0x5C ^ 0x45;
        U.llIIIllIII[57] = 0xF ^ 0x3B ^ (0x6F ^ 0x41);
        U.llIIIllIII[58] = 0x30 ^ 0x2B;
        U.llIIIllIII[59] = 0xFFFF8FBD & 0x7EE3;
        U.llIIIllIII[60] = 0x6D ^ 0x71;
        U.llIIIllIII[61] = 0x5D ^ 0x40;
        U.llIIIllIII[62] = -(0xFFFFFD7B & 0x33DD) & (0xFFFFFFFA & 0x3FFF);
        U.llIIIllIII[63] = 0x56 ^ 0x48;
        U.llIIIllIII[64] = -(0xFFFF9327 & 0x7CFA) & (0xFFFFFEFF & 0x1FBF);
        U.llIIIllIII[65] = 0x86 ^ 0x8D ^ (0x75 ^ 0x61);
        U.llIIIllIII[66] = 117 + 14 - 3 + 7 ^ 119 + 48 - 142 + 141;
        U.llIIIllIII[67] = 0xFFFF8EBF & 0x7FDF;
        U.llIIIllIII[68] = 0xB6 ^ 0x94;
        U.llIIIllIII[69] = 0x21 ^ 2;
        U.llIIIllIII[70] = 0x1E ^ 0x3A;
        U.llIIIllIII[71] = 89 + 123 - 180 + 146 ^ 72 + 73 - 144 + 150;
        U.llIIIllIII[72] = (0x29 ^ 0xE) + (0x67 ^ 0x69) - -(0x83 ^ 0xA1) + (0x71 ^ 0x2B);
        U.llIIIllIII[73] = -(0xFFFFECF8 & 0x3B9F) & (0xFFFFBFFF & 0x6FBF);
        U.llIIIllIII[74] = 0x67 ^ 0x30 ^ (0x47 ^ 0x36);
        U.llIIIllIII[75] = -(0xFFFFE53E & 0x5EE3) & (0xFFFFCFEF & 0x7FF7);
        U.llIIIllIII[76] = 0xFFFFFFBD & 0xDEF;
        U.llIIIllIII[77] = 8 ^ 0x2F;
        U.llIIIllIII[78] = (6 ^ 0x20) & ~(0x82 ^ 0xA4) ^ (0xF ^ 0x27);
        U.llIIIllIII[79] = 0x4B ^ 0x62;
        U.llIIIllIII[80] = 0x23 ^ 9;
        U.llIIIllIII[81] = -(0xFFFFB35F & 0x5DF9) & (0xFFFFBFFF & 0x5FFE);
        U.llIIIllIII[82] = 0x41 ^ 0x6A;
        U.llIIIllIII[83] = 0xFFFFAEAD & 0x5FF7;
        U.llIIIllIII[84] = 0x6A ^ 0 ^ (0x40 ^ 6);
        U.llIIIllIII[85] = 0xFFFFBBFD & 0x4FEB;
        U.llIIIllIII[86] = 0xFFFFAFF7 & 0x7678;
        U.llIIIllIII[87] = 0x3D ^ 0x10;
        U.llIIIllIII[88] = 28 + 115 - 112 + 102 ^ 83 + 84 - 86 + 90;
        U.llIIIllIII[89] = 0xBE ^ 0x91;
        U.llIIIllIII[90] = 117 + 110 - 191 + 104 ^ 66 + 58 - -55 + 9;
        U.llIIIllIII[91] = 14 + 128 - 110 + 99 ^ 83 + 134 - 190 + 151;
        U.llIIIllIII[92] = 0xA0 ^ 0x93;
        U.llIIIllIII[93] = 147 + 91 - 133 + 55 ^ 78 + 69 - 102 + 103;
        U.llIIIllIII[94] = 0x4D ^ 0x78;
        U.llIIIllIII[95] = 0x45 ^ 0x73;
        U.llIIIllIII[96] = 27 + 20 - -13 + 73 ^ 31 + 123 - 78 + 102;
        U.llIIIllIII[97] = 85 + 146 - 225 + 150 ^ 27 + 43 - 31 + 125;
        U.llIIIllIII[98] = 0xC4 ^ 0x8C ^ (0x45 ^ 0x34);
        U.llIIIllIII[99] = 0x41 ^ 0x7B;
        U.llIIIllIII[100] = 3 ^ 4 ^ (0x6E ^ 0x52);
        U.llIIIllIII[101] = 0x77 ^ 0x4B;
        U.llIIIllIII[102] = 112 + 80 - 63 + 42 ^ 127 + 142 - 189 + 70;
        U.llIIIllIII[103] = 6 ^ 0x1C ^ (0x41 ^ 0x65);
        U.llIIIllIII[104] = 0x41 ^ 0x7E;
        U.llIIIllIII[105] = 0xC3 ^ 0x83;
        U.llIIIllIII[106] = 3 ^ (0x5E ^ 0x1C);
        U.llIIIllIII[107] = 0x2E ^ 0x1E ^ (0xD9 ^ 0xAB);
        U.llIIIllIII[108] = 136 + 202 - 267 + 155 ^ 61 + 121 - 45 + 24;
        U.llIIIllIII[109] = 0x4A ^ 0x57 ^ (0xE8 ^ 0xB1);
        U.llIIIllIII[110] = 0xE2 ^ 0xA7;
        U.llIIIllIII[111] = 0x44 ^ 2;
        U.llIIIllIII[112] = 0x69 ^ 0x5D ^ (0x36 ^ 0x45);
        U.llIIIllIII[113] = 0x64 ^ 0x3F ^ (0x8A ^ 0x99);
        U.llIIIllIII[114] = 0x3E ^ 0x77;
        U.llIIIllIII[115] = 0xC3 ^ 0x89;
        U.llIIIllIII[116] = 0x22 ^ 0x69;
        U.llIIIllIII[117] = 0x14 ^ 0x58;
        U.llIIIllIII[118] = 226 + 219 - 410 + 209 ^ 119 + 164 - 144 + 46;
        U.llIIIllIII[119] = 0x14 ^ 0x75 ^ (7 ^ 0x28);
        U.llIIIllIII[120] = 0xA ^ 0x19 ^ (0xD2 ^ 0x8E);
        U.llIIIllIII[121] = 0xF ^ 0x5F;
        U.llIIIllIII[122] = 0x71 ^ 0x79 ^ (0x56 ^ 0xF);
        U.llIIIllIII[123] = 0xC1 ^ 0x93;
        U.llIIIllIII[124] = 221 + 164 - 301 + 147 ^ 85 + 138 - 91 + 48;
        U.llIIIllIII[125] = 0x6F ^ 0x6B ^ (8 ^ 0x58);
        U.llIIIllIII[126] = 0xC4 ^ 0x91;
        U.llIIIllIII[127] = 0x78 ^ 0x2E;
        U.llIIIllIII[128] = 7 + 64 - 44 + 171 ^ 21 + 47 - 55 + 132;
        U.llIIIllIII[129] = 0x55 ^ 0xD;
        U.llIIIllIII[130] = 0x62 ^ 0x4F ^ (0x16 ^ 0x62);
        U.llIIIllIII[131] = 0x74 ^ 0x2F;
        U.llIIIllIII[132] = 0xB6 ^ 0x85 ^ (0x39 ^ 0x56);
        U.llIIIllIII[133] = 0x40 ^ 0x19 ^ (0xC3 ^ 0xC7);
        U.llIIIllIII[134] = 0xD4 ^ 0x8A;
        U.llIIIllIII[135] = 4 ^ 0x5B;
        U.llIIIllIII[136] = 103 + 196 - 291 + 243 ^ 76 + 54 - 7 + 32;
        U.llIIIllIII[137] = 193 + 129 - 296 + 223 ^ 32 + 2 - -36 + 82;
        U.llIIIllIII[138] = -(0xFFFFE7B7 & 0x3C7C) & (0xFFFFAFF7 & Short.MAX_VALUE);
        U.llIIIllIII[139] = -(0xFFFFB5DB & 0x6BA7) & (0xFFFFBDF7 & 0x6FFF);
        U.llIIIllIII[140] = 0x7B ^ 0x18 ^ 1;
        U.llIIIllIII[141] = 0x74 ^ 0x17;
        U.llIIIllIII[142] = 0xC4 ^ 0xA0;
        U.llIIIllIII[143] = 0x1D ^ 0x78;
        U.llIIIllIII[144] = 0x74 ^ 0x12;
        U.llIIIllIII[145] = 0xE2 ^ 0x85;
        U.llIIIllIII[146] = 0x21 ^ 0x49;
        U.llIIIllIII[147] = 0xAE ^ 0xC7;
        U.llIIIllIII[148] = 0x3E ^ 0x2E ^ (0xC7 ^ 0xBD);
        U.llIIIllIII[149] = 0xFFFF9BEE & 0x6F7B;
        U.llIIIllIII[150] = -(0xFFFFFFBB & 0x334D) & (0xFFFFFFFF & 0x3FAE);
        U.llIIIllIII[151] = -(0xFFFFC78A & 0x7CF7) & (0xFFFFFFEF & 0x4FF5);
        U.llIIIllIII[152] = -(0xFFFFF8D7 & 0x573B) & (0xFFFFFDFF & 0x77B6);
        U.llIIIllIII[153] = -(0xFFFFFA87 & 0x757B) & (0xFFFFFB7F & Short.MAX_VALUE);
        U.llIIIllIII[154] = -(0xFFFFD1BB & 0x6E47) & (0xFFFFCDBE & 0x7EF3);
        U.llIIIllIII[155] = 15 + 162 - 8 + 6 ^ 67 + 114 - 51 + 66;
        U.llIIIllIII[156] = 8 ^ 0x64;
        U.llIIIllIII[157] = 138 + 150 - 199 + 110 ^ 62 + 12 - -82 + 14;
        U.llIIIllIII[158] = -(0xB9 ^ 0xAA) & (0xFFFF9BFB & 0x6F7F);
        U.llIIIllIII[159] = 0xFFFFAEFA & 0x5DB7;
        U.llIIIllIII[160] = 0xFFFFBBEF & 0x4F7B;
        U.llIIIllIII[161] = 0xFFFF8FBF & 0x7CF7;
        U.llIIIllIII[162] = -(0xFFFFFFFB & 0x31A5) & (0xFFFFF7A7 & 0x3FFF);
        U.llIIIllIII[163] = -(0xFFFFF8CF & 0x27BD) & (0xFFFFBBFF & 0x6FFE);
        U.llIIIllIII[164] = 0xFFFFFDE5 & 0xEBF;
        U.llIIIllIII[165] = 0x77 ^ 0x19;
        U.llIIIllIII[166] = 0xFFFF8FE3 & 0x7F9D;
        U.llIIIllIII[167] = 159 + 7 - 20 + 53 ^ 129 + 152 - 115 + 2;
        U.llIIIllIII[168] = 8 ^ 0x24 ^ (0x71 ^ 0x2D);
        U.llIIIllIII[169] = 0xFFFFEFEF & 0x1B7E;
        U.llIIIllIII[170] = -(0xFFFFDDEB & 0x735D) & (0xFFFFDDFF & 0x7FFD);
        U.llIIIllIII[171] = 0x1F ^ 0x21 ^ (0x36 ^ 0x79);
        U.llIIIllIII[172] = 0xB4 ^ 0xC6;
        U.llIIIllIII[173] = 0x79 ^ 0xA;
        U.llIIIllIII[174] = 0xE1 ^ 0x95;
        U.llIIIllIII[175] = 0xE7 ^ 0x9D ^ (0x38 ^ 0x37);
        U.llIIIllIII[176] = 0xFFFFCF7B & 0x3BFC;
        U.llIIIllIII[177] = -(0xFFFFF33C & 0xFDF) & (0xFFFFFFBF & 0xFFF);
        U.llIIIllIII[178] = 0xFFFFFE4D & 0x7BA;
        U.llIIIllIII[179] = 0x1F ^ 0x69;
        U.llIIIllIII[180] = -(0xC ^ 0x7D) & (0xFFFFDFFF & 0x2FF7);
        U.llIIIllIII[181] = 0x7C ^ 0x72 ^ (0x4B ^ 0x32);
        U.llIIIllIII[182] = 0xEA ^ 0x92;
        U.llIIIllIII[183] = 0xFFFFBB7B & 0x4FF7;
        U.llIIIllIII[184] = -(0xFFFFDF9F & 0x3162) & (0xFFFF9DFF & 0x7FB5);
        U.llIIIllIII[185] = 2 ^ 0x7B;
        U.llIIIllIII[186] = 0xF0 ^ 0x8A;
        U.llIIIllIII[187] = 0x77 ^ 0xC;
        U.llIIIllIII[188] = 0xF0 ^ 0x8C;
        U.llIIIllIII[189] = -(0xFFFFE5A1 & 0x7BFF) & (0xFFFFEFB9 & 0x77EF);
        U.llIIIllIII[190] = 0x4A ^ 0x3E ^ (0x23 ^ 0x2A);
        U.llIIIllIII[191] = 0xFFFFCFBD & 0x3FC6;
        U.llIIIllIII[192] = 0xE3 ^ 0x9D;
        U.llIIIllIII[193] = 11 + 6 - -81 + 29;
        U.llIIIllIII[194] = -(0xFFFFBFE3 & 0x649F) & (0xFFFFAFEF & 0x7FFE);
        U.llIIIllIII[195] = 120 + 67 - 94 + 35;
        U.llIIIllIII[196] = (0x1E ^ 0x5F) + (0xBD ^ 0xB1) - (0x8B ^ 0x97) + (0xEA ^ 0xBA);
        U.llIIIllIII[197] = (0x1D ^ 0xB) + (0xF6 ^ 0x97) - (1 ^ 0x1A) + (0x8D ^ 0xAB);
        U.llIIIllIII[198] = (0x1B ^ 0x40) + (0x12 ^ 0x2B) - (0x1E ^ 0x2F) + (0x3F ^ 0x1F);
        U.llIIIllIII[199] = -(0xFFFFA8D7 & 0x77AD) & (0xFFFFEFFF & 0x3BFF);
        U.llIIIllIII[200] = 0xFFFFAEBD & 0x5DEA;
        U.llIIIllIII[201] = (0xBD ^ 0x82) + (0xC9 ^ 0xC4) - (0xA ^ 0x15) + (0xF6 ^ 0xA1);
        U.llIIIllIII[202] = 83 + 117 - 182 + 115;
        U.llIIIllIII[203] = 0xFFFFEDFC & 0x37B7;
        U.llIIIllIII[204] = 0xFFFF8BF5 & 0x7F7F;
        U.llIIIllIII[205] = -(0x1D ^ 0x4C) & (0xFFFFF7FF & 0x2DFE);
        U.llIIIllIII[206] = -(0xFFFFDFD5 & 0x383B) & (0xFFFFFDBB & 0x3FFF);
        U.llIIIllIII[207] = -(0xFFFFFDF7 & 0x7B7D) & (0xFFFFFF7E & Short.MAX_VALUE);
        U.llIIIllIII[208] = 29 + 45 - 30 + 90;
        U.llIIIllIII[209] = -(0xFFFFF6D7 & 0x393B) & (0xFFFFFFFE & 0x3F9F);
        U.llIIIllIII[210] = (0x68 ^ 0x3E) + (0x6A ^ 0x23) - (0xE8 ^ 0xB6) + (0x32 ^ 0x74);
        U.llIIIllIII[211] = 120 + 115 - 231 + 132;
        U.llIIIllIII[212] = -(0xFFFFBB17 & 0x5EFA) & (0xFFFFBFBF & 0x7FFD);
        U.llIIIllIII[213] = (0x64 ^ 0x18) + (40 + 123 - 158 + 128) - (67 + 83 - 17 + 50) + (0x83 ^ 0xBC);
        U.llIIIllIII[214] = 5 + 98 - 63 + 95 + (0x3C ^ 0x33) - (0xAA ^ 0xB9) + (0x99 ^ 0x9E);
        U.llIIIllIII[215] = 132 + 30 - 103 + 80;
        U.llIIIllIII[216] = -(0xFFFFCDB5 & 0x3ADF) & (0xFFFFBFFF & 0x4E9F);
        U.llIIIllIII[217] = 5 + 32 - -18 + 85;
        U.llIIIllIII[218] = -(0xFFFFFDEB & 0x72DD) & (0xFFFFF3FF & Short.MAX_VALUE);
        U.llIIIllIII[219] = 20 + 92 - 30 + 55 + (0x2E ^ 0x40) - (44 + 154 - 108 + 71) + (0x29 ^ 0x1E);
        U.llIIIllIII[220] = (0xFE ^ 0x8E) + (0x34 ^ 0x68) - (29 + 33 - -24 + 46) + (0xC2 ^ 0x84);
        U.llIIIllIII[221] = -(0xFFFFE50D & 0x5AFB) & (0xFFFFCF7F & 0x7BF9);
        U.llIIIllIII[222] = 0xFFFFB5B7 & 0x6FFB;
        U.llIIIllIII[223] = 6 + 75 - 34 + 96;
        U.llIIIllIII[224] = 81 + 38 - 99 + 124;
        U.llIIIllIII[225] = 4 + 20 - -120 + 1;
        U.llIIIllIII[226] = 28 + 77 - 94 + 135;
        U.llIIIllIII[227] = 0xFFFFF73E & 0xECD;
        U.llIIIllIII[228] = (0x67 ^ 0x45) + (120 + 127 - 129 + 11) - (75 + 2 - -4 + 56) + (0xF ^ 0x76);
        U.llIIIllIII[229] = (0x1D ^ 0x39) + (0x5D ^ 0x27) - (0x1F ^ 0x66) + (0x6C ^ 3);
        U.llIIIllIII[230] = -(0xFFFFDA79 & 0x3F87) & (0xFFFFBFFF & 0x7FB7);
        U.llIIIllIII[231] = (0x3A ^ 0x75) + (0x38 ^ 0x6B) - (0x2F ^ 0x6D) + (0x1F ^ 0x2A);
        U.llIIIllIII[232] = 129 + 13 - 20 + 28;
        U.llIIIllIII[233] = 77 + 34 - 104 + 129 + (0x90 ^ 0xBA) - (0xFE ^ 0xA2) + (0xEF ^ 0xAE);
        U.llIIIllIII[234] = (0xED ^ 0xC3) + (0xCA ^ 0xBF) - (0x5F ^ 0x21) + (0x20 ^ 0x53);
        U.llIIIllIII[235] = 49 + 151 - 172 + 125;
        U.llIIIllIII[236] = (0x5B ^ 0x53) + (47 + 13 - -53 + 21) - (0x62 ^ 0x6E) + (0x76 ^ 0x6E);
        U.llIIIllIII[237] = 14 + 86 - 26 + 81;
        U.llIIIllIII[238] = 28 + 83 - -11 + 27 + (14 + 79 - 81 + 136) - (0xFFFF8BDC & 0x753F) + (79 + 103 - 147 + 108);
        U.llIIIllIII[239] = 103 + 116 - 141 + 79;
        U.llIIIllIII[240] = (0x69 ^ 0x52) + (0x47 ^ 0x3C) - (157 + 53 - 175 + 129) + (69 + 60 - 79 + 90);
        U.llIIIllIII[241] = (0x89 ^ 0xB8) + (0x12 ^ 0x5C) - (0xB4 ^ 0xC6) + (141 + 89 - 102 + 18);
        U.llIIIllIII[242] = (0x87 ^ 0xB2) + (0x4B ^ 0xE) - -(0x26 ^ 4) + (0x83 ^ 0x87);
        U.llIIIllIII[243] = 140 + 102 - 173 + 92;
        U.llIIIllIII[244] = 93 + 121 - 170 + 97 + (0xFC ^ 0xB7) - (0x34 ^ 0x7E) + (0x7B ^ 0x6F);
        U.llIIIllIII[245] = 107 + 149 - 214 + 121;
        U.llIIIllIII[246] = 35 + 25 - 53 + 144 + (0x60 ^ 0x3C) - (132 + 119 - 122 + 12) + (0x16 ^ 0x28);
        U.llIIIllIII[247] = 38 + 161 - 171 + 137;
        U.llIIIllIII[248] = 122 + 23 - 20 + 41;
        U.llIIIllIII[249] = (0x20 ^ 0x5B) + (55 + 42 - 63 + 108) - (107 + 0 - 75 + 164) + (0xE7 ^ 0x85);
        U.llIIIllIII[250] = 73 + 71 - 22 + 41 + (0x90 ^ 0x9B) - (0x6C ^ 0x44) + (0x30 ^ 0x12);
        U.llIIIllIII[251] = 142 + 46 - 63 + 44;
        U.llIIIllIII[252] = 136 + 54 - 132 + 112;
        U.llIIIllIII[253] = (0x48 ^ 0) + (0xBA ^ 0x98) - -(0x2B ^ 0x33) + (0x21 ^ 8);
        U.llIIIllIII[254] = 30 + 101 - -9 + 32;
        U.llIIIllIII[255] = 18 + 13 - -24 + 89 + (0x12 ^ 0x57) - (58 + 93 - 126 + 110) + (0xC4 ^ 0x9B);
        U.llIIIllIII[256] = (0x1B ^ 0xE) + (59 + 0 - -20 + 80) - (0xD0 ^ 0xB2) + (0x4B ^ 0x17);
        U.llIIIllIII[257] = 8 + 29 - -95 + 43;
        U.llIIIllIII[258] = 0xFFFFCDDF & 0x3E3A;
        U.llIIIllIII[259] = -(0xFFFF9D4E & 0x63F7) & (0xFFFFFFFF & 0xDFF);
        U.llIIIllIII[260] = (0x1B ^ 0x79) + (0xB1 ^ 0x85) - (0x22 ^ 0x5E) + (144 + 91 - 94 + 11);
        U.llIIIllIII[261] = 112 + 122 - 131 + 76;
        U.llIIIllIII[262] = 96 + 166 - 133 + 51;
        U.llIIIllIII[263] = 76 + 56 - 5 + 54;
        U.llIIIllIII[264] = (0xC0 ^ 0xA8) + (0x5F ^ 0x58) - (0x34 ^ 0x7D) + (50 + 21 - -32 + 41);
        U.llIIIllIII[265] = (0x23 ^ 0x15) + (0x8B ^ 0x8D) - -(0x2B ^ 2) + (0x2F ^ 0x7D);
        U.llIIIllIII[266] = (0xE7 ^ 0x9A) + (0xB3 ^ 0x8B) - (0x39 ^ 7) + (0xE0 ^ 0xA1);
        U.llIIIllIII[267] = 139 + 118 - 216 + 101 + (0xC ^ 0x56) - (148 + 75 - 132 + 101) + (138 + 74 - 125 + 58);
        U.llIIIllIII[268] = 47 + 11 - 3 + 131;
        U.llIIIllIII[269] = -(0xFFFFFEF7 & 0x71EE) & (0xFFFFFFEF & 0x7BFD);
        U.llIIIllIII[270] = -(0xFFFF97E9 & 0x7A37) & (0xFFFFBFF7 & 0x77BF);
        U.llIIIllIII[271] = -(0xFFFFDEEB & 0x753D) & (0xFFFFFF3F & 0x5FFA);
        U.llIIIllIII[272] = 56 + 11 - -51 + 69;
        U.llIIIllIII[273] = 83 + 52 - 8 + 13 + (130 + 125 - 160 + 60) - (25 + 27 - 25 + 133) + (0x64 ^ 0x51);
        U.llIIIllIII[274] = 41 + 39 - 4 + 113;
        U.llIIIllIII[275] = 148 + 99 - 244 + 187;
        U.llIIIllIII[276] = 0xFFFFDFBF & 0x2B5D;
        U.llIIIllIII[277] = 116 + 114 - 206 + 133 + (0x66 ^ 0x5C) - (116 + 173 - 230 + 117) + (27 + 127 - 83 + 81);
        U.llIIIllIII[278] = (0xDC ^ 0x96) + (3 + 140 - 97 + 115) - (152 + 142 - 175 + 40) + (0xD4 ^ 0xA0);
        U.llIIIllIII[279] = 87 + 123 - 152 + 75 + (3 ^ 0x43) - (0x24 ^ 5) + (0x92 ^ 0x8F);
        U.llIIIllIII[280] = 78 + 45 - 87 + 158;
        U.llIIIllIII[281] = 115 + 10 - 55 + 125;
        U.llIIIllIII[282] = 77 + 140 - 193 + 172;
        U.llIIIllIII[283] = 58 + 18 - -68 + 53;
        U.llIIIllIII[284] = 6 + 36 - 15 + 171;
        U.llIIIllIII[285] = 174 + 169 - 220 + 76;
        U.llIIIllIII[286] = 83 + 22 - 39 + 121 + (131 + 190 - 251 + 125) - (0xFFFFC178 & 0x3FBF) + (23 + 25 - -70 + 12);
        U.llIIIllIII[287] = (0x64 ^ 0x28) + (0xBE ^ 0xAC) - (0x1B ^ 0x52) + (165 + 46 - 134 + 103);
        U.llIIIllIII[288] = 74 + 35 - 24 + 117;
        U.llIIIllIII[289] = 65 + 41 - -26 + 71;
        U.llIIIllIII[290] = 41 + 45 - -23 + 95;
        U.llIIIllIII[291] = 0xFFFFFFFF & 0xF8D;
        U.llIIIllIII[292] = 55 + 17 - 7 + 79 + 1 - (0x31 ^ 0x5E) + (136 + 151 - 240 + 124);
        U.llIIIllIII[293] = 117 + 131 - 107 + 65;
        U.llIIIllIII[294] = -1;
        U.llIIIllIII[295] = 145 + 160 - 101 + 3;
        U.llIIIllIII[296] = 102 + 42 - 37 + 101;
        U.llIIIllIII[297] = 1 + 25 - -160 + 9 + (5 + 0 - -24 + 145) - (13 + 54 - -99 + 66) + (0x19 ^ 0x51);
        U.llIIIllIII[298] = (0xCD ^ 0xAD) + (26 + 96 - 109 + 164) - (0xE0 ^ 0x88) + (0x3F ^ 0x16);
        U.llIIIllIII[299] = 80 + 40 - 51 + 142;
        U.llIIIllIII[300] = 158 + 4 - 14 + 38 + (4 + 19 - -53 + 64) - (22 + 120 - 3 + 62) + (0x20 ^ 0x77);
        U.llIIIllIII[301] = 14 + 8 - -82 + 109;
        U.llIIIllIII[302] = 160 + 155 - 201 + 100;
        U.llIIIllIII[303] = 52 + 32 - 81 + 212;
        U.llIIIllIII[304] = 179 + 192 - 291 + 116 + (0x55 ^ 0x52) - (97 + 38 - -46 + 3) + (33 + 162 - 66 + 68);
        U.llIIIllIII[305] = 0xFFFFE71F & 0x1EE2;
        U.llIIIllIII[306] = (0x90 ^ 0xAF) + (0xF7 ^ 0x81) - (0x6B ^ 0x38) + (0x75 ^ 2);
        U.llIIIllIII[307] = 57 + 57 - 109 + 188 + (0x5A ^ 0x3A) - (49 + 134 - 103 + 59) + (0xCC ^ 0x88);
        U.llIIIllIII[308] = 139 + 171 - 133 + 42;
        U.llIIIllIII[309] = 0xFFFFBFE9 & 0x43FE;
        U.llIIIllIII[310] = -(0xFFFFA9FF & 0x7756) & (0xFFFFEFF7 & 0x7F7D);
        U.llIIIllIII[311] = -(0xFFFFC9C2 & 0x3E7F) & (0xFFFFFBFF & 0x6DE9);
        U.llIIIllIII[312] = 0xFFFF8EFB & 0xF9BC;
        U.llIIIllIII[313] = -(0xFFFF9773 & 0x799E) & (0xFFFFFFDD & 0x3FFF);
        U.llIIIllIII[314] = 0xFFFFE7DD & 0x1D36;
        U.llIIIllIII[315] = 43 + 212 - 150 + 115;
        U.llIIIllIII[316] = 95 + 208 - 127 + 45;
        U.llIIIllIII[317] = (0xEF ^ 0xBF) + (0x53 ^ 0x56) - (0xA3 ^ 0x90) + (92 + 66 - 103 + 133);
        U.llIIIllIII[318] = (0xDE ^ 0x9C) + (0xA9 ^ 0x98) - (0x70 ^ 0x5D) + (14 + 26 - -29 + 84);
        U.llIIIllIII[319] = 138 + 34 - 111 + 163;
        U.llIIIllIII[320] = (0xA6 ^ 0x92) + (0x2B ^ 0x65) - -(0xEC ^ 0xB8) + (0xCB ^ 0xC0);
        U.llIIIllIII[321] = 20 + 98 - 112 + 122 + (18 + 83 - -82 + 37) - (0xFFFFAB7B & 0x5596) + (49 + 137 - 66 + 32);
        U.llIIIllIII[322] = 35 + 196 - 228 + 224;
        U.llIIIllIII[323] = 27 + 112 - -38 + 51;
        U.llIIIllIII[324] = 1 + (0x58 ^ 0x4B) - -(159 + 182 - 136 + 1) + 3;
        U.llIIIllIII[325] = 135 + 181 - 119 + 33;
        U.llIIIllIII[326] = (0x9F ^ 0x80) + (179 + 221 - 213 + 36) - (0x80 ^ 0xB6) + (0x3E ^ 0x21);
        U.llIIIllIII[327] = 154 + 17 - 145 + 206;
        U.llIIIllIII[328] = (0x43 ^ 0xB) + (0x59 ^ 0x4A) - (0x8E ^ 0x9B) + (146 + 127 - 271 + 161);
        U.llIIIllIII[329] = 111 + 108 - 103 + 118;
        U.llIIIllIII[330] = 107 + 204 - 217 + 141;
        U.llIIIllIII[331] = 226 + 232 - 377 + 155;
        U.llIIIllIII[332] = 214 + 96 - 212 + 139;
        U.llIIIllIII[333] = 8 + 67 - 67 + 230;
        U.llIIIllIII[334] = 87 + 15 - 48 + 185;
        U.llIIIllIII[335] = 176 + 206 - 208 + 66;
        U.llIIIllIII[336] = 8 + 21 - -120 + 14 + (13 + 7 - -104 + 26) - (104 + 139 - 139 + 39) + (0x6B ^ 0x2C);
        U.llIIIllIII[337] = 78 + 20 - 34 + 99 + (0x46 ^ 0x5D) - (134 + 25 - 71 + 71) + (154 + 185 - 329 + 201);
        U.llIIIllIII[338] = 225 + 172 - 330 + 176;
        U.llIIIllIII[339] = 51 + 43 - -65 + 85;
        U.llIIIllIII[340] = 96 + 108 - 196 + 237;
        U.llIIIllIII[341] = -(0xFFFFFDB7 & 0x7249) & (0xFFFFFC77 & Short.MAX_VALUE);
        U.llIIIllIII[342] = -(0xFFFFB5EF & 0x6AD9) & (0xFFFFEFEB & 0x3DFE);
        U.llIIIllIII[343] = -(0xFFFFAC0B & 0x77F7) & (0xFFFFEFFE & 0x3FFF);
        U.llIIIllIII[344] = -(0xFFFFEBDB & 0x7425) & (0xFFFFEDBE & Short.MAX_VALUE);
        U.llIIIllIII[345] = 0xFFFFBCCF & 0x4FBA;
        U.llIIIllIII[346] = 0xFFFFDE9E & 0x2DF7;
        U.llIIIllIII[347] = 0xFFFFAFFF & 0x5BE6;
        U.llIIIllIII[348] = 0xFFFFBD97 & 0x4EEB;
        U.llIIIllIII[349] = 113 + 78 - 69 + 12 + (58 + 132 - 131 + 153) - (101 + 120 - 152 + 71) + (0x6D ^ 0x45);
        U.llIIIllIII[350] = 219 + 126 - 284 + 186;
        U.llIIIllIII[351] = 44 + 231 - 244 + 217;
        U.llIIIllIII[352] = 204 + 4 - 134 + 175;
        U.llIIIllIII[353] = (0xEC ^ 0xB2) + (0x4A ^ 0x53) - -(7 ^ 0x6B) + (0x24 ^ 0x33);
        U.llIIIllIII[354] = 95 + 133 - 190 + 213;
        U.llIIIllIII[355] = (0x31 ^ 0x14) + (93 + 51 - 74 + 77) - (0x6A ^ 0x2D) + (95 + 19 - 20 + 45);
        U.llIIIllIII[356] = 112 + 231 - 93 + 3;
        U.llIIIllIII[357] = (0x3F ^ 0x73) + (38 + 27 - 5 + 80) - (98 + 63 - 141 + 126) + (82 + 53 - -35 + 14);
        U.llIIIllIII[358] = 115 + 64 - 85 + 61 + (0x5F ^ 0x27) - (3 + 200 - 77 + 78) + (170 + 181 - 254 + 87);
        U.llIIIllIII[359] = 0xFFFFC961 & 0x379E;
        U.llIIIllIII[360] = 0xFFFFC9E5 & 0x371B;
        U.llIIIllIII[361] = 0xFFFFC99E & 0x3763;
        U.llIIIllIII[362] = 0xFFFFF12F & 0xFD3;
        U.llIIIllIII[363] = -(0xFFFFEBB7 & 0x7CFC) & (0xFFFFE9BF & 0x7FF7);
        U.llIIIllIII[364] = 0xFFFFC185 & 0x3F7F;
        U.llIIIllIII[365] = 0xFFFF89C6 & 0x773F;
    }

    @Override
    public boolean ae() {
        return llIIIllIII[0];
    }

    private static boolean lIlIIllIlllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIllIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIllIIIIlI(String llllllllllllllllllIlIllIlIIllIIl, String llllllllllllllllllIlIllIlIIlIllI) {
        try {
            SecretKeySpec llllllllllllllllllIlIllIlIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIllIlIIlIllI.getBytes(StandardCharsets.UTF_8)), llIIIllIII[16]), "DES");
            Cipher llllllllllllllllllIlIllIlIIllIll = Cipher.getInstance("DES");
            llllllllllllllllllIlIllIlIIllIll.init(llIIIllIII[2], llllllllllllllllllIlIllIlIIlllII);
            return new String(llllllllllllllllllIlIllIlIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIllIlIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIllIlIIllIlI) {
            llllllllllllllllllIlIllIlIIllIlI.printStackTrace();
            return null;
        }
    }

    @Override
    public int af() {
        try {
            U.dD();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 == 0) {
            return (0x1F ^ 0x2D) & ~(0x40 ^ 0x72);
        }
        return llIIIllIII[142];
    }

    private static boolean lIlIIlllIIIII(Object object) {
        return object == null;
    }

    private static String lIlIIllIIIIll(String llllllllllllllllllIlIllIlIllIllI, String llllllllllllllllllIlIllIlIllIlIl) {
        llllllllllllllllllIlIllIlIllIllI = new String(Base64.getDecoder().decode(llllllllllllllllllIlIllIlIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIllIlIlllIIl = new StringBuilder();
        char[] llllllllllllllllllIlIllIlIlllIII = llllllllllllllllllIlIllIlIllIlIl.toCharArray();
        int llllllllllllllllllIlIllIlIllIlll = llIIIllIII[0];
        char[] llllllllllllllllllIlIllIlIllIIIl = llllllllllllllllllIlIllIlIllIllI.toCharArray();
        int llllllllllllllllllIlIllIlIllIIII = llllllllllllllllllIlIllIlIllIIIl.length;
        int llllllllllllllllllIlIllIlIlIllll = llIIIllIII[0];
        while (U.lIlIIllIIllll(llllllllllllllllllIlIllIlIlIllll, llllllllllllllllllIlIllIlIllIIII)) {
            char llllllllllllllllllIlIllIlIllllII = llllllllllllllllllIlIllIlIllIIIl[llllllllllllllllllIlIllIlIlIllll];
            llllllllllllllllllIlIllIlIlllIIl.append((char)(llllllllllllllllllIlIllIlIllllII ^ llllllllllllllllllIlIllIlIlllIII[llllllllllllllllllIlIllIlIllIlll % llllllllllllllllllIlIllIlIlllIII.length]));
            0;
            ++llllllllllllllllllIlIllIlIllIlll;
            ++llllllllllllllllllIlIllIlIlIllll;
            0;
            if (-1 <= 3) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIlIllIlIlllIIl);
    }
}

