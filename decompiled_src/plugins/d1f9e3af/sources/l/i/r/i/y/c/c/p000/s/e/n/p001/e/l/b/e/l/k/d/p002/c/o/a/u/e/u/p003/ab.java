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
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.ab  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/ab.class */
public class ab implements W {
    static /* synthetic */ WorldPoint lw;
    private static /* synthetic */ String[] lIIlIlIII;
    static /* synthetic */ WorldPoint kR;
    static /* synthetic */ WorldPoint ls;
    static /* synthetic */ WorldPoint lk;
    public static /* synthetic */ int kx;
    static /* synthetic */ WorldPoint lo;
    static /* synthetic */ WorldPoint kW;
    public static /* synthetic */ int bZ;
    static /* synthetic */ String cc;
    static /* synthetic */ WorldPoint lf;
    static /* synthetic */ WorldPoint lA;
    public static /* synthetic */ int ky;
    static /* synthetic */ WorldPoint lu;
    static /* synthetic */ WorldPoint kV;
    static /* synthetic */ String h;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint lb;
    static /* synthetic */ ArrayList<WorldPoint> kL;
    static /* synthetic */ WorldPoint lv;
    static /* synthetic */ WorldPoint lr;
    static /* synthetic */ WorldPoint lq;
    static /* synthetic */ WorldPoint kQ;
    static /* synthetic */ WorldPoint lz;
    static /* synthetic */ WorldPoint ly;
    static /* synthetic */ WorldPoint lp;
    static /* synthetic */ boolean kK;
    private static /* synthetic */ int[] lIIlIlIll;
    static /* synthetic */ WorldPoint kO;
    static /* synthetic */ ArrayList<WorldPoint> kM;
    static /* synthetic */ WorldPoint lx;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ boolean bW;
    static /* synthetic */ WorldPoint le;
    static /* synthetic */ WorldPoint li;
    static /* synthetic */ WorldPoint ll;
    static /* synthetic */ WorldPoint lB;
    static /* synthetic */ WorldPoint lt;
    static /* synthetic */ WorldPoint kX;
    static /* synthetic */ WorldPoint kP;
    static /* synthetic */ WorldPoint la;
    static /* synthetic */ WorldPoint lm;
    static /* synthetic */ WorldPoint kT;
    static /* synthetic */ WorldPoint kU;
    static /* synthetic */ WorldPoint lh;
    static /* synthetic */ WorldPoint lj;
    static /* synthetic */ WorldPoint kY;
    static /* synthetic */ WorldPoint kN;
    public static /* synthetic */ int kz;
    static /* synthetic */ WorldPoint ln;
    static /* synthetic */ WorldPoint lc;
    static /* synthetic */ WorldPoint kS;
    static /* synthetic */ WorldPoint lg;
    static /* synthetic */ WorldPoint ld;
    static /* synthetic */ WorldPoint kZ;

    private static boolean dx() {
        return Static.getClient().isInInstancedRegion();
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return h + cc;
    }

    private static boolean lllllIlIlII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    private static boolean dz() {
        int i = lIIlIlIll[0];
        int[] iArr = new int[lIIlIlIll[1]];
        iArr[lIIlIlIll[0]] = lIIlIlIll[129];
        if (lllllIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIlIlIll[1]];
            iArr2[lIIlIlIll[0]] = lIIlIlIll[129];
            i += Inventory.getFirst(iArr2).getQuantity();
        }
        int[] iArr3 = new int[lIIlIlIll[1]];
        iArr3[lIIlIlIll[0]] = lIIlIlIll[130];
        if (lllllIlIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lIIlIlIll[1]];
            iArr4[lIIlIlIll[0]] = lIIlIlIll[130];
            i += Inventory.getFirst(iArr4).getQuantity();
        }
        int[] iArr5 = new int[lIIlIlIll[1]];
        iArr5[lIIlIlIll[0]] = lIIlIlIll[131];
        if (lllllIlIIIl(Inventory.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lIIlIlIll[1]];
            iArr6[lIIlIlIll[0]] = lIIlIlIll[131];
            i += Inventory.getFirst(iArr6).getQuantity();
        }
        if (lllllIlIlII(i, lIIlIlIll[124])) {
            ?? r0 = lIIlIlIll[1];
            "".length();
            return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIlIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v169, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v178, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v218, types: [boolean] */
    public static void ds() {
        if (lllllIlIIIl(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[0]];
            C0001b.a(bv);
            if (lllllIlIIlI(bv.size(), lIIlIlIll[1])) {
                System.out.println(lIIlIlIII[lIIlIlIll[1]]);
                bt = lIIlIlIll[0];
            }
        }
        if (lllllIlIIll(bt ? 1 : 0) && lllllIlIIlI(Skills.getLevel(Skill.FARMING), lIIlIlIll[2])) {
            if (lllllIlIIlI(Skills.getLevel(Skill.FARMING), lIIlIlIll[3])) {
                cc = lIIlIlIII[lIIlIlIll[4]];
                C0014o.ay();
            }
            if (lllllIlIIll(ab() ? 1 : 0) && lllllIlIlII(Skills.getLevel(Skill.FARMING), lIIlIlIll[3])) {
                cc = lIIlIlIII[lIIlIlIll[5]];
                BankLocation nearest = BankLocation.getNearest();
                if (lllllIlIlIl(nearest) && lllllIlIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[6]];
                    if (lllllIlIIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        Time.sleepTicks(lIIlIlIll[6]);
                        "".length();
                        if (lllllIlIIIl(ab() ? 1 : 0)) {
                            return;
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lllllIlIlIl(nearest) && lllllIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[7]];
                    if (lllllIlIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIlIll[8]);
                        "".length();
                    }
                    if (lllllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lllllIlIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIlIll[1]);
                            "".length();
                        }
                        if (lllllIlIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIlIll[4]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[lIIlIlIll[1]];
                    iArr[lIIlIlIll[0]] = lIIlIlIll[9];
                    if (lllllIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIIlIlIll[1]];
                        iArr2[lIIlIlIll[0]] = lIIlIlIll[9];
                        if (lllllIlIIlI(Bank.getFirst(iArr2).getQuantity(), lIIlIlIll[10])) {
                            af();
                            System.out.println(lIIlIlIII[lIIlIlIll[11]]);
                            bt = lIIlIlIll[1];
                            return;
                        }
                    }
                    int[] iArr3 = new int[lIIlIlIll[12]];
                    iArr3[lIIlIlIll[0]] = lIIlIlIll[13];
                    iArr3[lIIlIlIll[1]] = lIIlIlIll[14];
                    iArr3[lIIlIlIll[4]] = lIIlIlIll[15];
                    iArr3[lIIlIlIll[5]] = lIIlIlIll[16];
                    iArr3[lIIlIlIll[6]] = lIIlIlIll[17];
                    iArr3[lIIlIlIll[7]] = lIIlIlIll[18];
                    iArr3[lIIlIlIll[11]] = lIIlIlIll[19];
                    iArr3[lIIlIlIll[20]] = lIIlIlIll[21];
                    iArr3[lIIlIlIll[22]] = lIIlIlIll[9];
                    iArr3[lIIlIlIll[23]] = lIIlIlIll[24];
                    if (lllllIlIIll(C0004e.b(iArr3) ? 1 : 0)) {
                        af();
                        System.out.println(lIIlIlIII[lIIlIlIll[20]]);
                        bt = lIIlIlIll[1];
                        return;
                    }
                    int[] iArr4 = new int[lIIlIlIll[12]];
                    iArr4[lIIlIlIll[0]] = lIIlIlIll[13];
                    iArr4[lIIlIlIll[1]] = lIIlIlIll[14];
                    iArr4[lIIlIlIll[4]] = lIIlIlIll[15];
                    iArr4[lIIlIlIll[5]] = lIIlIlIll[16];
                    iArr4[lIIlIlIll[6]] = lIIlIlIll[17];
                    iArr4[lIIlIlIll[7]] = lIIlIlIll[18];
                    iArr4[lIIlIlIll[11]] = lIIlIlIll[19];
                    iArr4[lIIlIlIll[20]] = lIIlIlIll[21];
                    iArr4[lIIlIlIll[22]] = lIIlIlIll[9];
                    iArr4[lIIlIlIll[23]] = lIIlIlIll[24];
                    if (lllllIlIIIl(C0004e.b(iArr4) ? 1 : 0)) {
                        C0000a.a(lIIlIlIll[25], lIIlIlIll[1]);
                        C0000a.a(lIIlIlIll[26], lIIlIlIll[1]);
                        C0000a.a(lIIlIlIll[27], lIIlIlIll[1]);
                        C0000a.a(lIIlIlIll[28], lIIlIlIll[1]);
                        C0000a.a(lIIlIlIll[29], lIIlIlIll[1]);
                        C0000a.a(lIIlIlIll[30], lIIlIlIll[1]);
                        C0000a.a(lIIlIlIll[31], lIIlIlIll[1]);
                        int[] iArr5 = new int[lIIlIlIll[1]];
                        iArr5[lIIlIlIll[0]] = lIIlIlIll[25];
                        if (lllllIlIIll(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIlIlIll[1]];
                            iArr6[lIIlIlIll[0]] = lIIlIlIll[25];
                            if (lllllIlIIll(Equipment.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[lIIlIlIll[1]];
                                iArr7[lIIlIlIll[0]] = lIIlIlIll[25];
                                if (lllllIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
                                    C0000a.a(lIIlIlIll[32], lIIlIlIll[1]);
                                }
                            }
                        }
                        C0000a.a(lIIlIlIll[17], lIIlIlIll[1]);
                        C0004e.l(lIIlIlIll[25]);
                        C0004e.l(lIIlIlIll[26]);
                        C0004e.l(lIIlIlIll[27]);
                        C0004e.l(lIIlIlIll[28]);
                        C0004e.l(lIIlIlIll[29]);
                        Time.sleepTicks(lIIlIlIll[1]);
                        "".length();
                        C0004e.l(lIIlIlIll[31]);
                        C0004e.l(lIIlIlIll[33]);
                        C0004e.l(lIIlIlIll[30]);
                        C0004e.l(lIIlIlIll[32]);
                        C0004e.l(lIIlIlIll[17]);
                        Time.sleepTicks(lIIlIlIll[5]);
                        "".length();
                        if (lllllIlIIll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIIlIlIll[11]);
                            "".length();
                        }
                        if (lllllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                            if (lllllIlIIlI(Skills.getLevel(Skill.FARMING), lIIlIlIll[3])) {
                                C0000a.a(lIIlIlIll[13], lIIlIlIll[12]);
                                C0000a.a(lIIlIlIll[14], lIIlIlIll[12]);
                                C0000a.a(lIIlIlIll[19], lIIlIlIll[12]);
                                C0000a.a(lIIlIlIll[15], lIIlIlIll[12]);
                                C0000a.b(C0005f.bf, lIIlIlIll[1]);
                                C0000a.b(C0005f.aO, lIIlIlIll[1]);
                                C0000a.a(lIIlIlIll[18], lIIlIlIll[7]);
                                C0000a.a(lIIlIlIll[21], lIIlIlIll[34]);
                            }
                            if (lllllIlIlII(Skills.getLevel(Skill.FARMING), lIIlIlIll[3])) {
                                C0000a.a(lIIlIlIll[9], lIIlIlIll[35]);
                                C0000a.a(lIIlIlIll[36], lIIlIlIll[1]);
                                C0000a.a(lIIlIlIll[24], lIIlIlIll[1]);
                            }
                        }
                    }
                }
            }
            if (lllllIlIIIl(ab() ? 1 : 0)) {
                String[] strArr = new String[lIIlIlIll[1]];
                strArr[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[22]];
                if (lllllIlIIIl(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIlIlIll[1]];
                    strArr2[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[23]];
                    Inventory.getFirst(strArr2).interact(lIIlIlIII[lIIlIlIll[12]]);
                }
                if (lllllIlIIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lllllIlIIlI(Movement.getRunEnergy(), lIIlIlIll[37])) {
                    Inventory.getFirst(C0005f.aV).interact(lIIlIlIII[lIIlIlIll[38]]);
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                }
                if (lllllIlIlll(Movement.getRunEnergy(), lIIlIlIll[39]) && lllllIlIIll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lllllIlIlII(Skills.getLevel(Skill.FARMING), lIIlIlIll[3])) {
                    dt();
                }
            }
        }
    }

    private static boolean lllllIlIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean dy() {
        if (lllllIlIlII(Skills.getLevel(Skill.FARMING), lIIlIlIll[49])) {
            int[] iArr = new int[lIIlIlIll[1]];
            iArr[lIIlIlIll[0]] = lIIlIlIll[126];
            return Inventory.contains(iArr);
        } else if (lllllIlIlII(Skills.getLevel(Skill.FARMING), lIIlIlIll[51]) && lllllIlIIlI(Skills.getLevel(Skill.FARMING), lIIlIlIll[49])) {
            int[] iArr2 = new int[lIIlIlIll[1]];
            iArr2[lIIlIlIll[0]] = lIIlIlIll[127];
            return Inventory.contains(iArr2);
        } else {
            int[] iArr3 = new int[lIIlIlIll[1]];
            iArr3[lIIlIlIll[0]] = lIIlIlIll[128];
            return Inventory.contains(iArr3);
        }
    }

    private static boolean lllllIlIIIl(int i) {
        return i != 0;
    }

    private static boolean lllllIllIIl(Object obj) {
        return obj == null;
    }

    private static boolean lllllIlIllI(int i) {
        return i > 0;
    }

    private static void dv() {
        if (lllllIllIIl(e(li))) {
            int[] iArr = new int[lIIlIlIll[1]];
            iArr[lIIlIlIll[0]] = lIIlIlIll[9];
            if (lllllIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[204]]) ? 1 : 0) && lllllIllIII(tileObject.getWorldLocation().distanceTo(kN), lIIlIlIll[12])) {
                        ?? r0 = lIIlIlIll[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIlIll[0];
                });
                if (lllllIlIlIl(nearest)) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[87]];
                    int[] iArr2 = new int[lIIlIlIll[1]];
                    iArr2[lIIlIlIll[0]] = lIIlIlIll[9];
                    Inventory.getFirst(iArr2).useOn(nearest);
                    Time.sleepTicks(lIIlIlIll[6]);
                    "".length();
                }
            }
            int[] iArr3 = new int[lIIlIlIll[1]];
            iArr3[lIIlIlIll[0]] = lIIlIlIll[9];
            if (lllllIlIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kO), lIIlIlIll[7])) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[88]];
                    C0004e.c(kO);
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                }
                if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kO), lIIlIlIll[7])) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[89]];
                    if (lllllIlIlII(Movement.getRunEnergy(), lIIlIlIll[69]) && lllllIlIIIl(Inventory.contains(item -> {
                        return item.getName().contains(lIIlIlIII[lIIlIlIll[203]]);
                    }) ? 1 : 0)) {
                        Inventory.getFirst(item2 -> {
                            return item2.getName().contains(lIIlIlIII[lIIlIlIll[202]]);
                        }).useOn(TileObjects.getNearest(tileObject2 -> {
                            if (lllllIlIIIl(tileObject2.getName().contains(lIIlIlIII[lIIlIlIll[201]]) ? 1 : 0) && lllllIllIII(tileObject2.getWorldLocation().distanceTo(li), lIIlIlIll[4])) {
                                ?? r0 = lIIlIlIll[1];
                                "".length();
                                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlIlIll[0];
                        }));
                        Time.sleepTicks(lIIlIlIll[1]);
                        "".length();
                        return;
                    }
                }
            }
        }
        if (lllllIllIIl(e(kP)) && lllllIlIlIl(e(li))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kP), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[90]];
                C0004e.c(kP);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kP), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[91]];
                if (lllllIlIIIl(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIIlIlIII[lIIlIlIll[200]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item4 -> {
                        return item4.getName().contains(lIIlIlIII[lIIlIlIll[199]]);
                    }).useOn(TileObjects.getNearest(tileObject3 -> {
                        if (lllllIlIIIl(tileObject3.getName().contains(lIIlIlIII[lIIlIlIll[198]]) ? 1 : 0) && lllllIllIII(tileObject3.getWorldLocation().distanceTo(lj), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return (-" ".length()) >= "   ".length() ? ((221 ^ 152) ^ "   ".length()) & (((((170 + 149) - 221) + 128) ^ (((50 + 40) - 83) + 157)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(kQ)) && lllllIlIlIl(e(kP))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kQ), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[92]];
                C0004e.c(kQ);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kQ), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[93]];
                if (lllllIlIIIl(Inventory.contains(item5 -> {
                    return item5.getName().contains(lIIlIlIII[lIIlIlIll[197]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(lIIlIlIII[lIIlIlIll[196]]);
                    }).useOn(TileObjects.getNearest(tileObject4 -> {
                        if (lllllIlIIIl(tileObject4.getName().contains(lIIlIlIII[lIIlIlIll[195]]) ? 1 : 0) && lllllIllIII(tileObject4.getWorldLocation().distanceTo(lk), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return ((((33 + 46) - (-90)) + 18) ^ (((59 + 93) - (-29)) + 10)) < (((6 ^ 58) ^ (241 ^ 172)) & (((((127 + 197) - 213) + 125) ^ (((22 + 57) - 73) + 135)) ^ (-" ".length()))) ? ((((60 + 8) - (-21)) + 69) ^ (((11 + 77) - (-32)) + 30)) & (((98 ^ 67) ^ (101 ^ 76)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(kR)) && lllllIlIlIl(e(kQ))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kR), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[94]];
                C0004e.c(kR);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kR), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[95]];
                if (lllllIlIIIl(Inventory.contains(item7 -> {
                    return item7.getName().contains(lIIlIlIII[lIIlIlIll[194]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item8 -> {
                        return item8.getName().contains(lIIlIlIII[lIIlIlIll[193]]);
                    }).useOn(TileObjects.getNearest(tileObject5 -> {
                        if (lllllIlIIIl(tileObject5.getName().contains(lIIlIlIII[lIIlIlIll[192]]) ? 1 : 0) && lllllIllIII(tileObject5.getWorldLocation().distanceTo(ll), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return ((57 ^ 42) & ((129 ^ 146) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(kS)) && lllllIlIlIl(e(kR))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kS), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[96]];
                C0004e.c(kS);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kS), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[97]];
                if (lllllIlIIIl(Inventory.contains(item9 -> {
                    return item9.getName().contains(lIIlIlIII[lIIlIlIll[191]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item10 -> {
                        return item10.getName().contains(lIIlIlIII[lIIlIlIll[190]]);
                    }).useOn(TileObjects.getNearest(tileObject6 -> {
                        if (lllllIlIIIl(tileObject6.getName().contains(lIIlIlIII[lIIlIlIll[189]]) ? 1 : 0) && lllllIllIII(tileObject6.getWorldLocation().distanceTo(lm), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return (-" ".length()) > (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(kT)) && lllllIlIlIl(e(kS))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kT), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[98]];
                C0004e.c(kT);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kT), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[99]];
                if (lllllIlIIIl(Inventory.contains(item11 -> {
                    return item11.getName().contains(lIIlIlIII[lIIlIlIll[188]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item12 -> {
                        return item12.getName().contains(lIIlIlIII[lIIlIlIll[187]]);
                    }).useOn(TileObjects.getNearest(tileObject7 -> {
                        if (lllllIlIIIl(tileObject7.getName().contains(lIIlIlIII[lIIlIlIll[186]]) ? 1 : 0) && lllllIllIII(tileObject7.getWorldLocation().distanceTo(ln), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(kU)) && lllllIlIlIl(e(kT))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kU), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[100]];
                C0004e.c(kU);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kU), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[49]];
                if (lllllIlIIIl(Inventory.contains(item13 -> {
                    return item13.getName().contains(lIIlIlIII[lIIlIlIll[185]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item14 -> {
                        return item14.getName().contains(lIIlIlIII[lIIlIlIll[184]]);
                    }).useOn(TileObjects.getNearest(tileObject8 -> {
                        if (lllllIlIIIl(tileObject8.getName().contains(lIIlIlIII[lIIlIlIll[183]]) ? 1 : 0) && lllllIllIII(tileObject8.getWorldLocation().distanceTo(lo), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return "   ".length() < ((147 ^ 196) & ((249 ^ 174) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(kV)) && lllllIlIlIl(e(kU))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kV), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[101]];
                C0004e.c(kV);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kV), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[102]];
                if (lllllIlIIIl(Inventory.contains(item15 -> {
                    return item15.getName().contains(lIIlIlIII[lIIlIlIll[182]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item16 -> {
                        return item16.getName().contains(lIIlIlIII[lIIlIlIll[181]]);
                    }).useOn(TileObjects.getNearest(tileObject9 -> {
                        if (lllllIlIIIl(tileObject9.getName().contains(lIIlIlIII[lIIlIlIll[180]]) ? 1 : 0) && lllllIllIII(tileObject9.getWorldLocation().distanceTo(lp), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return 0 != 0 ? ((((192 + 105) - 97) + 41) ^ (((6 + 103) - 100) + 186)) & (((43 ^ 102) ^ (((120 + 11) - 96) + 92)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(kW)) && lllllIlIlIl(e(kV))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kW), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[103]];
                C0004e.c(kW);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kW), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[104]];
                if (lllllIlIIIl(Inventory.contains(item17 -> {
                    return item17.getName().contains(lIIlIlIII[lIIlIlIll[179]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item18 -> {
                        return item18.getName().contains(lIIlIlIII[lIIlIlIll[178]]);
                    }).useOn(TileObjects.getNearest(tileObject10 -> {
                        if (lllllIlIIIl(tileObject10.getName().contains(lIIlIlIII[lIIlIlIll[177]]) ? 1 : 0) && lllllIllIII(tileObject10.getWorldLocation().distanceTo(lq), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return (124 ^ 120) <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(kX)) && lllllIlIlIl(e(kW))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kX), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[105]];
                C0004e.c(kX);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kX), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[106]];
                if (lllllIlIIIl(Inventory.contains(item19 -> {
                    return item19.getName().contains(lIIlIlIII[lIIlIlIll[176]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item20 -> {
                        return item20.getName().contains(lIIlIlIII[lIIlIlIll[175]]);
                    }).useOn(TileObjects.getNearest(tileObject11 -> {
                        if (lllllIlIIIl(tileObject11.getName().contains(lIIlIlIII[lIIlIlIll[174]]) ? 1 : 0) && lllllIllIII(tileObject11.getWorldLocation().distanceTo(lr), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(kY)) && lllllIlIlIl(e(kX))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kY), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[107]];
                C0004e.c(kY);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kY), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[108]];
                if (lllllIlIIIl(Inventory.contains(item21 -> {
                    return item21.getName().contains(lIIlIlIII[lIIlIlIll[173]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item22 -> {
                        return item22.getName().contains(lIIlIlIII[lIIlIlIll[172]]);
                    }).useOn(TileObjects.getNearest(tileObject12 -> {
                        if (lllllIlIIIl(tileObject12.getName().contains(lIIlIlIII[lIIlIlIll[171]]) ? 1 : 0) && lllllIllIII(tileObject12.getWorldLocation().distanceTo(ls), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return (-((((16 + 39) - (-88)) + 56) ^ (((44 + 90) - 113) + 174))) > 0 ? ((120 ^ 52) ^ (44 ^ 64)) & (((208 ^ 197) ^ (36 ^ 17)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(kZ)) && lllllIlIlIl(e(kY))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[109]];
                C0004e.c(kZ);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kZ), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[110]];
                if (lllllIlIIIl(Inventory.contains(item23 -> {
                    return item23.getName().contains(lIIlIlIII[lIIlIlIll[170]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item24 -> {
                        return item24.getName().contains(lIIlIlIII[lIIlIlIll[169]]);
                    }).useOn(TileObjects.getNearest(tileObject13 -> {
                        if (lllllIlIIIl(tileObject13.getName().contains(lIIlIlIII[lIIlIlIll[168]]) ? 1 : 0) && lllllIllIII(tileObject13.getWorldLocation().distanceTo(lt), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(la)) && lllllIlIlIl(e(kZ))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(la), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[69]];
                C0004e.c(la);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(la), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[111]];
                if (lllllIlIIIl(Inventory.contains(item25 -> {
                    return item25.getName().contains(lIIlIlIII[lIIlIlIll[167]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item26 -> {
                        return item26.getName().contains(lIIlIlIII[lIIlIlIll[166]]);
                    }).useOn(TileObjects.getNearest(tileObject14 -> {
                        if (lllllIlIIIl(tileObject14.getName().contains(lIIlIlIII[lIIlIlIll[165]]) ? 1 : 0) && lllllIllIII(tileObject14.getWorldLocation().distanceTo(lu), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return (66 ^ 70) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(lb)) && lllllIlIlIl(e(la))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lb), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[112]];
                C0004e.c(lb);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lb), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[32]];
                if (lllllIlIIIl(Inventory.contains(item27 -> {
                    return item27.getName().contains(lIIlIlIII[lIIlIlIll[164]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item28 -> {
                        return item28.getName().contains(lIIlIlIII[lIIlIlIll[163]]);
                    }).useOn(TileObjects.getNearest(tileObject15 -> {
                        if (lllllIlIIIl(tileObject15.getName().contains(lIIlIlIII[lIIlIlIll[162]]) ? 1 : 0) && lllllIllIII(tileObject15.getWorldLocation().distanceTo(lv), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return "   ".length() == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(lc)) && lllllIlIlIl(e(lb))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lc), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[113]];
                C0004e.c(lc);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lc), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[114]];
                if (lllllIlIIIl(Inventory.contains(item29 -> {
                    return item29.getName().contains(lIIlIlIII[lIIlIlIll[161]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item30 -> {
                        return item30.getName().contains(lIIlIlIII[lIIlIlIll[160]]);
                    }).useOn(TileObjects.getNearest(tileObject16 -> {
                        if (lllllIlIIIl(tileObject16.getName().contains(lIIlIlIII[lIIlIlIll[159]]) ? 1 : 0) && lllllIllIII(tileObject16.getWorldLocation().distanceTo(lw), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return ((71 ^ 38) & ((53 ^ 84) ^ (-1))) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(ld)) && lllllIlIlIl(e(lc))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(ld), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[115]];
                C0004e.c(ld);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(ld), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[116]];
                if (lllllIlIIIl(Inventory.contains(item31 -> {
                    return item31.getName().contains(lIIlIlIII[lIIlIlIll[158]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item32 -> {
                        return item32.getName().contains(lIIlIlIII[lIIlIlIll[157]]);
                    }).useOn(TileObjects.getNearest(tileObject17 -> {
                        if (lllllIlIIIl(tileObject17.getName().contains(lIIlIlIII[lIIlIlIll[156]]) ? 1 : 0) && lllllIllIII(tileObject17.getWorldLocation().distanceTo(lx), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return (((92 ^ 120) ^ (20 ^ 127)) & (((148 ^ 194) ^ (162 ^ 187)) ^ (-" ".length()))) != 0 ? ((2 ^ 55) ^ (19 ^ 71)) & (((202 ^ 155) ^ (92 ^ 108)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(le)) && lllllIlIlIl(e(ld))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(le), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[117]];
                C0004e.c(le);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(le), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[118]];
                if (lllllIlIIIl(Inventory.contains(item33 -> {
                    return item33.getName().contains(lIIlIlIII[lIIlIlIll[155]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item34 -> {
                        return item34.getName().contains(lIIlIlIII[lIIlIlIll[154]]);
                    }).useOn(TileObjects.getNearest(tileObject18 -> {
                        if (lllllIlIIIl(tileObject18.getName().contains(lIIlIlIII[lIIlIlIll[153]]) ? 1 : 0) && lllllIllIII(tileObject18.getWorldLocation().distanceTo(ly), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return (-"   ".length()) > 0 ? (true ^ true) & (true ^ true) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(lf)) && lllllIlIlIl(e(le))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lf), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[119]];
                C0004e.c(lf);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lf), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[120]];
                if (lllllIlIIIl(Inventory.contains(item35 -> {
                    return item35.getName().contains(lIIlIlIII[lIIlIlIll[152]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item36 -> {
                        return item36.getName().contains(lIIlIlIII[lIIlIlIll[151]]);
                    }).useOn(TileObjects.getNearest(tileObject19 -> {
                        if (lllllIlIIIl(tileObject19.getName().contains(lIIlIlIII[lIIlIlIll[150]]) ? 1 : 0) && lllllIllIII(tileObject19.getWorldLocation().distanceTo(lz), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return (((85 ^ 38) ^ (240 ^ 132)) & (((((46 + 93) - 49) + 81) ^ (((165 + 155) - 273) + 125)) ^ (-" ".length()))) > ((89 ^ 85) ^ (10 ^ 2)) ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(lg)) && lllllIlIlIl(e(lf))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lg), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[121]];
                C0004e.c(lg);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lg), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[122]];
                if (lllllIlIIIl(Inventory.contains(item37 -> {
                    return item37.getName().contains(lIIlIlIII[lIIlIlIll[149]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item38 -> {
                        return item38.getName().contains(lIIlIlIII[lIIlIlIll[148]]);
                    }).useOn(TileObjects.getNearest(tileObject20 -> {
                        if (lllllIlIIIl(tileObject20.getName().contains(lIIlIlIII[lIIlIlIll[147]]) ? 1 : 0) && lllllIllIII(tileObject20.getWorldLocation().distanceTo(lA), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lllllIllIIl(e(lh)) && lllllIlIlIl(e(lg))) {
            if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(lh), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[123]];
                C0004e.c(lh);
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(lh), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[124]];
                if (lllllIlIIIl(Inventory.contains(item39 -> {
                    return item39.getName().contains(lIIlIlIII[lIIlIlIll[146]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item40 -> {
                        return item40.getName().contains(lIIlIlIII[lIIlIlIll[145]]);
                    }).useOn(TileObjects.getNearest(tileObject21 -> {
                        if (lllllIlIIIl(tileObject21.getName().contains(lIIlIlIII[lIIlIlIll[144]]) ? 1 : 0) && lllllIllIII(tileObject21.getWorldLocation().distanceTo(lB), lIIlIlIll[4])) {
                            ?? r0 = lIIlIlIll[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIlIll[0];
                    }));
                    Time.sleepTicks(lIIlIlIll[12]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIlIlIll[0];
    }

    private static String llllIllIlIl(String lIIIIlIIIIIlIIl, String lIIIIlIIIIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlIIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIlIIIIIlIll = Cipher.getInstance("Blowfish");
            lIIIIlIIIIIlIll.init(lIIlIlIll[4], secretKeySpec);
            return new String(lIIIIlIIIIIlIll.doFinal(Base64.getDecoder().decode(lIIIIlIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIlIIIIIIlIl) {
            lIIIIlIIIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void dA() {
        C0004e.l(lIIlIlIll[25]);
        C0004e.l(lIIlIlIll[26]);
        C0004e.l(lIIlIlIll[27]);
        C0004e.l(lIIlIlIll[28]);
        C0004e.l(lIIlIlIll[29]);
        C0004e.l(lIIlIlIll[30]);
        C0004e.l(lIIlIlIll[32]);
        C0004e.l(lIIlIlIll[132]);
    }

    private static void du() {
        if (lllllIlIIIl(kL.isEmpty() ? 1 : 0)) {
            kL.add(kO);
            "".length();
            kL.add(kP);
            "".length();
            kL.add(kQ);
            "".length();
            kL.add(kR);
            "".length();
            kL.add(kS);
            "".length();
            kL.add(kT);
            "".length();
            kL.add(kU);
            "".length();
            kL.add(kV);
            "".length();
            kL.add(kW);
            "".length();
            kL.add(kX);
            "".length();
            kL.add(kY);
            "".length();
            kL.add(kZ);
            "".length();
            kL.add(la);
            "".length();
            kL.add(lb);
            "".length();
            kL.add(lc);
            "".length();
            kL.add(ld);
            "".length();
            kL.add(le);
            "".length();
            kL.add(lf);
            "".length();
            kL.add(lg);
            "".length();
            kL.add(lh);
            "".length();
        }
        if (lllllIlIIIl(kM.isEmpty() ? 1 : 0)) {
            kM.add(li);
            "".length();
            kM.add(lj);
            "".length();
            kM.add(lk);
            "".length();
            kM.add(ll);
            "".length();
            kM.add(lm);
            "".length();
            kM.add(ln);
            "".length();
            kM.add(lo);
            "".length();
            kM.add(lp);
            "".length();
            kM.add(lq);
            "".length();
            kM.add(lr);
            "".length();
            kM.add(ls);
            "".length();
            kM.add(lt);
            "".length();
            kM.add(lu);
            "".length();
            kM.add(lv);
            "".length();
            kM.add(lw);
            "".length();
            kM.add(lx);
            "".length();
            kM.add(ly);
            "".length();
            kM.add(lz);
            "".length();
            kM.add(lA);
            "".length();
            kM.add(lB);
            "".length();
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            ds();
            "".length();
            if ((-" ".length()) == " ".length()) {
                return ((((15 + 68) - 12) + 134) ^ (((22 + 34) - 42) + 134)) & (((144 ^ 163) ^ (102 ^ 12)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIlIll[124];
    }

    private static void lllllIIIlIl() {
        lIIlIlIII = new String[lIIlIlIll[250]];
        lIIlIlIII[lIIlIlIll[0]] = llllIllIIll("ZR9DOM6KUlJyUu260YrH4A==", "puNfg");
        lIIlIlIII[lIIlIlIll[1]] = llllIllIlII("IAQdODEOCBdxIBMUGj8lRgQHNC8VQVMiNQ8ZEDkrCApTMyMFBlMlLUYLEiMvDwMU", "fmsQB");
        lIIlIlIII[lIIlIlIll[4]] = llllIllIIll("/Sv0PtiH/Ir2GMj679/3Jg==", "MQABh");
        lIIlIlIII[lIIlIlIll[5]] = llllIllIIll("rfU1nMezQYg=", "gxRbl");
        lIIlIlIII[lIIlIlIll[6]] = llllIllIlII("KSceCy4GMgEMLkcyB0IrBigD", "gFhbI");
        lIIlIlIII[lIIlIlIll[7]] = llllIllIlIl("s4Sz9ueNABljS5j1I3a2O70GhrGU6AVz", "SyZGT");
        lIIlIlIII[lIIlIlIll[11]] = llllIllIlIl("KVUz1UNho85loCMoY70tfvv+iDqZVN2rnwHcGlN25z4DPwejbBiTf/rhXXX8ljM0uLoqLVQ6z0I=", "TJgqz");
        lIIlIlIII[lIIlIlIll[20]] = llllIllIIll("sZHqs3SBKrmKs7wLifmUqxMrKdxqnd7jU+RfCdbMtd7vrT0MY+xibMP+QF7ITVCMqi3LYBhvImo=", "jPFOj");
        lIIlIlIII[lIIlIlIll[22]] = llllIllIlII("EiMHNg==", "DJfZX");
        lIIlIlIII[lIIlIlIll[23]] = llllIllIlII("Hw43PA==", "IgVPr");
        lIIlIlIII[lIIlIlIll[12]] = llllIllIlIl("tRKhgmjIZp4=", "nEXgd");
        lIIlIlIII[lIIlIlIll[38]] = llllIllIlIl("8d2cIoh/8/o=", "PEWbq");
        lIIlIlIII[lIIlIlIll[35]] = llllIllIIll("43livD2WugzALHcpa0Xng0taZFk4Ti4g", "iNKtg");
        lIIlIlIII[lIIlIlIll[42]] = llllIllIlIl("sw6Z9kY8StxQ4CROqgVezCO0ErEZp47ZZkPV4Y8t/sk=", "muWWt");
        lIIlIlIII[lIIlIlIll[43]] = llllIllIlII("HDQGKhsmJlQtHGgnBjEbPDI=", "HAtDr");
        lIIlIlIII[lIIlIlIll[34]] = llllIllIIll("4VjSfTrOAV0=", "xZLwp");
        lIIlIlIII[lIIlIlIll[44]] = llllIllIlII("Ezw/Az84I3YDPyIsMw==", "VDVwV");
        lIIlIlIII[lIIlIlIll[10]] = llllIllIlII("PBYkKE0eGDk3", "zwVEm");
        lIIlIlIII[lIIlIlIll[45]] = llllIllIlIl("oXXDfREfvpg=", "sWeqN");
        lIIlIlIII[lIIlIlIll[46]] = llllIllIlIl("pJ6d/hSQbj1D8LFEC1Y0Vg==", "pQfck");
        lIIlIlIII[lIIlIlIll[47]] = llllIllIlIl("De5SMmIc9ozuUvsYk8xqrA==", "YYVFY");
        lIIlIlIII[lIIlIlIll[48]] = llllIllIlII("KiMkPRMR", "yFEOp");
        lIIlIlIII[lIIlIlIll[50]] = llllIllIlII("NScgIg4YJihjCxwtI2NQFS0xJhRZf3Nq", "yHGCx");
        lIIlIlIII[lIIlIlIll[52]] = llllIllIlII("DAkrJDAvCChrJCsDI2t/IgMxLjtuU3Ni", "NfGKW");
        lIIlIlIII[lIIlIlIll[53]] = llllIllIlIl("HrF89P0huzPlDMmUEzWeCet/MQZFiar6/FYtR3uu2Ew=", "oSzPz");
        lIIlIlIII[lIIlIlIll[39]] = llllIllIlIl("18RI4AX9R/n39T11+3pJ1m/bgzJc7Ggc", "QrJOl");
        lIIlIlIII[lIIlIlIll[55]] = llllIllIlII("Hi8DJnU8IR45", "XNqKU");
        lIIlIlIII[lIIlIlIll[56]] = llllIllIlII("Gwk1AQ==", "TyPoU");
        lIIlIlIII[lIIlIlIll[57]] = llllIllIIll("j0NOrjkDPpYrlwmHEM0z6r1E4Z0zIm8AtUP++MXUIYoaNbk2ao7Z83HCqvCrWcrr", "YsdLV");
        lIIlIlIII[lIIlIlIll[58]] = llllIllIIll("e3sC7qXQ++evHfetC0IRKQ==", "qvEaV");
        lIIlIlIII[lIIlIlIll[59]] = llllIllIIll("OQ4OeUesFu3JHjFfFqe6DA==", "hGKJp");
        lIIlIlIII[lIIlIlIll[60]] = llllIllIlIl("jC0kI7/WWfzNQN8Z10492Q==", "YrheK");
        lIIlIlIII[lIIlIlIll[61]] = llllIllIlII("HBU+Si0pCHEMOScXcQslKxI+GGdoCDQZLjwOOAQsaBM/GT8pFDIP", "HzQjK");
        lIIlIlIII[lIIlIlIll[62]] = llllIllIlIl("EwpxMBnS6DPuVAZ9SAzPDi7KWy/z3i76bqxkYI8cG5c=", "VYrkb");
        lIIlIlIII[lIIlIlIll[3]] = llllIllIlIl("G1MEYYUHpe7GaGyM1zbuJ+oEikH65Mtj", "pEmDd");
        lIIlIlIII[lIIlIlIll[63]] = llllIllIlII("KD0SFgcFLA==", "lXbyt");
        lIIlIlIII[lIIlIlIll[64]] = llllIllIlII("LgwnHTsFE24dOx8cKw==", "ktNiR");
        lIIlIlIII[lIIlIlIll[65]] = llllIllIlIl("3fzt6qvbJ/gbnqEkJa1zUQ==", "oRmUD");
        lIIlIlIII[lIIlIlIll[66]] = llllIllIlII("ACMtLw==", "OSHAI");
        lIIlIlIII[lIIlIlIll[67]] = llllIllIlIl("oQ9czLHtqBxtYSmzH9R+/5NJkI8Loyp+", "idDad");
        lIIlIlIII[lIIlIlIll[68]] = llllIllIIll("sHSLXSXkGoDZsgsK18qLecQFsRWJesrX", "rxjzk");
        lIIlIlIII[lIIlIlIll[70]] = llllIllIlIl("docuINIypoYwEw/uXzzcJg==", "AHIvw");
        lIIlIlIII[lIIlIlIll[71]] = llllIllIlII("IyAiAgEaIiRMExI+LkxE", "sLClu");
        lIIlIlIII[lIIlIlIll[72]] = llllIllIlII("DQITHCQ=", "ZcgyV");
        lIIlIlIII[lIIlIlIll[73]] = llllIllIlIl("oQNc1/Wdcg3p1Ha9D2aknw==", "QgGuY");
        lIIlIlIII[lIIlIlIll[2]] = llllIllIlIl("abR2lEG8MiHOrSQUv3PJsg==", "HBwCG");
        lIIlIlIII[lIIlIlIll[74]] = llllIllIIll("U/nIWg868go=", "VLSxL");
        lIIlIlIII[lIIlIlIll[75]] = llllIllIIll("2roJzbl1s6QU02qqKwuoLQ==", "RInQO");
        lIIlIlIII[lIIlIlIll[76]] = llllIllIlII("OQALLiICFQ==", "qayXG");
        lIIlIlIII[lIIlIlIll[77]] = llllIllIlII("FyIzBHQ1LC4b", "QCAiT");
        lIIlIlIII[lIIlIlIll[37]] = llllIllIlIl("x0IsuXD2vjRtmdjhnka1xw==", "nXRSM");
        lIIlIlIII[lIIlIlIll[78]] = llllIllIlIl("xZDT0+bS+KU=", "nFFYN");
        lIIlIlIII[lIIlIlIll[79]] = llllIllIlII("Azs8IT49NC8=", "TZHDL");
        lIIlIlIII[lIIlIlIll[80]] = llllIllIlII("GyYEIRIgMw==", "SGvWw");
        lIIlIlIII[lIIlIlIll[51]] = llllIllIIll("6b15yCxDDyx5KrLELCShLA==", "QTXBo");
        lIIlIlIII[lIIlIlIll[81]] = llllIllIIll("cMYmvoKUJGs=", "PdNeW");
        lIIlIlIII[lIIlIlIll[82]] = llllIllIIll("CDPMJLbdI/sJ8EyE3Y7PuH3QoRRDR6anysGEH8fI9ilyldHH+z28/w==", "DStGJ");
        lIIlIlIII[lIIlIlIll[83]] = llllIllIlIl("3X18jTFiaLZ3xZcBm1giNJfTU4veTirN", "AXATB");
        lIIlIlIII[lIIlIlIll[85]] = llllIllIlII("DhkkHws0C3YYDHoKJAQLLh8=", "ZlVqb");
        lIIlIlIII[lIIlIlIll[86]] = llllIllIlII("HSsBNhcwOg==", "YNqYd");
        lIIlIlIII[lIIlIlIll[87]] = llllIllIlIl("NDAecXEnIaq9yJsEIB4UhGwQ6Ut+Ydh+", "OTrVO");
        lIIlIlIII[lIIlIlIll[88]] = llllIllIlIl("OmHUekxSbKoJ5cr/bL0KAw==", "YccHq");
        lIIlIlIII[lIIlIlIll[89]] = llllIllIlII("JQslOxocCSN1CBQVKXVf", "ugDUn");
        lIIlIlIII[lIIlIlIll[90]] = llllIllIIll("Rz1r3NjNT5POeeP5x0h+uQ==", "AZaLR");
        lIIlIlIII[lIIlIlIll[91]] = llllIllIIll("2INsYoCM1zLeE6JrEP+FmQ==", "pMfMD");
        lIIlIlIII[lIIlIlIll[92]] = llllIllIIll("JIQDQLyP0yyC5VmpnGX20A==", "YZLhm");
        lIIlIlIII[lIIlIlIll[93]] = llllIllIIll("nT2p+TIMNxPo3xaeMJd/gA==", "Mubpd");
        lIIlIlIII[lIIlIlIll[94]] = llllIllIlII("AxYfE0ggGFMeCSYaU0w=", "Twsxh");
        lIIlIlIII[lIIlIlIll[95]] = llllIllIlIl("guehF2/NopnckHYUZNWNQw==", "zPbVT");
        lIIlIlIII[lIIlIlIll[96]] = llllIllIlII("DxQkIU8sGmgsDioYaH8=", "XuHJo");
        lIIlIlIII[lIIlIlIll[97]] = llllIllIlII("BR4PAx48HAlNDDQAA01f", "Urnmj");
        lIIlIlIII[lIIlIlIll[98]] = llllIllIlIl("I4E9wLDW4iwqhGbUuWVETg==", "CPAJX");
        lIIlIlIII[lIIlIlIll[99]] = llllIllIlIl("1sOPU3jPlZR2Cjc7YSPIJg==", "WWjEv");
        lIIlIlIII[lIIlIlIll[100]] = llllIllIIll("4ZviLb2Nkedf97t58BlZZQ==", "FquPJ");
        lIIlIlIII[lIIlIlIll[49]] = llllIllIIll("1W6/Yd7NyznQFomeEJrFmA==", "dEiGT");
        lIIlIlIII[lIIlIlIll[101]] = llllIllIIll("1dL93pvrBGkosOUK6xFbSw==", "leAWI");
        lIIlIlIII[lIIlIlIll[102]] = llllIllIIll("9CiFSJtygkHZutqchHADLA==", "NqaSt");
        lIIlIlIII[lIIlIlIll[103]] = llllIllIlIl("U0uStX94TihhbBwxjZcrYA==", "HMPjg");
        lIIlIlIII[lIIlIlIll[104]] = llllIllIlII("GAgCHhchCgRQBSkWDlBa", "Hdcpc");
        lIIlIlIII[lIIlIlIll[105]] = llllIllIIll("CCShwLYYDOxoPSDoVfdCjQ==", "WACms");
        lIIlIlIII[lIIlIlIll[106]] = llllIllIlIl("zvDvYDGEMZSa/M0o4yC0R/WLUZCiYGxc", "liIIE");
        lIIlIlIII[lIIlIlIll[107]] = llllIllIlIl("ajaveTsI+TGq9IDTUqHClw==", "McVQf");
        lIIlIlIII[lIIlIlIll[108]] = llllIllIlIl("8YjRJjYE4G6Mck4hqJ4ij7T24NW51L7f", "yTIIJ");
        lIIlIlIII[lIIlIlIll[109]] = llllIllIIll("PW3IgFlcB9v1SSOiglLuSA==", "IUWru");
        lIIlIlIII[lIIlIlIll[110]] = llllIllIlIl("dkdwSX7KkDDEm/Z+hjn6tZmtNmXvmov2", "UaPYP");
        lIIlIlIII[lIIlIlIll[69]] = llllIllIIll("6VNDoIwvYGWbtet4iUwEzA==", "sMLWy");
        lIIlIlIII[lIIlIlIll[111]] = llllIllIlIl("t8CyYPvNbCQbVCdqfgu+i2LUJmvamu4K", "VROYH");
        lIIlIlIII[lIIlIlIll[112]] = llllIllIlII("FQkdJm02B1ErLDAFUXx5", "BhqMM");
        lIIlIlIII[lIIlIlIll[32]] = llllIllIlIl("gekiXcNEitousMwvI+XxMn2Qf4M3FMJq", "hbKAL");
        lIIlIlIII[lIIlIlIll[113]] = llllIllIIll("ncakl+V1xcfZI5DnidcBDg==", "nmfPP");
        lIIlIlIII[lIIlIlIll[114]] = llllIllIIll("mfStys3u9v8vMIWJVai/sZaj4QsT1rxr", "TxtcR");
        lIIlIlIII[lIIlIlIll[115]] = llllIllIIll("quaxxreu6ZDaTsPKi7fFkg==", "sQyid");
        lIIlIlIII[lIIlIlIll[116]] = llllIllIlII("CC0DKjkxLwVkKzkzD2R8bg==", "XAbDM");
        lIIlIlIII[lIIlIlIll[117]] = llllIllIlII("AzIrPXggPGcwOSY+Z2dv", "TSGVX");
        lIIlIlIII[lIIlIlIll[118]] = llllIllIlIl("oJGPbUIZWtReE1bztgP6BvlOytFz1X0P", "NeGNb");
        lIIlIlIII[lIIlIlIll[119]] = llllIllIlIl("Ae22hJwKe6JzEzwuf4iygA==", "rqOnr");
        lIIlIlIII[lIIlIlIll[120]] = llllIllIlII("MSEnBzkIIyFJKwA/K0l8WQ==", "aMFiM");
        lIIlIlIII[lIIlIlIll[121]] = llllIllIIll("axK0P3a6PGdCAr88PnjBSw==", "IxaSl");
        lIIlIlIII[lIIlIlIll[122]] = llllIllIlII("MgkNJDELCwtqIwMXAWp0Ww==", "belJE");
        lIIlIlIII[lIIlIlIll[123]] = llllIllIlII("FScjBGY2KW8JJzArb112", "BFOoF");
        lIIlIlIII[lIIlIlIll[124]] = llllIllIlII("KhY3NyMTFDF5MRsIO3llSg==", "zzVYW");
        lIIlIlIII[lIIlIlIll[125]] = llllIllIlIl("3E0D4XVUCfQi+wgLAtv2rA==", "sNkRY");
        lIIlIlIII[lIIlIlIll[133]] = llllIllIlII("Nxo2MAI=", "djWTg");
        lIIlIlIII[lIIlIlIll[142]] = llllIllIIll("DGPrU4bLMQZjUccWZ6cauw==", "rTNXh");
        lIIlIlIII[lIIlIlIll[143]] = llllIllIlIl("i1KhgKjajEs=", "NyCzB");
        lIIlIlIII[lIIlIlIll[144]] = llllIllIIll("vQcjYIwD261b7Q5qoEUA8Q==", "Hdocq");
        lIIlIlIII[lIIlIlIll[145]] = llllIllIlII("Ayg3Kw==", "pMROm");
        lIIlIlIII[lIIlIlIll[146]] = llllIllIIll("L39F9cL8e8Q=", "ieVfO");
        lIIlIlIII[lIIlIlIll[147]] = llllIllIIll("tULnMDIrThVM3pMnPGg5Dg==", "vwMjR");
        lIIlIlIII[lIIlIlIll[148]] = llllIllIlIl("VSyMY6Pzaws=", "BlWbQ");
        lIIlIlIII[lIIlIlIll[149]] = llllIllIIll("jO0dZ9KiOA0=", "HZJoY");
        lIIlIlIII[lIIlIlIll[150]] = llllIllIIll("gGSLeZKhWS/2rjY9G95C3Q==", "MXwga");
        lIIlIlIII[lIIlIlIll[151]] = llllIllIlII("FiotAw==", "eOHgQ");
        lIIlIlIII[lIIlIlIll[152]] = llllIllIlII("KiYcNQ==", "YCyQg");
        lIIlIlIII[lIIlIlIll[153]] = llllIllIIll("WHZx645YRKP9bv1gNNuDDQ==", "SLWbY");
        lIIlIlIII[lIIlIlIll[154]] = llllIllIlII("Og0dLA==", "IhxHE");
        lIIlIlIII[lIIlIlIll[155]] = llllIllIlIl("bbrDXyS9nZA=", "QTlrv");
        lIIlIlIII[lIIlIlIll[156]] = llllIllIlII("GgIYBgtuGw0aDSY=", "Nklnn");
        lIIlIlIII[lIIlIlIll[157]] = llllIllIIll("G/UVc1mTziY=", "mXtbv");
        lIIlIlIII[lIIlIlIll[158]] = llllIllIIll("1EBWTx+g0fM=", "RXKPT");
        lIIlIlIII[lIIlIlIll[159]] = llllIllIIll("q/Z6bEzPCYZMNJp95tqhmQ==", "GVtWY");
        lIIlIlIII[lIIlIlIll[160]] = llllIllIIll("ueFuYTw8Dug=", "ueNSc");
        lIIlIlIII[lIIlIlIll[161]] = llllIllIIll("JTp8t6PZ/Dc=", "btavZ");
        lIIlIlIII[lIIlIlIll[162]] = llllIllIlII("Pgw3HhBKFSICFgI=", "jeCvu");
        lIIlIlIII[lIIlIlIll[163]] = llllIllIIll("CogvsRZ59zc=", "xEDif");
        lIIlIlIII[lIIlIlIll[164]] = llllIllIlIl("RdASmJww4WE=", "lbHNm");
        lIIlIlIII[lIIlIlIll[165]] = llllIllIlIl("SsXjJzuaHPy0Omcn7Zb+cg==", "USzrM");
        lIIlIlIII[lIIlIlIll[166]] = llllIllIlIl("sNcQh/7YhTQ=", "eCKMf");
        lIIlIlIII[lIIlIlIll[167]] = llllIllIlIl("A/LaCdUIVeY=", "SSlto");
        lIIlIlIII[lIIlIlIll[168]] = llllIllIIll("hdW3MWX5HyD8qF2cORiC6g==", "JTzyu");
        lIIlIlIII[lIIlIlIll[169]] = llllIllIIll("IG4SXW9N6ZY=", "hLErc");
        lIIlIlIII[lIIlIlIll[170]] = llllIllIlII("KxcCEg==", "Xrgve");
        lIIlIlIII[lIIlIlIll[171]] = llllIllIlII("AioDHA52MxYACD4=", "VCwtk");
        lIIlIlIII[lIIlIlIll[172]] = llllIllIlII("EQ08Bg==", "bhYbN");
        lIIlIlIII[lIIlIlIll[173]] = llllIllIIll("r+XDCbLH0kY=", "DpPag");
        lIIlIlIII[lIIlIlIll[174]] = llllIllIlIl("/cYJkrlFJlyWHtvP5C+chQ==", "kwoke");
        lIIlIlIII[lIIlIlIll[175]] = llllIllIlIl("ar+/d/rvpws=", "AGhoN");
        lIIlIlIII[lIIlIlIll[176]] = llllIllIlIl("C3l4qCOrpT4=", "ofWWT");
        lIIlIlIII[lIIlIlIll[177]] = llllIllIIll("nCICF0rf+lJVm6ya/Qk1Mw==", "SmAJV");
        lIIlIlIII[lIIlIlIll[178]] = llllIllIlIl("QwK7JXYElfk=", "vrAVI");
        lIIlIlIII[lIIlIlIll[179]] = llllIllIIll("XLTBmnKRLr8=", "RZEjI");
        lIIlIlIII[lIIlIlIll[180]] = llllIllIIll("z7cPkN0RT0ju+Ssjw9NtyQ==", "lsukE");
        lIIlIlIII[lIIlIlIll[181]] = llllIllIIll("w9CzWlwFRBk=", "qRDmn");
        lIIlIlIII[lIIlIlIll[182]] = llllIllIlII("MQoTJg==", "BovBJ");
        lIIlIlIII[lIIlIlIll[183]] = llllIllIlIl("Wds7epu4jdBRCA9ehskdbw==", "rzFby");
        lIIlIlIII[lIIlIlIll[184]] = llllIllIlII("JyYjKw==", "TCFOv");
        lIIlIlIII[lIIlIlIll[185]] = llllIllIlIl("fIq+bxx8JU0=", "fbmVR");
        lIIlIlIII[lIIlIlIll[186]] = llllIllIlII("LQggLw9ZETUzCRE=", "yaTGj");
        lIIlIlIII[lIIlIlIll[187]] = llllIllIlII("KgEULw==", "YdqKX");
        lIIlIlIII[lIIlIlIll[188]] = llllIllIlIl("+3sRMhL2lI8=", "eUVIJ");
        lIIlIlIII[lIIlIlIll[189]] = llllIllIlIl("igG9d0e9eyB+SGQimkMG0A==", "HxiXU");
        lIIlIlIII[lIIlIlIll[190]] = llllIllIlII("Gws8Hg==", "hnYzO");
        lIIlIlIII[lIIlIlIll[191]] = llllIllIlIl("ONSXDFDTOms=", "tEoPf");
        lIIlIlIII[lIIlIlIll[192]] = llllIllIlII("PD06JQtIJC85DQA=", "hTNMn");
        lIIlIlIII[lIIlIlIll[193]] = llllIllIlIl("K9aEhpRJMwo=", "qnqXU");
        lIIlIlIII[lIIlIlIll[194]] = llllIllIlIl("NLpc0y2jvVQ=", "hwBMa");
        lIIlIlIII[lIIlIlIll[195]] = llllIllIlII("Ph4OPSFKBxshJwI=", "jwzUD");
        lIIlIlIII[lIIlIlIll[196]] = llllIllIlII("IjMfJw==", "QVzCR");
        lIIlIlIII[lIIlIlIll[197]] = llllIllIIll("ZHUrEgqoNO8=", "Tjyib");
        lIIlIlIII[lIIlIlIll[198]] = llllIllIlII("PBoYOAZIAw0kAAA=", "hslPc");
        lIIlIlIII[lIIlIlIll[199]] = llllIllIlIl("BI1ZF07mNGE=", "GebFk");
        lIIlIlIII[lIIlIlIll[200]] = llllIllIlIl("HDR0c8oYPGE=", "HBMzX");
        lIIlIlIII[lIIlIlIll[201]] = llllIllIIll("Zy05rpLolYPxpHpPSIKzcw==", "iaDar");
        lIIlIlIII[lIIlIlIll[202]] = llllIllIlIl("UqAkcVkKI+U=", "tnyTb");
        lIIlIlIII[lIIlIlIll[203]] = llllIllIIll("e6ZErm6LAXc=", "YkUjv");
        lIIlIlIII[lIIlIlIll[204]] = llllIllIlIl("KchMH3GcuAs=", "uWMwq");
        lIIlIlIII[lIIlIlIll[205]] = llllIllIlIl("K7Br8IIE5iVVnRW/94I06w==", "vMETq");
        lIIlIlIII[lIIlIlIll[206]] = llllIllIIll("YwLjaEQcrQU=", "rPXPW");
        lIIlIlIII[lIIlIlIll[207]] = llllIllIlIl("RJQR7TkjTCs=", "XuXih");
        lIIlIlIII[lIIlIlIll[208]] = llllIllIlIl("sSAKKjRQ6fqrgI/DZL45wQ==", "KhBxd");
        lIIlIlIII[lIIlIlIll[209]] = llllIllIlIl("EkhoeF03yj0=", "zgGnw");
        lIIlIlIII[lIIlIlIll[210]] = llllIllIlIl("koDxE+ieTKE=", "ppaHR");
        lIIlIlIII[lIIlIlIll[211]] = llllIllIlII("Lwc2GiwUEg==", "gfDlI");
        lIIlIlIII[lIIlIlIll[212]] = llllIllIIll("RH64TvvhPFg=", "PsNoy");
        lIIlIlIII[lIIlIlIll[213]] = llllIllIIll("gr8Qr2KHnVU=", "ijHwD");
        lIIlIlIII[lIIlIlIll[214]] = llllIllIlII("MSkxCQcrIjM=", "BLTmk");
        lIIlIlIII[lIIlIlIll[215]] = llllIllIlIl("NR1ytUnTkVM=", "gIuti");
        lIIlIlIII[lIIlIlIll[216]] = llllIllIlIl("bozbt1Ut8tc=", "klDrP");
        lIIlIlIII[lIIlIlIll[217]] = llllIllIIll("Wmq7A4ZJXKA=", "LQhMw");
        lIIlIlIII[lIIlIlIll[218]] = llllIllIlIl("hh6yyMRzKI8ZFR5AiQSNVw==", "YAzZU");
        lIIlIlIII[lIIlIlIll[219]] = llllIllIIll("/9LeoK8tUws=", "xNxwg");
        lIIlIlIII[lIIlIlIll[220]] = llllIllIlIl("Ak+2ufeHPwg=", "rjSEt");
        lIIlIlIII[lIIlIlIll[221]] = llllIllIlII("AAoofA==", "ckFTW");
        lIIlIlIII[lIIlIlIll[222]] = llllIllIlII("NScWew==", "VFxSl");
        lIIlIlIII[lIIlIlIll[223]] = llllIllIlII("KhY8EwUwHT4=", "YsYwi");
        lIIlIlIII[lIIlIlIll[224]] = llllIllIIll("MSSVZzh2wFA=", "dCszS");
        lIIlIlIII[lIIlIlIll[225]] = llllIllIIll("eBtNH+WwG8g=", "pDoJl");
        lIIlIlIII[lIIlIlIll[226]] = llllIllIIll("VjzXvAODeOo=", "KdUSx");
        lIIlIlIII[lIIlIlIll[227]] = llllIllIlIl("k4VWYSbICT0=", "TDTFz");
        lIIlIlIII[lIIlIlIll[228]] = llllIllIlII("IRc0Axk7HDY=", "RrQgu");
        lIIlIlIII[lIIlIlIll[229]] = llllIllIlII("AgQmAxY=", "rhGmb");
        lIIlIlIII[lIIlIlIll[230]] = llllIllIlIl("uc37YlICKcA=", "DUQJk");
        lIIlIlIII[lIIlIlIll[231]] = llllIllIIll("VNvH7hIDJVM=", "JOoKj");
        lIIlIlIII[lIIlIlIll[232]] = llllIllIlIl("Y2ElzM3QvndQxH4hKNYXBA==", "EmCFM");
        lIIlIlIII[lIIlIlIll[233]] = llllIllIlII("FgACDw==", "eegkm");
        lIIlIlIII[lIIlIlIll[234]] = llllIllIlIl("+ewGDTJP57Y=", "oVjge");
        lIIlIlIII[lIIlIlIll[235]] = llllIllIIll("bcfF+zgUngI=", "xbfdV");
        lIIlIlIII[lIIlIlIll[236]] = llllIllIlIl("/Sed8vF1Cyg=", "NBStE");
        lIIlIlIII[lIIlIlIll[237]] = llllIllIIll("RH2c+mqCUcY=", "EoNPa");
        lIIlIlIII[lIIlIlIll[238]] = llllIllIIll("pxqmY9NUvc+auV8UuXc7Ew==", "PUEtr");
        lIIlIlIII[lIIlIlIll[239]] = llllIllIlIl("wy3NV9ERCTg=", "FeWoz");
        lIIlIlIII[lIIlIlIll[240]] = llllIllIlIl("u/XKnFHK79I=", "AiqEN");
        lIIlIlIII[lIIlIlIll[241]] = llllIllIIll("6qud+rceZIQ=", "nyyUO");
        lIIlIlIII[lIIlIlIll[242]] = llllIllIlIl("KQaAROJXyd0=", "YrEwV");
        lIIlIlIII[lIIlIlIll[243]] = llllIllIlIl("S4N4kawf+SE=", "DoTYY");
        lIIlIlIII[lIIlIlIll[244]] = llllIllIIll("2MmWACWAi9c=", "KLYiD");
        lIIlIlIII[lIIlIlIll[245]] = llllIllIlII("LSMIIzkAMg==", "iFxLJ");
        lIIlIlIII[lIIlIlIll[246]] = llllIllIIll("gAWhWZUi5kg=", "scORz");
        lIIlIlIII[lIIlIlIll[248]] = llllIllIIll("A1zqnVx+3H4=", "sWXum");
        lIIlIlIII[lIIlIlIll[249]] = llllIllIlIl("Hv8q/MrlL8D0wv1YUx+Tbw==", "NonGI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0a43, code lost:
        if (lllllIllIIl(e(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ab.lh)) == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0a46, code lost:
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ab.kK = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ab.lIIlIlIll[0];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v175, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void dt() {
        if (lllllIlIIll(dy() ? 1 : 0)) {
            WorldPoint worldPoint = new WorldPoint(lIIlIlIll[40], lIIlIlIll[41], lIIlIlIll[0]);
            if (lllllIlIIll(dx() ? 1 : 0) && lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[35]];
                if (lllllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                try {
                    C0004e.a(worldPoint);
                    "".length();
                    if (" ".length() >= "  ".length()) {
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Time.sleepTicks(lIIlIlIll[1]);
                "".length();
            }
            if (lllllIlIIIl(dx() ? 1 : 0)) {
                if (lllllIlIIIl(Inventory.contains(item -> {
                    return item.getName().contains(lIIlIlIII[lIIlIlIll[246]]);
                }) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[42]];
                    TileObject nearest = TileObjects.getNearest(tileObject -> {
                        if (lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[244]]) ? 1 : 0)) {
                            String[] strArr = new String[lIIlIlIll[1]];
                            strArr[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[245]];
                            if (lllllIlIIIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                                ?? r0 = lIIlIlIll[1];
                                "".length();
                                return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                        return lIIlIlIll[0];
                    });
                    if (lllllIlIlIl(nearest)) {
                        AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[43]];
                        nearest.interact(lIIlIlIII[lIIlIlIll[34]]);
                        Time.sleepTicks(lIIlIlIll[5]);
                        "".length();
                    }
                }
                if (lllllIlIIll(Inventory.contains(item2 -> {
                    return item2.getName().contains(lIIlIlIII[lIIlIlIll[243]]);
                }) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[44]];
                    String[] strArr = new String[lIIlIlIll[1]];
                    strArr[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[10]];
                    TileObjects.getNearest(strArr).interact(lIIlIlIII[lIIlIlIll[45]]);
                    Time.sleepTicks(lIIlIlIll[4]);
                    "".length();
                }
            }
            if (lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIlIll[7])) {
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[46]];
                if (lllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr2 = new String[lIIlIlIll[1]];
                    strArr2[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[47]];
                    TileObjects.getNearest(strArr2).interact(lIIlIlIII[lIIlIlIll[48]]);
                    Time.sleepTicks(lIIlIlIll[4]);
                    "".length();
                }
                if (lllllIlIlII(Skills.getLevel(Skill.FARMING), lIIlIlIll[49])) {
                    String[] strArr3 = new String[lIIlIlIll[1]];
                    strArr3[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[50]];
                    C0006g.a(strArr3);
                }
                if (lllllIlIlII(Skills.getLevel(Skill.FARMING), lIIlIlIll[51]) && lllllIlIIlI(Skills.getLevel(Skill.FARMING), lIIlIlIll[49])) {
                    String[] strArr4 = new String[lIIlIlIll[1]];
                    strArr4[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[52]];
                    C0006g.a(strArr4);
                }
                if (lllllIlIIlI(Skills.getLevel(Skill.FARMING), lIIlIlIll[51])) {
                    String[] strArr5 = new String[lIIlIlIll[1]];
                    strArr5[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[53]];
                    C0006g.a(strArr5);
                }
                if (lllllIlIIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.enterAmount(lIIlIlIll[54]);
                    Time.sleepTicks(lIIlIlIll[6]);
                    "".length();
                }
            }
        }
        if (lllllIlIIIl(dy() ? 1 : 0)) {
            if (lllllIlIIll(dx() ? 1 : 0)) {
                kN = null;
                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[39]];
                if (lllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr6 = new String[lIIlIlIll[1]];
                    strArr6[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[55]];
                    TileObjects.getNearest(strArr6).interact(lIIlIlIII[lIIlIlIll[56]]);
                    Time.sleepTicks(lIIlIlIll[4]);
                    "".length();
                }
                String[] strArr7 = new String[lIIlIlIll[1]];
                strArr7[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[57]];
                C0006g.a(strArr7);
            }
            if (lllllIlIIIl(dx() ? 1 : 0)) {
                String[] strArr8 = new String[lIIlIlIll[1]];
                strArr8[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[58]];
                if (lllllIlIlIl(TileObjects.getNearest(strArr8))) {
                    String[] strArr9 = new String[lIIlIlIll[1]];
                    strArr9[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[59]];
                    kN = TileObjects.getNearest(strArr9).getWorldLocation();
                    dw();
                }
                if (lllllIlIlIl(kN)) {
                    String[] strArr10 = new String[lIIlIlIll[1]];
                    strArr10[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[60]];
                    if (lllllIlIIIl(TileObjects.getNearest(strArr10).getWorldLocation().equals(kN) ? 1 : 0)) {
                        if (lllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(kN), lIIlIlIll[37])) {
                            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[61]];
                            if (lllllIlIIIl(Inventory.contains(item3 -> {
                                return item3.getName().contains(lIIlIlIII[lIIlIlIll[242]]);
                            }) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[62]];
                                TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                                    if (lllllIlIIIl(tileObject2.getName().contains(lIIlIlIII[lIIlIlIll[240]]) ? 1 : 0)) {
                                        String[] strArr11 = new String[lIIlIlIll[1]];
                                        strArr11[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[241]];
                                        if (lllllIlIIIl(tileObject2.hasAction(strArr11) ? 1 : 0)) {
                                            ?? r0 = lIIlIlIll[1];
                                            "".length();
                                            return " ".length() == (195 ^ 199) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                    }
                                    return lIIlIlIll[0];
                                });
                                if (lllllIlIlIl(nearest2)) {
                                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[3]];
                                    nearest2.interact(lIIlIlIII[lIIlIlIll[63]]);
                                    Time.sleepTicks(lIIlIlIll[5]);
                                    "".length();
                                }
                            }
                            if (lllllIlIIll(Inventory.contains(item4 -> {
                                return item4.getName().contains(lIIlIlIII[lIIlIlIll[239]]);
                            }) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[64]];
                                String[] strArr11 = new String[lIIlIlIll[1]];
                                strArr11[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[65]];
                                TileObjects.getNearest(strArr11).interact(lIIlIlIII[lIIlIlIll[66]]);
                                Time.sleepTicks(lIIlIlIll[4]);
                                "".length();
                            }
                        }
                        if (lllllIlIIll(dz() ? 1 : 0) && lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kN), lIIlIlIll[37])) {
                            TileObject nearest3 = TileObjects.getNearest(tileObject3 -> {
                                return tileObject3.getName().contains(lIIlIlIII[lIIlIlIll[238]]);
                            });
                            TileObject nearest4 = TileObjects.getNearest(tileObject4 -> {
                                return tileObject4.getName().contains(lIIlIlIII[lIIlIlIll[237]]);
                            });
                            if (lllllIllIIl(nearest3) && lllllIllIIl(nearest4)) {
                                if (lllllIlIIll(Movement.isRunEnabled() ? 1 : 0) && lllllIlIlll(Movement.getRunEnergy(), lIIlIlIll[47])) {
                                    Movement.toggleRun();
                                    Time.sleepTicks(lIIlIlIll[7]);
                                    "".length();
                                }
                                int[] iArr = new int[lIIlIlIll[1]];
                                iArr[lIIlIlIll[0]] = lIIlIlIll[9];
                                if (lllllIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                                    TileObject nearest5 = TileObjects.getNearest(tileObject5 -> {
                                        if (lllllIlIIIl(tileObject5.getName().contains(lIIlIlIII[lIIlIlIll[236]]) ? 1 : 0) && lllllIllIII(tileObject5.getWorldLocation().distanceTo(kN), lIIlIlIll[12])) {
                                            ?? r0 = lIIlIlIll[1];
                                            "".length();
                                            return " ".length() > (46 ^ 42) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIlIlIll[0];
                                    });
                                    if (lllllIlIlIl(nearest5)) {
                                        AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[67]];
                                        int[] iArr2 = new int[lIIlIlIll[1]];
                                        iArr2[lIIlIlIll[0]] = lIIlIlIll[9];
                                        Inventory.getFirst(iArr2).useOn(nearest5);
                                        Time.sleepTicks(lIIlIlIll[6]);
                                        "".length();
                                    }
                                }
                                int[] iArr3 = new int[lIIlIlIll[1]];
                                iArr3[lIIlIlIll[0]] = lIIlIlIll[9];
                                if (lllllIlIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                                    if (lllllIlIIll(Players.getLocal().getWorldLocation().equals(kO) ? 1 : 0)) {
                                        int[] iArr4 = new int[lIIlIlIll[1]];
                                        iArr4[lIIlIlIll[0]] = lIIlIlIll[9];
                                        if (lllllIlIIll(Inventory.contains(iArr4) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[68]];
                                            C0004e.c(kO);
                                            Time.sleepTicks(lIIlIlIll[1]);
                                            "".length();
                                        }
                                    }
                                    if (lllllIlIIIl(Players.getLocal().getWorldLocation().equals(kO) ? 1 : 0) && lllllIllIIl(TileObjects.getNearest(tileObject6 -> {
                                        if (lllllIlIIIl(tileObject6.getName().contains(lIIlIlIII[lIIlIlIll[235]]) ? 1 : 0) && lllllIllIII(tileObject6.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIlIll[7])) {
                                            ?? r0 = lIIlIlIll[1];
                                            "".length();
                                            return " ".length() < (-" ".length()) ? ((((114 + 46) - 157) + 131) ^ (((119 + 0) - (-7)) + 23)) & (((((86 + 16) - 82) + 133) ^ (((101 + 118) - 146) + 65)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIlIlIll[0];
                                    }))) {
                                        int[] iArr5 = new int[lIIlIlIll[1]];
                                        iArr5[lIIlIlIll[0]] = lIIlIlIll[9];
                                        if (lllllIlIIll(Inventory.contains(iArr5) ? 1 : 0)) {
                                            if (lllllIlIIlI(Movement.getRunEnergy(), lIIlIlIll[69])) {
                                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[70]];
                                                Time.sleepTicks(lIIlIlIll[1]);
                                                "".length();
                                            }
                                            if (lllllIlIlII(Movement.getRunEnergy(), lIIlIlIll[69])) {
                                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[71]];
                                                if (lllllIlIIIl(Inventory.contains(item5 -> {
                                                    return item5.getName().contains(lIIlIlIII[lIIlIlIll[234]]);
                                                }) ? 1 : 0)) {
                                                    Inventory.getFirst(item6 -> {
                                                        return item6.getName().contains(lIIlIlIII[lIIlIlIll[233]]);
                                                    }).useOn(TileObjects.getNearest(tileObject7 -> {
                                                        if (lllllIlIIIl(tileObject7.getName().contains(lIIlIlIII[lIIlIlIll[232]]) ? 1 : 0) && lllllIllIII(tileObject7.getWorldLocation().distanceTo(li), lIIlIlIll[4])) {
                                                            ?? r0 = lIIlIlIll[1];
                                                            "".length();
                                                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                        }
                                                        return lIIlIlIll[0];
                                                    }));
                                                    Time.sleepTicks(lIIlIlIll[1]);
                                                    "".length();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (!lllllIllIIl(nearest3) || lllllIlIlIl(nearest4)) {
                                TileObject nearest6 = TileObjects.getNearest(tileObject8 -> {
                                    if (!lllllIlIIll(tileObject8.getName().contains(lIIlIlIII[lIIlIlIll[228]]) ? 1 : 0) || lllllIlIIIl(tileObject8.getName().contains(lIIlIlIII[lIIlIlIll[229]]) ? 1 : 0)) {
                                        String[] strArr12 = new String[lIIlIlIll[1]];
                                        strArr12[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[230]];
                                        if (lllllIlIIll(tileObject8.hasAction(strArr12) ? 1 : 0)) {
                                            String[] strArr13 = new String[lIIlIlIll[1]];
                                            strArr13[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[231]];
                                        }
                                        if (lllllIllIII(tileObject8.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIlIll[6])) {
                                            ?? r0 = lIIlIlIll[1];
                                            "".length();
                                            return ((((107 + 81) - 77) + 17) ^ (((85 + 107) - 174) + 114)) <= "  ".length() ? ((((72 + 177) - 37) + 22) ^ (((134 + 44) - 32) + 45)) & (((56 ^ 70) ^ (37 ^ 14)) ^ (-" ".length())) : r0;
                                        }
                                    }
                                    return lIIlIlIll[0];
                                });
                                if (lllllIlIlIl(nearest6) && lllllIlIIll(kK ? 1 : 0)) {
                                    String[] strArr12 = new String[lIIlIlIll[1]];
                                    strArr12[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[72]];
                                    if (lllllIlIIIl(nearest6.hasAction(strArr12) ? 1 : 0)) {
                                        if (lllllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(lh), lIIlIlIll[5]) && lllllIlIlIl(e(lh))) {
                                            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[73]];
                                            if (lllllIlIIIl(Inventory.contains(item7 -> {
                                                return item7.getName().contains(lIIlIlIII[lIIlIlIll[227]]);
                                            }) ? 1 : 0)) {
                                                Inventory.getFirst(item8 -> {
                                                    return item8.getName().contains(lIIlIlIII[lIIlIlIll[226]]);
                                                }).useOn(TileObjects.getNearest(tileObject9 -> {
                                                    if (!lllllIlIIll(tileObject9.getName().contains(lIIlIlIII[lIIlIlIll[223]]) ? 1 : 0) || lllllIlIIIl(tileObject9.getName().contains(lIIlIlIII[lIIlIlIll[224]]) ? 1 : 0)) {
                                                        String[] strArr13 = new String[lIIlIlIll[1]];
                                                        strArr13[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[225]];
                                                        if (lllllIlIIIl(tileObject9.hasAction(strArr13) ? 1 : 0) && lllllIllIII(tileObject9.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIlIll[7])) {
                                                            ?? r0 = lIIlIlIll[1];
                                                            "".length();
                                                            return (-((((82 + 166) - 200) + 135) ^ (((46 + 13) - 44) + 163))) >= 0 ? ((142 ^ 190) ^ (125 ^ 93)) & (((246 ^ 175) ^ (126 ^ 55)) ^ (-" ".length())) : r0;
                                                        }
                                                    }
                                                    return lIIlIlIll[0];
                                                }));
                                                Time.sleepTicks(lIIlIlIll[1]);
                                                "".length();
                                                return;
                                            }
                                        }
                                        if (lllllIlIlII(Players.getLocal().getWorldLocation().distanceTo(lh), lIIlIlIll[5])) {
                                            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[2]];
                                            if (lllllIlIIIl(Inventory.contains(item9 -> {
                                                return item9.getName().contains(lIIlIlIII[lIIlIlIll[222]]);
                                            }) ? 1 : 0)) {
                                                Inventory.getFirst(item10 -> {
                                                    return item10.getName().contains(lIIlIlIII[lIIlIlIll[221]]);
                                                }).useOn(TileObjects.getNearest(tileObject10 -> {
                                                    if (!lllllIlIIll(tileObject10.getName().contains(lIIlIlIII[lIIlIlIll[218]]) ? 1 : 0) || lllllIlIIIl(tileObject10.getName().contains(lIIlIlIII[lIIlIlIll[219]]) ? 1 : 0)) {
                                                        String[] strArr13 = new String[lIIlIlIll[1]];
                                                        strArr13[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[220]];
                                                        if (lllllIlIIIl(tileObject10.hasAction(strArr13) ? 1 : 0) && lllllIllIII(tileObject10.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIlIlIll[7])) {
                                                            ?? r0 = lIIlIlIll[1];
                                                            "".length();
                                                            return !((true ^ true) ^ (true ^ true)) ? ((95 ^ 86) ^ (242 ^ 160)) & (((((90 + 85) - 104) + 159) ^ (((141 + 98) - 131) + 81)) ^ (-" ".length())) : r0;
                                                        }
                                                    }
                                                    return lIIlIlIll[0];
                                                }));
                                                Time.sleepTicks(lIIlIlIll[1]);
                                                "".length();
                                                return;
                                            }
                                        }
                                    }
                                    String[] strArr13 = new String[lIIlIlIll[1]];
                                    strArr13[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[74]];
                                    if (lllllIlIIIl(nearest6.hasAction(strArr13) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[75]];
                                        nearest6.interact(lIIlIlIII[lIIlIlIll[76]]);
                                        Time.sleepTicks(lIIlIlIll[1]);
                                        "".length();
                                        return;
                                    }
                                }
                                if (lllllIllIIl(nearest6) && lllllIlIIll(kK ? 1 : 0)) {
                                    dv();
                                    if (lllllIlIlIl(e(lh))) {
                                        kK = lIIlIlIll[1];
                                    }
                                }
                                if (lllllIlIIIl(kK ? 1 : 0)) {
                                    if (lllllIlIIIl(kL.isEmpty() ? 1 : 0)) {
                                        du();
                                    }
                                    while (true) {
                                        if (!lllllIlIIll(kL.isEmpty() ? 1 : 0) || !lllllIlIIll(AccBuilderEasyClues.d ? 1 : 0) || !lllllIllIII(Players.getLocal().getWorldLocation().distanceTo(kN), lIIlIlIll[37])) {
                                            break;
                                        }
                                        String[] strArr14 = new String[lIIlIlIll[1]];
                                        strArr14[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[77]];
                                        if (lllllIlIIll(TileObjects.getNearest(strArr14).getWorldLocation().equals(kN) ? 1 : 0)) {
                                            String[] strArr15 = new String[lIIlIlIll[1]];
                                            strArr15[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[37]];
                                            kN = TileObjects.getNearest(strArr15).getWorldLocation();
                                            Time.sleepTicks(lIIlIlIll[4]);
                                            "".length();
                                            dw();
                                            "".length();
                                            if (" ".length() < (-" ".length())) {
                                                return;
                                            }
                                        } else {
                                            if (lllllIlIIll(Players.getLocal().getWorldLocation().equals(kL.get(lIIlIlIll[0])) ? 1 : 0)) {
                                                AccBuilderEasyClues.c = "Nav to tile " + String.valueOf(kL.get(lIIlIlIll[0]));
                                                C0004e.c(kL.get(lIIlIlIll[0]));
                                                Time.sleepTicks(lIIlIlIll[1]);
                                                "".length();
                                            }
                                            if (lllllIlIIIl(Players.getLocal().getWorldLocation().equals(kL.get(lIIlIlIll[0])) ? 1 : 0)) {
                                                TileObject nearest7 = TileObjects.getNearest(tileObject11 -> {
                                                    if (!lllllIlIIll(tileObject11.getName().contains(lIIlIlIII[lIIlIlIll[214]]) ? 1 : 0) || lllllIlIIIl(tileObject11.getName().contains(lIIlIlIII[lIIlIlIll[215]]) ? 1 : 0)) {
                                                        String[] strArr16 = new String[lIIlIlIll[1]];
                                                        strArr16[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[216]];
                                                        if (lllllIlIIll(tileObject11.hasAction(strArr16) ? 1 : 0)) {
                                                            String[] strArr17 = new String[lIIlIlIll[1]];
                                                            strArr17[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[217]];
                                                        }
                                                        if (lllllIllIII(tileObject11.getWorldLocation().distanceTo(kM.get(lIIlIlIll[0])), lIIlIlIll[4])) {
                                                            ?? r0 = lIIlIlIll[1];
                                                            "".length();
                                                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                        }
                                                    }
                                                    return lIIlIlIll[0];
                                                });
                                                if (lllllIlIlIl(nearest7)) {
                                                    String[] strArr16 = new String[lIIlIlIll[1]];
                                                    strArr16[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[78]];
                                                    if (lllllIlIIIl(nearest7.hasAction(strArr16) ? 1 : 0)) {
                                                        AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[79]];
                                                        if (lllllIlIIIl(Inventory.contains(item11 -> {
                                                            return item11.getName().contains(lIIlIlIII[lIIlIlIll[213]]);
                                                        }) ? 1 : 0)) {
                                                            Inventory.getFirst(item12 -> {
                                                                return item12.getName().contains(lIIlIlIII[lIIlIlIll[212]]);
                                                            }).useOn(nearest7);
                                                            Time.sleepTicks(lIIlIlIll[1]);
                                                            "".length();
                                                        }
                                                    }
                                                    String[] strArr17 = new String[lIIlIlIll[1]];
                                                    strArr17[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[80]];
                                                    if (lllllIlIIIl(nearest7.hasAction(strArr17) ? 1 : 0)) {
                                                        AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[51]];
                                                        nearest7.interact(lIIlIlIII[lIIlIlIll[81]]);
                                                        Time.sleepTicks(lIIlIlIll[1]);
                                                        "".length();
                                                        if (lllllIlIIIl(kL.get(lIIlIlIll[0]).equals(lh) ? 1 : 0)) {
                                                            AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[82]];
                                                            Time.sleepTicks(lIIlIlIll[22]);
                                                            "".length();
                                                        }
                                                    }
                                                }
                                                if (lllllIlIIIl(kL.get(lIIlIlIll[0]).equals(lg) ? 1 : 0)) {
                                                    AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[83]];
                                                    Time.sleepUntil(() -> {
                                                        if (lllllIlIlIl(TileObjects.getNearest(tileObject12 -> {
                                                            if (!lllllIlIIll(tileObject12.getName().contains(lIIlIlIII[lIIlIlIll[208]]) ? 1 : 0) || lllllIlIIIl(tileObject12.getName().contains(lIIlIlIII[lIIlIlIll[209]]) ? 1 : 0)) {
                                                                String[] strArr18 = new String[lIIlIlIll[1]];
                                                                strArr18[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[210]];
                                                                if (lllllIlIIll(tileObject12.hasAction(strArr18) ? 1 : 0)) {
                                                                    String[] strArr19 = new String[lIIlIlIll[1]];
                                                                    strArr19[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[211]];
                                                                }
                                                                if (lllllIllIII(tileObject12.getWorldLocation().distanceTo(lB), lIIlIlIll[4])) {
                                                                    ?? r0 = lIIlIlIll[1];
                                                                    "".length();
                                                                    return (163 ^ 167) <= ((97 ^ 112) & ((81 ^ 64) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                                }
                                                            }
                                                            return lIIlIlIll[0];
                                                        }))) {
                                                            ?? r0 = lIIlIlIll[1];
                                                            "".length();
                                                            return (-" ".length()) > ((127 ^ 62) ^ (192 ^ 133)) ? ((84 ^ 18) ^ (22 ^ 93)) & (((((72 + 35) - 82) + 127) ^ (((106 + 67) - 83) + 59)) ^ (-" ".length())) : r0;
                                                        }
                                                        return lIIlIlIll[0];
                                                    }, lIIlIlIll[84]);
                                                    "".length();
                                                }
                                                if (lllllIllIIl(nearest7)) {
                                                    kL.remove(lIIlIlIll[0]);
                                                    "".length();
                                                    kM.remove(lIIlIlIll[0]);
                                                    "".length();
                                                }
                                                "".length();
                                                if (" ".length() > (62 ^ 58)) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (lllllIlIIIl(dz() ? 1 : 0)) {
                            TileObject nearest8 = TileObjects.getNearest(tileObject12 -> {
                                if (lllllIlIIIl(tileObject12.getName().contains(lIIlIlIII[lIIlIlIll[207]]) ? 1 : 0) && lllllIllIII(tileObject12.getWorldLocation().distanceTo(kN), lIIlIlIll[12])) {
                                    ?? r0 = lIIlIlIll[1];
                                    "".length();
                                    return "   ".length() < " ".length() ? ((((212 + 149) - 249) + 134) ^ (((94 + 39) - 110) + 150)) & (((((39 + 25) - (-94)) + 84) ^ (((109 + 28) - 48) + 80)) ^ (-" ".length())) : r0;
                                }
                                return lIIlIlIll[0];
                            });
                            if (lllllIlIlIl(nearest8)) {
                                AccBuilderEasyClues.c = lIIlIlIII[lIIlIlIll[85]];
                                nearest8.interact(lIIlIlIII[lIIlIlIll[86]]);
                                Time.sleepTicks(lIIlIlIll[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean ab() {
        if (lllllIlIlII(Skills.getLevel(Skill.FARMING), lIIlIlIll[3])) {
            if (lllllIlIIIl(Inventory.contains(item -> {
                return item.getName().contains(lIIlIlIII[lIIlIlIll[142]]);
            }) ? 1 : 0)) {
                String[] strArr = new String[lIIlIlIll[1]];
                strArr[lIIlIlIll[0]] = lIIlIlIII[lIIlIlIll[133]];
                if (lllllIlIIIl(Inventory.contains(strArr) ? 1 : 0)) {
                    int[] iArr = new int[lIIlIlIll[1]];
                    iArr[lIIlIlIll[0]] = lIIlIlIll[24];
                    if (lllllIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                        ?? r0 = lIIlIlIll[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
            return lIIlIlIll[0];
        }
        int[] iArr2 = new int[lIIlIlIll[1]];
        iArr2[lIIlIlIll[0]] = lIIlIlIll[13];
        if (lllllIlIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIlIlIll[1]];
            iArr3[lIIlIlIll[0]] = lIIlIlIll[15];
            if (lllllIlIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIIlIlIll[1]];
                iArr4[lIIlIlIll[0]] = lIIlIlIll[14];
                if (lllllIlIIIl(Inventory.contains(iArr4) ? 1 : 0) && ((!lllllIlIIll(Inventory.contains(C0005f.aO) ? 1 : 0) || lllllIlIIIl(Equipment.contains(C0005f.aO) ? 1 : 0)) && (!lllllIlIIll(Inventory.contains(C0005f.bf) ? 1 : 0) || lllllIlIIIl(Equipment.contains(C0005f.bf) ? 1 : 0)))) {
                    ?? r02 = lIIlIlIll[1];
                    "".length();
                    return (-" ".length()) > 0 ? ((((59 + 47) - 23) + 53) ^ (((15 + 133) - 47) + 43)) & (((118 ^ 107) ^ (141 ^ 136)) ^ (-" ".length())) : r02;
                }
            }
        }
        return lIIlIlIll[0];
    }

    static {
        lllllIlIIII();
        lllllIIIlIl();
        bv = new ArrayList();
        kx = lIIlIlIll[247];
        ky = lIIlIlIll[21];
        bZ = lIIlIlIll[0];
        kL = new ArrayList<>();
        kM = new ArrayList<>();
        kN = null;
        kO = null;
        kP = null;
        kQ = null;
        kR = null;
        kS = null;
        kT = null;
        kU = null;
        kV = null;
        kW = null;
        kX = null;
        kY = null;
        kZ = null;
        la = null;
        lb = null;
        lc = null;
        ld = null;
        le = null;
        lf = null;
        lg = null;
        lh = null;
        cc = lIIlIlIII[lIIlIlIll[248]];
        h = lIIlIlIII[lIIlIlIll[249]];
    }

    private static String llllIllIIll(String lIIIIlIIIIlIllI, String lIIIIlIIIIlIlIl) {
        try {
            SecretKeySpec lIIIIlIIIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIlIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), lIIlIlIll[22]), "DES");
            Cipher lIIIIlIIIIllIII = Cipher.getInstance("DES");
            lIIIIlIIIIllIII.init(lIIlIlIll[4], lIIIIlIIIIllIIl);
            return new String(lIIIIlIIIIllIII.doFinal(Base64.getDecoder().decode(lIIIIlIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIlIIIIlIlll) {
            lIIIIlIIIIlIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01bb, code lost:
        if (lllllIlIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.ab.lIIlIlIll[10]) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8 = new int[lIIlIlIll[1]];
        iArr8[lIIlIlIll[0]] = lIIlIlIll[16];
        if (lllllIlIIll(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIll[16], lIIlIlIll[1], lIIlIlIll[134]));
            "".length();
        }
        int[] iArr9 = new int[lIIlIlIll[1]];
        iArr9[lIIlIlIll[0]] = lIIlIlIll[17];
        if (lllllIlIIll(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIll[17], lIIlIlIll[4], lIIlIlIll[135]));
            "".length();
        }
        int[] iArr10 = new int[lIIlIlIll[1]];
        iArr10[lIIlIlIll[0]] = lIIlIlIll[31];
        if (lllllIlIIll(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIll[31], lIIlIlIll[1], lIIlIlIll[135]));
            "".length();
        }
        int[] iArr11 = new int[lIIlIlIll[1]];
        iArr11[lIIlIlIll[0]] = lIIlIlIll[36];
        if (lllllIlIIll(Bank.contains(iArr11) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIll[36], lIIlIlIll[1], lIIlIlIll[135]));
            "".length();
        }
        int[] iArr12 = new int[lIIlIlIll[1]];
        iArr12[lIIlIlIll[0]] = lIIlIlIll[24];
        if (lllllIlIIll(Bank.contains(iArr12) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIll[24], lIIlIlIll[1], lIIlIlIll[135]));
            "".length();
        }
        int[] iArr13 = new int[lIIlIlIll[1]];
        iArr13[lIIlIlIll[0]] = lIIlIlIll[9];
        if (lllllIlIIIl(Bank.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIIlIlIll[1]];
            iArr14[lIIlIlIll[0]] = lIIlIlIll[9];
            if (lllllIlIIIl(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIlIlIll[1]];
                iArr15[lIIlIlIll[0]] = lIIlIlIll[9];
            }
            iArr = new int[lIIlIlIll[1]];
            iArr[lIIlIlIll[0]] = lIIlIlIll[13];
            if (lllllIlIIll(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIlIll[13], lIIlIlIll[12], lIIlIlIll[137]));
                "".length();
            }
            iArr2 = new int[lIIlIlIll[1]];
            iArr2[lIIlIlIll[0]] = lIIlIlIll[19];
            if (lllllIlIIll(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIlIll[19], lIIlIlIll[12], lIIlIlIll[138]));
                "".length();
            }
            iArr3 = new int[lIIlIlIll[1]];
            iArr3[lIIlIlIll[0]] = lIIlIlIll[15];
            if (lllllIlIIll(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIlIll[15], lIIlIlIll[12], lIIlIlIll[138]));
                "".length();
            }
            iArr4 = new int[lIIlIlIll[1]];
            iArr4[lIIlIlIll[0]] = lIIlIlIll[14];
            if (lllllIlIIll(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIlIll[14], lIIlIlIll[12], lIIlIlIll[138]));
                "".length();
            }
            iArr5 = new int[lIIlIlIll[1]];
            iArr5[lIIlIlIll[0]] = lIIlIlIll[21];
            if (lllllIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0003d(ky, lIIlIlIll[68], lIIlIlIll[139]));
                "".length();
            }
            iArr6 = new int[lIIlIlIll[1]];
            iArr6[lIIlIlIll[0]] = lIIlIlIll[140];
            if (lllllIlIIll(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIlIll[140], lIIlIlIll[1], lIIlIlIll[141]));
                "".length();
            }
            iArr7 = new int[lIIlIlIll[1]];
            iArr7[lIIlIlIll[0]] = lIIlIlIll[18];
            if (lllllIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
                return;
            }
            bv.add(new C0003d(lIIlIlIll[18], lIIlIlIll[47], C0008i.bq));
            "".length();
            return;
        }
        bv.add(new C0003d(lIIlIlIll[9], lIIlIlIll[10], lIIlIlIll[136]));
        "".length();
        iArr = new int[lIIlIlIll[1]];
        iArr[lIIlIlIll[0]] = lIIlIlIll[13];
        if (lllllIlIIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIIlIlIll[1]];
        iArr2[lIIlIlIll[0]] = lIIlIlIll[19];
        if (lllllIlIIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIlIlIll[1]];
        iArr3[lIIlIlIll[0]] = lIIlIlIll[15];
        if (lllllIlIIll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIIlIlIll[1]];
        iArr4[lIIlIlIll[0]] = lIIlIlIll[14];
        if (lllllIlIIll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIIlIlIll[1]];
        iArr5[lIIlIlIll[0]] = lIIlIlIll[21];
        if (lllllIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIIlIlIll[1]];
        iArr6[lIIlIlIll[0]] = lIIlIlIll[140];
        if (lllllIlIIll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIIlIlIll[1]];
        iArr7[lIIlIlIll[0]] = lIIlIlIll[18];
        if (lllllIlIIll(Bank.contains(iArr7) ? 1 : 0)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lllllIlIlII(Skills.getLevel(Skill.FARMING), lIIlIlIll[2])) {
            ?? r0 = lIIlIlIll[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIlIll[0];
    }

    private static void lllllIlIIII() {
        lIIlIlIll = new int[251];
        lIIlIlIll[0] = ((126 ^ 56) ^ (1 ^ 6)) & (((((175 + 139) - 142) + 54) ^ (((162 + 129) - 184) + 56)) ^ (-" ".length()));
        lIIlIlIll[1] = " ".length();
        lIIlIlIll[2] = (((31 + 85) - 12) + 42) ^ (((155 + 156) - 169) + 49);
        lIIlIlIll[3] = 168 ^ 138;
        lIIlIlIll[4] = "  ".length();
        lIIlIlIll[5] = "   ".length();
        lIIlIlIll[6] = (31 ^ 103) ^ (229 ^ 153);
        lIIlIlIll[7] = (60 ^ 6) ^ (93 ^ 98);
        lIIlIlIll[8] = (-113) & 5112;
        lIIlIlIll[9] = (-((-1425) & 3997)) & (-16673) & 24575;
        lIIlIlIll[10] = (((69 + 72) - 115) + 108) ^ (((44 + 5) - 24) + 126);
        lIIlIlIll[11] = 176 ^ 182;
        lIIlIlIll[12] = (198 ^ 192) ^ (28 ^ 16);
        lIIlIlIll[13] = (-((-6561) & 22969)) & (-129) & 24543;
        lIIlIlIll[14] = (-8323) & 16330;
        lIIlIlIll[15] = (-((-18573) & 26815)) & (-1) & 16251;
        lIIlIlIll[16] = (-(((81 + 194) - 244) + 164)) & (-28689) & 32735;
        lIIlIlIll[17] = (-20739) & 32718;
        lIIlIlIll[18] = (-((-323) & 18383)) & (-35) & 30719;
        lIIlIlIll[19] = (-((-6777) & 31486)) & (-49) & 32767;
        lIIlIlIll[20] = 151 ^ 144;
        lIIlIlIll[21] = (-10337) & 10721;
        lIIlIlIll[22] = "  ".length() ^ (46 ^ 36);
        lIIlIlIll[23] = (20 ^ 7) ^ (151 ^ 141);
        lIIlIlIll[24] = (-((-2059) & 27179)) & (-2049) & 32511;
        lIIlIlIll[25] = (-12) & 11871;
        lIIlIlIll[26] = (-(49 ^ 55)) & (-16673) & 28533;
        lIIlIlIll[27] = (-((-1095) & 21863)) & (-146) & 32767;
        lIIlIlIll[28] = (-((-5185) & 21955)) & (-2) & 28623;
        lIIlIlIll[29] = (-20609) & 32466;
        lIIlIlIll[30] = (-((-2753) & 23249)) & (-5) & 32350;
        lIIlIlIll[31] = (-4130) & 16097;
        lIIlIlIll[32] = (8 ^ 59) ^ (104 ^ 3);
        lIIlIlIll[33] = (-((-537) & 13021)) & (-49) & 32767;
        lIIlIlIll[34] = (((135 + 32) - (-12)) + 6) ^ (((116 + 120) - 206) + 152);
        lIIlIlIll[35] = 17 ^ 29;
        lIIlIlIll[36] = (-24579) & 25530;
        lIIlIlIll[37] = 128 ^ 178;
        lIIlIlIll[38] = (13 ^ 51) ^ (70 ^ 115);
        lIIlIlIll[39] = (((60 + 103) - 33) + 32) ^ (((174 + 79) - 197) + 131);
        lIIlIlIll[40] = (-12355) & 14155;
        lIIlIlIll[41] = (-20545) & 24047;
        lIIlIlIll[42] = (((90 + 0) - (-20)) + 58) ^ (((74 + 53) - 45) + 83);
        lIIlIlIll[43] = 142 ^ 128;
        lIIlIlIll[44] = (39 ^ 53) ^ "  ".length();
        lIIlIlIll[45] = (135 ^ 173) ^ (45 ^ 21);
        lIIlIlIll[46] = (236 ^ 155) ^ (204 ^ 168);
        lIIlIlIll[47] = 135 ^ 147;
        lIIlIlIll[48] = 44 ^ 57;
        lIIlIlIll[49] = (64 ^ 59) ^ (58 ^ 11);
        lIIlIlIll[50] = 133 ^ 147;
        lIIlIlIll[51] = 158 ^ 168;
        lIIlIlIll[52] = 85 ^ 66;
        lIIlIlIll[53] = (98 ^ 118) ^ (64 ^ 76);
        lIIlIlIll[54] = (-22533) & 32532;
        lIIlIlIll[55] = (((175 + 148) - 240) + 99) ^ (((57 + 99) - 12) + 28);
        lIIlIlIll[56] = 127 ^ 100;
        lIIlIlIll[57] = 134 ^ 154;
        lIIlIlIll[58] = (((5 + 95) - 66) + 143) ^ (((112 + 134) - 203) + 129);
        lIIlIlIll[59] = 117 ^ 107;
        lIIlIlIll[60] = 72 ^ 87;
        lIIlIlIll[61] = 4 ^ 36;
        lIIlIlIll[62] = 135 ^ 166;
        lIIlIlIll[63] = 167 ^ 132;
        lIIlIlIll[64] = (137 ^ 193) ^ (172 ^ 192);
        lIIlIlIll[65] = 102 ^ 67;
        lIIlIlIll[66] = (((35 + 126) - 127) + 157) ^ (((31 + 106) - 82) + 98);
        lIIlIlIll[67] = (211 ^ 128) ^ (222 ^ 170);
        lIIlIlIll[68] = 107 ^ 67;
        lIIlIlIll[69] = 228 ^ 177;
        lIIlIlIll[70] = (196 ^ 185) ^ (148 ^ 192);
        lIIlIlIll[71] = (116 ^ 44) ^ (88 ^ 42);
        lIIlIlIll[72] = (245 ^ 195) ^ (138 ^ 151);
        lIIlIlIll[73] = 15 ^ 35;
        lIIlIlIll[74] = (138 ^ 165) ^ " ".length();
        lIIlIlIll[75] = 119 ^ 88;
        lIIlIlIll[76] = (36 ^ 43) ^ (180 ^ 139);
        lIIlIlIll[77] = (250 ^ 128) ^ (27 ^ 80);
        lIIlIlIll[78] = 14 ^ 61;
        lIIlIlIll[79] = (166 ^ 175) ^ (30 ^ 35);
        lIIlIlIll[80] = (147 ^ 198) ^ (32 ^ 64);
        lIIlIlIll[81] = 50 ^ 5;
        lIIlIlIll[82] = (142 ^ 165) ^ (182 ^ 165);
        lIIlIlIll[83] = 90 ^ 99;
        lIIlIlIll[84] = (-7) & 2806;
        lIIlIlIll[85] = (237 ^ 158) ^ (222 ^ 151);
        lIIlIlIll[86] = (64 ^ 113) ^ (107 ^ 97);
        lIIlIlIll[87] = (47 ^ 12) ^ (102 ^ 121);
        lIIlIlIll[88] = (120 ^ 6) ^ (194 ^ 129);
        lIIlIlIll[89] = 119 ^ 73;
        lIIlIlIll[90] = (125 ^ 103) ^ (173 ^ 136);
        lIIlIlIll[91] = (148 ^ 129) ^ (89 ^ 12);
        lIIlIlIll[92] = 16 ^ 81;
        lIIlIlIll[93] = (((23 + 53) - (-33)) + 86) ^ (((44 + 120) - 69) + 34);
        lIIlIlIll[94] = 7 ^ 68;
        lIIlIlIll[95] = (226 ^ 174) ^ (98 ^ 106);
        lIIlIlIll[96] = 120 ^ 61;
        lIIlIlIll[97] = 209 ^ 151;
        lIIlIlIll[98] = 68 ^ 3;
        lIIlIlIll[99] = 10 ^ 66;
        lIIlIlIll[100] = (((23 + 194) - 32) + 26) ^ (((77 + 135) - 191) + 133);
        lIIlIlIll[101] = (81 ^ 105) ^ (197 ^ 182);
        lIIlIlIll[102] = (((155 + 86) - 200) + 185) ^ (((54 + 48) - (-60)) + 12);
        lIIlIlIll[103] = 8 ^ 69;
        lIIlIlIll[104] = (((72 + 136) - 121) + 50) ^ (((135 + 156) - 184) + 92);
        lIIlIlIll[105] = (52 ^ 104) ^ (158 ^ 141);
        lIIlIlIll[106] = 56 ^ 104;
        lIIlIlIll[107] = 101 ^ 52;
        lIIlIlIll[108] = 104 ^ 58;
        lIIlIlIll[109] = 212 ^ 135;
        lIIlIlIll[110] = 18 ^ 70;
        lIIlIlIll[111] = " ".length() ^ (234 ^ 189);
        lIIlIlIll[112] = (61 ^ 113) ^ (4 ^ 31);
        lIIlIlIll[113] = (((72 + 50) - (-6)) + 65) ^ (((150 + 122) - 249) + 129);
        lIIlIlIll[114] = 57 ^ 99;
        lIIlIlIll[115] = (113 ^ 126) ^ (77 ^ 25);
        lIIlIlIll[116] = (122 ^ 56) ^ (150 ^ 136);
        lIIlIlIll[117] = 69 ^ 24;
        lIIlIlIll[118] = (113 ^ 82) ^ (3 ^ 126);
        lIIlIlIll[119] = (69 ^ 41) ^ (74 ^ 121);
        lIIlIlIll[120] = 216 ^ 184;
        lIIlIlIll[121] = (80 ^ 15) ^ (69 ^ 123);
        lIIlIlIll[122] = 23 ^ 117;
        lIIlIlIll[123] = 122 ^ 25;
        lIIlIlIll[124] = 96 ^ 4;
        lIIlIlIll[125] = (((5 + 31) - (-80)) + 78) ^ (((15 + 149) - 47) + 50);
        lIIlIlIll[126] = (-((-21807) & 24495)) & (-5) & 16117;
        lIIlIlIll[127] = (-((-25041) & 27610)) & (-16771) & 32763;
        lIIlIlIll[128] = (-2577) & 15999;
        lIIlIlIll[129] = (-((-1090) & 19917)) & (-513) & 32767;
        lIIlIlIll[130] = (-18697) & 32123;
        lIIlIlIll[131] = (-((-9297) & 26461)) & (-2050) & 32639;
        lIIlIlIll[132] = (-1231) & 22239;
        lIIlIlIll[133] = 234 ^ 140;
        lIIlIlIll[134] = (-((-22873) & 31708)) & (-1) & 14335;
        lIIlIlIll[135] = (-581) & 25580;
        lIIlIlIll[136] = (-((-4852) & 30455)) & (-4117) & 30719;
        lIIlIlIll[137] = (-27660) & 28559;
        lIIlIlIll[138] = (-((-5750) & 7807)) & (-29761) & 32767;
        lIIlIlIll[139] = (-((-10041) & 30585)) & (-8193) & 30686;
        lIIlIlIll[140] = (-((-13897) & 30557)) & (-2) & 28639;
        lIIlIlIll[141] = (-((-30353) & 32434)) & (-1) & 28031;
        lIIlIlIll[142] = 96 ^ 7;
        lIIlIlIll[143] = 109 ^ 5;
        lIIlIlIll[144] = (42 ^ 93) ^ (30 ^ 0);
        lIIlIlIll[145] = 106 ^ 0;
        lIIlIlIll[146] = 37 ^ 78;
        lIIlIlIll[147] = (76 ^ 15) ^ (170 ^ 133);
        lIIlIlIll[148] = 70 ^ 43;
        lIIlIlIll[149] = 92 ^ 50;
        lIIlIlIll[150] = 244 ^ 155;
        lIIlIlIll[151] = 2 ^ 114;
        lIIlIlIll[152] = 110 ^ 31;
        lIIlIlIll[153] = (202 ^ 197) ^ (100 ^ 25);
        lIIlIlIll[154] = 79 ^ 60;
        lIIlIlIll[155] = 117 ^ 1;
        lIIlIlIll[156] = (((185 + 70) - 62) + 45) ^ (((142 + 151) - 258) + 120);
        lIIlIlIll[157] = 227 ^ 149;
        lIIlIlIll[158] = (((3 + 57) - 7) + 153) ^ (((176 + 48) - 201) + 162);
        lIIlIlIll[159] = 227 ^ 155;
        lIIlIlIll[160] = 221 ^ 164;
        lIIlIlIll[161] = (241 ^ 164) ^ (35 ^ 12);
        lIIlIlIll[162] = (94 ^ 84) ^ (249 ^ 136);
        lIIlIlIll[163] = 56 ^ 68;
        lIIlIlIll[164] = (206 ^ 137) ^ (39 ^ 29);
        lIIlIlIll[165] = (247 ^ 188) ^ (133 ^ 176);
        lIIlIlIll[166] = (((41 ^ 115) + (241 ^ 149)) - (93 ^ 98)) + ((131 ^ 134) & ((132 ^ 129) ^ (-1)));
        lIIlIlIll[167] = (((29 ^ 9) + (100 ^ 89)) - " ".length()) + (172 ^ 156);
        lIIlIlIll[168] = (((171 ^ 144) + (21 ^ 52)) - (92 ^ 113)) + (20 ^ 70);
        lIIlIlIll[169] = ((61 + 32) - 42) + 79;
        lIIlIlIll[170] = ((72 + 78) - 99) + 80;
        lIIlIlIll[171] = (((37 ^ 117) + (4 ^ 66)) - (52 ^ 94)) + (41 ^ 113);
        lIIlIlIll[172] = ((14 + 21) - (-80)) + 18;
        lIIlIlIll[173] = (((129 ^ 147) + (95 ^ 58)) - (180 ^ 172)) + (156 ^ 187);
        lIIlIlIll[174] = (((((48 + 10) - (-52)) + 20) + (95 ^ 38)) - (((29 + 104) - 81) + 87)) + (114 ^ 101);
        lIIlIlIll[175] = ((10 + 128) - 23) + 21;
        lIIlIlIll[176] = ((112 + 34) - 30) + 21;
        lIIlIlIll[177] = (((82 ^ 79) + (41 ^ 53)) - (-(62 ^ 111))) + ((74 ^ 27) & ((211 ^ 130) ^ (-1)));
        lIIlIlIll[178] = (((85 ^ 17) + (((65 + 50) - (-2)) + 12)) - (105 ^ 57)) + (152 ^ 142);
        lIIlIlIll[179] = (((202 ^ 133) + (((118 + 29) - 128) + 116)) - (84 ^ 0)) + (200 ^ 194);
        lIIlIlIll[180] = ((87 + 118) - 87) + 23;
        lIIlIlIll[181] = ((123 + 87) - 184) + 116;
        lIIlIlIll[182] = (((62 ^ 68) + (76 ^ 33)) - (((40 + 16) - (-18)) + 141)) + ((88 + 125) - 206) + 120;
        lIIlIlIll[183] = (((73 ^ 19) + (((61 + 1) - (-15)) + 60)) - (((23 + 137) - 43) + 86)) + (10 ^ 114);
        lIIlIlIll[184] = ((107 + 85) - 140) + 93;
        lIIlIlIll[185] = ((110 + 17) - (-9)) + 10;
        lIIlIlIll[186] = ((56 + 27) - 78) + 142;
        lIIlIlIll[187] = ((69 + 69) - (-4)) + 6;
        lIIlIlIll[188] = ((95 + 130) - 161) + 85;
        lIIlIlIll[189] = ((54 + 40) - 66) + 122;
        lIIlIlIll[190] = ((56 + 38) - 59) + 116;
        lIIlIlIll[191] = ((61 + 61) - 12) + 42;
        lIIlIlIll[192] = (((80 ^ 22) + (16 ^ 68)) - (130 ^ 182)) + (162 ^ 145);
        lIIlIlIll[193] = ((48 + 14) - 58) + 150;
        lIIlIlIll[194] = ((81 + 25) - 21) + 70;
        lIIlIlIll[195] = ((129 + 143) - 166) + 50;
        lIIlIlIll[196] = (((174 ^ 181) + (198 ^ 169)) - (199 ^ 167)) + (42 ^ 89);
        lIIlIlIll[197] = (((((55 + 120) - 74) + 48) + (((106 + 16) - 52) + 68)) - (((7 + 118) - 20) + 90)) + (59 ^ 121);
        lIIlIlIll[198] = ((28 + 31) - 33) + 133;
        lIIlIlIll[199] = (((((100 + 6) - 4) + 37) + (9 ^ 92)) - (47 ^ 119)) + (69 ^ 93);
        lIIlIlIll[200] = ((155 + 84) - 115) + 37;
        lIIlIlIll[201] = ((138 + 57) - 133) + 100;
        lIIlIlIll[202] = (((173 ^ 191) + (76 ^ 0)) - (65 ^ 19)) + ((71 + 105) - 78) + 53;
        lIIlIlIll[203] = (((120 ^ 55) + "   ".length()) - "   ".length()) + (51 ^ 102);
        lIIlIlIll[204] = (((28 ^ 39) + (117 ^ 122)) - (0 ^ 38)) + ((45 + 81) - 18) + 21;
        lIIlIlIll[205] = ((16 + 50) - (-35)) + 65;
        lIIlIlIll[206] = ((60 + 11) - 30) + 126;
        lIIlIlIll[207] = ((106 + 127) - 80) + 15;
        lIIlIlIll[208] = ((51 + 23) - (-87)) + 8;
        lIIlIlIll[209] = ((14 + 65) - (-68)) + 23;
        lIIlIlIll[210] = ((94 + 153) - 192) + 116;
        lIIlIlIll[211] = (((69 ^ 107) + (134 ^ 161)) - (-(175 ^ 138))) + (16 ^ 34);
        lIIlIlIll[212] = ((92 + 20) - (-48)) + 13;
        lIIlIlIll[213] = ((143 + 73) - 209) + 167;
        lIIlIlIll[214] = (((114 ^ 30) + (152 ^ 166)) - (((12 + 118) - 51) + 59)) + ((122 + 26) - 75) + 70;
        lIIlIlIll[215] = ((66 + 45) - (-8)) + 57;
        lIIlIlIll[216] = ((92 + 151) - 87) + 21;
        lIIlIlIll[217] = ((124 + 85) - 86) + 55;
        lIIlIlIll[218] = ((94 + 75) - 69) + 79;
        lIIlIlIll[219] = ((37 + 18) - 35) + 160;
        lIIlIlIll[220] = ((99 + 174) - 212) + 120;
        lIIlIlIll[221] = ((76 + 47) - (-3)) + 56;
        lIIlIlIll[222] = ((32 + 177) - 145) + 119;
        lIIlIlIll[223] = ((67 + 85) - 20) + 52;
        lIIlIlIll[224] = (((77 ^ 30) + (6 ^ 81)) - (92 ^ 56)) + (222 ^ 173);
        lIIlIlIll[225] = (((61 ^ 74) + (76 ^ 80)) - (190 ^ 186)) + (22 ^ 61);
        lIIlIlIll[226] = ((119 + 98) - 175) + 145;
        lIIlIlIll[227] = (((195 ^ 144) + "  ".length()) - (68 ^ 111)) + ((49 + 55) - (-23)) + 19;
        lIIlIlIll[228] = ((106 + 74) - 138) + 147;
        lIIlIlIll[229] = ((133 + 96) - 109) + 70;
        lIIlIlIll[230] = (((135 ^ 169) + (((60 + 74) - (-1)) + 0)) - (-(79 ^ 71))) + "  ".length();
        lIIlIlIll[231] = ((180 + 27) - 69) + 54;
        lIIlIlIll[232] = (((70 ^ 34) + (100 ^ 72)) - (248 ^ 196)) + (200 ^ 165);
        lIIlIlIll[233] = ((130 + 97) - 138) + 105;
        lIIlIlIll[234] = (((((139 + 118) - 124) + 18) + (84 ^ 125)) - (((101 + 114) - 167) + 100)) + ((47 + 108) - 4) + 0;
        lIIlIlIll[235] = (((95 ^ 108) + (((92 + 123) - 147) + 113)) - (194 ^ 135)) + (147 ^ 178);
        lIIlIlIll[236] = ((42 + 36) - (-2)) + 117;
        lIIlIlIll[237] = (((88 ^ 123) + (((1 + 124) - 96) + 101)) - (104 ^ 42)) + (166 ^ 197);
        lIIlIlIll[238] = ((92 + 26) - 99) + 180;
        lIIlIlIll[239] = (((((24 + 16) - (-71)) + 18) + (206 ^ 176)) - (228 ^ 151)) + (14 ^ 50);
        lIIlIlIll[240] = ((5 + 110) - (-85)) + 1;
        lIIlIlIll[241] = ((13 + 82) - 1) + 108;
        lIIlIlIll[242] = (((59 ^ 66) + (((72 + 53) - (-16)) + 38)) - ((-31835) & 32123)) + ((70 + 182) - 81) + 21;
        lIIlIlIll[243] = ((135 + 157) - 238) + 150;
        lIIlIlIll[244] = (((((130 + 70) - 92) + 58) + (143 ^ 152)) - (((48 + 125) - 141) + 122)) + ((162 + 111) - 125) + 22;
        lIIlIlIll[245] = ((7 + 75) - 56) + 180;
        lIIlIlIll[246] = ((70 + 46) - 31) + 122;
        lIIlIlIll[247] = (-8293) & 29438;
        lIIlIlIll[248] = ((145 + 145) - 83) + 1;
        lIIlIlIll[249] = ((76 + 50) - 70) + 153;
        lIIlIlIll[250] = (((80 ^ 124) + (122 ^ 45)) - (209 ^ 152)) + ((1 + 144) - 142) + 149;
    }

    private static boolean lllllIlIlll(int i, int i2) {
        return i > i2;
    }

    private static TileObject e(WorldPoint worldPoint) {
        return TileObjects.getNearest(tileObject -> {
            if ((!lllllIlIIll(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[205]]) ? 1 : 0) || lllllIlIIIl(tileObject.getName().contains(lIIlIlIII[lIIlIlIll[206]]) ? 1 : 0)) && lllllIllIII(tileObject.getWorldLocation().distanceTo(worldPoint), lIIlIlIll[4])) {
                ?? r0 = lIIlIlIll[1];
                "".length();
                return (-((((103 + 2) - 24) + 85) ^ (((123 + 33) - 153) + 159))) > 0 ? ((((95 + 49) - 142) + 223) ^ (((7 + 128) - 20) + 15)) & (((((155 + 165) - 129) + 27) ^ (((104 + 96) - 54) + 39)) ^ (-" ".length())) : r0;
            }
            return lIIlIlIll[0];
        });
    }

    private static boolean lllllIlIlIl(Object obj) {
        return obj != null;
    }

    private static void dw() {
        System.out.println(TileObjects.getNearest(tileObject -> {
            return tileObject.getName().contains(lIIlIlIII[lIIlIlIll[143]]);
        }).getWorldLocation());
        kO = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() - lIIlIlIll[42], kN.getPlane());
        kP = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() - lIIlIlIll[42], kN.getPlane());
        kQ = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() - lIIlIlIll[23], kN.getPlane());
        kR = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() - lIIlIlIll[23], kN.getPlane());
        kS = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() - lIIlIlIll[11], kN.getPlane());
        kT = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() - lIIlIlIll[11], kN.getPlane());
        kU = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() - lIIlIlIll[5], kN.getPlane());
        kV = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() - lIIlIlIll[5], kN.getPlane());
        kW = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() + lIIlIlIll[5], kN.getPlane());
        kX = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() + lIIlIlIll[5], kN.getPlane());
        kY = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() + lIIlIlIll[11], kN.getPlane());
        kZ = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() + lIIlIlIll[11], kN.getPlane());
        la = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() + lIIlIlIll[23], kN.getPlane());
        lb = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() + lIIlIlIll[23], kN.getPlane());
        lc = new WorldPoint(kN.getX() + lIIlIlIll[22], kN.getY() + lIIlIlIll[35], kN.getPlane());
        ld = new WorldPoint(kN.getX() + lIIlIlIll[23], kN.getY() + lIIlIlIll[35], kN.getPlane());
        le = new WorldPoint(kN.getX() + lIIlIlIll[43], kN.getY() + lIIlIlIll[42], kN.getPlane());
        lf = new WorldPoint(kN.getX() + lIIlIlIll[43], kN.getY() + lIIlIlIll[23], kN.getPlane());
        lg = new WorldPoint(kN.getX() + lIIlIlIll[43], kN.getY() + lIIlIlIll[11], kN.getPlane());
        lh = new WorldPoint(kN.getX() + lIIlIlIll[43], kN.getY() + lIIlIlIll[5], kN.getPlane());
        li = new WorldPoint(kO.getX() - lIIlIlIll[4], kO.getY(), kO.getPlane());
        lj = new WorldPoint(kP.getX() + lIIlIlIll[4], kP.getY(), kP.getPlane());
        lk = new WorldPoint(kQ.getX() - lIIlIlIll[4], kQ.getY(), kQ.getPlane());
        ll = new WorldPoint(kR.getX() + lIIlIlIll[4], kR.getY(), kR.getPlane());
        lm = new WorldPoint(kS.getX() - lIIlIlIll[4], kS.getY(), kS.getPlane());
        ln = new WorldPoint(kT.getX() + lIIlIlIll[4], kT.getY(), kT.getPlane());
        lo = new WorldPoint(kU.getX() - lIIlIlIll[4], kU.getY(), kU.getPlane());
        lp = new WorldPoint(kV.getX() + lIIlIlIll[4], kV.getY(), kV.getPlane());
        lq = new WorldPoint(kW.getX() - lIIlIlIll[4], kW.getY(), kW.getPlane());
        lr = new WorldPoint(kX.getX() + lIIlIlIll[4], kX.getY(), kX.getPlane());
        ls = new WorldPoint(kY.getX() - lIIlIlIll[4], kY.getY(), kY.getPlane());
        lt = new WorldPoint(kZ.getX() + lIIlIlIll[4], kZ.getY(), kZ.getPlane());
        lu = new WorldPoint(la.getX() - lIIlIlIll[4], la.getY(), la.getPlane());
        lv = new WorldPoint(lb.getX() + lIIlIlIll[4], lb.getY(), lb.getPlane());
        lw = new WorldPoint(lc.getX() - lIIlIlIll[4], lc.getY(), lc.getPlane());
        lx = new WorldPoint(ld.getX() + lIIlIlIll[4], ld.getY(), ld.getPlane());
        ly = new WorldPoint(le.getX() + lIIlIlIll[4], le.getY(), le.getPlane());
        lz = new WorldPoint(lf.getX() + lIIlIlIll[4], lf.getY(), lf.getPlane());
        lA = new WorldPoint(lg.getX() + lIIlIlIll[4], lg.getY(), lg.getPlane());
        lB = new WorldPoint(lh.getX() + lIIlIlIll[4], lh.getY(), lh.getPlane());
        System.out.println(lIIlIlIII[lIIlIlIll[125]]);
    }

    private static boolean lllllIlIIll(int i) {
        return i == 0;
    }

    private static boolean lllllIllIII(int i, int i2) {
        return i <= i2;
    }

    private static String llllIllIlII(String lIIIIlIIIlIlIll, String lIIIIlIIIlIlIlI) {
        String lIIIIlIIIlIlIll2 = new String(Base64.getDecoder().decode(lIIIIlIIIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIlIIIlIlIIl = new StringBuilder();
        char[] charArray = lIIIIlIIIlIlIlI.toCharArray();
        int lIIIIlIIIlIIlll = lIIlIlIll[0];
        char[] charArray2 = lIIIIlIIIlIlIll2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlIll[0];
        while (lllllIlIIlI(i, length)) {
            lIIIIlIIIlIlIIl.append((char) (charArray2[i] ^ charArray[lIIIIlIIIlIIlll % charArray.length]));
            "".length();
            lIIIIlIIIlIIlll++;
            i++;
            "".length();
            if ((-" ".length()) > ((52 ^ 40) & ((17 ^ 13) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(lIIIIlIIIlIlIIl);
    }
}
