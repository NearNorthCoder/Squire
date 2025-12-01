package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/p.class */
public class C0015p implements ab {
    private static /* synthetic */ String[] lllIllIIl;
    public static /* synthetic */ WorldPoint cR;
    public static /* synthetic */ int[] cM;
    public static /* synthetic */ List<C0003d> bx;
    public static /* synthetic */ WorldArea cP;
    public static /* synthetic */ WorldArea cO;
    public static /* synthetic */ boolean cL;
    public static /* synthetic */ WorldArea cN;
    public static /* synthetic */ WorldPoint cS;
    public static /* synthetic */ WorldPoint cm;
    private static /* synthetic */ int[] lllIllIlI;
    public static /* synthetic */ WorldPoint cQ;
    public static /* synthetic */ WorldArea cl;
    public static /* synthetic */ boolean bv;

    private static String llIIlIIlIlll(String llIlIIllIIlll, String llIlIIllIIllI) {
        try {
            SecretKeySpec llIlIIllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIllIIllI.getBytes(StandardCharsets.UTF_8)), lllIllIlI[37]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIllIlI[5], llIlIIllIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIllIIIll) {
            llIlIIllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIlIIIlI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x02c1, code lost:
        if (llIIlIIlllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v147, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v177, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aJ() {
        if (llIIlIIlllll(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllIllIIl[lllIllIlI[0]];
            C0001b.a(bx);
            if (llIIlIlIIIII(bx.size(), lllIllIlI[1])) {
                System.out.println(lllIllIIl[lllIllIlI[1]]);
                bv = lllIllIlI[0];
            }
        }
        if (llIIlIlIIIIl(bv ? 1 : 0)) {
            if (llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[2]) && llIIlIlIIIlI(Skills.getLevel(Skill.STRENGTH), lllIllIlI[3]) && !llIIlIlIIIII(Skills.getLevel(Skill.DEFENCE), lllIllIlI[4])) {
                return;
            }
            if (llIIlIlIIIIl(aM() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIlIlIIIll(nearest) && llIIlIlIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIllIIl[lllIllIlI[5]];
                    C0000a.a(nearest);
                }
                if (llIIlIlIIIll(nearest) && llIIlIIlllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIllIIl[lllIllIlI[6]];
                    if (llIIlIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIllIlI[7]);
                        "".length();
                    }
                    if (llIIlIIlllll(Bank.isOpen() ? 1 : 0)) {
                        if (llIIlIlIIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIllIlI[1]);
                            "".length();
                        }
                        if (llIIlIlIIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIllIlI[5]);
                            "".length();
                        }
                        if (llIIlIlIIIIl(aN() ? 1 : 0)) {
                            Q();
                            System.out.println(lllIllIIl[lllIllIlI[8]]);
                            bv = lllIllIlI[1];
                            return;
                        }
                        if (llIIlIlIIIIl(cL ? 1 : 0)) {
                            C0007h.X();
                            cL = lllIllIlI[1];
                        }
                        while (llIIlIlIIIIl(C0007h.bw ? 1 : 0) && llIIlIlIIIIl(AccBuilderGWD.d ? 1 : 0)) {
                            C0007h.d(lllIllIIl[lllIllIlI[9]]);
                            Time.sleepTicks(lllIllIlI[1]);
                            "".length();
                            "".length();
                            if (" ".length() == "   ".length()) {
                                return;
                            }
                        }
                        C0000a.a(cM, lllIllIlI[1]);
                        C0000a.a(lllIllIlI[10], lllIllIlI[11]);
                        C0000a.b(C0005f.bc, lllIllIlI[1]);
                        if (llIIlIIlllll(Inventory.contains(cM) ? 1 : 0)) {
                            C0000a.a(lllIllIlI[12], lllIllIlI[13]);
                        }
                    }
                }
            }
            if (llIIlIIlllll(aM() ? 1 : 0)) {
                aL();
                cL = lllIllIlI[0];
                if (llIIlIlIIIlI(Movement.getRunEnergy(), lllIllIlI[4]) && llIIlIlIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                int[] iArr = new int[lllIllIlI[1]];
                iArr[lllIllIlI[0]] = lllIllIlI[14];
                if (llIIlIlIIIIl(Equipment.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllIllIlI[1]];
                    iArr2[lllIllIlI[0]] = lllIllIlI[15];
                    if (llIIlIlIIIIl(Equipment.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lllIllIlI[1]];
                        iArr3[lllIllIlI[0]] = lllIllIlI[16];
                        if (llIIlIlIIIIl(Equipment.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllIllIlI[1]];
                            iArr4[lllIllIlI[0]] = lllIllIlI[17];
                            if (llIIlIlIIIIl(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lllIllIlI[1]];
                                iArr5[lllIllIlI[0]] = lllIllIlI[18];
                            }
                        }
                    }
                }
                aO();
                if (llIIlIlIIlIl(llIIlIIllllI(C0004e.w(), 45.0d))) {
                    int[] iArr6 = new int[lllIllIlI[1]];
                    iArr6[lllIllIlI[0]] = lllIllIlI[12];
                    if (llIIlIIlllll(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lllIllIlI[1]];
                        iArr7[lllIllIlI[0]] = lllIllIlI[12];
                        Inventory.getFirst(iArr7).interact(lllIllIIl[lllIllIlI[19]]);
                        Time.sleepTicks(lllIllIlI[1]);
                        "".length();
                    }
                }
                if (llIIlIlIIIII(Skills.getLevel(Skill.ATTACK), lllIllIlI[20]) && llIIlIlIIIII(Skills.getLevel(Skill.STRENGTH), lllIllIlI[20])) {
                    aK();
                }
                if ((llIIlIlIIIII(Skills.getLevel(Skill.ATTACK), lllIllIlI[21]) && !llIIlIlIIIII(Skills.getLevel(Skill.ATTACK), lllIllIlI[20])) || ((llIIlIlIIIII(Skills.getLevel(Skill.STRENGTH), lllIllIlI[21]) && !llIIlIlIIIII(Skills.getLevel(Skill.STRENGTH), lllIllIlI[20])) || ((llIIlIlIIIII(Skills.getLevel(Skill.DEFENCE), lllIllIlI[21]) && !llIIlIlIIIII(Skills.getLevel(Skill.DEFENCE), lllIllIlI[20])) || (llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[20]) && llIIlIlIIIlI(Skills.getLevel(Skill.STRENGTH), lllIllIlI[20]))))) {
                    al();
                }
                if (llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[21]) && llIIlIlIIIlI(Skills.getLevel(Skill.STRENGTH), lllIllIlI[21]) && llIIlIlIIIlI(Skills.getLevel(Skill.DEFENCE), lllIllIlI[21])) {
                    aj();
                }
            }
        }
    }

    private static boolean llIIlIIlllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ab, code lost:
        if (llIIlIIlllll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e5, code lost:
        if (llIIlIIlllll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x011f, code lost:
        if (llIIlIIlllll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
        if (llIIlIIlllll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (llIIlIIlllll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aM() {
        int[] iArr = new int[lllIllIlI[1]];
        iArr[lllIllIlI[0]] = lllIllIlI[14];
        if (llIIlIlIIIIl(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllIllIlI[1]];
            iArr2[lllIllIlI[0]] = lllIllIlI[14];
        }
        int[] iArr3 = new int[lllIllIlI[1]];
        iArr3[lllIllIlI[0]] = lllIllIlI[15];
        if (llIIlIlIIIIl(Equipment.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lllIllIlI[1]];
            iArr4[lllIllIlI[0]] = lllIllIlI[15];
        }
        int[] iArr5 = new int[lllIllIlI[1]];
        iArr5[lllIllIlI[0]] = lllIllIlI[16];
        if (llIIlIlIIIIl(Equipment.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lllIllIlI[1]];
            iArr6[lllIllIlI[0]] = lllIllIlI[16];
        }
        int[] iArr7 = new int[lllIllIlI[1]];
        iArr7[lllIllIlI[0]] = lllIllIlI[17];
        if (llIIlIlIIIIl(Equipment.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lllIllIlI[1]];
            iArr8[lllIllIlI[0]] = lllIllIlI[17];
        }
        int[] iArr9 = new int[lllIllIlI[1]];
        iArr9[lllIllIlI[0]] = lllIllIlI[18];
        if (llIIlIlIIIIl(Equipment.contains(iArr9) ? 1 : 0)) {
            int[] iArr10 = new int[lllIllIlI[1]];
            iArr10[lllIllIlI[0]] = lllIllIlI[18];
        }
        int[] iArr11 = new int[lllIllIlI[1]];
        iArr11[lllIllIlI[0]] = lllIllIlI[12];
        if (llIIlIIlllll(Inventory.contains(iArr11) ? 1 : 0)) {
            ?? r0 = lllIllIlI[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIllIlI[0];
    }

    public static void aL() {
        C0004e.F();
        if (llIIlIlIIIII(Skills.getLevel(Skill.ATTACK), lllIllIlI[9])) {
            int[] iArr = new int[lllIllIlI[1]];
            iArr[lllIllIlI[0]] = lllIllIlI[14];
            if (llIIlIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIllIlI[1]];
                iArr2[lllIllIlI[0]] = lllIllIlI[14];
                Inventory.getFirst(iArr2).interact(lllIllIIl[lllIllIlI[47]]);
            }
        }
        if (llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[9]) && llIIlIlIIIII(Skills.getLevel(Skill.ATTACK), lllIllIlI[20])) {
            int[] iArr3 = new int[lllIllIlI[1]];
            iArr3[lllIllIlI[0]] = lllIllIlI[15];
            if (llIIlIIlllll(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lllIllIlI[1]];
                iArr4[lllIllIlI[0]] = lllIllIlI[15];
                Inventory.getFirst(iArr4).interact(lllIllIIl[lllIllIlI[20]]);
            }
        }
        if (llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[20]) && llIIlIlIIIII(Skills.getLevel(Skill.ATTACK), lllIllIlI[21])) {
            int[] iArr5 = new int[lllIllIlI[1]];
            iArr5[lllIllIlI[0]] = lllIllIlI[16];
            if (llIIlIIlllll(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIllIlI[1]];
                iArr6[lllIllIlI[0]] = lllIllIlI[16];
                Inventory.getFirst(iArr6).interact(lllIllIIl[lllIllIlI[48]]);
            }
        }
        if (llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[21]) && llIIlIlIIIII(Skills.getLevel(Skill.ATTACK), lllIllIlI[49])) {
            int[] iArr7 = new int[lllIllIlI[1]];
            iArr7[lllIllIlI[0]] = lllIllIlI[17];
            if (llIIlIIlllll(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIllIlI[1]];
                iArr8[lllIllIlI[0]] = lllIllIlI[17];
                Inventory.getFirst(iArr8).interact(lllIllIIl[lllIllIlI[50]]);
            }
        }
        if (llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[49])) {
            int[] iArr9 = new int[lllIllIlI[1]];
            iArr9[lllIllIlI[0]] = lllIllIlI[18];
            if (llIIlIIlllll(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lllIllIlI[1]];
                iArr10[lllIllIlI[0]] = lllIllIlI[18];
                Inventory.getFirst(iArr10).interact(lllIllIIl[lllIllIlI[51]]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllIllIlI[0];
    }

    public static void al() {
        if (llIIlIIlllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIlIlIIIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIllIIl[lllIllIlI[52]];
            Movement.walkTo(cS);
            "".length();
            Time.sleepTicks(lllIllIlI[1]);
            "".length();
        }
        if (llIIlIIlllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIllIIl[lllIllIlI[53]];
            am();
        }
    }

    private static boolean llIIlIlIIlII(int i) {
        return i > 0;
    }

    private static boolean llIIlIlIlIII(Object obj) {
        return obj == null;
    }

    public static void aK() {
        if (llIIlIIlllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIlIlIIIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIllIIl[lllIllIlI[41]];
            Movement.walkTo(new WorldPoint(lllIllIlI[42], lllIllIlI[43], lllIllIlI[0]));
            "".length();
            Time.sleepTicks(lllIllIlI[1]);
            "".length();
        }
        if (llIIlIIlllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIllIIl[lllIllIlI[3]];
            am();
        }
    }

    private static boolean llIIlIlIllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIlIlIIlll(int i, int i2) {
        return i <= i2;
    }

    public static void aO() {
        if (llIIlIlIIIII(Skills.getLevel(Skill.STRENGTH), lllIllIlI[8]) && llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (llIIlIlIIIlI(Skills.getLevel(Skill.STRENGTH), lllIllIlI[8]) && llIIlIlIIIII(Skills.getLevel(Skill.ATTACK), lllIllIlI[19]) && llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (llIIlIlIIIlI(Skills.getLevel(Skill.STRENGTH), lllIllIlI[8]) && llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[19]) && llIIlIlIIIII(Skills.getLevel(Skill.DEFENCE), lllIllIlI[36]) && llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (llIIlIlIIIII(Skills.getLevel(Skill.STRENGTH), lllIllIlI[37]) && llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[19]) && llIIlIlIIIlI(Skills.getLevel(Skill.DEFENCE), lllIllIlI[36]) && llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (llIIlIlIIIlI(Skills.getLevel(Skill.STRENGTH), lllIllIlI[37]) && llIIlIlIIIII(Skills.getLevel(Skill.ATTACK), lllIllIlI[37]) && llIIlIlIIIlI(Skills.getLevel(Skill.DEFENCE), lllIllIlI[36]) && llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (llIIlIlIIIlI(Skills.getLevel(Skill.STRENGTH), lllIllIlI[37]) && llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[37]) && llIIlIlIIIII(Skills.getLevel(Skill.DEFENCE), lllIllIlI[40]) && llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (llIIlIlIIIII(Skills.getLevel(Skill.STRENGTH), lllIllIlI[2]) && llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[37]) && llIIlIlIIIlI(Skills.getLevel(Skill.DEFENCE), lllIllIlI[40]) && llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (llIIlIlIIIlI(Skills.getLevel(Skill.STRENGTH), lllIllIlI[2]) && llIIlIlIIIII(Skills.getLevel(Skill.ATTACK), lllIllIlI[2]) && llIIlIlIIIlI(Skills.getLevel(Skill.DEFENCE), lllIllIlI[40]) && llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (llIIlIlIIIlI(Skills.getLevel(Skill.STRENGTH), lllIllIlI[2]) && llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[2]) && llIIlIlIIIII(Skills.getLevel(Skill.DEFENCE), lllIllIlI[4]) && llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (llIIlIlIIIII(Skills.getLevel(Skill.STRENGTH), lllIllIlI[3]) && llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[2]) && llIIlIlIIIlI(Skills.getLevel(Skill.DEFENCE), lllIllIlI[4]) && llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
    }

    private static boolean llIIlIlIIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlIlIlIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static int llIIlIIllllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void llIIlIIlllIl() {
        lllIllIlI = new int[90];
        lllIllIlI[0] = ((199 ^ 163) ^ (133 ^ 176)) & (((203 ^ 161) ^ (179 ^ 136)) ^ (-" ".length()));
        lllIllIlI[1] = " ".length();
        lllIllIlI[2] = (((116 + 164) - 162) + 54) ^ (((88 + 136) - 169) + 105);
        lllIllIlI[3] = (((116 + 108) - 145) + 64) ^ (((2 + 116) - 20) + 31);
        lllIllIlI[4] = 59 ^ 52;
        lllIllIlI[5] = "  ".length();
        lllIllIlI[6] = "   ".length();
        lllIllIlI[7] = (-((-8739) & 9850)) & (-10241) & 16351;
        lllIllIlI[8] = 131 ^ 135;
        lllIllIlI[9] = (((38 + 11) - (-51)) + 32) ^ (((54 + 75) - 112) + 112);
        lllIllIlI[10] = (-((-17317) & 27565)) & (-20497) & 31739;
        lllIllIlI[11] = (-28675) & 29674;
        lllIllIlI[12] = (-16385) & 16763;
        lllIllIlI[13] = (((109 + 103) - 96) + 49) ^ (((103 + 59) - 122) + 153);
        lllIllIlI[14] = (-((-5159) & 32503)) & (-5) & 28671;
        lllIllIlI[15] = (-((-517) & 25173)) & (-6785) & 32765;
        lllIllIlI[16] = (-((-19665) & 32475)) & (-18497) & 32635;
        lllIllIlI[17] = (-2633) & 3963;
        lllIllIlI[18] = (-((-22615) & 31455)) & (-4163) & 14335;
        lllIllIlI[19] = (((145 + 30) - 116) + 121) ^ (((104 + 74) - 142) + 142);
        lllIllIlI[20] = 150 ^ 130;
        lllIllIlI[21] = (193 ^ 146) ^ (222 ^ 147);
        lllIllIlI[22] = (-((-2429) & 14717)) & (-16577) & 32219;
        lllIllIlI[23] = (-((-9) & 28937)) & (-705) & 32763;
        lllIllIlI[24] = 5 ^ 35;
        lllIllIlI[25] = (18 ^ 77) ^ (33 ^ 89);
        lllIllIlI[26] = (-((-22803) & 31703)) & (-20489) & 32765;
        lllIllIlI[27] = (-((-3083) & 15787)) & (-514) & 16367;
        lllIllIlI[28] = (-20561) & 23930;
        lllIllIlI[29] = (-((-30799) & 31087)) & (-1) & 3454;
        lllIllIlI[30] = (-((-10853) & 31615)) & (-33) & 24062;
        lllIllIlI[31] = (-4162) & 7389;
        lllIllIlI[32] = (-((-3235) & 32743)) & (-33) & 32767;
        lllIllIlI[33] = (-8705) & 11982;
        lllIllIlI[34] = (-((-3097) & 24442)) & (-8197) & 32767;
        lllIllIlI[35] = (-((-4449) & 21348)) & (-11361) & 32759;
        lllIllIlI[36] = 109 ^ 106;
        lllIllIlI[37] = (137 ^ 130) ^ "   ".length();
        lllIllIlI[38] = (((119 + 33) - 88) + 65) ^ (((69 + 133) - 90) + 24);
        lllIllIlI[39] = (((52 + 104) - 105) + 97) ^ (((81 + 33) - (-32)) + 12);
        lllIllIlI[40] = (66 ^ 62) ^ (91 ^ 44);
        lllIllIlI[41] = 97 ^ 108;
        lllIllIlI[42] = (-((-809) & 13230)) & (-785) & 16375;
        lllIllIlI[43] = (-((-18309) & 30709)) & (-130) & 15859;
        lllIllIlI[44] = (((127 + 124) - 242) + 119) ^ (((109 + 16) - 32) + 51);
        lllIllIlI[45] = 37 ^ 52;
        lllIllIlI[46] = (98 ^ 20) ^ (20 ^ 112);
        lllIllIlI[47] = (78 ^ 75) ^ (75 ^ 93);
        lllIllIlI[48] = (89 ^ 126) ^ (144 ^ 162);
        lllIllIlI[49] = (((115 + 138) - 233) + 122) ^ (((103 + 60) - 83) + 86);
        lllIllIlI[50] = 109 ^ 123;
        lllIllIlI[51] = 28 ^ 11;
        lllIllIlI[52] = (41 ^ 103) ^ (50 ^ 100);
        lllIllIlI[53] = (((19 + 127) - 93) + 115) ^ (((113 + 151) - 179) + 92);
        lllIllIlI[54] = (-12297) & 12796;
        lllIllIlI[55] = (-580) & 25579;
        lllIllIlI[56] = (-70) & 15069;
        lllIllIlI[57] = (14 ^ 72) ^ (117 ^ 41);
        lllIllIlI[58] = (-2050) & 3999;
        lllIllIlI[59] = (190 ^ 156) ^ (175 ^ 150);
        lllIllIlI[60] = 46 ^ 50;
        lllIllIlI[61] = 50 ^ 47;
        lllIllIlI[62] = (-((-23507) & 31735)) & (-19970) & 28671;
        lllIllIlI[63] = (-22851) & 23383;
        lllIllIlI[64] = (((88 + 8) - 90) + 132) ^ (((83 + 75) - 153) + 144);
        lllIllIlI[65] = (((27 + 72) - (-22)) + 7) ^ (((86 + 8) - (-33)) + 33);
        lllIllIlI[66] = 57 ^ 24;
        lllIllIlI[67] = (((102 + 129) - 146) + 59) ^ (((114 + 27) - (-17)) + 20);
        lllIllIlI[68] = 10 ^ 41;
        lllIllIlI[69] = (232 ^ 174) ^ (65 ^ 35);
        lllIllIlI[70] = (((110 + 40) - 141) + 166) ^ (((120 + 56) - 65) + 27);
        lllIllIlI[71] = 14 ^ 39;
        lllIllIlI[72] = 2 ^ 40;
        lllIllIlI[73] = 46 ^ 5;
        lllIllIlI[74] = (-((-17569) & 30695)) & (-16385) & 32735;
        lllIllIlI[75] = (-12289) & 15578;
        lllIllIlI[76] = (-((-26887) & 31575)) & (-16642) & 24573;
        lllIllIlI[77] = (-((-5554) & 30139)) & (-4353) & 32217;
        lllIllIlI[78] = (-((-7345) & 15807)) & (-16897) & 28543;
        lllIllIlI[79] = (-24961) & 28127;
        lllIllIlI[80] = (56 ^ 117) ^ (19 ^ 110);
        lllIllIlI[81] = (-9025) & 12237;
        lllIllIlI[82] = (-17281) & 20461;
        lllIllIlI[83] = (-((-1107) & 30547)) & (-65) & 32758;
        lllIllIlI[84] = (-((-19873) & 32673)) & (-33) & 16063;
        lllIllIlI[85] = (-12296) & 15591;
        lllIllIlI[86] = (-17193) & 20346;
        lllIllIlI[87] = (-29441) & 32759;
        lllIllIlI[88] = (-((-4747) & 29583)) & (-537) & 28541;
        lllIllIlI[89] = (219 ^ 158) ^ (10 ^ 99);
    }

    static {
        llIIlIIlllIl();
        llIIlIIllIIl();
        bx = new ArrayList();
        int[] iArr = new int[lllIllIlI[9]];
        iArr[lllIllIlI[0]] = lllIllIlI[14];
        iArr[lllIllIlI[1]] = lllIllIlI[15];
        iArr[lllIllIlI[5]] = lllIllIlI[17];
        iArr[lllIllIlI[6]] = lllIllIlI[16];
        iArr[lllIllIlI[8]] = lllIllIlI[18];
        cM = iArr;
        cN = new WorldArea(lllIllIlI[74], lllIllIlI[75], lllIllIlI[40], lllIllIlI[40], lllIllIlI[0]);
        cO = new WorldArea(lllIllIlI[76], lllIllIlI[77], lllIllIlI[48], lllIllIlI[44], lllIllIlI[0]);
        cP = new WorldArea(lllIllIlI[78], lllIllIlI[79], lllIllIlI[80], lllIllIlI[21], lllIllIlI[0]);
        cQ = new WorldPoint(lllIllIlI[81], lllIllIlI[82], lllIllIlI[0]);
        cm = new WorldPoint(lllIllIlI[83], lllIllIlI[75], lllIllIlI[0]);
        cR = new WorldPoint(lllIllIlI[84], lllIllIlI[85], lllIllIlI[0]);
        cl = new WorldArea(lllIllIlI[86], lllIllIlI[87], lllIllIlI[67], lllIllIlI[53], lllIllIlI[0]);
        cS = new WorldPoint(lllIllIlI[88], lllIllIlI[43], lllIllIlI[0]);
    }

    public static void Q() {
        int[] iArr = new int[lllIllIlI[1]];
        iArr[lllIllIlI[0]] = lllIllIlI[12];
        if (llIIlIlIIIIl(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(lllIllIlI[12], lllIllIlI[13], lllIllIlI[54]));
            "".length();
        }
        int[] iArr2 = new int[lllIllIlI[1]];
        iArr2[lllIllIlI[0]] = lllIllIlI[18];
        if (llIIlIlIIIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(lllIllIlI[18], lllIllIlI[1], lllIllIlI[55]));
            "".length();
        }
        int[] iArr3 = new int[lllIllIlI[1]];
        iArr3[lllIllIlI[0]] = lllIllIlI[14];
        if (llIIlIlIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(lllIllIlI[14], lllIllIlI[1], lllIllIlI[7]));
            "".length();
        }
        int[] iArr4 = new int[lllIllIlI[1]];
        iArr4[lllIllIlI[0]] = lllIllIlI[15];
        if (llIIlIlIIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(lllIllIlI[15], lllIllIlI[1], lllIllIlI[7]));
            "".length();
        }
        int[] iArr5 = new int[lllIllIlI[1]];
        iArr5[lllIllIlI[0]] = lllIllIlI[16];
        if (llIIlIlIIIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(lllIllIlI[16], lllIllIlI[1], lllIllIlI[56]));
            "".length();
        }
        int[] iArr6 = new int[lllIllIlI[1]];
        iArr6[lllIllIlI[0]] = lllIllIlI[17];
        if (llIIlIlIIIIl(Bank.contains(iArr6) ? 1 : 0)) {
            bx.add(new C0003d(lllIllIlI[17], lllIllIlI[1], lllIllIlI[56]));
            "".length();
        }
    }

    private static void llIIlIIllIIl() {
        lllIllIIl = new String[lllIllIlI[89]];
        lllIllIIl[lllIllIlI[0]] = llIIlIIlIllI("FzIgBT0yZzAYNjg0", "UGYlS");
        lllIllIIl[lllIllIlI[1]] = llIIlIIlIlll("IhB4ohV1/m02weAdHg6meDZL0gOVeGNmoO06/50yBW+0H/XKEupeYaOamA8GzZnanMO7MOz0jWM=", "sEJzn");
        lllIllIIl[lllIllIlI[5]] = llIIlIIlIlll("iVEh4RPJ3kJI5oWYyDY4oUq3xMPax7PP", "sRaje");
        lllIllIIl[lllIllIlI[6]] = llIIlIIlIllI("DwILPiEuDQJ6LyYNDjMjIA==", "GceZM");
        lllIllIIl[lllIllIlI[8]] = llIIlIIllIII("1dN+4QzszRRgqiUVM/Kf1ihWIWq5l2B7WLtf/kV812EsoTLHE2zlA7YVBEnWZ/Nk", "zXoQv");
        lllIllIIl[lllIllIlI[9]] = llIIlIIlIllI("D10/JQIFCio=", "ioOHg");
        lllIllIIl[lllIllIlI[19]] = llIIlIIlIlll("ZNC5TE6E1yE=", "dMqyq");
        lllIllIIl[lllIllIlI[36]] = llIIlIIlIllI("BRI3QjMkUykLKydTJgsmJQcy", "KsAbG");
        lllIllIIl[lllIllIlI[37]] = llIIlIIllIII("FJwCFfocdLMGq0e9Quen0g==", "pbgDw");
        lllIllIIl[lllIllIlI[38]] = llIIlIIlIlll("sObagvKoGJsCWGndKoI6Wg==", "UZeYJ");
        lllIllIIl[lllIllIlI[39]] = llIIlIIlIllI("MSBtMxgVLCwk", "xNMPw");
        lllIllIIl[lllIllIlI[40]] = llIIlIIlIllI("CS47KxojMyEtWSAzIyZZLzMuJA0=", "HZOJy");
        lllIllIIl[lllIllIlI[2]] = llIIlIIlIlll("PBNSIcyIw3E=", "jIUzZ");
        lllIllIIl[lllIllIlI[41]] = llIIlIIllIII("DxsepEABtKrNOZonZg7wTw==", "EJUBj");
        lllIllIIl[lllIllIlI[3]] = llIIlIIllIII("Xum6vYwE4KpqZGqQ2K7hCA==", "lsInP");
        lllIllIIl[lllIllIlI[4]] = llIIlIIlIlll("98l6IUOPrDI=", "RucAM");
        lllIllIIl[lllIllIlI[44]] = llIIlIIllIII("pW7KNX8Yfrk=", "HEYRr");
        lllIllIIl[lllIllIlI[45]] = llIIlIIlIllI("DSMZOCAn", "LWmYC");
        lllIllIIl[lllIllIlI[46]] = llIIlIIlIllI("OCYyFRsS", "yRFtx");
        lllIllIIl[lllIllIlI[47]] = llIIlIIlIlll("zXuVY/xL8mw=", "aJdpM");
        lllIllIIl[lllIllIlI[20]] = llIIlIIlIllI("PgU0Og0=", "ilQVi");
        lllIllIIl[lllIllIlI[48]] = llIIlIIlIlll("0KqdcZ3c+58=", "NsgyY");
        lllIllIIl[lllIllIlI[50]] = llIIlIIllIII("bhJrFGatHcg=", "VKOby");
        lllIllIIl[lllIllIlI[51]] = llIIlIIllIII("+N641Bgo8no=", "VLXWV");
        lllIllIIl[lllIllIlI[52]] = llIIlIIllIII("DEDXQ+esjVlPvXS+GstszA==", "uYbFm");
        lllIllIIl[lllIllIlI[53]] = llIIlIIlIlll("Wc4qiY6jPVNs14D6bmlKFA==", "wqXzP");
        lllIllIIl[lllIllIlI[57]] = llIIlIIlIllI("YVlVY1F/Wk9yKDUHHzc=", "PkzRe");
        lllIllIIl[lllIllIlI[59]] = llIIlIIlIlll("gRamxqy3Dqs=", "vKObS");
        lllIllIIl[lllIllIlI[60]] = llIIlIIlIllI("Agw1", "RzeOL");
        lllIllIIl[lllIllIlI[61]] = llIIlIIlIllI("Fz8E", "GITdQ");
        lllIllIIl[lllIllIlI[21]] = llIIlIIlIllI("Kxs+DQ==", "crYeJ");
        lllIllIIl[lllIllIlI[64]] = llIIlIIllIII("czMFApXfoss=", "iyRxw");
        lllIllIIl[lllIllIlI[65]] = llIIlIIllIII("Sw2r/4uLrWI=", "xjueA");
        lllIllIIl[lllIllIlI[66]] = llIIlIIlIlll("7C8cwsY1R7U=", "kcvgX");
        lllIllIIl[lllIllIlI[67]] = llIIlIIllIII("FByCwehTJAE=", "NOyWp");
        lllIllIIl[lllIllIlI[68]] = llIIlIIlIllI("KBIVMxgNGQ==", "lwtWu");
        lllIllIIl[lllIllIlI[69]] = llIIlIIlIllI("NyohCDQWLyoDOQo9", "dZDmP");
        lllIllIIl[lllIllIlI[70]] = llIIlIIlIlll("FYqqemUm/Is=", "WgGIX");
        lllIllIIl[lllIllIlI[24]] = llIIlIIlIlll("XD4NBsFaGbM=", "LutWz");
        lllIllIIl[lllIllIlI[25]] = llIIlIIllIII("SQWlZ+MbB+Q=", "qQZjA");
        lllIllIIl[lllIllIlI[49]] = llIIlIIlIllI("GhYT", "Yydsb");
        lllIllIIl[lllIllIlI[71]] = llIIlIIlIllI("LR8kEicH", "lkPsD");
        lllIllIIl[lllIllIlI[72]] = llIIlIIllIII("tIpUBme5IyM=", "jberZ");
        lllIllIIl[lllIllIlI[73]] = llIIlIIllIII("4GxTXe45y4I=", "Yuaqr");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ab, code lost:
        if (llIIlIIlllll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0102, code lost:
        if (llIIlIIlllll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0159, code lost:
        if (llIIlIIlllll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b0, code lost:
        if (llIIlIIlllll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01ea, code lost:
        if (llIIlIIlllll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0230, code lost:
        return p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0015p.lllIllIlI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
        if (llIIlIIlllll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aN() {
        int[] iArr = new int[lllIllIlI[1]];
        iArr[lllIllIlI[0]] = lllIllIlI[14];
        if (llIIlIlIIIIl(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllIllIlI[1]];
            iArr2[lllIllIlI[0]] = lllIllIlI[14];
            if (llIIlIlIIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lllIllIlI[1]];
                iArr3[lllIllIlI[0]] = lllIllIlI[14];
            }
        }
        int[] iArr4 = new int[lllIllIlI[1]];
        iArr4[lllIllIlI[0]] = lllIllIlI[15];
        if (llIIlIlIIIIl(Equipment.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lllIllIlI[1]];
            iArr5[lllIllIlI[0]] = lllIllIlI[15];
            if (llIIlIlIIIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIllIlI[1]];
                iArr6[lllIllIlI[0]] = lllIllIlI[15];
            }
        }
        int[] iArr7 = new int[lllIllIlI[1]];
        iArr7[lllIllIlI[0]] = lllIllIlI[16];
        if (llIIlIlIIIIl(Equipment.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lllIllIlI[1]];
            iArr8[lllIllIlI[0]] = lllIllIlI[16];
            if (llIIlIlIIIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lllIllIlI[1]];
                iArr9[lllIllIlI[0]] = lllIllIlI[16];
            }
        }
        int[] iArr10 = new int[lllIllIlI[1]];
        iArr10[lllIllIlI[0]] = lllIllIlI[17];
        if (llIIlIlIIIIl(Equipment.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[lllIllIlI[1]];
            iArr11[lllIllIlI[0]] = lllIllIlI[17];
            if (llIIlIlIIIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lllIllIlI[1]];
                iArr12[lllIllIlI[0]] = lllIllIlI[17];
            }
        }
        int[] iArr13 = new int[lllIllIlI[1]];
        iArr13[lllIllIlI[0]] = lllIllIlI[18];
        if (llIIlIlIIIIl(Equipment.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lllIllIlI[1]];
            iArr14[lllIllIlI[0]] = lllIllIlI[18];
            if (llIIlIlIIIIl(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lllIllIlI[1]];
                iArr15[lllIllIlI[0]] = lllIllIlI[18];
            }
        }
        int[] iArr16 = new int[lllIllIlI[1]];
        iArr16[lllIllIlI[0]] = lllIllIlI[12];
        if (llIIlIlIIIIl(Inventory.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lllIllIlI[1]];
            iArr17[lllIllIlI[0]] = lllIllIlI[12];
        }
        ?? r0 = lllIllIlI[1];
        "".length();
        return 0 != 0 ? ((116 ^ 44) ^ (65 ^ 20)) & (((((153 + 171) - 221) + 88) ^ (((25 + 166) - 63) + 50)) ^ (-" ".length())) : r0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            aJ();
            "".length();
            if ("  ".length() < 0) {
                return ((((151 + 194) - 285) + 160) ^ (((21 + 16) - (-59)) + 63)) & (((230 ^ 145) ^ (38 ^ 18)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lllIllIlI[0];
    }

    private static boolean llIIlIlIIIIl(int i) {
        return i == 0;
    }

    private static boolean llIIlIlIIlIl(int i) {
        return i < 0;
    }

    private static String llIIlIIlIllI(String llIlIlIIIlIIl, String llIlIlIIIlIII) {
        String llIlIlIIIlIIl2 = new String(Base64.getDecoder().decode(llIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIlIIIIlll = new StringBuilder();
        char[] charArray = llIlIlIIIlIII.toCharArray();
        int llIlIlIIIIlIl = lllIllIlI[0];
        char[] charArray2 = llIlIlIIIlIIl2.toCharArray();
        int length = charArray2.length;
        int i = lllIllIlI[0];
        while (llIIlIlIIIII(i, length)) {
            llIlIlIIIIlll.append((char) (charArray2[i] ^ charArray[llIlIlIIIIlIl % charArray.length]));
            "".length();
            llIlIlIIIIlIl++;
            i++;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llIlIlIIIIlll);
    }

    private static String llIIlIIllIII(String llIlIIlllIlII, String llIlIIlllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIllIlI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIlllIlIl) {
            llIlIIlllIlIl.printStackTrace();
            return null;
        }
    }

    public static void D() {
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (llIIlIlIIIIl(world.isMembers() ? 1 : 0) && llIIlIlIIlll(world.getPlayerCount(), lllIllIlI[58]) && llIIlIlIlIll(world.getId(), Worlds.getCurrentId()) && llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[59]]) ? 1 : 0) && llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[60]]) ? 1 : 0) && llIIlIlIIIIl(world.getActivity().startsWith(lllIllIIl[lllIllIlI[61]]) ? 1 : 0) && llIIlIlIIIIl(world.getActivity().startsWith(lllIllIIl[lllIllIlI[21]]) ? 1 : 0) && llIIlIlIlIll(world.getId(), lllIllIlI[62]) && llIIlIlIlIll(world.getId(), lllIllIlI[63]) && llIIlIlIlIll(world.getId(), lllIllIlI[63]) && llIIlIlIIIIl(world.getActivity().contains(lllIllIIl[lllIllIlI[64]]) ? 1 : 0) && llIIlIlIIIIl(world.getActivity().contains(lllIllIIl[lllIllIlI[65]]) ? 1 : 0) && llIIlIlIIIIl(world.getActivity().contains(lllIllIIl[lllIllIlI[66]]) ? 1 : 0) && llIIlIlIIIIl(world.getActivity().startsWith(lllIllIIl[lllIllIlI[67]]) ? 1 : 0) && llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[68]]) ? 1 : 0) && llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[69]]) ? 1 : 0) && llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[70]]) ? 1 : 0) && llIIlIlIIIIl(world.getActivity().startsWith(lllIllIIl[lllIllIlI[24]]) ? 1 : 0) && llIIlIlIIllI(world.getPlayerCount(), lllIllIlI[21])) {
                ?? r0 = lllIllIlI[1];
                "".length();
                return ((183 ^ 190) ^ (33 ^ 45)) <= 0 ? ((109 ^ 23) ^ (107 ^ 25)) & (((((106 + 82) - 106) + 123) ^ (((70 + 155) - 140) + 112)) ^ (-" ".length())) : r0;
            }
            return lllIllIlI[0];
        }));
    }

    private static boolean llIIlIlIIllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIIlIlIIIlI(Skills.getLevel(Skill.ATTACK), lllIllIlI[2]) && llIIlIlIIIlI(Skills.getLevel(Skill.STRENGTH), lllIllIlI[3]) && llIIlIlIIIlI(Skills.getLevel(Skill.DEFENCE), lllIllIlI[4])) {
            ?? r0 = lllIllIlI[1];
            "".length();
            return " ".length() == (98 ^ 102) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIllIlI[0];
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllIllIIl[lllIllIlI[57]];
    }

    private static int llIIlIlIlIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIIlIlIlIll(int i, int i2) {
        return i != i2;
    }

    private static void am() {
        if (llIIlIlIIlIl(llIIlIlIlIIl(C0004e.w(), 30.0d))) {
            int[] iArr = new int[lllIllIlI[1]];
            iArr[lllIllIlI[0]] = lllIllIlI[12];
            if (llIIlIIlllll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIllIlI[1]];
                iArr2[lllIllIlI[0]] = lllIllIlI[12];
                Inventory.getFirst(iArr2).interact(lllIllIIl[lllIllIlI[4]]);
                Time.sleepTicks(lllIllIlI[1]);
                "".length();
            }
        }
        C0004e.F();
        if (llIIlIlIlIII(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (!llIIlIlIIIIl(npc.getName().contains(lllIllIIl[lllIllIlI[25]]) ? 1 : 0) || llIIlIIlllll(npc.getName().contains(lllIllIIl[lllIllIlI[49]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIllIlI[1]];
                    strArr[lllIllIlI[0]] = lllIllIIl[lllIllIlI[71]];
                    if (llIIlIIlllll(npc.hasAction(strArr) ? 1 : 0) && llIIlIlIlIII(npc.getInteracting()) && llIIlIlIIIIl(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lllIllIlI[1];
                        "".length();
                        return (((((132 + 84) - 179) + 96) ^ (((115 + 46) - 128) + 113)) & (((225 ^ 131) ^ (61 ^ 72)) ^ (-" ".length()))) != (((49 ^ 117) ^ (27 ^ 104)) & (((212 ^ 197) ^ (133 ^ 163)) ^ (-" ".length()))) ? ((117 ^ 35) ^ (40 ^ 101)) & (((((78 + 38) - 3) + 60) ^ (((0 + 94) - 6) + 94)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIllIlI[0];
            });
            String[] strArr = new String[lllIllIlI[1]];
            strArr[lllIllIlI[0]] = lllIllIIl[lllIllIlI[44]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (llIIlIlIllII(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lllIllIlI[1];
                    "".length();
                    return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIllIlI[0];
            }).collect(Collectors.toList());
            if (llIIlIlIIIll(nearest) && llIIlIIlllll(list.isEmpty() ? 1 : 0) && llIIlIlIIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lllIllIIl[lllIllIlI[45]]);
                Time.sleepTicks(lllIllIlI[6]);
                "".length();
            }
            if (llIIlIlIIIIl(list.isEmpty() ? 1 : 0) && llIIlIlIlIII(Players.getLocal().getInteracting())) {
                ((NPC) list.get(lllIllIlI[0])).interact(lllIllIIl[lllIllIlI[46]]);
                Time.sleepTicks(lllIllIlI[6]);
                "".length();
            }
        }
    }

    private static boolean llIIlIlIIIll(Object obj) {
        return obj != null;
    }

    private static void aj() {
        WorldArea worldArea = new WorldArea(lllIllIlI[22], lllIllIlI[23], lllIllIlI[24], lllIllIlI[25], lllIllIlI[0]);
        WorldPoint worldPoint = new WorldPoint(lllIllIlI[26], lllIllIlI[27], lllIllIlI[0]);
        WorldPoint worldPoint2 = new WorldPoint(lllIllIlI[28], lllIllIlI[29], lllIllIlI[0]);
        C0004e.F();
        if (llIIlIlIIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint3 = new WorldPoint(lllIllIlI[30], lllIllIlI[31], lllIllIlI[0]);
            WorldPoint worldPoint4 = new WorldPoint(lllIllIlI[30], lllIllIlI[32], lllIllIlI[0]);
            if (!llIIlIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || llIIlIIlllll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(lllIllIlI[33], lllIllIlI[34], lllIllIlI[0]);
                C0004e.c(worldPoint5);
                Time.sleepUntil(() -> {
                    return Players.getLocal().getWorldLocation().equals(worldPoint5);
                }, lllIllIlI[35]);
                "".length();
            }
            AccBuilderGWD.c = lllIllIIl[lllIllIlI[36]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lllIllIlI[1]);
            "".length();
        }
        List all = Players.getAll(player -> {
            return worldArea.contains(player);
        });
        if (llIIlIIlllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlIlIIIlI(all.size(), lllIllIlI[19])) {
            if (llIIlIlIIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllIllIlI[5])) {
                AccBuilderGWD.c = lllIllIIl[lllIllIlI[37]];
                Movement.walkTo(worldPoint2);
                "".length();
                Time.sleepTicks(lllIllIlI[1]);
                "".length();
            }
            if (llIIlIlIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllIllIlI[5])) {
                AccBuilderGWD.c = lllIllIIl[lllIllIlI[38]];
                D();
            }
        }
        if (llIIlIIlllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIlIlIIIII(all.size(), lllIllIlI[19])) {
            if (llIIlIlIIIll(Players.getLocal().getInteracting())) {
                AccBuilderGWD.c = lllIllIIl[lllIllIlI[39]];
            }
            if (llIIlIlIlIII(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (llIIlIIlllll(npc.getName().contains(lllIllIIl[lllIllIlI[73]]) ? 1 : 0) && llIIlIlIlIII(npc.getInteracting()) && llIIlIlIIIIl(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lllIllIlI[1];
                        "".length();
                        return ((10 ^ 52) ^ (123 ^ 65)) <= 0 ? ((62 ^ 100) ^ (62 ^ 89)) & (((163 ^ 142) ^ (175 ^ 191)) ^ (-" ".length())) : r0;
                    }
                    return lllIllIlI[0];
                });
                NPC nearest2 = NPCs.getNearest(npc2 -> {
                    if (llIIlIIlllll(npc2.getName().contains(lllIllIIl[lllIllIlI[72]]) ? 1 : 0) && llIIlIlIllII(npc2.getInteracting(), Players.getLocal()) && llIIlIlIIIIl(npc2.isDead() ? 1 : 0)) {
                        ?? r0 = lllIllIlI[1];
                        "".length();
                        return (-(187 ^ 191)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllIllIlI[0];
                });
                if (llIIlIlIIIll(nearest) && llIIlIlIlIII(nearest2)) {
                    AccBuilderGWD.c = lllIllIIl[lllIllIlI[40]];
                    nearest.interact(lllIllIIl[lllIllIlI[2]]);
                    Time.sleepTicks(lllIllIlI[5]);
                    "".length();
                }
            }
        }
    }
}
