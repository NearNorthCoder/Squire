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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.P  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/P.class */
public class P implements K {
    public static /* synthetic */ List<C0003d> bp;
    private static /* synthetic */ int[] lIlIlIlIII;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ WorldPoint ce;
    private static /* synthetic */ String[] lIlIlIIlll;
    static /* synthetic */ WorldPoint cf;
    public static /* synthetic */ boolean cc;
    static /* synthetic */ WorldArea cd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        lIIlIIIIIlIll();
        lIIlIIIIIlIlI();
        cc = lIlIlIlIII[0];
        bp = new ArrayList();
        cd = new WorldArea(lIlIlIlIII[76], lIlIlIlIII[77], lIlIlIlIII[51], lIlIlIlIII[41], lIlIlIlIII[0]);
        ce = new WorldPoint(lIlIlIlIII[78], lIlIlIlIII[79], lIlIlIlIII[0]);
        cf = null;
    }

    private static int lIIlIIIIlIlII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void ak() {
        if (lIIlIIIIlIlIl(lIIlIIIIlIlII(C0004e.u(), 30.0d))) {
            int[] iArr = new int[lIlIlIlIII[1]];
            iArr[lIlIlIlIII[0]] = lIlIlIlIII[20];
            if (lIIlIIIIIllII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIlIlIII[1]];
                iArr2[lIlIlIlIII[0]] = lIlIlIlIII[20];
                Inventory.getFirst(iArr2).interact(lIlIlIIlll[lIlIlIlIII[43]]);
                Time.sleepTicks(lIlIlIlIII[1]);
                "".length();
            }
        }
        if (lIIlIIIIlIIll(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIIlIIIIIllII(npc.getName().contains(lIlIlIIlll[lIlIlIlIII[75]]) ? 1 : 0) && lIIlIIIIIlllI(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIlIlIlIII[1];
                    "".length();
                    return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIlIlIII[0];
            });
            String[] strArr = new String[lIlIlIlIII[3]];
            strArr[lIlIlIlIII[0]] = lIlIlIIlll[lIlIlIlIII[44]];
            strArr[lIlIlIlIII[1]] = lIlIlIIlll[lIlIlIlIII[45]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIIlIIIIlIllI(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIlIlIlIII[1];
                    "".length();
                    return (-" ".length()) >= (((((81 + 122) - 90) + 16) ^ (((119 + 74) - 102) + 66)) & (((31 ^ 115) ^ (45 ^ 93)) ^ (-" ".length()))) ? ((96 ^ 58) ^ (74 ^ 24)) & (((196 ^ 157) ^ (23 ^ 70)) ^ (-" ".length())) : r0;
                }
                return lIlIlIlIII[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIlIlIlIII[1]];
            iArr3[lIlIlIlIII[0]] = lIlIlIlIII[46];
            if (lIIlIIIIIllII(Equipment.contains(iArr3) ? 1 : 0) && lIIlIIIIIlllI(an() ? 1 : 0)) {
                ao();
            }
            if (lIIlIIIIIllll(nearest) && lIIlIIIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lIlIlIIlll[lIlIlIlIII[47]]);
                Time.sleepTicks(lIlIlIlIII[4]);
                "".length();
            }
        }
    }

    private static boolean lIIlIIIIlIIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIIIIllll(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIIIlIlIl(int i) {
        return i < 0;
    }

    private static void O() {
        if (lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[8])) {
            int[] iArr = new int[lIlIlIlIII[1]];
            iArr[lIlIlIlIII[0]] = lIlIlIlIII[16];
            if (lIIlIIIIIlllI(Bank.contains(iArr) ? 1 : 0)) {
                bp.add(new C0003d(lIlIlIlIII[16], lIlIlIlIII[57], lIlIlIlIII[58]));
                "".length();
            }
            int[] iArr2 = new int[lIlIlIlIII[1]];
            iArr2[lIlIlIlIII[0]] = lIlIlIlIII[9];
            if (lIIlIIIIIlllI(Bank.contains(iArr2) ? 1 : 0)) {
                bp.add(new C0003d(lIlIlIlIII[9], lIlIlIlIII[59], lIlIlIlIII[6]));
                "".length();
            }
            int[] iArr3 = new int[lIlIlIlIII[1]];
            iArr3[lIlIlIlIII[0]] = lIlIlIlIII[11];
            if (lIIlIIIIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                bp.add(new C0003d(lIlIlIlIII[11], lIlIlIlIII[60], lIlIlIlIII[6]));
                "".length();
            }
            int[] iArr4 = new int[lIlIlIlIII[1]];
            iArr4[lIlIlIlIII[0]] = lIlIlIlIII[13];
            if (lIIlIIIIIlllI(Bank.contains(iArr4) ? 1 : 0)) {
                bp.add(new C0003d(lIlIlIlIII[13], lIlIlIlIII[61], lIlIlIlIII[6]));
                "".length();
            }
            int[] iArr5 = new int[lIlIlIlIII[1]];
            iArr5[lIlIlIlIII[0]] = lIlIlIlIII[14];
            if (lIIlIIIIIlllI(Bank.contains(iArr5) ? 1 : 0)) {
                bp.add(new C0003d(lIlIlIlIII[14], lIlIlIlIII[5], lIlIlIlIII[6]));
                "".length();
            }
            int[] iArr6 = new int[lIlIlIlIII[1]];
            iArr6[lIlIlIlIII[0]] = lIlIlIlIII[46];
            if (lIIlIIIIIlllI(Bank.contains(iArr6) ? 1 : 0)) {
                bp.add(new C0003d(lIlIlIlIII[46], lIlIlIlIII[1], C0004e.c(lIlIlIlIII[62], lIlIlIlIII[63])));
                "".length();
            }
        }
        if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[8])) {
            int[] iArr7 = new int[lIlIlIlIII[1]];
            iArr7[lIlIlIlIII[0]] = lIlIlIlIII[24];
            if (lIIlIIIIIllII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlIlIlIII[1]];
                iArr8[lIlIlIlIII[0]] = lIlIlIlIII[24];
                if (lIIlIIIIIllIl(Bank.getFirst(iArr8).getQuantity(), lIlIlIlIII[61])) {
                    int i = lIlIlIlIII[24];
                    int i2 = lIlIlIlIII[61];
                    int[] iArr9 = new int[lIlIlIlIII[1]];
                    iArr9[lIlIlIlIII[0]] = lIlIlIlIII[24];
                    bp.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lIlIlIlIII[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIlIlIlIII[1]];
            iArr10[lIlIlIlIII[0]] = lIlIlIlIII[24];
            if (lIIlIIIIIlllI(Bank.contains(iArr10) ? 1 : 0)) {
                bp.add(new C0003d(lIlIlIlIII[24], lIlIlIlIII[61], lIlIlIlIII[64]));
                "".length();
            }
            int[] iArr11 = new int[lIlIlIlIII[1]];
            iArr11[lIlIlIlIII[0]] = lIlIlIlIII[25];
            if (lIIlIIIIIllII(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIlIlIlIII[1]];
                iArr12[lIlIlIlIII[0]] = lIlIlIlIII[25];
                if (lIIlIIIIIllIl(Bank.getFirst(iArr12).getQuantity(), lIlIlIlIII[61])) {
                    int i3 = lIlIlIlIII[25];
                    int i4 = lIlIlIlIII[61];
                    int[] iArr13 = new int[lIlIlIlIII[1]];
                    iArr13[lIlIlIlIII[0]] = lIlIlIlIII[25];
                    bp.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lIlIlIlIII[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIlIlIlIII[1]];
            iArr14[lIlIlIlIII[0]] = lIlIlIlIII[25];
            if (lIIlIIIIIlllI(Bank.contains(iArr14) ? 1 : 0)) {
                bp.add(new C0003d(lIlIlIlIII[25], lIlIlIlIII[61], lIlIlIlIII[65]));
                "".length();
            }
            int[] iArr15 = new int[lIlIlIlIII[1]];
            iArr15[lIlIlIlIII[0]] = lIlIlIlIII[22];
            if (lIIlIIIIIlllI(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIlIlIlIII[1]];
                iArr16[lIlIlIlIII[0]] = lIlIlIlIII[22];
                if (lIIlIIIIIlllI(Equipment.contains(iArr16) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIlIlIII[22], lIlIlIlIII[1], lIlIlIlIII[66]));
                    "".length();
                }
            }
            if (lIIlIIIIIllII(cc ? 1 : 0)) {
                int[] iArr17 = new int[lIlIlIlIII[1]];
                iArr17[lIlIlIlIII[0]] = lIlIlIlIII[16];
                if (lIIlIIIIIllII(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIlIlIlIII[1]];
                    iArr18[lIlIlIlIII[0]] = lIlIlIlIII[16];
                    if (lIIlIIIIIllIl(Bank.getFirst(iArr18).getQuantity(), lIlIlIlIII[61])) {
                        int i5 = lIlIlIlIII[16];
                        int i6 = lIlIlIlIII[61];
                        int[] iArr19 = new int[lIlIlIlIII[1]];
                        iArr19[lIlIlIlIII[0]] = lIlIlIlIII[16];
                        bp.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lIlIlIlIII[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIlIlIlIII[1]];
                iArr20[lIlIlIlIII[0]] = lIlIlIlIII[16];
                if (lIIlIIIIIlllI(Bank.contains(iArr20) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIlIlIII[16], lIlIlIlIII[61], lIlIlIlIII[58]));
                    "".length();
                }
                int[] iArr21 = new int[lIlIlIlIII[1]];
                iArr21[lIlIlIlIII[0]] = lIlIlIlIII[23];
                if (lIIlIIIIIllII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlIlIlIII[1]];
                    iArr22[lIlIlIlIII[0]] = lIlIlIlIII[23];
                    if (lIIlIIIIIllIl(Bank.getFirst(iArr22).getQuantity(), lIlIlIlIII[66])) {
                        int i7 = lIlIlIlIII[23];
                        int i8 = lIlIlIlIII[66];
                        int[] iArr23 = new int[lIlIlIlIII[1]];
                        iArr23[lIlIlIlIII[0]] = lIlIlIlIII[23];
                        bp.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lIlIlIlIII[6]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIlIlIlIII[1]];
                iArr24[lIlIlIlIII[0]] = lIlIlIlIII[23];
                if (lIIlIIIIIlllI(Bank.contains(iArr24) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIlIlIII[23], lIlIlIlIII[66], lIlIlIlIII[6]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIlIlIlIII[1]];
        iArr25[lIlIlIlIII[0]] = lIlIlIlIII[20];
        if (lIIlIIIIIlllI(Bank.contains(iArr25) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIlIII[20], lIlIlIlIII[67], lIlIlIlIII[68]));
            "".length();
        }
        if (lIIlIIIIIlllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIlIIlll[lIlIlIlIII[74]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIlIII[69], lIlIlIlIII[19], lIlIlIlIII[70]));
            "".length();
        }
        int[] iArr26 = new int[lIlIlIlIII[1]];
        iArr26[lIlIlIlIII[0]] = lIlIlIlIII[71];
        if (lIIlIIIIIlllI(Bank.contains(iArr26) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIlIII[71], lIlIlIlIII[33], lIlIlIlIII[72]));
            "".length();
        }
        int[] iArr27 = new int[lIlIlIlIII[1]];
        iArr27[lIlIlIlIII[0]] = lIlIlIlIII[18];
        if (lIIlIIIIIlllI(Bank.contains(iArr27) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIlIII[18], lIlIlIlIII[33], lIlIlIlIII[72]));
            "".length();
        }
    }

    private static boolean lIIlIIIIlIIII(int i) {
        return i > 0;
    }

    private static boolean lIIlIIIIIlllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[2])) {
            ?? r0 = lIlIlIlIII[1];
            "".length();
            return (((51 ^ 59) ^ (208 ^ 155)) & (((204 ^ 162) ^ (29 ^ 48)) ^ (-" ".length()))) > "   ".length() ? ((45 ^ 72) ^ (93 ^ 91)) & (((3 ^ 104) ^ (115 ^ 123)) ^ (-" ".length())) : r0;
        }
        return lIlIlIlIII[0];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            ai();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (123 ^ 74) & ((75 ^ 122) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIlIlIII[67];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIlIIlll[lIlIlIlIII[73]];
    }

    private static boolean lIIlIIIIlIlll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIlIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f0, code lost:
        if (lIIlIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027b, code lost:
        if (lIIlIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0334, code lost:
        if (lIIlIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[21])) {
            int[] iArr = new int[lIlIlIlIII[1]];
            iArr[lIlIlIlIII[0]] = lIlIlIlIII[9];
            if (lIIlIIIIIllII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIlIlIII[1]];
                iArr2[lIlIlIlIII[0]] = lIlIlIlIII[13];
                if (lIIlIIIIIllII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIlIlIII[1]];
                    iArr3[lIlIlIlIII[0]] = lIlIlIlIII[11];
                    if (lIIlIIIIIllII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlIlIlIII[1]];
                        iArr4[lIlIlIlIII[0]] = lIlIlIlIII[14];
                        if (lIIlIIIIIllII(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlIlIlIII[1]];
                            iArr5[lIlIlIlIII[0]] = lIlIlIlIII[20];
                            if (lIIlIIIIIllII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlIlIlIII[1]];
                                iArr6[lIlIlIlIII[0]] = lIlIlIlIII[46];
                                if (lIIlIIIIIlllI(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIlIlIlIII[1]];
                                    iArr7[lIlIlIlIII[0]] = lIlIlIlIII[46];
                                }
                                ?? r0 = lIlIlIlIII[1];
                                "".length();
                                return 0 != 0 ? ((246 ^ 129) ^ (103 ^ 32)) & (((((82 + 112) - 172) + 162) ^ (((73 + 61) - 103) + 105)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIlIlIlIII[0];
        } else if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[21]) && lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[8])) {
            int[] iArr8 = new int[lIlIlIlIII[1]];
            iArr8[lIlIlIlIII[0]] = lIlIlIlIII[13];
            if (lIIlIIIIIllII(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIlIlIlIII[1]];
                iArr9[lIlIlIlIII[0]] = lIlIlIlIII[11];
                if (lIIlIIIIIllII(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIlIlIII[1]];
                    iArr10[lIlIlIlIII[0]] = lIlIlIlIII[14];
                    if (lIIlIIIIIllII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIlIlIlIII[1]];
                        iArr11[lIlIlIlIII[0]] = lIlIlIlIII[16];
                        if (lIIlIIIIIllII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIlIlIlIII[1]];
                            iArr12[lIlIlIlIII[0]] = lIlIlIlIII[46];
                            if (lIIlIIIIIlllI(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlIlIlIII[1]];
                                iArr13[lIlIlIlIII[0]] = lIlIlIlIII[46];
                            }
                            ?? r02 = lIlIlIlIII[1];
                            "".length();
                            return 0 != 0 ? ((14 ^ 102) ^ (114 ^ 64)) & (((62 ^ 12) ^ (221 ^ 181)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIlIlIlIII[0];
        } else if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[8]) && lIIlIIIIIlllI(cc ? 1 : 0)) {
            int[] iArr14 = new int[lIlIlIlIII[1]];
            iArr14[lIlIlIlIII[0]] = lIlIlIlIII[22];
            if (lIIlIIIIIlllI(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlIlIlIII[1]];
                iArr15[lIlIlIlIII[0]] = lIlIlIlIII[22];
            }
            int[] iArr16 = new int[lIlIlIlIII[1]];
            iArr16[lIlIlIlIII[0]] = lIlIlIlIII[24];
            if (lIIlIIIIIllII(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIlIlIlIII[1]];
                iArr17[lIlIlIlIII[0]] = lIlIlIlIII[25];
                if (lIIlIIIIIllII(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIlIlIlIII[1];
                    "".length();
                    return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIlIlIlIII[0];
        } else if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[8]) && lIIlIIIIIllII(cc ? 1 : 0)) {
            int[] iArr18 = new int[lIlIlIlIII[1]];
            iArr18[lIlIlIlIII[0]] = lIlIlIlIII[22];
            if (lIIlIIIIIlllI(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIlIlIlIII[1]];
                iArr19[lIlIlIlIII[0]] = lIlIlIlIII[22];
            }
            int[] iArr20 = new int[lIlIlIlIII[1]];
            iArr20[lIlIlIlIII[0]] = lIlIlIlIII[16];
            if (lIIlIIIIIllII(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIlIlIlIII[1]];
                iArr21[lIlIlIlIII[0]] = lIlIlIlIII[23];
                if (lIIlIIIIIllII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlIlIlIII[1]];
                    iArr22[lIlIlIlIII[0]] = lIlIlIlIII[23];
                    if (lIIlIIIIlIIIl(Bank.getFirst(iArr22).getQuantity(), lIlIlIlIII[19])) {
                        int[] iArr23 = new int[lIlIlIlIII[1]];
                        iArr23[lIlIlIlIII[0]] = lIlIlIlIII[24];
                        if (lIIlIIIIIllII(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIlIlIlIII[1]];
                            iArr24[lIlIlIlIII[0]] = lIlIlIlIII[25];
                            if (lIIlIIIIIllII(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIlIlIlIII[1];
                                "".length();
                                return ((((12 + 62) - (-3)) + 73) ^ (((86 + 114) - 127) + 73)) < (((88 ^ 24) ^ (126 ^ 54)) & (((67 ^ 33) ^ (200 ^ 162)) ^ (-" ".length()))) ? ((229 ^ 162) ^ (232 ^ 137)) & (((6 ^ 32) ^ ((157 ^ 173) & ((245 ^ 197) ^ (-1)))) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIlIlIlIII[0];
        } else {
            return lIlIlIlIII[0];
        }
    }

    private static boolean lIIlIIIIIllII(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIlIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d1, code lost:
        if (lIIlIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026c, code lost:
        if (lIIlIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0327, code lost:
        if (lIIlIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[21])) {
            int[] iArr = new int[lIlIlIlIII[1]];
            iArr[lIlIlIlIII[0]] = lIlIlIlIII[9];
            if (lIIlIIIIIllII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIlIlIII[1]];
                iArr2[lIlIlIlIII[0]] = lIlIlIlIII[13];
                if (lIIlIIIIIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIlIlIII[1]];
                    iArr3[lIlIlIlIII[0]] = lIlIlIlIII[11];
                    if (lIIlIIIIIllII(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlIlIlIII[1]];
                        iArr4[lIlIlIlIII[0]] = lIlIlIlIII[14];
                        if (lIIlIIIIIllII(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlIlIlIII[1]];
                            iArr5[lIlIlIlIII[0]] = lIlIlIlIII[20];
                            if (lIIlIIIIIllII(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlIlIlIII[1]];
                                iArr6[lIlIlIlIII[0]] = lIlIlIlIII[46];
                                if (lIIlIIIIIlllI(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIlIlIlIII[1]];
                                    iArr7[lIlIlIlIII[0]] = lIlIlIlIII[46];
                                }
                                ?? r0 = lIlIlIlIII[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return lIlIlIlIII[0];
        } else if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[21]) && lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[8])) {
            int[] iArr8 = new int[lIlIlIlIII[1]];
            iArr8[lIlIlIlIII[0]] = lIlIlIlIII[13];
            if (lIIlIIIIIllII(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIlIlIlIII[1]];
                iArr9[lIlIlIlIII[0]] = lIlIlIlIII[11];
                if (lIIlIIIIIllII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIlIlIII[1]];
                    iArr10[lIlIlIlIII[0]] = lIlIlIlIII[14];
                    if (lIIlIIIIIllII(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIlIlIlIII[1]];
                        iArr11[lIlIlIlIII[0]] = lIlIlIlIII[16];
                        if (lIIlIIIIIllII(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIlIlIlIII[1]];
                            iArr12[lIlIlIlIII[0]] = lIlIlIlIII[46];
                            if (lIIlIIIIIlllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlIlIlIII[1]];
                                iArr13[lIlIlIlIII[0]] = lIlIlIlIII[46];
                            }
                            ?? r02 = lIlIlIlIII[1];
                            "".length();
                            return " ".length() == 0 ? ((((16 + 9) - (-34)) + 71) ^ (((122 + 42) - 75) + 51)) & (((62 ^ 44) ^ (133 ^ 153)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIlIlIlIII[0];
        } else if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[8]) && lIIlIIIIIlllI(cc ? 1 : 0)) {
            int[] iArr14 = new int[lIlIlIlIII[1]];
            iArr14[lIlIlIlIII[0]] = lIlIlIlIII[22];
            if (lIIlIIIIIlllI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlIlIlIII[1]];
                iArr15[lIlIlIlIII[0]] = lIlIlIlIII[22];
            }
            int[] iArr16 = new int[lIlIlIlIII[1]];
            iArr16[lIlIlIlIII[0]] = lIlIlIlIII[24];
            if (lIIlIIIIIllII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIlIlIlIII[1]];
                iArr17[lIlIlIlIII[0]] = lIlIlIlIII[38];
                if (lIIlIIIIIllII(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIlIlIlIII[1];
                    "".length();
                    return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIlIlIlIII[0];
        } else if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[8]) && lIIlIIIIIllII(cc ? 1 : 0)) {
            int[] iArr18 = new int[lIlIlIlIII[1]];
            iArr18[lIlIlIlIII[0]] = lIlIlIlIII[22];
            if (lIIlIIIIIlllI(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIlIlIlIII[1]];
                iArr19[lIlIlIlIII[0]] = lIlIlIlIII[22];
            }
            int[] iArr20 = new int[lIlIlIlIII[1]];
            iArr20[lIlIlIlIII[0]] = lIlIlIlIII[16];
            if (lIIlIIIIIllII(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIlIlIlIII[1]];
                iArr21[lIlIlIlIII[0]] = lIlIlIlIII[23];
                if (lIIlIIIIIllII(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlIlIlIII[1]];
                    iArr22[lIlIlIlIII[0]] = lIlIlIlIII[23];
                    if (lIIlIIIIlIIIl(Inventory.getFirst(iArr22).getQuantity(), lIlIlIlIII[19])) {
                        int[] iArr23 = new int[lIlIlIlIII[1]];
                        iArr23[lIlIlIlIII[0]] = lIlIlIlIII[24];
                        if (lIIlIIIIIllII(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIlIlIlIII[1]];
                            iArr24[lIlIlIlIII[0]] = lIlIlIlIII[38];
                            if (lIIlIIIIIllII(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIlIlIlIII[1];
                                "".length();
                                return ((109 ^ 101) & ((30 ^ 22) ^ (-1))) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return lIlIlIlIII[0];
        } else {
            return lIlIlIlIII[0];
        }
    }

    private static String lIIlIIIIIlIIl(String lllllllllllllllllllIlllIlIIIllII, String lllllllllllllllllllIlllIlIIIlIll) {
        String lllllllllllllllllllIlllIlIIIllII2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIlllIlIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllIlllIlIIIlIll.toCharArray();
        int lllllllllllllllllllIlllIlIIIlIII = lIlIlIlIII[0];
        char[] charArray2 = lllllllllllllllllllIlllIlIIIllII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIlIII[0];
        while (lIIlIIIIIllIl(i, length)) {
            char lllllllllllllllllllIlllIlIIIllIl = charArray2[i];
            sb.append((char) (lllllllllllllllllllIlllIlIIIllIl ^ charArray[lllllllllllllllllllIlllIlIIIlIII % charArray.length]));
            "".length();
            lllllllllllllllllllIlllIlIIIlIII++;
            i++;
            "".length();
            if ((((((197 + 95) - 267) + 177) ^ (((112 + 95) - 132) + 56)) & (((85 ^ 2) ^ (162 ^ 188)) ^ (-" ".length()))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIIIIIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIIIlIIIl(int i, int i2) {
        return i >= i2;
    }

    private static void lIIlIIIIIlIlI() {
        lIlIlIIlll = new String[lIlIlIlIII[80]];
        lIlIlIIlll[lIlIlIlIII[0]] = lIIlIIIIIIlll("6RrcbDWmgF6yTYdY1ofrIw==", "BtRSr");
        lIlIlIIlll[lIlIlIlIII[1]] = lIIlIIIIIlIII("lmcDanQoM+fDZ0JGHt7228Q53DnipyXqh1WjGzIpgAuFSRTGWVmOGh9SIjhxsFJAjRh2zlkHEYw=", "UBAdo");
        lIlIlIIlll[lIlIlIlIII[3]] = lIIlIIIIIlIIl("FwIgJj84Fz8hP3kXOW86OA09", "YcVOX");
        lIlIlIIlll[lIlIlIlIII[4]] = lIIlIIIIIIlll("V8H8UwmLlUlvPD2GhInZYDRfYuKuLlEi", "ECTeV");
        lIlIlIIlll[lIlIlIlIII[7]] = lIIlIIIIIlIIl("ByhjCwQ1bS4DBSMkLQ1WIzgzGho5KDBGViM6Kh4VOCQtDVYkImMoIwkEDS0=", "PMCjv");
        lIlIlIIlll[lIlIlIlIII[19]] = lIIlIIIIIIlll("0gEY9hrGMkYeQ2oloL1UMw==", "DSNOW");
        lIlIlIIlll[lIlIlIlIII[6]] = lIIlIIIIIIlll("yHQ3I4mLkXWurvRYhu5s/Q==", "QbMHZ");
        lIlIlIIlll[lIlIlIlIII[27]] = lIIlIIIIIlIII("EKToHl/LKEiCoDh7cHiwmlGMYfnkc0Xv", "qyoEO");
        lIlIlIIlll[lIlIlIlIII[30]] = lIIlIIIIIlIIl("FCApESE5JnoJPTojI0U8Mi0/", "WAZeH");
        lIlIlIIlll[lIlIlIlIII[32]] = lIIlIIIIIlIII("TjoEDLxk6V5IVF1TrlZqdrUBOXAvmJjE", "MEMKA");
        lIlIlIIlll[lIlIlIlIII[33]] = lIIlIIIIIlIIl("JiULESwLI1gGJAgpAUUxACgd", "eDxeE");
        lIlIlIIlll[lIlIlIlIII[34]] = lIIlIIIIIIlll("CpRNyk/M/3g=", "PuqUs");
        lIlIlIIlll[lIlIlIlIII[37]] = lIIlIIIIIIlll("6b5jX7EGpiw=", "FLiIG");
        lIlIlIIlll[lIlIlIlIII[39]] = lIIlIIIIIlIIl("NCgUAVANKEIFHBovQhcAFjM=", "yGbdp");
        lIlIlIIlll[lIlIlIlIII[41]] = lIIlIIIIIlIII("Nu1VoJ1UUtMo+m+uWaVwkg==", "npIfH");
        lIlIlIIlll[lIlIlIlIII[42]] = lIIlIIIIIIlll("ghMP98XTqVmlnpUJ+9YJmQ==", "TrPcK");
        lIlIlIIlll[lIlIlIlIII[43]] = lIIlIIIIIlIII("TttCyj4nvdw=", "TONdp");
        lIlIlIIlll[lIlIlIlIII[44]] = lIIlIIIIIIlll("wkUh1hal7n0=", "qNxgG");
        lIlIlIIlll[lIlIlIlIII[45]] = lIIlIIIIIIlll("J/pyTi80GDI=", "UYioH");
        lIlIlIIlll[lIlIlIlIII[47]] = lIIlIIIIIlIIl("EB4GOTQ6", "QjrXW");
        lIlIlIIlll[lIlIlIlIII[51]] = lIIlIIIIIlIII("cLK8FdSgXJJvbbChh/taa2BStq1R+2CW", "fNjcu");
        lIlIlIIlll[lIlIlIlIII[52]] = lIIlIIIIIIlll("NUpdpIVOU2IIJ7d5UykVPg==", "UzzDO");
        lIlIlIIlll[lIlIlIlIII[54]] = lIIlIIIIIIlll("FAF6/TfWz6HC7KW9Mp119A==", "dFOLe");
        lIlIlIIlll[lIlIlIlIII[55]] = lIIlIIIIIlIII("ktxHaVPv4GL5NCsKbhA8yQ==", "unVmi");
        lIlIlIIlll[lIlIlIlIII[56]] = lIIlIIIIIlIII("np2IDcRg//6GroJ+qJqVcQ==", "TCRVK");
        lIlIlIIlll[lIlIlIlIII[21]] = lIIlIIIIIlIII("8lW6VY6siW15QjoLHCf3tA==", "sJvYR");
        lIlIlIIlll[lIlIlIlIII[50]] = lIIlIIIIIlIII("SgATpcPXzUekKZiivTvC6A==", "lTqGR");
        lIlIlIIlll[lIlIlIlIII[73]] = lIIlIIIIIlIIl("IzAUKwtOJQEjAQA4HSU=", "nQsBh");
        lIlIlIIlll[lIlIlIlIII[74]] = lIIlIIIIIIlll("LGfaTfVjlsxWDTKt5q7RkOuhqJwAES6R", "kHgqG");
        lIlIlIIlll[lIlIlIlIII[75]] = lIIlIIIIIlIII("1EwbBV/Fbok=", "kVYLV");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v366, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v400, types: [boolean] */
    public static void ai() {
        if (lIIlIIIIIllII(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[0]];
            C0001b.a(bp);
            if (lIIlIIIIIllIl(bp.size(), lIlIlIlIII[1])) {
                System.out.println(lIlIlIIlll[lIlIlIlIII[1]]);
                bn = lIlIlIlIII[0];
            }
        }
        if (lIIlIIIIIlllI(bn ? 1 : 0) && lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[2])) {
            if (lIIlIIIIIlllI(al() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIIIIIllll(nearest) && lIIlIIIIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[3]];
                    C0000a.a(nearest);
                }
                if (lIIlIIIIIllll(nearest) && lIIlIIIIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[4]];
                    if (lIIlIIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIlIlIII[5]);
                        "".length();
                        Time.sleepTicks(lIlIlIlIII[6]);
                        "".length();
                    }
                    if (lIIlIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        if (lIIlIIIIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIlIlIII[7]);
                            "".length();
                        }
                        while (lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[8]) && lIIlIIIIIlllI(C0024y.bv() ? 1 : 0)) {
                            C0024y.bt();
                            Time.sleepTicks(lIlIlIlIII[1]);
                            "".length();
                            "".length();
                            if ((true ^ true) & ((true ^ true) ^ true)) {
                                return;
                            }
                        }
                        if (lIIlIIIIIlllI(am() ? 1 : 0)) {
                            O();
                            System.out.println(lIlIlIIlll[lIlIlIlIII[7]]);
                            bn = lIlIlIlIII[1];
                            return;
                        }
                        if (lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[8])) {
                            int[] iArr = new int[lIlIlIlIII[1]];
                            iArr[lIlIlIlIII[0]] = lIlIlIlIII[9];
                            if (lIIlIIIIIllII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIlIlIlIII[1]];
                                iArr2[lIlIlIlIII[0]] = lIlIlIlIII[9];
                                if (lIIlIIIIIllIl(Inventory.getCount(iArr2), lIlIlIlIII[1])) {
                                    Bank.withdraw(lIlIlIlIII[9], lIlIlIlIII[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIlIlIlIII[1]];
                                        iArr3[lIlIlIlIII[0]] = lIlIlIlIII[9];
                                        if (lIIlIIIIlIIII(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIlIlIlIII[1];
                                            "".length();
                                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlIlIlIII[0];
                                    }, lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIlIlIlIII[1]];
                            iArr3[lIlIlIlIII[0]] = lIlIlIlIII[11];
                            if (lIIlIIIIIllII(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIlIlIlIII[1]];
                                iArr4[lIlIlIlIII[0]] = lIlIlIlIII[11];
                                if (lIIlIIIIIllIl(Inventory.getCount(iArr4), lIlIlIlIII[1])) {
                                    Bank.withdraw(lIlIlIlIII[11], lIlIlIlIII[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIlIlIlIII[1]];
                                        iArr5[lIlIlIlIII[0]] = lIlIlIlIII[11];
                                        if (lIIlIIIIlIIII(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIlIlIlIII[1];
                                            "".length();
                                            return 0 != 0 ? ((29 ^ 74) ^ (107 ^ 59)) & (((((107 + 44) - 81) + 71) ^ (((56 + 18) - 53) + 117)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIlIlIII[0];
                                    }, lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIlIlIlIII[1]];
                            iArr5[lIlIlIlIII[0]] = lIlIlIlIII[13];
                            if (lIIlIIIIIllII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlIlIlIII[1]];
                                iArr6[lIlIlIlIII[0]] = lIlIlIlIII[13];
                                if (lIIlIIIIIllIl(Inventory.getCount(iArr6), lIlIlIlIII[1])) {
                                    Bank.withdraw(lIlIlIlIII[13], lIlIlIlIII[12], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIlIlIlIII[1]];
                                        iArr7[lIlIlIlIII[0]] = lIlIlIlIII[13];
                                        if (lIIlIIIIlIIII(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIlIlIlIII[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlIlIlIII[0];
                                    }, lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIlIlIlIII[1]];
                            iArr7[lIlIlIlIII[0]] = lIlIlIlIII[14];
                            if (lIIlIIIIIllII(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIlIlIlIII[1]];
                                iArr8[lIlIlIlIII[0]] = lIlIlIlIII[14];
                                if (lIIlIIIIIllIl(Inventory.getCount(iArr8), lIlIlIlIII[1])) {
                                    Bank.withdraw(lIlIlIlIII[14], lIlIlIlIII[15], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIlIlIlIII[1]];
                                        iArr9[lIlIlIlIII[0]] = lIlIlIlIII[14];
                                        if (lIIlIIIIlIIII(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIlIlIlIII[1];
                                            "".length();
                                            return "   ".length() <= 0 ? ((((204 + 108) - 228) + 147) ^ (((79 + 41) - 93) + 107)) & (((175 ^ 144) ^ (93 ^ 3)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIlIlIII[0];
                                    }, lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIlIlIlIII[1]];
                            iArr9[lIlIlIlIII[0]] = lIlIlIlIII[16];
                            if (lIIlIIIIIllII(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIlIlIlIII[1]];
                                iArr10[lIlIlIlIII[0]] = lIlIlIlIII[16];
                                if (lIIlIIIIIllIl(Inventory.getCount(iArr10), lIlIlIlIII[1])) {
                                    Bank.withdraw(lIlIlIlIII[16], lIlIlIlIII[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIlIlIlIII[1]];
                                        iArr11[lIlIlIlIII[0]] = lIlIlIlIII[16];
                                        if (lIIlIIIIlIIII(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIlIlIlIII[1];
                                            "".length();
                                            return " ".length() >= ((((2 + 52) - 43) + 134) ^ (((106 + 118) - 157) + 82)) ? ((47 ^ 33) ^ (230 ^ 136)) & (((103 ^ 59) ^ (51 ^ 15)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIlIlIII[0];
                                    }, lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIlIlIlIII[1]];
                            iArr11[lIlIlIlIII[0]] = lIlIlIlIII[17];
                            if (lIIlIIIIIllII(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIlIlIlIII[1]];
                                iArr12[lIlIlIlIII[0]] = lIlIlIlIII[17];
                                if (lIIlIIIIIlllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIlIlIlIII[17], lIlIlIlIII[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIlIlIlIII[1]];
                                        iArr13[lIlIlIlIII[0]] = lIlIlIlIII[17];
                                        return Inventory.contains(iArr13);
                                    }, lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIlIlIlIII[18], lIlIlIlIII[19], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIlIlIlIII[1]];
                            iArr13[lIlIlIlIII[0]] = lIlIlIlIII[20];
                            if (lIIlIIIIIllII(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIlIlIlIII[1]];
                                iArr14[lIlIlIlIII[0]] = lIlIlIlIII[20];
                                if (lIIlIIIIIllIl(Inventory.getCount(iArr14), lIlIlIlIII[1]) && lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[21])) {
                                    Bank.withdrawAll(lIlIlIlIII[20], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIlIlIlIII[1]];
                                        iArr15[lIlIlIlIII[0]] = lIlIlIlIII[20];
                                        if (lIIlIIIIlIIII(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIlIlIlIII[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlIlIlIII[0];
                                    }, lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                        }
                        if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[8])) {
                            int[] iArr15 = new int[lIlIlIlIII[1]];
                            iArr15[lIlIlIlIII[0]] = lIlIlIlIII[22];
                            if (lIIlIIIIIlllI(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIlIlIlIII[22], lIlIlIlIII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlIlIlIII[1]);
                                "".length();
                            }
                            if (lIIlIIIIIllII(cc ? 1 : 0)) {
                                Bank.withdrawAll(lIlIlIlIII[23], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlIlIlIII[1]);
                                "".length();
                                Bank.withdrawAll(lIlIlIlIII[16], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlIlIlIII[1]);
                                "".length();
                            }
                            Time.sleepTicks(lIlIlIlIII[4]);
                            "".length();
                            Bank.withdrawAll(lIlIlIlIII[24], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIlIlIlIII[1]);
                            "".length();
                            Bank.withdrawAll(lIlIlIlIII[25], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIlIlIlIII[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIlIIIIIllII(al() ? 1 : 0)) {
                if (lIIlIIIIIllII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[21])) {
                    if (lIIlIIIIIlllI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[19]];
                        Movement.walkTo(ce);
                        "".length();
                        Time.sleepTicks(lIlIlIlIII[1]);
                        "".length();
                    }
                    if (lIIlIIIIIllII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[6]];
                        ak();
                    }
                }
                if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[21]) && lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[26])) {
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[27]];
                    if (lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIlIlIlIII[1]);
                        "".length();
                    }
                }
                if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[26]) && lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[29])) {
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[30]];
                    if (lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIlIlIlIII[1]);
                        "".length();
                    }
                }
                if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[29]) && lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[31])) {
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[32]];
                    if (lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIlIlIlIII[1]);
                        "".length();
                    }
                }
                if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[31]) && lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[8])) {
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[33]];
                    if (lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIlIlIlIII[1]);
                        "".length();
                    }
                }
                if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[8])) {
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[34]];
                    if (lIIlIIIIlIIll(cf)) {
                        cf = new WorldPoint(lIlIlIlIII[35] + C0004e.c(lIlIlIlIII[1], lIlIlIlIII[7]), lIlIlIlIII[36], lIlIlIlIII[0]);
                    }
                    int[] iArr16 = new int[lIlIlIlIII[1]];
                    iArr16[lIlIlIlIII[0]] = lIlIlIlIII[22];
                    if (lIIlIIIIIllII(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIlIlIlIII[1]];
                        iArr17[lIlIlIlIII[0]] = lIlIlIlIII[22];
                        if (lIIlIIIIIlllI(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIlIlIlIII[1]];
                            iArr18[lIlIlIlIII[0]] = lIlIlIlIII[22];
                            Inventory.getFirst(iArr18).interact(lIlIlIIlll[lIlIlIlIII[37]]);
                            Time.sleepTicks(lIlIlIlIII[1]);
                            "".length();
                        }
                    }
                    if (lIIlIIIIIllII(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lIlIlIlIII[1]];
                    iArr19[lIlIlIlIII[0]] = lIlIlIlIII[24];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIlIlIlIII[1]];
                    iArr20[lIlIlIlIII[0]] = lIlIlIlIII[38];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIIlIIIIIlllI(cc ? 1 : 0) && lIIlIIIIIllll(cf)) {
                        if (lIIlIIIIIlllI(Players.getLocal().getWorldLocation().equals(cf) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[39]];
                            Movement.walkTo(cf);
                            "".length();
                            Time.sleepTicks(lIlIlIlIII[1]);
                            "".length();
                        }
                        if (lIIlIIIIIllII(Players.getLocal().getWorldLocation().equals(cf) ? 1 : 0) && lIIlIIIIIllll(first) && lIIlIIIIIllll(first2) && lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIlIIIIlIlll(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = lIlIlIlIII[1];
                                    "".length();
                                    return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlIlIlIII[0];
                            }, lIlIlIlIII[10]);
                            "".length();
                        }
                    }
                    if (lIIlIIIIIllII(cc ? 1 : 0)) {
                        if (lIIlIIIIIllll(first) && lIIlIIIIIllll(first2) && lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIlIIIIlIlll(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = lIlIlIlIII[1];
                                    "".length();
                                    return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIlIlIlIII[0];
                            }, lIlIlIlIII[10]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                                ?? r0 = lIlIlIlIII[1];
                                "".length();
                                return (146 ^ 150) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlIlIlIII[0];
                        }, lIlIlIlIII[40]);
                        "".length();
                    }
                }
            }
        }
    }

    private static String lIIlIIIIIIlll(String lllllllllllllllllllIlllIlIlIlIIl, String lllllllllllllllllllIlllIlIlIlIII) {
        try {
            SecretKeySpec lllllllllllllllllllIlllIlIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlllIlIlIlIII.getBytes(StandardCharsets.UTF_8)), lIlIlIlIII[30]), "DES");
            Cipher lllllllllllllllllllIlllIlIlIlIll = Cipher.getInstance("DES");
            lllllllllllllllllllIlllIlIlIlIll.init(lIlIlIlIII[3], lllllllllllllllllllIlllIlIlIllII);
            return new String(lllllllllllllllllllIlllIlIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlllIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlllIlIlIlIlI) {
            lllllllllllllllllllIlllIlIlIlIlI.printStackTrace();
            return null;
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
        if (lIIlIIIIlIIlI(Vars.getBit(lIlIlIlIII[48]), lIlIlIlIII[1]) && lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[19])) {
            return lIlIlIlIII[1];
        }
        if (lIIlIIIIlIIlI(Vars.getBit(lIlIlIlIII[48]), lIlIlIlIII[3]) && lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[32]) && lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[19])) {
            return lIlIlIlIII[1];
        }
        if (lIIlIIIIlIIlI(Vars.getBit(lIlIlIlIII[48]), lIlIlIlIII[4]) && lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[32]) && lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[39])) {
            return lIlIlIlIII[1];
        }
        if (lIIlIIIIlIIlI(Vars.getBit(lIlIlIlIII[48]), lIlIlIlIII[4]) && lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[32])) {
            int[] iArr = new int[lIlIlIlIII[1]];
            iArr[lIlIlIlIII[0]] = lIlIlIlIII[14];
            if (lIIlIIIIIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                return lIlIlIlIII[1];
            }
        }
        if (lIIlIIIIlIIlI(Vars.getBit(lIlIlIlIII[48]), lIlIlIlIII[7]) && lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[39])) {
            int[] iArr2 = new int[lIlIlIlIII[1]];
            iArr2[lIlIlIlIII[0]] = lIlIlIlIII[14];
            if (lIIlIIIIIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIlIlIlIII[1];
            }
        }
        return lIlIlIlIII[0];
    }

    public static void aj() {
        if (lIIlIIIIIllII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIlIIIIIlllI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[41]];
            Movement.walkTo(ce);
            "".length();
            Time.sleepTicks(lIlIlIlIII[1]);
            "".length();
        }
        if (lIIlIIIIIllII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[42]];
            ak();
        }
    }

    private static boolean lIIlIIIIlIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIIlIIIIIlIII(String lllllllllllllllllllIlllIlIIlllII, String lllllllllllllllllllIlllIlIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlllIlIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIlIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlllIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlllIlIIlllIl) {
            lllllllllllllllllllIlllIlIIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIIlI(int i, int i2) {
        return i == i2;
    }

    public static void ao() {
        if (lIIlIIIIIllll(Widgets.get(lIlIlIlIII[49], lIlIlIlIII[50]))) {
            AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[51]];
            Widgets.get(lIlIlIlIII[49], lIlIlIlIII[50]).interact(lIlIlIIlll[lIlIlIlIII[52]]);
            Time.sleepTicks(lIlIlIlIII[7]);
            "".length();
        }
        if (lIIlIIIIlIIll(Widgets.get(lIlIlIlIII[49], lIlIlIlIII[50])) && lIIlIIIIIlllI(Widgets.get(lIlIlIlIII[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIlIlIlIII[1]);
            "".length();
            if (lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[19])) {
                Widgets.get(lIlIlIlIII[53], lIlIlIlIII[1]).getChild(lIlIlIlIII[1]).interact(lIlIlIIlll[lIlIlIlIII[54]]);
            }
            if (lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[32]) && lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[19])) {
                Widgets.get(lIlIlIlIII[53], lIlIlIlIII[1]).getChild(lIlIlIlIII[3]).interact(lIlIlIIlll[lIlIlIlIII[55]]);
            }
            if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[32]) && lIIlIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[39])) {
                Widgets.get(lIlIlIlIII[53], lIlIlIlIII[1]).getChild(lIlIlIlIII[4]).interact(lIlIlIIlll[lIlIlIlIII[56]]);
            }
            if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[32])) {
                int[] iArr = new int[lIlIlIlIII[1]];
                iArr[lIlIlIlIII[0]] = lIlIlIlIII[14];
                if (lIIlIIIIIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIlIlIlIII[53], lIlIlIlIII[1]).getChild(lIlIlIlIII[4]).interact(lIlIlIIlll[lIlIlIlIII[21]]);
                }
            }
            if (lIIlIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIlIlIlIII[39])) {
                int[] iArr2 = new int[lIlIlIlIII[1]];
                iArr2[lIlIlIlIII[0]] = lIlIlIlIII[14];
                if (lIIlIIIIIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIlIlIlIII[53], lIlIlIlIII[1]).getChild(lIlIlIlIII[7]).interact(lIlIlIIlll[lIlIlIlIII[50]]);
                }
            }
            Time.sleepTicks(lIlIlIlIII[1]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIlIlIII[0];
    }

    private static void lIIlIIIIIlIll() {
        lIlIlIlIII = new int[81];
        lIlIlIlIII[0] = (62 ^ 12) & ((184 ^ 138) ^ (-1));
        lIlIlIlIII[1] = " ".length();
        lIlIlIlIII[2] = (53 ^ 33) ^ (172 ^ 138);
        lIlIlIlIII[3] = "  ".length();
        lIlIlIlIII[4] = "   ".length();
        lIlIlIlIII[5] = (-((-29569) & 30708)) & (-10245) & 16383;
        lIlIlIlIII[6] = 14 ^ 8;
        lIlIlIlIII[7] = 49 ^ 53;
        lIlIlIlIII[8] = 79 ^ 120;
        lIlIlIlIII[9] = (-24001) & 24558;
        lIlIlIlIII[10] = (-((-17654) & 32503)) & (-16417) & 32765;
        lIlIlIlIII[11] = (-20885) & 21439;
        lIlIlIlIII[12] = (-25628) & 28127;
        lIlIlIlIII[13] = (-4099) & 4655;
        lIlIlIlIII[14] = (-((-18945) & 24534)) & (-10241) & 16383;
        lIlIlIlIII[15] = (-16425) & 20924;
        lIlIlIlIII[16] = (-133) & 695;
        lIlIlIlIII[17] = (-545) & 13169;
        lIlIlIlIII[18] = (-((-7385) & 31999)) & (-145) & 32767;
        lIlIlIlIII[19] = 192 ^ 197;
        lIlIlIlIII[20] = (-((-1017) & 22521)) & (-10881) & 32763;
        lIlIlIlIII[21] = (20 ^ 31) ^ (74 ^ 88);
        lIlIlIlIII[22] = (-27141) & 28527;
        lIlIlIlIII[23] = (-((-2058) & 31067)) & (-2177) & 31741;
        lIlIlIlIII[24] = (-17861) & 18421;
        lIlIlIlIII[25] = 88 ^ 102;
        lIlIlIlIII[26] = 118 ^ 105;
        lIlIlIlIII[27] = 173 ^ 170;
        lIlIlIlIII[28] = -" ".length();
        lIlIlIlIII[29] = (28 ^ 87) ^ (10 ^ 100);
        lIlIlIlIII[30] = 129 ^ 137;
        lIlIlIlIII[31] = 64 ^ 109;
        lIlIlIlIII[32] = (155 ^ 183) ^ (117 ^ 80);
        lIlIlIlIII[33] = (72 ^ 101) ^ (45 ^ 10);
        lIlIlIlIII[34] = 172 ^ 167;
        lIlIlIlIII[35] = (-29218) & 32379;
        lIlIlIlIII[36] = (-29249) & 32735;
        lIlIlIlIII[37] = 50 ^ 62;
        lIlIlIlIII[38] = (((77 + 89) - 20) + 14) ^ (((110 + 141) - 234) + 142);
        lIlIlIlIII[39] = 77 ^ 64;
        lIlIlIlIII[40] = (-((-1145) & 22138)) & (-65) & 24557;
        lIlIlIlIII[41] = 61 ^ 51;
        lIlIlIlIII[42] = 126 ^ 113;
        lIlIlIlIII[43] = 53 ^ 37;
        lIlIlIlIII[44] = (39 ^ 72) ^ (20 ^ 106);
        lIlIlIlIII[45] = (193 ^ 168) ^ (16 ^ 107);
        lIlIlIlIII[46] = (-30731) & 32111;
        lIlIlIlIII[47] = 152 ^ 139;
        lIlIlIlIII[48] = (-((-916) & 29631)) & (-3137) & 32127;
        lIlIlIlIII[49] = (-7439) & 8031;
        lIlIlIlIII[50] = (((139 + 16) - 126) + 120) ^ (((77 + 84) - 71) + 53);
        lIlIlIlIII[51] = (((53 + 136) - 116) + 96) ^ (((114 + 5) - 92) + 162);
        lIlIlIlIII[52] = (29 ^ 92) ^ (99 ^ 55);
        lIlIlIlIII[53] = (((((116 + 42) - (-35)) + 4) + (45 ^ 77)) - (((16 + 112) - (-87)) + 37)) + ((10 + 68) - 14) + 96;
        lIlIlIlIII[54] = 81 ^ 71;
        lIlIlIlIII[55] = (159 ^ 166) ^ (181 ^ 155);
        lIlIlIlIII[56] = (170 ^ 154) ^ (131 ^ 171);
        lIlIlIlIII[57] = (-((-6561) & 31143)) & (-3073) & 28654;
        lIlIlIlIII[58] = (((142 ^ 162) + (((104 + 73) - 51) + 3)) - (208 ^ 134)) + (246 ^ 165);
        lIlIlIlIII[59] = (-28748) & 32747;
        lIlIlIlIII[60] = (-((-21394) & 29595)) & (-37) & 10237;
        lIlIlIlIII[61] = (-((-18979) & 24163)) & (-24584) & 32767;
        lIlIlIlIII[62] = (-268) & 12767;
        lIlIlIlIII[63] = (-((-231) & 17399)) & (-100) & 32767;
        lIlIlIlIII[64] = (((13 + 81) - (-70)) + 76) ^ (((83 + 85) - 122) + 90);
        lIlIlIlIII[65] = (((58 ^ 19) + (62 ^ 112)) - (12 ^ 111)) + ((19 + 54) - (-57)) + 0;
        lIlIlIlIII[66] = (-1381) & 16380;
        lIlIlIlIII[67] = 106 ^ 14;
        lIlIlIlIII[68] = (-((-2153) & 3838)) & (-22561) & 24565;
        lIlIlIlIII[69] = (-16387) & 28366;
        lIlIlIlIII[70] = (-4629) & 29628;
        lIlIlIlIII[71] = (-((-12033) & 28577)) & (-8201) & 32751;
        lIlIlIlIII[72] = (-27675) & 28574;
        lIlIlIlIII[73] = (((3 + 95) - 83) + 135) ^ (((59 + 13) - 67) + 136);
        lIlIlIlIII[74] = (65 ^ 74) ^ (136 ^ 159);
        lIlIlIlIII[75] = 83 ^ 78;
        lIlIlIlIII[76] = (-((-242) & 29939)) & (-33) & 32751;
        lIlIlIlIII[77] = (-781) & 4079;
        lIlIlIlIII[78] = (-13321) & 16351;
        lIlIlIlIII[79] = (-((-7265) & 8035)) & (-8209) & 12283;
        lIlIlIlIII[80] = 70 ^ 88;
    }
}
