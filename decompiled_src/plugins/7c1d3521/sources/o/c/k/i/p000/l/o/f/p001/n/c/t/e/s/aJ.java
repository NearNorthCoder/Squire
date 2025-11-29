package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aJ  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aJ.class */
public class aJ implements InterfaceC0003ac {
    public static /* synthetic */ List<C0017d> bv;
    static /* synthetic */ int pN;
    private static /* synthetic */ String[] lIlllllIIl;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint de;
    private static /* synthetic */ int[] lIlllllIll;
    private static /* synthetic */ String[] cE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v124, types: [boolean] */
    public static void gY() {
        if (lIlIIIIlIlIIl(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (lIlIIIIlIlIlI(bv.size(), lIlllllIll[0])) {
                System.out.println(lIlllllIIl[lIlllllIll[1]]);
                bt = lIlllllIll[1];
            }
        }
        if (lIlIIIIlIlIll(bt ? 1 : 0)) {
            if (lIlIIIIlIlIll(an() ? 1 : 0) && lIlIIIIlIlIlI(C0018e.j(pN), lIlllllIll[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIIIlIllII(nearest) && lIlIIIIlIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIlllllIIl[lIlllllIll[0]];
                    C0000a.a(nearest);
                }
                if (lIlIIIIlIllII(nearest) && lIlIIIIlIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIIIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlllllIll[2]);
                        "".length();
                    }
                    if (lIlIIIIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lIlllllIIl[lIlllllIll[3]];
                        if (lIlIIIIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlllllIll[4]);
                            "".length();
                        }
                        if (lIlIIIIlIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlllllIll[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIlllllIll[3]];
                        iArr[lIlllllIll[1]] = lIlllllIll[5];
                        iArr[lIlllllIll[0]] = lIlllllIll[6];
                        if (lIlIIIIlIlIll(C0018e.c(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(lIlllllIIl[lIlllllIll[7]]);
                            bt = lIlllllIll[0];
                            return;
                        }
                        int[] iArr2 = new int[lIlllllIll[3]];
                        iArr2[lIlllllIll[1]] = lIlllllIll[5];
                        iArr2[lIlllllIll[0]] = lIlllllIll[6];
                        if (lIlIIIIlIlIIl(C0018e.c(iArr2) ? 1 : 0)) {
                            C0000a.a(lIlllllIll[5], lIlllllIll[8]);
                            C0000a.a(lIlllllIll[9], lIlllllIll[0]);
                        }
                    }
                }
            }
            if (lIlIIIIlIlIIl(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIIIIlIlIlI(Movement.getRunEnergy(), lIlllllIll[10])) {
                Inventory.getFirst(C0019f.ba).interact(lIlllllIIl[lIlllllIll[4]]);
                Time.sleepTicks(lIlllllIll[0]);
                "".length();
            }
            if (lIlIIIIlIlIIl(Inventory.contains(C0019f.aX) ? 1 : 0) && lIlIIIIlIlIlI(Prayers.getPoints(), lIlllllIll[11])) {
                Inventory.getFirst(C0019f.aX).interact(lIlllllIIl[lIlllllIll[12]]);
            }
            if (lIlIIIIlIlllI(lIlIIIIlIlIII(C0018e.w(), 60.0d))) {
                String[] strArr = new String[lIlllllIll[0]];
                strArr[lIlllllIll[1]] = lIlllllIIl[lIlllllIll[13]];
                if (lIlIIIIlIlIIl(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlllllIll[0]];
                    strArr2[lIlllllIll[1]] = lIlllllIIl[lIlllllIll[14]];
                    Inventory.getFirst(strArr2).interact(lIlllllIIl[lIlllllIll[15]]);
                    Time.sleepTicks(lIlllllIll[3]);
                    "".length();
                }
            }
            if (lIlIIIIlIlIIl(an() ? 1 : 0) && lIlIIIIlIlIll(C0018e.j(pN))) {
                if (lIlIIIIlIllll(Players.getLocal().getWorldLocation().distanceTo(de), lIlllllIll[15])) {
                    AccBuilderSotf.c = lIlllllIIl[lIlllllIll[16]];
                    if (lIlIIIIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(de);
                    "".length();
                    Time.sleepTicks(lIlllllIll[0]);
                    "".length();
                }
                if (lIlIIIIllIIII(Players.getLocal().getWorldLocation().distanceTo(de), lIlllllIll[15])) {
                    C0020g.a(lIlllllIIl[lIlllllIll[8]], cE);
                }
            }
        }
    }

    private static boolean lIlIIIIlIlllI(int i) {
        return i < 0;
    }

    private static String lIlIIIIIlllII(String llllllllllllllllllIllIllllllIIIl, String llllllllllllllllllIllIllllllIIII) {
        String llllllllllllllllllIllIllllllIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllllllIllIllllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIllIlllllIllll = new StringBuilder();
        char[] charArray = llllllllllllllllllIllIllllllIIII.toCharArray();
        int llllllllllllllllllIllIlllllIllIl = lIlllllIll[1];
        char[] charArray2 = llllllllllllllllllIllIllllllIIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlllllIll[1];
        while (lIlIIIIlIlIlI(i, length)) {
            char llllllllllllllllllIllIllllllIIlI = charArray2[i];
            llllllllllllllllllIllIlllllIllll.append((char) (llllllllllllllllllIllIllllllIIlI ^ charArray[llllllllllllllllllIllIlllllIllIl % charArray.length]));
            "".length();
            llllllllllllllllllIllIlllllIllIl++;
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIllIlllllIllll);
    }

    private static boolean lIlIIIIlIlIll(int i) {
        return i == 0;
    }

    private static String lIlIIIIIlllIl(String llllllllllllllllllIlllIIIIIIIIIl, String llllllllllllllllllIlllIIIIIIIIII) {
        try {
            SecretKeySpec llllllllllllllllllIlllIIIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIIIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllllIll[3], llllllllllllllllllIlllIIIIIIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllIIIIIIIIlI) {
            llllllllllllllllllIlllIIIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIIlIIlll() {
        lIlllllIll = new int[37];
        lIlllllIll[0] = " ".length();
        lIlllllIll[1] = (106 ^ 78) & ((176 ^ 148) ^ (-1));
        lIlllllIll[2] = (-(97 ^ 19)) & (-10247) & 15359;
        lIlllllIll[3] = "  ".length();
        lIlllllIll[4] = 171 ^ 175;
        lIlllllIll[5] = (-((-5315) & 21707)) & (-8321) & 32719;
        lIlllllIll[6] = (-((-7492) & 32119)) & (-133) & 32767;
        lIlllllIll[7] = "   ".length();
        lIlllllIll[8] = 153 ^ 147;
        lIlllllIll[9] = (-((-359) & 17895)) & (-2565) & 32725;
        lIlllllIll[10] = (((125 + 43) - 11) + 4) ^ (((86 + 37) - 70) + 94);
        lIlllllIll[11] = 219 ^ 195;
        lIlllllIll[12] = (61 ^ 9) ^ (107 ^ 90);
        lIlllllIll[13] = 85 ^ 83;
        lIlllllIll[14] = (65 ^ 28) ^ (249 ^ 163);
        lIlllllIll[15] = (30 ^ 85) ^ (126 ^ 61);
        lIlllllIll[16] = (236 ^ 176) ^ (96 ^ 53);
        lIlllllIll[17] = (-166) & 8175;
        lIlllllIll[18] = (-10888) & 12287;
        lIlllllIll[19] = (-((-7177) & 23867)) & (-8193) & 26482;
        lIlllllIll[20] = ((175 + 186) - 329) + 189;
        lIlllllIll[21] = (-21509) & 22508;
        lIlllllIll[22] = 119 ^ 99;
        lIlllllIll[23] = (-((-25541) & 29670)) & (-16643) & 32751;
        lIlllllIll[24] = (-3670) & 28669;
        lIlllllIll[25] = (-13895) & 16342;
        lIlllllIll[26] = (-((-3765) & 28604)) & (-1) & 31159;
        lIlllllIll[27] = (-((-2377) & 16255)) & (-18497) & 32759;
        lIlllllIll[28] = (-7170) & 8189;
        lIlllllIll[29] = 24 ^ 23;
        lIlllllIll[30] = (39 ^ 8) ^ (64 ^ 71);
        lIlllllIll[31] = (-8236) & 9135;
        lIlllllIll[32] = (30 ^ 48) ^ (4 ^ 78);
        lIlllllIll[33] = 1 ^ 10;
        lIlllllIll[34] = 55 ^ 59;
        lIlllllIll[35] = 119 ^ 122;
        lIlllllIll[36] = 147 ^ 157;
    }

    private static boolean lIlIIIIlIllII(Object obj) {
        return obj != null;
    }

    static {
        lIlIIIIlIIlll();
        lIlIIIIlIIllI();
        bv = new ArrayList();
        de = new WorldPoint(lIlllllIll[1], lIlllllIll[1], lIlllllIll[1]);
        pN = lIlllllIll[1];
        String[] strArr = new String[lIlllllIll[0]];
        strArr[lIlllllIll[1]] = lIlllllIIl[lIlllllIll[35]];
        cE = strArr;
    }

    private static int lIlIIIIlIlIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lIlllllIll[7]];
        iArr[lIlllllIll[1]] = lIlllllIll[5];
        iArr[lIlllllIll[0]] = lIlllllIll[17];
        iArr[lIlllllIll[3]] = lIlllllIll[9];
        int llllllllllllllllllIlllIIIIIIllll = lIlllllIll[1];
        while (lIlIIIIlIlIlI(llllllllllllllllllIlllIIIIIIllll, iArr.length)) {
            int[] iArr2 = new int[lIlllllIll[0]];
            iArr2[lIlllllIll[1]] = iArr[llllllllllllllllllIlllIIIIIIllll];
            if (lIlIIIIlIlIll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIlllllIll[1];
            }
            llllllllllllllllllIlllIIIIIIllll++;
            "".length();
            if ((-((((123 + 103) - 101) + 17) ^ (((54 + 94) - 135) + 125))) > 0) {
                return ((145 ^ 141) ^ (1 ^ 44)) & (((241 ^ 150) ^ (3 ^ 85)) ^ (-" ".length()));
            }
        }
        return lIlllllIll[0];
    }

    private static boolean lIlIIIIllIIIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x01b2, code lost:
        if (lIlIIIIlIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aJ.lIlllllIll[4]) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0237, code lost:
        if (lIlIIIIlIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aJ.lIlllllIll[22]) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlIIIIlIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aJ.lIlllllIll[8]) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6 = new int[lIlllllIll[0]];
        iArr6[lIlllllIll[1]] = lIlllllIll[17];
        if (lIlIIIIlIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIlllllIll[0]];
            iArr7[lIlllllIll[1]] = lIlllllIll[17];
            if (lIlIIIIlIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlllllIll[0]];
                iArr8[lIlllllIll[1]] = lIlllllIll[17];
            }
            iArr = new int[lIlllllIll[0]];
            iArr[lIlllllIll[1]] = lIlllllIll[20];
            if (lIlIIIIlIlIll(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(lIlllllIll[20], lIlllllIll[21], lIlllllIll[22]));
                "".length();
            }
            if (lIlIIIIlIlIll(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIlllllIIl[lIlllllIll[34]]);
            }) ? 1 : 0)) {
                bv.add(new C0017d(lIlllllIll[23], lIlllllIll[12], lIlllllIll[24]));
                "".length();
            }
            iArr2 = new int[lIlllllIll[0]];
            iArr2[lIlllllIll[1]] = lIlllllIll[25];
            if (lIlIIIIlIlIll(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(lIlllllIll[25], lIlllllIll[0], lIlllllIll[26]));
                "".length();
            }
            iArr3 = new int[lIlllllIll[0]];
            iArr3[lIlllllIll[1]] = lIlllllIll[9];
            if (lIlIIIIlIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr9 = new int[lIlllllIll[0]];
                iArr9[lIlllllIll[1]] = lIlllllIll[9];
                if (lIlIIIIlIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlllllIll[0]];
                    iArr10[lIlllllIll[1]] = lIlllllIll[9];
                }
                iArr4 = new int[lIlllllIll[0]];
                iArr4[lIlllllIll[1]] = lIlllllIll[27];
                if (lIlIIIIlIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr11 = new int[lIlllllIll[0]];
                    iArr11[lIlllllIll[1]] = lIlllllIll[27];
                    if (lIlIIIIlIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                        int[] iArr12 = new int[lIlllllIll[0]];
                        iArr12[lIlllllIll[1]] = lIlllllIll[27];
                    }
                    iArr5 = new int[lIlllllIll[0]];
                    iArr5[lIlllllIll[1]] = lIlllllIll[5];
                    if (lIlIIIIlIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr13 = new int[lIlllllIll[0]];
                        iArr13[lIlllllIll[1]] = lIlllllIll[5];
                        if (!lIlIIIIlIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                            return;
                        }
                        int[] iArr14 = new int[lIlllllIll[0]];
                        iArr14[lIlllllIll[1]] = lIlllllIll[5];
                        if (!lIlIIIIlIlIlI(Bank.getFirst(iArr14).getQuantity(), lIlllllIll[29])) {
                            return;
                        }
                    }
                    bv.add(new C0017d(lIlllllIll[5], lIlllllIll[30], lIlllllIll[31]));
                    "".length();
                }
                bv.add(new C0017d(lIlllllIll[27], lIlllllIll[22], lIlllllIll[28]));
                "".length();
                iArr5 = new int[lIlllllIll[0]];
                iArr5[lIlllllIll[1]] = lIlllllIll[5];
                if (lIlIIIIlIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bv.add(new C0017d(lIlllllIll[5], lIlllllIll[30], lIlllllIll[31]));
                "".length();
            }
            bv.add(new C0017d(lIlllllIll[9], lIlllllIll[4], C0023j.cf));
            "".length();
            iArr4 = new int[lIlllllIll[0]];
            iArr4[lIlllllIll[1]] = lIlllllIll[27];
            if (lIlIIIIlIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bv.add(new C0017d(lIlllllIll[27], lIlllllIll[22], lIlllllIll[28]));
            "".length();
            iArr5 = new int[lIlllllIll[0]];
            iArr5[lIlllllIll[1]] = lIlllllIll[5];
            if (lIlIIIIlIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bv.add(new C0017d(lIlllllIll[5], lIlllllIll[30], lIlllllIll[31]));
            "".length();
        }
        bv.add(new C0017d(lIlllllIll[17], lIlllllIll[8], C0018e.c(lIlllllIll[18], lIlllllIll[19])));
        "".length();
        iArr = new int[lIlllllIll[0]];
        iArr[lIlllllIll[1]] = lIlllllIll[20];
        if (lIlIIIIlIlIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (lIlIIIIlIlIll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIlllllIIl[lIlllllIll[34]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[lIlllllIll[0]];
        iArr2[lIlllllIll[1]] = lIlllllIll[25];
        if (lIlIIIIlIlIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIlllllIll[0]];
        iArr3[lIlllllIll[1]] = lIlllllIll[9];
        if (lIlIIIIlIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0017d(lIlllllIll[9], lIlllllIll[4], C0023j.cf));
        "".length();
        iArr4 = new int[lIlllllIll[0]];
        iArr4[lIlllllIll[1]] = lIlllllIll[27];
        if (lIlIIIIlIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bv.add(new C0017d(lIlllllIll[27], lIlllllIll[22], lIlllllIll[28]));
        "".length();
        iArr5 = new int[lIlllllIll[0]];
        iArr5[lIlllllIll[1]] = lIlllllIll[5];
        if (lIlIIIIlIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bv.add(new C0017d(lIlllllIll[5], lIlllllIll[30], lIlllllIll[31]));
        "".length();
    }

    private static boolean lIlIIIIlIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIIIlIllIl(int i) {
        return i > 0;
    }

    private static String lIlIIIIlIIlIl(String llllllllllllllllllIllIllllIlllII, String llllllllllllllllllIllIllllIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIllllIllIll.getBytes(StandardCharsets.UTF_8)), lIlllllIll[15]), "DES");
            Cipher llllllllllllllllllIllIllllIllllI = Cipher.getInstance("DES");
            llllllllllllllllllIllIllllIllllI.init(lIlllllIll[3], secretKeySpec);
            return new String(llllllllllllllllllIllIllllIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIllllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIllllIlllIl) {
            llllllllllllllllllIllIllllIlllIl.printStackTrace();
            return null;
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            gY();
            "".length();
            if ((-"   ".length()) >= 0) {
                return ((123 ^ 117) ^ (143 ^ 173)) & (((142 ^ 195) ^ (94 ^ 63)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlllllIll[32];
    }

    private static boolean lIlIIIIlIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIIlIllll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIIIllIIII(int i, int i2) {
        return i <= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lIlllllIIl[lIlllllIll[33]];
    }

    private static void lIlIIIIlIIllI() {
        lIlllllIIl = new String[lIlllllIll[36]];
        lIlllllIIl[lIlllllIll[1]] = lIlIIIIIlllII("MxwZJTsdEBNsKgAMHiIvVRwDKSUGWVc/PxwBFCQhGxJXLikWHlc4J1UEAik7AQ==", "uuwLH");
        lIlllllIIl[lIlllllIll[0]] = lIlIIIIIlllII("Gi0xZiE7bCUnOz8=", "TLGFU");
        lIlllllIIl[lIlllllIll[3]] = lIlIIIIIlllIl("AhsSjdkOsgnQgy7eaNAfiCThNdsk4lsY", "nRzPB");
        lIlllllIIl[lIlllllIll[7]] = lIlIIIIIlllII("FgNBORMkRgwxEjIPDz9BMBMEKxVhFRQoES0PBCtNYRUWMRUiDgg2BmESDngjFD8oFiY=", "AfaXa");
        lIlllllIIl[lIlllllIll[4]] = lIlIIIIIlllIl("esHW+YCFN3M=", "XpobM");
        lIlllllIIl[lIlllllIll[12]] = lIlIIIIIlllIl("riVSswKo8LY=", "KNMVz");
        lIlllllIIl[lIlllllIll[13]] = lIlIIIIIlllII("IQ4XFQk=", "rfvgb");
        lIlllllIIl[lIlllllIll[14]] = lIlIIIIIlllII("HiEgFjs=", "MIAdP");
        lIlllllIIl[lIlllllIll[15]] = lIlIIIIIlllIl("IOa/60QIvi0=", "DiBJD");
        lIlllllIIl[lIlllllIll[16]] = lIlIIIIIlllIl("aCnjModD2KKWISpRysKBIA==", "pbEHg");
        lIlllllIIl[lIlllllIll[8]] = lIlIIIIIlllIl("OqIVuQczDOg=", "FOqhP");
        lIlllllIIl[lIlllllIll[33]] = lIlIIIIIlllIl("qLn5l+vxhXY=", "unMIL");
        lIlllllIIl[lIlllllIll[34]] = lIlIIIIIlllIl("VIjSGAt6IWsIJwfO2hT9dbQGAFSFBM9A", "tMgny");
        lIlllllIIl[lIlllllIll[35]] = lIlIIIIlIIlIl("IduDDOzn1/s=", "MWYuT");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIIIllIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlllllIll[15])) {
            ?? r0 = lIlllllIll[0];
            "".length();
            return (-((((172 + 123) - 198) + 81) ^ (((150 + 59) - 62) + 35))) >= 0 ? ((67 ^ 47) ^ (188 ^ 198)) & (((135 ^ 192) ^ (238 ^ 191)) ^ (-" ".length())) : r0;
        }
        return lIlllllIll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lIlllllIll[1];
    }
}
