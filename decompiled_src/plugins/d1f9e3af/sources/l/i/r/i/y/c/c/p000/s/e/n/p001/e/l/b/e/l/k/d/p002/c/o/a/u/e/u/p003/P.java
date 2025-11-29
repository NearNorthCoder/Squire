package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.P  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/P.class */
public class P implements W {
    private static /* synthetic */ int[] llIIIIllI;
    private static /* synthetic */ String[] llIIIIlII;
    private static final /* synthetic */ int jz;
    static /* synthetic */ String iw;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ int jy;
    private static final /* synthetic */ int jp;
    private static final /* synthetic */ int jw;
    static /* synthetic */ int cl;
    private static final /* synthetic */ int js;
    static /* synthetic */ String[] hl;
    public static /* synthetic */ List<C0003d> bv;
    private static final /* synthetic */ int jq;
    private static final /* synthetic */ WorldPoint jo;
    private static final /* synthetic */ int ju;
    static /* synthetic */ boolean cm;
    private static final /* synthetic */ int jt;
    private static final /* synthetic */ int jv;
    private static final /* synthetic */ int jr;
    private static final /* synthetic */ int jx;
    static /* synthetic */ int bT;

    private static boolean lIlIIIllllll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v367, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v376, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v385, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v394, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v403, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v412, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v438, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    public static void ct() {
        if (lIlIIIllllIl(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[0]];
            C0001b.a(bv);
            if (lIlIIIlllllI(bv.size(), llIIIIllI[1])) {
                System.out.println(llIIIIlII[llIIIIllI[1]]);
                bt = llIIIIllI[0];
            }
        }
        if (lIlIIIllllll(bt ? 1 : 0)) {
            if (lIlIIIllllll(C0004e.j(llIIIIllI[2]))) {
                if (lIlIIIllllll(bH() ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIlIIlIIIIII(nearest) && lIlIIIllllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[3]];
                        C0000a.a(nearest);
                    }
                    if (lIlIIlIIIIII(nearest) && lIlIIIllllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIlIIIllllll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[4]];
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, llIIIIllI[5]);
                            "".length();
                        }
                        if (lIlIIIllllIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[6]];
                            if (lIlIIlIIIIIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(llIIIIllI[4]);
                                "".length();
                            }
                            if (lIlIIlIIIIIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(llIIIIllI[3]);
                                "".length();
                            }
                            int[] iArr = new int[llIIIIllI[1]];
                            iArr[llIIIIllI[0]] = llIIIIllI[7];
                            if (lIlIIIllllIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIIIIllI[1]];
                                iArr2[llIIIIllI[0]] = llIIIIllI[7];
                                if (lIlIIIlllllI(Bank.getFirst(iArr2).getQuantity(), llIIIIllI[8])) {
                                    af();
                                    System.out.println(llIIIIlII[llIIIIllI[9]]);
                                    bt = llIIIIllI[1];
                                    return;
                                }
                            }
                            int[] iArr3 = new int[llIIIIllI[1]];
                            iArr3[llIIIIllI[0]] = llIIIIllI[10];
                            if (lIlIIIllllIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[llIIIIllI[1]];
                                iArr4[llIIIIllI[0]] = llIIIIllI[10];
                                if (lIlIIIlllllI(Bank.getFirst(iArr4).getQuantity(), llIIIIllI[11])) {
                                    af();
                                    System.out.println(llIIIIlII[llIIIIllI[12]]);
                                    bt = llIIIIllI[1];
                                    return;
                                }
                            }
                            int[] iArr5 = new int[llIIIIllI[1]];
                            iArr5[llIIIIllI[0]] = llIIIIllI[13];
                            if (lIlIIIllllIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIIIIllI[1]];
                                iArr6[llIIIIllI[0]] = llIIIIllI[13];
                                if (lIlIIIlllllI(Bank.getFirst(iArr6).getQuantity(), llIIIIllI[11])) {
                                    af();
                                    System.out.println(llIIIIlII[llIIIIllI[14]]);
                                    bt = llIIIIllI[1];
                                    return;
                                }
                            }
                            int[] iArr7 = new int[llIIIIllI[1]];
                            iArr7[llIIIIllI[0]] = llIIIIllI[15];
                            if (lIlIIIllllIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[llIIIIllI[1]];
                                iArr8[llIIIIllI[0]] = llIIIIllI[15];
                                if (lIlIIIlllllI(Bank.getFirst(iArr8).getQuantity(), llIIIIllI[11])) {
                                    af();
                                    System.out.println(llIIIIlII[llIIIIllI[16]]);
                                    bt = llIIIIllI[1];
                                    return;
                                }
                            }
                            int[] iArr9 = new int[llIIIIllI[1]];
                            iArr9[llIIIIllI[0]] = llIIIIllI[17];
                            if (lIlIIIllllIl(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[llIIIIllI[1]];
                                iArr10[llIIIIllI[0]] = llIIIIllI[17];
                                if (lIlIIIlllllI(Bank.getFirst(iArr10).getQuantity(), llIIIIllI[9])) {
                                    af();
                                    System.out.println(llIIIIlII[llIIIIllI[18]]);
                                    bt = llIIIIllI[1];
                                    return;
                                }
                            }
                            int[] iArr11 = new int[llIIIIllI[19]];
                            iArr11[llIIIIllI[0]] = llIIIIllI[20];
                            iArr11[llIIIIllI[1]] = llIIIIllI[21];
                            iArr11[llIIIIllI[3]] = llIIIIllI[22];
                            iArr11[llIIIIllI[4]] = llIIIIllI[23];
                            iArr11[llIIIIllI[6]] = llIIIIllI[24];
                            iArr11[llIIIIllI[9]] = llIIIIllI[7];
                            iArr11[llIIIIllI[12]] = llIIIIllI[17];
                            iArr11[llIIIIllI[14]] = llIIIIllI[25];
                            iArr11[llIIIIllI[16]] = llIIIIllI[10];
                            iArr11[llIIIIllI[18]] = llIIIIllI[15];
                            iArr11[llIIIIllI[8]] = llIIIIllI[13];
                            if (lIlIIIllllll(C0004e.b(iArr11) ? 1 : 0)) {
                                af();
                                System.out.println(llIIIIlII[llIIIIllI[8]]);
                                bt = llIIIIllI[1];
                                return;
                            }
                            while (lIlIIIllllll(C0025z.bi() ? 1 : 0)) {
                                C0025z.bg();
                                Time.sleepTicks(llIIIIllI[1]);
                                "".length();
                                "".length();
                                if ((-"   ".length()) >= 0) {
                                    return;
                                }
                            }
                            if (lIlIIIllllll(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(llIIIIllI[6]);
                                "".length();
                            }
                            int[] iArr12 = new int[llIIIIllI[1]];
                            iArr12[llIIIIllI[0]] = llIIIIllI[22];
                            if (lIlIIIllllIl(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llIIIIllI[1]];
                                iArr13[llIIIIllI[0]] = llIIIIllI[22];
                                if (lIlIIIlllllI(Inventory.getCount(iArr13), llIIIIllI[1])) {
                                    Bank.withdraw(llIIIIllI[22], llIIIIllI[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr14 = new int[llIIIIllI[1]];
                                        iArr14[llIIIIllI[0]] = llIIIIllI[22];
                                        if (lIlIIlIIIIIl(Inventory.getCount(iArr14))) {
                                            ?? r0 = llIIIIllI[1];
                                            "".length();
                                            return (((201 ^ 134) ^ "   ".length()) & (((166 ^ 151) ^ (202 ^ 183)) ^ (-" ".length()))) != 0 ? ((226 ^ 154) ^ (21 ^ 51)) & (((((55 + 122) - 20) + 66) ^ (((90 + 98) - 104) + 45)) ^ (-" ".length())) : r0;
                                        }
                                        return llIIIIllI[0];
                                    }, llIIIIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr14 = new int[llIIIIllI[1]];
                            iArr14[llIIIIllI[0]] = llIIIIllI[23];
                            if (lIlIIIllllIl(Bank.contains(iArr14) ? 1 : 0)) {
                                int[] iArr15 = new int[llIIIIllI[1]];
                                iArr15[llIIIIllI[0]] = llIIIIllI[23];
                                if (lIlIIIlllllI(Inventory.getCount(iArr15), llIIIIllI[1])) {
                                    Bank.withdraw(llIIIIllI[23], llIIIIllI[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr16 = new int[llIIIIllI[1]];
                                        iArr16[llIIIIllI[0]] = llIIIIllI[23];
                                        if (lIlIIlIIIIIl(Inventory.getCount(iArr16))) {
                                            ?? r0 = llIIIIllI[1];
                                            "".length();
                                            return !((true ^ true) ^ (true ^ true)) ? ((64 ^ 5) ^ (39 ^ 65)) & (((199 ^ 159) ^ (37 ^ 94)) ^ (-" ".length())) : r0;
                                        }
                                        return llIIIIllI[0];
                                    }, llIIIIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr16 = new int[llIIIIllI[1]];
                            iArr16[llIIIIllI[0]] = llIIIIllI[21];
                            if (lIlIIIllllIl(Bank.contains(iArr16) ? 1 : 0)) {
                                int[] iArr17 = new int[llIIIIllI[1]];
                                iArr17[llIIIIllI[0]] = llIIIIllI[21];
                                if (lIlIIIlllllI(Inventory.getCount(iArr17), llIIIIllI[1])) {
                                    Bank.withdraw(llIIIIllI[21], llIIIIllI[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr18 = new int[llIIIIllI[1]];
                                        iArr18[llIIIIllI[0]] = llIIIIllI[21];
                                        if (lIlIIlIIIIIl(Inventory.getCount(iArr18))) {
                                            ?? r0 = llIIIIllI[1];
                                            "".length();
                                            return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIIIllI[0];
                                    }, llIIIIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr18 = new int[llIIIIllI[1]];
                            iArr18[llIIIIllI[0]] = llIIIIllI[24];
                            if (lIlIIIllllIl(Bank.contains(iArr18) ? 1 : 0)) {
                                int[] iArr19 = new int[llIIIIllI[1]];
                                iArr19[llIIIIllI[0]] = llIIIIllI[24];
                                if (lIlIIIlllllI(Inventory.getCount(iArr19), llIIIIllI[1])) {
                                    Bank.withdraw(llIIIIllI[24], llIIIIllI[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr20 = new int[llIIIIllI[1]];
                                        iArr20[llIIIIllI[0]] = llIIIIllI[24];
                                        if (lIlIIlIIIIIl(Inventory.getCount(iArr20))) {
                                            ?? r0 = llIIIIllI[1];
                                            "".length();
                                            return " ".length() == (-" ".length()) ? ((((16 + 81) - (-43)) + 20) ^ (((8 + 7) - (-91)) + 37)) & (((116 ^ 113) ^ (131 ^ 169)) ^ (-" ".length())) : r0;
                                        }
                                        return llIIIIllI[0];
                                    }, llIIIIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr20 = new int[llIIIIllI[1]];
                            iArr20[llIIIIllI[0]] = llIIIIllI[7];
                            if (lIlIIIllllIl(Bank.contains(iArr20) ? 1 : 0)) {
                                int[] iArr21 = new int[llIIIIllI[1]];
                                iArr21[llIIIIllI[0]] = llIIIIllI[7];
                                if (lIlIIIlllllI(Inventory.getCount(iArr21), llIIIIllI[1])) {
                                    Bank.withdraw(llIIIIllI[7], llIIIIllI[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr22 = new int[llIIIIllI[1]];
                                        iArr22[llIIIIllI[0]] = llIIIIllI[7];
                                        if (lIlIIlIIIIIl(Inventory.getCount(iArr22))) {
                                            ?? r0 = llIIIIllI[1];
                                            "".length();
                                            return (99 ^ 103) <= ((83 ^ 31) & ((4 ^ 72) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIIIllI[0];
                                    }, llIIIIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr22 = new int[llIIIIllI[1]];
                            iArr22[llIIIIllI[0]] = llIIIIllI[17];
                            if (lIlIIIllllIl(Bank.contains(iArr22) ? 1 : 0)) {
                                int[] iArr23 = new int[llIIIIllI[1]];
                                iArr23[llIIIIllI[0]] = llIIIIllI[17];
                                if (lIlIIIlllllI(Inventory.getCount(iArr23), llIIIIllI[1])) {
                                    Bank.withdraw(llIIIIllI[17], llIIIIllI[6], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr24 = new int[llIIIIllI[1]];
                                        iArr24[llIIIIllI[0]] = llIIIIllI[17];
                                        if (lIlIIlIIIIIl(Inventory.getCount(iArr24))) {
                                            ?? r0 = llIIIIllI[1];
                                            "".length();
                                            return ((50 ^ 32) & ((215 ^ 197) ^ (-1))) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIIIllI[0];
                                    }, llIIIIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr24 = new int[llIIIIllI[1]];
                            iArr24[llIIIIllI[0]] = llIIIIllI[10];
                            if (lIlIIIllllIl(Bank.contains(iArr24) ? 1 : 0)) {
                                int[] iArr25 = new int[llIIIIllI[1]];
                                iArr25[llIIIIllI[0]] = llIIIIllI[10];
                                if (lIlIIIlllllI(Inventory.getCount(iArr25), llIIIIllI[1])) {
                                    Bank.withdraw(llIIIIllI[10], llIIIIllI[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr26 = new int[llIIIIllI[1]];
                                        iArr26[llIIIIllI[0]] = llIIIIllI[10];
                                        if (lIlIIlIIIIIl(Inventory.getCount(iArr26))) {
                                            ?? r0 = llIIIIllI[1];
                                            "".length();
                                            return ((114 ^ 110) & ((189 ^ 161) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIIIllI[0];
                                    }, llIIIIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr26 = new int[llIIIIllI[1]];
                            iArr26[llIIIIllI[0]] = llIIIIllI[15];
                            if (lIlIIIllllIl(Bank.contains(iArr26) ? 1 : 0)) {
                                int[] iArr27 = new int[llIIIIllI[1]];
                                iArr27[llIIIIllI[0]] = llIIIIllI[15];
                                if (lIlIIIlllllI(Inventory.getCount(iArr27), llIIIIllI[1])) {
                                    Bank.withdraw(llIIIIllI[15], llIIIIllI[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr28 = new int[llIIIIllI[1]];
                                        iArr28[llIIIIllI[0]] = llIIIIllI[15];
                                        if (lIlIIlIIIIIl(Inventory.getCount(iArr28))) {
                                            ?? r0 = llIIIIllI[1];
                                            "".length();
                                            return (((((22 + 115) - 67) + 163) ^ (((49 + 97) - 69) + 90)) & (((161 ^ 143) ^ (245 ^ 149)) ^ (-" ".length()))) > "   ".length() ? ((((152 + 19) - 9) + 0) ^ (((102 + 168) - 194) + 108)) & (((234 ^ 180) ^ (255 ^ 187)) ^ (-" ".length())) : r0;
                                        }
                                        return llIIIIllI[0];
                                    }, llIIIIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr28 = new int[llIIIIllI[1]];
                            iArr28[llIIIIllI[0]] = llIIIIllI[13];
                            if (lIlIIIllllIl(Bank.contains(iArr28) ? 1 : 0)) {
                                int[] iArr29 = new int[llIIIIllI[1]];
                                iArr29[llIIIIllI[0]] = llIIIIllI[13];
                                if (lIlIIIlllllI(Inventory.getCount(iArr29), llIIIIllI[1])) {
                                    Bank.withdraw(llIIIIllI[13], llIIIIllI[26], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr30 = new int[llIIIIllI[1]];
                                        iArr30[llIIIIllI[0]] = llIIIIllI[13];
                                        if (lIlIIlIIIIIl(Inventory.getCount(iArr30))) {
                                            ?? r0 = llIIIIllI[1];
                                            "".length();
                                            return (-(14 ^ 10)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIIIllI[0];
                                    }, llIIIIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr30 = new int[llIIIIllI[1]];
                            iArr30[llIIIIllI[0]] = llIIIIllI[27];
                            if (lIlIIIllllIl(Bank.contains(iArr30) ? 1 : 0)) {
                                int[] iArr31 = new int[llIIIIllI[1]];
                                iArr31[llIIIIllI[0]] = llIIIIllI[27];
                                if (lIlIIIllllll(Inventory.contains(iArr31) ? 1 : 0)) {
                                    Bank.withdraw(llIIIIllI[27], llIIIIllI[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr32 = new int[llIIIIllI[1]];
                                        iArr32[llIIIIllI[0]] = llIIIIllI[27];
                                        return Inventory.contains(iArr32);
                                    }, llIIIIllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr32 = new int[llIIIIllI[1]];
                            iArr32[llIIIIllI[0]] = llIIIIllI[25];
                            if (lIlIIIllllIl(Bank.contains(iArr32) ? 1 : 0)) {
                                int[] iArr33 = new int[llIIIIllI[1]];
                                iArr33[llIIIIllI[0]] = llIIIIllI[25];
                                if (lIlIIIlllllI(Inventory.getCount(iArr33), llIIIIllI[1])) {
                                    Bank.withdrawAll(llIIIIllI[25], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIIllI[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr34 = new int[llIIIIllI[1]];
                                        iArr34[llIIIIllI[0]] = llIIIIllI[25];
                                        if (lIlIIlIIIIIl(Inventory.getCount(iArr34))) {
                                            ?? r0 = llIIIIllI[1];
                                            "".length();
                                            return "  ".length() <= (((44 ^ 7) ^ (178 ^ 198)) & (((((106 + 71) - 99) + 74) ^ (((137 + 130) - 127) + 59)) ^ (-" ".length()))) ? ((10 ^ 27) ^ (30 ^ 32)) & (((224 ^ 168) ^ (238 ^ 137)) ^ (-" ".length())) : r0;
                                        }
                                        return llIIIIllI[0];
                                    }, llIIIIllI[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
                if (lIlIIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(jo), llIIIIllI[6]) && lIlIIlIIIIll(Players.getLocal().getWorldLocation().getPlane(), llIIIIllI[3]) && lIlIIIllllIl(bH() ? 1 : 0)) {
                    if (lIlIIIllllIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks(llIIIIllI[6]);
                        "".length();
                    }
                    AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[19]];
                    if (lIlIIIllllll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIIlllllI(bT, llIIIIllI[1])) {
                            C0004e.v();
                            bT += llIIIIllI[1];
                        }
                        if (lIlIIIllllIl(new WorldArea(llIIIIllI[28], llIIIIllI[29], llIIIIllI[30], llIIIIllI[31], llIIIIllI[3]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr = new String[llIIIIllI[1]];
                            strArr[llIIIIllI[0]] = llIIIIlII[llIIIIllI[32]];
                            TileObjects.getNearest(strArr).interact(llIIIIlII[llIIIIllI[33]]);
                            Time.sleepTicks(C0004e.c(llIIIIllI[12], llIIIIllI[16]));
                            "".length();
                        }
                        Movement.walkTo(jo);
                        "".length();
                        Time.sleepTicks(llIIIIllI[3]);
                        "".length();
                    }
                }
                if (lIlIIlIIIlII(Players.getLocal().getWorldLocation().distanceTo(jo), llIIIIllI[12])) {
                    AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[34]];
                    cl = llIIIIllI[0];
                    C0006g.a(iw, hl);
                    if (lIlIIIllllIl(C0006g.K() ? 1 : 0)) {
                        C0006g.a(hl);
                    }
                }
            }
            if (lIlIIlIIIIIl(C0004e.j(llIIIIllI[2])) && lIlIIIlllllI(C0004e.j(llIIIIllI[2]), llIIIIllI[3])) {
                if (lIlIIIllllll(bH() ? 1 : 0)) {
                    ck();
                }
                if (lIlIIIllllIl(bH() ? 1 : 0)) {
                    if (lIlIIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(jo), llIIIIllI[12])) {
                        AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[31]];
                        if (lIlIIIllllIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(jo);
                        "".length();
                        Time.sleepTicks(llIIIIllI[1]);
                        "".length();
                    }
                    if (lIlIIlIIIlII(Players.getLocal().getWorldLocation().distanceTo(jo), llIIIIllI[12])) {
                        AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[35]];
                        if (lIlIIIlllllI(cl, llIIIIllI[1])) {
                            an.pK += llIIIIllI[1];
                            an.o(AccBuilderEasyClues.m);
                            cl += llIIIIllI[1];
                            an.pK = llIIIIllI[0];
                            cm = llIIIIllI[0];
                        }
                        C0006g.a(iw, hl);
                        if (lIlIIIllllIl(C0006g.K() ? 1 : 0)) {
                            C0006g.a(hl);
                        }
                    }
                }
            }
            System.out.println("Setting: " + C0004e.j(llIIIIllI[2]));
            C0006g.a(new String[llIIIIllI[0]]);
        }
    }

    private static String lIlIIIllIllI(String lIlllIlIllllIl, String lIlllIlIllllII) {
        String str = new String(Base64.getDecoder().decode(lIlllIlIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlllIlIllllII.toCharArray();
        int lIlllIlIlllIIl = llIIIIllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIIIllI[0];
        while (lIlIIIlllllI(i, length)) {
            char lIlllIlIlllllI = charArray2[i];
            sb.append((char) (lIlllIlIlllllI ^ charArray[lIlllIlIlllIIl % charArray.length]));
            "".length();
            lIlllIlIlllIIl++;
            i++;
            "".length();
            if ((-" ".length()) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            ct();
            "".length();
            if ((-((202 ^ 154) ^ (86 ^ 3))) >= 0) {
                return "  ".length() & ("  ".length() ^ (-" ".length()));
            }
        } catch (Exception lIlllIlllIIIlI) {
            lIlllIlllIIIlI.printStackTrace();
        }
        return llIIIIllI[42];
    }

    private static boolean lIlIIIllllIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02d9, code lost:
        if (lIlIIIlllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.P.llIIIIllI[9]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03bb, code lost:
        if (lIlIIIlllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.P.llIIIIllI[30]) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04aa, code lost:
        if (lIlIIIlllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.P.llIIIIllI[30]) != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        int[] iArr13 = new int[llIIIIllI[1]];
        iArr13[llIIIIllI[0]] = llIIIIllI[21];
        if (lIlIIIllllll(Bank.contains(iArr13) ? 1 : 0)) {
            System.out.println(llIIIIlII[llIIIIllI[36]]);
            bv.add(new C0003d(llIIIIllI[21], llIIIIllI[1], llIIIIllI[37]));
            "".length();
        }
        int[] iArr14 = new int[llIIIIllI[1]];
        iArr14[llIIIIllI[0]] = llIIIIllI[22];
        if (lIlIIIllllll(Bank.contains(iArr14) ? 1 : 0)) {
            System.out.println(llIIIIlII[llIIIIllI[38]]);
            bv.add(new C0003d(llIIIIllI[22], llIIIIllI[1], llIIIIllI[39]));
            "".length();
        }
        int[] iArr15 = new int[llIIIIllI[1]];
        iArr15[llIIIIllI[0]] = llIIIIllI[23];
        if (lIlIIIllllll(Bank.contains(iArr15) ? 1 : 0)) {
            System.out.println(llIIIIlII[llIIIIllI[40]]);
            bv.add(new C0003d(llIIIIllI[23], llIIIIllI[1], llIIIIllI[39]));
            "".length();
        }
        int[] iArr16 = new int[llIIIIllI[1]];
        iArr16[llIIIIllI[0]] = llIIIIllI[24];
        if (lIlIIIllllll(Bank.contains(iArr16) ? 1 : 0)) {
            System.out.println(llIIIIlII[llIIIIllI[30]]);
            bv.add(new C0003d(llIIIIllI[24], llIIIIllI[1], llIIIIllI[39]));
            "".length();
        }
        int[] iArr17 = new int[llIIIIllI[1]];
        iArr17[llIIIIllI[0]] = llIIIIllI[25];
        if (lIlIIIllllll(Bank.contains(iArr17) ? 1 : 0)) {
            System.out.println(llIIIIlII[llIIIIllI[41]]);
            bv.add(new C0003d(llIIIIllI[25], llIIIIllI[42], llIIIIllI[43]));
            "".length();
        }
        int[] iArr18 = new int[llIIIIllI[1]];
        iArr18[llIIIIllI[0]] = llIIIIllI[25];
        if (lIlIIIllllIl(Bank.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[llIIIIllI[1]];
            iArr19[llIIIIllI[0]] = llIIIIllI[25];
            if (lIlIIIlllllI(Bank.getFirst(iArr19).getQuantity(), llIIIIllI[30])) {
                System.out.println(llIIIIlII[llIIIIllI[44]]);
                bv.add(new C0003d(llIIIIllI[25], llIIIIllI[45], llIIIIllI[43]));
                "".length();
            }
        }
        int[] iArr20 = new int[llIIIIllI[1]];
        iArr20[llIIIIllI[0]] = llIIIIllI[17];
        if (lIlIIIllllll(Bank.contains(iArr20) ? 1 : 0)) {
            System.out.println(llIIIIlII[llIIIIllI[46]]);
            bv.add(new C0003d(llIIIIllI[17], llIIIIllI[9], llIIIIllI[47]));
            "".length();
        }
        int[] iArr21 = new int[llIIIIllI[1]];
        iArr21[llIIIIllI[0]] = llIIIIllI[17];
        if (lIlIIIllllIl(Bank.contains(iArr21) ? 1 : 0)) {
            int[] iArr22 = new int[llIIIIllI[1]];
            iArr22[llIIIIllI[0]] = llIIIIllI[17];
            if (lIlIIIllllIl(Bank.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[llIIIIllI[1]];
                iArr23[llIIIIllI[0]] = llIIIIllI[17];
            }
            if (lIlIIIllllll(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llIIIIlII[llIIIIllI[85]]);
            }) ? 1 : 0)) {
                System.out.println(llIIIIlII[llIIIIllI[49]]);
                bv.add(new C0003d(llIIIIllI[50], llIIIIllI[38], llIIIIllI[51]));
                "".length();
            }
            iArr = new int[llIIIIllI[1]];
            iArr[llIIIIllI[0]] = llIIIIllI[20];
            if (lIlIIIllllIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr24 = new int[llIIIIllI[1]];
                iArr24[llIIIIllI[0]] = llIIIIllI[20];
                if (lIlIIIllllIl(Bank.contains(iArr24) ? 1 : 0)) {
                    int[] iArr25 = new int[llIIIIllI[1]];
                    iArr25[llIIIIllI[0]] = llIIIIllI[20];
                }
                iArr2 = new int[llIIIIllI[1]];
                iArr2[llIIIIllI[0]] = llIIIIllI[7];
                if (lIlIIIllllll(Bank.contains(iArr2) ? 1 : 0)) {
                    System.out.println(llIIIIlII[llIIIIllI[54]]);
                    bv.add(new C0003d(llIIIIllI[7], llIIIIllI[30], llIIIIllI[53]));
                    "".length();
                }
                iArr3 = new int[llIIIIllI[1]];
                iArr3[llIIIIllI[0]] = llIIIIllI[7];
                if (lIlIIIllllIl(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr26 = new int[llIIIIllI[1]];
                    iArr26[llIIIIllI[0]] = llIIIIllI[7];
                    if (lIlIIIllllIl(Bank.contains(iArr26) ? 1 : 0)) {
                        int[] iArr27 = new int[llIIIIllI[1]];
                        iArr27[llIIIIllI[0]] = llIIIIllI[7];
                    }
                    iArr4 = new int[llIIIIllI[1]];
                    iArr4[llIIIIllI[0]] = llIIIIllI[27];
                    if (lIlIIIllllll(Bank.contains(iArr4) ? 1 : 0)) {
                        System.out.println(llIIIIlII[llIIIIllI[56]]);
                        bv.add(new C0003d(llIIIIllI[27], llIIIIllI[9], C0008i.bq));
                        "".length();
                    }
                    iArr5 = new int[llIIIIllI[1]];
                    iArr5[llIIIIllI[0]] = llIIIIllI[10];
                    if (lIlIIIllllIl(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr28 = new int[llIIIIllI[1]];
                        iArr28[llIIIIllI[0]] = llIIIIllI[10];
                        if (lIlIIIlllllI(Bank.getFirst(iArr28).getQuantity(), llIIIIllI[11])) {
                            System.out.println(llIIIIlII[llIIIIllI[57]]);
                            bv.add(new C0003d(llIIIIllI[10], llIIIIllI[58], llIIIIllI[14]));
                            "".length();
                        }
                    }
                    iArr6 = new int[llIIIIllI[1]];
                    iArr6[llIIIIllI[0]] = llIIIIllI[59];
                    if (lIlIIIllllIl(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr29 = new int[llIIIIllI[1]];
                        iArr29[llIIIIllI[0]] = llIIIIllI[59];
                        if (lIlIIIlllllI(Bank.getFirst(iArr29).getQuantity(), llIIIIllI[11])) {
                            System.out.println(llIIIIlII[llIIIIllI[60]]);
                            bv.add(new C0003d(llIIIIllI[59], llIIIIllI[58], llIIIIllI[14]));
                            "".length();
                        }
                    }
                    iArr7 = new int[llIIIIllI[1]];
                    iArr7[llIIIIllI[0]] = llIIIIllI[15];
                    if (lIlIIIllllIl(Bank.contains(iArr7) ? 1 : 0)) {
                        int[] iArr30 = new int[llIIIIllI[1]];
                        iArr30[llIIIIllI[0]] = llIIIIllI[15];
                        if (lIlIIIlllllI(Bank.getFirst(iArr30).getQuantity(), llIIIIllI[11])) {
                            System.out.println(llIIIIlII[llIIIIllI[61]]);
                            bv.add(new C0003d(llIIIIllI[15], llIIIIllI[58], llIIIIllI[14]));
                            "".length();
                        }
                    }
                    iArr8 = new int[llIIIIllI[1]];
                    iArr8[llIIIIllI[0]] = llIIIIllI[13];
                    if (lIlIIIllllIl(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr31 = new int[llIIIIllI[1]];
                        iArr31[llIIIIllI[0]] = llIIIIllI[13];
                        if (lIlIIIlllllI(Bank.getFirst(iArr31).getQuantity(), llIIIIllI[11])) {
                            System.out.println(llIIIIlII[llIIIIllI[62]]);
                            bv.add(new C0003d(llIIIIllI[13], llIIIIllI[58], llIIIIllI[14]));
                            "".length();
                        }
                    }
                    iArr9 = new int[llIIIIllI[1]];
                    iArr9[llIIIIllI[0]] = llIIIIllI[59];
                    if (lIlIIIllllll(Bank.contains(iArr9) ? 1 : 0)) {
                        System.out.println(llIIIIlII[llIIIIllI[63]]);
                        bv.add(new C0003d(llIIIIllI[59], llIIIIllI[58], llIIIIllI[14]));
                        "".length();
                    }
                    iArr10 = new int[llIIIIllI[1]];
                    iArr10[llIIIIllI[0]] = llIIIIllI[15];
                    if (lIlIIIllllll(Bank.contains(iArr10) ? 1 : 0)) {
                        System.out.println(llIIIIlII[llIIIIllI[64]]);
                        bv.add(new C0003d(llIIIIllI[15], llIIIIllI[58], llIIIIllI[14]));
                        "".length();
                    }
                    iArr11 = new int[llIIIIllI[1]];
                    iArr11[llIIIIllI[0]] = llIIIIllI[13];
                    if (lIlIIIllllll(Bank.contains(iArr11) ? 1 : 0)) {
                        System.out.println(llIIIIlII[llIIIIllI[65]]);
                        bv.add(new C0003d(llIIIIllI[13], llIIIIllI[58], llIIIIllI[14]));
                        "".length();
                    }
                    iArr12 = new int[llIIIIllI[1]];
                    iArr12[llIIIIllI[0]] = llIIIIllI[10];
                    if (lIlIIIllllll(Bank.contains(iArr12) ? 1 : 0)) {
                        return;
                    }
                    System.out.println(llIIIIlII[llIIIIllI[66]]);
                    bv.add(new C0003d(llIIIIllI[10], llIIIIllI[58], llIIIIllI[14]));
                    "".length();
                    return;
                }
                System.out.println(llIIIIlII[llIIIIllI[55]]);
                bv.add(new C0003d(llIIIIllI[7], llIIIIllI[30], llIIIIllI[53]));
                "".length();
                iArr4 = new int[llIIIIllI[1]];
                iArr4[llIIIIllI[0]] = llIIIIllI[27];
                if (lIlIIIllllll(Bank.contains(iArr4) ? 1 : 0)) {
                }
                iArr5 = new int[llIIIIllI[1]];
                iArr5[llIIIIllI[0]] = llIIIIllI[10];
                if (lIlIIIllllIl(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[llIIIIllI[1]];
                iArr6[llIIIIllI[0]] = llIIIIllI[59];
                if (lIlIIIllllIl(Bank.contains(iArr6) ? 1 : 0)) {
                }
                iArr7 = new int[llIIIIllI[1]];
                iArr7[llIIIIllI[0]] = llIIIIllI[15];
                if (lIlIIIllllIl(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[llIIIIllI[1]];
                iArr8[llIIIIllI[0]] = llIIIIllI[13];
                if (lIlIIIllllIl(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[llIIIIllI[1]];
                iArr9[llIIIIllI[0]] = llIIIIllI[59];
                if (lIlIIIllllll(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[llIIIIllI[1]];
                iArr10[llIIIIllI[0]] = llIIIIllI[15];
                if (lIlIIIllllll(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[llIIIIllI[1]];
                iArr11[llIIIIllI[0]] = llIIIIllI[13];
                if (lIlIIIllllll(Bank.contains(iArr11) ? 1 : 0)) {
                }
                iArr12 = new int[llIIIIllI[1]];
                iArr12[llIIIIllI[0]] = llIIIIllI[10];
                if (lIlIIIllllll(Bank.contains(iArr12) ? 1 : 0)) {
                }
            }
            System.out.println(llIIIIlII[llIIIIllI[52]]);
            bv.add(new C0003d(llIIIIllI[20], llIIIIllI[45], llIIIIllI[53]));
            "".length();
            iArr2 = new int[llIIIIllI[1]];
            iArr2[llIIIIllI[0]] = llIIIIllI[7];
            if (lIlIIIllllll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[llIIIIllI[1]];
            iArr3[llIIIIllI[0]] = llIIIIllI[7];
            if (lIlIIIllllIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
            System.out.println(llIIIIlII[llIIIIllI[55]]);
            bv.add(new C0003d(llIIIIllI[7], llIIIIllI[30], llIIIIllI[53]));
            "".length();
            iArr4 = new int[llIIIIllI[1]];
            iArr4[llIIIIllI[0]] = llIIIIllI[27];
            if (lIlIIIllllll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[llIIIIllI[1]];
            iArr5[llIIIIllI[0]] = llIIIIllI[10];
            if (lIlIIIllllIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[llIIIIllI[1]];
            iArr6[llIIIIllI[0]] = llIIIIllI[59];
            if (lIlIIIllllIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[llIIIIllI[1]];
            iArr7[llIIIIllI[0]] = llIIIIllI[15];
            if (lIlIIIllllIl(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[llIIIIllI[1]];
            iArr8[llIIIIllI[0]] = llIIIIllI[13];
            if (lIlIIIllllIl(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[llIIIIllI[1]];
            iArr9[llIIIIllI[0]] = llIIIIllI[59];
            if (lIlIIIllllll(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[llIIIIllI[1]];
            iArr10[llIIIIllI[0]] = llIIIIllI[15];
            if (lIlIIIllllll(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[llIIIIllI[1]];
            iArr11[llIIIIllI[0]] = llIIIIllI[13];
            if (lIlIIIllllll(Bank.contains(iArr11) ? 1 : 0)) {
            }
            iArr12 = new int[llIIIIllI[1]];
            iArr12[llIIIIllI[0]] = llIIIIllI[10];
            if (lIlIIIllllll(Bank.contains(iArr12) ? 1 : 0)) {
            }
        }
        System.out.println(llIIIIlII[llIIIIllI[48]]);
        bv.add(new C0003d(llIIIIllI[17], llIIIIllI[9], llIIIIllI[47]));
        "".length();
        if (lIlIIIllllll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llIIIIlII[llIIIIllI[85]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[llIIIIllI[1]];
        iArr[llIIIIllI[0]] = llIIIIllI[20];
        if (lIlIIIllllIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        System.out.println(llIIIIlII[llIIIIllI[52]]);
        bv.add(new C0003d(llIIIIllI[20], llIIIIllI[45], llIIIIllI[53]));
        "".length();
        iArr2 = new int[llIIIIllI[1]];
        iArr2[llIIIIllI[0]] = llIIIIllI[7];
        if (lIlIIIllllll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIIIIllI[1]];
        iArr3[llIIIIllI[0]] = llIIIIllI[7];
        if (lIlIIIllllIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        System.out.println(llIIIIlII[llIIIIllI[55]]);
        bv.add(new C0003d(llIIIIllI[7], llIIIIllI[30], llIIIIllI[53]));
        "".length();
        iArr4 = new int[llIIIIllI[1]];
        iArr4[llIIIIllI[0]] = llIIIIllI[27];
        if (lIlIIIllllll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[llIIIIllI[1]];
        iArr5[llIIIIllI[0]] = llIIIIllI[10];
        if (lIlIIIllllIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[llIIIIllI[1]];
        iArr6[llIIIIllI[0]] = llIIIIllI[59];
        if (lIlIIIllllIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[llIIIIllI[1]];
        iArr7[llIIIIllI[0]] = llIIIIllI[15];
        if (lIlIIIllllIl(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[llIIIIllI[1]];
        iArr8[llIIIIllI[0]] = llIIIIllI[13];
        if (lIlIIIllllIl(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[llIIIIllI[1]];
        iArr9[llIIIIllI[0]] = llIIIIllI[59];
        if (lIlIIIllllll(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[llIIIIllI[1]];
        iArr10[llIIIIllI[0]] = llIIIIllI[15];
        if (lIlIIIllllll(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[llIIIIllI[1]];
        iArr11[llIIIIllI[0]] = llIIIIllI[13];
        if (lIlIIIllllll(Bank.contains(iArr11) ? 1 : 0)) {
        }
        iArr12 = new int[llIIIIllI[1]];
        iArr12[llIIIIllI[0]] = llIIIIllI[10];
        if (lIlIIIllllll(Bank.contains(iArr12) ? 1 : 0)) {
        }
    }

    private static boolean lIlIIlIIIIll(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return llIIIIllI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v246, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v255, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v264, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v273, types: [boolean] */
    private static void ck() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIIlIIIIII(nearest) && lIlIIIllllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[71]];
            C0000a.a(nearest);
        }
        if (lIlIIlIIIIII(nearest) && lIlIIIllllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIIIllllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[72]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llIIIIllI[5]);
                "".length();
            }
            if (lIlIIIllllIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = llIIIIlII[llIIIIllI[73]];
                if (lIlIIlIIIIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llIIIIllI[4]);
                    "".length();
                }
                if (lIlIIlIIIIIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(llIIIIllI[3]);
                    "".length();
                }
                String[] strArr = new String[llIIIIllI[1]];
                strArr[llIIIIllI[0]] = llIIIIlII[llIIIIllI[74]];
                if (lIlIIIllllIl(Bank.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIIIIllI[1]];
                    strArr2[llIIIIllI[0]] = llIIIIlII[llIIIIllI[75]];
                    if (lIlIIIlllllI(Bank.getFirst(strArr2).getQuantity(), llIIIIllI[11])) {
                        af();
                        System.out.println(llIIIIlII[llIIIIllI[76]]);
                        bt = llIIIIllI[1];
                        return;
                    }
                }
                String[] strArr3 = new String[llIIIIllI[1]];
                strArr3[llIIIIllI[0]] = llIIIIlII[llIIIIllI[77]];
                if (lIlIIIllllIl(Bank.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[llIIIIllI[1]];
                    strArr4[llIIIIllI[0]] = llIIIIlII[llIIIIllI[78]];
                    if (lIlIIIlllllI(Bank.getFirst(strArr4).getQuantity(), llIIIIllI[11])) {
                        af();
                        System.out.println(llIIIIlII[llIIIIllI[79]]);
                        bt = llIIIIllI[1];
                        return;
                    }
                }
                String[] strArr5 = new String[llIIIIllI[1]];
                strArr5[llIIIIllI[0]] = llIIIIlII[llIIIIllI[80]];
                if (lIlIIIllllIl(Bank.contains(strArr5) ? 1 : 0)) {
                    String[] strArr6 = new String[llIIIIllI[1]];
                    strArr6[llIIIIllI[0]] = llIIIIlII[llIIIIllI[81]];
                    if (lIlIIIlllllI(Bank.getFirst(strArr6).getQuantity(), llIIIIllI[11])) {
                        af();
                        System.out.println(llIIIIlII[llIIIIllI[82]]);
                        bt = llIIIIllI[1];
                        return;
                    }
                }
                int[] iArr = new int[llIIIIllI[19]];
                iArr[llIIIIllI[0]] = llIIIIllI[20];
                iArr[llIIIIllI[1]] = llIIIIllI[21];
                iArr[llIIIIllI[3]] = llIIIIllI[22];
                iArr[llIIIIllI[4]] = llIIIIllI[23];
                iArr[llIIIIllI[6]] = llIIIIllI[24];
                iArr[llIIIIllI[9]] = llIIIIllI[7];
                iArr[llIIIIllI[12]] = llIIIIllI[17];
                iArr[llIIIIllI[14]] = llIIIIllI[25];
                iArr[llIIIIllI[16]] = llIIIIllI[10];
                iArr[llIIIIllI[18]] = llIIIIllI[15];
                iArr[llIIIIllI[8]] = llIIIIllI[13];
                if (lIlIIIllllll(C0004e.b(iArr) ? 1 : 0)) {
                    af();
                    System.out.println(llIIIIlII[llIIIIllI[83]]);
                    bt = llIIIIllI[1];
                    return;
                }
                while (lIlIIIllllll(C0025z.bi() ? 1 : 0)) {
                    C0025z.bg();
                    Time.sleepTicks(llIIIIllI[1]);
                    "".length();
                    "".length();
                    if ((((209 ^ 128) ^ (41 ^ 90)) & (((59 ^ 8) ^ (185 ^ 168)) ^ (-" ".length()))) >= " ".length()) {
                        return;
                    }
                }
                if (lIlIIIllllll(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepTicks(llIIIIllI[6]);
                    "".length();
                }
                int[] iArr2 = new int[llIIIIllI[1]];
                iArr2[llIIIIllI[0]] = llIIIIllI[22];
                if (lIlIIIllllIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIIIIllI[1]];
                    iArr3[llIIIIllI[0]] = llIIIIllI[22];
                    if (lIlIIIlllllI(Inventory.getCount(iArr3), llIIIIllI[1])) {
                        Bank.withdraw(llIIIIllI[22], llIIIIllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIIIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr4 = new int[llIIIIllI[1]];
                            iArr4[llIIIIllI[0]] = llIIIIllI[22];
                            if (lIlIIlIIIIIl(Inventory.getCount(iArr4))) {
                                ?? r0 = llIIIIllI[1];
                                "".length();
                                return "  ".length() <= ((42 ^ 124) & ((5 ^ 83) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIIllI[0];
                        }, llIIIIllI[5]);
                        "".length();
                    }
                }
                int[] iArr4 = new int[llIIIIllI[1]];
                iArr4[llIIIIllI[0]] = llIIIIllI[23];
                if (lIlIIIllllIl(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[llIIIIllI[1]];
                    iArr5[llIIIIllI[0]] = llIIIIllI[23];
                    if (lIlIIIlllllI(Inventory.getCount(iArr5), llIIIIllI[1])) {
                        Bank.withdraw(llIIIIllI[23], llIIIIllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIIIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr6 = new int[llIIIIllI[1]];
                            iArr6[llIIIIllI[0]] = llIIIIllI[23];
                            if (lIlIIlIIIIIl(Inventory.getCount(iArr6))) {
                                ?? r0 = llIIIIllI[1];
                                "".length();
                                return 0 != 0 ? ((99 ^ 46) ^ (73 ^ 88)) & (((((147 + 9) - 121) + 175) ^ (((104 + 116) - 136) + 58)) ^ (-" ".length())) : r0;
                            }
                            return llIIIIllI[0];
                        }, llIIIIllI[5]);
                        "".length();
                    }
                }
                int[] iArr6 = new int[llIIIIllI[1]];
                iArr6[llIIIIllI[0]] = llIIIIllI[21];
                if (lIlIIIllllIl(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[llIIIIllI[1]];
                    iArr7[llIIIIllI[0]] = llIIIIllI[21];
                    if (lIlIIIlllllI(Inventory.getCount(iArr7), llIIIIllI[1])) {
                        Bank.withdraw(llIIIIllI[21], llIIIIllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIIIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr8 = new int[llIIIIllI[1]];
                            iArr8[llIIIIllI[0]] = llIIIIllI[21];
                            if (lIlIIlIIIIIl(Inventory.getCount(iArr8))) {
                                ?? r0 = llIIIIllI[1];
                                "".length();
                                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIIllI[0];
                        }, llIIIIllI[5]);
                        "".length();
                    }
                }
                int[] iArr8 = new int[llIIIIllI[1]];
                iArr8[llIIIIllI[0]] = llIIIIllI[24];
                if (lIlIIIllllIl(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[llIIIIllI[1]];
                    iArr9[llIIIIllI[0]] = llIIIIllI[24];
                    if (lIlIIIlllllI(Inventory.getCount(iArr9), llIIIIllI[1])) {
                        Bank.withdraw(llIIIIllI[24], llIIIIllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIIIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr10 = new int[llIIIIllI[1]];
                            iArr10[llIIIIllI[0]] = llIIIIllI[24];
                            if (lIlIIlIIIIIl(Inventory.getCount(iArr10))) {
                                ?? r0 = llIIIIllI[1];
                                "".length();
                                return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIIllI[0];
                        }, llIIIIllI[5]);
                        "".length();
                    }
                }
                int[] iArr10 = new int[llIIIIllI[1]];
                iArr10[llIIIIllI[0]] = llIIIIllI[7];
                if (lIlIIIllllIl(Bank.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[llIIIIllI[1]];
                    iArr11[llIIIIllI[0]] = llIIIIllI[7];
                    if (lIlIIIlllllI(Inventory.getCount(iArr11), llIIIIllI[1])) {
                        Bank.withdraw(llIIIIllI[7], llIIIIllI[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIIIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr12 = new int[llIIIIllI[1]];
                            iArr12[llIIIIllI[0]] = llIIIIllI[7];
                            if (lIlIIlIIIIIl(Inventory.getCount(iArr12))) {
                                ?? r0 = llIIIIllI[1];
                                "".length();
                                return ((245 ^ 191) & ((105 ^ 35) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIIllI[0];
                        }, llIIIIllI[5]);
                        "".length();
                    }
                }
                int[] iArr12 = new int[llIIIIllI[1]];
                iArr12[llIIIIllI[0]] = llIIIIllI[17];
                if (lIlIIIllllIl(Bank.contains(iArr12) ? 1 : 0)) {
                    int[] iArr13 = new int[llIIIIllI[1]];
                    iArr13[llIIIIllI[0]] = llIIIIllI[17];
                    if (lIlIIIlllllI(Inventory.getCount(iArr13), llIIIIllI[1])) {
                        Bank.withdraw(llIIIIllI[17], llIIIIllI[6], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIIIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr14 = new int[llIIIIllI[1]];
                            iArr14[llIIIIllI[0]] = llIIIIllI[17];
                            if (lIlIIlIIIIIl(Inventory.getCount(iArr14))) {
                                ?? r0 = llIIIIllI[1];
                                "".length();
                                return (((89 ^ 0) ^ (254 ^ 132)) & (((((56 + 6) - (-86)) + 25) ^ (((30 + 2) - (-56)) + 54)) ^ (-" ".length()))) >= "   ".length() ? ((184 ^ 140) ^ (77 ^ 125)) & (((58 ^ 107) ^ (74 ^ 31)) ^ (-" ".length())) : r0;
                            }
                            return llIIIIllI[0];
                        }, llIIIIllI[5]);
                        "".length();
                    }
                }
                int[] iArr14 = new int[llIIIIllI[1]];
                iArr14[llIIIIllI[0]] = llIIIIllI[10];
                if (lIlIIIllllIl(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llIIIIllI[1]];
                    iArr15[llIIIIllI[0]] = llIIIIllI[10];
                    if (lIlIIIlllllI(Inventory.getCount(iArr15), llIIIIllI[1])) {
                        Bank.withdraw(llIIIIllI[10], llIIIIllI[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIIIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[llIIIIllI[1]];
                            iArr16[llIIIIllI[0]] = llIIIIllI[10];
                            if (lIlIIlIIIIIl(Inventory.getCount(iArr16))) {
                                ?? r0 = llIIIIllI[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIIllI[0];
                        }, llIIIIllI[5]);
                        "".length();
                    }
                }
                int[] iArr16 = new int[llIIIIllI[1]];
                iArr16[llIIIIllI[0]] = llIIIIllI[15];
                if (lIlIIIllllIl(Bank.contains(iArr16) ? 1 : 0)) {
                    int[] iArr17 = new int[llIIIIllI[1]];
                    iArr17[llIIIIllI[0]] = llIIIIllI[15];
                    if (lIlIIIlllllI(Inventory.getCount(iArr17), llIIIIllI[1])) {
                        Bank.withdraw(llIIIIllI[15], llIIIIllI[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIIIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr18 = new int[llIIIIllI[1]];
                            iArr18[llIIIIllI[0]] = llIIIIllI[15];
                            if (lIlIIlIIIIIl(Inventory.getCount(iArr18))) {
                                ?? r0 = llIIIIllI[1];
                                "".length();
                                return (((66 ^ 98) ^ (131 ^ 135)) & (((39 ^ 106) ^ (52 ^ 93)) ^ (-" ".length()))) != 0 ? ((72 ^ 38) ^ (237 ^ 158)) & (((((51 + 150) - 57) + 32) ^ (((49 + 95) - 127) + 156)) ^ (-" ".length())) : r0;
                            }
                            return llIIIIllI[0];
                        }, llIIIIllI[5]);
                        "".length();
                    }
                }
                int[] iArr18 = new int[llIIIIllI[1]];
                iArr18[llIIIIllI[0]] = llIIIIllI[13];
                if (lIlIIIllllIl(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[llIIIIllI[1]];
                    iArr19[llIIIIllI[0]] = llIIIIllI[13];
                    if (lIlIIIlllllI(Inventory.getCount(iArr19), llIIIIllI[1])) {
                        Bank.withdraw(llIIIIllI[13], llIIIIllI[26], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIIIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr20 = new int[llIIIIllI[1]];
                            iArr20[llIIIIllI[0]] = llIIIIllI[13];
                            if (lIlIIlIIIIIl(Inventory.getCount(iArr20))) {
                                ?? r0 = llIIIIllI[1];
                                "".length();
                                return 0 != 0 ? ((((105 + 122) - 72) + 64) ^ (((12 + 104) - (-17)) + 63)) & (((50 ^ 13) ^ (172 ^ 140)) ^ (-" ".length())) : r0;
                            }
                            return llIIIIllI[0];
                        }, llIIIIllI[5]);
                        "".length();
                    }
                }
                int[] iArr20 = new int[llIIIIllI[1]];
                iArr20[llIIIIllI[0]] = llIIIIllI[27];
                if (lIlIIIllllIl(Bank.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[llIIIIllI[1]];
                    iArr21[llIIIIllI[0]] = llIIIIllI[27];
                    if (lIlIIIllllll(Inventory.contains(iArr21) ? 1 : 0)) {
                        Bank.withdraw(llIIIIllI[27], llIIIIllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIIIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr22 = new int[llIIIIllI[1]];
                            iArr22[llIIIIllI[0]] = llIIIIllI[27];
                            return Inventory.contains(iArr22);
                        }, llIIIIllI[5]);
                        "".length();
                    }
                }
                int[] iArr22 = new int[llIIIIllI[1]];
                iArr22[llIIIIllI[0]] = llIIIIllI[25];
                if (lIlIIIllllIl(Bank.contains(iArr22) ? 1 : 0)) {
                    int[] iArr23 = new int[llIIIIllI[1]];
                    iArr23[llIIIIllI[0]] = llIIIIllI[25];
                    if (lIlIIIlllllI(Inventory.getCount(iArr23), llIIIIllI[1])) {
                        Bank.withdrawAll(llIIIIllI[25], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIIIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr24 = new int[llIIIIllI[1]];
                            iArr24[llIIIIllI[0]] = llIIIIllI[25];
                            if (lIlIIlIIIIIl(Inventory.getCount(iArr24))) {
                                ?? r0 = llIIIIllI[1];
                                "".length();
                                return " ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIIllI[0];
                        }, llIIIIllI[5]);
                        "".length();
                    }
                }
            }
        }
    }

    private static String lIlIIIllIlIl(String lIlllIllIIllIl, String lIlllIllIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIllIIllll = Cipher.getInstance("Blowfish");
            lIlllIllIIllll.init(llIIIIllI[3], secretKeySpec);
            return new String(lIlllIllIIllll.doFinal(Base64.getDecoder().decode(lIlllIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIllIIlllI) {
            lIlllIllIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIlIl(int i, int i2) {
        return i >= i2;
    }

    static {
        lIlIIIllllII();
        lIlIIIlllIll();
        jv = llIIIIllI[15];
        jy = llIIIIllI[25];
        jw = llIIIIllI[13];
        js = llIIIIllI[23];
        jr = llIIIIllI[22];
        jz = llIIIIllI[17];
        jx = llIIIIllI[86];
        jp = llIIIIllI[2];
        jq = llIIIIllI[21];
        jt = llIIIIllI[24];
        ju = llIIIIllI[10];
        jo = new WorldPoint(llIIIIllI[87], llIIIIllI[88], llIIIIllI[3]);
        bv = new ArrayList();
        iw = llIIIIlII[llIIIIllI[89]];
        String[] strArr = new String[llIIIIllI[12]];
        strArr[llIIIIllI[0]] = llIIIIlII[llIIIIllI[90]];
        strArr[llIIIIllI[1]] = llIIIIlII[llIIIIllI[91]];
        strArr[llIIIIllI[3]] = llIIIIlII[llIIIIllI[92]];
        strArr[llIIIIllI[4]] = llIIIIlII[llIIIIllI[93]];
        strArr[llIIIIllI[6]] = llIIIIlII[llIIIIllI[94]];
        strArr[llIIIIllI[9]] = llIIIIlII[llIIIIllI[95]];
        hl = strArr;
        bT = llIIIIllI[0];
    }

    private static void lIlIIIllllII() {
        llIIIIllI = new int[97];
        llIIIIllI[0] = ((118 ^ 35) ^ (118 ^ 63)) & (((81 ^ 21) ^ (112 ^ 40)) ^ (-" ".length()));
        llIIIIllI[1] = " ".length();
        llIIIIllI[2] = ((3 + 64) - (-21)) + 72;
        llIIIIllI[3] = "  ".length();
        llIIIIllI[4] = "   ".length();
        llIIIIllI[5] = (-8305) & 13304;
        llIIIIllI[6] = 170 ^ 174;
        llIIIIllI[7] = (-5) & 8013;
        llIIIIllI[8] = (163 ^ 190) ^ (1 ^ 22);
        llIIIIllI[9] = 66 ^ 71;
        llIIIIllI[10] = (-30801) & 31358;
        llIIIIllI[11] = (-((-12681) & 13707)) & (-28690) & 30715;
        llIIIIllI[12] = (60 ^ 95) ^ (86 ^ 51);
        llIIIIllI[13] = (-24003) & 24559;
        llIIIIllI[14] = 9 ^ 14;
        llIIIIllI[15] = (-((-4707) & 31459)) & (-1297) & 28603;
        llIIIIllI[16] = (((71 + 147) - 100) + 51) ^ (((68 + 84) - 76) + 85);
        llIIIIllI[17] = (-16397) & 18381;
        llIIIIllI[18] = (48 ^ 6) ^ (50 ^ 13);
        llIIIIllI[19] = (25 ^ 116) ^ (7 ^ 97);
        llIIIIllI[20] = (-((-18693) & 27069)) & (-1) & 16383;
        llIIIIllI[21] = (-19009) & 20478;
        llIIIIllI[22] = (-10796) & 12267;
        llIIIIllI[23] = (-18970) & 20443;
        llIIIIllI[24] = (-22538) & 24013;
        llIIIIllI[25] = (-27653) & 28031;
        llIIIIllI[26] = (-26123) & 26622;
        llIIIIllI[27] = (-1185) & 13809;
        llIIIIllI[28] = (-1289) & 3868;
        llIIIIllI[29] = (-4819) & 7898;
        llIIIIllI[30] = (19 ^ 86) ^ (93 ^ 12);
        llIIIIllI[31] = (49 ^ 74) ^ (210 ^ 166);
        llIIIIllI[32] = (114 ^ 102) ^ (181 ^ 173);
        llIIIIllI[33] = (((96 + 65) - 115) + 144) ^ (((3 + 67) - (-10)) + 99);
        llIIIIllI[34] = 149 ^ 155;
        llIIIIllI[35] = 31 ^ 15;
        llIIIIllI[36] = 164 ^ 181;
        llIIIIllI[37] = (-16457) & 25966;
        llIIIIllI[38] = 186 ^ 168;
        llIIIIllI[39] = (-((-839) & 8015)) & (-16450) & 32735;
        llIIIIllI[40] = (3 ^ 41) ^ (143 ^ 182);
        llIIIIllI[41] = 189 ^ 168;
        llIIIIllI[42] = (56 ^ 62) ^ (232 ^ 138);
        llIIIIllI[43] = (-((-1046) & 22071)) & (-11331) & 32755;
        llIIIIllI[44] = (141 ^ 189) ^ (54 ^ 16);
        llIIIIllI[45] = 79 ^ 103;
        llIIIIllI[46] = 174 ^ 185;
        llIIIIllI[47] = (-((-22995) & 24019)) & (-10) & 6143;
        llIIIIllI[48] = (40 ^ 62) ^ (153 ^ 151);
        llIIIIllI[49] = 112 ^ 105;
        llIIIIllI[50] = (-((-198) & 20695)) & (-1) & 32477;
        llIIIIllI[51] = (-((-19049) & 31487)) & (-1025) & 30462;
        llIIIIllI[52] = (236 ^ 153) ^ (82 ^ 61);
        llIIIIllI[53] = (-((-1185) & 31905)) & (-20) & 32639;
        llIIIIllI[54] = (((97 + 71) - 59) + 109) ^ (((176 + 126) - 272) + 163);
        llIIIIllI[55] = 83 ^ 79;
        llIIIIllI[56] = 166 ^ 187;
        llIIIIllI[57] = (((24 + 24) - (-49)) + 36) ^ (((9 + 152) - 122) + 116);
        llIIIIllI[58] = (-18433) & 20432;
        llIIIIllI[59] = (-8322) & 8877;
        llIIIIllI[60] = (149 ^ 187) ^ (12 ^ 61);
        llIIIIllI[61] = (246 ^ 140) ^ (237 ^ 183);
        llIIIIllI[62] = (124 ^ 81) ^ (116 ^ 120);
        llIIIIllI[63] = (236 ^ 157) ^ (246 ^ 165);
        llIIIIllI[64] = 137 ^ 170;
        llIIIIllI[65] = (((64 + 1) - (-58)) + 13) ^ (((134 + 74) - 128) + 92);
        llIIIIllI[66] = 9 ^ 44;
        llIIIIllI[67] = 181 ^ 147;
        llIIIIllI[68] = 178 ^ 149;
        llIIIIllI[69] = (175 ^ 189) ^ (105 ^ 82);
        llIIIIllI[70] = 42 ^ 0;
        llIIIIllI[71] = (((139 + 29) - 16) + 4) ^ (((10 + 32) - (-14)) + 127);
        llIIIIllI[72] = (137 ^ 164) ^ " ".length();
        llIIIIllI[73] = (28 ^ 83) ^ (2 ^ 96);
        llIIIIllI[74] = (88 ^ 67) ^ (132 ^ 177);
        llIIIIllI[75] = 170 ^ 133;
        llIIIIllI[76] = 48 ^ 0;
        llIIIIllI[77] = (((148 + 160) - 255) + 126) ^ (((52 + 98) - 117) + 97);
        llIIIIllI[78] = (98 ^ 46) ^ (49 ^ 79);
        llIIIIllI[79] = (14 ^ 65) ^ (94 ^ 34);
        llIIIIllI[80] = 51 ^ 7;
        llIIIIllI[81] = "   ".length() ^ (184 ^ 142);
        llIIIIllI[82] = (((80 + 8) - (-21)) + 30) ^ (((87 + 170) - 205) + 137);
        llIIIIllI[83] = 135 ^ 176;
        llIIIIllI[84] = (((72 + 172) - 197) + 144) ^ (((21 + 54) - 15) + 75);
        llIIIIllI[85] = 95 ^ 102;
        llIIIIllI[86] = (-10310) & 10863;
        llIIIIllI[87] = (-28938) & 32041;
        llIIIIllI[88] = (-12965) & 16127;
        llIIIIllI[89] = (((90 + 99) - 152) + 94) ^ (((162 + 94) - 231) + 160);
        llIIIIllI[90] = 144 ^ 171;
        llIIIIllI[91] = 97 ^ 93;
        llIIIIllI[92] = (191 ^ 166) ^ (74 ^ 110);
        llIIIIllI[93] = 116 ^ 74;
        llIIIIllI[94] = 96 ^ 95;
        llIIIIllI[95] = 22 ^ 86;
        llIIIIllI[96] = (174 ^ 184) ^ (209 ^ 134);
    }

    private static boolean lIlIIlIIIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlIIIlII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIIlIIIIIl(int i) {
        return i > 0;
    }

    private static boolean lIlIIIlllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIlIIIIlI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean bH() {
        String[] strArr = new String[llIIIIllI[1]];
        strArr[llIIIIllI[0]] = llIIIIlII[llIIIIllI[67]];
        if (lIlIIIllllIl(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[llIIIIllI[1]];
            strArr2[llIIIIllI[0]] = llIIIIlII[llIIIIllI[68]];
            if (lIlIIIllllIl(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[llIIIIllI[1]];
                strArr3[llIIIIllI[0]] = llIIIIlII[llIIIIllI[45]];
                if (lIlIIIllllIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[llIIIIllI[1]];
                    strArr4[llIIIIllI[0]] = llIIIIlII[llIIIIllI[69]];
                    if (lIlIIIllllIl(Inventory.contains(strArr4) ? 1 : 0)) {
                        int[] iArr = new int[llIIIIllI[1]];
                        iArr[llIIIIllI[0]] = llIIIIllI[10];
                        if (lIlIIIllllIl(Inventory.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llIIIIllI[1]];
                            iArr2[llIIIIllI[0]] = llIIIIllI[15];
                            if (lIlIIIllllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                                int[] iArr3 = new int[llIIIIllI[1]];
                                iArr3[llIIIIllI[0]] = llIIIIllI[13];
                                if (lIlIIIllllIl(Inventory.contains(iArr3) ? 1 : 0)) {
                                    int[] iArr4 = new int[llIIIIllI[1]];
                                    iArr4[llIIIIllI[0]] = llIIIIllI[7];
                                    if (lIlIIIllllIl(Inventory.contains(iArr4) ? 1 : 0)) {
                                        int[] iArr5 = new int[llIIIIllI[1]];
                                        iArr5[llIIIIllI[0]] = llIIIIllI[25];
                                        if (lIlIIIllllIl(Inventory.contains(iArr5) ? 1 : 0)) {
                                            String[] strArr5 = new String[llIIIIllI[1]];
                                            strArr5[llIIIIllI[0]] = llIIIIlII[llIIIIllI[70]];
                                            if (lIlIIIllllIl(Inventory.contains(strArr5) ? 1 : 0)) {
                                                ?? r0 = llIIIIllI[1];
                                                "".length();
                                                return "   ".length() == 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return llIIIIllI[0];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return llIIIIlII[llIIIIllI[84]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIlIIlIIIlIl(C0004e.j(llIIIIllI[2]), llIIIIllI[3])) {
            ?? r0 = llIIIIllI[1];
            "".length();
            return (((240 ^ 130) ^ (103 ^ 38)) & (((106 ^ 103) ^ (154 ^ 164)) ^ (-" ".length()))) != 0 ? ((((133 + 119) - 182) + 92) ^ (((105 + 53) - 134) + 131)) & (((205 ^ 158) ^ (202 ^ 160)) ^ (-" ".length())) : r0;
        }
        return llIIIIllI[0];
    }

    private static String lIlIIIllIlll(String lIlllIllIllIlI, String lIlllIllIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIllIllIIl.getBytes(StandardCharsets.UTF_8)), llIIIIllI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlllIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIllIllIll) {
            lIlllIllIllIll.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIlllIll() {
        llIIIIlII = new String[llIIIIllI[96]];
        llIIIIlII[llIIIIllI[0]] = lIlIIIllIlIl("t4zfNTV4J5J6BSbkBBukSg==", "pLMzM");
        llIIIIlII[llIIIIllI[1]] = lIlIIIllIllI("HBsJASYyFwNINy8LDgYyehsTDTgpXkcbIjMGBAA8NBVHCjQ5GUccOnoDEg0mLhsJDw==", "ZrghU");
        llIIIIlII[llIIIIllI[3]] = lIlIIIllIlIl("vsLHg29MR+8y5CHYjcgYQueel1mH0Iz3", "pJzzw");
        llIIIIlII[llIIIIllI[4]] = lIlIIIllIllI("PSc0PC8cMHEwJxw8", "rWQRF");
        llIIIIlII[llIIIIllI[6]] = lIlIIIllIlll("tPDy5oO0Tu/9w/orFTCVEoF5U9Xnq/ZN", "Qhegr");
        llIIIIlII[llIIIIllI[9]] = lIlIIIllIlIl("k/bGz8vnw/OcdP7ubzvnnpnKverjwFXRJXARynPIKEHFUsyzncSCRI3JLUhqfiHM", "IUfRa");
        llIIIIlII[llIIIIllI[12]] = lIlIIIllIlIl("3PvROzJnI/lmczca8ZTrjsoXMSTaEJYpDT5ZnlLdPub6Y7P8rbvaJONGHsWiRrJl", "PAJmD");
        llIIIIlII[llIIIIllI[14]] = lIlIIIllIllI("BABGKTY2RQshNyAMCC9kIBAWOCg6ABVkZCASDzwnOwwIL2QnCkYKEQosKA8=", "SefHD");
        llIIIIlII[llIIIIllI[16]] = lIlIIIllIllI("IhNqAwoQVicLCwYfJAVYBgM6EhQcEzlOWAYBIxYbHR8kBVgBGWogLSw/BCU=", "uvJbx");
        llIIIIlII[llIIIIllI[18]] = lIlIIIllIlll("iVpy9BbLXjQh/MwJ7gL4/QpdlcLy7AvBwVGvpcfDqna4R8zvJTusAq+Y5/LnRquj", "oSsQY");
        llIIIIlII[llIIIIllI[8]] = lIlIIIllIlll("Hx/knsAHtgoeqdmGyY7IeLVewYUlQauYeuMIj4+EOpYKtUxKlocyF+xr4yx6kX6O", "UqFSq");
        llIIIIlII[llIIIIllI[19]] = lIlIIIllIllI("EC8YCS0pKVQWK2cnGRJkNDoVEDA=", "GNtbD");
        llIIIIlII[llIIIIllI[32]] = lIlIIIllIlIl("WzLEZeGkDIX8BK4bJMhzOg==", "Jpfhe");
        llIIIIlII[llIIIIllI[33]] = lIlIIIllIllI("Cxw2JBM=", "NrBAa");
        llIIIIlII[llIIIIllI[34]] = lIlIIIllIlIl("tQgdzVPKIoQDzRFKmPn6jw==", "AWWnI");
        llIIIIlII[llIIIIllI[31]] = lIlIIIllIlIl("w3Gk8kdhV01/UQhCK7c7ug==", "SAGFS");
        llIIIIlII[llIIIIllI[35]] = lIlIIIllIlll("pMhHh6SlQPrWAqOw2cz8vg==", "JTyNl");
        llIIIIlII[llIIIIllI[36]] = lIlIIIllIlll("tkdtOOvRTMA+OWQ4u9lusIjMdEcmQPP/xIXMk/GokJQ=", "BQnvt");
        llIIIIlII[llIIIIllI[38]] = lIlIIIllIlll("iL7+osjI21T7MNv5rPA2SKFLKj2sxAUNBcBU56/vb00=", "KKIwa");
        llIIIIlII[llIIIIllI[40]] = lIlIIIllIlIl("REQzb6mR+lpgOkivKWyjoXILoVgf0FW8AbctO9temEY=", "poZdA");
        llIIIIlII[llIIIIllI[30]] = lIlIIIllIllI("LAYiHDcKQjEdMBkHZhc8DAZmATZNADMMeQELNQE=", "mbFuY");
        llIIIIlII[llIIIIllI[41]] = lIlIIIllIlll("kmX78TEcg/Z6fln4esDK97SQTvDyt86f8sYsCWxTdl0=", "ENutW");
        llIIIIlII[llIIIIllI[44]] = lIlIIIllIlll("7iY+QBGmgD/qAip181SztMnK1aomnxSgzXk9MWtRtBA=", "RNSJN");
        llIIIIlII[llIIIIllI[46]] = lIlIIIllIlIl("Fbg6kpouF3uI/BWVeIYRLbdWGESHe6qtAI4GGtcxxcA=", "tiIRr");
        llIIIIlII[llIIIIllI[48]] = lIlIIIllIlIl("5tIkVDaPw3oooxOiPTeW0tVkqKIhYXOT5Rh7gggrKgQ=", "OtrDT");
        llIIIIlII[llIIIIllI[49]] = lIlIIIllIlIl("kxnKme0yEbh5qdf/ls8H9qne7F0ui9bfqH6oue88gsU=", "ipspd");
        llIIIIlII[llIIIIllI[52]] = lIlIIIllIlll("MD74Ml0s68gGcLwDvuNnqM6uzBN1rhRMy0QeVK0LvvU=", "ZLgQT");
        llIIIIlII[llIIIIllI[54]] = lIlIIIllIlll("0WSKfx2nN0+vW6EmOSQs/n85jOqIb+TOrGYE5S49Ol0=", "iBkei");
        llIIIIlII[llIIIIllI[55]] = lIlIIIllIllI("ODIoADoedioIOBUvbB01GyVsHTtZNDkQdBU/Px0=", "yVLiT");
        llIIIIlII[llIIIIllI[56]] = lIlIIIllIllI("CwosABotTjsdFScHJggHahonSRY/F2gFHTka", "JnHit");
        llIIIIlII[llIIIIllI[57]] = lIlIIIllIllI("JSoJPAkDbgA8CQBuHyAJAT1NIQhELBgsRwgnHiE=", "dNmUg");
        llIIIIlII[llIIIIllI[60]] = lIlIIIllIlIl("t4kSUtC7WXLrPAUuXFVDJoV1oS7wqQW8NmwBtdfJHHA=", "roJHD");
        llIIIIlII[llIIIIllI[61]] = lIlIIIllIlll("X/BKMdeX5u/t+c9aCiS/Q8FfpRyadnrxVfM3zIMEbPM=", "jizyD");
        llIIIIlII[llIIIIllI[62]] = lIlIIIllIlll("k4te4mvkPBUR+8Kqz3MA43Q5oVsyQFMJTVy88QpLwYg=", "vBqQw");
        llIIIIlII[llIIIIllI[63]] = lIlIIIllIlll("PgemuZT5C1E8PVWTwlk7TfOuy2xTcWiQfsHTbz7/dOA=", "tLZRS");
        llIIIIlII[llIIIIllI[64]] = lIlIIIllIllI("NiAPHRQQZBwVDhI2SwYPGSEYVA4YZAkBA1coAgcO", "wDktz");
        llIIIIlII[llIIIIllI[65]] = lIlIIIllIlll("PuegpO9UnAuRXmZpL7VwAtz/iQzOydlhmvYQ3B1/xno=", "wmiwL");
        llIIIIlII[llIIIIllI[66]] = lIlIIIllIlIl("qA66SXjjEGPCbqB6eiJHT6qmwdLYaUxlbP+OriBcvpo=", "XPqNU");
        llIIIIlII[llIIIIllI[67]] = lIlIIIllIlIl("VLBCR+X7Cd4G1hUy8AMLFA==", "YFTry");
        llIIIIlII[llIIIIllI[68]] = lIlIIIllIlIl("q/j5QGVCyRb+16l1+bI0Ag==", "gVCbf");
        llIIIIlII[llIIIIllI[45]] = lIlIIIllIllI("FgYXOwN0CBM5DA==", "TjvXh");
        llIIIIlII[llIIIIllI[69]] = lIlIIIllIllI("NCYoOjZDLCQvNw==", "cNANS");
        llIIIIlII[llIIIIllI[70]] = lIlIIIllIllI("CQ4nPQQv", "JfBXw");
        llIIIIlII[llIIIIllI[71]] = lIlIIIllIllI("BCwDOCsrORw/K2o5GnEuKyMe", "JMuQL");
        llIIIIlII[llIIIIllI[72]] = lIlIIIllIllI("GhwKFho7C08aEjsH", "Uloxs");
        llIIIIlII[llIIIIllI[73]] = lIlIIIllIlll("hb2IVAXMvLyTqPEHlTOVTleEWZu0BY1e", "DFmwT");
        llIIIIlII[llIIIIllI[74]] = lIlIIIllIlIl("FipbkHUp47wmQf+CSlZwxg==", "gRHVI");
        llIIIIlII[llIIIIllI[75]] = lIlIIIllIlIl("6Y65trNr8roN9u+QM5JA9w==", "adIaJ");
        llIIIIlII[llIIIIllI[76]] = lIlIIIllIlIl("17eOrop82rCtCLt6uTg3XzjVkMU2llWpe16COCfm3LDAQgjcCPwBTTYVnbVbqoJM", "UPkYM");
        llIIIIlII[llIIIIllI[77]] = lIlIIIllIlIl("qwzJ1apByOeBE4I3+mKQww==", "vUZxn");
        llIIIIlII[llIIIIllI[78]] = lIlIIIllIllI("JyMYPCtCMB8mJg==", "bBjHC");
        llIIIIlII[llIIIIllI[79]] = lIlIIIllIlll("Mb3/KumyjIdmlyxSsQ/C2ANi4DKc03agky2A1HE3Ik/NHWmEI3GlMI9p3FNfdWb7", "lyDjs");
        llIIIIlII[llIIIIllI[80]] = lIlIIIllIlll("Neec1sEd5/nd46suPZS9Xg==", "yDxyy");
        llIIIIlII[llIIIIllI[81]] = lIlIIIllIllI("JBkWMAdTChc7EA==", "sxbUu");
        llIIIIlII[llIIIIllI[82]] = lIlIIIllIllI("BT95DgA3ejQGASEzNwhSIS8pHx47PypDUiEtMBsROjM3CFImNXktJwsTFyg=", "RZYor");
        llIIIIlII[llIIIIllI[83]] = lIlIIIllIlll("EHfP/WTpjk/8J82BlYV5jsrZebWrTB5pZsWxkii/efOtmeEAJqnVm9+u4i0BgtPr", "BiqXl");
        llIIIIlII[llIIIIllI[84]] = lIlIIIllIllI("OwkzRwsTECAPLQBEMhItARA=", "rdCgH");
        llIIIIlII[llIIIIllI[85]] = lIlIIIllIlll("r/qFMys7T5iEYY8CG3qpuuPGmyj3AV7L", "nzFlG");
        llIIIIlII[llIIIIllI[89]] = lIlIIIllIllI("PCYSJgcPbyUuDwwgDw==", "kOhGu");
        llIIIIlII[llIIIIllI[90]] = lIlIIIllIllI("BQMiFGovD3QQajMfMQI+Yho4FCsxD3o=", "BjTqJ");
        llIIIIlII[llIIIIllI[91]] = lIlIIIllIlll("CUbkN2yRTMJ09N5GgRRbwQ==", "ujkkX");
        llIIIIlII[llIIIIllI[92]] = lIlIIIllIlll("OgqQzd/mTXfW3QjqoHXv/J+5dXq7puM1tY5NwZ3usaUbVsCIiZdPNRQcd+GU9vPq", "WqQLp");
        llIIIIlII[llIIIIllI[93]] = lIlIIIllIllI("HR02Qw==", "DxEmO");
        llIIIIlII[llIIIIllI[94]] = lIlIIIllIlll("Qi9R6ak+u3Ve7INCYRVJHQKr+1QgkVu+", "mRnRw");
        llIIIIlII[llIIIIllI[95]] = lIlIIIllIlll("EyFpFwNouZkbW8Ugx/U5b5HiUdMLH17vwgdfYmekPG4=", "dEPEx");
    }
}
