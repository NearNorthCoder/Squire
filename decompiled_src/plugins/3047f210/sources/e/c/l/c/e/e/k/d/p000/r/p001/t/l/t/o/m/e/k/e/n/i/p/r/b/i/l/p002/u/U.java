package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.U  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/U.class */
public class U implements S {
    public static /* synthetic */ WorldPoint je;
    public static /* synthetic */ WorldPoint bw;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ List<C0003d> bu;
    public static /* synthetic */ WorldArea jc;
    public static /* synthetic */ WorldPoint jd;
    private static /* synthetic */ String[] lllIllIIIl;
    public static /* synthetic */ int[] iZ;
    public static /* synthetic */ WorldArea jb;
    private static /* synthetic */ int[] lllIllIIlI;
    public static /* synthetic */ WorldArea ja;

    private static boolean llIIlIIIIIIIl(int i) {
        return i != 0;
    }

    private static String llIIIlllllIll(String lllllllllllllllllIllIlIIllIIIIII, String lllllllllllllllllIllIlIIlIllllll) {
        try {
            SecretKeySpec lllllllllllllllllIllIlIIllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllIlIIllIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllIlIIllIIIIlI.init(lllIllIIlI[3], lllllllllllllllllIllIlIIllIIIIll);
            return new String(lllllllllllllllllIllIlIIllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIIllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIlIIllIIIIIl) {
            lllllllllllllllllIllIlIIllIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIIIIll(int i) {
        return i == 0;
    }

    public static void dC() {
        if (llIIlIIIIIIlI(Skills.getLevel(Skill.DEFENCE), lllIllIIlI[2])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
    }

    private static boolean llIIlIIIIlIIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0255, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dz() {
        if (llIIlIIIIIIIl(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIllIIIl[lllIllIIlI[0]];
            C0001b.a(bu);
            if (llIIlIIIIIIlI(bu.size(), lllIllIIlI[1])) {
                System.out.println(lllIllIIIl[lllIllIIlI[1]]);
                bs = lllIllIIlI[0];
            }
        }
        if (llIIlIIIIIIll(bs ? 1 : 0)) {
            if (llIIlIIIIIIll(bz() ? 1 : 0) && llIIlIIIIIIlI(Skills.getLevel(Skill.DEFENCE), lllIllIIlI[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIlIIIIIlII(nearest) && llIIlIIIIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIllIIIl[lllIllIIlI[3]];
                    C0000a.a(nearest);
                }
                if (llIIlIIIIIlII(nearest) && llIIlIIIIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIllIIIl[lllIllIIlI[4]];
                    if (llIIlIIIIIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIllIIlI[5]);
                        "".length();
                    }
                    if (llIIlIIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (llIIlIIIIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIllIIlI[1]);
                            "".length();
                        }
                        if (llIIlIIIIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIllIIlI[3]);
                            "".length();
                        }
                        if (llIIlIIIIIIll(dB() ? 1 : 0)) {
                            ae();
                            System.out.println(lllIllIIIl[lllIllIIlI[6]]);
                            bs = lllIllIIlI[1];
                            return;
                        }
                        C0000a.a(iZ, lllIllIIlI[1]);
                        C0000a.a(lllIllIIlI[7], lllIllIIlI[8]);
                        C0000a.b(C0005f.aU, lllIllIIlI[1]);
                        C0000a.a(lllIllIIlI[9], lllIllIIlI[10]);
                        C0000a.a(lllIllIIlI[11], lllIllIIlI[12]);
                    }
                }
            }
            if (llIIlIIIIIIIl(bz() ? 1 : 0)) {
                dA();
                if (llIIlIIIIIllI(Movement.getRunEnergy(), lllIllIIlI[13]) && llIIlIIIIIIll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                String[] strArr = new String[lllIllIIlI[1]];
                strArr[lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[10]];
                if (llIIlIIIIIIll(Equipment.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIllIIlI[1]];
                    strArr2[lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[14]];
                    if (llIIlIIIIIIll(Equipment.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[lllIllIIlI[1]];
                        strArr3[lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[15]];
                        if (llIIlIIIIIIll(Equipment.contains(strArr3) ? 1 : 0)) {
                            int[] iArr = new int[lllIllIIlI[1]];
                            iArr[lllIllIIlI[0]] = lllIllIIlI[16];
                            if (llIIlIIIIIIll(Equipment.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lllIllIIlI[1]];
                                iArr2[lllIllIIlI[0]] = lllIllIIlI[17];
                            }
                        }
                    }
                }
                dC();
                if (llIIlIIIIIlll(llIIlIIIIIIII(C0004e.u(), 45.0d))) {
                    int[] iArr3 = new int[lllIllIIlI[1]];
                    iArr3[lllIllIIlI[0]] = lllIllIIlI[11];
                    if (llIIlIIIIIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllIllIIlI[1]];
                        iArr4[lllIllIIlI[0]] = lllIllIIlI[11];
                        Inventory.getFirst(iArr4).interact(lllIllIIIl[lllIllIIlI[18]]);
                        Time.sleepTicks(lllIllIIlI[1]);
                        "".length();
                    }
                }
                if (llIIlIIIIIllI(Skills.getLevel(Skill.ATTACK), lllIllIIlI[19]) && llIIlIIIIIllI(Skills.getLevel(Skill.STRENGTH), lllIllIIlI[19])) {
                    C0009j.Q();
                }
            }
        }
    }

    public static void ae() {
        int[] iArr = new int[lllIllIIlI[1]];
        iArr[lllIllIIlI[0]] = lllIllIIlI[9];
        if (llIIlIIIIIIll(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIlI[9], lllIllIIlI[2], lllIllIIlI[51]));
            "".length();
        }
        int[] iArr2 = new int[lllIllIIlI[1]];
        iArr2[lllIllIIlI[0]] = lllIllIIlI[52];
        if (llIIlIIIIIIll(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIlI[52], lllIllIIlI[10], lllIllIIlI[51]));
            "".length();
        }
        int[] iArr3 = new int[lllIllIIlI[1]];
        iArr3[lllIllIIlI[0]] = lllIllIIlI[49];
        if (llIIlIIIIIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIlI[49], lllIllIIlI[1], lllIllIIlI[53]));
            "".length();
        }
        int[] iArr4 = new int[lllIllIIlI[1]];
        iArr4[lllIllIIlI[0]] = lllIllIIlI[47];
        if (llIIlIIIIIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIlI[47], lllIllIIlI[1], lllIllIIlI[54]));
            "".length();
        }
        int[] iArr5 = new int[lllIllIIlI[1]];
        iArr5[lllIllIIlI[0]] = lllIllIIlI[11];
        if (llIIlIIIIIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIlI[11], lllIllIIlI[12], lllIllIIlI[55]));
            "".length();
        }
        int[] iArr6 = new int[lllIllIIlI[1]];
        iArr6[lllIllIIlI[0]] = lllIllIIlI[40];
        if (llIIlIIIIIIll(Bank.contains(iArr6) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIlI[40], lllIllIIlI[1], lllIllIIlI[56]));
            "".length();
        }
        int[] iArr7 = new int[lllIllIIlI[1]];
        iArr7[lllIllIIlI[0]] = lllIllIIlI[44];
        if (llIIlIIIIIIll(Bank.contains(iArr7) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIlI[44], lllIllIIlI[1], lllIllIIlI[56]));
            "".length();
        }
        int[] iArr8 = new int[lllIllIIlI[1]];
        iArr8[lllIllIIlI[0]] = lllIllIIlI[45];
        if (llIIlIIIIIIll(Bank.contains(iArr8) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIlI[45], lllIllIIlI[1], lllIllIIlI[56]));
            "".length();
        }
        int[] iArr9 = new int[lllIllIIlI[1]];
        iArr9[lllIllIIlI[0]] = lllIllIIlI[42];
        if (llIIlIIIIIIll(Bank.contains(iArr9) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIlI[42], lllIllIIlI[1], lllIllIIlI[56]));
            "".length();
        }
        if (llIIlIIIIIllI(Skills.getLevel(Skill.ATTACK), lllIllIIlI[2])) {
            int[] iArr10 = new int[lllIllIIlI[1]];
            iArr10[lllIllIIlI[0]] = lllIllIIlI[17];
            if (llIIlIIIIIIll(Bank.contains(iArr10) ? 1 : 0)) {
                bu.add(new C0003d(lllIllIIlI[17], lllIllIIlI[1], lllIllIIlI[54]));
                "".length();
            }
        }
        int[] iArr11 = new int[lllIllIIlI[1]];
        iArr11[lllIllIIlI[0]] = lllIllIIlI[16];
        if (llIIlIIIIIIll(Bank.contains(iArr11) ? 1 : 0)) {
            bu.add(new C0003d(lllIllIIlI[16], lllIllIIlI[1], lllIllIIlI[56]));
            "".length();
        }
    }

    private static String llIIIllllllIl(String lllllllllllllllllIllIlIIlIIllIll, String lllllllllllllllllIllIlIIlIIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIlIIlIIllIlI.getBytes(StandardCharsets.UTF_8)), lllIllIIlI[18]), "DES");
            Cipher lllllllllllllllllIllIlIIlIIlllIl = Cipher.getInstance("DES");
            lllllllllllllllllIllIlIIlIIlllIl.init(lllIllIIlI[3], secretKeySpec);
            return new String(lllllllllllllllllIllIlIIlIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIlIIlIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIlIIlIIlllII) {
            lllllllllllllllllIllIlIIlIIlllII.printStackTrace();
            return null;
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            dz();
            "".length();
            if (" ".length() <= ((132 ^ 144) & ((66 ^ 86) ^ (-1)))) {
                return (29 ^ 53) & ((55 ^ 31) ^ (-1));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return lllIllIIlI[0];
    }

    private static int llIIlIIIIIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    static {
        llIIIllllllll();
        llIIIlllllllI();
        bu = new ArrayList();
        int[] iArr = new int[lllIllIIlI[18]];
        iArr[lllIllIIlI[0]] = lllIllIIlI[16];
        iArr[lllIllIIlI[1]] = lllIllIIlI[17];
        iArr[lllIllIIlI[3]] = lllIllIIlI[42];
        iArr[lllIllIIlI[4]] = lllIllIIlI[44];
        iArr[lllIllIIlI[6]] = lllIllIIlI[40];
        iArr[lllIllIIlI[10]] = lllIllIIlI[45];
        iArr[lllIllIIlI[14]] = lllIllIIlI[47];
        iArr[lllIllIIlI[15]] = lllIllIIlI[49];
        iZ = iArr;
        ja = new WorldArea(lllIllIIlI[59], lllIllIIlI[60], lllIllIIlI[22], lllIllIIlI[22], lllIllIIlI[0]);
        jb = new WorldArea(lllIllIIlI[61], lllIllIIlI[62], lllIllIIlI[32], lllIllIIlI[26], lllIllIIlI[0]);
        jc = new WorldArea(lllIllIIlI[63], lllIllIIlI[64], lllIllIIlI[65], lllIllIIlI[34], lllIllIIlI[0]);
        jd = new WorldPoint(lllIllIIlI[66], lllIllIIlI[67], lllIllIIlI[0]);
        bw = new WorldPoint(lllIllIIlI[68], lllIllIIlI[60], lllIllIIlI[0]);
        je = new WorldPoint(lllIllIIlI[69], lllIllIIlI[70], lllIllIIlI[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0082, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f6, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0130, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a4, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x023b, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0275, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02af, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02e9, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0323, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x035d, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0397, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean bz() {
        if (llIIlIIIIIllI(Skills.getLevel(Skill.ATTACK), lllIllIIlI[2])) {
            int[] iArr = new int[lllIllIIlI[1]];
            iArr[lllIllIIlI[0]] = lllIllIIlI[17];
            if (llIIlIIIIIIll(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIllIIlI[1]];
                iArr2[lllIllIIlI[0]] = lllIllIIlI[17];
            }
            int[] iArr3 = new int[lllIllIIlI[1]];
            iArr3[lllIllIIlI[0]] = lllIllIIlI[42];
            if (llIIlIIIIIIll(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lllIllIIlI[1]];
                iArr4[lllIllIIlI[0]] = lllIllIIlI[42];
            }
            int[] iArr5 = new int[lllIllIIlI[1]];
            iArr5[lllIllIIlI[0]] = lllIllIIlI[44];
            if (llIIlIIIIIIll(Equipment.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIllIIlI[1]];
                iArr6[lllIllIIlI[0]] = lllIllIIlI[44];
            }
            int[] iArr7 = new int[lllIllIIlI[1]];
            iArr7[lllIllIIlI[0]] = lllIllIIlI[40];
            if (llIIlIIIIIIll(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIllIIlI[1]];
                iArr8[lllIllIIlI[0]] = lllIllIIlI[40];
            }
            int[] iArr9 = new int[lllIllIIlI[1]];
            iArr9[lllIllIIlI[0]] = lllIllIIlI[45];
            if (llIIlIIIIIIll(Equipment.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lllIllIIlI[1]];
                iArr10[lllIllIIlI[0]] = lllIllIIlI[45];
            }
            int[] iArr11 = new int[lllIllIIlI[1]];
            iArr11[lllIllIIlI[0]] = lllIllIIlI[47];
            if (llIIlIIIIIIll(Equipment.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lllIllIIlI[1]];
                iArr12[lllIllIIlI[0]] = lllIllIIlI[47];
            }
            int[] iArr13 = new int[lllIllIIlI[1]];
            iArr13[lllIllIIlI[0]] = lllIllIIlI[49];
            if (llIIlIIIIIIll(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lllIllIIlI[1]];
                iArr14[lllIllIIlI[0]] = lllIllIIlI[49];
            }
            int[] iArr15 = new int[lllIllIIlI[1]];
            iArr15[lllIllIIlI[0]] = lllIllIIlI[11];
            if (llIIlIIIIIIIl(Inventory.contains(iArr15) ? 1 : 0)) {
                ?? r0 = lllIllIIlI[1];
                "".length();
                return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIllIIlI[0];
        }
        int[] iArr16 = new int[lllIllIIlI[1]];
        iArr16[lllIllIIlI[0]] = lllIllIIlI[16];
        if (llIIlIIIIIIll(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lllIllIIlI[1]];
            iArr17[lllIllIIlI[0]] = lllIllIIlI[16];
        }
        int[] iArr18 = new int[lllIllIIlI[1]];
        iArr18[lllIllIIlI[0]] = lllIllIIlI[42];
        if (llIIlIIIIIIll(Equipment.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lllIllIIlI[1]];
            iArr19[lllIllIIlI[0]] = lllIllIIlI[42];
        }
        int[] iArr20 = new int[lllIllIIlI[1]];
        iArr20[lllIllIIlI[0]] = lllIllIIlI[44];
        if (llIIlIIIIIIll(Equipment.contains(iArr20) ? 1 : 0)) {
            int[] iArr21 = new int[lllIllIIlI[1]];
            iArr21[lllIllIIlI[0]] = lllIllIIlI[44];
        }
        int[] iArr22 = new int[lllIllIIlI[1]];
        iArr22[lllIllIIlI[0]] = lllIllIIlI[40];
        if (llIIlIIIIIIll(Equipment.contains(iArr22) ? 1 : 0)) {
            int[] iArr23 = new int[lllIllIIlI[1]];
            iArr23[lllIllIIlI[0]] = lllIllIIlI[40];
        }
        int[] iArr24 = new int[lllIllIIlI[1]];
        iArr24[lllIllIIlI[0]] = lllIllIIlI[45];
        if (llIIlIIIIIIll(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lllIllIIlI[1]];
            iArr25[lllIllIIlI[0]] = lllIllIIlI[45];
        }
        int[] iArr26 = new int[lllIllIIlI[1]];
        iArr26[lllIllIIlI[0]] = lllIllIIlI[47];
        if (llIIlIIIIIIll(Equipment.contains(iArr26) ? 1 : 0)) {
            int[] iArr27 = new int[lllIllIIlI[1]];
            iArr27[lllIllIIlI[0]] = lllIllIIlI[47];
        }
        int[] iArr28 = new int[lllIllIIlI[1]];
        iArr28[lllIllIIlI[0]] = lllIllIIlI[49];
        if (llIIlIIIIIIll(Equipment.contains(iArr28) ? 1 : 0)) {
            int[] iArr29 = new int[lllIllIIlI[1]];
            iArr29[lllIllIIlI[0]] = lllIllIIlI[49];
        }
        int[] iArr30 = new int[lllIllIIlI[1]];
        iArr30[lllIllIIlI[0]] = lllIllIIlI[11];
        if (llIIlIIIIIIIl(Inventory.contains(iArr30) ? 1 : 0)) {
            ?? r02 = lllIllIIlI[1];
            "".length();
            return 0 != 0 ? ((229 ^ 141) ^ (14 ^ 99)) & (((118 ^ 123) ^ (9 ^ 1)) ^ (-" ".length())) : r02;
        }
        return lllIllIIlI[0];
    }

    private static boolean llIIlIIIIIIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lllIllIIlI[0];
    }

    private static void llIIIllllllll() {
        lllIllIIlI = new int[72];
        lllIllIIlI[0] = ((((135 + 0) - 29) + 41) ^ (((81 + 116) - 114) + 80)) & (((((71 + 108) - 109) + 62) ^ (((162 + 60) - 158) + 116)) ^ (-" ".length()));
        lllIllIIlI[1] = " ".length();
        lllIllIIlI[2] = (236 ^ 136) ^ (35 ^ 111);
        lllIllIIlI[3] = "  ".length();
        lllIllIIlI[4] = "   ".length();
        lllIllIIlI[5] = (-((-1290) & 27967)) & (-65) & 31741;
        lllIllIIlI[6] = (34 ^ 53) ^ (8 ^ 27);
        lllIllIIlI[7] = (-((-12821) & 30229)) & (-6157) & 24559;
        lllIllIIlI[8] = (-17432) & 18431;
        lllIllIIlI[9] = (-((-4737) & 29345)) & (-129) & 32743;
        lllIllIIlI[10] = (((127 + 76) - 62) + 17) ^ (((59 + 26) - 23) + 93);
        lllIllIIlI[11] = (-((-8545) & 31589)) & (-8193) & 31615;
        lllIllIIlI[12] = (162 ^ 140) ^ (239 ^ 165);
        lllIllIIlI[13] = 112 ^ 127;
        lllIllIIlI[14] = (89 ^ 23) ^ (81 ^ 25);
        lllIllIIlI[15] = 79 ^ 72;
        lllIllIIlI[16] = (-((-11521) & 28613)) & (-4097) & 22519;
        lllIllIIlI[17] = (-14411) & 15743;
        lllIllIIlI[18] = (29 ^ 62) ^ (42 ^ 1);
        lllIllIIlI[19] = (29 ^ 93) ^ (114 ^ 38);
        lllIllIIlI[20] = (50 ^ 64) ^ (221 ^ 166);
        lllIllIIlI[21] = (240 ^ 196) ^ (126 ^ 64);
        lllIllIIlI[22] = (99 ^ 13) ^ (0 ^ 101);
        lllIllIIlI[23] = (((28 + 116) - 36) + 72) ^ (((170 + 132) - 259) + 141);
        lllIllIIlI[24] = 14 ^ 3;
        lllIllIIlI[25] = (((137 + 91) - 117) + 40) ^ (((103 + 111) - 157) + 96);
        lllIllIIlI[26] = 177 ^ 161;
        lllIllIIlI[27] = -" ".length();
        lllIllIIlI[28] = (-2882) & 38865759;
        lllIllIIlI[29] = (45 ^ 69) ^ (26 ^ 99);
        lllIllIIlI[30] = 158 ^ 140;
        lllIllIIlI[31] = 102 ^ 117;
        lllIllIIlI[32] = (((100 + 139) - 94) + 65) ^ (((140 + 132) - 195) + 122);
        lllIllIIlI[33] = 124 ^ 106;
        lllIllIIlI[34] = (115 ^ 21) ^ (208 ^ 168);
        lllIllIIlI[35] = 116 ^ 99;
        lllIllIIlI[36] = (149 ^ 165) ^ (29 ^ 53);
        lllIllIIlI[37] = (((111 + 166) - 107) + 0) ^ (((54 + 159) - 72) + 38);
        lllIllIIlI[38] = 131 ^ 153;
        lllIllIIlI[39] = 76 ^ 87;
        lllIllIIlI[40] = (-((-7) & 11127)) & (-5) & 12285;
        lllIllIIlI[41] = 4 ^ 24;
        lllIllIIlI[42] = (-21013) & 22135;
        lllIllIIlI[43] = (243 ^ 185) ^ (254 ^ 169);
        lllIllIIlI[44] = (-2245) & 3317;
        lllIllIIlI[45] = (-12881) & 14079;
        lllIllIIlI[46] = 61 ^ 34;
        lllIllIIlI[47] = (-((-9385) & 31913)) & (-20) & 24251;
        lllIllIIlI[48] = 109 ^ 77;
        lllIllIIlI[49] = (-((-9386) & 13483)) & (-16393) & 31615;
        lllIllIIlI[50] = (97 ^ 1) ^ (7 ^ 70);
        lllIllIIlI[51] = (-10330) & 11229;
        lllIllIIlI[52] = (-(236 ^ 196)) & (-24705) & 32751;
        lllIllIIlI[53] = (-22084) & 57083;
        lllIllIIlI[54] = (-((-17443) & 18038)) & (-2053) & 27647;
        lllIllIIlI[55] = (-8714) & 9213;
        lllIllIIlI[56] = (-((-26893) & 28015)) & (-16642) & 32763;
        lllIllIIlI[57] = 172 ^ 142;
        lllIllIIlI[58] = (122 ^ 16) ^ (114 ^ 59);
        lllIllIIlI[59] = (-((-16433) & 17203)) & (-16421) & 20415;
        lllIllIIlI[60] = (-17186) & 20475;
        lllIllIIlI[61] = (-4628) & 7871;
        lllIllIIlI[62] = (-803) & 4082;
        lllIllIIlI[63] = (-12429) & 15613;
        lllIllIIlI[64] = (-((-14917) & 31717)) & (-8193) & 28159;
        lllIllIIlI[65] = 34 ^ 18;
        lllIllIIlI[66] = (-20561) & 23773;
        lllIllIIlI[67] = (-9105) & 12285;
        lllIllIIlI[68] = (-521) & 3774;
        lllIllIIlI[69] = (-25377) & 28607;
        lllIllIIlI[70] = (-((-13513) & 30685)) & (-4) & 20471;
        lllIllIIlI[71] = (((96 + 99) - 126) + 65) ^ (((117 + 72) - 143) + 116);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIIlIIIIIllI(Skills.getLevel(Skill.DEFENCE), lllIllIIlI[2])) {
            ?? r0 = lllIllIIlI[1];
            "".length();
            return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIllIIlI[0];
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllIllIIIl[lllIllIIlI[57]];
    }

    private static boolean llIIlIIIIIllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIlIIIIIlIl(int i) {
        return i > 0;
    }

    private static boolean llIIlIIIIlIII(Object obj) {
        return obj == null;
    }

    public static void dA() {
        if (llIIlIIIIlIIl(Static.getClient().getVar(lllIllIIlI[22]), lllIllIIlI[1])) {
            Static.getClient().invokeMenuAction(lllIllIIIl[lllIllIIlI[13]], lllIllIIIl[lllIllIIlI[26]], lllIllIIlI[1], MenuAction.CC_OP.getId(), lllIllIIlI[27], lllIllIIlI[28]);
        }
        if (llIIlIIIIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIIlI[10])) {
            String[] strArr = new String[lllIllIIlI[1]];
            strArr[lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[29]];
            if (llIIlIIIIIIIl(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lllIllIIlI[1]];
                strArr2[lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[30]];
                Inventory.getFirst(strArr2).interact(lllIllIIIl[lllIllIIlI[31]]);
            }
        }
        if (llIIlIIIIIllI(Skills.getLevel(Skill.ATTACK), lllIllIIlI[10]) && llIIlIIIIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIIlI[19])) {
            String[] strArr3 = new String[lllIllIIlI[1]];
            strArr3[lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[19]];
            if (llIIlIIIIIIIl(Inventory.contains(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[lllIllIIlI[1]];
                strArr4[lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[32]];
                Inventory.getFirst(strArr4).interact(lllIllIIIl[lllIllIIlI[33]]);
            }
        }
        if (llIIlIIIIIllI(Skills.getLevel(Skill.ATTACK), lllIllIIlI[19]) && llIIlIIIIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIIlI[34])) {
            String[] strArr5 = new String[lllIllIIlI[1]];
            strArr5[lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[35]];
            if (llIIlIIIIIIIl(Inventory.contains(strArr5) ? 1 : 0)) {
                String[] strArr6 = new String[lllIllIIlI[1]];
                strArr6[lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[36]];
                Inventory.getFirst(strArr6).interact(lllIllIIIl[lllIllIIlI[37]]);
            }
        }
        if (llIIlIIIIIllI(Skills.getLevel(Skill.ATTACK), lllIllIIlI[34]) && llIIlIIIIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIIlI[2])) {
            int[] iArr = new int[lllIllIIlI[1]];
            iArr[lllIllIIlI[0]] = lllIllIIlI[16];
            if (llIIlIIIIIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIllIIlI[1]];
                iArr2[lllIllIIlI[0]] = lllIllIIlI[16];
                Inventory.getFirst(iArr2).interact(lllIllIIIl[lllIllIIlI[38]]);
            }
        }
        if (llIIlIIIIIllI(Skills.getLevel(Skill.ATTACK), lllIllIIlI[2])) {
            int[] iArr3 = new int[lllIllIIlI[1]];
            iArr3[lllIllIIlI[0]] = lllIllIIlI[17];
            if (llIIlIIIIIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lllIllIIlI[1]];
                iArr4[lllIllIIlI[0]] = lllIllIIlI[17];
                Inventory.getFirst(iArr4).interact(lllIllIIIl[lllIllIIlI[39]]);
            }
        }
        if (llIIlIIIIIllI(Skills.getLevel(Skill.DEFENCE), lllIllIIlI[34])) {
            int[] iArr5 = new int[lllIllIIlI[1]];
            iArr5[lllIllIIlI[0]] = lllIllIIlI[40];
            if (llIIlIIIIIIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIllIIlI[1]];
                iArr6[lllIllIIlI[0]] = lllIllIIlI[40];
                Inventory.getFirst(iArr6).interact(lllIllIIIl[lllIllIIlI[41]]);
            }
            int[] iArr7 = new int[lllIllIIlI[1]];
            iArr7[lllIllIIlI[0]] = lllIllIIlI[42];
            if (llIIlIIIIIIIl(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIllIIlI[1]];
                iArr8[lllIllIIlI[0]] = lllIllIIlI[42];
                Inventory.getFirst(iArr8).interact(lllIllIIIl[lllIllIIlI[43]]);
            }
            int[] iArr9 = new int[lllIllIIlI[1]];
            iArr9[lllIllIIlI[0]] = lllIllIIlI[44];
            if (llIIlIIIIIIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lllIllIIlI[1]];
                iArr10[lllIllIIlI[0]] = lllIllIIlI[44];
                Inventory.getFirst(iArr10).interact(lllIllIIIl[lllIllIIlI[34]]);
            }
            int[] iArr11 = new int[lllIllIIlI[1]];
            iArr11[lllIllIIlI[0]] = lllIllIIlI[45];
            if (llIIlIIIIIIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lllIllIIlI[1]];
                iArr12[lllIllIIlI[0]] = lllIllIIlI[45];
                Inventory.getFirst(iArr12).interact(lllIllIIIl[lllIllIIlI[46]]);
            }
        }
        int[] iArr13 = new int[lllIllIIlI[1]];
        iArr13[lllIllIIlI[0]] = lllIllIIlI[47];
        if (llIIlIIIIIIIl(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lllIllIIlI[1]];
            iArr14[lllIllIIlI[0]] = lllIllIIlI[47];
            Inventory.getFirst(iArr14).interact(lllIllIIIl[lllIllIIlI[48]]);
        }
        int[] iArr15 = new int[lllIllIIlI[1]];
        iArr15[lllIllIIlI[0]] = lllIllIIlI[49];
        if (llIIlIIIIIIIl(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lllIllIIlI[1]];
            iArr16[lllIllIIlI[0]] = lllIllIIlI[49];
            Inventory.getFirst(iArr16).interact(lllIllIIIl[lllIllIIlI[50]]);
        }
    }

    private static boolean llIIlIIIIIlII(Object obj) {
        return obj != null;
    }

    private static boolean llIIlIIIIIlll(int i) {
        return i < 0;
    }

    private static void llIIIlllllllI() {
        lllIllIIIl = new String[lllIllIIlI[71]];
        lllIllIIIl[lllIllIIlI[0]] = llIIIlllllIll("kgrRn9KHf4TGy1Ti15A/gw==", "JnrLj");
        lllIllIIIl[lllIllIIlI[1]] = llIIIlllllIll("Yysqhnl5XCHW/lyDFkfMltXB7T/n39fXq1SfzE44wHi7wFg0sl7MCpC43eiYxiZVuvidzJMBZXI=", "xmgju");
        lllIllIIIl[lllIllIIlI[3]] = llIIIllllllII("CDsYHignLgcZKGYuAVctJzQF", "FZnwO");
        lllIllIIIl[lllIllIIlI[4]] = llIIIllllllIl("EgYRq+Fkp0rWqsytCpgzDn+sioFfi2XM", "IwUzl");
        lllIllIIIl[lllIllIIlI[6]] = llIIIlllllIll("//4o1Ep8oc0UZJPcyi/4WRcW71UgdjnLsL7ZnurRDrNM39+2fX1sUx+t9wbcR/nc", "URFrw");
        lllIllIIIl[lllIllIIlI[10]] = llIIIllllllII("DgoCBWQ0GwQGLTMZHw==", "GxmkD");
        lllIllIIIl[lllIllIIlI[14]] = llIIIllllllIl("uTb2b9CmivdQrdLvtNWNdw==", "LYEoi");
        lllIllIIIl[lllIllIIlI[15]] = llIIIllllllII("LBkDGysIHFcAOggdHgc4Ew==", "apwsY");
        lllIllIIIl[lllIllIIlI[18]] = llIIIllllllII("IBY2", "ewBBZ");
        lllIllIIIl[lllIllIIlI[20]] = llIIIllllllII("EwAdPSMqBlEiJWQCHiFqJRMUNw==", "DaqVJ");
        lllIllIIIl[lllIllIIlI[21]] = llIIIllllllIl("41TPI8iqHX5DzsUgWGrWtw==", "kmtAY");
        lllIllIIIl[lllIllIIlI[22]] = llIIIlllllIll("Dl3YFOJbg6s=", "XLlFk");
        lllIllIIIl[lllIllIIlI[23]] = llIIIllllllII("Mxww", "PsGmw");
        lllIllIIIl[lllIllIIlI[24]] = llIIIllllllIl("58Ssp+UtXa8=", "WdCSA");
        lllIllIIIl[lllIllIIlI[25]] = llIIIlllllIll("2VgFklEyAVY=", "tlOgF");
        lllIllIIIl[lllIllIIlI[13]] = llIIIlllllIll("TbkhDSKbgYOMGakydY3CPg==", "HXZyV");
        lllIllIIIl[lllIllIIlI[26]] = llIIIllllllIl("57z/gM/0tns=", "Bxvmn");
        lllIllIIIl[lllIllIIlI[29]] = llIIIllllllIl("Dizjr2DrLFx7tXIXje/xZQ==", "ngyxf");
        lllIllIIIl[lllIllIIlI[30]] = llIIIllllllII("EDU9BnUqJDsFPC0mIA==", "YGRhU");
        lllIllIIIl[lllIllIIlI[31]] = llIIIllllllII("Fiw/HDc=", "AEZpS");
        lllIllIIIl[lllIllIIlI[19]] = llIIIlllllIll("67q+W1D2w4+2AV73gfzWRQ==", "qWVmD");
        lllIllIIIl[lllIllIIlI[32]] = llIIIllllllIl("tShKO1Sho3ygsXErRBM1ag==", "irJwe");
        lllIllIIIl[lllIllIIlI[33]] = llIIIllllllIl("dPTBBP9PvfI=", "iPSEd");
        lllIllIIIl[lllIllIIlI[35]] = llIIIllllllIl("wZxf8UEMDZqJZJMomyg987Nq/gDesFhI", "AelYn");
        lllIllIIIl[lllIllIIlI[36]] = llIIIllllllIl("4MwFW8zcYdDThw7mv8fj5li6+8FeHJ81", "yNCrk");
        lllIllIIIl[lllIllIIlI[37]] = llIIIllllllII("JgsyHBQ=", "qbWpp");
        lllIllIIIl[lllIllIIlI[38]] = llIIIlllllIll("OU8f8itR1wU=", "lqBhQ");
        lllIllIIIl[lllIllIIlI[39]] = llIIIlllllIll("L3GiEjtYWPk=", "oJyTh");
        lllIllIIIl[lllIllIIlI[41]] = llIIIlllllIll("3givbN0pAa0=", "hxlmq");
        lllIllIIIl[lllIllIIlI[43]] = llIIIllllllIl("IyIiC2rcyow=", "OxEJG");
        lllIllIIIl[lllIllIIlI[34]] = llIIIllllllIl("tMbUfZPTVfs=", "OnvoI");
        lllIllIIIl[lllIllIIlI[46]] = llIIIlllllIll("WsEgW0ecWq8=", "HQMAn");
        lllIllIIIl[lllIllIIlI[48]] = llIIIllllllII("BRQqBA==", "RqKvS");
        lllIllIIIl[lllIllIIlI[50]] = llIIIllllllII("DQAPJA==", "ZenVs");
        lllIllIIIl[lllIllIIlI[57]] = llIIIlllllIll("F543WICAGYc=", "UbuPJ");
        lllIllIIIl[lllIllIIlI[58]] = llIIIllllllII("ADo/", "CUHXe");
    }

    public static void Z() {
        if (llIIlIIIIIIll(jb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIllIIIl[lllIllIIlI[20]];
            Movement.walkTo(bw);
            "".length();
            Time.sleepTicks(lllIllIIlI[1]);
            "".length();
        }
        if (llIIlIIIIIIIl(jb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIllIIIl[lllIllIIlI[21]];
            if (llIIlIIIIlIII(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (llIIlIIIIIIIl(npc.getName().contains(lllIllIIIl[lllIllIIlI[58]]) ? 1 : 0) && llIIlIIIIlIII(npc.getInteracting()) && llIIlIIIIIIll(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lllIllIIlI[1];
                        "".length();
                        return " ".length() <= (((243 ^ 178) ^ (67 ^ 22)) & (((236 ^ 184) ^ (26 ^ 90)) ^ (-" ".length()))) ? ((119 ^ 58) ^ (165 ^ 197)) & (((174 ^ 133) ^ (6 ^ 0)) ^ (-" ".length())) : r0;
                    }
                    return lllIllIIlI[0];
                });
                String[] strArr = new String[lllIllIIlI[3]];
                strArr[lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[22]];
                strArr[lllIllIIlI[1]] = lllIllIIIl[lllIllIIlI[23]];
                List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                    if (llIIlIIIIlIlI(npc2.getInteracting(), Players.getLocal())) {
                        ?? r0 = lllIllIIlI[1];
                        "".length();
                        return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllIllIIlI[0];
                }).collect(Collectors.toList());
                if (llIIlIIIIIIll(list.isEmpty() ? 1 : 0)) {
                    ((NPC) list.get(lllIllIIlI[0])).interact(lllIllIIIl[lllIllIIlI[24]]);
                    Time.sleepTicks(lllIllIIlI[3]);
                    "".length();
                }
                if (llIIlIIIIIlII(nearest) && llIIlIIIIIIll(Players.getLocal().isMoving() ? 1 : 0) && llIIlIIIIIIIl(list.isEmpty() ? 1 : 0)) {
                    nearest.interact(lllIllIIIl[lllIllIIlI[25]]);
                    Time.sleepTicks(lllIllIIlI[3]);
                    "".length();
                }
            }
            if (llIIlIIIIIlII(Players.getLocal().getInteracting())) {
                Time.sleepTicks(lllIllIIlI[6]);
                "".length();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x058c, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x05e7, code lost:
        return e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.U.lllIllIIlI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0113, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c1, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0218, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x026f, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02a9, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02f3, code lost:
        return e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.U.lllIllIIlI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0348, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x039f, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03f6, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x044d, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x04a4, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04fb, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0552, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
        if (llIIlIIIIIIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v230, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean dB() {
        if (llIIlIIIIIllI(Skills.getLevel(Skill.ATTACK), lllIllIIlI[2])) {
            int[] iArr = new int[lllIllIIlI[1]];
            iArr[lllIllIIlI[0]] = lllIllIIlI[17];
            if (llIIlIIIIIIll(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIllIIlI[1]];
                iArr2[lllIllIIlI[0]] = lllIllIIlI[17];
                if (llIIlIIIIIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lllIllIIlI[1]];
                    iArr3[lllIllIIlI[0]] = lllIllIIlI[17];
                }
            }
            int[] iArr4 = new int[lllIllIIlI[1]];
            iArr4[lllIllIIlI[0]] = lllIllIIlI[42];
            if (llIIlIIIIIIll(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lllIllIIlI[1]];
                iArr5[lllIllIIlI[0]] = lllIllIIlI[42];
                if (llIIlIIIIIIll(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lllIllIIlI[1]];
                    iArr6[lllIllIIlI[0]] = lllIllIIlI[42];
                }
            }
            int[] iArr7 = new int[lllIllIIlI[1]];
            iArr7[lllIllIIlI[0]] = lllIllIIlI[44];
            if (llIIlIIIIIIll(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIllIIlI[1]];
                iArr8[lllIllIIlI[0]] = lllIllIIlI[44];
                if (llIIlIIIIIIll(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lllIllIIlI[1]];
                    iArr9[lllIllIIlI[0]] = lllIllIIlI[44];
                }
            }
            int[] iArr10 = new int[lllIllIIlI[1]];
            iArr10[lllIllIIlI[0]] = lllIllIIlI[40];
            if (llIIlIIIIIIll(Equipment.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lllIllIIlI[1]];
                iArr11[lllIllIIlI[0]] = lllIllIIlI[40];
                if (llIIlIIIIIIll(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lllIllIIlI[1]];
                    iArr12[lllIllIIlI[0]] = lllIllIIlI[40];
                }
            }
            int[] iArr13 = new int[lllIllIIlI[1]];
            iArr13[lllIllIIlI[0]] = lllIllIIlI[45];
            if (llIIlIIIIIIll(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lllIllIIlI[1]];
                iArr14[lllIllIIlI[0]] = lllIllIIlI[45];
                if (llIIlIIIIIIll(Inventory.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lllIllIIlI[1]];
                    iArr15[lllIllIIlI[0]] = lllIllIIlI[45];
                }
            }
            int[] iArr16 = new int[lllIllIIlI[1]];
            iArr16[lllIllIIlI[0]] = lllIllIIlI[47];
            if (llIIlIIIIIIll(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lllIllIIlI[1]];
                iArr17[lllIllIIlI[0]] = lllIllIIlI[47];
                if (llIIlIIIIIIll(Equipment.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lllIllIIlI[1]];
                    iArr18[lllIllIIlI[0]] = lllIllIIlI[47];
                }
            }
            int[] iArr19 = new int[lllIllIIlI[1]];
            iArr19[lllIllIIlI[0]] = lllIllIIlI[49];
            if (llIIlIIIIIIll(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lllIllIIlI[1]];
                iArr20[lllIllIIlI[0]] = lllIllIIlI[49];
                if (llIIlIIIIIIll(Equipment.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lllIllIIlI[1]];
                    iArr21[lllIllIIlI[0]] = lllIllIIlI[49];
                }
            }
            int[] iArr22 = new int[lllIllIIlI[1]];
            iArr22[lllIllIIlI[0]] = lllIllIIlI[11];
            if (llIIlIIIIIIll(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lllIllIIlI[1]];
                iArr23[lllIllIIlI[0]] = lllIllIIlI[11];
            }
            ?? r0 = lllIllIIlI[1];
            "".length();
            return "   ".length() <= 0 ? ((((136 + 9) - (-4)) + 17) ^ (((91 + 58) - 36) + 25)) & (((36 ^ 53) ^ (125 ^ 64)) ^ (-" ".length())) : r0;
        }
        int[] iArr24 = new int[lllIllIIlI[1]];
        iArr24[lllIllIIlI[0]] = lllIllIIlI[16];
        if (llIIlIIIIIIll(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lllIllIIlI[1]];
            iArr25[lllIllIIlI[0]] = lllIllIIlI[16];
            if (llIIlIIIIIIll(Inventory.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[lllIllIIlI[1]];
                iArr26[lllIllIIlI[0]] = lllIllIIlI[16];
            }
        }
        int[] iArr27 = new int[lllIllIIlI[1]];
        iArr27[lllIllIIlI[0]] = lllIllIIlI[42];
        if (llIIlIIIIIIll(Equipment.contains(iArr27) ? 1 : 0)) {
            int[] iArr28 = new int[lllIllIIlI[1]];
            iArr28[lllIllIIlI[0]] = lllIllIIlI[42];
            if (llIIlIIIIIIll(Inventory.contains(iArr28) ? 1 : 0)) {
                int[] iArr29 = new int[lllIllIIlI[1]];
                iArr29[lllIllIIlI[0]] = lllIllIIlI[42];
            }
        }
        int[] iArr30 = new int[lllIllIIlI[1]];
        iArr30[lllIllIIlI[0]] = lllIllIIlI[44];
        if (llIIlIIIIIIll(Equipment.contains(iArr30) ? 1 : 0)) {
            int[] iArr31 = new int[lllIllIIlI[1]];
            iArr31[lllIllIIlI[0]] = lllIllIIlI[44];
            if (llIIlIIIIIIll(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[lllIllIIlI[1]];
                iArr32[lllIllIIlI[0]] = lllIllIIlI[44];
            }
        }
        int[] iArr33 = new int[lllIllIIlI[1]];
        iArr33[lllIllIIlI[0]] = lllIllIIlI[40];
        if (llIIlIIIIIIll(Equipment.contains(iArr33) ? 1 : 0)) {
            int[] iArr34 = new int[lllIllIIlI[1]];
            iArr34[lllIllIIlI[0]] = lllIllIIlI[40];
            if (llIIlIIIIIIll(Inventory.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[lllIllIIlI[1]];
                iArr35[lllIllIIlI[0]] = lllIllIIlI[40];
            }
        }
        int[] iArr36 = new int[lllIllIIlI[1]];
        iArr36[lllIllIIlI[0]] = lllIllIIlI[45];
        if (llIIlIIIIIIll(Equipment.contains(iArr36) ? 1 : 0)) {
            int[] iArr37 = new int[lllIllIIlI[1]];
            iArr37[lllIllIIlI[0]] = lllIllIIlI[45];
            if (llIIlIIIIIIll(Inventory.contains(iArr37) ? 1 : 0)) {
                int[] iArr38 = new int[lllIllIIlI[1]];
                iArr38[lllIllIIlI[0]] = lllIllIIlI[45];
            }
        }
        int[] iArr39 = new int[lllIllIIlI[1]];
        iArr39[lllIllIIlI[0]] = lllIllIIlI[47];
        if (llIIlIIIIIIll(Inventory.contains(iArr39) ? 1 : 0)) {
            int[] iArr40 = new int[lllIllIIlI[1]];
            iArr40[lllIllIIlI[0]] = lllIllIIlI[47];
            if (llIIlIIIIIIll(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[lllIllIIlI[1]];
                iArr41[lllIllIIlI[0]] = lllIllIIlI[47];
            }
        }
        int[] iArr42 = new int[lllIllIIlI[1]];
        iArr42[lllIllIIlI[0]] = lllIllIIlI[49];
        if (llIIlIIIIIIll(Inventory.contains(iArr42) ? 1 : 0)) {
            int[] iArr43 = new int[lllIllIIlI[1]];
            iArr43[lllIllIIlI[0]] = lllIllIIlI[49];
            if (llIIlIIIIIIll(Equipment.contains(iArr43) ? 1 : 0)) {
                int[] iArr44 = new int[lllIllIIlI[1]];
                iArr44[lllIllIIlI[0]] = lllIllIIlI[49];
            }
        }
        int[] iArr45 = new int[lllIllIIlI[1]];
        iArr45[lllIllIIlI[0]] = lllIllIIlI[11];
        if (llIIlIIIIIIll(Inventory.contains(iArr45) ? 1 : 0)) {
            int[] iArr46 = new int[lllIllIIlI[1]];
            iArr46[lllIllIIlI[0]] = lllIllIIlI[11];
        }
        ?? r02 = lllIllIIlI[1];
        "".length();
        return (-"  ".length()) >= 0 ? ((((115 + 177) - 167) + 101) ^ (((135 + 58) - 61) + 49)) & (((((96 + 179) - 140) + 57) ^ (((54 + 57) - 68) + 108)) ^ (-" ".length())) : r02;
    }

    private static String llIIIllllllII(String lllllllllllllllllIllIlIIlIllIIII, String lllllllllllllllllIllIlIIlIlIllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIllIlIIlIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIllIlIIlIlIllIl = lllllllllllllllllIllIlIIlIlIllll.toCharArray();
        int lllllllllllllllllIllIlIIlIlIllII = lllIllIIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllllIllIlIIlIlIIlII = lllIllIIlI[0];
        while (llIIlIIIIIIlI(lllllllllllllllllIllIlIIlIlIIlII, length)) {
            sb.append((char) (charArray[lllllllllllllllllIllIlIIlIlIIlII] ^ lllllllllllllllllIllIlIIlIlIllIl[lllllllllllllllllIllIlIIlIlIllII % lllllllllllllllllIllIlIIlIlIllIl.length]));
            "".length();
            lllllllllllllllllIllIlIIlIlIllII++;
            lllllllllllllllllIllIlIIlIlIIlII++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIlIIIIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }
}
