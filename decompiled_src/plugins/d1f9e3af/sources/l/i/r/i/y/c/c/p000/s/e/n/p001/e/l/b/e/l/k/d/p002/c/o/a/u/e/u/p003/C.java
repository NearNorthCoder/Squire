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
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.C  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/C.class */
public class C implements W {
    static /* synthetic */ int cl;
    static /* synthetic */ int bY;
    static /* synthetic */ WorldArea dJ;
    static /* synthetic */ WorldArea dH;
    static /* synthetic */ WorldArea dI;
    private static /* synthetic */ String[] bR;
    static /* synthetic */ WorldPoint bX;
    private static /* synthetic */ int[] lIllllllI;
    public static /* synthetic */ boolean bW;
    private static /* synthetic */ String[] lIlllllIl;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0003d> bv;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private static boolean bw() {
        if (lIlIIIIIIIll(dH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIIIIIIll(dJ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIlIIIIIIIIl(dI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIllllllI[1];
        }
        ?? r0 = lIllllllI[0];
        "".length();
        return "   ".length() == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIlIIIIIlIlI(Vars.getBit(QuestVarbits.QUEST_TEARS_OF_GUTHIX.getId()), lIllllllI[5])) {
            ?? r0 = lIllllllI[0];
            "".length();
            return (-(7 ^ 3)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllllllI[1];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            bv();
            "".length();
            if ((-(171 ^ 175)) >= 0) {
                return (123 ^ 59) & ((234 ^ 170) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIllllllI[80];
    }

    private static boolean lIlIIIIIlIlI(int i, int i2) {
        return i == i2;
    }

    private static String lIIlllllllII(String llIIIIIlllIIIl, String llIIIIIlllIIII) {
        String str = new String(Base64.getDecoder().decode(llIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIIIIIlllIIII.toCharArray();
        int llIIIIIllIllIl = lIllllllI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllllllI[1];
        while (lIlIIIIIIIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llIIIIIllIllIl % charArray.length]));
            "".length();
            llIIIIIllIllIl++;
            i++;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIlllllllll();
        lIIllllllllI();
        bv = new ArrayList();
        bX = new WorldPoint(lIllllllI[83], lIllllllI[84], lIllllllI[5]);
        bY = lIllllllI[1];
        dH = new WorldArea(lIllllllI[85], lIllllllI[86], lIllllllI[87], lIllllllI[88], lIllllllI[5]);
        dI = new WorldArea(lIllllllI[85], lIllllllI[86], lIllllllI[87], lIllllllI[88], lIllllllI[0]);
        dJ = new WorldArea(lIllllllI[85], lIllllllI[86], lIllllllI[87], lIllllllI[88], lIllllllI[1]);
        String[] strArr = new String[lIllllllI[5]];
        strArr[lIllllllI[1]] = lIlllllIl[lIllllllI[89]];
        strArr[lIllllllI[0]] = lIlllllIl[lIllllllI[90]];
        bR = strArr;
    }

    private static boolean lIlIIIIIIIll(int i) {
        return i == 0;
    }

    private static int lIlIIIIIIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lIIlllllllIl(String llIIIIIlIlllII, String llIIIIIlIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllllI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIlIlllIl) {
            llIIIIIlIlllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e6, code lost:
        if (lIlIIIIIIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C.lIllllllI[11]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x034f, code lost:
        if (lIlIIIIIIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C.lIllllllI[6]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlIIIIIIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C.lIllllllI[11]) != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0395  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10 = new int[lIllllllI[0]];
        iArr10[lIllllllI[1]] = lIllllllI[10];
        if (lIlIIIIIIIIl(Bank.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[lIllllllI[0]];
            iArr11[lIllllllI[1]] = lIllllllI[10];
            if (lIlIIIIIIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIllllllI[0]];
                iArr12[lIllllllI[1]] = lIllllllI[10];
            }
            iArr = new int[lIllllllI[0]];
            iArr[lIllllllI[1]] = lIllllllI[22];
            if (lIlIIIIIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr13 = new int[lIllllllI[0]];
                iArr13[lIllllllI[1]] = lIllllllI[22];
                if (lIlIIIIIIIIl(Bank.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[lIllllllI[0]];
                    iArr14[lIllllllI[1]] = lIllllllI[22];
                }
                iArr2 = new int[lIllllllI[0]];
                iArr2[lIllllllI[1]] = lIllllllI[18];
                if (lIlIIIIIIIll(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0003d(lIllllllI[18], lIllllllI[0], lIllllllI[76]));
                    "".length();
                }
                iArr3 = new int[lIllllllI[0]];
                iArr3[lIllllllI[1]] = lIllllllI[7];
                if (lIlIIIIIIIll(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0003d(lIllllllI[7], lIllllllI[0], lIllllllI[76]));
                    "".length();
                }
                iArr4 = new int[lIllllllI[0]];
                iArr4[lIllllllI[1]] = lIllllllI[8];
                if (lIlIIIIIIIll(Bank.contains(iArr4) ? 1 : 0)) {
                    bv.add(new C0003d(lIllllllI[8], lIllllllI[0], lIllllllI[76]));
                    "".length();
                }
                iArr5 = new int[lIllllllI[0]];
                iArr5[lIllllllI[1]] = lIllllllI[15];
                if (lIlIIIIIIIll(Bank.contains(iArr5) ? 1 : 0)) {
                    bv.add(new C0003d(lIllllllI[15], lIllllllI[0], lIllllllI[76]));
                    "".length();
                }
                iArr6 = new int[lIllllllI[0]];
                iArr6[lIllllllI[1]] = lIllllllI[16];
                if (lIlIIIIIIIll(Bank.contains(iArr6) ? 1 : 0)) {
                    bv.add(new C0003d(lIllllllI[16], lIllllllI[0], lIllllllI[76]));
                    "".length();
                }
                iArr7 = new int[lIllllllI[0]];
                iArr7[lIllllllI[1]] = lIllllllI[14];
                if (lIlIIIIIIIll(Bank.contains(iArr7) ? 1 : 0)) {
                    bv.add(new C0003d(lIllllllI[14], lIllllllI[0], lIllllllI[76]));
                    "".length();
                }
                if (lIlIIIIIIIll(Bank.contains(item -> {
                    return item.getName().toLowerCase().contains(lIlllllIl[lIllllllI[82]]);
                }) ? 1 : 0)) {
                    bv.add(new C0003d(lIllllllI[77], lIllllllI[17], lIllllllI[78]));
                    "".length();
                }
                iArr8 = new int[lIllllllI[0]];
                iArr8[lIllllllI[1]] = lIllllllI[20];
                if (lIlIIIIIIIIl(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr15 = new int[lIllllllI[0]];
                    iArr15[lIllllllI[1]] = lIllllllI[20];
                    if (lIlIIIIIIIIl(Bank.contains(iArr15) ? 1 : 0)) {
                        int[] iArr16 = new int[lIllllllI[0]];
                        iArr16[lIllllllI[1]] = lIllllllI[20];
                    }
                    iArr9 = new int[lIllllllI[0]];
                    iArr9[lIllllllI[1]] = lIllllllI[13];
                    if (lIlIIIIIIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                        int[] iArr17 = new int[lIllllllI[0]];
                        iArr17[lIllllllI[1]] = lIllllllI[13];
                        if (!lIlIIIIIIIIl(Bank.contains(iArr17) ? 1 : 0)) {
                            return;
                        }
                        int[] iArr18 = new int[lIllllllI[0]];
                        iArr18[lIllllllI[1]] = lIllllllI[13];
                        if (!lIlIIIIIIIlI(Bank.getFirst(iArr18).getQuantity(), lIllllllI[36])) {
                            return;
                        }
                    }
                    bv.add(new C0003d(lIllllllI[13], lIllllllI[62], lIllllllI[79]));
                    "".length();
                }
                bv.add(new C0003d(lIllllllI[20], lIllllllI[6], C0008i.bq));
                "".length();
                iArr9 = new int[lIllllllI[0]];
                iArr9[lIllllllI[1]] = lIllllllI[13];
                if (lIlIIIIIIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIllllllI[13], lIllllllI[62], lIllllllI[79]));
                "".length();
            }
            bv.add(new C0003d(lIllllllI[22], lIllllllI[11], C0004e.c(lIllllllI[74], lIllllllI[75])));
            "".length();
            iArr2 = new int[lIllllllI[0]];
            iArr2[lIllllllI[1]] = lIllllllI[18];
            if (lIlIIIIIIIll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIllllllI[0]];
            iArr3[lIllllllI[1]] = lIllllllI[7];
            if (lIlIIIIIIIll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lIllllllI[0]];
            iArr4[lIllllllI[1]] = lIllllllI[8];
            if (lIlIIIIIIIll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIllllllI[0]];
            iArr5[lIllllllI[1]] = lIllllllI[15];
            if (lIlIIIIIIIll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIllllllI[0]];
            iArr6[lIllllllI[1]] = lIllllllI[16];
            if (lIlIIIIIIIll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lIllllllI[0]];
            iArr7[lIllllllI[1]] = lIllllllI[14];
            if (lIlIIIIIIIll(Bank.contains(iArr7) ? 1 : 0)) {
            }
            if (lIlIIIIIIIll(Bank.contains(item2 -> {
                return item2.getName().toLowerCase().contains(lIlllllIl[lIllllllI[82]]);
            }) ? 1 : 0)) {
            }
            iArr8 = new int[lIllllllI[0]];
            iArr8[lIllllllI[1]] = lIllllllI[20];
            if (lIlIIIIIIIIl(Bank.contains(iArr8) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIllllllI[20], lIllllllI[6], C0008i.bq));
            "".length();
            iArr9 = new int[lIllllllI[0]];
            iArr9[lIllllllI[1]] = lIllllllI[13];
            if (lIlIIIIIIIIl(Bank.contains(iArr9) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIllllllI[13], lIllllllI[62], lIllllllI[79]));
            "".length();
        }
        bv.add(new C0003d(lIllllllI[10], lIllllllI[11], lIllllllI[73]));
        "".length();
        iArr = new int[lIllllllI[0]];
        iArr[lIllllllI[1]] = lIllllllI[22];
        if (lIlIIIIIIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIllllllI[22], lIllllllI[11], C0004e.c(lIllllllI[74], lIllllllI[75])));
        "".length();
        iArr2 = new int[lIllllllI[0]];
        iArr2[lIllllllI[1]] = lIllllllI[18];
        if (lIlIIIIIIIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIllllllI[0]];
        iArr3[lIllllllI[1]] = lIllllllI[7];
        if (lIlIIIIIIIll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIllllllI[0]];
        iArr4[lIllllllI[1]] = lIllllllI[8];
        if (lIlIIIIIIIll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIllllllI[0]];
        iArr5[lIllllllI[1]] = lIllllllI[15];
        if (lIlIIIIIIIll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIllllllI[0]];
        iArr6[lIllllllI[1]] = lIllllllI[16];
        if (lIlIIIIIIIll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIllllllI[0]];
        iArr7[lIllllllI[1]] = lIllllllI[14];
        if (lIlIIIIIIIll(Bank.contains(iArr7) ? 1 : 0)) {
        }
        if (lIlIIIIIIIll(Bank.contains(item22 -> {
            return item22.getName().toLowerCase().contains(lIlllllIl[lIllllllI[82]]);
        }) ? 1 : 0)) {
        }
        iArr8 = new int[lIllllllI[0]];
        iArr8[lIllllllI[1]] = lIllllllI[20];
        if (lIlIIIIIIIIl(Bank.contains(iArr8) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIllllllI[20], lIllllllI[6], C0008i.bq));
        "".length();
        iArr9 = new int[lIllllllI[0]];
        iArr9[lIllllllI[1]] = lIllllllI[13];
        if (lIlIIIIIIIIl(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIllllllI[13], lIllllllI[62], lIllllllI[79]));
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIllllllI[1];
    }

    private static boolean lIlIIIIIIlll(int i) {
        return i < 0;
    }

    private static boolean lIlIIIIIIlII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIIIIIIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIIIIIllI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v409, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v452, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v461, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v492, types: [boolean] */
    public static void bv() {
        if (lIlIIIIIIIIl(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lIlIIIIIIIlI(bv.size(), lIllllllI[0])) {
                System.out.println(lIlllllIl[lIllllllI[1]]);
                bt = lIllllllI[1];
            }
        }
        if (lIlIIIIIIIll(bt ? 1 : 0)) {
            if (lIlIIIIIIIlI(Skills.getLevel(Skill.FIREMAKING), lIllllllI[2])) {
                ai.eb();
            }
            if (lIlIIIIIIlII(Skills.getLevel(Skill.FIREMAKING), lIllllllI[2]) && lIlIIIIIIIlI(Skills.getLevel(Skill.CRAFTING), lIllllllI[3])) {
                ah.dO();
            }
            if (lIlIIIIIIlII(Skills.getLevel(Skill.FIREMAKING), lIllllllI[2]) && lIlIIIIIIlII(Skills.getLevel(Skill.CRAFTING), lIllllllI[3]) && lIlIIIIIIIlI(Skills.getLevel(Skill.MINING), lIllllllI[3])) {
                ak.er();
            }
            if (lIlIIIIIIIll(ab() ? 1 : 0) && lIlIIIIIIIll(Vars.getBit(QuestVarbits.QUEST_TEARS_OF_GUTHIX.getId())) && lIlIIIIIIlII(Skills.getLevel(Skill.FIREMAKING), lIllllllI[2]) && lIlIIIIIIlII(Skills.getLevel(Skill.CRAFTING), lIllllllI[3]) && lIlIIIIIIlII(Skills.getLevel(Skill.MINING), lIllllllI[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIIIIIlIl(nearest) && lIlIIIIIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllllIl[lIllllllI[0]];
                    C0000a.a(nearest);
                }
                if (lIlIIIIIIlIl(nearest) && lIlIIIIIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIIIIIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllllllI[4]);
                        "".length();
                    }
                    if (lIlIIIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllllIl[lIllllllI[5]];
                        if (lIlIIIIIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllllllI[6]);
                            "".length();
                        }
                        if (lIlIIIIIIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllllllI[5]);
                            "".length();
                        }
                        int[] iArr = new int[lIllllllI[0]];
                        iArr[lIllllllI[1]] = lIllllllI[7];
                        if (lIlIIIIIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIllllllI[0]];
                            iArr2[lIllllllI[1]] = lIllllllI[8];
                            if (!lIlIIIIIIIll(Bank.contains(iArr2) ? 1 : 0)) {
                                int[] iArr3 = new int[lIllllllI[0]];
                                iArr3[lIllllllI[1]] = lIllllllI[10];
                                if (lIlIIIIIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                                    int[] iArr4 = new int[lIllllllI[0]];
                                    iArr4[lIllllllI[1]] = lIllllllI[10];
                                    if (lIlIIIIIIIlI(Bank.getFirst(iArr4).getQuantity(), lIllllllI[11])) {
                                        af();
                                        System.out.println(lIlllllIl[lIllllllI[6]]);
                                        bt = lIllllllI[0];
                                        return;
                                    }
                                }
                                int[] iArr5 = new int[lIllllllI[12]];
                                iArr5[lIllllllI[1]] = lIllllllI[13];
                                iArr5[lIllllllI[0]] = lIllllllI[10];
                                iArr5[lIllllllI[5]] = lIllllllI[14];
                                iArr5[lIllllllI[9]] = lIllllllI[15];
                                iArr5[lIllllllI[6]] = lIllllllI[16];
                                iArr5[lIllllllI[17]] = lIllllllI[18];
                                iArr5[lIllllllI[19]] = lIllllllI[20];
                                iArr5[lIllllllI[21]] = lIllllllI[22];
                                if (lIlIIIIIIIll(C0004e.b(iArr5) ? 1 : 0)) {
                                    af();
                                    System.out.println(lIlllllIl[lIllllllI[17]]);
                                    bt = lIllllllI[0];
                                    return;
                                }
                                int[] iArr6 = new int[lIllllllI[12]];
                                iArr6[lIllllllI[1]] = lIllllllI[13];
                                iArr6[lIllllllI[0]] = lIllllllI[10];
                                iArr6[lIllllllI[5]] = lIllllllI[14];
                                iArr6[lIllllllI[9]] = lIllllllI[15];
                                iArr6[lIllllllI[6]] = lIllllllI[16];
                                iArr6[lIllllllI[17]] = lIllllllI[18];
                                iArr6[lIllllllI[19]] = lIllllllI[20];
                                iArr6[lIllllllI[21]] = lIllllllI[22];
                                if (lIlIIIIIIIIl(C0004e.b(iArr6) ? 1 : 0)) {
                                    C0000a.a(lIllllllI[20], lIllllllI[9]);
                                    C0000a.a(lIllllllI[13], lIllllllI[11]);
                                    C0000a.a(lIllllllI[10], lIllllllI[11]);
                                    C0000a.a(lIllllllI[14], lIllllllI[0]);
                                    C0000a.a(lIllllllI[7], lIllllllI[0]);
                                    C0000a.a(lIllllllI[8], lIllllllI[0]);
                                    C0000a.a(lIllllllI[15], lIllllllI[0]);
                                    C0000a.a(lIllllllI[16], lIllllllI[0]);
                                    C0000a.a(lIllllllI[18], lIllllllI[0]);
                                    C0000a.a(lIllllllI[22], lIllllllI[17]);
                                }
                            }
                        }
                        af();
                        System.out.println(lIlllllIl[lIllllllI[9]]);
                        bt = lIllllllI[0];
                        return;
                    }
                }
            }
            if (lIlIIIIIIIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lIlIIIIIIIlI(Movement.getRunEnergy(), lIllllllI[23])) {
                Inventory.getFirst(C0005f.aV).interact(lIlllllIl[lIllllllI[19]]);
                Time.sleepTicks(lIllllllI[0]);
                "".length();
            }
            if (lIlIIIIIIIIl(Inventory.contains(C0005f.aS) ? 1 : 0) && lIlIIIIIIIlI(Prayers.getPoints(), lIllllllI[24])) {
                Inventory.getFirst(C0005f.aS).interact(lIlllllIl[lIllllllI[21]]);
            }
            if (lIlIIIIIIlll(lIlIIIIIIIII(C0004e.u(), 60.0d))) {
                String[] strArr = new String[lIllllllI[0]];
                strArr[lIllllllI[1]] = lIlllllIl[lIllllllI[12]];
                if (lIlIIIIIIIIl(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIllllllI[0]];
                    strArr2[lIllllllI[1]] = lIlllllIl[lIllllllI[25]];
                    Inventory.getFirst(strArr2).interact(lIlllllIl[lIllllllI[11]]);
                    Time.sleepTicks(lIllllllI[5]);
                    "".length();
                }
            }
            if (lIlIIIIIIIIl(ab() ? 1 : 0) && lIlIIIIIIIll(Vars.getBit(QuestVarbits.QUEST_TEARS_OF_GUTHIX.getId()))) {
                int[] iArr7 = new int[lIllllllI[0]];
                iArr7[lIllllllI[1]] = lIllllllI[7];
                if (lIlIIIIIIIIl(Inventory.contains(iArr7) ? 1 : 0)) {
                    int[] iArr8 = new int[lIllllllI[0]];
                    iArr8[lIllllllI[1]] = lIllllllI[8];
                    if (lIlIIIIIIIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lIllllllI[0]];
                        iArr9[lIllllllI[1]] = lIllllllI[7];
                        Item first = Inventory.getFirst(iArr9);
                        int[] iArr10 = new int[lIllllllI[0]];
                        iArr10[lIllllllI[1]] = lIllllllI[8];
                        first.useOn(Inventory.getFirst(iArr10));
                        Time.sleepTicks(lIllllllI[5]);
                        "".length();
                    }
                }
                int[] iArr11 = new int[lIllllllI[0]];
                iArr11[lIllllllI[1]] = lIllllllI[26];
                if (lIlIIIIIIIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lIllllllI[0]];
                    iArr12[lIllllllI[1]] = lIllllllI[26];
                    Item first2 = Inventory.getFirst(iArr12);
                    String[] strArr3 = new String[lIllllllI[0]];
                    strArr3[lIllllllI[1]] = lIlllllIl[lIllllllI[27]];
                    first2.useOn(Inventory.getFirst(strArr3));
                }
                if (lIlIIIIIIIll(Vars.getBit(lIllllllI[28]))) {
                    WorldPoint worldPoint = new WorldPoint(lIllllllI[29], lIllllllI[30], lIllllllI[1]);
                    if (lIlIIIIIlIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllllllI[9])) {
                        AccBuilderEasyClues.c = lIlllllIl[lIllllllI[31]];
                        Movement.walkTo(worldPoint);
                        "".length();
                        Time.sleepTicks(lIllllllI[0]);
                        "".length();
                    }
                    if (lIlIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllllllI[9])) {
                        String[] strArr4 = new String[lIllllllI[0]];
                        strArr4[lIllllllI[1]] = lIlllllIl[lIllllllI[32]];
                        Item first3 = Inventory.getFirst(strArr4);
                        String[] strArr5 = new String[lIllllllI[0]];
                        strArr5[lIllllllI[1]] = lIlllllIl[lIllllllI[33]];
                        first3.useOn(TileObjects.getNearest(strArr5));
                        Time.sleepTicks(lIllllllI[5]);
                        "".length();
                    }
                }
                if (lIlIIIIIlIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllllllI[34], lIllllllI[35], lIllllllI[1])), lIllllllI[12]) && lIlIIIIIlIlI(Vars.getBit(lIllllllI[28]), lIllllllI[0]) && lIlIIIIIIIll(bw() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllllIl[lIllllllI[36]];
                    if (lIlIIIIIIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIlIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllllllI[34], lIllllllI[35], lIllllllI[1])), lIllllllI[17]) && lIlIIIIIIIll(Players.getLocal().getWorldLocation().getPlane())) {
                        AccBuilderEasyClues.c = lIlllllIl[lIllllllI[37]];
                        String[] strArr6 = new String[lIllllllI[0]];
                        strArr6[lIllllllI[1]] = lIlllllIl[lIllllllI[38]];
                        TileObjects.getNearest(strArr6).interact(lIlllllIl[lIllllllI[39]]);
                        Time.sleepTicks(lIllllllI[19]);
                        "".length();
                    }
                    Movement.walkTo(new WorldPoint(lIllllllI[34], lIllllllI[35], lIllllllI[1]));
                    "".length();
                    Time.sleepTicks(lIllllllI[0]);
                    "".length();
                }
                if (lIlIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllllllI[34], lIllllllI[35], lIllllllI[1])), lIllllllI[12]) && lIlIIIIIIIll(bw() ? 1 : 0) && lIlIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllllllI[34], lIllllllI[35], lIllllllI[1])), lIllllllI[17]) && lIlIIIIIIIll(Players.getLocal().getWorldLocation().getPlane())) {
                    AccBuilderEasyClues.c = lIlllllIl[lIllllllI[40]];
                    String[] strArr7 = new String[lIllllllI[0]];
                    strArr7[lIllllllI[1]] = lIlllllIl[lIllllllI[3]];
                    TileObjects.getNearest(strArr7).interact(lIlllllIl[lIllllllI[41]]);
                    Time.sleepTicks(lIllllllI[19]);
                    "".length();
                }
                if (lIlIIIIIIIIl(bw() ? 1 : 0)) {
                    if (lIlIIIIIlIIl(Players.getLocal().getWorldLocation().getX(), lIllllllI[42])) {
                        AccBuilderEasyClues.c = lIlllllIl[lIllllllI[43]];
                        String[] strArr8 = new String[lIllllllI[0]];
                        strArr8[lIllllllI[1]] = lIlllllIl[lIllllllI[44]];
                        TileObjects.getNearest(strArr8).interact(lIlllllIl[lIllllllI[24]]);
                        Time.sleepTicks(lIllllllI[9]);
                        "".length();
                    }
                    if (lIlIIIIIlIII(Players.getLocal().getWorldLocation().getX(), lIllllllI[42]) && lIlIIIIIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIllllllI[12])) {
                        AccBuilderEasyClues.c = lIlllllIl[lIllllllI[45]];
                        C0004e.c(bX);
                        Time.sleepTicks(lIllllllI[17]);
                        "".length();
                    }
                }
                if (lIlIIIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(bX), lIllllllI[12])) {
                    if (lIlIIIIIIIll(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllllIl[lIllllllI[46]];
                        String[] strArr9 = new String[lIllllllI[0]];
                        strArr9[lIllllllI[1]] = lIlllllIl[lIllllllI[47]];
                        TileObjects.getNearest(strArr9).interact(lIlllllIl[lIllllllI[48]]);
                        Time.sleepTicks(lIllllllI[5]);
                        "".length();
                    }
                    C0006g.a(bR);
                }
            }
            if (lIlIIIIIlIlI(Vars.getBit(QuestVarbits.QUEST_TEARS_OF_GUTHIX.getId()), lIllllllI[0]) && lIlIIIIIIIll(Players.getLocal().isAnimating() ? 1 : 0)) {
                WorldArea worldArea = new WorldArea(lIllllllI[49], lIllllllI[50], lIllllllI[47], lIllllllI[43], lIllllllI[5]);
                if (lIlIIIIIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr10 = new String[lIllllllI[0]];
                    strArr10[lIllllllI[1]] = lIlllllIl[lIllllllI[51]];
                    if (lIlIIIIIIIIl(Inventory.contains(strArr10) ? 1 : 0)) {
                        if (lIlIIIIIlIIl(Players.getLocal().getWorldLocation().getX(), lIllllllI[42])) {
                            AccBuilderEasyClues.c = lIlllllIl[lIllllllI[52]];
                            String[] strArr11 = new String[lIllllllI[0]];
                            strArr11[lIllllllI[1]] = lIlllllIl[lIllllllI[53]];
                            TileObjects.getNearest(strArr11).interact(lIlllllIl[lIllllllI[54]]);
                            Time.sleepTicks(lIllllllI[9]);
                            "".length();
                        }
                        if (lIlIIIIIlIII(Players.getLocal().getWorldLocation().getX(), lIllllllI[42]) && lIlIIIIIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIllllllI[12])) {
                            AccBuilderEasyClues.c = lIlllllIl[lIllllllI[55]];
                            C0004e.c(bX);
                            Time.sleepTicks(lIllllllI[17]);
                            "".length();
                        }
                        if (lIlIIIIIIIll(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllllIl[lIllllllI[56]];
                            String[] strArr12 = new String[lIllllllI[0]];
                            strArr12[lIllllllI[1]] = lIlllllIl[lIllllllI[57]];
                            TileObjects.getNearest(strArr12).interact(lIlllllIl[lIllllllI[58]]);
                            Time.sleepTicks(lIllllllI[5]);
                            "".length();
                        }
                        C0006g.a(bR);
                    }
                    String[] strArr13 = new String[lIllllllI[0]];
                    strArr13[lIllllllI[1]] = lIlllllIl[lIllllllI[59]];
                    if (lIlIIIIIIIll(Inventory.contains(strArr13) ? 1 : 0)) {
                        if (lIlIIIIIlIII(Players.getLocal().getWorldLocation().getX(), lIllllllI[42])) {
                            AccBuilderEasyClues.c = lIlllllIl[lIllllllI[60]];
                            String[] strArr14 = new String[lIllllllI[0]];
                            strArr14[lIllllllI[1]] = lIlllllIl[lIllllllI[61]];
                            TileObjects.getNearest(strArr14).interact(lIlllllIl[lIllllllI[62]]);
                            Time.sleepTicks(lIllllllI[9]);
                            "".length();
                        }
                        if (lIlIIIIIlIIl(Players.getLocal().getWorldLocation().getX(), lIllllllI[42])) {
                            String[] strArr15 = new String[lIllllllI[0]];
                            strArr15[lIllllllI[1]] = lIlllllIl[lIllllllI[63]];
                            NPC nearest2 = NPCs.getNearest(strArr15);
                            if (lIlIIIIIIlIl(nearest2)) {
                                int[] iArr13 = new int[lIllllllI[0]];
                                iArr13[lIllllllI[1]] = lIllllllI[64];
                                Inventory.getFirst(iArr13).useOn(nearest2);
                                Time.sleepTicks(lIllllllI[9]);
                                "".length();
                            }
                        }
                    }
                }
                if (lIlIIIIIIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr16 = new String[lIllllllI[0]];
                    strArr16[lIllllllI[1]] = lIlllllIl[lIllllllI[65]];
                    if (lIlIIIIIIIll(Inventory.contains(strArr16) ? 1 : 0)) {
                        String[] strArr17 = new String[lIllllllI[0]];
                        strArr17[lIllllllI[1]] = lIlllllIl[lIllllllI[66]];
                        if (lIlIIIIIIIll(Inventory.contains(strArr17) ? 1 : 0)) {
                            String[] strArr18 = new String[lIllllllI[0]];
                            strArr18[lIllllllI[1]] = lIlllllIl[lIllllllI[67]];
                            TileObjects.getNearest(strArr18).interact(lIlllllIl[lIllllllI[68]]);
                            Time.sleepTicks(lIllllllI[6]);
                            "".length();
                        }
                        String[] strArr19 = new String[lIllllllI[0]];
                        strArr19[lIllllllI[1]] = lIlllllIl[lIllllllI[69]];
                        if (lIlIIIIIIIIl(Inventory.contains(strArr19) ? 1 : 0)) {
                            String[] strArr20 = new String[lIllllllI[0]];
                            strArr20[lIllllllI[1]] = lIlllllIl[lIllllllI[70]];
                            Item first4 = Inventory.getFirst(strArr20);
                            String[] strArr21 = new String[lIllllllI[0]];
                            strArr21[lIllllllI[1]] = lIlllllIl[lIllllllI[71]];
                            first4.useOn(Inventory.getFirst(strArr21));
                            Time.sleepTicks(lIllllllI[5]);
                            "".length();
                        }
                    }
                    String[] strArr22 = new String[lIllllllI[0]];
                    strArr22[lIllllllI[1]] = lIlllllIl[lIllllllI[2]];
                    if (lIlIIIIIIIIl(Inventory.contains(strArr22) ? 1 : 0)) {
                        if (lIlIIIIIIIlI(cl, lIllllllI[0])) {
                            an.nQ += lIllllllI[0];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIllllllI[0];
                            an.nQ = lIllllllI[1];
                        }
                        String[] strArr23 = new String[lIllllllI[0]];
                        strArr23[lIllllllI[1]] = lIlllllIl[lIllllllI[23]];
                        NPC nearest3 = NPCs.getNearest(strArr23);
                        if (lIlIIIIIIlIl(nearest3)) {
                            int[] iArr14 = new int[lIllllllI[0]];
                            iArr14[lIllllllI[1]] = lIllllllI[64];
                            Inventory.getFirst(iArr14).useOn(nearest3);
                            Time.sleepTicks(lIllllllI[9]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr15 = new int[lIllllllI[0]];
            iArr15[lIllllllI[1]] = lIllllllI[26];
            if (lIlIIIIIIIIl(Inventory.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIllllllI[0]];
                iArr16[lIllllllI[1]] = lIllllllI[26];
                Item first5 = Inventory.getFirst(iArr16);
                String[] strArr24 = new String[lIllllllI[0]];
                strArr24[lIllllllI[1]] = lIlllllIl[lIllllllI[72]];
                first5.useOn(Inventory.getFirst(strArr24));
            }
        }
    }

    private static String lIIllllllIll(String llIIIIIlIIllll, String llIIIIIlIIlllI) {
        try {
            SecretKeySpec llIIIIIlIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIIlIIlllI.getBytes(StandardCharsets.UTF_8)), lIllllllI[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllllI[5], llIIIIIlIlIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIlIlIIII) {
            llIIIIIlIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIIIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIIIlIII(int i, int i2) {
        return i > i2;
    }

    private static void lIIllllllllI() {
        lIlllllIl = new String[lIllllllI[88]];
        lIlllllIl[lIllllllI[1]] = lIIllllllIll("xhC/8sfD8usidr3pxpxif/zcaiqsL7lHRpBbBy+pJfEJyC5Jf70KnULdPQgTbdhH", "mPvsC");
        lIlllllIl[lIllllllI[0]] = lIIlllllllII("JiA/cDcHYSsxLQM=", "hAIPC");
        lIlllllIl[lIllllllI[5]] = lIIllllllIll("Zkt5LkqMmXLxtxHaSjCDQAR7DOMcNLUg", "ExBOO");
        lIlllllIl[lIllllllI[9]] = lIIlllllllII("Jip1DQIUbzgFAwImOwtQADowHwRRPCAcAB0mMB9cUTwiBQQSJzwCF1E7OkwyJBYcIjc=", "qOUlp");
        lIlllllIl[lIllllllI[6]] = lIIlllllllIl("8bt0lM51ich1DuDBXjkNIz1kWmdsnllF3i6Po61DujhEDRQfPyNTM/t7wd0bnS4PUszilHQX8mY=", "PlAxi");
        lIlllllIl[lIllllllI[17]] = lIIlllllllIl("fQlYBM/wFbQfX85ilfXVTrnHWWi7W1RmA3cOEN7O1Yn3OzxVmTFbyy33hzA6ksqivSI+U+CMfpc=", "Aokmw");
        lIlllllIl[lIllllllI[19]] = lIIllllllIll("7NX6x29Ub6o=", "NTqHK");
        lIlllllIl[lIllllllI[21]] = lIIllllllIll("x8upOZ+/TT4=", "SgBAZ");
        lIlllllIl[lIllllllI[12]] = lIIllllllIll("ggBIB/Bf0hU=", "pSNmB");
        lIlllllIl[lIllllllI[25]] = lIIlllllllII("Nw0CMz8=", "decAT");
        lIlllllIl[lIllllllI[11]] = lIIllllllIll("PEIU7YG+Yu8=", "qlmeW");
        lIlllllIl[lIllllllI[27]] = lIIlllllllIl("uvZM5/A0QEUP40owZS6qdA==", "aqJgQ");
        lIlllllIl[lIllllllI[31]] = lIIlllllllIl("6LepF2D2QxjhnKh2n3caFQ==", "QBTcf");
        lIlllllIl[lIllllllI[32]] = lIIlllllllII("KAwRMA==", "zcaUj");
        lIlllllIl[lIllllllI[33]] = lIIllllllIll("rxXLoqtKp0UFMA9tFN2vHg==", "VkZGu");
        lIlllllIl[lIllllllI[36]] = lIIlllllllII("HwoORAc+SwsQEiMf", "Qkxds");
        lIlllllIl[lIllllllI[37]] = lIIlllllllII("Jx43KBBCBDYjDAcc", "bpCMb");
        lIlllllIl[lIllllllI[38]] = lIIlllllllIl("ZSt4eo5V4Lg=", "GkMlL");
        lIlllllIl[lIllllllI[39]] = lIIlllllllII("Ahk+Nh0=", "GwJSo");
        lIlllllIl[lIllllllI[40]] = lIIlllllllII("FBcFESZxDQQaOjQV", "QyqtT");
        lIlllllIl[lIllllllI[3]] = lIIlllllllII("ASw6JyQ5", "UYTIA");
        lIlllllIl[lIllllllI[41]] = lIIlllllllIl("fU4JBgJstSE=", "dAApz");
        lIlllllIl[lIllllllI[43]] = lIIlllllllIl("Skei8SRkIckCSfOyXOGg7w==", "lurrg");
        lIlllllIl[lIllllllI[44]] = lIIlllllllII("OyA1Ij4=", "iOVIM");
        lIlllllIl[lIllllllI[24]] = lIIllllllIll("9QJsYS/W1nA=", "tQENV");
        lIlllllIl[lIllllllI[45]] = lIIllllllIll("FIDYLB4TMV8pHm6IjDGSKZ0AXMrZ8UFK", "KrLZm");
        lIlllllIl[lIllllllI[46]] = lIIlllllllII("FSUtJw==", "ADALL");
        lIlllllIl[lIllllllI[47]] = lIIllllllIll("9D0iyvYGzrg=", "olbfQ");
        lIlllllIl[lIllllllI[48]] = lIIlllllllIl("XLO2zKsB8G8=", "IfwsZ");
        lIlllllIl[lIllllllI[51]] = lIIlllllllII("MjgHKghBLgczAQ==", "aLhDm");
        lIlllllIl[lIllllllI[52]] = lIIllllllIll("1lkhbuDbLB5DzYZlygjhdw==", "nIuzM");
        lIlllllIl[lIllllllI[53]] = lIIlllllllII("CycAKQs=", "YHcBx");
        lIlllllIl[lIllllllI[54]] = lIIlllllllII("FzgjGjg=", "TTJwZ");
        lIlllllIl[lIllllllI[55]] = lIIlllllllII("DQEEDQFuHhkPGDpNGQcGKw==", "Nmmnj");
        lIlllllIl[lIllllllI[56]] = lIIlllllllII("HhICHg==", "JsnuO");
        lIlllllIl[lIllllllI[57]] = lIIlllllllIl("a3dkSE2fvhs=", "Tpgjy");
        lIlllllIl[lIllllllI[58]] = lIIllllllIll("57/mR+H/lbs=", "uPBlN");
        lIlllllIl[lIllllllI[59]] = lIIllllllIll("D7BAudcc7UDxX9Q5cR3Tkw==", "rZaUq");
        lIlllllIl[lIllllllI[60]] = lIIlllllllII("ExoRHwhwBBcRAQ==", "Pvxrj");
        lIlllllIl[lIllllllI[61]] = lIIllllllIll("SyhjKW3BoDk=", "BYDCC");
        lIlllllIl[lIllllllI[62]] = lIIllllllIll("OTV/i7gDJ6Y=", "KoJqf");
        lIlllllIl[lIllllllI[63]] = lIIlllllllII("BQArEBBpCj4dBT0cPh0=", "IiLxd");
        lIlllllIl[lIllllllI[65]] = lIIllllllIll("HOtE3KW2ZNEgZK+LGJHy9g==", "wHDnb");
        lIlllllIl[lIllllllI[66]] = lIIllllllIll("e7cXFab+zDaRt7Kauka/ag==", "MocTj");
        lIlllllIl[lIllllllI[67]] = lIIlllllllIl("P8l5WxA1UALgYUUtXTp95A==", "kGIfY");
        lIlllllIl[lIllllllI[68]] = lIIlllllllII("KhkqEg==", "gpDwr");
        lIlllllIl[lIllllllI[69]] = lIIlllllllIl("ovMWNKYIIoCxzm2eli+Hqg==", "XWCKm");
        lIlllllIl[lIllllllI[70]] = lIIlllllllIl("IVc44xbwrid+LmQb/28GhQ==", "okQmK");
        lIlllllIl[lIllllllI[71]] = lIIlllllllIl("dfzvgcQrZns=", "oigWb");
        lIlllllIl[lIllllllI[2]] = lIIllllllIll("NOVgOoxzUWuv7ZJSWrt0SQ==", "EzYxV");
        lIlllllIl[lIllllllI[23]] = lIIllllllIll("ks61M4BSzaks1WfUQHkldA==", "CyRnN");
        lIlllllIl[lIllllllI[72]] = lIIlllllllIl("F9TAX9z/4kj2zLsmv5QxoQ==", "FaFpm");
        lIlllllIl[lIllllllI[81]] = lIIlllllllIl("Vr0rknLcyMKyeEWQIw+chQ==", "svQKb");
        lIlllllIl[lIllllllI[82]] = lIIlllllllII("AQIEM3gcDUojPRIHHjx4Ww==", "skjTX");
        lIlllllIl[lIllllllI[89]] = lIIllllllIll("kfPTJ8rK+KI=", "uecFE");
        lIlllllIl[lIllllllI[90]] = lIIlllllllIl("9/cplOQTkOw=", "BVbLF");
    }

    private static void lIIlllllllll() {
        lIllllllI = new int[91];
        lIllllllI[0] = " ".length();
        lIllllllI[1] = (12 ^ 21) & ((27 ^ 2) ^ (-1));
        lIllllllI[2] = 23 ^ 38;
        lIllllllI[3] = 134 ^ 146;
        lIllllllI[4] = (-11301) & 16300;
        lIllllllI[5] = "  ".length();
        lIllllllI[6] = (107 ^ 64) ^ (9 ^ 38);
        lIllllllI[7] = (-((-1119) & 13823)) & (-9) & 14319;
        lIllllllI[8] = (-((-4229) & 21174)) & (-1027) & 22519;
        lIllllllI[9] = "   ".length();
        lIllllllI[10] = (-151) & 8158;
        lIllllllI[11] = (((110 + 14) - 81) + 86) ^ (((95 + 21) - 52) + 75);
        lIllllllI[12] = (((69 + 131) - 132) + 67) ^ (((57 + 94) - 121) + 113);
        lIllllllI[13] = (-16553) & 24559;
        lIllllllI[14] = (-30977) & 32731;
        lIllllllI[15] = (-15745) & 16334;
        lIllllllI[16] = (-((-8729) & 11806)) & (-4097) & 8127;
        lIllllllI[17] = 72 ^ 77;
        lIllllllI[18] = (-((-18481) & 31543)) & (-2049) & 16375;
        lIllllllI[19] = (29 ^ 40) ^ (100 ^ 87);
        lIllllllI[20] = (-3755) & 16379;
        lIllllllI[21] = 128 ^ 135;
        lIllllllI[22] = (-2151) & 2535;
        lIllllllI[23] = (158 ^ 150) ^ (115 ^ 73);
        lIllllllI[24] = 8 ^ 16;
        lIllllllI[25] = 33 ^ 40;
        lIllllllI[26] = (-16803) & 21503;
        lIllllllI[27] = 167 ^ 172;
        lIllllllI[28] = (-18433) & 18711;
        lIllllllI[29] = (-15) & 3183;
        lIllllllI[30] = (-((-65) & 4685)) & (-16529) & 24319;
        lIllllllI[31] = 63 ^ 51;
        lIllllllI[32] = ((232 ^ 167) & ((102 ^ 41) ^ (-1))) ^ (202 ^ 199);
        lIllllllI[33] = (((59 + 8) - (-112)) + 27) ^ (((34 + 59) - 81) + 180);
        lIllllllI[34] = (-4963) & 8191;
        lIllllllI[35] = (-((-2117) & 2781)) & (-4099) & 14303;
        lIllllllI[36] = (10 ^ 59) ^ (116 ^ 74);
        lIllllllI[37] = (((5 + 32) - 33) + 210) ^ (((48 + 58) - (-5)) + 87);
        lIllllllI[38] = (((18 + 32) - 10) + 132) ^ (((150 + 20) - 86) + 105);
        lIllllllI[39] = 45 ^ 63;
        lIllllllI[40] = 42 ^ 57;
        lIllllllI[41] = (113 ^ 105) ^ (188 ^ 177);
        lIllllllI[42] = (-16449) & 19687;
        lIllllllI[43] = 135 ^ 145;
        lIllllllI[44] = (((82 + 96) - 5) + 16) ^ (((160 + 55) - 107) + 62);
        lIllllllI[45] = (255 ^ 144) ^ (104 ^ 30);
        lIllllllI[46] = (34 ^ 55) ^ (23 ^ 24);
        lIllllllI[47] = 79 ^ 84;
        lIllllllI[48] = 4 ^ 24;
        lIllllllI[49] = (-((-2565) & 31509)) & (-577) & 32731;
        lIllllllI[50] = (-(((106 + 188) - 286) + 233)) & (-16385) & 26111;
        lIllllllI[51] = 66 ^ 95;
        lIllllllI[52] = (((91 + 85) - 133) + 143) ^ (((139 + 110) - 245) + 160);
        lIllllllI[53] = 107 ^ 116;
        lIllllllI[54] = 155 ^ 187;
        lIllllllI[55] = 55 ^ 22;
        lIllllllI[56] = 67 ^ 97;
        lIllllllI[57] = (165 ^ 190) ^ (7 ^ 63);
        lIllllllI[58] = 166 ^ 130;
        lIllllllI[59] = (70 ^ 31) ^ (209 ^ 173);
        lIllllllI[60] = (((42 + 25) - 2) + 64) ^ (((115 + 12) - 42) + 82);
        lIllllllI[61] = (((94 + 184) - 161) + 69) ^ (((53 + 11) - 11) + 104);
        lIllllllI[62] = (((124 + 12) - (-46)) + 9) ^ (((83 + 71) - 107) + 104);
        lIllllllI[63] = 43 ^ 2;
        lIllllllI[64] = (-3201) & 7902;
        lIllllllI[65] = (93 ^ 79) ^ (29 ^ 37);
        lIllllllI[66] = (150 ^ 147) ^ (15 ^ 33);
        lIllllllI[67] = 31 ^ 51;
        lIllllllI[68] = (189 ^ 186) ^ (172 ^ 134);
        lIllllllI[69] = 52 ^ 26;
        lIllllllI[70] = (63 ^ 56) ^ (232 ^ 192);
        lIllllllI[71] = 174 ^ 158;
        lIllllllI[72] = 78 ^ 125;
        lIllllllI[73] = (-((-4739) & 16003)) & (-3) & 12286;
        lIllllllI[74] = (-12870) & 14069;
        lIllllllI[75] = (-((-2121) & 14543)) & (-18945) & 32766;
        lIllllllI[76] = (-((-315) & 27518)) & (-145) & 32767;
        lIllllllI[77] = (-((-2221) & 18878)) & (-3) & 28639;
        lIllllllI[78] = (-(63 ^ 110)) & (-7686) & 32765;
        lIllllllI[79] = (-23585) & 24484;
        lIllllllI[80] = (65 ^ 31) ^ (253 ^ 199);
        lIllllllI[81] = 49 ^ 5;
        lIllllllI[82] = 120 ^ 77;
        lIllllllI[83] = (-24841) & 28090;
        lIllllllI[84] = (-16595) & 26111;
        lIllllllI[85] = (-24669) & 27868;
        lIllllllI[86] = (-16625) & 26106;
        lIllllllI[87] = (194 ^ 142) ^ (185 ^ 176);
        lIllllllI[88] = 64 ^ 120;
        lIllllllI[89] = (((223 + 134) - 161) + 44) ^ (((157 + 172) - 226) + 95);
        lIllllllI[90] = (((34 + 73) - 84) + 123) ^ (((31 + 62) - (-36)) + 36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIllllllI[21]];
        iArr[lIllllllI[1]] = lIllllllI[13];
        iArr[lIllllllI[0]] = lIllllllI[10];
        iArr[lIllllllI[5]] = lIllllllI[14];
        iArr[lIllllllI[9]] = lIllllllI[15];
        iArr[lIllllllI[6]] = lIllllllI[18];
        iArr[lIllllllI[17]] = lIllllllI[20];
        iArr[lIllllllI[19]] = lIllllllI[22];
        int i = lIllllllI[1];
        while (lIlIIIIIIIlI(i, iArr.length)) {
            int[] iArr2 = new int[lIllllllI[0]];
            iArr2[lIllllllI[1]] = iArr[i];
            if (lIlIIIIIIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIllllllI[1];
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((((28 + 92) - (-76)) + 9) ^ (((42 + 184) - 144) + 117)) & (((138 ^ 132) ^ (159 ^ 155)) ^ (-" ".length()));
            }
        }
        return lIllllllI[0];
    }

    private static boolean lIlIIIIIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIIIlIIl(int i, int i2) {
        return i <= i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlllllIl[lIllllllI[81]];
    }
}
