package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.R  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/R.class */
public class R implements K {
    static /* synthetic */ WorldPoint cf;
    private static /* synthetic */ String[] lIlllIIllI;
    public static /* synthetic */ boolean cc;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ List<C0003d> bp;
    static /* synthetic */ WorldPoint ce;
    private static /* synthetic */ int[] lIlllIlIII;
    static /* synthetic */ WorldArea cd;

    private static boolean lIIlllIlIIllI(int i) {
        return i == 0;
    }

    private static boolean lIIlllIlIlIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIlllIlIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0206, code lost:
        if (lIIlllIlIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0282, code lost:
        if (lIIlllIlIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0369, code lost:
        if (lIIlllIlIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean am() {
        if (lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[21])) {
            int[] iArr = new int[lIlllIlIII[1]];
            iArr[lIlllIlIII[0]] = lIlllIlIII[9];
            if (lIIlllIlIIlII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlllIlIII[1]];
                iArr2[lIlllIlIII[0]] = lIlllIlIII[13];
                if (lIIlllIlIIlII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlllIlIII[1]];
                    iArr3[lIlllIlIII[0]] = lIlllIlIII[11];
                    if (lIIlllIlIIlII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlllIlIII[1]];
                        iArr4[lIlllIlIII[0]] = lIlllIlIII[14];
                        if (lIIlllIlIIlII(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlllIlIII[1]];
                            iArr5[lIlllIlIII[0]] = lIlllIlIII[20];
                            if (lIIlllIlIIlII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlllIlIII[1]];
                                iArr6[lIlllIlIII[0]] = lIlllIlIII[48];
                                if (lIIlllIlIIllI(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIlllIlIII[1]];
                                    iArr7[lIlllIlIII[0]] = lIlllIlIII[48];
                                }
                                ?? r0 = lIlllIlIII[1];
                                "".length();
                                return (-((((19 + 100) - (-1)) + 12) ^ (((95 + 19) - 45) + 59))) > 0 ? ((29 ^ 14) ^ (218 ^ 142)) & (((((99 + 179) - 137) + 81) ^ (((116 + 31) - 73) + 79)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIlllIlIII[0];
        } else if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[21]) && lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[8])) {
            int[] iArr8 = new int[lIlllIlIII[1]];
            iArr8[lIlllIlIII[0]] = lIlllIlIII[13];
            if (lIIlllIlIIlII(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIlllIlIII[1]];
                iArr9[lIlllIlIII[0]] = lIlllIlIII[11];
                if (lIIlllIlIIlII(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlllIlIII[1]];
                    iArr10[lIlllIlIII[0]] = lIlllIlIII[14];
                    if (lIIlllIlIIlII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIlllIlIII[1]];
                        iArr11[lIlllIlIII[0]] = lIlllIlIII[16];
                        if (lIIlllIlIIlII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIlllIlIII[1]];
                            iArr12[lIlllIlIII[0]] = lIlllIlIII[48];
                            if (lIIlllIlIIllI(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlllIlIII[1]];
                                iArr13[lIlllIlIII[0]] = lIlllIlIII[48];
                            }
                            ?? r02 = lIlllIlIII[1];
                            "".length();
                            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return lIlllIlIII[0];
        } else if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[8]) && lIIlllIlIIllI(cc ? 1 : 0)) {
            int[] iArr14 = new int[lIlllIlIII[1]];
            iArr14[lIlllIlIII[0]] = lIlllIlIII[22];
            if (lIIlllIlIIllI(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlllIlIII[1]];
                iArr15[lIlllIlIII[0]] = lIlllIlIII[22];
            }
            int[] iArr16 = new int[lIlllIlIII[1]];
            iArr16[lIlllIlIII[0]] = lIlllIlIII[24];
            if (lIIlllIlIIlII(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIlllIlIII[1]];
                iArr17[lIlllIlIII[0]] = lIlllIlIII[25];
                if (lIIlllIlIIlII(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIlllIlIII[1];
                    "".length();
                    return " ".length() < 0 ? ((((176 + 26) - 55) + 54) ^ (((83 + 118) - 104) + 45)) & (((((226 + 124) - 260) + 145) ^ (((139 + 128) - 250) + 155)) ^ (-" ".length())) : r03;
                }
            }
            return lIlllIlIII[0];
        } else if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[8]) && lIIlllIlIIlII(cc ? 1 : 0)) {
            int[] iArr18 = new int[lIlllIlIII[1]];
            iArr18[lIlllIlIII[0]] = lIlllIlIII[22];
            if (lIIlllIlIIllI(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIlllIlIII[1]];
                iArr19[lIlllIlIII[0]] = lIlllIlIII[22];
            }
            int[] iArr20 = new int[lIlllIlIII[1]];
            iArr20[lIlllIlIII[0]] = lIlllIlIII[16];
            if (lIIlllIlIIlII(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIlllIlIII[1]];
                iArr21[lIlllIlIII[0]] = lIlllIlIII[23];
                if (lIIlllIlIIlII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlllIlIII[1]];
                    iArr22[lIlllIlIII[0]] = lIlllIlIII[23];
                    if (lIIlllIlIlIIl(Bank.getFirst(iArr22).getQuantity(), lIlllIlIII[19])) {
                        int[] iArr23 = new int[lIlllIlIII[1]];
                        iArr23[lIlllIlIII[0]] = lIlllIlIII[24];
                        if (lIIlllIlIIlII(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIlllIlIII[1]];
                            iArr24[lIlllIlIII[0]] = lIlllIlIII[25];
                            if (lIIlllIlIIlII(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIlllIlIII[1];
                                "".length();
                                return "  ".length() > "   ".length() ? ((40 ^ 114) ^ (94 ^ 83)) & (((74 ^ 39) ^ (173 ^ 151)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIlllIlIII[0];
        } else {
            return lIlllIlIII[0];
        }
    }

    private static boolean lIIlllIlIlIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean an() {
        if (lIIlllIlIlIlI(Vars.getBit(lIlllIlIII[50]), lIlllIlIII[1]) && lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[19])) {
            return lIlllIlIII[1];
        }
        if (lIIlllIlIlIlI(Vars.getBit(lIlllIlIII[50]), lIlllIlIII[3]) && lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[32]) && lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[19])) {
            return lIlllIlIII[1];
        }
        if (lIIlllIlIlIlI(Vars.getBit(lIlllIlIII[50]), lIlllIlIII[4]) && lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[32]) && lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[39])) {
            return lIlllIlIII[1];
        }
        if (lIIlllIlIlIlI(Vars.getBit(lIlllIlIII[50]), lIlllIlIII[4]) && lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[32])) {
            int[] iArr = new int[lIlllIlIII[1]];
            iArr[lIlllIlIII[0]] = lIlllIlIII[14];
            if (lIIlllIlIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                return lIlllIlIII[1];
            }
        }
        if (lIIlllIlIlIlI(Vars.getBit(lIlllIlIII[50]), lIlllIlIII[7]) && lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[39])) {
            int[] iArr2 = new int[lIlllIlIII[1]];
            iArr2[lIlllIlIII[0]] = lIlllIlIII[14];
            if (lIIlllIlIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIlllIlIII[1];
            }
        }
        return lIlllIlIII[0];
    }

    public static void ao() {
        if (lIIlllIlIIlll(Widgets.get(lIlllIlIII[51], lIlllIlIII[52]))) {
            AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[53]];
            Widgets.get(lIlllIlIII[51], lIlllIlIII[52]).interact(lIlllIIllI[lIlllIlIII[54]]);
            Time.sleepTicks(lIlllIlIII[7]);
            "".length();
        }
        if (lIIlllIlIlIll(Widgets.get(lIlllIlIII[51], lIlllIlIII[52])) && lIIlllIlIIllI(Widgets.get(lIlllIlIII[55]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIlllIlIII[1]);
            "".length();
            if (lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[19])) {
                Widgets.get(lIlllIlIII[55], lIlllIlIII[1]).getChild(lIlllIlIII[1]).interact(lIlllIIllI[lIlllIlIII[56]]);
            }
            if (lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[32]) && lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[19])) {
                Widgets.get(lIlllIlIII[55], lIlllIlIII[1]).getChild(lIlllIlIII[3]).interact(lIlllIIllI[lIlllIlIII[57]]);
            }
            if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[32]) && lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[39])) {
                Widgets.get(lIlllIlIII[55], lIlllIlIII[1]).getChild(lIlllIlIII[4]).interact(lIlllIIllI[lIlllIlIII[58]]);
            }
            if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[32])) {
                int[] iArr = new int[lIlllIlIII[1]];
                iArr[lIlllIlIII[0]] = lIlllIlIII[14];
                if (lIIlllIlIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIlllIlIII[55], lIlllIlIII[1]).getChild(lIlllIlIII[4]).interact(lIlllIIllI[lIlllIlIII[21]]);
                }
            }
            if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[39])) {
                int[] iArr2 = new int[lIlllIlIII[1]];
                iArr2[lIlllIlIII[0]] = lIlllIlIII[14];
                if (lIIlllIlIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIlllIlIII[55], lIlllIlIII[1]).getChild(lIlllIlIII[7]).interact(lIlllIIllI[lIlllIlIII[52]]);
                }
            }
            Time.sleepTicks(lIlllIlIII[1]);
            "".length();
        }
    }

    private static String lIIlllIIlllII(String llllllllllllllllllIlllllIIIllllI, String llllllllllllllllllIlllllIIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllllIIIlllIl.getBytes(StandardCharsets.UTF_8)), lIlllIlIII[30]), "DES");
            Cipher llllllllllllllllllIlllllIIlIIIII = Cipher.getInstance("DES");
            llllllllllllllllllIlllllIIlIIIII.init(lIlllIlIII[3], secretKeySpec);
            return new String(llllllllllllllllllIlllllIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllllIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllllIIIlllll) {
            llllllllllllllllllIlllllIIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIlIlIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlllIlIllIl(int i) {
        return i < 0;
    }

    private static String lIIlllIIlllIl(String llllllllllllllllllIlllllIIllIIll, String llllllllllllllllllIlllllIIllIIlI) {
        String llllllllllllllllllIlllllIIllIIll2 = new String(Base64.getDecoder().decode(llllllllllllllllllIlllllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllIlllllIIllIIII = llllllllllllllllllIlllllIIllIIlI.toCharArray();
        int llllllllllllllllllIlllllIIlIllll = lIlllIlIII[0];
        char[] charArray = llllllllllllllllllIlllllIIllIIll2.toCharArray();
        int length = charArray.length;
        int i = lIlllIlIII[0];
        while (lIIlllIlIIlIl(i, length)) {
            char llllllllllllllllllIlllllIIllIlII = charArray[i];
            sb.append((char) (llllllllllllllllllIlllllIIllIlII ^ llllllllllllllllllIlllllIIllIIII[llllllllllllllllllIlllllIIlIllll % llllllllllllllllllIlllllIIllIIII.length]));
            "".length();
            llllllllllllllllllIlllllIIlIllll++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlllIlIII[0];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            ai();
            "".length();
            if ((-" ".length()) > 0) {
                return ((34 ^ 68) ^ (30 ^ 82)) & (((22 ^ 74) ^ (33 ^ 87)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlllIlIII[69];
    }

    private static boolean lIIlllIlIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static int lIIlllIlIllII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void O() {
        if (lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[8])) {
            int[] iArr = new int[lIlllIlIII[1]];
            iArr[lIlllIlIII[0]] = lIlllIlIII[16];
            if (lIIlllIlIIllI(Bank.contains(iArr) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIlIII[16], lIlllIlIII[59], lIlllIlIII[60]));
                "".length();
            }
            int[] iArr2 = new int[lIlllIlIII[1]];
            iArr2[lIlllIlIII[0]] = lIlllIlIII[9];
            if (lIIlllIlIIllI(Bank.contains(iArr2) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIlIII[9], lIlllIlIII[61], lIlllIlIII[6]));
                "".length();
            }
            int[] iArr3 = new int[lIlllIlIII[1]];
            iArr3[lIlllIlIII[0]] = lIlllIlIII[11];
            if (lIIlllIlIIllI(Bank.contains(iArr3) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIlIII[11], lIlllIlIII[62], lIlllIlIII[6]));
                "".length();
            }
            int[] iArr4 = new int[lIlllIlIII[1]];
            iArr4[lIlllIlIII[0]] = lIlllIlIII[13];
            if (lIIlllIlIIllI(Bank.contains(iArr4) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIlIII[13], lIlllIlIII[63], lIlllIlIII[6]));
                "".length();
            }
            int[] iArr5 = new int[lIlllIlIII[1]];
            iArr5[lIlllIlIII[0]] = lIlllIlIII[14];
            if (lIIlllIlIIllI(Bank.contains(iArr5) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIlIII[14], lIlllIlIII[5], lIlllIlIII[6]));
                "".length();
            }
            int[] iArr6 = new int[lIlllIlIII[1]];
            iArr6[lIlllIlIII[0]] = lIlllIlIII[48];
            if (lIIlllIlIIllI(Bank.contains(iArr6) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIlIII[48], lIlllIlIII[1], C0004e.c(lIlllIlIII[64], lIlllIlIII[65])));
                "".length();
            }
        }
        if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[8])) {
            int[] iArr7 = new int[lIlllIlIII[1]];
            iArr7[lIlllIlIII[0]] = lIlllIlIII[24];
            if (lIIlllIlIIlII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlllIlIII[1]];
                iArr8[lIlllIlIII[0]] = lIlllIlIII[24];
                if (lIIlllIlIIlIl(Bank.getFirst(iArr8).getQuantity(), lIlllIlIII[63])) {
                    int i = lIlllIlIII[24];
                    int i2 = lIlllIlIII[63];
                    int[] iArr9 = new int[lIlllIlIII[1]];
                    iArr9[lIlllIlIII[0]] = lIlllIlIII[24];
                    bp.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lIlllIlIII[66]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIlllIlIII[1]];
            iArr10[lIlllIlIII[0]] = lIlllIlIII[24];
            if (lIIlllIlIIllI(Bank.contains(iArr10) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIlIII[24], lIlllIlIII[63], lIlllIlIII[66]));
                "".length();
            }
            int[] iArr11 = new int[lIlllIlIII[1]];
            iArr11[lIlllIlIII[0]] = lIlllIlIII[25];
            if (lIIlllIlIIlII(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIlllIlIII[1]];
                iArr12[lIlllIlIII[0]] = lIlllIlIII[25];
                if (lIIlllIlIIlIl(Bank.getFirst(iArr12).getQuantity(), lIlllIlIII[63])) {
                    int i3 = lIlllIlIII[25];
                    int i4 = lIlllIlIII[63];
                    int[] iArr13 = new int[lIlllIlIII[1]];
                    iArr13[lIlllIlIII[0]] = lIlllIlIII[25];
                    bp.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lIlllIlIII[67]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIlllIlIII[1]];
            iArr14[lIlllIlIII[0]] = lIlllIlIII[25];
            if (lIIlllIlIIllI(Bank.contains(iArr14) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIlIII[25], lIlllIlIII[63], lIlllIlIII[67]));
                "".length();
            }
            int[] iArr15 = new int[lIlllIlIII[1]];
            iArr15[lIlllIlIII[0]] = lIlllIlIII[22];
            if (lIIlllIlIIllI(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIlllIlIII[1]];
                iArr16[lIlllIlIII[0]] = lIlllIlIII[22];
                if (lIIlllIlIIllI(Equipment.contains(iArr16) ? 1 : 0)) {
                    bp.add(new C0003d(lIlllIlIII[22], lIlllIlIII[1], lIlllIlIII[68]));
                    "".length();
                }
            }
            if (lIIlllIlIIlII(cc ? 1 : 0)) {
                int[] iArr17 = new int[lIlllIlIII[1]];
                iArr17[lIlllIlIII[0]] = lIlllIlIII[16];
                if (lIIlllIlIIlII(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIlllIlIII[1]];
                    iArr18[lIlllIlIII[0]] = lIlllIlIII[16];
                    if (lIIlllIlIIlIl(Bank.getFirst(iArr18).getQuantity(), lIlllIlIII[63])) {
                        int i5 = lIlllIlIII[16];
                        int i6 = lIlllIlIII[63];
                        int[] iArr19 = new int[lIlllIlIII[1]];
                        iArr19[lIlllIlIII[0]] = lIlllIlIII[16];
                        bp.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lIlllIlIII[60]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIlllIlIII[1]];
                iArr20[lIlllIlIII[0]] = lIlllIlIII[16];
                if (lIIlllIlIIllI(Bank.contains(iArr20) ? 1 : 0)) {
                    bp.add(new C0003d(lIlllIlIII[16], lIlllIlIII[63], lIlllIlIII[60]));
                    "".length();
                }
                int[] iArr21 = new int[lIlllIlIII[1]];
                iArr21[lIlllIlIII[0]] = lIlllIlIII[23];
                if (lIIlllIlIIlII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlllIlIII[1]];
                    iArr22[lIlllIlIII[0]] = lIlllIlIII[23];
                    if (lIIlllIlIIlIl(Bank.getFirst(iArr22).getQuantity(), lIlllIlIII[68])) {
                        int i7 = lIlllIlIII[23];
                        int i8 = lIlllIlIII[68];
                        int[] iArr23 = new int[lIlllIlIII[1]];
                        iArr23[lIlllIlIII[0]] = lIlllIlIII[23];
                        bp.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lIlllIlIII[6]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIlllIlIII[1]];
                iArr24[lIlllIlIII[0]] = lIlllIlIII[23];
                if (lIIlllIlIIllI(Bank.contains(iArr24) ? 1 : 0)) {
                    bp.add(new C0003d(lIlllIlIII[23], lIlllIlIII[68], lIlllIlIII[6]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIlllIlIII[1]];
        iArr25[lIlllIlIII[0]] = lIlllIlIII[20];
        if (lIIlllIlIIllI(Bank.contains(iArr25) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIlIII[20], lIlllIlIII[69], lIlllIlIII[40]));
            "".length();
        }
        if (lIIlllIlIIllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlllIIllI[lIlllIlIII[75]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIlIII[70], lIlllIlIII[19], lIlllIlIII[71]));
            "".length();
        }
        int[] iArr26 = new int[lIlllIlIII[1]];
        iArr26[lIlllIlIII[0]] = lIlllIlIII[72];
        if (lIIlllIlIIllI(Bank.contains(iArr26) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIlIII[72], lIlllIlIII[33], lIlllIlIII[73]));
            "".length();
        }
        int[] iArr27 = new int[lIlllIlIII[1]];
        iArr27[lIlllIlIII[0]] = lIlllIlIII[18];
        if (lIIlllIlIIllI(Bank.contains(iArr27) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIlIII[18], lIlllIlIII[33], lIlllIlIII[73]));
            "".length();
        }
    }

    private static boolean lIIlllIlIIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIIlllIlIIlII(int i) {
        return i != 0;
    }

    private static boolean lIIlllIlIlIIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[2])) {
            ?? r0 = lIlllIlIII[1];
            "".length();
            return ((((106 + 71) - 76) + 52) ^ (((8 + 152) - 125) + 122)) <= "   ".length() ? ((117 ^ 11) ^ (243 ^ 171)) & (((((44 + 91) - 5) + 38) ^ (((141 + 48) - 87) + 40)) ^ (-" ".length())) : r0;
        }
        return lIlllIlIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v368, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v401, types: [boolean] */
    public static void ai() {
        if (lIIlllIlIIlII(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[0]];
            C0001b.a(bp);
            if (lIIlllIlIIlIl(bp.size(), lIlllIlIII[1])) {
                System.out.println(lIlllIIllI[lIlllIlIII[1]]);
                bn = lIlllIlIII[0];
            }
        }
        if (lIIlllIlIIllI(bn ? 1 : 0) && lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[2])) {
            if (lIIlllIlIIllI(al() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlllIlIIlll(nearest) && lIIlllIlIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[3]];
                    C0000a.a(nearest);
                }
                if (lIIlllIlIIlll(nearest) && lIIlllIlIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[4]];
                    if (lIIlllIlIIllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlllIlIII[5]);
                        "".length();
                        Time.sleepTicks(lIlllIlIII[6]);
                        "".length();
                    }
                    if (lIIlllIlIIlII(Bank.isOpen() ? 1 : 0)) {
                        if (lIIlllIlIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlllIlIII[7]);
                            "".length();
                        }
                        while (lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[8]) && lIIlllIlIIllI(C0024y.bv() ? 1 : 0)) {
                            C0024y.bt();
                            Time.sleepTicks(lIlllIlIII[1]);
                            "".length();
                            "".length();
                            if (" ".length() == "  ".length()) {
                                return;
                            }
                        }
                        if (lIIlllIlIIllI(am() ? 1 : 0)) {
                            O();
                            System.out.println(lIlllIIllI[lIlllIlIII[7]]);
                            bn = lIlllIlIII[1];
                            return;
                        }
                        if (lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[8])) {
                            int[] iArr = new int[lIlllIlIII[1]];
                            iArr[lIlllIlIII[0]] = lIlllIlIII[9];
                            if (lIIlllIlIIlII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIlllIlIII[1]];
                                iArr2[lIlllIlIII[0]] = lIlllIlIII[9];
                                if (lIIlllIlIIlIl(Inventory.getCount(iArr2), lIlllIlIII[1])) {
                                    Bank.withdraw(lIlllIlIII[9], lIlllIlIII[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIlllIlIII[1]];
                                        iArr3[lIlllIlIII[0]] = lIlllIlIII[9];
                                        if (lIIlllIlIlIII(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIlllIlIII[1];
                                            "".length();
                                            return (((119 ^ 55) ^ (49 ^ 97)) & (((((31 + 136) - 137) + 120) ^ (((94 + 121) - 144) + 63)) ^ (-" ".length()))) != 0 ? ((238 ^ 164) ^ (94 ^ 83)) & (((((182 + 33) - (-5)) + 10) ^ (((30 + 138) - 135) + 128)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlllIlIII[0];
                                    }, lIlllIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIlllIlIII[1]];
                            iArr3[lIlllIlIII[0]] = lIlllIlIII[11];
                            if (lIIlllIlIIlII(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIlllIlIII[1]];
                                iArr4[lIlllIlIII[0]] = lIlllIlIII[11];
                                if (lIIlllIlIIlIl(Inventory.getCount(iArr4), lIlllIlIII[1])) {
                                    Bank.withdraw(lIlllIlIII[11], lIlllIlIII[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIlllIlIII[1]];
                                        iArr5[lIlllIlIII[0]] = lIlllIlIII[11];
                                        if (lIIlllIlIlIII(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIlllIlIII[1];
                                            "".length();
                                            return (67 ^ 71) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlllIlIII[0];
                                    }, lIlllIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIlllIlIII[1]];
                            iArr5[lIlllIlIII[0]] = lIlllIlIII[13];
                            if (lIIlllIlIIlII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlllIlIII[1]];
                                iArr6[lIlllIlIII[0]] = lIlllIlIII[13];
                                if (lIIlllIlIIlIl(Inventory.getCount(iArr6), lIlllIlIII[1])) {
                                    Bank.withdraw(lIlllIlIII[13], lIlllIlIII[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIlllIlIII[1]];
                                        iArr7[lIlllIlIII[0]] = lIlllIlIII[13];
                                        if (lIIlllIlIlIII(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIlllIlIII[1];
                                            "".length();
                                            return " ".length() == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                                        }
                                        return lIlllIlIII[0];
                                    }, lIlllIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIlllIlIII[1]];
                            iArr7[lIlllIlIII[0]] = lIlllIlIII[14];
                            if (lIIlllIlIIlII(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIlllIlIII[1]];
                                iArr8[lIlllIlIII[0]] = lIlllIlIII[14];
                                if (lIIlllIlIIlIl(Inventory.getCount(iArr8), lIlllIlIII[1])) {
                                    Bank.withdraw(lIlllIlIII[14], lIlllIlIII[15], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIlllIlIII[1]];
                                        iArr9[lIlllIlIII[0]] = lIlllIlIII[14];
                                        if (lIIlllIlIlIII(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIlllIlIII[1];
                                            "".length();
                                            return "   ".length() <= 0 ? ((((53 + 121) - 125) + 85) ^ (((155 + 90) - 211) + 152)) & (((115 ^ 4) ^ (11 ^ 64)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlllIlIII[0];
                                    }, lIlllIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIlllIlIII[1]];
                            iArr9[lIlllIlIII[0]] = lIlllIlIII[16];
                            if (lIIlllIlIIlII(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIlllIlIII[1]];
                                iArr10[lIlllIlIII[0]] = lIlllIlIII[16];
                                if (lIIlllIlIIlIl(Inventory.getCount(iArr10), lIlllIlIII[1])) {
                                    Bank.withdraw(lIlllIlIII[16], lIlllIlIII[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIlllIlIII[1]];
                                        iArr11[lIlllIlIII[0]] = lIlllIlIII[16];
                                        if (lIIlllIlIlIII(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIlllIlIII[1];
                                            "".length();
                                            return (((7 ^ 39) ^ (113 ^ 11)) & (((((160 + 195) - 227) + 118) ^ (((127 + 42) - 113) + 116)) ^ (-" ".length()))) != 0 ? ((47 ^ 12) ^ (46 ^ 63)) & (((((131 + 23) - (-5)) + 11) ^ (((151 + 22) - 107) + 86)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlllIlIII[0];
                                    }, lIlllIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIlllIlIII[1]];
                            iArr11[lIlllIlIII[0]] = lIlllIlIII[17];
                            if (lIIlllIlIIlII(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIlllIlIII[1]];
                                iArr12[lIlllIlIII[0]] = lIlllIlIII[17];
                                if (lIIlllIlIIllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIlllIlIII[17], lIlllIlIII[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIlllIlIII[1]];
                                        iArr13[lIlllIlIII[0]] = lIlllIlIII[17];
                                        return Inventory.contains(iArr13);
                                    }, lIlllIlIII[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIlllIlIII[18], lIlllIlIII[19], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIlllIlIII[1]];
                            iArr13[lIlllIlIII[0]] = lIlllIlIII[20];
                            if (lIIlllIlIIlII(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIlllIlIII[1]];
                                iArr14[lIlllIlIII[0]] = lIlllIlIII[20];
                                if (lIIlllIlIIlIl(Inventory.getCount(iArr14), lIlllIlIII[1]) && lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[21])) {
                                    Bank.withdrawAll(lIlllIlIII[20], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIlllIlIII[1]];
                                        iArr15[lIlllIlIII[0]] = lIlllIlIII[20];
                                        if (lIIlllIlIlIII(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIlllIlIII[1];
                                            "".length();
                                            return " ".length() <= (((14 ^ 53) ^ (115 ^ 93)) & (((115 ^ 18) ^ (11 ^ 127)) ^ (-" ".length()))) ? ((250 ^ 174) ^ (94 ^ 69)) & (((((134 + 188) - 144) + 17) ^ (((96 + 42) - 34) + 36)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlllIlIII[0];
                                    }, lIlllIlIII[5]);
                                    "".length();
                                }
                            }
                        }
                        if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[8])) {
                            int[] iArr15 = new int[lIlllIlIII[1]];
                            iArr15[lIlllIlIII[0]] = lIlllIlIII[22];
                            if (lIIlllIlIIllI(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIlllIlIII[22], lIlllIlIII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlllIlIII[1]);
                                "".length();
                            }
                            if (lIIlllIlIIlII(cc ? 1 : 0)) {
                                Bank.withdrawAll(lIlllIlIII[23], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlllIlIII[1]);
                                "".length();
                                Bank.withdrawAll(lIlllIlIII[16], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlllIlIII[1]);
                                "".length();
                            }
                            Time.sleepTicks(lIlllIlIII[4]);
                            "".length();
                            Bank.withdrawAll(lIlllIlIII[24], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIlllIlIII[1]);
                            "".length();
                            Bank.withdrawAll(lIlllIlIII[25], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIlllIlIII[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIlllIlIIlII(al() ? 1 : 0)) {
                if (lIIlllIlIIlII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[21])) {
                    if (lIIlllIlIIllI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[19]];
                        Movement.walkTo(ce);
                        "".length();
                        Time.sleepTicks(lIlllIlIII[1]);
                        "".length();
                    }
                    if (lIIlllIlIIlII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[6]];
                        ak();
                    }
                }
                if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[21]) && lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[26])) {
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[27]];
                    if (lIIlllIlIlIlI(Players.getLocal().getAnimation(), lIlllIlIII[28])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIlllIlIII[1]);
                        "".length();
                    }
                }
                if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[26]) && lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[29])) {
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[30]];
                    if (lIIlllIlIlIlI(Players.getLocal().getAnimation(), lIlllIlIII[28])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIlllIlIII[1]);
                        "".length();
                    }
                }
                if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[29]) && lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[31])) {
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[32]];
                    if (lIIlllIlIlIlI(Players.getLocal().getAnimation(), lIlllIlIII[28])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIlllIlIII[1]);
                        "".length();
                    }
                }
                if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[31]) && lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[8])) {
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[33]];
                    if (lIIlllIlIlIlI(Players.getLocal().getAnimation(), lIlllIlIII[28])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIlllIlIII[1]);
                        "".length();
                    }
                }
                if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[8])) {
                    AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[34]];
                    if (lIIlllIlIlIll(cf)) {
                        cf = new WorldPoint(lIlllIlIII[35] + C0004e.c(lIlllIlIII[1], lIlllIlIII[7]), lIlllIlIII[36], lIlllIlIII[0]);
                    }
                    int[] iArr16 = new int[lIlllIlIII[1]];
                    iArr16[lIlllIlIII[0]] = lIlllIlIII[22];
                    if (lIIlllIlIIlII(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIlllIlIII[1]];
                        iArr17[lIlllIlIII[0]] = lIlllIlIII[22];
                        if (lIIlllIlIIllI(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIlllIlIII[1]];
                            iArr18[lIlllIlIII[0]] = lIlllIlIII[22];
                            Inventory.getFirst(iArr18).interact(lIlllIIllI[lIlllIlIII[37]]);
                            Time.sleepTicks(lIlllIlIII[1]);
                            "".length();
                        }
                    }
                    if (lIIlllIlIIlII(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lIlllIlIII[1]];
                    iArr19[lIlllIlIII[0]] = lIlllIlIII[24];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIlllIlIII[1]];
                    iArr20[lIlllIlIII[0]] = lIlllIlIII[38];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIIlllIlIIllI(cc ? 1 : 0) && lIIlllIlIIlll(cf)) {
                        if (lIIlllIlIIllI(Players.getLocal().getWorldLocation().equals(cf) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[39]];
                            Movement.walkTo(cf);
                            "".length();
                            Time.sleepTicks(lIlllIlIII[1]);
                            "".length();
                        }
                        if (lIIlllIlIIlII(Players.getLocal().getWorldLocation().equals(cf) ? 1 : 0) && lIIlllIlIIlll(first) && lIIlllIlIIlll(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIlllIlIllll(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = lIlllIlIII[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlllIlIII[0];
                            }, lIlllIlIII[10]);
                            "".length();
                            Time.sleep(C0004e.c(lIlllIlIII[40], lIlllIlIII[41]));
                            "".length();
                        }
                    }
                    if (lIIlllIlIIlII(cc ? 1 : 0)) {
                        if (lIIlllIlIIlll(first) && lIIlllIlIIlll(first2) && lIIlllIlIlIlI(Players.getLocal().getAnimation(), lIlllIlIII[28])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIlllIlIllll(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = lIlllIlIII[1];
                                    "".length();
                                    return (((116 ^ 113) ^ (20 ^ 49)) & (((237 ^ 135) ^ (57 ^ 115)) ^ (-" ".length()))) < 0 ? ((69 ^ 17) ^ (109 ^ 6)) & (((((205 + 240) - 343) + 147) ^ (((83 + 173) - 94) + 36)) ^ (-" ".length())) : r0;
                                }
                                return lIlllIlIII[0];
                            }, lIlllIlIII[10]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIIlllIlIlIlI(Players.getLocal().getAnimation(), lIlllIlIII[28])) {
                                ?? r0 = lIlllIlIII[1];
                                "".length();
                                return (-" ".length()) >= (((194 ^ 168) ^ (83 ^ 8)) & (((((74 + 96) - 123) + 84) ^ (((160 + 4) - (-12)) + 2)) ^ (-" ".length()))) ? ((((23 + 9) - (-117)) + 72) ^ (((24 + 34) - 30) + 160)) & (((101 ^ 40) ^ (237 ^ 193)) ^ (-" ".length())) : r0;
                            }
                            return lIlllIlIII[0];
                        }, lIlllIlIII[42]);
                        "".length();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIlllIlIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f1, code lost:
        if (lIIlllIlIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0286, code lost:
        if (lIIlllIlIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0346, code lost:
        if (lIIlllIlIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean al() {
        if (lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[21])) {
            int[] iArr = new int[lIlllIlIII[1]];
            iArr[lIlllIlIII[0]] = lIlllIlIII[9];
            if (lIIlllIlIIlII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlllIlIII[1]];
                iArr2[lIlllIlIII[0]] = lIlllIlIII[13];
                if (lIIlllIlIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlllIlIII[1]];
                    iArr3[lIlllIlIII[0]] = lIlllIlIII[11];
                    if (lIIlllIlIIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlllIlIII[1]];
                        iArr4[lIlllIlIII[0]] = lIlllIlIII[14];
                        if (lIIlllIlIIlII(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlllIlIII[1]];
                            iArr5[lIlllIlIII[0]] = lIlllIlIII[20];
                            if (lIIlllIlIIlII(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlllIlIII[1]];
                                iArr6[lIlllIlIII[0]] = lIlllIlIII[48];
                                if (lIIlllIlIIllI(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIlllIlIII[1]];
                                    iArr7[lIlllIlIII[0]] = lIlllIlIII[48];
                                }
                                ?? r0 = lIlllIlIII[1];
                                "".length();
                                return (-" ".length()) > (-" ".length()) ? ((242 ^ 166) ^ (137 ^ 153)) & (((52 ^ 16) ^ (216 ^ 184)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIlllIlIII[0];
        } else if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[21]) && lIIlllIlIIlIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[8])) {
            int[] iArr8 = new int[lIlllIlIII[1]];
            iArr8[lIlllIlIII[0]] = lIlllIlIII[13];
            if (lIIlllIlIIlII(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIlllIlIII[1]];
                iArr9[lIlllIlIII[0]] = lIlllIlIII[11];
                if (lIIlllIlIIlII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlllIlIII[1]];
                    iArr10[lIlllIlIII[0]] = lIlllIlIII[14];
                    if (lIIlllIlIIlII(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIlllIlIII[1]];
                        iArr11[lIlllIlIII[0]] = lIlllIlIII[16];
                        if (lIIlllIlIIlII(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIlllIlIII[1]];
                            iArr12[lIlllIlIII[0]] = lIlllIlIII[48];
                            if (lIIlllIlIIllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlllIlIII[1]];
                                iArr13[lIlllIlIII[0]] = lIlllIlIII[48];
                            }
                            ?? r02 = lIlllIlIII[1];
                            "".length();
                            return " ".length() < (-" ".length()) ? ((165 ^ 154) ^ " ".length()) & (((103 ^ 104) ^ (45 ^ 28)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIlllIlIII[0];
        } else if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[8]) && lIIlllIlIIllI(cc ? 1 : 0)) {
            int[] iArr14 = new int[lIlllIlIII[1]];
            iArr14[lIlllIlIII[0]] = lIlllIlIII[22];
            if (lIIlllIlIIllI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlllIlIII[1]];
                iArr15[lIlllIlIII[0]] = lIlllIlIII[22];
            }
            int[] iArr16 = new int[lIlllIlIII[1]];
            iArr16[lIlllIlIII[0]] = lIlllIlIII[24];
            if (lIIlllIlIIlII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIlllIlIII[1]];
                iArr17[lIlllIlIII[0]] = lIlllIlIII[38];
                if (lIIlllIlIIlII(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIlllIlIII[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIlllIlIII[0];
        } else if (lIIlllIlIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIII[8]) && lIIlllIlIIlII(cc ? 1 : 0)) {
            int[] iArr18 = new int[lIlllIlIII[1]];
            iArr18[lIlllIlIII[0]] = lIlllIlIII[22];
            if (lIIlllIlIIllI(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIlllIlIII[1]];
                iArr19[lIlllIlIII[0]] = lIlllIlIII[22];
            }
            int[] iArr20 = new int[lIlllIlIII[1]];
            iArr20[lIlllIlIII[0]] = lIlllIlIII[16];
            if (lIIlllIlIIlII(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIlllIlIII[1]];
                iArr21[lIlllIlIII[0]] = lIlllIlIII[23];
                if (lIIlllIlIIlII(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlllIlIII[1]];
                    iArr22[lIlllIlIII[0]] = lIlllIlIII[23];
                    if (lIIlllIlIlIIl(Inventory.getFirst(iArr22).getQuantity(), lIlllIlIII[19])) {
                        int[] iArr23 = new int[lIlllIlIII[1]];
                        iArr23[lIlllIlIII[0]] = lIlllIlIII[24];
                        if (lIIlllIlIIlII(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIlllIlIII[1]];
                            iArr24[lIlllIlIII[0]] = lIlllIlIII[38];
                            if (lIIlllIlIIlII(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIlllIlIII[1];
                                "".length();
                                return (194 ^ 198) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return lIlllIlIII[0];
        } else {
            return lIlllIlIII[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        lIIlllIlIIIll();
        lIIlllIlIIIlI();
        cc = lIlllIlIII[0];
        bp = new ArrayList();
        cd = new WorldArea(lIlllIlIII[77], lIlllIlIII[78], lIlllIlIII[53], lIlllIlIII[43], lIlllIlIII[0]);
        ce = new WorldPoint(lIlllIlIII[79], lIlllIlIII[80], lIlllIlIII[0]);
        cf = null;
    }

    private static boolean lIIlllIlIllll(int i, int i2) {
        return i > i2;
    }

    private static void lIIlllIlIIIlI() {
        lIlllIIllI = new String[lIlllIlIII[81]];
        lIlllIIllI[lIlllIlIII[0]] = lIIlllIIlllII("H8ZtQPpBu455/Me5O91p+g==", "xnHyJ");
        lIlllIIllI[lIlllIlIII[1]] = lIIlllIIlllIl("AB8hJjEuEytvIDMPJiElZh87Ki81Wm88NS8CLCcrKBFvLSMlHW87LWYbLigrJVY7PSMvGCYhJQ==", "FvOOB");
        lIlllIIllI[lIlllIlIII[3]] = lIIlllIIlllII("twW9UdQOZnhHXLzquhbth1r6HqB2I9VY", "csXCD");
        lIlllIIllI[lIlllIlIII[4]] = lIIlllIIlllII("CA4l6UCauNGVmrWcaXUdfkY+mhHg2yGF", "TKOYM");
        lIlllIIllI[lIlllIlIII[7]] = lIIlllIIllllI("WusHdsu1n6LQEKOc1VoYml2rG7969BrIiDW/L+PjaGU6zaWLnilY4RLa1/rjAuqO", "kSxYK");
        lIlllIIllI[lIlllIlIII[19]] = lIIlllIIlllII("Pi/dRF18qu+Vf4EwM6Kqxg==", "ZhiAi");
        lIlllIIllI[lIlllIlIII[6]] = lIIlllIIlllIl("GywMCxExMRYNUjk3Dxk=", "ZXxjr");
        lIlllIIllI[lIlllIlIII[27]] = lIIlllIIllllI("rZDvjPgusREe5IpAphsPUIfsk9HcyYOQ", "MCtPO");
        lIlllIIllI[lIlllIlIII[30]] = lIIlllIIlllII("VlWzOeG7ZUQi8TZe5MZZyd2W0xXfy/Zk", "hcXRV");
        lIlllIIllI[lIlllIlIII[32]] = lIIlllIIllllI("t+6hc7+yw/4uKsPeNO29An6K07MWptx3", "cbnhd");
        lIlllIIllI[lIlllIlIII[33]] = lIIlllIIllllI("YeOFwgvY5vegL7Z9wYWeje7Rxx/5QmDn", "mrovG");
        lIlllIIllI[lIlllIlIII[34]] = lIIlllIIlllII("bI13NVb2G8Y=", "eGUEL");
        lIlllIIllI[lIlllIlIII[37]] = lIIlllIIlllII("QqBdOzEp0wY=", "zPmsh");
        lIlllIIllI[lIlllIlIII[39]] = lIIlllIIllllI("0A6XUktfhTxw6l0SEORPh+hGVk00gBX2", "HKerE");
        lIlllIIllI[lIlllIlIII[43]] = lIIlllIIlllIl("CCUXSzwpZAIEPzU=", "FDakH");
        lIlllIIllI[lIlllIlIII[44]] = lIIlllIIllllI("nK5x18NDBiW8BC9TWHej3w==", "LETnd");
        lIlllIIllI[lIlllIlIII[45]] = lIIlllIIllllI("v+IIaEJ7+W8=", "gdfkd");
        lIlllIIllI[lIlllIlIII[46]] = lIIlllIIlllIl("ED04", "SROnI");
        lIlllIIllI[lIlllIlIII[47]] = lIIlllIIlllII("HLP4j6AAoI4=", "KIQUo");
        lIlllIIllI[lIlllIlIII[49]] = lIIlllIIlllII("+LzqzmJaVxQ=", "swLXo");
        lIlllIIllI[lIlllIlIII[53]] = lIIlllIIllllI("wCmjKaNnp1DwS+2OaBd1HibzkkNIxzTm", "fPEsU");
        lIlllIIllI[lIlllIlIII[54]] = lIIlllIIlllII("R4O32CPla4tXwypbAjy0Hw==", "PEsrD");
        lIlllIIllI[lIlllIlIII[56]] = lIIlllIIlllIl("Jws4KmUjFiQnLhU=", "pbVNE");
        lIlllIIllI[lIlllIlIII[57]] = lIIlllIIlllII("72CijQ/10vXu3WmE788KYQ==", "EcuQQ");
        lIlllIIllI[lIlllIlIII[58]] = lIIlllIIllllI("h8S7PYRKpI/yA2THK1IiSw==", "iGwZL");
        lIlllIIllI[lIlllIlIII[21]] = lIIlllIIlllIl("Ni4YOA9THB4+Dhgq", "sOjLg");
        lIlllIIllI[lIlllIlIII[52]] = lIIlllIIlllIl("CwIfFE4eHx8YBSg=", "Mkmqn");
        lIlllIIllI[lIlllIlIII[74]] = lIIlllIIllllI("b5T7R1f8NXA4CjB0s3f6IA==", "VGsbT");
        lIlllIIllI[lIlllIlIII[75]] = lIIlllIIllllI("EtTyhHQAbw66uFxgFE+DfaS+rzFfUDsR", "LsgEL");
        lIlllIIllI[lIlllIlIII[76]] = lIIlllIIlllII("VF0XXohxHSc=", "BbxpN");
    }

    private static void lIIlllIlIIIll() {
        lIlllIlIII = new int[82];
        lIlllIlIII[0] = (138 ^ 173) & ((82 ^ 117) ^ (-1));
        lIlllIlIII[1] = " ".length();
        lIlllIlIII[2] = 237 ^ 166;
        lIlllIlIII[3] = "  ".length();
        lIlllIlIII[4] = "   ".length();
        lIlllIlIII[5] = (-(45 ^ 25)) & (-16385) & 21435;
        lIlllIlIII[6] = (202 ^ 155) ^ (231 ^ 176);
        lIlllIlIII[7] = (((46 + 5) - (-96)) + 17) ^ (((59 + 50) - 0) + 51);
        lIlllIlIII[8] = 79 ^ 120;
        lIlllIlIII[9] = (-3266) & 3823;
        lIlllIlIII[10] = (-((-17883) & 32219)) & (-16899) & 32734;
        lIlllIlIII[11] = (-((-10315) & 11743)) & (-28673) & 30655;
        lIlllIlIII[12] = (-((-7749) & 32382)) & (-4097) & 31229;
        lIlllIlIII[13] = (-14353) & 14909;
        lIlllIlIII[14] = (-30082) & 30635;
        lIlllIlIII[15] = (-17481) & 21980;
        lIlllIlIII[16] = (-((-23049) & 31693)) & (-9) & 9215;
        lIlllIlIII[17] = (-((-769) & 18215)) & (-1) & 30071;
        lIlllIlIII[18] = (-24577) & 32585;
        lIlllIlIII[19] = 64 ^ 69;
        lIlllIlIII[20] = (-((-17827) & 32679)) & (-16513) & 31743;
        lIlllIlIII[21] = (((66 + 43) - 91) + 203) ^ (((187 + 78) - 130) + 61);
        lIlllIlIII[22] = (-((-1071) & 14015)) & (-16385) & 30715;
        lIlllIlIII[23] = (-1) & 556;
        lIlllIlIII[24] = (-((-549) & 3759)) & (-16449) & 20219;
        lIlllIlIII[25] = (51 ^ 88) ^ (245 ^ 160);
        lIlllIlIII[26] = (((18 + 110) - 97) + 137) ^ (((22 + 160) - 131) + 132);
        lIlllIlIII[27] = 149 ^ 146;
        lIlllIlIII[28] = -" ".length();
        lIlllIlIII[29] = (99 ^ 119) ^ (159 ^ 174);
        lIlllIlIII[30] = (45 ^ 62) ^ (86 ^ 77);
        lIlllIlIII[31] = 57 ^ 20;
        lIlllIlIII[32] = 79 ^ 70;
        lIlllIlIII[33] = (83 ^ 31) ^ (26 ^ 92);
        lIlllIlIII[34] = 52 ^ 63;
        lIlllIlIII[35] = (-"  ".length()) & (-4901) & 8063;
        lIlllIlIII[36] = (-12289) & 15775;
        lIlllIlIII[37] = (((49 + 67) - 20) + 33) ^ (((137 + 48) - 120) + 76);
        lIlllIlIII[38] = (50 ^ 58) ^ (100 ^ 83);
        lIlllIlIII[39] = 27 ^ 22;
        lIlllIlIII[40] = (-10369) & 10688;
        lIlllIlIII[41] = (-((-8245) & 14846)) & (-37) & 7167;
        lIlllIlIII[42] = (-((-8357) & 12470)) & (-16963) & 24575;
        lIlllIlIII[43] = 35 ^ 45;
        lIlllIlIII[44] = (80 ^ 75) ^ (210 ^ 198);
        lIlllIlIII[45] = 55 ^ 39;
        lIlllIlIII[46] = 64 ^ 81;
        lIlllIlIII[47] = (161 ^ 189) ^ (55 ^ 57);
        lIlllIlIII[48] = (-20491) & 21871;
        lIlllIlIII[49] = 165 ^ 182;
        lIlllIlIII[50] = (-13441) & 13716;
        lIlllIlIII[51] = (-29985) & 30577;
        lIlllIlIII[52] = (((162 + 67) - 203) + 144) ^ (((38 + 167) - 180) + 151);
        lIlllIlIII[53] = (((170 + 179) - 348) + 212) ^ (((111 + 108) - 181) + 155);
        lIlllIlIII[54] = (((27 + 15) - (-67)) + 80) ^ (((137 + 74) - 169) + 126);
        lIlllIlIII[55] = ((138 + 58) - 59) + 64;
        lIlllIlIII[56] = 90 ^ 76;
        lIlllIlIII[57] = 138 ^ 157;
        lIlllIlIII[58] = (198 ^ 163) ^ (246 ^ 139);
        lIlllIlIII[59] = (-21507) & 22506;
        lIlllIlIII[60] = ((19 + 77) - (-13)) + 61;
        lIlllIlIII[61] = (-((-1218) & 25809)) & (-81) & 28671;
        lIlllIlIII[62] = (-2087) & 4086;
        lIlllIlIII[63] = (-5186) & 8185;
        lIlllIlIII[64] = (-((-4805) & 22502)) & (-2569) & 32765;
        lIlllIlIII[65] = (-((-16401) & 17204)) & (-16401) & 32703;
        lIlllIlIII[66] = (((81 + 161) - 128) + 131) ^ (((15 + 80) - 39) + 85);
        lIlllIlIII[67] = (((((49 + 119) - 63) + 32) + (22 ^ 122)) - (((100 + 34) - 131) + 208)) + (30 ^ 106);
        lIlllIlIII[68] = (-((-2582) & 20349)) & (-1) & 32767;
        lIlllIlIII[69] = (((208 + 203) - 254) + 77) ^ (((1 + 137) - 27) + 31);
        lIlllIlIII[70] = (-((-21613) & 21886)) & (-4131) & 16383;
        lIlllIlIII[71] = (-4162) & 29161;
        lIlllIlIII[72] = (-(12 ^ 45)) & (-137) & 8175;
        lIlllIlIII[73] = (-((-2727) & 28343)) & (-6218) & 32733;
        lIlllIlIII[74] = 110 ^ 117;
        lIlllIlIII[75] = 123 ^ 103;
        lIlllIlIII[76] = (35 ^ 78) ^ (216 ^ 168);
        lIlllIlIII[77] = (-50) & 3071;
        lIlllIlIII[78] = (-25369) & 28667;
        lIlllIlIII[79] = (-4097) & 7127;
        lIlllIlIII[80] = (-4887) & 8191;
        lIlllIlIII[81] = (46 ^ 86) ^ (47 ^ 73);
    }

    private static String lIIlllIIllllI(String llllllllllllllllllIlllllIlIIIIll, String llllllllllllllllllIlllllIlIIIIlI) {
        try {
            SecretKeySpec llllllllllllllllllIlllllIlIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIlIII[3], llllllllllllllllllIlllllIlIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllllIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllllIlIIIlII) {
            llllllllllllllllllIlllllIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static void ak() {
        if (lIIlllIlIllIl(lIIlllIlIllII(C0004e.u(), 30.0d))) {
            int[] iArr = new int[lIlllIlIII[1]];
            iArr[lIlllIlIII[0]] = lIlllIlIII[20];
            if (lIIlllIlIIlII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlllIlIII[1]];
                iArr2[lIlllIlIII[0]] = lIlllIlIII[20];
                Inventory.getFirst(iArr2).interact(lIlllIIllI[lIlllIlIII[45]]);
                Time.sleepTicks(lIlllIlIII[1]);
                "".length();
            }
        }
        if (lIIlllIlIlIll(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIIlllIlIIlII(npc.getName().contains(lIlllIIllI[lIlllIlIII[76]]) ? 1 : 0) && lIIlllIlIIllI(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIlllIlIII[1];
                    "".length();
                    return "   ".length() <= 0 ? ((((54 + 173) - 32) + 6) ^ (((5 + 33) - 30) + 150)) & (((170 ^ 185) ^ (209 ^ 149)) ^ (-" ".length())) : r0;
                }
                return lIlllIlIII[0];
            });
            String[] strArr = new String[lIlllIlIII[3]];
            strArr[lIlllIlIII[0]] = lIlllIIllI[lIlllIlIII[46]];
            strArr[lIlllIlIII[1]] = lIlllIIllI[lIlllIlIII[47]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIIlllIlIlllI(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIlllIlIII[1];
                    "".length();
                    return (((((97 + 83) - 121) + 73) ^ (((68 + 77) - 117) + 111)) & (((229 ^ 170) ^ (52 ^ 116)) ^ (-" ".length()))) >= " ".length() ? ((240 ^ 160) ^ (205 ^ 199)) & (((188 ^ 168) ^ (15 ^ 65)) ^ (-" ".length())) : r0;
                }
                return lIlllIlIII[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIlllIlIII[1]];
            iArr3[lIlllIlIII[0]] = lIlllIlIII[48];
            if (lIIlllIlIIlII(Equipment.contains(iArr3) ? 1 : 0) && lIIlllIlIIllI(an() ? 1 : 0)) {
                ao();
            }
            if (lIIlllIlIIlll(nearest) && lIIlllIlIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lIlllIIllI[lIlllIlIII[49]]);
                Time.sleepTicks(lIlllIlIII[4]);
                "".length();
            }
        }
    }

    private static boolean lIIlllIlIIlIl(int i, int i2) {
        return i < i2;
    }

    public static void aj() {
        if (lIIlllIlIIlII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIlllIlIIllI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[43]];
            Movement.walkTo(ce);
            "".length();
            Time.sleepTicks(lIlllIlIII[1]);
            "".length();
        }
        if (lIIlllIlIIlII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlllIIllI[lIlllIlIII[44]];
            ak();
        }
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlllIIllI[lIlllIlIII[74]];
    }
}
