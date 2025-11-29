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
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aa  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aa.class */
public class C0001aa implements InterfaceC0003ac {
    public static final /* synthetic */ WorldPoint mJ;
    public static final /* synthetic */ WorldPoint mH;
    public static final /* synthetic */ String[] mL;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int cG;
    static /* synthetic */ boolean dj;
    public static final /* synthetic */ WorldPoint mI;
    static /* synthetic */ int di;
    public static final /* synthetic */ WorldPoint mK;
    private static /* synthetic */ int[] lllIIIIIll;
    private static /* synthetic */ String[] lllIIIIIlI;
    public static /* synthetic */ List<C0017d> bv;

    private static boolean lIllllIlllIII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0142, code lost:
        if (lIllllIllIllI(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x054a, code lost:
        if (lIllllIllIIll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v369, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ev() {
        if (lIllllIllIIIl(bt ? 1 : 0)) {
            AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[0]];
            C0015b.a(bv);
            if (lIllllIllIIlI(bv.size(), lllIIIIIll[1])) {
                System.out.println(lllIIIIIlI[lllIIIIIll[1]]);
                bt = lllIIIIIll[0];
            }
        }
        if (lIllllIllIIll(bt ? 1 : 0) && lIllllIllIIlI(C0018e.j(lllIIIIIll[2]), lllIIIIIll[3])) {
            O.db();
        }
        if (lIllllIllIIll(bt ? 1 : 0) && lIllllIllIlII(C0018e.j(lllIIIIIll[2]), lllIIIIIll[3])) {
            if (lIllllIllIIIl(Inventory.contains(C0019f.ba) ? 1 : 0) && lIllllIllIIlI(Movement.getRunEnergy(), lllIIIIIll[4])) {
                Inventory.getFirst(C0019f.ba).interact(lllIIIIIlI[lllIIIIIll[5]]);
                Time.sleepTicks(lllIIIIIll[1]);
                "".length();
            }
            if (lIllllIllIlIl(lIllllIllIIII(C0018e.w(), 70.0d))) {
                int[] iArr = new int[lllIIIIIll[1]];
                iArr[lllIIIIIll[0]] = lllIIIIIll[6];
                if (lIllllIllIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllIIIIIll[1]];
                    iArr2[lllIIIIIll[0]] = lllIIIIIll[6];
                    Inventory.getFirst(iArr2).interact(lllIIIIIlI[lllIIIIIll[7]]);
                }
            }
            if (lIllllIllIIll(Movement.isRunEnabled() ? 1 : 0) && lIllllIllIllI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIllllIllIIIl(an() ? 1 : 0)) {
                int[] iArr3 = new int[lllIIIIIll[1]];
                iArr3[lllIIIIIll[0]] = lllIIIIIll[8];
            }
            if (lIllllIllIIlI(C0018e.j(lllIIIIIll[9]), lllIIIIIll[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllllIllIlll(nearest) && lIllllIllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[10]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lllIIIIIll[5]);
                    "".length();
                }
                if (lIllllIllIlll(nearest) && lIllllIllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[11]];
                    if (lIllllIllIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIIIIll[12]);
                        "".length();
                    }
                    if (lIllllIllIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIllllIllIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIIIIll[10]);
                            "".length();
                        }
                        if (lIllllIllIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIIIIIll[5]);
                            "".length();
                        }
                        int[] iArr4 = new int[lllIIIIIll[11]];
                        iArr4[lllIIIIIll[0]] = lllIIIIIll[13];
                        iArr4[lllIIIIIll[1]] = lllIIIIIll[14];
                        iArr4[lllIIIIIll[5]] = lllIIIIIll[15];
                        iArr4[lllIIIIIll[7]] = lllIIIIIll[16];
                        iArr4[lllIIIIIll[10]] = lllIIIIIll[17];
                        if (lIllllIllIIll(C0018e.c(iArr4) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIIIIIlI[lllIIIIIll[18]]);
                            bt = lllIIIIIll[1];
                            return;
                        }
                        Bank.withdraw(lllIIIIIll[13], lllIIIIIll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIIIIll[1]);
                        "".length();
                        Bank.withdraw(lllIIIIIll[14], lllIIIIIll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIIIIll[1]);
                        "".length();
                        Bank.withdraw(lllIIIIIll[15], lllIIIIIll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIIIIll[1]);
                        "".length();
                        Bank.withdraw(lllIIIIIll[16], lllIIIIIll[11], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIIIIll[1]);
                        "".length();
                        Bank.withdraw(lllIIIIIll[19], lllIIIIIll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIIIIll[1]);
                        "".length();
                        Bank.withdraw(lllIIIIIll[17], lllIIIIIll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIIIIll[1]);
                        "".length();
                        C0000a.b(C0019f.ba, lllIIIIIll[1]);
                        C0000a.a(lllIIIIIll[6], lllIIIIIll[3]);
                        C0000a.b(C0019f.bk, lllIIIIIll[1]);
                    }
                }
            }
            if (lIllllIllIIIl(an() ? 1 : 0) && lIllllIllIIlI(C0018e.j(lllIIIIIll[9]), lllIIIIIll[1])) {
                if (lIllllIlllIII(Players.getLocal().getWorldLocation().distanceTo(mH), lllIIIIIll[5])) {
                    AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[20]];
                    if (lIllllIllIIll(Equipment.contains(C0019f.aW) ? 1 : 0) && lIllllIllIIIl(Inventory.contains(C0019f.aW) ? 1 : 0)) {
                        Inventory.getFirst(C0019f.aW).interact(lllIIIIIlI[lllIIIIIll[21]]);
                        Time.sleepTicks(lllIIIIIll[1]);
                        "".length();
                    }
                    if (lIllllIllIIlI(cG, lllIIIIIll[1])) {
                        C0018e.x();
                        cG += lllIIIIIll[1];
                    }
                    Movement.walkTo(mH);
                    "".length();
                    Time.sleepTicks(lllIIIIIll[1]);
                    "".length();
                }
                if (lIllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(mH), lllIIIIIll[7])) {
                    AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[22]];
                    C0020g.a(lllIIIIIlI[lllIIIIIll[3]], mL);
                }
            }
            if (lIllllIllIlII(C0018e.j(lllIIIIIll[9]), lllIIIIIll[1])) {
                di = lllIIIIIll[0];
                if (lIllllIlllIII(Players.getLocal().getWorldLocation().distanceTo(mI), lllIIIIIll[21])) {
                    AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[23]];
                    Movement.walkTo(mI);
                    "".length();
                    Time.sleepTicks(lllIIIIIll[1]);
                    "".length();
                }
                if (lIllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(mI), lllIIIIIll[21])) {
                    AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[24]];
                    C0020g.a(lllIIIIIlI[lllIIIIIll[25]], mL);
                }
            }
            if (lIllllIllIlII(C0018e.j(lllIIIIIll[9]), lllIIIIIll[5])) {
                String[] strArr = new String[lllIIIIIll[1]];
                strArr[lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[26]];
                if (lIllllIllIIll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIIIIIll[1]];
                    strArr2[lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[27]];
                }
                AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[28]];
                C0020g.a(lllIIIIIlI[lllIIIIIll[29]], mL);
                C0020g.a(mL);
            }
            if (lIllllIllIlII(C0018e.j(lllIIIIIll[9]), lllIIIIIll[5])) {
                String[] strArr3 = new String[lllIIIIIll[1]];
                strArr3[lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[30]];
                if (lIllllIllIIll(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lllIIIIIll[1]];
                    strArr4[lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[31]];
                    if (lIllllIllIIIl(Inventory.contains(strArr4) ? 1 : 0)) {
                        if (lIllllIlllIII(Players.getLocal().getWorldLocation().distanceTo(mJ), lllIIIIIll[5]) && lIllllIlllIII(Players.getLocal().getWorldLocation().distanceTo(mK), lllIIIIIll[3])) {
                            AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[32]];
                            if (lIllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(mI), lllIIIIIll[3]) && lIllllIllIIIl(Equipment.contains(C0019f.aW) ? 1 : 0) && lIllllIlllIlI(Players.getLocal().getAnimation(), lllIIIIIll[33])) {
                                Equipment.getFirst(C0019f.aW).interact(lllIIIIIlI[lllIIIIIll[34]]);
                                Time.sleepTicks(lllIIIIIll[7]);
                                "".length();
                            }
                            Movement.walkTo(mJ);
                            "".length();
                            Time.sleepTicks(lllIIIIIll[1]);
                            "".length();
                        }
                        if (lIllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(mJ), lllIIIIIll[10])) {
                            AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[35]];
                            String[] strArr5 = new String[lllIIIIIll[1]];
                            strArr5[lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[36]];
                            TileObjects.getNearest(strArr5).interact(lllIIIIIlI[lllIIIIIll[37]]);
                            Time.sleepTicks(lllIIIIIll[7]);
                            "".length();
                        }
                        if (lIllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(mK), lllIIIIIll[3])) {
                            String[] strArr6 = new String[lllIIIIIll[1]];
                            strArr6[lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[38]];
                            if (lIllllIlllIll(NPCs.getNearest(strArr6))) {
                                AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[39]];
                                if (lIllllIllIIlI(di, lllIIIIIll[1])) {
                                    aN.sP += lllIIIIIll[1];
                                    aN.u(AccBuilderSotf.m);
                                    di += lllIIIIIll[1];
                                    aN.sP = lllIIIIIll[0];
                                    dj = lllIIIIIll[0];
                                }
                                String[] strArr7 = new String[lllIIIIIll[1]];
                                strArr7[lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[40]];
                                TileObjects.getNearest(strArr7).interact(lllIIIIIlI[lllIIIIIll[41]]);
                                Time.sleepTicks(lllIIIIIll[10]);
                                "".length();
                            }
                            String[] strArr8 = new String[lllIIIIIll[1]];
                            strArr8[lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[42]];
                            NPC nearest2 = NPCs.getNearest(strArr8);
                            if (lIllllIllIlll(nearest2)) {
                                AccBuilderSotf.c = lllIIIIIlI[lllIIIIIll[43]];
                                int[] iArr5 = new int[lllIIIIIll[1]];
                                iArr5[lllIIIIIll[0]] = lllIIIIIll[17];
                                if (lIllllIllIIll(Equipment.contains(iArr5) ? 1 : 0)) {
                                    int[] iArr6 = new int[lllIIIIIll[1]];
                                    iArr6[lllIIIIIll[0]] = lllIIIIIll[17];
                                    if (lIllllIllIIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                                        int[] iArr7 = new int[lllIIIIIll[1]];
                                        iArr7[lllIIIIIll[0]] = lllIIIIIll[17];
                                        Inventory.getFirst(iArr7).interact(lllIIIIIlI[lllIIIIIll[44]]);
                                        Time.sleepTicks(lllIIIIIll[1]);
                                        "".length();
                                    }
                                }
                                if (lIllllIlllIll(Players.getLocal().getInteracting()) && lIllllIllIIll(nearest2.isDead() ? 1 : 0)) {
                                    nearest2.interact(lllIIIIIlI[lllIIIIIll[45]]);
                                    Time.sleepTicks(lllIIIIIll[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
            }
            if (lIllllIllIlII(C0018e.j(lllIIIIIll[9]), lllIIIIIll[7]) && lIllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(mK), lllIIIIIll[3])) {
                int[] iArr8 = new int[lllIIIIIll[1]];
                iArr8[lllIIIIIll[0]] = lllIIIIIll[16];
                if (lIllllIllIIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lllIIIIIll[1]];
                    iArr9[lllIIIIIll[0]] = lllIIIIIll[16];
                    Inventory.getFirst(iArr9).interact(lllIIIIIlI[lllIIIIIll[46]]);
                    Time.sleepTicks(lllIIIIIll[5]);
                    "".length();
                }
            }
            C0020g.a(new String[lllIIIIIll[0]]);
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lllIIIIIlI[lllIIIIIll[60]];
    }

    private static boolean lIllllIllllII(int i, int i2) {
        return i >= i2;
    }

    private static String lIllllIlIllII(String lllllllllllllllllIllllIlIllIIIII, String lllllllllllllllllIllllIlIlIlllll) {
        String lllllllllllllllllIllllIlIllIIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllllIllllIlIllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIllllIlIlIlllIl = lllllllllllllllllIllllIlIlIlllll.toCharArray();
        int lllllllllllllllllIllllIlIlIlllII = lllIIIIIll[0];
        char[] charArray = lllllllllllllllllIllllIlIllIIIII2.toCharArray();
        int length = charArray.length;
        int i = lllIIIIIll[0];
        while (lIllllIllIIlI(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllllIllllIlIlIlllIl[lllllllllllllllllIllllIlIlIlllII % lllllllllllllllllIllllIlIlIlllIl.length]));
            "".length();
            lllllllllllllllllIllllIlIlIlllII++;
            i++;
            "".length();
            if ((((80 ^ 87) ^ (23 ^ 1)) & (((97 ^ 32) ^ (52 ^ 100)) ^ (-" ".length()))) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static int lIllllIllIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIllllIllIllI(int i) {
        return i > 0;
    }

    private static String lIllllIlIlIll(String lllllllllllllllllIllllIlIlllIIII, String lllllllllllllllllIllllIlIllIllll) {
        try {
            SecretKeySpec lllllllllllllllllIllllIlIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIlIllIllll.getBytes(StandardCharsets.UTF_8)), lllIIIIIll[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIIll[5], lllllllllllllllllIllllIlIlllIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIlIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllllIlIlllIIIl) {
            lllllllllllllllllIllllIlIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIllIIll(int i) {
        return i == 0;
    }

    private static void lIllllIlIllll() {
        lllIIIIIll = new int[74];
        lllIIIIIll[0] = (219 ^ 144) & ((56 ^ 115) ^ (-1));
        lllIIIIIll[1] = " ".length();
        lllIIIIIll[2] = (((170 + 205) - 345) + 196) ^ (((100 + 143) - 216) + 136);
        lllIIIIIll[3] = (45 ^ 114) ^ (219 ^ 142);
        lllIIIIIll[4] = 215 ^ 145;
        lllIIIIIll[5] = "  ".length();
        lllIIIIIll[6] = (-((-17539) & 19587)) & (-9733) & 12159;
        lllIIIIIll[7] = "   ".length();
        lllIIIIIll[8] = (-((-13155) & 31611)) & (-9221) & 28671;
        lllIIIIIll[9] = ((136 + 67) - 69) + 44;
        lllIIIIIll[10] = (((144 + 48) - 133) + 89) ^ (((3 + 131) - 41) + 51);
        lllIIIIIll[11] = 162 ^ 167;
        lllIIIIIll[12] = (-19540) & 24539;
        lllIIIIIll[13] = (-((-20945) & 22995)) & (-28801) & 32767;
        lllIIIIIll[14] = (-18833) & 20382;
        lllIIIIIll[15] = (-((-6539) & 15311)) & (-20625) & 31743;
        lllIIIIIll[16] = (-16417) & 24423;
        lllIIIIIll[17] = (-14915) & 16247;
        lllIIIIIll[18] = (100 ^ 25) ^ (213 ^ 174);
        lllIIIIIll[19] = (-((-2607) & 19007)) & (-4385) & 32762;
        lllIIIIIll[20] = 118 ^ 113;
        lllIIIIIll[21] = (((14 + 75) - 78) + 147) ^ (((32 + 92) - 45) + 71);
        lllIIIIIll[22] = 163 ^ 170;
        lllIIIIIll[23] = 151 ^ 156;
        lllIIIIIll[24] = 19 ^ 31;
        lllIIIIIll[25] = (((31 + 19) - 49) + 131) ^ (((96 + 43) - 36) + 34);
        lllIIIIIll[26] = 91 ^ 85;
        lllIIIIIll[27] = 25 ^ 22;
        lllIIIIIll[28] = (((56 + 43) - 90) + 120) ^ (((21 + 6) - (-38)) + 80);
        lllIIIIIll[29] = " ".length() ^ (3 ^ 19);
        lllIIIIIll[30] = 171 ^ 185;
        lllIIIIIll[31] = 108 ^ 127;
        lllIIIIIll[32] = 47 ^ 59;
        lllIIIIIll[33] = (-((-18987) & 20031)) & (-2338) & 4095;
        lllIIIIIll[34] = (((52 + 122) - 57) + 94) ^ (((2 + 54) - (-8)) + 134);
        lllIIIIIll[35] = 57 ^ 47;
        lllIIIIIll[36] = (131 ^ 183) ^ (89 ^ 122);
        lllIIIIIll[37] = "   ".length() ^ (106 ^ 113);
        lllIIIIIll[38] = 94 ^ 71;
        lllIIIIIll[39] = (129 ^ 185) ^ (99 ^ 65);
        lllIIIIIll[40] = (33 ^ 124) ^ (94 ^ 24);
        lllIIIIIll[41] = (((131 + 83) - 135) + 102) ^ (((62 + 114) - 71) + 64);
        lllIIIIIll[42] = 184 ^ 165;
        lllIIIIIll[43] = (((49 + 1) - (-39)) + 59) ^ (((6 + 57) - 13) + 88);
        lllIIIIIll[44] = 188 ^ 163;
        lllIIIIIll[45] = (((83 + 94) - 124) + 81) ^ (((93 + 38) - 18) + 53);
        lllIIIIIll[46] = (((9 + 110) - 16) + 53) ^ (((51 + 176) - 178) + 140);
        lllIIIIIll[47] = (66 ^ 103) ^ (13 ^ 10);
        lllIIIIIll[48] = (183 ^ 146) ^ (8 ^ 14);
        lllIIIIIll[49] = (((126 + 125) - 131) + 32) ^ (((161 + 163) - 288) + 152);
        lllIIIIIll[50] = (-((-12422) & 30967)) & (-131) & 24575;
        lllIIIIIll[51] = (-6660) & 32559;
        lllIIIIIll[52] = (-129) & 16028;
        lllIIIIIll[53] = 149 ^ 189;
        lllIIIIIll[54] = (-((-289) & 10018)) & (-6251) & 16379;
        lllIIIIIll[55] = (-((-7170) & 23861)) & (-4097) & 32767;
        lllIIIIIll[56] = (-((-13185) & 16279)) & (-4097) & 32190;
        lllIIIIIll[57] = (-((-9569) & 32228)) & (-17) & 24575;
        lllIIIIIll[58] = (-19591) & 32215;
        lllIIIIIll[59] = (88 ^ 105) ^ (76 ^ 25);
        lllIIIIIll[60] = (((176 + 30) - 188) + 165) ^ (((127 + 65) - 99) + 53);
        lllIIIIIll[61] = (16 ^ 76) ^ (80 ^ 42);
        lllIIIIIll[62] = (-16966) & 20063;
        lllIIIIIll[63] = (-((-2631) & 15191)) & (-16907) & 32734;
        lllIIIIIll[64] = (-((-3153) & 28537)) & (-4097) & 32703;
        lllIIIIIll[65] = (-((-3075) & 11835)) & (-16389) & 28543;
        lllIIIIIll[66] = (-((-26793) & 31660)) & (-81) & 8063;
        lllIIIIIll[67] = (-((-18699) & 31723)) & (-16388) & 32767;
        lllIIIIIll[68] = (-((-8707) & 25275)) & (-8195) & 27839;
        lllIIIIIll[69] = (-((-16399) & 18911)) & (-20481) & 32763;
        lllIIIIIll[70] = (((161 + 153) - 214) + 83) ^ (((69 + 71) - 74) + 78);
        lllIIIIIll[71] = 32 ^ 9;
        lllIIIIIll[72] = (19 ^ 11) ^ (94 ^ 108);
        lllIIIIIll[73] = (181 ^ 177) ^ (147 ^ 188);
    }

    private static boolean lIllllIlllIlI(int i, int i2) {
        return i != i2;
    }

    static {
        lIllllIlIllll();
        lIllllIlIlllI();
        mH = new WorldPoint(lllIIIIIll[62], lllIIIIIll[63], lllIIIIIll[0]);
        mI = new WorldPoint(lllIIIIIll[64], lllIIIIIll[65], lllIIIIIll[0]);
        mJ = new WorldPoint(lllIIIIIll[66], lllIIIIIll[67], lllIIIIIll[0]);
        mK = new WorldPoint(lllIIIIIll[68], lllIIIIIll[69], lllIIIIIll[0]);
        String[] strArr = new String[lllIIIIIll[10]];
        strArr[lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[70]];
        strArr[lllIIIIIll[1]] = lllIIIIIlI[lllIIIIIll[53]];
        strArr[lllIIIIIll[5]] = lllIIIIIlI[lllIIIIIll[71]];
        strArr[lllIIIIIll[7]] = lllIIIIIlI[lllIIIIIll[72]];
        mL = strArr;
        bv = new ArrayList();
        cG = lllIIIIIll[0];
    }

    private static boolean lIllllIllIlll(Object obj) {
        return obj != null;
    }

    private static void Q() {
        int[] iArr = new int[lllIIIIIll[1]];
        iArr[lllIIIIIll[0]] = lllIIIIIll[13];
        if (lIllllIllIIll(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIll[13], lllIIIIIll[1], lllIIIIIll[50]));
            "".length();
        }
        int[] iArr2 = new int[lllIIIIIll[1]];
        iArr2[lllIIIIIll[0]] = lllIIIIIll[15];
        if (lIllllIllIIll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIll[15], lllIIIIIll[1], lllIIIIIll[50]));
            "".length();
        }
        int[] iArr3 = new int[lllIIIIIll[1]];
        iArr3[lllIIIIIll[0]] = lllIIIIIll[17];
        if (lIllllIllIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIll[17], lllIIIIIll[1], lllIIIIIll[51]));
            "".length();
        }
        int[] iArr4 = new int[lllIIIIIll[1]];
        iArr4[lllIIIIIll[0]] = lllIIIIIll[14];
        if (lIllllIllIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIll[14], lllIIIIIll[1], lllIIIIIll[50]));
            "".length();
        }
        int[] iArr5 = new int[lllIIIIIll[1]];
        iArr5[lllIIIIIll[0]] = lllIIIIIll[19];
        if (lIllllIllIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIll[19], lllIIIIIll[1], lllIIIIIll[52]));
            "".length();
        }
        int[] iArr6 = new int[lllIIIIIll[1]];
        iArr6[lllIIIIIll[0]] = lllIIIIIll[6];
        if (lIllllIllIIll(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIll[6], lllIIIIIll[3], lllIIIIIll[50]));
            "".length();
        }
        int[] iArr7 = new int[lllIIIIIll[1]];
        iArr7[lllIIIIIll[0]] = lllIIIIIll[6];
        if (lIllllIllIIIl(Bank.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lllIIIIIll[1]];
            iArr8[lllIIIIIll[0]] = lllIIIIIll[6];
            if (lIllllIllIIlI(Bank.getFirst(iArr8).getQuantity(), lllIIIIIll[32])) {
                bv.add(new C0017d(lllIIIIIll[6], lllIIIIIll[53], lllIIIIIll[54]));
                "".length();
            }
        }
        if (lIllllIllIIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIIIIIlI[lllIIIIIll[61]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIll[55], lllIIIIIll[11], lllIIIIIll[56]));
            "".length();
        }
        int[] iArr9 = new int[lllIIIIIll[1]];
        iArr9[lllIIIIIll[0]] = lllIIIIIll[16];
        if (lIllllIllIIll(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIll[16], lllIIIIIll[53], lllIIIIIll[57]));
            "".length();
        }
        int[] iArr10 = new int[lllIIIIIll[1]];
        iArr10[lllIIIIIll[0]] = lllIIIIIll[58];
        if (lIllllIllIIll(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIll[58], lllIIIIIll[11], C0023j.cf));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lllIIIIIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[lllIIIIIll[1]];
        strArr[lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[47]];
        if (lIllllIllIIIl(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lllIIIIIll[1]];
            strArr2[lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[48]];
            if (lIllllIllIIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lllIIIIIll[1]];
                strArr3[lllIIIIIll[0]] = lllIIIIIlI[lllIIIIIll[49]];
                if (lIllllIllIIIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    ?? r0 = lllIIIIIll[1];
                    "".length();
                    return 0 != 0 ? ((225 ^ 162) ^ (205 ^ 180)) & (((((113 + 137) - 135) + 71) ^ (((67 + 118) - 89) + 32)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lllIIIIIll[0];
    }

    private static boolean lIllllIllIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllllIlllIIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllllIlllIll(Object obj) {
        return obj == null;
    }

    private static String lIllllIlIllIl(String lllllllllllllllllIllllIlIlllllIl, String lllllllllllllllllIllllIlIlllllII) {
        try {
            SecretKeySpec lllllllllllllllllIllllIllIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIlIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllllIlIlllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllllIlIlllllll.init(lllIIIIIll[5], lllllllllllllllllIllllIllIIIIIII);
            return new String(lllllllllllllllllIllllIlIlllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIlIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllllIlIllllllI) {
            lllllllllllllllllIllllIlIllllllI.printStackTrace();
            return null;
        }
    }

    private static void lIllllIlIlllI() {
        lllIIIIIlI = new String[lllIIIIIll[73]];
        lllIIIIIlI[lllIIIIIll[0]] = lIllllIlIlIll("g67tGroIFQW0cqWwnP5EZg==", "DnxJe");
        lllIIIIIlI[lllIIIIIll[1]] = lIllllIlIllII("MwAJAwIdDANKEwAQDgQWVQATDxwGRUcZBhwdBAIYGw5HCBAWAkceHlUYEg8CAQ==", "uigjq");
        lllIIIIIlI[lllIIIIIll[5]] = lIllllIlIllIl("eNCtBGHG9ps=", "WHEYY");
        lllIIIIIlI[lllIIIIIll[7]] = lIllllIlIllIl("0T5r1mfoao8=", "gqTqC");
        lllIIIIIlI[lllIIIIIll[10]] = lIllllIlIllIl("wbiTIy55lD34pmq+w0+E6g==", "HZnzO");
        lllIIIIIlI[lllIIIIIll[11]] = lIllllIlIllIl("dcHxTyOzR/544U1VU0x1mRJWmV4V/kC9", "AQNSj");
        lllIIIIIlI[lllIIIIIll[18]] = lIllllIlIllII("GiJPNyUoZwI/JD4uATF3PDIKJSNtNBomJyEuCiV7bTQYPyMuLwY4MG0zAHYVGB4mGBA=", "MGoVW");
        lllIIIIIlI[lllIIIIIll[20]] = lIllllIlIllII("Ci4YbSIrbx05NzY7", "DOnMV");
        lllIIIIIlI[lllIIIIIll[21]] = lIllllIlIllII("GREIMw==", "NtiAT");
        lllIIIIIlI[lllIIIIIll[22]] = lIllllIlIllIl("qfhkr05KZUOfG2Z9ZoZN5Q==", "PAigq");
        lllIIIIIlI[lllIIIIIll[3]] = lIllllIlIllII("KhsDFSAJ", "gtqrA");
        lllIIIIIlI[lllIIIIIll[23]] = lIllllIlIlIll("MJIyX33Nhxy0Ted0hm60hg==", "BndUn");
        lllIIIIIlI[lllIIIIIll[24]] = lIllllIlIllIl("Da7tvMXyfHj+KggtEXoNXQ==", "mCReH");
        lllIIIIIlI[lllIIIIIll[25]] = lIllllIlIlIll("wHVz1F7dNjoZNxnZldUEvQ==", "vfHhN");
        lllIIIIIlI[lllIIIIIll[26]] = lIllllIlIllII("CyIQGg==", "IGuhm");
        lllIIIIIlI[lllIIIIIll[27]] = lIllllIlIlIll("c2Lbx9sfBsI=", "pSJOt");
        lllIIIIIlI[lllIIIIIll[28]] = lIllllIlIllII("GTMfHEI5PVMTEDg8GA==", "MRswb");
        lllIIIIIlI[lllIIIIIll[29]] = lIllllIlIllII("ETB5GSYnLjYm", "UBYQG");
        lllIIIIIlI[lllIIIIIll[30]] = lIllllIlIlIll("EenfdZQD9ww=", "rDKDH");
        lllIIIIIlI[lllIIIIIll[31]] = lIllllIlIllIl("+TIZoD2EhsI=", "EKzrS");
        lllIIIIIlI[lllIIIIIll[32]] = lIllllIlIllII("DAQUVAwtRREAGSsXEQ==", "Bebtx");
        lllIIIIIlI[lllIIIIIll[34]] = lIllllIlIllII("BSIVLTQuIlQCMy08FTM/", "APtTZ");
        lllIIIIIlI[lllIIIIIll[35]] = lIllllIlIllIl("yBaGzNNkBTKrN9kiD4/L53QaEv9L1tzw", "wbMLB");
        lllIIIIIlI[lllIIIIIll[36]] = lIllllIlIllII("KQQ0MzMJ", "zpUZA");
        lllIIIIIlI[lllIIIIIll[37]] = lIllllIlIllIl("wy/FRjJ9BgBGJ8+62u4XJg==", "WwYMU");
        lllIIIIIlI[lllIIIIIll[38]] = lIllllIlIllII("MAoGARdTIQEOGh0KAQ==", "sesoc");
        lllIIIIIlI[lllIIIIIll[39]] = lIllllIlIllII("HyUKEQYlPwxDFCU2Axc=", "LQkcr");
        lllIIIIIlI[lllIIIIIll[40]] = lIllllIlIlIll("dzVbwl7SfG8=", "XzdBR");
        lllIIIIIlI[lllIIIIIll[41]] = lIllllIlIllIl("B6SdwQDz3R8=", "IIGGT");
        lllIIIIIlI[lllIIIIIll[42]] = lIllllIlIllII("JBsDBy5HMAQIIwkbBA==", "gtviZ");
        lllIIIIIlI[lllIIIIIll[43]] = lIllllIlIllII("JCMlGCALJCU=", "bJBpT");
        lllIIIIIlI[lllIIIIIll[44]] = lIllllIlIllIl("4I76kUbUIjw=", "TBqOu");
        lllIIIIIlI[lllIIIIIll[45]] = lIllllIlIlIll("TM2psdUhgu4=", "aXWrT");
        lllIIIIIlI[lllIIIIIll[46]] = lIllllIlIlIll("f6r+jEXWeP0=", "ISwPp");
        lllIIIIIlI[lllIIIIIll[47]] = lIllllIlIllIl("AfMDMsQ9EK4=", "sgqGC");
        lllIIIIIlI[lllIIIIIll[48]] = lIllllIlIllII("EjYoACQ2", "UWZlM");
        lllIIIIIlI[lllIIIIIll[49]] = lIllllIlIlIll("5RaerC8fE2Y=", "NdAsv");
        lllIIIIIlI[lllIIIIIll[60]] = lIllllIlIlIll("8U7OfYrO2voBNI8zhGPMj4RgmUqZm1Fj", "cuTth");
        lllIIIIIlI[lllIIIIIll[61]] = lIllllIlIllIl("1mcIPvdvi097aG8gVwOjtGc9NbNXdgXt", "baWft");
        lllIIIIIlI[lllIIIIIll[70]] = lIllllIlIlIll("nVnIrqPRPuCNG1EHc1WBzQMb69JO6M4JkYr4aIfjmh0=", "ySBLs");
        lllIIIIIlI[lllIIIIIll[53]] = lIllllIlIlIll("BcMvLeNi+56hXQpc80DIYGE8WcVfuWR6LpU1VRHjTY7Zb81Q3LgBlQ==", "dKfep");
        lllIIIIIlI[lllIIIIIll[71]] = lIllllIlIllIl("m85Z1b7iL/4N+enpOToe7e2gKvjDvoF+", "btLAN");
        lllIIIIIlI[lllIIIIIll[72]] = lIllllIlIllIl("lT8V4xnzAV8=", "gBBVt");
    }

    private static boolean lIllllIllIIIl(int i) {
        return i != 0;
    }

    private static boolean lIllllIllIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllllIllIlIl(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllllIllllII(C0018e.j(lllIIIIIll[9]), lllIIIIIll[7]) && lIllllIlllIII(Players.getLocal().getWorldLocation().distanceTo(mK), lllIIIIIll[43])) {
            ?? r0 = lllIIIIIll[1];
            "".length();
            return (-(86 ^ 82)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIIIIll[0];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            ev();
            "".length();
            if (" ".length() >= "  ".length()) {
                return ((((53 + 159) - 174) + 136) ^ (((123 + 32) - 25) + 32)) & (((62 ^ 17) ^ (65 ^ 98)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lllIIIIIll[59];
    }
}
