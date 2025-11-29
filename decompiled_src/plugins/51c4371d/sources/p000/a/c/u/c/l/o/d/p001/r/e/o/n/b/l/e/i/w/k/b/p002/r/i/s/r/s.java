package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.s  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/s.class */
public class s implements F {
    private static /* synthetic */ WorldPoint cJ;
    private static /* synthetic */ WorldPoint ce;
    private static /* synthetic */ int cM;
    private static /* synthetic */ int[] llIIIlII;
    private static /* synthetic */ WorldPoint cH;
    static /* synthetic */ boolean cj;
    static /* synthetic */ int ci;
    static /* synthetic */ String[] bX;
    private static /* synthetic */ WorldPoint cI;
    public static /* synthetic */ List<C0003d> bB;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ String[] llIIIIlI;
    private static /* synthetic */ WorldPoint cL;
    static /* synthetic */ WorldArea cF;
    static /* synthetic */ boolean cG;
    private static /* synthetic */ WorldPoint cK;

    private static String lIlIIIlIlll(String lIlIllIIIlIllII, String lIlIllIIIlIlIll) {
        String str = new String(Base64.getDecoder().decode(lIlIllIIIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIIIlIlIlI = new StringBuilder();
        char[] lIlIllIIIlIlIIl = lIlIllIIIlIlIll.toCharArray();
        int lIlIllIIIlIlIII = llIIIlII[2];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIlII[2];
        while (lIlIIIlllIl(i, length)) {
            lIlIllIIIlIlIlI.append((char) (charArray[i] ^ lIlIllIIIlIlIIl[lIlIllIIIlIlIII % lIlIllIIIlIlIIl.length]));
            "".length();
            lIlIllIIIlIlIII++;
            i++;
            "".length();
            if ((((63 ^ 54) ^ (79 ^ 100)) & (((125 ^ 81) ^ (72 ^ 70)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lIlIllIIIlIlIlI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return llIIIlII[2];
    }

    private static boolean lIlIIlIIlIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v294, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v316, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public static void aI() {
        if (lIlIIIlllIl(Skills.getLevel(Skill.FISHING), llIIIlII[0])) {
            N.cX();
        }
        if (lIlIIIllllI(Skills.getLevel(Skill.FISHING), llIIIlII[0])) {
            if (lIlIIIlllll(bz ? 1 : 0)) {
                C0001b.a(bB);
                if (lIlIIIlllIl(bB.size(), llIIIlII[1])) {
                    System.out.println(llIIIIlI[llIIIlII[2]]);
                    bz = llIIIlII[2];
                }
            }
            if (lIlIIlIIIII(bz ? 1 : 0)) {
                if (lIlIIlIIIII(ac() ? 1 : 0) && lIlIIIlllIl(C0004e.j(cM), llIIIlII[1])) {
                    String[] strArr = new String[llIIIlII[1]];
                    strArr[llIIIlII[2]] = llIIIIlI[llIIIlII[1]];
                    if (lIlIIlIIIII(Inventory.contains(strArr) ? 1 : 0)) {
                        BankLocation nearest = BankLocation.getNearest();
                        if (lIlIIlIIIIl(nearest) && lIlIIlIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIIIIlI[llIIIlII[3]];
                            C0000a.a(nearest);
                        }
                        if (lIlIIlIIIIl(nearest) && lIlIIIlllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIlIIlIIIII(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepUntil(() -> {
                                    return Bank.isOpen();
                                }, llIIIlII[4]);
                                "".length();
                            }
                            if (lIlIIIlllll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderBarrows.c = llIIIIlI[llIIIlII[5]];
                                if (lIlIIlIIIlI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks(llIIIlII[6]);
                                    "".length();
                                }
                                if (lIlIIlIIIlI(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks(llIIIlII[3]);
                                    "".length();
                                }
                                int[] iArr = new int[llIIIlII[7]];
                                iArr[llIIIlII[2]] = llIIIlII[8];
                                iArr[llIIIlII[1]] = llIIIlII[9];
                                iArr[llIIIlII[3]] = llIIIlII[10];
                                iArr[llIIIlII[5]] = llIIIlII[11];
                                iArr[llIIIlII[6]] = llIIIlII[12];
                                iArr[llIIIlII[13]] = llIIIlII[14];
                                iArr[llIIIlII[15]] = llIIIlII[16];
                                if (lIlIIlIIIII(C0004e.b(iArr) ? 1 : 0)) {
                                    ag();
                                    System.out.println(llIIIIlI[llIIIlII[6]]);
                                    bz = llIIIlII[1];
                                    return;
                                }
                                int[] iArr2 = new int[llIIIlII[15]];
                                iArr2[llIIIlII[2]] = llIIIlII[8];
                                iArr2[llIIIlII[1]] = llIIIlII[9];
                                iArr2[llIIIlII[3]] = llIIIlII[10];
                                iArr2[llIIIlII[5]] = llIIIlII[11];
                                iArr2[llIIIlII[6]] = llIIIlII[12];
                                iArr2[llIIIlII[13]] = llIIIlII[14];
                                if (lIlIIIlllll(C0004e.b(iArr2) ? 1 : 0)) {
                                    C0000a.a(llIIIlII[8], llIIIlII[0]);
                                    C0000a.a(llIIIlII[14], llIIIlII[0]);
                                    C0000a.a(llIIIlII[9], llIIIlII[1]);
                                    C0000a.a(llIIIlII[10], llIIIlII[1]);
                                    C0000a.a(llIIIlII[11], llIIIlII[0]);
                                    C0000a.a(llIIIlII[12], llIIIlII[1]);
                                    C0000a.a(llIIIlII[16], llIIIlII[5]);
                                    C0000a.a(llIIIlII[17], llIIIlII[18]);
                                }
                            }
                        }
                    }
                }
                if (lIlIIIlllll(Inventory.contains(C0005f.bb) ? 1 : 0) && lIlIIIlllIl(Movement.getRunEnergy(), llIIIlII[19])) {
                    Inventory.getFirst(C0005f.bb).interact(llIIIIlI[llIIIlII[13]]);
                    Time.sleepTicks(llIIIlII[1]);
                    "".length();
                }
                if (lIlIIIlllll(ac() ? 1 : 0) && lIlIIIlllIl(C0004e.j(cM), llIIIlII[1])) {
                    int[] iArr3 = new int[llIIIlII[1]];
                    iArr3[llIIIlII[2]] = llIIIlII[20];
                    if (lIlIIlIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(ce), llIIIlII[0])) {
                            AccBuilderBarrows.c = llIIIIlI[llIIIlII[15]];
                            if (lIlIIIlllll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo(ce);
                            "".length();
                            Time.sleepTicks(llIIIlII[1]);
                            "".length();
                        }
                        if (lIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(ce), llIIIlII[21])) {
                            AccBuilderBarrows.c = llIIIIlI[llIIIlII[7]];
                            C0006g.a(llIIIIlI[llIIIlII[22]], bX);
                        }
                    }
                }
                if (lIlIIlIIlIl(C0004e.j(cM), llIIIlII[1])) {
                    int[] iArr4 = new int[llIIIlII[1]];
                    iArr4[llIIIlII[2]] = llIIIlII[20];
                    if (lIlIIIlllll(Inventory.contains(iArr4) ? 1 : 0)) {
                        String[] strArr2 = new String[llIIIlII[1]];
                        strArr2[llIIIlII[2]] = llIIIIlI[llIIIlII[23]];
                        if (lIlIIlIIIII(Inventory.contains(strArr2) ? 1 : 0)) {
                            ci = llIIIlII[2];
                            String[] strArr3 = new String[llIIIlII[1]];
                            strArr3[llIIIlII[2]] = llIIIIlI[llIIIlII[0]];
                            if (lIlIIlIIIII(Inventory.contains(strArr3) ? 1 : 0)) {
                                if (lIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(cI), llIIIlII[6])) {
                                    AccBuilderBarrows.c = llIIIIlI[llIIIlII[24]];
                                    Movement.walkTo(cI);
                                    "".length();
                                }
                                if (lIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(cI), llIIIlII[6])) {
                                    AccBuilderBarrows.c = llIIIIlI[llIIIlII[21]];
                                    String[] strArr4 = new String[llIIIlII[1]];
                                    strArr4[llIIIlII[2]] = llIIIIlI[llIIIlII[25]];
                                    if (lIlIIlIIIII(Inventory.contains(strArr4) ? 1 : 0)) {
                                        String[] strArr5 = new String[llIIIlII[1]];
                                        strArr5[llIIIlII[2]] = llIIIIlI[llIIIlII[26]];
                                        if (lIlIIlIIIIl(TileObjects.getNearest(strArr5))) {
                                            String[] strArr6 = new String[llIIIlII[1]];
                                            strArr6[llIIIlII[2]] = llIIIIlI[llIIIlII[27]];
                                            TileObjects.getNearest(strArr6).interact(llIIIIlI[llIIIlII[28]]);
                                            Time.sleepTicks(llIIIlII[3]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                            String[] strArr7 = new String[llIIIlII[1]];
                            strArr7[llIIIlII[2]] = llIIIIlI[llIIIlII[29]];
                            if (lIlIIIlllll(Inventory.contains(strArr7) ? 1 : 0)) {
                                if (lIlIIlIIIII(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIIIIlI[llIIIlII[30]];
                                    if (lIlIIlIIIII(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo(cL);
                                        "".length();
                                        Time.sleepTicks(llIIIlII[1]);
                                        "".length();
                                    }
                                    C0006g.a(bX);
                                }
                                if (lIlIIIlllll(cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] strArr8 = new String[llIIIlII[1]];
                                    strArr8[llIIIlII[2]] = llIIIIlI[llIIIlII[31]];
                                    if (lIlIIIlllll(Inventory.contains(strArr8) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[32]];
                                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                                        String[] strArr9 = new String[llIIIlII[1]];
                                        strArr9[llIIIlII[2]] = llIIIIlI[llIIIlII[33]];
                                        if (lIlIIlIIIll(worldLocation.distanceTo(TileObjects.getNearest(strArr9).getWorldLocation()), llIIIlII[3])) {
                                            String[] strArr10 = new String[llIIIlII[1]];
                                            strArr10[llIIIlII[2]] = llIIIIlI[llIIIlII[34]];
                                            Movement.walkTo(TileObjects.getNearest(strArr10).getWorldLocation());
                                            "".length();
                                            Time.sleepTicks(llIIIlII[6]);
                                            "".length();
                                        }
                                        if (lIlIIlIIIII(Dialog.isOpen() ? 1 : 0)) {
                                            String[] strArr11 = new String[llIIIlII[1]];
                                            strArr11[llIIIlII[2]] = llIIIIlI[llIIIlII[35]];
                                            Item first = Inventory.getFirst(strArr11);
                                            String[] strArr12 = new String[llIIIlII[1]];
                                            strArr12[llIIIlII[2]] = llIIIIlI[llIIIlII[36]];
                                            first.useOn(TileObjects.getNearest(strArr12));
                                            Time.sleepTicks(llIIIlII[3]);
                                            "".length();
                                        }
                                        C0006g.a(bX);
                                    }
                                    String[] strArr13 = new String[llIIIlII[1]];
                                    strArr13[llIIIlII[2]] = llIIIIlI[llIIIlII[37]];
                                    if (lIlIIlIIIII(Inventory.contains(strArr13) ? 1 : 0) && lIlIIlIIIII(cG ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[38]];
                                        C0006g.a(llIIIIlI[llIIIlII[20]], bX);
                                        if (lIlIIIlllll(Dialog.getText().contains(llIIIIlI[llIIIlII[39]]) ? 1 : 0)) {
                                            cG = llIIIlII[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIlIIlIIlIl(C0004e.j(cM), llIIIlII[5])) {
                    String[] strArr14 = new String[llIIIlII[1]];
                    strArr14[llIIIlII[2]] = llIIIIlI[llIIIlII[40]];
                    if (lIlIIlIIIII(Inventory.contains(strArr14) ? 1 : 0)) {
                        String[] strArr15 = new String[llIIIlII[1]];
                        strArr15[llIIIlII[2]] = llIIIIlI[llIIIlII[41]];
                        if (lIlIIlIIIII(Inventory.contains(strArr15) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIIIIlI[llIIIlII[42]];
                            int[] iArr5 = new int[llIIIlII[1]];
                            iArr5[llIIIlII[2]] = llIIIlII[43];
                            NPCs.getNearest(iArr5).interact(llIIIIlI[llIIIlII[44]]);
                            Time.sleepTicks(llIIIlII[13]);
                            "".length();
                        }
                    }
                    String[] strArr16 = new String[llIIIlII[1]];
                    strArr16[llIIIlII[2]] = llIIIIlI[llIIIlII[45]];
                    if (lIlIIIlllll(Inventory.contains(strArr16) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[46]];
                        C0006g.a(llIIIIlI[llIIIlII[47]], bX);
                    }
                }
                String[] strArr17 = new String[llIIIlII[1]];
                strArr17[llIIIlII[2]] = llIIIIlI[llIIIlII[48]];
                if (lIlIIIlllll(Inventory.contains(strArr17) ? 1 : 0)) {
                    if (lIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(ce), llIIIlII[13])) {
                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[49]];
                        Movement.walkTo(ce);
                        "".length();
                        Time.sleepTicks(llIIIlII[1]);
                        "".length();
                    }
                    if (lIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(ce), llIIIlII[13])) {
                        AccBuilderBarrows.c = llIIIIlI[llIIIlII[50]];
                        if (lIlIIIlllIl(ci, llIIIlII[1])) {
                            Q.jB += llIIIlII[1];
                            Q.o(AccBuilderBarrows.m);
                            ci += llIIIlII[1];
                            Q.jB = llIIIlII[2];
                            cj = llIIIlII[2];
                        }
                        C0006g.a(llIIIIlI[llIIIlII[51]], bX);
                    }
                }
            }
        }
    }

    private static boolean lIlIIlIIlII(int i, int i2) {
        return i <= i2;
    }

    static {
        lIlIIIlllII();
        lIlIIIllIll();
        bB = new ArrayList();
        cF = new WorldArea(llIIIlII[65], llIIIlII[66], llIIIlII[24], llIIIlII[25], llIIIlII[2]);
        String[] strArr = new String[llIIIlII[22]];
        strArr[llIIIlII[2]] = llIIIIlI[llIIIlII[67]];
        strArr[llIIIlII[1]] = llIIIIlI[llIIIlII[68]];
        strArr[llIIIlII[3]] = llIIIIlI[llIIIlII[69]];
        strArr[llIIIlII[5]] = llIIIIlI[llIIIlII[19]];
        strArr[llIIIlII[6]] = llIIIIlI[llIIIlII[70]];
        strArr[llIIIlII[13]] = llIIIIlI[llIIIlII[71]];
        strArr[llIIIlII[15]] = llIIIIlI[llIIIlII[72]];
        strArr[llIIIlII[7]] = llIIIIlI[llIIIlII[73]];
        bX = strArr;
        ce = new WorldPoint(llIIIlII[74], llIIIlII[75], llIIIlII[2]);
        cH = new WorldPoint(llIIIlII[76], llIIIlII[77], llIIIlII[2]);
        cI = new WorldPoint(llIIIlII[78], llIIIlII[79], llIIIlII[2]);
        cJ = new WorldPoint(llIIIlII[80], llIIIlII[81], llIIIlII[2]);
        cK = new WorldPoint(llIIIlII[82], llIIIlII[83], llIIIlII[2]);
        cL = new WorldPoint(llIIIlII[84], llIIIlII[85], llIIIlII[2]);
        cM = llIIIlII[24];
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return llIIIIlI[llIIIlII[63]];
    }

    private static boolean lIlIIIllllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIlIIIlI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIlIIIllllI(C0004e.j(cM), llIIIlII[13])) {
            ?? r0 = llIIIlII[1];
            "".length();
            return "   ".length() <= 0 ? ((91 ^ 80) ^ (65 ^ 103)) & (("  ".length() ^ (235 ^ 196)) ^ (-" ".length())) : r0;
        }
        return llIIIlII[2];
    }

    private static void lIlIIIlllII() {
        llIIIlII = new int[87];
        llIIIlII[0] = 142 ^ 132;
        llIIIlII[1] = " ".length();
        llIIIlII[2] = ((22 ^ 81) ^ (48 ^ 123)) & (((54 ^ 127) ^ (24 ^ 93)) ^ (-" ".length()));
        llIIIlII[3] = "  ".length();
        llIIIlII[4] = (-25682) & 30681;
        llIIIlII[5] = "   ".length();
        llIIIlII[6] = (((28 + 96) - (-6)) + 38) ^ (((14 + 129) - 62) + 91);
        llIIIlII[7] = 40 ^ 47;
        llIIIlII[8] = (-41) & 8047;
        llIIIlII[9] = (-((-9788) & 28223)) & (-13313) & 32699;
        llIIIlII[10] = (-18117) & 18423;
        llIIIlII[11] = (-9729) & 10041;
        llIIIlII[12] = (-((-13575) & 15799)) & (-12289) & 16062;
        llIIIlII[13] = (((90 + 44) - 7) + 24) ^ (((18 + 103) - 12) + 37);
        llIIIlII[14] = (-((-23817) & 32158)) & (-33) & 16383;
        llIIIlII[15] = 27 ^ 29;
        llIIIlII[16] = (-((-4169) & 23119)) & (-1185) & 32759;
        llIIIlII[17] = (-31765) & 32759;
        llIIIlII[18] = (-((-2453) & 15765)) & (-2066) & 16377;
        llIIIlII[19] = (((108 + 67) - 152) + 110) ^ (((47 + 159) - 41) + 18);
        llIIIlII[20] = (18 ^ 62) ^ (67 ^ 116);
        llIIIlII[21] = 200 ^ 196;
        llIIIlII[22] = (155 ^ 169) ^ (30 ^ 36);
        llIIIlII[23] = 180 ^ 189;
        llIIIlII[24] = 14 ^ 5;
        llIIIlII[25] = 205 ^ 192;
        llIIIlII[26] = 1 ^ 15;
        llIIIlII[27] = (((189 + 164) - 153) + 0) ^ (((147 + 84) - 143) + 111);
        llIIIlII[28] = 164 ^ 180;
        llIIIlII[29] = (142 ^ 160) ^ (165 ^ 154);
        llIIIlII[30] = (246 ^ 163) ^ (104 ^ 47);
        llIIIlII[31] = 85 ^ 70;
        llIIIlII[32] = (79 ^ 39) ^ (27 ^ 103);
        llIIIlII[33] = 82 ^ 71;
        llIIIlII[34] = (((19 + 134) - (-55)) + 2) ^ (((24 + 5) - 3) + 170);
        llIIIlII[35] = 17 ^ 6;
        llIIIlII[36] = (181 ^ 190) ^ (59 ^ 40);
        llIIIlII[37] = (79 ^ 58) ^ (108 ^ 0);
        llIIIlII[38] = (((134 + 136) - 261) + 128) ^ (((75 + 49) - 36) + 59);
        llIIIlII[39] = (99 ^ 89) ^ (171 ^ 141);
        llIIIlII[40] = (71 ^ 65) ^ (125 ^ 102);
        llIIIlII[41] = (((30 + 40) - (-93)) + 3) ^ (((117 + 108) - 136) + 95);
        llIIIlII[42] = "  ".length() ^ (51 ^ 46);
        llIIIlII[43] = (-8207) & 12286;
        llIIIlII[44] = " ".length() ^ (54 ^ 23);
        llIIIlII[45] = (96 ^ 2) ^ (26 ^ 89);
        llIIIlII[46] = (36 ^ 23) ^ (172 ^ 189);
        llIIIlII[47] = 87 ^ 116;
        llIIIlII[48] = 95 ^ 123;
        llIIIlII[49] = 161 ^ 132;
        llIIIlII[50] = 136 ^ 174;
        llIIIlII[51] = (((155 + 105) - 115) + 35) ^ (((53 + 0) - 47) + 141);
        llIIIlII[52] = (((70 + 57) - 80) + 93) ^ (((1 + 112) - 42) + 93);
        llIIIlII[53] = (86 ^ 89) ^ (116 ^ 82);
        llIIIlII[54] = (((106 + 151) - 114) + 19) ^ (((2 + 11) - (-63)) + 60);
        llIIIlII[55] = (34 ^ 80) ^ (121 ^ 32);
        llIIIlII[56] = 174 ^ 130;
        llIIIlII[57] = (-23750) & 32749;
        llIIIlII[58] = (-16907) & 17406;
        llIIIlII[59] = (-20513) & 32492;
        llIIIlII[60] = (-2052) & 27051;
        llIIIlII[61] = (-5129) & 6028;
        llIIIlII[62] = 26 ^ 126;
        llIIIlII[63] = (83 ^ 54) ^ (223 ^ 151);
        llIIIlII[64] = (187 ^ 136) ^ (101 ^ 120);
        llIIIlII[65] = (-28677) & 31308;
        llIIIlII[66] = (-((-20873) & 21402)) & (-24705) & 28667;
        llIIIlII[67] = (157 ^ 193) ^ (107 ^ 24);
        llIIIlII[68] = (62 ^ 92) ^ (16 ^ 66);
        llIIIlII[69] = (((53 + 77) - 5) + 49) ^ (((89 + 53) - 118) + 135);
        llIIIlII[70] = (((107 + 125) - 175) + 108) ^ (((17 + 102) - 13) + 44);
        llIIIlII[71] = 112 ^ 68;
        llIIIlII[72] = 242 ^ 199;
        llIIIlII[73] = 93 ^ 107;
        llIIIlII[74] = (-((-645) & 26349)) & (-149) & 28671;
        llIIIlII[75] = (-24586) & 28073;
        llIIIlII[76] = (-393) & 3051;
        llIIIlII[77] = (-((-5005) & 21453)) & (-8209) & 28156;
        llIIIlII[78] = (-425) & 3055;
        llIIIlII[79] = (-((-829) & 29565)) & (-538) & 32767;
        llIIIlII[80] = (-((-7885) & 32462)) & (-4105) & 31325;
        llIIIlII[81] = (-((-9329) & 30334)) & (-8193) & 32639;
        llIIIlII[82] = (-((-4427) & 29051)) & (-4482) & 31743;
        llIIIlII[83] = (-((-1319) & 13735)) & (-16905) & 32765;
        llIIIlII[84] = (-((-585) & 30537)) & (-41) & 32633;
        llIIIlII[85] = (-4609) & 8047;
        llIIIlII[86] = (((149 + 29) - 25) + 4) ^ (((160 + 90) - 179) + 99);
    }

    private static void ag() {
        int[] iArr = new int[llIIIlII[1]];
        iArr[llIIIlII[2]] = llIIIlII[12];
        if (lIlIIlIIIII(Bank.contains(iArr) ? 1 : 0)) {
            bB.add(new C0003d(llIIIlII[12], llIIIlII[1], llIIIlII[57]));
            "".length();
        }
        int[] iArr2 = new int[llIIIlII[1]];
        iArr2[llIIIlII[2]] = llIIIlII[10];
        if (lIlIIlIIIII(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(llIIIlII[10], llIIIlII[1], llIIIlII[4]));
            "".length();
        }
        int[] iArr3 = new int[llIIIlII[1]];
        iArr3[llIIIlII[2]] = llIIIlII[9];
        if (lIlIIlIIIII(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(llIIIlII[9], llIIIlII[1], llIIIlII[4]));
            "".length();
        }
        int[] iArr4 = new int[llIIIlII[1]];
        iArr4[llIIIlII[2]] = llIIIlII[14];
        if (lIlIIlIIIII(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(llIIIlII[14], llIIIlII[24], llIIIlII[4]));
            "".length();
        }
        int[] iArr5 = new int[llIIIlII[1]];
        iArr5[llIIIlII[2]] = llIIIlII[16];
        if (lIlIIlIIIII(Bank.contains(iArr5) ? 1 : 0)) {
            bB.add(new C0003d(llIIIlII[16], llIIIlII[24], C0008i.bw));
            "".length();
        }
        int[] iArr6 = new int[llIIIlII[1]];
        iArr6[llIIIlII[2]] = llIIIlII[11];
        if (lIlIIlIIIII(Bank.contains(iArr6) ? 1 : 0)) {
            bB.add(new C0003d(llIIIlII[11], llIIIlII[0], llIIIlII[58]));
            "".length();
        }
        if (lIlIIlIIIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIIIIlI[llIIIlII[64]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(llIIIlII[59], llIIIlII[13], llIIIlII[60]));
            "".length();
        }
        int[] iArr7 = new int[llIIIlII[1]];
        iArr7[llIIIlII[2]] = llIIIlII[8];
        if (lIlIIlIIIII(Bank.contains(iArr7) ? 1 : 0)) {
            bB.add(new C0003d(llIIIlII[8], llIIIlII[52], llIIIlII[61]));
            "".length();
        }
    }

    private static void lIlIIIllIll() {
        llIIIIlI = new String[llIIIlII[86]];
        llIIIIlI[llIIIlII[2]] = lIlIIIlIlIl("+QLgmF0Am56RFI936/+1ScShyzMYU9mEsorxtSOIp6iI5Y48FOmZAHxZBPbr2otk", "rwCnv");
        llIIIIlI[llIIIlII[1]] = lIlIIIlIlIl("qTnKe4FqCULmzociUDrciw==", "YebFj");
        llIIIIlI[llIIIlII[3]] = lIlIIIlIllI("irn4fnd5LTZjh8vWrxfkYA==", "kCXBH");
        llIIIIlI[llIIIlII[5]] = lIlIIIlIllI("EbfG7Rmj4OuNdB5MxHGZYLb5O/5juTl2", "MzOpv");
        llIIIIlI[llIIIlII[6]] = lIlIIIlIllI("cvrTk4U1eWF9XU7cfqx05NDcGgTf6S+3IdkB3JsI4YQYvBr2pEDfCZiR5dh9+o9kGsIpF8noy2w=", "IIGCW");
        llIIIIlI[llIIIlII[13]] = lIlIIIlIlll("LgIbOQY=", "jprWm");
        llIIIIlI[llIIIlII[15]] = lIlIIIlIlIl("cZGqef8UwpdrwBC/LZ4zxw==", "kvefC");
        llIIIIlI[llIIIlII[7]] = lIlIIIlIlll("JyQLEQMdPg1DBgE1GRc=", "tPjcw");
        llIIIIlI[llIIIlII[22]] = lIlIIIlIlll("NTQqJisK", "cQYRY");
        llIIIIlI[llIIIlII[23]] = lIlIIIlIlll("Ai4hGAwqIHIEFys3Ogk=", "DGRpe");
        llIIIIlI[llIIIlII[0]] = lIlIIIlIlIl("sEOJss37zJ7+NOFuLgq4PQ==", "SHknv");
        llIIIIlI[llIIIlII[24]] = lIlIIIlIlll("AQUQWScgRBAQPSo=", "OdfyS");
        llIIIIlI[llIIIlII[21]] = lIlIIIlIlll("AwssNA4pBQ==", "GbKSg");
        llIIIIlI[llIIIlII[25]] = lIlIIIlIlll("NhYOShwNHQ9KHQsBBw==", "dsjjj");
        llIIIIlI[llIIIlII[26]] = lIlIIIlIlIl("SNYzc39XbKg=", "ZMgkn");
        llIIIIlI[llIIIlII[27]] = lIlIIIlIllI("/744b7PxEbE=", "mNgxt");
        llIIIIlI[llIIIlII[28]] = lIlIIIlIlIl("oBEdJM6SEqk=", "YXmdt");
        llIIIIlI[llIIIlII[29]] = lIlIIIlIllI("KQp12LtYF5BqPb+hPnE7lg==", "MeHWU");
        llIIIIlI[llIIIlII[30]] = lIlIIIlIlIl("pSVbaokfwgfAcrPPttU1gw==", "DIsJu");
        llIIIIlI[llIIIlII[31]] = lIlIIIlIlll("ExU0CyU3", "TtFgL");
        llIIIIlI[llIIIlII[32]] = lIlIIIlIlIl("2OKGXcXc4lcrnx5RYF/uWg==", "MsvKM");
        llIIIIlI[llIIIlII[33]] = lIlIIIlIllI("T43R53QI8sa2LnkKtI+9Vw==", "SgaoQ");
        llIIIIlI[llIIIlII[34]] = lIlIIIlIlIl("8aUTjx1xyPaMjOWGOFIPyw==", "wSjMu");
        llIIIIlI[llIIIlII[35]] = lIlIIIlIlIl("ydM7HtAJ1VQ=", "vadQX");
        llIIIIlI[llIIIlII[36]] = lIlIIIlIlIl("DZf9vKLi9FiRjR0rssrmuQ==", "DdFTJ");
        llIIIIlI[llIIIlII[37]] = lIlIIIlIlll("DBQKGyoo", "KuxwC");
        llIIIIlI[llIIIlII[38]] = lIlIIIlIlIl("+ndcBD6ILbEK5mAPeDwhZQ==", "vihRy");
        llIIIIlI[llIIIlII[20]] = lIlIIIlIlll("Oi0BDQw=", "xBowc");
        llIIIIlI[llIIIlII[39]] = lIlIIIlIllI("Yd4NnmhD62iQMm/nrx7jqoseoSCxwKFsU5oyFrPsVP8NXyUXAK+kXuE3awmdxifx", "YPDUv");
        llIIIIlI[llIIIlII[40]] = lIlIIIlIllI("JRmUX1re4oo=", "RJrdR");
        llIIIIlI[llIIIlII[41]] = lIlIIIlIlll("BjYgYTY9Njk1cTc2JTE=", "TWWAQ");
        llIIIIlI[llIIIlII[42]] = lIlIIIlIllI("je1vBTcb1fU=", "oMaKM");
        llIIIIlI[llIIIlII[44]] = lIlIIIlIlIl("w6IWarbDZ3c=", "YDwbF");
        llIIIIlI[llIIIlII[45]] = lIlIIIlIlll("GSUOdCgiJRcgbyglCyQ=", "KDyTO");
        llIIIIlI[llIIIlII[46]] = lIlIIIlIlIl("oRkz2ANBjF/EStxMLM79LQ==", "pgDRw");
        llIIIIlI[llIIIlII[47]] = lIlIIIlIlll("EzgkDiA=", "QWJtO");
        llIIIIlI[llIIIlII[48]] = lIlIIIlIlll("EgoHACg6BFQcMzsTHBE=", "TcthA");
        llIIIIlI[llIIIlII[49]] = lIlIIIlIlll("BxgsTSwmWSkZOTsN", "IyZmX");
        llIIIIlI[llIIIlII[50]] = lIlIIIlIlll("CAQXJSAmBBcrcz8YHD8n", "NmyLS");
        llIIIIlI[llIIIlII[51]] = lIlIIIlIlll("ACMGGiQ/", "VFunV");
        llIIIIlI[llIIIlII[52]] = lIlIIIlIlll("EAsCKA48Hk85Bz8PHyIQJw==", "SjoMb");
        llIIIIlI[llIIIlII[53]] = lIlIIIlIlIl("HxcvWREZIFk=", "JLnGZ");
        llIIIIlI[llIIIlII[54]] = lIlIIIlIlIl("uUoTuskuviI=", "JSKTT");
        llIIIIlI[llIIIlII[55]] = lIlIIIlIllI("Nn5tFmIKJoPBG35jCVEWFw==", "oIaPj");
        llIIIIlI[llIIIlII[56]] = lIlIIIlIlIl("cgdMjXDmL4UA1hLnLjPK8Q==", "hRfaQ");
        llIIIIlI[llIIIlII[63]] = lIlIIIlIllI("P/piNl00oq1rsdqt4JHMCQ==", "BSUNT");
        llIIIIlI[llIIIlII[64]] = lIlIIIlIlll("IAMlNUI9DGslBzMGPzpCeg==", "RjKRb");
        llIIIIlI[llIIIlII[67]] = lIlIIIlIlll("LUkSBgpEHgoJHQEbDAkeRB4NBg1EHgQUWQAGEglZEAEKFBxEGhEGEBYaWg==", "diegy");
        llIIIIlI[llIIIlII[68]] = lIlIIIlIlIl("9mQPy9+jU5492PUpAw27QA==", "tnQvy");
        llIIIIlI[llIIIlII[69]] = lIlIIIlIlll("IRVqERcdUz0NCg1TJxFYDgEjDRYMUwNIDwcGJgwWTwdqBREGF2oBDEY=", "hsJhx");
        llIIIIlI[llIIIlII[19]] = lIlIIIlIlll("HRAnNmdqGS4ubDlVKT9rLAciPyUuBmo=", "JuKZK");
        llIIIIlI[llIIIlII[70]] = lIlIIIlIlIl("vgS/+SkcldGUK2K6WIG/+jFe78hlnpqCc25jKmyyAVs=", "QXMMw");
        llIIIIlI[llIIIlII[71]] = lIlIIIlIlll("Gm01Ilc2JC0rBXM+MStXMCU0PhInIy0nGD1qKSISMjk8YA==", "SJYNw");
        llIIIIlI[llIIIlII[72]] = lIlIIIlIllI("pwoFS/hh1owiP8rMPn23jYUg1zevM3js/t4c5edEexDD/GHeag/Fc3yg+AmWmt9v", "ZzhoK");
        llIIIIlI[llIIIlII[73]] = lIlIIIlIlll("AxQ5Sg==", "ZqJdV");
    }

    private static boolean lIlIIlIIIII(int i) {
        return i == 0;
    }

    private static boolean lIlIIlIIIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIlIIIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIlllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ac() {
        int[] iArr = new int[llIIIlII[1]];
        iArr[llIIIlII[2]] = llIIIlII[8];
        if (lIlIIlIIIlI(Inventory.getCount(iArr))) {
            String[] strArr = new String[llIIIlII[1]];
            strArr[llIIIlII[2]] = llIIIIlI[llIIIlII[52]];
            if (lIlIIlIIIlI(Inventory.getCount(strArr))) {
                String[] strArr2 = new String[llIIIlII[1]];
                strArr2[llIIIlII[2]] = llIIIIlI[llIIIlII[53]];
                if (lIlIIlIIIlI(Inventory.getCount(strArr2))) {
                    String[] strArr3 = new String[llIIIlII[1]];
                    strArr3[llIIIlII[2]] = llIIIIlI[llIIIlII[54]];
                    if (lIlIIlIIIlI(Inventory.getCount(strArr3))) {
                        String[] strArr4 = new String[llIIIlII[1]];
                        strArr4[llIIIlII[2]] = llIIIIlI[llIIIlII[55]];
                        if (lIlIIlIIIlI(Inventory.getCount(strArr4))) {
                            String[] strArr5 = new String[llIIIlII[1]];
                            strArr5[llIIIlII[2]] = llIIIIlI[llIIIlII[56]];
                            if (lIlIIlIIIlI(Inventory.getCount(strArr5))) {
                                int[] iArr2 = new int[llIIIlII[1]];
                                iArr2[llIIIlII[2]] = llIIIlII[17];
                                if (lIlIIlIIIlI(Inventory.getCount(iArr2)) && lIlIIIlllll(Inventory.contains(C0005f.bb) ? 1 : 0)) {
                                    ?? r0 = llIIIlII[1];
                                    "".length();
                                    return 0 != 0 ? ((242 ^ 153) ^ (14 ^ 71)) & (((187 ^ 171) ^ (180 ^ 134)) ^ (-" ".length())) : r0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return llIIIlII[2];
    }

    private static String lIlIIIlIllI(String lIlIllIIIIlIlll, String lIlIllIIIIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIIIIlIllI.getBytes(StandardCharsets.UTF_8)), llIIIlII[22]), "DES");
            Cipher lIlIllIIIIllIIl = Cipher.getInstance("DES");
            lIlIllIIIIllIIl.init(llIIIlII[3], secretKeySpec);
            return new String(lIlIllIIIIllIIl.doFinal(Base64.getDecoder().decode(lIlIllIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIIIIllIII) {
            lIlIllIIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllIl(int i, int i2) {
        return i < i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            aI();
            "".length();
            if (" ".length() == "   ".length()) {
                return (233 ^ 194) & ((232 ^ 195) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIIlII[62];
    }

    private static String lIlIIIlIlIl(String lIlIllIIIllllII, String lIlIllIIIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIlII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIllIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIIIllllIl) {
            lIlIllIIIllllIl.printStackTrace();
            return null;
        }
    }
}
