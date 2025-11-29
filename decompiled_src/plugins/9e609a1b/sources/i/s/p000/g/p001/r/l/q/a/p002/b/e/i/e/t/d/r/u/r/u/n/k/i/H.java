package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
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
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.H  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/H.class */
public class H implements M {
    static /* synthetic */ int bY;
    private static /* synthetic */ int[] lIIIlllIIIlIl;
    static /* synthetic */ int co;
    public static /* synthetic */ boolean by;
    static /* synthetic */ boolean cp;
    public static /* synthetic */ List<C0003d> bA;
    public static /* synthetic */ int hr;
    static /* synthetic */ String[] bW;
    public static /* synthetic */ WorldPoint hs;
    private static /* synthetic */ String[] lIIIlllIIIIll;

    private static void lIlIIIlllIlIlII() {
        lIIIlllIIIlIl = new int[38];
        lIIIlllIIIlIl[0] = (118 ^ 55) & ((126 ^ 63) ^ (-1));
        lIIIlllIIIlIl[1] = " ".length();
        lIIIlllIIIlIl[2] = 25 ^ 43;
        lIIIlllIIIlIl[3] = "  ".length();
        lIIIlllIIIlIl[4] = (((((127 + 145) - 228) + 112) + (181 ^ 160)) - (((123 + 54) - 117) + 111)) + ((0 + 15) - 6) + 164;
        lIIIlllIIIlIl[5] = "   ".length();
        lIIIlllIIIlIl[6] = 86 ^ 82;
        lIIIlllIIIlIl[7] = (-((-13202) & 16371)) & (-16391) & 24559;
        lIIIlllIIIlIl[8] = 87 ^ 82;
        lIIIlllIIIlIl[9] = (-((-29625) & 31673)) & (-16417) & 20223;
        lIIIlllIIIlIl[10] = (137 ^ 179) ^ (70 ^ 104);
        lIIIlllIIIlIl[11] = (189 ^ 175) ^ (22 ^ 2);
        lIIIlllIIIlIl[12] = (-16433) & 24440;
        lIIIlllIIIlIl[13] = (-((-13445) & 29869)) & (-1) & 24431;
        lIIIlllIIIlIl[14] = 102 ^ 97;
        lIIIlllIIIlIl[15] = (-((-2115) & 26743)) & (-131) & 32767;
        lIIIlllIIIlIl[16] = (173 ^ 197) ^ (0 ^ 96);
        lIIIlllIIIlIl[17] = (((195 + 204) - 260) + 67) ^ (((121 + 152) - 227) + 153);
        lIIIlllIIIlIl[18] = 85 ^ 95;
        lIIIlllIIIlIl[19] = 140 ^ 135;
        lIIIlllIIIlIl[20] = (((46 + 52) - 55) + 91) ^ (((37 + 118) - 96) + 79);
        lIIIlllIIIlIl[21] = (-((-801) & 5989)) & (-3) & 8190;
        lIIIlllIIIlIl[22] = (((0 + 25) - (-133)) + 10) ^ (((4 + 100) - 66) + 127);
        lIIIlllIIIlIl[23] = 137 ^ 135;
        lIIIlllIIIlIl[24] = 76 ^ 67;
        lIIIlllIIIlIl[25] = (-((-16460) & 26847)) & (-16385) & 28671;
        lIIIlllIIIlIl[26] = (-((-19430) & 23543)) & (-257) & 16349;
        lIIIlllIIIlIl[27] = (-2643) & 27642;
        lIIIlllIIIlIl[28] = 170 ^ 130;
        lIIIlllIIIlIl[29] = (-((-8465) & 28093)) & (-1) & 32253;
        lIIIlllIIIlIl[30] = (((107 + 135) - 71) + 43) ^ (((161 + 69) - 101) + 49);
        lIIIlllIIIlIl[31] = (((122 + 156) - 156) + 52) ^ (((153 + 140) - 246) + 143);
        lIIIlllIIIlIl[32] = (38 ^ 119) ^ (114 ^ 54);
        lIIIlllIIIlIl[33] = (37 ^ 88) ^ (192 ^ 172);
        lIIIlllIIIlIl[34] = (-((-2209) & 31659)) & (-1) & 32639;
        lIIIlllIIIlIl[35] = (-8248) & 11519;
        lIIIlllIIIlIl[36] = 161 ^ 179;
        lIIIlllIIIlIl[37] = 133 ^ 150;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            cr();
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return (13 ^ 2) & ((43 ^ 36) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIlllIIIlIl[30];
    }

    private static boolean lIlIIIlllIlIllI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIIlllIllIIl(int i2) {
        return i2 > 0;
    }

    private static void lIlIIIlllIlIIII() {
        lIIIlllIIIIll = new String[lIIIlllIIIlIl[32]];
        lIIIlllIIIIll[lIIIlllIIIlIl[0]] = lIlIIIlllIIllIl("haXyTn+FHUSkYqoONyCMog==", "AQLVc");
        lIIIlllIIIIll[lIIIlllIIIlIl[1]] = lIlIIIlllIIlllI("Ag04AR0sATJIDDEdPwYJZA0iDQM3SHYbGS0QNQAHKgN2Cg8nD3YcAWQVIw0dMA04Dw==", "DdVhn");
        lIIIlllIIIIll[lIIIlllIIIlIl[3]] = lIlIIIlllIIllIl("QEDR7QSXBuQ=", "sWmfy");
        lIIIlllIIIIll[lIIIlllIIIlIl[5]] = lIlIIIlllIIlllI("PjsmCAwRLjkPDFAuP0EJETQ7", "pZPak");
        lIIIlllIIIIll[lIIIlllIIIlIl[6]] = lIlIIIlllIIllIl("cbqvQlkeC2QlM5+vdFqNIQ==", "KSIUJ");
        lIIIlllIIIIll[lIIIlllIIIlIl[8]] = lIlIIIlllIIllll("KBf9suEgSNApbrO+r9yfZPlhaouru7m3", "foEwE");
        lIIIlllIIIIll[lIIIlllIIIlIl[11]] = lIlIIIlllIIlllI("DQ1kCj0/SCkCPCkBKgxvKR00GyMzDTdHbykfLR8sMgEqDG8uB2QpGgMhCiw=", "ZhDkO");
        lIIIlllIIIIll[lIIIlllIIIlIl[14]] = lIlIIIlllIIlllI("LiFVAxwcZBgLHQotGwVOCjEFEgIQIQZOTgozHBYNES0bBU4NK1UgOyANOyU=", "yDubn");
        lIIIlllIIIIll[lIIIlllIIIlIl[16]] = lIlIIIlllIIlllI("BQsEcBMkSgEkBjke", "KjrPg");
        lIIIlllIIIIll[lIIIlllIIIlIl[17]] = lIlIIIlllIIlllI("Mj4XA0YAJBdHIBU+HwIU", "tLrgf");
        lIIIlllIIIIll[lIIIlllIIIlIl[18]] = lIlIIIlllIIllIl("CQYLEMlFMYIYDdNnduf+Mg==", "XSfeF");
        lIIIlllIIIIll[lIIIlllIIIlIl[19]] = lIlIIIlllIIllIl("tYDhg3urWGOvBGQOFgDaiA==", "yXlqJ");
        lIIIlllIIIIll[lIIIlllIIIlIl[20]] = lIlIIIlllIIllll("amB5v6ny9sE=", "RZVmz");
        lIIIlllIIIIll[lIIIlllIIIlIl[22]] = lIlIIIlllIIllIl("4JKiwDl18jX5nC1fQK8XKBU6H+e8FyGFgF2A/zJHe3Q=", "Djyvc");
        lIIIlllIIIIll[lIIIlllIIIlIl[23]] = lIlIIIlllIIllIl("3AnnE90Of1D1OT+EEhSDj5Kw5UFe8eas9dQrPZ/XKAU=", "VsRoZ");
        lIIIlllIIIIll[lIIIlllIIIlIl[24]] = lIlIIIlllIIlllI("Az8Cbw==", "ZZqAQ");
        lIIIlllIIIIll[lIIIlllIIIlIl[31]] = lIlIIIlllIIllll("NPeUKnLBMHrLqBv1oeffl/oLkZHM+dE5", "iDxuk");
        lIIIlllIIIIll[lIIIlllIIIlIl[33]] = lIlIIIlllIIllll("0tHs5KQxUCOt1vCrWhiIq6353+1yzuDR", "iHJgp");
        lIIIlllIIIIll[lIIIlllIIIlIl[36]] = lIlIIIlllIIllIl("Ojr8HTtJACi/po8RXmYJXyPS83XHqiUjpCiCzMz14EM=", "ZNmTz");
        lIIIlllIIIIll[lIIIlllIIIlIl[37]] = lIlIIIlllIIllll("UzHD0wv2YjYOjrT3bMWVbr7crnoGnaZ8vxcxjwlZ4Sk=", "MkiCn");
        lIIIlllIIIIll[lIIIlllIIIlIl[10]] = lIlIIIlllIIlllI("PCE5Sw==", "eDJeC");
    }

    private static boolean lIlIIIlllIllIlI(int i2, int i3) {
        return i2 > i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlIIIlllIlIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.H.lIIIlllIIIlIl[10]) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void W() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = new int[lIIIlllIIIlIl[1]];
        iArr3[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
        if (lIlIIIlllIlIlIl(Bank.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lIIIlllIIIlIl[1]];
            iArr4[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
            if (lIlIIIlllIlIlIl(Bank.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lIIIlllIIIlIl[1]];
                iArr5[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
            }
            iArr = new int[lIIIlllIIIlIl[1]];
            iArr[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[12];
            if (lIlIIIlllIlIlll(Bank.contains(iArr) ? 1 : 0)) {
                bA.add(new C0003d(lIIIlllIIIlIl[12], lIIIlllIIIlIl[18], lIIIlllIIIlIl[25]));
                "".length();
            }
            if (lIlIIIlllIlIlll(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIIlllIIIIll[lIIIlllIIIlIl[33]]);
            }) ? 1 : 0)) {
                bA.add(new C0003d(lIIIlllIIIlIl[26], lIIIlllIIIlIl[8], lIIIlllIIIlIl[27]));
                "".length();
            }
            iArr2 = new int[lIIIlllIIIlIl[1]];
            iArr2[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[13];
            if (lIlIIIlllIlIlll(Bank.contains(iArr2) ? 1 : 0)) {
                bA.add(new C0003d(lIIIlllIIIlIl[13], lIIIlllIIIlIl[28], lIIIlllIIIlIl[25]));
                "".length();
            }
            if (lIlIIIlllIlIlll(Bank.contains(C0005f.ba) ? 1 : 0)) {
                return;
            }
            bA.add(new C0003d(lIIIlllIIIlIl[29], lIIIlllIIIlIl[8], C0007h.bv));
            "".length();
            return;
        }
        bA.add(new C0003d(lIIIlllIIIlIl[9], lIIIlllIIIlIl[10], lIIIlllIIIlIl[25]));
        "".length();
        iArr = new int[lIIIlllIIIlIl[1]];
        iArr[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[12];
        if (lIlIIIlllIlIlll(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (lIlIIIlllIlIlll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIIlllIIIIll[lIIIlllIIIlIl[33]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[lIIIlllIIIlIl[1]];
        iArr2[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[13];
        if (lIlIIIlllIlIlll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        if (lIlIIIlllIlIlll(Bank.contains(C0005f.ba) ? 1 : 0)) {
        }
    }

    private static boolean lIlIIIlllIlllII(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIlIIIlllIllIll(int i2, int i3) {
        return i2 <= i3;
    }

    private static String lIlIIIlllIIllIl(String lllllllllllllllIIIIIllIlIllIlIlI, String lllllllllllllllIIIIIllIlIllIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIllIlIllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIllIlIllIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIllIlIllIllII.init(lIIIlllIIIlIl[3], lllllllllllllllIIIIIllIlIllIllIl);
            return new String(lllllllllllllllIIIIIllIlIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIlIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIllIlIllIlIll) {
            lllllllllllllllIIIIIllIlIllIlIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v141, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v176, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    public static void cr() {
        if (lIlIIIlllIlIlIl(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIIIIll[lIIIlllIIIlIl[0]];
            C0001b.a(bA);
            if (lIlIIIlllIlIllI(bA.size(), lIIIlllIIIlIl[1])) {
                System.out.println(lIIIlllIIIIll[lIIIlllIIIlIl[1]]);
                by = lIIIlllIIIlIl[0];
            }
        }
        if (lIlIIIlllIlIlll(by ? 1 : 0)) {
            if (lIlIIIlllIlIlIl(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIIlllIlIllI(Movement.getRunEnergy(), lIIIlllIIIlIl[2]) && lIlIIIlllIlIlll(Dialog.isOpen() ? 1 : 0)) {
                Inventory.getFirst(C0005f.ba).interact(lIIIlllIIIIll[lIIIlllIIIlIl[3]]);
                Time.sleepTicks(lIIIlllIIIlIl[1]);
                "".length();
            }
            if (lIlIIIlllIlIllI(C0004e.j(lIIIlllIIIlIl[4]), lIIIlllIIIlIl[1])) {
                if (lIlIIIlllIlIlll(aJ() ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIlIIIlllIllIII(nearest) && lIlIIIlllIlIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIIIIll[lIIIlllIIIlIl[5]];
                        C0000a.a(nearest);
                    }
                    if (lIlIIIlllIllIII(nearest) && lIlIIIlllIlIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIlIIIlllIlIlll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRat.c = lIIIlllIIIIll[lIIIlllIIIlIl[6]];
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIIIlllIIIlIl[7]);
                            "".length();
                        }
                        if (lIlIIIlllIlIlIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRat.c = lIIIlllIIIIll[lIIIlllIIIlIl[8]];
                            if (lIlIIIlllIllIIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIIIlllIIIlIl[5]);
                                "".length();
                            }
                            if (lIlIIIlllIllIIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIIIlllIIIlIl[3]);
                                "".length();
                            }
                            int[] iArr = new int[lIIIlllIIIlIl[1]];
                            iArr[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
                            if (lIlIIIlllIlIlIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIIlllIIIlIl[1]];
                                iArr2[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
                                if (lIlIIIlllIlIllI(Bank.getFirst(iArr2).getQuantity(), lIIIlllIIIlIl[10])) {
                                    W();
                                    System.out.println(lIIIlllIIIIll[lIIIlllIIIlIl[11]]);
                                    by = lIIIlllIIIlIl[1];
                                    return;
                                }
                            }
                            int[] iArr3 = new int[lIIIlllIIIlIl[1]];
                            iArr3[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
                            if (lIlIIIlllIlIlIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIIlllIIIlIl[1]];
                                iArr4[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[12];
                                if (lIlIIIlllIlIlIl(Bank.contains(iArr4) ? 1 : 0)) {
                                    int[] iArr5 = new int[lIIIlllIIIlIl[1]];
                                    iArr5[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[13];
                                    if (!lIlIIIlllIlIlll(Bank.contains(iArr5) ? 1 : 0)) {
                                        Bank.withdraw(lIIIlllIIIlIl[9], lIIIlllIIIlIl[10], Bank.WithdrawMode.DEFAULT);
                                        Bank.withdraw(lIIIlllIIIlIl[12], lIIIlllIIIlIl[8], Bank.WithdrawMode.DEFAULT);
                                        Bank.withdraw(lIIIlllIIIlIl[15], lIIIlllIIIlIl[8], Bank.WithdrawMode.DEFAULT);
                                        C0000a.b(C0005f.bk, lIIIlllIIIlIl[1]);
                                    }
                                }
                            }
                            W();
                            System.out.println(lIIIlllIIIIll[lIIIlllIIIlIl[14]]);
                            by = lIIIlllIIIlIl[1];
                            return;
                        }
                    }
                }
                if (lIlIIIlllIlIlIl(aJ() ? 1 : 0)) {
                    if (lIlIIIlllIllIlI(Players.getLocal().getWorldLocation().distanceTo(hs), lIIIlllIIIlIl[3])) {
                        if (lIlIIIlllIlIllI(bY, lIIIlllIIIlIl[1])) {
                            C0004e.w();
                            bY += lIIIlllIIIlIl[1];
                        }
                        AccBuilderRat.c = lIIIlllIIIIll[lIIIlllIIIlIl[16]];
                        Movement.walkTo(hs);
                        "".length();
                    }
                    if (lIlIIIlllIllIll(Players.getLocal().getWorldLocation().distanceTo(hs), lIIIlllIIIlIl[3])) {
                        String[] strArr = new String[lIIIlllIIIlIl[1]];
                        strArr[lIIIlllIIIlIl[0]] = lIIIlllIIIIll[lIIIlllIIIlIl[17]];
                        NPC nearest2 = NPCs.getNearest(strArr);
                        if (lIlIIIlllIllIII(nearest2) && lIlIIIlllIllIlI(nearest2.getWorldLocation().distanceTo(hs), lIIIlllIIIlIl[3])) {
                            C0004e.w();
                        }
                        if (lIlIIIlllIlIllI(co, lIIIlllIIIlIl[1])) {
                            P.lo += lIIIlllIIIlIl[1];
                            P.d(AccBuilderRat.m);
                            co += lIIIlllIIIlIl[1];
                            P.lo = lIIIlllIIIlIl[0];
                            cp = lIIIlllIIIlIl[0];
                        }
                        cs();
                    }
                }
            }
            if (!lIlIIIlllIlllII(C0004e.j(lIIIlllIIIlIl[4]), lIIIlllIIIlIl[1]) || lIlIIIlllIlllIl(C0004e.j(lIIIlllIIIlIl[4]), lIIIlllIIIlIl[10])) {
                if (lIlIIIlllIlllIl(C0004e.j(lIIIlllIIIlIl[4]), lIIIlllIIIlIl[1])) {
                    if (lIlIIIlllIllIlI(Players.getLocal().getWorldLocation().distanceTo(hs), lIIIlllIIIlIl[3])) {
                        AccBuilderRat.c = lIIIlllIIIIll[lIIIlllIIIlIl[18]];
                        Movement.walkTo(hs);
                        "".length();
                        Time.sleepTicks(lIIIlllIIIlIl[1]);
                        "".length();
                    }
                    cs();
                }
                if (lIlIIIlllIlllIl(C0004e.j(lIIIlllIIIlIl[4]), lIIIlllIIIlIl[10])) {
                    cs();
                }
            }
            C0006g.a(new String[lIIIlllIIIlIl[0]]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIlllIIIlIl[0];
    }

    private static boolean lIlIIIlllIllllI(int i2, int i3) {
        return i2 >= i3;
    }

    private static void cs() {
        if (lIlIIIlllIlIlll(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr = new String[lIIIlllIIIlIl[1]];
            strArr[lIIIlllIIIlIl[0]] = lIIIlllIIIIll[lIIIlllIIIlIl[19]];
            List all = NPCs.getAll(strArr);
            if (lIlIIIlllIllIIl(all.size())) {
                ((NPC) all.get(lIIIlllIIIlIl[0])).interact(lIIIlllIIIIll[lIIIlllIIIlIl[20]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, lIIIlllIIIlIl[21]);
                "".length();
            }
        }
        if (lIlIIIlllIlIlIl(Dialog.isOpen() ? 1 : 0) && lIlIIIlllIlIlIl(Dialog.isViewingOptions() ? 1 : 0)) {
            List options = Dialog.getOptions();
            if (lIlIIIlllIlIlll(options.isEmpty() ? 1 : 0)) {
                int i2 = lIIIlllIIIlIl[0];
                while (lIlIIIlllIlIllI(i2, options.size())) {
                    if (lIlIIIlllIlIlIl(((Widget) options.get(i2)).getText().equalsIgnoreCase(lIIIlllIIIIll[lIIIlllIIIlIl[22]]) ? 1 : 0)) {
                        String[] strArr2 = new String[lIIIlllIIIlIl[1]];
                        strArr2[lIIIlllIIIlIl[0]] = ((Widget) options.get(i2)).getText();
                        Dialog.chooseOption(strArr2);
                        "".length();
                        "".length();
                        if ("   ".length() == (113 ^ 117)) {
                            return;
                        }
                        return;
                    } else if (lIlIIIlllIlIlIl(((Widget) options.get(i2)).getText().equalsIgnoreCase(lIIIlllIIIIll[lIIIlllIIIlIl[23]]) ? 1 : 0)) {
                        String[] strArr3 = new String[lIIIlllIIIlIl[1]];
                        strArr3[lIIIlllIIIlIl[0]] = ((Widget) options.get(i2)).getText();
                        Dialog.chooseOption(strArr3);
                        "".length();
                        "".length();
                        if ("   ".length() <= "  ".length()) {
                            return;
                        }
                        return;
                    } else if (lIlIIIlllIlIlIl(((Widget) options.get(i2)).getText().equalsIgnoreCase(lIIIlllIIIIll[lIIIlllIIIlIl[24]]) ? 1 : 0)) {
                        String[] strArr4 = new String[lIIIlllIIIlIl[1]];
                        strArr4[lIIIlllIIIlIl[0]] = ((Widget) options.get(i2)).getText();
                        Dialog.chooseOption(strArr4);
                        "".length();
                        "".length();
                        if ("  ".length() == 0) {
                            return;
                        }
                        return;
                    } else if (lIlIIIlllIlIlll(Dialog.isViewingOptions() ? 1 : 0)) {
                        "".length();
                        if (" ".length() < " ".length()) {
                            return;
                        }
                        return;
                    } else {
                        i2++;
                        "".length();
                        if (0 != 0) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private static boolean lIlIIIlllIlIlIl(int i2) {
        return i2 != 0;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllIIIIll[lIIIlllIIIlIl[31]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIIlllIllllI(C0004e.j(lIIIlllIIIlIl[4]), lIIIlllIIIlIl[32])) {
            ?? r0 = lIIIlllIIIlIl[1];
            "".length();
            return " ".length() != " ".length() ? ((((68 + 115) - 178) + 128) ^ (((172 + 84) - 178) + 110)) & (((((95 + 86) - 102) + 94) ^ (((61 + 103) - 127) + 111)) ^ (-" ".length())) : r0;
        }
        return lIIIlllIIIlIl[0];
    }

    private static String lIlIIIlllIIlllI(String lllllllllllllllIIIIIllIlIlllllll, String lllllllllllllllIIIIIllIlIllllIIl) {
        String lllllllllllllllIIIIIllIlIlllllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIllIlIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIIllIlIllllIIl.toCharArray();
        int lllllllllllllllIIIIIllIlIllllIll = lIIIlllIIIlIl[0];
        char[] charArray2 = lllllllllllllllIIIIIllIlIlllllll2.toCharArray();
        int lllllllllllllllIIIIIllIlIlllIlII = charArray2.length;
        int i2 = lIIIlllIIIlIl[0];
        while (lIlIIIlllIlIllI(i2, lllllllllllllllIIIIIllIlIlllIlII)) {
            sb.append((char) (charArray2[i2] ^ charArray[lllllllllllllllIIIIIllIlIllllIll % charArray.length]));
            "".length();
            lllllllllllllllIIIIIllIlIllllIll++;
            i2++;
            "".length();
            if ((((155 ^ 143) ^ (63 ^ 97)) & (((((201 + 85) - 114) + 31) ^ (((68 + 42) - 36) + 55)) ^ (-" ".length()))) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIIlllIlIlll(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIIlllIllIII(Object obj) {
        return obj != null;
    }

    static {
        lIlIIIlllIlIlII();
        lIlIIIlllIlIIII();
        bA = new ArrayList();
        hr = lIIIlllIIIlIl[9];
        hs = new WorldPoint(lIIIlllIIIlIl[34], lIIIlllIIIlIl[35], lIIIlllIIIlIl[0]);
        String[] strArr = new String[lIIIlllIIIlIl[5]];
        strArr[lIIIlllIIIlIl[0]] = lIIIlllIIIIll[lIIIlllIIIlIl[36]];
        strArr[lIIIlllIIIlIl[1]] = lIIIlllIIIIll[lIIIlllIIIlIl[37]];
        strArr[lIIIlllIIIlIl[3]] = lIIIlllIIIIll[lIIIlllIIIlIl[10]];
        bW = strArr;
    }

    private static boolean lIlIIIlllIlllIl(int i2, int i3) {
        return i2 == i3;
    }

    private static String lIlIIIlllIIllll(String lllllllllllllllIIIIIllIlIlIlllIl, String lllllllllllllllIIIIIllIlIlIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIlIlIllIlI.getBytes(StandardCharsets.UTF_8)), lIIIlllIIIlIl[16]), "DES");
            Cipher lllllllllllllllIIIIIllIlIlIlllll = Cipher.getInstance("DES");
            lllllllllllllllIIIIIllIlIlIlllll.init(lIIIlllIIIlIl[3], secretKeySpec);
            return new String(lllllllllllllllIIIIIllIlIlIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIlIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIllIlIlIllllI) {
            lllllllllllllllIIIIIllIlIlIllllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aJ() {
        int[] iArr = new int[lIIIlllIIIlIl[1]];
        iArr[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
        if (lIlIIIlllIlIlIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIlllIIIlIl[1]];
            iArr2[lIIIlllIIIlIl[0]] = lIIIlllIIIlIl[9];
            if (lIlIIIlllIllllI(Inventory.getAll(iArr2).size(), lIIIlllIIIlIl[10])) {
                ?? r0 = lIIIlllIIIlIl[1];
                "".length();
                return (-" ".length()) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIIIlllIIIlIl[0];
    }
}
