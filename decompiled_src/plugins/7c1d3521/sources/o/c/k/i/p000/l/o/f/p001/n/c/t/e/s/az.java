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
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.az  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/az.class */
public class az implements InterfaceC0003ac {
    private static /* synthetic */ WorldPoint oJ;
    private static /* synthetic */ WorldPoint oK;
    public static /* synthetic */ WorldArea oI;
    private static /* synthetic */ int[] oy;
    private static /* synthetic */ String[] llIIIIIlII;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ int[] llIIIIIlIl;
    public static /* synthetic */ boolean bt;

    public static void Q() {
        int[] iArr = new int[llIIIIIlIl[1]];
        iArr[llIIIIIlIl[0]] = llIIIIIlIl[6];
        if (lIlIIIllIIlII(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIIlIl[6], llIIIIIlIl[1], llIIIIIlIl[4]));
            "".length();
        }
        int[] iArr2 = new int[llIIIIIlIl[1]];
        iArr2[llIIIIIlIl[0]] = llIIIIIlIl[8];
        if (lIlIIIllIIlII(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIIlIl[8], llIIIIIlIl[1], llIIIIIlIl[4]));
            "".length();
        }
        int[] iArr3 = new int[llIIIIIlIl[1]];
        iArr3[llIIIIIlIl[0]] = llIIIIIlIl[10];
        if (lIlIIIllIIlII(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIIlIl[10], llIIIIIlIl[1], llIIIIIlIl[63]));
            "".length();
        }
        int[] iArr4 = new int[llIIIIIlIl[1]];
        iArr4[llIIIIIlIl[0]] = llIIIIIlIl[14];
        if (lIlIIIllIIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIIlIl[14], llIIIIIlIl[64], llIIIIIlIl[65]));
            "".length();
        }
        int[] iArr5 = new int[llIIIIIlIl[1]];
        iArr5[llIIIIIlIl[0]] = llIIIIIlIl[12];
        if (lIlIIIllIIlII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIIlIl[12], llIIIIIlIl[66], llIIIIIlIl[7]));
            "".length();
        }
        int[] iArr6 = new int[llIIIIIlIl[1]];
        iArr6[llIIIIIlIl[0]] = llIIIIIlIl[67];
        if (lIlIIIllIIlII(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIIlIl[67], llIIIIIlIl[1], llIIIIIlIl[4]));
            "".length();
        }
        int[] iArr7 = new int[llIIIIIlIl[1]];
        iArr7[llIIIIIlIl[0]] = llIIIIIlIl[24];
        if (lIlIIIllIIlII(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIIlIl[24], llIIIIIlIl[16], llIIIIIlIl[4]));
            "".length();
        }
        if (lIlIIIllIIlII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIIIIIlII[llIIIIIlIl[75]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIIlIl[68], llIIIIIlIl[7], llIIIIIlIl[69]));
            "".length();
        }
        int[] iArr8 = new int[llIIIIIlIl[1]];
        iArr8[llIIIIIlIl[0]] = llIIIIIlIl[70];
        if (lIlIIIllIIlII(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIIlIl[70], llIIIIIlIl[54], llIIIIIlIl[71]));
            "".length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0162, code lost:
        if (lIlIIIllIIlll(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.az.llIIIIIlIl[1]) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a6, code lost:
        if (lIlIIIllIIlll(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.az.llIIIIIlIl[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ea, code lost:
        if (lIlIIIllIIlll(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.az.llIIIIIlIl[1]) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x022e, code lost:
        if (lIlIIIllIIlll(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.az.llIIIIIlIl[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0272, code lost:
        if (lIlIIIllIIlll(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.az.llIIIIIlIl[1]) != false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v319, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void gH() {
        if (lIlIIIllIIIlI(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[0]];
            C0015b.a(bv);
            if (lIlIIIllIIIll(bv.size(), llIIIIIlIl[1])) {
                System.out.println(llIIIIIlII[llIIIIIlIl[1]]);
                bt = llIIIIIlIl[0];
            }
        }
        if (lIlIIIllIIlII(bt ? 1 : 0)) {
            if (lIlIIIllIIlII(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIIllIIlIl(nearest) && lIlIIIllIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[2]];
                    C0000a.a(nearest);
                }
                if (lIlIIIllIIlIl(nearest) && lIlIIIllIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIIllIIlII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[3]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIIIlIl[4]);
                        "".length();
                    }
                    if (lIlIIIllIIIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[5]];
                        if (lIlIIIllIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIIIIlIl[5]);
                            "".length();
                        }
                        if (lIlIIIllIIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIIIIlIl[2]);
                            "".length();
                        }
                        int[] iArr = new int[llIIIIIlIl[1]];
                        iArr[llIIIIIlIl[0]] = llIIIIIlIl[6];
                        if (lIlIIIllIIlII(Bank.contains(iArr) ? 1 : 0)) {
                            String[] strArr = new String[llIIIIIlIl[1]];
                            strArr[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[7]];
                        }
                        int[] iArr2 = new int[llIIIIIlIl[1]];
                        iArr2[llIIIIIlIl[0]] = llIIIIIlIl[8];
                        if (lIlIIIllIIlII(Bank.contains(iArr2) ? 1 : 0)) {
                            String[] strArr2 = new String[llIIIIIlIl[1]];
                            strArr2[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[9]];
                        }
                        int[] iArr3 = new int[llIIIIIlIl[1]];
                        iArr3[llIIIIIlIl[0]] = llIIIIIlIl[10];
                        if (lIlIIIllIIlII(Bank.contains(iArr3) ? 1 : 0)) {
                            String[] strArr3 = new String[llIIIIIlIl[1]];
                            strArr3[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[11]];
                        }
                        int[] iArr4 = new int[llIIIIIlIl[1]];
                        iArr4[llIIIIIlIl[0]] = llIIIIIlIl[12];
                        if (lIlIIIllIIlII(Bank.contains(iArr4) ? 1 : 0)) {
                            String[] strArr4 = new String[llIIIIIlIl[1]];
                            strArr4[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[13]];
                        }
                        int[] iArr5 = new int[llIIIIIlIl[1]];
                        iArr5[llIIIIIlIl[0]] = llIIIIIlIl[14];
                        if (lIlIIIllIIlII(Bank.contains(iArr5) ? 1 : 0)) {
                            String[] strArr5 = new String[llIIIIIlIl[1]];
                            strArr5[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[15]];
                        }
                        if ((!lIlIIIllIIlII(Bank.contains(C0019f.aT) ? 1 : 0) || lIlIIIllIIlll(Inventory.getCount(C0019f.aT), llIIIIIlIl[1])) && !lIlIIIllIIIlI(Equipment.contains(C0019f.aT) ? 1 : 0)) {
                            int[] iArr6 = new int[llIIIIIlIl[1]];
                            iArr6[llIIIIIlIl[0]] = llIIIIIlIl[6];
                            if (lIlIIIllIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                                Bank.withdraw(llIIIIIlII[llIIIIIlIl[17]], llIIIIIlIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIIIIlIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[llIIIIIlIl[1]];
                                    strArr6[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[82]];
                                    if (lIlIIIllIIllI(Inventory.getCount(strArr6))) {
                                        ?? r0 = llIIIIIlIl[1];
                                        "".length();
                                        return "   ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIIIIIlIl[0];
                                }, llIIIIIlIl[4]);
                                "".length();
                            }
                            int[] iArr7 = new int[llIIIIIlIl[1]];
                            iArr7[llIIIIIlIl[0]] = llIIIIIlIl[8];
                            if (lIlIIIllIIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                                Bank.withdraw(llIIIIIlII[llIIIIIlIl[18]], llIIIIIlIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIIIIlIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[llIIIIIlIl[1]];
                                    strArr6[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[81]];
                                    if (lIlIIIllIIllI(Inventory.getCount(strArr6))) {
                                        ?? r0 = llIIIIIlIl[1];
                                        "".length();
                                        return "  ".length() <= 0 ? ((((76 + 163) - 147) + 116) ^ (((112 + 159) - 116) + 38)) & (((218 ^ 138) ^ (228 ^ 165)) ^ (-" ".length())) : r0;
                                    }
                                    return llIIIIIlIl[0];
                                }, llIIIIIlIl[4]);
                                "".length();
                            }
                            int[] iArr8 = new int[llIIIIIlIl[1]];
                            iArr8[llIIIIIlIl[0]] = llIIIIIlIl[10];
                            if (lIlIIIllIIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                                Bank.withdraw(llIIIIIlII[llIIIIIlIl[19]], llIIIIIlIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIIIIlIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[llIIIIIlIl[1]];
                                    strArr6[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[80]];
                                    if (lIlIIIllIIllI(Inventory.getCount(strArr6))) {
                                        ?? r0 = llIIIIIlIl[1];
                                        "".length();
                                        return (((((185 + 0) - (-2)) + 5) ^ (((41 + 4) - (-108)) + 9)) & (((3 ^ 117) ^ (208 ^ 196)) ^ (-" ".length()))) != 0 ? ((((179 + 15) - 171) + 211) ^ (((10 + 27) - (-82)) + 62)) & (((4 ^ 38) ^ (1 ^ 124)) ^ (-" ".length())) : r0;
                                    }
                                    return llIIIIIlIl[0];
                                }, llIIIIIlIl[4]);
                                "".length();
                            }
                            int[] iArr9 = new int[llIIIIIlIl[1]];
                            iArr9[llIIIIIlIl[0]] = llIIIIIlIl[12];
                            if (lIlIIIllIIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                                Bank.withdraw(llIIIIIlII[llIIIIIlIl[20]], llIIIIIlIl[21], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIIIIlIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[llIIIIIlIl[1]];
                                    strArr6[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[79]];
                                    if (lIlIIIllIIllI(Inventory.getCount(strArr6))) {
                                        ?? r0 = llIIIIIlIl[1];
                                        "".length();
                                        return (((101 ^ 76) ^ (103 ^ 94)) & (((26 ^ 89) ^ (47 ^ 124)) ^ (-" ".length()))) != (((((82 + 41) - 61) + 93) ^ (((42 + 12) - (-59)) + 27)) & (((((19 + 125) - (-34)) + 8) ^ (((134 + 134) - 261) + 166)) ^ (-" ".length()))) ? ((((171 + 41) - 83) + 53) ^ (((152 + 59) - 175) + 139)) & (((((74 + 86) - 63) + 55) ^ (((6 + 22) - (-44)) + 57)) ^ (-" ".length())) : r0;
                                    }
                                    return llIIIIIlIl[0];
                                }, llIIIIIlIl[4]);
                                "".length();
                            }
                            int[] iArr10 = new int[llIIIIIlIl[1]];
                            iArr10[llIIIIIlIl[0]] = llIIIIIlIl[14];
                            if (lIlIIIllIIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                                Bank.withdraw(llIIIIIlII[llIIIIIlIl[22]], llIIIIIlIl[23], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIIIIlIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[llIIIIIlIl[1]];
                                    strArr6[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[78]];
                                    if (lIlIIIllIIllI(Inventory.getCount(strArr6))) {
                                        ?? r0 = llIIIIIlIl[1];
                                        "".length();
                                        return "   ".length() < 0 ? ((252 ^ 160) ^ (225 ^ 164)) & (((117 ^ 112) ^ (106 ^ 118)) ^ (-" ".length())) : r0;
                                    }
                                    return llIIIIIlIl[0];
                                }, llIIIIIlIl[4]);
                                "".length();
                            }
                            if (lIlIIIllIIIlI(Bank.contains(C0019f.aT) ? 1 : 0)) {
                                C0000a.b(C0019f.aT, llIIIIIlIl[1]);
                            }
                            int[] iArr11 = new int[llIIIIIlIl[1]];
                            iArr11[llIIIIIlIl[0]] = llIIIIIlIl[24];
                            if (lIlIIIllIIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                                C0000a.a(llIIIIIlIl[24], llIIIIIlIl[1]);
                            }
                        }
                        Q();
                        System.out.println(llIIIIIlII[llIIIIIlIl[16]]);
                        bt = llIIIIIlIl[1];
                        return;
                    }
                }
            }
            if (lIlIIIllIIIlI(an() ? 1 : 0)) {
                if (lIlIIIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlIIIllIIIlI(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[25]];
                    System.out.println(llIIIIIlII[llIIIIIlIl[26]]);
                    Inventory.getAll(oy).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (lIlIIIllIIlII(Inventory.isFull() ? 1 : 0)) {
                    if (lIlIIIllIIIll(Skills.getLevel(Skill.FISHING), llIIIIIlIl[27])) {
                        if (lIlIIIllIIIll(Skills.getLevel(Skill.FISHING), llIIIIIlIl[7])) {
                            if (lIlIIIllIIlII(oI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIIllIlIII(Players.getLocal().getWorldLocation().distanceTo(oJ), llIIIIIlIl[7])) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[28]];
                                if (lIlIIIllIIIlI(Inventory.contains(C0019f.aT) ? 1 : 0)) {
                                    Inventory.getFirst(C0019f.aT).interact(llIIIIIlII[llIIIIIlIl[29]]);
                                }
                                Movement.walkTo(oJ);
                                "".length();
                                Time.sleepTicks(llIIIIIlIl[1]);
                                "".length();
                            }
                            if (lIlIIIllIIIlI(oI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[27]];
                                if (lIlIIIllIlIIl(Players.getLocal().getAnimation(), llIIIIIlIl[30])) {
                                    int[] iArr12 = new int[llIIIIIlIl[1]];
                                    iArr12[llIIIIIlIl[0]] = llIIIIIlIl[31];
                                    NPC nearest2 = NPCs.getNearest(iArr12);
                                    if (lIlIIIllIIlIl(nearest2) && lIlIIIllIIIlI(oI.contains(nearest2) ? 1 : 0)) {
                                        int[] iArr13 = new int[llIIIIIlIl[1]];
                                        iArr13[llIIIIIlIl[0]] = llIIIIIlIl[31];
                                        NPCs.getNearest(iArr13).interact(llIIIIIlIl[0]);
                                        Time.sleepTicks(llIIIIIlIl[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                        if (lIlIIIllIIlll(Skills.getLevel(Skill.FISHING), llIIIIIlIl[7]) && lIlIIIllIIIll(Skills.getLevel(Skill.FISHING), llIIIIIlIl[27])) {
                            if (lIlIIIllIIlII(oI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[32]];
                                Movement.walkTo(oJ);
                                "".length();
                                Time.sleepTicks(llIIIIIlIl[1]);
                                "".length();
                            }
                            if (lIlIIIllIIIlI(oI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[33]];
                                if (lIlIIIllIlIIl(Players.getLocal().getAnimation(), llIIIIIlIl[30])) {
                                    int[] iArr14 = new int[llIIIIIlIl[1]];
                                    iArr14[llIIIIIlIl[0]] = llIIIIIlIl[31];
                                    NPC nearest3 = NPCs.getNearest(iArr14);
                                    if (lIlIIIllIIlIl(nearest3) && lIlIIIllIIIlI(oI.contains(nearest3) ? 1 : 0)) {
                                        int[] iArr15 = new int[llIIIIIlIl[1]];
                                        iArr15[llIIIIIlIl[0]] = llIIIIIlIl[31];
                                        NPCs.getNearest(iArr15).interact(llIIIIIlII[llIIIIIlIl[34]]);
                                        Time.sleepTicks(llIIIIIlIl[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (lIlIIIllIIlll(Skills.getLevel(Skill.FISHING), llIIIIIlIl[27])) {
                        if (lIlIIIllIlIII(Players.getLocal().getWorldLocation().distanceTo(oK), llIIIIIlIl[22])) {
                            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[35]];
                            Movement.walkTo(oK);
                            "".length();
                            Time.sleepTicks(llIIIIIlIl[1]);
                            "".length();
                        }
                        if (lIlIIIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(oK), llIIIIIlIl[22])) {
                            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[36]];
                            if (lIlIIIllIlIIl(Players.getLocal().getAnimation(), llIIIIIlIl[30]) && lIlIIIllIIlIl(NPCs.getNearest(npc -> {
                                if (lIlIIIllIlIIl(npc.getId(), llIIIIIlIl[77]) && lIlIIIllIlIlI(npc.getWorldLocation().distanceTo(oK), llIIIIIlIl[22])) {
                                    ?? r0 = llIIIIIlIl[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIIIIlIl[0];
                            }))) {
                                NPCs.getNearest(npc2 -> {
                                    if (lIlIIIllIlIIl(npc2.getId(), llIIIIIlIl[77]) && lIlIIIllIlIlI(npc2.getWorldLocation().distanceTo(oK), llIIIIIlIl[22])) {
                                        ?? r0 = llIIIIIlIl[1];
                                        "".length();
                                        return 0 != 0 ? ((((76 + 173) - 124) + 66) ^ (((26 + 65) - 43) + 135)) & (((((132 + 54) - 109) + 68) ^ (((78 + 51) - 99) + 123)) ^ (-" ".length())) : r0;
                                    }
                                    return llIIIIIlIl[0];
                                }).interact(llIIIIIlII[llIIIIIlIl[37]]);
                                Time.sleepTicks(llIIIIIlIl[2]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIIIIlII[llIIIIIlIl[73]];
    }

    private static boolean lIlIIIllIIIlI(int i) {
        return i != 0;
    }

    private static boolean lIlIIIllIlIIl(int i, int i2) {
        return i == i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        gH();
        return llIIIIIlIl[72];
    }

    private static boolean lIlIIIllIlIlI(int i, int i2) {
        return i <= i2;
    }

    private static void lIlIIIllIIIIl() {
        llIIIIIlIl = new int[101];
        llIIIIIlIl[0] = ((((43 + 114) - 100) + 102) ^ (((25 + 62) - 49) + 128)) & (((165 ^ 184) ^ (32 ^ 4)) ^ (-" ".length()));
        llIIIIIlIl[1] = " ".length();
        llIIIIIlIl[2] = "  ".length();
        llIIIIIlIl[3] = "   ".length();
        llIIIIIlIl[4] = (-16401) & 21400;
        llIIIIIlIl[5] = (((112 + 162) - 235) + 130) ^ (((146 + 84) - 188) + 131);
        llIIIIIlIl[6] = (-((-293) & 17397)) & (-7169) & 24575;
        llIIIIIlIl[7] = 198 ^ 195;
        llIIIIIlIl[8] = (-((-8497) & 28669)) & (-12289) & 32767;
        llIIIIIlIl[9] = (174 ^ 161) ^ (56 ^ 49);
        llIIIIIlIl[10] = (-3587) & 3895;
        llIIIIIlIl[11] = 68 ^ 67;
        llIIIIIlIl[12] = (-((-517) & 28229)) & (-5) & 28030;
        llIIIIIlIl[13] = 164 ^ 172;
        llIIIIIlIl[14] = (-31427) & 31739;
        llIIIIIlIl[15] = 42 ^ 35;
        llIIIIIlIl[16] = (75 ^ 40) ^ (38 ^ 79);
        llIIIIIlIl[17] = 133 ^ 142;
        llIIIIIlIl[18] = (((41 + 105) - 138) + 146) ^ (((20 + 71) - 70) + 129);
        llIIIIIlIl[19] = 24 ^ 21;
        llIIIIIlIl[20] = 159 ^ 145;
        llIIIIIlIl[21] = (-((-22025) & 32607)) & (-4105) & 114686;
        llIIIIIlIl[22] = 68 ^ 75;
        llIIIIIlIl[23] = (-27666) & 28665;
        llIIIIIlIl[24] = (-8355) & 16362;
        llIIIIIlIl[25] = (53 ^ 46) ^ (158 ^ 149);
        llIIIIIlIl[26] = 115 ^ 98;
        llIIIIIlIl[27] = (((125 + 34) - 53) + 40) ^ (((6 + 62) - (-43)) + 23);
        llIIIIIlIl[28] = 140 ^ 158;
        llIIIIIlIl[29] = 51 ^ 32;
        llIIIIIlIl[30] = -" ".length();
        llIIIIIlIl[31] = (-((-1090) & 23753)) & (-8513) & 32719;
        llIIIIIlIl[32] = 40 ^ 61;
        llIIIIIlIl[33] = (((141 + 7) - 126) + 129) ^ (((34 + 46) - 4) + 53);
        llIIIIIlIl[34] = (194 ^ 169) ^ (196 ^ 184);
        llIIIIIlIl[35] = (((111 + 29) - 75) + 73) ^ (((23 + 45) - (-7)) + 71);
        llIIIIIlIl[36] = 44 ^ 53;
        llIIIIIlIl[37] = 50 ^ 40;
        llIIIIIlIl[38] = (25 ^ 53) ^ (28 ^ 43);
        llIIIIIlIl[39] = 128 ^ 156;
        llIIIIIlIl[40] = 49 ^ 44;
        llIIIIIlIl[41] = 85 ^ 75;
        llIIIIIlIl[42] = 121 ^ 102;
        llIIIIIlIl[43] = (((161 + 14) - 34) + 23) ^ (((111 + 26) - 85) + 80);
        llIIIIIlIl[44] = 50 ^ 19;
        llIIIIIlIl[45] = (((56 + 79) - 98) + 105) ^ (((115 + 63) - 32) + 26);
        llIIIIIlIl[46] = 178 ^ 145;
        llIIIIIlIl[47] = 143 ^ 171;
        llIIIIIlIl[48] = (99 ^ 95) ^ (140 ^ 149);
        llIIIIIlIl[49] = (70 ^ 112) ^ (137 ^ 153);
        llIIIIIlIl[50] = (-((-9541) & 30591)) & (-9221) & 30591;
        llIIIIIlIl[51] = (-((-1319) & 22319)) & (-9217) & 32751;
        llIIIIIlIl[52] = (-((-9601) & 30603)) & (-1) & 24575;
        llIIIIIlIl[53] = (46 ^ 75) ^ (205 ^ 143);
        llIIIIIlIl[54] = (((55 + 47) - 32) + 99) ^ (((122 + 94) - 134) + 47);
        llIIIIIlIl[55] = (((176 + 97) - 159) + 70) ^ (((85 + 87) - 118) + 91);
        llIIIIIlIl[56] = (((92 + 82) - 52) + 34) ^ (((174 + 160) - 240) + 88);
        llIIIIIlIl[57] = (((177 + 150) - 147) + 58) ^ (((149 + 77) - 150) + 121);
        llIIIIIlIl[58] = (127 ^ 35) ^ (47 ^ 95);
        llIIIIIlIl[59] = (((82 + 109) - 105) + 49) ^ (((5 + 126) - 0) + 39);
        llIIIIIlIl[60] = (31 ^ 47) ^ (168 ^ 182);
        llIIIIIlIl[61] = (145 ^ 167) ^ (29 ^ 4);
        llIIIIIlIl[62] = 136 ^ 184;
        llIIIIIlIl[63] = (-20565) & 29564;
        llIIIIIlIl[64] = (-20499) & 20798;
        llIIIIIlIl[65] = (-12811) & 13310;
        llIIIIIlIl[66] = (-((-11985) & 28663)) & (-1026) & 30703;
        llIIIIIlIl[67] = (-12529) & 16381;
        llIIIIIlIl[68] = (-20754) & 32733;
        llIIIIIlIl[69] = (-6721) & 31720;
        llIIIIIlIl[70] = (-((-4385) & 29113)) & (-1) & 32735;
        llIIIIIlIl[71] = (-10276) & 11175;
        llIIIIIlIl[72] = (((37 + 21) - (-118)) + 44) ^ (((139 + 113) - 107) + 39);
        llIIIIIlIl[73] = (41 ^ 125) ^ (55 ^ 82);
        llIIIIIlIl[74] = (((78 + 87) - 23) + 65) ^ (((88 + 134) - 213) + 163);
        llIIIIIlIl[75] = (((58 + 76) - (-27)) + 18) ^ (((78 + 78) - 64) + 37);
        llIIIIIlIl[76] = (((21 + 139) - 37) + 65) ^ (((15 + 42) - (-52)) + 34);
        llIIIIIlIl[77] = (-14874) & 16381;
        llIIIIIlIl[78] = 124 ^ 72;
        llIIIIIlIl[79] = 16 ^ 37;
        llIIIIIlIl[80] = 136 ^ 190;
        llIIIIIlIl[81] = 130 ^ 181;
        llIIIIIlIl[82] = (141 ^ 132) ^ (175 ^ 158);
        llIIIIIlIl[83] = (-8245) & 10750;
        llIIIIIlIl[84] = (-4619) & 8174;
        llIIIIIlIl[85] = (-5131) & 7647;
        llIIIIIlIl[86] = (-12297) & 15868;
        llIIIIIlIl[87] = (-16898) & 19429;
        llIIIIIlIl[88] = (-8748) & 12159;
        llIIIIIlIl[89] = (-((-3457) & 28057)) & (-2049) & 28159;
        llIIIIIlIl[90] = (-25097) & 26617;
        llIIIIIlIl[91] = (-((-5193) & 30297)) & (-1) & 26623;
        llIIIIIlIl[92] = (-21187) & 21503;
        llIIIIIlIl[93] = (-8241) & 8567;
        llIIIIIlIl[94] = (-((-8523) & 27103)) & (-12801) & 31711;
        llIIIIIlIl[95] = (-13473) & 13817;
        llIIIIIlIl[96] = (-26673) & 27007;
        llIIIIIlIl[97] = (-((-12355) & 29303)) & (-4489) & 32766;
        llIIIIIlIl[98] = (-21162) & 32493;
        llIIIIIlIl[99] = (-20647) & 31974;
        llIIIIIlIl[100] = 136 ^ 177;
    }

    private static String lIlIIIlIllIll(String llllllllllllllllllIllIlIIlllllII, String llllllllllllllllllIllIlIIllllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIlIIllllIll.getBytes(StandardCharsets.UTF_8)), llIIIIIlIl[13]), "DES");
            Cipher llllllllllllllllllIllIlIIllllllI = Cipher.getInstance("DES");
            llllllllllllllllllIllIlIIllllllI.init(llIIIIIlIl[2], secretKeySpec);
            return new String(llllllllllllllllllIllIlIIllllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIlIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIlIIlllllIl) {
            llllllllllllllllllIllIlIIlllllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIIIIlIl[0];
    }

    private static String lIlIIIlIlllII(String llllllllllllllllllIllIlIIllIllII, String llllllllllllllllllIllIlIIllIlIll) {
        String llllllllllllllllllIllIlIIllIllII2 = new String(Base64.getDecoder().decode(llllllllllllllllllIllIlIIllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIllIlIIllIlIlI = new StringBuilder();
        char[] llllllllllllllllllIllIlIIllIlIIl = llllllllllllllllllIllIlIIllIlIll.toCharArray();
        int llllllllllllllllllIllIlIIllIlIII = llIIIIIlIl[0];
        char[] charArray = llllllllllllllllllIllIlIIllIllII2.toCharArray();
        int length = charArray.length;
        int llllllllllllllllllIllIlIIllIIIII = llIIIIIlIl[0];
        while (lIlIIIllIIIll(llllllllllllllllllIllIlIIllIIIII, length)) {
            char llllllllllllllllllIllIlIIllIllIl = charArray[llllllllllllllllllIllIlIIllIIIII];
            llllllllllllllllllIllIlIIllIlIlI.append((char) (llllllllllllllllllIllIlIIllIllIl ^ llllllllllllllllllIllIlIIllIlIIl[llllllllllllllllllIllIlIIllIlIII % llllllllllllllllllIllIlIIllIlIIl.length]));
            "".length();
            llllllllllllllllllIllIlIIllIlIII++;
            llllllllllllllllllIllIlIIllIIIII++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIllIlIIllIlIlI);
    }

    private static String lIlIIIlIllIlI(String llllllllllllllllllIllIlIlIIIlIIl, String llllllllllllllllllIllIlIlIIIlIII) {
        try {
            SecretKeySpec llllllllllllllllllIllIlIlIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIlIlIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIllIlIlIIIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIllIlIlIIIlIll.init(llIIIIIlIl[2], llllllllllllllllllIllIlIlIIIllII);
            return new String(llllllllllllllllllIllIlIlIIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIlIlIIIlIlI) {
            llllllllllllllllllIllIlIlIIIlIlI.printStackTrace();
            return null;
        }
    }

    static {
        lIlIIIllIIIIl();
        lIlIIIlIlllIl();
        oI = new WorldArea(llIIIIIlIl[83], llIIIIIlIl[84], llIIIIIlIl[29], llIIIIIlIl[39], llIIIIIlIl[0]);
        bv = new ArrayList();
        oJ = new WorldPoint(llIIIIIlIl[85], llIIIIIlIl[86], llIIIIIlIl[0]);
        oK = new WorldPoint(llIIIIIlIl[87], llIIIIIlIl[88], llIIIIIlIl[0]);
        int[] iArr = new int[llIIIIIlIl[17]];
        iArr[llIIIIIlIl[0]] = llIIIIIlIl[89];
        iArr[llIIIIIlIl[1]] = llIIIIIlIl[90];
        iArr[llIIIIIlIl[2]] = llIIIIIlIl[91];
        iArr[llIIIIIlIl[3]] = llIIIIIlIl[92];
        iArr[llIIIIIlIl[5]] = llIIIIIlIl[93];
        iArr[llIIIIIlIl[7]] = llIIIIIlIl[94];
        iArr[llIIIIIlIl[9]] = llIIIIIlIl[95];
        iArr[llIIIIIlIl[11]] = llIIIIIlIl[96];
        iArr[llIIIIIlIl[13]] = llIIIIIlIl[97];
        iArr[llIIIIIlIl[15]] = llIIIIIlIl[98];
        iArr[llIIIIIlIl[16]] = llIIIIIlIl[99];
        oy = iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean an() {
        String[] strArr = new String[llIIIIIlIl[1]];
        strArr[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[58]];
        if (lIlIIIllIIIlI(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[llIIIIIlIl[1]];
            strArr2[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[59]];
            if (lIlIIIllIIIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[llIIIIIlIl[1]];
                strArr3[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[60]];
                if (lIlIIIllIIIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[llIIIIIlIl[1]];
                    strArr4[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[61]];
                    if (lIlIIIllIIIlI(Inventory.contains(strArr4) ? 1 : 0)) {
                        String[] strArr5 = new String[llIIIIIlIl[1]];
                        strArr5[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[62]];
                        if (lIlIIIllIIIlI(Inventory.contains(strArr5) ? 1 : 0) && (!lIlIIIllIIlII(Inventory.contains(C0019f.aT) ? 1 : 0) || lIlIIIllIIIlI(Equipment.contains(C0019f.aT) ? 1 : 0))) {
                            ?? r0 = llIIIIIlIl[1];
                            "".length();
                            return 0 != 0 ? ((14 ^ 125) ^ (81 ^ 99)) & (((((102 + 109) - 93) + 14) ^ (((194 + 105) - 248) + 146)) ^ (-" ".length())) : r0;
                        }
                    }
                }
            }
        }
        return llIIIIIlIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean gK() {
        String[] strArr = new String[llIIIIIlIl[1]];
        strArr[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[57]];
        if (!lIlIIIllIIIlI(Inventory.contains(strArr) ? 1 : 0) || (lIlIIIllIIlII(Inventory.contains(C0019f.aT) ? 1 : 0) && !lIlIIIllIIIlI(Equipment.contains(C0019f.aT) ? 1 : 0))) {
            return llIIIIIlIl[0];
        }
        ?? r0 = llIIIIIlIl[1];
        "".length();
        return ((true ^ true) & ((true ^ true) ^ true)) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static boolean lIlIIIllIIlII(int i) {
        return i == 0;
    }

    private static boolean lIlIIIllIIIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIIllIIlll(Skills.getLevel(Skill.FISHING), llIIIIIlIl[74])) {
            ?? r0 = llIIIIIlIl[1];
            "".length();
            return (((19 ^ 67) ^ (198 ^ 143)) & (((102 ^ 44) ^ (19 ^ 64)) ^ (-" ".length()))) != 0 ? ((((141 + 1) - 53) + 92) ^ (((133 + 103) - 224) + 144)) & (((162 ^ 154) ^ (84 ^ 69)) ^ (-" ".length())) : r0;
        }
        return llIIIIIlIl[0];
    }

    private static boolean lIlIIIllIIllI(int i) {
        return i > 0;
    }

    private static boolean lIlIIIllIIlll(int i, int i2) {
        return i >= i2;
    }

    public static void gI() {
        if (lIlIIIllIIIlI(Inventory.isFull() ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[38]];
            System.out.println(llIIIIIlII[llIIIIIlIl[39]]);
            Inventory.getAll(oy).stream().forEach((v0) -> {
                v0.drop();
            });
        }
        if (lIlIIIllIIlII(Inventory.isFull() ? 1 : 0) && lIlIIIllIlIIl(Players.getLocal().getAnimation(), llIIIIIlIl[30])) {
            String[] strArr = new String[llIIIIIlIl[1]];
            strArr[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[40]];
            NPCs.getNearest(strArr).interact(llIIIIIlII[llIIIIIlIl[41]]);
            Time.sleepTicks(llIIIIIlIl[2]);
            "".length();
        }
    }

    private static boolean lIlIIIllIIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0148, code lost:
        if (lIlIIIllIIlll(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.az.llIIIIIlIl[1]) != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v176, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void gJ() {
        if (lIlIIIllIIIlI(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[42]];
            C0015b.a(bv);
            if (lIlIIIllIIIll(bv.size(), llIIIIIlIl[1])) {
                System.out.println(llIIIIIlII[llIIIIIlIl[43]]);
                bt = llIIIIIlIl[0];
            }
        }
        if (lIlIIIllIIlII(bt ? 1 : 0)) {
            if (lIlIIIllIIlII(gK() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIIllIIlIl(nearest) && lIlIIIllIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[44]];
                    C0000a.a(nearest);
                }
                if (lIlIIIllIIlIl(nearest) && lIlIIIllIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIIllIIlII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[45]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIIIlIl[4]);
                        "".length();
                    }
                    if (lIlIIIllIIIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[46]];
                        if (lIlIIIllIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIIIIlIl[5]);
                            "".length();
                        }
                        int[] iArr = new int[llIIIIIlIl[1]];
                        iArr[llIIIIIlIl[0]] = llIIIIIlIl[6];
                        if (lIlIIIllIIlII(Bank.contains(iArr) ? 1 : 0)) {
                            String[] strArr = new String[llIIIIIlIl[1]];
                            strArr[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[47]];
                        }
                        if (!lIlIIIllIIlII(Bank.contains(C0019f.aT) ? 1 : 0) || !lIlIIIllIIlII(Inventory.contains(C0019f.aT) ? 1 : 0) || !lIlIIIllIIlII(Equipment.contains(C0019f.aT) ? 1 : 0)) {
                            int[] iArr2 = new int[llIIIIIlIl[1]];
                            iArr2[llIIIIIlIl[0]] = llIIIIIlIl[6];
                            if (lIlIIIllIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                                Bank.withdraw(llIIIIIlII[llIIIIIlIl[49]], llIIIIIlIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIIIIIlIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr2 = new String[llIIIIIlIl[1]];
                                    strArr2[llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[76]];
                                    if (lIlIIIllIIllI(Inventory.getCount(strArr2))) {
                                        ?? r0 = llIIIIIlIl[1];
                                        "".length();
                                        return (91 ^ 95) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIIIIIlIl[0];
                                }, llIIIIIlIl[4]);
                                "".length();
                            }
                            if (lIlIIIllIIIlI(Bank.contains(C0019f.aT) ? 1 : 0)) {
                                C0000a.b(C0019f.aT, llIIIIIlIl[1]);
                            }
                        }
                        Q();
                        System.out.println(llIIIIIlII[llIIIIIlIl[48]]);
                        bt = llIIIIIlIl[1];
                        return;
                    }
                }
            }
            if (lIlIIIllIIIlI(gK() ? 1 : 0)) {
                if (lIlIIIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlIIIllIIIlI(Inventory.isFull() ? 1 : 0)) {
                    int[] iArr3 = new int[llIIIIIlIl[1]];
                    iArr3[llIIIIIlIl[0]] = llIIIIIlIl[50];
                    if (lIlIIIllIIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(llIIIIIlIl[51], llIIIIIlIl[52], llIIIIIlIl[0]);
                        if (lIlIIIllIlIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIIIIlIl[9])) {
                            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[53]];
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(llIIIIIlIl[1]);
                            "".length();
                        }
                        if (lIlIIIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIIIIlIl[13])) {
                            if (lIlIIIllIIlII(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                            }
                            if (lIlIIIllIIIlI(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks(llIIIIIlIl[2]);
                                "".length();
                                Bank.depositInventory();
                                Time.sleepTicks(llIIIIIlIl[2]);
                                "".length();
                                C0000a.a(llIIIIIlIl[6], llIIIIIlIl[1]);
                            }
                        }
                    }
                }
                if (lIlIIIllIIlII(Inventory.isFull() ? 1 : 0)) {
                    if (lIlIIIllIIlII(oI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIIllIlIII(Players.getLocal().getWorldLocation().distanceTo(oJ), llIIIIIlIl[7])) {
                        AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[54]];
                        if (lIlIIIllIIIlI(Inventory.contains(C0019f.aT) ? 1 : 0)) {
                            Inventory.getFirst(C0019f.aT).interact(llIIIIIlII[llIIIIIlIl[55]]);
                        }
                        Movement.walkTo(oJ);
                        "".length();
                        Time.sleepTicks(llIIIIIlIl[1]);
                        "".length();
                    }
                    if (lIlIIIllIIIlI(oI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[56]];
                        if (lIlIIIllIlIIl(Players.getLocal().getAnimation(), llIIIIIlIl[30])) {
                            int[] iArr4 = new int[llIIIIIlIl[1]];
                            iArr4[llIIIIIlIl[0]] = llIIIIIlIl[31];
                            if (lIlIIIllIIlIl(NPCs.getNearest(iArr4))) {
                                int[] iArr5 = new int[llIIIIIlIl[1]];
                                iArr5[llIIIIIlIl[0]] = llIIIIIlIl[31];
                                NPCs.getNearest(iArr5).interact(llIIIIIlIl[0]);
                                Time.sleepTicks(llIIIIIlIl[7]);
                                "".length();
                            }
                        }
                    }
                }
                if (lIlIIIllIIIlI(Inventory.isFull() ? 1 : 0)) {
                    int[] iArr6 = new int[llIIIIIlIl[1]];
                    iArr6[llIIIIIlIl[0]] = llIIIIIlIl[50];
                    if (lIlIIIllIIIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIIIIIlIl[1]];
                        iArr7[llIIIIIlIl[0]] = llIIIIIlIl[50];
                        Inventory.getAll(iArr7).stream().forEach((v0) -> {
                            v0.drop();
                        });
                    }
                }
            }
        }
    }

    private static void lIlIIIlIlllIl() {
        llIIIIIlII = new String[llIIIIIlIl[100]];
        llIIIIIlII[llIIIIIlIl[0]] = lIlIIIlIllIlI("g0AYzVcLmLZFk88x9DBuyg==", "ZwEGj");
        llIIIIIlII[llIIIIIlIl[1]] = lIlIIIlIllIll("j4ZZtoBVkjxPAMGHYt3/YCIwlnPVNVB1a5BKU0hGoj+dtwY7ldrQf7lSADaQ/UEKuqhFeVeVo/M=", "tYvvq");
        llIIIIIlII[llIIIIIlIl[2]] = lIlIIIlIlllII("CgM+OS0lFiE+LWQWJ3AoJQwj", "DbHPJ");
        llIIIIIlII[llIIIIIlIl[3]] = lIlIIIlIllIlI("RS9iAB5LP6iZREKaw3dpqw==", "KsARh");
        llIIIIIlII[llIIIIIlIl[5]] = lIlIIIlIllIll("JmARJ1L2GEeSf2ElEW2tOQfv7//nlubO", "tPUGt");
        llIIIIIlII[llIIIIIlIl[7]] = lIlIIIlIllIll("QKHmp15yvECrIkX5vYwLR29Hq6rTqtht", "mHQWw");
        llIIIIIlII[llIIIIIlIl[9]] = lIlIIIlIllIlI("jhlOoHOJl1ItfyYkiaHK/Q==", "epuzA");
        llIIIIIlII[llIIIIIlIl[11]] = lIlIIIlIllIll("RHUJ/V5DwccsqYTs+dr69l1ZIG720THA", "FbjMT");
        llIIIIIlII[llIIIIIlIl[13]] = lIlIIIlIlllII("FQYNEho2EQ==", "Sclfr");
        llIIIIIlII[llIIIIIlIl[15]] = lIlIIIlIllIll("w0TRLT5ibZk5tyxoQt9wMA==", "uTyJC");
        llIIIIIlII[llIIIIIlIl[16]] = lIlIIIlIllIlI("mdfnvTN/rl/oVyWrxmnZvyP2smVFplVxmGnPOhcUog7xWhls8u99WJ3Zc8XJ0CQw", "urCwh");
        llIIIIIlII[llIIIIIlIl[17]] = lIlIIIlIllIll("/62I41eL8Y2f9WPZiFIAm0+4YTPir1mn", "LSjkX");
        llIIIIIlII[llIIIIIlIl[18]] = lIlIIIlIllIll("axYRpr4MBpbz3yVIavpt1Q==", "SWHXv");
        llIIIIIlII[llIIIIIlIl[19]] = lIlIIIlIllIll("eGAVb/QaYH4WUHbkQcf2Ug==", "RXOtN");
        llIIIIIlII[llIIIIIlIl[20]] = lIlIIIlIllIll("Tkf9P7cE1Ko=", "GKidT");
        llIIIIIlII[llIIIIIlIl[22]] = lIlIIIlIllIll("uE2t4pWlbSKjtyoLagT/JQ==", "uHcEi");
        llIIIIIlII[llIIIIIlIl[25]] = lIlIIIlIllIll("nihWNsDeONEXFZGOO0DkyA==", "DUxAq");
        llIIIIIlII[llIIIIIlIl[26]] = lIlIIIlIllIlI("y+ZnwcO0pKB/+WfjaflEMA==", "mycWt");
        llIIIIIlII[llIIIIIlIl[28]] = lIlIIIlIllIll("rZn21zKvB5iZm14wIqBQ4Yt8pQjtdQ/y", "xPaeJ");
        llIIIIIlII[llIIIIIlIl[29]] = lIlIIIlIllIll("4ReTMf39IAE=", "BgVLt");
        llIIIIIlII[llIIIIIlIl[27]] = lIlIIIlIlllII("Kh0jKwQCEw==", "ltPCm");
        llIIIIIlII[llIIIIIlIl[32]] = lIlIIIlIlllII("FBMuYwI1UisuFzYeeCUfKRp4MAY1Bg==", "ZrXCv");
        llIIIIIlII[llIIIIIlIl[33]] = lIlIIIlIllIll("CbFtDN7XGb4=", "YdHvO");
        llIIIIIlII[llIIIIIlIl[34]] = lIlIIIlIllIlI("zPg1bpkbQY0=", "dHdgt");
        llIIIIIlII[llIIIIIlIl[35]] = lIlIIIlIllIll("lerN9ztle+CczAqaE4XQYy6qzANqHigs", "VtUjM");
        llIIIIIlII[llIIIIIlIl[36]] = lIlIIIlIllIll("zVBe0SRZ7yk=", "wJRgc");
        llIIIIIlII[llIIIIIlIl[37]] = lIlIIIlIllIll("lnqJDxTqR7A=", "CxHEm");
        llIIIIIlII[llIIIIIlIl[38]] = lIlIIIlIllIlI("kyw16xvxommDPNFAgf4oZQ==", "Nfufk");
        llIIIIIlII[llIIIIIlIl[39]] = lIlIIIlIllIlI("rWCZ9Lwfj+fPj2nwanhDQw==", "gtgTc");
        llIIIIIlII[llIIIIIlIl[40]] = lIlIIIlIllIll("Axs0seY1SRaBSj/IofI3KQ==", "jdakl");
        llIIIIIlII[llIIIIIlIl[41]] = lIlIIIlIllIll("bUHSfUuI/Ro=", "Jnyzr");
        llIIIIIlII[llIIIIIlIl[42]] = lIlIIIlIllIlI("x08M3/u8yITj43nJheZhWA==", "BHcCe");
        llIIIIIlII[llIIIIIlIl[43]] = lIlIIIlIllIlI("/dCFhyCRvYJUa5Ri6JI3MQSyEmgEPzIZj+YrcjnKrz3kvVj7zrH94Oq9JGim5i4HZC0ZfkORv8g=", "cBdzo");
        llIIIIIlII[llIIIIIlIl[44]] = lIlIIIlIlllII("Nzg5DS0YLSYKLVktIEQoGDck", "yYOdJ");
        llIIIIIlII[llIIIIIlIl[45]] = lIlIIIlIlllII("BTQvDSAkI2oBKCQv", "JDJcI");
        llIIIIIlII[llIIIIIlIl[46]] = lIlIIIlIllIll("CZ+XPu9rHOzIehK+tJ5N2z/MMxQ72jgz", "AMDyK");
        llIIIIIlII[llIIIIIlIl[47]] = lIlIIIlIllIlI("eX/eHKEpUSGgzbWELxobcJu1U694SKiF", "ZCEkF");
        llIIIIIlII[llIIIIIlIl[48]] = lIlIIIlIllIll("e5A06MPWu4F34rxGFxD0Jnhm3SHSl58mybCJDuAE+OZPkJN/lXEe5lLnjGuBC/Ii", "lczvy");
        llIIIIIlII[llIIIIIlIl[49]] = lIlIIIlIllIlI("es3Ts3msfnm+7ZeF7P+8kqgTgLQtqq6Y", "wlLVZ");
        llIIIIIlII[llIIIIIlIl[53]] = lIlIIIlIllIll("oJalJOHOcpOuYf7okqrsMw==", "TuPUy");
        llIIIIIlII[llIIIIIlIl[54]] = lIlIIIlIllIll("ixGK9IweHN4ooR0kW+iloZXhyWq3hBdd", "QMztd");
        llIIIIIlII[llIIIIIlIl[55]] = lIlIIIlIllIlI("5xFM3b6laAk=", "muhQA");
        llIIIIIlII[llIIIIIlIl[56]] = lIlIIIlIlllII("ByECKiEvLw==", "AHqBH");
        llIIIIIlII[llIIIIIlIl[57]] = lIlIIIlIlllII("NiQUHwVFLxwAAQwnElMHAD0=", "eIusi");
        llIIIIIlII[llIIIIIlIl[58]] = lIlIIIlIlllII("ASYwFAFyLTgLBTslNlgDNz8=", "RKQxm");
        llIIIIIlII[llIIIIIlIl[59]] = lIlIIIlIllIlI("nOrTZTns6eUDelV/hl/z4w==", "rklvH");
        llIIIIIlII[llIIIIIlIl[60]] = lIlIIIlIllIlI("R7h1tLymdqDVBWSWeo+bzQ==", "mbffK");
        llIIIIIlII[llIIIIIlIl[61]] = lIlIIIlIlllII("ASMVOiIiNA==", "GFtNJ");
        llIIIIIlII[llIIIIIlIl[62]] = lIlIIIlIllIll("ehZcKM3A7ZpEabRSyW7xhQ==", "TJBbX");
        llIIIIIlII[llIIIIIlIl[73]] = lIlIIIlIllIlI("/gWNnvkLiB4=", "QGBRs");
        llIIIIIlII[llIIIIIlIl[75]] = lIlIIIlIlllII("EC8cKm8NIFI6KgMqBiVvSg==", "bFrMO");
        llIIIIIlII[llIIIIIlIl[76]] = lIlIIIlIllIlI("DNfa+vh5M1tCe002F7zMnmqGelfnksSS", "ulYzg");
        llIIIIIlII[llIIIIIlIl[78]] = lIlIIIlIllIlI("x+FNvlLYZugkku6KlPf7zw==", "Wzfjr");
        llIIIIIlII[llIIIIIlIl[79]] = lIlIIIlIlllII("MgAjDgMRFw==", "teBzk");
        llIIIIIlII[llIIIIIlIl[80]] = lIlIIIlIlllII("IzUXbDYMKgYlPgJ5HCM0", "eYnLP");
        llIIIIIlII[llIIIIIlIl[81]] = lIlIIIlIllIlI("VUOyDdF8FhKVDJSf2v2Tww==", "yZkhb");
        llIIIIIlII[llIIIIIlIl[82]] = lIlIIIlIllIlI("dMeSoLDUFLS1PW842wOMx2j3nfvZ6kqB", "MzJaX");
    }

    private static boolean lIlIIIllIlIII(int i, int i2) {
        return i > i2;
    }
}
