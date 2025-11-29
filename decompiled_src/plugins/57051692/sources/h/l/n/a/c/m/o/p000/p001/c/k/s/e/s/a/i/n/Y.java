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
import net.runelite.api.coords.WorldArea;
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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Y  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/Y.class */
public class Y implements K {
    public static final /* synthetic */ int kX;
    private static /* synthetic */ String[] lIllIllIIl;
    public static final /* synthetic */ int kW;
    public static final /* synthetic */ WorldArea kZ;
    public static /* synthetic */ int[] lc;
    public static /* synthetic */ int[] lb;
    public static final /* synthetic */ int kU;
    public static final /* synthetic */ WorldArea kY;
    public static final /* synthetic */ int kT;
    private static /* synthetic */ int[] lIllIllIlI;
    public static /* synthetic */ List<C0003d> bp;
    public static /* synthetic */ int[] kK;
    public static final /* synthetic */ int kV;
    public static /* synthetic */ boolean bn;
    public static final /* synthetic */ WorldPoint la;

    private static boolean lIIllIlIIIIIl(Object obj) {
        return obj != null;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIllIllIIl[lIllIllIlI[34]];
    }

    private static String lIIllIIlllIIl(String lllllllllllllllllllIIIIlllIIlIIl, String lllllllllllllllllllIIIIlllIIlIII) {
        try {
            SecretKeySpec lllllllllllllllllllIIIIlllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIlllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllIlI[3], lllllllllllllllllllIIIIlllIIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIlllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIIlllIIlIlI) {
            lllllllllllllllllllIIIIlllIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlllllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIllIllIlI[0];
    }

    private static boolean lIIllIlIIIIII(int i) {
        return i > 0;
    }

    private static boolean lIIllIlIIIIlI(int i, int i2) {
        return i >= i2;
    }

    private static void lIIllIIlllIll() {
        lIllIllIIl = new String[lIllIllIlI[52]];
        lIllIllIIl[lIllIllIlI[0]] = lIIllIIlllIII("ChAYJgcvRQg7DCUW", "HeaOi");
        lIllIllIIl[lIllIllIlI[1]] = lIIllIIlllIIl("kTih+o78Z7zggTadp5bwrsXc9vyAWTffPxv9cRUgidrKENPVtwLmHg2lGEl3PDjN3YjQEMs7+YU=", "rdsUs");
        lIllIllIIl[lIllIllIlI[3]] = lIIllIIlllIlI("IiNq5Br1pcyy4NLw//r8lDSq0RZ7qMJJ", "xKXhD");
        lIllIllIIl[lIllIllIlI[4]] = lIIllIIlllIlI("IIZRXz3AI7ZA0HOmhqg/wg==", "hLyoi");
        lIllIllIIl[lIllIllIlI[6]] = lIIllIIlllIlI("KyeY8qp+6RLusNXRN9dcQ8kiyApLi/Zu", "fUIuF");
        lIllIllIIl[lIllIllIlI[12]] = lIIllIIlllIII("HDJ0JCMudzksIjg+OiJxOz43LjAzMidpcTggPTEyIz46InE/OHQHBBIeGgI=", "KWTEQ");
        lIllIllIIl[lIllIllIlI[13]] = lIIllIIlllIII("CSU8HjYkOTROKiIwIA==", "MWSnF");
        lIllIllIIl[lIllIllIlI[14]] = lIIllIIlllIII("Bjk9JzwrJTV3IC0sIQ==", "BKRWL");
        lIllIllIIl[lIllIllIlI[16]] = lIIllIIlllIIl("yZaFUvNEgG6nn+YXr4zfxkbR8Jz9IL6F", "EMfoa");
        lIllIllIIl[lIllIllIlI[17]] = lIIllIIlllIII("MjoJODwYPAE=", "qRfHL");
        lIllIllIIl[lIllIllIlI[18]] = lIIllIIlllIlI("KAEqJsVTzdjBZYtZZD4kog==", "lqOCC");
        lIllIllIIl[lIllIllIlI[19]] = lIIllIIlllIIl("QK1a2rsonl1bvPJ6RBTI0Q==", "sxfcb");
        lIllIllIIl[lIllIllIlI[20]] = lIIllIIlllIII("ExgmEycqHmoMIWQWKxNuMAsvHT0=", "DyJxN");
        lIllIllIIl[lIllIllIlI[21]] = lIIllIIlllIIl("xenTL+cF64rZrzbYUfr8Xg==", "eJpBQ");
        lIllIllIIl[lIllIllIlI[22]] = lIIllIIlllIlI("yfq+RkNtlxWLQa+n6uxlcrqcfuU8DQk/", "DCxrm");
        lIllIllIIl[lIllIllIlI[15]] = lIIllIIlllIII("LQYDBWwKARsb", "nnluL");
        lIllIllIIl[lIllIllIlI[34]] = lIIllIIlllIIl("+prbG8RmdoMFcdrqHy8PoA==", "mjdum");
        lIllIllIIl[lIllIllIlI[36]] = lIIllIIlllIII("ARgaBHUcF1QUMBIdAAt1Ww==", "sqtcU");
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        dQ();
        return lIllIllIlI[33];
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (lIIllIlIIIIII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017b, code lost:
        if (lIIllIlIIIIlI(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.Y.lIllIllIlI[1]) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ba, code lost:
        if (lIIllIlIIIIlI(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.Y.lIllIllIlI[1]) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f9, code lost:
        if (lIIllIlIIIIlI(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.Y.lIllIllIlI[1]) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0238, code lost:
        if (lIIllIlIIIIlI(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.Y.lIllIllIlI[1]) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0277, code lost:
        if (lIIllIIlllllI(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.Y.lIllIllIlI[1]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027a, code lost:
        O();
        java.lang.System.out.println(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.Y.lIllIllIIl[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.Y.lIllIllIlI[12]]);
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.Y.bn = h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.Y.lIllIllIlI[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0295, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v251, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dQ() {
        if (lIIllIIllllIl(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[0]];
            C0001b.a(bp);
            if (lIIllIIlllllI(bp.size(), lIllIllIlI[1])) {
                System.out.println(lIllIllIIl[lIllIllIlI[1]]);
                bn = lIllIllIlI[0];
            }
        }
        if (lIIllIIllllll(bn ? 1 : 0)) {
            if (lIIllIIllllIl(al() ? 1 : 0)) {
                int[] iArr = new int[lIllIllIlI[1]];
                iArr[lIllIllIlI[0]] = lIllIllIlI[2];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (lIIllIlIIIIIl(nearest) && lIIllIIllllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[3]];
                C0000a.a(nearest);
            }
            if (lIIllIlIIIIIl(nearest) && lIIllIIllllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIIllIIllllll(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[4]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIllIllIlI[5]);
                    "".length();
                }
                if (lIIllIIllllIl(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[6]];
                    if (lIIllIlIIIIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIllIllIlI[6]);
                        "".length();
                    }
                    if (lIIllIlIIIIII(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lIllIllIlI[3]);
                        "".length();
                    }
                    int[] iArr2 = new int[lIllIllIlI[1]];
                    iArr2[lIllIllIlI[0]] = lIllIllIlI[7];
                    if (lIIllIIllllll(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIllIllIlI[1]];
                        iArr3[lIllIllIlI[0]] = lIllIllIlI[7];
                    }
                    int[] iArr4 = new int[lIllIllIlI[1]];
                    iArr4[lIllIllIlI[0]] = lIllIllIlI[8];
                    if (lIIllIIllllll(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIllIllIlI[1]];
                        iArr5[lIllIllIlI[0]] = lIllIllIlI[8];
                    }
                    int[] iArr6 = new int[lIllIllIlI[1]];
                    iArr6[lIllIllIlI[0]] = lIllIllIlI[9];
                    if (lIIllIIllllll(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIllIllIlI[1]];
                        iArr7[lIllIllIlI[0]] = lIllIllIlI[9];
                    }
                    int[] iArr8 = new int[lIllIllIlI[1]];
                    iArr8[lIllIllIlI[0]] = lIllIllIlI[10];
                    if (lIIllIIllllll(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lIllIllIlI[1]];
                        iArr9[lIllIllIlI[0]] = lIllIllIlI[10];
                    }
                    int[] iArr10 = new int[lIllIllIlI[1]];
                    iArr10[lIllIllIlI[0]] = lIllIllIlI[11];
                    if (lIIllIIllllll(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIllIllIlI[1]];
                        iArr11[lIllIllIlI[0]] = lIllIllIlI[11];
                    }
                    int[] iArr12 = new int[lIllIllIlI[1]];
                    iArr12[lIllIllIlI[0]] = lIllIllIlI[7];
                    if (lIIllIIllllIl(Bank.contains(iArr12) ? 1 : 0)) {
                        Bank.withdraw(lIllIllIlI[7], lIllIllIlI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllIllIlI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr13 = new int[lIllIllIlI[1]];
                            iArr13[lIllIllIlI[0]] = lIllIllIlI[7];
                            if (lIIllIlIIIIII(Inventory.getCount(iArr13))) {
                                ?? r0 = lIllIllIlI[1];
                                "".length();
                                return " ".length() < 0 ? ((82 ^ 9) ^ (104 ^ 15)) & (((((19 + 38) - (-36)) + 51) ^ (((91 + 132) - 137) + 86)) ^ (-" ".length())) : r0;
                            }
                            return lIllIllIlI[0];
                        }, lIllIllIlI[5]);
                        "".length();
                    }
                    int[] iArr13 = new int[lIllIllIlI[1]];
                    iArr13[lIllIllIlI[0]] = lIllIllIlI[8];
                    if (lIIllIIllllIl(Bank.contains(iArr13) ? 1 : 0)) {
                        Bank.withdraw(lIllIllIlI[8], lIllIllIlI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllIllIlI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr14 = new int[lIllIllIlI[1]];
                            iArr14[lIllIllIlI[0]] = lIllIllIlI[8];
                            if (lIIllIlIIIIII(Inventory.getCount(iArr14))) {
                                ?? r0 = lIllIllIlI[1];
                                "".length();
                                return (79 ^ 75) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllIllIlI[0];
                        }, lIllIllIlI[5]);
                        "".length();
                    }
                    int[] iArr14 = new int[lIllIllIlI[1]];
                    iArr14[lIllIllIlI[0]] = lIllIllIlI[9];
                    if (lIIllIIllllIl(Bank.contains(iArr14) ? 1 : 0)) {
                        Bank.withdraw(lIllIllIlI[9], lIllIllIlI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllIllIlI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr15 = new int[lIllIllIlI[1]];
                            iArr15[lIllIllIlI[0]] = lIllIllIlI[9];
                            if (lIIllIlIIIIII(Inventory.getCount(iArr15))) {
                                ?? r0 = lIllIllIlI[1];
                                "".length();
                                return " ".length() <= (-" ".length()) ? ((10 ^ 57) ^ (84 ^ 92)) & (((((170 + 151) - 318) + 171) ^ (((125 + 73) - 101) + 52)) ^ (-" ".length())) : r0;
                            }
                            return lIllIllIlI[0];
                        }, lIllIllIlI[5]);
                        "".length();
                    }
                    int[] iArr15 = new int[lIllIllIlI[1]];
                    iArr15[lIllIllIlI[0]] = lIllIllIlI[10];
                    if (lIIllIIllllIl(Bank.contains(iArr15) ? 1 : 0)) {
                        Bank.withdraw(lIllIllIlI[10], lIllIllIlI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllIllIlI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lIllIllIlI[1]];
                            iArr16[lIllIllIlI[0]] = lIllIllIlI[10];
                            if (lIIllIlIIIIII(Inventory.getCount(iArr16))) {
                                ?? r0 = lIllIllIlI[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllIllIlI[0];
                        }, lIllIllIlI[5]);
                        "".length();
                    }
                    int[] iArr16 = new int[lIllIllIlI[1]];
                    iArr16[lIllIllIlI[0]] = lIllIllIlI[11];
                    if (lIIllIIllllIl(Bank.contains(iArr16) ? 1 : 0)) {
                        Bank.withdraw(lIllIllIlI[11], lIllIllIlI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllIllIlI[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr17 = new int[lIllIllIlI[1]];
                            iArr17[lIllIllIlI[0]] = lIllIllIlI[11];
                            if (lIIllIlIIIIII(Inventory.getCount(iArr17))) {
                                ?? r0 = lIllIllIlI[1];
                                "".length();
                                return "   ".length() == (184 ^ 188) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllIllIlI[0];
                        }, lIllIllIlI[5]);
                        "".length();
                    }
                }
            }
            if (lIIllIIllllIl(al() ? 1 : 0)) {
                if (lIIllIIllllIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[13]];
                    System.out.println(lIllIllIIl[lIllIllIlI[14]]);
                    Inventory.getAll(kK).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (lIIllIIllllll(Inventory.isFull() ? 1 : 0)) {
                    if (lIIllIIlllllI(Skills.getLevel(Skill.WOODCUTTING), lIllIllIlI[15])) {
                        if (lIIllIIllllll(kY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[16]];
                            Movement.walkTo(kY.toWorldPoint());
                            "".length();
                            Time.sleepTicks(lIllIllIlI[6]);
                            "".length();
                        }
                        if (lIIllIIllllIl(kY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[17]];
                            TileObject nearest2 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), lb);
                            if (lIIllIIllllll(Players.getLocal().isAnimating() ? 1 : 0) && lIIllIIllllll(Players.getLocal().isMoving() ? 1 : 0) && lIIllIlIIIIIl(nearest2)) {
                                System.out.println(lIllIllIIl[lIllIllIlI[18]]);
                                nearest2.interact(lIllIllIIl[lIllIllIlI[19]]);
                                Time.sleepTicks(lIllIllIlI[4]);
                                "".length();
                            }
                        }
                    }
                    if (lIIllIlIIIIlI(Skills.getLevel(Skill.WOODCUTTING), lIllIllIlI[15])) {
                        if (lIIllIIllllll(kZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[20]];
                            Movement.walkTo(la);
                            "".length();
                            Time.sleepTicks(lIllIllIlI[6]);
                            "".length();
                        }
                        if (lIIllIIllllIl(kZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIllIIl[lIllIllIlI[21]];
                            TileObject nearest3 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), lc);
                            if (lIIllIIllllll(Players.getLocal().isAnimating() ? 1 : 0) && lIIllIIllllll(Players.getLocal().isMoving() ? 1 : 0) && lIIllIlIIIIIl(nearest3)) {
                                System.out.println(lIllIllIIl[lIllIllIlI[22]]);
                                nearest3.interact(lIllIllIIl[lIllIllIlI[15]]);
                                Time.sleepTicks(lIllIllIlI[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIllIIllllll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public static boolean al() {
        if (lIIllIlIIIIlI(Skills.getLevel(Skill.WOODCUTTING), lIllIllIlI[23])) {
            int[] iArr = new int[lIllIllIlI[1]];
            iArr[lIllIllIlI[0]] = lIllIllIlI[11];
            if (lIIllIlIIIIII(Inventory.getCount(iArr))) {
                ?? r0 = lIllIllIlI[1];
                "".length();
                return " ".length() < 0 ? ((198 ^ 189) ^ (6 ^ 46)) & (((((82 + 5) - 26) + 185) ^ (((15 + 51) - (-2)) + 97)) ^ (-" ".length())) : r0;
            }
            return lIllIllIlI[0];
        } else if (lIIllIlIIIIlI(Skills.getLevel(Skill.WOODCUTTING), lIllIllIlI[24]) && lIIllIIlllllI(Skills.getLevel(Skill.WOODCUTTING), lIllIllIlI[23])) {
            int[] iArr2 = new int[lIllIllIlI[1]];
            iArr2[lIllIllIlI[0]] = lIllIllIlI[11];
            if (lIIllIlIIIIII(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIllIllIlI[1]];
                iArr3[lIllIllIlI[0]] = lIllIllIlI[10];
                if (lIIllIlIIIIII(Inventory.getCount(iArr3))) {
                    ?? r02 = lIllIllIlI[1];
                    "".length();
                    return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
            return lIllIllIlI[0];
        } else if (lIIllIlIIIIlI(Skills.getLevel(Skill.WOODCUTTING), lIllIllIlI[25]) && lIIllIIlllllI(Skills.getLevel(Skill.WOODCUTTING), lIllIllIlI[24])) {
            int[] iArr4 = new int[lIllIllIlI[1]];
            iArr4[lIllIllIlI[0]] = lIllIllIlI[11];
            if (lIIllIlIIIIII(Inventory.getCount(iArr4))) {
                int[] iArr5 = new int[lIllIllIlI[1]];
                iArr5[lIllIllIlI[0]] = lIllIllIlI[10];
                if (lIIllIlIIIIII(Inventory.getCount(iArr5))) {
                    int[] iArr6 = new int[lIllIllIlI[1]];
                    iArr6[lIllIllIlI[0]] = lIllIllIlI[9];
                    if (lIIllIlIIIIII(Inventory.getCount(iArr6))) {
                        ?? r03 = lIllIllIlI[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                    }
                }
            }
            return lIllIllIlI[0];
        } else if (lIIllIlIIIIlI(Skills.getLevel(Skill.WOODCUTTING), lIllIllIlI[13]) && lIIllIIlllllI(Skills.getLevel(Skill.WOODCUTTING), lIllIllIlI[25])) {
            int[] iArr7 = new int[lIllIllIlI[1]];
            iArr7[lIllIllIlI[0]] = lIllIllIlI[11];
            if (lIIllIlIIIIII(Inventory.getCount(iArr7))) {
                int[] iArr8 = new int[lIllIllIlI[1]];
                iArr8[lIllIllIlI[0]] = lIllIllIlI[10];
                if (lIIllIlIIIIII(Inventory.getCount(iArr8))) {
                    int[] iArr9 = new int[lIllIllIlI[1]];
                    iArr9[lIllIllIlI[0]] = lIllIllIlI[9];
                    if (lIIllIlIIIIII(Inventory.getCount(iArr9))) {
                        int[] iArr10 = new int[lIllIllIlI[1]];
                        iArr10[lIllIllIlI[0]] = lIllIllIlI[8];
                        if (lIIllIlIIIIII(Inventory.getCount(iArr10))) {
                            ?? r04 = lIllIllIlI[1];
                            "".length();
                            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r04;
                        }
                    }
                }
            }
            return lIllIllIlI[0];
        } else {
            int[] iArr11 = new int[lIllIllIlI[1]];
            iArr11[lIllIllIlI[0]] = lIllIllIlI[11];
            if (lIIllIlIIIIII(Inventory.getCount(iArr11))) {
                int[] iArr12 = new int[lIllIllIlI[1]];
                iArr12[lIllIllIlI[0]] = lIllIllIlI[10];
                if (lIIllIlIIIIII(Inventory.getCount(iArr12))) {
                    int[] iArr13 = new int[lIllIllIlI[1]];
                    iArr13[lIllIllIlI[0]] = lIllIllIlI[9];
                    if (lIIllIlIIIIII(Inventory.getCount(iArr13))) {
                        int[] iArr14 = new int[lIllIllIlI[1]];
                        iArr14[lIllIllIlI[0]] = lIllIllIlI[8];
                        if (lIIllIlIIIIII(Inventory.getCount(iArr14))) {
                            int[] iArr15 = new int[lIllIllIlI[1]];
                            iArr15[lIllIllIlI[0]] = lIllIllIlI[7];
                            if (lIIllIlIIIIII(Inventory.getCount(iArr15))) {
                                ?? r05 = lIllIllIlI[1];
                                "".length();
                                return 0 != 0 ? ((((59 + 18) - (-27)) + 36) ^ (((115 + 27) - 49) + 57)) & (((63 ^ 82) ^ (126 ^ 9)) ^ (-" ".length())) : r05;
                            }
                        }
                    }
                }
            }
            return lIllIllIlI[0];
        }
    }

    private static boolean lIIllIIllllIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIllIlIIIIlI(Skills.getLevel(Skill.WOODCUTTING), lIllIllIlI[35])) {
            ?? r0 = lIllIllIlI[1];
            "".length();
            return ((168 ^ 158) & ((124 ^ 74) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIllIlI[0];
    }

    static {
        lIIllIIllllII();
        lIIllIIlllIll();
        kX = lIllIllIlI[11];
        kU = lIllIllIlI[8];
        kW = lIllIllIlI[10];
        kT = lIllIllIlI[7];
        kV = lIllIllIlI[9];
        kY = new WorldArea(lIllIllIlI[37], lIllIllIlI[38], lIllIllIlI[34], lIllIllIlI[39], lIllIllIlI[0]);
        kZ = new WorldArea(lIllIllIlI[40], lIllIllIlI[41], lIllIllIlI[22], lIllIllIlI[34], lIllIllIlI[0]);
        la = new WorldPoint(lIllIllIlI[42], lIllIllIlI[43], lIllIllIlI[0]);
        int[] iArr = new int[lIllIllIlI[6]];
        iArr[lIllIllIlI[0]] = lIllIllIlI[44];
        iArr[lIllIllIlI[1]] = lIllIllIlI[45];
        iArr[lIllIllIlI[3]] = lIllIllIlI[46];
        iArr[lIllIllIlI[4]] = lIllIllIlI[47];
        lb = iArr;
        int[] iArr2 = new int[lIllIllIlI[1]];
        iArr2[lIllIllIlI[0]] = lIllIllIlI[48];
        lc = iArr2;
        int[] iArr3 = new int[lIllIllIlI[4]];
        iArr3[lIllIllIlI[0]] = lIllIllIlI[49];
        iArr3[lIllIllIlI[1]] = lIllIllIlI[50];
        iArr3[lIllIllIlI[3]] = lIllIllIlI[51];
        kK = iArr3;
        bp = new ArrayList();
    }

    private static String lIIllIIlllIII(String lllllllllllllllllllIIIIlllIllllI, String lllllllllllllllllllIIIIlllIlllIl) {
        String lllllllllllllllllllIIIIlllIllllI2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIIlllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIIIlllIlllII = new StringBuilder();
        char[] charArray = lllllllllllllllllllIIIIlllIlllIl.toCharArray();
        int lllllllllllllllllllIIIIlllIllIlI = lIllIllIlI[0];
        char[] charArray2 = lllllllllllllllllllIIIIlllIllllI2.toCharArray();
        int length = charArray2.length;
        int i = lIllIllIlI[0];
        while (lIIllIIlllllI(i, length)) {
            char lllllllllllllllllllIIIIlllIlllll = charArray2[i];
            lllllllllllllllllllIIIIlllIlllII.append((char) (lllllllllllllllllllIIIIlllIlllll ^ charArray[lllllllllllllllllllIIIIlllIllIlI % charArray.length]));
            "".length();
            lllllllllllllllllllIIIIlllIllIlI++;
            i++;
            "".length();
            if (((70 ^ 72) & ((68 ^ 74) ^ (-1))) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllIIIIlllIlllII);
    }

    public static void O() {
        int[] iArr = new int[lIllIllIlI[1]];
        iArr[lIllIllIlI[0]] = lIllIllIlI[7];
        if (lIIllIIllllll(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(lIllIllIlI[7], lIllIllIlI[1], lIllIllIlI[5]));
            "".length();
        }
        int[] iArr2 = new int[lIllIllIlI[1]];
        iArr2[lIllIllIlI[0]] = lIllIllIlI[8];
        if (lIIllIIllllll(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIllIllIlI[8], lIllIllIlI[1], lIllIllIlI[5]));
            "".length();
        }
        int[] iArr3 = new int[lIllIllIlI[1]];
        iArr3[lIllIllIlI[0]] = lIllIllIlI[9];
        if (lIIllIIllllll(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIllIllIlI[9], lIllIllIlI[1], lIllIllIlI[26]));
            "".length();
        }
        int[] iArr4 = new int[lIllIllIlI[1]];
        iArr4[lIllIllIlI[0]] = lIllIllIlI[10];
        if (lIIllIIllllll(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIllIllIlI[10], lIllIllIlI[1], lIllIllIlI[27]));
            "".length();
        }
        int[] iArr5 = new int[lIllIllIlI[1]];
        iArr5[lIllIllIlI[0]] = lIllIllIlI[11];
        if (lIIllIIllllll(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIllIllIlI[11], lIllIllIlI[1], lIllIllIlI[28]));
            "".length();
        }
        if (lIIllIIllllll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIllIllIIl[lIllIllIlI[36]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIllIllIlI[29], lIllIllIlI[12], lIllIllIlI[28]));
            "".length();
        }
        int[] iArr6 = new int[lIllIllIlI[1]];
        iArr6[lIllIllIlI[0]] = lIllIllIlI[30];
        if (lIIllIIllllll(Bank.contains(iArr6) ? 1 : 0)) {
            bp.add(new C0003d(lIllIllIlI[30], lIllIllIlI[31], lIllIllIlI[32]));
            "".length();
        }
    }

    private static String lIIllIIlllIlI(String lllllllllllllllllllIIIIllIllllII, String lllllllllllllllllllIIIIllIlllIll) {
        try {
            SecretKeySpec lllllllllllllllllllIIIIllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIllIlllIll.getBytes(StandardCharsets.UTF_8)), lIllIllIlI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIllIlI[3], lllllllllllllllllllIIIIllIllllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIIllIllllIl) {
            lllllllllllllllllllIIIIllIllllIl.printStackTrace();
            return null;
        }
    }

    private static void lIIllIIllllII() {
        lIllIllIlI = new int[53];
        lIllIllIlI[0] = (48 ^ 102) & ((57 ^ 111) ^ (-1));
        lIllIllIlI[1] = " ".length();
        lIllIllIlI[2] = (-1037) & 2031;
        lIllIllIlI[3] = "  ".length();
        lIllIllIlI[4] = "   ".length();
        lIllIllIlI[5] = (-25605) & 30604;
        lIllIllIlI[6] = 9 ^ 13;
        lIllIllIlI[7] = (-1) & 1351;
        lIllIllIlI[8] = (-((-16411) & 28859)) & (-16919) & 30719;
        lIllIllIlI[9] = (-27137) & 28491;
        lIllIllIlI[10] = (-20995) & 22351;
        lIllIllIlI[11] = (-12929) & 14287;
        lIllIllIlI[12] = 92 ^ 89;
        lIllIllIlI[13] = 140 ^ 138;
        lIllIllIlI[14] = (((32 + 8) - 26) + 176) ^ (((22 + 106) - 127) + 184);
        lIllIllIlI[15] = 64 ^ 79;
        lIllIllIlI[16] = 42 ^ 34;
        lIllIllIlI[17] = 73 ^ 64;
        lIllIllIlI[18] = 144 ^ 154;
        lIllIllIlI[19] = (64 ^ 10) ^ (130 ^ 195);
        lIllIllIlI[20] = 104 ^ 100;
        lIllIllIlI[21] = (55 ^ 2) ^ (100 ^ 92);
        lIllIllIlI[22] = 201 ^ 199;
        lIllIllIlI[23] = (6 ^ 89) ^ (16 ^ 102);
        lIllIllIlI[24] = 157 ^ 130;
        lIllIllIlI[25] = (33 ^ 31) ^ (153 ^ 178);
        lIllIllIlI[26] = (-((-141) & 6366)) & (-17543) & 32767;
        lIllIllIlI[27] = (-((-17158) & 21271)) & (-259) & 16371;
        lIllIllIlI[28] = (-((-26772) & 30935)) & (-2053) & 31215;
        lIllIllIlI[29] = (-((-1039) & 21551)) & (-19) & 32510;
        lIllIllIlI[30] = (-(((31 + 120) - (-17)) + 17)) & (-8193) & 16383;
        lIllIllIlI[31] = (160 ^ 191) ^ (136 ^ 191);
        lIllIllIlI[32] = (-((-20841) & 22889)) & (-16418) & 19365;
        lIllIllIlI[33] = 213 ^ 177;
        lIllIllIlI[34] = 66 ^ 82;
        lIllIllIlI[35] = (38 ^ 45) ^ (111 ^ 7);
        lIllIllIlI[36] = (((69 + 61) - 74) + 73) ^ (((95 + 30) - 22) + 41);
        lIllIllIlI[37] = (-((-7585) & 15787)) & (-21121) & 32479;
        lIllIllIlI[38] = (-((-25773) & 26302)) & (-20673) & 24575;
        lIllIllIlI[39] = 95 ^ 114;
        lIllIllIlI[40] = (-((-16505) & 29177)) & (-2) & 15871;
        lIllIllIlI[41] = (-8775) & 12135;
        lIllIllIlI[42] = (-((-10308) & 31343)) & (-8529) & 32767;
        lIllIllIlI[43] = (-16977) & 20341;
        lIllIllIlI[44] = (-2) & 1277;
        lIllIllIlI[45] = (-258) & 1535;
        lIllIllIlI[46] = (-(5 ^ 24)) & (-26721) & 28030;
        lIllIllIlI[47] = (-((-30977) & 31634)) & (-6145) & 8087;
        lIllIllIlI[48] = (-((-2387) & 24059)) & (-18) & 32509;
        lIllIllIlI[49] = (-((-3285) & 24277)) & (-10249) & 32751;
        lIllIllIlI[50] = (-12299) & 13819;
        lIllIllIlI[51] = (-12305) & 13823;
        lIllIllIlI[52] = (((66 + 97) - 32) + 9) ^ (((118 + 97) - 76) + 19);
    }
}
