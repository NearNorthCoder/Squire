package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.V  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/V.class */
public class V implements ab {
    private static /* synthetic */ String[] llIIlIIll;
    private static /* synthetic */ int[] llIIlIlII;
    public static /* synthetic */ WorldPoint lq;
    static /* synthetic */ int dk;
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ List<C0003d> bx;
    static /* synthetic */ boolean dl;
    private static final /* synthetic */ String[] lp;
    static /* synthetic */ int cI;

    static {
        lIlIlIlIIIll();
        lIlIlIlIIIlI();
        String[] strArr = new String[llIIlIlII[15]];
        strArr[llIIlIlII[0]] = llIIlIIll[llIIlIlII[64]];
        strArr[llIIlIlII[1]] = llIIlIIll[llIIlIlII[65]];
        strArr[llIIlIlII[3]] = llIIlIIll[llIIlIlII[66]];
        strArr[llIIlIlII[5]] = llIIlIIll[llIIlIlII[67]];
        strArr[llIIlIlII[6]] = llIIlIIll[llIIlIlII[68]];
        strArr[llIIlIlII[8]] = llIIlIIll[llIIlIlII[69]];
        strArr[llIIlIlII[10]] = llIIlIIll[llIIlIlII[70]];
        lp = strArr;
        bx = new ArrayList();
        lq = new WorldPoint(llIIlIlII[71], llIIlIlII[72], llIIlIlII[0]);
        cI = llIIlIlII[0];
    }

    private static void lIlIlIlIIIll() {
        llIIlIlII = new int[74];
        llIIlIlII[0] = ((191 ^ 144) ^ (252 ^ 151)) & (((((184 + 80) - 125) + 57) ^ (((12 + 55) - 1) + 62)) ^ (-" ".length()));
        llIIlIlII[1] = " ".length();
        llIIlIlII[2] = 100 ^ 47;
        llIIlIlII[3] = "  ".length();
        llIIlIlII[4] = 2 ^ 60;
        llIIlIlII[5] = "   ".length();
        llIIlIlII[6] = (((5 + 69) - 33) + 100) ^ (((2 + 51) - (-83)) + 1);
        llIIlIlII[7] = (-18514) & 23513;
        llIIlIlII[8] = 126 ^ 123;
        llIIlIlII[9] = (-1615) & 1902;
        llIIlIlII[10] = 155 ^ 157;
        llIIlIlII[11] = (-((-20693) & 20957)) & (-4113) & 6143;
        llIIlIlII[12] = (-((-6117) & 14309)) & (-20499) & 30459;
        llIIlIlII[13] = (-18603) & 31227;
        llIIlIlII[14] = (-((-2581) & 27317)) & (-23) & 32767;
        llIIlIlII[15] = (((72 + 138) - 119) + 67) ^ (((26 + 70) - (-22)) + 35);
        llIIlIlII[16] = 68 ^ 76;
        llIIlIlII[17] = " ".length() ^ (182 ^ 190);
        llIIlIlII[18] = (18 ^ 65) ^ (3 ^ 90);
        llIIlIlII[19] = (118 ^ 123) ^ (193 ^ 199);
        llIIlIlII[20] = (((127 + 43) - 68) + 78) ^ (((21 + 172) - 185) + 176);
        llIIlIlII[21] = 186 ^ 183;
        llIIlIlII[22] = (-282) & 953;
        llIIlIlII[23] = (-((-879) & 28527)) & (-4181) & 32501;
        llIIlIlII[24] = (-((-21) & 6485)) & (-1) & 7135;
        llIIlIlII[25] = (231 ^ 159) ^ (80 ^ 38);
        llIIlIlII[26] = (12 ^ 94) ^ (43 ^ 118);
        llIIlIlII[27] = 98 ^ 114;
        llIIlIlII[28] = 22 ^ 7;
        llIIlIlII[29] = "   ".length() ^ (80 ^ 65);
        llIIlIlII[30] = 60 ^ 47;
        llIIlIlII[31] = (93 ^ 0) ^ (72 ^ 1);
        llIIlIlII[32] = 66 ^ 87;
        llIIlIlII[33] = 100 ^ 114;
        llIIlIlII[34] = (103 ^ 50) ^ (12 ^ 78);
        llIIlIlII[35] = (-((-19747) & 23907)) & (-11675) & 16350;
        llIIlIlII[36] = (218 ^ 139) ^ (7 ^ 78);
        llIIlIlII[37] = (((81 + 151) - 115) + 54) ^ (((6 + 6) - 4) + 170);
        llIIlIlII[38] = (196 ^ 161) ^ (((78 + 83) - 89) + 55);
        llIIlIlII[39] = 71 ^ 92;
        llIIlIlII[40] = 36 ^ 56;
        llIIlIlII[41] = (-6873) & 7901;
        llIIlIlII[42] = 191 ^ 162;
        llIIlIlII[43] = (26 ^ 82) ^ (31 ^ 73);
        llIIlIlII[44] = (246 ^ 141) ^ (223 ^ 187);
        llIIlIlII[45] = (-((-2069) & 28383)) & (-4097) & 30687;
        llIIlIlII[46] = 135 ^ 167;
        llIIlIlII[47] = 23 ^ 54;
        llIIlIlII[48] = (((43 + 102) - 90) + 114) ^ (((67 + 137) - 142) + 77);
        llIIlIlII[49] = 109 ^ 78;
        llIIlIlII[50] = 108 ^ 72;
        llIIlIlII[51] = (21 ^ 16) ^ (172 ^ 140);
        llIIlIlII[52] = 59 ^ 29;
        llIIlIlII[53] = (79 ^ 85) ^ (15 ^ 50);
        llIIlIlII[54] = 160 ^ 136;
        llIIlIlII[55] = (119 ^ 77) ^ (105 ^ 122);
        llIIlIlII[56] = (-((-8245) & 31927)) & (-2) & 32683;
        llIIlIlII[57] = (-((-32449) & 32723)) & (-16418) & 28671;
        llIIlIlII[58] = (-((-24994) & 26613)) & (-2053) & 28671;
        llIIlIlII[59] = (-((-35) & 16571)) & (-1) & 24543;
        llIIlIlII[60] = (-((-12393) & 28921)) & (-4100) & 22527;
        llIIlIlII[61] = 251 ^ 159;
        llIIlIlII[62] = (8 ^ 17) ^ (0 ^ 51);
        llIIlIlII[63] = (243 ^ 173) ^ (55 ^ 66);
        llIIlIlII[64] = (((64 + 70) - 106) + 117) ^ (((162 + 32) - 68) + 63);
        llIIlIlII[65] = 85 ^ 120;
        llIIlIlII[66] = 97 ^ 79;
        llIIlIlII[67] = (244 ^ 164) ^ (((92 + 56) - 106) + 85);
        llIIlIlII[68] = (9 ^ 16) ^ (15 ^ 38);
        llIIlIlII[69] = 56 ^ 9;
        llIIlIlII[70] = 122 ^ 72;
        llIIlIlII[71] = (-((-4745) & 30379)) & (-17) & 28607;
        llIIlIlII[72] = (-28740) & 32251;
        llIIlIlII[73] = 27 ^ 40;
    }

    private static String lIlIlIlIIIII(String lIllIIIIlllIII, String lIllIIIIllIlll) {
        try {
            SecretKeySpec lIllIIIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIlII[3], lIllIIIIlllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIIIlllIIl) {
            lIllIIIIlllIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x04c4, code lost:
        if (lIlIlIlIlIll(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0521, code lost:
        if (lIlIlIlIIlII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v321, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v330, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v365, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dh() {
        if (lIlIlIlIIlII(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIIlIIll[llIIlIlII[0]];
            C0001b.a(bx);
            if (lIlIlIlIIlIl(bx.size(), llIIlIlII[1])) {
                System.out.println(llIIlIIll[llIIlIlII[1]]);
                bv = llIIlIlII[0];
            }
        }
        if (lIlIlIlIIllI(bv ? 1 : 0)) {
            if (lIlIlIlIIlII(Inventory.contains(C0005f.bc) ? 1 : 0) && lIlIlIlIIlIl(Movement.getRunEnergy(), llIIlIlII[2]) && lIlIlIlIIllI(Dialog.isOpen() ? 1 : 0)) {
                Inventory.getFirst(C0005f.bc).interact(llIIlIIll[llIIlIlII[3]]);
                Time.sleepTicks(llIIlIlII[1]);
                "".length();
            }
            if (lIlIlIlIIllI(an() ? 1 : 0) && lIlIlIlIIlIl(C0004e.j(llIIlIlII[4]), llIIlIlII[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlIlIIlll(nearest) && lIlIlIlIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIlIIll[llIIlIlII[5]];
                    C0000a.a(nearest);
                }
                if (lIlIlIlIIlll(nearest) && lIlIlIlIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIlIlIIllI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[6]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIlIlII[7]);
                        "".length();
                    }
                    if (lIlIlIlIIlII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[8]];
                        if (lIlIlIlIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIlIlII[6]);
                            "".length();
                        }
                        if (lIlIlIlIlIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIlIlII[3]);
                            "".length();
                        }
                        int[] iArr = new int[llIIlIlII[1]];
                        iArr[llIIlIlII[0]] = llIIlIlII[9];
                        if (lIlIlIlIIlII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llIIlIlII[1]];
                            iArr2[llIIlIlII[0]] = llIIlIlII[9];
                            if (lIlIlIlIIlIl(Bank.getFirst(iArr2).getQuantity(), llIIlIlII[5])) {
                                Q();
                                System.out.println(llIIlIIll[llIIlIlII[10]]);
                                bv = llIIlIlII[1];
                                return;
                            }
                        }
                        int[] iArr3 = new int[llIIlIlII[8]];
                        iArr3[llIIlIlII[0]] = llIIlIlII[11];
                        iArr3[llIIlIlII[1]] = llIIlIlII[12];
                        iArr3[llIIlIlII[3]] = llIIlIlII[9];
                        iArr3[llIIlIlII[5]] = llIIlIlII[13];
                        iArr3[llIIlIlII[6]] = llIIlIlII[14];
                        if (lIlIlIlIIllI(C0004e.d(iArr3) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIlIIll[llIIlIlII[15]]);
                            bv = llIIlIlII[1];
                            return;
                        }
                    }
                    int[] iArr4 = new int[llIIlIlII[8]];
                    iArr4[llIIlIlII[0]] = llIIlIlII[11];
                    iArr4[llIIlIlII[1]] = llIIlIlII[12];
                    iArr4[llIIlIlII[3]] = llIIlIlII[9];
                    iArr4[llIIlIlII[5]] = llIIlIlII[13];
                    iArr4[llIIlIlII[6]] = llIIlIlII[14];
                    if (lIlIlIlIIlII(C0004e.d(iArr4) ? 1 : 0)) {
                        Bank.withdraw(llIIlIlII[11], llIIlIlII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIlIlII[1]);
                        "".length();
                        Bank.withdraw(llIIlIlII[12], llIIlIlII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIlIlII[1]);
                        "".length();
                        Bank.withdraw(llIIlIlII[9], llIIlIlII[5], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIlIlII[1]);
                        "".length();
                        Bank.withdraw(llIIlIlII[13], llIIlIlII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIlIlII[1]);
                        "".length();
                        Bank.withdraw(llIIlIlII[14], llIIlIlII[5], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIlIlII[1]);
                        "".length();
                        C0000a.b(C0005f.bm, llIIlIlII[1]);
                        Time.sleepTicks(llIIlIlII[5]);
                        "".length();
                    }
                }
            }
            if (lIlIlIlIIlII(an() ? 1 : 0) && lIlIlIlIIlIl(C0004e.j(llIIlIlII[4]), llIIlIlII[1])) {
                if (lIlIlIlIIlIl(cI, llIIlIlII[1])) {
                    C0004e.x();
                    cI += llIIlIlII[1];
                }
                if (lIlIlIlIlIII(cI)) {
                    if (lIlIlIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(lq), llIIlIlII[8])) {
                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[16]];
                        Movement.walkTo(lq);
                        "".length();
                        Time.sleepTicks(llIIlIlII[1]);
                        "".length();
                    }
                    if (lIlIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(lq), llIIlIlII[8])) {
                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[17]];
                        String[] strArr = new String[llIIlIlII[1]];
                        strArr[llIIlIlII[0]] = llIIlIIll[llIIlIlII[18]];
                        TileObject nearest2 = TileObjects.getNearest(strArr);
                        if (lIlIlIlIIlll(nearest2)) {
                            String[] strArr2 = new String[llIIlIlII[1]];
                            strArr2[llIIlIlII[0]] = llIIlIIll[llIIlIlII[19]];
                            if (lIlIlIlIIlII(nearest2.hasAction(strArr2) ? 1 : 0)) {
                                nearest2.interact(llIIlIIll[llIIlIlII[20]]);
                                Time.sleepTicks(llIIlIlII[5]);
                                "".length();
                            }
                        }
                        C0006g.a(llIIlIIll[llIIlIlII[21]], lp);
                    }
                }
            }
            int[] iArr5 = new int[llIIlIlII[1]];
            iArr5[llIIlIlII[0]] = llIIlIlII[22];
            if (lIlIlIlIIlll(NPCs.getNearest(iArr5))) {
                int[] iArr6 = new int[llIIlIlII[1]];
                iArr6[llIIlIlII[0]] = llIIlIlII[23];
                if (lIlIlIlIIlll(NPCs.getNearest(iArr6))) {
                    int[] iArr7 = new int[llIIlIlII[1]];
                    iArr7[llIIlIlII[0]] = llIIlIlII[24];
                }
            }
            C0006g.a(lp);
            if (lIlIlIlIllII(C0004e.j(llIIlIlII[4]), llIIlIlII[5])) {
                String[] strArr3 = new String[llIIlIlII[1]];
                strArr3[llIIlIlII[0]] = llIIlIIll[llIIlIlII[25]];
                if (lIlIlIlIIllI(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[llIIlIlII[1]];
                    strArr4[llIIlIlII[0]] = llIIlIIll[llIIlIlII[26]];
                }
                int[] iArr8 = new int[llIIlIlII[1]];
                iArr8[llIIlIlII[0]] = llIIlIlII[9];
                if (lIlIlIlIIlII(Inventory.contains(iArr8) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIlIIll[llIIlIlII[27]];
                    String[] strArr5 = new String[llIIlIlII[1]];
                    strArr5[llIIlIlII[0]] = llIIlIIll[llIIlIlII[28]];
                    Item first = Inventory.getFirst(strArr5);
                    String[] strArr6 = new String[llIIlIlII[1]];
                    strArr6[llIIlIlII[0]] = llIIlIIll[llIIlIlII[29]];
                    Item first2 = Inventory.getFirst(strArr6);
                    int[] iArr9 = new int[llIIlIlII[1]];
                    iArr9[llIIlIlII[0]] = llIIlIlII[9];
                    Item first3 = Inventory.getFirst(iArr9);
                    if (lIlIlIlIIlll(first) && lIlIlIlIIlll(first3)) {
                        first.useOn(first3);
                        Time.sleepTicks(llIIlIlII[1]);
                        "".length();
                    }
                    int[] iArr10 = new int[llIIlIlII[1]];
                    iArr10[llIIlIlII[0]] = llIIlIlII[9];
                    Item first4 = Inventory.getFirst(iArr10);
                    if (lIlIlIlIIlll(first2) && lIlIlIlIIlll(first4)) {
                        first2.useOn(first4);
                    }
                }
            }
            if (lIlIlIlIllII(C0004e.j(llIIlIlII[4]), llIIlIlII[5])) {
                int[] iArr11 = new int[llIIlIlII[1]];
                iArr11[llIIlIlII[0]] = llIIlIlII[9];
                if (lIlIlIlIIllI(Inventory.contains(iArr11) ? 1 : 0)) {
                    String[] strArr7 = new String[llIIlIlII[1]];
                    strArr7[llIIlIlII[0]] = llIIlIIll[llIIlIlII[30]];
                    if (lIlIlIlIIllI(Inventory.contains(strArr7) ? 1 : 0)) {
                        bm();
                    }
                }
            }
            if (lIlIlIlIllII(C0004e.j(llIIlIlII[4]), llIIlIlII[5])) {
                int[] iArr12 = new int[llIIlIlII[1]];
                iArr12[llIIlIlII[0]] = llIIlIlII[9];
                if (lIlIlIlIIlII(Inventory.contains(iArr12) ? 1 : 0)) {
                    String[] strArr8 = new String[llIIlIlII[1]];
                    strArr8[llIIlIlII[0]] = llIIlIIll[llIIlIlII[31]];
                    if (lIlIlIlIIlII(Inventory.contains(strArr8) ? 1 : 0)) {
                        dk = llIIlIlII[0];
                        if (lIlIlIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(lq), llIIlIlII[8])) {
                            AccBuilderGWD.c = llIIlIIll[llIIlIlII[32]];
                            Movement.walkTo(lq);
                            "".length();
                            Time.sleepTicks(llIIlIlII[1]);
                            "".length();
                        }
                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[33]];
                        C0006g.a(llIIlIIll[llIIlIlII[34]], lp, llIIlIlII[1]);
                    }
                }
            }
            if (lIlIlIlIllII(C0004e.j(llIIlIlII[4]), llIIlIlII[35])) {
                String[] strArr9 = new String[llIIlIlII[1]];
                strArr9[llIIlIlII[0]] = llIIlIIll[llIIlIlII[36]];
                if (lIlIlIlIIllI(Inventory.contains(strArr9) ? 1 : 0)) {
                    bm();
                }
            }
            if (lIlIlIlIllII(C0004e.j(llIIlIlII[4]), llIIlIlII[35])) {
                String[] strArr10 = new String[llIIlIlII[1]];
                strArr10[llIIlIlII[0]] = llIIlIIll[llIIlIlII[37]];
                if (lIlIlIlIIlII(Inventory.contains(strArr10) ? 1 : 0)) {
                    if (lIlIlIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(lq), llIIlIlII[8])) {
                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[38]];
                        Movement.walkTo(lq);
                        "".length();
                        Time.sleepTicks(llIIlIlII[1]);
                        "".length();
                    }
                    AccBuilderGWD.c = llIIlIIll[llIIlIlII[39]];
                    C0006g.a(llIIlIIll[llIIlIlII[40]], lp, llIIlIlII[1]);
                }
            }
            if (lIlIlIlIllII(C0004e.j(llIIlIlII[4]), llIIlIlII[41])) {
                int[] iArr13 = new int[llIIlIlII[1]];
                iArr13[llIIlIlII[0]] = llIIlIlII[9];
                if (lIlIlIlIIllI(Inventory.contains(iArr13) ? 1 : 0)) {
                    bm();
                }
            }
            if (lIlIlIlIllII(C0004e.j(llIIlIlII[4]), llIIlIlII[41])) {
                int[] iArr14 = new int[llIIlIlII[1]];
                iArr14[llIIlIlII[0]] = llIIlIlII[9];
                if (lIlIlIlIIlII(Inventory.contains(iArr14) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIlIIll[llIIlIlII[42]];
                    if (lIlIlIlIIlIl(dk, llIIlIlII[1])) {
                        as.pV += llIIlIlII[1];
                        as.u(AccBuilderGWD.m);
                        dk += llIIlIlII[1];
                        as.pV = llIIlIlII[0];
                        dl = llIIlIlII[0];
                    }
                    if (lIlIlIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(lq), llIIlIlII[8])) {
                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[43]];
                        Movement.walkTo(lq);
                        "".length();
                        Time.sleepTicks(llIIlIlII[1]);
                        "".length();
                    }
                    C0006g.a(llIIlIIll[llIIlIlII[44]], lp, llIIlIlII[1]);
                }
            }
            Widget widget = Widgets.get(llIIlIlII[45], llIIlIlII[26]);
            if (lIlIlIlIIlll(widget)) {
                widget.interact(llIIlIlII[0]);
            }
            C0006g.a(new String[llIIlIlII[0]]);
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIIlIIll[llIIlIlII[62]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    private static void bm() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIlIlIIlll(nearest) && lIlIlIlIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIlIIll[llIIlIlII[46]];
            C0000a.a(nearest);
        }
        if (lIlIlIlIIlll(nearest) && lIlIlIlIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIlIlIIllI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = llIIlIIll[llIIlIlII[47]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llIIlIlII[7]);
                "".length();
            }
            if (lIlIlIlIIlII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = llIIlIIll[llIIlIlII[48]];
                if (lIlIlIlIlIII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llIIlIlII[6]);
                    "".length();
                }
                if (lIlIlIlIlIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(llIIlIlII[3]);
                    "".length();
                }
                int[] iArr = new int[llIIlIlII[1]];
                iArr[llIIlIlII[0]] = llIIlIlII[9];
                if (lIlIlIlIIlII(Bank.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIIlIlII[1]];
                    iArr2[llIIlIlII[0]] = llIIlIlII[9];
                    if (lIlIlIlIIlIl(Bank.getFirst(iArr2).getQuantity(), llIIlIlII[5])) {
                        Q();
                        System.out.println(llIIlIIll[llIIlIlII[49]]);
                        bv = llIIlIlII[1];
                        return;
                    }
                }
                int[] iArr3 = new int[llIIlIlII[8]];
                iArr3[llIIlIlII[0]] = llIIlIlII[11];
                iArr3[llIIlIlII[1]] = llIIlIlII[12];
                iArr3[llIIlIlII[3]] = llIIlIlII[9];
                iArr3[llIIlIlII[5]] = llIIlIlII[13];
                iArr3[llIIlIlII[6]] = llIIlIlII[14];
                if (lIlIlIlIIllI(C0004e.d(iArr3) ? 1 : 0)) {
                    Q();
                    System.out.println(llIIlIIll[llIIlIlII[50]]);
                    bv = llIIlIlII[1];
                    return;
                }
            }
            int[] iArr4 = new int[llIIlIlII[8]];
            iArr4[llIIlIlII[0]] = llIIlIlII[11];
            iArr4[llIIlIlII[1]] = llIIlIlII[12];
            iArr4[llIIlIlII[3]] = llIIlIlII[9];
            iArr4[llIIlIlII[5]] = llIIlIlII[13];
            iArr4[llIIlIlII[6]] = llIIlIlII[14];
            if (lIlIlIlIIlII(C0004e.d(iArr4) ? 1 : 0)) {
                Bank.withdraw(llIIlIlII[11], llIIlIlII[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llIIlIlII[1]);
                "".length();
                Bank.withdraw(llIIlIlII[12], llIIlIlII[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llIIlIlII[1]);
                "".length();
                Bank.withdraw(llIIlIlII[9], llIIlIlII[5], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llIIlIlII[1]);
                "".length();
                Bank.withdraw(llIIlIlII[13], llIIlIlII[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llIIlIlII[1]);
                "".length();
                Bank.withdraw(llIIlIlII[14], llIIlIlII[5], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llIIlIlII[1]);
                "".length();
                C0000a.b(C0005f.bm, llIIlIlII[1]);
                Time.sleepTicks(llIIlIlII[5]);
                "".length();
                Bank.close();
                di();
            }
        }
    }

    private static boolean lIlIlIlIIlIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIIlIlII[1]];
        iArr[llIIlIlII[0]] = llIIlIlII[11];
        if (lIlIlIlIIlII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIIlIlII[1]];
            iArr2[llIIlIlII[0]] = llIIlIlII[12];
            if (lIlIlIlIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIIlIlII[1]];
                iArr3[llIIlIlII[0]] = llIIlIlII[9];
                if (lIlIlIlIIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = llIIlIlII[1];
                    "".length();
                    return "   ".length() >= ((210 ^ 167) ^ (108 ^ 29)) ? ((226 ^ 172) ^ (72 ^ 34)) & (((17 ^ 12) ^ (43 ^ 18)) ^ (-" ".length())) : r0;
                }
            }
        }
        return llIIlIlII[0];
    }

    private static boolean lIlIlIlIlIIl(int i, int i2) {
        return i > i2;
    }

    private static void di() {
        String[] strArr = new String[llIIlIlII[1]];
        strArr[llIIlIlII[0]] = llIIlIIll[llIIlIlII[51]];
        if (lIlIlIlIIllI(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[llIIlIlII[1]];
            strArr2[llIIlIlII[0]] = llIIlIIll[llIIlIlII[52]];
            if (!lIlIlIlIIlII(Inventory.contains(strArr2) ? 1 : 0)) {
                return;
            }
        }
        int[] iArr = new int[llIIlIlII[1]];
        iArr[llIIlIlII[0]] = llIIlIlII[9];
        if (lIlIlIlIIlII(Inventory.contains(iArr) ? 1 : 0)) {
            if (lIlIlIlIIlII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                Time.sleepTicks(C0004e.c(llIIlIlII[3], llIIlIlII[5]));
                "".length();
            }
            AccBuilderGWD.c = llIIlIIll[llIIlIlII[53]];
            String[] strArr3 = new String[llIIlIlII[1]];
            strArr3[llIIlIlII[0]] = llIIlIIll[llIIlIlII[54]];
            Item first = Inventory.getFirst(strArr3);
            String[] strArr4 = new String[llIIlIlII[1]];
            strArr4[llIIlIlII[0]] = llIIlIIll[llIIlIlII[55]];
            Item first2 = Inventory.getFirst(strArr4);
            int[] iArr2 = new int[llIIlIlII[1]];
            iArr2[llIIlIlII[0]] = llIIlIlII[9];
            Item first3 = Inventory.getFirst(iArr2);
            if (lIlIlIlIIlll(first) && lIlIlIlIIlll(first3)) {
                first.useOn(first3);
                Time.sleepTicks(llIIlIlII[1]);
                "".length();
            }
            int[] iArr3 = new int[llIIlIlII[1]];
            iArr3[llIIlIlII[0]] = llIIlIlII[9];
            Item first4 = Inventory.getFirst(iArr3);
            if (lIlIlIlIIlll(first2) && lIlIlIlIIlll(first4)) {
                first2.useOn(first4);
            }
        }
    }

    private static String lIlIlIIlllll(String lIllIIIlIIllIl, String lIllIIIlIIllII) {
        String str = new String(Base64.getDecoder().decode(lIllIIIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIIlIIlIll = new StringBuilder();
        char[] charArray = lIllIIIlIIllII.toCharArray();
        int lIllIIIlIIlIIl = llIIlIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIlII[0];
        while (lIlIlIlIIlIl(i, length)) {
            char lIllIIIlIIlllI = charArray2[i];
            lIllIIIlIIlIll.append((char) (lIllIIIlIIlllI ^ charArray[lIllIIIlIIlIIl % charArray.length]));
            "".length();
            lIllIIIlIIlIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lIllIIIlIIlIll);
    }

    private static boolean lIlIlIlIlIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIIlIlII[0];
    }

    private static String lIlIlIlIIIIl(String lIllIIIIlIlIll, String lIllIIIIlIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), llIIlIlII[16]), "DES");
            Cipher lIllIIIIlIllIl = Cipher.getInstance("DES");
            lIllIIIIlIllIl.init(llIIlIlII[3], secretKeySpec);
            return new String(lIllIIIIlIllIl.doFinal(Base64.getDecoder().decode(lIllIIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIIIlIllII) {
            lIllIIIIlIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlIllII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIlIlIlIll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIlIllIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIlIlIlIII(int i) {
        return i > 0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            dh();
            "".length();
            if ((-((3 ^ 57) ^ (158 ^ 160))) >= 0) {
                return ((((141 + 152) - 266) + 161) ^ (((39 + 138) - 30) + 7)) & (((24 ^ 93) ^ (195 ^ 160)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIIlIlII[61];
    }

    private static boolean lIlIlIlIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIlIlIlIIIlI() {
        llIIlIIll = new String[llIIlIlII[73]];
        llIIlIIll[llIIlIlII[0]] = lIlIlIIlllll("Fw8pASUyWjkcLjgJ", "UzPhK");
        llIIlIIll[llIIlIlII[1]] = lIlIlIlIIIII("yD1AtBkFkjRfpSP7BSkmFmS3yZuKULqpGmYMCyl8g4IuzaBh0gL+zgXOmIQ1dCCv", "IilyY");
        llIIlIIll[llIIlIlII[3]] = lIlIlIIlllll("MyM8Pxk=", "wQUQr");
        llIIlIIll[llIIlIlII[5]] = lIlIlIlIIIII("EJPfMtZkutjhXH7HZK/lfOohjobjbSLk", "niSjN");
        llIIlIIll[llIIlIlII[6]] = lIlIlIlIIIII("/5cwMonW0BhQ5ByOSxzdAg==", "bXUhG");
        llIIlIIll[llIIlIlII[8]] = lIlIlIlIIIII("y1Hbpr2EBNfAZbHOHPiKl52OjQ0fBhQP", "yQJDH");
        llIIlIIll[llIIlIlII[10]] = lIlIlIIlllll("HQ91OSIvSjgxIzkDOz9wOx8wKyRqGSAoICYDMCt8ahkiMSQpAjw2N2oeOngSHzMcFhc=", "JjUXP");
        llIIlIIll[llIIlIlII[15]] = lIlIlIIlllll("GAJGIDkqRwsoODwOCCZrPhIDMj9vFBMxOyMOAzJnbxQRKD8sDw8vLG8TCWEJGj4vDww=", "OgfAK");
        llIIlIIll[llIIlIlII[16]] = lIlIlIIlllll("HCwCdyU9bQcjMCA5", "RMtWQ");
        llIIlIIll[llIIlIlII[17]] = lIlIlIIlllll("CRksAS0zAypTKC8IPgc=", "ZmMsY");
        llIIlIIll[llIIlIlII[18]] = lIlIlIIlllll("CjsiJiNmPj8uNA==", "FZPAF");
        llIIlIIll[llIIlIlII[19]] = lIlIlIlIIIIl("7ieRuoi+8Cs=", "uxZmt");
        llIIlIIll[llIIlIlII[20]] = lIlIlIlIIIII("0CqRJ8yBqXk=", "PKhFP");
        llIIlIIll[llIIlIlII[21]] = lIlIlIlIIIIl("vnPRUqxl5dN4R3wdJoo5vXC+11P+fmyh", "UdRrf");
        llIIlIIll[llIIlIlII[25]] = lIlIlIlIIIIl("4NFpajiN0Z0vfsp+MXVdYQ==", "gpsiR");
        llIIlIIll[llIIlIlII[26]] = lIlIlIlIIIII("gelWalgfSuWnhuz6scUI6g==", "CiMoI");
        llIIlIIll[llIIlIlII[27]] = lIlIlIIlllll("NBQ7DDNQDCAPOwI=", "pmRbT");
        llIIlIIll[llIIlIlII[28]] = lIlIlIlIIIII("gDxvYB8WnI3eRZion33Fvw==", "lZXRo");
        llIIlIIll[llIIlIlII[29]] = lIlIlIlIIIIl("n6h4KPfjfxIPqbJkw1f1XA==", "hSYbx");
        llIIlIIll[llIIlIlII[30]] = lIlIlIIlllll("FwYADww9VAYOCTQdD0EGOR0N", "Xtaak");
        llIIlIIll[llIIlIlII[31]] = lIlIlIlIIIII("Amf/Z6yHiBoCOvJFHymmNr5pXYF0IS+W", "ktJpK");
        llIIlIIll[llIIlIlII[32]] = lIlIlIlIIIIl("t//AkqxuTeQNsmNQeIabuQ==", "CVoez");
        llIIlIIll[llIIlIlII[33]] = lIlIlIIlllll("Ij4nIREYLHUmFlYkJy4WES4=", "vKUOx");
        llIIlIIll[llIIlIlII[34]] = lIlIlIlIIIIl("sRCI0POpvt1kKlEsL4ugVhO67hlIK9GR", "YayQr");
        llIIlIIll[llIIlIlII[36]] = lIlIlIIlllll("CRYHHGUsFRAVLCVaHxgsJw==", "KzryE");
        llIIlIIll[llIIlIlII[37]] = lIlIlIlIIIII("3pXiT53iZmbS5t4mOfvZfkYCbMBWxKRc", "kVOVz");
        llIIlIIll[llIIlIlII[38]] = lIlIlIlIIIII("Z2EaY53beSW8q8abXQQzIQ==", "nYySQ");
        llIIlIIll[llIIlIlII[39]] = lIlIlIlIIIII("V+hrM2Ca5MHKxFC7BgH1iw==", "OQaBI");
        llIIlIIll[llIIlIlII[40]] = lIlIlIIlllll("Hg48ED44B3I3KTcfPBo2PA==", "YkRuL");
        llIIlIIll[llIIlIlII[42]] = lIlIlIIlllll("NiI3ACIMMGUHJUI1NwE8DA==", "bWEnK");
        llIIlIIll[llIIlIlII[43]] = lIlIlIlIIIIl("4i/WyAGMIjlrbip2mT/0nQ==", "rDSzP");
        llIIlIIll[llIIlIlII[44]] = lIlIlIlIIIIl("cjANWLGzQPgL0rSI3zEh6IZKMHThboS2", "ShPaU");
        llIIlIIll[llIIlIlII[46]] = lIlIlIIlllll("OQofDQMWHwAKA1cfBkQGFgUC", "wkidd");
        llIIlIIll[llIIlIlII[47]] = lIlIlIlIIIII("1ObVhwsHq5TNWT1lWohSKw==", "wkJyn");
        llIIlIIll[llIIlIlII[48]] = lIlIlIlIIIIl("G6tfBqLJqg1cwnV+pRRRDF/p5WDfC7DI", "iSJdC");
        llIIlIIll[llIIlIlII[49]] = lIlIlIlIIIII("zNoh1jwTRhgkEYl4mEXiIw/M/ZzZcmO+4BAd1n8sYII9UZeBKzUe1tpKAmaxJUyEZ0+yqvnoXVo=", "NPnpK");
        llIIlIIll[llIIlIlII[50]] = lIlIlIlIIIIl("lBDgPSc60ygDGnRw6B8rw9+OuVZfRQw6WiEL2g52vQGKUpU6zbDb9q3ZywaEZxkburnb/VO8lPU=", "Uzper");
        llIIlIIll[llIIlIlII[51]] = lIlIlIIlllll("Cj0UAFksKAQ=", "HQaey");
        llIIlIIll[llIIlIlII[52]] = lIlIlIIlllll("KRErKioDQy49KA==", "fcJDM");
        llIIlIIll[llIIlIlII[53]] = lIlIlIIlllll("FzsdAilzIwYBISE=", "SBtlN");
        llIIlIIll[llIIlIlII[54]] = lIlIlIIlllll("CxEiLDchQyc7NQ==", "DcCBP");
        llIIlIIll[llIIlIlII[55]] = lIlIlIlIIIIl("NhDykauPaO19zdWAkjURtA==", "AhqvG");
        llIIlIIll[llIIlIlII[62]] = lIlIlIlIIIII("kps1lu0Z8Fm8g9qUiUWRkxsWDX+K+VoU", "McYYH");
        llIIlIIll[llIIlIlII[63]] = lIlIlIlIIIII("lrqYp5lDE0oiEDof2tbunZM8t+20Ba9C", "Yaoga");
        llIIlIIll[llIIlIlII[64]] = lIlIlIIlllll("HQ8Xdg==", "DjdXK");
        llIIlIIll[llIIlIlII[65]] = lIlIlIIlllll("FRt5LiskVC42KiVUNDJkJRt5Jy0yH3k2KnEVKzorJAZ5NCs9GywlZDcbK3c9PgFm", "QtYWD");
        llIIlIIll[llIIlIlII[66]] = lIlIlIIlllll("IBECN00WGww2GVcYQycEER8GMQgZDUMgAhsWFjFS", "wycCm");
        llIIlIIll[llIIlIlII[67]] = lIlIlIlIIIIl("Adcl3kjka7HDmN2uvGVzX7nkj4QjQA4U3eO8JGsJg88=", "SwPGN");
        llIIlIIll[llIIlIlII[68]] = lIlIlIIlllll("EHIhCjM8cjoEKDxyKwcwPHIoGSg2JztLLTwgLEU=", "YRIkE");
        llIIlIIll[llIIlIlII[69]] = lIlIlIIlllll("C2UMKgcnZRckHCdlBjkeNStEKgMvKhE5USogFi5f", "BEdKq");
        llIIlIIll[llIIlIlII[70]] = lIlIlIlIIIIl("RuqfsDsvrPo64zUuVDZeI5n0lI4BVBRB", "FxcVz");
    }

    private static boolean lIlIlIlIIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e6, code lost:
        if (lIlIlIlIIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.V.llIIlIlII[5]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[llIIlIlII[1]];
        iArr4[llIIlIlII[0]] = llIIlIlII[11];
        if (lIlIlIlIIllI(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(llIIlIlII[11], llIIlIlII[1], llIIlIlII[56]));
            "".length();
        }
        int[] iArr5 = new int[llIIlIlII[1]];
        iArr5[llIIlIlII[0]] = llIIlIlII[12];
        if (lIlIlIlIIllI(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(llIIlIlII[12], llIIlIlII[1], llIIlIlII[56]));
            "".length();
        }
        int[] iArr6 = new int[llIIlIlII[1]];
        iArr6[llIIlIlII[0]] = llIIlIlII[9];
        if (lIlIlIlIIlII(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[llIIlIlII[1]];
            iArr7[llIIlIlII[0]] = llIIlIlII[9];
            if (lIlIlIlIIlII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIlIlII[1]];
                iArr8[llIIlIlII[0]] = llIIlIlII[9];
            }
            iArr = new int[llIIlIlII[1]];
            iArr[llIIlIlII[0]] = llIIlIlII[14];
            if (lIlIlIlIIllI(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIlII[14], llIIlIlII[8], llIIlIlII[56]));
                "".length();
            }
            if (lIlIlIlIIllI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llIIlIIll[llIIlIlII[63]]);
            }) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIlII[57], llIIlIlII[8], llIIlIlII[58]));
                "".length();
            }
            iArr2 = new int[llIIlIlII[1]];
            iArr2[llIIlIlII[0]] = llIIlIlII[59];
            if (lIlIlIlIIllI(Bank.contains(iArr2) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIlII[59], llIIlIlII[54], llIIlIlII[60]));
                "".length();
            }
            iArr3 = new int[llIIlIlII[1]];
            iArr3[llIIlIlII[0]] = llIIlIlII[13];
            if (lIlIlIlIIllI(Bank.contains(iArr3) ? 1 : 0)) {
                return;
            }
            bx.add(new C0003d(llIIlIlII[13], llIIlIlII[8], C0009j.ch));
            "".length();
            return;
        }
        bx.add(new C0003d(llIIlIlII[9], llIIlIlII[5], llIIlIlII[56]));
        "".length();
        iArr = new int[llIIlIlII[1]];
        iArr[llIIlIlII[0]] = llIIlIlII[14];
        if (lIlIlIlIIllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (lIlIlIlIIllI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llIIlIIll[llIIlIlII[63]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[llIIlIlII[1]];
        iArr2[llIIlIlII[0]] = llIIlIlII[59];
        if (lIlIlIlIIllI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIIlIlII[1]];
        iArr3[llIIlIlII[0]] = llIIlIlII[13];
        if (lIlIlIlIIllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static boolean lIlIlIlIIlII(int i) {
        return i != 0;
    }

    private static boolean lIlIlIlIIlll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if ((!lIlIlIlIllIl(C0004e.j(llIIlIlII[4]), llIIlIlII[10]) || lIlIlIlIllIl(C0004e.j(llIIlIlII[4]), llIIlIlII[18])) && !lIlIlIlIlllI(Quests.getState(Quest.GOBLIN_DIPLOMACY), QuestState.FINISHED)) {
            return llIIlIlII[0];
        }
        ?? r0 = llIIlIlII[1];
        "".length();
        return (-"   ".length()) > 0 ? ((19 ^ 11) ^ (141 ^ 134)) & (((48 ^ 110) ^ (223 ^ 146)) ^ (-" ".length())) : r0;
    }
}
