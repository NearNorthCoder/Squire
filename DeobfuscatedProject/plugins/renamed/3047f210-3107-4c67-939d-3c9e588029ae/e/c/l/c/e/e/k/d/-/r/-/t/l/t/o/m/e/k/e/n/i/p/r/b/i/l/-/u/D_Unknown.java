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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
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

public class D_Unknown
implements S {
    public static /* synthetic */ List<d> bu;
    private static /* synthetic */ int[] llllIlIlII;
    static /* synthetic */ boolean gT;
    static /* synthetic */ boolean gR;
    public static /* synthetic */ boolean bs;
    public static final /* synthetic */ WorldPoint gP;
    private static /* synthetic */ String[] llllIIllII;
    public static final /* synthetic */ WorldPoint gO;
    static /* synthetic */ boolean gU;
    public static /* synthetic */ String[] bQ;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ WorldPoint gQ;
    static /* synthetic */ boolean gS;
    public static final /* synthetic */ WorldPoint gN;
    static /* synthetic */ int ck;

    private static boolean llIIllllllIII(Object object, Object object2) {
        return object == object2;
    }

    private static String llIIllIllIIlI(String var32, String var16) {
        try {
            SecretKeySpec var34 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(llllIlIlII[2], var34);
            return new String(var2.doFinal(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void var24;
        int[] nArray = new int[llllIlIlII[9]];
        nArray[D.llllIlIlII[0]] = llllIlIlII[19];
        nArray[D.llllIlIlII[1]] = llllIlIlII[37];
        nArray[D.llllIlIlII[2]] = llllIlIlII[46];
        nArray[D.llllIlIlII[7]] = llllIlIlII[39];
        int[] nArray2 = nArray;
        int var5 = llllIlIlII[0];
        while (D.llIIllllIllIl(var5, ((void)var24).length)) {
            int[] nArray3 = new int[llllIlIlII[1]];
            nArray3[D.llllIlIlII[0]] = var24[var5];
            if (D.llIIllllIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llllIlIlII[0];
            }
            ++var5;
            0;
            if (3 != 0) continue;
            return false;
        }
        return llllIlIlII[1];
    }

    private static void ae() {
        block50: {
            d var27;
            block49: {
                block48: {
                    block47: {
                        block46: {
                            block45: {
                                Object var37;
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
                                                                        int[] nArray = new int[llllIlIlII[1]];
                                                                        nArray[D.llllIlIlII[0]] = llllIlIlII[27];
                                                                        if (!D.llIIllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray2 = new int[llllIlIlII[1]];
                                                                        nArray2[D.llllIlIlII[0]] = llllIlIlII[27];
                                                                        if (!D.llIIllllIllII(Bank.contains((int[])nArray2) ? 1 : 0)) break block36;
                                                                        int[] nArray3 = new int[llllIlIlII[1]];
                                                                        nArray3[D.llllIlIlII[0]] = llllIlIlII[27];
                                                                        if (!D.llIIllllIllIl(Bank.getFirst((int[])nArray3).getQuantity(), llllIlIlII[7])) break block36;
                                                                    }
                                                                    var37 = new d(llllIlIlII[27], llllIlIlII[7], llllIlIlII[309]);
                                                                    bu.add((d)var37);
                                                                    0;
                                                                }
                                                                int[] nArray = new int[llllIlIlII[1]];
                                                                nArray[D.llllIlIlII[0]] = llllIlIlII[35];
                                                                if (!D.llIIllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray4 = new int[llllIlIlII[1]];
                                                                nArray4[D.llllIlIlII[0]] = llllIlIlII[35];
                                                                if (!D.llIIllllIllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block38;
                                                                int[] nArray5 = new int[llllIlIlII[1]];
                                                                nArray5[D.llllIlIlII[0]] = llllIlIlII[35];
                                                                if (!D.llIIllllIllIl(Bank.getFirst((int[])nArray5).getQuantity(), llllIlIlII[63])) break block38;
                                                            }
                                                            var37 = new d(llllIlIlII[35], llllIlIlII[63], llllIlIlII[309]);
                                                            bu.add((d)var37);
                                                            0;
                                                        }
                                                        int[] nArray = new int[llllIlIlII[1]];
                                                        nArray[D.llllIlIlII[0]] = llllIlIlII[39];
                                                        if (D.llIIllllIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                            var37 = new d(llllIlIlII[39], llllIlIlII[1], llllIlIlII[310]);
                                                            bu.add((d)var37);
                                                            0;
                                                        }
                                                        int[] nArray6 = new int[llllIlIlII[1]];
                                                        nArray6[D.llllIlIlII[0]] = llllIlIlII[41];
                                                        if (D.llIIllllIlllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                                            var37 = new d(llllIlIlII[41], llllIlIlII[1], llllIlIlII[311]);
                                                            bu.add((d)var37);
                                                            0;
                                                        }
                                                        int[] nArray7 = new int[llllIlIlII[1]];
                                                        nArray7[D.llllIlIlII[0]] = llllIlIlII[44];
                                                        if (D.llIIllllIlllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                            var37 = new d(llllIlIlII[44], llllIlIlII[1], llllIlIlII[312]);
                                                            bu.add((d)var37);
                                                            0;
                                                        }
                                                        int[] nArray8 = new int[llllIlIlII[1]];
                                                        nArray8[D.llllIlIlII[0]] = llllIlIlII[42];
                                                        if (D.llIIllllIlllI(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                            var37 = new d(llllIlIlII[42], llllIlIlII[7], llllIlIlII[310]);
                                                            bu.add((d)var37);
                                                            0;
                                                        }
                                                        int[] nArray9 = new int[llllIlIlII[1]];
                                                        nArray9[D.llllIlIlII[0]] = llllIlIlII[24];
                                                        if (!D.llIIllllIllII(Bank.contains((int[])nArray9) ? 1 : 0)) break block39;
                                                        int[] nArray10 = new int[llllIlIlII[1]];
                                                        nArray10[D.llllIlIlII[0]] = llllIlIlII[24];
                                                        if (!D.llIIllllIllII(Bank.contains((int[])nArray10) ? 1 : 0)) break block40;
                                                        int[] nArray11 = new int[llllIlIlII[1]];
                                                        nArray11[D.llllIlIlII[0]] = llllIlIlII[24];
                                                        if (!D.llIIllllIllIl(Bank.getFirst((int[])nArray11).getQuantity(), llllIlIlII[25])) break block40;
                                                    }
                                                    var37 = new d(llllIlIlII[24], llllIlIlII[25], llllIlIlII[309]);
                                                    bu.add((d)var37);
                                                    0;
                                                }
                                                int[] nArray = new int[llllIlIlII[1]];
                                                nArray[D.llllIlIlII[0]] = llllIlIlII[36];
                                                if (D.llIIllllIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    var37 = new d(llllIlIlII[36], llllIlIlII[1], i.bp);
                                                    bu.add((d)var37);
                                                    0;
                                                }
                                                int[] nArray12 = new int[llllIlIlII[1]];
                                                nArray12[D.llllIlIlII[0]] = llllIlIlII[34];
                                                if (D.llIIllllIlllI(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                                    var37 = new d(llllIlIlII[34], llllIlIlII[1], i.bp);
                                                    bu.add((d)var37);
                                                    0;
                                                }
                                                int[] nArray13 = new int[llllIlIlII[1]];
                                                nArray13[D.llllIlIlII[0]] = llllIlIlII[33];
                                                if (D.llIIllllIlllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                                    var37 = new d(llllIlIlII[33], llllIlIlII[1], i.bp);
                                                    bu.add((d)var37);
                                                    0;
                                                }
                                                int[] nArray14 = new int[llllIlIlII[1]];
                                                nArray14[D.llllIlIlII[0]] = llllIlIlII[32];
                                                if (D.llIIllllIlllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                                    var37 = new d(llllIlIlII[32], llllIlIlII[1], i.bp);
                                                    bu.add((d)var37);
                                                    0;
                                                }
                                                int[] nArray15 = new int[llllIlIlII[1]];
                                                nArray15[D.llllIlIlII[0]] = llllIlIlII[30];
                                                if (D.llIIllllIlllI(Bank.contains((int[])nArray15) ? 1 : 0)) {
                                                    var37 = new d(llllIlIlII[30], llllIlIlII[1], i.bp);
                                                    bu.add((d)var37);
                                                    0;
                                                }
                                                int[] nArray16 = new int[llllIlIlII[1]];
                                                nArray16[D.llllIlIlII[0]] = llllIlIlII[31];
                                                if (D.llIIllllIlllI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                                    var37 = new d(llllIlIlII[31], llllIlIlII[1], i.bp);
                                                    bu.add((d)var37);
                                                    0;
                                                }
                                                int[] nArray17 = new int[llllIlIlII[1]];
                                                nArray17[D.llllIlIlII[0]] = llllIlIlII[37];
                                                if (!D.llIIllllIllII(Bank.contains((int[])nArray17) ? 1 : 0)) break block41;
                                                int[] nArray18 = new int[llllIlIlII[1]];
                                                nArray18[D.llllIlIlII[0]] = llllIlIlII[37];
                                                if (!D.llIIllllIllII(Bank.contains((int[])nArray18) ? 1 : 0)) break block42;
                                                int[] nArray19 = new int[llllIlIlII[1]];
                                                nArray19[D.llllIlIlII[0]] = llllIlIlII[37];
                                                if (!D.llIIllllIllIl(Bank.getFirst((int[])nArray19).getQuantity(), llllIlIlII[23])) break block42;
                                            }
                                            var37 = new d(llllIlIlII[37], llllIlIlII[23], i.bp);
                                            bu.add((d)var37);
                                            0;
                                        }
                                        int[] nArray = new int[llllIlIlII[1]];
                                        nArray[D.llllIlIlII[0]] = llllIlIlII[45];
                                        if (!D.llIIllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                                        int[] nArray20 = new int[llllIlIlII[1]];
                                        nArray20[D.llllIlIlII[0]] = llllIlIlII[45];
                                        if (!D.llIIllllIllII(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                                        int[] nArray21 = new int[llllIlIlII[1]];
                                        nArray21[D.llllIlIlII[0]] = llllIlIlII[45];
                                        if (!D.llIIllllIllIl(Bank.getFirst((int[])nArray21).getQuantity(), llllIlIlII[23])) break block44;
                                    }
                                    var37 = new d(llllIlIlII[45], llllIlIlII[23], llllIlIlII[47]);
                                    bu.add((d)var37);
                                    0;
                                }
                                if (D.llIIllllIlllI(Bank.contains((Predicate)(var37 = item -> item.getName().toLowerCase().contains(llllIIllII[llllIlIlII[316]]))) ? 1 : 0)) {
                                    var27 = new d(llllIlIlII[313], llllIlIlII[11], llllIlIlII[311]);
                                    bu.add(var27);
                                    0;
                                }
                                int[] nArray = new int[llllIlIlII[1]];
                                nArray[D.llllIlIlII[0]] = llllIlIlII[19];
                                if (!D.llIIllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                                int[] nArray22 = new int[llllIlIlII[1]];
                                nArray22[D.llllIlIlII[0]] = llllIlIlII[19];
                                if (!D.llIIllllIllII(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                                int[] nArray23 = new int[llllIlIlII[1]];
                                nArray23[D.llllIlIlII[0]] = llllIlIlII[19];
                                if (!D.llIIllllIllIl(Bank.getFirst((int[])nArray23).getQuantity(), llllIlIlII[20])) break block46;
                            }
                            var27 = new d(llllIlIlII[19], llllIlIlII[10], llllIlIlII[314]);
                            bu.add(var27);
                            0;
                        }
                        int[] nArray = new int[llllIlIlII[1]];
                        nArray[D.llllIlIlII[0]] = llllIlIlII[22];
                        if (!D.llIIllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block47;
                        int[] nArray24 = new int[llllIlIlII[1]];
                        nArray24[D.llllIlIlII[0]] = llllIlIlII[22];
                        if (!D.llIIllllIllII(Bank.contains((int[])nArray24) ? 1 : 0)) break block48;
                        int[] nArray25 = new int[llllIlIlII[1]];
                        nArray25[D.llllIlIlII[0]] = llllIlIlII[22];
                        if (!D.llIIllllIllIl(Bank.getFirst((int[])nArray25).getQuantity(), llllIlIlII[20])) break block48;
                    }
                    var27 = new d(llllIlIlII[22], llllIlIlII[10], llllIlIlII[314]);
                    bu.add(var27);
                    0;
                }
                int[] nArray = new int[llllIlIlII[1]];
                nArray[D.llllIlIlII[0]] = llllIlIlII[21];
                if (!D.llIIllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block49;
                int[] nArray26 = new int[llllIlIlII[1]];
                nArray26[D.llllIlIlII[0]] = llllIlIlII[21];
                if (!D.llIIllllIllII(Bank.contains((int[])nArray26) ? 1 : 0)) break block50;
                int[] nArray27 = new int[llllIlIlII[1]];
                nArray27[D.llllIlIlII[0]] = llllIlIlII[21];
                if (!D.llIIllllIllIl(Bank.getFirst((int[])nArray27).getQuantity(), llllIlIlII[20])) break block50;
            }
            var27 = new d(llllIlIlII[21], llllIlIlII[10], llllIlIlII[314]);
            bu.add(var27);
            0;
        }
    }

    private static boolean llIIlllllIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIllllIllII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void ci() {
        void var28;
        BankLocation bankLocation = BankLocation.getNearest();
        if (D.llIIlllllIIlI(bankLocation) && D.llIIllllIlllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[306]];
            Movement.walkTo((BankLocation)bankLocation);
            0;
            Time.sleepTicks((int)llllIlIlII[2]);
            0;
        }
        if (D.llIIlllllIIlI(var28) && D.llIIllllIllII(var28.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[307]];
            if (D.llIIllllIlllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIlII[18]);
                0;
            }
            if (D.llIIllllIllII(Bank.isOpen() ? 1 : 0)) {
                if (D.llIIlllllIIII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llllIlIlII[9]);
                    0;
                }
                a.a(llllIlIlII[19], llllIlIlII[11]);
                a.a(llllIlIlII[22], llllIlIlII[11]);
                a.a(llllIlIlII[21], llllIlIlII[11]);
                a.b(f.aU, llllIlIlII[2]);
                a.a(llllIlIlII[45], llllIlIlII[7]);
                a.a(llllIlIlII[33], llllIlIlII[1]);
                a.a(llllIlIlII[32], llllIlIlII[1]);
                a.a(llllIlIlII[30], llllIlIlII[1]);
                a.a(llllIlIlII[31], llllIlIlII[1]);
                a.a(llllIlIlII[46], llllIlIlII[47]);
                Bank.withdraw((String)llllIIllII[llllIlIlII[308]], (int)llllIlIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                int[] nArray = new int[llllIlIlII[1]];
                nArray[D.llllIlIlII[0]] = llllIlIlII[36];
                if (D.llIIllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llllIlIlII[1]];
                    nArray2[D.llllIlIlII[0]] = llllIlIlII[36];
                    if (D.llIIllllIlllI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdraw((int)llllIlIlII[36], (int)llllIlIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
                a.a(llllIlIlII[35], Inventory.getFreeSlots());
            }
        }
    }

    private static boolean llIIlllllIIlI(Object object) {
        return object != null;
    }

    private static String llIIllIllIlII(String var3, String var22) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var14 = var22.toCharArray();
        int var26 = llllIlIlII[0];
        char[] var1 = var3.toCharArray();
        int var12 = var1.length;
        int var8 = llllIlIlII[0];
        while (D.llIIllllIllIl(var8, var12)) {
            char var10 = var1[var8];
            var23.append((char)(var10 ^ var14[var26 % var14.length]));
            0;
            ++var26;
            ++var8;
            0;
            if ((112 + 115 - 132 + 53 ^ 116 + 102 - 112 + 38) >= 0) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    private static boolean llIIlllllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void cf() {
        block211: {
            WorldPoint var9;
            WorldPoint var35;
            BankLocation var29;
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
                                                    if (D.llIIllllIllII(bs ? 1 : 0)) {
                                                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[0]];
                                                        b.a(bu);
                                                        if (D.llIIllllIllIl(bu.size(), llllIlIlII[1])) {
                                                            System.out.println(llllIIllII[llllIlIlII[1]]);
                                                            bs = llllIlIlII[0];
                                                        }
                                                    }
                                                    if (!D.llIIllllIlllI(bs ? 1 : 0)) break block211;
                                                    String[] stringArray = new String[llllIlIlII[1]];
                                                    stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[2]];
                                                    if (D.llIIllllIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        gU = llllIlIlII[1];
                                                        gT = llllIlIlII[1];
                                                        gR = llllIlIlII[1];
                                                        gS = llllIlIlII[1];
                                                    }
                                                    int[] nArray = new int[llllIlIlII[1]];
                                                    nArray[D.llllIlIlII[0]] = llllIlIlII[3];
                                                    if (D.llIIllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                        gT = llllIlIlII[1];
                                                    }
                                                    int[] nArray2 = new int[llllIlIlII[1]];
                                                    nArray2[D.llllIlIlII[0]] = llllIlIlII[4];
                                                    if (D.llIIllllIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                                        gR = llllIlIlII[1];
                                                    }
                                                    int[] nArray3 = new int[llllIlIlII[1]];
                                                    nArray3[D.llllIlIlII[0]] = llllIlIlII[5];
                                                    if (D.llIIllllIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                                        gS = llllIlIlII[1];
                                                    }
                                                    if (D.llIIllllIllII(Inventory.contains((int[])f.aU) ? 1 : 0) && D.llIIllllIllIl(Movement.getRunEnergy(), llllIlIlII[6])) {
                                                        Inventory.getFirst((int[])f.aU).interact(llllIIllII[llllIlIlII[7]]);
                                                        Time.sleepTicks((int)llllIlIlII[1]);
                                                        0;
                                                    }
                                                    if (D.llIIllllIllII(Inventory.contains((int[])f.aR) ? 1 : 0) && D.llIIllllIllIl(Prayers.getPoints(), llllIlIlII[8])) {
                                                        Inventory.getFirst((int[])f.aR).interact(llllIIllII[llllIlIlII[9]]);
                                                    }
                                                    if (!D.llIIllllIllIl(Combat.getMissingHealth(), llllIlIlII[10]) || D.llIIllllIllll(D.llIIllllIlIll(e.u(), 51.0))) {
                                                        String[] stringArray2 = new String[llllIlIlII[1]];
                                                        stringArray2[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[11]];
                                                        if (D.llIIllllIllII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                                            String[] stringArray3 = new String[llllIlIlII[1]];
                                                            stringArray3[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[12]];
                                                            Inventory.getFirst((String[])stringArray3).interact(llllIIllII[llllIlIlII[13]]);
                                                        }
                                                    }
                                                    if (D.llIIllllIlllI(Movement.isRunEnabled() ? 1 : 0) && D.llIIlllllIIII(Movement.getRunEnergy())) {
                                                        Movement.toggleRun();
                                                    }
                                                    if (!D.llIIllllIlllI(D.aa() ? 1 : 0) || !D.llIIllllIllIl(e.j(llllIlIlII[14]), llllIlIlII[2]) || !D.llIIlllllIIIl(e.H(), llllIlIlII[15])) break block212;
                                                    var29 = BankLocation.getNearest();
                                                    if (D.llIIlllllIIlI(var29) && D.llIIllllIlllI(var29.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[16]];
                                                        Movement.walkTo((BankLocation)var29);
                                                        0;
                                                        Time.sleepTicks((int)llllIlIlII[2]);
                                                        0;
                                                    }
                                                    if (!D.llIIlllllIIlI(var29) || !D.llIIllllIllII(var29.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block212;
                                                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[17]];
                                                    if (D.llIIllllIlllI(Bank.isOpen() ? 1 : 0)) {
                                                        a.a();
                                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIlII[18]);
                                                        0;
                                                    }
                                                    if (!D.llIIllllIllII(Bank.isOpen() ? 1 : 0)) break block212;
                                                    if (D.llIIlllllIIII(Inventory.getAll().size())) {
                                                        Bank.depositInventory();
                                                        Time.sleepTicks((int)llllIlIlII[9]);
                                                        0;
                                                    }
                                                    if (D.llIIlllllIIII(Equipment.getAll().size())) {
                                                        Bank.depositEquipment();
                                                        Time.sleepTicks((int)llllIlIlII[2]);
                                                        0;
                                                    }
                                                    int[] nArray4 = new int[llllIlIlII[1]];
                                                    nArray4[D.llllIlIlII[0]] = llllIlIlII[19];
                                                    if (!D.llIIllllIllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block213;
                                                    int[] nArray5 = new int[llllIlIlII[1]];
                                                    nArray5[D.llllIlIlII[0]] = llllIlIlII[19];
                                                    if (!D.llIIlllllIIIl(Bank.getFirst((int[])nArray5).getQuantity(), llllIlIlII[20])) break block214;
                                                }
                                                int[] nArray = new int[llllIlIlII[1]];
                                                nArray[D.llllIlIlII[0]] = llllIlIlII[21];
                                                if (!D.llIIllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block215;
                                                int[] nArray6 = new int[llllIlIlII[1]];
                                                nArray6[D.llllIlIlII[0]] = llllIlIlII[21];
                                                if (!D.llIIlllllIIIl(Bank.getFirst((int[])nArray6).getQuantity(), llllIlIlII[20])) break block214;
                                            }
                                            int[] nArray = new int[llllIlIlII[1]];
                                            nArray[D.llllIlIlII[0]] = llllIlIlII[22];
                                            if (!D.llIIllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block216;
                                            int[] nArray7 = new int[llllIlIlII[1]];
                                            nArray7[D.llllIlIlII[0]] = llllIlIlII[22];
                                            if (!D.llIIllllIllIl(Bank.getFirst((int[])nArray7).getQuantity(), llllIlIlII[20])) break block216;
                                        }
                                        D.ae();
                                        System.out.println(llllIIllII[llllIlIlII[23]]);
                                        bs = llllIlIlII[1];
                                        return;
                                    }
                                    int[] nArray = new int[llllIlIlII[1]];
                                    nArray[D.llllIlIlII[0]] = llllIlIlII[24];
                                    if (D.llIIllllIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray8 = new int[llllIlIlII[1]];
                                        nArray8[D.llllIlIlII[0]] = llllIlIlII[24];
                                        if (D.llIIllllIllIl(Bank.getFirst((int[])nArray8).getQuantity(), llllIlIlII[25])) {
                                            D.ae();
                                            System.out.println(llllIIllII[llllIlIlII[26]]);
                                            bs = llllIlIlII[1];
                                            return;
                                        }
                                    }
                                    int[] nArray9 = new int[llllIlIlII[1]];
                                    nArray9[D.llllIlIlII[0]] = llllIlIlII[27];
                                    if (D.llIIllllIllII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                        int[] nArray10 = new int[llllIlIlII[1]];
                                        nArray10[D.llllIlIlII[0]] = llllIlIlII[27];
                                        if (D.llIIllllIllIl(Bank.getFirst((int[])nArray10).getQuantity(), llllIlIlII[7])) {
                                            D.ae();
                                            System.out.println(llllIIllII[llllIlIlII[28]]);
                                            bs = llllIlIlII[1];
                                            return;
                                        }
                                    }
                                    int[] nArray11 = new int[llllIlIlII[29]];
                                    nArray11[D.llllIlIlII[0]] = llllIlIlII[19];
                                    nArray11[D.llllIlIlII[1]] = llllIlIlII[22];
                                    nArray11[D.llllIlIlII[2]] = llllIlIlII[21];
                                    nArray11[D.llllIlIlII[7]] = llllIlIlII[30];
                                    nArray11[D.llllIlIlII[9]] = llllIlIlII[31];
                                    nArray11[D.llllIlIlII[11]] = llllIlIlII[32];
                                    nArray11[D.llllIlIlII[12]] = llllIlIlII[33];
                                    nArray11[D.llllIlIlII[13]] = llllIlIlII[34];
                                    nArray11[D.llllIlIlII[16]] = llllIlIlII[35];
                                    nArray11[D.llllIlIlII[17]] = llllIlIlII[36];
                                    nArray11[D.llllIlIlII[23]] = llllIlIlII[24];
                                    nArray11[D.llllIlIlII[26]] = llllIlIlII[27];
                                    nArray11[D.llllIlIlII[28]] = llllIlIlII[37];
                                    nArray11[D.llllIlIlII[38]] = llllIlIlII[39];
                                    nArray11[D.llllIlIlII[40]] = llllIlIlII[41];
                                    nArray11[D.llllIlIlII[20]] = llllIlIlII[42];
                                    nArray11[D.llllIlIlII[43]] = llllIlIlII[44];
                                    if (D.llIIllllIlllI(e.b(nArray11) ? 1 : 0)) {
                                        D.ae();
                                        System.out.println(llllIIllII[llllIlIlII[38]]);
                                        bs = llllIlIlII[1];
                                        return;
                                    }
                                    int[] nArray12 = new int[llllIlIlII[29]];
                                    nArray12[D.llllIlIlII[0]] = llllIlIlII[19];
                                    nArray12[D.llllIlIlII[1]] = llllIlIlII[22];
                                    nArray12[D.llllIlIlII[2]] = llllIlIlII[21];
                                    nArray12[D.llllIlIlII[7]] = llllIlIlII[30];
                                    nArray12[D.llllIlIlII[9]] = llllIlIlII[31];
                                    nArray12[D.llllIlIlII[11]] = llllIlIlII[32];
                                    nArray12[D.llllIlIlII[12]] = llllIlIlII[33];
                                    nArray12[D.llllIlIlII[13]] = llllIlIlII[34];
                                    nArray12[D.llllIlIlII[16]] = llllIlIlII[35];
                                    nArray12[D.llllIlIlII[17]] = llllIlIlII[36];
                                    nArray12[D.llllIlIlII[23]] = llllIlIlII[24];
                                    nArray12[D.llllIlIlII[26]] = llllIlIlII[27];
                                    nArray12[D.llllIlIlII[28]] = llllIlIlII[37];
                                    nArray12[D.llllIlIlII[38]] = llllIlIlII[39];
                                    nArray12[D.llllIlIlII[40]] = llllIlIlII[41];
                                    nArray12[D.llllIlIlII[20]] = llllIlIlII[42];
                                    nArray12[D.llllIlIlII[43]] = llllIlIlII[44];
                                    if (D.llIIllllIllII(e.b(nArray12) ? 1 : 0)) {
                                        a.a(llllIlIlII[19], llllIlIlII[11]);
                                        a.a(llllIlIlII[22], llllIlIlII[11]);
                                        a.a(llllIlIlII[21], llllIlIlII[11]);
                                        a.b(f.aU, llllIlIlII[11]);
                                        a.a(llllIlIlII[35], llllIlIlII[13]);
                                        a.b(f.be, llllIlIlII[1]);
                                        a.a(llllIlIlII[42], llllIlIlII[1]);
                                        a.a(llllIlIlII[44], llllIlIlII[1]);
                                        a.a(llllIlIlII[39], llllIlIlII[1]);
                                        a.a(llllIlIlII[36], llllIlIlII[1]);
                                        a.a(llllIlIlII[45], llllIlIlII[2]);
                                        a.a(llllIlIlII[46], llllIlIlII[47]);
                                    }
                                }
                                if (D.llIIllllIllII(D.aa() ? 1 : 0) && D.llIIllllIllIl(e.j(llllIlIlII[14]), llllIlIlII[1])) {
                                    if (D.llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(gN), llllIlIlII[12])) {
                                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[40]];
                                        Movement.walkTo((WorldPoint)gN);
                                        0;
                                        Time.sleepTicks((int)llllIlIlII[1]);
                                        0;
                                    }
                                    if (D.llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(gN), llllIlIlII[12])) {
                                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[20]];
                                        g.a(llllIIllII[llllIlIlII[43]], bQ, llllIlIlII[1]);
                                    }
                                }
                                if (D.llIIlllllIlIl(e.j(llllIlIlII[14]), llllIlIlII[1]) && D.llIIllllIllII(D.aa() ? 1 : 0)) {
                                    var29 = new WorldPoint(llllIlIlII[48], llllIlIlII[49], llllIlIlII[0]);
                                    if (D.llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var29), llllIlIlII[16])) {
                                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[29]];
                                        Movement.walkTo((WorldPoint)var29);
                                        0;
                                        Time.sleepTicks((int)llllIlIlII[1]);
                                        0;
                                    }
                                    if (D.llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var29), llllIlIlII[16])) {
                                        g.a(llllIIllII[llllIlIlII[50]], bQ, llllIlIlII[1]);
                                    }
                                }
                                if (!D.llIIlllllIlIl(e.j(llllIlIlII[14]), llllIlIlII[2])) break block217;
                                ck = llllIlIlII[0];
                                int[] nArray = new int[llllIlIlII[1]];
                                nArray[D.llllIlIlII[0]] = llllIlIlII[44];
                                if (D.llIIllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray13 = new int[llllIlIlII[1]];
                                    nArray13[D.llllIlIlII[0]] = llllIlIlII[44];
                                    if (D.llIIllllIlllI(Equipment.contains((int[])nArray13) ? 1 : 0)) {
                                        String[] stringArray = new String[llllIlIlII[1]];
                                        stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[51]];
                                        Inventory.getFirst((String[])stringArray).interact(llllIIllII[llllIlIlII[10]]);
                                    }
                                }
                                if (D.llIIllllIllII(Inventory.contains(item -> item.getName().contains(llllIIllII[llllIlIlII[340]])) ? 1 : 0) && D.llIIllllIlllI(Equipment.contains(item -> item.getName().contains(llllIIllII[llllIlIlII[339]])) ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(llllIIllII[llllIlIlII[338]])).interact(llllIIllII[llllIlIlII[52]]);
                                }
                                if (D.llIIllllIllII(Inventory.contains(item -> item.getName().contains(llllIIllII[llllIlIlII[337]])) ? 1 : 0) && D.llIIllllIlllI(Equipment.contains(item -> item.getName().contains(llllIIllII[llllIlIlII[336]])) ? 1 : 0)) {
                                    Inventory.getFirst(item -> item.getName().contains(llllIIllII[llllIlIlII[335]])).interact(llllIIllII[llllIlIlII[53]]);
                                }
                                if (!D.llIIlllllIllI(Vars.getBit((int)llllIlIlII[54]), llllIlIlII[1])) break block218;
                                String[] stringArray = new String[llllIlIlII[1]];
                                stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[55]];
                                if (!D.llIIllllIlllI(Inventory.contains((String[])stringArray) ? 1 : 0) || !D.llIIllllIlllI(gU ? 1 : 0)) break block219;
                            }
                            if (D.llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(gN), llllIlIlII[12])) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[8]];
                                if (D.llIIllllIllII(Inventory.isFull() ? 1 : 0)) {
                                    int[] nArray = new int[llllIlIlII[1]];
                                    nArray[D.llllIlIlII[0]] = llllIlIlII[35];
                                    if (D.llIIllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray14 = new int[llllIlIlII[1]];
                                        nArray14[D.llllIlIlII[0]] = llllIlIlII[35];
                                        Inventory.getFirst((int[])nArray14).interact(llllIIllII[llllIlIlII[56]]);
                                        Time.sleepTicks((int)llllIlIlII[1]);
                                        0;
                                    }
                                }
                                Movement.walkTo((WorldPoint)gN);
                                0;
                                Time.sleepTicks((int)llllIlIlII[1]);
                                0;
                            }
                            if (!D.llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(gN), llllIlIlII[12])) break block219;
                            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[57]];
                            if (D.llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                g.a(llllIIllII[llllIlIlII[58]], bQ, llllIlIlII[1]);
                            }
                            if (D.llIIlllllIlIl(Vars.getBit((int)llllIlIlII[59]), llllIlIlII[1])) {
                                String[] stringArray = new String[llllIlIlII[2]];
                                stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[60]];
                                stringArray[D.llllIlIlII[1]] = llllIIllII[llllIlIlII[61]];
                                g.a(stringArray);
                            }
                            if (D.llIIlllllIlIl(Vars.getBit((int)llllIlIlII[62]), llllIlIlII[1])) {
                                String[] stringArray = new String[llllIlIlII[1]];
                                stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[63]];
                                g.a(stringArray);
                            }
                            if (D.llIIlllllIlIl(Vars.getBit((int)llllIlIlII[64]), llllIlIlII[1]) && !D.llIIllllIllII(Vars.getBit((int)llllIlIlII[62]))) break block220;
                            String[] stringArray = new String[llllIlIlII[1]];
                            stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[65]];
                            if (!D.llIIllllIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block221;
                        }
                        String[] stringArray = new String[llllIlIlII[2]];
                        stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[15]];
                        stringArray[D.llllIlIlII[1]] = llllIIllII[llllIlIlII[66]];
                        g.a(stringArray);
                    }
                    if (D.llIIlllllIlIl(Vars.getBit((int)llllIlIlII[67]), llllIlIlII[1])) {
                        String[] stringArray = new String[llllIlIlII[2]];
                        stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[68]];
                        stringArray[D.llllIlIlII[1]] = llllIIllII[llllIlIlII[69]];
                        g.a(stringArray);
                    }
                    if (D.llIIlllllIlIl(Vars.getBit((int)llllIlIlII[54]), llllIlIlII[1])) {
                        String[] stringArray = new String[llllIlIlII[2]];
                        stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[70]];
                        stringArray[D.llllIlIlII[1]] = llllIIllII[llllIlIlII[71]];
                        g.a(stringArray);
                    }
                }
                if ((D.llIIllllIlllI(Vars.getBit((int)llllIlIlII[54])) && D.llIIllllIlllI(Vars.getBit((int)llllIlIlII[67])) && !D.llIIllllIllII(Vars.getBit((int)llllIlIlII[62])) || D.llIIlllllIlIl(e.j(llllIlIlII[72]), llllIlIlII[20])) && D.llIIllllIlllI(Vars.getBit((int)llllIlIlII[73]))) {
                    String[] stringArray = new String[llllIlIlII[1]];
                    stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[74]];
                    if (D.llIIllllIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        var29 = new WorldPoint(llllIlIlII[75], llllIlIlII[76], llllIlIlII[0]);
                        String[] stringArray4 = new String[llllIlIlII[1]];
                        stringArray4[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[77]];
                        if (D.llIIlllllIlll(NPCs.getNearest((String[])stringArray4))) {
                            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[78]];
                            Movement.walkTo((WorldPoint)var29);
                            0;
                            Time.sleepTicks((int)llllIlIlII[1]);
                            0;
                        }
                        String[] stringArray5 = new String[llllIlIlII[1]];
                        stringArray5[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[79]];
                        if (D.llIIlllllIIlI(NPCs.getNearest((String[])stringArray5))) {
                            g.a(llllIIllII[llllIlIlII[80]], bQ);
                        }
                    }
                }
                if (D.llIIlllllIlIl(Vars.getBit((int)llllIlIlII[73]), llllIlIlII[1]) && (!D.llIIllllIllII(Vars.getBit((int)llllIlIlII[81])) || D.llIIllllIlllI(gR ? 1 : 0))) {
                    String[] stringArray = new String[llllIlIlII[1]];
                    stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[82]];
                    if (D.llIIllllIlllI(Inventory.contains((String[])stringArray) ? 1 : 0) && D.llIIllllIlllI(Vars.getBit((int)llllIlIlII[83]))) {
                        D.ci();
                    }
                    String[] stringArray6 = new String[llllIlIlII[1]];
                    stringArray6[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[84]];
                    if (D.llIIllllIllII(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        var29 = new WorldPoint(llllIlIlII[85], llllIlIlII[86], llllIlIlII[0]);
                        if (D.llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var29), llllIlIlII[9]) && D.llIIllllIlllI(Vars.getBit((int)llllIlIlII[81]))) {
                            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[87]];
                            if (D.llIIllllIllII(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)var29);
                            0;
                            Time.sleepTicks((int)llllIlIlII[1]);
                            0;
                        }
                        if (D.llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var29), llllIlIlII[23])) {
                            if (D.llIIllllIlllI(Vars.getBit((int)llllIlIlII[81]))) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[88]];
                                String[] stringArray7 = new String[llllIlIlII[1]];
                                stringArray7[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[89]];
                                if (D.llIIllllIllII(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                    String[] stringArray8 = new String[llllIlIlII[1]];
                                    stringArray8[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[90]];
                                    String[] stringArray9 = new String[llllIlIlII[1]];
                                    stringArray9[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[91]];
                                    Inventory.getFirst((String[])stringArray8).useOn(TileObjects.getNearest((String[])stringArray9));
                                    Time.sleepTicks((int)llllIlIlII[1]);
                                    0;
                                }
                                String[] stringArray10 = new String[llllIlIlII[1]];
                                stringArray10[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[6]];
                                if (D.llIIllllIllII(Inventory.contains((String[])stringArray10) ? 1 : 0)) {
                                    String[] stringArray11 = new String[llllIlIlII[1]];
                                    stringArray11[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[92]];
                                    String[] stringArray12 = new String[llllIlIlII[1]];
                                    stringArray12[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[93]];
                                    Inventory.getFirst((String[])stringArray11).useOn(TileObjects.getNearest((String[])stringArray12));
                                    Time.sleepTicks((int)llllIlIlII[1]);
                                    0;
                                }
                                String[] stringArray13 = new String[llllIlIlII[1]];
                                stringArray13[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[94]];
                                if (D.llIIllllIllII(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                                    String[] stringArray14 = new String[llllIlIlII[1]];
                                    stringArray14[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[95]];
                                    String[] stringArray15 = new String[llllIlIlII[1]];
                                    stringArray15[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[96]];
                                    Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((String[])stringArray15));
                                    Time.sleepTicks((int)llllIlIlII[1]);
                                    0;
                                }
                                String[] stringArray16 = new String[llllIlIlII[1]];
                                stringArray16[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[97]];
                                if (D.llIIllllIllII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                                    String[] stringArray17 = new String[llllIlIlII[1]];
                                    stringArray17[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[98]];
                                    String[] stringArray18 = new String[llllIlIlII[1]];
                                    stringArray18[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[99]];
                                    Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                                    Time.sleepTicks((int)llllIlIlII[1]);
                                    0;
                                }
                            }
                            if (D.llIIlllllIlIl(Vars.getBit((int)llllIlIlII[81]), llllIlIlII[1])) {
                                String[] stringArray19 = new String[llllIlIlII[1]];
                                stringArray19[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[100]];
                                if (D.llIIllllIllII(Inventory.contains((String[])stringArray19) ? 1 : 0)) {
                                    String[] stringArray20 = new String[llllIlIlII[1]];
                                    stringArray20[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[101]];
                                    String[] stringArray21 = new String[llllIlIlII[1]];
                                    stringArray21[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[102]];
                                    Inventory.getFirst((String[])stringArray20).useOn(TileObjects.getNearest((String[])stringArray21));
                                    Time.sleepTicks((int)llllIlIlII[1]);
                                    0;
                                }
                                String[] stringArray22 = new String[llllIlIlII[1]];
                                stringArray22[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[103]];
                                if (D.llIIllllIllII(Inventory.contains((String[])stringArray22) ? 1 : 0)) {
                                    String[] stringArray23 = new String[llllIlIlII[1]];
                                    stringArray23[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[104]];
                                    String[] stringArray24 = new String[llllIlIlII[1]];
                                    stringArray24[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[105]];
                                    Inventory.getFirst((String[])stringArray23).useOn(TileObjects.getNearest((String[])stringArray24));
                                    Time.sleepTicks((int)llllIlIlII[1]);
                                    0;
                                }
                                String[] stringArray25 = new String[llllIlIlII[1]];
                                stringArray25[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[106]];
                                if (D.llIIllllIllII(Inventory.contains((String[])stringArray25) ? 1 : 0)) {
                                    String[] stringArray26 = new String[llllIlIlII[1]];
                                    stringArray26[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[107]];
                                    String[] stringArray27 = new String[llllIlIlII[1]];
                                    stringArray27[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[108]];
                                    Inventory.getFirst((String[])stringArray26).useOn(TileObjects.getNearest((String[])stringArray27));
                                    Time.sleepTicks((int)llllIlIlII[1]);
                                    0;
                                }
                                String[] stringArray28 = new String[llllIlIlII[1]];
                                stringArray28[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[109]];
                                if (D.llIIllllIllII(Inventory.contains((String[])stringArray28) ? 1 : 0)) {
                                    String[] stringArray29 = new String[llllIlIlII[1]];
                                    stringArray29[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[110]];
                                    String[] stringArray30 = new String[llllIlIlII[1]];
                                    stringArray30[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[111]];
                                    Inventory.getFirst((String[])stringArray29).useOn(TileObjects.getNearest((String[])stringArray30));
                                    Time.sleepTicks((int)llllIlIlII[1]);
                                    0;
                                }
                                String[] stringArray31 = new String[llllIlIlII[1]];
                                stringArray31[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[112]];
                                var35 = TileObjects.getNearest((String[])stringArray31);
                                if (D.llIIlllllIIlI(var35) && D.llIIllllIlllI(gR ? 1 : 0)) {
                                    if (D.llIIllllIlllI(Reachable.isInteractable((Locatable)var35) ? 1 : 0)) {
                                        String[] stringArray32 = new String[llllIlIlII[1]];
                                        stringArray32[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[113]];
                                        TileObjects.getNearest((String[])stringArray32).interact(llllIIllII[llllIlIlII[114]]);
                                        Time.sleepTicks((int)llllIlIlII[16]);
                                        0;
                                    }
                                    if (D.llIIllllIllII(Reachable.isInteractable((Locatable)var35) ? 1 : 0) && D.llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                        String[] stringArray33 = new String[llllIlIlII[1]];
                                        stringArray33[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[115]];
                                        if (D.llIIllllIllII(var35.hasAction(stringArray33) ? 1 : 0)) {
                                            var35.interact(llllIIllII[llllIlIlII[116]]);
                                            Time.sleepTicks((int)llllIlIlII[9]);
                                            0;
                                        }
                                        String[] stringArray34 = new String[llllIlIlII[1]];
                                        stringArray34[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[117]];
                                        if (D.llIIllllIllII(var35.hasAction(stringArray34) ? 1 : 0)) {
                                            var35.interact(llllIIllII[llllIlIlII[118]]);
                                            Time.sleepTicks((int)llllIlIlII[9]);
                                            0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (D.llIIlllllIlIl(Vars.getBit((int)llllIlIlII[81]), llllIlIlII[1]) && D.llIIllllIlllI(gR ? 1 : 0)) {
                    String[] stringArray = new String[llllIlIlII[1]];
                    stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[119]];
                    if (D.llIIllllIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray35 = new String[llllIlIlII[1]];
                        stringArray35[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[120]];
                        String[] stringArray36 = new String[llllIlIlII[1]];
                        stringArray36[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[121]];
                        Inventory.getFirst((String[])stringArray35).useOn(TileObjects.getNearest((String[])stringArray36));
                        Time.sleepTicks((int)llllIlIlII[1]);
                        0;
                    }
                    String[] stringArray37 = new String[llllIlIlII[1]];
                    stringArray37[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[122]];
                    if (D.llIIllllIllII(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                        String[] stringArray38 = new String[llllIlIlII[1]];
                        stringArray38[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[123]];
                        String[] stringArray39 = new String[llllIlIlII[1]];
                        stringArray39[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[124]];
                        Inventory.getFirst((String[])stringArray38).useOn(TileObjects.getNearest((String[])stringArray39));
                        Time.sleepTicks((int)llllIlIlII[1]);
                        0;
                    }
                    String[] stringArray40 = new String[llllIlIlII[1]];
                    stringArray40[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[125]];
                    if (D.llIIllllIllII(Inventory.contains((String[])stringArray40) ? 1 : 0)) {
                        String[] stringArray41 = new String[llllIlIlII[1]];
                        stringArray41[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[126]];
                        String[] stringArray42 = new String[llllIlIlII[1]];
                        stringArray42[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[127]];
                        Inventory.getFirst((String[])stringArray41).useOn(TileObjects.getNearest((String[])stringArray42));
                        Time.sleepTicks((int)llllIlIlII[1]);
                        0;
                    }
                    String[] stringArray43 = new String[llllIlIlII[1]];
                    stringArray43[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[128]];
                    if (D.llIIllllIllII(Inventory.contains((String[])stringArray43) ? 1 : 0)) {
                        String[] stringArray44 = new String[llllIlIlII[1]];
                        stringArray44[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[129]];
                        String[] stringArray45 = new String[llllIlIlII[1]];
                        stringArray45[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[130]];
                        Inventory.getFirst((String[])stringArray44).useOn(TileObjects.getNearest((String[])stringArray45));
                        Time.sleepTicks((int)llllIlIlII[1]);
                        0;
                    }
                    String[] stringArray46 = new String[llllIlIlII[1]];
                    stringArray46[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[25]];
                    var29 = TileObjects.getNearest((String[])stringArray46);
                    if (D.llIIlllllIIlI(var29) && D.llIIllllIlllI(gR ? 1 : 0)) {
                        if (D.llIIllllIlllI(Reachable.isInteractable((Locatable)var29) ? 1 : 0)) {
                            String[] stringArray47 = new String[llllIlIlII[1]];
                            stringArray47[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[131]];
                            TileObjects.getNearest((String[])stringArray47).interact(llllIIllII[llllIlIlII[132]]);
                            Time.sleepTicks((int)llllIlIlII[16]);
                            0;
                        }
                        if (D.llIIllllIllII(Reachable.isInteractable((Locatable)var29) ? 1 : 0) && D.llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray48 = new String[llllIlIlII[1]];
                            stringArray48[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[133]];
                            if (D.llIIllllIllII(var29.hasAction(stringArray48) ? 1 : 0)) {
                                var29.interact(llllIIllII[llllIlIlII[134]]);
                                Time.sleepTicks((int)llllIlIlII[9]);
                                0;
                            }
                            String[] stringArray49 = new String[llllIlIlII[1]];
                            stringArray49[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[135]];
                            if (D.llIIllllIllII(var29.hasAction(stringArray49) ? 1 : 0)) {
                                var29.interact(llllIIllII[llllIlIlII[136]]);
                                Time.sleepTicks((int)llllIlIlII[9]);
                                0;
                            }
                        }
                    }
                }
                if (D.llIIllllIllII(gR ? 1 : 0) && D.llIIllllIlllI(gS ? 1 : 0)) {
                    var29 = new WorldPoint(llllIlIlII[85], llllIlIlII[86], llllIlIlII[0]);
                    if (D.llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var29), llllIlIlII[23])) {
                        int[] nArray = new int[llllIlIlII[1]];
                        nArray[D.llllIlIlII[0]] = llllIlIlII[21];
                        Inventory.getFirst((int[])nArray).interact(llllIIllII[llllIlIlII[137]]);
                        Time.sleepTicks((int)llllIlIlII[16]);
                        0;
                    }
                    var35 = new WorldPoint(llllIlIlII[138], llllIlIlII[139], llllIlIlII[0]);
                    if (D.llIIllllIlllI(Players.getLocal().getWorldLocation().equals((Object)var35) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[140]];
                        if (D.llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)var35);
                            0;
                            Time.sleepTicks((int)llllIlIlII[1]);
                            0;
                        }
                        String[] stringArray = new String[llllIlIlII[7]];
                        stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[141]];
                        stringArray[D.llllIlIlII[1]] = llllIIllII[llllIlIlII[142]];
                        stringArray[D.llllIlIlII[2]] = llllIIllII[llllIlIlII[143]];
                        g.a(stringArray);
                    }
                    if (D.llIIllllIllII(Players.getLocal().getWorldLocation().equals((Object)var35) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[144]];
                        g.a(llllIIllII[llllIlIlII[145]], bQ);
                    }
                }
                if (D.llIIllllIllII(gR ? 1 : 0) && D.llIIllllIllII(gS ? 1 : 0) && D.llIIllllIlllI(gT ? 1 : 0)) {
                    TileObject var20;
                    TileObject var33;
                    WorldArea var30;
                    String[] stringArray = new String[llllIlIlII[1]];
                    stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[146]];
                    if (D.llIIllllIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray50 = new String[llllIlIlII[1]];
                        stringArray50[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[147]];
                        Inventory.getFirst((String[])stringArray50).interact(llllIIllII[llllIlIlII[148]]);
                    }
                    var29 = new WorldArea(llllIlIlII[149], llllIlIlII[150], llllIlIlII[51], llllIlIlII[10], llllIlIlII[0]);
                    var35 = new WorldArea(llllIlIlII[151], llllIlIlII[152], llllIlIlII[58], llllIlIlII[58], llllIlIlII[0]);
                    if (D.llIIllllIlllI(Players.getLocal().getWorldLocation().getPlane()) && D.llIIllllIlllI(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.llIIllllIlllI(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var9 = new WorldPoint(llllIlIlII[153], llllIlIlII[154], llllIlIlII[0]);
                        if (D.llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(var9), llllIlIlII[2])) {
                            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[155]];
                            Movement.walkTo((WorldPoint)var9);
                            0;
                            Time.sleepTicks((int)llllIlIlII[1]);
                            0;
                        }
                        if (D.llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(var9), llllIlIlII[2])) {
                            String[] stringArray51 = new String[llllIlIlII[1]];
                            stringArray51[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[156]];
                            TileObjects.getNearest((String[])stringArray51).interact(llllIIllII[llllIlIlII[157]]);
                            Time.sleepTicks((int)llllIlIlII[11]);
                            0;
                        }
                    }
                    var9 = new WorldArea(llllIlIlII[158], llllIlIlII[159], llllIlIlII[11], llllIlIlII[16], llllIlIlII[0]);
                    WorldArea var15 = new WorldArea(llllIlIlII[160], llllIlIlII[161], llllIlIlII[13], llllIlIlII[7], llllIlIlII[0]);
                    if (D.llIIllllIlllI(Players.getLocal().getWorldLocation().getPlane()) && D.llIIllllIllII(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[llllIlIlII[1]];
                        nArray[D.llllIlIlII[0]] = llllIlIlII[162];
                        if (D.llIIllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray15 = new int[llllIlIlII[1]];
                            nArray15[D.llllIlIlII[0]] = llllIlIlII[162];
                            if (D.llIIlllllIlll(TileItems.getNearest((int[])nArray15)) && D.llIIllllIlllI(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.llIIllllIlllI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.llIIllllIlllI(new WorldArea(llllIlIlII[163], llllIlIlII[164], llllIlIlII[26], llllIlIlII[12], llllIlIlII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[165]];
                                if (D.llIIlllllIlll(Players.getLocal().getInteracting())) {
                                    int[] nArray16 = new int[llllIlIlII[1]];
                                    nArray16[D.llllIlIlII[0]] = llllIlIlII[166];
                                    NPCs.getNearest((int[])nArray16).interact(llllIIllII[llllIlIlII[167]]);
                                    Time.sleepTicks((int)llllIlIlII[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray17 = new int[llllIlIlII[1]];
                        nArray17[D.llllIlIlII[0]] = llllIlIlII[162];
                        if (D.llIIlllllIIlI(TileItems.getNearest((int[])nArray17))) {
                            int[] nArray18 = new int[llllIlIlII[1]];
                            nArray18[D.llllIlIlII[0]] = llllIlIlII[162];
                            TileItems.getNearest((int[])nArray18).interact(llllIIllII[llllIlIlII[168]]);
                            Time.sleepTicks((int)llllIlIlII[7]);
                            0;
                        }
                        int[] nArray19 = new int[llllIlIlII[1]];
                        nArray19[D.llllIlIlII[0]] = llllIlIlII[162];
                        if (D.llIIllllIllII(Inventory.contains((int[])nArray19) ? 1 : 0) && D.llIIllllIlllI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.llIIllllIlllI(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var30 = new WorldPoint(llllIlIlII[169], llllIlIlII[170], llllIlIlII[0]);
                            if (D.llIIllllIlllI(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[171]];
                                e.b((WorldPoint)var30);
                                Time.sleepTicks((int)llllIlIlII[2]);
                                0;
                            }
                            if (D.llIIllllIllII(Players.getLocal().getWorldLocation().equals((Object)var30) ? 1 : 0)) {
                                String[] stringArray52 = new String[llllIlIlII[1]];
                                stringArray52[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[172]];
                                TileObjects.getNearest((String[])stringArray52).interact(llllIIllII[llllIlIlII[173]]);
                                Time.sleepTicks((int)llllIlIlII[12]);
                                0;
                            }
                        }
                        if (!D.llIIllllIlllI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || D.llIIllllIllII(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var30 = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (D.llIIllllIllII(tileObject.getName().contains(llllIIllII[llllIlIlII[334]]) ? 1 : 0) && D.llIIllllIllII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                    n2 = llllIlIlII[1];
                                    0;
                                    if ((132 + 76 - 90 + 21 ^ 20 + 56 - -3 + 64) == -1) {
                                        return ((69 + 35 - 82 + 208 ^ 39 + 160 - 126 + 108) & (0x12 ^ 0x69 ^ (0xE8 ^ 0xC0) ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = llllIlIlII[0];
                                }
                                return n2 != 0;
                            });
                            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[174]];
                            if (D.llIIlllllIIlI(var30)) {
                                var30.interact(llllIIllII[llllIlIlII[175]]);
                                Time.sleepTicks((int)llllIlIlII[7]);
                                0;
                            }
                        }
                    }
                    if (D.llIIlllllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlII[1]) && D.llIIllllIlllI(new WorldArea(llllIlIlII[176], llllIlIlII[177], llllIlIlII[11], llllIlIlII[13], llllIlIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[llllIlIlII[1]];
                        nArray[D.llllIlIlII[0]] = llllIlIlII[178];
                        if (D.llIIllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray20 = new int[llllIlIlII[1]];
                            nArray20[D.llllIlIlII[0]] = llllIlIlII[178];
                            if (D.llIIlllllIlll(TileItems.getNearest((int[])nArray20))) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[179]];
                                var30 = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (D.llIIllllIllII(nPC.getName().contains(llllIIllII[llllIlIlII[333]]) ? 1 : 0) && D.llIIllllllIII(nPC.getInteracting(), Players.getLocal()) && D.llIIlllllIlII(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llllIlIlII[1])) {
                                        n2 = llllIlIlII[1];
                                        0;
                                        if (((0x11 ^ 0x46) & ~(0x21 ^ 0x76)) != 0) {
                                            return false;
                                        }
                                    } else {
                                        n2 = llllIlIlII[0];
                                    }
                                    return n2 != 0;
                                });
                                if (D.llIIlllllIlll(Players.getLocal().getInteracting()) && D.llIIlllllIlll(var30)) {
                                    int[] nArray21 = new int[llllIlIlII[1]];
                                    nArray21[D.llllIlIlII[0]] = llllIlIlII[180];
                                    NPCs.getNearest((int[])nArray21).interact(llllIIllII[llllIlIlII[181]]);
                                    Time.sleepTicks((int)llllIlIlII[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray22 = new int[llllIlIlII[1]];
                        nArray22[D.llllIlIlII[0]] = llllIlIlII[178];
                        if (D.llIIlllllIIlI(TileItems.getNearest((int[])nArray22))) {
                            int[] nArray23 = new int[llllIlIlII[1]];
                            nArray23[D.llllIlIlII[0]] = llllIlIlII[178];
                            TileItems.getNearest((int[])nArray23).interact(llllIIllII[llllIlIlII[182]]);
                            Time.sleepTicks((int)llllIlIlII[7]);
                            0;
                        }
                        var30 = new WorldArea(llllIlIlII[183], llllIlIlII[184], llllIlIlII[12], llllIlIlII[11], llllIlIlII[1]);
                        int[] nArray24 = new int[llllIlIlII[1]];
                        nArray24[D.llllIlIlII[0]] = llllIlIlII[178];
                        if (D.llIIllllIllII(Inventory.contains((int[])nArray24) ? 1 : 0) && D.llIIllllIlllI(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var33 = new WorldPoint(llllIlIlII[163], llllIlIlII[170], llllIlIlII[1]);
                            if (D.llIIllllIlllI(Players.getLocal().getWorldLocation().equals((Object)var33) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[185]];
                                e.b((WorldPoint)var33);
                                Time.sleepTicks((int)llllIlIlII[2]);
                                0;
                            }
                            if (D.llIIllllIllII(Players.getLocal().getWorldLocation().equals((Object)var33) ? 1 : 0)) {
                                String[] stringArray53 = new String[llllIlIlII[1]];
                                stringArray53[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[186]];
                                TileObjects.getNearest((String[])stringArray53).interact(llllIIllII[llllIlIlII[187]]);
                                Time.sleepTicks((int)llllIlIlII[12]);
                                0;
                            }
                        }
                        if (D.llIIllllIllII(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.llIIlllllIIlI(var33 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (D.llIIllllIllII(tileObject.getName().contains(llllIIllII[llllIlIlII[332]]) ? 1 : 0) && D.llIIllllIllII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = llllIlIlII[1];
                                0;
                                if (((0x50 ^ 0x65 ^ (0xF1 ^ 0xA6)) & (0xEA ^ 0xA8 ^ (0x58 ^ 0x78) ^ -1)) != 0) {
                                    return ((0x28 ^ 0x14 ^ (0x3D ^ 0xB)) & (0x20 ^ 0x43 ^ (0x60 ^ 9) ^ -1)) != 0;
                                }
                            } else {
                                n2 = llllIlIlII[0];
                            }
                            return n2 != 0;
                        }))) {
                            var33.interact(llllIIllII[llllIlIlII[188]]);
                            Time.sleepTicks((int)llllIlIlII[7]);
                            0;
                        }
                    }
                    if (D.llIIlllllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlII[2])) {
                        int[] nArray = new int[llllIlIlII[1]];
                        nArray[D.llllIlIlII[0]] = llllIlIlII[189];
                        if (D.llIIllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray25 = new int[llllIlIlII[1]];
                            nArray25[D.llllIlIlII[0]] = llllIlIlII[189];
                            if (D.llIIlllllIlll(TileItems.getNearest((int[])nArray25))) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[190]];
                                var30 = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (D.llIIllllIllII(nPC.getName().contains(llllIIllII[llllIlIlII[331]]) ? 1 : 0) && D.llIIllllllIII(nPC.getInteracting(), Players.getLocal()) && D.llIIlllllIlII(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llllIlIlII[1])) {
                                        n2 = llllIlIlII[1];
                                        0;
                                        if ((0x3D ^ 0x5C ^ (0xC0 ^ 0xA5)) == 0) {
                                            return ((0x5E ^ 0x17 ^ (5 ^ 0xC)) & (208 + 246 - 451 + 249 ^ 73 + 24 - -28 + 63 ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = llllIlIlII[0];
                                    }
                                    return n2 != 0;
                                });
                                if (D.llIIlllllIlll(Players.getLocal().getInteracting()) && D.llIIlllllIlll(var30)) {
                                    int[] nArray26 = new int[llllIlIlII[1]];
                                    nArray26[D.llllIlIlII[0]] = llllIlIlII[191];
                                    NPCs.getNearest((int[])nArray26).interact(llllIIllII[llllIlIlII[192]]);
                                    Time.sleepTicks((int)llllIlIlII[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray27 = new int[llllIlIlII[1]];
                        nArray27[D.llllIlIlII[0]] = llllIlIlII[189];
                        if (D.llIIlllllIIlI(TileItems.getNearest((int[])nArray27))) {
                            int[] nArray28 = new int[llllIlIlII[1]];
                            nArray28[D.llllIlIlII[0]] = llllIlIlII[189];
                            TileItems.getNearest((int[])nArray28).interact(llllIIllII[llllIlIlII[193]]);
                            Time.sleepTicks((int)llllIlIlII[7]);
                            0;
                        }
                        var30 = new WorldArea(llllIlIlII[149], llllIlIlII[164], llllIlIlII[10], llllIlIlII[38], llllIlIlII[2]);
                        int[] nArray29 = new int[llllIlIlII[1]];
                        nArray29[D.llllIlIlII[0]] = llllIlIlII[189];
                        if (D.llIIllllIllII(Inventory.contains((int[])nArray29) ? 1 : 0) && D.llIIllllIlllI(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var33 = new WorldPoint(llllIlIlII[194], llllIlIlII[159], llllIlIlII[2]);
                            if (D.llIIllllIlllI(Players.getLocal().getWorldLocation().equals((Object)var33) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[195]];
                                e.b((WorldPoint)var33);
                                Time.sleepTicks((int)llllIlIlII[2]);
                                0;
                            }
                            if (D.llIIllllIllII(Players.getLocal().getWorldLocation().equals((Object)var33) ? 1 : 0)) {
                                String[] stringArray54 = new String[llllIlIlII[1]];
                                stringArray54[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[196]];
                                TileObjects.getNearest((String[])stringArray54).interact(llllIIllII[llllIlIlII[197]]);
                                Time.sleepTicks((int)llllIlIlII[12]);
                                0;
                            }
                        }
                        if (D.llIIllllIllII(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.llIIlllllIIlI(var33 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (D.llIIllllIllII(tileObject.getName().contains(llllIIllII[llllIlIlII[330]]) ? 1 : 0) && D.llIIllllIllII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = llllIlIlII[1];
                                0;
                                if (1 > (13 + 128 - 110 + 141 ^ 36 + 114 - 105 + 123)) {
                                    return ((93 + 40 - 36 + 75 ^ 92 + 10 - -33 + 43) & (0x3A ^ 0x75 ^ (0xC7 ^ 0x96) ^ -1)) != 0;
                                }
                            } else {
                                n2 = llllIlIlII[0];
                            }
                            return n2 != 0;
                        }))) {
                            var33.interact(llllIIllII[llllIlIlII[198]]);
                            Time.sleepTicks((int)llllIlIlII[7]);
                            0;
                        }
                    }
                    if ((!D.llIIllllIlllI((var30 = new WorldArea(llllIlIlII[176], llllIlIlII[177], llllIlIlII[11], llllIlIlII[13], llllIlIlII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || D.llIIllllIllII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llllIlIlII[199], llllIlIlII[200], llllIlIlII[1])) ? 1 : 0)) && D.llIIlllllIIlI(var33 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (D.llIIllllIllII(tileObject.getName().contains(llllIIllII[llllIlIlII[328]]) ? 1 : 0) && D.llIIllllIllII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                            String[] stringArray = new String[llllIlIlII[1]];
                            stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[329]];
                            if (D.llIIllllIllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = llllIlIlII[1];
                                0;
                                if (-(0x33 ^ 0x37) < 0) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = llllIlIlII[0];
                        return n2 != 0;
                    }))) {
                        var33.interact(llllIIllII[llllIlIlII[201]]);
                        Time.sleepTicks((int)llllIlIlII[7]);
                        0;
                    }
                    if (D.llIIllllIllII((var33 = new WorldArea(llllIlIlII[163], llllIlIlII[164], llllIlIlII[26], llllIlIlII[12], llllIlIlII[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.llIIlllllIIlI(var20 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (D.llIIllllIllII(tileObject.getName().contains(llllIIllII[llllIlIlII[326]]) ? 1 : 0) && D.llIIllllIllII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                            String[] stringArray = new String[llllIlIlII[1]];
                            stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[327]];
                            if (D.llIIllllIllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = llllIlIlII[1];
                                0;
                                if (((0x36 ^ 0xA) & ~(0xBE ^ 0x82)) == 0) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = llllIlIlII[0];
                        return n2 != 0;
                    }))) {
                        var20.interact(llllIIllII[llllIlIlII[202]]);
                        Time.sleepTicks((int)llllIlIlII[7]);
                        0;
                    }
                    var20 = new WorldArea(llllIlIlII[194], llllIlIlII[203], llllIlIlII[43], llllIlIlII[9], llllIlIlII[0]);
                    WorldArea var17 = new WorldArea(llllIlIlII[204], llllIlIlII[205], llllIlIlII[13], llllIlIlII[23], llllIlIlII[0]);
                    WorldArea var31 = new WorldArea(llllIlIlII[169], llllIlIlII[206], llllIlIlII[11], llllIlIlII[17], llllIlIlII[0]);
                    if (D.llIIllllIllII(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var19;
                        WorldPoint var6;
                        WorldArea var13;
                        int[] nArray = new int[llllIlIlII[1]];
                        nArray[D.llllIlIlII[0]] = llllIlIlII[207];
                        if (D.llIIllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray30 = new int[llllIlIlII[1]];
                            nArray30[D.llllIlIlII[0]] = llllIlIlII[207];
                            if (D.llIIlllllIlll(TileItems.getNearest((int[])nArray30)) && D.llIIllllIlllI(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.llIIllllIlllI(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.llIIllllIlllI(var31.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[208]];
                                var13 = NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (D.llIIllllIllII(nPC.getName().contains(llllIIllII[llllIlIlII[325]]) ? 1 : 0) && D.llIIllllllIII(nPC.getInteracting(), Players.getLocal()) && D.llIIlllllIlII(nPC.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llllIlIlII[1])) {
                                        n2 = llllIlIlII[1];
                                        0;
                                        if (1 < 0) {
                                            return ((0x8F ^ 0xC7 ^ (0x59 ^ 0x73)) & (188 + 184 - 334 + 159 ^ 6 + 144 - 8 + 25 ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = llllIlIlII[0];
                                    }
                                    return n2 != 0;
                                });
                                if (D.llIIlllllIlll(Players.getLocal().getInteracting()) && D.llIIlllllIlll(var13)) {
                                    int[] nArray31 = new int[llllIlIlII[1]];
                                    nArray31[D.llllIlIlII[0]] = llllIlIlII[209];
                                    NPCs.getNearest((int[])nArray31).interact(llllIIllII[llllIlIlII[210]]);
                                    Time.sleepTicks((int)llllIlIlII[11]);
                                    0;
                                }
                            }
                        }
                        int[] nArray32 = new int[llllIlIlII[1]];
                        nArray32[D.llllIlIlII[0]] = llllIlIlII[207];
                        if (D.llIIlllllIIlI(TileItems.getNearest((int[])nArray32))) {
                            int[] nArray33 = new int[llllIlIlII[1]];
                            nArray33[D.llllIlIlII[0]] = llllIlIlII[207];
                            TileItems.getNearest((int[])nArray33).interact(llllIIllII[llllIlIlII[211]]);
                            Time.sleepTicks((int)llllIlIlII[7]);
                            0;
                        }
                        var13 = new WorldArea(llllIlIlII[169], llllIlIlII[206], llllIlIlII[11], llllIlIlII[17], llllIlIlII[0]);
                        int[] nArray34 = new int[llllIlIlII[1]];
                        nArray34[D.llllIlIlII[0]] = llllIlIlII[207];
                        if (D.llIIllllIllII(Inventory.contains((int[])nArray34) ? 1 : 0) && D.llIIllllIlllI(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            var6 = new WorldPoint(llllIlIlII[183], llllIlIlII[212], llllIlIlII[0]);
                            if (D.llIIllllIlllI(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[213]];
                                e.b(var6);
                                Time.sleepTicks((int)llllIlIlII[2]);
                                0;
                            }
                            if (D.llIIllllIllII(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                String[] stringArray55 = new String[llllIlIlII[1]];
                                stringArray55[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[214]];
                                TileObjects.getNearest((String[])stringArray55).interact(llllIIllII[llllIlIlII[215]]);
                                Time.sleepTicks((int)llllIlIlII[12]);
                                0;
                            }
                        }
                        if (D.llIIllllIllII(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray35 = new int[llllIlIlII[1]];
                            nArray35[D.llllIlIlII[0]] = llllIlIlII[216];
                            if (D.llIIllllIlllI(Inventory.contains((int[])nArray35) ? 1 : 0)) {
                                int[] nArray36 = new int[llllIlIlII[1]];
                                nArray36[D.llllIlIlII[0]] = llllIlIlII[216];
                                if (D.llIIlllllIlll(TileItems.getNearest((int[])nArray36))) {
                                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[217]];
                                    if (D.llIIllllIlllI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                    }
                                    if (D.llIIlllllIlll(Players.getLocal().getInteracting())) {
                                        int[] nArray37 = new int[llllIlIlII[1]];
                                        nArray37[D.llllIlIlII[0]] = llllIlIlII[218];
                                        NPCs.getNearest((int[])nArray37).interact(llllIIllII[llllIlIlII[219]]);
                                        Time.sleepTicks((int)llllIlIlII[11]);
                                        0;
                                    }
                                }
                            }
                            int[] nArray38 = new int[llllIlIlII[1]];
                            nArray38[D.llllIlIlII[0]] = llllIlIlII[216];
                            if (D.llIIlllllIIlI(TileItems.getNearest((int[])nArray38))) {
                                if (D.llIIllllIllII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                }
                                int[] nArray39 = new int[llllIlIlII[1]];
                                nArray39[D.llllIlIlII[0]] = llllIlIlII[216];
                                TileItems.getNearest((int[])nArray39).interact(llllIIllII[llllIlIlII[220]]);
                                Time.sleepTicks((int)llllIlIlII[7]);
                                0;
                            }
                            var6 = new WorldArea(llllIlIlII[169], llllIlIlII[206], llllIlIlII[11], llllIlIlII[17], llllIlIlII[0]);
                            int[] nArray40 = new int[llllIlIlII[1]];
                            nArray40[D.llllIlIlII[0]] = llllIlIlII[216];
                            if (D.llIIllllIllII(Inventory.contains((int[])nArray40) ? 1 : 0) && D.llIIllllIllII(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.llIIllllIlllI(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && D.llIIllllIlllI(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                var19 = new WorldPoint(llllIlIlII[221], llllIlIlII[222], llllIlIlII[0]);
                                if (D.llIIllllIlllI(Players.getLocal().getWorldLocation().equals((Object)var19) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[223]];
                                    e.b(var19);
                                    Time.sleepTicks((int)llllIlIlII[2]);
                                    0;
                                }
                                if (D.llIIllllIllII(Players.getLocal().getWorldLocation().equals((Object)var19) ? 1 : 0)) {
                                    String[] stringArray56 = new String[llllIlIlII[1]];
                                    stringArray56[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[224]];
                                    TileObjects.getNearest((String[])stringArray56).interact(llllIIllII[llllIlIlII[225]]);
                                    Time.sleepTicks((int)llllIlIlII[12]);
                                    0;
                                }
                            }
                        }
                        if (!D.llIIllllIlllI(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || D.llIIllllIllII(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray57 = new String[llllIlIlII[1]];
                            stringArray57[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[226]];
                            var6 = NPCs.getNearest((String[])stringArray57);
                            if (D.llIIlllllIIlI(var6)) {
                                int[] nArray41 = new int[llllIlIlII[1]];
                                nArray41[D.llllIlIlII[0]] = llllIlIlII[227];
                                if (D.llIIllllIlllI(Inventory.contains((int[])nArray41) ? 1 : 0) && D.llIIlllllIlll(Players.getLocal().getInteracting())) {
                                    if (D.llIIllllIlllI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                    }
                                    var6.interact(llllIIllII[llllIlIlII[228]]);
                                    Time.sleepTicks((int)llllIlIlII[7]);
                                    0;
                                }
                            }
                            int[] nArray42 = new int[llllIlIlII[1]];
                            nArray42[D.llllIlIlII[0]] = llllIlIlII[227];
                            if (D.llIIlllllIIlI(TileItems.getNearest((int[])nArray42))) {
                                int[] nArray43 = new int[llllIlIlII[1]];
                                nArray43[D.llllIlIlII[0]] = llllIlIlII[227];
                                TileItems.getNearest((int[])nArray43).interact(llllIIllII[llllIlIlII[229]]);
                                Time.sleepTicks((int)llllIlIlII[2]);
                                0;
                            }
                            int[] nArray44 = new int[llllIlIlII[1]];
                            nArray44[D.llllIlIlII[0]] = llllIlIlII[227];
                            if (D.llIIllllIllII(Inventory.contains((int[])nArray44) ? 1 : 0)) {
                                var19 = new WorldPoint(llllIlIlII[176], llllIlIlII[230], llllIlIlII[0]);
                                if (D.llIIllllIlllI(Players.getLocal().getWorldLocation().equals((Object)var19) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[231]];
                                    e.b(var19);
                                    Time.sleepTicks((int)llllIlIlII[2]);
                                    0;
                                }
                                if (D.llIIllllIllII(Players.getLocal().getWorldLocation().equals((Object)var19) ? 1 : 0)) {
                                    String[] stringArray58 = new String[llllIlIlII[1]];
                                    stringArray58[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[232]];
                                    TileObjects.getNearest((String[])stringArray58).interact(llllIIllII[llllIlIlII[233]]);
                                    Time.sleepTicks((int)llllIlIlII[12]);
                                    0;
                                }
                            }
                        }
                        if (D.llIIlllllIIlI(var6 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (D.llIIllllIllII(tileObject.getName().contains(llllIIllII[llllIlIlII[324]]) ? 1 : 0) && D.llIIllllIllII(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                                n2 = llllIlIlII[1];
                                0;
                                if (1 > 3) {
                                    return false;
                                }
                            } else {
                                n2 = llllIlIlII[0];
                            }
                            return n2 != 0;
                        }))) {
                            if (D.llIIllllIllII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (D.llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray59 = new String[llllIlIlII[1]];
                                stringArray59[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[234]];
                                if (D.llIIllllIllII(var6.hasAction(stringArray59) ? 1 : 0)) {
                                    var6.interact(llllIIllII[llllIlIlII[235]]);
                                    Time.sleepTicks((int)llllIlIlII[9]);
                                    0;
                                }
                                String[] stringArray60 = new String[llllIlIlII[1]];
                                stringArray60[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[236]];
                                if (D.llIIllllIllII(var6.hasAction(stringArray60) ? 1 : 0)) {
                                    var6.interact(llllIIllII[llllIlIlII[237]]);
                                    Time.sleepTicks((int)llllIlIlII[9]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (D.llIIllllIllII(gS ? 1 : 0) && D.llIIllllIllII(gT ? 1 : 0) && D.llIIllllIllII(gR ? 1 : 0) && D.llIIllllIlllI(gU ? 1 : 0)) {
                    int[] nArray = new int[llllIlIlII[1]];
                    nArray[D.llllIlIlII[0]] = llllIlIlII[3];
                    if (D.llIIllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray45 = new int[llllIlIlII[1]];
                        nArray45[D.llllIlIlII[0]] = llllIlIlII[3];
                        int[] nArray46 = new int[llllIlIlII[1]];
                        nArray46[D.llllIlIlII[0]] = llllIlIlII[5];
                        Inventory.getFirst((int[])nArray45).useOn(Inventory.getFirst((int[])nArray46));
                        Time.sleepTicks((int)llllIlIlII[7]);
                        0;
                    }
                }
                if (D.llIIllllIllII(gU ? 1 : 0)) {
                    String[] stringArray = new String[llllIlIlII[1]];
                    stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[238]];
                    if (D.llIIllllIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        D.ch();
                    }
                    String[] stringArray61 = new String[llllIlIlII[1]];
                    stringArray61[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[239]];
                    if (D.llIIllllIllII(Inventory.contains((String[])stringArray61) ? 1 : 0)) {
                        if (D.llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(gQ), llllIlIlII[9])) {
                            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[240]];
                            if (D.llIIllllIllII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray62 = new String[llllIlIlII[1]];
                                stringArray62[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[241]];
                                if (D.llIIlllllIlll(NPCs.getNearest((String[])stringArray62))) {
                                    Dialog.close();
                                }
                            }
                            if (D.llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)gQ);
                                0;
                                Time.sleepTicks((int)llllIlIlII[1]);
                                0;
                            }
                            String[] stringArray63 = new String[llllIlIlII[7]];
                            stringArray63[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[242]];
                            stringArray63[D.llllIlIlII[1]] = llllIIllII[llllIlIlII[243]];
                            stringArray63[D.llllIlIlII[2]] = llllIIllII[llllIlIlII[244]];
                            g.a(stringArray63);
                        }
                        if (D.llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(gQ), llllIlIlII[9])) {
                            g.a(llllIIllII[llllIlIlII[245]], bQ);
                        }
                    }
                }
            }
            if (D.llIIlllllIlIl(e.j(llllIlIlII[14]), llllIlIlII[7])) {
                ck = llllIlIlII[0];
                String[] stringArray = new String[llllIlIlII[1]];
                stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[246]];
                var29 = NPCs.getNearest((String[])stringArray);
                if (D.llIIlllllIlll(var29) && D.llIIllllIlllI(Players.getLocal().getWorldLocation().getPlane())) {
                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[247]];
                    String[] stringArray64 = new String[llllIlIlII[1]];
                    stringArray64[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[248]];
                    TileObjects.getNearest((String[])stringArray64).interact(llllIIllII[llllIlIlII[249]]);
                    Time.sleepTicks((int)llllIlIlII[16]);
                    0;
                }
                if (D.llIIlllllIlll(var29) && D.llIIlllllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlII[1])) {
                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[250]];
                    String[] stringArray65 = new String[llllIlIlII[1]];
                    stringArray65[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[251]];
                    TileObjects.getNearest((String[])stringArray65).interact(llllIIllII[llllIlIlII[252]]);
                    Time.sleepTicks((int)llllIlIlII[7]);
                    0;
                }
                if (D.llIIlllllIIlI(var29) && D.llIIlllllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlII[1])) {
                    String[] stringArray66 = new String[llllIlIlII[1]];
                    stringArray66[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[253]];
                    TileObjects.getNearest((String[])stringArray66).interact(llllIIllII[llllIlIlII[254]]);
                    Time.sleepTicks((int)llllIlIlII[11]);
                    0;
                }
            }
            if (D.llIIlllllIlIl(e.j(llllIlIlII[14]), llllIlIlII[12])) {
                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[255]];
                String[] stringArray = new String[llllIlIlII[1]];
                stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[256]];
                var29 = NPCs.getNearest((String[])stringArray);
                if (D.llIIlllllIlll(var29)) {
                    Equipment.getFirst(item -> item.getName().contains(llllIIllII[llllIlIlII[323]])).interact(llllIIllII[llllIlIlII[257]]);
                    Time.sleepTicks((int)llllIlIlII[23]);
                    0;
                    Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlII[258], llllIlIlII[259], llllIlIlII[0]));
                    0;
                }
                if (D.llIIlllllIIlI(var29)) {
                    g.a(llllIIllII[llllIlIlII[14]], bQ, llllIlIlII[1]);
                }
            }
            if (D.llIIlllllIlIl(e.j(llllIlIlII[14]), llllIlIlII[13])) {
                if (D.llIIllllIlllI(Inventory.contains(item -> item.getName().contains(llllIIllII[llllIlIlII[322]])) ? 1 : 0)) {
                    D.cg();
                }
                if (D.llIIllllIllII(Inventory.contains(item -> item.getName().contains(llllIIllII[llllIlIlII[321]])) ? 1 : 0)) {
                    String[] stringArray = new String[llllIlIlII[1]];
                    stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[72]];
                    if (D.llIIlllllIlll(NPCs.getNearest((String[])stringArray)) && D.llIIllllIlllI(Players.getLocal().getWorldLocation().getPlane()) && D.llIIllllIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        if (D.llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(gQ), llllIlIlII[2])) {
                            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[260]];
                            if (D.llIIllllIllII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray67 = new String[llllIlIlII[1]];
                                stringArray67[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[261]];
                                if (D.llIIlllllIlll(NPCs.getNearest((String[])stringArray67))) {
                                    Dialog.close();
                                }
                            }
                            if (D.llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)gQ);
                                0;
                                Time.sleepTicks((int)llllIlIlII[1]);
                                0;
                            }
                            String[] stringArray68 = new String[llllIlIlII[7]];
                            stringArray68[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[262]];
                            stringArray68[D.llllIlIlII[1]] = llllIIllII[llllIlIlII[263]];
                            stringArray68[D.llllIlIlII[2]] = llllIIllII[llllIlIlII[264]];
                            g.a(stringArray68);
                        }
                        if (D.llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(gQ), llllIlIlII[2]) && D.llIIllllIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] stringArray69 = new String[llllIlIlII[1]];
                            stringArray69[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[265]];
                            TileObjects.getNearest((String[])stringArray69).interact(llllIIllII[llllIlIlII[266]]);
                            Time.sleepTicks((int)llllIlIlII[13]);
                            0;
                        }
                    }
                    String[] stringArray70 = new String[llllIlIlII[1]];
                    stringArray70[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[267]];
                    if (D.llIIlllllIIlI(NPCs.getNearest((String[])stringArray70)) && D.llIIlllllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlII[1])) {
                        g.a(llllIIllII[llllIlIlII[268]], bQ);
                    }
                }
            }
            if (D.llIIlllllIlIl(e.j(llllIlIlII[14]), llllIlIlII[16])) {
                var29 = new WorldArea(llllIlIlII[269], llllIlIlII[270], llllIlIlII[89], llllIlIlII[79], llllIlIlII[0]);
                if (D.llIIllllIlllI(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    var35 = new WorldPoint(llllIlIlII[271], llllIlIlII[259], llllIlIlII[0]);
                    if (D.llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(var35), llllIlIlII[7])) {
                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[272]];
                        Movement.walkTo((WorldPoint)var35);
                        0;
                        Time.sleepTicks((int)llllIlIlII[1]);
                        0;
                    }
                    if (D.llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(var35), llllIlIlII[7])) {
                        String[] stringArray = new String[llllIlIlII[1]];
                        stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[273]];
                        TileObjects.getNearest((String[])stringArray).interact(llllIIllII[llllIlIlII[274]]);
                        Time.sleepTicks((int)llllIlIlII[9]);
                        0;
                    }
                }
                if (D.llIIllllIllII(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[llllIlIlII[1]];
                    stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[275]];
                    var35 = NPCs.getNearest((String[])stringArray);
                    var9 = new WorldPoint(llllIlIlII[276], llllIlIlII[152], llllIlIlII[0]);
                    if (D.llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(var9), llllIlIlII[7]) && D.llIIlllllIlll(var35)) {
                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[277]];
                        Movement.walkTo((WorldPoint)var9);
                        0;
                        Time.sleepTicks((int)llllIlIlII[1]);
                        0;
                    }
                    if (D.llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(var9), llllIlIlII[7]) && D.llIIlllllIIlI(var35) && D.llIIllllIlllI(Reachable.isInteractable((Locatable)var35) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[278]];
                        Movement.walkTo((WorldPoint)var9);
                        0;
                        Time.sleepTicks((int)llllIlIlII[1]);
                        0;
                    }
                    if (D.llIIlllllIIlI(var35) && D.llIIllllIlllI(Reachable.isInteractable((Locatable)var35) ? 1 : 0) && D.llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(var9), llllIlIlII[7]) && D.llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                        if (D.llIIlllllIIll(Combat.getMissingHealth(), llllIlIlII[9])) {
                            String[] stringArray71 = new String[llllIlIlII[1]];
                            stringArray71[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[279]];
                            if (D.llIIllllIllII(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                                String[] stringArray72 = new String[llllIlIlII[1]];
                                stringArray72[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[280]];
                                Inventory.getFirst((String[])stringArray72).interact(llllIIllII[llllIlIlII[281]]);
                                Time.sleepTicks((int)llllIlIlII[1]);
                                0;
                            }
                        }
                        String[] stringArray73 = new String[llllIlIlII[1]];
                        stringArray73[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[282]];
                        TileObjects.getNearest((String[])stringArray73).interact(llllIIllII[llllIlIlII[283]]);
                    }
                    if (D.llIIlllllIIlI(var35) && D.llIIllllIllII(Reachable.isInteractable((Locatable)var35) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[284]];
                        if (D.llIIllllIlllI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                        }
                        if (D.llIIllllIlllI(Prayers.isEnabled((Prayer)Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.ULTIMATE_STRENGTH);
                        }
                        if (D.llIIllllIlllI(Prayers.isEnabled((Prayer)Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                            Prayers.toggle((Prayer)Prayer.INCREDIBLE_REFLEXES);
                        }
                        String[] stringArray74 = new String[llllIlIlII[1]];
                        stringArray74[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[285]];
                        if (D.llIIllllIllII(Inventory.contains((String[])stringArray74) ? 1 : 0)) {
                            String[] stringArray75 = new String[llllIlIlII[1]];
                            stringArray75[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[286]];
                            Inventory.getFirst((String[])stringArray75).interact(llllIIllII[llllIlIlII[287]]);
                        }
                        if (D.llIIllllIllII(Inventory.isFull() ? 1 : 0)) {
                            String[] stringArray76 = new String[llllIlIlII[1]];
                            stringArray76[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[288]];
                            Inventory.getFirst((String[])stringArray76).interact(llllIIllII[llllIlIlII[289]]);
                        }
                        if (D.llIIlllllIlIl(Skills.getLevel((Skill)Skill.STRENGTH), Skills.getBoostedLevel((Skill)Skill.STRENGTH)) && D.llIIllllIllII(Inventory.contains(item -> item.getName().contains(llllIIllII[llllIlIlII[320]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(llllIIllII[llllIlIlII[319]])).interact(llllIIllII[llllIlIlII[290]]);
                        }
                        if (D.llIIllllIllIl(Vars.getBit((int)llllIlIlII[291]), llllIlIlII[1]) && D.llIIllllIllII(Inventory.contains(item -> item.getName().contains(llllIIllII[llllIlIlII[318]])) ? 1 : 0)) {
                            Inventory.getFirst(item -> item.getName().contains(llllIIllII[llllIlIlII[317]])).interact(llllIIllII[llllIlIlII[292]]);
                        }
                        if (D.llIIlllllIlll(Players.getLocal().getInteracting())) {
                            var35.interact(llllIIllII[llllIlIlII[293]]);
                            Time.sleepTicks((int)llllIlIlII[1]);
                            0;
                        }
                    }
                }
            }
            if (D.llIIlllllIlIl(e.j(llllIlIlII[14]), llllIlIlII[17])) {
                Prayers.disableAll();
                var29 = new WorldPoint(llllIlIlII[48], llllIlIlII[49], llllIlIlII[0]);
                if (D.llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var29), llllIlIlII[16]) && D.llIIlllllIlIl(Players.getLocal().getAnimation(), llllIlIlII[294])) {
                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[295]];
                    Movement.walkTo((WorldPoint)var29);
                    0;
                    Time.sleepTicks((int)llllIlIlII[1]);
                    0;
                }
                if (D.llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var29), llllIlIlII[16])) {
                    if (D.llIIllllIllIl(ck, llllIlIlII[1])) {
                        ac.mX += llllIlIlII[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += llllIlIlII[1];
                        ac.mX = llllIlIlII[0];
                        cl = llllIlIlII[0];
                    }
                    g.a(llllIIllII[llllIlIlII[296]], bQ, llllIlIlII[1]);
                }
            }
            int[] nArray = new int[llllIlIlII[1]];
            nArray[D.llllIlIlII[0]] = llllIlIlII[36];
            if (D.llIIllllIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray47 = new int[llllIlIlII[1]];
                nArray47[D.llllIlIlII[0]] = llllIlIlII[36];
                if (D.llIIllllIlllI(Equipment.contains((int[])nArray47) ? 1 : 0) && D.llIIlllllIIII(e.j(llllIlIlII[14]))) {
                    int[] nArray48 = new int[llllIlIlII[1]];
                    nArray48[D.llllIlIlII[0]] = llllIlIlII[36];
                    Inventory.getFirst((int[])nArray48).interact(llllIIllII[llllIlIlII[297]]);
                }
            }
            String[] stringArray = new String[llllIlIlII[1]];
            stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[298]];
            if (D.llIIllllIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                gU = llllIlIlII[1];
                gT = llllIlIlII[1];
                gR = llllIlIlII[1];
                gS = llllIlIlII[1];
            }
            int[] nArray49 = new int[llllIlIlII[1]];
            nArray49[D.llllIlIlII[0]] = llllIlIlII[3];
            if (D.llIIllllIllII(Inventory.contains((int[])nArray49) ? 1 : 0)) {
                gT = llllIlIlII[1];
            }
            int[] nArray50 = new int[llllIlIlII[1]];
            nArray50[D.llllIlIlII[0]] = llllIlIlII[4];
            if (D.llIIllllIllII(Inventory.contains((int[])nArray50) ? 1 : 0)) {
                gR = llllIlIlII[1];
            }
            int[] nArray51 = new int[llllIlIlII[1]];
            nArray51[D.llllIlIlII[0]] = llllIlIlII[5];
            if (D.llIIllllIllII(Inventory.contains((int[])nArray51) ? 1 : 0)) {
                gS = llllIlIlII[1];
            }
            if (D.llIIlllllIlIl(e.j(llllIlIlII[14]), llllIlIlII[23])) {
                String[] stringArray77 = new String[llllIlIlII[1]];
                stringArray77[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[299]];
                if (D.llIIlllllIIlI(NPCs.getNearest((String[])stringArray77))) {
                    int[] nArray52 = new int[llllIlIlII[1]];
                    nArray52[D.llllIlIlII[0]] = llllIlIlII[19];
                    if (D.llIIllllIllII(Inventory.contains((int[])nArray52) ? 1 : 0)) {
                        int[] nArray53 = new int[llllIlIlII[1]];
                        nArray53[D.llllIlIlII[0]] = llllIlIlII[19];
                        Inventory.getFirst((int[])nArray53).interact(llllIIllII[llllIlIlII[300]]);
                        Time.sleepTicks((int)llllIlIlII[12]);
                        0;
                    }
                }
            }
            if (D.llIIlllllIlIl(e.j(llllIlIlII[14]), llllIlIlII[23]) && D.llIIllllIllII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            System.out.println("Setting: " + e.j(llllIlIlII[14]));
        }
        g.a(new String[llllIlIlII[0]]);
    }

    private static boolean llIIllllIlllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void cg() {
        void var11;
        BankLocation bankLocation = BankLocation.getNearest();
        if (D.llIIlllllIIlI(bankLocation) && D.llIIllllIlllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[301]];
            Movement.walkTo((BankLocation)bankLocation);
            0;
            Time.sleepTicks((int)llllIlIlII[2]);
            0;
        }
        if (D.llIIlllllIIlI(var11) && D.llIIllllIllII(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[302]];
            if (D.llIIllllIlllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIlII[18]);
                0;
            }
            if (D.llIIllllIllII(Bank.isOpen() ? 1 : 0)) {
                if (D.llIIlllllIIII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llllIlIlII[9]);
                    0;
                }
                a.a(llllIlIlII[19], llllIlIlII[11]);
                a.b(f.aU, llllIlIlII[2]);
                a.a(llllIlIlII[45], llllIlIlII[9]);
                a.a(llllIlIlII[41], llllIlIlII[1]);
                a.a(llllIlIlII[39], llllIlIlII[1]);
                a.a(llllIlIlII[46], llllIlIlII[47]);
                int[] nArray = new int[llllIlIlII[1]];
                nArray[D.llllIlIlII[0]] = llllIlIlII[36];
                if (D.llIIllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llllIlIlII[1]];
                    nArray2[D.llllIlIlII[0]] = llllIlIlII[36];
                    if (D.llIIllllIlllI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdraw((int)llllIlIlII[36], (int)llllIlIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
                Bank.withdraw((int)llllIlIlII[35], (int)(Inventory.getFreeSlots() - llllIlIlII[1]), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            }
        }
    }

    private static boolean llIIllllIllll(int n2) {
        return n2 < 0;
    }

    private static String llIIllIllIIll(String var21, String var4) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), llllIlIlII[16]), "DES");
            Cipher var38 = Cipher.getInstance("DES");
            var38.init(llllIlIlII[2], var18);
            return new String(var38.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlllllIlII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean S() {
        return llllIlIlII[0];
    }

    @Override
    public boolean V() {
        int n2;
        if (D.llIIlllllIIIl(e.j(llllIlIlII[14]), llllIlIlII[23]) && D.llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
            n2 = llllIlIlII[1];
            0;
            if (3 == 0) {
                return false;
            }
        } else {
            n2 = llllIlIlII[0];
        }
        return n2 != 0;
    }

    private static boolean llIIllllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlllllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIIllllIlIII() {
        llllIIllII = new String[llllIlIlII[365]];
        D.llllIIllII[D.llllIlIlII[0]] = D."Buying items";
        D.llllIIllII[D.llllIlIlII[1]] = D."Finished buying items, switching back to quest";
        D.llllIIllII[D.llllIlIlII[2]] = D."Crandor map";
        D.llllIIllII[D.llllIlIlII[7]] = D."Drink";
        D.llllIIllII[D.llllIlIlII[9]] = D."Drink";
        D.llllIIllII[D.llllIlIlII[11]] = D."Shark";
        D.llllIIllII[D.llllIlIlII[12]] = D."Shark";
        D.llllIIllII[D.llllIlIlII[13]] = D."Eat";
        D.llllIIllII[D.llllIlIlII[16]] = D."Nav to bank";
        D.llllIIllII[D.llllIlIlII[17]] = D."Handling banking";
        D.llllIIllII[D.llllIlIlII[23]] = D."We are missing teleports, switching to BUYING";
        D.llllIIllII[D.llllIlIlII[26]] = D."We are missing steel nails, switching to BUYING";
        D.llllIIllII[D.llllIlIlII[28]] = D."We are missing planks, switching to BUYING";
        D.llllIIllII[D.llllIlIlII[38]] = D."We are missing quest supplies, switching to BUYING";
        D.llllIIllII[D.llllIlIlII[40]] = D."Nav to champ guild";
        D.llllIIllII[D.llllIlIlII[20]] = D."Talking";
        D.llllIIllII[D.llllIlIlII[43]] = D."Guildmaster";
        D.llllIIllII[D.llllIlIlII[29]] = D."Nav to oziach";
        D.llllIIllII[D.llllIlIlII[50]] = D."Oziach";
        D.llllIIllII[D.llllIlIlII[51]] = D."Rune scimitar";
        D.llllIIllII[D.llllIlIlII[10]] = D."Wield";
        D.llllIIllII[D.llllIlIlII[52]] = D."Wear";
        D.llllIIllII[D.llllIlIlII[53]] = D."Wear";
        D.llllIIllII[D.llllIlIlII[55]] = D."Maze key";
        D.llllIIllII[D.llllIlIlII[8]] = D."Nav to champ guild";
        D.llllIIllII[D.llllIlIlII[56]] = D."Eat";
        D.llllIIllII[D.llllIlIlII[57]] = D."Talking";
        D.llllIIllII[D.llllIlIlII[58]] = D."Guildmaster";
        D.llllIIllII[D.llllIlIlII[60]] = D."Where can I find the right ship?";
        D.llllIIllII[D.llllIlIlII[61]] = D."I talked to Oziach...";
        D.llllIIllII[D.llllIlIlII[63]] = D."How can I protect myself from the dragon's breath?";
        D.llllIIllII[D.llllIlIlII[65]] = D."Maze key";
        D.llllIIllII[D.llllIlIlII[15]] = D."How can I find the route to Crandor?";
        D.llllIIllII[D.llllIlIlII[66]] = D."Where is Melzar's map piece?";
        D.llllIIllII[D.llllIlIlII[68]] = D."How can I find the route to Crandor?";
        D.llllIIllII[D.llllIlIlII[69]] = D."Where is Thalzar's map piece?";
        D.llllIIllII[D.llllIlIlII[70]] = D."How can I find the route to Crandor?";
        D.llllIIllII[D.llllIlIlII[71]] = D."Where is Lozar's map piece?";
        D.llllIIllII[D.llllIlIlII[74]] = D."Maze key";
        D.llllIIllII[D.llllIlIlII[77]] = D."Oracle";
        D.llllIIllII[D.llllIlIlII[78]] = D."Nav to oracle";
        D.llllIIllII[D.llllIlIlII[79]] = D."Oracle";
        D.llllIIllII[D.llllIlIlII[80]] = D."Oracle";
        D.llllIIllII[D.llllIlIlII[82]] = D."Lobster pot";
        D.llllIIllII[D.llllIlIlII[84]] = D."Lobster pot";
        D.llllIIllII[D.llllIlIlII[87]] = D."Nav to magic door";
        D.llllIIllII[D.llllIlIlII[88]] = D."Handling magic door";
        D.llllIIllII[D.llllIlIlII[89]] = D."Silk";
        D.llllIIllII[D.llllIlIlII[90]] = D."Silk";
        D.llllIIllII[D.llllIlIlII[91]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[6]] = D."Lobster pot";
        D.llllIIllII[D.llllIlIlII[92]] = D."Lobster pot";
        D.llllIIllII[D.llllIlIlII[93]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[94]] = D."Unfired bowl";
        D.llllIIllII[D.llllIlIlII[95]] = D."Unfired bowl";
        D.llllIIllII[D.llllIlIlII[96]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[97]] = D."Wizard's mind bomb";
        D.llllIIllII[D.llllIlIlII[98]] = D."Wizard's mind bomb";
        D.llllIIllII[D.llllIlIlII[99]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[100]] = D."Silk";
        D.llllIIllII[D.llllIlIlII[101]] = D."Silk";
        D.llllIIllII[D.llllIlIlII[102]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[103]] = D."Lobster pot";
        D.llllIIllII[D.llllIlIlII[104]] = D."Lobster pot";
        D.llllIIllII[D.llllIlIlII[105]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[106]] = D."Unfired bowl";
        D.llllIIllII[D.llllIlIlII[107]] = D."Unfired bowl";
        D.llllIIllII[D.llllIlIlII[108]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[109]] = D."Wizard's mind bomb";
        D.llllIIllII[D.llllIlIlII[110]] = D."Wizard's mind bomb";
        D.llllIIllII[D.llllIlIlII[111]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[112]] = D."Chest";
        D.llllIIllII[D.llllIlIlII[113]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[114]] = D."Open";
        D.llllIIllII[D.llllIlIlII[115]] = D."Open";
        D.llllIIllII[D.llllIlIlII[116]] = D."Open";
        D.llllIIllII[D.llllIlIlII[117]] = D."Search";
        D.llllIIllII[D.llllIlIlII[118]] = D."Search";
        D.llllIIllII[D.llllIlIlII[119]] = D."Silk";
        D.llllIIllII[D.llllIlIlII[120]] = D."Silk";
        D.llllIIllII[D.llllIlIlII[121]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[122]] = D."Lobster pot";
        D.llllIIllII[D.llllIlIlII[123]] = D."Lobster pot";
        D.llllIIllII[D.llllIlIlII[124]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[125]] = D."Unfired bowl";
        D.llllIIllII[D.llllIlIlII[126]] = D."Unfired bowl";
        D.llllIIllII[D.llllIlIlII[127]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[128]] = D."Wizard's mind bomb";
        D.llllIIllII[D.llllIlIlII[129]] = D."Wizard's mind bomb";
        D.llllIIllII[D.llllIlIlII[130]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[25]] = D."Chest";
        D.llllIIllII[D.llllIlIlII[131]] = D."Magic door";
        D.llllIIllII[D.llllIlIlII[132]] = D."Open";
        D.llllIIllII[D.llllIlIlII[133]] = D."Open";
        D.llllIIllII[D.llllIlIlII[134]] = D."Open";
        D.llllIIllII[D.llllIlIlII[135]] = D."Search";
        D.llllIIllII[D.llllIlIlII[136]] = D."Search";
        D.llllIIllII[D.llllIlIlII[137]] = D."Break";
        D.llllIIllII[D.llllIlIlII[140]] = D."Nav to wormbrain";
        D.llllIIllII[D.llllIlIlII[141]] = D."Can I journey on this ship?";
        D.llllIIllII[D.llllIlIlII[142]] = D."Search away, I have nothing to hide.";
        D.llllIIllII[D.llllIlIlII[143]] = D."Ok.";
        D.llllIIllII[D.llllIlIlII[144]] = D."Talking";
        D.llllIIllII[D.llllIlIlII[145]] = D."Wormbrain";
        D.llllIIllII[D.llllIlIlII[146]] = D."Beer glass";
        D.llllIIllII[D.llllIlIlII[147]] = D."Beer glass";
        D.llllIIllII[D.llllIlIlII[148]] = D."Drop";
        D.llllIIllII[D.llllIlIlII[155]] = D."Nav to maze";
        D.llllIIllII[D.llllIlIlII[156]] = D."Door";
        D.llllIIllII[D.llllIlIlII[157]] = D."Open";
        D.llllIIllII[D.llllIlIlII[165]] = D."Getting key";
        D.llllIIllII[D.llllIlIlII[167]] = D."Attack";
        D.llllIIllII[D.llllIlIlII[168]] = D."Take";
        D.llllIIllII[D.llllIlIlII[171]] = D."Nav to red door";
        D.llllIIllII[D.llllIlIlII[172]] = D."Red door";
        D.llllIIllII[D.llllIlIlII[173]] = D."Open";
        D.llllIIllII[D.llllIlIlII[174]] = D."Go up";
        D.llllIIllII[D.llllIlIlII[175]] = D."Climb-up";
        D.llllIIllII[D.llllIlIlII[179]] = D."Getting key";
        D.llllIIllII[D.llllIlIlII[181]] = D."Attack";
        D.llllIIllII[D.llllIlIlII[182]] = D."Take";
        D.llllIIllII[D.llllIlIlII[185]] = D."Nav to orange door";
        D.llllIIllII[D.llllIlIlII[186]] = D."Orange door";
        D.llllIIllII[D.llllIlIlII[187]] = D."Open";
        D.llllIIllII[D.llllIlIlII[188]] = D."Climb-up";
        D.llllIIllII[D.llllIlIlII[190]] = D."Getting key";
        D.llllIIllII[D.llllIlIlII[192]] = D."Attack";
        D.llllIIllII[D.llllIlIlII[193]] = D."Take";
        D.llllIIllII[D.llllIlIlII[195]] = D."Nav to yellow door";
        D.llllIIllII[D.llllIlIlII[196]] = D."Yellow door";
        D.llllIIllII[D.llllIlIlII[197]] = D."Open";
        D.llllIIllII[D.llllIlIlII[198]] = D."Climb-down";
        D.llllIIllII[D.llllIlIlII[201]] = D."Climb-down";
        D.llllIIllII[D.llllIlIlII[202]] = D."Climb-down";
        D.llllIIllII[D.llllIlIlII[208]] = D."Getting blue key";
        D.llllIIllII[D.llllIlIlII[210]] = D."Attack";
        D.llllIIllII[D.llllIlIlII[211]] = D."Take";
        D.llllIIllII[D.llllIlIlII[213]] = D."Nav to blue door";
        D.llllIIllII[D.llllIlIlII[214]] = D."Blue door";
        D.llllIIllII[D.llllIlIlII[215]] = D."Open";
        D.llllIIllII[D.llllIlIlII[217]] = D."Getting key";
        D.llllIIllII[D.llllIlIlII[219]] = D."Attack";
        D.llllIIllII[D.llllIlIlII[220]] = D."Take";
        D.llllIIllII[D.llllIlIlII[223]] = D."Nav to magneta door";
        D.llllIIllII[D.llllIlIlII[224]] = D."Magenta door";
        D.llllIIllII[D.llllIlIlII[225]] = D."Open";
        D.llllIIllII[D.llllIlIlII[226]] = D."Lesser demon";
        D.llllIIllII[D.llllIlIlII[228]] = D."Attack";
        D.llllIIllII[D.llllIlIlII[229]] = D."Take";
        D.llllIIllII[D.llllIlIlII[231]] = D."Nav to green door";
        D.llllIIllII[D.llllIlIlII[232]] = D."Green door";
        D.llllIIllII[D.llllIlIlII[233]] = D."Open";
        D.llllIIllII[D.llllIlIlII[234]] = D."Open";
        D.llllIIllII[D.llllIlIlII[235]] = D."Open";
        D.llllIIllII[D.llllIlIlII[236]] = D."Search";
        D.llllIIllII[D.llllIlIlII[237]] = D."Search";
        D.llllIIllII[D.llllIlIlII[238]] = D."Plank";
        D.llllIIllII[D.llllIlIlII[239]] = D."Plank";
        D.llllIIllII[D.llllIlIlII[240]] = D."Nav to boat";
        D.llllIIllII[D.llllIlIlII[241]] = D."Customs officer";
        D.llllIIllII[D.llllIlIlII[242]] = D."Can I journey on this ship?";
        D.llllIIllII[D.llllIlIlII[243]] = D."Search away, I have nothing to hide.";
        D.llllIIllII[D.llllIlIlII[244]] = D."Ok.";
        D.llllIIllII[D.llllIlIlII[245]] = D."Klarense";
        D.llllIIllII[D.llllIlIlII[246]] = D."Cabin boy Jenkins";
        D.llllIIllII[D.llllIlIlII[247]] = D."Boarding boat";
        D.llllIIllII[D.llllIlIlII[248]] = D."Gangplank";
        D.llllIIllII[D.llllIlIlII[249]] = D."Cross";
        D.llllIIllII[D.llllIlIlII[250]] = D."Reparing hole";
        D.llllIIllII[D.llllIlIlII[251]] = D."Hole";
        D.llllIIllII[D.llllIlIlII[252]] = D."Repair";
        D.llllIIllII[D.llllIlIlII[253]] = D."Ladder";
        D.llllIIllII[D.llllIlIlII[254]] = D."Climb-down";
        D.llllIIllII[D.llllIlIlII[255]] = D."Hiring ned";
        D.llllIIllII[D.llllIlIlII[256]] = D."Ned";
        D.llllIIllII[D.llllIlIlII[257]] = D."Draynor Village";
        D.llllIIllII[D.llllIlIlII[14]] = D."Ned";
        D.llllIIllII[D.llllIlIlII[72]] = D."Captain Ned";
        D.llllIIllII[D.llllIlIlII[260]] = D."Nav to boat";
        D.llllIIllII[D.llllIlIlII[261]] = D."Customs officer";
        D.llllIIllII[D.llllIlIlII[262]] = D."Can I journey on this ship?";
        D.llllIIllII[D.llllIlIlII[263]] = D."Search away, I have nothing to hide.";
        D.llllIIllII[D.llllIlIlII[264]] = D."Ok.";
        D.llllIIllII[D.llllIlIlII[265]] = D."Gangplank";
        D.llllIIllII[D.llllIlIlII[266]] = D."Cross";
        D.llllIIllII[D.llllIlIlII[267]] = D."Captain Ned";
        D.llllIIllII[D.llllIlIlII[268]] = D."Captain Ned";
        D.llllIIllII[D.llllIlIlII[272]] = D."Nav to entrance";
        D.llllIIllII[D.llllIlIlII[273]] = D."Hole";
        D.llllIIllII[D.llllIlIlII[274]] = D."Enter";
        D.llllIIllII[D.llllIlIlII[275]] = D."Elvarg";
        D.llllIIllII[D.llllIlIlII[277]] = D."Nav to fight";
        D.llllIIllII[D.llllIlIlII[278]] = D."Nav to fight";
        D.llllIIllII[D.llllIlIlII[279]] = D."Shark";
        D.llllIIllII[D.llllIlIlII[280]] = D."Shark";
        D.llllIIllII[D.llllIlIlII[281]] = D."Eat";
        D.llllIIllII[D.llllIlIlII[282]] = D."Wall";
        D.llllIIllII[D.llllIlIlII[283]] = D."Climb-over";
        D.llllIIllII[D.llllIlIlII[284]] = D."Elvarg boss fight";
        D.llllIIllII[D.llllIlIlII[285]] = D."Vial";
        D.llllIIllII[D.llllIlIlII[286]] = D."Vial";
        D.llllIIllII[D.llllIlIlII[287]] = D."Drop";
        D.llllIIllII[D.llllIlIlII[288]] = D."Shark";
        D.llllIIllII[D.llllIlIlII[289]] = D."Drop";
        D.llllIIllII[D.llllIlIlII[290]] = D."Drink";
        D.llllIIllII[D.llllIlIlII[292]] = D."Drink";
        D.llllIIllII[D.llllIlIlII[293]] = D."Attack";
        D.llllIIllII[D.llllIlIlII[295]] = D."Nav to oziach";
        D.llllIIllII[D.llllIlIlII[296]] = D."Oziach";
        D.llllIIllII[D.llllIlIlII[297]] = D."Wear";
        D.llllIIllII[D.llllIlIlII[298]] = D."Crandor map";
        D.llllIIllII[D.llllIlIlII[299]] = D."Oziach";
        D.llllIIllII[D.llllIlIlII[300]] = D."Break";
        D.llllIIllII[D.llllIlIlII[301]] = D."Nav to bank";
        D.llllIIllII[D.llllIlIlII[302]] = D."Handling banking";
        D.llllIIllII[D.llllIlIlII[303]] = D."Nav to bank";
        D.llllIIllII[D.llllIlIlII[304]] = D."Handling banking";
        D.llllIIllII[D.llllIlIlII[306]] = D."Nav to bank";
        D.llllIIllII[D.llllIlIlII[307]] = D."Handling banking";
        D.llllIIllII[D.llllIlIlII[308]] = D."Maze key";
        D.llllIIllII[D.llllIlIlII[315]] = D."Dragon slayer 1 quest";
        D.llllIIllII[D.llllIlIlII[316]] = D."ring of wealth (";
        D.llllIIllII[D.llllIlIlII[317]] = D."Antifire";
        D.llllIIllII[D.llllIlIlII[318]] = D."Antifire";
        D.llllIIllII[D.llllIlIlII[319]] = D."combat";
        D.llllIIllII[D.llllIlIlII[320]] = D."combat";
        D.llllIIllII[D.llllIlIlII[321]] = D."Antifire";
        D.llllIIllII[D.llllIlIlII[322]] = D."Antifire";
        D.llllIIllII[D.llllIlIlII[323]] = D."glory";
        D.llllIIllII[D.llllIlIlII[324]] = D."Chest";
        D.llllIIllII[D.llllIlIlII[325]] = D."Zombie";
        D.llllIIllII[D.llllIlIlII[326]] = D."Ladder";
        D.llllIIllII[D.llllIlIlII[327]] = D."Climb-down";
        D.llllIIllII[D.llllIlIlII[328]] = D."Ladder";
        D.llllIIllII[D.llllIlIlII[329]] = D."Climb-down";
        D.llllIIllII[D.llllIlIlII[330]] = D."Ladder";
        D.llllIIllII[D.llllIlIlII[331]] = D."Skeleton";
        D.llllIIllII[D.llllIlIlII[332]] = D."Ladder";
        D.llllIIllII[D.llllIlIlII[333]] = D."Ghost";
        D.llllIIllII[D.llllIlIlII[334]] = D."Ladder";
        D.llllIIllII[D.llllIlIlII[335]] = D."wealth";
        D.llllIIllII[D.llllIlIlII[336]] = D."wealth";
        D.llllIIllII[D.llllIlIlII[337]] = D."wealth";
        D.llllIIllII[D.llllIlIlII[338]] = D."glory";
        D.llllIIllII[D.llllIlIlII[339]] = D."glory";
        D.llllIIllII[D.llllIlIlII[340]] = D."glory";
        D.llllIIllII[D.llllIlIlII[349]] = D."Can I have a quest?";
        D.llllIIllII[D.llllIlIlII[350]] = D."Yes.";
        D.llllIIllII[D.llllIlIlII[351]] = D."Can you sell me a rune platebody?";
        D.llllIIllII[D.llllIlIlII[352]] = D."The Guildmaster of the Champions' Guild told me.";
        D.llllIIllII[D.llllIlIlII[353]] = D."I thought you were going to give me a quest.";
        D.llllIIllII[D.llllIlIlII[354]] = D."A dragon, that sounds like fun.";
        D.llllIIllII[D.llllIlIlII[355]] = D."I talked to Oziach...";
        D.llllIIllII[D.llllIlIlII[356]] = D."Where can I find the right ship?";
        D.llllIIllII[D.llllIlIlII[357]] = D."I seek a piece of the map to the island of Crandor.";
        D.llllIIllII[D.llllIlIlII[358]] = D."I believe you've got a piece of map that I need.";
        D.llllIIllII[D.llllIlIlII[359]] = D."I suppose I could pay you for the map piece...";
        D.llllIIllII[D.llllIlIlII[360]] = D."Alright then, 10,000 it is.";
        D.llllIIllII[D.llllIlIlII[361]] = D."I'd like to buy her.";
        D.llllIIllII[D.llllIlIlII[362]] = D."Yep, sounds good.";
        D.llllIIllII[D.llllIlIlII[363]] = D."You're a sailor? Could you take me to Crandor?";
        D.llllIIllII[D.llllIlIlII[364]] = D."Yes, let's go!";
    }

    private static int llIIllllIlIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public String U() {
        return llllIIllII[llllIlIlII[315]];
    }

    private static void llIIllllIlIlI() {
        llllIlIlII = new int[366];
        D.llllIlIlII[0] = (0x43 ^ 0x19 ^ (0xB4 ^ 0xB9)) & (0xA8 ^ 0xAD ^ (0x7C ^ 0x2E) ^ -1);
        D.llllIlIlII[1] = 1;
        D.llllIlIlII[2] = 2;
        D.llllIlIlII[3] = 0xFFFF8DFF & 0x77FF;
        D.llllIlIlII[4] = -(0xFFFF917D & 0x7FC7) & (0xFFFF9FCF & 0x7775);
        D.llllIlIlII[5] = 0xFFFFEE75 & 0x178A;
        D.llllIlIlII[6] = 151 + 76 - 80 + 16 ^ 65 + 64 - 126 + 142;
        D.llllIlIlII[7] = 3;
        D.llllIlIlII[8] = 0xDD ^ 0xC5;
        D.llllIlIlII[9] = 0xB ^ 0xF;
        D.llllIlIlII[10] = 163 + 59 - 105 + 72 ^ 109 + 101 - 134 + 93;
        D.llllIlIlII[11] = 9 ^ 0x3C ^ (0xA5 ^ 0x95);
        D.llllIlIlII[12] = 0x48 ^ 0x65 ^ (0 ^ 0x2B);
        D.llllIlIlII[13] = 0x21 ^ 0x74 ^ (0xF8 ^ 0xAA);
        D.llllIlIlII[14] = 130 + 83 - 203 + 166;
        D.llllIlIlII[15] = 0x64 ^ 0x44;
        D.llllIlIlII[16] = 2 ^ 0xA;
        D.llllIlIlII[17] = 0x3D ^ 0x34;
        D.llllIlIlII[18] = -(0xFFFFF5F1 & 0xE7F) & (0xFFFFDFF8 & 0x37FF);
        D.llllIlIlII[19] = 0xFFFFDFFF & 0x3F47;
        D.llllIlIlII[20] = 36 + 32 - -41 + 68 ^ 174 + 93 - 201 + 124;
        D.llllIlIlII[21] = 0xFFFFDFEB & 0x3F5D;
        D.llllIlIlII[22] = 0xFFFFFF6E & 0x1FD9;
        D.llllIlIlII[23] = 0x21 ^ 0x2B;
        D.llllIlIlII[24] = 0xFFFFB783 & 0x4E7F;
        D.llllIlIlII[25] = 0x54 ^ 0xE;
        D.llllIlIlII[26] = 0x7A ^ 0x71;
        D.llllIlIlII[27] = -(0xFFFFD9B7 & 0x6E7E) & (0xFFFFCBF7 & 0x7FFD);
        D.llllIlIlII[28] = 0x76 ^ 0x3A ^ (0x2E ^ 0x6E);
        D.llllIlIlII[29] = 0x8B ^ 0x9A;
        D.llllIlIlII[30] = 0xFFFFE6FF & 0x1FFF;
        D.llllIlIlII[31] = 0xFFFFEF77 & 0x17FB;
        D.llllIlIlII[32] = -(0xFFFFEEDF & 0x3BF1) & (0xFFFFFFFF & 0x2BFD);
        D.llllIlIlII[33] = 0xFFFFDFFE & 0x23B7;
        D.llllIlIlII[34] = 0xFFFFF92B & 0xFFF;
        D.llllIlIlII[35] = 0xFFFF839F & 0x7DE1;
        D.llllIlIlII[36] = -(0xFFFFE59D & 0x7B76) & (0xFFFFFFB7 & 0x675F);
        D.llllIlIlII[37] = 0xFFFFFB57 & 0x35F9;
        D.llllIlIlII[38] = 0xB3 ^ 0xC3 ^ (0x21 ^ 0x5C);
        D.llllIlIlII[39] = -(0xFFFFDB66 & 0x36FB) & (0xFFFFDFFF & 0x3BF5);
        D.llllIlIlII[40] = 0xEB ^ 0x83 ^ (0xF7 ^ 0x91);
        D.llllIlIlII[41] = -(0xFFFFEDEB & 0x5E7D) & (0xFFFFFFFF & 0x7DFF);
        D.llllIlIlII[42] = 0xFFFFBFEF & 0x6EDA;
        D.llllIlIlII[43] = 0x1E ^ 0xE;
        D.llllIlIlII[44] = 0xFFFFD73F & 0x2DF5;
        D.llllIlIlII[45] = 0xFFFFAF9E & 0x59E3;
        D.llllIlIlII[46] = -(0xFFFFDC37 & 0x6FDD) & (0xFFFFEFFF & 0x5FF7);
        D.llllIlIlII[47] = -(0xFFFFDBE6 & 0x657F) & (0xFFFFFBFF & 0x7FFD);
        D.llllIlIlII[48] = 0xFFFFFBFF & 0xFFD;
        D.llllIlIlII[49] = 0xFFFF9FFD & 0x6DBF;
        D.llllIlIlII[50] = 0xAC ^ 0xBE;
        D.llllIlIlII[51] = 53 + 26 - -33 + 78 ^ 84 + 152 - 74 + 11;
        D.llllIlIlII[52] = 0x1E ^ 0x47 ^ (0xEE ^ 0xA2);
        D.llllIlIlII[53] = 151 + 57 - 56 + 38 ^ 143 + 97 - 175 + 103;
        D.llllIlIlII[54] = 0xFFFFEEF6 & 0x1FA9;
        D.llllIlIlII[55] = 0xC ^ 0x57 ^ (0x63 ^ 0x2F);
        D.llllIlIlII[56] = 0xAA ^ 0x98 ^ (0xBD ^ 0x96);
        D.llllIlIlII[57] = 53 + 69 - 87 + 107 ^ 58 + 44 - 26 + 72;
        D.llllIlIlII[58] = 79 + 44 - 112 + 153 ^ 169 + 182 - 164 + 4;
        D.llllIlIlII[59] = 0xFFFFBFB1 & 0x4EEF;
        D.llllIlIlII[60] = 114 + 39 - -12 + 11 ^ 86 + 77 - 65 + 74;
        D.llllIlIlII[61] = 0xAC ^ 0xB1;
        D.llllIlIlII[62] = 0xFFFFAEB3 & 0x5FEE;
        D.llllIlIlII[63] = 0xC7 ^ 0x92 ^ (0xD7 ^ 0x9C);
        D.llllIlIlII[64] = 0xFFFFBF9F & 0x4EFE;
        D.llllIlIlII[65] = 0x62 ^ 0x7D;
        D.llllIlIlII[66] = 0x40 ^ 0x61;
        D.llllIlIlII[67] = 0xFFFFEFFF & 0x1E9F;
        D.llllIlIlII[68] = 0xD9 ^ 0xC6 ^ (0x8B ^ 0xB6);
        D.llllIlIlII[69] = 0x2B ^ 8;
        D.llllIlIlII[70] = 0x87 ^ 0xA3;
        D.llllIlIlII[71] = 0x45 ^ 0x60;
        D.llllIlIlII[72] = (0xAF ^ 0x8E) + (0x56 ^ 0x1A) - (0x4F ^ 0x17) + (127 + 126 - 187 + 90);
        D.llllIlIlII[73] = -(0xFFFFFEDE & 0x31F9) & (0xFFFFBFFF & 0x77FF);
        D.llllIlIlII[74] = 0x1A ^ 0x3C;
        D.llllIlIlII[75] = 0xFFFF9BD7 & 0x6FEE;
        D.llllIlIlII[76] = 0xFFFFDDFF & 0x2FAD;
        D.llllIlIlII[77] = 0x2C ^ 0xB;
        D.llllIlIlII[78] = 0xE0 ^ 0xBD ^ (0xE9 ^ 0x9C);
        D.llllIlIlII[79] = 0x6E ^ 0x47;
        D.llllIlIlII[80] = 0xEA ^ 0xC0;
        D.llllIlIlII[81] = 0xFFFF9FAF & 0x6EF6;
        D.llllIlIlII[82] = 0x99 ^ 0x97 ^ (0x5E ^ 0x7B);
        D.llllIlIlII[83] = -(0xFFFFE0D1 & 0x3F3F) & (0xFFFFBFBF & 0x6EF5);
        D.llllIlIlII[84] = 101 + 27 - 16 + 21 ^ 111 + 113 - 100 + 45;
        D.llllIlIlII[85] = 0xFFFFEBF9 & 0x1FEF;
        D.llllIlIlII[86] = 0xFFFFFFF6 & 0x2679;
        D.llllIlIlII[87] = 60 + 115 - 114 + 74 ^ 21 + 135 - 18 + 32;
        D.llllIlIlII[88] = 0x74 ^ 0x5A;
        D.llllIlIlII[89] = 147 + 138 - 197 + 66 ^ 81 + 82 - 16 + 34;
        D.llllIlIlII[90] = 0xA6 ^ 0x96;
        D.llllIlIlII[91] = 0x96 ^ 0xA7;
        D.llllIlIlII[92] = 0x89 ^ 0xBA;
        D.llllIlIlII[93] = 0x4A ^ 0x62 ^ (0x90 ^ 0x8C);
        D.llllIlIlII[94] = 0x2C ^ 0x19;
        D.llllIlIlII[95] = 0x93 ^ 0x98 ^ (0x48 ^ 0x75);
        D.llllIlIlII[96] = 0x63 ^ 0x54;
        D.llllIlIlII[97] = 0x3D ^ 0x1A ^ (0x62 ^ 0x7D);
        D.llllIlIlII[98] = 0x47 ^ 0x73 ^ (0x78 ^ 0x75);
        D.llllIlIlII[99] = 0x44 ^ 0x7E;
        D.llllIlIlII[100] = 0x17 ^ 0x2C;
        D.llllIlIlII[101] = 0x51 ^ 0x6D;
        D.llllIlIlII[102] = 0xA ^ 0x37;
        D.llllIlIlII[103] = 0x3C ^ 2;
        D.llllIlIlII[104] = 0x42 ^ 0x24 ^ (0x4E ^ 0x17);
        D.llllIlIlII[105] = 137 + 18 - 129 + 219 ^ 159 + 53 - 57 + 26;
        D.llllIlIlII[106] = 0x45 ^ 4;
        D.llllIlIlII[107] = 0x31 ^ 0x73;
        D.llllIlIlII[108] = 0x4F ^ 0xC;
        D.llllIlIlII[109] = 0xAA ^ 0x92 ^ (8 ^ 0x74);
        D.llllIlIlII[110] = 110 + 192 - 203 + 101 ^ 39 + 95 - 68 + 75;
        D.llllIlIlII[111] = 0xA8 ^ 0x8B ^ (0x10 ^ 0x75);
        D.llllIlIlII[112] = 0x70 ^ 0x37;
        D.llllIlIlII[113] = 236 + 87 - 162 + 94 ^ 152 + 147 - 259 + 143;
        D.llllIlIlII[114] = 170 + 42 - 35 + 50 ^ 73 + 71 - 109 + 135;
        D.llllIlIlII[115] = 0x96 ^ 0x99 ^ (0xCF ^ 0x8A);
        D.llllIlIlII[116] = 0x31 ^ 0x7A;
        D.llllIlIlII[117] = 0xC1 ^ 0xB9 ^ (0x54 ^ 0x60);
        D.llllIlIlII[118] = 0x19 ^ 0x54;
        D.llllIlIlII[119] = 0xC1 ^ 0xA3 ^ (0xE ^ 0x22);
        D.llllIlIlII[120] = 0x52 ^ 0 ^ (0x69 ^ 0x74);
        D.llllIlIlII[121] = 0x72 ^ 0x22;
        D.llllIlIlII[122] = 0x20 ^ 0x71;
        D.llllIlIlII[123] = 0xD8 ^ 0x8A;
        D.llllIlIlII[124] = 51 + 169 - 77 + 78 ^ 61 + 83 - 59 + 57;
        D.llllIlIlII[125] = 0x7A ^ 0x45 ^ (0x5F ^ 0x34);
        D.llllIlIlII[126] = 0x47 ^ 0x56 ^ (0xCB ^ 0x8F);
        D.llllIlIlII[127] = 0xE4 ^ 0xB2;
        D.llllIlIlII[128] = 187 + 150 - 126 + 35 ^ 67 + 93 - 108 + 109;
        D.llllIlIlII[129] = 0x75 ^ 0x2D;
        D.llllIlIlII[130] = 0xB ^ 0x7B ^ (0x76 ^ 0x5F);
        D.llllIlIlII[131] = 0x73 ^ 0x74 ^ (0xFE ^ 0xA2);
        D.llllIlIlII[132] = 0x9F ^ 0xC3;
        D.llllIlIlII[133] = 0xEF ^ 0x82 ^ (0x83 ^ 0xB3);
        D.llllIlIlII[134] = 10 + 182 - 131 + 189 ^ 63 + 152 - 187 + 136;
        D.llllIlIlII[135] = 0x91 ^ 0x8E ^ (0x4F ^ 0xF);
        D.llllIlIlII[136] = 0x37 ^ 0x57;
        D.llllIlIlII[137] = 0x80 ^ 0xB9 ^ (0x2F ^ 0x77);
        D.llllIlIlII[138] = 0xFFFFABFE & 0x5FC5;
        D.llllIlIlII[139] = -(0xFFFFF8FB & 0x7707) & (0xFFFFFC77 & Short.MAX_VALUE);
        D.llllIlIlII[140] = 0x10 ^ 0x72;
        D.llllIlIlII[141] = 17 + 49 - 47 + 221 ^ 145 + 73 - 151 + 80;
        D.llllIlIlII[142] = 0xDE ^ 0xBA ^ (0xC ^ 2) & ~(0x99 ^ 0x97);
        D.llllIlIlII[143] = 0xE4 ^ 0xC4 ^ (0x47 ^ 2);
        D.llllIlIlII[144] = 2 ^ 0x64;
        D.llllIlIlII[145] = 0x2E ^ 0x15 ^ (0xD0 ^ 0x8C);
        D.llllIlIlII[146] = 73 + 130 - 13 + 6 ^ 125 + 160 - 231 + 118;
        D.llllIlIlII[147] = 0x1D ^ 0x74;
        D.llllIlIlII[148] = 0x67 ^ 0xD;
        D.llllIlIlII[149] = -(0xFFFFFD5E & 0x72B7) & (0xFFFFFFFF & 0x7B7F);
        D.llllIlIlII[150] = 0xFFFFDCEE & 0x2FB7;
        D.llllIlIlII[151] = 0xFFFFFF64 & 0xBFF;
        D.llllIlIlII[152] = 0xFFFFBDF4 & 0x67AF;
        D.llllIlIlII[153] = -(0xFFFFB7E3 & 0x5C9F) & (0xFFFFBFFF & 0x5FFF);
        D.llllIlIlII[154] = 0xFFFFDDFA & 0x2EB5;
        D.llllIlIlII[155] = 232 + 183 - 304 + 132 ^ 46 + 102 - 93 + 97;
        D.llllIlIlII[156] = 45 + 74 - -44 + 10 ^ 56 + 33 - 53 + 157;
        D.llllIlIlII[157] = 0xE2 ^ 0xBC ^ (0xB9 ^ 0x8A);
        D.llllIlIlII[158] = 0xFFFFFFED & 0xB7B;
        D.llllIlIlII[159] = 0xFFFF9DBA & 0x6EF7;
        D.llllIlIlII[160] = -(111 + 46 - 97 + 85) & (0xFFFFEBFF & 0x1FFB);
        D.llllIlIlII[161] = 0xFFFF9FF7 & 0x6CBF;
        D.llllIlIlII[162] = -(0xFFFFF97F & 0x6FF1) & (0xFFFFFFF7 & 0x6F7F);
        D.llllIlIlII[163] = -(0xFFFFF70E & 0x1CFF) & (0xFFFFDF7F & 0x3FFF);
        D.llllIlIlII[164] = -(0xFFFF939F & 0x7F7B) & (0xFFFFBFBF & 0x5FFF);
        D.llllIlIlII[165] = 25 + 59 - -20 + 121 ^ 35 + 88 - 96 + 116;
        D.llllIlIlII[166] = -(0xFFFFBCD7 & 0x733F) & (0xFFFFFFF7 & 0x3F9F);
        D.llllIlIlII[167] = 0xC2 ^ 0xAD;
        D.llllIlIlII[168] = 0x5A ^ 0x2A;
        D.llllIlIlII[169] = 0xFFFFEB7E & 0x1FEF;
        D.llllIlIlII[170] = -(0xFFFFE387 & 0x7F79) & (0xFFFFEFB5 & Short.MAX_VALUE);
        D.llllIlIlII[171] = 0xEE ^ 0xB9 ^ (0x57 ^ 0x71);
        D.llllIlIlII[172] = 0x40 ^ 0x32;
        D.llllIlIlII[173] = 0xDB ^ 0xAA ^ 2;
        D.llllIlIlII[174] = 0xAD ^ 0x8A ^ (0x4E ^ 0x1D);
        D.llllIlIlII[175] = 0x76 ^ 4 ^ (0x2A ^ 0x2D);
        D.llllIlIlII[176] = 0xFFFF8B79 & 0x7FFE;
        D.llllIlIlII[177] = 0xFFFFBDAC & 0x4EF7;
        D.llllIlIlII[178] = -(0xFFFFF99F & 0x7E77) & (0xFFFFFEDF & 0x7F3E);
        D.llllIlIlII[179] = 0x25 ^ 0x53;
        D.llllIlIlII[180] = -(0xFFFFF0FD & 0x5F33) & (0xFFFFFFBF & 0x5FF7);
        D.llllIlIlII[181] = 0x51 ^ 0x26;
        D.llllIlIlII[182] = 0x36 ^ 0x31 ^ 12 + 1 - -97 + 17;
        D.llllIlIlII[183] = 0xFFFFCBF3 & 0x3F7F;
        D.llllIlIlII[184] = 0xFFFFBDB6 & 0x4EFD;
        D.llllIlIlII[185] = 0x82 ^ 0xB8 ^ (0x39 ^ 0x7A);
        D.llllIlIlII[186] = 0xE6 ^ 0x9C;
        D.llllIlIlII[187] = 0x21 ^ 0x73 ^ (0x11 ^ 0x38);
        D.llllIlIlII[188] = 0xFD ^ 0x81;
        D.llllIlIlII[189] = -(0xFFFFF9FF & 0x2FC7) & (0xFFFFEFEF & 0x3FDF);
        D.llllIlIlII[190] = 0xE7 ^ 0x9A;
        D.llllIlIlII[191] = -(0x3E ^ 0x2A) & (0xFFFFFFD7 & 0xFBF);
        D.llllIlIlII[192] = 0xBE ^ 0xC0;
        D.llllIlIlII[193] = (0xCC ^ 0xC3) + (0xD7 ^ 0x83) - (0x4C ^ 0x5F) + (0xB1 ^ 0x9E);
        D.llllIlIlII[194] = 0xFFFFCB7D & 0x3FEE;
        D.llllIlIlII[195] = (0x3A ^ 0x32) + (0x54 ^ 0x42) - -(0x30 ^ 6) + (0x13 ^ 0x3F);
        D.llllIlIlII[196] = 78 + 63 - 50 + 38;
        D.llllIlIlII[197] = (0xAE ^ 0xB3) + (0x2A ^ 0x13) - -(0x31 ^ 0x17) + (0x86 ^ 0x80);
        D.llllIlIlII[198] = (0xF1 ^ 0xAC) + (0xCF ^ 0xA5) - (196 + 124 - 144 + 22) + (100 + 16 - 105 + 119);
        D.llllIlIlII[199] = -(0xFFFFBF0B & 0x50F5) & (0xFFFFFB7B & 0x1FFF);
        D.llllIlIlII[200] = 0xFFFFBFAC & 0x4CFB;
        D.llllIlIlII[201] = (0x5E ^ 0x74) + (0x44 ^ 0x43) - -(0x3D ^ 0x6F) + 1;
        D.llllIlIlII[202] = (0xC5 ^ 0x8F) + (0xE4 ^ 0x9D) - (0x4D ^ 0x23) + (0x87 ^ 0xB7);
        D.llllIlIlII[203] = -(0xFFFFCA89 & 0x3F77) & (0xFFFFFFBE & 0x2FF5);
        D.llllIlIlII[204] = 0xFFFFABF5 & 0x5F7F;
        D.llllIlIlII[205] = -(0xFFFFFE7A & 0xB87) & (0xFFFFEFEF & 0x3FBF);
        D.llllIlIlII[206] = 0xFFFFB5AB & 0x6FFF;
        D.llllIlIlII[207] = -(0xFFFFFDFA & 0x5B77) & (0xFFFFDFFF & 0x7F7B);
        D.llllIlIlII[208] = 27 + 28 - 2 + 81;
        D.llllIlIlII[209] = -(0xFFFFFFFB & 0x2066) & (0xFFFFEFFD & 0x3FEF);
        D.llllIlIlII[210] = 30 + 91 - 61 + 75;
        D.llllIlIlII[211] = (0x3E ^ 0x56) + (0x52 ^ 0xE) - (0xF9 ^ 0xB0) + (0xB7 ^ 0xBA);
        D.llllIlIlII[212] = -(0xFFFFFB5F & 0x46A3) & (0xFFFFE7AE & Short.MAX_VALUE);
        D.llllIlIlII[213] = 13 + 132 - 29 + 21;
        D.llllIlIlII[214] = 14 + 30 - -47 + 47;
        D.llllIlIlII[215] = 48 + 25 - -7 + 59;
        D.llllIlIlII[216] = 0xFFFFC63B & 0x3FCF;
        D.llllIlIlII[217] = 82 + 104 - 88 + 42;
        D.llllIlIlII[218] = 0xFFFF8BFF & 0x7737;
        D.llllIlIlII[219] = (0x3C ^ 0x38) + (0x20 ^ 0x33) - -(0x9C ^ 0x96) + (0x51 ^ 0x3D);
        D.llllIlIlII[220] = (0x61 ^ 0x2A) + (34 + 66 - 53 + 88) - (67 + 46 - 92 + 121) + (7 ^ 0x4D);
        D.llllIlIlII[221] = -(0xFFFFF43D & 0x4BC3) & (0xFFFFCB7B & 0x7FF5);
        D.llllIlIlII[222] = 0xFFFFA5BB & 0x7FF7;
        D.llllIlIlII[223] = (0x17 ^ 0x23) + (0x69 ^ 0x4A) - (0x61 ^ 0x2F) + (106 + 114 - 105 + 19);
        D.llllIlIlII[224] = (0x9D ^ 0xA9) + (8 ^ 0x40) - 3 + (0x42 ^ 0x55);
        D.llllIlIlII[225] = 84 + 77 - 88 + 72;
        D.llllIlIlII[226] = 60 + 116 - 153 + 123;
        D.llllIlIlII[227] = -(0xFFFFC973 & 0x7FAF) & (0xFFFFDF3E & 0x6FEF);
        D.llllIlIlII[228] = 141 + 57 - 78 + 27;
        D.llllIlIlII[229] = (0x39 ^ 0xD) + (4 ^ 0x31) - (0x8E ^ 0xA5) + (0x34 ^ 0x62);
        D.llllIlIlII[230] = 0xFFFFEDB7 & 0x37FF;
        D.llllIlIlII[231] = (0x4C ^ 0x43) + (0xD9 ^ 0xAA) - (0x20 ^ 0x5B) + (44 + 89 - 9 + 18);
        D.llllIlIlII[232] = (0x1A ^ 0x42) + (0x17 ^ 0) - (0x68 ^ 0x57) + (0xFF ^ 0x99);
        D.llllIlIlII[233] = (0x9E ^ 0xBD) + (0x5A ^ 0x7A) - (0x31 ^ 0x20) + (0xC6 ^ 0xA3);
        D.llllIlIlII[234] = 11 + 51 - -73 + 4 + (0x52 ^ 0x6E) - (0x74 ^ 2) + (0x6C ^ 0x2B);
        D.llllIlIlII[235] = 6 + 139 - -3 + 5;
        D.llllIlIlII[236] = 74 + 69 - 3 + 14;
        D.llllIlIlII[237] = 23 + 77 - 68 + 123;
        D.llllIlIlII[238] = 33 + 72 - 37 + 88;
        D.llllIlIlII[239] = 52 + 70 - 3 + 38;
        D.llllIlIlII[240] = 86 + 64 - 145 + 153;
        D.llllIlIlII[241] = (0x6F ^ 0x24) + (114 + 102 - 152 + 86) - (138 + 0 - -6 + 39) + (0x63 ^ 0x16);
        D.llllIlIlII[242] = 101 + 34 - 29 + 24 + (0x1D ^ 0x15) - (0x11 ^ 0x5A) + (0x58 ^ 0x39);
        D.llllIlIlII[243] = (0xD5 ^ 0xAE) + (0x2D ^ 0x75) - (106 + 32 - 76 + 125) + (57 + 63 - 3 + 20);
        D.llllIlIlII[244] = 91 + 100 - 162 + 133;
        D.llllIlIlII[245] = 107 + 81 - 74 + 49;
        D.llllIlIlII[246] = 0 + 144 - 62 + 82;
        D.llllIlIlII[247] = 61 + 116 - 173 + 134 + (0xBB ^ 0x98) - (71 + 18 - -34 + 5) + (0x6A ^ 0x12);
        D.llllIlIlII[248] = 48 + 22 - 12 + 108;
        D.llllIlIlII[249] = (0x63 ^ 1) + (36 + 85 - 1 + 29) - (79 + 191 - 235 + 211) + (71 + 33 - -2 + 60);
        D.llllIlIlII[250] = 67 + 41 - -58 + 2;
        D.llllIlIlII[251] = (0 ^ 0x74) + (55 + 132 - 124 + 83) - (67 + 89 - 111 + 119) + (0x44 ^ 3);
        D.llllIlIlII[252] = (0xE7 ^ 0xC6) + (0x9E ^ 0xBE) - -(0xAD ^ 0xA8) + (0x39 ^ 0x5D);
        D.llllIlIlII[253] = 19 + 51 - 10 + 111;
        D.llllIlIlII[254] = (0xEC ^ 0x82) + (0xB5 ^ 0x84) - (0xE ^ 0x77) + (58 + 2 - -70 + 4);
        D.llllIlIlII[255] = 112 + 142 - 173 + 92;
        D.llllIlIlII[256] = 130 + 44 - 23 + 23;
        D.llllIlIlII[257] = 167 + 126 - 249 + 131;
        D.llllIlIlII[258] = 0xFFFFDEFA & 0x2D1F;
        D.llllIlIlII[259] = -(0xFFFFFB21 & 0x56DF) & (0xFFFFFEBA & 0x5FFF);
        D.llllIlIlII[260] = 153 + 6 - 80 + 99;
        D.llllIlIlII[261] = (0x8C ^ 0x86) + (0xC7 ^ 0x85) - -(0xDC ^ 0xBC) + (0x56 ^ 0x51);
        D.llllIlIlII[262] = (0xF2 ^ 0xA2) + (0x1C ^ 0x52) - -(0x1A ^ 0x1D) + (0x38 ^ 0x37);
        D.llllIlIlII[263] = 173 + 122 - 248 + 134;
        D.llllIlIlII[264] = 132 + 178 - 155 + 27;
        D.llllIlIlII[265] = 7 + 80 - -6 + 90;
        D.llllIlIlII[266] = 5 + 139 - 132 + 172;
        D.llllIlIlII[267] = 168 + 115 - 216 + 118;
        D.llllIlIlII[268] = (0x4F ^ 0x24) + (56 + 83 - 24 + 15) - (0xC ^ 0x54) + (0xA0 ^ 0x85);
        D.llllIlIlII[269] = 0xFFFFFBDC & 0xF2B;
        D.llllIlIlII[270] = -(0xFFFFDFEF & 0x7839) & (0xFFFFFFBF & 0x7DFF);
        D.llllIlIlII[271] = -(0xFFFFFA2F & 0x65F2) & (0xFFFFFBF7 & 0x6F3B);
        D.llllIlIlII[272] = (0x36 ^ 0x3B) + (0x9C ^ 0x99) - -(0x7F ^ 3) + (0x55 ^ 0x78);
        D.llllIlIlII[273] = 69 + 177 - 237 + 179;
        D.llllIlIlII[274] = 72 + 104 - 104 + 113 + (0x29 ^ 0x7C) - (66 + 27 - 16 + 54) + (0x58 ^ 0x6A);
        D.llllIlIlII[275] = 127 + 18 - 112 + 138 + (33 + 15 - 39 + 129) - (62 + 56 - 45 + 120) + (0x3D ^ 0x77);
        D.llllIlIlII[276] = -(0xFFFFFAEF & 0x75F3) & (0xFFFFFFFF & 0x7BFF);
        D.llllIlIlII[277] = 149 + 120 - 134 + 56;
        D.llllIlIlII[278] = (0x6F ^ 0xE) + (0xC4 ^ 0xA0) - (168 + 14 - 18 + 31) + (131 + 178 - 130 + 11);
        D.llllIlIlII[279] = (0x6D ^ 0x30) + (0x9E ^ 0xBE) - (0x8E ^ 0x85) + (0xE8 ^ 0xA7);
        D.llllIlIlII[280] = 44 + 146 - 49 + 53;
        D.llllIlIlII[281] = 57 + 149 - 116 + 105;
        D.llllIlIlII[282] = 0 + 46 - -65 + 85;
        D.llllIlIlII[283] = (0x42 ^ 0x45) + (0x54 ^ 0x62) - (0x86 ^ 0x81) + (122 + 71 - 59 + 9);
        D.llllIlIlII[284] = 145 + 17 - 154 + 150 + (103 + 16 - 83 + 100) - (0xFFFFD35E & 0x2DB7) + (112 + 158 - 185 + 97);
        D.llllIlIlII[285] = 198 + 160 - 177 + 18;
        D.llllIlIlII[286] = 90 + 23 - 109 + 196;
        D.llllIlIlII[287] = 20 + 195 - 85 + 71;
        D.llllIlIlII[288] = 167 + 34 - 38 + 39;
        D.llllIlIlII[289] = 37 + 71 - -13 + 82;
        D.llllIlIlII[290] = 54 + 113 - 30 + 67;
        D.llllIlIlII[291] = 0xFFFFDFFD & 0x2F8F;
        D.llllIlIlII[292] = (0x8C ^ 0xAB) + (0x36 ^ 0x6F) - -(0x16 ^ 3) + (0x18 ^ 0x20);
        D.llllIlIlII[293] = (0xC9 ^ 0x82) + (0xC3 ^ 0xA3) - (0x61 ^ 0x77) + (0xAA ^ 0x93);
        D.llllIlIlII[294] = -1;
        D.llllIlIlII[295] = (0x6C ^ 0x10) + (0x49 ^ 0x5F) - (124 + 33 - 95 + 66) + (105 + 162 - 130 + 52);
        D.llllIlIlII[296] = 126 + 135 - 123 + 70;
        D.llllIlIlII[297] = 85 + 151 - 78 + 12 + (0xCD ^ 0x8C) - (0xD6 ^ 0x8C) + (0x36 ^ 0x76);
        D.llllIlIlII[298] = 136 + 6 - 47 + 115;
        D.llllIlIlII[299] = 46 + 120 - -41 + 4;
        D.llllIlIlII[300] = 170 + 55 - 211 + 198;
        D.llllIlIlII[301] = (0xB0 ^ 0xB7) + (115 + 105 - 217 + 156) - (0xB ^ 0x4F) + (0x13 ^ 0x60);
        D.llllIlIlII[302] = 138 + 73 - 170 + 163 + (0x86 ^ 0xBD) - (120 + 159 - 78 + 44) + (123 + 126 - 167 + 114);
        D.llllIlIlII[303] = 2 + 44 - -163 + 6;
        D.llllIlIlII[304] = 85 + 119 - 124 + 136;
        D.llllIlIlII[305] = 0xFFFFA60F & 0x5FF2;
        D.llllIlIlII[306] = 203 + 93 - 263 + 184;
        D.llllIlIlII[307] = 114 + 103 - 166 + 111 + (0x4D ^ 0x34) - (0xC4 ^ 0xBC) + (0x4E ^ 0x79);
        D.llllIlIlII[308] = (0xF ^ 0x1C) + (0x12 ^ 0x23) - (0x10 ^ 0x51) + (83 + 19 - -80 + 34);
        D.llllIlIlII[309] = -(0xFFFFCDB9 & 0x7A57) & (0xFFFFDFF8 & 0x6BFF);
        D.llllIlIlII[310] = -(0xFFFFC3E9 & 0x3D76) & (0xFFFFCF7F & Short.MAX_VALUE);
        D.llllIlIlII[311] = 0xFFFFF9FB & 0x67AC;
        D.llllIlIlII[312] = -(0xFFFFA597 & 0x5B6F) & (0xFFFFDBFF & 0xADBE);
        D.llllIlIlII[313] = -(0xFFFFBDBF & 0x5343) & (0xFFFFFFEF & 0x3FDE);
        D.llllIlIlII[314] = -(0xFFFFDAEF & 0x75FA) & (0xFFFFD5FF & 0x7FFD);
        D.llllIlIlII[315] = 126 + 162 - 281 + 213;
        D.llllIlIlII[316] = 109 + 131 - 151 + 132;
        D.llllIlIlII[317] = 51 + 80 - 11 + 68 + (154 + 66 - 145 + 80) - (0xFFFF8DBF & 0x7366) + (8 + 162 - 145 + 148);
        D.llllIlIlII[318] = (0x74 ^ 0x36) + (0x85 ^ 0xB8) - (0x28 ^ 0x70) + (141 + 179 - 201 + 65);
        D.llllIlIlII[319] = 125 + 68 - 103 + 134;
        D.llllIlIlII[320] = (0xBE ^ 0xB0) + (0x5C ^ 0x79) - -(0x77 ^ 0x41) + (0xD9 ^ 0xA1);
        D.llllIlIlII[321] = 82 + 224 - 119 + 39;
        D.llllIlIlII[322] = 25 + 79 - 46 + 169;
        D.llllIlIlII[323] = (0xE6 ^ 0xA7) + (69 + 127 - 103 + 76) - (0x67 ^ 0x1A) + (0x30 ^ 0x47);
        D.llllIlIlII[324] = 1 + (0x1D ^ 0x49) - (0xAC ^ 0x8E) + (68 + 64 - -18 + 28);
        D.llllIlIlII[325] = (0xA ^ 0x29) + (0x11 ^ 0x18) - -2 + (9 + 173 - 76 + 78);
        D.llllIlIlII[326] = 150 + 191 - 281 + 171;
        D.llllIlIlII[327] = 127 + 39 - 65 + 131;
        D.llllIlIlII[328] = (0x3F ^ 0x1D) + (134 + 105 - 209 + 156) - (187 + 13 - 126 + 122) + (119 + 0 - 5 + 95);
        D.llllIlIlII[329] = 116 + 109 - 74 + 83;
        D.llllIlIlII[330] = 15 + 81 - 31 + 72 + (195 + 95 - 140 + 63) - (22 + 52 - 70 + 176) + (0x2D ^ 0x6C);
        D.llllIlIlII[331] = 211 + 66 - 124 + 83;
        D.llllIlIlII[332] = (0x56 ^ 0x3A) + (62 + 155 - 16 + 27) - (165 + 188 - 299 + 179) + (34 + 131 - 146 + 115);
        D.llllIlIlII[333] = 31 + 6 - -19 + 143 + (50 + 83 - 126 + 123) - (122 + 127 - 212 + 123) + (0x38 ^ 0x7D);
        D.llllIlIlII[334] = (0x69 ^ 0x12) + (0x2F ^ 0x48) - (0x1D ^ 0x77) + (0x3A ^ 0x4D);
        D.llllIlIlII[335] = 157 + 8 - 157 + 232;
        D.llllIlIlII[336] = 94 + 188 - 181 + 140;
        D.llllIlIlII[337] = 129 + 28 - 83 + 168;
        D.llllIlIlII[338] = 103 + 93 - 56 + 103;
        D.llllIlIlII[339] = 219 + 119 - 328 + 234;
        D.llllIlIlII[340] = 9 + 133 - 54 + 157;
        D.llllIlIlII[341] = -(0xFFFFF76D & 0x789B) & (0xFFFFFFFF & 0x7C7F);
        D.llllIlIlII[342] = -(0xFFFFD9E9 & 0x665F) & (0xFFFFCD7B & 0x7FEE);
        D.llllIlIlII[343] = 0xFFFFCFFD & 0x3BFE;
        D.llllIlIlII[344] = 0xFFFF8DBE & Short.MAX_VALUE;
        D.llllIlIlII[345] = -(0xFFFFFF47 & 0x72BE) & (0xFFFFFEAF & 0x7FDF);
        D.llllIlIlII[346] = 0xFFFF8DF7 & 0x7E9E;
        D.llllIlIlII[347] = 0xFFFFAFEE & 0x5BF7;
        D.llllIlIlII[348] = -(0xFFFFE837 & 0x37F9) & (0xFFFFBEBF & 0x6DF3);
        D.llllIlIlII[349] = 142 + 119 - 176 + 161;
        D.llllIlIlII[350] = (0x5A ^ 0x7C) + (182 + 62 - 161 + 112) - (0xE0 ^ 0xAF) + (0x1F ^ 0x42);
        D.llllIlIlII[351] = 33 + 158 - 39 + 96;
        D.llllIlIlII[352] = 210 + 68 - 246 + 217;
        D.llllIlIlII[353] = (0xC0 ^ 0x87) + (0x4B ^ 0xC) - -(0xA ^ 0x59) + (0x53 ^ 0x4A);
        D.llllIlIlII[354] = 186 + 136 - 179 + 108;
        D.llllIlIlII[355] = 41 + 81 - -15 + 115;
        D.llllIlIlII[356] = (0xC6 ^ 0xA5) + (64 + 22 - -59 + 21) - (0x59 ^ 0x4D) + (0x5C ^ 0x54);
        D.llllIlIlII[357] = 146 + 61 - 49 + 96;
        D.llllIlIlII[358] = (0xDD ^ 0x9D) + (0x2F ^ 0x66) - (0x94 ^ 0x86) + (103 + 11 - 70 + 92);
        D.llllIlIlII[359] = 0xFFFFB963 & 0x479C;
        D.llllIlIlII[360] = -(0xFFFFFFEB & 0x78FD) & (0xFFFFFFE9 & 0x79FF);
        D.llllIlIlII[361] = 0xFFFFA157 & 0x5FAA;
        D.llllIlIlII[362] = 0xFFFF85D7 & 0x7B2B;
        D.llllIlIlII[363] = 0xFFFF857C & 0x7B87;
        D.llllIlIlII[364] = -(0xFFFFFAFF & 0x7DDB) & (0xFFFFFBFF & 0x7DDF);
        D.llllIlIlII[365] = -(0xFFFFFA6F & 0x2DF9) & (0xFFFFA9FE & 0x7F6F);
    }

    private static boolean llIIlllllIlll(Object object) {
        return object == null;
    }

    @Override
    public int T() {
        try {
            D.cf();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 == 0) {
            return (54 + 35 - -3 + 107 ^ 45 + 117 - 94 + 79) & (42 + 34 - -16 + 104 ^ 23 + 26 - -42 + 53 ^ -1);
        }
        return llllIlIlII[142];
    }

    static {
        D.llIIllllIlIlI();
        D.llIIllllIlIII();
        gN = new WorldPoint(llllIlIlII[341], llllIlIlII[342], llllIlIlII[0]);
        gO = new WorldPoint(llllIlIlII[343], llllIlIlII[344], llllIlIlII[0]);
        gP = new WorldPoint(llllIlIlII[345], llllIlIlII[346], llllIlIlII[1]);
        gQ = new WorldPoint(llllIlIlII[347], llllIlIlII[348], llllIlIlII[0]);
        bu = new ArrayList<d>();
        String[] stringArray = new String[llllIlIlII[43]];
        stringArray[D.llllIlIlII[0]] = llllIIllII[llllIlIlII[349]];
        stringArray[D.llllIlIlII[1]] = llllIIllII[llllIlIlII[350]];
        stringArray[D.llllIlIlII[2]] = llllIIllII[llllIlIlII[351]];
        stringArray[D.llllIlIlII[7]] = llllIIllII[llllIlIlII[352]];
        stringArray[D.llllIlIlII[9]] = llllIIllII[llllIlIlII[353]];
        stringArray[D.llllIlIlII[11]] = llllIIllII[llllIlIlII[354]];
        stringArray[D.llllIlIlII[12]] = llllIIllII[llllIlIlII[355]];
        stringArray[D.llllIlIlII[13]] = llllIIllII[llllIlIlII[356]];
        stringArray[D.llllIlIlII[16]] = llllIIllII[llllIlIlII[357]];
        stringArray[D.llllIlIlII[17]] = llllIIllII[llllIlIlII[358]];
        stringArray[D.llllIlIlII[23]] = llllIIllII[llllIlIlII[359]];
        stringArray[D.llllIlIlII[26]] = llllIIllII[llllIlIlII[360]];
        stringArray[D.llllIlIlII[28]] = llllIIllII[llllIlIlII[361]];
        stringArray[D.llllIlIlII[38]] = llllIIllII[llllIlIlII[362]];
        stringArray[D.llllIlIlII[40]] = llllIIllII[llllIlIlII[363]];
        stringArray[D.llllIlIlII[20]] = llllIIllII[llllIlIlII[364]];
        bQ = stringArray;
    }

    private static boolean llIIlllllIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlllllIIII(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void ch() {
        void var36;
        BankLocation bankLocation = BankLocation.getNearest();
        if (D.llIIlllllIIlI(bankLocation) && D.llIIllllIlllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[303]];
            Movement.walkTo((BankLocation)bankLocation);
            0;
            Time.sleepTicks((int)llllIlIlII[2]);
            0;
        }
        if (D.llIIlllllIIlI(var36) && D.llIIllllIllII(var36.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[304]];
            if (D.llIIllllIlllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIlII[18]);
                0;
            }
            if (D.llIIllllIllII(Bank.isOpen() ? 1 : 0)) {
                if (D.llIIlllllIIII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llllIlIlII[9]);
                    0;
                }
                a.a(llllIlIlII[19], llllIlIlII[11]);
                a.a(llllIlIlII[22], llllIlIlII[11]);
                a.a(llllIlIlII[21], llllIlIlII[11]);
                a.b(f.aU, llllIlIlII[11]);
                a.a(llllIlIlII[35], llllIlIlII[11]);
                a.a(llllIlIlII[45], llllIlIlII[1]);
                a.a(llllIlIlII[27], llllIlIlII[7]);
                a.a(llllIlIlII[34], llllIlIlII[1]);
                a.a(llllIlIlII[24], llllIlIlII[25]);
                a.a(llllIlIlII[305], llllIlIlII[1]);
                a.a(llllIlIlII[46], llllIlIlII[47]);
                int[] nArray = new int[llllIlIlII[1]];
                nArray[D.llllIlIlII[0]] = llllIlIlII[36];
                if (D.llIIllllIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llllIlIlII[1]];
                    nArray2[D.llllIlIlII[0]] = llllIlIlII[36];
                    if (D.llIIllllIlllI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdraw((int)llllIlIlII[36], (int)llllIlIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    }
                }
            }
        }
    }
}

