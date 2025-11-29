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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.N  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/N.class */
public class N implements F {
    public static /* synthetic */ List<C0003d> bB;
    private static /* synthetic */ int[] llllIIll;
    private static /* synthetic */ int[] iZ;
    private static /* synthetic */ String[] llllIIlI;
    private static /* synthetic */ WorldPoint iX;
    public static /* synthetic */ WorldArea iW;
    private static /* synthetic */ WorldPoint iY;
    public static /* synthetic */ boolean bz;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return llllIIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (llIIlIIlIlI(Skills.getLevel(Skill.FISHING), llllIIll[74])) {
            ?? r0 = llllIIll[1];
            "".length();
            return ((64 ^ 93) ^ (124 ^ 101)) <= "   ".length() ? ((((202 + 38) - 191) + 167) ^ (((24 + 1) - (-61)) + 67)) & (((((145 + 160) - 126) + 66) ^ (((77 + 94) - 44) + 53)) ^ (-" ".length())) : r0;
        }
        return llllIIll[0];
    }

    private static boolean llIIlIIlIlI(int i, int i2) {
        return i >= i2;
    }

    static {
        llIIlIIIlII();
        llIIlIIIIll();
        iW = new WorldArea(llllIIll[83], llllIIll[84], llllIIll[29], llllIIll[39], llllIIll[0]);
        bB = new ArrayList();
        iX = new WorldPoint(llllIIll[85], llllIIll[86], llllIIll[0]);
        iY = new WorldPoint(llllIIll[87], llllIIll[88], llllIIll[0]);
        int[] iArr = new int[llllIIll[17]];
        iArr[llllIIll[0]] = llllIIll[89];
        iArr[llllIIll[1]] = llllIIll[90];
        iArr[llllIIll[2]] = llllIIll[91];
        iArr[llllIIll[3]] = llllIIll[92];
        iArr[llllIIll[5]] = llllIIll[93];
        iArr[llllIIll[7]] = llllIIll[94];
        iArr[llllIIll[9]] = llllIIll[95];
        iArr[llllIIll[11]] = llllIIll[96];
        iArr[llllIIll[13]] = llllIIll[97];
        iArr[llllIIll[15]] = llllIIll[98];
        iArr[llllIIll[16]] = llllIIll[99];
        iZ = iArr;
    }

    private static boolean llIIlIIllIl(int i, int i2) {
        return i <= i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return llllIIlI[llllIIll[73]];
    }

    private static boolean llIIlIIIlll(int i) {
        return i == 0;
    }

    private static boolean llIIlIIIllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0162, code lost:
        if (llIIlIIlIlI(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.N.llllIIll[1]) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a6, code lost:
        if (llIIlIIlIlI(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.N.llllIIll[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ea, code lost:
        if (llIIlIIlIlI(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.N.llllIIll[1]) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x022e, code lost:
        if (llIIlIIlIlI(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.N.llllIIll[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0272, code lost:
        if (llIIlIIlIlI(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.N.llllIIll[1]) != false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v319, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cX() {
        if (llIIlIIIlIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = llllIIlI[llllIIll[0]];
            C0001b.a(bB);
            if (llIIlIIIllI(bB.size(), llllIIll[1])) {
                System.out.println(llllIIlI[llllIIll[1]]);
                bz = llllIIll[0];
            }
        }
        if (llIIlIIIlll(bz ? 1 : 0)) {
            if (llIIlIIIlll(ac() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIlIIlIII(nearest) && llIIlIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llllIIlI[llllIIll[2]];
                    C0000a.a(nearest);
                }
                if (llIIlIIlIII(nearest) && llIIlIIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIlIIIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIlI[llllIIll[3]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIIll[4]);
                        "".length();
                    }
                    if (llIIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIlI[llllIIll[5]];
                        if (llIIlIIlIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIIll[5]);
                            "".length();
                        }
                        if (llIIlIIlIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllIIll[2]);
                            "".length();
                        }
                        int[] iArr = new int[llllIIll[1]];
                        iArr[llllIIll[0]] = llllIIll[6];
                        if (llIIlIIIlll(Bank.contains(iArr) ? 1 : 0)) {
                            String[] strArr = new String[llllIIll[1]];
                            strArr[llllIIll[0]] = llllIIlI[llllIIll[7]];
                        }
                        int[] iArr2 = new int[llllIIll[1]];
                        iArr2[llllIIll[0]] = llllIIll[8];
                        if (llIIlIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                            String[] strArr2 = new String[llllIIll[1]];
                            strArr2[llllIIll[0]] = llllIIlI[llllIIll[9]];
                        }
                        int[] iArr3 = new int[llllIIll[1]];
                        iArr3[llllIIll[0]] = llllIIll[10];
                        if (llIIlIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                            String[] strArr3 = new String[llllIIll[1]];
                            strArr3[llllIIll[0]] = llllIIlI[llllIIll[11]];
                        }
                        int[] iArr4 = new int[llllIIll[1]];
                        iArr4[llllIIll[0]] = llllIIll[12];
                        if (llIIlIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                            String[] strArr4 = new String[llllIIll[1]];
                            strArr4[llllIIll[0]] = llllIIlI[llllIIll[13]];
                        }
                        int[] iArr5 = new int[llllIIll[1]];
                        iArr5[llllIIll[0]] = llllIIll[14];
                        if (llIIlIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                            String[] strArr5 = new String[llllIIll[1]];
                            strArr5[llllIIll[0]] = llllIIlI[llllIIll[15]];
                        }
                        if ((!llIIlIIIlll(Bank.contains(C0005f.aU) ? 1 : 0) || llIIlIIlIlI(Inventory.getCount(C0005f.aU), llllIIll[1])) && !llIIlIIIlIl(Equipment.contains(C0005f.aU) ? 1 : 0)) {
                            int[] iArr6 = new int[llllIIll[1]];
                            iArr6[llllIIll[0]] = llllIIll[6];
                            if (llIIlIIIlIl(Bank.contains(iArr6) ? 1 : 0)) {
                                Bank.withdraw(llllIIlI[llllIIll[17]], llllIIll[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llllIIll[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[llllIIll[1]];
                                    strArr6[llllIIll[0]] = llllIIlI[llllIIll[82]];
                                    if (llIIlIIlIIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = llllIIll[1];
                                        "".length();
                                        return " ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llllIIll[0];
                                }, llllIIll[4]);
                                "".length();
                            }
                            int[] iArr7 = new int[llllIIll[1]];
                            iArr7[llllIIll[0]] = llllIIll[8];
                            if (llIIlIIIlIl(Bank.contains(iArr7) ? 1 : 0)) {
                                Bank.withdraw(llllIIlI[llllIIll[18]], llllIIll[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llllIIll[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[llllIIll[1]];
                                    strArr6[llllIIll[0]] = llllIIlI[llllIIll[81]];
                                    if (llIIlIIlIIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = llllIIll[1];
                                        "".length();
                                        return " ".length() >= "   ".length() ? ((((133 + 74) - 180) + 164) ^ (((108 + 89) - 111) + 48)) & (((((152 + 72) - 198) + 144) ^ (((120 + 139) - 195) + 83)) ^ (-" ".length())) : r0;
                                    }
                                    return llllIIll[0];
                                }, llllIIll[4]);
                                "".length();
                            }
                            int[] iArr8 = new int[llllIIll[1]];
                            iArr8[llllIIll[0]] = llllIIll[10];
                            if (llIIlIIIlIl(Bank.contains(iArr8) ? 1 : 0)) {
                                Bank.withdraw(llllIIlI[llllIIll[19]], llllIIll[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llllIIll[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[llllIIll[1]];
                                    strArr6[llllIIll[0]] = llllIIlI[llllIIll[80]];
                                    if (llIIlIIlIIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = llllIIll[1];
                                        "".length();
                                        return (((13 ^ 122) ^ (85 ^ 124)) & (((118 ^ 101) ^ (140 ^ 193)) ^ (-" ".length()))) > " ".length() ? ((8 ^ 94) ^ (202 ^ 132)) & (((((93 + 125) - 47) + 10) ^ (((133 + 42) - 136) + 134)) ^ (-" ".length())) : r0;
                                    }
                                    return llllIIll[0];
                                }, llllIIll[4]);
                                "".length();
                            }
                            int[] iArr9 = new int[llllIIll[1]];
                            iArr9[llllIIll[0]] = llllIIll[12];
                            if (llIIlIIIlIl(Bank.contains(iArr9) ? 1 : 0)) {
                                Bank.withdraw(llllIIlI[llllIIll[20]], llllIIll[21], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llllIIll[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[llllIIll[1]];
                                    strArr6[llllIIll[0]] = llllIIlI[llllIIll[79]];
                                    if (llIIlIIlIIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = llllIIll[1];
                                        "".length();
                                        return (-" ".length()) > " ".length() ? ((((117 + 52) - 29) + 6) ^ (((71 + 27) - 46) + 79)) & (((48 ^ 45) ^ (91 ^ 87)) ^ (-" ".length())) : r0;
                                    }
                                    return llllIIll[0];
                                }, llllIIll[4]);
                                "".length();
                            }
                            int[] iArr10 = new int[llllIIll[1]];
                            iArr10[llllIIll[0]] = llllIIll[14];
                            if (llIIlIIIlIl(Bank.contains(iArr10) ? 1 : 0)) {
                                Bank.withdraw(llllIIlI[llllIIll[22]], llllIIll[23], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llllIIll[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[llllIIll[1]];
                                    strArr6[llllIIll[0]] = llllIIlI[llllIIll[78]];
                                    if (llIIlIIlIIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = llllIIll[1];
                                        "".length();
                                        return "   ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llllIIll[0];
                                }, llllIIll[4]);
                                "".length();
                            }
                            if (llIIlIIIlIl(Bank.contains(C0005f.aU) ? 1 : 0)) {
                                C0000a.b(C0005f.aU, llllIIll[1]);
                            }
                            int[] iArr11 = new int[llllIIll[1]];
                            iArr11[llllIIll[0]] = llllIIll[24];
                            if (llIIlIIIlIl(Bank.contains(iArr11) ? 1 : 0)) {
                                C0000a.a(llllIIll[24], llllIIll[1]);
                            }
                        }
                        ag();
                        System.out.println(llllIIlI[llllIIll[16]]);
                        bz = llllIIll[1];
                        return;
                    }
                }
            }
            if (llIIlIIIlIl(ac() ? 1 : 0)) {
                if (llIIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llIIlIIIlIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderBarrows.c = llllIIlI[llllIIll[25]];
                    System.out.println(llllIIlI[llllIIll[26]]);
                    Inventory.getAll(iZ).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (llIIlIIIlll(Inventory.isFull() ? 1 : 0)) {
                    if (llIIlIIIllI(Skills.getLevel(Skill.FISHING), llllIIll[27])) {
                        if (llIIlIIIllI(Skills.getLevel(Skill.FISHING), llllIIll[7])) {
                            if (llIIlIIIlll(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(iX), llllIIll[7])) {
                                AccBuilderBarrows.c = llllIIlI[llllIIll[28]];
                                if (llIIlIIIlIl(Inventory.contains(C0005f.aU) ? 1 : 0)) {
                                    Inventory.getFirst(C0005f.aU).interact(llllIIlI[llllIIll[29]]);
                                }
                                Movement.walkTo(iX);
                                "".length();
                                Time.sleepTicks(llllIIll[1]);
                                "".length();
                            }
                            if (llIIlIIIlIl(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llllIIlI[llllIIll[27]];
                                if (llIIlIIllII(Players.getLocal().getAnimation(), llllIIll[30])) {
                                    int[] iArr12 = new int[llllIIll[1]];
                                    iArr12[llllIIll[0]] = llllIIll[31];
                                    NPC nearest2 = NPCs.getNearest(iArr12);
                                    if (llIIlIIlIII(nearest2) && llIIlIIIlIl(iW.contains(nearest2) ? 1 : 0)) {
                                        int[] iArr13 = new int[llllIIll[1]];
                                        iArr13[llllIIll[0]] = llllIIll[31];
                                        NPCs.getNearest(iArr13).interact(llllIIll[0]);
                                        Time.sleepTicks(llllIIll[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                        if (llIIlIIlIlI(Skills.getLevel(Skill.FISHING), llllIIll[7]) && llIIlIIIllI(Skills.getLevel(Skill.FISHING), llllIIll[27])) {
                            if (llIIlIIIlll(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llllIIlI[llllIIll[32]];
                                Movement.walkTo(iX);
                                "".length();
                                Time.sleepTicks(llllIIll[1]);
                                "".length();
                            }
                            if (llIIlIIIlIl(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llllIIlI[llllIIll[33]];
                                if (llIIlIIllII(Players.getLocal().getAnimation(), llllIIll[30])) {
                                    int[] iArr14 = new int[llllIIll[1]];
                                    iArr14[llllIIll[0]] = llllIIll[31];
                                    NPC nearest3 = NPCs.getNearest(iArr14);
                                    if (llIIlIIlIII(nearest3) && llIIlIIIlIl(iW.contains(nearest3) ? 1 : 0)) {
                                        int[] iArr15 = new int[llllIIll[1]];
                                        iArr15[llllIIll[0]] = llllIIll[31];
                                        NPCs.getNearest(iArr15).interact(llllIIlI[llllIIll[34]]);
                                        Time.sleepTicks(llllIIll[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (llIIlIIlIlI(Skills.getLevel(Skill.FISHING), llllIIll[27])) {
                        if (llIIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(iY), llllIIll[22])) {
                            AccBuilderBarrows.c = llllIIlI[llllIIll[35]];
                            Movement.walkTo(iY);
                            "".length();
                            Time.sleepTicks(llllIIll[1]);
                            "".length();
                        }
                        if (llIIlIIllIl(Players.getLocal().getWorldLocation().distanceTo(iY), llllIIll[22])) {
                            AccBuilderBarrows.c = llllIIlI[llllIIll[36]];
                            if (llIIlIIllII(Players.getLocal().getAnimation(), llllIIll[30]) && llIIlIIlIII(NPCs.getNearest(npc -> {
                                if (llIIlIIllII(npc.getId(), llllIIll[77]) && llIIlIIllIl(npc.getWorldLocation().distanceTo(iY), llllIIll[22])) {
                                    ?? r0 = llllIIll[1];
                                    "".length();
                                    return (-" ".length()) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llllIIll[0];
                            }))) {
                                NPCs.getNearest(npc2 -> {
                                    if (llIIlIIllII(npc2.getId(), llllIIll[77]) && llIIlIIllIl(npc2.getWorldLocation().distanceTo(iY), llllIIll[22])) {
                                        ?? r0 = llllIIll[1];
                                        "".length();
                                        return " ".length() < 0 ? ((88 ^ 8) ^ (65 ^ 63)) & (((((78 + 44) - 89) + 120) ^ (((134 + 69) - 75) + 55)) ^ (-" ".length())) : r0;
                                    }
                                    return llllIIll[0];
                                }).interact(llllIIlI[llllIIll[37]]);
                                Time.sleepTicks(llllIIll[2]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    private static void llIIlIIIIll() {
        llllIIlI = new String[llllIIll[100]];
        llllIIlI[llllIIll[0]] = llIIlIIIIII("vJ+/RFxm2yIznXoEuD8dzQ==", "xmqlr");
        llllIIlI[llllIIll[1]] = llIIlIIIIIl("ACo/EDouJjVZKzM6OBcuZiolHCQ1b3EKPi83MhEgKCRxGyglKHENJmYlOAohLy02", "FCQyI");
        llllIIlI[llllIIll[2]] = llIIlIIIIIl("JxQUKh8IAQstH0kBDWMaCBsJ", "iubCx");
        llllIIlI[llllIIll[3]] = llIIlIIIIlI("CGXdvGI7HYwgm+Wh2RlqEA==", "IjVQk");
        llllIIlI[llllIIll[5]] = llIIlIIIIIl("DzMvBwcuPCZDCSY8KgoFIA==", "GRAck");
        llllIIlI[llllIIll[7]] = llIIlIIIIII("mRB69Ilx8xnjZpkUkSnaY4m42xSP5yEk", "fzWCh");
        llllIIlI[llllIIll[9]] = llIIlIIIIlI("LqSL6KdO8xACBzshMk3Kkw==", "iLtUO");
        llllIIlI[llllIIll[11]] = llIIlIIIIII("l3/nz5LCSYQu7HAKb+fI+v74Q07aPIXV", "OQNQa");
        llllIIlI[llllIIll[13]] = llIIlIIIIII("2BYwaaVbsz8=", "TWUkB");
        llllIIlI[llllIIll[15]] = llIIlIIIIIl("IQ0GPy4JA1U1Jg4Q", "gduWG");
        llllIIlI[llllIIll[16]] = llIIlIIIIII("dTkHbYDiSqMXAMkCt85LpTub3s5mWMWqX4ynJucyarGczjgvtXFhUWV31LdFlHo/", "QMaeu");
        llllIIlI[llllIIll[17]] = llIIlIIIIlI("EmueD1unXY/+bgACsgOXQPsoLv6cWvM+", "ajMjo");
        llllIIlI[llllIIll[18]] = llIIlIIIIII("pjH1Cby7RNbzs8r6CoIYAA==", "RBJmB");
        llllIIlI[llllIIll[19]] = llIIlIIIIIl("DAE9ZD8jHiwtNy1NNis9", "JmDDY");
        llllIIlI[llllIIll[20]] = llIIlIIIIlI("dzP6ZGiN8v0=", "rYZjv");
        llllIIlI[llllIIll[22]] = llIIlIIIIlI("N6uRWM06qEgb1zxDR1t+kQ==", "jODsq");
        llllIIlI[llllIIll[25]] = llIIlIIIIIl("CSMIHiQkPwBOOCI2FA==", "MQgnT");
        llllIIlI[llllIIll[26]] = llIIlIIIIII("pKwcES6roH/4VUXZXcP0xA==", "AvuOH");
        llllIIlI[llllIIll[28]] = llIIlIIIIIl("NjciVgMXdicbFhQ6dBAeCz50BQcXIg==", "xVTvw");
        llllIIlI[llllIIll[29]] = llIIlIIIIII("PC/qjZ0SsnA=", "kiVps");
        llllIIlI[llllIIll[27]] = llIIlIIIIlI("L2CZUA9H0rk=", "amsPG");
        llllIIlI[llllIIll[32]] = llIIlIIIIlI("JLNtrXjEHp+f/ctZnF2BXK8zkrATI4kz", "ZRfJF");
        llllIIlI[llllIIll[33]] = llIIlIIIIIl("BAobAi4sBA==", "BchjG");
        llllIIlI[llllIIll[34]] = llIIlIIIIlI("zYd7/NEvcCM=", "ExHAQ");
        llllIIlI[llllIIll[35]] = llIIlIIIIIl("KQoTahkISwMmFEcNDDkFRxgVJRk=", "gkeJm");
        llllIIlI[llllIIll[36]] = llIIlIIIIII("ULNaRxrl8Uk=", "PtuoQ");
        llllIIlI[llllIIll[37]] = llIIlIIIIII("bKTSHymQ6T8=", "DulDr");
        llllIIlI[llllIIll[38]] = llIIlIIIIlI("JHHyNZHcK7cNR++gnvrkUQ==", "aAeog");
        llllIIlI[llllIIll[39]] = llIIlIIIIII("t6zFTkASvGa3cBkHT+32ng==", "ncJjl");
        llllIIlI[llllIIll[40]] = llIIlIIIIIl("FhkBHB8+F1IHBj8E", "Pprtv");
        llllIIlI[llllIIll[41]] = llIIlIIIIIl("JSEfbiMfNg==", "pRzCQ");
        llllIIlI[llllIIll[42]] = llIIlIIIIlI("CBhjOKoTZTviLJ9WOn4UbA==", "cRFCQ");
        llllIIlI[llllIIll[43]] = llIIlIIIIIl("NDs/DwUaNzVGFAcrOAgRUjslAxsBfnEVARsmMg4fHDVxBBcROXESGVI0OBUeGzw2", "rRQfv");
        llllIIlI[llllIIll[44]] = llIIlIIIIlI("2ovz1ADupxFLEwoyWdc37gfMIUdRMo+m", "gTuUL");
        llllIIlI[llllIIll[45]] = llIIlIIIIII("2Gr0ErWyLNknVMNXyS8O8g==", "zyqDI");
        llllIIlI[llllIIll[46]] = llIIlIIIIIl("PwYYCQMeCRFNDRYJHQQBEA==", "wgvmo");
        llllIIlI[llllIIll[47]] = llIIlIIIIIl("NhUYAAFFHhAfBQwWHkwDAAw=", "exylm");
        llllIIlI[llllIIll[48]] = llIIlIIIIlI("Rd/ntuXR9bEYorU+kPPjGjbi/E8pGQlK9O2GyARpyuyc10fsPnGKQA3Jwef2a3Dt", "rNWFG");
        llllIIlI[llllIIll[49]] = llIIlIIIIII("EJVGdaeL/1RfaElXCNV4WvrnVSw0gxX/", "vZKiV");
        llllIIlI[llllIIll[53]] = llIIlIIIIlI("BQN3Xm4IYAVJ/P3tCcv/OA==", "BEAhn");
        llllIIlI[llllIIll[54]] = llIIlIIIIII("fTzisDuGtY8fDeW1exYrWDM7SuImhJAj", "TrDtd");
        llllIIlI[llllIIll[55]] = llIIlIIIIlI("4JhGNblkIrM=", "SFGZJ");
        llllIIlI[llllIIll[56]] = llIIlIIIIIl("Dj0QJSYmMw==", "HTcMO");
        llllIIlI[llllIIll[57]] = llIIlIIIIIl("AzcnKR5wPC82Gjk0IWUcNS4=", "PZFEr");
        llllIIlI[llllIIll[58]] = llIIlIIIIIl("OBU7BBpLHjMbHgIWPUgYDgw=", "kxZhv");
        llllIIlI[llllIIll[59]] = llIIlIIIIII("y0lCCmQXxVbaYE0RGpKDBQ==", "RAGxr");
        llllIIlI[llllIIll[60]] = llIIlIIIIIl("DyU1SzEgOiQCOS5pPgQz", "IILkW");
        llllIIlI[llllIIll[61]] = llIIlIIIIII("VCy4vHohatI=", "xhaSG");
        llllIIlI[llllIIll[62]] = llIIlIIIIlI("1qtyp/FQdHTb1IRt/W3i+g==", "KbSMQ");
        llllIIlI[llllIIll[73]] = llIIlIIIIlI("qvuqm103Ypo=", "QGkbU");
        llllIIlI[llllIIll[75]] = llIIlIIIIII("Q0FbTheT5kSjEf4VNEMJEUAPvRvTxOJc", "Jnyeg");
        llllIIlI[llllIIll[76]] = llIIlIIIIIl("GRUTKAdqHhs3AyMWFWQFLww=", "JxrDk");
        llllIIlI[llllIIll[78]] = llIIlIIIIlI("ByF0tVwiXnaPPpj5Znsdmw==", "xlOhV");
        llllIIlI[llllIIll[79]] = llIIlIIIIlI("1YmC3H1N9iU=", "Uyudi");
        llllIIlI[llllIIll[80]] = llIIlIIIIlI("6rC0R+Xwfv07LLddeMgwcA==", "QLKpV");
        llllIIlI[llllIIll[81]] = llIIlIIIIIl("HioSIwc2JEE5ATw=", "XCaKn");
        llllIIlI[llllIIll[82]] = llIIlIIIIlI("KZsQ7stGmWSBeCVSzKEmim8uaX3qFRNu", "eygaV");
    }

    public static void cY() {
        if (llIIlIIIlIl(Inventory.isFull() ? 1 : 0)) {
            AccBuilderBarrows.c = llllIIlI[llllIIll[38]];
            System.out.println(llllIIlI[llllIIll[39]]);
            Inventory.getAll(iZ).stream().forEach((v0) -> {
                v0.drop();
            });
        }
        if (llIIlIIIlll(Inventory.isFull() ? 1 : 0) && llIIlIIllII(Players.getLocal().getAnimation(), llllIIll[30])) {
            String[] strArr = new String[llllIIll[1]];
            strArr[llllIIll[0]] = llllIIlI[llllIIll[40]];
            NPCs.getNearest(strArr).interact(llllIIlI[llllIIll[41]]);
            Time.sleepTicks(llllIIll[2]);
            "".length();
        }
    }

    private static String llIIlIIIIlI(String lIIlllIIlllIlII, String lIIlllIIlllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlllIIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlllIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlllIIlllIlIl) {
            lIIlllIIlllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIlIl(int i) {
        return i != 0;
    }

    private static boolean llIIlIIlIIl(int i) {
        return i > 0;
    }

    public static void ag() {
        int[] iArr = new int[llllIIll[1]];
        iArr[llllIIll[0]] = llllIIll[6];
        if (llIIlIIIlll(Bank.contains(iArr) ? 1 : 0)) {
            bB.add(new C0003d(llllIIll[6], llllIIll[1], llllIIll[4]));
            "".length();
        }
        int[] iArr2 = new int[llllIIll[1]];
        iArr2[llllIIll[0]] = llllIIll[8];
        if (llIIlIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(llllIIll[8], llllIIll[1], llllIIll[4]));
            "".length();
        }
        int[] iArr3 = new int[llllIIll[1]];
        iArr3[llllIIll[0]] = llllIIll[10];
        if (llIIlIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(llllIIll[10], llllIIll[1], llllIIll[63]));
            "".length();
        }
        int[] iArr4 = new int[llllIIll[1]];
        iArr4[llllIIll[0]] = llllIIll[14];
        if (llIIlIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(llllIIll[14], llllIIll[64], llllIIll[65]));
            "".length();
        }
        int[] iArr5 = new int[llllIIll[1]];
        iArr5[llllIIll[0]] = llllIIll[12];
        if (llIIlIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
            bB.add(new C0003d(llllIIll[12], llllIIll[66], llllIIll[7]));
            "".length();
        }
        int[] iArr6 = new int[llllIIll[1]];
        iArr6[llllIIll[0]] = llllIIll[67];
        if (llIIlIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
            bB.add(new C0003d(llllIIll[67], llllIIll[1], llllIIll[4]));
            "".length();
        }
        int[] iArr7 = new int[llllIIll[1]];
        iArr7[llllIIll[0]] = llllIIll[24];
        if (llIIlIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
            bB.add(new C0003d(llllIIll[24], llllIIll[16], llllIIll[4]));
            "".length();
        }
        if (llIIlIIIlll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llllIIlI[llllIIll[75]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(llllIIll[68], llllIIll[7], llllIIll[69]));
            "".length();
        }
        int[] iArr8 = new int[llllIIll[1]];
        iArr8[llllIIll[0]] = llllIIll[70];
        if (llIIlIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
            bB.add(new C0003d(llllIIll[70], llllIIll[54], llllIIll[71]));
            "".length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0148, code lost:
        if (llIIlIIlIlI(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.N.llllIIll[1]) != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v176, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cZ() {
        if (llIIlIIIlIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = llllIIlI[llllIIll[42]];
            C0001b.a(bB);
            if (llIIlIIIllI(bB.size(), llllIIll[1])) {
                System.out.println(llllIIlI[llllIIll[43]]);
                bz = llllIIll[0];
            }
        }
        if (llIIlIIIlll(bz ? 1 : 0)) {
            if (llIIlIIIlll(da() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIlIIlIII(nearest) && llIIlIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llllIIlI[llllIIll[44]];
                    C0000a.a(nearest);
                }
                if (llIIlIIlIII(nearest) && llIIlIIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIlIIIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIlI[llllIIll[45]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIIll[4]);
                        "".length();
                    }
                    if (llIIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIlI[llllIIll[46]];
                        if (llIIlIIlIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIIll[5]);
                            "".length();
                        }
                        int[] iArr = new int[llllIIll[1]];
                        iArr[llllIIll[0]] = llllIIll[6];
                        if (llIIlIIIlll(Bank.contains(iArr) ? 1 : 0)) {
                            String[] strArr = new String[llllIIll[1]];
                            strArr[llllIIll[0]] = llllIIlI[llllIIll[47]];
                        }
                        if (!llIIlIIIlll(Bank.contains(C0005f.aU) ? 1 : 0) || !llIIlIIIlll(Inventory.contains(C0005f.aU) ? 1 : 0) || !llIIlIIIlll(Equipment.contains(C0005f.aU) ? 1 : 0)) {
                            int[] iArr2 = new int[llllIIll[1]];
                            iArr2[llllIIll[0]] = llllIIll[6];
                            if (llIIlIIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                                Bank.withdraw(llllIIlI[llllIIll[49]], llllIIll[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llllIIll[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr2 = new String[llllIIll[1]];
                                    strArr2[llllIIll[0]] = llllIIlI[llllIIll[76]];
                                    if (llIIlIIlIIl(Inventory.getCount(strArr2))) {
                                        ?? r0 = llllIIll[1];
                                        "".length();
                                        return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llllIIll[0];
                                }, llllIIll[4]);
                                "".length();
                            }
                            if (llIIlIIIlIl(Bank.contains(C0005f.aU) ? 1 : 0)) {
                                C0000a.b(C0005f.aU, llllIIll[1]);
                            }
                        }
                        ag();
                        System.out.println(llllIIlI[llllIIll[48]]);
                        bz = llllIIll[1];
                        return;
                    }
                }
            }
            if (llIIlIIIlIl(da() ? 1 : 0)) {
                if (llIIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llIIlIIIlIl(Inventory.isFull() ? 1 : 0)) {
                    int[] iArr3 = new int[llllIIll[1]];
                    iArr3[llllIIll[0]] = llllIIll[50];
                    if (llIIlIIIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(llllIIll[51], llllIIll[52], llllIIll[0]);
                        if (llIIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIIll[9])) {
                            AccBuilderBarrows.c = llllIIlI[llllIIll[53]];
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(llllIIll[1]);
                            "".length();
                        }
                        if (llIIlIIllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIIll[13])) {
                            if (llIIlIIIlll(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                            }
                            if (llIIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks(llllIIll[2]);
                                "".length();
                                Bank.depositInventory();
                                Time.sleepTicks(llllIIll[2]);
                                "".length();
                                C0000a.a(llllIIll[6], llllIIll[1]);
                            }
                        }
                    }
                }
                if (llIIlIIIlll(Inventory.isFull() ? 1 : 0)) {
                    if (llIIlIIIlll(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(iX), llllIIll[7])) {
                        AccBuilderBarrows.c = llllIIlI[llllIIll[54]];
                        if (llIIlIIIlIl(Inventory.contains(C0005f.aU) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.aU).interact(llllIIlI[llllIIll[55]]);
                        }
                        Movement.walkTo(iX);
                        "".length();
                        Time.sleepTicks(llllIIll[1]);
                        "".length();
                    }
                    if (llIIlIIIlIl(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIlI[llllIIll[56]];
                        if (llIIlIIllII(Players.getLocal().getAnimation(), llllIIll[30])) {
                            int[] iArr4 = new int[llllIIll[1]];
                            iArr4[llllIIll[0]] = llllIIll[31];
                            if (llIIlIIlIII(NPCs.getNearest(iArr4))) {
                                int[] iArr5 = new int[llllIIll[1]];
                                iArr5[llllIIll[0]] = llllIIll[31];
                                NPCs.getNearest(iArr5).interact(llllIIll[0]);
                                Time.sleepTicks(llllIIll[7]);
                                "".length();
                            }
                        }
                    }
                }
                if (llIIlIIIlIl(Inventory.isFull() ? 1 : 0)) {
                    int[] iArr6 = new int[llllIIll[1]];
                    iArr6[llllIIll[0]] = llllIIll[50];
                    if (llIIlIIIlIl(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llllIIll[1]];
                        iArr7[llllIIll[0]] = llllIIll[50];
                        Inventory.getAll(iArr7).stream().forEach((v0) -> {
                            v0.drop();
                        });
                    }
                }
            }
        }
    }

    private static boolean llIIlIIlIII(Object obj) {
        return obj != null;
    }

    private static void llIIlIIIlII() {
        llllIIll = new int[101];
        llllIIll[0] = (3 ^ 7) & ((97 ^ 101) ^ (-1));
        llllIIll[1] = " ".length();
        llllIIll[2] = "  ".length();
        llllIIll[3] = "   ".length();
        llllIIll[4] = (-26694) & 31693;
        llllIIll[5] = (((43 + 38) - 24) + 94) ^ (((69 + 51) - 46) + 73);
        llllIIll[6] = (-((-1) & 15873)) & (-16577) & 32751;
        llllIIll[7] = (((138 + 10) - 69) + 62) ^ (((41 + 21) - (-12)) + 62);
        llllIIll[8] = (-31937) & 32243;
        llllIIll[9] = (183 ^ 173) ^ (42 ^ 54);
        llllIIll[10] = (-20033) & 20341;
        llllIIll[11] = (167 ^ 173) ^ (82 ^ 95);
        llllIIll[12] = (-((-20553) & 31309)) & (-194) & 11263;
        llllIIll[13] = (181 ^ 141) ^ (31 ^ 47);
        llllIIll[14] = (-2181) & 2493;
        llllIIll[15] = " ".length() ^ (121 ^ 113);
        llllIIll[16] = 166 ^ 172;
        llllIIll[17] = (55 ^ 61) ^ " ".length();
        llllIIll[18] = 25 ^ 21;
        llllIIll[19] = (165 ^ 141) ^ (229 ^ 192);
        llllIIll[20] = (109 ^ 127) ^ (159 ^ 131);
        llllIIll[21] = (-28681) & 128680;
        llllIIll[22] = (110 ^ 52) ^ (211 ^ 134);
        llllIIll[23] = (-((-4353) & 29975)) & (-6145) & 32766;
        llllIIll[24] = (-24709) & 32716;
        llllIIll[25] = (44 ^ 2) ^ (171 ^ 149);
        llllIIll[26] = (22 ^ 59) ^ (124 ^ 64);
        llllIIll[27] = (((121 + 23) - 21) + 68) ^ (((91 + 15) - (-60)) + 5);
        llllIIll[28] = 38 ^ 52;
        llllIIll[29] = 52 ^ 39;
        llllIIll[30] = -" ".length();
        llllIIll[31] = (-10579) & 12122;
        llllIIll[32] = 15 ^ 26;
        llllIIll[33] = 142 ^ 152;
        llllIIll[34] = 181 ^ 162;
        llllIIll[35] = (87 ^ 19) ^ (218 ^ 134);
        llllIIll[36] = 89 ^ 64;
        llllIIll[37] = 63 ^ 37;
        llllIIll[38] = 154 ^ 129;
        llllIIll[39] = 8 ^ 20;
        llllIIll[40] = (((124 + 22) - 5) + 13) ^ (((14 + 76) - 31) + 76);
        llllIIll[41] = 0 ^ 30;
        llllIIll[42] = (((117 + 73) - 137) + 111) ^ (((158 + 2) - 0) + 27);
        llllIIll[43] = 106 ^ 74;
        llllIIll[44] = 19 ^ 50;
        llllIIll[45] = 9 ^ 43;
        llllIIll[46] = (249 ^ 194) ^ (157 ^ 133);
        llllIIll[47] = 29 ^ 57;
        llllIIll[48] = 89 ^ 124;
        llllIIll[49] = 224 ^ 198;
        llllIIll[50] = (-((-773) & 11191)) & (-4105) & 14843;
        llllIIll[51] = (-22025) & 24559;
        llllIIll[52] = (-25091) & 28663;
        llllIIll[53] = 21 ^ 50;
        llllIIll[54] = 37 ^ 13;
        llllIIll[55] = 110 ^ 71;
        llllIIll[56] = 120 ^ 82;
        llllIIll[57] = (28 ^ 64) ^ (207 ^ 184);
        llllIIll[58] = (186 ^ 145) ^ (135 ^ 128);
        llllIIll[59] = 154 ^ 183;
        llllIIll[60] = (((115 + 22) - 114) + 105) ^ (((131 + 159) - 228) + 112);
        llllIIll[61] = 20 ^ 59;
        llllIIll[62] = (74 ^ 47) ^ (209 ^ 132);
        llllIIll[63] = (-((-1042) & 23577)) & (-1) & 31535;
        llllIIll[64] = (-((-43) & 31339)) & (-148) & 31743;
        llllIIll[65] = (-2562) & 3061;
        llllIIll[66] = (-3108) & 16107;
        llllIIll[67] = (-((-6335) & 22783)) & (-145) & 20445;
        llllIIll[68] = (-4131) & 16110;
        llllIIll[69] = (-((-27021) & 32734)) & (-2049) & 32761;
        llllIIll[70] = (-8337) & 16343;
        llllIIll[71] = (-((-2113) & 31860)) & (-2057) & 32703;
        llllIIll[72] = 213 ^ 177;
        llllIIll[73] = (51 ^ 38) ^ (82 ^ 118);
        llllIIll[74] = 194 ^ 161;
        llllIIll[75] = (214 ^ 176) ^ (98 ^ 54);
        llllIIll[76] = (((72 + 40) - 2) + 31) ^ (((58 + 150) - 47) + 29);
        llllIIll[77] = (-((-5003) & 31643)) & (-515) & 28662;
        llllIIll[78] = 167 ^ 147;
        llllIIll[79] = 121 ^ 76;
        llllIIll[80] = (106 ^ 61) ^ (65 ^ 32);
        llllIIll[81] = (((155 + 211) - 235) + 110) ^ (((77 + 7) - 31) + 145);
        llllIIll[82] = 49 ^ 9;
        llllIIll[83] = (-((-4482) & 30595)) & (-4097) & 32715;
        llllIIll[84] = (-((-18573) & 23199)) & (-8193) & 16374;
        llllIIll[85] = (-26121) & 28637;
        llllIIll[86] = (-12291) & 15862;
        llllIIll[87] = (-21524) & 24055;
        llllIIll[88] = (-25131) & 28542;
        llllIIll[89] = (-18441) & 19951;
        llllIIll[90] = (-((-1041) & 29723)) & (-513) & 30715;
        llllIIll[91] = (-18961) & 20479;
        llllIIll[92] = (-((-16537) & 31961)) & (-16897) & 32637;
        llllIIll[93] = (-((-673) & 32441)) & (-513) & 32607;
        llllIIll[94] = (-((-3485) & 16285)) & (-1157) & 14287;
        llllIIll[95] = (-((-387) & 32167)) & (-515) & 32639;
        llllIIll[96] = (-15377) & 15711;
        llllIIll[97] = (-((-1282) & 18227)) & (-137) & 28411;
        llllIIll[98] = (-((-11490) & 28141)) & (-689) & 28671;
        llllIIll[99] = (-16553) & 27880;
        llllIIll[100] = (((10 + 116) - (-7)) + 51) ^ (((49 + 11) - 24) + 93);
    }

    private static String llIIlIIIIII(String lIIlllIIllIIlll, String lIIlllIIllIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlllIIllIIllI.getBytes(StandardCharsets.UTF_8)), llllIIll[13]), "DES");
            Cipher lIIlllIIllIlIIl = Cipher.getInstance("DES");
            lIIlllIIllIlIIl.init(llllIIll[2], secretKeySpec);
            return new String(lIIlllIIllIlIIl.doFinal(Base64.getDecoder().decode(lIIlllIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlllIIllIlIII) {
            lIIlllIIllIlIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean ac() {
        String[] strArr = new String[llllIIll[1]];
        strArr[llllIIll[0]] = llllIIlI[llllIIll[58]];
        if (llIIlIIIlIl(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[llllIIll[1]];
            strArr2[llllIIll[0]] = llllIIlI[llllIIll[59]];
            if (llIIlIIIlIl(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[llllIIll[1]];
                strArr3[llllIIll[0]] = llllIIlI[llllIIll[60]];
                if (llIIlIIIlIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[llllIIll[1]];
                    strArr4[llllIIll[0]] = llllIIlI[llllIIll[61]];
                    if (llIIlIIIlIl(Inventory.contains(strArr4) ? 1 : 0)) {
                        String[] strArr5 = new String[llllIIll[1]];
                        strArr5[llllIIll[0]] = llllIIlI[llllIIll[62]];
                        if (llIIlIIIlIl(Inventory.contains(strArr5) ? 1 : 0) && (!llIIlIIIlll(Inventory.contains(C0005f.aU) ? 1 : 0) || llIIlIIIlIl(Equipment.contains(C0005f.aU) ? 1 : 0))) {
                            ?? r0 = llllIIll[1];
                            "".length();
                            return (-" ".length()) > (5 ^ 1) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                }
            }
        }
        return llllIIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean da() {
        String[] strArr = new String[llllIIll[1]];
        strArr[llllIIll[0]] = llllIIlI[llllIIll[57]];
        if (!llIIlIIIlIl(Inventory.contains(strArr) ? 1 : 0) || (llIIlIIIlll(Inventory.contains(C0005f.aU) ? 1 : 0) && !llIIlIIIlIl(Equipment.contains(C0005f.aU) ? 1 : 0))) {
            return llllIIll[0];
        }
        ?? r0 = llllIIll[1];
        "".length();
        return ((50 ^ 100) & ((247 ^ 161) ^ (-1))) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static boolean llIIlIIllII(int i, int i2) {
        return i == i2;
    }

    private static String llIIlIIIIIl(String lIIlllIIlIlIlll, String lIIlllIIlIlIIIl) {
        String str = new String(Base64.getDecoder().decode(lIIlllIIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlllIIlIlIlIl = new StringBuilder();
        char[] charArray = lIIlllIIlIlIIIl.toCharArray();
        int lIIlllIIlIlIIll = llllIIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIIll[0];
        while (llIIlIIIllI(i, length)) {
            char lIIlllIIlIllIII = charArray2[i];
            lIIlllIIlIlIlIl.append((char) (lIIlllIIlIllIII ^ charArray[lIIlllIIlIlIIll % charArray.length]));
            "".length();
            lIIlllIIlIlIIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lIIlllIIlIlIlIl);
    }

    private static boolean llIIlIIlIll(int i, int i2) {
        return i > i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        cX();
        return llllIIll[72];
    }
}
