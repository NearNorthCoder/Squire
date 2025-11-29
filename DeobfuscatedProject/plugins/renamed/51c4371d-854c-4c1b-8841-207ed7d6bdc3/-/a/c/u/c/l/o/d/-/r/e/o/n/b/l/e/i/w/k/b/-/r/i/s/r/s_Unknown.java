/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.N_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
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
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class s_Unknown
implements F {
    private static /* synthetic */ WorldPoint cJ;
    private static /* synthetic */ WorldPoint ce;
    private static /* synthetic */ int cM;
    private static /* synthetic */ int[] llIIIlII;
    private static /* synthetic */ WorldPoint cH;
    static /* synthetic */ boolean cj;
    static /* synthetic */ int ci;
    static /* synthetic */ String[] bX;
    private static /* synthetic */ WorldPoint cI;
    public static /* synthetic */ List<d> bB;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ String[] llIIIIlI;
    private static /* synthetic */ WorldPoint cL;
    static /* synthetic */ WorldArea cF;
    static /* synthetic */ boolean cG;
    private static /* synthetic */ WorldPoint cK;

    private static String lIlIIIlIlll(String lIlIllIIIlIllII, String lIlIllIIIlIIllI) {
        lIlIllIIIlIllII = new String(Base64.getDecoder().decode(lIlIllIIIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIIIlIlIlI = new StringBuilder();
        char[] lIlIllIIIlIlIIl = lIlIllIIIlIIllI.toCharArray();
        int lIlIllIIIlIlIII = llIIIlII[2];
        char[] lIlIllIIIlIIIlI = lIlIllIIIlIllII.toCharArray();
        int lIlIllIIIlIIIIl = lIlIllIIIlIIIlI.length;
        int lIlIllIIIlIIIII = llIIIlII[2];
        while (s.lIlIIIlllIl(lIlIllIIIlIIIII, lIlIllIIIlIIIIl)) {
            char lIlIllIIIlIllIl = lIlIllIIIlIIIlI[lIlIllIIIlIIIII];
            lIlIllIIIlIlIlI.append((char)(lIlIllIIIlIllIl ^ lIlIllIIIlIlIIl[lIlIllIIIlIlIII % lIlIllIIIlIlIIl.length]));
            0;
            ++lIlIllIIIlIlIII;
            ++lIlIllIIIlIIIII;
            0;
            if (((0x3F ^ 0x36 ^ (0x4F ^ 0x64)) & (0x7D ^ 0x51 ^ (0x48 ^ 0x46) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(lIlIllIIIlIlIlI);
    }

    @Override
    public boolean T() {
        return llIIIlII[2];
    }

    private static boolean lIlIIlIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void aI() {
        if (s.lIlIIIlllIl(Skills.getLevel((Skill)Skill.FISHING), llIIIlII[0])) {
            N.cX();
        }
        if (s.lIlIIIllllI(Skills.getLevel((Skill)Skill.FISHING), llIIIlII[0])) {
            if (s.lIlIIIlllll(bz ? 1 : 0)) {
                b.a(bB);
                if (s.lIlIIIlllIl(bB.size(), llIIIlII[1])) {
                    System.out.println(llIIIIlI[llIIIlII[2]]);
                    bz = llIIIlII[2];
                }
            }
            if (s.lIlIIlIIIII(bz ? 1 : 0)) {
                if (s.lIlIIlIIIII(s.ac() ? 1 : 0) && s.lIlIIIlllIl(e.j(cM), llIIIlII[1])) {
                    String[] stringArray = new String[llIIIlII[1]];
                    stringArray[s.llIIIlII[2]] = llIIIIlI[llIIIlII[1]];
                    if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        BankLocation lIlIllIIlIIlIlI = BankLocation.getNearest();
                        if (s.lIlIIlIIIIl(lIlIllIIlIIlIlI) && s.lIlIIlIIIII(lIlIllIIlIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIIIIlI[llIIIlII[3]];
                            a.a(lIlIllIIlIIlIlI);
                        }
                        if (s.lIlIIlIIIIl(lIlIllIIlIIlIlI) && s.lIlIIIlllll(lIlIllIIlIIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (s.lIlIIlIIIII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIlII[4]);
                                0;
                            }
                            if (s.lIlIIIlllll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderBarrows.c = llIIIIlI[llIIIlII[5]];
                                if (s.lIlIIlIIIlI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIIlII[6]);
                                    0;
                                }
                                if (s.lIlIIlIIIlI(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIIIlII[3]);
                                    0;
                                }
                                int[] nArray = new int[llIIIlII[7]];
                                nArray[s.llIIIlII[2]] = llIIIlII[8];
                                nArray[s.llIIIlII[1]] = llIIIlII[9];
                                nArray[s.llIIIlII[3]] = llIIIlII[10];
                                nArray[s.llIIIlII[5]] = llIIIlII[11];
                                nArray[s.llIIIlII[6]] = llIIIlII[12];
                                nArray[s.llIIIlII[13]] = llIIIlII[14];
                                nArray[s.llIIIlII[15]] = llIIIlII[16];
                                if (s.lIlIIlIIIII(e.b(nArray) ? 1 : 0)) {
                                    s.ag();
                                    System.out.println(llIIIIlI[llIIIlII[6]]);
                                    bz = llIIIlII[1];
                                    return;
                                }
                                int[] nArray2 = new int[llIIIlII[15]];
                                nArray2[s.llIIIlII[2]] = llIIIlII[8];
                                nArray2[s.llIIIlII[1]] = llIIIlII[9];
                                nArray2[s.llIIIlII[3]] = llIIIlII[10];
                                nArray2[s.llIIIlII[5]] = llIIIlII[11];
                                nArray2[s.llIIIlII[6]] = llIIIlII[12];
                                nArray2[s.llIIIlII[13]] = llIIIlII[14];
                                if (s.lIlIIIlllll(e.b(nArray2) ? 1 : 0)) {
                                    a.a(llIIIlII[8], llIIIlII[0]);
                                    a.a(llIIIlII[14], llIIIlII[0]);
                                    a.a(llIIIlII[9], llIIIlII[1]);
                                    a.a(llIIIlII[10], llIIIlII[1]);
                                    a.a(llIIIlII[11], llIIIlII[0]);
                                    a.a(llIIIlII[12], llIIIlII[1]);
                                    a.a(llIIIlII[16], llIIIlII[5]);
                                    a.a(llIIIlII[17], llIIIlII[18]);
                                }
                            }
                        }
                    }
                }
                if (s.lIlIIIlllll(Inventory.contains((int[])f.bb) ? 1 : 0) && s.lIlIIIlllIl(Movement.getRunEnergy(), llIIIlII[19])) {
                    Inventory.getFirst((int[])f.bb).interact(llIIIIlI[llIIIlII[13]]);
                    Time.sleepTicks((int)llIIIlII[1]);
                    0;
                }
                if (s.lIlIIIlllll(s.ac() ? 1 : 0) && s.lIlIIIlllIl(e.j(cM), llIIIlII[1])) {
                    int[] nArray = new int[llIIIlII[1]];
                    nArray[s.llIIIlII[2]] = llIIIlII[20];
                    if (s.lIlIIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (s.lIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(ce), llIIIlII[0])) {
                            AccBuilderBarrows.c = llIIIIlI[llIIIlII[15]];
                            if (s.lIlIIIlllll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)ce);
                            0;
                            Time.sleepTicks((int)llIIIlII[1]);
                            0;
                        }
                        if (s.lIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(ce), llIIIlII[21])) {
                            AccBuilderBarrows.c = llIIIIlI[llIIIlII[7]];
                            g.a(llIIIIlI[llIIIlII[22]], bX);
                        }
                    }
                }
                if (s.lIlIIlIIlIl(e.j(cM), llIIIlII[1])) {
                    int[] nArray = new int[llIIIlII[1]];
                    nArray[s.llIIIlII[2]] = llIIIlII[20];
                    if (s.lIlIIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[llIIIlII[1]];
                        stringArray[s.llIIIlII[2]] = llIIIIlI[llIIIlII[23]];
                        if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            ci = llIIIlII[2];
                            String[] stringArray2 = new String[llIIIlII[1]];
                            stringArray2[s.llIIIlII[2]] = llIIIIlI[llIIIlII[0]];
                            if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                if (s.lIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(cI), llIIIlII[6])) {
                                    AccBuilderBarrows.c = llIIIIlI[llIIIlII[24]];
                                    Movement.walkTo((WorldPoint)cI);
                                    0;
                                }
                                if (s.lIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(cI), llIIIlII[6])) {
                                    AccBuilderBarrows.c = llIIIIlI[llIIIlII[21]];
                                    String[] stringArray3 = new String[llIIIlII[1]];
                                    stringArray3[s.llIIIlII[2]] = llIIIIlI[llIIIlII[25]];
                                    if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                        String[] stringArray4 = new String[llIIIlII[1]];
                                        stringArray4[s.llIIIlII[2]] = llIIIIlI[llIIIlII[26]];
                                        if (s.lIlIIlIIIIl(TileObjects.getNearest((String[])stringArray4))) {
                                            String[] stringArray5 = new String[llIIIlII[1]];
                                            stringArray5[s.llIIIlII[2]] = llIIIIlI[llIIIlII[27]];
                                            TileObjects.getNearest((String[])stringArray5).interact(llIIIIlI[llIIIlII[28]]);
                                            Time.sleepTicks((int)llIIIlII[3]);
                                            0;
                                        }
                                    }
                                }
                            }
                            String[] stringArray6 = new String[llIIIlII[1]];
                            stringArray6[s.llIIIlII[2]] = llIIIIlI[llIIIlII[29]];
                            if (s.lIlIIIlllll(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                                if (s.lIlIIlIIIII(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIIIIlI[llIIIlII[30]];
                                    if (s.lIlIIlIIIII(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)cL);
                                        0;
                                        Time.sleepTicks((int)llIIIlII[1]);
                                        0;
                                    }
                                    g.a(bX);
                                }
                                if (s.lIlIIIlllll(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray7 = new String[llIIIlII[1]];
                                    stringArray7[s.llIIIlII[2]] = llIIIIlI[llIIIlII[31]];
                                    if (s.lIlIIIlllll(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[32]];
                                        String[] stringArray8 = new String[llIIIlII[1]];
                                        stringArray8[s.llIIIlII[2]] = llIIIIlI[llIIIlII[33]];
                                        if (s.lIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray8).getWorldLocation()), llIIIlII[3])) {
                                            String[] stringArray9 = new String[llIIIlII[1]];
                                            stringArray9[s.llIIIlII[2]] = llIIIIlI[llIIIlII[34]];
                                            Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray9).getWorldLocation());
                                            0;
                                            Time.sleepTicks((int)llIIIlII[6]);
                                            0;
                                        }
                                        if (s.lIlIIlIIIII(Dialog.isOpen() ? 1 : 0)) {
                                            String[] stringArray10 = new String[llIIIlII[1]];
                                            stringArray10[s.llIIIlII[2]] = llIIIIlI[llIIIlII[35]];
                                            String[] stringArray11 = new String[llIIIlII[1]];
                                            stringArray11[s.llIIIlII[2]] = llIIIIlI[llIIIlII[36]];
                                            Inventory.getFirst((String[])stringArray10).useOn(TileObjects.getNearest((String[])stringArray11));
                                            Time.sleepTicks((int)llIIIlII[3]);
                                            0;
                                        }
                                        g.a(bX);
                                    }
                                    String[] stringArray12 = new String[llIIIlII[1]];
                                    stringArray12[s.llIIIlII[2]] = llIIIIlI[llIIIlII[37]];
                                    if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray12) ? 1 : 0) && s.lIlIIlIIIII(cG ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[38]];
                                        g.a(llIIIIlI[llIIIlII[20]], bX);
                                        if (s.lIlIIIlllll(Dialog.getText().contains(llIIIIlI[llIIIlII[39]]) ? 1 : 0)) {
                                            cG = llIIIlII[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (s.lIlIIlIIlIl(e.j(cM), llIIIlII[5])) {
                    String[] stringArray = new String[llIIIlII[1]];
                    stringArray[s.llIIIlII[2]] = llIIIIlI[llIIIlII[40]];
                    if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray13 = new String[llIIIlII[1]];
                        stringArray13[s.llIIIlII[2]] = llIIIIlI[llIIIlII[41]];
                        if (s.lIlIIlIIIII(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIIIIlI[llIIIlII[42]];
                            int[] nArray = new int[llIIIlII[1]];
                            nArray[s.llIIIlII[2]] = llIIIlII[43];
                            NPCs.getNearest((int[])nArray).interact(llIIIIlI[llIIIlII[44]]);
                            Time.sleepTicks((int)llIIIlII[13]);
                            0;
                        }
                    }
                    String[] stringArray14 = new String[llIIIlII[1]];
                    stringArray14[s.llIIIlII[2]] = llIIIIlI[llIIIlII[45]];
                    if (s.lIlIIIlllll(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[46]];
                        g.a(llIIIIlI[llIIIlII[47]], bX);
                    }
                }
                String[] stringArray = new String[llIIIlII[1]];
                stringArray[s.llIIIlII[2]] = llIIIIlI[llIIIlII[48]];
                if (s.lIlIIIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (s.lIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(ce), llIIIlII[13])) {
                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[49]];
                        Movement.walkTo((WorldPoint)ce);
                        0;
                        Time.sleepTicks((int)llIIIlII[1]);
                        0;
                    }
                    if (s.lIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(ce), llIIIlII[13])) {
                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[50]];
                        if (s.lIlIIIlllIl(ci, llIIIlII[1])) {
                            Q.jB += llIIIlII[1];
                            Q.o(AccBuilderBarrows.m);
                            ci += llIIIlII[1];
                            Q.jB = llIIIlII[2];
                            cj = llIIIlII[2];
                        }
                        g.a(llIIIIlI[llIIIlII[51]], bX);
                    }
                }
            }
        }
    }

    private static boolean lIlIIlIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        s.lIlIIIlllII();
        s.lIlIIIllIll();
        bB = new ArrayList<d>();
        cF = new WorldArea(llIIIlII[65], llIIIlII[66], llIIIlII[24], llIIIlII[25], llIIIlII[2]);
        String[] stringArray = new String[llIIIlII[22]];
        stringArray[s.llIIIlII[2]] = llIIIIlI[llIIIlII[67]];
        stringArray[s.llIIIlII[1]] = llIIIIlI[llIIIlII[68]];
        stringArray[s.llIIIlII[3]] = llIIIIlI[llIIIlII[69]];
        stringArray[s.llIIIlII[5]] = llIIIIlI[llIIIlII[19]];
        stringArray[s.llIIIlII[6]] = llIIIIlI[llIIIlII[70]];
        stringArray[s.llIIIlII[13]] = llIIIIlI[llIIIlII[71]];
        stringArray[s.llIIIlII[15]] = llIIIIlI[llIIIlII[72]];
        stringArray[s.llIIIlII[7]] = llIIIIlI[llIIIlII[73]];
        bX = stringArray;
        ce = new WorldPoint(llIIIlII[74], llIIIlII[75], llIIIlII[2]);
        cH = new WorldPoint(llIIIlII[76], llIIIlII[77], llIIIlII[2]);
        cI = new WorldPoint(llIIIlII[78], llIIIlII[79], llIIIlII[2]);
        cJ = new WorldPoint(llIIIlII[80], llIIIlII[81], llIIIlII[2]);
        cK = new WorldPoint(llIIIlII[82], llIIIlII[83], llIIIlII[2]);
        cL = new WorldPoint(llIIIlII[84], llIIIlII[85], llIIIlII[2]);
        cM = llIIIlII[24];
    }

    @Override
    public String V() {
        return llIIIIlI[llIIIlII[63]];
    }

    private static boolean lIlIIIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (s.lIlIIIllllI(e.j(cM), llIIIlII[13])) {
            bl = llIIIlII[1];
            0;
            if (3 <= 0) {
                return ((0x5B ^ 0x50 ^ (0x41 ^ 0x67)) & (2 ^ (0xEB ^ 0xC4) ^ -1)) != 0;
            }
        } else {
            bl = llIIIlII[2];
        }
        return bl;
    }

    private static void lIlIIIlllII() {
        llIIIlII = new int[87];
        s.llIIIlII[0] = 0x8E ^ 0x84;
        s.llIIIlII[1] = 1;
        s.llIIIlII[2] = (0x16 ^ 0x51 ^ (0x30 ^ 0x7B)) & (0x36 ^ 0x7F ^ (0x18 ^ 0x5D) ^ -1);
        s.llIIIlII[3] = 2;
        s.llIIIlII[4] = 0xFFFF9BAE & 0x77D9;
        s.llIIIlII[5] = 3;
        s.llIIIlII[6] = 28 + 96 - -6 + 38 ^ 14 + 129 - 62 + 91;
        s.llIIIlII[7] = 0x28 ^ 0x2F;
        s.llIIIlII[8] = 0xFFFFFFD7 & 0x1F6F;
        s.llIIIlII[9] = -(0xFFFFD9C4 & 0x6E3F) & (0xFFFFCBFF & 0x7FBB);
        s.llIIIlII[10] = 0xFFFFB93B & 0x47F7;
        s.llIIIlII[11] = 0xFFFFD9FF & 0x2739;
        s.llIIIlII[12] = -(0xFFFFCAF9 & 0x3DB7) & (0xFFFFCFFF & 0x3EBE);
        s.llIIIlII[13] = 90 + 44 - 7 + 24 ^ 18 + 103 - 12 + 37;
        s.llIIIlII[14] = -(0xFFFFA2F7 & 0x7D9E) & (0xFFFFFFDF & 0x3FFF);
        s.llIIIlII[15] = 0x1B ^ 0x1D;
        s.llIIIlII[16] = -(0xFFFFEFB7 & 0x5A4F) & (0xFFFFFB5F & 0x7FF7);
        s.llIIIlII[17] = 0xFFFF83EB & 0x7FF7;
        s.llIIIlII[18] = -(0xFFFFF66B & 0x3D95) & (0xFFFFF7EE & 0x3FF9);
        s.llIIIlII[19] = 108 + 67 - 152 + 110 ^ 47 + 159 - 41 + 18;
        s.llIIIlII[20] = 0x12 ^ 0x3E ^ (0x43 ^ 0x74);
        s.llIIIlII[21] = 0xC8 ^ 0xC4;
        s.llIIIlII[22] = 0x9B ^ 0xA9 ^ (0x1E ^ 0x24);
        s.llIIIlII[23] = 0xB4 ^ 0xBD;
        s.llIIIlII[24] = 0xE ^ 5;
        s.llIIIlII[25] = 0xCD ^ 0xC0;
        s.llIIIlII[26] = 1 ^ 0xF;
        s.llIIIlII[27] = 189 + 164 - 153 + 0 ^ 147 + 84 - 143 + 111;
        s.llIIIlII[28] = 0xA4 ^ 0xB4;
        s.llIIIlII[29] = 0x8E ^ 0xA0 ^ (0xA5 ^ 0x9A);
        s.llIIIlII[30] = 0xF6 ^ 0xA3 ^ (0x68 ^ 0x2F);
        s.llIIIlII[31] = 0x55 ^ 0x46;
        s.llIIIlII[32] = 0x4F ^ 0x27 ^ (0x1B ^ 0x67);
        s.llIIIlII[33] = 0x52 ^ 0x47;
        s.llIIIlII[34] = 19 + 134 - -55 + 2 ^ 24 + 5 - 3 + 170;
        s.llIIIlII[35] = 0x11 ^ 6;
        s.llIIIlII[36] = 0xB5 ^ 0xBE ^ (0x3B ^ 0x28);
        s.llIIIlII[37] = 0x4F ^ 0x3A ^ (0x6C ^ 0);
        s.llIIIlII[38] = 134 + 136 - 261 + 128 ^ 75 + 49 - 36 + 59;
        s.llIIIlII[39] = 0x63 ^ 0x59 ^ (0xAB ^ 0x8D);
        s.llIIIlII[40] = 0x47 ^ 0x41 ^ (0x7D ^ 0x66);
        s.llIIIlII[41] = 30 + 40 - -93 + 3 ^ 117 + 108 - 136 + 95;
        s.llIIIlII[42] = 2 ^ (0x33 ^ 0x2E);
        s.llIIIlII[43] = 0xFFFFDFF1 & 0x2FFE;
        s.llIIIlII[44] = 1 ^ (0x36 ^ 0x17);
        s.llIIIlII[45] = 0x60 ^ 2 ^ (0x1A ^ 0x59);
        s.llIIIlII[46] = 0x24 ^ 0x17 ^ (0xAC ^ 0xBD);
        s.llIIIlII[47] = 0x57 ^ 0x74;
        s.llIIIlII[48] = 0x5F ^ 0x7B;
        s.llIIIlII[49] = 0xA1 ^ 0x84;
        s.llIIIlII[50] = 0x88 ^ 0xAE;
        s.llIIIlII[51] = 155 + 105 - 115 + 35 ^ 53 + 0 - 47 + 141;
        s.llIIIlII[52] = 70 + 57 - 80 + 93 ^ 1 + 112 - 42 + 93;
        s.llIIIlII[53] = 0x56 ^ 0x59 ^ (0x74 ^ 0x52);
        s.llIIIlII[54] = 106 + 151 - 114 + 19 ^ 2 + 11 - -63 + 60;
        s.llIIIlII[55] = 0x22 ^ 0x50 ^ (0x79 ^ 0x20);
        s.llIIIlII[56] = 0xAE ^ 0x82;
        s.llIIIlII[57] = 0xFFFFA33A & 0x7FED;
        s.llIIIlII[58] = 0xFFFFBDF5 & 0x43FE;
        s.llIIIlII[59] = 0xFFFFAFDF & 0x7EEC;
        s.llIIIlII[60] = 0xFFFFF7FC & 0x69AB;
        s.llIIIlII[61] = 0xFFFFEBF7 & 0x178C;
        s.llIIIlII[62] = 0x1A ^ 0x7E;
        s.llIIIlII[63] = 0x53 ^ 0x36 ^ (0xDF ^ 0x97);
        s.llIIIlII[64] = 0xBB ^ 0x88 ^ (0x65 ^ 0x78);
        s.llIIIlII[65] = 0xFFFF8FFB & 0x7A4C;
        s.llIIIlII[66] = -(0xFFFFAE77 & 0x539A) & (0xFFFF9F7F & 0x6FFB);
        s.llIIIlII[67] = 0x9D ^ 0xC1 ^ (0x6B ^ 0x18);
        s.llIIIlII[68] = 0x3E ^ 0x5C ^ (0x10 ^ 0x42);
        s.llIIIlII[69] = 53 + 77 - 5 + 49 ^ 89 + 53 - 118 + 135;
        s.llIIIlII[70] = 107 + 125 - 175 + 108 ^ 17 + 102 - 13 + 44;
        s.llIIIlII[71] = 0x70 ^ 0x44;
        s.llIIIlII[72] = 0xF2 ^ 0xC7;
        s.llIIIlII[73] = 0x5D ^ 0x6B;
        s.llIIIlII[74] = -(0xFFFFFD7B & 0x66ED) & (0xFFFFFF6B & 0x6FFF);
        s.llIIIlII[75] = 0xFFFF9FF6 & 0x6DA9;
        s.llIIIlII[76] = 0xFFFFFE77 & 0xBEB;
        s.llIIIlII[77] = -(0xFFFFEC73 & 0x53CD) & (0xFFFFDFEF & 0x6DFC);
        s.llIIIlII[78] = 0xFFFFFE57 & 0xBEF;
        s.llIIIlII[79] = -(0xFFFFFCC3 & 0x737D) & (0xFFFFFDE6 & Short.MAX_VALUE);
        s.llIIIlII[80] = -(0xFFFFE133 & 0x7ECE) & (0xFFFFEFF7 & 0x7A5D);
        s.llIIIlII[81] = -(0xFFFFDB8F & 0x767E) & (0xFFFFDFFF & 0x7F7F);
        s.llIIIlII[82] = -(0xFFFFEEB5 & 0x717B) & (0xFFFFEE7E & 0x7BFF);
        s.llIIIlII[83] = -(0xFFFFFAD9 & 0x35A7) & (0xFFFFBDF7 & 0x7FFD);
        s.llIIIlII[84] = -(0xFFFFFDB7 & 0x7749) & (0xFFFFFFD7 & 0x7F79);
        s.llIIIlII[85] = 0xFFFFEDFF & 0x1F6F;
        s.llIIIlII[86] = 149 + 29 - 25 + 4 ^ 160 + 90 - 179 + 99;
    }

    private static void ag() {
        d lIlIllIIlIIIllI;
        Object lIlIllIIlIIIlll;
        int[] nArray = new int[llIIIlII[1]];
        nArray[s.llIIIlII[2]] = llIIIlII[12];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIIlII[12], llIIIlII[1], llIIIlII[57]);
            bB.add(d2);
            0;
        }
        int[] nArray2 = new int[llIIIlII[1]];
        nArray2[s.llIIIlII[2]] = llIIIlII[10];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlIllIIlIIIlll = new d(llIIIlII[10], llIIIlII[1], llIIIlII[4]);
            bB.add((d)lIlIllIIlIIIlll);
            0;
        }
        int[] nArray3 = new int[llIIIlII[1]];
        nArray3[s.llIIIlII[2]] = llIIIlII[9];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlIllIIlIIIlll = new d(llIIIlII[9], llIIIlII[1], llIIIlII[4]);
            bB.add((d)lIlIllIIlIIIlll);
            0;
        }
        int[] nArray4 = new int[llIIIlII[1]];
        nArray4[s.llIIIlII[2]] = llIIIlII[14];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlIllIIlIIIlll = new d(llIIIlII[14], llIIIlII[24], llIIIlII[4]);
            bB.add((d)lIlIllIIlIIIlll);
            0;
        }
        int[] nArray5 = new int[llIIIlII[1]];
        nArray5[s.llIIIlII[2]] = llIIIlII[16];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIlIllIIlIIIlll = new d(llIIIlII[16], llIIIlII[24], i.bw);
            bB.add((d)lIlIllIIlIIIlll);
            0;
        }
        int[] nArray6 = new int[llIIIlII[1]];
        nArray6[s.llIIIlII[2]] = llIIIlII[11];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIlIllIIlIIIlll = new d(llIIIlII[11], llIIIlII[0], llIIIlII[58]);
            bB.add((d)lIlIllIIlIIIlll);
            0;
        }
        if (s.lIlIIlIIIII(Bank.contains((Predicate)(lIlIllIIlIIIlll = item -> item.getName().toLowerCase().contains(llIIIIlI[llIIIlII[64]]))) ? 1 : 0)) {
            lIlIllIIlIIIllI = new d(llIIIlII[59], llIIIlII[13], llIIIlII[60]);
            bB.add(lIlIllIIlIIIllI);
            0;
        }
        int[] nArray7 = new int[llIIIlII[1]];
        nArray7[s.llIIIlII[2]] = llIIIlII[8];
        if (s.lIlIIlIIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIlIllIIlIIIllI = new d(llIIIlII[8], llIIIlII[52], llIIIlII[61]);
            bB.add(lIlIllIIlIIIllI);
            0;
        }
    }

    private static void lIlIIIllIll() {
        llIIIIlI = new String[llIIIlII[86]];
        s.llIIIIlI[s.llIIIlII[2]] = s."Finished buying items, switching back to quest";
        s.llIIIIlI[s.llIIIlII[1]] = s."Fishing pass";
        s.llIIIIlI[s.llIIIlII[3]] = s."Nav to bank";
        s.llIIIIlI[s.llIIIlII[5]] = s."Handling banking";
        s.llIIIIlI[s.llIIIlII[6]] = s."We are missing quest supplies, switching to BUYING";
        s.llIIIIlI[s.llIIIlII[13]] = s."Drink";
        s.llIIIIlI[s.llIIIlII[15]] = s."Nav to start";
        s.llIIIIlI[s.llIIIlII[7]] = s."Starting quest";
        s.llIIIIlI[s.llIIIlII[22]] = s."Vestri";
        s.llIIIIlI[s.llIIIlII[23]] = s."Fishing trophy";
        s.llIIIIlI[s.llIIIlII[0]] = s."Red vine worm";
        s.llIIIIlI[s.llIIIlII[24]] = s."Nav to vine";
        s.llIIIIlI[s.llIIIlII[21]] = s."Digging";
        s.llIIIIlI[s.llIIIlII[25]] = s."Red vine worm";
        s.llIIIIlI[s.llIIIlII[26]] = s."Vine";
        s.llIIIIlI[s.llIIIlII[27]] = s."Vine";
        s.llIIIIlI[s.llIIIlII[28]] = s."Check";
        s.llIIIIlI[s.llIIIlII[29]] = s."Red vine worm";
        s.llIIIIlI[s.llIIIlII[30]] = s."Nav to contest";
        s.llIIIIlI[s.llIIIlII[31]] = s."Garlic";
        s.llIIIIlI[s.llIIIlII[32]] = s."Using garlic";
        s.llIIIIlI[s.llIIIlII[33]] = s."Wall Pipe";
        s.llIIIIlI[s.llIIIlII[34]] = s."Wall Pipe";
        s.llIIIIlI[s.llIIIlII[35]] = s."Garlic";
        s.llIIIIlI[s.llIIIlII[36]] = s."Wall Pipe";
        s.llIIIIlI[s.llIIIlII[37]] = s."Garlic";
        s.llIIIIlI[s.llIIIlII[38]] = s."Start contest";
        s.llIIIIlI[s.llIIIlII[20]] = s."Bonzo";
        s.llIIIIlI[s.llIIIlII[39]] = s."I might still be able to find a bigger fish";
        s.llIIIIlI[s.llIIIlII[40]] = s."Garlic";
        s.llIIIIlI[s.llIIIlII[41]] = s."Raw giant carp";
        s.llIIIIlI[s.llIIIlII[42]] = s."Fishing";
        s.llIIIIlI[s.llIIIlII[44]] = s."Bait";
        s.llIIIIlI[s.llIIIlII[45]] = s."Raw giant carp";
        s.llIIIIlI[s.llIIIlII[46]] = s."Handing in fish";
        s.llIIIIlI[s.llIIIlII[47]] = s."Bonzo";
        s.llIIIIlI[s.llIIIlII[48]] = s."Fishing trophy";
        s.llIIIIlI[s.llIIIlII[49]] = s."Nav to start";
        s.llIIIIlI[s.llIIIlII[50]] = s."Finishing quest";
        s.llIIIIlI[s.llIIIlII[51]] = s."Vestri";
        s.llIIIIlI[s.llIIIlII[52]] = s."Camelot teleport";
        s.llIIIIlI[s.llIIIlII[53]] = s."Garlic";
        s.llIIIIlI[s.llIIIlII[54]] = s."Spade";
        s.llIIIIlI[s.llIIIlII[55]] = s."Fishing rod";
        s.llIIIIlI[s.llIIIlII[56]] = s."Fishing bait";
        s.llIIIIlI[s.llIIIlII[63]] = s."Fishing contest";
        s.llIIIIlI[s.llIIIlII[64]] = s."ring of wealth (";
        s.llIIIIlI[s.llIIIlII[67]] = s."I was wondering what was down those stairs?";
        s.llIIIIlI[s.llIIIlII[68]] = s."Why not?";
        s.llIIIIlI[s.llIIIlII[69]] = s."If you were my friend I wouldn't mind it.";
        s.llIIIIlI[s.llIIIlII[19]] = s."Well, let's be friends!";
        s.llIIIIlI[s.llIIIlII[70]] = s."And how am I meant to do that?";
        s.llIIIIlI[s.llIIIlII[71]] = s."I'll enter the competition please.";
        s.llIIIIlI[s.llIIIlII[72]] = s."I have this big fish. Is it enough to win?";
        s.llIIIIlI[s.llIIIlII[73]] = s."Yes.";
    }

    private static boolean lIlIIlIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIIIIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIIlllll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        int[] nArray = new int[llIIIlII[1]];
        nArray[s.llIIIlII[2]] = llIIIlII[8];
        if (s.lIlIIlIIIlI(Inventory.getCount((int[])nArray))) {
            String[] stringArray = new String[llIIIlII[1]];
            stringArray[s.llIIIlII[2]] = llIIIIlI[llIIIlII[52]];
            if (s.lIlIIlIIIlI(Inventory.getCount((String[])stringArray))) {
                String[] stringArray2 = new String[llIIIlII[1]];
                stringArray2[s.llIIIlII[2]] = llIIIIlI[llIIIlII[53]];
                if (s.lIlIIlIIIlI(Inventory.getCount((String[])stringArray2))) {
                    String[] stringArray3 = new String[llIIIlII[1]];
                    stringArray3[s.llIIIlII[2]] = llIIIIlI[llIIIlII[54]];
                    if (s.lIlIIlIIIlI(Inventory.getCount((String[])stringArray3))) {
                        String[] stringArray4 = new String[llIIIlII[1]];
                        stringArray4[s.llIIIlII[2]] = llIIIIlI[llIIIlII[55]];
                        if (s.lIlIIlIIIlI(Inventory.getCount((String[])stringArray4))) {
                            String[] stringArray5 = new String[llIIIlII[1]];
                            stringArray5[s.llIIIlII[2]] = llIIIIlI[llIIIlII[56]];
                            if (s.lIlIIlIIIlI(Inventory.getCount((String[])stringArray5))) {
                                int[] nArray2 = new int[llIIIlII[1]];
                                nArray2[s.llIIIlII[2]] = llIIIlII[17];
                                if (s.lIlIIlIIIlI(Inventory.getCount((int[])nArray2)) && s.lIlIIIlllll(Inventory.contains((int[])f.bb) ? 1 : 0)) {
                                    n2 = llIIIlII[1];
                                    0;
                                    if (null == null) return n2 != 0;
                                    return ((0xF2 ^ 0x99 ^ (0xE ^ 0x47)) & (0xBB ^ 0xAB ^ (0xB4 ^ 0x86) ^ -1)) != 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = llIIIlII[2];
        return n2 != 0;
    }

    private static String lIlIIIlIllI(String lIlIllIIIIlIlIl, String lIlIllIIIIlIllI) {
        try {
            SecretKeySpec lIlIllIIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIIIIlIllI.getBytes(StandardCharsets.UTF_8)), llIIIlII[22]), "DES");
            Cipher lIlIllIIIIllIIl = Cipher.getInstance("DES");
            lIlIllIIIIllIIl.init(llIIIlII[3], lIlIllIIIIllIlI);
            return new String(lIlIllIIIIllIIl.doFinal(Base64.getDecoder().decode(lIlIllIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIIIIllIII) {
            lIlIllIIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int U() {
        try {
            s.aI();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 == 3) {
            return (0xE9 ^ 0xC2) & ~(0xE8 ^ 0xC3);
        }
        return llIIIlII[62];
    }

    private static String lIlIIIlIlIl(String lIlIllIIIllllII, String lIlIllIIIlllIIl) {
        try {
            SecretKeySpec lIlIllIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIIIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIIIlllllI = Cipher.getInstance("Blowfish");
            lIlIllIIIlllllI.init(llIIIlII[3], lIlIllIIIllllll);
            return new String(lIlIllIIIlllllI.doFinal(Base64.getDecoder().decode(lIlIllIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIIIllllIl) {
            lIlIllIIIllllIl.printStackTrace();
            return null;
        }
    }
}

