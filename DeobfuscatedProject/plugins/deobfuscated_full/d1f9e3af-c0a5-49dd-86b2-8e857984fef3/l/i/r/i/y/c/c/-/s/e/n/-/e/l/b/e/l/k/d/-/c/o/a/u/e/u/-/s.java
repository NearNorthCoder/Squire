/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.A;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.E;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.F;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.N;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.ah;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.am;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.m;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.n;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.r;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.t;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.y;
import net.runelite.api.Locatable;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
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
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

public class s
implements W {
    static /* synthetic */ WorldArea cq;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ int cl;
    static /* synthetic */ WorldPoint bX;
    private static /* synthetic */ String cu;
    static /* synthetic */ boolean cm;
    static /* synthetic */ WorldArea co;
    static /* synthetic */ WorldPoint cs;
    static /* synthetic */ WorldArea cp;
    static /* synthetic */ WorldPoint cr;
    private static /* synthetic */ int ct;
    private static /* synthetic */ int[] lIIIllIIl;
    private static /* synthetic */ String[] lIIIllIII;
    public static /* synthetic */ boolean bt;

    private static int lllIlIIIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lllIlIlIIlI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public String U() {
        if (s.lllIlIlIIlI(cu, lIIIllIII[lIIIllIIl[159]])) {
            return lIIIllIII[lIIIllIIl[160]];
        }
        return "Animal Magnetism - " + cu;
    }

    private static boolean lllIlIIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIlIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int T() {
        try {
            s.aI();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((65 + 79 - 41 + 58 ^ 91 + 113 - 176 + 137) == 0) {
            return (125 + 19 - 26 + 105 ^ 53 + 155 - 70 + 20) & (207 + 189 - 372 + 194 ^ 149 + 122 - 249 + 133 ^ -1);
        }
        return lIIIllIIl[100];
    }

    private static void aJ() {
        WorldArea worldArea = new WorldArea(lIIIllIIl[52], lIIIllIIl[56], lIIIllIIl[16], lIIIllIIl[4], lIIIllIIl[1]);
        if (s.lllIlIIIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIIl[0]];
            stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[142]];
            TileObjects.getNearest((String[])stringArray).interact(lIIIllIII[lIIIllIIl[143]]);
            Time.sleepTicks((int)lIIIllIIl[9]);
            0;
        }
        if (s.lllIlIIlIIl(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllIIl[21])) {
            AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[144]];
            if (s.lllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)bX);
            0;
            Time.sleepTicks((int)lIIIllIIl[0]);
            0;
        }
        if (s.lllIlIIIlll(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllIIl[21])) {
            g.a(lIIIllIII[lIIIllIIl[145]], bR);
        }
        if (s.lllIlIIIlll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIllIIl[52], lIIIllIIl[53], lIIIllIIl[1])) ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIIl[0]];
            stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[99]];
            TileObjects.getNearest((String[])stringArray).interact(lIIIllIII[lIIIllIIl[146]]);
            Time.sleepTicks((int)lIIIllIIl[9]);
            0;
        }
    }

    private static void af() {
        block46: {
            d lIIIlllIIlIIlII;
            block45: {
                block44: {
                    block43: {
                        Object lIIIlllIIlIIlIl;
                        block42: {
                            block41: {
                                block40: {
                                    block39: {
                                        block38: {
                                            block37: {
                                                block36: {
                                                    block35: {
                                                        block34: {
                                                            block33: {
                                                                block32: {
                                                                    block31: {
                                                                        int[] nArray = new int[lIIIllIIl[0]];
                                                                        nArray[s.lIIIllIIl[1]] = lIIIllIIl[43];
                                                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                        int[] nArray2 = new int[lIIIllIIl[0]];
                                                                        nArray2[s.lIIIllIIl[1]] = lIIIllIIl[43];
                                                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) break block32;
                                                                        int[] nArray3 = new int[lIIIllIIl[0]];
                                                                        nArray3[s.lIIIllIIl[1]] = lIIIllIIl[43];
                                                                        if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIllIIl[4])) break block32;
                                                                    }
                                                                    lIIIlllIIlIIlIl = new d(lIIIllIIl[43], lIIIllIIl[4], e.c(lIIIllIIl[147], lIIIllIIl[148]));
                                                                    bv.add((d)lIIIlllIIlIIlIl);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[lIIIllIIl[0]];
                                                                nArray[s.lIIIllIIl[1]] = lIIIllIIl[30];
                                                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                int[] nArray4 = new int[lIIIllIIl[0]];
                                                                nArray4[s.lIIIllIIl[1]] = lIIIllIIl[30];
                                                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) break block34;
                                                                int[] nArray5 = new int[lIIIllIIl[0]];
                                                                nArray5[s.lIIIllIIl[1]] = lIIIllIIl[30];
                                                                if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray5).getQuantity(), lIIIllIIl[16])) break block34;
                                                            }
                                                            lIIIlllIIlIIlIl = new d(lIIIllIIl[30], lIIIllIIl[16], lIIIllIIl[149]);
                                                            bv.add((d)lIIIlllIIlIIlIl);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lIIIllIIl[0]];
                                                        nArray[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                        int[] nArray6 = new int[lIIIllIIl[0]];
                                                        nArray6[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray6) ? 1 : 0)) break block36;
                                                        int[] nArray7 = new int[lIIIllIIl[0]];
                                                        nArray7[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                                        if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIllIIl[28])) break block36;
                                                    }
                                                    lIIIlllIIlIIlIl = new d(lIIIllIIl[31], lIIIllIIl[28], lIIIllIIl[150]);
                                                    bv.add((d)lIIIlllIIlIIlIl);
                                                    0;
                                                }
                                                int[] nArray = new int[lIIIllIIl[0]];
                                                nArray[s.lIIIllIIl[1]] = lIIIllIIl[103];
                                                if (s.lllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    lIIIlllIIlIIlIl = new d(lIIIllIIl[103], lIIIllIIl[8], lIIIllIIl[151]);
                                                    bv.add((d)lIIIlllIIlIIlIl);
                                                    0;
                                                }
                                                int[] nArray8 = new int[lIIIllIIl[0]];
                                                nArray8[s.lIIIllIIl[1]] = lIIIllIIl[37];
                                                if (s.lllIlIIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                    lIIIlllIIlIIlIl = new d(lIIIllIIl[37], lIIIllIIl[0], lIIIllIIl[27]);
                                                    bv.add((d)lIIIlllIIlIIlIl);
                                                    0;
                                                }
                                                int[] nArray9 = new int[lIIIllIIl[0]];
                                                nArray9[s.lIIIllIIl[1]] = lIIIllIIl[32];
                                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray9) ? 1 : 0)) break block37;
                                                int[] nArray10 = new int[lIIIllIIl[0]];
                                                nArray10[s.lIIIllIIl[1]] = lIIIllIIl[32];
                                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray10) ? 1 : 0)) break block38;
                                                int[] nArray11 = new int[lIIIllIIl[0]];
                                                nArray11[s.lIIIllIIl[1]] = lIIIllIIl[32];
                                                if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray11).getQuantity(), lIIIllIIl[13])) break block38;
                                            }
                                            lIIIlllIIlIIlIl = new d(lIIIllIIl[32], lIIIllIIl[13], lIIIllIIl[27]);
                                            bv.add((d)lIIIlllIIlIIlIl);
                                            0;
                                        }
                                        int[] nArray = new int[lIIIllIIl[0]];
                                        nArray[s.lIIIllIIl[1]] = lIIIllIIl[33];
                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                        int[] nArray12 = new int[lIIIllIIl[0]];
                                        nArray12[s.lIIIllIIl[1]] = lIIIllIIl[33];
                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray12) ? 1 : 0)) break block40;
                                        int[] nArray13 = new int[lIIIllIIl[0]];
                                        nArray13[s.lIIIllIIl[1]] = lIIIllIIl[33];
                                        if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray13).getQuantity(), lIIIllIIl[8])) break block40;
                                    }
                                    lIIIlllIIlIIlIl = new d(lIIIllIIl[33], lIIIllIIl[8], lIIIllIIl[27]);
                                    bv.add((d)lIIIlllIIlIIlIl);
                                    0;
                                }
                                int[] nArray = new int[lIIIllIIl[0]];
                                nArray[s.lIIIllIIl[1]] = lIIIllIIl[29];
                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                int[] nArray14 = new int[lIIIllIIl[0]];
                                nArray14[s.lIIIllIIl[1]] = lIIIllIIl[29];
                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray14) ? 1 : 0)) break block42;
                                int[] nArray15 = new int[lIIIllIIl[0]];
                                nArray15[s.lIIIllIIl[1]] = lIIIllIIl[29];
                                if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray15).getQuantity(), lIIIllIIl[8])) break block42;
                            }
                            lIIIlllIIlIIlIl = new d(lIIIllIIl[29], lIIIllIIl[13], lIIIllIIl[27]);
                            bv.add((d)lIIIlllIIlIIlIl);
                            0;
                        }
                        int[] nArray = new int[lIIIllIIl[0]];
                        nArray[s.lIIIllIIl[1]] = lIIIllIIl[39];
                        if (s.lllIlIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lIIIlllIIlIIlIl = new d(lIIIllIIl[39], lIIIllIIl[0], lIIIllIIl[27]);
                            bv.add((d)lIIIlllIIlIIlIl);
                            0;
                        }
                        int[] nArray16 = new int[lIIIllIIl[0]];
                        nArray16[s.lIIIllIIl[1]] = lIIIllIIl[38];
                        if (s.lllIlIIlIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                            lIIIlllIIlIIlIl = new d(lIIIllIIl[38], lIIIllIIl[0], lIIIllIIl[27]);
                            bv.add((d)lIIIlllIIlIIlIl);
                            0;
                        }
                        int[] nArray17 = new int[lIIIllIIl[0]];
                        nArray17[s.lIIIllIIl[1]] = lIIIllIIl[40];
                        if (s.lllIlIIlIIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
                            lIIIlllIIlIIlIl = new d(lIIIllIIl[40], lIIIllIIl[0], lIIIllIIl[152]);
                            bv.add((d)lIIIlllIIlIIlIl);
                            0;
                        }
                        int[] nArray18 = new int[lIIIllIIl[0]];
                        nArray18[s.lIIIllIIl[1]] = lIIIllIIl[41];
                        if (s.lllIlIIlIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            lIIIlllIIlIIlIl = new d(lIIIllIIl[41], lIIIllIIl[0], lIIIllIIl[153] + e.c(lIIIllIIl[154], lIIIllIIl[155]));
                            bv.add((d)lIIIlllIIlIIlIl);
                            0;
                        }
                        if (s.lllIlIIlIIl(Bank.contains((Predicate)(lIIIlllIIlIIlIl = item -> item.getName().toLowerCase().contains(lIIIllIII[lIIIllIIl[161]]))) ? 1 : 0)) {
                            lIIIlllIIlIIlII = new d(lIIIllIIl[156], lIIIllIIl[8], lIIIllIIl[157]);
                            bv.add(lIIIlllIIlIIlII);
                            0;
                        }
                        int[] nArray19 = new int[lIIIllIIl[0]];
                        nArray19[s.lIIIllIIl[1]] = lIIIllIIl[34];
                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray19) ? 1 : 0)) break block43;
                        int[] nArray20 = new int[lIIIllIIl[0]];
                        nArray20[s.lIIIllIIl[1]] = lIIIllIIl[34];
                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                        int[] nArray21 = new int[lIIIllIIl[0]];
                        nArray21[s.lIIIllIIl[1]] = lIIIllIIl[34];
                        if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray21).getQuantity(), lIIIllIIl[13])) break block44;
                    }
                    lIIIlllIIlIIlII = new d(lIIIllIIl[34], lIIIllIIl[13], i.bq);
                    bv.add(lIIIlllIIlIIlII);
                    0;
                }
                int[] nArray = new int[lIIIllIIl[0]];
                nArray[s.lIIIllIIl[1]] = lIIIllIIl[36];
                if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray22 = new int[lIIIllIIl[0]];
                nArray22[s.lIIIllIIl[1]] = lIIIllIIl[36];
                if (!s.lllIlIIIlll(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                int[] nArray23 = new int[lIIIllIIl[0]];
                nArray23[s.lIIIllIIl[1]] = lIIIllIIl[36];
                if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray23).getQuantity(), lIIIllIIl[28])) break block46;
            }
            lIIIlllIIlIIlII = new d(lIIIllIIl[36], lIIIllIIl[22], lIIIllIIl[158]);
            bv.add(lIIIlllIIlIIlII);
            0;
        }
    }

    private static boolean lllIlIIllIl(int n2) {
        return n2 > 0;
    }

    private static String lllIlIIIIlI(String lIIIlllIIIlIlll, String lIIIlllIIIlIIIl) {
        lIIIlllIIIlIlll = new String(Base64.getDecoder().decode(lIIIlllIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlllIIIlIlIl = new StringBuilder();
        char[] lIIIlllIIIlIlII = lIIIlllIIIlIIIl.toCharArray();
        int lIIIlllIIIlIIll = lIIIllIIl[1];
        char[] lIIIlllIIIIllIl = lIIIlllIIIlIlll.toCharArray();
        int lIIIlllIIIIllII = lIIIlllIIIIllIl.length;
        int lIIIlllIIIIlIll = lIIIllIIl[1];
        while (s.lllIlIIlIII(lIIIlllIIIIlIll, lIIIlllIIIIllII)) {
            char lIIIlllIIIllIII = lIIIlllIIIIllIl[lIIIlllIIIIlIll];
            lIIIlllIIIlIlIl.append((char)(lIIIlllIIIllIII ^ lIIIlllIIIlIlII[lIIIlllIIIlIIll % lIIIlllIIIlIlII.length]));
            0;
            ++lIIIlllIIIlIIll;
            ++lIIIlllIIIIlIll;
            0;
            if (((0x76 ^ 0x55) & ~(0x5B ^ 0x78)) <= 0) continue;
            return null;
        }
        return String.valueOf(lIIIlllIIIlIlIl);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void lIIIlllIIlIlIIl;
        int[] nArray = new int[lIIIllIIl[20]];
        nArray[s.lIIIllIIl[1]] = lIIIllIIl[36];
        nArray[s.lIIIllIIl[0]] = lIIIllIIl[37];
        nArray[s.lIIIllIIl[9]] = lIIIllIIl[34];
        nArray[s.lIIIllIIl[11]] = lIIIllIIl[40];
        nArray[s.lIIIllIIl[13]] = lIIIllIIl[41];
        nArray[s.lIIIllIIl[8]] = lIIIllIIl[30];
        nArray[s.lIIIllIIl[16]] = lIIIllIIl[31];
        int[] nArray2 = nArray;
        int lIIIlllIIlIlIII = lIIIllIIl[1];
        while (s.lllIlIIlIII(lIIIlllIIlIlIII, ((void)lIIIlllIIlIlIIl).length)) {
            int[] nArray3 = new int[lIIIllIIl[0]];
            nArray3[s.lIIIllIIl[1]] = lIIIlllIIlIlIIl[lIIIlllIIlIlIII];
            if (s.lllIlIIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIllIIl[1];
            }
            ++lIIIlllIIlIlIII;
            0;
            
            return false;
        }
        return lIIIllIIl[0];
    }

    private static boolean lllIlIIIlll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (s.lllIlIIlIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[2])) {
            bl = lIIIllIIl[0];
            0;
            if (((127 + 24 - 100 + 97 ^ 127 + 15 - 104 + 94) & (0x25 ^ 0x40 ^ (0xCA ^ 0xBF) ^ -1)) >= (0x12 ^ 0x4D ^ (0x7E ^ 0x25))) {
                return ((0x78 ^ 0x3B ^ (0x54 ^ 0x2A)) & (0xD4 ^ 0x80 ^ (0xF ^ 0x66) ^ -1)) != 0;
            }
        } else {
            bl = lIIIllIIl[1];
        }
        return bl;
    }

    private static boolean lllIlIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    public static void aI() {
        block115: {
            WorldPoint lIIIlllIIlIlllI;
            Object lIIIlllIIlIllll;
            block116: {
                block123: {
                    block118: {
                        block122: {
                            block121: {
                                block120: {
                                    block119: {
                                        block117: {
                                            if (s.lllIlIIIlll(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (s.lllIlIIlIII(bv.size(), lIIIllIIl[0])) {
                                                    System.out.println(lIIIllIII[lIIIllIIl[1]]);
                                                    bt = lIIIllIIl[1];
                                                }
                                            }
                                            if (!s.lllIlIIlIIl(bt ? 1 : 0) || !s.lllIlIIlIII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[2])) break block115;
                                            if (s.lllIlIIlIII(e.j(lIIIllIIl[3]), lIIIllIIl[4])) {
                                                cu = lIIIllIII[lIIIllIIl[0]];
                                                F.bG();
                                            }
                                            if (s.lllIlIIlIlI(e.j(lIIIllIIl[3]), lIIIllIIl[4]) && (!s.lllIlIIlIll(e.j(lIIIllIIl[5]), lIIIllIIl[6]) || s.lllIlIIlIII(e.j(lIIIllIIl[7]), lIIIllIIl[8]))) {
                                                cu = lIIIllIII[lIIIllIIl[9]];
                                                y.aX();
                                            }
                                            if (s.lllIlIIlIlI(e.j(lIIIllIIl[3]), lIIIllIIl[4]) && s.lllIlIIlIll(e.j(lIIIllIIl[5]), lIIIllIIl[6]) && s.lllIlIIlIll(e.j(lIIIllIIl[7]), lIIIllIIl[8]) && s.lllIlIIlIII(e.j(lIIIllIIl[10]), lIIIllIIl[11])) {
                                                cu = lIIIllIII[lIIIllIIl[11]];
                                                N.cn();
                                            }
                                            if (s.lllIlIIlIlI(e.j(lIIIllIIl[3]), lIIIllIIl[4]) && s.lllIlIIlIll(e.j(lIIIllIIl[5]), lIIIllIIl[6]) && s.lllIlIIlIll(e.j(lIIIllIIl[7]), lIIIllIIl[8]) && s.lllIlIIlIlI(e.j(lIIIllIIl[10]), lIIIllIIl[11]) && s.lllIlIIlIII(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIIl[12])) {
                                                cu = lIIIllIII[lIIIllIIl[13]];
                                                ah.dO();
                                            }
                                            if (s.lllIlIIlIlI(e.j(lIIIllIIl[3]), lIIIllIIl[4]) && s.lllIlIIlIll(e.j(lIIIllIIl[5]), lIIIllIIl[6]) && s.lllIlIIlIll(e.j(lIIIllIIl[7]), lIIIllIIl[8]) && s.lllIlIIlIlI(e.j(lIIIllIIl[10]), lIIIllIIl[11]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIIl[12]) && s.lllIlIIlIII(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIllIIl[14])) {
                                                cu = lIIIllIII[lIIIllIIl[8]];
                                                am.ez();
                                            }
                                            if (s.lllIlIIlIlI(e.j(lIIIllIIl[3]), lIIIllIIl[4]) && s.lllIlIIlIll(e.j(lIIIllIIl[5]), lIIIllIIl[6]) && s.lllIlIIlIll(e.j(lIIIllIIl[7]), lIIIllIIl[8]) && s.lllIlIIlIlI(e.j(lIIIllIIl[10]), lIIIllIIl[11]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIIl[12]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIllIIl[14]) && s.lllIlIIlIII(Skills.getLevel((Skill)Skill.RANGED), lIIIllIIl[15])) {
                                                cu = lIIIllIII[lIIIllIIl[16]];
                                                if (s.lllIlIIlIII(ct, lIIIllIIl[0])) {
                                                    n.bU = lIIIllIIl[1];
                                                    ct += lIIIllIIl[0];
                                                }
                                                m.ap();
                                            }
                                            if (s.lllIlIIlIlI(e.j(lIIIllIIl[3]), lIIIllIIl[4]) && s.lllIlIIlIll(e.j(lIIIllIIl[5]), lIIIllIIl[6]) && s.lllIlIIlIll(e.j(lIIIllIIl[7]), lIIIllIIl[8]) && s.lllIlIIlIlI(e.j(lIIIllIIl[10]), lIIIllIIl[11]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.CRAFTING), lIIIllIIl[12]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.WOODCUTTING), lIIIllIIl[14]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.RANGED), lIIIllIIl[15])) {
                                                if (!s.lllIlIIlIll(e.j(lIIIllIIl[17]), lIIIllIIl[18]) || s.lllIlIIlIII(Skills.getLevel((Skill)Skill.HUNTER), lIIIllIIl[19])) {
                                                    cu = lIIIllIII[lIIIllIIl[20]];
                                                    E.bD();
                                                }
                                                if (s.lllIlIIlIll(e.j(lIIIllIIl[17]), lIIIllIIl[18]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.HUNTER), lIIIllIIl[19]) && s.lllIlIIlIII(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIllIIl[6])) {
                                                    cu = lIIIllIII[lIIIllIIl[21]];
                                                    A.bq();
                                                }
                                                if (s.lllIlIIlIll(e.j(lIIIllIIl[17]), lIIIllIIl[18]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.HUNTER), lIIIllIIl[19]) && s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIllIIl[6]) && s.lllIlIIlIII(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIllIIl[22])) {
                                                    cu = lIIIllIII[lIIIllIIl[19]];
                                                    r.aG();
                                                }
                                                if (s.lllIlIIlIll(e.j(lIIIllIIl[17]), lIIIllIIl[18]) && s.lllIlIIlIll(Skills.getLevel((Skill)Skill.HUNTER), lIIIllIIl[19]) && s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIllIIl[6]) && s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIllIIl[22]) && s.lllIlIIlIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIllIIl[19])) {
                                                    String[] stringArray = new String[lIIIllIIl[0]];
                                                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[4]];
                                                    if (s.lllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        cu = lIIIllIII[lIIIllIIl[23]];
                                                        t.aL();
                                                    }
                                                }
                                                t.aM();
                                            }
                                            if (!s.lllIlIIlIIl(s.ab() ? 1 : 0) || !s.lllIlIIlIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) || !s.lllIlIIlIll(e.j(lIIIllIIl[17]), lIIIllIIl[18]) || !s.lllIlIIlIll(Skills.getLevel((Skill)Skill.HUNTER), lIIIllIIl[19]) || !s.lllIlIIlIll(Skills.getLevel((Skill)Skill.RANGED), lIIIllIIl[15]) || !s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIllIIl[6]) || !s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIIllIIl[22]) || !s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIllIIl[19])) break block116;
                                            String[] stringArray = new String[lIIIllIIl[0]];
                                            stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[24]];
                                            if (!s.lllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block116;
                                            cu = lIIIllIII[lIIIllIIl[25]];
                                            lIIIlllIIlIllll = BankLocation.getNearest();
                                            if (s.lllIlIIllII(lIIIlllIIlIllll) && s.lllIlIIlIIl(lIIIlllIIlIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[26]];
                                                a.a((BankLocation)lIIIlllIIlIllll);
                                            }
                                            if (!s.lllIlIIllII(lIIIlllIIlIllll) || !s.lllIlIIIlll(lIIIlllIIlIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block116;
                                            if (s.lllIlIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllIIl[27]);
                                                0;
                                            }
                                            if (!s.lllIlIIIlll(Bank.isOpen() ? 1 : 0)) break block116;
                                            AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[28]];
                                            if (s.lllIlIIllIl(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIllIIl[13]);
                                                0;
                                            }
                                            if (s.lllIlIIllIl(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIllIIl[9]);
                                                0;
                                            }
                                            int[] nArray = new int[lIIIllIIl[0]];
                                            nArray[s.lIIIllIIl[1]] = lIIIllIIl[29];
                                            if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block117;
                                            int[] nArray2 = new int[lIIIllIIl[0]];
                                            nArray2[s.lIIIllIIl[1]] = lIIIllIIl[29];
                                            if (!s.lllIlIIlIll(Bank.getFirst((int[])nArray2).getQuantity(), lIIIllIIl[8])) break block118;
                                        }
                                        int[] nArray = new int[lIIIllIIl[0]];
                                        nArray[s.lIIIllIIl[1]] = lIIIllIIl[30];
                                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block119;
                                        int[] nArray3 = new int[lIIIllIIl[0]];
                                        nArray3[s.lIIIllIIl[1]] = lIIIllIIl[30];
                                        if (!s.lllIlIIlIll(Bank.getFirst((int[])nArray3).getQuantity(), lIIIllIIl[16])) break block118;
                                    }
                                    int[] nArray = new int[lIIIllIIl[0]];
                                    nArray[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                    if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block120;
                                    int[] nArray4 = new int[lIIIllIIl[0]];
                                    nArray4[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                    if (!s.lllIlIIlIll(Bank.getFirst((int[])nArray4).getQuantity(), lIIIllIIl[28])) break block118;
                                }
                                int[] nArray = new int[lIIIllIIl[0]];
                                nArray[s.lIIIllIIl[1]] = lIIIllIIl[32];
                                if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block121;
                                int[] nArray5 = new int[lIIIllIIl[0]];
                                nArray5[s.lIIIllIIl[1]] = lIIIllIIl[32];
                                if (!s.lllIlIIlIll(Bank.getFirst((int[])nArray5).getQuantity(), lIIIllIIl[13])) break block118;
                            }
                            int[] nArray = new int[lIIIllIIl[0]];
                            nArray[s.lIIIllIIl[1]] = lIIIllIIl[33];
                            if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block122;
                            int[] nArray6 = new int[lIIIllIIl[0]];
                            nArray6[s.lIIIllIIl[1]] = lIIIllIIl[33];
                            if (!s.lllIlIIlIll(Bank.getFirst((int[])nArray6).getQuantity(), lIIIllIIl[8])) break block118;
                        }
                        int[] nArray = new int[lIIIllIIl[0]];
                        nArray[s.lIIIllIIl[1]] = lIIIllIIl[34];
                        if (!s.lllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block123;
                        int[] nArray7 = new int[lIIIllIIl[0]];
                        nArray7[s.lIIIllIIl[1]] = lIIIllIIl[34];
                        if (!s.lllIlIIlIII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIllIIl[13])) break block123;
                    }
                    s.af();
                    System.out.println(lIIIllIII[lIIIllIIl[35]]);
                    bt = lIIIllIIl[0];
                    return;
                }
                int[] nArray = new int[lIIIllIIl[23]];
                nArray[s.lIIIllIIl[1]] = lIIIllIIl[36];
                nArray[s.lIIIllIIl[0]] = lIIIllIIl[37];
                nArray[s.lIIIllIIl[9]] = lIIIllIIl[33];
                nArray[s.lIIIllIIl[11]] = lIIIllIIl[38];
                nArray[s.lIIIllIIl[13]] = lIIIllIIl[32];
                nArray[s.lIIIllIIl[8]] = lIIIllIIl[34];
                nArray[s.lIIIllIIl[16]] = lIIIllIIl[39];
                nArray[s.lIIIllIIl[20]] = lIIIllIIl[40];
                nArray[s.lIIIllIIl[21]] = lIIIllIIl[41];
                nArray[s.lIIIllIIl[19]] = lIIIllIIl[30];
                nArray[s.lIIIllIIl[4]] = lIIIllIIl[31];
                if (s.lllIlIIlIIl(e.b(nArray) ? 1 : 0)) {
                    s.af();
                    System.out.println(lIIIllIII[lIIIllIIl[42]]);
                    bt = lIIIllIIl[0];
                    return;
                }
                int[] nArray8 = new int[lIIIllIIl[23]];
                nArray8[s.lIIIllIIl[1]] = lIIIllIIl[36];
                nArray8[s.lIIIllIIl[0]] = lIIIllIIl[37];
                nArray8[s.lIIIllIIl[9]] = lIIIllIIl[33];
                nArray8[s.lIIIllIIl[11]] = lIIIllIIl[38];
                nArray8[s.lIIIllIIl[13]] = lIIIllIIl[32];
                nArray8[s.lIIIllIIl[8]] = lIIIllIIl[34];
                nArray8[s.lIIIllIIl[16]] = lIIIllIIl[39];
                nArray8[s.lIIIllIIl[20]] = lIIIllIIl[40];
                nArray8[s.lIIIllIIl[21]] = lIIIllIIl[41];
                nArray8[s.lIIIllIIl[19]] = lIIIllIIl[30];
                nArray8[s.lIIIllIIl[4]] = lIIIllIIl[31];
                if (s.lllIlIIIlll(e.b(nArray8) ? 1 : 0)) {
                    a.a(lIIIllIIl[34], lIIIllIIl[13]);
                    a.a(lIIIllIIl[37], lIIIllIIl[0]);
                    a.a(lIIIllIIl[43], lIIIllIIl[0]);
                    a.a(lIIIllIIl[32], lIIIllIIl[13]);
                    a.a(lIIIllIIl[29], lIIIllIIl[13]);
                    a.a(lIIIllIIl[40], lIIIllIIl[0]);
                    a.a(lIIIllIIl[41], lIIIllIIl[0]);
                    a.a(lIIIllIIl[36], lIIIllIIl[4]);
                    a.a(lIIIllIIl[30], lIIIllIIl[4]);
                    a.a(lIIIllIIl[31], lIIIllIIl[28]);
                    a.a(lIIIllIIl[44], lIIIllIIl[0]);
                    a.a(lIIIllIIl[45], lIIIllIIl[27]);
                }
            }
            if (s.lllIlIIIlll(Inventory.contains((int[])f.aV) ? 1 : 0) && s.lllIlIIlIII(Movement.getRunEnergy(), lIIIllIIl[15])) {
                Inventory.getFirst((int[])f.aV).interact(lIIIllIII[lIIIllIIl[46]]);
                Time.sleepTicks((int)lIIIllIIl[0]);
                0;
            }
            if (s.lllIlIIIlll(Inventory.contains((int[])f.aS) ? 1 : 0) && s.lllIlIIlIII(Prayers.getPoints(), lIIIllIIl[47])) {
                Inventory.getFirst((int[])f.aS).interact(lIIIllIII[lIIIllIIl[12]]);
            }
            if (s.lllIlIIlllI(s.lllIlIIIllI(e.u(), 60.0))) {
                String[] stringArray = new String[lIIIllIIl[0]];
                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[48]];
                if (s.lllIlIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIllIIl[0]];
                    stringArray2[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[49]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIllIII[lIIIllIIl[50]]);
                    Time.sleepTicks((int)lIIIllIIl[9]);
                    0;
                }
            }
            if (s.lllIlIIIlll(s.ab() ? 1 : 0) && s.lllIlIIlIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (s.lllIlIIlIIl(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllIIl[21])) {
                    AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[51]];
                    if (s.lllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)bX);
                    0;
                    Time.sleepTicks((int)lIIIllIIl[0]);
                    0;
                }
                if (s.lllIlIIIlll(co.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllIIl[21])) {
                    cl = lIIIllIIl[1];
                    g.a(lIIIllIII[lIIIllIIl[47]], bR);
                }
                if (s.lllIlIIIlll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIllIIl[52], lIIIllIIl[53], lIIIllIIl[1])) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIIl[0]];
                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[54]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIII[lIIIllIIl[55]]);
                    Time.sleepTicks((int)lIIIllIIl[9]);
                    0;
                }
                if (s.lllIlIIIlll((lIIIlllIIlIllll = new WorldArea(lIIIllIIl[52], lIIIllIIl[56], lIIIllIIl[16], lIIIllIIl[4], lIIIllIIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIIl[0]];
                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[57]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIllIII[lIIIllIIl[58]]);
                    Time.sleepTicks((int)lIIIllIIl[9]);
                    0;
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[4])) {
                int[] nArray = new int[lIIIllIIl[0]];
                nArray[s.lIIIllIIl[1]] = lIIIllIIl[44];
                if (s.lllIlIIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray9 = new int[lIIIllIIl[0]];
                    nArray9[s.lIIIllIIl[1]] = lIIIllIIl[44];
                    Inventory.getFirst((int[])nArray9).interact(lIIIllIII[lIIIllIIl[59]]);
                }
                int[] nArray10 = new int[lIIIllIIl[0]];
                nArray10[s.lIIIllIIl[1]] = lIIIllIIl[60];
                if (s.lllIlIIlIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    block114: {
                        lIIIlllIIlIllll = new WorldPoint(lIIIllIIl[61], lIIIllIIl[62], lIIIllIIl[1]);
                        int[] nArray11 = new int[lIIIllIIl[0]];
                        nArray11[s.lIIIllIIl[1]] = lIIIllIIl[63];
                        if (s.lllIlIIlIIl(Inventory.contains((int[])nArray11) ? 1 : 0) && s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlllIIlIllll), lIIIllIIl[48])) {
                            if (s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIllIIl[8])) {
                                AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[64]];
                                Movement.walkTo((WorldPoint)cr);
                                0;
                                Time.sleepTicks((int)lIIIllIIl[0]);
                                0;
                            }
                            if (s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIllIIl[8])) {
                                if (s.lllIlIIlIIl(Shop.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIllIIl[0]];
                                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[65]];
                                    NPCs.getNearest((String[])stringArray).interact(lIIIllIII[lIIIllIIl[10]]);
                                    Time.sleepTicks((int)lIIIllIIl[9]);
                                    0;
                                }
                                if (s.lllIlIIIlll(Shop.isOpen() ? 1 : 0)) {
                                    Shop.buyFive((int)lIIIllIIl[63]);
                                    Time.sleepTicks((int)lIIIllIIl[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray12 = new int[lIIIllIIl[0]];
                        nArray12[s.lIIIllIIl[1]] = lIIIllIIl[63];
                        if (s.lllIlIIIlll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                            if (s.lllIlIIlIIl(cp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && s.lllIlIIlIIl(cq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] nArray13 = new int[lIIIllIIl[0]];
                                nArray13[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                if (s.lllIlIIIlll(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                    int[] nArray14 = new int[lIIIllIIl[0]];
                                    nArray14[s.lIIIllIIl[1]] = lIIIllIIl[31];
                                    Inventory.getFirst((int[])nArray14).interact(lIIIllIII[lIIIllIIl[66]]);
                                    Time.sleepTicks((int)lIIIllIIl[20]);
                                    0;
                                }
                            }
                            if (!s.lllIlIIlIIl(cp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || s.lllIlIIIlll(cq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                lIIIlllIIlIlllI = new WorldPoint(lIIIllIIl[61], lIIIllIIl[62], lIIIllIIl[1]);
                                if (s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(lIIIlllIIlIlllI), lIIIllIIl[8]) && s.lllIlIIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                                    AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[67]];
                                    Movement.walkTo((WorldPoint)lIIIlllIIlIlllI);
                                    0;
                                    Time.sleepTicks((int)lIIIllIIl[0]);
                                    0;
                                }
                                String[] stringArray = new String[lIIIllIIl[0]];
                                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[14]];
                                if (s.lllIlIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(lIIIlllIIlIlllI), lIIIllIIl[8]) && s.lllIlIIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                                        String[] stringArray3 = new String[lIIIllIIl[0]];
                                        stringArray3[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[68]];
                                        TileObjects.getNearest((String[])stringArray3).interact(lIIIllIII[lIIIllIIl[69]]);
                                        Time.sleepTicks((int)lIIIllIIl[13]);
                                        0;
                                    }
                                    String[] stringArray4 = new String[lIIIllIIl[0]];
                                    stringArray4[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[70]];
                                    if (s.lllIlIIllII(TileObjects.getNearest((String[])stringArray4))) {
                                        String[] stringArray5 = new String[lIIIllIIl[0]];
                                        stringArray5[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[71]];
                                        if (s.lllIlIIIlll(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                            String[] stringArray6 = new String[lIIIllIIl[0]];
                                            stringArray6[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[22]];
                                            String[] stringArray7 = new String[lIIIllIIl[0]];
                                            stringArray7[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[72]];
                                            Inventory.getFirst((String[])stringArray6).useOn(TileObjects.getNearest((String[])stringArray7));
                                            Time.sleep((long)e.c(lIIIllIIl[73], lIIIllIIl[74]));
                                            0;
                                        }
                                    }
                                }
                                String[] stringArray8 = new String[lIIIllIIl[0]];
                                stringArray8[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[75]];
                                if (s.lllIlIIlIIl(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                    if (s.lllIlIIlIlI(Players.getLocal().getWorldLocation().getPlane(), lIIIllIIl[0])) {
                                        String[] stringArray9 = new String[lIIIllIIl[0]];
                                        stringArray9[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[76]];
                                        TileObjects.getNearest((String[])stringArray9).interact(lIIIllIII[lIIIllIIl[77]]);
                                        Time.sleepTicks((int)lIIIllIIl[8]);
                                        0;
                                    }
                                    if (s.lllIlIIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                                        do {
                                            String[] stringArray10 = new String[lIIIllIIl[0]];
                                            stringArray10[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[78]];
                                            if (!s.lllIlIIIlll(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block114;
                                            String[] stringArray11 = new String[lIIIllIIl[0]];
                                            stringArray11[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[79]];
                                            TileObjects.getNearest((String[])stringArray11).interact(lIIIllIII[lIIIllIIl[80]]);
                                            Time.sleepTicks((int)lIIIllIIl[9]);
                                            0;
                                            0;
                                        } while (-1 >= -1);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int[] nArray15 = new int[lIIIllIIl[0]];
                    nArray15[s.lIIIllIIl[1]] = lIIIllIIl[32];
                    if (s.lllIlIIlIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIllIIl[0]];
                        stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[81]];
                        if (s.lllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlllIIlIllll), lIIIllIIl[48])) {
                            if (s.lllIlIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                g.a(lIIIllIII[lIIIllIIl[82]], bR);
                                Time.sleepTicks((int)lIIIllIIl[0]);
                                0;
                            }
                            g.a(bR);
                        }
                    }
                }
                int[] nArray16 = new int[lIIIllIIl[0]];
                nArray16[s.lIIIllIIl[1]] = lIIIllIIl[60];
                if (s.lllIlIIIlll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIllIIl[9]];
                    nArray17[s.lIIIllIIl[1]] = lIIIllIIl[83];
                    nArray17[s.lIIIllIIl[0]] = lIIIllIIl[29];
                    if (s.lllIlIIIlll(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                        int[] nArray18 = new int[lIIIllIIl[9]];
                        nArray18[s.lIIIllIIl[1]] = lIIIllIIl[83];
                        nArray18[s.lIIIllIIl[0]] = lIIIllIIl[29];
                        Inventory.getAll((int[])nArray18).stream().forEach(item -> item.interact(lIIIllIII[lIIIllIIl[162]]));
                    }
                    if (s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(cs), lIIIllIIl[20])) {
                        Movement.walkTo((WorldPoint)cs);
                        0;
                        Time.sleepTicks((int)lIIIllIIl[0]);
                        0;
                    }
                    if (s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(cs), lIIIllIIl[20])) {
                        g.a(lIIIllIII[lIIIllIIl[15]], bR);
                    }
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[48])) {
                g.a(lIIIllIII[lIIIllIIl[84]], bR);
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[64])) {
                g.a(lIIIllIII[lIIIllIIl[85]], bR);
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[22])) {
                g.a(lIIIllIII[lIIIllIIl[86]], bR);
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[15])) {
                g.a(lIIIllIII[lIIIllIIl[87]], bR);
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[6])) {
                g.a(lIIIllIII[lIIIllIIl[88]], bR);
            }
            if (!s.lllIlIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[89]) || s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[90])) {
                lIIIlllIIlIllll = new WorldPoint(lIIIllIIl[91], lIIIllIIl[92], lIIIllIIl[1]);
                if (s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlllIIlIllll), lIIIllIIl[11])) {
                    AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[93]];
                    Movement.walkTo((WorldPoint)lIIIlllIIlIllll);
                    0;
                    Time.sleepTicks((int)lIIIllIIl[0]);
                    0;
                }
                if (s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlllIIlIllll), lIIIllIIl[11])) {
                    g.a(lIIIllIII[lIIIllIIl[94]], bR);
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[95])) {
                if (s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo(cs), lIIIllIIl[20])) {
                    Movement.walkTo((WorldPoint)cs);
                    0;
                    Time.sleepTicks((int)lIIIllIIl[0]);
                    0;
                }
                if (s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(cs), lIIIllIIl[20])) {
                    g.a(lIIIllIII[lIIIllIIl[96]], bR);
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[97])) {
                g.a(lIIIllIII[lIIIllIIl[98]], bR);
            }
            if (!s.lllIlIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[99]) || s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[100])) {
                g.a(lIIIllIII[lIIIllIIl[6]], bR);
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[100])) {
                String[] stringArray = new String[lIIIllIIl[0]];
                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[101]];
                if (s.lllIlIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray12 = new String[lIIIllIIl[0]];
                    stringArray12[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[102]];
                    if (s.lllIlIIlIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        lIIIlllIIlIllll = new HashMap();
                        ((HashMap)lIIIlllIIlIllll).put(lIIIllIIl[33], lIIIllIIl[8]);
                        0;
                        ((HashMap)lIIIlllIIlIllll).put(lIIIllIIl[38], lIIIllIIl[0]);
                        0;
                        ((HashMap)lIIIlllIIlIllll).put(lIIIllIIl[39], lIIIllIIl[0]);
                        0;
                        ((HashMap)lIIIlllIIlIllll).put(lIIIllIIl[103], lIIIllIIl[0]);
                        0;
                        e.a((HashMap<Integer, Integer>)lIIIlllIIlIllll, lIIIllIIl[1], lIIIllIIl[1]);
                    }
                    String[] stringArray13 = new String[lIIIllIIl[0]];
                    stringArray13[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[104]];
                    if (s.lllIlIIIlll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        s.aJ();
                    }
                }
            }
            if (!s.lllIlIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[105]) || s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[106])) {
                String[] stringArray = new String[lIIIllIIl[0]];
                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[107]];
                lIIIlllIIlIllll = NPCs.getNearest((String[])stringArray);
                if (s.lllIlIIllII(lIIIlllIIlIllll)) {
                    if (s.lllIlIIIlll(Reachable.isInteractable((Locatable)lIIIlllIIlIllll) ? 1 : 0)) {
                        g.a(lIIIllIII[lIIIllIIl[3]], bR);
                    }
                    if (s.lllIlIIlIIl(Reachable.isInteractable((Locatable)lIIIlllIIlIllll) ? 1 : 0)) {
                        Movement.walkTo((Locatable)lIIIlllIIlIllll);
                        0;
                        Time.sleepTicks((int)lIIIllIIl[0]);
                        0;
                    }
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[108])) {
                String[] stringArray = new String[lIIIllIIl[0]];
                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[109]];
                if (s.lllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lIIIlllIIlIllll = new WorldPoint(lIIIllIIl[110], lIIIllIIl[111], lIIIllIIl[1]);
                    lIIIlllIIlIlllI = new WorldPoint(lIIIllIIl[110], lIIIllIIl[112], lIIIllIIl[1]);
                    if (s.lllIlIIlIIl(Players.getLocal().getWorldLocation().equals(lIIIlllIIlIllll) ? 1 : 0) && s.lllIlIIlIIl(Players.getLocal().getWorldLocation().equals((Object)lIIIlllIIlIlllI) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[113]];
                        Movement.walkTo((WorldPoint)lIIIlllIIlIllll);
                        0;
                        Time.sleepTicks((int)lIIIllIIl[0]);
                        0;
                    }
                    if (s.lllIlIIIlll(Players.getLocal().getWorldLocation().equals(lIIIlllIIlIllll) ? 1 : 0) && s.lllIlIIlIIl(Players.getLocal().getWorldLocation().equals((Object)lIIIlllIIlIlllI) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)lIIIlllIIlIlllI);
                        0;
                    }
                    if (s.lllIlIIIlll(Players.getLocal().getWorldLocation().equals((Object)lIIIlllIIlIlllI) ? 1 : 0)) {
                        String[] stringArray14 = new String[lIIIllIIl[0]];
                        stringArray14[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[114]];
                        String[] stringArray15 = new String[lIIIllIIl[0]];
                        stringArray15[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[115]];
                        Inventory.getFirst((String[])stringArray14).useOn(Inventory.getFirst((String[])stringArray15));
                        Time.sleepTicks((int)lIIIllIIl[11]);
                        0;
                    }
                }
                String[] stringArray16 = new String[lIIIllIIl[0]];
                stringArray16[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[89]];
                if (s.lllIlIIIlll(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    s.aJ();
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[116])) {
                lIIIlllIIlIllll = new WorldPoint(lIIIllIIl[117], lIIIllIIl[118], lIIIllIIl[1]);
                if (s.lllIlIIlIIl(Players.getLocal().getWorldLocation().equals(lIIIlllIIlIllll) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)lIIIlllIIlIllll);
                    0;
                    Time.sleepTicks((int)lIIIllIIl[0]);
                    0;
                }
                if (s.lllIlIIIlll(Players.getLocal().getWorldLocation().equals(lIIIlllIIlIllll) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIIl[0]];
                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[119]];
                    NPCs.getNearest((String[])stringArray).interact(lIIIllIII[lIIIllIIl[120]]);
                    Time.sleepTicks((int)lIIIllIIl[0]);
                    0;
                }
            }
            if (!s.lllIlIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[121]) || s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[122])) {
                lIIIlllIIlIllll = new WorldPoint(lIIIllIIl[123], lIIIllIIl[124], lIIIllIIl[1]);
                if (s.lllIlIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlllIIlIllll), lIIIllIIl[9])) {
                    if (s.lllIlIIIlll(Inventory.contains((int[])f.aO) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aO).interact(lIIIllIII[lIIIllIIl[90]]);
                    }
                    AccBuilderEasyClues.c = lIIIllIII[lIIIllIIl[125]];
                    Movement.walkTo((WorldPoint)lIIIlllIIlIllll);
                    0;
                    Time.sleepTicks((int)lIIIllIIl[0]);
                    0;
                }
                if (s.lllIlIlIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlllIIlIllll), lIIIllIIl[9])) {
                    String[] stringArray = new String[lIIIllIIl[0]];
                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[126]];
                    lIIIlllIIlIlllI = NPCs.getNearest((String[])stringArray);
                    if (s.lllIlIIllII(lIIIlllIIlIlllI)) {
                        if (s.lllIlIIIlll(Reachable.isInteractable((Locatable)lIIIlllIIlIlllI) ? 1 : 0)) {
                            g.a(lIIIllIII[lIIIllIIl[95]], bR);
                        }
                        if (s.lllIlIIlIIl(Reachable.isInteractable((Locatable)lIIIlllIIlIlllI) ? 1 : 0)) {
                            Movement.walkTo((Locatable)lIIIlllIIlIlllI);
                            0;
                            Time.sleepTicks((int)lIIIllIIl[0]);
                            0;
                        }
                    }
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[127])) {
                String[] stringArray = new String[lIIIllIIl[0]];
                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[128]];
                if (s.lllIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lIIIlllIIlIllll = new WorldPoint(lIIIllIIl[117], lIIIllIIl[118], lIIIllIIl[1]);
                    if (s.lllIlIIlIIl(Players.getLocal().getWorldLocation().equals(lIIIlllIIlIllll) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)lIIIlllIIlIllll);
                        0;
                        Time.sleepTicks((int)lIIIllIIl[0]);
                        0;
                    }
                    if (s.lllIlIIIlll(Players.getLocal().getWorldLocation().equals(lIIIlllIIlIllll) ? 1 : 0)) {
                        String[] stringArray17 = new String[lIIIllIIl[0]];
                        stringArray17[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[129]];
                        NPCs.getNearest((String[])stringArray17).interact(lIIIllIII[lIIIllIIl[130]]);
                        Time.sleepTicks((int)lIIIllIIl[0]);
                        0;
                    }
                }
                String[] stringArray18 = new String[lIIIllIIl[0]];
                stringArray18[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[97]];
                if (s.lllIlIIIlll(Inventory.contains((String[])stringArray18) ? 1 : 0)) {
                    s.aJ();
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[131])) {
                s.aJ();
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[132])) {
                if (s.lllIlIIIlll(Widgets.get((int)lIIIllIIl[133]).isEmpty() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIIl[0]];
                    stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[134]];
                    Inventory.getFirst((String[])stringArray).interact(lIIIllIII[lIIIllIIl[135]]);
                    Time.sleepTicks((int)lIIIllIIl[13]);
                    0;
                }
                if (s.lllIlIIlIIl(Widgets.get((int)lIIIllIIl[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click((int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[55]).getClickPoint().getX(), (int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[55]).getClickPoint().getY(), (boolean)lIIIllIIl[0]);
                    Time.sleepTicks((int)lIIIllIIl[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[65]).getClickPoint().getX(), (int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[65]).getClickPoint().getY(), (boolean)lIIIllIIl[0]);
                    Time.sleepTicks((int)lIIIllIIl[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[67]).getClickPoint().getX(), (int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[67]).getClickPoint().getY(), (boolean)lIIIllIIl[0]);
                    Time.sleepTicks((int)lIIIllIIl[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[22]).getClickPoint().getX(), (int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[22]).getClickPoint().getY(), (boolean)lIIIllIIl[0]);
                    Time.sleepTicks((int)lIIIllIIl[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[76]).getClickPoint().getX(), (int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[76]).getClickPoint().getY(), (boolean)lIIIllIIl[0]);
                    Time.sleepTicks((int)lIIIllIIl[9]);
                    0;
                    Mouse.click((int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[79]).getClickPoint().getX(), (int)Widgets.get((int)lIIIllIIl[133], (int)lIIIllIIl[79]).getClickPoint().getY(), (boolean)lIIIllIIl[0]);
                    Time.sleepTicks((int)lIIIllIIl[8]);
                    0;
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[136])) {
                s.aJ();
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[137])) {
                String[] stringArray = new String[lIIIllIIl[0]];
                stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[138]];
                if (s.lllIlIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray19 = new String[lIIIllIIl[0]];
                    stringArray19[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[139]];
                    String[] stringArray20 = new String[lIIIllIIl[0]];
                    stringArray20[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[140]];
                    Inventory.getFirst((String[])stringArray19).useOn(Inventory.getFirst((String[])stringArray20));
                    Time.sleepTicks((int)lIIIllIIl[9]);
                    0;
                }
            }
            if (s.lllIlIIlIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIllIIl[141])) {
                if (s.lllIlIIlIII(cl, lIIIllIIl[0])) {
                    an.oL += lIIIllIIl[0];
                    an.o(AccBuilderEasyClues.m);
                    cl += lIIIllIIl[0];
                    an.oL = lIIIllIIl[1];
                    cm = lIIIllIIl[1];
                }
                s.aJ();
            }
            g.a(bR);
        }
    }

    static {
        s.lllIlIIIlIl();
        s.lllIlIIIlII();
        bv = new ArrayList<d>();
        co = new WorldArea(lIIIllIIl[163], lIIIllIIl[56], lIIIllIIl[16], lIIIllIIl[4], lIIIllIIl[1]);
        cp = new WorldArea(lIIIllIIl[164], lIIIllIIl[165], lIIIllIIl[166], lIIIllIIl[142], lIIIllIIl[1]);
        cq = new WorldArea(lIIIllIIl[164], lIIIllIIl[165], lIIIllIIl[166], lIIIllIIl[142], lIIIllIIl[0]);
        bX = new WorldPoint(lIIIllIIl[167], lIIIllIIl[168], lIIIllIIl[1]);
        cr = new WorldPoint(lIIIllIIl[169], lIIIllIIl[170], lIIIllIIl[1]);
        cs = new WorldPoint(lIIIllIIl[171], lIIIllIIl[172], lIIIllIIl[1]);
        String[] stringArray = new String[lIIIllIIl[21]];
        stringArray[s.lIIIllIIl[1]] = lIIIllIII[lIIIllIIl[173]];
        stringArray[s.lIIIllIIl[0]] = lIIIllIII[lIIIllIIl[174]];
        stringArray[s.lIIIllIIl[9]] = lIIIllIII[lIIIllIIl[175]];
        stringArray[s.lIIIllIIl[11]] = lIIIllIII[lIIIllIIl[176]];
        stringArray[s.lIIIllIIl[13]] = lIIIllIII[lIIIllIIl[100]];
        stringArray[s.lIIIllIIl[8]] = lIIIllIII[lIIIllIIl[177]];
        stringArray[s.lIIIllIIl[16]] = lIIIllIII[lIIIllIIl[178]];
        stringArray[s.lIIIllIIl[20]] = lIIIllIII[lIIIllIIl[179]];
        bR = stringArray;
        ct = lIIIllIIl[1];
        cu = lIIIllIII[lIIIllIIl[180]];
    }

    private static String lllIlIIIIIl(String lIIIllIllllIIll, String lIIIllIllllIIlI) {
        try {
            SecretKeySpec lIIIllIlllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIllIllllIIlI.getBytes(StandardCharsets.UTF_8)), lIIIllIIl[21]), "DES");
            Cipher lIIIllIllllIlll = Cipher.getInstance("DES");
            lIIIllIllllIlll.init(lIIIllIIl[9], lIIIllIlllllIII);
            return new String(lIIIllIllllIlll.doFinal(Base64.getDecoder().decode(lIIIllIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIllIllllIllI) {
            lIIIllIllllIllI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return lIIIllIIl[1];
    }

    private static void lllIlIIIlIl() {
        lIIIllIIl = new int[182];
        s.lIIIllIIl[0] = 1;
        s.lIIIllIIl[1] = (0x24 ^ 0xE) & ~(0x6B ^ 0x41);
        s.lIIIllIIl[2] = 3 + (1 + 101 - -13 + 96) - (0x62 ^ 0x2D) + (0xC ^ 0x65);
        s.lIIIllIIl[3] = 0x73 ^ 0x76 ^ (0x31 ^ 0x75);
        s.lIIIllIIl[4] = 0x29 ^ 0x3D ^ (0xBD ^ 0xA3);
        s.lIIIllIIl[5] = -(0xFFFFFE47 & 0x1FFA) & (0xFFFF9FFF & 0x7F6F);
        s.lIIIllIIl[6] = 0x4D ^ 0x11 ^ (0xF5 ^ 0x95);
        s.lIIIllIIl[7] = 0xFFFF8FB7 & 0x717B;
        s.lIIIllIIl[8] = 0x1A ^ 0x55 ^ (0xCB ^ 0x81);
        s.lIIIllIIl[9] = 2;
        s.lIIIllIIl[10] = 0xBA ^ 0x9A;
        s.lIIIllIIl[11] = 3;
        s.lIIIllIIl[12] = 160 + 114 - 268 + 203 ^ 33 + 48 - -25 + 88;
        s.lIIIllIIl[13] = 0x21 ^ 0x7D ^ (0x46 ^ 0x1E);
        s.lIIIllIIl[14] = 3 + 75 - -48 + 41 ^ 107 + 42 - 118 + 101;
        s.lIIIllIIl[15] = 8 ^ 0x22 ^ (0x2E ^ 0x36);
        s.lIIIllIIl[16] = 0xAC ^ 0xAA;
        s.lIIIllIIl[17] = 0xFFFFD3F7 & 0x2FFA;
        s.lIIIllIIl[18] = -(0xFFFFF3EB & 0x6D77) & (0xFFFFFB7E & 0x6DFF);
        s.lIIIllIIl[19] = 0x49 ^ 0x21 ^ (0xF2 ^ 0x93);
        s.lIIIllIIl[20] = 0xE3 ^ 0x9B ^ 95 + 31 - 81 + 82;
        s.lIIIllIIl[21] = 0x5B ^ 0xB ^ (3 ^ 0x5B);
        s.lIIIllIIl[22] = 0x24 ^ 0xC;
        s.lIIIllIIl[23] = 0x90 ^ 0xB5 ^ (0xBC ^ 0x92);
        s.lIIIllIIl[24] = 0x99 ^ 0x95;
        s.lIIIllIIl[25] = 0xA ^ 0x25 ^ (0x3E ^ 0x1C);
        s.lIIIllIIl[26] = 0x98 ^ 0x8C ^ (0x4E ^ 0x54);
        s.lIIIllIIl[27] = -(0xFFFFBCB5 & 0x6B5F) & (0xFFFFBFBC & 0x7BDF);
        s.lIIIllIIl[28] = 0x51 ^ 0x2C ^ (0xF7 ^ 0x85);
        s.lIIIllIIl[29] = 0xFFFFAFBB & 0x57CF;
        s.lIIIllIIl[30] = 0xFFFFDEDF & 0x6DBF;
        s.lIIIllIIl[31] = -(0xFFFFB0FB & 0x7F4F) & (0xFFFFFCFF & 0x7FEF);
        s.lIIIllIIl[32] = 0xFFFFF34E & 0xEBF;
        s.lIIIllIIl[33] = -(0xFFFFD6CB & 0x3BB5) & (0xFFFF9BBF & 0x7FEF);
        s.lIIIllIIl[34] = 0xFFFFF7DB & 0x3975;
        s.lIIIllIIl[35] = 0x9C ^ 0xB7 ^ (0x80 ^ 0xBB);
        s.lIIIllIIl[36] = -(0xFFFFDABD & 0x65C3) & (0xFFFFFFCF & 0x5FF7);
        s.lIIIllIIl[37] = 0xFFFFC5CF & 0x3F7B;
        s.lIIIllIIl[38] = -(0xFFFFB977 & 0x76DD) & (0xFFFFBB7F & 0x7DFF);
        s.lIIIllIIl[39] = -(0xFFFFD90B & 0x7FF5) & (0xFFFFFFDF & 0x5FEF);
        s.lIIIllIIl[40] = -(0xFFFFEF09 & 0x79FF) & (0xFFFFEFBF & 0x7FFE);
        s.lIIIllIIl[41] = 0xFFFFBD9B & 0x6B64;
        s.lIIIllIIl[42] = 0x97 ^ 0x86;
        s.lIIIllIIl[43] = -(0xFFFFE0EE & 0x5FB7) & (0xFFFFFFEF & 0x5FFF);
        s.lIIIllIIl[44] = 0xFFFF96BC & 0x6B6B;
        s.lIIIllIIl[45] = 0xFFFFD7FF & 0x2BE3;
        s.lIIIllIIl[46] = 0x96 ^ 0x84;
        s.lIIIllIIl[47] = 76 + 129 - 99 + 39 ^ 21 + 38 - -10 + 68;
        s.lIIIllIIl[48] = 179 + 93 - 139 + 49 ^ 130 + 29 - 42 + 45;
        s.lIIIllIIl[49] = 2 ^ (0x36 ^ 0x21);
        s.lIIIllIIl[50] = 13 + 23 - -76 + 65 ^ 110 + 103 - 133 + 87;
        s.lIIIllIIl[51] = 0xD6 ^ 0xC1;
        s.lIIIllIIl[52] = 0xFFFF9D3D & 0x6EDB;
        s.lIIIllIIl[53] = 0xFFFFDF3C & 0x2DE3;
        s.lIIIllIIl[54] = 0x74 ^ 0x7B ^ (0x88 ^ 0x9E);
        s.lIIIllIIl[55] = 3 ^ 0x19;
        s.lIIIllIIl[56] = 0xFFFFCDFF & 0x3F1A;
        s.lIIIllIIl[57] = 37 + 135 - 96 + 83 ^ 57 + 11 - 54 + 118;
        s.lIIIllIIl[58] = 0xB0 ^ 0xAC;
        s.lIIIllIIl[59] = 0x90 ^ 0x8D;
        s.lIIIllIIl[60] = -(0xFFFFC756 & 0x7DEB) & (0xFFFFD5FF & 0x7FF7);
        s.lIIIllIIl[61] = -(0xFFFFFBAF & 0x5451) & (0xFFFFFEFD & 0x5F53);
        s.lIIIllIIl[62] = -(0xFFFFF7FD & 0x3A03) & (0xFFFFBFFF & 0x7FBF);
        s.lIIIllIIl[63] = 0xFFFFB0FF & 0x5FBE;
        s.lIIIllIIl[64] = 106 + 72 - 101 + 61 ^ 92 + 145 - 101 + 12;
        s.lIIIllIIl[65] = 0x34 ^ 0x2B;
        s.lIIIllIIl[66] = 133 + 29 - 88 + 105 ^ 28 + 12 - -91 + 15;
        s.lIIIllIIl[67] = 0x49 ^ 0x56 ^ (0xC ^ 0x31);
        s.lIIIllIIl[68] = 89 + 21 - 91 + 112 ^ 101 + 133 - 198 + 131;
        s.lIIIllIIl[69] = 0x43 ^ 0x66;
        s.lIIIllIIl[70] = 121 + 101 - 128 + 47 ^ 145 + 48 - 42 + 20;
        s.lIIIllIIl[71] = 0x4C ^ 0x6B;
        s.lIIIllIIl[72] = 0xBA ^ 0x93;
        s.lIIIllIIl[73] = 0xFFFFE4A4 & 0xFFDF;
        s.lIIIllIIl[74] = 0xFFFFF756 & 0xFFED;
        s.lIIIllIIl[75] = 0x7F ^ 0x55;
        s.lIIIllIIl[76] = 0xC7 ^ 0xC0 ^ (0x9A ^ 0xB6);
        s.lIIIllIIl[77] = 0xB2 ^ 0x9E;
        s.lIIIllIIl[78] = 0x64 ^ 0x11 ^ (0x54 ^ 0xC);
        s.lIIIllIIl[79] = 0xDB ^ 0xA3 ^ (0xFC ^ 0xAA);
        s.lIIIllIIl[80] = 0xA7 ^ 0xB8 ^ (0xB2 ^ 0x82);
        s.lIIIllIIl[81] = 0x2C ^ 0x63 ^ 18 + 72 - 29 + 66;
        s.lIIIllIIl[82] = 0xF6 ^ 0xB4 ^ (0xE4 ^ 0x97);
        s.lIIIllIIl[83] = 0xFFFFEFB7 & 0x17CD;
        s.lIIIllIIl[84] = 0x86 ^ 0x9B ^ (0xAB ^ 0x85);
        s.lIIIllIIl[85] = 0xF3 ^ 0xC7;
        s.lIIIllIIl[86] = 0x42 ^ 0x77;
        s.lIIIllIIl[87] = 0x82 ^ 0xB4;
        s.lIIIllIIl[88] = 0xFE ^ 0xBF ^ (0xCF ^ 0xB9);
        s.lIIIllIIl[89] = 0x57 ^ 0x11;
        s.lIIIllIIl[90] = 198 + 102 - 144 + 50 ^ 64 + 96 - 85 + 60;
        s.lIIIllIIl[91] = 0xFFFFDFDF & 0x2DA6;
        s.lIIIllIIl[92] = 0xFFFFBDF7 & 0x4FEF;
        s.lIIIllIIl[93] = 8 ^ 0x72 ^ (0x74 ^ 0x36);
        s.lIIIllIIl[94] = 55 + 146 - 198 + 159 ^ 150 + 78 - 192 + 119;
        s.lIIIllIIl[95] = 0x8B ^ 0x9A ^ (0xE3 ^ 0xBE);
        s.lIIIllIIl[96] = 0xBF ^ 0x85;
        s.lIIIllIIl[97] = 6 ^ 0x56;
        s.lIIIllIIl[98] = 0x77 ^ 0x4C;
        s.lIIIllIIl[99] = 0x6C ^ 0x36;
        s.lIIIllIIl[100] = 0x47 ^ 0x23;
        s.lIIIllIIl[101] = 0x11 ^ 0x2C;
        s.lIIIllIIl[102] = 0x8B ^ 0xB5;
        s.lIIIllIIl[103] = -(0xFFFFB577 & 0x5A8B) & (0xFFFF9F7F & 0x7F8F);
        s.lIIIllIIl[104] = 0xDD ^ 0x8E ^ (0x2C ^ 0x40);
        s.lIIIllIIl[105] = 0x18 ^ 0x60;
        s.lIIIllIIl[106] = (0x3B ^ 0x4D) + (0xA3 ^ 0xAE) - (0x60 ^ 5) + (0x5C ^ 0x38);
        s.lIIIllIIl[107] = 0x14 ^ 0xA ^ (0xC3 ^ 0x9D);
        s.lIIIllIIl[108] = (0x3B ^ 0x11) + (0x65 ^ 0x7C) - -(0x5F ^ 0x54) + (0x8C ^ 0xB2);
        s.lIIIllIIl[109] = 0x2B ^ 0x69;
        s.lIIIllIIl[110] = -(0xFFFFF55F & 0x5EAF) & (0xFFFFFFAF & 0x5FFF);
        s.lIIIllIIl[111] = 0xFFFFCDFF & 0x3EA7;
        s.lIIIllIIl[112] = 0xFFFFAEED & 0x5DBA;
        s.lIIIllIIl[113] = 150 + 139 - 107 + 25 ^ 17 + 20 - -98 + 5;
        s.lIIIllIIl[114] = 0xC6 ^ 0x83 ^ 1;
        s.lIIIllIIl[115] = 0x25 ^ 0x60;
        s.lIIIllIIl[116] = (0x8A ^ 0x86) + (0x18 ^ 0x3A) - -(0xC7 ^ 0x98) + (0xBF ^ 0xB6);
        s.lIIIllIIl[117] = -(0xFFFFF27F & 0x7DDB) & (0xFFFFFCFF & 0x7F7F);
        s.lIIIllIIl[118] = 0xFFFF8D5E & 0x7FB3;
        s.lIIIllIIl[119] = 7 + 160 - 145 + 192 ^ 29 + 86 - 11 + 41;
        s.lIIIllIIl[120] = 0xD1 ^ 0x99;
        s.lIIIllIIl[121] = 129 + 12 - 102 + 121;
        s.lIIIllIIl[122] = 130 + 29 - 76 + 87;
        s.lIIIllIIl[123] = -(0xFFFFF401 & 0x7BFF) & (0xFFFFFB7F & 0x7FF3);
        s.lIIIllIIl[124] = -(0xFFFFD3C7 & 0x3E3F) & (0xFFFFBFF6 & 0x5FDF);
        s.lIIIllIIl[125] = 0x5A ^ 0x10;
        s.lIIIllIIl[126] = 0x86 ^ 0xBB ^ (0x2D ^ 0x5B);
        s.lIIIllIIl[127] = 165 + 51 - 95 + 50 + (100 + 113 - 104 + 44) - (0xFFFFFDFE & 0x317) + (18 + 86 - 13 + 43);
        s.lIIIllIIl[128] = 23 + 36 - -5 + 187 ^ 82 + 54 - 105 + 151;
        s.lIIIllIIl[129] = 0x88 ^ 0xB6 ^ (0xDC ^ 0xAC);
        s.lIIIllIIl[130] = 0x1E ^ 0x51;
        s.lIIIllIIl[131] = (0x69 ^ 0x63) + (0x71 ^ 0xB) - -(0x59 ^ 0x41) + (0x90 ^ 0xB2);
        s.lIIIllIIl[132] = 142 + 148 - 243 + 153;
        s.lIIIllIIl[133] = -(0xFFFFBB2F & 0x5EDE) & (0xFFFFBFFF & 0x5BED);
        s.lIIIllIIl[134] = 0xD8 ^ 0x89;
        s.lIIIllIIl[135] = 17 + 95 - 73 + 181 ^ 132 + 85 - 76 + 1;
        s.lIIIllIIl[136] = 130 + 27 - 25 + 21 + (17 + 17 - -78 + 24) - (117 + 56 - 50 + 21) + (0x56 ^ 0x17);
        s.lIIIllIIl[137] = 163 + 104 - 121 + 74;
        s.lIIIllIIl[138] = 0x2C ^ 0x15 ^ (0xF1 ^ 0x9B);
        s.lIIIllIIl[139] = 206 + 224 - 229 + 29 ^ 40 + 49 - 49 + 138;
        s.lIIIllIIl[140] = 0x45 ^ 0x10;
        s.lIIIllIIl[141] = 22 + 185 - 59 + 82;
        s.lIIIllIIl[142] = 4 ^ 0x52;
        s.lIIIllIIl[143] = 0x6E ^ 0x39;
        s.lIIIllIIl[144] = 0x49 ^ 0x11;
        s.lIIIllIIl[145] = 0x63 ^ 0x3A;
        s.lIIIllIIl[146] = 0x74 ^ 0x2F;
        s.lIIIllIIl[147] = -(0xFFFFBE1D & 0x63E7) & (0xFFFFEF7C & 0x37FF);
        s.lIIIllIIl[148] = 0xFFFFCED6 & 0x3769;
        s.lIIIllIIl[149] = -(0xFFFFDFB7 & 0x735E) & (0xFFFFF7FD & 0x7F7F);
        s.lIIIllIIl[150] = -(0xFFFFF8FD & 0x6786) & (0xFFFFFFDF & 0x7BFB);
        s.lIIIllIIl[151] = 0xFFFFAFF0 & 0x57DF;
        s.lIIIllIIl[152] = 0xFFFFBFBF & 0x55EE;
        s.lIIIllIIl[153] = 0xFFFFF7F7 & 0x6FC8;
        s.lIIIllIIl[154] = -(0xFFFFFD7F & 0x7E82) & (0xFFFFFFED & 0x7FFB);
        s.lIIIllIIl[155] = 0xFFFFCF7F & 0x3DFF;
        s.lIIIllIIl[156] = -(0xFFFFD8E7 & 0x671B) & (0xFFFFEFFF & 0x7ECE);
        s.lIIIllIIl[157] = -(0xFFFF9D07 & 0x7AFF) & (0xFFFFF9BE & 0x7FEF);
        s.lIIIllIIl[158] = -(0xFFFFBBF5 & 0x7CCE) & (0xFFFFBFF7 & 0x7DDF);
        s.lIIIllIIl[159] = 0xEB ^ 0x8F ^ (0x6D ^ 0x55);
        s.lIIIllIIl[160] = 0x2E ^ 0x6C ^ (0x91 ^ 0x8E);
        s.lIIIllIIl[161] = 0x72 ^ 0x2C;
        s.lIIIllIIl[162] = 0xC8 ^ 0x97;
        s.lIIIllIIl[163] = 0xFFFFEE53 & 0x1DBF;
        s.lIIIllIIl[164] = 0xFFFFAF6F & 0x5DFD;
        s.lIIIllIIl[165] = -(0xFFFFE7D3 & 0x382F) & (0xFFFFFDFF & 0x2FAF);
        s.lIIIllIIl[166] = (0x12 ^ 6) + (0x83 ^ 0x8B) - -(0x11 ^ 0x78) + (0x68 ^ 0x12);
        s.lIIIllIIl[167] = 0xFFFFEC77 & 0x1F9D;
        s.lIIIllIIl[168] = 0xFFFFAF5E & 0x5DBF;
        s.lIIIllIIl[169] = -(0xFFFF8D33 & 0x76CD) & (0xFFFFBFED & 0x4EFF);
        s.lIIIllIIl[170] = -(0xFFFFEBC7 & 0x34B9) & (0xFFFFBDF6 & 0x6FDF);
        s.lIIIllIIl[171] = 0xFFFF8FF4 & 0x7E2F;
        s.lIIIllIIl[172] = 0xFFFFEDF7 & 0x1FCF;
        s.lIIIllIIl[173] = 0x2E ^ 0x61 ^ (0xAA ^ 0x85);
        s.lIIIllIIl[174] = 116 + 109 - 146 + 133 ^ 158 + 66 - 105 + 62;
        s.lIIIllIIl[175] = 0x62 ^ 0;
        s.lIIIllIIl[176] = 0x82 ^ 0xAD ^ (0xB ^ 0x47);
        s.lIIIllIIl[177] = 0xEE ^ 0x8B;
        s.lIIIllIIl[178] = 0x4F ^ 0x29;
        s.lIIIllIIl[179] = 0x5F ^ 0x3D ^ (0x99 ^ 0x9C);
        s.lIIIllIIl[180] = 2 ^ 8 ^ (0xA1 ^ 0xC3);
        s.lIIIllIIl[181] = 0x2E ^ 0x47;
    }

    private static boolean lllIlIIlllI(int n2) {
        return n2 < 0;
    }

    private static boolean lllIlIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIlIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static String lllIlIIIIll(String lIIIlllIIIIIIII, String lIIIllIllllllll) {
        try {
            SecretKeySpec lIIIlllIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIllIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlllIIIIIlII = Cipher.getInstance("Blowfish");
            lIIIlllIIIIIlII.init(lIIIllIIl[9], lIIIlllIIIIIlIl);
            return new String(lIIIlllIIIIIlII.doFinal(Base64.getDecoder().decode(lIIIlllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlllIIIIIIll) {
            lIIIlllIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIlII() {
        lIIIllIII = new String[lIIIllIIl[181]];
        s.lIIIllIII[s.lIIIllIIl[1]] = s."Finished buying items, switching back to quest";
        s.lIIIllIII[s.lIIIllIIl[0]] = s."Waterfall";
        s.lIIIllIII[s.lIIIllIIl[9]] = s."Priest in Peril";
        s.lIIIllIII[s.lIIIllIIl[11]] = s."Ernest the Chicken";
        s.lIIIllIII[s.lIIIllIIl[13]] = s."Crafting";
        s.lIIIllIII[s.lIIIllIIl[8]] = s."Woodcutting";
        s.lIIIllIII[s.lIIIllIIl[16]] = s."Training range";
        s.lIIIllIII[s.lIIIllIIl[20]] = s."Varrock Quiz";
        s.lIIIllIII[s.lIIIllIIl[21]] = s."RFD Dwarf";
        s.lIIIllIII[s.lIIIllIIl[19]] = s."A Porcine";
        s.lIIIllIII[s.lIIIllIIl[4]] = s."Antique lamp";
        s.lIIIllIII[s.lIIIllIIl[23]] = s."Client of Kourend";
        s.lIIIllIII[s.lIIIllIIl[24]] = s."Antique lamp";
        s.lIIIllIII[s.lIIIllIIl[25]] = s."";
        s.lIIIllIII[s.lIIIllIIl[26]] = s."Nav to bank";
        s.lIIIllIII[s.lIIIllIIl[28]] = s."Handling banking";
        s.lIIIllIII[s.lIIIllIIl[35]] = s."We are missing quest supplies, switching to BUYING";
        s.lIIIllIII[s.lIIIllIIl[42]] = s."We are missing quest supplies, switching to BUYING";
        s.lIIIllIII[s.lIIIllIIl[46]] = s."Drink";
        s.lIIIllIII[s.lIIIllIIl[12]] = s."Drink";
        s.lIIIllIII[s.lIIIllIIl[48]] = s."Shark";
        s.lIIIllIII[s.lIIIllIIl[49]] = s."Shark";
        s.lIIIllIII[s.lIIIllIIl[50]] = s."Eat";
        s.lIIIllIII[s.lIIIllIIl[51]] = s."Nav to start";
        s.lIIIllIII[s.lIIIllIIl[47]] = s."Ava";
        s.lIIIllIII[s.lIIIllIIl[54]] = s."Bookcase";
        s.lIIIllIII[s.lIIIllIIl[55]] = s."Search";
        s.lIIIllIII[s.lIIIllIIl[57]] = s."Bookcase";
        s.lIIIllIII[s.lIIIllIIl[58]] = s."Search";
        s.lIIIllIII[s.lIIIllIIl[59]] = s."Wear";
        s.lIIIllIII[s.lIIIllIIl[64]] = s."Nav to charter";
        s.lIIIllIII[s.lIIIllIIl[65]] = s."Trader Crewmember";
        s.lIIIllIII[s.lIIIllIIl[10]] = s."Trade";
        s.lIIIllIII[s.lIIIllIIl[66]] = s."Break";
        s.lIIIllIII[s.lIIIllIIl[67]] = s."Nav to ecto";
        s.lIIIllIII[s.lIIIllIIl[14]] = s."Bones";
        s.lIIIllIII[s.lIIIllIIl[68]] = s."Staircase";
        s.lIIIllIII[s.lIIIllIIl[69]] = s."Climb-up";
        s.lIIIllIII[s.lIIIllIIl[70]] = s."Loader";
        s.lIIIllIII[s.lIIIllIIl[71]] = s."Bones";
        s.lIIIllIII[s.lIIIllIIl[22]] = s."Bones";
        s.lIIIllIII[s.lIIIllIIl[72]] = s."Loader";
        s.lIIIllIII[s.lIIIllIIl[75]] = s."Bones";
        s.lIIIllIII[s.lIIIllIIl[76]] = s."Staircase";
        s.lIIIllIII[s.lIIIllIIl[77]] = s."Climb-down";
        s.lIIIllIII[s.lIIIllIIl[78]] = s."Bonemeal";
        s.lIIIllIII[s.lIIIllIIl[79]] = s."Ectofuntus";
        s.lIIIllIII[s.lIIIllIIl[80]] = s."Worship";
        s.lIIIllIII[s.lIIIllIIl[81]] = s."Bonemeal";
        s.lIIIllIII[s.lIIIllIIl[82]] = s."Ghost disciple";
        s.lIIIllIII[s.lIIIllIIl[15]] = s."Malcolm";
        s.lIIIllIII[s.lIIIllIIl[84]] = s."Alice";
        s.lIIIllIII[s.lIIIllIIl[85]] = s."Malcolm";
        s.lIIIllIII[s.lIIIllIIl[86]] = s."Alice";
        s.lIIIllIII[s.lIIIllIIl[87]] = s."Malcolm";
        s.lIIIllIII[s.lIIIllIIl[88]] = s."Alice";
        s.lIIIllIII[s.lIIIllIIl[93]] = s."Nav to crone";
        s.lIIIllIII[s.lIIIllIIl[94]] = s."Old crone";
        s.lIIIllIII[s.lIIIllIIl[96]] = s."Malcolm";
        s.lIIIllIII[s.lIIIllIIl[98]] = s."Malcolm";
        s.lIIIllIII[s.lIIIllIIl[6]] = s."Malcolm";
        s.lIIIllIII[s.lIIIllIIl[101]] = s."Undead chicken";
        s.lIIIllIII[s.lIIIllIIl[102]] = s."Iron bar";
        s.lIIIllIII[s.lIIIllIIl[104]] = s."Iron bar";
        s.lIIIllIII[s.lIIIllIIl[107]] = s."Witch";
        s.lIIIllIII[s.lIIIllIIl[3]] = s."Witch";
        s.lIIIllIII[s.lIIIllIIl[109]] = s."Bar magnet";
        s.lIIIllIII[s.lIIIllIIl[113]] = s."Nav to mine";
        s.lIIIllIII[s.lIIIllIIl[114]] = s."Hammer";
        s.lIIIllIII[s.lIIIllIIl[115]] = s."Selected iron";
        s.lIIIllIII[s.lIIIllIIl[89]] = s."Bar magnet";
        s.lIIIllIII[s.lIIIllIIl[119]] = s."Undead tree";
        s.lIIIllIII[s.lIIIllIIl[120]] = s."Chop";
        s.lIIIllIII[s.lIIIllIIl[90]] = s."Wear";
        s.lIIIllIII[s.lIIIllIIl[125]] = s."Nav to npc";
        s.lIIIllIII[s.lIIIllIIl[126]] = s."Turael";
        s.lIIIllIII[s.lIIIllIIl[95]] = s."Turael";
        s.lIIIllIII[s.lIIIllIIl[128]] = s."Undead twigs";
        s.lIIIllIII[s.lIIIllIIl[129]] = s."Undead tree";
        s.lIIIllIII[s.lIIIllIIl[130]] = s."Chop";
        s.lIIIllIII[s.lIIIllIIl[97]] = s."Undead twigs";
        s.lIIIllIII[s.lIIIllIIl[134]] = s."Research notes";
        s.lIIIllIII[s.lIIIllIIl[135]] = s."Translate";
        s.lIIIllIII[s.lIIIllIIl[138]] = s."A pattern";
        s.lIIIllIII[s.lIIIllIIl[139]] = s."A pattern";
        s.lIIIllIII[s.lIIIllIIl[140]] = s."Hard leather";
        s.lIIIllIII[s.lIIIllIIl[142]] = s."Bookcase";
        s.lIIIllIII[s.lIIIllIIl[143]] = s."Search";
        s.lIIIllIII[s.lIIIllIIl[144]] = s."Nav to start";
        s.lIIIllIII[s.lIIIllIIl[145]] = s."Ava";
        s.lIIIllIII[s.lIIIllIIl[99]] = s."Bookcase";
        s.lIIIllIII[s.lIIIllIIl[146]] = s."Search";
        s.lIIIllIII[s.lIIIllIIl[159]] = s."";
        s.lIIIllIII[s.lIIIllIIl[160]] = s."Animal Magnetism";
        s.lIIIllIII[s.lIIIllIIl[161]] = s."ring of wealth (";
        s.lIIIllIII[s.lIIIllIIl[162]] = s."Drop";
        s.lIIIllIII[s.lIIIllIIl[173]] = s."Yes.";
        s.lIIIllIII[s.lIIIllIIl[174]] = s."I'm here about a quest.";
        s.lIIIllIII[s.lIIIllIIl[175]] = s."Okay, you need it more than I do, I suppose.";
        s.lIIIllIII[s.lIIIllIIl[176]] = s."Could I buy those chickens now, then?";
        s.lIIIllIII[s.lIIIllIIl[100]] = s."Could I buy 2 chickens?";
        s.lIIIllIII[s.lIIIllIIl[177]] = s."I'm here about a quest.";
        s.lIIIllIII[s.lIIIllIIl[178]] = s."Hello, I'm here about those trees again.";
        s.lIIIllIII[s.lIIIllIIl[179]] = s."I'd love one, thanks.";
        s.lIIIllIII[s.lIIIllIIl[180]] = s."";
    }

    private static boolean lllIlIIllII(Object object) {
        return object != null;
    }
}

