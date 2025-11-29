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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aB  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aB.class */
public class aB implements InterfaceC0003ac {
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] llIIlIIlII;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ int[] llIIlIIlIl;

    public static void Q() {
        if (lIlIlIlIIllII(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[7])) {
            int[] iArr = new int[llIIlIIlIl[1]];
            iArr[llIIlIIlIl[0]] = llIIlIIlIl[8];
            if (lIlIlIlIIllIl(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(llIIlIIlIl[8], llIIlIIlIl[19], llIIlIIlIl[20]));
                "".length();
            }
            int[] iArr2 = new int[llIIlIIlIl[1]];
            iArr2[llIIlIIlIl[0]] = llIIlIIlIl[10];
            if (lIlIlIlIIllIl(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(llIIlIIlIl[10], fM(), llIIlIIlIl[21]));
                "".length();
            }
        }
        if (lIlIlIlIlIIIl(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[7]) && lIlIlIlIIllII(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[11])) {
            int[] iArr3 = new int[llIIlIIlIl[1]];
            iArr3[llIIlIIlIl[0]] = llIIlIIlIl[12];
            if (lIlIlIlIIllIl(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0017d(llIIlIIlIl[12], fM(), llIIlIIlIl[22]));
                "".length();
            }
            int[] iArr4 = new int[llIIlIIlIl[1]];
            iArr4[llIIlIIlIl[0]] = llIIlIIlIl[13];
            if (lIlIlIlIIllIl(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0017d(llIIlIIlIl[13], fM(), llIIlIIlIl[23]));
                "".length();
            }
        }
        if (lIlIlIlIlIIIl(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[11])) {
            int[] iArr5 = new int[llIIlIIlIl[1]];
            iArr5[llIIlIIlIl[0]] = llIIlIIlIl[8];
            if (lIlIlIlIIllIl(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0017d(llIIlIIlIl[8], llIIlIIlIl[19], llIIlIIlIl[20]));
                "".length();
            }
            int[] iArr6 = new int[llIIlIIlIl[1]];
            iArr6[llIIlIIlIl[0]] = llIIlIIlIl[14];
            if (lIlIlIlIIllIl(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0017d(llIIlIIlIl[14], llIIlIIlIl[19], llIIlIIlIl[24]));
                "".length();
            }
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        fL();
        return llIIlIIlIl[22];
    }

    private static int fM() {
        return lIlIlIlIIllII(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[7]) ? ((llIIlIIlIl[25] - Skills.getExperience(Skill.HERBLORE)) / llIIlIIlIl[27]) + llIIlIIlIl[15] : (lIlIlIlIlIIIl(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[7]) && lIlIlIlIIllII(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[11])) ? ((llIIlIIlIl[26] - Skills.getExperience(Skill.HERBLORE)) / llIIlIIlIl[28]) + llIIlIIlIl[29] : llIIlIIlIl[1];
    }

    private static boolean lIlIlIlIIllII(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlIIllIIII(String llllllllllllllllllIlIIlIlIIlIIIl, String llllllllllllllllllIlIIlIlIIlIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIlIIlIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIlIIlIlIIlIIII.toCharArray();
        int llllllllllllllllllIlIIlIlIIIllIl = llIIlIIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIIlIl[0];
        while (lIlIlIlIIllII(i, length)) {
            char llllllllllllllllllIlIIlIlIIlIIlI = charArray2[i];
            sb.append((char) (llllllllllllllllllIlIIlIlIIlIIlI ^ charArray[llllllllllllllllllIlIIlIlIIIllIl % charArray.length]));
            "".length();
            llllllllllllllllllIlIIlIlIIIllIl++;
            i++;
            "".length();
            if (!(true ^ true)) {
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
    private static boolean an() {
        if (lIlIlIlIIllII(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[7])) {
            int[] iArr = new int[llIIlIIlIl[1]];
            iArr[llIIlIIlIl[0]] = llIIlIIlIl[8];
            if (lIlIlIlIIlIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIlIIlIl[1]];
                iArr2[llIIlIIlIl[0]] = llIIlIIlIl[10];
                if (lIlIlIlIIlIll(Inventory.contains(iArr2) ? 1 : 0)) {
                    ?? r0 = llIIlIIlIl[1];
                    "".length();
                    return !((true ^ true) ^ (true ^ true)) ? ((76 ^ 3) ^ (0 ^ 7)) & (((16 ^ 7) ^ (89 ^ 6)) ^ (-" ".length())) : r0;
                }
            }
            return llIIlIIlIl[0];
        } else if (lIlIlIlIlIIIl(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[7]) && lIlIlIlIIllII(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[11])) {
            int[] iArr3 = new int[llIIlIIlIl[1]];
            iArr3[llIIlIIlIl[0]] = llIIlIIlIl[12];
            if (lIlIlIlIIlIll(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIlIIlIl[1]];
                iArr4[llIIlIIlIl[0]] = llIIlIIlIl[13];
                if (lIlIlIlIIlIll(Inventory.contains(iArr4) ? 1 : 0)) {
                    ?? r02 = llIIlIIlIl[1];
                    "".length();
                    return 0 != 0 ? ((((110 + 139) - 142) + 33) ^ (((115 + 73) - 90) + 30)) & (((((3 + 52) - (-21)) + 107) ^ (((27 + 88) - (-19)) + 53)) ^ (-" ".length())) : r02;
                }
            }
            return llIIlIIlIl[0];
        } else if (lIlIlIlIlIIIl(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[11])) {
            int[] iArr5 = new int[llIIlIIlIl[1]];
            iArr5[llIIlIIlIl[0]] = llIIlIIlIl[8];
            if (lIlIlIlIIlIll(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIlIIlIl[1]];
                iArr6[llIIlIIlIl[0]] = llIIlIIlIl[14];
                if (lIlIlIlIIlIll(Inventory.contains(iArr6) ? 1 : 0)) {
                    ?? r03 = llIIlIIlIl[1];
                    "".length();
                    return (-(136 ^ 141)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return llIIlIIlIl[0];
        } else {
            return llIIlIIlIl[0];
        }
    }

    static {
        lIlIlIIllIIlI();
        lIlIlIIllIIIl();
        bv = new ArrayList();
    }

    private static boolean lIlIlIlIIlllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIlIlIIllll(Object obj) {
        return obj != null;
    }

    private static String lIlIlIIlIllll(String llllllllllllllllllIlIIlIlIlIIIIl, String llllllllllllllllllIlIIlIlIlIIIII) {
        try {
            SecretKeySpec llllllllllllllllllIlIIlIlIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlIlIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIIlIlIlIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIIlIlIlIIIll.init(llIIlIIlIl[4], llllllllllllllllllIlIIlIlIlIIlII);
            return new String(llllllllllllllllllIlIIlIlIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIlIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIIlIlIlIIIlI) {
            llllllllllllllllllIlIIlIlIlIIIlI.printStackTrace();
            return null;
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIlIIlII[llIIlIIlIl[30]];
    }

    private static boolean lIlIlIlIIllIl(int i) {
        return i == 0;
    }

    private static boolean lIlIlIlIlIIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x043f, code lost:
        if (lIlIlIlIIlllI(net.unethicalite.api.items.Inventory.getAll(r0).size(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aB.llIIlIIlIl[1]) != false) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v188, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void fL() {
        if (lIlIlIlIIlIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIIlII[llIIlIIlIl[0]];
            C0015b.a(bv);
            if (lIlIlIlIIllII(bv.size(), llIIlIIlIl[1])) {
                System.out.println(llIIlIIlII[llIIlIIlIl[1]]);
                bt = llIIlIIlIl[0];
            }
        }
        if (lIlIlIlIIllIl(bt ? 1 : 0)) {
            if (lIlIlIlIIllII(C0018e.j(llIIlIIlIl[2]), llIIlIIlIl[3])) {
                C0039z.bt();
            }
            if (lIlIlIlIIllIl(an() ? 1 : 0) && lIlIlIlIIlllI(C0018e.j(llIIlIIlIl[2]), llIIlIIlIl[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlIlIIllll(nearest) && lIlIlIlIIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIIlII[llIIlIIlIl[4]];
                    C0000a.a(nearest);
                }
                if (lIlIlIlIIllll(nearest) && lIlIlIlIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIIlII[llIIlIIlIl[5]];
                    if (lIlIlIlIIllIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIlIIlIl[6]);
                        "".length();
                    }
                    if (lIlIlIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIlIlIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIlIIlIl[5]);
                            "".length();
                        }
                        if (lIlIlIlIIllIl(fN() ? 1 : 0)) {
                            Q();
                            System.out.println(llIIlIIlII[llIIlIIlIl[3]]);
                            bt = llIIlIIlIl[1];
                            return;
                        }
                        if (lIlIlIlIIllII(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[7])) {
                            C0000a.a(llIIlIIlIl[8], llIIlIIlIl[9]);
                            C0000a.a(llIIlIIlIl[10], llIIlIIlIl[9]);
                        }
                        if (lIlIlIlIlIIIl(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[7]) && lIlIlIlIIllII(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[11])) {
                            C0000a.a(llIIlIIlIl[12], llIIlIIlIl[9]);
                            C0000a.a(llIIlIIlIl[13], llIIlIIlIl[9]);
                        }
                        if (lIlIlIlIlIIIl(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[11])) {
                            C0000a.a(llIIlIIlIl[8], llIIlIIlIl[9]);
                            C0000a.a(llIIlIIlIl[14], llIIlIIlIl[9]);
                        }
                    }
                }
            }
            if (lIlIlIlIIlIll(an() ? 1 : 0)) {
                if (lIlIlIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lIlIlIlIIlIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                AccBuilderSotf.c = llIIlIIlII[llIIlIIlIl[15]];
                int[] iArr = new int[llIIlIIlIl[1]];
                iArr[llIIlIIlIl[0]] = llIIlIIlIl[8];
                if (lIlIlIlIIlIll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIIlIIlIl[1]];
                    iArr2[llIIlIIlIl[0]] = llIIlIIlIl[10];
                    if (lIlIlIlIIlIll(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[llIIlIIlIl[1]];
                        iArr3[llIIlIIlIl[0]] = llIIlIIlIl[8];
                        Item first = Inventory.getFirst(iArr3);
                        int[] iArr4 = new int[llIIlIIlIl[1]];
                        iArr4[llIIlIIlIl[0]] = llIIlIIlIl[10];
                        first.useOn(Inventory.getFirst(iArr4));
                        Time.sleepTicks(llIIlIIlIl[1]);
                        "".length();
                    }
                }
                int[] iArr5 = new int[llIIlIIlIl[1]];
                iArr5[llIIlIIlIl[0]] = llIIlIIlIl[12];
                if (lIlIlIlIIlIll(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[llIIlIIlIl[1]];
                    iArr6[llIIlIIlIl[0]] = llIIlIIlIl[13];
                    if (lIlIlIlIIlIll(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIIlIIlIl[1]];
                        iArr7[llIIlIIlIl[0]] = llIIlIIlIl[12];
                        Item first2 = Inventory.getFirst(iArr7);
                        int[] iArr8 = new int[llIIlIIlIl[1]];
                        iArr8[llIIlIIlIl[0]] = llIIlIIlIl[13];
                        first2.useOn(Inventory.getFirst(iArr8));
                        Time.sleepTicks(llIIlIIlIl[1]);
                        "".length();
                    }
                }
                int[] iArr9 = new int[llIIlIIlIl[1]];
                iArr9[llIIlIIlIl[0]] = llIIlIIlIl[8];
                if (lIlIlIlIIlIll(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIIlIIlIl[1]];
                    iArr10[llIIlIIlIl[0]] = llIIlIIlIl[14];
                    if (lIlIlIlIIlIll(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llIIlIIlIl[1]];
                        iArr11[llIIlIIlIl[0]] = llIIlIIlIl[8];
                        Item first3 = Inventory.getFirst(iArr11);
                        int[] iArr12 = new int[llIIlIIlIl[1]];
                        iArr12[llIIlIIlIl[0]] = llIIlIIlIl[14];
                        first3.useOn(Inventory.getFirst(iArr12));
                        Time.sleepTicks(llIIlIIlIl[1]);
                        "".length();
                    }
                }
                int[] iArr13 = new int[llIIlIIlIl[1]];
                iArr13[llIIlIIlIl[0]] = llIIlIIlIl[8];
                if (lIlIlIlIlIIlI(Inventory.getAll(iArr13).size(), llIIlIIlIl[1])) {
                    int[] iArr14 = new int[llIIlIIlIl[1]];
                    iArr14[llIIlIIlIl[0]] = llIIlIIlIl[14];
                    if (lIlIlIlIlIIlI(Inventory.getAll(iArr14).size(), llIIlIIlIl[1])) {
                        int[] iArr15 = new int[llIIlIIlIl[1]];
                        iArr15[llIIlIIlIl[0]] = llIIlIIlIl[13];
                        if (lIlIlIlIlIIlI(Inventory.getAll(iArr15).size(), llIIlIIlIl[1])) {
                            int[] iArr16 = new int[llIIlIIlIl[1]];
                            iArr16[llIIlIIlIl[0]] = llIIlIIlIl[10];
                            if (lIlIlIlIlIIlI(Inventory.getAll(iArr16).size(), llIIlIIlIl[1])) {
                                int[] iArr17 = new int[llIIlIIlIl[1]];
                                iArr17[llIIlIIlIl[0]] = llIIlIIlIl[12];
                            }
                        }
                    }
                }
                Time.sleepTicks(llIIlIIlIl[15]);
                "".length();
                if (lIlIlIlIIlIll(Inventory.contains(item -> {
                    return item.getName().contains(llIIlIIlII[llIIlIIlIl[34]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item2 -> {
                        return item2.getName().contains(llIIlIIlII[llIIlIIlIl[33]]);
                    }).useOn(Inventory.getFirst(item3 -> {
                        return item3.getName().contains(llIIlIIlII[llIIlIIlIl[32]]);
                    }));
                }
                if (lIlIlIlIIllll(Widgets.get(llIIlIIlIl[16], llIIlIIlIl[17]))) {
                    Dialog.continueSpace();
                    Time.sleepTicks(llIIlIIlIl[4]);
                    "".length();
                    Time.sleepUntil(() -> {
                        int[] iArr18 = new int[llIIlIIlIl[1]];
                        iArr18[llIIlIIlIl[0]] = llIIlIIlIl[8];
                        if (lIlIlIlIIllIl(Inventory.contains(iArr18) ? 1 : 0)) {
                            int[] iArr19 = new int[llIIlIIlIl[1]];
                            iArr19[llIIlIIlIl[0]] = llIIlIIlIl[12];
                        }
                        if (!lIlIlIlIIlIll(Dialog.canLevelUpContinue() ? 1 : 0)) {
                            return llIIlIIlIl[0];
                        }
                        ?? r0 = llIIlIIlIl[1];
                        "".length();
                        return "   ".length() == " ".length() ? ((((230 + 16) - 207) + 198) ^ (((4 + 98) - 75) + 142)) & (((153 ^ 193) ^ (78 ^ 82)) ^ (-" ".length())) : r0;
                    }, llIIlIIlIl[18]);
                    "".length();
                }
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
    private static boolean fN() {
        if (lIlIlIlIIllII(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[7])) {
            int[] iArr = new int[llIIlIIlIl[1]];
            iArr[llIIlIIlIl[0]] = llIIlIIlIl[8];
            if (lIlIlIlIIlIll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIlIIlIl[1]];
                iArr2[llIIlIIlIl[0]] = llIIlIIlIl[10];
                if (lIlIlIlIIlIll(Bank.contains(iArr2) ? 1 : 0)) {
                    ?? r0 = llIIlIIlIl[1];
                    "".length();
                    return "   ".length() < "   ".length() ? ((29 ^ 25) ^ (194 ^ 137)) & (((50 ^ 67) ^ (126 ^ 64)) ^ (-" ".length())) : r0;
                }
            }
            return llIIlIIlIl[0];
        } else if (lIlIlIlIlIIIl(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[7]) && lIlIlIlIIllII(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[11])) {
            int[] iArr3 = new int[llIIlIIlIl[1]];
            iArr3[llIIlIIlIl[0]] = llIIlIIlIl[12];
            if (lIlIlIlIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIlIIlIl[1]];
                iArr4[llIIlIIlIl[0]] = llIIlIIlIl[13];
                if (lIlIlIlIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
                    ?? r02 = llIIlIIlIl[1];
                    "".length();
                    return (((((30 + 30) - (-62)) + 9) ^ (((159 + 117) - 235) + 149)) & (((180 ^ 195) ^ (18 ^ 88)) ^ (-" ".length()))) != 0 ? ((113 ^ 45) ^ (254 ^ 171)) & (((((0 + 17) - (-78)) + 56) ^ (((139 + 38) - 50) + 31)) ^ (-" ".length())) : r02;
                }
            }
            return llIIlIIlIl[0];
        } else if (lIlIlIlIlIIIl(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[11])) {
            int[] iArr5 = new int[llIIlIIlIl[1]];
            iArr5[llIIlIIlIl[0]] = llIIlIIlIl[8];
            if (lIlIlIlIIlIll(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIlIIlIl[1]];
                iArr6[llIIlIIlIl[0]] = llIIlIIlIl[14];
                if (lIlIlIlIIlIll(Bank.contains(iArr6) ? 1 : 0)) {
                    ?? r03 = llIIlIIlIl[1];
                    "".length();
                    return "  ".length() >= ((62 ^ 50) ^ (2 ^ 10)) ? ((((131 + 93) - 206) + 134) ^ (((14 + 75) - 59) + 159)) & (((168 ^ 143) ^ "  ".length()) ^ (-" ".length())) : r03;
                }
            }
            return llIIlIIlIl[0];
        } else {
            return llIIlIIlIl[0];
        }
    }

    private static String lIlIlIIlIlllI(String llllllllllllllllllIlIIlIIlllllII, String llllllllllllllllllIlIIlIIllllIll) {
        try {
            SecretKeySpec llllllllllllllllllIlIIlIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlIIllllIll.getBytes(StandardCharsets.UTF_8)), llIIlIIlIl[33]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIlIl[4], llllllllllllllllllIlIIlIIlllllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIlIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIIlIIlllllIl) {
            llllllllllllllllllIlIIlIIlllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlIlIIlI(int i, int i2) {
        return i != i2;
    }

    private static void lIlIlIIllIIlI() {
        llIIlIIlIl = new int[36];
        llIIlIIlIl[0] = ((((46 + 147) - 119) + 81) ^ (((162 + 165) - 261) + 103)) & (((107 ^ 0) ^ (48 ^ 105)) ^ (-" ".length()));
        llIIlIIlIl[1] = " ".length();
        llIIlIIlIl[2] = 110 ^ 62;
        llIIlIIlIl[3] = 128 ^ 132;
        llIIlIIlIl[4] = "  ".length();
        llIIlIIlIl[5] = "   ".length();
        llIIlIIlIl[6] = (-2149) & 7148;
        llIIlIIlIl[7] = 141 ^ 151;
        llIIlIIlIl[8] = ((148 + 159) - 88) + 2;
        llIIlIIlIl[9] = (((99 + 143) - 197) + 105) ^ (((56 + 93) - 5) + 8);
        llIIlIIlIl[10] = 196 ^ 159;
        llIIlIIlIl[11] = 12 ^ 33;
        llIIlIIlIl[12] = (-((-5673) & 22121)) & (-9) & 18431;
        llIIlIIlIl[13] = 164 ^ 197;
        llIIlIIlIl[14] = (10 ^ 71) ^ (172 ^ 132);
        llIIlIIlIl[15] = 54 ^ 51;
        llIIlIIlIl[16] = (-((-22625) & 32498)) & (-22593) & 32735;
        llIIlIIlIl[17] = (254 ^ 191) ^ (33 ^ 109);
        llIIlIIlIl[18] = (-1093) & 26092;
        llIIlIIlIl[19] = (-((-13185) & 31639)) & (-1) & 19454;
        llIIlIIlIl[20] = 146 ^ 134;
        llIIlIIlIl[21] = (-11878) & 12277;
        llIIlIIlIl[22] = (((74 + 64) - (-33)) + 78) ^ (((57 + 114) - 53) + 39);
        llIIlIIlIl[23] = (-31886) & 32735;
        llIIlIIlIl[24] = (-((-524) & 19135)) & (-8197) & 28607;
        llIIlIIlIl[25] = (-((-1570) & 24555)) & (-1027) & 32751;
        llIIlIIlIl[26] = (-((-8604) & 10175)) & (-405) & 63487;
        llIIlIIlIl[27] = 86 ^ 79;
        llIIlIIlIl[28] = 72 ^ 11;
        llIIlIIlIl[29] = 103 ^ 104;
        llIIlIIlIl[30] = 142 ^ 136;
        llIIlIIlIl[31] = (231 ^ 194) ^ (13 ^ 75);
        llIIlIIlIl[32] = 154 ^ 157;
        llIIlIIlIl[33] = 200 ^ 192;
        llIIlIIlIl[34] = (94 ^ 62) ^ (113 ^ 24);
        llIIlIIlIl[35] = 7 ^ 13;
    }

    private static boolean lIlIlIlIIlIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIlIlIlIIIl(Skills.getLevel(Skill.HERBLORE), llIIlIIlIl[31])) {
            ?? r0 = llIIlIIlIl[1];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlIIlIl[0];
    }

    private static boolean lIlIlIlIlIIIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIlIIlIl[0];
    }

    private static void lIlIlIIllIIIl() {
        llIIlIIlII = new String[llIIlIIlIl[35]];
        llIIlIIlII[llIIlIIlIl[0]] = lIlIlIIlIlllI("DzVyJWhEr3HGcY7xtnKJ9g==", "ObLol");
        llIIlIIlII[llIIlIIlIl[1]] = lIlIlIIlIlllI("Oi8yMHU7NNjPS4e2bGkUVL0I/j4IsJ52ZY4Hc7xKKsLDQL8os3iY4nb7p5gP/ow06z0Oxu09mZw=", "bKYoF");
        llIIlIIlII[llIIlIIlIl[4]] = lIlIlIIlIllll("id4MBr7joi2foMRMVZYYgRS2iHSaoHhg", "MAJNO");
        llIIlIIlII[llIIlIIlIl[5]] = lIlIlIIlIllll("QZFER/7vnMaEEpRvyprczOniGC4Z7+Eh", "SMAJR");
        llIIlIIlII[llIIlIIlIl[3]] = lIlIlIIllIIII("LzFEDzoddAkHOws9CgloCyEUHiQRMRdCaAsjDRorED0KCWgMO0QsHSEdKik=", "xTdnH");
        llIIlIIlII[llIIlIIlIl[15]] = lIlIlIIllIIII("AT4sGAcrdyQeHSU4OgI=", "LWTqi");
        llIIlIIlII[llIIlIIlIl[30]] = lIlIlIIllIIII("Bwo7GzggHSw=", "OoIyT");
        llIIlIIlII[llIIlIIlIl[32]] = lIlIlIIllIIII("Dy0PBSE=", "ZClpU");
        llIIlIIlII[llIIlIIlIl[33]] = lIlIlIIlIlllI("KWGiDJROfHs=", "eytiZ");
        llIIlIIlII[llIIlIIlIl[34]] = lIlIlIIllIIII("ED4sGxw/", "SVEhy");
    }
}
