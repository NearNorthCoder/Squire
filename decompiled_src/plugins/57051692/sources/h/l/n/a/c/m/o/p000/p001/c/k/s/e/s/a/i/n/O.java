package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.O  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/O.class */
public class O implements K {
    static /* synthetic */ WorldPoint ki;
    static /* synthetic */ WorldPoint jZ;
    static /* synthetic */ WorldPoint kd;
    static /* synthetic */ WorldPoint jW;
    static /* synthetic */ WorldPoint ko;
    static /* synthetic */ WorldPoint kp;
    static /* synthetic */ WorldPoint jF;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ String kr;
    static /* synthetic */ WorldPoint jG;
    static /* synthetic */ WorldPoint ke;
    public static /* synthetic */ int js;
    static /* synthetic */ WorldPoint jX;
    static /* synthetic */ WorldPoint jR;
    static /* synthetic */ WorldPoint jJ;
    static /* synthetic */ WorldPoint kl;
    static /* synthetic */ WorldPoint kc;
    static /* synthetic */ boolean jz;

    /* renamed from: h  reason: collision with root package name */
    static /* synthetic */ String f4h;
    static /* synthetic */ WorldPoint kf;
    static /* synthetic */ WorldPoint kb;
    static /* synthetic */ WorldPoint jT;
    static /* synthetic */ WorldPoint km;
    static /* synthetic */ WorldPoint kq;
    static /* synthetic */ WorldPoint jM;
    static /* synthetic */ WorldPoint kk;
    public static /* synthetic */ List<C0003d> bp;
    public static /* synthetic */ int jt;
    static /* synthetic */ WorldPoint kh;
    static /* synthetic */ WorldPoint jD;
    static /* synthetic */ WorldPoint jP;
    private static /* synthetic */ int[] lIllIIIIIl;
    static /* synthetic */ WorldPoint kg;
    static /* synthetic */ WorldPoint jY;
    static /* synthetic */ WorldPoint kj;
    static /* synthetic */ WorldPoint jV;
    static /* synthetic */ WorldPoint jE;
    public static /* synthetic */ int jy;
    static /* synthetic */ ArrayList<WorldPoint> jA;
    public static /* synthetic */ int jr;
    public static /* synthetic */ boolean cD;
    static /* synthetic */ WorldPoint jK;
    static /* synthetic */ WorldPoint jS;
    static /* synthetic */ WorldPoint jI;
    static /* synthetic */ WorldPoint jQ;
    static /* synthetic */ WorldPoint jN;
    static /* synthetic */ WorldPoint jL;
    static /* synthetic */ WorldPoint ka;
    static /* synthetic */ WorldPoint jH;
    static /* synthetic */ WorldPoint jO;
    static /* synthetic */ WorldPoint jU;
    static /* synthetic */ ArrayList<WorldPoint> jB;
    static /* synthetic */ WorldPoint kn;
    private static /* synthetic */ String[] lIlIllllII;
    static /* synthetic */ WorldPoint jC;

    private static boolean lIIlIllIIIllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v169, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v178, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v218, types: [boolean] */
    public static void cV() {
        if (lIIlIllIIIIII(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[0]];
            C0001b.a(bp);
            if (lIIlIllIIIIIl(bp.size(), lIllIIIIIl[1])) {
                System.out.println(lIlIllllII[lIllIIIIIl[1]]);
                bn = lIllIIIIIl[0];
            }
        }
        if (lIIlIllIIIIlI(bn ? 1 : 0) && lIIlIllIIIIIl(Skills.getLevel(Skill.FARMING), lIllIIIIIl[2])) {
            if (lIIlIllIIIIIl(Skills.getLevel(Skill.FARMING), lIllIIIIIl[3])) {
                kr = lIlIllllII[lIllIIIIIl[4]];
                C0017r.aU();
            }
            if (lIIlIllIIIIlI(al() ? 1 : 0) && lIIlIllIIIIll(Skills.getLevel(Skill.FARMING), lIllIIIIIl[3])) {
                kr = lIlIllllII[lIllIIIIIl[5]];
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIllIIIlII(nearest) && lIIlIllIIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[6]];
                    if (lIIlIllIIIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        Time.sleepTicks(lIllIIIIIl[6]);
                        "".length();
                        if (lIIlIllIIIIII(al() ? 1 : 0)) {
                            return;
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lIIlIllIIIlII(nearest) && lIIlIllIIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[7]];
                    if (lIIlIllIIIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllIIIIIl[8]);
                        "".length();
                    }
                    if (lIIlIllIIIIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIIlIllIIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllIIIIIl[1]);
                            "".length();
                        }
                        if (lIIlIllIIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllIIIIIl[4]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[lIllIIIIIl[1]];
                    iArr[lIllIIIIIl[0]] = lIllIIIIIl[9];
                    if (lIIlIllIIIIII(Bank.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIllIIIIIl[1]];
                        iArr2[lIllIIIIIl[0]] = lIllIIIIIl[9];
                        if (lIIlIllIIIIIl(Bank.getFirst(iArr2).getQuantity(), lIllIIIIIl[10])) {
                            O();
                            System.out.println(lIlIllllII[lIllIIIIIl[11]]);
                            bn = lIllIIIIIl[1];
                            return;
                        }
                    }
                    int[] iArr3 = new int[lIllIIIIIl[12]];
                    iArr3[lIllIIIIIl[0]] = lIllIIIIIl[13];
                    iArr3[lIllIIIIIl[1]] = lIllIIIIIl[14];
                    iArr3[lIllIIIIIl[4]] = lIllIIIIIl[15];
                    iArr3[lIllIIIIIl[5]] = lIllIIIIIl[16];
                    iArr3[lIllIIIIIl[6]] = lIllIIIIIl[17];
                    iArr3[lIllIIIIIl[7]] = lIllIIIIIl[18];
                    iArr3[lIllIIIIIl[11]] = lIllIIIIIl[19];
                    iArr3[lIllIIIIIl[20]] = lIllIIIIIl[21];
                    iArr3[lIllIIIIIl[22]] = lIllIIIIIl[9];
                    iArr3[lIllIIIIIl[23]] = lIllIIIIIl[24];
                    if (lIIlIllIIIIlI(C0004e.b(iArr3) ? 1 : 0)) {
                        O();
                        System.out.println(lIlIllllII[lIllIIIIIl[20]]);
                        bn = lIllIIIIIl[1];
                        return;
                    }
                    int[] iArr4 = new int[lIllIIIIIl[12]];
                    iArr4[lIllIIIIIl[0]] = lIllIIIIIl[13];
                    iArr4[lIllIIIIIl[1]] = lIllIIIIIl[14];
                    iArr4[lIllIIIIIl[4]] = lIllIIIIIl[15];
                    iArr4[lIllIIIIIl[5]] = lIllIIIIIl[16];
                    iArr4[lIllIIIIIl[6]] = lIllIIIIIl[17];
                    iArr4[lIllIIIIIl[7]] = lIllIIIIIl[18];
                    iArr4[lIllIIIIIl[11]] = lIllIIIIIl[19];
                    iArr4[lIllIIIIIl[20]] = lIllIIIIIl[21];
                    iArr4[lIllIIIIIl[22]] = lIllIIIIIl[9];
                    iArr4[lIllIIIIIl[23]] = lIllIIIIIl[24];
                    if (lIIlIllIIIIII(C0004e.b(iArr4) ? 1 : 0)) {
                        C0000a.a(lIllIIIIIl[25], lIllIIIIIl[1]);
                        C0000a.a(lIllIIIIIl[26], lIllIIIIIl[1]);
                        C0000a.a(lIllIIIIIl[27], lIllIIIIIl[1]);
                        C0000a.a(lIllIIIIIl[28], lIllIIIIIl[1]);
                        C0000a.a(lIllIIIIIl[29], lIllIIIIIl[1]);
                        C0000a.a(lIllIIIIIl[30], lIllIIIIIl[1]);
                        C0000a.a(lIllIIIIIl[31], lIllIIIIIl[1]);
                        int[] iArr5 = new int[lIllIIIIIl[1]];
                        iArr5[lIllIIIIIl[0]] = lIllIIIIIl[25];
                        if (lIIlIllIIIIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIllIIIIIl[1]];
                            iArr6[lIllIIIIIl[0]] = lIllIIIIIl[25];
                            if (lIIlIllIIIIlI(Equipment.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[lIllIIIIIl[1]];
                                iArr7[lIllIIIIIl[0]] = lIllIIIIIl[25];
                                if (lIIlIllIIIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                                    C0000a.a(lIllIIIIIl[32], lIllIIIIIl[1]);
                                }
                            }
                        }
                        C0000a.a(lIllIIIIIl[17], lIllIIIIIl[1]);
                        C0004e.l(lIllIIIIIl[25]);
                        C0004e.l(lIllIIIIIl[26]);
                        C0004e.l(lIllIIIIIl[27]);
                        C0004e.l(lIllIIIIIl[28]);
                        C0004e.l(lIllIIIIIl[29]);
                        Time.sleepTicks(lIllIIIIIl[1]);
                        "".length();
                        C0004e.l(lIllIIIIIl[31]);
                        C0004e.l(lIllIIIIIl[33]);
                        C0004e.l(lIllIIIIIl[30]);
                        C0004e.l(lIllIIIIIl[32]);
                        C0004e.l(lIllIIIIIl[17]);
                        Time.sleepTicks(lIllIIIIIl[5]);
                        "".length();
                        if (lIIlIllIIIIlI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIllIIIIIl[11]);
                            "".length();
                        }
                        if (lIIlIllIIIIII(Bank.isOpen() ? 1 : 0)) {
                            if (lIIlIllIIIIIl(Skills.getLevel(Skill.FARMING), lIllIIIIIl[3])) {
                                C0000a.a(lIllIIIIIl[13], lIllIIIIIl[12]);
                                C0000a.a(lIllIIIIIl[14], lIllIIIIIl[12]);
                                C0000a.a(lIllIIIIIl[19], lIllIIIIIl[12]);
                                C0000a.a(lIllIIIIIl[15], lIllIIIIIl[12]);
                                C0000a.b(C0005f.be, lIllIIIIIl[1]);
                                C0000a.b(C0005f.aN, lIllIIIIIl[1]);
                                C0000a.a(lIllIIIIIl[18], lIllIIIIIl[7]);
                                C0000a.a(lIllIIIIIl[21], lIllIIIIIl[34]);
                            }
                            if (lIIlIllIIIIll(Skills.getLevel(Skill.FARMING), lIllIIIIIl[3])) {
                                C0000a.a(lIllIIIIIl[9], lIllIIIIIl[35]);
                                C0000a.a(lIllIIIIIl[36], lIllIIIIIl[1]);
                                C0000a.a(lIllIIIIIl[24], lIllIIIIIl[1]);
                            }
                        }
                    }
                }
            }
            if (lIIlIllIIIIII(al() ? 1 : 0)) {
                String[] strArr = new String[lIllIIIIIl[1]];
                strArr[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[22]];
                if (lIIlIllIIIIII(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIllIIIIIl[1]];
                    strArr2[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[23]];
                    Inventory.getFirst(strArr2).interact(lIlIllllII[lIllIIIIIl[12]]);
                }
                if (lIIlIllIIIIII(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIlIllIIIIIl(Movement.getRunEnergy(), lIllIIIIIl[37])) {
                    Inventory.getFirst(C0005f.aU).interact(lIlIllllII[lIllIIIIIl[38]]);
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                }
                if (lIIlIllIIIllI(Movement.getRunEnergy(), lIllIIIIIl[39]) && lIIlIllIIIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lIIlIllIIIIll(Skills.getLevel(Skill.FARMING), lIllIIIIIl[3])) {
                    cW();
                }
            }
        }
    }

    private static boolean lIIlIllIIIIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01bb, code lost:
        if (lIIlIllIIIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.O.lIllIIIIIl[10]) != false) goto L46;
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
    public static void O() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8 = new int[lIllIIIIIl[1]];
        iArr8[lIllIIIIIl[0]] = lIllIIIIIl[16];
        if (lIIlIllIIIIlI(Bank.contains(iArr8) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIIIl[16], lIllIIIIIl[1], lIllIIIIIl[134]));
            "".length();
        }
        int[] iArr9 = new int[lIllIIIIIl[1]];
        iArr9[lIllIIIIIl[0]] = lIllIIIIIl[17];
        if (lIIlIllIIIIlI(Bank.contains(iArr9) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIIIl[17], lIllIIIIIl[4], lIllIIIIIl[135]));
            "".length();
        }
        int[] iArr10 = new int[lIllIIIIIl[1]];
        iArr10[lIllIIIIIl[0]] = lIllIIIIIl[31];
        if (lIIlIllIIIIlI(Bank.contains(iArr10) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIIIl[31], lIllIIIIIl[1], lIllIIIIIl[135]));
            "".length();
        }
        int[] iArr11 = new int[lIllIIIIIl[1]];
        iArr11[lIllIIIIIl[0]] = lIllIIIIIl[36];
        if (lIIlIllIIIIlI(Bank.contains(iArr11) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIIIl[36], lIllIIIIIl[1], lIllIIIIIl[135]));
            "".length();
        }
        int[] iArr12 = new int[lIllIIIIIl[1]];
        iArr12[lIllIIIIIl[0]] = lIllIIIIIl[24];
        if (lIIlIllIIIIlI(Bank.contains(iArr12) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIIIl[24], lIllIIIIIl[1], lIllIIIIIl[135]));
            "".length();
        }
        int[] iArr13 = new int[lIllIIIIIl[1]];
        iArr13[lIllIIIIIl[0]] = lIllIIIIIl[9];
        if (lIIlIllIIIIII(Bank.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIllIIIIIl[1]];
            iArr14[lIllIIIIIl[0]] = lIllIIIIIl[9];
            if (lIIlIllIIIIII(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIllIIIIIl[1]];
                iArr15[lIllIIIIIl[0]] = lIllIIIIIl[9];
            }
            iArr = new int[lIllIIIIIl[1]];
            iArr[lIllIIIIIl[0]] = lIllIIIIIl[13];
            if (lIIlIllIIIIlI(Bank.contains(iArr) ? 1 : 0)) {
                bp.add(new C0003d(lIllIIIIIl[13], lIllIIIIIl[12], lIllIIIIIl[137]));
                "".length();
            }
            iArr2 = new int[lIllIIIIIl[1]];
            iArr2[lIllIIIIIl[0]] = lIllIIIIIl[19];
            if (lIIlIllIIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                bp.add(new C0003d(lIllIIIIIl[19], lIllIIIIIl[12], lIllIIIIIl[138]));
                "".length();
            }
            iArr3 = new int[lIllIIIIIl[1]];
            iArr3[lIllIIIIIl[0]] = lIllIIIIIl[15];
            if (lIIlIllIIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                bp.add(new C0003d(lIllIIIIIl[15], lIllIIIIIl[12], lIllIIIIIl[138]));
                "".length();
            }
            iArr4 = new int[lIllIIIIIl[1]];
            iArr4[lIllIIIIIl[0]] = lIllIIIIIl[14];
            if (lIIlIllIIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                bp.add(new C0003d(lIllIIIIIl[14], lIllIIIIIl[12], lIllIIIIIl[138]));
                "".length();
            }
            iArr5 = new int[lIllIIIIIl[1]];
            iArr5[lIllIIIIIl[0]] = lIllIIIIIl[21];
            if (lIIlIllIIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                bp.add(new C0003d(js, lIllIIIIIl[68], lIllIIIIIl[139]));
                "".length();
            }
            iArr6 = new int[lIllIIIIIl[1]];
            iArr6[lIllIIIIIl[0]] = lIllIIIIIl[140];
            if (lIIlIllIIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                bp.add(new C0003d(lIllIIIIIl[140], lIllIIIIIl[1], lIllIIIIIl[141]));
                "".length();
            }
            iArr7 = new int[lIllIIIIIl[1]];
            iArr7[lIllIIIIIl[0]] = lIllIIIIIl[18];
            if (lIIlIllIIIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                return;
            }
            bp.add(new C0003d(lIllIIIIIl[18], lIllIIIIIl[47], C0009j.bZ));
            "".length();
            return;
        }
        bp.add(new C0003d(lIllIIIIIl[9], lIllIIIIIl[10], lIllIIIIIl[136]));
        "".length();
        iArr = new int[lIllIIIIIl[1]];
        iArr[lIllIIIIIl[0]] = lIllIIIIIl[13];
        if (lIIlIllIIIIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIllIIIIIl[1]];
        iArr2[lIllIIIIIl[0]] = lIllIIIIIl[19];
        if (lIIlIllIIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIllIIIIIl[1]];
        iArr3[lIllIIIIIl[0]] = lIllIIIIIl[15];
        if (lIIlIllIIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIllIIIIIl[1]];
        iArr4[lIllIIIIIl[0]] = lIllIIIIIl[14];
        if (lIIlIllIIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIllIIIIIl[1]];
        iArr5[lIllIIIIIl[0]] = lIllIIIIIl[21];
        if (lIIlIllIIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIllIIIIIl[1]];
        iArr6[lIllIIIIIl[0]] = lIllIIIIIl[140];
        if (lIIlIllIIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIllIIIIIl[1]];
        iArr7[lIllIIIIIl[0]] = lIllIIIIIl[18];
        if (lIIlIllIIIIlI(Bank.contains(iArr7) ? 1 : 0)) {
        }
    }

    private static void lIIlIlIlIlIlI() {
        lIlIllllII = new String[lIllIIIIIl[250]];
        lIlIllllII[lIllIIIIIl[0]] = lIIlIlIIlIIII("cR8llWWc/uZ2Q60Yp22onw==", "VKVsP");
        lIlIllllII[lIllIIIIIl[1]] = lIIlIlIIlIIIl("wOKHSmObNcn05sqTy+7n87VZtS/Ipm7MkSE91j3y+20HacC+v1p/1DMQYH98q13N7wzaaR1i9J0=", "ZErkW");
        lIlIllllII[lIllIIIIIl[4]] = lIIlIlIIlIIIl("KvpEtxBYx3ix+HqyAjnEnQ==", "pvvUu");
        lIlIllllII[lIllIIIIIl[5]] = lIIlIlIIlIIIl("Z9/S8vOb7ME=", "wYEVo");
        lIlIllllII[lIllIIIIIl[6]] = lIIlIlIIlIIIl("WCc0elhheJD1bhQiflllPiEaS5KK1yRT", "vyRRw");
        lIlIllllII[lIllIIIIIl[7]] = lIIlIlIIlIIlI("LCwhEQMNIyhVDQUjJBwBAw==", "dMOuo");
        lIlIllllII[lIllIIIIIl[11]] = lIIlIlIIlIIII("xhJPgJZnGgm1fL6zMOLDD7U6r8IMeJNyzAPSY/VOkpRIXazUkk2h8EUCSNcXj27Cic4Lo4vCH7o=", "KJlsh");
        lIlIllllII[lIllIIIIIl[20]] = lIIlIlIIlIIIl("OcGFn2wY8OHqovLqZhB2cf/NUZU43LvAJ899wbQb+H0JUoBO8WwiEtSo5GY1lkTltltk8UXzEKg=", "qoDnI");
        lIlIllllII[lIllIIIIIl[22]] = lIIlIlIIlIIII("aj8uzPf5yH8=", "ZnlWY");
        lIlIllllII[lIllIIIIIl[23]] = lIIlIlIIlIIIl("Er2ipc0MvY4=", "HTHZY");
        lIlIllllII[lIllIIIIIl[12]] = lIIlIlIIlIIII("BbjFPJnqCmY=", "nKbkR");
        lIlIllllII[lIllIIIIIl[38]] = lIIlIlIIlIIlI("IhUjPww=", "fgJQg");
        lIlIllllII[lIllIIIIIl[35]] = lIIlIlIIlIIlI("FxA1ciY2UTA3Nz1RNzMwNRQ=", "YqCRR");
        lIlIllllII[lIllIIIIIl[42]] = lIIlIlIIlIIII("pSmzCi9T5R4Y0q+xgAMVS+XRiUQQeBrWUJwf/8+mfZ8=", "sSztx");
        lIlIllllII[lIllIIIIIl[43]] = lIIlIlIIlIIII("fFy7HwGEmi1h+v9TXioH1C9GtRtJIwpa", "WhPxC");
        lIlIllllII[lIllIIIIIl[34]] = lIIlIlIIlIIIl("A+RKEETS5Bc=", "qXtNa");
        lIlIllllII[lIllIIIIIl[44]] = lIIlIlIIlIIII("XlrQclaphGi895N5305Rdg==", "Rhfsq");
        lIlIllllII[lIllIIIIIl[10]] = lIIlIlIIlIIlI("Ai4kJWMgIDk6", "DOVHC");
        lIlIllllII[lIllIIIIIl[45]] = lIIlIlIIlIIIl("mLzVw6N92JM=", "bGDqc");
        lIlIllllII[lIllIIIIIl[46]] = lIIlIlIIlIIIl("6Wuot956xNJhKX2B2liFJA==", "uoMfr");
        lIlIllllII[lIllIIIIIl[47]] = lIIlIlIIlIIIl("35l4SYKorptBjrHB1tPLkQ==", "SOQLk");
        lIlIllllII[lIllIIIIIl[48]] = lIIlIlIIlIIlI("NgYmES8N", "ecGcL");
        lIlIllllII[lIllIIIIIl[50]] = lIIlIlIIlIIlI("Iw4lGAcODy1ZAgoEJllZAwQ0HB1PVnZQ", "oaByq");
        lIlIllllII[lIllIIIIIl[52]] = lIIlIlIIlIIlI("FwEKIwI0AAlsFjALAmxNOQsQKQl1W1Jl", "UnfLe");
        lIlIllllII[lIllIIIIIl[53]] = lIIlIlIIlIIIl("fvF3WO35QsaciBvMP6HVgI9n3ELhOjPAQBG/cs7VIwo=", "goFrn");
        lIlIllllII[lIllIIIIIl[39]] = lIIlIlIIlIIII("oZyKv6FjCMEkMbTWNZ0v9Y32jk7b9SwM", "DEyeb");
        lIlIllllII[lIllIIIIIl[55]] = lIIlIlIIlIIlI("BxM/AEwlHSIf", "ArMml");
        lIlIllllII[lIllIIIIIl[56]] = lIIlIlIIlIIII("zNkcUQ3Gs5Y=", "wNyIc");
        lIlIllllII[lIllIIIIIl[57]] = lIIlIlIIlIIIl("J+38xRxAe8jjgSjmu0tA2uIHTOifaAaH4v3ZMewdGcN3Vqn5uTBMYdRLNAbbH4N6", "KBSiW");
        lIlIllllII[lIllIIIIIl[58]] = lIIlIlIIlIIIl("KkysIxtz5XcP6MkcGhDtVQ==", "swlcr");
        lIlIllllII[lIllIIIIIl[59]] = lIIlIlIIlIIlI("IisXF0cAJQoI", "dJezg");
        lIlIllllII[lIllIIIIIl[60]] = lIIlIlIIlIIIl("R+D/rX4gBtk+B1sdnlfV6w==", "iOidF");
        lIlIllllII[lIllIIIIIl[61]] = lIIlIlIIlIIlI("HAsZbxUpFlYpAScJVi4dKwwZPV9oFhM8FjwQHyEUaA0YPAcpChUq", "HdvOs");
        lIlIllllII[lIllIIIIIl[62]] = lIIlIlIIlIIlI("Iz4kKC8ZLHYvKFctJDMvA2s0IyAYOTNmIw8iIi8oEA==", "wKVFF");
        lIlIllllII[lIllIIIIIl[3]] = lIIlIlIIlIIIl("CavKlShjMU7sAbaOpYhAU6/1/8l+Irw7", "SGzDk");
        lIlIllllII[lIllIIIIIl[63]] = lIIlIlIIlIIlI("My0zKgUePA==", "wHCEv");
        lIlIllllII[lIllIIIIIl[64]] = lIIlIlIIlIIlI("KzUrFSIAKmIVIholJw==", "nMBaK");
        lIlIllllII[lIllIIIIIl[65]] = lIIlIlIIlIIII("5YTVW76Ej4ZHAfzMxDB31w==", "oOLdU");
        lIlIllllII[lIllIIIIIl[66]] = lIIlIlIIlIIII("1o7Yh8g+PUA=", "teWcO");
        lIlIllllII[lIllIIIIIl[67]] = lIIlIlIIlIIII("4vcf6Toqs7KMMGW0wMXZcM24fLO+MA3m", "NUVWe");
        lIlIllllII[lIllIIIIIl[68]] = lIIlIlIIlIIII("8LBcwVQtdbZ5PraYT69+vdH//L6iD8rY", "hYZga");
        lIlIllllII[lIllIIIIIl[70]] = lIIlIlIIlIIII("7iRfQPEyyP2I1wuFY/gpaw==", "ETbNw");
        lIlIllllII[lIllIIIIIl[71]] = lIIlIlIIlIIII("77cMUieNku1xDe3awzfLrg==", "nDhHG");
        lIlIllllII[lIllIIIIIl[72]] = lIIlIlIIlIIII("QQFUCnzv4vE=", "ceePP");
        lIlIllllII[lIllIIIIIl[73]] = lIIlIlIIlIIIl("FMPi1/lth24IA/JsTuvNIw==", "sCYDv");
        lIlIllllII[lIllIIIIIl[2]] = lIIlIlIIlIIlI("ADsOMyQ+NB0=", "WZzVV");
        lIlIllllII[lIllIIIIIl[74]] = lIIlIlIIlIIIl("qWU69vfZmlg=", "EQAqq");
        lIlIllllII[lIllIIIIIl[75]] = lIIlIlIIlIIII("c2k+LnbuycNhaizLsQD5Qw==", "DuKCn");
        lIlIllllII[lIllIIIIIl[76]] = lIIlIlIIlIIlI("GBs7AhAjDg==", "PzItu");
        lIlIllllII[lIllIIIIIl[77]] = lIIlIlIIlIIIl("so8tRJ1MPYGQZCjD6qSUGg==", "tsFhl");
        lIlIllllII[lIllIIIIIl[37]] = lIIlIlIIlIIII("ThrUxdSz7AzLYmArPpsGOQ==", "cCvTQ");
        lIlIllllII[lIllIIIIIl[78]] = lIIlIlIIlIIII("ppOmqSS5Iic=", "TLWeN");
        lIlIllllII[lIllIIIIIl[79]] = lIIlIlIIlIIIl("rBIwkNo+Vg2RZy3+klrjOQ==", "HkqBn");
        lIlIllllII[lIllIIIIIl[80]] = lIIlIlIIlIIIl("ZZEZI3sXGvI=", "EVqUv");
        lIlIllllII[lIllIIIIIl[51]] = lIIlIlIIlIIlI("PCwXBjwHOQwePg==", "tMepY");
        lIlIllllII[lIllIIIIIl[81]] = lIIlIlIIlIIIl("vc5oIeyaQV4=", "UytPs");
        lIlIllllII[lIllIIIIIl[82]] = lIIlIlIIlIIII("ephtcabr/btE1lVQNkWQg8RDOJlj85bU2DFgg4v8RJmaXhawa9VtXQ==", "siZHl");
        lIlIllllII[lIllIIIIIl[83]] = lIIlIlIIlIIII("ZNMs0kJ/7q4Gf2vyw2xBPZG7Hlfb2y7I", "RLqxN");
        lIlIllllII[lIllIIIIIl[85]] = lIIlIlIIlIIII("eK1iVGMqBbMZVU7f7Z2p3BgZdQGjcPcY", "nWWpo");
        lIlIllllII[lIllIIIIIl[86]] = lIIlIlIIlIIII("ss09xZito0E=", "fhYJy");
        lIlIllllII[lIllIIIIIl[87]] = lIIlIlIIlIIIl("uUBLfHSU70EYet94z2nN5TB30gTMjbaN", "loUiR");
        lIlIllllII[lIllIIIIIl[88]] = lIIlIlIIlIIII("WO79dDnUC03A78pz9b0EiQ==", "VTdVt");
        lIlIllllII[lIllIIIIIl[89]] = lIIlIlIIlIIIl("GrBuFIHGC+jIS7toTmN7ng==", "HNSUm");
        lIlIllllII[lIllIIIIIl[90]] = lIIlIlIIlIIlI("EwodCVcwBFEEFjYGUVA=", "Dkqbw");
        lIlIllllII[lIllIIIIIl[91]] = lIIlIlIIlIIlI("OQAoHBUAAi5SBwgeJFJT", "ilIra");
        lIlIllllII[lIllIIIIIl[92]] = lIIlIlIIlIIII("2vJECKQAUzb+OK7LFYL2qQ==", "eEwOI");
        lIlIllllII[lIllIIIIIl[93]] = lIIlIlIIlIIII("q/cZA8LBXsDnwVWU3OxBKA==", "nmfMj");
        lIlIllllII[lIllIIIIIl[94]] = lIIlIlIIlIIlI("LzQ9LlYMOnEjFwo4cXE=", "xUQEv");
        lIlIllllII[lIllIIIIIl[95]] = lIIlIlIIlIIIl("63J/3rVqoiP+WD03G7+naw==", "nrNsU");
        lIlIllllII[lIllIIIIIl[96]] = lIIlIlIIlIIlI("JQAqI20GDmYuLAAMZn0=", "raFHM");
        lIlIllllII[lIllIIIIIl[97]] = lIIlIlIIlIIlI("KSYRDRkQJBdDCxg4HUNY", "yJpcm");
        lIlIllllII[lIllIIIIIl[98]] = lIIlIlIIlIIIl("V87ylZqMztrB2ZClfOsphA==", "cSpbZ");
        lIlIllllII[lIllIIIIIl[99]] = lIIlIlIIlIIII("VeP+aFaxA0sZFJrFLGZHAA==", "DLqXj");
        lIlIllllII[lIllIIIIIl[100]] = lIIlIlIIlIIIl("fIvAGWHQKFtDTa9bSFYncQ==", "FWxcY");
        lIlIllllII[lIllIIIIIl[49]] = lIIlIlIIlIIlI("PxYDLA4GFAViHA4ID2JN", "ozbBz");
        lIlIllllII[lIllIIIIIl[101]] = lIIlIlIIlIIII("Lmr6t4ctgNYA+TjfJqzqEQ==", "VwzGq");
        lIlIllllII[lIllIIIIIl[102]] = lIIlIlIIlIIII("7m4YmKPvVP7wOHlmnrGzIg==", "VYbeK");
        lIlIllllII[lIllIIIIIl[103]] = lIIlIlIIlIIII("CszTvK25TpUZ/jSBukv6wA==", "GhcUr");
        lIlIllllII[lIllIIIIIl[104]] = lIIlIlIIlIIIl("PaUYN/C7EnLj0e4RPym8JQ==", "zOojY");
        lIlIllllII[lIllIIIIIl[105]] = lIIlIlIIlIIlI("FRg6Lm42FnYjLzAUdnR+", "ByVEN");
        lIlIllllII[lIllIIIIIl[106]] = lIIlIlIIlIIII("eWkqW+RgYVlCHpL2sEYY5e2bRcmk4S4t", "pDjMZ");
        lIlIllllII[lIllIIIIIl[107]] = lIIlIlIIlIIIl("JnKkYznDnK7ZJjY7dxUp+Q==", "SivsN");
        lIlIllllII[lIllIIIIIl[108]] = lIIlIlIIlIIII("6Id9SUlzMPltiiWjf1CJySdAl8tSkokH", "GJDYv");
        lIlIllllII[lIllIIIIIl[109]] = lIIlIlIIlIIII("s6SgfsuWBx68zf+nM18ePQ==", "YubFb");
        lIlIllllII[lIllIIIIIl[110]] = lIIlIlIIlIIIl("c159mSAuy4EHR+7gjkriY+4bx41W0hhv", "oQdyd");
        lIlIllllII[lIllIIIIIl[69]] = lIIlIlIIlIIII("EELKbS5W4gxYfTU7bNB0FQ==", "uVwnP");
        lIlIllllII[lIllIIIIIl[111]] = lIIlIlIIlIIIl("QMHku/+Vfx4WIiqrWcXncBX2qXG09n2j", "HGAhw");
        lIlIllllII[lIllIIIIIl[112]] = lIIlIlIIlIIII("MijxmyJnLuDkW2z5fRedRQ==", "eqMoL");
        lIlIllllII[lIllIIIIIl[32]] = lIIlIlIIlIIII("x/ChEk5qrEA7BHCXH+yJFghVTioc0HUQ", "iUyzs");
        lIlIllllII[lIllIIIIIl[113]] = lIIlIlIIlIIlI("JTsoP2QGNWQyJQA3ZGVx", "rZDTD");
        lIlIllllII[lIllIIIIIl[114]] = lIIlIlIIlIIII("evlVFyi9x7/wly4GKJgdsbYNqqFz6pZu", "XmpXv");
        lIlIllllII[lIllIIIIIl[115]] = lIIlIlIIlIIIl("nMnTf9NUpfwuf3RJIqAwLg==", "eJuCk");
        lIlIllllII[lIllIIIIIl[116]] = lIIlIlIIlIIlI("CS0UKy0wLxJlPzgzGGVobw==", "YAuEY");
        lIlIllllII[lIllIIIIIl[117]] = lIIlIlIIlIIIl("rbgGeFhlNhXBaiupCMewDA==", "oCmQs");
        lIlIllllII[lIllIIIIIl[118]] = lIIlIlIIlIIlI("IiUYDAwbJx5CHhM7FEJJRQ==", "rIybx");
        lIlIllllII[lIllIIIIIl[119]] = lIIlIlIIlIIII("PIB75IRx6017QVylxplbKQ==", "YeBzU");
        lIlIllllII[lIllIIIIIl[120]] = lIIlIlIIlIIlI("KgsGGjETCQBUIxsVClR0Qg==", "zggtE");
        lIlIllllII[lIllIIIIIl[121]] = lIIlIlIIlIIIl("X8EnU4rDgiC/daRTbZ9UBQ==", "BJiho");
        lIlIllllII[lIllIIIIIl[122]] = lIIlIlIIlIIIl("omeopXJsdDmLFCZacyT3DIhai8k5t5sn", "nrNaz");
        lIlIllllII[lIllIIIIIl[123]] = lIIlIlIIlIIIl("boOpOXTC4Z30qkdIzoH/7g==", "SQrzd");
        lIlIllllII[lIllIIIIIl[124]] = lIIlIlIIlIIII("YFfrUzO61W9xdOGrXlPuXy7I4XM+OE5P", "qtQeT");
        lIlIllllII[lIllIIIIIl[125]] = lIIlIlIIlIIIl("AdYoRas8r9rxTzL5Bq99TA==", "NmBeE");
        lIlIllllII[lIllIIIIIl[133]] = lIIlIlIIlIIII("vJ5bYIw6Guo=", "TUVZU");
        lIlIllllII[lIllIIIIIl[142]] = lIIlIlIIlIIIl("qfugTAhXdqnFm5VpfV4iRQ==", "xXirE");
        lIlIllllII[lIllIIIIIl[143]] = lIIlIlIIlIIII("GyJDltMVxOc=", "QQRPK");
        lIlIllllII[lIllIIIIIl[144]] = lIIlIlIIlIIIl("IvTt/3WQG+S4u2em9pSCwg==", "YYlNI");
        lIlIllllII[lIllIIIIIl[145]] = lIIlIlIIlIIII("V7791t98zYk=", "MThMc");
        lIlIllllII[lIllIIIIIl[146]] = lIIlIlIIlIIIl("gb8Eq1QLcDI=", "iprKS");
        lIlIllllII[lIllIIIIIl[147]] = lIIlIlIIlIIII("r/wmc2W07soCjZCITmgehg==", "MefWd");
        lIlIllllII[lIllIIIIIl[148]] = lIIlIlIIlIIII("4eH8y45domg=", "fwOMu");
        lIlIllllII[lIllIIIIIl[149]] = lIIlIlIIlIIII("eev78eMrC2Q=", "xWOhE");
        lIlIllllII[lIllIIIIIl[150]] = lIIlIlIIlIIIl("zsuQMhOP7Rsitr+5yu2U1Q==", "Cezjo");
        lIlIllllII[lIllIIIIIl[151]] = lIIlIlIIlIIII("WrYW26UHtb4=", "hcAEG");
        lIlIllllII[lIllIIIIIl[152]] = lIIlIlIIlIIIl("BRQLHEad1B0=", "fFbQV");
        lIlIllllII[lIllIIIIIl[153]] = lIIlIlIIlIIIl("unkFbO9N2epVpkQ8tJTZ4g==", "AOMpm");
        lIlIllllII[lIllIIIIIl[154]] = lIIlIlIIlIIII("ivRFngO0PGI=", "zfeII");
        lIlIllllII[lIllIIIIIl[155]] = lIIlIlIIlIIIl("Cq6ZFVXgFV4=", "opzMQ");
        lIlIllllII[lIllIIIIIl[156]] = lIIlIlIIlIIIl("5zsg6ogm9Whkw7/QfDLk7w==", "IruHx");
        lIlIllllII[lIllIIIIIl[157]] = lIIlIlIIlIIII("e4EHcaUdCBM=", "rvSHZ");
        lIlIllllII[lIllIIIIIl[158]] = lIIlIlIIlIIIl("a99P1TvqJ7A=", "YmYpC");
        lIlIllllII[lIllIIIIIl[159]] = lIIlIlIIlIIII("aKCh9LKbeo7f/oTrPdKpyQ==", "VWNPO");
        lIlIllllII[lIllIIIIIl[160]] = lIIlIlIIlIIlI("Nz0yFw==", "DXWst");
        lIlIllllII[lIllIIIIIl[161]] = lIIlIlIIlIIII("n92fnyMShJc=", "jTSAd");
        lIlIllllII[lIllIIIIIl[162]] = lIIlIlIIlIIIl("S+5/W854nPmFyXq0XZwamQ==", "QhJLc");
        lIlIllllII[lIllIIIIIl[163]] = lIIlIlIIlIIII("m7qftZksNA0=", "zXDzs");
        lIlIllllII[lIllIIIIIl[164]] = lIIlIlIIlIIlI("MhMfJQ==", "AvzAR");
        lIlIllllII[lIllIIIIIl[165]] = lIIlIlIIlIIlI("NiYOHiBCPxsCJgo=", "bOzvE");
        lIlIllllII[lIllIIIIIl[166]] = lIIlIlIIlIIII("Hfq7Vsp+kb0=", "EJXwM");
        lIlIllllII[lIllIIIIIl[167]] = lIIlIlIIlIIIl("Qb7wYgPYZ0E=", "zhFTk");
        lIlIllllII[lIllIIIIIl[168]] = lIIlIlIIlIIlI("NR8QIjVBBgU+Mwk=", "avdJP");
        lIlIllllII[lIllIIIIIl[169]] = lIIlIlIIlIIIl("4npkW5Bt71k=", "bEimB");
        lIlIllllII[lIllIIIIIl[170]] = lIIlIlIIlIIIl("LZj/sV2Ak58=", "rlEbJ");
        lIlIllllII[lIllIIIIIl[171]] = lIIlIlIIlIIlI("LSQdICpZPQg8LBE=", "yMiHO");
        lIlIllllII[lIllIIIIIl[172]] = lIIlIlIIlIIIl("eEvu4UycIq0=", "IKUqC");
        lIlIllllII[lIllIIIIIl[173]] = lIIlIlIIlIIIl("LlgesAbQ0fg=", "YkoeI");
        lIlIllllII[lIllIIIIIl[174]] = lIIlIlIIlIIII("Mx7CS+DMLeLj21kVxlvj9w==", "HIvNE");
        lIlIllllII[lIllIIIIIl[175]] = lIIlIlIIlIIIl("b9XLrbbaK74=", "ALPmG");
        lIlIllllII[lIllIIIIIl[176]] = lIIlIlIIlIIlI("IQYsDg==", "RcIjO");
        lIlIllllII[lIllIIIIIl[177]] = lIIlIlIIlIIII("XoZcCBKDCM0XLxABSw2+ZA==", "kBlMs");
        lIlIllllII[lIllIIIIIl[178]] = lIIlIlIIlIIII("hY9yEl1wrTU=", "KvUvR");
        lIlIllllII[lIllIIIIIl[179]] = lIIlIlIIlIIlI("CyYyEQ==", "xCWuP");
        lIlIllllII[lIllIIIIIl[180]] = lIIlIlIIlIIII("MH6F0oSIZEc49T0EFevnug==", "rpBbL");
        lIlIllllII[lIllIIIIIl[181]] = lIIlIlIIlIIlI("JzUXMg==", "TPrVx");
        lIlIllllII[lIllIIIIIl[182]] = lIIlIlIIlIIlI("Gh0WPQ==", "ixsYZ");
        lIlIllllII[lIllIIIIIl[183]] = lIIlIlIIlIIII("zpGf9aw7NNlnfzc4FVqtbg==", "xnzpl");
        lIlIllllII[lIllIIIIIl[184]] = lIIlIlIIlIIII("mU7yOd3/Hgk=", "pgfJA");
        lIlIllllII[lIllIIIIIl[185]] = lIIlIlIIlIIlI("IAkQLg==", "SluJs");
        lIlIllllII[lIllIIIIIl[186]] = lIIlIlIIlIIIl("28HuLz5eZ3CuzeDsQM9E4A==", "LFVWP");
        lIlIllllII[lIllIIIIIl[187]] = lIIlIlIIlIIlI("AyYVKw==", "pCpOx");
        lIlIllllII[lIllIIIIIl[188]] = lIIlIlIIlIIlI("FBwkLQ==", "gyAIT");
        lIlIllllII[lIllIIIIIl[189]] = lIIlIlIIlIIlI("OAghEhZMETQOEAQ=", "laUzs");
        lIlIllllII[lIllIIIIIl[190]] = lIIlIlIIlIIlI("BQwoDA==", "viMhk");
        lIlIllllII[lIllIIIIIl[191]] = lIIlIlIIlIIlI("OiwhNg==", "IIDRZ");
        lIlIllllII[lIllIIIIIl[192]] = lIIlIlIIlIIII("CRKtmHk7ElUmjeU6swiSbw==", "hpChc");
        lIlIllllII[lIllIIIIIl[193]] = lIIlIlIIlIIIl("7cTQYnhEqjQ=", "DDFcQ");
        lIlIllllII[lIllIIIIIl[194]] = lIIlIlIIlIIlI("OjIrCA==", "IWNlA");
        lIlIllllII[lIllIIIIIl[195]] = lIIlIlIIlIIlI("BCY7OS5wPy4lKDg=", "POOQK");
        lIlIllllII[lIllIIIIIl[196]] = lIIlIlIIlIIIl("6Xvpl8uHXgc=", "imkEj");
        lIlIllllII[lIllIIIIIl[197]] = lIIlIlIIlIIlI("JR8WLA==", "VzsHH");
        lIlIllllII[lIllIIIIIl[198]] = lIIlIlIIlIIlI("PS8xIixJNiQ+KgE=", "iFEJI");
        lIlIllllII[lIllIIIIIl[199]] = lIIlIlIIlIIIl("bY3S/mmQWQY=", "zHvHZ");
        lIlIllllII[lIllIIIIIl[200]] = lIIlIlIIlIIIl("3Juqf/dpCDc=", "CWJCc");
        lIlIllllII[lIllIIIIIl[201]] = lIIlIlIIlIIII("oIkyfbyRz8TShXURpr09rA==", "HxyWF");
        lIlIllllII[lIllIIIIIl[202]] = lIIlIlIIlIIII("JI08EHhrtzI=", "CBDtd");
        lIlIllllII[lIllIIIIIl[203]] = lIIlIlIIlIIIl("VqBIka5sJUQ=", "OILwG");
        lIlIllllII[lIllIIIIIl[204]] = lIIlIlIIlIIII("gaOr5/TFP5Q=", "iqqvt");
        lIlIllllII[lIllIIIIIl[205]] = lIIlIlIIlIIIl("Hz+PCna0MX7fFw6FiFnpFw==", "APULD");
        lIlIllllII[lIllIIIIIl[206]] = lIIlIlIIlIIII("WbyRe/Z3UVg=", "gjLAq");
        lIlIllllII[lIllIIIIIl[207]] = lIIlIlIIlIIIl("Ej3DCTek+2I=", "KkTZR");
        lIlIllllII[lIllIIIIIl[208]] = lIIlIlIIlIIlI("AhUrFyAYHik=", "qpNsL");
        lIlIllllII[lIllIIIIIl[209]] = lIIlIlIIlIIII("4l9YrC39Qhw=", "aoZOL");
        lIlIllllII[lIllIIIIIl[210]] = lIIlIlIIlIIII("W5WgaMghY0k=", "iVgXC");
        lIlIllllII[lIllIIIIIl[211]] = lIIlIlIIlIIII("NOxbXcKwAS0=", "bhKeL");
        lIlIllllII[lIllIIIIIl[212]] = lIIlIlIIlIIII("nzcfg1qSJXs=", "QLaET");
        lIlIllllII[lIllIIIIIl[213]] = lIIlIlIIlIIlI("MCoeUQ==", "SKpyX");
        lIlIllllII[lIllIIIIIl[214]] = lIIlIlIIlIIIl("Hfd2KpLGR7vds++sZGJzpA==", "abROM");
        lIlIllllII[lIllIIIIIl[215]] = lIIlIlIIlIIlI("ISoRIRA=", "QFpOd");
        lIlIllllII[lIllIIIIIl[216]] = lIIlIlIIlIIIl("jrNI9P54Ig8=", "copVj");
        lIlIllllII[lIllIIIIIl[217]] = lIIlIlIIlIIIl("OMeBvC5EXUw=", "OqdGf");
        lIlIllllII[lIllIIIIIl[218]] = lIIlIlIIlIIII("Jze4D+arCC6TfY9KzcbtBg==", "jodKt");
        lIlIllllII[lIllIIIIIl[219]] = lIIlIlIIlIIlI("Gy83GiU=", "kCVtQ");
        lIlIllllII[lIllIIIIIl[220]] = lIIlIlIIlIIIl("ceANaL/ebY4=", "hnKpN");
        lIlIllllII[lIllIIIIIl[221]] = lIIlIlIIlIIII("kAQMisZLnVc=", "wMcmB");
        lIlIllllII[lIllIIIIIl[222]] = lIIlIlIIlIIII("aQCi3He9Lp8=", "fJlIu");
        lIlIllllII[lIllIIIIIl[223]] = lIIlIlIIlIIII("t2oDG9OV+YNTifGFjypSqA==", "aRJJs");
        lIlIllllII[lIllIIIIIl[224]] = lIIlIlIIlIIII("dEcnN2Qv7gg=", "yvqTj");
        lIlIllllII[lIllIIIIIl[225]] = lIIlIlIIlIIIl("3bkby+C5f6c=", "IJOEH");
        lIlIllllII[lIllIIIIIl[226]] = lIIlIlIIlIIII("9/u0/WcV8tk=", "cpTYj");
        lIlIllllII[lIllIIIIIl[227]] = lIIlIlIIlIIlI("MxE6Ww==", "PpTsk");
        lIlIllllII[lIllIIIIIl[228]] = lIIlIlIIlIIlI("CgMLPAUQCAk=", "yfnXi");
        lIlIllllII[lIllIIIIIl[229]] = lIIlIlIIlIIlI("MwMnKSI=", "CoFGV");
        lIlIllllII[lIllIIIIIl[230]] = lIIlIlIIlIIII("E+Rm9pa/h2M=", "ddLyL");
        lIlIllllII[lIllIIIIIl[231]] = lIIlIlIIlIIlI("MBQHHyALAQ==", "xuuiE");
        lIlIllllII[lIllIIIIIl[232]] = lIIlIlIIlIIIl("FArnj65Bx+nRxKAWekm7WQ==", "JSHiC");
        lIlIllllII[lIllIIIIIl[233]] = lIIlIlIIlIIlI("PSYKBQ==", "NCoan");
        lIlIllllII[lIllIIIIIl[234]] = lIIlIlIIlIIIl("aIjgzEZ1b/c=", "YgIuh");
        lIlIllllII[lIllIIIIIl[235]] = lIIlIlIIlIIlI("FC0qNhA=", "dAKXd");
        lIlIllllII[lIllIIIIIl[236]] = lIIlIlIIlIIII("78CFt7XwRrg=", "nQlAD");
        lIlIllllII[lIllIIIIIl[237]] = lIIlIlIIlIIIl("4COhihEjkQo=", "QPNZj");
        lIlIllllII[lIllIIIIIl[238]] = lIIlIlIIlIIIl("QCQb7VhFWWtiCyKFQ8KG0g==", "UEiEE");
        lIlIllllII[lIllIIIIIl[239]] = lIIlIlIIlIIlI("KQcHBwE=", "Ournu");
        lIlIllllII[lIllIIIIIl[240]] = lIIlIlIIlIIII("PWQolHYzGCE=", "OcFNO");
        lIlIllllII[lIllIIIIIl[241]] = lIIlIlIIlIIII("Ea034laaUf0=", "vPQko");
        lIlIllllII[lIllIIIIIl[242]] = lIIlIlIIlIIIl("Ca/9ZanUX04=", "cfQOs");
        lIlIllllII[lIllIIIIIl[243]] = lIIlIlIIlIIlI("Cho/ECE=", "lhJyU");
        lIlIllllII[lIllIIIIIl[244]] = lIIlIlIIlIIII("to6I0Tvau4U=", "ZMOSx");
        lIlIllllII[lIllIIIIIl[245]] = lIIlIlIIlIIlI("KjYRBCAHJw==", "nSakS");
        lIlIllllII[lIllIIIIIl[246]] = lIIlIlIIlIIIl("z4voypJ0dgc=", "qLDae");
        lIlIllllII[lIllIIIIIl[248]] = lIIlIlIIlIIlI("", "yFBMs");
        lIlIllllII[lIllIIIIIl[249]] = lIIlIlIIlIIlI("NgIYPx0eBEo=", "pcjRt");
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return f4h + kr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v179, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    private static void cW() {
        if (lIIlIllIIIIlI(db() ? 1 : 0)) {
            WorldPoint worldPoint = new WorldPoint(lIllIIIIIl[40], lIllIIIIIl[41], lIllIIIIIl[0]);
            if (lIIlIllIIIIlI(da() ? 1 : 0) && lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[35]];
                if (lIIlIllIIIIII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                try {
                    C0004e.a(worldPoint);
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIIII(da() ? 1 : 0)) {
                if (lIIlIllIIIIII(Inventory.contains(item -> {
                    return item.getName().contains(lIlIllllII[lIllIIIIIl[246]]);
                }) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[42]];
                    TileObject nearest = TileObjects.getNearest(tileObject -> {
                        if (lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[244]]) ? 1 : 0)) {
                            String[] strArr = new String[lIllIIIIIl[1]];
                            strArr[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[245]];
                            if (lIIlIllIIIIII(tileObject.hasAction(strArr) ? 1 : 0)) {
                                ?? r0 = lIllIIIIIl[1];
                                "".length();
                                return 0 != 0 ? ((58 ^ 88) ^ (30 ^ 45)) & (((191 ^ 197) ^ (135 ^ 172)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lIllIIIIIl[0];
                    });
                    if (lIIlIllIIIlII(nearest)) {
                        AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[43]];
                        nearest.interact(lIlIllllII[lIllIIIIIl[34]]);
                        Time.sleepTicks(lIllIIIIIl[5]);
                        "".length();
                    }
                }
                if (lIIlIllIIIIlI(Inventory.contains(item2 -> {
                    return item2.getName().contains(lIlIllllII[lIllIIIIIl[243]]);
                }) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[44]];
                    String[] strArr = new String[lIllIIIIIl[1]];
                    strArr[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[10]];
                    TileObjects.getNearest(strArr).interact(lIlIllllII[lIllIIIIIl[45]]);
                    Time.sleepTicks(lIllIIIIIl[4]);
                    "".length();
                }
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[46]];
                if (lIIlIllIIIIlI(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr2 = new String[lIllIIIIIl[1]];
                    strArr2[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[47]];
                    TileObjects.getNearest(strArr2).interact(lIlIllllII[lIllIIIIIl[48]]);
                    Time.sleepTicks(lIllIIIIIl[4]);
                    "".length();
                }
                if (lIIlIllIIIIll(Skills.getLevel(Skill.FARMING), lIllIIIIIl[49])) {
                    String[] strArr3 = new String[lIllIIIIIl[1]];
                    strArr3[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[50]];
                    C0006g.a(strArr3);
                }
                if (lIIlIllIIIIll(Skills.getLevel(Skill.FARMING), lIllIIIIIl[51]) && lIIlIllIIIIIl(Skills.getLevel(Skill.FARMING), lIllIIIIIl[49])) {
                    String[] strArr4 = new String[lIllIIIIIl[1]];
                    strArr4[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[52]];
                    C0006g.a(strArr4);
                }
                if (lIIlIllIIIIIl(Skills.getLevel(Skill.FARMING), lIllIIIIIl[51])) {
                    String[] strArr5 = new String[lIllIIIIIl[1]];
                    strArr5[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[53]];
                    C0006g.a(strArr5);
                }
                if (lIIlIllIIIIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.enterAmount(lIllIIIIIl[54]);
                    Time.sleepTicks(lIllIIIIIl[6]);
                    "".length();
                }
            }
        }
        if (lIIlIllIIIIII(db() ? 1 : 0)) {
            if (lIIlIllIIIIlI(da() ? 1 : 0)) {
                jC = null;
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[39]];
                if (lIIlIllIIIIlI(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr6 = new String[lIllIIIIIl[1]];
                    strArr6[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[55]];
                    TileObjects.getNearest(strArr6).interact(lIlIllllII[lIllIIIIIl[56]]);
                    Time.sleepTicks(lIllIIIIIl[4]);
                    "".length();
                }
                String[] strArr7 = new String[lIllIIIIIl[1]];
                strArr7[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[57]];
                C0006g.a(strArr7);
            }
            if (lIIlIllIIIIII(da() ? 1 : 0)) {
                String[] strArr8 = new String[lIllIIIIIl[1]];
                strArr8[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[58]];
                if (lIIlIllIIIlII(TileObjects.getNearest(strArr8))) {
                    String[] strArr9 = new String[lIllIIIIIl[1]];
                    strArr9[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[59]];
                    jC = TileObjects.getNearest(strArr9).getWorldLocation();
                    cZ();
                }
                if (lIIlIllIIIlII(jC)) {
                    String[] strArr10 = new String[lIllIIIIIl[1]];
                    strArr10[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[60]];
                    if (lIIlIllIIIIII(TileObjects.getNearest(strArr10).getWorldLocation().equals(jC) ? 1 : 0)) {
                        if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jC), lIllIIIIIl[37])) {
                            AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[61]];
                            if (lIIlIllIIIIII(Inventory.contains(item3 -> {
                                return item3.getName().contains(lIlIllllII[lIllIIIIIl[242]]);
                            }) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[62]];
                                TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                                    if (lIIlIllIIIIII(tileObject2.getName().contains(lIlIllllII[lIllIIIIIl[240]]) ? 1 : 0)) {
                                        String[] strArr11 = new String[lIllIIIIIl[1]];
                                        strArr11[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[241]];
                                        if (lIIlIllIIIIII(tileObject2.hasAction(strArr11) ? 1 : 0)) {
                                            ?? r0 = lIllIIIIIl[1];
                                            "".length();
                                            return (-" ".length()) >= "   ".length() ? ((142 ^ 193) ^ (114 ^ 26)) & (((194 ^ 138) ^ (50 ^ 93)) ^ (-" ".length())) : r0;
                                        }
                                    }
                                    return lIllIIIIIl[0];
                                });
                                if (lIIlIllIIIlII(nearest2)) {
                                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[3]];
                                    nearest2.interact(lIlIllllII[lIllIIIIIl[63]]);
                                    Time.sleepTicks(lIllIIIIIl[5]);
                                    "".length();
                                }
                            }
                            if (lIIlIllIIIIlI(Inventory.contains(item4 -> {
                                return item4.getName().contains(lIlIllllII[lIllIIIIIl[239]]);
                            }) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[64]];
                                String[] strArr11 = new String[lIllIIIIIl[1]];
                                strArr11[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[65]];
                                TileObjects.getNearest(strArr11).interact(lIlIllllII[lIllIIIIIl[66]]);
                                Time.sleepTicks(lIllIIIIIl[4]);
                                "".length();
                            }
                        }
                        if (lIIlIllIIIIlI(dc() ? 1 : 0) && lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jC), lIllIIIIIl[37])) {
                            TileObject nearest3 = TileObjects.getNearest(tileObject3 -> {
                                return tileObject3.getName().contains(lIlIllllII[lIllIIIIIl[238]]);
                            });
                            TileObject nearest4 = TileObjects.getNearest(tileObject4 -> {
                                return tileObject4.getName().contains(lIlIllllII[lIllIIIIIl[237]]);
                            });
                            if (lIIlIllIIlIII(nearest3) && lIIlIllIIlIII(nearest4)) {
                                if (lIIlIllIIIIlI(Movement.isRunEnabled() ? 1 : 0) && lIIlIllIIIllI(Movement.getRunEnergy(), lIllIIIIIl[47])) {
                                    Movement.toggleRun();
                                    Time.sleepTicks(lIllIIIIIl[7]);
                                    "".length();
                                }
                                int[] iArr = new int[lIllIIIIIl[1]];
                                iArr[lIllIIIIIl[0]] = lIllIIIIIl[9];
                                if (lIIlIllIIIIII(Inventory.contains(iArr) ? 1 : 0)) {
                                    TileObject nearest5 = TileObjects.getNearest(tileObject5 -> {
                                        if (lIIlIllIIIIII(tileObject5.getName().contains(lIlIllllII[lIllIIIIIl[236]]) ? 1 : 0) && lIIlIllIIIlll(tileObject5.getWorldLocation().distanceTo(jC), lIllIIIIIl[12])) {
                                            ?? r0 = lIllIIIIIl[1];
                                            "".length();
                                            return "   ".length() != "   ".length() ? ((((72 + 26) - (-63)) + 56) ^ (((87 + 70) - 40) + 25)) & (((110 ^ 115) ^ (248 ^ 178)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllIIIIIl[0];
                                    });
                                    if (lIIlIllIIIlII(nearest5)) {
                                        AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[67]];
                                        int[] iArr2 = new int[lIllIIIIIl[1]];
                                        iArr2[lIllIIIIIl[0]] = lIllIIIIIl[9];
                                        Inventory.getFirst(iArr2).useOn(nearest5);
                                        Time.sleepTicks(lIllIIIIIl[6]);
                                        "".length();
                                    }
                                }
                                int[] iArr3 = new int[lIllIIIIIl[1]];
                                iArr3[lIllIIIIIl[0]] = lIllIIIIIl[9];
                                if (lIIlIllIIIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                                    if (lIIlIllIIIIlI(Players.getLocal().getWorldLocation().equals(jD) ? 1 : 0)) {
                                        int[] iArr4 = new int[lIllIIIIIl[1]];
                                        iArr4[lIllIIIIIl[0]] = lIllIIIIIl[9];
                                        if (lIIlIllIIIIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                                            AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[68]];
                                            C0004e.c(jD);
                                            Time.sleepTicks(lIllIIIIIl[1]);
                                            "".length();
                                        }
                                    }
                                    if (lIIlIllIIIIII(Players.getLocal().getWorldLocation().equals(jD) ? 1 : 0) && lIIlIllIIlIII(TileObjects.getNearest(tileObject6 -> {
                                        if (lIIlIllIIIIII(tileObject6.getName().contains(lIlIllllII[lIllIIIIIl[235]]) ? 1 : 0) && lIIlIllIIIlll(tileObject6.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIllIIIIIl[7])) {
                                            ?? r0 = lIllIIIIIl[1];
                                            "".length();
                                            return "  ".length() > "   ".length() ? ((((42 + 175) - 41) + 67) ^ (((23 + 31) - 41) + 166)) & (((236 ^ 150) ^ (17 ^ 43)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllIIIIIl[0];
                                    }))) {
                                        int[] iArr5 = new int[lIllIIIIIl[1]];
                                        iArr5[lIllIIIIIl[0]] = lIllIIIIIl[9];
                                        if (lIIlIllIIIIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                                            if (lIIlIllIIIIIl(Movement.getRunEnergy(), lIllIIIIIl[69])) {
                                                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[70]];
                                                Time.sleepTicks(lIllIIIIIl[1]);
                                                "".length();
                                            }
                                            if (lIIlIllIIIIll(Movement.getRunEnergy(), lIllIIIIIl[69])) {
                                                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[71]];
                                                if (lIIlIllIIIIII(Inventory.contains(item5 -> {
                                                    return item5.getName().contains(lIlIllllII[lIllIIIIIl[234]]);
                                                }) ? 1 : 0)) {
                                                    Inventory.getFirst(item6 -> {
                                                        return item6.getName().contains(lIlIllllII[lIllIIIIIl[233]]);
                                                    }).useOn(TileObjects.getNearest(tileObject7 -> {
                                                        if (lIIlIllIIIIII(tileObject7.getName().contains(lIlIllllII[lIllIIIIIl[232]]) ? 1 : 0) && lIIlIllIIIlll(tileObject7.getWorldLocation().distanceTo(jX), lIllIIIIIl[4])) {
                                                            ?? r0 = lIllIIIIIl[1];
                                                            "".length();
                                                            return ((((18 + 124) - 95) + 117) ^ (((157 + 35) - 49) + 17)) < (((((99 + 102) - 149) + 180) ^ (((69 + 139) - 150) + 121)) & (((136 ^ 180) ^ (65 ^ 38)) ^ (-" ".length()))) ? ((((7 + 16) - (-35)) + 124) ^ (((77 + 41) - 68) + 80)) & (((93 ^ 5) ^ (244 ^ 152)) ^ (-" ".length())) : r0;
                                                        }
                                                        return lIllIIIIIl[0];
                                                    }));
                                                    Time.sleepTicks(lIllIIIIIl[1]);
                                                    "".length();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (!lIIlIllIIlIII(nearest3) || lIIlIllIIIlII(nearest4)) {
                                TileObject nearest6 = TileObjects.getNearest(tileObject8 -> {
                                    if (!lIIlIllIIIIlI(tileObject8.getName().contains(lIlIllllII[lIllIIIIIl[228]]) ? 1 : 0) || lIIlIllIIIIII(tileObject8.getName().contains(lIlIllllII[lIllIIIIIl[229]]) ? 1 : 0)) {
                                        String[] strArr12 = new String[lIllIIIIIl[1]];
                                        strArr12[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[230]];
                                        if (lIIlIllIIIIlI(tileObject8.hasAction(strArr12) ? 1 : 0)) {
                                            String[] strArr13 = new String[lIllIIIIIl[1]];
                                            strArr13[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[231]];
                                        }
                                        if (lIIlIllIIIlll(tileObject8.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIllIIIIIl[6])) {
                                            ?? r0 = lIllIIIIIl[1];
                                            "".length();
                                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                                        }
                                    }
                                    return lIllIIIIIl[0];
                                });
                                if (lIIlIllIIIlII(nearest6) && lIIlIllIIIIlI(jz ? 1 : 0)) {
                                    String[] strArr12 = new String[lIllIIIIIl[1]];
                                    strArr12[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[72]];
                                    if (lIIlIllIIIIII(nearest6.hasAction(strArr12) ? 1 : 0)) {
                                        if (lIIlIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(jW), lIllIIIIIl[5]) && lIIlIllIIIlII(f(jW))) {
                                            AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[73]];
                                            if (lIIlIllIIIIII(Inventory.contains(item7 -> {
                                                return item7.getName().contains(lIlIllllII[lIllIIIIIl[227]]);
                                            }) ? 1 : 0)) {
                                                Inventory.getFirst(item8 -> {
                                                    return item8.getName().contains(lIlIllllII[lIllIIIIIl[226]]);
                                                }).useOn(TileObjects.getNearest(tileObject9 -> {
                                                    if (!lIIlIllIIIIlI(tileObject9.getName().contains(lIlIllllII[lIllIIIIIl[223]]) ? 1 : 0) || lIIlIllIIIIII(tileObject9.getName().contains(lIlIllllII[lIllIIIIIl[224]]) ? 1 : 0)) {
                                                        String[] strArr13 = new String[lIllIIIIIl[1]];
                                                        strArr13[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[225]];
                                                        if (lIIlIllIIIIII(tileObject9.hasAction(strArr13) ? 1 : 0) && lIIlIllIIIlll(tileObject9.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIllIIIIIl[7])) {
                                                            ?? r0 = lIllIIIIIl[1];
                                                            "".length();
                                                            return " ".length() >= (86 ^ 82) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                        }
                                                    }
                                                    return lIllIIIIIl[0];
                                                }));
                                                Time.sleepTicks(lIllIIIIIl[1]);
                                                "".length();
                                                return;
                                            }
                                        }
                                        if (lIIlIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(jW), lIllIIIIIl[5])) {
                                            AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[2]];
                                            if (lIIlIllIIIIII(Inventory.contains(item9 -> {
                                                return item9.getName().contains(lIlIllllII[lIllIIIIIl[222]]);
                                            }) ? 1 : 0)) {
                                                Inventory.getFirst(item10 -> {
                                                    return item10.getName().contains(lIlIllllII[lIllIIIIIl[221]]);
                                                }).useOn(TileObjects.getNearest(tileObject10 -> {
                                                    if (!lIIlIllIIIIlI(tileObject10.getName().contains(lIlIllllII[lIllIIIIIl[218]]) ? 1 : 0) || lIIlIllIIIIII(tileObject10.getName().contains(lIlIllllII[lIllIIIIIl[219]]) ? 1 : 0)) {
                                                        String[] strArr13 = new String[lIllIIIIIl[1]];
                                                        strArr13[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[220]];
                                                        if (lIIlIllIIIIII(tileObject10.hasAction(strArr13) ? 1 : 0) && lIIlIllIIIlll(tileObject10.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIllIIIIIl[7])) {
                                                            ?? r0 = lIllIIIIIl[1];
                                                            "".length();
                                                            return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                        }
                                                    }
                                                    return lIllIIIIIl[0];
                                                }));
                                                Time.sleepTicks(lIllIIIIIl[1]);
                                                "".length();
                                                return;
                                            }
                                        }
                                    }
                                    String[] strArr13 = new String[lIllIIIIIl[1]];
                                    strArr13[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[74]];
                                    if (lIIlIllIIIIII(nearest6.hasAction(strArr13) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[75]];
                                        nearest6.interact(lIlIllllII[lIllIIIIIl[76]]);
                                        Time.sleepTicks(lIllIIIIIl[1]);
                                        "".length();
                                        return;
                                    }
                                }
                                if (lIIlIllIIlIII(nearest6) && lIIlIllIIIIlI(jz ? 1 : 0)) {
                                    cY();
                                    if (lIIlIllIIIlII(f(jW))) {
                                        jz = lIllIIIIIl[1];
                                    }
                                }
                                if (lIIlIllIIIIII(jz ? 1 : 0)) {
                                    if (lIIlIllIIIIII(jA.isEmpty() ? 1 : 0)) {
                                        cX();
                                    }
                                    while (true) {
                                        if (!lIIlIllIIIIlI(jA.isEmpty() ? 1 : 0) || !lIIlIllIIIIlI(AccBuilderShamans.d ? 1 : 0) || !lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jC), lIllIIIIIl[37])) {
                                            break;
                                        }
                                        String[] strArr14 = new String[lIllIIIIIl[1]];
                                        strArr14[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[77]];
                                        if (lIIlIllIIIIlI(TileObjects.getNearest(strArr14).getWorldLocation().equals(jC) ? 1 : 0)) {
                                            String[] strArr15 = new String[lIllIIIIIl[1]];
                                            strArr15[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[37]];
                                            jC = TileObjects.getNearest(strArr15).getWorldLocation();
                                            Time.sleepTicks(lIllIIIIIl[4]);
                                            "".length();
                                            cZ();
                                            "".length();
                                            if (((((5 + 141) - 41) + 37) ^ (((32 + 88) - 52) + 70)) <= (-" ".length())) {
                                                return;
                                            }
                                        } else {
                                            if (lIIlIllIIIIlI(Players.getLocal().getWorldLocation().equals(jA.get(lIllIIIIIl[0])) ? 1 : 0)) {
                                                AccBuilderShamans.c = "Nav to tile " + String.valueOf(jA.get(lIllIIIIIl[0]));
                                                C0004e.c(jA.get(lIllIIIIIl[0]));
                                                Time.sleepTicks(lIllIIIIIl[1]);
                                                "".length();
                                            }
                                            if (lIIlIllIIIIII(Players.getLocal().getWorldLocation().equals(jA.get(lIllIIIIIl[0])) ? 1 : 0)) {
                                                TileObject nearest7 = TileObjects.getNearest(tileObject11 -> {
                                                    if (!lIIlIllIIIIlI(tileObject11.getName().contains(lIlIllllII[lIllIIIIIl[214]]) ? 1 : 0) || lIIlIllIIIIII(tileObject11.getName().contains(lIlIllllII[lIllIIIIIl[215]]) ? 1 : 0)) {
                                                        String[] strArr16 = new String[lIllIIIIIl[1]];
                                                        strArr16[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[216]];
                                                        if (lIIlIllIIIIlI(tileObject11.hasAction(strArr16) ? 1 : 0)) {
                                                            String[] strArr17 = new String[lIllIIIIIl[1]];
                                                            strArr17[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[217]];
                                                        }
                                                        if (lIIlIllIIIlll(tileObject11.getWorldLocation().distanceTo(jB.get(lIllIIIIIl[0])), lIllIIIIIl[4])) {
                                                            ?? r0 = lIllIIIIIl[1];
                                                            "".length();
                                                            return ((((61 + 1) - 13) + 95) ^ (((112 + 118) - 186) + 104)) == " ".length() ? ((145 ^ 136) ^ (45 ^ 102)) & (((193 ^ 151) ^ (69 ^ 65)) ^ (-" ".length())) : r0;
                                                        }
                                                    }
                                                    return lIllIIIIIl[0];
                                                });
                                                if (lIIlIllIIIlII(nearest7)) {
                                                    String[] strArr16 = new String[lIllIIIIIl[1]];
                                                    strArr16[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[78]];
                                                    if (lIIlIllIIIIII(nearest7.hasAction(strArr16) ? 1 : 0)) {
                                                        AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[79]];
                                                        if (lIIlIllIIIIII(Inventory.contains(item11 -> {
                                                            return item11.getName().contains(lIlIllllII[lIllIIIIIl[213]]);
                                                        }) ? 1 : 0)) {
                                                            Inventory.getFirst(item12 -> {
                                                                return item12.getName().contains(lIlIllllII[lIllIIIIIl[212]]);
                                                            }).useOn(nearest7);
                                                            Time.sleepTicks(lIllIIIIIl[1]);
                                                            "".length();
                                                        }
                                                    }
                                                    String[] strArr17 = new String[lIllIIIIIl[1]];
                                                    strArr17[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[80]];
                                                    if (lIIlIllIIIIII(nearest7.hasAction(strArr17) ? 1 : 0)) {
                                                        AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[51]];
                                                        nearest7.interact(lIlIllllII[lIllIIIIIl[81]]);
                                                        Time.sleepTicks(lIllIIIIIl[1]);
                                                        "".length();
                                                        if (lIIlIllIIIIII(jA.get(lIllIIIIIl[0]).equals(jW) ? 1 : 0)) {
                                                            AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[82]];
                                                            Time.sleepTicks(lIllIIIIIl[22]);
                                                            "".length();
                                                        }
                                                    }
                                                }
                                                if (lIIlIllIIIIII(jA.get(lIllIIIIIl[0]).equals(jV) ? 1 : 0)) {
                                                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[83]];
                                                    Time.sleepUntil(() -> {
                                                        if (lIIlIllIIIlII(TileObjects.getNearest(tileObject12 -> {
                                                            if (!lIIlIllIIIIlI(tileObject12.getName().contains(lIlIllllII[lIllIIIIIl[208]]) ? 1 : 0) || lIIlIllIIIIII(tileObject12.getName().contains(lIlIllllII[lIllIIIIIl[209]]) ? 1 : 0)) {
                                                                String[] strArr18 = new String[lIllIIIIIl[1]];
                                                                strArr18[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[210]];
                                                                if (lIIlIllIIIIlI(tileObject12.hasAction(strArr18) ? 1 : 0)) {
                                                                    String[] strArr19 = new String[lIllIIIIIl[1]];
                                                                    strArr19[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[211]];
                                                                }
                                                                if (lIIlIllIIIlll(tileObject12.getWorldLocation().distanceTo(kq), lIllIIIIIl[4])) {
                                                                    ?? r0 = lIllIIIIIl[1];
                                                                    "".length();
                                                                    return "  ".length() == 0 ? ((207 ^ 163) ^ (95 ^ 31)) & (((75 ^ 79) ^ (118 ^ 94)) ^ (-" ".length())) : r0;
                                                                }
                                                            }
                                                            return lIllIIIIIl[0];
                                                        }))) {
                                                            ?? r0 = lIllIIIIIl[1];
                                                            "".length();
                                                            return "  ".length() == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                        }
                                                        return lIllIIIIIl[0];
                                                    }, lIllIIIIIl[84]);
                                                    "".length();
                                                }
                                                if (lIIlIllIIlIII(nearest7)) {
                                                    jA.remove(lIllIIIIIl[0]);
                                                    "".length();
                                                    jB.remove(lIllIIIIIl[0]);
                                                    "".length();
                                                }
                                                "".length();
                                                if (((227 ^ 174) & ((121 ^ 52) ^ (-1))) < 0) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    if (lIIlIllIIlIII(f(jW))) {
                                        jz = lIllIIIIIl[0];
                                    }
                                }
                            }
                        }
                        if (lIIlIllIIIIII(dc() ? 1 : 0)) {
                            TileObject nearest8 = TileObjects.getNearest(tileObject12 -> {
                                if (lIIlIllIIIIII(tileObject12.getName().contains(lIlIllllII[lIllIIIIIl[207]]) ? 1 : 0) && lIIlIllIIIlll(tileObject12.getWorldLocation().distanceTo(jC), lIllIIIIIl[12])) {
                                    ?? r0 = lIllIIIIIl[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIllIIIIIl[0];
                            });
                            if (lIIlIllIIIlII(nearest8)) {
                                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[85]];
                                nearest8.interact(lIlIllllII[lIllIIIIIl[86]]);
                                Time.sleepTicks(lIllIIIIIl[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIlIllIIIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlIllIIIIll(Skills.getLevel(Skill.FARMING), lIllIIIIIl[2])) {
            ?? r0 = lIllIIIIIl[1];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIIIIl[0];
    }

    private static boolean lIIlIllIIIIll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIllIIIIIl[0];
    }

    private static void cZ() {
        System.out.println(TileObjects.getNearest(tileObject -> {
            return tileObject.getName().contains(lIlIllllII[lIllIIIIIl[143]]);
        }).getWorldLocation());
        jD = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() - lIllIIIIIl[42], jC.getPlane());
        jE = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() - lIllIIIIIl[42], jC.getPlane());
        jF = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() - lIllIIIIIl[23], jC.getPlane());
        jG = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() - lIllIIIIIl[23], jC.getPlane());
        jH = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() - lIllIIIIIl[11], jC.getPlane());
        jI = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() - lIllIIIIIl[11], jC.getPlane());
        jJ = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() - lIllIIIIIl[5], jC.getPlane());
        jK = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() - lIllIIIIIl[5], jC.getPlane());
        jL = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() + lIllIIIIIl[5], jC.getPlane());
        jM = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() + lIllIIIIIl[5], jC.getPlane());
        jN = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() + lIllIIIIIl[11], jC.getPlane());
        jO = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() + lIllIIIIIl[11], jC.getPlane());
        jP = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() + lIllIIIIIl[23], jC.getPlane());
        jQ = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() + lIllIIIIIl[23], jC.getPlane());
        jR = new WorldPoint(jC.getX() + lIllIIIIIl[22], jC.getY() + lIllIIIIIl[35], jC.getPlane());
        jS = new WorldPoint(jC.getX() + lIllIIIIIl[23], jC.getY() + lIllIIIIIl[35], jC.getPlane());
        jT = new WorldPoint(jC.getX() + lIllIIIIIl[43], jC.getY() + lIllIIIIIl[42], jC.getPlane());
        jU = new WorldPoint(jC.getX() + lIllIIIIIl[43], jC.getY() + lIllIIIIIl[23], jC.getPlane());
        jV = new WorldPoint(jC.getX() + lIllIIIIIl[43], jC.getY() + lIllIIIIIl[11], jC.getPlane());
        jW = new WorldPoint(jC.getX() + lIllIIIIIl[43], jC.getY() + lIllIIIIIl[5], jC.getPlane());
        jX = new WorldPoint(jD.getX() - lIllIIIIIl[4], jD.getY(), jD.getPlane());
        jY = new WorldPoint(jE.getX() + lIllIIIIIl[4], jE.getY(), jE.getPlane());
        jZ = new WorldPoint(jF.getX() - lIllIIIIIl[4], jF.getY(), jF.getPlane());
        ka = new WorldPoint(jG.getX() + lIllIIIIIl[4], jG.getY(), jG.getPlane());
        kb = new WorldPoint(jH.getX() - lIllIIIIIl[4], jH.getY(), jH.getPlane());
        kc = new WorldPoint(jI.getX() + lIllIIIIIl[4], jI.getY(), jI.getPlane());
        kd = new WorldPoint(jJ.getX() - lIllIIIIIl[4], jJ.getY(), jJ.getPlane());
        ke = new WorldPoint(jK.getX() + lIllIIIIIl[4], jK.getY(), jK.getPlane());
        kf = new WorldPoint(jL.getX() - lIllIIIIIl[4], jL.getY(), jL.getPlane());
        kg = new WorldPoint(jM.getX() + lIllIIIIIl[4], jM.getY(), jM.getPlane());
        kh = new WorldPoint(jN.getX() - lIllIIIIIl[4], jN.getY(), jN.getPlane());
        ki = new WorldPoint(jO.getX() + lIllIIIIIl[4], jO.getY(), jO.getPlane());
        kj = new WorldPoint(jP.getX() - lIllIIIIIl[4], jP.getY(), jP.getPlane());
        kk = new WorldPoint(jQ.getX() + lIllIIIIIl[4], jQ.getY(), jQ.getPlane());
        kl = new WorldPoint(jR.getX() - lIllIIIIIl[4], jR.getY(), jR.getPlane());
        km = new WorldPoint(jS.getX() + lIllIIIIIl[4], jS.getY(), jS.getPlane());
        kn = new WorldPoint(jT.getX() + lIllIIIIIl[4], jT.getY(), jT.getPlane());
        ko = new WorldPoint(jU.getX() + lIllIIIIIl[4], jU.getY(), jU.getPlane());
        kp = new WorldPoint(jV.getX() + lIllIIIIIl[4], jV.getY(), jV.getPlane());
        kq = new WorldPoint(jW.getX() + lIllIIIIIl[4], jW.getY(), jW.getPlane());
        System.out.println(lIlIllllII[lIllIIIIIl[125]]);
    }

    private static boolean lIIlIllIIIlIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean al() {
        if (lIIlIllIIIIll(Skills.getLevel(Skill.FARMING), lIllIIIIIl[3])) {
            if (lIIlIllIIIIII(Inventory.contains(item -> {
                return item.getName().contains(lIlIllllII[lIllIIIIIl[142]]);
            }) ? 1 : 0)) {
                String[] strArr = new String[lIllIIIIIl[1]];
                strArr[lIllIIIIIl[0]] = lIlIllllII[lIllIIIIIl[133]];
                if (lIIlIllIIIIII(Inventory.contains(strArr) ? 1 : 0)) {
                    int[] iArr = new int[lIllIIIIIl[1]];
                    iArr[lIllIIIIIl[0]] = lIllIIIIIl[24];
                    if (lIIlIllIIIIII(Inventory.contains(iArr) ? 1 : 0)) {
                        ?? r0 = lIllIIIIIl[1];
                        "".length();
                        return ((194 ^ 136) ^ (71 ^ 9)) > ((((78 + 78) - 5) + 46) ^ (((99 + 104) - 15) + 5)) ? ((32 ^ 86) ^ (60 ^ 98)) & (((64 ^ 83) ^ (72 ^ 115)) ^ (-" ".length())) : r0;
                    }
                }
            }
            return lIllIIIIIl[0];
        }
        int[] iArr2 = new int[lIllIIIIIl[1]];
        iArr2[lIllIIIIIl[0]] = lIllIIIIIl[13];
        if (lIIlIllIIIIII(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIllIIIIIl[1]];
            iArr3[lIllIIIIIl[0]] = lIllIIIIIl[15];
            if (lIIlIllIIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIllIIIIIl[1]];
                iArr4[lIllIIIIIl[0]] = lIllIIIIIl[14];
                if (lIIlIllIIIIII(Inventory.contains(iArr4) ? 1 : 0) && ((!lIIlIllIIIIlI(Inventory.contains(C0005f.aN) ? 1 : 0) || lIIlIllIIIIII(Equipment.contains(C0005f.aN) ? 1 : 0)) && (!lIIlIllIIIIlI(Inventory.contains(C0005f.be) ? 1 : 0) || lIIlIllIIIIII(Equipment.contains(C0005f.be) ? 1 : 0)))) {
                    ?? r02 = lIllIIIIIl[1];
                    "".length();
                    return 0 != 0 ? ((69 ^ 97) ^ (43 ^ 16)) & (((79 ^ 7) ^ (97 ^ 54)) ^ (-" ".length())) : r02;
                }
            }
        }
        return lIllIIIIIl[0];
    }

    private static boolean lIIlIllIIIlll(int i, int i2) {
        return i <= i2;
    }

    private static String lIIlIlIIlIIII(String lllllllllllllllllllIIlIlIIIlIIlI, String lllllllllllllllllllIIlIlIIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlIlIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIIIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIlIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIlIlIIIlIIll) {
            lllllllllllllllllllIIlIlIIIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean db() {
        if (lIIlIllIIIIll(Skills.getLevel(Skill.FARMING), lIllIIIIIl[49])) {
            int[] iArr = new int[lIllIIIIIl[1]];
            iArr[lIllIIIIIl[0]] = lIllIIIIIl[126];
            return Inventory.contains(iArr);
        } else if (lIIlIllIIIIll(Skills.getLevel(Skill.FARMING), lIllIIIIIl[51]) && lIIlIllIIIIIl(Skills.getLevel(Skill.FARMING), lIllIIIIIl[49])) {
            int[] iArr2 = new int[lIllIIIIIl[1]];
            iArr2[lIllIIIIIl[0]] = lIllIIIIIl[127];
            return Inventory.contains(iArr2);
        } else {
            int[] iArr3 = new int[lIllIIIIIl[1]];
            iArr3[lIllIIIIIl[0]] = lIllIIIIIl[128];
            return Inventory.contains(iArr3);
        }
    }

    private static boolean lIIlIllIIIlII(Object obj) {
        return obj != null;
    }

    private static void cY() {
        if (lIIlIllIIlIII(f(jX))) {
            int[] iArr = new int[lIllIIIIIl[1]];
            iArr[lIllIIIIIl[0]] = lIllIIIIIl[9];
            if (lIIlIllIIIIII(Inventory.contains(iArr) ? 1 : 0)) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[204]]) ? 1 : 0) && lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(jC), lIllIIIIIl[12])) {
                        ?? r0 = lIllIIIIIl[1];
                        "".length();
                        return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIIIIl[0];
                });
                if (lIIlIllIIIlII(nearest)) {
                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[87]];
                    int[] iArr2 = new int[lIllIIIIIl[1]];
                    iArr2[lIllIIIIIl[0]] = lIllIIIIIl[9];
                    Inventory.getFirst(iArr2).useOn(nearest);
                    Time.sleepTicks(lIllIIIIIl[6]);
                    "".length();
                }
            }
            int[] iArr3 = new int[lIllIIIIIl[1]];
            iArr3[lIllIIIIIl[0]] = lIllIIIIIl[9];
            if (lIIlIllIIIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jD), lIllIIIIIl[7])) {
                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[88]];
                    C0004e.c(jD);
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                }
                if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jD), lIllIIIIIl[7])) {
                    AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[89]];
                    if (lIIlIllIIIIll(Movement.getRunEnergy(), lIllIIIIIl[69]) && lIIlIllIIIIII(Inventory.contains(item -> {
                        return item.getName().contains(lIlIllllII[lIllIIIIIl[203]]);
                    }) ? 1 : 0)) {
                        Inventory.getFirst(item2 -> {
                            return item2.getName().contains(lIlIllllII[lIllIIIIIl[202]]);
                        }).useOn(TileObjects.getNearest(tileObject2 -> {
                            if (lIIlIllIIIIII(tileObject2.getName().contains(lIlIllllII[lIllIIIIIl[201]]) ? 1 : 0) && lIIlIllIIIlll(tileObject2.getWorldLocation().distanceTo(jX), lIllIIIIIl[4])) {
                                ?? r0 = lIllIIIIIl[1];
                                "".length();
                                return "  ".length() <= 0 ? ((254 ^ 180) ^ (217 ^ 198)) & (((((183 + 84) - 222) + 209) ^ (((2 + 79) - 74) + 164)) ^ (-" ".length())) : r0;
                            }
                            return lIllIIIIIl[0];
                        }));
                        Time.sleepTicks(lIllIIIIIl[1]);
                        "".length();
                        return;
                    }
                }
            }
        }
        if (lIIlIllIIlIII(f(jE)) && lIIlIllIIIlII(f(jX))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jE), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[90]];
                C0004e.c(jE);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jE), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[91]];
                if (lIIlIllIIIIII(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIlIllllII[lIllIIIIIl[200]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item4 -> {
                        return item4.getName().contains(lIlIllllII[lIllIIIIIl[199]]);
                    }).useOn(TileObjects.getNearest(tileObject3 -> {
                        if (lIIlIllIIIIII(tileObject3.getName().contains(lIlIllllII[lIllIIIIIl[198]]) ? 1 : 0) && lIIlIllIIIlll(tileObject3.getWorldLocation().distanceTo(jY), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return (21 ^ 16) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jF)) && lIIlIllIIIlII(f(jE))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jF), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[92]];
                C0004e.c(jF);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jF), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[93]];
                if (lIIlIllIIIIII(Inventory.contains(item5 -> {
                    return item5.getName().contains(lIlIllllII[lIllIIIIIl[197]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(lIlIllllII[lIllIIIIIl[196]]);
                    }).useOn(TileObjects.getNearest(tileObject4 -> {
                        if (lIIlIllIIIIII(tileObject4.getName().contains(lIlIllllII[lIllIIIIIl[195]]) ? 1 : 0) && lIIlIllIIIlll(tileObject4.getWorldLocation().distanceTo(jZ), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return "   ".length() <= " ".length() ? ((23 ^ 65) ^ (184 ^ 183)) & (((((95 + 72) - 33) + 92) ^ (((176 + 139) - 234) + 106)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jG)) && lIIlIllIIIlII(f(jF))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jG), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[94]];
                C0004e.c(jG);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jG), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[95]];
                if (lIIlIllIIIIII(Inventory.contains(item7 -> {
                    return item7.getName().contains(lIlIllllII[lIllIIIIIl[194]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item8 -> {
                        return item8.getName().contains(lIlIllllII[lIllIIIIIl[193]]);
                    }).useOn(TileObjects.getNearest(tileObject5 -> {
                        if (lIIlIllIIIIII(tileObject5.getName().contains(lIlIllllII[lIllIIIIIl[192]]) ? 1 : 0) && lIIlIllIIIlll(tileObject5.getWorldLocation().distanceTo(ka), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return 0 != 0 ? ((((144 + 14) - 129) + 209) ^ (((146 + 125) - 248) + 158)) & (((58 ^ 102) ^ (95 ^ 88)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jH)) && lIIlIllIIIlII(f(jG))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jH), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[96]];
                C0004e.c(jH);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jH), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[97]];
                if (lIIlIllIIIIII(Inventory.contains(item9 -> {
                    return item9.getName().contains(lIlIllllII[lIllIIIIIl[191]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item10 -> {
                        return item10.getName().contains(lIlIllllII[lIllIIIIIl[190]]);
                    }).useOn(TileObjects.getNearest(tileObject6 -> {
                        if (lIIlIllIIIIII(tileObject6.getName().contains(lIlIllllII[lIllIIIIIl[189]]) ? 1 : 0) && lIIlIllIIIlll(tileObject6.getWorldLocation().distanceTo(kb), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return (-" ".length()) != (-" ".length()) ? ((4 ^ 56) ^ (79 ^ 124)) & (((159 ^ 171) ^ (111 ^ 84)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jI)) && lIIlIllIIIlII(f(jH))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jI), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[98]];
                C0004e.c(jI);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jI), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[99]];
                if (lIIlIllIIIIII(Inventory.contains(item11 -> {
                    return item11.getName().contains(lIlIllllII[lIllIIIIIl[188]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item12 -> {
                        return item12.getName().contains(lIlIllllII[lIllIIIIIl[187]]);
                    }).useOn(TileObjects.getNearest(tileObject7 -> {
                        if (lIIlIllIIIIII(tileObject7.getName().contains(lIlIllllII[lIllIIIIIl[186]]) ? 1 : 0) && lIIlIllIIIlll(tileObject7.getWorldLocation().distanceTo(kc), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return " ".length() == 0 ? ((((25 + 206) - 83) + 97) ^ (((44 + 151) - 37) + 32)) & (((((171 + 56) - 224) + 214) ^ (((89 + 145) - 109) + 21)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jJ)) && lIIlIllIIIlII(f(jI))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jJ), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[100]];
                C0004e.c(jJ);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jJ), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[49]];
                if (lIIlIllIIIIII(Inventory.contains(item13 -> {
                    return item13.getName().contains(lIlIllllII[lIllIIIIIl[185]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item14 -> {
                        return item14.getName().contains(lIlIllllII[lIllIIIIIl[184]]);
                    }).useOn(TileObjects.getNearest(tileObject8 -> {
                        if (lIIlIllIIIIII(tileObject8.getName().contains(lIlIllllII[lIllIIIIIl[183]]) ? 1 : 0) && lIIlIllIIIlll(tileObject8.getWorldLocation().distanceTo(kd), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return (((195 ^ 132) ^ (88 ^ 36)) & (((253 ^ 146) ^ (219 ^ 143)) ^ (-" ".length()))) >= " ".length() ? ((((96 + 182) - 123) + 34) ^ (((62 + 30) - 15) + 63)) & (((101 ^ 113) ^ (60 ^ 25)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jK)) && lIIlIllIIIlII(f(jJ))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jK), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[101]];
                C0004e.c(jK);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jK), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[102]];
                if (lIIlIllIIIIII(Inventory.contains(item15 -> {
                    return item15.getName().contains(lIlIllllII[lIllIIIIIl[182]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item16 -> {
                        return item16.getName().contains(lIlIllllII[lIllIIIIIl[181]]);
                    }).useOn(TileObjects.getNearest(tileObject9 -> {
                        if (lIIlIllIIIIII(tileObject9.getName().contains(lIlIllllII[lIllIIIIIl[180]]) ? 1 : 0) && lIIlIllIIIlll(tileObject9.getWorldLocation().distanceTo(ke), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jL)) && lIIlIllIIIlII(f(jK))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jL), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[103]];
                C0004e.c(jL);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jL), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[104]];
                if (lIIlIllIIIIII(Inventory.contains(item17 -> {
                    return item17.getName().contains(lIlIllllII[lIllIIIIIl[179]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item18 -> {
                        return item18.getName().contains(lIlIllllII[lIllIIIIIl[178]]);
                    }).useOn(TileObjects.getNearest(tileObject10 -> {
                        if (lIIlIllIIIIII(tileObject10.getName().contains(lIlIllllII[lIllIIIIIl[177]]) ? 1 : 0) && lIIlIllIIIlll(tileObject10.getWorldLocation().distanceTo(kf), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return "   ".length() > ((((5 + 59) - (-2)) + 86) ^ (((53 + 123) - 66) + 46)) ? ((((197 + 76) - 79) + 47) ^ (((150 + 162) - 224) + 77)) & (((123 ^ 73) ^ (40 ^ 78)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jM)) && lIIlIllIIIlII(f(jL))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jM), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[105]];
                C0004e.c(jM);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jM), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[106]];
                if (lIIlIllIIIIII(Inventory.contains(item19 -> {
                    return item19.getName().contains(lIlIllllII[lIllIIIIIl[176]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item20 -> {
                        return item20.getName().contains(lIlIllllII[lIllIIIIIl[175]]);
                    }).useOn(TileObjects.getNearest(tileObject11 -> {
                        if (lIIlIllIIIIII(tileObject11.getName().contains(lIlIllllII[lIllIIIIIl[174]]) ? 1 : 0) && lIIlIllIIIlll(tileObject11.getWorldLocation().distanceTo(kg), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return 0 != 0 ? ((201 ^ 129) ^ (183 ^ 172)) & (((13 ^ 57) ^ (93 ^ 58)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jN)) && lIIlIllIIIlII(f(jM))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jN), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[107]];
                C0004e.c(jN);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jN), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[108]];
                if (lIIlIllIIIIII(Inventory.contains(item21 -> {
                    return item21.getName().contains(lIlIllllII[lIllIIIIIl[173]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item22 -> {
                        return item22.getName().contains(lIlIllllII[lIllIIIIIl[172]]);
                    }).useOn(TileObjects.getNearest(tileObject12 -> {
                        if (lIIlIllIIIIII(tileObject12.getName().contains(lIlIllllII[lIllIIIIIl[171]]) ? 1 : 0) && lIIlIllIIIlll(tileObject12.getWorldLocation().distanceTo(kh), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return " ".length() > " ".length() ? ((201 ^ 162) ^ (252 ^ 128)) & (((188 ^ 148) ^ (19 ^ 44)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jO)) && lIIlIllIIIlII(f(jN))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jO), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[109]];
                C0004e.c(jO);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jO), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[110]];
                if (lIIlIllIIIIII(Inventory.contains(item23 -> {
                    return item23.getName().contains(lIlIllllII[lIllIIIIIl[170]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item24 -> {
                        return item24.getName().contains(lIlIllllII[lIllIIIIIl[169]]);
                    }).useOn(TileObjects.getNearest(tileObject13 -> {
                        if (lIIlIllIIIIII(tileObject13.getName().contains(lIlIllllII[lIllIIIIIl[168]]) ? 1 : 0) && lIIlIllIIIlll(tileObject13.getWorldLocation().distanceTo(ki), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return (((121 ^ 57) ^ (5 ^ 9)) & (((((61 + 139) - 5) + 43) ^ (((15 + 28) - (-81)) + 38)) ^ (-" ".length()))) != 0 ? ((84 ^ 94) ^ (184 ^ 169)) & (((151 ^ 156) ^ (103 ^ 119)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jP)) && lIIlIllIIIlII(f(jO))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jP), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[69]];
                C0004e.c(jP);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jP), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[111]];
                if (lIIlIllIIIIII(Inventory.contains(item25 -> {
                    return item25.getName().contains(lIlIllllII[lIllIIIIIl[167]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item26 -> {
                        return item26.getName().contains(lIlIllllII[lIllIIIIIl[166]]);
                    }).useOn(TileObjects.getNearest(tileObject14 -> {
                        if (lIIlIllIIIIII(tileObject14.getName().contains(lIlIllllII[lIllIIIIIl[165]]) ? 1 : 0) && lIIlIllIIIlll(tileObject14.getWorldLocation().distanceTo(kj), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return "  ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jQ)) && lIIlIllIIIlII(f(jP))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jQ), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[112]];
                C0004e.c(jQ);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jQ), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[32]];
                if (lIIlIllIIIIII(Inventory.contains(item27 -> {
                    return item27.getName().contains(lIlIllllII[lIllIIIIIl[164]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item28 -> {
                        return item28.getName().contains(lIlIllllII[lIllIIIIIl[163]]);
                    }).useOn(TileObjects.getNearest(tileObject15 -> {
                        if (lIIlIllIIIIII(tileObject15.getName().contains(lIlIllllII[lIllIIIIIl[162]]) ? 1 : 0) && lIIlIllIIIlll(tileObject15.getWorldLocation().distanceTo(kk), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jR)) && lIIlIllIIIlII(f(jQ))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jR), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[113]];
                C0004e.c(jR);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jR), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[114]];
                if (lIIlIllIIIIII(Inventory.contains(item29 -> {
                    return item29.getName().contains(lIlIllllII[lIllIIIIIl[161]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item30 -> {
                        return item30.getName().contains(lIlIllllII[lIllIIIIIl[160]]);
                    }).useOn(TileObjects.getNearest(tileObject16 -> {
                        if (lIIlIllIIIIII(tileObject16.getName().contains(lIlIllllII[lIllIIIIIl[159]]) ? 1 : 0) && lIIlIllIIIlll(tileObject16.getWorldLocation().distanceTo(kl), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return (-"   ".length()) > 0 ? ((137 ^ 195) ^ (86 ^ 23)) & (((1 ^ 93) ^ (6 ^ 81)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jS)) && lIIlIllIIIlII(f(jR))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jS), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[115]];
                C0004e.c(jS);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jS), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[116]];
                if (lIIlIllIIIIII(Inventory.contains(item31 -> {
                    return item31.getName().contains(lIlIllllII[lIllIIIIIl[158]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item32 -> {
                        return item32.getName().contains(lIlIllllII[lIllIIIIIl[157]]);
                    }).useOn(TileObjects.getNearest(tileObject17 -> {
                        if (lIIlIllIIIIII(tileObject17.getName().contains(lIlIllllII[lIllIIIIIl[156]]) ? 1 : 0) && lIIlIllIIIlll(tileObject17.getWorldLocation().distanceTo(km), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jT)) && lIIlIllIIIlII(f(jS))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jT), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[117]];
                C0004e.c(jT);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jT), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[118]];
                if (lIIlIllIIIIII(Inventory.contains(item33 -> {
                    return item33.getName().contains(lIlIllllII[lIllIIIIIl[155]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item34 -> {
                        return item34.getName().contains(lIlIllllII[lIllIIIIIl[154]]);
                    }).useOn(TileObjects.getNearest(tileObject18 -> {
                        if (lIIlIllIIIIII(tileObject18.getName().contains(lIlIllllII[lIllIIIIIl[153]]) ? 1 : 0) && lIIlIllIIIlll(tileObject18.getWorldLocation().distanceTo(kn), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jU)) && lIIlIllIIIlII(f(jT))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jU), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[119]];
                C0004e.c(jU);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jU), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[120]];
                if (lIIlIllIIIIII(Inventory.contains(item35 -> {
                    return item35.getName().contains(lIlIllllII[lIllIIIIIl[152]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item36 -> {
                        return item36.getName().contains(lIlIllllII[lIllIIIIIl[151]]);
                    }).useOn(TileObjects.getNearest(tileObject19 -> {
                        if (lIIlIllIIIIII(tileObject19.getName().contains(lIlIllllII[lIllIIIIIl[150]]) ? 1 : 0) && lIIlIllIIIlll(tileObject19.getWorldLocation().distanceTo(ko), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return (-" ".length()) > 0 ? ((((57 + 80) - 110) + 122) ^ (((83 + 138) - 81) + 16)) & (((((9 + 193) - 66) + 65) ^ (((20 + 119) - (-32)) + 21)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jV)) && lIIlIllIIIlII(f(jU))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jV), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[121]];
                C0004e.c(jV);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jV), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[122]];
                if (lIIlIllIIIIII(Inventory.contains(item37 -> {
                    return item37.getName().contains(lIlIllllII[lIllIIIIIl[149]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item38 -> {
                        return item38.getName().contains(lIlIllllII[lIllIIIIIl[148]]);
                    }).useOn(TileObjects.getNearest(tileObject20 -> {
                        if (lIIlIllIIIIII(tileObject20.getName().contains(lIlIllllII[lIllIIIIIl[147]]) ? 1 : 0) && lIIlIllIIIlll(tileObject20.getWorldLocation().distanceTo(kp), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return "  ".length() == "   ".length() ? ((((109 + 31) - 21) + 99) ^ (((154 + 49) - 138) + 94)) & (((44 ^ 107) ^ "  ".length()) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[1]);
                    "".length();
                    return;
                }
            }
        }
        if (lIIlIllIIlIII(f(jW)) && lIIlIllIIIlII(f(jV))) {
            if (lIIlIllIIIllI(Players.getLocal().getWorldLocation().distanceTo(jW), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[123]];
                C0004e.c(jW);
                Time.sleepTicks(lIllIIIIIl[1]);
                "".length();
            }
            if (lIIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(jW), lIllIIIIIl[7])) {
                AccBuilderShamans.c = lIlIllllII[lIllIIIIIl[124]];
                if (lIIlIllIIIIII(Inventory.contains(item39 -> {
                    return item39.getName().contains(lIlIllllII[lIllIIIIIl[146]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item40 -> {
                        return item40.getName().contains(lIlIllllII[lIllIIIIIl[145]]);
                    }).useOn(TileObjects.getNearest(tileObject21 -> {
                        if (lIIlIllIIIIII(tileObject21.getName().contains(lIlIllllII[lIllIIIIIl[144]]) ? 1 : 0) && lIIlIllIIIlll(tileObject21.getWorldLocation().distanceTo(kq), lIllIIIIIl[4])) {
                            ?? r0 = lIllIIIIIl[1];
                            "".length();
                            return " ".length() < 0 ? ((151 ^ 158) ^ (213 ^ 151)) & (((((192 + 93) - 249) + 180) ^ (((146 + 63) - 96) + 34)) ^ (-" ".length())) : r0;
                        }
                        return lIllIIIIIl[0];
                    }));
                    Time.sleepTicks(lIllIIIIIl[12]);
                    "".length();
                }
            }
        }
    }

    private static String lIIlIlIIlIIIl(String lllllllllllllllllllIIlIlIIIlllll, String lllllllllllllllllllIIlIlIIIllllI) {
        try {
            SecretKeySpec lllllllllllllllllllIIlIlIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlIlIIIllllI.getBytes(StandardCharsets.UTF_8)), lIllIIIIIl[22]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIIIIl[4], lllllllllllllllllllIIlIlIIlIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIlIlIIlIIIII) {
            lllllllllllllllllllIIlIlIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIIIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    private static boolean dc() {
        int i = lIllIIIIIl[0];
        int[] iArr = new int[lIllIIIIIl[1]];
        iArr[lIllIIIIIl[0]] = lIllIIIIIl[129];
        if (lIIlIllIIIIII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIllIIIIIl[1]];
            iArr2[lIllIIIIIl[0]] = lIllIIIIIl[129];
            i += Inventory.getFirst(iArr2).getQuantity();
        }
        int[] iArr3 = new int[lIllIIIIIl[1]];
        iArr3[lIllIIIIIl[0]] = lIllIIIIIl[130];
        if (lIIlIllIIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lIllIIIIIl[1]];
            iArr4[lIllIIIIIl[0]] = lIllIIIIIl[130];
            i += Inventory.getFirst(iArr4).getQuantity();
        }
        int[] iArr5 = new int[lIllIIIIIl[1]];
        iArr5[lIllIIIIIl[0]] = lIllIIIIIl[131];
        if (lIIlIllIIIIII(Inventory.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lIllIIIIIl[1]];
            iArr6[lIllIIIIIl[0]] = lIllIIIIIl[131];
            i += Inventory.getFirst(iArr6).getQuantity();
        }
        if (lIIlIllIIIIll(i, lIllIIIIIl[124])) {
            ?? r0 = lIllIIIIIl[1];
            "".length();
            return ("  ".length() & ("  ".length() ^ (-" ".length()))) != 0 ? ((59 ^ 99) ^ (137 ^ 131)) & (((25 ^ 33) ^ (59 ^ 81)) ^ (-" ".length())) : r0;
        }
        return lIllIIIIIl[0];
    }

    private static String lIIlIlIIlIIlI(String lllllllllllllllllllIIlIlIIllIlII, String lllllllllllllllllllIIlIlIIllIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllIIlIlIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllIIlIlIIllIIll.toCharArray();
        int lllllllllllllllllllIIlIlIIllIIII = lIllIIIIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIIIIl[0];
        while (lIIlIllIIIIIl(i, length)) {
            char lllllllllllllllllllIIlIlIIllIlIl = charArray2[i];
            sb.append((char) (lllllllllllllllllllIIlIlIIllIlIl ^ charArray[lllllllllllllllllllIIlIlIIllIIII % charArray.length]));
            "".length();
            lllllllllllllllllllIIlIlIIllIIII++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void dd() {
        C0004e.l(lIllIIIIIl[25]);
        C0004e.l(lIllIIIIIl[26]);
        C0004e.l(lIllIIIIIl[27]);
        C0004e.l(lIllIIIIIl[28]);
        C0004e.l(lIllIIIIIl[29]);
        C0004e.l(lIllIIIIIl[30]);
        C0004e.l(lIllIIIIIl[32]);
        C0004e.l(lIllIIIIIl[132]);
    }

    private static boolean lIIlIllIIlIII(Object obj) {
        return obj == null;
    }

    private static void cX() {
        if (lIIlIllIIIIII(jA.isEmpty() ? 1 : 0)) {
            jA.add(jD);
            "".length();
            jA.add(jE);
            "".length();
            jA.add(jF);
            "".length();
            jA.add(jG);
            "".length();
            jA.add(jH);
            "".length();
            jA.add(jI);
            "".length();
            jA.add(jJ);
            "".length();
            jA.add(jK);
            "".length();
            jA.add(jL);
            "".length();
            jA.add(jM);
            "".length();
            jA.add(jN);
            "".length();
            jA.add(jO);
            "".length();
            jA.add(jP);
            "".length();
            jA.add(jQ);
            "".length();
            jA.add(jR);
            "".length();
            jA.add(jS);
            "".length();
            jA.add(jT);
            "".length();
            jA.add(jU);
            "".length();
            jA.add(jV);
            "".length();
            jA.add(jW);
            "".length();
        }
        if (lIIlIllIIIIII(jB.isEmpty() ? 1 : 0)) {
            jB.add(jX);
            "".length();
            jB.add(jY);
            "".length();
            jB.add(jZ);
            "".length();
            jB.add(ka);
            "".length();
            jB.add(kb);
            "".length();
            jB.add(kc);
            "".length();
            jB.add(kd);
            "".length();
            jB.add(ke);
            "".length();
            jB.add(kf);
            "".length();
            jB.add(kg);
            "".length();
            jB.add(kh);
            "".length();
            jB.add(ki);
            "".length();
            jB.add(kj);
            "".length();
            jB.add(kk);
            "".length();
            jB.add(kl);
            "".length();
            jB.add(km);
            "".length();
            jB.add(kn);
            "".length();
            jB.add(ko);
            "".length();
            jB.add(kp);
            "".length();
            jB.add(kq);
            "".length();
        }
    }

    private static boolean da() {
        return Static.getClient().isInInstancedRegion();
    }

    private static TileObject f(WorldPoint worldPoint) {
        return TileObjects.getNearest(tileObject -> {
            if ((!lIIlIllIIIIlI(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[205]]) ? 1 : 0) || lIIlIllIIIIII(tileObject.getName().contains(lIlIllllII[lIllIIIIIl[206]]) ? 1 : 0)) && lIIlIllIIIlll(tileObject.getWorldLocation().distanceTo(worldPoint), lIllIIIIIl[4])) {
                ?? r0 = lIllIIIIIl[1];
                "".length();
                return " ".length() <= 0 ? ((72 ^ 26) ^ (222 ^ 182)) & (((47 ^ 75) ^ (238 ^ 176)) ^ (-" ".length())) : r0;
            }
            return lIllIIIIIl[0];
        });
    }

    private static void lIIlIlIllllll() {
        lIllIIIIIl = new int[251];
        lIllIIIIIl[0] = (30 ^ 9) & ((39 ^ 48) ^ (-1));
        lIllIIIIIl[1] = " ".length();
        lIllIIIIIl[2] = 115 ^ 94;
        lIllIIIIIl[3] = (120 ^ 31) ^ (30 ^ 91);
        lIllIIIIIl[4] = "  ".length();
        lIllIIIIIl[5] = "   ".length();
        lIllIIIIIl[6] = 3 ^ 7;
        lIllIIIIIl[7] = (131 ^ 132) ^ "  ".length();
        lIllIIIIIl[8] = (-25651) & 30650;
        lIllIIIIIl[9] = (-8745) & 14075;
        lIllIIIIIl[10] = 0 ^ 17;
        lIllIIIIIl[11] = (58 ^ 3) ^ (88 ^ 103);
        lIllIIIIIl[12] = (105 ^ 90) ^ (158 ^ 167);
        lIllIIIIIl[13] = (-((-3077) & 27789)) & (-17) & 32735;
        lIllIIIIIl[14] = (-20) & 8027;
        lIllIIIIIl[15] = (-((-14413) & 30799)) & (-8373) & 32767;
        lIllIIIIIl[16] = (-28817) & 32669;
        lIllIIIIIl[17] = (-((-26357) & 26613)) & (-36) & 12271;
        lIllIIIIIl[18] = (-((-4673) & 7885)) & (-547) & 16383;
        lIllIIIIIl[19] = (-(133 ^ 180)) & (-134) & 8191;
        lIllIIIIIl[20] = 95 ^ 88;
        lIllIIIIIl[21] = (-11777) & 12161;
        lIllIIIIIl[22] = (236 ^ 194) ^ (11 ^ 45);
        lIllIIIIIl[23] = 54 ^ 63;
        lIllIIIIIl[24] = (-18721) & 24063;
        lIllIIIIIl[25] = (-(134 ^ 172)) & (-16513) & 28413;
        lIllIIIIIl[26] = (-20778) & 32633;
        lIllIIIIIl[27] = (-17) & 11870;
        lIllIIIIIl[28] = (-20516) & 32367;
        lIllIIIIIl[29] = (-((-8915) & 29427)) & (-137) & 32506;
        lIllIIIIIl[30] = (-((-4297) & 20717)) & (-4098) & 32367;
        lIllIIIIIl[31] = (-16432) & 28399;
        lIllIIIIIl[32] = (26 ^ 122) ^ (116 ^ 76);
        lIllIIIIIl[33] = (-213) & 20447;
        lIllIIIIIl[34] = 174 ^ 161;
        lIllIIIIIl[35] = 103 ^ 107;
        lIllIIIIIl[36] = (-72) & 1023;
        lIllIIIIIl[37] = 242 ^ 192;
        lIllIIIIIl[38] = 19 ^ 24;
        lIllIIIIIl[39] = 223 ^ 198;
        lIllIIIIIl[40] = (-((-8225) & 26739)) & (-4133) & 24447;
        lIllIIIIIl[41] = (-((-7341) & 24301)) & (-4097) & 24559;
        lIllIIIIIl[42] = 70 ^ 75;
        lIllIIIIIl[43] = 142 ^ 128;
        lIllIIIIIl[44] = (((9 + 24) - 15) + 123) ^ (((136 + 150) - 159) + 30);
        lIllIIIIIl[45] = (((22 + 43) - 11) + 78) ^ (((62 + 149) - 148) + 87);
        lIllIIIIIl[46] = 41 ^ 58;
        lIllIIIIIl[47] = 170 ^ 190;
        lIllIIIIIl[48] = 213 ^ 192;
        lIllIIIIIl[49] = (107 ^ 112) ^ (80 ^ 1);
        lIllIIIIIl[50] = 54 ^ 32;
        lIllIIIIIl[51] = 62 ^ 8;
        lIllIIIIIl[52] = (7 ^ 68) ^ (30 ^ 74);
        lIllIIIIIl[53] = 152 ^ 128;
        lIllIIIIIl[54] = (-16489) & 26488;
        lIllIIIIIl[55] = 44 ^ 54;
        lIllIIIIIl[56] = 186 ^ 161;
        lIllIIIIIl[57] = (((78 + 43) - 92) + 136) ^ (((9 + 17) - (-36)) + 123);
        lIllIIIIIl[58] = 32 ^ 61;
        lIllIIIIIl[59] = (56 ^ 118) ^ (27 ^ 75);
        lIllIIIIIl[60] = (29 ^ 2) ^ ((58 ^ 37) & ((174 ^ 177) ^ (-1)));
        lIllIIIIIl[61] = (110 ^ 100) ^ (42 ^ 0);
        lIllIIIIIl[62] = 187 ^ 154;
        lIllIIIIIl[63] = (47 ^ 89) ^ (19 ^ 70);
        lIllIIIIIl[64] = (168 ^ 138) ^ (125 ^ 123);
        lIllIIIIIl[65] = (((30 + 30) - 13) + 86) ^ (((72 + 108) - 77) + 57);
        lIllIIIIIl[66] = (206 ^ 143) ^ (77 ^ 42);
        lIllIIIIIl[67] = 155 ^ 188;
        lIllIIIIIl[68] = (245 ^ 145) ^ (231 ^ 171);
        lIllIIIIIl[69] = (((88 + 187) - 153) + 70) ^ (((9 + 82) - (-58)) + 0);
        lIllIIIIIl[70] = (106 ^ 127) ^ (85 ^ 105);
        lIllIIIIIl[71] = 153 ^ 179;
        lIllIIIIIl[72] = 16 ^ 59;
        lIllIIIIIl[73] = (52 ^ 9) ^ (43 ^ 58);
        lIllIIIIIl[74] = (47 ^ 28) ^ (52 ^ 41);
        lIllIIIIIl[75] = 238 ^ 193;
        lIllIIIIIl[76] = 159 ^ 175;
        lIllIIIIIl[77] = (49 ^ 93) ^ (196 ^ 153);
        lIllIIIIIl[78] = (91 ^ 106) ^ "  ".length();
        lIllIIIIIl[79] = 51 ^ 7;
        lIllIIIIIl[80] = 62 ^ 11;
        lIllIIIIIl[81] = 44 ^ 27;
        lIllIIIIIl[82] = (((145 + 94) - 208) + 115) ^ (((64 + 86) - 92) + 112);
        lIllIIIIIl[83] = 127 ^ 70;
        lIllIIIIIl[84] = (-16394) & 19193;
        lIllIIIIIl[85] = (((3 + 169) - 36) + 44) ^ (((130 + 128) - 149) + 33);
        lIllIIIIIl[86] = (113 ^ 111) ^ (26 ^ 63);
        lIllIIIIIl[87] = (92 ^ 39) ^ (252 ^ 187);
        lIllIIIIIl[88] = (((26 + 107) - 47) + 76) ^ (((2 + 100) - 65) + 122);
        lIllIIIIIl[89] = 190 ^ 128;
        lIllIIIIIl[90] = (((94 + 44) - 70) + 101) ^ (((126 + 71) - 185) + 138);
        lIllIIIIIl[91] = (27 ^ 56) ^ (10 ^ 105);
        lIllIIIIIl[92] = 24 ^ 89;
        lIllIIIIIl[93] = 7 ^ 69;
        lIllIIIIIl[94] = 17 ^ 82;
        lIllIIIIIl[95] = 7 ^ 67;
        lIllIIIIIl[96] = (197 ^ 147) ^ (162 ^ 177);
        lIllIIIIIl[97] = 21 ^ 83;
        lIllIIIIIl[98] = (((82 + 36) - 5) + 18) ^ (((64 + 178) - 112) + 66);
        lIllIIIIIl[99] = (((196 + 174) - 189) + 70) ^ (((92 + 139) - 216) + 164);
        lIllIIIIIl[100] = (((127 + 9) - 0) + 96) ^ (((91 + 56) - 23) + 37);
        lIllIIIIIl[101] = (191 ^ 182) ^ (126 ^ 60);
        lIllIIIIIl[102] = (((123 + 39) - (-24)) + 6) ^ (((19 + 106) - 34) + 49);
        lIllIIIIIl[103] = 218 ^ 151;
        lIllIIIIIl[104] = (((204 + 75) - 79) + 49) ^ (((126 + 169) - 268) + 156);
        lIllIIIIIl[105] = 111 ^ 32;
        lIllIIIIIl[106] = (((81 + 201) - 112) + 74) ^ (((8 + 79) - 64) + 141);
        lIllIIIIIl[107] = 1 ^ 80;
        lIllIIIIIl[108] = " ".length() ^ (6 ^ 85);
        lIllIIIIIl[109] = (39 ^ 58) ^ (31 ^ 81);
        lIllIIIIIl[110] = (((77 + 73) - (-26)) + 29) ^ (((82 + 45) - 120) + 146);
        lIllIIIIIl[111] = (144 ^ 196) ^ "  ".length();
        lIllIIIIIl[112] = (33 ^ 83) ^ (75 ^ 110);
        lIllIIIIIl[113] = 205 ^ 148;
        lIllIIIIIl[114] = 60 ^ 102;
        lIllIIIIIl[115] = (((134 + 136) - 128) + 67) ^ (((9 + 19) - (-102)) + 8);
        lIllIIIIIl[116] = (97 ^ 74) ^ (102 ^ 17);
        lIllIIIIIl[117] = (((68 + 88) - (-21)) + 20) ^ (((103 + 118) - 87) + 18);
        lIllIIIIIl[118] = 44 ^ 114;
        lIllIIIIIl[119] = (70 ^ 109) ^ (243 ^ 135);
        lIllIIIIIl[120] = 27 ^ 123;
        lIllIIIIIl[121] = (((167 + 11) - 23) + 52) ^ (((118 + 168) - 112) + 0);
        lIllIIIIIl[122] = 90 ^ 56;
        lIllIIIIIl[123] = 12 ^ 111;
        lIllIIIIIl[124] = 75 ^ 47;
        lIllIIIIIl[125] = (203 ^ 182) ^ (23 ^ 15);
        lIllIIIIIl[126] = (-15) & 13439;
        lIllIIIIIl[127] = (-((-3127) & 20415)) & (-2055) & 32766;
        lIllIIIIIl[128] = (-((-6691) & 7075)) & (-2049) & 15855;
        lIllIIIIIl[129] = (-((-242) & 17149)) & (-2049) & 32383;
        lIllIIIIIl[130] = (-17161) & 30587;
        lIllIIIIIl[131] = (-17162) & 30587;
        lIllIIIIIl[132] = (-1411) & 22419;
        lIllIIIIIl[133] = 56 ^ 94;
        lIllIIIIIl[134] = (-(((15 + 123) - 76) + 67)) & (-2564) & 8191;
        lIllIIIIIl[135] = (-2582) & 27581;
        lIllIIIIIl[136] = (-21523) & 22522;
        lIllIIIIIl[137] = (-12297) & 13196;
        lIllIIIIIl[138] = (-((-18497) & 23617)) & (-24650) & 30719;
        lIllIIIIIl[139] = (-12321) & 14270;
        lIllIIIIIl[140] = (-4402) & 16379;
        lIllIIIIIl[141] = (-(9 ^ 43)) & (-4609) & 30591;
        lIllIIIIIl[142] = (63 ^ 0) ^ (101 ^ 61);
        lIllIIIIIl[143] = 106 ^ 2;
        lIllIIIIIl[144] = 20 ^ 125;
        lIllIIIIIl[145] = (231 ^ 144) ^ (53 ^ 40);
        lIllIIIIIl[146] = 173 ^ 198;
        lIllIIIIIl[147] = (197 ^ 149) ^ (252 ^ 192);
        lIllIIIIIl[148] = 83 ^ 62;
        lIllIIIIIl[149] = 107 ^ 5;
        lIllIIIIIl[150] = (184 ^ 131) ^ (204 ^ 152);
        lIllIIIIIl[151] = 102 ^ 22;
        lIllIIIIIl[152] = 107 ^ 26;
        lIllIIIIIl[153] = (((5 + 109) - (-12)) + 93) ^ (((111 + 74) - 87) + 71);
        lIllIIIIIl[154] = (141 ^ 157) ^ (226 ^ 129);
        lIllIIIIIl[155] = 209 ^ 165;
        lIllIIIIIl[156] = 232 ^ 157;
        lIllIIIIIl[157] = 92 ^ 42;
        lIllIIIIIl[158] = (((93 + 48) - (-19)) + 45) ^ (((162 + 151) - 246) + 119);
        lIllIIIIIl[159] = 10 ^ 114;
        lIllIIIIIl[160] = 226 ^ 155;
        lIllIIIIIl[161] = (30 ^ 54) ^ (86 ^ 4);
        lIllIIIIIl[162] = (((12 + 207) - 136) + 143) ^ (((59 + 93) - 140) + 141);
        lIllIIIIIl[163] = (118 ^ 78) ^ (202 ^ 142);
        lIllIIIIIl[164] = (27 ^ 69) ^ (68 ^ 103);
        lIllIIIIIl[165] = 86 ^ 40;
        lIllIIIIIl[166] = ((84 + 107) - 95) + 31;
        lIllIIIIIl[167] = (((160 ^ 137) + (74 ^ 46)) - (89 ^ 122)) + (79 ^ 89);
        lIllIIIIIl[168] = ((96 + 123) - 211) + 121;
        lIllIIIIIl[169] = (((164 ^ 148) + (207 ^ 179)) - (((39 + 35) - (-81)) + 10)) + (106 ^ 17);
        lIllIIIIIl[170] = ((27 + 65) - 24) + 63;
        lIllIIIIIl[171] = ((30 + 97) - 80) + 85;
        lIllIIIIIl[172] = (((166 ^ 198) + (12 ^ 11)) - (57 ^ 37)) + (183 ^ 141);
        lIllIIIIIl[173] = (((135 ^ 197) + (232 ^ 170)) - (134 ^ 171)) + (77 ^ 98);
        lIllIIIIIl[174] = ((25 + 7) - 25) + 128;
        lIllIIIIIl[175] = (((2 ^ 26) + (((53 + 77) - 6) + 4)) - (186 ^ 139)) + (185 ^ 152);
        lIllIIIIIl[176] = (((230 ^ 185) + (117 ^ 83)) - (100 ^ 107)) + (0 ^ 19);
        lIllIIIIIl[177] = ((21 + 93) - 32) + 56;
        lIllIIIIIl[178] = (("   ".length() + (157 ^ 175)) - (164 ^ 160)) + (233 ^ 179);
        lIllIIIIIl[179] = (((175 ^ 184) + (151 ^ 194)) - (-"  ".length())) + (140 ^ 146);
        lIllIIIIIl[180] = ((101 + 37) - 22) + 25;
        lIllIIIIIl[181] = (((241 ^ 141) + (174 ^ 186)) - (24 ^ 48)) + (92 ^ 122);
        lIllIIIIIl[182] = ((96 + 109) - 188) + 126;
        lIllIIIIIl[183] = ((4 + 100) - 17) + 57;
        lIllIIIIIl[184] = (((243 ^ 143) + (((92 + 19) - (-7)) + 10)) - (((127 + 82) - 165) + 85)) + (86 ^ 64);
        lIllIIIIIl[185] = (((39 ^ 0) + (((121 + 38) - 28) + 6)) - (232 ^ 167)) + (97 ^ 80);
        lIllIIIIIl[186] = (((85 ^ 2) + (199 ^ 164)) - (77 ^ 20)) + (99 ^ 81);
        lIllIIIIIl[187] = (((51 ^ 43) + (221 ^ 152)) - (-(109 ^ 72))) + (100 ^ 118);
        lIllIIIIIl[188] = ((61 + 58) - 89) + 119;
        lIllIIIIIl[189] = (((253 ^ 160) + (80 ^ 88)) - (67 ^ 79)) + (59 ^ 6);
        lIllIIIIIl[190] = (((19 ^ 21) + (((101 + 80) - 55) + 1)) - (118 ^ 1)) + ((74 + 63) - 15) + 15;
        lIllIIIIIl[191] = ((37 + 48) - (-31)) + 36;
        lIllIIIIIl[192] = ((67 + 37) - 41) + 90;
        lIllIIIIIl[193] = (((146 ^ 164) + (130 ^ 139)) - (-(100 ^ 54))) + (10 ^ 3);
        lIllIIIIIl[194] = (((((0 + 73) - (-22)) + 56) + (113 ^ 105)) - (19 ^ 67)) + (128 ^ 188);
        lIllIIIIIl[195] = (((61 ^ 73) + (134 ^ 161)) - (((14 + 118) - 118) + 135)) + ((19 + 112) - (-18)) + 1;
        lIllIIIIIl[196] = (("   ".length() + (45 ^ 80)) - (96 ^ 13)) + ((45 + 67) - 72) + 98;
        lIllIIIIIl[197] = ((68 + 57) - (-33)) + 0;
        lIllIIIIIl[198] = ((110 + 25) - 106) + 130;
        lIllIIIIIl[199] = ((27 + 54) - (-32)) + 47;
        lIllIIIIIl[200] = (((95 ^ 20) + (237 ^ 166)) - (73 ^ 80)) + (125 ^ 89);
        lIllIIIIIl[201] = ((161 + 139) - 197) + 59;
        lIllIIIIIl[202] = (((128 ^ 135) + (84 ^ 111)) - (-(8 ^ 4))) + (149 ^ 192);
        lIllIIIIIl[203] = (((4 ^ 78) + (((40 + 15) - 22) + 108)) - (((15 + 34) - (-72)) + 32)) + (203 ^ 173);
        lIllIIIIIl[204] = ((41 + 63) - (-15)) + 46;
        lIllIIIIIl[205] = ((35 + 103) - 76) + 104;
        lIllIIIIIl[206] = ((17 + 135) - (-6)) + 9;
        lIllIIIIIl[207] = ((30 + 36) - 40) + 142;
        lIllIIIIIl[208] = ((133 + 3) - (-20)) + 13;
        lIllIIIIIl[209] = (((105 ^ 27) + (((44 + 128) - 171) + 156)) - (((92 + 115) - 36) + 19)) + (226 ^ 187);
        lIllIIIIIl[210] = (((85 ^ 60) + (((2 + 14) - (-40)) + 91)) - (((36 + 163) - 151) + 137)) + (245 ^ 157);
        lIllIIIIIl[211] = ((5 + 3) - (-115)) + 49;
        lIllIIIIIl[212] = (((((40 + 81) - 20) + 38) + (134 ^ 142)) - (145 ^ 197)) + (64 ^ 46);
        lIllIIIIIl[213] = ((76 + 91) - 65) + 72;
        lIllIIIIIl[214] = ((86 + 94) - 45) + 40;
        lIllIIIIIl[215] = (((25 ^ 42) + (107 ^ 113)) - (57 ^ 26)) + ((118 + 22) - 82) + 76;
        lIllIIIIIl[216] = (((((33 + 52) - (-48)) + 3) + (165 ^ 162)) - (250 ^ 167)) + ((47 + 16) - 53) + 117;
        lIllIIIIIl[217] = ((95 + 158) - 141) + 66;
        lIllIIIIIl[218] = ((167 + 94) - 178) + 96;
        lIllIIIIIl[219] = ((88 + 118) - 109) + 83;
        lIllIIIIIl[220] = (((29 ^ 107) + (244 ^ 196)) - (146 ^ 195)) + (36 ^ 68);
        lIllIIIIIl[221] = ((177 + 107) - 179) + 77;
        lIllIIIIIl[222] = ((170 + 90) - 159) + 82;
        lIllIIIIIl[223] = (((141 ^ 139) + (((123 + 121) - 108) + 12)) - (103 ^ 88)) + (14 ^ 83);
        lIllIIIIIl[224] = (((((131 + 130) - 225) + 107) + (135 ^ 163)) - (63 ^ 73)) + (191 ^ 195);
        lIllIIIIIl[225] = (((44 ^ 124) + (((117 + 120) - 98) + 5)) - (((46 + 117) - 75) + 41)) + (31 ^ 68);
        lIllIIIIIl[226] = ((151 + 150) - 283) + 169;
        lIllIIIIIl[227] = (((((74 + 14) - (-31)) + 58) + (221 ^ 159)) - (148 ^ 168)) + (189 ^ 184);
        lIllIIIIIl[228] = (((((96 + 167) - 224) + 129) + (153 ^ 192)) - (((55 + 22) - (-43)) + 11)) + (5 ^ 58);
        lIllIIIIIl[229] = ((118 + 112) - 161) + 121;
        lIllIIIIIl[230] = (((34 ^ 109) + (((71 + 49) - (-8)) + 2)) - (146 ^ 197)) + (244 ^ 177);
        lIllIIIIIl[231] = (((((106 + 61) - 8) + 6) + (((71 + 49) - 9) + 38)) - (((213 + 9) - 89) + 84)) + (158 ^ 193);
        lIllIIIIIl[232] = ((144 + 134) - 166) + 81;
        lIllIIIIIl[233] = (((74 ^ 127) + (83 ^ 118)) - (-(217 ^ 184))) + (8 ^ 15);
        lIllIIIIIl[234] = ((185 + 164) - 220) + 66;
        lIllIIIIIl[235] = ((145 + 175) - 256) + 132;
        lIllIIIIIl[236] = (((223 ^ 158) + (170 ^ 174)) - (-(33 ^ 87))) + (74 ^ 64);
        lIllIIIIIl[237] = (((((31 + 85) - 78) + 96) + (((132 + 101) - 134) + 49)) - (((167 + 57) - 75) + 104)) + ((93 + 57) - 31) + 50;
        lIllIIIIIl[238] = ((35 + 3) - (-131)) + 30;
        lIllIIIIIl[239] = ((59 + 153) - 204) + 192;
        lIllIIIIIl[240] = (((((19 + 146) - 135) + 131) + (((16 + 138) - 86) + 97)) - (((14 + 6) - 6) + 117)) + (83 ^ 85);
        lIllIIIIIl[241] = ((173 + 6) - 113) + 136;
        lIllIIIIIl[242] = ((152 + 60) - 9) + 0;
        lIllIIIIIl[243] = (((229 ^ 187) + (((84 + 75) - 16) + 53)) - (125 ^ 26)) + (21 ^ 4);
        lIllIIIIIl[244] = ((61 + 18) - (-66)) + 60;
        lIllIIIIIl[245] = (((((1 + 107) - 34) + 78) + (((181 + 25) - 97) + 83)) - (((114 + 26) - 136) + 155)) + (46 ^ 59);
        lIllIIIIIl[246] = ((113 + 155) - 169) + 108;
        lIllIIIIIl[247] = (-11585) & 32730;
        lIllIIIIIl[248] = (((((71 + 17) - (-15)) + 29) + (126 ^ 93)) - (240 ^ 142)) + ((36 + 19) - (-106)) + 6;
        lIllIIIIIl[249] = ((173 + 137) - 213) + 112;
        lIllIIIIIl[250] = ((151 + 88) - 33) + 4;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            cV();
            "".length();
            if (0 != 0) {
                return (34 ^ 50) & ((209 ^ 193) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIllIIIIIl[124];
    }

    static {
        lIIlIlIllllll();
        lIIlIlIlIlIlI();
        bp = new ArrayList();
        jr = lIllIIIIIl[247];
        js = lIllIIIIIl[21];
        jy = lIllIIIIIl[0];
        jA = new ArrayList<>();
        jB = new ArrayList<>();
        jC = null;
        jD = null;
        jE = null;
        jF = null;
        jG = null;
        jH = null;
        jI = null;
        jJ = null;
        jK = null;
        jL = null;
        jM = null;
        jN = null;
        jO = null;
        jP = null;
        jQ = null;
        jR = null;
        jS = null;
        jT = null;
        jU = null;
        jV = null;
        jW = null;
        kr = lIlIllllII[lIllIIIIIl[248]];
        f4h = lIlIllllII[lIllIIIIIl[249]];
    }
}
