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
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ap  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/ap.class */
public class ap implements ab {
    private static /* synthetic */ int[] llIIlIIII;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ String[] llIIIlllI;
    public static /* synthetic */ List<C0003d> bx;

    private static boolean lIlIlIIIIlIl(int i) {
        return i != 0;
    }

    static {
        lIlIlIIIIlII();
        lIlIlIIIIIll();
        bx = new ArrayList();
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIIIlllI[llIIlIIII[30]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIIlIIII[0];
    }

    private static String lIlIIlllllll(String lIllIlIIIIlllI, String lIllIlIIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIIII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIlIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIlIIIIllll) {
            lIllIlIIIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIlIIl(Object obj) {
        return obj != null;
    }

    public static void Q() {
        if (lIlIlIIIIllI(Skills.getLevel(Skill.HERBLORE), llIIlIIII[7])) {
            int[] iArr = new int[llIIlIIII[1]];
            iArr[llIIlIIII[0]] = llIIlIIII[8];
            if (lIlIlIIIIlll(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIII[8], llIIlIIII[19], llIIlIIII[20]));
                "".length();
            }
            int[] iArr2 = new int[llIIlIIII[1]];
            iArr2[llIIlIIII[0]] = llIIlIIII[10];
            if (lIlIlIIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIII[10], eL(), llIIlIIII[21]));
                "".length();
            }
        }
        if (lIlIlIIIlIll(Skills.getLevel(Skill.HERBLORE), llIIlIIII[7]) && lIlIlIIIIllI(Skills.getLevel(Skill.HERBLORE), llIIlIIII[11])) {
            int[] iArr3 = new int[llIIlIIII[1]];
            iArr3[llIIlIIII[0]] = llIIlIIII[12];
            if (lIlIlIIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIII[12], eL(), llIIlIIII[22]));
                "".length();
            }
            int[] iArr4 = new int[llIIlIIII[1]];
            iArr4[llIIlIIII[0]] = llIIlIIII[13];
            if (lIlIlIIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIII[13], eL(), llIIlIIII[23]));
                "".length();
            }
        }
        if (lIlIlIIIlIll(Skills.getLevel(Skill.HERBLORE), llIIlIIII[11])) {
            int[] iArr5 = new int[llIIlIIII[1]];
            iArr5[llIIlIIII[0]] = llIIlIIII[8];
            if (lIlIlIIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIII[8], llIIlIIII[19], llIIlIIII[20]));
                "".length();
            }
            int[] iArr6 = new int[llIIlIIII[1]];
            iArr6[llIIlIIII[0]] = llIIlIIII[14];
            if (lIlIlIIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                bx.add(new C0003d(llIIlIIII[14], llIIlIIII[19], llIIlIIII[24]));
                "".length();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    private static boolean an() {
        if (lIlIlIIIIllI(Skills.getLevel(Skill.HERBLORE), llIIlIIII[7])) {
            int[] iArr = new int[llIIlIIII[1]];
            iArr[llIIlIIII[0]] = llIIlIIII[8];
            if (lIlIlIIIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIlIIII[1]];
                iArr2[llIIlIIII[0]] = llIIlIIII[10];
                if (lIlIlIIIIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    ?? r0 = llIIlIIII[1];
                    "".length();
                    return (-(8 ^ 13)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return llIIlIIII[0];
        } else if (lIlIlIIIlIll(Skills.getLevel(Skill.HERBLORE), llIIlIIII[7]) && lIlIlIIIIllI(Skills.getLevel(Skill.HERBLORE), llIIlIIII[11])) {
            int[] iArr3 = new int[llIIlIIII[1]];
            iArr3[llIIlIIII[0]] = llIIlIIII[12];
            if (lIlIlIIIIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIlIIII[1]];
                iArr4[llIIlIIII[0]] = llIIlIIII[13];
                if (lIlIlIIIIlIl(Inventory.contains(iArr4) ? 1 : 0)) {
                    ?? r02 = llIIlIIII[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
            return llIIlIIII[0];
        } else if (lIlIlIIIlIll(Skills.getLevel(Skill.HERBLORE), llIIlIIII[11])) {
            int[] iArr5 = new int[llIIlIIII[1]];
            iArr5[llIIlIIII[0]] = llIIlIIII[8];
            if (lIlIlIIIIlIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIlIIII[1]];
                iArr6[llIIlIIII[0]] = llIIlIIII[14];
                if (lIlIlIIIIlIl(Inventory.contains(iArr6) ? 1 : 0)) {
                    ?? r03 = llIIlIIII[1];
                    "".length();
                    return "  ".length() != "  ".length() ? ((163 ^ 159) ^ "  ".length()) & (((((69 + 79) - 42) + 39) ^ (((99 + 9) - (-13)) + 54)) ^ (-" ".length())) : r03;
                }
            }
            return llIIlIIII[0];
        } else {
            return llIIlIIII[0];
        }
    }

    private static boolean lIlIlIIIlIII(int i, int i2) {
        return i == i2;
    }

    private static void lIlIlIIIIlII() {
        llIIlIIII = new int[36];
        llIIlIIII[0] = ((163 ^ 136) ^ (7 ^ 10)) & (((125 ^ 28) ^ (14 ^ 73)) ^ (-" ".length()));
        llIIlIIII[1] = " ".length();
        llIIlIIII[2] = 207 ^ 159;
        llIIlIIII[3] = (35 ^ 71) ^ (99 ^ 3);
        llIIlIIII[4] = "  ".length();
        llIIlIIII[5] = "   ".length();
        llIIlIIII[6] = (-((-16954) & 28221)) & (-1) & 16267;
        llIIlIIII[7] = 190 ^ 164;
        llIIlIIII[8] = (((((143 + 23) - 57) + 96) + (213 ^ 173)) - (((7 + 83) - (-77)) + 51)) + (72 ^ 58);
        llIIlIIII[9] = (169 ^ 146) ^ (32 ^ 21);
        llIIlIIII[10] = 229 ^ 190;
        llIIlIIII[11] = (((22 + 144) - 20) + 36) ^ (((102 + 42) - 107) + 118);
        llIIlIIII[12] = (-20489) & 22463;
        llIIlIIII[13] = (((135 + 186) - 314) + 205) ^ (((35 + 71) - 45) + 120);
        llIIlIIII[14] = (((101 + 40) - (-46)) + 25) ^ (((75 + 102) - 69) + 69);
        llIIlIIII[15] = 33 ^ 36;
        llIIlIIII[16] = (-722) & 991;
        llIIlIIII[17] = 163 ^ 174;
        llIIlIIII[18] = (-72) & 25071;
        llIIlIIII[19] = (-31763) & 32762;
        llIIlIIII[20] = (((154 + 112) - 188) + 85) ^ (((136 + 28) - (-13)) + 6);
        llIIlIIII[21] = (-9232) & 9631;
        llIIlIIII[22] = 246 ^ 146;
        llIIlIIII[23] = (-28845) & 29694;
        llIIlIIII[24] = (-28689) & 30488;
        llIIlIIII[25] = (-20699) & 29438;
        llIIlIIII[26] = (-((-23349) & 24375)) & (-402) & 62939;
        llIIlIIII[27] = (38 ^ 120) ^ (214 ^ 145);
        llIIlIIII[28] = (126 ^ 47) ^ (140 ^ 158);
        llIIlIIII[29] = 201 ^ 198;
        llIIlIIII[30] = 62 ^ 56;
        llIIlIIII[31] = (((111 + 200) - 117) + 32) ^ (((59 + 5) - 58) + 123);
        llIIlIIII[32] = 148 ^ 147;
        llIIlIIII[33] = (((125 + 61) - 103) + 92) ^ (((106 + 6) - 54) + 109);
        llIIlIIII[34] = (60 ^ 70) ^ (247 ^ 132);
        llIIlIIII[35] = 110 ^ 100;
    }

    private static boolean lIlIlIIIllII(int i, int i2) {
        return i != i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        eK();
        return llIIlIIII[22];
    }

    private static boolean lIlIlIIIlIll(int i, int i2) {
        return i >= i2;
    }

    private static int eL() {
        return lIlIlIIIIllI(Skills.getLevel(Skill.HERBLORE), llIIlIIII[7]) ? ((llIIlIIII[25] - Skills.getExperience(Skill.HERBLORE)) / llIIlIIII[27]) + llIIlIIII[15] : (lIlIlIIIlIll(Skills.getLevel(Skill.HERBLORE), llIIlIIII[7]) && lIlIlIIIIllI(Skills.getLevel(Skill.HERBLORE), llIIlIIII[11])) ? ((llIIlIIII[26] - Skills.getExperience(Skill.HERBLORE)) / llIIlIIII[28]) + llIIlIIII[29] : llIIlIIII[1];
    }

    private static String lIlIIlllllIl(String lIllIIlllllllI, String lIllIIllllllIl) {
        String lIllIIlllllllI2 = new String(Base64.getDecoder().decode(lIllIIlllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIllIIlllllIll = lIllIIllllllIl.toCharArray();
        int lIllIIlllllIlI = llIIlIIII[0];
        char[] charArray = lIllIIlllllllI2.toCharArray();
        int length = charArray.length;
        int i = llIIlIIII[0];
        while (lIlIlIIIIllI(i, length)) {
            sb.append((char) (charArray[i] ^ lIllIIlllllIll[lIllIIlllllIlI % lIllIIlllllIll.length]));
            "".length();
            lIllIIlllllIlI++;
            i++;
            "".length();
            if ((113 ^ 117) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    private static boolean eM() {
        if (lIlIlIIIIllI(Skills.getLevel(Skill.HERBLORE), llIIlIIII[7])) {
            int[] iArr = new int[llIIlIIII[1]];
            iArr[llIIlIIII[0]] = llIIlIIII[8];
            if (lIlIlIIIIlIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIlIIII[1]];
                iArr2[llIIlIIII[0]] = llIIlIIII[10];
                if (lIlIlIIIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                    ?? r0 = llIIlIIII[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                }
            }
            return llIIlIIII[0];
        } else if (lIlIlIIIlIll(Skills.getLevel(Skill.HERBLORE), llIIlIIII[7]) && lIlIlIIIIllI(Skills.getLevel(Skill.HERBLORE), llIIlIIII[11])) {
            int[] iArr3 = new int[llIIlIIII[1]];
            iArr3[llIIlIIII[0]] = llIIlIIII[12];
            if (lIlIlIIIIlIl(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIlIIII[1]];
                iArr4[llIIlIIII[0]] = llIIlIIII[13];
                if (lIlIlIIIIlIl(Bank.contains(iArr4) ? 1 : 0)) {
                    ?? r02 = llIIlIIII[1];
                    "".length();
                    return (((((8 + 117) - 11) + 30) ^ (((33 + 51) - (-34)) + 42)) & (((145 ^ 175) ^ (22 ^ 24)) ^ (-" ".length()))) != 0 ? ((((36 + 4) - (-84)) + 3) ^ (203 ^ 170)) & (((((20 + 139) - 4) + 23) ^ (((82 + 21) - 95) + 164)) ^ (-" ".length())) : r02;
                }
            }
            return llIIlIIII[0];
        } else if (lIlIlIIIlIll(Skills.getLevel(Skill.HERBLORE), llIIlIIII[11])) {
            int[] iArr5 = new int[llIIlIIII[1]];
            iArr5[llIIlIIII[0]] = llIIlIIII[8];
            if (lIlIlIIIIlIl(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIlIIII[1]];
                iArr6[llIIlIIII[0]] = llIIlIIII[14];
                if (lIlIlIIIIlIl(Bank.contains(iArr6) ? 1 : 0)) {
                    ?? r03 = llIIlIIII[1];
                    "".length();
                    return (((59 ^ 83) ^ (37 ^ 74)) & (((((109 + 0) - 79) + 109) ^ (((25 + 125) - 33) + 23)) ^ (-" ".length()))) > "  ".length() ? ((21 ^ 35) ^ (184 ^ 165)) & (((223 ^ 165) ^ (10 ^ 91)) ^ (-" ".length())) : r03;
                }
            }
            return llIIlIIII[0];
        } else {
            return llIIlIIII[0];
        }
    }

    private static String lIlIIllllllI(String lIllIIlllIlIIl, String lIllIIlllIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIlllIlIII.getBytes(StandardCharsets.UTF_8)), llIIlIIII[33]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIIlllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIlllIlIlI) {
            lIllIIlllIlIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x043f, code lost:
        if (lIlIlIIIlIII(net.unethicalite.api.items.Inventory.getAll(r0).size(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ap.llIIlIIII[1]) != false) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v188, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void eK() {
        if (lIlIlIIIIlIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIIIlllI[llIIlIIII[0]];
            C0001b.a(bx);
            if (lIlIlIIIIllI(bx.size(), llIIlIIII[1])) {
                System.out.println(llIIIlllI[llIIlIIII[1]]);
                bv = llIIlIIII[0];
            }
        }
        if (lIlIlIIIIlll(bv ? 1 : 0)) {
            if (lIlIlIIIIllI(C0004e.j(llIIlIIII[2]), llIIlIIII[3])) {
                C0024y.bh();
            }
            if (lIlIlIIIIlll(an() ? 1 : 0) && lIlIlIIIlIII(C0004e.j(llIIlIIII[2]), llIIlIIII[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlIIIlIIl(nearest) && lIlIlIIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIIlllI[llIIlIIII[4]];
                    C0000a.a(nearest);
                }
                if (lIlIlIIIlIIl(nearest) && lIlIlIIIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIIlllI[llIIlIIII[5]];
                    if (lIlIlIIIIlll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIlIIII[6]);
                        "".length();
                    }
                    if (lIlIlIIIIlIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIlIIIlIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIlIIII[5]);
                            "".length();
                        }
                        if (lIlIlIIIIlll(eM() ? 1 : 0)) {
                            Q();
                            System.out.println(llIIIlllI[llIIlIIII[3]]);
                            bv = llIIlIIII[1];
                            return;
                        }
                        if (lIlIlIIIIllI(Skills.getLevel(Skill.HERBLORE), llIIlIIII[7])) {
                            C0000a.a(llIIlIIII[8], llIIlIIII[9]);
                            C0000a.a(llIIlIIII[10], llIIlIIII[9]);
                        }
                        if (lIlIlIIIlIll(Skills.getLevel(Skill.HERBLORE), llIIlIIII[7]) && lIlIlIIIIllI(Skills.getLevel(Skill.HERBLORE), llIIlIIII[11])) {
                            C0000a.a(llIIlIIII[12], llIIlIIII[9]);
                            C0000a.a(llIIlIIII[13], llIIlIIII[9]);
                        }
                        if (lIlIlIIIlIll(Skills.getLevel(Skill.HERBLORE), llIIlIIII[11])) {
                            C0000a.a(llIIlIIII[8], llIIlIIII[9]);
                            C0000a.a(llIIlIIII[14], llIIlIIII[9]);
                        }
                    }
                }
            }
            if (lIlIlIIIIlIl(an() ? 1 : 0)) {
                if (lIlIlIIIIlIl(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lIlIlIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                AccBuilderGWD.c = llIIIlllI[llIIlIIII[15]];
                int[] iArr = new int[llIIlIIII[1]];
                iArr[llIIlIIII[0]] = llIIlIIII[8];
                if (lIlIlIIIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIIlIIII[1]];
                    iArr2[llIIlIIII[0]] = llIIlIIII[10];
                    if (lIlIlIIIIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[llIIlIIII[1]];
                        iArr3[llIIlIIII[0]] = llIIlIIII[8];
                        Item first = Inventory.getFirst(iArr3);
                        int[] iArr4 = new int[llIIlIIII[1]];
                        iArr4[llIIlIIII[0]] = llIIlIIII[10];
                        first.useOn(Inventory.getFirst(iArr4));
                        Time.sleepTicks(llIIlIIII[1]);
                        "".length();
                    }
                }
                int[] iArr5 = new int[llIIlIIII[1]];
                iArr5[llIIlIIII[0]] = llIIlIIII[12];
                if (lIlIlIIIIlIl(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[llIIlIIII[1]];
                    iArr6[llIIlIIII[0]] = llIIlIIII[13];
                    if (lIlIlIIIIlIl(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIIlIIII[1]];
                        iArr7[llIIlIIII[0]] = llIIlIIII[12];
                        Item first2 = Inventory.getFirst(iArr7);
                        int[] iArr8 = new int[llIIlIIII[1]];
                        iArr8[llIIlIIII[0]] = llIIlIIII[13];
                        first2.useOn(Inventory.getFirst(iArr8));
                        Time.sleepTicks(llIIlIIII[1]);
                        "".length();
                    }
                }
                int[] iArr9 = new int[llIIlIIII[1]];
                iArr9[llIIlIIII[0]] = llIIlIIII[8];
                if (lIlIlIIIIlIl(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIIlIIII[1]];
                    iArr10[llIIlIIII[0]] = llIIlIIII[14];
                    if (lIlIlIIIIlIl(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llIIlIIII[1]];
                        iArr11[llIIlIIII[0]] = llIIlIIII[8];
                        Item first3 = Inventory.getFirst(iArr11);
                        int[] iArr12 = new int[llIIlIIII[1]];
                        iArr12[llIIlIIII[0]] = llIIlIIII[14];
                        first3.useOn(Inventory.getFirst(iArr12));
                        Time.sleepTicks(llIIlIIII[1]);
                        "".length();
                    }
                }
                int[] iArr13 = new int[llIIlIIII[1]];
                iArr13[llIIlIIII[0]] = llIIlIIII[8];
                if (lIlIlIIIllII(Inventory.getAll(iArr13).size(), llIIlIIII[1])) {
                    int[] iArr14 = new int[llIIlIIII[1]];
                    iArr14[llIIlIIII[0]] = llIIlIIII[14];
                    if (lIlIlIIIllII(Inventory.getAll(iArr14).size(), llIIlIIII[1])) {
                        int[] iArr15 = new int[llIIlIIII[1]];
                        iArr15[llIIlIIII[0]] = llIIlIIII[13];
                        if (lIlIlIIIllII(Inventory.getAll(iArr15).size(), llIIlIIII[1])) {
                            int[] iArr16 = new int[llIIlIIII[1]];
                            iArr16[llIIlIIII[0]] = llIIlIIII[10];
                            if (lIlIlIIIllII(Inventory.getAll(iArr16).size(), llIIlIIII[1])) {
                                int[] iArr17 = new int[llIIlIIII[1]];
                                iArr17[llIIlIIII[0]] = llIIlIIII[12];
                            }
                        }
                    }
                }
                Time.sleepTicks(llIIlIIII[15]);
                "".length();
                if (lIlIlIIIIlIl(Inventory.contains(item -> {
                    return item.getName().contains(llIIIlllI[llIIlIIII[34]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item2 -> {
                        return item2.getName().contains(llIIIlllI[llIIlIIII[33]]);
                    }).useOn(Inventory.getFirst(item3 -> {
                        return item3.getName().contains(llIIIlllI[llIIlIIII[32]]);
                    }));
                }
                if (lIlIlIIIlIIl(Widgets.get(llIIlIIII[16], llIIlIIII[17]))) {
                    Dialog.continueSpace();
                    Time.sleepTicks(llIIlIIII[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        int[] iArr18 = new int[llIIlIIII[1]];
                        iArr18[llIIlIIII[0]] = llIIlIIII[8];
                        if (lIlIlIIIIlll(Inventory.contains(iArr18) ? 1 : 0)) {
                            int[] iArr19 = new int[llIIlIIII[1]];
                            iArr19[llIIlIIII[0]] = llIIlIIII[12];
                        }
                        if (!lIlIlIIIIlIl(Dialog.canLevelUpContinue() ? 1 : 0)) {
                            return llIIlIIII[0];
                        }
                        ?? r0 = llIIlIIII[1];
                        "".length();
                        return ((156 ^ 171) & ((184 ^ 143) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }, llIIlIIII[18]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIlIlIIIlIll(Skills.getLevel(Skill.HERBLORE), llIIlIIII[31])) {
            ?? r0 = llIIlIIII[1];
            "".length();
            return (-" ".length()) > 0 ? ((75 ^ 99) ^ (122 ^ 7)) & (((25 ^ 94) ^ (39 ^ 53)) ^ (-" ".length())) : r0;
        }
        return llIIlIIII[0];
    }

    private static boolean lIlIlIIIlIlI(int i) {
        return i > 0;
    }

    private static boolean lIlIlIIIIlll(int i) {
        return i == 0;
    }

    private static void lIlIlIIIIIll() {
        llIIIlllI = new String[llIIlIIII[35]];
        llIIIlllI[llIIlIIII[0]] = lIlIIlllllIl("GwQDGzQ+URMGPzQC", "YqzrZ");
        llIIIlllI[llIIlIIII[1]] = lIlIIllllllI("dItApc4gSBZ+iSXjyKc2EUv7/YJKihN+lQIk4uSMx11plEYegTTlfZ8RoCBuN9Qo/ebQTzNSxMU=", "yJJJQ");
        llIIIlllI[llIIlIIII[4]] = lIlIIlllllll("Ueoo3By6npWrZHeKWC7JNSReygwgmdYe", "QqGyu");
        llIIIlllI[llIIlIIII[5]] = lIlIIllllllI("3n2oqc09ysQ5FxYeJQrPEn3f+ACMJMof", "uscdE");
        llIIIlllI[llIIlIIII[3]] = lIlIIlllllll("t2elnFmHy9mXKaFUfdWtk9kA2D3jY6jvyHli3/qB8gHVuVI8HWV8saZuoA4IlWv5", "ObzpM");
        llIIIlllI[llIIlIIII[15]] = lIlIIlllllIl("Px0KEAoVVAIWEBsbHAo=", "rtryd");
        llIIIlllI[llIIlIIII[30]] = lIlIIllllllI("Xzu92lNiBhxQIHRgqqpoRA==", "wPGea");
        llIIIlllI[llIIlIIII[32]] = lIlIIlllllIl("AT07LBo=", "TSXYn");
        llIIIlllI[llIIlIIII[33]] = lIlIIllllllI("MdC6243Zkcc=", "KzPDk");
        llIIIlllI[llIIlIIII[34]] = lIlIIlllllll("L9+pK1+T6wg=", "mZHbs");
    }

    private static boolean lIlIlIIIIllI(int i, int i2) {
        return i < i2;
    }
}
