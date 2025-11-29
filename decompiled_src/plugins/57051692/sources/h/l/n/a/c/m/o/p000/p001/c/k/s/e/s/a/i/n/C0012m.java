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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.m  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/m.class */
public class C0012m implements K {
    public static /* synthetic */ List<C0003d> bp;
    private static /* synthetic */ String[] lIlIIllIlI;
    static /* synthetic */ WorldPoint cf;
    static /* synthetic */ WorldArea cd;
    static /* synthetic */ WorldPoint ce;
    private static /* synthetic */ int[] lIlIIllIll;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ boolean cc;

    private static boolean lIIIllIlllIIl(int i) {
        return i != 0;
    }

    private static boolean lIIIllIlllIll(int i) {
        return i == 0;
    }

    private static void O() {
        if (lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[6])) {
            int[] iArr = new int[lIlIIllIll[1]];
            iArr[lIlIIllIll[0]] = lIlIIllIll[14];
            if (lIIIllIlllIll(Bank.contains(iArr) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIllIll[14], lIlIIllIll[57], lIlIIllIll[58]));
                "".length();
            }
            int[] iArr2 = new int[lIlIIllIll[1]];
            iArr2[lIlIIllIll[0]] = lIlIIllIll[7];
            if (lIIIllIlllIll(Bank.contains(iArr2) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIllIll[7], lIlIIllIll[59], lIlIIllIll[24]));
                "".length();
            }
            int[] iArr3 = new int[lIlIIllIll[1]];
            iArr3[lIlIIllIll[0]] = lIlIIllIll[9];
            if (lIIIllIlllIll(Bank.contains(iArr3) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIllIll[9], lIlIIllIll[60], lIlIIllIll[24]));
                "".length();
            }
            int[] iArr4 = new int[lIlIIllIll[1]];
            iArr4[lIlIIllIll[0]] = lIlIIllIll[11];
            if (lIIIllIlllIll(Bank.contains(iArr4) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIllIll[11], lIlIIllIll[61], lIlIIllIll[24]));
                "".length();
            }
            int[] iArr5 = new int[lIlIIllIll[1]];
            iArr5[lIlIIllIll[0]] = lIlIIllIll[12];
            if (lIIIllIlllIll(Bank.contains(iArr5) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIllIll[12], lIlIIllIll[4], lIlIIllIll[24]));
                "".length();
            }
            int[] iArr6 = new int[lIlIIllIll[1]];
            iArr6[lIlIIllIll[0]] = lIlIIllIll[44];
            if (lIIIllIlllIll(Bank.contains(iArr6) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIllIll[44], lIlIIllIll[1], C0004e.c(lIlIIllIll[62], lIlIIllIll[63])));
                "".length();
            }
        }
        if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[6])) {
            int[] iArr7 = new int[lIlIIllIll[1]];
            iArr7[lIlIIllIll[0]] = lIlIIllIll[22];
            if (lIIIllIlllIIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlIIllIll[1]];
                iArr8[lIlIIllIll[0]] = lIlIIllIll[22];
                if (lIIIllIlllIlI(Bank.getFirst(iArr8).getQuantity(), lIlIIllIll[61])) {
                    int i = lIlIIllIll[22];
                    int i2 = lIlIIllIll[61];
                    int[] iArr9 = new int[lIlIIllIll[1]];
                    iArr9[lIlIIllIll[0]] = lIlIIllIll[22];
                    bp.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lIlIIllIll[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIlIIllIll[1]];
            iArr10[lIlIIllIll[0]] = lIlIIllIll[22];
            if (lIIIllIlllIll(Bank.contains(iArr10) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIllIll[22], lIlIIllIll[61], lIlIIllIll[64]));
                "".length();
            }
            int[] iArr11 = new int[lIlIIllIll[1]];
            iArr11[lIlIIllIll[0]] = lIlIIllIll[23];
            if (lIIIllIlllIIl(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIlIIllIll[1]];
                iArr12[lIlIIllIll[0]] = lIlIIllIll[23];
                if (lIIIllIlllIlI(Bank.getFirst(iArr12).getQuantity(), lIlIIllIll[61])) {
                    int i3 = lIlIIllIll[23];
                    int i4 = lIlIIllIll[61];
                    int[] iArr13 = new int[lIlIIllIll[1]];
                    iArr13[lIlIIllIll[0]] = lIlIIllIll[23];
                    bp.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lIlIIllIll[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIlIIllIll[1]];
            iArr14[lIlIIllIll[0]] = lIlIIllIll[23];
            if (lIIIllIlllIll(Bank.contains(iArr14) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIllIll[23], lIlIIllIll[61], lIlIIllIll[65]));
                "".length();
            }
            int[] iArr15 = new int[lIlIIllIll[1]];
            iArr15[lIlIIllIll[0]] = lIlIIllIll[20];
            if (lIIIllIlllIll(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIlIIllIll[1]];
                iArr16[lIlIIllIll[0]] = lIlIIllIll[20];
                if (lIIIllIlllIll(Equipment.contains(iArr16) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIIllIll[20], lIlIIllIll[1], lIlIIllIll[66]));
                    "".length();
                }
            }
            if (lIIIllIlllIIl(cc ? 1 : 0)) {
                int[] iArr17 = new int[lIlIIllIll[1]];
                iArr17[lIlIIllIll[0]] = lIlIIllIll[14];
                if (lIIIllIlllIIl(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIlIIllIll[1]];
                    iArr18[lIlIIllIll[0]] = lIlIIllIll[14];
                    if (lIIIllIlllIlI(Bank.getFirst(iArr18).getQuantity(), lIlIIllIll[61])) {
                        int i5 = lIlIIllIll[14];
                        int i6 = lIlIIllIll[61];
                        int[] iArr19 = new int[lIlIIllIll[1]];
                        iArr19[lIlIIllIll[0]] = lIlIIllIll[14];
                        bp.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lIlIIllIll[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIlIIllIll[1]];
                iArr20[lIlIIllIll[0]] = lIlIIllIll[14];
                if (lIIIllIlllIll(Bank.contains(iArr20) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIIllIll[14], lIlIIllIll[61], lIlIIllIll[58]));
                    "".length();
                }
                int[] iArr21 = new int[lIlIIllIll[1]];
                iArr21[lIlIIllIll[0]] = lIlIIllIll[21];
                if (lIIIllIlllIIl(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlIIllIll[1]];
                    iArr22[lIlIIllIll[0]] = lIlIIllIll[21];
                    if (lIIIllIlllIlI(Bank.getFirst(iArr22).getQuantity(), lIlIIllIll[66])) {
                        int i7 = lIlIIllIll[21];
                        int i8 = lIlIIllIll[66];
                        int[] iArr23 = new int[lIlIIllIll[1]];
                        iArr23[lIlIIllIll[0]] = lIlIIllIll[21];
                        bp.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lIlIIllIll[24]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIlIIllIll[1]];
                iArr24[lIlIIllIll[0]] = lIlIIllIll[21];
                if (lIIIllIlllIll(Bank.contains(iArr24) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIIllIll[21], lIlIIllIll[66], lIlIIllIll[24]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIlIIllIll[1]];
        iArr25[lIlIIllIll[0]] = lIlIIllIll[18];
        if (lIIIllIlllIll(Bank.contains(iArr25) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIll[18], lIlIIllIll[67], lIlIIllIll[37]));
            "".length();
        }
        if (lIIIllIlllIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIIllIlI[lIlIIllIll[74]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIll[68], lIlIIllIll[17], lIlIIllIll[69]));
            "".length();
        }
        int[] iArr26 = new int[lIlIIllIll[1]];
        iArr26[lIlIIllIll[0]] = lIlIIllIll[70];
        if (lIIIllIlllIll(Bank.contains(iArr26) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIll[70], lIlIIllIll[32], lIlIIllIll[71]));
            "".length();
        }
        int[] iArr27 = new int[lIlIIllIll[1]];
        iArr27[lIlIIllIll[0]] = lIlIIllIll[16];
        if (lIIIllIlllIll(Bank.contains(iArr27) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIllIll[16], lIlIIllIll[32], lIlIIllIll[71]));
            "".length();
        }
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIIllIlI[lIlIIllIll[72]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[73])) {
            ?? r0 = lIlIIllIll[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIllIll[0];
    }

    static {
        lIIIllIlllIII();
        lIIIllIllIlll();
        bp = new ArrayList();
        cd = new WorldArea(lIlIIllIll[76], lIlIIllIll[77], lIlIIllIll[47], lIlIIllIll[40], lIlIIllIll[0]);
        ce = new WorldPoint(lIlIIllIll[78], lIlIIllIll[79], lIlIIllIll[0]);
        cf = new WorldPoint(lIlIIllIll[80] + C0004e.c(lIlIIllIll[1], lIlIIllIll[5]), lIlIIllIll[81], lIlIIllIll[0]);
    }

    private static int lIIIlllIIIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIIllIlllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d5, code lost:
        if (lIIIllIlllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x028b, code lost:
        if (lIIIllIlllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0344, code lost:
        if (lIIIllIlllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[19])) {
            int[] iArr = new int[lIlIIllIll[1]];
            iArr[lIlIIllIll[0]] = lIlIIllIll[7];
            if (lIIIllIlllIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIllIll[1]];
                iArr2[lIlIIllIll[0]] = lIlIIllIll[11];
                if (lIIIllIlllIIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIIllIll[1]];
                    iArr3[lIlIIllIll[0]] = lIlIIllIll[9];
                    if (lIIIllIlllIIl(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlIIllIll[1]];
                        iArr4[lIlIIllIll[0]] = lIlIIllIll[12];
                        if (lIIIllIlllIIl(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlIIllIll[1]];
                            iArr5[lIlIIllIll[0]] = lIlIIllIll[18];
                            if (lIIIllIlllIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlIIllIll[1]];
                                iArr6[lIlIIllIll[0]] = lIlIIllIll[44];
                                if (lIIIllIlllIll(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIlIIllIll[1]];
                                    iArr7[lIlIIllIll[0]] = lIlIIllIll[44];
                                }
                                ?? r0 = lIlIIllIll[1];
                                "".length();
                                return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return lIlIIllIll[0];
        } else if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[19]) && lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[6])) {
            int[] iArr8 = new int[lIlIIllIll[1]];
            iArr8[lIlIIllIll[0]] = lIlIIllIll[11];
            if (lIIIllIlllIIl(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIlIIllIll[1]];
                iArr9[lIlIIllIll[0]] = lIlIIllIll[9];
                if (lIIIllIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIIllIll[1]];
                    iArr10[lIlIIllIll[0]] = lIlIIllIll[12];
                    if (lIIIllIlllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIlIIllIll[1]];
                        iArr11[lIlIIllIll[0]] = lIlIIllIll[14];
                        if (lIIIllIlllIIl(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIlIIllIll[1]];
                            iArr12[lIlIIllIll[0]] = lIlIIllIll[44];
                            if (lIIIllIlllIll(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlIIllIll[1]];
                                iArr13[lIlIIllIll[0]] = lIlIIllIll[44];
                            }
                            ?? r02 = lIlIIllIll[1];
                            "".length();
                            return (-" ".length()) > ((((129 + 39) - 121) + 94) ^ (((60 + 12) - 17) + 82)) ? ((((13 + 152) - 124) + 129) ^ (((87 + 85) - 102) + 71)) & (((81 ^ 89) ^ (142 ^ 161)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIlIIllIll[0];
        } else if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[6]) && lIIIllIlllIll(cc ? 1 : 0)) {
            int[] iArr14 = new int[lIlIIllIll[1]];
            iArr14[lIlIIllIll[0]] = lIlIIllIll[20];
            if (lIIIllIlllIll(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlIIllIll[1]];
                iArr15[lIlIIllIll[0]] = lIlIIllIll[20];
            }
            int[] iArr16 = new int[lIlIIllIll[1]];
            iArr16[lIlIIllIll[0]] = lIlIIllIll[22];
            if (lIIIllIlllIIl(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIlIIllIll[1]];
                iArr17[lIlIIllIll[0]] = lIlIIllIll[23];
                if (lIIIllIlllIIl(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIlIIllIll[1];
                    "".length();
                    return (-(87 ^ 83)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIlIIllIll[0];
        } else if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[6]) && lIIIllIlllIIl(cc ? 1 : 0)) {
            int[] iArr18 = new int[lIlIIllIll[1]];
            iArr18[lIlIIllIll[0]] = lIlIIllIll[20];
            if (lIIIllIlllIll(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIlIIllIll[1]];
                iArr19[lIlIIllIll[0]] = lIlIIllIll[20];
            }
            int[] iArr20 = new int[lIlIIllIll[1]];
            iArr20[lIlIIllIll[0]] = lIlIIllIll[14];
            if (lIIIllIlllIIl(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIlIIllIll[1]];
                iArr21[lIlIIllIll[0]] = lIlIIllIll[21];
                if (lIIIllIlllIIl(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlIIllIll[1]];
                    iArr22[lIlIIllIll[0]] = lIlIIllIll[21];
                    if (lIIIllIlllllI(Bank.getFirst(iArr22).getQuantity(), lIlIIllIll[17])) {
                        int[] iArr23 = new int[lIlIIllIll[1]];
                        iArr23[lIlIIllIll[0]] = lIlIIllIll[22];
                        if (lIIIllIlllIIl(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIlIIllIll[1]];
                            iArr24[lIlIIllIll[0]] = lIlIIllIll[23];
                            if (lIIIllIlllIIl(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIlIIllIll[1];
                                "".length();
                                return 0 != 0 ? ((((96 + 18) - (-18)) + 27) ^ (((64 + 123) - 73) + 31)) & (((((5 + 83) - 35) + 111) ^ (((30 + 101) - 80) + 119)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIlIIllIll[0];
        } else {
            return lIlIIllIll[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean an() {
        if (lIIIllIllllll(Vars.getBit(lIlIIllIll[48]), lIlIIllIll[1]) && lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[17])) {
            return lIlIIllIll[1];
        }
        if (lIIIllIllllll(Vars.getBit(lIlIIllIll[48]), lIlIIllIll[2]) && lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[31]) && lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[17])) {
            return lIlIIllIll[1];
        }
        if (lIIIllIllllll(Vars.getBit(lIlIIllIll[48]), lIlIIllIll[3]) && lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[31]) && lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[36])) {
            return lIlIIllIll[1];
        }
        if (lIIIllIllllll(Vars.getBit(lIlIIllIll[48]), lIlIIllIll[3]) && lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[31])) {
            int[] iArr = new int[lIlIIllIll[1]];
            iArr[lIlIIllIll[0]] = lIlIIllIll[12];
            if (lIIIllIlllIll(Inventory.contains(iArr) ? 1 : 0)) {
                return lIlIIllIll[1];
            }
        }
        if (lIIIllIllllll(Vars.getBit(lIlIIllIll[48]), lIlIIllIll[5]) && lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[36])) {
            int[] iArr2 = new int[lIlIIllIll[1]];
            iArr2[lIlIIllIll[0]] = lIlIIllIll[12];
            if (lIIIllIlllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIlIIllIll[1];
            }
        }
        return lIlIIllIll[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIIllIlllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d3, code lost:
        if (lIIIllIlllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0250, code lost:
        if (lIIIllIlllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0337, code lost:
        if (lIIIllIlllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[19])) {
            int[] iArr = new int[lIlIIllIll[1]];
            iArr[lIlIIllIll[0]] = lIlIIllIll[7];
            if (lIIIllIlllIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIllIll[1]];
                iArr2[lIlIIllIll[0]] = lIlIIllIll[11];
                if (lIIIllIlllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIIllIll[1]];
                    iArr3[lIlIIllIll[0]] = lIlIIllIll[9];
                    if (lIIIllIlllIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlIIllIll[1]];
                        iArr4[lIlIIllIll[0]] = lIlIIllIll[12];
                        if (lIIIllIlllIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlIIllIll[1]];
                            iArr5[lIlIIllIll[0]] = lIlIIllIll[18];
                            if (lIIIllIlllIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlIIllIll[1]];
                                iArr6[lIlIIllIll[0]] = lIlIIllIll[44];
                                if (lIIIllIlllIll(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIlIIllIll[1]];
                                    iArr7[lIlIIllIll[0]] = lIlIIllIll[44];
                                }
                                ?? r0 = lIlIIllIll[1];
                                "".length();
                                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return lIlIIllIll[0];
        } else if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[19]) && lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[6])) {
            int[] iArr8 = new int[lIlIIllIll[1]];
            iArr8[lIlIIllIll[0]] = lIlIIllIll[11];
            if (lIIIllIlllIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIlIIllIll[1]];
                iArr9[lIlIIllIll[0]] = lIlIIllIll[9];
                if (lIIIllIlllIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIIllIll[1]];
                    iArr10[lIlIIllIll[0]] = lIlIIllIll[12];
                    if (lIIIllIlllIIl(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIlIIllIll[1]];
                        iArr11[lIlIIllIll[0]] = lIlIIllIll[14];
                        if (lIIIllIlllIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIlIIllIll[1]];
                            iArr12[lIlIIllIll[0]] = lIlIIllIll[44];
                            if (lIIIllIlllIll(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlIIllIll[1]];
                                iArr13[lIlIIllIll[0]] = lIlIIllIll[44];
                            }
                            ?? r02 = lIlIIllIll[1];
                            "".length();
                            return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return lIlIIllIll[0];
        } else if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[6]) && lIIIllIlllIll(cc ? 1 : 0)) {
            int[] iArr14 = new int[lIlIIllIll[1]];
            iArr14[lIlIIllIll[0]] = lIlIIllIll[20];
            if (lIIIllIlllIll(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlIIllIll[1]];
                iArr15[lIlIIllIll[0]] = lIlIIllIll[20];
            }
            int[] iArr16 = new int[lIlIIllIll[1]];
            iArr16[lIlIIllIll[0]] = lIlIIllIll[22];
            if (lIIIllIlllIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIlIIllIll[1]];
                iArr17[lIlIIllIll[0]] = lIlIIllIll[35];
                if (lIIIllIlllIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIlIIllIll[1];
                    "".length();
                    return ((212 ^ 196) ^ (138 ^ 158)) <= "   ".length() ? ((((105 + 183) - 114) + 39) ^ (((78 + 55) - 40) + 45)) & (((228 ^ 164) ^ (178 ^ 173)) ^ (-" ".length())) : r03;
                }
            }
            return lIlIIllIll[0];
        } else if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[6]) && lIIIllIlllIIl(cc ? 1 : 0)) {
            int[] iArr18 = new int[lIlIIllIll[1]];
            iArr18[lIlIIllIll[0]] = lIlIIllIll[20];
            if (lIIIllIlllIll(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIlIIllIll[1]];
                iArr19[lIlIIllIll[0]] = lIlIIllIll[20];
            }
            int[] iArr20 = new int[lIlIIllIll[1]];
            iArr20[lIlIIllIll[0]] = lIlIIllIll[14];
            if (lIIIllIlllIIl(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIlIIllIll[1]];
                iArr21[lIlIIllIll[0]] = lIlIIllIll[21];
                if (lIIIllIlllIIl(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlIIllIll[1]];
                    iArr22[lIlIIllIll[0]] = lIlIIllIll[21];
                    if (lIIIllIlllllI(Inventory.getFirst(iArr22).getQuantity(), lIlIIllIll[17])) {
                        int[] iArr23 = new int[lIlIIllIll[1]];
                        iArr23[lIlIIllIll[0]] = lIlIIllIll[22];
                        if (lIIIllIlllIIl(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIlIIllIll[1]];
                            iArr24[lIlIIllIll[0]] = lIlIIllIll[35];
                            if (lIIIllIlllIIl(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIlIIllIll[1];
                                "".length();
                                return (((71 ^ 46) ^ (226 ^ 135)) & (((127 ^ 56) ^ (81 ^ 26)) ^ (-" ".length()))) == (-" ".length()) ? ((((73 + 5) - (-31)) + 28) ^ (((14 + 15) - 23) + 176)) & (((44 ^ 67) ^ (24 ^ 72)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIlIIllIll[0];
        } else {
            return lIlIIllIll[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v357, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v389, types: [boolean] */
    public static void ai() {
        if (lIIIllIlllIIl(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[0]];
            C0001b.a(bp);
            if (lIIIllIlllIlI(bp.size(), lIlIIllIll[1])) {
                System.out.println(lIlIIllIlI[lIlIIllIll[1]]);
                bn = lIlIIllIll[0];
            }
        }
        if (lIIIllIlllIll(bn ? 1 : 0)) {
            if (lIIIllIlllIll(al() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIllIllllII(nearest) && lIIIllIlllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[2]];
                    C0000a.a(nearest);
                }
                if (lIIIllIllllII(nearest) && lIIIllIlllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[3]];
                    if (lIIIllIlllIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIIllIll[4]);
                        "".length();
                    }
                    if (lIIIllIlllIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIllIllllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIIllIll[5]);
                            "".length();
                        }
                        while (lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[6]) && lIIIllIlllIll(C0024y.bv() ? 1 : 0)) {
                            C0024y.bt();
                            Time.sleepTicks(lIlIIllIll[1]);
                            "".length();
                            "".length();
                            if ((((115 ^ 108) ^ (30 ^ 51)) & (((206 ^ 138) ^ (230 ^ 144)) ^ (-" ".length()))) != 0) {
                                return;
                            }
                        }
                        if (lIIIllIlllIll(am() ? 1 : 0)) {
                            O();
                            System.out.println(lIlIIllIlI[lIlIIllIll[5]]);
                            bn = lIlIIllIll[1];
                            return;
                        }
                        if (lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[6])) {
                            int[] iArr = new int[lIlIIllIll[1]];
                            iArr[lIlIIllIll[0]] = lIlIIllIll[7];
                            if (lIIIllIlllIIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIlIIllIll[1]];
                                iArr2[lIlIIllIll[0]] = lIlIIllIll[7];
                                if (lIIIllIlllIlI(Inventory.getCount(iArr2), lIlIIllIll[1])) {
                                    Bank.withdraw(lIlIIllIll[7], lIlIIllIll[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIllIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIlIIllIll[1]];
                                        iArr3[lIlIIllIll[0]] = lIlIIllIll[7];
                                        if (lIIIllIllllIl(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIlIIllIll[1];
                                            "".length();
                                            return 0 != 0 ? ((237 ^ 185) ^ (75 ^ 15)) & (((172 ^ 170) ^ (115 ^ 101)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIIllIll[0];
                                    }, lIlIIllIll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIlIIllIll[1]];
                            iArr3[lIlIIllIll[0]] = lIlIIllIll[9];
                            if (lIIIllIlllIIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIlIIllIll[1]];
                                iArr4[lIlIIllIll[0]] = lIlIIllIll[9];
                                if (lIIIllIlllIlI(Inventory.getCount(iArr4), lIlIIllIll[1])) {
                                    Bank.withdraw(lIlIIllIll[9], lIlIIllIll[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIllIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIlIIllIll[1]];
                                        iArr5[lIlIIllIll[0]] = lIlIIllIll[9];
                                        if (lIIIllIllllIl(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIlIIllIll[1];
                                            "".length();
                                            return (-" ".length()) > 0 ? ((92 ^ 2) ^ (18 ^ 125)) & (((99 ^ 109) ^ (254 ^ 193)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIIllIll[0];
                                    }, lIlIIllIll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIlIIllIll[1]];
                            iArr5[lIlIIllIll[0]] = lIlIIllIll[11];
                            if (lIIIllIlllIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlIIllIll[1]];
                                iArr6[lIlIIllIll[0]] = lIlIIllIll[11];
                                if (lIIIllIlllIlI(Inventory.getCount(iArr6), lIlIIllIll[1])) {
                                    Bank.withdraw(lIlIIllIll[11], lIlIIllIll[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIllIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIlIIllIll[1]];
                                        iArr7[lIlIIllIll[0]] = lIlIIllIll[11];
                                        if (lIIIllIllllIl(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIlIIllIll[1];
                                            "".length();
                                            return " ".length() >= (92 ^ 88) ? "  ".length() & ("  ".length() ^ (-1)) : r0;
                                        }
                                        return lIlIIllIll[0];
                                    }, lIlIIllIll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIlIIllIll[1]];
                            iArr7[lIlIIllIll[0]] = lIlIIllIll[12];
                            if (lIIIllIlllIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIlIIllIll[1]];
                                iArr8[lIlIIllIll[0]] = lIlIIllIll[12];
                                if (lIIIllIlllIlI(Inventory.getCount(iArr8), lIlIIllIll[1])) {
                                    Bank.withdraw(lIlIIllIll[12], lIlIIllIll[13], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIllIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIlIIllIll[1]];
                                        iArr9[lIlIIllIll[0]] = lIlIIllIll[12];
                                        if (lIIIllIllllIl(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIlIIllIll[1];
                                            "".length();
                                            return (((117 ^ 124) ^ (53 ^ 59)) & (((((17 + 3) - 7) + 164) ^ (((112 + 176) - 246) + 140)) ^ (-" ".length()))) < (-" ".length()) ? ((62 ^ 57) ^ (180 ^ 166)) & (((197 ^ 173) ^ (35 ^ 94)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIIllIll[0];
                                    }, lIlIIllIll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIlIIllIll[1]];
                            iArr9[lIlIIllIll[0]] = lIlIIllIll[14];
                            if (lIIIllIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIlIIllIll[1]];
                                iArr10[lIlIIllIll[0]] = lIlIIllIll[14];
                                if (lIIIllIlllIlI(Inventory.getCount(iArr10), lIlIIllIll[1])) {
                                    Bank.withdraw(lIlIIllIll[14], lIlIIllIll[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIllIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIlIIllIll[1]];
                                        iArr11[lIlIIllIll[0]] = lIlIIllIll[14];
                                        if (lIIIllIllllIl(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIlIIllIll[1];
                                            "".length();
                                            return 0 != 0 ? ((193 ^ 167) ^ (91 ^ 37)) & (((((96 + 23) - 100) + 154) ^ (((137 + 177) - 157) + 24)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIIllIll[0];
                                    }, lIlIIllIll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIlIIllIll[1]];
                            iArr11[lIlIIllIll[0]] = lIlIIllIll[15];
                            if (lIIIllIlllIIl(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIlIIllIll[1]];
                                iArr12[lIlIIllIll[0]] = lIlIIllIll[15];
                                if (lIIIllIlllIll(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIlIIllIll[15], lIlIIllIll[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIllIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIlIIllIll[1]];
                                        iArr13[lIlIIllIll[0]] = lIlIIllIll[15];
                                        return Inventory.contains(iArr13);
                                    }, lIlIIllIll[4]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIlIIllIll[16], lIlIIllIll[17], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIlIIllIll[1]];
                            iArr13[lIlIIllIll[0]] = lIlIIllIll[18];
                            if (lIIIllIlllIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIlIIllIll[1]];
                                iArr14[lIlIIllIll[0]] = lIlIIllIll[18];
                                if (lIIIllIlllIlI(Inventory.getCount(iArr14), lIlIIllIll[1]) && lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[19])) {
                                    Bank.withdrawAll(lIlIIllIll[18], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIllIll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIlIIllIll[1]];
                                        iArr15[lIlIIllIll[0]] = lIlIIllIll[18];
                                        if (lIIIllIllllIl(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIlIIllIll[1];
                                            "".length();
                                            return (-" ".length()) > (-" ".length()) ? ((254 ^ 162) ^ (20 ^ 85)) & (((80 ^ 29) ^ (69 ^ 21)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIIllIll[0];
                                    }, lIlIIllIll[4]);
                                    "".length();
                                }
                            }
                        }
                        if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[6])) {
                            int[] iArr15 = new int[lIlIIllIll[1]];
                            iArr15[lIlIIllIll[0]] = lIlIIllIll[20];
                            if (lIIIllIlllIll(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIlIIllIll[20], lIlIIllIll[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlIIllIll[1]);
                                "".length();
                            }
                            if (lIIIllIlllIIl(cc ? 1 : 0)) {
                                Bank.withdrawAll(lIlIIllIll[21], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlIIllIll[1]);
                                "".length();
                                Bank.withdrawAll(lIlIIllIll[14], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlIIllIll[1]);
                                "".length();
                            }
                            Bank.withdrawAll(lIlIIllIll[22], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIlIIllIll[1]);
                            "".length();
                            Bank.withdrawAll(lIlIIllIll[23], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIlIIllIll[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIIllIlllIIl(al() ? 1 : 0)) {
                if (lIIIllIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[19])) {
                    if (lIIIllIlllIll(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[17]];
                        Movement.walkTo(ce);
                        "".length();
                        Time.sleepTicks(lIlIIllIll[1]);
                        "".length();
                    }
                    if (lIIIllIlllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[24]];
                        ak();
                    }
                }
                if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[19]) && lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[25])) {
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[26]];
                    if (lIIIllIllllll(Players.getLocal().getAnimation(), lIlIIllIll[27])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIlIIllIll[1]);
                        "".length();
                    }
                }
                if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[25]) && lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[28])) {
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[29]];
                    if (lIIIllIllllll(Players.getLocal().getAnimation(), lIlIIllIll[27])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIlIIllIll[1]);
                        "".length();
                    }
                }
                if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[28]) && lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[30])) {
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[31]];
                    if (lIIIllIllllll(Players.getLocal().getAnimation(), lIlIIllIll[27])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIlIIllIll[1]);
                        "".length();
                    }
                }
                if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[30]) && lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[6])) {
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[32]];
                    if (lIIIllIllllll(Players.getLocal().getAnimation(), lIlIIllIll[27])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIlIIllIll[1]);
                        "".length();
                    }
                }
                if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[6])) {
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[33]];
                    int[] iArr16 = new int[lIlIIllIll[1]];
                    iArr16[lIlIIllIll[0]] = lIlIIllIll[20];
                    if (lIIIllIlllIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIlIIllIll[1]];
                        iArr17[lIlIIllIll[0]] = lIlIIllIll[20];
                        if (lIIIllIlllIll(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIlIIllIll[1]];
                            iArr18[lIlIIllIll[0]] = lIlIIllIll[20];
                            Inventory.getFirst(iArr18).interact(lIlIIllIlI[lIlIIllIll[34]]);
                            Time.sleepTicks(lIlIIllIll[1]);
                            "".length();
                        }
                    }
                    if (lIIIllIlllIIl(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lIlIIllIll[1]];
                    iArr19[lIlIIllIll[0]] = lIlIIllIll[22];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIlIIllIll[1]];
                    iArr20[lIlIIllIll[0]] = lIlIIllIll[35];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIIIllIlllIll(cc ? 1 : 0)) {
                        if (lIIIllIlllIll(Players.getLocal().getWorldLocation().equals(cf) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[36]];
                            Movement.walkTo(cf);
                            "".length();
                            Time.sleepTicks(lIlIIllIll[1]);
                            "".length();
                        }
                        if (lIIIllIlllIIl(Players.getLocal().getWorldLocation().equals(cf) ? 1 : 0) && lIIIllIllllII(first) && lIIIllIllllII(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIIlllIIIlII(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = lIlIIllIll[1];
                                    "".length();
                                    return (-" ".length()) >= 0 ? ((209 ^ 180) ^ (88 ^ 117)) & (((((15 + 119) - (-50)) + 9) ^ (((130 + 123) - 204) + 88)) ^ (-" ".length())) : r0;
                                }
                                return lIlIIllIll[0];
                            }, lIlIIllIll[8]);
                            "".length();
                            Time.sleep(C0004e.c(lIlIIllIll[37], lIlIIllIll[38]));
                            "".length();
                        }
                    }
                    if (lIIIllIlllIIl(cc ? 1 : 0)) {
                        if (lIIIllIllllII(first) && lIIIllIllllII(first2) && lIIIllIllllll(Players.getLocal().getAnimation(), lIlIIllIll[27])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIIlllIIIlII(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = lIlIIllIll[1];
                                    "".length();
                                    return "   ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlIIllIll[0];
                            }, lIlIIllIll[8]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIIIllIllllll(Players.getLocal().getAnimation(), lIlIIllIll[27])) {
                                ?? r0 = lIlIIllIll[1];
                                "".length();
                                return ((51 ^ 94) ^ (175 ^ 198)) < ((13 ^ 76) ^ (7 ^ 66)) ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                            }
                            return lIlIIllIll[0];
                        }, lIlIIllIll[39]);
                        "".length();
                    }
                }
            }
        }
    }

    private static String lIIIllIllIlII(String llllllllllllllllllllIIIIllIIllIl, String llllllllllllllllllllIIIIllIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIIIllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIIIIllIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIIIIllIIllll.init(lIlIIllIll[2], secretKeySpec);
            return new String(llllllllllllllllllllIIIIllIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIIIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIIIllIIlllI) {
            llllllllllllllllllllIIIIllIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlllIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIIllIll[0];
    }

    private static boolean lIIIllIllllll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIllIllllIl(int i) {
        return i > 0;
    }

    public static void ao() {
        if (lIIIllIllllII(Widgets.get(lIlIIllIll[49], lIlIIllIll[50]))) {
            AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[51]];
            Widgets.get(lIlIIllIll[49], lIlIIllIll[50]).interact(lIlIIllIlI[lIlIIllIll[52]]);
            Time.sleepTicks(lIlIIllIll[5]);
            "".length();
        }
        if (lIIIlllIIIIlI(Widgets.get(lIlIIllIll[49], lIlIIllIll[50])) && lIIIllIlllIll(Widgets.get(lIlIIllIll[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIlIIllIll[1]);
            "".length();
            if (lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[17])) {
                Widgets.get(lIlIIllIll[53], lIlIIllIll[1]).getChild(lIlIIllIll[1]).interact(lIlIIllIlI[lIlIIllIll[54]]);
            }
            if (lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[31]) && lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[17])) {
                Widgets.get(lIlIIllIll[53], lIlIIllIll[1]).getChild(lIlIIllIll[2]).interact(lIlIIllIlI[lIlIIllIll[55]]);
            }
            if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[31]) && lIIIllIlllIlI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[36])) {
                Widgets.get(lIlIIllIll[53], lIlIIllIll[1]).getChild(lIlIIllIll[3]).interact(lIlIIllIlI[lIlIIllIll[19]]);
            }
            if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[31])) {
                int[] iArr = new int[lIlIIllIll[1]];
                iArr[lIlIIllIll[0]] = lIlIIllIll[12];
                if (lIIIllIlllIll(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIlIIllIll[53], lIlIIllIll[1]).getChild(lIlIIllIll[3]).interact(lIlIIllIlI[lIlIIllIll[50]]);
                }
            }
            if (lIIIllIlllllI(Skills.getLevel(Skill.MAGIC), lIlIIllIll[36])) {
                int[] iArr2 = new int[lIlIIllIll[1]];
                iArr2[lIlIIllIll[0]] = lIlIIllIll[12];
                if (lIIIllIlllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIlIIllIll[53], lIlIIllIll[1]).getChild(lIlIIllIll[5]).interact(lIlIIllIlI[lIlIIllIll[56]]);
                }
            }
            Time.sleepTicks(lIlIIllIll[1]);
            "".length();
        }
    }

    private static void lIIIllIllIlll() {
        lIlIIllIlI = new String[lIlIIllIll[25]];
        lIlIIllIlI[lIlIIllIll[0]] = lIIIllIllIlII("iV8lgc/ogcQdv5hs2Vxr9w==", "dPedI");
        lIlIIllIlI[lIlIIllIll[1]] = lIIIllIllIlIl("BRsWMzkrFxx6KDYLETQtYxsMPycwXlgpPSoGGzIjLRVYOCsgGVguJWMfGT0jIFIMKCsqHBE0LQ==", "CrxZJ");
        lIlIIllIlI[lIlIIllIll[2]] = lIIIllIllIlII("11Gh7QsfomQYbP12KSfrcIZMApDVdo05", "RVEhN");
        lIlIIllIlI[lIlIIllIll[3]] = lIIIllIllIlII("LGeJ8T6syE/5IWJOYTQZNlkXJ8fzCMUt", "uFGwA");
        lIlIIllIlI[lIlIIllIll[5]] = lIIIllIllIlIl("ACxaJCAyaRcsISQgFCJyJDwKNT4+LAlpciQ+EzExPyAUInIjJloHBw4ANAI=", "WIzER");
        lIlIIllIlI[lIlIIllIll[17]] = lIIIllIllIlII("ogC7biv9YTb95GV/HBK1lA==", "PVfyx");
        lIlIIllIlI[lIlIIllIll[24]] = lIIIllIllIlIl("ETccBhU7KgYAVjMsHxQ=", "PChgv");
        lIlIIllIlI[lIlIIllIll[26]] = lIIIllIllIllI("DwGbI/o2RiW6F8NPwZxn+vfdKpI9HPJA", "JrVWQ");
        lIlIIllIlI[lIlIIllIll[29]] = lIIIllIllIlIl("NS0pIR0YK3o5ARsuI3UAEyA/", "vLZUt");
        lIlIIllIlI[lIlIIllIll[31]] = lIIIllIllIlII("l7l77eM6NqAfhnS1TZU3P1JRJ5pcZ68I", "pvRlL");
        lIlIIllIlI[lIlIIllIll[32]] = lIIIllIllIllI("aZgRttD1vYWHcslgfGH4YKok8M+tDS1z", "OYVCD");
        lIlIIllIlI[lIlIIllIll[33]] = lIIIllIllIllI("IrrK6RaupM4=", "xOqQf");
        lIlIIllIlI[lIlIIllIll[34]] = lIIIllIllIllI("krH6JczFDS4=", "VklvM");
        lIlIIllIlI[lIlIIllIll[36]] = lIIIllIllIlII("+ZG9yBYPTcWbt2a1rv7iS+JOvt/2PJnw", "JGTvy");
        lIlIIllIlI[lIlIIllIll[40]] = lIIIllIllIlIl("Og8FUxYbThAcFQc=", "tnssb");
        lIlIIllIlI[lIlIIllIll[41]] = lIIIllIllIllI("OCPHlB4pLEo=", "WHsmr");
        lIlIIllIlI[lIlIIllIll[42]] = lIIIllIllIllI("ZjDfNH4pNF8=", "DzrBX");
        lIlIIllIlI[lIlIIllIll[43]] = lIIIllIllIlIl("FRck", "vxShB");
        lIlIIllIlI[lIlIIllIll[45]] = lIIIllIllIlIl("MAcuMRMaGjQ3UBIcLSM=", "qsZPp");
        lIlIIllIlI[lIlIIllIll[46]] = lIIIllIllIllI("kdJawDqcOmU=", "QVwOv");
        lIlIIllIlI[lIlIIllIll[47]] = lIIIllIllIllI("ZauBCq0m5/+x1bflklm+Hg==", "RMHvN");
        lIlIIllIlI[lIlIIllIll[51]] = lIIIllIllIllI("OS8QmjVRJsiJY2oHhHaMfjdxvRrYhglh", "CIExI");
        lIlIIllIlI[lIlIIllIll[52]] = lIIIllIllIlII("ZsXxRXPYWBwS3Mg3rEpYag==", "pullf");
        lIlIIllIlI[lIlIIllIll[54]] = lIIIllIllIlIl("EREIAGQVDBQNLyM=", "FxfdD");
        lIlIIllIlI[lIlIIllIll[55]] = lIIIllIllIllI("7aK5lwhLUkPN7vW5u4QHuA==", "BYFSB");
        lIlIIllIlI[lIlIIllIll[19]] = lIIIllIllIlII("1poBi0IbvhIedVAQQKaK6Q==", "PcAxz");
        lIlIIllIlI[lIlIIllIll[50]] = lIIIllIllIlII("ybQUsk70zu842lDp0qzPug==", "nVILZ");
        lIlIIllIlI[lIlIIllIll[56]] = lIIIllIllIlII("E0nph2tfbEkqvr9oxXAx0w==", "PveaI");
        lIlIIllIlI[lIlIIllIll[72]] = lIIIllIllIlII("U4TLWlLTW9X1wcF5/H55zw==", "gwtDk");
        lIlIIllIlI[lIlIIllIll[74]] = lIIIllIllIllI("1GlZr35j6Vk2OFFFMa1asU1ybJOe6Po7", "aeGPi");
        lIlIIllIlI[lIlIIllIll[75]] = lIIIllIllIlIl("Ng4m", "uaQKQ");
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            ai();
            "".length();
            if (" ".length() >= "   ".length()) {
                return (101 ^ 112) & ((58 ^ 47) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIIllIll[67];
    }

    private static boolean lIIIlllIIIlII(int i, int i2) {
        return i > i2;
    }

    public static void aj() {
        if (lIIIllIlllIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIllIlllIll(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[40]];
            Movement.walkTo(ce);
            "".length();
            Time.sleepTicks(lIlIIllIll[1]);
            "".length();
        }
        if (lIIIllIlllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            ak();
        }
    }

    private static boolean lIIIllIlllllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIlllIIIIIl(int i) {
        return i < 0;
    }

    private static boolean lIIIllIllllII(Object obj) {
        return obj != null;
    }

    private static String lIIIllIllIllI(String llllllllllllllllllllIIIIllIIIIII, String llllllllllllllllllllIIIIlIllllll) {
        try {
            SecretKeySpec llllllllllllllllllllIIIIllIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIIIlIllllll.getBytes(StandardCharsets.UTF_8)), lIlIIllIll[29]), "DES");
            Cipher llllllllllllllllllllIIIIllIIIIlI = Cipher.getInstance("DES");
            llllllllllllllllllllIIIIllIIIIlI.init(lIlIIllIll[2], llllllllllllllllllllIIIIllIIIIll);
            return new String(llllllllllllllllllllIIIIllIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIIIllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIIIllIIIIIl) {
            llllllllllllllllllllIIIIllIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIIIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void ak() {
        if (lIIIlllIIIIIl(lIIIlllIIIIII(C0004e.u(), 30.0d))) {
            int[] iArr = new int[lIlIIllIll[1]];
            iArr[lIlIIllIll[0]] = lIlIIllIll[18];
            if (lIIIllIlllIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIllIll[1]];
                iArr2[lIlIIllIll[0]] = lIlIIllIll[18];
                Inventory.getFirst(iArr2).interact(lIlIIllIlI[lIlIIllIll[41]]);
                Time.sleepTicks(lIlIIllIll[1]);
                "".length();
            }
        }
        if (lIIIlllIIIIlI(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIIIllIlllIIl(npc.getName().contains(lIlIIllIlI[lIlIIllIll[75]]) ? 1 : 0) && lIIIllIlllIll(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIlIIllIll[1];
                    "".length();
                    return "  ".length() <= (((57 ^ 10) ^ (173 ^ 193)) & (((53 ^ 31) ^ (198 ^ 179)) ^ (-" ".length()))) ? ((23 ^ 15) ^ (188 ^ 162)) & (((30 ^ 43) ^ (159 ^ 172)) ^ (-" ".length())) : r0;
                }
                return lIlIIllIll[0];
            });
            String[] strArr = new String[lIlIIllIll[2]];
            strArr[lIlIIllIll[0]] = lIlIIllIlI[lIlIIllIll[42]];
            strArr[lIlIIllIll[1]] = lIlIIllIlI[lIlIIllIll[43]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIIIlllIIIIll(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIlIIllIll[1];
                    "".length();
                    return (-" ".length()) > " ".length() ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                }
                return lIlIIllIll[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIlIIllIll[1]];
            iArr3[lIlIIllIll[0]] = lIlIIllIll[44];
            if (lIIIllIlllIIl(Equipment.contains(iArr3) ? 1 : 0) && lIIIllIlllIll(an() ? 1 : 0)) {
                ao();
            }
            if (lIIIllIllllII(nearest) && lIIIllIlllIll(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[45]];
                nearest.interact(lIlIIllIlI[lIlIIllIll[46]]);
                Time.sleepTicks(lIlIIllIll[3]);
                "".length();
            }
        }
        if (lIIIllIllllII(Players.getLocal().getInteracting())) {
            AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[47]];
            Time.sleepTicks(lIlIIllIll[1]);
            "".length();
        }
    }

    private static void lIIIllIlllIII() {
        lIlIIllIll = new int[82];
        lIlIIllIll[0] = (90 ^ 25) & ((205 ^ 142) ^ (-1));
        lIlIIllIll[1] = " ".length();
        lIlIIllIll[2] = "  ".length();
        lIlIIllIll[3] = "   ".length();
        lIlIIllIll[4] = (-((-4613) & 15980)) & (-17) & 16383;
        lIlIIllIll[5] = 82 ^ 86;
        lIlIIllIll[6] = 117 ^ 66;
        lIlIIllIll[7] = (-((-633) & 16122)) & (-321) & 16367;
        lIlIIllIll[8] = (-((-8285) & 29309)) & (-8195) & 30718;
        lIlIIllIll[9] = (-((-563) & 24503)) & (-8273) & 32767;
        lIlIIllIll[10] = (-17937) & 20436;
        lIlIIllIll[11] = (-((-2349) & 28013)) & (-401) & 26621;
        lIlIIllIll[12] = (-29078) & 29631;
        lIlIIllIll[13] = (-26186) & 30685;
        lIlIIllIll[14] = (-21837) & 22399;
        lIlIIllIll[15] = (-3203) & 15827;
        lIlIIllIll[16] = (-16533) & 24541;
        lIlIIllIll[17] = 94 ^ 91;
        lIlIIllIll[18] = (-8709) & 9087;
        lIlIIllIll[19] = (69 ^ 23) ^ (143 ^ 196);
        lIlIIllIll[20] = (-25217) & 26603;
        lIlIIllIll[21] = (-((-19369) & 28668)) & (-18817) & 28671;
        lIlIIllIll[22] = (-((-16385) & 27917)) & (-195) & 12287;
        lIlIIllIll[23] = 122 ^ 68;
        lIlIIllIll[24] = (97 ^ 39) ^ (85 ^ 21);
        lIlIIllIll[25] = 73 ^ 86;
        lIlIIllIll[26] = (67 ^ 45) ^ (88 ^ 49);
        lIlIIllIll[27] = -" ".length();
        lIlIIllIll[28] = (165 ^ 190) ^ (66 ^ 124);
        lIlIIllIll[29] = (126 ^ 33) ^ (207 ^ 152);
        lIlIIllIll[30] = 81 ^ 124;
        lIlIIllIll[31] = 55 ^ 62;
        lIlIIllIll[32] = 113 ^ 123;
        lIlIIllIll[33] = (((148 + 118) - 118) + 32) ^ (((124 + 140) - 237) + 164);
        lIlIIllIll[34] = (126 ^ 57) ^ (238 ^ 165);
        lIlIIllIll[35] = (3 ^ 77) ^ (53 ^ 68);
        lIlIIllIll[36] = (56 ^ 63) ^ (33 ^ 43);
        lIlIIllIll[37] = (-31267) & 31586;
        lIlIIllIll[38] = (-((-1241) & 30173)) & (-3169) & 32630;
        lIlIIllIll[39] = (-29201) & 32700;
        lIlIIllIll[40] = (((106 + 123) - 212) + 118) ^ (((121 + 97) - 95) + 14);
        lIlIIllIll[41] = (((83 + 77) - 48) + 40) ^ (((29 + 111) - 42) + 53);
        lIlIIllIll[42] = 71 ^ 87;
        lIlIIllIll[43] = 179 ^ 162;
        lIlIIllIll[44] = (-30745) & 32125;
        lIlIIllIll[45] = 77 ^ 95;
        lIlIIllIll[46] = (((39 + 130) - 168) + 147) ^ (((82 + 13) - 62) + 102);
        lIlIIllIll[47] = 0 ^ 20;
        lIlIIllIll[48] = (-((-24850) & 32605)) & (-161) & 8191;
        lIlIIllIll[49] = (-((-6753) & 24551)) & (-14369) & 32759;
        lIlIIllIll[50] = (105 ^ 21) ^ (45 ^ 75);
        lIlIIllIll[51] = (((88 + 124) - 132) + 133) ^ (((83 + 23) - 30) + 116);
        lIlIIllIll[52] = 72 ^ 94;
        lIlIIllIll[53] = (((27 ^ 86) + (225 ^ 166)) - (91 ^ 35)) + ((114 + 26) - 93) + 126;
        lIlIIllIll[54] = (148 ^ 163) ^ (129 ^ 161);
        lIlIIllIll[55] = 49 ^ 41;
        lIlIIllIll[56] = (122 ^ 54) ^ (42 ^ 125);
        lIlIIllIll[57] = (-((-21485) & 32765)) & (-4099) & 16378;
        lIlIIllIll[58] = ((148 + 109) - 256) + 169;
        lIlIIllIll[59] = (-((-2776) & 10999)) & (-65) & 12287;
        lIlIIllIll[60] = (-((-10817) & 27248)) & (-2049) & 20479;
        lIlIIllIll[61] = (-25601) & 28600;
        lIlIIllIll[62] = (-801) & 13300;
        lIlIIllIll[63] = (-((-11293) & 27967)) & (-514) & 32687;
        lIlIIllIll[64] = (70 ^ 45) ^ (109 ^ 126);
        lIlIIllIll[65] = ((102 + 46) - 146) + 148;
        lIlIIllIll[66] = (-1058) & 16057;
        lIlIIllIll[67] = (((208 + 62) - 82) + 54) ^ (((108 + 82) - 102) + 62);
        lIlIIllIll[68] = (-16675) & 28654;
        lIlIIllIll[69] = (-((-12825) & 14874)) & (-5137) & 32185;
        lIlIIllIll[70] = (-185) & 8191;
        lIlIIllIll[71] = (-((-722) & 27387)) & (-1025) & 28589;
        lIlIIllIll[72] = 27 ^ 7;
        lIlIIllIll[73] = 127 ^ 28;
        lIlIIllIll[74] = 178 ^ 175;
        lIlIIllIll[75] = 156 ^ 130;
        lIlIIllIll[76] = (-25602) & 28623;
        lIlIIllIll[77] = (-29213) & 32511;
        lIlIIllIll[78] = (-8193) & 11223;
        lIlIIllIll[79] = (-529) & 3833;
        lIlIIllIll[80] = (-((-2265) & 2553)) & (-29186) & 32635;
        lIlIIllIll[81] = (-12801) & 16287;
    }

    private static boolean lIIIlllIIIIlI(Object obj) {
        return obj == null;
    }

    private static String lIIIllIllIlIl(String llllllllllllllllllllIIIIlIllIIII, String llllllllllllllllllllIIIIlIlIllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllllIIIIlIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllllIIIIlIlIllll.toCharArray();
        int llllllllllllllllllllIIIIlIlIllII = lIlIIllIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIllIll[0];
        while (lIIIllIlllIlI(i, length)) {
            char llllllllllllllllllllIIIIlIllIIIl = charArray2[i];
            sb.append((char) (llllllllllllllllllllIIIIlIllIIIl ^ charArray[llllllllllllllllllllIIIIlIlIllII % charArray.length]));
            "".length();
            llllllllllllllllllllIIIIlIlIllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
